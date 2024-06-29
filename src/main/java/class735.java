import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class735 extends class448 {

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    public int field10246 = 99;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field10241;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field10243;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field10245;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "Lfp;")
    public static class323 field10238;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ql", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field10248;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[BILha;IIIIII[Luu;)V")
    public final void method4111(int arg0, byte[] arg1, int arg2, class58 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class285[] arg10) {
        ++field10245;
        class675 var12 = new class675(arg1);
        int var13 = -1;
        if (arg9 > -122) {
            this.method4111(-103, (byte[]) null, -67, (class58) null, 27, 46, -73, -123, -8, -36, (class285[]) null);
        }
        while (true) {
            int var14 = var12.method3755(-2);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method3693(114);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = (4046 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method3750((byte) 35);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg2 == ~var19 && var18 >= arg6 && var18 < arg6 + 8 && ~arg7 >= ~var17 && arg7 + 8 > var17) {
                    class10 var23 = class612.field8588.method558((byte) -79, var13);
                    int var24 = class254.method1682(7 & var17, var23.field225, var18 & 7, var23.field230, arg4, var22, true) + arg5;
                    int var25 = arg0 - -class654.method3599(var23.field225, 31172, var23.field230, 7 & var18, var17 & 7, arg4, var22);
                    if (~var24 < -1 && ~var25 < -1 && var24 < super.field6351 - 1 && var25 < super.field6362 + -1) {
                        class285 var26 = null;
                        if (!super.field6356) {
                            int var27 = arg8;
                            if ((2 & class651.field8948[1][var24][var25]) == 2) {
                                var27 = arg8 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg10[var27];
                            }
                        }
                        this.method4117(arg8, arg4 + var22 & 3, -1, var13, arg8, arg3, var25, var24, (byte) -127, var26, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(IIIZ)V")
    public class735(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class470.field6672, class181.field2416);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static void method4112(int arg0) {
        field10238 = null;
        if (arg0 != 17518) {
            field10238 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;ZB)V")
    public final void method4113(class58 arg0, boolean arg1, byte arg2) {
        ++field10247;
        class135.method963();
        int var4 = 29 / ((-15 - arg2) / 55);
        if (!arg1) {
            if (super.field6366 > 1) {
                for (int var5 = 0; var5 < super.field6351; ++var5) {
                    for (int var6 = 0; ~var6 > ~super.field6362; ++var6) {
                        if ((2 & class651.field8948[1][var5][var6]) == 2) {
                            class266.method1737(var5, var6);
                        }
                    }
                }
            }
            for (int var7 = 0; ~super.field6366 < ~var7; ++var7) {
                for (int var8 = 0; ~super.field6362 <= ~var8; ++var8) {
                    for (int var9 = 0; ~var9 >= ~super.field6351; ++var9) {
                        if (~(4 & super.field6343[var7][var9][var8]) != -1) {
                            int var10 = var9;
                            int var11 = var9;
                            int var12 = var8;
                            int var13 = var8;
                            while (var12 > 0 && ~(4 & super.field6343[var7][var9][var12 - 1]) != -1 && -var12 + var13 < 10) {
                                --var12;
                            }
                            while (super.field6362 > var13 && ~(4 & super.field6343[var7][var9][var13 + 1]) != -1 && -var12 + var13 < 10) {
                                ++var13;
                            }
                            label114: while (var10 > 0 && -var10 + var11 < 10) {
                                for (int var14 = var12; var14 <= var13; ++var14) {
                                    if ((4 & super.field6343[var7][var10 + -1][var14]) == 0) {
                                        break label114;
                                    }
                                }
                                --var10;
                            }
                            label101: while (super.field6351 > var11 && -var10 + var11 < 10) {
                                for (int var15 = var12; ~var15 >= ~var13; ++var15) {
                                    if ((4 & super.field6343[var7][var11 + 1][var15]) == 0) {
                                        break label101;
                                    }
                                }
                                ++var11;
                            }
                            if (~((-var12 + var13 - -1) * (-var10 + 1 + var11)) <= -5) {
                                int var16 = super.field6352[var7][var10][var12];
                                class626.method3512(var10 << 9, var16, var16, var7, -116, (var13 << 9) + 512, var12 << 9, 4, (var11 << 9) + 512);
                                for (int var17 = var10; var11 >= var17; ++var17) {
                                    for (int var18 = var12; ~var18 >= ~var13; ++var18) {
                                        super.field6343[var7][var17][var18] = (byte) class286.method1877(super.field6343[var7][var17][var18], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class136.method970((byte) 8);
        }
        super.field6343 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lee;I[ILha;II)V")
    public final void method4114(class675 arg0, int arg1, int[] arg2, class58 arg3, int arg4, int arg5) {
        ++field10242;
        if (!super.field6356) {
            boolean var7 = false;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            class144 var8 = null;
            while (true) {
                while (~arg0.field9146 > ~arg0.field9154.length) {
                    int var19 = arg0.method3750((byte) 35);
                    if (var19 == 0) {
                        var8 = new class144(arg0);
                    } else if (var19 == 1) {
                        int var35 = arg0.method3750((byte) 35);
                        if (~var35 < -1) {
                            for (int var36 = 0; var35 > var36; ++var36) {
                                class244 var37 = new class244(arg3, arg0, 2);
                                if (var37.field3261 == 31) {
                                    class125 var38 = class538.field7542.method207(arg0.method3757((byte) -65), 31);
                                    var37.method1560((byte) 124, var38.field1508, var38.field1513, var38.field1512, var38.field1516);
                                }
                                if (~arg3.method404() < -1) {
                                    class465 var39 = var37.field3265;
                                    int var40 = var39.method2772(false) + (arg5 << 9);
                                    int var41 = (arg4 << 9) + var39.method2773(true);
                                    int var42 = var40 >> 9;
                                    int var43 = var41 >> 9;
                                    if (var42 >= 0 && ~var43 <= -1 && ~super.field6351 < ~var42 && super.field6362 > var43) {
                                        var39.method1046(var40, var41, super.field6352[var37.field3253][var42][var43] + -var39.method2774(-15), 16);
                                        class475.method2840(var37);
                                    }
                                }
                            }
                        }
                    } else if (var19 == 2) {
                        if (var8 == null) {
                            var8 = new class144();
                        }
                        var8.method1005(-113, arg0);
                    } else if (var19 == 128) {
                        if (arg2 != null) {
                            arg2[0] = arg0.method3757((byte) -65);
                            arg2[1] = arg0.method3706((byte) 13);
                            arg2[2] = arg0.method3706((byte) -119);
                            arg2[3] = arg0.method3706((byte) -116);
                            arg2[4] = arg0.method3757((byte) -65);
                        } else {
                            arg0.field9146 += 10;
                        }
                    } else {
                        if (~var19 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field6342 == null) {
                            super.field6342 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var20 = 0; var20 < 4; ++var20) {
                            byte var21 = arg0.method3719(1854307120);
                            if (~var21 == -1 && super.field6342[var20] != null) {
                                int var22 = arg5;
                                int var23 = arg5 - -64;
                                int var24 = arg4;
                                if (arg5 >= 0) {
                                    if (arg5 >= super.field6351) {
                                        var22 = super.field6351;
                                    }
                                } else {
                                    var22 = 0;
                                }
                                if (arg4 < 0) {
                                    var24 = 0;
                                } else if (~super.field6362 >= ~arg4) {
                                    var24 = super.field6362;
                                }
                                if (var23 >= 0) {
                                    if (super.field6351 <= var23) {
                                        var23 = super.field6351;
                                    }
                                } else {
                                    var23 = 0;
                                }
                                int var25 = arg4 + 64;
                                if (var25 < 0) {
                                    var25 = 0;
                                } else if (~var25 <= ~super.field6362) {
                                    var25 = super.field6362;
                                }
                                while (var22 < var23) {
                                    while (var24 < var25) {
                                        super.field6342[var20][var22][var24] = 0;
                                        ++var24;
                                    }
                                    ++var22;
                                }
                            } else if (var21 != 1) {
                                if (~var21 == -3) {
                                    if (super.field6342[var20] == null) {
                                        super.field6342[var20] = new byte[super.field6351 + 1][super.field6362 - -1];
                                    }
                                    if (var20 > 0) {
                                        int var26 = arg5;
                                        int var27 = arg5 + 64;
                                        int var28 = arg4;
                                        if (arg4 >= 0) {
                                            if (~super.field6362 >= ~arg4) {
                                                var28 = super.field6362;
                                            }
                                        } else {
                                            var28 = 0;
                                        }
                                        int var29 = arg4 - -64;
                                        if (arg5 < 0) {
                                            var26 = 0;
                                        } else if (~super.field6351 >= ~arg5) {
                                            var26 = super.field6351;
                                        }
                                        if (~var27 > -1) {
                                            var27 = 0;
                                        } else if (super.field6351 <= var27) {
                                            var27 = super.field6351;
                                        }
                                        if (~var29 > -1) {
                                            var29 = 0;
                                        } else if (~var29 <= ~super.field6362) {
                                            var29 = super.field6362;
                                        }
                                        while (var27 > var26) {
                                            while (var28 < var29) {
                                                super.field6342[var20][var26][var28] = super.field6342[var20 - 1][var26][var28];
                                                ++var28;
                                            }
                                            ++var26;
                                        }
                                    }
                                }
                            } else {
                                if (super.field6342[var20] == null) {
                                    super.field6342[var20] = new byte[super.field6351 + 1][super.field6362 - -1];
                                }
                                for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                    for (int var31 = 0; ~var31 > -65; var31 += 4) {
                                        byte var32 = arg0.method3719(1854307120);
                                        for (int var33 = arg5 + var30; ~var33 > ~(var30 - -4 + arg5); ++var33) {
                                            for (int var34 = var31 - -arg4; arg4 + var31 + 4 > var34; ++var34) {
                                                if (var33 >= 0 && super.field6351 > var33 && ~var34 <= -1 && super.field6362 > var34) {
                                                    super.field6342[var20][var33][var34] = var32;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int var9 = 119 % ((arg1 - 52) / 56);
                if (var8 != null) {
                    for (int var10 = 0; ~var10 > -9; ++var10) {
                        for (int var11 = 0; ~var11 > -9; ++var11) {
                            int var12 = (arg5 >> 3) + var10;
                            int var13 = (arg4 >> 3) + var11;
                            if (~var12 <= -1 && super.field6351 >> 3 > var12 && var13 >= 0 && var13 < super.field6362 >> 3) {
                                class294.method1915(var8, var12, var13, -87);
                            }
                        }
                    }
                }
                if (!var7 && super.field6342 != null) {
                    for (int var14 = 0; ~var14 > -5; ++var14) {
                        if (super.field6342[var14] != null) {
                            for (int var15 = 0; var15 < 16; ++var15) {
                                for (int var16 = 0; var16 < 16; ++var16) {
                                    int var17 = (arg5 >> 2) + var15;
                                    int var18 = (arg4 >> 2) - -var16;
                                    if (~var17 <= -1 && ~var17 > -27 && var18 >= 0 && var18 < 26) {
                                        super.field6342[var14][var17][var18] = 0;
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

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILee;I[IILha;III)V")
    public final void method4115(int arg0, int arg1, int arg2, class675 arg3, int arg4, int[] arg5, int arg6, class58 arg7, int arg8, int arg9, int arg10) {
        ++field10240;
        if (!super.field6356) {
            boolean var12 = false;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            class144 var13 = null;
            int var14 = (arg8 & 7) * 8;
            if (arg6 <= -9) {
                int var15 = (7 & arg4) * 8;
                while (true) {
                    int var21;
                    label241: do {
                        while (true) {
                            while (~arg3.field9154.length < ~arg3.field9146) {
                                int var20 = arg3.method3750((byte) 35);
                                if (~var20 != -1) {
                                    if (~var20 == -2) {
                                        var21 = arg3.method3750((byte) 35);
                                        continue label241;
                                    }
                                    if (~var20 == -3) {
                                        if (var13 == null) {
                                            var13 = new class144();
                                        }
                                        var13.method1005(-101, arg3);
                                    } else if (var20 == 128) {
                                        if (arg5 != null) {
                                            arg5[0] = arg3.method3757((byte) -65);
                                            arg5[1] = arg3.method3706((byte) 122);
                                            arg5[2] = arg3.method3706((byte) -76);
                                            arg5[3] = arg3.method3706((byte) -90);
                                            arg5[4] = arg3.method3757((byte) -65);
                                        } else {
                                            arg3.field9146 += 10;
                                        }
                                    } else {
                                        if (~var20 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field6342 == null) {
                                            super.field6342 = new byte[4][][];
                                        }
                                        for (int var32 = 0; ~var32 > -5; ++var32) {
                                            byte var33 = arg3.method3719(1854307120);
                                            if (~var33 == -1 && super.field6342[arg10] != null) {
                                                if (~var32 >= ~arg1) {
                                                    int var34 = arg9;
                                                    int var35 = arg9 + 7;
                                                    int var36 = arg0;
                                                    if (~var35 <= -1) {
                                                        if (var35 >= super.field6351) {
                                                            var35 = super.field6351;
                                                        }
                                                    } else {
                                                        var35 = 0;
                                                    }
                                                    int var37 = arg0 - -7;
                                                    if (arg0 < 0) {
                                                        var36 = 0;
                                                    } else if (super.field6362 <= arg0) {
                                                        var36 = super.field6362;
                                                    }
                                                    if (arg9 < 0) {
                                                        var34 = 0;
                                                    } else if (super.field6351 <= arg9) {
                                                        var34 = super.field6351;
                                                    }
                                                    if (var37 >= 0) {
                                                        if (~super.field6362 >= ~var37) {
                                                            var37 = super.field6362;
                                                        }
                                                    } else {
                                                        var37 = 0;
                                                    }
                                                    while (var35 > var34) {
                                                        while (~var37 < ~var36) {
                                                            super.field6342[arg10][var34][var36] = 0;
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            } else if (~var33 == -2) {
                                                if (super.field6342[arg10] == null) {
                                                    super.field6342[arg10] = new byte[super.field6351 - -1][super.field6362 + 1];
                                                }
                                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                                        byte var40 = arg3.method3719(1854307120);
                                                        if (~var32 >= ~arg1) {
                                                            for (int var41 = var38; var38 + 4 > var41; ++var41) {
                                                                for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                                    if (~var14 >= ~var41 && var14 + 8 > var41 && var15 <= var42 && ~var15 > ~(var15 + 8)) {
                                                                        int var43 = class622.method3499((byte) 16, var41 & 7, var42 & 7, arg2) + arg9;
                                                                        int var44 = class681.method3813(arg2, var42 & 7, 3, var41 & 7) + arg0;
                                                                        if (var43 >= 0 && ~super.field6351 < ~var43 && ~var44 <= -1 && super.field6362 > var44) {
                                                                            super.field6342[arg10][var43][var44] = var40;
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
                                    var13 = new class144(arg3);
                                }
                            }
                            if (var13 != null) {
                                class294.method1915(var13, arg9 >> 3, arg0 >> 3, -127);
                            }
                            if (!var12 && super.field6342 != null && super.field6342[arg10] != null) {
                                int var16 = arg9 + 7;
                                int var17 = arg0 + 7;
                                for (int var18 = arg9; var16 > var18; ++var18) {
                                    for (int var19 = arg0; ~var17 < ~var19; ++var19) {
                                        super.field6342[arg10][var18][var19] = 0;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    } while (var21 <= 0);
                    for (int var22 = 0; var21 > var22; ++var22) {
                        class244 var23 = new class244(arg7, arg3, 2);
                        if (~var23.field3261 == -32) {
                            class125 var24 = class538.field7542.method207(arg3.method3757((byte) -65), 31);
                            var23.method1560((byte) 106, var24.field1508, var24.field1513, var24.field1512, var24.field1516);
                        }
                        if (arg7.method404() > 0) {
                            class465 var25 = var23.field3265;
                            int var26 = var25.method2772(false) >> 9;
                            int var27 = var25.method2773(true) >> 9;
                            if (~var23.field3253 == ~arg1 && ~var14 >= ~var26 && var26 < var14 + 8 && ~var27 <= ~var15 && var15 + 8 > var27) {
                                int var28 = class707.method3971(var25.method2772(false) & 4095, 201, arg2, var25.method2773(true) & 4095) + (arg9 << 9);
                                int var29 = var28 >> 9;
                                int var30 = class558.method3216(-94, arg2, var25.method2773(true) & 4095, 4095 & var25.method2772(false)) + (arg0 << 9);
                                int var31 = var30 >> 9;
                                if (~var29 <= -1 && var31 >= 0 && ~var29 > ~super.field6351 && var31 < super.field6362) {
                                    var25.method1046(var28, var30, super.field6352[arg1][var29][var31] - var25.method2774(105), 16);
                                    class475.method2840(var23);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;I[Luu;II[B)V")
    public final void method4116(class58 arg0, int arg1, class285[] arg2, int arg3, int arg4, byte[] arg5) {
        ++field10244;
        if (arg4 == 3) {
            class675 var7 = new class675(arg5);
            int var8 = -1;
            while (true) {
                int var9 = var7.method3755(arg4 + -5);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method3693(-100);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 - 1;
                    int var12 = 63 & var10;
                    int var13 = var10 >> 6 & 63;
                    int var14 = var10 >> 12;
                    int var15 = var7.method3750((byte) 35);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = var13 - -arg1;
                    int var19 = arg3 + var12;
                    if (var18 > 0 && var19 > 0 && ~(super.field6351 + -1) < ~var18 && ~var19 > ~(super.field6362 + -1)) {
                        class285 var20 = null;
                        if (!super.field6356) {
                            int var21 = var14;
                            if ((2 & class651.field8948[1][var18][var19]) == 2) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg2[var21];
                            }
                        }
                        this.method4117(var14, var17, -1, var8, var14, arg0, var19, var18, (byte) -127, var20, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIILha;IIBLuu;I)V")
    public final void method4117(int arg0, int arg1, int arg2, int arg3, int arg4, class58 arg5, int arg6, int arg7, byte arg8, class285 arg9, int arg10) {
        ++field10243;
        if (class557.field7812.field6532.method1419(false) != 0 || class325.method2113(arg6, -1, arg4, arg7, class310.field4320)) {
            if (this.field10246 > arg0) {
                this.field10246 = arg0;
            }
            class10 var12 = class612.field8588.method558((byte) 23, arg3);
            if (~class557.field7812.field6522.method2865(false) != -1 || !var12.field186) {
                if (arg8 != -127) {
                    this.method4114((class675) null, 64, (int[]) null, (class58) null, -43, 64);
                }
                int var13;
                int var14;
                if (arg1 != 1 && arg1 != 3) {
                    var13 = var12.field230;
                    var14 = var12.field225;
                } else {
                    var14 = var12.field230;
                    var13 = var12.field225;
                }
                int var15;
                int var16;
                if (~(arg7 + var14) < ~super.field6351) {
                    var15 = arg7;
                    var16 = arg7 + 1;
                } else {
                    var15 = (var14 >> 1) + arg7;
                    var16 = (var14 + 1 >> 1) + arg7;
                }
                int var17;
                int var18;
                if (~(arg6 + var13) >= ~super.field6362) {
                    var17 = arg6 - -(var13 - -1 >> 1);
                    var18 = arg6 - -(var13 >> 1);
                } else {
                    var18 = arg6;
                    var17 = arg6 + 1;
                }
                class278 var19 = class459.field6474[arg4];
                int var20 = var19.method1816((byte) 127, var18, var15) - -var19.method1816((byte) 122, var18, var16) - (-var19.method1816((byte) 20, var17, var15) + -var19.method1816((byte) 123, var17, var16)) >> 2;
                int var21 = (arg7 << 9) - -(var14 << 8);
                int var22 = (arg6 << 9) + (var13 << 8);
                boolean var23 = class156.field2179 && !super.field6356 && var12.field224;
                if (var12.method62((byte) 114)) {
                    class209.method1283(var12, arg6, arg1, (class280) null, arg0, arg7, -106, (class468) null);
                }
                boolean var24 = ~arg2 == 0 && ~var12.field231 == 0 && var12.field212 == null && var12.field226 == null && !var12.field158;
                if (!class633.field8731 || (!class522.method3059((byte) -59, arg10) || var12.field195 == 1) && (!class176.method1121(arg10, arg8 ^ -5) || var12.field195 != 0)) {
                    if (~arg10 == -23) {
                        if (class557.field7812.field6528.method3559(false) != 0 || var12.field207 != 0 || var12.field228 == 1 || var12.field147) {
                            class526 var25;
                            if (!var24) {
                                var25 = new class440(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg1, arg2);
                            } else {
                                class347 var26 = new class347(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg1, var23);
                                if (var26.method867((byte) 119)) {
                                    var26.method860(30, arg5);
                                }
                                var25 = var26;
                            }
                            class13.method83(arg0, arg7, arg6, var25);
                            if (~var12.field228 == -2 && arg9 != null) {
                                arg9.method1860(arg6, arg7, false);
                            }
                        }
                    } else if (~arg10 != -11 && ~arg10 != -12) {
                        if (arg10 >= 12 && arg10 <= 17 || ~arg10 <= -19 && ~arg10 >= -22) {
                            class524 var28;
                            if (var24) {
                                class417 var27 = new class417(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg7, arg7 + var14 + -1, arg6, arg6 + var13 - 1, arg10, arg1, var23);
                                if (var27.method867((byte) 108)) {
                                    var27.method860(83, arg5);
                                }
                                var28 = var27;
                            } else {
                                var28 = new class746(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg7, arg7 + -1 + var14, arg6, arg6 + var13 + -1, arg10, arg1, arg2);
                            }
                            class505.method2989(var28, false);
                            if (class156.field2179 && !super.field6356 && arg10 >= 12 && ~arg10 >= -18 && ~arg10 != -14 && ~arg0 < -1 && ~var12.field195 != -1) {
                                super.field6343[arg0][arg7][arg6] = (byte) class325.method2116(super.field6343[arg0][arg7][arg6], 4);
                            }
                            if (var12.field228 != 0 && arg9 != null) {
                                arg9.method1874(arg6, var14, var12.field161, 256, var13, arg7, !var12.field167);
                            }
                        } else if (arg10 == 0) {
                            int var29 = var12.field195;
                            if (class508.field7269 && ~var12.field195 == 0) {
                                var29 = 1;
                            }
                            class444 var31;
                            if (var24) {
                                class557 var30 = new class557(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, arg1, var23);
                                if (var30.method867((byte) 104)) {
                                    var30.method860(58, arg5);
                                }
                                var31 = var30;
                            } else {
                                var31 = new class586(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, arg1, arg2);
                            }
                            class281.method1850(arg0, arg7, arg6, var31, (class444) null);
                            if (arg1 != 0) {
                                if (~arg1 == -2) {
                                    if (class156.field2179 && var12.field214) {
                                        var19.method1809(arg7, arg6 + 1, 50);
                                        var19.method1809(arg7 + 1, arg6 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field6356) {
                                        class524.method3065(arg6 + 1, arg0, arg7, -var12.field173, 2, var12.field200, (byte) -48);
                                    }
                                } else if (arg1 == 2) {
                                    if (class156.field2179 && var12.field214) {
                                        var19.method1809(arg7 + 1, arg6, 50);
                                        var19.method1809(arg7 + 1, arg6 - -1, 50);
                                    }
                                    if (var29 == 1 && !super.field6356) {
                                        class524.method3065(arg6, arg0, arg7 + 1, -var12.field173, 1, var12.field200, (byte) 126);
                                    }
                                } else if (arg1 == 3) {
                                    if (class156.field2179 && var12.field214) {
                                        var19.method1809(arg7, arg6, 50);
                                        var19.method1809(arg7 + 1, arg6, 50);
                                    }
                                    if (var29 == 1 && !super.field6356) {
                                        class524.method3065(arg6, arg0, arg7, var12.field173, 2, var12.field200, (byte) -34);
                                    }
                                }
                            } else {
                                if (class156.field2179 && var12.field214) {
                                    var19.method1809(arg7, arg6, 50);
                                    var19.method1809(arg7, arg6 - -1, 50);
                                }
                                if (var29 == 1 && !super.field6356) {
                                    class524.method3065(arg6, arg0, arg7, var12.field173, 1, var12.field200, (byte) -50);
                                }
                            }
                            if (~var12.field228 != -1 && arg9 != null) {
                                arg9.method1857(arg7, arg1, arg6, 1, !var12.field167, arg10, var12.field161);
                            }
                            if (var12.field155 != 64) {
                                class419.method2572(arg0, arg7, arg6, var12.field155);
                            }
                        } else if (arg10 == 1) {
                            class444 var32;
                            if (!var24) {
                                var32 = new class586(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, arg1, arg2);
                            } else {
                                class557 var33 = new class557(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, arg1, var23);
                                var32 = var33;
                                if (var33.method867((byte) 93)) {
                                    var33.method860(115, arg5);
                                }
                            }
                            class281.method1850(arg0, arg7, arg6, var32, (class444) null);
                            if (var12.field214 && class156.field2179) {
                                if (arg1 == 0) {
                                    var19.method1809(arg7, arg6 + 1, 50);
                                } else if (~arg1 == -2) {
                                    var19.method1809(arg7 - -1, arg6 + 1, 50);
                                } else if (arg1 != 2) {
                                    if (~arg1 == -4) {
                                        var19.method1809(arg7, arg6, 50);
                                    }
                                } else {
                                    var19.method1809(arg7 - -1, arg6, 50);
                                }
                            }
                            if (var12.field228 != 0 && arg9 != null) {
                                arg9.method1857(arg7, arg1, arg6, arg8 ^ -128, !var12.field167, arg10, var12.field161);
                            }
                        } else if (~arg10 == -3) {
                            int var34 = 3 & arg1 - -1;
                            class444 var35;
                            class444 var36;
                            if (!var24) {
                                var35 = new class586(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, arg1 + 4, arg2);
                                var36 = new class586(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, var34, arg2);
                            } else {
                                class557 var37 = new class557(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, arg1 + 4, var23);
                                class557 var38 = new class557(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, var34, var23);
                                if (var37.method867((byte) 85)) {
                                    var37.method860(111, arg5);
                                }
                                var36 = var38;
                                var35 = var37;
                                if (var38.method867((byte) 100)) {
                                    var38.method860(81, arg5);
                                }
                            }
                            class281.method1850(arg0, arg7, arg6, var35, var36);
                            if ((var12.field195 == 1 || class508.field7269 && var12.field195 == -1) && !super.field6356) {
                                if (~arg1 == -1) {
                                    class524.method3065(arg6, arg0, arg7, var12.field173, 1, var12.field200, (byte) 124);
                                    class524.method3065(arg6 + 1, arg0, arg7, var12.field173, 2, var12.field200, (byte) -89);
                                } else if (arg1 != 1) {
                                    if (arg1 == 2) {
                                        class524.method3065(arg6, arg0, arg7 + 1, var12.field173, 1, var12.field200, (byte) 126);
                                        class524.method3065(arg6, arg0, arg7, var12.field173, 2, var12.field200, (byte) -110);
                                    } else if (arg1 == 3) {
                                        class524.method3065(arg6, arg0, arg7, var12.field173, 1, var12.field200, (byte) 125);
                                        class524.method3065(arg6, arg0, arg7, var12.field173, 2, var12.field200, (byte) 124);
                                    }
                                } else {
                                    class524.method3065(arg6, arg0, arg7 + 1, var12.field173, 1, var12.field200, (byte) -40);
                                    class524.method3065(arg6 - -1, arg0, arg7, var12.field173, 2, var12.field200, (byte) 124);
                                }
                            }
                            if (var12.field228 != 0 && arg9 != null) {
                                arg9.method1857(arg7, arg1, arg6, 1, !var12.field167, arg10, var12.field161);
                            }
                            if (var12.field155 != 64) {
                                class419.method2572(arg0, arg7, arg6, var12.field155);
                            }
                        } else if (arg10 == 3) {
                            class444 var40;
                            if (var24) {
                                class557 var39 = new class557(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, arg1, var23);
                                var40 = var39;
                                if (var39.method867((byte) 119)) {
                                    var39.method860(arg8 + 235, arg5);
                                }
                            } else {
                                var40 = new class586(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg10, arg1, arg2);
                            }
                            class281.method1850(arg0, arg7, arg6, var40, (class444) null);
                            if (var12.field214 && class156.field2179) {
                                if (arg1 == 0) {
                                    var19.method1809(arg7, arg6 + 1, 50);
                                } else if (~arg1 == -2) {
                                    var19.method1809(arg7 - -1, arg6 + 1, 50);
                                } else if (arg1 != 2) {
                                    if (~arg1 == -4) {
                                        var19.method1809(arg7, arg6, 50);
                                    }
                                } else {
                                    var19.method1809(arg7 + 1, arg6, 50);
                                }
                            }
                            if (var12.field228 != 0 && arg9 != null) {
                                arg9.method1857(arg7, arg1, arg6, 1, !var12.field167, arg10, var12.field161);
                            }
                        } else if (arg10 == 9) {
                            class524 var41;
                            if (!var24) {
                                var41 = new class746(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg7, arg7 - 1 + var14, arg6, arg6 - -var13 + -1, arg10, arg1, arg2);
                            } else {
                                class417 var42 = new class417(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg7, arg7, arg6, arg6, arg10, arg1, var23);
                                if (var42.method867((byte) 113)) {
                                    var42.method860(121, arg5);
                                }
                                var41 = var42;
                            }
                            class505.method2989(var41, false);
                            if (var12.field195 == 1 && !super.field6356) {
                                byte var43;
                                if ((arg1 & 1) != 0) {
                                    var43 = 16;
                                } else {
                                    var43 = 8;
                                }
                                class524.method3065(arg6, arg0, arg7, 0, var43, var12.field200, (byte) 123);
                            }
                            if (var12.field228 != 0 && arg9 != null) {
                                arg9.method1874(arg6, var14, var12.field161, 256, var13, arg7, !var12.field167);
                            }
                            if (var12.field155 != 64) {
                                class419.method2572(arg0, arg7, arg6, var12.field155);
                            }
                        } else if (~arg10 == -5) {
                            class458 var45;
                            if (var24) {
                                class575 var44 = new class575(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, 0, 0, arg10, arg1);
                                var45 = var44;
                                if (var44.method867((byte) 93)) {
                                    var44.method860(39, arg5);
                                }
                            } else {
                                var45 = new class129(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, 0, 0, arg10, arg1, arg2);
                            }
                            class741.method4142(arg0, arg7, arg6, var45, (class458) null);
                        } else if (arg10 == 5) {
                            int var46 = 65;
                            class706 var47 = (class706) class252.method1672(arg0, arg7, arg6);
                            if (var47 != null) {
                                var46 = 1 + class612.field8588.method558((byte) 118, var47.method861((byte) -17)).field155;
                            }
                            class458 var49;
                            if (var24) {
                                class575 var48 = new class575(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, class711.field9888[arg1] * var46, class380.field5455[arg1] * var46, arg10, arg1);
                                if (var48.method867((byte) 104)) {
                                    var48.method860(74, arg5);
                                }
                                var49 = var48;
                            } else {
                                var49 = new class129(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, class711.field9888[arg1] * var46, class380.field5455[arg1] * var46, arg10, arg1, arg2);
                            }
                            class741.method4142(arg0, arg7, arg6, var49, (class458) null);
                        } else if (~arg10 == -7) {
                            int var50 = 33;
                            class706 var51 = (class706) class252.method1672(arg0, arg7, arg6);
                            if (var51 != null) {
                                var50 = 1 + class612.field8588.method558((byte) 18, var51.method861((byte) -17)).field155 / 2;
                            }
                            class458 var52;
                            if (!var24) {
                                var52 = new class129(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, class395.field5583[arg1] * var50, class473.field6719[arg1] * var50, arg10, arg1 - -4, arg2);
                            } else {
                                class575 var53 = new class575(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, class711.field9888[arg1] * var50, class380.field5455[arg1] * var50, arg10, arg1 + 4);
                                if (var53.method867((byte) 125)) {
                                    var53.method860(104, arg5);
                                }
                                var52 = var53;
                            }
                            class741.method4142(arg0, arg7, arg6, var52, (class458) null);
                        } else if (~arg10 == -8) {
                            int var54 = 3 & arg1 + 2;
                            class458 var56;
                            if (var24) {
                                class575 var55 = new class575(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, 0, 0, arg10, var54 + 4);
                                if (var55.method867((byte) 100)) {
                                    var55.method860(120, arg5);
                                }
                                var56 = var55;
                            } else {
                                var56 = new class129(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, 0, 0, arg10, var54 - -4, arg2);
                            }
                            class741.method4142(arg0, arg7, arg6, var56, (class458) null);
                        } else if (~arg10 == -9) {
                            int var57 = 3 & arg1 + 2;
                            int var58 = 33;
                            class706 var59 = (class706) class252.method1672(arg0, arg7, arg6);
                            if (var59 != null) {
                                var58 = class612.field8588.method558((byte) 33, var59.method861((byte) -17)).field155 / 2 - -1;
                            }
                            class458 var62;
                            class458 var63;
                            if (var24) {
                                class575 var60 = new class575(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, class395.field5583[arg1] * var58, class473.field6719[arg1] * var58, arg10, arg1 + 4);
                                class575 var61 = new class575(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, 0, 0, arg10, var57 - -4);
                                if (var60.method867((byte) 103)) {
                                    var60.method860(122, arg5);
                                }
                                var62 = var61;
                                var63 = var60;
                                if (var61.method867((byte) 86)) {
                                    var61.method860(arg8 + 239, arg5);
                                }
                            } else {
                                class129 var64 = new class129(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, class395.field5583[arg1] * var58, class473.field6719[arg1] * var58, arg10, arg1 + 4, arg2);
                                class129 var65 = new class129(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, 0, 0, arg10, var57 + 4, arg2);
                                var63 = var64;
                                var62 = var65;
                            }
                            class741.method4142(arg0, arg7, arg6, var63, var62);
                        }
                    } else {
                        class417 var66 = null;
                        int var68;
                        class524 var69;
                        if (var24) {
                            class417 var67 = new class417(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg7, var14 + -1 + arg7, arg6, arg6 + var13 + -1, arg10, arg1, var23);
                            var68 = var67.method2560(-83);
                            var69 = var67;
                            var66 = var67;
                        } else {
                            var69 = new class746(arg5, var12, arg0, arg4, var21, var20, var22, super.field6356, arg7, var14 + -1 + arg7, arg6, arg6 + -1 + var13, arg10, arg1, arg2);
                            var68 = 15;
                        }
                        if (class505.method2989(var69, false)) {
                            if (var66 != null && var66.method867((byte) 118)) {
                                var66.method860(98, arg5);
                            }
                            if (var12.field214 && class156.field2179) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var70 >= ~var14; ++var70) {
                                    for (int var71 = 0; ~var71 >= ~var13; ++var71) {
                                        var19.method1809(arg7 + var70, arg6 + var71, var68);
                                    }
                                }
                            }
                        }
                        if (~var12.field228 != -1 && arg9 != null) {
                            arg9.method1874(arg6, var14, var12.field161, 256, var13, arg7, !var12.field167);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)Lip;")
    private final class706 method4118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10241;
        class706 var6 = null;
        if (arg2 == 0) {
            var6 = (class706) class252.method1672(arg0, arg4, arg3);
        }
        if (arg2 == 1) {
            var6 = (class706) class258.method1696(arg0, arg4, arg3);
        }
        if (arg1 == arg2) {
            var6 = (class706) class243.method1557(arg0, arg4, arg3, field10248 != null ? field10248 : (field10248 = method4120("ip")));
        }
        if (~arg2 == -4) {
            var6 = (class706) class434.method2639(arg0, arg4, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILuu;Lha;IBI)V")
    public final void method4119(int arg0, int arg1, class285 arg2, class58 arg3, int arg4, byte arg5, int arg6) {
        ++field10239;
        class706 var8 = this.method4118(arg1, arg5 ^ 109, arg6, arg4, arg0);
        if (var8 != null) {
            class10 var9 = class612.field8588.method558((byte) 38, var8.method861((byte) -17));
            int var10 = var8.method868((byte) -10);
            int var11 = var8.method865(arg5 + 30263);
            if (var9.method62((byte) 114)) {
                class226.method1410(arg1, arg4, var9, arg0, 16131);
            }
            if (var8.method867((byte) 108)) {
                var8.method864(arg3, (byte) -73);
            }
            if (arg6 == 0) {
                class494.method2959(arg1, arg0, arg4);
                if (~var9.field228 != -1) {
                    arg2.method1859(var11, var9.field161, arg0, !var9.field167, arg4, 0, var10);
                }
                if (var9.field195 == 1) {
                    if (var11 != 0) {
                        if (~var11 == -2) {
                            class675.method3696(20783, arg4 + 1, 2, arg0, arg1);
                        } else if (~var11 != -3) {
                            if (var11 == 3) {
                                class675.method3696(arg5 ^ 20800, arg4, 2, arg0, arg1);
                            }
                        } else {
                            class675.method3696(20783, arg4, 1, arg0 + 1, arg1);
                        }
                    } else {
                        class675.method3696(20783, arg4, 1, arg0, arg1);
                    }
                }
            } else if (arg6 != 1) {
                if (arg6 != 2) {
                    if (arg6 == 3) {
                        class509.method3013(arg1, arg0, arg4);
                        if (var9.field228 == 1) {
                            arg2.method1868(arg4, arg0, 26964);
                        }
                    }
                } else {
                    class477.method2854(arg1, arg0, arg4, field10248 != null ? field10248 : (field10248 = method4120("ip")));
                    if (var9.field228 != 0 && var9.field225 + arg0 < super.field6351 && ~super.field6362 < ~(var9.field225 + arg4) && ~(arg0 - -var9.field230) > ~super.field6351 && var9.field230 + arg4 < super.field6362) {
                        arg2.method1858(!var9.field167, arg4, (byte) 74, arg0, var11, var9.field161, var9.field230, var9.field225);
                    }
                    if (~var10 == -10) {
                        if ((1 & var11) != 0) {
                            class675.method3696(arg5 ^ 20800, arg4, 16, arg0, arg1);
                        } else {
                            class675.method3696(20783, arg4, 8, arg0, arg1);
                        }
                    }
                }
            } else {
                class743.method4143(arg1, arg0, arg4);
            }
        }
        if (arg5 != 111) {
            this.method4114((class675) null, -81, (int[]) null, (class58) null, -55, 65);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4120(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
