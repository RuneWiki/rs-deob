import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TECGIKEQ")
public class class51 {

    @OriginalMember(owner = "TECGIKEQ", name = "c", descriptor = "Z")
    private static boolean field1429 = true;

    @OriginalMember(owner = "TECGIKEQ", name = "d", descriptor = "B")
    private static byte field1430 = 6;

    @OriginalMember(owner = "TECGIKEQ", name = "a", descriptor = "I")
    private static int field1427;

    @OriginalMember(owner = "TECGIKEQ", name = "b", descriptor = "Z")
    private static boolean field1428;

    @OriginalMember(owner = "TECGIKEQ", name = "a", descriptor = "(IIII)I")
    public static int method502(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg0 >= 0) {
            field1427 = 201;
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "TECGIKEQ", name = "a", descriptor = "(IIBI)I")
    public static int method503(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 77) {
            field1428 = !field1428;
        }
        int var4 = arg3 & 0x3;
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

    @OriginalMember(owner = "TECGIKEQ", name = "a", descriptor = "(IBIIIII)I")
    public static int method504(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        int var8 = arg6 & 0x3;
        if (field1430 != arg1) {
            field1429 = !field1429;
        }
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg5;
        } else {
            return 7 + 1 - arg4 - arg3;
        }
    }

    @OriginalMember(owner = "TECGIKEQ", name = "a", descriptor = "(IIIIIII)I")
    public static int method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg5;
            arg5 = var7;
        }
        int var8 = arg4 & 0x3;
        if (arg1 != 0) {
            return 4;
        } else if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg5;
        } else {
            return arg0;
        }
    }
}
