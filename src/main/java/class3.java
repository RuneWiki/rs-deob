import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    public static int[] field27 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 6)
    public static final void method14(int arg0, int arg1) {
        field25++;
        class40 var2 = class162.method872(arg0, (byte) 92, 3);
        if (arg1 == 30787) {
            var2.method193(-85);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 29)
    public static void method15(boolean arg0) {
        field27 = null;
        if (!arg0) {
            field27 = null;
        }
    }
}
