import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class164 {

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
    public static int[] field2306 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    public static int[] field2321 = new int[100];

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2318 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!w", name = "a", descriptor = "B")
    public byte field2299;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "B")
    public byte field2305;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "B")
    public byte field2309;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "B")
    public byte field2312;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "B")
    public byte field2313;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "B")
    public byte field2315;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "B")
    public byte field2326;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "S")
    public short field2303;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Z")
    public boolean field2300;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Z")
    public boolean field2301;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Z")
    public boolean field2308;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Z")
    public static boolean field2310;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Z")
    public boolean field2314;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Z")
    public boolean field2317;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    public boolean field2319;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public boolean field2320;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Z")
    public boolean field2323;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Z")
    public boolean field2324;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 15)
    public static final boolean method1088(String arg0, int arg1) {
        field2322++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != 31048) {
            return false;
        }
        while (var2 < class97.field1482) {
            if (arg0.equalsIgnoreCase(class40.field609[var2])) {
                return true;
            }
            var2++;
        }
        return arg0.equalsIgnoreCase(class307.field4211.field4994);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)I", line = 47)
    public static final int method1089(int arg0, byte arg1) {
        field2316++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 >= -74) {
            method1093((byte) 101);
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 64)
    public static final void method1090(boolean arg0) {
        class305.field4190 = "Versteckt";
        class218.field2880 = "Lade Konfiguration - ";
        class190.field2646 = "Untersuchen";
        class390.field5739 = "blaugrün:";
        class309.field4239 = "Lade Sprites - ";
        class435.field6249 = "leuchten1:";
        class45.field680 = "welle:";
        class24.field328 = "Gegenstand für Mitglieder";
        class282.field3868 = "M";
        class84.field1294 = "leuchten2:";
        class127.field1784 = "M";
        class81.field1252 = "Lade Standardeinstellungen - ";
        class423.field6091 = "Lade Titelbild - ";
        class72.field1108 = "Liste der Welten geladen";
        class55.field807 = "Verbindung mit Update-Server...";
        class191.field2659 = "Lade Texturen - ";
        class294.field4065 = " steht bereits auf deiner Freunde-Liste!";
        class401.field5856 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class97.field1478 = "Lade Benutzeroberfläche - ";
        class217.field2873 = "Weiter";
        class189.field2620 = "3D-Softwarebibliothek gestartet.";
        class154.field2181 = "Lade...";
        class24.field334 = "Wordpack geladen.";
        class379.field5396 = "Lade Schriftsätze - ";
        class409.field5942 = "Benutzeroberfläche geladen.";
        class189.field2622 = "Suche nach Updates - ";
        class341.field4770 = "Auswählen";
        class276.field3742 = "leuchten3:";
        class296.field4103 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class401.field5852 = "blinken2:";
        class411.field5968 = "Lade Liste der Welten";
        class279.field3795 = "Fertigkeit: ";
        field2304++;
        class252.field3472 = "gelb:";
        class436.field6255 = "Spieler kann nicht gefunden werden: ";
        class258.field3532 = "lila:";
        class23.field306 = " loggt sich aus.";
        class44.field678 = "Update-Liste geladen.";
        class367.field5151 = "Nehmen";
        class107.field1585 = "blinken1:";
        class366.field5133 = "Kampfstufe: ";
        class356.field5010 = "Mechscape wird geladen - bitte warten...";
        class75.field1166 = "Okay";
        class312.field4311 = "Fallen lassen";
        client.field2344 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class20.field273 = "schütteln:";
        class54.field800 = "weiss:";
        class438.field6315 = "Hierhin gehen";
        class149.field2148 = "Hierhin drehen";
        class118.field1694 = "Schriftsätze geladen.";
        class99.field1514 = "Abbrechen";
        class209.field2816 = " zuerst von deiner Freunde-Liste!";
        class75.field1163 = "Ladevorgang - bitte warte.";
        class61.field929 = " steht bereits auf deiner Ignorieren-Liste!";
        class448.field6482 = "Bitte warte...";
        class154.field2182 = ": ";
        class373.field5323 = "Bitte entferne ";
        field2318 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class448.field6451 = "Titelbild geladen.";
        class146.field2119 = "Standardeinstellungen geladen";
        if (!arg0) {
            field2325 = -29;
        }
        class418.field6054 = " loggt sich ein.";
        class234.field3184 = "Verbindung zum Update-Server hergestellt.";
        class13.field160 = "T";
        class323.field4429 = "Bitte entferne ";
        class290.field4005 = "Eingabeprozedur geladen.";
        class344.field4815 = "Wähl eine Option";
        class144.field2093 = "Texturen geladen.";
        class448.field6466 = " zuerst von deiner Ignorieren-Liste!";
        class129.field1798 = " weitere Optionen";
        class155.field2193 = "Sprites geladen.";
        class60.field850 = "blinken3:";
        class300.field4161 = "Starte 3D-Softwarebibliothek.";
        class259.field3547 = "Benutzen";
        class64.field998 = "rot:";
        class34.field537 = "Musik-Engine vorbereitet.";
        class403.field5870 = "T";
        class398.field5826 = "gleiten:";
        class406.field5903 = "welle2:";
        class220.field2898 = "Angreifen";
        class107.field1589 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class357.field5036 = "scrollen:";
        class366.field5125 = "grün:";
        class83.field1274 = "Schließen";
        class109.field1606 = "Lade Wordpack - ";
        class173.field2461 = "Ablegen";
        class259.field3550 = "RuneScape wird geladen - bitte warten...";
        class266.field3634 = "Konfig geladen.";
        class141.field2012 = "Spielwelt erstellt.";
        class199.field2744 = "Verbindung abgebrochen.";
        class371.field5287 = "Zugewiesener Speicher.";
        class202.field2762 = "Client-Variablen geladen";
        class65.field1030 = "Stufe: ";
        class129.field1814 = "Speicher wird zugewiesen.";
        class290.field4012 = "Titelbild geöffnet.";
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V", line = 344)
    public static final void method1091(int arg0, int arg1) {
        field2307++;
        class399 var2 = class269.method1655(arg1, arg0, arg1 - 91);
        var2.method2582(0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 355)
    public static final void method1092(byte arg0) {
        class393.field5747.method159(8);
        field2302++;
        int var1 = class393.field5747.method163(1, -97);
        if (var1 == 0) {
            return;
        }
        int var2 = class393.field5747.method163(2, -128);
        if (var2 == 0) {
            class243.field3364[class54.field795++] = 2047;
        } else if (arg0 == 21) {
            if (var2 == 1) {
                int var3 = class393.field5747.method163(3, -122);
                class307.field4211.method401(var3, 1, -12053);
                int var4 = class393.field5747.method163(1, -92);
                if (var4 == 1) {
                    class243.field3364[class54.field795++] = 2047;
                }
            } else if (var2 == 2) {
                if (class393.field5747.method163(1, -126) == 1) {
                    int var6 = class393.field5747.method163(3, -115);
                    class307.field4211.method401(var6, 2, arg0 - 12074);
                    int var7 = class393.field5747.method163(3, -117);
                    class307.field4211.method401(var7, 2, arg0 - 12074);
                } else {
                    int var5 = class393.field5747.method163(3, -125);
                    class307.field4211.method401(var5, 0, -12053);
                }
                int var8 = class393.field5747.method163(1, -97);
                if (var8 == 1) {
                    class243.field3364[class54.field795++] = 2047;
                }
            } else if (var2 == 3) {
                int var9 = class393.field5747.method163(1, arg0 - 122);
                int var10 = class393.field5747.method163(1, arg0 ^ 0xFFFFFF9B);
                if (var10 == 1) {
                    class243.field3364[class54.field795++] = 2047;
                }
                class265.field3617 = class393.field5747.method163(2, arg0 ^ 0xFFFFFF83);
                int var11 = class393.field5747.method163(7, -126);
                int var12 = class393.field5747.method163(7, -106);
                class307.field4211.method2294(false, var12, var9 == 1, var11, class265.field3617);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 465)
    public static void method1093(byte arg0) {
        field2318 = null;
        field2306 = null;
        field2321 = null;
        if (arg0 <= 40) {
            method1089(-86, (byte) -46);
        }
    }
}
