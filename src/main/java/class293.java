import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class293 {

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public static int field3662 = 0;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lsq;")
    public static class485 field3663 = new class485(3);

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "[Leq;")
    public static class670[] field3664 = new class670[8];

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V", line = 16)
    public static void method1722(byte arg0) {
        field3664 = null;
        field3663 = null;
        if (arg0 != 27) {
            method1723(-25, -36, -128);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)V", line = 29)
    public static final void method1723(int arg0, int arg1, int arg2) {
        class499 var3 = class487.field7044[arg0][arg1][arg2];
        if (var3 != null) {
            class220.method1274(var3.field7230);
            if (var3.field7230 != null) {
                var3.field7230 = null;
            }
        }
    }
}
