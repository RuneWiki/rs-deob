import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 extends class32 {

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Lv;")
    private static class146 field2590 = class159.method1226((byte) -37, "You can(Wt add yourself to your own ignore list");

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static volatile int field2604 = 0;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Lv;")
    public static class146 field2606 = field2590;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "Lpc;")
    public static class107 field2601 = new class107();

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field2608 = 0;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "[[B")
    public static byte[][] field2610 = new byte[250][];

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field2611 = -1;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Lv;")
    private static class146 field2613 = class159.method1226((byte) -37, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field2593;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
    public int[] field2592;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "[I")
    public int[] field2597;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "[I")
    public int[] field2603;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "[I")
    public static int[] field2612;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "[Lfc;")
    public class39[] field2598;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "[Lfc;")
    public class39[] field2607;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "[Z")
    public static boolean[] field2609;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "[[[B")
    public byte[][][] field2594;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static void method867(int arg0) {
        field2590 = null;
        field2609 = null;
        field2601 = null;
        field2606 = null;
        field2613 = null;
        field2610 = null;
        field2612 = null;
        if (arg0 != 90000) {
            method871(-63, (byte) -120, null);
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static final void method868(int arg0) {
        class6.field137 = class24.field391;
        class116.field2715 = class41.field929;
        class122.field2831 = class120.field2779;
        class124.field2873 = class67.field1524;
        class37.field821 = class108.field2574;
        class20.field308 = class100.field2428;
        class94.field2240 = class38.field841;
        class125.field2905 = client.field336;
        class72.field1657 = class89.field2114;
        class40.field885 = class118.field2740;
        class46.field1060 = class41.field936;
        class40.field913 = class120.field2789;
        class42.field972 = class147.field3401;
        class30.field619 = class120.field2796;
        if (arg0 != -10466) {
            field2590 = null;
        }
        class48.field1096 = class29.field599;
        class119.field2770 = class40.field895;
        class113.field2634 = class101.field2461;
        class54.field1252 = class6.field147;
        class40.field893 = class113.field2648;
        class120.field2791 = class48.field1100;
        class6.field134 = class73.field1696;
        class152.field3501 = class120.field2802;
        class40.field908 = class120.field2789;
        class54.field1250 = class26.field506;
        class40.field879 = class120.field2789;
        class145.field3304 = class157.field3611;
        class26.field463 = class17.field265;
        class31.field658 = class32.field677;
        class40.field906 = class35.field795;
        class138.field3118 = class140.field3203;
        class40.field892 = class118.field2754;
        class158.field3638 = class100.field2422;
        class33.field704 = class115.field2688;
        class57.field1288 = class121.field2808;
        class155.field3539 = class107.field2549;
        class18.field294 = class95.field2255;
        class26.field514 = class134.field3058;
        class18.field295 = class67.field1529;
        class40.field915 = class146.field3344;
        class95.field2259 = class76.field1811;
        class147.field3403 = class142.field3243;
        class40.field877 = class120.field2789;
        class46.field1050 = class143.field3262;
        class98.field2373 = field2613;
        class107.field2559 = class46.field1061;
        class71.field1642 = class2.field46;
        class40.field894 = class120.field2789;
        class42.field950 = class57.field1283;
        class115.field2679 = class123.field2861;
        class103.field2504 = class59.field1326;
        class1.field12 = class100.field2432;
        class40.field927 = class120.field2789;
        class63.field1431 = class59.field1376;
        class95.field2295 = class5.field124;
        class120.field2784 = class117.field2737;
        class75.field1797 = class123.field2856;
        class98.field2368 = class148.field3444;
        class147.field3409 = class17.field262;
        class52.field1183 = class98.field2365;
        class66.field1490 = class49.field1130;
        class116.field2712 = class137.field3114;
        class40.field902 = class54.field1247;
        class100.field2429 = class8.field154;
        class40.field923 = class120.field2789;
        class115.field2682 = class72.field1658;
        class90.field2168 = class135.field3074;
        class3.field82 = class152.field3494;
        class32.field676 = class68.field1561;
        class67.field1530 = class143.field3267;
        class122.field2826 = class140.field3201;
        class40.field888 = class120.field2789;
        class22.field366 = class113.field2645;
        class29.field609 = class44.field995;
        class134.field3063 = class51.field1163;
        class159.field3657 = class42.field958;
        class115.field2687 = class64.field1432;
        class54.field1244 = class87.field2056;
        class18.field283 = class159.field3655;
        class40.field910 = class120.field2789;
        class25.field419 = class120.field2788;
        class40.field916 = class120.field2789;
        class58.field1306 = class138.field3134;
        class40.field875 = class120.field2789;
        class90.field2160 = class58.field1293;
        class98.field2370 = class18.field287;
        class33.field690 = class115.field2688;
        class40.field919 = class118.field2740;
        class105.field2531 = class101.field2451;
        class81.field1977 = class121.field2816;
        class103.field2507 = class92.field2205;
        class40.field872 = class120.field2789;
        class69.field1586 = class54.field1231;
        class155.field3543 = class25.field424;
        class40.field925 = class123.field2853;
        class35.field765 = class118.field2743;
        class146.field3334 = class108.field2575;
        class74.field1767 = class22.field372;
        class122.field2833 = class120.field2779;
        class67.field1519 = class94.field2249;
        field2599++;
        class87.field2062 = class148.field3448;
        class33.field688 = class148.field3429;
        class115.field2680 = class58.field1299;
        class40.field891 = class95.field2266;
        class40.field917 = class120.field2789;
        class111.field2625 = class78.field1900;
        class95.field2298 = class33.field708;
        class40.field924 = class120.field2789;
        class95.field2315 = class42.field957;
        class40.field903 = class120.field2789;
        class40.field874 = class120.field2789;
        class132.field3004 = class145.field3298;
        class132.field3018 = class148.field3430;
        class108.field2573 = class152.field3511;
        class22.field376 = class119.field2768;
        class78.field1887 = class17.field281;
        class88.field2091 = class148.field3431;
        class77.field1827 = class24.field394;
        class103.field2515 = class30.field633;
        class30.field636 = class9.field175;
        class107.field2550 = class155.field3531;
        class82.field2004 = class151.field3487;
        class73.field1699 = class68.field1549;
        class38.field847 = class32.field673;
        class125.field2908 = class98.field2363;
        class141.field3226 = class64.field1450;
        class148.field3436 = class94.field2223;
        class146.field3333 = class33.field696;
        class101.field2445 = class90.field2153;
        class90.field2136 = class58.field1293;
        class155.field3536 = class123.field2855;
        class40.field897 = class54.field1242;
        class89.field2117 = class148.field3438;
        class90.field2170 = class97.field2342;
        class63.field1427 = class15.field236;
        class34.field719 = class98.field2367;
        class38.field859 = class20.field307;
        class25.field409 = class26.field458;
        class108.field2572 = class146.field3366;
        class25.field397 = class123.field2853;
        class107.field2548 = client.field343;
        class40.field909 = class115.field2678;
        class63.field1424 = class40.field873;
        class13.field218 = class121.field2820;
        class60.field1383 = class70.field1632;
        class92.field2204 = class141.field3220;
        class40.field900 = class120.field2789;
        class40.field921 = class91.field2174;
        class87.field2063 = class143.field3279;
        class1.field9 = class38.field858;
        class113.field2639 = class111.field2618;
        class40.field886 = class120.field2789;
        class60.field1384 = class117.field2738;
        class34.field730 = class126.field2923;
        class25.field413 = class123.field2853;
        class24.field393 = class79.field1956;
        class40.field882 = class120.field2789;
        class158.field3636 = class75.field1792;
        class25.field429 = class123.field2853;
        class68.field1559 = class78.field1878;
        class17.field268 = class122.field2838;
        class22.field379 = class73.field1697;
        class17.field267 = class8.field164;
        class22.field371 = class33.field681;
        class79.field1950 = class136.field3094;
        class57.field1287 = class71.field1641;
        class25.field399 = class26.field458;
        class79.field1944 = class115.field2684;
        class148.field3441 = class72.field1676;
        class148.field3460 = class22.field374;
        class118.field2745 = class34.field715;
        class48.field1098 = class49.field1137;
        class148.field3450 = class94.field2223;
        class72.field1673 = class116.field2709;
        class40.field883 = class120.field2789;
        class40.field890 = class120.field2789;
        class13.field206 = class15.field235;
        class147.field3408 = class116.field2711;
        class150.field3478 = class116.field2692;
        class40.field918 = class122.field2837;
        class122.field2849 = class103.field2511;
        class34.field724 = class120.field2789;
        class12.field193 = class37.field836;
        class122.field2844 = class76.field1812;
        class97.field2340 = class70.field1631;
        class140.field3210 = class26.field507;
        class33.field695 = class145.field3318;
        class121.field2813 = client.field333;
        field2606 = class136.field3097;
        class75.field1793 = class145.field3326;
        class40.field880 = class95.field2266;
        class31.field647 = class32.field677;
        class122.field2823 = class140.field3201;
        class95.field2318 = class33.field699;
        class122.field2830 = class147.field3406;
        class49.field1134 = class1.field5;
        class44.field1004 = class29.field613;
        if (class52.field1207) {
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILie;IZII)V")
    public static final void method869(int arg0, class61 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            method869(-101, null, -112, false, -66, -97);
        }
        int var6 = arg0 * arg0 + arg4 * arg4;
        field2591++;
        if (var6 <= 4225 || var6 >= 90000) {
            class26.method170(arg2, arg4, arg5, 5, arg0, arg1);
            return;
        }
        int var7 = class72.field1692 + class18.field296 & 0x7FF;
        int var8 = class45.field1030[var7];
        int var9 = var8 * 256 / (class32.field667 + 256);
        int var10 = class45.field1032[var7];
        int var11 = var10 * 256 / (class32.field667 + 256);
        int var12 = arg0 * var9 + arg4 * var11 >> 16;
        int var13 = arg0 * var11 - arg4 * var9 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class107.field2566.method424(var16 + arg2 + 94 + 4 - 10, -var17 + -20 + arg5 + 83, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIB)V")
    public static final void method870(int arg0, int arg1, int arg2, byte arg3) {
        field2596++;
        if (class54.field1255 != 0 && arg2 != 0 && class76.field1806 < 50) {
            class81.field1964[class76.field1806] = arg0;
            class98.field2381[class76.field1806] = arg2;
            class77.field1859[class76.field1806] = arg1;
            class81.field1967[class76.field1806] = null;
            class60.field1406[class76.field1806] = 0;
            class76.field1806++;
        }
        if (arg3 < 109) {
            field2604 = 1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLfd;)V")
    public static final void method871(int arg0, byte arg1, class40 arg2) {
        if (arg1 <= 54) {
            return;
        }
        field2605++;
        while (true) {
            class110 var3 = (class110) class148.field3437.method1138(25852);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2595; var5++) {
                if (var3.field2607[var5] != null) {
                    if (var3.field2607[var5].field866 == 2) {
                        var3.field2597[var5] = -5;
                    }
                    if (var3.field2607[var5].field866 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2598[var5] != null) {
                    if (var3.field2598[var5].field866 == 2) {
                        var3.field2597[var5] = -6;
                    }
                    if (var3.field2598[var5].field866 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method265((byte) -85, arg0);
            arg2.method791(false, 0);
            int var6 = arg2.field2304;
            arg2.method788(var3.field2593, -730641264);
            for (int var7 = 0; var7 < var3.field2595; var7++) {
                if (var3.field2597[var7] == 0) {
                    try {
                        int var8 = var3.field2592[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2607[var7].field870;
                            int var13 = var12.getInt(null);
                            arg2.method791(false, 0);
                            arg2.method788(var13, -730641264);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field2607[var7].field870;
                            var9.setInt(null, var3.field2603[var7]);
                            arg2.method791(false, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field2607[var7].field870;
                            int var11 = var10.getModifiers();
                            arg2.method791(false, 0);
                            arg2.method788(var11, -730641264);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2598[var7].field870;
                            byte[][] var17 = var3.field2594[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method791(false, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method791(false, 1);
                                arg2.method746(((Number) var21).longValue(), 1101310632);
                            } else if (var21 instanceof class146) {
                                arg2.method791(false, 2);
                                arg2.method762((class146) var21, (byte) -127);
                            } else {
                                arg2.method791(false, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2598[var7].field870;
                            int var15 = var14.getModifiers();
                            arg2.method791(false, 0);
                            arg2.method788(var15, -730641264);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method791(false, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method791(false, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method791(false, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method791(false, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method791(false, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method791(false, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method791(false, -16);
                    } catch (SecurityException var29) {
                        arg2.method791(false, -17);
                    } catch (IOException var30) {
                        arg2.method791(false, -18);
                    } catch (NullPointerException var31) {
                        arg2.method791(false, -19);
                    } catch (Exception var32) {
                        arg2.method791(false, -20);
                    } catch (Throwable var33) {
                        arg2.method791(false, -21);
                    }
                } else {
                    arg2.method791(false, var3.field2597[var7]);
                }
            }
            arg2.method752(var6, 255);
            arg2.method749(arg2.field2304 - var6, (byte) 95);
            var3.method217(-1264);
        }
    }
}
