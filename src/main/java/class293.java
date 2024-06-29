import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class293 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "[I")
    public static int[] field4203 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Ld;")
    public static class152 field4204;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V", line = 3)
    public static void method1815(byte arg0) {
        field4204 = null;
        if (arg0 == -50) {
            field4203 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BJ)V", line = 14)
    public static final void method1816(byte arg0, long arg1) {
        field4202++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 < 52) {
            field4203 = null;
        }
    }
}
