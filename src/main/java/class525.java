import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class525 extends class184 {

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "Z")
    private boolean field7757 = true;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "Z")
    private boolean field7761 = true;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "[[I")
    public static int[][] field7758 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "Lap;")
    public static class335 field7756 = new class335("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "[I")
    public static int[] field7762 = new int[2];

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!wo", name = "O", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "Ldq;")
    public static class493 field7765;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "[I")
    public static int[] field7763;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V", line = 4)
    public static void method3130(int arg0) {
        if (arg0 != 1) {
            field7765 = null;
        }
        field7762 = null;
        field7758 = null;
        field7763 = null;
        field7765 = null;
        field7756 = null;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V", line = 30)
    public class525() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)[I", line = 38)
    public final int[] method6(int arg0, int arg1) {
        ++field7759;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            return null;
        } else {
            if (super.field2409.field436) {
                int[] var4 = this.method1159(123, !this.field7757 ? arg0 : -arg0 + class501.field7240, 0);
                if (!this.field7761) {
                    class318.method1872(var4, 0, var3, 0, class245.field3167);
                } else {
                    for (int var5 = 0; ~class245.field3167 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class421.field5961];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)[[I", line = 81)
    public final int[][] method13(int arg0, int arg1) {
        ++field7766;
        int[][] var3 = super.field2416.method3031(arg1 ^ -28525, arg0);
        if (super.field2416.field7271) {
            int[][] var4 = this.method1163(arg1, !this.field7757 ? arg0 : -arg0 + class501.field7240, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field7761) {
                for (int var11 = 0; ~class245.field3167 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class245.field3167 < ~var12; ++var12) {
                    var8[var12] = var5[-var12 + class421.field5961];
                    var9[var12] = var6[class421.field5961 - var12];
                    var10[var12] = var7[-var12 + class421.field5961];
                }
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BILfh;)V", line = 151)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field7760;
        int var4 = -58 % ((-13 - arg0) / 51);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field2406 = ~arg2.method2737(false) == -2;
                }
            } else {
                this.field7757 = ~arg2.method2737(false) == -2;
            }
        } else {
            this.field7761 = arg2.method2737(false) == 1;
        }
    }
}
