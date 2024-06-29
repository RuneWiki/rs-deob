import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class586 extends class644 {

    @OriginalMember(owner = "client!go", name = "P", descriptor = "Lcu;")
    public static class206 field7770 = new class206(80, 0);

    @OriginalMember(owner = "client!go", name = "R", descriptor = "Lcu;")
    public static class206 field7772 = new class206(5, 6);

    @OriginalMember(owner = "client!go", name = "S", descriptor = "Lnea;")
    public static class670 field7773 = new class670();

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    public static int field7775 = 0;

    @OriginalMember(owner = "client!go", name = "V", descriptor = "I")
    public static int field7776 = 0;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "Ljava/lang/Object;")
    public static Object field7774;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "[J")
    public static long[] field7771;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II[I[I[IIZLgh;[I)V", line = 3)
    private final void method3221(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, boolean arg6, class514 arg7, int[] arg8) {
        ++field7763;
        class610 var10 = super.field8651[arg1][arg0];
        if (var10 != null) {
            if ((2 & var10.field8052) == 0) {
                int var11 = super.field2250 * arg1;
                int var12 = super.field2250 + var11;
                int var13 = super.field2250 * arg0;
                int var14 = super.field2250 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var21;
                int var22;
                int var23;
                int var24;
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
                int var45;
                int var46;
                if (~(var10.field8052 & 1) != -1 && !arg6) {
                    int var19 = super.field8647[arg1][arg0];
                    if (~super.field8634 == 0) {
                        int var20 = super.field8637 * var19;
                        var21 = (super.field8640 * var11 - (-(super.field8638 * var13) + -var20) >> 14) + super.field8653;
                        if (~var21 >= ~super.field8648.field5982) {
                            return;
                        }
                        var22 = (super.field8640 * var12 - -(super.field8638 * var13) + var20 >> 14) + super.field8653;
                        if (var22 <= super.field8648.field5982) {
                            return;
                        }
                        var23 = (super.field8640 * var12 + super.field8638 * var14 + var20 >> 14) + super.field8653;
                        if (~var23 >= ~super.field8648.field5982) {
                            return;
                        }
                        var24 = (super.field8640 * var11 - (-var20 - super.field8638 * var14) >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var24) {
                            return;
                        }
                    } else {
                        var24 = super.field8634;
                        var23 = super.field8634;
                        var22 = super.field8634;
                        var21 = super.field8634;
                    }
                    if (super.field8648.field5998) {
                        int var25 = -super.field8648.field6006 + var21;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field8648.field6006 + var22;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (~var26 < -256) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field8648.field6006 + var23;
                        if (var27 > 0) {
                            var17 = var27;
                            if (~var27 < -256) {
                                var17 = 255;
                            }
                        }
                        int var28 = -super.field8648.field6006 + var24;
                        if (~var28 < -1) {
                            var18 = var28;
                            if (~var28 < -256) {
                                var18 = 255;
                            }
                        }
                    }
                    int var29 = super.field8635 * var19;
                    int var30 = super.field8652 * var19;
                    var31 = super.field8654 - -(super.field8650 * var13 + super.field8649 * var11 + var29 >> 14);
                    var32 = super.field8641 - -(super.field8642 * var13 + super.field8655 * var11 + var30 >> 14);
                    var33 = super.field8648.field6017 * var31 / var21 + arg7.field6860;
                    var34 = super.field8648.field6009 * var32 / var21 + arg7.field6858;
                    var35 = super.field8654 - -(super.field8649 * var12 + var29 - -(super.field8650 * var13) >> 14);
                    var36 = super.field8641 - -(super.field8642 * var13 + (super.field8655 * var12 - -var30) >> 14);
                    var37 = super.field8648.field6017 * var35 / var22 + arg7.field6860;
                    var38 = (super.field8650 * var14 + (super.field8649 * var12 - -var29) >> 14) + super.field8654;
                    var39 = arg7.field6858 - -(super.field8648.field6009 * var36 / var22);
                    var40 = (super.field8642 * var14 + super.field8655 * var12 + var30 >> 14) + super.field8641;
                    var41 = arg7.field6860 - -(super.field8648.field6017 * var38 / var23);
                    var42 = (super.field8650 * var14 + super.field8649 * var11 + var29 >> 14) + super.field8654;
                    var43 = super.field8648.field6009 * var40 / var23 + arg7.field6858;
                    var44 = super.field8648.field6017 * var42 / var24 + arg7.field6860;
                    var45 = (super.field8642 * var14 + (super.field8655 * var11 - -var30) >> 14) + super.field8641;
                    var46 = arg7.field6858 - -(super.field8648.field6009 * var45 / var24);
                } else {
                    int var47 = super.field8647[arg1][arg0];
                    int var48 = super.field8647[arg1 + 1][arg0];
                    int var49 = super.field8647[arg1 - -1][arg0 - -1];
                    int var50 = super.field8647[arg1][arg0 + 1];
                    if (super.field8634 == -1) {
                        var21 = (super.field8637 * var47 + super.field8640 * var11 + super.field8638 * var13 >> 14) + super.field8653;
                        if (super.field8648.field5982 >= var21) {
                            return;
                        }
                        var22 = super.field8653 - -(super.field8638 * var13 + super.field8640 * var12 + super.field8637 * var48 >> 14);
                        if (~super.field8648.field5982 <= ~var22) {
                            return;
                        }
                        var23 = (super.field8640 * var12 + super.field8637 * var49 - -(super.field8638 * var14) >> 14) + super.field8653;
                        if (var23 <= super.field8648.field5982) {
                            return;
                        }
                        var24 = (super.field8637 * var50 + super.field8640 * var11 + super.field8638 * var14 >> 14) + super.field8653;
                        if (var24 <= super.field8648.field5982) {
                            return;
                        }
                    } else {
                        var24 = super.field8634;
                        var23 = super.field8634;
                        var22 = super.field8634;
                        var21 = super.field8634;
                    }
                    if (arg6) {
                        int var51 = -super.field8648.field6006 + var21;
                        if (~var51 < -256) {
                            var51 = 255;
                        }
                        if (~var51 < -1) {
                            var15 = var51;
                            int var52 = var10.field8060 * var51 / 255;
                            if (~var52 < -1) {
                                var47 -= var52;
                            }
                        }
                        int var53 = -super.field8648.field6006 + var22;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (~var53 < -1) {
                            var16 = var53;
                            int var54 = var10.field8057 * var53 / 255;
                            if (~var54 < -1) {
                                var48 -= var54;
                            }
                        }
                        int var55 = -super.field8648.field6006 + var23;
                        if (~var55 < -256) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field8059 * var55 / 255;
                            if (~var56 < -1) {
                                var49 -= var56;
                            }
                        }
                        int var57 = var24 - super.field8648.field6006;
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (~var57 < -1) {
                            var18 = var57;
                            int var58 = var10.field8056 * var57 / 255;
                            if (~var58 < -1) {
                                var50 -= var58;
                            }
                        }
                    } else if (super.field8648.field5998) {
                        int var59 = -super.field8648.field6006 + var21;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = -super.field8648.field6006 + var22;
                        if (~var60 < -1) {
                            var16 = var60;
                            if (~var60 < -256) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field8648.field6006 + var23;
                        if (var61 > 0) {
                            var17 = var61;
                            if (~var61 < -256) {
                                var17 = 255;
                            }
                        }
                        int var62 = -super.field8648.field6006 + var24;
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    var31 = super.field8654 - -(super.field8650 * var13 + super.field8649 * var11 + super.field8635 * var47 >> 14);
                    var33 = super.field8648.field6017 * var31 / var21 + arg7.field6860;
                    var32 = (super.field8642 * var13 + super.field8655 * var11 + super.field8652 * var47 >> 14) + super.field8641;
                    var35 = (super.field8649 * var12 + super.field8650 * var13 + super.field8635 * var48 >> 14) + super.field8654;
                    var34 = super.field8648.field6009 * var32 / var21 + arg7.field6858;
                    var36 = (super.field8655 * var12 + super.field8652 * var48 + super.field8642 * var13 >> 14) + super.field8641;
                    var37 = super.field8648.field6017 * var35 / var22 + arg7.field6860;
                    var38 = super.field8654 - -(super.field8635 * var49 + super.field8650 * var14 + super.field8649 * var12 >> 14);
                    var39 = super.field8648.field6009 * var36 / var22 + arg7.field6858;
                    var41 = arg7.field6860 - -(super.field8648.field6017 * var38 / var23);
                    var40 = super.field8641 - -(super.field8655 * var12 + super.field8642 * var14 - -(super.field8652 * var49) >> 14);
                    var43 = arg7.field6858 - -(super.field8648.field6009 * var40 / var23);
                    var42 = (super.field8649 * var11 - (-(super.field8635 * var50) - super.field8650 * var14) >> 14) + super.field8654;
                    var44 = super.field8648.field6017 * var42 / var24 + arg7.field6860;
                    var45 = (super.field8655 * var11 + super.field8652 * var50 + super.field8642 * var14 >> 14) + super.field8641;
                    var46 = arg7.field6858 - -(super.field8648.field6009 * var45 / var24);
                }
                boolean var63 = ~var10.field8061 != 0 && this.method3538(super.field8648.field8808.method2760(var10.field8061, arg5 + 15097).field4937);
                int var64 = var16 + var18 + var17;
                if ((var41 - var44) * (-var46 + var39) + -((-var44 + var37) * (-var46 + var43)) > 0) {
                    arg7.field6867 = ~var41 > -1 || var44 < 0 || ~var37 > -1 || ~var41 < ~arg7.field6870 || arg7.field6870 < var44 || arg7.field6870 < var37;
                    if (var64 >= 765) {
                        arg7.method2866(var43, var46, var39, var41, var44, var37, var23, var24, var22, super.field8648.field5987);
                    } else {
                        if (var63) {
                            arg7.field6866 = 100;
                        }
                        if (var64 > 0) {
                            if (~var10.field8061 <= -1) {
                                arg7.method2858(var43, var46, var39, var41, var44, var37, var23, var24, var22, super.field8648.field5987, var17, var18, var16, var10.field8054, var10.field8055, var10.field8058, var38, var42, var35, var40, var45, var36, var23, var24, var22, var10.field8061);
                            } else {
                                arg7.method2860(var43, var46, var39, var41, var44, var37, var23, var24, var22, class64.method513(var17 << 24 | super.field8648.field5987, (byte) -62, var10.field8054), class64.method513(super.field8648.field5987 | var18 << 24, (byte) -124, var10.field8055), class64.method513(super.field8648.field5987 | var16 << 24, (byte) -127, var10.field8058));
                            }
                        } else if (~var10.field8061 <= -1) {
                            arg7.method2869(var43, var46, var39, var41, var44, var37, var23, var24, var22, var10.field8054, var10.field8055, var10.field8058, var38, var42, var35, var40, var45, var36, var23, var24, var22, var10.field8061);
                        } else {
                            arg7.method2860(var43, var46, var39, var41, var44, var37, var23, var24, var22, var10.field8054, var10.field8055, var10.field8058);
                        }
                        arg7.field6866 = 0;
                    }
                }
                int var65 = var16 + var18 + var15;
                if (~((-var37 + var33) * (-var39 + var46) + -((var44 - var37) * (-var39 + var34))) < -1) {
                    arg7.field6867 = var33 < 0 || ~var37 > -1 || ~var44 > -1 || ~var33 < ~arg7.field6870 || ~arg7.field6870 > ~var37 || ~arg7.field6870 > ~var44;
                    if (~var65 <= -766) {
                        arg7.method2866(var34, var39, var46, var33, var37, var44, var21, var22, var24, super.field8648.field5987);
                        return;
                    }
                    if (var63) {
                        arg7.field6866 = 100;
                    }
                    if (var65 <= 0) {
                        if (var10.field8061 >= 0) {
                            arg7.method2869(var34, var39, var46, var33, var37, var44, var21, var22, var24, var10.field8053, var10.field8058, var10.field8055, var31, var35, var42, var32, var36, var45, var21, var22, var24, var10.field8061);
                        } else {
                            arg7.method2860(var34, var39, var46, var33, var37, var44, var21, var22, var24, var10.field8053, var10.field8058, var10.field8055);
                        }
                    } else if (~var10.field8061 > -1) {
                        arg7.method2860(var34, var39, var46, var33, var37, var44, var21, var22, var24, class64.method513(var15 << 24 | super.field8648.field5987, (byte) -63, var10.field8053), class64.method513(var16 << 24 | super.field8648.field5987, (byte) -93, var10.field8058), class64.method513(var18 << 24 | super.field8648.field5987, (byte) -59, var10.field8055));
                    } else {
                        arg7.method2858(var34, var39, var46, var33, var37, var44, var21, var22, var24, super.field8648.field5987, var15, var16, var18, var10.field8053, var10.field8058, var10.field8055, var31, var35, var42, var32, var36, var45, var21, var22, var24, var10.field8061);
                    }
                    arg7.field6866 = 0;
                }
            }
        } else {
            if (arg5 != 6254) {
                this.method3226((int[]) null, -77, (int[]) null, (byte) 96, (int[]) null, 0, (class514) null, (int[]) null);
            }
            class323 var66 = super.field8644[arg1][arg0];
            if (var66 != null) {
                if (~super.field8634 != 0) {
                    for (int var67 = 0; var66.field4496 > var67; ++var67) {
                        int var68 = var66.field4494[var67] - -(arg1 << super.field2245);
                        int var69 = var66.field4497[var67];
                        int var70 = (arg0 << super.field2245) + var66.field4488[var67];
                        arg4[var67] = 0;
                        if (arg6) {
                            int var71 = -super.field8648.field6006 + super.field8634;
                            if (var71 > 255) {
                                var71 = 255;
                            }
                            if (~var71 < -1) {
                                arg4[var67] = var71;
                                int var72 = var66.field4491[var67] * var71 / 255;
                                if (var72 > 0) {
                                    var69 -= var72;
                                }
                            }
                        } else if (super.field8648.field5998) {
                            int var73 = -super.field8648.field6006 + super.field8634;
                            if (~var73 < -1) {
                                arg4[var67] = var73;
                                if (arg4[var67] > 255) {
                                    arg4[var67] = 255;
                                }
                            }
                        }
                        int var74 = (super.field8649 * var68 + super.field8635 * var69 - -(super.field8650 * var70) >> 14) + super.field8654;
                        int var75 = super.field8641 - -(super.field8655 * var68 + super.field8652 * var69 - -(super.field8642 * var70) >> 14);
                        arg8[var67] = super.field8648.field6017 * var74 / super.field8634 + arg7.field6860;
                        arg2[var67] = super.field8648.field6009 * var75 / super.field8634 + arg7.field6858;
                        arg3[var67] = super.field8634;
                    }
                } else {
                    for (int var76 = 0; ~var76 > ~var66.field4496; ++var76) {
                        int var116 = (arg1 << super.field2245) + var66.field4494[var76];
                        int var117 = var66.field4497[var76];
                        int var118 = (arg0 << super.field2245) + var66.field4488[var76];
                        int var119 = (super.field8638 * var118 + super.field8640 * var116 + super.field8637 * var117 >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var119) {
                            return;
                        }
                        arg4[var76] = 0;
                        if (!arg6) {
                            if (super.field8648.field5998) {
                                int var120 = -super.field8648.field6006 + var119;
                                if (var120 > 0) {
                                    arg4[var76] = var120;
                                    if (arg4[var76] > 255) {
                                        arg4[var76] = 255;
                                    }
                                }
                            }
                        } else {
                            int var121 = -super.field8648.field6006 + var119;
                            if (~var121 < -256) {
                                var121 = 255;
                            }
                            if (var121 > 0) {
                                arg4[var76] = var121;
                                int var122 = var66.field4491[var76] * var121 / 255;
                                if (var122 > 0) {
                                    var117 -= var122;
                                }
                            }
                        }
                        int var123 = super.field8641 - -(super.field8655 * var116 - (-(super.field8652 * var117) - super.field8642 * var118) >> 14);
                        int var124 = (super.field8635 * var117 + super.field8650 * var118 + super.field8649 * var116 >> 14) + super.field8654;
                        arg8[var76] = arg7.field6860 - -(super.field8648.field6017 * var124 / var119);
                        arg2[var76] = super.field8648.field6009 * var123 / var119 + arg7.field6858;
                        arg3[var76] = var119;
                    }
                }
                if (var66.field4490 != null) {
                    int var77 = super.field8647[arg1][arg0];
                    int var78 = super.field8647[arg1 + 1][arg0];
                    int var79 = super.field8647[arg1][arg0 + 1];
                    int var80 = super.field2250 * arg1;
                    int var81 = super.field2250 + var80;
                    int var82 = super.field2250 * arg0;
                    int var83 = super.field2250 + var82;
                    int var84 = (super.field8650 * var82 + super.field8649 * var80 + super.field8635 * var77 >> 14) + super.field8654;
                    int var85 = (super.field8655 * var80 + super.field8652 * var77 + super.field8642 * var82 >> 14) + super.field8641;
                    int var86 = (super.field8638 * var82 + (super.field8640 * var80 - -(super.field8637 * var77)) >> 14) + super.field8653;
                    int var87 = (super.field8650 * var82 + super.field8649 * var81 + super.field8635 * var78 >> 14) + super.field8654;
                    int var88 = (super.field8655 * var81 + super.field8652 * var78 + super.field8642 * var82 >> 14) + super.field8641;
                    int var89 = super.field8653 - -(super.field8637 * var78 + super.field8640 * var81 + super.field8638 * var82 >> 14);
                    int var90 = (super.field8635 * var79 + (super.field8649 * var80 - -(super.field8650 * var83)) >> 14) + super.field8654;
                    int var91 = (super.field8642 * var83 + super.field8655 * var80 + super.field8652 * var79 >> 14) + super.field8641;
                    int var92 = (super.field8640 * var80 + super.field8637 * var79 - -(super.field8638 * var83) >> 14) + super.field8653;
                    for (int var93 = 0; ~var66.field4489 < ~var93; ++var93) {
                        int var94 = var93 * 3;
                        int var95 = var94 + 1;
                        int var96 = var95 + 1;
                        int var97 = arg8[var94];
                        int var98 = arg8[var95];
                        int var99 = arg8[var96];
                        int var100 = arg2[var94];
                        int var101 = arg2[var95];
                        int var102 = arg2[var96];
                        int var103 = arg4[var94] - (-arg4[var95] + -arg4[var96]);
                        if ((-var98 + var97) * (-var101 + var102) + -((var100 - var101) * (-var98 + var99)) > 0) {
                            arg7.field6867 = var97 < 0 || ~var98 > -1 || ~var99 > -1 || var97 > arg7.field6870 || var98 > arg7.field6870 || var99 > arg7.field6870;
                            short var104 = var66.field4490[var93];
                            if (~var103 <= -766) {
                                arg7.method2866(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], super.field8648.field5987);
                            } else {
                                if (~var104 != 0 && this.method3538(super.field8648.field8808.method2760(var104, 21351).field4937)) {
                                    arg7.field6866 = 100;
                                }
                                if (~var103 < -1) {
                                    if (~var104 == 0) {
                                        if ((16777215 & var66.field4493[var94]) != 0) {
                                            arg7.method2860(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], class64.method513(arg4[var94] << 24 | super.field8648.field5987, (byte) -74, var66.field4493[var94]), class64.method513(super.field8648.field5987 | arg4[var95] << 24, (byte) -104, var66.field4493[var95]), class64.method513(super.field8648.field5987 | arg4[var96] << 24, (byte) -68, var66.field4493[var96]));
                                        }
                                    } else {
                                        arg7.method2858(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], super.field8648.field5987, arg4[var94], arg4[var95], arg4[var96], var66.field4493[var94], var66.field4493[var95], var66.field4493[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                    }
                                } else if (var104 == -1) {
                                    if (~(16777215 & var66.field4493[var94]) != -1) {
                                        arg7.method2860(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], var66.field4493[var94], var66.field4493[var95], var66.field4493[var96]);
                                    }
                                } else {
                                    arg7.method2869(var100, var101, var102, var97, var98, var99, arg3[var94], arg3[var95], arg3[var96], var66.field4493[var94], var66.field4493[var95], var66.field4493[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                }
                                arg7.field6866 = 0;
                            }
                        }
                    }
                } else {
                    for (int var105 = 0; var66.field4489 > var105; ++var105) {
                        int var106 = var105 * 3;
                        int var107 = var106 + 1;
                        int var108 = var107 + 1;
                        int var109 = arg8[var106];
                        int var110 = arg8[var107];
                        int var111 = arg8[var108];
                        int var112 = arg2[var106];
                        int var113 = arg2[var107];
                        int var114 = arg2[var108];
                        int var115 = arg4[var106] + arg4[var107] + arg4[var108];
                        if (~((-var110 + var109) * (-var113 + var114) + -((var111 - var110) * (-var113 + var112))) < -1) {
                            arg7.field6867 = var109 < 0 || ~var110 > -1 || var111 < 0 || var109 > arg7.field6870 || arg7.field6870 < var110 || ~var111 < ~arg7.field6870;
                            if (var115 < 765) {
                                if (var115 <= 0) {
                                    if (~(var66.field4493[var106] & 16777215) != -1) {
                                        arg7.method2860(var112, var113, var114, var109, var110, var111, arg3[var106], arg3[var107], arg3[var108], var66.field4493[var106], var66.field4493[var107], var66.field4493[var108]);
                                    }
                                } else if (~(16777215 & var66.field4493[var106]) != -1) {
                                    arg7.method2860(var112, var113, var114, var109, var110, var111, arg3[var106], arg3[var107], arg3[var108], class226.method1420(var66.field4493[var106], true, arg4[var106], super.field8648.field5987), class226.method1420(var66.field4493[var107], true, arg4[var107], super.field8648.field5987), class226.method1420(var66.field4493[var108], true, arg4[var108], super.field8648.field5987));
                                }
                            } else {
                                arg7.method2866(var112, var113, var114, var109, var110, var111, arg3[var106], arg3[var107], arg3[var108], super.field8648.field5987);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III[[ZZ)V", line = 686)
    public final void method201(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field7768;
        super.field8634 = -1;
        class496 var6 = super.field8648.field5984;
        super.field8640 = var6.field6667;
        super.field8654 = var6.field6664;
        super.field8649 = var6.field6661;
        super.field8652 = var6.field6659;
        super.field8637 = var6.field6666;
        super.field8655 = var6.field6663;
        super.field8638 = var6.field6665;
        super.field8650 = var6.field6668;
        super.field8641 = var6.field6660;
        super.field8642 = var6.field6658;
        super.field8635 = var6.field6657;
        super.field8653 = var6.field6662;
        for (int var7 = 0; ~(arg2 + arg2) < ~var7; ++var7) {
            for (int var8 = 0; arg2 + arg2 > var8; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = -arg2 + arg0 - -var7;
                    int var10 = -arg2 + var8 + arg1;
                    if (~var9 <= -1 && ~var9 > ~super.field2247 && ~var10 <= -1 && ~super.field2248 < ~var10) {
                        this.method18(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(JJ)J", line = 738)
    public static long method3222(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II[[Z[IIILgh;IBII[I)V", line = 745)
    private final void method3223(int arg0, int arg1, boolean[][] arg2, int[] arg3, int arg4, int arg5, class514 arg6, int arg7, byte arg8, int arg9, int arg10, int[] arg11) {
        ++field7764;
        if (arg8 > -60) {
            field7770 = null;
        }
        int var13 = (-arg1 + arg9) * arg5 / 256;
        int var14 = arg5 >> 8;
        boolean var15 = ((class667) super.field8648).field9463;
        super.field8648.method407(false);
        arg6.field6868 = false;
        arg6.field6864 = false;
        int var16 = arg10;
        int var17 = arg4 - -var13;
        for (int var18 = arg0; arg7 > var18; ++var18) {
            for (int var19 = arg1; ~arg9 < ~var19; ++var19) {
                if (arg2[-arg0 + var18][-arg1 + var19]) {
                    if (super.field8651[var18][var19] != null) {
                        class610 var34 = super.field8651[var18][var19];
                        if (~var34.field8061 != 0 && (2 & var34.field8052) == 0 && var34.field8051 == 0) {
                            int var35 = super.field8648.method2488(var34.field8061);
                            arg6.method2863(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var16 - -var14, 100, 100, 100, class329.method1963(var34.field8054, -680993689, var35), class329.method1963(var34.field8055, -680993689, var35), class329.method1963(var34.field8058, -680993689, var35));
                            arg6.method2863(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class329.method1963(var34.field8053, -680993689, var35), class329.method1963(var34.field8058, -680993689, var35), class329.method1963(var34.field8055, -680993689, var35));
                        } else if (~var34.field8051 != -1) {
                            int var36 = var34.field8051;
                            arg6.method2860(-var14 + var17, var17 - var14, var17, var14 + var16, var16, var16 - -var14, 100, 100, 100, class64.method513(var34.field8054 & -16777216, (byte) -125, var36), class64.method513(-16777216 & var34.field8055, (byte) -106, var36), class64.method513(var34.field8058 & -16777216, (byte) -64, var36));
                            arg6.method2860(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class64.method513(var34.field8053 & -16777216, (byte) -126, var36), class64.method513(-16777216 & var34.field8058, (byte) -111, var36), class64.method513(var34.field8055 & -16777216, (byte) -114, var36));
                        } else {
                            arg6.method2860(-var14 + var17, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var34.field8054, var34.field8055, var34.field8058);
                            arg6.method2860(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, var34.field8053, var34.field8058, var34.field8055);
                        }
                    } else if (super.field8644[var18][var19] != null) {
                        class323 var20 = super.field8644[var18][var19];
                        for (int var21 = 0; var21 < var20.field4496; ++var21) {
                            arg11[var21] = var20.field4494[var21] * var14 / super.field2250 + var16;
                            arg3[var21] = var17 - var20.field4488[var21] * var14 / super.field2250;
                        }
                        for (int var22 = 0; ~var20.field4489 < ~var22; ++var22) {
                            int var23 = var22 * 3;
                            int var24 = var23 + 1;
                            int var25 = var24 + 1;
                            int var26 = arg11[var23];
                            int var27 = arg11[var24];
                            int var28 = arg11[var25];
                            int var29 = arg3[var23];
                            int var30 = arg3[var24];
                            int var31 = arg3[var25];
                            if (var20.field4492 != null && ~var20.field4492[var22] != -1 && (var20.field4490 == null || var20.field4490 != null && ~var20.field4490[var22] == 0)) {
                                int var32 = var20.field4492[var22];
                                arg6.method2860(var29, var30, var31, var26, var27, var28, 100, 100, 100, class64.method513(-16777216 - (var20.field4493[var23] & -16777216), (byte) -127, var32), class64.method513(-(-16777216 & var20.field4493[var24]) + -16777216, (byte) -103, var32), class64.method513(-(-16777216 & var20.field4493[var25]) + -16777216, (byte) -111, var32));
                            } else if (var20.field4490 != null && ~var20.field4490[var22] != 0) {
                                int var33 = super.field8648.method2488(var20.field4490[var22]);
                                arg6.method2863(var29, var30, var31, var26, var27, var28, 100, 100, 100, var33, var33, var33);
                            } else {
                                arg6.method2860(var29, var30, var31, var26, var27, var28, 100, 100, 100, var20.field4493[var23], var20.field4493[var24], var20.field4493[var25]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var16 += var14;
            var17 = arg4 - -var13;
        }
        arg6.field6864 = true;
        super.field8648.method407(var15);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI[B)[B", line = 888)
    public static final byte[] method3224(byte arg0, int arg1, byte[] arg2) {
        ++field7766;
        int var3 = -65 / ((arg0 - -64) / 33);
        byte[] var4 = new byte[arg1];
        class83.method686(arg2, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lqe;IIII[[I[[II)V", line = 903)
    public class586(class437 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()V", line = 908)
    public static final void method3225() {
        for (int var0 = 0; var0 < class155.field2440; ++var0) {
            class641 var1 = class677.field9570[var0];
            class56.method367(var1);
            class677.field9570[var0] = null;
        }
        class155.field2440 = 0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIII[[Z)V", line = 921)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7769;
        class205 var9 = (class205) super.field8648.method2478(Thread.currentThread());
        class514 var10 = var9.field2964;
        var10.field6866 = 0;
        var10.field6867 = false;
        super.field8648.method38();
        if (super.field8651 == null) {
            if (super.field8646 != null) {
                this.method3227(arg5, var10, arg7, arg4, 120, var9.field3844, arg0, arg6, arg2, var9.field3830, arg1, arg3);
                return;
            }
        } else {
            this.method3223(arg3, arg4, arg7, var9.field3844, arg1, arg2, var10, arg5, (byte) -70, arg6, arg0, var9.field3830);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([II[IB[IILgh;[I)V", line = 945)
    private final void method3226(int[] arg0, int arg1, int[] arg2, byte arg3, int[] arg4, int arg5, class514 arg6, int[] arg7) {
        int var9 = 69 % ((arg3 - 5) / 63);
        ++field7761;
        class40 var10 = super.field8646[arg5][arg1];
        if (var10 != null) {
            if ((2 & var10.field592) == 0) {
                int var11 = super.field2250 * arg5;
                int var12 = super.field2250 + var11;
                int var13 = super.field2250 * arg1;
                int var14 = super.field2250 + var13;
                int var16;
                int var17;
                int var18;
                int var19;
                int var22;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var29;
                int var30;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                if ((1 & var10.field592) != 0) {
                    int var15 = super.field8647[arg5][arg1];
                    if (~super.field8634 != 0) {
                        var16 = super.field8634;
                        var17 = super.field8634;
                        var18 = super.field8634;
                        var19 = super.field8634;
                    } else {
                        int var20 = super.field8637 * var15;
                        var19 = (super.field8638 * var13 + super.field8640 * var11 + var20 >> 14) + super.field8653;
                        if (var19 <= super.field8648.field5982) {
                            return;
                        }
                        var18 = (super.field8640 * var12 + super.field8638 * var13 + var20 >> 14) + super.field8653;
                        if (super.field8648.field5982 >= var18) {
                            return;
                        }
                        var17 = (super.field8638 * var14 + super.field8640 * var12 + var20 >> 14) + super.field8653;
                        if (~var17 >= ~super.field8648.field5982) {
                            return;
                        }
                        var16 = (super.field8640 * var11 + var20 - -(super.field8638 * var14) >> 14) + super.field8653;
                        if (super.field8648.field5982 >= var16) {
                            return;
                        }
                    }
                    int var21 = super.field8635 * var15;
                    var22 = (super.field8649 * var11 + super.field8650 * var13 + var21 >> 14) + super.field8654;
                    int var23 = super.field8652 * var15;
                    var24 = arg6.field6860 - -(super.field8648.field6017 * var22 / var19);
                    var25 = (super.field8655 * var11 + super.field8642 * var13 - -var23 >> 14) + super.field8641;
                    var26 = arg6.field6858 - -(super.field8648.field6009 * var25 / var19);
                    var27 = (super.field8649 * var12 - (-(super.field8650 * var13) + -var21) >> 14) + super.field8654;
                    var28 = super.field8648.field6017 * var27 / var18 + arg6.field6860;
                    var29 = (super.field8655 * var12 - -(super.field8642 * var13) + var23 >> 14) + super.field8641;
                    var30 = super.field8648.field6009 * var29 / var18 + arg6.field6858;
                    int var31 = (super.field8650 * var14 + super.field8649 * var12 + var21 >> 14) + super.field8654;
                    int var32 = (super.field8655 * var12 + super.field8642 * var14 + var23 >> 14) + super.field8641;
                    var33 = super.field8648.field6017 * var31 / var17 + arg6.field6860;
                    var34 = (super.field8650 * var14 + super.field8649 * var11 + var21 >> 14) + super.field8654;
                    var35 = super.field8648.field6009 * var32 / var17 + arg6.field6858;
                    var36 = super.field8648.field6017 * var34 / var16 + arg6.field6860;
                    var37 = (super.field8655 * var11 + super.field8642 * var14 + var23 >> 14) + super.field8641;
                    var38 = super.field8648.field6009 * var37 / var16 + arg6.field6858;
                } else {
                    int var39 = super.field8647[arg5][arg1];
                    int var40 = super.field8647[arg5 + 1][arg1];
                    int var41 = super.field8647[arg5 + 1][arg1 - -1];
                    int var42 = super.field8647[arg5][arg1 - -1];
                    if (~super.field8634 == 0) {
                        var19 = (super.field8637 * var39 + (super.field8640 * var11 - -(super.field8638 * var13)) >> 14) + super.field8653;
                        if (var19 <= super.field8648.field5982) {
                            return;
                        }
                        var18 = super.field8653 - -(super.field8638 * var13 + super.field8640 * var12 + super.field8637 * var40 >> 14);
                        if (super.field8648.field5982 >= var18) {
                            return;
                        }
                        var17 = (super.field8638 * var14 + (super.field8640 * var12 - -(super.field8637 * var41)) >> 14) + super.field8653;
                        if (super.field8648.field5982 >= var17) {
                            return;
                        }
                        var16 = (super.field8640 * var11 - -(super.field8637 * var42) - -(super.field8638 * var14) >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var16) {
                            return;
                        }
                    } else {
                        var16 = super.field8634;
                        var17 = super.field8634;
                        var18 = super.field8634;
                        var19 = super.field8634;
                    }
                    var22 = (super.field8649 * var11 - (-(super.field8650 * var13) + -(super.field8635 * var39)) >> 14) + super.field8654;
                    var24 = arg6.field6860 - -(super.field8648.field6017 * var22 / var19);
                    var25 = (super.field8652 * var39 + (super.field8655 * var11 - -(super.field8642 * var13)) >> 14) + super.field8641;
                    var27 = super.field8654 - -(super.field8649 * var12 + super.field8635 * var40 - -(super.field8650 * var13) >> 14);
                    var26 = super.field8648.field6009 * var25 / var19 + arg6.field6858;
                    var29 = (super.field8642 * var13 + super.field8655 * var12 + super.field8652 * var40 >> 14) + super.field8641;
                    var28 = arg6.field6860 - -(super.field8648.field6017 * var27 / var18);
                    int var43 = (super.field8650 * var14 + super.field8649 * var12 + super.field8635 * var41 >> 14) + super.field8654;
                    var30 = super.field8648.field6009 * var29 / var18 + arg6.field6858;
                    var33 = super.field8648.field6017 * var43 / var17 + arg6.field6860;
                    int var44 = super.field8641 - -(super.field8655 * var12 + super.field8652 * var41 + super.field8642 * var14 >> 14);
                    var35 = super.field8648.field6009 * var44 / var17 + arg6.field6858;
                    var34 = (super.field8649 * var11 + super.field8650 * var14 + super.field8635 * var42 >> 14) + super.field8654;
                    var36 = super.field8648.field6017 * var34 / var16 + arg6.field6860;
                    var37 = (super.field8642 * var14 + super.field8655 * var11 + super.field8652 * var42 >> 14) + super.field8641;
                    var38 = super.field8648.field6009 * var37 / var16 + arg6.field6858;
                }
                if (~((-var36 + var33) * (-var38 + var30) - (var35 - var38) * (-var36 + var28)) < -1) {
                    arg6.field6867 = ~var33 > -1 || var36 < 0 || ~var28 > -1 || ~arg6.field6870 > ~var33 || var36 > arg6.field6870 || var28 > arg6.field6870;
                    if (var10.field591 >= 0) {
                        if (this.method3538(super.field8648.field8808.method2760(var10.field591, 21351).field4937)) {
                            arg6.field6866 = 100;
                        }
                        arg6.method2869(var35, var38, var30, var33, var36, var28, var17, var16, var18, 65535 & var10.field594, var10.field589 & 65535, var10.field590 & 65535, var22, var27, var34, var25, var29, var37, var19, var18, var16, var10.field591);
                        arg6.field6866 = 0;
                    } else {
                        arg6.method2863(var35, var38, var30, var33, var36, var28, var17, var16, var18, 65535 & var10.field594, var10.field589 & 65535, var10.field590 & 65535);
                    }
                }
                if (~((var38 - var30) * (-var28 + var24) + -((var26 - var30) * (-var28 + var36))) < -1) {
                    arg6.field6867 = var24 < 0 || ~var28 > -1 || var36 < 0 || var24 > arg6.field6870 || var28 > arg6.field6870 || ~var36 < ~arg6.field6870;
                    if (~var10.field591 > -1) {
                        arg6.method2863(var26, var30, var38, var24, var28, var36, var19, var18, var16, 65535 & var10.field593, 65535 & var10.field590, var10.field589 & 65535);
                        return;
                    }
                    if (this.method3538(super.field8648.field8808.method2760(var10.field591, 21351).field4937)) {
                        arg6.field6866 = 100;
                    }
                    arg6.method2869(var26, var30, var38, var24, var28, var36, var19, var18, var16, var10.field593 & 65535, 65535 & var10.field590, 65535 & var10.field589, var22, var27, var34, var25, var29, var37, var19, var18, var16, var10.field591);
                    arg6.field6866 = 0;
                }
            }
        } else {
            class45 var45 = super.field8643[arg5][arg1];
            if (var45 != null) {
                if (~super.field8634 == 0) {
                    for (int var46 = 0; var46 < var45.field645; ++var46) {
                        int var47 = var45.field648[var46] - -(arg5 << super.field2245);
                        short var48 = var45.field641[var46];
                        int var49 = (arg1 << super.field2245) + var45.field653[var46];
                        int var50 = (super.field8638 * var49 + super.field8640 * var47 + super.field8637 * var48 >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var50) {
                            return;
                        }
                        int var51 = (super.field8649 * var47 + super.field8635 * var48 - -(super.field8650 * var49) >> 14) + super.field8654;
                        int var52 = super.field8641 - -(super.field8655 * var47 + super.field8652 * var48 + super.field8642 * var49 >> 14);
                        arg0[var46] = arg6.field6860 - -(super.field8648.field6017 * var51 / var50);
                        arg4[var46] = super.field8648.field6009 * var52 / var50 + arg6.field6858;
                        arg2[var46] = var50;
                    }
                } else {
                    for (int var53 = 0; var53 < var45.field645; ++var53) {
                        int var93 = (arg5 << super.field2245) + var45.field648[var53];
                        short var94 = var45.field641[var53];
                        int var95 = (arg1 << super.field2245) + var45.field653[var53];
                        int var96 = (super.field8642 * var95 + super.field8655 * var93 + super.field8652 * var94 >> 14) + super.field8641;
                        int var97 = (super.field8650 * var95 + super.field8649 * var93 + super.field8635 * var94 >> 14) + super.field8654;
                        arg0[var53] = super.field8648.field6017 * var97 / super.field8634 + arg6.field6860;
                        arg4[var53] = super.field8648.field6009 * var96 / super.field8634 + arg6.field6858;
                        arg2[var53] = super.field8634;
                    }
                }
                if (var45.field650 != null) {
                    int var54 = super.field8647[arg5][arg1];
                    int var55 = super.field8647[arg5 + 1][arg1];
                    int var56 = super.field8647[arg5][arg1 + 1];
                    int var57 = super.field2250 * arg5;
                    int var58 = super.field2250 + var57;
                    int var59 = super.field2250 * arg1;
                    int var60 = super.field2250 + var59;
                    int var61 = super.field8654 - -(super.field8635 * var54 + super.field8650 * var59 + super.field8649 * var57 >> 14);
                    int var62 = (super.field8642 * var59 + super.field8655 * var57 + super.field8652 * var54 >> 14) + super.field8641;
                    int var63 = super.field8653 - -(super.field8640 * var57 - (-(super.field8638 * var59) + -(super.field8637 * var54)) >> 14);
                    int var64 = (super.field8650 * var59 + super.field8649 * var58 + super.field8635 * var55 >> 14) + super.field8654;
                    int var65 = (super.field8652 * var55 + (super.field8655 * var58 - -(super.field8642 * var59)) >> 14) + super.field8641;
                    int var66 = super.field8653 - -(super.field8638 * var59 + (super.field8640 * var58 - -(super.field8637 * var55)) >> 14);
                    int var67 = (super.field8649 * var57 + super.field8635 * var56 - -(super.field8650 * var60) >> 14) + super.field8654;
                    int var68 = (super.field8655 * var57 + super.field8652 * var56 + super.field8642 * var60 >> 14) + super.field8641;
                    int var69 = super.field8653 - -(super.field8640 * var57 + super.field8638 * var60 + super.field8637 * var56 >> 14);
                    for (int var70 = 0; var45.field652 > var70; ++var70) {
                        short var71 = var45.field649[var70];
                        short var72 = var45.field651[var70];
                        short var73 = var45.field644[var70];
                        int var74 = arg0[var71];
                        int var75 = arg0[var72];
                        int var76 = arg0[var73];
                        int var77 = arg4[var71];
                        int var78 = arg4[var72];
                        int var79 = arg4[var73];
                        if ((-var75 + var74) * (-var78 + var79) - (var77 - var78) * (-var75 + var76) > 0) {
                            arg6.field6867 = var74 < 0 || ~var75 > -1 || ~var76 > -1 || arg6.field6870 < var74 || ~var75 < ~arg6.field6870 || var76 > arg6.field6870;
                            short var80 = var45.field650[var70];
                            if (~var80 == 0) {
                                int var81 = var45.field646[var70];
                                if (~var81 != 0) {
                                    arg6.method2863(var77, var78, var79, var74, var75, var76, arg2[var71], arg2[var72], arg2[var73], class329.method1963(var45.field642[var71], -680993689, var81), class329.method1963(var45.field642[var72], -680993689, var81), class329.method1963(var45.field642[var73], -680993689, var81));
                                }
                            } else {
                                if (this.method3538(super.field8648.field8808.method2760(var80, 21351).field4937)) {
                                    arg6.field6866 = 100;
                                }
                                arg6.method2869(var77, var78, var79, var74, var75, var76, arg2[var71], arg2[var72], arg2[var73], var45.field642[var71], var45.field642[var72], var45.field642[var73], var61, var64, var67, var62, var65, var68, var63, var66, var69, var80);
                                arg6.field6866 = 0;
                            }
                        }
                    }
                } else {
                    for (int var82 = 0; ~var82 > ~var45.field652; ++var82) {
                        short var83 = var45.field649[var82];
                        short var84 = var45.field651[var82];
                        short var85 = var45.field644[var82];
                        int var86 = arg0[var83];
                        int var87 = arg0[var84];
                        int var88 = arg0[var85];
                        int var89 = arg4[var83];
                        int var90 = arg4[var84];
                        int var91 = arg4[var85];
                        if ((-var87 + var86) * (-var90 + var91) + -((var88 - var87) * (var89 - var90)) > 0) {
                            int var92 = var45.field646[var82];
                            if (~var92 != 0) {
                                arg6.field6867 = var86 < 0 || ~var87 > -1 || ~var88 > -1 || ~var86 < ~arg6.field6870 || ~arg6.field6870 > ~var87 || ~var88 < ~arg6.field6870;
                                arg6.method2863(var89, var90, var91, var86, var87, var88, arg2[var83], arg2[var84], arg2[var85], class329.method1963(var45.field642[var83], -680993689, var92), class329.method1963(var45.field642[var84], -680993689, var92), class329.method1963(var45.field642[var85], -680993689, var92));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V", line = 1323)
    public final void method18(int arg0, int arg1) {
        ++field7767;
        class205 var3 = (class205) super.field8648.method2478(Thread.currentThread());
        var3.field2964.field6866 = 0;
        if (super.field8651 == null) {
            if (super.field8646 != null) {
                this.method3226(var3.field3830, arg1, var3.field3832, (byte) 123, var3.field3844, arg0, var3.field2964, var3.field3805);
                return;
            }
        } else {
            this.method3221(arg1, arg0, var3.field3844, var3.field3832, var3.field3805, 6254, super.field8648.field5994, var3.field2964, var3.field3830);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILgh;[[ZII[IIII[III)V", line = 1340)
    private final void method3227(int arg0, class514 arg1, boolean[][] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11) {
        ++field7765;
        int var13 = (-arg3 + arg7) * arg8 / 256;
        int var14 = arg8 >> 8;
        boolean var15 = ((class667) super.field8648).field9463;
        super.field8648.method407(false);
        arg1.field6864 = false;
        arg1.field6868 = false;
        int var16 = arg6;
        if (arg4 < 80) {
            field7773 = null;
        }
        int var17 = arg10 + var13;
        for (int var18 = arg11; var18 < arg0; ++var18) {
            for (int var19 = arg3; ~var19 > ~arg7; ++var19) {
                if (arg2[var18 - arg11][var19 - arg3]) {
                    if (super.field8646[var18][var19] != null) {
                        class40 var35 = super.field8646[var18][var19];
                        if (~var35.field591 != 0 && (2 & var35.field592) == 0 && var35.field595 == -1) {
                            int var36 = super.field8648.method2488(var35.field591);
                            arg1.method2863(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class329.method1963(65535 & var35.field594, -680993689, var36), class329.method1963(var35.field589 & 65535, -680993689, var36), class329.method1963(var35.field590 & 65535, -680993689, var36));
                            arg1.method2863(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class329.method1963(var35.field593 & 65535, -680993689, var36), class329.method1963(65535 & var35.field590, -680993689, var36), class329.method1963(65535 & var35.field589, -680993689, var36));
                        } else if (var35.field595 != -1) {
                            int var37 = var35.field595;
                            arg1.method2863(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var37, var37, var37);
                            arg1.method2863(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var37, var37, var37);
                        } else {
                            arg1.method2863(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var35.field594 & 65535, 65535 & var35.field589, 65535 & var35.field590);
                            arg1.method2863(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, var35.field593 & 65535, var35.field590 & 65535, var35.field589 & 65535);
                        }
                    } else if (super.field8643[var18][var19] != null) {
                        class45 var20 = super.field8643[var18][var19];
                        for (int var21 = 0; ~var20.field645 < ~var21; ++var21) {
                            arg9[var21] = var16 - -(var20.field648[var21] * var14 / super.field2250);
                            arg5[var21] = var17 - var20.field653[var21] * var14 / super.field2250;
                        }
                        for (int var22 = 0; ~var20.field652 < ~var22; ++var22) {
                            short var23 = var20.field649[var22];
                            short var24 = var20.field651[var22];
                            short var25 = var20.field644[var22];
                            int var26 = arg9[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg5[var23];
                            int var30 = arg5[var24];
                            int var31 = arg5[var25];
                            if (var20.field647 != null && ~var20.field647[var22] != 0) {
                                int var32 = var20.field647[var22];
                                arg1.method2863(var29, var30, var31, var26, var27, var28, 100, 100, 100, class329.method1963(var20.field642[var23], -680993689, var32), class329.method1963(var20.field642[var24], -680993689, var32), class329.method1963(var20.field642[var25], -680993689, var32));
                            } else if (var20.field650 != null && ~var20.field650[var22] != 0) {
                                int var33 = super.field8648.method2488(var20.field650[var22]);
                                arg1.method2863(var29, var30, var31, var26, var27, var28, 100, 100, 100, class329.method1963(var20.field642[var23], -680993689, var33), class329.method1963(var20.field642[var24], -680993689, var33), class329.method1963(var20.field642[var25], -680993689, var33));
                            } else {
                                int var34 = var20.field646[var22];
                                arg1.method2863(var29, var30, var31, var26, var27, var28, 100, 100, 100, class329.method1963(var20.field642[var23], -680993689, var34), class329.method1963(var20.field642[var24], -680993689, var34), class329.method1963(var20.field642[var25], -680993689, var34));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg10 + var13;
            var16 += var14;
        }
        arg1.field6864 = true;
        super.field8648.method407(var15);
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 1491)
    public static void method3228(int arg0) {
        field7774 = null;
        field7770 = null;
        field7771 = null;
        field7773 = null;
        field7772 = null;
        if (arg0 != -1) {
            field7771 = null;
        }
    }
}
