import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class328 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field4264 = 0;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field4266 = 0;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(CI)C")
    public static final char method1855(char arg0, int arg1) {
        field4265++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else {
            if (arg1 <= 50) {
                method1855((char) 65477, 122);
            }
            if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }
}
