import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class274 extends RuntimeException {

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4242;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Ljava/lang/String;")
    public String field4236;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
    public static boolean field4244 = true;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field4239 = 0;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field4246 = 0;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILtb;)V", line = 6)
    public static final void method1881(int arg0, int arg1, int arg2, class220 arg3) {
        if (arg3.field3371 == 1) {
            class231.method1628(0, -1, 0, "", arg3.field3404, (short) 7, arg3.field3454, 0L);
            class233.field3722++;
        }
        if (arg3.field3371 == 2 && !class35.field545) {
            String var4 = class171.method1234(78, arg3);
            if (var4 != null) {
                class231.method1628(-1, -1, 0, "<col=00ff00>" + arg3.field3382, arg3.field3404, (short) 21, var4, 0L);
                class301.field4703++;
            }
        }
        field4243++;
        if (arg3.field3371 == 3) {
            class104.field1617++;
            class231.method1628(0, -1, 0, "", arg3.field3404, (short) 30, class259.field4058, 0L);
        }
        if (arg3.field3371 == 4) {
            class231.method1628(0, -1, 0, "", arg3.field3404, (short) 11, arg3.field3454, 0L);
            class107.field1656++;
        }
        if (arg3.field3371 == 5) {
            class247.field3922++;
            class231.method1628(0, -1, 0, "", arg3.field3404, (short) 51, arg3.field3454, 0L);
        }
        if (arg3.field3371 == 6 && class303.field4728 == null) {
            class31.field456++;
            class231.method1628(-1, -1, 0, "", arg3.field3404, (short) 3, arg3.field3454, 0L);
        }
        if (arg3.field3468 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field3360; var6++) {
                for (int var7 = 0; var7 < arg3.field3405; var7++) {
                    int var8 = (arg3.field3411 + 32) * var6;
                    int var9 = (arg3.field3494 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg3.field3352[var5];
                        var9 += arg3.field3528[var5];
                    }
                    if (arg0 >= var9 && var8 <= arg2 && arg0 < (var9 + 32) && (var8 + 32) > arg2) {
                        class229.field3638 = var5;
                        class202.field3037 = arg3;
                        if (arg3.field3428[var5] > 0) {
                            class160 var10 = client.method393(arg3);
                            class299 var11 = class237.method1657(2, arg3.field3428[var5] - 1);
                            if (class313.field4858 == 1 && var10.method1092(false)) {
                                if (class53.field892 != arg3.field3404 || class315.field4913 != var5) {
                                    class312.field4846++;
                                    class231.method1628(var5, -1, 0, class136.field2149 + " -> <col=ff9040>" + var11.field4650, arg3.field3404, (short) 20, class186.field2776, (long) var11.field4637);
                                }
                            } else if (class35.field545 && var10.method1092(false)) {
                                class177 var12 = class115.field1765 == -1 ? null : class299.method2044(class115.field1765, (byte) -104);
                                if ((class11.field172 & 0x10) != 0 && (var12 == null || var11.method2036(class115.field1765, 2, var12.field2684) != var12.field2684)) {
                                    class235.field3747++;
                                    class231.method1628(var5, class344.field5344, 0, class254.field3997 + " -> <col=ff9040>" + var11.field4650, arg3.field3404, (short) 59, class332.field5173, (long) var11.field4637);
                                }
                            } else {
                                class11.field173++;
                                String[] var13 = var11.field4606;
                                if (class131.field2054) {
                                    var13 = class290.method1990((byte) 126, var13);
                                }
                                if (var10.method1092(false)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class130.field2036++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 15;
                                            } else {
                                                var15 = 4;
                                            }
                                            class231.method1628(var5, -1, 0, "<col=ff9040>" + var11.field4650, arg3.field3404, var15, var13[var14], (long) var11.field4637);
                                        }
                                    }
                                }
                                if (var10.method1089((byte) 98)) {
                                    class231.method1628(var5, class34.field533, 0, "<col=ff9040>" + var11.field4650, arg3.field3404, (short) 9, class186.field2776, (long) var11.field4637);
                                    class105.field1634++;
                                }
                                if (var10.method1092(false) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class60.field966++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 26;
                                            }
                                            if (var16 == 1) {
                                                var17 = 45;
                                            }
                                            if (var16 == 2) {
                                                var17 = 5;
                                            }
                                            class231.method1628(var5, -1, 0, "<col=ff9040>" + var11.field4650, arg3.field3404, var17, var13[var16], (long) var11.field4637);
                                        }
                                    }
                                }
                                String[] var18 = arg3.field3398;
                                if (class131.field2054) {
                                    var18 = class290.method1990((byte) 126, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class339.field5296++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 49;
                                            }
                                            if (var19 == 1) {
                                                var20 = 17;
                                            }
                                            if (var19 == 2) {
                                                var20 = 31;
                                            }
                                            if (var19 == 3) {
                                                var20 = 43;
                                            }
                                            if (var19 == 4) {
                                                var20 = 32;
                                            }
                                            class231.method1628(var5, -1, 0, "<col=ff9040>" + var11.field4650, arg3.field3404, var20, var18[var19], (long) var11.field4637);
                                        }
                                    }
                                }
                                class231.method1628(var5, class131.field2060, 0, "<col=ff9040>" + var11.field4650, arg3.field3404, (short) 1005, class149.field2258, (long) var11.field4637);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg1 != 21) {
            field4244 = false;
        }
        if (!arg3.field3445) {
            return;
        }
        if (!class35.field545) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class336.method2334((byte) 10, arg3, var21);
                if (var22 != null) {
                    class96.field1536++;
                    class231.method1628(arg3.field3383, class52.method434(21030, arg3, var21), 0, arg3.field3358, arg3.field3404, (short) 1003, var22, (long) (var21 + 1));
                }
            }
            String var23 = class171.method1234(arg1 ^ 0x12, arg3);
            if (var23 != null) {
                class301.field4703++;
                class231.method1628(arg3.field3383, -1, 0, arg3.field3358, arg3.field3404, (short) 21, var23, 0L);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class336.method2334((byte) 10, arg3, var24);
                if (var25 != null) {
                    class231.method1628(arg3.field3383, class52.method434(21030, arg3, var24), 0, arg3.field3358, arg3.field3404, (short) 34, var25, (long) (var24 + 1));
                    class96.field1536++;
                }
            }
            if (client.method393(arg3).method1087((byte) -37)) {
                if (arg3.field3425 == null) {
                    class231.method1628(arg3.field3383, -1, 0, "", arg3.field3404, (short) 3, class125.field1959, 0L);
                } else {
                    class231.method1628(arg3.field3383, -1, 0, "", arg3.field3404, (short) 3, arg3.field3425, 0L);
                }
                class31.field456++;
            }
        } else if (client.method393(arg3).method1085(true) && (class11.field172 & 0x20) != 0) {
            class265.field4128++;
            class231.method1628(arg3.field3383, class344.field5344, arg1 - 21, class254.field3997 + " -> " + arg3.field3358, arg3.field3404, (short) 18, class332.field5173, 0L);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II[Ltb;)V", line = 330)
    public static final void method1882(int arg0, int arg1, class220[] arg2) {
        if (arg0 != 24236) {
            field4244 = true;
        }
        field4238++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class220 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3468 == 0) {
                    if (var4.field3472 != null) {
                        method1882(24236, arg1, var4.field3472);
                    }
                    class61 var5 = (class61) class276.field4257.method1222(0, (long) var4.field3404);
                    if (var5 != null) {
                        class256.method1758(true, var5.field982, arg1);
                    }
                }
                if (arg1 == 0 && var4.field3389 != null) {
                    class240 var6 = new class240();
                    var6.field3826 = var4.field3389;
                    var6.field3834 = var4;
                    class336.method2337(var6, (byte) -71);
                }
                if (arg1 == 1 && var4.field3515 != null) {
                    if (var4.field3383 >= 0) {
                        class220 var7 = class68.method524((byte) -82, var4.field3404);
                        if (var7 == null || var7.field3472 == null || var7.field3472.length <= var4.field3383 || var7.field3472[var4.field3383] != var4) {
                            continue;
                        }
                    }
                    class240 var8 = new class240();
                    var8.field3826 = var4.field3515;
                    var8.field3834 = var4;
                    class336.method2337(var8, (byte) -71);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Ljava/lang/String;", line = 404)
    public static final String method1883(int arg0) {
        field4241++;
        String var1;
        if (class313.field4858 == 1 && class301.field4706 < 2) {
            var1 = class186.field2776 + class317.field4955 + class136.field2149 + " ->";
        } else if (class35.field545 && class301.field4706 < 2) {
            var1 = class332.field5173 + class317.field4955 + class254.field3997 + " ->";
        } else if (class12.field181 && class53.field902[81] && class301.field4706 > 2) {
            var1 = class288.method1979(class301.field4706 - 2, -90);
        } else {
            var1 = class288.method1979(class301.field4706 - 1, -52);
        }
        if (arg0 != 14) {
            method1882(-77, 35, (class220[]) null);
        }
        if (class301.field4706 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class301.field4706 - 2) + class106.field1646;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[[III[[FBBIBILfm;IZI[[F[[F)V", line = 435)
    public static final void method1884(int arg0, int[][] arg1, int arg2, int arg3, float[][] arg4, byte arg5, byte arg6, int arg7, byte arg8, int arg9, class127 arg10, int arg11, boolean arg12, int arg13, float[][] arg14, float[][] arg15) {
        int var16 = (arg7 << 8) + 255;
        int var17 = -84 / ((-arg6 - 24) / 61);
        field4245++;
        int var18 = (arg13 << 8) + 255;
        int var19 = (arg2 << 8) + 255;
        int var20 = (arg11 << 8) + 255;
        int[] var21 = class107.field1671[arg5];
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class297.method2016(var18, arg14, var21[var23 + var23], arg0, var19, 0.0F, var21[var23 + var23 + 1], arg4, false, (int[][]) null, arg10, arg15, (byte) -82, arg8, arg1, var20, arg9, var16);
        }
        int[] var24 = null;
        if (arg12) {
            if (arg5 == 1) {
                var24 = new int[6];
                int var43 = class297.method2016(var18, arg14, 64, arg0, var19, 0.0F, 128, arg4, true, (int[][]) null, arg10, arg15, (byte) -113, arg8, arg1, var20, arg9, var16);
                int var44 = class297.method2016(var18, arg14, 128, arg0, var19, 0.0F, 64, arg4, true, (int[][]) null, arg10, arg15, (byte) -85, arg8, arg1, var20, arg9, var16);
                var24[2] = var22[2];
                var24[3] = var43;
                var24[1] = var43;
                var24[0] = var44;
                var24[4] = var22[0];
                var24[5] = var22[2];
            } else if (arg5 == 2) {
                int var41 = class297.method2016(var18, arg14, 128, arg0, var19, 0.0F, 128, arg4, true, (int[][]) null, arg10, arg15, (byte) -106, arg8, arg1, var20, arg9, var16);
                var24 = new int[6];
                int var42 = class297.method2016(var18, arg14, 64, arg0, var19, 0.0F, 0, arg4, true, (int[][]) null, arg10, arg15, (byte) -116, arg8, arg1, var20, arg9, var16);
                var24[0] = var22[0];
                var24[1] = var42;
                var24[3] = var41;
                var24[4] = var22[1];
                var24[2] = var41;
                var24[5] = var22[0];
            } else if (arg5 == 3) {
                var24 = new int[6];
                int var26 = class297.method2016(var18, arg14, 0, arg0, var19, 0.0F, 128, arg4, true, (int[][]) null, arg10, arg15, (byte) -63, arg8, arg1, var20, arg9, var16);
                int var27 = class297.method2016(var18, arg14, 64, arg0, var19, 0.0F, 0, arg4, true, (int[][]) null, arg10, arg15, (byte) -108, arg8, arg1, var20, arg9, var16);
                var24[0] = var22[2];
                var24[4] = var27;
                var24[3] = var26;
                var24[2] = var26;
                var24[5] = var22[2];
                var24[1] = var22[1];
            } else if (arg5 == 4) {
                int var40 = class297.method2016(var18, arg14, 0, arg0, var19, 0.0F, 128, arg4, true, (int[][]) null, arg10, arg15, (byte) -99, arg8, arg1, var20, arg9, var16);
                var24 = new int[] { var22[3], var40, var22[0] };
            } else if (arg5 == 5) {
                var24 = new int[3];
                int var39 = class297.method2016(var18, arg14, 128, arg0, var19, 0.0F, 128, arg4, true, (int[][]) null, arg10, arg15, (byte) -114, arg8, arg1, var20, arg9, var16);
                var24[1] = var39;
                var24[0] = var22[2];
                var24[2] = var22[3];
            } else if (arg5 == 6) {
                var24 = new int[6];
                int var28 = class297.method2016(var18, arg14, 128, arg0, var19, 0.0F, 0, arg4, true, (int[][]) null, arg10, arg15, (byte) -86, arg8, arg1, var20, arg9, var16);
                int var29 = class297.method2016(var18, arg14, 128, arg0, var19, 0.0F, 128, arg4, true, (int[][]) null, arg10, arg15, (byte) -80, arg8, arg1, var20, arg9, var16);
                var24[0] = var22[3];
                var24[2] = var29;
                var24[1] = var28;
                var24[3] = var29;
                var24[4] = var22[0];
                var24[5] = var22[3];
            } else if (arg5 == 7) {
                var24 = new int[6];
                int var37 = class297.method2016(var18, arg14, 0, arg0, var19, 0.0F, 128, arg4, true, (int[][]) null, arg10, arg15, (byte) -74, arg8, arg1, var20, arg9, var16);
                int var38 = class297.method2016(var18, arg14, 128, arg0, var19, 0.0F, 0, arg4, true, (int[][]) null, arg10, arg15, (byte) -124, arg8, arg1, var20, arg9, var16);
                var24[2] = var37;
                var24[4] = var22[2];
                var24[3] = var37;
                var24[0] = var22[1];
                var24[1] = var38;
                var24[5] = var22[1];
            } else if (arg5 == 8) {
                var24 = new int[3];
                int var30 = class297.method2016(var18, arg14, 0, arg0, var19, 0.0F, 0, arg4, true, (int[][]) null, arg10, arg15, (byte) -112, arg8, arg1, var20, arg9, var16);
                var24[0] = var22[3];
                var24[2] = var22[4];
                var24[1] = var30;
            } else if (arg5 == 9) {
                var24 = new int[15];
                int var34 = class297.method2016(var18, arg14, 128, arg0, var19, 0.0F, 64, arg4, true, (int[][]) null, arg10, arg15, (byte) -80, arg8, arg1, var20, arg9, var16);
                int var35 = class297.method2016(var18, arg14, 96, arg0, var19, 0.0F, 32, arg4, true, (int[][]) null, arg10, arg15, (byte) -102, arg8, arg1, var20, arg9, var16);
                int var36 = class297.method2016(var18, arg14, 64, arg0, var19, 0.0F, 0, arg4, true, (int[][]) null, arg10, arg15, (byte) -76, arg8, arg1, var20, arg9, var16);
                var24[2] = var22[4];
                var24[6] = var35;
                var24[4] = var22[4];
                var24[10] = var22[2];
                var24[12] = var35;
                var24[3] = var35;
                var24[0] = var35;
                var24[1] = var34;
                var24[14] = var36;
                var24[13] = var22[1];
                var24[11] = var22[1];
                var24[9] = var35;
                var24[7] = var22[3];
                var24[5] = var22[3];
                var24[8] = var22[2];
            } else if (arg5 == 10) {
                var24 = new int[9];
                int var33 = class297.method2016(var18, arg14, 0, arg0, var19, 0.0F, 128, arg4, true, (int[][]) null, arg10, arg15, (byte) -73, arg8, arg1, var20, arg9, var16);
                var24[7] = var33;
                var24[1] = var33;
                var24[4] = var33;
                var24[6] = var22[4];
                var24[0] = var22[2];
                var24[5] = var22[4];
                var24[8] = var22[0];
                var24[2] = var22[3];
                var24[3] = var22[3];
            } else if (arg5 == 11) {
                int var31 = class297.method2016(var18, arg14, 0, arg0, var19, 0.0F, 64, arg4, true, (int[][]) null, arg10, arg15, (byte) -123, arg8, arg1, var20, arg9, var16);
                int var32 = class297.method2016(var18, arg14, 128, arg0, var19, 0.0F, 64, arg4, true, (int[][]) null, arg10, arg15, (byte) -94, arg8, arg1, var20, arg9, var16);
                var24 = new int[] { var22[3], var31, var22[0], var22[3], var22[2], var31, var22[2], var32, var31, var22[2], var22[1], var32 };
            }
        }
        arg10.method923(arg3, arg9, arg0, var22, var24, false);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 709)
    public class274(Throwable arg0, String arg1) {
        this.field4242 = arg0;
        this.field4236 = arg1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)V", line = 721)
    public static final void method1885(boolean arg0, int arg1) {
        field4237++;
        class263.method1797(class322.field5024, -11999, arg0, class188.field2816, class331.field5160);
        if (arg1 != 7856) {
            field4246 = 119;
        }
    }
}
