import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EPLYBIIS")
public class class17 {

    @OriginalMember(owner = "EPLYBIIS", name = "b", descriptor = "Z")
    private static boolean field747 = true;

    @OriginalMember(owner = "EPLYBIIS", name = "a", descriptor = "Z")
    private static boolean field746;

    @OriginalMember(owner = "EPLYBIIS", name = "a", descriptor = "(IIBI)I")
    public static int method203(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -57) {
            return 1;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "EPLYBIIS", name = "a", descriptor = "(IIZI)I")
    public static int method204(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (!arg2) {
            return 4;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "EPLYBIIS", name = "a", descriptor = "(IIIIIII)I")
    public static int method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            field746 = !field746;
        }
        if ((arg3 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg2;
            arg2 = var7;
        }
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg6;
        } else {
            return 7 + 1 - arg4 - arg2;
        }
    }

    @OriginalMember(owner = "EPLYBIIS", name = "b", descriptor = "(IIIIIII)I")
    public static int method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 0) {
            field747 = !field747;
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg0;
            arg0 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg1 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg0;
        } else {
            return arg1;
        }
    }
}
