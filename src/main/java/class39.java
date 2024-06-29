import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class39 extends class529 {

    @OriginalMember(owner = "client!aea", name = "D", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "Lwp;")
    public static class453 field519 = new class453(99, 7);

    @OriginalMember(owner = "client!aea", name = "E", descriptor = "Lil;")
    public static class68 field523 = new class68(512);

    @OriginalMember(owner = "client!aea", name = "G", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "client!aea", name = "H", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field526 = new Hashtable();

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!aea", name = "F", descriptor = "Lbc;")
    public static class669 field524;

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lct;Lrc;IIIIIIIIIIIIII)V", line = 5)
    public class39(class414 arg0, class29 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field522 = arg15;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BC)C", line = 14)
    public static final char method233(byte arg0, char arg1) {
        field521++;
        if (arg0 > -29) {
            method233((byte) 26, (char) 65435);
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

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)V", line = 406)
    public static void method234(int arg0) {
        field523 = null;
        if (arg0 != -236) {
            method234(-24);
        }
        field519 = null;
        field526 = null;
        field524 = null;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Lwea;", line = 432)
    public final class259 method235(int arg0) {
        if (arg0 <= 38) {
            field525 = 49;
        }
        field520++;
        return class119.field1525;
    }
}
