import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class117 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2083 = 0;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[Z")
    public static boolean[] field2084 = new boolean[100];

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lek;")
    public static class206 field2088;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V", line = 18)
    public static final void method859(int arg0, boolean arg1) {
        field2082++;
        class199 var2 = class173.method1231(arg1, 5, arg0);
        var2.method1358(-1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 33)
    public static void method860(boolean arg0) {
        field2084 = null;
        field2088 = null;
        if (!arg0) {
            method859(53, true);
        }
    }
}
