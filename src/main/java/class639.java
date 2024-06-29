import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class639 {

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "Lafa;")
    public static class365 field8801 = new class365();

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IC)C")
    public static final char method3561(int arg0, char arg1) {
        field8799++;
        if (arg0 != 29237) {
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

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
    public static final void method3562(byte arg0) {
        if (arg0 < -19) {
            field8798++;
            class34.field569 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
    public static void method3563(byte arg0) {
        field8801 = null;
        int var1 = -49 % ((arg0 - 64) / 38);
    }
}
