import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class381 extends class545 {

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    public int field5265 = 99;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "I")
    public static int field5272;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rr", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field5273;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)V")
    public static final void method2365(int arg0, byte arg1) {
        if (arg1 >= 33) {
            ++field5266;
            if (arg0 < 0 || ~arg0 < -3) {
                arg0 = 0;
            }
            class715.field9934 = arg0;
            class195.field3000 = new class593[class267.field3892[class715.field9934] - -1];
            class403.field5514 = 0;
            class445.field6050 = 0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIZ)V")
    public class381(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class5.field40, class207.field3200);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILmb;ILha;IIIIII)V")
    public final void method2366(int arg0, int arg1, class274 arg2, int arg3, class65 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field5264;
        if (class21.field353.field10086.method1642(-68) != 0 || class580.method3400(arg9, arg8, arg5, class481.field6761, 112)) {
            if (this.field5265 > arg6) {
                this.field5265 = arg6;
            }
            class282 var12 = class277.field4038.method3919(true, arg3);
            if (~class21.field353.field10057.method1024(-68) != -1 || !var12.field4177) {
                int var13;
                int var14;
                if (~arg0 != -2 && arg0 != 3) {
                    var13 = var12.field4188;
                    var14 = var12.field4125;
                } else {
                    var13 = var12.field4125;
                    var14 = var12.field4188;
                }
                int var15;
                int var16;
                if (arg9 + var13 <= super.field7834) {
                    var15 = (var13 >> 1) + arg9;
                    var16 = (var13 + 1 >> 1) + arg9;
                } else {
                    var16 = arg9 + 1;
                    var15 = arg9;
                }
                int var17;
                int var18;
                if (~super.field7832 <= ~(arg5 + var14)) {
                    var17 = (var14 >> 1) + arg5;
                    var18 = arg5 - -(var14 - -1 >> 1);
                } else {
                    var18 = arg5 + 1;
                    var17 = arg5;
                }
                class294 var19 = class208.field3219[arg8];
                int var20 = var19.method1904(var17, (byte) 105, var15) + (var19.method1904(var17, (byte) -126, var16) - (-var19.method1904(var18, (byte) 32, var15) + -var19.method1904(var18, (byte) -128, var16))) >> 2;
                int var21 = (arg9 << 9) + (var13 << 8);
                int var22 = (arg5 << 9) + (var14 << 8);
                boolean var23 = class647.field9055 && !super.field7823 && var12.field4159;
                if (var12.method1831(-118)) {
                    class303.method1961(var12, (class665) null, (class702) null, arg5, arg9, 123, arg0, arg6);
                }
                boolean var24 = ~arg7 == 0 && var12.field4139 == -1 && var12.field4135 == null && var12.field4117 == null && !var12.field4141 && !var12.field4106;
                if (!class759.field10481 || (!class236.method1582(arg1, 0) || ~var12.field4095 == -2) && (!class624.method3591(-119, arg1) || ~var12.field4095 != -1)) {
                    if (arg1 == 22) {
                        if (class21.field353.field10067.method3318(-72) != 0 || var12.field4149 != 0 || var12.field4103 == 1 || var12.field4127) {
                            class399 var25;
                            if (!var24) {
                                var25 = new class583(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg0, arg7);
                            } else {
                                class773 var26 = new class773(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg0, var23);
                                var25 = var26;
                                if (var26.method1488((byte) -104)) {
                                    var26.method1479((byte) 92, arg4);
                                }
                            }
                            class176.method1278(arg6, arg9, arg5, var25);
                            if (var12.field4103 == 1 && arg2 != null) {
                                arg2.method1778(arg5, arg9, (byte) -120);
                            }
                        }
                    } else if (~arg1 != -11 && ~arg1 != -12) {
                        if (~arg1 <= -13 && ~arg1 >= -18 || arg1 >= 18 && arg1 <= 21) {
                            class672 var27;
                            if (!var24) {
                                var27 = new class291(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg9, arg9 + var13 - 1, arg5, arg5 + -1 - -var14, arg1, arg0, arg7);
                            } else {
                                class442 var28 = new class442(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg9, arg9 - (-var13 - -1), arg5, arg5 + var14 + -1, arg1, arg0, var23);
                                var27 = var28;
                                if (var28.method1488((byte) 106)) {
                                    var28.method1479((byte) -100, arg4);
                                }
                            }
                            class490.method2926(var27, false);
                            if (class647.field9055 && !super.field7823 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && ~arg6 < -1 && var12.field4095 != 0) {
                                super.field7835[arg6][arg9][arg5] = (byte) class746.method4158(super.field7835[arg6][arg9][arg5], 4);
                            }
                            if (~var12.field4103 != -1 && arg2 != null) {
                                arg2.method1766(var13, arg5, arg9, !var12.field4120, (byte) -110, var14, var12.field4114);
                            }
                        } else if (arg1 == 0) {
                            int var29 = var12.field4095;
                            if (class721.field9973 && ~var12.field4095 == 0) {
                                var29 = 1;
                            }
                            class613 var31;
                            if (var24) {
                                class658 var30 = new class658(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, arg0, var23);
                                var31 = var30;
                                if (var30.method1488((byte) 63)) {
                                    var30.method1479((byte) -69, arg4);
                                }
                            } else {
                                var31 = new class216(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, arg0, arg7);
                            }
                            class537.method3225(arg6, arg9, arg5, var31, (class613) null);
                            if (arg0 != 0) {
                                if (arg0 != 1) {
                                    if (~arg0 == -3) {
                                        if (class647.field9055 && var12.field4112) {
                                            var19.method1906(arg9 + 1, arg5, 50);
                                            var19.method1906(arg9 + 1, arg5 + 1, 50);
                                        }
                                        if (~var29 == -2 && !super.field7823) {
                                            class184.method1302(-var12.field4174, arg9 - -1, arg5, 1, var12.field4184, arg10 + -105, arg6);
                                        }
                                    } else if (arg0 == 3) {
                                        if (class647.field9055 && var12.field4112) {
                                            var19.method1906(arg9, arg5, 50);
                                            var19.method1906(arg9 + 1, arg5, 50);
                                        }
                                        if (~var29 == -2 && !super.field7823) {
                                            class184.method1302(var12.field4174, arg9, arg5, 2, var12.field4184, -71, arg6);
                                        }
                                    }
                                } else {
                                    if (class647.field9055 && var12.field4112) {
                                        var19.method1906(arg9, arg5 + 1, 50);
                                        var19.method1906(arg9 + 1, arg5 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field7823) {
                                        class184.method1302(-var12.field4174, arg9, arg5 + 1, 2, var12.field4184, -106, arg6);
                                    }
                                }
                            } else {
                                if (class647.field9055 && var12.field4112) {
                                    var19.method1906(arg9, arg5, 50);
                                    var19.method1906(arg9, arg5 + 1, 50);
                                }
                                if (~var29 == -2 && !super.field7823) {
                                    class184.method1302(var12.field4174, arg9, arg5, 1, var12.field4184, arg10 + -125, arg6);
                                }
                            }
                            if (var12.field4103 != 0 && arg2 != null) {
                                arg2.method1762(var12.field4114, arg0, -21772, !var12.field4120, arg5, arg1, arg9);
                            }
                            if (~var12.field4122 != -65) {
                                class559.method3307(arg6, arg9, arg5, var12.field4122);
                            }
                        } else if (arg1 == 1) {
                            class613 var33;
                            if (var24) {
                                class658 var32 = new class658(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, arg0, var23);
                                if (var32.method1488((byte) 61)) {
                                    var32.method1479((byte) -110, arg4);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class216(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, arg0, arg7);
                            }
                            class537.method3225(arg6, arg9, arg5, var33, (class613) null);
                            if (var12.field4112 && class647.field9055) {
                                if (arg0 == 0) {
                                    var19.method1906(arg9, arg5 + 1, 50);
                                } else if (~arg0 == -2) {
                                    var19.method1906(arg9 - -1, arg5 + 1, 50);
                                } else if (arg0 == 2) {
                                    var19.method1906(arg9 + 1, arg5, 50);
                                } else if (~arg0 == -4) {
                                    var19.method1906(arg9, arg5, 50);
                                }
                            }
                            if (var12.field4103 != 0 && arg2 != null) {
                                arg2.method1762(var12.field4114, arg0, -21772, !var12.field4120, arg5, arg1, arg9);
                            }
                        } else if (arg1 == 2) {
                            int var34 = arg0 + 1 & 3;
                            class613 var37;
                            class613 var38;
                            if (var24) {
                                class658 var35 = new class658(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, arg0 + 4, var23);
                                class658 var36 = new class658(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, var34, var23);
                                if (var35.method1488((byte) -100)) {
                                    var35.method1479((byte) -124, arg4);
                                }
                                if (var36.method1488((byte) -109)) {
                                    var36.method1479((byte) -90, arg4);
                                }
                                var37 = var36;
                                var38 = var35;
                            } else {
                                var38 = new class216(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, arg0 + 4, arg7);
                                var37 = new class216(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, var34, arg7);
                            }
                            class537.method3225(arg6, arg9, arg5, var38, var37);
                            if ((var12.field4095 == 1 || class721.field9973 && ~var12.field4095 == 0) && !super.field7823) {
                                if (arg0 == 0) {
                                    class184.method1302(var12.field4174, arg9, arg5, 1, var12.field4184, -107, arg6);
                                    class184.method1302(var12.field4174, arg9, arg5 + 1, 2, var12.field4184, arg10 ^ -87, arg6);
                                } else if (~arg0 != -2) {
                                    if (~arg0 != -3) {
                                        if (~arg0 == -4) {
                                            class184.method1302(var12.field4174, arg9, arg5, 1, var12.field4184, arg10 ^ -126, arg6);
                                            class184.method1302(var12.field4174, arg9, arg5, 2, var12.field4184, -103, arg6);
                                        }
                                    } else {
                                        class184.method1302(var12.field4174, arg9 + 1, arg5, 1, var12.field4184, -102, arg6);
                                        class184.method1302(var12.field4174, arg9, arg5, 2, var12.field4184, -106, arg6);
                                    }
                                } else {
                                    class184.method1302(var12.field4174, arg9 + 1, arg5, 1, var12.field4184, -107, arg6);
                                    class184.method1302(var12.field4174, arg9, arg5 + 1, 2, var12.field4184, arg10 ^ -111, arg6);
                                }
                            }
                            if (var12.field4103 != 0 && arg2 != null) {
                                arg2.method1762(var12.field4114, arg0, -21772, !var12.field4120, arg5, arg1, arg9);
                            }
                            if (var12.field4122 != 64) {
                                class559.method3307(arg6, arg9, arg5, var12.field4122);
                            }
                        } else if (arg1 == arg10) {
                            class613 var40;
                            if (var24) {
                                class658 var39 = new class658(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, arg0, var23);
                                var40 = var39;
                                if (var39.method1488((byte) -69)) {
                                    var39.method1479((byte) -68, arg4);
                                }
                            } else {
                                var40 = new class216(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg1, arg0, arg7);
                            }
                            class537.method3225(arg6, arg9, arg5, var40, (class613) null);
                            if (var12.field4112 && class647.field9055) {
                                if (~arg0 != -1) {
                                    if (arg0 != 1) {
                                        if (arg0 == 2) {
                                            var19.method1906(arg9 + 1, arg5, 50);
                                        } else if (~arg0 == -4) {
                                            var19.method1906(arg9, arg5, 50);
                                        }
                                    } else {
                                        var19.method1906(arg9 - -1, arg5 + 1, 50);
                                    }
                                } else {
                                    var19.method1906(arg9, arg5 + 1, 50);
                                }
                            }
                            if (~var12.field4103 != -1 && arg2 != null) {
                                arg2.method1762(var12.field4114, arg0, -21772, !var12.field4120, arg5, arg1, arg9);
                            }
                        } else if (~arg1 == -10) {
                            class672 var41;
                            if (!var24) {
                                var41 = new class291(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg9, arg9 + var13 - 1, arg5, arg5 + -1 + var14, arg1, arg0, arg7);
                            } else {
                                class442 var42 = new class442(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg9, arg9, arg5, arg5, arg1, arg0, var23);
                                if (var42.method1488((byte) 59)) {
                                    var42.method1479((byte) 71, arg4);
                                }
                                var41 = var42;
                            }
                            class490.method2926(var41, false);
                            if (var12.field4095 == 1 && !super.field7823) {
                                byte var43;
                                if ((1 & arg0) != 0) {
                                    var43 = 16;
                                } else {
                                    var43 = 8;
                                }
                                class184.method1302(0, arg9, arg5, var43, var12.field4184, -72, arg6);
                            }
                            if (~var12.field4103 != -1 && arg2 != null) {
                                arg2.method1766(var13, arg5, arg9, !var12.field4120, (byte) -110, var14, var12.field4114);
                            }
                            if (~var12.field4122 != -65) {
                                class559.method3307(arg6, arg9, arg5, var12.field4122);
                            }
                        } else if (~arg1 == -5) {
                            class682 var45;
                            if (var24) {
                                class490 var44 = new class490(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, 0, 0, arg1, arg0);
                                var45 = var44;
                                if (var44.method1488((byte) -120)) {
                                    var44.method1479((byte) -100, arg4);
                                }
                            } else {
                                var45 = new class715(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, 0, 0, arg1, arg0, arg7);
                            }
                            class691.method3905(arg6, arg9, arg5, var45, (class682) null);
                        } else if (arg1 == 5) {
                            int var46 = 65;
                            class484 var47 = (class484) class335.method2132(arg6, arg9, arg5);
                            if (var47 != null) {
                                var46 = 1 + class277.field4038.method3919(true, var47.method1483(24853)).field4122;
                            }
                            class682 var49;
                            if (var24) {
                                class490 var48 = new class490(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, class651.field9093[arg0] * var46, class600.field8418[arg0] * var46, arg1, arg0);
                                if (var48.method1488((byte) -80)) {
                                    var48.method1479((byte) 98, arg4);
                                }
                                var49 = var48;
                            } else {
                                var49 = new class715(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, class651.field9093[arg0] * var46, class600.field8418[arg0] * var46, arg1, arg0, arg7);
                            }
                            class691.method3905(arg6, arg9, arg5, var49, (class682) null);
                        } else if (~arg1 == -7) {
                            int var50 = 33;
                            class484 var51 = (class484) class335.method2132(arg6, arg9, arg5);
                            if (var51 != null) {
                                var50 = 1 + class277.field4038.method3919(true, var51.method1483(24853)).field4122 / 2;
                            }
                            class682 var52;
                            if (!var24) {
                                var52 = new class715(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, class467.field6558[arg0] * var50, class149.field2145[arg0] * var50, arg1, arg0 + 4, arg7);
                            } else {
                                class490 var53 = new class490(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, class651.field9093[arg0] * var50, class600.field8418[arg0] * var50, arg1, arg0 + 4);
                                if (var53.method1488((byte) 112)) {
                                    var53.method1479((byte) -70, arg4);
                                }
                                var52 = var53;
                            }
                            class691.method3905(arg6, arg9, arg5, var52, (class682) null);
                        } else if (~arg1 == -8) {
                            int var54 = arg0 + 2 & 3;
                            class682 var56;
                            if (var24) {
                                class490 var55 = new class490(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, 0, 0, arg1, var54 + 4);
                                var56 = var55;
                                if (var55.method1488((byte) -120)) {
                                    var55.method1479((byte) -94, arg4);
                                }
                            } else {
                                var56 = new class715(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, 0, 0, arg1, var54 + 4, arg7);
                            }
                            class691.method3905(arg6, arg9, arg5, var56, (class682) null);
                        } else if (~arg1 == -9) {
                            int var57 = 3 & arg0 + 2;
                            int var58 = 33;
                            class484 var59 = (class484) class335.method2132(arg6, arg9, arg5);
                            if (var59 != null) {
                                var58 = class277.field4038.method3919(true, var59.method1483(24853)).field4122 / 2 + 1;
                            }
                            class682 var62;
                            class682 var63;
                            if (!var24) {
                                class715 var60 = new class715(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, class467.field6558[arg0] * var58, class149.field2145[arg0] * var58, arg1, arg0 - -4, arg7);
                                class715 var61 = new class715(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, 0, 0, arg1, var57 + 4, arg7);
                                var62 = var60;
                                var63 = var61;
                            } else {
                                class490 var64 = new class490(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, class467.field6558[arg0] * var58, class149.field2145[arg0] * var58, arg1, arg0 + 4);
                                class490 var65 = new class490(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, 0, 0, arg1, var57 + 4);
                                if (var64.method1488((byte) 112)) {
                                    var64.method1479((byte) -83, arg4);
                                }
                                if (var65.method1488((byte) 54)) {
                                    var65.method1479((byte) 105, arg4);
                                }
                                var63 = var65;
                                var62 = var64;
                            }
                            class691.method3905(arg6, arg9, arg5, var62, var63);
                        }
                    } else {
                        class442 var66 = null;
                        int var68;
                        class672 var69;
                        if (var24) {
                            class442 var67 = new class442(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg9, arg9 + -1 + var13, arg5, arg5 + var14 + -1, arg1, arg0, var23);
                            var68 = var67.method2637((byte) -79);
                            var66 = var67;
                            var69 = var67;
                        } else {
                            var69 = new class291(arg4, var12, arg6, arg8, var21, var20, var22, super.field7823, arg9, arg9 + -1 + var13, arg5, arg5 + -1 + var14, arg1, arg0, arg7);
                            var68 = 15;
                        }
                        if (class490.method2926(var69, false)) {
                            if (var66 != null && var66.method1488((byte) -118)) {
                                var66.method1479((byte) -73, arg4);
                            }
                            if (var12.field4112 && class647.field9055) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var70 >= ~var13; ++var70) {
                                    for (int var71 = 0; ~var71 >= ~var14; ++var71) {
                                        var19.method1906(arg9 + var70, arg5 + var71, var68);
                                    }
                                }
                            }
                        }
                        if (~var12.field4103 != -1 && arg2 != null) {
                            arg2.method1766(var13, arg5, arg9, !var12.field4120, (byte) -110, var14, var12.field4114);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([IILha;ILso;I)V")
    public final void method2367(int[] arg0, int arg1, class65 arg2, int arg3, class494 arg4, int arg5) {
        ++field5268;
        if (!super.field7823) {
            boolean var7 = false;
            if (arg3 > -114) {
                method2370(4, (byte) -32, -48, 75, 67, 88, -120, 113, 47, 83, 35, 22);
            }
            if (arg0 != null) {
                arg0[0] = -1;
            }
            class114 var8 = null;
            while (true) {
                while (arg4.field7042 < arg4.field7050.length) {
                    int var18 = arg4.method2964((byte) 49);
                    if (~var18 == -1) {
                        var8 = new class114(arg4);
                    } else if (var18 == 1) {
                        int var34 = arg4.method2964((byte) 124);
                        if (var34 > 0) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class456 var36 = new class456(arg2, arg4, 2);
                                if (~var36.field6397 == -32) {
                                    class720 var37 = class518.field7313.method33(124, arg4.method2998(true));
                                    var36.method2720(var37.field9966, var37.field9965, var37.field9963, -669928756, var37.field9969);
                                }
                                if (~arg2.method535() < -1) {
                                    class154 var38 = var36.field6391;
                                    int var39 = var38.method1059(-6131) - -(arg5 << 9);
                                    int var40 = var38.method1058(113) + (arg1 << 9);
                                    int var41 = var39 >> 9;
                                    int var42 = var40 >> 9;
                                    if (~var41 <= -1 && ~var42 <= -1 && ~var41 > ~super.field7834 && var42 < super.field7832) {
                                        var38.method1053(var39, var40, super.field7828[var36.field6387][var41][var42] - var38.method1055((byte) -71), (byte) 122);
                                        class525.method3172(var36);
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class114();
                        }
                        var8.method857(arg4, 8);
                    } else if (~var18 == -129) {
                        if (arg0 != null) {
                            arg0[0] = arg4.method2998(true);
                            arg0[1] = arg4.method2988(-3);
                            arg0[2] = arg4.method2988(-3);
                            arg0[3] = arg4.method2988(-3);
                            arg0[4] = arg4.method2998(true);
                        } else {
                            arg4.field7042 += 10;
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7840 == null) {
                            super.field7840 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var19 = 0; var19 < 4; ++var19) {
                            byte var20 = arg4.method2943((byte) 16);
                            if (~var20 == -1 && super.field7840[var19] != null) {
                                int var21 = arg5;
                                int var22 = arg5 + 64;
                                int var23 = arg1;
                                if (~var22 > -1) {
                                    var22 = 0;
                                } else if (~super.field7834 >= ~var22) {
                                    var22 = super.field7834;
                                }
                                if (arg5 < 0) {
                                    var21 = 0;
                                } else if (arg5 >= super.field7834) {
                                    var21 = super.field7834;
                                }
                                if (~arg1 <= -1) {
                                    if (~arg1 <= ~super.field7832) {
                                        var23 = super.field7832;
                                    }
                                } else {
                                    var23 = 0;
                                }
                                int var24 = arg1 - -64;
                                if (var24 < 0) {
                                    var24 = 0;
                                } else if (super.field7832 <= var24) {
                                    var24 = super.field7832;
                                }
                                while (~var21 > ~var22) {
                                    while (var24 > var23) {
                                        super.field7840[var19][var21][var23] = 0;
                                        ++var23;
                                    }
                                    ++var21;
                                }
                            } else if (var20 == 1) {
                                if (super.field7840[var19] == null) {
                                    super.field7840[var19] = new byte[super.field7834 + 1][super.field7832 - -1];
                                }
                                for (int var25 = 0; var25 < 64; var25 += 4) {
                                    for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                        byte var27 = arg4.method2943((byte) 16);
                                        for (int var28 = arg5 + var25; var28 < var25 + 4 - -arg5; ++var28) {
                                            for (int var29 = arg1 + var26; arg1 + var26 + 4 > var29; ++var29) {
                                                if (var28 >= 0 && ~var28 > ~super.field7834 && var29 >= 0 && ~super.field7832 < ~var29) {
                                                    super.field7840[var19][var28][var29] = var27;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var20 == -3) {
                                if (super.field7840[var19] == null) {
                                    super.field7840[var19] = new byte[super.field7834 + 1][super.field7832 - -1];
                                }
                                if (var19 > 0) {
                                    int var30 = arg5;
                                    int var31 = arg5 - -64;
                                    int var32 = arg1;
                                    if (arg5 >= 0) {
                                        if (~arg5 <= ~super.field7834) {
                                            var30 = super.field7834;
                                        }
                                    } else {
                                        var30 = 0;
                                    }
                                    if (arg1 >= 0) {
                                        if (~super.field7832 >= ~arg1) {
                                            var32 = super.field7832;
                                        }
                                    } else {
                                        var32 = 0;
                                    }
                                    int var33 = arg1 + 64;
                                    if (var31 < 0) {
                                        var31 = 0;
                                    } else if (var31 >= super.field7834) {
                                        var31 = super.field7834;
                                    }
                                    if (~var33 > -1) {
                                        var33 = 0;
                                    } else if (~super.field7832 >= ~var33) {
                                        var33 = super.field7832;
                                    }
                                    while (~var31 < ~var30) {
                                        while (~var32 > ~var33) {
                                            super.field7840[var19][var30][var32] = super.field7840[var19 + -1][var30][var32];
                                            ++var32;
                                        }
                                        ++var30;
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg5 >> 3) + var9;
                            int var12 = (arg1 >> 3) + var10;
                            if (var11 >= 0 && ~var11 > ~(super.field7834 >> 3) && var12 >= 0 && ~(super.field7832 >> 3) < ~var12) {
                                class662.method3775(-16777216, var12, var11, var8);
                            }
                        }
                    }
                }
                if (!var7 && super.field7840 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field7840[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; var15 < 16; ++var15) {
                                    int var16 = (arg5 >> 2) + var14;
                                    int var17 = (arg1 >> 2) + var15;
                                    if (var16 >= 0 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                        super.field7840[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2368(int arg0, String arg1) {
        ++field5261;
        long var2 = (long) arg0;
        int var4 = arg1.length();
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + -65 + 1);
            } else if (var6 >= 'a' && ~var6 >= -123) {
                var2 += (long) (-96 - -var6);
            } else if (~var6 <= -49 && ~var6 >= -58) {
                var2 += (long) (var6 - '0' + 27);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (~(var2 % 37L) == -1L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lha;IIIILmb;B)V")
    public final void method2369(class65 arg0, int arg1, int arg2, int arg3, int arg4, class274 arg5, byte arg6) {
        ++field5267;
        class484 var8 = this.method2372(arg3, 0, arg1, arg2, arg4);
        if (var8 != null) {
            class282 var9 = class277.field4038.method3919(true, var8.method1483(24853));
            int var10 = var8.method1482(true);
            int var11 = var8.method1478((byte) 116);
            if (var9.method1831(arg6 + -102)) {
                class706.method3995(var9, arg2, arg4, arg1, (byte) -24);
            }
            if (var8.method1488((byte) -125)) {
                var8.method1487(-112, arg0);
            }
            if (arg3 != 0) {
                if (~arg3 != -2) {
                    if (~arg3 == -3) {
                        class133.method988(arg1, arg4, arg2, field5273 != null ? field5273 : (field5273 = method2376("nq")));
                        if (var9.field4103 != 0 && ~(var9.field4188 + arg4) > ~super.field7834 && var9.field4188 + arg2 < super.field7832 && ~super.field7834 < ~(var9.field4125 + arg4) && ~(var9.field4125 + arg2) > ~super.field7832) {
                            arg5.method1774(-17854, arg2, var9.field4188, var9.field4114, !var9.field4120, var11, var9.field4125, arg4);
                        }
                        if (var10 == 9) {
                            if (~(var11 & 1) == -1) {
                                class436.method2605((byte) -94, arg1, 8, arg4, arg2);
                            } else {
                                class436.method2605((byte) -102, arg1, 16, arg4, arg2);
                            }
                        }
                    } else if (~arg3 == -4) {
                        class471.method2803(arg1, arg4, arg2);
                        if (~var9.field4103 == -2) {
                            arg5.method1775((byte) -125, arg2, arg4);
                        }
                    }
                } else {
                    class259.method1690(arg1, arg4, arg2);
                }
            } else {
                class574.method3374(arg1, arg4, arg2);
                if (~var9.field4103 != -1) {
                    arg5.method1768(var9.field4114, !var9.field4120, var10, arg4, var11, arg2, 87);
                }
                if (var9.field4095 == 1) {
                    if (var11 != 0) {
                        if (var11 != 1) {
                            if (~var11 != -3) {
                                if (var11 == 3) {
                                    class436.method2605((byte) -87, arg1, 2, arg4, arg2);
                                }
                            } else {
                                class436.method2605((byte) -106, arg1, 1, arg4 - -1, arg2);
                            }
                        } else {
                            class436.method2605((byte) -93, arg1, 2, arg4, arg2 - -1);
                        }
                    } else {
                        class436.method2605((byte) -127, arg1, 1, arg4, arg2);
                    }
                }
            }
        }
        if (arg6 != 7) {
            this.field5265 = -27;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBIIIIIIIIII)V")
    public static final void method2370(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field5272;
        if (arg1 > -80) {
            method2370(-59, (byte) 121, 72, -1, -31, 85, 68, 36, -96, -27, 82, 12);
        }
        if (class217.method1490(arg5, -1)) {
            if (class254.field3741[arg5] != null) {
                client.method2037(class254.field3741[arg5], -1, arg9, arg4, arg10, arg2, arg6, arg11, arg0, arg7, arg8, arg3);
            } else {
                client.method2037(class787.field10812[arg5], -1, arg9, arg4, arg10, arg2, arg6, arg11, arg0, arg7, arg8, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIIILha;IIII[Lmb;I)V")
    public final void method2371(byte[] arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5, int arg6, int arg7, int arg8, class274[] arg9, int arg10) {
        ++field5262;
        if (arg1 != 2) {
            method2365(86, (byte) -14);
        }
        class494 var12 = new class494(arg0);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2985((byte) 91);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2993(-104);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (var15 & 4082) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2964((byte) 75);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg5 == var19 && var18 >= arg3 && ~var18 > ~(arg3 + 8) && var17 >= arg8 && ~var17 > ~(arg8 + 8)) {
                    class282 var23 = class277.field4038.method3919(true, var13);
                    int var24 = class436.method2611(7 & var17, var22, var18 & 7, var23.field4188, 23058, var23.field4125, arg2) + arg10;
                    int var25 = class430.method2583(arg2, (byte) -127, var23.field4125, var23.field4188, var17 & 7, var22, 7 & var18) + arg7;
                    if (var24 > 0 && var25 > 0 && ~(super.field7834 + -1) < ~var24 && var25 < super.field7832 + -1) {
                        class274 var26 = null;
                        if (!super.field7823) {
                            int var27 = arg6;
                            if ((2 & class190.field2932[1][var24][var25]) == 2) {
                                var27 = arg6 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg9[var27];
                            }
                        }
                        this.method2366(arg2 + var22 & 3, var21, var26, var13, arg4, var25, arg6, -1, arg6, var24, arg1 ^ 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(IIIII)Lnq;")
    public final class484 method2372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5271;
        class484 var6 = null;
        if (arg0 == arg1) {
            var6 = (class484) class335.method2132(arg2, arg4, arg3);
        }
        if (~arg0 == -2) {
            var6 = (class484) class26.method241(arg2, arg4, arg3);
        }
        if (arg0 == 2) {
            var6 = (class484) class537.method3227(arg2, arg4, arg3, field5273 != null ? field5273 : (field5273 = method2376("nq")));
        }
        if (~arg0 == -4) {
            var6 = (class484) class266.method1725(arg2, arg4, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILha;Z)V")
    public final void method2373(int arg0, class65 arg1, boolean arg2) {
        ++field5269;
        class132.method977();
        if (!arg2) {
            if (~super.field7824 < -2) {
                for (int var4 = 0; super.field7834 > var4; ++var4) {
                    for (int var5 = 0; ~var5 > ~super.field7832; ++var5) {
                        if ((class190.field2932[1][var4][var5] & 2) == 2) {
                            class747.method4162(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~super.field7824 < ~var6; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field7832; ++var7) {
                    for (int var8 = 0; ~super.field7834 <= ~var8; ++var8) {
                        if (~(super.field7835[var6][var8][var7] & 4) != -1) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && (4 & super.field7835[var6][var8][var11 - 1]) != 0 && ~(var12 - var11) > -11) {
                                --var11;
                            }
                            while (~super.field7832 < ~var12 && (4 & super.field7835[var6][var8][var12 - -1]) != 0 && -var11 + var12 < 10) {
                                ++var12;
                            }
                            label118: while (~var9 < -1 && ~(-var9 + var10) > -11) {
                                for (int var13 = var11; ~var13 >= ~var12; ++var13) {
                                    if (~(4 & super.field7835[var6][var9 - 1][var13]) == -1) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (~var10 > ~super.field7834 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; var14 <= var12; ++var14) {
                                    if ((super.field7835[var6][var10 + 1][var14] & 4) == 0) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if ((var10 - var9 + 1) * (-var11 + 1 + var12) >= 4) {
                                int var15 = super.field7828[var6][var9][var11];
                                class738.method4110((var12 << 9) + 512, var15, var11 << 9, var15, (byte) -128, 4, (var10 << 9) + 512, var9 << 9, var6);
                                for (int var16 = var9; var10 >= var16; ++var16) {
                                    for (int var17 = var11; var17 <= var12; ++var17) {
                                        super.field7835[var6][var16][var17] = (byte) class702.method3977(super.field7835[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class674.method3834(-98);
        }
        super.field7835 = null;
        if (arg0 != 1) {
            this.method2369((class65) null, 22, -15, -50, -41, (class274) null, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lso;IIIII[IILha;II)V")
    public final void method2374(class494 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, class65 arg8, int arg9, int arg10) {
        ++field5270;
        if (!super.field7823) {
            boolean var12 = false;
            class114 var13 = null;
            if (arg6 != null) {
                arg6[0] = -1;
            }
            int var14 = (arg9 & 7) * 8;
            int var15 = (7 & arg2) * 8;
            while (true) {
                while (~arg0.field7050.length < ~arg0.field7042) {
                    int var21 = arg0.method2964((byte) 45);
                    if (~var21 == -1) {
                        var13 = new class114(arg0);
                    } else if (~var21 == -2) {
                        int var35 = arg0.method2964((byte) 74);
                        if (var35 > 0) {
                            for (int var36 = 0; ~var36 > ~var35; ++var36) {
                                class456 var37 = new class456(arg8, arg0, 2);
                                if (~var37.field6397 == -32) {
                                    class720 var38 = class518.field7313.method33(86, arg0.method2998(true));
                                    var37.method2720(var38.field9966, var38.field9965, var38.field9963, -669928756, var38.field9969);
                                }
                                if (~arg8.method535() < -1) {
                                    class154 var39 = var37.field6391;
                                    int var40 = var39.method1059(-6131) >> 9;
                                    int var41 = var39.method1058(115) >> 9;
                                    if (~var37.field6387 == ~arg10 && var14 <= var40 && var40 < var14 - -8 && ~var41 <= ~var15 && var41 < var15 + 8) {
                                        int var42 = (arg1 << 9) - -class4.method26(4095 & var39.method1059(-6131), (byte) -128, arg4, var39.method1058(71) & 4095);
                                        int var43 = class300.method1943(4095 & var39.method1058(79), arg4, 4095 & var39.method1059(-6131), (byte) -104) + (arg3 << 9);
                                        int var44 = var42 >> 9;
                                        int var45 = var43 >> 9;
                                        if (var44 >= 0 && ~var45 <= -1 && super.field7834 > var44 && super.field7832 > var45) {
                                            var39.method1053(var42, var43, super.field7828[arg10][var44][var45] + -var39.method1055((byte) -71), (byte) 122);
                                            class525.method3172(var37);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var21 == -3) {
                        if (var13 == null) {
                            var13 = new class114();
                        }
                        var13.method857(arg0, 8);
                    } else if (~var21 == -129) {
                        if (arg6 == null) {
                            arg0.field7042 += 10;
                        } else {
                            arg6[0] = arg0.method2998(true);
                            arg6[1] = arg0.method2988(-3);
                            arg6[2] = arg0.method2988(-3);
                            arg6[3] = arg0.method2988(-3);
                            arg6[4] = arg0.method2998(true);
                        }
                    } else {
                        if (var21 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7840 == null) {
                            super.field7840 = new byte[4][][];
                        }
                        for (int var22 = 0; var22 < 4; ++var22) {
                            byte var23 = arg0.method2943((byte) 16);
                            if (var23 == 0 && super.field7840[arg7] != null) {
                                if (~arg10 <= ~var22) {
                                    int var24 = arg1;
                                    int var25 = arg1 + 7;
                                    int var26 = arg3;
                                    if (arg3 < 0) {
                                        var26 = 0;
                                    } else if (~super.field7832 >= ~arg3) {
                                        var26 = super.field7832;
                                    }
                                    if (~arg1 > -1) {
                                        var24 = 0;
                                    } else if (super.field7834 <= arg1) {
                                        var24 = super.field7834;
                                    }
                                    int var27 = arg3 + 7;
                                    if (var25 >= 0) {
                                        if (~super.field7834 >= ~var25) {
                                            var25 = super.field7834;
                                        }
                                    } else {
                                        var25 = 0;
                                    }
                                    if (~var27 > -1) {
                                        var27 = 0;
                                    } else if (~super.field7832 >= ~var27) {
                                        var27 = super.field7832;
                                    }
                                    while (~var24 > ~var25) {
                                        while (~var27 < ~var26) {
                                            super.field7840[arg7][var24][var26] = 0;
                                            ++var26;
                                        }
                                        ++var24;
                                    }
                                }
                            } else if (var23 == 1) {
                                if (super.field7840[arg7] == null) {
                                    super.field7840[arg7] = new byte[super.field7834 + 1][super.field7832 + 1];
                                }
                                for (int var28 = 0; var28 < 64; var28 += 4) {
                                    for (int var29 = 0; var29 < 64; var29 += 4) {
                                        byte var30 = arg0.method2943((byte) 16);
                                        if (var22 <= arg10) {
                                            for (int var31 = var28; var28 + 4 > var31; ++var31) {
                                                for (int var32 = var29; var32 < var29 + 4; ++var32) {
                                                    if (var14 <= var31 && ~var31 > ~(var14 + 8) && ~var15 >= ~var32 && ~(var15 - -8) < ~var15) {
                                                        int var33 = arg1 - -class248.method1636(var32 & 7, 7 & var31, 38, arg4);
                                                        int var34 = class545.method3258(arg4, 7 & var31, var32 & 7, false) + arg3;
                                                        if (~var33 <= -1 && super.field7834 > var33 && ~var34 <= -1 && var34 < super.field7832) {
                                                            super.field7840[arg7][var33][var34] = var30;
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
                    class662.method3775(-16777216, arg3 >> 3, arg1 >> 3, var13);
                }
                if (!var12 && super.field7840 != null && super.field7840[arg7] != null) {
                    int var16 = arg1 - -7;
                    int var17 = arg3 + 7;
                    for (int var18 = arg1; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg3; var17 > var19; ++var19) {
                            super.field7840[arg7][var18][var19] = 0;
                        }
                    }
                }
                int var20 = -20 % ((arg5 - 19) / 56);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIII[Lmb;Lha;)V")
    public final void method2375(byte[] arg0, int arg1, int arg2, int arg3, class274[] arg4, class65 arg5) {
        ++field5263;
        if (arg3 == 22414) {
            class494 var7 = new class494(arg0);
            int var8 = -1;
            while (true) {
                int var9 = var7.method2985((byte) 65);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method2993(-115);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = 63 & var10 >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method2964((byte) 127);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg2 + var13;
                    int var19 = var12 - -arg1;
                    if (var18 > 0 && ~var19 < -1 && ~(super.field7834 + -1) < ~var18 && super.field7832 + -1 > var19) {
                        class274 var20 = null;
                        if (!super.field7823) {
                            int var21 = var14;
                            if (~(class190.field2932[1][var18][var19] & 2) == -3) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg4[var21];
                            }
                        }
                        this.method2366(var17, var16, var20, var8, arg5, var19, var14, -1, var14, var18, 3);
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2376(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
