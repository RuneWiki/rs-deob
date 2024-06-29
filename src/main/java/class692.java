import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class692 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Z")
    public static boolean field9219 = false;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lsja;")
    public static class11 field9218 = new class11(64);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "F")
    public static float field9217;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method3779(boolean arg0) {
        if (!arg0) {
            field9219 = false;
        }
        field9218 = null;
    }
}
