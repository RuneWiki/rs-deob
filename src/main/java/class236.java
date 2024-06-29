import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class236 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public static int[] field3572 = new int[14];

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
    public static int[] field3573 = new int[8];

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Z")
    public static boolean field3576;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1418(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3574++;
        if (class321.field4830 == null) {
            class345.field5116.method1943(arg4, -16777216, arg2, arg1, arg3 ^ 0x4FC0, arg5);
        } else if (class286.field4329.field3218 >= 0 && (class150.field2422 * 128) > class286.field4329.field3218 && class286.field4329.field3222 >= 0 && class286.field4329.field3222 < (class21.field272 * 128)) {
            class338.field5055++;
            if (class286.field4329 != null && (class286.field4329.field3218 - ((class286.field4329.method337(arg3 ^ 0x4FC1) - 1) * 64) >> 7) == class402.field5846 && (class286.field4329.field3222 + 64 - class286.field4329.method337(0) * 64 >> 7) == class312.field4695) {
                class402.field5846 = -1;
                class312.field4695 = -1;
                class228.method1375((byte) -49);
            }
            class362.method2198(3);
            if (!arg0) {
                class165.method1042((byte) -118);
            }
            class193.method1203(true);
            class244.method1467(true, arg5, arg3 ^ 0x6223, arg2, arg4, arg1);
            int var6 = class157.field2472;
            int var7 = class100.field1815;
            int var8 = class139.field2287;
            int var9 = class384.field5590;
            if (class408.field5928 == 1) {
                int var10 = (int) class376.field5483;
                if ((class175.field2744 >> 8) > var10) {
                    var10 = class175.field2744 >> 8;
                }
                if (class169.field2628[4] && var10 < class307.field4646[4] + 128) {
                    var10 = class307.field4646[4] + 128;
                }
                int var11 = (int) class23.field289 + class388.field5620 & 0x3FFF;
                class423.method2475(class7.method38(class286.field4329.field3218, class362.field5339, class286.field4329.field3222, (byte) -54) - 50, class394.field5754, arg3 ^ 0xFFFFB013, class10.field132, var11, var7, var10, ((var10 >> 3) * 3) + 600 << 0);
            } else if (class408.field5928 == 4) {
                int var12 = (int) class376.field5483;
                if (class175.field2744 >> 8 > var12) {
                    var12 = class175.field2744 >> 8;
                }
                if (class169.field2628[4] && class307.field4646[4] + 128 > var12) {
                    var12 = class307.field4646[4] + 128;
                }
                int var13 = (int) class23.field289 & 0x3FFF;
                class423.method2475(class7.method38(class158.field2488, class362.field5339, class493.field7515, (byte) -54) - 50, class394.field5754, -46, class10.field132, var13, var7, var12, (var12 >> 3) * 3 + 600 << 0);
            } else if (class408.field5928 == 5) {
                class241.method1446(-5120, var7);
            }
            int var14 = class243.field3655;
            int var15 = class288.field4373;
            int var16 = class290.field4403;
            int var17 = class456.field6999;
            int var18 = class16.field226;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class169.field2628[var19]) {
                    int var22 = (int) (Math.random() * (double) (class39.field521[var19] * 2 + 1) + Math.sin((double) class279.field4246[var19] / 100.0D * (double) class189.field3020[var19]) * (double) class307.field4646[var19] - (double) class39.field521[var19]);
                    if (var19 == 3) {
                        class16.field226 = class16.field226 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class288.field4373 += var22;
                    }
                    if (var19 == 0) {
                        class243.field3655 += var22;
                    }
                    if (var19 == 4) {
                        class456.field6999 += var22;
                        if (class456.field6999 < 1024) {
                            class456.field6999 = 1024;
                        } else if (class456.field6999 > 3072) {
                            class456.field6999 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class290.field4403 += var22;
                    }
                }
            }
            if (class243.field3655 < 0) {
                class243.field3655 = 0;
            }
            if (class243.field3655 > (class377.field5492 << 7) - 1) {
                class243.field3655 = (class377.field5492 << 7) - 1;
            }
            if (class290.field4403 < 0) {
                class290.field4403 = 0;
            }
            if (((class347.field5132 << 7) - 1) < class290.field4403) {
                class290.field4403 = (class347.field5132 << 7) - 1;
            }
            class488.method2932(-107);
            class504.method3017(arg3 - 20417);
            class345.field5116.method1982(var8, var6, var8 + var9, var6 + var7);
            class345.field5116.method1964();
            int var20 = class73.field1311;
            if (class96.field1741 == null) {
                class345.field5116.method1965(var20);
            } else {
                class96.field1741.method293(-1, class16.field226, var20, class345.field5116, var8, class366.field5378 << 3, var6, var9, var7, class456.field6999);
            }
            class233.method1400(false);
            class378.field5533.method192(class243.field3655, class288.field4373, class290.field4403, -class456.field6999 & 0x3FFF, -class16.field226 & 0x3FFF, -class211.field3284 & 0x3FFF);
            class345.field5116.method1921(class378.field5533);
            class345.field5116.method1931(var9 / 2 + var8, var7 / 2 + var6, class21.field270 << 1, class21.field270 << 1);
            class99.method748(116, var7 / 2 + var6, class21.field270 << 1, var9 / 2 + var8, class21.field270 << 1);
            class505.method3019(class288.field4373, -class16.field226 & 0x3FFF, class243.field3655, -class211.field3284 & 0x3FFF, arg3 - 20300, -class456.field6999 & 0x3FFF, class290.field4403);
            byte var21 = class463.field7116.method84(class30.field395, (byte) 90) == 2 ? (byte) class338.field5055 : 1;
            if (arg3 == 20417) {
                class224.method1358(class345.field5116, class369.field5424, class314.field4743, class378.field5533, class243.field3655, class288.field4373, class290.field4403, class64.field1061, class252.field3852, class248.field3802, class197.field3100, class96.field1707, class158.field2493, class286.field4329.field3217 + 1, var21, class286.field4329.field3218 >> 7, class286.field4329.field3222 >> 7, !class463.field7116.field2964);
                class233.method1400(false);
                if (client.field2992 == 30) {
                    class272.method1649(256, var9, (byte) -75, var6, var7, 256, var8);
                    class437.method2553(256, 256, var8, var6, var7, var9, 0);
                    class440.method2570(true, 256, var9, var6, 256, var8, var7);
                    class85.method598(var6, var9, var7, var8, (byte) -94);
                }
                class359.method2189();
                class243.field3655 = var14;
                class16.field226 = var18;
                class290.field4403 = var16;
                class456.field6999 = var17;
                class288.field4373 = var15;
                if (class394.field5749 && class284.field4297.method2860((byte) -53) == 0) {
                    class394.field5749 = false;
                }
                if (class394.field5749) {
                    class345.field5116.method1943(var8, -16777216, var6, var7, 1, var9);
                    class277.method1681(false, class217.field3343, class494.field7520.method2473(class406.field5898, -120), (byte) 22);
                }
            }
        } else {
            class345.field5116.method1943(arg4, -16777216, arg2, arg1, arg3 ^ 0x4FC0, arg5);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method1419(boolean arg0) {
        field3572 = null;
        if (arg0) {
            field3573 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public static final void method1420(int arg0, int arg1) {
        class146.field2361 = arg1;
        field3575++;
        int var2 = -61 / ((arg0 + 34) / 46);
        class394.field5752.method1761(-111);
    }
}
