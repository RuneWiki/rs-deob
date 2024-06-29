import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class146 extends class390 {

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public volatile int field2078 = -1;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field2079;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()V")
    public static final void method995() {
        class125.method856(1, class392.field5617);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBII)V")
    public static final void method996(int arg0, byte arg1, int arg2, int arg3) {
        class141.field2024 = arg3;
        if (arg1 > -45) {
            field2082 = 104;
        }
        class361.field5001 = arg0;
        field2080++;
        class420.field5952 = arg2;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class146(String arg0) {
        this.field2079 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IC)C")
    public static final char method997(int arg0, char arg1) {
        field2077++;
        if (arg0 != 205) {
            return '\u0000';
        } else if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
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

    static {
        new class442("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field2081 = 0;
        field2082 = 0;
    }
}
