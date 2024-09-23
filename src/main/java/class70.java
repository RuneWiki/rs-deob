import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YYAQTPDX")
public class class70 {

    @OriginalMember(owner = "YYAQTPDX", name = "a", descriptor = "I")
    private static int field1701 = 38245;

    @OriginalMember(owner = "YYAQTPDX", name = "b", descriptor = "I")
    private static int field1702 = -875;

    @OriginalMember(owner = "YYAQTPDX", name = "a", descriptor = "(BIII)I")
    public static int method586(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 98) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg2 & 0x3;
        if (var5 == 0) {
            return arg3;
        } else if (var5 == 1) {
            return arg1;
        } else if (var5 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "YYAQTPDX", name = "a", descriptor = "(IIII)I")
    public static int method587(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            return field1702;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "YYAQTPDX", name = "a", descriptor = "(IIIIII)I")
    public static int method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 & 0x3;
        while (arg5 >= 0) {
            field1701 = 164;
        }
        if (var6 == 0) {
            return arg2;
        } else if (var6 == 1) {
            return arg0;
        } else if (var6 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return 7 + 1 - arg0 - arg1;
        }
    }

    @OriginalMember(owner = "YYAQTPDX", name = "b", descriptor = "(IIIIII)I")
    public static int method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 0) {
            return field1702;
        }
        int var6 = arg3 & 0x3;
        if (var6 == 0) {
            return arg1;
        } else if (var6 == 1) {
            return 7 + 1 - arg0 - arg4;
        } else if (var6 == 2) {
            return 7 + 1 - arg1 - arg5;
        } else {
            return arg0;
        }
    }
}
