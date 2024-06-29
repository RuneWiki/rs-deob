import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class259 extends class142 {

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    private int field3829 = -1;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Lbc;")
    private class246 field3810;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    private int field3821;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "[[I")
    public int[][] field3825;

    @OriginalMember(owner = "client!es", name = "E", descriptor = "[[B")
    private byte[][] field3831;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "[[B")
    private byte[][] field3824;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    private int field3811;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    private int field3812;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    private int field3816;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    private int field3819;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    private int field3823;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "[[Lui;")
    private class152[][] field3815;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "[[Lcl;")
    private class174[][] field3818;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "[[Ltc;")
    private class234[][] field3817;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "[[Lpi;")
    private class343[][] field3822;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Lba;IIIIZ)V")
    public final void method415(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!es", name = "p", descriptor = "(Lba;IIIIZ)V")
    public final void method425(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!es", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method421(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field3822 == null) {
            this.field3822 = new class343[super.field2007][super.field2003];
            this.field3817 = new class234[super.field2007][super.field2003];
        } else if (this.field3815 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class121.field1717[class369.method2281(-94, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class121.field1717[class369.method2281(127, arg7[var16]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field2006 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field2006 && arg4[var22] == super.field2006) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field2006) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field2006 != arg2[var24] && arg2[0] - super.field2006 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field2006 != arg4[var24] && arg4[0] - super.field2006 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class343 var25 = new class343();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field4744 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field4748 = (byte) (var25.field4748 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field3825[arg0 + 1][arg1] == this.field3825[arg0][arg1] && this.field3825[arg0 + 1][arg1 + 1] == this.field3825[arg0][arg1] && this.field3825[arg0][arg1 + 1] == this.field3825[arg0][arg1]) {
                    var25.field4748 = (byte) (var25.field4748 | 1);
                }
                if (var27 != -1 && (var25.field4748 & 2) == 0 && !this.field3810.field425.method1780(-31305, var27).field1439) {
                    var25.field4741 = this.field3831[arg0][arg1] - this.field3824[arg0][arg1];
                    var25.field4743 = this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1];
                    var25.field4738 = this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1];
                    var25.field4746 = this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1];
                    var25.field4739 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field4741 = class173.method1225(true, arg10, var28, method1666(arg6[var18] >> 8, this.field3831[arg0][arg1] - this.field3824[arg0][arg1]));
                    if (var25.field4744 != 0) {
                        var25.field4741 |= 255 - (this.field3831[arg0][arg1] - this.field3824[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field4743 = class173.method1225(true, arg10, var29, method1666(arg6[var19] >> 8, this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1]));
                    if (var25.field4744 != 0) {
                        var25.field4743 |= 255 - (this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field4738 = class173.method1225(true, arg10, var30, method1666(arg6[var20] >> 8, this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1]));
                    if (var25.field4744 != 0) {
                        var25.field4738 |= 255 - (this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field4746 = class173.method1225(true, arg10, var31, method1666(arg6[var21] >> 8, this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1]));
                    if (var25.field4744 != 0) {
                        var25.field4746 |= 255 - (this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1]) << 25;
                    }
                    var25.field4739 = -1;
                }
                if (arg5 != null) {
                    var25.field4742 = (short) arg5[var20];
                    var25.field4745 = (short) arg5[var21];
                    var25.field4747 = (short) arg5[var19];
                    var25.field4740 = (short) arg5[var18];
                }
                this.field3822[arg0][arg1] = var25;
            } else {
                class234 var32 = new class234();
                var32.field3442 = (short) arg2.length;
                var32.field3434 = (short) (arg2.length / 3);
                var32.field3441 = new short[var32.field3442];
                var32.field3440 = new short[var32.field3442];
                var32.field3433 = new short[var32.field3442];
                var32.field3439 = new int[var32.field3442];
                if (arg5 != null) {
                    var32.field3435 = new short[var32.field3442];
                }
                for (int var33 = 0; var33 < var32.field3442; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field3831[arg0][arg1] - this.field3824[arg0][arg1];
                    } else if (var48 == 0 && super.field2006 == var49) {
                        var51 = this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1];
                    } else if (super.field2006 == var48 && super.field2006 == var49) {
                        var51 = this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1];
                    } else if (super.field2006 == var48 && var49 == 0) {
                        var51 = this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1]) * var48 + (this.field3831[arg0][arg1] - this.field3824[arg0][arg1]) * (super.field2006 - var48);
                        int var53 = (this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1]) * var48 + (this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1]) * (super.field2006 - var48);
                        var51 = (super.field2006 - var49) * var52 + var49 * var53 >> super.field2001 * 2;
                    }
                    int var54 = (arg0 << super.field2001) + var48;
                    int var55 = (arg1 << super.field2001) + var49;
                    var32.field3441[var33] = (short) var48;
                    var32.field3433[var33] = (short) var49;
                    var32.field3440[var33] = (short) (this.method426(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field3810.field425.method1780(-31305, arg8[var33]).field1439) {
                        var32.field3439[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field3439[var33] = var51 << 25;
                        } else {
                            var32.field3439[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field3435[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field3439[var33] = class173.method1225(true, arg10, var56, method1666(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field3439[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field3434; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field3810.field425.method1780(-31305, arg8[var35 * 3]).field1439) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field3437 = new int[var32.field3434];
                }
                if (var34) {
                    var32.field3436 = new short[var32.field3434];
                    var32.field3438 = new short[var32.field3434];
                }
                for (int var36 = 0; var36 < var32.field3434; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field3437[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field3810.field425.method1780(-31305, var42).field1439) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field3810.field425.method1780(-31305, var43).field1439) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field3810.field425.method1780(-31305, var44).field1439) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field3436[var36] = (short) var44;
                            var32.field3438[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field3810.field425.method1780(-31305, var45).field1439) {
                                    var32.field3439[var37] = class121.field1717[class369.method2281(126, this.field3810.field425.method1780(-31305, var45).field1454 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field3810.field425.method1780(-31305, var46).field1439) {
                                    var32.field3439[var38] = class121.field1717[class369.method2281(-48, this.field3810.field425.method1780(-31305, var46).field1454 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field3810.field425.method1780(-31305, var47).field1439) {
                                    var32.field3439[var39] = class121.field1717[class369.method2281(-29, this.field3810.field425.method1780(-31305, var47).field1454 & 65535) & 65535];
                                }
                            }
                            var32.field3436[var36] = -1;
                        }
                    }
                }
                this.field3817[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIII[[ZLqv;[I[I)V")
    private final void method1665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class309 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4405 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field3822[var16][var17] != null) {
                        class343 var18 = this.field3822[var16][var17];
                        if (var18.field4739 != -1 && (var18.field4748 & 2) == 0 && var18.field4744 == 0) {
                            int var19 = this.field3810.method1612(var18.field4739);
                            arg8.method1923(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class427.method2605(114, var19, var18.field4738), class427.method2605(127, var19, var18.field4746), class427.method2605(114, var19, var18.field4743));
                            arg8.method1923(var15, var15, var15 - var13, var14, var13 + var14, var14, class427.method2605(100, var19, var18.field4741), class427.method2605(102, var19, var18.field4743), class427.method2605(109, var19, var18.field4746));
                        } else if (var18.field4744 == 0) {
                            arg8.method1924(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4738, var18.field4746, var18.field4743);
                            arg8.method1924(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4741, var18.field4743, var18.field4746);
                        } else {
                            int var20 = var18.field4744;
                            arg8.method1924(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class65.method626((byte) 70, var20, var18.field4738 & -16777216), class65.method626((byte) 70, var20, var18.field4746 & -16777216), class65.method626((byte) 70, var20, var18.field4743 & -16777216));
                            arg8.method1924(var15, var15, var15 - var13, var14, var13 + var14, var14, class65.method626((byte) 70, var20, var18.field4741 & -16777216), class65.method626((byte) 70, var20, var18.field4743 & -16777216), class65.method626((byte) 70, var20, var18.field4746 & -16777216));
                        }
                    } else if (this.field3817[var16][var17] != null) {
                        class234 var21 = this.field3817[var16][var17];
                        for (int var22 = 0; var22 < var21.field3442; ++var22) {
                            arg9[var22] = var21.field3441[var22] * var13 / super.field2006 + var14;
                            arg10[var22] = var15 - var21.field3433[var22] * var13 / super.field2006;
                        }
                        for (int var23 = 0; var23 < var21.field3434; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3437 != null && var21.field3437[var23] != 0 && (var21.field3436 == null || var21.field3436 != null && var21.field3436[var23] == -1)) {
                                int var33 = var21.field3437[var23];
                                arg8.method1924(var30, var31, var32, var27, var28, var29, class65.method626((byte) 70, var33, -16777216 - (var21.field3439[var24] & -16777216)), class65.method626((byte) 70, var33, -16777216 - (var21.field3439[var25] & -16777216)), class65.method626((byte) 70, var33, -16777216 - (var21.field3439[var26] & -16777216)));
                            } else if (var21.field3436 != null && var21.field3436[var23] != -1) {
                                int var34 = this.field3810.method1612(var21.field3436[var23]);
                                arg8.method1923(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1924(var30, var31, var32, var27, var28, var29, var21.field3439[var24], var21.field3439[var25], var21.field3439[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4405 = true;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(II)I")
    private static final int method1666(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!es", name = "l", descriptor = "(II)I")
    public final int method430(int arg0, int arg1) {
        return this.field3825[arg0][arg1];
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field3815 == null) {
            this.field3815 = new class152[super.field2007][super.field2003];
            this.field3818 = new class174[super.field2007][super.field2003];
        } else if (this.field3822 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field2006 != var20 || var21 != 0 && super.field2006 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class174 var22 = new class174();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field2461 = var23;
            var22.field2463 = new short[var23];
            var22.field2469 = new short[var23];
            var22.field2470 = new short[var23];
            var22.field2468 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field2463[var25] = (short) (this.field3831[arg0][arg1] - this.field3824[arg0][arg1]);
                } else if (var30 == 0 && super.field2006 == var31) {
                    var22.field2463[var25] = (short) (this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1]);
                } else if (super.field2006 == var30 && super.field2006 == var31) {
                    var22.field2463[var25] = (short) (this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1]);
                } else if (super.field2006 == var30 && var31 == 0) {
                    var22.field2463[var25] = (short) (this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1]) * var30 + (this.field3831[arg0][arg1] - this.field3824[arg0][arg1]) * (super.field2006 - var30);
                    int var33 = (this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1]) * var30 + (this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1]) * (super.field2006 - var30);
                    var22.field2463[var25] = (short) ((super.field2006 - var31) * var32 + var31 * var33 >> super.field2001 * 2);
                }
                int var34 = (arg0 << super.field2001) + var30;
                int var35 = (arg1 << super.field2001) + var31;
                var22.field2469[var25] = (short) var30;
                var22.field2468[var25] = (short) var31;
                var22.field2470[var25] = (short) (this.method426(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field2463[var25] < 2) {
                    var22.field2463[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field3810.field425.method1780(-31305, arg11[var28]).field1439) {
                    var26 = true;
                }
            }
            var22.field2467 = new int[var27];
            if (arg10 != null) {
                var22.field2465 = new int[var27];
            }
            var22.field2464 = new short[var27];
            var22.field2462 = new short[var27];
            var22.field2466 = new short[var27];
            if (var26) {
                var22.field2471 = new short[var27];
                var22.field2460 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field2467[var22.field2472] = class369.method2281(-62, arg9[var29]);
                    } else {
                        var22.field2467[var22.field2472] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field2465[var22.field2472] = class369.method2281(125, arg10[var29]);
                        } else {
                            var22.field2465[var22.field2472] = -1;
                        }
                    }
                    var22.field2464[var22.field2472] = (short) arg6[var29];
                    var22.field2462[var22.field2472] = (short) arg7[var29];
                    var22.field2466[var22.field2472] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field3810.field425.method1780(-31305, arg11[var29]).field1439) {
                            var22.field2471[var22.field2472] = (short) arg11[var29];
                            var22.field2460[var22.field2472] = (short) arg12[var29];
                        } else {
                            var22.field2471[var22.field2472] = -1;
                        }
                    }
                    ++var22.field2472;
                }
            }
            this.field3818[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class152 var36 = new class152();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field2151 = class427.method2605(101, class369.method2281(-118, arg10[0]), this.field3831[arg0][arg1] - this.field3824[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field2150 = (byte) (var36.field2150 | 2);
                    }
                }
                if (this.field3825[arg0 + 1][arg1] == this.field3825[arg0][arg1] && this.field3825[arg0 + 1][arg1 + 1] == this.field3825[arg0][arg1] && this.field3825[arg0][arg1 + 1] == this.field3825[arg0][arg1]) {
                    var36.field2150 = (byte) (var36.field2150 | 1);
                }
                if (var38 != -1 && (var36.field2150 & 2) == 0 && !this.field3810.field425.method1780(-31305, var38).field1439) {
                    var36.field2154 = (short) (this.field3831[arg0][arg1] - this.field3824[arg0][arg1]);
                    var36.field2155 = (short) (this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1]);
                    var36.field2149 = (short) (this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1]);
                    var36.field2152 = (short) (this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1]);
                    var36.field2153 = (short) var38;
                } else {
                    short var39 = class369.method2281(-102, var37);
                    var36.field2154 = (short) class427.method2605(127, var39, this.field3831[arg0][arg1] - this.field3824[arg0][arg1]);
                    var36.field2155 = (short) class427.method2605(115, var39, this.field3831[arg0 + 1][arg1] - this.field3824[arg0 + 1][arg1]);
                    var36.field2149 = (short) class427.method2605(102, var39, this.field3831[arg0 + 1][arg1 + 1] - this.field3824[arg0 + 1][arg1 + 1]);
                    var36.field2152 = (short) class427.method2605(118, var39, this.field3831[arg0][arg1 + 1] - this.field3824[arg0][arg1 + 1]);
                    var36.field2153 = -1;
                }
                this.field3815[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
    private final boolean method1667(int arg0) {
        if ((this.field3821 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!es", name = "ca", descriptor = "()V")
    public final void method419() {
        this.field3831 = null;
        this.field3824 = null;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lbc;IIII[[I[[II)V")
    public class259(class246 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3810 = arg0;
        this.field3821 = arg2;
        this.field3825 = arg5;
        this.field3831 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field3810.field3624 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field3810.field3642 * var18 + this.field3810.field3635 * var17 + this.field3810.field3619 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field3831[var11][var10] = (byte) var20;
            }
        }
        this.field3824 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!es", name = "k", descriptor = "(IILba;)Lba;")
    public final class263 method431(int arg0, int arg1, class263 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lvp;[I)V")
    public final void method424(class124 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(IIIIIII[[ZLqv;[I[I)V")
    private final void method1668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class309 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4405 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field3815[var16][var17] != null) {
                        class152 var18 = this.field3815[var16][var17];
                        if (var18.field2153 != -1 && (var18.field2150 & 2) == 0 && var18.field2151 == -1) {
                            int var19 = this.field3810.method1612(var18.field2153);
                            arg8.method1923(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class427.method2605(122, var19, var18.field2149 & 65535), class427.method2605(103, var19, var18.field2152 & 65535), class427.method2605(115, var19, var18.field2155 & 65535));
                            arg8.method1923(var15, var15, var15 - var13, var14, var13 + var14, var14, class427.method2605(123, var19, var18.field2154 & 65535), class427.method2605(112, var19, var18.field2155 & 65535), class427.method2605(126, var19, var18.field2152 & 65535));
                        } else if (var18.field2151 == -1) {
                            arg8.method1923(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2149 & 65535, var18.field2152 & 65535, var18.field2155 & 65535);
                            arg8.method1923(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2154 & 65535, var18.field2155 & 65535, var18.field2152 & 65535);
                        } else {
                            int var20 = var18.field2151;
                            arg8.method1923(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1923(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field3818[var16][var17] != null) {
                        class174 var21 = this.field3818[var16][var17];
                        for (int var22 = 0; var22 < var21.field2461; ++var22) {
                            arg9[var22] = var21.field2469[var22] * var13 / super.field2006 + var14;
                            arg10[var22] = var15 - var21.field2468[var22] * var13 / super.field2006;
                        }
                        for (int var23 = 0; var23 < var21.field2472; ++var23) {
                            short var24 = var21.field2464[var23];
                            short var25 = var21.field2462[var23];
                            short var26 = var21.field2466[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2465 != null && var21.field2465[var23] != -1) {
                                int var33 = var21.field2465[var23];
                                arg8.method1923(var30, var31, var32, var27, var28, var29, class427.method2605(123, var33, var21.field2463[var24]), class427.method2605(101, var33, var21.field2463[var25]), class427.method2605(112, var33, var21.field2463[var26]));
                            } else if (var21.field2471 != null && var21.field2471[var23] != -1) {
                                int var34 = this.field3810.method1612(var21.field2471[var23]);
                                arg8.method1923(var30, var31, var32, var27, var28, var29, class427.method2605(121, var34, var21.field2463[var24]), class427.method2605(100, var34, var21.field2463[var25]), class427.method2605(102, var34, var21.field2463[var26]));
                            } else {
                                int var35 = var21.field2467[var23];
                                arg8.method1923(var30, var31, var32, var27, var28, var29, class427.method2605(113, var35, var21.field2463[var24]), class427.method2605(126, var35, var21.field2463[var25]), class427.method2605(100, var35, var21.field2463[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4405 = true;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILqv;[I[I[I)V")
    private final void method1669(int arg0, int arg1, class309 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class152 var7 = this.field3815[arg0][arg1];
        if (var7 != null) {
            if ((var7.field2150 & 2) == 0) {
                int var8 = super.field2006 * arg0;
                int var9 = super.field2006 + var8;
                int var10 = super.field2006 * arg1;
                int var11 = super.field2006 + var10;
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
                if ((var7.field2150 & 1) != 0) {
                    int var12 = this.field3825[arg0][arg1];
                    int var16;
                    if (this.field3829 == -1) {
                        int var13 = this.field3827 * var12;
                        var14 = (this.field3816 * var10 + this.field3811 * var8 + var13 >> 15) + this.field3828;
                        if (var14 <= this.field3810.field3627) {
                            return;
                        }
                        var15 = (this.field3816 * var10 + this.field3811 * var9 + var13 >> 15) + this.field3828;
                        if (var15 <= this.field3810.field3627) {
                            return;
                        }
                        var16 = (this.field3816 * var11 + this.field3811 * var9 + var13 >> 15) + this.field3828;
                        if (var16 <= this.field3810.field3627) {
                            return;
                        }
                        var17 = (this.field3816 * var11 + this.field3811 * var8 + var13 >> 15) + this.field3828;
                        if (var17 <= this.field3810.field3627) {
                            return;
                        }
                    } else {
                        var17 = this.field3829;
                        var16 = this.field3829;
                        var15 = this.field3829;
                        var14 = this.field3829;
                    }
                    int var18 = this.field3823 * var12;
                    int var19 = this.field3812 * var12;
                    var20 = (this.field3814 * var10 + this.field3820 * var8 + var18 >> 15) + this.field3813;
                    var21 = this.field3810.field3639 * var20 / var14 + arg2.field4408;
                    var22 = (this.field3826 * var10 + this.field3830 * var8 + var19 >> 15) + this.field3819;
                    var23 = this.field3810.field3640 * var22 / var14 + arg2.field4414;
                    var24 = (this.field3814 * var10 + this.field3820 * var9 + var18 >> 15) + this.field3813;
                    var25 = this.field3810.field3639 * var24 / var15 + arg2.field4408;
                    var26 = (this.field3826 * var10 + this.field3830 * var9 + var19 >> 15) + this.field3819;
                    var27 = this.field3810.field3640 * var26 / var15 + arg2.field4414;
                    int var28 = (this.field3814 * var11 + this.field3820 * var9 + var18 >> 15) + this.field3813;
                    var29 = this.field3810.field3639 * var28 / var16 + arg2.field4408;
                    int var30 = (this.field3826 * var11 + this.field3830 * var9 + var19 >> 15) + this.field3819;
                    var31 = this.field3810.field3640 * var30 / var16 + arg2.field4414;
                    var32 = (this.field3814 * var11 + this.field3820 * var8 + var18 >> 15) + this.field3813;
                    var33 = this.field3810.field3639 * var32 / var17 + arg2.field4408;
                    var34 = (this.field3826 * var11 + this.field3830 * var8 + var19 >> 15) + this.field3819;
                    var35 = this.field3810.field3640 * var34 / var17 + arg2.field4414;
                } else {
                    int var36 = this.field3825[arg0][arg1];
                    int var37 = this.field3825[arg0 + 1][arg1];
                    int var38 = this.field3825[arg0 + 1][arg1 + 1];
                    int var39 = this.field3825[arg0][arg1 + 1];
                    int var40;
                    if (this.field3829 == -1) {
                        var14 = (this.field3816 * var10 + this.field3827 * var36 + this.field3811 * var8 >> 15) + this.field3828;
                        if (var14 <= this.field3810.field3627) {
                            return;
                        }
                        var15 = (this.field3816 * var10 + this.field3827 * var37 + this.field3811 * var9 >> 15) + this.field3828;
                        if (var15 <= this.field3810.field3627) {
                            return;
                        }
                        var40 = (this.field3816 * var11 + this.field3827 * var38 + this.field3811 * var9 >> 15) + this.field3828;
                        if (var40 <= this.field3810.field3627) {
                            return;
                        }
                        var17 = (this.field3816 * var11 + this.field3827 * var39 + this.field3811 * var8 >> 15) + this.field3828;
                        if (var17 <= this.field3810.field3627) {
                            return;
                        }
                    } else {
                        var17 = this.field3829;
                        var40 = this.field3829;
                        var15 = this.field3829;
                        var14 = this.field3829;
                    }
                    var20 = (this.field3814 * var10 + this.field3823 * var36 + this.field3820 * var8 >> 15) + this.field3813;
                    var21 = this.field3810.field3639 * var20 / var14 + arg2.field4408;
                    var22 = (this.field3826 * var10 + this.field3830 * var8 + this.field3812 * var36 >> 15) + this.field3819;
                    var23 = this.field3810.field3640 * var22 / var14 + arg2.field4414;
                    var24 = (this.field3814 * var10 + this.field3823 * var37 + this.field3820 * var9 >> 15) + this.field3813;
                    var25 = this.field3810.field3639 * var24 / var15 + arg2.field4408;
                    var26 = (this.field3826 * var10 + this.field3830 * var9 + this.field3812 * var37 >> 15) + this.field3819;
                    var27 = this.field3810.field3640 * var26 / var15 + arg2.field4414;
                    int var41 = (this.field3814 * var11 + this.field3823 * var38 + this.field3820 * var9 >> 15) + this.field3813;
                    var29 = this.field3810.field3639 * var41 / var40 + arg2.field4408;
                    int var42 = (this.field3826 * var11 + this.field3830 * var9 + this.field3812 * var38 >> 15) + this.field3819;
                    var31 = this.field3810.field3640 * var42 / var40 + arg2.field4414;
                    var32 = (this.field3814 * var11 + this.field3823 * var39 + this.field3820 * var8 >> 15) + this.field3813;
                    var33 = this.field3810.field3639 * var32 / var17 + arg2.field4408;
                    var34 = (this.field3826 * var11 + this.field3830 * var8 + this.field3812 * var39 >> 15) + this.field3819;
                    var35 = this.field3810.field3640 * var34 / var17 + arg2.field4414;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field4406 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field4403 || var33 > arg2.field4403 || var25 > arg2.field4403;
                    if (var7.field2153 >= 0) {
                        if (this.method1667(this.field3810.field425.method1780(-31305, var7.field2153).field1443)) {
                            arg2.field4411 = 100;
                        }
                        arg2.method1921(var31, var35, var27, var29, var33, var25, var7.field2149 & 65535, var7.field2152 & 65535, var7.field2155 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2153);
                        arg2.field4411 = 0;
                    } else {
                        arg2.method1923(var31, var35, var27, var29, var33, var25, var7.field2149 & 65535, var7.field2152 & 65535, var7.field2155 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field4406 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field4403 || var25 > arg2.field4403 || var33 > arg2.field4403;
                    if (var7.field2153 >= 0) {
                        if (this.method1667(this.field3810.field425.method1780(-31305, var7.field2153).field1443)) {
                            arg2.field4411 = 100;
                        }
                        arg2.method1921(var23, var27, var35, var21, var25, var33, var7.field2154 & 65535, var7.field2155 & 65535, var7.field2152 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2153);
                        arg2.field4411 = 0;
                        return;
                    }
                    arg2.method1923(var23, var27, var35, var21, var25, var33, var7.field2154 & 65535, var7.field2155 & 65535, var7.field2152 & 65535);
                }
            }
        } else {
            class174 var43 = this.field3818[arg0][arg1];
            if (var43 != null) {
                if (this.field3829 == -1) {
                    for (int var44 = 0; var44 < var43.field2461; ++var44) {
                        int var45 = (arg0 << super.field2001) + var43.field2469[var44];
                        short var46 = var43.field2470[var44];
                        int var47 = (arg1 << super.field2001) + var43.field2468[var44];
                        int var48 = (this.field3816 * var47 + this.field3827 * var46 + this.field3811 * var45 >> 15) + this.field3828;
                        if (var48 <= this.field3810.field3627) {
                            return;
                        }
                        int var49 = (this.field3814 * var47 + this.field3823 * var46 + this.field3820 * var45 >> 15) + this.field3813;
                        int var50 = (this.field3826 * var47 + this.field3830 * var45 + this.field3812 * var46 >> 15) + this.field3819;
                        arg3[var44] = this.field3810.field3639 * var49 / var48 + arg2.field4408;
                        arg4[var44] = this.field3810.field3640 * var50 / var48 + arg2.field4414;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field2461; ++var51) {
                        int var91 = (arg0 << super.field2001) + var43.field2469[var51];
                        short var92 = var43.field2470[var51];
                        int var93 = (arg1 << super.field2001) + var43.field2468[var51];
                        int var94 = (this.field3814 * var93 + this.field3823 * var92 + this.field3820 * var91 >> 15) + this.field3813;
                        int var95 = (this.field3826 * var93 + this.field3830 * var91 + this.field3812 * var92 >> 15) + this.field3819;
                        arg3[var51] = this.field3810.field3639 * var94 / this.field3829 + arg2.field4408;
                        arg4[var51] = this.field3810.field3640 * var95 / this.field3829 + arg2.field4414;
                    }
                }
                if (var43.field2471 != null) {
                    int var52 = this.field3825[arg0][arg1];
                    int var53 = this.field3825[arg0 + 1][arg1];
                    int var54 = this.field3825[arg0][arg1 + 1];
                    int var55 = super.field2006 * arg0;
                    int var56 = super.field2006 + var55;
                    int var57 = super.field2006 * arg1;
                    int var58 = super.field2006 + var57;
                    int var59 = (this.field3814 * var57 + this.field3823 * var52 + this.field3820 * var55 >> 15) + this.field3813;
                    int var60 = (this.field3826 * var57 + this.field3830 * var55 + this.field3812 * var52 >> 15) + this.field3819;
                    int var61 = (this.field3816 * var57 + this.field3827 * var52 + this.field3811 * var55 >> 15) + this.field3828;
                    int var62 = (this.field3814 * var57 + this.field3823 * var53 + this.field3820 * var56 >> 15) + this.field3813;
                    int var63 = (this.field3826 * var57 + this.field3830 * var56 + this.field3812 * var53 >> 15) + this.field3819;
                    int var64 = (this.field3816 * var57 + this.field3827 * var53 + this.field3811 * var56 >> 15) + this.field3828;
                    int var65 = (this.field3814 * var58 + this.field3823 * var54 + this.field3820 * var55 >> 15) + this.field3813;
                    int var66 = (this.field3826 * var58 + this.field3830 * var55 + this.field3812 * var54 >> 15) + this.field3819;
                    int var67 = (this.field3816 * var58 + this.field3827 * var54 + this.field3811 * var55 >> 15) + this.field3828;
                    for (int var68 = 0; var68 < var43.field2472; ++var68) {
                        short var69 = var43.field2464[var68];
                        short var70 = var43.field2462[var68];
                        short var71 = var43.field2466[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field4406 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field4403 || var73 > arg2.field4403 || var74 > arg2.field4403;
                            short var78 = var43.field2471[var68];
                            if (var78 != -1) {
                                if (this.method1667(this.field3810.field425.method1780(-31305, var78).field1443)) {
                                    arg2.field4411 = 100;
                                }
                                arg2.method1921(var75, var76, var77, var72, var73, var74, var43.field2463[var69], var43.field2463[var70], var43.field2463[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field4411 = 0;
                            } else {
                                int var79 = var43.field2467[var68];
                                if (var79 != -1) {
                                    arg2.method1923(var75, var76, var77, var72, var73, var74, class427.method2605(126, var79, var43.field2463[var69]), class427.method2605(99, var79, var43.field2463[var70]), class427.method2605(114, var79, var43.field2463[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field2472; ++var80) {
                    short var81 = var43.field2464[var80];
                    short var82 = var43.field2462[var80];
                    short var83 = var43.field2466[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field2467[var80];
                        if (var90 != -1) {
                            arg2.field4406 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field4403 || var85 > arg2.field4403 || var86 > arg2.field4403;
                            arg2.method1923(var87, var88, var89, var84, var85, var86, class427.method2605(109, var90, var43.field2463[var81]), class427.method2605(120, var90, var43.field2463[var82]), class427.method2605(123, var90, var43.field2463[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III[[ZZ)V")
    public final void method429(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class119 var6 = this.field3810.field3645;
        this.field3829 = -1;
        this.field3820 = var6.field1667;
        this.field3823 = var6.field1661;
        this.field3814 = var6.field1665;
        this.field3813 = var6.field1662;
        this.field3830 = var6.field1664;
        this.field3812 = var6.field1659;
        this.field3826 = var6.field1660;
        this.field3819 = var6.field1657;
        this.field3811 = var6.field1656;
        this.field3827 = var6.field1663;
        this.field3816 = var6.field1658;
        this.field3828 = var6.field1666;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZLqv;[I[I[I)V")
    private final void method1670(int arg0, int arg1, boolean arg2, class309 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class343 var8 = this.field3822[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4748 & 2) == 0) {
                int var9 = super.field2006 * arg0;
                int var10 = super.field2006 + var9;
                int var11 = super.field2006 * arg1;
                int var12 = super.field2006 + var11;
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
                if ((var8.field4748 & 1) != 0 && !arg2) {
                    int var17 = this.field3825[arg0][arg1];
                    if (this.field3829 == -1) {
                        int var18 = this.field3827 * var17;
                        var19 = (this.field3816 * var11 + this.field3811 * var9 + var18 >> 15) + this.field3828;
                        if (var19 <= this.field3810.field3627) {
                            return;
                        }
                        var20 = (this.field3816 * var11 + this.field3811 * var10 + var18 >> 15) + this.field3828;
                        if (var20 <= this.field3810.field3627) {
                            return;
                        }
                        var21 = (this.field3816 * var12 + this.field3811 * var10 + var18 >> 15) + this.field3828;
                        if (var21 <= this.field3810.field3627) {
                            return;
                        }
                        var22 = (this.field3816 * var12 + this.field3811 * var9 + var18 >> 15) + this.field3828;
                        if (var22 <= this.field3810.field3627) {
                            return;
                        }
                    } else {
                        var22 = this.field3829;
                        var21 = this.field3829;
                        var20 = this.field3829;
                        var19 = this.field3829;
                    }
                    if (this.field3810.field3650) {
                        int var23 = var19 - this.field3810.field3634;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field3810.field3634;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field3810.field3634;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field3810.field3634;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field3823 * var17;
                    int var28 = this.field3812 * var17;
                    var29 = (this.field3814 * var11 + this.field3820 * var9 + var27 >> 15) + this.field3813;
                    var30 = this.field3810.field3639 * var29 / var19 + arg3.field4408;
                    var31 = (this.field3826 * var11 + this.field3830 * var9 + var28 >> 15) + this.field3819;
                    var32 = this.field3810.field3640 * var31 / var19 + arg3.field4414;
                    var33 = (this.field3814 * var11 + this.field3820 * var10 + var27 >> 15) + this.field3813;
                    var34 = this.field3810.field3639 * var33 / var20 + arg3.field4408;
                    var35 = (this.field3826 * var11 + this.field3830 * var10 + var28 >> 15) + this.field3819;
                    var36 = this.field3810.field3640 * var35 / var20 + arg3.field4414;
                    var37 = (this.field3814 * var12 + this.field3820 * var10 + var27 >> 15) + this.field3813;
                    var38 = this.field3810.field3639 * var37 / var21 + arg3.field4408;
                    var39 = (this.field3826 * var12 + this.field3830 * var10 + var28 >> 15) + this.field3819;
                    var40 = this.field3810.field3640 * var39 / var21 + arg3.field4414;
                    var41 = (this.field3814 * var12 + this.field3820 * var9 + var27 >> 15) + this.field3813;
                    var42 = this.field3810.field3639 * var41 / var22 + arg3.field4408;
                    var43 = (this.field3826 * var12 + this.field3830 * var9 + var28 >> 15) + this.field3819;
                    var44 = this.field3810.field3640 * var43 / var22 + arg3.field4414;
                } else {
                    int var45 = this.field3825[arg0][arg1];
                    int var46 = this.field3825[arg0 + 1][arg1];
                    int var47 = this.field3825[arg0 + 1][arg1 + 1];
                    int var48 = this.field3825[arg0][arg1 + 1];
                    if (this.field3829 == -1) {
                        var19 = (this.field3816 * var11 + this.field3827 * var45 + this.field3811 * var9 >> 15) + this.field3828;
                        if (var19 <= this.field3810.field3627) {
                            return;
                        }
                        var20 = (this.field3816 * var11 + this.field3827 * var46 + this.field3811 * var10 >> 15) + this.field3828;
                        if (var20 <= this.field3810.field3627) {
                            return;
                        }
                        var21 = (this.field3816 * var12 + this.field3827 * var47 + this.field3811 * var10 >> 15) + this.field3828;
                        if (var21 <= this.field3810.field3627) {
                            return;
                        }
                        var22 = (this.field3816 * var12 + this.field3827 * var48 + this.field3811 * var9 >> 15) + this.field3828;
                        if (var22 <= this.field3810.field3627) {
                            return;
                        }
                    } else {
                        var22 = this.field3829;
                        var21 = this.field3829;
                        var20 = this.field3829;
                        var19 = this.field3829;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field3810.field3634;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field4740 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field3810.field3634;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field4747 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field3810.field3634;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field4742 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field3810.field3634;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field4745 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field3810.field3650) {
                        int var57 = var19 - this.field3810.field3634;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field3810.field3634;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field3810.field3634;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field3810.field3634;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field3814 * var11 + this.field3823 * var45 + this.field3820 * var9 >> 15) + this.field3813;
                    var30 = this.field3810.field3639 * var29 / var19 + arg3.field4408;
                    var31 = (this.field3826 * var11 + this.field3830 * var9 + this.field3812 * var45 >> 15) + this.field3819;
                    var32 = this.field3810.field3640 * var31 / var19 + arg3.field4414;
                    var33 = (this.field3814 * var11 + this.field3823 * var46 + this.field3820 * var10 >> 15) + this.field3813;
                    var34 = this.field3810.field3639 * var33 / var20 + arg3.field4408;
                    var35 = (this.field3826 * var11 + this.field3830 * var10 + this.field3812 * var46 >> 15) + this.field3819;
                    var36 = this.field3810.field3640 * var35 / var20 + arg3.field4414;
                    var37 = (this.field3814 * var12 + this.field3823 * var47 + this.field3820 * var10 >> 15) + this.field3813;
                    var38 = this.field3810.field3639 * var37 / var21 + arg3.field4408;
                    var39 = (this.field3826 * var12 + this.field3830 * var10 + this.field3812 * var47 >> 15) + this.field3819;
                    var40 = this.field3810.field3640 * var39 / var21 + arg3.field4414;
                    var41 = (this.field3814 * var12 + this.field3823 * var48 + this.field3820 * var9 >> 15) + this.field3813;
                    var42 = this.field3810.field3639 * var41 / var22 + arg3.field4408;
                    var43 = (this.field3826 * var12 + this.field3830 * var9 + this.field3812 * var48 >> 15) + this.field3819;
                    var44 = this.field3810.field3640 * var43 / var22 + arg3.field4414;
                }
                boolean var61 = var8.field4739 != -1 && this.method1667(this.field3810.field425.method1780(-31305, var8.field4739).field1443);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field4406 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field4403 || var42 > arg3.field4403 || var34 > arg3.field4403;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field4411 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field4739 >= 0) {
                                arg3.method1918(var40, var44, var36, var38, var42, var34, this.field3810.field3631, var15, var16, var14, var8.field4738, var8.field4746, var8.field4743, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4739);
                            } else {
                                arg3.method1924(var40, var44, var36, var38, var42, var34, class65.method626((byte) 70, var8.field4738, var15 << 24 | this.field3810.field3631), class65.method626((byte) 70, var8.field4746, var16 << 24 | this.field3810.field3631), class65.method626((byte) 70, var8.field4743, var14 << 24 | this.field3810.field3631));
                            }
                        } else if (var8.field4739 >= 0) {
                            arg3.method1921(var40, var44, var36, var38, var42, var34, var8.field4738, var8.field4746, var8.field4743, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4739);
                        } else {
                            arg3.method1924(var40, var44, var36, var38, var42, var34, var8.field4738, var8.field4746, var8.field4743);
                        }
                        arg3.field4411 = 0;
                    } else {
                        arg3.method1928(var40, var44, var36, var38, var42, var34, this.field3810.field3631);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field4406 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field4403 || var34 > arg3.field4403 || var42 > arg3.field4403;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field4411 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field4739 >= 0) {
                                arg3.method1918(var32, var36, var44, var30, var34, var42, this.field3810.field3631, var13, var14, var16, var8.field4741, var8.field4743, var8.field4746, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4739);
                            } else {
                                arg3.method1924(var32, var36, var44, var30, var34, var42, class65.method626((byte) 70, var8.field4741, var13 << 24 | this.field3810.field3631), class65.method626((byte) 70, var8.field4743, var14 << 24 | this.field3810.field3631), class65.method626((byte) 70, var8.field4746, var16 << 24 | this.field3810.field3631));
                            }
                        } else if (var8.field4739 >= 0) {
                            arg3.method1921(var32, var36, var44, var30, var34, var42, var8.field4741, var8.field4743, var8.field4746, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4739);
                        } else {
                            arg3.method1924(var32, var36, var44, var30, var34, var42, var8.field4741, var8.field4743, var8.field4746);
                        }
                        arg3.field4411 = 0;
                        return;
                    }
                    arg3.method1928(var32, var36, var44, var30, var34, var42, this.field3810.field3631);
                }
            }
        } else {
            class234 var64 = this.field3817[arg0][arg1];
            if (var64 != null) {
                if (this.field3829 == -1) {
                    for (int var65 = 0; var65 < var64.field3442; ++var65) {
                        int var66 = (arg0 << super.field2001) + var64.field3441[var65];
                        int var67 = var64.field3440[var65];
                        int var68 = (arg1 << super.field2001) + var64.field3433[var65];
                        int var69 = (this.field3816 * var68 + this.field3827 * var67 + this.field3811 * var66 >> 15) + this.field3828;
                        if (var69 <= this.field3810.field3627) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field3810.field3634;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field3435[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field3810.field3650) {
                            int var72 = var69 - this.field3810.field3634;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field3814 * var68 + this.field3823 * var67 + this.field3820 * var66 >> 15) + this.field3813;
                        int var74 = (this.field3826 * var68 + this.field3830 * var66 + this.field3812 * var67 >> 15) + this.field3819;
                        arg4[var65] = this.field3810.field3639 * var73 / var69 + arg3.field4408;
                        arg5[var65] = this.field3810.field3640 * var74 / var69 + arg3.field4414;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field3442; ++var75) {
                        int var115 = (arg0 << super.field2001) + var64.field3441[var75];
                        int var116 = var64.field3440[var75];
                        int var117 = (arg1 << super.field2001) + var64.field3433[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field3829 - this.field3810.field3634;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field3435[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field3810.field3650) {
                            int var120 = this.field3829 - this.field3810.field3634;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field3814 * var117 + this.field3823 * var116 + this.field3820 * var115 >> 15) + this.field3813;
                        int var122 = (this.field3826 * var117 + this.field3830 * var115 + this.field3812 * var116 >> 15) + this.field3819;
                        arg4[var75] = this.field3810.field3639 * var121 / this.field3829 + arg3.field4408;
                        arg5[var75] = this.field3810.field3640 * var122 / this.field3829 + arg3.field4414;
                    }
                }
                if (var64.field3436 != null) {
                    int var76 = this.field3825[arg0][arg1];
                    int var77 = this.field3825[arg0 + 1][arg1];
                    int var78 = this.field3825[arg0][arg1 + 1];
                    int var79 = super.field2006 * arg0;
                    int var80 = super.field2006 + var79;
                    int var81 = super.field2006 * arg1;
                    int var82 = super.field2006 + var81;
                    int var83 = (this.field3814 * var81 + this.field3823 * var76 + this.field3820 * var79 >> 15) + this.field3813;
                    int var84 = (this.field3826 * var81 + this.field3830 * var79 + this.field3812 * var76 >> 15) + this.field3819;
                    int var85 = (this.field3816 * var81 + this.field3827 * var76 + this.field3811 * var79 >> 15) + this.field3828;
                    int var86 = (this.field3814 * var81 + this.field3823 * var77 + this.field3820 * var80 >> 15) + this.field3813;
                    int var87 = (this.field3826 * var81 + this.field3830 * var80 + this.field3812 * var77 >> 15) + this.field3819;
                    int var88 = (this.field3816 * var81 + this.field3827 * var77 + this.field3811 * var80 >> 15) + this.field3828;
                    int var89 = (this.field3814 * var82 + this.field3823 * var78 + this.field3820 * var79 >> 15) + this.field3813;
                    int var90 = (this.field3826 * var82 + this.field3830 * var79 + this.field3812 * var78 >> 15) + this.field3819;
                    int var91 = (this.field3816 * var82 + this.field3827 * var78 + this.field3811 * var79 >> 15) + this.field3828;
                    for (int var92 = 0; var92 < var64.field3434; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field4406 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field4403 || var97 > arg3.field4403 || var98 > arg3.field4403;
                            short var103 = var64.field3436[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method1667(this.field3810.field425.method1780(-31305, var103).field1443)) {
                                    arg3.field4411 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1918(var99, var100, var101, var96, var97, var98, this.field3810.field3631, arg6[var93], arg6[var94], arg6[var95], var64.field3439[var93], var64.field3439[var94], var64.field3439[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field3439[var93] & 16777215) != 0) {
                                        arg3.method1924(var99, var100, var101, var96, var97, var98, class65.method626((byte) 70, var64.field3439[var93], arg6[var93] << 24 | this.field3810.field3631), class65.method626((byte) 70, var64.field3439[var94], arg6[var94] << 24 | this.field3810.field3631), class65.method626((byte) 70, var64.field3439[var95], arg6[var95] << 24 | this.field3810.field3631));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1921(var99, var100, var101, var96, var97, var98, var64.field3439[var93], var64.field3439[var94], var64.field3439[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field3439[var93] & 16777215) != 0) {
                                    arg3.method1924(var99, var100, var101, var96, var97, var98, var64.field3439[var93], var64.field3439[var94], var64.field3439[var95]);
                                }
                                arg3.field4411 = 0;
                            } else {
                                arg3.method1928(var99, var100, var101, var96, var97, var98, this.field3810.field3631);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field3434; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field4406 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field4403 || var109 > arg3.field4403 || var110 > arg3.field4403;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field3439[var105] & 16777215) != 0) {
                                    arg3.method1924(var111, var112, var113, var108, var109, var110, class173.method1225(true, this.field3810.field3631, arg6[var105], var64.field3439[var105]), class173.method1225(true, this.field3810.field3631, arg6[var106], var64.field3439[var106]), class173.method1225(true, this.field3810.field3631, arg6[var107], var64.field3439[var107]));
                                }
                            } else if ((var64.field3439[var105] & 16777215) != 0) {
                                arg3.method1924(var111, var112, var113, var108, var109, var110, var64.field3439[var105], var64.field3439[var106], var64.field3439[var107]);
                            }
                        } else {
                            arg3.method1928(var111, var112, var113, var108, var109, var110, this.field3810.field3631);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V")
    public final void method420(int arg0, int arg1) {
        class398 var3 = this.field3810.method1616(Thread.currentThread());
        var3.field5832.field4411 = 0;
        if (this.field3822 != null) {
            this.method1670(arg0, arg1, this.field3810.field3628, var3.field5832, var3.field5854, var3.field5879, var3.field5844);
        } else {
            if (this.field3815 != null) {
                this.method1669(arg0, arg1, var3.field5832, var3.field5854, var3.field5879, var3.field5844);
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lba;IIIIZ)Z")
    public final boolean method428(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I")
    public final int method426(int arg0, int arg1) {
        int var3 = arg0 >> super.field2001;
        int var4 = arg1 >> super.field2001;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2007 - 1 && var4 <= super.field2003 - 1) {
            int var5 = arg0 & super.field2006 - 1;
            int var6 = arg1 & super.field2006 - 1;
            int var7 = (super.field2006 - var5) * this.field3825[var3][var4] + this.field3825[var3 + 1][var4] * var5 >> super.field2001;
            int var8 = (super.field2006 - var5) * this.field3825[var3][var4 + 1] + this.field3825[var3 + 1][var4 + 1] * var5 >> super.field2001;
            return (super.field2006 - var6) * var7 + var6 * var8 >> super.field2001;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!es", name = "i", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        if (this.field3824[arg0][arg1] < arg2) {
            this.field3824[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class398 var9 = this.field3810.method1616(Thread.currentThread());
        class309 var10 = var9.field5832;
        var10.field4411 = 0;
        var10.field4406 = false;
        if (this.field3822 != null) {
            this.method1665(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5854, var9.field5879);
        } else {
            if (this.field3815 != null) {
                this.method1668(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5854, var9.field5879);
            }
        }
    }
}
