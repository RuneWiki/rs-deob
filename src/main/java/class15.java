import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class15 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field298 = -1;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lgi;")
    public static class164 field296;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lgi;")
    public static class164 field297;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method128(int arg0) {
        field296 = null;
        field297 = null;
        if (arg0 != 15732) {
            field297 = null;
        }
    }
}
