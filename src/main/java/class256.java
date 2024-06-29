import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class256 {

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Lad;")
    public static class19 field3203 = new class19(5);

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "Lf;")
    public static class534 field3204;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static void method1516(int arg0) {
        field3204 = null;
        if (arg0 == 3250) {
            field3203 = null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BIIZI)V")
    public static final void method1517(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3202++;
        if (!arg3 && class43.field418 == arg2 && class613.field8628 == arg4 && class652.field9150 == class169.field1888 || class639.field9075.method2641(class430.field6109, (byte) 34)) {
            return;
        }
        class652.field9150 = class169.field1888;
        class43.field418 = arg2;
        class613.field8628 = arg4;
        if (class639.field9075.method2641(class430.field6109, (byte) 34)) {
            class652.field9150 = 0;
        }
        class585.method3308(arg1, 22731);
        class695.method3824(class198.field2297.method1195((byte) 62, class504.field7267), class701.field9813, class698.field9799, false, class436.field6153, true);
        int var5 = class26.field245;
        int var6 = class231.field2860;
        class26.field245 = (class43.field418 - (class142.field1574 >> 4)) * 8;
        class231.field2860 = (class613.field8628 - (class140.field1550 >> 4)) * 8;
        class79.field795 = class482.method2776(class43.field418 * 8, class613.field8628 * 8);
        class313.field3891 = null;
        int var7 = class26.field245 - var5;
        if (arg0 != 39) {
            method1516(-106);
        }
        int var8 = class231.field2860 - var6;
        if (arg1 == 11) {
            for (int var9 = 0; var9 < class53.field533; var9++) {
                class214 var10 = class653.field9160[var9];
                if (var10 != null) {
                    class600 var11 = var10.field2601;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field9517[var12] -= var7;
                        var11.field9513[var12] -= var8;
                    }
                    var11.field5179 -= var7 * 512;
                    var11.field5176 -= var8 * 512;
                }
            }
        } else {
            class651.field9144 = 0;
            boolean var13 = false;
            int var14 = class142.field1574 * 512 - 512;
            int var15 = class140.field1550 * 512 - 512;
            for (int var16 = 0; var16 < class53.field533; var16++) {
                class214 var29 = class653.field9160[var16];
                if (var29 != null) {
                    class600 var30 = var29.field2601;
                    var30.field5176 -= var8 * 512;
                    var30.field5179 -= var7 * 512;
                    if (var30.field5179 >= 0 && var14 >= var30.field5179 && var30.field5176 >= 0 && var15 >= var30.field5176) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field9517[var32] -= var7;
                            var30.field9513[var32] -= var8;
                            if (var30.field9517[var32] < 0 || class142.field1574 <= var30.field9517[var32] || var30.field9513[var32] < 0 || class140.field1550 <= var30.field9513[var32]) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class398.field5375[class651.field9144++] = var30.field9434;
                        } else {
                            var30.method3368((byte) 0, null);
                            var13 = true;
                            var29.method1922(127);
                        }
                    } else {
                        var30.method3368((byte) 16, null);
                        var29.method1922(94);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class53.field533 = class274.field3433.method3668(false);
                class274.field3433.method3675(class653.field9160, (byte) 114);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class236 var27 = class139.field1540[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field9517[var28] -= var7;
                    var27.field9513[var28] -= var8;
                }
                var27.field5179 -= var7 * 512;
                var27.field5176 -= var8 * 512;
            }
        }
        class99[] var18 = class497.field7195;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class99 var26 = var18[var19];
            if (var26 != null) {
                var26.field1070 -= var7 * 512;
                var26.field1063 -= var8 * 512;
            }
        }
        for (class323 var20 = (class323) class412.field5527.method3434((byte) 2); var20 != null; var20 = (class323) class412.field5527.method3430(true)) {
            var20.field3968 -= var8;
            var20.field3971 -= var7;
            if (class247.field3061 != 4 && (var20.field3971 < 0 || var20.field3968 < 0 || var20.field3971 >= class142.field1574 || class140.field1550 <= var20.field3968)) {
                var20.method1922(104);
            }
        }
        if (class247.field3061 != 4) {
            for (class310 var21 = (class310) class200.field2354.method3674(127); var21 != null; var21 = (class310) class200.field2354.method3672(arg0 - 40)) {
                int var22 = (int) (var21.field4176 & 0x3FFFL);
                int var23 = var22 - class26.field245;
                int var24 = (int) (var21.field4176 >> 14 & 0x3FFFL);
                int var25 = var24 - class231.field2860;
                if (var23 < 0 || var25 < 0 || class142.field1574 <= var23 || class140.field1550 <= var25) {
                    var21.method1922(107);
                }
            }
        }
        if (class248.field3078 != 0) {
            class184.field2065 -= var8;
            class248.field3078 -= var7;
        }
        class22.method99(-124);
        if (arg1 != 11) {
            class20.field161 -= var8;
            class516.field7360 -= var7 * 512;
            class538.field7583 -= var7;
            class518.field7375 -= var7;
            class689.field9698 -= var8 * 512;
            class152.field1684 -= var8;
            if (Math.abs(var7) > class142.field1574 || Math.abs(var8) > class140.field1550) {
                class173.method1055(1678);
            }
        } else if (class538.field7572 == 4) {
            class672.field9356 -= var7 * 512;
            class307.field3793 -= var8 * 512;
            class463.field6603 -= var7 * 512;
            class436.field6158 -= var8 * 512;
        } else {
            class538.field7572 = 1;
            class510.field7319 = -1;
            class307.field3791 = -1;
        }
        class666.method3693(arg0 ^ 0xFFFFFFB7);
        class527.method2968((byte) -26);
        class372.field5072.method3438(16);
        class375.field5107.method3438(16);
        class473.field6810.method1666((byte) 71);
        class99.method538(-123);
    }
}
