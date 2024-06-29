import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class419 extends class436 {

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    private int field6057 = 409;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    private int field6059 = 4096;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
    private int[] field6063 = new int[3];

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    private int field6064 = 4096;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    private int field6061 = 4096;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field6056 = 0;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Lba;")
    public static class218 field6062;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "[I")
    public static int[] field6060;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 12)
    public class419() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILeb;)V", line = 24)
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field6065;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg2.method2425(-109);
                            this.field6063[0] = class318.method2028(var5 << 4, 267386880);
                            this.field6063[2] = class318.method2028(var5, 255) >> 12;
                            this.field6063[1] = class318.method2028(var5 >> 4, 4080);
                        }
                    } else {
                        this.field6059 = arg2.method2403((byte) 43);
                    }
                } else {
                    this.field6064 = arg2.method2403((byte) 72);
                }
            } else {
                this.field6061 = arg2.method2403((byte) 97);
            }
        } else {
            this.field6057 = arg2.method2403((byte) 92);
        }
        if (arg0 != 34) {
            this.field6059 = 30;
        }
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 99)
    public static void method2664(int arg0) {
        field6060 = null;
        field6062 = null;
        if (arg0 < 86) {
            method2664(18);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[[I", line = 113)
    public final int[][] method85(int arg0, int arg1) {
        ++field6058;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[][] var4 = this.method2731(arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class43.field653; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field6063[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > this.field6057) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field6063[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field6057 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field6063[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field6057 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field6059 * var12 >> 12;
                            var9[var11] = this.field6064 * var14 >> 12;
                            var10[var11] = this.field6061 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 != -13348) {
            this.method18(11, -95, (class371) null);
        }
        return var3;
    }
}
