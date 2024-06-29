import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class656 {

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "[I")
    public static int[] field9235 = new int[1000];

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "J")
    public static long field9241 = -1L;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "B")
    public byte field9240;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "F")
    public static float field9237;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public int field9236;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Ljava/lang/String;")
    public String field9234;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "Ljava/lang/String;")
    public String field9238;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Ljava/lang/String;")
    public String field9239;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Ljava/lang/String;")
    public String field9242;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(CB)C", line = 8)
    public static final char method3649(char arg0, byte arg1) {
        int var2 = -95 % ((58 - arg1) / 59);
        field9233++;
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

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 415)
    public static void method3650(int arg0) {
        if (arg0 != -193) {
            method3649((char) 65460, (byte) -83);
        }
        field9235 = null;
    }
}
