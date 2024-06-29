import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class41 {

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "[I")
    public static int[] field717 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "[I")
    public static int[] field719 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Lag;")
    public static class211 field718;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lofa;BI)Ljava/lang/String;")
    public static final String method448(class301 arg0, byte arg1, int arg2) {
        field716++;
        try {
            int var3 = arg0.method1968((byte) 112);
            if (arg1 != -23) {
                field718 = null;
            }
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field4534 += class378.field5677.method3501((byte) -10, arg0.field4543, var3, arg0.field4534, 0, var4);
            return class33.method168(true, var4, 0, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(CI)C")
    public static final char method449(char arg0, int arg1) {
        if (arg1 != 25005) {
            method450(76);
        }
        field715++;
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

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        field717 = null;
        field719 = null;
        field718 = null;
        if (arg0 != 16914) {
            field717 = null;
        }
    }
}
