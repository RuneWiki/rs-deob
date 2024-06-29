import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class267 extends class192 {

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    private int field3573 = 0;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "[S")
    private short[] field3576 = new short[257];

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "[I")
    private int[] field3569;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "[I")
    private int[] field3579;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "[[I")
    private int[][] field3570;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V")
    private final void method1645(byte arg0) {
        ++field3578;
        int var2 = this.field3573;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field3570.length + -1 > var5 && var4 >= this.field3570[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3570[var5 + -1];
                    int[] var7 = this.field3570[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class337.field4354[(var8 & 8184) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3576[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field3570.length + -1) < ~var14 && ~var13 <= ~this.field3570[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3570[var14 + -1];
                    int[] var16 = this.field3570[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3576[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field3570.length - 1 && ~var21 <= ~this.field3570[var22][0]; ++var22) {
                }
                int[] var23 = this.field3570[var22 + -1];
                int[] var24 = this.field3570[var22];
                int var25 = this.method1648(-17849, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1648(-17849, var22 - -1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 - var25 + var26;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var26 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3576[var20] = (short) var38;
            }
        }
        if (arg0 < 48) {
            this.field3573 = -56;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field3577;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 > -123) {
            method1646((byte) 60, (char) 65419);
        }
        if (super.field2448.field7266) {
            int[] var4 = this.method1253(0, arg0, 0);
            for (int var5 = 0; class561.field7319 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3576[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BC)Z")
    public static final boolean method1646(byte arg0, char arg1) {
        if (arg0 != -117) {
            method1646((byte) 40, (char) 65462);
        }
        ++field3575;
        return arg1 >= '0' && ~arg1 >= -58;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field3574;
        if (arg0 == 0) {
            this.field3573 = arg1.method2396(-115);
            this.field3570 = new int[arg1.method2396(-103)][2];
            for (int var4 = 0; ~this.field3570.length < ~var4; ++var4) {
                this.field3570[var4][0] = arg1.method2393(-30727);
                this.field3570[var4][1] = arg1.method2393(-30727);
            }
        }
        if (arg2 != -12160) {
            this.field3573 = -12;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    private final void method1647(int arg0) {
        ++field3572;
        int[] var2 = this.field3570[0];
        int[] var3 = this.field3570[1];
        int[] var4 = this.field3570[this.field3570.length + -2];
        int[] var5 = this.field3570[this.field3570.length - 1];
        this.field3579 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + var4[1] - var5[1] };
        this.field3569 = new int[] { var2[0] - var3[0] + var2[arg0], -var3[1] - (-var2[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public final void method618(byte arg0) {
        ++field3571;
        if (this.field3570 == null) {
            this.field3570 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field3570.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3573 == -3) {
                this.method1647(0);
            }
            class265.method1641((byte) 91);
            if (arg0 != 63) {
                this.method1647(22);
            }
            this.method1645((byte) 78);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class267() {
        super(1, true);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
    private final int[] method1648(int arg0, int arg1) {
        ++field3580;
        if (arg0 != -17849) {
            return null;
        } else if (~arg1 > -1) {
            return this.field3569;
        } else {
            return ~arg1 <= ~this.field3570.length ? this.field3579 : this.field3570[arg1];
        }
    }
}
