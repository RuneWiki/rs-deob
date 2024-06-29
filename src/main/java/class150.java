import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class150 extends class179 {

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "Lie;")
    public static class117 field2586 = new class117(32);

    @OriginalMember(owner = "client!uc", name = "sb", descriptor = "Lia;")
    private static class257 field2588 = class28.method234(-27, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!uc", name = "tb", descriptor = "Lia;")
    public static class257 field2589 = class28.method234(77, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!uc", name = "rb", descriptor = "Lia;")
    public static class257 field2587 = field2588;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2586 = null;
        if (arg0 == 6313) {
            field2587 = null;
            field2589 = null;
            field2588 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field2585;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692 && this.method1233(877891460)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % super.field3099 * super.field3099;
            for (int var8 = 0; class96.field1807 > var8; ++var8) {
                int var9 = super.field3095[var8 % super.field3089 + var7];
                var5[var8] = class30.method252(255, var9) << 4;
                var6[var8] = class30.method252(4080, var9 >> 4);
                var4[var8] = class30.method252(16711680, var9) >> 12;
            }
        }
        return arg1 <= 2 ? null : var3;
    }
}
