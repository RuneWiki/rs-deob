import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class138 extends class85 {

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "[Z")
    public static boolean[] field2117 = new boolean[100];

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2116 = "red:";

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lhc;")
    public static class235 field2118;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "[I")
    public static int[] field2114;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method934(int arg0) {
        field2118 = null;
        if (arg0 != 1) {
            field2118 = null;
        }
        field2114 = null;
        field2117 = null;
        field2116 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Li;")
    public static final class57 method935(byte arg0, int arg1) {
        class57 var2 = (class57) class113.field1847.method1887(0, (long) arg1);
        field2115++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class228.field3641.method1590(arg1, (byte) -25, 33);
        class57 var4 = new class57();
        if (var3 != null) {
            var4.method439(new class88(var3), arg1, 500);
        }
        class113.field1847.method1886(-77, (long) arg1, var4);
        int var5 = 111 % ((arg0 + 49) / 35);
        return var4;
    }
}
