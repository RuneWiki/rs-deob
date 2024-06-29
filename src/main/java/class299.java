import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class299 extends class245 {

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4780 = "Created gameworld";

    @OriginalMember(owner = "client!n", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4781 = new String[5];

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lwn;")
    public static class30 field4787 = new class30();

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field4789 = 0;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Leg;")
    public static class317 field4788;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 13)
    public static final int method2119(String arg0, byte arg1) {
        field4782++;
        int var2 = 57 % ((arg1 + 80) / 42);
        return class142.method1091(arg0, true, true, 10);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Ljava/lang/String;", line = 37)
    public static final String method2120(byte arg0) {
        field4783++;
        if (arg0 != 126) {
            return (String) null;
        }
        String var1;
        if (class25.field428 == 1 && class137.field2225 < 2) {
            var1 = class93.field1522 + class58.field876 + class141.field2283 + " ->";
        } else if (class315.field4977 && class137.field2225 < 2) {
            var1 = class129.field2067 + class58.field876 + class55.field848 + " ->";
        } else if (class281.field4404 && class48.field737[81] && class137.field2225 > 2) {
            var1 = class71.method574(arg0 ^ 0x38, class137.field2225 - 2);
        } else {
            var1 = class71.method574(59, class137.field2225 - 1);
        }
        if (class137.field2225 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class137.field2225 - 2) + class201.field3126;
        }
        return var1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 80)
    public static void method2121(byte arg0) {
        field4788 = null;
        field4781 = null;
        field4787 = null;
        field4780 = null;
        if (arg0 >= -31) {
            field4789 = 24;
        }
    }
}
