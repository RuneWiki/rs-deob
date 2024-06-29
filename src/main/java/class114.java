import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class114 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lpp;")
    public static class256 field1470 = new class256("", 16);

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Lhl;")
    public static class351 field1471;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient;")
    public static client field1473;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public static void method662(byte arg0) {
        field1470 = null;
        field1473 = null;
        field1471 = null;
        if (arg0 <= 12) {
            method662((byte) 94);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
    public static final void method663(int arg0, int arg1) {
        field1472++;
        class338 var2 = class380.method2294((byte) 123, arg1, arg0);
        var2.method2048(121);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLhr;IIILeq;I)V")
    public static final void method664(boolean arg0, class348 arg1, int arg2, int arg3, int arg4, class134 arg5, int arg6) {
        if (arg6 >= -11) {
            return;
        }
        field1474++;
        if (arg0) {
            class490.field7494.method1845((class223.field3156 - class490.field7494.method87()) / 2, (class207.field2874 - class490.field7494.method94()) / 2);
            class138.field1806.method1845((class223.field3156 - class138.field1806.method87()) / 2, 18);
        }
        arg1.method2107(class223.field3156 / 2, (class459.field6684 == class156.field1996 ? class305.field4442 : class324.field4735).method1220(2969, class81.field1122), class207.field2874 / 2 - 26, arg4, -14014, -1);
        int var7 = class207.field2874 / 2 - 18;
        arg5.method738(class223.field3156 / 2 - 152, var7, 304, 34, arg3, 0);
        arg5.method738(class223.field3156 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg5.method770(class223.field3156 / 2 - 150, var7 + 2, class64.field963 * 3, 30, arg2, 0);
        arg5.method770(class223.field3156 / 2 + class64.field963 * 3 - 150, var7 + 2, 300 - (class64.field963 * 3), 30, 0, 0);
        arg1.method2107(class223.field3156 / 2, class477.field6874, class207.field2874 / 2 + 4, arg4, -14014, -1);
    }
}
