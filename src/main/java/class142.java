import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class142 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public static int[] field2111 = new int[100];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lhh;I)I", line = 3)
    public static final int method1032(class84 arg0, int arg1) {
        field2113++;
        int var2 = 0;
        if (arg0.method682(arg1, class390.field5792)) {
            var2++;
        }
        if (arg0.method682(arg1, class418.field6176)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 20)
    public static void method1033(int arg0) {
        if (arg0 != 11730) {
            field2111 = null;
        }
        field2111 = null;
    }
}
