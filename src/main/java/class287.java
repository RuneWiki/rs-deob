import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class287 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lne;")
    public static class139 field4471;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(CI)C")
    public static final char method1931(char arg0, int arg1) {
        field4474++;
        if (arg1 < 98) {
            method1931('_', 122);
        }
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1932(int arg0) {
        field4471 = null;
        if (arg0 <= 12) {
            field4472 = -121;
        }
    }
}
