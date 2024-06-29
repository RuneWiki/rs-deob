import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class238 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Llc;")
    public static class143 field4310 = class66.method374("Fertigkeit: ", -1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static final void method1597(boolean arg0) {
        class79.field1429 = new class191();
        field4311++;
        if (arg0) {
            method1598(126);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1598(int arg0) {
        field4310 = null;
        if (arg0 != -1) {
            field4309 = -88;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1599(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4307++;
        int var5 = -87 / ((-arg2 - 57) / 63);
        if (class47.method289((byte) 118, arg0)) {
            class209.method1455(true, arg1, arg4, -1, arg3, class223.field4045[arg0]);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lki;")
    public static final class140 method1600(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        return var3 == null || var3.field2129 == null ? null : var3.field2129;
    }
}
