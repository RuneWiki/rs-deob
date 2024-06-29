import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class224 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field3522 = 50;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Z")
    public static boolean field3525 = false;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3523++;
        class248 var7 = class79.method571(arg0, arg3, (byte) -74);
        if (var7 != null && var7.field3919 != null) {
            class78 var8 = new class78();
            var8.field1265 = var7.field3919;
            var8.field1251 = var7;
            class139.method959((byte) 87, var8);
        }
        class184.field3061 = arg1;
        class189.field3096 = arg6;
        class243.field3847 = arg0;
        if (arg2 != 0) {
            method1557(76, 88, (class273) null, 14, false, 3);
        }
        class133.field2135 = arg4;
        class44.field652 = arg5;
        class122.field1940 = arg3;
        class101.field1579 = true;
        class111.method776(var7, (byte) 25);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILfa;IZI)V")
    public static final void method1557(int arg0, int arg1, class273 arg2, int arg3, boolean arg4, int arg5) {
        field3524++;
        if (arg2.field4418 == -1 && arg2.field4399 == null) {
            return;
        }
        int var6 = 0;
        if (arg2.field4400 < arg1) {
            var6 += arg1 - arg2.field4400;
        } else if (arg2.field4410 > arg1) {
            var6 += arg2.field4410 - arg1;
        }
        int var7 = class66.field1067 * arg2.field4395 >> 8;
        if (arg2.field4397 < arg3) {
            var6 += arg3 - arg2.field4397;
        } else if (arg3 < arg2.field4394) {
            var6 += arg2.field4394 - arg3;
        }
        if (arg2.field4406 == 0 || (var6 - 64) > arg2.field4406 || class66.field1067 == 0 || arg2.field4396 != arg0) {
            if (arg2.field4413 != null) {
                class89.field1397.method1357(arg2.field4413);
                arg2.field4413 = null;
            }
            if (arg2.field4419 != null) {
                class89.field1397.method1357(arg2.field4419);
                arg2.field4419 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field4406 - var6) * var7 / arg2.field4406;
        if (arg2.field4413 != null) {
            arg2.field4413.method1537(var8);
        } else if (arg2.field4418 >= 0) {
            class279 var9 = class279.method1900(class53.field772, arg2.field4418, 0);
            if (var9 != null) {
                class126 var10 = var9.method1901().method867(class197.field3171);
                class222 var11 = class222.method1532(var10, 100, var8);
                var11.method1521(-1);
                class89.field1397.method1353(var11);
                arg2.field4413 = var11;
            }
        }
        if (arg2.field4419 != null) {
            arg2.field4419.method1537(var8);
            if (!arg2.field4419.method950(128)) {
                arg2.field4419 = null;
            }
        } else if (arg2.field4399 != null && (arg2.field4398 -= arg5) <= 0) {
            int var12 = (int) (Math.random() * (double) arg2.field4399.length);
            class279 var13 = class279.method1900(class53.field772, arg2.field4399[var12], 0);
            if (var13 != null) {
                class126 var14 = var13.method1901().method867(class197.field3171);
                class222 var15 = class222.method1532(var14, 100, var8);
                var15.method1521(0);
                class89.field1397.method1353(var15);
                arg2.field4419 = var15;
                arg2.field4398 = (int) ((double) (arg2.field4411 - arg2.field4403) * Math.random()) + arg2.field4403;
            }
        }
        if (arg4) {
            method1558(87, 26);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    public static final void method1558(int arg0, int arg1) {
        field3526++;
        if (arg0 == -506) {
            class291 var2 = class61.method389(arg1, 12, 0);
            var2.method2010(arg0 + 506);
        }
    }
}
