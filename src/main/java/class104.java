import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class104 extends class278 {

    @OriginalMember(owner = "client!as", name = "K", descriptor = "I")
    private int field1414 = 4;

    @OriginalMember(owner = "client!as", name = "N", descriptor = "I")
    private int field1417 = 4;

    @OriginalMember(owner = "client!as", name = "I", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!as", name = "M", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!as", name = "O", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!as", name = "L", descriptor = "Lvh;")
    public static class240 field1415;

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V", line = 6)
    public class104() {
        super(1, false);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Llh;II)V", line = 9)
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field1416;
        if (arg1 == -30446) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    this.field1417 = arg0.method2099(255);
                }
            } else {
                this.field1414 = arg0.method2099(255);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(II)[I", line = 44)
    public final int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            return null;
        } else {
            ++field1413;
            int[] var3 = super.field3750.method256(arg1, -30359);
            if (super.field3750.field554) {
                int var4 = class507.field7456 / this.field1414;
                int var5 = class307.field4211 / this.field1417;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method1570(0, 0, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method1570(0, 0, class307.field4211 * var7 / var5);
                }
                for (int var8 = 0; var8 < class507.field7456; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class507.field7456 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!as", name = "g", descriptor = "(I)V", line = 98)
    public static void method683(int arg0) {
        if (arg0 == -14079) {
            field1415 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)[[I", line = 111)
    public final int[][] method324(int arg0, int arg1) {
        ++field1418;
        if (arg0 < 75) {
            this.method324(78, -3);
        }
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int var4 = class507.field7456 / this.field1414;
            int var5 = class307.field4211 / this.field1417;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1568(5426, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1568(5426, 0, class307.field4211 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class507.field7456 < ~var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class507.field7456 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }
}
