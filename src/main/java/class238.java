import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class238 {

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "Z")
    public static boolean field3551;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)Z")
    public static final boolean method1657(int arg0, int arg1) {
        field3550++;
        if (~arg0 == arg1 || arg0 == 11 || arg0 == 2 || arg0 == 60 || arg0 == 48) {
            return true;
        } else {
            return arg0 == 57 || arg0 == 1011;
        }
    }
}
