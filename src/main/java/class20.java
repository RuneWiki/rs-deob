import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GSBGVYYO")
public class class20 {

    @OriginalMember(owner = "client!GSBGVYYO", name = "a", descriptor = "I")
    private static int field777 = 2;

    @OriginalMember(owner = "client!GSBGVYYO", name = "a", descriptor = "(IIII)I")
    public static int method224(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 3 || arg2 > 3) {
            field777 = 360;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!GSBGVYYO", name = "a", descriptor = "(IIZI)I")
    public static int method225(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg2) {
            return 4;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!GSBGVYYO", name = "a", descriptor = "(IIIIIII)I")
    public static int method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= 0) {
            field777 = 152;
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg6;
            arg6 = var7;
        }
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg3;
        } else {
            return 7 + 1 - arg0 - arg6;
        }
    }

    @OriginalMember(owner = "client!GSBGVYYO", name = "b", descriptor = "(IIIIIII)I")
    public static int method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg1;
            arg1 = var7;
        }
        int var8 = arg4 & 0x3;
        if (arg5 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg3 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg1;
        } else {
            return arg3;
        }
    }
}
