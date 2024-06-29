import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class606 extends class751 {

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    private int field8520 = 32768;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Z")
    public static boolean field8518 = true;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Lcb;")
    public static class544 field8526;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILrv;I)V", line = 8)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field8524;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field10415 = ~arg1.method842(2384) == -2;
            }
        } else {
            this.field8520 = arg1.method898((byte) -97) << 4;
        }
        int var5 = -33 / ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I", line = 46)
    public final int[] method365(int arg0, int arg1) {
        ++field8519;
        if (arg1 != 4095) {
            method3495(47, (int[]) null, (class544) null, (class544) null);
        }
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[] var4 = this.method4173(arg0, (byte) -124, 1);
            int[] var5 = this.method4173(arg0, (byte) -112, 2);
            for (int var6 = 0; var6 < class673.field9452; ++var6) {
                int var7 = (var4[var6] & 4089) >> 4;
                int var8 = var5[var6] * this.field8520 >> 12;
                int var9 = class300.field4511[var7] * var8 >> 12;
                int var10 = class792.field10865[var7] * var8 >> 12;
                int var11 = class407.field5754 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg0 & class348.field5094;
                int[] var13 = this.method4173(var12, (byte) -112, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[ILcb;Lcb;)V", line = 96)
    public static final void method3495(int arg0, int[] arg1, class544 arg2, class544 arg3) {
        if (arg1 != null) {
            class469.field6699 = arg1;
        }
        class412.field5831 = arg3;
        class13.field257 = arg2;
        ++field8523;
        if (arg0 <= 106) {
            field8526 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 112)
    public class606() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 120)
    public final void method1454(byte arg0) {
        class55.method355((byte) -66);
        ++field8525;
        if (arg0 < 123) {
            field8526 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 131)
    public static void method3496(int arg0) {
        field8526 = null;
        int var1 = 78 % ((arg0 - 58) / 59);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[[I", line = 141)
    public final int[][] method147(int arg0, byte arg1) {
        ++field8521;
        if (arg1 != 57) {
            field8518 = false;
        }
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (super.field10409.field8481) {
            int[] var4 = this.method4173(arg0, (byte) -116, 1);
            int[] var5 = this.method4173(arg0, (byte) -111, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class673.field9452; ++var9) {
                int var10 = (var4[var9] * 255 & 1045901) >> 12;
                int var11 = var5[var9] * this.field8520 >> 12;
                int var12 = class300.field4511[var10] * var11 >> 12;
                int var13 = class792.field10865[var10] * var11 >> 12;
                int var14 = class407.field5754 & (var12 >> 12) + var9;
                int var15 = class348.field5094 & (var13 >> 12) + arg0;
                int[][] var16 = this.method4172(0, var15, 1);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
