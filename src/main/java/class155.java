import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class155 {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
    public static int[] field2887 = new int[32768];

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lhh;")
    private static class163 field2886 = class137.method1065("Started 3d library", 17);

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lhh;")
    public static class163 field2890 = class137.method1065("(U(Y", 17);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lhh;")
    public static class163 field2885 = field2886;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([[IB)V")
    public static final void method1151(int[][] arg0, byte arg1) {
        if (arg1 != -107) {
            field2890 = null;
        }
        class85.field1605 = arg0;
        field2888++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method1152(byte arg0) {
        field2887 = null;
        field2886 = null;
        int var1 = 4 / ((arg0 - 36) / 59);
        field2885 = null;
        field2890 = null;
    }
}
