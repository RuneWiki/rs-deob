import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class692 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Z")
    public static boolean field9845 = false;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "F")
    public static float field9846;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "Ljn;")
    public static class668 field9847;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Lrh;", line = 7)
    public static final class242 method3904(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6210;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 15)
    public static void method3905(int arg0) {
        field9847 = null;
        if (arg0 != 6741) {
            method3904(-43, -47, -18);
        }
    }
}
