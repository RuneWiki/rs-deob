import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class51 extends class196 {

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
    public int field668 = 99;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!kt", name = "R", descriptor = "I")
    public static int field671;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kt", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field672;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
    public static final void method269(int[] arg0, int arg1, Object[] arg2) {
        class212.method1180(arg0.length + -1, (byte) -123, arg2, arg1, arg0);
        ++field666;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZLpe;IILoj;I)V")
    public final void method270(int arg0, boolean arg1, class424 arg2, int arg3, int arg4, class280 arg5, int arg6) {
        ++field670;
        class116 var8 = null;
        if (~arg0 == -1) {
            var8 = (class116) class63.method320(arg3, arg6, arg4);
        }
        if (~arg0 == -2) {
            var8 = (class116) class330.method2001(arg3, arg6, arg4);
        }
        if (~arg0 == -3) {
            var8 = (class116) class263.method1603(arg3, arg6, arg4, field672 != null ? field672 : (field672 = method279("td")));
        }
        if (arg1) {
            this.method272((byte) -51, (class280) null);
        }
        if (arg0 == 3) {
            var8 = (class116) class427.method2542(arg3, arg6, arg4);
        }
        if (var8 != null) {
            class415 var9 = class173.field2084.method2297(50, var8.method16(arg1));
            int var10 = var8.method26((byte) 73);
            int var11 = var8.method31((byte) -126);
            if (var9.method2474(-9280)) {
                class184.method999(arg4, var9, arg6, arg3, (byte) -36);
            }
            if (var8.method22(-52)) {
                var8.method18(-47, arg5);
            }
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    class183 var12 = class330.method2001(arg3, arg6, arg4);
                    if (!(var12 instanceof class19)) {
                        class373.method2255(arg3, arg6, arg4);
                        return;
                    }
                    ((class19) var12).field261 = null;
                    return;
                }
                if (arg0 == 2) {
                    class83 var13 = class263.method1603(arg3, arg6, arg4, field672 != null ? field672 : (field672 = method279("td")));
                    if (var13 instanceof class4 && ~var13.field999 == ~arg6 && var13.field1004 == arg4) {
                        ((class4) var13).field39 = null;
                    } else {
                        class304.method1899(arg3, arg6, arg4, field672 != null ? field672 : (field672 = method279("td")));
                    }
                    if (~var9.field5970 != -1 && ~super.field2677 < ~(arg6 - -var9.field5939) && ~(var9.field5939 + arg4) > ~super.field2705 && super.field2677 > arg6 - -var9.field5927 && ~(var9.field5927 + arg4) > ~super.field2705) {
                        arg2.method2531(!var9.field5980, (byte) -41, var11, arg6, var9.field5927, var9.field5939, arg4, var9.field5942);
                        return;
                    }
                    return;
                }
                if (~arg0 == -4) {
                    class60 var14 = class427.method2542(arg3, arg6, arg4);
                    if (var14 instanceof class44) {
                        ((class44) var14).field552 = null;
                    } else {
                        class367.method2218(arg3, arg6, arg4);
                    }
                    if (~var9.field5970 == -2) {
                        arg2.method2538(arg4, (byte) -108, arg6);
                        return;
                    }
                }
                return;
            }
            class261 var15 = class63.method320(arg3, arg6, arg4);
            if (var15 instanceof class314) {
                ((class314) var15).field4578 = null;
            } else {
                class145.method689(arg3, arg6, arg4);
            }
            if (var9.field5970 != 0) {
                arg2.method2532(var11, var9.field5942, arg4, 4194304, arg6, var10, !var9.field5980);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIZ)V")
    public class51(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class413.field5876, class127.field1573);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIIIZII)V")
    public static final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        ++field663;
        if (class480.method2837((byte) -106, arg6)) {
            client.method1669(class284.field4130[arg6], -1, arg2, arg8, arg5, arg3, arg0, arg4, arg1, arg9);
            if (!arg7) {
                method271(-32, -19, 33, -77, -119, -28, -122, true, 75, 10);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLoj;)V")
    public final void method272(byte arg0, class280 arg1) {
        class347.method2101(arg1);
        ++field661;
        if (arg0 != 87) {
            method271(-3, -96, 88, -46, -79, -102, 27, false, 85, -33);
        }
        if (~super.field2691 < -2) {
            for (int var3 = 0; var3 < super.field2677; ++var3) {
                for (int var4 = 0; var4 < super.field2705; ++var4) {
                    if ((2 & class140.field1686[1][var3][var4]) == 2) {
                        class193.method1055(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < super.field2691; ++var5) {
            for (int var6 = 0; ~super.field2705 <= ~var6; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field2677; ++var7) {
                    if ((super.field2704[var5][var7][var6] & 1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (super.field2705 > var9 && (super.field2704[var5][var7][var9 - -1] & 1) != 0) {
                            ++var9;
                        }
                        while (~var8 < -1 && (1 & super.field2704[var5][var7][var8 + -1]) != 0) {
                            --var8;
                        }
                        label169: while (~var10 < -1) {
                            for (int var12 = var8; var9 >= var12; ++var12) {
                                if ((1 & super.field2704[var10 - 1][var7][var12]) == 0) {
                                    break label169;
                                }
                            }
                            --var10;
                        }
                        label158: while (~var11 > -4) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if ((1 & super.field2704[var11 + 1][var7][var13]) == 0) {
                                    break label158;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 + 1 + -var8) * (var11 + 1 + -var10);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field2706[var11][var7][var8] + -var15;
                            int var17 = super.field2706[var10][var7][var8];
                            class331.method2012(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; ~var18 >= ~var11; ++var18) {
                                for (int var19 = var8; var9 >= var19; ++var19) {
                                    super.field2704[var18][var7][var19] = (byte) class444.method2618(super.field2704[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((2 & super.field2704[var5][var7][var6]) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (var20 > 0 && (2 & super.field2704[var5][var20 - 1][var6]) != 0) {
                            --var20;
                        }
                        int var23 = var5;
                        while (~var21 > ~super.field2677 && (2 & super.field2704[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        label222: while (~var22 < -1) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if ((2 & super.field2704[var22 + -1][var24][var6]) == 0) {
                                    break label222;
                                }
                            }
                            --var22;
                        }
                        label211: while (var23 < 3) {
                            for (int var25 = var20; ~var25 >= ~var21; ++var25) {
                                if ((2 & super.field2704[var23 + 1][var25][var6]) == 0) {
                                    break label211;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 + 1 - var22) * (var21 - var20 + 1);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field2706[var23][var20][var6] + -var27;
                            int var29 = super.field2706[var22][var20][var6];
                            class331.method2012(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; var21 >= var31; ++var31) {
                                    super.field2704[var30][var31][var6] = (byte) class444.method2618(super.field2704[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field2704[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && (super.field2704[var5][var7][var34 + -1] & 4) != 0) {
                            --var34;
                        }
                        while (var35 < super.field2705 && (super.field2704[var5][var7][var35 + 1] & 4) != 0) {
                            ++var35;
                        }
                        label276: while (var32 > 0) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if (~(4 & super.field2704[var5][var32 + -1][var36]) == -1) {
                                    break label276;
                                }
                            }
                            --var32;
                        }
                        label265: while (~super.field2677 < ~var33) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if ((super.field2704[var5][var33 - -1][var37] & 4) == 0) {
                                    break label265;
                                }
                            }
                            ++var33;
                        }
                        if (~((-var32 + var33 + 1) * (-var34 + var35 + 1)) <= -5) {
                            int var38 = super.field2706[var5][var32][var34];
                            class331.method2012(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                    super.field2704[var5][var39][var40] = (byte) class444.method2618(super.field2704[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field2704 = null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZI)I")
    public static final int method273(boolean arg0, int arg1) {
        if (arg0) {
            return -9;
        } else {
            ++field667;
            int var2 = 0;
            if (~arg1 > -1 || arg1 >= 65536) {
                arg1 >>>= 16;
                var2 += 16;
            }
            if (~arg1 <= -257) {
                var2 += 8;
                arg1 >>>= 8;
            }
            if (~arg1 <= -17) {
                var2 += 4;
                arg1 >>>= 4;
            }
            if (~arg1 <= -5) {
                var2 += 2;
                arg1 >>>= 2;
            }
            if (~arg1 <= -2) {
                ++var2;
                arg1 >>>= 1;
            }
            return arg1 + var2;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([ILvt;Loj;BII)V")
    public final void method274(int[] arg0, class179 arg1, class280 arg2, byte arg3, int arg4, int arg5) {
        ++field671;
        if (!super.field2692) {
            if (arg3 > -103) {
                this.field668 = 66;
            }
            boolean var7 = false;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            class160 var8 = null;
            while (true) {
                while (arg1.field2159.length > arg1.field2206) {
                    int var18 = arg1.method895((byte) -118);
                    if (var18 == 0) {
                        var8 = new class160(arg1);
                    } else if (var18 == 1) {
                        int var19 = arg1.method895((byte) -121);
                        if (var19 > 0) {
                            for (int var20 = 0; ~var19 < ~var20; ++var20) {
                                class326 var21 = new class326(arg1);
                                if (~var21.field4703 == -32) {
                                    class337 var22 = class312.field4557.method740(arg1.method916(21933), (byte) -100);
                                    var21.method1981(var22.field4846, var22.field4843, -74, var22.field4850, var22.field4849);
                                }
                                var21.field2605 += arg5 << 7;
                                var21.field2607 += arg4 << 7;
                                int var23 = var21.field2607 >> 7;
                                int var24 = var21.field2605 >> 7;
                                if (var23 >= 0 && var24 >= 0 && super.field2677 > var23 && ~super.field2705 < ~var24) {
                                    var21.field2602 = super.field2706[var21.field4692][var23][var24] - var21.field2602;
                                    if (arg2.method1345() > 0) {
                                        class302.method1896(var21);
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class160();
                        }
                        var8.method771(-13284, arg1);
                    } else if (~var18 == -129) {
                        if (arg0 == null) {
                            arg1.field2206 += 10;
                        } else {
                            arg0[0] = arg1.method916(21933);
                            arg0[1] = arg1.method906(-94);
                            arg0[2] = arg1.method906(-16);
                            arg0[3] = arg1.method906(-9);
                            arg0[4] = arg1.method916(21933);
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException((String) null);
                        }
                        if (super.field2698 == null) {
                            super.field2698 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var25 = 0; var25 < 4; ++var25) {
                            byte var26 = arg1.method922(32429);
                            if (var26 == 0 && super.field2698[var25] != null) {
                                int var27 = arg4;
                                int var28 = arg4 - -64;
                                int var29 = arg5;
                                if (arg4 < 0) {
                                    var27 = 0;
                                } else if (~arg4 <= ~super.field2677) {
                                    var27 = super.field2677;
                                }
                                int var30 = arg5 + 64;
                                if (~var28 <= -1) {
                                    if (var28 >= super.field2677) {
                                        var28 = super.field2677;
                                    }
                                } else {
                                    var28 = 0;
                                }
                                if (~arg5 <= -1) {
                                    if (~arg5 <= ~super.field2705) {
                                        var29 = super.field2705;
                                    }
                                } else {
                                    var29 = 0;
                                }
                                if (~var30 <= -1) {
                                    if (super.field2705 <= var30) {
                                        var30 = super.field2705;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                while (~var28 < ~var27) {
                                    while (~var30 < ~var29) {
                                        super.field2698[var25][var27][var29] = 0;
                                        ++var29;
                                    }
                                    ++var27;
                                }
                            } else if (~var26 == -2) {
                                if (super.field2698[var25] == null) {
                                    super.field2698[var25] = new byte[super.field2677 + 1][super.field2705 + 1];
                                }
                                for (int var31 = 0; var31 < 64; var31 += 4) {
                                    for (int var32 = 0; ~var32 > -65; var32 += 4) {
                                        byte var33 = arg1.method922(32429);
                                        for (int var34 = var31 - -arg4; var34 < var31 + 4 + arg4; ++var34) {
                                            for (int var35 = arg5 + var32; var35 < arg5 + 4 + var32; ++var35) {
                                                if (~var34 <= -1 && ~super.field2677 < ~var34 && ~var35 <= -1 && ~var35 > ~super.field2705) {
                                                    super.field2698[var25][var34][var35] = var33;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var26 == -3) {
                                if (super.field2698[var25] == null) {
                                    super.field2698[var25] = new byte[super.field2677 + 1][super.field2705 - -1];
                                }
                                if (var25 > 0) {
                                    int var36 = arg4;
                                    int var37 = arg4 + 64;
                                    int var38 = arg5;
                                    if (var37 < 0) {
                                        var37 = 0;
                                    } else if (~var37 <= ~super.field2677) {
                                        var37 = super.field2677;
                                    }
                                    if (~arg4 <= -1) {
                                        if (~super.field2677 >= ~arg4) {
                                            var36 = super.field2677;
                                        }
                                    } else {
                                        var36 = 0;
                                    }
                                    if (~arg5 <= -1) {
                                        if (super.field2705 <= arg5) {
                                            var38 = super.field2705;
                                        }
                                    } else {
                                        var38 = 0;
                                    }
                                    int var39 = arg5 + 64;
                                    if (var39 >= 0) {
                                        if (~super.field2705 >= ~var39) {
                                            var39 = super.field2705;
                                        }
                                    } else {
                                        var39 = 0;
                                    }
                                    while (var36 < var37) {
                                        while (~var38 > ~var39) {
                                            super.field2698[var25][var36][var38] = super.field2698[var25 - 1][var36][var38];
                                            ++var38;
                                        }
                                        ++var36;
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg4 >> 3) + var9;
                            int var12 = (arg5 >> 3) + var10;
                            if (~var11 <= -1 && ~var11 > ~(super.field2677 >> 3) && var12 >= 0 && ~var12 > ~(super.field2705 >> 3)) {
                                class357.method2186(var8, 28181, var12, var11);
                            }
                        }
                    }
                }
                if (!var7 && super.field2698 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field2698[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg4 >> 2) + var14;
                                    int var17 = (arg5 >> 2) + var15;
                                    if (~var16 <= -1 && var16 < 26 && var17 >= 0 && var17 < 26) {
                                        super.field2698[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILoj;II[B[Lpe;)V")
    public final void method275(int arg0, class280 arg1, int arg2, int arg3, byte[] arg4, class424[] arg5) {
        ++field669;
        class179 var7 = new class179(arg4);
        if (arg2 != 1) {
            this.method275(106, (class280) null, 89, 26, (byte[]) null, (class424[]) null);
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method915((byte) 77);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method885(true);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = (4073 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method895((byte) -74);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg0 + var13;
                int var19 = arg3 + var12;
                if (~var18 < -1 && ~var19 < -1 && super.field2677 - 1 > var18 && ~(super.field2705 - 1) < ~var19) {
                    class424 var20 = null;
                    if (!super.field2692) {
                        int var21 = var14;
                        if ((2 & class140.field1686[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg5[var21];
                        }
                    }
                    this.method276((byte) 69, var8, var16, var18, arg1, var14, var19, var17, var14, -1, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIIILoj;IIIIILpe;)V")
    public final void method276(byte arg0, int arg1, int arg2, int arg3, class280 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class424 arg10) {
        ++field665;
        if (class420.method2503((byte) -85) || class216.method1212(arg6, arg3, arg8, class346.field4942, 0)) {
            if (arg8 < this.field668) {
                this.field668 = arg8;
            }
            class415 var12 = class173.field2084.method2297(50, arg1);
            if (class375.field5347 != 1 || !var12.field5955) {
                int var13;
                int var14;
                if (~arg7 != -2 && arg7 != 3) {
                    var13 = var12.field5939;
                    var14 = var12.field5927;
                } else {
                    var14 = var12.field5939;
                    var13 = var12.field5927;
                }
                if (arg0 < 38) {
                    this.method270(-25, true, (class424) null, -118, -71, (class280) null, -119);
                }
                int var15;
                int var16;
                if (~(arg3 + var13) >= ~super.field2677) {
                    var15 = arg3 - -(var13 + 1 >> 1);
                    var16 = arg3 - -(var13 >> 1);
                } else {
                    var15 = arg3 + 1;
                    var16 = arg3;
                }
                int var17;
                int var18;
                if (super.field2705 < arg6 + var14) {
                    var17 = arg6;
                    var18 = arg6 + 1;
                } else {
                    var17 = (var14 >> 1) + arg6;
                    var18 = (var14 - -1 >> 1) + arg6;
                }
                class443 var19 = class398.field5667[arg5];
                int var20 = var19.method1861(var16, var17) - (-var19.method1861(var15, var17) - var19.method1861(var16, var18)) + var19.method1861(var15, var18) >> 2;
                int var21 = (arg3 << 7) + (var13 << 6);
                int var22 = (arg6 << 7) - -(var14 << 6);
                boolean var23 = class127.field1559 && !super.field2692 && var12.field5979;
                if (var12.method2474(-9280)) {
                    class437.method2596(arg7, arg8, arg6, (class137) null, (class198) null, (byte) -93, var12, arg3);
                }
                boolean var24 = ~arg9 == 0 && var12.field5943 == -1 && var12.field5989 == null && var12.field5951 == null && !var12.field5929;
                if (!class276.field3955 || var12.field5919 == 1) {
                    if (arg2 == 22) {
                        if (class119.field1484 || ~var12.field5990 != -1 || ~var12.field5970 == -2 || var12.field5928) {
                            class60 var26;
                            if (var24) {
                                class127 var25 = new class127(arg4, var12, arg5, var21, var20, var22, super.field2692, arg7, var23);
                                if (var25.method22(-71)) {
                                    var25.method20(5744, arg4);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class47(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg7, arg9);
                            }
                            class60 var27 = class427.method2542(arg8, arg3, arg6);
                            if (var27 instanceof class44) {
                                ((class44) var27).field552 = var26;
                            } else {
                                class204.method1114(arg8, arg3, arg6, var26);
                            }
                            if (~var12.field5970 == -2 && arg10 != null) {
                                arg10.method2524(false, arg3, arg6);
                            }
                        }
                    } else if (arg2 != 10 && ~arg2 != -12) {
                        if (~arg2 <= -13 && arg2 <= 17 || ~arg2 <= -19 && ~arg2 >= -22) {
                            class83 var28;
                            if (!var24) {
                                var28 = new class413(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg3, arg3 + var13 + -1, arg6, var14 + -1 + arg6, arg2, arg7, arg9);
                            } else {
                                class181 var29 = new class181(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg3, arg3 + var13 - 1, arg6, arg6 + var14 - 1, arg2, arg7, var23);
                                if (var29.method22(-57)) {
                                    var29.method20(5744, arg4);
                                }
                                var28 = var29;
                            }
                            class83 var30 = class263.method1603(arg8, arg3, arg6, field672 != null ? field672 : (field672 = method279("td")));
                            if (var30 instanceof class4 && ~var30.field999 == ~arg3 && var30.field1004 == arg6) {
                                ((class4) var30).field39 = var28;
                            } else {
                                class223.method1232(var28, false);
                            }
                            if (class127.field1559 && !super.field2692 && arg2 >= 12 && ~arg2 >= -18 && ~arg2 != -14 && ~arg8 < -1 && ~var12.field5919 != -1) {
                                super.field2704[arg8][arg3][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6], 4);
                            }
                            if (var12.field5970 != 0 && arg10 != null) {
                                arg10.method2522(false, arg6, arg3, !var12.field5980, var14, var13, var12.field5942);
                            }
                        } else if (arg2 == 0) {
                            int var31 = var12.field5919;
                            if (class19.field265 && var12.field5919 == -1) {
                                var31 = 1;
                            }
                            class261 var33;
                            if (var24) {
                                class117 var32 = new class117(arg4, var12, arg5, var21, var20, var22, super.field2692, arg2, arg7, var23);
                                if (var32.method22(-93)) {
                                    var32.method20(5744, arg4);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class484(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg2, arg7, arg9);
                            }
                            class261 var34 = class63.method320(arg8, arg3, arg6);
                            if (!(var34 instanceof class314)) {
                                class443.method2617(arg8, arg3, arg6, var33, (class261) null);
                            } else {
                                ((class314) var34).field4578 = var33;
                            }
                            if (class127.field1559) {
                                if (arg7 == 0) {
                                    if (var12.field5934) {
                                        var19.method1863(arg3, arg6, 50);
                                        var19.method1863(arg3, arg6 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field2692) {
                                        super.field2704[arg8][arg3][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6], 1);
                                    }
                                } else if (~arg7 == -2) {
                                    if (var12.field5934) {
                                        var19.method1863(arg3, arg6 + 1, 50);
                                        var19.method1863(arg3 + 1, arg6 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field2692) {
                                        super.field2704[arg8][arg3][arg6 + 1] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6 + 1], 2);
                                    }
                                } else if (arg7 != 2) {
                                    if (arg7 == 3) {
                                        if (var12.field5934) {
                                            var19.method1863(arg3, arg6, 50);
                                            var19.method1863(arg3 + 1, arg6, 50);
                                        }
                                        if (~var31 == -2 && !super.field2692) {
                                            super.field2704[arg8][arg3][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field5934) {
                                        var19.method1863(arg3 - -1, arg6, 50);
                                        var19.method1863(arg3 - -1, arg6 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field2692) {
                                        super.field2704[arg8][arg3 + 1][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3 + 1][arg6], 1);
                                    }
                                }
                            }
                            if (~var12.field5970 != -1 && arg10 != null) {
                                arg10.method2537(arg7, arg6, 1, arg3, var12.field5942, !var12.field5980, arg2);
                            }
                            if (var12.field5994 != 16) {
                                class307.method1911(arg8, arg3, arg6, var12.field5994);
                            }
                        } else if (arg2 == 1) {
                            class261 var35;
                            if (!var24) {
                                var35 = new class484(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg2, arg7, arg9);
                            } else {
                                class117 var36 = new class117(arg4, var12, arg5, var21, var20, var22, super.field2692, arg2, arg7, var23);
                                var35 = var36;
                                if (var36.method22(-127)) {
                                    var36.method20(5744, arg4);
                                }
                            }
                            class261 var37 = class63.method320(arg8, arg3, arg6);
                            if (var37 instanceof class314) {
                                ((class314) var37).field4578 = var35;
                            } else {
                                class443.method2617(arg8, arg3, arg6, var35, (class261) null);
                            }
                            if (var12.field5934 && class127.field1559) {
                                if (arg7 != 0) {
                                    if (~arg7 != -2) {
                                        if (~arg7 != -3) {
                                            if (~arg7 == -4) {
                                                var19.method1863(arg3, arg6, 50);
                                            }
                                        } else {
                                            var19.method1863(arg3 + 1, arg6, 50);
                                        }
                                    } else {
                                        var19.method1863(arg3 + 1, arg6 + 1, 50);
                                    }
                                } else {
                                    var19.method1863(arg3, arg6 + 1, 50);
                                }
                            }
                            if (~var12.field5970 != -1 && arg10 != null) {
                                arg10.method2537(arg7, arg6, 1, arg3, var12.field5942, !var12.field5980, arg2);
                            }
                        } else if (arg2 == 2) {
                            int var38 = arg7 - -1 & 3;
                            class261 var41;
                            class261 var42;
                            if (var24) {
                                class117 var39 = new class117(arg4, var12, arg5, var21, var20, var22, super.field2692, arg2, arg7 + 4, var23);
                                class117 var40 = new class117(arg4, var12, arg5, var21, var20, var22, super.field2692, arg2, var38, var23);
                                if (var39.method22(-66)) {
                                    var39.method20(5744, arg4);
                                }
                                if (var40.method22(-60)) {
                                    var40.method20(5744, arg4);
                                }
                                var41 = var39;
                                var42 = var40;
                            } else {
                                var41 = new class484(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg2, arg7 + 4, arg9);
                                var42 = new class484(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg2, var38, arg9);
                            }
                            class443.method2617(arg8, arg3, arg6, var41, var42);
                            if (var12.field5919 == 1 && class127.field1559 && !super.field2692) {
                                if (arg7 == 0) {
                                    super.field2704[arg8][arg3][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6], 1);
                                    super.field2704[arg8][arg3][arg6 + 1] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6 + 1], 2);
                                } else if (arg7 != 1) {
                                    if (arg7 == 2) {
                                        super.field2704[arg8][arg3 + 1][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3 + 1][arg6], 1);
                                        super.field2704[arg8][arg3][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6], 2);
                                    } else if (arg7 == 3) {
                                        super.field2704[arg8][arg3][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6], 2);
                                        super.field2704[arg8][arg3][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6], 1);
                                    }
                                } else {
                                    super.field2704[arg8][arg3][arg6 - -1] = (byte) class292.method1841(super.field2704[arg8][arg3][arg6 - -1], 2);
                                    super.field2704[arg8][arg3 + 1][arg6] = (byte) class292.method1841(super.field2704[arg8][arg3 + 1][arg6], 1);
                                }
                            }
                            if (var12.field5970 != 0 && arg10 != null) {
                                arg10.method2537(arg7, arg6, 1, arg3, var12.field5942, !var12.field5980, arg2);
                            }
                            if (~var12.field5994 != -17) {
                                class307.method1911(arg8, arg3, arg6, var12.field5994);
                            }
                        } else if (~arg2 == -4) {
                            class261 var43;
                            if (!var24) {
                                var43 = new class484(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg2, arg7, arg9);
                            } else {
                                class117 var44 = new class117(arg4, var12, arg5, var21, var20, var22, super.field2692, arg2, arg7, var23);
                                var43 = var44;
                                if (var44.method22(-96)) {
                                    var44.method20(5744, arg4);
                                }
                            }
                            class261 var45 = class63.method320(arg8, arg3, arg6);
                            if (!(var45 instanceof class314)) {
                                class443.method2617(arg8, arg3, arg6, var43, (class261) null);
                            } else {
                                ((class314) var45).field4578 = var43;
                            }
                            if (var12.field5934 && class127.field1559) {
                                if (~arg7 == -1) {
                                    var19.method1863(arg3, arg6 + 1, 50);
                                } else if (~arg7 != -2) {
                                    if (~arg7 == -3) {
                                        var19.method1863(arg3 + 1, arg6, 50);
                                    } else if (arg7 == 3) {
                                        var19.method1863(arg3, arg6, 50);
                                    }
                                } else {
                                    var19.method1863(arg3 + 1, arg6 + 1, 50);
                                }
                            }
                            if (~var12.field5970 != -1 && arg10 != null) {
                                arg10.method2537(arg7, arg6, 1, arg3, var12.field5942, !var12.field5980, arg2);
                            }
                        } else if (arg2 == 9) {
                            class83 var47;
                            if (var24) {
                                class181 var46 = new class181(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg3, arg3, arg6, arg6, arg2, arg7, var23);
                                var47 = var46;
                                if (var46.method22(-97)) {
                                    var46.method20(5744, arg4);
                                }
                            } else {
                                var47 = new class413(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg3, arg3 + var13 + -1, arg6, arg6 - -var14 + -1, arg2, arg7, arg9);
                            }
                            class83 var48 = class263.method1603(arg8, arg3, arg6, field672 != null ? field672 : (field672 = method279("td")));
                            if (var48 instanceof class4 && ~var48.field999 == ~arg3 && ~var48.field1004 == ~arg6) {
                                ((class4) var48).field39 = var47;
                            } else {
                                class223.method1232(var47, false);
                            }
                            if (var12.field5970 != 0 && arg10 != null) {
                                arg10.method2522(false, arg6, arg3, !var12.field5980, var14, var13, var12.field5942);
                            }
                            if (var12.field5994 != 16) {
                                class307.method1911(arg8, arg3, arg6, var12.field5994);
                            }
                        } else if (arg2 == 4) {
                            class183 var49;
                            if (!var24) {
                                var49 = new class63(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, 0, 0, 0, arg2, arg7, arg9);
                            } else {
                                class297 var50 = new class297(arg4, var12, arg5, var21, var20, var22, super.field2692, 0, 0, 0, arg2, arg7);
                                if (var50.method22(-45)) {
                                    var50.method20(5744, arg4);
                                }
                                var49 = var50;
                            }
                            class183 var51 = class330.method2001(arg8, arg3, arg6);
                            if (!(var51 instanceof class19)) {
                                class13.method97(arg8, arg3, arg6, var49, (class183) null);
                            } else {
                                ((class19) var51).field261 = var49;
                            }
                        } else if (arg2 == 5) {
                            int var52 = 16;
                            class116 var53 = (class116) class63.method320(arg8, arg3, arg6);
                            if (var53 != null) {
                                var52 = class173.field2084.method2297(50, var53.method16(false)).field5994;
                            }
                            class183 var54;
                            if (!var24) {
                                var54 = new class63(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, 0, class427.field6154[arg7] * var52, class105.field1270[arg7] * var52, arg2, arg7, arg9);
                            } else {
                                class297 var55 = new class297(arg4, var12, arg5, var21, var20, var22, super.field2692, 0, class427.field6154[arg7] * var52, class105.field1270[arg7] * var52, arg2, arg7);
                                if (var55.method22(-111)) {
                                    var55.method20(5744, arg4);
                                }
                                var54 = var55;
                            }
                            class183 var56 = class330.method2001(arg8, arg3, arg6);
                            if (var56 instanceof class19) {
                                ((class19) var56).field261 = var54;
                            } else {
                                class13.method97(arg8, arg3, arg6, var54, (class183) null);
                            }
                        } else if (arg2 == 6) {
                            int var57 = 8;
                            class116 var58 = (class116) class63.method320(arg8, arg3, arg6);
                            if (var58 != null) {
                                var57 = class173.field2084.method2297(50, var58.method16(false)).field5994 / 2;
                            }
                            class183 var60;
                            if (var24) {
                                class297 var59 = new class297(arg4, var12, arg5, var21, var20, var22, super.field2692, arg7, class427.field6154[arg7] * var57, class105.field1270[arg7] * var57, arg2, arg7 + 4);
                                if (var59.method22(-95)) {
                                    var59.method20(5744, arg4);
                                }
                                var60 = var59;
                            } else {
                                var60 = new class63(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg7, class104.field1255[arg7] * var57, class310.field4543[arg7] * var57, arg2, arg7 + 4, arg9);
                            }
                            class183 var61 = class330.method2001(arg8, arg3, arg6);
                            if (var61 instanceof class19) {
                                ((class19) var61).field261 = var60;
                            } else {
                                class13.method97(arg8, arg3, arg6, var60, (class183) null);
                            }
                        } else if (arg2 == 7) {
                            int var62 = arg7 + 2 & 3;
                            class183 var63;
                            if (!var24) {
                                var63 = new class63(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, var62, 0, 0, arg2, var62 + 4, arg9);
                            } else {
                                class297 var64 = new class297(arg4, var12, arg5, var21, var20, var22, super.field2692, var62, 0, 0, arg2, var62 - -4);
                                if (var64.method22(-97)) {
                                    var64.method20(5744, arg4);
                                }
                                var63 = var64;
                            }
                            class183 var65 = class330.method2001(arg8, arg3, arg6);
                            if (!(var65 instanceof class19)) {
                                class13.method97(arg8, arg3, arg6, var63, (class183) null);
                            } else {
                                ((class19) var65).field261 = var63;
                            }
                        } else if (arg2 == 8) {
                            int var66 = 3 & arg7 + 2;
                            int var67 = 8;
                            class116 var68 = (class116) class63.method320(arg8, arg3, arg6);
                            if (var68 != null) {
                                var67 = class173.field2084.method2297(50, var68.method16(false)).field5994 / 2;
                            }
                            class183 var71;
                            class183 var72;
                            if (var24) {
                                class297 var69 = new class297(arg4, var12, arg5, var21, var20, var22, super.field2692, arg7, class104.field1255[arg7] * var67, class310.field4543[arg7] * var67, arg2, arg7 + 4);
                                class297 var70 = new class297(arg4, var12, arg5, var21, var20, var22, super.field2692, arg7, 0, 0, arg2, var66 + 4);
                                if (var69.method22(-74)) {
                                    var69.method20(5744, arg4);
                                }
                                var71 = var70;
                                var72 = var69;
                                if (var70.method22(-46)) {
                                    var70.method20(5744, arg4);
                                }
                            } else {
                                class63 var73 = new class63(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg7, class104.field1255[arg7] * var67, class310.field4543[arg7] * var67, arg2, arg7 + 4, arg9);
                                class63 var74 = new class63(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg7, 0, 0, arg2, var66 - -4, arg9);
                                var72 = var73;
                                var71 = var74;
                            }
                            class13.method97(arg8, arg3, arg6, var72, var71);
                        }
                    } else {
                        class181 var75 = null;
                        int var76;
                        class83 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class413(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg3, arg3 - (-var13 + 1), arg6, arg6 + var14 + -1, arg2, arg7, arg9);
                        } else {
                            class181 var78 = new class181(arg4, var12, arg8, arg5, var21, var20, var22, super.field2692, arg3, arg3 + var13 - 1, arg6, arg6 + var14 + -1, arg2, arg7, var23);
                            var76 = var78.method984((byte) -92);
                            var77 = var78;
                            var75 = var78;
                        }
                        class83 var79 = class263.method1603(arg8, arg3, arg6, field672 != null ? field672 : (field672 = method279("td")));
                        boolean var80 = false;
                        if (var79 instanceof class4 && var79.field999 == arg3 && ~var79.field1004 == ~arg6) {
                            ((class4) var79).field39 = var77;
                            var80 = true;
                        }
                        if (var80 || class223.method1232(var77, false)) {
                            if (var75 != null && var75.method22(-83)) {
                                var75.method20(5744, arg4);
                            }
                            if (var12.field5934 && class127.field1559) {
                                if (var76 > 30) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; ~var13 <= ~var81; ++var81) {
                                    for (int var82 = 0; var82 <= var14; ++var82) {
                                        var19.method1863(arg3 + var81, arg6 + var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field5970 != -1 && arg10 != null) {
                            arg10.method2522(false, arg6, arg3, !var12.field5980, var14, var13, var12.field5942);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILoj;II[IIIILvt;)V")
    public final void method277(int arg0, int arg1, int arg2, class280 arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, class179 arg10) {
        ++field662;
        if (!super.field2692) {
            boolean var12 = false;
            class160 var13 = null;
            if (arg6 != null) {
                arg6[0] = -1;
            }
            int var14 = (arg8 & 7) * 8;
            if (arg9 > -55) {
                this.field668 = -5;
            }
            int var15 = (arg1 & 7) * 8;
            while (true) {
                while (~arg10.field2206 > ~arg10.field2159.length) {
                    int var20 = arg10.method895((byte) -82);
                    if (var20 == 0) {
                        var13 = new class160(arg10);
                    } else if (var20 == 1) {
                        int var34 = arg10.method895((byte) -89);
                        if (var34 > 0) {
                            for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                class326 var36 = new class326(arg10);
                                if (var36.field4703 == 31) {
                                    class337 var37 = class312.field4557.method740(arg10.method916(21933), (byte) -100);
                                    var36.method1981(var37.field4846, var37.field4843, -52, var37.field4850, var37.field4849);
                                }
                                int var38 = var36.field2607 >> 7;
                                int var39 = var36.field2605 >> 7;
                                if (var36.field4692 == arg0 && ~var38 <= ~var14 && var38 < var14 - -8 && var39 >= var15 && var39 < var15 + 8) {
                                    int var40 = class349.method2114(var36.field2607 & 1023, arg2, 1023 & var36.field2605, 54) + (arg4 << 7);
                                    int var41 = (arg5 << 7) - -class180.method954(256, 1023 & var36.field2605, 1023 & var36.field2607, arg2);
                                    var36.field2605 = var41;
                                    var36.field2607 = var40;
                                    int var42 = var36.field2607 >> 7;
                                    int var43 = var36.field2605 >> 7;
                                    if (~var42 <= -1 && ~var43 <= -1 && ~super.field2677 < ~var42 && ~super.field2705 < ~var43) {
                                        var36.field2602 = super.field2706[arg0][var42][var43] + -var36.field2602;
                                        if (~arg3.method1345() < -1) {
                                            class302.method1896(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class160();
                        }
                        var13.method771(-13284, arg10);
                    } else if (var20 == 128) {
                        if (arg6 != null) {
                            arg6[0] = arg10.method916(21933);
                            arg6[1] = arg10.method906(-89);
                            arg6[2] = arg10.method906(-47);
                            arg6[3] = arg10.method906(-57);
                            arg6[4] = arg10.method916(21933);
                        } else {
                            arg10.field2206 += 10;
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field2698 == null) {
                            super.field2698 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg10.method922(32429);
                            if (~var22 == -1 && super.field2698[arg7] != null) {
                                if (~var21 >= ~arg0) {
                                    int var23 = arg4;
                                    int var24 = arg4 + 7;
                                    int var25 = arg5;
                                    if (~arg5 <= -1) {
                                        if (arg5 >= super.field2705) {
                                            var25 = super.field2705;
                                        }
                                    } else {
                                        var25 = 0;
                                    }
                                    if (~var24 > -1) {
                                        var24 = 0;
                                    } else if (~super.field2677 >= ~var24) {
                                        var24 = super.field2677;
                                    }
                                    int var26 = arg5 - -7;
                                    if (~arg4 > -1) {
                                        var23 = 0;
                                    } else if (~super.field2677 >= ~arg4) {
                                        var23 = super.field2677;
                                    }
                                    if (var26 < 0) {
                                        var26 = 0;
                                    } else if (~var26 <= ~super.field2705) {
                                        var26 = super.field2705;
                                    }
                                    while (var23 < var24) {
                                        while (~var25 > ~var26) {
                                            super.field2698[arg7][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (var22 == 1) {
                                if (super.field2698[arg7] == null) {
                                    super.field2698[arg7] = new byte[super.field2677 + 1][super.field2705 + 1];
                                }
                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                        byte var29 = arg10.method922(32429);
                                        if (var21 <= arg0) {
                                            for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                for (int var31 = var28; var28 + 4 > var31; ++var31) {
                                                    if (~var14 >= ~var30 && ~var30 > ~(var14 + 8) && var15 <= var31 && ~(var15 - -8) < ~var15) {
                                                        int var32 = class313.method1936(arg2, var31 & 7, (byte) -71, 7 & var30) + arg4;
                                                        int var33 = arg5 + class403.method2404(arg2, var31 & 7, 7 & var30, (byte) -120);
                                                        if (~var32 <= -1 && ~super.field2677 < ~var32 && var33 >= 0 && super.field2705 > var33) {
                                                            super.field2698[arg7][var32][var33] = var29;
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
                    class357.method2186(var13, 28181, arg5 >> 3, arg4 >> 3);
                }
                if (!var12 && super.field2698 != null && super.field2698[arg7] != null) {
                    int var16 = arg4 + 7;
                    int var17 = arg5 - -7;
                    for (int var18 = arg4; var16 > var18; ++var18) {
                        for (int var19 = arg5; ~var17 < ~var19; ++var19) {
                            super.field2698[arg7][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II[Lpe;I[BILoj;IBII)V")
    public final void method278(int arg0, int arg1, class424[] arg2, int arg3, byte[] arg4, int arg5, class280 arg6, int arg7, byte arg8, int arg9, int arg10) {
        ++field664;
        if (arg8 == 54) {
            class179 var12 = new class179(arg4);
            int var13 = -1;
            while (true) {
                int var14 = var12.method915((byte) 77);
                if (~var14 == -1) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method885(true);
                    if (~var16 == -1) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = var15 & 63;
                    int var18 = (var15 & 4088) >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method895((byte) -72);
                    int var21 = var20 >> 2;
                    int var22 = 3 & var20;
                    if (arg1 == var19 && ~var18 <= ~arg10 && ~var18 > ~(arg10 + 8) && var17 >= arg9 && arg9 + 8 > var17) {
                        class415 var23 = class173.field2084.method2297(arg8 ^ 4, var13);
                        int var24 = class71.method360(var18 & 7, 14, var23.field5927, var23.field5939, var22, var17 & 7, arg3) + arg7;
                        int var25 = arg0 - -class192.method1044(arg3, 124, var18 & 7, var22, var23.field5939, var17 & 7, var23.field5927);
                        if (~var24 < -1 && var25 > 0 && ~(super.field2677 - 1) < ~var24 && super.field2705 + -1 > var25) {
                            class424 var26 = null;
                            if (!super.field2692) {
                                int var27 = arg5;
                                if (~(2 & class140.field1686[1][var24][var25]) == -3) {
                                    var27 = arg5 - 1;
                                }
                                if (~var27 <= -1) {
                                    var26 = arg2[var27];
                                }
                            }
                            this.method276((byte) 62, var13, var21, var24, arg6, arg5, var25, arg3 + var22 & 3, arg5, -1, var26);
                        }
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method279(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
