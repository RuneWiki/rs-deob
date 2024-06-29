import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class294 {

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[I")
    public static int[] field4459 = new int[1];

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Ltq;")
    public static class427 field4458 = null;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static void method1784(int arg0) {
        field4458 = null;
        field4459 = null;
        if (arg0 != 85) {
            method1786(-68, 50, 70, null);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZCI)C")
    public static final char method1785(boolean arg0, char arg1, int arg2) {
        field4460++;
        if (!arg0) {
            method1785(true, (char) 65438, 94);
        }
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
            if (arg1 == 'Ñ' && arg2 != 0) {
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
            if (arg1 == 'ñ' && arg2 != 0) {
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
            return arg1;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILtq;)V")
    public static final void method1786(int arg0, int arg1, int arg2, class427 arg3) {
        class73.field1312 = arg3;
        class221.field3417 = arg0;
        field4457++;
        class496.field7529 = arg1;
        if (arg2 <= 94) {
            field4459 = null;
        }
    }
}
