import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        DAİRE ALAN VE ÇEVRESİ
        int r;
        double alan, cevre;
        Scanner input = new Scanner(System.in);
        System.out.println("Daire yarıçapını giriniz : ");
        r = input.nextInt();
        alan = Math.PI * r * r;
        cevre = 2 * r * Math.PI;
        System.out.println("Dairenin Alanı : " +alan);
        System.out.println("Dairenin Çevresi : " +cevre);
        */
        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        int r, a;
        double daireDilimAlan;
        Scanner input = new Scanner(System.in);
        System.out.println("Daire yarıçapını giriniz : ");
        r = input.nextInt();
        System.out.println("Merkez açı ölçüsünü giriniz : ");
        a = input.nextInt();
        daireDilimAlan = (Math.PI * (r * r) * a) / 360;
        System.out.println("Daire Dilimi Alanı : " + daireDilimAlan);
    }
}
