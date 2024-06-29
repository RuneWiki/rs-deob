import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class288 {

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "Lfp;")
    public static class323 field4076;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field4075;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 3)
    public static final void method1883(int arg0, String arg1, int arg2) {
        field4074++;
        class592 var3 = class682.method3825(-652872096, arg2, arg0);
        var3.method3351(0);
        var3.field8340 = arg1;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)Lmk;", line = 14)
    public static final class54 method1884(int arg0, int arg1) {
        if (arg0 != -30727) {
            method1885(23);
        }
        field4071++;
        return new class54(arg1, false);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 31)
    public static void method1885(int arg0) {
        field4076 = null;
        field4075 = null;
        if (arg0 != 2) {
            field4075 = null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V", line = 43)
    public static final void method1886(int arg0) {
        if (arg0 <= 70) {
            return;
        }
        field4072++;
        if (class346.field4874 == null) {
            return;
        }
        if (class346.field4874.field3310 == 1) {
            class346.field4874 = null;
            return;
        }
        if (class346.field4874.field3310 == 2) {
            class49.method311(class1.field8, class54.field625, 2, true);
            class346.field4874 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BII)Z", line = 72)
    public static final boolean method1887(byte arg0, int arg1, int arg2) {
        if (arg0 <= 48) {
            field4076 = null;
        }
        field4073++;
        return (arg2 & 0x70000) != 0 | class446.method2674(33, arg1, arg2) || class661.method3623((byte) 99, arg1, arg2);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIZ)V", line = 87)
    public static final void method1888(int arg0, int arg1, boolean arg2) {
        field4070++;
        class144 var3 = class703.field9787[arg0][arg1];
        if (var3 != null) {
            class741.field10293 = var3.field2065;
            class243.field3246 = var3.field2057;
            class589.field8303 = var3.field2060;
        }
        if (!arg2) {
            class461.method2737(-5100);
        }
    }
}
