import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class324 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[I")
    public static int[] field4883 = new int[100];

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "[I")
    public static int[] field4886 = new int[500];

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "[S")
    public static short[] field4885 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Z")
    public static boolean field4888 = true;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Ljava/lang/String;")
    public String field4882;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 5)
    public static void method2244(int arg0) {
        field4885 = null;
        field4883 = null;
        field4886 = null;
        if (arg0 != 1011) {
            field4888 = false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIILgi;Lid;)V", line = 33)
    public static final void method2245(int arg0, int arg1, int arg2, class287 arg3, class200 arg4) {
        field4887++;
        if (arg4.field2932 != null) {
            int[] var5 = new int[arg4.field2932.length];
            boolean var6 = false;
            for (int var7 = 0; var7 < (var5.length / 2); var7++) {
                int var8 = arg3.field4338 - arg4.field2932[var7 * 2 + 1];
                int var9 = arg4.field2932[var7 * 2] + arg3.field4342;
                int var10 = var5[var7 * 2] = (class105.field1518 - class105.field1515) * (var9 - class105.field1520) / (class105.field1510 - class105.field1520) + class105.field1515;
                int var11 = var5[var7 * 2 + 1] = (class105.field1511 - class105.field1514) * (var8 - class105.field1507) / (class105.field1521 - class105.field1507) + class105.field1514;
                if (class105.field1515 < var10 && class105.field1518 > var10 && var11 > class105.field1514 && class105.field1511 > var11) {
                    var6 = true;
                }
            }
            if (!var6) {
                return;
            }
            class328.method2274(var5, arg4.field2911, arg4.field2911 >>> 24);
            for (int var12 = 0; var12 < var5.length / 2 - 1; var12++) {
                class44.method340(var5[var12 * 2], var5[var12 * 2 + 1], var5[(var12 + 1) * 2], var5[var12 * 2 + 1 + 2], arg4.field2925, arg4.field2925 >>> 24);
            }
            class44.method340(var5[var5.length - 2], var5[var5.length - 1], var5[0], var5[1], arg4.field2925, arg4.field2925 >>> 24);
        } else if (arg3.field4352) {
            return;
        }
        class92 var13 = new class92(arg3);
        if (arg2 != -20841) {
            field4883 = (int[]) null;
        }
        class234 var14 = null;
        if (arg4.field2916 != -1) {
            if (arg3.field4349 && arg4.field2937 != -1) {
                var14 = (class234) arg4.method1460(true, (byte) 127, true);
            } else {
                var14 = (class234) arg4.method1460(false, (byte) -52, true);
            }
            if (var14 != null) {
                if (class107.field1528 > 0 && (class41.field596 != -1 && class41.field596 == arg3.field4350 || class209.field3047 != -1 && class209.field3047 == arg4.field2915)) {
                    int var15;
                    if (class68.field994 <= 50) {
                        var15 = class68.field994 * 3;
                    } else {
                        var15 = (100 - class68.field994) * 3;
                    }
                    class44.method336(arg3.field4341, arg3.field4347, var14.field3715 / 2 + 7, 16776960, var15);
                    class44.method336(arg3.field4341, arg3.field4347, var14.field3715 / 2 + 5, 16776960, var15);
                    class44.method336(arg3.field4341, arg3.field4347, var14.field3715 / 2 + 3, 16776960, var15);
                    class44.method336(arg3.field4341, arg3.field4347, var14.field3715 / 2 + 1, 16776960, var15);
                    class44.method336(arg3.field4341, arg3.field4347, var14.field3715 / 2, 16776960, var15);
                }
                var14.method1482(arg3.field4341 - (var14.field3715 >> 1), arg3.field4347 - (var14.field3716 >> 1));
                var13.field1274 = arg3.field4341 + arg0 + (var14.field3715 >> 1);
                var13.field1277 = arg3.field4341 + arg0 - (var14.field3715 >> 1);
                var13.field1275 = (var14.field3716 >> 1) + arg1 + arg3.field4347;
                var13.field1272 = arg3.field4347 + arg1 - (var14.field3716 >> 1);
            }
        }
        if (arg4.field2920 != null) {
            if (var14 == null) {
                class33.method236(arg0, 0, arg1, arg4, arg2 + 20841, true, var13, arg3);
            } else {
                class33.method236(arg0, (var14.field3716 >> 1) + 5, arg1, arg4, arg2 + 20841, false, var13, arg3);
            }
        }
        if (var13.method725(-127, class56.field815, class165.field2353) && arg4.field2910 != null) {
            if (arg4.field2910[4] != null) {
                class261.method1920((short) 1012, arg4.field2910[4], -1, arg4.field2915, arg4.field2929, arg2 ^ 0x5169, 0, (long) arg3.field4350);
            }
            if (arg4.field2910[3] != null) {
                class261.method1920((short) 1009, arg4.field2910[3], -1, arg4.field2915, arg4.field2929, -2, 0, (long) arg3.field4350);
            }
            if (arg4.field2910[2] != null) {
                class261.method1920((short) 1005, arg4.field2910[2], -1, arg4.field2915, arg4.field2929, arg2 ^ 0x5169, 0, (long) arg3.field4350);
            }
            if (arg4.field2910[1] != null) {
                class261.method1920((short) 1011, arg4.field2910[1], -1, arg4.field2915, arg4.field2929, -2, 0, (long) arg3.field4350);
            }
            if (arg4.field2910[0] != null) {
                class261.method1920((short) 1010, arg4.field2910[0], -1, arg4.field2915, arg4.field2929, -2, 0, (long) arg3.field4350);
            }
        }
        class49.field727.method106(var13, arg2 ^ 0x5115);
    }
}
