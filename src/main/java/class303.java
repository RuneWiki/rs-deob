import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class303 extends class120 {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field4793;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field4799;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[I")
    public static int[] field4790 = new int[4096];

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
    public static boolean field4785 = false;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4798 = "flash3:";

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILmo;)V")
    public static final void method2032(int arg0, class447 arg1) {
        field4795++;
        class110.field1527 = arg1;
        int var2 = 81 / ((54 - arg0) / 42);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII[Lne;IIII)V")
    public static final void method2033(int arg0, int arg1, int arg2, int arg3, int arg4, class172[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field4788++;
        class284.field4547.method671(arg4, arg1, arg9, arg6);
        if (arg7 != -1) {
            method2032(-61, (class447) null);
        }
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class172 var11 = arg5[var10];
            if (var11 != null && (var11.field2735 == arg3 || arg3 == -1412584499 && class329.field5152 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class119.field1631[class125.field1929].setBounds(var11.field2766 + arg8, var11.field2726 - -arg2, var11.field2705, var11.field2834);
                    var12 = class125.field1929++;
                } else {
                    var12 = arg0;
                }
                var11.field2781 = var12;
                var11.field2773 = class183.field2987;
                if (!var11.field2712 || !client.method1144(var11)) {
                    if (var11.field2831 > 0) {
                        class201.method1397(var11, arg7);
                    }
                    int var13 = var11.field2766 + arg8;
                    int var14 = var11.field2726 + arg2;
                    int var15 = var11.field2853;
                    if (class80.field1000 && (client.method1149(var11).field671 != 0 || var11.field2707 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class329.field5152 == var11) {
                        if (arg3 != -1412584499 && !var11.field2733) {
                            class71.field882 = arg2;
                            class222.field3700 = arg8;
                            class84.field1046 = arg5;
                            continue;
                        }
                        if (class265.field4262 && class29.field342) {
                            int var16 = class414.field6125;
                            int var17 = class287.field4604;
                            int var18 = var16 - class145.field2286;
                            if (class63.field823 > var18) {
                                var18 = class63.field823;
                            }
                            int var19 = var17 - class152.field2375;
                            if (var19 < class11.field154) {
                                var19 = class11.field154;
                            }
                            if (var11.field2705 + var18 > class63.field823 + class158.field2516.field2705) {
                                var18 = class63.field823 + class158.field2516.field2705 - var11.field2705;
                            }
                            if (class11.field154 + class158.field2516.field2834 < var11.field2834 + var19) {
                                var19 = class11.field154 + class158.field2516.field2834 - var11.field2834;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var11.field2733) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field2707 == 2) {
                        var22 = arg4;
                        var25 = arg6;
                        var24 = arg9;
                        var23 = arg1;
                    } else {
                        int var20 = var11.field2705 + var13;
                        int var21 = var11.field2834 + var14;
                        var22 = arg4 < var13 ? var13 : arg4;
                        if (var11.field2707 == 9) {
                            var20++;
                            var21++;
                        }
                        var23 = var14 > arg1 ? var14 : arg1;
                        var24 = arg9 <= var20 ? arg9 : var20;
                        var25 = arg6 <= var21 ? arg6 : var21;
                    }
                    if (!var11.field2712 || var22 < var24 && var23 < var25) {
                        if (var11.field2831 != 0) {
                            if (var11.field2831 == 1337 || var11.field2831 == 1403) {
                                method2034(var13, var11.field2705, var11.field2831 == 1403, var14, var11.field2834, 101);
                                class267.field4296[var12] = true;
                                class284.field4547.method671(arg4, arg1, arg9, arg6);
                                continue;
                            }
                            if (var11.field2831 == 1338) {
                                if (var11.method1197(class284.field4547, -4) != null) {
                                    class409.method2566(true);
                                    class33.method219(var11, class284.field4547, var14, var13, (byte) -22);
                                    class239.field3976[var12] = true;
                                    class284.field4547.method671(arg4, arg1, arg9, arg6);
                                }
                                continue;
                            }
                            if (var11.field2831 == 1339) {
                                if (var11.method1197(class284.field4547, -4) != null) {
                                    class133.method979(var11, var13, var14, arg7 + 4);
                                    class239.field3976[var12] = true;
                                    class284.field4547.method671(arg4, arg1, arg9, arg6);
                                }
                                continue;
                            }
                            if (var11.field2831 == 1400) {
                                class32.method215(var11.field2705, var14, var13, class35.field434, class284.field4547, arg7 + 3, var11.field2834);
                                class267.field4296[var12] = true;
                                class284.field4547.method671(arg4, arg1, arg9, arg6);
                                continue;
                            }
                            if (var11.field2831 == 1401) {
                                class208.method1473(var11.field2705, var14, (byte) 55, var11.field2834, var13, class284.field4547);
                                class267.field4296[var12] = true;
                                class284.field4547.method671(arg4, arg1, arg9, arg6);
                                continue;
                            }
                            if (var11.field2831 == 1405) {
                                if (!class323.field5044 && !class39.field495) {
                                    continue;
                                }
                                int var26 = var11.field2705 + var13;
                                int var27 = var14 + 15;
                                if (class323.field5044) {
                                    class435.field6411.method2823("Fps:" + class208.field3333, -1, var27, var26, false, -256);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class435.field6411.method2823("Mem:" + var29 + "k", -1, var27, var26, false, var30);
                                    var27 += 15;
                                    int var31 = class284.field4547.method625() / 1024;
                                    class435.field6411.method2823("Offheap:" + var31 + "k", -1, var27, var26, false, var31 > 65536 ? -65536 : -256);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class106.field1495[var35].method1962(21735);
                                        var33 += class106.field1495[var35].method1970(false);
                                        var34 += class106.field1495[var35].method1967((byte) -115);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class348.method2268(0, true, 2, 0, (long) var37) + "% (" + var36 + "%)";
                                    class292.field4680.method2823(var38, -1, var27, var26, false, -256);
                                    var27 += 12;
                                }
                                if (class386.field5836 > 0) {
                                    class292.field4680.method2823("Particles: " + class441.field6455 + " / " + class386.field5836, -1, var27, var26, false, -256);
                                }
                                var27 += 12;
                                if (class39.field495) {
                                    class292.field4680.method2823("Polys: " + class284.field4547.method618() + " Models: " + class284.field4547.method643(), -1, var27, var26, false, -256);
                                    var27 += 12;
                                    class292.field4680.method2823("Ls: " + class395.field5917 + " La: " + class120.field1645 + " NPC: " + class282.field4535 + " Pl: " + class108.field1509, -1, var27, var26, false, -256);
                                    class8.method97((byte) 116);
                                    var27 += 12;
                                }
                                class267.field4296[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field2707 == 0) {
                            if (!var11.field2712 && client.method1144(var11) && class391.field5872 != var11) {
                                continue;
                            }
                            if (!var11.field2712) {
                                if (var11.field2696 > (var11.field2830 - var11.field2834)) {
                                    var11.field2696 = var11.field2830 - var11.field2834;
                                }
                                if (var11.field2696 < 0) {
                                    var11.field2696 = 0;
                                }
                            }
                            if (var11.field2831 == 1407 && class284.field4547.method657()) {
                                class284.field4547.method642(var13, var14, var11.field2705, var11.field2834);
                            }
                            method2033(var12, var23, var14 - var11.field2696, var11.field2865, var22, arg5, var25, -1, var13 - var11.field2791, var24);
                            if (var11.field2866 != null) {
                                method2033(var12, var23, var14 - var11.field2696, var11.field2865, var22, var11.field2866, var25, -1, var13 - var11.field2791, var24);
                            }
                            class196 var39 = (class196) class392.field5891.method1770(-880, (long) var11.field2865);
                            if (var39 != null) {
                                class35.method228(var22, var25, false, var12, var39.field3171, var23, var24, var14, var13);
                            }
                            if (var11.field2831 == 1407 && class284.field4547.method657()) {
                                class284.field4547.method718();
                                class281.field4511 = true;
                            }
                            class284.field4547.method671(arg4, arg1, arg9, arg6);
                        }
                        if (class27.field310[var12] || class377.field5698 > 1) {
                            if (var11.field2707 == 0 && !var11.field2712 && var11.field2834 < var11.field2830) {
                                class162.method1127(var11.field2696, var11.field2705 + var13, var11.field2830, var11.field2834, -32, var14);
                            }
                            if (var11.field2707 != 1) {
                                if (var11.field2707 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field2697; var41++) {
                                        for (int var42 = 0; var42 < var11.field2692; var42++) {
                                            int var43 = (var11.field2783 + 32) * var42 + var13;
                                            int var44 = var14 + ((var11.field2862 + 32) * var41);
                                            if (var40 < 20) {
                                                var44 += var11.field2729[var40];
                                                var43 += var11.field2846[var40];
                                            }
                                            if (var11.field2858[var40] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field2858[var40] - 1;
                                                if (arg4 < (var43 + 32) && arg9 > var43 && arg1 < var44 + 32 && var44 < arg6 || class129.field2037 == var11 && class92.field1132 == var40) {
                                                    class356 var49;
                                                    if (class374.field5639 == 1 && class386.field5838 == var40 && class288.field4622 == var11.field2865) {
                                                        var49 = class428.method2653((class208) null, class284.field4547, var48, var11.field2720[var40], arg7 ^ 0xFFFFFF9C, 2, var11.field2734, 0);
                                                    } else {
                                                        var49 = class428.method2653((class208) null, class284.field4547, var48, var11.field2720[var40], 75, 1, var11.field2734, -13623264);
                                                    }
                                                    if (var49 == null) {
                                                        class336.method2219((byte) 6, var11);
                                                    } else if (class129.field2037 == var11 && class92.field1132 == var40) {
                                                        int var50 = class287.field4604 - class300.field4764;
                                                        int var51 = class414.field6125 - class262.field4216;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (class105.field1476 < 5) {
                                                            var51 = 0;
                                                            var50 = 0;
                                                        }
                                                        var49.method419(var43 + var51, var44 + var50, 0, -2013265920, 1);
                                                        if (arg3 != -1) {
                                                            class172 var52 = arg5[arg3 & 0xFFFF];
                                                            int[] var53 = new int[4];
                                                            class284.field4547.method654(var53);
                                                            int var54 = var53[1];
                                                            int var55 = var53[3];
                                                            if ((var44 + var50) < var54 && var52.field2696 > 0) {
                                                                int var56 = (var54 - var44 - var50) * class62.field807 / 3;
                                                                if ((class62.field807 * 10) < var56) {
                                                                    var56 = class62.field807 * 10;
                                                                }
                                                                if (var52.field2696 < var56) {
                                                                    var56 = var52.field2696;
                                                                }
                                                                var52.field2696 -= var56;
                                                                class300.field4764 += var56;
                                                                class336.method2219((byte) 6, var52);
                                                            }
                                                            if (var44 + var50 + 32 > var55 && var52.field2696 < var52.field2830 - var52.field2834) {
                                                                int var57 = (var44 + var50 + 32 - var55) * class62.field807 / 3;
                                                                if (var57 > class62.field807 * 10) {
                                                                    var57 = class62.field807 * 10;
                                                                }
                                                                if (var57 > var52.field2830 - var52.field2834 - var52.field2696) {
                                                                    var57 = var52.field2830 - var52.field2834 - var52.field2696;
                                                                }
                                                                class300.field4764 -= var57;
                                                                var52.field2696 += var57;
                                                                class336.method2219((byte) 6, var52);
                                                            }
                                                        }
                                                    } else if (class324.field5075 == var11 && class299.field4752 == var40) {
                                                        var49.method419(var43, var44, 0, -2013265920, 1);
                                                    } else {
                                                        var49.method2327(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field2854 != null && var40 < 20) {
                                                class356 var45 = var11.method1200(var40, -1, class284.field4547);
                                                if (var45 != null) {
                                                    var45.method2327(var43, var44);
                                                } else if (class139.field2162) {
                                                    class336.method2219((byte) 6, var11);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field2707 == 3) {
                                    int var58;
                                    if (class3.method64((byte) 124, var11)) {
                                        var58 = var11.field2750;
                                        if (class391.field5872 == var11 && var11.field2719 != 0) {
                                            var58 = var11.field2719;
                                        }
                                    } else {
                                        var58 = var11.field2772;
                                        if (class391.field5872 == var11 && var11.field2706 != 0) {
                                            var58 = var11.field2706;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field2708) {
                                            class284.field4547.method563(var13, var14, var11.field2705, var11.field2834, var58, 0);
                                        } else {
                                            class284.field4547.method647(var13, var14, var11.field2705, var11.field2834, var58, 0);
                                        }
                                    } else if (var11.field2708) {
                                        class284.field4547.method563(var13, var14, var11.field2705, var11.field2834, var58 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    } else {
                                        class284.field4547.method647(var13, var14, var11.field2705, var11.field2834, var58 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    }
                                } else if (var11.field2707 == 4) {
                                    class452 var59 = var11.method1205(class284.field4547, -124);
                                    if (var59 != null) {
                                        String var60 = var11.field2851;
                                        int var61;
                                        if (class3.method64((byte) 114, var11)) {
                                            var61 = var11.field2750;
                                            if (class391.field5872 == var11 && var11.field2719 != 0) {
                                                var61 = var11.field2719;
                                            }
                                            if (var11.field2788.length() > 0) {
                                                var60 = var11.field2788;
                                            }
                                        } else {
                                            var61 = var11.field2772;
                                            if (class391.field5872 == var11 && var11.field2706 != 0) {
                                                var61 = var11.field2706;
                                            }
                                        }
                                        if (var11.field2712 && var11.field2691 != -1) {
                                            class97 var62 = class155.method1092(true, var11.field2691);
                                            var60 = var62.field1370;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field1299 == 1 || var11.field2848 != 1) && var11.field2848 != -1) {
                                                var60 = "<col=ff9040>" + var60 + "</col> x" + class60.method392(var11.field2848, 70);
                                            }
                                        }
                                        if (class143.field2262 == var11) {
                                            var60 = class121.field1718;
                                            var61 = var11.field2772;
                                        }
                                        if (!var11.field2712) {
                                            var60 = class57.method377(var11, var60, false);
                                        }
                                        if (class13.field191) {
                                            class284.field4547.method682(var13, var14, var11.field2705 + var13, var11.field2834 + var14);
                                        }
                                        var59.method2815(173, var14, class181.field2960, var11.field2802, (int[]) null, (class245) null, var11.field2834, var11.field2690, var11.field2705, var61 | 0xFF000000, var11.field2820, 0, var60, var13, 0, var11.field2871 ? -16777216 : -1);
                                        if (class13.field191) {
                                            class284.field4547.method671(arg4, arg1, arg9, arg6);
                                        }
                                    } else if (class139.field2162) {
                                        class336.method2219((byte) 6, var11);
                                    }
                                } else if (var11.field2707 == 5) {
                                    if (!var11.field2712) {
                                        class356 var63 = var11.method1202(class3.method64((byte) 109, var11), -23559, class284.field4547);
                                        if (var63 != null) {
                                            var63.method2327(var13, var14);
                                        } else if (class139.field2162) {
                                            class336.method2219((byte) 6, var11);
                                        }
                                    } else if (var11.field2728 < 0) {
                                        class356 var65;
                                        if (var11.field2691 == -1) {
                                            var65 = var11.method1202(false, arg7 ^ 0x5C06, class284.field4547);
                                        } else {
                                            class208 var64 = var11.field2826 ? class261.field4201.field3599 : null;
                                            var65 = class428.method2653(var64, class284.field4547, var11.field2691, var11.field2848, 103, var11.field2857, var11.field2734, var11.field2842 | 0xFF000000);
                                        }
                                        if (var65 != null) {
                                            int var66 = var65.method2318();
                                            int var67 = var65.method2315();
                                            if (var11.field2775) {
                                                class284.field4547.method682(var13, var14, var11.field2705 + var13, var11.field2834 + var14);
                                                if (var11.field2796 != 0) {
                                                    int var68 = (var11.field2705 + var66 - 1) / var66;
                                                    int var69 = (var11.field2834 + var67 - 1) / var67;
                                                    for (int var70 = 0; var70 < var68; var70++) {
                                                        for (int var71 = 0; var71 < var69; var71++) {
                                                            var65.method2317((float) var66 / 2.0F + (float) (var13 + (var66 * var70)), (float) var67 / 2.0F + (float) (var67 * var71 + var14), 4096, var11.field2796);
                                                        }
                                                    }
                                                } else if (var15 == 0) {
                                                    var65.method2326(var13, var14, var11.field2705, var11.field2834, 0, 0, 1);
                                                } else {
                                                    var65.method2326(var13, var14, var11.field2705, var11.field2834, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                                }
                                                class284.field4547.method671(arg4, arg1, arg9, arg6);
                                            } else if (var15 != 0) {
                                                int var72 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                                if (var11.field2796 != 0) {
                                                    var65.method2314((float) var11.field2705 / 2.0F + (float) var13, (float) var11.field2834 / 2.0F + (float) var14, var11.field2705 * 4096 / var66, var11.field2796, 1, var72, 1);
                                                } else if (var11.field2705 == var66 && var11.field2834 == var67) {
                                                    var65.method419(var13, var14, 1, var72, 1);
                                                } else {
                                                    var65.method420(var13, var14, var11.field2705, var11.field2834, 1, var72, 1);
                                                }
                                            } else if (var11.field2796 != 0) {
                                                var65.method2317((float) var11.field2705 / 2.0F + (float) var13, (float) var11.field2834 / 2.0F + (float) var14, var11.field2705 * 4096 / var66, var11.field2796);
                                            } else if (var11.field2705 == var66 && var11.field2834 == var67) {
                                                var65.method2327(var13, var14);
                                            } else {
                                                var65.method2320(var13, var14, var11.field2705, var11.field2834);
                                            }
                                        } else if (class139.field2162) {
                                            class336.method2219((byte) 6, var11);
                                        }
                                    } else {
                                        var11.method1201(68).method1821((byte) 104, var11.field2834, class284.field4547, var11.field2849 << 3, var11.field2814 << 3, 0, 0, var13, var11.field2705, var14);
                                    }
                                } else if (var11.field2707 == 6) {
                                    boolean var73 = class3.method64((byte) 127, var11);
                                    int var74;
                                    if (var73) {
                                        var74 = var11.field2819;
                                    } else {
                                        var74 = var11.field2840;
                                    }
                                    class374.method2389(-43);
                                    class348 var75 = null;
                                    int var76 = 0;
                                    if (var11.field2691 != -1) {
                                        class97 var84 = class155.method1092(true, var11.field2691);
                                        if (var84 != null) {
                                            class97 var85 = var84.method731(var11.field2848, (byte) -71);
                                            class417 var86 = var74 == -1 ? null : class156.method1099(var74, arg7 + 125);
                                            class208 var87 = var11.field2826 ? class261.field4201.field3599 : null;
                                            var75 = var85.method728(var86, 1024, arg7 - 9201, class284.field4547, var87, 1, var11.field2754, var11.field2738, var11.field2839);
                                            if (var75 == null) {
                                                class336.method2219((byte) 6, var11);
                                            } else {
                                                var76 = -var75.method57() / 2;
                                            }
                                        }
                                    } else if (var11.field2779 == 5) {
                                        if (var11.field2794 == -1) {
                                            var75 = class8.field104.method1470((class318[]) null, -1, 0, -1, -1, (class417) null, 5, 0, 1024, class284.field4547, -1, (class417) null, true);
                                        } else {
                                            int var77 = var11.field2794;
                                            class219 var78;
                                            if (class39.field500 == var77) {
                                                var78 = class261.field4201;
                                            } else {
                                                var78 = class216.field3517[var77];
                                            }
                                            class417 var79 = var74 == -1 ? null : class156.method1099(var74, 126);
                                            if (var78 != null && (var77 == 2047 || class11.method106(var78.field3588, -10496) == var11.field2843)) {
                                                var75 = var78.field3599.method1470((class318[]) null, var11.field2738, var11.field2839, 0, -1, (class417) null, 5, 0, 1024, class284.field4547, var11.field2754, var79, true);
                                            }
                                        }
                                    } else if (var11.field2779 == 8 || var11.field2779 == 9) {
                                        class33 var81 = class165.method1163(0, var11.field2794);
                                        class417 var82 = var74 == -1 ? null : class156.method1099(var74, arg7 + 119);
                                        if (var81 != null) {
                                            class208 var83 = var11.field2826 ? class261.field4201.field3599 : null;
                                            var75 = var81.method224(var11.field2738, var11.field2839, var83, var11.field2754, class284.field4547, (byte) -34, var11.field2843, var11.field2779 == 9, 1024, var82);
                                        }
                                    } else if (var74 == -1) {
                                        var75 = var11.method1194(1024, -1, class261.field4201.field3599, class284.field4547, (class417) null, 0, -1, 0, var73);
                                        if (var75 == null && class139.field2162) {
                                            class336.method2219((byte) 6, var11);
                                        }
                                    } else {
                                        class417 var80 = class156.method1099(var74, 118);
                                        var75 = var11.method1194(1024, var11.field2738, class261.field4201.field3599, class284.field4547, var80, var11.field2839, var11.field2754, 0, var73);
                                        if (var75 == null && class139.field2162) {
                                            class336.method2219((byte) 6, var11);
                                        }
                                    }
                                    if (var75 != null) {
                                        int var88;
                                        if (var11.field2785 <= 0) {
                                            var88 = 512;
                                        } else {
                                            var88 = (var11.field2705 << 9) / var11.field2785;
                                        }
                                        int var89;
                                        if (var11.field2698 > 0) {
                                            var89 = (var11.field2834 << 9) / var11.field2698;
                                        } else {
                                            var89 = 512;
                                        }
                                        int var90 = var13 - (-(var11.field2705 / 2) - (var11.field2845 * var88 >> 9));
                                        int var91 = var11.field2834 / 2 + var14 + (var11.field2760 * var89 >> 9);
                                        class286.field4594.method1988();
                                        class284.field4547.method693(class286.field4594);
                                        int var92 = class258.field4177[var11.field2771 << 3] * var11.field2860 >> 15;
                                        int var93 = class258.field4173[var11.field2771 << 3] * var11.field2860 >> 15;
                                        class284.field4547.method589(var90, var91, var88, var89);
                                        class284.field4547.method619((float) var11.field2694, var11.field2805 ? (float) var11.field2776 : (float) var11.field2776 * 1.5F);
                                        if (class281.field4511) {
                                            class284.field4547.method609();
                                            class284.field4547.method558();
                                            class284.field4547.method671(arg4, arg1, arg9, arg6);
                                            class281.field4511 = false;
                                        }
                                        if (var11.field2724) {
                                            class284.field4547.method571(false);
                                        }
                                        if (var11.field2712) {
                                            class173.field2878.method1989(-var11.field2725 << 3);
                                            class173.field2878.method1994(var11.field2818 << 3);
                                            class173.field2878.method1995(var11.field2792, var11.field2790 + var76 + var92, var11.field2790 + var93);
                                        } else {
                                            class173.field2878.method1991(var11.field2818 << 3);
                                            class173.field2878.method1995(0, var92, var93);
                                        }
                                        class173.field2878.method1993(var11.field2771 << 3);
                                        if (class13.field191) {
                                            class284.field4547.method682(var13, var14, var13 + var11.field2705, var11.field2834 + var14);
                                        }
                                        if (var11.field2805) {
                                            var75.method49(class173.field2878, (class170) null, var11.field2860, 1);
                                        } else {
                                            var75.method26(class173.field2878, (class170) null, 1);
                                        }
                                        if (class13.field191) {
                                            class284.field4547.method671(arg4, arg1, arg9, arg6);
                                        }
                                        if (var11.field2724) {
                                            class284.field4547.method571(true);
                                        }
                                    }
                                } else {
                                    if (var11.field2707 == 7) {
                                        class452 var94 = var11.method1205(class284.field4547, -127);
                                        if (var94 == null) {
                                            if (class139.field2162) {
                                                class336.method2219((byte) 6, var11);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var96 < var11.field2697; var96++) {
                                            for (int var97 = 0; var97 < var11.field2692; var97++) {
                                                if (var11.field2858[var95] > 0) {
                                                    class97 var98 = class155.method1092(true, var11.field2858[var95] - 1);
                                                    String var99;
                                                    if (var98.field1299 != 1 && var11.field2720[var95] == 1) {
                                                        var99 = "<col=ff9040>" + var98.field1370 + "</col>";
                                                    } else {
                                                        var99 = "<col=ff9040>" + var98.field1370 + "</col> x" + class60.method392(var11.field2720[var95], 109);
                                                    }
                                                    int var100 = (var11.field2783 + 115) * var97 + var13;
                                                    int var101 = (var11.field2862 + 12) * var96 + var14;
                                                    if (var11.field2802 == 0) {
                                                        var94.method2813(var101, var99, (int[]) null, var11.field2871 ? -16777216 : -1, var11.field2772 | 0xFF000000, var100, (byte) 123, class181.field2960);
                                                    } else if (var11.field2802 == 1) {
                                                        var94.method2822((int[]) null, var11.field2871 ? -16777216 : -1, var101, var11.field2772 | 0xFF000000, var99, class181.field2960, false, var100 + 57);
                                                    } else {
                                                        var94.method2826(var99, var101, var100 + 115 - 1, (int[]) null, -76, class181.field2960, var11.field2871 ? -16777216 : -1, var11.field2772 | 0xFF000000);
                                                    }
                                                }
                                                var95++;
                                            }
                                        }
                                    }
                                    if (var11.field2707 == 8 && class318.field4983 == var11 && class311.field4904 == class166.field2612) {
                                        int var102 = 0;
                                        int var103 = 0;
                                        class452 var104 = class435.field6411;
                                        String var105 = var11.field2851;
                                        String var106 = class57.method377(var11, var105, false);
                                        while (var106.length() > 0) {
                                            int var114 = var106.indexOf("<br>");
                                            String var115;
                                            if (var114 == -1) {
                                                var115 = var106;
                                                var106 = "";
                                            } else {
                                                var115 = var106.substring(0, var114);
                                                var106 = var106.substring(var114 + 4);
                                            }
                                            int var116 = class31.field383.method2162(var115, 79);
                                            if (var116 > var102) {
                                                var102 = var116;
                                            }
                                            var103 += class31.field383.field5102 + 1;
                                        }
                                        var103 += 7;
                                        var102 += 6;
                                        int var107 = var13 - (-var11.field2705 - -var102) - 5;
                                        if (var13 + 5 > var107) {
                                            var107 = var13 + 5;
                                        }
                                        int var108 = var11.field2834 + var14 + 5;
                                        if ((var102 + var107) > arg9) {
                                            var107 = arg9 - var102;
                                        }
                                        if (arg6 < var103 + var108) {
                                            var108 = arg6 - var103;
                                        }
                                        class284.field4547.method563(var107, var108, var102, var103, -96, 0);
                                        class284.field4547.method647(var107, var108, var102, var103, -16777216, 0);
                                        String var109 = var11.field2851;
                                        int var110 = class31.field383.field5102 + var108 + 2;
                                        String var111 = class57.method377(var11, var109, false);
                                        while (var111.length() > 0) {
                                            int var112 = var111.indexOf("<br>");
                                            String var113;
                                            if (var112 == -1) {
                                                var113 = var111;
                                                var111 = "";
                                            } else {
                                                var113 = var111.substring(0, var112);
                                                var111 = var111.substring(var112 + 4);
                                            }
                                            var104.method2810(var107 + 3, -1, -16777216, var110, true, var113);
                                            var110 += class31.field383.field5102 + 1;
                                        }
                                    }
                                    if (var11.field2707 == 9) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (var11.field2800) {
                                            var117 = var11.field2705 + var13;
                                            var118 = var13;
                                            var119 = var14 + var11.field2834;
                                            var120 = var14;
                                        } else {
                                            var117 = var13 + var11.field2705;
                                            var118 = var13;
                                            var119 = var14;
                                            var120 = var11.field2834 + var14;
                                        }
                                        if (var11.field2793 == 1) {
                                            class284.field4547.method651(var118, var119, var117, var120, var11.field2772, 0);
                                        } else {
                                            class284.field4547.method630(var118, var119, var117, var120, var11.field2772, var11.field2793, 0);
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

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZIII)V")
    private static final void method2034(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4792++;
        if (class423.field6252 == null) {
            class284.field4547.method2086(arg1, arg0, arg4, -16777216, -765, arg3);
            return;
        }
        class264.field4260++;
        if (class261.field4201 != null && class261.field4201.field724 - (class261.field4201.method903(-116) - 1) * 64 >> 7 == class19.field254 && (class261.field4201.field722 + 64 - (class261.field4201.method903(-66) * 64) >> 7) == class132.field2062) {
            class19.field254 = -1;
            class132.field2062 = -1;
            class375.method2394((byte) 23);
        }
        class136.method998(-103);
        if (!arg2) {
            class160.method1115(113);
        }
        class254.method1756(16705);
        class196.method1370(arg3, arg4, arg0, 2, arg1, true);
        int var6 = class185.field3000;
        int var7 = class115.field1594;
        int var8 = class189.field3099;
        int var9 = class314.field4941;
        if (class13.field194 == 1) {
            int var12 = (int) class316.field4958;
            if (class160.field2532 >> 8 > var12) {
                var12 = class160.field2532 >> 8;
            }
            if (class8.field107[4] && class343.field5290[4] + 128 > var12) {
                var12 = class343.field5290[4] + 128;
            }
            int var13 = (int) class329.field5153 + class201.field3227 & 0x3FFF;
            class269.method1825((var12 >> 3) * 3 + 600, var12, class58.method386(class266.field4286, (byte) -110, class261.field4201.field724, class261.field4201.field722) - 50, class163.field2551, var7, class217.field3555, var13, true);
        } else if (class13.field194 == 4) {
            int var10 = (int) class316.field4958;
            if (var10 < class160.field2532 >> 8) {
                var10 = class160.field2532 >> 8;
            }
            if (class8.field107[4] && var10 < class343.field5290[4] + 128) {
                var10 = class343.field5290[4] + 128;
            }
            int var11 = (int) class329.field5153 & 0x3FFF;
            class269.method1825((var10 >> 3) * 3 + 600, var10, class58.method386(class266.field4286, (byte) -123, class144.field2269, class290.field4639) - 50, class163.field2551, var7, class217.field3555, var11, true);
        } else if (class13.field194 == 5) {
            class143.method1042((byte) -81, var7);
        }
        int var14 = class427.field6301;
        int var15 = class379.field5733;
        int var16 = class290.field4631;
        int var17 = class396.field5928;
        int var18 = class108.field1516;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class8.field107[var19]) {
                int var22 = (int) ((double) (-class145.field2278[var19]) + (double) (class145.field2278[var19] * 2 + 1) * Math.random() + Math.sin((double) class98.field1375[var19] / 100.0D * (double) class403.field6013[var19]) * (double) class343.field5290[var19]);
                if (var19 == 2) {
                    class290.field4631 += var22;
                }
                if (var19 == 1) {
                    class379.field5733 += var22;
                }
                if (var19 == 4) {
                    class396.field5928 += var22;
                    if (class396.field5928 < 1024) {
                        class396.field5928 = 1024;
                    } else if (class396.field5928 > 3072) {
                        class396.field5928 = 3072;
                    }
                }
                if (var19 == 3) {
                    class108.field1516 = class108.field1516 + var22 & 0x3FFF;
                }
                if (var19 == 0) {
                    class427.field6301 += var22;
                }
            }
        }
        if (class427.field6301 < 0) {
            class427.field6301 = 0;
        }
        if (((class156.field2449 << 7) - 1) < class427.field6301) {
            class427.field6301 = (class156.field2449 << 7) - 1;
        }
        if (class290.field4631 < 0) {
            class290.field4631 = 0;
        }
        if (((class361.field5513 << 7) - 1) < class290.field4631) {
            class290.field4631 = (class361.field5513 << 7) - 1;
        }
        class231.method1639(-1);
        class223.method1594(78);
        class284.field4547.method671(var9, var8, var6 + var9, var7 + var8);
        class284.field4547.method558();
        int var20 = class412.field6102;
        if (class221.field3677 == null) {
            class284.field4547.method635(var20);
        } else {
            class221.field3677.method1821((byte) 108, var7, class284.field4547, class396.field5928, class108.field1516, class297.field4727 << 3, var20, var9, var6, var8);
        }
        class409.method2566(true);
        class286.field4594.method1987(class427.field6301, class379.field5733, class290.field4631, -class396.field5928 & 0x3FFF, -class108.field1516 & 0x3FFF, -class264.field4261 & 0x3FFF);
        class284.field4547.method693(class286.field4594);
        class284.field4547.method589(var6 / 2 + var9, var7 / 2 + var8, class301.field4767 << 1, class301.field4767 << 1);
        class30.method205(var8 + (var7 / 2), class301.field4767 << 1, class301.field4767 << 1, var6 / 2 + var9, -111);
        class212.method1492((byte) 70, -class108.field1516 & 0x3FFF, class379.field5733, class290.field4631, class427.field6301, -class264.field4261 & 0x3FFF, -class396.field5928 & 0x3FFF);
        byte var21 = class357.method2331((byte) 84) == 2 ? (byte) class264.field4260 : 1;
        class234.method1661(class284.field4547, class183.field2987, class447.field6501, class286.field4594, class427.field6301, class379.field5733, class290.field4631, class427.field6304, class411.field6091, class414.field6126, class102.field1428, class97.field1305, class377.field5699, class266.field4286 + 1, var21, class261.field4201.field724 >> 7, class261.field4201.field722 >> 7, !class234.field3903);
        class409.method2566(true);
        if (class262.field4219 == 30) {
            class385.method2438(var8, var9, 256, var6, 256, var7, -106);
            class336.method2217(256, var6, var7, 121, 256, var8, var9);
            class208.method1471((byte) 37, var8, var7, var9, var6, 256, 256);
            class214.method1526(var7, var9, var6, var8, (byte) -55);
        }
        class131.method963();
        class396.field5928 = var17;
        if (arg5 <= 19) {
            return;
        }
        class290.field4631 = var16;
        class108.field1516 = var18;
        class427.field6301 = var14;
        class379.field5733 = var15;
        if (class21.field270 && class298.field4739.method1853(-114) == 0) {
            class21.field270 = false;
        }
        if (class21.field270) {
            class284.field4547.method2086(var6, var9, var7, -16777216, -765, var8);
            class136.method996(class330.field5168, false, (byte) -65, class435.field6411);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public final void method193(int arg0) {
        field4784++;
        if (arg0 != 0) {
            method2035(-104);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I")
    public abstract int method1925(int arg0);

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
    public static void method2035(int arg0) {
        field4798 = null;
        if (arg0 != -1) {
            method2036(63, (class279) null, (Frame) null);
        }
        field4790 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILap;Ljava/awt/Frame;)V")
    public static final void method2036(int arg0, class279 arg1, Frame arg2) {
        field4800++;
        while (true) {
            class26 var3 = arg1.method1883((byte) -89, arg2);
            while (var3.field304 == 0) {
                class84.method517((byte) 117, 10L);
            }
            if (var3.field304 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                int var4 = -55 % ((arg0 + 69) / 49);
                return;
            }
            class84.method517((byte) -63, 100L);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILe;IIZLhm;I)V")
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        field4797++;
        if (arg3 != 0) {
            this.field4793 = -23;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        if (arg0 != 0) {
            this.field4794 = 76;
        }
        field4789++;
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    public static final void method2037() {
        class277.method1867(1, class81.field1006);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIII)V")
    public class303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4791 = arg1;
        this.field4801 = arg4;
        this.field4794 = arg5;
        this.field4793 = arg3;
        this.field4786 = arg2;
        this.field4787 = arg0;
        this.field4799 = arg6;
    }
}
