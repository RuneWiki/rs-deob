import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class617 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field8294 = 0;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
    public static boolean field8295 = false;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
    public static final boolean method3490(int arg0, int arg1, int arg2) {
        field8296++;
        if (arg2 == 0) {
            return (arg0 & 0x10) != 0;
        } else {
            return true;
        }
    }
}
