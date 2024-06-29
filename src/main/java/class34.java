import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class34 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field529 = new String[200];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[C")
    public static char[] field528 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field530 = 104;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field531 = 104;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 3)
    public static void method268(int arg0) {
        field528 = null;
        field529 = null;
        if (arg0 < 12) {
            field530 = 127;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Llw;", line = 29)
    public static final class618 method269(int arg0, int arg1, int arg2) {
        class24 var3 = class703.field9899[arg0][arg1][arg2];
        return var3 == null || var3.field422 == null ? null : var3.field422;
    }
}
