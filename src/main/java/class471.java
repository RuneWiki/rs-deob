import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class471 {

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "Lmu;")
    public static class303 field6599 = new class303(113, 1);

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "[Lgw;")
    public static class172[] field6602 = new class172[14];

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "Lin;")
    public static class91 field6600;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Lsd;")
    public static class95 field6601;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIZ)I", line = 13)
    public static final int method2775(int arg0, int arg1, boolean arg2) {
        field6598++;
        if (arg2) {
            method2775(89, 115, true);
        }
        return arg0 == 1 || arg0 == 3 ? class454.field6407[arg1 & 0x3] : class336.field4746[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 28)
    public static void method2776(int arg0) {
        field6600 = null;
        field6599 = null;
        field6602 = null;
        field6601 = null;
        if (arg0 != 3) {
            method2776(55);
        }
    }
}
