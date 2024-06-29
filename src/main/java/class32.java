import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class32 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[I")
    public static int[] field360 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[I")
    public static int[] field361;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method156(int arg0, int arg1) {
        field359++;
        if (arg1 != -20211) {
            method157(false);
        }
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 18)
    public static void method157(boolean arg0) {
        field360 = null;
        if (!arg0) {
            field361 = null;
        }
    }
}
