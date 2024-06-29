import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FPWTEYKY")
public class class16 {

    @OriginalMember(owner = "client!FPWTEYKY", name = "c", descriptor = "B")
    private static byte field725 = 15;

    @OriginalMember(owner = "client!FPWTEYKY", name = "d", descriptor = "I")
    private static int field726 = -224;

    @OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "I")
    private static int field723;

    @OriginalMember(owner = "client!FPWTEYKY", name = "b", descriptor = "Z")
    private static boolean field724;

    @OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "(IBII)I")
    public static int method259(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 9) {
            boolean var4 = false;
        }
        int var5 = arg2 & 0x3;
        if (var5 == 0) {
            return arg0;
        } else if (var5 == 1) {
            return arg3;
        } else if (var5 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "(IIII)I")
    public static int method260(int arg0, int arg1, int arg2, int arg3) {
        while (arg1 >= 0) {
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "(IIIIIZI)I")
    public static int method261(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        int var8 = arg1 & 0x3;
        if (arg5) {
            field726 = 467;
        }
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg2;
        } else {
            return 7 + 1 - arg4 - arg6;
        }
    }

    @OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "(IIIIBII)I")
    public static int method262(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (field725 != arg4) {
            field723 = 123;
        }
        if ((arg3 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg5;
            arg5 = var7;
        }
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg5;
        } else {
            return arg0;
        }
    }
}
