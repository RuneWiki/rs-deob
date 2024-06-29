import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class445 extends class287 {

    @OriginalMember(owner = "client!go", name = "v", descriptor = "I")
    public int field6537 = -1;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "Lhn;")
    public static class509 field6533 = new class509(111, 7);

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public int field6531;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "Lul;")
    public static class406 field6530;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "Ljava/lang/String;")
    public String field6532;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "Ljava/lang/String;")
    public String field6535;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Lkc;", line = 4)
    public final class89 method2733(int arg0) {
        ++field6529;
        return arg0 != -1 ? null : class45.field583[super.field4347];
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIBII)V", line = 15)
    public static final void method2734(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class109[] var7 = class303.field4580;
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class109 var9 = var7[var8];
            if (var9 != null && var9.field1523 == 2) {
                class82.method688(arg2, var9.field1524, var9.field1517, arg5, var9.field1522 * 2, var9.field1516, true, arg1 >> 1, arg0 >> 1);
                if (~class229.field3733[0] < 0 && class475.field6854 % 20 < 10) {
                    class118.field1789[var9.field1518].method132(arg6 - -class229.field3733[0] - 12, class229.field3733[1] + arg3 + -28);
                }
            }
        }
        ++field6534;
        if (arg4 >= -13) {
            field6536 = -14;
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V", line = 49)
    public static void method2735(int arg0) {
        field6530 = null;
        field6533 = null;
        if (arg0 != 0) {
            field6530 = null;
        }
    }
}
