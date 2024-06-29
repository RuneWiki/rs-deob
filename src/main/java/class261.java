import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class261 {

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "[Z")
    public static boolean[] field3791 = new boolean[8];

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3794 = 1;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "[S")
    public static short[] field3795 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 3)
    public static void method1799(int arg0) {
        field3795 = null;
        if (arg0 <= -127) {
            field3791 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lnj;I)Lnk;", line = 27)
    public static final class206 method1800(class228 arg0, int arg1) {
        field3792++;
        if (arg1 != 0) {
            field3795 = null;
        }
        return new class206(arg0.method1319((byte) -13), arg0.method1319((byte) -13), arg0.method1319((byte) -13), arg0.method1319((byte) -13), arg0.method1333((byte) -106), arg0.method1348(-113));
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V", line = 45)
    public static final void method1801(int arg0, int arg1) {
        field3793++;
        if (arg0 != 31263) {
            field3791 = null;
        }
        if (class317.field4644 == null || arg1 > class317.field4644.length) {
            class317.field4644 = new int[arg1];
        }
    }
}
