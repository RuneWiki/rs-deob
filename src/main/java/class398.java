import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class398 extends class694 {

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    private int field5524 = 4096;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
    private int field5526 = 4096;

    @OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
    private int field5532 = 4096;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
    public static int field5528 = 1;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    public static int field5525 = 0;

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!gr", name = "N", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!gr", name = "P", descriptor = "Lpj;")
    public static class132 field5533;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "[Lem;")
    public static class205[] field5527;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILjr;B)V", line = 5)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = -59 % ((arg2 - 58) / 63);
        ++field5530;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field5524 = arg1.method743((byte) -8);
                }
            } else {
                this.field5526 = arg1.method743((byte) -15);
            }
        } else {
            this.field5532 = arg1.method743((byte) -25);
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V", line = 66)
    public class398() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 53)
    public static void method2263(byte arg0) {
        if (arg0 <= 105) {
            method2263((byte) -45);
        }
        field5533 = null;
        field5527 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lia;Lia;B)V", line = 69)
    public static final void method2264(class539 arg0, class539 arg1, byte arg2) {
        ++field5529;
        if (arg0.field7306 != null) {
            arg0.method2971(1);
        }
        arg0.field7315 = arg1;
        arg0.field7306 = arg1.field7306;
        arg0.field7306.field7315 = arg0;
        arg0.field7315.field7306 = arg0;
        if (arg2 < 63) {
            method2264((class539) null, (class539) null, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(II)[[I", line = 87)
    public final int[][] method15(int arg0, int arg1) {
        ++field5531;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (arg0 != -22151) {
            field5527 = null;
        }
        if (super.field9740.field8738) {
            int[][] var4 = this.method3812(arg1, 0, -14032);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class465.field6544; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field5532 * var12 >> 12;
                    var9[var11] = this.field5526 * var13 >> 12;
                    var10[var11] = this.field5524 * var14 >> 12;
                } else {
                    var8[var11] = this.field5532;
                    var9[var11] = this.field5526;
                    var10[var11] = this.field5524;
                }
            }
        }
        return var3;
    }
}
