import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UBZWFZFP")
public class class50 {

    @OriginalMember(owner = "UBZWFZFP", name = "a", descriptor = "I")
    private static int field1453 = -4;

    @OriginalMember(owner = "UBZWFZFP", name = "a", descriptor = "(IIBI)I")
    public static int method500(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg2 != -27) {
            field1453 = -232;
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "UBZWFZFP", name = "a", descriptor = "(IIII)I")
    public static int method501(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg0 & 0x3;
        if (var5 == 0) {
            return arg1;
        } else if (var5 == 1) {
            return 7 - arg2;
        } else if (var5 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "UBZWFZFP", name = "a", descriptor = "(IIIIIII)I")
    public static int method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg5 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return 7 + 1 - arg3 - arg4;
        }
    }

    @OriginalMember(owner = "UBZWFZFP", name = "b", descriptor = "(IIIIIII)I")
    public static int method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg5;
            arg5 = var7;
        }
        int var8 = arg0 & 0x3;
        while (arg3 >= 0) {
            field1453 = -414;
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg5;
        } else {
            return arg2;
        }
    }
}
