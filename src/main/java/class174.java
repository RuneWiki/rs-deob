import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class174 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2826 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lqd;")
    public static class40 field2829 = class147.method1106("n", (byte) -99);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
    public static boolean field2830 = false;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
    public static int[] field2828;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 38)
    public static void method1276(byte arg0) {
        field2829 = null;
        field2828 = null;
        if (arg0 != 18) {
            field2826 = -36;
        }
    }
}
