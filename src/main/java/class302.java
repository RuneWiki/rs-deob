import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class302 {

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Lmn;")
    public static class247 field4139 = new class247(16);

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Ldi;")
    public static class83 field4140 = new class83(15, 3);

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field4143 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Lah;")
    public static class261 field4142;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ldr;ZI)I")
    public static final int method1762(class504 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -30;
        } else {
            field4138++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        field4139 = null;
        field4140 = null;
        field4142 = null;
        if (arg0 != 83) {
            method1762(null, false, 76);
        }
    }
}
