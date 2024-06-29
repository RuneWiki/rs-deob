import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class144 {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[Ldj;")
    public static class200[] field2262 = new class200[14];

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2266 = 0;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Z")
    public static boolean field2261 = true;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
    public static int[] field2263;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Z")
    public static final boolean method969(int arg0, int arg1) {
        field2265++;
        if (arg1 < ~arg0) {
            return false;
        }
        int var2 = class70.field1016[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1011;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lfa;Lfa;I)V")
    public static final void method970(class273 arg0, class273 arg1, int arg2) {
        class96.field1420 = arg0;
        if (arg2 == -27977) {
            field2267++;
            class247.field3937 = arg1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method971(byte arg0) {
        field2263 = null;
        if (arg0 != -90) {
            field2263 = null;
        }
        field2262 = null;
    }
}
