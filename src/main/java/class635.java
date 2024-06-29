import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class635 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Z")
    public static boolean field8858 = false;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Ljw;")
    public static class581 field8859;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method3554(boolean arg0) {
        if (!arg0) {
            field8858 = true;
        }
        field8859 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
    public static final int method3555(int arg0, int arg1, int arg2) {
        field8860++;
        if (arg0 != 32672) {
            return -127;
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
