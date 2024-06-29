import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class183 {

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field3374 = 3353893;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Lbg;")
    public static class19 field3375 = new class19();

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field3377 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field3356;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field3361;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Lkd;")
    public static class112 field3376;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method1172(byte arg0) {
        int var1 = -13 % ((-arg0 - 42) / 54);
        field3375 = null;
        field3376 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIIII)V")
    public static final void method1173(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3 - arg0;
        if (arg1 > -30) {
            return;
        }
        int var7 = arg2 - arg5;
        field3370++;
        if (var6 == 0) {
            if (var7 != 0) {
                class40.method282(arg4, arg2, 123, arg0, arg5);
            }
        } else if (var7 == 0) {
            class37.method262(arg0, -15001, arg3, arg4, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class135.field2542) {
                var10 = (class135.field2542 * var8 >> 12) + var9;
                var11 = class135.field2542;
            } else if (class168.field3083 < arg0) {
                var10 = var9 + (class168.field3083 * var8 >> 12);
                var11 = class168.field3083;
            } else {
                var10 = arg5;
                var11 = arg0;
            }
            if (class169.field3161 > var10) {
                var11 = (class169.field3161 - var9 << 12) / var8;
                var10 = class169.field3161;
            } else if (class17.field254 < var10) {
                var10 = class17.field254;
                var11 = (class17.field254 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (arg3 < class135.field2542) {
                var13 = (class135.field2542 * var8 >> 12) + var9;
                var12 = class135.field2542;
            } else if (arg3 <= class168.field3083) {
                var12 = arg3;
                var13 = arg2;
            } else {
                var13 = (class168.field3083 * var8 >> 12) + var9;
                var12 = class168.field3083;
            }
            if (var13 < class169.field3161) {
                var12 = (class169.field3161 - var9 << 12) / var8;
                var13 = class169.field3161;
            } else if (var13 > class17.field254) {
                var13 = class17.field254;
                var12 = (class17.field254 - var9 << 12) / var8;
            }
            class218.method1364(arg4, (byte) -109, var13, var10, var12, var11);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lii;I)V")
    public static final void method1174(class96 arg0, int arg1) {
        field3360++;
        if (arg1 != 16235) {
            method1172((byte) -25);
        }
        if (class55.field942 == arg0.field1815) {
            class196.field3636[arg0.field1810] = true;
        }
    }
}
