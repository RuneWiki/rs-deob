import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class634 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[I")
    public static int[] field8743 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Z")
    public static final boolean method3527(int arg0, int arg1, int arg2) {
        if (arg0 == 9) {
            field8742++;
            return (arg1 & 0x84080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method3528(int arg0) {
        if (arg0 != 12) {
            field8743 = null;
        }
        field8743 = null;
    }
}
