import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class778 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    public static int[] field10729 = new int[4];

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method4268(byte arg0) {
        field10729 = null;
        if (arg0 != -88) {
            method4268((byte) 36);
        }
    }
}
