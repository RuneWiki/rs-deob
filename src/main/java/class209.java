import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class209 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Z")
    public static boolean field2466 = false;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lof;")
    public static class620 field2467 = new class620(8);

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method1245(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2468++;
        if (arg1 != 8) {
            return;
        }
        if (arg3 > arg4) {
            for (int var5 = arg4; var5 < arg3; var5++) {
                class408.field5585[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg4; var6++) {
                class408.field5585[var6][arg0] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 48)
    public static void method1246(int arg0) {
        field2467 = null;
        if (arg0 != 17390) {
            field2466 = false;
        }
    }
}
