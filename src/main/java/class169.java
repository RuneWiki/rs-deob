import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class169 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public int field2105;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lpe;")
    public static class615 field2101;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1159(boolean arg0) {
        field2101 = null;
        if (!arg0) {
            method1160(-48, -18);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Z", line = 18)
    public static final boolean method1160(int arg0, int arg1) {
        field2104++;
        if (arg0 == 12) {
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        } else {
            return false;
        }
    }
}
