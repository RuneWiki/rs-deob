import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class161 {

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2546 = new String[5];

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(CI)C")
    public static final char method1122(char arg0, int arg1) {
        field2545++;
        if (arg0 == 'Æ') {
            return 'E';
        }
        int var2 = -90 / ((arg1 + 90) / 32);
        if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
    public static void method1123(int arg0) {
        field2546 = null;
        if (arg0 != 23170) {
            method1122((char) 65452, -112);
        }
    }
}
