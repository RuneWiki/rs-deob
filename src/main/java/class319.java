import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class319 {

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "[I")
    public static int[] field3935 = new int[5];

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3937 = new String[100];

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V", line = 3)
    public static void method1818(byte arg0) {
        field3937 = null;
        if (arg0 < 25) {
            method1819(64, -49, 71);
        }
        field3935 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Lbo;", line = 15)
    public static final class245 method1819(int arg0, int arg1, int arg2) {
        class499 var3 = class487.field7044[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7215;
    }
}
