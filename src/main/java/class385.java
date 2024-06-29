import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class385 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[B")
    public static byte[] field5693 = new byte[520];

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[I")
    public static int[] field5694 = new int[13];

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "[I")
    public static int[] field5696 = new int[50];

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lrr;", line = 18)
    public static final class283 method2337(int arg0, int arg1) {
        field5697++;
        class283 var2 = (class283) class31.field409.method2393(-125, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field868.method2691(arg1, 0, 0);
        class283 var4 = new class283();
        if (var3 != null) {
            var4.method1814(false, new class446(var3));
        }
        var4.method1818(126);
        int var5 = 42 % ((arg0 - 43) / 42);
        class31.field409.method2395(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 44)
    public static void method2338(int arg0) {
        field5694 = null;
        field5696 = null;
        field5693 = null;
        if (arg0 >= -33) {
            method2338(-4);
        }
    }
}
