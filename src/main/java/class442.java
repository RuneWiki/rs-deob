import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class442 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[Z")
    public static boolean[] field6335 = new boolean[5];

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[[S")
    public static short[][] field6338 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZII)V")
    public static final void method2757(boolean arg0, int arg1, int arg2) {
        class62.field718.method2143(133, -2);
        if (!arg0) {
            field6337++;
            class328.field4653++;
            class62.field718.method1610(arg1, 113);
            class62.field718.method1588(128, arg2);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method2758(int arg0) {
        field6338 = null;
        field6335 = null;
        if (arg0 != -237) {
            field6335 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ICI)C")
    public static final char method2759(int arg0, char arg1, int arg2) {
        field6336++;
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
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
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
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
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
        } else {
            int var3 = -85 % ((-arg2 - 62) / 62);
            return arg1;
        }
    }
}
