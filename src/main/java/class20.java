import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 extends class440 {

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    private int field236 = 0;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "[S")
    private short[] field237 = new short[257];

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field226 = 0;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Lvg;")
    public static class49 field231 = null;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "[Z")
    public static boolean[] field239 = new boolean[8];

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "[I")
    private int[] field228;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "[I")
    private int[] field230;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "[[I")
    private int[][] field225;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 6)
    public class20() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V", line = 14)
    private final void method228(int arg0) {
        ++field229;
        int var2 = 18 / ((arg0 - -23) / 39);
        int[] var3 = this.field225[0];
        int[] var4 = this.field225[1];
        int[] var5 = this.field225[this.field225.length + -2];
        int[] var6 = this.field225[this.field225.length + -1];
        this.field228 = new int[] { -var6[0] - (-var5[0] - var5[0]), var5[1] - var6[1] - -var5[1] };
        this.field230 = new int[] { var3[0] + -var4[0] + var3[0], var3[1] + var3[1] - var4[1] };
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[I", line = 34)
    public final int[] method229(byte arg0, int arg1) {
        ++field232;
        int var3 = -73 / ((arg0 - -56) / 41);
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[] var5 = this.method2611(108, arg1, 0);
            for (int var6 = 0; var6 < class549.field7715; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field237[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 79)
    public final void method230(int arg0) {
        ++field238;
        if (this.field225 == null) {
            this.field225 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field225.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != -9) {
                this.method230(40);
            }
            if (~this.field236 == -3) {
                this.method228(-88);
            }
            class31.method354((byte) 101);
            this.method232((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[I", line = 102)
    private final int[] method231(int arg0, int arg1) {
        ++field235;
        if (~arg1 > -1) {
            return this.field230;
        } else if (arg0 < 14) {
            return null;
        } else {
            return this.field225.length <= arg1 ? this.field228 : this.field225[arg1];
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 119)
    private final void method232(byte arg0) {
        ++field234;
        if (arg0 >= -107) {
            this.field230 = null;
        }
        int var2 = this.field236;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field225.length + -1) && var4 >= this.field225[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field225[var5 + -1];
                    int[] var7 = this.field225[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class453.field6514[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field237[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field225.length - 1 && this.field225[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field225[var14 + -1];
                    int[] var16 = this.field225[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field237[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field225.length + -1 && ~this.field225[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field225[var22 - 1];
                int[] var24 = this.field225[var22];
                int var25 = this.method231(57, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method231(85, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - (var27 - (-var25 - -var26));
                int var32 = -var31 + var25 + -var26;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 + var26 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field237[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)Lgg;", line = 303)
    public static final class158 method233(int arg0) {
        if (arg0 != 3095) {
            method233(60);
        }
        ++field233;
        try {
            return new class510();
        } catch (Throwable var2) {
            try {
                return (class158) Class.forName("vba").newInstance();
            } catch (Throwable var1) {
                return new class631();
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILmo;I)V", line = 326)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field227;
        if (~arg2 == -1) {
            this.field236 = arg1.method3826(false);
            this.field225 = new int[arg1.method3826(false)][2];
            for (int var4 = 0; ~this.field225.length < ~var4; ++var4) {
                this.field225[var4][0] = arg1.method3847((byte) 118);
                this.field225[var4][1] = arg1.method3847((byte) 118);
            }
        }
        if (arg0 != 5) {
            this.field236 = -43;
        }
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V", line = 352)
    public static void method235(int arg0) {
        if (arg0 == -258) {
            field231 = null;
            field239 = null;
        }
    }
}
