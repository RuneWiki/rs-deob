import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class53 extends class86 {

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static volatile int field803 = 0;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Ll;")
    public static class66 field801 = new class66(50);

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "Lrg;")
    public static class342 field804;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 4)
    public class53() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[I", line = 13)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 <= 7) {
            return (int[]) null;
        } else {
            field802++;
            return class347.field5515;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V", line = 25)
    public static void method518(boolean arg0) {
        field801 = null;
        if (arg0) {
            field804 = (class342) null;
        }
        field804 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IC)C", line = 46)
    public static final char method519(int arg0, char arg1) {
        field805++;
        if (arg0 != -195) {
            return 'v';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == '-') {
            return '\u0000';
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
        } else if (arg1 == ' ' || arg1 == ' ') {
            return '_';
        } else {
            return Character.toLowerCase(arg1);
        }
    }
}
