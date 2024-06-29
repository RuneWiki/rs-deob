import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class577 {

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "Lkm;")
    public static class299 field8332 = new class299();

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "[I")
    public static int[] field8333;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)V", line = 12)
    public static void method3351(boolean arg0) {
        if (!arg0) {
            method3352(-115, 104);
        }
        field8332 = null;
        field8333 = null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V", line = 23)
    public static final void method3352(int arg0, int arg1) {
        int var2 = 14 / ((-arg1 - 9) / 33);
        if (class568.field8160 == 0) {
            class224.field3145.method2498(arg0, 128);
        } else {
            class332.field4779 = arg0;
        }
        field8334++;
    }
}
