import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class381 extends class221 {

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public int field4960 = 99;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Ljr;")
    public static class357 field4963;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "Lvq;")
    public static class349 field4967;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field4968;

    static {
        new class169((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field4965 = -1;
        field4963 = new class357(8);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLqa;)V", line = 3)
    public final void method2214(byte arg0, class129 arg1) {
        ++field4957;
        class251.method1568(arg1);
        if (~super.field2838 < -2) {
            for (int var3 = 0; ~super.field2829 < ~var3; ++var3) {
                for (int var4 = 0; super.field2819 > var4; ++var4) {
                    if (~(2 & class8.field76[1][var3][var4]) == -3) {
                        class357.method2090(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < super.field2838; ++var5) {
            for (int var6 = 0; var6 <= super.field2819; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field2829; ++var7) {
                    if (~(super.field2842[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (~super.field2819 < ~var9 && (1 & super.field2842[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        while (var8 > 0 && (1 & super.field2842[var5][var7][var8 + -1]) != 0) {
                            --var8;
                        }
                        label170: while (~var10 < -1) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if ((super.field2842[var10 + -1][var7][var12] & 1) == 0) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (~var11 > -4) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if ((super.field2842[var11 + 1][var7][var13] & 1) == 0) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var11 - -1 + -var10) * (-var8 + var9 + 1);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field2824[var11][var7][var8] - var15;
                            int var17 = super.field2824[var10][var7][var8];
                            class192.method1250(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; var19 <= var9; ++var19) {
                                    super.field2842[var18][var7][var19] = (byte) class60.method339(super.field2842[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field2842[var5][var7][var6] & 2) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && ~(2 & super.field2842[var5][var20 + -1][var6]) != -1) {
                            --var20;
                        }
                        while (var21 < super.field2829 && (super.field2842[var5][var21 + 1][var6] & 2) != 0) {
                            ++var21;
                        }
                        int var23 = var5;
                        label223: while (var22 > 0) {
                            for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                if ((super.field2842[var22 + -1][var24][var6] & 2) == 0) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (var23 < 3) {
                            for (int var25 = var20; ~var21 <= ~var25; ++var25) {
                                if (~(2 & super.field2842[var23 + 1][var25][var6]) == -1) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 - -1 + -var20) * (var23 - var22 + 1);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field2824[var23][var20][var6] - var27;
                            int var29 = super.field2824[var22][var20][var6];
                            class192.method1250(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field2842[var30][var31][var6] = (byte) class60.method339(super.field2842[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(super.field2842[var5][var7][var6] & 4) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && ~(4 & super.field2842[var5][var7][var34 + -1]) != -1) {
                            --var34;
                        }
                        while (var35 < super.field2819 && (4 & super.field2842[var5][var7][var35 + 1]) != 0) {
                            ++var35;
                        }
                        label277: while (~var32 < -1) {
                            for (int var36 = var34; ~var36 >= ~var35; ++var36) {
                                if (~(4 & super.field2842[var5][var32 + -1][var36]) == -1) {
                                    break label277;
                                }
                            }
                            --var32;
                        }
                        label266: while (super.field2829 > var33) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if ((4 & super.field2842[var5][var33 + 1][var37]) == 0) {
                                    break label266;
                                }
                            }
                            ++var33;
                        }
                        if (~((var33 - -1 + -var32) * (var35 - var34 + 1)) <= -5) {
                            int var38 = super.field2824[var5][var32][var34];
                            class192.method1250(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; ++var39) {
                                for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                    super.field2842[var5][var39][var40] = (byte) class60.method339(super.field2842[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= -30) {
            super.field2842 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([IILbt;ILqa;I)V", line = 293)
    public final void method2215(int[] arg0, int arg1, class88 arg2, int arg3, class129 arg4, int arg5) {
        ++field4958;
        if (!super.field2825) {
            boolean var7 = false;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            class17 var8 = null;
            if (arg1 == 27056) {
                while (true) {
                    while (~arg2.field1223.length < ~arg2.field1176) {
                        int var18 = arg2.method617(2);
                        if (var18 == 0) {
                            var8 = new class17(arg2);
                        } else if (~var18 == -2) {
                            int var34 = arg2.method617(2);
                            if (var34 > 0) {
                                for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                    class86 var36 = new class86(arg4, arg2, 0);
                                    if (var36.field1154 == 31) {
                                        class245 var37 = class96.field1342.method1609(-7539, arg2.method568((byte) 110));
                                        var36.method547(var37.field3139, (byte) -40, var37.field3140, var37.field3146, var37.field3143);
                                    }
                                    if (~arg4.method843() < -1) {
                                        class182 var38 = var36.field1155;
                                        int var39 = (arg3 << 7) + var38.method1203((byte) -76);
                                        int var40 = (arg5 << 7) + var38.method1202((byte) -81);
                                        int var41 = var39 >> 7;
                                        int var42 = var40 >> 7;
                                        if (~var41 <= -1 && var42 >= 0 && ~var41 > ~super.field2829 && super.field2819 > var42) {
                                            var38.method1205(var39, var40, super.field2824[var36.field1158][var41][var42] - var38.method1199((byte) 3), arg1 + 2147456591);
                                            if (~arg4.method843() < -1) {
                                                class337.method1990(var36);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var18 == 2) {
                            if (var8 == null) {
                                var8 = new class17();
                            }
                            var8.method109((byte) 109, arg2);
                        } else if (var18 == 128) {
                            if (arg0 != null) {
                                arg0[0] = arg2.method568((byte) 110);
                                arg0[1] = arg2.method603((byte) -94);
                                arg0[2] = arg2.method603((byte) -69);
                                arg0[3] = arg2.method603((byte) 114);
                                arg0[4] = arg2.method568((byte) 110);
                            } else {
                                arg2.field1176 += 10;
                            }
                        } else {
                            if (~var18 != -130) {
                                throw new IllegalStateException("");
                            }
                            if (super.field2835 == null) {
                                super.field2835 = new byte[4][][];
                            }
                            for (int var19 = 0; var19 < 4; ++var19) {
                                byte var20 = arg2.method575(-40);
                                if (~var20 == -1 && super.field2835[var19] != null) {
                                    int var21 = arg3;
                                    int var22 = arg3 + 64;
                                    int var23 = arg5;
                                    int var24 = arg5 + 64;
                                    if (arg3 < 0) {
                                        var21 = 0;
                                    } else if (super.field2829 <= arg3) {
                                        var21 = super.field2829;
                                    }
                                    if (var22 < 0) {
                                        var22 = 0;
                                    } else if (var22 >= super.field2829) {
                                        var22 = super.field2829;
                                    }
                                    if (arg5 < 0) {
                                        var23 = 0;
                                    } else if (~super.field2819 >= ~arg5) {
                                        var23 = super.field2819;
                                    }
                                    if (var24 >= 0) {
                                        if (~var24 <= ~super.field2819) {
                                            var24 = super.field2819;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    while (var21 < var22) {
                                        while (var23 < var24) {
                                            super.field2835[var19][var21][var23] = 0;
                                            ++var23;
                                        }
                                        ++var21;
                                    }
                                } else if (var20 == 1) {
                                    if (super.field2835[var19] == null) {
                                        super.field2835[var19] = new byte[super.field2829 + 1][super.field2819 + 1];
                                    }
                                    for (int var25 = 0; var25 < 64; var25 += 4) {
                                        for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                            byte var27 = arg2.method575(-36);
                                            for (int var28 = arg3 + var25; ~(arg3 + var25 + 4) < ~var28; ++var28) {
                                                for (int var29 = var26 - -arg5; ~(arg5 + var26 + 4) < ~var29; ++var29) {
                                                    if (~var28 <= -1 && ~var28 > ~super.field2829 && ~var29 <= -1 && super.field2819 > var29) {
                                                        super.field2835[var19][var28][var29] = var27;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (~var20 == -3) {
                                    if (super.field2835[var19] == null) {
                                        super.field2835[var19] = new byte[super.field2829 - -1][super.field2819 + 1];
                                    }
                                    if (~var19 < -1) {
                                        int var30 = arg3;
                                        int var31 = arg3 + 64;
                                        int var32 = arg5;
                                        if (~arg5 > -1) {
                                            var32 = 0;
                                        } else if (~super.field2819 >= ~arg5) {
                                            var32 = super.field2819;
                                        }
                                        if (~var31 > -1) {
                                            var31 = 0;
                                        } else if (super.field2829 <= var31) {
                                            var31 = super.field2829;
                                        }
                                        if (~arg3 > -1) {
                                            var30 = 0;
                                        } else if (~arg3 <= ~super.field2829) {
                                            var30 = super.field2829;
                                        }
                                        int var33 = arg5 + 64;
                                        if (~var33 > -1) {
                                            var33 = 0;
                                        } else if (var33 >= super.field2819) {
                                            var33 = super.field2819;
                                        }
                                        while (var30 < var31) {
                                            while (var33 > var32) {
                                                super.field2835[var19][var30][var32] = super.field2835[var19 + -1][var30][var32];
                                                ++var32;
                                            }
                                            ++var30;
                                        }
                                    }
                                }
                            }
                            var7 = true;
                        }
                    }
                    if (var8 != null) {
                        for (int var9 = 0; var9 < 8; ++var9) {
                            for (int var10 = 0; var10 < 8; ++var10) {
                                int var11 = (arg3 >> 3) + var9;
                                int var12 = (arg5 >> 3) - -var10;
                                if (~var11 <= -1 && var11 < super.field2829 >> 3 && ~var12 <= -1 && ~var12 > ~(super.field2819 >> 3)) {
                                    class465.method2805(2092, var12, var8, var11);
                                }
                            }
                        }
                    }
                    if (!var7 && super.field2835 != null) {
                        for (int var13 = 0; var13 < 4; ++var13) {
                            if (super.field2835[var13] != null) {
                                for (int var14 = 0; ~var14 > -17; ++var14) {
                                    for (int var15 = 0; var15 < 16; ++var15) {
                                        int var16 = (arg3 >> 2) + var14;
                                        int var17 = (arg5 >> 2) + var15;
                                        if (var16 >= 0 && ~var16 > -27 && var17 >= 0 && ~var17 > -27) {
                                            super.field2835[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILqa;[BB[Lbm;)V", line = 661)
    public final void method2216(int arg0, int arg1, class129 arg2, byte[] arg3, byte arg4, class215[] arg5) {
        ++field4964;
        class88 var7 = new class88(arg3);
        if (arg4 >= -123) {
            this.method2214((byte) 57, (class129) null);
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method601((byte) -94);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method604(-9338);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = (4051 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method617(2);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg1 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < super.field2829 + -1 && var19 < super.field2819 - 1) {
                    class215 var20 = null;
                    if (!super.field2825) {
                        int var21 = var14;
                        if ((class8.field76[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg5[var21];
                        }
                    }
                    this.method2217(var14, var14, var16, var8, arg2, var19, var17, -1, var20, (byte) 11, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILqa;IIILbm;BI)V", line = 735)
    public final void method2217(int arg0, int arg1, int arg2, int arg3, class129 arg4, int arg5, int arg6, int arg7, class215 arg8, byte arg9, int arg10) {
        ++field4962;
        if (class421.field5647.method648(arg9 ^ -51, class520.field7690) || class303.method1818(arg5, class473.field6914, -19236, arg10, arg1)) {
            if (arg0 < this.field4960) {
                this.field4960 = arg0;
            }
            class402 var12 = class52.field715.method1164(arg3, 0);
            if (!arg4.method915() || !class421.field5647.field7697 || !var12.field5363) {
                if (arg9 != 11) {
                    this.method2220((class129) null, 10, 11, -128, -18, (class215) null, 88);
                }
                int var13;
                int var14;
                if (arg6 != 1 && ~arg6 != -4) {
                    var13 = var12.field5340;
                    var14 = var12.field5396;
                } else {
                    var13 = var12.field5396;
                    var14 = var12.field5340;
                }
                int var15;
                int var16;
                if (~(arg10 - -var13) >= ~super.field2829) {
                    var15 = (var13 >> 1) + arg10;
                    var16 = (var13 + 1 >> 1) + arg10;
                } else {
                    var15 = arg10;
                    var16 = arg10 + 1;
                }
                int var17;
                int var18;
                if (super.field2819 < arg5 + var14) {
                    var17 = arg5;
                    var18 = arg5 - -1;
                } else {
                    var18 = (var14 + 1 >> 1) + arg5;
                    var17 = (var14 >> 1) + arg5;
                }
                class251 var19 = class92.field1285[arg1];
                int var20 = var19.method1187(var15, var17) + var19.method1187(var16, var17) + var19.method1187(var15, var18) + var19.method1187(var16, var18) >> 2;
                int var21 = (arg10 << 7) - -(var13 << 6);
                int var22 = (arg5 << 7) + (var14 << 6);
                boolean var23 = class63.field807 && !super.field2825 && var12.field5349;
                if (var12.method2385((byte) 123)) {
                    class25.method167(var12, (class295) null, (class518) null, arg10, arg6, arg9 ^ 244, arg0, arg5);
                }
                boolean var24 = ~arg7 == 0 && ~var12.field5390 == 0 && var12.field5418 == null && var12.field5419 == null && !var12.field5385;
                if (!class345.field4391 || (!class445.method2639(arg2, -93) || var12.field5365 == 1) && (!class276.method1700(false, arg2) || ~var12.field5365 != -1)) {
                    if (arg2 == 22) {
                        if (class421.field5647.field7694 || ~var12.field5347 != -1 || ~var12.field5400 == -2 || var12.field5412) {
                            class338 var25;
                            if (!var24) {
                                var25 = new class347(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg6, arg7);
                            } else {
                                class488 var26 = new class488(arg4, var12, arg1, var21, var20, var22, super.field2825, arg6, var23);
                                if (var26.method417(false)) {
                                    var26.method416(arg4, 16663);
                                }
                                var25 = var26;
                            }
                            class338 var27 = class205.method1342(arg0, arg10, arg5);
                            if (!(var27 instanceof class368)) {
                                class405.method2409(arg0, arg10, arg5, var25);
                            } else {
                                ((class368) var27).field4729 = var25;
                            }
                            if (~var12.field5400 == -2 && arg8 != null) {
                                arg8.method1377(arg5, arg10, -120);
                            }
                        }
                    } else if (arg2 != 10 && arg2 != 11) {
                        if (~arg2 <= -13 && ~arg2 >= -18 || arg2 >= 18 && ~arg2 >= -22) {
                            class448 var29;
                            if (var24) {
                                class107 var28 = new class107(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg10, arg10 + var13 - 1, arg5, var14 + -1 + arg5, arg2, arg6, var23);
                                if (var28.method417(false)) {
                                    var28.method416(arg4, 16663);
                                }
                                var29 = var28;
                            } else {
                                var29 = new class279(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg10, arg10 + var13 + -1, arg5, arg5 - -var14 + -1, arg2, arg6, arg7);
                            }
                            class448 var30 = class346.method2038(arg0, arg10, arg5, field4968 != null ? field4968 : (field4968 = class221.method1417("wk")));
                            if (var30 instanceof class188 && var30.field6238 == arg10 && ~var30.field6228 == ~arg5) {
                                ((class188) var30).field2460 = var29;
                            } else {
                                class363.method2134(var29, false);
                            }
                            if (class63.field807 && !super.field2825 && ~arg2 <= -13 && arg2 <= 17 && arg2 != 13 && ~arg0 < -1 && var12.field5365 != 0) {
                                super.field2842[arg0][arg10][arg5] = (byte) class31.method213(super.field2842[arg0][arg10][arg5], 4);
                            }
                            if (var12.field5400 != 0 && arg8 != null) {
                                arg8.method1378(arg5, !var12.field5384, arg10, var12.field5376, arg9 + -848, var13, var14);
                            }
                        } else if (~arg2 == -1) {
                            int var31 = var12.field5365;
                            if (class456.field6367 && ~var12.field5365 == 0) {
                                var31 = 1;
                            }
                            class270 var33;
                            if (var24) {
                                class218 var32 = new class218(arg4, var12, arg1, var21, var20, var22, super.field2825, arg2, arg6, var23);
                                if (var32.method417(false)) {
                                    var32.method416(arg4, arg9 + 16652);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class73(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg2, arg6, arg7);
                            }
                            class270 var34 = class67.method384(arg0, arg10, arg5);
                            if (var34 instanceof class516) {
                                ((class516) var34).field7584 = var33;
                            } else {
                                class185.method1228(arg0, arg10, arg5, var33, (class270) null);
                            }
                            if (class63.field807) {
                                if (arg6 != 0) {
                                    if (~arg6 == -2) {
                                        if (var12.field5332) {
                                            var19.method1182(arg10, arg5 - -1, 50);
                                            var19.method1182(arg10 + 1, arg5 - -1, 50);
                                        }
                                        if (~var31 == -2 && !super.field2825) {
                                            super.field2842[arg0][arg10][arg5 - -1] = (byte) class31.method213(super.field2842[arg0][arg10][arg5 - -1], 2);
                                        }
                                    } else if (arg6 == 2) {
                                        if (var12.field5332) {
                                            var19.method1182(arg10 - -1, arg5, 50);
                                            var19.method1182(arg10 - -1, arg5 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field2825) {
                                            super.field2842[arg0][arg10 + 1][arg5] = (byte) class31.method213(super.field2842[arg0][arg10 + 1][arg5], 1);
                                        }
                                    } else if (~arg6 == -4) {
                                        if (var12.field5332) {
                                            var19.method1182(arg10, arg5, 50);
                                            var19.method1182(arg10 + 1, arg5, 50);
                                        }
                                        if (~var31 == -2 && !super.field2825) {
                                            super.field2842[arg0][arg10][arg5] = (byte) class31.method213(super.field2842[arg0][arg10][arg5], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field5332) {
                                        var19.method1182(arg10, arg5, 50);
                                        var19.method1182(arg10, arg5 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field2825) {
                                        super.field2842[arg0][arg10][arg5] = (byte) class31.method213(super.field2842[arg0][arg10][arg5], 1);
                                    }
                                }
                            }
                            if (var12.field5400 != 0 && arg8 != null) {
                                arg8.method1383(!var12.field5384, (byte) -127, arg10, arg6, var12.field5376, arg5, arg2);
                            }
                            if (var12.field5403 != 16) {
                                class481.method2879(arg0, arg10, arg5, var12.field5403);
                            }
                        } else if (~arg2 == -2) {
                            class270 var35;
                            if (!var24) {
                                var35 = new class73(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg2, arg6, arg7);
                            } else {
                                class218 var36 = new class218(arg4, var12, arg1, var21, var20, var22, super.field2825, arg2, arg6, var23);
                                if (var36.method417(false)) {
                                    var36.method416(arg4, 16663);
                                }
                                var35 = var36;
                            }
                            class270 var37 = class67.method384(arg0, arg10, arg5);
                            if (!(var37 instanceof class516)) {
                                class185.method1228(arg0, arg10, arg5, var35, (class270) null);
                            } else {
                                ((class516) var37).field7584 = var35;
                            }
                            if (var12.field5332 && class63.field807) {
                                if (arg6 == 0) {
                                    var19.method1182(arg10, arg5 + 1, 50);
                                } else if (~arg6 == -2) {
                                    var19.method1182(arg10 + 1, arg5 + 1, 50);
                                } else if (~arg6 != -3) {
                                    if (~arg6 == -4) {
                                        var19.method1182(arg10, arg5, 50);
                                    }
                                } else {
                                    var19.method1182(arg10 - -1, arg5, 50);
                                }
                            }
                            if (~var12.field5400 != -1 && arg8 != null) {
                                arg8.method1383(!var12.field5384, (byte) -112, arg10, arg6, var12.field5376, arg5, arg2);
                            }
                        } else if (~arg2 == -3) {
                            int var38 = arg6 - -1 & 3;
                            class270 var41;
                            class270 var42;
                            if (var24) {
                                class218 var39 = new class218(arg4, var12, arg1, var21, var20, var22, super.field2825, arg2, arg6 + 4, var23);
                                class218 var40 = new class218(arg4, var12, arg1, var21, var20, var22, super.field2825, arg2, var38, var23);
                                if (var39.method417(false)) {
                                    var39.method416(arg4, 16663);
                                }
                                var41 = var39;
                                var42 = var40;
                                if (var40.method417(false)) {
                                    var40.method416(arg4, 16663);
                                }
                            } else {
                                var41 = new class73(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg2, arg6 + 4, arg7);
                                var42 = new class73(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg2, var38, arg7);
                            }
                            class185.method1228(arg0, arg10, arg5, var41, var42);
                            if (var12.field5365 == 1 && class63.field807 && !super.field2825) {
                                if (~arg6 != -1) {
                                    if (~arg6 != -2) {
                                        if (arg6 == 2) {
                                            super.field2842[arg0][arg10 + 1][arg5] = (byte) class31.method213(super.field2842[arg0][arg10 + 1][arg5], 1);
                                            super.field2842[arg0][arg10][arg5] = (byte) class31.method213(super.field2842[arg0][arg10][arg5], 2);
                                        } else if (arg6 == 3) {
                                            super.field2842[arg0][arg10][arg5] = (byte) class31.method213(super.field2842[arg0][arg10][arg5], 2);
                                            super.field2842[arg0][arg10][arg5] = (byte) class31.method213(super.field2842[arg0][arg10][arg5], 1);
                                        }
                                    } else {
                                        super.field2842[arg0][arg10][arg5 + 1] = (byte) class31.method213(super.field2842[arg0][arg10][arg5 + 1], 2);
                                        super.field2842[arg0][arg10 + 1][arg5] = (byte) class31.method213(super.field2842[arg0][arg10 + 1][arg5], 1);
                                    }
                                } else {
                                    super.field2842[arg0][arg10][arg5] = (byte) class31.method213(super.field2842[arg0][arg10][arg5], 1);
                                    super.field2842[arg0][arg10][arg5 + 1] = (byte) class31.method213(super.field2842[arg0][arg10][arg5 + 1], 2);
                                }
                            }
                            if (var12.field5400 != 0 && arg8 != null) {
                                arg8.method1383(!var12.field5384, (byte) -123, arg10, arg6, var12.field5376, arg5, arg2);
                            }
                            if (~var12.field5403 != -17) {
                                class481.method2879(arg0, arg10, arg5, var12.field5403);
                            }
                        } else if (arg2 == 3) {
                            class270 var43;
                            if (!var24) {
                                var43 = new class73(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg2, arg6, arg7);
                            } else {
                                class218 var44 = new class218(arg4, var12, arg1, var21, var20, var22, super.field2825, arg2, arg6, var23);
                                if (var44.method417(false)) {
                                    var44.method416(arg4, 16663);
                                }
                                var43 = var44;
                            }
                            class270 var45 = class67.method384(arg0, arg10, arg5);
                            if (var45 instanceof class516) {
                                ((class516) var45).field7584 = var43;
                            } else {
                                class185.method1228(arg0, arg10, arg5, var43, (class270) null);
                            }
                            if (var12.field5332 && class63.field807) {
                                if (arg6 != 0) {
                                    if (arg6 == 1) {
                                        var19.method1182(arg10 + 1, arg5 + 1, 50);
                                    } else if (arg6 == 2) {
                                        var19.method1182(arg10 - -1, arg5, 50);
                                    } else if (~arg6 == -4) {
                                        var19.method1182(arg10, arg5, 50);
                                    }
                                } else {
                                    var19.method1182(arg10, arg5 + 1, 50);
                                }
                            }
                            if (~var12.field5400 != -1 && arg8 != null) {
                                arg8.method1383(!var12.field5384, (byte) -120, arg10, arg6, var12.field5376, arg5, arg2);
                            }
                        } else if (arg2 == 9) {
                            class448 var46;
                            if (!var24) {
                                var46 = new class279(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg10, arg10 + var13 + -1, arg5, arg5 - -var14 + -1, arg2, arg6, arg7);
                            } else {
                                class107 var47 = new class107(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg10, arg10, arg5, arg5, arg2, arg6, var23);
                                var46 = var47;
                                if (var47.method417(false)) {
                                    var47.method416(arg4, 16663);
                                }
                            }
                            class448 var48 = class346.method2038(arg0, arg10, arg5, field4968 != null ? field4968 : (field4968 = class221.method1417("wk")));
                            if (var48 instanceof class188 && ~var48.field6238 == ~arg10 && var48.field6228 == arg5) {
                                ((class188) var48).field2460 = var46;
                            } else {
                                class363.method2134(var46, false);
                            }
                            if (var12.field5400 != 0 && arg8 != null) {
                                arg8.method1378(arg5, !var12.field5384, arg10, var12.field5376, -837, var13, var14);
                            }
                            if (var12.field5403 != 16) {
                                class481.method2879(arg0, arg10, arg5, var12.field5403);
                            }
                        } else if (~arg2 == -5) {
                            class303 var49;
                            if (!var24) {
                                var49 = new class172(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, 0, 0, 0, arg2, arg6, arg7);
                            } else {
                                class259 var50 = new class259(arg4, var12, arg1, var21, var20, var22, super.field2825, 0, 0, 0, arg2, arg6);
                                if (var50.method417(false)) {
                                    var50.method416(arg4, 16663);
                                }
                                var49 = var50;
                            }
                            class303 var51 = class301.method1806(arg0, arg10, arg5);
                            if (!(var51 instanceof class461)) {
                                class163.method1081(arg0, arg10, arg5, var49, (class303) null);
                            } else {
                                ((class461) var51).field6443 = var49;
                            }
                        } else if (~arg2 == -6) {
                            int var52 = 17;
                            class323 var53 = (class323) class67.method384(arg0, arg10, arg5);
                            if (var53 != null) {
                                var52 = class52.field715.method1164(var53.method413(-30502), 0).field5403 + 1;
                            }
                            class303 var54;
                            if (!var24) {
                                var54 = new class172(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, 0, class92.field1280[arg6] * var52, class213.field2728[arg6] * var52, arg2, arg6, arg7);
                            } else {
                                class259 var55 = new class259(arg4, var12, arg1, var21, var20, var22, super.field2825, 0, class92.field1280[arg6] * var52, class213.field2728[arg6] * var52, arg2, arg6);
                                var54 = var55;
                                if (var55.method417(false)) {
                                    var55.method416(arg4, 16663);
                                }
                            }
                            class303 var56 = class301.method1806(arg0, arg10, arg5);
                            if (!(var56 instanceof class461)) {
                                class163.method1081(arg0, arg10, arg5, var54, (class303) null);
                            } else {
                                ((class461) var56).field6443 = var54;
                            }
                        } else if (arg2 == 6) {
                            int var57 = 9;
                            class323 var58 = (class323) class67.method384(arg0, arg10, arg5);
                            if (var58 != null) {
                                var57 = 1 + class52.field715.method1164(var58.method413(-30502), arg9 + -11).field5403 / 2;
                            }
                            class303 var59;
                            if (!var24) {
                                var59 = new class172(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg6, class360.field4654[arg6] * var57, class363.field4682[arg6] * var57, arg2, arg6 + 4, arg7);
                            } else {
                                class259 var60 = new class259(arg4, var12, arg1, var21, var20, var22, super.field2825, arg6, class92.field1280[arg6] * var57, class213.field2728[arg6] * var57, arg2, arg6 + 4);
                                var59 = var60;
                                if (var60.method417(false)) {
                                    var60.method416(arg4, arg9 ^ 16668);
                                }
                            }
                            class303 var61 = class301.method1806(arg0, arg10, arg5);
                            if (!(var61 instanceof class461)) {
                                class163.method1081(arg0, arg10, arg5, var59, (class303) null);
                            } else {
                                ((class461) var61).field6443 = var59;
                            }
                        } else if (~arg2 == -8) {
                            int var62 = arg6 + 2 & 3;
                            class303 var63;
                            if (!var24) {
                                var63 = new class172(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, var62, 0, 0, arg2, var62 - -4, arg7);
                            } else {
                                class259 var64 = new class259(arg4, var12, arg1, var21, var20, var22, super.field2825, var62, 0, 0, arg2, var62 + 4);
                                var63 = var64;
                                if (var64.method417(false)) {
                                    var64.method416(arg4, 16663);
                                }
                            }
                            class303 var65 = class301.method1806(arg0, arg10, arg5);
                            if (!(var65 instanceof class461)) {
                                class163.method1081(arg0, arg10, arg5, var63, (class303) null);
                            } else {
                                ((class461) var65).field6443 = var63;
                            }
                        } else if (~arg2 == -9) {
                            int var66 = arg6 + 2 & 3;
                            int var67 = 9;
                            class323 var68 = (class323) class67.method384(arg0, arg10, arg5);
                            if (var68 != null) {
                                var67 = 1 + class52.field715.method1164(var68.method413(arg9 ^ -30511), arg9 ^ 11).field5403 / 2;
                            }
                            class303 var71;
                            class303 var72;
                            if (!var24) {
                                class172 var69 = new class172(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg6, class360.field4654[arg6] * var67, class363.field4682[arg6] * var67, arg2, arg6 + 4, arg7);
                                class172 var70 = new class172(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg6, 0, 0, arg2, var66 + 4, arg7);
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class259 var73 = new class259(arg4, var12, arg1, var21, var20, var22, super.field2825, arg6, class360.field4654[arg6] * var67, class363.field4682[arg6] * var67, arg2, arg6 + 4);
                                class259 var74 = new class259(arg4, var12, arg1, var21, var20, var22, super.field2825, arg6, 0, 0, arg2, var66 + 4);
                                if (var73.method417(false)) {
                                    var73.method416(arg4, 16663);
                                }
                                var71 = var73;
                                var72 = var74;
                                if (var74.method417(false)) {
                                    var74.method416(arg4, 16663);
                                }
                            }
                            class163.method1081(arg0, arg10, arg5, var71, var72);
                        }
                    } else {
                        class107 var75 = null;
                        class448 var76;
                        int var77;
                        if (!var24) {
                            var76 = new class279(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg10, arg10 + var13 - 1, arg5, arg5 + var14 + -1, arg2, arg6, arg7);
                            var77 = 15;
                        } else {
                            class107 var78 = new class107(arg4, var12, arg0, arg1, var21, var20, var22, super.field2825, arg10, arg10 + var13 + -1, arg5, arg5 - -var14 + -1, arg2, arg6, var23);
                            var76 = var78;
                            var77 = var78.method705((byte) 125);
                            var75 = var78;
                        }
                        class448 var79 = class346.method2038(arg0, arg10, arg5, field4968 != null ? field4968 : (field4968 = class221.method1417("wk")));
                        boolean var80 = false;
                        if (var79 instanceof class188 && ~var79.field6238 == ~arg10 && var79.field6228 == arg5) {
                            var80 = true;
                            ((class188) var79).field2460 = var76;
                        }
                        if (var80 || class363.method2134(var76, false)) {
                            if (var75 != null && var75.method417(false)) {
                                var75.method416(arg4, 16663);
                            }
                            if (var12.field5332 && class63.field807) {
                                if (var77 > 30) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; ~var13 <= ~var81; ++var81) {
                                    for (int var82 = 0; ~var14 <= ~var82; ++var82) {
                                        var19.method1182(arg10 + var81, arg5 - -var82, var77);
                                    }
                                }
                            }
                        }
                        if (var12.field5400 != 0 && arg8 != null) {
                            arg8.method1378(arg5, !var12.field5384, arg10, var12.field5376, -837, var13, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILbt;Lqa;IIIIIII[I)V", line = 1455)
    public final void method2218(int arg0, class88 arg1, class129 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        ++field4956;
        if (!super.field2825) {
            boolean var12 = false;
            if (arg10 != null) {
                arg10[0] = -1;
            }
            class17 var13 = null;
            int var14 = (arg7 & 7) * 8;
            int var15 = (7 & arg9) * 8;
            if (arg0 != -9377) {
                field4963 = null;
            }
            while (true) {
                while (~arg1.field1223.length < ~arg1.field1176) {
                    int var20 = arg1.method617(2);
                    if (var20 == 0) {
                        var13 = new class17(arg1);
                    } else if (~var20 == -2) {
                        int var21 = arg1.method617(arg0 + 9379);
                        if (~var21 < -1) {
                            for (int var22 = 0; ~var21 < ~var22; ++var22) {
                                class86 var23 = new class86(arg2, arg1, 0);
                                if (var23.field1154 == 31) {
                                    class245 var24 = class96.field1342.method1609(arg0 ^ 14802, arg1.method568((byte) 110));
                                    var23.method547(var24.field3139, (byte) -40, var24.field3140, var24.field3146, var24.field3143);
                                }
                                if (~arg2.method843() < -1) {
                                    class182 var25 = var23.field1155;
                                    int var26 = var25.method1203((byte) -76) >> 7;
                                    int var27 = var25.method1202((byte) -47) >> 7;
                                    if (~var23.field1158 == ~arg5 && ~var26 <= ~var14 && ~var26 > ~(var14 + 8) && var15 <= var27 && var27 < var15 + 8) {
                                        int var28 = (arg8 << 7) - -class238.method1511(2, arg3, 1023 & var25.method1202((byte) -81), 1023 & var25.method1203((byte) -76));
                                        int var29 = class36.method234(1023 & var25.method1202((byte) -52), arg3, 1023 & var25.method1203((byte) -76), -22116) + (arg6 << 7);
                                        int var30 = var28 >> 7;
                                        int var31 = var29 >> 7;
                                        if (var30 >= 0 && ~var31 <= -1 && ~super.field2829 < ~var30 && ~super.field2819 < ~var31) {
                                            var25.method1205(var28, var29, super.field2824[arg5][var30][var31] + -var25.method1199((byte) 3), Integer.MAX_VALUE);
                                            if (~arg2.method843() < -1) {
                                                class337.method1990(var23);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class17();
                        }
                        var13.method109((byte) 94, arg1);
                    } else if (var20 == 128) {
                        if (arg10 == null) {
                            arg1.field1176 += 10;
                        } else {
                            arg10[0] = arg1.method568((byte) 110);
                            arg10[1] = arg1.method603((byte) -109);
                            arg10[2] = arg1.method603((byte) -104);
                            arg10[3] = arg1.method603((byte) -116);
                            arg10[4] = arg1.method568((byte) 110);
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field2835 == null) {
                            super.field2835 = new byte[4][][];
                        }
                        for (int var32 = 0; var32 < 4; ++var32) {
                            byte var33 = arg1.method575(-18);
                            if (var33 == 0 && super.field2835[arg4] != null) {
                                if (~arg5 <= ~var32) {
                                    int var34 = arg8;
                                    int var35 = arg8 + 7;
                                    int var36 = arg6;
                                    if (var35 >= 0) {
                                        if (~super.field2829 >= ~var35) {
                                            var35 = super.field2829;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    if (arg6 < 0) {
                                        var36 = 0;
                                    } else if (super.field2819 <= arg6) {
                                        var36 = super.field2819;
                                    }
                                    int var37 = arg6 - -7;
                                    if (~arg8 > -1) {
                                        var34 = 0;
                                    } else if (~arg8 <= ~super.field2829) {
                                        var34 = super.field2829;
                                    }
                                    if (var37 >= 0) {
                                        if (super.field2819 <= var37) {
                                            var37 = super.field2819;
                                        }
                                    } else {
                                        var37 = 0;
                                    }
                                    while (var34 < var35) {
                                        while (~var36 > ~var37) {
                                            super.field2835[arg4][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (~var33 == -2) {
                                if (super.field2835[arg4] == null) {
                                    super.field2835[arg4] = new byte[super.field2829 + 1][super.field2819 + 1];
                                }
                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg1.method575(arg0 + 9250);
                                        if (~var32 >= ~arg5) {
                                            for (int var41 = var38; ~(var38 + 4) < ~var41; ++var41) {
                                                for (int var42 = var39; var42 < var39 - -4; ++var42) {
                                                    if (~var14 >= ~var41 && var41 < var14 - -8 && ~var15 >= ~var42 && var15 < var15 - -8) {
                                                        int var43 = arg8 - -class193.method1251(7 & var41, arg3, var42 & 7, (byte) -83);
                                                        int var44 = arg6 - -class182.method1197(arg3, 7 & var41, 7 & var42, (byte) 78);
                                                        if (var43 >= 0 && super.field2829 > var43 && ~var44 <= -1 && ~var44 > ~super.field2819) {
                                                            super.field2835[arg4][var43][var44] = var40;
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
                    class465.method2805(2092, arg6 >> 3, var13, arg8 >> 3);
                }
                if (!var12 && super.field2835 != null && super.field2835[arg4] != null) {
                    int var16 = arg8 + 7;
                    int var17 = arg6 + 7;
                    for (int var18 = arg8; var18 < var16; ++var18) {
                        for (int var19 = arg6; var17 > var19; ++var19) {
                            super.field2835[arg4][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[BLqa;III[Lbm;III)V", line = 1756)
    public final void method2219(int arg0, int arg1, byte[] arg2, class129 arg3, int arg4, int arg5, int arg6, class215[] arg7, int arg8, int arg9, int arg10) {
        ++field4959;
        class88 var12 = new class88(arg2);
        if (arg6 == 7) {
            int var13 = -1;
            while (true) {
                int var14 = var12.method601((byte) -127);
                if (var14 == 0) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method604(-9338);
                    if (var16 == 0) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = 63 & var15;
                    int var18 = 63 & var15 >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method617(2);
                    int var21 = var20 >> 2;
                    int var22 = 3 & var20;
                    if (~arg0 == ~var19 && var18 >= arg4 && var18 < arg4 + 8 && ~var17 <= ~arg5 && var17 < arg5 + 8) {
                        class402 var23 = class52.field715.method1164(var13, 0);
                        int var24 = class248.method1554(var22, 7 & var17, arg9, arg6 + -3, var18 & 7, var23.field5396, var23.field5340) + arg10;
                        int var25 = arg1 - -class311.method1855(var17 & 7, true, var23.field5340, var18 & 7, var23.field5396, var22, arg9);
                        if (var24 > 0 && var25 > 0 && var24 < super.field2829 + -1 && ~(super.field2819 + -1) < ~var25) {
                            class215 var26 = null;
                            if (!super.field2825) {
                                int var27 = arg8;
                                if ((2 & class8.field76[1][var24][var25]) == 2) {
                                    var27 = arg8 - 1;
                                }
                                if (~var27 <= -1) {
                                    var26 = arg7[var27];
                                }
                            }
                            this.method2217(arg8, arg8, var21, var13, arg3, var25, var22 - -arg9 & 3, -1, var26, (byte) 11, var24);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqa;IIIILbm;I)V", line = 1836)
    public final void method2220(class129 arg0, int arg1, int arg2, int arg3, int arg4, class215 arg5, int arg6) {
        ++field4961;
        class323 var8 = null;
        if (~arg1 == -1) {
            var8 = (class323) class67.method384(arg4, arg2, arg3);
        }
        if (~arg1 == arg6) {
            var8 = (class323) class301.method1806(arg4, arg2, arg3);
        }
        if (~arg1 == -3) {
            var8 = (class323) class346.method2038(arg4, arg2, arg3, field4968 != null ? field4968 : (field4968 = class221.method1417("wk")));
        }
        if (arg1 == 3) {
            var8 = (class323) class205.method1342(arg4, arg2, arg3);
        }
        if (var8 != null) {
            class402 var9 = class52.field715.method1164(var8.method413(-30502), 0);
            int var10 = var8.method414(17350);
            int var11 = var8.method415(-15317);
            if (var9.method2385((byte) 123)) {
                class456.method2703(var9, arg4, arg3, arg2, (byte) -125);
            }
            if (var8.method417(false)) {
                var8.method421(arg0, (byte) -125);
            }
            if (~arg1 == -1) {
                class270 var12 = class67.method384(arg4, arg2, arg3);
                if (!(var12 instanceof class516)) {
                    class428.method2536(arg4, arg2, arg3);
                } else {
                    ((class516) var12).field7584 = null;
                }
                if (var9.field5400 != 0) {
                    arg5.method1371(var10, var11, (byte) -121, arg2, arg3, var9.field5376, !var9.field5384);
                    return;
                }
                return;
            }
            if (~arg1 == -2) {
                class303 var13 = class301.method1806(arg4, arg2, arg3);
                if (var13 instanceof class461) {
                    ((class461) var13).field6443 = null;
                    return;
                }
                class439.method2595(arg4, arg2, arg3);
                return;
            }
            if (~arg1 != -3) {
                if (arg1 == 3) {
                    class338 var14 = class205.method1342(arg4, arg2, arg3);
                    if (!(var14 instanceof class368)) {
                        class520.method3088(arg4, arg2, arg3);
                    } else {
                        ((class368) var14).field4729 = null;
                    }
                    if (~var9.field5400 == -2) {
                        arg5.method1370(-1, arg2, arg3);
                        return;
                    }
                }
                return;
            }
            class448 var15 = class346.method2038(arg4, arg2, arg3, field4968 != null ? field4968 : (field4968 = class221.method1417("wk")));
            if (var15 instanceof class188 && ~var15.field6238 == ~arg2 && var15.field6228 == arg3) {
                ((class188) var15).field2460 = null;
            } else {
                class287.method1742(arg4, arg2, arg3, field4968 != null ? field4968 : (field4968 = class221.method1417("wk")));
            }
            if (var9.field5400 != 0 && ~super.field2829 < ~(var9.field5340 + arg2) && ~super.field2819 < ~(var9.field5340 + arg3) && ~super.field2829 < ~(var9.field5396 + arg2) && super.field2819 > var9.field5396 + arg3) {
                arg5.method1385(var9.field5340, arg2, var9.field5396, false, arg3, var9.field5376, !var9.field5384, var11);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIZ)V", line = 1975)
    public class381(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class211.field2717, class89.field1245);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 1957)
    public static void method2221(int arg0) {
        field4967 = null;
        field4963 = null;
        if (arg0 != 240) {
            field4965 = -120;
        }
    }
}
