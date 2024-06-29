import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class410 implements class707 {

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Lwia;")
    private class791 field5567;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "Ljava/lang/String;")
    private String field5565;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "Lfba;")
    public static class27 field5564 = new class27(69, -1);

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Lbu;")
    public static class21 field5571 = new class21(29, 6);

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)Llj;")
    public final class633 method2067(int arg0) {
        field5568++;
        if (arg0 != -5905) {
            this.method2067(74);
        }
        return class633.field8888;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)I")
    public final int method2065(int arg0) {
        field5566++;
        return this.field5567.method4337(arg0 ^ arg0, this.field5565) ? 100 : this.field5567.method4334((byte) 113, this.field5565);
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
    public static void method2494(int arg0) {
        if (arg0 <= -9) {
            field5571 = null;
            field5564 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lwia;Ljava/lang/String;)V")
    public class410(class791 arg0, String arg1) {
        this.field5567 = arg0;
        this.field5565 = arg1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
    public static final void method2495(int arg0, int arg1) {
        field5570++;
        class252.field3716 = arg1;
        class652 var2 = class640.field8972;
        synchronized (class640.field8972) {
            class640.field8972.method3735(2);
        }
        class652 var3 = class670.field9316;
        synchronized (class670.field9316) {
            if (arg0 < 71) {
                method2495(27, -18);
            }
            class670.field9316.method3735(2);
        }
    }
}
