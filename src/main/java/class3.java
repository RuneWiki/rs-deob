import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CEOKPAKZ")
public class class3 {

    @OriginalMember(owner = "CEOKPAKZ", name = "b", descriptor = "Z")
    private static boolean field38 = true;

    @OriginalMember(owner = "CEOKPAKZ", name = "a", descriptor = "I")
    private static int field37;

    @OriginalMember(owner = "CEOKPAKZ", name = "a", descriptor = "(IIIB)I")
    public static int method6(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        if (arg3 != 5) {
            field38 = !field38;
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "CEOKPAKZ", name = "a", descriptor = "(IIII)I")
    public static int method7(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg3 >= 0) {
            return field37;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "CEOKPAKZ", name = "a", descriptor = "(IIIIII)I")
    public static int method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3 & 0x3;
        if (arg4 >= 0) {
            field37 = 287;
        }
        if (var6 == 0) {
            return arg2;
        } else if (var6 == 1) {
            return arg5;
        } else if (var6 == 2) {
            return 7 + 1 - arg2 - arg0;
        } else {
            return 7 + 1 - arg5 - arg1;
        }
    }

    @OriginalMember(owner = "CEOKPAKZ", name = "a", descriptor = "(IIBIII)I")
    public static int method9(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 & 0x3;
        if (arg2 != 7) {
            field37 = -478;
        }
        if (var6 == 0) {
            return arg1;
        } else if (var6 == 1) {
            return 7 + 1 - arg5 - arg3;
        } else if (var6 == 2) {
            return 7 + 1 - arg1 - arg0;
        } else {
            return arg5;
        }
    }
}
