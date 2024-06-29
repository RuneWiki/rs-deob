import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class736 extends class667 {

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "[S")
    private short[] field10363 = new short[257];

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    private int field10371 = 0;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "[S")
    private static short[] field10355 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "[S")
    private static short[] field10361 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "[S")
    private static short[] field10366 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "[[S")
    public static short[][] field10360 = new short[][] { field10361, field10366, field10355 };

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field10367;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field10368;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Leq;")
    public static class209 field10354;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "[I")
    private int[] field10359;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "[I")
    private int[] field10365;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "[[I")
    private int[][] field10357;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public static void method4109(int arg0) {
        field10355 = null;
        field10361 = null;
        if (arg0 == -4415) {
            field10354 = null;
            field10360 = null;
            field10366 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field10369;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(arg1, (byte) 125, 0);
            for (int var5 = 0; ~class77.field1455 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field10363[var6];
            }
        }
        return arg0 >= -87 ? null : var3;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class736() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)[I")
    private final int[] method4110(int arg0, byte arg1) {
        ++field10356;
        if (arg1 != -75) {
            field10355 = null;
        }
        if (~arg0 > -1) {
            return this.field10359;
        } else {
            return this.field10357.length <= arg0 ? this.field10365 : this.field10357[arg0];
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(IB)Z")
    public static final boolean method4111(int arg0, byte arg1) {
        if (arg1 != 89) {
            return false;
        } else {
            ++field10358;
            return arg0 == 2 || ~arg0 == -4;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
    private final void method4112(int arg0) {
        ++field10368;
        int[] var2 = this.field10357[arg0];
        int[] var3 = this.field10357[1];
        int[] var4 = this.field10357[this.field10357.length + -2];
        int[] var5 = this.field10357[this.field10357.length + -1];
        this.field10365 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - -var4[1] - var5[1] };
        this.field10359 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
    private final void method4113(byte arg0) {
        ++field10370;
        if (arg0 >= 33) {
            int var2 = this.field10371;
            if (var2 != 2) {
                if (var2 == 1) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; this.field10357.length + -1 > var5 && ~this.field10357[var5][0] >= ~var4; ++var5) {
                        }
                        int[] var6 = this.field10357[var5 + -1];
                        int[] var7 = this.field10357[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = 4096 - class265.field3861[(var8 & 8167) >> 5] >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field10363[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~(this.field10357.length + -1) < ~var14 && ~this.field10357[var14][0] >= ~var13; ++var14) {
                        }
                        int[] var15 = this.field10357[var14 + -1];
                        int[] var16 = this.field10357[var14];
                        int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                        int var18 = 4096 - var17;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field10363[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~(this.field10357.length + -1) < ~var22 && this.field10357[var22][0] <= var21; ++var22) {
                    }
                    int[] var23 = this.field10357[var22 + -1];
                    int[] var24 = this.field10357[var22];
                    int var25 = this.method4110(var22 + -2, (byte) -75)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method4110(var22 - -1, (byte) -75)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var27 + var26 + var28 + -var25;
                    int var32 = -var31 + var25 - var26;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var26 + var37 + var35 + var36;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field10363[var20] = (short) var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            this.method4112(-4);
        }
        if (arg2 == 0) {
            this.field10371 = arg0.method273(arg1 + 252);
            this.field10357 = new int[arg0.method273(255)][2];
            for (int var4 = 0; ~var4 > ~this.field10357.length; ++var4) {
                this.field10357[var4][0] = arg0.method253(class349.method2193(arg1, -13897));
                this.field10357[var4][1] = arg0.method253(-13900);
            }
        }
        ++field10364;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        ++field10367;
        if (this.field10357 == null) {
            this.field10357 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field10357.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field10371 == 2) {
                this.method4112(0);
            }
            class458.method2798(true);
            if (arg0) {
                this.field10357 = null;
            }
            this.method4113((byte) 83);
        }
    }
}
