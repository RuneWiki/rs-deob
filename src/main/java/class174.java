import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class174 {

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Lfc;")
    private class343 field2563;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "[Lqg;")
    public static class372[] field2562 = new class372[14];

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Lcp;")
    public static class421 field2564 = class84.method583(1536);

    @OriginalMember(owner = "client!so", name = "g", descriptor = "[I")
    public static int[] field2567 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method1158(int arg0) {
        field2567 = null;
        field2562 = null;
        field2564 = null;
        if (arg0 >= 0) {
            field2566 = 25;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ldk;ILfc;)V")
    public class174(class328 arg0, int arg1, class343 arg2) {
        new class104(64);
        this.field2563 = arg2;
        this.field2561 = this.field2563.method2054(0, 15);
    }
}
