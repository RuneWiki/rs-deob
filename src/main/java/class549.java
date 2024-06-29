import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class549 extends class615 {

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    private int field7320 = 4096;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    private int field7322 = 4096;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    private int field7324 = 4096;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "Lgga;")
    public static class270 field7323 = new class270(128);

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BILeh;)V", line = 5)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field7325;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field7324 = arg2.method2001((byte) -83);
                }
            } else {
                this.field7322 = arg2.method2001((byte) -83);
            }
        } else {
            this.field7320 = arg2.method2001((byte) -83);
        }
        if (arg0 <= 44) {
            this.field7320 = -91;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 48)
    public class549() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V", line = 51)
    public static void method3051(int arg0) {
        if (arg0 != 0) {
            field7326 = 95;
        }
        field7323 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[[I", line = 61)
    public final int[][] method223(int arg0, int arg1) {
        ++field7321;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (arg0 != 2) {
            field7326 = -41;
        }
        if (super.field8129.field6315) {
            int[][] var4 = this.method3368(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class505.field6740 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field7320 * var12 >> 12;
                    var9[var11] = this.field7322 * var13 >> 12;
                    var10[var11] = this.field7324 * var14 >> 12;
                } else {
                    var8[var11] = this.field7320;
                    var9[var11] = this.field7322;
                    var10[var11] = this.field7324;
                }
            }
        }
        return var3;
    }
}
