import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class227 extends class197 {

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Ljd;")
    public static class85 field3942 = class221.method1499("<img=1>", (byte) -91);

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    public static int[] field3941 = new int[25];

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Ljd;")
    public static class85 field3944 = class221.method1499("Starte 3D)2Softwarebibliothek)3", (byte) -114);

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Llc;")
    public static class82 field3945;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static void method1527(int arg0) {
        field3944 = null;
        field3945 = null;
        if (arg0 != -1) {
            method1528(101, 5, (class185) null, -118, 27, -114);
        }
        field3942 = null;
        field3941 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILvc;III)V")
    public static final void method1528(int arg0, int arg1, class185 arg2, int arg3, int arg4, int arg5) {
        field3947++;
        if (arg2.field3186 == -1 && arg2.field3184 == null) {
            return;
        }
        int var6 = 0;
        if (arg2.field3164 < arg0) {
            var6 += arg0 - arg2.field3164;
        } else if (arg2.field3178 > arg0) {
            var6 += arg2.field3178 - arg0;
        }
        if (arg5 > arg2.field3173) {
            var6 += arg5 - arg2.field3173;
        } else if (arg2.field3188 > arg5) {
            var6 += arg2.field3188 - arg5;
        }
        if (arg3 <= 65) {
            field3941 = null;
        }
        if (arg2.field3168 == 0 || arg2.field3168 < (var6 - 64) || class182.field3109 == 0 || arg2.field3176 != arg4) {
            if (arg2.field3182 != null) {
                class247.field4249.method954(arg2.field3182);
                arg2.field3182 = null;
            }
            if (arg2.field3172 != null) {
                class247.field4249.method954(arg2.field3172);
                arg2.field3172 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg2.field3168 - var6) * class182.field3109 / arg2.field3168;
        if (arg2.field3182 != null) {
            arg2.field3182.method1595(var7);
        } else if (arg2.field3186 >= 0) {
            class89 var8 = class89.method660(class79.field1449, arg2.field3186, 0);
            if (var8 != null) {
                class126 var9 = var8.method657().method855(class221.field3882);
                class238 var10 = class238.method1598(var9, 100, var7);
                var10.method1602(-1);
                class247.field4249.method951(var10);
                arg2.field3182 = var10;
            }
        }
        if (arg2.field3172 != null) {
            arg2.field3172.method1595(var7);
            if (!arg2.field3172.method1749(4)) {
                arg2.field3172 = null;
            }
        } else if (arg2.field3184 != null && (arg2.field3175 -= arg1) <= 0) {
            int var11 = (int) ((double) arg2.field3184.length * Math.random());
            class89 var12 = class89.method660(class79.field1449, arg2.field3184[var11], 0);
            if (var12 != null) {
                class126 var13 = var12.method657().method855(class221.field3882);
                class238 var14 = class238.method1598(var13, 100, var7);
                var14.method1602(0);
                class247.field4249.method951(var14);
                arg2.field3175 = (int) (Math.random() * (double) (arg2.field3170 - arg2.field3171)) + arg2.field3171;
                arg2.field3172 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
    public static final void method1529(int arg0, boolean arg1) {
        class267.field4757.method1267(arg0, (byte) -66);
        field3943++;
        if (!arg1) {
            field3945 = null;
        }
    }
}
