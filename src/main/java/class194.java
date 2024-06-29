import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class194 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ljd;")
    private static class86 field3463 = class122.method868("Nov", true);

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Ljd;")
    private static class86 field3470 = class122.method868("May", true);

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Ljd;")
    public static class86 field3464 = class122.method868("::clientjs5drop", true);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Ljd;")
    private static class86 field3468 = class122.method868("Aug", true);

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Ljd;")
    private static class86 field3472 = class122.method868("Mar", true);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Ljd;")
    private static class86 field3469 = class122.method868("Apr", true);

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Ljd;")
    public static class86 field3466 = class122.method868("null", true);

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field3474 = 0;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Ljd;")
    private static class86 field3467 = class122.method868("Sep", true);

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Ljd;")
    public static class86 field3471 = class122.method868("um", true);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Ljd;")
    private static class86 field3461 = class122.method868("Jun", true);

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Ljd;")
    private static class86 field3476 = class122.method868("Jul", true);

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field3481 = 0;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Ljd;")
    private static class86 field3478 = class122.method868("Oct", true);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Ljd;")
    private static class86 field3473 = class122.method868("Jan", true);

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Ljd;")
    private static class86 field3480 = class122.method868("Feb", true);

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Ljd;")
    private static class86 field3479 = class122.method868("Dec", true);

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[Ljd;")
    public static class86[] field3475 = new class86[] { field3473, field3480, field3472, field3469, field3470, field3461, field3476, field3468, field3467, field3478, field3463, field3479 };

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[I")
    public static int[] field3483;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZIIII)I")
    public static final int method1350(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3465++;
        if ((arg6 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        if (arg2) {
            return 87;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 - (arg1 - 1) - arg5;
        } else {
            return -arg3 - (arg0 - 1 - 7);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method1351(byte arg0) {
        field3472 = null;
        field3470 = null;
        field3473 = null;
        field3463 = null;
        field3475 = null;
        field3483 = null;
        field3466 = null;
        field3467 = null;
        field3464 = null;
        field3469 = null;
        field3461 = null;
        field3479 = null;
        field3468 = null;
        field3478 = null;
        field3480 = null;
        field3476 = null;
        if (arg0 > -90) {
            field3478 = null;
        }
        field3471 = null;
    }
}
