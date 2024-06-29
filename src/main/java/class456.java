import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class456 extends class751 {

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    private int field6544 = 4096;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    private int field6542 = 4096;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    private int field6543 = 4096;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "Ldba;")
    public static class101 field6541 = new class101(4, 2);

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)[[I")
    public final int[][] method147(int arg0, byte arg1) {
        ++field6539;
        int[][] var3 = super.field10409.method3474(arg1 + 2075, arg0);
        if (super.field10409.field8481) {
            int[][] var4 = this.method4172(0, arg0, arg1 + -56);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class673.field9452; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field6543 * var12 >> 12;
                    var9[var11] = this.field6542 * var13 >> 12;
                    var10[var11] = this.field6544 * var14 >> 12;
                } else {
                    var8[var11] = this.field6543;
                    var9[var11] = this.field6542;
                    var10[var11] = this.field6544;
                }
            }
        }
        if (arg1 != 57) {
            field6541 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = -23 / ((arg0 - 25) / 63);
        ++field6540;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field6544 = arg1.method898((byte) -100);
                }
            } else {
                this.field6542 = arg1.method898((byte) -121);
            }
        } else {
            this.field6543 = arg1.method898((byte) -97);
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V")
    public static void method2726(int arg0) {
        field6541 = null;
        if (arg0 <= 108) {
            field6545 = 36;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
    public class456() {
        super(1, false);
    }
}
