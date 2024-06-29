import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class72 extends class500 {

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "Z")
    public static boolean field993 = false;

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!gv", name = "F", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!gv", name = "G", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!gv", name = "I", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!gv", name = "J", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "[[[Lnj;")
    public static class205[][][] field988;

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Law;IIII[[I[[II)V", line = 3)
    public class72(class67 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V", line = 10)
    public static void method577(int arg0) {
        if (arg0 == 26410) {
            field988 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[ILgj;I[I[IIZ[I)V", line = 28)
    private final void method578(int arg0, int[] arg1, class543 arg2, int arg3, int[] arg4, int[] arg5, int arg6, boolean arg7, int[] arg8) {
        int var10 = -31 / ((arg3 - 65) / 61);
        ++field991;
        class225 var11 = super.field7103[arg6][arg0];
        if (var11 != null) {
            if (~(var11.field3250 & 2) == -1) {
                int var12 = super.field2694 * arg6;
                int var13 = super.field2694 + var12;
                int var14 = super.field2694 * arg0;
                int var15 = var14 - -super.field2694;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                int var22;
                int var23;
                int var24;
                int var25;
                int var31;
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
                int var45;
                int var46;
                int var47;
                if ((var11.field3250 & 1) != 0 && !arg7) {
                    int var20 = super.field7087[arg6][arg0];
                    if (super.field7095 == -1) {
                        int var21 = super.field7091 * var20;
                        var22 = (super.field7092 * var14 + (super.field7097 * var12 - -var21) >> 15) + super.field7104;
                        if (var22 <= super.field7090.field845) {
                            return;
                        }
                        var23 = (super.field7092 * var14 + super.field7097 * var13 + var21 >> 15) + super.field7104;
                        if (~super.field7090.field845 <= ~var23) {
                            return;
                        }
                        var24 = (super.field7097 * var13 + var21 - -(super.field7092 * var15) >> 15) + super.field7104;
                        if (~var24 >= ~super.field7090.field845) {
                            return;
                        }
                        var25 = (super.field7097 * var12 + super.field7092 * var15 + var21 >> 15) + super.field7104;
                        if (~super.field7090.field845 <= ~var25) {
                            return;
                        }
                    } else {
                        var25 = super.field7095;
                        var24 = super.field7095;
                        var23 = super.field7095;
                        var22 = super.field7095;
                    }
                    if (super.field7090.field856) {
                        int var26 = var22 - super.field7090.field837;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (~var26 < -256) {
                                var16 = 255;
                            }
                        }
                        int var27 = var23 - super.field7090.field837;
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = -super.field7090.field837 + var24;
                        if (~var28 < -1) {
                            var18 = var28;
                            if (~var28 < -256) {
                                var18 = 255;
                            }
                        }
                        int var29 = -super.field7090.field837 + var25;
                        if (var29 > 0) {
                            var19 = var29;
                            if (~var29 < -256) {
                                var19 = 255;
                            }
                        }
                    }
                    int var30 = super.field7083 * var20;
                    var31 = (super.field7100 * var12 + var30 - -(super.field7089 * var14) >> 15) + super.field7098;
                    int var32 = super.field7086 * var20;
                    var33 = arg2.field8131 - -(super.field7090.field843 * var31 / var22);
                    var34 = (super.field7099 * var14 + super.field7101 * var12 + var32 >> 15) + super.field7096;
                    var35 = (super.field7100 * var13 + var30 - -(super.field7089 * var14) >> 15) + super.field7098;
                    var36 = super.field7090.field825 * var34 / var22 + arg2.field8133;
                    var37 = super.field7090.field843 * var35 / var23 + arg2.field8131;
                    var38 = (super.field7099 * var14 + super.field7101 * var13 + var32 >> 15) + super.field7096;
                    var39 = super.field7090.field825 * var38 / var23 + arg2.field8133;
                    var40 = super.field7098 - -(super.field7100 * var13 + super.field7089 * var15 + var30 >> 15);
                    var41 = (super.field7099 * var15 + super.field7101 * var13 + var32 >> 15) + super.field7096;
                    var42 = arg2.field8131 - -(super.field7090.field843 * var40 / var24);
                    var43 = arg2.field8133 - -(super.field7090.field825 * var41 / var24);
                    var44 = (super.field7089 * var15 + super.field7100 * var12 + var30 >> 15) + super.field7098;
                    var45 = super.field7090.field843 * var44 / var25 + arg2.field8131;
                    var46 = (super.field7101 * var12 + super.field7099 * var15 + var32 >> 15) + super.field7096;
                    var47 = super.field7090.field825 * var46 / var25 + arg2.field8133;
                } else {
                    int var48 = super.field7087[arg6][arg0];
                    int var49 = super.field7087[arg6 + 1][arg0];
                    int var50 = super.field7087[arg6 + 1][arg0 - -1];
                    int var51 = super.field7087[arg6][arg0 - -1];
                    if (super.field7095 == -1) {
                        var22 = super.field7104 - -(super.field7091 * var48 + (super.field7097 * var12 - -(super.field7092 * var14)) >> 15);
                        if (var22 <= super.field7090.field845) {
                            return;
                        }
                        var23 = (super.field7091 * var49 + super.field7097 * var13 + super.field7092 * var14 >> 15) + super.field7104;
                        if (var23 <= super.field7090.field845) {
                            return;
                        }
                        var24 = (super.field7097 * var13 + super.field7091 * var50 - -(super.field7092 * var15) >> 15) + super.field7104;
                        if (var24 <= super.field7090.field845) {
                            return;
                        }
                        var25 = (super.field7091 * var51 + super.field7097 * var12 + super.field7092 * var15 >> 15) + super.field7104;
                        if (super.field7090.field845 >= var25) {
                            return;
                        }
                    } else {
                        var25 = super.field7095;
                        var24 = super.field7095;
                        var23 = super.field7095;
                        var22 = super.field7095;
                    }
                    if (!arg7) {
                        if (super.field7090.field856) {
                            int var52 = -super.field7090.field837 + var22;
                            if (var52 > 0) {
                                var16 = var52;
                                if (var52 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var53 = -super.field7090.field837 + var23;
                            if (~var53 < -1) {
                                var17 = var53;
                                if (~var53 < -256) {
                                    var17 = 255;
                                }
                            }
                            int var54 = -super.field7090.field837 + var24;
                            if (var54 > 0) {
                                var18 = var54;
                                if (~var54 < -256) {
                                    var18 = 255;
                                }
                            }
                            int var55 = -super.field7090.field837 + var25;
                            if (var55 > 0) {
                                var19 = var55;
                                if (~var55 < -256) {
                                    var19 = 255;
                                }
                            }
                        }
                    } else {
                        int var56 = -super.field7090.field837 + var22;
                        if (var56 > 255) {
                            var56 = 255;
                        }
                        if (~var56 < -1) {
                            var16 = var56;
                            int var57 = var11.field3254 * var56 / 255;
                            if (~var57 < -1) {
                                var48 -= var57;
                            }
                        }
                        int var58 = var23 - super.field7090.field837;
                        if (~var58 < -256) {
                            var58 = 255;
                        }
                        if (var58 > 0) {
                            var17 = var58;
                            int var59 = var11.field3257 * var58 / 255;
                            if (~var59 < -1) {
                                var49 -= var59;
                            }
                        }
                        int var60 = -super.field7090.field837 + var24;
                        if (~var60 < -256) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var18 = var60;
                            int var61 = var11.field3248 * var60 / 255;
                            if (var61 > 0) {
                                var50 -= var61;
                            }
                        }
                        int var62 = -super.field7090.field837 + var25;
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (~var62 < -1) {
                            var19 = var62;
                            int var63 = var11.field3256 * var62 / 255;
                            if (~var63 < -1) {
                                var51 -= var63;
                            }
                        }
                    }
                    var31 = super.field7098 - -(super.field7083 * var48 + super.field7100 * var12 + super.field7089 * var14 >> 15);
                    var34 = (super.field7099 * var14 + super.field7101 * var12 + super.field7086 * var48 >> 15) + super.field7096;
                    var33 = super.field7090.field843 * var31 / var22 + arg2.field8131;
                    var36 = super.field7090.field825 * var34 / var22 + arg2.field8133;
                    var35 = (super.field7083 * var49 + super.field7100 * var13 + super.field7089 * var14 >> 15) + super.field7098;
                    var38 = (super.field7099 * var14 + super.field7101 * var13 + super.field7086 * var49 >> 15) + super.field7096;
                    var37 = super.field7090.field843 * var35 / var23 + arg2.field8131;
                    var40 = (super.field7100 * var13 + super.field7089 * var15 - -(super.field7083 * var50) >> 15) + super.field7098;
                    var39 = super.field7090.field825 * var38 / var23 + arg2.field8133;
                    var42 = super.field7090.field843 * var40 / var24 + arg2.field8131;
                    var41 = (super.field7086 * var50 + super.field7101 * var13 + super.field7099 * var15 >> 15) + super.field7096;
                    var44 = (super.field7100 * var12 + super.field7089 * var15 + super.field7083 * var51 >> 15) + super.field7098;
                    var43 = super.field7090.field825 * var41 / var24 + arg2.field8133;
                    var46 = super.field7096 - -(super.field7101 * var12 + super.field7099 * var15 - -(super.field7086 * var51) >> 15);
                    var45 = super.field7090.field843 * var44 / var25 + arg2.field8131;
                    var47 = super.field7090.field825 * var46 / var25 + arg2.field8133;
                }
                boolean var64 = ~var11.field3255 != 0 && this.method2985(super.field7090.field3092.method110(var11.field3255, (byte) 124).field6646);
                int var65 = var17 - -var18 + var19;
                if ((-var45 + var42) * (-var47 + var39) + -((var37 - var45) * (-var47 + var43)) > 0) {
                    arg2.field8137 = var42 < 0 || var45 < 0 || ~var37 > -1 || ~arg2.field8126 > ~var42 || ~var45 < ~arg2.field8126 || ~var37 < ~arg2.field8126;
                    if (~var65 <= -766) {
                        arg2.method3302(var43, var47, var39, var42, var45, var37, var24, var25, var23, super.field7090.field854);
                    } else {
                        if (var64) {
                            arg2.field8130 = 100;
                        }
                        if (var65 <= 0) {
                            if (var11.field3255 < 0) {
                                arg2.method3297(var43, var47, var39, var42, var45, var37, var24, var25, var23, var11.field3253, var11.field3252, var11.field3247);
                            } else {
                                arg2.method3301(var43, var47, var39, var42, var45, var37, var11.field3253, var11.field3252, var11.field3247, var40, var44, var35, var41, var46, var38, var24, var25, var23, var11.field3255);
                            }
                        } else if (var11.field3255 >= 0) {
                            arg2.method3295(var43, var47, var39, var42, var45, var37, var24, var25, var23, super.field7090.field854, var18, var19, var17, var11.field3253, var11.field3252, var11.field3247, var40, var44, var35, var41, var46, var38, var24, var25, var23, var11.field3255);
                        } else {
                            arg2.method3297(var43, var47, var39, var42, var45, var37, var24, var25, var23, class199.method1338(super.field7090.field854 | var18 << 24, (byte) -119, var11.field3253), class199.method1338(super.field7090.field854 | var19 << 24, (byte) -87, var11.field3252), class199.method1338(super.field7090.field854 | var17 << 24, (byte) -128, var11.field3247));
                        }
                        arg2.field8130 = 0;
                    }
                }
                int var66 = var16 + var17 + var19;
                if (~((-var37 + var33) * (-var39 + var47) - (var45 - var37) * (-var39 + var36)) < -1) {
                    arg2.field8137 = ~var33 > -1 || var37 < 0 || var45 < 0 || arg2.field8126 < var33 || arg2.field8126 < var37 || arg2.field8126 < var45;
                    if (~var66 > -766) {
                        if (var64) {
                            arg2.field8130 = 100;
                        }
                        if (var66 > 0) {
                            if (var11.field3255 >= 0) {
                                arg2.method3295(var36, var39, var47, var33, var37, var45, var22, var23, var25, super.field7090.field854, var16, var17, var19, var11.field3249, var11.field3247, var11.field3252, var31, var35, var44, var34, var38, var46, var22, var23, var25, var11.field3255);
                            } else {
                                arg2.method3297(var36, var39, var47, var33, var37, var45, var22, var23, var25, class199.method1338(var16 << 24 | super.field7090.field854, (byte) -69, var11.field3249), class199.method1338(var17 << 24 | super.field7090.field854, (byte) -124, var11.field3247), class199.method1338(super.field7090.field854 | var19 << 24, (byte) -90, var11.field3252));
                            }
                        } else if (~var11.field3255 <= -1) {
                            arg2.method3301(var36, var39, var47, var33, var37, var45, var11.field3249, var11.field3247, var11.field3252, var31, var35, var44, var34, var38, var46, var22, var23, var25, var11.field3255);
                        } else {
                            arg2.method3297(var36, var39, var47, var33, var37, var45, var22, var23, var25, var11.field3249, var11.field3247, var11.field3252);
                        }
                        arg2.field8130 = 0;
                        return;
                    }
                    arg2.method3302(var36, var39, var47, var33, var37, var45, var22, var23, var25, super.field7090.field854);
                }
            }
        } else {
            class108 var67 = super.field7085[arg6][arg0];
            if (var67 != null) {
                if (~super.field7095 != 0) {
                    for (int var68 = 0; var67.field1550 > var68; ++var68) {
                        int var69 = var67.field1549[var68] - -(arg6 << super.field2695);
                        int var70 = var67.field1551[var68];
                        int var71 = (arg0 << super.field2695) + var67.field1546[var68];
                        arg8[var68] = 0;
                        if (!arg7) {
                            if (super.field7090.field856) {
                                int var72 = -super.field7090.field837 + super.field7095;
                                if (var72 > 0) {
                                    arg8[var68] = var72;
                                    if (~arg8[var68] < -256) {
                                        arg8[var68] = 255;
                                    }
                                }
                            }
                        } else {
                            int var73 = -super.field7090.field837 + super.field7095;
                            if (~var73 < -256) {
                                var73 = 255;
                            }
                            if (var73 > 0) {
                                arg8[var68] = var73;
                                int var74 = var67.field1545[var68] * var73 / 255;
                                if (var74 > 0) {
                                    var70 -= var74;
                                }
                            }
                        }
                        int var75 = (super.field7099 * var71 + super.field7101 * var69 + super.field7086 * var70 >> 15) + super.field7096;
                        int var76 = (super.field7089 * var71 + (super.field7100 * var69 - -(super.field7083 * var70)) >> 15) + super.field7098;
                        arg1[var68] = super.field7090.field843 * var76 / super.field7095 + arg2.field8131;
                        arg4[var68] = arg2.field8133 - -(super.field7090.field825 * var75 / super.field7095);
                        arg5[var68] = super.field7095;
                    }
                } else {
                    for (int var77 = 0; ~var77 > ~var67.field1550; ++var77) {
                        int var117 = var67.field1549[var77] - -(arg6 << super.field2695);
                        int var118 = var67.field1551[var77];
                        int var119 = var67.field1546[var77] - -(arg0 << super.field2695);
                        int var120 = (super.field7092 * var119 + super.field7097 * var117 + super.field7091 * var118 >> 15) + super.field7104;
                        if (var120 <= super.field7090.field845) {
                            return;
                        }
                        arg8[var77] = 0;
                        if (arg7) {
                            int var121 = var120 - super.field7090.field837;
                            if (var121 > 255) {
                                var121 = 255;
                            }
                            if (var121 > 0) {
                                arg8[var77] = var121;
                                int var122 = var67.field1545[var77] * var121 / 255;
                                if (var122 > 0) {
                                    var118 -= var122;
                                }
                            }
                        } else if (super.field7090.field856) {
                            int var123 = var120 - super.field7090.field837;
                            if (~var123 < -1) {
                                arg8[var77] = var123;
                                if (arg8[var77] > 255) {
                                    arg8[var77] = 255;
                                }
                            }
                        }
                        int var124 = super.field7096 - -(super.field7086 * var118 + super.field7101 * var117 + super.field7099 * var119 >> 15);
                        int var125 = super.field7098 - -(super.field7089 * var119 + (super.field7100 * var117 - -(super.field7083 * var118)) >> 15);
                        arg1[var77] = super.field7090.field843 * var125 / var120 + arg2.field8131;
                        arg4[var77] = super.field7090.field825 * var124 / var120 + arg2.field8133;
                        arg5[var77] = var120;
                    }
                }
                if (var67.field1553 == null) {
                    for (int var78 = 0; ~var78 > ~var67.field1547; ++var78) {
                        int var79 = var78 * 3;
                        int var80 = var79 - -1;
                        int var81 = var80 - -1;
                        int var82 = arg1[var79];
                        int var83 = arg1[var80];
                        int var84 = arg1[var81];
                        int var85 = arg4[var79];
                        int var86 = arg4[var80];
                        int var87 = arg4[var81];
                        int var88 = arg8[var79] + arg8[var80] + arg8[var81];
                        if ((var87 - var86) * (-var83 + var82) + -((var84 - var83) * (var85 - var86)) > 0) {
                            arg2.field8137 = var82 < 0 || ~var83 > -1 || var84 < 0 || ~var82 < ~arg2.field8126 || ~arg2.field8126 > ~var83 || var84 > arg2.field8126;
                            if (var88 < 765) {
                                if (~var88 < -1) {
                                    if ((16777215 & var67.field1548[var79]) != 0) {
                                        arg2.method3297(var85, var86, var87, var82, var83, var84, arg5[var79], arg5[var80], arg5[var81], class428.method2506(var67.field1548[var79], (byte) -84, super.field7090.field854, arg8[var79]), class428.method2506(var67.field1548[var80], (byte) -127, super.field7090.field854, arg8[var80]), class428.method2506(var67.field1548[var81], (byte) -96, super.field7090.field854, arg8[var81]));
                                    }
                                } else if (~(16777215 & var67.field1548[var79]) != -1) {
                                    arg2.method3297(var85, var86, var87, var82, var83, var84, arg5[var79], arg5[var80], arg5[var81], var67.field1548[var79], var67.field1548[var80], var67.field1548[var81]);
                                }
                            } else {
                                arg2.method3302(var85, var86, var87, var82, var83, var84, arg5[var79], arg5[var80], arg5[var81], super.field7090.field854);
                            }
                        }
                    }
                } else {
                    int var89 = super.field7087[arg6][arg0];
                    int var90 = super.field7087[arg6 + 1][arg0];
                    int var91 = super.field7087[arg6][arg0 - -1];
                    int var92 = super.field2694 * arg6;
                    int var93 = var92 - -super.field2694;
                    int var94 = super.field2694 * arg0;
                    int var95 = var94 - -super.field2694;
                    int var96 = super.field7098 - -(super.field7100 * var92 + super.field7083 * var89 - -(super.field7089 * var94) >> 15);
                    int var97 = super.field7096 - -(super.field7099 * var94 + (super.field7101 * var92 - -(super.field7086 * var89)) >> 15);
                    int var98 = (super.field7097 * var92 + super.field7091 * var89 - -(super.field7092 * var94) >> 15) + super.field7104;
                    int var99 = (super.field7100 * var93 - (-(super.field7089 * var94) + -(super.field7083 * var90)) >> 15) + super.field7098;
                    int var100 = (super.field7101 * var93 + super.field7099 * var94 + super.field7086 * var90 >> 15) + super.field7096;
                    int var101 = (super.field7092 * var94 + super.field7097 * var93 + super.field7091 * var90 >> 15) + super.field7104;
                    int var102 = (super.field7089 * var95 + super.field7100 * var92 + super.field7083 * var91 >> 15) + super.field7098;
                    int var103 = (super.field7101 * var92 + super.field7099 * var95 - -(super.field7086 * var91) >> 15) + super.field7096;
                    int var104 = super.field7104 - -(super.field7092 * var95 + super.field7097 * var92 + super.field7091 * var91 >> 15);
                    for (int var105 = 0; var105 < var67.field1547; ++var105) {
                        int var106 = var105 * 3;
                        int var107 = var106 + 1;
                        int var108 = var107 + 1;
                        int var109 = arg1[var106];
                        int var110 = arg1[var107];
                        int var111 = arg1[var108];
                        int var112 = arg4[var106];
                        int var113 = arg4[var107];
                        int var114 = arg4[var108];
                        int var115 = arg8[var106] - -arg8[var107] - -arg8[var108];
                        if ((-var110 + var109) * (-var113 + var114) + -((-var110 + var111) * (-var113 + var112)) > 0) {
                            arg2.field8137 = var109 < 0 || var110 < 0 || ~var111 > -1 || ~var109 < ~arg2.field8126 || var110 > arg2.field8126 || ~var111 < ~arg2.field8126;
                            short var116 = var67.field1553[var105];
                            if (~var115 <= -766) {
                                arg2.method3302(var112, var113, var114, var109, var110, var111, arg5[var106], arg5[var107], arg5[var108], super.field7090.field854);
                            } else {
                                if (var116 != -1 && this.method2985(super.field7090.field3092.method110(var116, (byte) 99).field6646)) {
                                    arg2.field8130 = 100;
                                }
                                if (var115 <= 0) {
                                    if (~var116 == 0) {
                                        if ((var67.field1548[var106] & 16777215) != 0) {
                                            arg2.method3297(var112, var113, var114, var109, var110, var111, arg5[var106], arg5[var107], arg5[var108], var67.field1548[var106], var67.field1548[var107], var67.field1548[var108]);
                                        }
                                    } else {
                                        arg2.method3301(var112, var113, var114, var109, var110, var111, var67.field1548[var106], var67.field1548[var107], var67.field1548[var108], var96, var99, var102, var97, var100, var103, var98, var101, var104, var116);
                                    }
                                } else if (var116 == -1) {
                                    if (~(16777215 & var67.field1548[var106]) != -1) {
                                        arg2.method3297(var112, var113, var114, var109, var110, var111, arg5[var106], arg5[var107], arg5[var108], class199.method1338(arg8[var106] << 24 | super.field7090.field854, (byte) -77, var67.field1548[var106]), class199.method1338(super.field7090.field854 | arg8[var107] << 24, (byte) -113, var67.field1548[var107]), class199.method1338(super.field7090.field854 | arg8[var108] << 24, (byte) -77, var67.field1548[var108]));
                                    }
                                } else {
                                    arg2.method3295(var112, var113, var114, var109, var110, var111, arg5[var106], arg5[var107], arg5[var108], super.field7090.field854, arg8[var106], arg8[var107], arg8[var108], var67.field1548[var106], var67.field1548[var107], var67.field1548[var108], var96, var99, var102, var97, var100, var103, var98, var101, var104, var116);
                                }
                                arg2.field8130 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(II)V", line = 713)
    public static final void method579(int arg0, int arg1) {
        class485 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class176 var4 = class207.field3077[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class384.field5282; ++var5) {
                    for (int var6 = 0; var6 < class145.field2083; ++var6) {
                        var2 = var4.method1231(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class115.field1626;
                            int var8 = var5 << class115.field1626;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class176 var10 = class207.field3077[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1239(var6, var5) - var10.method1239(var6, var5);
                                    int var12 = var4.method1239(var6 + 1, var5) - var10.method1239(var6 + 1, var5);
                                    int var13 = var4.method1239(var6 + 1, var5 + 1) - var10.method1239(var6 + 1, var5 + 1);
                                    int var14 = var4.method1239(var6, var5 + 1) - var10.method1239(var6, var5 + 1);
                                    var10.method1241(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([II[ILgj;I[IB[I)V", line = 779)
    private final void method580(int[] arg0, int arg1, int[] arg2, class543 arg3, int arg4, int[] arg5, byte arg6, int[] arg7) {
        if (arg6 >= -14) {
            this.method584((class543) null, -79, -65, 117, 57, (int[]) null, (int[]) null, -24, 39, 112, (boolean[][]) null, 107);
        }
        ++field994;
        class4 var9 = super.field7084[arg1][arg4];
        if (var9 != null) {
            if ((var9.field34 & 2) == 0) {
                int var10 = super.field2694 * arg1;
                int var11 = super.field2694 + var10;
                int var12 = super.field2694 * arg4;
                int var13 = super.field2694 + var12;
                int var16;
                int var17;
                int var18;
                int var19;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var30;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                if (~(1 & var9.field34) != -1) {
                    int var14 = super.field7087[arg1][arg4];
                    if (~super.field7095 == 0) {
                        int var15 = super.field7091 * var14;
                        var16 = super.field7104 - -(super.field7097 * var10 + super.field7092 * var12 + var15 >> 15);
                        if (super.field7090.field845 >= var16) {
                            return;
                        }
                        var17 = (super.field7092 * var12 + super.field7097 * var11 + var15 >> 15) + super.field7104;
                        if (~var17 >= ~super.field7090.field845) {
                            return;
                        }
                        var18 = (super.field7097 * var11 + (var15 - -(super.field7092 * var13)) >> 15) + super.field7104;
                        if (~super.field7090.field845 <= ~var18) {
                            return;
                        }
                        var19 = (super.field7097 * var10 + var15 - -(super.field7092 * var13) >> 15) + super.field7104;
                        if (~super.field7090.field845 <= ~var19) {
                            return;
                        }
                    } else {
                        var19 = super.field7095;
                        var18 = super.field7095;
                        var17 = super.field7095;
                        var16 = super.field7095;
                    }
                    int var20 = super.field7083 * var14;
                    int var21 = super.field7086 * var14;
                    var22 = (super.field7089 * var12 + super.field7100 * var10 + var20 >> 15) + super.field7098;
                    var23 = super.field7096 - -(super.field7099 * var12 + (super.field7101 * var10 - -var21) >> 15);
                    var24 = super.field7090.field843 * var22 / var16 + arg3.field8131;
                    var25 = (super.field7100 * var11 + super.field7089 * var12 - -var20 >> 15) + super.field7098;
                    var26 = super.field7090.field825 * var23 / var16 + arg3.field8133;
                    var27 = super.field7090.field843 * var25 / var17 + arg3.field8131;
                    var28 = (super.field7101 * var11 - -(super.field7099 * var12) + var21 >> 15) + super.field7096;
                    int var29 = (super.field7100 * var11 + super.field7089 * var13 + var20 >> 15) + super.field7098;
                    var30 = super.field7090.field825 * var28 / var17 + arg3.field8133;
                    int var31 = super.field7096 - -(super.field7101 * var11 + var21 - -(super.field7099 * var13) >> 15);
                    var32 = super.field7090.field843 * var29 / var18 + arg3.field8131;
                    var33 = arg3.field8133 - -(super.field7090.field825 * var31 / var18);
                    var34 = super.field7098 - -(super.field7100 * var10 + var20 - -(super.field7089 * var13) >> 15);
                    var35 = super.field7090.field843 * var34 / var19 + arg3.field8131;
                    var36 = (super.field7099 * var13 + (super.field7101 * var10 - -var21) >> 15) + super.field7096;
                    var37 = super.field7090.field825 * var36 / var19 + arg3.field8133;
                } else {
                    int var38 = super.field7087[arg1][arg4];
                    int var39 = super.field7087[arg1 - -1][arg4];
                    int var40 = super.field7087[arg1 + 1][arg4 - -1];
                    int var41 = super.field7087[arg1][arg4 + 1];
                    if (~super.field7095 == 0) {
                        var16 = (super.field7092 * var12 + (super.field7097 * var10 - -(super.field7091 * var38)) >> 15) + super.field7104;
                        if (super.field7090.field845 >= var16) {
                            return;
                        }
                        var17 = (super.field7092 * var12 + super.field7097 * var11 + super.field7091 * var39 >> 15) + super.field7104;
                        if (~var17 >= ~super.field7090.field845) {
                            return;
                        }
                        var18 = super.field7104 - -(super.field7092 * var13 + super.field7097 * var11 + super.field7091 * var40 >> 15);
                        if (~super.field7090.field845 <= ~var18) {
                            return;
                        }
                        var19 = (super.field7097 * var10 + super.field7092 * var13 - -(super.field7091 * var41) >> 15) + super.field7104;
                        if (super.field7090.field845 >= var19) {
                            return;
                        }
                    } else {
                        var19 = super.field7095;
                        var18 = super.field7095;
                        var17 = super.field7095;
                        var16 = super.field7095;
                    }
                    var22 = (super.field7089 * var12 + (super.field7100 * var10 - -(super.field7083 * var38)) >> 15) + super.field7098;
                    var24 = arg3.field8131 - -(super.field7090.field843 * var22 / var16);
                    var23 = super.field7096 - -(super.field7101 * var10 + super.field7099 * var12 + super.field7086 * var38 >> 15);
                    var26 = arg3.field8133 - -(super.field7090.field825 * var23 / var16);
                    var25 = (super.field7089 * var12 + super.field7100 * var11 + super.field7083 * var39 >> 15) + super.field7098;
                    var27 = super.field7090.field843 * var25 / var17 + arg3.field8131;
                    var28 = (super.field7101 * var11 + (super.field7086 * var39 - -(super.field7099 * var12)) >> 15) + super.field7096;
                    int var42 = super.field7098 - -(super.field7089 * var13 + super.field7100 * var11 + super.field7083 * var40 >> 15);
                    var30 = super.field7090.field825 * var28 / var17 + arg3.field8133;
                    int var43 = super.field7096 - -(super.field7099 * var13 + (super.field7101 * var11 - -(super.field7086 * var40)) >> 15);
                    var32 = super.field7090.field843 * var42 / var18 + arg3.field8131;
                    var34 = (super.field7100 * var10 + super.field7089 * var13 + super.field7083 * var41 >> 15) + super.field7098;
                    var33 = super.field7090.field825 * var43 / var18 + arg3.field8133;
                    var35 = super.field7090.field843 * var34 / var19 + arg3.field8131;
                    var36 = (super.field7101 * var10 - -(super.field7086 * var41) - -(super.field7099 * var13) >> 15) + super.field7096;
                    var37 = super.field7090.field825 * var36 / var19 + arg3.field8133;
                }
                if (~((var30 - var37) * (var32 - var35) + -((-var35 + var27) * (-var37 + var33))) < -1) {
                    arg3.field8137 = var32 < 0 || ~var35 > -1 || var27 < 0 || ~arg3.field8126 > ~var32 || var35 > arg3.field8126 || var27 > arg3.field8126;
                    if (var9.field31 < 0) {
                        arg3.method3311(var33, var37, var30, var32, var35, var27, var18, var19, var17, 65535 & var9.field36, 65535 & var9.field35, 65535 & var9.field32);
                    } else {
                        if (this.method2985(super.field7090.field3092.method110(var9.field31, (byte) 107).field6646)) {
                            arg3.field8130 = 100;
                        }
                        arg3.method3301(var33, var37, var30, var32, var35, var27, var9.field36 & 65535, var9.field35 & 65535, var9.field32 & 65535, var22, var25, var34, var23, var28, var36, var16, var17, var19, var9.field31);
                        arg3.field8130 = 0;
                    }
                }
                if ((var37 - var30) * (-var27 + var24) - (var26 - var30) * (-var27 + var35) > 0) {
                    arg3.field8137 = var24 < 0 || var27 < 0 || ~var35 > -1 || arg3.field8126 < var24 || var27 > arg3.field8126 || arg3.field8126 < var35;
                    if (~var9.field31 > -1) {
                        arg3.method3311(var26, var30, var37, var24, var27, var35, var16, var17, var19, var9.field37 & 65535, var9.field32 & 65535, var9.field35 & 65535);
                        return;
                    }
                    if (this.method2985(super.field7090.field3092.method110(var9.field31, (byte) 101).field6646)) {
                        arg3.field8130 = 100;
                    }
                    arg3.method3301(var26, var30, var37, var24, var27, var35, 65535 & var9.field37, var9.field32 & 65535, var9.field35 & 65535, var22, var25, var34, var23, var28, var36, var16, var17, var19, var9.field31);
                    arg3.field8130 = 0;
                }
            }
        } else {
            class258 var44 = super.field7093[arg1][arg4];
            if (var44 != null) {
                if (~super.field7095 != 0) {
                    for (int var45 = 0; ~var45 > ~var44.field3695; ++var45) {
                        int var46 = (arg1 << super.field2695) + var44.field3684[var45];
                        short var47 = var44.field3694[var45];
                        int var48 = (arg4 << super.field2695) + var44.field3691[var45];
                        int var49 = super.field7098 - -(super.field7100 * var46 + super.field7089 * var48 + super.field7083 * var47 >> 15);
                        int var50 = (super.field7099 * var48 + super.field7101 * var46 + super.field7086 * var47 >> 15) + super.field7096;
                        arg0[var45] = arg3.field8131 - -(super.field7090.field843 * var49 / super.field7095);
                        arg5[var45] = super.field7090.field825 * var50 / super.field7095 + arg3.field8133;
                        arg7[var45] = super.field7095;
                    }
                } else {
                    for (int var51 = 0; ~var51 > ~var44.field3695; ++var51) {
                        int var91 = (arg1 << super.field2695) + var44.field3684[var51];
                        short var92 = var44.field3694[var51];
                        int var93 = (arg4 << super.field2695) + var44.field3691[var51];
                        int var94 = super.field7104 - -(super.field7097 * var91 + (super.field7091 * var92 - -(super.field7092 * var93)) >> 15);
                        if (super.field7090.field845 >= var94) {
                            return;
                        }
                        int var95 = (super.field7101 * var91 - (-(super.field7099 * var93) + -(super.field7086 * var92)) >> 15) + super.field7096;
                        int var96 = (super.field7100 * var91 + super.field7083 * var92 - -(super.field7089 * var93) >> 15) + super.field7098;
                        arg0[var51] = super.field7090.field843 * var96 / var94 + arg3.field8131;
                        arg5[var51] = super.field7090.field825 * var95 / var94 + arg3.field8133;
                        arg7[var51] = var94;
                    }
                }
                if (var44.field3683 == null) {
                    for (int var52 = 0; ~var44.field3693 < ~var52; ++var52) {
                        short var53 = var44.field3690[var52];
                        short var54 = var44.field3686[var52];
                        short var55 = var44.field3692[var52];
                        int var56 = arg0[var53];
                        int var57 = arg0[var54];
                        int var58 = arg0[var55];
                        int var59 = arg5[var53];
                        int var60 = arg5[var54];
                        int var61 = arg5[var55];
                        if ((-var57 + var56) * (-var60 + var61) + -((var59 - var60) * (-var57 + var58)) > 0) {
                            int var62 = var44.field3688[var52];
                            if (~var62 != 0) {
                                arg3.field8137 = ~var56 > -1 || var57 < 0 || ~var58 > -1 || arg3.field8126 < var56 || var57 > arg3.field8126 || arg3.field8126 < var58;
                                arg3.method3311(var59, var60, var61, var56, var57, var58, arg7[1], arg7[2], arg7[3], class588.method3495(var62, var44.field3685[var53], (byte) -114), class588.method3495(var62, var44.field3685[var54], (byte) 101), class588.method3495(var62, var44.field3685[var55], (byte) -83));
                            }
                        }
                    }
                } else {
                    int var63 = super.field7087[arg1][arg4];
                    int var64 = super.field7087[arg1 + 1][arg4];
                    int var65 = super.field7087[arg1][arg4 + 1];
                    int var66 = super.field2694 * arg1;
                    int var67 = var66 - -super.field2694;
                    int var68 = super.field2694 * arg4;
                    int var69 = super.field2694 + var68;
                    int var70 = (super.field7089 * var68 + super.field7100 * var66 + super.field7083 * var63 >> 15) + super.field7098;
                    int var71 = super.field7096 - -(super.field7099 * var68 + super.field7101 * var66 + super.field7086 * var63 >> 15);
                    int var72 = (super.field7097 * var66 + super.field7092 * var68 + super.field7091 * var63 >> 15) + super.field7104;
                    int var73 = (super.field7089 * var68 + super.field7100 * var67 + super.field7083 * var64 >> 15) + super.field7098;
                    int var74 = (super.field7099 * var68 + super.field7101 * var67 + super.field7086 * var64 >> 15) + super.field7096;
                    int var75 = (super.field7097 * var67 + super.field7091 * var64 - -(super.field7092 * var68) >> 15) + super.field7104;
                    int var76 = (super.field7089 * var69 + super.field7100 * var66 + super.field7083 * var65 >> 15) + super.field7098;
                    int var77 = (super.field7099 * var69 + (super.field7101 * var66 - -(super.field7086 * var65)) >> 15) + super.field7096;
                    int var78 = (super.field7091 * var65 + super.field7097 * var66 + super.field7092 * var69 >> 15) + super.field7104;
                    for (int var79 = 0; var44.field3693 > var79; ++var79) {
                        short var80 = var44.field3690[var79];
                        short var81 = var44.field3686[var79];
                        short var82 = var44.field3692[var79];
                        int var83 = arg0[var80];
                        int var84 = arg0[var81];
                        int var85 = arg0[var82];
                        int var86 = arg5[var80];
                        int var87 = arg5[var81];
                        int var88 = arg5[var82];
                        if ((-var84 + var83) * (-var87 + var88) + -((var86 - var87) * (-var84 + var85)) > 0) {
                            arg3.field8137 = var83 < 0 || ~var84 > -1 || ~var85 > -1 || var83 > arg3.field8126 || arg3.field8126 < var84 || ~var85 < ~arg3.field8126;
                            short var89 = var44.field3683[var79];
                            if (~var89 != 0) {
                                if (this.method2985(super.field7090.field3092.method110(var89, (byte) 108).field6646)) {
                                    arg3.field8130 = 100;
                                }
                                arg3.method3301(var86, var87, var88, var83, var84, var85, var44.field3685[var80], var44.field3685[var81], var44.field3685[var82], var70, var73, var76, var71, var74, var77, var72, var75, var78, var89);
                                arg3.field8130 = 0;
                            } else {
                                int var90 = var44.field3688[var79];
                                if (var90 != -1) {
                                    arg3.method3311(var86, var87, var88, var83, var84, var85, arg7[1], arg7[2], arg7[3], class588.method3495(var90, var44.field3685[var80], (byte) 70), class588.method3495(var90, var44.field3685[var81], (byte) -114), class588.method3495(var90, var44.field3685[var82], (byte) -96));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1158)
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field987;
        class484 var9 = (class484) super.field7090.method505(Thread.currentThread());
        class543 var10 = var9.field6902;
        var10.field8137 = false;
        var10.field8130 = 0;
        if (super.field7103 != null) {
            this.method584(var10, -13419, arg5, arg4, arg0, var9.field363, var9.field345, arg2, arg1, arg3, arg7, arg6);
        } else if (super.field7084 != null) {
            this.method582(arg5, var10, var9.field345, arg7, arg6, arg4, arg3, var9.field363, arg0, arg2, 65535, arg1);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILgj;[I[[ZIII[IIIII)V", line = 1178)
    private final void method582(int arg0, class543 arg1, int[] arg2, boolean[][] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field995;
        int var13 = (-arg5 + arg4) * arg9 / 256;
        if (arg10 == 65535) {
            arg1.field8139 = false;
            arg1.field8135 = false;
            int var14 = arg9 >> 8;
            int var15 = arg8;
            int var16 = arg11 - -var13;
            for (int var17 = arg6; ~arg0 < ~var17; ++var17) {
                for (int var18 = arg5; ~arg4 < ~var18; ++var18) {
                    if (arg3[-arg6 + var17][-arg5 + var18]) {
                        if (super.field7084[var17][var18] != null) {
                            class4 var19 = super.field7084[var17][var18];
                            if (~var19.field31 != 0 && (2 & var19.field34) == 0 && var19.field33 == -1) {
                                int var20 = super.field7090.method476(var19.field31);
                                arg1.method3311(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var15 - -var14, 0, 0, 0, class588.method3495(var20, 65535 & var19.field36, (byte) -81), class588.method3495(var20, 65535 & var19.field35, (byte) 79), class588.method3495(var20, 65535 & var19.field32, (byte) -91));
                                arg1.method3311(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class588.method3495(var20, var19.field37 & 65535, (byte) 40), class588.method3495(var20, 65535 & var19.field32, (byte) -73), class588.method3495(var20, 65535 & var19.field35, (byte) 10));
                            } else if (var19.field33 == -1) {
                                arg1.method3311(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, 65535 & var19.field36, var19.field35 & 65535, var19.field32 & 65535);
                                arg1.method3311(var16, var16, -var14 + var16, var15, var15 - -var14, var15, 0, 0, 0, var19.field37 & 65535, var19.field32 & 65535, var19.field35 & 65535);
                            } else {
                                int var21 = var19.field33;
                                arg1.method3311(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, 0, 0, 0, var21, var21, var21);
                                arg1.method3311(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, var21, var21, var21);
                            }
                        } else if (super.field7093[var17][var18] != null) {
                            class258 var22 = super.field7093[var17][var18];
                            for (int var23 = 0; var22.field3695 > var23; ++var23) {
                                arg2[var23] = var22.field3684[var23] * var14 / super.field2694 + var15;
                                arg7[var23] = -(var22.field3691[var23] * var14 / super.field2694) + var16;
                            }
                            for (int var24 = 0; var24 < var22.field3693; ++var24) {
                                short var25 = var22.field3690[var24];
                                short var26 = var22.field3686[var24];
                                short var27 = var22.field3692[var24];
                                int var28 = arg2[var25];
                                int var29 = arg2[var26];
                                int var30 = arg2[var27];
                                int var31 = arg7[var25];
                                int var32 = arg7[var26];
                                int var33 = arg7[var27];
                                if (var22.field3689 != null && var22.field3689[var24] != -1) {
                                    int var34 = var22.field3689[var24];
                                    arg1.method3311(var31, var32, var33, var28, var29, var30, 0, 0, 0, class588.method3495(var34, var22.field3685[var25], (byte) 89), class588.method3495(var34, var22.field3685[var26], (byte) -73), class588.method3495(var34, var22.field3685[var27], (byte) -89));
                                } else if (var22.field3683 != null && var22.field3683[var24] != -1) {
                                    int var35 = super.field7090.method476(var22.field3683[var24]);
                                    arg1.method3311(var31, var32, var33, var28, var29, var30, 0, 0, 0, class588.method3495(var35, var22.field3685[var25], (byte) -69), class588.method3495(var35, var22.field3685[var26], (byte) -67), class588.method3495(var35, var22.field3685[var27], (byte) 38));
                                } else {
                                    int var36 = var22.field3688[var24];
                                    arg1.method3311(var31, var32, var33, var28, var29, var30, 0, 0, 0, class588.method3495(var36, var22.field3685[var25], (byte) 83), class588.method3495(var36, var22.field3685[var26], (byte) -113), class588.method3495(var36, var22.field3685[var27], (byte) -123));
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var16 = arg11 + var13;
                var15 += var14;
            }
            arg1.field8135 = true;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V", line = 1319)
    public final void method583(int arg0, int arg1) {
        ++field990;
        class484 var3 = (class484) super.field7090.method505(Thread.currentThread());
        var3.field6902.field8130 = 0;
        if (super.field7103 != null) {
            this.method578(arg1, var3.field345, var3.field6902, 126, var3.field363, var3.field350, arg0, super.field7090.field851, var3.field381);
        } else if (super.field7084 != null) {
            this.method580(var3.field345, arg0, var3.field381, var3.field6902, arg1, var3.field363, (byte) -24, var3.field350);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lgj;IIII[I[IIII[[ZI)V", line = 1336)
    private final void method584(class543 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9, boolean[][] arg10, int arg11) {
        if (arg1 == -13419) {
            ++field992;
            int var13 = (arg11 - arg3) * arg7 / 256;
            arg0.field8139 = false;
            int var14 = arg7 >> 8;
            arg0.field8135 = false;
            int var15 = arg4;
            int var16 = arg8 + var13;
            for (int var17 = arg9; ~arg2 < ~var17; ++var17) {
                for (int var18 = arg3; arg11 > var18; ++var18) {
                    if (arg10[-arg9 + var17][-arg3 + var18]) {
                        if (super.field7103[var17][var18] != null) {
                            class225 var33 = super.field7103[var17][var18];
                            if (var33.field3255 != -1 && (2 & var33.field3250) == 0 && var33.field3251 == 0) {
                                int var34 = super.field7090.method476(var33.field3255);
                                arg0.method3311(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, class588.method3495(var34, var33.field3253, (byte) 109), class588.method3495(var34, var33.field3252, (byte) -70), class588.method3495(var34, var33.field3247, (byte) 107));
                                arg0.method3311(var16, var16, var16 - var14, var15, var14 + var15, var15, 0, 0, 0, class588.method3495(var34, var33.field3249, (byte) 125), class588.method3495(var34, var33.field3247, (byte) -104), class588.method3495(var34, var33.field3252, (byte) 44));
                            } else if (~var33.field3251 == -1) {
                                arg0.method3297(var16 - var14, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, var33.field3253, var33.field3252, var33.field3247);
                                arg0.method3297(var16, var16, -var14 + var16, var15, var15 - -var14, var15, 0, 0, 0, var33.field3249, var33.field3247, var33.field3252);
                            } else {
                                int var35 = var33.field3251;
                                arg0.method3297(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, class199.method1338(var33.field3253 & -16777216, (byte) -111, var35), class199.method1338(var33.field3252 & -16777216, (byte) -99, var35), class199.method1338(var33.field3247 & -16777216, (byte) -86, var35));
                                arg0.method3297(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class199.method1338(-16777216 & var33.field3249, (byte) -78, var35), class199.method1338(-16777216 & var33.field3247, (byte) -93, var35), class199.method1338(var33.field3252 & -16777216, (byte) -111, var35));
                            }
                        } else if (super.field7085[var17][var18] != null) {
                            class108 var19 = super.field7085[var17][var18];
                            for (int var20 = 0; ~var20 > ~var19.field1550; ++var20) {
                                arg6[var20] = var19.field1549[var20] * var14 / super.field2694 + var15;
                                arg5[var20] = -(var19.field1546[var20] * var14 / super.field2694) + var16;
                            }
                            for (int var21 = 0; ~var19.field1547 < ~var21; ++var21) {
                                int var22 = var21 * 3;
                                int var23 = var22 + 1;
                                int var24 = var23 + 1;
                                int var25 = arg6[var22];
                                int var26 = arg6[var23];
                                int var27 = arg6[var24];
                                int var28 = arg5[var22];
                                int var29 = arg5[var23];
                                int var30 = arg5[var24];
                                if (var19.field1544 != null && ~var19.field1544[var21] != -1 && (var19.field1553 == null || var19.field1553 != null && var19.field1553[var21] == -1)) {
                                    int var31 = var19.field1544[var21];
                                    arg0.method3297(var28, var29, var30, var25, var26, var27, 0, 0, 0, class199.method1338(-(var19.field1548[var22] & -16777216) + -16777216, (byte) -64, var31), class199.method1338(-(var19.field1548[var23] & -16777216) + -16777216, (byte) -122, var31), class199.method1338(-16777216 - (var19.field1548[var24] & -16777216), (byte) -66, var31));
                                } else if (var19.field1553 != null && var19.field1553[var21] != -1) {
                                    int var32 = super.field7090.method476(var19.field1553[var21]);
                                    arg0.method3311(var28, var29, var30, var25, var26, var27, 0, 0, 0, var32, var32, var32);
                                } else {
                                    arg0.method3297(var28, var29, var30, var25, var26, var27, 0, 0, 0, var19.field1548[var22], var19.field1548[var23], var19.field1548[var24]);
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var15 += var14;
                var16 = arg8 + var13;
            }
            arg0.field8135 = true;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 1477)
    public static final boolean method585(int arg0, String arg1, int arg2) {
        ++field989;
        if (~class331.field4576 != -4) {
            class286.field3993 = new class423();
            class286.field3993.field5709 = arg2;
            class286.field3993.field5719 = arg1;
            if (class577.field8514 != class186.field2781) {
                class286.field3993.field5710 = class286.field3993.field5709 + 40000;
                class286.field3993.field5711 = 50000 - -class286.field3993.field5709;
            }
            if (class348.field4775.length > arg2 && class348.field4775[arg2] != null) {
                class517.field7363 = class348.field4775[arg2].field5529;
            }
            return true;
        } else {
            String var3 = "";
            if (class577.field8514 != class186.field2781) {
                var3 = ":" + (arg2 + 7000);
            }
            String var4 = "";
            if (arg0 <= 8) {
                field993 = false;
            }
            if (class595.field8788 != null) {
                var4 = "/p=" + class595.field8788;
            }
            String var5 = "http://" + arg1 + var3 + "/l=" + class63.field795 + "/a=" + class476.field6747 + var4 + "/j" + (class192.field2854 ? "1" : "0") + ",o" + (class88.field1318 ? "1" : "0") + ",a2";
            try {
                class460.field6511.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }
}
