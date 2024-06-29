import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class351 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "[I")
    public static int[] field4721 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "[I")
    public static int[] field4720 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4723 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Lhc;")
    public static class368 field4722 = new class368("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public static void method2120(byte arg0) {
        field4721 = null;
        field4723 = null;
        field4722 = null;
        if (arg0 != 2) {
            field4722 = null;
        }
        field4720 = null;
    }
}
