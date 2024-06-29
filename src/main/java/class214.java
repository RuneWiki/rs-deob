import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class214 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[I")
    public static int[] field3377 = new int[256];

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "[Z")
    public static boolean[] field3385;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3384;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Loa;")
    public class318 field3375;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[I")
    public int[] field3379;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "[[[B")
    public static byte[][][] field3376;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[[[BIBII)V", line = 15)
    public static final void method1558(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class234.field3643++;
        class58.field830 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class284.field4405; var12 < class314.field4916; var12++) {
            class124[][] var13 = class83.field1138[var12];
            for (int var14 = class48.field632; var14 < class52.field661; var14++) {
                for (int var15 = class206.field3272; var15 < class294.field4563; var15++) {
                    class124 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class145.field2286[var14 + class166.field2734 - class147.field2318][var15 + class166.field2734 - class238.field3730] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field1785 = true;
                            var16.field1792 = true;
                            if (var16.field1798 > 0) {
                                var16.field1778 = true;
                            } else {
                                var16.field1778 = false;
                            }
                            class58.field830++;
                        } else {
                            var16.field1785 = false;
                            var16.field1792 = false;
                            var16.field1781 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field1775 != null) {
                                    class102 var17 = var16.field1775;
                                    var17.field1362.method595(0, var12, var17.field1359, var17.field1363, var17.field1356);
                                    if (var17.field1365 != null) {
                                        var17.field1365.method595(0, var12, var17.field1359, var17.field1363, var17.field1356);
                                    }
                                }
                                if (var16.field1779 != null) {
                                    class283 var18 = var16.field1779;
                                    var18.field4382.method595(var18.field4381, var12, var18.field4374, var18.field4375, var18.field4371);
                                    if (var18.field4384 != null) {
                                        var18.field4384.method595(var18.field4381, var12, var18.field4374, var18.field4375, var18.field4371);
                                    }
                                }
                                if (var16.field1788 != null) {
                                    class138 var19 = var16.field1788;
                                    var19.field2205.method595(0, var12, var19.field2207, var19.field2202, var19.field2201);
                                }
                                if (var16.field1783 != null) {
                                    for (int var20 = 0; var20 < var16.field1798; var20++) {
                                        class263 var21 = var16.field1783[var20];
                                        var21.field4118.method595(var21.field4123, var12, var21.field4116, var21.field4130, var21.field4125);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class187.field3013 == class172.field2843;
        if (class109.field1458) {
            GL var23 = class109.field1456;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class125.method908();
                class256.method1855(3, 90, -1);
                class116.field1612 = true;
                class74.method564();
                class52.field659 = -1;
                class284.field4401 = -1;
                for (int var24 = 0; var24 < class216.field3403[0].length; var24++) {
                    class247 var25 = class216.field3403[0][var24];
                    float var26 = 251.5F - (var25.field3891 ? 1.0F : 0.5F);
                    if (class52.field659 != var25.field3886) {
                        class52.field659 = var25.field3886;
                        class174.method1286(var25.field3886, (byte) 74);
                        class115.method815(class25.method241(22985));
                    }
                    var25.method1780(class83.field1138, var26, false);
                }
                class74.method562();
            } else {
                int var27 = class284.field4405;
                while (true) {
                    if (var27 >= class314.field4916) {
                        class176.method1297(class147.field2318, class238.field3730, class83.field1138);
                        break;
                    }
                    for (int var28 = 0; var28 < class216.field3403[var27].length; var28++) {
                        class247 var29 = class216.field3403[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3891 ? 1.0F : 0.5F);
                        if (var29.field3889 != -1 && class144.method1071(-57, class31.field466.method453(255, var29.field3889)) && class71.field985) {
                            class174.method1286(var29.field3886, (byte) 127);
                        }
                        var29.method1780(class83.field1138, var30, false);
                    }
                    if (var27 == 0 && class27.field399 > 0) {
                        class109.method745(101.5F);
                        class8.method106(class147.field2318, class238.field3730, class166.field2734, arg1, class145.field2286, class172.field2843[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class284.field4405; var31 < class314.field4916; var31++) {
            class124[][] var32 = class83.field1138[var31];
            for (int var33 = -class166.field2734; var33 <= 0; var33++) {
                int var34 = class147.field2318 + var33;
                int var35 = class147.field2318 - var33;
                if (var34 >= class48.field632 || var35 < class52.field661) {
                    for (int var36 = -class166.field2734; var36 <= 0; var36++) {
                        int var37 = class238.field3730 + var36;
                        int var38 = class238.field3730 - var36;
                        if (var34 >= class48.field632) {
                            if (var37 >= class206.field3272) {
                                class124 var39 = var32[var34][var37];
                                if (var39 != null && var39.field1785) {
                                    class117.method827(var39, true);
                                }
                            }
                            if (var38 < class294.field4563) {
                                class124 var40 = var32[var34][var38];
                                if (var40 != null && var40.field1785) {
                                    class117.method827(var40, true);
                                }
                            }
                        }
                        if (var35 < class52.field661) {
                            if (var37 >= class206.field3272) {
                                class124 var41 = var32[var35][var37];
                                if (var41 != null && var41.field1785) {
                                    class117.method827(var41, true);
                                }
                            }
                            if (var38 < class294.field4563) {
                                class124 var42 = var32[var35][var38];
                                if (var42 != null && var42.field1785) {
                                    class117.method827(var42, true);
                                }
                            }
                        }
                        if (class58.field830 == 0) {
                            if (!var22) {
                                class181.field2938 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class284.field4405; var43 < class314.field4916; var43++) {
            class124[][] var44 = class83.field1138[var43];
            for (int var45 = -class166.field2734; var45 <= 0; var45++) {
                int var46 = class147.field2318 + var45;
                int var47 = class147.field2318 - var45;
                if (var46 >= class48.field632 || var47 < class52.field661) {
                    for (int var48 = -class166.field2734; var48 <= 0; var48++) {
                        int var49 = class238.field3730 + var48;
                        int var50 = class238.field3730 - var48;
                        if (var46 >= class48.field632) {
                            if (var49 >= class206.field3272) {
                                class124 var51 = var44[var46][var49];
                                if (var51 != null && var51.field1785) {
                                    class117.method827(var51, false);
                                }
                            }
                            if (var50 < class294.field4563) {
                                class124 var52 = var44[var46][var50];
                                if (var52 != null && var52.field1785) {
                                    class117.method827(var52, false);
                                }
                            }
                        }
                        if (var47 < class52.field661) {
                            if (var49 >= class206.field3272) {
                                class124 var53 = var44[var47][var49];
                                if (var53 != null && var53.field1785) {
                                    class117.method827(var53, false);
                                }
                            }
                            if (var50 < class294.field4563) {
                                class124 var54 = var44[var47][var50];
                                if (var54 != null && var54.field1785) {
                                    class117.method827(var54, false);
                                }
                            }
                        }
                        if (class58.field830 == 0) {
                            if (!var22) {
                                class181.field2938 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class181.field2938 = false;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 386)
    public static final void method1559(boolean arg0) {
        class295.field4578 = "möchte mit dir handeln.";
        class291.field4485 = " loggt sich ein.";
        class3.field30 = "Verbindung abgebrochen.";
        class303.field4714 = "RuneScape wird geladen - bitte warten...";
        class325.field5095 = "rot:";
        class271.field4208 = "Schließen";
        class10.field193 = "Spieler kann nicht gefunden werden: ";
        class302.field4646 = "Starte 3D-Softwarebibliothek.";
        class1.field1 = "Stufe: ";
        class185.field3002 = "Hierhin drehen";
        class281.field4348 = "Verbindung mit Update-Server...";
        class317.field5021 = "Lade Standardeinstellungen - ";
        class32.field474 = "Versteckt";
        class159.field2480 = " steht bereits auf deiner Freunde-Liste!";
        class216.field3406 = "Bitte entferne ";
        class39.field559 = "welle2:";
        class130.field1926 = "leuchten2:";
        class70.field973 = "T";
        class153.field2374 = " steht bereits auf deiner Ignorieren-Liste!";
        class160.field2538 = "Okay";
        class171.field2814 = "Schriftsätze geladen.";
        class202.field3219 = "Lade...";
        class33.field486 = "Sprites geladen.";
        class276.field4264 = "Fallen lassen";
        class251.field3944 = "Benutzeroberfläche geladen.";
        class113.field1569 = ": ";
        class15.field262 = "grün:";
        class174.field2852 = "scrollen:";
        field3384 = "Lade Sprites - ";
        class6.field125 = "Hierhin gehen";
        class270.field4198 = "T";
        class48.field628 = "Angreifen";
        class101.field1350 = "Zugewiesener Speicher.";
        class150.field2353 = "Titelbild geöffnet.";
        class291.field4488 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class107.field1448 = "leuchten1:";
        class58.field840 = "Auswählen";
        class113.field1583 = " zuerst von deiner Ignorieren-Liste!";
        class4.field39 = "Lade Schriftsätze - ";
        class149.field2336 = "Lade Konfiguration - ";
        class86.field1166 = " zuerst von deiner Freunde-Liste!";
        class234.field3663 = "Liste der Welten geladen";
        class328.field5145 = "Untersuchen";
        class24.field366 = "Benutzen";
        class110.field1517 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class339.field5292 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class129.field1893 = "Fertigkeit: ";
        class131.field1941 = "Lade Liste der Welten";
        class126.field1819 = "Ladevorgang - bitte warte.";
        class225.field3580 = "blinken2:";
        class246.field3856 = "Gegenstand für Mitglieder";
        class71.field983 = "Eingabeprozedur geladen.";
        class61.field896 = "blaugrün:";
        class134.field1965 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class2.field25 = "weiss:";
        class232.field3623 = "Wähl eine Option";
        class336.field5238 = "Bitte warte...";
        class293.field4542 = "Musik-Engine vorbereitet.";
        class22.field333 = "Texturen geladen.";
        class251.field3963 = "Lade Texturen - ";
        class159.field2514 = " loggt sich aus.";
        class179.field2905 = "welle:";
        class307.field4790 = "Spielwelt erstellt.";
        class199.field3170 = "Speicher wird zugewiesen.";
        class251.field3947 = "blinken3:";
        class193.field3078 = "schütteln:";
        class60.field892 = "Suche nach Updates - ";
        class141.field2243 = "Verbindung zum Update-Server hergestellt.";
        class179.field2913 = "Wordpack geladen.";
        class341.field5304 = "Nehmen";
        class77.field1042 = "Lade Wordpack - ";
        class310.field4831 = "M";
        class224.field3545 = "Konfig geladen.";
        field3372++;
        class229.field3589 = "Lade Titelbild - ";
        class283.field4379 = "lila:";
        class179.field2919 = "Ablegen";
        class333.field5187 = "gelb:";
        class59.field853 = "Kampfstufe: ";
        if (!arg0) {
            field3383 = -93;
        }
        class317.field5022 = "Weiter";
        class326.field5119 = "3D-Softwarebibliothek gestartet.";
        class127.field1837 = "blinken1:";
        class240.field3740 = "Titelbild geladen.";
        class282.field4357 = "Abbrechen";
        class78.field1044 = " weitere Optionen";
        class57.field791 = "M";
        class98.field1294 = "leuchten3:";
        class310.field4818 = "Update-Liste geladen.";
        class265.field4140 = "gleiten:";
        class206.field3279 = "Lade Benutzeroberfläche - ";
        class60.field880 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class1.field5 = "Bitte entferne ";
        class255.field4038 = "Standardinstellungen geladen";
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3377[var0] = var1;
        }
        field3385 = new boolean[100];
        field3384 = "Loading sprites - ";
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIIII)V", line = 725)
    public static final void method1560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3378++;
        int var11 = arg10 - arg8;
        if (arg10 < class251.field3959) {
            var11++;
        }
        int var12 = arg5 - arg6;
        if (class340.field5301 > arg5) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = (var13 + 1) * arg7 + arg4 >> 16;
            int var15 = arg7 * var13 + arg4 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg8 + var13 >> 6;
                if (var17 >= 0 && var17 <= (class232.field3629.length - 1)) {
                    int var18 = arg2 + var14;
                    int var19 = arg2 + var15;
                    byte[][] var20 = class56.field776[var17];
                    int[][] var21 = class232.field3629[var17];
                    byte[][] var22 = class174.field2860[var17];
                    byte[][] var23 = class193.field3075[var17];
                    byte[][] var24 = class68.field962[var17];
                    byte[][] var25 = class231.field3609[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg9 * var26 + arg0 >> 16;
                        int var28 = (var26 + 1) * arg9 + arg0 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg1 + var27;
                            int var31 = arg6 + var26 >> 6;
                            int var32 = arg1 + var28;
                            int var33 = var26 + arg6 & 0x3F;
                            int var34 = arg8 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var31 < 0 || (var21.length - 1) < var31 || var21[var31] == null) {
                                if (class136.field2174.field4557 != -1) {
                                    var36 = class136.field2174.field4557;
                                } else if ((var26 + arg6 & 0x4) == (arg8 + var13 & 0x4)) {
                                    var36 = class343.field5332[class6.field87 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || (var21.length - 1) < var31) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class280.method1971(var19, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var21[var31][var35];
                            }
                            int var37 = var22[var31] == null ? 0 : class343.field5332[var22[var31][var35] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var38 = var23[var31] == null ? 0 : class343.field5332[var23[var31][var35] & 0xFF];
                            if (var38 == 0 && var37 == 0) {
                                class280.method1971(var19, var30, var16, var29, var36);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var39 = var20[var31] == null ? 0 : var20[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class280.method1971(var19, var30, var16, var29, var38);
                                    } else {
                                        class141.method1049(var39 & 0x3, var40 >> 2, -120, var29, class280.field4310, true, var16, var38, var19, var30, var36);
                                    }
                                }
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = var36;
                                    }
                                    byte var41 = var24[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class280.method1971(var19, var30, var16, var29, var37);
                                    }
                                    class141.method1049(var41 & 0x3, var42 >> 2, -122, var29, class280.field4310, var38 == 0, var16, var37, var19, var30, 0);
                                }
                            }
                            if (var25[var31] != null) {
                                int var43 = var25[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var29 == 1) {
                                        var44 = var30;
                                    } else {
                                        var44 = var32 - 1;
                                    }
                                    int var45;
                                    if (var16 == 1) {
                                        var45 = var19;
                                    } else {
                                        var45 = var18 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class280.method1973(var19, var30, var29, var46);
                                    } else if (var43 == 2) {
                                        class280.method1975(var19, var30, var16, var46);
                                    } else if (var43 == 3) {
                                        class280.method1973(var45, var30, var29, var46);
                                    } else if (var43 == 4) {
                                        class280.method1975(var19, var44, var16, var46);
                                    } else if (var43 == 9) {
                                        class280.method1973(var19, var30, var29, 16777215);
                                        class280.method1975(var19, var30, var16, var46);
                                    } else if (var43 == 10) {
                                        class280.method1973(var45, var30, var29, 16777215);
                                        class280.method1975(var19, var30, var16, var46);
                                    } else if (var43 == 11) {
                                        class280.method1973(var45, var30, var29, 16777215);
                                        class280.method1975(var19, var44, var16, var46);
                                    } else if (var43 == 12) {
                                        class280.method1973(var19, var30, var29, 16777215);
                                        class280.method1975(var19, var44, var16, var46);
                                    } else if (var43 == 17) {
                                        class280.method1975(var19, var30, 1, var46);
                                    } else if (var43 == 18) {
                                        class280.method1975(var45, var30, 1, var46);
                                    } else if (var43 == 19) {
                                        class280.method1975(var45, var44, 1, var46);
                                    } else if (var43 == 20) {
                                        class280.method1975(var19, var44, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class280.method1975(var19 + var47, -var47 + var44, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class280.method1975(var19 + var48, var30 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg2 + var14;
                    int var50 = arg2 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class136.field2174.field4557 != -1) {
                            var52 = class136.field2174.field4557;
                        } else if ((arg6 + var51 & 0x4) == (arg8 + var13 & 0x4)) {
                            var52 = class343.field5332[class6.field87 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        int var53 = (arg9 * var51 + arg0 >> 16) + arg1;
                        int var54 = ((var51 + 1) * arg9 + arg0 >> 16) + arg1;
                        int var55 = var54 - var53;
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        class280.method1971(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        if (arg3 != -1378993982) {
            method1566(-17);
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = arg4 + (arg7 * var56) >> 16;
            int var58 = arg4 + ((var56 + 1) * arg7) >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                var10000 = arg2 + var58;
                int var61 = arg8 + var56 >> 6;
                int var62 = arg2 + var57;
                if (var61 >= 0 && var61 <= (class212.field3348.length - 1)) {
                    int[][] var63 = class212.field3348[var61];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg0 + ((var64 + 1) * arg9) >> 16;
                        int var66 = arg9 * var64 + arg0 >> 16;
                        int var67 = var65 - var66;
                        if (var67 > 0) {
                            var10000 = arg1 + var65;
                            int var69 = arg1 + var66;
                            int var70 = arg6 + var64 >> 6;
                            if (var70 >= 0 && (var63.length - 1) >= var70) {
                                int var71 = (arg6 + var64 & 0x3F << 6) + (var56 + arg8 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        class205 var74 = class42.method341(var73 - 1, 45);
                                        int var75 = (var72 & 0x6C3B) >> 13;
                                        boolean var76 = (var72 & 0xB580) >> 15 == 1;
                                        class201 var77 = var74.method1508(var76, 123, var75);
                                        if (var77 != null) {
                                            int var78 = var77.field290 * var67 / 4;
                                            int var79 = var77.field297 * var59 / 4;
                                            if (var74.field3246) {
                                                int var80 = (var72 & 0xFAAE0B) >> 20;
                                                int var81 = (var72 & 0xFD536) >> 16;
                                                if ((var75 & 0x1) == 1) {
                                                    int var82 = var81;
                                                    var81 = var80;
                                                    var80 = var82;
                                                }
                                                var78 = var67 * var80;
                                                var79 = var59 * var81;
                                            }
                                            if (var79 != 0 && var78 != 0) {
                                                if (var74.field3253 == 0) {
                                                    var77.method1486(var62, var69 + var67 - var78, var79, var78);
                                                } else {
                                                    var77.method1496(var62, var69 + var67 - var78, var79, var78, var74.field3253);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIII)I", line = 1146)
    public static final int method1561(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            return -50;
        }
        field3380++;
        class111 var4 = (class111) class267.field4161.method2168((long) arg2, (byte) -86);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field1547.length; var6++) {
            if (var4.field1547[var6] >= 0 && class269.field4188 > var4.field1547[var6]) {
                class316 var7 = class149.method1092((byte) -104, var4.field1547[var6]);
                if (var7.field4938 != null) {
                    class233 var8 = (class233) var7.field4938.method2168((long) arg3, (byte) -128);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field1552[var6] * var8.field3633;
                        } else {
                            var5 += var8.field3633;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I", line = 1197)
    public static int method1562(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;Ljava/lang/String;I)V", line = 1230)
    public static final void method1563(int arg0, String arg1, byte arg2, String arg3, String arg4, int arg5) {
        field3382++;
        for (int var6 = 99; var6 > 0; var6--) {
            class283.field4380[var6] = class283.field4380[var6 - 1];
            class153.field2377[var6] = class153.field2377[var6 - 1];
            class107.field1418[var6] = class107.field1418[var6 - 1];
            class174.field2854[var6] = class174.field2854[var6 - 1];
            class83.field1140[var6] = class83.field1140[var6 - 1];
        }
        class153.field2377[0] = arg4;
        class229.field3594 = class220.field3487;
        class198.field3169++;
        class283.field4380[0] = arg0;
        if (arg2 != -37) {
            method1564(-125, -25, 113, -75, -59, -9);
        }
        class83.field1140[0] = arg5;
        class107.field1418[0] = arg3;
        class174.field2854[0] = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V", line = 1262)
    public static final void method1564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3374++;
        class256.method1853(class284.field4402[arg0], arg4 - arg3, arg1, arg3 + arg4, 0);
        int var6 = 0;
        int var7 = arg3 * arg3;
        int var8 = arg5;
        int var9 = arg5 * arg5;
        int var10 = var7 << 1;
        int var11 = var9 << 1;
        int var12 = var7 << 2;
        int var13 = ((var6 << 1) + arg2) * var11;
        int var14 = arg5 << 1;
        int var15 = var9 << 2;
        int var16 = (1 - var14) * var7 + var11;
        int var17 = var9 - ((var14 - 1) * var10);
        int var18 = ((arg5 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg5 - 1) * var12;
        while (var8 > 0) {
            if (var16 < 0) {
                while (var16 < 0) {
                    var6++;
                    var17 += var19;
                    var19 += var15;
                    var16 += var13;
                    var13 += var15;
                }
            }
            if (var17 < 0) {
                var16 += var13;
                var6++;
                var17 += var19;
                var19 += var15;
                var13 += var15;
            }
            var17 += -var18;
            var8--;
            int var21 = arg0 + var8;
            int var22 = arg4 + var6;
            var18 -= var12;
            int var23 = arg4 - var6;
            var16 += -var20;
            var20 -= var12;
            int var24 = arg0 - var8;
            class256.method1853(class284.field4402[var24], var23, arg1, var22, 0);
            class256.method1853(class284.field4402[var21], var23, arg1, var22, 0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 1345)
    public static final void method1565(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class130.field1918[var1] = false;
        }
        class185.field3006 = -1;
        class319.field5044 = 0;
        field3373++;
        class14.field236 = 0;
        class255.field4035 = -1;
        class166.field2715 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 1364)
    public static void method1566(int arg0) {
        if (arg0 <= 75) {
            method1559(false);
        }
        field3377 = null;
        field3385 = null;
        field3376 = (byte[][][]) null;
        field3384 = null;
    }
}
