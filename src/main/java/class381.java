import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class381 {

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field5250;

    static {
        new class77("", 76);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method2257(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            field5250++;
            return (arg0 & 0x180) != 0;
        }
    }
}
