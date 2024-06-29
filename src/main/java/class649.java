import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class649 {

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "[B")
    public static byte[] field9141 = new byte[2048];

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method3628(int arg0, int arg1) {
        field9140++;
        if (arg0 >= -87) {
            field9139 = -20;
        }
        return arg1 == 0;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)V", line = 17)
    public static void method3629(boolean arg0) {
        if (!arg0) {
            method3629(true);
        }
        field9141 = null;
    }
}
