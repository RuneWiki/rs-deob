import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class227 extends class9 {

    @OriginalMember(owner = "client!jda", name = "S", descriptor = "I")
    public int field3338 = 99;

    @OriginalMember(owner = "client!jda", name = "K", descriptor = "[I")
    public static int[] field3330 = new int[5];

    @OriginalMember(owner = "client!jda", name = "I", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!jda", name = "M", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!jda", name = "N", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!jda", name = "O", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!jda", name = "P", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!jda", name = "Q", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!jda", name = "R", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!jda", name = "T", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!jda", name = "U", descriptor = "I")
    public static int field3340;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jda", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field3341;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1536(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)V", line = 5)
    public static void method1524(byte arg0) {
        int var1 = -16 % ((arg0 - -39) / 53);
        field3330 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ltea;IIIILha;I)V", line = 18)
    public final void method1525(class240 arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5, int arg6) {
        if (arg1 != 1) {
            field3330 = null;
        }
        ++field3335;
        class721 var8 = this.method1533(arg2, arg3, false, arg4, arg6);
        if (var8 != null) {
            class211 var9 = class239.field3470.method388(var8.method317(arg1 ^ 125), 100);
            int var10 = var8.method309((byte) -41);
            int var11 = var8.method327(-124);
            if (var9.method1439(-26530)) {
                class516.method3045(arg3, arg4, var9, (byte) 100, arg6);
            }
            if (var8.method321((byte) -128)) {
                var8.method310(arg5, (byte) -88);
            }
            if (arg2 != 0) {
                if (arg2 == 1) {
                    class162.method1187(arg6, arg4, arg3);
                } else {
                    if (~arg2 != -3) {
                        if (~arg2 == -4) {
                            class110.method820(arg6, arg4, arg3);
                            if (~var9.field3145 == -2) {
                                arg0.method1603(arg4, arg3, 1);
                                return;
                            }
                        }
                    } else {
                        class702.method3996(arg6, arg4, arg3, field3341 != null ? field3341 : (field3341 = method1536("jn")));
                        if (~var9.field3145 != -1 && ~(arg4 - -var9.field3164) > ~super.field140 && super.field138 > var9.field3164 + arg3 && super.field140 > var9.field3152 + arg4 && ~(var9.field3152 + arg3) > ~super.field138) {
                            arg0.method1602(1073741824, var9.field3152, var9.field3164, var11, arg4, !var9.field3174, var9.field3178, arg3);
                        }
                        if (~var10 != -10) {
                            return;
                        }
                        if ((var11 & 1) != 0) {
                            class445.method2757(arg1 + 59, arg6, arg3, 16, arg4);
                            return;
                        }
                        class445.method2757(79, arg6, arg3, 8, arg4);
                    }
                }
            } else {
                class109.method817(arg6, arg4, arg3);
                if (~var9.field3145 != -1) {
                    arg0.method1586(arg3, arg1 + -70, var9.field3178, arg4, var10, var11, !var9.field3174);
                }
                if (~var9.field3100 == -2) {
                    if (var11 != 0) {
                        if (~var11 == -2) {
                            class445.method2757(49, arg6, arg3 + 1, 2, arg4);
                        } else {
                            if (var11 != 2) {
                                if (var11 == 3) {
                                    class445.method2757(arg1 + 120, arg6, arg3, 2, arg4);
                                    return;
                                }
                            } else {
                                class445.method2757(76, arg6, arg3, 1, arg4 + 1);
                            }
                        }
                    } else {
                        class445.method2757(117, arg6, arg3, 1, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "([I[IB)V", line = 117)
    public static final void method1526(int[] arg0, int[] arg1, byte arg2) {
        ++field3333;
        if (arg2 < 41) {
            method1528((String) null, true, (byte) -62);
        }
        if (arg0 != null && arg1 != null) {
            class22.field235 = arg0;
            class153.field2478 = new int[arg0.length];
            class2.field24 = new byte[arg0.length][][];
            for (int var3 = 0; ~class22.field235.length < ~var3; ++var3) {
                class2.field24[var3] = new byte[arg1[var3]][];
            }
        } else {
            class153.field2478 = null;
            class2.field24 = null;
            class22.field235 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZLsca;)Ljava/lang/String;", line = 148)
    public static final String method1527(boolean arg0, class46 arg1) {
        ++field3329;
        if (!arg0) {
            return null;
        } else if (client.method1886(arg1).method1555(10061) == 0) {
            return null;
        } else if (arg1.field517 != null && ~arg1.field517.trim().length() != -1) {
            return arg1.field517;
        } else {
            return class501.field7119 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 175)
    public static final void method1528(String arg0, boolean arg1, byte arg2) {
        ++field3328;
        if (arg0 != null) {
            if (arg2 <= 51) {
                method1528((String) null, false, (byte) 9);
            }
            if (class569.field8065 >= 100) {
                class618.method3559(class430.field6409.method2679(class650.field9160, 87), false, 4);
            } else {
                String var3 = class712.method4064(-13, arg0);
                if (var3 != null) {
                    for (int var4 = 0; ~var4 > ~class569.field8065; ++var4) {
                        String var9 = class712.method4064(-13, class254.field3654[var4]);
                        if (var9 != null && var9.equals(var3)) {
                            class618.method3559(arg0 + class430.field6410.method2679(class650.field9160, -76), false, 4);
                            return;
                        }
                        if (class331.field4764[var4] != null) {
                            String var10 = class712.method4064(-13, class331.field4764[var4]);
                            if (var10 != null && var10.equals(var3)) {
                                class618.method3559(arg0 + class430.field6410.method2679(class650.field9160, -67), false, 4);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; class690.field9544 > var5; ++var5) {
                        String var7 = class712.method4064(-13, class133.field1790[var5]);
                        if (var7 != null && var7.equals(var3)) {
                            class618.method3559(class430.field6415.method2679(class650.field9160, -50) + arg0 + class430.field6416.method2679(class650.field9160, 80), false, 4);
                            return;
                        }
                        if (class71.field1003[var5] != null) {
                            String var8 = class712.method4064(-13, class71.field1003[var5]);
                            if (var8 != null && var8.equals(var3)) {
                                class618.method3559(class430.field6415.method2679(class650.field9160, 112) + arg0 + class430.field6416.method2679(class650.field9160, -97), false, 4);
                                return;
                            }
                        }
                    }
                    if (class712.method4064(-13, class130.field1749.field9513).equals(var3)) {
                        class618.method3559(class430.field6412.method2679(class650.field9160, -115), false, 4);
                    } else {
                        ++class253.field3642;
                        class468 var6 = class93.method734(class29.field284, class423.field6298, 8174);
                        var6.field6839.method3730(102, 1 + class574.method3322(arg0, 16383));
                        var6.field6839.method3692(122, arg0);
                        var6.field6839.method3730(114, !arg1 ? 0 : 1);
                        class120.method872((byte) 54, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "([Ltea;[BILha;IB)V", line = 275)
    public final void method1529(class240[] arg0, byte[] arg1, int arg2, class60 arg3, int arg4, byte arg5) {
        if (arg5 <= 98) {
            field3330 = null;
        }
        ++field3340;
        class645 var7 = new class645(arg1);
        int var8 = -1;
        while (true) {
            int var9 = var7.method3738((byte) 114);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method3728((byte) 88);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method3745(-6314);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg2 + var13;
                int var19 = var12 - -arg4;
                if (var18 > 0 && var19 > 0 && var18 < super.field140 + -1 && super.field138 - 1 > var19) {
                    class240 var20 = null;
                    if (!super.field122) {
                        int var21 = var14;
                        if (~(class60.field847[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg0[var21];
                        }
                    }
                    this.method1534(var14, var16, (byte) -119, var14, var18, var8, var17, -1, arg3, var19, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILha;Z)V", line = 353)
    public final void method1530(int arg0, class60 arg1, boolean arg2) {
        ++field3332;
        class208.method1402();
        if (!arg2) {
            if (super.field133 > 1) {
                for (int var4 = 0; ~super.field140 < ~var4; ++var4) {
                    for (int var5 = 0; super.field138 > var5; ++var5) {
                        if ((class60.field847[1][var4][var5] & 2) == 2) {
                            class551.method3214(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~var6 > ~super.field133; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field138; ++var7) {
                    for (int var8 = 0; ~super.field140 <= ~var8; ++var8) {
                        if ((4 & super.field119[var6][var8][var7]) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && ~(4 & super.field119[var6][var8][var11 + -1]) != -1 && -var11 + var12 < 10) {
                                --var11;
                            }
                            while (~super.field138 < ~var12 && ~(super.field119[var6][var8][var12 + 1] & 4) != -1 && -var11 + var12 < 10) {
                                ++var12;
                            }
                            label118: while (~var9 < -1 && -var9 + var10 < 10) {
                                for (int var13 = var11; var12 >= var13; ++var13) {
                                    if ((4 & super.field119[var6][var9 + -1][var13]) == 0) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (var10 < super.field140 && ~(-var9 + var10) > -11) {
                                for (int var14 = var11; var14 <= var12; ++var14) {
                                    if (~(4 & super.field119[var6][var10 - -1][var14]) == -1) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if ((-var9 + var10 + 1) * (-var11 + 1 + var12) >= 4) {
                                int var15 = super.field137[var6][var9][var11];
                                class471.method2848(var9 << 9, var11 << 9, -123, 4, var15, var15, var6, (var12 << 9) + 512, (var10 << 9) + 512);
                                for (int var16 = var9; ~var10 <= ~var16; ++var16) {
                                    for (int var17 = var11; var17 <= var12; ++var17) {
                                        super.field119[var6][var16][var17] = (byte) class493.method2943(super.field119[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class602.method3499(-16805);
        }
        super.field119 = null;
        if (arg0 < 73) {
            this.method1531(-110, -52, 97, (class645) null, -25, -53, -22, (int[]) null, 28, -87, (class60) null);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIILrg;III[IIILha;)V", line = 490)
    public final void method1531(int arg0, int arg1, int arg2, class645 arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, class60 arg10) {
        ++field3336;
        if (!super.field122) {
            boolean var12 = false;
            if (arg8 != 20235) {
                this.field3338 = 114;
            }
            if (arg7 != null) {
                arg7[0] = -1;
            }
            class511 var13 = null;
            int var14 = (7 & arg4) * 8;
            int var15 = (7 & arg2) * 8;
            while (true) {
                int var21;
                label241: do {
                    while (true) {
                        while (~arg3.field9084 > ~arg3.field9068.length) {
                            int var20 = arg3.method3745(-6314);
                            if (~var20 != -1) {
                                if (~var20 == -2) {
                                    var21 = arg3.method3745(-6314);
                                    continue label241;
                                }
                                if (var20 == 2) {
                                    if (var13 == null) {
                                        var13 = new class511();
                                    }
                                    var13.method3030(-24428, arg3);
                                } else if (var20 == 128) {
                                    if (arg7 != null) {
                                        arg7[0] = arg3.method3712((byte) -123);
                                        arg7[1] = arg3.method3756(65536);
                                        arg7[2] = arg3.method3756(class513.method3033(arg8, 85771));
                                        arg7[3] = arg3.method3756(65536);
                                        arg7[4] = arg3.method3712((byte) -5);
                                    } else {
                                        arg3.field9084 += 10;
                                    }
                                } else {
                                    if (~var20 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field124 == null) {
                                        super.field124 = new byte[4][][];
                                    }
                                    for (int var32 = 0; var32 < 4; ++var32) {
                                        byte var33 = arg3.method3743(true);
                                        if (var33 == 0 && super.field124[arg9] != null) {
                                            if (~arg6 <= ~var32) {
                                                int var34 = arg5;
                                                int var35 = arg5 + 7;
                                                int var36 = arg0;
                                                if (~arg0 > -1) {
                                                    var36 = 0;
                                                } else if (~super.field138 >= ~arg0) {
                                                    var36 = super.field138;
                                                }
                                                int var37 = arg0 - -7;
                                                if (arg5 >= 0) {
                                                    if (arg5 >= super.field140) {
                                                        var34 = super.field140;
                                                    }
                                                } else {
                                                    var34 = 0;
                                                }
                                                if (var35 < 0) {
                                                    var35 = 0;
                                                } else if (var35 >= super.field140) {
                                                    var35 = super.field140;
                                                }
                                                if (var37 < 0) {
                                                    var37 = 0;
                                                } else if (super.field138 <= var37) {
                                                    var37 = super.field138;
                                                }
                                                while (var35 > var34) {
                                                    while (var37 > var36) {
                                                        super.field124[arg9][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field124[arg9] == null) {
                                                super.field124[arg9] = new byte[super.field140 + 1][super.field138 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg3.method3743(true);
                                                    if (var32 <= arg6) {
                                                        for (int var41 = var38; ~(var38 - -4) < ~var41; ++var41) {
                                                            for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                                if (var14 <= var41 && ~(var14 + 8) < ~var41 && ~var42 <= ~var15 && var15 + 8 > var15) {
                                                                    int var43 = class575.method3333(arg1, var41 & 7, var42 & 7, -29237) + arg5;
                                                                    int var44 = class445.method2758(var41 & 7, var42 & 7, arg1, 7) + arg0;
                                                                    if (var43 >= 0 && ~var43 > ~super.field140 && ~var44 <= -1 && ~var44 > ~super.field138) {
                                                                        super.field124[arg9][var43][var44] = var40;
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
                                var13 = new class511(arg3);
                            }
                        }
                        if (var13 != null) {
                            class239.method1584(arg0 >> 3, -11, arg5 >> 3, var13);
                        }
                        if (!var12 && super.field124 != null && super.field124[arg9] != null) {
                            int var16 = arg5 + 7;
                            int var17 = arg0 + 7;
                            for (int var18 = arg5; var18 < var16; ++var18) {
                                for (int var19 = arg0; ~var19 > ~var17; ++var19) {
                                    super.field124[arg9][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; ~var21 < ~var22; ++var22) {
                    class14 var23 = new class14(arg10, arg3, 2);
                    if (var23.field197 == 31) {
                        class359 var24 = class196.field2977.method692(-91, arg3.method3712((byte) 15));
                        var23.method91(false, var24.field5213, var24.field5211, var24.field5214, var24.field5209);
                    }
                    if (~arg10.method433() < -1) {
                        class609 var25 = var23.field199;
                        int var26 = var25.method3533(false) >> 9;
                        int var27 = var25.method3531(arg8 ^ 8062) >> 9;
                        if (var23.field184 == arg6 && var26 >= var14 && ~var26 > ~(var14 - -8) && var15 <= var27 && ~var27 > ~(var15 - -8)) {
                            int var28 = (arg5 << 9) + class335.method2110(var25.method3531(arg8 + 362) & 4095, arg1, var25.method3533(false) & 4095, -30732);
                            int var29 = class76.method630(10243, 4095 & var25.method3533(false), arg1, 4095 & var25.method3531(20597)) + (arg0 << 9);
                            int var30 = var28 >> 9;
                            int var31 = var29 >> 9;
                            if (var30 >= 0 && var31 >= 0 && super.field140 > var30 && var31 < super.field138) {
                                var25.method881(var28, var29, super.field137[arg6][var30][var31] + -var25.method3536(24108), true);
                                class501.method2981(var23);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lha;IBILrg;[I)V", line = 780)
    public final void method1532(class60 arg0, int arg1, byte arg2, int arg3, class645 arg4, int[] arg5) {
        ++field3334;
        if (arg2 >= -115) {
            this.method1535(-124, 31, (byte[]) null, -74, -106, 17, 108, true, (class240[]) null, (class60) null, -29);
        }
        if (!super.field122) {
            boolean var7 = false;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            class511 var8 = null;
            while (true) {
                while (~arg4.field9084 > ~arg4.field9068.length) {
                    int var18 = arg4.method3745(-6314);
                    if (~var18 == -1) {
                        var8 = new class511(arg4);
                    } else if (~var18 == -2) {
                        int var19 = arg4.method3745(-6314);
                        if (~var19 < -1) {
                            for (int var20 = 0; var20 < var19; ++var20) {
                                class14 var21 = new class14(arg0, arg4, 2);
                                if (var21.field197 == 31) {
                                    class359 var22 = class196.field2977.method692(-83, arg4.method3712((byte) -117));
                                    var21.method91(false, var22.field5213, var22.field5211, var22.field5214, var22.field5209);
                                }
                                if (~arg0.method433() < -1) {
                                    class609 var23 = var21.field199;
                                    int var24 = var23.method3533(false) + (arg3 << 9);
                                    int var25 = (arg1 << 9) + var23.method3531(20597);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (~var26 <= -1 && var27 >= 0 && ~var26 > ~super.field140 && ~var27 > ~super.field138) {
                                        var23.method881(var24, var25, super.field137[var21.field184][var26][var27] - var23.method3536(24108), true);
                                        class501.method2981(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class511();
                        }
                        var8.method3030(-24428, arg4);
                    } else if (var18 == 128) {
                        if (arg5 != null) {
                            arg5[0] = arg4.method3712((byte) 3);
                            arg5[1] = arg4.method3756(65536);
                            arg5[2] = arg4.method3756(65536);
                            arg5[3] = arg4.method3756(65536);
                            arg5[4] = arg4.method3712((byte) -108);
                        } else {
                            arg4.field9084 += 10;
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field124 == null) {
                            super.field124 = new byte[4][][];
                        }
                        for (int var28 = 0; var28 < 4; ++var28) {
                            byte var29 = arg4.method3743(true);
                            if (var29 == 0 && super.field124[var28] != null) {
                                int var30 = arg3;
                                int var31 = arg3 + 64;
                                int var32 = arg1;
                                if (var31 < 0) {
                                    var31 = 0;
                                } else if (var31 >= super.field140) {
                                    var31 = super.field140;
                                }
                                if (arg1 < 0) {
                                    var32 = 0;
                                } else if (super.field138 <= arg1) {
                                    var32 = super.field138;
                                }
                                if (arg3 >= 0) {
                                    if (super.field140 <= arg3) {
                                        var30 = super.field140;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                int var33 = arg1 - -64;
                                if (~var33 > -1) {
                                    var33 = 0;
                                } else if (super.field138 <= var33) {
                                    var33 = super.field138;
                                }
                                while (var30 < var31) {
                                    while (var32 < var33) {
                                        super.field124[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (var29 == 1) {
                                if (super.field124[var28] == null) {
                                    super.field124[var28] = new byte[super.field140 + 1][super.field138 - -1];
                                }
                                for (int var34 = 0; var34 < 64; var34 += 4) {
                                    for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                        byte var36 = arg4.method3743(true);
                                        for (int var37 = arg3 + var34; ~var37 > ~(var34 + 4 - -arg3); ++var37) {
                                            for (int var38 = var35 - -arg1; arg1 + var35 + 4 > var38; ++var38) {
                                                if (~var37 <= -1 && ~super.field140 < ~var37 && ~var38 <= -1 && ~var38 > ~super.field138) {
                                                    super.field124[var28][var37][var38] = var36;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (var29 == 2) {
                                if (super.field124[var28] == null) {
                                    super.field124[var28] = new byte[super.field140 + 1][super.field138 + 1];
                                }
                                if (var28 > 0) {
                                    int var39 = arg3;
                                    int var40 = arg3 + 64;
                                    int var41 = arg1;
                                    if (~arg3 > -1) {
                                        var39 = 0;
                                    } else if (~super.field140 >= ~arg3) {
                                        var39 = super.field140;
                                    }
                                    if (~var40 <= -1) {
                                        if (super.field140 <= var40) {
                                            var40 = super.field140;
                                        }
                                    } else {
                                        var40 = 0;
                                    }
                                    if (arg1 < 0) {
                                        var41 = 0;
                                    } else if (super.field138 <= arg1) {
                                        var41 = super.field138;
                                    }
                                    int var42 = arg1 - -64;
                                    if (var42 < 0) {
                                        var42 = 0;
                                    } else if (super.field138 <= var42) {
                                        var42 = super.field138;
                                    }
                                    while (var39 < var40) {
                                        while (var42 > var41) {
                                            super.field124[var28][var39][var41] = super.field124[var28 + -1][var39][var41];
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
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg3 >> 3) + var9;
                            int var12 = (arg1 >> 3) + var10;
                            if (var11 >= 0 && super.field140 >> 3 > var11 && var12 >= 0 && ~var12 > ~(super.field138 >> 3)) {
                                class239.method1584(var12, -11, var11, var8);
                            }
                        }
                    }
                }
                if (!var7 && super.field124 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field124[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; var15 < 16; ++var15) {
                                    int var16 = (arg3 >> 2) + var14;
                                    int var17 = (arg1 >> 2) + var15;
                                    if (~var16 <= -1 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                        super.field124[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(IIIZ)V", line = 1145)
    public class227(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class276.field3915, class257.field3690);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZII)Ljn;", line = 1151)
    public final class721 method1533(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field3331;
        class721 var6 = null;
        if (arg0 == 0) {
            var6 = (class721) class608.method3529(arg4, arg3, arg1);
        }
        if (~arg0 == -2) {
            var6 = (class721) class245.method1634(arg4, arg3, arg1);
        }
        if (~arg0 == -3) {
            var6 = (class721) class755.method4208(arg4, arg3, arg1, field3341 != null ? field3341 : (field3341 = method1536("jn")));
        }
        if (arg2) {
            this.field3338 = -99;
        }
        if (~arg0 == -4) {
            var6 = (class721) class577.method3340(arg4, arg3, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIBIIIIILha;ILtea;)V", line = 1178)
    public final void method1534(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8, int arg9, class240 arg10) {
        ++field3337;
        if (class63.field916.field10204.method368(17503) != 0 || class46.method350(class700.field9654, 25380, arg9, arg0, arg4)) {
            if (arg3 < this.field3338) {
                this.field3338 = arg3;
            }
            class211 var12 = class239.field3470.method388(arg5, 100);
            if (~class63.field916.field10162.method4009(17503) != -1 || !var12.field3150) {
                int var13;
                int var14;
                if (~arg6 != -2 && arg6 != 3) {
                    var13 = var12.field3164;
                    var14 = var12.field3152;
                } else {
                    var14 = var12.field3164;
                    var13 = var12.field3152;
                }
                int var15;
                int var16;
                if (arg4 - -var13 <= super.field140) {
                    var15 = (var13 - -1 >> 1) + arg4;
                    var16 = (var13 >> 1) + arg4;
                } else {
                    var16 = arg4;
                    var15 = arg4 + 1;
                }
                int var17;
                int var18;
                if (~(arg9 + var14) >= ~super.field138) {
                    var17 = arg9 - -(var14 + 1 >> 1);
                    var18 = arg9 - -(var14 >> 1);
                } else {
                    var17 = arg9 + 1;
                    var18 = arg9;
                }
                class280 var19 = class582.field8287[arg0];
                int var20 = var19.method1787(var16, 19646, var18) + var19.method1787(var15, 19646, var18) + var19.method1787(var16, 19646, var17) + var19.method1787(var15, 19646, var17) >> 2;
                int var21 = (arg4 << 9) + (var13 << 8);
                int var22 = (arg9 << 9) - -(var14 << 8);
                boolean var23 = class581.field8252 && !super.field122 && var12.field3090;
                if (var12.method1439(-26530)) {
                    class447.method2762((class689) null, arg4, arg9, arg6, (class282) null, arg3, var12, 1);
                }
                boolean var24 = ~arg7 == 0 && var12.field3092 == -1 && var12.field3176 == null && var12.field3172 == null && !var12.field3111 && !var12.field3102;
                if (!class282.field4004 || (!class56.method395(arg1, -10) || ~var12.field3100 == -2) && (!class328.method2076(arg1, (byte) -121) || var12.field3100 != 0)) {
                    if (~arg1 == -23) {
                        if (~class63.field916.field10193.method2446(17503) != -1 || var12.field3113 != 0 || var12.field3145 == 1 || var12.field3151) {
                            class343 var25;
                            if (!var24) {
                                var25 = new class745(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg6, arg7);
                            } else {
                                class267 var26 = new class267(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg6, var23);
                                if (var26.method321((byte) -126)) {
                                    var26.method318(83, arg8);
                                }
                                var25 = var26;
                            }
                            class148.method1028(arg3, arg4, arg9, var25);
                            if (~var12.field3145 == -2 && arg10 != null) {
                                arg10.method1597(arg4, -21, arg9);
                            }
                        }
                    } else if (arg1 != 10 && ~arg1 != -12) {
                        if (~arg1 <= -13 && ~arg1 >= -18 || arg1 >= 18 && arg1 <= 21) {
                            class119 var28;
                            if (var24) {
                                class383 var27 = new class383(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg4, arg4 + var13 + -1, arg9, var14 + -1 + arg9, arg1, arg6, var23);
                                var28 = var27;
                                if (var27.method321((byte) -128)) {
                                    var27.method318(105, arg8);
                                }
                            } else {
                                var28 = new class734(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg4, var13 + -1 + arg4, arg9, var14 + -1 + arg9, arg1, arg6, arg7);
                            }
                            class9.method57(var28, false);
                            if (class581.field8252 && !super.field122 && ~arg1 <= -13 && ~arg1 >= -18 && ~arg1 != -14 && arg3 > 0 && var12.field3100 != 0) {
                                super.field119[arg3][arg4][arg9] = (byte) class625.method3600(super.field119[arg3][arg4][arg9], 4);
                            }
                            if (var12.field3145 != 0 && arg10 != null) {
                                arg10.method1589(var12.field3178, arg4, var13, arg9, var14, !var12.field3174, -115);
                            }
                        } else if (~arg1 == -1) {
                            int var29 = var12.field3100;
                            if (class639.field8979 && var12.field3100 == -1) {
                                var29 = 1;
                            }
                            class12 var31;
                            if (var24) {
                                class631 var30 = new class631(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, arg6, var23);
                                if (var30.method321((byte) -128)) {
                                    var30.method318(-94, arg8);
                                }
                                var31 = var30;
                            } else {
                                var31 = new class507(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, arg6, arg7);
                            }
                            class332.method2096(arg3, arg4, arg9, var31, (class12) null);
                            if (~arg6 != -1) {
                                if (~arg6 == -2) {
                                    if (class581.field8252 && var12.field3177) {
                                        var19.method973(arg4, arg9 - -1, 50);
                                        var19.method973(arg4 - -1, arg9 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field122) {
                                        class35.method178(117, arg3, var12.field3167, arg9 + 1, 2, arg4, -var12.field3087);
                                    }
                                } else if (~arg6 != -3) {
                                    if (~arg6 == -4) {
                                        if (class581.field8252 && var12.field3177) {
                                            var19.method973(arg4, arg9, 50);
                                            var19.method973(arg4 + 1, arg9, 50);
                                        }
                                        if (var29 == 1 && !super.field122) {
                                            class35.method178(68, arg3, var12.field3167, arg9, 2, arg4, var12.field3087);
                                        }
                                    }
                                } else {
                                    if (class581.field8252 && var12.field3177) {
                                        var19.method973(arg4 + 1, arg9, 50);
                                        var19.method973(arg4 + 1, arg9 - -1, 50);
                                    }
                                    if (var29 == 1 && !super.field122) {
                                        class35.method178(126, arg3, var12.field3167, arg9, 1, arg4 + 1, -var12.field3087);
                                    }
                                }
                            } else {
                                if (class581.field8252 && var12.field3177) {
                                    var19.method973(arg4, arg9, 50);
                                    var19.method973(arg4, arg9 + 1, 50);
                                }
                                if (var29 == 1 && !super.field122) {
                                    class35.method178(116, arg3, var12.field3167, arg9, 1, arg4, var12.field3087);
                                }
                            }
                            if (~var12.field3145 != -1 && arg10 != null) {
                                arg10.method1605(arg4, 6437, arg1, !var12.field3174, arg9, var12.field3178, arg6);
                            }
                            if (var12.field3128 != 64) {
                                class110.method821(arg3, arg4, arg9, var12.field3128);
                            }
                        } else if (arg1 == 1) {
                            class12 var33;
                            if (var24) {
                                class631 var32 = new class631(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, arg6, var23);
                                if (var32.method321((byte) -128)) {
                                    var32.method318(119, arg8);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class507(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, arg6, arg7);
                            }
                            class332.method2096(arg3, arg4, arg9, var33, (class12) null);
                            if (var12.field3177 && class581.field8252) {
                                if (arg6 != 0) {
                                    if (~arg6 != -2) {
                                        if (arg6 == 2) {
                                            var19.method973(arg4 - -1, arg9, 50);
                                        } else if (~arg6 == -4) {
                                            var19.method973(arg4, arg9, 50);
                                        }
                                    } else {
                                        var19.method973(arg4 + 1, arg9 + 1, 50);
                                    }
                                } else {
                                    var19.method973(arg4, arg9 - -1, 50);
                                }
                            }
                            if (~var12.field3145 != -1 && arg10 != null) {
                                arg10.method1605(arg4, 6437, arg1, !var12.field3174, arg9, var12.field3178, arg6);
                            }
                        } else if (~arg1 == -3) {
                            int var34 = 3 & arg6 - -1;
                            class12 var37;
                            class12 var38;
                            if (var24) {
                                class631 var35 = new class631(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, arg6 + 4, var23);
                                class631 var36 = new class631(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, var34, var23);
                                if (var35.method321((byte) -128)) {
                                    var35.method318(86, arg8);
                                }
                                var37 = var35;
                                if (var36.method321((byte) -127)) {
                                    var36.method318(-64, arg8);
                                }
                                var38 = var36;
                            } else {
                                var37 = new class507(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, arg6 + 4, arg7);
                                var38 = new class507(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, var34, arg7);
                            }
                            class332.method2096(arg3, arg4, arg9, var37, var38);
                            if ((var12.field3100 == 1 || class639.field8979 && var12.field3100 == -1) && !super.field122) {
                                if (arg6 != 0) {
                                    if (~arg6 == -2) {
                                        class35.method178(27, arg3, var12.field3167, arg9, 1, arg4 + 1, var12.field3087);
                                        class35.method178(77, arg3, var12.field3167, arg9 + 1, 2, arg4, var12.field3087);
                                    } else if (arg6 != 2) {
                                        if (arg6 == 3) {
                                            class35.method178(59, arg3, var12.field3167, arg9, 1, arg4, var12.field3087);
                                            class35.method178(37, arg3, var12.field3167, arg9, 2, arg4, var12.field3087);
                                        }
                                    } else {
                                        class35.method178(78, arg3, var12.field3167, arg9, 1, arg4 - -1, var12.field3087);
                                        class35.method178(101, arg3, var12.field3167, arg9, 2, arg4, var12.field3087);
                                    }
                                } else {
                                    class35.method178(86, arg3, var12.field3167, arg9, 1, arg4, var12.field3087);
                                    class35.method178(101, arg3, var12.field3167, arg9 + 1, 2, arg4, var12.field3087);
                                }
                            }
                            if (~var12.field3145 != -1 && arg10 != null) {
                                arg10.method1605(arg4, 6437, arg1, !var12.field3174, arg9, var12.field3178, arg6);
                            }
                            if (~var12.field3128 != -65) {
                                class110.method821(arg3, arg4, arg9, var12.field3128);
                            }
                        } else if (arg1 == 3) {
                            class12 var40;
                            if (var24) {
                                class631 var39 = new class631(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, arg6, var23);
                                var40 = var39;
                                if (var39.method321((byte) -126)) {
                                    var39.method318(112, arg8);
                                }
                            } else {
                                var40 = new class507(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg1, arg6, arg7);
                            }
                            class332.method2096(arg3, arg4, arg9, var40, (class12) null);
                            if (var12.field3177 && class581.field8252) {
                                if (~arg6 != -1) {
                                    if (~arg6 == -2) {
                                        var19.method973(arg4 + 1, arg9 - -1, 50);
                                    } else if (~arg6 != -3) {
                                        if (arg6 == 3) {
                                            var19.method973(arg4, arg9, 50);
                                        }
                                    } else {
                                        var19.method973(arg4 + 1, arg9, 50);
                                    }
                                } else {
                                    var19.method973(arg4, arg9 - -1, 50);
                                }
                            }
                            if (var12.field3145 != 0 && arg10 != null) {
                                arg10.method1605(arg4, 6437, arg1, !var12.field3174, arg9, var12.field3178, arg6);
                            }
                        } else if (arg1 == 9) {
                            class119 var41;
                            if (!var24) {
                                var41 = new class734(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg4, arg4 + var13 - 1, arg9, arg9 + var14 + -1, arg1, arg6, arg7);
                            } else {
                                class383 var42 = new class383(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg4, arg4, arg9, arg9, arg1, arg6, var23);
                                var41 = var42;
                                if (var42.method321((byte) -128)) {
                                    var42.method318(-107, arg8);
                                }
                            }
                            class9.method57(var41, false);
                            if (~var12.field3100 == -2 && !super.field122) {
                                byte var43;
                                if (~(arg6 & 1) == -1) {
                                    var43 = 8;
                                } else {
                                    var43 = 16;
                                }
                                class35.method178(92, arg3, var12.field3167, arg9, var43, arg4, 0);
                            }
                            if (~var12.field3145 != -1 && arg10 != null) {
                                arg10.method1589(var12.field3178, arg4, var13, arg9, var14, !var12.field3174, -93);
                            }
                            if (~var12.field3128 != -65) {
                                class110.method821(arg3, arg4, arg9, var12.field3128);
                            }
                        } else if (arg1 == 4) {
                            class665 var44;
                            if (!var24) {
                                var44 = new class78(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, 0, 0, arg1, arg6, arg7);
                            } else {
                                class45 var45 = new class45(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, 0, 0, arg1, arg6);
                                var44 = var45;
                                if (var45.method321((byte) -126)) {
                                    var45.method318(-95, arg8);
                                }
                            }
                            class304.method1923(arg3, arg4, arg9, var44, (class665) null);
                        } else if (arg1 == 5) {
                            int var46 = 65;
                            class721 var47 = (class721) class608.method3529(arg3, arg4, arg9);
                            if (var47 != null) {
                                var46 = class239.field3470.method388(var47.method317(124), 100).field3128 - -1;
                            }
                            class665 var49;
                            if (var24) {
                                class45 var48 = new class45(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, class262.field3719[arg6] * var46, class739.field10366[arg6] * var46, arg1, arg6);
                                if (var48.method321((byte) -127)) {
                                    var48.method318(-114, arg8);
                                }
                                var49 = var48;
                            } else {
                                var49 = new class78(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, class262.field3719[arg6] * var46, class739.field10366[arg6] * var46, arg1, arg6, arg7);
                            }
                            class304.method1923(arg3, arg4, arg9, var49, (class665) null);
                        } else if (arg2 < -118) {
                            if (~arg1 == -7) {
                                int var50 = 33;
                                class721 var51 = (class721) class608.method3529(arg3, arg4, arg9);
                                if (var51 != null) {
                                    var50 = 1 + class239.field3470.method388(var51.method317(118), 100).field3128 / 2;
                                }
                                class665 var52;
                                if (!var24) {
                                    var52 = new class78(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, class679.field9435[arg6] * var50, class593.field8419[arg6] * var50, arg1, arg6 + 4, arg7);
                                } else {
                                    class45 var53 = new class45(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, class262.field3719[arg6] * var50, class739.field10366[arg6] * var50, arg1, arg6 - -4);
                                    var52 = var53;
                                    if (var53.method321((byte) -128)) {
                                        var53.method318(109, arg8);
                                    }
                                }
                                class304.method1923(arg3, arg4, arg9, var52, (class665) null);
                            } else if (~arg1 == -8) {
                                int var54 = 3 & arg6 - -2;
                                class665 var56;
                                if (var24) {
                                    class45 var55 = new class45(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, 0, 0, arg1, var54 - -4);
                                    var56 = var55;
                                    if (var55.method321((byte) -126)) {
                                        var55.method318(108, arg8);
                                    }
                                } else {
                                    var56 = new class78(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, 0, 0, arg1, var54 - -4, arg7);
                                }
                                class304.method1923(arg3, arg4, arg9, var56, (class665) null);
                            } else if (arg1 == 8) {
                                int var57 = arg6 + 2 & 3;
                                int var58 = 33;
                                class721 var59 = (class721) class608.method3529(arg3, arg4, arg9);
                                if (var59 != null) {
                                    var58 = class239.field3470.method388(var59.method317(117), 100).field3128 / 2 - -1;
                                }
                                class665 var62;
                                class665 var63;
                                if (!var24) {
                                    class78 var60 = new class78(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, class679.field9435[arg6] * var58, class593.field8419[arg6] * var58, arg1, arg6 + 4, arg7);
                                    class78 var61 = new class78(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, 0, 0, arg1, var57 + 4, arg7);
                                    var62 = var60;
                                    var63 = var61;
                                } else {
                                    class45 var64 = new class45(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, class679.field9435[arg6] * var58, class593.field8419[arg6] * var58, arg1, arg6 - -4);
                                    class45 var65 = new class45(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, 0, 0, arg1, var57 + 4);
                                    if (var64.method321((byte) -128)) {
                                        var64.method318(-105, arg8);
                                    }
                                    var62 = var64;
                                    if (var65.method321((byte) -127)) {
                                        var65.method318(-65, arg8);
                                    }
                                    var63 = var65;
                                }
                                class304.method1923(arg3, arg4, arg9, var62, var63);
                            }
                        }
                    } else {
                        class383 var66 = null;
                        class119 var68;
                        int var69;
                        if (var24) {
                            class383 var67 = new class383(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg4, arg4 + var13 + -1, arg9, arg9 + -1 - -var14, arg1, arg6, var23);
                            var68 = var67;
                            var66 = var67;
                            var69 = var67.method2463(65536);
                        } else {
                            var68 = new class734(arg8, var12, arg3, arg0, var21, var20, var22, super.field122, arg4, var13 + -1 + arg4, arg9, arg9 + -1 - -var14, arg1, arg6, arg7);
                            var69 = 15;
                        }
                        if (class9.method57(var68, false)) {
                            if (var66 != null && var66.method321((byte) -128)) {
                                var66.method318(-117, arg8);
                            }
                            if (var12.field3177 && class581.field8252) {
                                if (~var69 < -31) {
                                    var69 = 30;
                                }
                                for (int var70 = 0; var13 >= var70; ++var70) {
                                    for (int var71 = 0; var71 <= var14; ++var71) {
                                        var19.method973(arg4 + var70, arg9 + var71, var69);
                                    }
                                }
                            }
                        }
                        if (var12.field3145 != 0 && arg10 != null) {
                            arg10.method1589(var12.field3178, arg4, var13, arg9, var14, !var12.field3174, 31);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II[BIIIIZ[Ltea;Lha;I)V", line = 1810)
    public final void method1535(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class240[] arg8, class60 arg9, int arg10) {
        ++field3339;
        class645 var12 = new class645(arg2);
        if (arg7) {
            this.method1535(63, 53, (byte[]) null, -121, -92, 89, 80, true, (class240[]) null, (class60) null, -97);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method3738((byte) 114);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method3728((byte) 88);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = (var15 & 4068) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method3745(-6314);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg5 == var19 && ~var18 <= ~arg10 && ~var18 > ~(arg10 + 8) && arg4 <= var17 && var17 < arg4 + 8) {
                    class211 var23 = class239.field3470.method388(var13, 100);
                    int var24 = class608.method3530(var22, var18 & 7, var23.field3164, arg6, (byte) 51, var23.field3152, var17 & 7) + arg0;
                    int var25 = class598.method3479(7, var23.field3152, arg6, var22, var23.field3164, var18 & 7, 7 & var17) + arg3;
                    if (var24 > 0 && ~var25 < -1 && var24 < super.field140 - 1 && super.field138 + -1 > var25) {
                        class240 var26 = null;
                        if (!super.field122) {
                            int var27 = arg1;
                            if ((2 & class60.field847[1][var24][var25]) == 2) {
                                var27 = arg1 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg8[var27];
                            }
                        }
                        this.method1534(arg1, var21, (byte) -126, arg1, var24, var13, 3 & var22 - -arg6, -1, arg9, var25, var26);
                    }
                }
            }
        }
    }
}
