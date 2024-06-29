import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class451 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lkb;")
    public static class139 field6608 = new class139(0);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lrb;")
    public static class283 field6611 = new class283(87, 10);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Ldq;")
    public static class129 field6612;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    public static int[] field6613;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[I")
    public static int[] field6614;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(DI)V")
    public static final void method2646(double arg0, int arg1) {
        field6610++;
        if (arg1 != 95) {
            field6613 = null;
        }
        if (class515.field7543 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class310.field4215[var3] = var4 > 255 ? 255 : var4;
        }
        class515.field7543 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method2647(byte arg0) {
        field6608 = null;
        field6611 = null;
        if (arg0 != 78) {
            field6613 = null;
        }
        field6612 = null;
        field6614 = null;
        field6613 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static final void method2648(boolean arg0) {
        field6607++;
        class65 var1 = (class65) class463.field6690.method3137(0);
        if (!arg0) {
            field6614 = null;
        }
        while (var1 != null) {
            if (var1.field940 > 0) {
                var1.field940--;
            }
            if (var1.field940 != 0) {
                if (var1.field937 > 0) {
                    var1.field937--;
                }
                if (var1.field937 == 0 && var1.field931 >= 1 && var1.field929 >= 1 && class9.field111 - 2 >= var1.field931 && class192.field2809 - 2 >= var1.field929 && (var1.field939 < 0 || class40.method279(var1.field942, 4, var1.field939))) {
                    class83.method644(var1.field935, var1.field929, var1.field943, var1.field931, var1.field942, var1.field939, var1.field927, -38, -1);
                    var1.field937 = -1;
                    if (var1.field939 == var1.field933 && var1.field933 == -1) {
                        var1.method2791((byte) 112);
                    } else if (var1.field939 == var1.field933 && var1.field928 == var1.field927 && var1.field942 == var1.field932) {
                        var1.method2791((byte) 112);
                    }
                }
            } else if (var1.field933 < 0 || class40.method279(var1.field932, 4, var1.field933)) {
                class83.method644(var1.field935, var1.field929, var1.field943, var1.field931, var1.field932, var1.field933, var1.field928, -59, -1);
                var1.method2791((byte) 112);
            }
            var1 = (class65) class463.field6690.method3132(0);
        }
    }
}
