import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class50 {

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field900 = 1;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "Lrn;")
    public static class174 field907 = new class174(26, -1);

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "Lbu;")
    public static class17 field901;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IC)C", line = 3)
    public static final char method460(int arg0, char arg1) {
        field899++;
        if (arg0 != 110) {
            method461((byte) -99);
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

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 412)
    public static void method461(byte arg0) {
        field901 = null;
        if (arg0 != -27) {
            field900 = -40;
        }
        field907 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIIIII)V", line = 423)
    public static final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field906++;
        if (arg6 <= 46) {
            field902 = 56;
        }
        if (class355.method2252(arg3, -117)) {
            if (class388.field5835[arg3] == null) {
                class184.method1287(class22.field438[arg3], 0, arg0, arg8, arg2, arg1, -1, arg4, arg7, arg5);
            } else {
                class184.method1287(class388.field5835[arg3], 0, arg0, arg8, arg2, arg1, -1, arg4, arg7, arg5);
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class355.field5424[var9] = true;
            }
        } else {
            class355.field5424[arg4] = true;
        }
    }
}
