import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class16 extends class143 {

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "Lme;")
    private class65 field200;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "[[I")
    public int[][] field214;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "[[I")
    private int[][] field211;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "[[B")
    private byte[][] field201;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "[[B")
    private byte[][] field209;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "[[Llr;")
    private class181[][] field203;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "[[Lji;")
    private class224[][] field193;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "[[Lbb;")
    private class274[][] field213;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "[[Lsl;")
    private class397[][] field198;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)I")
    public final int method92(int arg0, int arg1) {
        return this.field214[arg0][arg1];
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIII[[ZLss;[I[I)V")
    private final void method93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class285 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4345 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field198[var16][var17] != null) {
                        class397 var18 = this.field198[var16][var17];
                        if (var18.field5929 != -1 && (var18.field5928 & 2) == 0 && var18.field5933 == -1) {
                            int var19 = this.field200.method441(var18.field5929);
                            arg8.method1759(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class331.method2033(var19, -7, var18.field5932 & 65535), class331.method2033(var19, 87, var18.field5927 & 65535), class331.method2033(var19, -6, var18.field5930 & 65535));
                            arg8.method1759(var15, var15, var15 - var13, var14, var13 + var14, var14, class331.method2033(var19, 124, var18.field5931 & 65535), class331.method2033(var19, -60, var18.field5930 & 65535), class331.method2033(var19, -18, var18.field5927 & 65535));
                        } else if (var18.field5933 == -1) {
                            arg8.method1759(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5932 & 65535, var18.field5927 & 65535, var18.field5930 & 65535);
                            arg8.method1759(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5931 & 65535, var18.field5930 & 65535, var18.field5927 & 65535);
                        } else {
                            int var20 = var18.field5933;
                            arg8.method1759(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1759(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field193[var16][var17] != null) {
                        class224 var21 = this.field193[var16][var17];
                        for (int var22 = 0; var22 < var21.field3415; ++var22) {
                            arg9[var22] = (var21.field3423[var22] - this.field206 * var16) * var13 / this.field206 + var14;
                            arg10[var22] = var15 - (var21.field3421[var22] - this.field206 * var17) * var13 / this.field206;
                        }
                        for (int var23 = 0; var23 < var21.field3417; ++var23) {
                            short var24 = var21.field3418[var23];
                            short var25 = var21.field3414[var23];
                            short var26 = var21.field3420[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3425 != null && var21.field3425[var23] != -1) {
                                int var33 = var21.field3425[var23];
                                arg8.method1759(var30, var31, var32, var27, var28, var29, class331.method2033(var33, 105, var21.field3422[var24]), class331.method2033(var33, -110, var21.field3422[var25]), class331.method2033(var33, 68, var21.field3422[var26]));
                            } else if (var21.field3413 != null && var21.field3413[var23] != -1) {
                                int var34 = this.field200.method441(var21.field3413[var23]);
                                arg8.method1759(var30, var31, var32, var27, var28, var29, class331.method2033(var34, -10, var21.field3422[var24]), class331.method2033(var34, 68, var21.field3422[var25]), class331.method2033(var34, 79, var21.field3422[var26]));
                            } else {
                                int var35 = var21.field3424[var23];
                                arg8.method1759(var30, var31, var32, var27, var28, var29, class331.method2033(var35, -62, var21.field3422[var24]), class331.method2033(var35, -52, var21.field3422[var25]), class331.method2033(var35, 103, var21.field3422[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4345 = true;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lqn;IIIIZ)V")
    public final void method94(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(Lqn;IIIIZ)V")
    public final void method95(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z")
    private final boolean method96(int arg0) {
        if ((this.field208 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method97(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field213 == null) {
            this.field213 = new class274[super.field1906][super.field1908];
            this.field203 = new class181[super.field1906][super.field1908];
        } else if (this.field198 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class150.field2070[class103.method652(arg5[var13], (byte) 117) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class150.field2070[class103.method652(arg6[var14], (byte) -89) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field206 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field206 && arg4[var20] == this.field206) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field206) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field206 != arg2[var22] && arg2[0] - this.field206 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field206 != arg4[var22] && arg4[0] - this.field206 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class274 var23 = new class274();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field4198 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field4194 = (byte) (var23.field4194 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field214[arg0 + 1][arg1] == this.field214[arg0][arg1] && this.field214[arg0 + 1][arg1 + 1] == this.field214[arg0][arg1] && this.field214[arg0][arg1 + 1] == this.field214[arg0][arg1]) {
                    var23.field4194 = (byte) (var23.field4194 | 1);
                }
                if (var25 != -1 && (var23.field4194 & 2) == 0 && !this.field200.field807.method180(var25, 54).field2129) {
                    var23.field4199 = this.field201[arg0][arg1] - this.field209[arg0][arg1];
                    var23.field4195 = this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1];
                    var23.field4196 = this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1];
                    var23.field4200 = this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1];
                    var23.field4197 = (short) var25;
                } else {
                    int var26;
                    if (this.field211 != null && arg10 != 0) {
                        var26 = this.field211[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field4199 = class262.method1624(method102(arg5[var16] >> 8, this.field201[arg0][arg1] - this.field209[arg0][arg1]), -12095, arg9, var26);
                    if (var23.field4198 != 0) {
                        var23.field4199 |= 255 - (this.field201[arg0][arg1] - this.field209[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field211 != null && arg10 != 0) {
                        var27 = this.field211[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field4195 = class262.method1624(method102(arg5[var17] >> 8, this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1]), -12095, arg9, var27);
                    if (var23.field4198 != 0) {
                        var23.field4195 |= 255 - (this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field211 != null && arg10 != 0) {
                        var28 = this.field211[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field4196 = class262.method1624(method102(arg5[var18] >> 8, this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1]), -12095, arg9, var28);
                    if (var23.field4198 != 0) {
                        var23.field4196 |= 255 - (this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field211 != null && arg10 != 0) {
                        var29 = this.field211[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field4200 = class262.method1624(method102(arg5[var19] >> 8, this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1]), -12095, arg9, var29);
                    if (var23.field4198 != 0) {
                        var23.field4200 |= 255 - (this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1]) << 25;
                    }
                    var23.field4197 = -1;
                }
                this.field213[arg0][arg1] = var23;
            } else {
                class181 var30 = new class181();
                var30.field2716 = (short) arg2.length;
                var30.field2719 = (short) (arg2.length / 3);
                var30.field2723 = new short[var30.field2716];
                var30.field2721 = new short[var30.field2716];
                var30.field2717 = new short[var30.field2716];
                var30.field2722 = new int[var30.field2716];
                if (this.field211 != null) {
                    var30.field2715 = new short[var30.field2716];
                }
                for (int var31 = 0; var31 < var30.field2716; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field201[arg0][arg1] - this.field209[arg0][arg1];
                    } else if (var46 == 0 && this.field206 == var47) {
                        var49 = this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1];
                    } else if (this.field206 == var46 && this.field206 == var47) {
                        var49 = this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1];
                    } else if (this.field206 == var46 && var47 == 0) {
                        var49 = this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1]) * var46 + (this.field201[arg0][arg1] - this.field209[arg0][arg1]) * (this.field206 - var46);
                        int var51 = (this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1]) * var46 + (this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1]) * (this.field206 - var46);
                        var49 = (this.field206 - var47) * var50 + var47 * var51 >> this.field204 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field204) + var46);
                    short var53 = (short) ((arg1 << this.field204) + var47);
                    var30.field2723[var31] = var52;
                    var30.field2717[var31] = var53;
                    var30.field2721[var31] = (short) (this.method100(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field200.field807.method180(arg7[var31], 114).field2129) {
                        var30.field2722[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field2722[var31] = var49 << 25;
                        } else {
                            var30.field2722[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field211 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field211[arg0][arg1];
                            } else if (var46 == 0 && this.field206 == var47) {
                                var56 = this.field211[arg0][arg1 + 1];
                            } else if (this.field206 == var46 && this.field206 == var47) {
                                var56 = this.field211[arg0 + 1][arg1 + 1];
                            } else if (this.field206 == var46 && var47 == 0) {
                                var56 = this.field211[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field206 - var46) * this.field211[arg0][arg1] + this.field211[arg0 + 1][arg1] * var46;
                                int var58 = (this.field206 - var46) * this.field211[arg0][arg1 + 1] + this.field211[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field206 - var47) * var57 + var47 * var58 >> this.field204 * 2;
                            }
                            var30.field2715[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field2722[var31] = class262.method1624(method102(arg5[var31] >> 8, var49), -12095, arg9, var54);
                        if (arg6 != null) {
                            var30.field2722[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field2719; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field200.field807.method180(arg7[var33 * 3], -108).field2129) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field2718 = new int[var30.field2719];
                }
                if (var32) {
                    var30.field2724 = new short[var30.field2719];
                    var30.field2720 = new short[var30.field2719];
                }
                for (int var34 = 0; var34 < var30.field2719; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field2718[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field200.field807.method180(var40, -116).field2129) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field200.field807.method180(var41, 117).field2129) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field200.field807.method180(var42, -119).field2129) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field2724[var34] = (short) var42;
                            var30.field2720[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field200.field807.method180(var43, 55).field2129) {
                                    var30.field2722[var35] = class150.field2070[class103.method652(this.field200.field807.method180(var43, -127).field2134 & 65535, (byte) -68) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field200.field807.method180(var44, -124).field2129) {
                                    var30.field2722[var36] = class150.field2070[class103.method652(this.field200.field807.method180(var44, -107).field2134 & 65535, (byte) 126) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field200.field807.method180(var45, -121).field2129) {
                                    var30.field2722[var37] = class150.field2070[class103.method652(this.field200.field807.method180(var45, 77).field2134 & 65535, (byte) 116) & 65535];
                                }
                            }
                            var30.field2724[var34] = -1;
                        }
                    }
                }
                this.field203[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZLss;[I[I[I)V")
    private final void method98(int arg0, int arg1, boolean arg2, class285 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class274 var8 = this.field213[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4194 & 2) == 0) {
                int var9 = this.field206 * arg0;
                int var10 = this.field206 + var9;
                int var11 = this.field206 * arg1;
                int var12 = this.field206 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field4194 & 1) != 0 && !arg2) {
                    int var17 = this.field214[arg0][arg1];
                    int var18 = this.field216 * var17;
                    var19 = (this.field215 * var11 + this.field210 * var9 + var18 >> 15) + this.field195;
                    if (var19 <= this.field200.field813) {
                        return;
                    }
                    var20 = (this.field215 * var11 + this.field210 * var10 + var18 >> 15) + this.field195;
                    if (var20 <= this.field200.field813) {
                        return;
                    }
                    var21 = (this.field215 * var12 + this.field210 * var10 + var18 >> 15) + this.field195;
                    if (var21 <= this.field200.field813) {
                        return;
                    }
                    var22 = (this.field215 * var12 + this.field210 * var9 + var18 >> 15) + this.field195;
                    if (var22 <= this.field200.field813) {
                        return;
                    }
                    if (this.field200.field828) {
                        int var23 = var19 - this.field200.field802;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field200.field802;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field200.field802;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field200.field802;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field202 * var17;
                    int var28 = this.field205 * var17;
                    var29 = (this.field199 * var11 + this.field207 * var9 + var27 >> 15) + this.field197;
                    var30 = this.field200.field825 * var29 / var19 + arg3.field4346;
                    var31 = (this.field212 * var11 + this.field194 * var9 + var28 >> 15) + this.field196;
                    var32 = this.field200.field822 * var31 / var19 + arg3.field4340;
                    var33 = (this.field199 * var11 + this.field207 * var10 + var27 >> 15) + this.field197;
                    var34 = this.field200.field825 * var33 / var20 + arg3.field4346;
                    var35 = (this.field212 * var11 + this.field194 * var10 + var28 >> 15) + this.field196;
                    var36 = this.field200.field822 * var35 / var20 + arg3.field4340;
                    var37 = (this.field199 * var12 + this.field207 * var10 + var27 >> 15) + this.field197;
                    var38 = this.field200.field825 * var37 / var21 + arg3.field4346;
                    var39 = (this.field212 * var12 + this.field194 * var10 + var28 >> 15) + this.field196;
                    var40 = this.field200.field822 * var39 / var21 + arg3.field4340;
                    var41 = (this.field199 * var12 + this.field207 * var9 + var27 >> 15) + this.field197;
                    var42 = this.field200.field825 * var41 / var22 + arg3.field4346;
                    var43 = (this.field212 * var12 + this.field194 * var9 + var28 >> 15) + this.field196;
                    var44 = this.field200.field822 * var43 / var22 + arg3.field4340;
                } else {
                    int var45 = this.field214[arg0][arg1];
                    int var46 = this.field214[arg0 + 1][arg1];
                    int var47 = this.field214[arg0 + 1][arg1 + 1];
                    int var48 = this.field214[arg0][arg1 + 1];
                    var19 = (this.field215 * var11 + this.field216 * var45 + this.field210 * var9 >> 15) + this.field195;
                    if (var19 <= this.field200.field813) {
                        return;
                    }
                    var20 = (this.field215 * var11 + this.field216 * var46 + this.field210 * var10 >> 15) + this.field195;
                    if (var20 <= this.field200.field813) {
                        return;
                    }
                    var21 = (this.field215 * var12 + this.field216 * var47 + this.field210 * var10 >> 15) + this.field195;
                    if (var21 <= this.field200.field813) {
                        return;
                    }
                    var22 = (this.field215 * var12 + this.field216 * var48 + this.field210 * var9 >> 15) + this.field195;
                    if (var22 <= this.field200.field813) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field200.field802;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field211[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field200.field802;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field211[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field200.field802;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field211[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field200.field802;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field211[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field200.field828) {
                        int var57 = var19 - this.field200.field802;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field200.field802;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field200.field802;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field200.field802;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field199 * var11 + this.field207 * var9 + this.field202 * var45 >> 15) + this.field197;
                    var30 = this.field200.field825 * var29 / var19 + arg3.field4346;
                    var31 = (this.field212 * var11 + this.field205 * var45 + this.field194 * var9 >> 15) + this.field196;
                    var32 = this.field200.field822 * var31 / var19 + arg3.field4340;
                    var33 = (this.field199 * var11 + this.field207 * var10 + this.field202 * var46 >> 15) + this.field197;
                    var34 = this.field200.field825 * var33 / var20 + arg3.field4346;
                    var35 = (this.field212 * var11 + this.field205 * var46 + this.field194 * var10 >> 15) + this.field196;
                    var36 = this.field200.field822 * var35 / var20 + arg3.field4340;
                    var37 = (this.field199 * var12 + this.field207 * var10 + this.field202 * var47 >> 15) + this.field197;
                    var38 = this.field200.field825 * var37 / var21 + arg3.field4346;
                    var39 = (this.field212 * var12 + this.field205 * var47 + this.field194 * var10 >> 15) + this.field196;
                    var40 = this.field200.field822 * var39 / var21 + arg3.field4340;
                    var41 = (this.field199 * var12 + this.field207 * var9 + this.field202 * var48 >> 15) + this.field197;
                    var42 = this.field200.field825 * var41 / var22 + arg3.field4346;
                    var43 = (this.field212 * var12 + this.field205 * var48 + this.field194 * var9 >> 15) + this.field196;
                    var44 = this.field200.field822 * var43 / var22 + arg3.field4340;
                }
                boolean var61 = var8.field4197 != -1 && this.method96(this.field200.field807.method180(var8.field4197, -127).field2125);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field4344 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field4348 || var42 > arg3.field4348 || var34 > arg3.field4348;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field4350 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field4197 >= 0) {
                                arg3.method1754(var40, var44, var36, var38, var42, var34, this.field200.field812, var15, var16, var14, var8.field4196, var8.field4200, var8.field4195, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4197);
                            } else {
                                arg3.method1753(var40, var44, var36, var38, var42, var34, class98.method628(var8.field4196, var15 << 24 | this.field200.field812, false), class98.method628(var8.field4200, var16 << 24 | this.field200.field812, false), class98.method628(var8.field4195, var14 << 24 | this.field200.field812, false));
                            }
                        } else if (var8.field4197 >= 0) {
                            arg3.method1761(var40, var44, var36, var38, var42, var34, var8.field4196, var8.field4200, var8.field4195, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4197);
                        } else {
                            arg3.method1753(var40, var44, var36, var38, var42, var34, var8.field4196, var8.field4200, var8.field4195);
                        }
                        arg3.field4350 = 0;
                    } else {
                        arg3.method1762(var40, var44, var36, var38, var42, var34, this.field200.field812);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field4344 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field4348 || var34 > arg3.field4348 || var42 > arg3.field4348;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field4350 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field4197 >= 0) {
                                arg3.method1754(var32, var36, var44, var30, var34, var42, this.field200.field812, var13, var14, var16, var8.field4199, var8.field4195, var8.field4200, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4197);
                            } else {
                                arg3.method1753(var32, var36, var44, var30, var34, var42, class98.method628(var8.field4199, var13 << 24 | this.field200.field812, false), class98.method628(var8.field4195, var14 << 24 | this.field200.field812, false), class98.method628(var8.field4200, var16 << 24 | this.field200.field812, false));
                            }
                        } else if (var8.field4197 >= 0) {
                            arg3.method1761(var32, var36, var44, var30, var34, var42, var8.field4199, var8.field4195, var8.field4200, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4197);
                        } else {
                            arg3.method1753(var32, var36, var44, var30, var34, var42, var8.field4199, var8.field4195, var8.field4200);
                        }
                        arg3.field4350 = 0;
                        return;
                    }
                    arg3.method1762(var32, var36, var44, var30, var34, var42, this.field200.field812);
                }
            }
        } else {
            class181 var64 = this.field203[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field2716; ++var65) {
                    short var105 = var64.field2723[var65];
                    int var106 = var64.field2721[var65];
                    short var107 = var64.field2717[var65];
                    int var108 = (this.field215 * var107 + this.field216 * var106 + this.field210 * var105 >> 15) + this.field195;
                    if (var108 <= this.field200.field813) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field200.field802;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field2715[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field200.field828) {
                        int var111 = var108 - this.field200.field802;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field199 * var107 + this.field207 * var105 + this.field202 * var106 >> 15) + this.field197;
                    int var113 = (this.field212 * var107 + this.field205 * var106 + this.field194 * var105 >> 15) + this.field196;
                    arg4[var65] = this.field200.field825 * var112 / var108 + arg3.field4346;
                    arg5[var65] = this.field200.field822 * var113 / var108 + arg3.field4340;
                }
                if (var64.field2724 != null) {
                    int var66 = this.field214[arg0][arg1];
                    int var67 = this.field214[arg0 + 1][arg1];
                    int var68 = this.field214[arg0][arg1 + 1];
                    int var69 = this.field206 * arg0;
                    int var70 = this.field206 + var69;
                    int var71 = this.field206 * arg1;
                    int var72 = this.field206 + var71;
                    int var73 = (this.field199 * var71 + this.field207 * var69 + this.field202 * var66 >> 15) + this.field197;
                    int var74 = (this.field212 * var71 + this.field205 * var66 + this.field194 * var69 >> 15) + this.field196;
                    int var75 = (this.field215 * var71 + this.field216 * var66 + this.field210 * var69 >> 15) + this.field195;
                    int var76 = (this.field199 * var71 + this.field207 * var70 + this.field202 * var67 >> 15) + this.field197;
                    int var77 = (this.field212 * var71 + this.field205 * var67 + this.field194 * var70 >> 15) + this.field196;
                    int var78 = (this.field215 * var71 + this.field216 * var67 + this.field210 * var70 >> 15) + this.field195;
                    int var79 = (this.field199 * var72 + this.field207 * var69 + this.field202 * var68 >> 15) + this.field197;
                    int var80 = (this.field212 * var72 + this.field205 * var68 + this.field194 * var69 >> 15) + this.field196;
                    int var81 = (this.field215 * var72 + this.field216 * var68 + this.field210 * var69 >> 15) + this.field195;
                    for (int var82 = 0; var82 < var64.field2719; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field4344 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field4348 || var87 > arg3.field4348 || var88 > arg3.field4348;
                            short var93 = var64.field2724[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method96(this.field200.field807.method180(var93, 7).field2125)) {
                                    arg3.field4350 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method1754(var89, var90, var91, var86, var87, var88, this.field200.field812, arg6[var83], arg6[var84], arg6[var85], var64.field2722[var83], var64.field2722[var84], var64.field2722[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field2722[var83] & 16777215) != 0) {
                                        arg3.method1753(var89, var90, var91, var86, var87, var88, class98.method628(var64.field2722[var83], arg6[var83] << 24 | this.field200.field812, false), class98.method628(var64.field2722[var84], arg6[var84] << 24 | this.field200.field812, false), class98.method628(var64.field2722[var85], arg6[var85] << 24 | this.field200.field812, false));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method1761(var89, var90, var91, var86, var87, var88, var64.field2722[var83], var64.field2722[var84], var64.field2722[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field2722[var83] & 16777215) != 0) {
                                    arg3.method1753(var89, var90, var91, var86, var87, var88, var64.field2722[var83], var64.field2722[var84], var64.field2722[var85]);
                                }
                                arg3.field4350 = 0;
                            } else {
                                arg3.method1762(var89, var90, var91, var86, var87, var88, this.field200.field812);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field2719; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field4344 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field4348 || var99 > arg3.field4348 || var100 > arg3.field4348;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field2722[var95] & 16777215) != 0) {
                                    arg3.method1753(var101, var102, var103, var98, var99, var100, class262.method1624(var64.field2722[var95], -12095, this.field200.field812, arg6[var95]), class262.method1624(var64.field2722[var96], -12095, this.field200.field812, arg6[var96]), class262.method1624(var64.field2722[var97], -12095, this.field200.field812, arg6[var97]));
                                }
                            } else if ((var64.field2722[var95] & 16777215) != 0) {
                                arg3.method1753(var101, var102, var103, var98, var99, var100, var64.field2722[var95], var64.field2722[var96], var64.field2722[var97]);
                            }
                        } else {
                            arg3.method1762(var101, var102, var103, var98, var99, var100, this.field200.field812);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Lqn;IIIIZ)Z")
    public final boolean method99(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)I")
    public final int method100(int arg0, int arg1) {
        int var3 = arg0 >> this.field204;
        int var4 = arg1 >> this.field204;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1906 - 1 && var4 <= super.field1908 - 1) {
            int var5 = arg0 & this.field206 - 1;
            int var6 = arg1 & this.field206 - 1;
            int var7 = (this.field206 - var5) * this.field214[var3][var4] + this.field214[var3 + 1][var4] * var5 >> this.field204;
            int var8 = (this.field206 - var5) * this.field214[var3][var4 + 1] + this.field214[var3 + 1][var4 + 1] * var5 >> this.field204;
            return (this.field206 - var6) * var7 + var6 * var8 >> this.field204;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()V")
    public final void method101() {
        this.field201 = null;
        this.field209 = null;
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(II)I")
    private static final int method102(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(IIIIIII[[ZLss;[I[I)V")
    private final void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class285 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4345 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field213[var16][var17] != null) {
                        class274 var18 = this.field213[var16][var17];
                        if (var18.field4197 != -1 && (var18.field4194 & 2) == 0 && var18.field4198 == 0) {
                            int var19 = this.field200.method441(var18.field4197);
                            arg8.method1759(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class331.method2033(var19, -85, var18.field4196), class331.method2033(var19, 92, var18.field4200), class331.method2033(var19, -41, var18.field4195));
                            arg8.method1759(var15, var15, var15 - var13, var14, var13 + var14, var14, class331.method2033(var19, -102, var18.field4199), class331.method2033(var19, -64, var18.field4195), class331.method2033(var19, -38, var18.field4200));
                        } else if (var18.field4198 == 0) {
                            arg8.method1753(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4196, var18.field4200, var18.field4195);
                            arg8.method1753(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4199, var18.field4195, var18.field4200);
                        } else {
                            int var20 = var18.field4198;
                            arg8.method1753(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class98.method628(var20, var18.field4196 & -16777216, false), class98.method628(var20, var18.field4200 & -16777216, false), class98.method628(var20, var18.field4195 & -16777216, false));
                            arg8.method1753(var15, var15, var15 - var13, var14, var13 + var14, var14, class98.method628(var20, var18.field4199 & -16777216, false), class98.method628(var20, var18.field4195 & -16777216, false), class98.method628(var20, var18.field4200 & -16777216, false));
                        }
                    } else if (this.field203[var16][var17] != null) {
                        class181 var21 = this.field203[var16][var17];
                        for (int var22 = 0; var22 < var21.field2716; ++var22) {
                            arg9[var22] = (var21.field2723[var22] - this.field206 * var16) * var13 / this.field206 + var14;
                            arg10[var22] = var15 - (var21.field2717[var22] - this.field206 * var17) * var13 / this.field206;
                        }
                        for (int var23 = 0; var23 < var21.field2719; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2718 == null || var21.field2718[var23] == 0 || var21.field2724 != null && (var21.field2724 == null || var21.field2724[var23] != -1)) {
                                if (var21.field2724 != null && var21.field2724[var23] != -1) {
                                    int var34 = this.field200.method441(var21.field2724[var23]);
                                    arg8.method1759(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method1753(var30, var31, var32, var27, var28, var29, var21.field2722[var24], var21.field2722[var25], var21.field2722[var26]);
                                }
                            } else {
                                int var33 = var21.field2718[var23];
                                arg8.method1753(var30, var31, var32, var27, var28, var29, class98.method628(var33, -16777216 - (var21.field2722[var24] & -16777216), false), class98.method628(var33, -16777216 - (var21.field2722[var25] & -16777216), false), class98.method628(var33, -16777216 - (var21.field2722[var26] & -16777216), false));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4345 = true;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
    public final void method104(int arg0, int arg1) {
        class278 var3 = this.field200.method348(Thread.currentThread());
        var3.field4231.field4350 = 0;
        if (this.field213 != null) {
            this.method98(arg0, arg1, this.field200.field829, var3.field4231, var3.field4249, var3.field4269, var3.field4248);
        } else {
            if (this.field198 != null) {
                this.method109(arg0, arg1, var3.field4231, var3.field4249, var3.field4269, var3.field4248);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ldt;[I)V")
    public final void method105(class147 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        if (this.field209[arg0][arg1] < arg2) {
            this.field209[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III[[ZZ)V")
    public final void method107(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class144 var6 = this.field200.field819;
        this.field207 = var6.field1926;
        this.field202 = var6.field1923;
        this.field199 = var6.field1919;
        this.field197 = var6.field1917;
        this.field194 = var6.field1922;
        this.field205 = var6.field1921;
        this.field212 = var6.field1915;
        this.field196 = var6.field1925;
        this.field210 = var6.field1920;
        this.field216 = var6.field1924;
        this.field215 = var6.field1916;
        this.field195 = var6.field1918;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lme;IIII[[I[[II)V")
    public class16(class65 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field200 = arg0;
        this.field208 = arg2;
        this.field214 = arg5;
        this.field211 = arg6;
        this.field206 = arg7;
        this.field204 = 0;
        while (arg7 > 1) {
            ++this.field204;
            arg7 >>= 1;
        }
        this.field201 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field200.field808 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field214[var11 + 1][var10] - this.field214[var11 - 1][var10];
                int var14 = this.field214[var11][var10 + 1] - this.field214[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field200.field844 * var18 + this.field200.field837 * var16 + this.field200.field836 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field201[var11][var10] = (byte) var20;
            }
        }
        this.field209 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method108(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field198 == null) {
            this.field198 = new class397[super.field1906][super.field1908];
            this.field193 = new class224[super.field1906][super.field1908];
        } else if (this.field213 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field206 != var18 || var19 != 0 && this.field206 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class224 var20 = new class224();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field3415 = var21;
            var20.field3422 = new short[var21];
            var20.field3423 = new int[var21];
            var20.field3416 = new int[var21];
            var20.field3421 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field3422[var23] = (short) (this.field201[arg0][arg1] - this.field209[arg0][arg1]);
                } else if (var28 == 0 && this.field206 == var29) {
                    var20.field3422[var23] = (short) (this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1]);
                } else if (this.field206 == var28 && this.field206 == var29) {
                    var20.field3422[var23] = (short) (this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1]);
                } else if (this.field206 == var28 && var29 == 0) {
                    var20.field3422[var23] = (short) (this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1]) * var28 + (this.field201[arg0][arg1] - this.field209[arg0][arg1]) * (this.field206 - var28);
                    int var31 = (this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1]) * var28 + (this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1]) * (this.field206 - var28);
                    var20.field3422[var23] = (short) ((this.field206 - var29) * var30 + var29 * var31 >> this.field204 * 2);
                }
                int var32 = (arg0 << this.field204) + var28;
                int var33 = (arg1 << this.field204) + var29;
                var20.field3423[var23] = var32;
                var20.field3421[var23] = var33;
                var20.field3416[var23] = this.method100(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field3422[var23] < 2) {
                    var20.field3422[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field200.field807.method180(arg10[var26], -124).field2129) {
                    var24 = true;
                }
            }
            var20.field3424 = new int[var25];
            if (arg9 != null) {
                var20.field3425 = new int[var25];
            }
            var20.field3418 = new short[var25];
            var20.field3414 = new short[var25];
            var20.field3420 = new short[var25];
            if (var24) {
                var20.field3413 = new short[var25];
                var20.field3419 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field3424[var20.field3417] = class103.method652(arg8[var27], (byte) -56);
                    } else {
                        var20.field3424[var20.field3417] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field3425[var20.field3417] = class103.method652(arg9[var27], (byte) 120);
                        } else {
                            var20.field3425[var20.field3417] = -1;
                        }
                    }
                    var20.field3418[var20.field3417] = (short) arg5[var27];
                    var20.field3414[var20.field3417] = (short) arg6[var27];
                    var20.field3420[var20.field3417] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field200.field807.method180(arg10[var27], -106).field2129) {
                            var20.field3413[var20.field3417] = (short) arg10[var27];
                            var20.field3419[var20.field3417] = (short) arg11[var27];
                        } else {
                            var20.field3413[var20.field3417] = -1;
                        }
                    }
                    ++var20.field3417;
                }
            }
            this.field193[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class397 var34 = new class397();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field5933 = class331.method2033(class103.method652(arg9[0], (byte) -59), -35, this.field201[arg0][arg1] - this.field209[arg0][arg1]);
                    if (var35 == -1) {
                        var34.field5928 = (byte) (var34.field5928 | 2);
                    }
                }
                if (this.field214[arg0 + 1][arg1] == this.field214[arg0][arg1] && this.field214[arg0 + 1][arg1 + 1] == this.field214[arg0][arg1] && this.field214[arg0][arg1 + 1] == this.field214[arg0][arg1]) {
                    var34.field5928 = (byte) (var34.field5928 | 1);
                }
                if (var36 != -1 && (var34.field5928 & 2) == 0 && !this.field200.field807.method180(var36, -119).field2129) {
                    var34.field5931 = (short) (this.field201[arg0][arg1] - this.field209[arg0][arg1]);
                    var34.field5930 = (short) (this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1]);
                    var34.field5932 = (short) (this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1]);
                    var34.field5927 = (short) (this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1]);
                    var34.field5929 = (short) var36;
                } else {
                    short var37 = class103.method652(var35, (byte) 116);
                    var34.field5931 = (short) class331.method2033(var37, 89, this.field201[arg0][arg1] - this.field209[arg0][arg1]);
                    var34.field5930 = (short) class331.method2033(var37, 63, this.field201[arg0 + 1][arg1] - this.field209[arg0 + 1][arg1]);
                    var34.field5932 = (short) class331.method2033(var37, 99, this.field201[arg0 + 1][arg1 + 1] - this.field209[arg0 + 1][arg1 + 1]);
                    var34.field5927 = (short) class331.method2033(var37, -78, this.field201[arg0][arg1 + 1] - this.field209[arg0][arg1 + 1]);
                    var34.field5929 = -1;
                }
                this.field198[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILss;[I[I[I)V")
    private final void method109(int arg0, int arg1, class285 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class397 var7 = this.field198[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5928 & 2) == 0) {
                int var8 = this.field206 * arg0;
                int var9 = this.field206 + var8;
                int var10 = this.field206 * arg1;
                int var11 = this.field206 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field5928 & 1) != 0) {
                    int var12 = this.field214[arg0][arg1];
                    int var13 = this.field216 * var12;
                    var14 = (this.field215 * var10 + this.field210 * var8 + var13 >> 15) + this.field195;
                    if (var14 <= this.field200.field813) {
                        return;
                    }
                    var15 = (this.field215 * var10 + this.field210 * var9 + var13 >> 15) + this.field195;
                    if (var15 <= this.field200.field813) {
                        return;
                    }
                    int var16 = (this.field215 * var11 + this.field210 * var9 + var13 >> 15) + this.field195;
                    if (var16 <= this.field200.field813) {
                        return;
                    }
                    var17 = (this.field215 * var11 + this.field210 * var8 + var13 >> 15) + this.field195;
                    if (var17 <= this.field200.field813) {
                        return;
                    }
                    int var18 = this.field202 * var12;
                    int var19 = this.field205 * var12;
                    var20 = (this.field199 * var10 + this.field207 * var8 + var18 >> 15) + this.field197;
                    var21 = this.field200.field825 * var20 / var14 + arg2.field4346;
                    var22 = (this.field212 * var10 + this.field194 * var8 + var19 >> 15) + this.field196;
                    var23 = this.field200.field822 * var22 / var14 + arg2.field4340;
                    var24 = (this.field199 * var10 + this.field207 * var9 + var18 >> 15) + this.field197;
                    var25 = this.field200.field825 * var24 / var15 + arg2.field4346;
                    var26 = (this.field212 * var10 + this.field194 * var9 + var19 >> 15) + this.field196;
                    var27 = this.field200.field822 * var26 / var15 + arg2.field4340;
                    int var28 = (this.field199 * var11 + this.field207 * var9 + var18 >> 15) + this.field197;
                    var29 = this.field200.field825 * var28 / var16 + arg2.field4346;
                    int var30 = (this.field212 * var11 + this.field194 * var9 + var19 >> 15) + this.field196;
                    var31 = this.field200.field822 * var30 / var16 + arg2.field4340;
                    var32 = (this.field199 * var11 + this.field207 * var8 + var18 >> 15) + this.field197;
                    var33 = this.field200.field825 * var32 / var17 + arg2.field4346;
                    var34 = (this.field212 * var11 + this.field194 * var8 + var19 >> 15) + this.field196;
                    var35 = this.field200.field822 * var34 / var17 + arg2.field4340;
                } else {
                    int var36 = this.field214[arg0][arg1];
                    int var37 = this.field214[arg0 + 1][arg1];
                    int var38 = this.field214[arg0 + 1][arg1 + 1];
                    int var39 = this.field214[arg0][arg1 + 1];
                    var14 = (this.field215 * var10 + this.field216 * var36 + this.field210 * var8 >> 15) + this.field195;
                    if (var14 <= this.field200.field813) {
                        return;
                    }
                    var15 = (this.field215 * var10 + this.field216 * var37 + this.field210 * var9 >> 15) + this.field195;
                    if (var15 <= this.field200.field813) {
                        return;
                    }
                    int var40 = (this.field215 * var11 + this.field216 * var38 + this.field210 * var9 >> 15) + this.field195;
                    if (var40 <= this.field200.field813) {
                        return;
                    }
                    var17 = (this.field215 * var11 + this.field216 * var39 + this.field210 * var8 >> 15) + this.field195;
                    if (var17 <= this.field200.field813) {
                        return;
                    }
                    var20 = (this.field199 * var10 + this.field207 * var8 + this.field202 * var36 >> 15) + this.field197;
                    var21 = this.field200.field825 * var20 / var14 + arg2.field4346;
                    var22 = (this.field212 * var10 + this.field205 * var36 + this.field194 * var8 >> 15) + this.field196;
                    var23 = this.field200.field822 * var22 / var14 + arg2.field4340;
                    var24 = (this.field199 * var10 + this.field207 * var9 + this.field202 * var37 >> 15) + this.field197;
                    var25 = this.field200.field825 * var24 / var15 + arg2.field4346;
                    var26 = (this.field212 * var10 + this.field205 * var37 + this.field194 * var9 >> 15) + this.field196;
                    var27 = this.field200.field822 * var26 / var15 + arg2.field4340;
                    int var41 = (this.field199 * var11 + this.field207 * var9 + this.field202 * var38 >> 15) + this.field197;
                    var29 = this.field200.field825 * var41 / var40 + arg2.field4346;
                    int var42 = (this.field212 * var11 + this.field205 * var38 + this.field194 * var9 >> 15) + this.field196;
                    var31 = this.field200.field822 * var42 / var40 + arg2.field4340;
                    var32 = (this.field199 * var11 + this.field207 * var8 + this.field202 * var39 >> 15) + this.field197;
                    var33 = this.field200.field825 * var32 / var17 + arg2.field4346;
                    var34 = (this.field212 * var11 + this.field205 * var39 + this.field194 * var8 >> 15) + this.field196;
                    var35 = this.field200.field822 * var34 / var17 + arg2.field4340;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field4344 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field4348 || var33 > arg2.field4348 || var25 > arg2.field4348;
                    if (var7.field5929 >= 0) {
                        if (this.method96(this.field200.field807.method180(var7.field5929, -112).field2125)) {
                            arg2.field4350 = 100;
                        }
                        arg2.method1761(var31, var35, var27, var29, var33, var25, var7.field5932 & 65535, var7.field5927 & 65535, var7.field5930 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5929);
                        arg2.field4350 = 0;
                    } else {
                        arg2.method1759(var31, var35, var27, var29, var33, var25, var7.field5932 & 65535, var7.field5927 & 65535, var7.field5930 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field4344 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field4348 || var25 > arg2.field4348 || var33 > arg2.field4348;
                    if (var7.field5929 >= 0) {
                        if (this.method96(this.field200.field807.method180(var7.field5929, -122).field2125)) {
                            arg2.field4350 = 100;
                        }
                        arg2.method1761(var23, var27, var35, var21, var25, var33, var7.field5931 & 65535, var7.field5930 & 65535, var7.field5927 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5929);
                        arg2.field4350 = 0;
                        return;
                    }
                    arg2.method1759(var23, var27, var35, var21, var25, var33, var7.field5931 & 65535, var7.field5930 & 65535, var7.field5927 & 65535);
                }
            }
        } else {
            class224 var43 = this.field193[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field3415; ++var44) {
                    int var84 = var43.field3423[var44];
                    int var85 = var43.field3416[var44];
                    int var86 = var43.field3421[var44];
                    int var87 = (this.field215 * var86 + this.field216 * var85 + this.field210 * var84 >> 15) + this.field195;
                    if (var87 <= this.field200.field813) {
                        return;
                    }
                    int var88 = (this.field199 * var86 + this.field207 * var84 + this.field202 * var85 >> 15) + this.field197;
                    int var89 = (this.field212 * var86 + this.field205 * var85 + this.field194 * var84 >> 15) + this.field196;
                    arg3[var44] = this.field200.field825 * var88 / var87 + arg2.field4346;
                    arg4[var44] = this.field200.field822 * var89 / var87 + arg2.field4340;
                }
                if (var43.field3413 != null) {
                    int var45 = this.field214[arg0][arg1];
                    int var46 = this.field214[arg0 + 1][arg1];
                    int var47 = this.field214[arg0][arg1 + 1];
                    int var48 = this.field206 * arg0;
                    int var49 = this.field206 + var48;
                    int var50 = this.field206 * arg1;
                    int var51 = this.field206 + var50;
                    int var52 = (this.field199 * var50 + this.field207 * var48 + this.field202 * var45 >> 15) + this.field197;
                    int var53 = (this.field212 * var50 + this.field205 * var45 + this.field194 * var48 >> 15) + this.field196;
                    int var54 = (this.field215 * var50 + this.field216 * var45 + this.field210 * var48 >> 15) + this.field195;
                    int var55 = (this.field199 * var50 + this.field207 * var49 + this.field202 * var46 >> 15) + this.field197;
                    int var56 = (this.field212 * var50 + this.field205 * var46 + this.field194 * var49 >> 15) + this.field196;
                    int var57 = (this.field215 * var50 + this.field216 * var46 + this.field210 * var49 >> 15) + this.field195;
                    int var58 = (this.field199 * var51 + this.field207 * var48 + this.field202 * var47 >> 15) + this.field197;
                    int var59 = (this.field212 * var51 + this.field205 * var47 + this.field194 * var48 >> 15) + this.field196;
                    int var60 = (this.field215 * var51 + this.field216 * var47 + this.field210 * var48 >> 15) + this.field195;
                    for (int var61 = 0; var61 < var43.field3417; ++var61) {
                        short var62 = var43.field3418[var61];
                        short var63 = var43.field3414[var61];
                        short var64 = var43.field3420[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field4344 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field4348 || var66 > arg2.field4348 || var67 > arg2.field4348;
                            short var71 = var43.field3413[var61];
                            if (var71 != -1) {
                                if (this.method96(this.field200.field807.method180(var71, 122).field2125)) {
                                    arg2.field4350 = 100;
                                }
                                arg2.method1761(var68, var69, var70, var65, var66, var67, var43.field3422[var62], var43.field3422[var63], var43.field3422[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field4350 = 0;
                            } else {
                                int var72 = var43.field3424[var61];
                                if (var72 != -1) {
                                    arg2.method1759(var68, var69, var70, var65, var66, var67, class331.method2033(var72, 77, var43.field3422[var62]), class331.method2033(var72, -10, var43.field3422[var63]), class331.method2033(var72, 103, var43.field3422[var64]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field3417; ++var73) {
                    short var74 = var43.field3418[var73];
                    short var75 = var43.field3414[var73];
                    short var76 = var43.field3420[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field3424[var73];
                        if (var83 != -1) {
                            arg2.field4344 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field4348 || var78 > arg2.field4348 || var79 > arg2.field4348;
                            arg2.method1759(var80, var81, var82, var77, var78, var79, class331.method2033(var83, -11, var43.field3422[var74]), class331.method2033(var83, 118, var43.field3422[var75]), class331.method2033(var83, 89, var43.field3422[var76]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILqn;)Lqn;")
    public final class380 method110(int arg0, int arg1, class380 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class278 var9 = this.field200.method348(Thread.currentThread());
        class285 var10 = var9.field4231;
        var10.field4350 = 0;
        var10.field4344 = false;
        if (this.field213 != null) {
            this.method103(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4249, var9.field4269);
        } else {
            if (this.field198 != null) {
                this.method93(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4249, var9.field4269);
            }
        }
    }
}
