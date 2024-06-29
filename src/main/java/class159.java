import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class159 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Z")
    public static boolean field2660 = false;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lci;")
    public static class60 field2662 = new class60();

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lrc;")
    public static class9 field2664 = new class9(64);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient;")
    public static client field2663;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method1089(int arg0) {
        if (arg0 <= -37) {
            field2663 = null;
            field2662 = null;
            field2664 = null;
        }
    }
}
