import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WXMXSJQQ")
public class class66 {

    @OriginalMember(owner = "WXMXSJQQ", name = "b", descriptor = "I")
    private static int field1626 = 564;

    @OriginalMember(owner = "WXMXSJQQ", name = "a", descriptor = "Z")
    private static boolean field1625;

    @OriginalMember(owner = "WXMXSJQQ", name = "a", descriptor = "(IIIB)I")
    public static int method588(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 7) {
            field1626 = -97;
        }
        int var4 = arg0 & 0x3;
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

    @OriginalMember(owner = "WXMXSJQQ", name = "a", descriptor = "(IIII)I")
    public static int method589(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        int var5 = 38 / arg2;
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

    @OriginalMember(owner = "WXMXSJQQ", name = "a", descriptor = "(BIIIII)I")
    public static int method590(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -85) {
            field1625 = !field1625;
        }
        int var6 = arg3 & 0x3;
        if (var6 == 0) {
            return arg4;
        } else if (var6 == 1) {
            return arg5;
        } else if (var6 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return 7 + 1 - arg5 - arg2;
        }
    }

    @OriginalMember(owner = "WXMXSJQQ", name = "a", descriptor = "(IIIIII)I")
    public static int method591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 80 / arg0;
        int var7 = arg5 & 0x3;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 7 + 1 - arg2 - arg1;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg3;
        } else {
            return arg2;
        }
    }
}
