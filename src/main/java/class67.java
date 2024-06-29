import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class67 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lsc;")
    public static class181 field1082 = class149.method967(255, "www");

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lsc;")
    public static class181 field1084 = class149.method967(255, "<col=00ffff>");

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lsc;")
    private static class181 field1083 = class149.method967(255, "World");

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lsc;")
    public static class181 field1085 = field1083;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)V")
    public static final void method473(byte arg0, int arg1) {
        if (arg0 >= -13) {
            field1082 = null;
        }
        class83.field1328.method1796(20, arg1);
        field1081++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method474(int arg0) {
        field1083 = null;
        field1084 = null;
        if (arg0 < 38) {
            method473((byte) -84, 22);
        }
        field1082 = null;
        field1085 = null;
    }
}
