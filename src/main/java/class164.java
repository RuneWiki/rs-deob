import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class164 {

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[[I")
    private int[][] field2525;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2522 = 3;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B)[B", line = 4)
    public final byte[] method1175(int arg0, byte[] arg1) {
        if (arg0 != 14) {
            method1176(-48);
        }
        field2523++;
        if (this.field2525 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2528 / (long) this.field2524) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var8 = this.field2525[var6];
                byte var9 = arg1[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var8[var10] * var9;
                }
                int var11 = this.field2528 + var6;
                int var12 = var11 / this.field2524;
                var6 = var11 - this.field2524 * var12;
                var5 += var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 81)
    public static final void method1176(int arg0) {
        class355.field5648 = "Stufe: ";
        class112.field1565 = "gelb:";
        class109.field1491 = "Okay";
        class120.field1668 = "blinken2:";
        class331.field5305 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class258.field4077 = "Titelbild geöffnet.";
        class236.field3638 = "T";
        class180.field2710 = "Schriftsätze geladen.";
        class321.field4988 = "Texturen geladen.";
        class179.field2686 = "Lade Titelbild - ";
        class35.field393 = "Spieler kann nicht gefunden werden: ";
        class32.field374 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class184.field2771 = "Bitte entferne ";
        class291.field4584 = "Untersuchen";
        class146.field2314 = "Verbindung mit Update-Server...";
        class7.field83 = "gleiten:";
        class247.field3918 = "Benutzeroberfläche geladen.";
        class274.field4340 = "lila:";
        class237.field3640 = "Lade Schriftsätze - ";
        class174.field2628 = "Ladevorgang - bitte warte.";
        class181.field2731 = "Lade Benutzeroberfläche - ";
        if (arg0 != 6441) {
            method1176(-82);
        }
        class223.field3381 = "Eingabeprozedur geladen.";
        class154.field2438 = "Update-Liste geladen.";
        class226.field3422 = "3D-Softwarebibliothek gestartet.";
        class188.field2838 = "Versteckt";
        class126.field1790 = "Konfig geladen.";
        class28.field341 = "Titelbild geladen.";
        class322.field5007 = "Nehmen";
        class259.field4096 = "Zugewiesener Speicher.";
        class293.field4617 = "Bitte entferne ";
        class246.field3873 = "M";
        class220.field3311 = "welle2:";
        class108.field1479 = " zuerst von deiner Freunde-Liste!";
        class300.field4686 = "Speicher wird zugewiesen.";
        class290.field4571 = "Weiter";
        class333.field5327 = "Fallen lassen";
        class63.field756 = " loggt sich aus.";
        class106.field1461 = "Wordpack geladen.";
        class50.field576 = "Benutzen";
        class16.field170 = "blinken3:";
        class247.field3916 = "Suche nach Updates - ";
        class311.field4885 = "schütteln:";
        class316.field4954 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class353.field5635 = " steht bereits auf deiner Ignorieren-Liste!";
        class73.field912 = "blinken1:";
        class6.field69 = "Bitte warte...";
        class54.field621 = "Lade...";
        class226.field3417 = "weiss:";
        class91.field1201 = "Angreifen";
        class212.field3226 = "Hierhin drehen";
        class274.field4344 = "blaugrün:";
        class332.field5316 = "leuchten2:";
        class256.field4046 = "Lade Liste der Welten";
        class5.field51 = "Lade Sprites - ";
        class171.field2604 = "leuchten1:";
        class74.field942 = "T";
        class325.field5218 = "Spielwelt erstellt.";
        class60.field711 = "Hierhin gehen";
        class265.field4185 = "möchte mit dir handeln.";
        class185.field2795 = " weitere Optionen";
        class110.field1513 = "Wähl eine Option";
        class93.field1253 = "Liste der Welten geladen";
        class228.field3455 = "grün:";
        class107.field1475 = "Lade Wordpack - ";
        class355.field5647 = "Starte 3D-Softwarebibliothek.";
        class308.field4788 = "M";
        class309.field4808 = "Schließen";
        class70.field878 = "RuneScape wird geladen - bitte warten...";
        class357.field5672 = ": ";
        class6.field73 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class99.field1341 = "Abbrechen";
        class125.field1776 = "welle:";
        class156.field2450 = "Lade Standardeinstellungen - ";
        class210.field3170 = "scrollen:";
        class192.field2879 = "Musik-Engine vorbereitet.";
        class166.field2563 = "Verbindung zum Update-Server hergestellt.";
        class291.field4580 = "Fertigkeit: ";
        class106.field1464 = "Gegenstand für Mitglieder";
        class12.field122 = "Lade Texturen - ";
        class77.field1005 = "Sprites geladen.";
        class25.field294 = "Kampfstufe: ";
        class232.field3511 = "rot:";
        class102.field1379 = "Verbindung abgebrochen.";
        class19.field235 = " loggt sich ein.";
        class106.field1462 = "Auswählen";
        field2527++;
        class135.field2025 = "Ablegen";
        class180.field2698 = " steht bereits auf deiner Freunde-Liste!";
        class314.field4915 = " zuerst von deiner Ignorieren-Liste!";
        class79.field1054 = "leuchten3:";
        class77.field1004 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class331.field5303 = "Lade Konfiguration - ";
        class233.field3523 = "Standardinstellungen geladen";
        class263.field4174 = "Mechscape wird geladen - bitte warten...";
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)I", line = 422)
    public final int method1177(byte arg0, int arg1) {
        int var3 = 93 / ((27 - arg0) / 34);
        field2521++;
        if (this.field2525 != null) {
            arg1 = (int) ((long) this.field2528 * (long) arg1 / (long) this.field2524) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I", line = 437)
    public final int method1178(int arg0, int arg1) {
        field2520++;
        if (this.field2525 != null) {
            arg0 = (int) ((long) this.field2528 * (long) arg0 / (long) this.field2524);
        }
        if (arg1 != 24235) {
            method1176(3);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lnk;B)V", line = 452)
    public static final void method1179(class16 arg0, byte arg1) {
        class16.field162 = arg0.method93(-128, "p11_full");
        field2526++;
        class285.field4526 = arg0.method93(-50, "p12_full");
        class73.field913 = arg0.method93(-126, "b12_full");
        class123.field1687 = arg0.method93(-62, "hitmarks");
        class54.field628 = arg0.method93(-47, "hitbar_default");
        class303.field4730 = arg0.method93(-124, "headicons_pk");
        class31.field368 = arg0.method93(-110, "headicons_prayer");
        class139.field2081 = arg0.method93(-47, "hint_headicons");
        if (arg1 >= -127) {
            method1179((class16) null, (byte) -117);
        }
        class171.field2602 = arg0.method93(-69, "hint_mapmarkers");
        class172.field2612 = arg0.method93(-75, "mapflag");
        class226.field3419 = arg0.method93(-77, "cross");
        class172.field2618 = arg0.method93(-115, "mapdots");
        class333.field5325 = arg0.method93(-66, "scrollbar");
        class127.field1863 = arg0.method93(-47, "name_icons");
        class2.field25 = arg0.method93(-34, "floorshadows");
        class311.field4884 = arg0.method93(-59, "compass");
        class103.field1399 = arg0.method93(-44, "hint_mapedge");
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 479)
    public static final void method1180(int arg0) {
        if (arg0 < 56) {
            return;
        }
        field2519++;
        int[] var1 = new int[class332.field5314];
        int var2 = 0;
        for (int var3 = 0; var3 < class332.field5314; var3++) {
            class309 var4 = class190.method1302(var3, (byte) 50);
            if (var4.field4794 >= 0 || var4.field4862 >= 0) {
                var1[var2++] = var3;
            }
        }
        class352.field5615 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class352.field5615[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V", line = 514)
    public class164(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class308.method2170(0, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2525 = new int[var4][14];
            this.field2528 = var5;
            this.field2524 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2525[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
