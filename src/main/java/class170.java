import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class170 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[S")
    public static short[] field2530;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method1113(int arg0) {
        if (arg0 == 0) {
            field2530 = null;
        }
    }
}
