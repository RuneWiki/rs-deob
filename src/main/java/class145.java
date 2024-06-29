import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class145 {

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[Lvq;")
    public static class489[] field2070 = new class489[14];

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
    public static int[] field2069;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        field2069 = null;
        field2070 = null;
        int var1 = -97 % ((-arg0 - 55) / 52);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLwc;)V")
    public static final void method1093(boolean arg0, class73 arg1) {
        field2067++;
        if (!arg0) {
            return;
        }
        class39 var2 = (class39) class680.field9518.method3953((long) arg1.field1812, 14);
        if (var2 == null) {
            class647.method3618(arg1.field1890[0], arg1.field1884[0], null, null, arg1, 0, -119, arg1.field2250);
        } else {
            var2.method274((byte) 31);
        }
    }
}
