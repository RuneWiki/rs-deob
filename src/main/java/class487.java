import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class487 extends class406 {

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public int field6892 = 99;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "Ljo;")
    public static class351 field6895 = new class351(24, -1);

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field6896;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field6898;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "[Ljfa;")
    public static class302[] field6897;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III[Lmja;[BLha;)V")
    public final void method2840(int arg0, int arg1, int arg2, class438[] arg3, byte[] arg4, class66 arg5) {
        if (arg2 != 4) {
            field6895 = null;
        }
        ++field6888;
        class120 var7 = new class120(arg4);
        int var8 = -1;
        while (true) {
            int var9 = var7.method863(-27847);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method890((byte) -59);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 63;
                int var13 = (var10 & 4059) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method842(2384);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg1 + var13;
                int var19 = var12 - -arg0;
                if (~var18 < -1 && ~var19 < -1 && var18 < super.field5732 + -1 && ~(super.field5742 + -1) < ~var19) {
                    class438 var20 = null;
                    if (!super.field5741) {
                        int var21 = var14;
                        if ((class617.field8700[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method2847(127, var19, var16, var17, var14, var20, var14, -1, var8, arg5, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIZ)V")
    public class487(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class483.field6864, class32.field438);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BIIIIIII[Lmja;ILha;)V")
    public final void method2841(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class438[] arg8, int arg9, class66 arg10) {
        ++field6891;
        class120 var12 = new class120(arg0);
        int var13 = arg5;
        while (true) {
            int var14 = var12.method863(-27847);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method890((byte) -59);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = (var15 & 4040) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method842(2384);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg3 == var19 && ~arg4 >= ~var18 && ~var18 > ~(arg4 + 8) && ~arg6 >= ~var17 && ~(arg6 + 8) < ~var17) {
                    class322 var23 = class496.field7061.method319(arg5 ^ 124, var13);
                    int var24 = class163.method1278(var23.field4782, var17 & 7, var22, var18 & 7, arg1, var23.field4801, arg5 + 4) + arg9;
                    int var25 = arg2 - -class118.method824(arg1, var22, 31197, var23.field4782, var17 & 7, var23.field4801, 7 & var18);
                    if (~var24 < -1 && var25 > 0 && super.field5732 + -1 > var24 && ~(super.field5742 + -1) < ~var25) {
                        class438 var26 = null;
                        if (!super.field5741) {
                            int var27 = arg7;
                            if ((class617.field8700[1][var24][var25] & 2) == 2) {
                                var27 = arg7 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg8[var27];
                            }
                        }
                        this.method2847(127, var25, var21, 3 & arg1 + var22, arg7, var26, arg7, -1, var13, arg10, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)Lija;")
    public final class362 method2842(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -31205) {
            return null;
        } else {
            ++field6889;
            class362 var6 = null;
            if (~arg2 == -1) {
                var6 = (class362) class259.method1702(arg0, arg3, arg4);
            }
            if (~arg2 == -2) {
                var6 = (class362) class143.method987(arg0, arg3, arg4);
            }
            if (~arg2 == -3) {
                var6 = (class362) class195.method1415(arg0, arg3, arg4, field6898 != null ? field6898 : (field6898 = method2849("ija")));
            }
            if (~arg2 == -4) {
                var6 = (class362) class728.method4087(arg0, arg3, arg4);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLha;I)V")
    public final void method2843(boolean arg0, class66 arg1, int arg2) {
        ++field6893;
        class288.method1926();
        if (arg2 > -54) {
            this.field6892 = 67;
        }
        if (!arg0) {
            if (super.field5736 > 1) {
                for (int var4 = 0; super.field5732 > var4; ++var4) {
                    for (int var5 = 0; var5 < super.field5742; ++var5) {
                        if (~(class617.field8700[1][var4][var5] & 2) == -3) {
                            class31.method222(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~var6 > ~super.field5736; ++var6) {
                for (int var7 = 0; super.field5742 >= var7; ++var7) {
                    for (int var8 = 0; super.field5732 >= var8; ++var8) {
                        if (~(4 & super.field5724[var6][var8][var7]) != -1) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && (4 & super.field5724[var6][var8][var11 - 1]) != 0 && -var11 + var12 < 10) {
                                --var11;
                            }
                            while (var12 < super.field5742 && ~(4 & super.field5724[var6][var8][var12 + 1]) != -1 && -var11 + var12 < 10) {
                                ++var12;
                            }
                            label117: while (~var9 < -1 && -var9 + var10 < 10) {
                                for (int var13 = var11; ~var13 >= ~var12; ++var13) {
                                    if (~(4 & super.field5724[var6][var9 - 1][var13]) == -1) {
                                        break label117;
                                    }
                                }
                                --var9;
                            }
                            label104: while (~super.field5732 < ~var10 && var10 - var9 < 10) {
                                for (int var14 = var11; var12 >= var14; ++var14) {
                                    if ((super.field5724[var6][var10 + 1][var14] & 4) == 0) {
                                        break label104;
                                    }
                                }
                                ++var10;
                            }
                            if (~((-var9 + 1 + var10) * (-var11 + var12 + 1)) <= -5) {
                                int var15 = super.field5717[var6][var9][var11];
                                class260.method1710(var9 << 9, var6, (var10 << 9) - -512, var11 << 9, 4, var15, (var12 << 9) - -512, var15, (byte) 9);
                                for (int var16 = var9; ~var16 >= ~var10; ++var16) {
                                    for (int var17 = var11; var17 <= var12; ++var17) {
                                        super.field5724[var6][var16][var17] = (byte) class111.method773(super.field5724[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class422.method2521((byte) -127);
        }
        super.field5724 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII[ILrv;ILha;III)V")
    public final void method2844(int arg0, int arg1, int arg2, int arg3, int[] arg4, class120 arg5, int arg6, class66 arg7, int arg8, int arg9, int arg10) {
        ++field6887;
        if (!super.field5741) {
            boolean var12 = false;
            class713 var13 = null;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            int var14 = (arg3 & 7) * 8;
            int var15 = (arg1 & 7) * 8;
            while (true) {
                while (~arg5.field1556.length < ~arg5.field1521) {
                    int var20 = arg5.method842(2384);
                    if (~var20 == -1) {
                        var13 = new class713(arg5);
                    } else if (~var20 == -2) {
                        int var21 = arg5.method842(2384);
                        if (~var21 < -1) {
                            for (int var22 = 0; ~var22 > ~var21; ++var22) {
                                class698 var23 = new class698(arg7, arg5, 2);
                                if (var23.field9862 == 31) {
                                    class216 var24 = class276.field3842.method2182(4774, arg5.method898((byte) -122));
                                    var23.method3940(var24.field3106, var24.field3098, 31983, var24.field3099, var24.field3101);
                                }
                                if (arg7.method471() > 0) {
                                    class578 var25 = var23.field9855;
                                    int var26 = var25.method3358((byte) 22) >> 9;
                                    int var27 = var25.method3363(-1) >> 9;
                                    if (~var23.field9869 == ~arg10 && var26 >= var14 && var26 < var14 + 8 && var27 >= var15 && ~var27 > ~(var15 - -8)) {
                                        int var28 = class141.method979(arg2, -115, 4095 & var25.method3358((byte) 22), 4095 & var25.method3363(-1)) + (arg0 << 9);
                                        int var29 = (arg8 << 9) - -class252.method1675(4095 & var25.method3363(-1), 106, 4095 & var25.method3358((byte) 22), arg2);
                                        int var30 = var28 >> 9;
                                        int var31 = var29 >> 9;
                                        if (var30 >= 0 && var31 >= 0 && super.field5732 > var30 && var31 < super.field5742) {
                                            var25.method1980(super.field5717[arg10][var30][var31] - var25.method3355(arg9 + 11519), 0, var29, var28);
                                            class568.method3304(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class713();
                        }
                        var13.method4035(arg5, (byte) -1);
                    } else if (var20 == 128) {
                        if (arg4 != null) {
                            arg4[0] = arg5.method898((byte) -114);
                            arg4[1] = arg5.method838(true);
                            arg4[2] = arg5.method838(true);
                            arg4[3] = arg5.method838(true);
                            arg4[4] = arg5.method898((byte) -106);
                        } else {
                            arg5.field1521 += 10;
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field5731 == null) {
                            super.field5731 = new byte[4][][];
                        }
                        for (int var32 = 0; ~var32 > -5; ++var32) {
                            byte var33 = arg5.method877(-252);
                            if (~var33 == -1 && super.field5731[arg6] != null) {
                                if (~arg10 <= ~var32) {
                                    int var34 = arg0;
                                    int var35 = arg0 + 7;
                                    int var36 = arg8;
                                    if (arg0 < 0) {
                                        var34 = 0;
                                    } else if (arg0 >= super.field5732) {
                                        var34 = super.field5732;
                                    }
                                    int var37 = arg8 - -7;
                                    if (~arg8 > -1) {
                                        var36 = 0;
                                    } else if (~super.field5742 >= ~arg8) {
                                        var36 = super.field5742;
                                    }
                                    if (var35 < 0) {
                                        var35 = 0;
                                    } else if (~super.field5732 >= ~var35) {
                                        var35 = super.field5732;
                                    }
                                    if (~var37 > -1) {
                                        var37 = 0;
                                    } else if (~var37 <= ~super.field5742) {
                                        var37 = super.field5742;
                                    }
                                    while (var34 < var35) {
                                        while (~var36 > ~var37) {
                                            super.field5731[arg6][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (~var33 == -2) {
                                if (super.field5731[arg6] == null) {
                                    super.field5731[arg6] = new byte[super.field5732 + 1][super.field5742 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg5.method877(-252);
                                        if (arg10 >= var32) {
                                            for (int var41 = var38; ~var41 > ~(var38 + 4); ++var41) {
                                                for (int var42 = var39; var42 < var39 + 4; ++var42) {
                                                    if (~var14 >= ~var41 && ~(var14 + 8) < ~var41 && var15 <= var42 && var15 < var15 + 8) {
                                                        int var43 = arg0 + class321.method2082(7 & var41, true, 7 & var42, arg2);
                                                        int var44 = class482.method2825(var42 & 7, (byte) -108, arg2, var41 & 7) + arg8;
                                                        if (var43 >= 0 && ~super.field5732 < ~var43 && var44 >= 0 && super.field5742 > var44) {
                                                            super.field5731[arg6][var43][var44] = var40;
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
                    class572.method3322(arg0 >> 3, var13, -66, arg8 >> 3);
                }
                if (!var12 && super.field5731 != null && super.field5731[arg6] != null) {
                    int var16 = arg0 + 7;
                    int var17 = arg8 - -7;
                    for (int var18 = arg0; var16 > var18; ++var18) {
                        for (int var19 = arg8; ~var17 < ~var19; ++var19) {
                            super.field5731[arg6][var18][var19] = 0;
                        }
                    }
                }
                if (arg9 != -11519) {
                    this.method2840(-22, 27, -60, (class438[]) null, (byte[]) null, (class66) null);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lha;ILrv;I[II)V")
    public final void method2845(class66 arg0, int arg1, class120 arg2, int arg3, int[] arg4, int arg5) {
        ++field6890;
        if (!super.field5741) {
            boolean var7 = false;
            class713 var8 = null;
            if (arg3 == 17805) {
                if (arg4 != null) {
                    arg4[0] = -1;
                }
                while (true) {
                    while (arg2.field1521 < arg2.field1556.length) {
                        int var18 = arg2.method842(arg3 + -15421);
                        if (var18 == 0) {
                            var8 = new class713(arg2);
                        } else if (~var18 == -2) {
                            int var19 = arg2.method842(2384);
                            if (var19 > 0) {
                                for (int var20 = 0; var19 > var20; ++var20) {
                                    class698 var21 = new class698(arg0, arg2, 2);
                                    if (var21.field9862 == 31) {
                                        class216 var22 = class276.field3842.method2182(4774, arg2.method898((byte) -87));
                                        var21.method3940(var22.field3106, var22.field3098, 31983, var22.field3099, var22.field3101);
                                    }
                                    if (~arg0.method471() < -1) {
                                        class578 var23 = var21.field9855;
                                        int var24 = (arg1 << 9) + var23.method3358((byte) 22);
                                        int var25 = (arg5 << 9) + var23.method3363(-1);
                                        int var26 = var24 >> 9;
                                        int var27 = var25 >> 9;
                                        if (~var26 <= -1 && ~var27 <= -1 && super.field5732 > var26 && var27 < super.field5742) {
                                            var23.method1980(super.field5717[var21.field9869][var26][var27] + -var23.method3355(0), 0, var25, var24);
                                            class568.method3304(var21);
                                        }
                                    }
                                }
                            }
                        } else if (var18 == 2) {
                            if (var8 == null) {
                                var8 = new class713();
                            }
                            var8.method4035(arg2, (byte) -1);
                        } else if (~var18 == -129) {
                            if (arg4 == null) {
                                arg2.field1521 += 10;
                            } else {
                                arg4[0] = arg2.method898((byte) -122);
                                arg4[1] = arg2.method838(true);
                                arg4[2] = arg2.method838(true);
                                arg4[3] = arg2.method838(true);
                                arg4[4] = arg2.method898((byte) -104);
                            }
                        } else {
                            if (var18 != 129) {
                                throw new IllegalStateException("");
                            }
                            if (super.field5731 == null) {
                                super.field5731 = new byte[4][][];
                            }
                            var7 = true;
                            for (int var28 = 0; ~var28 > -5; ++var28) {
                                byte var29 = arg2.method877(-252);
                                if (var29 == 0 && super.field5731[var28] != null) {
                                    int var30 = arg1;
                                    int var31 = arg1 - -64;
                                    int var32 = arg5;
                                    if (var31 >= 0) {
                                        if (~super.field5732 >= ~var31) {
                                            var31 = super.field5732;
                                        }
                                    } else {
                                        var31 = 0;
                                    }
                                    if (~arg5 <= -1) {
                                        if (~super.field5742 >= ~arg5) {
                                            var32 = super.field5742;
                                        }
                                    } else {
                                        var32 = 0;
                                    }
                                    int var33 = arg5 + 64;
                                    if (arg1 >= 0) {
                                        if (~super.field5732 >= ~arg1) {
                                            var30 = super.field5732;
                                        }
                                    } else {
                                        var30 = 0;
                                    }
                                    if (var33 < 0) {
                                        var33 = 0;
                                    } else if (super.field5742 <= var33) {
                                        var33 = super.field5742;
                                    }
                                    while (var30 < var31) {
                                        while (var32 < var33) {
                                            super.field5731[var28][var30][var32] = 0;
                                            ++var32;
                                        }
                                        ++var30;
                                    }
                                } else if (var29 == 1) {
                                    if (super.field5731[var28] == null) {
                                        super.field5731[var28] = new byte[super.field5732 - -1][super.field5742 + 1];
                                    }
                                    for (int var34 = 0; ~var34 > -65; var34 += 4) {
                                        for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                            byte var36 = arg2.method877(arg3 ^ -17783);
                                            for (int var37 = arg1 + var34; var37 < var34 - -4 + arg1; ++var37) {
                                                for (int var38 = arg5 + var35; ~var38 > ~(arg5 + 4 + var35); ++var38) {
                                                    if (var37 >= 0 && super.field5732 > var37 && ~var38 <= -1 && ~super.field5742 < ~var38) {
                                                        super.field5731[var28][var37][var38] = var36;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (var29 == 2) {
                                    if (super.field5731[var28] == null) {
                                        super.field5731[var28] = new byte[super.field5732 + 1][super.field5742 + 1];
                                    }
                                    if (~var28 < -1) {
                                        int var39 = arg1;
                                        int var40 = arg1 + 64;
                                        int var41 = arg5;
                                        if (~arg1 <= -1) {
                                            if (super.field5732 <= arg1) {
                                                var39 = super.field5732;
                                            }
                                        } else {
                                            var39 = 0;
                                        }
                                        if (~var40 > -1) {
                                            var40 = 0;
                                        } else if (~super.field5732 >= ~var40) {
                                            var40 = super.field5732;
                                        }
                                        int var42 = arg5 + 64;
                                        if (arg5 < 0) {
                                            var41 = 0;
                                        } else if (super.field5742 <= arg5) {
                                            var41 = super.field5742;
                                        }
                                        if (var42 >= 0) {
                                            if (super.field5742 <= var42) {
                                                var42 = super.field5742;
                                            }
                                        } else {
                                            var42 = 0;
                                        }
                                        while (var40 > var39) {
                                            while (var42 > var41) {
                                                super.field5731[var28][var39][var41] = super.field5731[var28 + -1][var39][var41];
                                                ++var41;
                                            }
                                            ++var39;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var8 != null) {
                        for (int var9 = 0; var9 < 8; ++var9) {
                            for (int var10 = 0; var10 < 8; ++var10) {
                                int var11 = (arg1 >> 3) - -var9;
                                int var12 = (arg5 >> 3) + var10;
                                if (var11 >= 0 && ~(super.field5732 >> 3) < ~var11 && var12 >= 0 && var12 < super.field5742 >> 3) {
                                    class572.method3322(var11, var8, 98, var12);
                                }
                            }
                        }
                    }
                    if (!var7 && super.field5731 != null) {
                        for (int var13 = 0; ~var13 > -5; ++var13) {
                            if (super.field5731[var13] != null) {
                                for (int var14 = 0; ~var14 > -17; ++var14) {
                                    for (int var15 = 0; ~var15 > -17; ++var15) {
                                        int var16 = (arg1 >> 2) + var14;
                                        int var17 = (arg5 >> 2) - -var15;
                                        if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && var17 < 26) {
                                            super.field5731[var13][var16][var17] = 0;
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
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILmja;Lha;IIII)V")
    public final void method2846(int arg0, class438 arg1, class66 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6894;
        if (arg5 == 1) {
            class362 var8 = this.method2842(arg4, -31205, arg0, arg3, arg6);
            if (var8 != null) {
                class322 var9 = class496.field7061.method319(-124, var8.method650(124));
                int var10 = var8.method646((byte) 45);
                int var11 = var8.method643(false);
                if (var9.method2096((byte) 74)) {
                    class748.method4165(arg3, arg4, var9, 22849, arg6);
                }
                if (var8.method642(-73)) {
                    var8.method645(-119, arg2);
                }
                if (~arg0 != -1) {
                    if (~arg0 == -2) {
                        class106.method719(arg4, arg3, arg6);
                        return;
                    }
                    if (arg0 == 2) {
                        class226.method1563(arg4, arg3, arg6, field6898 != null ? field6898 : (field6898 = method2849("ija")));
                        if (var9.field4757 != 0 && ~(arg3 - -var9.field4801) > ~super.field5732 && var9.field4801 + arg6 < super.field5742 && ~(var9.field4782 + arg3) > ~super.field5732 && super.field5742 > arg6 - -var9.field4782) {
                            arg1.method2654(-78, var9.field4777, !var9.field4749, var9.field4801, var11, arg6, var9.field4782, arg3);
                        }
                        if (~var10 == -10) {
                            if (~(1 & var11) == -1) {
                                class266.method1749(arg4, arg6, (byte) -67, arg3, 8);
                                return;
                            }
                            class266.method1749(arg4, arg6, (byte) -67, arg3, 16);
                            return;
                        }
                    } else {
                        if (~arg0 != -4) {
                            return;
                        }
                        class654.method3754(arg4, arg3, arg6);
                        if (var9.field4757 != 1) {
                            return;
                        }
                        arg1.method2658(arg3, -262145, arg6);
                    }
                    return;
                }
                class292.method1973(arg4, arg3, arg6);
                if (var9.field4757 != 0) {
                    arg1.method2648(arg3, arg6, arg5 ^ 1, var10, !var9.field4749, var11, var9.field4777);
                }
                if (~var9.field4781 == -2) {
                    if (~var11 != -1) {
                        if (var11 == 1) {
                            class266.method1749(arg4, arg6 + 1, (byte) -67, arg3, 2);
                            return;
                        }
                        if (~var11 == -3) {
                            class266.method1749(arg4, arg6, (byte) -67, arg3 + 1, 1);
                            return;
                        }
                        if (var11 == 3) {
                            class266.method1749(arg4, arg6, (byte) -67, arg3, 2);
                            return;
                        }
                    } else {
                        class266.method1749(arg4, arg6, (byte) -67, arg3, 1);
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIILmja;IIILha;I)V")
    public final void method2847(int arg0, int arg1, int arg2, int arg3, int arg4, class438 arg5, int arg6, int arg7, int arg8, class66 arg9, int arg10) {
        ++field6896;
        if (class145.field1852.field9018.method2757((byte) -125) != 0 || class177.method1343(arg6, arg10, arg1, (byte) 72, class573.field8111)) {
            if (arg4 < this.field6892) {
                this.field6892 = arg4;
            }
            class322 var12 = class496.field7061.method319(-123, arg8);
            if (class145.field1852.field9031.method2235((byte) -42) != 0 || !var12.field4825) {
                int var13;
                int var14;
                if (~arg3 != -2 && ~arg3 != -4) {
                    var13 = var12.field4782;
                    var14 = var12.field4801;
                } else {
                    var13 = var12.field4801;
                    var14 = var12.field4782;
                }
                int var15;
                int var16;
                if (super.field5732 < arg10 + var14) {
                    var15 = arg10 + 1;
                    var16 = arg10;
                } else {
                    var15 = (var14 + 1 >> 1) + arg10;
                    var16 = arg10 - -(var14 >> 1);
                }
                int var17;
                int var18;
                if (super.field5742 < arg1 + var13) {
                    var17 = arg1;
                    var18 = arg1 + 1;
                } else {
                    var17 = (var13 >> 1) + arg1;
                    var18 = (var13 + 1 >> 1) + arg1;
                }
                class292 var19 = class622.field8777[arg6];
                int var20 = var19.method1976(var16, -1, var17) + var19.method1976(var15, -1, var17) - -var19.method1976(var16, -1, var18) - -var19.method1976(var15, -1, var18) >> 2;
                int var21 = (arg10 << 9) + (var14 << 8);
                int var22 = (arg1 << 9) + (var13 << 8);
                if (arg0 >= 126) {
                    boolean var23 = class261.field3671 && !super.field5741 && var12.field4786;
                    if (var12.method2096((byte) 74)) {
                        class653.method3743(arg1, -118, arg3, (class559) null, (class645) null, arg4, arg10, var12);
                    }
                    boolean var24 = arg7 == -1 && ~var12.field4800 == 0 && var12.field4827 == null && var12.field4830 == null && !var12.field4806 && !var12.field4778;
                    if (!class202.field2957 || (!class739.method4137(111, arg2) || ~var12.field4781 == -2) && (!class315.method2069(arg2, 17744) || var12.field4781 != 0)) {
                        if (arg2 == 22) {
                            if (class145.field1852.field8993.method1387((byte) -66) != 0 || var12.field4761 != 0 || ~var12.field4757 == -2 || var12.field4770) {
                                class736 var25;
                                if (!var24) {
                                    var25 = new class130(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg3, arg7);
                                } else {
                                    class421 var26 = new class421(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg3, var23);
                                    if (var26.method642(25)) {
                                        var26.method651(-8836, arg9);
                                    }
                                    var25 = var26;
                                }
                                class513.method2992(arg4, arg10, arg1, var25);
                                if (var12.field4757 == 1 && arg5 != null) {
                                    arg5.method2657(arg1, false, arg10);
                                }
                            }
                        } else if (~arg2 != -11 && arg2 != 11) {
                            if ((arg2 < 12 || arg2 > 17) && (arg2 < 18 || ~arg2 < -22)) {
                                if (arg2 == 0) {
                                    int var29 = var12.field4781;
                                    if (class111.field1404 && var12.field4781 == -1) {
                                        var29 = 1;
                                    }
                                    class719 var30;
                                    if (!var24) {
                                        var30 = new class412(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, arg3, arg7);
                                    } else {
                                        class596 var31 = new class596(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, arg3, var23);
                                        if (var31.method642(116)) {
                                            var31.method651(-8836, arg9);
                                        }
                                        var30 = var31;
                                    }
                                    class115.method817(arg4, arg10, arg1, var30, (class719) null);
                                    if (~arg3 == -1) {
                                        if (class261.field3671 && var12.field4828) {
                                            var19.method1245(arg10, arg1, 50);
                                            var19.method1245(arg10, arg1 + 1, 50);
                                        }
                                        if (var29 == 1 && !super.field5741) {
                                            class631.method3603(arg1, var12.field4763, arg10, 1, -80, arg4, var12.field4829);
                                        }
                                    } else if (~arg3 == -2) {
                                        if (class261.field3671 && var12.field4828) {
                                            var19.method1245(arg10, arg1 - -1, 50);
                                            var19.method1245(arg10 - -1, arg1 + 1, 50);
                                        }
                                        if (~var29 == -2 && !super.field5741) {
                                            class631.method3603(arg1 + 1, var12.field4763, arg10, 2, -103, arg4, -var12.field4829);
                                        }
                                    } else if (arg3 == 2) {
                                        if (class261.field3671 && var12.field4828) {
                                            var19.method1245(arg10 - -1, arg1, 50);
                                            var19.method1245(arg10 + 1, arg1 + 1, 50);
                                        }
                                        if (var29 == 1 && !super.field5741) {
                                            class631.method3603(arg1, var12.field4763, arg10 - -1, 1, -107, arg4, -var12.field4829);
                                        }
                                    } else if (arg3 == 3) {
                                        if (class261.field3671 && var12.field4828) {
                                            var19.method1245(arg10, arg1, 50);
                                            var19.method1245(arg10 - -1, arg1, 50);
                                        }
                                        if (var29 == 1 && !super.field5741) {
                                            class631.method3603(arg1, var12.field4763, arg10, 2, -103, arg4, var12.field4829);
                                        }
                                    }
                                    if (~var12.field4757 != -1 && arg5 != null) {
                                        arg5.method2649(arg10, arg3, var12.field4777, arg2, -1, !var12.field4749, arg1);
                                    }
                                    if (~var12.field4809 != -65) {
                                        class296.method1984(arg4, arg10, arg1, var12.field4809);
                                    }
                                } else if (~arg2 == -2) {
                                    class719 var32;
                                    if (!var24) {
                                        var32 = new class412(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, arg3, arg7);
                                    } else {
                                        class596 var33 = new class596(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, arg3, var23);
                                        if (var33.method642(-128)) {
                                            var33.method651(-8836, arg9);
                                        }
                                        var32 = var33;
                                    }
                                    class115.method817(arg4, arg10, arg1, var32, (class719) null);
                                    if (var12.field4828 && class261.field3671) {
                                        if (~arg3 != -1) {
                                            if (~arg3 != -2) {
                                                if (~arg3 != -3) {
                                                    if (arg3 == 3) {
                                                        var19.method1245(arg10, arg1, 50);
                                                    }
                                                } else {
                                                    var19.method1245(arg10 - -1, arg1, 50);
                                                }
                                            } else {
                                                var19.method1245(arg10 - -1, arg1 + 1, 50);
                                            }
                                        } else {
                                            var19.method1245(arg10, arg1 - -1, 50);
                                        }
                                    }
                                    if (~var12.field4757 != -1 && arg5 != null) {
                                        arg5.method2649(arg10, arg3, var12.field4777, arg2, -1, !var12.field4749, arg1);
                                    }
                                } else if (~arg2 == -3) {
                                    int var34 = 3 & arg3 - -1;
                                    class719 var35;
                                    class719 var36;
                                    if (!var24) {
                                        var35 = new class412(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, arg3 + 4, arg7);
                                        var36 = new class412(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, var34, arg7);
                                    } else {
                                        class596 var37 = new class596(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, arg3 + 4, var23);
                                        class596 var38 = new class596(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, var34, var23);
                                        if (var37.method642(118)) {
                                            var37.method651(-8836, arg9);
                                        }
                                        if (var38.method642(127)) {
                                            var38.method651(-8836, arg9);
                                        }
                                        var36 = var38;
                                        var35 = var37;
                                    }
                                    class115.method817(arg4, arg10, arg1, var35, var36);
                                    if ((~var12.field4781 == -2 || class111.field1404 && var12.field4781 == -1) && !super.field5741) {
                                        if (~arg3 != -1) {
                                            if (~arg3 == -2) {
                                                class631.method3603(arg1, var12.field4763, arg10 + 1, 1, 119, arg4, var12.field4829);
                                                class631.method3603(arg1 - -1, var12.field4763, arg10, 2, 112, arg4, var12.field4829);
                                            } else if (arg3 != 2) {
                                                if (~arg3 == -4) {
                                                    class631.method3603(arg1, var12.field4763, arg10, 1, -63, arg4, var12.field4829);
                                                    class631.method3603(arg1, var12.field4763, arg10, 2, 62, arg4, var12.field4829);
                                                }
                                            } else {
                                                class631.method3603(arg1, var12.field4763, arg10 + 1, 1, 76, arg4, var12.field4829);
                                                class631.method3603(arg1, var12.field4763, arg10, 2, -95, arg4, var12.field4829);
                                            }
                                        } else {
                                            class631.method3603(arg1, var12.field4763, arg10, 1, 100, arg4, var12.field4829);
                                            class631.method3603(arg1 + 1, var12.field4763, arg10, 2, -97, arg4, var12.field4829);
                                        }
                                    }
                                    if (var12.field4757 != 0 && arg5 != null) {
                                        arg5.method2649(arg10, arg3, var12.field4777, arg2, -1, !var12.field4749, arg1);
                                    }
                                    if (~var12.field4809 != -65) {
                                        class296.method1984(arg4, arg10, arg1, var12.field4809);
                                    }
                                } else if (arg2 == 3) {
                                    class719 var40;
                                    if (var24) {
                                        class596 var39 = new class596(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, arg3, var23);
                                        if (var39.method642(-105)) {
                                            var39.method651(-8836, arg9);
                                        }
                                        var40 = var39;
                                    } else {
                                        var40 = new class412(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg2, arg3, arg7);
                                    }
                                    class115.method817(arg4, arg10, arg1, var40, (class719) null);
                                    if (var12.field4828 && class261.field3671) {
                                        if (~arg3 != -1) {
                                            if (~arg3 == -2) {
                                                var19.method1245(arg10 + 1, arg1 - -1, 50);
                                            } else if (arg3 == 2) {
                                                var19.method1245(arg10 + 1, arg1, 50);
                                            } else if (arg3 == 3) {
                                                var19.method1245(arg10, arg1, 50);
                                            }
                                        } else {
                                            var19.method1245(arg10, arg1 + 1, 50);
                                        }
                                    }
                                    if (~var12.field4757 != -1 && arg5 != null) {
                                        arg5.method2649(arg10, arg3, var12.field4777, arg2, -1, !var12.field4749, arg1);
                                    }
                                } else if (arg2 == 9) {
                                    class778 var42;
                                    if (var24) {
                                        class175 var41 = new class175(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg10, arg10, arg1, arg1, arg2, arg3, var23);
                                        if (var41.method642(-17)) {
                                            var41.method651(-8836, arg9);
                                        }
                                        var42 = var41;
                                    } else {
                                        var42 = new class627(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg10, arg10 + var14 + -1, arg1, arg1 + var13 + -1, arg2, arg3, arg7);
                                    }
                                    class513.method2991(var42, false);
                                    if (var12.field4781 == 1 && !super.field5741) {
                                        byte var43;
                                        if (~(1 & arg3) != -1) {
                                            var43 = 16;
                                        } else {
                                            var43 = 8;
                                        }
                                        class631.method3603(arg1, var12.field4763, arg10, var43, -100, arg4, 0);
                                    }
                                    if (var12.field4757 != 0 && arg5 != null) {
                                        arg5.method2642(arg10, var13, var14, -1, arg1, var12.field4777, !var12.field4749);
                                    }
                                    if (~var12.field4809 != -65) {
                                        class296.method1984(arg4, arg10, arg1, var12.field4809);
                                    }
                                } else if (arg2 == 4) {
                                    class239 var44;
                                    if (!var24) {
                                        var44 = new class91(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, 0, 0, arg2, arg3, arg7);
                                    } else {
                                        class149 var45 = new class149(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, 0, 0, arg2, arg3);
                                        if (var45.method642(127)) {
                                            var45.method651(-8836, arg9);
                                        }
                                        var44 = var45;
                                    }
                                    class488.method2854(arg4, arg10, arg1, var44, (class239) null);
                                } else if (arg2 == 5) {
                                    int var46 = 65;
                                    class362 var47 = (class362) class259.method1702(arg4, arg10, arg1);
                                    if (var47 != null) {
                                        var46 = class496.field7061.method319(17, var47.method650(114)).field4809 + 1;
                                    }
                                    class239 var48;
                                    if (!var24) {
                                        var48 = new class91(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, class585.field8278[arg3] * var46, class6.field63[arg3] * var46, arg2, arg3, arg7);
                                    } else {
                                        class149 var49 = new class149(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, class585.field8278[arg3] * var46, class6.field63[arg3] * var46, arg2, arg3);
                                        if (var49.method642(121)) {
                                            var49.method651(-8836, arg9);
                                        }
                                        var48 = var49;
                                    }
                                    class488.method2854(arg4, arg10, arg1, var48, (class239) null);
                                } else if (arg2 == 6) {
                                    int var50 = 33;
                                    class362 var51 = (class362) class259.method1702(arg4, arg10, arg1);
                                    if (var51 != null) {
                                        var50 = class496.field7061.method319(-125, var51.method650(84)).field4809 / 2 - -1;
                                    }
                                    class239 var53;
                                    if (var24) {
                                        class149 var52 = new class149(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, class585.field8278[arg3] * var50, class6.field63[arg3] * var50, arg2, arg3 - -4);
                                        if (var52.method642(119)) {
                                            var52.method651(-8836, arg9);
                                        }
                                        var53 = var52;
                                    } else {
                                        var53 = new class91(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, class326.field4877[arg3] * var50, class733.field10224[arg3] * var50, arg2, arg3 + 4, arg7);
                                    }
                                    class488.method2854(arg4, arg10, arg1, var53, (class239) null);
                                } else if (~arg2 == -8) {
                                    int var54 = arg3 - -2 & 3;
                                    class239 var56;
                                    if (var24) {
                                        class149 var55 = new class149(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, 0, 0, arg2, var54 + 4);
                                        var56 = var55;
                                        if (var55.method642(120)) {
                                            var55.method651(-8836, arg9);
                                        }
                                    } else {
                                        var56 = new class91(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, 0, 0, arg2, var54 - -4, arg7);
                                    }
                                    class488.method2854(arg4, arg10, arg1, var56, (class239) null);
                                } else if (~arg2 == -9) {
                                    int var57 = arg3 + 2 & 3;
                                    int var58 = 33;
                                    class362 var59 = (class362) class259.method1702(arg4, arg10, arg1);
                                    if (var59 != null) {
                                        var58 = 1 + class496.field7061.method319(-124, var59.method650(-93)).field4809 / 2;
                                    }
                                    class239 var62;
                                    class239 var63;
                                    if (!var24) {
                                        class91 var60 = new class91(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, class326.field4877[arg3] * var58, class733.field10224[arg3] * var58, arg2, arg3 + 4, arg7);
                                        class91 var61 = new class91(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, 0, 0, arg2, var57 + 4, arg7);
                                        var62 = var60;
                                        var63 = var61;
                                    } else {
                                        class149 var64 = new class149(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, class326.field4877[arg3] * var58, class733.field10224[arg3] * var58, arg2, arg3 + 4);
                                        class149 var65 = new class149(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, 0, 0, arg2, var57 + 4);
                                        if (var64.method642(-111)) {
                                            var64.method651(-8836, arg9);
                                        }
                                        var62 = var64;
                                        if (var65.method642(125)) {
                                            var65.method651(-8836, arg9);
                                        }
                                        var63 = var65;
                                    }
                                    class488.method2854(arg4, arg10, arg1, var62, var63);
                                }
                            } else {
                                class778 var27;
                                if (!var24) {
                                    var27 = new class627(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg10, arg10 + var14 + -1, arg1, arg1 + var13 + -1, arg2, arg3, arg7);
                                } else {
                                    class175 var28 = new class175(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg10, arg10 + var14 + -1, arg1, var13 - 1 + arg1, arg2, arg3, var23);
                                    var27 = var28;
                                    if (var28.method642(-53)) {
                                        var28.method651(-8836, arg9);
                                    }
                                }
                                class513.method2991(var27, false);
                                if (class261.field3671 && !super.field5741 && ~arg2 <= -13 && ~arg2 >= -18 && arg2 != 13 && arg4 > 0 && ~var12.field4781 != -1) {
                                    super.field5724[arg4][arg10][arg1] = (byte) class281.method1904(super.field5724[arg4][arg10][arg1], 4);
                                }
                                if (var12.field4757 != 0 && arg5 != null) {
                                    arg5.method2642(arg10, var13, var14, -1, arg1, var12.field4777, !var12.field4749);
                                }
                            }
                        } else {
                            class175 var66 = null;
                            int var68;
                            class778 var69;
                            if (var24) {
                                class175 var67 = new class175(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg10, arg10 + var14 + -1, arg1, arg1 - (-var13 + 1), arg2, arg3, var23);
                                var68 = var67.method1311((byte) -74);
                                var69 = var67;
                                var66 = var67;
                            } else {
                                var69 = new class627(arg9, var12, arg4, arg6, var21, var20, var22, super.field5741, arg10, arg10 + var14 + -1, arg1, var13 + -1 + arg1, arg2, arg3, arg7);
                                var68 = 15;
                            }
                            if (class513.method2991(var69, false)) {
                                if (var66 != null && var66.method642(-40)) {
                                    var66.method651(-8836, arg9);
                                }
                                if (var12.field4828 && class261.field3671) {
                                    if (var68 > 30) {
                                        var68 = 30;
                                    }
                                    for (int var70 = 0; var70 <= var14; ++var70) {
                                        for (int var71 = 0; ~var13 <= ~var71; ++var71) {
                                            var19.method1245(arg10 + var70, arg1 + var71, var68);
                                        }
                                    }
                                }
                            }
                            if (var12.field4757 != 0 && arg5 != null) {
                                arg5.method2642(arg10, var13, var14, -1, arg1, var12.field4777, !var12.field4749);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method2848(boolean arg0) {
        field6897 = null;
        if (!arg0) {
            method2848(true);
        }
        field6895 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2849(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
