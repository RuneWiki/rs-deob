import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class198 {

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method1280(int arg0, int arg1) {
        field2695++;
        if (arg0 == 11 || arg0 == 8 || arg0 == 46 || arg0 == 6 || arg0 == 23) {
            return true;
        } else if (arg1 == -1007) {
            return arg0 == 59 || arg0 == 1006;
        } else {
            return true;
        }
    }
}
