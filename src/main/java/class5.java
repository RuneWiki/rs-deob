import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lrd;")
    private static class114 field57 = class84.method656("Connecting to update server", (byte) 119);

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[Lrd;")
    public static class114[] field64 = new class114[200];

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lrd;")
    private static class114 field68 = class84.method656("M", (byte) 124);

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lrd;")
    public static class114 field62 = field57;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lrd;")
    private static class114 field70 = class84.method656("Login limit exceeded)3", (byte) 124);

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lrd;")
    public static class114 field56 = field68;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lrd;")
    public static class114 field72 = class84.method656(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 124);

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Z")
    public static boolean field75 = false;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lrd;")
    private static class114 field59 = class84.method656("Please try using a different world)3", (byte) 119);

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lrd;")
    public static class114 field60 = field59;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lrd;")
    public static class114 field61 = field59;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lrd;")
    public static class114 field67 = field59;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Lrd;")
    public static class114 field77 = field59;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lrd;")
    public static class114 field69 = field59;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lrd;")
    public static class114 field58 = field59;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lrd;")
    public static class114 field78 = field70;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lrd;")
    public static class114 field65 = class84.method656("0(U", (byte) 114);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lgb;")
    public static class45 field54;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
    public static final void method48(int arg0, byte arg1) {
        if (arg1 > -63) {
            method49(false, 3);
        }
        for (class130 var2 = (class130) class12.field248.method776((byte) 104); var2 != null; var2 = (class130) class12.field248.method782(-1)) {
            if ((long) arg0 == (var2.field1448 >> 48 & 0xFFFFL)) {
                var2.method540(-26669);
            }
        }
        field66++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)Lsa;")
    public static final class117 method49(boolean arg0, int arg1) {
        field74++;
        class117 var2 = (class117) class124.field2941.method194((byte) -71, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class143.field3401.method762(1, arg1, (byte) 66);
        class117 var4 = new class117();
        if (!arg0) {
            field56 = null;
        }
        if (var3 != null) {
            var4.method907(arg1, false, new class60(var3));
        }
        var4.method913(-22130);
        class124.field2941.method193(-93, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Z")
    public static final boolean method50(int arg0, boolean arg1) {
        field63++;
        if (!arg1) {
            return true;
        } else if (arg0 < 0) {
            return false;
        } else {
            int var2 = class117.field2734[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 7;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static final void method51(byte arg0) {
        if (arg0 < 54) {
            method50(-25, true);
        }
        field76++;
        Object var1 = class36.field751;
        synchronized (class36.field751) {
            if (class39.field818 == 0) {
                class36.field764.method309(5, (byte) -103, new class21());
            }
            class39.field818 = 600;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method52(int arg0) {
        field58 = null;
        field72 = null;
        field60 = null;
        field68 = null;
        field78 = null;
        field77 = null;
        field62 = null;
        field70 = null;
        field69 = null;
        field57 = null;
        field59 = null;
        field56 = null;
        field64 = null;
        if (arg0 == 1) {
            field54 = null;
            field65 = null;
            field61 = null;
            field67 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public static final void method53(byte arg0) {
        class77.field1752.method1056(-102);
        field55++;
        int var1 = class77.field1752.method1050((byte) 50, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class77.field1752.method1050((byte) 111, 2);
        if (var2 == 0) {
            class118.field2771[class48.field1004++] = 2047;
        } else if (var2 == 1) {
            int var3 = class77.field1752.method1050((byte) 57, 3);
            class7.field103.method254(false, var3, false);
            int var4 = class77.field1752.method1050((byte) 63, 1);
            if (var4 == 1) {
                class118.field2771[class48.field1004++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class77.field1752.method1050((byte) 56, 3);
            class7.field103.method254(true, var5, false);
            int var6 = class77.field1752.method1050((byte) 107, 3);
            class7.field103.method254(true, var6, false);
            int var7 = class77.field1752.method1050((byte) 105, 1);
            if (var7 == 1) {
                class118.field2771[class48.field1004++] = 2047;
            }
        } else {
            if (arg0 != 19) {
                field65 = null;
            }
            if (var2 == 3) {
                int var8 = class77.field1752.method1050((byte) 38, 1);
                int var9 = class77.field1752.method1050((byte) 117, 7);
                int var10 = class77.field1752.method1050((byte) 118, 1);
                if (var10 == 1) {
                    class118.field2771[class48.field1004++] = 2047;
                }
                class20.field346 = class77.field1752.method1050((byte) 112, 2);
                int var11 = class77.field1752.method1050((byte) 79, 7);
                class7.field103.method255((byte) -121, var8 == 1, var11, var9);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
    public static final void method54(int arg0, byte arg1) {
        if (arg0 == -3) {
            class13.method111(0, class102.field2366, class29.field600, field61);
        } else if (arg0 == -2) {
            class13.method111(0, class102.field2360, class102.field2391, class85.field1886);
        } else if (arg0 == -1) {
            class13.method111(0, class102.field2387, class101.field2312, field60);
        } else if (arg0 == 3) {
            class13.method111(0, class102.field2381, class102.field2345, class3.field32);
        } else if (arg0 == 4) {
            class13.method111(0, class102.field2364, class3.field35, class70.field1550);
        } else if (arg0 == 5) {
            class13.method111(0, class102.field2350, class104.field2430, class64.field1373);
        } else if (arg0 == 6) {
            class13.method111(0, class102.field2361, class65.field1415, class7.field93);
        } else if (arg0 == 7) {
            class13.method111(0, class102.field2356, class127.field3052, class21.field382);
        } else if (arg0 == 8) {
            class13.method111(0, class102.field2347, class120.field2798, class92.field2143);
        } else if (arg0 == 9) {
            class13.method111(0, class102.field2374, field78, class141.field3372);
        } else if (arg0 == 10) {
            class13.method111(0, class102.field2348, class120.field2811, class39.field817);
        } else if (arg0 == 11) {
            class13.method111(0, class102.field2354, class123.field2903, class26.field518);
        } else if (arg0 == 12) {
            class13.method111(0, class102.field2362, class36.field766, class73.field1632);
        } else if (arg0 == 13) {
            class13.method111(0, class102.field2378, class86.field1944, field67);
        } else if (arg0 == 14) {
            class13.method111(0, class102.field2370, class48.field1009, class111.field2592);
        } else if (arg0 == 16) {
            class13.method111(0, class102.field2380, class128.field3059, class111.field2595);
        } else if (arg0 == 17) {
            class13.method111(0, class102.field2397, class144.field3429, class145.field3447);
        } else if (arg0 == 18) {
            class13.method111(0, class102.field2357, class62.field1335, class55.field1167);
        } else if (arg0 == 19) {
            class13.method111(0, class21.field395, class11.field177, class72.field1589);
        } else if (arg0 == 20) {
            class13.method111(0, class102.field2395, class50.field1047, field58);
        } else if (arg0 == 22) {
            class13.method111(0, class102.field2384, class102.field2382, class74.field1689);
        } else if (arg0 == 23) {
            class13.method111(0, class102.field2390, class137.field3316, class111.field2586);
        } else if (arg0 == 24) {
            class13.method111(0, class102.field2398, class9.field127, class69.field1525);
        } else if (arg0 == 25) {
            class13.method111(0, class102.field2358, class120.field2815, field77);
        } else if (arg0 == 26) {
            class13.method111(0, class102.field2352, class12.field269, class14.field305);
        } else if (arg0 == 27) {
            class13.method111(0, class102.field2367, class102.field2379, class34.field687);
        } else {
            class13.method111(0, class102.field2359, class65.field1411, field69);
        }
        if (arg1 <= 18) {
            field72 = null;
        }
        class12.method101(false, 10);
        field71++;
    }
}
