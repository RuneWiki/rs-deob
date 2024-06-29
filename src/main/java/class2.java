import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Z")
    public static boolean field15 = false;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field11 = -1;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lfk;")
    public static class23 field12;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lij;")
    public static class316 field14;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 6)
    public static void method3(boolean arg0) {
        field12 = null;
        if (!arg0) {
            field14 = null;
        }
        field14 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lij;ILij;Lij;Lij;)V", line = 20)
    public static final void method4(class316 arg0, int arg1, class316 arg2, class316 arg3, class316 arg4) {
        class152.field2190 = arg4;
        field16++;
        class302.field4120 = arg3;
        class344.field4655 = arg0;
        class304.field4146 = arg2;
        if (arg1 < 107) {
            method3(true);
        }
        class103.field1425 = new class108[class152.field2190.method1933(0)][];
        class435.field6147 = new boolean[class152.field2190.method1933(0)];
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIZ)Lf;", line = 38)
    public static final class57 method5(boolean arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field11 = 81;
        }
        field13++;
        long var3 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class57) class30.field419.method837((byte) -72, var3);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIBIIZ)V", line = 62)
    public static final void method6(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        field17++;
        if (arg3 <= 1) {
            return;
        }
        class336.field4545 = arg5;
        class155.field2213 = arg1;
        class447.field6263 = arg0;
        class419.field5801 = arg2;
        class41.field536 = arg4;
        if (arg6 && class336.field4545 >= 100) {
            class63.field874 = class41.field536 * 128 + 64;
            class375.field5213 = class447.field6263 * 128 + 64;
            class104.field1433 = class50.method408(class343.field4623, class63.field874, class375.field5213, 16) - class419.field5801;
        }
        class26.field337 = 2;
    }
}
