import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class566 extends Exception {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lqe;")
    public static class469 field8043 = new class469(77, -1);

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "[I")
    public static int[] field8047 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field8046 = 0;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lfg;")
    public static class129 field8045;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)Ljj;")
    public static final class120 method3297(int arg0) {
        field8044++;
        return arg0 > -95 ? null : class84.field1177;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public static void method3298(int arg0) {
        field8043 = null;
        field8045 = null;
        field8047 = null;
        if (arg0 != 8) {
            field8046 = -113;
        }
    }
}
