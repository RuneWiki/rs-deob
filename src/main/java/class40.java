import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MGISFZUH")
public class class40 {

    @OriginalMember(owner = "MGISFZUH", name = "a", descriptor = "(IIII)I")
    public static int method364(int arg0, int arg1, int arg2, int arg3) {
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var4 = arg3 & 0x3;
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

    @OriginalMember(owner = "MGISFZUH", name = "a", descriptor = "(IBII)I")
    public static int method365(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg1 != -100) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
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

    @OriginalMember(owner = "MGISFZUH", name = "a", descriptor = "(IIIIIZ)I")
    public static int method366(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = arg3 & 0x3;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg1 - arg4;
        } else {
            return 7 + 1 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "MGISFZUH", name = "a", descriptor = "(IIBIII)I")
    public static int method367(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 9) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = arg3 & 0x3;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 7 + 1 - arg5 - arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return arg5;
        }
    }
}
