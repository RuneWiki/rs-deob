import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class615 {

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "[S")
    private short[] field12 = new short[257];

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    private int field16 = 0;

    @OriginalMember(owner = "client!ro", name = "W", descriptor = "I")
    public static int field27 = 0;

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "F")
    public static float field21;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "R", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ro", name = "T", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ro", name = "U", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ro", name = "V", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "Lqa;")
    public static class230 field11;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "[I")
    private int[] field20;

    @OriginalMember(owner = "client!ro", name = "S", descriptor = "[I")
    private int[] field23;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "[[I")
    private int[][] field15;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field18;
        int[] var3 = super.field8125.method298(arg0, arg1 ^ 104);
        if (arg1 != -18) {
            return null;
        } else {
            if (super.field8125.field579) {
                int[] var4 = this.method3366(0, 997, arg0);
                for (int var5 = 0; class505.field6740 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field12[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)[I")
    private final int[] method9(int arg0, int arg1) {
        ++field17;
        if (arg0 < 0) {
            return this.field23;
        } else if (~arg0 <= ~this.field15.length) {
            return this.field20;
        } else {
            if (arg1 != 1) {
                this.field23 = null;
            }
            return this.field15[arg0];
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (this.field15 == null) {
            this.field15 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field22;
        if (arg0 != 12404) {
            this.method14(true);
        }
        if (this.field15.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field16 == 2) {
                this.method11((byte) -75);
            }
            class201.method1312((byte) 100);
            this.method14(false);
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
    public class2() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)V")
    private final void method11(byte arg0) {
        ++field19;
        int[] var2 = this.field15[0];
        int[] var3 = this.field15[1];
        int[] var4 = this.field15[this.field15.length - 2];
        if (arg0 == -75) {
            int[] var5 = this.field15[this.field15.length + -1];
            this.field23 = new int[] { var2[0] - var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
            this.field20 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] + -var5[1] + var4[1] };
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(IIII)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class344.field4718.field5445 * arg1 >> 8;
        if (arg0 != -26338) {
            field21 = 0.5919047F;
        }
        ++field25;
        if (var4 != 0 && arg3 != -1) {
            class39.method299(arg3, var4, 0, false, class232.field3242, true);
            class137.field2225 = true;
        }
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)V")
    public static void method13(int arg0) {
        field11 = null;
        if (arg0 != 1579) {
            field21 = -1.4776677F;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
    private final void method14(boolean arg0) {
        int var2 = this.field16;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field15.length + -1) < ~var5 && var4 >= this.field15[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field15[var5 + -1];
                    int[] var7 = this.field15[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class166.field2582[(var8 & 8170) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field12[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field15.length + -1 > var14 && ~var13 <= ~this.field15[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field15[var14 - 1];
                    int[] var16 = this.field15[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field12[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field15.length + -1 && ~this.field15[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field15[var22 + -1];
                int[] var24 = this.field15[var22];
                int var25 = this.method9(var22 + -2, 1)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method9(var22 + 1, 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + -var25 - -var26;
                int var32 = var25 - var26 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var37 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field12[var20] = (short) var38;
            }
        }
        if (arg0) {
            field21 = -0.957476F;
        }
        ++field10;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field24;
        if (arg1 == 0) {
            this.field16 = arg2.method2034(255);
            this.field15 = new int[arg2.method2034(255)][2];
            for (int var4 = 0; var4 < this.field15.length; ++var4) {
                this.field15[var4][0] = arg2.method2001((byte) -83);
                this.field15[var4][1] = arg2.method2001((byte) -83);
            }
        }
        if (arg0 <= 44) {
            this.method8(34, (byte) 3);
        }
    }
}
