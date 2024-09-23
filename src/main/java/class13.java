import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FCKTYQCQ")
public class class13 {

    @OriginalMember(owner = "FCKTYQCQ", name = "b", descriptor = "Z")
    private static boolean field641 = true;

    @OriginalMember(owner = "FCKTYQCQ", name = "c", descriptor = "B")
    private static byte field642 = -48;

    @OriginalMember(owner = "FCKTYQCQ", name = "a", descriptor = "I")
    private static int field640;

    @OriginalMember(owner = "FCKTYQCQ", name = "a", descriptor = "(IBII)I")
    public static int method201(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (field642 != arg1) {
            return 2;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "FCKTYQCQ", name = "a", descriptor = "(IIBI)I")
    public static int method202(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 != 88) {
            field640 = 107;
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "FCKTYQCQ", name = "a", descriptor = "(IIBIII)I")
    public static int method203(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3 & 0x3;
        if (arg2 != 0) {
            return 3;
        } else if (var6 == 0) {
            return arg4;
        } else if (var6 == 1) {
            return arg5;
        } else if (var6 == 2) {
            return 7 + 1 - arg4 - arg0;
        } else {
            return 7 + 1 - arg5 - arg1;
        }
    }

    @OriginalMember(owner = "FCKTYQCQ", name = "a", descriptor = "(IIIIII)I")
    public static int method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 3) {
            field641 = !field641;
        }
        int var6 = arg2 & 0x3;
        if (var6 == 0) {
            return arg0;
        } else if (var6 == 1) {
            return 7 + 1 - arg3 - arg4;
        } else if (var6 == 2) {
            return 7 + 1 - arg0 - arg5;
        } else {
            return arg3;
        }
    }
}
