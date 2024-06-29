import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class392 extends class38 {

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    private int field5902 = 4096;

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "[I")
    private int[] field5898 = new int[3];

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    private int field5897 = 409;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
    private int field5899 = 4096;

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
    private int field5904 = 4096;

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "Lfa;")
    public static class235 field5896 = new class235(8, 0, 4, 1);

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
    public static void method2510(int arg0) {
        if (arg0 < -65) {
            field5896 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field5903;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method3747((byte) -74);
                            this.field5898[0] = class493.method2943(var5 << 4, 267386880);
                            this.field5898[2] = class493.method2943(var5, 255) >> 12;
                            this.field5898[1] = class493.method2943(65280, var5) >> 4;
                        }
                    } else {
                        this.field5899 = arg2.method3712((byte) 85);
                    }
                } else {
                    this.field5902 = arg2.method3712((byte) -126);
                }
            } else {
                this.field5904 = arg2.method3712((byte) -115);
            }
        } else {
            this.field5897 = arg2.method3712((byte) -118);
        }
        if (arg0 < 34) {
            this.method196(125, -111);
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)V")
    public static final void method2511(int arg0, int arg1, int arg2) {
        ++field5901;
        if (arg1 != -1) {
            field5896 = null;
        }
        class511 var3 = class183.field2805[arg0][arg2];
        if (var3 != null) {
            class393.field5906 = var3.field7275;
            class449.field6655 = var3.field7273;
            class586.field8314 = var3.field7270;
        }
        class170.method1229((byte) 104);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    public class392() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[[I")
    public final int[][] method196(int arg0, int arg1) {
        ++field5900;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[][] var4 = this.method195(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class729.field10216; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field5898[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field5897) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field5898[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field5897) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field5898[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field5897) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5899 * var12 >> 12;
                            var9[var11] = this.field5902 * var14 >> 12;
                            var10[var11] = this.field5904 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 != -18210) {
            this.field5897 = 88;
        }
        return var3;
    }
}
