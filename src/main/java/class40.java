import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class40 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lab;I)Lub;")
    public static final class154 method242(class249 arg0, int arg1) {
        field606++;
        if (arg1 != 20263) {
            field605 = -55;
        }
        return new class154(arg0.method1762(-1), arg0.method1762(-1), arg0.method1762(-1), arg0.method1762(-1), arg0.method1812((byte) 52), arg0.method1812((byte) 52), arg0.method1802((byte) 69));
    }
}
