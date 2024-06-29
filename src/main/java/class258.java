import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class258 extends class130 {

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Ldf;")
    public class155 field4459;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Z")
    public static boolean field4461 = false;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lcd;")
    private static class64 field4458 = class44.method335((byte) 71, "Opened title screen");

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lcd;")
    public static class64 field4455 = field4458;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Lig;")
    public static class168 field4460 = new class168(4);

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Ldd;")
    public static class238 field4463;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lil;")
    public static class53 field4457;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V", line = 35)
    public static void method1831(int arg0) {
        field4463 = null;
        field4460 = null;
        field4458 = null;
        if (arg0 != -5889) {
            method1832(-34, -72, 13, -40);
        }
        field4457 = null;
        field4455 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIII)V", line = 50)
    public static final void method1832(int arg0, int arg1, int arg2, int arg3) {
        field4462++;
        class299 var4 = class158.method1135(arg0, arg1 ^ 0x71, arg1);
        var4.method2091(arg1 ^ 0x73);
        var4.field5153 = arg3;
        var4.field5152 = arg2;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ldf;)V", line = 60)
    public class258(class155 arg0) {
        this.field4459 = arg0;
    }
}
