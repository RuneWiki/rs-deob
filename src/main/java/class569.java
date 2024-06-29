import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class569 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    public static int[] field8029 = new int[14];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[I")
    public static int[] field8030;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 10)
    public static void method3353(int arg0) {
        if (arg0 != 14) {
            method3353(114);
        }
        field8030 = null;
        field8029 = null;
    }
}
