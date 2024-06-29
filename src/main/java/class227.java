import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class227 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "F")
    public static float field2590 = 0.0F;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field2594 = 0;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "[I")
    public static int[] field2593 = new int[1000];

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Ldfa;")
    public static class165 field2589;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lgd;")
    public static class339 field2592;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1309(int arg0) {
        if (arg0 <= 6) {
            return;
        }
        class178.field2090++;
        field2591++;
        class249 var1 = class289.method1715(class267.field3310, 66, class41.field470);
        var1.field3016.method1460(class735.method4098(false), 24710);
        var1.field3016.method1446(class705.field9926, true);
        var1.field3016.method1446(class476.field6777, true);
        var1.field3016.method1460(class654.field9334.field9852.method3133(-120), 24710);
        class510.method3017(var1, 101);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 35)
    public static void method1310(byte arg0) {
        field2589 = null;
        field2592 = null;
        field2593 = null;
        if (arg0 < 84) {
            field2589 = null;
        }
    }
}
