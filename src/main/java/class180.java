import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class180 {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2747++;
        if (class427.field5862 == 1) {
            class548.field7313[class115.field1974 / 100].method2637(class613.field8106 - 8, class170.field2631 - 8);
        }
        if (class427.field5862 == 2) {
            class548.field7313[class115.field1974 / 100 + 4].method2637(class613.field8106 - 8, class170.field2631 + -8);
        }
        if (!arg4) {
            class450.method2558(26592);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public static final void method1203(byte arg0) {
        field2746++;
        if (class2.field11 != null) {
            class2.field11.method1439(2);
        }
        while (true) {
            try {
                class696.field9776.join();
                break;
            } catch (InterruptedException var2) {
            }
        }
        int var1 = -15 / ((11 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lst;III)V")
    public static final void method1204(class403 arg0, int arg1, int arg2, int arg3) {
        field2748++;
        int[] var4 = new int[4];
        if (arg2 < -55) {
            class83.method684(var4, 0, var4.length, arg3);
            class633.method3495(arg0, arg1, -1, var4);
        }
    }
}
