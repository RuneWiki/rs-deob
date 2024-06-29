import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class718 extends class222 {

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "[J")
    public static long[] field9777 = new long[32];

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public static void method3998(int arg0) {
        field9777 = null;
        if (arg0 < 27) {
            method3998(42);
        }
    }
}
