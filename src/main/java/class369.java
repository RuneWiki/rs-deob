import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class369 extends class264 {

    @OriginalMember(owner = "client!um", name = "bb", descriptor = "I")
    private int field5090 = 0;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "[S")
    private short[] field5080 = new short[257];

    @OriginalMember(owner = "client!um", name = "T", descriptor = "Lch;")
    public static class151 field5082 = new class151("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!um", name = "V", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!um", name = "X", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!um", name = "Z", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!um", name = "cb", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!um", name = "db", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!um", name = "ab", descriptor = "Lde;")
    public static class257 field5089;

    @OriginalMember(owner = "client!um", name = "Y", descriptor = "Lrn;")
    public static class417 field5087;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "[I")
    private int[] field5078;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "[I")
    private int[] field5081;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "[[I")
    private int[][] field5077;

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 3)
    public class369() {
        super(1, true);
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V", line = 8)
    private final void method2257(int arg0) {
        int var2 = this.field5090;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field5077.length + -1) && ~this.field5077[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field5077[var5 + -1];
                    int[] var7 = this.field5077[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class41.field550[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5080[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field5077.length + -1 > var14 && ~var13 <= ~this.field5077[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field5077[var14 + -1];
                    int[] var16 = this.field5077[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5080[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field5077.length + -1 > var22 && var21 >= this.field5077[var22][0]; ++var22) {
                }
                int[] var23 = this.field5077[var22 + -1];
                int[] var24 = this.field5077[var22];
                int var25 = this.method2258(var22 + -2, (byte) 119)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2258(var22 + 1, (byte) 109)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var28 + var26;
                int var32 = -var26 + var25 + -var31;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var36 + var35 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5080[var20] = (short) var38;
            }
        }
        if (arg0 <= -122) {
            ++field5091;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)[I", line = 188)
    private final int[] method2258(int arg0, byte arg1) {
        ++field5085;
        if (arg1 <= 105) {
            this.method2258(58, (byte) 115);
        }
        if (~arg0 > -1) {
            return this.field5081;
        } else {
            return this.field5077.length <= arg0 ? this.field5078 : this.field5077[arg0];
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V", line = 211)
    private final void method2259(boolean arg0) {
        ++field5083;
        if (!arg0) {
            this.field5080 = null;
        }
        int[] var2 = this.field5077[0];
        int[] var3 = this.field5077[1];
        int[] var4 = this.field5077[this.field5077.length - 2];
        int[] var5 = this.field5077[this.field5077.length + -1];
        this.field5081 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
        this.field5078 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(I)V", line = 235)
    public static void method2260(int arg0) {
        field5089 = null;
        field5082 = null;
        field5087 = null;
        if (arg0 != -12613) {
            method2261(87, 0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I", line = 247)
    public final int[] method90(int arg0, int arg1) {
        ++field5079;
        int[] var3 = super.field3808.method958((byte) 115, arg0);
        if (arg1 != 21034) {
            this.field5080 = null;
        }
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(arg0, (byte) -108, 0);
            for (int var5 = 0; class478.field6792 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5080[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLkk;I)V", line = 297)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field5084;
        if (~arg2 == -1) {
            this.field5090 = arg1.method1172((byte) 22);
            this.field5077 = new int[arg1.method1172((byte) -118)][2];
            for (int var4 = 0; ~this.field5077.length < ~var4; ++var4) {
                this.field5077[var4][0] = arg1.method1134(-16848);
                this.field5077[var4][1] = arg1.method1134(-16848);
            }
        }
        if (arg0 <= 31) {
            this.method2258(28, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)Z", line = 326)
    public static final boolean method2261(int arg0, int arg1) {
        ++field5092;
        if (class340.field4698[arg1]) {
            return true;
        } else if (!class38.field479.method2630(-1, arg1)) {
            return false;
        } else {
            int var2 = class38.field479.method2638(1, arg1);
            if (var2 == 0) {
                class340.field4698[arg1] = true;
                return true;
            } else {
                if (class263.field3787[arg1] == null) {
                    class263.field3787[arg1] = new class172[var2];
                }
                for (int var3 = arg0; ~var3 > ~var2; ++var3) {
                    if (class263.field3787[arg1][var3] == null) {
                        byte[] var4 = class38.field479.method2633(arg1, var3, -85);
                        if (var4 != null) {
                            class172 var5 = class263.field3787[arg1][var3] = new class172();
                            var5.field2543 = (arg1 << 16) - -var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method1251(new class161(var4), (byte) -103);
                        }
                    }
                }
                class340.field4698[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V", line = 384)
    public final void method95(int arg0) {
        if (this.field5077 == null) {
            this.field5077 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field5086;
        if (~this.field5077.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field5090 == -3) {
                this.method2259(true);
            }
            if (arg0 != -8) {
                this.method2257(-110);
            }
            class163.method1206((byte) -114);
            this.method2257(-126);
        }
    }
}
