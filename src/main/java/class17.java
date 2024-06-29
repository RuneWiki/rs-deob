import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 extends class488 {

    @OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
    public int field240 = 99;

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bu", name = "L", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bu", name = "N", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!bu", name = "O", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!bu", name = "K", descriptor = "Ljd;")
    public static class139 field238;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bu", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field243;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([IIILwm;Lbt;Z)V")
    public final void method104(int[] arg0, int arg1, int arg2, class364 arg3, class32 arg4, boolean arg5) {
        ++field239;
        if (!super.field6802) {
            boolean var7 = arg5;
            class27 var8 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            while (true) {
                while (~arg4.field456 > ~arg4.field472.length) {
                    int var18 = arg4.method201((byte) -116);
                    if (var18 == 0) {
                        var8 = new class27(arg4);
                    } else if (~var18 == -2) {
                        int var34 = arg4.method201((byte) -107);
                        if (~var34 < -1) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class263 var36 = new class263(arg4);
                                if (~var36.field3486 == -32) {
                                    class387 var37 = class308.field4078.method2238(arg4.method215((byte) 120), 120);
                                    var36.method1491(var37.field5352, var37.field5350, 0, var37.field5348, var37.field5355);
                                }
                                var36.field5539 += arg2 << 7;
                                var36.field5541 += arg1 << 7;
                                int var38 = var36.field5539 >> 7;
                                int var39 = var36.field5541 >> 7;
                                if (var38 >= 0 && var39 >= 0 && ~var38 > ~super.field6799 && ~var39 > ~super.field6812) {
                                    var36.field5536 = super.field6798[var36.field3490][var38][var39] + -var36.field5536;
                                    if (~arg3.method1977() < -1) {
                                        class56.method409(var36);
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class27();
                        }
                        var8.method155(-7125, arg4);
                    } else if (~var18 == -129) {
                        if (arg0 != null) {
                            arg0[0] = arg4.method215((byte) 109);
                            arg0[1] = arg4.method209((byte) 35);
                            arg0[2] = arg4.method209((byte) 35);
                            arg0[3] = arg4.method209((byte) 35);
                            arg0[4] = arg4.method215((byte) 112);
                        } else {
                            arg4.field456 += 10;
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException((String) null);
                        }
                        if (super.field6795 == null) {
                            super.field6795 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var19 = 0; var19 < 4; ++var19) {
                            byte var20 = arg4.method211(29861);
                            if (~var20 == -1 && super.field6795[var19] != null) {
                                int var21 = arg2;
                                int var22 = arg2 + 64;
                                int var23 = arg1;
                                if (arg1 >= 0) {
                                    if (arg1 >= super.field6812) {
                                        var23 = super.field6812;
                                    }
                                } else {
                                    var23 = 0;
                                }
                                if (~arg2 > -1) {
                                    var21 = 0;
                                } else if (arg2 >= super.field6799) {
                                    var21 = super.field6799;
                                }
                                int var24 = arg1 + 64;
                                if (var22 >= 0) {
                                    if (~var22 <= ~super.field6799) {
                                        var22 = super.field6799;
                                    }
                                } else {
                                    var22 = 0;
                                }
                                if (~var24 > -1) {
                                    var24 = 0;
                                } else if (super.field6812 <= var24) {
                                    var24 = super.field6812;
                                }
                                while (~var22 < ~var21) {
                                    while (var24 > var23) {
                                        super.field6795[var19][var21][var23] = 0;
                                        ++var23;
                                    }
                                    ++var21;
                                }
                            } else if (~var20 != -2) {
                                if (~var20 == -3) {
                                    if (super.field6795[var19] == null) {
                                        super.field6795[var19] = new byte[super.field6799 + 1][super.field6812 + 1];
                                    }
                                    if (~var19 < -1) {
                                        int var25 = arg2;
                                        int var26 = arg2 + 64;
                                        int var27 = arg1;
                                        if (~var26 > -1) {
                                            var26 = 0;
                                        } else if (super.field6799 <= var26) {
                                            var26 = super.field6799;
                                        }
                                        if (arg2 >= 0) {
                                            if (~super.field6799 >= ~arg2) {
                                                var25 = super.field6799;
                                            }
                                        } else {
                                            var25 = 0;
                                        }
                                        if (arg1 < 0) {
                                            var27 = 0;
                                        } else if (super.field6812 <= arg1) {
                                            var27 = super.field6812;
                                        }
                                        int var28 = arg1 + 64;
                                        if (var28 < 0) {
                                            var28 = 0;
                                        } else if (var28 >= super.field6812) {
                                            var28 = super.field6812;
                                        }
                                        while (var25 < var26) {
                                            while (var27 < var28) {
                                                super.field6795[var19][var25][var27] = super.field6795[var19 + -1][var25][var27];
                                                ++var27;
                                            }
                                            ++var25;
                                        }
                                    }
                                }
                            } else {
                                if (super.field6795[var19] == null) {
                                    super.field6795[var19] = new byte[super.field6799 + 1][super.field6812 + 1];
                                }
                                for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                    for (int var30 = 0; var30 < 64; var30 += 4) {
                                        byte var31 = arg4.method211(29861);
                                        for (int var32 = var29 - -arg2; ~(var29 - -arg2 + 4) < ~var32; ++var32) {
                                            for (int var33 = arg1 + var30; ~var33 > ~(var30 - -arg1 + 4); ++var33) {
                                                if (~var32 <= -1 && super.field6799 > var32 && var33 >= 0 && ~super.field6812 < ~var33) {
                                                    super.field6795[var19][var32][var33] = var31;
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
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg2 >> 3) + var9;
                            int var12 = (arg1 >> 3) + var10;
                            if (var11 >= 0 && super.field6799 >> 3 > var11 && ~var12 <= -1 && var12 < super.field6812 >> 3) {
                                class19.method122(var12, var8, var11, (byte) -67);
                            }
                        }
                    }
                }
                if (!var7 && super.field6795 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field6795[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg2 >> 2) - -var14;
                                    int var17 = (arg1 >> 2) + var15;
                                    if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                        super.field6795[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lbt;IIIIILwm;[IIII)V")
    public final void method105(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class364 arg6, int[] arg7, int arg8, int arg9, int arg10) {
        ++field236;
        if (!super.field6802) {
            boolean var12 = false;
            if (arg7 != null) {
                arg7[0] = -1;
            }
            class27 var13 = null;
            int var14 = (arg5 & 7) * 8;
            int var15 = (arg4 & 7) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg0.field472.length < ~arg0.field456) {
                            int var21 = arg0.method201((byte) -116);
                            if (var21 != 0) {
                                if (var21 != 1) {
                                    if (var21 == 2) {
                                        if (var13 == null) {
                                            var13 = new class27();
                                        }
                                        var13.method155(-7125, arg0);
                                    } else if (~var21 == -129) {
                                        if (arg7 != null) {
                                            arg7[0] = arg0.method215((byte) 123);
                                            arg7[1] = arg0.method209((byte) 35);
                                            arg7[2] = arg0.method209((byte) 35);
                                            arg7[3] = arg0.method209((byte) 35);
                                            arg7[4] = arg0.method215((byte) 106);
                                        } else {
                                            arg0.field456 += 10;
                                        }
                                    } else {
                                        if (~var21 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field6795 == null) {
                                            super.field6795 = new byte[4][][];
                                        }
                                        for (int var22 = 0; var22 < 4; ++var22) {
                                            byte var23 = arg0.method211(29861);
                                            if (var23 == 0 && super.field6795[arg2] != null) {
                                                if (~var22 >= ~arg3) {
                                                    int var24 = arg8;
                                                    int var25 = arg8 + 7;
                                                    int var26 = arg1;
                                                    int var27 = arg1 + 7;
                                                    if (arg1 >= 0) {
                                                        if (arg1 >= super.field6812) {
                                                            var26 = super.field6812;
                                                        }
                                                    } else {
                                                        var26 = 0;
                                                    }
                                                    if (~arg8 > -1) {
                                                        var24 = 0;
                                                    } else if (super.field6799 <= arg8) {
                                                        var24 = super.field6799;
                                                    }
                                                    if (~var25 > -1) {
                                                        var25 = 0;
                                                    } else if (super.field6799 <= var25) {
                                                        var25 = super.field6799;
                                                    }
                                                    if (~var27 <= -1) {
                                                        if (~var27 <= ~super.field6812) {
                                                            var27 = super.field6812;
                                                        }
                                                    } else {
                                                        var27 = 0;
                                                    }
                                                    while (~var25 < ~var24) {
                                                        while (~var27 < ~var26) {
                                                            super.field6795[arg2][var24][var26] = 0;
                                                            ++var26;
                                                        }
                                                        ++var24;
                                                    }
                                                }
                                            } else if (var23 == 1) {
                                                if (super.field6795[arg2] == null) {
                                                    super.field6795[arg2] = new byte[super.field6799 + 1][super.field6812 - -1];
                                                }
                                                for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                                    for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                                        byte var30 = arg0.method211(29861);
                                                        if (var22 <= arg3) {
                                                            for (int var31 = var28; var31 < var28 + 4; ++var31) {
                                                                for (int var32 = var29; ~(var29 + 4) < ~var32; ++var32) {
                                                                    if (var14 <= var31 && var31 < var14 + 8 && var32 >= var15 && ~(var15 + 8) < ~var15) {
                                                                        int var33 = arg8 - -class266.method1502(var31 & 7, -15286, arg9, var32 & 7);
                                                                        int var34 = arg1 + class148.method883(-1, var31 & 7, arg9, 7 & var32);
                                                                        if (var33 >= 0 && ~super.field6799 < ~var33 && var34 >= 0 && super.field6812 > var34) {
                                                                            super.field6795[arg2][var33][var34] = var30;
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
                                    int var35 = arg0.method201((byte) -127);
                                    if (var35 > 0) {
                                        for (int var36 = 0; ~var35 < ~var36; ++var36) {
                                            class263 var37 = new class263(arg0);
                                            if (var37.field3486 == 31) {
                                                class387 var38 = class308.field4078.method2238(arg0.method215((byte) 94), 102);
                                                var37.method1491(var38.field5352, var38.field5350, 0, var38.field5348, var38.field5355);
                                            }
                                            int var39 = var37.field5539 >> 7;
                                            int var40 = var37.field5541 >> 7;
                                            if (~var37.field3490 == ~arg3 && var14 <= var39 && ~var39 > ~(var14 + 8) && var40 >= var15 && ~var40 > ~(var15 + 8)) {
                                                int var41 = class257.method1453(arg9, var37.field5539 & 1023, 126, var37.field5541 & 1023) + (arg8 << 7);
                                                int var42 = class300.method1684(1023 & var37.field5541, var37.field5539 & 1023, 0, arg9) + (arg1 << 7);
                                                var37.field5541 = var42;
                                                var37.field5539 = var41;
                                                int var43 = var37.field5541 >> 7;
                                                int var44 = var37.field5539 >> 7;
                                                if (var44 >= 0 && var43 >= 0 && var44 < super.field6799 && ~var43 > ~super.field6812) {
                                                    var37.field5536 = super.field6798[arg3][var44][var43] - var37.field5536;
                                                    if (~arg6.method1977() < -1) {
                                                        class56.method409(var37);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var13 = new class27(arg0);
                            }
                        }
                        if (var13 != null) {
                            class19.method122(arg1 >> 3, var13, arg8 >> 3, (byte) -77);
                        }
                        if (!var12 && super.field6795 != null && super.field6795[arg2] != null) {
                            int var16 = arg8 + 7;
                            int var17 = arg1 + 7;
                            for (int var18 = arg8; var16 > var18; ++var18) {
                                for (int var19 = arg1; ~var17 < ~var19; ++var19) {
                                    super.field6795[arg2][var18][var19] = 0;
                                }
                            }
                        }
                        int var20 = 108 / ((arg10 - 41) / 58);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method106(int arg0) {
        field238 = null;
        if (arg0 >= -29) {
            method106(-40);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IC)Z")
    public static final boolean method107(int arg0, char arg1) {
        if (arg0 != -123) {
            method107(-107, '\u0014');
        }
        ++field241;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && ~arg1 >= -123;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILwm;)V")
    public final void method108(int arg0, class364 arg1) {
        class64.method431(arg1);
        ++field235;
        int var3 = -1 / ((arg0 - -62) / 44);
        if (super.field6813 > 1) {
            for (int var4 = 0; var4 < super.field6799; ++var4) {
                for (int var5 = 0; super.field6812 > var5; ++var5) {
                    if ((class1.field26[1][var4][var5] & 2) == 2) {
                        class279.method1577(var4, var5);
                    }
                }
            }
        }
        for (int var6 = 0; super.field6813 > var6; ++var6) {
            for (int var7 = 0; super.field6812 >= var7; ++var7) {
                for (int var8 = 0; super.field6799 >= var8; ++var8) {
                    if (~(super.field6790[var6][var8][var7] & 1) != -1) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (~var9 < -1 && ~(super.field6790[var6][var8][var9 + -1] & 1) != -1) {
                            --var9;
                        }
                        int var12 = var6;
                        while (~super.field6812 < ~var10 && ~(super.field6790[var6][var8][var10 + 1] & 1) != -1) {
                            ++var10;
                        }
                        label168: while (var11 > 0) {
                            for (int var13 = var9; ~var10 <= ~var13; ++var13) {
                                if ((1 & super.field6790[var11 - 1][var8][var13]) == 0) {
                                    break label168;
                                }
                            }
                            --var11;
                        }
                        label157: while (~var12 > -4) {
                            for (int var14 = var9; ~var14 >= ~var10; ++var14) {
                                if ((super.field6790[var12 + 1][var8][var14] & 1) == 0) {
                                    break label157;
                                }
                            }
                            ++var12;
                        }
                        int var15 = (var10 + 1 + -var9) * (var12 + 1 + -var11);
                        if (~var15 <= -3) {
                            short var16 = 240;
                            int var17 = super.field6798[var12][var8][var9] + -var16;
                            int var18 = super.field6798[var11][var8][var9];
                            class326.method1825(1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var17, var18);
                            for (int var19 = var11; ~var12 <= ~var19; ++var19) {
                                for (int var20 = var9; ~var20 >= ~var10; ++var20) {
                                    super.field6790[var19][var8][var20] = (byte) class99.method612(super.field6790[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if ((2 & super.field6790[var6][var8][var7]) != 0) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        while (~var21 < -1 && ~(2 & super.field6790[var6][var21 - 1][var7]) != -1) {
                            --var21;
                        }
                        while (super.field6799 > var22 && ~(super.field6790[var6][var22 - -1][var7] & 2) != -1) {
                            ++var22;
                        }
                        int var24 = var6;
                        label222: while (var23 > 0) {
                            for (int var25 = var21; ~var25 >= ~var22; ++var25) {
                                if ((2 & super.field6790[var23 + -1][var25][var7]) == 0) {
                                    break label222;
                                }
                            }
                            --var23;
                        }
                        label211: while (~var24 > -4) {
                            for (int var26 = var21; var26 <= var22; ++var26) {
                                if (~(super.field6790[var24 + 1][var26][var7] & 2) == -1) {
                                    break label211;
                                }
                            }
                            ++var24;
                        }
                        int var27 = (-var23 + var24 + 1) * (var22 + 1 + -var21);
                        if (var27 >= 2) {
                            short var28 = 240;
                            int var29 = super.field6798[var24][var21][var7] + -var28;
                            int var30 = super.field6798[var23][var21][var7];
                            class326.method1825(2, var21 * 128, var22 * 128 - -128, var7 * 128, var7 * 128, var29, var30);
                            for (int var31 = var23; ~var31 >= ~var24; ++var31) {
                                for (int var32 = var21; var32 <= var22; ++var32) {
                                    super.field6790[var31][var32][var7] = (byte) class99.method612(super.field6790[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if ((4 & super.field6790[var6][var8][var7]) != 0) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35;
                        for (var35 = var7; var35 > 0 && ~(4 & super.field6790[var6][var8][var35 + -1]) != -1; --var35) {
                        }
                        int var36;
                        for (var36 = var7; ~var36 > ~super.field6812 && (super.field6790[var6][var8][var36 + 1] & 4) != 0; ++var36) {
                        }
                        label276: while (var33 > 0) {
                            for (int var37 = var35; var36 >= var37; ++var37) {
                                if ((4 & super.field6790[var6][var33 - 1][var37]) == 0) {
                                    break label276;
                                }
                            }
                            --var33;
                        }
                        label265: while (~super.field6799 < ~var34) {
                            for (int var38 = var35; var38 <= var36; ++var38) {
                                if ((super.field6790[var6][var34 - -1][var38] & 4) == 0) {
                                    break label265;
                                }
                            }
                            ++var34;
                        }
                        if ((var34 - (var33 + -1)) * (-var35 + var36 + 1) >= 4) {
                            int var39 = super.field6798[var6][var33][var35];
                            class326.method1825(4, var33 * 128, var34 * 128 + 128, var35 * 128, var36 * 128 + 128, var39, var39);
                            for (int var40 = var33; var40 <= var34; ++var40) {
                                for (int var41 = var35; var41 <= var36; ++var41) {
                                    super.field6790[var6][var40][var41] = (byte) class99.method612(super.field6790[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field6790 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIIILwm;Ldg;II)V")
    public final void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class364 arg7, class261 arg8, int arg9, int arg10) {
        ++field233;
        if (class488.field6789.method2415(-64, class222.field2958) || class383.method2350(arg2, class160.field2220, arg4, 98, arg1)) {
            if (arg6 < this.field240) {
                this.field240 = arg6;
            }
            class88 var12 = class1.field23.method935(arg3, (byte) -67);
            if (class222.field2958 != 1 || !var12.field1273) {
                int var13;
                int var14;
                if (arg0 != 1 && ~arg0 != -4) {
                    var13 = var12.field1305;
                    var14 = var12.field1249;
                } else {
                    var14 = var12.field1305;
                    var13 = var12.field1249;
                }
                int var15 = -42 % ((arg5 - 82) / 44);
                int var16;
                int var17;
                if (~(arg1 - -var13) >= ~super.field6799) {
                    var16 = arg1 - -(var13 + 1 >> 1);
                    var17 = (var13 >> 1) + arg1;
                } else {
                    var17 = arg1;
                    var16 = arg1 + 1;
                }
                int var18;
                int var19;
                if (arg2 - -var14 > super.field6812) {
                    var18 = arg2 + 1;
                    var19 = arg2;
                } else {
                    var19 = (var14 >> 1) + arg2;
                    var18 = (var14 + 1 >> 1) + arg2;
                }
                class177 var20 = class221.field2945[arg4];
                int var21 = var20.method371(var17, var19) - -var20.method371(var16, var19) + var20.method371(var17, var18) - -var20.method371(var16, var18) >> 2;
                int var22 = (arg1 << 7) + (var13 << 6);
                int var23 = (arg2 << 7) + (var14 << 6);
                boolean var24 = class431.field5879 && !super.field6802 && var12.field1287;
                if (var12.method563((byte) -77)) {
                    class412.method2473(var12, arg2, arg0, (class487) null, (class121) null, (byte) 110, arg1, arg6);
                }
                boolean var25 = ~arg10 == 0 && var12.field1248 == -1 && var12.field1270 == null && var12.field1269 == null && !var12.field1250;
                if (!class130.field1907 || ~var12.field1242 == -2) {
                    if (arg9 == 22) {
                        if (class488.field6789.field6683 || var12.field1265 != 0 || ~var12.field1245 == -2 || var12.field1296) {
                            class354 var27;
                            if (var25) {
                                class66 var26 = new class66(arg7, var12, arg4, var22, var21, var23, super.field6802, arg0, var24);
                                var27 = var26;
                                if (var26.method7(false)) {
                                    var26.method12((byte) 72, arg7);
                                }
                            } else {
                                var27 = new class357(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg0, arg10);
                            }
                            class354 var28 = class146.method870(arg6, arg1, arg2);
                            if (var28 instanceof class183) {
                                ((class183) var28).field2519 = var27;
                            } else {
                                class66.method438(arg6, arg1, arg2, var27);
                            }
                            if (~var12.field1245 == -2 && arg8 != null) {
                                arg8.method1477(120, arg2, arg1);
                            }
                        }
                    } else if (~arg9 != -11 && arg9 != 11) {
                        if (~arg9 <= -13 && arg9 <= 17 || ~arg9 <= -19 && ~arg9 >= -22) {
                            class471 var30;
                            if (var25) {
                                class476 var29 = new class476(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg1, arg1 + var13 + -1, arg2, var14 + -1 + arg2, arg9, arg0, var24);
                                var30 = var29;
                                if (var29.method7(false)) {
                                    var29.method12((byte) 90, arg7);
                                }
                            } else {
                                var30 = new class1(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg1, arg1 + var13 - 1, arg2, arg2 - -var14 - 1, arg9, arg0, arg10);
                            }
                            class471 var31 = class4.method29(arg6, arg1, arg2, field243 != null ? field243 : (field243 = method114("id")));
                            if (var31 instanceof class94 && ~var31.field6500 == ~arg1 && var31.field6491 == arg2) {
                                ((class94) var31).field1393 = var30;
                            } else {
                                class214.method1212(var30, false);
                            }
                            if (class431.field5879 && !super.field6802 && ~arg9 <= -13 && ~arg9 >= -18 && arg9 != 13 && arg6 > 0 && var12.field1242 != 0) {
                                super.field6790[arg6][arg1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1][arg2], 4);
                            }
                            if (var12.field1245 != 0 && arg8 != null) {
                                arg8.method1482(var12.field1280, var14, arg1, !var12.field1227, arg2, false, var13);
                            }
                        } else if (arg9 == 0) {
                            int var32 = var12.field1242;
                            if (class431.field5876 && ~var12.field1242 == 0) {
                                var32 = 1;
                            }
                            class327 var34;
                            if (var25) {
                                class486 var33 = new class486(arg7, var12, arg4, var22, var21, var23, super.field6802, arg9, arg0, var24);
                                var34 = var33;
                                if (var33.method7(false)) {
                                    var33.method12((byte) 85, arg7);
                                }
                            } else {
                                var34 = new class307(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg9, arg0, arg10);
                            }
                            class327 var35 = class413.method2478(arg6, arg1, arg2);
                            if (!(var35 instanceof class173)) {
                                class348.method2150(arg6, arg1, arg2, var34, (class327) null);
                            } else {
                                ((class173) var35).field2368 = var34;
                            }
                            if (class431.field5879) {
                                if (~arg0 != -1) {
                                    if (arg0 == 1) {
                                        if (var12.field1240) {
                                            var20.method365(arg1, arg2 - -1, 50);
                                            var20.method365(arg1 + 1, arg2 + 1, 50);
                                        }
                                        if (~var32 == -2 && !super.field6802) {
                                            super.field6790[arg6][arg1][arg2 + 1] = (byte) class21.method133(super.field6790[arg6][arg1][arg2 + 1], 2);
                                        }
                                    } else if (arg0 != 2) {
                                        if (~arg0 == -4) {
                                            if (var12.field1240) {
                                                var20.method365(arg1, arg2, 50);
                                                var20.method365(arg1 + 1, arg2, 50);
                                            }
                                            if (~var32 == -2 && !super.field6802) {
                                                super.field6790[arg6][arg1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1][arg2], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field1240) {
                                            var20.method365(arg1 + 1, arg2, 50);
                                            var20.method365(arg1 - -1, arg2 + 1, 50);
                                        }
                                        if (var32 == 1 && !super.field6802) {
                                            super.field6790[arg6][arg1 + 1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1 + 1][arg2], 1);
                                        }
                                    }
                                } else {
                                    if (var12.field1240) {
                                        var20.method365(arg1, arg2, 50);
                                        var20.method365(arg1, arg2 - -1, 50);
                                    }
                                    if (~var32 == -2 && !super.field6802) {
                                        super.field6790[arg6][arg1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1][arg2], 1);
                                    }
                                }
                            }
                            if (~var12.field1245 != -1 && arg8 != null) {
                                arg8.method1481(arg0, arg2, arg1, var12.field1280, arg9, !var12.field1227, (byte) 9);
                            }
                            if (~var12.field1276 != -17) {
                                class324.method1807(arg6, arg1, arg2, var12.field1276);
                            }
                        } else if (arg9 == 1) {
                            class327 var37;
                            if (var25) {
                                class486 var36 = new class486(arg7, var12, arg4, var22, var21, var23, super.field6802, arg9, arg0, var24);
                                var37 = var36;
                                if (var36.method7(false)) {
                                    var36.method12((byte) 47, arg7);
                                }
                            } else {
                                var37 = new class307(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg9, arg0, arg10);
                            }
                            class327 var38 = class413.method2478(arg6, arg1, arg2);
                            if (var38 instanceof class173) {
                                ((class173) var38).field2368 = var37;
                            } else {
                                class348.method2150(arg6, arg1, arg2, var37, (class327) null);
                            }
                            if (var12.field1240 && class431.field5879) {
                                if (~arg0 != -1) {
                                    if (~arg0 == -2) {
                                        var20.method365(arg1 + 1, arg2 + 1, 50);
                                    } else if (arg0 == 2) {
                                        var20.method365(arg1 + 1, arg2, 50);
                                    } else if (~arg0 == -4) {
                                        var20.method365(arg1, arg2, 50);
                                    }
                                } else {
                                    var20.method365(arg1, arg2 + 1, 50);
                                }
                            }
                            if (var12.field1245 != 0 && arg8 != null) {
                                arg8.method1481(arg0, arg2, arg1, var12.field1280, arg9, !var12.field1227, (byte) 9);
                            }
                        } else if (arg9 == 2) {
                            int var39 = arg0 + 1 & 3;
                            class327 var42;
                            class327 var43;
                            if (var25) {
                                class486 var40 = new class486(arg7, var12, arg4, var22, var21, var23, super.field6802, arg9, arg0 + 4, var24);
                                class486 var41 = new class486(arg7, var12, arg4, var22, var21, var23, super.field6802, arg9, var39, var24);
                                if (var40.method7(false)) {
                                    var40.method12((byte) 122, arg7);
                                }
                                var42 = var40;
                                var43 = var41;
                                if (var41.method7(false)) {
                                    var41.method12((byte) 55, arg7);
                                }
                            } else {
                                var42 = new class307(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg9, arg0 - -4, arg10);
                                var43 = new class307(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg9, var39, arg10);
                            }
                            class348.method2150(arg6, arg1, arg2, var42, var43);
                            if (~var12.field1242 == -2 && class431.field5879 && !super.field6802) {
                                if (~arg0 != -1) {
                                    if (~arg0 != -2) {
                                        if (~arg0 == -3) {
                                            super.field6790[arg6][arg1 + 1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1 + 1][arg2], 1);
                                            super.field6790[arg6][arg1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1][arg2], 2);
                                        } else if (~arg0 == -4) {
                                            super.field6790[arg6][arg1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1][arg2], 2);
                                            super.field6790[arg6][arg1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1][arg2], 1);
                                        }
                                    } else {
                                        super.field6790[arg6][arg1][arg2 + 1] = (byte) class21.method133(super.field6790[arg6][arg1][arg2 + 1], 2);
                                        super.field6790[arg6][arg1 + 1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1 + 1][arg2], 1);
                                    }
                                } else {
                                    super.field6790[arg6][arg1][arg2] = (byte) class21.method133(super.field6790[arg6][arg1][arg2], 1);
                                    super.field6790[arg6][arg1][arg2 + 1] = (byte) class21.method133(super.field6790[arg6][arg1][arg2 + 1], 2);
                                }
                            }
                            if (~var12.field1245 != -1 && arg8 != null) {
                                arg8.method1481(arg0, arg2, arg1, var12.field1280, arg9, !var12.field1227, (byte) 9);
                            }
                            if (~var12.field1276 != -17) {
                                class324.method1807(arg6, arg1, arg2, var12.field1276);
                            }
                        } else if (~arg9 == -4) {
                            class327 var45;
                            if (var25) {
                                class486 var44 = new class486(arg7, var12, arg4, var22, var21, var23, super.field6802, arg9, arg0, var24);
                                var45 = var44;
                                if (var44.method7(false)) {
                                    var44.method12((byte) 69, arg7);
                                }
                            } else {
                                var45 = new class307(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg9, arg0, arg10);
                            }
                            class327 var46 = class413.method2478(arg6, arg1, arg2);
                            if (var46 instanceof class173) {
                                ((class173) var46).field2368 = var45;
                            } else {
                                class348.method2150(arg6, arg1, arg2, var45, (class327) null);
                            }
                            if (var12.field1240 && class431.field5879) {
                                if (arg0 == 0) {
                                    var20.method365(arg1, arg2 - -1, 50);
                                } else if (arg0 != 1) {
                                    if (arg0 == 2) {
                                        var20.method365(arg1 + 1, arg2, 50);
                                    } else if (~arg0 == -4) {
                                        var20.method365(arg1, arg2, 50);
                                    }
                                } else {
                                    var20.method365(arg1 + 1, arg2 - -1, 50);
                                }
                            }
                            if (~var12.field1245 != -1 && arg8 != null) {
                                arg8.method1481(arg0, arg2, arg1, var12.field1280, arg9, !var12.field1227, (byte) 9);
                            }
                        } else if (arg9 == 9) {
                            class471 var48;
                            if (var25) {
                                class476 var47 = new class476(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg1, arg1, arg2, arg2, arg9, arg0, var24);
                                var48 = var47;
                                if (var47.method7(false)) {
                                    var47.method12((byte) 36, arg7);
                                }
                            } else {
                                var48 = new class1(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg1, arg1 - -var13 + -1, arg2, arg2 - -var14 + -1, arg9, arg0, arg10);
                            }
                            class471 var49 = class4.method29(arg6, arg1, arg2, field243 != null ? field243 : (field243 = method114("id")));
                            if (var49 instanceof class94 && ~var49.field6500 == ~arg1 && ~var49.field6491 == ~arg2) {
                                ((class94) var49).field1393 = var48;
                            } else {
                                class214.method1212(var48, false);
                            }
                            if (~var12.field1245 != -1 && arg8 != null) {
                                arg8.method1482(var12.field1280, var14, arg1, !var12.field1227, arg2, false, var13);
                            }
                            if (var12.field1276 != 16) {
                                class324.method1807(arg6, arg1, arg2, var12.field1276);
                            }
                        } else if (~arg9 == -5) {
                            class451 var50;
                            if (!var25) {
                                var50 = new class8(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, 0, 0, 0, arg9, arg0, arg10);
                            } else {
                                class332 var51 = new class332(arg7, var12, arg4, var22, var21, var23, super.field6802, 0, 0, 0, arg9, arg0);
                                if (var51.method7(false)) {
                                    var51.method12((byte) 32, arg7);
                                }
                                var50 = var51;
                            }
                            class451 var52 = class425.method2509(arg6, arg1, arg2);
                            if (var52 instanceof class127) {
                                ((class127) var52).field1865 = var50;
                            } else {
                                class9.method61(arg6, arg1, arg2, var50, (class451) null);
                            }
                        } else if (~arg9 == -6) {
                            int var53 = 16;
                            class381 var54 = (class381) class413.method2478(arg6, arg1, arg2);
                            if (var54 != null) {
                                var53 = class1.field23.method935(var54.method13(103), (byte) 42).field1276;
                            }
                            class451 var55;
                            if (!var25) {
                                var55 = new class8(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, 0, class151.field2135[arg0] * var53, class266.field3508[arg0] * var53, arg9, arg0, arg10);
                            } else {
                                class332 var56 = new class332(arg7, var12, arg4, var22, var21, var23, super.field6802, 0, class151.field2135[arg0] * var53, class266.field3508[arg0] * var53, arg9, arg0);
                                var55 = var56;
                                if (var56.method7(false)) {
                                    var56.method12((byte) 116, arg7);
                                }
                            }
                            class451 var57 = class425.method2509(arg6, arg1, arg2);
                            if (var57 instanceof class127) {
                                ((class127) var57).field1865 = var55;
                            } else {
                                class9.method61(arg6, arg1, arg2, var55, (class451) null);
                            }
                        } else if (arg9 == 6) {
                            int var58 = 8;
                            class381 var59 = (class381) class413.method2478(arg6, arg1, arg2);
                            if (var59 != null) {
                                var58 = class1.field23.method935(var59.method13(102), (byte) 125).field1276 / 2;
                            }
                            class451 var61;
                            if (var25) {
                                class332 var60 = new class332(arg7, var12, arg4, var22, var21, var23, super.field6802, arg0, class151.field2135[arg0] * var58, class266.field3508[arg0] * var58, arg9, arg0 + 4);
                                var61 = var60;
                                if (var60.method7(false)) {
                                    var60.method12((byte) 109, arg7);
                                }
                            } else {
                                var61 = new class8(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg0, class252.field3364[arg0] * var58, class467.field6462[arg0] * var58, arg9, arg0 + 4, arg10);
                            }
                            class451 var62 = class425.method2509(arg6, arg1, arg2);
                            if (var62 instanceof class127) {
                                ((class127) var62).field1865 = var61;
                            } else {
                                class9.method61(arg6, arg1, arg2, var61, (class451) null);
                            }
                        } else if (~arg9 == -8) {
                            int var63 = 3 & arg0 + 2;
                            class451 var65;
                            if (var25) {
                                class332 var64 = new class332(arg7, var12, arg4, var22, var21, var23, super.field6802, var63, 0, 0, arg9, var63 + 4);
                                if (var64.method7(false)) {
                                    var64.method12((byte) 60, arg7);
                                }
                                var65 = var64;
                            } else {
                                var65 = new class8(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, var63, 0, 0, arg9, var63 + 4, arg10);
                            }
                            class451 var66 = class425.method2509(arg6, arg1, arg2);
                            if (var66 instanceof class127) {
                                ((class127) var66).field1865 = var65;
                            } else {
                                class9.method61(arg6, arg1, arg2, var65, (class451) null);
                            }
                        } else if (arg9 == 8) {
                            int var67 = 3 & arg0 + 2;
                            int var68 = 8;
                            class381 var69 = (class381) class413.method2478(arg6, arg1, arg2);
                            if (var69 != null) {
                                var68 = class1.field23.method935(var69.method13(123), (byte) 70).field1276 / 2;
                            }
                            class451 var72;
                            class451 var73;
                            if (var25) {
                                class332 var70 = new class332(arg7, var12, arg4, var22, var21, var23, super.field6802, arg0, class252.field3364[arg0] * var68, class467.field6462[arg0] * var68, arg9, arg0 + 4);
                                class332 var71 = new class332(arg7, var12, arg4, var22, var21, var23, super.field6802, arg0, 0, 0, arg9, var67 + 4);
                                if (var70.method7(false)) {
                                    var70.method12((byte) 103, arg7);
                                }
                                var72 = var70;
                                if (var71.method7(false)) {
                                    var71.method12((byte) 54, arg7);
                                }
                                var73 = var71;
                            } else {
                                class8 var74 = new class8(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg0, class252.field3364[arg0] * var68, class467.field6462[arg0] * var68, arg9, arg0 + 4, arg10);
                                class8 var75 = new class8(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg0, 0, 0, arg9, var67 - -4, arg10);
                                var72 = var74;
                                var73 = var75;
                            }
                            class9.method61(arg6, arg1, arg2, var72, var73);
                        }
                    } else {
                        class476 var76 = null;
                        int var78;
                        class471 var79;
                        if (var25) {
                            class476 var77 = new class476(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg1, arg1 + -1 - -var13, arg2, arg2 + var14 + -1, arg9, arg0, var24);
                            var78 = var77.method2783(91);
                            var76 = var77;
                            var79 = var77;
                        } else {
                            var79 = new class1(arg7, var12, arg6, arg4, var22, var21, var23, super.field6802, arg1, arg1 + var13 + -1, arg2, var14 + -1 + arg2, arg9, arg0, arg10);
                            var78 = 15;
                        }
                        class471 var80 = class4.method29(arg6, arg1, arg2, field243 != null ? field243 : (field243 = method114("id")));
                        boolean var81 = false;
                        if (var80 instanceof class94 && var80.field6500 == arg1 && ~var80.field6491 == ~arg2) {
                            ((class94) var80).field1393 = var79;
                            var81 = true;
                        }
                        if (var81 || class214.method1212(var79, false)) {
                            if (var76 != null && var76.method7(false)) {
                                var76.method12((byte) 47, arg7);
                            }
                            if (var12.field1240 && class431.field5879) {
                                if (var78 > 30) {
                                    var78 = 30;
                                }
                                for (int var82 = 0; var13 >= var82; ++var82) {
                                    for (int var83 = 0; ~var83 >= ~var14; ++var83) {
                                        var20.method365(arg1 + var82, arg2 + var83, var78);
                                    }
                                }
                            }
                        }
                        if (~var12.field1245 != -1 && arg8 != null) {
                            arg8.method1482(var12.field1280, var14, arg1, !var12.field1227, arg2, false, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)Z")
    public static final boolean method110(int arg0, int arg1, int arg2) {
        int var3 = class448.field6103[arg0][arg1][arg2];
        if (-class288.field3885 == var3) {
            return false;
        } else if (class288.field3885 == var3) {
            return true;
        } else {
            int var4 = arg1 << class302.field4025;
            int var5 = arg2 << class302.field4025;
            if (class472.method2772(var4 + 1, class221.field2945[arg0].method371(arg1, arg2), var5 + 1) && class472.method2772(class230.field3020 + var4 - 1, class221.field2945[arg0].method371(arg1 + 1, arg2), var5 + 1) && class472.method2772(class230.field3020 + var4 - 1, class221.field2945[arg0].method371(arg1 + 1, arg2 + 1), class230.field3020 + var5 - 1) && class472.method2772(var4 + 1, class221.field2945[arg0].method371(arg1, arg2 + 1), class230.field3020 + var5 - 1)) {
                class448.field6103[arg0][arg1][arg2] = class288.field3885;
                return true;
            } else {
                class448.field6103[arg0][arg1][arg2] = -class288.field3885;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIII[BBILwm;[Ldg;II)V")
    public final void method111(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5, int arg6, class364 arg7, class261[] arg8, int arg9, int arg10) {
        if (arg5 == -24) {
            ++field242;
            class32 var12 = new class32(arg4);
            int var13 = -1;
            while (true) {
                int var14 = var12.method225((byte) -9);
                if (var14 == 0) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method203((byte) -121);
                    if (var16 == 0) {
                        break;
                    }
                    var15 += var16 - 1;
                    int var17 = 63 & var15;
                    int var18 = var15 >> 6 & 63;
                    int var19 = var15 >> 12;
                    int var20 = var12.method201((byte) -122);
                    int var21 = var20 >> 2;
                    int var22 = var20 & 3;
                    if (arg1 == var19 && var18 >= arg3 && arg3 - -8 > var18 && ~arg10 >= ~var17 && ~(arg10 + 8) < ~var17) {
                        class88 var23 = class1.field23.method935(var13, (byte) -104);
                        int var24 = arg6 + class88.method569(var18 & 7, (byte) -122, arg0, var22, var23.field1305, var23.field1249, var17 & 7);
                        int var25 = arg9 + class447.method2629(arg0, var22, var18 & 7, -31724, var23.field1305, 7 & var17, var23.field1249);
                        if (~var24 < -1 && ~var25 < -1 && super.field6799 - 1 > var24 && ~var25 > ~(super.field6812 + -1)) {
                            class261 var26 = null;
                            if (!super.field6802) {
                                int var27 = arg2;
                                if ((2 & class1.field26[1][var24][var25]) == 2) {
                                    var27 = arg2 - 1;
                                }
                                if (var27 >= 0) {
                                    var26 = arg8[var27];
                                }
                            }
                            this.method109(arg0 + var22 & 3, var24, var25, var13, arg2, -4, arg2, arg7, var26, var21, -1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IILdg;IIILwm;)V")
    public final void method112(int arg0, int arg1, class261 arg2, int arg3, int arg4, int arg5, class364 arg6) {
        ++field234;
        class381 var8 = null;
        if (~arg3 == -1) {
            var8 = (class381) class413.method2478(arg0, arg1, arg4);
        }
        int var9 = -102 % ((arg5 - -63) / 36);
        if (arg3 == 1) {
            var8 = (class381) class425.method2509(arg0, arg1, arg4);
        }
        if (arg3 == 2) {
            var8 = (class381) class4.method29(arg0, arg1, arg4, field243 != null ? field243 : (field243 = method114("id")));
        }
        if (arg3 == 3) {
            var8 = (class381) class146.method870(arg0, arg1, arg4);
        }
        if (var8 != null) {
            class88 var10 = class1.field23.method935(var8.method13(121), (byte) -68);
            int var11 = var8.method4(-10666);
            int var12 = var8.method9(-769);
            if (var10.method563((byte) -77)) {
                class129.method793(arg0, arg1, arg4, 90, var10);
            }
            if (var8.method7(false)) {
                var8.method16(arg6, 31591);
            }
            if (arg3 != 0) {
                if (~arg3 == -2) {
                    class451 var13 = class425.method2509(arg0, arg1, arg4);
                    if (var13 instanceof class127) {
                        ((class127) var13).field1865 = null;
                        return;
                    }
                    class244.method1361(arg0, arg1, arg4);
                    return;
                }
                if (arg3 != 2) {
                    if (arg3 == 3) {
                        class354 var14 = class146.method870(arg0, arg1, arg4);
                        if (!(var14 instanceof class183)) {
                            class187.method1080(arg0, arg1, arg4);
                        } else {
                            ((class183) var14).field2519 = null;
                        }
                        if (var10.field1245 == 1) {
                            arg2.method1471(arg1, arg4, 0);
                            return;
                        }
                    }
                    return;
                }
                class471 var15 = class4.method29(arg0, arg1, arg4, field243 != null ? field243 : (field243 = method114("id")));
                if (var15 instanceof class94 && var15.field6500 == arg1 && ~var15.field6491 == ~arg4) {
                    ((class94) var15).field1393 = null;
                } else {
                    class486.method2820(arg0, arg1, arg4, field243 != null ? field243 : (field243 = method114("id")));
                }
                if (~var10.field1245 != -1 && super.field6799 > arg1 - -var10.field1305 && var10.field1305 + arg4 < super.field6812 && super.field6799 > arg1 - -var10.field1249 && var10.field1249 + arg4 < super.field6812) {
                    arg2.method1484(var12, var10.field1305, !var10.field1227, var10.field1280, (byte) -110, arg1, arg4, var10.field1249);
                    return;
                }
                return;
            }
            class327 var16 = class413.method2478(arg0, arg1, arg4);
            if (var16 instanceof class173) {
                ((class173) var16).field2368 = null;
            } else {
                class220.method1250(arg0, arg1, arg4);
            }
            if (var10.field1245 != 0) {
                arg2.method1468(var10.field1280, !var10.field1227, 86, arg1, arg4, var12, var11);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIZ)V")
    public class17(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class395.field5481, class119.field1742);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([Ldg;II[BILwm;)V")
    public final void method113(class261[] arg0, int arg1, int arg2, byte[] arg3, int arg4, class364 arg5) {
        ++field232;
        class32 var7 = new class32(arg3);
        if (arg1 <= -58) {
            int var8 = -1;
            while (true) {
                int var9 = var7.method225((byte) -9);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method203((byte) -123);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = (4045 & var10) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method201((byte) -124);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg4 + var13;
                    int var19 = var12 - -arg2;
                    if (~var18 < -1 && ~var19 < -1 && var18 < super.field6799 + -1 && super.field6812 - 1 > var19) {
                        class261 var20 = null;
                        if (!super.field6802) {
                            int var21 = var14;
                            if (~(2 & class1.field26[1][var18][var19]) == -3) {
                                var21 = var14 - 1;
                            }
                            if (var21 >= 0) {
                                var20 = arg0[var21];
                            }
                        }
                        this.method109(var17, var18, var19, var8, var14, 127, var14, arg5, var20, var16, -1);
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method114(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
