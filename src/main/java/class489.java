import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class489 {

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "[[Z")
    public static boolean[][] field6695 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lgu;")
    public static class581 field6696;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2751(int arg0, int arg1, int arg2) {
        field6694++;
        if (arg1 != 16) {
            field6695 = null;
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 17)
    public static void method2752(int arg0) {
        field6696 = null;
        if (arg0 != 1) {
            field6695 = null;
        }
        field6695 = null;
    }
}
