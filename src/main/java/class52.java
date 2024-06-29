import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class52 {

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "Z")
    public static boolean field744 = false;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "F")
    public static float field741;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method345(int arg0, int arg1, int arg2) {
        if (arg1 == 32) {
            field742++;
            return (arg0 & 0x20) != 0;
        } else {
            return false;
        }
    }
}
