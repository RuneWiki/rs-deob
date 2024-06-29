import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class207 extends class410 {

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public int field2741 = 99;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Lfh;")
    public static class653 field2744 = new class653();

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "Ltba;")
    public static class165 field2745 = new class165(64);

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field2748 = new String[200];

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field2747;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field2749;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1343(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLria;)V", line = 3)
    public static final void method1332(byte arg0, class288 arg1) {
        if (arg0 < -79) {
            if (class446.field5930 == arg1.field3639) {
                class559.field7782[arg1.field3667] = true;
            }
            ++field2743;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lha;[IIIIIIIILsl;I)V", line = 19)
    public final void method1333(class60 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class461 arg9, int arg10) {
        ++field2733;
        if (!super.field5215) {
            boolean var12 = false;
            class210 var13 = null;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            int var14 = (arg2 & 7) * 8;
            if (arg10 <= 120) {
                field2745 = null;
            }
            int var15 = (arg4 & 7) * 8;
            while (true) {
                int var21;
                label242: do {
                    while (true) {
                        while (arg9.field6180.length > arg9.field6193) {
                            int var20 = arg9.method2600((byte) -125);
                            if (~var20 != -1) {
                                if (var20 == 1) {
                                    var21 = arg9.method2600((byte) -125);
                                    continue label242;
                                }
                                if (var20 == 2) {
                                    if (var13 == null) {
                                        var13 = new class210();
                                    }
                                    var13.method1353(8, arg9);
                                } else if (var20 == 128) {
                                    if (arg1 == null) {
                                        arg9.field6193 += 10;
                                    } else {
                                        arg1[0] = arg9.method2566(-2);
                                        arg1[1] = arg9.method2577(2);
                                        arg1[2] = arg9.method2577(2);
                                        arg1[3] = arg9.method2577(2);
                                        arg1[4] = arg9.method2566(-2);
                                    }
                                } else {
                                    if (var20 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field5200 == null) {
                                        super.field5200 = new byte[4][][];
                                    }
                                    for (int var32 = 0; ~var32 > -5; ++var32) {
                                        byte var33 = arg9.method2601(0);
                                        if (~var33 == -1 && super.field5200[arg7] != null) {
                                            if (arg5 >= var32) {
                                                int var34 = arg6;
                                                int var35 = arg6 + 7;
                                                int var36 = arg8;
                                                if (arg8 < 0) {
                                                    var36 = 0;
                                                } else if (~arg8 <= ~super.field5214) {
                                                    var36 = super.field5214;
                                                }
                                                if (arg6 >= 0) {
                                                    if (arg6 >= super.field5203) {
                                                        var34 = super.field5203;
                                                    }
                                                } else {
                                                    var34 = 0;
                                                }
                                                if (~var35 <= -1) {
                                                    if (~var35 <= ~super.field5203) {
                                                        var35 = super.field5203;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                int var37 = arg8 + 7;
                                                if (var37 < 0) {
                                                    var37 = 0;
                                                } else if (~var37 <= ~super.field5214) {
                                                    var37 = super.field5214;
                                                }
                                                while (var34 < var35) {
                                                    while (var37 > var36) {
                                                        super.field5200[arg7][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field5200[arg7] == null) {
                                                super.field5200[arg7] = new byte[super.field5203 + 1][super.field5214 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg9.method2601(0);
                                                    if (arg5 >= var32) {
                                                        for (int var41 = var38; ~(var38 + 4) < ~var41; ++var41) {
                                                            for (int var42 = var39; var42 < var39 - -4; ++var42) {
                                                                if (var41 >= var14 && var41 < var14 - -8 && ~var42 <= ~var15 && ~(var15 + 8) < ~var15) {
                                                                    int var43 = class661.method3719(7 & var42, (byte) -122, var41 & 7, arg3) + arg6;
                                                                    int var44 = arg8 - -class597.method3391(93, 7 & var41, arg3, var42 & 7);
                                                                    if (~var43 <= -1 && super.field5203 > var43 && ~var44 <= -1 && var44 < super.field5214) {
                                                                        super.field5200[arg7][var43][var44] = var40;
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
                                var13 = new class210(arg9);
                            }
                        }
                        if (var13 != null) {
                            class508.method2965(6, arg6 >> 3, arg8 >> 3, var13);
                        }
                        if (!var12 && super.field5200 != null && super.field5200[arg7] != null) {
                            int var16 = arg6 + 7;
                            int var17 = arg8 + 7;
                            for (int var18 = arg6; ~var16 < ~var18; ++var18) {
                                for (int var19 = arg8; ~var17 < ~var19; ++var19) {
                                    super.field5200[arg7][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; ~var21 < ~var22; ++var22) {
                    class667 var23 = new class667(arg0, arg9, 2);
                    if (var23.field9380 == 31) {
                        class471 var24 = class12.field150.method619(arg9.method2566(-2), 256);
                        var23.method3755(var24.field6314, var24.field6317, var24.field6323, var24.field6318, -19781);
                    }
                    if (~arg0.method436() < -1) {
                        class123 var25 = var23.field9381;
                        int var26 = var25.method932(-16562) >> 9;
                        int var27 = var25.method938(0) >> 9;
                        if (var23.field9375 == arg5 && ~var14 >= ~var26 && var14 + 8 > var26 && ~var15 >= ~var27 && var15 - -8 > var27) {
                            int var28 = (arg6 << 9) + class118.method913(4095 & var25.method932(-16562), arg3, 19, var25.method938(0) & 4095);
                            int var29 = (arg8 << 9) + class471.method2683(-1, arg3, 4095 & var25.method938(0), var25.method932(-16562) & 4095);
                            int var30 = var28 >> 9;
                            int var31 = var29 >> 9;
                            if (var30 >= 0 && var31 >= 0 && super.field5203 > var30 && var31 < super.field5214) {
                                var25.method936(super.field5224[arg5][var30][var31] + -var25.method937(113), var29, (byte) 59, var28);
                                class21.method135(var23);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBLha;Lje;I)V", line = 320)
    public final void method1334(int arg0, int arg1, int arg2, byte arg3, class60 arg4, class405 arg5, int arg6) {
        ++field2735;
        class457 var8 = this.method1336((byte) -3, arg1, arg0, arg6, arg2);
        if (var8 != null) {
            class543 var9 = client.field3995.method3384(var8.method745((byte) -104), false);
            int var10 = var8.method758(true);
            int var11 = var8.method743(-30968);
            if (var9.method3114(-19127)) {
                class713.method3982((byte) 94, arg1, arg2, var9, arg6);
            }
            if (var8.method756(-95)) {
                var8.method760(-31507, arg4);
            }
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    class4.method21(arg2, arg6, arg1);
                } else if (~arg0 == -3) {
                    class193.method1287(arg2, arg6, arg1, field2749 != null ? field2749 : (field2749 = method1343("rca")));
                    if (~var9.field7580 != -1 && ~(var9.field7520 + arg6) > ~super.field5203 && var9.field7520 + arg1 < super.field5214 && ~super.field5203 < ~(var9.field7534 + arg6) && super.field5214 > var9.field7534 + arg1) {
                        arg5.method2257(var9.field7520, arg1, var11, !var9.field7521, false, var9.field7548, arg6, var9.field7534);
                    }
                    if (var10 == 9) {
                        if ((1 & var11) == 0) {
                            class598.method3394(arg2, 8, arg6, 126, arg1);
                        } else {
                            class598.method3394(arg2, 16, arg6, 126, arg1);
                        }
                    }
                } else if (arg0 == 3) {
                    class741.method4130(arg2, arg6, arg1);
                    if (var9.field7580 == 1) {
                        arg5.method2260(arg6, arg1, 128);
                    }
                }
            } else {
                class555.method3207(arg2, arg6, arg1);
                if (var9.field7580 != 0) {
                    arg5.method2252(var11, -1, arg1, !var9.field7521, arg6, var10, var9.field7548);
                }
                if (~var9.field7551 == -2) {
                    if (~var11 == -1) {
                        class598.method3394(arg2, 1, arg6, 126, arg1);
                    } else if (~var11 != -2) {
                        if (~var11 == -3) {
                            class598.method3394(arg2, 1, arg6 + 1, 126, arg1);
                        } else if (~var11 == -4) {
                            class598.method3394(arg2, 2, arg6, 126, arg1);
                        }
                    } else {
                        class598.method3394(arg2, 2, arg6, 126, arg1 - -1);
                    }
                }
            }
        }
        if (arg3 > -95) {
            field2747 = -10;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V", line = 417)
    public static final void method1335(int arg0, int arg1) {
        class622.field8563 = arg1;
        ++field2734;
        class468.field6275 = 2;
        long var2 = 0L;
        if (arg0 <= -111) {
            if (class318.field4114 == null) {
                class526.method3044(-1, 35);
            } else {
                class461 var4 = new class461(class643.method3607(3, class26.method178(class318.field4114, 70)));
                long var5 = var4.method2613((byte) -62);
                class1.field5 = var4.method2613((byte) -75);
                class4.method20(true, 1, "", class532.method3056(3, var5));
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIZ)V", line = 445)
    public class207(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class732.field10185, class206.field2728);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BIIII)Lrca;", line = 449)
    public final class457 method1336(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2737;
        class457 var6 = null;
        if (~arg2 == -1) {
            var6 = (class457) class527.method3046(arg4, arg3, arg1);
        }
        if (arg0 != -3) {
            this.method1336((byte) -128, -25, 106, 85, -68);
        }
        if (arg2 == 1) {
            var6 = (class457) class67.method624(arg4, arg3, arg1);
        }
        if (arg2 == 2) {
            var6 = (class457) class290.method1735(arg4, arg3, arg1, field2749 != null ? field2749 : (field2749 = method1343("rca")));
        }
        if (arg2 == 3) {
            var6 = (class457) class146.method1046(arg4, arg3, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lha;IIIIZI[Lje;II[B)V", line = 475)
    public final void method1337(class60 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class405[] arg7, int arg8, int arg9, byte[] arg10) {
        ++field2740;
        class461 var12 = new class461(arg10);
        int var13 = -1;
        if (!arg5) {
            this.method1339((int[]) null, -35, -34, (class60) null, -27, (class461) null);
        }
        while (true) {
            int var14 = var12.method2621(127);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2594(3340);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4095 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2600((byte) -128);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg2 == var19 && var18 >= arg8 && arg8 + 8 > var18 && ~arg9 >= ~var17 && arg9 + 8 > var17) {
                    class543 var23 = client.field3995.method3384(var13, false);
                    int var24 = class531.method3053(var22, var18 & 7, var23.field7534, var17 & 7, arg1, (byte) 126, var23.field7520) + arg4;
                    int var25 = class577.method3302(var22, var17 & 7, var23.field7534, var23.field7520, 7 & var18, arg1, (byte) -52) + arg3;
                    if (var24 > 0 && ~var25 < -1 && ~var24 > ~(super.field5203 + -1) && super.field5214 + -1 > var25) {
                        class405 var26 = null;
                        if (!super.field5215) {
                            int var27 = arg6;
                            if ((2 & class305.field4001[1][var24][var25]) == 2) {
                                var27 = arg6 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg7[var27];
                            }
                        }
                        this.method1338(-1, var24, arg6, var26, arg1 + var22 & 3, (byte) -4, var25, arg6, var21, arg0, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILje;IBIIILha;I)V", line = 556)
    public final void method1338(int arg0, int arg1, int arg2, class405 arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, class60 arg9, int arg10) {
        ++field2739;
        if (class748.field10451.field10412.method1806((byte) -92) != 0 || class520.method3024(arg7, arg1, arg6, class440.field5865, arg5 ^ 29916)) {
            if (this.field2741 > arg2) {
                this.field2741 = arg2;
            }
            class543 var12 = client.field3995.method3384(arg10, false);
            if (class748.field10451.field10420.method1877((byte) -86) != 0 || !var12.field7594) {
                int var13;
                int var14;
                if (arg4 != 1 && arg4 != 3) {
                    var13 = var12.field7520;
                    var14 = var12.field7534;
                } else {
                    var13 = var12.field7534;
                    var14 = var12.field7520;
                }
                if (arg5 != -4) {
                    field2748 = null;
                }
                int var15;
                int var16;
                if (arg1 + var13 > super.field5203) {
                    var15 = arg1 + 1;
                    var16 = arg1;
                } else {
                    var16 = (var13 >> 1) + arg1;
                    var15 = (var13 + 1 >> 1) + arg1;
                }
                int var17;
                int var18;
                if (super.field5214 >= arg6 + var14) {
                    var17 = (var14 + 1 >> 1) + arg6;
                    var18 = (var14 >> 1) + arg6;
                } else {
                    var18 = arg6;
                    var17 = arg6 - -1;
                }
                class282 var19 = class195.field2669[arg7];
                int var20 = var19.method1677(var18, (byte) 74, var16) + var19.method1677(var18, (byte) 39, var15) - (-var19.method1677(var17, (byte) 76, var16) - var19.method1677(var17, (byte) 109, var15)) >> 2;
                int var21 = (arg1 << 9) - -(var13 << 8);
                int var22 = (arg6 << 9) - -(var14 << 8);
                boolean var23 = class327.field4198 && !super.field5215 && var12.field7557;
                if (var12.method3114(-19127)) {
                    class718.method4016((class724) null, var12, (class733) null, (byte) 85, arg4, arg2, arg6, arg1);
                }
                boolean var24 = ~arg0 == 0 && ~var12.field7563 == 0 && var12.field7585 == null && var12.field7541 == null && !var12.field7590 && !var12.field7522;
                if (!class694.field9636 || (!class514.method2992(arg8, arg5 + -30) || ~var12.field7551 == -2) && (!class362.method2094(arg8, -13) || ~var12.field7551 != -1)) {
                    if (arg8 == 22) {
                        if (class748.field10451.field10386.method3003((byte) 100) != 0 || ~var12.field7550 != -1 || ~var12.field7580 == -2 || var12.field7502) {
                            class118 var25;
                            if (!var24) {
                                var25 = new class718(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg4, arg0);
                            } else {
                                class627 var26 = new class627(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg4, var23);
                                if (var26.method756(-74)) {
                                    var26.method761(-16, arg9);
                                }
                                var25 = var26;
                            }
                            class97.method778(arg2, arg1, arg6, var25);
                            if (~var12.field7580 == -2 && arg3 != null) {
                                arg3.method2262(arg1, arg5 ^ 3, arg6);
                            }
                        }
                    } else if (arg8 != 10 && ~arg8 != -12) {
                        if (~arg8 <= -13 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
                            class556 var27;
                            if (!var24) {
                                var27 = new class214(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg1, arg1 + -1 + var13, arg6, var14 + -1 + arg6, arg8, arg4, arg0);
                            } else {
                                class93 var28 = new class93(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg1, arg1 - -var13 + -1, arg6, arg6 - -var14 + -1, arg8, arg4, var23);
                                if (var28.method756(arg5 ^ 60)) {
                                    var28.method761(122, arg9);
                                }
                                var27 = var28;
                            }
                            class582.method3315(var27, false);
                            if (class327.field4198 && !super.field5215 && ~arg8 <= -13 && ~arg8 >= -18 && ~arg8 != -14 && ~arg2 < -1 && var12.field7551 != 0) {
                                super.field5216[arg2][arg1][arg6] = (byte) class683.method3840(super.field5216[arg2][arg1][arg6], 4);
                            }
                            if (~var12.field7580 != -1 && arg3 != null) {
                                arg3.method2269(var14, (byte) 118, arg6, var12.field7548, !var12.field7521, arg1, var13);
                            }
                        } else if (arg8 == 0) {
                            int var29 = var12.field7551;
                            if (class532.field7386 && var12.field7551 == -1) {
                                var29 = 1;
                            }
                            class374 var31;
                            if (var24) {
                                class407 var30 = new class407(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, arg4, var23);
                                var31 = var30;
                                if (var30.method756(-93)) {
                                    var30.method761(118, arg9);
                                }
                            } else {
                                var31 = new class359(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, arg4, arg0);
                            }
                            class737.method4105(arg2, arg1, arg6, var31, (class374) null);
                            if (arg4 == 0) {
                                if (class327.field4198 && var12.field7552) {
                                    var19.method1670(arg1, arg6, 50);
                                    var19.method1670(arg1, arg6 + 1, 50);
                                }
                                if (~var29 == -2 && !super.field5215) {
                                    class389.method2211(arg6, var12.field7544, arg2, 1, var12.field7562, arg1, -2);
                                }
                            } else if (arg4 != 1) {
                                if (arg4 == 2) {
                                    if (class327.field4198 && var12.field7552) {
                                        var19.method1670(arg1 + 1, arg6, 50);
                                        var19.method1670(arg1 - -1, arg6 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field5215) {
                                        class389.method2211(arg6, -var12.field7544, arg2, 1, var12.field7562, arg1 + 1, -2);
                                    }
                                } else if (arg4 == 3) {
                                    if (class327.field4198 && var12.field7552) {
                                        var19.method1670(arg1, arg6, 50);
                                        var19.method1670(arg1 + 1, arg6, 50);
                                    }
                                    if (var29 == 1 && !super.field5215) {
                                        class389.method2211(arg6, var12.field7544, arg2, 2, var12.field7562, arg1, -2);
                                    }
                                }
                            } else {
                                if (class327.field4198 && var12.field7552) {
                                    var19.method1670(arg1, arg6 - -1, 50);
                                    var19.method1670(arg1 + 1, arg6 + 1, 50);
                                }
                                if (var29 == 1 && !super.field5215) {
                                    class389.method2211(arg6 + 1, -var12.field7544, arg2, 2, var12.field7562, arg1, -2);
                                }
                            }
                            if (var12.field7580 != 0 && arg3 != null) {
                                arg3.method2263(arg4, !var12.field7521, var12.field7548, arg1, 67, arg8, arg6);
                            }
                            if (~var12.field7509 != -65) {
                                class241.method1506(arg2, arg1, arg6, var12.field7509);
                            }
                        } else if (~arg8 == -2) {
                            class374 var32;
                            if (!var24) {
                                var32 = new class359(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, arg4, arg0);
                            } else {
                                class407 var33 = new class407(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, arg4, var23);
                                if (var33.method756(-117)) {
                                    var33.method761(arg5 ^ -127, arg9);
                                }
                                var32 = var33;
                            }
                            class737.method4105(arg2, arg1, arg6, var32, (class374) null);
                            if (var12.field7552 && class327.field4198) {
                                if (arg4 != 0) {
                                    if (~arg4 == -2) {
                                        var19.method1670(arg1 - -1, arg6 + 1, 50);
                                    } else if (~arg4 != -3) {
                                        if (arg4 == 3) {
                                            var19.method1670(arg1, arg6, 50);
                                        }
                                    } else {
                                        var19.method1670(arg1 + 1, arg6, 50);
                                    }
                                } else {
                                    var19.method1670(arg1, arg6 - -1, 50);
                                }
                            }
                            if (~var12.field7580 != -1 && arg3 != null) {
                                arg3.method2263(arg4, !var12.field7521, var12.field7548, arg1, 108, arg8, arg6);
                            }
                        } else if (arg8 == 2) {
                            int var34 = arg4 - -1 & 3;
                            class374 var35;
                            class374 var36;
                            if (!var24) {
                                var35 = new class359(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, arg4 + 4, arg0);
                                var36 = new class359(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, var34, arg0);
                            } else {
                                class407 var37 = new class407(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, arg4 + 4, var23);
                                class407 var38 = new class407(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, var34, var23);
                                if (var37.method756(-64)) {
                                    var37.method761(-13, arg9);
                                }
                                var35 = var37;
                                if (var38.method756(-120)) {
                                    var38.method761(124, arg9);
                                }
                                var36 = var38;
                            }
                            class737.method4105(arg2, arg1, arg6, var35, var36);
                            if ((~var12.field7551 == -2 || class532.field7386 && ~var12.field7551 == 0) && !super.field5215) {
                                if (arg4 == 0) {
                                    class389.method2211(arg6, var12.field7544, arg2, 1, var12.field7562, arg1, -2);
                                    class389.method2211(arg6 + 1, var12.field7544, arg2, 2, var12.field7562, arg1, arg5 + 2);
                                } else if (~arg4 == -2) {
                                    class389.method2211(arg6, var12.field7544, arg2, 1, var12.field7562, arg1 + 1, -2);
                                    class389.method2211(arg6 + 1, var12.field7544, arg2, 2, var12.field7562, arg1, arg5 ^ 2);
                                } else if (~arg4 == -3) {
                                    class389.method2211(arg6, var12.field7544, arg2, 1, var12.field7562, arg1 + 1, -2);
                                    class389.method2211(arg6, var12.field7544, arg2, 2, var12.field7562, arg1, arg5 ^ 2);
                                } else if (arg4 == 3) {
                                    class389.method2211(arg6, var12.field7544, arg2, 1, var12.field7562, arg1, -2);
                                    class389.method2211(arg6, var12.field7544, arg2, 2, var12.field7562, arg1, -2);
                                }
                            }
                            if (var12.field7580 != 0 && arg3 != null) {
                                arg3.method2263(arg4, !var12.field7521, var12.field7548, arg1, arg5 ^ -65, arg8, arg6);
                            }
                            if (var12.field7509 != 64) {
                                class241.method1506(arg2, arg1, arg6, var12.field7509);
                            }
                        } else if (~arg8 == -4) {
                            class374 var40;
                            if (var24) {
                                class407 var39 = new class407(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, arg4, var23);
                                if (var39.method756(arg5 + -105)) {
                                    var39.method761(-53, arg9);
                                }
                                var40 = var39;
                            } else {
                                var40 = new class359(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg8, arg4, arg0);
                            }
                            class737.method4105(arg2, arg1, arg6, var40, (class374) null);
                            if (var12.field7552 && class327.field4198) {
                                if (arg4 != 0) {
                                    if (arg4 == 1) {
                                        var19.method1670(arg1 + 1, arg6 + 1, 50);
                                    } else if (arg4 == 2) {
                                        var19.method1670(arg1 + 1, arg6, 50);
                                    } else if (arg4 == 3) {
                                        var19.method1670(arg1, arg6, 50);
                                    }
                                } else {
                                    var19.method1670(arg1, arg6 + 1, 50);
                                }
                            }
                            if (var12.field7580 != 0 && arg3 != null) {
                                arg3.method2263(arg4, !var12.field7521, var12.field7548, arg1, 99, arg8, arg6);
                            }
                        } else if (arg8 == 9) {
                            class556 var42;
                            if (var24) {
                                class93 var41 = new class93(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg1, arg1, arg6, arg6, arg8, arg4, var23);
                                if (var41.method756(arg5 ^ 118)) {
                                    var41.method761(122, arg9);
                                }
                                var42 = var41;
                            } else {
                                var42 = new class214(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg1, arg1 + var13 + -1, arg6, arg6 - 1 + var14, arg8, arg4, arg0);
                            }
                            class582.method3315(var42, false);
                            if (~var12.field7551 == -2 && !super.field5215) {
                                byte var43;
                                if (~(1 & arg4) == -1) {
                                    var43 = 8;
                                } else {
                                    var43 = 16;
                                }
                                class389.method2211(arg6, 0, arg2, var43, var12.field7562, arg1, -2);
                            }
                            if (var12.field7580 != 0 && arg3 != null) {
                                arg3.method2269(var14, (byte) 124, arg6, var12.field7548, !var12.field7521, arg1, var13);
                            }
                            if (var12.field7509 != 64) {
                                class241.method1506(arg2, arg1, arg6, var12.field7509);
                            }
                        } else if (arg8 == 4) {
                            class573 var45;
                            if (var24) {
                                class712 var44 = new class712(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, 0, 0, arg8, arg4);
                                var45 = var44;
                                if (var44.method756(-103)) {
                                    var44.method761(-6, arg9);
                                }
                            } else {
                                var45 = new class625(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, 0, 0, arg8, arg4, arg0);
                            }
                            class251.method1545(arg2, arg1, arg6, var45, (class573) null);
                        } else if (arg8 == 5) {
                            int var46 = 65;
                            class457 var47 = (class457) class527.method3046(arg2, arg1, arg6);
                            if (var47 != null) {
                                var46 = 1 + client.field3995.method3384(var47.method745((byte) 27), false).field7509;
                            }
                            class573 var49;
                            if (var24) {
                                class712 var48 = new class712(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, class463.field6225[arg4] * var46, class175.field2456[arg4] * var46, arg8, arg4);
                                var49 = var48;
                                if (var48.method756(-75)) {
                                    var48.method761(-125, arg9);
                                }
                            } else {
                                var49 = new class625(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, class463.field6225[arg4] * var46, class175.field2456[arg4] * var46, arg8, arg4, arg0);
                            }
                            class251.method1545(arg2, arg1, arg6, var49, (class573) null);
                        } else if (~arg8 == -7) {
                            int var50 = 33;
                            class457 var51 = (class457) class527.method3046(arg2, arg1, arg6);
                            if (var51 != null) {
                                var50 = 1 + client.field3995.method3384(var51.method745((byte) -96), false).field7509 / 2;
                            }
                            class573 var53;
                            if (var24) {
                                class712 var52 = new class712(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, class463.field6225[arg4] * var50, class175.field2456[arg4] * var50, arg8, arg4 + 4);
                                if (var52.method756(-54)) {
                                    var52.method761(114, arg9);
                                }
                                var53 = var52;
                            } else {
                                var53 = new class625(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, class730.field10160[arg4] * var50, class52.field737[arg4] * var50, arg8, arg4 + 4, arg0);
                            }
                            class251.method1545(arg2, arg1, arg6, var53, (class573) null);
                        } else if (~arg8 == -8) {
                            int var54 = arg4 + 2 & 3;
                            class573 var55;
                            if (!var24) {
                                var55 = new class625(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, 0, 0, arg8, var54 - -4, arg0);
                            } else {
                                class712 var56 = new class712(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, 0, 0, arg8, var54 + 4);
                                if (var56.method756(-54)) {
                                    var56.method761(arg5 + -101, arg9);
                                }
                                var55 = var56;
                            }
                            class251.method1545(arg2, arg1, arg6, var55, (class573) null);
                        } else if (arg8 == 8) {
                            int var57 = arg4 + 2 & 3;
                            int var58 = 33;
                            class457 var59 = (class457) class527.method3046(arg2, arg1, arg6);
                            if (var59 != null) {
                                var58 = 1 + client.field3995.method3384(var59.method745((byte) -95), false).field7509 / 2;
                            }
                            class573 var61;
                            class573 var63;
                            if (!var24) {
                                class625 var60 = new class625(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, class730.field10160[arg4] * var58, class52.field737[arg4] * var58, arg8, arg4 + 4, arg0);
                                var61 = var60;
                                class625 var62 = new class625(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, 0, 0, arg8, var57 + 4, arg0);
                                var63 = var62;
                            } else {
                                class712 var64 = new class712(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, class730.field10160[arg4] * var58, class52.field737[arg4] * var58, arg8, arg4 + 4);
                                class712 var65 = new class712(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, 0, 0, arg8, var57 - -4);
                                if (var64.method756(-83)) {
                                    var64.method761(arg5 + 15, arg9);
                                }
                                var61 = var64;
                                var63 = var65;
                                if (var65.method756(-111)) {
                                    var65.method761(125, arg9);
                                }
                            }
                            class251.method1545(arg2, arg1, arg6, var61, var63);
                        }
                    } else {
                        class93 var66 = null;
                        int var68;
                        class556 var69;
                        if (var24) {
                            class93 var67 = new class93(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg1, arg1 + var13 + -1, arg6, arg6 + -1 - -var14, arg8, arg4, var23);
                            var66 = var67;
                            var68 = var67.method757(false);
                            var69 = var67;
                        } else {
                            var68 = 15;
                            var69 = new class214(arg9, var12, arg2, arg7, var21, var20, var22, super.field5215, arg1, arg1 + -1 + var13, arg6, var14 + -1 + arg6, arg8, arg4, arg0);
                        }
                        if (class582.method3315(var69, false)) {
                            if (var66 != null && var66.method756(arg5 + -62)) {
                                var66.method761(-112, arg9);
                            }
                            if (var12.field7552 && class327.field4198) {
                                if (var68 > 30) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var70 >= ~var13; ++var70) {
                                    for (int var71 = 0; var14 >= var71; ++var71) {
                                        var19.method1670(arg1 + var70, arg6 + var71, var68);
                                    }
                                }
                            }
                        }
                        if (~var12.field7580 != -1 && arg3 != null) {
                            arg3.method2269(var14, (byte) 104, arg6, var12.field7548, !var12.field7521, arg1, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIILha;ILsl;)V", line = 1189)
    public final void method1339(int[] arg0, int arg1, int arg2, class60 arg3, int arg4, class461 arg5) {
        ++field2738;
        if (!super.field5215) {
            boolean var7 = false;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            if (arg1 != 0) {
                field2747 = -74;
            }
            class210 var8 = null;
            while (true) {
                while (arg5.field6193 < arg5.field6180.length) {
                    int var18 = arg5.method2600((byte) -126);
                    if (~var18 == -1) {
                        var8 = new class210(arg5);
                    } else if (~var18 == -2) {
                        int var19 = arg5.method2600((byte) -124);
                        if (var19 > 0) {
                            for (int var20 = 0; ~var19 < ~var20; ++var20) {
                                class667 var21 = new class667(arg3, arg5, 2);
                                if (~var21.field9380 == -32) {
                                    class471 var22 = class12.field150.method619(arg5.method2566(-2), 256);
                                    var21.method3755(var22.field6314, var22.field6317, var22.field6323, var22.field6318, -19781);
                                }
                                if (~arg3.method436() < -1) {
                                    class123 var23 = var21.field9381;
                                    int var24 = (arg2 << 9) + var23.method932(-16562);
                                    int var25 = var23.method938(0) - -(arg4 << 9);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (var26 >= 0 && ~var27 <= -1 && ~var26 > ~super.field5203 && ~var27 > ~super.field5214) {
                                        var23.method936(super.field5224[var21.field9375][var26][var27] + -var23.method937(78), var25, (byte) 82, var24);
                                        class21.method135(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class210();
                        }
                        var8.method1353(8, arg5);
                    } else if (var18 == 128) {
                        if (arg0 == null) {
                            arg5.field6193 += 10;
                        } else {
                            arg0[0] = arg5.method2566(-2);
                            arg0[1] = arg5.method2577(2);
                            arg0[2] = arg5.method2577(2);
                            arg0[3] = arg5.method2577(2);
                            arg0[4] = arg5.method2566(-2);
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field5200 == null) {
                            super.field5200 = new byte[4][][];
                        }
                        for (int var28 = 0; ~var28 > -5; ++var28) {
                            byte var29 = arg5.method2601(0);
                            if (~var29 == -1 && super.field5200[var28] != null) {
                                int var30 = arg2;
                                int var31 = arg2 - -64;
                                int var32 = arg4;
                                if (var31 >= 0) {
                                    if (var31 >= super.field5203) {
                                        var31 = super.field5203;
                                    }
                                } else {
                                    var31 = 0;
                                }
                                if (~arg4 > -1) {
                                    var32 = 0;
                                } else if (~super.field5214 >= ~arg4) {
                                    var32 = super.field5214;
                                }
                                if (~arg2 <= -1) {
                                    if (~super.field5203 >= ~arg2) {
                                        var30 = super.field5203;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                int var33 = arg4 + 64;
                                if (var33 >= 0) {
                                    if (~super.field5214 >= ~var33) {
                                        var33 = super.field5214;
                                    }
                                } else {
                                    var33 = 0;
                                }
                                while (var30 < var31) {
                                    while (var33 > var32) {
                                        super.field5200[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 != -2) {
                                if (var29 == 2) {
                                    if (super.field5200[var28] == null) {
                                        super.field5200[var28] = new byte[super.field5203 + 1][super.field5214 + 1];
                                    }
                                    if (~var28 < -1) {
                                        int var34 = arg2;
                                        int var35 = arg2 + 64;
                                        int var36 = arg4;
                                        if (~var35 <= -1) {
                                            if (var35 >= super.field5203) {
                                                var35 = super.field5203;
                                            }
                                        } else {
                                            var35 = 0;
                                        }
                                        int var37 = arg4 + 64;
                                        if (arg2 >= 0) {
                                            if (super.field5203 <= arg2) {
                                                var34 = super.field5203;
                                            }
                                        } else {
                                            var34 = 0;
                                        }
                                        if (arg4 < 0) {
                                            var36 = 0;
                                        } else if (~arg4 <= ~super.field5214) {
                                            var36 = super.field5214;
                                        }
                                        if (var37 < 0) {
                                            var37 = 0;
                                        } else if (~var37 <= ~super.field5214) {
                                            var37 = super.field5214;
                                        }
                                        while (var35 > var34) {
                                            while (var37 > var36) {
                                                super.field5200[var28][var34][var36] = super.field5200[var28 + -1][var34][var36];
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                }
                            } else {
                                if (super.field5200[var28] == null) {
                                    super.field5200[var28] = new byte[super.field5203 + 1][super.field5214 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg5.method2601(0);
                                        for (int var41 = var38 - -arg2; ~(var38 + 4 + arg2) < ~var41; ++var41) {
                                            for (int var42 = var39 - -arg4; ~var42 > ~(arg4 + 4 + var39); ++var42) {
                                                if (var41 >= 0 && ~var41 > ~super.field5203 && ~var42 <= -1 && ~var42 > ~super.field5214) {
                                                    super.field5200[var28][var41][var42] = var40;
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
                if (var8 != null) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg2 >> 3) + var9;
                            int var12 = (arg4 >> 3) + var10;
                            if (~var11 <= -1 && ~(super.field5203 >> 3) < ~var11 && ~var12 <= -1 && ~var12 > ~(super.field5214 >> 3)) {
                                class508.method2965(6, var11, var12, var8);
                            }
                        }
                    }
                }
                if (!var7 && super.field5200 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field5200[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg2 >> 2) + var14;
                                    int var17 = (arg4 >> 2) + var15;
                                    if (var16 >= 0 && var16 < 26 && ~var17 <= -1 && var17 < 26) {
                                        super.field5200[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLha;[Lje;[BII)V", line = 1559)
    public final void method1340(boolean arg0, class60 arg1, class405[] arg2, byte[] arg3, int arg4, int arg5) {
        ++field2732;
        class461 var7 = new class461(arg3);
        int var8 = -1;
        if (arg0) {
            while (true) {
                int var9 = var7.method2621(127);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method2594(3340);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = var10 & 63;
                    int var13 = (4079 & var10) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method2600((byte) -128);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = arg4 + var13;
                    int var19 = arg5 + var12;
                    if (~var18 < -1 && ~var19 < -1 && var18 < super.field5203 + -1 && ~(super.field5214 - 1) < ~var19) {
                        class405 var20 = null;
                        if (!super.field5215) {
                            int var21 = var14;
                            if (~(2 & class305.field4001[1][var18][var19]) == -3) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg2[var21];
                            }
                        }
                        this.method1338(-1, var18, var14, var20, var17, (byte) -4, var19, var14, var16, arg1, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZBLha;)V", line = 1634)
    public final void method1341(boolean arg0, byte arg1, class60 arg2) {
        if (arg1 == 109) {
            class417.method2340();
            ++field2742;
            if (!arg0) {
                if (~super.field5208 < -2) {
                    for (int var4 = 0; var4 < super.field5203; ++var4) {
                        for (int var5 = 0; ~super.field5214 < ~var5; ++var5) {
                            if ((2 & class305.field4001[1][var4][var5]) == 2) {
                                class43.method306(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; super.field5208 > var6; ++var6) {
                    for (int var7 = 0; super.field5214 >= var7; ++var7) {
                        for (int var8 = 0; var8 <= super.field5203; ++var8) {
                            if (~(4 & super.field5216[var6][var8][var7]) != -1) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (var11 > 0 && ~(super.field5216[var6][var8][var11 - 1] & 4) != -1 && ~(-var11 + var12) > -11) {
                                    --var11;
                                }
                                while (~super.field5214 < ~var12 && ~(4 & super.field5216[var6][var8][var12 + 1]) != -1 && var12 - var11 < 10) {
                                    ++var12;
                                }
                                label117: while (var9 > 0 && ~(-var9 + var10) > -11) {
                                    for (int var13 = var11; var13 <= var12; ++var13) {
                                        if (~(4 & super.field5216[var6][var9 + -1][var13]) == -1) {
                                            break label117;
                                        }
                                    }
                                    --var9;
                                }
                                label104: while (super.field5203 > var10 && ~(-var9 + var10) > -11) {
                                    for (int var14 = var11; var12 >= var14; ++var14) {
                                        if ((4 & super.field5216[var6][var10 + 1][var14]) == 0) {
                                            break label104;
                                        }
                                    }
                                    ++var10;
                                }
                                if ((var10 - -1 + -var9) * (var12 - var11 + 1) >= 4) {
                                    int var15 = super.field5224[var6][var9][var11];
                                    class550.method3196(var9 << 9, var15, arg1 ^ 109, (var10 << 9) + 512, (var12 << 9) - -512, var11 << 9, var6, var15, 4);
                                    for (int var16 = var9; var16 <= var10; ++var16) {
                                        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
                                            super.field5216[var6][var16][var17] = (byte) class702.method3949(super.field5216[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class130.method966(arg1 + -10);
            }
            super.field5216 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 1776)
    public static void method1342(byte arg0) {
        field2745 = null;
        field2748 = null;
        if (arg0 != 103) {
            field2746 = -93;
        }
        field2744 = null;
    }
}
