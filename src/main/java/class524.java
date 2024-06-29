import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class524 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lof;")
    public static class328 field7739 = new class328(5);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
    public static int[] field7741 = new int[25];

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method3128(byte arg0) {
        if (arg0 == 35) {
            field7740++;
            class501.field7514 = 0;
            class392.field5958.method2120((byte) 27);
            class409.field6204 = false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method3129(boolean arg0) {
        if (!arg0) {
            field7739 = null;
            field7741 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(CI)Z")
    public static final boolean method3130(char arg0, int arg1) {
        if (arg1 == 7434) {
            field7742++;
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }
}
