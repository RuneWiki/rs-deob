import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class79 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "F")
    public static float field931 = 1.0F;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Ltt;")
    public static class338 field930 = new class338(27, 0);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Z")
    public static boolean field933 = false;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "J")
    public static long field934 = -1L;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method427(int arg0) {
        if (arg0 != 27) {
            method427(19);
        }
        field930 = null;
    }
}
