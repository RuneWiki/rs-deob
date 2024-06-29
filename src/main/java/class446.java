import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class446 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lke;")
    public static class622 field6333 = new class622(12, -1);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lqm;")
    public static class153 field6331;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 6)
    public static void method2682(byte arg0) {
        field6333 = null;
        if (arg0 != -18) {
            method2682((byte) -59);
        }
        field6331 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)I", line = 25)
    public static final int method2683(int arg0, int arg1, int arg2) {
        int var3 = -55 / ((11 - arg1) / 42);
        field6332++;
        return arg0 == 1 || arg0 == 3 ? class478.field6787[arg2 & 0x3] : class498.field7077[arg2 & 0x3];
    }
}
