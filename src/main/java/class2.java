import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "[S")
    public static short[] field9 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILhc;II)Lq;")
    public static final class128 method7(int arg0, class235 arg1, int arg2, int arg3) {
        field11++;
        if (class57.method351(arg1, arg2, arg0, (byte) 71)) {
            return arg3 == 9104 ? class119.method794((byte) -109) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static void method8(boolean arg0) {
        field9 = null;
        if (!arg0) {
            field9 = null;
        }
    }
}
