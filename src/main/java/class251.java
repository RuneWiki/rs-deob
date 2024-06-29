import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class251 extends class91 {

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "[I")
    public static int[] field4017 = new int[14];

    @OriginalMember(owner = "client!fj", name = "cb", descriptor = "I")
    public static int field4020 = 0;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "Lef;")
    public static class214 field4016;

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "[I")
    public static int[] field4018;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ldl;B)V")
    public static final void method1686(class123 arg0, byte arg1) {
        class198.field3085 = arg0;
        ++field4015;
        if (arg1 >= -119) {
            method1687(-71);
        }
    }

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "(I)V")
    public static void method1687(int arg0) {
        if (arg0 != 24107) {
            method1687(97);
        }
        field4017 = null;
        field4016 = null;
        field4018 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field4019;
        if (arg1 != 1) {
            field4016 = null;
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042 && this.method613(45)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1397 * super.field1397;
            for (int var8 = 0; class78.field1108 > var8; ++var8) {
                int var9 = super.field1387[var8 % super.field1385 + var7];
                var6[var8] = class224.method1526(var9, 255) << 4;
                var5[var8] = class224.method1526(var9 >> 4, 4080);
                var4[var8] = class224.method1526(16711680, var9) >> 12;
            }
        }
        return var3;
    }
}
