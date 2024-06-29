import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class611 extends class377 {

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    private int field8312 = 4096;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    private int field8313 = 4096;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    private int field8315 = 4096;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "[[I")
    public static int[][] field8309 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    public static int field8311 = 0;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "Lur;")
    public static class503 field8310;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class611() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field8314;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field8315 = arg2.method3031(-1);
                }
            } else {
                this.field8312 = arg2.method3031(-1);
            }
        } else {
            this.field8313 = arg2.method3031(-1);
        }
        int var5 = -90 % ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        ++field8308;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int[][] var4 = this.method2173(1, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class528.field6661; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field8313 * var12 >> 12;
                    var9[var11] = this.field8312 * var13 >> 12;
                    var10[var11] = this.field8315 * var14 >> 12;
                } else {
                    var8[var11] = this.field8313;
                    var9[var11] = this.field8312;
                    var10[var11] = this.field8315;
                }
            }
        }
        int var15 = -16 % ((31 - arg1) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static void method3425(int arg0) {
        int var1 = 81 / ((arg0 - -58) / 32);
        field8309 = null;
        field8310 = null;
    }
}
