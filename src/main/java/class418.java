import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class418 extends class501 {

    @OriginalMember(owner = "client!du", name = "L", descriptor = "I")
    public int field5981 = 99;

    @OriginalMember(owner = "client!du", name = "F", descriptor = "F")
    public static float field5975;

    @OriginalMember(owner = "client!du", name = "G", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!du", name = "H", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!du", name = "I", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!du", name = "J", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!du", name = "K", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!du", name = "M", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!du", name = "N", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!du", name = "O", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!du", name = "P", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!du", name = "Q", descriptor = "I")
    public static int field5986;

    // $FF: synthetic field
    @OriginalMember(owner = "client!du", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field5987;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIILha;IIIIILfe;)V")
    public final void method2539(int arg0, int arg1, int arg2, int arg3, class543 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class635 arg10) {
        ++field5978;
        if (class243.field3580.field8002.method2026(false) != 0 || class583.method3433((byte) 16, class717.field10118, arg0, arg7, arg8)) {
            if (this.field5981 > arg3) {
                this.field5981 = arg3;
            }
            class482 var12 = class375.field5421.method2680(arg2, (byte) 84);
            if (class243.field3580.field8008.method4186(false) != 0 || !var12.field6896) {
                int var13;
                int var14;
                if (arg9 != 1 && ~arg9 != -4) {
                    var13 = var12.field6936;
                    var14 = var12.field6879;
                } else {
                    var13 = var12.field6879;
                    var14 = var12.field6936;
                }
                int var15;
                int var16;
                if (~(arg8 + var13) < ~super.field7262) {
                    var15 = arg8 + 1;
                    var16 = arg8;
                } else {
                    var16 = (var13 >> 1) + arg8;
                    var15 = (var13 + 1 >> 1) + arg8;
                }
                int var17;
                int var18;
                if (arg7 + var14 <= super.field7253) {
                    var17 = (var14 >> 1) + arg7;
                    var18 = (var14 - -1 >> 1) + arg7;
                } else {
                    var18 = arg7 + 1;
                    var17 = arg7;
                }
                class339 var19 = class95.field1372[arg0];
                int var20 = var19.method2087(84, var16, var17) - (-var19.method2087(112, var15, var17) - var19.method2087(105, var16, var18)) - -var19.method2087(65, var15, var18) >> 2;
                int var21 = (arg8 << 9) + (var13 << 8);
                int var22 = (arg7 << 9) - -(var14 << 8);
                boolean var23 = class238.field3551 && !super.field7266 && var12.field6894;
                if (var12.method2950(0)) {
                    class709.method3965(arg7, (class571) null, arg8, var12, (class639) null, arg3, (byte) -14, arg9);
                }
                boolean var24 = arg5 == -1 && ~var12.field6906 == 0 && var12.field6945 == null && var12.field6900 == null && !var12.field6887;
                if (!class490.field7062 || (!class520.method3160(arg1, 10605) || ~var12.field6927 == -2) && (!class667.method3809(100, arg1) || ~var12.field6927 != -1)) {
                    if (~arg1 == -23) {
                        if (~class243.field3580.field7996.method2663(false) != -1 || var12.field6903 != 0 || ~var12.field6895 == -2 || var12.field6899) {
                            class644 var26;
                            if (var24) {
                                class724 var25 = new class724(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg9, var23);
                                if (var25.method611(15795)) {
                                    var25.method608(arg4, 114);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class92(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg9, arg5);
                            }
                            class484.method2956(arg3, arg8, arg7, var26);
                            if (var12.field6895 == 1 && arg10 != null) {
                                arg10.method3643(arg8, 262144, arg7);
                            }
                        }
                    } else if (arg1 != 10 && arg1 != 11) {
                        int var27 = 88 / ((arg6 - -30) / 53);
                        if (arg1 >= 12 && ~arg1 >= -18 || ~arg1 <= -19 && ~arg1 >= -22) {
                            class638 var28;
                            if (!var24) {
                                var28 = new class223(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg8, arg8 + -1 + var13, arg7, arg7 + -1 + var14, arg1, arg9, arg5);
                            } else {
                                class610 var29 = new class610(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg8, arg8 + var13 - 1, arg7, arg7 - 1 + var14, arg1, arg9, var23);
                                var28 = var29;
                                if (var29.method611(15795)) {
                                    var29.method608(arg4, -25);
                                }
                            }
                            class262.method1734(var28, false);
                            if (class238.field3551 && !super.field7266 && arg1 >= 12 && ~arg1 >= -18 && ~arg1 != -14 && arg3 > 0 && var12.field6927 != 0) {
                                super.field7258[arg3][arg8][arg7] = (byte) class430.method2658(super.field7258[arg3][arg8][arg7], 4);
                            }
                            if (var12.field6895 != 0 && arg10 != null) {
                                arg10.method3648(var12.field6910, var14, var13, arg7, !var12.field6935, (byte) 118, arg8);
                            }
                        } else if (~arg1 == -1) {
                            int var30 = var12.field6927;
                            if (class158.field2259 && ~var12.field6927 == 0) {
                                var30 = 1;
                            }
                            class19 var31;
                            if (!var24) {
                                var31 = new class544(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, arg9, arg5);
                            } else {
                                class311 var32 = new class311(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, arg9, var23);
                                if (var32.method611(15795)) {
                                    var32.method608(arg4, 100);
                                }
                                var31 = var32;
                            }
                            class319.method1981(arg3, arg8, arg7, var31, (class19) null);
                            if (~arg9 == -1) {
                                if (class238.field3551 && var12.field6912) {
                                    var19.method41(arg8, arg7, 50);
                                    var19.method41(arg8, arg7 + 1, 50);
                                }
                                if (var30 == 1 && !super.field7266) {
                                    class724.method4048(var12.field6959, arg8, 1, arg7, arg3, var12.field6897, 81);
                                }
                            } else if (arg9 == 1) {
                                if (class238.field3551 && var12.field6912) {
                                    var19.method41(arg8, arg7 + 1, 50);
                                    var19.method41(arg8 + 1, arg7 - -1, 50);
                                }
                                if (~var30 == -2 && !super.field7266) {
                                    class724.method4048(-var12.field6959, arg8, 2, arg7 + 1, arg3, var12.field6897, -113);
                                }
                            } else if (arg9 != 2) {
                                if (arg9 == 3) {
                                    if (class238.field3551 && var12.field6912) {
                                        var19.method41(arg8, arg7, 50);
                                        var19.method41(arg8 + 1, arg7, 50);
                                    }
                                    if (~var30 == -2 && !super.field7266) {
                                        class724.method4048(var12.field6959, arg8, 2, arg7, arg3, var12.field6897, -52);
                                    }
                                }
                            } else {
                                if (class238.field3551 && var12.field6912) {
                                    var19.method41(arg8 + 1, arg7, 50);
                                    var19.method41(arg8 + 1, arg7 + 1, 50);
                                }
                                if (var30 == 1 && !super.field7266) {
                                    class724.method4048(-var12.field6959, arg8 + 1, 1, arg7, arg3, var12.field6897, 100);
                                }
                            }
                            if (var12.field6895 != 0 && arg10 != null) {
                                arg10.method3644(arg7, var12.field6910, !var12.field6935, arg9, arg8, arg1, true);
                            }
                            if (~var12.field6974 != -65) {
                                class750.method4179(arg3, arg8, arg7, var12.field6974);
                            }
                        } else if (arg1 == 1) {
                            class19 var34;
                            if (var24) {
                                class311 var33 = new class311(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, arg9, var23);
                                if (var33.method611(15795)) {
                                    var33.method608(arg4, -126);
                                }
                                var34 = var33;
                            } else {
                                var34 = new class544(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, arg9, arg5);
                            }
                            class319.method1981(arg3, arg8, arg7, var34, (class19) null);
                            if (var12.field6912 && class238.field3551) {
                                if (~arg9 != -1) {
                                    if (~arg9 == -2) {
                                        var19.method41(arg8 + 1, arg7 + 1, 50);
                                    } else if (arg9 == 2) {
                                        var19.method41(arg8 + 1, arg7, 50);
                                    } else if (arg9 == 3) {
                                        var19.method41(arg8, arg7, 50);
                                    }
                                } else {
                                    var19.method41(arg8, arg7 + 1, 50);
                                }
                            }
                            if (~var12.field6895 != -1 && arg10 != null) {
                                arg10.method3644(arg7, var12.field6910, !var12.field6935, arg9, arg8, arg1, true);
                            }
                        } else if (arg1 == 2) {
                            int var35 = 3 & arg9 + 1;
                            class19 var36;
                            class19 var37;
                            if (!var24) {
                                var36 = new class544(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, arg9 + 4, arg5);
                                var37 = new class544(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, var35, arg5);
                            } else {
                                class311 var38 = new class311(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, arg9 + 4, var23);
                                class311 var39 = new class311(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, var35, var23);
                                if (var38.method611(15795)) {
                                    var38.method608(arg4, 111);
                                }
                                var37 = var39;
                                if (var39.method611(15795)) {
                                    var39.method608(arg4, 2);
                                }
                                var36 = var38;
                            }
                            class319.method1981(arg3, arg8, arg7, var36, var37);
                            if ((var12.field6927 == 1 || class158.field2259 && ~var12.field6927 == 0) && !super.field7266) {
                                if (arg9 == 0) {
                                    class724.method4048(var12.field6959, arg8, 1, arg7, arg3, var12.field6897, 64);
                                    class724.method4048(var12.field6959, arg8, 2, arg7 + 1, arg3, var12.field6897, 91);
                                } else if (arg9 != 1) {
                                    if (arg9 != 2) {
                                        if (~arg9 == -4) {
                                            class724.method4048(var12.field6959, arg8, 1, arg7, arg3, var12.field6897, 117);
                                            class724.method4048(var12.field6959, arg8, 2, arg7, arg3, var12.field6897, -108);
                                        }
                                    } else {
                                        class724.method4048(var12.field6959, arg8 + 1, 1, arg7, arg3, var12.field6897, -71);
                                        class724.method4048(var12.field6959, arg8, 2, arg7, arg3, var12.field6897, 123);
                                    }
                                } else {
                                    class724.method4048(var12.field6959, arg8 - -1, 1, arg7, arg3, var12.field6897, 109);
                                    class724.method4048(var12.field6959, arg8, 2, arg7 - -1, arg3, var12.field6897, 92);
                                }
                            }
                            if (var12.field6895 != 0 && arg10 != null) {
                                arg10.method3644(arg7, var12.field6910, !var12.field6935, arg9, arg8, arg1, true);
                            }
                            if (var12.field6974 != 64) {
                                class750.method4179(arg3, arg8, arg7, var12.field6974);
                            }
                        } else if (arg1 == 3) {
                            class19 var41;
                            if (var24) {
                                class311 var40 = new class311(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, arg9, var23);
                                var41 = var40;
                                if (var40.method611(15795)) {
                                    var40.method608(arg4, 120);
                                }
                            } else {
                                var41 = new class544(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg1, arg9, arg5);
                            }
                            class319.method1981(arg3, arg8, arg7, var41, (class19) null);
                            if (var12.field6912 && class238.field3551) {
                                if (arg9 == 0) {
                                    var19.method41(arg8, arg7 - -1, 50);
                                } else if (arg9 == 1) {
                                    var19.method41(arg8 + 1, arg7 + 1, 50);
                                } else if (~arg9 == -3) {
                                    var19.method41(arg8 - -1, arg7, 50);
                                } else if (arg9 == 3) {
                                    var19.method41(arg8, arg7, 50);
                                }
                            }
                            if (var12.field6895 != 0 && arg10 != null) {
                                arg10.method3644(arg7, var12.field6910, !var12.field6935, arg9, arg8, arg1, true);
                            }
                        } else if (~arg1 == -10) {
                            class638 var42;
                            if (!var24) {
                                var42 = new class223(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg8, arg8 + var13 + -1, arg7, arg7 + var14 + -1, arg1, arg9, arg5);
                            } else {
                                class610 var43 = new class610(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg8, arg8, arg7, arg7, arg1, arg9, var23);
                                var42 = var43;
                                if (var43.method611(15795)) {
                                    var43.method608(arg4, 10);
                                }
                            }
                            class262.method1734(var42, false);
                            if (~var12.field6927 == -2 && !super.field7266) {
                                byte var44;
                                if ((1 & arg9) == 0) {
                                    var44 = 8;
                                } else {
                                    var44 = 16;
                                }
                                class724.method4048(0, arg8, var44, arg7, arg3, var12.field6897, -76);
                            }
                            if (~var12.field6895 != -1 && arg10 != null) {
                                arg10.method3648(var12.field6910, var14, var13, arg7, !var12.field6935, (byte) 115, arg8);
                            }
                            if (var12.field6974 != 64) {
                                class750.method4179(arg3, arg8, arg7, var12.field6974);
                            }
                        } else if (~arg1 == -5) {
                            class129 var46;
                            if (var24) {
                                class82 var45 = new class82(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, 0, 0, arg1, arg9);
                                if (var45.method611(15795)) {
                                    var45.method608(arg4, 110);
                                }
                                var46 = var45;
                            } else {
                                var46 = new class68(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, 0, 0, arg1, arg9, arg5);
                            }
                            class375.method2327(arg3, arg8, arg7, var46, (class129) null);
                        } else if (arg1 == 5) {
                            int var47 = 65;
                            class324 var48 = (class324) class256.method1707(arg3, arg8, arg7);
                            if (var48 != null) {
                                var47 = 1 + class375.field5421.method2680(var48.method601((byte) 120), (byte) 120).field6974;
                            }
                            class129 var50;
                            if (var24) {
                                class82 var49 = new class82(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, class693.field9820[arg9] * var47, class283.field3957[arg9] * var47, arg1, arg9);
                                if (var49.method611(15795)) {
                                    var49.method608(arg4, 21);
                                }
                                var50 = var49;
                            } else {
                                var50 = new class68(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, class693.field9820[arg9] * var47, class283.field3957[arg9] * var47, arg1, arg9, arg5);
                            }
                            class375.method2327(arg3, arg8, arg7, var50, (class129) null);
                        } else if (~arg1 == -7) {
                            int var51 = 33;
                            class324 var52 = (class324) class256.method1707(arg3, arg8, arg7);
                            if (var52 != null) {
                                var51 = 1 + class375.field5421.method2680(var52.method601((byte) 107), (byte) 121).field6974 / 2;
                            }
                            class129 var54;
                            if (var24) {
                                class82 var53 = new class82(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, class693.field9820[arg9] * var51, class283.field3957[arg9] * var51, arg1, arg9 - -4);
                                if (var53.method611(15795)) {
                                    var53.method608(arg4, 119);
                                }
                                var54 = var53;
                            } else {
                                var54 = new class68(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, class538.field7818[arg9] * var51, class449.field6435[arg9] * var51, arg1, arg9 + 4, arg5);
                            }
                            class375.method2327(arg3, arg8, arg7, var54, (class129) null);
                        } else if (arg1 == 7) {
                            int var55 = arg9 + 2 & 3;
                            class129 var57;
                            if (var24) {
                                class82 var56 = new class82(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, 0, 0, arg1, var55 + 4);
                                var57 = var56;
                                if (var56.method611(15795)) {
                                    var56.method608(arg4, 101);
                                }
                            } else {
                                var57 = new class68(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, 0, 0, arg1, var55 + 4, arg5);
                            }
                            class375.method2327(arg3, arg8, arg7, var57, (class129) null);
                        } else if (arg1 == 8) {
                            int var58 = 3 & arg9 + 2;
                            int var59 = 33;
                            class324 var60 = (class324) class256.method1707(arg3, arg8, arg7);
                            if (var60 != null) {
                                var59 = class375.field5421.method2680(var60.method601((byte) 119), (byte) 96).field6974 / 2 - -1;
                            }
                            class129 var63;
                            class129 var64;
                            if (!var24) {
                                class68 var61 = new class68(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, class538.field7818[arg9] * var59, class449.field6435[arg9] * var59, arg1, arg9 - -4, arg5);
                                class68 var62 = new class68(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, 0, 0, arg1, var58 + 4, arg5);
                                var63 = var61;
                                var64 = var62;
                            } else {
                                class82 var65 = new class82(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, class538.field7818[arg9] * var59, class449.field6435[arg9] * var59, arg1, arg9 + 4);
                                class82 var66 = new class82(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, 0, 0, arg1, var58 + 4);
                                if (var65.method611(15795)) {
                                    var65.method608(arg4, 104);
                                }
                                var63 = var65;
                                if (var66.method611(15795)) {
                                    var66.method608(arg4, -114);
                                }
                                var64 = var66;
                            }
                            class375.method2327(arg3, arg8, arg7, var63, var64);
                        }
                    } else {
                        class610 var67 = null;
                        int var69;
                        class638 var70;
                        if (var24) {
                            class610 var68 = new class610(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg8, arg8 + var13 + -1, arg7, var14 + -1 + arg7, arg1, arg9, var23);
                            var69 = var68.method3548((byte) -34);
                            var67 = var68;
                            var70 = var68;
                        } else {
                            var70 = new class223(arg4, var12, arg3, arg0, var21, var20, var22, super.field7266, arg8, arg8 + var13 + -1, arg7, arg7 - 1 + var14, arg1, arg9, arg5);
                            var69 = 15;
                        }
                        if (class262.method1734(var70, false)) {
                            if (var67 != null && var67.method611(15795)) {
                                var67.method608(arg4, 114);
                            }
                            if (var12.field6912 && class238.field3551) {
                                if (var69 > 30) {
                                    var69 = 30;
                                }
                                for (int var71 = 0; var71 <= var13; ++var71) {
                                    for (int var72 = 0; var14 >= var72; ++var72) {
                                        var19.method41(arg8 + var71, arg7 + var72, var69);
                                    }
                                }
                            }
                        }
                        if (var12.field6895 != 0 && arg10 != null) {
                            arg10.method3648(var12.field6910, var14, var13, arg7, !var12.field6935, (byte) 117, arg8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLha;[Lfe;IIIIIII[B)V")
    public final void method2540(boolean arg0, class543 arg1, class635[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        ++field5986;
        if (!arg0) {
            this.method2546(-48, -49, 34, 63, -106, 82, 40, (class543) null, (int[]) null, (class479) null, 5);
        }
        class479 var12 = new class479(arg10);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2899((byte) 41);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2889(-18098);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4045 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2886(true);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg6 == ~var19 && var18 >= arg5 && ~var18 > ~(arg5 + 8) && arg4 <= var17 && var17 < arg4 + 8) {
                    class482 var23 = class375.field5421.method2680(var13, (byte) 107);
                    int var24 = arg8 - -class218.method1538(7 & var18, 7 & var17, var23.field6936, var22, arg7, var23.field6879, 102);
                    int var25 = arg3 - -class744.method4152(arg7, var23.field6879, var17 & 7, (byte) 93, 7 & var18, var23.field6936, var22);
                    if (var24 > 0 && var25 > 0 && super.field7262 - 1 > var24 && ~(super.field7253 + -1) < ~var25) {
                        class635 var26 = null;
                        if (!super.field7266) {
                            int var27 = arg9;
                            if (~(2 & class160.field2297[1][var24][var25]) == -3) {
                                var27 = arg9 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg2[var27];
                            }
                        }
                        this.method2539(arg9, var21, var13, arg9, arg1, -1, 73, var25, var24, 3 & arg7 + var22, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method2541(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class423.field6033 = 0;
        class610.field8707 = 0;
        ++class119.field1636;
        if ((arg5 & 2) == 0) {
            for (int var8 = 0; var8 < class355.field5248[var7]; ++var8) {
                if (!class297.method1854(class132.field1818[var7][var8], arg0, arg1, arg2, arg3)) {
                    class492.method2996(class132.field1818[var7][var8]);
                    if (class132.field1818[var7][var8].field3926 != -1) {
                        class386.field5582[class423.field6033++] = class132.field1818[var7][var8];
                    }
                }
            }
        }
        if ((arg5 & 1) == 0) {
            for (int var9 = 0; var9 < class575.field8273[var7]; ++var9) {
                if (!class297.method1854(class499.field7174[var7][var9], arg0, arg1, arg2, arg3)) {
                    class492.method2996(class499.field7174[var7][var9]);
                    if (class499.field7174[var7][var9].field3926 != -1) {
                        class393.field5647[class610.field8707++] = class499.field7174[var7][var9];
                    }
                }
            }
            for (int var10 = 0; var10 < class145.field1963[var7]; ++var10) {
                if (!class297.method1854(class399.field5714[var7][var10], arg0, arg1, arg2, arg3)) {
                    if (class399.field5714[var7][var10].method614((byte) 72)) {
                        class492.method2996(class399.field5714[var7][var10]);
                        if (class399.field5714[var7][var10].field3926 != -1) {
                            class393.field5647[class610.field8707++] = class399.field5714[var7][var10];
                        }
                    } else {
                        class492.method2996(class399.field5714[var7][var10]);
                        if (class399.field5714[var7][var10].field3926 != -1) {
                            class386.field5582[class423.field6033++] = class399.field5714[var7][var10];
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class594.field8445; ++var11) {
                    if (!class297.method1854(class356.field5256[var11], arg0, arg1, arg2, arg3)) {
                        class492.method2996(class356.field5256[var11]);
                        if (class356.field5256[var11].field3926 != -1) {
                            if (class356.field5256[var11].method614((byte) 42)) {
                                class393.field5647[class610.field8707++] = class356.field5256[var11];
                            } else {
                                class386.field5582[class423.field6033++] = class356.field5256[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class423.field6033 > 0) {
            class756.method4200(class386.field5582, 0, class423.field6033 - 1);
            for (int var12 = 0; var12 < class423.field6033; ++var12) {
                class669.method3817(class386.field5582[var12], true, arg6);
            }
        }
        if (class431.field6192) {
            class391.field5644.method277(0, (class40[]) null);
        }
        if ((arg5 & 2) == 0) {
            for (int var13 = class518.field7465; var13 < class433.field6202; ++var13) {
                if (var13 >= arg2 && arg1 != null) {
                    int var14 = class437.field6237.length;
                    if (class437.field6237.length + class740.field10333 > class439.field6264) {
                        var14 -= class437.field6237.length + class740.field10333 - class439.field6264;
                    }
                    int var15 = class437.field6237[0].length;
                    if (class437.field6237[0].length + class753.field10506 > class408.field5806) {
                        var15 -= class437.field6237[0].length + class753.field10506 - class408.field5806;
                    }
                    boolean[][] var16 = class402.field5754;
                    if (class265.field3796) {
                        if (class564.field8170) {
                            var16 = class35.field315[var13];
                        }
                        for (int var17 = class579.field8293; var17 < var14; ++var17) {
                            int var18 = class740.field10333 + var17 - class579.field8293;
                            for (int var19 = class227.field3390; var19 < var15; ++var19) {
                                var16[var17][var19] = false;
                                if (class437.field6237[var17][var19]) {
                                    int var20 = class753.field10506 + var19 - class227.field3390;
                                    for (int var21 = var13; var21 >= 0; --var21) {
                                        if (class565.field8185[var21][var18][var20] != null && class565.field8185[var21][var18][var20].field5430 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class141.method998(var18, -62, var20, var13)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class564.field8170) {
                        if (arg4 >= 0) {
                            class95.field1372[var13].method34(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class95.field1372[var13].method46(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class482.field6920; ++var22) {
                            class618.field8804[var22].method1783(44, new class372(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class95.field1372[var13].method34(class613.field8757, class140.field1915, class430.field6190, class402.field5754, false, arg4, arg5);
                    } else {
                        class95.field1372[var13].method46(class613.field8757, class140.field1915, class430.field6190, class402.field5754, false, arg5);
                    }
                } else {
                    int var23 = class437.field6237.length;
                    if (class437.field6237.length + class740.field10333 > class439.field6264) {
                        var23 -= class437.field6237.length + class740.field10333 - class439.field6264;
                    }
                    int var24 = class437.field6237[0].length;
                    if (class437.field6237[0].length + class753.field10506 > class408.field5806) {
                        var24 -= class437.field6237[0].length + class753.field10506 - class408.field5806;
                    }
                    boolean[][] var25 = class402.field5754;
                    if (class265.field3796) {
                        if (class564.field8170) {
                            var25 = class35.field315[var13];
                        }
                        for (int var26 = class579.field8293; var26 < var23; ++var26) {
                            int var27 = class740.field10333 + var26 - class579.field8293;
                            for (int var28 = class227.field3390; var28 < var24; ++var28) {
                                if (class437.field6237[var26][var28] && !class141.method998(var27, -49, class753.field10506 + var28 - class227.field3390, var13)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class564.field8170) {
                        if (arg4 >= 0) {
                            class95.field1372[var13].method34(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class95.field1372[var13].method46(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class482.field6920; ++var29) {
                            class618.field8804[var29].method1783(-91, new class372(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class95.field1372[var13].method34(class613.field8757, class140.field1915, class430.field6190, class402.field5754, true, arg4, arg5);
                    } else {
                        class95.field1372[var13].method46(class613.field8757, class140.field1915, class430.field6190, class402.field5754, true, arg5);
                    }
                }
            }
        }
        if (class610.field8707 > 0) {
            class393.method2396(class393.field5647, 0, class610.field8707 - 1);
            for (int var30 = 0; var30 < class610.field8707; ++var30) {
                class669.method3817(class393.field5647[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lha;BZ)V")
    public final void method2542(class543 arg0, byte arg1, boolean arg2) {
        class502.method3069();
        ++field5977;
        if (!arg2) {
            if (super.field7271 > 1) {
                for (int var4 = 0; ~var4 > ~super.field7262; ++var4) {
                    for (int var5 = 0; ~var5 > ~super.field7253; ++var5) {
                        if (~(2 & class160.field2297[1][var4][var5]) == -3) {
                            class370.method2320(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; super.field7271 > var6; ++var6) {
                for (int var7 = 0; ~super.field7253 <= ~var7; ++var7) {
                    for (int var8 = 0; ~var8 >= ~super.field7262; ++var8) {
                        if ((super.field7258[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && (super.field7258[var6][var8][var11 + -1] & 4) != 0 && var12 - var11 < 10) {
                                --var11;
                            }
                            while (~var12 > ~super.field7253 && ~(super.field7258[var6][var8][var12 + 1] & 4) != -1 && -var11 + var12 < 10) {
                                ++var12;
                            }
                            label118: while (~var9 < -1 && ~(-var9 + var10) > -11) {
                                for (int var13 = var11; var12 >= var13; ++var13) {
                                    if (~(super.field7258[var6][var9 - 1][var13] & 4) == -1) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (var10 < super.field7262 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; var14 <= var12; ++var14) {
                                    if ((4 & super.field7258[var6][var10 + 1][var14]) == 0) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if (~((-var9 - -1 + var10) * (-var11 + 1 + var12)) <= -5) {
                                int var15 = super.field7265[var6][var9][var11];
                                class684.method3884(var11 << 9, var15, var6, var15, (byte) 126, var9 << 9, (var10 << 9) + 512, 4, (var12 << 9) + 512);
                                for (int var16 = var9; var10 >= var16; ++var16) {
                                    for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                                        super.field7258[var6][var16][var17] = (byte) class368.method2314(super.field7258[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class314.method1936((byte) -20);
        }
        if (arg1 < 57) {
            this.method2548((int[]) null, -124, -17, 62, (class543) null, (class479) null);
        }
        super.field7258 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([[BILdu;)V")
    public static final void method2543(byte[][] arg0, int arg1, class418 arg2) {
        ++field5985;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field7271; ++var4) {
            class569.method3387(0);
            for (int var9 = 0; class184.field2546 >> 3 > var9; ++var9) {
                for (int var10 = 0; ~var10 > ~(class240.field3555 >> 3); ++var10) {
                    int var11 = class742.field10347[var4][var9][var10];
                    if (~var11 != 0) {
                        int var12 = (var11 & 51619225) >> 24;
                        if (!arg2.field7266 || ~var12 == -1) {
                            int var13 = var11 >> 1 & 3;
                            int var14 = (16763674 & var11) >> 14;
                            int var15 = (16383 & var11) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class284.field3961.length; ++var17) {
                                if (~class284.field3961[var17] == ~var16 && arg0[var17] != null) {
                                    class479 var18 = new class479(arg0[var17]);
                                    arg2.method3049(var10 * 8, var14, var13, arg1 ^ 256, var9 * 8, var15, var4, var18, var12, class6.field57);
                                    arg2.method2546(var4, var10 * 8, var12, var9 * 8, var13, 8172, var15, class211.field3164, var3[0] == -1 ? var3 : null, var18, var14);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; ~arg2.field7271 < ~var5; ++var5) {
            class569.method3387(0);
            for (int var6 = 0; var6 < class184.field2546 >> 3; ++var6) {
                for (int var7 = 0; ~var7 > ~(class240.field3555 >> 3); ++var7) {
                    int var8 = class742.field10347[var5][var6][var7];
                    if (var8 == -1) {
                        arg2.method3055(var7 * 8, 13019, var5, 8, var6 * 8, 8);
                    }
                }
            }
        }
        if (~var3[0] != arg1) {
            class728.field10226 = class455.field6490.method3314(var3[2], arg1 ^ 45, var3[3], var3[0], var3[1], class154.field2237);
            class740.field10335 = var3[4];
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIZ)V")
    public class418(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class166.field2358, class159.field2290);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(IIIII)Las;")
    private final class324 method2544(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5980;
        class324 var6 = null;
        if (~arg3 == -1) {
            var6 = (class324) class256.method1707(arg4, arg0, arg2);
        }
        if (~arg3 == -2) {
            var6 = (class324) class198.method1415(arg4, arg0, arg2);
        }
        if (~arg3 == arg1) {
            var6 = (class324) class360.method2277(arg4, arg0, arg2, field5987 != null ? field5987 : (field5987 = method2549("as")));
        }
        if (arg3 == 3) {
            var6 = (class324) class388.method2384(arg4, arg0, arg2);
        }
        return var6;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lha;[Lfe;IB[BI)V")
    public final void method2545(class543 arg0, class635[] arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        ++field5984;
        class479 var7 = new class479(arg4);
        if (arg3 != 90) {
            this.method2547(-7, -34, -54, -36, (class543) null, (class635) null, -101);
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method2899((byte) 41);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2889(arg3 + -18188);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method2886(true);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = var13 - -arg5;
                int var19 = arg2 + var12;
                if (var18 > 0 && ~var19 < -1 && super.field7262 + -1 > var18 && super.field7253 + -1 > var19) {
                    class635 var20 = null;
                    if (!super.field7266) {
                        int var21 = var14;
                        if (~(class160.field2297[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg1[var21];
                        }
                    }
                    this.method2539(var14, var16, var8, var14, arg0, -1, -100, var19, var18, var17, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIILha;[ILsl;I)V")
    private final void method2546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class543 arg7, int[] arg8, class479 arg9, int arg10) {
        ++field5979;
        if (!super.field7266) {
            boolean var12 = false;
            if (arg8 != null) {
                arg8[0] = -1;
            }
            class123 var13 = null;
            if (arg5 != 8172) {
                method2541(true, (byte[][][]) null, 124, (byte) 97, 79, -75, false);
            }
            int var14 = (7 & arg10) * 8;
            int var15 = (7 & arg6) * 8;
            while (true) {
                int var21;
                label241: do {
                    while (true) {
                        while (arg9.field6864 < arg9.field6800.length) {
                            int var20 = arg9.method2886(true);
                            if (var20 != 0) {
                                if (~var20 == -2) {
                                    var21 = arg9.method2886(true);
                                    continue label241;
                                }
                                if (~var20 == -3) {
                                    if (var13 == null) {
                                        var13 = new class123();
                                    }
                                    var13.method869(-88, arg9);
                                } else if (~var20 == -129) {
                                    if (arg8 == null) {
                                        arg9.field6864 += 10;
                                    } else {
                                        arg8[0] = arg9.method2882(-1);
                                        arg8[1] = arg9.method2870(-11395);
                                        arg8[2] = arg9.method2870(-11395);
                                        arg8[3] = arg9.method2870(-11395);
                                        arg8[4] = arg9.method2882(-1);
                                    }
                                } else {
                                    if (~var20 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field7256 == null) {
                                        super.field7256 = new byte[4][][];
                                    }
                                    for (int var32 = 0; var32 < 4; ++var32) {
                                        byte var33 = arg9.method2915(arg5 + -8290);
                                        if (~var33 == -1 && super.field7256[arg0] != null) {
                                            if (~arg2 <= ~var32) {
                                                int var34 = arg3;
                                                int var35 = arg3 + 7;
                                                int var36 = arg1;
                                                if (~arg1 > -1) {
                                                    var36 = 0;
                                                } else if (~arg1 <= ~super.field7253) {
                                                    var36 = super.field7253;
                                                }
                                                if (~var35 <= -1) {
                                                    if (~super.field7262 >= ~var35) {
                                                        var35 = super.field7262;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                if (~arg3 > -1) {
                                                    var34 = 0;
                                                } else if (arg3 >= super.field7262) {
                                                    var34 = super.field7262;
                                                }
                                                int var37 = arg1 + 7;
                                                if (~var37 > -1) {
                                                    var37 = 0;
                                                } else if (super.field7253 <= var37) {
                                                    var37 = super.field7253;
                                                }
                                                while (~var34 > ~var35) {
                                                    while (var36 < var37) {
                                                        super.field7256[arg0][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field7256[arg0] == null) {
                                                super.field7256[arg0] = new byte[super.field7262 - -1][super.field7253 - -1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg9.method2915(-116);
                                                    if (~var32 >= ~arg2) {
                                                        for (int var41 = var38; var41 < var38 - -4; ++var41) {
                                                            for (int var42 = var39; var39 + 4 > var42; ++var42) {
                                                                if (var41 >= var14 && ~var41 > ~(var14 - -8) && ~var42 <= ~var15 && ~var15 > ~(var15 - -8)) {
                                                                    int var43 = arg3 - -class368.method2312((byte) 123, var41 & 7, var42 & 7, arg4);
                                                                    int var44 = arg1 + class65.method584(7 & var42, var41 & 7, arg4, arg5 + 10999);
                                                                    if (~var43 <= -1 && super.field7262 > var43 && ~var44 <= -1 && ~super.field7253 < ~var44) {
                                                                        super.field7256[arg0][var43][var44] = var40;
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
                            } else {
                                var13 = new class123(arg9);
                            }
                        }
                        if (var13 != null) {
                            class627.method3615(var13, -23395, arg3 >> 3, arg1 >> 3);
                        }
                        if (!var12 && super.field7256 != null && super.field7256[arg0] != null) {
                            int var16 = arg3 - -7;
                            int var17 = arg1 + 7;
                            for (int var18 = arg3; ~var18 > ~var16; ++var18) {
                                for (int var19 = arg1; var19 < var17; ++var19) {
                                    super.field7256[arg0][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; ~var21 < ~var22; ++var22) {
                    class187 var23 = new class187(arg7, arg9, 2);
                    if (~var23.field2619 == -32) {
                        class195 var24 = class139.field1897.method16(arg9.method2882(-1), -108);
                        var23.method1321((byte) 107, var24.field2856, var24.field2857, var24.field2852, var24.field2854);
                    }
                    if (~arg7.method270() < -1) {
                        class40 var25 = var23.field2630;
                        int var26 = var25.method422((byte) -111) >> 9;
                        int var27 = var25.method427(-1) >> 9;
                        if (~var23.field2627 == ~arg2 && var26 >= var14 && var14 + 8 > var26 && ~var27 <= ~var15 && var15 + 8 > var27) {
                            int var28 = class490.method2984((byte) -97, var25.method427(-1) & 4095, var25.method422((byte) -124) & 4095, arg4) + (arg3 << 9);
                            int var29 = class744.method4155(arg5 + -8162, var25.method422((byte) -90) & 4095, arg4, var25.method427(-1) & 4095) + (arg1 << 9);
                            int var30 = var28 >> 9;
                            int var31 = var29 >> 9;
                            if (~var30 <= -1 && var31 >= 0 && var30 < super.field7262 && ~super.field7253 < ~var31) {
                                var25.method428((byte) -12, var28, super.field7265[arg2][var30][var31] + -var25.method421(117), var29);
                                class265.method1751(var23);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIILha;Lfe;I)V")
    public final void method2547(int arg0, int arg1, int arg2, int arg3, class543 arg4, class635 arg5, int arg6) {
        if (arg0 > 77) {
            ++field5983;
            class324 var8 = this.method2544(arg1, -3, arg6, arg3, arg2);
            if (var8 != null) {
                class482 var9 = class375.field5421.method2680(var8.method601((byte) 122), (byte) 112);
                int var10 = var8.method604((byte) 94);
                int var11 = var8.method606(-103);
                if (var9.method2950(0)) {
                    class692.method3908(arg2, arg1, var9, (byte) -105, arg6);
                }
                if (var8.method611(15795)) {
                    var8.method597(arg4, false);
                }
                if (~arg3 == -1) {
                    class638.method3677(arg2, arg1, arg6);
                    if (~var9.field6895 != -1) {
                        arg5.method3635(arg6, var10, (byte) 86, var9.field6910, !var9.field6935, arg1, var11);
                    }
                    if (var9.field6927 == 1) {
                        if (var11 != 0) {
                            if (~var11 == -2) {
                                class319.method1986(arg1, arg6 - -1, 2, 0, arg2);
                                return;
                            }
                            if (~var11 != -3) {
                                if (var11 == 3) {
                                    class319.method1986(arg1, arg6, 2, 0, arg2);
                                    return;
                                }
                            } else {
                                class319.method1986(arg1 + 1, arg6, 1, 0, arg2);
                            }
                            return;
                        }
                        class319.method1986(arg1, arg6, 1, 0, arg2);
                        return;
                    }
                    return;
                }
                if (arg3 == 1) {
                    class517.method3143(arg2, arg1, arg6);
                    return;
                }
                if (arg3 != 2) {
                    if (~arg3 == -4) {
                        class265.method1750(arg2, arg1, arg6);
                        if (~var9.field6895 == -2) {
                            arg5.method3639(arg6, arg1, 54);
                            return;
                        }
                    }
                    return;
                }
                class217.method1535(arg2, arg1, arg6, field5987 != null ? field5987 : (field5987 = method2549("as")));
                if (~var9.field6895 != -1 && super.field7262 > var9.field6936 + arg1 && ~(var9.field6936 + arg6) > ~super.field7253 && arg1 - -var9.field6879 < super.field7262 && arg6 - -var9.field6879 < super.field7253) {
                    arg5.method3638(var9.field6879, var9.field6910, 3, arg1, arg6, var11, !var9.field6935, var9.field6936);
                }
                if (var10 == 9) {
                    if ((var11 & 1) == 0) {
                        class319.method1986(arg1, arg6, 8, 0, arg2);
                        return;
                    }
                    class319.method1986(arg1, arg6, 16, 0, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([IIIILha;Lsl;)V")
    public final void method2548(int[] arg0, int arg1, int arg2, int arg3, class543 arg4, class479 arg5) {
        ++field5982;
        if (!super.field7266) {
            boolean var7 = false;
            class123 var8 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            while (true) {
                int var19;
                label315: do {
                    while (true) {
                        while (~arg5.field6800.length < ~arg5.field6864) {
                            int var18 = arg5.method2886(true);
                            if (var18 != 0) {
                                if (var18 == 1) {
                                    var19 = arg5.method2886(true);
                                    continue label315;
                                }
                                if (var18 == 2) {
                                    if (var8 == null) {
                                        var8 = new class123();
                                    }
                                    var8.method869(arg2 ^ -107, arg5);
                                } else if (var18 == 128) {
                                    if (arg0 != null) {
                                        arg0[0] = arg5.method2882(arg2 + -1);
                                        arg0[1] = arg5.method2870(arg2 + -11395);
                                        arg0[2] = arg5.method2870(-11395);
                                        arg0[3] = arg5.method2870(-11395);
                                        arg0[4] = arg5.method2882(-1);
                                    } else {
                                        arg5.field6864 += 10;
                                    }
                                } else {
                                    if (var18 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field7256 == null) {
                                        super.field7256 = new byte[4][][];
                                    }
                                    var7 = true;
                                    for (int var28 = 0; var28 < 4; ++var28) {
                                        byte var29 = arg5.method2915(arg2 + -116);
                                        if (var29 == 0 && super.field7256[var28] != null) {
                                            int var30 = arg1;
                                            int var31 = arg1 + 64;
                                            int var32 = arg3;
                                            int var33 = arg3 + 64;
                                            if (arg3 < 0) {
                                                var32 = 0;
                                            } else if (arg3 >= super.field7253) {
                                                var32 = super.field7253;
                                            }
                                            if (var31 >= 0) {
                                                if (super.field7262 <= var31) {
                                                    var31 = super.field7262;
                                                }
                                            } else {
                                                var31 = 0;
                                            }
                                            if (arg1 < 0) {
                                                var30 = 0;
                                            } else if (arg1 >= super.field7262) {
                                                var30 = super.field7262;
                                            }
                                            if (~var33 <= -1) {
                                                if (super.field7253 <= var33) {
                                                    var33 = super.field7253;
                                                }
                                            } else {
                                                var33 = 0;
                                            }
                                            while (~var30 > ~var31) {
                                                while (~var32 > ~var33) {
                                                    super.field7256[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 == 1) {
                                            if (super.field7256[var28] == null) {
                                                super.field7256[var28] = new byte[super.field7262 - -1][super.field7253 + 1];
                                            }
                                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                                for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                                    byte var36 = arg5.method2915(-109);
                                                    for (int var37 = var34 - -arg1; var34 - (-arg1 + -4) > var37; ++var37) {
                                                        for (int var38 = arg3 + var35; ~(arg3 + var35 + 4) < ~var38; ++var38) {
                                                            if (~var37 <= -1 && ~super.field7262 < ~var37 && var38 >= 0 && super.field7253 > var38) {
                                                                super.field7256[var28][var37][var38] = var36;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (~var29 == -3) {
                                            if (super.field7256[var28] == null) {
                                                super.field7256[var28] = new byte[super.field7262 + 1][super.field7253 + 1];
                                            }
                                            if (~var28 < -1) {
                                                int var39 = arg1;
                                                int var40 = arg1 - -64;
                                                int var41 = arg3;
                                                int var42 = arg3 + 64;
                                                if (~arg1 <= -1) {
                                                    if (arg1 >= super.field7262) {
                                                        var39 = super.field7262;
                                                    }
                                                } else {
                                                    var39 = 0;
                                                }
                                                if (arg3 >= 0) {
                                                    if (~super.field7253 >= ~arg3) {
                                                        var41 = super.field7253;
                                                    }
                                                } else {
                                                    var41 = 0;
                                                }
                                                if (var40 >= 0) {
                                                    if (super.field7262 <= var40) {
                                                        var40 = super.field7262;
                                                    }
                                                } else {
                                                    var40 = 0;
                                                }
                                                if (~var42 <= -1) {
                                                    if (~super.field7253 >= ~var42) {
                                                        var42 = super.field7253;
                                                    }
                                                } else {
                                                    var42 = 0;
                                                }
                                                while (~var39 > ~var40) {
                                                    while (~var42 < ~var41) {
                                                        super.field7256[var28][var39][var41] = super.field7256[var28 + -1][var39][var41];
                                                        ++var41;
                                                    }
                                                    ++var39;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class123(arg5);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg1 >> 3) + var9;
                                    int var12 = (arg3 >> 3) + var10;
                                    if (~var11 <= -1 && super.field7262 >> 3 > var11 && ~var12 <= -1 && var12 < super.field7253 >> 3) {
                                        class627.method3615(var8, -23395, var11, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field7256 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field7256[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg1 >> 2) + var14;
                                            int var17 = (arg3 >> 2) + var15;
                                            if (var16 >= 0 && var16 < 26 && ~var17 <= -1 && ~var17 > -27) {
                                                super.field7256[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (arg2 != 0) {
                            field5975 = -0.52170426F;
                            return;
                        }
                        return;
                    }
                } while (~var19 >= -1);
                for (int var20 = 0; var19 > var20; ++var20) {
                    class187 var21 = new class187(arg4, arg5, 2);
                    if (var21.field2619 == 31) {
                        class195 var22 = class139.field1897.method16(arg5.method2882(arg2 + -1), -115);
                        var21.method1321((byte) 80, var22.field2856, var22.field2857, var22.field2852, var22.field2854);
                    }
                    if (~arg4.method270() < -1) {
                        class40 var23 = var21.field2630;
                        int var24 = (arg1 << 9) + var23.method422((byte) -108);
                        int var25 = (arg3 << 9) + var23.method427(arg2 + -1);
                        int var26 = var24 >> 9;
                        int var27 = var25 >> 9;
                        if (var26 >= 0 && ~var27 <= -1 && var26 < super.field7262 && ~var27 > ~super.field7253) {
                            var23.method428((byte) -29, var24, super.field7265[var21.field2627][var26][var27] - var23.method421(123), var25);
                            class265.method1751(var21);
                        }
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2549(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
