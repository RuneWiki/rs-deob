import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OWCLRNAL")
public class class46 {

    @OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "I")
    private static int field1343 = 731;

    @OriginalMember(owner = "client!OWCLRNAL", name = "b", descriptor = "I")
    private static int field1344 = -276;

    @OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "(BIII)I")
    public static int method459(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -55) {
            return field1344;
        }
        int var4 = arg1 & 0x3;
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

    @OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "(IZII)I")
    public static int method460(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field1344 = 392;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "(IIIIIIZ)I")
    public static int method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        int var8 = arg4 & 0x3;
        if (arg6) {
            return field1344;
        } else if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg5 - arg3;
        } else {
            return 7 + 1 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "(IIIIIII)I")
    public static int method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg0;
            arg0 = var7;
        }
        int var8 = arg3 & 0x3;
        int var9 = 44 / arg2;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg1;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg0;
        } else {
            return arg4;
        }
    }
}
