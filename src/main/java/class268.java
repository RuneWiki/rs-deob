import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class268 extends class198 {

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    private int field4405 = 32768;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field4398 = -1;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4404 = "flash3:";

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V")
    public static final void method1842(int arg0) {
        ++field4403;
        if (arg0 <= 19) {
            method1846(1.0948158575180924D, (byte) -89);
        }
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class283.field4731[var1] = true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)[Lh;")
    public static final class294[] method1843(int arg0) {
        ++field4400;
        class294[] var1 = new class294[class230.field3697];
        if (arg0 >= -78) {
            method1843(93);
        }
        for (int var2 = 0; ~class230.field3697 < ~var2; ++var2) {
            int var3 = class263.field4341[var2] * class184.field2854[var2];
            byte[] var4 = class56.field758[var2];
            if (class117.field1771[var2]) {
                byte[] var5 = class224.field3568[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; ++var7) {
                    var6[var7] = class82.method554(class12.field157[class10.method53(var4[var7], 255)], class10.method53(var5[var7] << 24, -16777216));
                }
                var1[var2] = new class108(class196.field3118, field4396, class239.field3781[var2], class272.field4457[var2], class184.field2854[var2], class263.field4341[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; ~var9 > ~var3; ++var9) {
                    var8[var9] = class12.field157[class10.method53(var4[var9], 255)];
                }
                var1[var2] = new class38(class196.field3118, field4396, class239.field3781[var2], class272.field4457[var2], class184.field2854[var2], class263.field4341[var2], var8);
            }
        }
        class270.method1856(-121);
        return var1;
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public static final void method1844(int arg0) {
        class141.field2171 = "Zugewiesener Speicher.";
        class72.field1050 = "Konfig geladen.";
        class50.field681 = "leuchten2:";
        class218.field3488 = "RuneScape wird geladen - bitte warten...";
        class221.field3543 = "Hierhin gehen";
        class123.field1879 = "Wordpack geladen.";
        class75.field1184 = "Lade Schriftsätze - ";
        class276.field4577 = "Titelbild geladen.";
        class74.field1113 = "Kampfstufe: ";
        class178.field2776 = "Texturen geladen.";
        class299.field4914 = "rot:";
        class78.field1238 = "blinken3:";
        class280.field4634 = "Verbindung mit Update-Server...";
        class271.field4446 = "Lade Liste der Welten";
        class14.field210 = " steht bereits auf deiner Freunde-Liste!";
        class35.field444 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class76.field1191 = "blaugrün:";
        class314.field5055 = "Auswählen";
        class16.field229 = "Weiter";
        class294.field4844 = "weiss:";
        class178.field2770 = "Update-Liste geladen.";
        class93.field1413 = "Sprites geladen.";
        class156.field2473 = "Spielwelt erstellt.";
        ++field4402;
        class175.field2742 = "Standardeinstellungen geladen";
        class90.field1393 = "Angreifen";
        class160.field2528 = "Verbindung zum Update-Server hergestellt.";
        class18.field250 = "Benutzen";
        class11.field138 = "Lade Texturen - ";
        class197.field3128 = "Bitte warte...";
        class131.field2014 = "welle:";
        class138.field2143 = "gelb:";
        class294.field4836 = " loggt sich aus.";
        class159.field2516 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class84.field1332 = "Abbrechen";
        class204.field3290 = "blinken1:";
        class306.field4977 = "Ablegen";
        class73.field1083 = "Starte 3D-Softwarebibliothek.";
        class79.field1246 = "Titelbild geöffnet.";
        class98.field1470 = "schütteln:";
        class93.field1415 = "grün:";
        class127.field1967 = "Lade Wordpack - ";
        class115.field1729 = " weitere Optionen";
        class288.field4791 = "Nehmen";
        class78.field1243 = "Musik-Engine vorbereitet.";
        class216.field3448 = "3D-Softwarebibliothek gestartet.";
        class42.field588 = "scrollen:";
        class271.field4448 = "Suche nach Updates - ";
        class12.field161 = "Schriftsätze geladen.";
        class263.field4347 = "Lade Sprites - ";
        class272.field4469 = " zuerst von deiner Ignorieren-Liste!";
        class300.field4930 = "Lade Konfiguration - ";
        class59.field896 = "Bitte entferne ";
        class160.field2530 = " zuerst von deiner Freunde-Liste!";
        class20.field271 = "Hierhin drehen";
        class106.field1645 = ": ";
        class257.field4230 = "Fertigkeit: ";
        class110.field1683 = "leuchten1:";
        class262.field4333 = "Wähl eine Option";
        class82.field1305 = "Bitte entferne ";
        class274.field4528 = "Eingabeprozedur geladen.";
        class245.field3900 = "Speicher wird zugewiesen.";
        class311.field5027 = "T";
        class147.field2306 = "Benutzeroberfläche geladen.";
        class127.field1965 = "Spieler kann nicht gefunden werden: ";
        class194.field3069 = "Liste der Welten geladen";
        class74.field1164 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class37.field481 = "M";
        class52.field699 = "Mechscape wird geladen - bitte warten...";
        class252.field3993 = "M";
        class121.field1860 = "leuchten3:";
        class250.field3982 = "Ladevorgang - bitte warte.";
        class196.field3116 = "lila:";
        class16.field231 = "T";
        class126.field1954 = "Verbindung abgebrochen.";
        class27.field347 = "Untersuchen";
        class285.field4760 = "welle2:";
        class314.field5058 = "Okay";
        class74.field1091 = "Versteckt";
        class232.field3706 = " steht bereits auf deiner Ignorieren-Liste!";
        class248.field3949 = "blinken2:";
        class45.field614 = " loggt sich ein.";
        class36.field473 = "Lade Titelbild - ";
        class218.field3489 = "gleiten:";
        class103.field1558 = "Lade Benutzeroberfläche - ";
        class29.field373 = "Gegenstand für Mitglieder";
        class19.field255 = "Stufe: ";
        class128.field1973 = "Fallen lassen";
        class9.field116 = "Lade Standardeinstellungen - ";
        class19.field264 = "Lade...";
        class292.field4823 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class126.field1949 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class121.field1852 = "Schließen";
        if (arg0 != 1) {
            field4398 = 84;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field4397;
        class217.method1516((byte) 79);
        int var2 = 70 % ((-46 - arg0) / 47);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public static void method1845(byte arg0) {
        if (arg0 >= -34) {
            field4396 = -115;
        }
        field4404 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(DB)V")
    public static final void method1846(double arg0, byte arg1) {
        ++field4399;
        if (arg1 < 10) {
            method1846(-0.13665714228779338D, (byte) -47);
        }
        if (class34.field424 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class82.field1299[var3] = var4 <= 255 ? var4 : 255;
            }
            class34.field424 = arg0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            method1842(54);
        }
        ++field4401;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int[] var4 = this.method1367((byte) -79, 1, arg1);
            int[] var5 = this.method1367((byte) -79, 2, arg1);
            for (int var6 = 0; var6 < class42.field590; ++var6) {
                int var7 = (var4[var6] & 4089) >> 4;
                int var8 = var5[var6] * this.field4405 >> 12;
                int var9 = class67.field984[var7] * var8 >> 12;
                int var10 = class179.field2790[var7] * var8 >> 12;
                int var11 = (var10 >> 12) + var6 & class227.field3594;
                int var12 = (var9 >> 12) + arg1 & class52.field704;
                int[] var13 = this.method1367((byte) -79, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        int[][] var3 = super.field3150.method642(arg0, arg1 + 3);
        ++field4394;
        if (super.field3150.field1498) {
            int[] var4 = this.method1367((byte) -79, 1, arg0);
            int[] var5 = this.method1367((byte) -79, 2, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class42.field590 < ~var9; ++var9) {
                int var10 = var5[var9] * this.field4405 >> 12;
                int var11 = (1046529 & var4[var9] * 255) >> 12;
                int var12 = class179.field2790[var11] * var10 >> 12;
                int var13 = class227.field3594 & (var12 >> 12) + var9;
                int var14 = class67.field984[var11] * var10 >> 12;
                int var15 = (var14 >> 12) + arg0 & class52.field704;
                int[][] var16 = this.method1372(0, var15, (byte) 79);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        if (arg1 != -2) {
            this.method200(-18, -79);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field4395;
        int var4 = 12 / ((arg0 - 60) / 61);
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3139 = ~arg1.method1420((byte) 0) == -2;
            }
        } else {
            this.field4405 = arg1.method1419(108) << 4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class268() {
        super(3, false);
    }
}
