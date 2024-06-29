import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class61 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lwu;")
    public static class557 field828;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V", line = 9)
    public static void method394(boolean arg0) {
        field828 = null;
        if (arg0) {
            method395(9, -86, false, 96);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)Lwu;", line = 22)
    public static final class557 method395(int arg0, int arg1, boolean arg2, int arg3) {
        field827++;
        class244 var4 = null;
        if (class324.field4170 != null) {
            var4 = new class244(arg0, class324.field4170, class652.field9218[arg0], 1000000);
        }
        class753.field10469[arg0] = class433.field5948.method2722((byte) 9, arg0, var4, class189.field2754);
        class753.field10469[arg0].method2272(108);
        if (arg3 != 1000000) {
            field829 = 61;
        }
        return new class557(class753.field10469[arg0], arg2, arg1);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lwn;I)I", line = 43)
    public static final int method396(class583 arg0, int arg1) {
        field826++;
        int var2 = arg0.method3467(97, 2);
        if (arg1 != -29124) {
            method394(true);
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method3467(-123, 5);
        } else if (var2 == 2) {
            var3 = arg0.method3467(arg1 + 29127, 8);
        } else {
            var3 = arg0.method3467(arg1 + 29218, 11);
        }
        return var3;
    }
}
