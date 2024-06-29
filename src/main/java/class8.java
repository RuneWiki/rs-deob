import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class8 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public static int[] field90 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method62(int arg0) {
        field90 = null;
        if (arg0 != 6656) {
            method62(101);
        }
    }
}
