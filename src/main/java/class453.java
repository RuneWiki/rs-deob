import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class453 extends class543 {

    @OriginalMember(owner = "client!lda", name = "L", descriptor = "F")
    public static float field5672;

    @OriginalMember(owner = "client!lda", name = "B", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!lda", name = "D", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!lda", name = "H", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!lda", name = "I", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!lda", name = "J", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!lda", name = "K", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "([I[IZ[IIII[ILlca;)V")
    private final void method2487(int[] arg0, int[] arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, class603 arg8) {
        if (arg4 == 7861) {
            ++field5670;
            class679 var10 = super.field6850[arg6][arg5];
            if (var10 != null) {
                if (~(var10.field9246 & 2) == -1) {
                    int var11 = super.field1686 * arg6;
                    int var12 = super.field1686 + var11;
                    int var13 = super.field1686 * arg5;
                    int var14 = super.field1686 + var13;
                    int var15 = 0;
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var30;
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
                    int var45;
                    int var46;
                    if (~(1 & var10.field9246) != -1 && !arg2) {
                        int var19 = super.field6853[arg6][arg5];
                        if (~super.field6849 == 0) {
                            int var20 = super.field6844 * var19;
                            var21 = (super.field6846 * var11 + super.field6847 * var13 + var20 >> 14) + super.field6848;
                            if (~super.field6832.field7351 <= ~var21) {
                                return;
                            }
                            var22 = super.field6848 - -(super.field6847 * var13 + super.field6846 * var12 + var20 >> 14);
                            if (super.field6832.field7351 >= var22) {
                                return;
                            }
                            var23 = super.field6848 - -(super.field6846 * var12 - -(super.field6847 * var14) + var20 >> 14);
                            if (super.field6832.field7351 >= var23) {
                                return;
                            }
                            var24 = super.field6848 - -(super.field6847 * var14 + (super.field6846 * var11 - -var20) >> 14);
                            if (~super.field6832.field7351 <= ~var24) {
                                return;
                            }
                        } else {
                            var24 = super.field6849;
                            var23 = super.field6849;
                            var22 = super.field6849;
                            var21 = super.field6849;
                        }
                        if (super.field6832.field7375) {
                            int var25 = -super.field6832.field7377 + var21;
                            if (~var25 < -1) {
                                var15 = var25;
                                if (var25 > 255) {
                                    var15 = 255;
                                }
                            }
                            int var26 = -super.field6832.field7377 + var22;
                            if (var26 > 0) {
                                var16 = var26;
                                if (var26 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var27 = -super.field6832.field7377 + var23;
                            if (~var27 < -1) {
                                var17 = var27;
                                if (~var27 < -256) {
                                    var17 = 255;
                                }
                            }
                            int var28 = -super.field6832.field7377 + var24;
                            if (~var28 < -1) {
                                var18 = var28;
                                if (var28 > 255) {
                                    var18 = 255;
                                }
                            }
                        }
                        int var29 = super.field6838 * var19;
                        var30 = super.field6843 - -(super.field6836 * var11 + var29 - -(super.field6839 * var13) >> 14);
                        int var31 = super.field6842 * var19;
                        var32 = super.field6832.field7340 * var30 / var21 + arg8.field8089;
                        var33 = (super.field6852 * var11 + var31 - -(super.field6851 * var13) >> 14) + super.field6845;
                        var34 = super.field6832.field7363 * var33 / var21 + arg8.field8086;
                        var35 = (super.field6836 * var12 + super.field6839 * var13 + var29 >> 14) + super.field6843;
                        var36 = super.field6832.field7340 * var35 / var22 + arg8.field8089;
                        var37 = (super.field6852 * var12 + super.field6851 * var13 + var31 >> 14) + super.field6845;
                        var38 = (super.field6836 * var12 + var29 - -(super.field6839 * var14) >> 14) + super.field6843;
                        var39 = super.field6832.field7363 * var37 / var22 + arg8.field8086;
                        var40 = super.field6832.field7340 * var38 / var23 + arg8.field8089;
                        var41 = super.field6845 - -(super.field6852 * var12 - -(super.field6851 * var14) + var31 >> 14);
                        var42 = (super.field6836 * var11 + (var29 - -(super.field6839 * var14)) >> 14) + super.field6843;
                        var43 = super.field6832.field7363 * var41 / var23 + arg8.field8086;
                        var44 = (super.field6852 * var11 + super.field6851 * var14 + var31 >> 14) + super.field6845;
                        var45 = super.field6832.field7340 * var42 / var24 + arg8.field8089;
                        var46 = super.field6832.field7363 * var44 / var24 + arg8.field8086;
                    } else {
                        int var47 = super.field6853[arg6][arg5];
                        int var48 = super.field6853[arg6 + 1][arg5];
                        int var49 = super.field6853[arg6 - -1][arg5 + 1];
                        int var50 = super.field6853[arg6][arg5 + 1];
                        if (super.field6849 != -1) {
                            var24 = super.field6849;
                            var23 = super.field6849;
                            var22 = super.field6849;
                            var21 = super.field6849;
                        } else {
                            var21 = (super.field6844 * var47 + super.field6847 * var13 + super.field6846 * var11 >> 14) + super.field6848;
                            if (super.field6832.field7351 >= var21) {
                                return;
                            }
                            var22 = (super.field6846 * var12 - (-(super.field6844 * var48) - super.field6847 * var13) >> 14) + super.field6848;
                            if (super.field6832.field7351 >= var22) {
                                return;
                            }
                            var23 = super.field6848 - -(super.field6846 * var12 + super.field6844 * var49 - -(super.field6847 * var14) >> 14);
                            if (~var23 >= ~super.field6832.field7351) {
                                return;
                            }
                            var24 = (super.field6847 * var14 + super.field6846 * var11 - -(super.field6844 * var50) >> 14) + super.field6848;
                            if (~var24 >= ~super.field6832.field7351) {
                                return;
                            }
                        }
                        if (!arg2) {
                            if (super.field6832.field7375) {
                                int var51 = -super.field6832.field7377 + var21;
                                if (var51 > 0) {
                                    var15 = var51;
                                    if (var51 > 255) {
                                        var15 = 255;
                                    }
                                }
                                int var52 = var22 - super.field6832.field7377;
                                if (var52 > 0) {
                                    var16 = var52;
                                    if (var52 > 255) {
                                        var16 = 255;
                                    }
                                }
                                int var53 = var23 - super.field6832.field7377;
                                if (var53 > 0) {
                                    var17 = var53;
                                    if (~var53 < -256) {
                                        var17 = 255;
                                    }
                                }
                                int var54 = -super.field6832.field7377 + var24;
                                if (var54 > 0) {
                                    var18 = var54;
                                    if (~var54 < -256) {
                                        var18 = 255;
                                    }
                                }
                            }
                        } else {
                            int var55 = -super.field6832.field7377 + var21;
                            if (var55 > 255) {
                                var55 = 255;
                            }
                            if (var55 > 0) {
                                var15 = var55;
                                int var56 = var10.field9248 * var55 / 255;
                                if (var56 > 0) {
                                    var47 -= var56;
                                }
                            }
                            int var57 = var22 - super.field6832.field7377;
                            if (~var57 < -256) {
                                var57 = 255;
                            }
                            if (~var57 < -1) {
                                var16 = var57;
                                int var58 = var10.field9238 * var57 / 255;
                                if (~var58 < -1) {
                                    var48 -= var58;
                                }
                            }
                            int var59 = -super.field6832.field7377 + var23;
                            if (~var59 < -256) {
                                var59 = 255;
                            }
                            if (var59 > 0) {
                                var17 = var59;
                                int var60 = var10.field9243 * var59 / 255;
                                if (var60 > 0) {
                                    var49 -= var60;
                                }
                            }
                            int var61 = -super.field6832.field7377 + var24;
                            if (var61 > 255) {
                                var61 = 255;
                            }
                            if (var61 > 0) {
                                var18 = var61;
                                int var62 = var10.field9245 * var61 / 255;
                                if (~var62 < -1) {
                                    var50 -= var62;
                                }
                            }
                        }
                        var30 = (super.field6839 * var13 + super.field6838 * var47 + super.field6836 * var11 >> 14) + super.field6843;
                        var33 = super.field6845 - -(super.field6851 * var13 + super.field6852 * var11 + super.field6842 * var47 >> 14);
                        var32 = super.field6832.field7340 * var30 / var21 + arg8.field8089;
                        var34 = super.field6832.field7363 * var33 / var21 + arg8.field8086;
                        var35 = (super.field6838 * var48 + super.field6839 * var13 + super.field6836 * var12 >> 14) + super.field6843;
                        var36 = super.field6832.field7340 * var35 / var22 + arg8.field8089;
                        var37 = (super.field6852 * var12 - (-(super.field6851 * var13) + -(super.field6842 * var48)) >> 14) + super.field6845;
                        var39 = super.field6832.field7363 * var37 / var22 + arg8.field8086;
                        var38 = (super.field6836 * var12 + (super.field6838 * var49 - -(super.field6839 * var14)) >> 14) + super.field6843;
                        var41 = (super.field6851 * var14 + super.field6852 * var12 + super.field6842 * var49 >> 14) + super.field6845;
                        var40 = arg8.field8089 - -(super.field6832.field7340 * var38 / var23);
                        var43 = arg8.field8086 - -(super.field6832.field7363 * var41 / var23);
                        var42 = super.field6843 - -(super.field6839 * var14 + super.field6838 * var50 + super.field6836 * var11 >> 14);
                        var45 = super.field6832.field7340 * var42 / var24 + arg8.field8089;
                        var44 = (super.field6852 * var11 - (-(super.field6851 * var14) + -(super.field6842 * var50)) >> 14) + super.field6845;
                        var46 = super.field6832.field7363 * var44 / var24 + arg8.field8086;
                    }
                    boolean var63 = var10.field9239 != -1 && this.method2917(super.field6832.field8781.method2718(var10.field9239, (byte) 72).field1809);
                    int var64 = var16 - (-var17 - var18);
                    if ((-var45 + var40) * (-var46 + var39) + -((-var45 + var36) * (-var46 + var43)) > 0) {
                        arg8.field8096 = ~var40 > -1 || ~var45 > -1 || var36 < 0 || ~var40 < ~arg8.field8085 || arg8.field8085 < var45 || ~var36 < ~arg8.field8085;
                        if (~var64 <= -766) {
                            arg8.method3312(var43, var46, var39, var40, var45, var36, var23, var24, var22, super.field6832.field7372);
                        } else {
                            if (var63) {
                                arg8.field8087 = 100;
                            }
                            if (~var64 < -1) {
                                if (~var10.field9239 > -1) {
                                    arg8.method3330(var43, var46, var39, var40, var45, var36, var23, var24, var22, class232.method1402(arg4 + -3482, super.field6832.field7372 | var17 << 24, var10.field9240), class232.method1402(arg4 + -3482, super.field6832.field7372 | var18 << 24, var10.field9241), class232.method1402(arg4 ^ 4014, var16 << 24 | super.field6832.field7372, var10.field9247));
                                } else {
                                    arg8.method3317(var43, var46, var39, var40, var45, var36, var23, var24, var22, super.field6832.field7372, var17, var18, var16, var10.field9240, var10.field9241, var10.field9247, var38, var42, var35, var41, var44, var37, var23, var24, var22, var10.field9239);
                                }
                            } else if (var10.field9239 >= 0) {
                                arg8.method3316(var43, var46, var39, var40, var45, var36, var23, var24, var22, var10.field9240, var10.field9241, var10.field9247, var38, var42, var35, var41, var44, var37, var23, var24, var22, var10.field9239);
                            } else {
                                arg8.method3330(var43, var46, var39, var40, var45, var36, var23, var24, var22, var10.field9240, var10.field9241, var10.field9247);
                            }
                            arg8.field8087 = 0;
                        }
                    }
                    int var65 = var15 + var18 - -var16;
                    if ((-var36 + var32) * (-var39 + var46) + -((-var36 + var45) * (-var39 + var34)) > 0) {
                        arg8.field8096 = var32 < 0 || ~var36 > -1 || var45 < 0 || arg8.field8085 < var32 || var36 > arg8.field8085 || ~arg8.field8085 > ~var45;
                        if (~var65 > -766) {
                            if (var63) {
                                arg8.field8087 = 100;
                            }
                            if (var65 > 0) {
                                if (~var10.field9239 > -1) {
                                    arg8.method3330(var34, var39, var46, var32, var36, var45, var21, var22, var24, class232.method1402(4379, var15 << 24 | super.field6832.field7372, var10.field9242), class232.method1402(arg4 + -3482, super.field6832.field7372 | var16 << 24, var10.field9247), class232.method1402(arg4 + -3482, var18 << 24 | super.field6832.field7372, var10.field9241));
                                } else {
                                    arg8.method3317(var34, var39, var46, var32, var36, var45, var21, var22, var24, super.field6832.field7372, var15, var16, var18, var10.field9242, var10.field9247, var10.field9241, var30, var35, var42, var33, var37, var44, var21, var22, var24, var10.field9239);
                                }
                            } else if (var10.field9239 < 0) {
                                arg8.method3330(var34, var39, var46, var32, var36, var45, var21, var22, var24, var10.field9242, var10.field9247, var10.field9241);
                            } else {
                                arg8.method3316(var34, var39, var46, var32, var36, var45, var21, var22, var24, var10.field9242, var10.field9247, var10.field9241, var30, var35, var42, var33, var37, var44, var21, var22, var24, var10.field9239);
                            }
                            arg8.field8087 = 0;
                            return;
                        }
                        arg8.method3312(var34, var39, var46, var32, var36, var45, var21, var22, var24, super.field6832.field7372);
                    }
                }
            } else {
                class316 var66 = super.field6841[arg6][arg5];
                if (var66 != null) {
                    if (~super.field6849 != 0) {
                        for (int var67 = 0; ~var66.field3957 < ~var67; ++var67) {
                            int var68 = (arg6 << super.field1683) + var66.field3960[var67];
                            int var69 = var66.field3954[var67];
                            int var70 = var66.field3961[var67] - -(arg5 << super.field1683);
                            arg7[var67] = 0;
                            if (!arg2) {
                                if (super.field6832.field7375) {
                                    int var71 = -super.field6832.field7377 + super.field6849;
                                    if (var71 > 0) {
                                        arg7[var67] = var71;
                                        if (~arg7[var67] < -256) {
                                            arg7[var67] = 255;
                                        }
                                    }
                                }
                            } else {
                                int var72 = -super.field6832.field7377 + super.field6849;
                                if (~var72 < -256) {
                                    var72 = 255;
                                }
                                if (var72 > 0) {
                                    arg7[var67] = var72;
                                    int var73 = var66.field3956[var67] * var72 / 255;
                                    if (var73 > 0) {
                                        var69 -= var73;
                                    }
                                }
                            }
                            int var74 = super.field6845 - -(super.field6842 * var69 + (super.field6852 * var68 - -(super.field6851 * var70)) >> 14);
                            int var75 = super.field6843 - -(super.field6839 * var70 + super.field6838 * var69 + super.field6836 * var68 >> 14);
                            arg1[var67] = super.field6832.field7340 * var75 / super.field6849 + arg8.field8089;
                            arg0[var67] = super.field6832.field7363 * var74 / super.field6849 + arg8.field8086;
                            arg3[var67] = super.field6849;
                        }
                    } else {
                        for (int var76 = 0; ~var66.field3957 < ~var76; ++var76) {
                            int var116 = var66.field3960[var76] - -(arg6 << super.field1683);
                            int var117 = var66.field3954[var76];
                            int var118 = (arg5 << super.field1683) + var66.field3961[var76];
                            int var119 = super.field6848 - -(super.field6847 * var118 + super.field6846 * var116 + super.field6844 * var117 >> 14);
                            if (var119 <= super.field6832.field7351) {
                                return;
                            }
                            arg7[var76] = 0;
                            if (!arg2) {
                                if (super.field6832.field7375) {
                                    int var120 = var119 - super.field6832.field7377;
                                    if (var120 > 0) {
                                        arg7[var76] = var120;
                                        if (arg7[var76] > 255) {
                                            arg7[var76] = 255;
                                        }
                                    }
                                }
                            } else {
                                int var121 = -super.field6832.field7377 + var119;
                                if (var121 > 255) {
                                    var121 = 255;
                                }
                                if (var121 > 0) {
                                    arg7[var76] = var121;
                                    int var122 = var66.field3956[var76] * var121 / 255;
                                    if (var122 > 0) {
                                        var117 -= var122;
                                    }
                                }
                            }
                            int var123 = super.field6843 - -(super.field6839 * var118 + super.field6836 * var116 - -(super.field6838 * var117) >> 14);
                            int var124 = (super.field6851 * var118 + super.field6852 * var116 + super.field6842 * var117 >> 14) + super.field6845;
                            arg1[var76] = arg8.field8089 - -(super.field6832.field7340 * var123 / var119);
                            arg0[var76] = arg8.field8086 - -(super.field6832.field7363 * var124 / var119);
                            arg3[var76] = var119;
                        }
                    }
                    if (var66.field3959 != null) {
                        int var77 = super.field6853[arg6][arg5];
                        int var78 = super.field6853[arg6 + 1][arg5];
                        int var79 = super.field6853[arg6][arg5 + 1];
                        int var80 = super.field1686 * arg6;
                        int var81 = var80 - -super.field1686;
                        int var82 = super.field1686 * arg5;
                        int var83 = var82 - -super.field1686;
                        int var84 = super.field6843 - -(super.field6838 * var77 + super.field6839 * var82 + super.field6836 * var80 >> 14);
                        int var85 = (super.field6852 * var80 + super.field6851 * var82 - -(super.field6842 * var77) >> 14) + super.field6845;
                        int var86 = (super.field6844 * var77 + super.field6847 * var82 + super.field6846 * var80 >> 14) + super.field6848;
                        int var87 = (super.field6836 * var81 - (-(super.field6839 * var82) + -(super.field6838 * var78)) >> 14) + super.field6843;
                        int var88 = (super.field6851 * var82 + super.field6852 * var81 + super.field6842 * var78 >> 14) + super.field6845;
                        int var89 = (super.field6847 * var82 + (super.field6846 * var81 - -(super.field6844 * var78)) >> 14) + super.field6848;
                        int var90 = (super.field6839 * var83 + super.field6838 * var79 + super.field6836 * var80 >> 14) + super.field6843;
                        int var91 = (super.field6852 * var80 - (-(super.field6842 * var79) - super.field6851 * var83) >> 14) + super.field6845;
                        int var92 = (super.field6847 * var83 + super.field6846 * var80 + super.field6844 * var79 >> 14) + super.field6848;
                        for (int var93 = 0; ~var93 > ~var66.field3952; ++var93) {
                            int var94 = var93 * 3;
                            int var95 = var94 - -1;
                            int var96 = var95 + 1;
                            int var97 = arg1[var94];
                            int var98 = arg1[var95];
                            int var99 = arg1[var96];
                            int var100 = arg0[var94];
                            int var101 = arg0[var95];
                            int var102 = arg0[var96];
                            int var103 = arg7[var94] - -arg7[var95] - -arg7[var96];
                            if (~((-var98 + var97) * (-var101 + var102) + -((var100 - var101) * (-var98 + var99))) < -1) {
                                arg8.field8096 = var97 < 0 || var98 < 0 || var99 < 0 || ~arg8.field8085 > ~var97 || ~var98 < ~arg8.field8085 || var99 > arg8.field8085;
                                short var104 = var66.field3959[var93];
                                if (~var103 <= -766) {
                                    arg8.method3312(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], super.field6832.field7372);
                                } else {
                                    if (var104 != -1 && this.method2917(super.field6832.field8781.method2718(var104, (byte) 72).field1809)) {
                                        arg8.field8087 = 100;
                                    }
                                    if (~var103 >= -1) {
                                        if (~var104 == 0) {
                                            if (~(var66.field3958[var94] & 16777215) != -1) {
                                                arg8.method3330(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], var66.field3958[var94], var66.field3958[var95], var66.field3958[var96]);
                                            }
                                        } else {
                                            arg8.method3316(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], var66.field3958[var94], var66.field3958[var95], var66.field3958[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                        }
                                    } else if (~var104 == 0) {
                                        if (~(var66.field3958[var94] & 16777215) != -1) {
                                            arg8.method3330(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], class232.method1402(arg4 + -3482, arg7[var94] << 24 | super.field6832.field7372, var66.field3958[var94]), class232.method1402(4379, super.field6832.field7372 | arg7[var95] << 24, var66.field3958[var95]), class232.method1402(4379, arg7[var96] << 24 | super.field6832.field7372, var66.field3958[var96]));
                                        }
                                    } else {
                                        arg8.method3317(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], super.field6832.field7372, arg7[var94], arg7[var95], arg7[var96], var66.field3958[var94], var66.field3958[var95], var66.field3958[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                    }
                                    arg8.field8087 = 0;
                                }
                            }
                        }
                    } else {
                        for (int var105 = 0; ~var105 > ~var66.field3952; ++var105) {
                            int var106 = var105 * 3;
                            int var107 = var106 + 1;
                            int var108 = var107 + 1;
                            int var109 = arg1[var106];
                            int var110 = arg1[var107];
                            int var111 = arg1[var108];
                            int var112 = arg0[var106];
                            int var113 = arg0[var107];
                            int var114 = arg0[var108];
                            int var115 = arg7[var106] + arg7[var107] + arg7[var108];
                            if ((var114 - var113) * (-var110 + var109) + -((var112 - var113) * (-var110 + var111)) > 0) {
                                arg8.field8096 = var109 < 0 || var110 < 0 || ~var111 > -1 || ~var109 < ~arg8.field8085 || arg8.field8085 < var110 || arg8.field8085 < var111;
                                if (var115 >= 765) {
                                    arg8.method3312(var112, var113, var114, var109, var110, var111, arg3[var106], arg3[var107], arg3[var108], super.field6832.field7372);
                                } else if (~var115 < -1) {
                                    if ((16777215 & var66.field3958[var106]) != 0) {
                                        arg8.method3330(var112, var113, var114, var109, var110, var111, arg3[var106], arg3[var107], arg3[var108], class29.method184(var66.field3958[var106], -16322, arg7[var106], super.field6832.field7372), class29.method184(var66.field3958[var107], -16322, arg7[var107], super.field6832.field7372), class29.method184(var66.field3958[var108], -16322, arg7[var108], super.field6832.field7372));
                                    }
                                } else if (~(var66.field3958[var106] & 16777215) != -1) {
                                    arg8.method3330(var112, var113, var114, var109, var110, var111, arg3[var106], arg3[var107], arg3[var108], var66.field3958[var106], var66.field3958[var107], var66.field3958[var108]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
    public final void method186(int arg0, int arg1) {
        ++field5669;
        class231 var3 = (class231) super.field6832.method937(Thread.currentThread());
        var3.field3010.field8087 = 0;
        if (super.field6850 != null) {
            this.method2487(var3.field9337, var3.field9319, super.field6832.field7343, var3.field9326, 7861, arg1, arg0, var3.field9322, var3.field3010);
        } else if (super.field6837 != null) {
            this.method2491(arg0, var3.field3010, var3.field9337, var3.field9322, var3.field9326, var3.field9319, true, arg1);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5668;
        class231 var9 = (class231) super.field6832.method937(Thread.currentThread());
        class603 var10 = var9.field3010;
        var10.field8087 = 0;
        var10.field8096 = false;
        super.field6832.method322();
        if (super.field6850 == null) {
            if (super.field6837 != null) {
                this.method2493(arg3, arg0, arg6, arg1, var9.field9319, var10, arg5, 65535, arg7, var9.field9337, arg2, arg4);
                return;
            }
        } else {
            this.method2490(arg3, arg1, var9.field9319, (byte) -121, arg2, arg5, arg4, arg6, arg7, arg0, var10, var9.field9337);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lfca;Lki;IBILoa;)Z")
    public static final boolean method2488(class79 arg0, class663 arg1, int arg2, byte arg3, int arg4, class650 arg5) {
        ++field5664;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field9003 != null) {
            var9 = -((arg0.field1031 + arg1.field8996 + -class604.field8139) * (-class604.field8126 + class604.field8133) / (-class604.field8139 + class604.field8121)) + class604.field8133;
            var8 = class604.field8133 - (-class604.field8139 + arg0.field1031 + arg1.field9016) * (-class604.field8126 + class604.field8133) / (-class604.field8139 + class604.field8121);
            var6 = (arg0.field1025 + arg1.field8994 - class604.field8122) * (class604.field8132 - class604.field8130) / (-class604.field8122 + class604.field8119) + class604.field8130;
            var7 = (-class604.field8122 + arg1.field8995 - -arg0.field1025) * (-class604.field8130 + class604.field8132) / (class604.field8119 - class604.field8122) + class604.field8130;
        }
        class468 var10 = null;
        if (arg3 != 71) {
            field5672 = 0.55942684F;
        }
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg1.field8978 != 0) {
            if (arg0.field1022 && arg1.field9006 != -1) {
                var10 = arg1.method3689(true, 18471, arg5);
            } else {
                var10 = arg1.method3689(false, 18471, arg5);
            }
            if (var10 != null) {
                var11 = arg0.field1032 + -(1 + var10.method1552() >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg0.field1032 - -(var10.method1552() - -1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg0.field1026 + -(1 + var10.method1549() >> 1);
                if (~var13 > ~var8) {
                    var8 = var13;
                }
                var14 = arg0.field1026 - -(1 + var10.method1549() >> 1);
                if (~var9 > ~var14) {
                    var9 = var14;
                }
            }
        }
        class44 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field8993 != null) {
            var15 = class165.method1010(arg1.field8982, 24294);
            if (var15 != null) {
                var16 = class595.field7985.method122((class468[]) null, arg1.field8993, (int[]) null, (byte) 117, class208.field2474);
                int var23 = arg0.field1026;
                if (var10 != null) {
                    var17 = var23 - ((var10.method1549() >> 1) - -(var16 * var15.method268()));
                } else {
                    var17 = var23 - var16 * var15.method271() / 2;
                }
                for (int var24 = 0; ~var24 > ~var16; ++var24) {
                    String var25 = class208.field2474[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method272(var25);
                    if (~var18 > ~var26) {
                        var18 = var26;
                    }
                }
                var19 = -(var18 / 2) - -arg2 + arg0.field1032;
                var20 = arg0.field1032 - -(var18 / 2) - -arg2;
                if (~var6 < ~var19) {
                    var6 = var19;
                }
                var21 = arg4 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                var22 = arg4 + var17 - -(var16 * var15.method268());
                if (~var8 < ~var21) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (~var7 <= ~class604.field8130 && ~class604.field8132 <= ~var6 && var9 >= class604.field8126 && var8 <= class604.field8133) {
            if (arg1.field9003 != null) {
                int[] var27 = new int[arg1.field9003.length];
                for (int var28 = 0; ~(var27.length / 2) < ~var28; ++var28) {
                    int var30 = arg1.field9003[var28 * 2] + arg0.field1025;
                    int var31 = arg1.field9003[var28 * 2 + 1] + arg0.field1031;
                    var27[var28 * 2] = class604.field8130 - -((-class604.field8130 + class604.field8132) * (-class604.field8122 + var30) / (class604.field8119 - class604.field8122));
                    var27[var28 * 2 - -1] = -((var31 - class604.field8139) * (class604.field8133 - class604.field8126) / (-class604.field8139 + class604.field8121)) + class604.field8133;
                }
                class271.method1612(arg5, var27, arg1.field8984);
                for (int var29 = 0; var29 < var27.length / 2 + -1; ++var29) {
                    arg5.method3632(var27[var29 * 2], var27[var29 * 2 - -1], var27[(var29 + 1) * 2], arg1.field9005, false, var27[(var29 + 1) * 2 + 1]);
                }
                arg5.method3632(var27[var27.length + -2], var27[var27.length + -1], var27[0], arg1.field9005, false, var27[1]);
            }
            if (var10 != null) {
                if (~class647.field8756 < -1 && (class103.field1324 != -1 && ~class103.field1324 == ~arg0.field1034 || class537.field6770 != -1 && ~class537.field6770 == ~arg1.field8986)) {
                    int var32;
                    if (class671.field9179 > 50) {
                        var32 = (-class671.field9179 + 100) * 2;
                    } else {
                        var32 = class671.field9179 * 2;
                    }
                    int var33 = var32 << 24 | 16776960;
                    arg5.method3633(7 + var10.method1556() / 2, arg0.field1026, var33, true, arg0.field1032);
                    arg5.method3633(var10.method1556() / 2 - -5, arg0.field1026, var33, true, arg0.field1032);
                    arg5.method3633(3 + var10.method1556() / 2, arg0.field1026, var33, true, arg0.field1032);
                    arg5.method3633(1 + var10.method1556() / 2, arg0.field1026, var33, true, arg0.field1032);
                    arg5.method3633(var10.method1556() / 2, arg0.field1026, var33, true, arg0.field1032);
                }
                var10.method2556(arg0.field1032 - (var10.method1552() >> 1), arg0.field1026 + -(var10.method1549() >> 1));
            }
            if (arg1.field8993 != null && var15 != null) {
                class45.method277(var15, arg3 ^ 71, var16, arg5, arg0, var17, var18, arg1);
            }
            if (~arg1.field8978 != 0 || arg1.field8993 != null) {
                class549 var34 = new class549(arg0);
                var34.field6891 = var12;
                var34.field6892 = var21;
                var34.field6888 = var14;
                var34.field6882 = var13;
                var34.field6887 = var22;
                var34.field6885 = var20;
                var34.field6893 = var11;
                var34.field6894 = var19;
                class74.field986.method1904(var34, -98);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BI)Z")
    public static final boolean method2489(byte arg0, int arg1) {
        ++field5666;
        if (~arg1 != -52 && arg1 != 2 && arg1 != 13 && arg1 != 30 && ~arg1 != -48) {
            if (arg1 != 58 && ~arg1 != -1002) {
                if (arg0 != 104) {
                    method2489((byte) 38, -117);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III[[ZZ)V")
    public final void method195(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field5663;
        class538 var6 = super.field6832.field7353;
        super.field6849 = -1;
        super.field6839 = var6.field6786;
        super.field6842 = var6.field6791;
        super.field6838 = var6.field6785;
        super.field6847 = var6.field6787;
        super.field6843 = var6.field6790;
        super.field6845 = var6.field6781;
        super.field6836 = var6.field6780;
        super.field6846 = var6.field6788;
        super.field6848 = var6.field6789;
        super.field6844 = var6.field6784;
        super.field6852 = var6.field6783;
        super.field6851 = var6.field6782;
        for (int var7 = 0; arg2 + arg2 > var7; ++var7) {
            for (int var8 = 0; ~(arg2 + arg2) < ~var8; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = -arg2 + var7 + arg0;
                    int var10 = -arg2 - -var8 + arg1;
                    if (~var9 <= -1 && var9 < super.field1685 && var10 >= 0 && var10 < super.field1684) {
                        this.method186(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Llea;IIII[[I[[II)V")
    public class453(class574 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II[IBIIII[[ZILlca;[I)V")
    private final void method2490(int arg0, int arg1, int[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8, int arg9, class603 arg10, int[] arg11) {
        ++field5667;
        int var13 = (-arg6 + arg7) * arg4 / 256;
        int var14 = arg4 >> 8;
        boolean var15 = ((class475) super.field6832).field5877;
        super.field6832.method455(false);
        if (arg3 > -107) {
            field5672 = -0.9149704F;
        }
        arg10.field8092 = false;
        arg10.field8091 = false;
        int var16 = arg9;
        int var17 = arg1 + var13;
        for (int var18 = arg0; var18 < arg5; ++var18) {
            for (int var19 = arg6; ~arg7 < ~var19; ++var19) {
                if (arg8[-arg0 + var18][-arg6 + var19]) {
                    if (super.field6850[var18][var19] != null) {
                        class679 var20 = super.field6850[var18][var19];
                        if (var20.field9239 != -1 && ~(var20.field9246 & 2) == -1 && ~var20.field9244 == -1) {
                            int var21 = super.field6832.method3104(var20.field9239);
                            arg10.method3313(var17 - var14, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class497.method2710(var21, var20.field9240, 127), class497.method2710(var21, var20.field9241, 127), class497.method2710(var21, var20.field9247, 127));
                            arg10.method3313(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class497.method2710(var21, var20.field9242, 127), class497.method2710(var21, var20.field9247, 127), class497.method2710(var21, var20.field9241, 127));
                        } else if (~var20.field9244 != -1) {
                            int var22 = var20.field9244;
                            arg10.method3330(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class232.method1402(4379, -16777216 & var20.field9240, var22), class232.method1402(4379, var20.field9241 & -16777216, var22), class232.method1402(4379, var20.field9247 & -16777216, var22));
                            arg10.method3330(var17, var17, var17 - var14, var16, var16 - -var14, var16, 100, 100, 100, class232.method1402(4379, var20.field9242 & -16777216, var22), class232.method1402(4379, var20.field9247 & -16777216, var22), class232.method1402(4379, -16777216 & var20.field9241, var22));
                        } else {
                            arg10.method3330(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field9240, var20.field9241, var20.field9247);
                            arg10.method3330(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, var20.field9242, var20.field9247, var20.field9241);
                        }
                    } else if (super.field6841[var18][var19] != null) {
                        class316 var23 = super.field6841[var18][var19];
                        for (int var24 = 0; var24 < var23.field3957; ++var24) {
                            arg2[var24] = var23.field3960[var24] * var14 / super.field1686 + var16;
                            arg11[var24] = -(var23.field3961[var24] * var14 / super.field1686) + var17;
                        }
                        for (int var25 = 0; var25 < var23.field3952; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg2[var26];
                            int var30 = arg2[var27];
                            int var31 = arg2[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field3953 != null && var23.field3953[var25] != 0 && (var23.field3959 == null || var23.field3959 != null && ~var23.field3959[var25] == 0)) {
                                int var35 = var23.field3953[var25];
                                arg10.method3330(var32, var33, var34, var29, var30, var31, 100, 100, 100, class232.method1402(4379, -16777216 - (var23.field3958[var26] & -16777216), var35), class232.method1402(4379, -(var23.field3958[var27] & -16777216) + -16777216, var35), class232.method1402(4379, -(-16777216 & var23.field3958[var28]) + -16777216, var35));
                            } else if (var23.field3959 != null && var23.field3959[var25] != -1) {
                                int var36 = super.field6832.method3104(var23.field3959[var25]);
                                arg10.method3313(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg10.method3330(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field3958[var26], var23.field3958[var27], var23.field3958[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg10.field8091 = true;
        super.field6832.method455(var15);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILlca;[I[I[I[IZI)V")
    private final void method2491(int arg0, class603 arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, boolean arg6, int arg7) {
        ++field5665;
        class88 var9 = super.field6837[arg0][arg7];
        if (var9 != null) {
            if ((var9.field1139 & 2) == 0) {
                int var10 = super.field1686 * arg0;
                int var11 = super.field1686 + var10;
                int var12 = super.field1686 * arg7;
                int var13 = super.field1686 + var12;
                int var16;
                int var17;
                int var18;
                int var19;
                int var21;
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
                if ((var9.field1139 & 1) != 0) {
                    int var14 = super.field6853[arg0][arg7];
                    if (super.field6849 == -1) {
                        int var15 = super.field6844 * var14;
                        var16 = super.field6848 - -(super.field6847 * var12 + super.field6846 * var10 + var15 >> 14);
                        if (~var16 >= ~super.field6832.field7351) {
                            return;
                        }
                        var17 = super.field6848 - -(super.field6846 * var11 + var15 - -(super.field6847 * var12) >> 14);
                        if (super.field6832.field7351 >= var17) {
                            return;
                        }
                        var18 = (super.field6847 * var13 + (super.field6846 * var11 - -var15) >> 14) + super.field6848;
                        if (~var18 >= ~super.field6832.field7351) {
                            return;
                        }
                        var19 = (super.field6847 * var13 + super.field6846 * var10 + var15 >> 14) + super.field6848;
                        if (var19 <= super.field6832.field7351) {
                            return;
                        }
                    } else {
                        var19 = super.field6849;
                        var18 = super.field6849;
                        var17 = super.field6849;
                        var16 = super.field6849;
                    }
                    int var20 = super.field6838 * var14;
                    var21 = (super.field6836 * var10 - (-(super.field6839 * var12) + -var20) >> 14) + super.field6843;
                    int var22 = super.field6842 * var14;
                    var23 = super.field6832.field7340 * var21 / var16 + arg1.field8089;
                    var24 = (super.field6852 * var10 + var22 - -(super.field6851 * var12) >> 14) + super.field6845;
                    var25 = super.field6832.field7363 * var24 / var16 + arg1.field8086;
                    var26 = super.field6843 - -(super.field6839 * var12 + super.field6836 * var11 + var20 >> 14);
                    var27 = super.field6845 - -(super.field6852 * var11 + var22 - -(super.field6851 * var12) >> 14);
                    var28 = super.field6832.field7340 * var26 / var17 + arg1.field8089;
                    int var29 = (super.field6839 * var13 + super.field6836 * var11 + var20 >> 14) + super.field6843;
                    var30 = super.field6832.field7363 * var27 / var17 + arg1.field8086;
                    int var31 = (super.field6851 * var13 + super.field6852 * var11 + var22 >> 14) + super.field6845;
                    var32 = super.field6832.field7340 * var29 / var18 + arg1.field8089;
                    var33 = super.field6832.field7363 * var31 / var18 + arg1.field8086;
                    var34 = (super.field6836 * var10 + super.field6839 * var13 + var20 >> 14) + super.field6843;
                    var35 = super.field6832.field7340 * var34 / var19 + arg1.field8089;
                    var36 = (super.field6852 * var10 + super.field6851 * var13 + var22 >> 14) + super.field6845;
                    var37 = super.field6832.field7363 * var36 / var19 + arg1.field8086;
                } else {
                    int var38 = super.field6853[arg0][arg7];
                    int var39 = super.field6853[arg0 + 1][arg7];
                    int var40 = super.field6853[arg0 + 1][arg7 + 1];
                    int var41 = super.field6853[arg0][arg7 - -1];
                    if (~super.field6849 != 0) {
                        var19 = super.field6849;
                        var18 = super.field6849;
                        var17 = super.field6849;
                        var16 = super.field6849;
                    } else {
                        var16 = super.field6848 - -(super.field6847 * var12 + super.field6846 * var10 + super.field6844 * var38 >> 14);
                        if (~var16 >= ~super.field6832.field7351) {
                            return;
                        }
                        var17 = super.field6848 - -(super.field6846 * var11 + super.field6847 * var12 + super.field6844 * var39 >> 14);
                        if (var17 <= super.field6832.field7351) {
                            return;
                        }
                        var18 = (super.field6844 * var40 + super.field6847 * var13 + super.field6846 * var11 >> 14) + super.field6848;
                        if (super.field6832.field7351 >= var18) {
                            return;
                        }
                        var19 = super.field6848 - -(super.field6847 * var13 + super.field6846 * var10 + super.field6844 * var41 >> 14);
                        if (~var19 >= ~super.field6832.field7351) {
                            return;
                        }
                    }
                    var21 = (super.field6838 * var38 + super.field6839 * var12 + super.field6836 * var10 >> 14) + super.field6843;
                    var23 = super.field6832.field7340 * var21 / var16 + arg1.field8089;
                    var24 = super.field6845 - -(super.field6852 * var10 + super.field6842 * var38 - -(super.field6851 * var12) >> 14);
                    var26 = (super.field6838 * var39 + (super.field6836 * var11 - -(super.field6839 * var12)) >> 14) + super.field6843;
                    var25 = super.field6832.field7363 * var24 / var16 + arg1.field8086;
                    var27 = (super.field6852 * var11 + super.field6851 * var12 + super.field6842 * var39 >> 14) + super.field6845;
                    var28 = super.field6832.field7340 * var26 / var17 + arg1.field8089;
                    var30 = super.field6832.field7363 * var27 / var17 + arg1.field8086;
                    int var42 = super.field6843 - -(super.field6839 * var13 + super.field6838 * var40 + super.field6836 * var11 >> 14);
                    int var43 = (super.field6852 * var11 + super.field6851 * var13 + super.field6842 * var40 >> 14) + super.field6845;
                    var32 = super.field6832.field7340 * var42 / var18 + arg1.field8089;
                    var34 = super.field6843 - -(super.field6839 * var13 + super.field6838 * var41 + super.field6836 * var10 >> 14);
                    var33 = super.field6832.field7363 * var43 / var18 + arg1.field8086;
                    var36 = (super.field6842 * var41 + super.field6852 * var10 + super.field6851 * var13 >> 14) + super.field6845;
                    var35 = arg1.field8089 - -(super.field6832.field7340 * var34 / var19);
                    var37 = super.field6832.field7363 * var36 / var19 + arg1.field8086;
                }
                if (~((var32 - var35) * (-var37 + var30) + -((var33 - var37) * (-var35 + var28))) < -1) {
                    arg1.field8096 = var32 < 0 || ~var35 > -1 || var28 < 0 || arg1.field8085 < var32 || arg1.field8085 < var35 || arg1.field8085 < var28;
                    if (~var9.field1140 <= -1) {
                        if (this.method2917(super.field6832.field8781.method2718(var9.field1140, (byte) 72).field1809)) {
                            arg1.field8087 = 100;
                        }
                        arg1.method3316(var33, var37, var30, var32, var35, var28, var18, var19, var17, var9.field1143 & 65535, var9.field1138 & 65535, 65535 & var9.field1142, var21, var26, var34, var24, var27, var36, var16, var17, var19, var9.field1140);
                        arg1.field8087 = 0;
                    } else {
                        arg1.method3313(var33, var37, var30, var32, var35, var28, var18, var19, var17, var9.field1143 & 65535, var9.field1138 & 65535, var9.field1142 & 65535);
                    }
                }
                if (~((var23 - var28) * (-var30 + var37) - (var25 - var30) * (-var28 + var35)) < -1) {
                    arg1.field8096 = var23 < 0 || var28 < 0 || var35 < 0 || arg1.field8085 < var23 || ~arg1.field8085 > ~var28 || var35 > arg1.field8085;
                    if (~var9.field1140 <= -1) {
                        if (this.method2917(super.field6832.field8781.method2718(var9.field1140, (byte) 72).field1809)) {
                            arg1.field8087 = 100;
                        }
                        arg1.method3316(var25, var30, var37, var23, var28, var35, var16, var17, var19, 65535 & var9.field1141, 65535 & var9.field1142, var9.field1138 & 65535, var21, var26, var34, var24, var27, var36, var16, var17, var19, var9.field1140);
                        arg1.field8087 = 0;
                        return;
                    }
                    arg1.method3313(var25, var30, var37, var23, var28, var35, var16, var17, var19, var9.field1141 & 65535, var9.field1142 & 65535, var9.field1138 & 65535);
                }
            }
        } else {
            if (!arg6) {
                field5672 = 0.44125742F;
            }
            class166 var44 = super.field6840[arg0][arg7];
            if (var44 != null) {
                if (super.field6849 == -1) {
                    for (int var45 = 0; ~var44.field1954 < ~var45; ++var45) {
                        int var46 = var44.field1949[var45] - -(arg0 << super.field1683);
                        short var47 = var44.field1955[var45];
                        int var48 = var44.field1948[var45] - -(arg7 << super.field1683);
                        int var49 = (super.field6847 * var48 + super.field6846 * var46 + super.field6844 * var47 >> 14) + super.field6848;
                        if (var49 <= super.field6832.field7351) {
                            return;
                        }
                        int var50 = (super.field6836 * var46 + (super.field6838 * var47 - -(super.field6839 * var48)) >> 14) + super.field6843;
                        int var51 = (super.field6851 * var48 + super.field6852 * var46 + super.field6842 * var47 >> 14) + super.field6845;
                        arg5[var45] = super.field6832.field7340 * var50 / var49 + arg1.field8089;
                        arg2[var45] = super.field6832.field7363 * var51 / var49 + arg1.field8086;
                        arg4[var45] = var49;
                    }
                } else {
                    for (int var52 = 0; var52 < var44.field1954; ++var52) {
                        int var92 = (arg0 << super.field1683) + var44.field1949[var52];
                        short var93 = var44.field1955[var52];
                        int var94 = var44.field1948[var52] - -(arg7 << super.field1683);
                        int var95 = (super.field6838 * var93 + super.field6839 * var94 + super.field6836 * var92 >> 14) + super.field6843;
                        int var96 = (super.field6852 * var92 + super.field6851 * var94 + super.field6842 * var93 >> 14) + super.field6845;
                        arg5[var52] = arg1.field8089 - -(super.field6832.field7340 * var95 / super.field6849);
                        arg2[var52] = super.field6832.field7363 * var96 / super.field6849 + arg1.field8086;
                        arg4[var52] = super.field6849;
                    }
                }
                if (var44.field1945 != null) {
                    int var53 = super.field6853[arg0][arg7];
                    int var54 = super.field6853[arg0 + 1][arg7];
                    int var55 = super.field6853[arg0][arg7 + 1];
                    int var56 = super.field1686 * arg0;
                    int var57 = super.field1686 + var56;
                    int var58 = super.field1686 * arg7;
                    int var59 = super.field1686 + var58;
                    int var60 = (super.field6838 * var53 + super.field6839 * var58 + super.field6836 * var56 >> 14) + super.field6843;
                    int var61 = (super.field6852 * var56 + super.field6851 * var58 + super.field6842 * var53 >> 14) + super.field6845;
                    int var62 = (super.field6847 * var58 + (super.field6846 * var56 - -(super.field6844 * var53)) >> 14) + super.field6848;
                    int var63 = (super.field6838 * var54 + super.field6839 * var58 + super.field6836 * var57 >> 14) + super.field6843;
                    int var64 = (super.field6852 * var57 + super.field6851 * var58 + super.field6842 * var54 >> 14) + super.field6845;
                    int var65 = (super.field6846 * var57 + super.field6844 * var54 - -(super.field6847 * var58) >> 14) + super.field6848;
                    int var66 = (super.field6839 * var59 + super.field6836 * var56 - -(super.field6838 * var55) >> 14) + super.field6843;
                    int var67 = (super.field6852 * var56 + super.field6842 * var55 - -(super.field6851 * var59) >> 14) + super.field6845;
                    int var68 = (super.field6846 * var56 + super.field6847 * var59 + super.field6844 * var55 >> 14) + super.field6848;
                    for (int var69 = 0; var44.field1953 > var69; ++var69) {
                        short var70 = var44.field1950[var69];
                        short var71 = var44.field1946[var69];
                        short var72 = var44.field1943[var69];
                        int var73 = arg5[var70];
                        int var74 = arg5[var71];
                        int var75 = arg5[var72];
                        int var76 = arg2[var70];
                        int var77 = arg2[var71];
                        int var78 = arg2[var72];
                        if ((-var74 + var73) * (-var77 + var78) + -((var76 - var77) * (-var74 + var75)) > 0) {
                            arg1.field8096 = ~var73 > -1 || ~var74 > -1 || var75 < 0 || ~var73 < ~arg1.field8085 || arg1.field8085 < var74 || ~var75 < ~arg1.field8085;
                            short var79 = var44.field1945[var69];
                            if (var79 != -1) {
                                if (this.method2917(super.field6832.field8781.method2718(var79, (byte) 72).field1809)) {
                                    arg1.field8087 = 100;
                                }
                                arg1.method3316(var76, var77, var78, var73, var74, var75, arg4[var70], arg4[var71], arg4[var72], var44.field1952[var70], var44.field1952[var71], var44.field1952[var72], var60, var63, var66, var61, var64, var67, var62, var65, var68, var79);
                                arg1.field8087 = 0;
                            } else {
                                int var80 = var44.field1947[var69];
                                if (~var80 != 0) {
                                    arg1.method3313(var76, var77, var78, var73, var74, var75, arg4[var70], arg4[var71], arg4[var72], class497.method2710(var80, var44.field1952[var70], 127), class497.method2710(var80, var44.field1952[var71], 127), class497.method2710(var80, var44.field1952[var72], 127));
                                }
                            }
                        }
                    }
                } else {
                    for (int var81 = 0; ~var44.field1953 < ~var81; ++var81) {
                        short var82 = var44.field1950[var81];
                        short var83 = var44.field1946[var81];
                        short var84 = var44.field1943[var81];
                        int var85 = arg5[var82];
                        int var86 = arg5[var83];
                        int var87 = arg5[var84];
                        int var88 = arg2[var82];
                        int var89 = arg2[var83];
                        int var90 = arg2[var84];
                        if (~((var90 - var89) * (-var86 + var85) + -((var87 - var86) * (var88 - var89))) < -1) {
                            int var91 = var44.field1947[var81];
                            if (~var91 != 0) {
                                arg1.field8096 = var85 < 0 || var86 < 0 || var87 < 0 || ~arg1.field8085 > ~var85 || var86 > arg1.field8085 || var87 > arg1.field8085;
                                arg1.method3313(var88, var89, var90, var85, var86, var87, arg4[var82], arg4[var83], arg4[var84], class497.method2710(var91, var44.field1952[var82], 127), class497.method2710(var91, var44.field1952[var83], 127), class497.method2710(var91, var44.field1952[var84], 127));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2492(int arg0, int arg1, byte arg2) {
        ++field5662;
        if (arg2 != -82) {
            field5672 = 0.40554202F;
        }
        return class686.method3784(-1, arg0, arg1) & (class518.method2807(arg1, arg0, -23925) | ~(arg1 & 8192) != -1 | class197.method1152((byte) 19, arg0, arg1));
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIII[ILlca;II[[Z[III)V")
    private final void method2493(int arg0, int arg1, int arg2, int arg3, int[] arg4, class603 arg5, int arg6, int arg7, boolean[][] arg8, int[] arg9, int arg10, int arg11) {
        ++field5671;
        int var13 = (-arg11 + arg2) * arg10 / 256;
        int var14 = arg10 >> 8;
        boolean var15 = ((class475) super.field6832).field5877;
        super.field6832.method455(false);
        arg5.field8092 = false;
        arg5.field8091 = false;
        int var16 = arg1;
        if (arg7 != 65535) {
            this.method195(-4, 41, -109, (boolean[][]) null, true);
        }
        int var17 = arg3 + var13;
        for (int var18 = arg0; var18 < arg6; ++var18) {
            for (int var19 = arg11; ~var19 > ~arg2; ++var19) {
                if (arg8[var18 - arg0][-arg11 + var19]) {
                    if (super.field6837[var18][var19] != null) {
                        class88 var35 = super.field6837[var18][var19];
                        if (~var35.field1140 != 0 && ~(var35.field1139 & 2) == -1 && var35.field1137 == -1) {
                            int var36 = super.field6832.method3104(var35.field1140);
                            arg5.method3313(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class497.method2710(var36, 65535 & var35.field1143, 127), class497.method2710(var36, 65535 & var35.field1138, 127), class497.method2710(var36, 65535 & var35.field1142, 127));
                            arg5.method3313(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class497.method2710(var36, 65535 & var35.field1141, arg7 ^ 65408), class497.method2710(var36, var35.field1142 & 65535, arg7 + -65408), class497.method2710(var36, 65535 & var35.field1138, 127));
                        } else if (var35.field1137 != -1) {
                            int var37 = var35.field1137;
                            arg5.method3313(-var14 + var17, var17 - var14, var17, var16 - -var14, var16, var14 + var16, 100, 100, 100, var37, var37, var37);
                            arg5.method3313(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var37, var37, var37);
                        } else {
                            arg5.method3313(-var14 + var17, -var14 + var17, var17, var16 - -var14, var16, var16 - -var14, 100, 100, 100, 65535 & var35.field1143, 65535 & var35.field1138, 65535 & var35.field1142);
                            arg5.method3313(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, var35.field1141 & 65535, var35.field1142 & 65535, 65535 & var35.field1138);
                        }
                    } else if (super.field6840[var18][var19] != null) {
                        class166 var20 = super.field6840[var18][var19];
                        for (int var21 = 0; ~var20.field1954 < ~var21; ++var21) {
                            arg4[var21] = var20.field1949[var21] * var14 / super.field1686 + var16;
                            arg9[var21] = -(var20.field1948[var21] * var14 / super.field1686) + var17;
                        }
                        for (int var22 = 0; ~var22 > ~var20.field1953; ++var22) {
                            short var23 = var20.field1950[var22];
                            short var24 = var20.field1946[var22];
                            short var25 = var20.field1943[var22];
                            int var26 = arg4[var23];
                            int var27 = arg4[var24];
                            int var28 = arg4[var25];
                            int var29 = arg9[var23];
                            int var30 = arg9[var24];
                            int var31 = arg9[var25];
                            if (var20.field1951 != null && ~var20.field1951[var22] != 0) {
                                int var32 = var20.field1951[var22];
                                arg5.method3313(var29, var30, var31, var26, var27, var28, 100, 100, 100, class497.method2710(var32, var20.field1952[var23], 127), class497.method2710(var32, var20.field1952[var24], 127), class497.method2710(var32, var20.field1952[var25], arg7 ^ 65408));
                            } else if (var20.field1945 != null && var20.field1945[var22] != -1) {
                                int var33 = super.field6832.method3104(var20.field1945[var22]);
                                arg5.method3313(var29, var30, var31, var26, var27, var28, 100, 100, 100, class497.method2710(var33, var20.field1952[var23], 127), class497.method2710(var33, var20.field1952[var24], 127), class497.method2710(var33, var20.field1952[var25], 127));
                            } else {
                                int var34 = var20.field1947[var22];
                                arg5.method3313(var29, var30, var31, var26, var27, var28, 100, 100, 100, class497.method2710(var34, var20.field1952[var23], arg7 + -65408), class497.method2710(var34, var20.field1952[var24], arg7 + -65408), class497.method2710(var34, var20.field1952[var25], arg7 ^ 65408));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var16 += var14;
            var17 = arg3 + var13;
        }
        arg5.field8091 = true;
        super.field6832.method455(var15);
    }
}
