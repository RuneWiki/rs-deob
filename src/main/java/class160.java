import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class160 extends class161 {

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "Lal;")
    public static class52 field2528 = new class52(16);

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field2530 = 0;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field2533 = -1;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field2532 = 0;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)V")
    public static final void method1115(int arg0) {
        field2529++;
        for (class405 var1 = (class405) class282.field4527.method253((byte) -6); var1 != null; var1 = (class405) class282.field4527.method247((byte) 100)) {
            class166 var3 = var1.field6026;
            if (class266.field4286 != var3.field714 || var3.field2628 < class183.field2987) {
                var1.method1120(-118);
                var3.method1167(false);
            } else if (var3.field2625 <= class183.field2987) {
                if (var3.field2611 > 0) {
                    class50 var4 = class39.field499[var3.field2611 - 1];
                    if (var4 != null && var4.field724 >= 0 && var4.field724 < class80.field1003 * 128 && var4.field722 >= 0 && class380.field5751 * 128 > var4.field722) {
                        var3.method1169(var4.field724, class183.field2987, var4.field722, class58.method386(var3.field714, (byte) -99, var4.field724, var4.field722) - var3.field2624, 0);
                    }
                }
                if (var3.field2611 < 0) {
                    int var5 = -var3.field2611 - 1;
                    class219 var6;
                    if (class39.field500 == var5) {
                        var6 = class261.field4201;
                    } else {
                        var6 = class216.field3517[var5];
                    }
                    if (var6 != null && var6.field724 >= 0 && var6.field724 < (class80.field1003 * 128) && var6.field722 >= 0 && class380.field5751 * 128 > var6.field722) {
                        var3.method1169(var6.field724, class183.field2987, var6.field722, class58.method386(var3.field714, (byte) -119, var6.field724, var6.field722) - var3.field2624, 0);
                    }
                }
                var3.method1168(-1, class62.field807);
                class239.method1689(var3, true);
            }
        }
        int var2 = 90 / ((arg0 + 38) / 57);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class262 var7 = new class262();
        var7.field4221 = arg1 >> 7;
        var7.field4211 = arg2 >> 7;
        var7.field4204 = arg3 >> 7;
        var7.field4213 = arg4 >> 7;
        var7.field4222 = arg0;
        var7.field4208 = arg1;
        var7.field4206 = arg2;
        var7.field4209 = arg3;
        var7.field4226 = arg4;
        var7.field4210 = arg5;
        var7.field4218 = arg6;
        class432.field6364[class414.field6122++] = var7;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
    public class160() {
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(I)V")
    public class160(int arg0) {
        this.field2527 = arg0;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Z)V")
    public static void method1117(boolean arg0) {
        field2528 = null;
        if (!arg0) {
            method1118(46, 90, -25);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Laq;")
    public static final class89 method1118(int arg0, int arg1, int arg2) {
        class232 var3 = class423.field6252[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3872;
    }
}
