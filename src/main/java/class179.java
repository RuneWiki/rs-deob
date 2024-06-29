import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public abstract class class179 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3183 = -1;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lvf;")
    private static class265 field3190 = class87.method582(-46, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "J")
    public static long field3193 = 0L;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lvf;")
    public static class265 field3185 = class87.method582(-46, "(U0a )2 via: ");

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lvf;")
    public static class265 field3188 = field3190;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lvf;")
    public static class265 field3192 = class87.method582(-46, "<img=0>");

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[Loe;")
    public static class108[] field3182;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "[Lhg;")
    public static class146[] field3194;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V")
    public abstract void method173(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIILdk;Ldk;IIJ)V")
    public static final void method1164(int arg0, int arg1, int arg2, int arg3, class179 arg4, class179 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class144 var10 = new class144();
        var10.field2683 = arg8;
        var10.field2697 = arg1 * 128 + 64;
        var10.field2691 = arg2 * 128 + 64;
        var10.field2692 = arg3;
        var10.field2682 = arg4;
        var10.field2694 = arg5;
        var10.field2681 = arg6;
        var10.field2684 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class200.field3577[var11][arg1][arg2] == null) {
                class200.field3577[var11][arg1][arg2] = new class137(var11, arg1, arg2);
            }
        }
        class200.field3577[arg0][arg1][arg2].field2518 = var10;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()Z")
    public boolean method165() {
        field3189++;
        return false;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIIJILbe;)V")
    public abstract void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class255 arg10);

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "()I")
    public abstract int method141();

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1165(byte arg0) {
        field3185 = null;
        field3192 = null;
        field3182 = null;
        int var1 = 87 % ((arg0 + 23) / 61);
        field3194 = null;
        field3190 = null;
        field3188 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Ldk;")
    public class179 method169(int arg0, int arg1, int arg2) {
        field3195++;
        return this;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ldk;IIIZ)V")
    public void method151(class179 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3186++;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(III)J")
    public static final long method1166(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2502; var4++) {
            class146 var5 = var3.field2506[var4];
            if ((var5.field2720 >> 29 & 0x3L) == 2L && var5.field2728 == arg1 && var5.field2719 == arg2) {
                return var5.field2720;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lfl;III)Loe;")
    public static final class108 method1167(class192 arg0, int arg1, int arg2, int arg3) {
        field3184++;
        if (class28.method239(50, arg0, arg1, arg3)) {
            if (arg2 != 0) {
                method1167((class192) null, -10, 68, 85);
            }
            return class75.method534(0);
        } else {
            return null;
        }
    }
}
