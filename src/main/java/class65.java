import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class65 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[[B")
    public static byte[][] field808 = new byte[1000][];

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[I")
    public static int[] field809 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[Lqr;")
    public static class665[] field812;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 4)
    public static void method373(boolean arg0) {
        field808 = null;
        if (arg0) {
            method373(true);
        }
        field809 = null;
        field812 = null;
    }
}
