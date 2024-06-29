import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class161 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2475 = 2301979;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2473 = 0;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[I")
    public static int[] field2474 = new int[64];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static void method1001(boolean arg0) {
        field2474 = null;
        if (arg0) {
            method1001(false);
        }
    }
}
