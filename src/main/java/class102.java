import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class102 extends class160 {

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
    private int field1701 = 4;

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
    private int field1706 = 4;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "Lam;")
    public static class180 field1699 = new class180();

    @OriginalMember(owner = "client!pk", name = "gb", descriptor = "[I")
    public static int[] field1712 = new int[1000];

    @OriginalMember(owner = "client!pk", name = "eb", descriptor = "[Z")
    public static boolean[] field1710 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
    public static int field1711 = 0;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
    public static int field1705 = 0;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "B")
    public static byte field1703;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "Lbg;")
    public static class241 field1702;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg1 < 11) {
            this.method2((class88) null, 49, -118);
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field1706 = arg0.method633(61);
            }
        } else {
            this.field1701 = arg0.method633(82);
        }
        ++field1707;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field1708;
        int[] var3 = super.field2488.method15((byte) 126, arg0);
        if (super.field2488.field42) {
            int var4 = class240.field3896 / this.field1701;
            int var5 = class79.field1328 / this.field1706;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1085(0, class79.field1328 * var6 / var5, (byte) 75);
            } else {
                var7 = this.method1085(0, 0, (byte) 87);
            }
            for (int var8 = 0; ~var8 > ~class240.field3896; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class240.field3896 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        if (arg1 != 57) {
            field1712 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V")
    public static void method740(int arg0) {
        field1712 = null;
        if (arg0 > 82) {
            field1710 = null;
            field1699 = null;
            field1702 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
    public static final void method741(int arg0) {
        class139.field2131 = "Hierhin gehen";
        class259.field4150 = "Starte 3D-Softwarebibliothek.";
        class87.field1468 = "schütteln:";
        class130.field2045 = "welle:";
        class212.field3304 = "M";
        class168.field2627 = " loggt sich aus.";
        class194.field3071 = "rot:";
        class72.field1218 = "Lade Schriftsätze - ";
        class145.field2310 = "Standardinstellungen geladen";
        class118.field1904 = "gelb:";
        class297.field4697 = " steht bereits auf deiner Freunde-Liste!";
        class210.field3270 = "Stufe: ";
        class120.field1934 = "Lade Texturen - ";
        class11.field191 = "Okay";
        class251.field4039 = "scrollen:";
        class221.field3403 = " loggt sich ein.";
        class86.field1441 = "leuchten2:";
        class75.field1249 = "lila:";
        class110.field1802 = "Eingabeprozedur geladen.";
        class20.field297 = " steht bereits auf deiner Ignorieren-Liste!";
        class296.field4687 = "Update-Liste geladen.";
        class94.field1607 = "blinken3:";
        class140.field2140 = "Auswählen";
        class75.field1252 = "Verbindung mit Update-Server...";
        class56.field926 = "blaugrün:";
        class267.field4254 = "Lade Konfiguration - ";
        class78.field1277 = "Lade Benutzeroberfläche - ";
        class204.field3187 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class56.field924 = "möchte mit dir handeln.";
        class27.field377 = "Lade Standardeinstellungen - ";
        class191.field2968 = "weiss:";
        class160.field2497 = "Musik-Engine vorbereitet.";
        class243.field3965 = "Lade Titelbild - ";
        class174.field2743 = "gleiten:";
        class58.field949 = "Suche nach Updates - ";
        class45.field637 = "Verbindung zum Update-Server hergestellt.";
        class20.field301 = "Lade Sprites - ";
        ++field1698;
        class94.field1600 = "Abbrechen";
        class245.field3983 = "grün:";
        if (arg0 == -7351) {
            class162.field2535 = "Fallen lassen";
            class27.field368 = "welle2:";
            class113.field1851 = "Untersuchen";
            class20.field296 = "Lade...";
            class263.field4187 = "RuneScape wird geladen - bitte warten...";
            class173.field2717 = " zuerst von deiner Freunde-Liste!";
            class216.field3349 = "Lade Liste der Welten";
            client.field2437 = "Konfig geladen.";
            class135.field2098 = "Liste der Welten geladen";
            class57.field945 = ": ";
            class145.field2304 = "T";
            class70.field1122 = "Sprites geladen.";
            class137.field2109 = "Benutzen";
            class184.field2846 = "leuchten1:";
            class104.field1735 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
            class43.field610 = "Spieler kann nicht gefunden werden: ";
            class216.field3350 = "blinken1:";
            class256.field4095 = "Bitte warte...";
            class26.field339 = "Bitte entferne ";
            class189.field2934 = "Verbindung abgebrochen.";
            class208.field3235 = "Kampfstufe: ";
            class223.field3420 = "Ablegen";
            class19.field281 = "Versteckt";
            class187.field2902 = "M";
            class135.field2102 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
            class222.field3406 = "Hierhin drehen";
            class254.field4066 = "Bitte entferne ";
            class181.field2825 = "Schließen";
            class214.field3345 = " zuerst von deiner Ignorieren-Liste!";
            class88.field1511 = "Speicher wird zugewiesen.";
            class130.field2031 = "T";
            class196.field3096 = "Weiter";
            class263.field4188 = "Spielwelt erstellt.";
            class11.field207 = "Wordpack geladen.";
            class287.field4541 = "leuchten3:";
            class152.field2380 = "blinken2:";
            class51.field748 = "Benutzeroberfläche geladen.";
            class158.field2455 = "Gegenstand für Mitglieder";
            class89.field1563 = "Wähl eine Option";
            class104.field1738 = "Schriftsätze geladen.";
            class8.field169 = "Lade Wordpack - ";
            class115.field1882 = "3D-Softwarebibliothek gestartet.";
            class185.field2862 = "Titelbild geöffnet.";
            class139.field2125 = "Ladevorgang - bitte warte.";
            class266.field4250 = "Fertigkeit: ";
            class86.field1451 = "Zugewiesener Speicher.";
            class155.field2409 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
            class13.field215 = "Texturen geladen.";
            class101.field1692 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
            class132.field2069 = " weitere Optionen";
            class65.field1093 = "Nehmen";
            class137.field2111 = "Titelbild geladen.";
            class286.field4534 = "Angreifen";
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field1700;
        if (!arg1) {
            field1712 = null;
        }
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int var4 = class240.field3896 / this.field1701;
            int var5 = class79.field1328 / this.field1706;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1079(0, 108, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1079(class79.field1328 * var7 / var5, 105, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class240.field3896 > var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class240.field3896 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }
}
