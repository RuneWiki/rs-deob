import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class63 extends class68 {

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field818 = 127;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field821 = new String[100];

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field817;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public static void method364(int arg0) {
        field817 = null;
        field821 = null;
        if (arg0 != 241) {
            field821 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)I")
    public static final int method365(int arg0) {
        field819++;
        return arg0 > -103 ? -5 : 2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(CIB)I")
    public static final int method366(char arg0, int arg1, byte arg2) {
        field820++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        if (arg2 >= -6) {
            field821 = null;
        }
        return var3;
    }
}
