import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class43 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "[Z")
    public static boolean[] field726 = new boolean[8];

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V", line = 5)
    public static void method354(boolean arg0) {
        field726 = null;
        if (!arg0) {
            field726 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Z", line = 16)
    public static final boolean method355(int arg0, int arg1) {
        field727++;
        if ((short) arg0 == arg1 || arg1 == 3 || arg1 == 18 || arg1 == 44 || arg1 == 48) {
            return true;
        } else {
            return arg1 == 57 || arg1 == 1010;
        }
    }
}
