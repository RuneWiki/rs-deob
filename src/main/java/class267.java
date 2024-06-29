import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class267 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Z")
    public static boolean field3381 = false;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field3383 = 0;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field3382 = 0;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    public static int[] field3384;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method1549(byte arg0) {
        if (arg0 != -112) {
            method1549((byte) 124);
        }
        field3384 = null;
    }
}
