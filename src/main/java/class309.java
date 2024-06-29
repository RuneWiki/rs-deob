import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class309 extends class642 {

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    private int field4554 = 0;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "[S")
    private short[] field4564 = new short[257];

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "[I")
    public static int[] field4547 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Z")
    public static boolean field4555 = false;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "[Lhq;")
    public static class47[] field4548 = new class47[14];

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "[I")
    public static int[] field4553 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field4563 = 0;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "[I")
    private int[] field4551;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "[I")
    private int[] field4557;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "[[I")
    private int[][] field4560;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ[J[Ljava/lang/Object;)V")
    public static final void method1926(int arg0, int arg1, boolean arg2, long[] arg3, Object[] arg4) {
        ++field4558;
        if (~arg1 > ~arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            int var10 = var7 != Long.MAX_VALUE ? 1 : 0;
            for (int var11 = arg1; ~arg0 < ~var11; ++var11) {
                if (arg3[var11] < var7 - -((long) (var10 & var11))) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method1926(var6 + -1, arg1, arg2, arg3, arg4);
            method1926(arg0, var6 + 1, false, arg3, arg4);
        }
        if (arg2) {
            field4563 = -29;
        }
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field4547 = null;
        field4548 = null;
        if (arg0 != 18740) {
            field4563 = -79;
        }
        field4553 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class309() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field4550;
        int[] var3 = super.field9216.method1185(arg0, -95);
        if (super.field9216.field2418) {
            int[] var4 = this.method3658((byte) 61, arg0, 0);
            for (int var5 = 0; var5 < class338.field4909; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field4564[var6];
            }
        }
        return arg1 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/lang/String;Lgk;)I")
    public static final int method1928(byte arg0, String arg1, class540 arg2) {
        ++field4552;
        int var3 = arg2.field7956;
        byte[] var4 = class344.method2140(arg1, (byte) -83);
        arg2.method3151(false, var4.length);
        int var5 = 91 / ((-13 - arg0) / 36);
        arg2.field7956 += class248.field3274.method286(arg2.field7956, 0, 1627352001, var4.length, arg2.field7952, var4);
        return -var3 + arg2.field7956;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
    private final void method1929(int arg0) {
        ++field4556;
        int[] var2 = this.field4560[0];
        int[] var3 = this.field4560[1];
        int[] var4 = this.field4560[this.field4560.length + -2];
        int[] var5 = this.field4560[this.field4560.length - 1];
        this.field4557 = new int[] { var2[0] + -var3[0] + var2[arg0], var2[1] - -var2[1] + -var3[1] };
        this.field4551 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] - var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
    private final void method1930(int arg0) {
        int var2 = this.field4554;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field4560.length + -1 && this.field4560[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field4560[var5 + -1];
                    int[] var7 = this.field4560[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class641.field9196[(8185 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field4564[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field4560.length + -1) && ~this.field4560[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field4560[var14 + -1];
                    int[] var16 = this.field4560[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field4564[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field4560.length + -1 && this.field4560[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field4560[var22 + -1];
                int[] var24 = this.field4560[var22];
                int var25 = this.method1931(var22 + -2, true)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1931(var22 - -1, true)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 - var25 + var28 - -var26;
                int var32 = var25 - (var26 - -var31);
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 - -var37 + var26 + var35;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field4564[var20] = (short) var38;
            }
        }
        if (arg0 != 2) {
            field4555 = false;
        }
        ++field4549;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)[I")
    private final int[] method1931(int arg0, boolean arg1) {
        ++field4562;
        if (!arg1) {
            return null;
        } else if (arg0 < 0) {
            return this.field4557;
        } else {
            return this.field4560.length <= arg0 ? this.field4551 : this.field4560[arg0];
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lla;)V")
    public static final void method1932(class393 arg0) {
        class125.field1832 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (this.field4560 == null) {
            this.field4560 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field4561;
        if (~this.field4560.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field4554 == 2) {
                this.method1929(0);
            }
            class531.method3078(false);
            this.method1930(2);
            if (arg0 != 6276) {
                field4555 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 >= 29) {
            ++field4567;
            if (~arg0 == -1) {
                this.field4554 = arg1.method3115(29871);
                this.field4560 = new int[arg1.method3115(29871)][2];
                for (int var4 = 0; ~this.field4560.length < ~var4; ++var4) {
                    this.field4560[var4][0] = arg1.method3169(26488);
                    this.field4560[var4][1] = arg1.method3169(26488);
                }
            }
        }
    }
}
