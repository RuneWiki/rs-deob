import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class264 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Ls;")
    public static class261 field4573 = new class261(100);

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lmh;")
    public static class128 field4577 = class22.method156(122, "www");

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lmh;")
    private static class128 field4580 = class22.method156(122, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lmh;")
    public static class128 field4578 = field4580;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lmh;")
    private static class128 field4583 = class22.method156(124, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Lmh;")
    public static class128 field4582 = class22.method156(124, "Loaded world list data");

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field4581 = -1;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lmh;")
    public static class128 field4584 = field4583;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Lmh;")
    public static class128 field4586 = class22.method156(125, "p12_full");

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field4572;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field4575;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field4576;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Ldj;")
    public static class314 field4569;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lfj;", line = 16)
    public static final class229 method1849(int arg0) {
        if (arg0 >= -125) {
            return (class229) null;
        }
        field4570++;
        class229 var1 = (class229) class6.field117.method1053((byte) -88);
        if (var1 != null) {
            var1.method1978((byte) -107);
            var1.method1521(-3810);
            return var1;
        }
        class229 var2;
        do {
            var2 = (class229) class308.field5235.method1053((byte) -124);
            if (var2 == null) {
                return null;
            }
            if (var2.method1575(127) > class71.method470(true)) {
                return null;
            }
            var2.method1978((byte) 29);
            var2.method1521(-3810);
        } while ((var2.field3876 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 72)
    public static void method1850(int arg0) {
        field4583 = null;
        field4586 = null;
        field4569 = null;
        field4582 = null;
        field4578 = null;
        field4580 = null;
        int var1 = -126 / ((24 - arg0) / 48);
        field4577 = null;
        field4573 = null;
        field4584 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lem;IIBIIII)V", line = 90)
    public static final void method1851(class10 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4574++;
        if (class45.field900) {
            class212.field3758 = 32;
        } else {
            class212.field3758 = 0;
        }
        class45.field900 = false;
        if (class239.field4081 != 0) {
            if (arg4 <= arg7 && (arg4 + 16) > arg7 && arg1 <= arg6 && arg6 < arg1 + 16) {
                arg0.field241 -= 4;
                class7.method48(arg0, 0);
            } else if (arg4 <= arg7 && arg7 < arg4 + 16 && arg1 + arg2 - 16 <= arg6 && arg6 < (arg1 + arg2)) {
                arg0.field241 += 4;
                class7.method48(arg0, 0);
            } else if (arg4 - class212.field3758 <= arg7 && arg7 < (arg4 + class212.field3758 + 16) && arg6 >= arg1 + 16 && (arg1 + arg2 - 16) > arg6) {
                int var8 = (arg2 - 32) * arg2 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - (var8 / 2) - arg1 - 16;
                int var10 = arg2 - var8 - 32;
                arg0.field241 = (arg5 - arg2) * var9 / var10;
                class7.method48(arg0, 0);
                class45.field900 = true;
            }
        }
        if (class235.field4041 != 0) {
            int var11 = arg0.field260;
            if (arg4 - var11 <= arg7 && arg1 <= arg6 && arg4 + 16 > arg7 && arg6 <= arg1 + arg2) {
                arg0.field241 += class235.field4041 * 45;
                class7.method48(arg0, 0);
            }
        }
        if (arg3 > -53) {
            field4578 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZIZIIII)V", line = 157)
    public static final void method1852(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class162.field2770 = arg1;
        class157.field2693 = arg4;
        field4571++;
        if (!arg0) {
            return;
        }
        class129.field2260 = arg5;
        class276.field4781 = arg6;
        class228.field3972 = arg3;
        if (arg2 && class157.field2693 >= 100) {
            class143.field2445 = class276.field4781 * 128 + 64;
            class142.field2436 = class162.field2770 * 128 + 64;
            class187.field3249 = class64.method427(class142.field2436, class143.field2445, class133.field2315, (byte) 106) - class228.field3972;
        }
        class1.field21 = 2;
    }
}
