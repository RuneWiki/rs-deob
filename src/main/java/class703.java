import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class703 extends class585 {

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
    private int field9805 = 4096;

    @OriginalMember(owner = "client!lt", name = "L", descriptor = "I")
    private int field9807 = 4096;

    @OriginalMember(owner = "client!lt", name = "N", descriptor = "I")
    private int field9809 = 4096;

    @OriginalMember(owner = "client!lt", name = "M", descriptor = "[I")
    private int[] field9808 = new int[3];

    @OriginalMember(owner = "client!lt", name = "K", descriptor = "I")
    private int field9806 = 409;

    @OriginalMember(owner = "client!lt", name = "O", descriptor = "I")
    public static int field9810 = -1;

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!lt", name = "G", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!lt", name = "H", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!lt", name = "P", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!lt", name = "E", descriptor = "[Ljd;")
    public static class241[] field9801;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field9804;
        int[][] var3 = super.field8265.method1576((byte) 108, arg1);
        if (arg0) {
            this.method54((class494) null, -46, 45);
        }
        if (super.field8265.field3546) {
            int[][] var4 = this.method3417(0, arg1, (byte) 113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class293.field4278; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field9808[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field9806) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field9808[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field9806 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field9808[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field9806 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field9807 * var12 >> 12;
                            var9[var11] = this.field9809 * var14 >> 12;
                            var10[var11] = this.field9805 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
    public class703() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field9811;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method2960((byte) 94);
                            this.field9808[1] = class702.method3977(var5, 65280) >> 4;
                            this.field9808[0] = class702.method3977(267386880, var5 << 4);
                            this.field9808[2] = class702.method3977(255, var5) >> 12;
                        }
                    } else {
                        this.field9807 = arg0.method2998(true);
                    }
                } else {
                    this.field9809 = arg0.method2998(true);
                }
            } else {
                this.field9805 = arg0.method2998(true);
            }
        } else {
            this.field9806 = arg0.method2998(true);
        }
        if (arg1 != 1) {
            this.field9806 = -32;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(Z)V")
    public static void method3983(boolean arg0) {
        field9801 = null;
        if (arg0) {
            field9803 = -85;
        }
    }
}
