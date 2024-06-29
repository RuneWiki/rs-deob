import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class30 extends class287 {

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "[B")
    public byte[] field443;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field449 = 0;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Lcd;")
    public static class136 field450 = null;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "[I")
    public static int[] field447;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)[F", line = 4)
    public static final float[] method270(int arg0, byte arg1) {
        field442++;
        if (arg1 > -29) {
            return (float[]) null;
        }
        float var2 = class115.method812() + class115.method813();
        int var3 = class115.method814();
        float var4 = 0.58823526F;
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        class132.field1951[3] = 1.0F;
        float var6 = (float) ((var3 & 0xFF7FD3) >> 16) / 255.0F;
        class132.field1951[2] = var2 * var5 * ((float) class333.method2319(arg0, 255) / 255.0F) * var4;
        class132.field1951[0] = var2 * var4 * (float) (class333.method2319(16771220, arg0) >> 16) / 255.0F * var6;
        float var7 = (float) ((var3 & 0xFF7A) >> 8) / 255.0F;
        class132.field1951[1] = var2 * var4 * (float) (class333.method2319(65298, arg0) >> 8) / 255.0F * var7;
        return class132.field1951;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V", line = 33)
    public static void method271(byte arg0) {
        field447 = null;
        field450 = null;
        if (arg0 < 122) {
            method272(104, -123, -23, -24, 39);
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([B)V", line = 48)
    public class30(byte[] arg0) {
        this.field443 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII)V", line = 58)
    public static final void method272(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class2.field22 < 100) {
            class4.method15((byte) 127);
        }
        field446++;
        if (class109.field1458) {
            class122.method885(arg3, arg4, arg2 + arg3, arg0 + arg4);
        } else {
            class280.method1978(arg3, arg4, arg2 + arg3, arg4 - -arg0);
        }
        if (class2.field22 < 100) {
            int var5 = arg2 / 2 + arg3;
            byte var6 = 20;
            int var7 = arg0 / 2 + arg4 - var6 - 18;
            if (class109.field1458) {
                class122.method897(arg3, arg4, arg2, arg0, 0);
                class122.method888(var5 - 152, var7, 304, 34, 9179409);
                class122.method888(var5 - 151, var7 + 1, 302, 32, 0);
                class122.method897(var5 - 150, var7 + 2, class2.field22 * 3, 30, 9179409);
                class122.method897(var5 - (150 - class2.field22 * 3), var7 - -2, 300 - (class2.field22 * 3), 30, 0);
            } else {
                class280.method1971(arg3, arg4, arg2, arg0, 0);
                class280.method1979(var5 - 152, var7, 304, 34, 9179409);
                class280.method1979(var5 - 151, var7 - -1, 302, 32, 0);
                class280.method1971(var5 - 150, var7 + 2, class2.field22 * 3, 30, 9179409);
                class280.method1971(var5 - (150 - (class2.field22 * 3)), var7 - -2, 300 - (class2.field22 * 3), 30, 0);
            }
            class270.field4197.method2258(class202.field3219, var5, var7 + var6, 16777215, -1);
            return;
        }
        int var8 = 79 / ((arg1 + 49) / 46);
        class6.field90 = (int) ((float) (arg2 * 2) / class163.field2650);
        class328.field5136 = class191.field3045 - ((int) ((float) arg0 / class163.field2650));
        class304.field4759 = class322.field5081 - (int) ((float) arg2 / class163.field2650);
        int var9 = class191.field3045 - (int) ((float) arg0 / class163.field2650);
        int var10 = (int) ((float) arg2 / class163.field2650) + class322.field5081;
        class156.field2413 = (int) ((float) (arg0 * 2) / class163.field2650);
        int var11 = class322.field5081 - ((int) ((float) arg2 / class163.field2650));
        int var12 = (int) ((float) arg0 / class163.field2650) + class191.field3045;
        if (class109.field1458) {
            if (class39.field560 == null || class39.field560.field2788 != arg2 || class39.field560.field2791 != arg0) {
                class39.field560 = null;
                class39.field560 = new class190(arg2, arg0);
            }
            class280.method1983(class39.field560.field3038, arg2, arg0);
            class61.method501(var10, var12, 0, arg0, arg2, 0, -97, var9, var11);
            class232.method1672(arg2, 0, class7.field156, var9, arg0, 122, var12, 0, var11, var10);
            class292.method2041(false, arg0, 0, var9, var10, var11, arg2, var12, 0);
            class39.field560.method1407();
            class122.method886(class39.field560.field3038, arg3, arg4, arg2, arg0);
            class280.field4310 = null;
        } else {
            class61.method501(var10, var12, arg4, arg0 + arg4, arg2 + arg3, arg3, -100, var9, var11);
            class232.method1672(arg3 + arg2, arg4, class7.field156, var9, arg0 + arg4, 89, var12, arg3, var11, var10);
            class292.method2041(false, arg0 + arg4, arg3, var9, var10, var11, arg2 + arg3, var12, arg4);
        }
        if (class56.field779 > 0) {
            class1.field4--;
            if (class1.field4 == 0) {
                class1.field4 = 20;
                class56.field779--;
            }
        }
        if (!class306.field4782) {
            return;
        }
        int var13 = arg2 + arg3 - 5;
        int var14 = arg0 + arg4 - 8;
        int var15 = 16776960;
        class102.field1355.method2263("Fps:" + class246.field3834, var13, var14, 16776960, -1);
        Runtime var16 = Runtime.getRuntime();
        int var18 = var14 - 15;
        int var17 = (int) ((var16.totalMemory() - var16.freeMemory()) / 1024L);
        if (var17 > 65536) {
            var15 = 16711680;
        }
        class102.field1355.method2263("Mem:" + var17 + "k", var13, var18, var15, -1);
        var14 = var18 - 15;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lvl;Z)Lah;", line = 175)
    public static final class170 method273(class6 arg0, boolean arg1) {
        field445++;
        if (arg1) {
            field450 = (class136) null;
        }
        return new class170(arg0.method78((byte) -83), arg0.method78((byte) -82), arg0.method78((byte) -72), arg0.method78((byte) -117), arg0.method78((byte) -76), arg0.method78((byte) -35), arg0.method78((byte) -115), arg0.method78((byte) -84), arg0.method31(-22888), arg0.method58(-288140008));
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)I", line = 189)
    public static final int method274(int arg0, int arg1, int arg2) {
        field448++;
        int var3 = class157.method1144((byte) 72, arg2 - 1, arg1 + -1) - (-class157.method1144((byte) 72, arg2 + 1, arg1 + -1) - class157.method1144((byte) 72, arg2 - 1, arg1 + 1)) + class157.method1144((byte) 72, arg2 + 1, arg1 + 1);
        int var4 = class157.method1144((byte) 72, arg2 - 1, arg1) - (-class157.method1144((byte) 72, arg2 + 1, arg1) - class157.method1144((byte) 72, arg2, arg1 - 1) - class157.method1144((byte) 72, arg2, arg0 + arg1));
        int var5 = class157.method1144((byte) 72, arg2, arg1);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }
}
