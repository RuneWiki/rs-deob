import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class632 extends class105 {

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "J")
    public static long field8964 = 0L;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Luq;IIII[[I[[II)V")
    public class632(class148 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([II[[ZIIZI[ILqaa;III)V")
    private final void method3535(int[] arg0, int arg1, boolean[][] arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7, class26 arg8, int arg9, int arg10, int arg11) {
        ++field8962;
        int var13 = (arg1 - arg11) * arg3 / 256;
        int var14 = arg3 >> 8;
        arg8.field320 = false;
        arg8.field323 = false;
        int var15 = arg4;
        int var16 = arg10 + var13;
        for (int var17 = arg6; ~var17 > ~arg9; ++var17) {
            for (int var18 = arg11; arg1 > var18; ++var18) {
                if (arg2[-arg6 + var17][-arg11 + var18]) {
                    if (super.field1149[var17][var18] != null) {
                        class124 var33 = super.field1149[var17][var18];
                        if (var33.field1413 != -1 && (2 & var33.field1417) == 0 && var33.field1416 == 0) {
                            int var34 = super.field1146.method805(var33.field1413);
                            arg8.method141(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, class80.method514(var34, var33.field1412, (byte) -128), class80.method514(var34, var33.field1410, (byte) -106), class80.method514(var34, var33.field1409, (byte) -107));
                            arg8.method141(var16, var16, -var14 + var16, var15, var14 + var15, var15, class80.method514(var34, var33.field1414, (byte) -112), class80.method514(var34, var33.field1409, (byte) -111), class80.method514(var34, var33.field1410, (byte) -113));
                        } else if (~var33.field1416 != -1) {
                            int var35 = var33.field1416;
                            arg8.method143(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, class425.method2296(-10227, var35, var33.field1412 & -16777216), class425.method2296(-10227, var35, var33.field1410 & -16777216), class425.method2296(-10227, var35, var33.field1409 & -16777216));
                            arg8.method143(var16, var16, -var14 + var16, var15, var14 + var15, var15, class425.method2296(-10227, var35, -16777216 & var33.field1414), class425.method2296(-10227, var35, -16777216 & var33.field1409), class425.method2296(-10227, var35, var33.field1410 & -16777216));
                        } else {
                            arg8.method143(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var33.field1412, var33.field1410, var33.field1409);
                            arg8.method143(var16, var16, -var14 + var16, var15, var14 + var15, var15, var33.field1414, var33.field1409, var33.field1410);
                        }
                    } else if (super.field1141[var17][var18] != null) {
                        class339 var19 = super.field1141[var17][var18];
                        for (int var20 = 0; var19.field4422 > var20; ++var20) {
                            arg7[var20] = var19.field4425[var20] * var14 / super.field1561 + var15;
                            arg0[var20] = -(var19.field4424[var20] * var14 / super.field1561) + var16;
                        }
                        for (int var21 = 0; var21 < var19.field4417; ++var21) {
                            int var22 = var21 * 3;
                            int var23 = var22 - -1;
                            int var24 = var23 - -1;
                            int var25 = arg7[var22];
                            int var26 = arg7[var23];
                            int var27 = arg7[var24];
                            int var28 = arg0[var22];
                            int var29 = arg0[var23];
                            int var30 = arg0[var24];
                            if (var19.field4418 == null || ~var19.field4418[var21] == -1 || var19.field4421 != null && (var19.field4421 == null || ~var19.field4421[var21] != 0)) {
                                if (var19.field4421 != null && var19.field4421[var21] != -1) {
                                    int var32 = super.field1146.method805(var19.field4421[var21]);
                                    arg8.method141(var28, var29, var30, var25, var26, var27, var32, var32, var32);
                                } else {
                                    arg8.method143(var28, var29, var30, var25, var26, var27, var19.field4426[var22], var19.field4426[var23], var19.field4426[var24]);
                                }
                            } else {
                                int var31 = var19.field4418[var21];
                                arg8.method143(var28, var29, var30, var25, var26, var27, class425.method2296(-10227, var31, -16777216 - (-16777216 & var19.field4426[var22])), class425.method2296(-10227, var31, -(-16777216 & var19.field4426[var23]) + -16777216), class425.method2296(-10227, var31, -(-16777216 & var19.field4426[var24]) + -16777216));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg10 + var13;
            var15 += var14;
        }
        arg8.field320 = arg5;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([ILqaa;III[IZ[I)V")
    private final void method3536(int[] arg0, class26 arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, int[] arg7) {
        ++field8963;
        class124 var9 = super.field1149[arg3][arg2];
        if (var9 != null) {
            if ((2 & var9.field1417) == 0) {
                int var10 = super.field1561 * arg3;
                int var11 = var10 - -super.field1561;
                int var12 = super.field1561 * arg2;
                int var13 = super.field1561 + var12;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
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
                if (~(var9.field1417 & 1) != -1 && !arg6) {
                    int var18 = super.field1135[arg3][arg2];
                    if (~super.field1150 != 0) {
                        var19 = super.field1150;
                        var20 = super.field1150;
                        var21 = super.field1150;
                        var22 = super.field1150;
                    } else {
                        int var23 = super.field1152 * var18;
                        var22 = super.field1134 - -(super.field1148 * var10 + super.field1144 * var12 + var23 >> 14);
                        if (~super.field1146.field1665 <= ~var22) {
                            return;
                        }
                        var21 = (super.field1148 * var11 + super.field1144 * var12 - -var23 >> 14) + super.field1134;
                        if (~super.field1146.field1665 <= ~var21) {
                            return;
                        }
                        var20 = (super.field1144 * var13 + (super.field1148 * var11 - -var23) >> 14) + super.field1134;
                        if (~var20 >= ~super.field1146.field1665) {
                            return;
                        }
                        var19 = (super.field1144 * var13 + (super.field1148 * var10 - -var23) >> 14) + super.field1134;
                        if (~super.field1146.field1665 <= ~var19) {
                            return;
                        }
                    }
                    if (super.field1146.field1685) {
                        int var24 = -super.field1146.field1660 + var22;
                        if (var24 > 0) {
                            var14 = var24;
                            if (~var24 < -256) {
                                var14 = 255;
                            }
                        }
                        int var25 = -super.field1146.field1660 + var21;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field1146.field1660 + var20;
                        if (var26 > 0) {
                            var16 = var26;
                            if (~var26 < -256) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field1146.field1660 + var19;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field1137 * var18;
                    var29 = super.field1147 - -(super.field1139 * var10 - -(super.field1145 * var12) + var28 >> 14);
                    int var30 = super.field1153 * var18;
                    var31 = super.field1146.field1671 * var29 / var22 + arg1.field318;
                    var32 = super.field1154 - -(super.field1138 * var12 + super.field1136 * var10 + var30 >> 14);
                    var33 = super.field1146.field1688 * var32 / var22 + arg1.field322;
                    var34 = (super.field1145 * var12 + super.field1139 * var11 - -var28 >> 14) + super.field1147;
                    var35 = super.field1146.field1671 * var34 / var21 + arg1.field318;
                    var36 = (super.field1138 * var12 + super.field1136 * var11 + var30 >> 14) + super.field1154;
                    var37 = (super.field1145 * var13 + super.field1139 * var11 - -var28 >> 14) + super.field1147;
                    var38 = arg1.field322 - -(super.field1146.field1688 * var36 / var21);
                    var39 = (super.field1136 * var11 + super.field1138 * var13 + var30 >> 14) + super.field1154;
                    var40 = super.field1146.field1671 * var37 / var20 + arg1.field318;
                    var41 = super.field1146.field1688 * var39 / var20 + arg1.field322;
                    var42 = (super.field1139 * var10 - (-(super.field1145 * var13) + -var28) >> 14) + super.field1147;
                    var43 = super.field1146.field1671 * var42 / var19 + arg1.field318;
                    var44 = super.field1154 - -(super.field1138 * var13 + super.field1136 * var10 + var30 >> 14);
                    var45 = super.field1146.field1688 * var44 / var19 + arg1.field322;
                } else {
                    int var46 = super.field1135[arg3][arg2];
                    int var47 = super.field1135[arg3 - -1][arg2];
                    int var48 = super.field1135[arg3 + 1][arg2 + 1];
                    int var49 = super.field1135[arg3][arg2 + 1];
                    if (~super.field1150 == 0) {
                        var22 = (super.field1152 * var46 + (super.field1148 * var10 - -(super.field1144 * var12)) >> 14) + super.field1134;
                        if (super.field1146.field1665 >= var22) {
                            return;
                        }
                        var21 = (super.field1144 * var12 + (super.field1148 * var11 - -(super.field1152 * var47)) >> 14) + super.field1134;
                        if (~super.field1146.field1665 <= ~var21) {
                            return;
                        }
                        var20 = (super.field1144 * var13 + super.field1152 * var48 + super.field1148 * var11 >> 14) + super.field1134;
                        if (~var20 >= ~super.field1146.field1665) {
                            return;
                        }
                        var19 = (super.field1144 * var13 + super.field1152 * var49 + super.field1148 * var10 >> 14) + super.field1134;
                        if (~var19 >= ~super.field1146.field1665) {
                            return;
                        }
                    } else {
                        var19 = super.field1150;
                        var20 = super.field1150;
                        var21 = super.field1150;
                        var22 = super.field1150;
                    }
                    if (arg6) {
                        int var50 = -super.field1146.field1660 + var22;
                        if (~var50 < -256) {
                            var50 = 255;
                        }
                        if (~var50 < -1) {
                            var14 = var50;
                            int var51 = var9.field1411 * var50 / 255;
                            if (~var51 < -1) {
                                var46 -= var51;
                            }
                        }
                        int var52 = -super.field1146.field1660 + var21;
                        if (var52 > 255) {
                            var52 = 255;
                        }
                        if (~var52 < -1) {
                            var15 = var52;
                            int var53 = var9.field1408 * var52 / 255;
                            if (var53 > 0) {
                                var47 -= var53;
                            }
                        }
                        int var54 = -super.field1146.field1660 + var20;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (var54 > 0) {
                            var16 = var54;
                            int var55 = var9.field1418 * var54 / 255;
                            if (var55 > 0) {
                                var48 -= var55;
                            }
                        }
                        int var56 = -super.field1146.field1660 + var19;
                        if (var56 > 255) {
                            var56 = 255;
                        }
                        if (var56 > 0) {
                            var17 = var56;
                            int var57 = var9.field1415 * var56 / 255;
                            if (~var57 < -1) {
                                var49 -= var57;
                            }
                        }
                    } else if (super.field1146.field1685) {
                        int var58 = -super.field1146.field1660 + var22;
                        if (~var58 < -1) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = -super.field1146.field1660 + var21;
                        if (~var59 < -1) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var20 - super.field1146.field1660;
                        if (var60 > 0) {
                            var16 = var60;
                            if (~var60 < -256) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field1146.field1660 + var19;
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    var29 = super.field1147 - -(super.field1137 * var46 + (super.field1139 * var10 - -(super.field1145 * var12)) >> 14);
                    var32 = (super.field1153 * var46 + super.field1136 * var10 - -(super.field1138 * var12) >> 14) + super.field1154;
                    var31 = super.field1146.field1671 * var29 / var22 + arg1.field318;
                    var33 = super.field1146.field1688 * var32 / var22 + arg1.field322;
                    var34 = super.field1147 - -(super.field1145 * var12 + super.field1139 * var11 + super.field1137 * var47 >> 14);
                    var36 = super.field1154 - -(super.field1138 * var12 + (super.field1136 * var11 - -(super.field1153 * var47)) >> 14);
                    var35 = super.field1146.field1671 * var34 / var21 + arg1.field318;
                    var37 = (super.field1137 * var48 + super.field1145 * var13 + super.field1139 * var11 >> 14) + super.field1147;
                    var38 = arg1.field322 - -(super.field1146.field1688 * var36 / var21);
                    var39 = (super.field1138 * var13 + super.field1153 * var48 + super.field1136 * var11 >> 14) + super.field1154;
                    var40 = arg1.field318 - -(super.field1146.field1671 * var37 / var20);
                    var41 = super.field1146.field1688 * var39 / var20 + arg1.field322;
                    var42 = (super.field1145 * var13 + super.field1139 * var10 + super.field1137 * var49 >> 14) + super.field1147;
                    var44 = super.field1154 - -(super.field1153 * var49 + super.field1138 * var13 + super.field1136 * var10 >> 14);
                    var43 = super.field1146.field1671 * var42 / var19 + arg1.field318;
                    var45 = super.field1146.field1688 * var44 / var19 + arg1.field322;
                }
                boolean var62 = var9.field1413 != -1 && this.method629(super.field1146.field8990.method846((byte) -121, var9.field1413).field5486);
                int var63 = var15 - (-var16 + -var17);
                if ((-var43 + var40) * (-var45 + var38) - (var35 - var43) * (var41 - var45) > 0) {
                    arg1.field326 = ~var40 > -1 || var43 < 0 || ~var35 > -1 || ~arg1.field327 > ~var40 || var43 > arg1.field327 || ~var35 < ~arg1.field327;
                    if (var63 < 765) {
                        if (var62) {
                            arg1.field319 = 100;
                        }
                        if (var63 <= 0) {
                            if (~var9.field1413 > -1) {
                                arg1.method143(var41, var45, var38, var40, var43, var35, var9.field1412, var9.field1410, var9.field1409);
                            } else {
                                arg1.method146(var41, var45, var38, var40, var43, var35, var9.field1412, var9.field1410, var9.field1409, var37, var42, var34, var39, var44, var36, var20, var19, var21, var9.field1413);
                            }
                        } else if (~var9.field1413 > -1) {
                            arg1.method143(var41, var45, var38, var40, var43, var35, class425.method2296(-10227, var9.field1412, var16 << 24 | super.field1146.field1677), class425.method2296(-10227, var9.field1410, super.field1146.field1677 | var17 << 24), class425.method2296(arg4 ^ -10228, var9.field1409, super.field1146.field1677 | var15 << 24));
                        } else {
                            arg1.method140(var41, var45, var38, var40, var43, var35, super.field1146.field1677, var16, var17, var15, var9.field1412, var9.field1410, var9.field1409, var37, var42, var34, var39, var44, var36, var20, var19, var21, var9.field1413);
                        }
                        arg1.field319 = 0;
                    } else {
                        arg1.method133(var41, var45, var38, var40, var43, var35, super.field1146.field1677);
                    }
                }
                int var64 = var14 + var15 + var17;
                if ((var31 - var35) * (var45 - var38) + -((-var35 + var43) * (-var38 + var33)) > 0) {
                    arg1.field326 = var31 < 0 || var35 < 0 || var43 < 0 || var31 > arg1.field327 || arg1.field327 < var35 || ~arg1.field327 > ~var43;
                    if (var64 < 765) {
                        if (var62) {
                            arg1.field319 = 100;
                        }
                        if (var64 > 0) {
                            if (~var9.field1413 > -1) {
                                arg1.method143(var33, var38, var45, var31, var35, var43, class425.method2296(-10227, var9.field1414, super.field1146.field1677 | var14 << 24), class425.method2296(-10227, var9.field1409, var15 << 24 | super.field1146.field1677), class425.method2296(-10227, var9.field1410, var17 << 24 | super.field1146.field1677));
                            } else {
                                arg1.method140(var33, var38, var45, var31, var35, var43, super.field1146.field1677, var14, var15, var17, var9.field1414, var9.field1409, var9.field1410, var29, var34, var42, var32, var36, var44, var22, var21, var19, var9.field1413);
                            }
                        } else if (var9.field1413 >= 0) {
                            arg1.method146(var33, var38, var45, var31, var35, var43, var9.field1414, var9.field1409, var9.field1410, var29, var34, var42, var32, var36, var44, var22, var21, var19, var9.field1413);
                        } else {
                            arg1.method143(var33, var38, var45, var31, var35, var43, var9.field1414, var9.field1409, var9.field1410);
                        }
                        arg1.field319 = 0;
                        return;
                    }
                    arg1.method133(var33, var38, var45, var31, var35, var43, super.field1146.field1677);
                }
            }
        } else {
            if (arg4 != 1) {
                field8964 = -110L;
            }
            class339 var65 = super.field1141[arg3][arg2];
            if (var65 != null) {
                if (~super.field1150 == 0) {
                    for (int var66 = 0; ~var66 > ~var65.field4422; ++var66) {
                        int var67 = (arg3 << super.field1560) + var65.field4425[var66];
                        int var68 = var65.field4419[var66];
                        int var69 = var65.field4424[var66] - -(arg2 << super.field1560);
                        int var70 = super.field1134 - -(super.field1144 * var69 + super.field1152 * var68 + super.field1148 * var67 >> 14);
                        if (super.field1146.field1665 >= var70) {
                            return;
                        }
                        arg0[var66] = 0;
                        if (arg6) {
                            int var71 = -super.field1146.field1660 + var70;
                            if (~var71 < -256) {
                                var71 = 255;
                            }
                            if (~var71 < -1) {
                                arg0[var66] = var71;
                                int var72 = var65.field4423[var66] * var71 / 255;
                                if (~var72 < -1) {
                                    var68 -= var72;
                                }
                            }
                        } else if (super.field1146.field1685) {
                            int var73 = -super.field1146.field1660 + var70;
                            if (var73 > 0) {
                                arg0[var66] = var73;
                                if (arg0[var66] > 255) {
                                    arg0[var66] = 255;
                                }
                            }
                        }
                        int var74 = (super.field1136 * var67 + super.field1153 * var68 + super.field1138 * var69 >> 14) + super.field1154;
                        int var75 = (super.field1139 * var67 + super.field1137 * var68 - -(super.field1145 * var69) >> 14) + super.field1147;
                        arg5[var66] = super.field1146.field1671 * var75 / var70 + arg1.field318;
                        arg7[var66] = arg1.field322 - -(super.field1146.field1688 * var74 / var70);
                    }
                } else {
                    for (int var76 = 0; var76 < var65.field4422; ++var76) {
                        int var116 = var65.field4425[var76] - -(arg3 << super.field1560);
                        int var117 = var65.field4419[var76];
                        int var118 = var65.field4424[var76] - -(arg2 << super.field1560);
                        arg0[var76] = 0;
                        if (arg6) {
                            int var119 = -super.field1146.field1660 + super.field1150;
                            if (~var119 < -256) {
                                var119 = 255;
                            }
                            if (var119 > 0) {
                                arg0[var76] = var119;
                                int var120 = var65.field4423[var76] * var119 / 255;
                                if (~var120 < -1) {
                                    var117 -= var120;
                                }
                            }
                        } else if (super.field1146.field1685) {
                            int var121 = super.field1150 - super.field1146.field1660;
                            if (~var121 < -1) {
                                arg0[var76] = var121;
                                if (arg0[var76] > 255) {
                                    arg0[var76] = 255;
                                }
                            }
                        }
                        int var122 = (super.field1139 * var116 + super.field1145 * var118 + super.field1137 * var117 >> 14) + super.field1147;
                        int var123 = (super.field1138 * var118 + (super.field1136 * var116 - -(super.field1153 * var117)) >> 14) + super.field1154;
                        arg5[var76] = super.field1146.field1671 * var122 / super.field1150 + arg1.field318;
                        arg7[var76] = super.field1146.field1688 * var123 / super.field1150 + arg1.field322;
                    }
                }
                if (var65.field4421 != null) {
                    int var77 = super.field1135[arg3][arg2];
                    int var78 = super.field1135[arg3 - -1][arg2];
                    int var79 = super.field1135[arg3][arg2 + 1];
                    int var80 = super.field1561 * arg3;
                    int var81 = super.field1561 + var80;
                    int var82 = super.field1561 * arg2;
                    int var83 = super.field1561 + var82;
                    int var84 = super.field1147 - -(super.field1139 * var80 + (super.field1137 * var77 - -(super.field1145 * var82)) >> 14);
                    int var85 = (super.field1136 * var80 + (super.field1153 * var77 - -(super.field1138 * var82)) >> 14) + super.field1154;
                    int var86 = (super.field1148 * var80 + super.field1152 * var77 + super.field1144 * var82 >> 14) + super.field1134;
                    int var87 = (super.field1145 * var82 + (super.field1139 * var81 - -(super.field1137 * var78)) >> 14) + super.field1147;
                    int var88 = (super.field1153 * var78 + super.field1136 * var81 - -(super.field1138 * var82) >> 14) + super.field1154;
                    int var89 = (super.field1148 * var81 + super.field1152 * var78 + super.field1144 * var82 >> 14) + super.field1134;
                    int var90 = (super.field1139 * var80 + super.field1137 * var79 - -(super.field1145 * var83) >> 14) + super.field1147;
                    int var91 = (super.field1153 * var79 + (super.field1136 * var80 - -(super.field1138 * var83)) >> 14) + super.field1154;
                    int var92 = super.field1134 - -(super.field1144 * var83 + (super.field1148 * var80 - -(super.field1152 * var79)) >> 14);
                    for (int var93 = 0; ~var65.field4417 < ~var93; ++var93) {
                        int var94 = var93 * 3;
                        int var95 = var94 + 1;
                        int var96 = var95 + 1;
                        int var97 = arg5[var94];
                        int var98 = arg5[var95];
                        int var99 = arg5[var96];
                        int var100 = arg7[var94];
                        int var101 = arg7[var95];
                        int var102 = arg7[var96];
                        int var103 = arg0[var94] - (-arg0[var95] + -arg0[var96]);
                        if (~((-var98 + var97) * (-var101 + var102) - (var99 - var98) * (var100 - var101)) < -1) {
                            arg1.field326 = ~var97 > -1 || var98 < 0 || var99 < 0 || var97 > arg1.field327 || ~arg1.field327 > ~var98 || var99 > arg1.field327;
                            short var104 = var65.field4421[var93];
                            if (var103 < 765) {
                                if (var104 != -1 && this.method629(super.field1146.field8990.method846((byte) -115, var104).field5486)) {
                                    arg1.field319 = 100;
                                }
                                if (var103 > 0) {
                                    if (~var104 == 0) {
                                        if ((var65.field4426[var94] & 16777215) != 0) {
                                            arg1.method143(var100, var101, var102, var97, var98, var99, class425.method2296(-10227, var65.field4426[var94], super.field1146.field1677 | arg0[var94] << 24), class425.method2296(-10227, var65.field4426[var95], arg0[var95] << 24 | super.field1146.field1677), class425.method2296(-10227, var65.field4426[var96], super.field1146.field1677 | arg0[var96] << 24));
                                        }
                                    } else {
                                        arg1.method140(var100, var101, var102, var97, var98, var99, super.field1146.field1677, arg0[var94], arg0[var95], arg0[var96], var65.field4426[var94], var65.field4426[var95], var65.field4426[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                    }
                                } else if (var104 == -1) {
                                    if ((16777215 & var65.field4426[var94]) != 0) {
                                        arg1.method143(var100, var101, var102, var97, var98, var99, var65.field4426[var94], var65.field4426[var95], var65.field4426[var96]);
                                    }
                                } else {
                                    arg1.method146(var100, var101, var102, var97, var98, var99, var65.field4426[var94], var65.field4426[var95], var65.field4426[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                }
                                arg1.field319 = 0;
                            } else {
                                arg1.method133(var100, var101, var102, var97, var98, var99, super.field1146.field1677);
                            }
                        }
                    }
                } else {
                    for (int var105 = 0; var105 < var65.field4417; ++var105) {
                        int var106 = var105 * 3;
                        int var107 = var106 - -1;
                        int var108 = var107 + 1;
                        int var109 = arg5[var106];
                        int var110 = arg5[var107];
                        int var111 = arg5[var108];
                        int var112 = arg7[var106];
                        int var113 = arg7[var107];
                        int var114 = arg7[var108];
                        int var115 = arg0[var106] + arg0[var107] + arg0[var108];
                        if ((var109 - var110) * (-var113 + var114) + -((-var110 + var111) * (-var113 + var112)) > 0) {
                            arg1.field326 = var109 < 0 || var110 < 0 || ~var111 > -1 || var109 > arg1.field327 || arg1.field327 < var110 || ~arg1.field327 > ~var111;
                            if (~var115 > -766) {
                                if (~var115 >= -1) {
                                    if ((var65.field4426[var106] & 16777215) != 0) {
                                        arg1.method143(var112, var113, var114, var109, var110, var111, var65.field4426[var106], var65.field4426[var107], var65.field4426[var108]);
                                    }
                                } else if ((var65.field4426[var106] & 16777215) != 0) {
                                    arg1.method143(var112, var113, var114, var109, var110, var111, class250.method1434(arg0[var106], var65.field4426[var106], 12686, super.field1146.field1677), class250.method1434(arg0[var107], var65.field4426[var107], 12686, super.field1146.field1677), class250.method1434(arg0[var108], var65.field4426[var108], 12686, super.field1146.field1677));
                                }
                            } else {
                                arg1.method133(var112, var113, var114, var109, var110, var111, super.field1146.field1677);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[II[II[ILqaa;)V")
    private final void method3537(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, class26 arg6) {
        ++field8967;
        class188 var8 = super.field1140[arg0][arg2];
        if (var8 != null) {
            if (~(2 & var8.field2289) == -1) {
                int var9 = super.field1561 * arg0;
                int var10 = super.field1561 + var9;
                int var11 = super.field1561 * arg2;
                int var12 = super.field1561 + var11;
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
                if ((var8.field2289 & 1) != 0) {
                    int var13 = super.field1135[arg0][arg2];
                    int var17;
                    if (super.field1150 == -1) {
                        int var14 = super.field1152 * var13;
                        var15 = (super.field1144 * var11 + super.field1148 * var9 + var14 >> 14) + super.field1134;
                        if (~var15 >= ~super.field1146.field1665) {
                            return;
                        }
                        var16 = super.field1134 - -(super.field1148 * var10 + var14 - -(super.field1144 * var11) >> 14);
                        if (var16 <= super.field1146.field1665) {
                            return;
                        }
                        var17 = super.field1134 - -(super.field1148 * var10 + super.field1144 * var12 + var14 >> 14);
                        if (~super.field1146.field1665 <= ~var17) {
                            return;
                        }
                        var18 = super.field1134 - -(super.field1148 * var9 - -(super.field1144 * var12) + var14 >> 14);
                        if (var18 <= super.field1146.field1665) {
                            return;
                        }
                    } else {
                        var18 = super.field1150;
                        var17 = super.field1150;
                        var16 = super.field1150;
                        var15 = super.field1150;
                    }
                    int var19 = super.field1137 * var13;
                    var20 = super.field1147 - -(super.field1139 * var9 + var19 - -(super.field1145 * var11) >> 14);
                    int var21 = super.field1153 * var13;
                    var22 = super.field1146.field1671 * var20 / var15 + arg6.field318;
                    var23 = super.field1154 - -(super.field1138 * var11 + super.field1136 * var9 + var21 >> 14);
                    var24 = super.field1146.field1688 * var23 / var15 + arg6.field322;
                    var25 = (super.field1145 * var11 + super.field1139 * var10 + var19 >> 14) + super.field1147;
                    var26 = arg6.field318 - -(super.field1146.field1671 * var25 / var16);
                    var27 = (super.field1136 * var10 + var21 - -(super.field1138 * var11) >> 14) + super.field1154;
                    var28 = super.field1146.field1688 * var27 / var16 + arg6.field322;
                    int var29 = super.field1147 - -(super.field1139 * var10 + super.field1145 * var12 + var19 >> 14);
                    int var30 = (super.field1136 * var10 + super.field1138 * var12 + var21 >> 14) + super.field1154;
                    var31 = super.field1146.field1671 * var29 / var17 + arg6.field318;
                    var32 = arg6.field322 - -(super.field1146.field1688 * var30 / var17);
                    var33 = (super.field1139 * var9 + super.field1145 * var12 + var19 >> 14) + super.field1147;
                    var34 = super.field1146.field1671 * var33 / var18 + arg6.field318;
                    var35 = (super.field1138 * var12 + (super.field1136 * var9 - -var21) >> 14) + super.field1154;
                    var36 = arg6.field322 - -(super.field1146.field1688 * var35 / var18);
                } else {
                    int var37 = super.field1135[arg0][arg2];
                    int var38 = super.field1135[arg0 - -1][arg2];
                    int var39 = super.field1135[arg0 + 1][arg2 + 1];
                    int var40 = super.field1135[arg0][arg2 + 1];
                    int var41;
                    if (~super.field1150 == 0) {
                        var15 = (super.field1152 * var37 + super.field1148 * var9 - -(super.field1144 * var11) >> 14) + super.field1134;
                        if (~super.field1146.field1665 <= ~var15) {
                            return;
                        }
                        var16 = (super.field1144 * var11 + super.field1152 * var38 + super.field1148 * var10 >> 14) + super.field1134;
                        if (super.field1146.field1665 >= var16) {
                            return;
                        }
                        var41 = (super.field1144 * var12 + super.field1152 * var39 + super.field1148 * var10 >> 14) + super.field1134;
                        if (super.field1146.field1665 >= var41) {
                            return;
                        }
                        var18 = (super.field1148 * var9 + (super.field1152 * var40 - -(super.field1144 * var12)) >> 14) + super.field1134;
                        if (~super.field1146.field1665 <= ~var18) {
                            return;
                        }
                    } else {
                        var18 = super.field1150;
                        var41 = super.field1150;
                        var16 = super.field1150;
                        var15 = super.field1150;
                    }
                    var20 = (super.field1145 * var11 + super.field1139 * var9 + super.field1137 * var37 >> 14) + super.field1147;
                    var22 = super.field1146.field1671 * var20 / var15 + arg6.field318;
                    var23 = (super.field1153 * var37 + super.field1138 * var11 + super.field1136 * var9 >> 14) + super.field1154;
                    var24 = super.field1146.field1688 * var23 / var15 + arg6.field322;
                    var25 = super.field1147 - -(super.field1145 * var11 + super.field1139 * var10 + super.field1137 * var38 >> 14);
                    var27 = (super.field1136 * var10 + super.field1153 * var38 + super.field1138 * var11 >> 14) + super.field1154;
                    var26 = super.field1146.field1671 * var25 / var16 + arg6.field318;
                    var28 = super.field1146.field1688 * var27 / var16 + arg6.field322;
                    int var42 = (super.field1145 * var12 + (super.field1139 * var10 - -(super.field1137 * var39)) >> 14) + super.field1147;
                    int var43 = (super.field1138 * var12 + super.field1153 * var39 + super.field1136 * var10 >> 14) + super.field1154;
                    var31 = super.field1146.field1671 * var42 / var41 + arg6.field318;
                    var32 = super.field1146.field1688 * var43 / var41 + arg6.field322;
                    var33 = (super.field1139 * var9 - (-(super.field1137 * var40) - super.field1145 * var12) >> 14) + super.field1147;
                    var34 = super.field1146.field1671 * var33 / var18 + arg6.field318;
                    var35 = super.field1154 - -(super.field1153 * var40 + super.field1138 * var12 + super.field1136 * var9 >> 14);
                    var36 = arg6.field322 - -(super.field1146.field1688 * var35 / var18);
                }
                if ((-var34 + var31) * (-var36 + var28) - (var26 - var34) * (-var36 + var32) > 0) {
                    arg6.field326 = var31 < 0 || ~var34 > -1 || ~var26 > -1 || ~arg6.field327 > ~var31 || ~arg6.field327 > ~var34 || ~arg6.field327 > ~var26;
                    if (~var8.field2291 > -1) {
                        arg6.method141(var32, var36, var28, var31, var34, var26, var8.field2290 & 65535, 65535 & var8.field2292, 65535 & var8.field2288);
                    } else {
                        if (this.method629(super.field1146.field8990.method846((byte) -108, var8.field2291).field5486)) {
                            arg6.field319 = 100;
                        }
                        arg6.method146(var32, var36, var28, var31, var34, var26, var8.field2290 & 65535, var8.field2292 & 65535, var8.field2288 & 65535, var20, var25, var33, var23, var27, var35, var15, var16, var18, var8.field2291);
                        arg6.field319 = 0;
                    }
                }
                if (~((var22 - var26) * (var36 - var28) + -((-var26 + var34) * (-var28 + var24))) < -1) {
                    arg6.field326 = ~var22 > -1 || var26 < 0 || var34 < 0 || ~var22 < ~arg6.field327 || arg6.field327 < var26 || arg6.field327 < var34;
                    if (~var8.field2291 <= -1) {
                        if (this.method629(super.field1146.field8990.method846((byte) -113, var8.field2291).field5486)) {
                            arg6.field319 = 100;
                        }
                        arg6.method146(var24, var28, var36, var22, var26, var34, 65535 & var8.field2293, 65535 & var8.field2288, var8.field2292 & 65535, var20, var25, var33, var23, var27, var35, var15, var16, var18, var8.field2291);
                        arg6.field319 = 0;
                        return;
                    }
                    arg6.method141(var24, var28, var36, var22, var26, var34, 65535 & var8.field2293, 65535 & var8.field2288, var8.field2292 & 65535);
                }
            }
        } else if (arg4 == -1280863858) {
            class42 var44 = super.field1142[arg0][arg2];
            if (var44 != null) {
                if (~super.field1150 != 0) {
                    for (int var45 = 0; ~var44.field438 < ~var45; ++var45) {
                        int var46 = (arg0 << super.field1560) + var44.field446[var45];
                        short var47 = var44.field440[var45];
                        int var48 = (arg2 << super.field1560) + var44.field450[var45];
                        int var49 = super.field1147 - -(super.field1137 * var47 + super.field1145 * var48 + super.field1139 * var46 >> 14);
                        int var50 = super.field1154 - -(super.field1138 * var48 + (super.field1136 * var46 - -(super.field1153 * var47)) >> 14);
                        arg3[var45] = super.field1146.field1671 * var49 / super.field1150 + arg6.field318;
                        arg5[var45] = super.field1146.field1688 * var50 / super.field1150 + arg6.field322;
                    }
                } else {
                    for (int var51 = 0; ~var44.field438 < ~var51; ++var51) {
                        int var91 = var44.field446[var51] - -(arg0 << super.field1560);
                        short var92 = var44.field440[var51];
                        int var93 = (arg2 << super.field1560) + var44.field450[var51];
                        int var94 = (super.field1144 * var93 + super.field1152 * var92 + super.field1148 * var91 >> 14) + super.field1134;
                        if (var94 <= super.field1146.field1665) {
                            return;
                        }
                        int var95 = super.field1147 - -(super.field1137 * var92 + super.field1145 * var93 + super.field1139 * var91 >> 14);
                        int var96 = (super.field1138 * var93 + super.field1153 * var92 + super.field1136 * var91 >> 14) + super.field1154;
                        arg3[var51] = super.field1146.field1671 * var95 / var94 + arg6.field318;
                        arg5[var51] = super.field1146.field1688 * var96 / var94 + arg6.field322;
                    }
                }
                if (var44.field448 == null) {
                    for (int var52 = 0; var44.field441 > var52; ++var52) {
                        short var53 = var44.field439[var52];
                        short var54 = var44.field443[var52];
                        short var55 = var44.field444[var52];
                        int var56 = arg3[var53];
                        int var57 = arg3[var54];
                        int var58 = arg3[var55];
                        int var59 = arg5[var53];
                        int var60 = arg5[var54];
                        int var61 = arg5[var55];
                        if ((var61 - var60) * (-var57 + var56) + -((-var57 + var58) * (-var60 + var59)) > 0) {
                            int var62 = var44.field449[var52];
                            if (~var62 != 0) {
                                arg6.field326 = var56 < 0 || ~var57 > -1 || var58 < 0 || ~arg6.field327 > ~var56 || var57 > arg6.field327 || arg6.field327 < var58;
                                arg6.method141(var59, var60, var61, var56, var57, var58, class80.method514(var62, var44.field442[var53], (byte) -116), class80.method514(var62, var44.field442[var54], (byte) -128), class80.method514(var62, var44.field442[var55], (byte) -122));
                            }
                        }
                    }
                } else {
                    int var63 = super.field1135[arg0][arg2];
                    int var64 = super.field1135[arg0 + 1][arg2];
                    int var65 = super.field1135[arg0][arg2 + 1];
                    int var66 = super.field1561 * arg0;
                    int var67 = super.field1561 + var66;
                    int var68 = super.field1561 * arg2;
                    int var69 = super.field1561 + var68;
                    int var70 = (super.field1145 * var68 + super.field1139 * var66 + super.field1137 * var63 >> 14) + super.field1147;
                    int var71 = (super.field1136 * var66 + super.field1153 * var63 + super.field1138 * var68 >> 14) + super.field1154;
                    int var72 = super.field1134 - -(super.field1148 * var66 + super.field1152 * var63 + super.field1144 * var68 >> 14);
                    int var73 = (super.field1145 * var68 + (super.field1139 * var67 - -(super.field1137 * var64)) >> 14) + super.field1147;
                    int var74 = (super.field1153 * var64 + super.field1136 * var67 - -(super.field1138 * var68) >> 14) + super.field1154;
                    int var75 = (super.field1144 * var68 + super.field1152 * var64 + super.field1148 * var67 >> 14) + super.field1134;
                    int var76 = super.field1147 - -(super.field1145 * var69 + super.field1139 * var66 + super.field1137 * var65 >> 14);
                    int var77 = (super.field1153 * var65 + (super.field1136 * var66 - -(super.field1138 * var69)) >> 14) + super.field1154;
                    int var78 = (super.field1152 * var65 + super.field1148 * var66 - -(super.field1144 * var69) >> 14) + super.field1134;
                    for (int var79 = 0; ~var79 > ~var44.field441; ++var79) {
                        short var80 = var44.field439[var79];
                        short var81 = var44.field443[var79];
                        short var82 = var44.field444[var79];
                        int var83 = arg3[var80];
                        int var84 = arg3[var81];
                        int var85 = arg3[var82];
                        int var86 = arg5[var80];
                        int var87 = arg5[var81];
                        int var88 = arg5[var82];
                        if ((-var84 + var83) * (-var87 + var88) + -((-var84 + var85) * (-var87 + var86)) > 0) {
                            arg6.field326 = ~var83 > -1 || ~var84 > -1 || var85 < 0 || ~arg6.field327 > ~var83 || arg6.field327 < var84 || ~arg6.field327 > ~var85;
                            short var89 = var44.field448[var79];
                            if (var89 == -1) {
                                int var90 = var44.field449[var79];
                                if (var90 != -1) {
                                    arg6.method141(var86, var87, var88, var83, var84, var85, class80.method514(var90, var44.field442[var80], (byte) -106), class80.method514(var90, var44.field442[var81], (byte) -120), class80.method514(var90, var44.field442[var82], (byte) -125));
                                }
                            } else {
                                if (this.method629(super.field1146.field8990.method846((byte) -128, var89).field5486)) {
                                    arg6.field319 = 100;
                                }
                                arg6.method146(var86, var87, var88, var83, var84, var85, var44.field442[var80], var44.field442[var81], var44.field442[var82], var70, var73, var76, var71, var74, var77, var72, var75, var78, var89);
                                arg6.field319 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
    public final void method252(int arg0, int arg1) {
        ++field8966;
        class163 var3 = (class163) super.field1146.method814(Thread.currentThread());
        var3.field1941.field319 = 0;
        if (super.field1149 == null) {
            if (super.field1140 != null) {
                this.method3537(arg0, var3.field3633, arg1, var3.field3618, -1280863858, var3.field3631, var3.field1941);
                return;
            }
        } else {
            this.method3536(var3.field3633, var3.field1941, arg1, arg0, 1, var3.field3618, super.field1146.field1656, var3.field3631);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILlt;)Z")
    public static final boolean method3538(int arg0, int arg1, class617 arg2) {
        ++field8965;
        int var3 = arg2.method3465(2, (byte) -98);
        if (~var3 == -1) {
            if (arg2.method3465(1, (byte) -101) != 0) {
                method3538(arg0, -29, arg2);
            }
            int var4 = arg2.method3465(6, (byte) -125);
            int var5 = arg2.method3465(6, (byte) -121);
            boolean var6 = arg2.method3465(1, (byte) -118) == 1;
            if (var6) {
                class382.field5045[class179.field2218++] = arg0;
            }
            if (class362.field4726[arg0] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class383 var7 = class412.field5458[arg0];
                class455 var8 = class362.field4726[arg0] = new class455();
                var8.field3784 = arg0;
                if (class288.field3709[arg0] != null) {
                    var8.method2583(class288.field3709[arg0], -1);
                }
                var8.method1648(true, var7.field5134, (byte) 57);
                var8.field3803 = var7.field5131;
                int var9 = var7.field5132;
                int var10 = var9 >> 28;
                int var11 = (4190521 & var9) >> 14;
                int var12 = 255 & var9;
                var8.field6315 = var7.field5130;
                var8.field3842[0] = class60.field626[arg0];
                var8.field4638 = (byte) var10;
                var8.method2591((var12 << 6) - -var5 + -class146.field1642, 0, (var11 << 6) - (-var4 + class682.field9685));
                var8.field6349 = false;
                class412.field5458[arg0] = null;
                return true;
            }
        } else {
            if (arg1 >= -8) {
                field8964 = 26L;
            }
            if (var3 == 1) {
                int var13 = arg2.method3465(2, (byte) -107);
                int var14 = class412.field5458[arg0].field5132;
                class412.field5458[arg0].field5132 = ((var14 >> 28) + var13 << 28 & 805306368) + (268435455 & var14);
                return false;
            } else if (~var3 == -3) {
                int var15 = arg2.method3465(5, (byte) -99);
                int var16 = var15 >> 3;
                int var17 = var15 & 7;
                int var18 = class412.field5458[arg0].field5132;
                int var19 = (var18 >> 28) + var16 & 3;
                int var20 = (4188661 & var18) >> 14;
                int var21 = 255 & var18;
                if (var17 == 0) {
                    --var21;
                    --var20;
                }
                if (~var17 == -2) {
                    --var21;
                }
                if (var17 == 2) {
                    ++var20;
                    --var21;
                }
                if (var17 == 3) {
                    --var20;
                }
                if (~var17 == -5) {
                    ++var20;
                }
                if (~var17 == -6) {
                    --var20;
                    ++var21;
                }
                if (~var17 == -7) {
                    ++var21;
                }
                if (~var17 == -8) {
                    ++var21;
                    ++var20;
                }
                class412.field5458[arg0].field5132 = (var20 << 14) + (var19 << 28) + var21;
                return false;
            } else {
                int var22 = arg2.method3465(18, (byte) -121);
                int var23 = var22 >> 16;
                int var24 = 255 & var22 >> 8;
                int var25 = var22 & 255;
                int var26 = class412.field5458[arg0].field5132;
                int var27 = 3 & (var26 >> 28) + var23;
                int var28 = (var26 >> 14) + var24 & 255;
                int var29 = 255 & var25 + var26;
                class412.field5458[arg0].field5132 = (var27 << 28) - (-(var28 << 14) - var29);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8961;
        class163 var9 = (class163) super.field1146.method814(Thread.currentThread());
        class26 var10 = var9.field1941;
        var10.field319 = 0;
        var10.field326 = false;
        if (super.field1149 == null) {
            if (super.field1140 != null) {
                this.method3539(arg0, var10, var9.field3631, arg2, arg6, arg5, 85, arg4, var9.field3618, arg3, arg1, arg7);
                return;
            }
        } else {
            this.method3535(var9.field3631, arg6, arg7, arg2, arg0, true, arg3, var9.field3618, var10, arg5, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILqaa;[IIIIII[III[[Z)V")
    private final void method3539(int arg0, class26 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, boolean[][] arg11) {
        if (arg6 < 34) {
            this.method3537(-40, (int[]) null, -91, (int[]) null, 98, (int[]) null, (class26) null);
        }
        ++field8960;
        int var13 = (arg4 - arg7) * arg3 / 256;
        arg1.field323 = false;
        int var14 = arg3 >> 8;
        arg1.field320 = false;
        int var15 = arg0;
        int var16 = arg10 + var13;
        for (int var17 = arg9; var17 < arg5; ++var17) {
            for (int var18 = arg7; ~var18 > ~arg4; ++var18) {
                if (arg11[-arg9 + var17][-arg7 + var18]) {
                    if (super.field1140[var17][var18] != null) {
                        class188 var19 = super.field1140[var17][var18];
                        if (~var19.field2291 != 0 && (2 & var19.field2289) == 0 && var19.field2287 == -1) {
                            int var20 = super.field1146.method805(var19.field2291);
                            arg1.method141(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class80.method514(var20, 65535 & var19.field2290, (byte) -115), class80.method514(var20, var19.field2292 & 65535, (byte) -113), class80.method514(var20, 65535 & var19.field2288, (byte) -107));
                            arg1.method141(var16, var16, -var14 + var16, var15, var14 + var15, var15, class80.method514(var20, var19.field2293 & 65535, (byte) -120), class80.method514(var20, var19.field2288 & 65535, (byte) -110), class80.method514(var20, var19.field2292 & 65535, (byte) -117));
                        } else if (var19.field2287 != -1) {
                            int var21 = var19.field2287;
                            arg1.method141(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, var21, var21, var21);
                            arg1.method141(var16, var16, var16 - var14, var15, var14 + var15, var15, var21, var21, var21);
                        } else {
                            arg1.method141(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var19.field2290 & 65535, 65535 & var19.field2292, 65535 & var19.field2288);
                            arg1.method141(var16, var16, -var14 + var16, var15, var15 - -var14, var15, 65535 & var19.field2293, var19.field2288 & 65535, var19.field2292 & 65535);
                        }
                    } else if (super.field1142[var17][var18] != null) {
                        class42 var22 = super.field1142[var17][var18];
                        for (int var23 = 0; var23 < var22.field438; ++var23) {
                            arg8[var23] = var22.field446[var23] * var14 / super.field1561 + var15;
                            arg2[var23] = -(var22.field450[var23] * var14 / super.field1561) + var16;
                        }
                        for (int var24 = 0; ~var24 > ~var22.field441; ++var24) {
                            short var25 = var22.field439[var24];
                            short var26 = var22.field443[var24];
                            short var27 = var22.field444[var24];
                            int var28 = arg8[var25];
                            int var29 = arg8[var26];
                            int var30 = arg8[var27];
                            int var31 = arg2[var25];
                            int var32 = arg2[var26];
                            int var33 = arg2[var27];
                            if (var22.field445 != null && var22.field445[var24] != -1) {
                                int var34 = var22.field445[var24];
                                arg1.method141(var31, var32, var33, var28, var29, var30, class80.method514(var34, var22.field442[var25], (byte) -122), class80.method514(var34, var22.field442[var26], (byte) -122), class80.method514(var34, var22.field442[var27], (byte) -120));
                            } else if (var22.field448 != null && var22.field448[var24] != -1) {
                                int var35 = super.field1146.method805(var22.field448[var24]);
                                arg1.method141(var31, var32, var33, var28, var29, var30, class80.method514(var35, var22.field442[var25], (byte) -119), class80.method514(var35, var22.field442[var26], (byte) -111), class80.method514(var35, var22.field442[var27], (byte) -125));
                            } else {
                                int var36 = var22.field449[var24];
                                arg1.method141(var31, var32, var33, var28, var29, var30, class80.method514(var36, var22.field442[var25], (byte) -125), class80.method514(var36, var22.field442[var26], (byte) -124), class80.method514(var36, var22.field442[var27], (byte) -128));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg10 - -var13;
            var15 += var14;
        }
        arg1.field320 = true;
    }
}
