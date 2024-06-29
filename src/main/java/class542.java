import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class542 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[I")
    public static int[] field7485;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method3135(boolean arg0) {
        if (arg0) {
            field7485 = null;
        }
    }
}
