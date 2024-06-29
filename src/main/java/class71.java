import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class71 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1392 = 0;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lie;")
    public static class117 field1391 = new class117(64);

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lia;")
    public static class257 field1401 = class28.method234(-51, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Ljb;")
    public static class107 field1399;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "[I")
    public static int[] field1402;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static final void method534(int arg0) {
        class25.field479 &= 0x7FF;
        field1395++;
        int var1 = class95.field1801 >> 7;
        int var2 = class238.field4099 >> 7;
        if (class243.field4212 < 128) {
            class243.field4212 = 128;
        }
        int var3 = 0;
        if (class243.field4212 > arg0) {
            class243.field4212 = 383;
        }
        int var4 = class109.method803(class189.field3261, class238.field4099, (byte) 104, class95.field1801);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class189.field3261;
                    if (var7 < 3 && (class233.field4007[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class243.field4208[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class94.field1785 < var9) {
            class94.field1785 += (var9 - class94.field1785) / 24;
        } else if (class94.field1785 > var9) {
            class94.field1785 += (var9 - class94.field1785) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method535(boolean arg0) {
        field1399 = null;
        if (arg0) {
            method536(107, -35, -101, 23, 61, 111);
        }
        field1402 = null;
        field1391 = null;
        field1401 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)V")
    public static final void method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1394++;
        int var6 = arg3 - arg1;
        int var7 = arg4 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class181.method1242(arg4, arg1, arg2, arg0 ^ 0x283AA0A9, arg5);
            }
        } else if (var7 == 0) {
            class151.method1013(arg1, arg5, arg2, (byte) -114, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class123.field2211 > arg3) {
                var11 = class123.field2211;
                var10 = (class123.field2211 * var8 >> 12) + var9;
            } else if (arg3 <= class145.field2540) {
                var10 = arg4;
                var11 = arg3;
            } else {
                var11 = class145.field2540;
                var10 = (class145.field2540 * var8 >> 12) + var9;
            }
            if (class40.field834 > var10) {
                var10 = class40.field834;
                var11 = (class40.field834 - var9 << 12) / var8;
            } else if (class255.field4371 < var10) {
                var10 = class255.field4371;
                var11 = (class255.field4371 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class123.field2211 > arg1) {
                var12 = (class123.field2211 * var8 >> 12) + var9;
                var13 = class123.field2211;
            } else if (arg1 <= class145.field2540) {
                var13 = arg1;
                var12 = arg5;
            } else {
                var13 = class145.field2540;
                var12 = (class145.field2540 * var8 >> 12) + var9;
            }
            if (var12 < class40.field834) {
                var12 = class40.field834;
                var13 = (class40.field834 - var9 << 12) / var8;
            } else if (class255.field4371 < var12) {
                var12 = class255.field4371;
                var13 = (class255.field4371 - var9 << 12) / var8;
            }
            if (arg0 != -674930900) {
                method535(true);
            }
            class152.method1061(var10, -1, var13, var12, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public static final void method537(int arg0) {
        field1393++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class199.field3407 - 1); var2++) {
                if (class32.field616[var2] < 1000 && class32.field616[var2 + 1] > 1000) {
                    var1 = false;
                    class257 var3 = class92.field1757[var2];
                    class92.field1757[var2] = class92.field1757[var2 + 1];
                    class92.field1757[var2 + 1] = var3;
                    class257 var4 = class19.field397[var2];
                    class19.field397[var2] = class19.field397[var2 + 1];
                    class19.field397[var2 + 1] = var4;
                    int var5 = class12.field236[var2];
                    class12.field236[var2] = class12.field236[var2 + 1];
                    class12.field236[var2 + 1] = var5;
                    int var6 = class227.field3817[var2];
                    class227.field3817[var2] = class227.field3817[var2 + 1];
                    class227.field3817[var2 + 1] = var6;
                    short var7 = class32.field616[var2];
                    class32.field616[var2] = class32.field616[var2 + 1];
                    class32.field616[var2 + 1] = var7;
                    long var8 = class179.field3104[var2];
                    class179.field3104[var2] = class179.field3104[var2 + 1];
                    class179.field3104[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != 11915) {
            method536(72, 28, -116, -54, 120, -44);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static final void method538(byte arg0) {
        if (class96.field1805 != null) {
            class96.field1805.detach();
        }
        class25.method220(class156.field2728, -26569);
        field1390++;
        class7.method107(class156.field2728, false);
        if (class114.field2059 != null) {
            class114.field2059.method104((byte) -125, class156.field2728);
        }
        if (arg0 != 35) {
            field1391 = null;
        }
        class238.method1569(65536);
        class149.method1008(arg0 + 6, class156.field2728);
        class134.method927(class156.field2728, 75);
        if (class114.field2059 != null) {
            class114.field2059.method105(class156.field2728, -98);
        }
        if (class96.field1805 != null && class133.field2383 != null) {
            class96.field1805.attach(class133.field2383);
        }
    }
}
