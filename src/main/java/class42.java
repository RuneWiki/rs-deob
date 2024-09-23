import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ROUYYYUE")
public class class42 {

    @OriginalMember(owner = "ROUYYYUE", name = "a", descriptor = "I")
    private static int field1306 = 830;

    @OriginalMember(owner = "ROUYYYUE", name = "b", descriptor = "Z")
    private static boolean field1307 = true;

    @OriginalMember(owner = "ROUYYYUE", name = "a", descriptor = "(IIII)I")
    public static int method384(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 >= 0) {
            field1307 = !field1307;
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

    @OriginalMember(owner = "ROUYYYUE", name = "a", descriptor = "(IIIZ)I")
    public static int method385(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return 1;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "ROUYYYUE", name = "a", descriptor = "(ZIIIII)I")
    public static int method386(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            field1307 = !field1307;
        }
        int var6 = arg4 & 0x3;
        if (var6 == 0) {
            return arg2;
        } else if (var6 == 1) {
            return arg3;
        } else if (var6 == 2) {
            return 7 + 1 - arg2 - arg5;
        } else {
            return 7 + 1 - arg3 - arg1;
        }
    }

    @OriginalMember(owner = "ROUYYYUE", name = "a", descriptor = "(IIIIII)I")
    public static int method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 & 0x3;
        if (arg5 != 0) {
            field1306 = -423;
        }
        if (var6 == 0) {
            return arg1;
        } else if (var6 == 1) {
            return 7 + 1 - arg3 - arg0;
        } else if (var6 == 2) {
            return 7 + 1 - arg1 - arg2;
        } else {
            return arg3;
        }
    }
}
