import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class66 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Z")
    public static boolean field736 = false;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Lqn;")
    public static class65 field737;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public static void method509(boolean arg0) {
        field737 = null;
        if (arg0) {
            field736 = true;
        }
    }
}
