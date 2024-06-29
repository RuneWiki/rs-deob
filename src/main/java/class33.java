import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class33 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lcba;")
    public static class513 field963 = new class513();

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Laj;")
    public static class287 field964 = new class287(32);

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Z")
    public static boolean field966 = true;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method513(byte arg0) {
        field963 = null;
        if (arg0 != 52) {
            field964 = null;
        }
        field964 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method514(int arg0) {
        class163.field2738.method1913(true);
        if (arg0 != 12520) {
            field963 = null;
        }
        field968++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(CI)Z")
    public static final boolean method515(char arg0, int arg1) {
        field962++;
        if (arg1 != 45) {
            method515('p', 119);
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }
}
