import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 {

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2299 = 10;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    public static int[] field2289 = new int[50];

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lqf;")
    public static class117 field2297 = class72.method514(114, "Hidden)2use");

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2288 = -1;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lqf;")
    public static class117 field2290 = class72.method514(113, "(U3");

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lqf;")
    private static class117 field2291 = class72.method514(124, "Message");

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lqf;")
    public static class117 field2296 = class72.method514(109, "swe");

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2301 = 0;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lqf;")
    public static class117 field2302 = field2291;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Lqf;")
    public static class117 field2308 = class72.method514(120, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "Lqf;")
    public static class117 field2305 = class72.method514(108, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Lqf;")
    private static class117 field2309 = class72.method514(98, "Malformed login packet)3");

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lqf;")
    public static class117 field2298 = field2309;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lmf;")
    public static class89 field2304;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "[Lgb;")
    public static class45[] field2292;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method745(byte arg0) {
        field2308 = null;
        field2289 = null;
        field2304 = null;
        field2309 = null;
        field2298 = null;
        if (arg0 != -113) {
            field2308 = null;
        }
        field2296 = null;
        field2302 = null;
        field2292 = null;
        field2290 = null;
        field2297 = null;
        field2305 = null;
        field2291 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static final void method746(int arg0) {
        field2307++;
        if (!class18.field267) {
            return;
        }
        class77.field1693 = null;
        class97.field2355 = null;
        class128.field3040 = null;
        class32.field683 = null;
        class89.field2045 = null;
        class53.field1108 = null;
        class19.field304 = null;
        class153.field3776 = null;
        if (arg0 != 1282) {
            return;
        }
        class68.field1428 = null;
        class18.field272 = null;
        class117.field2826 = null;
        class19.field295 = null;
        class126.field2996 = null;
        class148.field3608 = null;
        class79.field1791 = null;
        class91.field2224 = null;
        class85.field1922 = null;
        class103.field2499 = null;
        class18.field267 = false;
        class42.field849 = null;
        class134.field3186 = null;
        class103.field2503 = null;
        class99.field2372 = null;
        class120.field2872 = null;
        class75.field1631 = null;
        class32.field691 = null;
        class76.field1666 = null;
        class140.field3322 = null;
        class103.field2501 = null;
        class4.field73 = null;
        class64.field1319 = null;
        class53.field1101 = null;
        class133.field3157 = null;
        class128.field3025 = null;
        class153.field3796 = null;
        class70.field1492 = null;
        class77.field1699 = null;
        class76.field1677 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)Z")
    public static final boolean method747(int arg0, int arg1, int arg2, int arg3) {
        field2295++;
        int var4 = arg0 >> 14 & 0x7FFF;
        int var5 = class19.field311.method848(class140.field3344, arg1, arg2, arg0);
        if (var5 == -1) {
            return false;
        }
        if (arg3 >= -51) {
            method745((byte) -17);
        }
        int var6 = var5 >> 6 & 0x3;
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class148 var8 = class23.method181((byte) -79, var4);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field3665;
                var9 = var8.field3649;
            } else {
                var9 = var8.field3665;
                var10 = var8.field3649;
            }
            int var11 = var8.field3646;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class81.method631(arg1, true, 0, (byte) -102, var9, 2, var10, 0, var11, arg2, class141.field3395.field2004[0], class141.field3395.field1970[0]);
        } else {
            class81.method631(arg1, true, var7 + 1, (byte) -102, 0, 2, 0, var6, 0, arg2, class141.field3395.field2004[0], class141.field3395.field1970[0]);
        }
        class4.field69 = class102.field2462;
        class16.field261 = 0;
        class124.field2922 = class153.field3788;
        class60.field1228 = 2;
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static final void method748(byte arg0) {
        if (arg0 >= -77) {
            field2294 = -33;
        }
        field2300++;
        client.field395 = new class153(32);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBI)V")
    public static final void method749(int arg0, byte arg1, int arg2) {
        field2303++;
        int var3 = 0;
        int var4 = 0;
        if (arg1 != 75) {
            field2308 = null;
        }
        while (var4 < 100) {
            if (class148.field3656[var4] != null) {
                int var5 = class68.field1423 + 4 + 70 - var3 * 14;
                int var6 = class70.field1486[var4];
                if (var5 < -20) {
                    break;
                }
                if (var6 == 0) {
                    var3++;
                }
                class117 var7 = class119.field2852[var4];
                if (var7 != null && var7.method932(class53.field1105, -120)) {
                    var7 = var7.method908(5, (byte) 120);
                }
                if (var7 != null && var7.method932(class124.field2921, -121)) {
                    var7 = var7.method908(5, (byte) 120);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class32.field695 == 0 || class32.field695 == 1 && class81.method637(true, var7))) {
                    var3++;
                    if (arg0 > var5 - 14 && var5 >= arg0 && !var7.method918(class141.field3395.field356, -106)) {
                        if (class116.field2752 >= 1) {
                            class56.field1149++;
                            class139.method1081(0, 15, class73.method530((byte) -83, new class117[] { class70.field1491, var7 }), 0, class104.field2512, true, 0);
                        }
                        class96.field2310++;
                        class105.field2528++;
                        class139.method1081(0, 38, class73.method530((byte) -83, new class117[] { class70.field1491, var7 }), 0, class25.field503, true, 0);
                        class139.method1081(0, 10, class73.method530((byte) -83, new class117[] { class70.field1491, var7 }), 0, class120.field2874, true, 0);
                    }
                }
                if ((var6 == 3 || var6 == 7) && class45.field898 == 0 && (var6 == 7 || class70.field1475 == 0 || class70.field1475 == 1 && class81.method637(true, var7))) {
                    var3++;
                    if (var5 - 14 < arg0 && var5 >= arg0) {
                        if (class116.field2752 >= 1) {
                            class56.field1149++;
                            class139.method1081(0, 15, class73.method530((byte) -83, new class117[] { class70.field1491, var7 }), 0, class104.field2512, true, 0);
                        }
                        class105.field2528++;
                        class96.field2310++;
                        class139.method1081(0, 38, class73.method530((byte) -83, new class117[] { class70.field1491, var7 }), 0, class25.field503, true, 0);
                        class139.method1081(0, 10, class73.method530((byte) -83, new class117[] { class70.field1491, var7 }), 0, class120.field2874, true, 0);
                    }
                }
                if (var6 == 4 && (class75.field1646 == 0 || class75.field1646 == 1 && class81.method637(true, var7))) {
                    var3++;
                    if (arg0 > var5 - 14 && arg0 <= var5) {
                        class139.method1081(0, 51, class73.method530((byte) -83, new class117[] { class70.field1491, var7 }), 0, class135.field3245, true, 0);
                        class126.field2986++;
                    }
                }
                if ((var6 == 5 || var6 == 6) && class45.field898 == 0 && class70.field1475 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class75.field1646 == 0 || class75.field1646 == 1 && class81.method637(true, var7))) {
                    if (var5 - 14 < arg0 && var5 >= arg0) {
                        class139.method1081(0, 55, class73.method530((byte) -83, new class117[] { class70.field1491, var7 }), 0, class150.field3734, true, 0);
                        class125.field2946++;
                    }
                    var3++;
                }
            }
            var4++;
        }
    }
}
