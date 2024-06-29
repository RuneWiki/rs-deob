import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class542 extends class159 {

    @OriginalMember(owner = "client!so", name = "o", descriptor = "Lwi;")
    public static class202 field7529 = new class202();

    @OriginalMember(owner = "client!so", name = "r", descriptor = "Lwi;")
    public static class202 field7532 = new class202();

    @OriginalMember(owner = "client!so", name = "w", descriptor = "[Lup;")
    public static class241[] field7537 = new class241[75];

    @OriginalMember(owner = "client!so", name = "t", descriptor = "Lkr;")
    public static class602 field7534 = new class602(34, -1);

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
    public static void method3204(int arg0) {
        if (arg0 == 146800640) {
            field7532 = null;
            field7534 = null;
            field7537 = null;
            field7529 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZII)V")
    public final void method367(boolean arg0, int arg1, int arg2) {
        ++field7528;
        if (!arg0) {
            field7537 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZB)V")
    public final void method373(boolean arg0, byte arg1) {
        ++field7525;
        super.field2221.method3702(true, true);
        if (arg1 > -109) {
            method3208((byte) 106, (String) null);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)Z")
    public final boolean method372(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field7523;
            return true;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BZ)V")
    public final void method370(byte arg0, boolean arg1) {
        if (arg0 >= 88) {
            ++field7533;
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
    public static final void method3205(int arg0) {
        class522.field7267.method3906(-102);
        ++field7524;
        int var1 = 47 % ((7 - arg0) / 39);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;Ldc;B)I")
    public static final int method3206(String arg0, class63 arg1, byte arg2) {
        ++field7536;
        int var3 = arg1.field956;
        if (arg2 != 30) {
            method3204(49);
        }
        byte[] var4 = class489.method2963(arg0, (byte) 99);
        arg1.method512(-1, var4.length);
        arg1.field956 += class325.field4495.method103(var4.length, arg1.field956, var4, (byte) 63, arg1.field954, 0);
        return -var3 + arg1.field956;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V")
    public static final void method3207(boolean arg0) {
        if (!arg0) {
            method3207(false);
        }
        ++field7535;
        if (class610.field8211 != null) {
            class610.field8211 = null;
            class282.method1882((byte) 34, class467.field6492, class479.field6657, class153.field2104, class530.field7345);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3208(byte arg0, String arg1) {
        if (arg0 >= -126) {
            field7529 = null;
        }
        ++field7530;
        class476.method2904(arg1, "", "", "", 0, -1, 0);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lwu;II)V")
    public final void method368(class559 arg0, int arg1, int arg2) {
        ++field7531;
        super.field2221.method3681(arg0, 0);
        super.field2221.method3720(-26014, arg2);
        if (arg1 != 26264) {
            this.method369((byte) 99);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIBLjava/lang/String;)V")
    public static final void method3209(boolean arg0, int arg1, byte arg2, String arg3) {
        ++field7527;
        class166.method1039(true);
        if (arg1 == 0) {
            class129.field1802 = class577.method3365(2 * class332.field4707.field4773.method2791(0), class570.field7875, class137.field1945, class267.field3902, 114, 0);
            if (arg3 != null) {
                class129.field1802.method273(0);
                class179 var4 = class506.method3043(0, class486.field6799, 126, class307.field4312);
                class402 var5 = class129.field1802.method1392(var4, class52.method381(class671.field9318, class486.field6799, 0), true);
                class680.method3835((byte) -73);
                class743.method4138(true, var5, arg3, var4, class129.field1802, (byte) 48);
            }
        } else {
            class548 var6 = null;
            if (arg3 != null) {
                var6 = class577.method3365(0, class570.field7875, class137.field1945, class267.field3902, 112, 0);
                var6.method273(0);
                class179 var7 = class506.method3043(0, class486.field6799, 24, class307.field4312);
                class402 var8 = var6.method1392(var7, class52.method381(class671.field9318, class486.field6799, 0), true);
                class680.method3835((byte) -73);
                class743.method4138(true, var8, arg3, var7, var6, (byte) 125);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class129.field1802 = class577.method3365(2 * class332.field4707.field4773.method2791(0), class570.field7875, class137.field1945, class267.field3902, 96, arg1);
                    if (arg3 != null) {
                        var6.method273(0);
                        class179 var9 = class506.method3043(0, class486.field6799, 76, class307.field4312);
                        class402 var10 = var6.method1392(var9, class52.method381(class671.field9318, class486.field6799, 0), true);
                        class680.method3835((byte) -73);
                        class743.method4138(true, var10, arg3, var9, var6, (byte) -48);
                    }
                    if (class129.field1802.method1387()) {
                        boolean var11 = true;
                        try {
                            var11 = ~class372.field5248.field8060 < -257;
                        } catch (Throwable var28) {
                        }
                        class257 var12;
                        if (!var11) {
                            var12 = class129.field1802.method1539(104857600);
                        } else {
                            var12 = class129.field1802.method1539(146800640);
                        }
                        class129.field1802.method1523(var12);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var13 = class332.field4707.field4789.method963(0);
                    if (var13 == 2) {
                        class88.field1244 = true;
                    }
                    class332.field4707.method2158(0, class332.field4707.field4789, -15);
                    method3209(arg0, var13, (byte) -99, arg3);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var6 != null) {
                            try {
                                var6.method3248((byte) -88);
                            } catch (Throwable var25) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method3248((byte) -88);
                    } catch (Throwable var26) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var6 != null) {
                try {
                    var6.method3248((byte) -88);
                } catch (Throwable var27) {
                }
            }
        }
        class332.field4707.field4789.method966(!arg0, 2);
        class332.field4707.method2158(arg1, class332.field4707.field4789, -15);
        class159.method996((byte) -76);
        class129.field1802.method1445(10000);
        class129.field1802.method1399(32);
        class243.field3618 = class129.field1802.method1495();
        class723.field10036 = class129.field1802.method1495();
        class166.method1035((byte) -20);
        class129.field1802.method1545(~class332.field4707.field4776.method3171(0) == -2);
        if (class129.field1802.method1446()) {
            class424.method2639(~class332.field4707.field4767.method431(0) == -2, 10);
        }
        class258.method1748(class277.field4036 >> 3, class129.field1802, (byte) 57, class667.field9202 >> 3);
        if (arg2 <= -79) {
            class124.method777((byte) -92);
            class641.field8597 = true;
            class726.field10056 = false;
            class535.field7420 = null;
            class110.method718(-1);
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
    public final void method369(byte arg0) {
        ++field7526;
        if (arg0 > -59) {
            this.method373(true, (byte) 66);
        }
        super.field2221.method3702(true, false);
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ldw;)V")
    public class542(class664 arg0) {
        super(arg0);
    }
}
