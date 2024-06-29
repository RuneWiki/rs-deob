import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class194 extends class314 {

    @OriginalMember(owner = "client!su", name = "Q", descriptor = "I")
    private int field3220 = 4096;

    @OriginalMember(owner = "client!su", name = "R", descriptor = "I")
    private int field3221 = 4096;

    @OriginalMember(owner = "client!su", name = "S", descriptor = "I")
    private int field3222 = 4096;

    @OriginalMember(owner = "client!su", name = "L", descriptor = "[I")
    public static int[] field3215 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!su", name = "O", descriptor = "[I")
    public static int[] field3218 = new int[1000];

    @OriginalMember(owner = "client!su", name = "M", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!su", name = "N", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!su", name = "P", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V", line = 4)
    public class194() {
        super(1, false);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)[[I", line = 10)
    public final int[][] method4(int arg0, byte arg1) {
        ++field3219;
        if (arg1 < 68) {
            this.field3222 = -21;
        }
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int[][] var4 = this.method2143(0, arg0, (byte) -4);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class81.field1009; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3221 * var12 >> 12;
                    var9[var11] = this.field3222 * var13 >> 12;
                    var10[var11] = this.field3220 * var14 >> 12;
                } else {
                    var8[var11] = this.field3221;
                    var9[var11] = this.field3222;
                    var10[var11] = this.field3220;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BLie;I)V", line = 73)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field3217;
        if (arg0 >= -1) {
            this.method4(-78, (byte) -18);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3220 = arg1.method67(12021);
                }
            } else {
                this.field3222 = arg1.method67(12021);
            }
        } else {
            this.field3221 = arg1.method67(12021);
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)V", line = 126)
    public static final void method1537(byte arg0) {
        class224.method1646(107);
        if (arg0 > 105) {
            ++field3216;
            class529.field7721 = null;
            class224.field3610 = null;
            class200.field3265 = null;
            class579.field8250 = null;
            class476.field7059 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(Z)V", line = 147)
    public static void method1538(boolean arg0) {
        field3215 = null;
        field3218 = null;
        if (!arg0) {
            method1537((byte) 118);
        }
    }
}
