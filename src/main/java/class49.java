import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class49 {

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "Lqe;")
    public static class465 field700 = new class465(6, -2);

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Lqaa;")
    public static class27 field703 = new class27(9, 6);

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)V")
    public static final void method436(byte arg0, int arg1) {
        class510 var2 = class496.field7066;
        synchronized (class496.field7066) {
            class496.field7066.method3049(arg1, (byte) 126);
        }
        if (arg0 != 48) {
            method437((byte) 12);
        }
        field701++;
        class510 var3 = class313.field4417;
        synchronized (class313.field4417) {
            class313.field4417.method3049(arg1, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
    public static void method437(byte arg0) {
        field700 = null;
        field703 = null;
        if (arg0 < 108) {
            field704 = -113;
        }
    }
}
