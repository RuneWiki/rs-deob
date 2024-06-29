import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class37 extends class263 {

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Z")
    public static boolean field542 = false;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lip;")
    public static class662 field543;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method241(int arg0) {
        field543 = null;
        if (arg0 < 25) {
            field542 = false;
        }
    }
}
