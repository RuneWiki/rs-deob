import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class314 extends class123 {

    @OriginalMember(owner = "client!be", name = "W", descriptor = "[I")
    private int[] field4965;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[I")
    private int[] field4947;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Lud;")
    private class297 field4946;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Lud;")
    private class297 field4948;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "Lud;")
    private class297 field4956;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "[Lud;")
    private class297[] field4945;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "[I")
    public static int[] field4943 = new int[1000];

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field4939 = 0;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "[I")
    public static int[] field4958 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "Z")
    public static boolean field4959 = false;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field4953 = 0;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4949 = "";

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "Lpk;")
    public static class120 field4951;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "Z")
    public static boolean field4950;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 5)
    public static void method2208(byte arg0) {
        field4951 = null;
        field4958 = null;
        field4943 = null;
        field4949 = null;
        if (arg0 != -43) {
            field4953 = 94;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lpk;IBLln;IZD)Leg;", line = 24)
    public final class317 method2209(class120 arg0, int arg1, byte arg2, class27 arg3, int arg4, boolean arg5, double arg6) {
        field4940++;
        class113.method879(arg6, (byte) 77);
        class73.field1115 = arg3;
        field4951 = arg0;
        class244.method1719(arg1, arg4, 128);
        class317 var9 = new class317(arg4, arg1);
        for (int var10 = 0; var10 < this.field4945.length; var10++) {
            this.field4945[var10].method2106((byte) -110, arg4, arg1);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg5) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4948.field4762) {
                int[] var17 = this.field4948.method173(var12, true);
                var16 = var17;
                var15 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field4948.method172(var12, (byte) 63);
                var14 = var13[1];
                var15 = var13[0];
                var16 = var13[2];
            }
            for (int var18 = 0; var18 != arg4; var18++) {
                int var19 = var14[var18] >> 4;
                int var20 = var16[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var21 = var15[var18] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class34.field522[var20];
                int var23 = class34.field522[var21];
                int var24 = class34.field522[var19];
                var9.field4988[var11++] = (var23 << 16) + (var24 << 8) + var22;
                if (arg5) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field4945.length; var25++) {
            this.field4945[var25].method779(-1);
        }
        if (arg2 <= 19) {
            this.method2223(true, (class27) null, -26, (class120) null, false, 67, -1.357341369923483D);
        }
        return var9;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V", line = 136)
    public static final void method2210(int arg0, int arg1) {
        method2221(32);
        class55.method469(false);
        field4937++;
        int var2 = class309.method2183(0, arg1).field133;
        if (var2 == 0 || arg0 != 31845) {
            return;
        }
        int var3 = class123.field1998[arg1];
        if (var2 == 9) {
            class266.field4052 = var3;
        }
        if (var2 == 6) {
            class34.field516 = var3;
        }
        if (var2 == 5) {
            class118.field1907 = var3;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(DIZIILln;Lpk;)[I", line = 177)
    public final int[] method2211(double arg0, int arg1, boolean arg2, int arg3, int arg4, class27 arg5, class120 arg6) {
        field4960++;
        int[] var9 = new int[arg1 * 4 * arg3];
        class113.method879(arg0, (byte) 79);
        class73.field1115 = arg5;
        field4951 = arg6;
        class244.method1719(arg3, arg1, 128);
        int var10 = 0;
        if (arg4 != 7225) {
            return (int[]) null;
        }
        while (this.field4945.length > var10) {
            this.field4945[var10].method2106((byte) -121, arg1, arg3);
            var10++;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg2) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4948.field4762) {
                int[] var17 = this.field4948.method173(var12, true);
                var15 = var17;
                var16 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field4948.method172(var12, (byte) 63);
                var14 = var13[1];
                var15 = var13[0];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field4956.field4762) {
                var18 = this.field4956.method173(var12, true);
            } else {
                var18 = this.field4956.method172(var12, (byte) 63)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var16[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = var14[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = class34.field522[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class34.field522[var22];
                int var25 = class34.field522[var21];
                int var26;
                if (var23 == 0 && var24 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var23 << 16) + (var24 << 8) + (var26 << 24) + var25;
                if (arg2) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field4945.length; var27++) {
            this.field4945[var27].method779(-1);
        }
        return var9;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lpk;ILln;)Z", line = 319)
    public final boolean method2212(class120 arg0, int arg1, class27 arg2) {
        field4955++;
        if (class38.field586 > 0) {
            for (int var4 = 0; var4 < this.field4965.length; var4++) {
                if (!arg0.method953(this.field4965[var4], class38.field586, true)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4965.length; var5++) {
                if (!arg0.method939((byte) 45, this.field4965[var5])) {
                    return false;
                }
            }
        }
        if (arg1 != 4) {
            this.method2213(-0.7925701144096802D, -10, (class120) null, (byte) 117, 37, (class27) null, true, false);
        }
        for (int var6 = 0; var6 < this.field4947.length; var6++) {
            if (!arg2.method243(this.field4947[var6], arg1 + 111)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(DILpk;BILln;ZZ)[I", line = 376)
    public final int[] method2213(double arg0, int arg1, class120 arg2, byte arg3, int arg4, class27 arg5, boolean arg6, boolean arg7) {
        field4952++;
        int[] var10 = new int[arg1 * arg4];
        class113.method879(arg0, (byte) 97);
        field4951 = arg2;
        class73.field1115 = arg5;
        class244.method1719(arg1, arg4, 128);
        for (int var11 = 0; var11 < this.field4945.length; var11++) {
            this.field4945[var11].method2106((byte) 5, arg4, arg1);
        }
        if (arg3 >= -79) {
            this.method2212((class120) null, -57, (class27) null);
        }
        byte var12;
        int var13;
        int var14;
        if (arg6) {
            var13 = -1;
            var14 = arg4 - 1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = arg4;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4948.field4762) {
                int[] var21 = this.field4948.method173(var16, true);
                var18 = var21;
                var20 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field4948.method172(var16, (byte) 63);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var14; var22 != var13; var22 += var12) {
                int var23 = var20[var22] >> 4;
                int var24 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class34.field522[var23];
                int var26 = var19[var22] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class34.field522[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class34.field522[var26];
                var10[var15++] = (var28 << 8) + (var25 << 16) + var27;
                if (arg7) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field4945.length; var29++) {
            this.field4945[var29].method779(-1);
        }
        return var10;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 509)
    public static final void method2214(int arg0) {
        class225.field3482 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class18.field343 = "Spieler kann nicht gefunden werden: ";
        class244.field3655 = "Ladevorgang - bitte warte.";
        class63.field915 = "Stufe: ";
        class179.field2857 = "leuchten1:";
        class164.field2671 = "Abbrechen";
        class220.field3436 = "blinken1:";
        class37.field551 = " zuerst von deiner Ignorieren-Liste!";
        class200.field3071 = "Musik-Engine vorbereitet.";
        class68.field1033 = "Angreifen";
        class86.field1382 = "grün:";
        class137.field2238 = " zuerst von deiner Freunde-Liste!";
        class220.field3437 = "Verbindung zum Update-Server hergestellt.";
        class183.field2901 = "Bitte entferne ";
        class116.field1886 = "blinken3:";
        class328.field5125 = "3D-Softwarebibliothek gestartet.";
        class135.field2165 = "blaugrün:";
        class136.field2216 = "Verbindung mit Update-Server...";
        class93.field1522 = "Benutzen";
        class320.field5012 = "Starte 3D-Softwarebibliothek.";
        class337.field5210 = "leuchten2:";
        class149.field2437 = "Auswählen";
        class299.field4780 = "Spielwelt erstellt.";
        class34.field513 = "blinken2:";
        class18.field342 = "Untersuchen";
        class111.field1803 = "RuneScape wird geladen - bitte warten...";
        class84.field1329 = "Hierhin gehen";
        class285.field4452 = "Speicher wird zugewiesen.";
        class307.field4872 = "Wähl eine Option";
        class112.field1814 = "Wordpack geladen.";
        class245.field3659 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class11.field257 = "Bitte entferne ";
        class157.field2568 = "Schriftsätze geladen.";
        class58.field876 = ": ";
        class110.field1788 = " loggt sich aus.";
        class204.field3178 = " steht bereits auf deiner Ignorieren-Liste!";
        class233.field3544 = "Liste der Welten geladen";
        class266.field4022 = "Ablegen";
        class93.field1521 = "Lade Konfiguration - ";
        class204.field3179 = "T";
        class318.field4995 = "gleiten:";
        class334.field5199 = "Gegenstand für Mitglieder";
        class333.field5190 = "Konfig geladen.";
        class280.field4379 = "Titelbild geöffnet.";
        class281.field4411 = "Schließen";
        class201.field3126 = " weitere Optionen";
        class195.field3020 = "Weiter";
        class118.field1914 = "Lade Schriftsätze - ";
        class109.field1771 = "Fertigkeit: ";
        class320.field5016 = "Sprites geladen.";
        class308.field4883 = "Texturen geladen.";
        class338.field5223 = "welle2:";
        class303.field4833 = "Eingabeprozedur geladen.";
        if (arg0 > -28) {
            method2221(-27);
        }
        class91.field1473 = "Suche nach Updates - ";
        class160.field2602 = "welle:";
        class4.field111 = "rot:";
        class220.field3438 = "Versteckt";
        class280.field4386 = "Update-Liste geladen.";
        class325.field5082 = "Bitte warte...";
        class24.field418 = "lila:";
        class328.field5132 = "Lade Benutzeroberfläche - ";
        class76.field1166 = "Titelbild geladen.";
        class184.field2922 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class197.field3036 = "Hierhin drehen";
        class213.field3332 = "Okay";
        field4957++;
        class243.field3637 = "Lade Texturen - ";
        class165.field2674 = "Lade Wordpack - ";
        class120.field1971 = "Verbindung abgebrochen.";
        class340.field5249 = "Lade...";
        class185.field2934 = "scrollen:";
        class47.field727 = "Fallen lassen";
        class338.field5221 = "schütteln:";
        class135.field2161 = "M";
        class174.field2797 = "Zugewiesener Speicher.";
        class147.field2419 = "Nehmen";
        class154.field2508 = "weiss:";
        class266.field3997 = "Benutzeroberfläche geladen.";
        class155.field2514 = "T";
        class253.field3729 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class121.field1979 = "leuchten3:";
        class296.field4736 = "Standardinstellungen geladen";
        class90.field1434 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class173.field2774 = "gelb:";
        class155.field2544 = "M";
        class320.field5014 = "Lade Liste der Welten";
        class180.field2870 = " steht bereits auf deiner Freunde-Liste!";
        class112.field1815 = "Lade Standardeinstellungen - ";
        class207.field3273 = "Lade Titelbild - ";
        class318.field4997 = " loggt sich ein.";
        class76.field1191 = "Lade Sprites - ";
        class73.field1111 = "Kampfstufe: ";
        class113.field1831 = "möchte mit dir handeln.";
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I", line = 851)
    public static final int method2215(int arg0, int arg1, int arg2) {
        int var3 = class309.method2185(arg0 - 1, 0, arg2 - 1) - (-class309.method2185(arg0 - 1, 0, arg2 + 1) - class309.method2185(arg0 + arg1, 0, arg2 - 1)) + class309.method2185(arg0 + 1, 0, arg2 + 1);
        field4962++;
        int var4 = class309.method2185(arg0, 0, arg2 - 1) - (-class309.method2185(arg0, 0, arg2 + 1) - class309.method2185(arg0 - 1, 0, arg2) - class309.method2185(arg0 + 1, arg1 + -1, arg2));
        int var5 = class309.method2185(arg0, arg1 ^ 0x1, arg2);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 865)
    public static final void method2216(int arg0) {
        if (class69.field1054.toLowerCase().indexOf("microsoft") == -1) {
            class117.field1893[91] = 42;
            class117.field1893[93] = 43;
            class117.field1893[46] = 72;
            class117.field1893[92] = 74;
            class117.field1893[45] = 26;
            class117.field1893[47] = 73;
            if (class69.field1056 == null) {
                class117.field1893[222] = 59;
                class117.field1893[192] = 58;
            } else {
                class117.field1893[192] = 28;
                class117.field1893[520] = 59;
                class117.field1893[222] = 58;
            }
            class117.field1893[59] = 57;
            class117.field1893[44] = 71;
            class117.field1893[61] = 27;
        } else {
            class117.field1893[219] = 42;
            class117.field1893[186] = 57;
            class117.field1893[223] = 28;
            class117.field1893[189] = 26;
            class117.field1893[190] = 72;
            class117.field1893[191] = 73;
            class117.field1893[192] = 58;
            class117.field1893[188] = 71;
            class117.field1893[187] = 27;
            class117.field1893[222] = 59;
            class117.field1893[221] = 43;
            class117.field1893[220] = 74;
        }
        int var1 = 124 / ((-arg0 - 42) / 57);
        field4941++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIZ)V", line = 915)
    public static final void method2217(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class91.field1449 = arg1;
        class327.field5110 = arg2;
        class77.field1214 = arg3;
        class340.field5243 = new class42[arg0][class91.field1449][class327.field5110];
        class9.field220 = new int[arg0][class91.field1449 + 1][class327.field5110 + 1];
        if (class162.field2623) {
            class12.field267 = new class256[4][];
        }
        if (arg4) {
            class104.field1716 = new class42[1][class91.field1449][class327.field5110];
            class241.field3608 = new int[class91.field1449][class327.field5110];
            class337.field5214 = new int[1][class91.field1449 + 1][class327.field5110 + 1];
            if (class162.field2623) {
                class149.field2441 = new class256[1][];
            }
        } else {
            class104.field1716 = (class42[][][]) null;
            class241.field3608 = (int[][]) null;
            class337.field5214 = (int[][][]) null;
            class149.field2441 = (class256[][]) null;
        }
        class124.method982(false);
        class118.field1909 = new class47[500];
        class55.field844 = 0;
        class86.field1386 = new class47[500];
        class111.field1807 = 0;
        class5.field124 = new int[arg0][class91.field1449 + 1][class327.field5110 + 1];
        class124.field2008 = new class144[5000];
        class11.field252 = 0;
        class3.field97 = new class144[100];
        class142.field2296 = new boolean[class77.field1214 + class77.field1214 + 1][class77.field1214 + class77.field1214 + 1];
        class175.field2804 = new boolean[class77.field1214 + class77.field1214 + 2][class77.field1214 + class77.field1214 + 2];
        class50.field766 = new byte[arg0][class91.field1449][class327.field5110];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILtk;III)V", line = 963)
    public static final void method2218(int arg0, class266 arg1, int arg2, int arg3, int arg4) {
        class178.method1310(16);
        field4954++;
        if (class162.field2623) {
            class114.method886(arg3, arg0, arg1.field3941 + arg3, arg0 - -arg1.field3939);
        } else {
            class33.method304(arg3, arg0, arg1.field3941 + arg3, arg0 - -arg1.field3939);
        }
        if (arg2 != 1007629636) {
            method2208((byte) 33);
        }
        if (class42.field646 != 2 && class42.field646 != 5 && class50.field760 != null) {
            int var5 = (int) class171.field2747 + class150.field2455 & 0x7FF;
            int var6 = class345.field5363.field4671 / 32 + 48;
            int var7 = 464 - (class345.field5363.field4672 / 32);
            if (class162.field2623) {
                ((class196) class50.field760).method1386(arg3, arg0, arg1.field3941, arg1.field3939, var6, var7, var5, class10.field242 + 256, (class196) arg1.method1851(false, 0));
            } else {
                ((class317) class50.field760).method1643(arg3, arg0, arg1.field3941, arg1.field3939, var6, var7, var5, class10.field242 + 256, arg1.field4107, arg1.field4106);
            }
            if (class320.field5013 != null) {
                for (int var8 = 0; var8 < class320.field5013.field1782; var8++) {
                    if (class320.field5013.method861(true, var8)) {
                        int var9 = (((class320.field5013.field1780[var8] & 0xFFFF04B) >> 14) - class117.field1902) * 4 + 2 - class345.field5363.field4671 / 32;
                        int var10 = ((class320.field5013.field1780[var8] & 0x3FFF) - class133.field2118) * 4 + 2 - class345.field5363.field4672 / 32;
                        int var11 = class40.field612[var5];
                        int var12 = var11 * 256 / (class10.field242 + 256);
                        int var13 = class40.field619[var5];
                        int var14 = var13 * 256 / (class10.field242 + 256);
                        int var15 = var10 * var14 - var9 * var12 >> 16;
                        class205 var16 = class156.field2560;
                        int var17 = var9 * var14 + var10 * var12 >> 16;
                        if (class320.field5013.method860(var8, (byte) -77) == 1) {
                            var16 = class107.field1756;
                        }
                        if (class320.field5013.method860(var8, (byte) -77) == 2) {
                            var16 = class146.field2392;
                        }
                        int var18 = var16.method1489(class320.field5013.field1775[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if ((-arg1.field3941) <= var19 && arg1.field3941 >= var19 && -arg1.field3939 <= var15 && var15 <= arg1.field3939) {
                            int var20 = 16777215;
                            if (class320.field5013.field1781[var8] != -1) {
                                var20 = class320.field5013.field1781[var8];
                            }
                            if (class162.field2623) {
                                class114.method888((class196) arg1.method1851(false, 0));
                            } else {
                                class33.method305(arg1.field4107, arg1.field4106);
                            }
                            var16.method1487(class320.field5013.field1775[var8], var19 + (arg1.field3941 / 2) + arg3, arg1.field3939 / 2 + -var15 + arg0, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class162.field2623) {
                                class114.method881();
                            } else {
                                class33.method291();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class277.field4332; var21++) {
                int var22 = field4943[var21] * 4 + 2 - (class345.field5363.field4671 / 32);
                int var23 = class12.field275[var21] * 4 + 2 - (class345.field5363.field4672 / 32);
                class101 var24 = class288.method2025(class319.field5007[var21], -1);
                if (var24.field1653 != null) {
                    var24 = var24.method813((byte) -29);
                    if (var24 == null || var24.field1613 == -1) {
                        continue;
                    }
                }
                class96.method781(2, var23, arg0, var22, class60.field882[var24.field1613], arg3, arg1);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class30 var27 = class316.field4985[class75.field1153][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class345.field5363.field4671 / 32);
                        int var29 = var26 * 4 + 2 - (class345.field5363.field4672 / 32);
                        class96.method781(2, var29, arg0, var28, class339.field5229[0], arg3, arg1);
                    }
                }
            }
            for (int var30 = 0; var30 < class83.field1290; var30++) {
                class86 var31 = class197.field3029[class76.field1192[var30]];
                if (var31 != null && var31.method681(true)) {
                    class84 var32 = var31.field1381;
                    if (var32 != null && var32.field1339 != null) {
                        var32 = var32.method667(-51);
                    }
                    if (var32 != null && var32.field1342 && var32.field1325) {
                        int var33 = var31.field4671 / 32 - (class345.field5363.field4671 / 32);
                        int var34 = var31.field4672 / 32 - class345.field5363.field4672 / 32;
                        if (var32.field1314 == -1) {
                            class96.method781(2, var34, arg0, var33, class339.field5229[1], arg3, arg1);
                        } else {
                            class96.method781(arg2 ^ 0x3C0F3546, var34, arg0, var33, class60.field882[var32.field1314], arg3, arg1);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class45.field703; var35++) {
                class92 var36 = class74.field1140[class325.field5068[var35]];
                if (var36 != null && var36.method681(true)) {
                    int var37 = var36.field4671 / 32 - (class345.field5363.field4671 / 32);
                    int var38 = var36.field4672 / 32 - (class345.field5363.field4672 / 32);
                    boolean var39 = false;
                    long var40 = class106.method851(var36.field1486, -96);
                    for (int var42 = 0; var42 < class172.field2763; var42++) {
                        if (class130.field2080[var42] == var40 && class296.field4725[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class131.field2105; var44++) {
                        if (class160.field2597[var44].field879 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class345.field5363.field1511 != 0 && var36.field1511 != 0 && class345.field5363.field1511 == var36.field1511) {
                        var45 = true;
                    }
                    if (var39) {
                        class96.method781(2, var38, arg0, var37, class339.field5229[3], arg3, arg1);
                    } else if (var43) {
                        class96.method781(2, var38, arg0, var37, class339.field5229[5], arg3, arg1);
                    } else if (var45) {
                        class96.method781(2, var38, arg0, var37, class339.field5229[4], arg3, arg1);
                    } else {
                        class96.method781(arg2 - 1007629634, var38, arg0, var37, class339.field5229[2], arg3, arg1);
                    }
                }
            }
            class327[] var46 = class62.field912;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class327 var48 = var46[var47];
                if (var48 != null && var48.field5113 != 0 && class307.field4869 % 20 < 10) {
                    if (var48.field5113 == 1 && var48.field5117 >= 0 && class197.field3029.length > var48.field5117) {
                        class86 var49 = class197.field3029[var48.field5117];
                        if (var49 != null) {
                            int var50 = var49.field4671 / 32 - (class345.field5363.field4671 / 32);
                            int var51 = var49.field4672 / 32 - class345.field5363.field4672 / 32;
                            class86.method684(var51, var50, var48.field5120, arg0, 360000, (byte) 36, arg3, arg1);
                        }
                    }
                    if (var48.field5113 == 2) {
                        int var52 = (var48.field5109 - class133.field2118) * 4 + 2 - class345.field5363.field4672 / 32;
                        int var53 = var48.field5122 * 4;
                        int var54 = var53 * var53;
                        int var55 = (var48.field5121 - class117.field1902) * 4 + 2 - (class345.field5363.field4671 / 32);
                        class86.method684(var52, var55, var48.field5120, arg0, var54, (byte) 36, arg3, arg1);
                    }
                    if (var48.field5113 == 10 && var48.field5117 >= 0 && var48.field5117 < class74.field1140.length) {
                        class92 var56 = class74.field1140[var48.field5117];
                        if (var56 != null) {
                            int var57 = var56.field4671 / 32 - class345.field5363.field4671 / 32;
                            int var58 = var56.field4672 / 32 - (class345.field5363.field4672 / 32);
                            class86.method684(var58, var57, var48.field5120, arg0, 360000, (byte) 36, arg3, arg1);
                        }
                    }
                }
            }
            if (class57.field862 != 0) {
                int var59 = class57.field862 * 4 + class345.field5363.method738(-6421) * 2 + 2 - (class345.field5363.field4671 / 32) - 2;
                int var60 = class169.field2723 * 4 + class345.field5363.method738(-6421) * 2 + 2 - (class345.field5363.field4672 / 32) - 2;
                class96.method781(2, var60, arg0, var59, class116.field1889, arg3, arg1);
            }
            if (class162.field2623) {
                class114.method887(arg1.field3941 / 2 + arg3 - 1, arg1.field3939 / 2 - 1 + arg0, 3, 3, 16777215);
            } else {
                class33.method288(arg1.field3941 / 2 + arg3 - 1, arg1.field3939 / 2 + (arg0 - 1), 3, 3, 16777215);
            }
        } else if (class162.field2623) {
            class88 var61 = arg1.method1851(false, 0);
            if (var61 != null) {
                var61.method698(arg3, arg0);
            }
        } else {
            class33.method309(arg3, arg0, 0, arg1.field4107, arg1.field4106);
        }
        class282.field4415[arg4] = true;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I", line = 1310)
    public static final int method2219(int arg0, int arg1) {
        field4963++;
        if (arg1 != 4) {
            method2214(-95);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;)I", line = 1326)
    public static final int method2220(int arg0, String arg1) {
        field4964++;
        int var2 = 0;
        if (arg0 != -1) {
            method2220(28, (String) null);
        }
        while (class91.field1466.length > var2) {
            if (class91.field1466[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V", line = 1350)
    public static final void method2221(int arg0) {
        if (arg0 != 32) {
            field4939 = 76;
        }
        field4938++;
        for (class24 var1 = (class24) class158.field2584.method71((byte) -93); var1 != null; var1 = (class24) class158.field2584.method84(arg0 - 31)) {
            int var2 = var1.field417;
            if (class309.method2186(26080, var2)) {
                boolean var3 = true;
                class266[] var4 = class110.field1789[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4043;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field879;
                    class266 var7 = class171.method1276(var6, (byte) -122);
                    if (var7 != null) {
                        class280.method1971((byte) 101, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)Z", line = 1408)
    public static final boolean method2222(int arg0, boolean arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (!arg1) {
            field4959 = true;
        }
        field4961++;
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class101 var3 = class288.method2025(arg2, -1);
        return var3.method815(arg0, true);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLln;ILpk;ZID)Lhh;", line = 1427)
    public final class224 method2223(boolean arg0, class27 arg1, int arg2, class120 arg3, boolean arg4, int arg5, double arg6) {
        field4944++;
        if (arg4) {
            this.field4947 = (int[]) null;
        }
        class113.method879(arg6, (byte) 71);
        field4951 = arg3;
        class73.field1115 = arg1;
        class244.method1719(arg5, arg2, 128);
        class224 var9 = new class224(arg2, arg5);
        for (int var10 = 0; var10 < this.field4945.length; var10++) {
            this.field4945[var10].method2106((byte) 121, arg2, arg5);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg0) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4948.field4762) {
                int[] var13 = this.field4948.method173(var12, true);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field4948.method172(var12, (byte) 63);
                var16 = var17[1];
                var14 = var17[2];
                var15 = var17[0];
            }
            int[] var18;
            if (this.field4956.field4762) {
                var18 = this.field4956.method173(var12, true);
            } else {
                var18 = this.field4956.method172(var12, (byte) 63)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var14[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class34.field522[var20];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class34.field522[var21];
                int var24 = var15[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class34.field522[var24];
                int var26;
                if (var25 == 0 && var22 == 0 && var23 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field4988[var11++] = (var22 << 8) + ((var26 << 24) + (var25 << 16)) + var23;
                if (arg0) {
                    var11 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field4945.length; var27++) {
            this.field4945[var27].method779(-1);
        }
        return var9;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lln;IIZILpk;)[F", line = 1567)
    public final float[] method2224(class27 arg0, int arg1, int arg2, boolean arg3, int arg4, class120 arg5) {
        field4951 = arg5;
        field4942++;
        float[] var7 = new float[arg1 * 4 * arg4];
        class73.field1115 = arg0;
        class244.method1719(arg4, arg1, 128);
        for (int var8 = 0; var8 < this.field4945.length; var8++) {
            this.field4945[var8].method2106((byte) -98, arg1, arg4);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field4948.field4762) {
                int[] var11 = this.field4948.method173(var10, true);
                var12 = var11;
                var13 = var11;
                var14 = var11;
            } else {
                int[][] var15 = this.field4948.method172(var10, (byte) 63);
                var12 = var15[2];
                var14 = var15[0];
                var13 = var15[1];
            }
            int[] var16;
            if (this.field4956.field4762) {
                var16 = this.field4956.method173(var10, true);
            } else {
                var16 = this.field4956.method172(var10, (byte) 63)[0];
            }
            int[] var17;
            if (this.field4946.field4762) {
                var17 = this.field4946.method173(var10, true);
            } else {
                var17 = this.field4946.method172(var10, (byte) 63)[0];
            }
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = var19;
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field4945.length; var21++) {
            this.field4945[var21].method779(arg2 + 11457);
        }
        if (arg2 != -11458) {
            this.field4948 = (class297) null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 1685)
    public class314() {
        this.field4965 = new int[0];
        this.field4947 = new int[0];
        this.field4946 = new class318(0);
        this.field4946.field4774 = 1;
        this.field4948 = new class318();
        this.field4948.field4774 = 1;
        this.field4956 = new class318();
        this.field4956.field4774 = 1;
        this.field4945 = new class297[] { this.field4948, this.field4956, this.field4946 };
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Laj;)V", line = 1700)
    public class314(class1 arg0) {
        int var2 = arg0.method15((byte) 70);
        int var3 = 0;
        this.field4945 = new class297[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class297 var7 = class319.method2254(arg0, -1);
            if (var7.method783(109) >= 0) {
                var3++;
            }
            if (var7.method915(0) >= 0) {
                var4++;
            }
            int var8 = var7.field4765.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method15((byte) -103);
            }
            this.field4945[var6] = var7;
        }
        this.field4965 = new int[var3];
        int var10 = 0;
        this.field4947 = new int[var4];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class297 var13 = this.field4945[var12];
            int var14 = var13.field4765.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4765[var15] = this.field4945[var5[var12][var15]];
            }
            int var16 = var13.method783(75);
            int var17 = var13.method915(0);
            if (var16 > 0) {
                this.field4965[var10++] = var16;
            }
            if (var17 > 0) {
                this.field4947[var11++] = var17;
            }
            var5[var12] = null;
        }
        this.field4948 = this.field4945[arg0.method15((byte) 69)];
        this.field4956 = this.field4945[arg0.method15((byte) 96)];
        this.field4946 = this.field4945[arg0.method15((byte) -66)];
        int[][] var18 = (int[][]) null;
    }
}
