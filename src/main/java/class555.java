import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class555 {

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "Lqc;")
    public static class743 field7829 = new class743();

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field7831 = -1;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method3148(boolean arg0, int arg1) {
        field7830++;
        if (arg0) {
            return true;
        } else {
            return arg1 == 1 || arg1 == 3 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V", line = 16)
    public static void method3149(int arg0) {
        if (arg0 != -6569) {
            field7829 = null;
        }
        field7829 = null;
    }
}
