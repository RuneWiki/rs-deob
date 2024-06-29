import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class400 extends class180 {

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public volatile int field5590 = -1;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Ljava/lang/String;")
    public volatile String field5589;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field5591 = 3;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lfn;")
    public static class52 field5587 = new class52(62, 1);

    @OriginalMember(owner = "client!id", name = "v", descriptor = "[Lvh;")
    public static class89[] field5593 = new class89[50];

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field5592 = 0;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)[Lfn;", line = 3)
    public static final class52[] method2371(int arg0) {
        field5586++;
        return arg0 == 7126 ? new class52[] { class462.field6503, class472.field6615, class80.field1211, class489.field6893, class210.field2969, class261.field3628, class459.field6469, class132.field1862, class221.field3114, class182.field2646, class175.field2573, class244.field3450, class261.field3642, class20.field347, class383.field5437, class237.field3342, class27.field451, class129.field1824, class444.field6125, class448.field6177, class199.field2846, class79.field1199, class231.field3248, class37.field642, class182.field2653, class328.field4530, class244.field3454, class104.field1499, class432.field5953, class407.field5641, class125.field1717, class117.field1650, class309.field4220, class90.field1347, class41.field700, class184.field2676, class50.field838, class192.field2751, class216.field3064, class32.field510, class380.field5395, class109.field1548, class99.field1403, class289.field3972, class198.field2837, class394.field5549, class388.field5463, class146.field2061, class157.field2255, class270.field3746, class54.field883, class249.field3496, class136.field1927, class406.field5623, class76.field1152, class78.field1172, class438.field6007, class434.field5969, class9.field182, class238.field3359, class381.field5404, class84.field1262, field5587, class114.field1605, class326.field4498, class357.field4986, class268.field3722, class454.field6277, class109.field1547, class60.field940, class267.field3714, class319.field4369, class243.field3444, class6.field116, class10.field191, class59.field922, class70.field1037, class46.field742, class277.field3844, class41.field688, class407.field5631, class222.field3130, class441.field6056, class126.field1725, class475.field6698, class346.field4732, class181.field2619, class459.field6462, class445.field6148, class306.field4183, class262.field3660, class283.field3889, class321.field4407, class423.field5814, class3.field27, class377.field5335, class232.field3269, class349.field4773, class488.field6887, class387.field5453, class459.field6471, class321.field4394, class286.field3908, class109.field1541, class423.field5817 } : null;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V", line = 17)
    public static void method2372(int arg0) {
        if (arg0 >= -18) {
            method2373((class163) null, 70, (class442) null, (class487) null);
        }
        field5587 = null;
        field5593 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lji;ILfr;Lkm;)V", line = 29)
    public static final void method2373(class163 arg0, int arg1, class442 arg2, class487 arg3) {
        field5588++;
        class385 var4 = arg2.method2575(-55, arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method388();
        if (var5 < var4.method394()) {
            var5 = var4.method394();
        }
        byte var6 = 10;
        int var7 = arg0.field2334;
        int var8 = arg0.field2346;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field6068 != null) {
            var9 = class329.field4538.method521((class385[]) null, arg2.field6068, (int[]) null, class106.field1529, (byte) 26);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class106.field1529[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class137.field1948.method874(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class137.field1948.method871() * var9 + class137.field1948.method870() / 2;
        }
        int var15 = var5 / 2 + arg0.field2334;
        if (arg1 > -127) {
            return;
        }
        int var16 = arg0.field2346;
        if (class379.field5391 + var5 > var7) {
            var7 = class379.field5391;
            var15 = var5 / 2 + class379.field5391 + var10 / 2 + var6 + 5;
        } else if (class379.field5394 - var5 < var7) {
            var7 = class379.field5394 - var5;
            var15 = class379.field5394 - (var5 / 2) - var6 - (var10 / 2) - 5;
        }
        if ((class379.field5388 + var5) > var8) {
            var16 = class379.field5388 + (var5 / 2) + var6;
            var8 = class379.field5388;
        } else if (var8 > (class379.field5385 - var5)) {
            var16 = class379.field5385 - (var5 / 2 + (var6 + var11));
            var8 = class379.field5385 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field2334), (double) (var8 - arg0.field2346)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method2298((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field6068 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var10 + var18 + 10;
            var21 = var9 * class137.field1948.method871() + var16 + 3;
            if (arg2.field6061 != 0) {
                arg3.method2860(var21 - var16, -var18 + var20, var18, arg2.field6061, var16, 1);
            }
            if (arg2.field6086 != 0) {
                arg3.method2866(var20 - var18, true, var21 - var16, var16, arg2.field6086, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class106.field1529[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class137.field1948.method868(arg3, var23, var15, var16, arg2.field6064, true);
                var16 += class137.field1948.method871();
            }
        }
        if (arg2.field6071 == -1 && arg2.field6068 == null) {
            return;
        }
        class21 var24 = new class21(arg0);
        int var25 = var5 >> 1;
        var24.field360 = var19;
        var24.field369 = var21;
        var24.field362 = var8 + var25;
        var24.field363 = var7 - var25;
        var24.field359 = var20;
        var24.field358 = var18;
        var24.field361 = var7 + var25;
        var24.field365 = var8 - var25;
        class52.field863.method1553((byte) -125, var24);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 189)
    public class400(String arg0) {
        this.field5589 = arg0;
    }
}
