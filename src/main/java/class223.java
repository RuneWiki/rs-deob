import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class223 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[I")
    public static int[] field3629 = new int[32];

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
    public static boolean field3630 = false;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lne;")
    public static class235 field3631 = new class235(64);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3628;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lji;", line = 9)
    public static final class106 method1540(Throwable arg0, String arg1) {
        field3635++;
        class106 var2;
        if (arg0 instanceof class106) {
            var2 = (class106) arg0;
            var2.field1505 = var2.field1505 + ' ' + arg1;
        } else {
            var2 = new class106(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 28)
    public static void method1541(int arg0) {
        field3628 = null;
        if (arg0 > -53) {
            field3628 = (String) null;
        }
        field3629 = null;
        field3631 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lbm;Lol;B)Laj;", line = 55)
    public static final class1 method1542(class137 arg0, class231 arg1, byte arg2) {
        long var3 = ((long) arg0.field2107 << 32) + ((long) arg0.field2099 << 56) + (long) ((arg0.field2088 + 1 << 16) - -arg0.field2095);
        field3632++;
        if (arg2 != -48) {
            return (class1) null;
        }
        class1 var5 = (class1) arg1.method1586(var3, -70);
        if (var5 == null) {
            var5 = new class1(arg0.field2088, (float) arg0.field2095, true, false, arg0.field2107);
            arg1.method1593(var3, var5, arg2 ^ 0xFFFF94B9);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I", line = 82)
    public static int method1543(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
