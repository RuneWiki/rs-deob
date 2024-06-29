import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class310 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "[Lmr;")
    public static class154[] field4388 = new class154[0];

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Ltca;")
    public static class184 field4390 = new class184(16);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static void method1999(byte arg0) {
        field4388 = null;
        field4390 = null;
        if (arg0 != -122) {
            field4388 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ldt;I)Ljava/lang/String;")
    public static final String method2000(class254 arg0, int arg1) {
        field4389++;
        return arg1 == 2510 ? class34.method196(0, arg0, 32767) : null;
    }
}
