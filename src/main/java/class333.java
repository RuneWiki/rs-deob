import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class333 extends class80 {

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    private int field5049 = 4;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    private int field5050 = 4;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field5051;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int var4 = class137.field2308 / this.field5049;
            int var5 = class278.field4199 / this.field5050;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method710(class278.field4199 * var6 / var5, 0, (byte) 89);
            } else {
                var7 = this.method710(0, 0, (byte) 108);
            }
            for (int var8 = 0; ~var8 > ~class137.field2308; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class137.field2308 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        if (arg1 != -16828) {
            this.method29(127, 118);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field5053;
        int[][] var3 = super.field1589.method859(arg1, arg0 + -280);
        if (arg0 != 255) {
            this.method25(-35, -6);
        }
        if (super.field1589.field1884) {
            int var4 = class137.field2308 / this.field5049;
            int var5 = class278.field4199 / this.field5050;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method713(0, -44, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method713(0, arg0 ^ -205, class278.field4199 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class137.field2308 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class137.field2308 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field5052;
        int var4 = -26 % ((arg1 - 28) / 53);
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field5050 = arg2.method1858(-3256);
            }
        } else {
            this.field5049 = arg2.method1858(-3256);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class333() {
        super(1, false);
    }
}
