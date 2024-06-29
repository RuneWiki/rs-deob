import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class296 {

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4446 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field4449 = 0;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Z")
    public static boolean field4451 = false;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[[B")
    public static byte[][] field4445;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(CB)B", line = 5)
    public static final byte method2108(char arg0, byte arg1) {
        field4441++;
        int var2 = 67 % ((-arg1 - 23) / 32);
        byte var3;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var3 = (byte) arg0;
        } else if (arg0 == '€') {
            var3 = -128;
        } else if (arg0 == '‚') {
            var3 = -126;
        } else if (arg0 == 'ƒ') {
            var3 = -125;
        } else if (arg0 == '„') {
            var3 = -124;
        } else if (arg0 == '…') {
            var3 = -123;
        } else if (arg0 == '†') {
            var3 = -122;
        } else if (arg0 == '‡') {
            var3 = -121;
        } else if (arg0 == 'ˆ') {
            var3 = -120;
        } else if (arg0 == '‰') {
            var3 = -119;
        } else if (arg0 == 'Š') {
            var3 = -118;
        } else if (arg0 == '‹') {
            var3 = -117;
        } else if (arg0 == 'Œ') {
            var3 = -116;
        } else if (arg0 == 'Ž') {
            var3 = -114;
        } else if (arg0 == '‘') {
            var3 = -111;
        } else if (arg0 == '’') {
            var3 = -110;
        } else if (arg0 == '“') {
            var3 = -109;
        } else if (arg0 == '”') {
            var3 = -108;
        } else if (arg0 == '•') {
            var3 = -107;
        } else if (arg0 == '–') {
            var3 = -106;
        } else if (arg0 == '—') {
            var3 = -105;
        } else if (arg0 == '˜') {
            var3 = -104;
        } else if (arg0 == '™') {
            var3 = -103;
        } else if (arg0 == 'š') {
            var3 = -102;
        } else if (arg0 == '›') {
            var3 = -101;
        } else if (arg0 == 'œ') {
            var3 = -100;
        } else if (arg0 == 'ž') {
            var3 = -98;
        } else if (arg0 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lgj;I)V", line = 129)
    public static final void method2109(class333 arg0, int arg1) {
        field4444++;
        if (arg0.field5149 == 0) {
            return;
        }
        class15 var2 = arg0.method2355(true);
        if (arg0.field5183 != -1 && arg0.field5183 < 32768) {
            class181 var3 = class300.field4495[arg0.field5183];
            if (var3 != null) {
                int var4 = arg0.field5137 - var3.field5137;
                int var5 = arg0.field5165 - var3.field5165;
                if (var4 != 0 || var5 != 0) {
                    arg0.field5089 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field5183 >= 32768) {
            int var6 = arg0.field5183 - 32768;
            if (class54.field790 == var6) {
                var6 = 2047;
            }
            class228 var7 = class343.field5312[var6];
            if (var7 != null) {
                int var8 = arg0.field5137 - var7.field5137;
                int var9 = arg0.field5165 - var7.field5165;
                if (var8 != 0 || var9 != 0) {
                    arg0.field5089 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 != 65536) {
            method2113((byte) 113);
        }
        if ((arg0.field5157 != 0 || arg0.field5167 != 0) && (arg0.field5113 == 0 || arg0.field5158 > 0)) {
            int var10 = arg0.field5137 - ((arg0.field5157 - (class272.field4123 + class272.field4123)) * 64);
            int var11 = arg0.field5165 - ((arg0.field5167 - class202.field2968 - class202.field2968) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field5089 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field5167 = 0;
            arg0.field5157 = 0;
        }
        int var12 = arg0.field5089 - arg0.field5199 & 0x7FF;
        if (var12 == 0) {
            arg0.field5200 = 0;
            arg0.field5134 = 0;
        } else if (var2.field258 == 0) {
            arg0.field5200++;
            if (var12 > 1024) {
                boolean var13 = true;
                arg0.field5199 -= arg0.field5149;
                if (arg0.field5149 > var12 || 2048 - arg0.field5149 < var12) {
                    var13 = false;
                    arg0.field5199 = arg0.field5089;
                }
                if (arg0.field5200 > 25 || var13) {
                    arg0.field5096 = var2.field229;
                    if (arg0.field5113 > 0) {
                        if (arg0.field5133[arg0.field5113 - 1] == 2) {
                            if (var2.field243 != -1) {
                                arg0.field5096 = var2.field243;
                            } else if (var2.field232 != -1) {
                                arg0.field5096 = var2.field232;
                            }
                        } else if (arg0.field5133[arg0.field5113 - 1] == 0) {
                            if (var2.field236 != -1) {
                                arg0.field5096 = var2.field236;
                            } else if (var2.field241 != -1) {
                                arg0.field5096 = var2.field241;
                            }
                        } else if (var2.field235 != -1) {
                            arg0.field5096 = var2.field235;
                        }
                    } else if (var2.field226 != -1) {
                        arg0.field5096 = var2.field226;
                    }
                }
            } else {
                arg0.field5199 += arg0.field5149;
                boolean var14 = true;
                if (var12 < arg0.field5149 || (2048 - arg0.field5149) < var12) {
                    var14 = false;
                    arg0.field5199 = arg0.field5089;
                }
                if (arg0.field5200 > 25 || var14) {
                    arg0.field5096 = var2.field229;
                    if (arg0.field5113 <= 0) {
                        if (var2.field249 != -1) {
                            arg0.field5096 = var2.field249;
                        }
                    } else if (arg0.field5133[arg0.field5113 - 1] == 2) {
                        if (var2.field250 != -1) {
                            arg0.field5096 = var2.field250;
                        } else if (var2.field232 != -1) {
                            arg0.field5096 = var2.field232;
                        }
                    } else if (arg0.field5133[arg0.field5113 - 1] == 0) {
                        if (var2.field222 != -1) {
                            arg0.field5096 = var2.field222;
                        } else if (var2.field241 != -1) {
                            arg0.field5096 = var2.field241;
                        }
                    } else if (var2.field244 != -1) {
                        arg0.field5096 = var2.field244;
                    }
                }
            }
            arg0.field5199 &= 0x7FF;
        } else {
            arg0.field5096 = -1;
            int var15 = arg0.field5089 << 5;
            if (arg0.field5182 != var15) {
                arg0.field5182 = var15;
                arg0.field5140 = 0;
                int var16 = var15 - arg0.field5141 & 0xFFFF;
                int var17 = arg0.field5134 * arg0.field5134 / (var2.field258 * 2);
                if (arg0.field5134 > 0 && var16 >= var17 && var16 - var17 < 32768) {
                    arg0.field5124 = true;
                    arg0.field5125 = var16 / 2;
                    int var18 = var2.field224 * var2.field224 / (var2.field258 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (arg0.field5125 > var18) {
                        arg0.field5125 = var16 - var18;
                    }
                } else if (arg0.field5134 < 0 && var17 <= (65536 - var16) && (65536 - var17 - var16) < 32768) {
                    arg0.field5124 = true;
                    int var19 = var2.field224 * var2.field224 / (var2.field258 * 2);
                    arg0.field5125 = (65536 - var16) / 2;
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg0.field5125) {
                        arg0.field5125 = 65536 - var16 - var19;
                    }
                } else {
                    arg0.field5124 = false;
                }
            }
            if (arg0.field5134 == 0) {
                int var20 = arg0.field5182 - arg0.field5141 & 0xFFFF;
                if (var20 < var2.field258) {
                    arg0.field5141 = arg0.field5182;
                } else {
                    arg0.field5124 = true;
                    arg0.field5140 = 0;
                    int var21 = var2.field224 * var2.field224 / (var2.field258 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg0.field5134 = -var2.field258;
                        arg0.field5125 = (65536 - var20) / 2;
                        if (arg0.field5125 > var21) {
                            arg0.field5125 = 65536 - var20 - var21;
                        }
                    } else {
                        arg0.field5125 = var20 / 2;
                        if (arg0.field5125 > var21) {
                            arg0.field5125 = var20 - var21;
                        }
                        arg0.field5134 = var2.field258;
                    }
                }
            } else if (arg0.field5134 <= 0) {
                if (arg0.field5125 <= arg0.field5140) {
                    arg0.field5124 = false;
                }
                if (!arg0.field5124) {
                    arg0.field5134 += var2.field258;
                    if (arg0.field5134 > 0) {
                        arg0.field5134 = 0;
                    }
                } else if (arg0.field5134 > (-var2.field224)) {
                    arg0.field5134 -= var2.field258;
                }
            } else {
                if (arg0.field5140 >= arg0.field5125) {
                    arg0.field5124 = false;
                }
                if (!arg0.field5124) {
                    arg0.field5134 -= var2.field258;
                    if (arg0.field5134 < 0) {
                        arg0.field5134 = 0;
                    }
                } else if (var2.field224 > arg0.field5134) {
                    arg0.field5134 += var2.field258;
                }
            }
            if (arg0.field5134 <= 0) {
                arg0.field5140 -= arg0.field5134;
            } else {
                arg0.field5140 += arg0.field5134;
            }
            arg0.field5141 += arg0.field5134;
            arg0.field5141 &= 0xFFFF;
            arg0.field5199 = arg0.field5141 >> 5;
            if (arg0.field5134 >= 0) {
                if (arg0.field5113 > 0) {
                    if (arg0.field5133[arg0.field5113 - 1] == 2) {
                        if (var2.field250 != -1) {
                            arg0.field5096 = var2.field250;
                        } else if (var2.field232 != -1) {
                            arg0.field5096 = var2.field232;
                        }
                    } else if (arg0.field5133[arg0.field5113 - 1] == 0) {
                        if (var2.field222 != -1) {
                            arg0.field5096 = var2.field222;
                        } else if (var2.field241 != -1) {
                            arg0.field5096 = var2.field241;
                        }
                    }
                }
                if (arg0.field5096 == -1) {
                    if (var2.field244 != -1) {
                        arg0.field5096 = var2.field244;
                    } else if (var2.field249 != -1) {
                        arg0.field5096 = var2.field249;
                    }
                }
            } else {
                if (arg0.field5113 > 0) {
                    if (arg0.field5133[arg0.field5113 - 1] == 2) {
                        if (var2.field243 != -1) {
                            arg0.field5096 = var2.field243;
                        } else if (var2.field232 != -1) {
                            arg0.field5096 = var2.field232;
                        }
                    } else if (arg0.field5133[arg0.field5113 - 1] == 0) {
                        if (var2.field236 != -1) {
                            arg0.field5096 = var2.field236;
                        } else if (var2.field241 != -1) {
                            arg0.field5096 = var2.field241;
                        }
                    }
                }
                if (arg0.field5096 == -1) {
                    if (var2.field235 != -1) {
                        arg0.field5096 = var2.field235;
                    } else if (var2.field226 != -1) {
                        arg0.field5096 = var2.field226;
                    }
                }
            }
            if (arg0.field5096 == -1) {
                arg0.field5096 = var2.field229;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILph;BI)Lwi;", line = 562)
    public static final class234 method2110(int arg0, class361 arg1, byte arg2, int arg3) {
        field4447++;
        if (class62.method508(0, arg3, arg0, arg1)) {
            if (arg2 <= 42) {
                field4446 = (String[]) null;
            }
            return class64.method534((byte) -94);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[ILkf;I[[F[[I[[FILtm;Z[[F)V", line = 582)
    public static final void method2111(int arg0, int[] arg1, class171 arg2, int arg3, float[][] arg4, int[][] arg5, float[][] arg6, int arg7, class277 arg8, boolean arg9, float[][] arg10) {
        field4450++;
        int[] var11 = new int[arg1.length / 2];
        if (!arg9) {
            return;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg1[var12 + var12];
            int var14 = arg1[var12 + var12 + 1];
            if (arg3 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg3 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg3 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg4[arg0][arg7];
                var18 = arg10[arg0][arg7];
                var19 = arg6[arg0][arg7];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg6[arg0 + 1][arg7];
                var17 = arg4[arg0 + 1][arg7];
                var18 = arg10[arg0 + 1][arg7];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg10[arg0 + 1][arg7 + 1];
                var19 = arg6[arg0 + 1][arg7 + 1];
                var17 = arg4[arg0 + 1][arg7 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg4[arg0][arg7 + 1];
                var19 = arg6[arg0][arg7 + 1];
                var18 = arg10[arg0][arg7 + 1];
            } else {
                float var20 = arg4[arg0][arg7];
                float var21 = arg10[arg0][arg7];
                float var22 = (float) var13 / 128.0F;
                float var23 = (arg10[arg0 + 1][arg7] - var21) * var22 + var21;
                float var24 = (arg4[arg0 + 1][arg7] - var20) * var22 + var20;
                float var25 = arg6[arg0][arg7];
                float var26 = (arg6[arg0 + 1][arg7] - var25) * var22 + var25;
                float var27 = arg10[arg0][arg7 + 1];
                float var28 = (arg10[arg0 + 1][arg7 + 1] - var27) * var22 + var27;
                float var29 = (float) var14 / 128.0F;
                float var30 = arg6[arg0][arg7 + 1];
                float var31 = (arg6[arg0 + 1][arg7 + 1] - var30) * var22 + var30;
                float var32 = arg4[arg0][arg7 + 1];
                var19 = (var31 - var26) * var29 + var26;
                float var33 = (arg4[arg0 + 1][arg7 + 1] - var32) * var22 + var32;
                var18 = (var28 - var23) * var29 + var23;
                var17 = (var33 - var24) * var29 + var24;
            }
            int var34 = (arg0 << 7) + var13;
            int var35 = class88.method702(-119, arg7, var13, var14, arg0, arg5);
            int var36 = (arg7 << 7) + var14;
            var11[var12] = arg2.method1203(arg8, var34, var35, var36, var17, var18, var19);
        }
        arg2.method1202(var11);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V", line = 700)
    public static final void method2112(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class267.field4077 * arg1 >> 8;
        if (var4 != 0 && arg2 != -1) {
            class20.method124(arg2, 0, false, var4, class19.field307, -117);
            class65.field958 = true;
        }
        field4443++;
        if (arg0 != -1) {
            field4448 = 125;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 736)
    public static void method2113(byte arg0) {
        field4445 = (byte[][]) null;
        field4446 = null;
        if (arg0 != 109) {
            method2114(-47, (class190) null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILsb;)V", line = 752)
    public static final void method2114(int arg0, class190 arg1) {
        field4442++;
        if (arg0 != 64) {
            return;
        }
        int var2 = class105.field1501 >> 1;
        int var3 = class105.field1496 >> 2 << 10;
        byte[][] var4 = new byte[class105.field1499][class105.field1503];
        while (arg1.field2776 < arg1.field2718.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method1319(arg0 ^ 0xBF) == 1) {
                var6 = arg1.method1319(255);
                var5 = true;
                var7 = arg1.method1319(255);
            }
            int var8 = arg1.method1319(arg0 + 191);
            int var9 = arg1.method1319(255);
            int var10 = var8 * 64 - class105.field1498;
            int var11 = class105.field1497 - (var9 * 64 - (class105.field1503 - 1));
            if (var10 >= 0 && var11 - 63 >= 0 && class105.field1499 > (var10 + 63) && var11 < class105.field1503) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || (var6 * 8) <= var12 && var12 < var6 * 8 + 8 && var7 * 8 <= var14 && (var7 * 8 + 8) > var14) {
                            var13[var11 - var14] = arg1.method1322(9813);
                        }
                    }
                }
            } else if (var5) {
                arg1.field2776 += 64;
            } else {
                arg1.field2776 += 4096;
            }
        }
        int var15 = class105.field1499;
        int var16 = class105.field1503;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            if ((var22 & 0x1FF) == 0) {
                class229.method1711((byte) 95, true);
            }
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class37 var26 = class165.method1177(26277, var25 - 1);
                        var20[var23] += var26.field553;
                        var19[var23] += var26.field540;
                        var17[var23] += var26.field555;
                        var18[var23] += var26.field543;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class37 var29 = class165.method1177(26277, var28 - 1);
                        var20[var23] -= var29.field553;
                        var19[var23] -= var29.field540;
                        var17[var23] -= var29.field555;
                        var18[var23] -= var29.field543;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class105.field1509[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var37 < var16) {
                        var31 += var20[var37];
                        var33 += var17[var37];
                        var32 += var19[var37];
                        var34 += var21[var37];
                        var35 += var18[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var35 -= var18[var38];
                        var33 -= var17[var38];
                        var31 -= var20[var38];
                        var32 -= var19[var38];
                        var34 -= var21[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class133.method958(var33 / var34, (byte) 115, var31 * 256 / var35, var32 / var34);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var3 + var40 & 0xFC00) + ((var40 & 0x380) + var41);
                            var39[class287.method2076(var22, 63) + class287.method2076(4032, var36 << 6)] = class345.field5349[class64.method530(96, var42, -126)];
                        } else if (var39 != null) {
                            var39[class287.method2076(var22, 63) + (class287.method2076(var36, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }
}
