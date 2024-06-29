import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class218 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Ldc;")
    public static class37 field4060 = class185.method1233((byte) 86, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4061 = -1;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Ldc;")
    public static class37 field4065 = class185.method1233((byte) 86, ")1");

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Ldc;")
    private static class37 field4066 = class185.method1233((byte) 86, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Ldc;")
    public static class37 field4069 = field4066;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Ldc;")
    private static class37 field4067 = class185.method1233((byte) 86, "Password: ");

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Ldc;")
    private static class37 field4068 = class185.method1233((byte) 86, "Select a world");

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Ldc;")
    public static class37 field4071 = field4067;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Ldc;")
    public static class37 field4073 = field4068;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Ldc;")
    public static class37 field4070 = class185.method1233((byte) 86, "Fps:");

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field4074 = -1;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Ldc;")
    public static class37 field4076 = class185.method1233((byte) 86, " ");

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lbc;")
    public static class15 field4075;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZZZ)I")
    public static final int method1441(boolean arg0, boolean arg1, boolean arg2) {
        field4062++;
        if (arg2) {
            return 91;
        }
        int var3 = 0;
        if (arg0) {
            var3 += class28.field506 + class11.field147;
        }
        if (arg1) {
            var3 += class229.field4213 + class147.field2798;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method1442(int arg0) {
        int var1 = 96 / ((-arg0 - 41) / 44);
        field4072++;
        class74.field1310.method93(0);
        class143.field2753.method1183((byte) 91);
        class220.field4087.method93(0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwa;ZLwa;BZ)V")
    public static final void method1443(class238 arg0, boolean arg1, class238 arg2, byte arg3, boolean arg4) {
        class12.field173 = arg0;
        class10.field134 = arg2;
        class66.field1189 = arg4;
        class242.field4451 = arg1;
        class205.field3812 = new class176(30);
        if (arg3 != -57) {
            method1443(null, true, null, (byte) -10, false);
        }
        field4064++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[Lmf;IIIIIII)V")
    public static final void method1444(int arg0, int arg1, class136[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class48.method408(arg0, arg1, arg6, arg4);
        if (arg9 != -1) {
            field4066 = null;
        }
        class169.method1128();
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class136 var11 = arg2[var10];
            if (var11 != null && (var11.field2566 == arg5 || arg5 == -1412584499 && class56.field1073 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class61.field1121[class157.field2981] = var11.field2630 + arg8;
                    class64.field1167[class157.field2981] = var11.field2636 + arg3;
                    class58.field1089[class157.field2981] = var11.field2638;
                    class120.field2139[class157.field2981] = var11.field2509;
                    var12 = class157.field2981++;
                } else {
                    var12 = arg7;
                }
                var11.field2654 = class203.field3758;
                var11.field2588 = var12;
                if (!var11.field2527 || !class25.method171(true, var11)) {
                    if (var11.field2659 > 0) {
                        class105.method684((byte) 123, var11);
                    }
                    int var13 = var11.field2630 + arg8;
                    int var14 = var11.field2637;
                    int var15 = var11.field2636 + arg3;
                    if (class168.field3198 && (class107.method699(var11, 66) != 0 || var11.field2513 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class56.field1073 == var11) {
                        if (arg5 != -1412584499 && !var11.field2571) {
                            class32.field643 = arg8;
                            class70.field1263 = arg2;
                            class124.field2216 = arg3;
                            continue;
                        }
                        if (class13.field190 && class163.field3100) {
                            int var16 = class80.field1416;
                            int var17 = var16 - class75.field1334;
                            if (class108.field1886 > var17) {
                                var17 = class108.field1886;
                            }
                            int var18 = class235.field4271;
                            int var19 = var18 - class160.field3031;
                            if (class136.field2592 > var19) {
                                var19 = class136.field2592;
                            }
                            if (class136.field2592 + class136.field2612.field2509 < var11.field2509 + var19) {
                                var19 = class136.field2592 + class136.field2612.field2509 - var11.field2509;
                            }
                            if (class108.field1886 + class136.field2612.field2638 < var11.field2638 + var17) {
                                var17 = class108.field1886 + class136.field2612.field2638 - var11.field2638;
                            }
                            var15 = var19;
                            var13 = var17;
                        }
                        if (!var11.field2571) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2513 == 2) {
                        var20 = arg6;
                        var21 = arg1;
                        var22 = arg0;
                        var23 = arg4;
                    } else {
                        var21 = arg1 < var15 ? var15 : arg1;
                        var22 = arg0 < var13 ? var13 : arg0;
                        int var24 = var11.field2638 + var13;
                        int var25 = var15 + var11.field2509;
                        if (var11.field2513 == 9) {
                            var25++;
                            var24++;
                        }
                        var23 = arg4 <= var25 ? arg4 : var25;
                        var20 = var24 < arg6 ? var24 : arg6;
                    }
                    if (!var11.field2527 || var22 < var20 && var21 < var23) {
                        if (var11.field2659 != 0) {
                            if (var11.field2659 == 1337) {
                                class150.field2832 = var15;
                                field4061 = var13;
                                class44.method384(var11.field2638, var13, var11.field2509, var15, 1920);
                                class48.method408(arg0, arg1, arg6, arg4);
                                continue;
                            }
                            if (var11.field2659 == 1338) {
                                if (var11.method948(126)) {
                                    class3.method28(var15, var12, false, var11, var13);
                                    class48.method408(arg0, arg1, arg6, arg4);
                                }
                                continue;
                            }
                            if (var11.field2659 == 1339) {
                                if (var11.method948(119)) {
                                    class143.method997(3395, var11, var12, var15, var13);
                                    class48.method408(arg0, arg1, arg6, arg4);
                                }
                                continue;
                            }
                            if (var11.field2659 == 1400) {
                                class212.method1408(-104, var11.field2638, var15, var11.field2509, var13);
                                class211.field3948[var12] = true;
                                class85.field1505[var12] = true;
                                class48.method408(arg0, arg1, arg6, arg4);
                                continue;
                            }
                            if (var11.field2659 == 1401) {
                                class52.method429(var15, var13, var11.field2509, var11.field2638, (byte) 70);
                                class211.field3948[var12] = true;
                                class85.field1505[var12] = true;
                                class48.method408(arg0, arg1, arg6, arg4);
                                continue;
                            }
                        }
                        if (var11.field2513 == 0 && var11.field2660 && var22 <= class80.field1416 && var21 <= class235.field4271 && class80.field1416 < var20 && var23 > class235.field4271 && !class118.field2114 && !class168.field3198) {
                            class97.field1701 = 1;
                            class231.field4234[0] = class161.field3046;
                            class171.field3281[0] = 1006;
                            class220.field4088[0] = class243.field4462;
                        }
                        int var26 = class235.field4271;
                        int var27 = class80.field1416;
                        if (!class118.field2114 && var27 >= var22 && var26 >= var21 && var27 < var20 && var23 > var26) {
                            class9.method65(var26 - var15, -var13 + var27, (byte) 1, var11);
                        }
                        if (var11.field2513 == 0) {
                            if (!var11.field2527 && class25.method171(true, var11) && class99.field1736 != var11) {
                                continue;
                            }
                            if (!var11.field2527) {
                                if (var11.field2598 - var11.field2509 < var11.field2593) {
                                    var11.field2593 = var11.field2598 - var11.field2509;
                                }
                                if (var11.field2593 < 0) {
                                    var11.field2593 = 0;
                                }
                            }
                            method1444(var22, var21, arg2, var15 - var11.field2593, var23, var11.field2608, var20, var12, var13 - var11.field2519, arg9);
                            if (var11.field2641 != null) {
                                method1444(var22, var21, var11.field2641, var15 - var11.field2593, var23, var11.field2608, var20, var12, var13 - var11.field2519, arg9);
                            }
                            class201 var28 = (class201) class85.field1499.method1047((byte) 91, (long) var11.field2608);
                            if (var28 != null) {
                                if (var28.field3751 == 0 && class80.field1416 >= var22 && var21 <= class235.field4271 && var20 > class80.field1416 && class235.field4271 < var23 && !class118.field2114 && !class168.field3198) {
                                    class231.field4234[0] = class161.field3046;
                                    class220.field4088[0] = class243.field4462;
                                    class97.field1701 = 1;
                                    class171.field3281[0] = 1006;
                                }
                                class222.method1463(var21, var22, var23, var12, (byte) 21, var13, var20, var28.field3746, var15);
                            }
                            class48.method408(arg0, arg1, arg6, arg4);
                            class169.method1128();
                        }
                        if (class159.field3013[var12] || class122.field2175 > 1) {
                            if (var11.field2513 == 0 && !var11.field2527 && var11.field2509 < var11.field2598) {
                                class133.method923(true, var11.field2509, var11.field2638 + var13, var11.field2598, var11.field2593, var15);
                            }
                            if (var11.field2513 != 1) {
                                if (var11.field2513 == 2) {
                                    int var29 = 0;
                                    for (int var30 = 0; var30 < var11.field2615; var30++) {
                                        for (int var31 = 0; var31 < var11.field2622; var31++) {
                                            int var32 = (var11.field2508 + 32) * var30 + var15;
                                            int var33 = (var11.field2556 + 32) * var31 + var13;
                                            if (var29 < 20) {
                                                var33 += var11.field2521[var29];
                                                var32 += var11.field2561[var29];
                                            }
                                            if (var11.field2538[var29] > 0) {
                                                boolean var35 = false;
                                                int var36 = var11.field2538[var29] - 1;
                                                boolean var37 = false;
                                                if (var33 + 32 > arg0 && var33 < arg6 && arg1 < var32 + 32 && var32 < arg4 || class115.field2052 == var11 && class204.field3790 == var29) {
                                                    class106 var38;
                                                    if (class66.field1191 == 1 && class39.field809 == var29 && class109.field1894 == var11.field2608) {
                                                        var38 = class231.method1496(var11.field2564, var36, var11.field2657[var29], 0, 500, 2);
                                                    } else {
                                                        var38 = class231.method1496(var11.field2564, var36, var11.field2657[var29], 3153952, 500, 1);
                                                    }
                                                    if (var38 == null) {
                                                        class210.method1395((byte) 29, var11);
                                                    } else if (class115.field2052 == var11 && class204.field3790 == var29) {
                                                        int var39 = class235.field4271 - class243.field4463;
                                                        if (var39 < 5 && var39 > -5) {
                                                            var39 = 0;
                                                        }
                                                        int var40 = class80.field1416 - class166.field3180;
                                                        if (var40 < 5 && var40 > -5) {
                                                            var40 = 0;
                                                        }
                                                        if (class236.field4298 < 5) {
                                                            var40 = 0;
                                                            var39 = 0;
                                                        }
                                                        var38.method689(var33 + var40, var32 + var39, 128);
                                                        if (arg5 != -1) {
                                                            class136 var41 = arg2[arg5 & 0xFFFF];
                                                            int var42 = class48.field961;
                                                            int var43 = class48.field959;
                                                            if (var32 + var39 < var43 && var41.field2593 > 0) {
                                                                int var44 = (var43 - var32 - var39) * class201.field3749 / 3;
                                                                if (class201.field3749 * 10 < var44) {
                                                                    var44 = class201.field3749 * 10;
                                                                }
                                                                if (var44 > var41.field2593) {
                                                                    var44 = var41.field2593;
                                                                }
                                                                class243.field4463 += var44;
                                                                var41.field2593 -= var44;
                                                                class210.method1395((byte) 29, var41);
                                                            }
                                                            if (var42 < var39 + var32 + 32 && var41.field2598 - var41.field2509 > var41.field2593) {
                                                                int var45 = (var32 + var39 + 32 - var42) * class201.field3749 / 3;
                                                                if (class201.field3749 * 10 < var45) {
                                                                    var45 = class201.field3749 * 10;
                                                                }
                                                                if (var41.field2598 - var41.field2593 - var41.field2509 < var45) {
                                                                    var45 = var41.field2598 - var41.field2509 - var41.field2593;
                                                                }
                                                                var41.field2593 += var45;
                                                                class243.field4463 -= var45;
                                                                class210.method1395((byte) 29, var41);
                                                            }
                                                        }
                                                    } else if (class72.field1282 == var11 && class58.field1079 == var29) {
                                                        var38.method689(var33, var32, 128);
                                                    } else {
                                                        var38.method687(var33, var32);
                                                    }
                                                }
                                            } else if (var11.field2552 != null && var29 < 20) {
                                                class106 var34 = var11.method951(var29, (byte) 24);
                                                if (var34 != null) {
                                                    var34.method687(var33, var32);
                                                } else if (class11.field158) {
                                                    class210.method1395((byte) 29, var11);
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                } else if (var11.field2513 == 3) {
                                    int var46;
                                    if (class160.method1079(true, var11)) {
                                        var46 = var11.field2596;
                                        if (class99.field1736 == var11 && var11.field2567 != 0) {
                                            var46 = var11.field2567;
                                        }
                                    } else {
                                        var46 = var11.field2543;
                                        if (class99.field1736 == var11 && var11.field2616 != 0) {
                                            var46 = var11.field2616;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field2591) {
                                            class48.method420(var13, var15, var11.field2638, var11.field2509, var46);
                                        } else {
                                            class48.method413(var13, var15, var11.field2638, var11.field2509, var46);
                                        }
                                    } else if (var11.field2591) {
                                        class48.method410(var13, var15, var11.field2638, var11.field2509, var46, 256 - (var14 & 0xFF));
                                    } else {
                                        class48.method411(var13, var15, var11.field2638, var11.field2509, var46, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field2513 == 4) {
                                    class93 var47 = var11.method949(class5.field33, (byte) -6);
                                    if (var47 != null) {
                                        class37 var48 = var11.field2580;
                                        int var49;
                                        if (class160.method1079(true, var11)) {
                                            var49 = var11.field2596;
                                            if (class99.field1736 == var11 && var11.field2567 != 0) {
                                                var49 = var11.field2567;
                                            }
                                            if (var11.field2605.method334(-61) > 0) {
                                                var48 = var11.field2605;
                                            }
                                        } else {
                                            var49 = var11.field2543;
                                            if (class99.field1736 == var11 && var11.field2616 != 0) {
                                                var49 = var11.field2616;
                                            }
                                        }
                                        if (var11.field2527 && var11.field2632 != -1) {
                                            class125 var50 = class223.method1471(127, var11.field2632);
                                            var48 = var50.field2232;
                                            if (var48 == null) {
                                                var48 = class193.field3601;
                                            }
                                            if ((var50.field2225 == 1 || var11.field2644 != 1) && var11.field2644 != -1) {
                                                var48 = class80.method548(new class37[] { class196.field3668, var48, class167.field3188, class205.method1355(var11.field2644, arg9 - 13523) }, -89);
                                            }
                                        }
                                        if (class152.field2877 == var11) {
                                            var48 = class11.field150;
                                            var49 = var11.field2543;
                                        }
                                        if (!var11.field2527) {
                                            var48 = class119.method822(12445, var11, var48);
                                        }
                                        var47.method620(var48, var13, var15, var11.field2638, var11.field2509, var49, var11.field2579 ? 0 : -1, var11.field2643, var11.field2555, var11.field2572);
                                    } else if (class11.field158) {
                                        class210.method1395((byte) 29, var11);
                                    }
                                } else if (var11.field2513 == 5) {
                                    if (var11.field2527) {
                                        class106 var52;
                                        if (var11.field2632 == -1) {
                                            var52 = var11.method947(false, -7985);
                                        } else {
                                            var52 = class231.method1496(var11.field2564, var11.field2632, var11.field2644, var11.field2597, 500, var11.field2642);
                                        }
                                        if (var52 != null) {
                                            int var53 = var52.field1843;
                                            int var54 = var52.field1849;
                                            if (var11.field2581) {
                                                int var56 = (var53 + var11.field2638 - 1) / var53;
                                                int var57 = (var11.field2509 + var54 - 1) / var54;
                                                class48.method402(var13, var15, var11.field2638 + var13, var11.field2509 + var15);
                                                for (int var58 = 0; var58 < var56; var58++) {
                                                    for (int var59 = 0; var59 < var57; var59++) {
                                                        if (var11.field2512 != 0) {
                                                            var52.method690(4096, var54 / 2 + var15 + var54 * var59, var53 * var58 + (var13 - -(var53 / 2)), var11.field2512, -95);
                                                        } else if (var14 == 0) {
                                                            var52.method687(var13 + var53 * var58, var54 * var59 + var15);
                                                        } else {
                                                            var52.method689(var53 * var58 + var13, var15 - -(var54 * var59), 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class48.method408(arg0, arg1, arg6, arg4);
                                            } else {
                                                int var55 = var11.field2638 * 4096 / var53;
                                                if (var11.field2512 != 0) {
                                                    var52.method690(var55, var11.field2509 / 2 + var15, var13 - -(var11.field2638 / 2), var11.field2512, arg9 - 93);
                                                } else if (var14 != 0) {
                                                    var52.method688(var13, var15, var11.field2638, var11.field2509, 256 - (var14 & 0xFF));
                                                } else if (var11.field2638 == var53 && var11.field2509 == var54) {
                                                    var52.method687(var13, var15);
                                                } else {
                                                    var52.method691(var13, var15, var11.field2638, var11.field2509);
                                                }
                                            }
                                        } else if (class11.field158) {
                                            class210.method1395((byte) 29, var11);
                                        }
                                    } else {
                                        class106 var51 = var11.method947(class160.method1079(true, var11), arg9 - 7984);
                                        if (var51 != null) {
                                            var51.method687(var13, var15);
                                        } else if (class11.field158) {
                                            class210.method1395((byte) 29, var11);
                                        }
                                    }
                                } else if (var11.field2513 == 6) {
                                    boolean var60 = class160.method1079(true, var11);
                                    class1 var61 = null;
                                    int var62;
                                    if (var60) {
                                        var62 = var11.field2628;
                                    } else {
                                        var62 = var11.field2516;
                                    }
                                    int var63 = 0;
                                    if (var11.field2632 != -1) {
                                        class125 var68 = class223.method1471(-68, var11.field2632);
                                        if (var68 != null) {
                                            class125 var69 = var68.method854(123, var11.field2644);
                                            var61 = var69.method860(-17838, 0, 1, null);
                                            if (var61 == null) {
                                                class210.method1395((byte) 29, var11);
                                            } else {
                                                var63 = -var61.method5() / 2;
                                            }
                                        }
                                    } else if (var11.field2621 == 5) {
                                        if (var11.field2601 == -1) {
                                            var61 = class183.field3376.method808(-1, -1, (byte) -52, null, null);
                                        } else {
                                            int var64 = var11.field2601 & 0x7FF;
                                            if (class75.field1324 == var64) {
                                                var64 = 2047;
                                            }
                                            class123 var65 = class8.field107[var64];
                                            class208 var66 = var62 == -1 ? null : class16.method113(var62, (byte) 113);
                                            if (var65 != null && (int) var65.field2187.method347(-69) << 11 == (var11.field2601 & 0xFFFFF800)) {
                                                var61 = var65.field2191.method808(var11.field2610, 0, (byte) -52, null, var66);
                                            }
                                        }
                                    } else if (var62 == -1) {
                                        var61 = var11.method952(class238.field4382.field2191, var60, null, -29797, -1);
                                        if (var61 == null && class11.field158) {
                                            class210.method1395((byte) 29, var11);
                                        }
                                    } else {
                                        class208 var67 = class16.method113(var62, (byte) 76);
                                        var61 = var11.method952(class238.field4382.field2191, var60, var67, -29797, var11.field2610);
                                        if (var61 == null && class11.field158) {
                                            class210.method1395((byte) 29, var11);
                                        }
                                    }
                                    if (var61 != null) {
                                        int var70;
                                        if (var11.field2528 <= 0) {
                                            var70 = 256;
                                        } else {
                                            var70 = (var11.field2638 << 8) / var11.field2528;
                                        }
                                        int var71 = var11.field2638 / 2 + (var11.field2554 * var70 >> 8) + var13;
                                        int var72;
                                        if (var11.field2586 > 0) {
                                            var72 = (var11.field2509 << 8) / var11.field2586;
                                        } else {
                                            var72 = 256;
                                        }
                                        int var73 = var15 + (var11.field2535 * var72 >> 8) + var11.field2509 / 2;
                                        class169.method1127(var71, var73);
                                        int var74 = class169.field3211[var11.field2617] * var11.field2560 >> 16;
                                        int var75 = class169.field3220[var11.field2617] * var11.field2560 >> 16;
                                        if (!var11.field2527) {
                                            var61.method20(0, var11.field2620, 0, var11.field2617, 0, var74, var75);
                                        } else if (var11.field2514) {
                                            ((class42) var61).method369(0, var11.field2620, var11.field2510, var11.field2617, var11.field2525, var74 + var11.field2584 + var63, var11.field2584 + var75, var11.field2560);
                                        } else {
                                            var61.method20(0, var11.field2620, var11.field2510, var11.field2617, var11.field2525, var11.field2584 + var63 + var74, var11.field2584 + var75);
                                        }
                                        class169.method1135();
                                    }
                                } else {
                                    if (var11.field2513 == 7) {
                                        class93 var76 = var11.method949(class5.field33, (byte) -6);
                                        if (var76 == null) {
                                            if (class11.field158) {
                                                class210.method1395((byte) 29, var11);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var78 < var11.field2615; var78++) {
                                            for (int var79 = 0; var79 < var11.field2622; var79++) {
                                                if (var11.field2538[var77] > 0) {
                                                    class125 var80 = class223.method1471(127, var11.field2538[var77] - 1);
                                                    class37 var81;
                                                    if (var80.field2225 != 1 && var11.field2657[var77] == 1) {
                                                        var81 = class80.method548(new class37[] { class196.field3668, var80.field2232, class49.field994 }, arg9 - 69);
                                                    } else {
                                                        var81 = class80.method548(new class37[] { class196.field3668, var80.field2232, class167.field3188, class205.method1355(var11.field2657[var77], arg9 - 13523) }, -97);
                                                    }
                                                    int var82 = (var11.field2556 + 115) * var79 + var13;
                                                    int var83 = var15 + (var11.field2508 + 12) * var78;
                                                    if (var11.field2643 == 0) {
                                                        var76.method607(var81, var82, var83, var11.field2543, var11.field2579 ? 0 : -1);
                                                    } else if (var11.field2643 == 1) {
                                                        var76.method621(var81, var82 + 57, var83, var11.field2543, var11.field2579 ? 0 : -1);
                                                    } else {
                                                        var76.method623(var81, var82 + 115 - 1, var83, var11.field2543, var11.field2579 ? 0 : -1);
                                                    }
                                                }
                                                var77++;
                                            }
                                        }
                                    }
                                    if (var11.field2513 == 8 && class212.field3964 == var11 && class238.field4381 == class129.field2424) {
                                        int var84 = 0;
                                        int var85 = 0;
                                        class93 var86 = class190.field3468;
                                        class37 var87 = var11.field2580;
                                        class37 var88 = class119.method822(12445, var11, var87);
                                        while (var88.method334(arg9 - 60) > 0) {
                                            int var96 = var88.method336(95, class35.field704);
                                            class37 var97;
                                            if (var96 == -1) {
                                                var97 = var88;
                                                var88 = class243.field4462;
                                            } else {
                                                var97 = var88.method311(var96, 0, true);
                                                var88 = var88.method301((byte) 91, var96 + 4);
                                            }
                                            int var98 = var86.method606(var97);
                                            var85 += var86.field1594 + 1;
                                            if (var98 > var84) {
                                                var84 = var98;
                                            }
                                        }
                                        var85 += 7;
                                        int var89 = var11.field2509 + var15 + 5;
                                        if (arg4 < var89 + var85) {
                                            var89 = arg4 - var85;
                                        }
                                        var84 += 6;
                                        int var90 = var11.field2638 + var13 - var84 - 5;
                                        if (var13 + 5 > var90) {
                                            var90 = var13 + 5;
                                        }
                                        if (arg6 < var84 + var90) {
                                            var90 = arg6 - var84;
                                        }
                                        class48.method420(var90, var89, var84, var85, 16777120);
                                        class48.method413(var90, var89, var84, var85, 0);
                                        int var91 = var89 + var86.field1594 + 2;
                                        class37 var92 = var11.field2580;
                                        class37 var93 = class119.method822(12445, var11, var92);
                                        while (var93.method334(arg9 - 60) > 0) {
                                            int var94 = var93.method336(104, class35.field704);
                                            class37 var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = class243.field4462;
                                            } else {
                                                var95 = var93.method311(var94, 0, true);
                                                var93 = var93.method301((byte) 109, var94 + 4);
                                            }
                                            var86.method607(var95, var90 + 3, var91, 0, -1);
                                            var91 += var86.field1594 + 1;
                                        }
                                    }
                                    if (var11.field2513 == 9) {
                                        int var99;
                                        int var100;
                                        int var101;
                                        int var102;
                                        if (var11.field2633) {
                                            var99 = var13;
                                            var100 = var13 + var11.field2638;
                                            var101 = var11.field2509 + var15;
                                            var102 = var15;
                                        } else {
                                            var99 = var13;
                                            var100 = var11.field2638 + var13;
                                            var101 = var15;
                                            var102 = var11.field2509 + var15;
                                        }
                                        if (var11.field2573 == 1) {
                                            class48.method401(var99, var101, var100, var102, var11.field2543);
                                        } else {
                                            class48.method407(var99, var101, var100, var102, var11.field2543, var11.field2573);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field4063++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static void method1445(int arg0) {
        field4060 = null;
        field4071 = null;
        field4075 = null;
        if (arg0 != 0) {
            return;
        }
        field4073 = null;
        field4068 = null;
        field4065 = null;
        field4070 = null;
        field4076 = null;
        field4069 = null;
        field4067 = null;
        field4066 = null;
    }
}
