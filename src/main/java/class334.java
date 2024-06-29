import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class334 extends class47 {

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public int field4577 = -1;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "Lll;")
    public static class248 field4581 = new class248("WTQA", 2);

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field4584 = 0;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public int field4576;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "J")
    public static long field4583;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "Laq;")
    public static class385 field4585;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Lclient;")
    public static client field4582;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Ljava/lang/String;")
    public String field4575;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "Ljava/lang/String;")
    public String field4579;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1984(byte arg0) {
        ++field4578;
        if (class197.field2807 == null) {
            class197.field2807 = new int[65536];
            double var1 = -0.015D + Math.random() * 0.03D + 0.7D;
            if (arg0 >= 83) {
                int var3 = 0;
                for (int var4 = 0; ~var4 > -513; ++var4) {
                    float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                    float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                    for (int var7 = 0; var7 < 128; ++var7) {
                        float var8 = (float) var7 / 128.0F;
                        float var9 = 0.0F;
                        float var10 = 0.0F;
                        float var11 = 0.0F;
                        float var12 = var5 / 60.0F;
                        int var13 = (int) var12;
                        int var14 = var13 % 6;
                        float var15 = var12 - (float) var13;
                        float var16 = (-var6 + 1.0F) * var8;
                        float var17 = (1.0F - var6 * var15) * var8;
                        float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                        if (var14 == 0) {
                            var10 = var18;
                            var9 = var8;
                            var11 = var16;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var9 = var16;
                                var10 = var8;
                                var11 = var18;
                            } else if (~var14 == -4) {
                                var11 = var8;
                                var9 = var16;
                                var10 = var17;
                            } else if (var14 == 4) {
                                var10 = var16;
                                var9 = var18;
                                var11 = var8;
                            } else if (var14 == 5) {
                                var10 = var16;
                                var11 = var17;
                                var9 = var8;
                            }
                        } else {
                            var10 = var8;
                            var9 = var17;
                            var11 = var16;
                        }
                        float var19 = (float) Math.pow((double) var9, var1);
                        float var20 = (float) Math.pow((double) var10, var1);
                        float var21 = (float) Math.pow((double) var11, var1);
                        int var22 = (int) (var19 * 256.0F);
                        int var23 = (int) (var20 * 256.0F);
                        int var24 = (int) (var21 * 256.0F);
                        int var25 = -16777216 - (-(var22 << 16) - ((var23 << 8) + var24));
                        class197.field2807[var3++] = var25;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V", line = 129)
    public static final void method1985(int arg0) {
        ++field4580;
        class356.method2141(-120, class146.field2070);
        ++class105.field1508;
        if (class454.field6273 && class235.field3328) {
            int var1 = class56.field902.method1301(13820);
            int var2 = 98 % ((arg0 - -27) / 49);
            int var3 = class56.field902.method1305(255);
            int var4 = var1 - class465.field6532;
            int var5 = var3 - class106.field1516;
            if (~class317.field4305 < ~var4) {
                var4 = class317.field4305;
            }
            if (class317.field4305 - -class128.field1819.field5101 < var4 - -class146.field2070.field5101) {
                var4 = class317.field4305 + class128.field1819.field5101 + -class146.field2070.field5101;
            }
            if (class381.field5402 > var5) {
                var5 = class381.field5402;
            }
            if (~(class146.field2070.field5200 + var5) < ~(class381.field5402 + class128.field1819.field5200)) {
                var5 = class381.field5402 - -class128.field1819.field5200 + -class146.field2070.field5200;
            }
            int var6 = var4 - -class128.field1819.field5111 + -class317.field4305;
            int var7 = -class381.field5402 + var5 + class128.field1819.field5186;
            if (class56.field902.method1302((byte) 36)) {
                if (class146.field2070.field5073 < class105.field1508) {
                    int var8 = -class235.field3323 + var4;
                    int var9 = -class114.field1608 + var5;
                    if (class146.field2070.field5085 < var8 || var8 < -class146.field2070.field5085 || class146.field2070.field5085 < var9 || var9 < -class146.field2070.field5085) {
                        class195.field2769 = true;
                    }
                }
                if (class146.field2070.field5066 != null && class195.field2769) {
                    class32 var10 = new class32();
                    var10.field518 = class146.field2070.field5066;
                    var10.field514 = var7;
                    var10.field511 = var6;
                    var10.field517 = class146.field2070;
                    class212.method1331(var10);
                    return;
                }
            } else {
                if (class195.field2769) {
                    if (class146.field2070.field5124 != null) {
                        class32 var11 = new class32();
                        var11.field521 = class411.field5699;
                        var11.field514 = var7;
                        var11.field518 = class146.field2070.field5124;
                        var11.field517 = class146.field2070;
                        var11.field511 = var6;
                        class212.method1331(var11);
                    }
                    if (class411.field5699 != null && client.method2329(class146.field2070) != null) {
                        class355.method2133(2, class411.field5699, class146.field2070);
                    }
                } else if ((~class337.field4618 == -2 || class126.method763((byte) 125)) && class161.field2310 > 2) {
                    class79.method544(class106.field1516 - -class114.field1608, class465.field6532 + class235.field3323, 0);
                } else if (class471.method2758(0)) {
                    class79.method544(class114.field1608 + class106.field1516, class465.field6532 - -class235.field3323, 0);
                }
                class146.field2070 = null;
            }
        } else {
            if (~class105.field1508 < -2) {
                class146.field2070 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V", line = 250)
    public static final void method1986(int arg0) {
        ++field4574;
        class292.field4007.method1570(arg0 + -8739);
        if (arg0 != 8776) {
            field4582 = null;
        }
        for (int var1 = 0; var1 < 32; ++var1) {
            class137.field1943[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class99.field1400[var2] = 0L;
        }
        class199.field2850 = 0;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 276)
    public static void method1987(byte arg0) {
        field4582 = null;
        field4581 = null;
        field4585 = null;
        if (arg0 != -105) {
            method1984((byte) -15);
        }
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)Lvq;", line = 291)
    public final class486 method1988(int arg0) {
        ++field4572;
        return arg0 > -17 ? null : class96.field1382[super.field758];
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V", line = 303)
    public static final void method1989(int arg0) {
        ++field4573;
        int var1 = class59.field930.length;
        int var2 = 0;
        if (arg0 != -1) {
            method1986(110);
        }
        while (var1 > var2) {
            if (class59.field930[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class167.field2455; ++var4) {
                    if (~class490.field6908[var2] == ~class280.field3860[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class280.field3860[class167.field2455] = class490.field6908[var2];
                    var3 = class167.field2455++;
                }
                class425 var5 = new class425(class59.field930[var2]);
                int var6 = 0;
                while (var5.field5830 < class59.field930[var2].length && var6 < 511 && ~class32.field520 > -1024) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2508(true);
                    int var9 = var8 >> 14;
                    int var10 = (8068 & var8) >> 7;
                    int var11 = 63 & var8;
                    int var12 = (class490.field6908[var2] >> 8) * 64 - class153.field2204 + var10;
                    int var13 = (255 & class490.field6908[var2]) * 64 + -class325.field4472 + var11;
                    class127 var14 = class467.field6550.method1359(var5.method2508(true), true);
                    if (class256.field3581[var7] == null && ~(var14.field1751 & 1) < -1 && class480.field6794 == var9 && ~var12 <= -1 && var14.field1786 + var12 < class200.field2875 && ~var13 <= -1 && var14.field1786 + var13 < class422.field5811) {
                        class256.field3581[var7] = new class196();
                        class256.field3581[var7].field1119 = var7;
                        class196 var15 = class256.field3581[var7];
                        class42.field718[class32.field520++] = var7;
                        var15.field1090 = class356.field4972;
                        var15.method1248(var14, -2);
                        var15.method506(-64, var15.field2789.field1786);
                        var15.field1063 = var15.field2789.field1806 << 3;
                        if (var15.field1063 == 0) {
                            var15.method511(arg0 + -14422, 0);
                        } else {
                            var15.method511(arg0 + -14422, 15074 & var15.field2789.field1796 - -4 << 11);
                        }
                        var15.method1251(var15.method206(0), var13, var9, (byte) 91, true, var12);
                    }
                }
            }
            ++var2;
        }
    }
}
