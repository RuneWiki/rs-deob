import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class531 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IB)Ljaa;", line = 10)
    public static final class266 method3032(int arg0, byte arg1) {
        field7480++;
        if (class280.field3552 && class33.field518 <= arg0 && arg0 <= class466.field6725) {
            if (arg1 > -12) {
                method3032(19, (byte) 93);
            }
            return class233.field3018[arg0 - class33.field518];
        } else {
            return null;
        }
    }
}
