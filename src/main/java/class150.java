import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class150 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Z")
    public static boolean field2166 = false;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2167 = "scroll:";

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2168 = -1;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lja;")
    public static class60 field2165;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)Lgf;")
    public static final class126 method909(boolean arg0, int arg1) {
        field2169++;
        class126 var2 = (class126) class96.field1519.method122((long) arg1, (byte) 84);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field438.method1973(1, 5, arg1);
        class126 var4 = new class126();
        if (var3 != null) {
            var4.method797(-1, new class248(var3));
        }
        class96.field1519.method119((long) arg1, var4, 0);
        return arg0 ? var4 : null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method910(int arg0) {
        field2165 = null;
        field2167 = null;
        if (arg0 < 33) {
            method909(true, 3);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method911(byte arg0) {
        field2163++;
        class253.field3850.method1775(27147);
        class235.field3546.method1775(27147);
        class50.field792.method1775(27147);
        class62.field980.method1775(27147);
        if (arg0 >= -100) {
            field2165 = null;
        }
    }
}
