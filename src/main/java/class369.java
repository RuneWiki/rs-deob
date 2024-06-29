import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class369 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[C")
    public static char[] field4846 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4847 = -1;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    public static int[] field4848 = new int[2];

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[Lf;")
    public static class532[] field4849;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 14)
    public static void method2138(byte arg0) {
        if (arg0 != 66) {
            field4849 = null;
        }
        field4846 = null;
        field4849 = null;
        field4848 = null;
    }
}
