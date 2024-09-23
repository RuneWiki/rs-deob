import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TFOQVWKW")
public class class59 {

    @OriginalMember(owner = "TFOQVWKW", name = "a", descriptor = "I")
    private static int field1489 = 1;

    @OriginalMember(owner = "TFOQVWKW", name = "a", descriptor = "(IIII)I")
    public static int method461(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg0 >= 0) {
            field1489 = -214;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "TFOQVWKW", name = "a", descriptor = "(IIZI)I")
    public static int method462(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg1 & 0x3;
        if (var5 == 0) {
            return arg3;
        } else if (var5 == 1) {
            return 7 - arg0;
        } else if (var5 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "TFOQVWKW", name = "a", descriptor = "(IIIIII)I")
    public static int method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 & 0x3;
        if (arg0 < 3 || arg0 > 3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == 0) {
            return arg3;
        } else if (var6 == 1) {
            return arg4;
        } else if (var6 == 2) {
            return 7 + 1 - arg3 - arg5;
        } else {
            return 7 + 1 - arg4 - arg1;
        }
    }

    @OriginalMember(owner = "TFOQVWKW", name = "a", descriptor = "(IIIIBI)I")
    public static int method464(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = arg1 & 0x3;
        if (arg4 != -7) {
            field1489 = -330;
        }
        if (var6 == 0) {
            return arg0;
        } else if (var6 == 1) {
            return 7 + 1 - arg5 - arg3;
        } else if (var6 == 2) {
            return 7 + 1 - arg0 - arg2;
        } else {
            return arg5;
        }
    }
}
