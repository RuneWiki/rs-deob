import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class585 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field8596 = 0;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lkda;")
    public static class328 field8595;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/Object;Z)[B", line = 9)
    public static final byte[] method3481(int arg0, Object arg1, boolean arg2) {
        field8594++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class631.method3677(3453, var3) : var3;
        } else if (arg1 instanceof class291) {
            class291 var4 = (class291) arg1;
            return var4.method1792(87);
        } else if (arg0 == 0) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 44)
    public static void method3482(byte arg0) {
        if (arg0 >= -77) {
            field8595 = null;
        }
        field8595 = null;
    }
}
