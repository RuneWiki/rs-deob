import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XGXKDVNG")
public class class69 {

    @OriginalMember(owner = "client!XGXKDVNG", name = "a", descriptor = "I")
    private static int field1681 = -13325;

    @OriginalMember(owner = "client!XGXKDVNG", name = "b", descriptor = "Z")
    private static boolean field1682 = true;

    @OriginalMember(owner = "client!XGXKDVNG", name = "a", descriptor = "(IIII)I")
    public static int method586(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field1682 = !field1682;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!XGXKDVNG", name = "b", descriptor = "(IIII)I")
    public static int method587(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 7 || arg1 > 7) {
            field1681 = -48;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!XGXKDVNG", name = "a", descriptor = "(IIIIIII)I")
    public static int method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 44 / arg3;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg5;
            arg5 = var8;
        }
        int var9 = arg2 & 0x3;
        if (var9 == 0) {
            return arg4;
        } else if (var9 == 1) {
            return arg1;
        } else if (var9 == 2) {
            return 7 + 1 - arg4 - arg0;
        } else {
            return 7 + 1 - arg1 - arg5;
        }
    }

    @OriginalMember(owner = "client!XGXKDVNG", name = "a", descriptor = "(IIIIIZI)I")
    public static int method589(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            field1681 = 53;
        }
        if ((arg2 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg4;
        } else {
            return arg0;
        }
    }
}
