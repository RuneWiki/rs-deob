import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lhe;")
    public static class54 field2825 = class6.method58("Sie haben gerade eine andere Welt verlassen)3", false);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lhe;")
    public static class54 field2839 = class6.method58("", false);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field2835 = -1;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lhe;")
    private static class54 field2830 = class6.method58("Please wait 1 minute and try again)3", false);

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lhe;")
    public static class54 field2837 = field2830;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field2828 = 1;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "J")
    public static long field2838 = 0L;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lhe;")
    public static class54 field2833 = class6.method58("mapdots", false);

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Lhe;")
    public static class54 field2847 = class6.method58("compass", false);

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Lhe;")
    public static class54 field2848 = field2830;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lef;")
    public static class35 field2829;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lef;")
    public static class35 field2845;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lhd;")
    public class53 field2824;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lhd;")
    public class53 field2832;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Lhd;")
    public class53 field2844;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "[I")
    public static int[] field2849;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method944(int arg0) {
        field2847 = null;
        field2849 = null;
        field2830 = null;
        field2845 = null;
        if (arg0 > -74) {
            return;
        }
        field2848 = null;
        field2829 = null;
        field2839 = null;
        field2837 = null;
        field2825 = null;
        field2833 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)I")
    public static final int method945(int arg0, int arg1, int arg2) {
        field2826++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 / arg2;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static final void method946(int arg0) {
        if (class151.field3404 > 0) {
            class151.field3404--;
        }
        field2834++;
        if (class111.field2658 > 1) {
            class111.field2658--;
        }
        if (class4.field133) {
            class4.field133 = false;
            class18.method156(-1);
            return;
        }
        for (int var1 = 0; var1 < 100 && class91.method732((byte) 50); var1++) {
        }
        if (class105.field2604 != 30) {
            return;
        }
        class151.method1146(226, (byte) -61, class131.field2969);
        Object var2 = class63.field1543.field2580;
        synchronized (class63.field1543.field2580) {
            if (!class105.field2598) {
                class63.field1543.field2583 = 0;
            } else if (class124.field2854 != 0 || class63.field1543.field2583 >= 40) {
                class138.field3169++;
                int var3 = 0;
                class131.field2969.method454(185, arg0 ^ 0xFFFFFFC4);
                class131.field2969.method649((byte) -27, 0);
                int var4 = class131.field2969.field2076;
                for (int var5 = 0; class63.field1543.field2583 > var5 && class131.field2969.field2076 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class63.field1543.field2582[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class63.field1543.field2584[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class63.field1543.field2582[var5] == -1 && class63.field1543.field2584[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = 524287;
                    }
                    if (class58.field1467 != var7 || class2.field36 != var6) {
                        int var9 = var7 - class58.field1467;
                        class58.field1467 = var7;
                        int var10 = var6 - class2.field36;
                        class2.field36 = var6;
                        if (class118.field2763 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class131.field2969.method629((var9 << 6) + (class118.field2763 << 12) + var10, 2018779304);
                            class118.field2763 = 0;
                        } else if (class118.field2763 < 8) {
                            class131.field2969.method653((class118.field2763 << 19) + var8 + 8388608, 98);
                            class118.field2763 = 0;
                        } else {
                            class131.field2969.method658(181, (class118.field2763 << 19) + var8 - 1073741824);
                            class118.field2763 = 0;
                        }
                    } else if (class118.field2763 < 2047) {
                        class118.field2763++;
                    }
                }
                class131.field2969.method680(class131.field2969.field2076 - var4, (byte) 109);
                if (class63.field1543.field2583 > var3) {
                    class63.field1543.field2583 -= var3;
                    for (int var11 = 0; var11 < class63.field1543.field2583; var11++) {
                        class63.field1543.field2584[var11] = class63.field1543.field2584[var3 + var11];
                        class63.field1543.field2582[var11] = class63.field1543.field2582[var3 + var11];
                    }
                } else {
                    class63.field1543.field2583 = 0;
                }
            }
        }
        if (class124.field2854 != 0) {
            class32.field824++;
            int var12 = class21.field582;
            int var13 = class71.field1763;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 502) {
                var12 = 502;
            }
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 764) {
                var13 = 764;
            }
            int var14 = var12 * 765 + var13;
            byte var15 = 0;
            if (class124.field2854 == 2) {
                var15 = 1;
            }
            long var16 = (field2838 - class84.field2094) / 50L;
            class84.field2094 = field2838;
            if (var16 > 4095L) {
                var16 = 4095L;
            }
            class131.field2969.method454(99, arg0 - 74);
            int var18 = (int) var16;
            class131.field2969.method658(181, (var18 << 20) + (var15 << 19) + var14);
        }
        if (class77.field1872 > 0) {
            class77.field1872--;
        }
        if (class114.field2707[96] || class114.field2707[97] || class114.field2707[98] || class114.field2707[99]) {
            class5.field156 = true;
        }
        if (class5.field156 && class77.field1872 <= 0) {
            class150.field3400++;
            class5.field156 = false;
            class77.field1872 = 20;
            class131.field2969.method454(128, -23);
            class131.field2969.method673(class1.field11, (byte) 53);
            class131.field2969.method629(class91.field2220, 2018779304);
        }
        if (class4.field130 && !class118.field2767) {
            class24.field652++;
            class118.field2767 = true;
            class131.field2969.method454(7, -59);
            class131.field2969.method649((byte) -27, 1);
        }
        if (!class4.field130 && class118.field2767) {
            class24.field652++;
            class118.field2767 = false;
            class131.field2969.method454(7, -94);
            class131.field2969.method649((byte) -27, 0);
        }
        class150.method1140((byte) -71);
        if (class105.field2604 != 30) {
            return;
        }
        class111.method832(-80);
        class103.method805((byte) 120);
        class137.field3131++;
        if (class137.field3131 > 750) {
            class18.method156(-1);
            return;
        }
        class11.method85(-1);
        class121.method934(14931);
        class111.method834(49);
        if (class59.field1489 != 0) {
            class18.field533 += 20;
            if (class18.field533 >= 400) {
                class59.field1489 = 0;
            }
        }
        class52.field1247++;
        if (class87.field2154 != null) {
            class34.field855++;
            if (class34.field855 >= 15) {
                class134.method1005(class87.field2154, 0);
                class87.field2154 = null;
            }
        }
        if (class6.field179 != null) {
            class134.method1005(class6.field179, 0);
            if (class137.field3147 + 5 < class71.field1772 || class71.field1772 < class137.field3147 - 5 || class115.field2727 + 5 < class7.field211 || class115.field2727 - 5 > class7.field211) {
                class141.field3214 = true;
            }
            class5.field165++;
            if (class22.field620 == 0) {
                if (class141.field3214 && class5.field165 >= 5) {
                    if (class79.field1946 == class6.field179 && class66.field1601 != class107.field2614) {
                        class32.field807++;
                        class93 var19 = class6.field179;
                        byte var20 = 0;
                        if (class31.field791 == 1 && var19.field2328 == 206) {
                            var20 = 1;
                        }
                        if (var19.field2280[class66.field1601] <= 0) {
                            var20 = 0;
                        }
                        if (class140.method1084(1, class105.method810(var19, -22389))) {
                            int var21 = class107.field2614;
                            int var22 = class66.field1601;
                            var19.field2280[var22] = var19.field2280[var21];
                            var19.field2317[var22] = var19.field2317[var21];
                            var19.field2280[var21] = -1;
                            var19.field2317[var21] = 0;
                        } else if (var20 == 1) {
                            int var23 = class66.field1601;
                            int var24 = class107.field2614;
                            while (var23 != var24) {
                                if (var23 < var24) {
                                    var19.method742(var24 - 1, 21533, var24);
                                    var24--;
                                } else if (var23 > var24) {
                                    var19.method742(var24 + 1, arg0 ^ 0x541C, var24);
                                    var24++;
                                }
                            }
                        } else {
                            var19.method742(class66.field1601, 21533, class107.field2614);
                        }
                        class131.field2969.method454(121, arg0 - 41);
                        class131.field2969.method640(-110, class66.field1601);
                        class131.field2969.method647(var20, (byte) 97);
                        class131.field2969.method633(class6.field179.field2273, -1387540232);
                        class131.field2969.method646(13421, class107.field2614);
                    }
                } else if ((class156.field3543 == 1 || class79.method599(-86, class67.field1641 - 1)) && class67.field1641 > 2) {
                    class16.method144(-21);
                } else if (class67.field1641 > 0) {
                    class83.method643(0, class67.field1641 - 1);
                }
                class124.field2854 = 0;
                class34.field855 = 10;
                class6.field179 = null;
            }
        }
        class65.field1564 = false;
        class111.field2660 = false;
        class150.field3388 = 0;
        class108.field2638 = null;
        class93 var25 = class64.field1551;
        class93 var26 = class84.field2095;
        class64.field1551 = null;
        class84.field2095 = null;
        while (class99.method792(127) && class150.field3388 < 128) {
            class95.field2420[class150.field3388] = class108.field2635;
            class95.field2409[class150.field3388] = class89.field2194;
            class150.field3388++;
        }
        class9.method74(0, 765, arg0 ^ arg0, class39.field1016, 0, 503, 0, 0);
        class84.field2084++;
        while (true) {
            class100 var27;
            class93 var28;
            class93 var29;
            do {
                var27 = (class100) class26.field702.method980(-2);
                if (var27 == null) {
                    while (true) {
                        class100 var30;
                        class93 var31;
                        class93 var32;
                        do {
                            var30 = (class100) class34.field843.method980(-2);
                            if (var30 == null) {
                                while (true) {
                                    class100 var33;
                                    class93 var34;
                                    class93 var35;
                                    do {
                                        var33 = (class100) class5.field148.method980(-2);
                                        if (var33 == null) {
                                            if (class133.field3017 != null) {
                                                class94.method752(-109);
                                            }
                                            if (class136.field3103 != -1) {
                                                int var36 = class136.field3103;
                                                int var37 = class136.field3096;
                                                boolean var38 = class121.method935(0, class108.field2639.field951[0], var37, var36, 0, 0, true, 0, 0, 0, 0, class108.field2639.field952[0]);
                                                class136.field3103 = -1;
                                                if (var38) {
                                                    class2.field37 = class21.field582;
                                                    class111.field2683 = class71.field1763;
                                                    class18.field533 = 0;
                                                    class59.field1489 = 1;
                                                }
                                            }
                                            class26.method199((byte) 48);
                                            if (class64.field1551 != var25) {
                                                if (var25 != null) {
                                                    class134.method1005(var25, 0);
                                                }
                                                if (class64.field1551 != null) {
                                                    class134.method1005(class64.field1551, 0);
                                                }
                                            }
                                            if (class84.field2095 != var26 && class8.field248 == class151.field3403) {
                                                if (var26 != null) {
                                                    class134.method1005(var26, arg0 ^ 0x1);
                                                }
                                                if (class84.field2095 != null) {
                                                    class134.method1005(class84.field2095, 0);
                                                }
                                            }
                                            if (class84.field2095 == null) {
                                                if (class151.field3403 > 0) {
                                                    class151.field3403--;
                                                }
                                            } else if (class151.field3403 < class8.field248) {
                                                class151.field3403++;
                                                if (class8.field248 == class151.field3403) {
                                                    class134.method1005(class84.field2095, arg0 ^ 0x1);
                                                }
                                            }
                                            class49.method350((byte) 104);
                                            if (class50.field1206) {
                                                class151.method1145((byte) 108);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class108.field2632[var39]++;
                                            }
                                            int var40 = class78.method598(arg0 ^ 0x9);
                                            int var41 = class63.method500(-10051);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class144.field3285++;
                                                class151.field3404 = 250;
                                                class56.method435(4000, (byte) 55);
                                                class131.field2969.method454(230, -101);
                                            }
                                            class155.field3499++;
                                            class73.field1812++;
                                            if (class73.field1812 > 500) {
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x4) == 4) {
                                                    class112.field2698 += class27.field725;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class141.field3207 += class65.field1568;
                                                }
                                                class73.field1812 = 0;
                                                if ((var42 & 0x2) == 2) {
                                                    class44.field1137 += class146.field3303;
                                                }
                                            }
                                            if (class141.field3207 < -50) {
                                                class65.field1568 = 2;
                                            }
                                            class52.field1244++;
                                            if (class112.field2698 < -40) {
                                                class27.field725 = 1;
                                            }
                                            if (class141.field3207 > 50) {
                                                class65.field1568 = -2;
                                            }
                                            if (class155.field3499 > 500) {
                                                int var43 = (int) (Math.random() * 8.0D);
                                                class155.field3499 = 0;
                                                if ((var43 & 0x1) == 1) {
                                                    class63.field1533 += class70.field1752;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class40.field1050 += class79.field1935;
                                                }
                                            }
                                            if (class44.field1137 < -55) {
                                                class146.field3303 = 2;
                                            }
                                            if (class63.field1533 < -60) {
                                                class70.field1752 = 2;
                                            }
                                            if (class63.field1533 > 60) {
                                                class70.field1752 = -2;
                                            }
                                            if (class112.field2698 > 40) {
                                                class27.field725 = -1;
                                            }
                                            if (class44.field1137 > 55) {
                                                class146.field3303 = -2;
                                            }
                                            if (class40.field1050 < -20) {
                                                class79.field1935 = 1;
                                            }
                                            if (class40.field1050 > 10) {
                                                class79.field1935 = -1;
                                            }
                                            if (class52.field1244 > 50) {
                                                class131.field2969.method454(202, -96);
                                                class58.field1471++;
                                            }
                                            try {
                                                if (class142.field3236 != null && class131.field2969.field2076 > 0) {
                                                    class142.field3236.method1132(class131.field2969.field2076, 0, arg0 ^ 0x7D, class131.field2969.field2055);
                                                    class52.field1244 = 0;
                                                    class131.field2969.field2076 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class18.method156(-1);
                                                return;
                                            }
                                        }
                                        var34 = var33.field2537;
                                        if (var34.field2264 < 0) {
                                            break;
                                        }
                                        var35 = class121.method938(true, var34.field2284);
                                    } while (var35 == null || var35.field2316 == null || var35.field2316.length <= var34.field2264 || var35.field2316[var34.field2264] != var34);
                                    class32.method242(1, var33);
                                }
                            }
                            var31 = var30.field2537;
                            if (var31.field2264 < 0) {
                                break;
                            }
                            var32 = class121.method938(true, var31.field2284);
                        } while (var32 == null || var32.field2316 == null || var32.field2316.length <= var31.field2264 || var32.field2316[var31.field2264] != var31);
                        class32.method242(1, var30);
                    }
                }
                var28 = var27.field2537;
                if (var28.field2264 < 0) {
                    break;
                }
                var29 = class121.method938(true, var28.field2284);
            } while (var29 == null || var29.field2316 == null || var28.field2264 >= var29.field2316.length || var29.field2316[var28.field2264] != var28);
            class32.method242(arg0, var27);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIIII)V")
    public static final void method947(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class90.method714(arg1, arg3, arg1 + arg2, arg3 + arg4);
        class152.method1152();
        class80.field1951++;
        class74.method574(111, true);
        class73.method567(true, 12981);
        class74.method574(94, false);
        class73.method567(arg0, 12981);
        field2840++;
        class38.method285((byte) 10);
        class50.method357((byte) 103);
        if (!class50.field1206) {
            int var5 = class1.field11;
            if (var5 < class147.field3319 / 256) {
                var5 = class147.field3319 / 256;
            }
            int var6 = class91.field2220 + class112.field2698 & 0x7FF;
            if (class6.field181[4] && class16.field487[4] + 128 > var5) {
                var5 = class16.field487[4] + 128;
            }
            class32.method239(var5, class120.field2792, class134.method1007(class108.field2639.field974, class108.field2639.field971, true, class157.field3573) - 50, var5 * 3 + 600, class99.field2519, var6, (byte) 76);
        }
        int var7;
        if (class50.field1206) {
            var7 = class89.method709((byte) 123);
        } else {
            var7 = class39.method293(0);
        }
        int var8 = class95.field2418;
        int var9 = class11.field315;
        int var10 = class65.field1561;
        int var11 = class93.field2277;
        int var12 = class39.field1025;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class6.field181[var13]) {
                int var16 = (int) ((double) -class151.field3412[var13] + (double) (class151.field3412[var13] * 2 + 1) * Math.random() + Math.sin((double) class115.field2729[var13] / 100.0D * (double) class108.field2632[var13]) * (double) class16.field487[var13]);
                if (var13 == 0) {
                    class11.field315 += var16;
                }
                if (var13 == 3) {
                    class39.field1025 = class39.field1025 + var16 & 0x7FF;
                }
                if (var13 == 2) {
                    class65.field1561 += var16;
                }
                if (var13 == 1) {
                    class93.field2277 += var16;
                }
                if (var13 == 4) {
                    class95.field2418 += var16;
                    if (class95.field2418 < 128) {
                        class95.field2418 = 128;
                    }
                    if (class95.field2418 > 383) {
                        class95.field2418 = 383;
                    }
                }
            }
        }
        int var14 = class71.field1772;
        int var15 = class7.field211;
        if (arg1 <= var14 && arg1 + arg2 > var14 && var15 >= arg3 && arg3 + arg4 > var15) {
            class98.field2493 = class71.field1772 - arg1;
            class98.field2486 = class7.field211 - arg3;
            class98.field2495 = 0;
            class98.field2490 = true;
        } else {
            class98.field2490 = false;
            class98.field2495 = 0;
        }
        class78.method595((byte) 0);
        class90.method710(arg1, arg3, arg2, arg4, 0);
        class78.method595((byte) 0);
        class74.field1831.method1038(class11.field315, class93.field2277, class65.field1561, class95.field2418, class39.field1025, var7);
        class78.method595((byte) 0);
        class74.field1831.method1057();
        class14.method116(arg1, arg3, arg2, (byte) -78, arg4);
        class15.method139(arg1, arg3, -27222);
        ((class66) class152.field3422).method512(class52.field1247, (byte) -118);
        class49.method349(arg2, arg1, 20, arg3, arg4);
        class65.field1561 = var10;
        class39.field1025 = var12;
        class95.field2418 = var8;
        class93.field2277 = var11;
        class11.field315 = var9;
        if (class66.field1610 && class28.method210(false, -104, true) == 0) {
            class66.field1610 = false;
        }
        if (class66.field1610) {
            class90.method710(arg1, arg3, arg2, arg4, 0);
            class35.method256(false, class12.field334, (byte) -126);
        }
        if (!class66.field1610 && !class133.field3007 && arg1 <= var14 && var14 < arg1 + arg2 && var15 >= arg3 && var15 < arg3 + arg4) {
            class28.method215(arg3, var15, (byte) 64, arg1, var14);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI[B)Lhe;")
    public static final class54 method948(int arg0, byte arg1, int arg2, byte[] arg3) {
        field2836++;
        class54 var4 = new class54();
        var4.field1323 = new byte[arg0];
        var4.field1325 = 0;
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field1323[var4.field1325++] = arg3[var5];
            }
        }
        if (arg1 != 73) {
            method948(-106, (byte) 80, 28, null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lhe;ZILhe;Lhe;)V")
    public static final void method949(class54 arg0, boolean arg1, int arg2, class54 arg3, class54 arg4) {
        if (arg1) {
            field2849 = null;
        }
        field2842++;
        for (int var5 = 99; var5 > 0; var5--) {
            class34.field853[var5] = class34.field853[var5 - 1];
            class26.field706[var5] = class26.field706[var5 - 1];
            class14.field394[var5] = class14.field394[var5 - 1];
            class75.field1861[var5] = class75.field1861[var5 - 1];
        }
        class34.field853[0] = arg2;
        class26.field706[0] = arg0;
        class14.field394[0] = arg4;
        class75.field1861[0] = arg3;
        class134.field3024 = class84.field2084;
        class155.field3508++;
    }
}
