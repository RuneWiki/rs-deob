import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class97 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lnm;")
    public static class221 field1403;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lnm;")
    public static class221 field1406;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 7)
    public static void method639(boolean arg0) {
        field1406 = null;
        field1403 = null;
        if (arg0) {
            method639(false);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lpi;", line = 19)
    public static final class229 method640(byte arg0) {
        if (arg0 != 86) {
            return (class229) null;
        }
        field1404++;
        try {
            return (class229) Class.forName("en").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V", line = 36)
    public static final void method641(int arg0, int arg1) {
        field1405++;
        class211 var2 = class17.method115(arg1, arg0, 4086);
        var2.method1435((byte) -2);
    }
}
