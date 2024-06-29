import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class573 extends class281 {

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "I")
    private int field7877 = -1;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "Lao;")
    private class289 field7866;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    private int field7872;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "[[B")
    private byte[][] field7869;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "[[B")
    private byte[][] field7881;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "F")
    private float field7861;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "F")
    private float field7862;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "F")
    private float field7863;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "F")
    private float field7865;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "F")
    private float field7867;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "F")
    private float field7870;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "F")
    private float field7873;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "F")
    private float field7875;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "F")
    private float field7876;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "F")
    private float field7878;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "F")
    private float field7880;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "F")
    private float field7882;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "[[Lofa;")
    private class330[][] field7874;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "[[Lrb;")
    private class354[][] field7868;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "[[Lul;")
    private class572[][] field7879;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "[[Lsp;")
    private class636[][] field7871;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "[[Lmga;")
    private class709[][] field7864;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lab;[I)V", line = 2)
    public final void method1158(class669 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!cr", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 7)
    public final void method1159(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field7872 & 32) == 0;
        if (this.field7879 == null && !var15) {
            this.field7879 = new class572[super.field3937][super.field3940];
            this.field7874 = new class330[super.field3937][super.field3940];
        } else if (this.field7868 == null && var15) {
            this.field7868 = new class354[super.field3937][super.field3940];
        } else if (this.field7864 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class646.field8885[class160.method1228(arg6[var16], 30) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class646.field8885[class160.method1228(arg7[var17], 30) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class354 var18 = new class354();
                var18.field4984 = (short) arg2.length;
                var18.field4983 = (short) (arg2.length / 3);
                var18.field4986 = new short[var18.field4984];
                var18.field4982 = new short[var18.field4984];
                var18.field4977 = new short[var18.field4984];
                var18.field4987 = new int[var18.field4984];
                var18.field4980 = new short[var18.field4984];
                var18.field4978 = new short[var18.field4984];
                var18.field4981 = new byte[var18.field4984];
                if (arg5 != null) {
                    var18.field4985 = new short[var18.field4984];
                }
                for (int var19 = 0; var19 < var18.field4984; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field7869[arg0][arg1] - this.field7881[arg0][arg1];
                    } else if (var22 == 0 && super.field3942 == var23) {
                        var25 = this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1];
                    } else if (super.field3942 == var22 && super.field3942 == var23) {
                        var25 = this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1];
                    } else if (super.field3942 == var22 && var23 == 0) {
                        var25 = this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]) * var22 + (this.field7869[arg0][arg1] - this.field7881[arg0][arg1]) * (super.field3942 - var22);
                        int var27 = (this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]) * var22 + (this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1]) * (super.field3942 - var22);
                        var25 = (super.field3942 - var23) * var26 + var23 * var27 >> super.field3938 * 2;
                    }
                    int var28 = (arg0 << super.field3938) + var22;
                    int var29 = (arg1 << super.field3938) + var23;
                    var18.field4986[var19] = (short) var22;
                    var18.field4977[var19] = (short) var23;
                    var18.field4982[var19] = (short) (this.method1853(var28, var29, (byte) 64) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field4987[var19] = 0;
                        if (arg7 != null) {
                            var18.field4981[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field4985[var19] = (short) arg5[var19];
                            if (arg11 != 0) {
                                var30 = var31 * 255 / arg11;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > 255) {
                                    var30 = 255;
                                }
                            }
                        }
                        int var32 = -16777216;
                        if (arg8[var19] != -1 && this.method3316(this.field7866.field1170.method1180(arg8[var19], -6662).field9955)) {
                            var32 = -1694498816;
                        }
                        var18.field4987[var19] = var32 | class137.method1114(method3310(arg6[var19] >> 8, var25), 118, var30, arg10);
                        if (arg7 != null) {
                            var18.field4981[var19] = (byte) var25;
                        }
                    }
                    var18.field4980[var19] = (short) arg8[var19];
                    var18.field4978[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field4979 = new int[var18.field4983];
                }
                for (int var20 = 0; var20 < var18.field4983; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field4979[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field7868[arg0][arg1] = var18;
            } else {
                boolean var33 = true;
                int var34 = -1;
                int var35 = -1;
                int var36 = -1;
                int var37 = -1;
                if (arg2.length == 6) {
                    for (int var38 = 0; var38 < 6; ++var38) {
                        if (arg2[var38] == 0 && arg4[var38] == 0) {
                            if (var34 != -1 && arg6[var34] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var34 = var38;
                        } else if (arg2[var38] == super.field3942 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3942 && arg4[var38] == super.field3942) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3942) {
                            if (var37 != -1 && arg6[var37] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var37 = var38;
                        }
                    }
                    if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                        var33 = false;
                    }
                    if (var33) {
                        if (arg3 != null) {
                            for (int var39 = 0; var39 < 4; ++var39) {
                                if (arg3[var39] != 0) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                        if (var33) {
                            for (int var40 = 1; var40 < 4; ++var40) {
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3942 != arg2[var40] && arg2[0] - super.field3942 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3942 != arg4[var40] && arg4[0] - super.field3942 != arg4[var40]) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var33 = false;
                }
                if (var33) {
                    class572 var41 = new class572();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field7859 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field7857 = (byte) (var41.field7857 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3934[arg0 + 1][arg1] == super.field3934[arg0][arg1] && super.field3934[arg0 + 1][arg1 + 1] == super.field3934[arg0][arg1] && super.field3934[arg0][arg1 + 1] == super.field3934[arg0][arg1]) {
                        var41.field7857 = (byte) (var41.field7857 | 1);
                    }
                    if (var43 != -1 && (var41.field7857 & 2) == 0 && !this.field7866.field1170.method1180(var43, -6662).field9951) {
                        int var44;
                        if (arg5 != null && arg11 != 0) {
                            var44 = arg5[var34] * 255 / arg11;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 > 255) {
                                var44 = 255;
                            }
                        } else {
                            var44 = 0;
                        }
                        var41.field7860 = class137.method1114(method3310(arg6[var34] >> 8, this.field7869[arg0][arg1] - this.field7881[arg0][arg1]), 88, var44, arg10);
                        if (var41.field7859 != 0) {
                            var41.field7860 |= 255 - (this.field7869[arg0][arg1] - this.field7881[arg0][arg1]) << 25;
                        }
                        int var45;
                        if (arg5 != null && arg11 != 0) {
                            var45 = arg5[var35] * 255 / arg11;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                        } else {
                            var45 = 0;
                        }
                        var41.field7858 = class137.method1114(method3310(arg6[var35] >> 8, this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]), 97, var45, arg10);
                        if (var41.field7859 != 0) {
                            var41.field7858 |= 255 - (this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]) << 25;
                        }
                        int var46;
                        if (arg5 != null && arg11 != 0) {
                            var46 = arg5[var36] * 255 / arg11;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 > 255) {
                                var46 = 255;
                            }
                        } else {
                            var46 = 0;
                        }
                        var41.field7851 = class137.method1114(method3310(arg6[var36] >> 8, this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]), 103, var46, arg10);
                        if (var41.field7859 != 0) {
                            var41.field7851 |= 255 - (this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var47;
                        if (arg5 != null && arg11 != 0) {
                            var47 = arg5[var37] * 255 / arg11;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 > 255) {
                                var47 = 255;
                            }
                        } else {
                            var47 = 0;
                        }
                        var41.field7852 = class137.method1114(method3310(arg6[var37] >> 8, this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1]), 42, var47, arg10);
                        var41.field7850 = (short) var43;
                    } else {
                        int var48;
                        if (arg5 != null && arg11 != 0) {
                            var48 = arg5[var34] * 255 / arg11;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                        } else {
                            var48 = 0;
                        }
                        var41.field7860 = class137.method1114(method3310(arg6[var34] >> 8, this.field7869[arg0][arg1] - this.field7881[arg0][arg1]), 68, var48, arg10);
                        if (var41.field7859 != 0) {
                            var41.field7860 |= 255 - (this.field7869[arg0][arg1] - this.field7881[arg0][arg1]) << 25;
                        }
                        int var49;
                        if (arg5 != null && arg11 != 0) {
                            var49 = arg5[var35] * 255 / arg11;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                        } else {
                            var49 = 0;
                        }
                        var41.field7858 = class137.method1114(method3310(arg6[var35] >> 8, this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]), 112, var49, arg10);
                        if (var41.field7859 != 0) {
                            var41.field7858 |= 255 - (this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]) << 25;
                        }
                        int var50;
                        if (arg5 != null && arg11 != 0) {
                            var50 = arg5[var36] * 255 / arg11;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                        } else {
                            var50 = 0;
                        }
                        var41.field7851 = class137.method1114(method3310(arg6[var36] >> 8, this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]), 62, var50, arg10);
                        if (var41.field7859 != 0) {
                            var41.field7851 |= 255 - (this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var51;
                        if (arg5 != null && arg11 != 0) {
                            var51 = arg5[var37] * 255 / arg11;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                        } else {
                            var51 = 0;
                        }
                        var41.field7852 = class137.method1114(method3310(arg6[var37] >> 8, this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1]), 84, var51, arg10);
                        if (var41.field7859 != 0) {
                            var41.field7852 |= 255 - (this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1]) << 25;
                        }
                        var41.field7850 = -1;
                    }
                    if (arg5 != null) {
                        var41.field7855 = (short) arg5[var36];
                        var41.field7856 = (short) arg5[var37];
                        var41.field7854 = (short) arg5[var35];
                        var41.field7853 = (short) arg5[var34];
                    }
                    this.field7879[arg0][arg1] = var41;
                } else {
                    class330 var52 = new class330();
                    var52.field4612 = (short) arg2.length;
                    var52.field4619 = (short) (arg2.length / 3);
                    var52.field4618 = new short[var52.field4612];
                    var52.field4616 = new short[var52.field4612];
                    var52.field4611 = new short[var52.field4612];
                    var52.field4610 = new int[var52.field4612];
                    if (arg5 != null) {
                        var52.field4615 = new short[var52.field4612];
                    }
                    for (int var53 = 0; var53 < var52.field4612; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field7869[arg0][arg1] - this.field7881[arg0][arg1];
                        } else if (var68 == 0 && super.field3942 == var69) {
                            var71 = this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1];
                        } else if (super.field3942 == var68 && super.field3942 == var69) {
                            var71 = this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1];
                        } else if (super.field3942 == var68 && var69 == 0) {
                            var71 = this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]) * var68 + (this.field7869[arg0][arg1] - this.field7881[arg0][arg1]) * (super.field3942 - var68);
                            int var73 = (this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]) * var68 + (this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1]) * (super.field3942 - var68);
                            var71 = (super.field3942 - var69) * var72 + var69 * var73 >> super.field3938 * 2;
                        }
                        int var74 = (arg0 << super.field3938) + var68;
                        int var75 = (arg1 << super.field3938) + var69;
                        var52.field4618[var53] = (short) var68;
                        var52.field4611[var53] = (short) var69;
                        var52.field4616[var53] = (short) (this.method1853(var74, var75, (byte) 126) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field4610[var53] = var71 << 25;
                            } else {
                                var52.field4610[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field4615[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field4610[var53] = class137.method1114(method3310(arg6[var53] >> 8, var71), 40, var76, arg10);
                            if (arg7 != null) {
                                var52.field4610[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field4619; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field7866.field1170.method1180(arg8[var55 * 3], -6662).field9951) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field4620 = new int[var52.field4619];
                    }
                    if (var54) {
                        var52.field4617 = new short[var52.field4619];
                        var52.field4614 = new short[var52.field4619];
                    }
                    for (int var56 = 0; var56 < var52.field4619; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field4620[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field7866.field1170.method1180(var62, -6662).field9951) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field7866.field1170.method1180(var63, -6662).field9951) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field7866.field1170.method1180(var64, -6662).field9951) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field4617[var56] = (short) var64;
                                var52.field4614[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field7866.field1170.method1180(var65, -6662).field9951) {
                                        var52.field4610[var57] = class646.field8885[class160.method1228(this.field7866.field1170.method1180(var65, -6662).field9950 & 65535, 30) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field7866.field1170.method1180(var66, -6662).field9951) {
                                        var52.field4610[var58] = class646.field8885[class160.method1228(this.field7866.field1170.method1180(var66, -6662).field9950 & 65535, 30) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field7866.field1170.method1180(var67, -6662).field9951) {
                                        var52.field4610[var59] = class646.field8885[class160.method1228(this.field7866.field1170.method1180(var67, -6662).field9950 & 65535, 30) & 65535];
                                    }
                                }
                                var52.field4617[var56] = -1;
                            }
                        }
                    }
                    this.field7874[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 706)
    public final void method1161(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field7864 == null) {
            this.field7864 = new class709[super.field3937][super.field3940];
            this.field7871 = new class636[super.field3937][super.field3940];
        } else if (this.field7879 != null || this.field7868 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3942 != var20 || var21 != 0 && super.field3942 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class636 var22 = new class636();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field8731 = var23;
            var22.field8730 = new short[var23];
            var22.field8738 = new short[var23];
            var22.field8739 = new short[var23];
            var22.field8736 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field8730[var25] = (short) (this.field7869[arg0][arg1] - this.field7881[arg0][arg1]);
                } else if (var32 == 0 && super.field3942 == var33) {
                    var22.field8730[var25] = (short) (this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1]);
                } else if (super.field3942 == var32 && super.field3942 == var33) {
                    var22.field8730[var25] = (short) (this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]);
                } else if (super.field3942 == var32 && var33 == 0) {
                    var22.field8730[var25] = (short) (this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]) * var32 + (this.field7869[arg0][arg1] - this.field7881[arg0][arg1]) * (super.field3942 - var32);
                    int var35 = (this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]) * var32 + (this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1]) * (super.field3942 - var32);
                    var22.field8730[var25] = (short) ((super.field3942 - var33) * var34 + var33 * var35 >> super.field3938 * 2);
                }
                int var36 = (arg0 << super.field3938) + var32;
                int var37 = (arg1 << super.field3938) + var33;
                var22.field8738[var25] = (short) var32;
                var22.field8736[var25] = (short) var33;
                var22.field8739[var25] = (short) (this.method1853(var36, var37, (byte) 67) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field8730[var25] < 2) {
                    var22.field8730[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                int var30 = arg11[var28];
                if (var30 != -1) {
                    class739 var31 = this.field7866.field1170.method1180(var30, -6662);
                    if (!var31.field9951) {
                        var26 = true;
                        if (this.method3316(var31.field9955) || var31.field9940 != 0 || var31.field9953 != 0) {
                            var22.field8742 = (byte) (var22.field8742 | 4);
                        }
                    }
                }
            }
            var22.field8735 = new int[var27];
            if (arg10 != null) {
                var22.field8734 = new int[var27];
            }
            var22.field8733 = new short[var27];
            var22.field8732 = new short[var27];
            var22.field8743 = new short[var27];
            if (var26) {
                var22.field8737 = new short[var27];
                var22.field8740 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field8735[var22.field8741] = class160.method1228(arg9[var29], 30);
                    } else {
                        var22.field8735[var22.field8741] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field8734[var22.field8741] = class160.method1228(arg10[var29], 30);
                        } else {
                            var22.field8734[var22.field8741] = -1;
                        }
                    }
                    var22.field8733[var22.field8741] = (short) arg6[var29];
                    var22.field8732[var22.field8741] = (short) arg7[var29];
                    var22.field8743[var22.field8741] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field7866.field1170.method1180(arg11[var29], -6662).field9951) {
                            var22.field8737[var22.field8741] = (short) arg11[var29];
                            var22.field8740[var22.field8741] = (short) arg12[var29];
                        } else {
                            var22.field8737[var22.field8741] = -1;
                        }
                    }
                    ++var22.field8741;
                }
            }
            this.field7871[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class709 var38 = new class709();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field9622 = class307.method2001(0, this.field7869[arg0][arg1] - this.field7881[arg0][arg1], class160.method1228(arg10[0], 30));
                    if (var39 == -1) {
                        var38.field9628 = (byte) (var38.field9628 | 2);
                    }
                }
                if (super.field3934[arg0 + 1][arg1] == super.field3934[arg0][arg1] && super.field3934[arg0 + 1][arg1 + 1] == super.field3934[arg0][arg1] && super.field3934[arg0][arg1 + 1] == super.field3934[arg0][arg1]) {
                    var38.field9628 = (byte) (var38.field9628 | 1);
                }
                class739 var41 = null;
                if (var40 != -1) {
                    var41 = this.field7866.field1170.method1180(var40, -6662);
                }
                if (var41 != null && (var38.field9628 & 2) == 0 && !var41.field9951) {
                    var38.field9623 = (short) (this.field7869[arg0][arg1] - this.field7881[arg0][arg1]);
                    var38.field9625 = (short) (this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1]);
                    var38.field9624 = (short) (this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1]);
                    var38.field9626 = (short) (this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1]);
                    var38.field9627 = (short) var40;
                    if (this.method3316(var41.field9955) || var41.field9940 != 0 || var41.field9953 != 0) {
                        var38.field9628 = (byte) (var38.field9628 | 4);
                    }
                } else {
                    short var42 = class160.method1228(var39, 30);
                    var38.field9623 = (short) class307.method2001(0, this.field7869[arg0][arg1] - this.field7881[arg0][arg1], var42);
                    var38.field9625 = (short) class307.method2001(0, this.field7869[arg0 + 1][arg1] - this.field7881[arg0 + 1][arg1], var42);
                    var38.field9624 = (short) class307.method2001(0, this.field7869[arg0 + 1][arg1 + 1] - this.field7881[arg0 + 1][arg1 + 1], var42);
                    var38.field9626 = (short) class307.method2001(0, this.field7869[arg0][arg1 + 1] - this.field7881[arg0][arg1 + 1], var42);
                    var38.field9627 = -1;
                }
                this.field7864[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[[ZZII)V", line = 955)
    public final void method1156(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class515 var8 = this.field7866.field4035;
        this.field7877 = arg5;
        this.field7861 = var8.field7166;
        this.field7865 = var8.field7167;
        this.field7873 = var8.field7163;
        this.field7862 = var8.field7180;
        this.field7863 = var8.field7149;
        this.field7870 = var8.field7172;
        this.field7878 = var8.field7160;
        this.field7875 = var8.field7179;
        this.field7882 = var8.field7156;
        this.field7876 = var8.field7174;
        this.field7880 = var8.field7158;
        this.field7867 = var8.field7175;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3937 && var12 >= 0 && var12 < super.field3940) {
                        this.method3311(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "ka", descriptor = "(III)V", line = 1001)
    public final void method1155(int arg0, int arg1, int arg2) {
        if (this.field7881[arg0][arg1] < arg2) {
            this.field7881[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIZLpga;Lmp;[I[I[I[II)V", line = 1007)
    private final void method3309(int arg0, int arg1, boolean arg2, class534 arg3, class758 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class572 var11 = this.field7879[arg0][arg1];
        if (var11 != null) {
            if ((var11.field7857 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field7857 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3942 * arg0;
                int var13 = super.field3942 + var12;
                int var14 = super.field3942 * arg1;
                int var15 = super.field3942 + var14;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                float var22;
                float var23;
                float var24;
                float var25;
                int var33;
                int var35;
                int var37;
                int var39;
                int var41;
                int var43;
                int var45;
                int var47;
                if ((var11.field7857 & 1) != 0 && !arg2) {
                    int var20 = super.field3934[arg0][arg1];
                    float var21 = (float) var20 * this.field7876;
                    if (this.field7877 == -1) {
                        var22 = (float) var14 * this.field7880 + (float) var12 * this.field7882 + var21 + this.field7867;
                        if (var22 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var23 = (float) var14 * this.field7880 + (float) var13 * this.field7882 + var21 + this.field7867;
                        if (var23 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var24 = (float) var15 * this.field7880 + (float) var13 * this.field7882 + var21 + this.field7867;
                        if (var24 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var25 = (float) var15 * this.field7880 + (float) var12 * this.field7882 + var21 + this.field7867;
                        if (var25 <= (float) this.field7866.field4025) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field7880 + (float) var12 * this.field7882 + var21 + this.field7867;
                        var23 = (float) var14 * this.field7880 + (float) var13 * this.field7882 + var21 + this.field7867;
                        var24 = (float) var15 * this.field7880 + (float) var13 * this.field7882 + var21 + this.field7867;
                        var25 = (float) var15 * this.field7880 + (float) var12 * this.field7882 + var21 + this.field7867;
                    }
                    if (arg3.field7349) {
                        int var26 = (int) (var22 - (float) arg3.field7358);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7358);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7358);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7358);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field7865;
                    float var31 = (float) var20 * this.field7870;
                    if (this.field7877 == -1) {
                        float var32 = (float) var14 * this.field7873 + (float) var12 * this.field7861 + var30 + this.field7862;
                        var33 = (int) ((float) this.field7866.field4034 * var32 / var22) + arg4.field10563;
                        float var34 = (float) var14 * this.field7878 + (float) var12 * this.field7863 + var31 + this.field7875;
                        var35 = (int) ((float) this.field7866.field4040 * var34 / var22) + arg4.field10566;
                        float var36 = (float) var14 * this.field7873 + (float) var13 * this.field7861 + var30 + this.field7862;
                        var37 = (int) ((float) this.field7866.field4034 * var36 / var23) + arg4.field10563;
                        float var38 = (float) var14 * this.field7878 + (float) var13 * this.field7863 + var31 + this.field7875;
                        var39 = (int) ((float) this.field7866.field4040 * var38 / var23) + arg4.field10566;
                        float var40 = (float) var15 * this.field7873 + (float) var13 * this.field7861 + var30 + this.field7862;
                        var41 = (int) ((float) this.field7866.field4034 * var40 / var24) + arg4.field10563;
                        float var42 = (float) var15 * this.field7878 + (float) var13 * this.field7863 + var31 + this.field7875;
                        var43 = (int) ((float) this.field7866.field4040 * var42 / var24) + arg4.field10566;
                        float var44 = (float) var15 * this.field7873 + (float) var12 * this.field7861 + var30 + this.field7862;
                        var45 = (int) ((float) this.field7866.field4034 * var44 / var25) + arg4.field10563;
                        float var46 = (float) var15 * this.field7878 + (float) var12 * this.field7863 + var31 + this.field7875;
                        var47 = (int) ((float) this.field7866.field4040 * var46 / var25) + arg4.field10566;
                    } else {
                        float var48 = (float) var14 * this.field7873 + (float) var12 * this.field7861 + var30 + this.field7862;
                        var33 = (int) ((float) this.field7866.field4034 * var48 / (float) this.field7877) + arg4.field10563;
                        float var49 = (float) var14 * this.field7878 + (float) var12 * this.field7863 + var31 + this.field7875;
                        var35 = (int) ((float) this.field7866.field4040 * var49 / (float) this.field7877) + arg4.field10566;
                        float var50 = (float) var14 * this.field7873 + (float) var13 * this.field7861 + var30 + this.field7862;
                        var37 = (int) ((float) this.field7866.field4034 * var50 / (float) this.field7877) + arg4.field10563;
                        float var51 = (float) var14 * this.field7878 + (float) var13 * this.field7863 + var31 + this.field7875;
                        var39 = (int) ((float) this.field7866.field4040 * var51 / (float) this.field7877) + arg4.field10566;
                        float var52 = (float) var15 * this.field7873 + (float) var13 * this.field7861 + var30 + this.field7862;
                        var41 = (int) ((float) this.field7866.field4034 * var52 / (float) this.field7877) + arg4.field10563;
                        float var53 = (float) var15 * this.field7878 + (float) var13 * this.field7863 + var31 + this.field7875;
                        var43 = (int) ((float) this.field7866.field4040 * var53 / (float) this.field7877) + arg4.field10566;
                        float var54 = (float) var15 * this.field7873 + (float) var12 * this.field7861 + var30 + this.field7862;
                        var45 = (int) ((float) this.field7866.field4034 * var54 / (float) this.field7877) + arg4.field10563;
                        float var55 = (float) var15 * this.field7878 + (float) var12 * this.field7863 + var31 + this.field7875;
                        var47 = (int) ((float) this.field7866.field4040 * var55 / (float) this.field7877) + arg4.field10566;
                    }
                } else {
                    int var56 = super.field3934[arg0][arg1];
                    int var57 = super.field3934[arg0 + 1][arg1];
                    int var58 = super.field3934[arg0 + 1][arg1 + 1];
                    int var59 = super.field3934[arg0][arg1 + 1];
                    if (this.field7877 == -1) {
                        var22 = (float) var14 * this.field7880 + (float) var12 * this.field7882 + (float) var56 * this.field7876 + this.field7867;
                        if (var22 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var23 = (float) var14 * this.field7880 + (float) var13 * this.field7882 + (float) var57 * this.field7876 + this.field7867;
                        if (var23 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var24 = (float) var15 * this.field7880 + (float) var13 * this.field7882 + (float) var58 * this.field7876 + this.field7867;
                        if (var24 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var25 = (float) var15 * this.field7880 + (float) var12 * this.field7882 + (float) var59 * this.field7876 + this.field7867;
                        if (var25 <= (float) this.field7866.field4025) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field7880 + (float) var12 * this.field7882 + (float) var56 * this.field7876 + this.field7867;
                        var23 = (float) var14 * this.field7880 + (float) var13 * this.field7882 + (float) var57 * this.field7876 + this.field7867;
                        var24 = (float) var15 * this.field7880 + (float) var13 * this.field7882 + (float) var58 * this.field7876 + this.field7867;
                        var25 = (float) var15 * this.field7880 + (float) var12 * this.field7882 + (float) var59 * this.field7876 + this.field7867;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7358);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field7853 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7358);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field7854 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7358);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field7855 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7358);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field7856 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7349) {
                        int var68 = (int) (var22 - (float) arg3.field7358);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7358);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7358);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7358);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field7877 == -1) {
                        float var72 = (float) var14 * this.field7873 + (float) var12 * this.field7861 + (float) var56 * this.field7865 + this.field7862;
                        var33 = (int) ((float) this.field7866.field4034 * var72 / var22) + arg4.field10563;
                        float var73 = (float) var14 * this.field7878 + (float) var12 * this.field7863 + (float) var56 * this.field7870 + this.field7875;
                        var35 = (int) ((float) this.field7866.field4040 * var73 / var22) + arg4.field10566;
                        float var74 = (float) var14 * this.field7873 + (float) var13 * this.field7861 + (float) var57 * this.field7865 + this.field7862;
                        var37 = (int) ((float) this.field7866.field4034 * var74 / var23) + arg4.field10563;
                        float var75 = (float) var14 * this.field7878 + (float) var13 * this.field7863 + (float) var57 * this.field7870 + this.field7875;
                        var39 = (int) ((float) this.field7866.field4040 * var75 / var23) + arg4.field10566;
                        float var76 = (float) var15 * this.field7873 + (float) var13 * this.field7861 + (float) var58 * this.field7865 + this.field7862;
                        var41 = (int) ((float) this.field7866.field4034 * var76 / var24) + arg4.field10563;
                        float var77 = (float) var15 * this.field7878 + (float) var13 * this.field7863 + (float) var58 * this.field7870 + this.field7875;
                        var43 = (int) ((float) this.field7866.field4040 * var77 / var24) + arg4.field10566;
                        float var78 = (float) var15 * this.field7873 + (float) var12 * this.field7861 + (float) var59 * this.field7865 + this.field7862;
                        var45 = (int) ((float) this.field7866.field4034 * var78 / var25) + arg4.field10563;
                        float var79 = (float) var15 * this.field7878 + (float) var12 * this.field7863 + (float) var59 * this.field7870 + this.field7875;
                        var47 = (int) ((float) this.field7866.field4040 * var79 / var25) + arg4.field10566;
                    } else {
                        float var80 = (float) var14 * this.field7873 + (float) var12 * this.field7861 + (float) var56 * this.field7865 + this.field7862;
                        var33 = (int) ((float) this.field7866.field4034 * var80 / (float) this.field7877) + arg4.field10563;
                        float var81 = (float) var14 * this.field7878 + (float) var12 * this.field7863 + (float) var56 * this.field7870 + this.field7875;
                        var35 = (int) ((float) this.field7866.field4040 * var81 / (float) this.field7877) + arg4.field10566;
                        float var82 = (float) var14 * this.field7873 + (float) var13 * this.field7861 + (float) var57 * this.field7865 + this.field7862;
                        var37 = (int) ((float) this.field7866.field4034 * var82 / (float) this.field7877) + arg4.field10563;
                        float var83 = (float) var14 * this.field7878 + (float) var13 * this.field7863 + (float) var57 * this.field7870 + this.field7875;
                        var39 = (int) ((float) this.field7866.field4040 * var83 / (float) this.field7877) + arg4.field10566;
                        float var84 = (float) var15 * this.field7873 + (float) var13 * this.field7861 + (float) var58 * this.field7865 + this.field7862;
                        var41 = (int) ((float) this.field7866.field4034 * var84 / (float) this.field7877) + arg4.field10563;
                        float var85 = (float) var15 * this.field7878 + (float) var13 * this.field7863 + (float) var58 * this.field7870 + this.field7875;
                        var43 = (int) ((float) this.field7866.field4040 * var85 / (float) this.field7877) + arg4.field10566;
                        float var86 = (float) var15 * this.field7873 + (float) var12 * this.field7861 + (float) var59 * this.field7865 + this.field7862;
                        var45 = (int) ((float) this.field7866.field4034 * var86 / (float) this.field7877) + arg4.field10563;
                        float var87 = (float) var15 * this.field7878 + (float) var12 * this.field7863 + (float) var59 * this.field7870 + this.field7875;
                        var47 = (int) ((float) this.field7866.field4040 * var87 / (float) this.field7877) + arg4.field10566;
                    }
                }
                boolean var88 = var11.field7850 != -1 && this.method3316(this.field7866.field1170.method1180(var11.field7850, -6662).field9955);
                if (this.field7877 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field10569 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field10577 || var45 > arg4.field10577 || var37 > arg4.field10577;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field7850 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method4231((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field7851 & 16777215, var90 | var11.field7852 & 16777215, var90 | var11.field7858 & 16777215, arg3.field7340, var18, var19, var17, var11.field7850);
                                } else {
                                    if (var88) {
                                        arg4.field10572 = 100;
                                    }
                                    arg4.method4234((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class628.method3592(var11.field7851, var18 << 24 | arg3.field7340, 255), class628.method3592(var11.field7852, var19 << 24 | arg3.field7340, 255), class628.method3592(var11.field7858, var17 << 24 | arg3.field7340, 255));
                                    arg4.field10572 = 0;
                                }
                            } else if (var11.field7850 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method4231((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field7851 & 16777215, var91 | var11.field7852 & 16777215, var91 | var11.field7858 & 16777215, 0, 0, 0, 0, var11.field7850);
                            } else {
                                if (var88) {
                                    arg4.field10572 = 100;
                                }
                                arg4.method4234((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field7851, var11.field7852, var11.field7858);
                                arg4.field10572 = 0;
                            }
                        } else {
                            arg4.method4225((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7340);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field10569 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field10577 || var37 > arg4.field10577 || var45 > arg4.field10577;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field10572 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field7850 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method4231((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field7860 & 16777215, var93 | var11.field7858 & 16777215, var93 | var11.field7852 & 16777215, arg3.field7340, var16, var17, var19, var11.field7850);
                                    return;
                                }
                                if (var88) {
                                    arg4.field10572 = 100;
                                }
                                arg4.method4234((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class628.method3592(var11.field7860, var16 << 24 | arg3.field7340, 255), class628.method3592(var11.field7858, var17 << 24 | arg3.field7340, 255), class628.method3592(var11.field7852, var19 << 24 | arg3.field7340, 255));
                                arg4.field10572 = 0;
                                return;
                            }
                            if (var11.field7850 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method4231((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field7860 & 16777215, var94 | var11.field7858 & 16777215, var94 | var11.field7852 & 16777215, 0, 0, 0, 0, var11.field7850);
                                return;
                            }
                            if (var88) {
                                arg4.field10572 = 100;
                            }
                            arg4.method4234((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field7860, var11.field7858, var11.field7852);
                            arg4.field10572 = 0;
                            return;
                        }
                        arg4.method4225((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7340);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field10569 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field10577 || var45 > arg4.field10577 || var37 > arg4.field10577;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field10572 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field7850 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method4231((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field7851 & 16777215, var96 | var11.field7852 & 16777215, var96 | var11.field7858 & 16777215, arg3.field7340, var18, var19, var17, var11.field7850);
                                } else {
                                    if (var88) {
                                        arg4.field10572 = 100;
                                    }
                                    arg4.method4234((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class628.method3592(var11.field7851, var18 << 24 | arg3.field7340, 255), class628.method3592(var11.field7852, var19 << 24 | arg3.field7340, 255), class628.method3592(var11.field7858, var17 << 24 | arg3.field7340, 255));
                                    arg4.field10572 = 0;
                                }
                            } else if (var11.field7850 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method4231((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field7851 & 16777215, var97 | var11.field7852 & 16777215, var97 | var11.field7858 & 16777215, 0, 0, 0, 0, var11.field7850);
                            } else {
                                if (var88) {
                                    arg4.field10572 = 100;
                                }
                                arg4.method4234((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field7851, var11.field7852, var11.field7858);
                                arg4.field10572 = 0;
                            }
                        } else {
                            arg4.method4225((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7340);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field10569 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field10577 || var37 > arg4.field10577 || var45 > arg4.field10577;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field10572 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field7850 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method4231((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field7860 & 16777215, var99 | var11.field7858 & 16777215, var99 | var11.field7852 & 16777215, arg3.field7340, var16, var17, var19, var11.field7850);
                                    return;
                                }
                                if (var88) {
                                    arg4.field10572 = 100;
                                }
                                arg4.method4234((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class628.method3592(var11.field7860, var16 << 24 | arg3.field7340, 255), class628.method3592(var11.field7858, var17 << 24 | arg3.field7340, 255), class628.method3592(var11.field7852, var19 << 24 | arg3.field7340, 255));
                                arg4.field10572 = 0;
                                return;
                            }
                            if (var11.field7850 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method4231((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field7860 & 16777215, var100 | var11.field7858 & 16777215, var100 | var11.field7852 & 16777215, 0, 0, 0, 0, var11.field7850);
                                return;
                            }
                            if (var88) {
                                arg4.field10572 = 100;
                            }
                            arg4.method4234((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field7860, var11.field7858, var11.field7852);
                            arg4.field10572 = 0;
                            return;
                        }
                        arg4.method4225((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7340);
                    }
                }
            }
        } else {
            class330 var101 = this.field7874[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field4613 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field7877 == -1) {
                    for (int var102 = 0; var102 < var101.field4612; ++var102) {
                        int var103 = (arg0 << super.field3938) + var101.field4618[var102];
                        int var104 = var101.field4616[var102];
                        int var105 = (arg1 << super.field3938) + var101.field4611[var102];
                        float var106 = (float) var105 * this.field7880 + (float) var103 * this.field7882 + (float) var104 * this.field7876 + this.field7867;
                        if (var106 <= (float) this.field7866.field4025) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7358);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field4615[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7349) {
                            int var109 = (int) (var106 - (float) arg3.field7358);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field7873 + (float) var103 * this.field7861 + (float) var104 * this.field7865 + this.field7862;
                        float var111 = (float) var105 * this.field7878 + (float) var103 * this.field7863 + (float) var104 * this.field7870 + this.field7875;
                        arg5[var102] = (int) ((float) this.field7866.field4034 * var110 / var106) + arg4.field10563;
                        arg6[var102] = (int) ((float) this.field7866.field4040 * var111 / var106) + arg4.field10566;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field4612; ++var112) {
                        int var152 = (arg0 << super.field3938) + var101.field4618[var112];
                        int var153 = var101.field4616[var112];
                        int var154 = (arg1 << super.field3938) + var101.field4611[var112];
                        float var155 = (float) var154 * this.field7880 + (float) var152 * this.field7882 + (float) var153 * this.field7876 + this.field7867;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field7877 - arg3.field7358;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field4615[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7349) {
                            int var158 = this.field7877 - arg3.field7358;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field7873 + (float) var152 * this.field7861 + (float) var153 * this.field7865 + this.field7862;
                        float var160 = (float) var154 * this.field7878 + (float) var152 * this.field7863 + (float) var153 * this.field7870 + this.field7875;
                        arg5[var112] = (int) ((float) this.field7866.field4034 * var159 / (float) this.field7877) + arg4.field10563;
                        arg6[var112] = (int) ((float) this.field7866.field4040 * var160 / (float) this.field7877) + arg4.field10566;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field4617 != null) {
                    if (this.field7877 == -1) {
                        for (int var113 = 0; var113 < var101.field4619; ++var113) {
                            int var114 = var113 * 3;
                            int var115 = var114 + 1;
                            int var116 = var115 + 1;
                            int var117 = arg5[var114];
                            int var118 = arg5[var115];
                            int var119 = arg5[var116];
                            int var120 = arg6[var114];
                            int var121 = arg6[var115];
                            int var122 = arg6[var116];
                            int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                            if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                                arg4.field10569 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field10577 || var118 > arg4.field10577 || var119 > arg4.field10577;
                                short var124 = var101.field4617[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method3316(this.field7866.field1170.method1180(var124, -6662).field9955)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method4231((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field4618[var114] / (float) super.field3942, (float) var101.field4618[var115] / (float) super.field3942, (float) var101.field4618[var116] / (float) super.field3942, (float) var101.field4611[var114] / (float) super.field3942, (float) var101.field4611[var115] / (float) super.field3942, (float) var101.field4611[var116] / (float) super.field3942, var125 | var101.field4610[var114] & 16777215, var125 | var101.field4610[var115] & 16777215, var125 | var101.field4610[var116] & 16777215, arg3.field7340, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field4610[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method3316(this.field7866.field1170.method1180(var124, -6662).field9955)) {
                                                arg4.field10572 = -1694498816;
                                            }
                                            arg4.method4234((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class628.method3592(var101.field4610[var114], arg8[var114] << 24 | arg3.field7340, 255), class628.method3592(var101.field4610[var115], arg8[var115] << 24 | arg3.field7340, 255), class628.method3592(var101.field4610[var116], arg8[var116] << 24 | arg3.field7340, 255));
                                            arg4.field10572 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method3316(this.field7866.field1170.method1180(var124, -6662).field9955)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method4231((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field4618[var114] / (float) super.field3942, (float) var101.field4618[var115] / (float) super.field3942, (float) var101.field4618[var116] / (float) super.field3942, (float) var101.field4611[var114] / (float) super.field3942, (float) var101.field4611[var115] / (float) super.field3942, (float) var101.field4611[var116] / (float) super.field3942, var126 | var101.field4610[var114] & 16777215, var126 | var101.field4610[var115] & 16777215, var126 | var101.field4610[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field4610[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method3316(this.field7866.field1170.method1180(var124, -6662).field9955)) {
                                            arg4.field10572 = -1694498816;
                                        }
                                        arg4.method4234((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field4610[var114], var101.field4610[var115], var101.field4610[var116]);
                                        arg4.field10572 = 0;
                                    }
                                } else {
                                    arg4.method4225((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7340);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field4619; ++var127) {
                        int var128 = var127 * 3;
                        int var129 = var128 + 1;
                        int var130 = var129 + 1;
                        int var131 = arg5[var128];
                        int var132 = arg5[var129];
                        int var133 = arg5[var130];
                        int var134 = arg6[var128];
                        int var135 = arg6[var129];
                        int var136 = arg6[var130];
                        int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                        if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                            arg4.field10569 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field10577 || var132 > arg4.field10577 || var133 > arg4.field10577;
                            short var138 = var101.field4617[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method3316(this.field7866.field1170.method1180(var138, -6662).field9955)) {
                                    arg4.field10572 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method3316(this.field7866.field1170.method1180(var138, -6662).field9955)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method4231((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field4618[var128] / (float) super.field3942, (float) var101.field4618[var129] / (float) super.field3942, (float) var101.field4618[var130] / (float) super.field3942, (float) var101.field4611[var128] / (float) super.field3942, (float) var101.field4611[var129] / (float) super.field3942, (float) var101.field4611[var130] / (float) super.field3942, var139 | var101.field4610[var128] & 16777215, var139 | var101.field4610[var129] & 16777215, var139 | var101.field4610[var130] & 16777215, arg3.field7340, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field4610[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method3316(this.field7866.field1170.method1180(var138, -6662).field9955)) {
                                            arg4.field10572 = -1694498816;
                                        }
                                        arg4.method4234((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class628.method3592(var101.field4610[var128], arg8[var128] << 24 | arg3.field7340, 255), class628.method3592(var101.field4610[var129], arg8[var129] << 24 | arg3.field7340, 255), class628.method3592(var101.field4610[var130], arg8[var130] << 24 | arg3.field7340, 255));
                                        arg4.field10572 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method3316(this.field7866.field1170.method1180(var138, -6662).field9955)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method4231((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field4618[var128] / (float) super.field3942, (float) var101.field4618[var129] / (float) super.field3942, (float) var101.field4618[var130] / (float) super.field3942, (float) var101.field4611[var128] / (float) super.field3942, (float) var101.field4611[var129] / (float) super.field3942, (float) var101.field4611[var130] / (float) super.field3942, var140 | var101.field4610[var128] & 16777215, var140 | var101.field4610[var129] & 16777215, var140 | var101.field4610[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field4610[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method3316(this.field7866.field1170.method1180(var138, -6662).field9955)) {
                                        arg4.field10572 = -1694498816;
                                    }
                                    arg4.method4234((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field4610[var128], var101.field4610[var129], var101.field4610[var130]);
                                    arg4.field10572 = 0;
                                }
                                arg4.field10572 = 0;
                            } else {
                                arg4.method4225((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7340);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field4619; ++var141) {
                    int var142 = var141 * 3;
                    int var143 = var142 + 1;
                    int var144 = var143 + 1;
                    int var145 = arg5[var142];
                    int var146 = arg5[var143];
                    int var147 = arg5[var144];
                    int var148 = arg6[var142];
                    int var149 = arg6[var143];
                    int var150 = arg6[var144];
                    int var151 = arg8[var142] + arg8[var143] + arg8[var144];
                    if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                        arg4.field10569 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field10577 || var146 > arg4.field10577 || var147 > arg4.field10577;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field4610[var142] & 16777215) != 0) {
                                    arg4.method4234((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class137.method1114(var101.field4610[var142], 117, arg8[var142], arg3.field7340), class137.method1114(var101.field4610[var143], 60, arg8[var143], arg3.field7340), class137.method1114(var101.field4610[var144], 95, arg8[var144], arg3.field7340));
                                }
                            } else if ((var101.field4610[var142] & 16777215) != 0) {
                                arg4.method4234((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field4610[var142], var101.field4610[var143], var101.field4610[var144]);
                            }
                        } else {
                            arg4.method4225((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7340);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(II)I", line = 1996)
    private static final int method3310(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[[ZZI)V", line = 2026)
    public final void method1160(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class515 var7 = this.field7866.field4035;
        this.field7877 = -1;
        this.field7861 = var7.field7166;
        this.field7865 = var7.field7167;
        this.field7873 = var7.field7163;
        this.field7862 = var7.field7180;
        this.field7863 = var7.field7149;
        this.field7870 = var7.field7172;
        this.field7878 = var7.field7160;
        this.field7875 = var7.field7179;
        this.field7882 = var7.field7156;
        this.field7876 = var7.field7174;
        this.field7880 = var7.field7158;
        this.field7867 = var7.field7175;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3937 && var11 >= 0 && var11 < super.field3940) {
                        this.method3311(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V", line = 2071)
    private final void method3311(int arg0, int arg1, int arg2) {
        class534 var4 = this.field7866.method1893(Thread.currentThread());
        var4.field7368.field10572 = 0;
        if (this.field7879 != null) {
            this.method3309(arg0, arg1, var4.field7343, var4, var4.field7368, var4.field7360, var4.field7376, var4.field7365, var4.field7380, arg2);
        } else if (this.field7864 != null) {
            this.method3313(arg0, arg1, var4.field7368, var4.field7360, var4.field7376, var4.field7365, var4.field7380, arg2);
        } else {
            if (this.field7868 != null) {
                this.method3314(arg0, arg1, var4.field7343, var4, var4.field7368, var4.field7360, var4.field7376, var4.field7365, var4.field7380, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 2085)
    public final void method1149(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII[[ZLpga;Lmp;[I[I)V", line = 2089)
    private final void method3312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class534 arg8, class758 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7350;
        this.field7866.method306(false);
        arg9.field10567 = false;
        arg9.field10565 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field7879 != null) {
                        if (this.field7879[var18][var19] != null) {
                            class572 var20 = this.field7879[var18][var19];
                            if (var20.field7850 != -1 && (var20.field7857 & 2) == 0 && var20.field7859 == 0) {
                                int var21 = this.field7866.method1891(var20.field7850);
                                arg9.method4229((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class307.method2001(0, var20.field7851, var21), (float) class307.method2001(0, var20.field7852, var21), (float) class307.method2001(0, var20.field7858, var21));
                                arg9.method4229((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class307.method2001(0, var20.field7860, var21), (float) class307.method2001(0, var20.field7858, var21), (float) class307.method2001(0, var20.field7852, var21));
                            } else if (var20.field7859 == 0) {
                                arg9.method4234((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field7851, var20.field7852, var20.field7858);
                                arg9.method4234((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field7860, var20.field7858, var20.field7852);
                            } else {
                                int var22 = var20.field7859;
                                arg9.method4234((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class628.method3592(var22, var20.field7851 & -16777216, 255), class628.method3592(var22, var20.field7852 & -16777216, 255), class628.method3592(var22, var20.field7858 & -16777216, 255));
                                arg9.method4234((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class628.method3592(var22, var20.field7860 & -16777216, 255), class628.method3592(var22, var20.field7858 & -16777216, 255), class628.method3592(var22, var20.field7852 & -16777216, 255));
                            }
                        } else if (this.field7874[var18][var19] != null) {
                            class330 var23 = this.field7874[var18][var19];
                            for (int var24 = 0; var24 < var23.field4612; ++var24) {
                                arg10[var24] = var23.field4618[var24] * var14 / super.field3942 + var16;
                                arg11[var24] = var17 - var23.field4611[var24] * var14 / super.field3942;
                            }
                            for (int var25 = 0; var25 < var23.field4619; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field4620 != null && var23.field4620[var25] != 0 && (var23.field4617 == null || var23.field4617 != null && var23.field4617[var25] == -1)) {
                                    int var35 = var23.field4620[var25];
                                    arg9.method4234((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class628.method3592(var35, -16777216 - (var23.field4610[var26] & -16777216), 255), class628.method3592(var35, -16777216 - (var23.field4610[var27] & -16777216), 255), class628.method3592(var35, -16777216 - (var23.field4610[var28] & -16777216), 255));
                                } else if (var23.field4617 != null && var23.field4617[var25] != -1) {
                                    int var36 = this.field7866.method1891(var23.field4617[var25]);
                                    arg9.method4229((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method4234((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field4610[var26], var23.field4610[var27], var23.field4610[var28]);
                                }
                            }
                        }
                    } else if (this.field7868[var18][var19] != null) {
                        class354 var37 = this.field7868[var18][var19];
                        for (int var38 = 0; var38 < var37.field4984; ++var38) {
                            arg10[var38] = var37.field4986[var38] * var14 / super.field3942 + var16;
                            arg11[var38] = var17 - var37.field4977[var38] * var14 / super.field3942;
                        }
                        for (int var39 = 0; var39 < var37.field4983; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field4979 != null && var37.field4979[var39] != 0) {
                                int var49 = var37.field4979[var39];
                                arg9.method4234((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method4234((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field4987[var40], var37.field4987[var41], var37.field4987[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field10567 = true;
        this.field7866.method306(var15);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILmp;[I[I[I[II)V", line = 2281)
    private final void method3313(int arg0, int arg1, class758 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class709 var9 = this.field7864[arg0][arg1];
        if (var9 != null) {
            if ((var9.field9628 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field9628 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3942 * arg0;
                int var11 = super.field3942 + var10;
                int var12 = super.field3942 * arg1;
                int var13 = super.field3942 + var12;
                float var16;
                float var17;
                float var18;
                float var19;
                int var23;
                int var25;
                int var27;
                int var29;
                int var31;
                int var33;
                int var35;
                int var37;
                if ((var9.field9628 & 1) != 0) {
                    int var14 = super.field3934[arg0][arg1];
                    float var15 = (float) var14 * this.field7876;
                    if (this.field7877 == -1) {
                        var16 = (float) var12 * this.field7880 + (float) var10 * this.field7882 + var15 + this.field7867;
                        if (var16 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var17 = (float) var12 * this.field7880 + (float) var11 * this.field7882 + var15 + this.field7867;
                        if (var17 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var18 = (float) var13 * this.field7880 + (float) var11 * this.field7882 + var15 + this.field7867;
                        if (var18 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var19 = (float) var13 * this.field7880 + (float) var10 * this.field7882 + var15 + this.field7867;
                        if (var19 <= (float) this.field7866.field4025) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field7880 + (float) var10 * this.field7882 + var15 + this.field7867;
                        var17 = (float) var12 * this.field7880 + (float) var11 * this.field7882 + var15 + this.field7867;
                        var18 = (float) var13 * this.field7880 + (float) var11 * this.field7882 + var15 + this.field7867;
                        var19 = (float) var13 * this.field7880 + (float) var10 * this.field7882 + var15 + this.field7867;
                    }
                    float var20 = (float) var14 * this.field7865;
                    float var21 = (float) var14 * this.field7870;
                    if (this.field7877 == -1) {
                        float var22 = (float) var12 * this.field7873 + (float) var10 * this.field7861 + var20 + this.field7862;
                        var23 = (int) ((float) this.field7866.field4034 * var22 / var16) + arg2.field10563;
                        float var24 = (float) var12 * this.field7878 + (float) var10 * this.field7863 + var21 + this.field7875;
                        var25 = (int) ((float) this.field7866.field4040 * var24 / var16) + arg2.field10566;
                        float var26 = (float) var12 * this.field7873 + (float) var11 * this.field7861 + var20 + this.field7862;
                        var27 = (int) ((float) this.field7866.field4034 * var26 / var17) + arg2.field10563;
                        float var28 = (float) var12 * this.field7878 + (float) var11 * this.field7863 + var21 + this.field7875;
                        var29 = (int) ((float) this.field7866.field4040 * var28 / var17) + arg2.field10566;
                        float var30 = (float) var13 * this.field7873 + (float) var11 * this.field7861 + var20 + this.field7862;
                        var31 = (int) ((float) this.field7866.field4034 * var30 / var18) + arg2.field10563;
                        float var32 = (float) var13 * this.field7878 + (float) var11 * this.field7863 + var21 + this.field7875;
                        var33 = (int) ((float) this.field7866.field4040 * var32 / var18) + arg2.field10566;
                        float var34 = (float) var13 * this.field7873 + (float) var10 * this.field7861 + var20 + this.field7862;
                        var35 = (int) ((float) this.field7866.field4034 * var34 / var19) + arg2.field10563;
                        float var36 = (float) var13 * this.field7878 + (float) var10 * this.field7863 + var21 + this.field7875;
                        var37 = (int) ((float) this.field7866.field4040 * var36 / var19) + arg2.field10566;
                    } else {
                        float var38 = (float) var12 * this.field7873 + (float) var10 * this.field7861 + var20 + this.field7862;
                        var23 = (int) ((float) this.field7866.field4034 * var38 / (float) this.field7877) + arg2.field10563;
                        float var39 = (float) var12 * this.field7878 + (float) var10 * this.field7863 + var21 + this.field7875;
                        var25 = (int) ((float) this.field7866.field4040 * var39 / (float) this.field7877) + arg2.field10566;
                        float var40 = (float) var12 * this.field7873 + (float) var11 * this.field7861 + var20 + this.field7862;
                        var27 = (int) ((float) this.field7866.field4034 * var40 / (float) this.field7877) + arg2.field10563;
                        float var41 = (float) var12 * this.field7878 + (float) var11 * this.field7863 + var21 + this.field7875;
                        var29 = (int) ((float) this.field7866.field4040 * var41 / (float) this.field7877) + arg2.field10566;
                        float var42 = (float) var13 * this.field7873 + (float) var11 * this.field7861 + var20 + this.field7862;
                        var31 = (int) ((float) this.field7866.field4034 * var42 / (float) this.field7877) + arg2.field10563;
                        float var43 = (float) var13 * this.field7878 + (float) var11 * this.field7863 + var21 + this.field7875;
                        var33 = (int) ((float) this.field7866.field4040 * var43 / (float) this.field7877) + arg2.field10566;
                        float var44 = (float) var13 * this.field7873 + (float) var10 * this.field7861 + var20 + this.field7862;
                        var35 = (int) ((float) this.field7866.field4034 * var44 / (float) this.field7877) + arg2.field10563;
                        float var45 = (float) var13 * this.field7878 + (float) var10 * this.field7863 + var21 + this.field7875;
                        var37 = (int) ((float) this.field7866.field4040 * var45 / (float) this.field7877) + arg2.field10566;
                    }
                } else {
                    int var46 = super.field3934[arg0][arg1];
                    int var47 = super.field3934[arg0 + 1][arg1];
                    int var48 = super.field3934[arg0 + 1][arg1 + 1];
                    int var49 = super.field3934[arg0][arg1 + 1];
                    if (this.field7877 == -1) {
                        var16 = (float) var12 * this.field7880 + (float) var10 * this.field7882 + (float) var46 * this.field7876 + this.field7867;
                        if (var16 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var17 = (float) var12 * this.field7880 + (float) var11 * this.field7882 + (float) var47 * this.field7876 + this.field7867;
                        if (var17 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var18 = (float) var13 * this.field7880 + (float) var11 * this.field7882 + (float) var48 * this.field7876 + this.field7867;
                        if (var18 <= (float) this.field7866.field4025) {
                            return;
                        }
                        var19 = (float) var13 * this.field7880 + (float) var10 * this.field7882 + (float) var49 * this.field7876 + this.field7867;
                        if (var19 <= (float) this.field7866.field4025) {
                            return;
                        }
                        float var50 = (float) var12 * this.field7873 + (float) var10 * this.field7861 + (float) var46 * this.field7865 + this.field7862;
                        var23 = (int) ((float) this.field7866.field4034 * var50 / var16) + arg2.field10563;
                        float var51 = (float) var12 * this.field7878 + (float) var10 * this.field7863 + (float) var46 * this.field7870 + this.field7875;
                        var25 = (int) ((float) this.field7866.field4040 * var51 / var16) + arg2.field10566;
                        float var52 = (float) var12 * this.field7873 + (float) var11 * this.field7861 + (float) var47 * this.field7865 + this.field7862;
                        var27 = (int) ((float) this.field7866.field4034 * var52 / var17) + arg2.field10563;
                        float var53 = (float) var12 * this.field7878 + (float) var11 * this.field7863 + (float) var47 * this.field7870 + this.field7875;
                        var29 = (int) ((float) this.field7866.field4040 * var53 / var17) + arg2.field10566;
                        float var54 = (float) var13 * this.field7873 + (float) var11 * this.field7861 + (float) var48 * this.field7865 + this.field7862;
                        var31 = (int) ((float) this.field7866.field4034 * var54 / var18) + arg2.field10563;
                        float var55 = (float) var13 * this.field7878 + (float) var11 * this.field7863 + (float) var48 * this.field7870 + this.field7875;
                        var33 = (int) ((float) this.field7866.field4040 * var55 / var18) + arg2.field10566;
                        float var56 = (float) var13 * this.field7873 + (float) var10 * this.field7861 + (float) var49 * this.field7865 + this.field7862;
                        var35 = (int) ((float) this.field7866.field4034 * var56 / var19) + arg2.field10563;
                        float var57 = (float) var13 * this.field7878 + (float) var10 * this.field7863 + (float) var49 * this.field7870 + this.field7875;
                        var37 = (int) ((float) this.field7866.field4040 * var57 / var19) + arg2.field10566;
                    } else {
                        var16 = (float) var12 * this.field7880 + (float) var10 * this.field7882 + (float) var46 * this.field7876 + this.field7867;
                        var17 = (float) var12 * this.field7880 + (float) var11 * this.field7882 + (float) var47 * this.field7876 + this.field7867;
                        var18 = (float) var13 * this.field7880 + (float) var11 * this.field7882 + (float) var48 * this.field7876 + this.field7867;
                        var19 = (float) var13 * this.field7880 + (float) var10 * this.field7882 + (float) var49 * this.field7876 + this.field7867;
                        float var58 = (float) var12 * this.field7873 + (float) var10 * this.field7861 + (float) var46 * this.field7865 + this.field7862;
                        var23 = (int) ((float) this.field7866.field4034 * var58 / (float) this.field7877) + arg2.field10563;
                        float var59 = (float) var12 * this.field7878 + (float) var10 * this.field7863 + (float) var46 * this.field7870 + this.field7875;
                        var25 = (int) ((float) this.field7866.field4040 * var59 / (float) this.field7877) + arg2.field10566;
                        float var60 = (float) var12 * this.field7873 + (float) var11 * this.field7861 + (float) var47 * this.field7865 + this.field7862;
                        var27 = (int) ((float) this.field7866.field4034 * var60 / (float) this.field7877) + arg2.field10563;
                        float var61 = (float) var12 * this.field7878 + (float) var11 * this.field7863 + (float) var47 * this.field7870 + this.field7875;
                        var29 = (int) ((float) this.field7866.field4040 * var61 / (float) this.field7877) + arg2.field10566;
                        float var62 = (float) var13 * this.field7873 + (float) var11 * this.field7861 + (float) var48 * this.field7865 + this.field7862;
                        var31 = (int) ((float) this.field7866.field4034 * var62 / (float) this.field7877) + arg2.field10563;
                        float var63 = (float) var13 * this.field7878 + (float) var11 * this.field7863 + (float) var48 * this.field7870 + this.field7875;
                        var33 = (int) ((float) this.field7866.field4040 * var63 / (float) this.field7877) + arg2.field10566;
                        float var64 = (float) var13 * this.field7873 + (float) var10 * this.field7861 + (float) var49 * this.field7865 + this.field7862;
                        var35 = (int) ((float) this.field7866.field4034 * var64 / (float) this.field7877) + arg2.field10563;
                        float var65 = (float) var13 * this.field7878 + (float) var10 * this.field7863 + (float) var49 * this.field7870 + this.field7875;
                        var37 = (int) ((float) this.field7866.field4040 * var65 / (float) this.field7877) + arg2.field10566;
                    }
                }
                if (this.field7877 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field10569 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field10577 || var35 > arg2.field10577 || var27 > arg2.field10577;
                        if (var9.field9627 >= 0) {
                            arg2.method4231((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class646.field8885[var9.field9624 & 65535] & 16777215, -16777216 | class646.field8885[var9.field9626 & 65535] & 16777215, -16777216 | class646.field8885[var9.field9625 & 65535] & 16777215, 0, 0, 0, 0, var9.field9627);
                        } else {
                            arg2.method4229((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field9624 & 65535), (float) (var9.field9626 & 65535), (float) (var9.field9625 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field10569 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field10577 || var27 > arg2.field10577 || var35 > arg2.field10577;
                        if (var9.field9627 >= 0) {
                            arg2.method4231((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class646.field8885[var9.field9623 & 65535] & 16777215, -16777216 | class646.field8885[var9.field9625 & 65535] & 16777215, -16777216 | class646.field8885[var9.field9626 & 65535] & 16777215, 0, 0, 0, 0, var9.field9627);
                            return;
                        }
                        arg2.method4229((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field9623 & 65535), (float) (var9.field9625 & 65535), (float) (var9.field9626 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field10569 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field10577 || var35 > arg2.field10577 || var27 > arg2.field10577;
                        if (var9.field9627 >= 0) {
                            arg2.method4231((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class646.field8885[var9.field9624 & 65535] & 16777215, -16777216 | class646.field8885[var9.field9626 & 65535] & 16777215, -16777216 | class646.field8885[var9.field9625 & 65535] & 16777215, 0, 0, 0, 0, var9.field9627);
                        } else {
                            arg2.method4229((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field9624 & 65535), (float) (var9.field9626 & 65535), (float) (var9.field9625 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field10569 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field10577 || var27 > arg2.field10577 || var35 > arg2.field10577;
                        if (var9.field9627 >= 0) {
                            arg2.method4231((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class646.field8885[var9.field9623 & 65535] & 16777215, -16777216 | class646.field8885[var9.field9625 & 65535] & 16777215, -16777216 | class646.field8885[var9.field9626 & 65535] & 16777215, 0, 0, 0, 0, var9.field9627);
                            return;
                        }
                        arg2.method4229((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field9623 & 65535), (float) (var9.field9625 & 65535), (float) (var9.field9626 & 65535));
                    }
                }
            }
        } else {
            class636 var66 = this.field7871[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field8742 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field7877 == -1) {
                    for (int var67 = 0; var67 < var66.field8731; ++var67) {
                        int var68 = (arg0 << super.field3938) + var66.field8738[var67];
                        short var69 = var66.field8739[var67];
                        int var70 = (arg1 << super.field3938) + var66.field8736[var67];
                        float var71 = (float) var70 * this.field7880 + (float) var68 * this.field7882 + (float) var69 * this.field7876 + this.field7867;
                        if (var71 <= (float) this.field7866.field4025) {
                            return;
                        }
                        float var72 = (float) var70 * this.field7873 + (float) var68 * this.field7861 + (float) var69 * this.field7865 + this.field7862;
                        float var73 = (float) var70 * this.field7878 + (float) var68 * this.field7863 + (float) var69 * this.field7870 + this.field7875;
                        arg3[var67] = (int) ((float) this.field7866.field4034 * var72 / var71) + arg2.field10563;
                        arg4[var67] = (int) ((float) this.field7866.field4040 * var73 / var71) + arg2.field10566;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field8731; ++var74) {
                        int var110 = (arg0 << super.field3938) + var66.field8738[var74];
                        short var111 = var66.field8739[var74];
                        int var112 = (arg1 << super.field3938) + var66.field8736[var74];
                        float var113 = (float) var112 * this.field7880 + (float) var110 * this.field7882 + (float) var111 * this.field7876 + this.field7867;
                        float var114 = (float) var112 * this.field7873 + (float) var110 * this.field7861 + (float) var111 * this.field7865 + this.field7862;
                        float var115 = (float) var112 * this.field7878 + (float) var110 * this.field7863 + (float) var111 * this.field7870 + this.field7875;
                        arg3[var74] = (int) ((float) this.field7866.field4034 * var114 / (float) this.field7877) + arg2.field10563;
                        arg4[var74] = (int) ((float) this.field7866.field4040 * var115 / (float) this.field7877) + arg2.field10566;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field8737 != null) {
                    if (this.field7877 == -1) {
                        for (int var75 = 0; var75 < var66.field8741; ++var75) {
                            short var76 = var66.field8733[var75];
                            short var77 = var66.field8732[var75];
                            short var78 = var66.field8743[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field10569 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field10577 || var80 > arg2.field10577 || var81 > arg2.field10577;
                                short var85 = var66.field8737[var75];
                                if (var85 != -1) {
                                    arg2.method4231((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field8738[var76] / (float) super.field3942, (float) var66.field8738[var77] / (float) super.field3942, (float) var66.field8738[var78] / (float) super.field3942, (float) var66.field8736[var76] / (float) super.field3942, (float) var66.field8736[var77] / (float) super.field3942, (float) var66.field8736[var78] / (float) super.field3942, -16777216 | class646.field8885[var66.field8730[var76] & 65535] & 16777215, -16777216 | class646.field8885[var66.field8730[var77] & 65535] & 16777215, -16777216 | class646.field8885[var66.field8730[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field8735[var75];
                                    if (var86 != -1) {
                                        arg2.method4229((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class307.method2001(0, var66.field8730[var76], var86), (float) class307.method2001(0, var66.field8730[var77], var86), (float) class307.method2001(0, var66.field8730[var78], var86));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field8741; ++var87) {
                        short var88 = var66.field8733[var87];
                        short var89 = var66.field8732[var87];
                        short var90 = var66.field8743[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field10569 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field10577 || var92 > arg2.field10577 || var93 > arg2.field10577;
                            short var97 = var66.field8737[var87];
                            if (var97 != -1) {
                                arg2.method4231((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field8738[var88] / (float) super.field3942, (float) var66.field8738[var89] / (float) super.field3942, (float) var66.field8738[var90] / (float) super.field3942, (float) var66.field8736[var88] / (float) super.field3942, (float) var66.field8736[var89] / (float) super.field3942, (float) var66.field8736[var90] / (float) super.field3942, -16777216 | class646.field8885[var66.field8730[var88] & 65535] & 16777215, -16777216 | class646.field8885[var66.field8730[var89] & 65535] & 16777215, -16777216 | class646.field8885[var66.field8730[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field8735[var87];
                                if (var98 != -1) {
                                    arg2.method4229((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class307.method2001(0, var66.field8730[var88], var98), (float) class307.method2001(0, var66.field8730[var89], var98), (float) class307.method2001(0, var66.field8730[var90], var98));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field8741; ++var99) {
                    short var100 = var66.field8733[var99];
                    short var101 = var66.field8732[var99];
                    short var102 = var66.field8743[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field8735[var99];
                        if (var109 != -1) {
                            arg2.field10569 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field10577 || var104 > arg2.field10577 || var105 > arg2.field10577;
                            arg2.method4229((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class307.method2001(0, var66.field8730[var100], var109), (float) class307.method2001(0, var66.field8730[var101], var109), (float) class307.method2001(0, var66.field8730[var102], var109));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 2758)
    public final boolean method1154(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!cr", name = "fa", descriptor = "(IILr;)Lr;", line = 2761)
    public final class184 method1146(int arg0, int arg1, class184 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII[[Z)V", line = 2769)
    public final void method1162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class534 var9 = this.field7866.method1893(Thread.currentThread());
        class758 var10 = var9.field7368;
        var10.field10572 = 0;
        var10.field10569 = true;
        this.field7866.method324();
        if (this.field7879 == null && this.field7868 == null) {
            if (this.field7864 != null) {
                this.method3315(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7360, var9.field7376);
            }
        } else {
            this.method3312(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7360, var9.field7376);
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIZLpga;Lmp;[I[I[I[II)V", line = 2789)
    private final void method3314(int arg0, int arg1, boolean arg2, class534 arg3, class758 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class354 var11 = this.field7868[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field7877 == -1) {
                    for (int var12 = 0; var12 < var11.field4984; ++var12) {
                        int var13 = (arg0 << super.field3938) + var11.field4986[var12];
                        int var14 = var11.field4982[var12];
                        int var15 = (arg1 << super.field3938) + var11.field4977[var12];
                        float var16 = (float) var15 * this.field7880 + (float) var13 * this.field7882 + (float) var14 * this.field7876 + this.field7867;
                        if (var16 <= (float) this.field7866.field4025) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7358);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field4985[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7349) {
                            int var19 = (int) (var16 - (float) arg3.field7358);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field7873 + (float) var13 * this.field7861 + (float) var14 * this.field7865 + this.field7862;
                        float var21 = (float) var15 * this.field7878 + (float) var13 * this.field7863 + (float) var14 * this.field7870 + this.field7875;
                        arg5[var12] = (int) ((float) this.field7866.field4034 * var20 / var16) + arg4.field10563;
                        arg6[var12] = (int) ((float) this.field7866.field4040 * var21 / var16) + arg4.field10566;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field4984; ++var22) {
                        int var36 = (arg0 << super.field3938) + var11.field4986[var22];
                        int var37 = var11.field4982[var22];
                        int var38 = (arg1 << super.field3938) + var11.field4977[var22];
                        float var39 = (float) var38 * this.field7880 + (float) var36 * this.field7882 + (float) var37 * this.field7876 + this.field7867;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field7877 - arg3.field7358;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field4985[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7349) {
                            int var42 = this.field7877 - arg3.field7358;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field7873 + (float) var36 * this.field7861 + (float) var37 * this.field7865 + this.field7862;
                        float var44 = (float) var38 * this.field7878 + (float) var36 * this.field7863 + (float) var37 * this.field7870 + this.field7875;
                        arg5[var22] = (int) ((float) this.field7866.field4034 * var43 / (float) this.field7877) + arg4.field10563;
                        arg6[var22] = (int) ((float) this.field7866.field4040 * var44 / (float) this.field7877) + arg4.field10566;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3942;
                for (int var24 = 0; var24 < var11.field4983; ++var24) {
                    int var25 = var24 * 3;
                    int var26 = var25 + 1;
                    int var27 = var26 + 1;
                    int var28 = arg5[var25];
                    int var29 = arg5[var26];
                    int var30 = arg5[var27];
                    int var31 = arg6[var25];
                    int var32 = arg6[var26];
                    int var33 = arg6[var27];
                    if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                        arg4.field10569 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field10577 || var29 > arg4.field10577 || var30 > arg4.field10577;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3938;
                            int var35 = arg1 << super.field3938;
                            if ((var11.field4987[var25] & 16777215) != 0) {
                                if (var11.field4980[var25] == var11.field4980[var26] && var11.field4980[var25] == var11.field4980[var27] && var11.field4978[var25] == var11.field4978[var26] && var11.field4978[var25] == var11.field4978[var27]) {
                                    arg4.method4231((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field4986[var25] + var34) / (float) var11.field4978[var25], (float) (var11.field4986[var26] + var34) / (float) var11.field4978[var26], (float) (var11.field4986[var27] + var34) / (float) var11.field4978[var27], (float) (var11.field4977[var25] + var35) / (float) var11.field4978[var25], (float) (var11.field4977[var26] + var35) / (float) var11.field4978[var26], (float) (var11.field4977[var27] + var35) / (float) var11.field4978[var27], var11.field4987[var25], var11.field4987[var26], var11.field4987[var27], arg3.field7340, arg8[var25], arg8[var26], arg8[var27], var11.field4980[var25]);
                                } else {
                                    arg4.method4227((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field4986[var25] + var34) / var23, (float) (var11.field4986[var26] + var34) / var23, (float) (var11.field4986[var27] + var34) / var23, (float) (var11.field4977[var25] + var35) / var23, (float) (var11.field4977[var26] + var35) / var23, (float) (var11.field4977[var27] + var35) / var23, var11.field4987[var25], var11.field4987[var26], var11.field4987[var27], arg3.field7340, arg8[var25], arg8[var26], arg8[var27], var11.field4980[var25], var23 / (float) var11.field4978[var25], var11.field4980[var26], var23 / (float) var11.field4978[var26], var11.field4980[var27], var23 / (float) var11.field4978[var27]);
                                }
                            }
                        } else {
                            arg4.method4225((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7340);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V", line = 2981)
    public final void method1150(int arg0, int arg1) {
        this.method3311(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIII[[ZLpga;Lmp;[I[I)V", line = 2985)
    private final void method3315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class534 arg8, class758 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7350;
        this.field7866.method306(false);
        arg9.field10567 = false;
        arg9.field10565 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field7864[var18][var19] != null) {
                        class709 var20 = this.field7864[var18][var19];
                        if (var20.field9627 != -1 && (var20.field9628 & 2) == 0 && var20.field9622 == -1) {
                            int var21 = this.field7866.method1891(var20.field9627);
                            arg9.method4229((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class307.method2001(0, var20.field9624 & 65535, var21), (float) class307.method2001(0, var20.field9626 & 65535, var21), (float) class307.method2001(0, var20.field9625 & 65535, var21));
                            arg9.method4229((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class307.method2001(0, var20.field9623 & 65535, var21), (float) class307.method2001(0, var20.field9625 & 65535, var21), (float) class307.method2001(0, var20.field9626 & 65535, var21));
                        } else if (var20.field9622 == -1) {
                            arg9.method4229((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field9624 & 65535), (float) (var20.field9626 & 65535), (float) (var20.field9625 & 65535));
                            arg9.method4229((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field9623 & 65535), (float) (var20.field9625 & 65535), (float) (var20.field9626 & 65535));
                        } else {
                            int var22 = var20.field9622;
                            arg9.method4229((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method4229((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field7871[var18][var19] != null) {
                        class636 var23 = this.field7871[var18][var19];
                        for (int var24 = 0; var24 < var23.field8731; ++var24) {
                            arg10[var24] = var23.field8738[var24] * var14 / super.field3942 + var16;
                            arg11[var24] = var17 - var23.field8736[var24] * var14 / super.field3942;
                        }
                        for (int var25 = 0; var25 < var23.field8741; ++var25) {
                            short var26 = var23.field8733[var25];
                            short var27 = var23.field8732[var25];
                            short var28 = var23.field8743[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field8734 != null && var23.field8734[var25] != -1) {
                                int var35 = var23.field8734[var25];
                                arg9.method4229((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class307.method2001(0, var23.field8730[var26], var35), (float) class307.method2001(0, var23.field8730[var27], var35), (float) class307.method2001(0, var23.field8730[var28], var35));
                            } else if (var23.field8737 != null && var23.field8737[var25] != -1) {
                                int var36 = this.field7866.method1891(var23.field8737[var25]);
                                arg9.method4229((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class307.method2001(0, var23.field8730[var26], var36), (float) class307.method2001(0, var23.field8730[var27], var36), (float) class307.method2001(0, var23.field8730[var28], var36));
                            } else {
                                int var37 = var23.field8735[var25];
                                arg9.method4229((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class307.method2001(0, var23.field8730[var26], var37), (float) class307.method2001(0, var23.field8730[var27], var37), (float) class307.method2001(0, var23.field8730[var28], var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field10567 = true;
        this.field7866.method306(var15);
    }

    @OriginalMember(owner = "client!cr", name = "YA", descriptor = "()V", line = 3120)
    public final void method1153() {
        this.field7869 = null;
        this.field7881 = null;
    }

    @OriginalMember(owner = "client!cr", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 3125)
    public final void method1151(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)Z", line = 3137)
    private final boolean method3316(int arg0) {
        if ((this.field7872 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lao;IIII[[I[[II)V", line = 3156)
    public class573(class289 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7866 = arg0;
        this.field7872 = arg2;
        this.field7869 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field7866.field4043 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field7866.field4022 * var18 + this.field7866.field4027 * var16 + this.field7866.field4016 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field7869[var11][var10] = (byte) var20;
            }
        }
        this.field7881 = new byte[arg3 + 1][arg4 + 1];
    }
}
