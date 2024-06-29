import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class177 extends class1 {

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
    public int field2653 = 99;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "Lhi;")
    public static class45 field2658 = new class45(21, 8);

    @OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!pu", name = "R", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "Ldk;")
    public static class421 field2662;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pu", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field2665;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1217(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class157("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V", line = 3)
    public static void method1208(byte arg0) {
        field2662 = null;
        if (arg0 == 117) {
            field2658 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([ILza;Lsv;IIZ)V", line = 15)
    public final void method1209(int[] arg0, class295 arg1, class319 arg2, int arg3, int arg4, boolean arg5) {
        ++field2659;
        if (!super.field29) {
            boolean var7 = false;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            class382 var8 = null;
            while (true) {
                while (~arg2.field4336.length < ~arg2.field4360) {
                    int var18 = arg2.method1869(-92);
                    if (~var18 == -1) {
                        var8 = new class382(arg2);
                    } else if (var18 == 1) {
                        int var19 = arg2.method1869(-120);
                        if (var19 > 0) {
                            for (int var20 = 0; ~var19 < ~var20; ++var20) {
                                class433 var21 = new class433(arg1, arg2, 0);
                                if (~var21.field6272 == -32) {
                                    class118 var22 = class364.field5236.method2468(false, arg2.method1844(-115));
                                    var21.method2573(var22.field1849, var22.field1856, false, var22.field1850, var22.field1855);
                                }
                                if (~arg1.method502() < -1) {
                                    class447 var23 = var21.field6257;
                                    int var24 = var23.method2633(0) + (arg3 << 7);
                                    int var25 = (arg4 << 7) + var23.method2638(21981);
                                    int var26 = var24 >> 7;
                                    int var27 = var25 >> 7;
                                    if (~var26 <= -1 && var27 >= 0 && var26 < super.field28 && var27 < super.field3) {
                                        var23.method572(var24, var25, super.field6[var21.field6258][var26][var27] + -var23.method2640(-103), 29849);
                                        class433.method2571(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class382();
                        }
                        var8.method2271((byte) 24, arg2);
                    } else if (var18 == 128) {
                        if (arg0 != null) {
                            arg0[0] = arg2.method1844(-125);
                            arg0[1] = arg2.method1847(107);
                            arg0[2] = arg2.method1847(58);
                            arg0[3] = arg2.method1847(85);
                            arg0[4] = arg2.method1844(-105);
                        } else {
                            arg2.field4360 += 10;
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field10 == null) {
                            super.field10 = new byte[4][][];
                        }
                        for (int var28 = 0; var28 < 4; ++var28) {
                            byte var29 = arg2.method1894(-2018);
                            if (var29 == 0 && super.field10[var28] != null) {
                                int var30 = arg3;
                                int var31 = arg3 + 64;
                                int var32 = arg4;
                                if (arg4 >= 0) {
                                    if (~super.field3 >= ~arg4) {
                                        var32 = super.field3;
                                    }
                                } else {
                                    var32 = 0;
                                }
                                int var33 = arg4 + 64;
                                if (~var31 > -1) {
                                    var31 = 0;
                                } else if (~var31 <= ~super.field28) {
                                    var31 = super.field28;
                                }
                                if (arg3 < 0) {
                                    var30 = 0;
                                } else if (super.field28 <= arg3) {
                                    var30 = super.field28;
                                }
                                if (var33 >= 0) {
                                    if (super.field3 <= var33) {
                                        var33 = super.field3;
                                    }
                                } else {
                                    var33 = 0;
                                }
                                while (~var31 < ~var30) {
                                    while (var33 > var32) {
                                        super.field10[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 != -2) {
                                if (var29 == 2) {
                                    if (super.field10[var28] == null) {
                                        super.field10[var28] = new byte[super.field28 + 1][super.field3 + 1];
                                    }
                                    if (~var28 < -1) {
                                        int var34 = arg3;
                                        int var35 = arg3 + 64;
                                        int var36 = arg4;
                                        if (arg4 < 0) {
                                            var36 = 0;
                                        } else if (~arg4 <= ~super.field3) {
                                            var36 = super.field3;
                                        }
                                        if (var35 >= 0) {
                                            if (~var35 <= ~super.field28) {
                                                var35 = super.field28;
                                            }
                                        } else {
                                            var35 = 0;
                                        }
                                        if (arg3 >= 0) {
                                            if (~super.field28 >= ~arg3) {
                                                var34 = super.field28;
                                            }
                                        } else {
                                            var34 = 0;
                                        }
                                        int var37 = arg4 + 64;
                                        if (var37 >= 0) {
                                            if (~super.field3 >= ~var37) {
                                                var37 = super.field3;
                                            }
                                        } else {
                                            var37 = 0;
                                        }
                                        while (~var34 > ~var35) {
                                            while (var36 < var37) {
                                                super.field10[var28][var34][var36] = super.field10[var28 - 1][var34][var36];
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                }
                            } else {
                                if (super.field10[var28] == null) {
                                    super.field10[var28] = new byte[super.field28 + 1][super.field3 - -1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg2.method1894(-2018);
                                        for (int var41 = arg3 + var38; var38 - -arg3 + 4 > var41; ++var41) {
                                            for (int var42 = arg4 + var39; ~var42 > ~(var39 + 4 + arg4); ++var42) {
                                                if (~var41 <= -1 && var41 < super.field28 && ~var42 <= -1 && ~super.field3 < ~var42) {
                                                    super.field10[var28][var41][var42] = var40;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (!arg5) {
                    this.method1209((int[]) null, (class295) null, (class319) null, 77, -50, false);
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg3 >> 3) + var9;
                            int var12 = (arg4 >> 3) - -var10;
                            if (~var11 <= -1 && ~(super.field28 >> 3) < ~var11 && var12 >= 0 && super.field3 >> 3 > var12) {
                                class156.method1121(var12, 32, var8, var11);
                            }
                        }
                    }
                }
                if (!var7 && super.field10 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field10[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg3 >> 2) + var14;
                                    int var17 = (arg4 >> 2) + var15;
                                    if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                        super.field10[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(IIIZ)V", line = 1510)
    public class177(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class230.field3223, class72.field1035);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BIILet;IILza;)V", line = 392)
    public final void method1210(byte arg0, int arg1, int arg2, class466 arg3, int arg4, int arg5, class295 arg6) {
        if (arg0 != -62) {
            this.method1215((byte) -30, (class295) null);
        }
        ++field2661;
        class303 var8 = null;
        if (arg1 == 0) {
            var8 = (class303) class191.method1267(arg4, arg5, arg2);
        }
        if (~arg1 == -2) {
            var8 = (class303) class506.method3004(arg4, arg5, arg2);
        }
        if (arg1 == 2) {
            var8 = (class303) class377.method2254(arg4, arg5, arg2, field2665 != null ? field2665 : (field2665 = method1217("bn")));
        }
        if (~arg1 == -4) {
            var8 = (class303) class126.method913(arg4, arg5, arg2);
        }
        if (var8 != null) {
            class103 var9 = class452.field6629.method603((byte) 111, var8.method170((byte) 122));
            int var10 = var8.method159(arg0 ^ 77);
            int var11 = var8.method157((byte) -22);
            if (var9.method803(21922)) {
                class441.method2608(arg4, arg2, (byte) -91, arg5, var9);
            }
            if (var8.method160((byte) 112)) {
                var8.method156(arg6, -123);
            }
            if (~arg1 == -1) {
                class168 var12 = class191.method1267(arg4, arg5, arg2);
                if (var12 instanceof class503) {
                    ((class503) var12).field7360 = null;
                } else {
                    class291.method1689(arg4, arg5, arg2);
                }
                if (var9.field1663 != 0) {
                    arg3.method2703(var11, arg2, (byte) -122, arg5, var9.field1693, !var9.field1698, var10);
                    return;
                }
            } else if (arg1 != 1) {
                if (~arg1 == -3) {
                    class434 var13 = class377.method2254(arg4, arg5, arg2, field2665 != null ? field2665 : (field2665 = method1217("bn")));
                    if (var13 instanceof class214 && ~var13.field6290 == ~arg5 && ~var13.field6277 == ~arg2) {
                        ((class214) var13).field3049 = null;
                    } else {
                        class45.method301(arg4, arg5, arg2, field2665 != null ? field2665 : (field2665 = method1217("bn")));
                    }
                    if (var9.field1663 != 0 && var9.field1639 + arg5 < super.field28 && super.field3 > var9.field1639 + arg2 && var9.field1695 + arg5 < super.field28 && var9.field1695 + arg2 < super.field3) {
                        arg3.method2702(var9.field1695, var11, arg2, !var9.field1698, arg5, var9.field1693, -63, var9.field1639);
                        return;
                    }
                    return;
                }
                if (~arg1 == -4) {
                    class167 var14 = class126.method913(arg4, arg5, arg2);
                    if (var14 instanceof class284) {
                        ((class284) var14).field3843 = null;
                    } else {
                        class510.method3023(arg4, arg5, arg2);
                    }
                    if (var9.field1663 == 1) {
                        arg3.method2710(arg2, arg5, -262145);
                        return;
                    }
                }
            } else {
                class63 var15 = class506.method3004(arg4, arg5, arg2);
                if (var15 instanceof class528) {
                    ((class528) var15).field7712 = null;
                    return;
                }
                class467.method2719(arg4, arg5, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILsv;ILza;[IIIIII)V", line = 505)
    public final void method1211(int arg0, int arg1, class319 arg2, int arg3, class295 arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2660;
        if (!super.field29) {
            boolean var12 = false;
            class382 var13 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            int var14 = (arg0 & 7) * 8;
            int var15 = (7 & arg3) * 8;
            if (arg9 <= 13) {
                this.method1216((byte[]) null, -21, -116, -78, 39, -63, 123, (class295) null, 112, true, (class466[]) null);
            }
            while (true) {
                while (~arg2.field4360 > ~arg2.field4336.length) {
                    int var20 = arg2.method1869(-125);
                    if (~var20 == -1) {
                        var13 = new class382(arg2);
                    } else if (~var20 == -2) {
                        int var34 = arg2.method1869(-82);
                        if (var34 > 0) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class433 var36 = new class433(arg4, arg2, 0);
                                if (~var36.field6272 == -32) {
                                    class118 var37 = class364.field5236.method2468(false, arg2.method1844(-106));
                                    var36.method2573(var37.field1849, var37.field1856, false, var37.field1850, var37.field1855);
                                }
                                if (~arg4.method502() < -1) {
                                    class447 var38 = var36.field6257;
                                    int var39 = var38.method2633(0) >> 7;
                                    int var40 = var38.method2638(21981) >> 7;
                                    if (~var36.field6258 == ~arg1 && ~var14 >= ~var39 && var14 + 8 > var39 && ~var40 <= ~var15 && ~(var15 + 8) < ~var40) {
                                        int var41 = class508.method3011(var38.method2633(0) & 1023, arg7, var38.method2638(21981) & 1023, -1) + (arg6 << 7);
                                        int var42 = class370.method2207(1023 & var38.method2638(21981), arg7, 1023 & var38.method2633(0), true) + (arg10 << 7);
                                        int var43 = var41 >> 7;
                                        int var44 = var42 >> 7;
                                        if (var43 >= 0 && ~var44 <= -1 && var43 < super.field28 && ~super.field3 < ~var44) {
                                            var38.method572(var41, var42, super.field6[arg1][var43][var44] + -var38.method2640(-81), 29849);
                                            class433.method2571(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class382();
                        }
                        var13.method2271((byte) 24, arg2);
                    } else if (var20 == 128) {
                        if (arg5 == null) {
                            arg2.field4360 += 10;
                        } else {
                            arg5[0] = arg2.method1844(-104);
                            arg5[1] = arg2.method1847(104);
                            arg5[2] = arg2.method1847(96);
                            arg5[3] = arg2.method1847(109);
                            arg5[4] = arg2.method1844(-127);
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field10 == null) {
                            super.field10 = new byte[4][][];
                        }
                        for (int var21 = 0; ~var21 > -5; ++var21) {
                            byte var22 = arg2.method1894(-2018);
                            if (~var22 == -1 && super.field10[arg8] != null) {
                                if (arg1 >= var21) {
                                    int var23 = arg6;
                                    int var24 = arg6 + 7;
                                    int var25 = arg10;
                                    if (~arg6 <= -1) {
                                        if (~arg6 <= ~super.field28) {
                                            var23 = super.field28;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    int var26 = arg10 - -7;
                                    if (~var24 <= -1) {
                                        if (~var24 <= ~super.field28) {
                                            var24 = super.field28;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (arg10 >= 0) {
                                        if (super.field3 <= arg10) {
                                            var25 = super.field3;
                                        }
                                    } else {
                                        var25 = 0;
                                    }
                                    if (var26 >= 0) {
                                        if (var26 >= super.field3) {
                                            var26 = super.field3;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (var24 > var23) {
                                        while (~var26 < ~var25) {
                                            super.field10[arg8][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (var22 == 1) {
                                if (super.field10[arg8] == null) {
                                    super.field10[arg8] = new byte[super.field28 + 1][super.field3 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg2.method1894(-2018);
                                        if (~arg1 <= ~var21) {
                                            for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                for (int var31 = var28; ~(var28 + 4) < ~var31; ++var31) {
                                                    if (var14 <= var30 && var30 < var14 + 8 && var31 >= var15 && ~(var15 + 8) < ~var15) {
                                                        int var32 = arg6 + class265.method1556(var31 & 7, var30 & 7, arg7, true);
                                                        int var33 = arg10 + class530.method3138((byte) 120, var31 & 7, 7 & var30, arg7);
                                                        if (var32 >= 0 && var32 < super.field28 && ~var33 <= -1 && var33 < super.field3) {
                                                            super.field10[arg8][var32][var33] = var29;
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
                    class156.method1121(arg10 >> 3, 32, var13, arg6 >> 3);
                }
                if (!var12 && super.field10 != null && super.field10[arg8] != null) {
                    int var16 = arg6 + 7;
                    int var17 = arg10 + 7;
                    for (int var18 = arg6; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg10; var17 > var19; ++var19) {
                            super.field10[arg8][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIIIILza;ILet;)V", line = 799)
    public final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class295 arg8, int arg9, class466 arg10) {
        ++field2655;
        if (class76.field1075.method1104(class195.field2849, 0) || class104.method811(arg1 ^ 17736, arg4, class315.field4267, arg9, arg5)) {
            if (~arg3 > ~this.field2653) {
                this.field2653 = arg3;
            }
            class103 var12 = class452.field6629.method603((byte) 94, arg7);
            if (!arg8.method475() || !class76.field1075.field3677 || !var12.field1628) {
                int var13;
                int var14;
                if (~arg2 != -2 && ~arg2 != -4) {
                    var13 = var12.field1639;
                    var14 = var12.field1695;
                } else {
                    var13 = var12.field1695;
                    var14 = var12.field1639;
                }
                int var15;
                int var16;
                if (~super.field28 <= ~(arg5 + var13)) {
                    var15 = (var13 + 1 >> 1) + arg5;
                    var16 = arg5 - -(var13 >> 1);
                } else {
                    var16 = arg5;
                    var15 = arg5 + 1;
                }
                int var17;
                int var18;
                if (~(arg9 - -var14) < ~super.field3) {
                    var17 = arg9 - -1;
                    var18 = arg9;
                } else {
                    var17 = (var14 + 1 >> 1) + arg9;
                    var18 = (var14 >> 1) + arg9;
                }
                class11 var19 = class492.field7122[arg4];
                int var20 = var19.method85(var16, var18) + var19.method85(var15, var18) + (var19.method85(var16, var17) - -var19.method85(var15, var17)) >> 2;
                int var21 = (arg5 << 7) + (var13 << 6);
                int var22 = (arg9 << 7) + (var14 << 6);
                boolean var23 = class523.field7655 && !super.field29 && var12.field1682;
                if (var12.method803(21922)) {
                    class461.method2683(arg9, arg5, var12, arg2, (class209) null, (class487) null, arg3, arg1 + -22664);
                }
                if (arg1 != 17718) {
                    field2664 = -87;
                }
                boolean var24 = arg0 == -1 && ~var12.field1648 == 0 && var12.field1659 == null && var12.field1613 == null && !var12.field1658;
                if (!class419.field6065 || (!class265.method1559(arg6, 105) || ~var12.field1662 == -2) && (!class414.method2436((byte) -97, arg6) || ~var12.field1662 != -1)) {
                    if (~arg6 == -23) {
                        if (class76.field1075.field3667 || ~var12.field1697 != -1 || ~var12.field1663 == -2 || var12.field1623) {
                            class167 var26;
                            if (var24) {
                                class26 var25 = new class26(arg8, var12, arg4, var21, var20, var22, super.field29, arg2, var23);
                                if (var25.method160((byte) 112)) {
                                    var25.method164(arg8, 1907);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class133(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg2, arg0);
                            }
                            class167 var27 = class126.method913(arg3, arg5, arg9);
                            if (var27 instanceof class284) {
                                ((class284) var27).field3843 = var26;
                            } else {
                                class141.method987(arg3, arg5, arg9, var26);
                            }
                            if (var12.field1663 == 1 && arg10 != null) {
                                arg10.method2715(arg5, arg9, (byte) -29);
                            }
                        }
                    } else if (~arg6 != -11 && arg6 != 11) {
                        if (~arg6 <= -13 && ~arg6 >= -18 || ~arg6 <= -19 && arg6 <= 21) {
                            class434 var29;
                            if (var24) {
                                class425 var28 = new class425(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg5, arg5 + var13 + -1, arg9, arg9 - 1 + var14, arg6, arg2, var23);
                                if (var28.method160((byte) 112)) {
                                    var28.method164(arg8, 1907);
                                }
                                var29 = var28;
                            } else {
                                var29 = new class276(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg5, arg5 - -var13 + -1, arg9, arg9 + -1 + var14, arg6, arg2, arg0);
                            }
                            class434 var30 = class377.method2254(arg3, arg5, arg9, field2665 != null ? field2665 : (field2665 = method1217("bn")));
                            if (var30 instanceof class214 && ~var30.field6290 == ~arg5 && var30.field6277 == arg9) {
                                ((class214) var30).field3049 = var29;
                            } else {
                                class112.method848(var29, false);
                            }
                            if (class523.field7655 && !super.field29 && ~arg6 <= -13 && arg6 <= 17 && ~arg6 != -14 && arg3 > 0 && ~var12.field1662 != -1) {
                                super.field12[arg3][arg5][arg9] = (byte) class219.method1367(super.field12[arg3][arg5][arg9], 4);
                            }
                            if (var12.field1663 != 0 && arg10 != null) {
                                arg10.method2701(256, var14, arg5, var12.field1693, var13, arg9, !var12.field1698);
                            }
                        } else if (arg6 == 0) {
                            int var31 = var12.field1662;
                            if (class143.field2122 && var12.field1662 == -1) {
                                var31 = 1;
                            }
                            class168 var32;
                            if (!var24) {
                                var32 = new class172(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg6, arg2, arg0);
                            } else {
                                class125 var33 = new class125(arg8, var12, arg4, var21, var20, var22, super.field29, arg6, arg2, var23);
                                if (var33.method160((byte) 112)) {
                                    var33.method164(arg8, 1907);
                                }
                                var32 = var33;
                            }
                            class168 var34 = class191.method1267(arg3, arg5, arg9);
                            if (var34 instanceof class503) {
                                ((class503) var34).field7360 = var32;
                            } else {
                                class5.method32(arg3, arg5, arg9, var32, (class168) null);
                            }
                            if (class523.field7655) {
                                if (arg2 != 0) {
                                    if (~arg2 != -2) {
                                        if (~arg2 == -3) {
                                            if (var12.field1666) {
                                                var19.method77(arg5 + 1, arg9, 50);
                                                var19.method77(arg5 + 1, arg9 + 1, 50);
                                            }
                                            if (~var31 == -2 && !super.field29) {
                                                super.field12[arg3][arg5 + 1][arg9] = (byte) class219.method1367(super.field12[arg3][arg5 + 1][arg9], 1);
                                            }
                                        } else if (~arg2 == -4) {
                                            if (var12.field1666) {
                                                var19.method77(arg5, arg9, 50);
                                                var19.method77(arg5 - -1, arg9, 50);
                                            }
                                            if (~var31 == -2 && !super.field29) {
                                                super.field12[arg3][arg5][arg9] = (byte) class219.method1367(super.field12[arg3][arg5][arg9], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field1666) {
                                            var19.method77(arg5, arg9 + 1, 50);
                                            var19.method77(arg5 - -1, arg9 - -1, 50);
                                        }
                                        if (~var31 == -2 && !super.field29) {
                                            super.field12[arg3][arg5][arg9 + 1] = (byte) class219.method1367(super.field12[arg3][arg5][arg9 + 1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field1666) {
                                        var19.method77(arg5, arg9, 50);
                                        var19.method77(arg5, arg9 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field29) {
                                        super.field12[arg3][arg5][arg9] = (byte) class219.method1367(super.field12[arg3][arg5][arg9], 1);
                                    }
                                }
                            }
                            if (var12.field1663 != 0 && arg10 != null) {
                                arg10.method2706(arg6, arg2, !var12.field1698, var12.field1693, arg9, 0, arg5);
                            }
                            if (~var12.field1645 != -17) {
                                class508.method3009(arg3, arg5, arg9, var12.field1645);
                            }
                        } else if (arg6 == 1) {
                            class168 var35;
                            if (!var24) {
                                var35 = new class172(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg6, arg2, arg0);
                            } else {
                                class125 var36 = new class125(arg8, var12, arg4, var21, var20, var22, super.field29, arg6, arg2, var23);
                                var35 = var36;
                                if (var36.method160((byte) 112)) {
                                    var36.method164(arg8, arg1 ^ 16965);
                                }
                            }
                            class168 var37 = class191.method1267(arg3, arg5, arg9);
                            if (var37 instanceof class503) {
                                ((class503) var37).field7360 = var35;
                            } else {
                                class5.method32(arg3, arg5, arg9, var35, (class168) null);
                            }
                            if (var12.field1666 && class523.field7655) {
                                if (arg2 != 0) {
                                    if (arg2 != 1) {
                                        if (~arg2 != -3) {
                                            if (arg2 == 3) {
                                                var19.method77(arg5, arg9, 50);
                                            }
                                        } else {
                                            var19.method77(arg5 + 1, arg9, 50);
                                        }
                                    } else {
                                        var19.method77(arg5 + 1, arg9 + 1, 50);
                                    }
                                } else {
                                    var19.method77(arg5, arg9 - -1, 50);
                                }
                            }
                            if (~var12.field1663 != -1 && arg10 != null) {
                                arg10.method2706(arg6, arg2, !var12.field1698, var12.field1693, arg9, 0, arg5);
                            }
                        } else if (~arg6 == -3) {
                            int var38 = 3 & arg2 - -1;
                            class168 var41;
                            class168 var42;
                            if (var24) {
                                class125 var39 = new class125(arg8, var12, arg4, var21, var20, var22, super.field29, arg6, arg2 + 4, var23);
                                class125 var40 = new class125(arg8, var12, arg4, var21, var20, var22, super.field29, arg6, var38, var23);
                                if (var39.method160((byte) 112)) {
                                    var39.method164(arg8, arg1 + -15811);
                                }
                                var41 = var39;
                                if (var40.method160((byte) 112)) {
                                    var40.method164(arg8, arg1 ^ 16965);
                                }
                                var42 = var40;
                            } else {
                                var41 = new class172(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg6, arg2 + 4, arg0);
                                var42 = new class172(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg6, var38, arg0);
                            }
                            class5.method32(arg3, arg5, arg9, var41, var42);
                            if (var12.field1662 == 1 && class523.field7655 && !super.field29) {
                                if (arg2 != 0) {
                                    if (~arg2 == -2) {
                                        super.field12[arg3][arg5][arg9 - -1] = (byte) class219.method1367(super.field12[arg3][arg5][arg9 - -1], 2);
                                        super.field12[arg3][arg5 + 1][arg9] = (byte) class219.method1367(super.field12[arg3][arg5 + 1][arg9], 1);
                                    } else if (arg2 == 2) {
                                        super.field12[arg3][arg5 + 1][arg9] = (byte) class219.method1367(super.field12[arg3][arg5 + 1][arg9], 1);
                                        super.field12[arg3][arg5][arg9] = (byte) class219.method1367(super.field12[arg3][arg5][arg9], 2);
                                    } else if (arg2 == 3) {
                                        super.field12[arg3][arg5][arg9] = (byte) class219.method1367(super.field12[arg3][arg5][arg9], 2);
                                        super.field12[arg3][arg5][arg9] = (byte) class219.method1367(super.field12[arg3][arg5][arg9], 1);
                                    }
                                } else {
                                    super.field12[arg3][arg5][arg9] = (byte) class219.method1367(super.field12[arg3][arg5][arg9], 1);
                                    super.field12[arg3][arg5][arg9 + 1] = (byte) class219.method1367(super.field12[arg3][arg5][arg9 + 1], 2);
                                }
                            }
                            if (var12.field1663 != 0 && arg10 != null) {
                                arg10.method2706(arg6, arg2, !var12.field1698, var12.field1693, arg9, 0, arg5);
                            }
                            if (~var12.field1645 != -17) {
                                class508.method3009(arg3, arg5, arg9, var12.field1645);
                            }
                        } else if (arg6 == 3) {
                            class168 var44;
                            if (var24) {
                                class125 var43 = new class125(arg8, var12, arg4, var21, var20, var22, super.field29, arg6, arg2, var23);
                                if (var43.method160((byte) 112)) {
                                    var43.method164(arg8, arg1 ^ 16965);
                                }
                                var44 = var43;
                            } else {
                                var44 = new class172(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg6, arg2, arg0);
                            }
                            class168 var45 = class191.method1267(arg3, arg5, arg9);
                            if (var45 instanceof class503) {
                                ((class503) var45).field7360 = var44;
                            } else {
                                class5.method32(arg3, arg5, arg9, var44, (class168) null);
                            }
                            if (var12.field1666 && class523.field7655) {
                                if (~arg2 != -1) {
                                    if (arg2 != 1) {
                                        if (~arg2 == -3) {
                                            var19.method77(arg5 + 1, arg9, 50);
                                        } else if (~arg2 == -4) {
                                            var19.method77(arg5, arg9, 50);
                                        }
                                    } else {
                                        var19.method77(arg5 - -1, arg9 - -1, 50);
                                    }
                                } else {
                                    var19.method77(arg5, arg9 + 1, 50);
                                }
                            }
                            if (~var12.field1663 != -1 && arg10 != null) {
                                arg10.method2706(arg6, arg2, !var12.field1698, var12.field1693, arg9, arg1 + -17718, arg5);
                            }
                        } else if (~arg6 == -10) {
                            class434 var47;
                            if (var24) {
                                class425 var46 = new class425(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg5, arg5, arg9, arg9, arg6, arg2, var23);
                                var47 = var46;
                                if (var46.method160((byte) 112)) {
                                    var46.method164(arg8, 1907);
                                }
                            } else {
                                var47 = new class276(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg5, arg5 - -var13 + -1, arg9, arg9 + var14 + -1, arg6, arg2, arg0);
                            }
                            class434 var48 = class377.method2254(arg3, arg5, arg9, field2665 != null ? field2665 : (field2665 = method1217("bn")));
                            if (var48 instanceof class214 && ~var48.field6290 == ~arg5 && ~var48.field6277 == ~arg9) {
                                ((class214) var48).field3049 = var47;
                            } else {
                                class112.method848(var47, false);
                            }
                            if (~var12.field1663 != -1 && arg10 != null) {
                                arg10.method2701(256, var14, arg5, var12.field1693, var13, arg9, !var12.field1698);
                            }
                            if (~var12.field1645 != -17) {
                                class508.method3009(arg3, arg5, arg9, var12.field1645);
                            }
                        } else if (~arg6 == -5) {
                            class63 var49;
                            if (!var24) {
                                var49 = new class68(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, 0, 0, 0, arg6, arg2, arg0);
                            } else {
                                class411 var50 = new class411(arg8, var12, arg4, var21, var20, var22, super.field29, 0, 0, 0, arg6, arg2);
                                var49 = var50;
                                if (var50.method160((byte) 112)) {
                                    var50.method164(arg8, 1907);
                                }
                            }
                            class63 var51 = class506.method3004(arg3, arg5, arg9);
                            if (!(var51 instanceof class528)) {
                                class258.method1535(arg3, arg5, arg9, var49, (class63) null);
                            } else {
                                ((class528) var51).field7712 = var49;
                            }
                        } else if (~arg6 == -6) {
                            int var52 = 17;
                            class303 var53 = (class303) class191.method1267(arg3, arg5, arg9);
                            if (var53 != null) {
                                var52 = class452.field6629.method603((byte) 114, var53.method170((byte) 72)).field1645 - -1;
                            }
                            class63 var54;
                            if (!var24) {
                                var54 = new class68(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, 0, class316.field4304[arg2] * var52, class316.field4300[arg2] * var52, arg6, arg2, arg0);
                            } else {
                                class411 var55 = new class411(arg8, var12, arg4, var21, var20, var22, super.field29, 0, class316.field4304[arg2] * var52, class316.field4300[arg2] * var52, arg6, arg2);
                                if (var55.method160((byte) 112)) {
                                    var55.method164(arg8, arg1 ^ 16965);
                                }
                                var54 = var55;
                            }
                            class63 var56 = class506.method3004(arg3, arg5, arg9);
                            if (!(var56 instanceof class528)) {
                                class258.method1535(arg3, arg5, arg9, var54, (class63) null);
                            } else {
                                ((class528) var56).field7712 = var54;
                            }
                        } else if (~arg6 == -7) {
                            int var57 = 9;
                            class303 var58 = (class303) class191.method1267(arg3, arg5, arg9);
                            if (var58 != null) {
                                var57 = 1 + class452.field6629.method603((byte) 127, var58.method170((byte) 74)).field1645 / 2;
                            }
                            class63 var60;
                            if (var24) {
                                class411 var59 = new class411(arg8, var12, arg4, var21, var20, var22, super.field29, arg2, class316.field4304[arg2] * var57, class316.field4300[arg2] * var57, arg6, arg2 + 4);
                                if (var59.method160((byte) 112)) {
                                    var59.method164(arg8, 1907);
                                }
                                var60 = var59;
                            } else {
                                var60 = new class68(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg2, class274.field3722[arg2] * var57, class60.field870[arg2] * var57, arg6, arg2 - -4, arg0);
                            }
                            class63 var61 = class506.method3004(arg3, arg5, arg9);
                            if (!(var61 instanceof class528)) {
                                class258.method1535(arg3, arg5, arg9, var60, (class63) null);
                            } else {
                                ((class528) var61).field7712 = var60;
                            }
                        } else if (arg6 == 7) {
                            int var62 = 3 & arg2 - -2;
                            class63 var64;
                            if (var24) {
                                class411 var63 = new class411(arg8, var12, arg4, var21, var20, var22, super.field29, var62, 0, 0, arg6, var62 + 4);
                                if (var63.method160((byte) 112)) {
                                    var63.method164(arg8, 1907);
                                }
                                var64 = var63;
                            } else {
                                var64 = new class68(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, var62, 0, 0, arg6, var62 - -4, arg0);
                            }
                            class63 var65 = class506.method3004(arg3, arg5, arg9);
                            if (!(var65 instanceof class528)) {
                                class258.method1535(arg3, arg5, arg9, var64, (class63) null);
                            } else {
                                ((class528) var65).field7712 = var64;
                            }
                        } else if (arg6 == 8) {
                            int var66 = 3 & arg2 + 2;
                            int var67 = 9;
                            class303 var68 = (class303) class191.method1267(arg3, arg5, arg9);
                            if (var68 != null) {
                                var67 = 1 + class452.field6629.method603((byte) 124, var68.method170((byte) -82)).field1645 / 2;
                            }
                            class63 var71;
                            class63 var72;
                            if (var24) {
                                class411 var69 = new class411(arg8, var12, arg4, var21, var20, var22, super.field29, arg2, class274.field3722[arg2] * var67, class60.field870[arg2] * var67, arg6, arg2 - -4);
                                class411 var70 = new class411(arg8, var12, arg4, var21, var20, var22, super.field29, arg2, 0, 0, arg6, var66 + 4);
                                if (var69.method160((byte) 112)) {
                                    var69.method164(arg8, 1907);
                                }
                                var71 = var70;
                                if (var70.method160((byte) 112)) {
                                    var70.method164(arg8, arg1 + -15811);
                                }
                                var72 = var69;
                            } else {
                                class68 var73 = new class68(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg2, class274.field3722[arg2] * var67, class60.field870[arg2] * var67, arg6, arg2 + 4, arg0);
                                class68 var74 = new class68(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg2, 0, 0, arg6, var66 - -4, arg0);
                                var72 = var73;
                                var71 = var74;
                            }
                            class258.method1535(arg3, arg5, arg9, var72, var71);
                        }
                    } else {
                        class425 var75 = null;
                        int var76;
                        class434 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class276(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg5, arg5 - -var13 + -1, arg9, arg9 - (-var14 - -1), arg6, arg2, arg0);
                        } else {
                            class425 var78 = new class425(arg8, var12, arg3, arg4, var21, var20, var22, super.field29, arg5, arg5 - 1 + var13, arg9, arg9 + var14 + -1, arg6, arg2, var23);
                            var76 = var78.method2537((byte) -99);
                            var75 = var78;
                            var77 = var78;
                        }
                        class434 var79 = class377.method2254(arg3, arg5, arg9, field2665 != null ? field2665 : (field2665 = method1217("bn")));
                        boolean var80 = false;
                        if (var79 instanceof class214 && ~var79.field6290 == ~arg5 && ~var79.field6277 == ~arg9) {
                            ((class214) var79).field3049 = var77;
                            var80 = true;
                        }
                        if (var80 || class112.method848(var77, false)) {
                            if (var75 != null && var75.method160((byte) 112)) {
                                var75.method164(arg8, 1907);
                            }
                            if (var12.field1666 && class523.field7655) {
                                if (var76 > 30) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; var13 >= var81; ++var81) {
                                    for (int var82 = 0; var14 >= var82; ++var82) {
                                        var19.method77(arg5 + var81, arg9 + var82, var76);
                                    }
                                }
                            }
                        }
                        if (var12.field1663 != 0 && arg10 != null) {
                            arg10.method2701(arg1 + -17462, var14, arg5, var12.field1693, var13, arg9, !var12.field1698);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZII)Lmc;", line = 1515)
    public static final class314 method1213(boolean arg0, int arg1, int arg2) {
        ++field2656;
        if (arg0) {
            return null;
        } else {
            class314 var3 = (class314) class49.field691.method1592((byte) -25, (long) arg2 | (long) arg1 << 32);
            if (var3 == null) {
                var3 = new class314(arg1, arg2);
                class49.field691.method1586(var3, var3.field6883, 1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB[BILza;[Let;)V", line = 1535)
    public final void method1214(int arg0, byte arg1, byte[] arg2, int arg3, class295 arg4, class466[] arg5) {
        ++field2657;
        class319 var7 = new class319(arg2);
        int var8 = -1;
        int var9 = 66 % ((-16 - arg1) / 44);
        while (true) {
            int var10 = var7.method1883(-32768);
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method1877(122);
                if (~var12 == -1) {
                    break;
                }
                var11 += var12 + -1;
                int var13 = 63 & var11;
                int var14 = (4068 & var11) >> 6;
                int var15 = var11 >> 12;
                int var16 = var7.method1869(-66);
                int var17 = var16 >> 2;
                int var18 = 3 & var16;
                int var19 = arg3 + var14;
                int var20 = arg0 + var13;
                if (~var19 < -1 && ~var20 < -1 && ~var19 > ~(super.field28 + -1) && ~var20 > ~(super.field3 + -1)) {
                    class466 var21 = null;
                    if (!super.field29) {
                        int var22 = var15;
                        if (~(2 & class27.field379[1][var19][var20]) == -3) {
                            var22 = var15 - 1;
                        }
                        if (~var22 <= -1) {
                            var21 = arg5[var22];
                        }
                    }
                    this.method1212(-1, 17718, var18, var15, var15, var19, var17, var8, arg4, var20, var21);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLza;)V", line = 1615)
    public final void method1215(byte arg0, class295 arg1) {
        class285.method1637(arg1);
        ++field2663;
        if (super.field17 > 1) {
            for (int var3 = 0; var3 < super.field28; ++var3) {
                for (int var4 = 0; ~super.field3 < ~var4; ++var4) {
                    if (~(class27.field379[1][var3][var4] & 2) == -3) {
                        class382.method2267(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~super.field17 < ~var5; ++var5) {
            for (int var6 = 0; ~var6 >= ~super.field3; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field28; ++var7) {
                    if (~(super.field12[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (var9 < super.field3 && (1 & super.field12[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        while (~var8 < -1 && ~(super.field12[var5][var7][var8 + -1] & 1) != -1) {
                            --var8;
                        }
                        label170: while (~var10 < -1) {
                            for (int var12 = var8; var9 >= var12; ++var12) {
                                if (~(1 & super.field12[var10 - 1][var7][var12]) == -1) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (~var11 > -4) {
                            for (int var13 = var8; var13 <= var9; ++var13) {
                                if ((1 & super.field12[var11 - -1][var7][var13]) == 0) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 - (var8 - 1)) * (-var10 + 1 + var11);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field6[var11][var7][var8] + -var15;
                            int var17 = super.field6[var10][var7][var8];
                            class232.method1421(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; ~var18 >= ~var11; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field12[var18][var7][var19] = (byte) class375.method2245(super.field12[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((super.field12[var5][var7][var6] & 2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && ~(super.field12[var5][var20 - 1][var6] & 2) != -1) {
                            --var20;
                        }
                        int var23 = var5;
                        while (~super.field28 < ~var21 && ~(2 & super.field12[var5][var21 + 1][var6]) != -1) {
                            ++var21;
                        }
                        label223: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if ((super.field12[var22 - 1][var24][var6] & 2) == 0) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (var23 < 3) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if ((2 & super.field12[var23 + 1][var25][var6]) == 0) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 - -1 + -var22) * (-var20 + var21 + 1);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = super.field6[var23][var20][var6] - var27;
                            int var29 = super.field6[var22][var20][var6];
                            class232.method1421(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; var21 >= var31; ++var31) {
                                    super.field12[var30][var31][var6] = (byte) class375.method2245(super.field12[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(super.field12[var5][var7][var6] & 4) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (super.field12[var5][var7][var34 + -1] & 4) != 0) {
                            --var34;
                        }
                        while (~super.field3 < ~var35 && ~(4 & super.field12[var5][var7][var35 - -1]) != -1) {
                            ++var35;
                        }
                        label277: while (~var32 < -1) {
                            for (int var36 = var34; var36 <= var35; ++var36) {
                                if ((super.field12[var5][var32 + -1][var36] & 4) == 0) {
                                    break label277;
                                }
                            }
                            --var32;
                        }
                        label266: while (var33 < super.field28) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if ((super.field12[var5][var33 + 1][var37] & 4) == 0) {
                                    break label266;
                                }
                            }
                            ++var33;
                        }
                        if ((-var32 + 1 + var33) * (-var34 + var35 + 1) >= 4) {
                            int var38 = super.field6[var5][var32][var34];
                            class232.method1421(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; var35 >= var40; ++var40) {
                                    super.field12[var5][var39][var40] = (byte) class375.method2245(super.field12[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field12 = null;
        if (arg0 != -120) {
            field2664 = -26;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([BIIIIIILza;IZ[Let;)V", line = 1909)
    public final void method1216(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class295 arg7, int arg8, boolean arg9, class466[] arg10) {
        if (arg9) {
            this.field2653 = 43;
        }
        ++field2652;
        class319 var12 = new class319(arg0);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1883(-32768);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1877(121);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1869(-122);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg4 == ~var19 && ~var18 <= ~arg3 && ~var18 > ~(arg3 + 8) && ~arg6 >= ~var17 && var17 < arg6 + 8) {
                    class103 var23 = class452.field6629.method603((byte) 115, var13);
                    int var24 = class374.method2242(var22, var17 & 7, var23.field1695, var23.field1639, true, arg2, 7 & var18) + arg1;
                    int var25 = arg5 - -class114.method859(var22, arg2, var17 & 7, var23.field1695, var18 & 7, var23.field1639, 160);
                    if (var24 > 0 && ~var25 < -1 && super.field28 + -1 > var24 && ~(super.field3 + -1) < ~var25) {
                        class466 var26 = null;
                        if (!super.field29) {
                            int var27 = arg8;
                            if ((class27.field379[1][var24][var25] & 2) == 2) {
                                var27 = arg8 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg10[var27];
                            }
                        }
                        this.method1212(-1, 17718, arg2 + var22 & 3, arg8, arg8, var24, var21, var13, arg7, var25, var26);
                    }
                }
            }
        }
    }
}
