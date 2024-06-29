import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class49 {

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "[[S")
    public static short[][] field743 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Lnn;")
    public static class214 field740 = new class214(7, 7);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "F")
    public static float field738;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Leca;")
    public static class378 field739;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static void method434(int arg0) {
        int var1 = -18 % ((arg0 + 59) / 49);
        field739 = null;
        field740 = null;
        field743 = null;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIZII)V")
    public static final void method435(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field741++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        int var6 = arg5 - 334;
        if (arg4 != 5674) {
            field740 = null;
        }
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class132.field2133 - class468.field6746) * var6 / 100 + class468.field6746;
        if (class606.field8628 > var7) {
            var7 = class606.field8628;
        } else if (class559.field7928 < var7) {
            var7 = class559.field7928;
        }
        int var8 = var7 * 512 * arg5 / (arg0 * 334);
        if (var8 < class274.field4012) {
            short var9 = class274.field4012;
            var7 = arg0 * 334 * var9 / (arg5 * 512);
            if (class559.field7928 < var7) {
                var7 = class559.field7928;
                int var10 = arg5 * var7 * 512 / (var9 * 334);
                int var11 = (arg0 - var10) / 2;
                if (arg3) {
                    class159.field2378.method657();
                    class159.field2378.method1159(-16777216, arg5, arg1, arg2, (byte) 96, var11);
                    class159.field2378.method1159(-16777216, arg5, arg1, arg0 + arg2 - var11, (byte) -97, var11);
                }
                arg0 -= var11 * 2;
                arg2 += var11;
            }
        } else if (var8 > class602.field8570) {
            short var12 = class602.field8570;
            var7 = var12 * 334 * arg0 / (arg5 * 512);
            if (var7 < class606.field8628) {
                var7 = class606.field8628;
                int var13 = arg0 * 334 * var12 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg3) {
                    class159.field2378.method657();
                    class159.field2378.method1159(-16777216, var14, arg1, arg2, (byte) -70, arg0);
                    class159.field2378.method1159(-16777216, var14, arg1 - (var14 - arg5), arg2, (byte) 94, arg0);
                }
                arg1 += var14;
                arg5 -= var14 * 2;
            }
        }
        class10.field113 = (short) arg0;
        class233.field3435 = arg2;
        class401.field6002 = (short) arg5;
        class108.field1805 = arg5 * var7 / 334;
        class285.field4160 = arg1;
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)V")
    public static final void method436(int arg0) {
        field742++;
        class234.field3439 = 0;
        boolean var1 = class52.field761.method1744(34) == 1;
        int var2 = class52.field761.method1723((byte) 116);
        int var3 = class52.field761.method1750(true);
        int var4 = class52.field761.method1701(255);
        class244.method1551(3);
        class444.method2625(false, var4);
        int var5 = (class541.field7525 - class52.field761.field3913) / 16;
        class210.field2969 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class210.field2969[var6][var10] = class52.field761.method1748(-120);
            }
        }
        class142.field2215 = new int[var5];
        if (arg0 <= 13) {
            method436(-61);
        }
        class179.field2602 = new byte[var5][];
        class543.field7574 = null;
        class648.field9390 = new byte[var5][];
        class43.field584 = new int[var5];
        class166.field2426 = new byte[var5][];
        class443.field6477 = new int[var5];
        class469.field6758 = null;
        class142.field2219 = new int[var5];
        class563.field8070 = new byte[var5][];
        class265.field3877 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class146.field2247 >> 4)) / 8; var8 <= (((class146.field2247 >> 4) + var2) / 8); var8++) {
            for (int var9 = (var3 - (class66.field990 >> 4)) / 8; var9 <= (var3 + (class66.field990 >> 4)) / 8; var9++) {
                class43.field584[var7] = (var8 << 8) + var9;
                class265.field3877[var7] = class597.field8501.method3195(0, "m" + var8 + "_" + var9);
                class142.field2215[var7] = class597.field8501.method3195(0, "l" + var8 + "_" + var9);
                class142.field2219[var7] = class597.field8501.method3195(0, "um" + var8 + "_" + var9);
                class443.field6477[var7] = class597.field8501.method3195(0, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class159.method1125(10, var1, var3, 119, var2);
    }
}
