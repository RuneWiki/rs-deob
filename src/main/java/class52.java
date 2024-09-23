import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UHMILBUY")
public class class52 {

    @OriginalMember(owner = "UHMILBUY", name = "a", descriptor = "Z")
    private static boolean field1309;

    @OriginalMember(owner = "UHMILBUY", name = "b", descriptor = "Z")
    private static boolean field1310;

    @OriginalMember(owner = "UHMILBUY", name = "a", descriptor = "(IIII)I")
    public static int method426(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 != -29921) {
            field1310 = !field1310;
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "UHMILBUY", name = "b", descriptor = "(IIII)I")
    public static int method427(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        int var5 = 61 / arg2;
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

    @OriginalMember(owner = "UHMILBUY", name = "a", descriptor = "(IZIIII)I")
    public static int method428(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 & 0x3;
        if (arg1) {
            field1309 = !field1309;
        }
        if (var6 == 0) {
            return arg2;
        } else if (var6 == 1) {
            return arg5;
        } else if (var6 == 2) {
            return 7 + 1 - arg2 - arg0;
        } else {
            return 7 + 1 - arg5 - arg3;
        }
    }

    @OriginalMember(owner = "UHMILBUY", name = "a", descriptor = "(IIIBII)I")
    public static int method429(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var6 = arg0 & 0x3;
        if (arg3 != -71) {
            return 3;
        } else if (var6 == 0) {
            return arg1;
        } else if (var6 == 1) {
            return 7 + 1 - arg4 - arg5;
        } else if (var6 == 2) {
            return 7 + 1 - arg1 - arg2;
        } else {
            return arg4;
        }
    }
}
