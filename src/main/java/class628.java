import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class628 extends class148 {

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "Lig;")
    public static class206 field9070 = new class206(39, -2);

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
    public static int field9074 = -1;

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "F")
    public static float field9072;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZZ[I[I[ILcaa;[III)V", line = 9)
    private final void method3597(boolean arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4, class255 arg5, int[] arg6, int arg7, int arg8) {
        ++field9065;
        class482 var10 = super.field1832[arg7][arg8];
        if (var10 != null) {
            if ((var10.field7079 & 2) == 0) {
                int var11 = super.field1662 * arg7;
                int var12 = var11 - -super.field1662;
                int var13 = super.field1662 * arg8;
                int var14 = var13 - -super.field1662;
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
                if (~(1 & var10.field7079) != -1 && !arg0) {
                    int var19 = super.field1816[arg7][arg8];
                    if (super.field1823 == -1) {
                        int var20 = super.field1826 * var19;
                        var21 = super.field1828 - -(super.field1827 * var11 + var20 - -(super.field1833 * var13) >> 14);
                        if (super.field1824.field8204 >= var21) {
                            return;
                        }
                        var22 = (super.field1833 * var13 + super.field1827 * var12 + var20 >> 14) + super.field1828;
                        if (super.field1824.field8204 >= var22) {
                            return;
                        }
                        var23 = (super.field1833 * var14 + super.field1827 * var12 - -var20 >> 14) + super.field1828;
                        if (~var23 >= ~super.field1824.field8204) {
                            return;
                        }
                        var24 = super.field1828 - -(super.field1833 * var14 + super.field1827 * var11 + var20 >> 14);
                        if (var24 <= super.field1824.field8204) {
                            return;
                        }
                    } else {
                        var24 = super.field1823;
                        var23 = super.field1823;
                        var22 = super.field1823;
                        var21 = super.field1823;
                    }
                    if (super.field1824.field8184) {
                        int var25 = -super.field1824.field8186 + var21;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field1824.field8186 + var22;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (~var26 < -256) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field1824.field8186 + var23;
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = var24 - super.field1824.field8186;
                        if (~var28 < -1) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    int var29 = super.field1813 * var19;
                    var30 = (super.field1831 * var11 + var29 - -(super.field1818 * var13) >> 14) + super.field1825;
                    int var31 = super.field1834 * var19;
                    var32 = super.field1824.field8178 * var30 / var21 + arg5.field3631;
                    var33 = super.field1814 - -(super.field1829 * var13 + super.field1815 * var11 + var31 >> 14);
                    var34 = super.field1824.field8173 * var33 / var21 + arg5.field3639;
                    var35 = super.field1825 - -(super.field1831 * var12 + super.field1818 * var13 + var29 >> 14);
                    var36 = super.field1824.field8178 * var35 / var22 + arg5.field3631;
                    var37 = super.field1814 - -(super.field1815 * var12 - (-(super.field1829 * var13) + -var31) >> 14);
                    var38 = (super.field1818 * var14 + (super.field1831 * var12 - -var29) >> 14) + super.field1825;
                    var39 = arg5.field3639 - -(super.field1824.field8173 * var37 / var22);
                    var40 = super.field1824.field8178 * var38 / var23 + arg5.field3631;
                    var41 = (super.field1815 * var12 - (-var31 - super.field1829 * var14) >> 14) + super.field1814;
                    var42 = (super.field1831 * var11 - -(super.field1818 * var14) + var29 >> 14) + super.field1825;
                    var43 = super.field1824.field8173 * var41 / var23 + arg5.field3639;
                    var44 = super.field1824.field8178 * var42 / var24 + arg5.field3631;
                    var45 = (super.field1815 * var11 - -var31 - -(super.field1829 * var14) >> 14) + super.field1814;
                    var46 = arg5.field3639 - -(super.field1824.field8173 * var45 / var24);
                } else {
                    int var47 = super.field1816[arg7][arg8];
                    int var48 = super.field1816[arg7 + 1][arg8];
                    int var49 = super.field1816[arg7 - -1][arg8 + 1];
                    int var50 = super.field1816[arg7][arg8 + 1];
                    if (~super.field1823 == 0) {
                        var21 = (super.field1827 * var11 + super.field1826 * var47 - -(super.field1833 * var13) >> 14) + super.field1828;
                        if (var21 <= super.field1824.field8204) {
                            return;
                        }
                        var22 = (super.field1827 * var12 + super.field1833 * var13 + super.field1826 * var48 >> 14) + super.field1828;
                        if (super.field1824.field8204 >= var22) {
                            return;
                        }
                        var23 = (super.field1826 * var49 + (super.field1827 * var12 - -(super.field1833 * var14)) >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var23) {
                            return;
                        }
                        var24 = super.field1828 - -(super.field1827 * var11 + super.field1833 * var14 + super.field1826 * var50 >> 14);
                        if (~var24 >= ~super.field1824.field8204) {
                            return;
                        }
                    } else {
                        var24 = super.field1823;
                        var23 = super.field1823;
                        var22 = super.field1823;
                        var21 = super.field1823;
                    }
                    if (!arg0) {
                        if (super.field1824.field8184) {
                            int var51 = -super.field1824.field8186 + var21;
                            if (var51 > 0) {
                                var15 = var51;
                                if (~var51 < -256) {
                                    var15 = 255;
                                }
                            }
                            int var52 = -super.field1824.field8186 + var22;
                            if (~var52 < -1) {
                                var16 = var52;
                                if (var52 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var53 = var23 - super.field1824.field8186;
                            if (var53 > 0) {
                                var17 = var53;
                                if (var53 > 255) {
                                    var17 = 255;
                                }
                            }
                            int var54 = -super.field1824.field8186 + var24;
                            if (var54 > 0) {
                                var18 = var54;
                                if (~var54 < -256) {
                                    var18 = 255;
                                }
                            }
                        }
                    } else {
                        int var55 = -super.field1824.field8186 + var21;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (~var55 < -1) {
                            var15 = var55;
                            int var56 = var10.field7077 * var55 / 255;
                            if (~var56 < -1) {
                                var47 -= var56;
                            }
                        }
                        int var57 = var22 - super.field1824.field8186;
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var16 = var57;
                            int var58 = var10.field7071 * var57 / 255;
                            if (var58 > 0) {
                                var48 -= var58;
                            }
                        }
                        int var59 = -super.field1824.field8186 + var23;
                        if (~var59 < -256) {
                            var59 = 255;
                        }
                        if (~var59 < -1) {
                            var17 = var59;
                            int var60 = var10.field7078 * var59 / 255;
                            if (var60 > 0) {
                                var49 -= var60;
                            }
                        }
                        int var61 = var24 - super.field1824.field8186;
                        if (var61 > 255) {
                            var61 = 255;
                        }
                        if (~var61 < -1) {
                            var18 = var61;
                            int var62 = var10.field7074 * var61 / 255;
                            if (var62 > 0) {
                                var50 -= var62;
                            }
                        }
                    }
                    var30 = super.field1825 - -(super.field1831 * var11 + super.field1813 * var47 - -(super.field1818 * var13) >> 14);
                    var32 = super.field1824.field8178 * var30 / var21 + arg5.field3631;
                    var33 = (super.field1829 * var13 + super.field1815 * var11 - -(super.field1834 * var47) >> 14) + super.field1814;
                    var35 = (super.field1818 * var13 + super.field1831 * var12 + super.field1813 * var48 >> 14) + super.field1825;
                    var34 = super.field1824.field8173 * var33 / var21 + arg5.field3639;
                    var37 = (super.field1829 * var13 + super.field1834 * var48 + super.field1815 * var12 >> 14) + super.field1814;
                    var36 = super.field1824.field8178 * var35 / var22 + arg5.field3631;
                    var38 = (super.field1818 * var14 + (super.field1831 * var12 - -(super.field1813 * var49)) >> 14) + super.field1825;
                    var39 = super.field1824.field8173 * var37 / var22 + arg5.field3639;
                    var40 = arg5.field3631 - -(super.field1824.field8178 * var38 / var23);
                    var41 = super.field1814 - -(super.field1829 * var14 + super.field1834 * var49 + super.field1815 * var12 >> 14);
                    var43 = super.field1824.field8173 * var41 / var23 + arg5.field3639;
                    var42 = super.field1825 - -(super.field1818 * var14 + super.field1831 * var11 + super.field1813 * var50 >> 14);
                    var44 = arg5.field3631 - -(super.field1824.field8178 * var42 / var24);
                    var45 = (super.field1829 * var14 + (super.field1815 * var11 - -(super.field1834 * var50)) >> 14) + super.field1814;
                    var46 = super.field1824.field8173 * var45 / var24 + arg5.field3639;
                }
                boolean var63 = var10.field7072 != -1 && this.method880(super.field1824.field8852.method438(120, var10.field7072).field8935);
                int var64 = var16 + var18 + var17;
                if ((-var44 + var40) * (-var46 + var39) - (-var44 + var36) * (-var46 + var43) > 0) {
                    arg5.field3638 = ~var40 > -1 || ~var44 > -1 || var36 < 0 || ~var40 < ~arg5.field3640 || ~arg5.field3640 > ~var44 || arg5.field3640 < var36;
                    if (~var64 <= -766) {
                        arg5.method1699(var43, var46, var39, var40, var44, var36, var23, var24, var22, super.field1824.field8181);
                    } else {
                        if (var63) {
                            arg5.field3643 = 100;
                        }
                        if (var64 <= 0) {
                            if (~var10.field7072 <= -1) {
                                arg5.method1703(var43, var46, var39, var40, var44, var36, var10.field7073, var10.field7076, var10.field7069, var38, var42, var35, var41, var45, var37, var23, var24, var22, var10.field7072);
                            } else {
                                arg5.method1702(var43, var46, var39, var40, var44, var36, var23, var24, var22, var10.field7073, var10.field7076, var10.field7069);
                            }
                        } else if (var10.field7072 >= 0) {
                            arg5.method1695(var43, var46, var39, var40, var44, var36, var23, var24, var22, super.field1824.field8181, var17, var18, var16, var10.field7073, var10.field7076, var10.field7069, var38, var42, var35, var41, var45, var37, var23, var24, var22, var10.field7072);
                        } else {
                            arg5.method1702(var43, var46, var39, var40, var44, var36, var23, var24, var22, class1.method3(-127, var10.field7073, var17 << 24 | super.field1824.field8181), class1.method3(-128, var10.field7076, var18 << 24 | super.field1824.field8181), class1.method3(-127, var10.field7069, super.field1824.field8181 | var16 << 24));
                        }
                        arg5.field3643 = 0;
                    }
                }
                int var65 = var15 + var16 + var18;
                if (~((-var36 + var32) * (-var39 + var46) + -((var34 - var39) * (-var36 + var44))) < -1) {
                    arg5.field3638 = ~var32 > -1 || var36 < 0 || ~var44 > -1 || ~arg5.field3640 > ~var32 || var36 > arg5.field3640 || ~arg5.field3640 > ~var44;
                    if (~var65 > -766) {
                        if (var63) {
                            arg5.field3643 = 100;
                        }
                        if (~var65 >= -1) {
                            if (var10.field7072 < 0) {
                                arg5.method1702(var34, var39, var46, var32, var36, var44, var21, var22, var24, var10.field7075, var10.field7069, var10.field7076);
                            } else {
                                arg5.method1703(var34, var39, var46, var32, var36, var44, var10.field7075, var10.field7069, var10.field7076, var30, var35, var42, var33, var37, var45, var21, var22, var24, var10.field7072);
                            }
                        } else if (~var10.field7072 > -1) {
                            arg5.method1702(var34, var39, var46, var32, var36, var44, var21, var22, var24, class1.method3(-127, var10.field7075, super.field1824.field8181 | var15 << 24), class1.method3(-128, var10.field7069, var16 << 24 | super.field1824.field8181), class1.method3(-126, var10.field7076, super.field1824.field8181 | var18 << 24));
                        } else {
                            arg5.method1695(var34, var39, var46, var32, var36, var44, var21, var22, var24, super.field1824.field8181, var15, var16, var18, var10.field7075, var10.field7069, var10.field7076, var30, var35, var42, var33, var37, var45, var21, var22, var24, var10.field7072);
                        }
                        arg5.field3643 = 0;
                        return;
                    }
                    arg5.method1699(var34, var39, var46, var32, var36, var44, var21, var22, var24, super.field1824.field8181);
                }
            }
        } else {
            if (!arg1) {
                this.method3597(false, false, (int[]) null, (int[]) null, (int[]) null, (class255) null, (int[]) null, -1, 38);
            }
            class423 var66 = super.field1821[arg7][arg8];
            if (var66 != null) {
                if (super.field1823 == -1) {
                    for (int var67 = 0; ~var66.field6316 < ~var67; ++var67) {
                        int var68 = var66.field6314[var67] - -(arg7 << super.field1663);
                        int var69 = var66.field6319[var67];
                        int var70 = var66.field6313[var67] - -(arg8 << super.field1663);
                        int var71 = super.field1828 - -(super.field1827 * var68 + (super.field1826 * var69 - -(super.field1833 * var70)) >> 14);
                        if (super.field1824.field8204 >= var71) {
                            return;
                        }
                        arg2[var67] = 0;
                        if (!arg0) {
                            if (super.field1824.field8184) {
                                int var72 = -super.field1824.field8186 + var71;
                                if (~var72 < -1) {
                                    arg2[var67] = var72;
                                    if (~arg2[var67] < -256) {
                                        arg2[var67] = 255;
                                    }
                                }
                            }
                        } else {
                            int var73 = -super.field1824.field8186 + var71;
                            if (~var73 < -256) {
                                var73 = 255;
                            }
                            if (var73 > 0) {
                                arg2[var67] = var73;
                                int var74 = var66.field6317[var67] * var73 / 255;
                                if (~var74 < -1) {
                                    var69 -= var74;
                                }
                            }
                        }
                        int var75 = (super.field1829 * var70 + (super.field1815 * var68 - -(super.field1834 * var69)) >> 14) + super.field1814;
                        int var76 = (super.field1831 * var68 + super.field1818 * var70 + super.field1813 * var69 >> 14) + super.field1825;
                        arg6[var67] = arg5.field3631 - -(super.field1824.field8178 * var76 / var71);
                        arg3[var67] = super.field1824.field8173 * var75 / var71 + arg5.field3639;
                        arg4[var67] = var71;
                    }
                } else {
                    for (int var77 = 0; var66.field6316 > var77; ++var77) {
                        int var117 = (arg7 << super.field1663) + var66.field6314[var77];
                        int var118 = var66.field6319[var77];
                        int var119 = var66.field6313[var77] - -(arg8 << super.field1663);
                        arg2[var77] = 0;
                        if (arg0) {
                            int var120 = -super.field1824.field8186 + super.field1823;
                            if (var120 > 255) {
                                var120 = 255;
                            }
                            if (var120 > 0) {
                                arg2[var77] = var120;
                                int var121 = var66.field6317[var77] * var120 / 255;
                                if (~var121 < -1) {
                                    var118 -= var121;
                                }
                            }
                        } else if (super.field1824.field8184) {
                            int var122 = -super.field1824.field8186 + super.field1823;
                            if (~var122 < -1) {
                                arg2[var77] = var122;
                                if (~arg2[var77] < -256) {
                                    arg2[var77] = 255;
                                }
                            }
                        }
                        int var123 = (super.field1815 * var117 + super.field1834 * var118 + super.field1829 * var119 >> 14) + super.field1814;
                        int var124 = (super.field1831 * var117 - (-(super.field1818 * var119) + -(super.field1813 * var118)) >> 14) + super.field1825;
                        arg6[var77] = super.field1824.field8178 * var124 / super.field1823 + arg5.field3631;
                        arg3[var77] = super.field1824.field8173 * var123 / super.field1823 + arg5.field3639;
                        arg4[var77] = super.field1823;
                    }
                }
                if (var66.field6320 == null) {
                    for (int var78 = 0; var78 < var66.field6318; ++var78) {
                        int var79 = var78 * 3;
                        int var80 = var79 + 1;
                        int var81 = var80 + 1;
                        int var82 = arg6[var79];
                        int var83 = arg6[var80];
                        int var84 = arg6[var81];
                        int var85 = arg3[var79];
                        int var86 = arg3[var80];
                        int var87 = arg3[var81];
                        int var88 = arg2[var80] + arg2[var81] + arg2[var79];
                        if (~((var87 - var86) * (-var83 + var82) + -((-var83 + var84) * (-var86 + var85))) < -1) {
                            arg5.field3638 = ~var82 > -1 || ~var83 > -1 || ~var84 > -1 || ~arg5.field3640 > ~var82 || ~arg5.field3640 > ~var83 || ~var84 < ~arg5.field3640;
                            if (~var88 > -766) {
                                if (var88 <= 0) {
                                    if ((16777215 & var66.field6311[var79]) != 0) {
                                        arg5.method1702(var85, var86, var87, var82, var83, var84, arg4[var79], arg4[var80], arg4[var81], var66.field6311[var79], var66.field6311[var80], var66.field6311[var81]);
                                    }
                                } else if (~(16777215 & var66.field6311[var79]) != -1) {
                                    arg5.method1702(var85, var86, var87, var82, var83, var84, arg4[var79], arg4[var80], arg4[var81], class496.method2974(var66.field6311[var79], arg2[var79], 14, super.field1824.field8181), class496.method2974(var66.field6311[var80], arg2[var80], 77, super.field1824.field8181), class496.method2974(var66.field6311[var81], arg2[var81], 56, super.field1824.field8181));
                                }
                            } else {
                                arg5.method1699(var85, var86, var87, var82, var83, var84, arg4[var79], arg4[var80], arg4[var81], super.field1824.field8181);
                            }
                        }
                    }
                } else {
                    int var89 = super.field1816[arg7][arg8];
                    int var90 = super.field1816[arg7 + 1][arg8];
                    int var91 = super.field1816[arg7][arg8 - -1];
                    int var92 = super.field1662 * arg7;
                    int var93 = super.field1662 + var92;
                    int var94 = super.field1662 * arg8;
                    int var95 = var94 - -super.field1662;
                    int var96 = (super.field1818 * var94 + super.field1831 * var92 + super.field1813 * var89 >> 14) + super.field1825;
                    int var97 = (super.field1829 * var94 + super.field1834 * var89 + super.field1815 * var92 >> 14) + super.field1814;
                    int var98 = super.field1828 - -(super.field1827 * var92 + super.field1833 * var94 + super.field1826 * var89 >> 14);
                    int var99 = (super.field1831 * var93 + super.field1818 * var94 + super.field1813 * var90 >> 14) + super.field1825;
                    int var100 = (super.field1834 * var90 + super.field1829 * var94 + super.field1815 * var93 >> 14) + super.field1814;
                    int var101 = (super.field1833 * var94 + super.field1827 * var93 + super.field1826 * var90 >> 14) + super.field1828;
                    int var102 = super.field1825 - -(super.field1813 * var91 + (super.field1831 * var92 - -(super.field1818 * var95)) >> 14);
                    int var103 = super.field1814 - -(super.field1815 * var92 + super.field1834 * var91 + super.field1829 * var95 >> 14);
                    int var104 = (super.field1833 * var95 + (super.field1827 * var92 - -(super.field1826 * var91)) >> 14) + super.field1828;
                    for (int var105 = 0; ~var105 > ~var66.field6318; ++var105) {
                        int var106 = var105 * 3;
                        int var107 = var106 - -1;
                        int var108 = var107 + 1;
                        int var109 = arg6[var106];
                        int var110 = arg6[var107];
                        int var111 = arg6[var108];
                        int var112 = arg3[var106];
                        int var113 = arg3[var107];
                        int var114 = arg3[var108];
                        int var115 = arg2[var106] + arg2[var108] + arg2[var107];
                        if (~((var109 - var110) * (var114 - var113) + -((-var110 + var111) * (-var113 + var112))) < -1) {
                            arg5.field3638 = var109 < 0 || ~var110 > -1 || var111 < 0 || ~var109 < ~arg5.field3640 || ~arg5.field3640 > ~var110 || arg5.field3640 < var111;
                            short var116 = var66.field6320[var105];
                            if (var115 < 765) {
                                if (var116 != -1 && this.method880(super.field1824.field8852.method438(78, var116).field8935)) {
                                    arg5.field3643 = 100;
                                }
                                if (var115 > 0) {
                                    if (~var116 == 0) {
                                        if ((16777215 & var66.field6311[var106]) != 0) {
                                            arg5.method1702(var112, var113, var114, var109, var110, var111, arg4[var106], arg4[var107], arg4[var108], class1.method3(-128, var66.field6311[var106], super.field1824.field8181 | arg2[var106] << 24), class1.method3(-125, var66.field6311[var107], super.field1824.field8181 | arg2[var107] << 24), class1.method3(-126, var66.field6311[var108], super.field1824.field8181 | arg2[var108] << 24));
                                        }
                                    } else {
                                        arg5.method1695(var112, var113, var114, var109, var110, var111, arg4[var106], arg4[var107], arg4[var108], super.field1824.field8181, arg2[var106], arg2[var107], arg2[var108], var66.field6311[var106], var66.field6311[var107], var66.field6311[var108], var96, var99, var102, var97, var100, var103, var98, var101, var104, var116);
                                    }
                                } else if (var116 == -1) {
                                    if ((var66.field6311[var106] & 16777215) != 0) {
                                        arg5.method1702(var112, var113, var114, var109, var110, var111, arg4[var106], arg4[var107], arg4[var108], var66.field6311[var106], var66.field6311[var107], var66.field6311[var108]);
                                    }
                                } else {
                                    arg5.method1703(var112, var113, var114, var109, var110, var111, var66.field6311[var106], var66.field6311[var107], var66.field6311[var108], var96, var99, var102, var97, var100, var103, var98, var101, var104, var116);
                                }
                                arg5.field3643 = 0;
                            } else {
                                arg5.method1699(var112, var113, var114, var109, var110, var111, arg4[var106], arg4[var107], arg4[var108], super.field1824.field8181);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIII[[Z)V", line = 696)
    public final void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9069;
        class51 var9 = (class51) super.field1824.method732(Thread.currentThread());
        class255 var10 = var9.field539;
        var10.field3643 = 0;
        var10.field3638 = false;
        if (super.field1832 != null) {
            this.method3600(arg0, arg2, true, var10, var9.field7423, arg3, arg5, arg6, arg4, arg7, arg1, var9.field7429);
        } else if (super.field1822 != null) {
            this.method3603(arg5, var9.field7423, -104, arg4, arg3, var9.field7429, arg1, arg7, var10, arg0, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V", line = 717)
    public static final void method3598(int arg0) {
        class308.method2044(class280.field3909, -7434);
        ++class28.field311;
        if (arg0 != -1) {
            method3599(-92, '\r', 51);
        }
        ++field9067;
        class468.field6960.method1229(class67.field739, 30364);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ICI)I", line = 730)
    public static final int method3599(int arg0, char arg1, int arg2) {
        ++field9068;
        if (arg2 != 18220) {
            field9070 = null;
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) - -1;
        }
        if (~arg1 == -242 && ~arg0 == -1) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZLcaa;[IIIII[[ZI[I)V", line = 754)
    private final void method3600(int arg0, int arg1, boolean arg2, class255 arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9, int arg10, int[] arg11) {
        ++field9073;
        int var13 = (arg7 - arg8) * arg1 / 256;
        int var14 = arg1 >> 8;
        arg3.field3635 = false;
        arg3.field3645 = false;
        int var15 = arg0;
        int var16 = arg10 - -var13;
        for (int var17 = arg5; ~arg6 < ~var17; ++var17) {
            for (int var18 = arg8; ~arg7 < ~var18; ++var18) {
                if (arg9[-arg5 + var17][var18 - arg8]) {
                    if (super.field1832[var17][var18] != null) {
                        class482 var33 = super.field1832[var17][var18];
                        if (~var33.field7072 != 0 && ~(2 & var33.field7079) == -1 && ~var33.field7070 == -1) {
                            int var34 = super.field1824.method3304(var33.field7072);
                            arg3.method1693(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class326.method2114(var33.field7073, (byte) -42, var34), class326.method2114(var33.field7076, (byte) -42, var34), class326.method2114(var33.field7069, (byte) -42, var34));
                            arg3.method1693(var16, var16, var16 - var14, var15, var14 + var15, var15, 0, 0, 0, class326.method2114(var33.field7075, (byte) -42, var34), class326.method2114(var33.field7069, (byte) -42, var34), class326.method2114(var33.field7076, (byte) -42, var34));
                        } else if (~var33.field7070 == -1) {
                            arg3.method1702(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, var33.field7073, var33.field7076, var33.field7069);
                            arg3.method1702(var16, var16, -var14 + var16, var15, var15 - -var14, var15, 0, 0, 0, var33.field7075, var33.field7069, var33.field7076);
                        } else {
                            int var35 = var33.field7070;
                            arg3.method1702(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class1.method3(-127, var35, -16777216 & var33.field7073), class1.method3(-127, var35, -16777216 & var33.field7076), class1.method3(-128, var35, -16777216 & var33.field7069));
                            arg3.method1702(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class1.method3(-127, var35, var33.field7075 & -16777216), class1.method3(-128, var35, -16777216 & var33.field7069), class1.method3(-128, var35, -16777216 & var33.field7076));
                        }
                    } else if (super.field1821[var17][var18] != null) {
                        class423 var19 = super.field1821[var17][var18];
                        for (int var20 = 0; ~var20 > ~var19.field6316; ++var20) {
                            arg11[var20] = var15 - -(var19.field6314[var20] * var14 / super.field1662);
                            arg4[var20] = -(var19.field6313[var20] * var14 / super.field1662) + var16;
                        }
                        for (int var21 = 0; ~var21 > ~var19.field6318; ++var21) {
                            int var22 = var21 * 3;
                            int var23 = var22 + 1;
                            int var24 = var23 + 1;
                            int var25 = arg11[var22];
                            int var26 = arg11[var23];
                            int var27 = arg11[var24];
                            int var28 = arg4[var22];
                            int var29 = arg4[var23];
                            int var30 = arg4[var24];
                            if (var19.field6315 == null || ~var19.field6315[var21] == -1 || var19.field6320 != null && (var19.field6320 == null || ~var19.field6320[var21] != 0)) {
                                if (var19.field6320 != null && var19.field6320[var21] != -1) {
                                    int var32 = super.field1824.method3304(var19.field6320[var21]);
                                    arg3.method1693(var28, var29, var30, var25, var26, var27, 0, 0, 0, var32, var32, var32);
                                } else {
                                    arg3.method1702(var28, var29, var30, var25, var26, var27, 0, 0, 0, var19.field6311[var22], var19.field6311[var23], var19.field6311[var24]);
                                }
                            } else {
                                int var31 = var19.field6315[var21];
                                arg3.method1702(var28, var29, var30, var25, var26, var27, 0, 0, 0, class1.method3(-128, var31, -(-16777216 & var19.field6311[var22]) + -16777216), class1.method3(-125, var31, -(var19.field6311[var23] & -16777216) + -16777216), class1.method3(-125, var31, -16777216 - (var19.field6311[var24] & -16777216)));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg10 + var13;
        }
        arg3.field3635 = arg2;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lfk;IIII[[I[[II)V", line = 891)
    public class628(class569 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V", line = 894)
    public static void method3601(boolean arg0) {
        field9070 = null;
        if (!arg0) {
            method3601(true);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II[I[I[ILcaa;[II)V", line = 905)
    private final void method3602(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, class255 arg5, int[] arg6, int arg7) {
        ++field9066;
        class617 var9 = super.field1822[arg1][arg7];
        if (var9 != null) {
            if ((var9.field8968 & 2) == 0) {
                int var10 = super.field1662 * arg1;
                int var11 = super.field1662 + var10;
                int var12 = super.field1662 * arg7;
                int var13 = super.field1662 + var12;
                int var18;
                int var19;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var29;
                int var31;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                if ((var9.field8968 & 1) == 0) {
                    int var14 = super.field1816[arg1][arg7];
                    int var15 = super.field1816[arg1 + 1][arg7];
                    int var16 = super.field1816[arg1 + 1][arg7 + 1];
                    int var17 = super.field1816[arg1][arg7 - -1];
                    if (super.field1823 == -1) {
                        var18 = (super.field1827 * var10 + super.field1833 * var12 + super.field1826 * var14 >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var18) {
                            return;
                        }
                        var19 = (super.field1826 * var15 + super.field1833 * var12 + super.field1827 * var11 >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var19) {
                            return;
                        }
                        var20 = (super.field1826 * var16 + (super.field1827 * var11 - -(super.field1833 * var13)) >> 14) + super.field1828;
                        if (~var20 >= ~super.field1824.field8204) {
                            return;
                        }
                        var21 = (super.field1827 * var10 + super.field1826 * var17 - -(super.field1833 * var13) >> 14) + super.field1828;
                        if (~var21 >= ~super.field1824.field8204) {
                            return;
                        }
                    } else {
                        var21 = super.field1823;
                        var20 = super.field1823;
                        var19 = super.field1823;
                        var18 = super.field1823;
                    }
                    var22 = (super.field1831 * var10 + (super.field1813 * var14 - -(super.field1818 * var12)) >> 14) + super.field1825;
                    var23 = (super.field1815 * var10 - (-(super.field1834 * var14) + -(super.field1829 * var12)) >> 14) + super.field1814;
                    var24 = arg5.field3631 - -(super.field1824.field8178 * var22 / var18);
                    var25 = (super.field1813 * var15 + (super.field1831 * var11 - -(super.field1818 * var12)) >> 14) + super.field1825;
                    var26 = super.field1824.field8173 * var23 / var18 + arg5.field3639;
                    var27 = super.field1824.field8178 * var25 / var19 + arg5.field3631;
                    var28 = super.field1814 - -(super.field1829 * var12 + (super.field1815 * var11 - -(super.field1834 * var15)) >> 14);
                    var29 = super.field1824.field8173 * var28 / var19 + arg5.field3639;
                    int var30 = super.field1825 - -(super.field1818 * var13 + super.field1831 * var11 + super.field1813 * var16 >> 14);
                    var31 = super.field1824.field8178 * var30 / var20 + arg5.field3631;
                    int var32 = super.field1814 - -(super.field1815 * var11 + super.field1834 * var16 + super.field1829 * var13 >> 14);
                    var33 = (super.field1831 * var10 + super.field1818 * var13 + super.field1813 * var17 >> 14) + super.field1825;
                    var34 = super.field1824.field8173 * var32 / var20 + arg5.field3639;
                    var35 = (super.field1834 * var17 + super.field1815 * var10 - -(super.field1829 * var13) >> 14) + super.field1814;
                    var36 = super.field1824.field8178 * var33 / var21 + arg5.field3631;
                    var37 = super.field1824.field8173 * var35 / var21 + arg5.field3639;
                } else {
                    int var38 = super.field1816[arg1][arg7];
                    if (super.field1823 != -1) {
                        var21 = super.field1823;
                        var20 = super.field1823;
                        var19 = super.field1823;
                        var18 = super.field1823;
                    } else {
                        int var39 = super.field1826 * var38;
                        var18 = (super.field1827 * var10 + var39 - -(super.field1833 * var12) >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var18) {
                            return;
                        }
                        var19 = (super.field1827 * var11 - -(super.field1833 * var12) + var39 >> 14) + super.field1828;
                        if (var19 <= super.field1824.field8204) {
                            return;
                        }
                        var20 = super.field1828 - -(super.field1833 * var13 + super.field1827 * var11 + var39 >> 14);
                        if (~super.field1824.field8204 <= ~var20) {
                            return;
                        }
                        var21 = (super.field1827 * var10 - (-var39 - super.field1833 * var13) >> 14) + super.field1828;
                        if (super.field1824.field8204 >= var21) {
                            return;
                        }
                    }
                    int var40 = super.field1813 * var38;
                    var22 = (super.field1831 * var10 + super.field1818 * var12 - -var40 >> 14) + super.field1825;
                    int var41 = super.field1834 * var38;
                    var24 = super.field1824.field8178 * var22 / var18 + arg5.field3631;
                    var23 = super.field1814 - -(super.field1815 * var10 + var41 - -(super.field1829 * var12) >> 14);
                    var25 = (super.field1818 * var12 + super.field1831 * var11 + var40 >> 14) + super.field1825;
                    var26 = super.field1824.field8173 * var23 / var18 + arg5.field3639;
                    var28 = (super.field1829 * var12 + (super.field1815 * var11 - -var41) >> 14) + super.field1814;
                    var27 = arg5.field3631 - -(super.field1824.field8178 * var25 / var19);
                    var29 = arg5.field3639 - -(super.field1824.field8173 * var28 / var19);
                    int var42 = (super.field1818 * var13 + super.field1831 * var11 + var40 >> 14) + super.field1825;
                    int var43 = (super.field1815 * var11 + var41 - -(super.field1829 * var13) >> 14) + super.field1814;
                    var31 = super.field1824.field8178 * var42 / var20 + arg5.field3631;
                    var33 = (super.field1818 * var13 + super.field1831 * var10 + var40 >> 14) + super.field1825;
                    var34 = super.field1824.field8173 * var43 / var20 + arg5.field3639;
                    var35 = super.field1814 - -(super.field1815 * var10 + super.field1829 * var13 + var41 >> 14);
                    var36 = super.field1824.field8178 * var33 / var21 + arg5.field3631;
                    var37 = super.field1824.field8173 * var35 / var21 + arg5.field3639;
                }
                if ((var29 - var37) * (-var36 + var31) + -((var27 - var36) * (var34 - var37)) > 0) {
                    arg5.field3638 = var31 < 0 || ~var36 > -1 || var27 < 0 || ~var31 < ~arg5.field3640 || arg5.field3640 < var36 || ~var27 < ~arg5.field3640;
                    if (var9.field8969 >= 0) {
                        if (this.method880(super.field1824.field8852.method438(arg0 ^ -115, var9.field8969).field8935)) {
                            arg5.field3643 = 100;
                        }
                        arg5.method1703(var34, var37, var29, var31, var36, var27, 65535 & var9.field8965, var9.field8967 & 65535, var9.field8970 & 65535, var22, var25, var33, var23, var28, var35, var18, var19, var21, var9.field8969);
                        arg5.field3643 = 0;
                    } else {
                        arg5.method1693(var34, var37, var29, var31, var36, var27, var20, var21, var19, 65535 & var9.field8965, var9.field8967 & 65535, 65535 & var9.field8970);
                    }
                }
                if ((-var27 + var24) * (-var29 + var37) + -((var26 - var29) * (-var27 + var36)) > 0) {
                    arg5.field3638 = ~var24 > -1 || ~var27 > -1 || var36 < 0 || ~var24 < ~arg5.field3640 || var27 > arg5.field3640 || var36 > arg5.field3640;
                    if (~var9.field8969 <= -1) {
                        if (this.method880(super.field1824.field8852.method438(124, var9.field8969).field8935)) {
                            arg5.field3643 = 100;
                        }
                        arg5.method1703(var26, var29, var37, var24, var27, var36, 65535 & var9.field8971, var9.field8970 & 65535, 65535 & var9.field8967, var22, var25, var33, var23, var28, var35, var18, var19, var21, var9.field8969);
                        arg5.field3643 = 0;
                        return;
                    }
                    arg5.method1693(var26, var29, var37, var24, var27, var36, var18, var19, var21, var9.field8971 & 65535, 65535 & var9.field8970, var9.field8967 & 65535);
                }
            }
        } else if (arg0 == -1) {
            class105 var44 = super.field1830[arg1][arg7];
            if (var44 != null) {
                if (super.field1823 == -1) {
                    for (int var45 = 0; var44.field1263 > var45; ++var45) {
                        int var46 = var44.field1264[var45] - -(arg1 << super.field1663);
                        short var47 = var44.field1257[var45];
                        int var48 = (arg7 << super.field1663) + var44.field1261[var45];
                        int var49 = (super.field1826 * var47 + (super.field1827 * var46 - -(super.field1833 * var48)) >> 14) + super.field1828;
                        if (var49 <= super.field1824.field8204) {
                            return;
                        }
                        int var50 = (super.field1829 * var48 + super.field1834 * var47 + super.field1815 * var46 >> 14) + super.field1814;
                        int var51 = (super.field1813 * var47 + (super.field1831 * var46 - -(super.field1818 * var48)) >> 14) + super.field1825;
                        arg3[var45] = super.field1824.field8178 * var51 / var49 + arg5.field3631;
                        arg4[var45] = arg5.field3639 - -(super.field1824.field8173 * var50 / var49);
                        arg2[var45] = var49;
                    }
                } else {
                    for (int var52 = 0; ~var44.field1263 < ~var52; ++var52) {
                        int var92 = var44.field1264[var52] - -(arg1 << super.field1663);
                        short var93 = var44.field1257[var52];
                        int var94 = var44.field1261[var52] - -(arg7 << super.field1663);
                        int var95 = (super.field1834 * var93 + (super.field1815 * var92 - -(super.field1829 * var94)) >> 14) + super.field1814;
                        int var96 = super.field1825 - -(super.field1818 * var94 + (super.field1831 * var92 - -(super.field1813 * var93)) >> 14);
                        arg3[var52] = super.field1824.field8178 * var96 / super.field1823 + arg5.field3631;
                        arg4[var52] = super.field1824.field8173 * var95 / super.field1823 + arg5.field3639;
                        arg2[var52] = super.field1823;
                    }
                }
                if (var44.field1258 == null) {
                    for (int var53 = 0; ~var44.field1267 < ~var53; ++var53) {
                        short var54 = var44.field1259[var53];
                        short var55 = var44.field1265[var53];
                        short var56 = var44.field1262[var53];
                        int var57 = arg3[var54];
                        int var58 = arg3[var55];
                        int var59 = arg3[var56];
                        int var60 = arg4[var54];
                        int var61 = arg4[var55];
                        int var62 = arg4[var56];
                        if ((-var58 + var57) * (-var61 + var62) - (-var58 + var59) * (-var61 + var60) > 0) {
                            int var63 = var44.field1256[var53];
                            if (~var63 != 0) {
                                arg5.field3638 = var57 < 0 || var58 < 0 || var59 < 0 || ~var57 < ~arg5.field3640 || arg5.field3640 < var58 || arg5.field3640 < var59;
                                arg5.method1693(var60, var61, var62, var57, var58, var59, arg2[1], arg2[2], arg2[3], class326.method2114(var44.field1255[var54], (byte) -42, var63), class326.method2114(var44.field1255[var55], (byte) -42, var63), class326.method2114(var44.field1255[var56], (byte) -42, var63));
                            }
                        }
                    }
                } else {
                    int var64 = super.field1816[arg1][arg7];
                    int var65 = super.field1816[arg1 + 1][arg7];
                    int var66 = super.field1816[arg1][arg7 - -1];
                    int var67 = super.field1662 * arg1;
                    int var68 = super.field1662 + var67;
                    int var69 = super.field1662 * arg7;
                    int var70 = super.field1662 + var69;
                    int var71 = (super.field1831 * var67 - -(super.field1813 * var64) - -(super.field1818 * var69) >> 14) + super.field1825;
                    int var72 = (super.field1829 * var69 + super.field1834 * var64 + super.field1815 * var67 >> 14) + super.field1814;
                    int var73 = (super.field1827 * var67 + super.field1833 * var69 + super.field1826 * var64 >> 14) + super.field1828;
                    int var74 = (super.field1818 * var69 + super.field1831 * var68 + super.field1813 * var65 >> 14) + super.field1825;
                    int var75 = (super.field1834 * var65 + super.field1815 * var68 - -(super.field1829 * var69) >> 14) + super.field1814;
                    int var76 = (super.field1833 * var69 + super.field1827 * var68 + super.field1826 * var65 >> 14) + super.field1828;
                    int var77 = (super.field1818 * var70 + super.field1831 * var67 + super.field1813 * var66 >> 14) + super.field1825;
                    int var78 = (super.field1829 * var70 + (super.field1815 * var67 - -(super.field1834 * var66)) >> 14) + super.field1814;
                    int var79 = (super.field1833 * var70 + super.field1827 * var67 - -(super.field1826 * var66) >> 14) + super.field1828;
                    for (int var80 = 0; var80 < var44.field1267; ++var80) {
                        short var81 = var44.field1259[var80];
                        short var82 = var44.field1265[var80];
                        short var83 = var44.field1262[var80];
                        int var84 = arg3[var81];
                        int var85 = arg3[var82];
                        int var86 = arg3[var83];
                        int var87 = arg4[var81];
                        int var88 = arg4[var82];
                        int var89 = arg4[var83];
                        if (~((var84 - var85) * (var89 - var88) + -((var87 - var88) * (-var85 + var86))) < -1) {
                            arg5.field3638 = ~var84 > -1 || ~var85 > -1 || var86 < 0 || arg5.field3640 < var84 || ~arg5.field3640 > ~var85 || ~arg5.field3640 > ~var86;
                            short var90 = var44.field1258[var80];
                            if (var90 == -1) {
                                int var91 = var44.field1256[var80];
                                if (var91 != -1) {
                                    arg5.method1693(var87, var88, var89, var84, var85, var86, arg2[1], arg2[2], arg2[3], class326.method2114(var44.field1255[var81], (byte) -42, var91), class326.method2114(var44.field1255[var82], (byte) -42, var91), class326.method2114(var44.field1255[var83], (byte) -42, var91));
                                }
                            } else {
                                if (this.method880(super.field1824.field8852.method438(107, var90).field8935)) {
                                    arg5.field3643 = 100;
                                }
                                arg5.method1703(var87, var88, var89, var84, var85, var86, var44.field1255[var81], var44.field1255[var82], var44.field1255[var83], var71, var74, var77, var72, var75, var78, var73, var76, var79, var90);
                                arg5.field3643 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[IIII[II[[ZLcaa;III)V", line = 1283)
    private final void method3603(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, boolean[][] arg7, class255 arg8, int arg9, int arg10, int arg11) {
        ++field9064;
        int var13 = (-arg3 + arg11) * arg10 / 256;
        arg8.field3635 = false;
        arg8.field3645 = false;
        int var14 = arg10 >> 8;
        int var15 = arg9;
        int var16 = arg6 - -var13;
        if (arg2 <= -44) {
            for (int var17 = arg4; arg0 > var17; ++var17) {
                for (int var18 = arg3; arg11 > var18; ++var18) {
                    if (arg7[-arg4 + var17][-arg3 + var18]) {
                        if (super.field1822[var17][var18] != null) {
                            class617 var19 = super.field1822[var17][var18];
                            if (var19.field8969 != -1 && ~(var19.field8968 & 2) == -1 && var19.field8966 == -1) {
                                int var20 = super.field1824.method3304(var19.field8969);
                                arg8.method1693(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class326.method2114(var19.field8965 & 65535, (byte) -42, var20), class326.method2114(var19.field8967 & 65535, (byte) -42, var20), class326.method2114(65535 & var19.field8970, (byte) -42, var20));
                                arg8.method1693(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class326.method2114(var19.field8971 & 65535, (byte) -42, var20), class326.method2114(var19.field8970 & 65535, (byte) -42, var20), class326.method2114(var19.field8967 & 65535, (byte) -42, var20));
                            } else if (var19.field8966 == -1) {
                                arg8.method1693(var16 - var14, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, 0, 0, 0, var19.field8965 & 65535, var19.field8967 & 65535, 65535 & var19.field8970);
                                arg8.method1693(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, var19.field8971 & 65535, 65535 & var19.field8970, 65535 & var19.field8967);
                            } else {
                                int var21 = var19.field8966;
                                arg8.method1693(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, 0, 0, 0, var21, var21, var21);
                                arg8.method1693(var16, var16, var16 - var14, var15, var14 + var15, var15, 0, 0, 0, var21, var21, var21);
                            }
                        } else if (super.field1830[var17][var18] != null) {
                            class105 var22 = super.field1830[var17][var18];
                            for (int var23 = 0; var23 < var22.field1263; ++var23) {
                                arg5[var23] = var15 - -(var22.field1264[var23] * var14 / super.field1662);
                                arg1[var23] = -(var22.field1261[var23] * var14 / super.field1662) + var16;
                            }
                            for (int var24 = 0; var24 < var22.field1267; ++var24) {
                                short var25 = var22.field1259[var24];
                                short var26 = var22.field1265[var24];
                                short var27 = var22.field1262[var24];
                                int var28 = arg5[var25];
                                int var29 = arg5[var26];
                                int var30 = arg5[var27];
                                int var31 = arg1[var25];
                                int var32 = arg1[var26];
                                int var33 = arg1[var27];
                                if (var22.field1266 != null && var22.field1266[var24] != -1) {
                                    int var34 = var22.field1266[var24];
                                    arg8.method1693(var31, var32, var33, var28, var29, var30, 0, 0, 0, class326.method2114(var22.field1255[var25], (byte) -42, var34), class326.method2114(var22.field1255[var26], (byte) -42, var34), class326.method2114(var22.field1255[var27], (byte) -42, var34));
                                } else if (var22.field1258 != null && ~var22.field1258[var24] != 0) {
                                    int var35 = super.field1824.method3304(var22.field1258[var24]);
                                    arg8.method1693(var31, var32, var33, var28, var29, var30, 0, 0, 0, class326.method2114(var22.field1255[var25], (byte) -42, var35), class326.method2114(var22.field1255[var26], (byte) -42, var35), class326.method2114(var22.field1255[var27], (byte) -42, var35));
                                } else {
                                    int var36 = var22.field1256[var24];
                                    arg8.method1693(var31, var32, var33, var28, var29, var30, 0, 0, 0, class326.method2114(var22.field1255[var25], (byte) -42, var36), class326.method2114(var22.field1255[var26], (byte) -42, var36), class326.method2114(var22.field1255[var27], (byte) -42, var36));
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var16 = arg6 + var13;
                var15 += var14;
            }
            arg8.field3635 = true;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V", line = 1424)
    public final void method254(int arg0, int arg1) {
        ++field9071;
        class51 var3 = (class51) super.field1824.method732(Thread.currentThread());
        var3.field539.field3643 = 0;
        if (super.field1832 != null) {
            this.method3597(super.field1824.field8169, true, var3.field7460, var3.field7423, var3.field7455, var3.field539, var3.field7429, arg0, arg1);
        } else if (super.field1822 != null) {
            this.method3602(-1, arg0, var3.field7455, var3.field7429, var3.field7423, var3.field539, var3.field7460, arg1);
        }
    }
}
