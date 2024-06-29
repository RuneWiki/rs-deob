import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class291 {

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Lne;")
    public static class118 field4122 = new class118(16);

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Z")
    public static boolean field4125 = false;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "Lia;")
    public static class19 field4124;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lnl;")
    public static class435 field4126;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method1908(byte arg0, int arg1) {
        field4121++;
        class334 var2 = class352.method2172(arg1, 9, 16711935);
        if (arg0 <= 87) {
            field4123 = -121;
        }
        var2.method2099(true);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 27)
    public static void method1909(int arg0) {
        field4126 = null;
        field4122 = null;
        if (arg0 >= -127) {
            method1909(-41);
        }
        field4124 = null;
    }
}
