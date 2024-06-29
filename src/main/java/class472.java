import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class472 extends class52 {

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    public int field7000 = 99;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "[S")
    public static short[] field7001 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "Lgb;")
    public static class145 field7007;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sv", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field7012;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2887(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(IIIZ)V", line = 6)
    public class472(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class279.field3702, class144.field1914);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Ljava/lang/String;", line = 11)
    public static final String method2876(int arg0, int arg1) {
        ++field7009;
        return arg0 != 1165 ? null : (arg1 >> 24 & 255) + "." + ((arg1 & 16772293) >> 16) + "." + (255 & arg1 >> 8) + "." + (arg1 & 255);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Las;IIILza;II)V", line = 27)
    public final void method2877(class106 arg0, int arg1, int arg2, int arg3, class287 arg4, int arg5, int arg6) {
        ++field7011;
        class448 var8 = null;
        if (arg3 == 0) {
            var8 = (class448) class48.method279(arg1, arg2, arg6);
        }
        if (arg5 == -3567) {
            if (arg3 == 1) {
                var8 = (class448) class107.method663(arg1, arg2, arg6);
            }
            if (arg3 == 2) {
                var8 = (class448) class365.method2172(arg1, arg2, arg6, field7012 != null ? field7012 : (field7012 = method2887("mh")));
            }
            if (~arg3 == -4) {
                var8 = (class448) class434.method2671(arg1, arg2, arg6);
            }
            if (var8 != null) {
                class70 var9 = class123.field1593.method2920(var8.method46(-102), arg5 ^ -18174);
                int var10 = var8.method48((byte) -70);
                int var11 = var8.method47(-15774);
                if (var9.method405((byte) 44)) {
                    class346.method2004(arg6, arg2, arg1, var9, arg5 + 1278911446);
                }
                if (var8.method38((byte) -89)) {
                    var8.method44(124, arg4);
                }
                if (arg3 == 0) {
                    class262 var12 = class48.method279(arg1, arg2, arg6);
                    if (var12 instanceof class378) {
                        ((class378) var12).field5468 = null;
                    } else {
                        class443.method2744(arg1, arg2, arg6);
                    }
                    if (var9.field904 != 0) {
                        arg0.method655(!var9.field891, var9.field872, arg5 ^ 27547, arg6, arg2, var10, var11);
                        return;
                    }
                } else if (~arg3 != -2) {
                    if (arg3 == 2) {
                        class279 var13 = class365.method2172(arg1, arg2, arg6, field7012 != null ? field7012 : (field7012 = method2887("mh")));
                        if (var13 instanceof class314 && var13.field3698 == arg2 && ~var13.field3688 == ~arg6) {
                            ((class314) var13).field4199 = null;
                        } else {
                            class135.method812(arg1, arg2, arg6, field7012 != null ? field7012 : (field7012 = method2887("mh")));
                        }
                        if (~var9.field904 != -1 && ~super.field607 < ~(arg2 - -var9.field865) && super.field609 > var9.field865 + arg6 && super.field607 > arg2 - -var9.field857 && ~(arg6 - -var9.field857) > ~super.field609) {
                            arg0.method660(var9.field865, var9.field857, var9.field872, -4, arg6, !var9.field891, arg2, var11);
                            return;
                        }
                        return;
                    }
                    if (~arg3 == -4) {
                        class215 var14 = class434.method2671(arg1, arg2, arg6);
                        if (var14 instanceof class229) {
                            ((class229) var14).field3086 = null;
                        } else {
                            class164.method963(arg1, arg2, arg6);
                        }
                        if (var9.field904 == 1) {
                            arg0.method659(-112, arg2, arg6);
                            return;
                        }
                    }
                } else {
                    class100 var15 = class107.method663(arg1, arg2, arg6);
                    if (var15 instanceof class462) {
                        ((class462) var15).field6895 = null;
                        return;
                    }
                    class493.method2982(arg1, arg2, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLza;)V", line = 142)
    public final void method2878(byte arg0, class287 arg1) {
        ++field7005;
        class252.method1558(arg1);
        if (~super.field601 < -2) {
            for (int var3 = 0; super.field607 > var3; ++var3) {
                for (int var4 = 0; ~super.field609 < ~var4; ++var4) {
                    if (~(class252.field3358[1][var3][var4] & 2) == -3) {
                        class534.method3168(var3, var4);
                    }
                }
            }
        }
        int var5 = 13 % ((arg0 - -1) / 52);
        for (int var6 = 0; ~super.field601 < ~var6; ++var6) {
            for (int var7 = 0; ~super.field609 <= ~var7; ++var7) {
                for (int var8 = 0; var8 <= super.field607; ++var8) {
                    if (~(super.field591[var6][var8][var7] & 1) != -1) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (super.field609 > var10 && (super.field591[var6][var8][var10 + 1] & 1) != 0) {
                            ++var10;
                        }
                        while (~var9 < -1 && ~(1 & super.field591[var6][var8][var9 - 1]) != -1) {
                            --var9;
                        }
                        int var12 = var6;
                        label167: while (~var11 < -1) {
                            for (int var13 = var9; var13 <= var10; ++var13) {
                                if (~(super.field591[var11 - 1][var8][var13] & 1) == -1) {
                                    break label167;
                                }
                            }
                            --var11;
                        }
                        label156: while (~var12 > -4) {
                            for (int var14 = var9; ~var14 >= ~var10; ++var14) {
                                if ((1 & super.field591[var12 + 1][var8][var14]) == 0) {
                                    break label156;
                                }
                            }
                            ++var12;
                        }
                        int var15 = (var10 + 1 + -var9) * (var12 + 1 + -var11);
                        if (var15 >= 2) {
                            short var16 = 240;
                            int var17 = super.field608[var12][var8][var9] + -var16;
                            int var18 = super.field608[var11][var8][var9];
                            class43.method250(1, var8 << 7, var8 << 7, var9 << 7, (var10 << 7) + 128, var17, var18);
                            for (int var19 = var11; var12 >= var19; ++var19) {
                                for (int var20 = var9; ~var10 <= ~var20; ++var20) {
                                    super.field591[var19][var8][var20] = (byte) class95.method534(super.field591[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field591[var6][var8][var7]) != -1) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        while (~var22 > ~super.field607 && ~(2 & super.field591[var6][var22 + 1][var7]) != -1) {
                            ++var22;
                        }
                        while (~var21 < -1 && ~(2 & super.field591[var6][var21 + -1][var7]) != -1) {
                            --var21;
                        }
                        int var24 = var6;
                        label221: while (var23 > 0) {
                            for (int var25 = var21; var22 >= var25; ++var25) {
                                if (~(2 & super.field591[var23 - 1][var25][var7]) == -1) {
                                    break label221;
                                }
                            }
                            --var23;
                        }
                        label210: while (var24 < 3) {
                            for (int var26 = var21; ~var26 >= ~var22; ++var26) {
                                if (~(super.field591[var24 + 1][var26][var7] & 2) == -1) {
                                    break label210;
                                }
                            }
                            ++var24;
                        }
                        int var27 = (-var21 + var22 + 1) * (var24 + 1 + -var23);
                        if (~var27 <= -3) {
                            short var28 = 240;
                            int var29 = super.field608[var24][var21][var7] + -var28;
                            int var30 = super.field608[var23][var21][var7];
                            class43.method250(2, var21 << 7, (var22 << 7) + 128, var7 << 7, var7 << 7, var29, var30);
                            for (int var31 = var23; ~var24 <= ~var31; ++var31) {
                                for (int var32 = var21; ~var22 <= ~var32; ++var32) {
                                    super.field591[var31][var32][var7] = (byte) class95.method534(super.field591[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field591[var6][var8][var7]) != -1) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35 = var7;
                        int var36 = var7;
                        while (var35 > 0 && (4 & super.field591[var6][var8][var35 + -1]) != 0) {
                            --var35;
                        }
                        while (super.field609 > var36 && (super.field591[var6][var8][var36 + 1] & 4) != 0) {
                            ++var36;
                        }
                        label275: while (~var33 < -1) {
                            for (int var37 = var35; ~var36 <= ~var37; ++var37) {
                                if ((4 & super.field591[var6][var33 + -1][var37]) == 0) {
                                    break label275;
                                }
                            }
                            --var33;
                        }
                        label264: while (~var34 > ~super.field607) {
                            for (int var38 = var35; ~var38 >= ~var36; ++var38) {
                                if ((4 & super.field591[var6][var34 + 1][var38]) == 0) {
                                    break label264;
                                }
                            }
                            ++var34;
                        }
                        if (~((var36 - var35 + 1) * (var34 + 1 + -var33)) <= -5) {
                            int var39 = super.field608[var6][var33][var35];
                            class43.method250(4, var33 << 7, (var34 << 7) + 128, var35 << 7, (var36 << 7) + 128, var39, var39);
                            for (int var40 = var33; var40 <= var34; ++var40) {
                                for (int var41 = var35; var41 <= var36; ++var41) {
                                    super.field591[var6][var40][var41] = (byte) class95.method534(super.field591[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field591 = null;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)[Ltd;", line = 429)
    public static final class317[] method2879(int arg0) {
        int var1 = -28 % ((arg0 - -45) / 52);
        ++field7008;
        return new class317[] { class206.field2714, class183.field2376, class492.field7204 };
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZILza;[B[Las;)V", line = 441)
    public final void method2880(int arg0, boolean arg1, int arg2, class287 arg3, byte[] arg4, class106[] arg5) {
        ++field7004;
        class396 var7 = new class396(arg4);
        int var8 = -1;
        if (!arg1) {
            method2883((byte) -37);
        }
        while (true) {
            int var9 = var7.method2405(!arg1);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2443(80);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (4088 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2388((byte) -121);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = var13 - -arg0;
                int var19 = var12 - -arg2;
                if (~var18 < -1 && var19 > 0 && super.field607 + -1 > var18 && super.field609 - 1 > var19) {
                    class106 var20 = null;
                    if (!super.field598) {
                        int var21 = var14;
                        if (~(class252.field3358[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg5[var21];
                        }
                    }
                    this.method2884(var19, var20, var14, -1, (byte) 44, var17, var14, var16, var18, arg3, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIILug;ILza;IIZI)V", line = 516)
    public final void method2881(int[] arg0, int arg1, int arg2, int arg3, class396 arg4, int arg5, class287 arg6, int arg7, int arg8, boolean arg9, int arg10) {
        ++field6999;
        if (!super.field598) {
            class6 var13 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            int var14 = (arg8 & 7) * 8;
            int var15 = (7 & arg7) * 8;
            while (true) {
                int var21;
                label237: do {
                    while (true) {
                        while (arg4.field5729 < arg4.field5761.length) {
                            int var20 = arg4.method2388((byte) -128);
                            if (~var20 != -1) {
                                if (var20 == 1) {
                                    var21 = arg4.method2388((byte) -128);
                                    continue label237;
                                }
                                if (~var20 == -3) {
                                    if (var13 == null) {
                                        var13 = new class6();
                                    }
                                    var13.method33(-124, arg4);
                                } else if (var20 == 128) {
                                    if (arg0 != null) {
                                        arg0[0] = arg4.method2386(-23648);
                                        arg0[1] = arg4.method2433((byte) 115);
                                        arg0[2] = arg4.method2433((byte) 115);
                                        arg0[3] = arg4.method2433((byte) 115);
                                        arg0[4] = arg4.method2386(-23648);
                                    } else {
                                        arg4.field5729 += 10;
                                    }
                                } else {
                                    if (~var20 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field596 == null) {
                                        super.field596 = new byte[4][][];
                                    }
                                    for (int var32 = 0; var32 < 4; ++var32) {
                                        byte var33 = arg4.method2418(-92);
                                        if (var33 == 0 && super.field596[arg2] != null) {
                                            if (var32 <= arg1) {
                                                int var34 = arg5;
                                                int var35 = arg5 + 7;
                                                int var36 = arg10;
                                                int var37 = arg10 - -7;
                                                if (~arg10 <= -1) {
                                                    if (~super.field609 >= ~arg10) {
                                                        var36 = super.field609;
                                                    }
                                                } else {
                                                    var36 = 0;
                                                }
                                                if (arg5 >= 0) {
                                                    if (super.field607 <= arg5) {
                                                        var34 = super.field607;
                                                    }
                                                } else {
                                                    var34 = 0;
                                                }
                                                if (var35 >= 0) {
                                                    if (super.field607 <= var35) {
                                                        var35 = super.field607;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                if (~var37 > -1) {
                                                    var37 = 0;
                                                } else if (var37 >= super.field609) {
                                                    var37 = super.field609;
                                                }
                                                while (var34 < var35) {
                                                    while (~var36 > ~var37) {
                                                        super.field596[arg2][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field596[arg2] == null) {
                                                super.field596[arg2] = new byte[super.field607 + 1][super.field609 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg4.method2418(126);
                                                    if (arg1 >= var32) {
                                                        for (int var41 = var38; var41 < var38 + 4; ++var41) {
                                                            for (int var42 = var39; ~var42 > ~(var39 - -4); ++var42) {
                                                                if (var14 <= var41 && var14 + 8 > var41 && ~var15 >= ~var42 && var15 + 8 > var15) {
                                                                    int var43 = arg5 - -class116.method698(7 & var42, arg3, (byte) -70, var41 & 7);
                                                                    int var44 = arg10 + class127.method773(arg3, 7, 7 & var42, var41 & 7);
                                                                    if (~var43 <= -1 && super.field607 > var43 && ~var44 <= -1 && ~var44 > ~super.field609) {
                                                                        super.field596[arg2][var43][var44] = var40;
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
                                var13 = new class6(arg4);
                            }
                        }
                        if (var13 != null) {
                            class65.method385(arg10 >> 3, var13, (byte) 66, arg5 >> 3);
                        }
                        if (!arg9 && super.field596 != null && super.field596[arg2] != null) {
                            int var16 = arg5 - -7;
                            int var17 = arg10 + 7;
                            for (int var18 = arg5; ~var16 < ~var18; ++var18) {
                                for (int var19 = arg10; var17 > var19; ++var19) {
                                    super.field596[arg2][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; ~var22 > ~var21; ++var22) {
                    class340 var23 = new class340(arg6, arg4, 0);
                    if (~var23.field4499 == -32) {
                        class280 var24 = class211.field2834.method1619(2, arg4.method2386(-23648));
                        var23.method1979(var24.field3712, var24.field3710, -18, var24.field3707, var24.field3706);
                    }
                    if (~arg6.method1176() < -1) {
                        class309 var25 = var23.field4510;
                        int var26 = var25.method1840((byte) 110) >> 7;
                        int var27 = var25.method1842((byte) 103) >> 7;
                        if (~var23.field4512 == ~arg1 && var26 >= var14 && ~(var14 + 8) < ~var26 && ~var15 >= ~var27 && ~(var15 + 8) < ~var27) {
                            int var28 = class61.method367(var25.method1840((byte) 22) & 1023, false, var25.method1842((byte) 122) & 1023, arg3) + (arg5 << 7);
                            int var29 = var28 >> 7;
                            int var30 = (arg10 << 7) + class376.method2220(var25.method1840((byte) 97) & 1023, (byte) -126, 1023 & var25.method1842((byte) 112), arg3);
                            int var31 = var30 >> 7;
                            if (~var29 <= -1 && var31 >= 0 && super.field607 > var29 && var31 < super.field609) {
                                var25.method365(var28, super.field608[arg1][var29][var31] + -var25.method1841(0), var30, false);
                                class70.method410(var23);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIB[Las;IILza;III[B)V", line = 804)
    public final void method2882(int arg0, int arg1, byte arg2, class106[] arg3, int arg4, int arg5, class287 arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        if (arg2 == 66) {
            ++field7010;
            class396 var12 = new class396(arg10);
            int var13 = -1;
            while (true) {
                int var14 = var12.method2405(false);
                if (~var14 == -1) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method2443(-110);
                    if (var16 == 0) {
                        break;
                    }
                    var15 += var16 - 1;
                    int var17 = 63 & var15;
                    int var18 = 63 & var15 >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method2388((byte) -127);
                    int var21 = var20 >> 2;
                    int var22 = 3 & var20;
                    if (~arg8 == ~var19 && arg0 <= var18 && ~(arg0 + 8) < ~var18 && var17 >= arg1 && ~var17 > ~(arg1 + 8)) {
                        class70 var23 = class123.field1593.method2920(var13, 19219);
                        int var24 = class283.method1708(var18 & 7, var22, arg9, var23.field865, (byte) 16, 7 & var17, var23.field857) + arg7;
                        int var25 = class469.method2861(var23.field857, var23.field865, var22, true, var18 & 7, arg9, var17 & 7) + arg4;
                        if (var24 > 0 && var25 > 0 && var24 < super.field607 + -1 && ~(super.field609 + -1) < ~var25) {
                            class106 var26 = null;
                            if (!super.field598) {
                                int var27 = arg5;
                                if ((2 & class252.field3358[1][var24][var25]) == 2) {
                                    var27 = arg5 - 1;
                                }
                                if (var27 >= 0) {
                                    var26 = arg3[var27];
                                }
                            }
                            this.method2884(var25, var26, arg5, -1, (byte) 117, 3 & var22 - -arg9, arg5, var21, var24, arg6, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)V", line = 884)
    public static void method2883(byte arg0) {
        field7007 = null;
        field7001 = null;
        if (arg0 >= -56) {
            method2876(-68, 72);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILas;IIBIIIILza;I)V", line = 895)
    public final void method2884(int arg0, class106 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class287 arg9, int arg10) {
        ++field7006;
        if (class319.field4256.method1738(0, class20.field183) || class90.method497(arg8, arg0, 0, arg2, class253.field3369)) {
            if (arg6 < this.field7000) {
                this.field7000 = arg6;
            }
            class70 var12 = class123.field1593.method2920(arg10, 19219);
            if (!arg9.method1132() || !class319.field4256.field4671 || !var12.field817) {
                int var13;
                int var14;
                if (~arg5 != -2 && ~arg5 != -4) {
                    var13 = var12.field865;
                    var14 = var12.field857;
                } else {
                    var14 = var12.field865;
                    var13 = var12.field857;
                }
                int var15;
                int var16;
                if (arg8 + var13 > super.field607) {
                    var15 = arg8 + 1;
                    var16 = arg8;
                } else {
                    var15 = (var13 - -1 >> 1) + arg8;
                    var16 = (var13 >> 1) + arg8;
                }
                int var17;
                int var18;
                if (~super.field609 > ~(arg0 + var14)) {
                    var17 = arg0 - -1;
                    var18 = arg0;
                } else {
                    var17 = (var14 + 1 >> 1) + arg0;
                    var18 = (var14 >> 1) + arg0;
                }
                class38 var19 = class152.field1993[arg2];
                int var20 = var19.method217(var16, var18) + var19.method217(var15, var18) + var19.method217(var16, var17) + var19.method217(var15, var17) >> 2;
                if (arg4 < 3) {
                    field7007 = null;
                }
                int var21 = (arg8 << 7) - -(var13 << 6);
                int var22 = (arg0 << 7) + (var14 << 6);
                boolean var23 = class415.field5979 && !super.field598 && var12.field896;
                if (var12.method405((byte) 44)) {
                    class471.method2875(arg6, arg5, (byte) -86, arg0, var12, (class22) null, arg8, (class531) null);
                }
                boolean var24 = ~arg3 == 0 && ~var12.field902 == 0 && var12.field833 == null && var12.field848 == null && !var12.field892;
                if (!class407.field5848 || (!class481.method2937(arg7, -760) || var12.field830 == 1) && (!class126.method764(104, arg7) || ~var12.field830 != -1)) {
                    if (~arg7 == -23) {
                        if (class319.field4256.field4687 || var12.field886 != 0 || ~var12.field904 == -2 || var12.field842) {
                            class215 var25;
                            if (!var24) {
                                var25 = new class515(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg5, arg3);
                            } else {
                                class362 var26 = new class362(arg9, var12, arg2, var21, var20, var22, super.field598, arg5, var23);
                                var25 = var26;
                                if (var26.method38((byte) -89)) {
                                    var26.method49((byte) -56, arg9);
                                }
                            }
                            class215 var27 = class434.method2671(arg6, arg8, arg0);
                            if (var27 instanceof class229) {
                                ((class229) var27).field3086 = var25;
                            } else {
                                class358.method2122(arg6, arg8, arg0, var25);
                            }
                            if (~var12.field904 == -2 && arg1 != null) {
                                arg1.method647(-14227, arg0, arg8);
                            }
                        }
                    } else if (arg7 != 10 && ~arg7 != -12) {
                        if (arg7 >= 12 && arg7 <= 17 || ~arg7 <= -19 && ~arg7 >= -22) {
                            class279 var28;
                            if (!var24) {
                                var28 = new class185(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg8, var13 + -1 + arg8, arg0, arg0 + -1 - -var14, arg7, arg5, arg3);
                            } else {
                                class422 var29 = new class422(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg8, var13 + -1 + arg8, arg0, arg0 + var14 + -1, arg7, arg5, var23);
                                if (var29.method38((byte) -89)) {
                                    var29.method49((byte) -56, arg9);
                                }
                                var28 = var29;
                            }
                            class279 var30 = class365.method2172(arg6, arg8, arg0, field7012 != null ? field7012 : (field7012 = method2887("mh")));
                            if (var30 instanceof class314 && ~var30.field3698 == ~arg8 && var30.field3688 == arg0) {
                                ((class314) var30).field4199 = var28;
                            } else {
                                class279.method1691(var28, false);
                            }
                            if (class415.field5979 && !super.field598 && arg7 >= 12 && ~arg7 >= -18 && ~arg7 != -14 && arg6 > 0 && ~var12.field830 != -1) {
                                super.field591[arg6][arg8][arg0] = (byte) class219.method1381(super.field591[arg6][arg8][arg0], 4);
                            }
                            if (var12.field904 != 0 && arg1 != null) {
                                arg1.method656(68, var14, !var12.field891, var13, arg8, arg0, var12.field872);
                            }
                        } else if (arg7 == 0) {
                            int var31 = var12.field830;
                            if (class470.field6976 && ~var12.field830 == 0) {
                                var31 = 1;
                            }
                            class262 var32;
                            if (!var24) {
                                var32 = new class7(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg7, arg5, arg3);
                            } else {
                                class249 var33 = new class249(arg9, var12, arg2, var21, var20, var22, super.field598, arg7, arg5, var23);
                                var32 = var33;
                                if (var33.method38((byte) -89)) {
                                    var33.method49((byte) -56, arg9);
                                }
                            }
                            class262 var34 = class48.method279(arg6, arg8, arg0);
                            if (var34 instanceof class378) {
                                ((class378) var34).field5468 = var32;
                            } else {
                                class297.method1777(arg6, arg8, arg0, var32, (class262) null);
                            }
                            if (class415.field5979) {
                                if (arg5 == 0) {
                                    if (var12.field816) {
                                        var19.method210(arg8, arg0, 50);
                                        var19.method210(arg8, arg0 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field598) {
                                        super.field591[arg6][arg8][arg0] = (byte) class219.method1381(super.field591[arg6][arg8][arg0], 1);
                                    }
                                } else if (arg5 != 1) {
                                    if (arg5 == 2) {
                                        if (var12.field816) {
                                            var19.method210(arg8 + 1, arg0, 50);
                                            var19.method210(arg8 + 1, arg0 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field598) {
                                            super.field591[arg6][arg8 + 1][arg0] = (byte) class219.method1381(super.field591[arg6][arg8 + 1][arg0], 1);
                                        }
                                    } else if (arg5 == 3) {
                                        if (var12.field816) {
                                            var19.method210(arg8, arg0, 50);
                                            var19.method210(arg8 + 1, arg0, 50);
                                        }
                                        if (~var31 == -2 && !super.field598) {
                                            super.field591[arg6][arg8][arg0] = (byte) class219.method1381(super.field591[arg6][arg8][arg0], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field816) {
                                        var19.method210(arg8, arg0 + 1, 50);
                                        var19.method210(arg8 + 1, arg0 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field598) {
                                        super.field591[arg6][arg8][arg0 + 1] = (byte) class219.method1381(super.field591[arg6][arg8][arg0 + 1], 2);
                                    }
                                }
                            }
                            if (~var12.field904 != -1 && arg1 != null) {
                                arg1.method646(arg8, -19620, arg0, var12.field872, arg7, arg5, !var12.field891);
                            }
                            if (var12.field878 != 16) {
                                class358.method2123(arg6, arg8, arg0, var12.field878);
                            }
                        } else if (~arg7 == -2) {
                            class262 var36;
                            if (var24) {
                                class249 var35 = new class249(arg9, var12, arg2, var21, var20, var22, super.field598, arg7, arg5, var23);
                                var36 = var35;
                                if (var35.method38((byte) -89)) {
                                    var35.method49((byte) -56, arg9);
                                }
                            } else {
                                var36 = new class7(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg7, arg5, arg3);
                            }
                            class262 var37 = class48.method279(arg6, arg8, arg0);
                            if (var37 instanceof class378) {
                                ((class378) var37).field5468 = var36;
                            } else {
                                class297.method1777(arg6, arg8, arg0, var36, (class262) null);
                            }
                            if (var12.field816 && class415.field5979) {
                                if (~arg5 == -1) {
                                    var19.method210(arg8, arg0 + 1, 50);
                                } else if (~arg5 == -2) {
                                    var19.method210(arg8 + 1, arg0 + 1, 50);
                                } else if (arg5 == 2) {
                                    var19.method210(arg8 - -1, arg0, 50);
                                } else if (~arg5 == -4) {
                                    var19.method210(arg8, arg0, 50);
                                }
                            }
                            if (var12.field904 != 0 && arg1 != null) {
                                arg1.method646(arg8, -19620, arg0, var12.field872, arg7, arg5, !var12.field891);
                            }
                        } else if (arg7 == 2) {
                            int var38 = 3 & arg5 + 1;
                            class262 var41;
                            class262 var42;
                            if (var24) {
                                class249 var39 = new class249(arg9, var12, arg2, var21, var20, var22, super.field598, arg7, arg5 + 4, var23);
                                class249 var40 = new class249(arg9, var12, arg2, var21, var20, var22, super.field598, arg7, var38, var23);
                                if (var39.method38((byte) -89)) {
                                    var39.method49((byte) -56, arg9);
                                }
                                if (var40.method38((byte) -89)) {
                                    var40.method49((byte) -56, arg9);
                                }
                                var41 = var40;
                                var42 = var39;
                            } else {
                                var42 = new class7(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg7, arg5 - -4, arg3);
                                var41 = new class7(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg7, var38, arg3);
                            }
                            class297.method1777(arg6, arg8, arg0, var42, var41);
                            if (~var12.field830 == -2 && class415.field5979 && !super.field598) {
                                if (arg5 != 0) {
                                    if (arg5 == 1) {
                                        super.field591[arg6][arg8][arg0 + 1] = (byte) class219.method1381(super.field591[arg6][arg8][arg0 + 1], 2);
                                        super.field591[arg6][arg8 + 1][arg0] = (byte) class219.method1381(super.field591[arg6][arg8 + 1][arg0], 1);
                                    } else if (~arg5 != -3) {
                                        if (arg5 == 3) {
                                            super.field591[arg6][arg8][arg0] = (byte) class219.method1381(super.field591[arg6][arg8][arg0], 2);
                                            super.field591[arg6][arg8][arg0] = (byte) class219.method1381(super.field591[arg6][arg8][arg0], 1);
                                        }
                                    } else {
                                        super.field591[arg6][arg8 + 1][arg0] = (byte) class219.method1381(super.field591[arg6][arg8 + 1][arg0], 1);
                                        super.field591[arg6][arg8][arg0] = (byte) class219.method1381(super.field591[arg6][arg8][arg0], 2);
                                    }
                                } else {
                                    super.field591[arg6][arg8][arg0] = (byte) class219.method1381(super.field591[arg6][arg8][arg0], 1);
                                    super.field591[arg6][arg8][arg0 - -1] = (byte) class219.method1381(super.field591[arg6][arg8][arg0 - -1], 2);
                                }
                            }
                            if (var12.field904 != 0 && arg1 != null) {
                                arg1.method646(arg8, -19620, arg0, var12.field872, arg7, arg5, !var12.field891);
                            }
                            if (var12.field878 != 16) {
                                class358.method2123(arg6, arg8, arg0, var12.field878);
                            }
                        } else if (arg7 == 3) {
                            class262 var43;
                            if (!var24) {
                                var43 = new class7(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg7, arg5, arg3);
                            } else {
                                class249 var44 = new class249(arg9, var12, arg2, var21, var20, var22, super.field598, arg7, arg5, var23);
                                var43 = var44;
                                if (var44.method38((byte) -89)) {
                                    var44.method49((byte) -56, arg9);
                                }
                            }
                            class262 var45 = class48.method279(arg6, arg8, arg0);
                            if (var45 instanceof class378) {
                                ((class378) var45).field5468 = var43;
                            } else {
                                class297.method1777(arg6, arg8, arg0, var43, (class262) null);
                            }
                            if (var12.field816 && class415.field5979) {
                                if (arg5 == 0) {
                                    var19.method210(arg8, arg0 + 1, 50);
                                } else if (~arg5 != -2) {
                                    if (~arg5 == -3) {
                                        var19.method210(arg8 + 1, arg0, 50);
                                    } else if (arg5 == 3) {
                                        var19.method210(arg8, arg0, 50);
                                    }
                                } else {
                                    var19.method210(arg8 + 1, arg0 - -1, 50);
                                }
                            }
                            if (~var12.field904 != -1 && arg1 != null) {
                                arg1.method646(arg8, -19620, arg0, var12.field872, arg7, arg5, !var12.field891);
                            }
                        } else if (~arg7 == -10) {
                            class279 var47;
                            if (var24) {
                                class422 var46 = new class422(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg8, arg8, arg0, arg0, arg7, arg5, var23);
                                if (var46.method38((byte) -89)) {
                                    var46.method49((byte) -56, arg9);
                                }
                                var47 = var46;
                            } else {
                                var47 = new class185(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg8, var13 + -1 + arg8, arg0, arg0 + -1 - -var14, arg7, arg5, arg3);
                            }
                            class279 var48 = class365.method2172(arg6, arg8, arg0, field7012 != null ? field7012 : (field7012 = method2887("mh")));
                            if (var48 instanceof class314 && var48.field3698 == arg8 && var48.field3688 == arg0) {
                                ((class314) var48).field4199 = var47;
                            } else {
                                class279.method1691(var47, false);
                            }
                            if (var12.field904 != 0 && arg1 != null) {
                                arg1.method656(117, var14, !var12.field891, var13, arg8, arg0, var12.field872);
                            }
                            if (var12.field878 != 16) {
                                class358.method2123(arg6, arg8, arg0, var12.field878);
                            }
                        } else if (arg7 == 4) {
                            class100 var49;
                            if (!var24) {
                                var49 = new class226(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, 0, 0, 0, arg7, arg5, arg3);
                            } else {
                                class135 var50 = new class135(arg9, var12, arg2, var21, var20, var22, super.field598, 0, 0, 0, arg7, arg5);
                                if (var50.method38((byte) -89)) {
                                    var50.method49((byte) -56, arg9);
                                }
                                var49 = var50;
                            }
                            class100 var51 = class107.method663(arg6, arg8, arg0);
                            if (var51 instanceof class462) {
                                ((class462) var51).field6895 = var49;
                            } else {
                                class374.method2211(arg6, arg8, arg0, var49, (class100) null);
                            }
                        } else if (arg7 == 5) {
                            int var52 = 17;
                            class448 var53 = (class448) class48.method279(arg6, arg8, arg0);
                            if (var53 != null) {
                                var52 = class123.field1593.method2920(var53.method46(-86), 19219).field878 + 1;
                            }
                            class100 var55;
                            if (var24) {
                                class135 var54 = new class135(arg9, var12, arg2, var21, var20, var22, super.field598, 0, class242.field3207[arg5] * var52, class55.field632[arg5] * var52, arg7, arg5);
                                var55 = var54;
                                if (var54.method38((byte) -89)) {
                                    var54.method49((byte) -56, arg9);
                                }
                            } else {
                                var55 = new class226(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, 0, class242.field3207[arg5] * var52, class55.field632[arg5] * var52, arg7, arg5, arg3);
                            }
                            class100 var56 = class107.method663(arg6, arg8, arg0);
                            if (var56 instanceof class462) {
                                ((class462) var56).field6895 = var55;
                            } else {
                                class374.method2211(arg6, arg8, arg0, var55, (class100) null);
                            }
                        } else if (arg7 == 6) {
                            int var57 = 9;
                            class448 var58 = (class448) class48.method279(arg6, arg8, arg0);
                            if (var58 != null) {
                                var57 = class123.field1593.method2920(var58.method46(32), 19219).field878 / 2 + 1;
                            }
                            class100 var60;
                            if (var24) {
                                class135 var59 = new class135(arg9, var12, arg2, var21, var20, var22, super.field598, arg5, class242.field3207[arg5] * var57, class55.field632[arg5] * var57, arg7, arg5 - -4);
                                var60 = var59;
                                if (var59.method38((byte) -89)) {
                                    var59.method49((byte) -56, arg9);
                                }
                            } else {
                                var60 = new class226(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg5, class67.field764[arg5] * var57, class234.field3129[arg5] * var57, arg7, arg5 + 4, arg3);
                            }
                            class100 var61 = class107.method663(arg6, arg8, arg0);
                            if (var61 instanceof class462) {
                                ((class462) var61).field6895 = var60;
                            } else {
                                class374.method2211(arg6, arg8, arg0, var60, (class100) null);
                            }
                        } else if (~arg7 == -8) {
                            int var62 = 3 & arg5 + 2;
                            class100 var63;
                            if (!var24) {
                                var63 = new class226(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, var62, 0, 0, arg7, var62 + 4, arg3);
                            } else {
                                class135 var64 = new class135(arg9, var12, arg2, var21, var20, var22, super.field598, var62, 0, 0, arg7, var62 + 4);
                                var63 = var64;
                                if (var64.method38((byte) -89)) {
                                    var64.method49((byte) -56, arg9);
                                }
                            }
                            class100 var65 = class107.method663(arg6, arg8, arg0);
                            if (!(var65 instanceof class462)) {
                                class374.method2211(arg6, arg8, arg0, var63, (class100) null);
                            } else {
                                ((class462) var65).field6895 = var63;
                            }
                        } else if (arg7 == 8) {
                            int var66 = 3 & arg5 + 2;
                            int var67 = 9;
                            class448 var68 = (class448) class48.method279(arg6, arg8, arg0);
                            if (var68 != null) {
                                var67 = 1 + class123.field1593.method2920(var68.method46(72), 19219).field878 / 2;
                            }
                            class100 var71;
                            class100 var72;
                            if (var24) {
                                class135 var69 = new class135(arg9, var12, arg2, var21, var20, var22, super.field598, arg5, class67.field764[arg5] * var67, class234.field3129[arg5] * var67, arg7, arg5 + 4);
                                class135 var70 = new class135(arg9, var12, arg2, var21, var20, var22, super.field598, arg5, 0, 0, arg7, var66 - -4);
                                if (var69.method38((byte) -89)) {
                                    var69.method49((byte) -56, arg9);
                                }
                                if (var70.method38((byte) -89)) {
                                    var70.method49((byte) -56, arg9);
                                }
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class226 var73 = new class226(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg5, class67.field764[arg5] * var67, class234.field3129[arg5] * var67, arg7, arg5 + 4, arg3);
                                class226 var74 = new class226(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg5, 0, 0, arg7, var66 - -4, arg3);
                                var71 = var73;
                                var72 = var74;
                            }
                            class374.method2211(arg6, arg8, arg0, var71, var72);
                        }
                    } else {
                        class422 var75 = null;
                        class279 var76;
                        int var77;
                        if (!var24) {
                            var76 = new class185(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg8, arg8 + var13 + -1, arg0, var14 + -1 + arg0, arg7, arg5, arg3);
                            var77 = 15;
                        } else {
                            class422 var78 = new class422(arg9, var12, arg6, arg2, var21, var20, var22, super.field598, arg8, arg8 + var13 + -1, arg0, arg0 + var14 - 1, arg7, arg5, var23);
                            var75 = var78;
                            var77 = var78.method2604(15);
                            var76 = var78;
                        }
                        class279 var79 = class365.method2172(arg6, arg8, arg0, field7012 != null ? field7012 : (field7012 = method2887("mh")));
                        boolean var80 = false;
                        if (var79 instanceof class314 && ~var79.field3698 == ~arg8 && ~var79.field3688 == ~arg0) {
                            ((class314) var79).field4199 = var76;
                            var80 = true;
                        }
                        if (var80 || class279.method1691(var76, false)) {
                            if (var75 != null && var75.method38((byte) -89)) {
                                var75.method49((byte) -56, arg9);
                            }
                            if (var12.field816 && class415.field5979) {
                                if (var77 > 30) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; var81 <= var13; ++var81) {
                                    for (int var82 = 0; var14 >= var82; ++var82) {
                                        var19.method210(arg8 + var81, arg0 + var82, var77);
                                    }
                                }
                            }
                        }
                        if (~var12.field904 != -1 && arg1 != null) {
                            arg1.method656(118, var14, !var12.field891, var13, arg8, arg0, var12.field872);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lza;Lug;III[I)V", line = 1613)
    public final void method2885(class287 arg0, class396 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        ++field7003;
        if (!super.field598) {
            if (arg4 > 116) {
                boolean var7 = false;
                class6 var8 = null;
                if (arg5 != null) {
                    arg5[0] = -1;
                }
                while (true) {
                    while (~arg1.field5729 > ~arg1.field5761.length) {
                        int var18 = arg1.method2388((byte) -118);
                        if (var18 == 0) {
                            var8 = new class6(arg1);
                        } else if (~var18 == -2) {
                            int var19 = arg1.method2388((byte) -124);
                            if (~var19 < -1) {
                                for (int var20 = 0; var19 > var20; ++var20) {
                                    class340 var21 = new class340(arg0, arg1, 0);
                                    if (var21.field4499 == 31) {
                                        class280 var22 = class211.field2834.method1619(2, arg1.method2386(-23648));
                                        var21.method1979(var22.field3712, var22.field3710, 109, var22.field3707, var22.field3706);
                                    }
                                    if (arg0.method1176() > 0) {
                                        class309 var23 = var21.field4510;
                                        int var24 = (arg2 << 7) + var23.method1840((byte) -81);
                                        int var25 = var23.method1842((byte) 112) + (arg3 << 7);
                                        int var26 = var24 >> 7;
                                        int var27 = var25 >> 7;
                                        if (~var26 <= -1 && var27 >= 0 && super.field607 > var26 && ~super.field609 < ~var27) {
                                            var23.method365(var24, super.field608[var21.field4512][var26][var27] - var23.method1841(0), var25, false);
                                            class70.method410(var21);
                                        }
                                    }
                                }
                            }
                        } else if (var18 == 2) {
                            if (var8 == null) {
                                var8 = new class6();
                            }
                            var8.method33(-111, arg1);
                        } else if (var18 == 128) {
                            if (arg5 == null) {
                                arg1.field5729 += 10;
                            } else {
                                arg5[0] = arg1.method2386(-23648);
                                arg5[1] = arg1.method2433((byte) 115);
                                arg5[2] = arg1.method2433((byte) 115);
                                arg5[3] = arg1.method2433((byte) 115);
                                arg5[4] = arg1.method2386(-23648);
                            }
                        } else {
                            if (~var18 != -130) {
                                throw new IllegalStateException("");
                            }
                            if (super.field596 == null) {
                                super.field596 = new byte[4][][];
                            }
                            for (int var28 = 0; ~var28 > -5; ++var28) {
                                byte var29 = arg1.method2418(-87);
                                if (~var29 == -1 && super.field596[var28] != null) {
                                    int var30 = arg2;
                                    int var31 = arg2 + 64;
                                    int var32 = arg3;
                                    if (~arg3 > -1) {
                                        var32 = 0;
                                    } else if (~arg3 <= ~super.field609) {
                                        var32 = super.field609;
                                    }
                                    if (~var31 <= -1) {
                                        if (~var31 <= ~super.field607) {
                                            var31 = super.field607;
                                        }
                                    } else {
                                        var31 = 0;
                                    }
                                    int var33 = arg3 + 64;
                                    if (~arg2 > -1) {
                                        var30 = 0;
                                    } else if (~arg2 <= ~super.field607) {
                                        var30 = super.field607;
                                    }
                                    if (var33 >= 0) {
                                        if (var33 >= super.field609) {
                                            var33 = super.field609;
                                        }
                                    } else {
                                        var33 = 0;
                                    }
                                    while (~var31 < ~var30) {
                                        while (var33 > var32) {
                                            super.field596[var28][var30][var32] = 0;
                                            ++var32;
                                        }
                                        ++var30;
                                    }
                                } else if (~var29 == -2) {
                                    if (super.field596[var28] == null) {
                                        super.field596[var28] = new byte[super.field607 - -1][super.field609 + 1];
                                    }
                                    for (int var34 = 0; var34 < 64; var34 += 4) {
                                        for (int var35 = 0; var35 < 64; var35 += 4) {
                                            byte var36 = arg1.method2418(-30);
                                            for (int var37 = arg2 + var34; var34 - (-arg2 + -4) > var37; ++var37) {
                                                for (int var38 = arg3 + var35; arg3 + var35 + 4 > var38; ++var38) {
                                                    if (var37 >= 0 && super.field607 > var37 && var38 >= 0 && var38 < super.field609) {
                                                        super.field596[var28][var37][var38] = var36;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (~var29 == -3) {
                                    if (super.field596[var28] == null) {
                                        super.field596[var28] = new byte[super.field607 + 1][super.field609 - -1];
                                    }
                                    if (var28 > 0) {
                                        int var39 = arg2;
                                        int var40 = arg2 + 64;
                                        int var41 = arg3;
                                        if (arg3 < 0) {
                                            var41 = 0;
                                        } else if (arg3 >= super.field609) {
                                            var41 = super.field609;
                                        }
                                        if (arg2 >= 0) {
                                            if (~super.field607 >= ~arg2) {
                                                var39 = super.field607;
                                            }
                                        } else {
                                            var39 = 0;
                                        }
                                        int var42 = arg3 + 64;
                                        if (~var40 > -1) {
                                            var40 = 0;
                                        } else if (super.field607 <= var40) {
                                            var40 = super.field607;
                                        }
                                        if (~var42 > -1) {
                                            var42 = 0;
                                        } else if (super.field609 <= var42) {
                                            var42 = super.field609;
                                        }
                                        while (var39 < var40) {
                                            while (~var41 > ~var42) {
                                                super.field596[var28][var39][var41] = super.field596[var28 - 1][var39][var41];
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
                                int var11 = (arg2 >> 3) + var9;
                                int var12 = (arg3 >> 3) + var10;
                                if (var11 >= 0 && ~(super.field607 >> 3) < ~var11 && ~var12 <= -1 && ~(super.field609 >> 3) < ~var12) {
                                    class65.method385(var12, var8, (byte) 78, var11);
                                }
                            }
                        }
                    }
                    if (!var7 && super.field596 != null) {
                        for (int var13 = 0; var13 < 4; ++var13) {
                            if (super.field596[var13] != null) {
                                for (int var14 = 0; ~var14 > -17; ++var14) {
                                    for (int var15 = 0; ~var15 > -17; ++var15) {
                                        int var16 = (arg2 >> 2) + var14;
                                        int var17 = (arg3 >> 2) + var15;
                                        if (var16 >= 0 && var16 < 26 && var17 >= 0 && var17 < 26) {
                                            super.field596[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)I", line = 1983)
    public static final int method2886(int arg0) {
        ++field7002;
        class287 var1 = class343.field4596;
        boolean var2 = false;
        if (class20.field183 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class287.method1723((class137) null, var3, (class16) null, 0, (byte) 53, 0);
            var2 = true;
        }
        long var4 = class45.method252((byte) -8);
        if (arg0 != 50) {
            method2876(116, -67);
        }
        for (int var6 = 0; var6 < 10000; ++var6) {
            var1.method1212(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (-var4 + class45.method252((byte) -8));
        var1.method1717(100, 0, 100, -16777216, arg0 + -22844, 0);
        if (var2) {
            var1.method1724(1);
        }
        return var7;
    }
}
