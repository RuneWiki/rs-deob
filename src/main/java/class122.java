import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class122 extends class145 {

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lke;")
    private static class256 field2133 = class316.method2202("Loading wordpack )2 ", 27626);

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lke;")
    public static class256 field2136 = class316.method2202("; version=1; path=)4; domain=", 27626);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lke;")
    public static class256 field2138 = field2133;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)Lke;", line = 21)
    public static final class256 method814(int arg0, int arg1) {
        field2134++;
        class256 var2 = class305.method2125((byte) 66, arg1);
        for (int var3 = var2.method1799(127) - 3; var3 > 0; var3 -= 3) {
            var2 = class30.method214(new class256[] { var2.method1777(var3, 25163, 0), class121.field2132, var2.method1788(25610, var3) }, 29784);
        }
        if (var2.method1799(127) <= 9) {
            if (arg0 > -119) {
                method814(52, 0);
            }
            return var2.method1799(127) <= 6 ? class30.method214(new class256[] { class56.field1014, var2, class164.field2911 }, 29784) : class30.method214(new class256[] { class211.field3802, var2.method1777(var2.method1799(127) - 4, 25163, 0), class278.field4793, class28.field382, var2, class230.field3933 }, 29784);
        } else {
            return class30.method214(new class256[] { class64.field1120, var2.method1777(var2.method1799(127) - 8, 25163, 0), class46.field848, class28.field382, var2, class230.field3933 }, 29784);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 66)
    public static void method815(byte arg0) {
        if (arg0 >= -111) {
            method814(40, -73);
        }
        field2133 = null;
        field2136 = null;
        field2138 = null;
    }
}
