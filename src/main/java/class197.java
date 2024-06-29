import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class197 extends class601 {

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    private int field2971 = 4096;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    private int field2974 = 409;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "[I")
    private int[] field2975 = new int[3];

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    private int field2978 = 4096;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    private int field2977 = 4096;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "[I")
    public static int[] field2976 = new int[3];

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
    public static int[] field2972;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lee;BI)V", line = 5)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method3833(255);
                            this.field2975[2] = class48.method346(255, var5) >> 12;
                            this.field2975[0] = class48.method346(16711680, var5) << 4;
                            this.field2975[1] = class48.method346(var5, 65280) >> 4;
                        }
                    } else {
                        this.field2978 = arg0.method3807(-1);
                    }
                } else {
                    this.field2977 = arg0.method3807(-1);
                }
            } else {
                this.field2971 = arg0.method3807(-1);
            }
        } else {
            this.field2974 = arg0.method3807(arg1 + 60);
        }
        ++field2979;
        if (arg1 != -61) {
            method1338((byte) 113);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 221)
    public class197() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 76)
    public static void method1338(byte arg0) {
        field2972 = null;
        if (arg0 == -57) {
            field2976 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 93)
    public static final void method1339(byte arg0) {
        ++field2973;
        int[] var1 = new int[class77.field948.field2463];
        int var2 = 0;
        if (arg0 != -62) {
            field2980 = 119;
        }
        for (int var3 = 0; var3 < class77.field948.field2463; ++var3) {
            class597 var5 = class77.field948.method1165((byte) 83, var3);
            if (var5.field7774 >= 0 || var5.field7786 >= 0) {
                var1[var2++] = var3;
            }
        }
        class189.field2848 = new int[var2];
        for (int var4 = 0; var4 < var2; ++var4) {
            class189.field2848[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IZ)[[I", line = 129)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field2970;
        if (!arg1) {
            return null;
        } else {
            int[][] var3 = super.field7890.method3963(1, arg0);
            if (super.field7890.field9769) {
                int[][] var4 = this.method3268(arg0, 0, 65535);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class171.field2624 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field2975[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~this.field2974 > ~var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field2975[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field2974) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field2975[2];
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (this.field2974 < var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field2978 * var12 >> 12;
                                var9[var11] = this.field2977 * var14 >> 12;
                                var10[var11] = this.field2971 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }
}
