import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class221 {

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field3330 = -1;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public int field3324 = -1;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field3325 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
    public static int[] field3332 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Ljl;")
    public static class253 field3326 = new class253(512);

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field3334 = -1;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Z")
    public static boolean field3328;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[I")
    public int[] field3331;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[S")
    public static short[] field3322;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "[[[B")
    public static byte[][][] field3333;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILfl;I)V")
    public final void method1412(int arg0, class248 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1593((byte) 27);
            if (var4 == 0) {
                if (arg2 != -1) {
                    this.method1412(90, (class248) null, -84);
                }
                field3320++;
                return;
            }
            this.method1414(0, arg0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
    public static final void method1413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class68.field1073 == 1) {
            class159.field2447[class50.field801 / 100].method1274(class184.field2785 - 8, class116.field1771 + -8);
        }
        field3319++;
        if (arg0 != 100) {
            method1419(-71);
        }
        if (class68.field1073 == 2) {
            class159.field2447[class50.field801 / 100 + 4].method1274(class184.field2785 - 8, class116.field1771 + -8);
        }
        class286.method1882((byte) 107);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILfl;I)V")
    private final void method1414(int arg0, int arg1, class248 arg2, int arg3) {
        field3329++;
        if (arg0 != 0) {
            field3334 = 12;
        }
        if (arg3 == 1) {
            this.field3330 = arg2.method1575(false);
        } else if (arg3 == 2) {
            this.field3331 = new int[arg2.method1593((byte) 27)];
            for (int var5 = 0; var5 < this.field3331.length; var5++) {
                this.field3331[var5] = arg2.method1575(false);
            }
        } else if (arg3 == 3) {
            this.field3324 = arg2.method1593((byte) 27);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field3333 = null;
        field3326 = null;
        field3322 = null;
        field3332 = null;
        if (arg0 != -29765) {
            method1417(88, 49, -124, 42, -63, -95, -79);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    public static final void method1416(byte arg0, int arg1) {
        if (arg0 != -1) {
            field3322 = null;
        }
        field3323++;
        class187 var2 = class120.method762((byte) 76, 11, arg1);
        var2.method1162(1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3318++;
        if (arg3 != 3) {
            method1418(67, -23, -84, (class294) null);
        }
        class289 var7 = class66.method450(arg1, 0, arg5);
        if (var7 != null && var7.field4431 != null) {
            class234 var8 = new class234();
            var8.field3528 = var7;
            var8.field3533 = var7.field4431;
            class228.method1456((byte) 102, var8);
        }
        class233.field3510 = arg2;
        class116.field1763 = arg1;
        class162.field2482 = arg5;
        class206.field3092 = arg0;
        class289.field4390 = arg6;
        class153.field2305 = true;
        class225.field3379 = arg4;
        class295.method1980(var7, 0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILpf;)Ldi;")
    public static final class179 method1418(int arg0, int arg1, int arg2, class294 arg3) {
        field3327++;
        if (class66.method451(arg3, arg2, 2048, arg0)) {
            if (arg1 != -1) {
                field3332 = null;
            }
            return class16.method115(-127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static final void method1419(int arg0) {
        class203.field3061 = "T";
        class227.field3408 = "schütteln:";
        class143.field2099 = "Liste der Welten geladen";
        class246.field3673 = " zuerst von deiner Freunde-Liste!";
        class126.field1904 = "Ladevorgang - bitte warte.";
        class165.field2541 = "Schriftsätze geladen.";
        class33.field483 = " weitere Optionen";
        class105.field1609 = "welle2:";
        class129.field1926 = "M";
        class100.field1585 = "Eingabeprozedur geladen.";
        class253.field3847 = "Lade Sprites - ";
        class243.field3637 = "Spielwelt erstellt.";
        class283.field4235 = "blinken3:";
        class251.field3823 = "Fertigkeit: ";
        class232.field3506 = "weiss:";
        class191.field2938 = "Hierhin drehen";
        class54.field885 = "leuchten2:";
        class259.field3948 = "Bitte entferne ";
        class97.field1533 = "Texturen geladen.";
        class165.field2538 = "Titelbild geöffnet.";
        class32.field465 = "Versteckt";
        class159.field2453 = "gleiten:";
        class133.field1952 = "Verbindung abgebrochen.";
        class25.field309 = "Musik-Engine vorbereitet.";
        class42.field615 = "Lade Benutzeroberfläche - ";
        class251.field3817 = "Benutzen";
        class214.field3204 = "M";
        class235.field3543 = "Bitte entferne ";
        class41.field611 = "Lade...";
        class230.field3472 = "rot:";
        class23.field277 = " steht bereits auf deiner Ignorieren-Liste!";
        class212.field3180 = "Fallen lassen";
        class253.field3839 = "Nehmen";
        class127.field1910 = "Kampfstufe: ";
        class71.field1136 = "Suche nach Updates - ";
        class148.field2151 = "Lade Wordpack - ";
        class72.field1150 = "RuneScape wird geladen - bitte warten...";
        class107.field1644 = "möchte mit dir handeln.";
        class150.field2167 = "scrollen:";
        class225.field3367 = "Bitte warte...";
        class127.field1916 = " loggt sich ein.";
        class292.field4597 = "Verbindung mit Update-Server...";
        class89.field1404 = "Sprites geladen.";
        class119.field1796 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class176.field2692 = "Spieler kann nicht gefunden werden: ";
        class59.field937 = "Lade Schriftsätze - ";
        class93.field1480 = "blinken2:";
        class153.field2213 = "grün:";
        class92.field1459 = "gelb:";
        class241.field3623 = "3D-Softwarebibliothek gestartet.";
        class187.field2850 = "leuchten1:";
        class116.field1764 = "T";
        class183.field2770 = "Stufe: ";
        class36.field500 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class143.field2091 = "Lade Liste der Welten";
        field3321++;
        class61.field971 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class57.field906 = "Auswählen";
        class231.field3477 = "Ablegen";
        class77.field1242 = "Gegenstand für Mitglieder";
        class206.field3084 = "Hierhin gehen";
        class264.field3990 = "lila:";
        client.field2389 = "Verbindung zum Update-Server hergestellt.";
        class92.field1447 = "Lade Titelbild - ";
        class224.field3350 = "Speicher wird zugewiesen.";
        class194.field2964 = " steht bereits auf deiner Freunde-Liste!";
        class231.field3494 = "Lade Konfiguration - ";
        if (arg0 != 0) {
            field3328 = false;
        }
        class97.field1524 = "Benutzeroberfläche geladen.";
        class198.field3007 = "Abbrechen";
        class132.field1943 = "Starte 3D-Softwarebibliothek.";
        class106.field1627 = ": ";
        class96.field1514 = "Wähl eine Option";
        class106.field1612 = "Konfig geladen.";
        class67.field1068 = "Untersuchen";
        class54.field883 = "Angreifen";
        class107.field1649 = "Wordpack geladen.";
        class53.field858 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class205.field3078 = "Lade Standardeinstellungen - ";
        class295.field4681 = "Lade Texturen - ";
        class69.field1097 = "Standardinstellungen geladen";
        class244.field3659 = "welle:";
        class288.field4354 = " loggt sich aus.";
        class146.field2135 = "Titelbild geladen.";
        class69.field1094 = "Weiter";
        class47.field756 = " zuerst von deiner Ignorieren-Liste!";
        class256.field3912 = "Update-Liste geladen.";
        class171.field2592 = "leuchten3:";
        class115.field1753 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class214.field3205 = "blinken1:";
        class108.field1679 = "Okay";
        class273.field4112 = "blaugrün:";
        class267.field4021 = "Schließen";
        class110.field1710 = "Zugewiesener Speicher.";
    }
}
