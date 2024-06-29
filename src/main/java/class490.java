import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class490 extends class305 {

    @OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
    private int field7158 = 0;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    private int field7153 = 0;

    @OriginalMember(owner = "client!qp", name = "P", descriptor = "I")
    private int field7160 = 0;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "I")
    public static int field7148 = 0;

    @OriginalMember(owner = "client!qp", name = "O", descriptor = "Ljava/lang/String;")
    public static String field7159 = "";

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "Ljp;")
    public static class55 field7156 = new class55(65, -2);

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "I")
    private int field7150;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
    private int field7151;

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
    private int field7152;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
    private int field7155;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
    private int field7157;

    @OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
    private int field7161;

    @OriginalMember(owner = "client!qp", name = "R", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!qp", name = "S", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!qp", name = "T", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V", line = 4)
    private final void method2954(int arg0, int arg1, int arg2, int arg3) {
        ++field7154;
        if (arg0 != 1) {
            this.field7161 = -58;
        }
        int var5 = ~arg2 < -2049 ? -(arg2 * arg3 >> 12) + arg3 + arg2 : (arg3 + 4096) * arg2 >> 12;
        if (~var5 >= -1) {
            this.field7151 = this.field7157 = this.field7152 = arg2;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg2 + arg2 - var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field7152 = var15;
                                    this.field7151 = var5;
                                    this.field7157 = var7;
                                }
                            } else {
                                this.field7157 = var7;
                                this.field7151 = var14;
                                this.field7152 = var5;
                            }
                        } else {
                            this.field7152 = var5;
                            this.field7151 = var7;
                            this.field7157 = var15;
                        }
                    } else {
                        this.field7152 = var14;
                        this.field7157 = var5;
                        this.field7151 = var7;
                    }
                } else {
                    this.field7151 = var15;
                    this.field7152 = var7;
                    this.field7157 = var5;
                }
            } else {
                this.field7157 = var14;
                this.field7152 = var7;
                this.field7151 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)[[I", line = 118)
    public final int[][] method72(int arg0, byte arg1) {
        if (arg1 >= -59) {
            this.field7160 = 103;
        }
        ++field7162;
        int[][] var3 = super.field4674.method2206(-113, arg0);
        if (super.field4674.field5110) {
            int[][] var4 = this.method2015(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class91.field1471 > var11; ++var11) {
                this.method2957(var7[var11], -140126548, var6[var11], var5[var11]);
                this.field7155 += this.field7160;
                this.field7161 += this.field7153;
                this.field7150 += this.field7158;
                while (this.field7155 < 0) {
                    this.field7155 += 4096;
                }
                if (~this.field7150 > -1) {
                    this.field7150 = 0;
                }
                while (this.field7155 > 4096) {
                    this.field7155 -= 4096;
                }
                if (~this.field7161 > -1) {
                    this.field7161 = 0;
                }
                if (~this.field7150 < -4097) {
                    this.field7150 = 4096;
                }
                if (this.field7161 > 4096) {
                    this.field7161 = 4096;
                }
                this.method2954(1, this.field7155, this.field7161, this.field7150);
                var8[var11] = this.field7151;
                var9[var11] = this.field7157;
                var10[var11] = this.field7152;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V", line = 195)
    public class490() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILfh;B)V", line = 200)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 > 76) {
            ++field7149;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        this.field7153 = (arg1.method1398(17) << 12) / 100;
                    }
                } else {
                    this.field7158 = (arg1.method1398(54) << 12) / 100;
                }
            } else {
                this.field7160 = arg1.method1384(true);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V", line = 245)
    public static final void method2955(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class110.field1653 = arg0;
        class109.field1643 = arg4;
        class155.field2388 = arg3;
        ++field7163;
        if (arg1 != 100) {
            field7148 = -7;
        }
        class282.field4408 = arg2;
    }

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)V", line = 270)
    public static void method2956(int arg0) {
        field7159 = null;
        field7156 = null;
        if (arg0 != 21221) {
            field7159 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(IIII)V", line = 294)
    private final void method2957(int arg0, int arg1, int arg2, int arg3) {
        ++field7164;
        if (arg1 == -140126548) {
            int var5 = arg3 > arg2 ? arg3 : arg2;
            int var6 = arg0 <= var5 ? var5 : arg0;
            int var7 = ~arg2 >= ~arg3 ? arg2 : arg3;
            int var8 = arg0 < var7 ? arg0 : var7;
            this.field7161 = (var6 + var8) / 2;
            int var9 = var6 - var8;
            if (var9 <= 0) {
                this.field7155 = 0;
            } else {
                int var10 = (-arg3 + var6 << 12) / var9;
                int var11 = (var6 - arg2 << 12) / var9;
                int var12 = (-arg0 + var6 << 12) / var9;
                if (arg3 != var6) {
                    if (arg2 == var6) {
                        this.field7155 = arg0 == var8 ? var10 + 4096 : -var12 + 12288;
                    } else {
                        this.field7155 = arg3 != var8 ? -var10 + 20480 : var11 + 12288;
                    }
                } else {
                    this.field7155 = ~arg2 == ~var8 ? var12 + 20480 : 4096 - var11;
                }
                this.field7155 /= 6;
            }
            if (~this.field7161 < -1 && ~this.field7161 > -4097) {
                this.field7150 = (var9 << 12) / (~this.field7161 >= -2049 ? this.field7161 * 2 : -(this.field7161 * 2) + 8192);
            } else {
                this.field7150 = 0;
            }
        }
    }
}
