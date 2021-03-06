package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.FileInputStream;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Ladies and Gentlemen - Start your engines");
        primaryStage.setScene(new Scene(root, 1000, 720
        ));
        primaryStage.show();


    }

    public static void main(String[] args) {

        launch(args);
    }
}
