import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class43 extends class182 {

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    private int field652 = 0;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    private int field654 = 4096;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "F")
    public static float field658 = 0.0F;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Ljava/lang/String;")
    public static String field651 = "Starting 3d Library";

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "[I")
    public static int[] field656;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZ)I")
    public static final int method256(int arg0, int arg1, boolean arg2) {
        int var3 = 0;
        while (~arg1 < -1) {
            var3 = var3 << 1 | arg0 & 1;
            --arg1;
            arg0 >>>= 1;
        }
        if (arg2) {
            field656 = null;
        }
        ++field661;
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public static final void method257(byte arg0) {
        class270.field4484.method97(99);
        if (arg0 == 114) {
            ++field660;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
    public static void method258(byte arg0) {
        field651 = null;
        if (arg0 <= -30) {
            field656 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field655;
        if (arg0) {
            field659 = 80;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field654 = arg1.method1821((byte) 51);
            }
        } else {
            this.field652 = arg1.method1821((byte) 51);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ[BIII[Llb;IIII)[I")
    public static final int[] method259(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, class311[] arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field657;
        int var11 = (7 & arg4) * 8;
        int var12 = (7 & arg9) * 8;
        if (!arg1) {
            for (int var13 = 0; ~var13 > -9; ++var13) {
                for (int var14 = 0; ~var14 > -9; ++var14) {
                    int var15 = class91.method639(var14 & 7, arg5, 7 & var13, 16383) + arg10;
                    int var16 = arg3 + class87.method613(var13 & 7, 7 & var14, arg5, 86);
                    if (~var15 < -1 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg6[arg8].field5006[var15][var16] = class15.method84(arg6[arg8].field5006[var15][var16], -2097153);
                    }
                }
            }
        }
        byte var17;
        if (!arg1) {
            var17 = 4;
        } else {
            var17 = 1;
        }
        class249 var18 = new class249(arg2);
        int var19 = (arg9 & -8) << 3;
        int var20 = (-8 & arg4) << 3;
        byte var21 = 0;
        if (arg0 <= 71) {
            method256(104, 41, false);
        }
        byte var22 = 0;
        if (arg5 != 1) {
            if (~arg5 == -3) {
                var21 = 1;
                var22 = 1;
            } else if (arg5 == 3) {
                var22 = 1;
            }
        } else {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var17; ++var23) {
            for (int var44 = 0; ~var44 > -65; ++var44) {
                for (int var45 = 0; var45 < 64; ++var45) {
                    if (arg7 == var23 && ~var44 <= ~var11 && ~var44 >= ~(var11 + 8) && var45 >= var12 && ~(var12 + 8) <= ~var45) {
                        if (var11 + 8 != var44 && var12 + 8 != var45) {
                            int var46 = class91.method639(7 & var45, arg5, 7 & var44, 16383) + arg10;
                            int var47 = arg3 - -class87.method613(7 & var44, 7 & var45, arg5, 85);
                            class88.method616(var47, arg8, var18, var21, (byte) -110, var46, var19 + var45, arg5, var22, var20 + var44, false, arg1);
                            if (var44 == 63 || ~var45 == -64) {
                                int var48 = ~var44 != -64 ? var44 : 64;
                                int var49 = var45 == 63 ? 64 : var45;
                                int var50;
                                int var51;
                                if (arg5 != 0) {
                                    if (~arg5 == -2) {
                                        var50 = var11 - (var48 - 8) + arg3;
                                        var51 = -var12 + var49 + arg10;
                                    } else if (arg5 == 2) {
                                        var50 = var12 + 8 + -var49 + arg3;
                                        var51 = arg10 + var11 + 8 + -var48;
                                    } else {
                                        var50 = -var11 + arg3 + var48;
                                        var51 = -var49 + 8 + var12 + arg10;
                                    }
                                } else {
                                    var50 = -var12 + var49 + arg3;
                                    var51 = -var11 - -var48 + arg10;
                                }
                                if (~var51 <= -1 && var51 < 104 && var50 >= 0 && ~var50 > -105) {
                                    class245.field4123[arg8][var51][var50] = class245.field4123[arg8][var22 + var46][var21 + var47];
                                }
                            }
                        } else {
                            int var52;
                            int var53;
                            if (~arg5 == -1) {
                                var52 = -var11 + arg10 + var44;
                                var53 = arg3 + var45 + -var12;
                            } else if (~arg5 == -2) {
                                var52 = arg10 + var45 + -var12;
                                var53 = -var44 + var11 + 8 + arg3;
                            } else if (~arg5 != -3) {
                                var53 = -var11 - (-var44 - arg3);
                                var52 = 8 - var45 + var12 + arg10;
                            } else {
                                var52 = arg10 + 8 + -var44 + var11;
                                var53 = arg3 - -var12 + 8 - var45;
                            }
                            class88.method616(var53, arg8, var18, 0, (byte) -110, var52, var19 + var45, 0, 0, var20 - -var44, true, arg1);
                        }
                    } else {
                        class88.method616(-1, 0, var18, 0, (byte) -110, -1, 0, 0, 0, 0, false, arg1);
                    }
                }
            }
        }
        boolean var24 = false;
        boolean var25 = false;
        while (var18.field4160 < var18.field4182.length) {
            int var26 = var18.method1802((byte) 92);
            if (var26 == 128) {
                var24 = true;
                class209.field3537[0] = var18.method1821((byte) 51);
                class209.field3537[1] = var18.method1762(-1);
                class209.field3537[2] = var18.method1762(-1);
                class209.field3537[3] = var18.method1762(-1);
                class209.field3537[4] = var18.method1821((byte) 51);
            } else {
                if (var26 != 129) {
                    --var18.field4160;
                    break;
                }
                for (int var31 = 0; ~var31 > -5; ++var31) {
                    byte var32 = var18.method1768(93);
                    if (~var32 == -1) {
                        if (var31 <= arg7) {
                            int var33 = arg10 + 7;
                            if (var33 >= 0) {
                                if (var33 >= 104) {
                                    var33 = 104;
                                }
                            } else {
                                var33 = 0;
                            }
                            int var34 = arg10;
                            if (arg10 >= 0) {
                                if (~arg10 <= -105) {
                                    var34 = 104;
                                }
                            } else {
                                var34 = 0;
                            }
                            int var35 = arg3;
                            if (~arg3 > -1) {
                                var35 = 0;
                            } else if (arg3 >= 104) {
                                var35 = 104;
                            }
                            int var36 = arg3 - -7;
                            if (var36 >= 0) {
                                if (var36 >= 104) {
                                    var36 = 104;
                                }
                            } else {
                                var36 = 0;
                            }
                            while (~var34 > ~var33) {
                                while (var36 > var35) {
                                    class12.field255[arg8][var34][var35] = 0;
                                    ++var35;
                                }
                                ++var34;
                            }
                        }
                    } else if (var32 == 1) {
                        for (int var37 = 0; var37 < 64; var37 += 4) {
                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                byte var39 = var18.method1768(105);
                                if (~var31 >= ~arg7) {
                                    for (int var40 = var37; var37 + 4 > var40; ++var40) {
                                        for (int var41 = var38; ~(var38 + 4) < ~var41; ++var41) {
                                            if (var40 >= var11 && ~(var11 - -8) < ~var40 && var41 >= var12 && ~(var12 + 8) < ~var12) {
                                                int var42 = arg10 - -class91.method639(7 & var41, arg5, 7 & var40, 16383);
                                                int var43 = arg3 + class87.method613(7 & var40, var41 & 7, arg5, 109);
                                                if (var42 >= 0 && var42 < 104 && var43 >= 0 && var43 < 104) {
                                                    class12.field255[arg8][var42][var43] = var39;
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
        if (!var25) {
            int var27 = arg10 + 7;
            int var28 = arg3 + 7;
            for (int var29 = arg10; ~var27 < ~var29; ++var29) {
                for (int var30 = arg3; ~var30 > ~var28; ++var30) {
                    class12.field255[arg8][var29][var30] = 0;
                }
            }
        }
        if (!var24) {
            return null;
        } else {
            return class209.field3537;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class43() {
        super(1, true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field653;
        int[] var3 = super.field2911.method77(arg1, -55);
        if (arg0) {
            return null;
        } else {
            if (super.field2911.field287) {
                int[] var4 = this.method1323(0, -17707, arg1);
                for (int var5 = 0; var5 < class4.field116; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = var6 >= this.field652 && ~this.field654 <= ~var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }
}
