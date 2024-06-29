import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class219 extends class217 {

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
    public int field2910 = 99;

    @OriginalMember(owner = "client!dga", name = "L", descriptor = "[I")
    public static int[] field2918 = new int[13];

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!dga", name = "G", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!dga", name = "H", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!dga", name = "J", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!dga", name = "M", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!dga", name = "N", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!dga", name = "O", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "Laj;")
    public static class333 field2911;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dga", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field2922;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Loga;ILha;IBII)V")
    public final void method1437(class502 arg0, int arg1, class65 arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field2912;
        class392 var8 = this.method1446(arg5, arg6, (byte) 95, arg1, arg3);
        if (arg4 != -102) {
            field2918 = null;
        }
        if (var8 != null) {
            class589 var9 = class350.field5132.method3732((byte) 126, var8.method31(-23356));
            int var10 = var8.method18(-10908);
            int var11 = var8.method17(-2132);
            if (var9.method3284(arg4 ^ -56)) {
                class714.method3994(arg6, arg1, false, var9, arg3);
            }
            if (var8.method30(arg4 + 196)) {
                var8.method34(arg2, arg4 ^ 4251);
            }
            if (arg5 != 0) {
                if (~arg5 != -2) {
                    if (~arg5 == -3) {
                        class688.method3822(arg6, arg1, arg3, field2922 != null ? field2922 : (field2922 = method1447("he")));
                        if (var9.field7866 != 0 && super.field2888 > var9.field7940 + arg1 && ~(var9.field7940 + arg3) > ~super.field2900 && ~(var9.field7943 + arg1) > ~super.field2888 && ~super.field2900 < ~(var9.field7943 + arg3)) {
                            arg0.method2911((byte) 126, var9.field7940, var9.field7943, arg3, !var9.field7852, var11, var9.field7887, arg1);
                        }
                        if (~var10 == -10) {
                            if ((var11 & 1) != 0) {
                                class700.method3896((byte) 69, arg1, 16, arg6, arg3);
                                return;
                            }
                            class700.method3896((byte) 69, arg1, 8, arg6, arg3);
                            return;
                        }
                    } else {
                        if (~arg5 != -4) {
                            return;
                        }
                        class610.method3375(arg6, arg1, arg3);
                        if (~var9.field7866 != -2) {
                            return;
                        }
                        arg0.method2909(arg1, arg3, (byte) -121);
                    }
                    return;
                } else {
                    class398.method2495(arg6, arg1, arg3);
                    return;
                }
            }
            class60.method419(arg6, arg1, arg3);
            if (var9.field7866 != 0) {
                arg0.method2919(var11, var10, arg1, (byte) -84, !var9.field7852, arg3, var9.field7887);
            }
            if (~var9.field7938 == -2) {
                if (~var11 == -1) {
                    class700.method3896((byte) 69, arg1, 1, arg6, arg3);
                    return;
                }
                if (~var11 != -2) {
                    if (var11 != 2) {
                        if (~var11 == -4) {
                            class700.method3896((byte) 69, arg1, 2, arg6, arg3);
                            return;
                        }
                    } else {
                        class700.method3896((byte) 69, arg1 - -1, 1, arg6, arg3);
                    }
                    return;
                }
                class700.method3896((byte) 69, arg1, 2, arg6, arg3 + 1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZLha;B)V")
    public final void method1438(boolean arg0, class65 arg1, byte arg2) {
        class229.method1497();
        ++field2913;
        if (!arg0) {
            if (super.field2883 > 1) {
                for (int var4 = 0; ~super.field2888 < ~var4; ++var4) {
                    for (int var5 = 0; var5 < super.field2900; ++var5) {
                        if (~(2 & class66.field931[1][var4][var5]) == -3) {
                            class276.method1789(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~super.field2883 < ~var6; ++var6) {
                for (int var7 = 0; ~super.field2900 <= ~var7; ++var7) {
                    for (int var8 = 0; var8 <= super.field2888; ++var8) {
                        if ((super.field2891[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && (4 & super.field2891[var6][var8][var11 + -1]) != 0 && -var11 + var12 < 10) {
                                --var11;
                            }
                            while (~super.field2900 < ~var12 && ~(4 & super.field2891[var6][var8][var12 + 1]) != -1 && -var11 + var12 < 10) {
                                ++var12;
                            }
                            label118: while (~var9 < -1 && ~(-var9 + var10) > -11) {
                                for (int var13 = var11; var13 <= var12; ++var13) {
                                    if ((super.field2891[var6][var9 + -1][var13] & 4) == 0) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (var10 < super.field2888 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; ~var14 >= ~var12; ++var14) {
                                    if (~(super.field2891[var6][var10 + 1][var14] & 4) == -1) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if (~((var12 - var11 - -1) * (-var9 + var10 + 1)) <= -5) {
                                int var15 = super.field2897[var6][var9][var11];
                                class235.method1525(var15, var15, (var10 << 9) - -512, (var12 << 9) - -512, 4, var11 << 9, (byte) 99, var6, var9 << 9);
                                for (int var16 = var9; var10 >= var16; ++var16) {
                                    for (int var17 = var11; var17 <= var12; ++var17) {
                                        super.field2891[var6][var16][var17] = (byte) class440.method2643(super.field2891[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class77.method668((byte) -100);
        }
        super.field2891 = null;
        if (arg2 < 80) {
            this.method1439(126, (class376) null, (class65) null, (byte) -12, 26, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILjp;Lha;BI[I)V")
    public final void method1439(int arg0, class376 arg1, class65 arg2, byte arg3, int arg4, int[] arg5) {
        ++field2921;
        if (!super.field2895) {
            boolean var7 = false;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            class347 var8 = null;
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg1.field5518.length < ~arg1.field5459) {
                            int var18 = arg1.method2398(-1372747256);
                            if (~var18 != -1) {
                                if (var18 != 1) {
                                    if (var18 == 2) {
                                        if (var8 == null) {
                                            var8 = new class347();
                                        }
                                        var8.method2193((byte) -117, arg1);
                                    } else if (var18 == 128) {
                                        if (arg5 != null) {
                                            arg5[0] = arg1.method2359(-1);
                                            arg5[1] = arg1.method2355(3);
                                            arg5[2] = arg1.method2355(3);
                                            arg5[3] = arg1.method2355(3);
                                            arg5[4] = arg1.method2359(-1);
                                        } else {
                                            arg1.field5459 += 10;
                                        }
                                    } else {
                                        if (~var18 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field2885 == null) {
                                            super.field2885 = new byte[4][][];
                                        }
                                        for (int var19 = 0; ~var19 > -5; ++var19) {
                                            byte var20 = arg1.method2387((byte) 124);
                                            if (var20 == 0 && super.field2885[var19] != null) {
                                                int var21 = arg4;
                                                int var22 = arg4 + 64;
                                                int var23 = arg0;
                                                if (arg4 < 0) {
                                                    var21 = 0;
                                                } else if (~super.field2888 >= ~arg4) {
                                                    var21 = super.field2888;
                                                }
                                                if (~var22 > -1) {
                                                    var22 = 0;
                                                } else if (~super.field2888 >= ~var22) {
                                                    var22 = super.field2888;
                                                }
                                                int var24 = arg0 + 64;
                                                if (arg0 < 0) {
                                                    var23 = 0;
                                                } else if (~arg0 <= ~super.field2900) {
                                                    var23 = super.field2900;
                                                }
                                                if (var24 < 0) {
                                                    var24 = 0;
                                                } else if (~super.field2900 >= ~var24) {
                                                    var24 = super.field2900;
                                                }
                                                while (~var22 < ~var21) {
                                                    while (var23 < var24) {
                                                        super.field2885[var19][var21][var23] = 0;
                                                        ++var23;
                                                    }
                                                    ++var21;
                                                }
                                            } else if (var20 != 1) {
                                                if (var20 == 2) {
                                                    if (super.field2885[var19] == null) {
                                                        super.field2885[var19] = new byte[super.field2888 + 1][super.field2900 + 1];
                                                    }
                                                    if (~var19 < -1) {
                                                        int var25 = arg4;
                                                        int var26 = arg4 + 64;
                                                        int var27 = arg0;
                                                        if (~arg0 <= -1) {
                                                            if (arg0 >= super.field2900) {
                                                                var27 = super.field2900;
                                                            }
                                                        } else {
                                                            var27 = 0;
                                                        }
                                                        if (~arg4 <= -1) {
                                                            if (super.field2888 <= arg4) {
                                                                var25 = super.field2888;
                                                            }
                                                        } else {
                                                            var25 = 0;
                                                        }
                                                        if (~var26 <= -1) {
                                                            if (var26 >= super.field2888) {
                                                                var26 = super.field2888;
                                                            }
                                                        } else {
                                                            var26 = 0;
                                                        }
                                                        int var28 = arg0 - -64;
                                                        if (~var28 > -1) {
                                                            var28 = 0;
                                                        } else if (~super.field2900 >= ~var28) {
                                                            var28 = super.field2900;
                                                        }
                                                        while (~var25 > ~var26) {
                                                            while (~var28 < ~var27) {
                                                                super.field2885[var19][var25][var27] = super.field2885[var19 + -1][var25][var27];
                                                                ++var27;
                                                            }
                                                            ++var25;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field2885[var19] == null) {
                                                    super.field2885[var19] = new byte[super.field2888 + 1][super.field2900 + 1];
                                                }
                                                for (int var29 = 0; var29 < 64; var29 += 4) {
                                                    for (int var30 = 0; var30 < 64; var30 += 4) {
                                                        byte var31 = arg1.method2387((byte) -97);
                                                        for (int var32 = arg4 + var29; ~(var29 - -4 + arg4) < ~var32; ++var32) {
                                                            for (int var33 = arg0 + var30; ~var33 > ~(arg0 - -4 + var30); ++var33) {
                                                                if (var32 >= 0 && super.field2888 > var32 && var33 >= 0 && super.field2900 > var33) {
                                                                    super.field2885[var19][var32][var33] = var31;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        var7 = true;
                                    }
                                } else {
                                    int var34 = arg1.method2398(-1372747256);
                                    if (~var34 < -1) {
                                        for (int var35 = 0; var34 > var35; ++var35) {
                                            class700 var36 = new class700(arg2, arg1, 2);
                                            if (~var36.field9824 == -32) {
                                                class785 var37 = class723.field10061.method4096(arg1.method2359(-1), (byte) -59);
                                                var36.method3900(var37.field10803, var37.field10806, var37.field10805, false, var37.field10809);
                                            }
                                            if (~arg2.method451() < -1) {
                                                class540 var38 = var36.field9828;
                                                int var39 = (arg4 << 9) + var38.method3085(24859);
                                                int var40 = var38.method3084((byte) -16) - -(arg0 << 9);
                                                int var41 = var39 >> 9;
                                                int var42 = var40 >> 9;
                                                if (~var41 <= -1 && var42 >= 0 && super.field2888 > var41 && ~var42 > ~super.field2900) {
                                                    var38.method1411(var39, (byte) 24, var40, super.field2897[var36.field9827][var41][var42] + -var38.method3082(-65));
                                                    class335.method2129(var36);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class347(arg1);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg4 >> 3) + var9;
                                    int var12 = (arg0 >> 3) + var10;
                                    if (~var11 <= -1 && ~(super.field2888 >> 3) < ~var11 && ~var12 <= -1 && ~(super.field2900 >> 3) < ~var12) {
                                        class518.method3003(var8, var11, var12, 99);
                                    }
                                }
                            }
                        }
                        if (arg3 > -105) {
                            field2911 = null;
                        }
                        if (!var7 && super.field2885 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field2885[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; var15 < 16; ++var15) {
                                            int var16 = (arg4 >> 2) - -var14;
                                            int var17 = (arg0 >> 2) + var15;
                                            if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                                super.field2885[var13][var16][var17] = 0;
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
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)Z")
    public static final boolean method1440(int arg0, int arg1) {
        if (arg0 > -42) {
            method1442(-82);
        }
        ++field2917;
        return ~arg1 == -1 || arg1 == 1 || ~arg1 == -3;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IIIZ)V")
    public class219(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class298.field4317, class473.field6534);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[Loga;IIILha;IIII[B)V")
    public final void method1441(int arg0, class502[] arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        ++field2920;
        class376 var12 = new class376(arg10);
        int var13 = arg4;
        while (true) {
            int var14 = var12.method2385(arg4 ^ 18918);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2370(-2);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4040 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2398(arg4 + -1372747255);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg0 == ~var19 && var18 >= arg7 && ~var18 > ~(arg7 + 8) && ~arg8 >= ~var17 && ~var17 > ~(arg8 - -8)) {
                    class589 var23 = class350.field5132.method3732((byte) 115, var13);
                    int var24 = arg2 - -class135.method1060(var22, arg9, arg4 ^ 63, var23.field7943, var23.field7940, var18 & 7, var17 & 7);
                    int var25 = class126.method1024(var23.field7943, var22, arg4 ^ 43, arg9, 7 & var18, var23.field7940, 7 & var17) + arg3;
                    if (var24 > 0 && var25 > 0 && var24 < super.field2888 + -1 && super.field2900 - 1 > var25) {
                        class502 var26 = null;
                        if (!super.field2895) {
                            int var27 = arg6;
                            if ((2 & class66.field931[1][var24][var25]) == 2) {
                                var27 = arg6 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg1[var27];
                            }
                        }
                        this.method1444(arg5, var13, arg6, var21, true, var25, -1, 3 & var22 - -arg9, arg6, var24, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field2911 = null;
        int var1 = 92 / ((21 - arg0) / 58);
        field2918 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lha;IB[Loga;[BI)V")
    public final void method1443(class65 arg0, int arg1, byte arg2, class502[] arg3, byte[] arg4, int arg5) {
        ++field2919;
        class376 var7 = new class376(arg4);
        int var8 = -1;
        if (arg2 != -62) {
            this.method1437((class502) null, -90, (class65) null, -40, (byte) 18, -29, 18);
        }
        while (true) {
            int var9 = var7.method2385(-18919);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2370(arg2 + 60);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = 63 & var10;
                int var13 = (4038 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2398(arg2 ^ 1372747210);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = var13 - -arg1;
                int var19 = arg5 + var12;
                if (var18 > 0 && ~var19 < -1 && ~var18 > ~(super.field2888 + -1) && var19 < super.field2900 - 1) {
                    class502 var20 = null;
                    if (!super.field2895) {
                        int var21 = var14;
                        if (~(class66.field931[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method1444(arg0, var8, var14, var16, true, var19, -1, var17, var14, var18, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lha;IIIZIIIIILoga;)V")
    public final void method1444(class65 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class502 arg10) {
        ++field2916;
        if (~class712.field9959.field1320.method4251(36) != -1 || class349.method2202(arg5, arg9, class387.field5634, false, arg2)) {
            if (~this.field2910 < ~arg8) {
                this.field2910 = arg8;
            }
            class589 var12 = class350.field5132.method3732((byte) 30, arg1);
            if (~class712.field9959.field1307.method1209(66) != -1 || !var12.field7862) {
                int var13;
                int var14;
                if (arg7 != 1 && arg7 != 3) {
                    var13 = var12.field7943;
                    var14 = var12.field7940;
                } else {
                    var14 = var12.field7943;
                    var13 = var12.field7940;
                }
                int var15;
                int var16;
                if (~(arg9 + var14) >= ~super.field2888) {
                    var15 = arg9 - -(var14 + 1 >> 1);
                    var16 = arg9 - -(var14 >> 1);
                } else {
                    var16 = arg9;
                    var15 = arg9 + 1;
                }
                int var17;
                int var18;
                if (~super.field2900 <= ~(arg5 + var13)) {
                    var17 = arg5 - -(var13 >> 1);
                    var18 = (var13 - -1 >> 1) + arg5;
                } else {
                    var17 = arg5;
                    var18 = arg5 + 1;
                }
                class296 var19 = class528.field7227[arg2];
                int var20 = var19.method1880(var16, !arg4, var17) + var19.method1880(var15, false, var17) + var19.method1880(var16, false, var18) + var19.method1880(var15, !arg4, var18) >> 2;
                int var21 = (arg9 << 9) + (var14 << 8);
                int var22 = (arg5 << 9) + (var13 << 8);
                boolean var23 = class584.field7794 && !super.field2895 && var12.field7915;
                if (var12.method3284(57)) {
                    class647.method3618(arg9, arg5, (class192) null, var12, (class73) null, arg7, -109, arg8);
                }
                boolean var24 = arg6 == -1 && ~var12.field7851 == 0 && var12.field7861 == null && var12.field7865 == null && !var12.field7889 && !var12.field7885;
                if (!class582.field7774 || (!class536.method3068(-15931, arg3) || ~var12.field7938 == -2) && (!class711.method3976((byte) 84, arg3) || var12.field7938 != 0)) {
                    if (~arg3 == -23) {
                        if (~class712.field9959.field1287.method1486(29) != -1 || ~var12.field7933 != -1 || ~var12.field7866 == -2 || var12.field7913) {
                            class6 var26;
                            if (var24) {
                                class120 var25 = new class120(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg7, var23);
                                if (var25.method30(75)) {
                                    var25.method20(arg0, -4947);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class518(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg7, arg6);
                            }
                            class60.method421(arg8, arg9, arg5, var26);
                            if (~var12.field7866 == -2 && arg10 != null) {
                                arg10.method2904(arg5, arg9, 262144);
                            }
                        }
                    } else if (~arg3 != -11 && ~arg3 != -12) {
                        if ((arg3 < 12 || ~arg3 < -18) && (~arg3 > -19 || arg3 > 21)) {
                            if (~arg3 == -1) {
                                int var29 = var12.field7938;
                                if (class688.field9673 && ~var12.field7938 == 0) {
                                    var29 = 1;
                                }
                                class516 var30;
                                if (!var24) {
                                    var30 = new class8(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, arg7, arg6);
                                } else {
                                    class695 var31 = new class695(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, arg7, var23);
                                    if (var31.method30(91)) {
                                        var31.method20(arg0, -4947);
                                    }
                                    var30 = var31;
                                }
                                class200.method1360(arg8, arg9, arg5, var30, (class516) null);
                                if (~arg7 != -1) {
                                    if (~arg7 != -2) {
                                        if (arg7 != 2) {
                                            if (arg7 == 3) {
                                                if (class584.field7794 && var12.field7884) {
                                                    var19.method1150(arg9, arg5, 50);
                                                    var19.method1150(arg9 - -1, arg5, 50);
                                                }
                                                if (~var29 == -2 && !super.field2895) {
                                                    class250.method1680(var12.field7886, arg8, arg5, var12.field7875, 2, arg9, -15768);
                                                }
                                            }
                                        } else {
                                            if (class584.field7794 && var12.field7884) {
                                                var19.method1150(arg9 + 1, arg5, 50);
                                                var19.method1150(arg9 - -1, arg5 + 1, 50);
                                            }
                                            if (~var29 == -2 && !super.field2895) {
                                                class250.method1680(var12.field7886, arg8, arg5, -var12.field7875, 1, arg9 + 1, -15768);
                                            }
                                        }
                                    } else {
                                        if (class584.field7794 && var12.field7884) {
                                            var19.method1150(arg9, arg5 + 1, 50);
                                            var19.method1150(arg9 + 1, arg5 + 1, 50);
                                        }
                                        if (var29 == 1 && !super.field2895) {
                                            class250.method1680(var12.field7886, arg8, arg5 + 1, -var12.field7875, 2, arg9, -15768);
                                        }
                                    }
                                } else {
                                    if (class584.field7794 && var12.field7884) {
                                        var19.method1150(arg9, arg5, 50);
                                        var19.method1150(arg9, arg5 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field2895) {
                                        class250.method1680(var12.field7886, arg8, arg5, var12.field7875, 1, arg9, -15768);
                                    }
                                }
                                if (var12.field7866 != 0 && arg10 != null) {
                                    arg10.method2908(arg5, var12.field7887, arg3, -15874, !var12.field7852, arg7, arg9);
                                }
                                if (var12.field7896 != 64) {
                                    class209.method1392(arg8, arg9, arg5, var12.field7896);
                                }
                            } else if (arg3 == 1) {
                                class516 var33;
                                if (var24) {
                                    class695 var32 = new class695(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, arg7, var23);
                                    var33 = var32;
                                    if (var32.method30(74)) {
                                        var32.method20(arg0, -4947);
                                    }
                                } else {
                                    var33 = new class8(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, arg7, arg6);
                                }
                                class200.method1360(arg8, arg9, arg5, var33, (class516) null);
                                if (var12.field7884 && class584.field7794) {
                                    if (arg7 != 0) {
                                        if (arg7 != 1) {
                                            if (~arg7 == -3) {
                                                var19.method1150(arg9 + 1, arg5, 50);
                                            } else if (~arg7 == -4) {
                                                var19.method1150(arg9, arg5, 50);
                                            }
                                        } else {
                                            var19.method1150(arg9 + 1, arg5 - -1, 50);
                                        }
                                    } else {
                                        var19.method1150(arg9, arg5 + 1, 50);
                                    }
                                }
                                if (var12.field7866 != 0 && arg10 != null) {
                                    arg10.method2908(arg5, var12.field7887, arg3, -15874, !var12.field7852, arg7, arg9);
                                }
                            } else if (arg3 == 2) {
                                int var34 = arg7 + 1 & 3;
                                class516 var35;
                                class516 var36;
                                if (!var24) {
                                    var35 = new class8(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, arg7 + 4, arg6);
                                    var36 = new class8(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, var34, arg6);
                                } else {
                                    class695 var37 = new class695(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, arg7 + 4, var23);
                                    class695 var38 = new class695(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, var34, var23);
                                    if (var37.method30(127)) {
                                        var37.method20(arg0, -4947);
                                    }
                                    var35 = var37;
                                    if (var38.method30(81)) {
                                        var38.method20(arg0, -4947);
                                    }
                                    var36 = var38;
                                }
                                class200.method1360(arg8, arg9, arg5, var35, var36);
                                if ((~var12.field7938 == -2 || class688.field9673 && var12.field7938 == -1) && !super.field2895) {
                                    if (arg7 != 0) {
                                        if (arg7 != 1) {
                                            if (~arg7 != -3) {
                                                if (~arg7 == -4) {
                                                    class250.method1680(var12.field7886, arg8, arg5, var12.field7875, 1, arg9, -15768);
                                                    class250.method1680(var12.field7886, arg8, arg5, var12.field7875, 2, arg9, -15768);
                                                }
                                            } else {
                                                class250.method1680(var12.field7886, arg8, arg5, var12.field7875, 1, arg9 - -1, -15768);
                                                class250.method1680(var12.field7886, arg8, arg5, var12.field7875, 2, arg9, -15768);
                                            }
                                        } else {
                                            class250.method1680(var12.field7886, arg8, arg5, var12.field7875, 1, arg9 + 1, -15768);
                                            class250.method1680(var12.field7886, arg8, arg5 + 1, var12.field7875, 2, arg9, -15768);
                                        }
                                    } else {
                                        class250.method1680(var12.field7886, arg8, arg5, var12.field7875, 1, arg9, -15768);
                                        class250.method1680(var12.field7886, arg8, arg5 + 1, var12.field7875, 2, arg9, -15768);
                                    }
                                }
                                if (~var12.field7866 != -1 && arg10 != null) {
                                    arg10.method2908(arg5, var12.field7887, arg3, -15874, !var12.field7852, arg7, arg9);
                                }
                                if (~var12.field7896 != -65) {
                                    class209.method1392(arg8, arg9, arg5, var12.field7896);
                                }
                            } else if (~arg3 == -4) {
                                class516 var40;
                                if (var24) {
                                    class695 var39 = new class695(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, arg7, var23);
                                    var40 = var39;
                                    if (var39.method30(105)) {
                                        var39.method20(arg0, -4947);
                                    }
                                } else {
                                    var40 = new class8(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg3, arg7, arg6);
                                }
                                class200.method1360(arg8, arg9, arg5, var40, (class516) null);
                                if (var12.field7884 && class584.field7794) {
                                    if (arg7 != 0) {
                                        if (~arg7 == -2) {
                                            var19.method1150(arg9 + 1, arg5 + 1, 50);
                                        } else if (arg7 != 2) {
                                            if (arg7 == 3) {
                                                var19.method1150(arg9, arg5, 50);
                                            }
                                        } else {
                                            var19.method1150(arg9 - -1, arg5, 50);
                                        }
                                    } else {
                                        var19.method1150(arg9, arg5 + 1, 50);
                                    }
                                }
                                if (~var12.field7866 != -1 && arg10 != null) {
                                    arg10.method2908(arg5, var12.field7887, arg3, -15874, !var12.field7852, arg7, arg9);
                                }
                            } else if (arg3 == 9) {
                                class319 var42;
                                if (var24) {
                                    class382 var41 = new class382(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg9, arg9, arg5, arg5, arg3, arg7, var23);
                                    if (var41.method30(69)) {
                                        var41.method20(arg0, -4947);
                                    }
                                    var42 = var41;
                                } else {
                                    var42 = new class282(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg9, arg9 + var14 + -1, arg5, var13 + -1 + arg5, arg3, arg7, arg6);
                                }
                                class356.method2242(var42, false);
                                if (var12.field7938 == 1 && !super.field2895) {
                                    byte var43;
                                    if ((1 & arg7) == 0) {
                                        var43 = 8;
                                    } else {
                                        var43 = 16;
                                    }
                                    class250.method1680(var12.field7886, arg8, arg5, 0, var43, arg9, -15768);
                                }
                                if (var12.field7866 != 0 && arg10 != null) {
                                    arg10.method2910(!var12.field7852, arg5, var13, arg9, var14, var12.field7887, -1);
                                }
                                if (~var12.field7896 != -65) {
                                    class209.method1392(arg8, arg9, arg5, var12.field7896);
                                }
                            } else if (arg4) {
                                if (arg3 == 4) {
                                    class280 var45;
                                    if (var24) {
                                        class697 var44 = new class697(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, 0, 0, arg3, arg7);
                                        var45 = var44;
                                        if (var44.method30(68)) {
                                            var44.method20(arg0, -4947);
                                        }
                                    } else {
                                        var45 = new class4(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, 0, 0, arg3, arg7, arg6);
                                    }
                                    class269.method1753(arg8, arg9, arg5, var45, (class280) null);
                                } else if (~arg3 == -6) {
                                    int var46 = 65;
                                    class392 var47 = (class392) class94.method752(arg8, arg9, arg5);
                                    if (var47 != null) {
                                        var46 = class350.field5132.method3732((byte) 23, var47.method31(-23356)).field7896 - -1;
                                    }
                                    class280 var48;
                                    if (!var24) {
                                        var48 = new class4(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, class645.field8958[arg7] * var46, class74.field1098[arg7] * var46, arg3, arg7, arg6);
                                    } else {
                                        class697 var49 = new class697(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, class645.field8958[arg7] * var46, class74.field1098[arg7] * var46, arg3, arg7);
                                        if (var49.method30(126)) {
                                            var49.method20(arg0, -4947);
                                        }
                                        var48 = var49;
                                    }
                                    class269.method1753(arg8, arg9, arg5, var48, (class280) null);
                                } else if (~arg3 == -7) {
                                    int var50 = 33;
                                    class392 var51 = (class392) class94.method752(arg8, arg9, arg5);
                                    if (var51 != null) {
                                        var50 = 1 + class350.field5132.method3732((byte) 102, var51.method31(-23356)).field7896 / 2;
                                    }
                                    class280 var52;
                                    if (!var24) {
                                        var52 = new class4(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, class678.field9485[arg7] * var50, class334.field4868[arg7] * var50, arg3, arg7 + 4, arg6);
                                    } else {
                                        class697 var53 = new class697(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, class645.field8958[arg7] * var50, class74.field1098[arg7] * var50, arg3, arg7 + 4);
                                        if (var53.method30(60)) {
                                            var53.method20(arg0, -4947);
                                        }
                                        var52 = var53;
                                    }
                                    class269.method1753(arg8, arg9, arg5, var52, (class280) null);
                                } else if (arg3 == 7) {
                                    int var54 = arg7 + 2 & 3;
                                    class280 var56;
                                    if (var24) {
                                        class697 var55 = new class697(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, 0, 0, arg3, var54 - -4);
                                        var56 = var55;
                                        if (var55.method30(127)) {
                                            var55.method20(arg0, -4947);
                                        }
                                    } else {
                                        var56 = new class4(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, 0, 0, arg3, var54 + 4, arg6);
                                    }
                                    class269.method1753(arg8, arg9, arg5, var56, (class280) null);
                                } else if (~arg3 == -9) {
                                    int var57 = 3 & arg7 + 2;
                                    int var58 = 33;
                                    class392 var59 = (class392) class94.method752(arg8, arg9, arg5);
                                    if (var59 != null) {
                                        var58 = class350.field5132.method3732((byte) 70, var59.method31(-23356)).field7896 / 2 + 1;
                                    }
                                    class280 var61;
                                    class280 var63;
                                    if (!var24) {
                                        class4 var60 = new class4(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, class678.field9485[arg7] * var58, class334.field4868[arg7] * var58, arg3, arg7 - -4, arg6);
                                        var61 = var60;
                                        class4 var62 = new class4(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, 0, 0, arg3, var57 - -4, arg6);
                                        var63 = var62;
                                    } else {
                                        class697 var64 = new class697(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, class678.field9485[arg7] * var58, class334.field4868[arg7] * var58, arg3, arg7 - -4);
                                        class697 var65 = new class697(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, 0, 0, arg3, var57 + 4);
                                        if (var64.method30(64)) {
                                            var64.method20(arg0, -4947);
                                        }
                                        if (var65.method30(119)) {
                                            var65.method20(arg0, -4947);
                                        }
                                        var63 = var65;
                                        var61 = var64;
                                    }
                                    class269.method1753(arg8, arg9, arg5, var61, var63);
                                }
                            }
                        } else {
                            class319 var28;
                            if (var24) {
                                class382 var27 = new class382(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg9, arg9 + -1 + var14, arg5, arg5 - -var13 + -1, arg3, arg7, var23);
                                if (var27.method30(112)) {
                                    var27.method20(arg0, -4947);
                                }
                                var28 = var27;
                            } else {
                                var28 = new class282(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg9, var14 + -1 + arg9, arg5, arg5 + var13 + -1, arg3, arg7, arg6);
                            }
                            class356.method2242(var28, false);
                            if (class584.field7794 && !super.field2895 && arg3 >= 12 && arg3 <= 17 && ~arg3 != -14 && ~arg8 < -1 && var12.field7938 != 0) {
                                super.field2891[arg8][arg9][arg5] = (byte) class213.method1409(super.field2891[arg8][arg9][arg5], 4);
                            }
                            if (~var12.field7866 != -1 && arg10 != null) {
                                arg10.method2910(!var12.field7852, arg5, var13, arg9, var14, var12.field7887, -1);
                            }
                        }
                    } else {
                        class382 var66 = null;
                        int var68;
                        class319 var69;
                        if (var24) {
                            class382 var67 = new class382(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg9, var14 - 1 + arg9, arg5, arg5 + var13 - 1, arg3, arg7, var23);
                            var68 = var67.method2435((byte) -124);
                            var69 = var67;
                            var66 = var67;
                        } else {
                            var69 = new class282(arg0, var12, arg8, arg2, var21, var20, var22, super.field2895, arg9, arg9 + -1 - -var14, arg5, arg5 + var13 + -1, arg3, arg7, arg6);
                            var68 = 15;
                        }
                        if (class356.method2242(var69, false)) {
                            if (var66 != null && var66.method30(72)) {
                                var66.method20(arg0, -4947);
                            }
                            if (var12.field7884 && class584.field7794) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var14 <= ~var70; ++var70) {
                                    for (int var71 = 0; ~var71 >= ~var13; ++var71) {
                                        var19.method1150(arg9 + var70, arg5 - -var71, var68);
                                    }
                                }
                            }
                        }
                        if (var12.field7866 != 0 && arg10 != null) {
                            arg10.method2910(!var12.field7852, arg5, var13, arg9, var14, var12.field7887, -1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZI[IIILjp;IIILha;)V")
    public final void method1445(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, class376 arg6, int arg7, int arg8, int arg9, class65 arg10) {
        ++field2915;
        if (!super.field2895) {
            class347 var13 = null;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            int var14 = (7 & arg7) * 8;
            int var15 = (7 & arg9) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg6.field5518.length < ~arg6.field5459) {
                                int var20 = arg6.method2398(-1372747256);
                                if (~var20 != -1) {
                                    if (~var20 != -2) {
                                        if (~var20 != -3) {
                                            if (~var20 != -129) {
                                                if (var20 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field2885 == null) {
                                                    super.field2885 = new byte[4][][];
                                                }
                                                for (int var21 = 0; var21 < 4; ++var21) {
                                                    byte var22 = arg6.method2387((byte) -75);
                                                    if (~var22 == -1 && super.field2885[arg2] != null) {
                                                        if (arg4 >= var21) {
                                                            int var23 = arg5;
                                                            int var24 = arg5 + 7;
                                                            int var25 = arg0;
                                                            if (~arg5 > -1) {
                                                                var23 = 0;
                                                            } else if (~arg5 <= ~super.field2888) {
                                                                var23 = super.field2888;
                                                            }
                                                            int var26 = arg0 - -7;
                                                            if (arg0 >= 0) {
                                                                if (arg0 >= super.field2900) {
                                                                    var25 = super.field2900;
                                                                }
                                                            } else {
                                                                var25 = 0;
                                                            }
                                                            if (var24 >= 0) {
                                                                if (~var24 <= ~super.field2888) {
                                                                    var24 = super.field2888;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            if (var26 >= 0) {
                                                                if (var26 >= super.field2900) {
                                                                    var26 = super.field2900;
                                                                }
                                                            } else {
                                                                var26 = 0;
                                                            }
                                                            while (var24 > var23) {
                                                                while (~var25 > ~var26) {
                                                                    super.field2885[arg2][var23][var25] = 0;
                                                                    ++var25;
                                                                }
                                                                ++var23;
                                                            }
                                                        }
                                                    } else if (~var22 == -2) {
                                                        if (super.field2885[arg2] == null) {
                                                            super.field2885[arg2] = new byte[super.field2888 + 1][super.field2900 + 1];
                                                        }
                                                        for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                                            for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                                                byte var29 = arg6.method2387((byte) 84);
                                                                if (~var21 >= ~arg4) {
                                                                    for (int var30 = var27; ~(var27 - -4) < ~var30; ++var30) {
                                                                        for (int var31 = var28; var28 - -4 > var31; ++var31) {
                                                                            if (~var30 <= ~var14 && var30 < var14 + 8 && var31 >= var15 && ~var15 > ~(var15 + 8)) {
                                                                                int var32 = class758.method4217(7 & var31, -17020, var30 & 7, arg8) + arg5;
                                                                                int var33 = class22.method181(arg1, arg8, 7 & var31, var30 & 7) + arg0;
                                                                                if (~var32 <= -1 && ~var32 > ~super.field2888 && var33 >= 0 && ~super.field2900 < ~var33) {
                                                                                    super.field2885[arg2][var32][var33] = var29;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (arg3 == null) {
                                                arg6.field5459 += 10;
                                            } else {
                                                arg3[0] = arg6.method2359(-1);
                                                arg3[1] = arg6.method2355(3);
                                                arg3[2] = arg6.method2355(3);
                                                arg3[3] = arg6.method2355(3);
                                                arg3[4] = arg6.method2359(-1);
                                            }
                                        } else {
                                            if (var13 == null) {
                                                var13 = new class347();
                                            }
                                            var13.method2193((byte) -72, arg6);
                                        }
                                    } else {
                                        int var34 = arg6.method2398(-1372747256);
                                        if (var34 > 0) {
                                            for (int var35 = 0; var34 > var35; ++var35) {
                                                class700 var36 = new class700(arg10, arg6, 2);
                                                if (~var36.field9824 == -32) {
                                                    class785 var37 = class723.field10061.method4096(arg6.method2359(-1), (byte) -59);
                                                    var36.method3900(var37.field10803, var37.field10806, var37.field10805, false, var37.field10809);
                                                }
                                                if (~arg10.method451() < -1) {
                                                    class540 var38 = var36.field9828;
                                                    int var39 = var38.method3085(24859) >> 9;
                                                    int var40 = var38.method3084((byte) -16) >> 9;
                                                    if (var36.field9827 == arg4 && ~var39 <= ~var14 && var39 < var14 + 8 && ~var40 <= ~var15 && ~(var15 - -8) < ~var40) {
                                                        int var41 = (arg5 << 9) + class743.method4116(4095 & var38.method3085(24859), false, arg8, 4095 & var38.method3084((byte) -16));
                                                        int var42 = var41 >> 9;
                                                        int var43 = (arg0 << 9) - -class20.method156(4095 & var38.method3085(24859), arg8, 4095 & var38.method3084((byte) -16), true);
                                                        int var44 = var43 >> 9;
                                                        if (~var42 <= -1 && var44 >= 0 && super.field2888 > var42 && ~var44 > ~super.field2900) {
                                                            var38.method1411(var41, (byte) 24, var43, super.field2897[arg4][var42][var44] + -var38.method3082(-72));
                                                            class335.method2129(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class347(arg6);
                                }
                            }
                            if (var13 != null) {
                                class518.method3003(var13, arg5 >> 3, arg0 >> 3, -115);
                            }
                            if (!arg1 && super.field2885 != null && super.field2885[arg2] != null) {
                                int var16 = arg5 + 7;
                                int var17 = arg0 - -7;
                                for (int var18 = arg5; var16 > var18; ++var18) {
                                    for (int var19 = arg0; var19 < var17; ++var19) {
                                        super.field2885[arg2][var18][var19] = 0;
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
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIBII)Lhe;")
    public final class392 method1446(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field2914;
        class392 var6 = null;
        if (arg0 == 0) {
            var6 = (class392) class94.method752(arg1, arg3, arg4);
        }
        if (~arg0 == -2) {
            var6 = (class392) class471.method2772(arg1, arg3, arg4);
        }
        if (arg0 == 2) {
            var6 = (class392) class771.method4264(arg1, arg3, arg4, field2922 != null ? field2922 : (field2922 = method1447("he")));
        }
        if (arg0 == 3) {
            var6 = (class392) class119.method988(arg1, arg3, arg4);
        }
        int var7 = -10 / ((arg2 - 9) / 62);
        return var6;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1447(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
