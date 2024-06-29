import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class109 implements Runnable {

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "[Lid;")
    public volatile class62[] field2067 = new class62[2];

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
    public volatile boolean field2058 = false;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Z")
    public volatile boolean field2061 = false;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lhh;")
    private static class163 field2064 = class137.method1065("You can(Wt add yourself to your own ignore list)3", 17);

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lqh;")
    public static class69 field2063 = null;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "Lhh;")
    public static class163 field2070 = class137.method1065(")1j", 17);

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lhh;")
    public static class163 field2066 = field2064;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lad;")
    public static class43 field2056 = new class43(64);

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lpa;")
    public static class123 field2057;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lpc;")
    public class166 field2062;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[[Lqh;")
    public static class69[][] field2060;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static void method877(boolean arg0) {
        field2060 = null;
        field2064 = null;
        field2063 = null;
        if (!arg0) {
            method879((byte) 32);
        }
        field2066 = null;
        field2070 = null;
        field2056 = null;
        field2057 = null;
    }

    @OriginalMember(owner = "client!eh", name = "run", descriptor = "()V")
    public final void run() {
        field2069++;
        this.field2061 = true;
        try {
            while (!this.field2058) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class62 var2 = this.field2067[var1];
                    if (var2 != null) {
                        var2.method430(-19683);
                    }
                }
                class107.method866(0, 10L);
                class29.method181(0, (Object) null, this.field2062);
            }
        } catch (Exception var9) {
            class107.method865(-95, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field2061 = false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method878(byte arg0) {
        field2059++;
        if (class225.field4072 == 0 || class225.field4072 == 5) {
            return;
        }
        try {
            if (++class256.field4476 > 2000) {
                if (class188.field3443 != null) {
                    class188.field3443.method1724(true);
                    class188.field3443 = null;
                }
                if (class76.field1443 >= 1) {
                    class225.field4072 = 0;
                    class128.field2492 = -5;
                    return;
                }
                class256.field4476 = 0;
                class76.field1443++;
                if (class256.field4492 == class243.field4295) {
                    class243.field4295 = class256.field4483;
                } else {
                    class243.field4295 = class256.field4492;
                }
                class225.field4072 = 1;
            }
            if (class225.field4072 == 1) {
                class39.field650 = class169.field3090.method1245(false, class243.field4295, class129.field2514);
                class225.field4072 = 2;
            }
            if (class225.field4072 == 2) {
                if (class39.field650.field3566 == 2) {
                    throw new IOException();
                }
                if (class39.field650.field3566 != 1) {
                    return;
                }
                class188.field3443 = new class255((Socket) class39.field650.field3563, class169.field3090);
                class39.field650 = null;
                long var1 = class9.field156 = class170.field3115.method1193((byte) 48);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class191.field3499.field1541 = 0;
                class191.field3499.method655(arg0 + 74, 14);
                class191.field3499.method655(0, var3);
                class188.field3443.method1729(class191.field3499.field1562, 2, 0, arg0 ^ 0xFFFFEC3E);
                if (class59.field973 != null) {
                    class59.field973.method428(25297);
                }
                if (class253.field4431 != null) {
                    class253.field4431.method428(25297);
                }
                int var4 = class188.field3443.method1730(false);
                if (class59.field973 != null) {
                    class59.field973.method428(25297);
                }
                if (class253.field4431 != null) {
                    class253.field4431.method428(25297);
                }
                if (var4 != 0) {
                    class128.field2492 = var4;
                    class225.field4072 = 0;
                    class188.field3443.method1724(true);
                    class188.field3443 = null;
                    return;
                }
                class225.field4072 = 3;
            }
            if (class225.field4072 == 3) {
                if (class188.field3443.method1725(false) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class188.field3443.method1727(class33.field502.field1562, (byte) -102, 8, 0);
                class33.field502.field1541 = 0;
                class128.field2498 = class33.field502.method652(32767);
                var5[3] = (int) class128.field2498;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class128.field2498 >> 32);
                class191.field3499.field1541 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class191.field3499.method655(0, 10);
                class191.field3499.method604(var5[0], 1543219568);
                class191.field3499.method604(var5[1], arg0 ^ 0xA40456C6);
                class191.field3499.method604(var5[2], arg0 ^ 0xA40456C6);
                class191.field3499.method604(var5[3], 1543219568);
                class191.field3499.method651(-645765520, class170.field3115.method1193((byte) 32));
                class191.field3499.method654(arg0 ^ 0xFFFFBD2E, class170.field3119);
                class191.field3499.method650(0, class73.field1366, class29.field455);
                class51.field857.field1541 = 0;
                if (class262.field4583 == 40) {
                    class51.field857.method655(0, 18);
                } else {
                    class51.field857.method655(arg0 + 74, 16);
                }
                class51.field857.method631(class191.field3499.field1541 + class54.method372(class149.field2809, arg0 ^ 0x49) + 150, -1);
                class51.field857.method604(506, 1543219568);
                class51.field857.method655(arg0 + 74, class140.field2683);
                class51.field857.method655(0, 0);
                class51.field857.method631(class233.field4160, arg0 ^ 0x49);
                class51.field857.method631(class205.field3706, arg0 + 73);
                class202.method1447((byte) -127, class51.field857);
                class51.field857.method654(17048, class149.field2809);
                class51.field857.method604(class227.field4099, arg0 + 1543219642);
                class51.field857.method604(class196.method1417(false), 1543219568);
                class62.field1053 = true;
                class51.field857.method604(class75.field1418.field2388, 1543219568);
                class51.field857.method604(class38.field640.field2388, 1543219568);
                class51.field857.method604(class219.field3986.field2388, 1543219568);
                class51.field857.method604(class90.field1646.field2388, 1543219568);
                class51.field857.method604(class149.field2805.field2388, 1543219568);
                class51.field857.method604(class139.field2667.field2388, 1543219568);
                class51.field857.method604(class59.field969.field2388, 1543219568);
                class51.field857.method604(class221.field4012.field2388, arg0 + 1543219642);
                class51.field857.method604(class94.field1786.field2388, 1543219568);
                class51.field857.method604(class4.field89.field2388, 1543219568);
                class51.field857.method604(class213.field3880.field2388, 1543219568);
                class51.field857.method604(class20.field327.field2388, 1543219568);
                class51.field857.method604(class165.field3050.field2388, arg0 + 1543219642);
                class51.field857.method604(class28.field426.field2388, 1543219568);
                class51.field857.method604(class191.field3489.field2388, 1543219568);
                class51.field857.method604(class30.field475.field2388, 1543219568);
                class51.field857.method604(class228.field4108.field2388, arg0 ^ 0xA40456C6);
                class51.field857.method604(class28.field438.field2388, 1543219568);
                class51.field857.method604(class95.field1796.field2388, 1543219568);
                class51.field857.method604(class63.field1074.field2388, 1543219568);
                class51.field857.method604(class221.field4031.field2388, 1543219568);
                class51.field857.method604(class234.field4176.field2388, 1543219568);
                class51.field857.method604(class196.field3540.field2388, 1543219568);
                class51.field857.method604(class107.field2049.field2388, arg0 + 1543219642);
                class51.field857.method604(class181.field3278.field2388, 1543219568);
                class51.field857.method604(class93.field1765.field2388, 1543219568);
                class51.field857.method604(class11.field173.field2388, 1543219568);
                class51.field857.method638(0, arg0 ^ 0xFFFFFFDA, class191.field3499.field1562, class191.field3499.field1541);
                class188.field3443.method1729(class51.field857.field1562, class51.field857.field1541, 0, 5000);
                class191.field3499.method84(var5, (byte) 49);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class33.field502.method84(var5, (byte) 49);
                class225.field4072 = 4;
            }
            if (class225.field4072 == 4) {
                if (class188.field3443.method1725(false) < 1) {
                    return;
                }
                int var7 = class188.field3443.method1730(false);
                if (var7 == 21) {
                    class225.field4072 = 7;
                } else if (var7 == 1) {
                    class225.field4072 = 5;
                    class128.field2492 = var7;
                    return;
                } else if (var7 == 2) {
                    class225.field4072 = 8;
                } else if (var7 == 15) {
                    class128.field2492 = var7;
                    class225.field4072 = 0;
                    return;
                } else if (var7 == 23 && class76.field1443 < 1) {
                    class256.field4476 = 0;
                    class225.field4072 = 1;
                    class76.field1443++;
                    class188.field3443.method1724(true);
                    class188.field3443 = null;
                    return;
                } else {
                    class128.field2492 = var7;
                    class225.field4072 = 0;
                    class188.field3443.method1724(true);
                    class188.field3443 = null;
                    return;
                }
            }
            if (class225.field4072 == 6) {
                class191.field3499.field1541 = 0;
                class191.field3499.method75(17, 70);
                class188.field3443.method1729(class191.field3499.field1562, class191.field3499.field1541, 0, 5000);
                class225.field4072 = 4;
                return;
            }
            if (class225.field4072 == 7) {
                if (class188.field3443.method1725(false) < 1) {
                    return;
                }
                class202.field3676 = class188.field3443.method1730(false) * 60 + 180;
                class225.field4072 = 0;
                class128.field2492 = 21;
                class188.field3443.method1724(true);
                class188.field3443 = null;
                return;
            }
            if (class225.field4072 == 8) {
                if (class188.field3443.method1725(false) < 11) {
                    return;
                }
                class188.field3443.method1727(class33.field502.field1562, (byte) -112, 11, 0);
                class33.field502.field1541 = 0;
                class99.field1920 = class33.field502.method622(true);
                class43.field736 = class33.field502.method622(true);
                class97.field1837 = class33.field502.method622(true);
                if (class97.field1837 == 1) {
                    try {
                        class146.field2784.method1189(class169.field3090.field3055, (byte) -87);
                    } catch (Throwable var9) {
                    }
                } else {
                    try {
                        class210.field3814.method1189(class169.field3090.field3055, (byte) -102);
                    } catch (Throwable var8) {
                    }
                }
                class209.field3789 = class33.field502.method622(true);
                class40.field670 = class33.field502.method622(true) == 1;
                class129.field2513 = class33.field502.method658(115);
                class90.field1654 = class33.field502.method622(true);
                class92.field1744 = class33.field502.method80((byte) 87);
                class125.field2415 = class33.field502.method658(arg0 + 183);
                class225.field4072 = 9;
            }
            if (class225.field4072 == 9) {
                if (class188.field3443.method1725(false) < class125.field2415) {
                    return;
                }
                class33.field502.field1541 = 0;
                class188.field3443.method1727(class33.field502.field1562, (byte) -99, class125.field2415, 0);
                class128.field2492 = 2;
                class225.field4072 = 0;
                class231.method1606((byte) -119);
                class102.field1965 = -1;
                class49.method351((byte) 1, false);
                class92.field1744 = -1;
                return;
            }
        } catch (IOException var10) {
            if (class188.field3443 != null) {
                class188.field3443.method1724(true);
                class188.field3443 = null;
            }
            if (class76.field1443 >= 1) {
                class128.field2492 = -4;
                class225.field4072 = 0;
            } else {
                class256.field4476 = 0;
                class76.field1443++;
                class225.field4072 = 1;
                if (class256.field4492 == class243.field4295) {
                    class243.field4295 = class256.field4483;
                } else {
                    class243.field4295 = class256.field4492;
                }
            }
        }
        if (arg0 != -74) {
            field2060 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static final void method879(byte arg0) {
        class32 var1 = (class32) class17.field239.method1017(117);
        if (arg0 != 79) {
            field2064 = null;
        }
        field2065++;
        while (var1 != null) {
            class212 var2 = var1.field491;
            if (class20.field323 != var2.field3832 || var2.field3860 < class227.field4092) {
                var1.method1063(119);
            } else if (var2.field3865 <= class227.field4092) {
                if (var2.field3856 > 0) {
                    class2 var3 = class111.field2098[var2.field3856 - 1];
                    if (var3 != null && var3.field3633 >= 0 && var3.field3633 < 13312 && var3.field3615 >= 0 && var3.field3615 < 13312) {
                        var2.method1515(class127.method1011(var3.field3615, var3.field3633, var2.field3832, 29908) - var2.field3855, class227.field4092, var3.field3615, -6511, var3.field3633);
                    }
                }
                if (var2.field3856 < 0) {
                    int var4 = -var2.field3856 - 1;
                    class126 var5;
                    if (class129.field2513 == var4) {
                        var5 = class235.field4203;
                    } else {
                        var5 = class106.field2029[var4];
                    }
                    if (var5 != null && var5.field3633 >= 0 && var5.field3633 < 13312 && var5.field3615 >= 0 && var5.field3615 < 13312) {
                        var2.method1515(class127.method1011(var5.field3615, var5.field3633, var2.field3832, 29908) - var2.field3855, class227.field4092, var5.field3615, -6511, var5.field3633);
                    }
                }
                var2.method1513(class52.field877, true);
                class174.method1287(class20.field323, (int) var2.field3872, (int) var2.field3842, (int) var2.field3854, 60, var2, var2.field3830, -1L, false);
            }
            var1 = (class32) class17.field239.method1016((byte) -31);
        }
    }
}
