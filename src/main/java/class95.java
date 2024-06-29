import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class95 {

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[I")
    public static int[] field1545 = new int[5];

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[I")
    public static int[] field1548 = new int[50];

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1550 = "Loaded update list";

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lva;")
    public static class239 field1543;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[Lmd;")
    public static class273[] field1552;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[[I")
    public static int[][] field1541;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lqk;Laj;ILaj;Laj;)Z")
    public static final boolean method675(class104 arg0, class151 arg1, int arg2, class151 arg3, class151 arg4) {
        class58.field1006 = arg4;
        class237.field3990 = arg1;
        class181.field2887 = arg3;
        field1551++;
        if (arg2 != 31729) {
            method680(-64);
        }
        class313.field5050 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static final void method676(boolean arg0) {
        field1546++;
        class9.field171.method94(34);
        class171.field2761.method94(34);
        if (arg0) {
            field1541 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method677(String arg0, int arg1) {
        field1544++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = arg1; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class186.method1347(var6, 4);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
    public static final void method678(boolean arg0, int arg1) {
        if (arg1 != -5913) {
            return;
        }
        field1549++;
        class222.field3722 = arg0;
        if (!class222.field3722) {
            int var2 = class136.field2239.method1821((byte) 51);
            int var3 = class136.field2239.method1802((byte) 77);
            int var4 = (class150.field2480 - class136.field2239.field4160) / 16;
            class216.field3656 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class216.field3656[var5][var15] = class136.field2239.method1807((byte) -27);
                }
            }
            int var6 = class136.field2239.method1787(arg1 ^ 0x1718);
            boolean var7 = class110.method823(0, class136.field2239.method1794((byte) -120));
            int var8 = class136.field2239.method1806(-1);
            int var9 = class136.field2239.method1818(false);
            class258.field4345 = new byte[var4][];
            class181.field2889 = new int[var4];
            class184.field2947 = new int[var4];
            class176.field2845 = new int[var4];
            class136.field2244 = null;
            class275.field4596 = new int[var4];
            class111.field1832 = new byte[var4][];
            class111.field1829 = new int[var4];
            class105.field1735 = null;
            boolean var10 = false;
            int var11 = 0;
            if ((var2 / 8 == 48 || (var2 / 8) == 49) && var6 / 8 == 48) {
                var10 = true;
            }
            if ((var2 / 8) == 48 && var6 / 8 == 148) {
                var10 = true;
            }
            for (int var12 = (var2 - 6) / 8; var12 <= ((var2 + 6) / 8); var12++) {
                for (int var13 = (var6 - 6) / 8; var13 <= ((var6 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var10 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class184.field2947[var11] = var14;
                        class176.field2845[var11] = -1;
                        class111.field1829[var11] = -1;
                        class275.field4596[var11] = -1;
                        class181.field2889[var11] = -1;
                    } else {
                        class184.field2947[var11] = var14;
                        class176.field2845[var11] = class270.field4488.method1121(2, "m" + var12 + "_" + var13);
                        class111.field1829[var11] = class270.field4488.method1121(2, "l" + var12 + "_" + var13);
                        class275.field4596[var11] = class270.field4488.method1121(2, "um" + var12 + "_" + var13);
                        class181.field2889[var11] = class270.field4488.method1121(2, "ul" + var12 + "_" + var13);
                    }
                    var11++;
                }
            }
            class108.method810(false, var2, var6, -97, var7, var9, var8, var3);
            return;
        }
        int var16 = class136.field2239.method1814(arg1 + 5912);
        class136.field2239.method635(-31777);
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = class136.field2239.method641(false, 1);
                    if (var39 == 1) {
                        class173.field2778[var17][var37][var38] = class136.field2239.method641(false, 26);
                    } else {
                        class173.field2778[var17][var37][var38] = -1;
                    }
                }
            }
        }
        class136.field2239.method638(-7);
        int var18 = (class150.field2480 - class136.field2239.field4160) / 16;
        class216.field3656 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var36 = 0; var36 < 4; var36++) {
                class216.field3656[var19][var36] = class136.field2239.method1800(-93);
            }
        }
        int var20 = class136.field2239.method1806(arg1 ^ 0x1718);
        boolean var21 = class110.method823(0, class136.field2239.method1794((byte) -98));
        int var22 = class136.field2239.method1806(-1);
        int var23 = class136.field2239.method1806(-1);
        int var24 = class136.field2239.method1821((byte) 51);
        class176.field2845 = new int[var18];
        class136.field2244 = null;
        class184.field2947 = new int[var18];
        class275.field4596 = new int[var18];
        class258.field4345 = new byte[var18][];
        class111.field1832 = new byte[var18][];
        class105.field1735 = null;
        class181.field2889 = new int[var18];
        class111.field1829 = new int[var18];
        int var25 = 0;
        for (int var26 = 0; var26 < 4; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                for (int var28 = 0; var28 < 13; var28++) {
                    int var29 = class173.field2778[var26][var27][var28];
                    if (var29 != -1) {
                        int var30 = (var29 & 0x3FFE) >> 3;
                        int var31 = (var29 & 0xFFDC5D) >> 14;
                        int var32 = (var31 / 8 << 8) + var30 / 8;
                        for (int var33 = 0; var33 < var25; var33++) {
                            if (class184.field2947[var33] == var32) {
                                var32 = -1;
                                break;
                            }
                        }
                        if (var32 != -1) {
                            class184.field2947[var25] = var32;
                            int var34 = var32 & 0xFF;
                            int var35 = (var32 & 0xFFF1) >> 8;
                            class176.field2845[var25] = class270.field4488.method1121(2, "m" + var35 + "_" + var34);
                            class111.field1829[var25] = class270.field4488.method1121(2, "l" + var35 + "_" + var34);
                            class275.field4596[var25] = class270.field4488.method1121(2, "um" + var35 + "_" + var34);
                            class181.field2889[var25] = class270.field4488.method1121(2, "ul" + var35 + "_" + var34);
                            var25++;
                        }
                    }
                }
            }
        }
        class108.method810(false, var20, var23, arg1 + 5826, var21, var24, var22, var16);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method679(int arg0) {
        class293.field4822 = "Lade Schriftsätze - ";
        class113.field1925 = "Untersuchen";
        class138.field2261 = "Lade...";
        class251.field4245 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class141.field2324 = "Auswählen";
        if (arg0 <= 65) {
            method680(-10);
        }
        class282.field4670 = "Texturen geladen.";
        class44.field689 = "Verbindung mit Update-Server...";
        class169.field2737 = "schütteln:";
        class272.field4551 = "Bitte entferne ";
        class277.field4619 = " steht bereits auf deiner Freunde-Liste!";
        class292.field4784 = "grün:";
        class224.field3783 = "welle2:";
        class313.field5054 = "blinken1:";
        class36.field570 = "Lade Konfiguration - ";
        class205.field3292 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class50.field855 = "T";
        class195.field3117 = "Spielwelt erstellt.";
        field1550 = "Update-Liste geladen.";
        class279.field4642 = "Titelbild geöffnet.";
        class93.field1532 = "Zugewiesener Speicher.";
        class31.field516 = "Bitte warte...";
        class263.field4391 = "Schriftsätze geladen.";
        class152.field2545 = ": ";
        class143.field2356 = "Okay";
        class49.field844 = "Lade Standardeinstellungen - ";
        class43.field651 = "Starte 3D-Softwarebibliothek.";
        class132.field2171 = "Lade Liste der Welten";
        class136.field2242 = "Sprites geladen.";
        class58.field1010 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class194.field3113 = "Lade Wordpack - ";
        class283.field4674 = "Ablegen";
        class246.field4128 = "Titelbild geladen.";
        class21.field382 = "scrollen:";
        class162.field2628 = "Gegenstand für Mitglieder";
        class181.field2880 = "Spieler kann nicht gefunden werden: ";
        class302.field4919 = " loggt sich aus.";
        class136.field2237 = "Schließen";
        class280.field4652 = "Hierhin gehen";
        class271.field4492 = "Abbrechen";
        class124.field2098 = "blinken2:";
        class264.field4413 = "Verbindung abgebrochen.";
        class84.field1394 = "RuneScape wird geladen - bitte warten...";
        class224.field3786 = "lila:";
        class109.field1798 = "Angreifen";
        class217.field3670 = "3D-Softwarebibliothek gestartet.";
        class227.field3847 = " zuerst von deiner Freunde-Liste!";
        class134.field2205 = "Stufe: ";
        class22.field409 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class207.field3351 = "Standardeinstellungen geladen";
        class12.field217 = "Mechscape wird geladen - bitte warten...";
        class5.field127 = "Ladevorgang - bitte warte.";
        class23.field416 = "Musik-Engine vorbereitet.";
        class167.field2701 = "leuchten2:";
        class44.field675 = "Lade Sprites - ";
        class88.field1457 = " loggt sich ein.";
        class215.field3627 = "gelb:";
        class1.field43 = "rot:";
        class137.field2250 = "Versteckt";
        class241.field4064 = "Weiter";
        class42.field640 = "leuchten1:";
        class80.field1342 = "blaugrün:";
        class264.field4400 = "Bitte entferne ";
        class105.field1734 = " steht bereits auf deiner Ignorieren-Liste!";
        class213.field3595 = "welle:";
        class199.field3219 = "Speicher wird zugewiesen.";
        class132.field2178 = "Hierhin drehen";
        field1547++;
        class303.field4936 = "Benutzeroberfläche geladen.";
        class90.field1497 = "Wähl eine Option";
        class115.field1957 = "T";
        class96.field1555 = "Suche nach Updates - ";
        class30.field501 = "Konfig geladen.";
        class23.field426 = "gleiten:";
        class1.field76 = "M";
        class16.field321 = "Eingabeprozedur geladen.";
        class87.field1450 = " zuerst von deiner Ignorieren-Liste!";
        class110.field1828 = " weitere Optionen";
        class296.field4850 = "M";
        class206.field3331 = "Liste der Welten geladen";
        class5.field121 = "Fertigkeit: ";
        class279.field4645 = "Fallen lassen";
        class287.field4749 = "Verbindung zum Update-Server hergestellt.";
        class258.field4344 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class286.field4734 = "Nehmen";
        class115.field1956 = "Lade Titelbild - ";
        class253.field4286 = "Wordpack geladen.";
        class119.field2000 = "Kampfstufe: ";
        class227.field3848 = "leuchten3:";
        class3.field110 = "blinken3:";
        class245.field4116 = "Benutzen";
        class12.field261 = "Lade Benutzeroberfläche - ";
        class86.field1431 = "weiss:";
        class120.field2019 = "Lade Texturen - ";
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static void method680(int arg0) {
        field1552 = null;
        field1548 = null;
        field1550 = null;
        field1545 = null;
        field1543 = null;
        field1541 = null;
        if (arg0 != -50) {
            method675((class104) null, (class151) null, -79, (class151) null, (class151) null);
        }
    }
}
