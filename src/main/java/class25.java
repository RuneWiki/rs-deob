import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class25 extends class54 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIZI)I", line = 6)
    public static final int method238(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var7 = arg2 & 0x3;
        field392++;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 7 + 1 - arg1 - arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg4;
        } else {
            if (!arg5) {
                field393 = 77;
            }
            return arg6;
        }
    }
}
