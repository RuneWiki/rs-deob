import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class177 {

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[F")
    public static float[] field2572;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Z")
    public static boolean field2570;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lqa;IIIIILm;)V")
    public static final void method1182(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class126 arg6) {
        field2569++;
        if (class320.field4194 < 100) {
            class29.method235((byte) -51, arg0, arg6);
        }
        arg0.method572(arg5, arg1, arg4 + arg5, arg1 + arg3);
        if (class320.field4194 < 100) {
            byte var7 = 20;
            int var8 = arg5 + (arg4 / 2);
            int var9 = arg3 / 2 + (arg1 - var7 - 18);
            arg0.method585(arg5, arg1, arg4, arg3, -16777216, 0);
            arg0.method614(var8 - 152, var9, 304, 34, class292.field3833[class43.field637].getRGB(), 0);
            arg0.method585(var8 - 150, var9 + 2, class320.field4194 * 3, 30, class5.field136[class43.field637].getRGB(), 0);
            class219.field2961.method2812(-1, var7 + var9, (byte) 90, class343.field4533[class43.field637].getRGB(), var8, class265.field3507.method1764(class489.field6789, false));
            return;
        }
        int var10 = class5.field152 - ((int) ((float) arg4 / class6.field164));
        int var11 = (int) ((float) arg3 / class6.field164) + class391.field5300;
        int var12 = (int) ((float) arg4 / class6.field164) + class5.field152;
        class347.field4633 = class391.field5300 - ((int) ((float) arg3 / class6.field164));
        class483.field6724 = (int) ((float) (arg4 * 2) / class6.field164);
        class265.field3494 = class5.field152 - ((int) ((float) arg4 / class6.field164));
        class256.field3381 = (int) ((float) (arg3 * 2) / class6.field164);
        int var13 = class391.field5300 - ((int) ((float) arg3 / class6.field164));
        class6.method33(var10 + class6.field175, class6.field172 + var11, class6.field175 + var12, class6.field172 + var13, arg5, arg1, arg5 + arg4, arg1 + arg3 - -1);
        class6.method53(arg0);
        class280 var14 = class6.method36(arg0);
        class123.method901(38, arg0, var14, 0, arg2);
        if (class497.field6891 > 0) {
            class389.field5277--;
            if (class389.field5277 == 0) {
                class497.field6891--;
                class389.field5277 = 20;
            }
        }
        if (!class290.field3801) {
            return;
        }
        int var15 = arg4 + arg5 - 5;
        int var16 = arg1 + arg3 - 8;
        class302.field3995.method2820("Fps:" + class374.field5064, 0, -1, var16, var15, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class302.field3995.method2820("Mem:" + var18 + "k", 0, -1, var20, var15, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method1183(byte arg0, int arg1, int arg2) {
        field2571++;
        int var3 = arg2 - arg1;
        if (arg0 >= -75) {
            method1184(47, null);
        }
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1184(int arg0, String arg1) {
        field2568++;
        int var2 = arg1.length();
        int var3 = arg0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method1185(byte arg0) {
        field2572 = null;
        if (arg0 > -103) {
            field2572 = null;
        }
    }

    static {
        new class304(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field2572 = new float[4];
    }
}
