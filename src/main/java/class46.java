import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class46 extends class1 {

    @OriginalMember(owner = "client!wf", name = "pb", descriptor = "I")
    public static int field1061 = 0;

    @OriginalMember(owner = "client!wf", name = "tb", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!wf", name = "ub", descriptor = "[I")
    public static int[] field1066 = new int[128];

    @OriginalMember(owner = "client!wf", name = "qb", descriptor = "Lv;")
    public static class57 field1062 = new class57();

    @OriginalMember(owner = "client!wf", name = "rb", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!wf", name = "sb", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!wf", name = "vb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(III)V")
    public static final void method461(int arg0, int arg1, int arg2) {
        ++field1063;
        class196.field3553.method1267(arg0, -9);
        class196.field3553.method64(arg2, 1738089264);
        class196.field3553.method87(-55174520, arg1);
        ++class62.field1331;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ldl;I)Z")
    public static final boolean method462(class31 arg0, int arg1) {
        if (arg1 != 890) {
            field1066 = null;
        }
        ++field1067;
        if (~arg0.field664 == -206) {
            class107.field2152 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "(I)V")
    public static void method463(int arg0) {
        field1062 = null;
        if (arg0 != 17979) {
            field1065 = -123;
        }
        field1066 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field1064;
        int var3 = -58 / ((-48 - arg0) / 42);
        int[][] var4 = super.field4568.method241(-94, arg1);
        if (super.field4568.field564 && this.method7((byte) -96)) {
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int var8 = arg1 % super.field1 * super.field1;
            for (int var9 = 0; ~var9 > ~class223.field3999; ++var9) {
                int var10 = super.field11[var9 % super.field22 + var8];
                var6[var9] = class68.method612(255, var10) << 4;
                var5[var9] = class68.method612(var10, 65280) >> 4;
                var7[var9] = class68.method612(var10, 16711680) >> 12;
            }
        }
        return var4;
    }
}
