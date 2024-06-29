import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class119 extends class129 {

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public int field2939 = 0;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lmc;")
    public static class75 field2938 = class30.method234(true, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "Lmc;")
    private static class75 field2930 = class30.method234(true, "Please contact customer support)3");

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lmc;")
    public static class75 field2934 = class30.method234(true, "@yel@");

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "Lmc;")
    public static class75 field2943 = field2930;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "Lmc;")
    private static class75 field2944 = class30.method234(true, " is already on your ignore list");

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Lmc;")
    public static class75 field2932 = field2944;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "J")
    public static long field2946;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lpb;")
    public static class92 field2947;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
    public static int[] field2933;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIIII)V", line = 13)
    public static final void method947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2937++;
        if (!class129.method1013(arg4, -1) || (arg1 < arg7 || arg8 > arg6 || arg5 <= arg1 || arg2 <= arg6)) {
            return;
        }
        class99[] var11 = class74.field1854[arg4];
        for (int var12 = arg0; var12 < var11.length; var12++) {
            class99 var13 = var11[var12];
            if (var13 != null && var13.field2556 == arg10) {
                int var14 = var13.field2524 + arg7;
                int var15 = var13.field2504 + arg8 - arg3;
                if (var13.field2535 == 8 && arg1 >= var14 && arg6 >= var15 && var13.field2548 + var14 > arg1 && var13.field2546 + var15 > arg6) {
                    class125.field3045 = var12;
                }
                if ((var13.field2508 >= 0 || var13.field2543 != 0) && var14 <= arg1 && arg6 >= var15 && var13.field2548 + var14 > arg1 && var13.field2546 + var15 > arg6) {
                    if (var13.field2508 >= 0) {
                        class86.field2138 = var13.field2508;
                    } else {
                        class86.field2138 = var12;
                    }
                }
                if (var13.field2535 != 0) {
                    if (var13.field2498 == 1 && var14 <= arg1 && arg6 >= var15 && arg1 < var14 + var13.field2548 && arg6 < var13.field2546 + var15) {
                        boolean var16 = false;
                        if (var13.field2503 != 0) {
                            var16 = class122.method963(var13, 33);
                        }
                        if (!var16) {
                            class85.method703(0, -75, class16.field309, var13.field2560, 0, 42, (arg4 << 16) + var12);
                            class47.field1126++;
                        }
                    }
                    if (var13.field2498 == 2 && class17.field332 == 0 && arg1 >= var14 && var15 <= arg6 && var14 + var13.field2548 > arg1 && var13.field2546 + var15 > arg6) {
                        class16.field317++;
                        class85.method703(0, 112, class69.method586(new class75[] { class55.field1404, var13.field2500 }, (byte) 83), var13.field2527, 0, 49, (arg4 << 16) + var12);
                    }
                    if (var13.field2498 == 3 && arg1 >= var14 && arg6 >= var15 && arg1 < var13.field2548 + var14 && var15 + var13.field2546 > arg6) {
                        class30.field669++;
                        byte var17;
                        if (arg9 == 3) {
                            var17 = 55;
                        } else {
                            var17 = 54;
                        }
                        class85.method703(0, 71, class16.field309, class21.field423, 0, var17, (arg4 << 16) + var12);
                    }
                    if (var13.field2498 == 4 && arg1 >= var14 && var15 <= arg6 && var13.field2548 + var14 > arg1 && arg6 < var15 + var13.field2546) {
                        class85.method703(0, arg0 ^ 0x3A, class16.field309, var13.field2560, 0, 15, (arg4 << 16) + var12);
                        class10.field176++;
                    }
                    if (var13.field2498 == 5 && var14 <= arg1 && var15 <= arg6 && arg1 < var13.field2548 + var14 && arg6 < var13.field2546 + var15) {
                        class82.field2050++;
                        class85.method703(0, 121, class16.field309, var13.field2560, 0, 8, (arg4 << 16) + var12);
                    }
                    if (var13.field2498 == 6 && !class75.field1894 && var14 <= arg1 && arg6 >= var15 && var13.field2548 + var14 > arg1 && arg6 < var13.field2546 + var15) {
                        class85.method703(0, -117, class16.field309, var13.field2560, 0, 22, (arg4 << 16) + var12);
                        class107.field2661++;
                    }
                    if (var13.field2535 == 2) {
                        int var18 = 0;
                        for (int var19 = 0; var19 < var13.field2546; var19++) {
                            for (int var20 = 0; var20 < var13.field2548; var20++) {
                                int var21 = (var13.field2494 + 32) * var20 + var14;
                                int var22 = (var13.field2530 + 32) * var19 + var15;
                                if (var18 < 20) {
                                    var21 += var13.field2542[var18];
                                    var22 += var13.field2517[var18];
                                }
                                if (arg1 >= var21 && arg6 >= var22 && arg1 < var21 + 32 && var22 + 32 > arg6) {
                                    class118.field2928 = var18;
                                    class131.field3192 = (arg4 << 16) + var12;
                                    if (var13.field2520[var18] > 0) {
                                        class10 var23 = class43.method326(var13.field2520[var18] - 1, 0);
                                        if (class42.field1013 == 1 && var13.field2518) {
                                            if ((arg4 << 16) + var12 != field2940 || class98.field2478 != var18) {
                                                class85.method703(var18, 113, class69.method586(new class75[] { class64.field1688, class85.field2093, var23.field204 }, (byte) 46), class82.field2041, var23.field160, 28, (arg4 << 16) + var12);
                                                class71.field1815++;
                                            }
                                        } else if (class17.field332 != 1 || !var13.field2518) {
                                            class27.field573++;
                                            class75[] var24 = var23.field169;
                                            if (class127.field3106) {
                                                var24 = class86.method717(var24, (byte) -122);
                                            }
                                            if (var13.field2518) {
                                                for (int var25 = 4; var25 >= 3; var25--) {
                                                    if (var24 != null && var24[var25] != null) {
                                                        byte var26;
                                                        if (var25 == 3) {
                                                            var26 = 18;
                                                        } else {
                                                            var26 = 38;
                                                        }
                                                        class85.method703(var18, arg0 ^ 0x55, class69.method586(new class75[] { class35.field853, var23.field204 }, (byte) 48), var24[var25], var23.field160, var26, (arg4 << 16) + var12);
                                                        class86.field2122++;
                                                    } else if (var25 == 4) {
                                                        class82.field2036++;
                                                        class85.method703(var18, arg0 + 38, class69.method586(new class75[] { class35.field853, var23.field204 }, (byte) 54), class79.field2001, var23.field160, 38, (arg4 << 16) + var12);
                                                    }
                                                }
                                            }
                                            if (var13.field2551) {
                                                class85.method703(var18, -97, class69.method586(new class75[] { class35.field853, var23.field204 }, (byte) 118), class82.field2041, var23.field160, 46, (arg4 << 16) + var12);
                                                class15.field286++;
                                            }
                                            if (var13.field2518 && var24 != null) {
                                                for (int var27 = 2; var27 >= 0; var27--) {
                                                    if (var24[var27] != null) {
                                                        class79.field1981++;
                                                        byte var28 = 0;
                                                        if (var27 == 0) {
                                                            var28 = 56;
                                                        }
                                                        if (var27 == 1) {
                                                            var28 = 50;
                                                        }
                                                        if (var27 == 2) {
                                                            var28 = 9;
                                                        }
                                                        class85.method703(var18, 120, class69.method586(new class75[] { class35.field853, var23.field204 }, (byte) 80), var24[var27], var23.field160, var28, (arg4 << 16) + var12);
                                                    }
                                                }
                                            }
                                            class75[] var29 = var13.field2525;
                                            if (class127.field3106) {
                                                var29 = class86.method717(var29, (byte) -101);
                                            }
                                            if (var29 != null) {
                                                for (int var30 = 4; var30 >= 0; var30--) {
                                                    if (var29[var30] != null) {
                                                        class71.field1808++;
                                                        byte var31 = 0;
                                                        if (var30 == 0) {
                                                            var31 = 39;
                                                        }
                                                        if (var30 == 1) {
                                                            var31 = 51;
                                                        }
                                                        if (var30 == 2) {
                                                            var31 = 53;
                                                        }
                                                        if (var30 == 3) {
                                                            var31 = 40;
                                                        }
                                                        if (var30 == 4) {
                                                            var31 = 11;
                                                        }
                                                        class85.method703(var18, arg0 ^ 0xFFFFFF9C, class69.method586(new class75[] { class35.field853, var23.field204 }, (byte) 78), var29[var30], var23.field160, var31, (arg4 << 16) + var12);
                                                    }
                                                }
                                            }
                                            class85.method703(var18, -78, class69.method586(new class75[] { class35.field853, var23.field204 }, (byte) 76), class90.field2213, var23.field160, 1001, (arg4 << 16) + var12);
                                        } else if ((class99.field2561 & 0x10) == 16) {
                                            class85.method703(var18, arg0 + 56, class69.method586(new class75[] { class86.field2126, class85.field2093, var23.field204 }, (byte) 82), class100.field2596, var23.field160, 52, (arg4 << 16) + var12);
                                            class37.field896++;
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                } else if (!var13.field2540 || class71.method602((byte) -87, arg9, var12) || class25.field486) {
                    method947(0, arg1, var15 + var13.field2546, var13.field2493, arg4, var13.field2548 + var14, arg6, var14, var15, arg9, var12);
                    if (var13.field2558 > var13.field2546) {
                        class45.method348(var13.field2548 + var14, arg1, arg6, var13.field2558, 8, var13, arg9, var13.field2546, var15);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lka;II)V", line = 353)
    private final void method948(class61 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field2939 = arg0.method507((byte) -66);
        }
        field2942++;
        if (arg1 >= -8) {
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(BI)Z", line = 370)
    public static final boolean method949(byte arg0, int arg1) {
        field2936++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class1.field28[arg1];
        if (arg0 != 14) {
            field2940 = -74;
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 3;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 417)
    public static void method950(byte arg0) {
        if (arg0 != 47) {
            field2944 = null;
        }
        field2932 = null;
        field2944 = null;
        field2938 = null;
        field2933 = null;
        field2930 = null;
        field2934 = null;
        field2947 = null;
        field2943 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lka;I)V", line = 441)
    public final void method951(class61 arg0, int arg1) {
        field2931++;
        if (arg1 != -9821) {
            this.method948(null, -30, 54);
        }
        while (true) {
            int var3 = arg0.method494(20471);
            if (var3 == 0) {
                return;
            }
            this.method948(arg0, -38, var3);
        }
    }
}
