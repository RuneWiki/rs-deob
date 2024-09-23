import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HSOVOELH")
public class class27 {

    @OriginalMember(owner = "HSOVOELH", name = "a", descriptor = "I")
    private static int field927 = 3461;

    @OriginalMember(owner = "HSOVOELH", name = "b", descriptor = "Z")
    private static boolean field928;

    @OriginalMember(owner = "HSOVOELH", name = "a", descriptor = "(IIIB)I")
    public static int method312(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 5) {
            field928 = !field928;
        }
        int var4 = arg1 & 0x3;
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

    @OriginalMember(owner = "HSOVOELH", name = "b", descriptor = "(IIIB)I")
    public static int method313(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 7) {
            boolean var4 = false;
        } else {
            field927 = -118;
        }
        int var5 = arg2 & 0x3;
        if (var5 == 0) {
            return arg0;
        } else if (var5 == 1) {
            return 7 - arg1;
        } else if (var5 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "HSOVOELH", name = "a", descriptor = "(IIIIII)I")
    public static int method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 & 0x3;
        if (arg5 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == 0) {
            return arg3;
        } else if (var6 == 1) {
            return arg4;
        } else if (var6 == 2) {
            return 7 + 1 - arg3 - arg1;
        } else {
            return 7 + 1 - arg4 - arg0;
        }
    }

    @OriginalMember(owner = "HSOVOELH", name = "b", descriptor = "(IIIIII)I")
    public static int method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg1 & 0x3;
        if (arg2 != -32309) {
            return 0;
        } else if (var6 == 0) {
            return arg0;
        } else if (var6 == 1) {
            return 7 + 1 - arg4 - arg3;
        } else if (var6 == 2) {
            return 7 + 1 - arg0 - arg5;
        } else {
            return arg4;
        }
    }
}
