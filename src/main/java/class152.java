import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class152 extends Canvas {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field3557;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Laf;")
    private static class7 field3555 = class48.method406(40, "Please enter your password)3");

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Laf;")
    public static class7 field3553 = field3555;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Laf;")
    public static class7 field3558 = class48.method406(40, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lgd;")
    public static class46 field3559 = new class46(64);

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Laf;")
    public static class7 field3562 = class48.method406(40, "rect_debug=");

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
    public static int[] field3561 = new int[1000];

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Z")
    public static boolean field3563 = false;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Laf;")
    public static class7 field3564 = class48.method406(40, "null");

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lkb;")
    public static class71 field3560;

    @OriginalMember(owner = "client!wb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3552++;
        this.field3557.update(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1200(int arg0) {
        field3558 = null;
        field3562 = null;
        field3555 = null;
        int var1 = -31 / ((arg0 - 70) / 43);
        field3561 = null;
        field3553 = null;
        field3564 = null;
        field3560 = null;
        field3559 = null;
    }

    @OriginalMember(owner = "client!wb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field3557.paint(arg0);
        field3556++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class152(Component arg0) {
        this.field3557 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZIIIZ)Lfd;")
    public static final class40 method1201(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3554++;
        long var6 = ((long) arg0 << 16) + ((long) arg4 << 40) + (long) arg2 + ((long) arg3 << 38);
        if (!arg5) {
            class40 var8 = (class40) class143.field3380.method395(124, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class135 var9 = class64.method526(false, arg2);
        if (arg0 > 1 && var9.field3214 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field3195[var11] <= arg0 && var9.field3195[var11] != 0) {
                    var10 = var9.field3214[var11];
                }
            }
            if (var10 != -1) {
                var9 = class64.method526(arg1, var10);
            }
        }
        class31 var12 = var9.method1099(111, 1);
        if (var12 == null) {
            return null;
        }
        class40 var13 = null;
        if (var9.field3220 != -1) {
            var13 = method1201(10, false, var9.field3200, 1, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class33.field858;
        int var15 = class33.field862;
        int[] var16 = new int[4];
        int var17 = class33.field860;
        class33.method297(var16);
        class40 var18 = new class40(36, 32);
        class33.method295(var18.field989, 36, 32);
        class33.method300();
        class134.method1089();
        class134.method1084(16, 16);
        class134.field3166 = arg1;
        int var19 = var9.field3184;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg3 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class134.field3160[var9.field3207] * var19 >> 16;
        int var21 = class134.field3164[var9.field3207] * var19 >> 16;
        var12.method262();
        var12.method276(0, var9.field3215, var9.field3201, var9.field3207, var9.field3217, var21 + var12.field2386 / 2 + var9.field3185, var9.field3185 + var20);
        if (arg3 >= 1) {
            var18.method355(1);
        }
        if (arg3 >= 2) {
            var18.method355(16777215);
        }
        if (arg4 != 0) {
            var18.method346(arg4);
        }
        class33.method295(var18.field989, 36, 32);
        if (var9.field3220 != -1) {
            var13.method341(0, 0);
        }
        if (!arg5 && (var9.field3194 == 1 || arg0 != 1) && arg0 != -1) {
            class109.field2651.method42(class54.method439(98, arg0), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            class143.field3380.method388(var18, var6, 2047);
        }
        class33.method295(var14, var15, var17);
        class33.method293(var16);
        class134.method1089();
        class134.field3166 = true;
        return var18;
    }
}
