import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class305 {

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "[I")
    public static int[] field4258 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "Z")
    public static boolean field4261 = false;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "Leda;")
    public static class116 field4260;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "Lf;")
    public static class257 field4259;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V", line = 11)
    public static void method1861(int arg0) {
        field4259 = null;
        field4258 = null;
        field4260 = null;
        if (arg0 != 3) {
            field4261 = true;
        }
    }
}
