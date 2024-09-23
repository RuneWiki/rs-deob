import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DDJBHEGS")
public class class10 {

    @OriginalMember(owner = "DDJBHEGS", name = "b", descriptor = "I")
    private static int field635 = -563;

    @OriginalMember(owner = "DDJBHEGS", name = "c", descriptor = "Z")
    private static boolean field636 = true;

    @OriginalMember(owner = "DDJBHEGS", name = "d", descriptor = "I")
    private static int field637 = 760;

    @OriginalMember(owner = "DDJBHEGS", name = "a", descriptor = "Z")
    private static boolean field634;

    @OriginalMember(owner = "DDJBHEGS", name = "a", descriptor = "(IIII)I")
    public static int method179(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            field634 = !field634;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "DDJBHEGS", name = "b", descriptor = "(IIII)I")
    public static int method180(int arg0, int arg1, int arg2, int arg3) {
        while (arg2 >= 0) {
            field637 = -224;
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

    @OriginalMember(owner = "DDJBHEGS", name = "a", descriptor = "(IIIBII)I")
    public static int method181(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var6 = arg0 & 0x3;
        if (arg3 != 6) {
            return field637;
        }
        boolean var7 = false;
        if (var6 == 0) {
            return arg4;
        } else if (var6 == 1) {
            return arg2;
        } else if (var6 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return 7 + 1 - arg2 - arg5;
        }
    }

    @OriginalMember(owner = "DDJBHEGS", name = "a", descriptor = "(IIIZII)I")
    public static int method182(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = arg5 & 0x3;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 + 1 - arg1 - arg4;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg0;
        } else {
            return arg1;
        }
    }
}
