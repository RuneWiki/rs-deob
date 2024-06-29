import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class164 extends class161 {

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lp;")
    private static class280 field2872 = class18.method140((byte) -124, "Please wait)3)3)3");

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Lp;")
    public static class280 field2878 = class18.method140((byte) -125, "1");

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lp;")
    public static class280 field2875 = field2872;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Z")
    public static boolean field2883 = false;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "[Lp;")
    public static class280[] field2884 = new class280[100];

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field2886 = 0;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Ltg;")
    public static class180 field2876;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII[Lua;IIIII)V")
    public static final void method1154(int arg0, int arg1, int arg2, int arg3, class113[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class151.method1061(arg3, arg6, arg5, arg9);
        class146.method1022();
        field2881++;
        for (int var10 = arg8; var10 < arg4.length; var10++) {
            class113 var11 = arg4[var10];
            if (var11 != null && (var11.field1998 == arg1 || arg1 == -1412584499 && class57.field927 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class169.field2958[class31.field585] = var11.field1900 + arg2;
                    class232.field4052[class31.field585] = var11.field1897 + arg7;
                    class91.field1478[class31.field585] = var11.field1869;
                    class14.field278[class31.field585] = var11.field1995;
                    var12 = class31.field585++;
                } else {
                    var12 = arg0;
                }
                var11.field1977 = var12;
                var11.field1866 = class117.field2104;
                if (!var11.field2008 || !client.method1101(var11)) {
                    if (var11.field1899 > 0) {
                        class145.method1000(arg8 + 324, var11);
                    }
                    int var13 = var11.field1897 + arg7;
                    int var14 = var11.field1978;
                    int var15 = var11.field1900 + arg2;
                    if (class250.field4377 && (client.method1099(var11) != 0 || var11.field1879 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class57.field927 == var11) {
                        if (arg1 != -1412584499 && !var11.field1973) {
                            class3.field105 = arg2;
                            class101.field1640 = arg4;
                            class199.field3479 = arg7;
                            continue;
                        }
                        if (!var11.field1973) {
                            var14 = 128;
                        }
                        if (field2883 && class224.field3864) {
                            int var16 = class229.field3957;
                            int var17 = var16 - class108.field1783;
                            if (class283.field4974 > var17) {
                                var17 = class283.field4974;
                            }
                            int var18 = class154.field2673;
                            if (class283.field4974 + class264.field4657.field1869 < var11.field1869 + var17) {
                                var17 = class283.field4974 + class264.field4657.field1869 - var11.field1869;
                            }
                            var15 = var17;
                            int var19 = var18 - class109.field1797;
                            if (var19 < class12.field254) {
                                var19 = class12.field254;
                            }
                            if (var11.field1995 + var19 > class12.field254 + class264.field4657.field1995) {
                                var19 = class264.field4657.field1995 + class12.field254 - var11.field1995;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field1879 == 2) {
                        var20 = arg6;
                        var23 = arg3;
                        var25 = arg5;
                        var24 = arg9;
                    } else {
                        var20 = arg6 >= var13 ? arg6 : var13;
                        int var21 = var11.field1995 + var13;
                        int var22 = var11.field1869 + var15;
                        var23 = arg3 < var15 ? var15 : arg3;
                        if (var11.field1879 == 9) {
                            var21++;
                            var22++;
                        }
                        var24 = var21 < arg9 ? var21 : arg9;
                        var25 = var22 >= arg5 ? arg5 : var22;
                    }
                    if (!var11.field2008 || var25 > var23 && var24 > var20) {
                        if (var11.field1899 != 0) {
                            if (var11.field1899 == 1337) {
                                class54.field891 = var13;
                                class157.field2740 = var11;
                                class157.field2754 = var15;
                                class192.method1328((byte) 114, var13, var15, var11.field1995, var11.field1869, var11.field1899 == 1403);
                                class151.method1061(arg3, arg6, arg5, arg9);
                                continue;
                            }
                            if (var11.field1899 == 1338) {
                                if (!var11.method800(-1)) {
                                    continue;
                                }
                                class160.method1141(var11, var13, var12, (byte) 120, var15);
                                class151.method1061(arg3, arg6, arg5, arg9);
                                if (class205.field3563 != 0 && class205.field3563 != 3 || class31.field582 || class30.field573 < var23 || var20 > class23.field416 || var25 <= class30.field573 || var24 <= class23.field416) {
                                    continue;
                                }
                                int var26 = class30.field573 - var15;
                                int var27 = class23.field416 - var13;
                                int var28 = var11.field1999[var27];
                                if (var28 > var26 || var26 > var11.field2011[var27] + var28) {
                                    continue;
                                }
                                int var29 = var26 - var11.field1869 / 2;
                                int var30 = var27 - var11.field1995 / 2;
                                int var31 = class273.field4756 + class25.field487 & 0x7FF;
                                int var32 = class146.field2541[var31];
                                int var33 = class146.field2545[var31];
                                int var34 = (class142.field2461 + 256) * var32 >> 8;
                                int var35 = (class142.field2461 + 256) * var33 >> 8;
                                int var36 = var30 * var35 + (var29 * var34) >> 11;
                                int var37 = var30 * var34 - (var29 * var35) >> 11;
                                int var38 = class262.field4631.field4791 + var36 >> 7;
                                int var39 = class262.field4631.field4793 - var37 >> 7;
                                if (class263.field4647 && (class167.field2931 & 0x40) != 0) {
                                    class113 var40 = class224.method1509(class235.field4098, class28.field529, (byte) 98);
                                    if (var40 == null) {
                                        class34.method286((byte) -124);
                                    } else {
                                        class184.method1276(var38, class90.field1473, arg8 ^ 0x194F, (short) 41, -1, 1L, class210.field3612, var39);
                                    }
                                    continue;
                                }
                                if (class283.field4992 == 1) {
                                    class184.method1276(var38, class230.field3988, 6479, (short) 21, -1, 1L, class229.field3959, var39);
                                }
                                class184.method1276(var38, class18.field337, 6479, (short) 33, -1, 1L, class229.field3959, var39);
                                continue;
                            }
                            if (var11.field1899 == 1339) {
                                if (var11.method800(~arg8)) {
                                    class82.method595(var11, var12, var13, (byte) 60, var15);
                                    class151.method1061(arg3, arg6, arg5, arg9);
                                }
                                continue;
                            }
                            if (var11.field1899 == 1400) {
                                class226.method1522(var11.field1869, var13, var15, (byte) -39, var11.field1995);
                                class207.field3583[var12] = true;
                                class120.field2130[var12] = true;
                                class151.method1061(arg3, arg6, arg5, arg9);
                                continue;
                            }
                            if (var11.field1899 == 1401) {
                                class266.method1788(var11.field1869, -46, var15, var11.field1995, var13);
                                class207.field3583[var12] = true;
                                class120.field2130[var12] = true;
                                class151.method1061(arg3, arg6, arg5, arg9);
                                continue;
                            }
                            if (var11.field1899 == 1402) {
                                class204.method1389(255, var13, var15);
                                class207.field3583[var12] = true;
                                class120.field2130[var12] = true;
                                continue;
                            }
                            if (var11.field1899 == 1405) {
                                if (!class226.field3894) {
                                    continue;
                                }
                                int var41 = var11.field1869 + var15;
                                int var42 = var13 + 15;
                                class101.field1651.method525(class30.method266(new class280[] { class29.field537, class249.method1685((byte) -119, class189.field3316) }, (byte) -87), var41, var42, 16776960, -1);
                                int var43 = 16776960;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                int var46 = 0;
                                int var130 = var42 + 15;
                                int var47 = 0;
                                int var48 = 0;
                                if (var45 > 65536) {
                                    var43 = 16711680;
                                }
                                class101.field1651.method525(class30.method266(new class280[] { class66.field1095, class249.method1685((byte) -100, var45), class37.field665 }, (byte) -87), var41, var130, var43, -1);
                                int var49 = 16776960;
                                var42 = var130 + 15;
                                for (int var50 = 0; var50 < 28; var50++) {
                                    var46 += class267.field4696[var50].method1544((byte) -30);
                                    var48 += class267.field4696[var50].method1545(-51);
                                    var47 += class267.field4696[var50].method1551(-49);
                                }
                                int var51 = var47 * 100 / var46;
                                int var52 = var48 * 10000 / var46;
                                class280 var53 = class30.method266(new class280[] { class31.field579, class149.method1033(0, false, (long) var52, 2, true), class257.field4542, class249.method1685((byte) 87, var51), class9.field208 }, (byte) -87);
                                class181.field3161.method525(var53, var41, var42, var49, -1);
                                var42 += 12;
                                class207.field3583[var12] = true;
                                class120.field2130[var12] = true;
                                continue;
                            }
                            if (var11.field1899 == 1406) {
                                class2.field83 = var11;
                                class131.field2336 = var15;
                                class98.field1595 = var13;
                                continue;
                            }
                        }
                        if (!class31.field582) {
                            if (var11.field1879 == 0 && var11.field1942 && class30.field573 >= var23 && var20 <= class23.field416 && class30.field573 < var25 && var24 > class23.field416 && !class250.field4377) {
                                class157.field2745 = 1;
                                class123.field2161[0] = class277.field4808;
                                class197.field3441[0] = class248.field4345;
                                class275.field4765[0] = 1002;
                                class258.field4566[0] = class229.field3959;
                            }
                            if (class30.field573 >= var23 && var20 <= class23.field416 && var25 > class30.field573 && var24 > class23.field416) {
                                class103.method725(class30.field573 - var15, -var13 + class23.field416, ~arg8, var11);
                            }
                        }
                        if (var11.field1879 == 0) {
                            if (!var11.field2008 && client.method1101(var11) && class185.field3251 != var11) {
                                continue;
                            }
                            if (!var11.field2008) {
                                if ((var11.field1875 - var11.field1995) < var11.field2025) {
                                    var11.field2025 = var11.field1875 - var11.field1995;
                                }
                                if (var11.field2025 < 0) {
                                    var11.field2025 = 0;
                                }
                            }
                            method1154(var12, var11.field1964, var15 - var11.field1877, var23, arg4, var25, var20, var13 - var11.field2025, arg8, var24);
                            if (var11.field1865 != null) {
                                method1154(var12, var11.field1964, var15 - var11.field1877, var23, var11.field1865, var25, var20, var13 - var11.field2025, 0, var24);
                            }
                            class144 var54 = (class144) class261.field4614.method150((long) var11.field1964, 108);
                            if (var54 != null) {
                                if (var54.field2519 == 0 && !class31.field582 && class30.field573 >= var23 && var20 <= class23.field416 && class30.field573 < var25 && class23.field416 < var24 && !class250.field4377) {
                                    class275.field4765[0] = 1002;
                                    class123.field2161[0] = class277.field4808;
                                    class157.field2745 = 1;
                                    class197.field3441[0] = class248.field4345;
                                    class258.field4566[0] = class229.field3959;
                                }
                                class175.method1201(var23, var54.field2517, var13, var20, var15, -8648, var24, var25, var12);
                            }
                            class151.method1061(arg3, arg6, arg5, arg9);
                            class146.method1022();
                        }
                        if (class255.field4515[var12] || class201.field3522 > 1) {
                            if (var11.field1879 == 0 && !var11.field2008 && var11.field1875 > var11.field1995) {
                                class15.method121(var11.field1875, 3748, var11.field1869 + var15, var13, var11.field2025, var11.field1995);
                            }
                            if (var11.field1879 != 1) {
                                if (var11.field1879 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field1957; var56++) {
                                        for (int var57 = 0; var57 < var11.field2005; var57++) {
                                            int var58 = (var11.field1876 + 32) * var56 + var13;
                                            int var59 = var15 + ((var11.field1878 + 32) * var57);
                                            if (var55 < 20) {
                                                var58 += var11.field1959[var55];
                                                var59 += var11.field2018[var55];
                                            }
                                            if (var11.field1889[var55] > 0) {
                                                int var61 = var11.field1889[var55] - 1;
                                                boolean var62 = false;
                                                boolean var63 = false;
                                                if (var59 + 32 > arg3 && arg5 > var59 && arg6 < var58 + 32 && arg9 > var58 || class221.field3837 == var11 && class44.field732 == var55) {
                                                    class108 var64;
                                                    if (class112.field1836 == 1 && class35.field647 == var55 && class268.field4704 == var11.field1964) {
                                                        var64 = class127.method879(var61, 0, var11.field1916, var11.field1951[var55], 2, arg8 ^ 0xFFFFFF94);
                                                    } else {
                                                        var64 = class127.method879(var61, 3153952, var11.field1916, var11.field1951[var55], 1, arg8 - 94);
                                                    }
                                                    if (class146.field2552) {
                                                        class207.field3583[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class242.method1642((byte) 116, var11);
                                                    } else if (class221.field3837 == var11 && class44.field732 == var55) {
                                                        int var65 = class154.field2673 - class128.field2233;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        int var66 = class229.field3957 - class278.field4874;
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class230.field3978 < 5) {
                                                            var65 = 0;
                                                            var66 = 0;
                                                        }
                                                        var64.method759(var59 + var66, var58 + var65, 128);
                                                        if (arg1 != -1) {
                                                            class113 var67 = arg4[arg1 & 0xFFFF];
                                                            int var68 = class151.field2612;
                                                            int var69 = class151.field2614;
                                                            if (var68 > (var58 + var65) && var67.field2025 > 0) {
                                                                int var70 = (var68 - var58 - var65) * class165.field2889 / 3;
                                                                if (var70 > (class165.field2889 * 10)) {
                                                                    var70 = class165.field2889 * 10;
                                                                }
                                                                if (var67.field2025 < var70) {
                                                                    var70 = var67.field2025;
                                                                }
                                                                class128.field2233 += var70;
                                                                var67.field2025 -= var70;
                                                                class242.method1642((byte) 43, var67);
                                                            }
                                                            if (var69 < (var58 + var65 + 32) && var67.field1875 - var67.field1995 > var67.field2025) {
                                                                int var71 = (var58 + var65 + (32 - var69)) * class165.field2889 / 3;
                                                                if (var71 > (class165.field2889 * 10)) {
                                                                    var71 = class165.field2889 * 10;
                                                                }
                                                                if (var71 > var67.field1875 - var67.field2025 - var67.field1995) {
                                                                    var71 = var67.field1875 - var67.field1995 - var67.field2025;
                                                                }
                                                                class128.field2233 -= var71;
                                                                var67.field2025 += var71;
                                                                class242.method1642((byte) 22, var67);
                                                            }
                                                        }
                                                    } else if (class206.field3575 == var11 && class227.field3915 == var55) {
                                                        var64.method759(var59, var58, 128);
                                                    } else {
                                                        var64.method758(var59, var58);
                                                    }
                                                }
                                            } else if (var11.field1914 != null && var55 < 20) {
                                                class108 var60 = var11.method789(-24340, var55);
                                                if (var60 != null) {
                                                    var60.method758(var59, var58);
                                                } else if (class180.field3141) {
                                                    class242.method1642((byte) 124, var11);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field1879 == 3) {
                                    int var72;
                                    if (class259.method1752((byte) -117, var11)) {
                                        var72 = var11.field1969;
                                        if (class185.field3251 == var11 && var11.field2012 != 0) {
                                            var72 = var11.field2012;
                                        }
                                    } else {
                                        var72 = var11.field1921;
                                        if (class185.field3251 == var11 && var11.field2026 != 0) {
                                            var72 = var11.field2026;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field1986) {
                                            class151.method1057(var15, var13, var11.field1869, var11.field1995, var72);
                                        } else {
                                            class151.method1060(var15, var13, var11.field1869, var11.field1995, var72);
                                        }
                                    } else if (var11.field1986) {
                                        class151.method1049(var15, var13, var11.field1869, var11.field1995, var72, 256 - (var14 & 0xFF));
                                    } else {
                                        class151.method1051(var15, var13, var11.field1869, var11.field1995, var72, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field1879 == 4) {
                                    class72 var73 = var11.method803(-80, class108.field1777);
                                    if (var73 != null) {
                                        class280 var74 = var11.field2017;
                                        int var75;
                                        if (class259.method1752((byte) -117, var11)) {
                                            var75 = var11.field1969;
                                            if (class185.field3251 == var11 && var11.field2012 != 0) {
                                                var75 = var11.field2012;
                                            }
                                            if (var11.field1880.method1889(arg8 - 1) > 0) {
                                                var74 = var11.field1880;
                                            }
                                        } else {
                                            var75 = var11.field1921;
                                            if (class185.field3251 == var11 && var11.field2026 != 0) {
                                                var75 = var11.field2026;
                                            }
                                        }
                                        if (var11.field2008 && var11.field1983 != -1) {
                                            class220 var76 = class23.method177((byte) -106, var11.field1983);
                                            var74 = var76.field3818;
                                            if (var74 == null) {
                                                var74 = class20.field374;
                                            }
                                            if ((var76.field3805 == 1 || var11.field1993 != 1) && var11.field1993 != -1) {
                                                var74 = class30.method266(new class280[] { class173.field3015, var74, class233.field4063, class259.method1751(var11.field1993, 59) }, (byte) -87);
                                            }
                                        }
                                        if (class180.field3157 == var11) {
                                            var74 = field2875;
                                            var75 = var11.field1921;
                                        }
                                        if (!var11.field2008) {
                                            var74 = class244.method1660(var11, 1, var74);
                                        }
                                        var73.method530(var74, var15, var13, var11.field1869, var11.field1995, var75, var11.field1958 ? 0 : -1, var11.field1872, var11.field1868, var11.field1883);
                                    } else if (class180.field3141) {
                                        class242.method1642((byte) 21, var11);
                                    }
                                } else if (var11.field1879 == 5) {
                                    if (var11.field2008) {
                                        class108 var77;
                                        if (var11.field1983 == -1) {
                                            var77 = var11.method799(false, (byte) -13);
                                        } else {
                                            var77 = class127.method879(var11.field1983, var11.field1966, var11.field1916, var11.field1993, var11.field1981, -97);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field1788;
                                            int var79 = var77.field1780;
                                            if (var11.field1902) {
                                                int var81 = (var11.field1869 + var78 - 1) / var78;
                                                int var82 = (var11.field1995 + var79 - 1) / var79;
                                                class151.method1059(var15, var13, var11.field1869 + var15, var13 - -var11.field1995);
                                                for (int var83 = 0; var83 < var81; var83++) {
                                                    for (int var84 = 0; var84 < var82; var84++) {
                                                        if (var11.field2006 != 0) {
                                                            var77.method754(var11.field2006, 4096, 903091299, var79 / 2 + var79 * var84 + var13, var78 / 2 + var78 * var83 + var15);
                                                        } else if (var14 == 0) {
                                                            var77.method758(var15 + (var78 * var83), var79 * var84 + var13);
                                                        } else {
                                                            var77.method759(var78 * var83 + var15, var79 * var84 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class151.method1061(arg3, arg6, arg5, arg9);
                                            } else {
                                                int var80 = var11.field1869 * 4096 / var78;
                                                if (var11.field2006 != 0) {
                                                    var77.method754(var11.field2006, var80, arg8 + 903091299, var11.field1995 / 2 + var13, var11.field1869 / 2 + var15);
                                                } else if (var14 != 0) {
                                                    var77.method757(var15, var13, var11.field1869, var11.field1995, 256 - (var14 & 0xFF));
                                                } else if (var11.field1869 == var78 && var11.field1995 == var79) {
                                                    var77.method758(var15, var13);
                                                } else {
                                                    var77.method760(var15, var13, var11.field1869, var11.field1995);
                                                }
                                            }
                                        } else if (class180.field3141) {
                                            class242.method1642((byte) 86, var11);
                                        }
                                    } else {
                                        class108 var85 = var11.method799(class259.method1752((byte) -117, var11), (byte) -13);
                                        if (var85 != null) {
                                            var85.method758(var15, var13);
                                        } else if (class180.field3141) {
                                            class242.method1642((byte) 48, var11);
                                        }
                                    }
                                } else if (var11.field1879 == 6) {
                                    boolean var86 = class259.method1752((byte) -117, var11);
                                    int var87 = 0;
                                    int var88;
                                    if (var86) {
                                        var88 = var11.field1972;
                                    } else {
                                        var88 = var11.field2007;
                                    }
                                    class256 var89 = null;
                                    if (var11.field1983 != -1) {
                                        class220 var90 = class23.method177((byte) -74, var11.field1983);
                                        if (var90 != null) {
                                            class220 var91 = var90.method1473((byte) 49, var11.field1993);
                                            class78 var92 = var88 == -1 ? null : class207.method1401((byte) -22, var88);
                                            var89 = var91.method1476(var11.field1884, 255, var92, 1);
                                            if (var89 == null) {
                                                class242.method1642((byte) 113, var11);
                                            } else {
                                                var87 = -var89.method426() / 2;
                                            }
                                        }
                                    } else if (var11.field1923 == 5) {
                                        if (var11.field1970 == -1) {
                                            var89 = client.field2689.method1218(-1, true, -1, -3783, (class78) null, (class78) null);
                                        } else {
                                            int var93 = var11.field1970 & 0x7FF;
                                            if (class11.field240 == var93) {
                                                var93 = 2047;
                                            }
                                            class142 var94 = class280.field4940[var93];
                                            class78 var95 = var88 == -1 ? null : class207.method1401((byte) -22, var88);
                                            if (var94 != null && ((int) var94.field2458.method1896(86) << 11) == (var11.field1970 & 0xFFFFF800)) {
                                                var89 = var94.field2481.method1218(var11.field1884, true, 0, -3783, var95, (class78) null);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var89 = var11.method796(false, var86, -1, class262.field4631.field2481, (class78) null);
                                        if (var89 == null && class180.field3141) {
                                            class242.method1642((byte) 77, var11);
                                        }
                                    } else {
                                        class78 var96 = class207.method1401((byte) -22, var88);
                                        var89 = var11.method796(false, var86, var11.field1884, class262.field4631.field2481, var96);
                                        if (var89 == null && class180.field3141) {
                                            class242.method1642((byte) 127, var11);
                                        }
                                    }
                                    if (var89 != null) {
                                        int var97;
                                        if (var11.field1949 <= 0) {
                                            var97 = 256;
                                        } else {
                                            var97 = (var11.field1869 << 8) / var11.field1949;
                                        }
                                        int var98;
                                        if (var11.field1917 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field1995 << 8) / var11.field1917;
                                        }
                                        int var99 = (var11.field1975 * var97 >> 8) + (var15 + (var11.field1869 / 2));
                                        int var100 = (var11.field1891 * var98 >> 8) + var11.field1995 / 2 + var13;
                                        class146.method1017(var99, var100);
                                        int var101 = class146.field2541[var11.field1885] * var11.field1947 >> 16;
                                        int var102 = class146.field2545[var11.field1885] * var11.field1947 >> 16;
                                        if (!var11.field2008) {
                                            var89.method1610(0, var11.field1918, 0, var11.field1885, 0, var102, var101, -1L);
                                        } else if (var11.field1984) {
                                            ((class239) var89).method1597(0, var11.field1918, var11.field1870, var11.field1885, var11.field1997, var87 + var11.field2015 + var102, var101 - -var11.field2015, var11.field1947);
                                        } else {
                                            var89.method1610(0, var11.field1918, var11.field1870, var11.field1885, var11.field1997, var102 + var87 + var11.field2015, var11.field2015 + var101, -1L);
                                        }
                                        class146.method1015();
                                    }
                                } else {
                                    if (var11.field1879 == 7) {
                                        class72 var103 = var11.method803(-112, class108.field1777);
                                        if (var103 == null) {
                                            if (class180.field3141) {
                                                class242.method1642((byte) 80, var11);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var11.field1957; var105++) {
                                            for (int var106 = 0; var106 < var11.field2005; var106++) {
                                                if (var11.field1889[var104] > 0) {
                                                    class220 var107 = class23.method177((byte) -87, var11.field1889[var104] - 1);
                                                    class280 var108;
                                                    if (var107.field3805 != 1 && var11.field1951[var104] == 1) {
                                                        var108 = class30.method266(new class280[] { class173.field3015, var107.field3818, class106.field1763 }, (byte) -87);
                                                    } else {
                                                        var108 = class30.method266(new class280[] { class173.field3015, var107.field3818, class233.field4063, class259.method1751(var11.field1951[var104], -78) }, (byte) -87);
                                                    }
                                                    int var109 = (var11.field1878 + 115) * var106 + var15;
                                                    int var110 = var13 + ((var11.field1876 + 12) * var105);
                                                    if (var11.field1872 == 0) {
                                                        var103.method515(var108, var109, var110, var11.field1921, var11.field1958 ? 0 : -1);
                                                    } else if (var11.field1872 == 1) {
                                                        var103.method531(var108, var109 + 57, var110, var11.field1921, var11.field1958 ? 0 : -1);
                                                    } else {
                                                        var103.method525(var108, var109 + 115 - 1, var110, var11.field1921, var11.field1958 ? 0 : -1);
                                                    }
                                                }
                                                var104++;
                                            }
                                        }
                                    }
                                    if (var11.field1879 == 8 && class158.field2766 == var11 && class30.field572 == class145.field2528) {
                                        class72 var111 = class101.field1651;
                                        int var112 = 0;
                                        int var113 = 0;
                                        class280 var114 = var11.field2017;
                                        class280 var115 = class244.method1660(var11, 1, var114);
                                        while (var115.method1889(arg8 - 1) > 0) {
                                            int var123 = var115.method1866(class20.field370, (byte) -120);
                                            class280 var124;
                                            if (var123 == -1) {
                                                var124 = var115;
                                                var115 = class229.field3959;
                                            } else {
                                                var124 = var115.method1864(var123, 0, (byte) -108);
                                                var115 = var115.method1870((byte) -122, var123 + 4);
                                            }
                                            int var125 = var111.method528(var124);
                                            var113 += var111.field1154 + 1;
                                            if (var112 < var125) {
                                                var112 = var125;
                                            }
                                        }
                                        var113 += 7;
                                        var112 += 6;
                                        int var116 = var15 - var112 - (-var11.field1869 + 5);
                                        int var117 = var13 + var11.field1995 + 5;
                                        if ((var15 + 5) > var116) {
                                            var116 = var15 + 5;
                                        }
                                        if ((var112 + var116) > arg5) {
                                            var116 = arg5 - var112;
                                        }
                                        if (arg9 < var113 + var117) {
                                            var117 = arg9 - var113;
                                        }
                                        class151.method1057(var116, var117, var112, var113, 16777120);
                                        class151.method1060(var116, var117, var112, var113, 0);
                                        class280 var118 = var11.field2017;
                                        int var119 = var111.field1154 + var117 + 2;
                                        class280 var120 = class244.method1660(var11, 1, var118);
                                        while (var120.method1889(-1) > 0) {
                                            int var121 = var120.method1866(class20.field370, (byte) -87);
                                            class280 var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = class229.field3959;
                                            } else {
                                                var122 = var120.method1864(var121, 0, (byte) -84);
                                                var120 = var120.method1870((byte) -122, var121 + 4);
                                            }
                                            var111.method515(var122, var116 + 3, var119, 0, -1);
                                            var119 += var111.field1154 + 1;
                                        }
                                    }
                                    if (var11.field1879 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (var11.field1992) {
                                            var126 = var15;
                                            var127 = var13;
                                            var128 = var13 + var11.field1995;
                                            var129 = var15 + var11.field1869;
                                        } else {
                                            var128 = var13;
                                            var129 = var11.field1869 + var15;
                                            var126 = var15;
                                            var127 = var13 + var11.field1995;
                                        }
                                        if (var11.field1925 == 1) {
                                            class151.method1063(var126, var128, var129, var127, var11.field1921);
                                        } else {
                                            class151.method1070(var126, var128, var129, var127, var11.field1921, var11.field1925);
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

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static final void method1155(boolean arg0) {
        field2877++;
        if (!arg0) {
            field2884 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Llj;Z)Lkk;")
    public static final class229 method1156(class25 arg0, boolean arg1) {
        class229 var2 = new class229();
        var2.field3964 = arg0.method193((byte) 77);
        field2874++;
        var2.field3956 = class180.method1238((byte) -111, var2.field3964);
        if (!arg1) {
            method1157(-53, -114);
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method1157(int arg0, int arg1) {
        field2880++;
        class104.field1731.method1478(arg0, 116);
        if (arg1 == -1339) {
            class101.field1644.method1478(arg0, 83);
            class232.field4046.method1478(arg0, 85);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public static void method1158(int arg0) {
        field2884 = null;
        if (arg0 != 0) {
            method1159(true, 57, (class180) null, (class180) null);
        }
        field2872 = null;
        field2878 = null;
        field2875 = null;
        field2876 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V")
    public class164(int arg0, int arg1) {
        this.field2882 = arg1;
        this.field2879 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZILtg;Ltg;)V")
    public static final void method1159(boolean arg0, int arg1, class180 arg2, class180 arg3) {
        field2873++;
        class122.field2148 = arg0;
        class131.field2338 = arg3;
        int var4 = -23 % ((arg1 + 20) / 41);
        class46.field763 = arg2;
    }
}
