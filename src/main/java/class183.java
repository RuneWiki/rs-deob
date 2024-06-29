import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class183 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    public static int[] field3012 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field3011 = 127;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static void method1324(boolean arg0) {
        if (arg0) {
            field3012 = null;
        }
    }
}
