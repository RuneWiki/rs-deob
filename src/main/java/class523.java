import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class523 {

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "Lbu;")
    public static class21 field7390 = new class21(50, -2);

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "Lsaa;")
    public static class345 field7392 = new class345(5, 1);

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "Lpt;")
    public static class555 field7393;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method3149(int arg0, int arg1, int arg2) {
        field7388++;
        class282 var3 = class277.field4038.method3919(true, arg2);
        if (arg0 != 8) {
            method3149(31, 110, 103);
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method1832(-1, arg1);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)V", line = 38)
    public static void method3150(boolean arg0) {
        field7393 = null;
        if (!arg0) {
            field7392 = null;
            field7390 = null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IB)V", line = 50)
    public static final void method3151(int arg0, byte arg1) {
        class104.field1206 = 2;
        field7391++;
        class55.field709 = arg0;
        if (arg1 == 63) {
            class642.method3660(arg1 + 11021, class459.field6419.equals(""), true, "", class459.field6419);
        }
    }
}
