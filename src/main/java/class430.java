import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class430 extends class601 {

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "[I")
    private int[] field5643 = new int[3];

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    private int field5642 = 4096;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "I")
    private int field5645 = 409;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
    private int field5644 = 4096;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
    private int field5648 = 4096;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "I")
    public static int field5647 = 0;

    @OriginalMember(owner = "client!mt", name = "N", descriptor = "Luaa;")
    public static class391 field5649 = null;

    @OriginalMember(owner = "client!mt", name = "P", descriptor = "I")
    public static int field5651 = 0;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!mt", name = "O", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V", line = 114)
    public class430() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)[[I", line = 14)
    public final int[][] method638(int arg0, int arg1) {
        ++field5646;
        if (arg0 != 2017) {
            this.method638(48, 114);
        }
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[][] var4 = this.method3247((byte) -121, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class418.field5518 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field5643[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field5645 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5643[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field5645 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field5643[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field5645) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5644 * var12 >> 12;
                            var9[var11] = this.field5648 * var14 >> 12;
                            var10[var11] = this.field5642 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(B)V", line = 117)
    public static void method2481(byte arg0) {
        field5649 = null;
        if (arg0 >= -60) {
            field5649 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lmc;II)V", line = 128)
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method1500((byte) -102);
                            this.field5643[0] = class249.method1625(267386880, var5 << 4);
                            this.field5643[1] = class249.method1625(65280, var5) >> 4;
                            this.field5643[2] = class249.method1625(0, var5 >> 12);
                        }
                    } else {
                        this.field5644 = arg0.method1553((byte) 14);
                    }
                } else {
                    this.field5648 = arg0.method1553((byte) -11);
                }
            } else {
                this.field5642 = arg0.method1553((byte) -120);
            }
        } else {
            this.field5645 = arg0.method1553((byte) -119);
        }
        int var6 = 31 % ((40 - arg2) / 52);
        ++field5650;
    }
}
