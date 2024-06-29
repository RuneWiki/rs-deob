import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class653 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[Lf;")
    public static class788[] field9050;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field9049;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method3671(byte arg0) {
        if (arg0 == 42) {
            field9049 = null;
            field9050 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(CI)Z")
    public static final boolean method3672(char arg0, int arg1) {
        field9048++;
        if (arg1 == 48) {
            return arg0 >= '0' && arg0 <= '9';
        } else {
            return false;
        }
    }
}
