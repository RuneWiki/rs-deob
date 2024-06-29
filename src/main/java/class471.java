import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class471 {

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Leh;")
    public static class246 field6566 = new class246(113, 4);

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "[I")
    public static int[] field6568 = new int[5];

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "[C")
    public static char[] field6571 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Lhm;")
    public static class150 field6573 = null;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "F")
    public static float field6569;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "F")
    public static float field6572;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
    public static final void method2726(int arg0, int arg1) {
        field6565++;
        if (arg1 == -1 || !class401.field5640[arg1]) {
            return;
        }
        class218.field3157.method442(arg1, (byte) 93);
        if (arg0 != 5) {
            field6566 = null;
        }
        class494.field6988[arg1] = null;
        class88.field1105[arg1] = null;
        class401.field5640[arg1] = false;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I")
    public static final int method2727(int arg0, int arg1) {
        return class261.field3858 == null ? 0 : class261.field3858[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
    public static void method2728(boolean arg0) {
        field6573 = null;
        field6571 = null;
        if (arg0) {
            method2728(true);
        }
        field6566 = null;
        field6568 = null;
    }
}
