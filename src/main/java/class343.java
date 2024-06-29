import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class343 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field5462 = -1;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Ldf;")
    public static class171 field5466;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2417(boolean arg0) {
        if (!arg0) {
            field5463 = -55;
        }
        while (class29.field383.method2229(class223.field3706, 21256) >= 27) {
            int var1 = class29.field383.method2227(-27542, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class165.field2621[var1] == null) {
                class165.field2621[var1] = new class288();
                var2 = true;
            }
            class288 var3 = class165.field2621[var1];
            class330.field5253[class35.field508++] = var1;
            var3.field3550 = class332.field5261;
            if (var3.field4692 != null && var3.field4692.method961(false)) {
                class123.method969((byte) -123, var3);
            }
            int var4 = class279.field4584[class29.field383.method2227(-27542, 3)];
            if (var2) {
                var3.field3549 = var3.field3477 = var4;
            }
            var3.method2092(-1, class222.method1683(117, class29.field383.method2227(-27542, 14)));
            int var5 = class29.field383.method2227(-27542, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class29.field383.method2227(-27542, 5);
            int var7 = class29.field383.method2227(-27542, 1);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class330.field5248[class356.field5645++] = var1;
            }
            int var8 = class29.field383.method2227(-27542, 1);
            var3.method1635(var3.field4692.field2025, -1);
            var3.field3561 = var3.field4692.field2065;
            var3.field3514 = var3.field4692.field2050;
            if (var3.field3514 == 0) {
                var3.field3477 = 0;
            }
            var3.method1633(var8 == 1, class6.field55.field3519[0] + var6, var3.method1634(-1), class6.field55.field3553[0] + var5, 127);
            if (var3.field4692.method961(false)) {
                class340.method2386(0, var3, 0, class186.field2991, var3.field3519[0], (byte) -68, (class29) null, (class258) null, var3.field3553[0]);
            }
        }
        class29.field383.method2232(0);
        field5465++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I", line = 78)
    public static int method2418(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I", line = 88)
    public static final int method2419(int arg0, int arg1, int arg2, int arg3) {
        field5464++;
        if (arg0 >= -79) {
            field5463 = -67;
        }
        if (arg1 == arg2) {
            return arg2;
        } else {
            int var4 = 128 - arg3;
            int var5 = ((arg1 & 0xFF00FF00) >>> 7) * arg3 + (arg2 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
            int var6 = (arg1 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZLtf;I)Lml;", line = 109)
    public static final class17 method2420(int arg0, int arg1, int arg2, int arg3, boolean arg4, class115 arg5, int arg6) {
        field5461++;
        if (arg2 != 32767) {
            return (class17) null;
        }
        int var8 = (arg3 << 19) + (arg4 ? 65536 : 0) + (arg0 - -(arg6 << 17));
        long var9 = (long) arg1 * 3147483667L + (long) var8 * 3849834839L;
        class17 var11 = (class17) class323.field5150.method2329((byte) 107, var9);
        if (var11 != null) {
            return var11;
        }
        class153.field2443 = false;
        class17 var12 = class230.method1783(arg6, false, arg0, arg4, arg3, false, (byte) 84, arg5, arg1);
        if (var12 != null && !class153.field2443) {
            class323.field5150.method2333(var9, 0, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Z", line = 144)
    public static final boolean method2421(int arg0) {
        if (arg0 > -105) {
            field5462 = -28;
        }
        field5467++;
        if (class350.field5564) {
            try {
                class88.method702(class128.field2163.field2350, "showVideoAd", (byte) 109);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V", line = 168)
    public static void method2422(boolean arg0) {
        field5466 = null;
        if (arg0) {
            field5466 = (class171) null;
        }
    }
}
