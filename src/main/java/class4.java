import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class4 {

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field33 = 3353893;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "[I")
    public static int[] field35 = new int[2048];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "[I")
    public static int[] field37;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 5)
    public static void method18(int arg0) {
        field35 = null;
        int var1 = 41 % ((arg0 + 13) / 43);
        field37 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILbh;II)V", line = 20)
    public static final void method19(int arg0, int arg1, int arg2, class98 arg3, int arg4, int arg5) {
        field27++;
        if (arg3.field1342 == -1 && arg3.field1328 == null || arg4 != -22594) {
            return;
        }
        int var6 = 0;
        if (arg3.field1326 < arg2) {
            var6 += arg2 - arg3.field1326;
        } else if (arg2 < arg3.field1335) {
            var6 += arg3.field1335 - arg2;
        }
        int var7 = class224.field3233 * arg3.field1338 >> 8;
        if (arg3.field1341 < arg0) {
            var6 += arg0 - arg3.field1341;
        } else if (arg0 < arg3.field1331) {
            var6 += arg3.field1331 - arg0;
        }
        if (arg3.field1343 == 0 || arg3.field1343 < (var6 - 64) || class224.field3233 == 0 || arg3.field1337 != arg5) {
            if (arg3.field1333 != null) {
                class160.field2196.method1130(arg3.field1333);
                arg3.field1333 = null;
            }
            if (arg3.field1339 != null) {
                class160.field2196.method1130(arg3.field1339);
                arg3.field1339 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field1343 - var6) * var7 / arg3.field1343;
        if (arg3.field1333 != null) {
            arg3.field1333.method1521(var8);
        } else if (arg3.field1342 >= 0) {
            class215 var9 = class215.method1490(class259.field3811, arg3.field1342, 0);
            if (var9 != null) {
                class87 var10 = var9.method1491().method680(class135.field1862);
                class220 var11 = class220.method1537(var10, 100, var8);
                var11.method1556(-1);
                class160.field2196.method1126(var11);
                arg3.field1333 = var11;
            }
        }
        if (arg3.field1339 != null) {
            arg3.field1339.method1521(var8);
            if (!arg3.field1339.method1272((byte) -66)) {
                arg3.field1339 = null;
            }
        } else if (arg3.field1328 != null && (arg3.field1317 -= arg1) <= 0) {
            int var12 = (int) ((double) arg3.field1328.length * Math.random());
            class215 var13 = class215.method1490(class259.field3811, arg3.field1328[var12], 0);
            if (var13 != null) {
                class87 var14 = var13.method1491().method680(class135.field1862);
                class220 var15 = class220.method1537(var14, 100, var8);
                var15.method1556(0);
                class160.field2196.method1126(var15);
                arg3.field1317 = arg3.field1318 + ((int) ((double) (arg3.field1322 - arg3.field1318) * Math.random()));
                arg3.field1339 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V", line = 148)
    public static final void method20(boolean arg0, int arg1) {
        field39++;
        if (arg0) {
            method21((byte) -128);
        }
        class243.field3472 = arg1;
        class334.method2322(3, (byte) 127);
        class334.method2322(4, (byte) 103);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 171)
    public static final void method21(byte arg0) {
        class339.field5089 = "Verbindung mit Update-Server...";
        class252.field3619 = "T";
        class6.field49 = "Schließen";
        class23.field292 = "Texturen geladen.";
        class59.field805 = "blaugrün:";
        class151.field2097 = "Speicher wird zugewiesen.";
        class332.field4998 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class154.field2135 = "Zugewiesener Speicher.";
        class71.field969 = "Bitte warte...";
        class175.field2382 = "Ladevorgang - bitte warte.";
        class123.field1662 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class313.field4721 = " loggt sich ein.";
        class222.field3191 = "weiss:";
        class85.field1225 = "möchte mit dir handeln.";
        class241.field3415 = "Nehmen";
        class8.field77 = "leuchten1:";
        class130.field1786 = "blinken1:";
        class92.field1273 = "Titelbild geöffnet.";
        class323.field4899 = "Starte 3D-Softwarebibliothek.";
        class143.field1964 = " zuerst von deiner Freunde-Liste!";
        class56.field770 = "Lade Sprites - ";
        class28.field353 = "Liste der Welten geladen";
        class317.field4846 = "Spielwelt erstellt.";
        class59.field804 = "gleiten:";
        class327.field4948 = "Titelbild geladen.";
        class21.field267 = "Gegenstand für Mitglieder";
        class275.field4122 = "Wordpack geladen.";
        class39.field444 = "Verbindung abgebrochen.";
        class135.field1861 = "Auswählen";
        class266.field3869 = "leuchten3:";
        class113.field1553 = "Lade...";
        class103.field1413 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class33.field396 = "Bitte entferne ";
        class291.field4342 = "Wähl eine Option";
        class71.field968 = "Lade Konfiguration - ";
        class243.field3476 = " steht bereits auf deiner Freunde-Liste!";
        class340.field5110 = "Eingabeprozedur geladen.";
        client.field1513 = "Weiter";
        class330.field4972 = "Untersuchen";
        class237.field3363 = "Lade Benutzeroberfläche - ";
        class136.field1886 = "Spieler kann nicht gefunden werden: ";
        if (arg0 < 27) {
            method18(88);
        }
        class272.field4074 = "blinken3:";
        class10.field99 = "Versteckt";
        class192.field2642 = "Schriftsätze geladen.";
        class39.field447 = "lila:";
        class193.field2656 = "RuneScape wird geladen - bitte warten...";
        class235.field3329 = "Okay";
        class280.field4209 = "Standardinstellungen geladen";
        class15.field174 = " steht bereits auf deiner Ignorieren-Liste!";
        class290.field4319 = " weitere Optionen";
        class290.field4327 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class250.field3585 = "Stufe: ";
        class166.field2272 = "T";
        class176.field2398 = "Lade Titelbild - ";
        class90.field1269 = "M";
        class196.field2742 = " zuerst von deiner Ignorieren-Liste!";
        class189.field2606 = "Benutzen";
        class74.field1019 = "Verbindung zum Update-Server hergestellt.";
        class168.field2292 = "Lade Wordpack - ";
        class24.field307 = "rot:";
        class167.field2279 = "Lade Schriftsätze - ";
        class10.field87 = "Lade Standardeinstellungen - ";
        class235.field3326 = "3D-Softwarebibliothek gestartet.";
        class251.field3595 = "gelb:";
        class273.field4090 = "Hierhin gehen";
        class217.field3106 = "Benutzeroberfläche geladen.";
        class301.field4444 = "blinken2:";
        class190.field2622 = "Sprites geladen.";
        class160.field2194 = "Angreifen";
        class332.field5000 = "Konfig geladen.";
        class112.field1530 = ": ";
        class274.field4107 = "Hierhin drehen";
        class145.field2006 = "Fertigkeit: ";
        field34++;
        class253.field3624 = "M";
        class122.field1653 = "welle:";
        class204.field2923 = " loggt sich aus.";
        class100.field1371 = "Ablegen";
        class148.field2048 = "Update-Liste geladen.";
        class296.field4387 = "welle2:";
        class61.field812 = "Kampfstufe: ";
        class251.field3602 = "Abbrechen";
        class330.field4976 = "leuchten2:";
        class153.field2117 = "Fallen lassen";
        class271.field4065 = "Suche nach Updates - ";
        class166.field2265 = "schütteln:";
        class193.field2654 = "Bitte entferne ";
        class337.field5074 = "grün:";
        class196.field2748 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class121.field1641 = "Lade Texturen - ";
        class72.field999 = "scrollen:";
        class122.field1654 = "Lade Liste der Welten";
        class300.field4431 = "Musik-Engine vorbereitet.";
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIB)V", line = 511)
    public static final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class259.field3820 = arg0;
        class236.field3351 = arg3;
        class189.field2610 = arg2;
        class271.field4059 = arg4;
        class150.field2069 = arg1;
        field29++;
        if (arg5 <= 54) {
            method21((byte) -106);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
    public abstract void method7(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public abstract void method8(int arg0, int arg1);
}
