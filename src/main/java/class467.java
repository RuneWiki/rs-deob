import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class467 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "[Z")
    public static boolean[] field6966 = new boolean[100];

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field6967 = -1;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 19)
    public static void method2772(int arg0) {
        if (arg0 != 100) {
            field6966 = null;
        }
        field6966 = null;
    }
}
