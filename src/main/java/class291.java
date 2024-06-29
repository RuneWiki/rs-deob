import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class291 {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "[I")
    public static int[] field4328 = new int[14];

    @OriginalMember(owner = "client!es", name = "c", descriptor = "[I")
    public static int[] field4329 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lmb;")
    public static class258 field4331 = null;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Z")
    public static boolean field4332 = false;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 17)
    public static void method2037(int arg0) {
        if (arg0 != 64) {
            field4330 = -119;
        }
        field4331 = null;
        field4328 = null;
        field4329 = null;
    }
}
