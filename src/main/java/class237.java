import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class237 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Lp;")
    public static class280 field4116 = class18.method140((byte) -122, "Hidden)2");

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field4118 = 1;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[I")
    public static int[] field4115 = new int[50];

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Lp;")
    public static class280 field4117 = class18.method140((byte) -123, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Lsb;")
    public static class221 field4119 = new class221(64);

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[Z")
    public static boolean[] field4121 = new boolean[5];

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lp;")
    public static class280 field4122 = class18.method140((byte) -118, "Untersuchen");

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method1589(int arg0) {
        field4115 = null;
        field4117 = null;
        field4121 = null;
        field4116 = null;
        field4119 = null;
        if (arg0 != 64) {
            method1588(-75, 28, 85, -99, 42, 77, -76, -30);
        }
        field4122 = null;
    }
}
