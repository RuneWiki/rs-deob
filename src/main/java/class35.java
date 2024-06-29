import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MWBCSNDC")
public class class35 {

    @OriginalMember(owner = "client!MWBCSNDC", name = "a", descriptor = "I")
    private static int field1068 = 1;

    @OriginalMember(owner = "client!MWBCSNDC", name = "a", descriptor = "(IIII)I")
    public static int method344(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!MWBCSNDC", name = "b", descriptor = "(IIII)I")
    public static int method345(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (field1068 != arg3) {
            return 1;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!MWBCSNDC", name = "a", descriptor = "(IIZIIII)I")
    public static int method346(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        if (!arg2) {
            return 2;
        } else if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return 7 + 1 - arg0 - arg4;
        }
    }

    @OriginalMember(owner = "client!MWBCSNDC", name = "a", descriptor = "(IIBIIII)I")
    public static int method347(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == 8) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if ((arg4 & 0x1) == 1) {
            int var9 = arg0;
            arg0 = arg6;
            arg6 = var9;
        }
        int var10 = arg3 & 0x3;
        if (var10 == 0) {
            return arg5;
        } else if (var10 == 1) {
            return 7 + 1 - arg1 - arg0;
        } else if (var10 == 2) {
            return 7 + 1 - arg5 - arg6;
        } else {
            return arg1;
        }
    }
}
