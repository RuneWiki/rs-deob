import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class265 {

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lvg;")
    public static class75 field2435 = new class75(5000);

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
    public static boolean field2438 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
    public static int[] field2436 = new int[] { 0, 3, 7, 0, 0, 11, 0, 0, 0, 0, 9, 0, 0, 0, 28, -2, 0, 0, 10, 0, 14, -2, 0, 0, 5, 0, 3, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 4, -1, 0, 0, 0, 6, 0, -1, 7, 0, 0, 6, 0, 0, -2, 0, 0, 0, 12, -1, 0, 2, 8, -2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 17, 5, 0, 0, 3, 0, 0, -1, 0, -2, -2, 0, 15, 6, 8, 0, 0, 3, 2, 8, 12, 0, 0, 0, 0, 6, 0, 0, 0, 15, 0, 12, 3, 10, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 6, 0, 8, 0, 0, 0, -1, -2, 0, 0, -1, 0, -2, 8, 5, 0, 0, -1, 6, 0, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 10, 14, 0, 0, 0, 0, 0, 2, 5, 0, 12, 0, 3, 0, 0, 8, -1, 0, 0, 2, 0, -1, 0, 7, 0, 0, -1, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 3, 4, 7, 0, 0, 0, -1, 0, 0, -1, 8, 0, 0, 6, 6, 0, 0, 0, 0, 10, 20, 0, 0, 6, 6, 0, 4, 0, 4, 0, -2, 1, 0, 0, -1, 0, 0, 3, 0, 1, 0, 8, 2 };

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field2437 = "Loaded config";

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    public static boolean field2440;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public static final void method1042(boolean arg0, int arg1) {
        field2434++;
        if (class39.field551 == arg1) {
            return;
        }
        if (class39.field551 == 0) {
            class47.method336((byte) -117);
        }
        if (arg1 == 40) {
            class127.method883(-36);
        }
        if (arg1 != 40 && class174.field2745 != null) {
            class174.field2745.method899((byte) -117);
            class174.field2745 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class159.field2473 = 1;
            class253.field4057 = 0;
            class173.field2728 = 0;
            class170.field2645 = 0;
            class158.field2462 = 1;
            class140.method945((byte) -128, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class33.method264(103);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 5) {
            class265.method1791((byte) 98, class130.field2055);
        } else {
            class191.method1288(-67);
        }
        boolean var3 = class39.field551 == 5 || class39.field551 == 10 || class39.field551 == 28;
        if (arg0) {
            field2438 = false;
        }
        if (var2 != var3) {
            if (var2) {
                class167.field2618 = class292.field4603;
                if (class294.field4633 == 0) {
                    class208.method1399(29079, 2);
                } else {
                    class90.method690(0, class292.field4603, 2, 255, class31.field459, (byte) 114, false);
                }
                class240.field3903.method1549(false, 2);
            } else {
                class208.method1399(29079, 2);
                class240.field3903.method1549(true, 2);
            }
        }
        class39.field551 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1043(int arg0) {
        field2428++;
        if (class180.field2808 != null) {
            class180.field2808.field1589 = false;
        }
        class180.field2808 = null;
        if (class249.field4022 != null) {
            class249.field4022.method899((byte) 121);
            class249.field4022 = null;
        }
        class39.method288(class230.field3651, arg0 ^ 0xFFFFFFA9);
        class126.method879(class230.field3651, 28602);
        if (class213.field3320 != null) {
            class213.field3320.method1530(class230.field3651, 6);
        }
        class144.method979(arg0 - 95);
        class49.method356(-118);
        if (arg0 != 86) {
            return;
        }
        class213.field3320 = null;
        if (class222.field3412 != null) {
            class222.field3412.method554(true);
        }
        if (class183.field2844 != null) {
            class183.field2844.method554(true);
        }
        class240.field3903.method1542(-1);
        class71.field1127.method1776(arg0 ^ 0x7A9);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1044(int arg0) {
        if (!class82.field1385) {
            label241: while (true) {
                do {
                    if (!class292.method1957(95)) {
                        break label241;
                    }
                } while (class154.field2401 != 's' && class154.field2401 != 'S');
                class82.field1385 = true;
            }
        }
        field2421++;
        if (class245.field3987 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class134.method924(false);
            if (class221.field3402 == 0L) {
                class221.field3402 = var4;
            }
            if (var3 > 16384 && var4 - class221.field3402 < 5000L) {
                if ((var4 - class150.field2369) > 1000L) {
                    System.gc();
                    class150.field2369 = var4;
                }
                class60.field1025 = class88.field1511;
                class121.field1949 = 5;
            } else {
                class60.field1025 = class86.field1451;
                class245.field3987 = 10;
                class121.field1949 = 5;
            }
        } else if (class245.field3987 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class176.field2765[var6] = new class47(104, 104);
            }
            class245.field3987 = 30;
            class121.field1949 = 10;
            class60.field1025 = class263.field4188;
        } else {
            if (arg0 > -119) {
                field2439 = -50;
            }
            if (class245.field3987 == 30) {
                if (class147.field2328 == null) {
                    class147.field2328 = new class145(class240.field3903, class71.field1127);
                }
                if (class147.field2328.method986(-1)) {
                    class4.field41 = class293.method1961((byte) 111, 0, false, true, true);
                    class227.field3461 = class293.method1961((byte) 116, 1, false, true, true);
                    class161.field2530 = class293.method1961((byte) 116, 2, true, true, false);
                    class283.field4465 = class293.method1961((byte) -88, 3, false, true, true);
                    class135.field2097 = class293.method1961((byte) -12, 4, false, true, true);
                    class17.field252 = class293.method1961((byte) 111, 5, true, true, true);
                    class31.field459 = class293.method1961((byte) 111, 6, true, false, true);
                    class208.field3246 = class293.method1961((byte) -21, 7, false, true, true);
                    class130.field2055 = class293.method1961((byte) -63, 8, false, true, true);
                    class255.field4086 = class293.method1961((byte) 116, 9, false, true, true);
                    class62.field1074 = class293.method1961((byte) 125, 10, false, true, true);
                    class240.field3901 = class293.method1961((byte) -125, 11, false, true, true);
                    class132.field2073 = class293.method1961((byte) 117, 12, false, true, true);
                    class236.field3832 = class293.method1961((byte) -45, 13, false, true, true);
                    class150.field2370 = class293.method1961((byte) -65, 14, false, false, true);
                    class230.field3661 = class293.method1961((byte) -85, 15, false, true, true);
                    class210.field3266 = class293.method1961((byte) 126, 16, false, true, true);
                    class33.field496 = class293.method1961((byte) -45, 17, false, true, true);
                    class223.field3422 = class293.method1961((byte) -73, 18, false, true, true);
                    class109.field1797 = class293.method1961((byte) 109, 19, false, true, true);
                    class253.field4062 = class293.method1961((byte) 122, 20, false, true, true);
                    class205.field3204 = class293.method1961((byte) 120, 21, false, true, true);
                    class99.field1662 = class293.method1961((byte) -44, 22, false, true, true);
                    class4.field22 = class293.method1961((byte) 117, 23, true, true, true);
                    class118.field1918 = class293.method1961((byte) 117, 24, false, true, true);
                    class218.field3371 = class293.method1961((byte) 111, 25, false, true, true);
                    class109.field1784 = class293.method1961((byte) -64, 26, true, true, true);
                    class168.field2626 = class293.method1961((byte) 112, 27, false, true, true);
                    class17.field254 = class293.method1961((byte) -54, 28, true, true, true);
                    class245.field3987 = 40;
                    class121.field1949 = 15;
                    class60.field1025 = class45.field637;
                } else {
                    class121.field1949 = 12;
                    class60.field1025 = class75.field1252;
                }
            } else if (class245.field3987 == 40) {
                int var7 = 0;
                for (int var8 = 0; var8 < 29; var8++) {
                    var7 += class230.field3659[var8].method1973(2399) * class159.field2467[var8] / 100;
                }
                if (var7 == 100) {
                    class60.field1025 = class296.field4687;
                    class121.field1949 = 20;
                    class150.method1014(-16443, class130.field2055);
                    class125.method867((byte) 95, class130.field2055);
                    class152.method1025(class130.field2055, 109);
                    class245.field3987 = 41;
                } else {
                    if (var7 != 0) {
                        class60.field1025 = class58.field949 + var7 + "%";
                    }
                    class121.field1949 = 20;
                }
            } else if (class245.field3987 == 41) {
                if (class17.field254.method1617(14449)) {
                    this.method1054(23978, class17.field254.method1601(17055, 1));
                    class60.field1025 = class145.field2310;
                    class121.field1949 = 25;
                    class245.field3987 = 45;
                } else {
                    class60.field1025 = class27.field377 + class17.field254.method1594(120) + "%";
                    class121.field1949 = 25;
                }
            } else if (class245.field3987 == 45) {
                class239.method1639(22050, 124, class155.field2407, 2);
                class241.field3916 = new class5();
                class241.field3916.method44(9, 32359, 128);
                class222.field3412 = class51.method382(22050, 0, class179.field2788, -1, class230.field3651);
                class222.field3412.method560(class241.field3916, (byte) -117);
                class174.method1183(0, class230.field3661, class241.field3916, class135.field2097, class150.field2370);
                class183.field2844 = class51.method382(2048, 1, class179.field2788, -1, class230.field3651);
                class257.field4118 = new class178();
                class183.field2844.method560(class257.field4118, (byte) -128);
                class42.field601 = new class232(22050, class186.field2873);
                class292.field4603 = class31.field459.method1603(-115, "scape main");
                class121.field1949 = 30;
                class245.field3987 = 50;
                class60.field1025 = class160.field2497;
            } else if (class245.field3987 == 50) {
                int var9 = class147.method993(120, class130.field2055, class236.field3832);
                int var10 = class106.method761((byte) -14);
                if (var10 > var9) {
                    class121.field1949 = 35;
                    class60.field1025 = class72.field1218 + var9 * 100 / var10 + "%";
                } else {
                    class245.field3987 = 60;
                    class60.field1025 = class104.field1738;
                    class121.field1949 = 35;
                }
            } else if (class245.field3987 == 60) {
                int var11 = class4.method18(0, class130.field2055);
                int var12 = class66.method487(-90);
                if (var12 > var11) {
                    class121.field1949 = 40;
                    class60.field1025 = class243.field3965 + var11 * 100 / var12 + "%";
                } else {
                    class121.field1949 = 40;
                    class245.field3987 = 65;
                    class60.field1025 = class137.field2111;
                }
            } else if (class245.field3987 == 65) {
                class34.method270(class236.field3832, -29, class130.field2055);
                class121.field1949 = 45;
                class60.field1025 = class185.field2862;
                method1042(false, 5);
                class245.field3987 = 70;
            } else if (class245.field3987 == 70) {
                class161.field2530.method1617(14449);
                byte var13 = 0;
                int var14 = var13 + class161.field2530.method1594(108);
                class210.field3266.method1617(14449);
                int var15 = var14 + class210.field3266.method1594(107);
                class33.field496.method1617(14449);
                int var16 = var15 + class33.field496.method1594(126);
                class223.field3422.method1617(14449);
                int var17 = var16 + class223.field3422.method1594(114);
                class109.field1797.method1617(14449);
                int var18 = var17 + class109.field1797.method1594(124);
                class253.field4062.method1617(14449);
                int var19 = var18 + class253.field4062.method1594(109);
                class205.field3204.method1617(14449);
                int var20 = var19 + class205.field3204.method1594(108);
                class99.field1662.method1617(14449);
                int var21 = var20 + class99.field1662.method1594(126);
                class118.field1918.method1617(14449);
                int var22 = var21 + class118.field1918.method1594(106);
                class218.field3371.method1617(14449);
                int var23 = var22 + class218.field3371.method1594(121);
                class168.field2626.method1617(14449);
                int var24 = var23 + class168.field2626.method1594(116);
                if (var24 < 1100) {
                    class121.field1949 = 50;
                    class60.field1025 = class267.field4254 + var24 / 11 + "%";
                } else {
                    class99.method725(0, class161.field2530);
                    class258.method1752(class161.field2530, 1);
                    class222.method1496(class161.field2530, 63);
                    class231.method1544(class208.field3246, class161.field2530, false);
                    class281.method1892(true, true, class210.field3266, class208.field3246);
                    class204.method1377(class208.field3246, class223.field3422, 126);
                    class85.method601(true, (byte) -4, class208.field3246, class49.field719, class109.field1797);
                    class248.method1711(87, class161.field2530);
                    class283.method1906(class227.field3461, -44, class4.field41, class253.field4062);
                    class162.method1103(class161.field2530, (byte) 127);
                    class197.method1342(class205.field3204, class208.field3246, -67);
                    class209.method1404(-74, class99.field1662);
                    class209.method1401((byte) 126, class161.field2530);
                    class162.method1102(0, class236.field3832, class283.field4465, class208.field3246, class130.field2055);
                    class193.method1311(class161.field2530, -97);
                    class57.method436(class33.field496, 110);
                    class288.method1930(class118.field1918, new class179(), (byte) 127, class218.field3371);
                    class90.method689(class218.field3371, false, class118.field1918);
                    class105.method756(13, class161.field2530);
                    class258.method1747(class161.field2530, false);
                    class136.method928(class161.field2530, -20618);
                    class50.method373(16, class130.field2055, class161.field2530);
                    class165.method1117(83, class130.field2055, class161.field2530);
                    class121.field1949 = 50;
                    class60.field1025 = field2437;
                    class158.method1071((byte) -43);
                    class245.field3987 = 80;
                }
            } else if (class245.field3987 == 80) {
                int var25 = class143.method964((byte) -20, class130.field2055);
                int var26 = class58.method445(31032);
                if (var25 < var26) {
                    class121.field1949 = 60;
                    class60.field1025 = class20.field301 + var25 * 100 / var26 + "%";
                } else {
                    class112.method799(class130.field2055, (byte) 27);
                    class60.field1025 = class70.field1122;
                    class245.field3987 = 90;
                    class121.field1949 = 60;
                }
            } else if (class245.field3987 == 90) {
                if (class109.field1784.method1617(14449)) {
                    class187 var27 = new class187(class255.field4086, class109.field1784, class130.field2055, 20, !class210.field3264);
                    class195.method1327(var27);
                    if (class50.field740 == 1) {
                        class195.method1318(0.9F);
                    }
                    if (class50.field740 == 2) {
                        class195.method1318(0.8F);
                    }
                    if (class50.field740 == 3) {
                        class195.method1318(0.7F);
                    }
                    if (class50.field740 == 4) {
                        class195.method1318(0.6F);
                    }
                    class60.field1025 = class13.field215;
                    class121.field1949 = 70;
                    class245.field3987 = 100;
                } else {
                    class60.field1025 = class120.field1934 + class109.field1784.method1594(125) + "%";
                    class121.field1949 = 70;
                }
            } else if (class245.field3987 == 100) {
                if (class47.method348(true, class130.field2055)) {
                    class245.field3987 = 110;
                }
            } else if (class245.field3987 == 110) {
                class180.field2808 = new class93();
                class179.field2788.method257(10, class180.field2808, (byte) -13);
                class121.field1949 = 75;
                class60.field1025 = class110.field1802;
                class245.field3987 = 120;
            } else if (class245.field3987 == 120) {
                if (class62.field1074.method1602((byte) 80, "", "huffman")) {
                    class80 var28 = new class80(class62.field1074.method1595(3, "", "huffman"));
                    class221.method1494(var28, -14358);
                    class121.field1949 = 80;
                    class60.field1025 = class11.field207;
                    class245.field3987 = 130;
                } else {
                    class60.field1025 = class8.field169 + "0%";
                    class121.field1949 = 80;
                }
            } else if (class245.field3987 == 130) {
                if (!class283.field4465.method1617(14449)) {
                    class60.field1025 = class78.field1277 + class283.field4465.method1594(116) * 3 / 4 + "%";
                    class121.field1949 = 85;
                } else if (!class132.field2073.method1617(14449)) {
                    class60.field1025 = class78.field1277 + ((class132.field2073.method1594(111) / 10) + 75) + "%";
                    class121.field1949 = 85;
                } else if (!class236.field3832.method1617(14449)) {
                    class60.field1025 = class78.field1277 + (class236.field3832.method1594(108) / 20 + 85) + "%";
                    class121.field1949 = 85;
                } else if (class4.field22.method1591((byte) -123, "details")) {
                    class3.method12(class4.field22, class208.field3236, true);
                    class119.method834(class208.field3246);
                    class245.field3987 = 135;
                    class60.field1025 = class51.field748;
                    class121.field1949 = 95;
                } else {
                    class60.field1025 = class78.field1277 + (class4.field22.method1600((byte) -95, "details") / 10 + 90) + "%";
                    class121.field1949 = 85;
                }
            } else if (class245.field3987 == 135) {
                int var29 = class122.method844((byte) -107);
                if (var29 == -1) {
                    class121.field1949 = 95;
                    class60.field1025 = class216.field3349;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1790((byte) 51, "worldlistfull");
                    method1042(false, 1000);
                } else if (class40.field572) {
                    class60.field1025 = class135.field2098;
                    class245.field3987 = 140;
                    class121.field1949 = 96;
                } else {
                    this.method1790((byte) -119, "worldlistio_" + var29);
                    method1042(false, 1000);
                }
            } else if (class245.field3987 == 140) {
                class292.field4595 = class283.field4465.method1603(-121, "loginscreen");
                class17.field252.method1610(-22617, true, false);
                class31.field459.method1610(-22617, true, true);
                class130.field2055.method1610(-22617, true, true);
                class236.field3832.method1610(-22617, true, true);
                class62.field1074.method1610(-22617, true, true);
                class283.field4465.method1610(-22617, true, true);
                class245.field3987 = 150;
                class150.field2366 = true;
                class60.field1025 = class259.field4150;
                class121.field1949 = 97;
            } else if (class245.field3987 == 150) {
                if (class82.field1385) {
                    class180.field2815 = 0;
                    class106.field1754 = 0;
                    class181.field2829 = 0;
                    class158.field2461 = 0;
                }
                class82.field1385 = true;
                class73.method531((byte) 8, class179.field2788);
                class118.method829(class181.field2829, false, -1, -1, false);
                class60.field1025 = class115.field1882;
                class121.field1949 = 100;
                class245.field3987 = 160;
            } else if (class245.field3987 == 160) {
                class292.method1955(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1045(byte arg0) {
        field2432++;
        if (class39.field551 == 1000) {
            return;
        }
        class192.field2978++;
        if (class192.field2978 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class163.field2551 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class113.field1849.setSeed((long) class163.field2551);
        }
        this.method1060(false);
        if (class147.field2328 != null) {
            class147.field2328.method984(true);
        }
        if (arg0 < 119) {
            return;
        }
        class166.method1120((byte) 33);
        class230.method1534(false);
        class277.method1874((byte) 117);
        class28.method223((byte) 70);
        if (class213.field3320 != null) {
            int var3 = class213.field3320.method1527(126);
            class22.field317 = var3;
        }
        if (class39.field551 == 0) {
            this.method1044(-123);
            class272.method1837((byte) 4);
        } else if (class39.field551 == 5) {
            this.method1044(-126);
            class272.method1837((byte) 4);
        } else if (class39.field551 == 25 || class39.field551 == 28) {
            class127.method884(0);
        }
        if (class39.field551 == 10) {
            this.method1050((byte) 21);
            class40.method297((byte) 28);
            class42.method314((byte) -38);
            class129.method893(-111);
        } else if (class39.field551 == 30) {
            class183.method1240(5);
        } else if (class39.field551 == 40) {
            class129.method893(-119);
            if (class217.field3353 != -3) {
                if (class217.field3353 == 15) {
                    class115.method817(27);
                    return;
                }
                if (class217.field3353 != 2) {
                    class26.method212((byte) 90);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lre;)Z")
    public static final boolean method1046(class228 arg0) {
        if (class170.field2647) {
            if (method1059(arg0).field4362 != 0) {
                return false;
            }
            if (arg0.field3477 == 0) {
                return false;
            }
        }
        return arg0.field3622;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lre;)Lre;")
    public static final class228 method1047(class228 arg0) {
        int var1 = method1059(arg0).method1822(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class84.method596((byte) 35, arg0.field3467);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1048(int arg0) {
        method1053((byte) -105);
        class216.method1455(0);
        class259.method1759(arg0 ^ 0x2C9F);
        field2419++;
        class208.method1393(false);
        class141.method949((byte) 92);
        class132.method914((byte) 122);
        class42.method313((byte) -111);
        class272.method1838((byte) 124);
        class265.method1794(arg0 - 11492);
        class137.method931(17732);
        class19.method178((byte) -104);
        class93.method702(arg0 - 11566);
        class83.method592((byte) 32);
        class88.method661(true);
        class130.method905(115);
        if (arg0 != 11492) {
            method1056();
        }
        class231.method1545(arg0 ^ 0xFFFFD31B);
        class263.method1773(2047);
        class145.method983(64);
        class295.method1971(arg0 - 11599);
        class235.method1607((byte) -110);
        class55.method417(112);
        class103.method750(-14676);
        class281.method1894(97);
        class45.method329(true);
        class75.method541((byte) 34);
        class47.method343(0);
        class228.method1512(117);
        class236.method1625(-1);
        class180.method1223(false);
        class186.method1258(-2);
        class39.method279(arg0 + 8492);
        class256.method1740(100);
        class148.method997(-28437);
        class5.method28(16);
        class78.method557((byte) -73);
        class49.method368((byte) 81);
        class30.method237(-74);
        class144.method969((byte) -61);
        class6.method62(false);
        class193.method1303(-78);
        class111.method788(-1);
        class60.method456(-22171);
        class251.method1722(-24470);
        class271.method1827((byte) 89);
        class166.method1118((byte) 113);
        class86.method612((byte) 126);
        class62.method467(-1);
        class249.method1712(-105);
        class65.method481(89);
        class177.method1202(-4);
        class266.method1798(100);
        class277.method1873(-1);
        class104.method753(50);
        class95.method713(arg0 - 11473);
        class181.method1235((byte) -90);
        class194.method1317(1332050396);
        class168.method1133((byte) 80);
        class174.method1182((byte) 92);
        class213.method1447(-93);
        class36.method272(27472);
        class150.method1010(1);
        class221.method1491((byte) -128);
        class234.method1569();
        class24.method202(false);
        class72.method519(0);
        class54.method402();
        class58.method444((byte) -13);
        class275.method1849(-1);
        class66.method484(127);
        class115.method813(2846);
        class241.method1649(arg0 - 11366);
        class184.method1244((byte) 31);
        class192.method1292(arg0 ^ 0x2CF0);
        class242.method1667();
        class25.method204((byte) 10);
        class89.method686(-43);
        class220.method1488();
        class202.method1362(-111);
        class278.method1876(-90);
        class136.method929((byte) -103);
        class21.method192();
        class149.method1004(0);
        class143.method959((byte) 93);
        class152.method1020((byte) -95);
        class90.method688(0);
        class211.method1431();
        class291.method1947((byte) 43);
        class219.method1472(-4);
        class200.method1357((byte) 126);
        class18.method171(29225);
        class100.method735((byte) 88);
        class87.method616(-100);
        class223.method1499((byte) -67);
        class204.method1375((byte) 83);
        class212.method1444(arg0 - 11492);
        class56.method426(1);
        class51.method381((byte) 111);
        class283.method1904((byte) 123);
        class238.method1634(114);
        class217.method1461((byte) 95);
        class139.method938(-61);
        class119.method833();
        class112.method792(0);
        class173.method1176(21849);
        class171.method1152((byte) 124);
        class179.method1218(true);
        class17.method165((byte) 117);
        class255.method1737((byte) -82);
        class246.method1689();
        class118.method830((byte) -57);
        class260.method1763((byte) 109);
        class57.method433(false);
        class203.method1371(262144);
        class187.method1262(105);
        class286.method1921((byte) 36);
        class159.method1075((byte) -126);
        class126.method880(0);
        class226.method1503();
        class195.method1321();
        class80.method575(-14673);
        class154.method1035(arg0 ^ 0x54DC);
        class13.method111(128);
        class82.method587(1);
        class284.method1913((byte) -91);
        class146.method988(-4811);
        class31.method241((byte) 30);
        class110.method785(arg0 - 11428);
        class116.method820(2888);
        class43.method321((byte) 89);
        class163.method1107(0);
        class7.method67((byte) 122);
        class206.method1386(false);
        class140.method944(0);
        class267.method1801(0);
        class225.method1502();
        class209.method1402(arg0 - 11492);
        class117.method824((byte) -34);
        class274.method1844(arg0 + 17666);
        class59.method446();
        class294.method1962(arg0 ^ 0xFFFFD337);
        class113.method804((byte) 124);
        class70.method507((byte) 33);
        class41.method300(64);
        class53.method393((byte) 50);
        class11.method107(89);
        class261.method1767((byte) 123);
        class270.method1818();
        class125.method869(11617);
        class15.method155(-75);
        class52.method386((byte) -83);
        class214.method1449(-32768);
        class135.method926((byte) -36);
        class29.method225(true);
        class269.method1815(-85);
        class109.method778((byte) -59);
        class120.method835((byte) 115);
        class79.method567(arg0 - 11492);
        class201.method1361((byte) -100);
        class167.method1128((byte) -45);
        class48.method354(arg0 ^ 0xFFFFD21B);
        class94.method708(arg0 ^ 0x2C9E);
        class257.method1746(arg0 ^ 0xFFFFD31B);
        class131.method908(0);
        class292.method1953(false);
        class245.method1687(0);
        class107.method767();
        class81.method581((byte) -128);
        class2.method5((byte) -72);
        class28.method221((byte) -102);
        class198.method1349((byte) -25);
        class199.method1351((byte) 1);
        class243.method1683((byte) 111);
        class63.method472();
        class153.method1033();
        class244.method1684((byte) 53);
        class147.method990(false);
        class158.method1068(arg0 ^ 0xFFFFE704);
        class84.method595(arg0 - 11616);
        class172.method1167();
        class169.method1140();
        class254.method1734(-99);
        class33.method261(0);
        class160.method1078((byte) 105);
        class121.method838(-123);
        class4.method16(true);
        class170.method1144((byte) 113);
        class157.method1062((byte) 95);
        class101.method739(32739);
        class253.method1726((byte) -120);
        class191.method1287(-46);
        class218.method1465(24365);
        class98.method719((byte) 92);
        class108.method773(654487979);
        class97.method716((byte) -122);
        class69.method502(0);
        class287.method1923((byte) -121);
        class205.method1383(true);
        class162.method1101(103);
        class296.method1977(2);
        class264.method1786(arg0 - 11490);
        class38.method276(-1423742676);
        class176.method1193((byte) 123);
        class210.method1408(0);
        class196.method1339(127);
        class114.method807(0);
        class50.method374(1);
        class189.method1275((byte) -125);
        class268.method1809((byte) -76);
        class106.method760(4096);
        class227.method1508(2);
        class240.method1644((byte) -4);
        class102.method740(96);
        class190.method1280(-4097);
        class129.method892(4);
        class197.method1343(arg0 ^ 0x2CE7);
        class164.method1112(32112);
        class142.method957(arg0 ^ 0x35BD);
        class237.method1629(-11420);
        class27.method216((byte) -33);
        class222.method1497((byte) 51);
        class37.method274(-443);
        class26.method211((byte) -72);
        class20.method187((byte) 126);
        class71.method509(20160);
        class122.method843((byte) 94);
        class34.method266(0);
        class85.method600((byte) -33);
        class165.method1116((byte) -91);
        class280.method1885(-55);
        class99.method724(47);
        class138.method934(1);
        class258.method1751(15373);
        class61.method464(false);
        class183.method1242(arg0 ^ 0x2CD8);
        class297.method1985(arg0 - 11492);
        class230.method1536(-127);
        class8.method70(arg0 - 11594);
        class239.method1643(arg0 ^ 0xFFFFD369);
        class250.method1714(arg0 ^ 0x2CBA);
        class155.method1040(true);
        class288.method1929(1);
        class185.method1249(false);
        class161.method1099(-30533);
        class127.method882(false);
        if (class265.field4244) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIII)V")
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field2420++;
        int var9 = arg1 - arg0;
        if (arg5) {
            method1052((class228[]) null, 126, -63, -3, -80, 64, -10, -116);
        }
        int var10 = arg3 - arg4;
        int var11 = (arg7 - arg2 << 16) / var9;
        int var12 = (arg8 - arg6 << 16) / var10;
        class137.method932(var12, arg3, 0, arg0, 0, arg2, arg4, var11, arg1, arg6, 119);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class228.method1516(1, "argument count");
            }
            class264.field4206 = Integer.parseInt(arg0[0]);
            class212.field3292 = 2;
            if (arg0[1].equals("live")) {
                class183.field2843 = 0;
            } else if (arg0[1].equals("rc")) {
                class183.field2843 = 1;
            } else if (arg0[1].equals("wip")) {
                class183.field2843 = 2;
            } else {
                class228.method1516(1, "modewhat");
            }
            class95.field1613 = false;
            class177.field2770 = class206.method1390(arg0[2], -44);
            if (class177.field2770 == -1) {
                if (arg0[2].equals("english")) {
                    class177.field2770 = 0;
                } else if (arg0[2].equals("german")) {
                    class177.field2770 = 1;
                } else {
                    class228.method1516(1, "language");
                }
            }
            class179.method1216(class177.field2770, -23975);
            class151.field2373 = false;
            class174.field2741 = false;
            if (arg0[3].equals("game0")) {
                class167.field2613 = 0;
            } else if (arg0[3].equals("game1")) {
                class167.field2613 = 1;
            } else {
                class228.method1516(1, "game");
            }
            class193.field3021 = false;
            class138.field2113 = 0;
            class84.field1416 = "";
            class232.field3696 = 0;
            client var1 = new client();
            class61.field1053 = var1;
            var1.method1792(class183.field2843 + 32, 768, 29, 536, false, 1024, "runescape", (byte) -72);
            class47.field685.setLocation(40, 40);
        } catch (Exception var3) {
            class168.method1130((String) null, var3, -102);
        }
        field2430++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method1050(byte arg0) {
        class256.field4105 = 0;
        field2423++;
        while (class292.method1957(64) && class256.field4105 < 128) {
            class53.field807[class256.field4105] = class85.field1432;
            class162.field2543[class256.field4105] = class154.field2401;
            class256.field4105++;
        }
        class84.field1413++;
        if (class75.field1236 != -1) {
            class19.method185(0, (byte) 36, class29.field409, 0, 0, 0, class79.field1310, class75.field1236);
        }
        class275.field4392++;
        class19.method183(-109);
        if (arg0 != 21) {
            field2439 = -29;
        }
        while (true) {
            class116 var2;
            class228 var3;
            class228 var4;
            do {
                var2 = (class116) class213.field3312.method1231(15);
                if (var2 == null) {
                    while (true) {
                        class116 var5;
                        class228 var6;
                        class228 var7;
                        do {
                            var5 = (class116) class78.field1282.method1231(15);
                            if (var5 == null) {
                                while (true) {
                                    class116 var8;
                                    class228 var9;
                                    class228 var10;
                                    do {
                                        var8 = (class116) class52.field790.method1231(15);
                                        if (var8 == null) {
                                            if (class205.field3205 != null) {
                                                class115.method810(1);
                                            }
                                            if (class221.field3399 != null && class221.field3399.field1255 == 1) {
                                                if (class221.field3399.field1258 != null) {
                                                    class34.method268(arg0 - 21, class142.field2157, class106.field1774);
                                                }
                                                class221.field3399 = null;
                                                class106.field1774 = false;
                                                class142.field2157 = null;
                                            }
                                            if ((class192.field2978 % 1500) == 0) {
                                                class33.method264(arg0 ^ 0x6C);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1892;
                                        if (var9.field3551 < 0) {
                                            break;
                                        }
                                        var10 = class84.method596((byte) 35, var9.field3467);
                                    } while (var10 == null || var10.field3498 == null || var9.field3551 >= var10.field3498.length || var10.field3498[var9.field3551] != var9);
                                    class44.method322(var8, 200000);
                                }
                            }
                            var6 = var5.field1892;
                            if (var6.field3551 < 0) {
                                break;
                            }
                            var7 = class84.method596((byte) 35, var6.field3467);
                        } while (var7 == null || var7.field3498 == null || var7.field3498.length <= var6.field3551 || var7.field3498[var6.field3551] != var6);
                        class44.method322(var5, 200000);
                    }
                }
                var3 = var2.field1892;
                if (var3.field3551 < 0) {
                    break;
                }
                var4 = class84.method596((byte) 35, var3.field3467);
            } while (var4 == null || var4.field3498 == null || var3.field3551 >= var4.field3498.length || var4.field3498[var3.field3551] != var3);
            class44.method322(var2, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2425++;
        if (!this.method1788(-4)) {
            return;
        }
        class264.field4206 = Integer.parseInt(this.getParameter("worldid"));
        class212.field3292 = Integer.parseInt(this.getParameter("modewhere"));
        if (class212.field3292 < 0 || class212.field3292 > 1) {
            class212.field3292 = 0;
        }
        class183.field2843 = Integer.parseInt(this.getParameter("modewhat"));
        if (class183.field2843 < 0 || class183.field2843 > 2) {
            class183.field2843 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class95.field1613 = true;
        } else {
            class95.field1613 = false;
        }
        try {
            class177.field2770 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class177.field2770 = 0;
        }
        class179.method1216(class177.field2770, -23975);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class151.field2373 = true;
        } else {
            class151.field2373 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class174.field2741 = true;
        } else {
            class174.field2741 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class167.field2613 = 1;
        } else {
            class167.field2613 = 0;
        }
        try {
            class232.field3696 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class232.field3696 = 0;
        }
        class84.field1416 = this.getParameter("settings");
        if (class84.field1416 == null) {
            class84.field1416 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class138.field2113 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class138.field2113 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class193.field3021 = true;
        } else {
            class193.field3021 = false;
        }
        class61.field1053 = this;
        this.method1789(503, 765, 72, class183.field2843 + 32, 536);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1051(byte arg0) {
        field2429++;
        class128.method891((byte) -38);
        class71.field1127 = new class263();
        class240.field3903 = new class231();
        if (class183.field2843 != 0) {
            class277.field4396 = new byte[50][];
        }
        class257.method1743(-31204, class179.field2788);
        if (class212.field3292 == 0) {
            class163.field2571 = this.getCodeBase().getHost();
            class260.field4157 = 43594;
            class171.field2681 = 443;
        } else if (class212.field3292 == 1) {
            class163.field2571 = this.getCodeBase().getHost();
            class171.field2681 = class264.field4206 + 50000;
            class260.field4157 = class264.field4206 + 40000;
        } else if (class212.field3292 == 2) {
            class163.field2571 = "127.0.0.1";
            class171.field2681 = class264.field4206 + 50000;
            class260.field4157 = class264.field4206 + 40000;
        }
        if (class32.field468 == 3 && class212.field3292 != 2) {
            class152.field2385 = class264.field4206;
        }
        class184.field2845 = class171.field2681;
        class238.field3869 = class260.field4157;
        class287.field4543 = class291.field4585 = class13.field214 = class80.field1333 = new short[256];
        class173.field2719 = class163.field2571;
        class88.field1539 = class260.field4157;
        class177.field2773 = class238.field3869;
        if (class167.field2613 == 1) {
            class143.field2170 = class148.field2334;
            class114.field1859 = class71.field1147;
            class244.field3975 = true;
            class34.field508 = class60.field1038;
            class98.field1655 = class221.field3394;
        } else {
            class143.field2170 = class271.field4349;
            class34.field508 = class280.field4429;
            class114.field1859 = class161.field2532;
            class98.field1655 = class115.field1871;
        }
        class271.method1829(124);
        class72.method528(arg0 ^ 0xFFFFFF8B, class230.field3651);
        class237.method1632(class230.field3651, -83);
        class213.field3320 = class141.method948(18518);
        if (class213.field3320 != null) {
            class213.field3320.method1529(class230.field3651, (byte) -41);
        }
        class274.field4374 = class32.field468;
        try {
            if (class179.field2788.field478 != null) {
                class259.field4141 = new class55(class179.field2788.field478, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class122.field1963[var2] = new class55(class179.field2788.field483[var2], 6000, 0);
                }
                class286.field4535 = new class55(class179.field2788.field475, 6000, 0);
                class223.field3421 = new class103(255, class259.field4141, class286.field4535, 500000);
                class157.field2452 = new class55(class179.field2788.field471, 24, 0);
                class179.field2788.field478 = null;
                class179.field2788.field471 = null;
                class179.field2788.field475 = null;
                class179.field2788.field483 = null;
            }
        } catch (IOException var3) {
            class259.field4141 = null;
            class286.field4535 = null;
            class223.field3421 = null;
            class157.field2452 = null;
        }
        if (class212.field3292 != 0) {
            class11.field208 = true;
        }
        if (arg0 != -10) {
            field2436 = null;
        }
        class75.field1248 = class263.field4187;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lre;IIIIIII)V")
    public static final void method1052(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class228 var9 = arg0[var8];
            if (var9 != null && var9.field3467 == arg1 && (!var9.field3520 || var9.field3477 == 0 || var9.field3588 || method1059(var9).field4362 != 0 || class78.field1293 == var9 || var9.field3549 == 1338) && (!var9.field3520 || !method1046(var9))) {
                int var10 = var9.field3577 + arg6;
                int var11 = var9.field3532 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3477 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3574 + var10;
                    int var17 = var9.field3625 + var11;
                    if (var9.field3477 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class205.field3205 == var9) {
                    class163.field2567 = true;
                    class145.field2303 = var10;
                    class168.field2629 = var11;
                }
                if (!var9.field3520 || var12 < var14 && var13 < var15) {
                    if (var9.field3477 == 0) {
                        if (!var9.field3520 && method1046(var9) && class209.field3258 != var9) {
                            continue;
                        }
                        if (var9.field3636 && class79.field1323 >= var12 && class115.field1883 >= var13 && class79.field1323 < var14 && class115.field1883 < var15) {
                            for (class116 var18 = (class116) class52.field790.method1221(127); var18 != null; var18 = (class116) class52.field790.method1227(-10626)) {
                                if (var18.field1891) {
                                    var18.method1123(0);
                                    var18.field1892.field3469 = false;
                                }
                            }
                            if (class187.field2898 == 0) {
                                class205.field3205 = null;
                                class78.field1293 = null;
                            }
                            class171.field2675 = 0;
                        }
                    }
                    if (var9.field3520) {
                        boolean var19;
                        if (class79.field1323 >= var12 && class115.field1883 >= var13 && class79.field1323 < var14 && class115.field1883 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class160.field2485 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class164.field2581 == 1 && class291.field4584 >= var12 && class112.field1838 >= var13 && class291.field4584 < var14 && class112.field1838 < var15) {
                            var21 = true;
                        }
                        if (var9.field3542 != null) {
                            for (int var22 = 0; var22 < var9.field3542.length; var22++) {
                                if (class106.field1764[var9.field3542[var22]]) {
                                    if (var9.field3479 == null || class192.field2978 >= var9.field3479[var22]) {
                                        byte var23 = var9.field3578[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class106.field1764[86] && !class106.field1764[82] && !class106.field1764[81]) && ((var23 & 0x2) == 0 || class106.field1764[86]) && ((var23 & 0x1) == 0 || class106.field1764[82]) && ((var23 & 0x4) == 0 || class106.field1764[81])) {
                                            class294.method1963(var22 + 1, "", var9.field3480, -1, -86);
                                            int var24 = var9.field3506[var22];
                                            if (var9.field3479 == null) {
                                                var9.field3479 = new int[var9.field3542.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3479[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3479[var22] = class192.field2978 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3479 != null) {
                                    var9.field3479[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class237.method1631(var9, class112.field1838 - var11, (byte) -118, class291.field4584 - var10);
                        }
                        if (class205.field3205 != null && class205.field3205 != var9 && var19 && method1059(var9).method1831((byte) 33)) {
                            class278.field4421 = var9;
                        }
                        if (class78.field1293 == var9) {
                            class71.field1148 = true;
                            class142.field2165 = var10;
                            class237.field3844 = var11;
                        }
                        if (var9.field3588 || var9.field3549 != 0) {
                            if (var19 && class22.field317 != 0 && var9.field3566 != null) {
                                class116 var25 = new class116();
                                var25.field1891 = true;
                                var25.field1892 = var9;
                                var25.field1884 = class22.field317;
                                var25.field1895 = var9.field3566;
                                class52.field790.method1219(false, var25);
                            }
                            if (class205.field3205 != null || class268.field4278 != null || class47.field687 || var9.field3549 != 1400 && class171.field2675 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3549 != 0) {
                                if (var9.field3549 == 1337) {
                                    class177.field2767 = var9;
                                    continue;
                                }
                                if (var9.field3549 == 1338) {
                                    if (var21) {
                                        class245.field3982 = class291.field4584 - var10;
                                        class43.field611 = class112.field1838 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3549 == 1400) {
                                    class144.field2241 = var9;
                                    if (var21) {
                                        if (class106.field1764[82] && class140.field2141 > 0) {
                                            int var26 = (int) ((double) (class291.field4584 - var10 - var9.field3574 / 2) * 2.0D / (double) class218.field3370);
                                            int var27 = (int) ((double) (class112.field1838 - var11 - var9.field3625 / 2) * 2.0D / (double) class218.field3370);
                                            int var28 = class293.field4621 + var26;
                                            int var29 = class201.field3148 + var27;
                                            int var30 = class101.field1697 + var28;
                                            int var31 = class191.field2970 + class164.field2584 - var29 - 1;
                                            class259 var32 = class65.method483(30003);
                                            int[] var33 = var32.method1760(var30, var31, -55);
                                            if (var33 != null) {
                                                class139.method940(var33[0], var33[1], (byte) 65, var33[2]);
                                                class75.method534(21812);
                                            }
                                            continue;
                                        }
                                        class171.field2675 = 1;
                                        class280.field4427 = class79.field1323;
                                        class180.field2805 = class115.field1883;
                                        continue;
                                    }
                                    if (var20 && class171.field2675 > 0) {
                                        if (class171.field2675 == 1 && (class79.field1323 != class280.field4427 || class180.field2805 != class115.field1883)) {
                                            class100.field1691 = class293.field4621;
                                            class154.field2405 = class201.field3148;
                                            class171.field2675 = 2;
                                        }
                                        if (class171.field2675 == 2) {
                                            class163.method1109((int) ((double) (class280.field4427 - class79.field1323) * 2.0D / (double) class155.field2412) + class100.field1691, 0);
                                            class7.method66((int) ((double) (class180.field2805 - class115.field1883) * 2.0D / (double) class155.field2412) + class154.field2405, (byte) 11);
                                        }
                                        continue;
                                    }
                                    class171.field2675 = 0;
                                    continue;
                                }
                                if (var9.field3549 == 1401) {
                                    if (var20) {
                                        class229.method1532(-1, var9.field3625, class79.field1323 - var10, var9.field3574, class115.field1883 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field3549 == 1402) {
                                    class82.method591(var9, false);
                                    continue;
                                }
                            }
                            if (!var9.field3642 && var21) {
                                var9.field3642 = true;
                                if (var9.field3490 != null) {
                                    class116 var34 = new class116();
                                    var34.field1891 = true;
                                    var34.field1892 = var9;
                                    var34.field1888 = class291.field4584 - var10;
                                    var34.field1884 = class112.field1838 - var11;
                                    var34.field1895 = var9.field3490;
                                    class52.field790.method1219(false, var34);
                                }
                            }
                            if (var9.field3642 && var20 && var9.field3518 != null) {
                                class116 var35 = new class116();
                                var35.field1891 = true;
                                var35.field1892 = var9;
                                var35.field1888 = class79.field1323 - var10;
                                var35.field1884 = class115.field1883 - var11;
                                var35.field1895 = var9.field3518;
                                class52.field790.method1219(false, var35);
                            }
                            if (var9.field3642 && !var20) {
                                var9.field3642 = false;
                                if (var9.field3514 != null) {
                                    class116 var36 = new class116();
                                    var36.field1891 = true;
                                    var36.field1892 = var9;
                                    var36.field1888 = class79.field1323 - var10;
                                    var36.field1884 = class115.field1883 - var11;
                                    var36.field1895 = var9.field3514;
                                    class78.field1282.method1219(false, var36);
                                }
                            }
                            if (var20 && var9.field3478 != null) {
                                class116 var37 = new class116();
                                var37.field1891 = true;
                                var37.field1892 = var9;
                                var37.field1888 = class79.field1323 - var10;
                                var37.field1884 = class115.field1883 - var11;
                                var37.field1895 = var9.field3478;
                                class52.field790.method1219(false, var37);
                            }
                            if (!var9.field3469 && var19) {
                                var9.field3469 = true;
                                if (var9.field3558 != null) {
                                    class116 var38 = new class116();
                                    var38.field1891 = true;
                                    var38.field1892 = var9;
                                    var38.field1888 = class79.field1323 - var10;
                                    var38.field1884 = class115.field1883 - var11;
                                    var38.field1895 = var9.field3558;
                                    class52.field790.method1219(false, var38);
                                }
                            }
                            if (var9.field3469 && var19 && var9.field3583 != null) {
                                class116 var39 = new class116();
                                var39.field1891 = true;
                                var39.field1892 = var9;
                                var39.field1888 = class79.field1323 - var10;
                                var39.field1884 = class115.field1883 - var11;
                                var39.field1895 = var9.field3583;
                                class52.field790.method1219(false, var39);
                            }
                            if (var9.field3469 && !var19) {
                                var9.field3469 = false;
                                if (var9.field3473 != null) {
                                    class116 var40 = new class116();
                                    var40.field1891 = true;
                                    var40.field1892 = var9;
                                    var40.field1888 = class79.field1323 - var10;
                                    var40.field1884 = class115.field1883 - var11;
                                    var40.field1895 = var9.field3473;
                                    class78.field1282.method1219(false, var40);
                                }
                            }
                            if (var9.field3619 != null) {
                                class116 var41 = new class116();
                                var41.field1892 = var9;
                                var41.field1895 = var9.field3619;
                                class213.field3312.method1219(false, var41);
                            }
                            if (var9.field3563 != null && class143.field2177 > var9.field3537) {
                                if (var9.field3630 == null || class143.field2177 - var9.field3537 > 32) {
                                    class116 var46 = new class116();
                                    var46.field1892 = var9;
                                    var46.field1895 = var9.field3563;
                                    class52.field790.method1219(false, var46);
                                } else {
                                    label572: for (int var42 = var9.field3537; var42 < class143.field2177; var42++) {
                                        int var43 = class243.field3958[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3630.length; var44++) {
                                            if (var9.field3630[var44] == var43) {
                                                class116 var45 = new class116();
                                                var45.field1892 = var9;
                                                var45.field1895 = var9.field3563;
                                                class52.field790.method1219(false, var45);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field3537 = class143.field2177;
                            }
                            if (var9.field3587 != null && class187.field2906 > var9.field3476) {
                                if (var9.field3534 == null || class187.field2906 - var9.field3476 > 32) {
                                    class116 var51 = new class116();
                                    var51.field1892 = var9;
                                    var51.field1895 = var9.field3587;
                                    class52.field790.method1219(false, var51);
                                } else {
                                    label548: for (int var47 = var9.field3476; var47 < class187.field2906; var47++) {
                                        int var48 = class120.field1933[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3534.length; var49++) {
                                            if (var9.field3534[var49] == var48) {
                                                class116 var50 = new class116();
                                                var50.field1892 = var9;
                                                var50.field1895 = var9.field3587;
                                                class52.field790.method1219(false, var50);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field3476 = class187.field2906;
                            }
                            if (var9.field3559 != null && class180.field2819 > var9.field3564) {
                                if (var9.field3640 == null || class180.field2819 - var9.field3564 > 32) {
                                    class116 var56 = new class116();
                                    var56.field1892 = var9;
                                    var56.field1895 = var9.field3559;
                                    class52.field790.method1219(false, var56);
                                } else {
                                    label524: for (int var52 = var9.field3564; var52 < class180.field2819; var52++) {
                                        int var53 = class52.field797[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3640.length; var54++) {
                                            if (var9.field3640[var54] == var53) {
                                                class116 var55 = new class116();
                                                var55.field1892 = var9;
                                                var55.field1895 = var9.field3559;
                                                class52.field790.method1219(false, var55);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field3564 = class180.field2819;
                            }
                            if (var9.field3554 != null && class34.field511 > var9.field3550) {
                                if (var9.field3556 == null || class34.field511 - var9.field3550 > 32) {
                                    class116 var61 = new class116();
                                    var61.field1892 = var9;
                                    var61.field1895 = var9.field3554;
                                    class52.field790.method1219(false, var61);
                                } else {
                                    label500: for (int var57 = var9.field3550; var57 < class34.field511; var57++) {
                                        int var58 = class108.field1778[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3556.length; var59++) {
                                            if (var9.field3556[var59] == var58) {
                                                class116 var60 = new class116();
                                                var60.field1892 = var9;
                                                var60.field1895 = var9.field3554;
                                                class52.field790.method1219(false, var60);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field3550 = class34.field511;
                            }
                            if (var9.field3582 != null && class11.field209 > var9.field3609) {
                                if (var9.field3597 == null || class11.field209 - var9.field3609 > 32) {
                                    class116 var66 = new class116();
                                    var66.field1892 = var9;
                                    var66.field1895 = var9.field3582;
                                    class52.field790.method1219(false, var66);
                                } else {
                                    label476: for (int var62 = var9.field3609; var62 < class11.field209; var62++) {
                                        int var63 = class245.field3984[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3597.length; var64++) {
                                            if (var9.field3597[var64] == var63) {
                                                class116 var65 = new class116();
                                                var65.field1892 = var9;
                                                var65.field1895 = var9.field3582;
                                                class52.field790.method1219(false, var65);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field3609 = class11.field209;
                            }
                            if (class238.field3854 > var9.field3510 && var9.field3561 != null) {
                                class116 var67 = new class116();
                                var67.field1892 = var9;
                                var67.field1895 = var9.field3561;
                                class52.field790.method1219(false, var67);
                            }
                            if (class15.field235 > var9.field3510 && var9.field3525 != null) {
                                class116 var68 = new class116();
                                var68.field1892 = var9;
                                var68.field1895 = var9.field3525;
                                class52.field790.method1219(false, var68);
                            }
                            if (class267.field4266 > var9.field3510 && var9.field3512 != null) {
                                class116 var69 = new class116();
                                var69.field1892 = var9;
                                var69.field1895 = var9.field3512;
                                class52.field790.method1219(false, var69);
                            }
                            if (class72.field1183 > var9.field3510 && var9.field3474 != null) {
                                class116 var70 = new class116();
                                var70.field1892 = var9;
                                var70.field1895 = var9.field3474;
                                class52.field790.method1219(false, var70);
                            }
                            if (class162.field2539 > var9.field3510 && var9.field3599 != null) {
                                class116 var71 = new class116();
                                var71.field1892 = var9;
                                var71.field1895 = var9.field3599;
                                class52.field790.method1219(false, var71);
                            }
                            var9.field3510 = class275.field4392;
                            if (var9.field3503 != null) {
                                for (int var72 = 0; var72 < class256.field4105; var72++) {
                                    class116 var73 = new class116();
                                    var73.field1892 = var9;
                                    var73.field1894 = class53.field807[var72];
                                    var73.field1900 = class162.field2543[var72];
                                    var73.field1895 = var9.field3503;
                                    class52.field790.method1219(false, var73);
                                }
                            }
                            if (class44.field629 && var9.field3535 != null) {
                                class116 var74 = new class116();
                                var74.field1892 = var9;
                                var74.field1895 = var9.field3535;
                                class52.field790.method1219(false, var74);
                            }
                        }
                    }
                    if (!var9.field3520 && class205.field3205 == null && class268.field4278 == null && !class47.field687) {
                        if ((var9.field3590 >= 0 || var9.field3557 != 0) && class79.field1323 >= var12 && class115.field1883 >= var13 && class79.field1323 < var14 && class115.field1883 < var15) {
                            if (var9.field3590 >= 0) {
                                class209.field3258 = arg0[var9.field3590];
                            } else {
                                class209.field3258 = var9;
                            }
                        }
                        if (var9.field3477 == 8 && class79.field1323 >= var12 && class115.field1883 >= var13 && class79.field1323 < var14 && class115.field1883 < var15) {
                            class295.field4653 = var9;
                        }
                        if (var9.field3513 > var9.field3625) {
                            class52.method385(-25092, var9.field3574 + var10, class115.field1883, var9.field3513, var11, class79.field1323, var9, var9.field3625);
                        }
                    }
                    if (var9.field3477 == 0) {
                        method1052(arg0, var9.field3480, var12, var13, var14, var15, var10 - var9.field3606, var11 - var9.field3523);
                        if (var9.field3498 != null) {
                            method1052(var9.field3498, var9.field3480, var12, var13, var14, var15, var10 - var9.field3606, var11 - var9.field3523);
                        }
                        class251 var75 = (class251) class127.field2007.method285((long) var9.field3480, 13821);
                        if (var75 != null) {
                            class19.method185(var10, (byte) 36, var14, var11, var13, var12, var15, var75.field4041);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static void method1053(byte arg0) {
        field2437 = null;
        field2436 = null;
        if (arg0 > -91) {
            method1056();
        }
        field2435 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1054(int arg0, byte[] arg1) {
        field2427++;
        if (arg0 != 23978) {
            return;
        }
        class88 var3 = new class88(arg1);
        while (true) {
            int var4 = var3.method633(49);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                var3.method645(11596);
                var3.method645(arg0 - 12382);
                var3.method645(11596);
                var3.method645(arg0 ^ 0x70E6);
                var3.method645(11596);
                var3.method645(11596);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1055(int arg0) {
        field2424++;
        if (class39.field551 == 1000 || arg0 != 40) {
            return;
        }
        long var2 = class134.method924(false) - class84.field1417;
        class84.field1417 = class134.method924(false);
        boolean var4 = class176.method1197(arg0 - 11401);
        if (var4 && class148.field2341 && class222.field3412 != null) {
            class222.field3412.method551(arg0 + 1960);
        }
        if ((class39.field551 == 30 || class39.field551 == 10) && (class148.field2351 || class241.field3920 != 0L && class241.field3920 < class134.method924(false))) {
            class118.method829(class33.method262(0), false, class86.field1456, class135.field2101, class148.field2351);
        }
        if (class39.field547 == null) {
            Container var5;
            if (class39.field547 != null) {
                var5 = class39.field547;
            } else if (class47.field685 == null) {
                var5 = class179.field2788.field479;
            } else {
                var5 = class47.field685;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class47.field685 == var5) {
                Insets var8 = class47.field685.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class266.field4249 != var6 || field2439 != var7) {
                if (class32.field477.startsWith("mac")) {
                    field2439 = var7;
                    class266.field4249 = var6;
                } else {
                    class128.method891((byte) 100);
                }
                class241.field3920 = class134.method924(false) + 500L;
            }
        }
        boolean var9 = false;
        if (class88.field1473) {
            class88.field1473 = false;
            var9 = true;
        }
        if (var9) {
            class177.method1199(true);
        }
        if (class39.field551 == 0) {
            class193.method1300(class121.field1949, (byte) 72, class60.field1025, var9, (Color) null);
        } else if (class39.field551 == 5) {
            class205.method1381(false, class228.field3517, false);
        } else if (class39.field551 == 10) {
            class88.method631(false);
        } else if (class39.field551 == 25 || class39.field551 == 28) {
            if (class170.field2645 == 1) {
                if (class159.field2473 < class253.field4057) {
                    class159.field2473 = class253.field4057;
                }
                int var10 = (class159.field2473 - class253.field4057) * 50 / class159.field2473;
                class206.method1384(false, class139.field2125 + "<br>(" + var10 + "%)", 1);
            } else if (class170.field2645 == 2) {
                if (class158.field2462 < class173.field2728) {
                    class158.field2462 = class173.field2728;
                }
                int var11 = (class158.field2462 - class173.field2728) * 50 / class158.field2462 + 50;
                class206.method1384(false, class139.field2125 + "<br>(" + var11 + "%)", 1);
            } else {
                class206.method1384(false, class139.field2125, 1);
            }
        } else if (class39.field551 == 30) {
            class58.method440(var2, 95);
        } else if (class39.field551 == 40) {
            class206.method1384(false, class189.field2934 + "<br>" + class155.field2409, arg0 ^ 0x29);
        }
        if ((class39.field551 == 30 || class39.field551 == 10) && class42.field605 == 0 && !var9) {
            try {
                Graphics var14 = class230.field3651.getGraphics();
                for (int var15 = 0; var15 < class77.field1262; var15++) {
                    if (class85.field1428[var15]) {
                        class249.field4023.method177(var14, class251.field4040[var15], class129.field2025[var15], 8, class115.field1879[var15], class278.field4418[var15]);
                        class85.field1428[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class230.field3651.repaint();
            }
        } else if (class39.field551 != 0) {
            try {
                Graphics var12 = class230.field3651.getGraphics();
                class249.field4023.method182(-11104, 0, 0, var12);
                for (int var13 = 0; var13 < class77.field1262; var13++) {
                    class85.field1428[var13] = false;
                }
            } catch (Exception var17) {
                class230.field3651.repaint();
            }
        }
        if (class150.field2366) {
            class82.method590(arg0 + 13231);
        }
        if (class82.field1385 && class39.field551 == 10 && class75.field1236 != -1) {
            class82.field1385 = false;
            class73.method531((byte) 8, class179.field2788);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1056() {
        if (class116.field1899 != null) {
            for (int var0 = 0; var0 < class116.field1899.length; var0++) {
                for (int var1 = 0; var1 < class142.field2166; var1++) {
                    for (int var2 = 0; var2 < class280.field4424; var2++) {
                        class116.field1899[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class52.field798 != null) {
            for (int var3 = 0; var3 < class52.field798.length; var3++) {
                for (int var4 = 0; var4 < class142.field2166; var4++) {
                    for (int var5 = 0; var5 < class280.field4424; var5++) {
                        class52.field798[var3][var4][var5] = null;
                    }
                }
            }
        }
        class196.field3099 = 0;
        if (class41.field590 != null) {
            for (int var6 = 0; var6 < class196.field3099; var6++) {
                class41.field590[var6] = null;
            }
        }
        if (class199.field3125 != null) {
            for (int var7 = 0; var7 < class160.field2480; var7++) {
                class199.field3125[var7] = null;
            }
            class160.field2480 = 0;
        }
        if (class110.field1803 != null) {
            for (int var8 = 0; var8 < class110.field1803.length; var8++) {
                class110.field1803[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1057(int arg0, int arg1) {
        class240.field3903.field3693++;
        if (arg0 != -4286) {
            return;
        }
        class125.field1974 = null;
        class240.field3903.field3691 = arg1;
        class88.field1518 = null;
        field2433++;
        class98.field1645 = 0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1058(int arg0) {
        field2422++;
        if (class240.field3903.field3693 > class15.field237) {
            class41.field598 = (class240.field3903.field3693 - 1) * 250;
            if (class88.field1539 == class177.field2773) {
                class177.field2773 = class184.field2845;
            } else {
                class177.field2773 = class88.field1539;
            }
            if (class41.field598 > 3000) {
                class41.field598 = 3000;
            }
            if (class240.field3903.field3693 >= 2 && class240.field3903.field3691 == 6) {
                this.method1790((byte) -117, "js5connect_outofdate");
                class39.field551 = 1000;
                return;
            }
            if (class240.field3903.field3693 >= 4 && class240.field3903.field3691 == -1) {
                this.method1790((byte) -126, "js5crc");
                class39.field551 = 1000;
                return;
            }
            if (class240.field3903.field3693 >= 4 && (class39.field551 == 0 || class39.field551 == 5)) {
                if (class240.field3903.field3691 == 7 || class240.field3903.field3691 == 9) {
                    this.method1790((byte) 54, "js5connect_full");
                } else if (class240.field3903.field3691 > 0) {
                    this.method1790((byte) 111, "js5connect");
                } else {
                    this.method1790((byte) -109, "js5io");
                }
                class39.field551 = 1000;
                return;
            }
        }
        class15.field237 = class240.field3903.field3693;
        if (class41.field598 > 0) {
            class41.field598--;
            return;
        }
        try {
            if (arg0 != -23433) {
                this.method1058(15);
            }
            if (class98.field1645 == 0) {
                class125.field1974 = class179.field2788.method246(class173.field2719, class177.field2773, false);
                class98.field1645++;
            }
            if (class98.field1645 == 1) {
                if (class125.field1974.field1255 == 2) {
                    this.method1057(arg0 + 19147, 1000);
                    return;
                }
                if (class125.field1974.field1255 == 1) {
                    class98.field1645++;
                }
            }
            if (class98.field1645 == 2) {
                class88.field1518 = new class130((Socket) class125.field1974.field1258, class179.field2788);
                class88 var2 = new class88(5);
                var2.method654((byte) -105, 15);
                var2.method639(536, (byte) -109);
                class88.field1518.method897(5, var2.field1471, 0, arg0 + 28433);
                class98.field1645++;
                class236.field3831 = class134.method924(false);
            }
            if (class98.field1645 == 3) {
                if (class39.field551 == 0 || class39.field551 == 5 || class88.field1518.method898(37) > 0) {
                    int var3 = class88.field1518.method906(-128);
                    if (var3 != 0) {
                        this.method1057(arg0 + 19147, var3);
                        return;
                    }
                    class98.field1645++;
                } else if (class134.method924(false) - class236.field3831 > 30000L) {
                    this.method1057(-4286, 1001);
                    return;
                }
            }
            if (class98.field1645 == 4) {
                boolean var4 = class39.field551 == 5 || class39.field551 == 10 || class39.field551 == 28;
                class240.field3903.method1550(class88.field1518, !var4, (byte) -125);
                class125.field1974 = null;
                class98.field1645 = 0;
                class88.field1518 = null;
            }
        } catch (IOException var5) {
            this.method1057(-4286, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lre;)Lca;")
    public static final class271 method1059(class228 arg0) {
        class271 var1 = (class271) class286.field4531.method285(((long) arg0.field3480 << 32) + (long) arg0.field3551, 13821);
        return var1 == null ? arg0.field3494 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1060(boolean arg0) {
        field2426++;
        boolean var2 = class240.field3903.method1551(512);
        if (arg0) {
            field2437 = null;
        }
        if (!var2) {
            this.method1058(-23433);
        }
    }
}
