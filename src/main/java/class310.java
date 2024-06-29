import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class310 extends class333 {

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lgk;")
    public class616 field3833 = new class616();

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "Lad;")
    public static class19 field3831 = new class19(4);

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "[I")
    public static int[] field3834 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "Lcq;")
    public static class110 field3835 = new class110(40, 3);

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "[I")
    public static int[] field3836 = new int[14];

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "I")
    public static int field3837 = -1;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
    public static void method1781(byte arg0) {
        field3834 = null;
        field3836 = null;
        field3835 = null;
        field3831 = null;
        if (arg0 != -103) {
            field3837 = -74;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IB)I")
    public static final int method1782(int arg0, byte arg1) {
        field3832++;
        if (arg1 != -119) {
            field3834 = null;
        }
        return arg0 & 0x3FF;
    }
}
