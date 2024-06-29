import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class203 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lka;")
    public static class245 field3575 = null;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    public static int[] field3578 = new int[25];

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3580 = 0;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Leb;")
    private static class230 field3583 = class68.method589(0, "Loaded input handler");

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Leb;")
    public static class230 field3582 = field3583;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Leb;")
    public class230 field3579;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1423(int arg0) {
        field3582 = null;
        field3578 = null;
        field3583 = null;
        if (arg0 != -5401) {
            field3580 = -66;
        }
        field3575 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILeb;)V")
    public static final void method1424(int arg0, class230 arg1) {
        field3581++;
        class237.field4100 = arg1;
        if (class184.field3228.field2320 == null) {
            return;
        }
        try {
            if (arg0 == 13062) {
                class230 var2 = class117.field2095.method1594(101, class184.field3228.field2320);
                class230 var3 = class191.field3379.method1594(2, class184.field3228.field2320);
                class230 var4 = class173.method1267((byte) 59, new class230[] { var2, class41.field742, arg1, class246.field4374, var3 });
                class230 var5;
                if (arg1.method1635(arg0 - 13172) == 0) {
                    var5 = class173.method1267((byte) 59, new class230[] { var4, class222.field3807 });
                } else {
                    var5 = class173.method1267((byte) 59, new class230[] { var4, class99.field1842, class183.method1318((byte) 79, class201.method1419(5) + 94608000000L), class71.field1306, class61.method516(94608000L, (byte) 48) });
                }
                class173.method1267((byte) 59, new class230[] { class172.field3042, var5, class229.field3947 }).method1593(class184.field3228.field2320, (byte) 93);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static final void method1425(int arg0) {
        field3574++;
        if (arg0 != -30833) {
            return;
        }
        for (int var1 = -1; var1 < class169.field2984; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class233.field4042[var1];
            }
            class260 var3 = class230.field4011[var2];
            if (var3 != null) {
                class140.method1075(var3, var3.method1005(0), (byte) -102);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)I")
    public static final int method1426(int arg0, int arg1, int arg2) {
        field3576++;
        class212 var3 = (class212) class75.field1366.method394((long) arg1, arg2 - 23130);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field3685.length) {
            return arg2 == 2047 ? var3.field3685[arg0] : -30;
        } else {
            return -1;
        }
    }
}
