import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EWLSABLL")
public class class11 {

    @OriginalMember(owner = "client!EWLSABLL", name = "a", descriptor = "I")
    private static int field612 = -25061;

    @OriginalMember(owner = "client!EWLSABLL", name = "b", descriptor = "Z")
    private static boolean field613;

    @OriginalMember(owner = "client!EWLSABLL", name = "a", descriptor = "(IIII)I")
    public static int method194(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        int var5 = 66 / arg1;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!EWLSABLL", name = "a", descriptor = "(IIZI)I")
    public static int method195(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!EWLSABLL", name = "a", descriptor = "(IIIIIII)I")
    public static int method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg0;
            arg0 = var7;
        }
        int var8 = arg5 & 0x3;
        if (arg6 != -40762) {
            field612 = -243;
        }
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg2;
        } else {
            return 7 + 1 - arg4 - arg0;
        }
    }

    @OriginalMember(owner = "client!EWLSABLL", name = "b", descriptor = "(IIIIIII)I")
    public static int method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            field613 = !field613;
        }
        if ((arg0 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg1;
            arg1 = var7;
        }
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg1;
        } else {
            return arg2;
        }
    }
}
