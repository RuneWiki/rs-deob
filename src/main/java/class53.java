import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public abstract class class53 extends class356 {

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field550;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V", line = 8)
    public static void method268(int arg0) {
        field550 = null;
        if (arg0 != 205) {
            method269('\u0011', false);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(CZ)C", line = 24)
    public static final char method269(char arg0, boolean arg1) {
        field549++;
        if (arg1) {
            field551 = 30;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(I)V", line = 417)
    public class53(int arg0) {
        this.field552 = arg0;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method266(byte arg0);

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "(B)Z")
    public abstract boolean method267(byte arg0);
}
