import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class650 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lhda;")
    public static class752 field8632 = new class752(46, 3);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field8633 = 0;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "[[Z")
    public static boolean[][] field8635 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[I")
    public static int[] field8634 = new int[1];

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method3551(byte arg0) {
        field8632 = null;
        field8634 = null;
        field8635 = null;
        if (arg0 >= -87) {
            field8633 = -119;
        }
    }
}
