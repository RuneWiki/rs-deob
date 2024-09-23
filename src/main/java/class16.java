import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EGPGCXBS")
public class class16 {

    @OriginalMember(owner = "EGPGCXBS", name = "a", descriptor = "I")
    private static int field650 = 5;

    @OriginalMember(owner = "EGPGCXBS", name = "b", descriptor = "I")
    private static int field651 = -470;

    @OriginalMember(owner = "EGPGCXBS", name = "c", descriptor = "I")
    private static int field652 = 5;

    @OriginalMember(owner = "EGPGCXBS", name = "a", descriptor = "(IBII)I")
    public static int method219(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg1 != 6) {
            return field651;
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

    @OriginalMember(owner = "EGPGCXBS", name = "a", descriptor = "(IIII)I")
    public static int method220(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg1 != 0) {
            return 1;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "EGPGCXBS", name = "a", descriptor = "(IIIIII)I")
    public static int method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field652 != arg2) {
            return field650;
        }
        int var6 = arg0 & 0x3;
        if (var6 == 0) {
            return arg3;
        } else if (var6 == 1) {
            return arg5;
        } else if (var6 == 2) {
            return 7 + 1 - arg3 - arg1;
        } else {
            return 7 + 1 - arg5 - arg4;
        }
    }

    @OriginalMember(owner = "EGPGCXBS", name = "a", descriptor = "(IIZIII)I")
    public static int method222(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = arg3 & 0x3;
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return 7 + 1 - arg1 - arg4;
        } else if (var7 == 2) {
            return 7 + 1 - arg5 - arg0;
        } else {
            return arg1;
        }
    }
}
