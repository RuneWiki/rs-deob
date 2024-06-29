import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class199 extends class16 {

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field2717 = 0;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZC)C")
    public static final char method1270(boolean arg0, char arg1) {
        field2714++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else {
            if (arg0) {
                method1270(true, '\u001e');
            }
            if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }
}
