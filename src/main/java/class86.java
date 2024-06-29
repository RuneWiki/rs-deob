import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class86 {

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Lwf;")
    public static class79 field1043 = new class79(70, 4);

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Lvp;")
    public static class112 field1047 = new class112("", 12);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field1045;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public static void method480(boolean arg0) {
        field1045 = null;
        field1043 = null;
        field1047 = null;
        if (arg0) {
            method481(39);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)Z")
    public static final boolean method481(int arg0) {
        field1046++;
        if (arg0 <= 118) {
            return true;
        } else if (class327.field4741 == 0) {
            return class330.field4781.method753(-1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(CII)C")
    public static final char method482(char arg0, int arg1, int arg2) {
        if (arg1 != 79) {
            return (char) 65484;
        }
        field1041++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }
}
