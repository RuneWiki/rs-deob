import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class34 extends class63 {

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Lpf;")
    public static class17 field537 = new class17(64);

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static final void method208(int arg0) {
        ++field536;
        if (class189.field3017 != 0 && class189.field3017 != 5) {
            try {
                if (++class186.field2981 > 2000) {
                    if (class159.field2609 != null) {
                        class159.field2609.method1070(-113);
                        class159.field2609 = null;
                    }
                    if (~class54.field969 <= -2) {
                        class295.field4839 = -5;
                        class189.field3017 = 0;
                        return;
                    }
                    if (~class264.field4408 == ~class146.field2411) {
                        class264.field4408 = class223.field3741;
                    } else {
                        class264.field4408 = class146.field2411;
                    }
                    class186.field2981 = 0;
                    ++class54.field969;
                    class189.field3017 = 1;
                }
                if (~class189.field3017 == -2) {
                    class244.field4100 = class142.field2344.method572(class264.field4408, (byte) -111, class186.field2971);
                    class189.field3017 = 2;
                }
                if (~class189.field3017 == -3) {
                    if (~class244.field4100.field3091 == -3) {
                        throw new IOException();
                    }
                    if (~class244.field4100.field3091 != -2) {
                        return;
                    }
                    class159.field2609 = new class144((Socket) class244.field4100.field3089, class142.field2344);
                    class244.field4100 = null;
                    long var1 = class214.field3612 = class180.method1309(class33.field532, -20696);
                    int var3 = (int) (31L & var1 >> 16);
                    class236.field3980.field4160 = 0;
                    class236.field3980.method1780(14, 107);
                    class236.field3980.method1780(var3, 84);
                    class159.field2609.method1066(class236.field3980.field4182, -98, 2, 0);
                    if (class95.field1543 != null) {
                        class95.field1543.method1715(2);
                    }
                    if (class272.field4546 != null) {
                        class272.field4546.method1715(2);
                    }
                    int var4 = class159.field2609.method1064(false);
                    if (class95.field1543 != null) {
                        class95.field1543.method1715(2);
                    }
                    if (class272.field4546 != null) {
                        class272.field4546.method1715(2);
                    }
                    if (var4 != 0) {
                        class189.field3017 = 0;
                        class295.field4839 = var4;
                        class159.field2609.method1070(18);
                        class159.field2609 = null;
                        return;
                    }
                    class189.field3017 = 3;
                }
                if (class189.field3017 == 3) {
                    if (class159.field2609.method1065(-40) < 8) {
                        return;
                    }
                    class159.field2609.method1069(8, class136.field2239.field4182, 0, 6056);
                    class136.field2239.field4160 = 0;
                    class138.field2259 = class136.field2239.method1810((byte) -81);
                    class236.field3980.field4160 = 0;
                    int[] var5 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (9.9999999E7D * Math.random()), (int) (class138.field2259 >> 32), (int) class138.field2259 };
                    class236.field3980.method1780(10, 66);
                    class236.field3980.method1811(var5[0], (byte) 51);
                    class236.field3980.method1811(var5[1], (byte) 51);
                    class236.field3980.method1811(var5[2], (byte) 51);
                    class236.field3980.method1811(var5[3], (byte) 51);
                    class236.field3980.method1795(class180.method1309(class33.field532, -20696), (byte) -59);
                    class236.field3980.method1786(-25149, class111.field1835);
                    class236.field3980.method1775((byte) 35, class100.field1585, class219.field3691);
                    class275.field4591.field4160 = 0;
                    if (~class26.field458 == -41) {
                        class275.field4591.method1780(18, 95);
                    } else {
                        class275.field4591.method1780(16, 83);
                    }
                    class275.field4591.method1771(class236.field3980.field4160 + 163 + class73.method517(-1, class103.field1649), (byte) 30);
                    class275.field4591.method1811(554, (byte) 51);
                    class275.field4591.method1780(class36.field578, 111);
                    class275.field4591.method1780(class159.field2606 ? 1 : 0, 67);
                    class275.field4591.method1780(0, 111);
                    class275.field4591.method1780(class170.method1271((byte) -19), 83);
                    class275.field4591.method1771(class155.field2567, (byte) 30);
                    class275.field4591.method1771(class182.field2901, (byte) 30);
                    class275.field4591.method1780(class265.field4440, 56);
                    class213.method1516(false, class275.field4591);
                    class275.field4591.method1786(-25149, class103.field1649);
                    class275.field4591.method1811(class105.field1736, (byte) 51);
                    class275.field4591.method1811(class293.method2024(-70), (byte) 51);
                    class51.field864 = true;
                    class275.field4591.method1771(class227.field3845, (byte) 30);
                    class275.field4591.method1811(class87.field1433.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class313.field5047.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class274.field4580.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class66.field1113.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class13.field286.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class270.field4488.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class71.field1246.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class26.field463.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class25.field445.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class113.field1926.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class64.field1069.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class123.field2090.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class32.field528.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class67.field1120.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class22.field388.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class76.field1293.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class136.field2246.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class36.field582.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class239.field4021.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class45.field707.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class41.field629.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class249.field4196.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class58.field1011.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class13.field285.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class44.field681.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class124.field2096.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class141.field2331.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class138.field2258.method1127(-16034), (byte) 51);
                    class275.field4591.method1811(class187.field2997.method1127(-16034), (byte) 51);
                    class275.field4591.method1784(class236.field3980.field4182, false, class236.field3980.field4160, 0);
                    class159.field2609.method1066(class275.field4591.field4182, -104, class275.field4591.field4160, 0);
                    class236.field3980.method636(var5, 2047);
                    for (int var6 = 0; ~var6 > -5; ++var6) {
                        var5[var6] += 50;
                    }
                    class136.field2239.method636(var5, 2047);
                    class189.field3017 = 4;
                }
                if (~class189.field3017 == -5) {
                    if (~class159.field2609.method1065(-62) > -2) {
                        return;
                    }
                    int var7 = class159.field2609.method1064(false);
                    if (~var7 != -22) {
                        if (var7 == 29) {
                            class189.field3017 = 10;
                        } else {
                            if (var7 == 1) {
                                class295.field4839 = var7;
                                class189.field3017 = 5;
                                return;
                            }
                            if (~var7 != -3) {
                                if (~var7 == -16) {
                                    class295.field4839 = var7;
                                    class189.field3017 = 0;
                                    return;
                                }
                                if (var7 == 23 && class54.field969 < 1) {
                                    class186.field2981 = 0;
                                    ++class54.field969;
                                    class189.field3017 = 1;
                                    class159.field2609.method1070(-6);
                                    class159.field2609 = null;
                                    return;
                                }
                                class295.field4839 = var7;
                                class189.field3017 = 0;
                                class159.field2609.method1070(109);
                                class159.field2609 = null;
                                return;
                            }
                            class189.field3017 = 8;
                        }
                    } else {
                        class189.field3017 = 7;
                    }
                }
                if (~class189.field3017 == -7) {
                    class236.field3980.field4160 = 0;
                    class236.field3980.method640((byte) 97, 17);
                    class159.field2609.method1066(class236.field3980.field4182, -91, class236.field3980.field4160, 0);
                    class189.field3017 = 4;
                    return;
                }
                if (class189.field3017 == 7) {
                    if (class159.field2609.method1065(-93) < 1) {
                        return;
                    }
                    class283.field4696 = 60 * (3 + class159.field2609.method1064(false));
                    class189.field3017 = 0;
                    class295.field4839 = 21;
                    class159.field2609.method1070(-119);
                    class159.field2609 = null;
                    return;
                }
                if (~class189.field3017 == -11) {
                    if (class159.field2609.method1065(-57) < 1) {
                        return;
                    }
                    class246.field4129 = class159.field2609.method1064(false);
                    class189.field3017 = 0;
                    class295.field4839 = 29;
                    class159.field2609.method1070(56);
                    class159.field2609 = null;
                    return;
                }
                if (class189.field3017 == 8) {
                    if (~class159.field2609.method1065(-75) > -15) {
                        return;
                    }
                    class159.field2609.method1069(14, class136.field2239.field4182, 0, 6056);
                    class136.field2239.field4160 = 0;
                    class233.field3942 = class136.field2239.method1802((byte) 38);
                    class27.field476 = class136.field2239.method1802((byte) 95);
                    class69.field1163 = class136.field2239.method1802((byte) 30) == 1;
                    class146.field2402 = class136.field2239.method1802((byte) -112) == 1;
                    class251.field4254 = ~class136.field2239.method1802((byte) -122) == -2;
                    class122.field2042 = class136.field2239.method1802((byte) 48) == 1;
                    class159.field2596 = ~class136.field2239.method1802((byte) 111) == -2;
                    class297.field4860 = class136.field2239.method1821((byte) 51);
                    class226.field3830 = class136.field2239.method1802((byte) 79) == 1;
                    class85.field1418 = class136.field2239.method1802((byte) 104) == 1;
                    class260.method1859(0, class85.field1418);
                    class240.method1720(-26343, class85.field1418);
                    class119.method902(class85.field1418, 0);
                    if (!class159.field2606) {
                        if ((!class69.field1163 || class251.field4254) && !class226.field3830) {
                            try {
                                class288.method2005(class142.field2344.field1380, (byte) 100, "unzap");
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class288.method2005(class142.field2344.field1380, (byte) 100, "zap");
                            } catch (Throwable var11) {
                            }
                        }
                    }
                    try {
                        class288.method2005(class142.field2344.field1380, (byte) 100, "loggedin");
                    } catch (Throwable var9) {
                    }
                    class131.field2170 = class136.field2239.method630(true);
                    class150.field2480 = class136.field2239.method1821((byte) 51);
                    class189.field3017 = 9;
                }
                if (class189.field3017 == 9) {
                    if (~class159.field2609.method1065(-29) > ~class150.field2480) {
                        return;
                    }
                    class136.field2239.field4160 = 0;
                    class159.field2609.method1069(class150.field2480, class136.field2239.field4182, 0, 6056);
                    class295.field4839 = 2;
                    class189.field3017 = 0;
                    class243.method1741(27213);
                    class263.field4395 = -1;
                    class95.method678(false, -5913);
                    class131.field2170 = -1;
                    return;
                }
            } catch (IOException var12) {
                if (class159.field2609 != null) {
                    class159.field2609.method1070(32);
                    class159.field2609 = null;
                }
                if (~class54.field969 <= -2) {
                    class189.field3017 = 0;
                    class295.field4839 = -4;
                } else {
                    class186.field2981 = 0;
                    class189.field3017 = 1;
                    ++class54.field969;
                    if (~class264.field4408 == ~class146.field2411) {
                        class264.field4408 = class223.field3741;
                    } else {
                        class264.field4408 = class146.field2411;
                    }
                }
            }
            int var8 = -30 % ((-53 - arg0) / 38);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
    public static final void method209(boolean arg0) {
        ++field545;
        if (!arg0) {
            class238.field4007.method94(34);
            class32.field525.method94(34);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIIII)V")
    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field547 = arg2;
        this.field542 = arg1;
        this.field543 = arg3;
        this.field541 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        if (arg2 != 8846) {
            this.field542 = -70;
        }
        ++field538;
        int var4 = this.field543 * arg0 >> 12;
        int var5 = this.field547 * arg1 >> 12;
        int var6 = this.field542 * arg0 >> 12;
        int var7 = this.field541 * arg1 >> 12;
        class206.method1438(super.field1066, super.field1062, var7, super.field1064, var4, 32767, var6, var5);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lck;")
    public static final class163 method211(int arg0, int arg1) {
        ++field540;
        class163 var2 = (class163) class237.field3992.method99((long) arg0, true);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class85.field1416.method1149(class51.method331(-460789497, arg0), (byte) 117, class197.method1406((byte) 117, arg0));
            class163 var4 = new class163();
            var4.field2650 = arg0;
            if (var3 != null) {
                var4.method1201(arg1 ^ -58, new class249(var3));
            }
            if (arg1 != 3) {
                method212((byte) 71);
            }
            var4.method1205(14461);
            class237.field3992.method100((long) arg0, var4, 44);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method212(byte arg0) {
        if (arg0 < 29) {
            field549 = -79;
        }
        field537 = null;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public static final void method213(int arg0) {
        if (arg0 == 14702) {
            ++field535;
            class49.field825.method97(92);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIB)V")
    public final void method214(int arg0, int arg1, byte arg2) {
        ++field546;
        if (arg2 >= -110) {
            this.field543 = -120;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public static final void method215(byte arg0) {
        ++field539;
        class214 var1 = class109.field1791;
        synchronized (class109.field1791) {
            class171.field2763 = class35.field554;
            class96.field1558 = class199.field3215;
            class87.field1448 = class248.field4151;
            class29.field490 = client.field1617;
            class298.field4870 = class187.field2996;
            ++class76.field1299;
            class32.field526 = class149.field2472;
            if (arg0 > -124) {
                method209(true);
            }
            class170.field2750 = class46.field816;
            client.field1617 = 0;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZI)V")
    public final void method216(int arg0, boolean arg1, int arg2) {
        int var4 = this.field541 * arg2 >> 12;
        int var5 = this.field547 * arg2 >> 12;
        ++field544;
        int var6 = this.field542 * arg0 >> 12;
        if (arg1) {
            int var7 = this.field543 * arg0 >> 12;
            class50.method321(var4, var7, super.field1062, -103, var6, var5);
        }
    }
}
