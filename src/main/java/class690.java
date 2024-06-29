import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class690 extends class314 {

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    private int field9682 = 0;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "[S")
    private short[] field9686 = new short[257];

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field9679 = 0;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Lhh;")
    public static class115 field9681;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "[I")
    private int[] field9678;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "[I")
    private int[] field9680;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "[[I")
    private int[][] field9677;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[[[B")
    public static byte[][][] field9676;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V", line = 6)
    private final void method3906(boolean arg0) {
        ++field9675;
        if (!arg0) {
            this.method5((byte) 103, (class6) null, 78);
        }
        int var2 = this.field9682;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field9677.length + -1) < ~var5 && var4 >= this.field9677[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field9677[var5 + -1];
                    int[] var7 = this.field9677[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class174.field2873[(8177 & var8) >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field9686[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field9677.length + -1 && ~this.field9677[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field9677[var14 + -1];
                    int[] var16 = this.field9677[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field9686[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field9677.length + -1) < ~var22 && this.field9677[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field9677[var22 + -1];
                int[] var24 = this.field9677[var22];
                int var25 = this.method3909(-104, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3909(-92, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + -var25 + var26;
                int var32 = -var31 + var25 + -var26;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var37 - -var26 + var35 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field9686[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V", line = 186)
    public static final void method3907() {
        for (int var0 = 0; var0 < class458.field6856.length; ++var0) {
            class458.field6856[var0].method3186();
        }
        class458.field6856 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[I", line = 199)
    public final int[] method6(int arg0, int arg1) {
        if (arg1 < 109) {
            this.field9686 = null;
        }
        ++field9672;
        int[] var3 = super.field4928.method534((byte) -98, arg0);
        if (super.field4928.field618) {
            int[] var4 = this.method2140(0, arg0, -127);
            for (int var5 = 0; ~var5 > ~class81.field1009; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field9686[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V", line = 243)
    private final void method3908(int arg0) {
        ++field9671;
        int[] var2 = this.field9677[0];
        int[] var3 = this.field9677[1];
        int[] var4 = this.field9677[this.field9677.length + -2];
        int[] var5 = this.field9677[this.field9677.length + -1];
        this.field9680 = new int[] { -var5[0] - (-var4[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
        this.field9678 = new int[] { -var3[0] - -var2[0] + var2[0], var2[arg0] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[I", line = 262)
    private final int[] method3909(int arg0, int arg1) {
        if (arg0 >= -85) {
            return null;
        } else {
            ++field9685;
            if (arg1 < 0) {
                return this.field9678;
            } else {
                return ~this.field9677.length >= ~arg1 ? this.field9680 : this.field9677[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lhw;", line = 281)
    public static final class116 method3910(byte arg0, int arg1) {
        if (arg0 >= -91) {
            return null;
        } else {
            ++field9684;
            class116[] var2 = class531.method3213((byte) -120);
            for (int var3 = 0; var3 < var2.length; ++var3) {
                class116 var4 = var2[var3];
                if (~var4.field1808 == ~arg1) {
                    return var4;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)V", line = 311)
    public static void method3911(int arg0) {
        field9681 = null;
        field9676 = null;
        if (arg0 != 0) {
            field9681 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 326)
    public class690() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 337)
    public final void method3(byte arg0) {
        ++field9673;
        if (this.field9677 == null) {
            this.field9677 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field9677.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field9682 == 2) {
                this.method3908(arg0 + 16);
            }
            class46.method546(arg0 ^ 15546);
            if (arg0 == -15) {
                this.method3906(true);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLie;I)V", line = 360)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 > -1) {
            this.field9686 = null;
        }
        ++field9683;
        if (~arg2 == -1) {
            this.field9682 = arg1.method70(-9059);
            this.field9677 = new int[arg1.method70(-9059)][2];
            for (int var4 = 0; ~this.field9677.length < ~var4; ++var4) {
                this.field9677[var4][0] = arg1.method67(12021);
                this.field9677[var4][1] = arg1.method67(12021);
            }
        }
    }
}
