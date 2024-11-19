/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author satri
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect() {
        try {
    Class.forName("com.mysql.jdbc.Driver");   
    System.out.println("Berhasil Koneksi");
        } catch(ClassNotFoundException e) {
            System.out.println("Gagal Koneksi" +e);
        } 
    
    String url="jdbc:mysql://localhost:3306/perpustakaan";
    try {
        koneksi = DriverManager.getConnection(url, "root", "");
    }catch(SQLException e){
        System.out.println("Gagal Database" +e);
                }
    
    return koneksi;
    }
}

