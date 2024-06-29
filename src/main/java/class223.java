import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class223 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lve;")
    public static class255 field3746 = class87.method607(67, ")4a=");

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Z")
    public static boolean field3748 = false;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
    public static int[] field3747;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 28)
    public static void method1563(int arg0) {
        field3746 = null;
        if (arg0 != 2013) {
            field3746 = (class255) null;
        }
        field3747 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lrg;IZI)[Ldm;", line = 39)
    public static final class273[] method1564(class88 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field3749++;
            return class96.method763((byte) 73, arg3, arg1, arg0) ? class18.method96(2) : null;
        } else {
            return (class273[]) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lrg;BLrg;Lrg;Lrg;)V", line = 68)
    public static final void method1565(class88 arg0, byte arg1, class88 arg2, class88 arg3, class88 arg4) {
        class285.field4904 = arg0;
        class253.field4254 = arg4;
        class50.field747 = arg3;
        if (arg1 < 69) {
            field3748 = false;
        }
        field3745++;
        class297.field5082 = arg2;
        class297.field5087 = new class197[class253.field4254.method638(-115)][];
        class107.field1794 = new boolean[class253.field4254.method638(-65)];
    }
}
