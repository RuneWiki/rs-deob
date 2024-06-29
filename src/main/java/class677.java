import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class677 {

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "B")
    public static byte field9578;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "Lpu;")
    public static class522 field9579;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public static void method3761(boolean arg0) {
        field9579 = null;
        if (arg0) {
            method3761(true);
        }
    }
}
