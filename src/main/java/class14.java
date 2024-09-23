import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GNGTCMOJ")
public class class14 {

    @OriginalMember(owner = "GNGTCMOJ", name = "a", descriptor = "I")
    private static int field712 = 8;

    @OriginalMember(owner = "GNGTCMOJ", name = "b", descriptor = "I")
    private static int field713 = 3;

    @OriginalMember(owner = "GNGTCMOJ", name = "a", descriptor = "(IIII)I")
    public static int method210(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg1 >= 0) {
            return 4;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "GNGTCMOJ", name = "b", descriptor = "(IIII)I")
    public static int method211(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg3 != 3) {
            field712 = 450;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "GNGTCMOJ", name = "a", descriptor = "(IIIIIII)I")
    public static int method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        int var8 = arg3 & 0x3;
        if (field713 != arg5) {
            return field713;
        } else if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg0;
        } else {
            return 7 + 1 - arg6 - arg2;
        }
    }

    @OriginalMember(owner = "GNGTCMOJ", name = "b", descriptor = "(IIIIIII)I")
    public static int method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg6 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 7 + 1 - arg3 - arg5;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return arg3;
        }
    }
}
