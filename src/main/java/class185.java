import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class185 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "J")
    public static long field3112 = 0L;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[Z")
    public static boolean[] field3111 = new boolean[100];

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[I")
    public static int[] field3113 = new int[200];

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Z")
    public static boolean field3114 = true;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method1503(byte arg0) {
        field3111 = null;
        if (arg0 < -35) {
            field3113 = null;
        }
    }
}
