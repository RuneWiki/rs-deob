import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class437 extends class667 {

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "[I")
    private int[] field6105 = new int[3];

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    private int field6104 = 4096;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    private int field6106 = 4096;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    private int field6110 = 409;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    private int field6109 = 4096;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field6107 = -1;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class437() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        if (arg0) {
            this.method116((class35) null, -30, 77);
        }
        ++field6103;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int[][] var4 = this.method3748(arg1, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class77.field1455; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field6105[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field6110 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field6105[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field6110 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field6105[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field6110 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field6109 * var12 >> 12;
                            var9[var11] = this.field6104 * var14 >> 12;
                            var10[var11] = this.field6106 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field6108;
        if (arg1 != 3) {
            this.field6106 = 13;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg0.method239(-22);
                            this.field6105[0] = class555.method3246(var5, 16711680) << 4;
                            this.field6105[1] = class555.method3246(4080, var5 >> 4);
                            this.field6105[2] = class555.method3246(0, var5 >> 12);
                        }
                    } else {
                        this.field6109 = arg0.method253(arg1 + -13903);
                    }
                } else {
                    this.field6104 = arg0.method253(arg1 + -13903);
                }
            } else {
                this.field6106 = arg0.method253(-13900);
            }
        } else {
            this.field6110 = arg0.method253(-13900);
        }
    }
}
