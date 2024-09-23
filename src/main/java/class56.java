import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RGOEUNSS")
public class class56 {

    @OriginalMember(owner = "RGOEUNSS", name = "b", descriptor = "B")
    private static byte field1414 = 71;

    @OriginalMember(owner = "RGOEUNSS", name = "a", descriptor = "Z")
    private static boolean field1413;

    @OriginalMember(owner = "RGOEUNSS", name = "a", descriptor = "(IBII)I")
    public static int method491(int arg0, byte arg1, int arg2, int arg3) {
        if (field1414 != arg1) {
            return 0;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "RGOEUNSS", name = "a", descriptor = "(IIII)I")
    public static int method492(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 27 / arg3;
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

    @OriginalMember(owner = "RGOEUNSS", name = "a", descriptor = "(IIIIIII)I")
    public static int method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg5 & 0x3;
        if (arg6 != 0) {
            field1413 = !field1413;
        }
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg1;
        } else {
            return 7 + 1 - arg3 - arg4;
        }
    }

    @OriginalMember(owner = "RGOEUNSS", name = "a", descriptor = "(ZIIIIII)I")
    public static int method494(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg1;
            arg1 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg0) {
            return 3;
        } else if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return arg4;
        }
    }
}
