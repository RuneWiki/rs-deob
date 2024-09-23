import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KZRWVGKU")
public class class29 {

    @OriginalMember(owner = "KZRWVGKU", name = "a", descriptor = "I")
    private static int field953 = -107;

    @OriginalMember(owner = "KZRWVGKU", name = "b", descriptor = "Z")
    private static boolean field954 = true;

    @OriginalMember(owner = "KZRWVGKU", name = "c", descriptor = "I")
    private static int field955 = 44965;

    @OriginalMember(owner = "KZRWVGKU", name = "a", descriptor = "(IIII)I")
    public static int method304(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        while (arg2 >= 0) {
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "KZRWVGKU", name = "b", descriptor = "(IIII)I")
    public static int method305(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg3 <= 0) {
            field955 = -186;
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "KZRWVGKU", name = "a", descriptor = "(IIIIIII)I")
    public static int method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        int var8 = arg6 & 0x3;
        if (arg1 >= 0) {
            field953 = 459;
        }
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg5;
        } else {
            return 7 + 1 - arg0 - arg3;
        }
    }

    @OriginalMember(owner = "KZRWVGKU", name = "b", descriptor = "(IIIIIII)I")
    public static int method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 8 || arg0 > 8) {
            field953 = 402;
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg1;
            arg1 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg6 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg1;
        } else {
            return arg6;
        }
    }
}
