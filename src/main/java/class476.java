import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class476 extends class624 {

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public int field6859 = 99;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field6869 = 0;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "Lat;")
    public static class585 field6860;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uk", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field6870;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "[[Lrb;")
    public static class383[][] field6867;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2747(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBLnp;Lr;[I)V", line = 5)
    public final void method2738(int arg0, int arg1, byte arg2, class115 arg3, class564 arg4, int[] arg5) {
        ++field6861;
        if (!super.field8821) {
            int var7 = -39 % ((arg2 - 7) / 51);
            boolean var8 = false;
            class390 var9 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            while (true) {
                while (arg3.field1218 < arg3.field1269.length) {
                    int var19 = arg3.method620((byte) -127);
                    if (~var19 == -1) {
                        var9 = new class390(arg3);
                    } else if (var19 == 1) {
                        int var35 = arg3.method620((byte) 9);
                        if (~var35 < -1) {
                            for (int var36 = 0; ~var35 < ~var36; ++var36) {
                                class241 var37 = new class241(arg4, arg3, 2);
                                if (~var37.field2994 == -32) {
                                    class635 var38 = class211.field2553.method2805(200, arg3.method643((byte) -77));
                                    var37.method1435(var38.field8941, -112, var38.field8944, var38.field8942, var38.field8947);
                                }
                                if (~arg4.method953() < -1) {
                                    class670 var39 = var37.field2980;
                                    int var40 = var39.method3711(1795643394) - -(arg1 << 9);
                                    int var41 = (arg0 << 9) + var39.method3706((byte) 124);
                                    int var42 = var40 >> 9;
                                    int var43 = var41 >> 9;
                                    if (var42 >= 0 && var43 >= 0 && ~super.field8816 < ~var42 && ~var43 > ~super.field8811) {
                                        var39.method257(var41, var40, super.field8806[var37.field2983][var42][var43] - var39.method3703((byte) -29), (byte) -83);
                                        class492.method2856(var37);
                                    }
                                }
                            }
                        }
                    } else if (var19 == 2) {
                        if (var9 == null) {
                            var9 = new class390();
                        }
                        var9.method2218(true, arg3);
                    } else if (~var19 == -129) {
                        if (arg5 != null) {
                            arg5[0] = arg3.method643((byte) -77);
                            arg5[1] = arg3.method676(-5);
                            arg5[2] = arg3.method676(-5);
                            arg5[3] = arg3.method676(-5);
                            arg5[4] = arg3.method643((byte) -77);
                        } else {
                            arg3.field1218 += 10;
                        }
                    } else {
                        if (var19 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field8823 == null) {
                            super.field8823 = new byte[4][][];
                        }
                        for (int var20 = 0; ~var20 > -5; ++var20) {
                            byte var21 = arg3.method657(false);
                            if (~var21 == -1 && super.field8823[var20] != null) {
                                int var22 = arg1;
                                int var23 = arg1 + 64;
                                int var24 = arg0;
                                if (~arg1 > -1) {
                                    var22 = 0;
                                } else if (super.field8816 <= arg1) {
                                    var22 = super.field8816;
                                }
                                if (~arg0 > -1) {
                                    var24 = 0;
                                } else if (~super.field8811 >= ~arg0) {
                                    var24 = super.field8811;
                                }
                                if (var23 >= 0) {
                                    if (~super.field8816 >= ~var23) {
                                        var23 = super.field8816;
                                    }
                                } else {
                                    var23 = 0;
                                }
                                int var25 = arg0 + 64;
                                if (~var25 <= -1) {
                                    if (super.field8811 <= var25) {
                                        var25 = super.field8811;
                                    }
                                } else {
                                    var25 = 0;
                                }
                                while (var23 > var22) {
                                    while (var24 < var25) {
                                        super.field8823[var20][var22][var24] = 0;
                                        ++var24;
                                    }
                                    ++var22;
                                }
                            } else if (var21 != 1) {
                                if (~var21 == -3) {
                                    if (super.field8823[var20] == null) {
                                        super.field8823[var20] = new byte[super.field8816 - -1][super.field8811 + 1];
                                    }
                                    if (~var20 < -1) {
                                        int var26 = arg1;
                                        int var27 = arg1 + 64;
                                        int var28 = arg0;
                                        if (arg0 >= 0) {
                                            if (arg0 >= super.field8811) {
                                                var28 = super.field8811;
                                            }
                                        } else {
                                            var28 = 0;
                                        }
                                        if (~var27 > -1) {
                                            var27 = 0;
                                        } else if (~super.field8816 >= ~var27) {
                                            var27 = super.field8816;
                                        }
                                        int var29 = arg0 + 64;
                                        if (arg1 >= 0) {
                                            if (super.field8816 <= arg1) {
                                                var26 = super.field8816;
                                            }
                                        } else {
                                            var26 = 0;
                                        }
                                        if (~var29 > -1) {
                                            var29 = 0;
                                        } else if (~super.field8811 >= ~var29) {
                                            var29 = super.field8811;
                                        }
                                        while (var27 > var26) {
                                            while (var28 < var29) {
                                                super.field8823[var20][var26][var28] = super.field8823[var20 + -1][var26][var28];
                                                ++var28;
                                            }
                                            ++var26;
                                        }
                                    }
                                }
                            } else {
                                if (super.field8823[var20] == null) {
                                    super.field8823[var20] = new byte[super.field8816 + 1][super.field8811 - -1];
                                }
                                for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                    for (int var31 = 0; ~var31 > -65; var31 += 4) {
                                        byte var32 = arg3.method657(false);
                                        for (int var33 = arg1 + var30; ~(var30 - -arg1 - -4) < ~var33; ++var33) {
                                            for (int var34 = arg0 + var31; ~var34 > ~(var31 + 4 - -arg0); ++var34) {
                                                if (~var33 <= -1 && super.field8816 > var33 && var34 >= 0 && ~var34 > ~super.field8811) {
                                                    super.field8823[var20][var33][var34] = var32;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var8 = true;
                    }
                }
                if (var9 != null) {
                    for (int var10 = 0; ~var10 > -9; ++var10) {
                        for (int var11 = 0; ~var11 > -9; ++var11) {
                            int var12 = (arg1 >> 3) - -var10;
                            int var13 = (arg0 >> 3) + var11;
                            if (var12 >= 0 && super.field8816 >> 3 > var12 && var13 >= 0 && var13 < super.field8811 >> 3) {
                                class591.method3329(var12, (byte) -43, var13, var9);
                            }
                        }
                    }
                }
                if (!var8 && super.field8823 != null) {
                    for (int var14 = 0; ~var14 > -5; ++var14) {
                        if (super.field8823[var14] != null) {
                            for (int var15 = 0; var15 < 16; ++var15) {
                                for (int var16 = 0; var16 < 16; ++var16) {
                                    int var17 = (arg1 >> 2) + var15;
                                    int var18 = (arg0 >> 2) - -var16;
                                    if (~var17 <= -1 && var17 < 26 && var18 >= 0 && var18 < 26) {
                                        super.field8823[var14][var17][var18] = 0;
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

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III[BLr;[Ljw;IIIII)V", line = 369)
    public final void method2739(int arg0, int arg1, int arg2, byte[] arg3, class564 arg4, class263[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field6864;
        class115 var12 = new class115(arg3);
        int var13 = arg2;
        while (true) {
            int var14 = var12.method663(31856);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method662(true);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method620((byte) -128);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg1 == ~var19 && arg8 <= var18 && arg8 + 8 > var18 && ~arg7 >= ~var17 && ~(arg7 - -8) < ~var17) {
                    class638 var23 = class364.field4891.method2134(var13, true);
                    int var24 = arg6 - -class381.method2196(-15446, var22, var23.field9051, 7 & var18, var23.field9060, 7 & var17, arg9);
                    int var25 = class526.method2965(var23.field9051, var17 & 7, var18 & 7, var23.field9060, (byte) 123, arg9, var22) + arg0;
                    if (~var24 < -1 && ~var25 < -1 && super.field8816 + -1 > var24 && ~(super.field8811 + -1) < ~var25) {
                        class263 var26 = null;
                        if (!super.field8821) {
                            int var27 = arg10;
                            if ((2 & class16.field131[1][var24][var25]) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg5[var27];
                            }
                        }
                        this.method2740(var13, arg10, 3 & arg9 + var22, -1, -96, var21, arg4, var24, arg10, var26, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIILr;IILjw;I)V", line = 447)
    public final void method2740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class564 arg6, int arg7, int arg8, class263 arg9, int arg10) {
        ++field6862;
        if (class639.field9075.method2641(class430.field6109, (byte) 34) || class457.method2624(-25097, arg7, arg1, class652.field9150, arg10)) {
            if (~this.field6859 < ~arg8) {
                this.field6859 = arg8;
            }
            class638 var12 = class364.field4891.method2134(arg0, true);
            if (!arg6.method939() || !class639.field9075.field6770 || !var12.field8977) {
                int var13;
                int var14;
                if (arg2 != 1 && arg2 != 3) {
                    var13 = var12.field9051;
                    var14 = var12.field9060;
                } else {
                    var13 = var12.field9060;
                    var14 = var12.field9051;
                }
                int var15;
                int var16;
                if (arg7 + var13 <= super.field8816) {
                    var15 = (var13 >> 1) + arg7;
                    var16 = (var13 + 1 >> 1) + arg7;
                } else {
                    var15 = arg7;
                    var16 = arg7 + 1;
                }
                int var17;
                int var18;
                if (~super.field8811 <= ~(arg10 + var14)) {
                    var17 = arg10 - -(var14 - -1 >> 1);
                    var18 = arg10 - -(var14 >> 1);
                } else {
                    var17 = arg10 + 1;
                    var18 = arg10;
                }
                class274 var19 = class156.field1743[arg1];
                int var20 = var19.method1608(var18, 840, var15) - -var19.method1608(var18, 840, var16) + var19.method1608(var17, 840, var15) - -var19.method1608(var17, 840, var16) >> 2;
                int var21 = (arg7 << 9) + (var13 << 8);
                int var22 = (arg10 << 9) - -(var14 << 8);
                boolean var23 = class90.field910 && !super.field8821 && var12.field8975;
                if (var12.method3587((byte) 104)) {
                    class394.method2232((class600) null, var12, arg2, arg7, arg8, 1480634889, (class236) null, arg10);
                }
                boolean var24 = arg3 == -1 && var12.field8986 == -1 && var12.field9066 == null && var12.field8974 == null && !var12.field9002;
                if (!class29.field293 || (!class434.method2487(arg5, -76) || ~var12.field9027 == -2) && (!class469.method2706(arg5, (byte) 121) || ~var12.field9027 != -1)) {
                    if (arg5 == 22) {
                        if (class639.field9075.field6796 || var12.field9035 != 0 || var12.field9006 == 1 || var12.field8979) {
                            class570 var26;
                            if (var24) {
                                class45 var25 = new class45(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg2, var23);
                                if (var25.method236((byte) -61)) {
                                    var25.method230(arg6, 21670);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class706(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg2, arg3);
                            }
                            class169.method923(arg8, arg7, arg10, var26);
                            if (var12.field9006 == 1 && arg9 != null) {
                                arg9.method1548(arg7, arg10, (byte) 49);
                            }
                        }
                    } else if (~arg5 != -11 && arg5 != 11) {
                        if (~arg5 <= -13 && ~arg5 >= -18 || arg5 >= 18 && ~arg5 >= -22) {
                            class613 var28;
                            if (var24) {
                                class156 var27 = new class156(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg7, arg7 + -1 + var13, arg10, arg10 + var14 - 1, arg5, arg2, var23);
                                if (var27.method236((byte) -67)) {
                                    var27.method230(arg6, 21670);
                                }
                                var28 = var27;
                            } else {
                                var28 = new class462(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg7, arg7 + var13 + -1, arg10, arg10 + -1 + var14, arg5, arg2, arg3);
                            }
                            class631.method3538(var28, false);
                            if (class90.field910 && !super.field8821 && arg5 >= 12 && ~arg5 >= -18 && arg5 != 13 && arg8 > 0 && ~var12.field9027 != -1) {
                                super.field8815[arg8][arg7][arg10] = (byte) class422.method2436(super.field8815[arg8][arg7][arg10], 4);
                            }
                            if (~var12.field9006 != -1 && arg9 != null) {
                                arg9.method1546(var13, (byte) 104, var14, !var12.field9046, arg7, arg10, var12.field9057);
                            }
                        } else if (arg5 == 0) {
                            int var29 = var12.field9027;
                            if (class101.field1090 && ~var12.field9027 == 0) {
                                var29 = 1;
                            }
                            class465 var31;
                            if (var24) {
                                class426 var30 = new class426(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, arg2, var23);
                                if (var30.method236((byte) -120)) {
                                    var30.method230(arg6, 21670);
                                }
                                var31 = var30;
                            } else {
                                var31 = new class212(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, arg2, arg3);
                            }
                            class271.method1595(arg8, arg7, arg10, var31, (class465) null);
                            if (arg2 == 0) {
                                if (class90.field910 && var12.field9014) {
                                    var19.method379(arg7, arg10, 50);
                                    var19.method379(arg7, arg10 + 1, 50);
                                }
                                if (~var29 == -2 && !super.field8821) {
                                    class264.method1559(arg10, var12.field8985, arg8, 1, (byte) 33, arg7, var12.field8991);
                                }
                            } else if (arg2 != 1) {
                                if (~arg2 == -3) {
                                    if (class90.field910 && var12.field9014) {
                                        var19.method379(arg7 - -1, arg10, 50);
                                        var19.method379(arg7 + 1, arg10 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field8821) {
                                        class264.method1559(arg10, -var12.field8985, arg8, 1, (byte) 111, arg7 + 1, var12.field8991);
                                    }
                                } else if (~arg2 == -4) {
                                    if (class90.field910 && var12.field9014) {
                                        var19.method379(arg7, arg10, 50);
                                        var19.method379(arg7 - -1, arg10, 50);
                                    }
                                    if (~var29 == -2 && !super.field8821) {
                                        class264.method1559(arg10, var12.field8985, arg8, 2, (byte) 35, arg7, var12.field8991);
                                    }
                                }
                            } else {
                                if (class90.field910 && var12.field9014) {
                                    var19.method379(arg7, arg10 - -1, 50);
                                    var19.method379(arg7 + 1, arg10 - -1, 50);
                                }
                                if (var29 == 1 && !super.field8821) {
                                    class264.method1559(arg10 + 1, -var12.field8985, arg8, 2, (byte) 108, arg7, var12.field8991);
                                }
                            }
                            if (~var12.field9006 != -1 && arg9 != null) {
                                arg9.method1549(536870912, arg2, arg7, arg10, arg5, var12.field9057, !var12.field9046);
                            }
                            if (var12.field9017 != 64) {
                                class24.method129(arg8, arg7, arg10, var12.field9017);
                            }
                        } else if (arg5 == 1) {
                            class465 var32;
                            if (!var24) {
                                var32 = new class212(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, arg2, arg3);
                            } else {
                                class426 var33 = new class426(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, arg2, var23);
                                var32 = var33;
                                if (var33.method236((byte) -38)) {
                                    var33.method230(arg6, 21670);
                                }
                            }
                            class271.method1595(arg8, arg7, arg10, var32, (class465) null);
                            if (var12.field9014 && class90.field910) {
                                if (arg2 == 0) {
                                    var19.method379(arg7, arg10 - -1, 50);
                                } else if (~arg2 != -2) {
                                    if (~arg2 != -3) {
                                        if (arg2 == 3) {
                                            var19.method379(arg7, arg10, 50);
                                        }
                                    } else {
                                        var19.method379(arg7 + 1, arg10, 50);
                                    }
                                } else {
                                    var19.method379(arg7 + 1, arg10 + 1, 50);
                                }
                            }
                            if (var12.field9006 != 0 && arg9 != null) {
                                arg9.method1549(536870912, arg2, arg7, arg10, arg5, var12.field9057, !var12.field9046);
                            }
                        } else if (arg5 == 2) {
                            int var34 = 3 & arg2 + 1;
                            class465 var35;
                            class465 var36;
                            if (!var24) {
                                var35 = new class212(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, arg2 + 4, arg3);
                                var36 = new class212(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, var34, arg3);
                            } else {
                                class426 var37 = new class426(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, arg2 + 4, var23);
                                class426 var38 = new class426(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, var34, var23);
                                if (var37.method236((byte) -76)) {
                                    var37.method230(arg6, 21670);
                                }
                                var36 = var38;
                                if (var38.method236((byte) -107)) {
                                    var38.method230(arg6, 21670);
                                }
                                var35 = var37;
                            }
                            class271.method1595(arg8, arg7, arg10, var35, var36);
                            if ((~var12.field9027 == -2 || class101.field1090 && var12.field9027 == -1) && !super.field8821) {
                                if (arg2 == 0) {
                                    class264.method1559(arg10, var12.field8985, arg8, 1, (byte) 120, arg7, var12.field8991);
                                    class264.method1559(arg10 - -1, var12.field8985, arg8, 2, (byte) 60, arg7, var12.field8991);
                                } else if (~arg2 != -2) {
                                    if (~arg2 == -3) {
                                        class264.method1559(arg10, var12.field8985, arg8, 1, (byte) 40, arg7 - -1, var12.field8991);
                                        class264.method1559(arg10, var12.field8985, arg8, 2, (byte) 96, arg7, var12.field8991);
                                    } else if (~arg2 == -4) {
                                        class264.method1559(arg10, var12.field8985, arg8, 1, (byte) 40, arg7, var12.field8991);
                                        class264.method1559(arg10, var12.field8985, arg8, 2, (byte) 100, arg7, var12.field8991);
                                    }
                                } else {
                                    class264.method1559(arg10, var12.field8985, arg8, 1, (byte) 92, arg7 + 1, var12.field8991);
                                    class264.method1559(arg10 + 1, var12.field8985, arg8, 2, (byte) 33, arg7, var12.field8991);
                                }
                            }
                            if (~var12.field9006 != -1 && arg9 != null) {
                                arg9.method1549(536870912, arg2, arg7, arg10, arg5, var12.field9057, !var12.field9046);
                            }
                            if (var12.field9017 != 64) {
                                class24.method129(arg8, arg7, arg10, var12.field9017);
                            }
                        } else if (~arg5 == -4) {
                            class465 var39;
                            if (!var24) {
                                var39 = new class212(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, arg2, arg3);
                            } else {
                                class426 var40 = new class426(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg5, arg2, var23);
                                if (var40.method236((byte) -67)) {
                                    var40.method230(arg6, 21670);
                                }
                                var39 = var40;
                            }
                            class271.method1595(arg8, arg7, arg10, var39, (class465) null);
                            if (var12.field9014 && class90.field910) {
                                if (~arg2 != -1) {
                                    if (~arg2 == -2) {
                                        var19.method379(arg7 + 1, arg10 - -1, 50);
                                    } else if (arg2 == 2) {
                                        var19.method379(arg7 + 1, arg10, 50);
                                    } else if (arg2 == 3) {
                                        var19.method379(arg7, arg10, 50);
                                    }
                                } else {
                                    var19.method379(arg7, arg10 - -1, 50);
                                }
                            }
                            if (var12.field9006 != 0 && arg9 != null) {
                                arg9.method1549(536870912, arg2, arg7, arg10, arg5, var12.field9057, !var12.field9046);
                            }
                        } else if (arg5 == 9) {
                            class613 var42;
                            if (var24) {
                                class156 var41 = new class156(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg7, arg7, arg10, arg10, arg5, arg2, var23);
                                if (var41.method236((byte) -84)) {
                                    var41.method230(arg6, 21670);
                                }
                                var42 = var41;
                            } else {
                                var42 = new class462(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg7, arg7 + -1 - -var13, arg10, var14 + -1 + arg10, arg5, arg2, arg3);
                            }
                            class631.method3538(var42, false);
                            if (var12.field9006 != 0 && arg9 != null) {
                                arg9.method1546(var13, (byte) 104, var14, !var12.field9046, arg7, arg10, var12.field9057);
                            }
                            if (~var12.field9017 != -65) {
                                class24.method129(arg8, arg7, arg10, var12.field9017);
                            }
                        } else if (~arg5 == -5) {
                            class94 var43;
                            if (!var24) {
                                var43 = new class654(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, 0, 0, arg5, arg2, arg3);
                            } else {
                                class542 var44 = new class542(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, 0, 0, arg5, arg2);
                                if (var44.method236((byte) -101)) {
                                    var44.method230(arg6, 21670);
                                }
                                var43 = var44;
                            }
                            class171.method933(arg8, arg7, arg10, var43, (class94) null);
                        } else if (arg5 == 5) {
                            int var45 = 65;
                            class49 var46 = (class49) class578.method3272(arg8, arg7, arg10);
                            if (var46 != null) {
                                var45 = class364.field4891.method2134(var46.method238(6518), true).field9017 - -1;
                            }
                            class94 var47;
                            if (!var24) {
                                var47 = new class654(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, class583.field8284[arg2] * var45, class553.field7907[arg2] * var45, arg5, arg2, arg3);
                            } else {
                                class542 var48 = new class542(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, class583.field8284[arg2] * var45, class553.field7907[arg2] * var45, arg5, arg2);
                                var47 = var48;
                                if (var48.method236((byte) -47)) {
                                    var48.method230(arg6, 21670);
                                }
                            }
                            class171.method933(arg8, arg7, arg10, var47, (class94) null);
                        } else if (arg5 == 6) {
                            int var49 = 33;
                            class49 var50 = (class49) class578.method3272(arg8, arg7, arg10);
                            if (var50 != null) {
                                var49 = 1 + class364.field4891.method2134(var50.method238(6518), true).field9017 / 2;
                            }
                            class94 var52;
                            if (var24) {
                                class542 var51 = new class542(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, class583.field8284[arg2] * var49, class553.field7907[arg2] * var49, arg5, arg2 + 4);
                                var52 = var51;
                                if (var51.method236((byte) -81)) {
                                    var51.method230(arg6, 21670);
                                }
                            } else {
                                var52 = new class654(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, class280.field3481[arg2] * var49, class619.field8757[arg2] * var49, arg5, arg2 + 4, arg3);
                            }
                            class171.method933(arg8, arg7, arg10, var52, (class94) null);
                        } else if (~arg5 == -8) {
                            int var53 = 3 & arg2 - -2;
                            class94 var55;
                            if (var24) {
                                class542 var54 = new class542(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, 0, 0, arg5, var53 + 4);
                                var55 = var54;
                                if (var54.method236((byte) -100)) {
                                    var54.method230(arg6, 21670);
                                }
                            } else {
                                var55 = new class654(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, 0, 0, arg5, var53 - -4, arg3);
                            }
                            class171.method933(arg8, arg7, arg10, var55, (class94) null);
                        } else if (~arg5 == -9) {
                            int var56 = 3 & arg2 + 2;
                            int var57 = 33;
                            class49 var58 = (class49) class578.method3272(arg8, arg7, arg10);
                            if (var58 != null) {
                                var57 = class364.field4891.method2134(var58.method238(6518), true).field9017 / 2 - -1;
                            }
                            class94 var61;
                            class94 var62;
                            if (var24) {
                                class542 var59 = new class542(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, class280.field3481[arg2] * var57, class619.field8757[arg2] * var57, arg5, arg2 + 4);
                                class542 var60 = new class542(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, 0, 0, arg5, var56 + 4);
                                if (var59.method236((byte) -49)) {
                                    var59.method230(arg6, 21670);
                                }
                                if (var60.method236((byte) -78)) {
                                    var60.method230(arg6, 21670);
                                }
                                var61 = var59;
                                var62 = var60;
                            } else {
                                class654 var63 = new class654(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, class280.field3481[arg2] * var57, class619.field8757[arg2] * var57, arg5, arg2 - -4, arg3);
                                var61 = var63;
                                class654 var64 = new class654(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, 0, 0, arg5, var56 + 4, arg3);
                                var62 = var64;
                            }
                            class171.method933(arg8, arg7, arg10, var61, var62);
                        } else {
                            int var65 = -29 % ((48 - arg4) / 33);
                        }
                    } else {
                        class156 var66 = null;
                        class613 var67;
                        int var68;
                        if (!var24) {
                            var67 = new class462(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg7, arg7 + var13 + -1, arg10, arg10 - -var14 + -1, arg5, arg2, arg3);
                            var68 = 15;
                        } else {
                            class156 var69 = new class156(arg6, var12, arg8, arg1, var21, var20, var22, super.field8821, arg7, arg7 - (-var13 + 1), arg10, var14 + -1 + arg10, arg5, arg2, var23);
                            var67 = var69;
                            var68 = var69.method841(false);
                            var66 = var69;
                        }
                        if (class631.method3538(var67, false)) {
                            if (var66 != null && var66.method236((byte) -81)) {
                                var66.method230(arg6, 21670);
                            }
                            if (var12.field9014 && class90.field910) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var70 >= ~var13; ++var70) {
                                    for (int var71 = 0; var71 <= var14; ++var71) {
                                        var19.method379(arg7 + var70, arg10 + var71, var68);
                                    }
                                }
                            }
                        }
                        if (var12.field9006 != 0 && arg9 != null) {
                            arg9.method1546(var13, (byte) 104, var14, !var12.field9046, arg7, arg10, var12.field9057);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IIIZ)V", line = 1662)
    public class476(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class156.field1748, class573.field8132);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLr;B)V", line = 1066)
    public final void method2741(boolean arg0, class564 arg1, byte arg2) {
        if (arg2 >= -93) {
            this.field6859 = -115;
        }
        class267.method1575();
        ++field6863;
        if (!arg0) {
            if (super.field8807 > 1) {
                for (int var4 = 0; ~var4 > ~super.field8816; ++var4) {
                    for (int var5 = 0; var5 < super.field8811; ++var5) {
                        if ((class16.field131[1][var4][var5] & 2) == 2) {
                            class701.method3869(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~var6 > ~super.field8807; ++var6) {
                for (int var7 = 0; var7 <= super.field8811; ++var7) {
                    for (int var8 = 0; ~super.field8816 <= ~var8; ++var8) {
                        if ((super.field8815[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && (super.field8815[var6][var8][var11 + -1] & 4) != 0 && -var11 + var12 < 10) {
                                --var11;
                            }
                            while (super.field8811 > var12 && ~(super.field8815[var6][var8][var12 + 1] & 4) != -1 && ~(var12 - var11) > -11) {
                                ++var12;
                            }
                            label117: while (~var9 < -1 && ~(var10 - var9) > -11) {
                                for (int var13 = var11; var12 >= var13; ++var13) {
                                    if ((4 & super.field8815[var6][var9 + -1][var13]) == 0) {
                                        break label117;
                                    }
                                }
                                --var9;
                            }
                            label104: while (~var10 > ~super.field8816 && -var9 + var10 < 10) {
                                for (int var14 = var11; var12 >= var14; ++var14) {
                                    if (~(super.field8815[var6][var10 - -1][var14] & 4) == -1) {
                                        break label104;
                                    }
                                }
                                ++var10;
                            }
                            if ((-var9 + var10 + 1) * (-var11 + 1 + var12) >= 4) {
                                int var15 = super.field8806[var6][var9][var11];
                                class181.method1101(268435455, var6, (var12 << 9) + 512, var15, var9 << 9, var11 << 9, (var10 << 9) + 512, 4, var15);
                                for (int var16 = var9; var10 >= var16; ++var16) {
                                    for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                                        super.field8815[var6][var16][var17] = (byte) class105.method572(super.field8815[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class212.method1260(false);
        }
        super.field8815 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILjw;ILr;II)V", line = 1206)
    public final void method2742(int arg0, int arg1, class263 arg2, int arg3, class564 arg4, int arg5, int arg6) {
        ++field6857;
        class49 var8 = null;
        if (arg3 == 0) {
            var8 = (class49) class578.method3272(arg5, arg0, arg6);
        }
        if (arg3 == 1) {
            var8 = (class49) class411.method2298(arg5, arg0, arg6);
        }
        if (~arg3 == -3) {
            var8 = (class49) class362.method2121(arg5, arg0, arg6, field6870 != null ? field6870 : (field6870 = method2747("gda")));
        }
        if (~arg3 == -4) {
            var8 = (class49) class328.method1845(arg5, arg0, arg6);
        }
        if (var8 != null) {
            class638 var9 = class364.field4891.method2134(var8.method238(6518), true);
            int var10 = var8.method241((byte) 29);
            int var11 = var8.method237(false);
            if (var9.method3587((byte) 104)) {
                class487.method2808(-89, arg0, arg5, arg6, var9);
            }
            if (var8.method236((byte) -102)) {
                var8.method232(arg4, 6905);
            }
            if (~arg3 == -1) {
                class202.method1208(arg5, arg0, arg6);
                if (~var9.field9006 != -1) {
                    arg2.method1550(var11, !var9.field9046, arg6, var9.field9057, arg0, -28591, var10);
                }
                if (var9.field9027 == 1) {
                    if (~var11 != -1) {
                        if (~var11 == -2) {
                            class361.method2119(arg6 + 1, arg0, arg5, (byte) 126, 2);
                        } else if (var11 == 2) {
                            class361.method2119(arg6, arg0 - -1, arg5, (byte) 126, 1);
                        } else if (~var11 == -4) {
                            class361.method2119(arg6, arg0, arg5, (byte) 126, 2);
                        }
                    } else {
                        class361.method2119(arg6, arg0, arg5, (byte) 126, 1);
                    }
                }
            } else if (~arg3 != -2) {
                if (~arg3 == -3) {
                    class340.method1965(arg5, arg0, arg6, field6870 != null ? field6870 : (field6870 = method2747("gda")));
                    if (var9.field9006 != 0 && ~(arg0 - -var9.field9051) > ~super.field8816 && super.field8811 > var9.field9051 + arg6 && super.field8816 > var9.field9060 + arg0 && ~(var9.field9060 + arg6) > ~super.field8811) {
                        arg2.method1547(var9.field9051, !var9.field9046, var9.field9057, (byte) 76, arg0, arg6, var9.field9060, var11);
                    }
                } else if (arg3 == 3) {
                    class293.method1723(arg5, arg0, arg6);
                    if (var9.field9006 == 1) {
                        arg2.method1544(arg6, arg0, -262145);
                    }
                }
            } else {
                class224.method1355(arg5, arg0, arg6);
            }
        }
        if (arg1 >= -63) {
            field6867 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIBILnp;Lr;III[I)V", line = 1306)
    public final void method2743(int arg0, int arg1, int arg2, byte arg3, int arg4, class115 arg5, class564 arg6, int arg7, int arg8, int arg9, int[] arg10) {
        ++field6868;
        if (!super.field8821) {
            boolean var12 = false;
            if (arg10 != null) {
                arg10[0] = -1;
            }
            if (arg3 > -33) {
                field6867 = null;
            }
            class390 var13 = null;
            int var14 = (7 & arg7) * 8;
            int var15 = (arg0 & 7) * 8;
            while (true) {
                while (~arg5.field1218 > ~arg5.field1269.length) {
                    int var20 = arg5.method620((byte) 55);
                    if (~var20 == -1) {
                        var13 = new class390(arg5);
                    } else if (var20 == 1) {
                        int var34 = arg5.method620((byte) -128);
                        if (var34 > 0) {
                            for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                class241 var36 = new class241(arg6, arg5, 2);
                                if (var36.field2994 == 31) {
                                    class635 var37 = class211.field2553.method2805(200, arg5.method643((byte) -77));
                                    var36.method1435(var37.field8941, -94, var37.field8944, var37.field8942, var37.field8947);
                                }
                                if (arg6.method953() > 0) {
                                    class670 var38 = var36.field2980;
                                    int var39 = var38.method3711(1795643394) >> 9;
                                    int var40 = var38.method3706((byte) 121) >> 9;
                                    if (~var36.field2983 == ~arg1 && var14 <= var39 && ~(var14 + 8) < ~var39 && var15 <= var40 && var40 < var15 - -8) {
                                        int var41 = class345.method2057(var38.method3711(1795643394) & 4095, 4095 & var38.method3706((byte) 122), arg8, 53) + (arg2 << 9);
                                        int var42 = (arg4 << 9) - -class575.method3256(2, 4095 & var38.method3706((byte) -64), 4095 & var38.method3711(1795643394), arg8);
                                        int var43 = var41 >> 9;
                                        int var44 = var42 >> 9;
                                        if (var43 >= 0 && var44 >= 0 && super.field8816 > var43 && ~var44 > ~super.field8811) {
                                            var38.method257(var42, var41, super.field8806[arg1][var43][var44] + -var38.method3703((byte) -29), (byte) 67);
                                            class492.method2856(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class390();
                        }
                        var13.method2218(true, arg5);
                    } else if (~var20 == -129) {
                        if (arg10 != null) {
                            arg10[0] = arg5.method643((byte) -77);
                            arg10[1] = arg5.method676(-5);
                            arg10[2] = arg5.method676(-5);
                            arg10[3] = arg5.method676(-5);
                            arg10[4] = arg5.method643((byte) -77);
                        } else {
                            arg5.field1218 += 10;
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field8823 == null) {
                            super.field8823 = new byte[4][][];
                        }
                        for (int var21 = 0; ~var21 > -5; ++var21) {
                            byte var22 = arg5.method657(false);
                            if (~var22 == -1 && super.field8823[arg9] != null) {
                                if (~var21 >= ~arg1) {
                                    int var23 = arg2;
                                    int var24 = arg2 + 7;
                                    int var25 = arg4;
                                    if (~var24 <= -1) {
                                        if (super.field8816 <= var24) {
                                            var24 = super.field8816;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (~arg2 <= -1) {
                                        if (~arg2 <= ~super.field8816) {
                                            var23 = super.field8816;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    if (~arg4 <= -1) {
                                        if (super.field8811 <= arg4) {
                                            var25 = super.field8811;
                                        }
                                    } else {
                                        var25 = 0;
                                    }
                                    int var26 = arg4 - -7;
                                    if (var26 < 0) {
                                        var26 = 0;
                                    } else if (super.field8811 <= var26) {
                                        var26 = super.field8811;
                                    }
                                    while (var23 < var24) {
                                        while (~var26 < ~var25) {
                                            super.field8823[arg9][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field8823[arg9] == null) {
                                    super.field8823[arg9] = new byte[super.field8816 + 1][super.field8811 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg5.method657(false);
                                        if (~arg1 <= ~var21) {
                                            for (int var30 = var27; ~var30 > ~(var27 + 4); ++var30) {
                                                for (int var31 = var28; ~(var28 - -4) < ~var31; ++var31) {
                                                    if (~var30 <= ~var14 && ~(var14 + 8) < ~var30 && var15 <= var31 && ~var15 > ~(var15 + 8)) {
                                                        int var32 = arg2 + class486.method2802(7 & var30, 451, var31 & 7, arg8);
                                                        int var33 = arg4 - -class619.method3455(arg8, 22610, 7 & var30, var31 & 7);
                                                        if (~var32 <= -1 && ~var32 > ~super.field8816 && var33 >= 0 && ~super.field8811 < ~var33) {
                                                            super.field8823[arg9][var32][var33] = var29;
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
                    class591.method3329(arg2 >> 3, (byte) -99, arg4 >> 3, var13);
                }
                if (!var12 && super.field8823 != null && super.field8823[arg9] != null) {
                    int var16 = arg2 + 7;
                    int var17 = arg4 + 7;
                    for (int var18 = arg2; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg4; ~var19 > ~var17; ++var19) {
                            super.field8823[arg9][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBILhca;)V", line = 1607)
    public static final void method2744(int arg0, int arg1, byte arg2, int arg3, class190 arg4) {
        ++field6866;
        long var5 = (long) (arg0 << 28 | arg1 << 14 | arg3);
        class310 var7 = (class310) class200.field2354.method3669(var5, -1);
        if (var7 == null) {
            class310 var8 = new class310();
            class200.field2354.method3671(false, var8, var5);
            var8.field3833.method3425(arg4, false);
        } else {
            class487 var9 = class19.field153.method272(arg4.field2177, -11824);
            int var10 = var9.field7062;
            if (var9.field7064 == 1) {
                var10 = (arg4.field2179 + 1) * var10;
            }
            for (class190 var11 = (class190) var7.field3833.method3434((byte) 2); var11 != null; var11 = (class190) var7.field3833.method3430(true)) {
                class487 var12 = class19.field153.method272(var11.field2177, arg2 ^ -11783);
                int var13 = var12.field7062;
                if (~var12.field7064 == -2) {
                    var13 = (var11.field2179 - -1) * var13;
                }
                if (var10 > var13) {
                    class357.method2101(arg2 ^ -18, var11, arg4);
                    return;
                }
            }
            var7.field3833.method3425(arg4, false);
            if (arg2 != 41) {
                method2744(111, 69, (byte) 122, 57, (class190) null);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([Ljw;ILr;I[BI)V", line = 1665)
    public final void method2745(class263[] arg0, int arg1, class564 arg2, int arg3, byte[] arg4, int arg5) {
        ++field6858;
        class115 var7 = new class115(arg4);
        int var8 = arg1;
        while (true) {
            int var9 = var7.method663(31856);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method662(true);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method620((byte) -128);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = var13 - -arg5;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && ~(super.field8816 + -1) < ~var18 && var19 < super.field8811 + -1) {
                    class263 var20 = null;
                    if (!super.field8821) {
                        int var21 = var14;
                        if ((2 & class16.field131[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg0[var21];
                        }
                    }
                    this.method2740(var8, var14, var17, -1, 102, var16, arg2, var18, var14, var20, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 1735)
    public static void method2746(byte arg0) {
        if (arg0 >= -125) {
            method2746((byte) -44);
        }
        field6867 = null;
        field6860 = null;
    }
}
