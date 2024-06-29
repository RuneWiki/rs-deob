import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class598 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lqe;")
    public static class465 field8715 = new class465(43, 0);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[[Lgs;")
    public static class43[][] field8718;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZII)Lvr;", line = 9)
    public static final class135 method3491(int arg0, boolean arg1, int arg2, int arg3) {
        field8717++;
        class135 var4 = null;
        if (arg0 == 0) {
            var4 = class273.method1801(class459.field6629, class722.field10089, 2);
            class131.field1960++;
        }
        if (arg0 == 1) {
            var4 = class273.method1801(class459.field6629, class301.field4231, 2);
            class178.field2568++;
        }
        var4.field2109.method223(1493807496, class115.field1845 + arg2);
        var4.field2109.method266(class167.field2461.method1540(126, 82) ? 1 : 0, 255);
        var4.field2109.method223(1493807496, arg3 + class64.field1160);
        class726.field10161 = arg1;
        class334.field4722 = arg3;
        class318.field4513 = arg2;
        class257.method1745(23836);
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 41)
    public static void method3492(int arg0) {
        int var1 = 52 % ((54 - arg0) / 51);
        field8718 = null;
        field8715 = null;
    }
}
