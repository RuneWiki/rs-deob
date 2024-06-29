import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class256 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Lho;")
    public static class103 field3399 = new class103(80, 7);

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
    public static int[] field3402 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field3403 = -1;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lug;")
    public static class396 field3401;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method1580(boolean arg0) {
        field3402 = null;
        field3401 = null;
        if (!arg0) {
            method1581(109, null, null, null, null);
        }
        field3399 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILfo;Lfo;Lfo;Lfo;)V")
    public static final void method1581(int arg0, class361 arg1, class361 arg2, class361 arg3, class361 arg4) {
        if (arg0 != 14) {
            field3399 = null;
        }
        class469.field6959 = arg4;
        field3400++;
        class355.field4743 = arg2;
        class36.field362 = arg3;
        class186.field2420 = arg1;
        class339.field4491 = new class450[class186.field2420.method2138(-1)][];
        class260.field3494 = new boolean[class186.field2420.method2138(-1)];
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIZI)Ldn;")
    public static final class360 method1582(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3398++;
        class360 var5 = new class360();
        var5.field4886 = arg1;
        var5.field4888 = arg2;
        class152.field1989.method291((long) arg4, var5, arg0 - 66);
        class9.method59(2048, arg1);
        class450 var6 = class406.method2490((byte) -116, arg4);
        if (var6 != null) {
            class413.method2521(var6, false);
        }
        if (class446.field6492 != null) {
            class413.method2521(class446.field6492, false);
            class446.field6492 = null;
        }
        class495.method2985((byte) -74);
        if (var6 != null) {
            class433.method2667(0, var6, !arg3);
        }
        if (!arg3) {
            class432.method2654(arg1);
        }
        if (arg0 == -1) {
            if (!arg3 && class168.field2174 != -1) {
                class63.method379(1, class168.field2174, true);
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBZ)V")
    public static final void method1583(int arg0, byte arg1, boolean arg2) {
        int var3 = 34 / ((-arg1 - 3) / 46);
        field3404++;
        class327 var4 = class457.method2813(arg0, arg2, -64);
        if (var4 != null) {
            var4.method2674(true);
        }
    }
}
