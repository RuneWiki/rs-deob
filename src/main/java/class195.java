import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class195 {

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2633;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "[[[S")
    public static short[][][] field2630;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public static void method1203(byte arg0) {
        if (arg0 != -32) {
            field2633 = null;
        }
        field2630 = null;
        field2633 = null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZC)C")
    public static final char method1204(boolean arg0, char arg1) {
        field2632++;
        if (!arg0) {
            method1204(false, (char) 65505);
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }
}
