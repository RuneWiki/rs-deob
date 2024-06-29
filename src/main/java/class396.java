import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class396 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lgf;")
    public static class180 field5824 = new class180(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Lvp;")
    public static class123 field5826 = new class123(27, 8);

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "[C")
    public static char[] field5827 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Z")
    public static boolean field5829 = false;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Z")
    public static boolean field5828 = true;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Lnh;", line = 7)
    public static final class524 method2468(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2480;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 14)
    public static void method2469(int arg0) {
        field5826 = null;
        field5827 = null;
        if (arg0 != 249) {
            method2470(-110, null, null);
        }
        field5824 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILhh;Lm;)V", line = 29)
    public static final void method2470(int arg0, class84 arg1, class126 arg2) {
        class207.field2985 = arg2;
        field5823++;
        class119.field1877 = arg1;
        if (arg0 != -13704) {
            field5826 = null;
        }
    }
}
