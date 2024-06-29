import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class481 extends class601 {

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "[I")
    public static int[] field7066 = new int[5];

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field7067 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[S")
    public static short[] field7062 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Lqg;")
    public static class398 field7061 = new class398();

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "F")
    public static float field7063;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lii;")
    public class481 field7065;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Lii;")
    public class481 field7068;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 4)
    public static void method2921(int arg0) {
        if (arg0 != 19) {
            method2921(33);
        }
        field7062 = null;
        field7061 = null;
        field7067 = null;
        field7066 = null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V", line = 23)
    public final void method2922(boolean arg0) {
        field7064++;
        if (this.field7065 == null) {
            return;
        }
        this.field7065.field7068 = this.field7068;
        this.field7068.field7065 = this.field7065;
        if (arg0) {
            field7062 = null;
        }
        this.field7065 = null;
        this.field7068 = null;
    }
}
