import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class123 {

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Lqaa;")
    public static class27 field1906 = new class27(27, 4);

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "D")
    public static double field1905;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lom;")
    public class372 field1902;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "[I")
    public int[] field1904;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method975(int arg0) {
        field1906 = null;
        if (arg0 != -128) {
            method975(53);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
    public static final void method976(boolean arg0) {
        field1903++;
        if (arg0 || class386.field5394) {
            return;
        }
        class718.method4010(!arg0, class25.field323);
        if (class421.field5916 != null) {
            class718.method4010(!arg0, class421.field5916);
        }
        class386.field5394 = true;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZB)Z")
    public static final boolean method977(boolean arg0, byte arg1) {
        field1900++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else if (var2 >= 128 && var2 < 160 && class740.field10391[var2 - 128] == '\u0000') {
            return false;
        } else {
            return !arg0;
        }
    }
}
