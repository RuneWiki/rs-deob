import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class249 extends class177 {

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "S")
    public static short field4247 = 256;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "Lbe;")
    public static class283 field4245 = class153.method941(126, "blaugr-Un:");

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "Lbe;")
    public static class283 field4248 = class153.method941(127, "::tele ");

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "Lbe;")
    public static class283 field4249 = class153.method941(18, "::noclip");

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V", line = 6)
    public static final void method1688(int arg0) {
        field4243++;
        class231.field3922.method1631(-27875);
        int var1 = 109 / ((-arg0 - 26) / 61);
    }

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "(I)V", line = 58)
    public static void method1689(int arg0) {
        field4249 = null;
        field4248 = null;
        if (arg0 != -16078) {
            field4247 = 77;
        }
        field4245 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lek;IIILek;)Lqc;", line = 77)
    public static final class4 method1690(class172 arg0, int arg1, int arg2, int arg3, class172 arg4) {
        field4246++;
        int var5 = -2 / ((arg1 + 38) / 34);
        return class26.method183(true, arg0, arg3, arg2) ? class49.method285(arg4.method1107(arg3, arg2, 125), (byte) 115) : null;
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)Z")
    public abstract boolean method59(int arg0);

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method60(int arg0);
}
