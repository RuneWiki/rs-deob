import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class212 extends class23 {

    @OriginalMember(owner = "client!te", name = "U", descriptor = "[S")
    private short[] field4015 = new short[257];

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    private int field4019 = 0;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Li;")
    public static class88 field4013 = class208.method1425(105, "sl_flags");

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "Li;")
    public static class88 field4011 = class208.method1425(105, "::tele 0)1");

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "[Li;")
    public static class88[] field4021 = new class88[100];

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Li;")
    public static class88 field4020 = class208.method1425(105, "m");

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "Li;")
    public static class88 field4025 = class208.method1425(105, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "[I")
    private int[] field4017;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "[I")
    private int[] field4028;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "[[I")
    private int[][] field4026;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (this.field4026 == null) {
            this.field4026 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field4022;
        if (this.field4026.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field4019 == 2) {
                this.method1452(true);
            }
            class108.method742(-10798);
            this.method1454((byte) 84);
            if (arg0 != -69) {
                this.field4028 = null;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(IB)[I")
    private final int[] method1448(int arg0, byte arg1) {
        ++field4029;
        if (arg0 < 0) {
            return this.field4017;
        } else if (this.field4026.length <= arg0) {
            return this.field4028;
        } else {
            if (arg1 != -114) {
                this.method11((class46) null, -12, -15);
            }
            return this.field4026[arg0];
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II[Lia;III[BZIII)V")
    public static final void method1449(int arg0, int arg1, class89[] arg2, int arg3, int arg4, int arg5, byte[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        ++field4023;
        if (arg3 > 48) {
            int var11 = -1;
            class46 var12 = new class46(arg6);
            while (true) {
                int var13 = var12.method332((byte) -112);
                if (var13 == 0) {
                    return;
                }
                int var14 = 0;
                var11 += var13;
                while (true) {
                    int var15 = var12.method350(106);
                    if (var15 == 0) {
                        break;
                    }
                    var14 += var15 + -1;
                    int var16 = var14 >> 6 & 63;
                    int var17 = 63 & var14;
                    int var18 = var14 >> 12;
                    int var19 = var12.method347(26119);
                    int var20 = var19 >> 2;
                    int var21 = var19 & 3;
                    if (~arg8 == ~var18 && ~arg1 >= ~var16 && ~var16 > ~(arg1 + 8) && arg4 <= var17 && var17 < arg4 + 8) {
                        class148 var22 = class190.method1323(var11, -12450);
                        int var23 = class70.method469(var22.field2776, arg0, var17 & 7, 7 & var16, (byte) 126, var22.field2796, var21) + arg10;
                        int var24 = class109.method744(7 & var17, var16 & 7, var21, var22.field2796, false, var22.field2776, arg0) + arg9;
                        if (var23 > 0 && var24 > 0 && ~var23 > -104 && var24 < 103) {
                            class89 var25 = null;
                            if (!arg7) {
                                int var26 = arg5;
                                if ((2 & class116.field2100[1][var23][var24]) == 2) {
                                    var26 = arg5 - 1;
                                }
                                if (var26 >= 0) {
                                    var25 = arg2[var26];
                                }
                            }
                            class223.method1505((byte) 43, !arg7, arg5, arg7, arg0 + var21 & 3, var20, class245.field4499, var11, arg5, var25, var24, var23);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public static void method1450(int arg0) {
        field4021 = null;
        field4013 = null;
        field4020 = null;
        field4025 = null;
        if (arg0 != 7400) {
            field4020 = null;
        }
        field4011 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field4027;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[] var4 = this.method120(arg0, false, 0);
            for (int var5 = 0; ~var5 > ~class70.field1276; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field4015[var6];
            }
        }
        if (arg1 < 19) {
            this.field4028 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBIZ)V")
    public static final void method1451(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        ++field4014;
        if (arg2 >= 1) {
            if (class211.method1447(0, arg1)) {
                class155.method1057(arg0, (byte) -119, arg4, -1, arg3, class78.field1418[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
    private final void method1452(boolean arg0) {
        ++field4024;
        int[] var2 = this.field4026[0];
        int[] var3 = this.field4026[1];
        if (!arg0) {
            this.field4019 = 59;
        }
        int[] var4 = this.field4026[this.field4026.length - 1];
        int[] var5 = this.field4026[this.field4026.length + -2];
        this.field4017 = new int[] { var2[0] - (var3[0] + -var2[0]), var2[1] - var3[1] - -var2[1] };
        this.field4028 = new int[] { var5[0] - var4[0] - -var5[0], var5[1] - (var4[1] - var5[1]) };
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class212() {
        super(1, true);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BILnb;)Z")
    public static final boolean method1453(byte arg0, int arg1, class144 arg2) {
        ++field4016;
        byte[] var3 = arg2.method958(arg1, 0);
        if (arg0 != 53) {
            field4025 = null;
        }
        if (var3 == null) {
            return false;
        } else {
            class244.method1603(64, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    private final void method1454(byte arg0) {
        int var2 = this.field4019;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field4026.length + -1 && ~var4 <= ~this.field4026[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field4026[var5 + -1];
                    int[] var7 = this.field4026[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class150.field2922[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field4015[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field4026.length + -1 && ~var13 <= ~this.field4026[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field4026[var14];
                    int[] var16 = this.field4026[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var16[1] * var18 - -(var15[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field4015[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field4026.length + -1 && var21 >= this.field4026[var22][0]; ++var22) {
                }
                int[] var23 = this.field4026[var22 + -1];
                int[] var24 = this.field4026[var22];
                int var25 = this.method1448(var22 + -2, (byte) -114)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1448(var22 - -1, (byte) -114)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 - var25 + var26;
                int var33 = (var29 * var31 >> 12) * var30 >> 12;
                int var34 = -var25 + var27;
                int var35 = -var31 + var25 - var26;
                int var36 = var30 * var35 >> 12;
                int var37 = var29 * var34 >> 12;
                int var38 = var36 + var37 + var26 + var33;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4015[var20] = (short) var38;
            }
        }
        ++field4012;
        if (arg0 != 84) {
            this.field4017 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field4019 = arg0.method347(arg1 ^ -26118);
            this.field4026 = new int[arg0.method347(arg1 ^ -26118)][2];
            for (int var4 = 0; ~this.field4026.length < ~var4; ++var4) {
                this.field4026[var4][0] = arg0.method301(38);
                this.field4026[var4][1] = arg0.method301(121);
            }
        }
        if (arg1 == -3) {
            ++field4018;
        }
    }
}
