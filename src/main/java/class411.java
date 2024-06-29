import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class411 {

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "[I")
    public static int[] field5866 = new int[1];

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 13)
    public static void method2489(int arg0) {
        if (arg0 != 1) {
            field5866 = null;
        }
        field5866 = null;
    }
}
