import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class324 extends class500 {

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "Lh;")
    public static class572 field4464 = new class572("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Z")
    public static boolean field4467 = false;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "Lvp;")
    public static class162 field4470 = null;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "[I")
    public static int[] field4469;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIB)V")
    public static final void method1942(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class100.field1452 = arg1;
        if (arg4 < 32) {
            field4464 = null;
        }
        class130.field1801 = arg0;
        class14.field136 = arg2;
        ++field4461;
        class3.field25 = arg3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
    public final void method583(int arg0, int arg1) {
        ++field4468;
        class240 var3 = (class240) super.field7090.method505(Thread.currentThread());
        var3.field3455.field7952 = 0;
        if (super.field7103 == null) {
            if (super.field7084 != null) {
                this.method1949((byte) -76, var3.field381, arg0, var3.field3455, arg1, var3.field345, var3.field363);
                return;
            }
        } else {
            this.method1943(var3.field381, 116, arg1, super.field7090.field851, arg0, var3.field345, var3.field3455, var3.field363);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIIZI[ILoo;[I)V")
    private final void method1943(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, class535 arg6, int[] arg7) {
        ++field4460;
        class225 var9 = super.field7103[arg4][arg2];
        if (var9 != null) {
            if ((2 & var9.field3250) == 0) {
                int var10 = super.field2694 * arg4;
                int var11 = var10 - -super.field2694;
                int var12 = super.field2694 * arg2;
                int var13 = var12 - -super.field2694;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
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
                int var45;
                if ((1 & var9.field3250) != 0 && !arg3) {
                    int var18 = super.field7087[arg4][arg2];
                    if (~super.field7095 != 0) {
                        var19 = super.field7095;
                        var20 = super.field7095;
                        var21 = super.field7095;
                        var22 = super.field7095;
                    } else {
                        int var23 = super.field7091 * var18;
                        var22 = (super.field7092 * var12 + super.field7097 * var10 + var23 >> 15) + super.field7104;
                        if (~super.field7090.field845 <= ~var22) {
                            return;
                        }
                        var21 = (super.field7092 * var12 + (super.field7097 * var11 - -var23) >> 15) + super.field7104;
                        if (super.field7090.field845 >= var21) {
                            return;
                        }
                        var20 = super.field7104 - -(super.field7092 * var13 + super.field7097 * var11 + var23 >> 15);
                        if (~super.field7090.field845 <= ~var20) {
                            return;
                        }
                        var19 = super.field7104 - -(super.field7092 * var13 + super.field7097 * var10 + var23 >> 15);
                        if (~super.field7090.field845 <= ~var19) {
                            return;
                        }
                    }
                    if (super.field7090.field856) {
                        int var24 = var22 - super.field7090.field837;
                        if (~var24 < -1) {
                            var14 = var24;
                            if (~var24 < -256) {
                                var14 = 255;
                            }
                        }
                        int var25 = -super.field7090.field837 + var21;
                        if (var25 > 0) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field7090.field837 + var20;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field7090.field837 + var19;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field7083 * var18;
                    int var29 = super.field7086 * var18;
                    var30 = (super.field7100 * var10 + super.field7089 * var12 + var28 >> 15) + super.field7098;
                    var31 = super.field7096 - -(super.field7101 * var10 + super.field7099 * var12 + var29 >> 15);
                    var32 = super.field7090.field843 * var30 / var22 + arg6.field7954;
                    var33 = super.field7090.field825 * var31 / var22 + arg6.field7961;
                    var34 = super.field7098 - -(super.field7089 * var12 + super.field7100 * var11 + var28 >> 15);
                    var35 = (super.field7101 * var11 + super.field7099 * var12 - -var29 >> 15) + super.field7096;
                    var36 = super.field7090.field843 * var34 / var21 + arg6.field7954;
                    var37 = (super.field7100 * var11 + super.field7089 * var13 + var28 >> 15) + super.field7098;
                    var38 = super.field7090.field825 * var35 / var21 + arg6.field7961;
                    var39 = (super.field7101 * var11 + super.field7099 * var13 - -var29 >> 15) + super.field7096;
                    var40 = super.field7090.field843 * var37 / var20 + arg6.field7954;
                    var41 = super.field7090.field825 * var39 / var20 + arg6.field7961;
                    var42 = (super.field7089 * var13 + super.field7100 * var10 + var28 >> 15) + super.field7098;
                    var43 = super.field7090.field843 * var42 / var19 + arg6.field7954;
                    var44 = (super.field7101 * var10 + super.field7099 * var13 + var29 >> 15) + super.field7096;
                    var45 = arg6.field7961 - -(super.field7090.field825 * var44 / var19);
                } else {
                    int var46 = super.field7087[arg4][arg2];
                    int var47 = super.field7087[arg4 + 1][arg2];
                    int var48 = super.field7087[arg4 + 1][arg2 + 1];
                    int var49 = super.field7087[arg4][arg2 + 1];
                    if (~super.field7095 != 0) {
                        var19 = super.field7095;
                        var20 = super.field7095;
                        var21 = super.field7095;
                        var22 = super.field7095;
                    } else {
                        var22 = super.field7104 - -(super.field7091 * var46 + super.field7097 * var10 + super.field7092 * var12 >> 15);
                        if (~super.field7090.field845 <= ~var22) {
                            return;
                        }
                        var21 = (super.field7092 * var12 + super.field7097 * var11 + super.field7091 * var47 >> 15) + super.field7104;
                        if (var21 <= super.field7090.field845) {
                            return;
                        }
                        var20 = (super.field7091 * var48 + super.field7097 * var11 + super.field7092 * var13 >> 15) + super.field7104;
                        if (~super.field7090.field845 <= ~var20) {
                            return;
                        }
                        var19 = super.field7104 - -(super.field7097 * var10 - (-(super.field7092 * var13) + -(super.field7091 * var49)) >> 15);
                        if (~var19 >= ~super.field7090.field845) {
                            return;
                        }
                    }
                    if (!arg3) {
                        if (super.field7090.field856) {
                            int var50 = var22 - super.field7090.field837;
                            if (var50 > 0) {
                                var14 = var50;
                                if (var50 > 255) {
                                    var14 = 255;
                                }
                            }
                            int var51 = -super.field7090.field837 + var21;
                            if (var51 > 0) {
                                var15 = var51;
                                if (var51 > 255) {
                                    var15 = 255;
                                }
                            }
                            int var52 = var20 - super.field7090.field837;
                            if (var52 > 0) {
                                var16 = var52;
                                if (~var52 < -256) {
                                    var16 = 255;
                                }
                            }
                            int var53 = -super.field7090.field837 + var19;
                            if (~var53 < -1) {
                                var17 = var53;
                                if (~var53 < -256) {
                                    var17 = 255;
                                }
                            }
                        }
                    } else {
                        int var54 = -super.field7090.field837 + var22;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (~var54 < -1) {
                            var14 = var54;
                            int var55 = var9.field3254 * var54 / 255;
                            if (var55 > 0) {
                                var46 -= var55;
                            }
                        }
                        int var56 = -super.field7090.field837 + var21;
                        if (var56 > 255) {
                            var56 = 255;
                        }
                        if (var56 > 0) {
                            var15 = var56;
                            int var57 = var9.field3257 * var56 / 255;
                            if (var57 > 0) {
                                var47 -= var57;
                            }
                        }
                        int var58 = -super.field7090.field837 + var20;
                        if (var58 > 255) {
                            var58 = 255;
                        }
                        if (~var58 < -1) {
                            var16 = var58;
                            int var59 = var9.field3248 * var58 / 255;
                            if (~var59 < -1) {
                                var48 -= var59;
                            }
                        }
                        int var60 = var19 - super.field7090.field837;
                        if (~var60 < -256) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var17 = var60;
                            int var61 = var9.field3256 * var60 / 255;
                            if (var61 > 0) {
                                var49 -= var61;
                            }
                        }
                    }
                    var30 = (super.field7100 * var10 + super.field7083 * var46 - -(super.field7089 * var12) >> 15) + super.field7098;
                    var32 = arg6.field7954 - -(super.field7090.field843 * var30 / var22);
                    var31 = (super.field7101 * var10 - (-(super.field7099 * var12) + -(super.field7086 * var46)) >> 15) + super.field7096;
                    var34 = (super.field7089 * var12 + super.field7100 * var11 + super.field7083 * var47 >> 15) + super.field7098;
                    var33 = super.field7090.field825 * var31 / var22 + arg6.field7961;
                    var36 = super.field7090.field843 * var34 / var21 + arg6.field7954;
                    var35 = (super.field7101 * var11 + super.field7099 * var12 + super.field7086 * var47 >> 15) + super.field7096;
                    var38 = super.field7090.field825 * var35 / var21 + arg6.field7961;
                    var37 = (super.field7089 * var13 + super.field7100 * var11 + super.field7083 * var48 >> 15) + super.field7098;
                    var39 = (super.field7099 * var13 + super.field7101 * var11 + super.field7086 * var48 >> 15) + super.field7096;
                    var40 = super.field7090.field843 * var37 / var20 + arg6.field7954;
                    var42 = (super.field7083 * var49 + super.field7100 * var10 + super.field7089 * var13 >> 15) + super.field7098;
                    var41 = super.field7090.field825 * var39 / var20 + arg6.field7961;
                    var43 = super.field7090.field843 * var42 / var19 + arg6.field7954;
                    var44 = (super.field7099 * var13 + super.field7101 * var10 + super.field7086 * var49 >> 15) + super.field7096;
                    var45 = super.field7090.field825 * var44 / var19 + arg6.field7961;
                }
                boolean var62 = ~var9.field3255 != 0 && this.method2985(super.field7090.field3092.method110(var9.field3255, (byte) 124).field6646);
                int var63 = var15 + var16 + var17;
                if ((-var43 + var40) * (-var45 + var38) + -((-var43 + var36) * (-var45 + var41)) > 0) {
                    arg6.field7955 = var40 < 0 || ~var43 > -1 || ~var36 > -1 || ~arg6.field7948 > ~var40 || arg6.field7948 < var43 || var36 > arg6.field7948;
                    if (~var63 <= -766) {
                        arg6.method3244(var41, var45, var38, var40, var43, var36, super.field7090.field854);
                    } else {
                        if (var62) {
                            arg6.field7952 = 100;
                        }
                        if (var63 <= 0) {
                            if (~var9.field3255 <= -1) {
                                arg6.method3242(var41, var45, var38, var40, var43, var36, var9.field3253, var9.field3252, var9.field3247, var37, var42, var34, var39, var44, var35, var20, var19, var21, var9.field3255);
                            } else {
                                arg6.method3236(var41, var45, var38, var40, var43, var36, var9.field3253, var9.field3252, var9.field3247);
                            }
                        } else if (var9.field3255 >= 0) {
                            arg6.method3233(var41, var45, var38, var40, var43, var36, super.field7090.field854, var16, var17, var15, var9.field3253, var9.field3252, var9.field3247, var37, var42, var34, var39, var44, var35, var20, var19, var21, var9.field3255);
                        } else {
                            arg6.method3236(var41, var45, var38, var40, var43, var36, class199.method1338(super.field7090.field854 | var16 << 24, (byte) -118, var9.field3253), class199.method1338(super.field7090.field854 | var17 << 24, (byte) -117, var9.field3252), class199.method1338(var15 << 24 | super.field7090.field854, (byte) -111, var9.field3247));
                        }
                        arg6.field7952 = 0;
                    }
                }
                int var64 = var14 - -var17 + var15;
                if ((-var36 + var32) * (-var38 + var45) + -((-var36 + var43) * (-var38 + var33)) > 0) {
                    arg6.field7955 = var32 < 0 || ~var36 > -1 || ~var43 > -1 || var32 > arg6.field7948 || ~arg6.field7948 > ~var36 || ~arg6.field7948 > ~var43;
                    if (var64 < 765) {
                        if (var62) {
                            arg6.field7952 = 100;
                        }
                        if (var64 <= 0) {
                            if (~var9.field3255 > -1) {
                                arg6.method3236(var33, var38, var45, var32, var36, var43, var9.field3249, var9.field3247, var9.field3252);
                            } else {
                                arg6.method3242(var33, var38, var45, var32, var36, var43, var9.field3249, var9.field3247, var9.field3252, var30, var34, var42, var31, var35, var44, var22, var21, var19, var9.field3255);
                            }
                        } else if (~var9.field3255 > -1) {
                            arg6.method3236(var33, var38, var45, var32, var36, var43, class199.method1338(super.field7090.field854 | var14 << 24, (byte) -77, var9.field3249), class199.method1338(var15 << 24 | super.field7090.field854, (byte) -111, var9.field3247), class199.method1338(super.field7090.field854 | var17 << 24, (byte) -117, var9.field3252));
                        } else {
                            arg6.method3233(var33, var38, var45, var32, var36, var43, super.field7090.field854, var14, var15, var17, var9.field3249, var9.field3247, var9.field3252, var30, var34, var42, var31, var35, var44, var22, var21, var19, var9.field3255);
                        }
                        arg6.field7952 = 0;
                        return;
                    }
                    arg6.method3244(var33, var38, var45, var32, var36, var43, super.field7090.field854);
                }
            }
        } else {
            class108 var65 = super.field7085[arg4][arg2];
            if (var65 != null) {
                if (super.field7095 == -1) {
                    for (int var66 = 0; var66 < var65.field1550; ++var66) {
                        int var67 = (arg4 << super.field2695) + var65.field1549[var66];
                        int var68 = var65.field1551[var66];
                        int var69 = var65.field1546[var66] - -(arg2 << super.field2695);
                        int var70 = super.field7104 - -(super.field7097 * var67 - -(super.field7091 * var68) - -(super.field7092 * var69) >> 15);
                        if (super.field7090.field845 >= var70) {
                            return;
                        }
                        arg0[var66] = 0;
                        if (arg3) {
                            int var71 = -super.field7090.field837 + var70;
                            if (~var71 < -256) {
                                var71 = 255;
                            }
                            if (var71 > 0) {
                                arg0[var66] = var71;
                                int var72 = var65.field1545[var66] * var71 / 255;
                                if (~var72 < -1) {
                                    var68 -= var72;
                                }
                            }
                        } else if (super.field7090.field856) {
                            int var73 = -super.field7090.field837 + var70;
                            if (~var73 < -1) {
                                arg0[var66] = var73;
                                if (arg0[var66] > 255) {
                                    arg0[var66] = 255;
                                }
                            }
                        }
                        int var74 = (super.field7089 * var69 + (super.field7100 * var67 - -(super.field7083 * var68)) >> 15) + super.field7098;
                        int var75 = (super.field7101 * var67 + super.field7099 * var69 - -(super.field7086 * var68) >> 15) + super.field7096;
                        arg5[var66] = super.field7090.field843 * var74 / var70 + arg6.field7954;
                        arg7[var66] = super.field7090.field825 * var75 / var70 + arg6.field7961;
                    }
                } else {
                    for (int var76 = 0; ~var65.field1550 < ~var76; ++var76) {
                        int var116 = (arg4 << super.field2695) + var65.field1549[var76];
                        int var117 = var65.field1551[var76];
                        int var118 = (arg2 << super.field2695) + var65.field1546[var76];
                        arg0[var76] = 0;
                        if (!arg3) {
                            if (super.field7090.field856) {
                                int var119 = -super.field7090.field837 + super.field7095;
                                if (var119 > 0) {
                                    arg0[var76] = var119;
                                    if (~arg0[var76] < -256) {
                                        arg0[var76] = 255;
                                    }
                                }
                            }
                        } else {
                            int var120 = super.field7095 - super.field7090.field837;
                            if (var120 > 255) {
                                var120 = 255;
                            }
                            if (var120 > 0) {
                                arg0[var76] = var120;
                                int var121 = var65.field1545[var76] * var120 / 255;
                                if (~var121 < -1) {
                                    var117 -= var121;
                                }
                            }
                        }
                        int var122 = (super.field7100 * var116 - -(super.field7083 * var117) - -(super.field7089 * var118) >> 15) + super.field7098;
                        int var123 = (super.field7099 * var118 + super.field7101 * var116 + super.field7086 * var117 >> 15) + super.field7096;
                        arg5[var76] = super.field7090.field843 * var122 / super.field7095 + arg6.field7954;
                        arg7[var76] = super.field7090.field825 * var123 / super.field7095 + arg6.field7961;
                    }
                }
                if (var65.field1553 == null) {
                    for (int var77 = 0; var65.field1547 > var77; ++var77) {
                        int var78 = var77 * 3;
                        int var79 = var78 + 1;
                        int var80 = var79 + 1;
                        int var81 = arg5[var78];
                        int var82 = arg5[var79];
                        int var83 = arg5[var80];
                        int var84 = arg7[var78];
                        int var85 = arg7[var79];
                        int var86 = arg7[var80];
                        int var87 = arg0[var78] + arg0[var79] + arg0[var80];
                        if ((-var82 + var81) * (-var85 + var86) + -((var84 - var85) * (-var82 + var83)) > 0) {
                            arg6.field7955 = var81 < 0 || var82 < 0 || var83 < 0 || ~arg6.field7948 > ~var81 || ~arg6.field7948 > ~var82 || ~arg6.field7948 > ~var83;
                            if (var87 < 765) {
                                if (~var87 < -1) {
                                    if (~(16777215 & var65.field1548[var78]) != -1) {
                                        arg6.method3236(var84, var85, var86, var81, var82, var83, class428.method2506(var65.field1548[var78], (byte) -88, super.field7090.field854, arg0[var78]), class428.method2506(var65.field1548[var79], (byte) -105, super.field7090.field854, arg0[var79]), class428.method2506(var65.field1548[var80], (byte) -117, super.field7090.field854, arg0[var80]));
                                    }
                                } else if ((var65.field1548[var78] & 16777215) != 0) {
                                    arg6.method3236(var84, var85, var86, var81, var82, var83, var65.field1548[var78], var65.field1548[var79], var65.field1548[var80]);
                                }
                            } else {
                                arg6.method3244(var84, var85, var86, var81, var82, var83, super.field7090.field854);
                            }
                        }
                    }
                } else {
                    int var88 = super.field7087[arg4][arg2];
                    int var89 = super.field7087[arg4 - -1][arg2];
                    int var90 = super.field7087[arg4][arg2 - -1];
                    int var91 = super.field2694 * arg4;
                    int var92 = super.field2694 + var91;
                    int var93 = super.field2694 * arg2;
                    int var94 = super.field2694 + var93;
                    int var95 = super.field7098 - -(super.field7089 * var93 + super.field7100 * var91 + super.field7083 * var88 >> 15);
                    int var96 = super.field7096 - -(super.field7101 * var91 - (-(super.field7099 * var93) + -(super.field7086 * var88)) >> 15);
                    int var97 = (super.field7097 * var91 + super.field7092 * var93 + super.field7091 * var88 >> 15) + super.field7104;
                    int var98 = (super.field7083 * var89 + super.field7100 * var92 + super.field7089 * var93 >> 15) + super.field7098;
                    int var99 = (super.field7099 * var93 + super.field7101 * var92 + super.field7086 * var89 >> 15) + super.field7096;
                    int var100 = (super.field7091 * var89 + super.field7097 * var92 + super.field7092 * var93 >> 15) + super.field7104;
                    int var101 = (super.field7083 * var90 + super.field7100 * var91 + super.field7089 * var94 >> 15) + super.field7098;
                    int var102 = (super.field7086 * var90 + super.field7101 * var91 + super.field7099 * var94 >> 15) + super.field7096;
                    int var103 = (super.field7092 * var94 + super.field7097 * var91 + super.field7091 * var90 >> 15) + super.field7104;
                    for (int var104 = 0; ~var104 > ~var65.field1547; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 + 1;
                        int var107 = var106 + 1;
                        int var108 = arg5[var105];
                        int var109 = arg5[var106];
                        int var110 = arg5[var107];
                        int var111 = arg7[var105];
                        int var112 = arg7[var106];
                        int var113 = arg7[var107];
                        int var114 = arg0[var105] + arg0[var106] + arg0[var107];
                        if (~((var113 - var112) * (-var109 + var108) - (-var109 + var110) * (-var112 + var111)) < -1) {
                            arg6.field7955 = ~var108 > -1 || ~var109 > -1 || var110 < 0 || ~var108 < ~arg6.field7948 || var109 > arg6.field7948 || var110 > arg6.field7948;
                            short var115 = var65.field1553[var104];
                            if (~var114 > -766) {
                                if (var115 != -1 && this.method2985(super.field7090.field3092.method110(var115, (byte) 103).field6646)) {
                                    arg6.field7952 = 100;
                                }
                                if (~var114 >= -1) {
                                    if (~var115 != 0) {
                                        arg6.method3242(var111, var112, var113, var108, var109, var110, var65.field1548[var105], var65.field1548[var106], var65.field1548[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                    } else if ((16777215 & var65.field1548[var105]) != 0) {
                                        arg6.method3236(var111, var112, var113, var108, var109, var110, var65.field1548[var105], var65.field1548[var106], var65.field1548[var107]);
                                    }
                                } else if (~var115 == 0) {
                                    if (~(16777215 & var65.field1548[var105]) != -1) {
                                        arg6.method3236(var111, var112, var113, var108, var109, var110, class199.method1338(super.field7090.field854 | arg0[var105] << 24, (byte) -118, var65.field1548[var105]), class199.method1338(super.field7090.field854 | arg0[var106] << 24, (byte) -119, var65.field1548[var106]), class199.method1338(arg0[var107] << 24 | super.field7090.field854, (byte) -118, var65.field1548[var107]));
                                    }
                                } else {
                                    arg6.method3233(var111, var112, var113, var108, var109, var110, super.field7090.field854, arg0[var105], arg0[var106], arg0[var107], var65.field1548[var105], var65.field1548[var106], var65.field1548[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                }
                                arg6.field7952 = 0;
                            } else {
                                arg6.method3244(var111, var112, var113, var108, var109, var110, super.field7090.field854);
                            }
                        }
                    }
                }
            }
            if (arg1 <= 0) {
                field4467 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZII[I[IIILoo;[[ZIII)V")
    private final void method1944(boolean arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, class535 arg7, boolean[][] arg8, int arg9, int arg10, int arg11) {
        ++field4471;
        int var13 = (-arg11 + arg6) * arg2 / 256;
        arg7.field7951 = false;
        int var14 = arg2 >> 8;
        arg7.field7950 = arg0;
        int var15 = arg1;
        int var16 = arg5 + var13;
        for (int var17 = arg9; arg10 > var17; ++var17) {
            for (int var18 = arg11; var18 < arg6; ++var18) {
                if (arg8[var17 - arg9][-arg11 + var18]) {
                    if (super.field7084[var17][var18] != null) {
                        class4 var19 = super.field7084[var17][var18];
                        if (~var19.field31 != 0 && ~(var19.field34 & 2) == -1 && ~var19.field33 == 0) {
                            int var20 = super.field7090.method476(var19.field31);
                            arg7.method3239(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, class588.method3495(var20, 65535 & var19.field36, (byte) -125), class588.method3495(var20, var19.field35 & 65535, (byte) -108), class588.method3495(var20, 65535 & var19.field32, (byte) -111));
                            arg7.method3239(var16, var16, -var14 + var16, var15, var15 - -var14, var15, class588.method3495(var20, var19.field37 & 65535, (byte) 53), class588.method3495(var20, 65535 & var19.field32, (byte) -112), class588.method3495(var20, 65535 & var19.field35, (byte) 17));
                        } else if (~var19.field33 != 0) {
                            int var21 = var19.field33;
                            arg7.method3239(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, var21, var21, var21);
                            arg7.method3239(var16, var16, -var14 + var16, var15, var14 + var15, var15, var21, var21, var21);
                        } else {
                            arg7.method3239(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 65535 & var19.field36, 65535 & var19.field35, var19.field32 & 65535);
                            arg7.method3239(var16, var16, var16 - var14, var15, var14 + var15, var15, var19.field37 & 65535, var19.field32 & 65535, 65535 & var19.field35);
                        }
                    } else if (super.field7093[var17][var18] != null) {
                        class258 var22 = super.field7093[var17][var18];
                        for (int var23 = 0; var23 < var22.field3695; ++var23) {
                            arg4[var23] = var22.field3684[var23] * var14 / super.field2694 + var15;
                            arg3[var23] = -(var22.field3691[var23] * var14 / super.field2694) + var16;
                        }
                        for (int var24 = 0; ~var22.field3693 < ~var24; ++var24) {
                            short var25 = var22.field3690[var24];
                            short var26 = var22.field3686[var24];
                            short var27 = var22.field3692[var24];
                            int var28 = arg4[var25];
                            int var29 = arg4[var26];
                            int var30 = arg4[var27];
                            int var31 = arg3[var25];
                            int var32 = arg3[var26];
                            int var33 = arg3[var27];
                            if (var22.field3689 != null && ~var22.field3689[var24] != 0) {
                                int var34 = var22.field3689[var24];
                                arg7.method3239(var31, var32, var33, var28, var29, var30, class588.method3495(var34, var22.field3685[var25], (byte) 94), class588.method3495(var34, var22.field3685[var26], (byte) -112), class588.method3495(var34, var22.field3685[var27], (byte) -76));
                            } else if (var22.field3683 != null && var22.field3683[var24] != -1) {
                                int var35 = super.field7090.method476(var22.field3683[var24]);
                                arg7.method3239(var31, var32, var33, var28, var29, var30, class588.method3495(var35, var22.field3685[var25], (byte) -116), class588.method3495(var35, var22.field3685[var26], (byte) 12), class588.method3495(var35, var22.field3685[var27], (byte) -79));
                            } else {
                                int var36 = var22.field3688[var24];
                                arg7.method3239(var31, var32, var33, var28, var29, var30, class588.method3495(var36, var22.field3685[var25], (byte) -117), class588.method3495(var36, var22.field3685[var26], (byte) 5), class588.method3495(var36, var22.field3685[var27], (byte) -74));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg5 + var13;
        }
        arg7.field7951 = true;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static void method1945(int arg0) {
        field4469 = null;
        if (arg0 != -1) {
            field4467 = false;
        }
        field4464 = null;
        field4470 = null;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public static final void method1946(int arg0) {
        ++field4458;
        if (!class347.field4759) {
            if (arg0 != 19349) {
                field4464 = null;
            }
            class117.method841(1, class72.field988);
            if (class297.field4081 != null) {
                class117.method841(1, class297.field4081);
            }
            class347.field4759 = true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lpm;BLpm;)V")
    public static final void method1947(class501 arg0, byte arg1, class501 arg2) {
        ++field4462;
        if (arg0.field7112 != null) {
            arg0.method2987(arg1 + -29);
        }
        arg0.field7112 = arg2;
        if (arg1 != 28) {
            method1946(-1);
        }
        arg0.field7110 = arg2.field7110;
        arg0.field7112.field7110 = arg0;
        arg0.field7110.field7112 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4459;
        class240 var9 = (class240) super.field7090.method505(Thread.currentThread());
        class535 var10 = var9.field3455;
        var10.field7955 = false;
        var10.field7952 = 0;
        if (super.field7103 != null) {
            this.method1948(arg6, arg2, arg0, -43, var9.field345, arg4, arg3, arg7, arg1, var10, var9.field363, arg5);
        } else if (super.field7084 != null) {
            this.method1944(false, arg0, arg2, var9.field363, var9.field345, arg1, arg6, var10, arg7, arg3, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Law;IIII[[I[[II)V")
    public class324(class67 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII[III[[ZILoo;[II)V")
    private final void method1948(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean[][] arg7, int arg8, class535 arg9, int[] arg10, int arg11) {
        ++field4463;
        if (arg3 < -10) {
            int var13 = (-arg5 + arg0) * arg1 / 256;
            arg9.field7951 = false;
            arg9.field7950 = false;
            int var14 = arg1 >> 8;
            int var15 = arg2;
            int var16 = arg8 + var13;
            for (int var17 = arg6; var17 < arg11; ++var17) {
                for (int var18 = arg5; var18 < arg0; ++var18) {
                    if (arg7[-arg6 + var17][-arg5 + var18]) {
                        if (super.field7103[var17][var18] != null) {
                            class225 var33 = super.field7103[var17][var18];
                            if (var33.field3255 != -1 && ~(2 & var33.field3250) == -1 && ~var33.field3251 == -1) {
                                int var34 = super.field7090.method476(var33.field3255);
                                arg9.method3239(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, class588.method3495(var34, var33.field3253, (byte) 77), class588.method3495(var34, var33.field3252, (byte) -69), class588.method3495(var34, var33.field3247, (byte) 0));
                                arg9.method3239(var16, var16, var16 - var14, var15, var14 + var15, var15, class588.method3495(var34, var33.field3249, (byte) 3), class588.method3495(var34, var33.field3247, (byte) -104), class588.method3495(var34, var33.field3252, (byte) 14));
                            } else if (~var33.field3251 == -1) {
                                arg9.method3236(var16 - var14, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, var33.field3253, var33.field3252, var33.field3247);
                                arg9.method3236(var16, var16, -var14 + var16, var15, var14 + var15, var15, var33.field3249, var33.field3247, var33.field3252);
                            } else {
                                int var35 = var33.field3251;
                                arg9.method3236(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class199.method1338(-16777216 & var33.field3253, (byte) -66, var35), class199.method1338(var33.field3252 & -16777216, (byte) -101, var35), class199.method1338(-16777216 & var33.field3247, (byte) -86, var35));
                                arg9.method3236(var16, var16, -var14 + var16, var15, var14 + var15, var15, class199.method1338(-16777216 & var33.field3249, (byte) -90, var35), class199.method1338(var33.field3247 & -16777216, (byte) -81, var35), class199.method1338(var33.field3252 & -16777216, (byte) -68, var35));
                            }
                        } else if (super.field7085[var17][var18] != null) {
                            class108 var19 = super.field7085[var17][var18];
                            for (int var20 = 0; var20 < var19.field1550; ++var20) {
                                arg4[var20] = var15 - -(var19.field1549[var20] * var14 / super.field2694);
                                arg10[var20] = -(var19.field1546[var20] * var14 / super.field2694) + var16;
                            }
                            for (int var21 = 0; ~var19.field1547 < ~var21; ++var21) {
                                int var22 = var21 * 3;
                                int var23 = var22 + 1;
                                int var24 = var23 - -1;
                                int var25 = arg4[var22];
                                int var26 = arg4[var23];
                                int var27 = arg4[var24];
                                int var28 = arg10[var22];
                                int var29 = arg10[var23];
                                int var30 = arg10[var24];
                                if (var19.field1544 != null && ~var19.field1544[var21] != -1 && (var19.field1553 == null || var19.field1553 != null && var19.field1553[var21] == -1)) {
                                    int var31 = var19.field1544[var21];
                                    arg9.method3236(var28, var29, var30, var25, var26, var27, class199.method1338(-(var19.field1548[var22] & -16777216) + -16777216, (byte) -89, var31), class199.method1338(-16777216 - (var19.field1548[var23] & -16777216), (byte) -87, var31), class199.method1338(-16777216 - (var19.field1548[var24] & -16777216), (byte) -119, var31));
                                } else if (var19.field1553 != null && ~var19.field1553[var21] != 0) {
                                    int var32 = super.field7090.method476(var19.field1553[var21]);
                                    arg9.method3239(var28, var29, var30, var25, var26, var27, var32, var32, var32);
                                } else {
                                    arg9.method3236(var28, var29, var30, var25, var26, var27, var19.field1548[var22], var19.field1548[var23], var19.field1548[var24]);
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var16 = arg8 + var13;
                var15 += var14;
            }
            arg9.field7951 = true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[IILoo;I[I[I)V")
    private final void method1949(byte arg0, int[] arg1, int arg2, class535 arg3, int arg4, int[] arg5, int[] arg6) {
        ++field4465;
        class4 var8 = super.field7084[arg2][arg4];
        if (var8 != null) {
            if (~(var8.field34 & 2) == -1) {
                int var9 = super.field2694 * arg2;
                int var10 = super.field2694 + var9;
                int var11 = super.field2694 * arg4;
                int var12 = super.field2694 + var11;
                int var15;
                int var16;
                int var18;
                int var20;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                if ((var8.field34 & 1) != 0) {
                    int var13 = super.field7087[arg2][arg4];
                    int var17;
                    if (super.field7095 == -1) {
                        int var14 = super.field7091 * var13;
                        var15 = (super.field7097 * var9 + super.field7092 * var11 - -var14 >> 15) + super.field7104;
                        if (var15 <= super.field7090.field845) {
                            return;
                        }
                        var16 = (super.field7092 * var11 + super.field7097 * var10 + var14 >> 15) + super.field7104;
                        if (super.field7090.field845 >= var16) {
                            return;
                        }
                        var17 = super.field7104 - -(super.field7092 * var12 + (super.field7097 * var10 - -var14) >> 15);
                        if (~super.field7090.field845 <= ~var17) {
                            return;
                        }
                        var18 = (super.field7097 * var9 - (-var14 - super.field7092 * var12) >> 15) + super.field7104;
                        if (~var18 >= ~super.field7090.field845) {
                            return;
                        }
                    } else {
                        var18 = super.field7095;
                        var17 = super.field7095;
                        var16 = super.field7095;
                        var15 = super.field7095;
                    }
                    int var19 = super.field7083 * var13;
                    var20 = super.field7098 - -(super.field7089 * var11 + super.field7100 * var9 + var19 >> 15);
                    int var21 = super.field7086 * var13;
                    var22 = (super.field7101 * var9 + var21 - -(super.field7099 * var11) >> 15) + super.field7096;
                    var23 = arg3.field7954 - -(super.field7090.field843 * var20 / var15);
                    var24 = super.field7098 - -(super.field7100 * var10 - -(super.field7089 * var11) + var19 >> 15);
                    var25 = super.field7090.field825 * var22 / var15 + arg3.field7961;
                    var26 = super.field7090.field843 * var24 / var16 + arg3.field7954;
                    var27 = (super.field7101 * var10 - -(super.field7099 * var11) + var21 >> 15) + super.field7096;
                    var28 = super.field7090.field825 * var27 / var16 + arg3.field7961;
                    int var29 = (super.field7089 * var12 + super.field7100 * var10 + var19 >> 15) + super.field7098;
                    int var30 = (super.field7099 * var12 + super.field7101 * var10 + var21 >> 15) + super.field7096;
                    var31 = super.field7090.field843 * var29 / var17 + arg3.field7954;
                    var32 = super.field7090.field825 * var30 / var17 + arg3.field7961;
                    var33 = super.field7098 - -(super.field7100 * var9 + super.field7089 * var12 + var19 >> 15);
                    var34 = super.field7096 - -(super.field7101 * var9 + var21 - -(super.field7099 * var12) >> 15);
                    var35 = super.field7090.field843 * var33 / var18 + arg3.field7954;
                    var36 = super.field7090.field825 * var34 / var18 + arg3.field7961;
                } else {
                    int var37 = super.field7087[arg2][arg4];
                    int var38 = super.field7087[arg2 + 1][arg4];
                    int var39 = super.field7087[arg2 + 1][arg4 + 1];
                    int var40 = super.field7087[arg2][arg4 + 1];
                    int var41;
                    if (super.field7095 != -1) {
                        var18 = super.field7095;
                        var41 = super.field7095;
                        var16 = super.field7095;
                        var15 = super.field7095;
                    } else {
                        var15 = super.field7104 - -(super.field7097 * var9 + super.field7092 * var11 + super.field7091 * var37 >> 15);
                        if (~var15 >= ~super.field7090.field845) {
                            return;
                        }
                        var16 = super.field7104 - -(super.field7091 * var38 + (super.field7097 * var10 - -(super.field7092 * var11)) >> 15);
                        if (var16 <= super.field7090.field845) {
                            return;
                        }
                        var41 = super.field7104 - -(super.field7097 * var10 - -(super.field7091 * var39) - -(super.field7092 * var12) >> 15);
                        if (~var41 >= ~super.field7090.field845) {
                            return;
                        }
                        var18 = (super.field7097 * var9 + (super.field7091 * var40 - -(super.field7092 * var12)) >> 15) + super.field7104;
                        if (~super.field7090.field845 <= ~var18) {
                            return;
                        }
                    }
                    var20 = (super.field7089 * var11 + (super.field7100 * var9 - -(super.field7083 * var37)) >> 15) + super.field7098;
                    var22 = (super.field7086 * var37 + super.field7101 * var9 + super.field7099 * var11 >> 15) + super.field7096;
                    var23 = super.field7090.field843 * var20 / var15 + arg3.field7954;
                    var24 = (super.field7083 * var38 + super.field7100 * var10 + super.field7089 * var11 >> 15) + super.field7098;
                    var25 = super.field7090.field825 * var22 / var15 + arg3.field7961;
                    var27 = (super.field7086 * var38 + super.field7101 * var10 + super.field7099 * var11 >> 15) + super.field7096;
                    var26 = arg3.field7954 - -(super.field7090.field843 * var24 / var16);
                    var28 = super.field7090.field825 * var27 / var16 + arg3.field7961;
                    int var42 = super.field7098 - -(super.field7100 * var10 - (-(super.field7089 * var12) + -(super.field7083 * var39)) >> 15);
                    var31 = super.field7090.field843 * var42 / var41 + arg3.field7954;
                    int var43 = super.field7096 - -(super.field7101 * var10 + super.field7099 * var12 - -(super.field7086 * var39) >> 15);
                    var33 = (super.field7083 * var40 + super.field7100 * var9 + super.field7089 * var12 >> 15) + super.field7098;
                    var32 = arg3.field7961 - -(super.field7090.field825 * var43 / var41);
                    var35 = arg3.field7954 - -(super.field7090.field843 * var33 / var18);
                    var34 = (super.field7101 * var9 - -(super.field7086 * var40) - -(super.field7099 * var12) >> 15) + super.field7096;
                    var36 = super.field7090.field825 * var34 / var18 + arg3.field7961;
                }
                if ((var31 - var35) * (-var36 + var28) + -((var32 - var36) * (-var35 + var26)) > 0) {
                    arg3.field7955 = var31 < 0 || var35 < 0 || ~var26 > -1 || arg3.field7948 < var31 || ~arg3.field7948 > ~var35 || ~var26 < ~arg3.field7948;
                    if (~var8.field31 <= -1) {
                        if (this.method2985(super.field7090.field3092.method110(var8.field31, (byte) 114).field6646)) {
                            arg3.field7952 = 100;
                        }
                        arg3.method3242(var32, var36, var28, var31, var35, var26, 65535 & var8.field36, var8.field35 & 65535, var8.field32 & 65535, var20, var24, var33, var22, var27, var34, var15, var16, var18, var8.field31);
                        arg3.field7952 = 0;
                    } else {
                        arg3.method3239(var32, var36, var28, var31, var35, var26, var8.field36 & 65535, 65535 & var8.field35, var8.field32 & 65535);
                    }
                }
                if (~((-var26 + var23) * (-var28 + var36) - (var35 - var26) * (-var28 + var25)) < -1) {
                    arg3.field7955 = var23 < 0 || ~var26 > -1 || ~var35 > -1 || arg3.field7948 < var23 || ~var26 < ~arg3.field7948 || ~arg3.field7948 > ~var35;
                    if (~var8.field31 <= -1) {
                        if (this.method2985(super.field7090.field3092.method110(var8.field31, (byte) 120).field6646)) {
                            arg3.field7952 = 100;
                        }
                        arg3.method3242(var25, var28, var36, var23, var26, var35, var8.field37 & 65535, var8.field32 & 65535, var8.field35 & 65535, var20, var24, var33, var22, var27, var34, var15, var16, var18, var8.field31);
                        arg3.field7952 = 0;
                        return;
                    }
                    arg3.method3239(var25, var28, var36, var23, var26, var35, 65535 & var8.field37, var8.field32 & 65535, 65535 & var8.field35);
                }
            }
        } else {
            class258 var44 = super.field7093[arg2][arg4];
            if (arg0 > -70) {
                method1950((byte) -51, (class328) null);
            }
            if (var44 != null) {
                if (super.field7095 == -1) {
                    for (int var45 = 0; ~var45 > ~var44.field3695; ++var45) {
                        int var46 = (arg2 << super.field2695) + var44.field3684[var45];
                        short var47 = var44.field3694[var45];
                        int var48 = var44.field3691[var45] - -(arg4 << super.field2695);
                        int var49 = (super.field7092 * var48 + (super.field7097 * var46 - -(super.field7091 * var47)) >> 15) + super.field7104;
                        if (super.field7090.field845 >= var49) {
                            return;
                        }
                        int var50 = (super.field7101 * var46 + super.field7099 * var48 - -(super.field7086 * var47) >> 15) + super.field7096;
                        int var51 = (super.field7089 * var48 + super.field7100 * var46 + super.field7083 * var47 >> 15) + super.field7098;
                        arg5[var45] = super.field7090.field843 * var51 / var49 + arg3.field7954;
                        arg6[var45] = arg3.field7961 - -(super.field7090.field825 * var50 / var49);
                    }
                } else {
                    for (int var52 = 0; ~var52 > ~var44.field3695; ++var52) {
                        int var92 = (arg2 << super.field2695) + var44.field3684[var52];
                        short var93 = var44.field3694[var52];
                        int var94 = var44.field3691[var52] - -(arg4 << super.field2695);
                        int var95 = (super.field7101 * var92 + super.field7099 * var94 - -(super.field7086 * var93) >> 15) + super.field7096;
                        int var96 = (super.field7083 * var93 + super.field7100 * var92 + super.field7089 * var94 >> 15) + super.field7098;
                        arg5[var52] = super.field7090.field843 * var96 / super.field7095 + arg3.field7954;
                        arg6[var52] = super.field7090.field825 * var95 / super.field7095 + arg3.field7961;
                    }
                }
                if (var44.field3683 == null) {
                    for (int var53 = 0; ~var44.field3693 < ~var53; ++var53) {
                        short var54 = var44.field3690[var53];
                        short var55 = var44.field3686[var53];
                        short var56 = var44.field3692[var53];
                        int var57 = arg5[var54];
                        int var58 = arg5[var55];
                        int var59 = arg5[var56];
                        int var60 = arg6[var54];
                        int var61 = arg6[var55];
                        int var62 = arg6[var56];
                        if ((-var58 + var57) * (-var61 + var62) - (-var58 + var59) * (-var61 + var60) > 0) {
                            int var63 = var44.field3688[var53];
                            if (var63 != -1) {
                                arg3.field7955 = var57 < 0 || ~var58 > -1 || ~var59 > -1 || ~var57 < ~arg3.field7948 || var58 > arg3.field7948 || arg3.field7948 < var59;
                                arg3.method3239(var60, var61, var62, var57, var58, var59, class588.method3495(var63, var44.field3685[var54], (byte) 122), class588.method3495(var63, var44.field3685[var55], (byte) -108), class588.method3495(var63, var44.field3685[var56], (byte) -83));
                            }
                        }
                    }
                } else {
                    int var64 = super.field7087[arg2][arg4];
                    int var65 = super.field7087[arg2 + 1][arg4];
                    int var66 = super.field7087[arg2][arg4 + 1];
                    int var67 = super.field2694 * arg2;
                    int var68 = var67 - -super.field2694;
                    int var69 = super.field2694 * arg4;
                    int var70 = super.field2694 + var69;
                    int var71 = (super.field7089 * var69 + super.field7100 * var67 + super.field7083 * var64 >> 15) + super.field7098;
                    int var72 = super.field7096 - -(super.field7086 * var64 + (super.field7101 * var67 - -(super.field7099 * var69)) >> 15);
                    int var73 = (super.field7092 * var69 + super.field7097 * var67 + super.field7091 * var64 >> 15) + super.field7104;
                    int var74 = super.field7098 - -(super.field7083 * var65 + super.field7100 * var68 + super.field7089 * var69 >> 15);
                    int var75 = super.field7096 - -(super.field7099 * var69 + super.field7101 * var68 + super.field7086 * var65 >> 15);
                    int var76 = (super.field7092 * var69 + (super.field7097 * var68 - -(super.field7091 * var65)) >> 15) + super.field7104;
                    int var77 = (super.field7100 * var67 + super.field7089 * var70 - -(super.field7083 * var66) >> 15) + super.field7098;
                    int var78 = (super.field7099 * var70 + super.field7101 * var67 + super.field7086 * var66 >> 15) + super.field7096;
                    int var79 = super.field7104 - -(super.field7091 * var66 + (super.field7097 * var67 - -(super.field7092 * var70)) >> 15);
                    for (int var80 = 0; ~var80 > ~var44.field3693; ++var80) {
                        short var81 = var44.field3690[var80];
                        short var82 = var44.field3686[var80];
                        short var83 = var44.field3692[var80];
                        int var84 = arg5[var81];
                        int var85 = arg5[var82];
                        int var86 = arg5[var83];
                        int var87 = arg6[var81];
                        int var88 = arg6[var82];
                        int var89 = arg6[var83];
                        if (~((var84 - var85) * (-var88 + var89) + -((var86 - var85) * (var87 - var88))) < -1) {
                            arg3.field7955 = var84 < 0 || var85 < 0 || var86 < 0 || ~arg3.field7948 > ~var84 || ~var85 < ~arg3.field7948 || arg3.field7948 < var86;
                            short var90 = var44.field3683[var80];
                            if (var90 != -1) {
                                if (this.method2985(super.field7090.field3092.method110(var90, (byte) 124).field6646)) {
                                    arg3.field7952 = 100;
                                }
                                arg3.method3242(var87, var88, var89, var84, var85, var86, var44.field3685[var81], var44.field3685[var82], var44.field3685[var83], var71, var74, var77, var72, var75, var78, var73, var76, var79, var90);
                                arg3.field7952 = 0;
                            } else {
                                int var91 = var44.field3688[var80];
                                if (~var91 != 0) {
                                    arg3.method3239(var87, var88, var89, var84, var85, var86, class588.method3495(var91, var44.field3685[var81], (byte) -88), class588.method3495(var91, var44.field3685[var82], (byte) 93), class588.method3495(var91, var44.field3685[var83], (byte) -93));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLkda;)I")
    public static final int method1950(byte arg0, class328 arg1) {
        ++field4466;
        int var2 = 0;
        if (arg1.method1981(true, class572.field8431)) {
            ++var2;
        }
        if (arg1.method1981(true, class166.field2615)) {
            ++var2;
        }
        if (arg1.method1981(true, class379.field5226)) {
            ++var2;
        }
        if (arg1.method1981(true, class65.field805)) {
            ++var2;
        }
        if (arg1.method1981(true, class15.field153)) {
            ++var2;
        }
        if (arg1.method1981(true, class106.field1526)) {
            ++var2;
        }
        if (arg1.method1981(true, class440.field5878)) {
            ++var2;
        }
        if (arg1.method1981(true, class116.field1629)) {
            ++var2;
        }
        if (arg1.method1981(true, class386.field5314)) {
            ++var2;
        }
        if (arg1.method1981(true, class561.field8336)) {
            ++var2;
        }
        if (arg1.method1981(true, class140.field1989)) {
            ++var2;
        }
        if (arg0 >= -5) {
            method1947((class501) null, (byte) -78, (class501) null);
        }
        if (arg1.method1981(true, class115.field1624)) {
            ++var2;
        }
        if (arg1.method1981(true, class321.field4430)) {
            ++var2;
        }
        if (arg1.method1981(true, class553.field8241)) {
            ++var2;
        }
        if (arg1.method1981(true, class373.field5123)) {
            ++var2;
        }
        if (arg1.method1981(true, class117.field1648)) {
            ++var2;
        }
        return var2;
    }
}
