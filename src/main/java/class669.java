import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class669 extends class125 {

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    public int field9567 = 99;

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "[I")
    public static int[] field9564 = new int[8];

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public static int field9561;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "I")
    public static int field9562;

    @OriginalMember(owner = "client!dw", name = "G", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!dw", name = "J", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "Lom;")
    public static class344 field9559;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dw", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field9570;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lqh;IIZLr;[I)V")
    public final void method3779(class61 arg0, int arg1, int arg2, boolean arg3, class167 arg4, int[] arg5) {
        ++field9568;
        if (!super.field2265) {
            boolean var7 = false;
            class472 var8 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            while (true) {
                while (arg0.field1397.length > arg0.field1393) {
                    int var18 = arg0.method732(-559537960);
                    if (~var18 == -1) {
                        var8 = new class472(arg0);
                    } else if (var18 == 1) {
                        int var34 = arg0.method732(-559537960);
                        if (var34 > 0) {
                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                class682 var36 = new class682(arg4, arg0, 2);
                                if (~var36.field9660 == -32) {
                                    class153 var37 = class428.field6168.method2732(arg0.method723((byte) -25), (byte) -25);
                                    var36.method3837(var37.field2599, var37.field2600, (byte) 44, var37.field2602, var37.field2603);
                                }
                                if (~arg4.method151() < -1) {
                                    class9 var38 = var36.field9658;
                                    int var39 = (arg2 << 9) + var38.method276(-1);
                                    int var40 = (arg1 << 9) + var38.method270(94);
                                    int var41 = var39 >> 9;
                                    int var42 = var40 >> 9;
                                    if (var41 >= 0 && var42 >= 0 && ~var41 > ~super.field2262 && ~var42 > ~super.field2274) {
                                        var38.method272(super.field2264[var36.field9665][var41][var42] + -var38.method273(false), var39, -1, var40);
                                        class19.method434(var36);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class472();
                        }
                        var8.method2832(23948, arg0);
                    } else if (~var18 == -129) {
                        if (arg5 != null) {
                            arg5[0] = arg0.method723((byte) -25);
                            arg5[1] = arg0.method721(-461515024);
                            arg5[2] = arg0.method721(-461515024);
                            arg5[3] = arg0.method721(-461515024);
                            arg5[4] = arg0.method723((byte) -25);
                        } else {
                            arg0.field1393 += 10;
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field2273 == null) {
                            super.field2273 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var19 = 0; ~var19 > -5; ++var19) {
                            byte var20 = arg0.method710((byte) 43);
                            if (var20 == 0 && super.field2273[var19] != null) {
                                int var21 = arg2;
                                int var22 = arg2 + 64;
                                int var23 = arg1;
                                if (~arg1 > -1) {
                                    var23 = 0;
                                } else if (~arg1 <= ~super.field2274) {
                                    var23 = super.field2274;
                                }
                                int var24 = arg1 + 64;
                                if (~arg2 > -1) {
                                    var21 = 0;
                                } else if (~arg2 <= ~super.field2262) {
                                    var21 = super.field2262;
                                }
                                if (~var22 > -1) {
                                    var22 = 0;
                                } else if (super.field2262 <= var22) {
                                    var22 = super.field2262;
                                }
                                if (~var24 > -1) {
                                    var24 = 0;
                                } else if (~super.field2274 >= ~var24) {
                                    var24 = super.field2274;
                                }
                                while (~var21 > ~var22) {
                                    while (var24 > var23) {
                                        super.field2273[var19][var21][var23] = 0;
                                        ++var23;
                                    }
                                    ++var21;
                                }
                            } else if (~var20 != -2) {
                                if (~var20 == -3) {
                                    if (super.field2273[var19] == null) {
                                        super.field2273[var19] = new byte[super.field2262 + 1][super.field2274 + 1];
                                    }
                                    if (var19 > 0) {
                                        int var25 = arg2;
                                        int var26 = arg2 + 64;
                                        int var27 = arg1;
                                        if (~arg2 <= -1) {
                                            if (super.field2262 <= arg2) {
                                                var25 = super.field2262;
                                            }
                                        } else {
                                            var25 = 0;
                                        }
                                        if (~arg1 <= -1) {
                                            if (~super.field2274 >= ~arg1) {
                                                var27 = super.field2274;
                                            }
                                        } else {
                                            var27 = 0;
                                        }
                                        int var28 = arg1 + 64;
                                        if (var26 < 0) {
                                            var26 = 0;
                                        } else if (super.field2262 <= var26) {
                                            var26 = super.field2262;
                                        }
                                        if (~var28 > -1) {
                                            var28 = 0;
                                        } else if (var28 >= super.field2274) {
                                            var28 = super.field2274;
                                        }
                                        while (var26 > var25) {
                                            while (~var28 < ~var27) {
                                                super.field2273[var19][var25][var27] = super.field2273[var19 + -1][var25][var27];
                                                ++var27;
                                            }
                                            ++var25;
                                        }
                                    }
                                }
                            } else {
                                if (super.field2273[var19] == null) {
                                    super.field2273[var19] = new byte[super.field2262 + 1][super.field2274 + 1];
                                }
                                for (int var29 = 0; var29 < 64; var29 += 4) {
                                    for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                        byte var31 = arg0.method710((byte) 43);
                                        for (int var32 = var29 - -arg2; var32 < arg2 + var29 + 4; ++var32) {
                                            for (int var33 = var30 - -arg1; ~var33 > ~(var30 + 4 - -arg1); ++var33) {
                                                if (~var32 <= -1 && var32 < super.field2262 && var33 >= 0 && ~var33 > ~super.field2274) {
                                                    super.field2273[var19][var32][var33] = var31;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg2 >> 3) + var9;
                            int var12 = (arg1 >> 3) + var10;
                            if (~var11 <= -1 && ~(super.field2262 >> 3) < ~var11 && ~var12 <= -1 && var12 < super.field2274 >> 3) {
                                class638.method3639(var8, var11, var12, -3534);
                            }
                        }
                    }
                }
                if (!arg3) {
                    return;
                }
                if (!var7 && super.field2273 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field2273[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; var15 < 16; ++var15) {
                                    int var16 = (arg2 >> 2) - -var14;
                                    int var17 = (arg1 >> 2) - -var15;
                                    if (var16 >= 0 && var16 < 26 && var17 >= 0 && var17 < 26) {
                                        super.field2273[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V")
    public static void method3780(byte arg0) {
        if (arg0 != 57) {
            field9564 = null;
        }
        field9559 = null;
        field9564 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IILr;IILfh;I)V")
    public final void method3781(int arg0, int arg1, class167 arg2, int arg3, int arg4, class605 arg5, int arg6) {
        ++field9566;
        class83 var8 = null;
        if (~arg1 == -1) {
            var8 = (class83) class264.method1729(arg3, arg6, arg0);
        }
        if (arg1 == 1) {
            var8 = (class83) class275.method1797(arg3, arg6, arg0);
        }
        if (arg1 == 2) {
            var8 = (class83) class63.method756(arg3, arg6, arg0, field9570 != null ? field9570 : (field9570 = method3788("qu")));
        }
        if (arg1 == 3) {
            var8 = (class83) class697.method3897(arg3, arg6, arg0);
        }
        if (var8 != null) {
            class56 var9 = class237.field3521.method3515(var8.method841((byte) 52), 50);
            int var10 = var8.method844((byte) 96);
            int var11 = var8.method846((byte) -105);
            if (var9.method652(true)) {
                class335.method2162(var9, arg3, true, arg6, arg0);
            }
            if (var8.method845(84)) {
                var8.method842((byte) 98, arg2);
            }
            if (~arg1 == -1) {
                class697.method3898(arg3, arg6, arg0);
                if (~var9.field1288 != -1) {
                    arg5.method3482((byte) -21, var9.field1276, !var9.field1305, arg6, arg0, var11, var10);
                }
                if (~var9.field1293 == -2) {
                    if (~var11 != -1) {
                        if (var11 != 1) {
                            if (~var11 != -3) {
                                if (~var11 == -4) {
                                    class292.method1949(arg3, arg0, arg6, 2, (byte) -69);
                                }
                            } else {
                                class292.method1949(arg3, arg0, arg6 - -1, 1, (byte) -74);
                            }
                        } else {
                            class292.method1949(arg3, arg0 + 1, arg6, 2, (byte) -103);
                        }
                    } else {
                        class292.method1949(arg3, arg0, arg6, 1, (byte) -100);
                    }
                }
            } else if (~arg1 == -2) {
                class318.method2050(arg3, arg6, arg0);
            } else if (arg1 != 2) {
                if (~arg1 == -4) {
                    class139.method1137(arg3, arg6, arg0);
                    if (var9.field1288 == 1) {
                        arg5.method3479(arg6, arg0, (byte) 17);
                    }
                }
            } else {
                class619.method3537(arg3, arg6, arg0, field9570 != null ? field9570 : (field9570 = method3788("qu")));
                if (var9.field1288 != 0 && ~(var9.field1238 + arg6) > ~super.field2262 && arg0 - -var9.field1238 < super.field2274 && ~super.field2262 < ~(var9.field1244 + arg6) && var9.field1244 + arg0 < super.field2274) {
                    arg5.method3477(75, var9.field1244, var11, !var9.field1305, var9.field1276, var9.field1238, arg6, arg0);
                }
            }
        }
        if (arg4 != -5134) {
            this.method3785((byte[]) null, -73, 55, (class605[]) null, (class167) null, 89);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILr;[BIII[Lfh;IIII)V")
    public final void method3782(int arg0, class167 arg1, byte[] arg2, int arg3, int arg4, int arg5, class605[] arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field9561;
        class61 var12 = new class61(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method703(128);
            if (~var14 == -1) {
                if (arg0 != -2) {
                    field9559 = null;
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method752(-27278);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = (4073 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method732(-559537960);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg3 == ~var19 && var18 >= arg5 && arg5 - -8 > var18 && arg8 <= var17 && ~(arg8 + 8) < ~var17) {
                    class56 var23 = class237.field3521.method3515(var13, 50);
                    int var24 = arg4 - -class146.method1163(7 & var17, arg7, var23.field1238, var22, var23.field1244, 7 & var18, arg0 + 4);
                    int var25 = arg9 + class163.method1247(7 & var17, arg7, 7, var23.field1238, var22, var23.field1244, var18 & 7);
                    if (~var24 < -1 && ~var25 < -1 && var24 < super.field2262 - 1 && ~(super.field2274 + -1) < ~var25) {
                        class605 var26 = null;
                        if (!super.field2265) {
                            int var27 = arg10;
                            if ((class517.field7301[1][var24][var25] & 2) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg6[var27];
                            }
                        }
                        this.method3783(arg10, var26, arg1, var24, var25, -18839, var13, 3 & arg7 + var22, var21, -1, arg10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILfh;Lr;IIIIIIII)V")
    public final void method3783(int arg0, class605 arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field9563;
        if (class527.field7429.method2824(-1, class90.field1654) || class575.method3300(class432.field6242, arg10, arg4, (byte) -16, arg3)) {
            if (this.field9567 > arg0) {
                this.field9567 = arg0;
            }
            class56 var12 = class237.field3521.method3515(arg6, 50);
            if (!arg2.method17() || !class527.field7429.field2656 || !var12.field1279) {
                int var13;
                int var14;
                if (arg7 != 1 && ~arg7 != -4) {
                    var13 = var12.field1238;
                    var14 = var12.field1244;
                } else {
                    var14 = var12.field1238;
                    var13 = var12.field1244;
                }
                int var15;
                int var16;
                if (super.field2262 >= arg3 + var13) {
                    var15 = arg3 - -(var13 + 1 >> 1);
                    var16 = (var13 >> 1) + arg3;
                } else {
                    var15 = arg3 + 1;
                    var16 = arg3;
                }
                int var17;
                int var18;
                if (~(arg4 - -var14) < ~super.field2274) {
                    var17 = arg4;
                    var18 = arg4 + 1;
                } else {
                    var17 = (var14 >> 1) + arg4;
                    var18 = (var14 - -1 >> 1) + arg4;
                }
                class37 var19 = class485.field6947[arg10];
                int var20 = var19.method551(var16, var17, (byte) -95) + var19.method551(var15, var17, (byte) -114) - (-var19.method551(var16, var18, (byte) -122) - var19.method551(var15, var18, (byte) -105)) >> 2;
                int var21 = (arg3 << 9) + (var13 << 8);
                int var22 = (arg4 << 9) + (var14 << 8);
                boolean var23 = class628.field9056 && !super.field2265 && var12.field1277;
                if (var12.method652(true)) {
                    class461.method2759(arg0, (byte) -44, (class602) null, arg3, arg7, (class22) null, var12, arg4);
                }
                if (arg5 != -18839) {
                    field9559 = null;
                }
                boolean var24 = ~arg9 == 0 && ~var12.field1291 == 0 && var12.field1246 == null && var12.field1248 == null && !var12.field1231;
                if (!class66.field1449 || (!class505.method3002(arg5 ^ 18847, arg8) || var12.field1293 == 1) && (!class492.method2953(arg8, true) || var12.field1293 != 0)) {
                    if (~arg8 == -23) {
                        if (class527.field7429.field2665 || ~var12.field1290 != -1 || ~var12.field1288 == -2 || var12.field1283) {
                            class219 var25;
                            if (!var24) {
                                var25 = new class704(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg7, arg9);
                            } else {
                                class490 var26 = new class490(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg7, var23);
                                var25 = var26;
                                if (var26.method845(arg5 + 18923)) {
                                    var26.method840(arg2, false);
                                }
                            }
                            class115.method1021(arg0, arg3, arg4, var25);
                            if (~var12.field1288 == -2 && arg1 != null) {
                                arg1.method3471(arg4, (byte) 88, arg3);
                            }
                        }
                    } else if (~arg8 != -11 && arg8 != 11) {
                        if (~arg8 <= -13 && ~arg8 >= -18 || ~arg8 <= -19 && arg8 <= 21) {
                            class122 var28;
                            if (var24) {
                                class620 var27 = new class620(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg3, arg3 + var13 + -1, arg4, arg4 + var14 + -1, arg8, arg7, var23);
                                if (var27.method845(112)) {
                                    var27.method840(arg2, false);
                                }
                                var28 = var27;
                            } else {
                                var28 = new class533(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg3, arg3 + var13 + -1, arg4, arg4 + var14 + -1, arg8, arg7, arg9);
                            }
                            class543.method3127(var28, false);
                            if (class628.field9056 && !super.field2265 && ~arg8 <= -13 && ~arg8 >= -18 && ~arg8 != -14 && arg0 > 0 && ~var12.field1293 != -1) {
                                super.field2266[arg0][arg3][arg4] = (byte) class2.method189(super.field2266[arg0][arg3][arg4], 4);
                            }
                            if (~var12.field1288 != -1 && arg1 != null) {
                                arg1.method3487(var14, !var12.field1305, 128, var12.field1276, var13, arg4, arg3);
                            }
                        } else if (arg8 == 0) {
                            int var29 = var12.field1293;
                            if (class358.field5341 && var12.field1293 == -1) {
                                var29 = 1;
                            }
                            class624 var30;
                            if (!var24) {
                                var30 = new class458(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, arg7, arg9);
                            } else {
                                class553 var31 = new class553(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, arg7, var23);
                                if (var31.method845(119)) {
                                    var31.method840(arg2, false);
                                }
                                var30 = var31;
                            }
                            class552.method3162(arg0, arg3, arg4, var30, (class624) null);
                            if (arg7 != 0) {
                                if (~arg7 != -2) {
                                    if (~arg7 != -3) {
                                        if (~arg7 == -4) {
                                            if (class628.field9056 && var12.field1224) {
                                                var19.method544(arg3, arg4, 50);
                                                var19.method544(arg3 + 1, arg4, 50);
                                            }
                                            if (var29 == 1 && !super.field2265) {
                                                class416.method2534(arg0, 2, arg3, var12.field1300, arg5 + 18878, arg4, var12.field1303);
                                            }
                                        }
                                    } else {
                                        if (class628.field9056 && var12.field1224) {
                                            var19.method544(arg3 + 1, arg4, 50);
                                            var19.method544(arg3 + 1, arg4 - -1, 50);
                                        }
                                        if (~var29 == -2 && !super.field2265) {
                                            class416.method2534(arg0, 1, arg3 + 1, var12.field1300, 75, arg4, -var12.field1303);
                                        }
                                    }
                                } else {
                                    if (class628.field9056 && var12.field1224) {
                                        var19.method544(arg3, arg4 + 1, 50);
                                        var19.method544(arg3 + 1, arg4 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field2265) {
                                        class416.method2534(arg0, 2, arg3, var12.field1300, 26, arg4 + 1, -var12.field1303);
                                    }
                                }
                            } else {
                                if (class628.field9056 && var12.field1224) {
                                    var19.method544(arg3, arg4, 50);
                                    var19.method544(arg3, arg4 + 1, 50);
                                }
                                if (~var29 == -2 && !super.field2265) {
                                    class416.method2534(arg0, 1, arg3, var12.field1300, 59, arg4, var12.field1303);
                                }
                            }
                            if (var12.field1288 != 0 && arg1 != null) {
                                arg1.method3469(arg3, arg7, (byte) -97, arg8, !var12.field1305, arg4, var12.field1276);
                            }
                            if (~var12.field1260 != -65) {
                                class382.method2377(arg0, arg3, arg4, var12.field1260);
                            }
                        } else if (~arg8 == -2) {
                            class624 var33;
                            if (var24) {
                                class553 var32 = new class553(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, arg7, var23);
                                var33 = var32;
                                if (var32.method845(arg5 ^ -18921)) {
                                    var32.method840(arg2, false);
                                }
                            } else {
                                var33 = new class458(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, arg7, arg9);
                            }
                            class552.method3162(arg0, arg3, arg4, var33, (class624) null);
                            if (var12.field1224 && class628.field9056) {
                                if (~arg7 == -1) {
                                    var19.method544(arg3, arg4 + 1, 50);
                                } else if (arg7 == 1) {
                                    var19.method544(arg3 + 1, arg4 + 1, 50);
                                } else if (~arg7 == -3) {
                                    var19.method544(arg3 + 1, arg4, 50);
                                } else if (~arg7 == -4) {
                                    var19.method544(arg3, arg4, 50);
                                }
                            }
                            if (~var12.field1288 != -1 && arg1 != null) {
                                arg1.method3469(arg3, arg7, (byte) -87, arg8, !var12.field1305, arg4, var12.field1276);
                            }
                        } else if (arg8 == 2) {
                            int var34 = arg7 + 1 & 3;
                            class624 var37;
                            class624 var38;
                            if (var24) {
                                class553 var35 = new class553(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, arg7 - -4, var23);
                                class553 var36 = new class553(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, var34, var23);
                                if (var35.method845(98)) {
                                    var35.method840(arg2, false);
                                }
                                if (var36.method845(105)) {
                                    var36.method840(arg2, false);
                                }
                                var37 = var36;
                                var38 = var35;
                            } else {
                                var38 = new class458(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, arg7 + 4, arg9);
                                var37 = new class458(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, var34, arg9);
                            }
                            class552.method3162(arg0, arg3, arg4, var38, var37);
                            if ((~var12.field1293 == -2 || class358.field5341 && ~var12.field1293 == 0) && !super.field2265) {
                                if (~arg7 == -1) {
                                    class416.method2534(arg0, 1, arg3, var12.field1300, 80, arg4, var12.field1303);
                                    class416.method2534(arg0, 2, arg3, var12.field1300, 33, arg4 + 1, var12.field1303);
                                } else if (arg7 != 1) {
                                    if (~arg7 == -3) {
                                        class416.method2534(arg0, 1, arg3 - -1, var12.field1300, arg5 ^ -18869, arg4, var12.field1303);
                                        class416.method2534(arg0, 2, arg3, var12.field1300, 63, arg4, var12.field1303);
                                    } else if (arg7 == 3) {
                                        class416.method2534(arg0, 1, arg3, var12.field1300, 104, arg4, var12.field1303);
                                        class416.method2534(arg0, 2, arg3, var12.field1300, 90, arg4, var12.field1303);
                                    }
                                } else {
                                    class416.method2534(arg0, 1, arg3 + 1, var12.field1300, 119, arg4, var12.field1303);
                                    class416.method2534(arg0, 2, arg3, var12.field1300, 82, arg4 - -1, var12.field1303);
                                }
                            }
                            if (var12.field1288 != 0 && arg1 != null) {
                                arg1.method3469(arg3, arg7, (byte) -81, arg8, !var12.field1305, arg4, var12.field1276);
                            }
                            if (var12.field1260 != 64) {
                                class382.method2377(arg0, arg3, arg4, var12.field1260);
                            }
                        } else if (~arg8 == -4) {
                            class624 var40;
                            if (var24) {
                                class553 var39 = new class553(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, arg7, var23);
                                if (var39.method845(122)) {
                                    var39.method840(arg2, false);
                                }
                                var40 = var39;
                            } else {
                                var40 = new class458(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg8, arg7, arg9);
                            }
                            class552.method3162(arg0, arg3, arg4, var40, (class624) null);
                            if (var12.field1224 && class628.field9056) {
                                if (~arg7 == -1) {
                                    var19.method544(arg3, arg4 + 1, 50);
                                } else if (~arg7 == -2) {
                                    var19.method544(arg3 + 1, arg4 + 1, 50);
                                } else if (arg7 != 2) {
                                    if (~arg7 == -4) {
                                        var19.method544(arg3, arg4, 50);
                                    }
                                } else {
                                    var19.method544(arg3 + 1, arg4, 50);
                                }
                            }
                            if (~var12.field1288 != -1 && arg1 != null) {
                                arg1.method3469(arg3, arg7, (byte) -96, arg8, !var12.field1305, arg4, var12.field1276);
                            }
                        } else if (~arg8 == -10) {
                            class122 var42;
                            if (var24) {
                                class620 var41 = new class620(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg3, arg3, arg4, arg4, arg8, arg7, var23);
                                if (var41.method845(75)) {
                                    var41.method840(arg2, false);
                                }
                                var42 = var41;
                            } else {
                                var42 = new class533(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg3, arg3 - 1 + var13, arg4, arg4 + -1 - -var14, arg8, arg7, arg9);
                            }
                            class543.method3127(var42, false);
                            if (var12.field1288 != 0 && arg1 != null) {
                                arg1.method3487(var14, !var12.field1305, 128, var12.field1276, var13, arg4, arg3);
                            }
                            if (var12.field1260 != 64) {
                                class382.method2377(arg0, arg3, arg4, var12.field1260);
                            }
                        } else if (arg8 == 4) {
                            class195 var43;
                            if (!var24) {
                                var43 = new class433(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, 0, 0, arg8, arg7, arg9);
                            } else {
                                class126 var44 = new class126(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, 0, 0, arg8, arg7);
                                var43 = var44;
                                if (var44.method845(102)) {
                                    var44.method840(arg2, false);
                                }
                            }
                            class619.method3539(arg0, arg3, arg4, var43, (class195) null);
                        } else if (arg8 == 5) {
                            int var45 = 65;
                            class83 var46 = (class83) class264.method1729(arg0, arg3, arg4);
                            if (var46 != null) {
                                var45 = class237.field3521.method3515(var46.method841((byte) 52), 50).field1260 + 1;
                            }
                            class195 var48;
                            if (var24) {
                                class126 var47 = new class126(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, class24.field895[arg7] * var45, class526.field7420[arg7] * var45, arg8, arg7);
                                var48 = var47;
                                if (var47.method845(113)) {
                                    var47.method840(arg2, false);
                                }
                            } else {
                                var48 = new class433(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, class24.field895[arg7] * var45, class526.field7420[arg7] * var45, arg8, arg7, arg9);
                            }
                            class619.method3539(arg0, arg3, arg4, var48, (class195) null);
                        } else if (arg8 == 6) {
                            int var49 = 33;
                            class83 var50 = (class83) class264.method1729(arg0, arg3, arg4);
                            if (var50 != null) {
                                var49 = class237.field3521.method3515(var50.method841((byte) 52), 50).field1260 / 2 - -1;
                            }
                            class195 var51;
                            if (!var24) {
                                var51 = new class433(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, class9.field543[arg7] * var49, class3.field446[arg7] * var49, arg8, arg7 - -4, arg9);
                            } else {
                                class126 var52 = new class126(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, class24.field895[arg7] * var49, class526.field7420[arg7] * var49, arg8, arg7 + 4);
                                if (var52.method845(arg5 ^ -18919)) {
                                    var52.method840(arg2, false);
                                }
                                var51 = var52;
                            }
                            class619.method3539(arg0, arg3, arg4, var51, (class195) null);
                        } else if (arg8 == 7) {
                            int var53 = arg7 + 2 & 3;
                            class195 var55;
                            if (var24) {
                                class126 var54 = new class126(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, 0, 0, arg8, var53 - -4);
                                if (var54.method845(91)) {
                                    var54.method840(arg2, false);
                                }
                                var55 = var54;
                            } else {
                                var55 = new class433(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, 0, 0, arg8, var53 + 4, arg9);
                            }
                            class619.method3539(arg0, arg3, arg4, var55, (class195) null);
                        } else if (arg8 == 8) {
                            int var56 = 3 & arg7 - -2;
                            int var57 = 33;
                            class83 var58 = (class83) class264.method1729(arg0, arg3, arg4);
                            if (var58 != null) {
                                var57 = 1 + class237.field3521.method3515(var58.method841((byte) 52), arg5 + 18889).field1260 / 2;
                            }
                            class195 var61;
                            class195 var62;
                            if (!var24) {
                                class433 var59 = new class433(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, class9.field543[arg7] * var57, class3.field446[arg7] * var57, arg8, arg7 - -4, arg9);
                                class433 var60 = new class433(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, 0, 0, arg8, var56 + 4, arg9);
                                var61 = var59;
                                var62 = var60;
                            } else {
                                class126 var63 = new class126(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, class9.field543[arg7] * var57, class3.field446[arg7] * var57, arg8, arg7 + 4);
                                class126 var64 = new class126(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, 0, 0, arg8, var56 + 4);
                                if (var63.method845(arg5 ^ -18894)) {
                                    var63.method840(arg2, false);
                                }
                                if (var64.method845(82)) {
                                    var64.method840(arg2, false);
                                }
                                var61 = var63;
                                var62 = var64;
                            }
                            class619.method3539(arg0, arg3, arg4, var61, var62);
                        }
                    } else {
                        class620 var65 = null;
                        class122 var66;
                        int var67;
                        if (!var24) {
                            var66 = new class533(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg3, var13 + -1 + arg3, arg4, var14 + -1 + arg4, arg8, arg7, arg9);
                            var67 = 15;
                        } else {
                            class620 var68 = new class620(arg2, var12, arg0, arg10, var21, var20, var22, super.field2265, arg3, arg3 + var13 + -1, arg4, var14 + -1 + arg4, arg8, arg7, var23);
                            var65 = var68;
                            var66 = var68;
                            var67 = var68.method3544(arg5 ^ -18835);
                        }
                        if (class543.method3127(var66, false)) {
                            if (var65 != null && var65.method845(108)) {
                                var65.method840(arg2, false);
                            }
                            if (var12.field1224 && class628.field9056) {
                                if (~var67 < -31) {
                                    var67 = 30;
                                }
                                for (int var69 = 0; var13 >= var69; ++var69) {
                                    for (int var70 = 0; ~var70 >= ~var14; ++var70) {
                                        var19.method544(arg3 - -var69, arg4 + var70, var67);
                                    }
                                }
                            }
                        }
                        if (var12.field1288 != 0 && arg1 != null) {
                            arg1.method3487(var14, !var12.field1305, arg5 + 18967, var12.field1276, var13, arg4, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILr;I[IILqh;III)V")
    public final void method3784(int arg0, int arg1, int arg2, class167 arg3, int arg4, int[] arg5, int arg6, class61 arg7, int arg8, int arg9, int arg10) {
        ++field9569;
        if (!super.field2265) {
            boolean var12 = false;
            if (arg4 != 4) {
                field9564 = null;
            }
            class472 var13 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            int var14 = (arg1 & 7) * 8;
            int var15 = (7 & arg6) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg7.field1393 > ~arg7.field1397.length) {
                            int var20 = arg7.method732(-559537960);
                            if (var20 != 0) {
                                if (~var20 != -2) {
                                    if (var20 == 2) {
                                        if (var13 == null) {
                                            var13 = new class472();
                                        }
                                        var13.method2832(23948, arg7);
                                    } else if (var20 == 128) {
                                        if (arg5 == null) {
                                            arg7.field1393 += 10;
                                        } else {
                                            arg5[0] = arg7.method723((byte) -25);
                                            arg5[1] = arg7.method721(-461515024);
                                            arg5[2] = arg7.method721(-461515024);
                                            arg5[3] = arg7.method721(arg4 + -461515028);
                                            arg5[4] = arg7.method723((byte) -25);
                                        }
                                    } else {
                                        if (var20 != 129) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field2273 == null) {
                                            super.field2273 = new byte[4][][];
                                        }
                                        for (int var21 = 0; ~var21 > -5; ++var21) {
                                            byte var22 = arg7.method710((byte) 43);
                                            if (~var22 == -1 && super.field2273[arg10] != null) {
                                                if (var21 <= arg2) {
                                                    int var23 = arg8;
                                                    int var24 = arg8 - -7;
                                                    int var25 = arg0;
                                                    if (~arg8 > -1) {
                                                        var23 = 0;
                                                    } else if (arg8 >= super.field2262) {
                                                        var23 = super.field2262;
                                                    }
                                                    if (~arg0 <= -1) {
                                                        if (arg0 >= super.field2274) {
                                                            var25 = super.field2274;
                                                        }
                                                    } else {
                                                        var25 = 0;
                                                    }
                                                    if (var24 >= 0) {
                                                        if (var24 >= super.field2262) {
                                                            var24 = super.field2262;
                                                        }
                                                    } else {
                                                        var24 = 0;
                                                    }
                                                    int var26 = arg0 + 7;
                                                    if (~var26 <= -1) {
                                                        if (super.field2274 <= var26) {
                                                            var26 = super.field2274;
                                                        }
                                                    } else {
                                                        var26 = 0;
                                                    }
                                                    while (~var24 < ~var23) {
                                                        while (~var26 < ~var25) {
                                                            super.field2273[arg10][var23][var25] = 0;
                                                            ++var25;
                                                        }
                                                        ++var23;
                                                    }
                                                }
                                            } else if (~var22 == -2) {
                                                if (super.field2273[arg10] == null) {
                                                    super.field2273[arg10] = new byte[super.field2262 + 1][super.field2274 - -1];
                                                }
                                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                                        byte var29 = arg7.method710((byte) 43);
                                                        if (~var21 >= ~arg2) {
                                                            for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                                for (int var31 = var28; ~var31 > ~(var28 + 4); ++var31) {
                                                                    if (var14 <= var30 && ~var30 > ~(var14 + 8) && ~var15 >= ~var31 && var15 + 8 > var15) {
                                                                        int var32 = arg8 + class140.method1139(7 & var30, arg9, var31 & 7, true);
                                                                        int var33 = arg0 - -class689.method3863(7 & var30, (byte) 102, var31 & 7, arg9);
                                                                        if (var32 >= 0 && ~var32 > ~super.field2262 && ~var33 <= -1 && var33 < super.field2274) {
                                                                            super.field2273[arg10][var32][var33] = var29;
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
                                    int var34 = arg7.method732(-559537960);
                                    if (var34 > 0) {
                                        for (int var35 = 0; var34 > var35; ++var35) {
                                            class682 var36 = new class682(arg3, arg7, 2);
                                            if (var36.field9660 == 31) {
                                                class153 var37 = class428.field6168.method2732(arg7.method723((byte) -25), (byte) -25);
                                                var36.method3837(var37.field2599, var37.field2600, (byte) 88, var37.field2602, var37.field2603);
                                            }
                                            if (~arg3.method151() < -1) {
                                                class9 var38 = var36.field9658;
                                                int var39 = var38.method276(-1) >> 9;
                                                int var40 = var38.method270(arg4 ^ -60) >> 9;
                                                if (~var36.field9665 == ~arg2 && var39 >= var14 && var39 < var14 + 8 && ~var15 >= ~var40 && var40 < var15 + 8) {
                                                    int var41 = (arg8 << 9) + class508.method3013(var38.method276(arg4 + -5) & 4095, arg4 + -3, arg9, 4095 & var38.method270(arg4 ^ -70));
                                                    int var42 = var41 >> 9;
                                                    int var43 = (arg0 << 9) - -class680.method3821(4095 & var38.method276(arg4 ^ -5), arg9, var38.method270(arg4 ^ -104) & 4095, -103);
                                                    int var44 = var43 >> 9;
                                                    if (var42 >= 0 && var44 >= 0 && var42 < super.field2262 && ~super.field2274 < ~var44) {
                                                        var38.method272(super.field2264[arg2][var42][var44] + -var38.method273(false), var41, -1, var43);
                                                        class19.method434(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var13 = new class472(arg7);
                            }
                        }
                        if (var13 != null) {
                            class638.method3639(var13, arg8 >> 3, arg0 >> 3, -3534);
                        }
                        if (!var12 && super.field2273 != null && super.field2273[arg10] != null) {
                            int var16 = arg8 - -7;
                            int var17 = arg0 - -7;
                            for (int var18 = arg8; var16 > var18; ++var18) {
                                for (int var19 = arg0; ~var19 > ~var17; ++var19) {
                                    super.field2273[arg10][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([BII[Lfh;Lr;I)V")
    public final void method3785(byte[] arg0, int arg1, int arg2, class605[] arg3, class167 arg4, int arg5) {
        ++field9565;
        class61 var7 = new class61(arg0);
        int var8 = -1;
        if (arg5 != -65) {
            this.field9567 = 90;
        }
        while (true) {
            int var9 = var7.method703(128);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method752(arg5 + -27213);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method732(arg5 + -559537895);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = var13 - -arg1;
                int var19 = arg2 + var12;
                if (~var18 < -1 && var19 > 0 && ~var18 > ~(super.field2262 - 1) && ~var19 > ~(super.field2274 + -1)) {
                    class605 var20 = null;
                    if (!super.field2265) {
                        int var21 = var14;
                        if ((2 & class517.field7301[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method3783(var14, var20, arg4, var18, var19, -18839, var8, var17, var16, -1, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(FFIF)I")
    public static final int method3786(float arg0, float arg1, int arg2, float arg3) {
        ++field9560;
        if (arg2 != -4979) {
            method3780((byte) 43);
        }
        float var4 = !(arg3 < 0.0F) ? arg3 : -arg3;
        float var5 = !(arg0 < 0.0F) ? arg0 : -arg0;
        float var6 = !(arg1 < 0.0F) ? arg1 : -arg1;
        if (var5 > var4 && var6 < var5) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return !(arg1 > 0.0F) ? 3 : 2;
        } else {
            return !(arg3 > 0.0F) ? 5 : 4;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIZ)V")
    public class669(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class99.field1767, class1.field54);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lr;ZB)V")
    public final void method3787(class167 arg0, boolean arg1, byte arg2) {
        if (arg2 < -21) {
            ++field9562;
            class485.method2924();
            if (!arg1) {
                if (~super.field2258 < -2) {
                    for (int var4 = 0; super.field2262 > var4; ++var4) {
                        for (int var5 = 0; ~var5 > ~super.field2274; ++var5) {
                            if (~(class517.field7301[1][var4][var5] & 2) == -3) {
                                class248.method1674(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; ~super.field2258 < ~var6; ++var6) {
                    for (int var7 = 0; ~super.field2274 <= ~var7; ++var7) {
                        for (int var8 = 0; var8 <= super.field2262; ++var8) {
                            if ((super.field2266[var6][var8][var7] & 4) != 0) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (var11 > 0 && ~(super.field2266[var6][var8][var11 + -1] & 4) != -1 && ~(-var11 + var12) > -11) {
                                    --var11;
                                }
                                while (super.field2274 > var12 && (super.field2266[var6][var8][var12 + 1] & 4) != 0 && -var11 + var12 < 10) {
                                    ++var12;
                                }
                                label117: while (var9 > 0 && ~(-var9 + var10) > -11) {
                                    for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                        if ((4 & super.field2266[var6][var9 + -1][var13]) == 0) {
                                            break label117;
                                        }
                                    }
                                    --var9;
                                }
                                label104: while (super.field2262 > var10 && -var9 + var10 < 10) {
                                    for (int var14 = var11; ~var12 <= ~var14; ++var14) {
                                        if (~(super.field2266[var6][var10 + 1][var14] & 4) == -1) {
                                            break label104;
                                        }
                                    }
                                    ++var10;
                                }
                                if (~((-var9 + var10 + 1) * (-var11 + var12 + 1)) <= -5) {
                                    int var15 = super.field2264[var6][var9][var11];
                                    class574.method3298(false, 4, var9 << 9, var15, (var12 << 9) - -512, var15, var6, var11 << 9, (var10 << 9) - -512);
                                    for (int var16 = var9; ~var16 >= ~var10; ++var16) {
                                        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
                                            super.field2266[var6][var16][var17] = (byte) class481.method2919(super.field2266[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class640.method3645(false);
            }
            super.field2266 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3788(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
