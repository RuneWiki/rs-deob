import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class270 extends class337 {

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field3560 = -1;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "Lcc;")
    public static class602 field3559 = class695.method3706(false);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public static void method1686(boolean arg0) {
        field3559 = null;
        if (!arg0) {
            field3559 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(II)V")
    public static final void method1687(int arg0, int arg1) {
        class536 var2 = class628.field7980;
        synchronized (class628.field7980) {
            class628.field7980.method2928(true, arg0);
            if (arg1 != 5) {
                field3560 = 28;
            }
        }
        field3561++;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ZI)V")
    public static final void method1688(boolean arg0, int arg1) {
        field3558++;
        class614 var2 = class497.method2759(5, 5977, (long) arg1);
        var2.method3279(false);
        if (!arg0) {
            field3560 = -38;
        }
    }
}
