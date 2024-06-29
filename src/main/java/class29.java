import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class29 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field429 = "glow3:";

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Z")
    public static boolean field433 = false;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static void method191(boolean arg0) {
        field429 = null;
        if (arg0) {
            method193(45, 53, true, 94, -48, true, (class189) null, 21, 90, 98, 90);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBI)V")
    public static final void method192(int arg0, byte arg1, int arg2) {
        if (class53.field929 != arg2) {
            class175.field2883 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class175.field2883[var3] = (var3 << 12) / arg2;
            }
            class153.field2569 = arg2 * 32;
            class35.field504 = arg2 - 1;
            class53.field929 = arg2;
        }
        field436++;
        if (arg1 > -84 || class209.field3540 == arg0) {
            return;
        }
        if (class53.field929 == arg0) {
            class206.field3389 = class175.field2883;
        } else {
            class206.field3389 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class206.field3389[var4] = (var4 << 12) / arg0;
            }
        }
        class209.field3540 = arg0;
        class125.field2189 = arg0 - 1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIZIIZLta;IIII)V")
    public static final void method193(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, class189 arg6, int arg7, int arg8, int arg9, int arg10) {
        field434++;
        if (arg2 && !class96.method610(arg7 - 335442796) && (class229.field3862[0][arg8][arg4] & 0x2) == 0) {
            if ((class229.field3862[arg10][arg8][arg4] & 0x10) != 0) {
                return;
            }
            if (class194.method1270(2, arg8, arg4, arg10) != class145.field2476) {
                return;
            }
        }
        if (arg10 < class19.field304) {
            class19.field304 = arg10;
        }
        class206 var11 = class10.method64(64, arg9);
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var12 = var11.field3404;
            var13 = var11.field3377;
        } else {
            var12 = var11.field3377;
            var13 = var11.field3404;
        }
        int var14;
        int var15;
        if (arg8 + var12 <= 104) {
            var14 = (var12 >> 1) + arg8;
            var15 = (var12 + 1 >> 1) + arg8;
        } else {
            var15 = arg8 + 1;
            var14 = arg8;
        }
        int var16;
        int var17;
        if ((arg4 + var13) > 104) {
            var16 = arg4;
            var17 = arg4 + 1;
        } else {
            var17 = (var13 + 1 >> 1) + arg4;
            var16 = (var13 >> 1) + arg4;
        }
        int[][] var18 = class95.field1642[arg1];
        int var19 = var18[var14][var17] + var18[var15][var16] + var18[var14][var16] + var18[var15][var17] >> 2;
        int var20 = (arg8 << 7) + (var12 << 6);
        int var21 = (arg4 << 7) + (var13 << 6);
        int[][] var22 = null;
        if (arg5) {
            var22 = class78.field1342[0];
        } else if (arg1 < 3) {
            var22 = class95.field1642[arg1 + 1];
        }
        long var23 = (long) (arg4 << 7 | arg8 | arg3 << 14 | arg0 << 20 | 0x40000000);
        if (var11.field3432 == 0 || arg5) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field3417 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field3442) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg9 << 32;
        if (var11.method1365(-30552)) {
            class155.method1066(arg4, (class288) null, arg10, (class141) null, arg0, 6330, arg8, var11);
        }
        boolean var27 = !arg5 & var11.field3421;
        int var28 = var11.field3400;
        if (arg7 != 335442796) {
            return;
        }
        if (arg3 == 22) {
            if (class172.field2828 || var11.field3432 != 0 || var11.field3387 == 1 || var11.field3436) {
                class184 var30;
                if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                    class160 var29 = var11.method1374(var19, -24050, var21, 22, (class148) null, var27, var22, var18, arg2, arg0, var20);
                    var30 = var29.field2667;
                } else {
                    var30 = new class35(arg9, 22, arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
                }
                class247.method1650(arg10, arg8, arg4, var19, var30, var25, var11.field3439);
                if (var11.field3387 == 1 && arg6 != null) {
                    arg6.method1240(arg4, arg8, (byte) -53);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class184 var70;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var69 = var11.method1374(var19, -24050, var21, 10, (class148) null, var27, var22, var18, arg2, arg3 == 11 ? arg0 + 4 : arg0, var20);
                var70 = var69.field2667;
            } else {
                var70 = new class35(arg9, 10, arg3 == 11 ? arg0 + 4 : arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            if (var70 != null) {
                boolean var71 = class144.method999(arg10, arg8, arg4, var19, var12, var13, var70, 0, var25);
                if (var11.field3434 && var71 && arg2) {
                    int var72 = 15;
                    if (var70 instanceof class279) {
                        var72 = ((class279) var70).method98() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var12; var73++) {
                        for (int var74 = 0; var74 <= var13; var74++) {
                            if (class177.field2912[arg10][arg8 + var73][arg4 + var74] < var72) {
                                class177.field2912[arg10][arg8 + var73][arg4 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field3387 != 0 && arg6 != null) {
                arg6.method1233(arg8, arg4, (byte) 42, var13, var12, var11.field3403, !var11.field3406);
            }
        } else if (arg3 >= 12) {
            class184 var32;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var31 = var11.method1374(var19, -24050, var21, arg3, (class148) null, var27, var22, var18, arg2, arg0, var20);
                var32 = var31.field2667;
            } else {
                var32 = new class35(arg9, arg3, arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class144.method999(arg10, arg8, arg4, var19, 1, 1, var32, 0, var25);
            if (arg2 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg10 > 0 && var11.field3383 != 0) {
                class107.field1908[arg10][arg8][arg4] = class112.method789(class107.field1908[arg10][arg8][arg4], 4);
            }
            if (var11.field3387 != 0 && arg6 != null) {
                arg6.method1233(arg8, arg4, (byte) 42, var13, var12, var11.field3403, !var11.field3406);
            }
        } else if (arg3 == 0) {
            class184 var34;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var33 = var11.method1374(var19, -24050, var21, 0, (class148) null, var27, var22, var18, arg2, arg0, var20);
                var34 = var33.field2667;
            } else {
                var34 = new class35(arg9, 0, arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class225.method1510(arg10, arg8, arg4, var19, var34, (class184) null, class6.field78[arg0], 0, var25);
            if (arg2) {
                if (arg0 == 0) {
                    if (var11.field3434) {
                        class177.field2912[arg10][arg8][arg4] = 50;
                        class177.field2912[arg10][arg8][arg4 + 1] = 50;
                    }
                    if (var11.field3383 == 1) {
                        class107.field1908[arg10][arg8][arg4] = class112.method789(class107.field1908[arg10][arg8][arg4], 1);
                    }
                } else if (arg0 == 1) {
                    if (var11.field3434) {
                        class177.field2912[arg10][arg8][arg4 + 1] = 50;
                        class177.field2912[arg10][arg8 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field3383 == 1) {
                        class107.field1908[arg10][arg8][arg4 + 1] = class112.method789(class107.field1908[arg10][arg8][arg4 + 1], 2);
                    }
                } else if (arg0 == 2) {
                    if (var11.field3434) {
                        class177.field2912[arg10][arg8 + 1][arg4] = 50;
                        class177.field2912[arg10][arg8 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field3383 == 1) {
                        class107.field1908[arg10][arg8 + 1][arg4] = class112.method789(class107.field1908[arg10][arg8 + 1][arg4], 1);
                    }
                } else if (arg0 == 3) {
                    if (var11.field3434) {
                        class177.field2912[arg10][arg8][arg4] = 50;
                        class177.field2912[arg10][arg8 + 1][arg4] = 50;
                    }
                    if (var11.field3383 == 1) {
                        class107.field1908[arg10][arg8][arg4] = class112.method789(class107.field1908[arg10][arg8][arg4], 2);
                    }
                }
            }
            if (var11.field3387 != 0 && arg6 != null) {
                arg6.method1242(arg3, arg0, !var11.field3406, arg8, var11.field3403, arg7 - 335442897, arg4);
            }
            if (var11.field3378 != 16) {
                class194.method1273(arg10, arg8, arg4, var11.field3378);
            }
        } else if (arg3 == 1) {
            class184 var36;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var35 = var11.method1374(var19, -24050, var21, 1, (class148) null, var27, var22, var18, arg2, arg0, var20);
                var36 = var35.field2667;
            } else {
                var36 = new class35(arg9, 1, arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class225.method1510(arg10, arg8, arg4, var19, var36, (class184) null, class254.field4150[arg0], 0, var25);
            if (var11.field3434 && arg2) {
                if (arg0 == 0) {
                    class177.field2912[arg10][arg8][arg4 + 1] = 50;
                } else if (arg0 == 1) {
                    class177.field2912[arg10][arg8 + 1][arg4 + 1] = 50;
                } else if (arg0 == 2) {
                    class177.field2912[arg10][arg8 + 1][arg4] = 50;
                } else if (arg0 == 3) {
                    class177.field2912[arg10][arg8][arg4] = 50;
                }
            }
            if (var11.field3387 != 0 && arg6 != null) {
                arg6.method1242(arg3, arg0, !var11.field3406, arg8, var11.field3403, -115, arg4);
            }
        } else if (arg3 == 2) {
            int var37 = arg0 + 1 & 0x3;
            class184 var39;
            class184 var41;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var38 = var11.method1374(var19, arg7 - 335466846, var21, 2, (class148) null, var27, var22, var18, arg2, arg0 + 4, var20);
                var39 = var38.field2667;
                class160 var40 = var11.method1374(var19, -24050, var21, 2, (class148) null, var27, var22, var18, arg2, var37, var20);
                var41 = var40.field2667;
            } else {
                var39 = new class35(arg9, 2, arg0 + 4, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
                var41 = new class35(arg9, 2, var37, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class225.method1510(arg10, arg8, arg4, var19, var39, var41, class6.field78[arg0], class6.field78[var37], var25);
            if (var11.field3383 == 1 && arg2) {
                if (arg0 == 0) {
                    class107.field1908[arg10][arg8][arg4] = class112.method789(class107.field1908[arg10][arg8][arg4], 1);
                    class107.field1908[arg10][arg8][arg4 + 1] = class112.method789(class107.field1908[arg10][arg8][arg4 + 1], 2);
                } else if (arg0 == 1) {
                    class107.field1908[arg10][arg8][arg4 + 1] = class112.method789(class107.field1908[arg10][arg8][arg4 + 1], 2);
                    class107.field1908[arg10][arg8 + 1][arg4] = class112.method789(class107.field1908[arg10][arg8 + 1][arg4], 1);
                } else if (arg0 == 2) {
                    class107.field1908[arg10][arg8 + 1][arg4] = class112.method789(class107.field1908[arg10][arg8 + 1][arg4], 1);
                    class107.field1908[arg10][arg8][arg4] = class112.method789(class107.field1908[arg10][arg8][arg4], 2);
                } else if (arg0 == 3) {
                    class107.field1908[arg10][arg8][arg4] = class112.method789(class107.field1908[arg10][arg8][arg4], 2);
                    class107.field1908[arg10][arg8][arg4] = class112.method789(class107.field1908[arg10][arg8][arg4], 1);
                }
            }
            if (var11.field3387 != 0 && arg6 != null) {
                arg6.method1242(arg3, arg0, !var11.field3406, arg8, var11.field3403, -123, arg4);
            }
            if (var11.field3378 != 16) {
                class194.method1273(arg10, arg8, arg4, var11.field3378);
            }
        } else if (arg3 == 3) {
            class184 var43;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var42 = var11.method1374(var19, arg7 ^ 0xEC01D162, var21, 3, (class148) null, var27, var22, var18, arg2, arg0, var20);
                var43 = var42.field2667;
            } else {
                var43 = new class35(arg9, 3, arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class225.method1510(arg10, arg8, arg4, var19, var43, (class184) null, class254.field4150[arg0], 0, var25);
            if (var11.field3434 && arg2) {
                if (arg0 == 0) {
                    class177.field2912[arg10][arg8][arg4 + 1] = 50;
                } else if (arg0 == 1) {
                    class177.field2912[arg10][arg8 + 1][arg4 + 1] = 50;
                } else if (arg0 == 2) {
                    class177.field2912[arg10][arg8 + 1][arg4] = 50;
                } else if (arg0 == 3) {
                    class177.field2912[arg10][arg8][arg4] = 50;
                }
            }
            if (var11.field3387 != 0 && arg6 != null) {
                arg6.method1242(arg3, arg0, !var11.field3406, arg8, var11.field3403, arg7 - 335442890, arg4);
            }
        } else if (arg3 == 9) {
            class184 var45;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var44 = var11.method1374(var19, -24050, var21, arg3, (class148) null, var27, var22, var18, arg2, arg0, var20);
                var45 = var44.field2667;
            } else {
                var45 = new class35(arg9, arg3, arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class144.method999(arg10, arg8, arg4, var19, 1, 1, var45, 0, var25);
            if (var11.field3387 != 0 && arg6 != null) {
                arg6.method1233(arg8, arg4, (byte) 42, var13, var12, var11.field3403, !var11.field3406);
            }
            if (var11.field3378 != 16) {
                class194.method1273(arg10, arg8, arg4, var11.field3378);
            }
        } else if (arg3 == 4) {
            class184 var47;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var46 = var11.method1374(var19, -24050, var21, 4, (class148) null, var27, var22, var18, arg2, arg0, var20);
                var47 = var46.field2667;
            } else {
                var47 = new class35(arg9, 4, arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class123.method845(arg10, arg8, arg4, var19, var47, (class184) null, class6.field78[arg0], 0, 0, 0, var25);
        } else if (arg3 == 5) {
            long var48 = class112.method784(arg10, arg8, arg4);
            int var50 = 16;
            if (var48 != 0L) {
                var50 = class10.method64(64, Integer.MAX_VALUE & (int) (var48 >>> 32)).field3378;
            }
            class184 var52;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var51 = var11.method1374(var19, -24050, var21, 4, (class148) null, var27, var22, var18, arg2, arg0, var20);
                var52 = var51.field2667;
            } else {
                var52 = new class35(arg9, 4, arg0, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class123.method845(arg10, arg8, arg4, var19, var52, (class184) null, class6.field78[arg0], 0, class84.field1517[arg0] * var50, class152.field2542[arg0] * var50, var25);
        } else if (arg3 == 6) {
            int var53 = 8;
            long var54 = class112.method784(arg10, arg8, arg4);
            if (var54 != 0L) {
                var53 = class10.method64(arg7 ^ 0x13FE732C, Integer.MAX_VALUE & (int) (var54 >>> 32)).field3378 / 2;
            }
            class184 var57;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var56 = var11.method1374(var19, arg7 ^ 0xEC01D162, var21, 4, (class148) null, var27, var22, var18, arg2, arg0 + 4, var20);
                var57 = var56.field2667;
            } else {
                var57 = new class35(arg9, 4, arg0 + 4, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class123.method845(arg10, arg8, arg4, var19, var57, (class184) null, 256, arg0, class112.field2023[arg0] * var53, class250.field4091[arg0] * var53, var25);
        } else if (arg3 == 7) {
            int var58 = arg0 + 2 & 0x3;
            class184 var60;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var59 = var11.method1374(var19, -24050, var21, 4, (class148) null, var27, var22, var18, arg2, var58 + 4, var20);
                var60 = var59.field2667;
            } else {
                var60 = new class35(arg9, 4, var58 + 4, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class123.method845(arg10, arg8, arg4, var19, var60, (class184) null, 256, var58, 0, 0, var25);
        } else if (arg3 == 8) {
            int var61 = 8;
            long var62 = class112.method784(arg10, arg8, arg4);
            if (var62 != 0L) {
                var61 = class10.method64(64, Integer.MAX_VALUE & (int) (var62 >>> 32)).field3378 / 2;
            }
            int var64 = arg0 + 2 & 0x3;
            class184 var66;
            class184 var68;
            if (var28 == -1 && var11.field3373 == null && !var11.field3422) {
                class160 var65 = var11.method1374(var19, -24050, var21, 4, (class148) null, var27, var22, var18, arg2, arg0 + 4, var20);
                var66 = var65.field2667;
                class160 var67 = var11.method1374(var19, -24050, var21, 4, (class148) null, var27, var22, var18, arg2, var64 + 4, var20);
                var68 = var67.field2667;
            } else {
                var66 = new class35(arg9, 4, arg0 + 4, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
                var68 = new class35(arg9, 4, var64 + 4, arg1, arg8, arg4, var28, var11.field3395, (class184) null);
            }
            class123.method845(arg10, arg8, arg4, var19, var66, var68, 256, arg0, class112.field2023[arg0] * var61, class250.field4091[arg0] * var61, var25);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static final void method194(int arg0) {
        field430++;
        class79.field1362.method58(0);
        if (arg0 < 112) {
            method195(true, 31, 93, true, -102);
        }
        class274.field4390.method58(0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZIIZI)V")
    public static final void method195(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field431++;
        if (arg4 != -19476) {
            method192(-17, (byte) -126, -102);
        }
        class69.method423(class237.field3908.length - 1, 0, arg1, arg2, arg3, -87, arg0);
    }
}
