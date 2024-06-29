import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class452 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lqg;")
    public static class271 field6515;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static final void method2654(byte arg0) {
        field6514++;
        if (class551.field8117 != null) {
            if (class551.field8117.field3311 == 1) {
                class551.field8117 = null;
                return;
            }
            if (class551.field8117.field3311 == 2) {
                class578.method3322(class118.field1761, 2, class283.field3776, -25640);
                class551.field8117 = null;
                return;
            }
        }
        if (arg0 <= 19) {
            field6515 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public static void method2655(byte arg0) {
        if (arg0 != 85) {
            field6515 = null;
        }
        field6515 = null;
    }
}
