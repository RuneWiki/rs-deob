import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class690 {

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Z")
    public static boolean field9747 = false;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "Z")
    public static boolean field9745 = false;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIB)Z", line = 6)
    public static final boolean method3899(int arg0, int arg1, byte arg2) {
        if (arg2 >= -86) {
            field9747 = false;
        }
        field9746++;
        return (arg0 & 0x10) != 0;
    }
}
