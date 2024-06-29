import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class219 extends class258 {

    @OriginalMember(owner = "client!js", name = "U", descriptor = "I")
    public int field3597 = 99;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field3588 = 0;

    @OriginalMember(owner = "client!js", name = "R", descriptor = "[I")
    public static int[] field3594;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!js", name = "S", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!js", name = "T", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!js", name = "V", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!js", name = "W", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!js", name = "X", descriptor = "I")
    public static int field3600;

    // $FF: synthetic field
    @OriginalMember(owner = "client!js", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field3601;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(IIIIII)V")
    public static final void method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3593;
        if (arg2 <= 25) {
            field3588 = -67;
        }
        int var6 = class385.method2403(class433.field6414, class404.field5987, arg3, true);
        int var7 = class385.method2403(class433.field6414, class404.field5987, arg4, true);
        int var8 = class385.method2403(class184.field2777, class327.field4931, arg0, true);
        int var9 = class385.method2403(class184.field2777, class327.field4931, arg5, true);
        for (int var10 = var6; var7 >= var10; ++var10) {
            class359.method2255((byte) -103, class416.field6200[var10], var9, var8, arg1);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZLya;IIIII[Lpd;I[B)V")
    public final void method1571(int arg0, boolean arg1, class38 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class172[] arg8, int arg9, byte[] arg10) {
        ++field3600;
        class217 var12 = new class217(arg10);
        int var13 = -1;
        if (arg1) {
            while (true) {
                int var14 = var12.method1533((byte) 89);
                if (var14 == 0) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method1510(-129);
                    if (var16 == 0) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = 63 & var15;
                    int var18 = (4087 & var15) >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method1515((byte) 125);
                    int var21 = var20 >> 2;
                    int var22 = var20 & 3;
                    if (arg0 == var19 && var18 >= arg7 && arg7 + 8 > var18 && arg3 <= var17 && var17 < arg3 + 8) {
                        class69 var23 = class510.field7458.method2973(-124, var13);
                        int var24 = class40.method379(var22, -95, var23.field941, arg9, var23.field927, 7 & var18, 7 & var17) + arg5;
                        int var25 = arg6 + class498.method2952(var23.field927, arg9, (byte) -92, var23.field941, var22, 7 & var17, 7 & var18);
                        if (~var24 < -1 && var25 > 0 && super.field3965 + -1 > var24 && ~(super.field3948 + -1) < ~var25) {
                            class172 var26 = null;
                            if (!super.field3957) {
                                int var27 = arg4;
                                if (~(2 & class476.field6873[1][var24][var25]) == -3) {
                                    var27 = arg4 - 1;
                                }
                                if (~var27 <= -1) {
                                    var26 = arg8[var27];
                                }
                            }
                            this.method1578(3 & arg9 + var22, var21, arg4, -1, var26, var25, arg2, var24, (byte) 103, var13, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILya;IIILpd;I)V")
    public final void method1572(int arg0, class38 arg1, int arg2, int arg3, int arg4, class172 arg5, int arg6) {
        ++field3590;
        class164 var8 = null;
        if (~arg4 == -1) {
            var8 = (class164) class85.method713(arg2, arg0, arg3);
        }
        if (~arg4 == -2) {
            var8 = (class164) class188.method1263(arg2, arg0, arg3);
        }
        if (arg4 == arg6) {
            var8 = (class164) class154.method1057(arg2, arg0, arg3, field3601 != null ? field3601 : (field3601 = method1581("ig")));
        }
        if (arg4 == 3) {
            var8 = (class164) class446.method2736(arg2, arg0, arg3);
        }
        if (var8 != null) {
            class69 var9 = class510.field7458.method2973(arg6 ^ -124, var8.method624((byte) -127));
            int var10 = var8.method627(23326);
            int var11 = var8.method621(3021);
            if (var9.method592(0)) {
                class436.method2700(arg0, arg2, arg3, var9, false);
            }
            if (var8.method614(-1086)) {
                var8.method619(true, arg1);
            }
            if (arg4 != 0) {
                if (~arg4 == -2) {
                    class168 var12 = class188.method1263(arg2, arg0, arg3);
                    if (!(var12 instanceof class165)) {
                        class286.method1847(arg2, arg0, arg3);
                        return;
                    }
                    ((class165) var12).field2426 = null;
                    return;
                }
                if (~arg4 != -3) {
                    if (~arg4 == -4) {
                        class171 var13 = class446.method2736(arg2, arg0, arg3);
                        if (var13 instanceof class202) {
                            ((class202) var13).field3355 = null;
                        } else {
                            class178.method1193(arg2, arg0, arg3);
                        }
                        if (var9.field926 == 1) {
                            arg5.method1155(arg3, arg0, arg6 ^ 113);
                            return;
                        }
                    }
                    return;
                }
                class389 var14 = class154.method1057(arg2, arg0, arg3, field3601 != null ? field3601 : (field3601 = method1581("ig")));
                if (var14 instanceof class132 && ~var14.field5836 == ~arg0 && ~var14.field5830 == ~arg3) {
                    ((class132) var14).field2028 = null;
                } else {
                    class240.method1651(arg2, arg0, arg3, field3601 != null ? field3601 : (field3601 = method1581("ig")));
                }
                if (~var9.field926 != -1 && ~(arg0 - -var9.field941) > ~super.field3965 && var9.field941 + arg3 < super.field3948 && var9.field927 + arg0 < super.field3965 && ~super.field3948 < ~(var9.field927 + arg3)) {
                    arg5.method1164(arg0, !var9.field967, var11, arg6 ^ 2, var9.field941, var9.field908, arg3, var9.field927);
                    return;
                }
                return;
            }
            class312 var15 = class85.method713(arg2, arg0, arg3);
            if (!(var15 instanceof class261)) {
                class153.method1051(arg2, arg0, arg3);
            } else {
                ((class261) var15).field4003 = null;
            }
            if (~var9.field926 != -1) {
                arg5.method1157(var10, arg6 + 114, var11, var9.field908, !var9.field967, arg3, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lya;B)V")
    public final void method1573(class38 arg0, byte arg1) {
        class405.method2529(arg0);
        ++field3598;
        if (super.field3959 > 1) {
            for (int var3 = 0; ~super.field3965 < ~var3; ++var3) {
                for (int var4 = 0; super.field3948 > var4; ++var4) {
                    if (~(class476.field6873[1][var3][var4] & 2) == -3) {
                        class73.method638(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field3959 > var5; ++var5) {
            for (int var6 = 0; var6 <= super.field3948; ++var6) {
                for (int var7 = 0; ~super.field3965 <= ~var7; ++var7) {
                    if (~(1 & super.field3969[var5][var7][var6]) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (~super.field3948 < ~var9 && (1 & super.field3969[var5][var7][var9 - -1]) != 0) {
                            ++var9;
                        }
                        int var11 = var5;
                        while (~var8 < -1 && ~(super.field3969[var5][var7][var8 + -1] & 1) != -1) {
                            --var8;
                        }
                        label172: while (~var10 < -1) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if (~(1 & super.field3969[var10 + -1][var7][var12]) == -1) {
                                    break label172;
                                }
                            }
                            --var10;
                        }
                        label161: while (~var11 > -4) {
                            for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                if ((super.field3969[var11 + 1][var7][var13] & 1) == 0) {
                                    break label161;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 - -1) * (var11 - var10 + 1);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field3946[var11][var7][var8] - var15;
                            int var17 = super.field3946[var10][var7][var8];
                            class435.method2695(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) - -128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; var9 >= var19; ++var19) {
                                    super.field3969[var18][var7][var19] = (byte) class74.method644(super.field3969[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((2 & super.field3969[var5][var7][var6]) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var21 > ~super.field3965 && ~(2 & super.field3969[var5][var21 + 1][var6]) != -1) {
                            ++var21;
                        }
                        while (var20 > 0 && ~(2 & super.field3969[var5][var20 + -1][var6]) != -1) {
                            --var20;
                        }
                        int var23 = var5;
                        label226: while (~var22 < -1) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if ((2 & super.field3969[var22 + -1][var24][var6]) == 0) {
                                    break label226;
                                }
                            }
                            --var22;
                        }
                        label215: while (~var23 > -4) {
                            for (int var25 = var20; ~var21 <= ~var25; ++var25) {
                                if ((super.field3969[var23 + 1][var25][var6] & 2) == 0) {
                                    break label215;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 + 1 - var20) * (var23 + 1 + -var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field3946[var23][var20][var6] - var27;
                            int var29 = super.field3946[var22][var20][var6];
                            class435.method2695(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; ~var21 <= ~var31; ++var31) {
                                    super.field3969[var30][var31][var6] = (byte) class74.method644(super.field3969[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(super.field3969[var5][var7][var6] & 4) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && (super.field3969[var5][var7][var34 + -1] & 4) != 0; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~super.field3948 < ~var35 && (super.field3969[var5][var7][var35 + 1] & 4) != 0; ++var35) {
                        }
                        label280: while (~var32 < -1) {
                            for (int var36 = var34; ~var36 >= ~var35; ++var36) {
                                if ((4 & super.field3969[var5][var32 - 1][var36]) == 0) {
                                    break label280;
                                }
                            }
                            --var32;
                        }
                        label269: while (super.field3965 > var33) {
                            for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                if ((4 & super.field3969[var5][var33 + 1][var37]) == 0) {
                                    break label269;
                                }
                            }
                            ++var33;
                        }
                        if ((-var32 + var33 - -1) * (-var34 + var35 + 1) >= 4) {
                            int var38 = super.field3946[var5][var32][var34];
                            class435.method2695(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    super.field3969[var5][var39][var40] = (byte) class74.method644(super.field3969[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -120) {
            this.method1579((byte[]) null, -128, (class172[]) null, (class38) null, -109, -113);
        }
        super.field3969 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIILhp;II[ILya;III)V")
    public final void method1574(int arg0, int arg1, int arg2, class217 arg3, int arg4, int arg5, int[] arg6, class38 arg7, int arg8, int arg9, int arg10) {
        ++field3589;
        if (!super.field3957) {
            boolean var12 = false;
            if (arg6 != null) {
                arg6[0] = -1;
            }
            class358 var13 = null;
            int var14 = (arg4 & 7) * 8;
            int var15 = (7 & arg9) * 8;
            while (true) {
                int var21;
                label243: do {
                    while (true) {
                        while (~arg3.field3572.length < ~arg3.field3556) {
                            int var20 = arg3.method1515((byte) 122);
                            if (var20 != 0) {
                                if (var20 == 1) {
                                    var21 = arg3.method1515((byte) 122);
                                    continue label243;
                                }
                                if (~var20 == -3) {
                                    if (var13 == null) {
                                        var13 = new class358();
                                    }
                                    var13.method2250(arg3, true);
                                } else if (~var20 == -129) {
                                    if (arg6 == null) {
                                        arg3.field3556 += 10;
                                    } else {
                                        arg6[0] = arg3.method1511(83);
                                        arg6[1] = arg3.method1529((byte) -27);
                                        arg6[2] = arg3.method1529((byte) -34);
                                        arg6[3] = arg3.method1529((byte) 126);
                                        arg6[4] = arg3.method1511(103);
                                    }
                                } else {
                                    if (var20 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field3964 == null) {
                                        super.field3964 = new byte[4][][];
                                    }
                                    for (int var32 = 0; ~var32 > -5; ++var32) {
                                        byte var33 = arg3.method1565(true);
                                        if (var33 == 0 && super.field3964[arg0] != null) {
                                            if (var32 <= arg1) {
                                                int var34 = arg5;
                                                int var35 = arg5 + 7;
                                                int var36 = arg10;
                                                if (var35 >= 0) {
                                                    if (var35 >= super.field3965) {
                                                        var35 = super.field3965;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                if (~arg10 > -1) {
                                                    var36 = 0;
                                                } else if (super.field3948 <= arg10) {
                                                    var36 = super.field3948;
                                                }
                                                if (arg5 >= 0) {
                                                    if (arg5 >= super.field3965) {
                                                        var34 = super.field3965;
                                                    }
                                                } else {
                                                    var34 = 0;
                                                }
                                                int var37 = arg10 - -7;
                                                if (~var37 > -1) {
                                                    var37 = 0;
                                                } else if (~var37 <= ~super.field3948) {
                                                    var37 = super.field3948;
                                                }
                                                while (var34 < var35) {
                                                    while (var36 < var37) {
                                                        super.field3964[arg0][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (var33 == 1) {
                                            if (super.field3964[arg0] == null) {
                                                super.field3964[arg0] = new byte[super.field3965 - -1][super.field3948 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg3.method1565(true);
                                                    if (arg1 >= var32) {
                                                        for (int var41 = var38; ~var41 > ~(var38 + 4); ++var41) {
                                                            for (int var42 = var39; ~var42 > ~(var39 + 4); ++var42) {
                                                                if (var41 >= var14 && var41 < var14 - -8 && var15 <= var42 && var15 < var15 + 8) {
                                                                    int var43 = class323.method2056(var41 & 7, true, arg8, 7 & var42) + arg5;
                                                                    int var44 = arg10 - -class251.method1694(-1, var41 & 7, arg8, 7 & var42);
                                                                    if (var43 >= 0 && ~var43 > ~super.field3965 && ~var44 <= -1 && ~super.field3948 < ~var44) {
                                                                        super.field3964[arg0][var43][var44] = var40;
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
                                var13 = new class358(arg3);
                            }
                        }
                        if (var13 != null) {
                            class202.method1414(arg10 >> 3, var13, 0, arg5 >> 3);
                        }
                        if (arg2 >= -76) {
                            return;
                        }
                        if (!var12 && super.field3964 != null && super.field3964[arg0] != null) {
                            int var16 = arg5 + 7;
                            int var17 = arg10 - -7;
                            for (int var18 = arg5; ~var18 > ~var16; ++var18) {
                                for (int var19 = arg10; var17 > var19; ++var19) {
                                    super.field3964[arg0][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; ~var22 > ~var21; ++var22) {
                    class396 var23 = new class396(arg7, arg3, 0);
                    if (~var23.field5924 == -32) {
                        class465 var24 = class52.field639.method1702(31, arg3.method1511(81));
                        var23.method2495(var24.field6726, 0, var24.field6727, var24.field6731, var24.field6729);
                    }
                    if (arg7.method301() > 0) {
                        class470 var25 = var23.field5918;
                        int var26 = var25.method2835(-30143) >> 7;
                        int var27 = var25.method2833((byte) 78) >> 7;
                        if (var23.field5920 == arg1 && var26 >= var14 && var26 < var14 + 8 && ~var27 <= ~var15 && var15 + 8 > var27) {
                            int var28 = class371.method2327(arg8, var25.method2835(-30143) & 1023, (byte) -102, var25.method2833((byte) 89) & 1023) + (arg5 << 7);
                            int var29 = (arg10 << 7) + class97.method790(false, arg8, var25.method2833((byte) 72) & 1023, 1023 & var25.method2835(-30143));
                            int var30 = var28 >> 7;
                            int var31 = var29 >> 7;
                            if (var30 >= 0 && var31 >= 0 && var30 < super.field3965 && ~super.field3948 < ~var31) {
                                var25.method787(var29, true, super.field3946[arg1][var30][var31] - var25.method2832(false), var28);
                                if (arg7.method301() > 0) {
                                    class448.method2744(var23);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIZ)V")
    public class219(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class457.field6653, class62.field760);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILhp;ILya;I[I)V")
    public final void method1575(int arg0, class217 arg1, int arg2, class38 arg3, int arg4, int[] arg5) {
        ++field3595;
        if (!super.field3957) {
            boolean var7 = false;
            class358 var8 = null;
            if (arg0 != 1026) {
                this.method1571(81, true, (class38) null, 43, 31, -86, 43, 100, (class172[]) null, 24, (byte[]) null);
            }
            if (arg5 != null) {
                arg5[0] = -1;
            }
            while (true) {
                int var19;
                label315: do {
                    while (true) {
                        while (~arg1.field3556 > ~arg1.field3572.length) {
                            int var18 = arg1.method1515((byte) 124);
                            if (~var18 != -1) {
                                if (~var18 == -2) {
                                    var19 = arg1.method1515((byte) 124);
                                    continue label315;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class358();
                                    }
                                    var8.method2250(arg1, true);
                                } else if (var18 == 128) {
                                    if (arg5 != null) {
                                        arg5[0] = arg1.method1511(class425.method2656(arg0, -1112));
                                        arg5[1] = arg1.method1529((byte) 121);
                                        arg5[2] = arg1.method1529((byte) 114);
                                        arg5[3] = arg1.method1529((byte) 102);
                                        arg5[4] = arg1.method1511(-51);
                                    } else {
                                        arg1.field3556 += 10;
                                    }
                                } else {
                                    if (var18 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field3964 == null) {
                                        super.field3964 = new byte[4][][];
                                    }
                                    for (int var28 = 0; var28 < 4; ++var28) {
                                        byte var29 = arg1.method1565(true);
                                        if (~var29 == -1 && super.field3964[var28] != null) {
                                            int var30 = arg2;
                                            int var31 = arg2 + 64;
                                            int var32 = arg4;
                                            int var33 = arg4 + 64;
                                            if (arg4 >= 0) {
                                                if (~arg4 <= ~super.field3948) {
                                                    var32 = super.field3948;
                                                }
                                            } else {
                                                var32 = 0;
                                            }
                                            if (arg2 < 0) {
                                                var30 = 0;
                                            } else if (~super.field3965 >= ~arg2) {
                                                var30 = super.field3965;
                                            }
                                            if (~var31 > -1) {
                                                var31 = 0;
                                            } else if (~var31 <= ~super.field3965) {
                                                var31 = super.field3965;
                                            }
                                            if (~var33 > -1) {
                                                var33 = 0;
                                            } else if (super.field3948 <= var33) {
                                                var33 = super.field3948;
                                            }
                                            while (var30 < var31) {
                                                while (~var33 < ~var32) {
                                                    super.field3964[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 == 1) {
                                            if (super.field3964[var28] == null) {
                                                super.field3964[var28] = new byte[super.field3965 - -1][super.field3948 - -1];
                                            }
                                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                                for (int var35 = 0; var35 < 64; var35 += 4) {
                                                    byte var36 = arg1.method1565(true);
                                                    for (int var37 = arg2 + var34; ~(var34 - -4 + arg2) < ~var37; ++var37) {
                                                        for (int var38 = arg4 + var35; var35 - (-arg4 + -4) > var38; ++var38) {
                                                            if (~var37 <= -1 && ~super.field3965 < ~var37 && var38 >= 0 && ~var38 > ~super.field3948) {
                                                                super.field3964[var28][var37][var38] = var36;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (var29 == 2) {
                                            if (super.field3964[var28] == null) {
                                                super.field3964[var28] = new byte[super.field3965 + 1][super.field3948 + 1];
                                            }
                                            if (~var28 < -1) {
                                                int var39 = arg2;
                                                int var40 = arg2 + 64;
                                                int var41 = arg4;
                                                if (var40 < 0) {
                                                    var40 = 0;
                                                } else if (super.field3965 <= var40) {
                                                    var40 = super.field3965;
                                                }
                                                if (~arg2 > -1) {
                                                    var39 = 0;
                                                } else if (~super.field3965 >= ~arg2) {
                                                    var39 = super.field3965;
                                                }
                                                if (arg4 < 0) {
                                                    var41 = 0;
                                                } else if (~arg4 <= ~super.field3948) {
                                                    var41 = super.field3948;
                                                }
                                                int var42 = arg4 - -64;
                                                if (var42 >= 0) {
                                                    if (~super.field3948 >= ~var42) {
                                                        var42 = super.field3948;
                                                    }
                                                } else {
                                                    var42 = 0;
                                                }
                                                while (~var40 < ~var39) {
                                                    while (~var41 > ~var42) {
                                                        super.field3964[var28][var39][var41] = super.field3964[var28 + -1][var39][var41];
                                                        ++var41;
                                                    }
                                                    ++var39;
                                                }
                                            }
                                        }
                                    }
                                    var7 = true;
                                }
                            } else {
                                var8 = new class358(arg1);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg2 >> 3) - -var9;
                                    int var12 = (arg4 >> 3) - -var10;
                                    if (~var11 <= -1 && super.field3965 >> 3 > var11 && ~var12 <= -1 && super.field3948 >> 3 > var12) {
                                        class202.method1414(var12, var8, arg0 ^ 1026, var11);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field3964 != null) {
                            for (int var13 = 0; var13 < 4; ++var13) {
                                if (super.field3964[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; var15 < 16; ++var15) {
                                            int var16 = (arg2 >> 2) + var14;
                                            int var17 = (arg4 >> 2) - -var15;
                                            if (var16 >= 0 && ~var16 > -27 && var17 >= 0 && ~var17 > -27) {
                                                super.field3964[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (var19 <= 0);
                for (int var20 = 0; var20 < var19; ++var20) {
                    class396 var21 = new class396(arg3, arg1, 0);
                    if (~var21.field5924 == -32) {
                        class465 var22 = class52.field639.method1702(arg0 ^ 1053, arg1.method1511(-39));
                        var21.method2495(var22.field6726, 0, var22.field6727, var22.field6731, var22.field6729);
                    }
                    if (~arg3.method301() < -1) {
                        class470 var23 = var21.field5918;
                        int var24 = (arg2 << 7) + var23.method2835(-30143);
                        int var25 = (arg4 << 7) + var23.method2833((byte) 78);
                        int var26 = var24 >> 7;
                        int var27 = var25 >> 7;
                        if (var26 >= 0 && ~var27 <= -1 && ~var26 > ~super.field3965 && ~var27 > ~super.field3948) {
                            var23.method787(var25, true, super.field3946[var21.field5920][var26][var27] + -var23.method2832(false), var24);
                            if (~arg3.method301() < -1) {
                                class448.method2744(var21);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
    public static void method1576(int arg0) {
        if (arg0 != -1) {
            method1577(11, true, 96, -84, -91);
        }
        field3594 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZIII)V")
    public static final void method1577(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3591;
        if (arg2 <= 28) {
            method1577(112, true, -45, -99, -35);
        }
        if (class96.field1384 == 0) {
            class387.method2419(false, (byte) -1);
        } else {
            class385.field5798 = class96.field1384;
            class185.method1229((byte) -96, 0);
        }
        class203.field3373 = arg3;
        class320.field4816 = arg1;
        class36.field430 = arg4;
        class7.method42(arg0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIILpd;ILya;IBII)V")
    public final void method1578(int arg0, int arg1, int arg2, int arg3, class172 arg4, int arg5, class38 arg6, int arg7, byte arg8, int arg9, int arg10) {
        ++field3596;
        if (class193.field3258.method938(class96.field1384, -28) || class408.method2570(false, arg7, arg2, class61.field726, arg5)) {
            if (~arg10 > ~this.field3597) {
                this.field3597 = arg10;
            }
            class69 var12 = class510.field7458.method2973(-122, arg9);
            if (!arg6.method323() || !class193.field3258.field7226 || !var12.field957) {
                int var13;
                int var14;
                if (arg0 != 1 && ~arg0 != -4) {
                    var13 = var12.field941;
                    var14 = var12.field927;
                } else {
                    var13 = var12.field927;
                    var14 = var12.field941;
                }
                int var15;
                int var16;
                if (arg7 + var13 > super.field3965) {
                    var15 = arg7;
                    var16 = arg7 + 1;
                } else {
                    var15 = arg7 - -(var13 >> 1);
                    var16 = (var13 - -1 >> 1) + arg7;
                }
                int var17;
                int var18;
                if (~super.field3948 > ~(arg5 - -var14)) {
                    var17 = arg5;
                    var18 = arg5 + 1;
                } else {
                    var17 = arg5 - -(var14 >> 1);
                    var18 = (var14 - -1 >> 1) + arg5;
                }
                class145 var19 = class491.field7059[arg2];
                if (arg8 < 94) {
                    field3588 = -27;
                }
                int var20 = var19.method411(var15, var17) + var19.method411(var16, var17) - (-var19.method411(var15, var18) + -var19.method411(var16, var18)) >> 2;
                int var21 = (arg7 << 7) + (var13 << 6);
                int var22 = (arg5 << 7) + (var14 << 6);
                boolean var23 = class65.field843 && !super.field3957 && var12.field919;
                if (var12.method592(0)) {
                    class471.method2842(arg5, var12, (byte) 106, arg10, (class116) null, arg0, arg7, (class177) null);
                }
                boolean var24 = arg3 == -1 && ~var12.field910 == 0 && var12.field945 == null && var12.field906 == null && !var12.field951;
                if (!class308.field4644 || (!class201.method1412(arg1, -1) || ~var12.field963 == -2) && (!class520.method3092(arg1, (byte) 122) || ~var12.field963 != -1)) {
                    if (arg1 == 22) {
                        if (class193.field3258.field7224 || ~var12.field922 != -1 || var12.field926 == 1 || var12.field980) {
                            class171 var25;
                            if (!var24) {
                                var25 = new class488(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg0, arg3);
                            } else {
                                class353 var26 = new class353(arg6, var12, arg2, var21, var20, var22, super.field3957, arg0, var23);
                                if (var26.method614(-1086)) {
                                    var26.method623(127, arg6);
                                }
                                var25 = var26;
                            }
                            class171 var27 = class446.method2736(arg10, arg7, arg5);
                            if (var27 instanceof class202) {
                                ((class202) var27).field3355 = var25;
                            } else {
                                class379.method2382(arg10, arg7, arg5, var25);
                            }
                            if (var12.field926 == 1 && arg4 != null) {
                                arg4.method1150(-10376, arg5, arg7);
                            }
                        }
                    } else if (~arg1 != -11 && arg1 != 11) {
                        if (arg1 >= 12 && ~arg1 >= -18 || ~arg1 <= -19 && ~arg1 >= -22) {
                            class389 var28;
                            if (!var24) {
                                var28 = new class223(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg7, arg7 - 1 + var13, arg5, arg5 - -var14 + -1, arg1, arg0, arg3);
                            } else {
                                class508 var29 = new class508(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg7, arg7 + var13 - 1, arg5, arg5 + var14 - 1, arg1, arg0, var23);
                                var28 = var29;
                                if (var29.method614(-1086)) {
                                    var29.method623(126, arg6);
                                }
                            }
                            class389 var30 = class154.method1057(arg10, arg7, arg5, field3601 != null ? field3601 : (field3601 = method1581("ig")));
                            if (var30 instanceof class132 && ~var30.field5836 == ~arg7 && ~var30.field5830 == ~arg5) {
                                ((class132) var30).field2028 = var28;
                            } else {
                                class495.method2940(var28, false);
                            }
                            if (class65.field843 && !super.field3957 && arg1 >= 12 && ~arg1 >= -18 && arg1 != 13 && arg10 > 0 && ~var12.field963 != -1) {
                                super.field3969[arg10][arg7][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5], 4);
                            }
                            if (var12.field926 != 0 && arg4 != null) {
                                arg4.method1165(var12.field908, !var12.field967, 1, arg5, arg7, var13, var14);
                            }
                        } else if (~arg1 == -1) {
                            int var31 = var12.field963;
                            if (class182.field2720 && var12.field963 == -1) {
                                var31 = 1;
                            }
                            class312 var32;
                            if (!var24) {
                                var32 = new class71(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg1, arg0, arg3);
                            } else {
                                class141 var33 = new class141(arg6, var12, arg2, var21, var20, var22, super.field3957, arg1, arg0, var23);
                                if (var33.method614(-1086)) {
                                    var33.method623(127, arg6);
                                }
                                var32 = var33;
                            }
                            class312 var34 = class85.method713(arg10, arg7, arg5);
                            if (!(var34 instanceof class261)) {
                                class81.method683(arg10, arg7, arg5, var32, (class312) null);
                            } else {
                                ((class261) var34).field4003 = var32;
                            }
                            if (class65.field843) {
                                if (~arg0 != -1) {
                                    if (arg0 != 1) {
                                        if (~arg0 != -3) {
                                            if (~arg0 == -4) {
                                                if (var12.field923) {
                                                    var19.method405(arg7, arg5, 50);
                                                    var19.method405(arg7 + 1, arg5, 50);
                                                }
                                                if (~var31 == -2 && !super.field3957) {
                                                    super.field3969[arg10][arg7][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5], 2);
                                                }
                                            }
                                        } else {
                                            if (var12.field923) {
                                                var19.method405(arg7 + 1, arg5, 50);
                                                var19.method405(arg7 + 1, arg5 + 1, 50);
                                            }
                                            if (~var31 == -2 && !super.field3957) {
                                                super.field3969[arg10][arg7 - -1][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7 - -1][arg5], 1);
                                            }
                                        }
                                    } else {
                                        if (var12.field923) {
                                            var19.method405(arg7, arg5 + 1, 50);
                                            var19.method405(arg7 + 1, arg5 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field3957) {
                                            super.field3969[arg10][arg7][arg5 + 1] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5 + 1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field923) {
                                        var19.method405(arg7, arg5, 50);
                                        var19.method405(arg7, arg5 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field3957) {
                                        super.field3969[arg10][arg7][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5], 1);
                                    }
                                }
                            }
                            if (~var12.field926 != -1 && arg4 != null) {
                                arg4.method1159(arg5, (byte) 127, !var12.field967, arg0, arg1, arg7, var12.field908);
                            }
                            if (var12.field974 != 16) {
                                class384.method2401(arg10, arg7, arg5, var12.field974);
                            }
                        } else if (~arg1 == -2) {
                            class312 var35;
                            if (!var24) {
                                var35 = new class71(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg1, arg0, arg3);
                            } else {
                                class141 var36 = new class141(arg6, var12, arg2, var21, var20, var22, super.field3957, arg1, arg0, var23);
                                if (var36.method614(-1086)) {
                                    var36.method623(126, arg6);
                                }
                                var35 = var36;
                            }
                            class312 var37 = class85.method713(arg10, arg7, arg5);
                            if (!(var37 instanceof class261)) {
                                class81.method683(arg10, arg7, arg5, var35, (class312) null);
                            } else {
                                ((class261) var37).field4003 = var35;
                            }
                            if (var12.field923 && class65.field843) {
                                if (~arg0 == -1) {
                                    var19.method405(arg7, arg5 + 1, 50);
                                } else if (~arg0 == -2) {
                                    var19.method405(arg7 + 1, arg5 + 1, 50);
                                } else if (~arg0 == -3) {
                                    var19.method405(arg7 - -1, arg5, 50);
                                } else if (~arg0 == -4) {
                                    var19.method405(arg7, arg5, 50);
                                }
                            }
                            if (var12.field926 != 0 && arg4 != null) {
                                arg4.method1159(arg5, (byte) 127, !var12.field967, arg0, arg1, arg7, var12.field908);
                            }
                        } else if (arg1 == 2) {
                            int var38 = 3 & arg0 + 1;
                            class312 var39;
                            class312 var40;
                            if (!var24) {
                                var39 = new class71(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg1, arg0 + 4, arg3);
                                var40 = new class71(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg1, var38, arg3);
                            } else {
                                class141 var41 = new class141(arg6, var12, arg2, var21, var20, var22, super.field3957, arg1, arg0 + 4, var23);
                                class141 var42 = new class141(arg6, var12, arg2, var21, var20, var22, super.field3957, arg1, var38, var23);
                                if (var41.method614(-1086)) {
                                    var41.method623(126, arg6);
                                }
                                var40 = var42;
                                var39 = var41;
                                if (var42.method614(-1086)) {
                                    var42.method623(127, arg6);
                                }
                            }
                            class81.method683(arg10, arg7, arg5, var39, var40);
                            if (var12.field963 == 1 && class65.field843 && !super.field3957) {
                                if (arg0 == 0) {
                                    super.field3969[arg10][arg7][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5], 1);
                                    super.field3969[arg10][arg7][arg5 + 1] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5 + 1], 2);
                                } else if (~arg0 != -2) {
                                    if (arg0 != 2) {
                                        if (arg0 == 3) {
                                            super.field3969[arg10][arg7][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5], 2);
                                            super.field3969[arg10][arg7][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5], 1);
                                        }
                                    } else {
                                        super.field3969[arg10][arg7 + 1][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7 + 1][arg5], 1);
                                        super.field3969[arg10][arg7][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5], 2);
                                    }
                                } else {
                                    super.field3969[arg10][arg7][arg5 - -1] = (byte) class264.method1763(super.field3969[arg10][arg7][arg5 - -1], 2);
                                    super.field3969[arg10][arg7 - -1][arg5] = (byte) class264.method1763(super.field3969[arg10][arg7 - -1][arg5], 1);
                                }
                            }
                            if (~var12.field926 != -1 && arg4 != null) {
                                arg4.method1159(arg5, (byte) 127, !var12.field967, arg0, arg1, arg7, var12.field908);
                            }
                            if (~var12.field974 != -17) {
                                class384.method2401(arg10, arg7, arg5, var12.field974);
                            }
                        } else if (arg1 == 3) {
                            class312 var43;
                            if (!var24) {
                                var43 = new class71(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg1, arg0, arg3);
                            } else {
                                class141 var44 = new class141(arg6, var12, arg2, var21, var20, var22, super.field3957, arg1, arg0, var23);
                                if (var44.method614(-1086)) {
                                    var44.method623(126, arg6);
                                }
                                var43 = var44;
                            }
                            class312 var45 = class85.method713(arg10, arg7, arg5);
                            if (!(var45 instanceof class261)) {
                                class81.method683(arg10, arg7, arg5, var43, (class312) null);
                            } else {
                                ((class261) var45).field4003 = var43;
                            }
                            if (var12.field923 && class65.field843) {
                                if (~arg0 != -1) {
                                    if (~arg0 == -2) {
                                        var19.method405(arg7 - -1, arg5 - -1, 50);
                                    } else if (arg0 != 2) {
                                        if (~arg0 == -4) {
                                            var19.method405(arg7, arg5, 50);
                                        }
                                    } else {
                                        var19.method405(arg7 + 1, arg5, 50);
                                    }
                                } else {
                                    var19.method405(arg7, arg5 + 1, 50);
                                }
                            }
                            if (~var12.field926 != -1 && arg4 != null) {
                                arg4.method1159(arg5, (byte) 127, !var12.field967, arg0, arg1, arg7, var12.field908);
                            }
                        } else if (~arg1 == -10) {
                            class389 var46;
                            if (!var24) {
                                var46 = new class223(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg7, arg7 + var13 + -1, arg5, arg5 + var14 + -1, arg1, arg0, arg3);
                            } else {
                                class508 var47 = new class508(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg7, arg7, arg5, arg5, arg1, arg0, var23);
                                if (var47.method614(-1086)) {
                                    var47.method623(126, arg6);
                                }
                                var46 = var47;
                            }
                            class389 var48 = class154.method1057(arg10, arg7, arg5, field3601 != null ? field3601 : (field3601 = method1581("ig")));
                            if (var48 instanceof class132 && var48.field5836 == arg7 && var48.field5830 == arg5) {
                                ((class132) var48).field2028 = var46;
                            } else {
                                class495.method2940(var46, false);
                            }
                            if (~var12.field926 != -1 && arg4 != null) {
                                arg4.method1165(var12.field908, !var12.field967, 1, arg5, arg7, var13, var14);
                            }
                            if (var12.field974 != 16) {
                                class384.method2401(arg10, arg7, arg5, var12.field974);
                            }
                        } else if (~arg1 == -5) {
                            class168 var50;
                            if (var24) {
                                class157 var49 = new class157(arg6, var12, arg2, var21, var20, var22, super.field3957, 0, 0, 0, arg1, arg0);
                                if (var49.method614(-1086)) {
                                    var49.method623(127, arg6);
                                }
                                var50 = var49;
                            } else {
                                var50 = new class173(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, 0, 0, 0, arg1, arg0, arg3);
                            }
                            class168 var51 = class188.method1263(arg10, arg7, arg5);
                            if (var51 instanceof class165) {
                                ((class165) var51).field2426 = var50;
                            } else {
                                class10.method72(arg10, arg7, arg5, var50, (class168) null);
                            }
                        } else if (~arg1 == -6) {
                            int var52 = 17;
                            class164 var53 = (class164) class85.method713(arg10, arg7, arg5);
                            if (var53 != null) {
                                var52 = 1 + class510.field7458.method2973(-122, var53.method624((byte) -122)).field974;
                            }
                            class168 var54;
                            if (!var24) {
                                var54 = new class173(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, 0, class431.field6383[arg0] * var52, class395.field5892[arg0] * var52, arg1, arg0, arg3);
                            } else {
                                class157 var55 = new class157(arg6, var12, arg2, var21, var20, var22, super.field3957, 0, class431.field6383[arg0] * var52, class395.field5892[arg0] * var52, arg1, arg0);
                                if (var55.method614(-1086)) {
                                    var55.method623(127, arg6);
                                }
                                var54 = var55;
                            }
                            class168 var56 = class188.method1263(arg10, arg7, arg5);
                            if (!(var56 instanceof class165)) {
                                class10.method72(arg10, arg7, arg5, var54, (class168) null);
                            } else {
                                ((class165) var56).field2426 = var54;
                            }
                        } else if (arg1 == 6) {
                            int var57 = 9;
                            class164 var58 = (class164) class85.method713(arg10, arg7, arg5);
                            if (var58 != null) {
                                var57 = class510.field7458.method2973(-122, var58.method624((byte) -123)).field974 / 2 + 1;
                            }
                            class168 var60;
                            if (var24) {
                                class157 var59 = new class157(arg6, var12, arg2, var21, var20, var22, super.field3957, arg0, class431.field6383[arg0] * var57, class395.field5892[arg0] * var57, arg1, arg0 + 4);
                                if (var59.method614(-1086)) {
                                    var59.method623(127, arg6);
                                }
                                var60 = var59;
                            } else {
                                var60 = new class173(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg0, class367.field5400[arg0] * var57, class387.field5813[arg0] * var57, arg1, arg0 - -4, arg3);
                            }
                            class168 var61 = class188.method1263(arg10, arg7, arg5);
                            if (!(var61 instanceof class165)) {
                                class10.method72(arg10, arg7, arg5, var60, (class168) null);
                            } else {
                                ((class165) var61).field2426 = var60;
                            }
                        } else if (arg1 == 7) {
                            int var62 = 3 & arg0 + 2;
                            class168 var63;
                            if (!var24) {
                                var63 = new class173(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, var62, 0, 0, arg1, var62 + 4, arg3);
                            } else {
                                class157 var64 = new class157(arg6, var12, arg2, var21, var20, var22, super.field3957, var62, 0, 0, arg1, var62 + 4);
                                var63 = var64;
                                if (var64.method614(-1086)) {
                                    var64.method623(126, arg6);
                                }
                            }
                            class168 var65 = class188.method1263(arg10, arg7, arg5);
                            if (!(var65 instanceof class165)) {
                                class10.method72(arg10, arg7, arg5, var63, (class168) null);
                            } else {
                                ((class165) var65).field2426 = var63;
                            }
                        } else if (arg1 == 8) {
                            int var66 = 3 & arg0 + 2;
                            int var67 = 9;
                            class164 var68 = (class164) class85.method713(arg10, arg7, arg5);
                            if (var68 != null) {
                                var67 = class510.field7458.method2973(-125, var68.method624((byte) -124)).field974 / 2 - -1;
                            }
                            class168 var71;
                            class168 var72;
                            if (var24) {
                                class157 var69 = new class157(arg6, var12, arg2, var21, var20, var22, super.field3957, arg0, class367.field5400[arg0] * var67, class387.field5813[arg0] * var67, arg1, arg0 - -4);
                                class157 var70 = new class157(arg6, var12, arg2, var21, var20, var22, super.field3957, arg0, 0, 0, arg1, var66 - -4);
                                if (var69.method614(-1086)) {
                                    var69.method623(126, arg6);
                                }
                                var71 = var69;
                                var72 = var70;
                                if (var70.method614(-1086)) {
                                    var70.method623(126, arg6);
                                }
                            } else {
                                class173 var73 = new class173(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg0, class367.field5400[arg0] * var67, class387.field5813[arg0] * var67, arg1, arg0 - -4, arg3);
                                var71 = var73;
                                class173 var74 = new class173(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg0, 0, 0, arg1, var66 + 4, arg3);
                                var72 = var74;
                            }
                            class10.method72(arg10, arg7, arg5, var71, var72);
                        }
                    } else {
                        class508 var75 = null;
                        int var76;
                        class389 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class223(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg7, arg7 + var13 - 1, arg5, arg5 + var14 + -1, arg1, arg0, arg3);
                        } else {
                            class508 var78 = new class508(arg6, var12, arg10, arg2, var21, var20, var22, super.field3957, arg7, arg7 - 1 + var13, arg5, arg5 + -1 + var14, arg1, arg0, var23);
                            var76 = var78.method3026((byte) 62);
                            var75 = var78;
                            var77 = var78;
                        }
                        class389 var79 = class154.method1057(arg10, arg7, arg5, field3601 != null ? field3601 : (field3601 = method1581("ig")));
                        boolean var80 = false;
                        if (var79 instanceof class132 && var79.field5836 == arg7 && var79.field5830 == arg5) {
                            ((class132) var79).field2028 = var77;
                            var80 = true;
                        }
                        if (var80 || class495.method2940(var77, false)) {
                            if (var75 != null && var75.method614(-1086)) {
                                var75.method623(126, arg6);
                            }
                            if (var12.field923 && class65.field843) {
                                if (~var76 < -31) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; var81 <= var13; ++var81) {
                                    for (int var82 = 0; var14 >= var82; ++var82) {
                                        var19.method405(arg7 + var81, arg5 + var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field926 != -1 && arg4 != null) {
                            arg4.method1165(var12.field908, !var12.field967, 1, arg5, arg7, var13, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([BI[Lpd;Lya;II)V")
    public final void method1579(byte[] arg0, int arg1, class172[] arg2, class38 arg3, int arg4, int arg5) {
        ++field3599;
        class217 var7 = new class217(arg0);
        int var8 = arg4;
        while (true) {
            int var9 = var7.method1533((byte) 86);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1510(arg4 ^ 128);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1515((byte) 123);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg1 + var13;
                int var19 = arg5 + var12;
                if (~var18 < -1 && var19 > 0 && var18 < super.field3965 + -1 && ~var19 > ~(super.field3948 + -1)) {
                    class172 var20 = null;
                    if (!super.field3957) {
                        int var21 = var14;
                        if (~(class476.field6873[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg2[var21];
                        }
                    }
                    this.method1578(var17, var16, var14, -1, var20, var19, arg3, var18, (byte) 95, var8, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3592;
        int var7 = class111.field1558;
        int[] var8 = class318.field4804;
        class257.field3932 = 0;
        for (int var9 = 0; class167.field2471 + var7 > var9; ++var9) {
            class37 var32 = null;
            class129 var33;
            if (var7 <= var9) {
                var33 = class153.field2265[class470.field6797[-var7 + var9]];
                var32 = ((class116) var33).field1763;
                if (var32.field499 != null) {
                    var32 = var32.method256(125, class195.field3271);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class26.field319[var8[var9]];
            }
            if (~var33.field1938 <= -1 && (~class448.field6562 == ~var33.field1932 || ~class398.field5947.field5826 == ~var33.field5826)) {
                class457.method2774(arg2 >> 1, var33.method883((byte) 127), var33, arg6, arg0, arg5 >> 1, (byte) -52);
                if (class229.field3733[0] >= 0) {
                    if (var33.field1898 != null && (var9 >= var7 || class320.field4817 == 0 || ~class320.field4817 == -4 || ~class320.field4817 == -2 && class208.method1445(125, ((class177) var33).field2660)) && ~class257.field3932 > ~class308.field4648) {
                        class308.field4651[class257.field3932] = class380.field5735.method2174(-33, var33.field1898) / 2;
                        class308.field4647[class257.field3932] = class229.field3733[0];
                        class308.field4646[class257.field3932] = class229.field3733[1];
                        class308.field4650[class257.field3932] = var33.field1933;
                        class308.field4642[class257.field3932] = var33.field1884;
                        class308.field4645[class257.field3932] = var33.field1894;
                        class308.field4649[class257.field3932] = var33.field1898;
                        ++class257.field3932;
                    }
                    int var34 = class229.field3733[1] + arg3;
                    int var45;
                    if (!var33.field1948 && ~var33.field1929 < ~class475.field6854) {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (~var9 > ~var7) {
                            class177 var37 = class26.field319[var8[var9]];
                            var38 = var33.method948(false).field5665;
                            if (var37.field2639) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field483;
                            if (~var38 == 0) {
                                var38 = var33.method948(false).field5665;
                            }
                        }
                        class16[] var39 = class460.field6697;
                        if (var38 != -1) {
                            class16[] var40 = (class16[]) class406.field6011.method87((long) var38, -2062335807);
                            if (var40 == null) {
                                class84[] var41 = class84.method698(class176.field2627, var38, 0);
                                if (var41 != null) {
                                    var40 = new class16[var41.length];
                                    for (int var42 = 0; ~var42 > ~var41.length; ++var42) {
                                        var40[var42] = class377.field5692.method345(var41[var42], true);
                                    }
                                    class406.field6011.method84((long) var38, var40, (byte) 27);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class16 var43 = var39[0];
                        class16 var44 = var39[var36];
                        var45 = var34 - Math.max(class380.field5735.field5150, var43.method125());
                        int var46 = arg4 + class229.field3733[0] + -(var43.method123() >> 1);
                        int var47 = var43.method123() * var33.field1960 / 255;
                        if (var33.field1960 > 0 && ~var47 > -3) {
                            var47 = 2;
                        }
                        var43.method132(var46, var45);
                        class377.field5692.method344(var46, var45, var46 + var47, var45 + var43.method125());
                        var44.method132(var46, var45);
                        class377.field5692.method313(arg4, arg3, arg4 - -arg5, arg2 + arg3);
                    } else {
                        var45 = var34 - Math.max(class380.field5735.field5150, class460.field6697[0].method125());
                    }
                    var45 -= 2;
                    if (!var33.field1948) {
                        if (~var33.field1937 < ~class475.field6854) {
                            class16 var48 = class296.field4508[!var33.field1908 ? 0 : 2];
                            class16 var49 = class296.field4508[!var33.field1908 ? 1 : 3];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class116) {
                                var51 = var32.field503;
                                if (var51 == -1) {
                                    var51 = var33.method948(false).field5640;
                                }
                            } else {
                                var51 = var33.method948(false).field5640;
                            }
                            if (~var51 != 0) {
                                class16[] var52 = (class16[]) class152.field2261.method87((long) var51, -2062335807);
                                if (var52 == null) {
                                    class84[] var53 = class84.method698(class176.field2627, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class16[var53.length];
                                        for (int var54 = 0; ~var54 > ~var53.length; ++var54) {
                                            var52[var54] = class377.field5692.method345(var53[var54], true);
                                        }
                                        class152.field2261.method84((long) var51, var52, (byte) 27);
                                    }
                                }
                                if (var52 != null && ~var52.length == -5) {
                                    var48 = var52[!var33.field1908 ? 0 : 2];
                                    var49 = var52[var33.field1908 ? 3 : 1];
                                }
                            }
                            int var55 = -class475.field6854 + var33.field1937;
                            int var56;
                            if (var55 <= var33.field1915) {
                                var56 = var48.method123();
                            } else {
                                int var57 = var55 - var33.field1915;
                                int var58 = var33.field1910 == 0 ? 0 : (-var57 + var33.field1941) / var33.field1910 * var33.field1910;
                                var56 = var48.method123() * var58 / var33.field1941;
                            }
                            int var59 = var48.method125();
                            var45 -= var59;
                            int var60 = arg4 + class229.field3733[0] + -(var48.method123() >> 1);
                            var48.method132(var60, var45);
                            class377.field5692.method344(var60, var45, var56 + var60, var45 + var59);
                            var49.method132(var60, var45);
                            var45 -= 2;
                            class377.field5692.method313(arg4, arg3, arg4 + arg5, arg2 + arg3);
                        }
                        if (~var9 <= ~var7) {
                            if (var32.field471 >= 0 && ~class132.field2030.length < ~var32.field471) {
                                class16 var61 = class132.field2030[var32.field471];
                                var45 -= 25;
                                var61.method132(arg4 - -class229.field3733[0] + -(var61.method123() >> 1), var45);
                                var45 -= 2;
                            }
                        } else {
                            class177 var62 = (class177) var33;
                            if (~var62.field2633 != 0) {
                                var45 -= 25;
                                class68.field871[var62.field2633].method132(class229.field3733[0] + arg4 + -12, var45);
                                var45 -= 2;
                            }
                            if (~var62.field2671 != 0) {
                                var45 -= 25;
                                class132.field2030[var62.field2671].method132(class229.field3733[0] + arg4 + -12, var45);
                                var45 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class177)) {
                        int var63 = 0;
                        class109[] var64 = class303.field4580;
                        for (int var65 = 0; var65 < var64.length; ++var65) {
                            class109 var67 = var64[var65];
                            if (var67 != null && ~var67.field1523 == -2 && class470.field6797[-var7 + var9] == var67.field1519) {
                                class16 var68 = class118.field1789[var67.field1518];
                                if (var68.method125() > var63) {
                                    var63 = var68.method125();
                                }
                                if (~(class475.field6854 % 20) > -11) {
                                    var68.method132(arg4 + -12 - -class229.field3733[0], var45 - var68.method125());
                                }
                            }
                        }
                        if (~var63 < -1) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class109[] var70 = class303.field4580;
                        for (int var71 = 0; ~var71 > ~var70.length; ++var71) {
                            class109 var73 = var70[var71];
                            if (var73 != null && var73.field1523 == 10 && ~var8[var9] == ~var73.field1519) {
                                class16 var74 = class118.field1789[var73.field1518];
                                if (~var74.method125() < ~var69) {
                                    var69 = var74.method125();
                                }
                                var74.method132(class229.field3733[0] + arg4 + -12, var45 + -var74.method125());
                            }
                        }
                        if (~var69 < -1) {
                            var10000 = var45 - (var69 - -2);
                        }
                    }
                    for (int var75 = 0; ~var75 > -5; ++var75) {
                        if (var33.field1889[var75] > class475.field6854) {
                            int var76 = var33.method883((byte) 117) / 2;
                            class457.method2774(arg2 >> 1, var76, var33, arg6, arg0, arg5 >> 1, (byte) -107);
                            if (~class229.field3733[0] < 0) {
                                int var77 = class530.field7740[var33.field1965[var75]].method123();
                                if (~var75 == -2) {
                                    class229.field3733[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class229.field3733[0] -= var77 + -9;
                                    class229.field3733[1] -= 10;
                                }
                                if (~var75 == -4) {
                                    class229.field3733[1] -= 10;
                                    class229.field3733[0] += var77 + -9;
                                }
                                class530.field7740[var33.field1965[var75]].method132(-(var77 >> 1) + arg4 - -class229.field3733[0], class229.field3733[1] + arg3 - 12);
                                class45.field585.method2030(class229.field3733[1] + arg3 + 3, Integer.toString(var33.field1917[var75]), 0, 0, -1, arg4 - 1 + class229.field3733[0]);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; ~class123.field1842 < ~var10; ++var10) {
            int var28 = class517.field7526[var10];
            class129 var29;
            if (var28 >= 2048) {
                var29 = class153.field2265[var28 - 2048];
            } else {
                var29 = class26.field319[var28];
            }
            int var30 = class412.field6178[var10];
            class129 var31;
            if (~var30 > -2049) {
                var31 = class26.field319[var30];
            } else {
                var31 = class153.field2265[var30 + -2048];
            }
            class323.method2057((byte) 37, arg4, --var29.field1905, var31, arg3, arg0, var29, arg6, arg5, arg2);
        }
        if (arg1 >= -77) {
            field3588 = -124;
        }
        int var11 = class380.field5735.field5150 + 2 - -class380.field5735.field5137;
        for (int var12 = 0; class257.field3932 > var12; ++var12) {
            int var13 = class308.field4647[var12];
            int var14 = class308.field4646[var12];
            int var15 = class308.field4651[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; ~var27 > ~var12; ++var27) {
                    if (~(var14 + 2) < ~(class308.field4646[var27] + -var11) && class308.field4646[var27] + 2 > var14 - var11 && class308.field4651[var27] + class308.field4647[var27] > -var15 + var13 && var13 + var15 > class308.field4647[var27] + -class308.field4651[var27] && var14 > class308.field4646[var27] + -var11) {
                        var14 = class308.field4646[var27] + -var11;
                        var16 = true;
                    }
                }
            }
            class308.field4646[var12] = var14;
            String var17 = class308.field4649[var12];
            if (~class374.field5590 != -1) {
                class185.field2805.method2030(arg3 - -var14, var17, -16777216, 0, -256, arg4 + var13);
            } else {
                int var18 = 16776960;
                if (~class308.field4650[var12] > -7) {
                    var18 = class132.field2031[class308.field4650[var12]];
                }
                if (class308.field4650[var12] == 6) {
                    var18 = class448.field6562 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class308.field4650[var12] == 7) {
                    var18 = class448.field6562 % 20 >= 10 ? 65535 : 255;
                }
                if (~class308.field4650[var12] == -9) {
                    var18 = ~(class448.field6562 % 20) <= -11 ? 8454016 : 45056;
                }
                if (~class308.field4650[var12] == -10) {
                    int var19 = -class308.field4645[var12] + 150;
                    if (~var19 > -51) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 >= 100) {
                        if (~var19 > -151) {
                            var18 = var19 * 5 + 64780;
                        }
                    } else {
                        var18 = -(var19 * 327680) - -16384000 + 16776960;
                    }
                }
                if (~class308.field4650[var12] == -11) {
                    int var20 = -class308.field4645[var12] + 150;
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = -(var20 * 327680) + 33095935;
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 255 - var20 * 5 + 500 + -32768000;
                    }
                }
                if (class308.field4650[var12] == 11) {
                    int var21 = -class308.field4645[var12] + 150;
                    if (~var21 <= -51) {
                        if (~var21 > -101) {
                            var18 = var21 * 327685 + -16384250 + 65280;
                        } else if (~var21 > -151) {
                            var18 = -((var21 + -100) * 327680) + 16777215;
                        }
                    } else {
                        var18 = -(var21 * 327685) + 16777215;
                    }
                }
                int var22 = var18 | -16777216;
                if (~class308.field4642[var12] == -1) {
                    class185.field2805.method2030(arg3 + var14, var17, -16777216, 0, var22, arg4 - -var13);
                }
                if (~class308.field4642[var12] == -2) {
                    class185.field2805.method2031(class448.field6562, arg4 + var13, -16777216, arg3 + var14, (byte) -94, var17, var22);
                }
                if (~class308.field4642[var12] == -3) {
                    class185.field2805.method2034(arg3 - -var14, var22, -1, arg4 + var13, var17, -16777216, class448.field6562);
                }
                if (~class308.field4642[var12] == -4) {
                    class185.field2805.method2041(var22, -class308.field4645[var12] + 150, true, arg3 + var14, class448.field6562, arg4 + var13, -16777216, var17);
                }
                if (~class308.field4642[var12] == -5) {
                    int var23 = (150 - class308.field4645[var12]) * (class380.field5735.method2174(-33, var17) - -100) / 150;
                    class377.field5692.method344(arg4 - 50 + var13, arg3, var13 + 50 + arg4, arg2 + arg3);
                    class185.field2805.method2038(arg4 + var13 - (-50 - -var23), false, -16777216, var22, arg3 + var14, var17);
                    class377.field5692.method313(arg4, arg3, arg4 + arg5, arg2 + arg3);
                }
                if (class308.field4642[var12] == 5) {
                    int var24 = -class308.field4645[var12] + 150;
                    int var25 = 0;
                    if (~var24 > -26) {
                        var25 = var24 + -25;
                    } else if (var24 > 125) {
                        var25 = var24 + -125;
                    }
                    int var26 = class380.field5735.field5150 - -class380.field5735.field5137;
                    class377.field5692.method344(arg4, -var26 + arg3 + -1 + var14, arg4 + arg5, arg3 - -var14 + 5);
                    class185.field2805.method2030(arg3 + var14 + var25, var17, -16777216, 0, var22, arg4 + var13);
                    class377.field5692.method313(arg4, arg3, arg4 + arg5, arg2 + arg3);
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1581(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class234("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field3594 = new int[32];
    }
}
