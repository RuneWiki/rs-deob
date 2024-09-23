import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GDGWLQOM")
public class class20 {

    @OriginalMember(owner = "GDGWLQOM", name = "a", descriptor = "I")
    private static int field867 = -223;

    @OriginalMember(owner = "GDGWLQOM", name = "b", descriptor = "Z")
    private static boolean field868 = true;

    @OriginalMember(owner = "GDGWLQOM", name = "c", descriptor = "Z")
    private static boolean field869 = true;

    @OriginalMember(owner = "GDGWLQOM", name = "a", descriptor = "(IIII)I")
    public static int method333(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 9 || arg1 > 9) {
            field868 = !field868;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "GDGWLQOM", name = "a", descriptor = "(IIIZ)I")
    public static int method334(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field869 = !field869;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "GDGWLQOM", name = "a", descriptor = "(IIIIII)I")
    public static int method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 & 0x3;
        if (arg2 >= 0) {
            return field867;
        } else if (var6 == 0) {
            return arg5;
        } else if (var6 == 1) {
            return arg3;
        } else if (var6 == 2) {
            return 7 + 1 - arg5 - arg0;
        } else {
            return 7 + 1 - arg3 - arg1;
        }
    }

    @OriginalMember(owner = "GDGWLQOM", name = "b", descriptor = "(IIIIII)I")
    public static int method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 90 / arg3;
        int var7 = arg1 & 0x3;
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return 7 + 1 - arg2 - arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg5 - arg4;
        } else {
            return arg2;
        }
    }
}
