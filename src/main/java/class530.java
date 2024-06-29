import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class530 {

    @OriginalMember(owner = "client!is", name = "g", descriptor = "Z")
    public static boolean field7181 = true;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "[C")
    public static char[] field7184 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Lul;")
    public static class599 field7176 = new class599(4);

    @OriginalMember(owner = "client!is", name = "l", descriptor = "[Lom;")
    public static class395[] field7186 = new class395[16];

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "Lok;")
    public static class269 field7179;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Lgj;")
    public static class662 field7185;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[B")
    public byte[] field7177;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "[S")
    public short[] field7175;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "[S")
    public short[] field7182;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "[S")
    public short[] field7183;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lhk;IIII)Lvq;")
    public static final class488 method3010(class111 arg0, int arg1, int arg2, int arg3, int arg4) {
        field7178++;
        if (arg4 != 3553) {
            return null;
        } else if (!arg0.field1979 && (!class461.method2656(0, arg3) || !class461.method2656(0, arg2))) {
            return arg0.field1989 ? new class488(arg0, 34037, arg1, arg3, arg2) : new class488(arg0, arg1, arg3, arg2, class241.method1609((byte) -84, arg3), class241.method1609((byte) -98, arg2));
        } else {
            return new class488(arg0, 3553, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
    public static int method3011(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
    public static void method3012(boolean arg0) {
        if (!arg0) {
            method3010(null, -24, 84, -89, -95);
        }
        field7185 = null;
        field7179 = null;
        field7186 = null;
        field7176 = null;
        field7184 = null;
    }
}
