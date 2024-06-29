import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class630 extends class289 {

    @OriginalMember(owner = "client!wca", name = "K", descriptor = "I")
    public int field8739 = 99;

    @OriginalMember(owner = "client!wca", name = "P", descriptor = "Lem;")
    public static class206 field8744 = new class206(46, 4);

    @OriginalMember(owner = "client!wca", name = "R", descriptor = "[Ltw;")
    public static class186[] field8746 = new class186[8];

    @OriginalMember(owner = "client!wca", name = "G", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!wca", name = "I", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!wca", name = "J", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!wca", name = "L", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!wca", name = "M", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!wca", name = "O", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!wca", name = "S", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!wca", name = "Q", descriptor = "Lsea;")
    public static class648 field8745;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wca", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field8748;

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(IIIZ)V")
    public class630(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class389.field5502, class322.field4389);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIILr;IIIILnn;)V")
    public final void method3523(int arg0, int arg1, int arg2, int arg3, int arg4, class166 arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10) {
        ++field8741;
        if (class366.field4875.method537(class503.field6917, arg2 ^ 2) || class659.method3701(class540.field7305, arg8, arg1, (byte) -51, arg0)) {
            if (~arg9 > ~this.field8739) {
                this.field8739 = arg9;
            }
            class301 var12 = class475.field6543.method2685(arg7, -96);
            if (!arg5.method201() || !class366.field4875.field9344 || !var12.field4143) {
                int var13;
                int var14;
                if (arg6 != 1 && arg6 != 3) {
                    var13 = var12.field4119;
                    var14 = var12.field4109;
                } else {
                    var13 = var12.field4109;
                    var14 = var12.field4119;
                }
                int var15;
                int var16;
                if (arg1 + var14 <= super.field3986) {
                    var15 = (var14 + 1 >> 1) + arg1;
                    var16 = (var14 >> 1) + arg1;
                } else {
                    var15 = arg1 - -1;
                    var16 = arg1;
                }
                int var17;
                int var18;
                if (super.field3976 >= arg0 + var13) {
                    var17 = (var13 + 1 >> 1) + arg0;
                    var18 = (var13 >> 1) + arg0;
                } else {
                    var18 = arg0;
                    var17 = arg0 + 1;
                }
                class37 var19 = class409.field5812[arg8];
                int var20 = var19.method332(var18, 1, var16) + (var19.method332(var18, 1, var15) - -var19.method332(var17, 1, var16) - -var19.method332(var17, 1, var15)) >> 2;
                int var21 = (arg1 << 9) + (var14 << 8);
                int var22 = (arg0 << 9) - -(var13 << 8);
                boolean var23 = class361.field4765 && !super.field3981 && var12.field4144;
                if (var12.method1831(150)) {
                    class7.method22(var12, arg1, (class677) null, (class61) null, arg0, arg6, 47, arg9);
                }
                boolean var24 = arg3 == -1 && ~var12.field4173 == 0 && var12.field4141 == null && var12.field4113 == null && !var12.field4185;
                if (!class467.field6423 || (!class244.method1510(arg4, true) || ~var12.field4108 == -2) && (!class582.method3316(arg2 + -101, arg4) || var12.field4108 != 0)) {
                    if (~arg4 == -23) {
                        if (class366.field4875.field9373 || var12.field4164 != 0 || ~var12.field4169 == -2 || var12.field4186) {
                            class457 var25;
                            if (!var24) {
                                var25 = new class20(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg6, arg3);
                            } else {
                                class344 var26 = new class344(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg6, var23);
                                var25 = var26;
                                if (var26.method219(-52)) {
                                    var26.method225(arg5, arg2 + -32015);
                                }
                            }
                            class83.method633(arg9, arg1, arg0, var25);
                            if (~var12.field4169 == -2 && arg10 != null) {
                                arg10.method2187((byte) 1, arg0, arg1);
                            }
                        }
                    } else if (arg4 != 10 && ~arg4 != -12) {
                        if (~arg4 <= -13 && ~arg4 >= -18 || ~arg4 <= -19 && arg4 <= 21) {
                            class210 var27;
                            if (!var24) {
                                var27 = new class540(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg1, arg1 + -1 + var14, arg0, arg0 + var13 + -1, arg4, arg6, arg3);
                            } else {
                                class22 var28 = new class22(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg1, var14 + -1 + arg1, arg0, arg0 + -1 - -var13, arg4, arg6, var23);
                                if (var28.method219(arg2 + -51)) {
                                    var28.method225(arg5, -32013);
                                }
                                var27 = var28;
                            }
                            class190.method1291(var27, false);
                            if (class361.field4765 && !super.field3981 && arg4 >= 12 && arg4 <= 17 && ~arg4 != -14 && ~arg9 < -1 && ~var12.field4108 != -1) {
                                super.field3964[arg9][arg1][arg0] = (byte) class647.method3617(super.field3964[arg9][arg1][arg0], 4);
                            }
                            if (var12.field4169 != 0 && arg10 != null) {
                                arg10.method2173(arg1, arg0, var14, 90, !var12.field4105, var13, var12.field4175);
                            }
                        } else if (~arg4 == -1) {
                            int var29 = var12.field4108;
                            if (class651.field9042 && var12.field4108 == -1) {
                                var29 = 1;
                            }
                            class201 var30;
                            if (!var24) {
                                var30 = new class73(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, arg6, arg3);
                            } else {
                                class451 var31 = new class451(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, arg6, var23);
                                if (var31.method219(-50)) {
                                    var31.method225(arg5, -32013);
                                }
                                var30 = var31;
                            }
                            class400.method2334(arg9, arg1, arg0, var30, (class201) null);
                            if (arg6 != 0) {
                                if (arg6 != 1) {
                                    if (arg6 == 2) {
                                        if (class361.field4765 && var12.field4147) {
                                            var19.method319(arg1 - -1, arg0, 50);
                                            var19.method319(arg1 + 1, arg0 + 1, 50);
                                        }
                                        if (var29 == 1 && !super.field3981) {
                                            class674.method3825(-var12.field4130, arg9, arg1 - -1, 1, arg0, var12.field4159, ~arg2);
                                        }
                                    } else if (~arg6 == -4) {
                                        if (class361.field4765 && var12.field4147) {
                                            var19.method319(arg1, arg0, 50);
                                            var19.method319(arg1 + 1, arg0, 50);
                                        }
                                        if (var29 == 1 && !super.field3981) {
                                            class674.method3825(var12.field4130, arg9, arg1, 2, arg0, var12.field4159, -3);
                                        }
                                    }
                                } else {
                                    if (class361.field4765 && var12.field4147) {
                                        var19.method319(arg1, arg0 + 1, 50);
                                        var19.method319(arg1 + 1, arg0 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field3981) {
                                        class674.method3825(-var12.field4130, arg9, arg1, 2, arg0 + 1, var12.field4159, ~arg2);
                                    }
                                }
                            } else {
                                if (class361.field4765 && var12.field4147) {
                                    var19.method319(arg1, arg0, 50);
                                    var19.method319(arg1, arg0 + 1, 50);
                                }
                                if (var29 == 1 && !super.field3981) {
                                    class674.method3825(var12.field4130, arg9, arg1, 1, arg0, var12.field4159, -3);
                                }
                            }
                            if (var12.field4169 != 0 && arg10 != null) {
                                arg10.method2176(!var12.field4105, arg6, arg4, arg1, var12.field4175, -86, arg0);
                            }
                            if (var12.field4193 != 64) {
                                class285.method1757(arg9, arg1, arg0, var12.field4193);
                            }
                        } else if (~arg4 == -2) {
                            class201 var32;
                            if (!var24) {
                                var32 = new class73(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, arg6, arg3);
                            } else {
                                class451 var33 = new class451(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, arg6, var23);
                                if (var33.method219(-67)) {
                                    var33.method225(arg5, -32013);
                                }
                                var32 = var33;
                            }
                            class400.method2334(arg9, arg1, arg0, var32, (class201) null);
                            if (var12.field4147 && class361.field4765) {
                                if (~arg6 == -1) {
                                    var19.method319(arg1, arg0 + 1, 50);
                                } else if (~arg6 == -2) {
                                    var19.method319(arg1 - -1, arg0 + 1, 50);
                                } else if (arg6 == 2) {
                                    var19.method319(arg1 - -1, arg0, 50);
                                } else if (arg6 == 3) {
                                    var19.method319(arg1, arg0, 50);
                                }
                            }
                            if (~var12.field4169 != -1 && arg10 != null) {
                                arg10.method2176(!var12.field4105, arg6, arg4, arg1, var12.field4175, -80, arg0);
                            }
                        } else if (arg2 == arg4) {
                            int var34 = 3 & arg6 - -1;
                            class201 var37;
                            class201 var38;
                            if (var24) {
                                class451 var35 = new class451(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, arg6 - -4, var23);
                                class451 var36 = new class451(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, var34, var23);
                                if (var35.method219(-15)) {
                                    var35.method225(arg5, -32013);
                                }
                                var37 = var36;
                                if (var36.method219(-35)) {
                                    var36.method225(arg5, -32013);
                                }
                                var38 = var35;
                            } else {
                                var38 = new class73(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, arg6 + 4, arg3);
                                var37 = new class73(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, var34, arg3);
                            }
                            class400.method2334(arg9, arg1, arg0, var38, var37);
                            if ((~var12.field4108 == -2 || class651.field9042 && var12.field4108 == -1) && !super.field3981) {
                                if (arg6 == 0) {
                                    class674.method3825(var12.field4130, arg9, arg1, 1, arg0, var12.field4159, -3);
                                    class674.method3825(var12.field4130, arg9, arg1, 2, arg0 - -1, var12.field4159, ~arg2);
                                } else if (arg6 != 1) {
                                    if (arg6 != 2) {
                                        if (arg6 == 3) {
                                            class674.method3825(var12.field4130, arg9, arg1, 1, arg0, var12.field4159, -3);
                                            class674.method3825(var12.field4130, arg9, arg1, 2, arg0, var12.field4159, -3);
                                        }
                                    } else {
                                        class674.method3825(var12.field4130, arg9, arg1 + 1, 1, arg0, var12.field4159, -3);
                                        class674.method3825(var12.field4130, arg9, arg1, 2, arg0, var12.field4159, -3);
                                    }
                                } else {
                                    class674.method3825(var12.field4130, arg9, arg1 + 1, 1, arg0, var12.field4159, ~arg2);
                                    class674.method3825(var12.field4130, arg9, arg1, 2, arg0 - -1, var12.field4159, -3);
                                }
                            }
                            if (~var12.field4169 != -1 && arg10 != null) {
                                arg10.method2176(!var12.field4105, arg6, arg4, arg1, var12.field4175, -46, arg0);
                            }
                            if (~var12.field4193 != -65) {
                                class285.method1757(arg9, arg1, arg0, var12.field4193);
                            }
                        } else if (~arg4 == -4) {
                            class201 var39;
                            if (!var24) {
                                var39 = new class73(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, arg6, arg3);
                            } else {
                                class451 var40 = new class451(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg4, arg6, var23);
                                var39 = var40;
                                if (var40.method219(86)) {
                                    var40.method225(arg5, -32013);
                                }
                            }
                            class400.method2334(arg9, arg1, arg0, var39, (class201) null);
                            if (var12.field4147 && class361.field4765) {
                                if (~arg6 == -1) {
                                    var19.method319(arg1, arg0 - -1, 50);
                                } else if (arg6 == 1) {
                                    var19.method319(arg1 + 1, arg0 + 1, 50);
                                } else if (~arg6 != -3) {
                                    if (~arg6 == -4) {
                                        var19.method319(arg1, arg0, 50);
                                    }
                                } else {
                                    var19.method319(arg1 - -1, arg0, 50);
                                }
                            }
                            if (var12.field4169 != 0 && arg10 != null) {
                                arg10.method2176(!var12.field4105, arg6, arg4, arg1, var12.field4175, -69, arg0);
                            }
                        } else if (~arg4 == -10) {
                            class210 var42;
                            if (var24) {
                                class22 var41 = new class22(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg1, arg1, arg0, arg0, arg4, arg6, var23);
                                var42 = var41;
                                if (var41.method219(-54)) {
                                    var41.method225(arg5, -32013);
                                }
                            } else {
                                var42 = new class540(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg1, arg1 + var14 - 1, arg0, arg0 + var13 + -1, arg4, arg6, arg3);
                            }
                            class190.method1291(var42, false);
                            if (var12.field4169 != 0 && arg10 != null) {
                                arg10.method2173(arg1, arg0, var14, 6, !var12.field4105, var13, var12.field4175);
                            }
                            if (~var12.field4193 != -65) {
                                class285.method1757(arg9, arg1, arg0, var12.field4193);
                            }
                        } else if (~arg4 == -5) {
                            class353 var44;
                            if (var24) {
                                class659 var43 = new class659(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, 0, 0, arg4, arg6);
                                var44 = var43;
                                if (var43.method219(arg2 ^ -95)) {
                                    var43.method225(arg5, arg2 ^ -32015);
                                }
                            } else {
                                var44 = new class255(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, 0, 0, arg4, arg6, arg3);
                            }
                            class442.method2510(arg9, arg1, arg0, var44, (class353) null);
                        } else if (arg4 == 5) {
                            int var45 = 65;
                            class526 var46 = (class526) class119.method848(arg9, arg1, arg0);
                            if (var46 != null) {
                                var45 = 1 + class475.field6543.method2685(var46.method211((byte) -35), -103).field4193;
                            }
                            class353 var48;
                            if (var24) {
                                class659 var47 = new class659(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, class520.field7081[arg6] * var45, class98.field1381[arg6] * var45, arg4, arg6);
                                var48 = var47;
                                if (var47.method219(-111)) {
                                    var47.method225(arg5, -32013);
                                }
                            } else {
                                var48 = new class255(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, class520.field7081[arg6] * var45, class98.field1381[arg6] * var45, arg4, arg6, arg3);
                            }
                            class442.method2510(arg9, arg1, arg0, var48, (class353) null);
                        } else if (~arg4 == -7) {
                            int var49 = 33;
                            class526 var50 = (class526) class119.method848(arg9, arg1, arg0);
                            if (var50 != null) {
                                var49 = 1 + class475.field6543.method2685(var50.method211((byte) 113), -74).field4193 / 2;
                            }
                            class353 var51;
                            if (!var24) {
                                var51 = new class255(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, class320.field4380[arg6] * var49, class698.field9903[arg6] * var49, arg4, arg6 + 4, arg3);
                            } else {
                                class659 var52 = new class659(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, class520.field7081[arg6] * var49, class98.field1381[arg6] * var49, arg4, arg6 + 4);
                                var51 = var52;
                                if (var52.method219(-25)) {
                                    var52.method225(arg5, -32013);
                                }
                            }
                            class442.method2510(arg9, arg1, arg0, var51, (class353) null);
                        } else if (arg4 == 7) {
                            int var53 = arg6 + 2 & 3;
                            class353 var54;
                            if (!var24) {
                                var54 = new class255(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, 0, 0, arg4, var53 + 4, arg3);
                            } else {
                                class659 var55 = new class659(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, 0, 0, arg4, var53 - -4);
                                var54 = var55;
                                if (var55.method219(arg2 + 72)) {
                                    var55.method225(arg5, arg2 ^ -32015);
                                }
                            }
                            class442.method2510(arg9, arg1, arg0, var54, (class353) null);
                        } else if (~arg4 == -9) {
                            int var56 = arg6 + 2 & 3;
                            int var57 = 33;
                            class526 var58 = (class526) class119.method848(arg9, arg1, arg0);
                            if (var58 != null) {
                                var57 = 1 + class475.field6543.method2685(var58.method211((byte) 99), -77).field4193 / 2;
                            }
                            class353 var61;
                            class353 var62;
                            if (var24) {
                                class659 var59 = new class659(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, class320.field4380[arg6] * var57, class698.field9903[arg6] * var57, arg4, arg6 + 4);
                                class659 var60 = new class659(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, 0, 0, arg4, var56 + 4);
                                if (var59.method219(95)) {
                                    var59.method225(arg5, -32013);
                                }
                                if (var60.method219(arg2 + 117)) {
                                    var60.method225(arg5, -32013);
                                }
                                var61 = var59;
                                var62 = var60;
                            } else {
                                class255 var63 = new class255(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, class320.field4380[arg6] * var57, class698.field9903[arg6] * var57, arg4, arg6 + 4, arg3);
                                class255 var64 = new class255(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, 0, 0, arg4, var56 + 4, arg3);
                                var61 = var63;
                                var62 = var64;
                            }
                            class442.method2510(arg9, arg1, arg0, var61, var62);
                        }
                    } else {
                        class22 var65 = null;
                        int var67;
                        class210 var68;
                        if (var24) {
                            class22 var66 = new class22(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg1, var14 + -1 + arg1, arg0, arg0 - 1 + var13, arg4, arg6, var23);
                            var67 = var66.method229(false);
                            var65 = var66;
                            var68 = var66;
                        } else {
                            var68 = new class540(arg5, var12, arg9, arg8, var21, var20, var22, super.field3981, arg1, arg1 + -1 + var14, arg0, arg0 + -1 + var13, arg4, arg6, arg3);
                            var67 = 15;
                        }
                        if (class190.method1291(var68, false)) {
                            if (var65 != null && var65.method219(86)) {
                                var65.method225(arg5, -32013);
                            }
                            if (var12.field4147 && class361.field4765) {
                                if (var67 > 30) {
                                    var67 = 30;
                                }
                                for (int var69 = 0; var14 >= var69; ++var69) {
                                    for (int var70 = 0; var70 <= var13; ++var70) {
                                        var19.method319(arg1 + var69, arg0 + var70, var67);
                                    }
                                }
                            }
                        }
                        if (var12.field4169 != 0 && arg10 != null) {
                            arg10.method2173(arg1, arg0, var14, 41, !var12.field4105, var13, var12.field4175);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "([I[JI)V")
    public static final void method3524(int[] arg0, long[] arg1, int arg2) {
        if (arg2 == 8) {
            class317.method1914(0, arg1, true, arg0, arg1.length + -1);
            ++field8736;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZI)Z")
    public static final boolean method3525(int arg0, boolean arg1, int arg2) {
        ++field8740;
        if (!arg1) {
            return false;
        } else {
            return ~(arg2 & 33) != -1;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IILnn;IIILr;)V")
    public final void method3526(int arg0, int arg1, class380 arg2, int arg3, int arg4, int arg5, class166 arg6) {
        ++field8738;
        if (arg1 > -17) {
            field8745 = null;
        }
        class526 var8 = null;
        if (arg3 == 0) {
            var8 = (class526) class119.method848(arg5, arg0, arg4);
        }
        if (arg3 == 1) {
            var8 = (class526) class41.method365(arg5, arg0, arg4);
        }
        if (~arg3 == -3) {
            var8 = (class526) class610.method3421(arg5, arg0, arg4, field8748 != null ? field8748 : (field8748 = method3533("kj")));
        }
        if (~arg3 == -4) {
            var8 = (class526) class423.method2445(arg5, arg0, arg4);
        }
        if (var8 != null) {
            class301 var9 = class475.field6543.method2685(var8.method211((byte) -111), -110);
            int var10 = var8.method222(true);
            int var11 = var8.method213((byte) 114);
            if (var9.method1831(150)) {
                class332.method1964(arg4, arg5, var9, -1347765623, arg0);
            }
            if (var8.method219(-61)) {
                var8.method210((byte) 12, arg6);
            }
            if (arg3 == 0) {
                class378.method2161(arg5, arg0, arg4);
                if (~var9.field4169 != -1) {
                    arg2.method2178(arg0, arg4, !var9.field4105, var10, var9.field4175, 160, var11);
                }
                if (var9.field4108 == 1) {
                    if (var11 != 0) {
                        if (~var11 == -2) {
                            class39.method351(arg4 + 1, (byte) -122, arg5, arg0, 2);
                            return;
                        }
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                class39.method351(arg4, (byte) -126, arg5, arg0, 2);
                                return;
                            }
                        } else {
                            class39.method351(arg4, (byte) -122, arg5, arg0 - -1, 1);
                        }
                        return;
                    }
                    class39.method351(arg4, (byte) -128, arg5, arg0, 1);
                    return;
                }
            } else if (~arg3 != -2) {
                if (arg3 == 2) {
                    class60.method495(arg5, arg0, arg4, field8748 != null ? field8748 : (field8748 = method3533("kj")));
                    if (~var9.field4169 != -1 && arg0 - -var9.field4109 < super.field3986 && arg4 - -var9.field4109 < super.field3976 && super.field3986 > var9.field4119 + arg0 && super.field3976 > var9.field4119 + arg4) {
                        arg2.method2179(-2, arg4, !var9.field4105, arg0, var11, var9.field4109, var9.field4175, var9.field4119);
                        return;
                    }
                    return;
                }
                if (arg3 == 3) {
                    class474.method2676(arg5, arg0, arg4);
                    if (var9.field4169 == 1) {
                        arg2.method2182(arg4, arg0, -1);
                        return;
                    }
                }
            } else {
                class264.method1612(arg5, arg0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lac;IIII[IIIIILr;)V")
    public final void method3527(class501 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, class166 arg10) {
        ++field8743;
        if (!super.field3981) {
            boolean var12 = false;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            class689 var13 = null;
            int var14 = (7 & arg2) * 8;
            if (arg7 == 2) {
                int var15 = (arg1 & 7) * 8;
                while (true) {
                    while (arg0.field6855.length > arg0.field6892) {
                        int var20 = arg0.method2874((byte) -75);
                        if (var20 == 0) {
                            var13 = new class689(arg0);
                        } else if (var20 == 1) {
                            int var34 = arg0.method2874((byte) -75);
                            if (~var34 < -1) {
                                for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                    class130 var36 = new class130(arg10, arg0, 2);
                                    if (var36.field1871 == 31) {
                                        class532 var37 = class683.field9761.method66(false, arg0.method2845(-1));
                                        var36.method923(-17371, var37.field7190, var37.field7188, var37.field7192, var37.field7191);
                                    }
                                    if (arg10.method203() > 0) {
                                        class186 var38 = var36.field1852;
                                        int var39 = var38.method1280(true) >> 9;
                                        int var40 = var38.method1279(0) >> 9;
                                        if (~var36.field1870 == ~arg6 && var39 >= var14 && var14 - -8 > var39 && var15 <= var40 && ~var40 > ~(var15 + 8)) {
                                            int var41 = (arg8 << 9) + class635.method3545(var38.method1280(true) & 4095, arg4, 4095 & var38.method1279(arg7 ^ 2), true);
                                            int var42 = var41 >> 9;
                                            int var43 = (arg9 << 9) - -class483.method2712(var38.method1280(true) & 4095, arg4, arg7 ^ 2, 4095 & var38.method1279(0));
                                            int var44 = var43 >> 9;
                                            if (var42 >= 0 && ~var44 <= -1 && ~super.field3986 < ~var42 && ~var44 > ~super.field3976) {
                                                var38.method74(var41, var43, super.field3989[arg6][var42][var44] + -var38.method1282((byte) 102), (byte) -124);
                                                class466.method2629(var36);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var20 == 2) {
                            if (var13 == null) {
                                var13 = new class689();
                            }
                            var13.method3885(arg0, 65);
                        } else if (var20 == 128) {
                            if (arg5 == null) {
                                arg0.field6892 += 10;
                            } else {
                                arg5[0] = arg0.method2845(-1);
                                arg5[1] = arg0.method2875(false);
                                arg5[2] = arg0.method2875(false);
                                arg5[3] = arg0.method2875(false);
                                arg5[4] = arg0.method2845(arg7 + -3);
                            }
                        } else {
                            if (var20 != 129) {
                                throw new IllegalStateException("");
                            }
                            if (super.field3983 == null) {
                                super.field3983 = new byte[4][][];
                            }
                            for (int var21 = 0; ~var21 > -5; ++var21) {
                                byte var22 = arg0.method2863(127);
                                if (~var22 == -1 && super.field3983[arg3] != null) {
                                    if (~var21 >= ~arg6) {
                                        int var23 = arg8;
                                        int var24 = arg8 - -7;
                                        int var25 = arg9;
                                        if (~arg8 > -1) {
                                            var23 = 0;
                                        } else if (~super.field3986 >= ~arg8) {
                                            var23 = super.field3986;
                                        }
                                        int var26 = arg9 + 7;
                                        if (var24 < 0) {
                                            var24 = 0;
                                        } else if (~super.field3986 >= ~var24) {
                                            var24 = super.field3986;
                                        }
                                        if (~arg9 > -1) {
                                            var25 = 0;
                                        } else if (arg9 >= super.field3976) {
                                            var25 = super.field3976;
                                        }
                                        if (~var26 <= -1) {
                                            if (var26 >= super.field3976) {
                                                var26 = super.field3976;
                                            }
                                        } else {
                                            var26 = 0;
                                        }
                                        while (var23 < var24) {
                                            while (~var25 > ~var26) {
                                                super.field3983[arg3][var23][var25] = 0;
                                                ++var25;
                                            }
                                            ++var23;
                                        }
                                    }
                                } else if (~var22 == -2) {
                                    if (super.field3983[arg3] == null) {
                                        super.field3983[arg3] = new byte[super.field3986 - -1][super.field3976 - -1];
                                    }
                                    for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                        for (int var28 = 0; var28 < 64; var28 += 4) {
                                            byte var29 = arg0.method2863(arg7 ^ 98);
                                            if (~var21 >= ~arg6) {
                                                for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                    for (int var31 = var28; ~var31 > ~(var28 + 4); ++var31) {
                                                        if (~var30 <= ~var14 && var14 - -8 > var30 && ~var15 >= ~var31 && var15 - -8 > var15) {
                                                            int var32 = class216.method1391(7 & var31, 52, arg4, var30 & 7) + arg8;
                                                            int var33 = arg9 - -class681.method3863((byte) 94, var30 & 7, var31 & 7, arg4);
                                                            if (~var32 <= -1 && ~var32 > ~super.field3986 && ~var33 <= -1 && super.field3976 > var33) {
                                                                super.field3983[arg3][var32][var33] = var29;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var13 != null) {
                        class469.method2654(arg8 >> 3, (byte) -119, arg9 >> 3, var13);
                    }
                    if (!var12 && super.field3983 != null && super.field3983[arg3] != null) {
                        int var16 = arg8 + 7;
                        int var17 = arg9 - -7;
                        for (int var18 = arg8; ~var18 > ~var16; ++var18) {
                            for (int var19 = arg9; ~var17 < ~var19; ++var19) {
                                super.field3983[arg3][var18][var19] = 0;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lr;BZ)V")
    public final void method3528(class166 arg0, byte arg1, boolean arg2) {
        ++field8735;
        class671.method3791();
        if (!arg2) {
            if (super.field3985 > 1) {
                for (int var4 = 0; ~var4 > ~super.field3986; ++var4) {
                    for (int var5 = 0; super.field3976 > var5; ++var5) {
                        if ((2 & class492.field6720[1][var4][var5]) == 2) {
                            class552.method3099(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; super.field3985 > var6; ++var6) {
                for (int var7 = 0; var7 <= super.field3976; ++var7) {
                    for (int var8 = 0; ~var8 >= ~super.field3986; ++var8) {
                        if ((super.field3964[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && (4 & super.field3964[var6][var8][var11 + -1]) != 0 && var12 - var11 < 10) {
                                --var11;
                            }
                            while (~var12 > ~super.field3976 && ~(4 & super.field3964[var6][var8][var12 + 1]) != -1 && ~(-var11 + var12) > -11) {
                                ++var12;
                            }
                            label114: while (var9 > 0 && var10 - var9 < 10) {
                                for (int var13 = var11; ~var13 >= ~var12; ++var13) {
                                    if (~(4 & super.field3964[var6][var9 + -1][var13]) == -1) {
                                        break label114;
                                    }
                                }
                                --var9;
                            }
                            label101: while (super.field3986 > var10 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; ~var14 >= ~var12; ++var14) {
                                    if ((super.field3964[var6][var10 - -1][var14] & 4) == 0) {
                                        break label101;
                                    }
                                }
                                ++var10;
                            }
                            if (~((var10 + 1 - var9) * (var12 + 1 - var11)) <= -5) {
                                int var15 = super.field3989[var6][var9][var11];
                                class541.method3057(var6, var9 << 9, var15, (var12 << 9) + 512, (var10 << 9) + 512, (byte) 49, var15, var11 << 9, 4);
                                for (int var16 = var9; var10 >= var16; ++var16) {
                                    for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                                        super.field3964[var6][var16][var17] = (byte) class136.method950(super.field3964[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class298.method1810(-122);
        }
        super.field3964 = null;
        int var18 = -94 % ((-49 - arg1) / 62);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V")
    public static void method3529(boolean arg0) {
        field8745 = null;
        if (!arg0) {
            field8744 = null;
            field8746 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "([IIIILac;Lr;)V")
    public final void method3530(int[] arg0, int arg1, int arg2, int arg3, class501 arg4, class166 arg5) {
        ++field8742;
        if (!super.field3981) {
            boolean var7 = false;
            class689 var8 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            if (arg2 != -9649) {
                this.field8739 = -12;
            }
            while (true) {
                while (arg4.field6855.length > arg4.field6892) {
                    int var18 = arg4.method2874((byte) -75);
                    if (var18 == 0) {
                        var8 = new class689(arg4);
                    } else if (var18 == 1) {
                        int var19 = arg4.method2874((byte) -75);
                        if (var19 > 0) {
                            for (int var20 = 0; var19 > var20; ++var20) {
                                class130 var21 = new class130(arg5, arg4, 2);
                                if (var21.field1871 == 31) {
                                    class532 var22 = class683.field9761.method66(false, arg4.method2845(arg2 + 9648));
                                    var21.method923(arg2 ^ 26218, var22.field7190, var22.field7188, var22.field7192, var22.field7191);
                                }
                                if (arg5.method203() > 0) {
                                    class186 var23 = var21.field1852;
                                    int var24 = var23.method1280(true) + (arg1 << 9);
                                    int var25 = var23.method1279(arg2 + 9649) - -(arg3 << 9);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (~var26 <= -1 && ~var27 <= -1 && ~super.field3986 < ~var26 && ~var27 > ~super.field3976) {
                                        var23.method74(var24, var25, super.field3989[var21.field1870][var26][var27] + -var23.method1282((byte) 102), (byte) 97);
                                        class466.method2629(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class689();
                        }
                        var8.method3885(arg4, 117);
                    } else if (~var18 == -129) {
                        if (arg0 == null) {
                            arg4.field6892 += 10;
                        } else {
                            arg0[0] = arg4.method2845(class324.method1944(arg2, 9648));
                            arg0[1] = arg4.method2875(false);
                            arg0[2] = arg4.method2875(false);
                            arg0[3] = arg4.method2875(false);
                            arg0[4] = arg4.method2845(-1);
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field3983 == null) {
                            super.field3983 = new byte[4][][];
                        }
                        for (int var28 = 0; ~var28 > -5; ++var28) {
                            byte var29 = arg4.method2863(99);
                            if (var29 == 0 && super.field3983[var28] != null) {
                                int var30 = arg1;
                                int var31 = arg1 - -64;
                                int var32 = arg3;
                                if (~arg3 <= -1) {
                                    if (~super.field3976 >= ~arg3) {
                                        var32 = super.field3976;
                                    }
                                } else {
                                    var32 = 0;
                                }
                                if (arg1 < 0) {
                                    var30 = 0;
                                } else if (super.field3986 <= arg1) {
                                    var30 = super.field3986;
                                }
                                if (~var31 <= -1) {
                                    if (~super.field3986 >= ~var31) {
                                        var31 = super.field3986;
                                    }
                                } else {
                                    var31 = 0;
                                }
                                int var33 = arg3 + 64;
                                if (var33 < 0) {
                                    var33 = 0;
                                } else if (super.field3976 <= var33) {
                                    var33 = super.field3976;
                                }
                                while (~var30 > ~var31) {
                                    while (~var33 < ~var32) {
                                        super.field3983[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 == -2) {
                                if (super.field3983[var28] == null) {
                                    super.field3983[var28] = new byte[super.field3986 - -1][super.field3976 - -1];
                                }
                                for (int var34 = 0; ~var34 > -65; var34 += 4) {
                                    for (int var35 = 0; var35 < 64; var35 += 4) {
                                        byte var36 = arg4.method2863(125);
                                        for (int var37 = arg1 + var34; ~(var34 + 4 + arg1) < ~var37; ++var37) {
                                            for (int var38 = arg3 + var35; ~(arg3 + var35 + 4) < ~var38; ++var38) {
                                                if (~var37 <= -1 && var37 < super.field3986 && var38 >= 0 && ~super.field3976 < ~var38) {
                                                    super.field3983[var28][var37][var38] = var36;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (var29 == 2) {
                                if (super.field3983[var28] == null) {
                                    super.field3983[var28] = new byte[super.field3986 - -1][super.field3976 + 1];
                                }
                                if (~var28 < -1) {
                                    int var39 = arg1;
                                    int var40 = arg1 + 64;
                                    int var41 = arg3;
                                    if (arg3 >= 0) {
                                        if (arg3 >= super.field3976) {
                                            var41 = super.field3976;
                                        }
                                    } else {
                                        var41 = 0;
                                    }
                                    if (var40 < 0) {
                                        var40 = 0;
                                    } else if (~var40 <= ~super.field3986) {
                                        var40 = super.field3986;
                                    }
                                    if (~arg1 > -1) {
                                        var39 = 0;
                                    } else if (~arg1 <= ~super.field3986) {
                                        var39 = super.field3986;
                                    }
                                    int var42 = arg3 + 64;
                                    if (~var42 <= -1) {
                                        if (var42 >= super.field3976) {
                                            var42 = super.field3976;
                                        }
                                    } else {
                                        var42 = 0;
                                    }
                                    while (~var39 > ~var40) {
                                        while (~var42 < ~var41) {
                                            super.field3983[var28][var39][var41] = super.field3983[var28 - 1][var39][var41];
                                            ++var41;
                                        }
                                        ++var39;
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg1 >> 3) + var9;
                            int var12 = (arg3 >> 3) + var10;
                            if (var11 >= 0 && ~(super.field3986 >> 3) < ~var11 && var12 >= 0 && super.field3976 >> 3 > var12) {
                                class469.method2654(var11, (byte) -125, var12, var8);
                            }
                        }
                    }
                }
                if (!var7 && super.field3983 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field3983[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg1 >> 2) + var14;
                                    int var17 = (arg3 >> 2) + var15;
                                    if (var16 >= 0 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                        super.field3983[var13][var16][var17] = 0;
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "([Lnn;[BILr;II)V")
    public final void method3531(class380[] arg0, byte[] arg1, int arg2, class166 arg3, int arg4, int arg5) {
        int var7 = -7 / ((-61 - arg2) / 60);
        ++field8747;
        class501 var8 = new class501(arg1);
        int var9 = -1;
        while (true) {
            int var10 = var8.method2835((byte) 29);
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method2871((byte) -87);
                if (var12 == 0) {
                    break;
                }
                var11 += var12 + -1;
                int var13 = 63 & var11;
                int var14 = (var11 & 4089) >> 6;
                int var15 = var11 >> 12;
                int var16 = var8.method2874((byte) -75);
                int var17 = var16 >> 2;
                int var18 = 3 & var16;
                int var19 = arg4 + var14;
                int var20 = arg5 + var13;
                if (var19 > 0 && var20 > 0 && ~var19 > ~(super.field3986 + -1) && super.field3976 + -1 > var20) {
                    class380 var21 = null;
                    if (!super.field3981) {
                        int var22 = var15;
                        if (~(class492.field6720[1][var19][var20] & 2) == -3) {
                            var22 = var15 - 1;
                        }
                        if (~var22 <= -1) {
                            var21 = arg0[var22];
                        }
                    }
                    this.method3523(var20, var19, 2, -1, var17, arg3, var18, var9, var15, var15, var21);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "([Lnn;IIII[BILr;III)V")
    public final void method3532(class380[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, class166 arg7, int arg8, int arg9, int arg10) {
        ++field8737;
        class501 var12 = new class501(arg5);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2835((byte) 29);
            if (~var14 == -1) {
                if (arg4 >= -28) {
                    this.method3532((class380[]) null, 111, -65, -83, -27, (byte[]) null, -12, (class166) null, 58, 15, 108);
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2871((byte) -87);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = 63 & var15;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method2874((byte) -75);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg9 == var19 && arg6 <= var18 && arg6 + 8 > var18 && arg2 <= var17 && arg2 - -8 > var17) {
                    class301 var23 = class475.field6543.method2685(var13, -69);
                    int var24 = arg10 + class570.method3267(var23.field4109, arg1, var18 & 7, var22, 3, var17 & 7, var23.field4119);
                    int var25 = arg8 + class603.method3393(7, arg1, 7 & var18, var22, 7 & var17, var23.field4119, var23.field4109);
                    if (~var24 < -1 && ~var25 < -1 && ~var24 > ~(super.field3986 + -1) && super.field3976 + -1 > var25) {
                        class380 var26 = null;
                        if (!super.field3981) {
                            int var27 = arg3;
                            if ((class492.field6720[1][var24][var25] & 2) == 2) {
                                var27 = arg3 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg0[var27];
                            }
                        }
                        this.method3523(var25, var24, 2, -1, var21, arg7, 3 & arg1 + var22, var13, arg3, arg3, var26);
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3533(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
