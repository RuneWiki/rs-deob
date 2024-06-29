import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class73 {

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Z")
    public static boolean field944 = false;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[I")
    public static int[] field938;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[[B")
    public static byte[][] field940;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IC)C")
    public static final char method429(int arg0, char arg1) {
        if (arg0 < 120) {
            method429(70, '?');
        }
        field941++;
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

    @OriginalMember(owner = "client!tk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field939++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)I")
    public static final int method430(int arg0, byte arg1) {
        if (arg1 != 20) {
            method432(-109, null, null);
        }
        field942++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method431(int arg0) {
        if (arg0 != -253) {
            method429(72, (char) 65513);
        }
        field940 = null;
        field938 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILlj;Llj;)V")
    public static final void method432(int arg0, class477 arg1, class477 arg2) {
        field943++;
        if (arg2.field6446 != null) {
            arg2.method2669(-29226);
        }
        arg2.field6446 = arg1;
        arg2.field6447 = arg1.field6447;
        arg2.field6446.field6447 = arg2;
        if (arg0 != 8091) {
            method430(-90, (byte) -20);
        }
        arg2.field6447.field6446 = arg2;
    }
}
