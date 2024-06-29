import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class520 {

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field7451 = -1;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "Z")
    public static boolean field7453 = false;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Ljo;")
    public static class336 field7449;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 3)
    public static void method3067(byte arg0) {
        field7449 = null;
        int var1 = 93 % ((arg0 - 47) / 40);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIII)I", line = 16)
    public static final int method3068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 31659) {
            return -87;
        }
        field7452++;
        if (class582.field8287 == null) {
            return 0;
        }
        if (arg2 < 3) {
            int var6 = arg3 >> 9;
            int var7 = arg4 >> 9;
            if (arg0 < 0 || arg5 < 0 || class194.field2946 - 1 < arg0 || class255.field3656 - 1 < arg5) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class194.field2946 - 1 || (class255.field3656 - 1) < var7) {
                return 0;
            }
            boolean var8 = (class60.field847[1][arg3 >> 9][arg4 >> 9] & 0x2) != 0;
            if ((arg3 & 0x1FF) == 0) {
                boolean var9 = (class60.field847[1][var6 - 1][arg4 >> 9] & 0x2) != 0;
                boolean var10 = (class60.field847[1][var6][arg4 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class60.field847[1][arg0][arg5] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x1FF) == 0) {
                boolean var11 = (class60.field847[1][arg3 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class60.field847[1][arg3 >> 9][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class60.field847[1][arg0][arg5] & 0x2) != 0;
                }
            }
            if (var8) {
                arg2++;
            }
        }
        return class582.field8287[arg2].method1786(arg4, (byte) 113, arg3);
    }
}
