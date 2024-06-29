import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class143 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field2185 = 7759444;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lok;")
    private static class41 field2186 = class137.method956(" ", 45);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lok;")
    public static class41 field2187 = field2186;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I", line = 27)
    public static final int method993(int arg0, int arg1) {
        int var2 = -114 / ((3 - arg0) / 56);
        field2184++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)Z", line = 75)
    public static final boolean method994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 124)
    public static void method995(int arg0) {
        if (arg0 != 18595) {
            field2186 = (class41) null;
        }
        field2187 = null;
        field2186 = null;
    }
}
