import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class158 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[[B")
    public static byte[][] field2585 = new byte[1000][];

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lpd;")
    public static class3 field2584 = new class3(8);

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Laj;")
    public static class1 field2586 = new class1(new byte[5000]);

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[J")
    public static long[] field2587 = new long[100];

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[Lwd;")
    public static class88[] field2578;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILph;Lpf;Lhe;III)V", line = 4)
    public static final void method1167(int arg0, int arg1, class86 arg2, class92 arg3, class101 arg4, int arg5, int arg6, int arg7) {
        field2583++;
        if (arg5 <= 89) {
            field2584 = (class3) null;
        }
        class71 var8 = new class71();
        var8.field1077 = arg7;
        var8.field1087 = arg0 * 128;
        var8.field1069 = arg6 * 128;
        if (arg4 != null) {
            var8.field1082 = arg4.field1654;
            var8.field1065 = arg4.field1625;
            var8.field1091 = arg4.field1612;
            var8.field1067 = arg4;
            var8.field1073 = arg4.field1617;
            int var9 = arg4.field1626;
            var8.field1079 = arg4.field1630;
            var8.field1064 = arg4.field1648 * 128;
            int var10 = arg4.field1623;
            if (arg1 == 1 || arg1 == 3) {
                var9 = arg4.field1623;
                var10 = arg4.field1626;
            }
            var8.field1081 = (arg0 + var10) * 128;
            var8.field1090 = (arg6 + var9) * 128;
            if (arg4.field1653 != null) {
                var8.field1078 = true;
                var8.method570(-5106);
            }
            if (var8.field1065 != null) {
                var8.field1088 = (int) ((double) (var8.field1073 - var8.field1079) * Math.random()) + var8.field1079;
            }
            class180.field2858.method277(var8, (byte) -119);
        } else if (arg2 != null) {
            var8.field1076 = arg2;
            class84 var11 = arg2.field1381;
            if (var11.field1339 != null) {
                var8.field1078 = true;
                var11 = var11.method667(-41);
            }
            if (var11 != null) {
                var8.field1090 = (var11.field1363 + arg6) * 128;
                var8.field1081 = (var11.field1363 + arg0) * 128;
                var8.field1091 = class294.method2065(arg2, (byte) 99);
                var8.field1082 = var11.field1359;
                var8.field1064 = var11.field1340 * 128;
            }
            class76.field1176.method277(var8, (byte) -119);
        } else if (arg3 != null) {
            var8.field1084 = arg3;
            var8.field1090 = (arg3.method738(-6421) + arg6) * 128;
            var8.field1081 = (arg0 + arg3.method738(-6421)) * 128;
            var8.field1091 = class96.method778(arg3, (byte) 30);
            var8.field1064 = arg3.field1509 * 128;
            var8.field1082 = arg3.field1491;
            class107.field1754.method75(var8, -1, class106.method851(arg3.field1486, -54));
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 94)
    public static void method1168(boolean arg0) {
        field2584 = null;
        field2578 = null;
        field2586 = null;
        field2585 = (byte[][]) null;
        if (arg0) {
            method1168(false);
        }
        field2587 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLpk;)V", line = 110)
    public static final void method1169(byte arg0, class120 arg1) {
        field2582++;
        if (class314.field4950) {
            return;
        }
        if (class162.field2623) {
            class114.method884();
        } else {
            class33.method294();
        }
        class6.field142 = class87.method691((byte) -111, class178.field2840, arg1);
        if (arg0 != 3) {
            return;
        }
        int var2 = class338.field5219;
        int var3 = var2 * 956 / 503;
        class6.field142.method695((class211.field3314 - var3) / 2, 0, var3, var2);
        class288.field4547 = class21.method214((byte) -119, arg1, class244.field3649);
        class288.field4547.method990(class211.field3314 / 2 - (class288.field4547.field3065 / 2), 18);
        class314.field4950 = true;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 144)
    public class158() {
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lqf;)V", line = 146)
    public class158(class158 arg0) {
        this.field2577 = arg0.field2577;
        this.field2580 = arg0.field2580;
        this.field2579 = arg0.field2579;
        this.field2581 = arg0.field2581;
    }
}
