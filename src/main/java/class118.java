import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class118 extends class273 {

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    private int field1983 = 0;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    private int field1990 = 4096;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "[Lub;")
    public static class169[] field1982 = new class169[14];

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "[Z")
    public static boolean[] field1991 = new boolean[100];

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field1993 = new String[100];

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V")
    public static final void method864(byte arg0) {
        ++field1988;
        if (class116.field1949) {
            class116.field1949 = false;
            class233.field3693 = null;
            class190.field3106 = null;
            if (arg0 < 88) {
                field1991 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            field1993 = null;
        }
        ++field1987;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field1990 = arg0.method996(65280);
            }
        } else {
            this.field1983 = arg0.method996(65280);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZILsb;Lsb;)V")
    public static final void method865(boolean arg0, int arg1, class124 arg2, class124 arg3) {
        class65.field1069 = arg0;
        class219.field3515 = arg3;
        if (arg1 != -15219) {
            method864((byte) 78);
        }
        ++field1985;
        class104.field1588 = arg2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII[B[Lml;IIZII)[I")
    public static final int[] method866(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class13[] arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        byte var11;
        if (arg8) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg8) {
            for (int var12 = 0; ~var12 > -9; ++var12) {
                for (int var13 = 0; ~var13 > -9; ++var13) {
                    int var14 = class248.method1655(7 & var12, false, 7 & var13, arg2) + arg9;
                    int var15 = class113.method834(arg2, var12 & 7, var13 & 7, (byte) 27) + arg6;
                    if (var14 > 0 && var14 < 103 && var15 > 0 && ~var15 > -104) {
                        arg5[arg0].field171[var14][var15] = class64.method498(arg5[arg0].field171[var14][var15], -2097153);
                    }
                }
            }
        }
        class136 var16 = new class136(arg4);
        ++field1989;
        int var17 = (arg1 & 7) * 8;
        int var18 = (arg10 & 7) * 8;
        int var19 = arg10 << 3 & -64;
        int var20 = (-8 & arg1) << 3;
        for (int var21 = 0; var11 > var21; ++var21) {
            for (int var42 = 0; ~var42 > -65; ++var42) {
                for (int var43 = 0; ~var43 > -65; ++var43) {
                    if (arg3 == var21 && var42 >= var18 && var18 - -8 >= var42 && ~var17 >= ~var43 && var17 + 8 >= var43) {
                        if (~(var18 + 8) != ~var42 && var17 - -8 != var43) {
                            int var44 = class248.method1655(7 & var42, false, 7 & var43, arg2) + arg9;
                            int var45 = arg6 - -class113.method834(arg2, var42 & 7, 7 & var43, (byte) 27);
                            class238.method1575(1, var16, arg2, false, var45, arg0, arg8, var44, var20 + var43, var19 + var42);
                            if (var42 == 63 || ~var43 == -64) {
                                int var46 = ~var42 != -64 ? var42 : 64;
                                int var47 = ~var43 == -64 ? 64 : var43;
                                int var48;
                                int var49;
                                if (arg2 != 0) {
                                    if (~arg2 != -2) {
                                        if (arg2 == 2) {
                                            var48 = arg9 + 8 - (-var18 + var46);
                                            var49 = -var47 - -var17 + arg6 + 8;
                                        } else {
                                            var48 = arg9 - -8 - (-var17 + var47);
                                            var49 = -var18 - -var46 + arg6;
                                        }
                                    } else {
                                        var49 = arg6 + 8 - -var18 - var46;
                                        var48 = -var17 - (-var47 - arg9);
                                    }
                                } else {
                                    var49 = -var17 + var47 + arg6;
                                    var48 = arg9 - (-var46 + var18);
                                }
                                if (~var48 <= -1 && ~var48 > -105 && var49 >= 0 && var49 < 104) {
                                    class21.field327[var21][var48][var49] = class21.field327[var21][var44][var45];
                                }
                            }
                        } else {
                            int var50;
                            int var51;
                            if (~arg2 != -1) {
                                if (~arg2 != -2) {
                                    if (~arg2 == -3) {
                                        var50 = var17 - var43 + arg6 + 8;
                                        var51 = arg9 - -8 + -var42 + var18;
                                    } else {
                                        var50 = arg6 + var42 - var18;
                                        var51 = arg9 - -8 + -var43 + var17;
                                    }
                                } else {
                                    var51 = arg9 - var17 - -var43;
                                    var50 = -var42 + var18 + arg6 + 8;
                                }
                            } else {
                                var50 = -var17 - -var43 + arg6;
                                var51 = -var18 + var42 + arg9;
                            }
                            class238.method1575(arg7 ^ -1403374238, var16, 0, true, var50, arg0, arg8, var51, var20 + var43, var19 + var42);
                        }
                    } else {
                        class238.method1575(1, var16, 0, false, -1, 0, arg8, -1, 0, 0);
                    }
                }
            }
        }
        boolean var22 = false;
        boolean var23 = false;
        while (var16.field2263.length > var16.field2231) {
            int var24 = var16.method1012(4);
            if (~var24 == -129) {
                class228.field3623[0] = var16.method996(65280);
                class228.field3623[1] = var16.method1027((byte) 64);
                class228.field3623[2] = var16.method1027((byte) 64);
                class228.field3623[3] = var16.method1027((byte) 64);
                var22 = true;
                class228.field3623[4] = var16.method996(65280);
            } else {
                if (var24 != 129) {
                    --var16.field2231;
                    break;
                }
                for (int var29 = 0; ~var29 > -5; ++var29) {
                    byte var30 = var16.method981(false);
                    if (~var30 == -1) {
                        if (~arg3 <= ~var29) {
                            int var31 = arg6 - -7;
                            if (~var31 <= -1) {
                                if (var31 >= 104) {
                                    var31 = 104;
                                }
                            } else {
                                var31 = 0;
                            }
                            int var32 = arg9;
                            int var33 = arg6;
                            if (arg6 < 0) {
                                var33 = 0;
                            } else if (arg6 >= 104) {
                                var33 = 104;
                            }
                            if (~arg9 > -1) {
                                var32 = 0;
                            } else if (~arg9 <= -105) {
                                var32 = 104;
                            }
                            int var34 = arg9 + 7;
                            if (var34 < 0) {
                                var34 = 0;
                            } else if (~var34 <= -105) {
                                var34 = 104;
                            }
                            while (var32 < var34) {
                                while (var31 > var33) {
                                    class273.field4356[arg0][var32][var33] = 0;
                                    ++var33;
                                }
                                ++var32;
                            }
                        }
                    } else if (~var30 == -2) {
                        for (int var35 = 0; ~var35 > -65; var35 += 4) {
                            for (int var36 = 0; ~var36 > -65; var36 += 4) {
                                byte var37 = var16.method981(false);
                                if (~var29 >= ~arg3) {
                                    for (int var38 = var35; ~(var35 + 4) < ~var38; ++var38) {
                                        for (int var39 = var36; ~var39 > ~(var36 - -4); ++var39) {
                                            if (var38 >= var18 && ~var38 > ~(var18 - -8) && var39 >= var17 && var17 + 8 > var17) {
                                                int var40 = class248.method1655(var38 & 7, false, 7 & var39, arg2) + arg9;
                                                int var41 = class113.method834(arg2, var38 & 7, var39 & 7, (byte) 27) + arg6;
                                                if (var40 >= 0 && var40 < 104 && ~var41 <= -1 && var41 < 104) {
                                                    class273.field4356[arg0][var40][var41] = var37;
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
        if (arg7 != -1403374237) {
            field1984 = -118;
        }
        if (!var23) {
            int var25 = arg6 + 7;
            int var26 = arg9 - -7;
            for (int var27 = arg9; var27 < var26; ++var27) {
                for (int var28 = arg6; var25 > var28; ++var28) {
                    class273.field4356[arg0][var27][var28] = 0;
                }
            }
        }
        if (!var22) {
            return null;
        } else {
            return class228.field3623;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(JI)V")
    public static final void method867(long arg0, int arg1) {
        ++field1992;
        if (~arg0 != -1L) {
            for (int var3 = 0; ~var3 > ~class286.field4554; ++var3) {
                if (~class145.field2390[var3] == ~arg0) {
                    ++class107.field1629;
                    --class286.field4554;
                    for (int var4 = var3; var4 < class286.field4554; ++var4) {
                        class145.field2390[var4] = class145.field2390[var4 - -1];
                        class154.field2513[var4] = class154.field2513[var4 - -1];
                        class294.field4666[var4] = class294.field4666[var4 - -1];
                    }
                    class204.field3288 = class61.field1040;
                    class87.field1405.method607(194, (byte) 74);
                    class87.field1405.method967((byte) -8, arg0);
                    break;
                }
            }
            int var5 = 66 / ((65 - arg1) / 61);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            method864((byte) -36);
        }
        ++field1994;
        int[] var3 = super.field4359.method387((byte) 107, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(arg1, 0, (byte) -123);
            for (int var5 = 0; ~var5 > ~class26.field458; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1983 && ~this.field1990 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class118() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
    public static void method868(int arg0) {
        field1991 = null;
        field1993 = null;
        if (arg0 != 22882) {
            field1984 = -49;
        }
        field1982 = null;
    }
}
