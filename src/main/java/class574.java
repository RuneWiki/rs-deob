import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class574 {

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "Lwu;")
    public static class557 field8111;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)I")
    public static final int method3419(int arg0, int arg1, int arg2) {
        field8109++;
        byte var3;
        if (arg2 > 20000) {
            var3 = 4;
            class220.method1437(0);
        } else if (arg2 > 10000) {
            class72.method460(-105);
            var3 = 3;
        } else if (arg2 <= 5000) {
            var3 = 1;
            class144.method942(10, true);
        } else {
            class668.method3825(-7220);
            var3 = 2;
        }
        if (arg1 != 10) {
            field8108 = -55;
        }
        if (arg0 != class674.field9500.field5158.method1006(0)) {
            class674.field9500.method2250((byte) 124, arg0, class674.field9500.field5118);
            class736.method4088((byte) 122, false, arg0);
        }
        class199.method1350(-26159);
        return var3;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
    public static void method3420(byte arg0) {
        field8111 = null;
        if (arg0 != 99) {
            field8108 = -88;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lha;Ld;I)V")
    public static final void method3421(class545 arg0, class268 arg1, int arg2) {
        field8110++;
        if (class531.field7428 == null) {
            return;
        }
        if (class265.field3619 < 10) {
            if (!class531.field7425.method3343(-24230, class531.field7428.field7269)) {
                class265.field3619 = class378.field5267.method3308(class531.field7428.field7269, 100) / 10;
                return;
            }
            class532.method3177(34963);
            class265.field3619 = 10;
        }
        if (class265.field3619 == 10) {
            class531.field7452 = class531.field7428.field7266 >> 6 << 6;
            class531.field7447 = class531.field7428.field7264 >> 6 << 6;
            class531.field7449 = (class531.field7428.field7271 >> 6 << 6) + 64 - class531.field7452;
            class531.field7442 = (class531.field7428.field7255 >> 6 << 6) + 64 - class531.field7447;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class531.field7428.method3093(var3, class473.field6483.field9501, (class473.field6483.field9490 >> 9) + class179.field2535, true, (class473.field6483.field9489 >> 9) + class510.field7109)) {
                var4 = var3[1] - class531.field7447;
                var5 = var3[2] - class531.field7452;
            }
            if (!class670.field9423 && var4 >= 0 && var4 < class531.field7442 && var5 >= 0 && var5 < class531.field7449) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class538.field7524 = var7;
                class29.field372 = var6;
            } else if (class282.field3746 == -1 || class471.field6465 == -1) {
                class531.field7428.method3091(var3, 12800, class531.field7428.field7260 & 0x3FFF, (class531.field7428.field7260 & 0xFFFE81E) >> 14);
                class29.field372 = var3[2] - class531.field7452;
                class538.field7524 = var3[1] - class531.field7447;
            } else {
                class531.field7428.method3091(var3, 12800, class471.field6465, class282.field3746);
                class471.field6465 = -1;
                class282.field3746 = -1;
                class670.field9423 = false;
                if (var3 != null) {
                    class538.field7524 = var3[1] - class531.field7447;
                    class29.field372 = var3[2] - class531.field7452;
                }
            }
            if (class531.field7428.field7267 == 37) {
                class531.field7430 = 3.0F;
                class531.field7438 = 3.0F;
            } else if (class531.field7428.field7267 == 50) {
                class531.field7430 = 4.0F;
                class531.field7438 = 4.0F;
            } else if (class531.field7428.field7267 == 75) {
                class531.field7430 = 6.0F;
                class531.field7438 = 6.0F;
            } else if (class531.field7428.field7267 == 100) {
                class531.field7430 = 8.0F;
                class531.field7438 = 8.0F;
            } else if (class531.field7428.field7267 == 200) {
                class531.field7430 = 16.0F;
                class531.field7438 = 16.0F;
            } else {
                class531.field7430 = 8.0F;
                class531.field7438 = 8.0F;
            }
            class531.field7434 = (int) class531.field7430 >> 1;
            class531.field7431 = class524.method3131(class531.field7434, 0);
            class577.method3446((byte) -128);
            class531.method3173();
            class19.field235 = new class522();
            class531.field7433 += (int) (Math.random() * 5.0D) - 2;
            if (class531.field7433 < -8) {
                class531.field7433 = -8;
            }
            class531.field7436 += (int) (Math.random() * 5.0D) - 2;
            if (class531.field7433 > 8) {
                class531.field7433 = 8;
            }
            if (class531.field7436 < -16) {
                class531.field7436 = -16;
            }
            if (class531.field7436 > 16) {
                class531.field7436 = 16;
            }
            class531.method3155(arg1, class531.field7433 >> 2 << 10, class531.field7436 >> 1);
            class531.field7421.method1975(1024, -18, 256);
            class531.field7426.method897(256, (byte) -77, 256);
            class531.field7429.method3187(50, 4096);
            class62.field836.method1660(256, false);
            class265.field3619 = 20;
        } else if (class265.field3619 == 20) {
            class72.method461(26985, true);
            class531.method3161(arg0, class531.field7433, class531.field7436);
            class265.field3619 = 60;
            class72.method461(26985, true);
            class83.method497((byte) 73);
        } else if (class265.field3619 == 60) {
            if (class531.field7425.method3310(0, class531.field7428.field7269 + "_staticelements")) {
                if (!class531.field7425.method3343(-24230, class531.field7428.field7269 + "_staticelements")) {
                    return;
                }
                class531.field7439 = class259.method1609((byte) -110, class531.field7428.field7269 + "_staticelements", class531.field7425, class191.field2769);
            } else {
                class531.field7439 = new class458(0);
            }
            class531.method3157();
            class265.field3619 = 70;
            class72.method461(26985, true);
            class83.method497((byte) 104);
        } else if (class265.field3619 == 70) {
            class701.field9761 = new class443(arg0, 11, true, class438.field6016);
            class265.field3619 = 73;
            class72.method461(26985, true);
            class83.method497((byte) 56);
        } else if (class265.field3619 == 73) {
            class108.field1545 = new class443(arg0, 12, true, class438.field6016);
            class265.field3619 = 76;
            class72.method461(26985, true);
            class83.method497((byte) 59);
        } else if (class265.field3619 == 76) {
            class501.field7005 = new class443(arg0, 14, true, class438.field6016);
            class265.field3619 = 79;
            class72.method461(26985, true);
            class83.method497((byte) 101);
        } else if (class265.field3619 == 79) {
            class433.field5944 = new class443(arg0, 17, true, class438.field6016);
            class265.field3619 = 82;
            class72.method461(26985, true);
            class83.method497((byte) 72);
        } else if (class265.field3619 == 82) {
            class480.field6526 = new class443(arg0, 19, true, class438.field6016);
            class265.field3619 = 85;
            class72.method461(26985, true);
            class83.method497((byte) 81);
        } else if (class265.field3619 == 85) {
            class164.field2259 = new class443(arg0, 22, true, class438.field6016);
            class265.field3619 = 88;
            class72.method461(26985, true);
            class83.method497((byte) 59);
        } else if (class265.field3619 == 88) {
            class192.field2795 = new class443(arg0, 26, true, class438.field6016);
            class265.field3619 = 91;
            class72.method461(26985, true);
            class83.method497((byte) 114);
        } else {
            class151.field2090 = new class443(arg0, 30, true, class438.field6016);
            class265.field3619 = 100;
            if (arg2 >= -104) {
                field8111 = null;
            }
            class72.method461(26985, true);
            class83.method497((byte) 60);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3422(int arg0, String arg1) {
        field8112++;
        class686.field9626 = arg1;
        if (class622.field8847 == null) {
            return;
        }
        try {
            String var2 = class622.field8847.getParameter("cookieprefix");
            String var3 = class622.field8847.getParameter("cookiehost");
            if (arg0 != 3) {
                method3421(null, null, -83);
            }
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class372.method2233(-23024, class224.method1457((byte) -62) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class208.method1377("document.cookie=\"" + var5 + "\"", (byte) -110, class622.field8847);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!bfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8107++;
        throw new IllegalStateException();
    }
}
