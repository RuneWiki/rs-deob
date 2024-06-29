import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class47 extends InputStream {

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "[Lrk;")
    public static class30[] field729 = new class30[14];

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "F")
    public static float field732;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ICI)C")
    public static final char method484(int arg0, char arg1, int arg2) {
        field730++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else if (arg0 >= -30) {
            return '.';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)Z")
    public static final boolean method485(int arg0, int arg1) {
        if (arg0 == 200) {
            field727++;
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)V")
    public static void method486(boolean arg0) {
        if (arg0) {
            method486(true);
        }
        field729 = null;
    }

    @OriginalMember(owner = "client!aea", name = "read", descriptor = "()I")
    public final int read() {
        class561.method3202(30000L, (byte) -75);
        field731++;
        return -1;
    }
}
