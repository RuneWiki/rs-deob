import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class196 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    public static int[] field2801 = new int[32];

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "J")
    public static long field2800;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lvh;")
    public static class327[] field2799;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field2801 = null;
        if (arg0 == 32) {
            field2799 = null;
        }
    }
}
