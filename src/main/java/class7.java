import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class7 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
    public static int[] field74 = new int[5];

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Ljf;")
    private static class229 field73 = class212.method1457((byte) 101, "Ok");

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Ljf;")
    public static class229 field75 = field73;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)I", line = 8)
    public static final int method41(int arg0, byte arg1) {
        int var2 = -118 / ((17 - arg1) / 62);
        field72++;
        return arg0 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lj;", line = 27)
    public static final class287 method42(Throwable arg0, String arg1) {
        field76++;
        class287 var2;
        if ((arg0 instanceof class287)) {
            var2 = (class287) arg0;
            var2.field4910 = var2.field4910 + ' ' + arg1;
        } else {
            var2 = new class287(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 44)
    public static void method43(byte arg0) {
        field73 = null;
        field74 = null;
        field75 = null;
        if (arg0 != -107) {
            field75 = (class229) null;
        }
    }
}
