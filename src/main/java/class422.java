import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class422 extends class634 {

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "[Lq;")
    public static class426[] field6148 = new class426[75];

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "I")
    public static int field6146 = 0;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "Ljo;")
    public static class334 field6147;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        ++field6145;
        int var3 = -9 % ((-56 - arg0) / 53);
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[][] var5 = this.method3642(0, arg1, true);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class635.field9139; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var10[var12] = -var7[var12] + 4096;
                var11[var12] = -var8[var12] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field6144;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 >= -55) {
            field6147 = null;
        }
        if (super.field9114.field3897) {
            int[] var4 = this.method3641(arg1, 20604, 0);
            for (int var5 = 0; ~class635.field9139 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V")
    public class422() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "(I)V")
    public static void method2645(int arg0) {
        if (arg0 <= 66) {
            field6146 = -78;
        }
        field6147 = null;
        field6148 = null;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field6149;
        if (~arg0 == -1) {
            super.field9121 = ~arg1.method1423(-123) == -2;
        }
        if (arg2) {
            field6148 = null;
        }
    }
}
