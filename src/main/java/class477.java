import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class477 extends Exception {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lqp;")
    public static class586 field7263 = new class586(21, 8);

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Lqp;")
    public static class586 field7266 = new class586(8, 1);

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Lml;")
    public static class36 field7267;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I")
    public static final int method2897(byte arg0) {
        field7264++;
        int var1 = 64 % ((-arg0 - 4) / 34);
        return 42;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I")
    public static final int method2898(int arg0) {
        field7265++;
        class325 var1 = class161.field2155;
        synchronized (class161.field2155) {
            if (arg0 < 43) {
                method2899((byte) 69);
            }
            return class161.field2155.method2039(0);
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
    public static void method2899(byte arg0) {
        field7267 = null;
        field7266 = null;
        int var1 = -96 % ((-arg0 - 20) / 61);
        field7263 = null;
    }
}
