import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class125 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
    public static int[] field2117 = new int[50];

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Llc;")
    public static class270 field2119;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public static final void method962(int arg0, int arg1, int arg2) {
        class208.field3074++;
        field2118++;
        class144.field2338.method683(true, 178);
        class144.field2338.method328(arg2, (byte) 100);
        class144.field2338.method341(52, arg0);
        if (arg1 >= -35) {
            field2117 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method963(int arg0) {
        field2119 = null;
        field2117 = null;
        if (arg0 < 52) {
            field2119 = null;
        }
    }
}
