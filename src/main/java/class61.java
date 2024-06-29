import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class61 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field702 = 328;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "[[Z")
    public static boolean[][] field706 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Lbq;")
    public static class192 field705;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZC)C")
    public static final char method366(boolean arg0, char arg1) {
        field703++;
        if (!arg0) {
            method368(54);
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

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZII)I")
    public static final int method367(int arg0, boolean arg1, int arg2, int arg3) {
        field704++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            if (arg1) {
                field706 = null;
            }
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static void method368(int arg0) {
        field706 = null;
        if (arg0 != 95) {
            field702 = 21;
        }
        field705 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Lno;")
    public static final class498 method369(int arg0, int arg1, int arg2) {
        if (class186.field2421[arg0][arg1][arg2] == null) {
            boolean var3 = class186.field2421[0][arg1][arg2] != null && class186.field2421[0][arg1][arg2].field7276 != null;
            if (var3 && arg0 >= class478.field7065 - 1) {
                return null;
            }
            class469.method2862(arg0, arg1, arg2);
        }
        return class186.field2421[arg0][arg1][arg2];
    }

    static {
        new class305("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
