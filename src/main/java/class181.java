import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class181 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field3351 = -1;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lvd;")
    public static class222 field3360 = class212.method1357(")3runescape)3com)4l=", 10731);

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lvd;")
    private static class222 field3361 = class212.method1357("Unexpected server response)3", 10731);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lvd;")
    public static class222 field3352 = field3361;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lvd;")
    public static class222 field3365 = class212.method1357("Abbrechen", 10731);

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lvd;")
    public static class222 field3364 = class212.method1357("(U3", 10731);

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lvd;")
    private static class222 field3355 = class212.method1357("slide:", 10731);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lvd;")
    public static class222 field3353 = field3355;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Lvd;")
    public static class222 field3366 = field3355;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[Lbg;")
    public static class19[] field3363;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method1133(byte arg0) {
        if (arg0 <= -92) {
            field3354++;
            class121.field2281.method1072((byte) -19);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public static void method1134(byte arg0) {
        field3361 = null;
        field3355 = null;
        field3363 = null;
        field3360 = null;
        field3366 = null;
        field3364 = null;
        int var1 = -85 % ((-arg0 - 60) / 52);
        field3352 = null;
        field3353 = null;
        field3365 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Lih;")
    public static final class94 method1135(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2306;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
    public static final int method1136(int arg0, int arg1) {
        if (arg0 != 127) {
            field3366 = null;
        }
        field3356++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I")
    public static final int method1138(int arg0, int arg1) {
        if (arg1 != 11033) {
            field3364 = null;
        }
        field3358++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/Object;BLd;)V")
    public static final void method1139(Object arg0, byte arg1, class33 arg2) {
        field3367++;
        if (arg1 <= 55 || arg2.field717 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field717.peekEvent() != null; var3++) {
            class225.method1471(1L, -23364);
        }
        if (arg0 != null) {
            arg2.field717.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
