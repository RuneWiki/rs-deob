import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class198 extends class134 {

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
    public int[] field3078 = new int[1];

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
    public int[] field3086 = new int[] { -1 };

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3079 = 0;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3081 = "Select";

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Z")
    public static boolean field3082 = false;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
    public static int[] field3083 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "[I")
    public static int[] field3084 = new int[1000];

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "[I")
    public static int[] field3085 = new int[32];

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Lub;")
    public static class92 field3087;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
    public static final void method1404(byte arg0, int arg1) {
        if (arg0 <= 5) {
            return;
        }
        class266.field4209 = arg1;
        class246.field3912 = -1;
        field3080++;
        class220.field3361 = null;
        class270.field4277 = 0;
        class74.field1140 = -1;
        class105.field1640 = 1;
        class108.field1682 = false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class122 var20 = new class122(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class149.field2210[var21][arg1][arg2] == null) {
                    class149.field2210[var21][arg1][arg2] = new class22(var21, arg1, arg2);
                }
            }
            class149.field2210[arg0][arg1][arg2].field368 = var20;
        } else if (arg3 == 1) {
            class122 var22 = new class122(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class149.field2210[var23][arg1][arg2] == null) {
                    class149.field2210[var23][arg1][arg2] = new class22(var23, arg1, arg2);
                }
            }
            class149.field2210[arg0][arg1][arg2].field368 = var22;
        } else {
            class1 var24 = new class1(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class149.field2210[var25][arg1][arg2] == null) {
                    class149.field2210[var25][arg1][arg2] = new class22(var25, arg1, arg2);
                }
            }
            class149.field2210[arg0][arg1][arg2].field373 = var24;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1406(boolean arg0) {
        field3081 = null;
        field3085 = null;
        field3083 = null;
        field3087 = null;
        if (arg0) {
            field3082 = false;
        }
        field3084 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1407(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3077++;
        if (class173.field2658 == 0) {
            int var7 = class206.field3169;
            int var8 = class238.field3752;
            int var9 = class86.field1284;
            int var10 = class170.field2572;
            int var11 = (arg5 - arg2) * (var8 - var7) / arg0 + var7;
            int var12 = (arg6 - arg3) * (var10 - var9) / arg1 + var9;
            if (class162.field2438 && (class28.field486 & 0x40) != 0) {
                class222 var13 = class77.method605(class305.field4894, class84.field1258, (byte) -32);
                if (var13 == null) {
                    class184.method1316((byte) 126);
                } else {
                    class41.method365((short) 25, class203.field3131, (byte) -89, 0L, " ->", class201.field3104, var12, var11);
                }
            } else {
                class36.field619++;
                if (class152.field2248 == 1) {
                    class41.method365((short) 12, -1, (byte) -89, 0L, "", class161.field2420, var12, var11);
                }
                class41.method365((short) 5, -1, (byte) -89, 0L, "", class54.field852, var12, var11);
            }
        }
        long var14 = -1L;
        int var16 = 0;
        if (arg4 != -78) {
            field3079 = 103;
        }
        while (class62.field982 > var16) {
            long var17 = class110.field1697[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                label372: {
                    var14 = var17;
                    if (var21 == 2 && class174.method1248(class130.field1941, var19, var20, var17)) {
                        class295 var23 = class166.method1209(-115, var22);
                        if (var23.field4598 != null) {
                            var23 = var23.method1956(25748);
                        }
                        if (var23 == null) {
                            break label372;
                        }
                        if (class173.field2658 == 1) {
                            class152.field2241++;
                            class41.method365((short) 29, class265.field4194, (byte) -89, var17, class202.field3120 + " -> <col=00ffff>" + var23.field4582, class196.field3067, var20, var19);
                        } else if (class162.field2438) {
                            class238 var28 = class149.field2213 == -1 ? null : class55.method463(0, class149.field2213);
                            if ((class28.field486 & 0x4) != 0 && (var28 == null || var23.method1963(arg4 + 65613, class149.field2213, var28.field3753) != var28.field3753)) {
                                class41.method365((short) 23, class203.field3131, (byte) -89, var17, class202.field3119 + " -> <col=00ffff>" + var23.field4582, class201.field3104, var20, var19);
                                class24.field424++;
                            }
                        } else {
                            String[] var24 = var23.field4629;
                            if (class221.field3382) {
                                var24 = class200.method1414(arg4 - 44, var24);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; var25--) {
                                    if (var24[var25] != null) {
                                        class209.field3240++;
                                        int var26 = -1;
                                        if (var23.field4607 == var25) {
                                            var26 = var23.field4636;
                                        }
                                        if (var23.field4634 == var25) {
                                            var26 = var23.field4577;
                                        }
                                        short var27 = 0;
                                        if (var25 == 0) {
                                            var27 = 30;
                                        }
                                        if (var25 == 1) {
                                            var27 = 2;
                                        }
                                        if (var25 == 2) {
                                            var27 = 36;
                                        }
                                        if (var25 == 3) {
                                            var27 = 1;
                                        }
                                        if (var25 == 4) {
                                            var27 = 1007;
                                        }
                                        class41.method365(var27, var26, (byte) -89, var17, "<col=00ffff>" + var23.field4582, var24[var25], var20, var19);
                                    }
                                }
                            }
                            class41.method365((short) 1002, class37.field631, (byte) -89, (long) var23.field4584, "<col=00ffff>" + var23.field4582, class264.field4179, var20, var19);
                            class265.field4193++;
                        }
                    }
                    if (var21 == 1) {
                        class161 var29 = class116.field1781[var22];
                        if ((var29.field2421.field1539 & 0x1) == 0 && (var29.field4725 & 0x7F) == 0 && (var29.field4709 & 0x7F) == 0 || (var29.field2421.field1539 & 0x1) == 1 && (var29.field4725 & 0x7F) == 64 && (var29.field4709 & 0x7F) == 64) {
                            int var30 = var29.field4725 + 64 - (var29.field2421.field1539 * 64);
                            int var31 = var29.field4709 + 64 - (var29.field2421.field1539 * 64);
                            for (int var32 = 0; var32 < class117.field1782; var32++) {
                                class161 var37 = class116.field1781[class255.field4084[var32]];
                                if (var37 != null && !var37.field4772 && var29 != var37 && var37.field4687) {
                                    int var38 = var37.field4725 + 64 - (var37.field2421.field1539 * 64);
                                    int var39 = var37.field4709 - ((var37.field2421.field1539 - 1) * 64);
                                    if (var38 >= var30 && var37.field2421.field1539 <= (var29.field2421.field1539 - (var38 - var30 >> 7)) && var31 <= var39 && var29.field2421.field1539 - (var39 - var31 >> 7) >= var37.field2421.field1539) {
                                        class98.method765(var19, arg4 - 11868, var37.field2421, class255.field4084[var32], var20);
                                        var37.field4772 = true;
                                    }
                                }
                            }
                            for (int var33 = 0; var33 < class259.field4112; var33++) {
                                class136 var34 = class233.field3682[class26.field455[var33]];
                                if (var34 != null && !var34.field4772 && var34.field4687) {
                                    int var35 = var34.field4725 - ((var34.method1013(0) - 1) * 64);
                                    int var36 = var34.field4709 - (var34.method1013(0) - 1) * 64;
                                    if (var35 >= var30 && var34.method1013(0) <= (var29.field2421.field1539 - (var35 - var30 >> 7)) && var31 <= var36 && var34.method1013(arg4 + 78) <= (var29.field2421.field1539 - (var36 - var31 >> 7))) {
                                        class174.method1247(var34, class26.field455[var33], -123, var19, var20);
                                        var34.field4772 = true;
                                    }
                                }
                            }
                        }
                        if (var29.field4772) {
                            break label372;
                        }
                        class98.method765(var19, -11946, var29.field2421, var22, var20);
                        var29.field4772 = true;
                    }
                    if (var21 == 0) {
                        class136 var40 = class233.field3682[var22];
                        if ((var40.field4725 & 0x7F) == 64 && (var40.field4709 & 0x7F) == 64) {
                            int var41 = var40.field4725 - (var40.method1013(0) - 1) * 64;
                            int var42 = var40.field4709 - (var40.method1013(0) - 1) * 64;
                            for (int var43 = 0; var43 < class117.field1782; var43++) {
                                class161 var48 = class116.field1781[class255.field4084[var43]];
                                if (var48 != null && !var48.field4772 && var48.field4687) {
                                    int var49 = var48.field4725 + 64 - (var48.field2421.field1539 * 64);
                                    int var50 = var48.field4709 - ((var48.field2421.field1539 - 1) * 64);
                                    if (var41 <= var49 && var48.field2421.field1539 <= var40.method1013(0) - (var49 - var41 >> 7) && var42 <= var50 && var48.field2421.field1539 <= (var40.method1013(0) - (var50 - var42 >> 7))) {
                                        class98.method765(var19, -11946, var48.field2421, class255.field4084[var43], var20);
                                        var48.field4772 = true;
                                    }
                                }
                            }
                            for (int var44 = 0; var44 < class259.field4112; var44++) {
                                class136 var45 = class233.field3682[class26.field455[var44]];
                                if (var45 != null && !var45.field4772 && var40 != var45 && var45.field4687) {
                                    int var46 = var45.field4725 + 64 - (var45.method1013(0) * 64);
                                    int var47 = var45.field4709 - (var45.method1013(0) - 1) * 64;
                                    if (var46 >= var41 && var45.method1013(0) <= (var40.method1013(0) - (var46 - var41 >> 7)) && var47 >= var42 && var45.method1013(0) <= var40.method1013(0) - (var47 - var42 >> 7)) {
                                        class174.method1247(var45, class26.field455[var44], 51, var19, var20);
                                        var45.field4772 = true;
                                    }
                                }
                            }
                        }
                        if (var40.field4772) {
                            break label372;
                        }
                        class174.method1247(var40, var22, 67, var19, var20);
                        var40.field4772 = true;
                    }
                    if (var21 == 3) {
                        class2 var51 = class110.field1695[class130.field1941][var19][var20];
                        if (var51 != null) {
                            for (class57 var52 = (class57) var51.method5((byte) 79); var52 != null; var52 = (class57) var51.method2(8)) {
                                int var53 = var52.field898.field3900;
                                class179 var54 = class123.method929(22497, var53);
                                if (class173.field2658 == 1) {
                                    class41.method365((short) 32, class265.field4194, (byte) -89, (long) var53, class202.field3120 + " -> <col=ff9040>" + var54.field2778, class196.field3067, var20, var19);
                                    class297.field4774++;
                                } else if (class162.field2438) {
                                    class238 var55 = class149.field2213 == -1 ? null : class55.method463(arg4 ^ 0xFFFFFFB2, class149.field2213);
                                    if ((class28.field486 & 0x1) != 0 && (var55 == null || var54.method1277(var55.field3753, class149.field2213, 94) != var55.field3753)) {
                                        class41.method365((short) 31, class203.field3131, (byte) -89, (long) var53, class202.field3119 + " -> <col=ff9040>" + var54.field2778, class201.field3104, var20, var19);
                                        class279.field4427++;
                                    }
                                } else {
                                    class77.field1183++;
                                    String[] var56 = var54.field2754;
                                    if (class221.field3382) {
                                        var56 = class200.method1414(-62, var56);
                                    }
                                    for (int var57 = 4; var57 >= 0; var57--) {
                                        if (var56 != null && var56[var57] != null) {
                                            class266.field4211++;
                                            byte var58 = 0;
                                            if (var57 == 0) {
                                                var58 = 57;
                                            }
                                            if (var57 == 1) {
                                                var58 = 16;
                                            }
                                            if (var57 == 2) {
                                                var58 = 42;
                                            }
                                            if (var57 == 3) {
                                                var58 = 51;
                                            }
                                            int var59 = -1;
                                            if (var54.field2807 == var57) {
                                                var59 = var54.field2749;
                                            }
                                            if (var57 == 4) {
                                                var58 = 21;
                                            }
                                            if (var54.field2808 == var57) {
                                                var59 = var54.field2784;
                                            }
                                            class41.method365(var58, var59, (byte) -89, (long) var53, "<col=ff9040>" + var54.field2778, var56[var57], var20, var19);
                                        }
                                    }
                                    class41.method365((short) 1004, class37.field631, (byte) -89, (long) var53, "<col=ff9040>" + var54.field2778, class264.field4179, var20, var19);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }
}
