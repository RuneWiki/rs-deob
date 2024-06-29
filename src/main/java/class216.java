import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class216 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lfr;")
    public static class497 field3116 = new class497();

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[J")
    public static long[] field3117 = new long[100];

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lmv;IB)Lwt;")
    public static final class17 method1376(class522 arg0, int arg1, byte arg2) {
        field3118++;
        class17 var3;
        if (class320.field4935 == null) {
            var3 = new class17();
        } else {
            var3 = class320.field4935;
            class320.field4935 = class320.field4935.field281;
            class346.field5334--;
            var3.field281 = null;
        }
        var3.field279 = arg0;
        var3.field277 = arg1;
        return arg2 == 31 ? var3 : null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method1377(int arg0) {
        field3117 = null;
        field3116 = null;
        int var1 = -6 / ((-arg0 - 57) / 45);
    }
}
