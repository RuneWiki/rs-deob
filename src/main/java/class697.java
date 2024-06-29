import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class697 extends class531 {

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lrga;")
    public static class280 field9864 = new class280(1, -1);

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field9866 = -1;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V", line = 3)
    public static final void method3922(int arg0, int arg1) {
        field9863++;
        class436.field5443 = 0;
        class119.field1527 = -1;
        class608.field8547 = arg1;
        class149.field1920 = -1;
        class531.field7173 = false;
        class235.field2946 = 1;
        int var2 = -106 % ((-arg0 - 26) / 54);
        class316.field4061 = null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)Z", line = 33)
    public static final boolean method3923(int arg0, int arg1) {
        field9865++;
        if (arg0 == -1) {
            return arg1 == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 48)
    public static void method3924(boolean arg0) {
        if (!arg0) {
            method3923(80, 61);
        }
        field9864 = null;
    }
}
