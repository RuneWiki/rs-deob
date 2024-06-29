import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class244 extends class224 {

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "[S")
    private short[] field3912 = new short[257];

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    private int field3903 = 0;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Z")
    public static boolean field3910 = false;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Ldl;")
    public static class123 field3913;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[I")
    private int[] field3900;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[I")
    private int[] field3909;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "[[I")
    private int[][] field3898;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IZ)[I")
    private final int[] method1643(int arg0, boolean arg1) {
        ++field3906;
        if (arg0 < 0) {
            return this.field3909;
        } else if (arg1) {
            return null;
        } else {
            return ~this.field3898.length >= ~arg0 ? this.field3900 : this.field3898[arg0];
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static void method1644(int arg0) {
        if (arg0 != 1) {
            method1647((String) null, -26, -114, -80, -47, 36L, (short) 92, (String) null);
        }
        field3913 = null;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (this.field3898 == null) {
            this.field3898 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3904;
        if (this.field3898.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field3903 == 2) {
                this.method1648(17586);
            }
            class189.method1329(21822);
            if (arg0 >= -4) {
                this.method1645((byte) 4);
            }
            this.method1645((byte) -126);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    private final void method1645(byte arg0) {
        if (arg0 >= -120) {
            this.field3903 = -90;
        }
        int var2 = this.field3903;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field3898.length + -1) && ~var4 <= ~this.field3898[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3898[var5];
                    int[] var7 = this.field3898[var5 + -1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                    int var9 = -class216.field3527[(var8 & 8182) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3912[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field3898.length + -1) < ~var14 && var13 >= this.field3898[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3898[var14];
                    int[] var16 = this.field3898[var14 - 1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] - var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3912[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field3898.length + -1 > var22 && var21 >= this.field3898[var22][0]; ++var22) {
                }
                int[] var23 = this.field3898[var22 + -1];
                int[] var24 = this.field3898[var22];
                int var25 = this.method1643(var22 + -2, false)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1643(var22 + 1, false)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + var26 - var25;
                int var32 = -var26 + -var31 + var25;
                int var34 = var30 * var32 >> 12;
                int var35 = var27 - var25;
                int var36 = (var29 * var31 >> 12) * var30 >> 12;
                int var37 = var29 * var35 >> 12;
                int var38 = var26 + var34 + var36 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3912[var20] = (short) var38;
            }
        }
        ++field3897;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
    public static final void method1646(int arg0, byte arg1) {
        class94.field1460.method1425(arg0, -118);
        ++field3902;
        if (arg1 < 108) {
            field3901 = -54;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;IIIIJSLjava/lang/String;)V")
    public static final void method1647(String arg0, int arg1, int arg2, int arg3, int arg4, long arg5, short arg6, String arg7) {
        ++field3899;
        if (!class286.field4542) {
            if (~class245.field3920 > -501) {
                class96.field1491[class245.field3920] = arg0;
                class19.field225[class245.field3920] = arg7;
                client.field2330[class245.field3920] = arg3 != -1 ? arg3 : class191.field3019;
                class2.field21[class245.field3920] = arg6;
                class25.field347[class245.field3920] = arg5;
                class100.field1553[class245.field3920] = arg4;
                class222.field3591[class245.field3920] = arg2;
                ++class245.field3920;
            }
            if (arg1 != 0) {
                method1647((String) null, 36, -105, -83, -55, -128L, (short) -16, (String) null);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class244() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    private final void method1648(int arg0) {
        ++field3908;
        int[] var2 = this.field3898[0];
        int[] var3 = this.field3898[1];
        int[] var4 = this.field3898[this.field3898.length + -1];
        int[] var5 = this.field3898[this.field3898.length + -2];
        this.field3909 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
        if (arg0 != 17586) {
            field3910 = false;
        }
        this.field3900 = new int[] { var5[0] + -var4[0] + var5[0], var5[1] - var4[1] - -var5[1] };
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 >= -46) {
            field3907 = -123;
        }
        if (~arg1 == -1) {
            this.field3903 = arg0.method201(255);
            this.field3898 = new int[arg0.method201(255)][2];
            for (int var4 = 0; var4 < this.field3898.length; ++var4) {
                this.field3898[var4][0] = arg0.method190(-3);
                this.field3898[var4][1] = arg0.method190(-3);
            }
        }
        ++field3905;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            int[] var3 = super.field3625.method1862(arg0, (byte) 52);
            ++field3911;
            if (super.field3625.field4425) {
                int[] var4 = this.method1527(arg0, 0, (byte) 84);
                for (int var5 = 0; ~var5 > ~class78.field1108; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field3912[var6];
                }
            }
            return var3;
        }
    }
}
