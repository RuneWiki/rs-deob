import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class601 extends class425 {

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field8615 = 0;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
    public static int[] field8608 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Laj;")
    public static class287 field8616 = new class287(4);

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field8611;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field8614;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method3431(int arg0) {
        field8608 = null;
        if (arg0 == 7836) {
            field8616 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
    public static final int method3432(int arg0, int arg1, int arg2) {
        field8613++;
        int var3 = class321.method2061(arg2 + 91923, 4, -1, arg0 + 45365) + (class321.method2061(arg2 + 37821, 2, -1, arg0 + 10294) - 128 >> 1) + (class321.method2061(arg2, 1, -1, arg0) + -128 >> 2) - 128;
        if (arg1 > -21) {
            field8615 = 6;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
    public static final void method3433(int arg0) {
        class604.field8753.method1222((byte) -113);
        field8617++;
        class42.field1083 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)I")
    public static final int method3434(boolean arg0) {
        field8609++;
        if (class413.field5977 != null) {
            return 3;
        } else if (arg0) {
            return class203.field3129 ? 2 : 1;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBII)Z")
    public static final boolean method3435(int arg0, byte arg1, int arg2, int arg3) {
        field8610++;
        if (arg1 != 76) {
            return false;
        }
        class576.field8372.method906(arg2, arg0, arg3, class296.field4440);
        int var4 = class296.field4440[2];
        if (var4 < 50) {
            return false;
        } else {
            class296.field4440[0] = class35.field1028 + (class296.field4440[0] * class216.field3286 / var4);
            class296.field4440[2] = var4;
            class296.field4440[1] = class296.field4440[1] * class639.field9202 / var4 + class559.field7905;
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBLlk;)V")
    public static final void method3436(int arg0, int arg1, byte arg2, class545 arg3) {
        if (arg2 > -71) {
            return;
        }
        field8612++;
        if (arg3.field7725 == 0) {
            arg3.field7751 = arg3.field7708;
        } else if (arg3.field7725 == 1) {
            arg3.field7751 = (arg0 - arg3.field7718) / 2 + arg3.field7708;
        } else if (arg3.field7725 == 2) {
            arg3.field7751 = arg0 - arg3.field7718 - arg3.field7708;
        } else if (arg3.field7725 == 3) {
            arg3.field7751 = arg3.field7708 * arg0 >> 14;
        } else if (arg3.field7725 == 4) {
            arg3.field7751 = (arg3.field7708 * arg0 >> 14) + (arg0 - arg3.field7718) / 2;
        } else {
            arg3.field7751 = arg0 - (arg3.field7718 + (arg3.field7708 * arg0 >> 14));
        }
        if (arg3.field7634 == 0) {
            arg3.field7592 = arg3.field7731;
        } else if (arg3.field7634 == 1) {
            arg3.field7592 = (arg1 - arg3.field7652) / 2 + arg3.field7731;
        } else if (arg3.field7634 == 2) {
            arg3.field7592 = arg1 - arg3.field7652 - arg3.field7731;
        } else if (arg3.field7634 == 3) {
            arg3.field7592 = arg3.field7731 * arg1 >> 14;
        } else if (arg3.field7634 == 4) {
            arg3.field7592 = (arg1 - arg3.field7652) / 2 + (arg3.field7731 * arg1 >> 14);
        } else {
            arg3.field7592 = arg1 - arg3.field7652 - (arg3.field7731 * arg1 >> 14);
        }
        if (!class609.field8870 || client.method1825(arg3).field8941 == 0 && arg3.field7649 != 0) {
            return;
        }
        if (arg3.field7592 < 0) {
            arg3.field7592 = 0;
        } else if (arg3.field7652 + arg3.field7592 > arg1) {
            arg3.field7592 = arg1 - arg3.field7652;
        }
        if (arg3.field7751 < 0) {
            arg3.field7751 = 0;
        } else if (arg0 < (arg3.field7751 + arg3.field7718)) {
            arg3.field7751 = arg0 - arg3.field7718;
            return;
        }
    }
}
