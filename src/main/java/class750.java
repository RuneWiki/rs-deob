import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class750 extends class634 {

    @OriginalMember(owner = "client!nca", name = "Q", descriptor = "I")
    private int field10492 = 0;

    @OriginalMember(owner = "client!nca", name = "R", descriptor = "[S")
    private short[] field10493 = new short[257];

    @OriginalMember(owner = "client!nca", name = "O", descriptor = "Z")
    public static boolean field10490 = false;

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "Ldh;")
    public static class320 field10482 = new class320(21, 6);

    @OriginalMember(owner = "client!nca", name = "V", descriptor = "[I")
    public static int[] field10497 = new int[1];

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "I")
    public static int field10483;

    @OriginalMember(owner = "client!nca", name = "H", descriptor = "I")
    public static int field10484;

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!nca", name = "J", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!nca", name = "K", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!nca", name = "N", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!nca", name = "S", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!nca", name = "T", descriptor = "I")
    public static int field10495;

    @OriginalMember(owner = "client!nca", name = "P", descriptor = "[I")
    private int[] field10491;

    @OriginalMember(owner = "client!nca", name = "U", descriptor = "[I")
    private int[] field10496;

    @OriginalMember(owner = "client!nca", name = "M", descriptor = "[[I")
    private int[][] field10488;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(B)V")
    private final void method4176(byte arg0) {
        ++field10489;
        int var2 = this.field10492;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field10488.length + -1) < ~var5 && ~var4 <= ~this.field10488[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field10488[var5 + -1];
                    int[] var7 = this.field10488[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class412.field5620[(8183 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field10493[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field10488.length - 1) && this.field10488[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field10488[var14 + -1];
                    int[] var16 = this.field10488[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field10493[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field10488.length + -1 && ~var21 <= ~this.field10488[var22][0]; ++var22) {
                }
                int[] var23 = this.field10488[var22 + -1];
                int[] var24 = this.field10488[var22];
                int var25 = this.method4179((byte) 11, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method4179((byte) 11, var22 - -1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 - (-var26 + var27);
                int var32 = var25 - var26 + -var31;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 - -var26 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field10493[var20] = (short) var38;
            }
        }
        if (arg0 < 67) {
            this.method87((byte) -58);
        }
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (this.field10488 == null) {
            this.field10488 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 <= 65) {
            field10484 = -44;
        }
        ++field10495;
        if (this.field10488.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field10492 == -3) {
                this.method4180(true);
            }
            class581.method3345((byte) 89);
            this.method4176((byte) 116);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IBI)Z")
    public static final boolean method4177(int arg0, byte arg1, int arg2) {
        if (arg1 != 64) {
            field10497 = null;
        }
        ++field10485;
        return (458752 & arg0) != 0 | class212.method1257(arg2, arg1 ^ 64, arg0) || class78.method554(arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field10487;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 >= -55) {
            this.method4180(false);
        }
        if (super.field9114.field3897) {
            int[] var4 = this.method3641(arg1, 20604, 0);
            for (int var5 = 0; ~class635.field9139 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field10493[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
    public static void method4178(boolean arg0) {
        field10482 = null;
        if (!arg0) {
            field10490 = false;
        }
        field10497 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg2) {
            this.method4176((byte) -19);
        }
        ++field10483;
        if (~arg0 == -1) {
            this.field10492 = arg1.method1423(-79);
            this.field10488 = new int[arg1.method1423(-15)][2];
            for (int var4 = 0; ~var4 > ~this.field10488.length; ++var4) {
                this.field10488[var4][0] = arg1.method1476(109);
                this.field10488[var4][1] = arg1.method1476(104);
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
    public class750() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(BI)[I")
    private final int[] method4179(byte arg0, int arg1) {
        ++field10486;
        if (arg1 < 0) {
            return this.field10491;
        } else {
            if (arg0 != 11) {
                this.method3(-95, (class244) null, true);
            }
            return ~this.field10488.length >= ~arg1 ? this.field10496 : this.field10488[arg1];
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(Z)V")
    private final void method4180(boolean arg0) {
        ++field10494;
        int[] var2 = this.field10488[0];
        if (arg0) {
            int[] var3 = this.field10488[1];
            int[] var4 = this.field10488[this.field10488.length - 2];
            int[] var5 = this.field10488[this.field10488.length - 1];
            this.field10491 = new int[] { var2[0] + var2[0] + -var3[0], var2[1] + -var3[1] + var2[1] };
            this.field10496 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (var5[1] + -var4[1]) };
        }
    }
}
