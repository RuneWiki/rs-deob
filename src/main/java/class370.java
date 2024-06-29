import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class370 extends class56 {

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Z")
    private boolean field5213 = true;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Z")
    private boolean field5211 = true;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "[I")
    public static int[] field5215 = new int[1000];

    @OriginalMember(owner = "client!he", name = "G", descriptor = "Z")
    public static boolean field5212 = false;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "Z")
    public static boolean field5217;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[[I", line = 6)
    public final int[][] method5(int arg0, int arg1) {
        ++field5214;
        int[][] var3 = super.field668.method3009(arg1 ^ arg1, arg0);
        if (super.field668.field7292) {
            int[][] var4 = this.method369(this.field5211 ? class636.field8759 - arg0 : arg0, arg1 ^ 126, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field5213) {
                for (int var11 = 0; ~class328.field4576 < ~var11; ++var11) {
                    var8[var11] = var5[class445.field6318 - var11];
                    var9[var11] = var6[-var11 + class445.field6318];
                    var10[var11] = var7[class445.field6318 - var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class328.field4576; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)[I", line = 69)
    public final int[] method24(int arg0, boolean arg1) {
        ++field5210;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            return null;
        } else {
            if (super.field673.field8073) {
                int[] var4 = this.method367(4463, 0, !this.field5211 ? arg0 : -arg0 + class636.field8759);
                if (!this.field5213) {
                    class255.method1688(var4, 0, var3, 0, class328.field4576);
                } else {
                    for (int var5 = 0; class328.field4576 > var5; ++var5) {
                        var3[var5] = var4[-var5 + class445.field6318];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILee;I)V", line = 108)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            field5217 = true;
        }
        ++field5216;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field674 = ~arg1.method3750((byte) 35) == -2;
                }
            } else {
                this.field5211 = arg1.method3750((byte) 35) == 1;
            }
        } else {
            this.field5213 = ~arg1.method3750((byte) 35) == -2;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V", line = 153)
    public static void method2345(byte arg0) {
        int var1 = 1 / ((16 - arg0) / 62);
        field5215 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 164)
    public class370() {
        super(1, false);
    }
}
