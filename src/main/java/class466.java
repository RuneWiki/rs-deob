import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class466 extends class123 {

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "[C")
    public static char[] field6261 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "[I")
    public static int[] field6264 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Lria;", line = 8)
    public static final class288 method2658(int arg0, int arg1, int arg2) {
        ++field6265;
        class288 var3 = class501.method2936(-94, arg1);
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg2 != 30639) {
                field6261 = null;
            }
            return var3 != null && var3.field3779 != null && arg0 < var3.field3779.length ? var3.field3779[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V", line = 33)
    public static void method2659(int arg0) {
        if (arg0 == -1) {
            field6261 = null;
            field6264 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)I", line = 44)
    public static final int method2660(int arg0) {
        if (arg0 != -20139) {
            method2658(-54, -39, 62);
        }
        ++field6266;
        return class156.field2139;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)V", line = 56)
    public final void method936(int arg0, int arg1, byte arg2, int arg3) {
        super.field1776 = arg1;
        ++field6262;
        super.field1774 = arg0;
        super.field1777 = arg3;
        if (arg2 <= 54) {
            field6264 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIF)V", line = 69)
    public class466(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(FI)V", line = 74)
    public final void method941(float arg0, int arg1) {
        ++field6267;
        if (arg1 == 34168) {
            super.field1779 = arg0;
        }
    }
}
