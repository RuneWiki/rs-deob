import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TXHUSZZJ")
public class class57 {

    @OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "I")
    private static int field1536 = 850;

    @OriginalMember(owner = "client!TXHUSZZJ", name = "b", descriptor = "I")
    private static int field1537 = 1;

    @OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "(IIIZ)I")
    public static int method519(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0 & 0x3;
        if (arg3) {
            field1537 = -326;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "(IIII)I")
    public static int method520(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 7 || arg2 > 7) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg1 & 0x3;
        if (var5 == 0) {
            return arg0;
        } else if (var5 == 1) {
            return 7 - arg3;
        } else if (var5 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "(IIIIIII)I")
    public static int method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            return 0;
        }
        if ((arg0 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg3;
        } else {
            return 7 + 1 - arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "(IIZIIII)I")
    public static int method522(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            return field1536;
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg3;
        } else {
            return arg4;
        }
    }
}
