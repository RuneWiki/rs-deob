import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("a")
public class class1 {

    @OriginalMember(owner = "a", name = "a", descriptor = "Z")
    private static boolean field1;

    @OriginalMember(owner = "a", name = "a", descriptor = "(IIII)I")
    public static int method1(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
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

    @OriginalMember(owner = "a", name = "b", descriptor = "(IIII)I")
    public static int method2(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field1 = !field1;
        }
        int var4 = arg3 & 0x3;
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

    @OriginalMember(owner = "a", name = "a", descriptor = "(ZIIIII)I")
    public static int method3(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 & 0x3;
        if (arg0) {
            field1 = !field1;
        }
        if (var6 == 0) {
            return arg1;
        } else if (var6 == 1) {
            return arg4;
        } else if (var6 == 2) {
            return 7 + 1 - arg1 - arg3;
        } else {
            return 7 + 1 - arg4 - arg5;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(IIIIII)I")
    public static int method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = arg4 & 0x3;
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 7 + 1 - arg5 - arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg3 - arg2;
        } else {
            return arg5;
        }
    }
}
