import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class53 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Liu;")
    public static class390 field2663 = new class390(91, 2);

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1175() {
        int var0 = class276.field3953;
        int[] var1 = class330.field4790;
        int var2 = class242.field3445 ? var0 : class339.field4942 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class294 var4;
            if (var3 < var0) {
                var4 = class262.field3742[var1[var3]];
            } else {
                var4 = class504.field7697[class263.field3749[var3 - var0]];
            }
            if (var4.field4264 >= 0) {
                int var5 = var4.method1773(-24);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2959 & 0x7F) == 0 && (var4.field2966 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field2959 & 0x7F) == 64 && (var4.field2966 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class313 && var4.field4283 != null && class263.field3748 >= var4.field4283.field2196 && class263.field3748 < var4.field4283.field2187) {
                    ((class313) var4).field4593 = false;
                }
                var4.field2970 = class103.method620(var4.field2956, var4.field2966, (byte) 20, var4.field2959);
                class76.method503(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    private final void method1176(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        class25.field413 = null;
        class350.field5084 = null;
        field2667++;
        class122.field1599 = 0;
        class90.field1238.field6620++;
        class90.field1238.field6619 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1177(int arg0, byte[] arg1) {
        field2669++;
        class156 var3 = new class156(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method941((byte) 125);
                if (var4 == 0) {
                    if (arg0 >= -28) {
                        field2663 = null;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class14.field219 = new int[6];
                    var5[0] = var3.method993((byte) -76);
                    var5[1] = var3.method993((byte) -112);
                    var5[2] = var3.method993((byte) -43);
                    var5[3] = var3.method993((byte) -45);
                    var5[4] = var3.method993((byte) -112);
                    var5[5] = var3.method993((byte) -54);
                } else if (var4 == 4) {
                    int var6 = var3.method941((byte) 123);
                    class85.field1165 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class85.field1165[var7] = var3.method993((byte) -90);
                        if (class85.field1165[var7] == 65535) {
                            class85.field1165[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method941((byte) 123);
                    class417.field6187 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class417.field6187[var9] = var3.method993((byte) -41);
                        if (class417.field6187[var9] == 65535) {
                            class417.field6187[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method390(int arg0) {
        field2673++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class381.method2301((byte) -102);
        class493.field7529 = new class502(class86.field1182);
        class90.field1238 = new class454();
        if (class371.field5567 != class339.field4941) {
            class179.field2567 = new byte[50][];
        }
        class118.field1533 = new class492(class86.field1182);
        if (class371.field5567 == class339.field4941) {
            class437.field6397 = this.getCodeBase().getHost();
            class35.field559 = 443;
            class308.field4492 = 43594;
        } else if (class171.method1081(class371.field5567, 53)) {
            class437.field6397 = this.getCodeBase().getHost();
            class308.field4492 = class397.field5860 + 40000;
            class35.field559 = class397.field5860 + 50000;
        } else if (class371.field5567 == class355.field5129) {
            class437.field6397 = "127.0.0.1";
            class35.field559 = class397.field5860 + 50000;
            class308.field4492 = class397.field5860 + 40000;
        }
        class195.field2767 = class308.field4492;
        class265.field3762 = class35.field559;
        class389.field5780 = class308.field4492;
        class406.field5955 = class437.field6397;
        class161.field2088 = class259.field3704 = class192.field2724 = class417.field6189 = new short[256];
        if (class28.field486 == class156.field1996) {
            class157.field2056 = class312.field4545;
            class420.field6205 = 0;
            class23.field303 = true;
            class39.field593 = class404.field5940;
            class152.field1955 = class272.field3844;
            class173.field2376 = 16777215;
            class445.field6488 = class71.field1048;
        } else {
            class445.field6488 = class150.field1942;
            class157.field2056 = class265.field3761;
            class152.field1955 = class2.field28;
            class39.field593 = class137.field1792;
        }
        class140.field1834 = class195.field2767;
        if (class44.field670 == 3) {
            class128.field1631 = class397.field5860;
        }
        class489.field7484 = class22.method152(class498.field7590, arg0 + 30681);
        class137.field1797 = class371.method2255(class498.field7590, arg0 + 1091129193, true);
        if (arg0 != -30681) {
            return;
        }
        class212.field3009 = class380.method2296(false);
        if (class212.field3009 != null) {
            class212.field3009.method491((byte) -98, class498.field7590);
        }
        class463.field6723 = class44.field670;
        try {
            if (class86.field1182.field657 != null) {
                class147.field1913 = new class64(class86.field1182.field657, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class447.field6525[var3] = new class64(class86.field1182.field658[var3], 6000, 0);
                }
                class236.field3311 = new class64(class86.field1182.field673, 6000, 0);
                class294.field4204 = new class334(255, class147.field1913, class236.field3311, 500000);
                class445.field6499 = new class64(class86.field1182.field665, 24, 0);
                class86.field1182.field658 = null;
                class86.field1182.field673 = null;
                class86.field1182.field657 = null;
                class86.field1182.field665 = null;
            }
        } catch (IOException var4) {
            class147.field1913 = null;
            class294.field4204 = null;
            class236.field3311 = null;
            class445.field6499 = null;
        }
        if (class371.field5567 != class339.field4941) {
            class174.field2389 = true;
        }
        class337.field4917 = (class459.field6684 == class156.field1996 ? class305.field4442 : class324.field4735).method1220(arg0 ^ 0xFFFF83BE, class81.field1122);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1178(byte arg0) {
        field2657++;
        class91.field1245++;
        class324.method1944(null, -1, 30000, -1);
        class65.method458(null, -1, -1, -128);
        class478.method2793((byte) 119);
        class490.field7491++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class139 var12 = class504.field7697[var2];
            if (var12 != null) {
                byte var13 = var12.field1825.field3786;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method1773(-14);
                    if ((var13 & 0x2) != 0 && var12.field4277 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field4279[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if ((class362.field5442 - var14 - 1) < var17) {
                                var17 = class362.field5442 - (var14 + 1);
                            }
                            int var18 = var12.field4282[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if ((class203.field2813 - var14 - 1) < var18) {
                                var18 = class203.field2813 - var14 - 1;
                            }
                            int var19 = class491.method2951(var14, class169.field2234[var12.field2956], var14, -1, 0, var12.field4282[0], var12.field4279[0], 0, var14, var18, class506.field7721, arg0 ^ 0x1A, class238.field3329, var17, true);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field4279[var20] = class506.field7721[var19 - var20 - 1];
                                    var12.field4282[var20] = class238.field3329[var19 - var20 - 1];
                                    var12.field4278[var20] = 1;
                                }
                                var12.field4277 = var19;
                            }
                        }
                    }
                    class454.method2640(true, arg0 + 28, var12);
                    int var21 = class437.method2570(var12, (byte) 11);
                    class62.method438(class428.field6299, -120, var12, var21, class45.field688);
                    class69.method472(true, var12);
                }
            }
        }
        if (arg0 != -27) {
            this.method405((byte) 121);
        }
        if (class468.field6755 == 0 && class497.field7577 == 0) {
            if (class306.field4454 == 2) {
                class450.method2621(arg0 ^ 0xFFFFCDBE);
            } else {
                class378.method2288((byte) -42);
            }
            if (class205.field2843 >> 7 < 14 || (class362.field5442 - 14) <= (class205.field2843 >> 7) || class282.field4026 >> 7 < 14 || class203.field2813 - 14 <= class282.field4026 >> 7) {
                class458.method2669(-11995);
            }
        }
        while (true) {
            class99 var3;
            class356 var4;
            class356 var5;
            do {
                var3 = (class99) class497.field7569.method2093(-10805);
                if (var3 == null) {
                    while (true) {
                        class99 var6;
                        class356 var7;
                        class356 var8;
                        do {
                            var6 = (class99) class358.field5308.method2093(arg0 ^ 0x2A2E);
                            if (var6 == null) {
                                while (true) {
                                    class99 var9;
                                    class356 var10;
                                    class356 var11;
                                    do {
                                        var9 = (class99) class300.field4355.method2093(-10805);
                                        if (var9 == null) {
                                            if (class164.field2146 != null) {
                                                class7.method64((byte) 119);
                                            }
                                            if ((class263.field3748 % 1500) == 0) {
                                                class347.method2088(127);
                                            }
                                            class397.method2374(-9539);
                                            if (class438.field6406 && class193.field2734 < class109.method653(false) - 60000L) {
                                                class450.method2624(arg0 + 7506);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field1343;
                                        if (var10.field5184 < 0) {
                                            break;
                                        }
                                        var11 = class4.method25(var10.field5160, false);
                                    } while (var11 == null || var11.field5151 == null || var10.field5184 >= var11.field5151.length || var11.field5151[var10.field5184] != var10);
                                    class396.method2358(var9);
                                }
                            }
                            var7 = var6.field1343;
                            if (var7.field5184 < 0) {
                                break;
                            }
                            var8 = class4.method25(var7.field5160, false);
                        } while (var8 == null || var8.field5151 == null || var8.field5151.length <= var7.field5184 || var8.field5151[var7.field5184] != var7);
                        class396.method2358(var6);
                    }
                }
                var4 = var3.field1343;
                if (var4.field5184 < 0) {
                    break;
                }
                var5 = class4.method25(var4.field5160, false);
            } while (var5 == null || var5.field5151 == null || var5.field5151.length <= var4.field5184 || var5.field5151[var4.field5184] != var4);
            class396.method2358(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method391(byte arg0) {
        field2666++;
        method1187(false);
        class72.method487(-113);
        class508.method3057((byte) 7);
        class338.method2055(-115);
        class194.method1219((byte) -85);
        class399.method2383((byte) -111);
        class345.method2077((byte) -118);
        class6.method50((byte) -59);
        class96.method585(-124);
        class86.method538(-119);
        class389.method2346(1);
        class384.method2313(-25267);
        class53.method395(true);
        class201.method1240((byte) 65);
        class463.method2720(0);
        class438.method2572((byte) -116);
        class298.method1805((byte) 39);
        class33.method269(arg0 ^ 0xFFFFFF8E);
        class134.method748(-2);
        class492.method2956(32);
        class434.method2565(-1);
        class14.method104((byte) 109);
        class347.method2087(arg0 + 155);
        class199.method1236(-119);
        class350.method2126(true);
        class454.method2647(-13467);
        class502.method3025(122);
        class428.method2553(0);
        class233.method1416((byte) 0);
        class239.method1462(-1);
        class64.method455((byte) 20);
        class334.method2017((byte) -114);
        class5.method43(0);
        class70.method475((byte) 127);
        class254.method1592(arg0 ^ 0x3E);
        class31.method256(0);
        class467.method2734(arg0 + 32);
        class209.method1288(arg0 ^ 0x37);
        class216.method1329(arg0 - 29246);
        class34.method287((byte) -113);
        class205.method1262((byte) -121);
        class90.method566(18396);
        class184.method1159(32);
        class246.method1538(18774);
        class326.method1954((byte) -44);
        class445.method2596(true);
        class484.method2829((byte) -43);
        class469.method2742((byte) -89);
        class406.method2428(false);
        class224.method1382(20739);
        class1.method3(true);
        class381.method2298((byte) 58);
        class63.method444((byte) -117);
        class186.method1171(arg0 ^ 0x78);
        class355.method2151((byte) -107);
        class363.method2214(true);
        class139.method878(-105);
        class364.method2218(true);
        class390.method2354((byte) -109);
        class32.method262(false);
        class336.method2031(109);
        class19.method144((byte) 68);
        class388.method2331(-1);
        class248.method1542(0);
        class281.method1714(false);
        class97.method592(arg0 + 109);
        class30.method246((byte) 18);
        class356.method2164(arg0 - 86);
        class7.method61((byte) -33);
        class313.method1878((byte) 64);
        class94.method577((byte) -98);
        class137.method866(arg0 + 36);
        class106.method636((byte) 82);
        class156.method952(124);
        class294.method1776(false);
        class348.method2114((byte) -125);
        class468.method2739((byte) 91);
        class234.method1422(7653);
        class231.method1406(100);
        class311.method1861((byte) -109);
        class489.method2936((byte) 91);
        class475.method2784(arg0 + 158);
        class110.method657(20483);
        class52.method381((byte) -83);
        class379.method2292(false);
        class236.method1432((byte) -128);
        class146.method911(1024);
        class126.method707(-1);
        class501.method3015(arg0 ^ 0xFFFFFFBA);
        class140.method886((byte) -81);
        class310.method1859((byte) 92);
        class225.method1390((byte) 100);
        class478.method2790((byte) 71);
        class206.method1273((byte) -121);
        class103.method615(1);
        class168.method1060((byte) -67);
        class55.method415(13);
        class327.method1957((byte) 76);
        class473.method2770((byte) 82);
        class121.method691(false);
        class49.method375(true);
        class315.method1899((byte) -110);
        class486.method2842(116);
        class499.method3006(14739);
        class107.method638(14809);
        class441.method2579(true);
        class272.method1666(99);
        class361.method2192(-24983);
        class352.method2138(-11);
        class242.method1517(arg0 + 144);
        class280.method1713(-93);
        class100.method601(false);
        class147.method913(-106);
        class372.method2262(arg0 + 115);
        class297.method1804(arg0 - 22829);
        class507.method3054((byte) -97);
        class191.method1204(117);
        class472.method2766((byte) -111);
        class420.method2488(-116);
        class232.method1408(120);
        class267.method1637(72);
        class374.method2274(arg0 + 14232);
        class371.method2259(83);
        class185.method1165(false);
        class485.method2830(arg0 + 33);
        class380.method2297(-102);
        class493.method2966(-4);
        class127.method711((byte) 118);
        class195.method1223(arg0 ^ 0x64);
        class193.method1213((byte) -118);
        class17.method122(-124);
        class396.method2368();
        class249.method1569();
        class282.method1716((byte) 40);
        if (arg0 != -32) {
            field2663 = null;
        }
        class410.method2448(true);
        class474.method2771();
        class213.method1319(-114);
        class170.method1074((byte) 98);
        class375.method2275((byte) 120);
        class83.method525(21133);
        class118.method676((byte) -110);
        class491.method2949((byte) -104);
        class8.method67(arg0 + 32);
        class171.method1085(-1);
        class290.method1756(-61);
        class87.method552(-6);
        class117.method672(-72);
        class285.method1728((byte) -5);
        class424.method2533(-92);
        class85.method535(76);
        class135.method842(arg0 ^ 0xFFFFFFEC);
        class331.method1988(true);
        class84.method529(-3);
        class369.method2250((byte) -69);
        class42.method314(0);
        class453.method2635((byte) -33);
        class175.method1098(-30);
        class470.method2750(false);
        class36.method291(90);
        class76.method507(arg0 + 32);
        class419.method2486((byte) 127);
        class222.method1372(true);
        class211.method1312(false);
        class20.method145(-5027);
        class114.method662((byte) 65);
        class383.method2306(arg0 ^ 0xFFFFFFE0);
        class314.method1895();
        class61.method435(arg0 + 132);
        class505.method3035(28875);
        class3.method20((byte) 75);
        class65.method457((byte) -113);
        class450.method2623(3174179);
        class278.method1701(arg0 + 151);
        class452.method2629(false);
        class459.method2673((byte) -73);
        class138.method871(arg0 ^ 0x78);
        class99.method598(arg0 ^ 0xFFFFFFE0);
        class256.method1595(false);
        class37.method294(-85);
        class210.method1300(arg0 ^ 0xFFFFFFDE);
        class250.method1573(-73);
        class408.method2439(false);
        class25.method215(914818376);
        class332.method2008();
        class167.method1052(100);
        class22.method151(arg0 ^ 0xFFFFEC68);
        class497.method2984((byte) -105);
        class373.method2269(-124);
        class79.method517(5000);
        class296.method1799(19190);
        class403.method2419(true);
        class455.method2654(false);
        class323.method1942(79);
        class330.method1986((byte) 87);
        class283.method1720(110);
        class391.method2356(true);
        class480.method2802(23);
        class220.method1352((byte) -9);
        class43.method318((byte) -48);
        class227.method1396((byte) -76);
        class122.method693((byte) -24);
        class223.method1379(arg0 + 57);
        class451.method2626(-1);
        class173.method1091(7);
        class218.method1344(0);
        class342.method2068(arg0 + 33);
        class152.method929(arg0 + 23811);
        class58.method424(-22314);
        class465.method2725(arg0 ^ 0xFFFFFFE0);
        class214.method1323(121);
        class482.method2806((byte) -120);
        class163.method1033(-117);
        class510.method3062(127);
        class414.method2465((byte) 85);
        class276.method1696(0);
        class437.method2571(-123);
        class2.method10(arg0 - 34);
        class131.method727(270646850);
        class145.method908((byte) 114);
        class500.method3014((byte) -90);
        class404.method2420(12345678);
        class12.method97(arg0 ^ 0x5A85);
        class448.method2616();
        class56.method416((byte) -90);
        class339.method2057((byte) 111);
        class312.method1867(arg0 - 78);
        class337.method2040((byte) -120);
        class226.method1393((byte) 123);
        class151.method928(arg0 ^ 0x1F);
        class230.method1405(-32666);
        class204.method1260((byte) -61);
        class202.method1248((byte) 65);
        class263.method1625(-1);
        class444.method2592(-108);
        class143.method898();
        class28.method232(-68);
        class407.method2438(27);
        class125.method702(arg0 + 33);
        class165.method1044(-29397);
        class325.method1948((byte) 112);
        class306.method1838((byte) -10);
        class176.method1106(arg0 + 159);
        class178.method1132((byte) 39);
        class413.method2462((byte) -31);
        class308.method1851((byte) -102);
        class349.method2118((byte) -9);
        class48.method366((byte) 60);
        class172.method1086((byte) 119);
        class39.method304(29140);
        class304.method1827((byte) -79);
        class149.method919(arg0 - 26767);
        class324.method1945((byte) 127);
        class98.method595(-1);
        class402.method2415();
        class287.method1735((byte) -80);
        class401.method2400();
        class47.method354();
        class301.method1816();
        class261.method1616((byte) -56);
        class238.method1437(true);
        class180.method1142();
        class498.method2986(35);
        class159.method1013(-16740);
        class10.method76();
        class490.method2946(-5949);
        class192.method1205(5716);
        class400.method2387(false);
        class111.method658(4096);
        class275.method1689((byte) 73);
        class66.method463(arg0 ^ 0xFFFFFFE0);
        class71.method483(0);
        class166.method1046(arg0 ^ 0x7E);
        class187.method1172(117);
        class75.method494(true);
        class335.method2025(2);
        class303.method1824(124);
        class430.method2555((byte) 84);
        class54.method411((byte) 74);
        class179.method1135(-26350);
        class95.method581(16);
        class322.method1929((byte) -73);
        class157.method1008(arg0 ^ 0xFFFFFFEA);
        class487.method2899((byte) 83);
        class319.method1919(-8077);
        class447.method2612(arg0 ^ 0x61);
        class416.method2478(88);
        class317.method1907(arg0 ^ 0x516E);
        class442.method2583(arg0 + 1632);
        class252.method1580((byte) 49);
        class417.method2481(false);
        class305.method1833(-119);
        class295.method1790((byte) -78);
        class221.method1359(false);
        class26.method223(0);
        class271.method1652((byte) -81);
        class129.method716(arg0 - 3961);
        class27.method231(false);
        class368.method2241(6);
        class496.method2977();
        class89.method555(arg0 ^ 0xFFFFFFF3);
        class237.method1436((byte) -115);
        class69.method471(true);
        class378.method2290((byte) -82);
        class188.method1194(true);
        class150.method923(-21217);
        class78.method511(0);
        class4.method21(60);
        class158.method1011(14558);
        class300.method1810(true);
        class488.method2932(arg0 + 38);
        class115.method667(-2147046559);
        class415.method2466(4096);
        class392.method2357(false);
        class208.method1285((byte) -60);
        class153.method930((byte) -67);
        class259.method1613(100);
        class251.method1574(arg0 + 32);
        class358.method2172(arg0 ^ 0xFFF006AB);
        class112.method660(114);
        class92.method569(26029);
        class506.method3042((byte) 118);
        class292.method1762(8);
        class181.method1150((byte) -113);
        class341.method2066((byte) -106);
        class161.method1021(-8438);
        class449.method2617((byte) -1);
        class228.method1399((byte) -25);
        class128.method713(0);
        class18.method127((byte) -125);
        class35.method289(true);
        class376.method2280((byte) 90);
        class289.method1750(-1);
        class24.method212();
        class177.method1121();
        class277.method1698((byte) 79);
        class458.method2670(-3978);
        class471.method2756(128);
        class359.method2180(2);
        class466.method2731(true);
        class105.method630(30954);
        class235.method1425(arg0 ^ 0x42D9);
        class479.method2799(false);
        class495.method2971(true);
        class503.method3031(arg0 - 16842);
        class40.method306(99);
        class164.method1038(true);
        class190.method1199(arg0 + 28);
        class245.method1528(true);
        class9.method70(95);
        class357.method2171((byte) 35);
        class136.method853(-24075);
        class288.method1742(74);
        class120.method684(-18135);
        class405.method2425(-86);
        class258.method1608(109);
        class422.method2506(83);
        class253.method1587((byte) -128);
        class38.method298(60);
        class142.method895(false);
        class360.method2185(-60);
        class431.method2558(120);
        class309.method1857(arg0 ^ 0xFFFFF2CC);
        class284.method1724((byte) -76);
        class504.method3034(-995);
        class162.method1024(false);
        class411.method2450(3170);
        class104.method628(-125);
        class124.method700(false);
        class318.method1915((byte) -64);
        class260.method1614(8);
        class229.method1400(-127);
        class77.method509(113);
        class464.method2721(47);
        class212.method1316((byte) 72);
        class481.method2803(-6807);
        class169.method1066((byte) 62);
        class370.method2254(0);
        class274.method1685(arg0 ^ 0xFFFFFFE0);
        class144.method907((byte) 27);
        class477.method2785(false);
        class457.method2662(17);
        class46.method351(arg0 + 17260);
        class219.method1347(-90);
        class16.method118((byte) -32);
        class456.method2657((byte) -54);
        class93.method572(250);
        class270.method1649(22702);
        class13.method98(0);
        class423.method2521(true);
        class68.method469((byte) 110);
        class262.method1619((byte) -93);
        class160.method1017(74);
        class130.method718((byte) 30);
        class443.method2589(0);
        class265.method1631(arg0 + 31);
        class41.method310(0);
        class293.method1765(4);
        class409.method2445(true);
        class51.method380((byte) 120);
        class15.method114(5);
        class67.method468(41546988);
        class102.method612(-56);
        class286.method1734((byte) 70);
        class141.method888(-25487);
        class217.method1339(true);
        if (class53.field822) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        field2659++;
        if (arg0 <= 84) {
            method1188(null);
        }
        if (class468.field6755 == 5) {
            class468.field6755 = 6;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lts;)Lts;")
    public static final class356 method1180(class356 arg0) {
        int var1 = method1188(arg0).method2942(-72);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class4.method25(arg0.field5160, false);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method405(byte arg0) {
        if (class438.field6406) {
            class450.method2624(7479);
        }
        field2665++;
        if (class481.field6937 != null) {
            class481.field6937.method835(1);
        }
        int var2 = 101 / ((arg0 - 85) / 37);
        if (class217.field3043 != null) {
            class238.method1438(class217.field3043, class86.field1182, 1);
            class217.field3043 = null;
        }
        if (class22.field294 != null) {
            class22.field294.method2123(-93);
            class22.field294 = null;
        }
        if (class212.field3009 != null) {
            class212.field3009.method490(class498.field7590, 66);
        }
        class212.field3009 = null;
        class312.method1869(70);
        class90.field1238.method2646(127);
        class493.field7529.method3021(11636);
        if (class111.field1452 != null) {
            class111.field1452.method258(-349279);
            class111.field1452 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lts;IIIIIIIII)V")
    public static final void method1181(class356[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class356 var11 = arg0[var10];
            if (var11 != null && var11.field5160 == arg1) {
                int var12 = var11.field5209 + arg6;
                int var13 = var11.field5179 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5170 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5168 + var12;
                    int var19 = var11.field5169 + var13;
                    if (var11.field5170 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field5170 == 0 || var11.field5135 || method1188(var11).field7487 != 0 || class65.field965 == var11 || class475.field6851 == var11.field5192) {
                    if (!method1191(var11)) {
                        if (class164.field2146 == var11) {
                            class318.field4664 = true;
                            class45.field686 = var12;
                            class324.field4739 = var13;
                        }
                        if (var11.field5278 || var14 < var16 && var15 < var17) {
                            if (var11.field5230 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class99 var20 = (class99) class300.field4355.method2096(-21400); var20 != null; var20 = (class99) class300.field4355.method2084((byte) 19)) {
                                    if (var20.field1344) {
                                        var20.method536(false);
                                        var20.field1343.field5277 = false;
                                    }
                                }
                                if (class327.field4766 == 0) {
                                    class164.field2146 = null;
                                    class65.field965 = null;
                                }
                                class184.field2605 = 0;
                                class258.field3698 = false;
                                class165.field2159 = false;
                                if (!class174.field2387) {
                                    class190.method1200(119);
                                }
                            }
                            boolean var21;
                            if (class137.field1797.method2038(9) >= var14 && class137.field1797.method2044((byte) -76) >= var15 && class137.field1797.method2038(9) < var16 && class137.field1797.method2044((byte) -67) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class288.field4128 && var21) {
                                if (var11.field5215 >= 0) {
                                    class450.field6553 = var11.field5215;
                                } else if (var11.field5230) {
                                    class450.field6553 = -1;
                                }
                            }
                            if (!class174.field2387 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class58.method426(arg8 - var12, arg9 - var13, var11, -31086);
                            }
                            boolean var22 = false;
                            if (class137.field1797.method2043((byte) -60) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class270 var24 = (class270) class265.field3759.method2096(-21400);
                            if (var24 != null && var24.method1015(0) == 0 && var24.method1018(-30361) >= var14 && var24.method1019((byte) -122) >= var15 && var24.method1018(-30361) < var16 && var24.method1019((byte) -100) < var17) {
                                var23 = true;
                            }
                            if (var11.field5188 != null) {
                                for (int var25 = 0; var25 < var11.field5188.length; var25++) {
                                    if (class489.field7484.method1877(124, var11.field5188[var25])) {
                                        if (var11.field5153 == null || class263.field3748 >= var11.field5153[var25]) {
                                            byte var26 = var11.field5252[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class489.field7484.method1877(-63, 86) && !class489.field7484.method1877(-81, 82) && !class489.field7484.method1877(126, 81)) && ((var26 & 0x2) == 0 || class489.field7484.method1877(-84, 86)) && ((var26 & 0x1) == 0 || class489.field7484.method1877(-90, 82)) && ((var26 & 0x4) == 0 || class489.field7484.method1877(124, 81))) {
                                                if (var25 < 10) {
                                                    class87.method547(-1, var11.field5185, "", -104, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class489.method2941(-1);
                                                    class489 var27 = method1188(var11);
                                                    class179.method1137(-1, var11, var27.field7482, var27.method2933(2015625216));
                                                    class457.field6660 = class191.method1203(var11, (byte) 116);
                                                    if (class457.field6660 == null) {
                                                        class457.field6660 = "Null";
                                                    }
                                                    class211.field2998 = var11.field5183 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field5172[var25];
                                                if (var11.field5153 == null) {
                                                    var11.field5153 = new int[var11.field5188.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field5153[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field5153[var25] = class263.field3748 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field5153 != null) {
                                        var11.field5153[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class508.method3058(var24.method1019((byte) -61) - var13, var11, var24.method1018(-30361) - var12, -61);
                            }
                            if (class164.field2146 != null && class164.field2146 != var11 && var21 && method1188(var11).method2943(76)) {
                                class104.field1403 = var11;
                            }
                            if (class65.field965 == var11) {
                                class212.field3006 = true;
                                class295.field4284 = var12;
                                class65.field967 = var13;
                            }
                            if (var11.field5135 || var11.field5192 != 0) {
                                if (var21 && class193.field2735 != 0 && var11.field5189 != null) {
                                    class99 var29 = new class99();
                                    var29.field1344 = true;
                                    var29.field1343 = var11;
                                    var29.field1351 = class193.field2735;
                                    var29.field1346 = var11.field5189;
                                    class300.field4355.method2086((byte) -119, var29);
                                }
                                if (class164.field2146 != null || class174.field2387 || class354.field5118 != var11.field5192 && class184.field2605 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field5192 != 0) {
                                    if (class154.field1972 == var11.field5192 || class337.field4913 == var11.field5192) {
                                        class186.field2642 = var11;
                                        if (class252.field3649 != null) {
                                            class252.field3649.method593(true, var11.field5169, class481.field6937);
                                        }
                                        if (class154.field1972 == var11.field5192) {
                                            if (!class174.field2387 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class277.method1699(arg8, (byte) -78, class481.field6937, arg9);
                                                for (class214 var30 = (class214) class317.field4637.method242(false); var30 != null; var30 = (class214) class317.field4637.method244((byte) -73)) {
                                                    if (arg8 >= var30.field3025 && arg8 < var30.field3024 && arg9 >= var30.field3026 && arg9 < var30.field3020) {
                                                        class190.method1200(87);
                                                        class504.method3033(var30.field3019, 31737);
                                                    }
                                                }
                                            }
                                            class324.method1944(var11, var12, 30000, var13);
                                            continue;
                                        }
                                    }
                                    if (class475.field6851 == var11.field5192) {
                                        if (var11.method2162(0, class481.field6937) == null || class231.field3230 != 0 && class231.field3230 != 3 || class174.field2387 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field5259[var32];
                                        if (var31 < var33 || var31 > var11.field5275[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field5168 / 2;
                                        int var35 = var32 - var11.field5169 / 2;
                                        int var36;
                                        if (class306.field4454 == 4) {
                                            var36 = (int) class506.field7722 & 0x3FFF;
                                        } else {
                                            var36 = (int) class506.field7722 + class280.field4003 & 0x3FFF;
                                        }
                                        int var37 = class323.field4731[var36];
                                        int var38 = class323.field4733[var36];
                                        if (class306.field4454 != 4) {
                                            var37 = (class498.field7587 + 256) * var37 >> 8;
                                            var38 = (class498.field7587 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class306.field4454 == 4) {
                                            var41 = (class365.field5493 >> 7) + (var39 >> 2);
                                            var42 = (class52.field780 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class415.field6145.method1773(-126) - 1) * 64;
                                            var41 = (class415.field6145.field2959 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class415.field6145.field2966 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class288.field4128 && (class278.field3963 & 0x40) != 0) {
                                            class356 var44 = class236.method1433(class71.field1052, class303.field4394, (byte) 117);
                                            if (var44 == null) {
                                                class489.method2941(-1);
                                            } else {
                                                class495.method2974(true, 1L, 50, class457.field6660, -1, var41, var11.field5174, " ->", var42, false, class272.field3802);
                                            }
                                            continue;
                                        }
                                        if (class28.field486 == class156.field1996) {
                                            class495.method2974(true, 1L, 19, class278.field3961.method1220(2969, class81.field1122), -1, var41, -1, "", var42, false, -1);
                                        }
                                        class495.method2974(true, 1L, 58, class226.field3193, -1, var41, -1, "", var42, false, class138.field1807);
                                        continue;
                                    }
                                    if (class354.field5118 == var11.field5192) {
                                        class26.field431 = var11;
                                        if (var21) {
                                            class258.field3698 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1018(-30361) - var12 - var11.field5168 / 2) * 2.0D / (double) class249.field3581);
                                            int var46 = (int) (-((double) (var24.method1019((byte) -89) - var13 - var11.field5169 / 2) * 2.0D / (double) class249.field3581));
                                            int var47 = class192.field2715 + var45 + class249.field3584;
                                            int var48 = class364.field5477 + var46 + class249.field3604;
                                            class248 var49 = class375.method2277(30);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1543(var50, var48, var47, -21161);
                                            if (var50 != null) {
                                                if (class489.field7484.method1877(124, 82) && class118.field1535 > 0) {
                                                    class508.method3060(var50[2], var50[1], (byte) -73, var50[0]);
                                                    continue;
                                                }
                                                class165.field2159 = true;
                                                class444.field6478 = var50[0];
                                                class409.field6003 = var50[1];
                                                class211.field2996 = var50[2];
                                            }
                                            class184.field2605 = 1;
                                            class136.field1747 = false;
                                            class117.field1518 = class137.field1797.method2038(9);
                                            class389.field5776 = class137.field1797.method2044((byte) -110);
                                            continue;
                                        }
                                        if (var22 && class184.field2605 > 0) {
                                            if (class184.field2605 == 1 && (class117.field1518 != class137.field1797.method2038(9) || class389.field5776 != class137.field1797.method2044((byte) -115))) {
                                                class131.field1682 = class192.field2715;
                                                class435.field6378 = class364.field5477;
                                                class184.field2605 = 2;
                                            }
                                            if (class184.field2605 == 2) {
                                                class136.field1747 = true;
                                                class295.method1796(class131.field1682 + (int) ((double) (class117.field1518 - class137.field1797.method2038(9)) * 2.0D / (double) class249.field3576), -22589);
                                                class278.method1700(class435.field6378 - (int) ((double) (class389.field5776 - class137.field1797.method2044((byte) -112)) * 2.0D / (double) class249.field3576), (byte) -61);
                                            }
                                            continue;
                                        }
                                        if (class184.field2605 > 0 && !class136.field1747) {
                                            if ((class318.field4671 == 1 || class53.method404(-1)) && class383.field5696 > 2) {
                                                class170.method1077(class389.field5776, class117.field1518, 5486);
                                            } else if (class43.method319((byte) 63)) {
                                                class170.method1077(class389.field5776, class117.field1518, 5486);
                                            }
                                        }
                                        class184.field2605 = 0;
                                        continue;
                                    }
                                    if (class381.field5679 == var11.field5192) {
                                        if (var22) {
                                            class374.method2273(var11.field5168, class137.field1797.method2038(9) - var12, 30504, var11.field5169, class137.field1797.method2044((byte) -50) - var13);
                                        }
                                        continue;
                                    }
                                    if (class411.field6028 == var11.field5192) {
                                        class65.method458(var11, var13, var12, -119);
                                        continue;
                                    }
                                }
                                if (!var11.field5190 && var23) {
                                    var11.field5190 = true;
                                    if (var11.field5167 != null) {
                                        class99 var51 = new class99();
                                        var51.field1344 = true;
                                        var51.field1343 = var11;
                                        var51.field1345 = var24.method1018(-30361) - var12;
                                        var51.field1351 = var24.method1019((byte) -88) - var13;
                                        var51.field1346 = var11.field5167;
                                        class300.field4355.method2086((byte) -115, var51);
                                    }
                                }
                                if (var11.field5190 && var22 && var11.field5142 != null) {
                                    class99 var52 = new class99();
                                    var52.field1344 = true;
                                    var52.field1343 = var11;
                                    var52.field1345 = class137.field1797.method2038(9) - var12;
                                    var52.field1351 = class137.field1797.method2044((byte) -32) - var13;
                                    var52.field1346 = var11.field5142;
                                    class300.field4355.method2086((byte) -124, var52);
                                }
                                if (var11.field5190 && !var22) {
                                    var11.field5190 = false;
                                    if (var11.field5228 != null) {
                                        class99 var53 = new class99();
                                        var53.field1344 = true;
                                        var53.field1343 = var11;
                                        var53.field1345 = class137.field1797.method2038(9) - var12;
                                        var53.field1351 = class137.field1797.method2044((byte) -71) - var13;
                                        var53.field1346 = var11.field5228;
                                        class358.field5308.method2086((byte) -113, var53);
                                    }
                                }
                                if (var22 && var11.field5220 != null) {
                                    class99 var54 = new class99();
                                    var54.field1344 = true;
                                    var54.field1343 = var11;
                                    var54.field1345 = class137.field1797.method2038(9) - var12;
                                    var54.field1351 = class137.field1797.method2044((byte) -104) - var13;
                                    var54.field1346 = var11.field5220;
                                    class300.field4355.method2086((byte) -126, var54);
                                }
                                if (!var11.field5277 && var21) {
                                    var11.field5277 = true;
                                    if (var11.field5292 != null) {
                                        class99 var55 = new class99();
                                        var55.field1344 = true;
                                        var55.field1343 = var11;
                                        var55.field1345 = class137.field1797.method2038(9) - var12;
                                        var55.field1351 = class137.field1797.method2044((byte) -80) - var13;
                                        var55.field1346 = var11.field5292;
                                        class300.field4355.method2086((byte) -120, var55);
                                    }
                                }
                                if (var11.field5277 && var21 && var11.field5133 != null) {
                                    class99 var56 = new class99();
                                    var56.field1344 = true;
                                    var56.field1343 = var11;
                                    var56.field1345 = class137.field1797.method2038(9) - var12;
                                    var56.field1351 = class137.field1797.method2044((byte) -32) - var13;
                                    var56.field1346 = var11.field5133;
                                    class300.field4355.method2086((byte) -115, var56);
                                }
                                if (var11.field5277 && !var21) {
                                    var11.field5277 = false;
                                    if (var11.field5203 != null) {
                                        class99 var57 = new class99();
                                        var57.field1344 = true;
                                        var57.field1343 = var11;
                                        var57.field1345 = class137.field1797.method2038(9) - var12;
                                        var57.field1351 = class137.field1797.method2044((byte) -43) - var13;
                                        var57.field1346 = var11.field5203;
                                        class358.field5308.method2086((byte) -125, var57);
                                    }
                                }
                                if (var11.field5186 != null) {
                                    class99 var58 = new class99();
                                    var58.field1343 = var11;
                                    var58.field1346 = var11.field5186;
                                    class497.field7569.method2086((byte) -125, var58);
                                }
                                if (var11.field5136 != null && class239.field3352 > var11.field5130) {
                                    if (var11.field5266 == null || class239.field3352 - var11.field5130 > 32) {
                                        class99 var63 = new class99();
                                        var63.field1343 = var11;
                                        var63.field1346 = var11.field5136;
                                        class300.field4355.method2086((byte) -125, var63);
                                    } else {
                                        label691: for (int var59 = var11.field5130; var59 < class239.field3352; var59++) {
                                            int var60 = class258.field3686[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field5266.length; var61++) {
                                                if (var11.field5266[var61] == var60) {
                                                    class99 var62 = new class99();
                                                    var62.field1343 = var11;
                                                    var62.field1346 = var11.field5136;
                                                    class300.field4355.method2086((byte) -122, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5130 = class239.field3352;
                                }
                                if (var11.field5223 != null && class267.field3771 > var11.field5182) {
                                    if (var11.field5236 == null || class267.field3771 - var11.field5182 > 32) {
                                        class99 var68 = new class99();
                                        var68.field1343 = var11;
                                        var68.field1346 = var11.field5223;
                                        class300.field4355.method2086((byte) -128, var68);
                                    } else {
                                        label667: for (int var64 = var11.field5182; var64 < class267.field3771; var64++) {
                                            int var65 = class492.field7518[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field5236.length; var66++) {
                                                if (var11.field5236[var66] == var65) {
                                                    class99 var67 = new class99();
                                                    var67.field1343 = var11;
                                                    var67.field1346 = var11.field5223;
                                                    class300.field4355.method2086((byte) -114, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5182 = class267.field3771;
                                }
                                if (var11.field5227 != null && class219.field3073 > var11.field5272) {
                                    if (var11.field5149 == null || class219.field3073 - var11.field5272 > 32) {
                                        class99 var73 = new class99();
                                        var73.field1343 = var11;
                                        var73.field1346 = var11.field5227;
                                        class300.field4355.method2086((byte) -111, var73);
                                    } else {
                                        label643: for (int var69 = var11.field5272; var69 < class219.field3073; var69++) {
                                            int var70 = class359.field5331[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field5149.length; var71++) {
                                                if (var11.field5149[var71] == var70) {
                                                    class99 var72 = new class99();
                                                    var72.field1343 = var11;
                                                    var72.field1346 = var11.field5227;
                                                    class300.field4355.method2086((byte) -117, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5272 = class219.field3073;
                                }
                                if (var11.field5131 != null && class437.field6392 > var11.field5290) {
                                    if (var11.field5181 == null || class437.field6392 - var11.field5290 > 32) {
                                        class99 var78 = new class99();
                                        var78.field1343 = var11;
                                        var78.field1346 = var11.field5131;
                                        class300.field4355.method2086((byte) -123, var78);
                                    } else {
                                        label619: for (int var74 = var11.field5290; var74 < class437.field6392; var74++) {
                                            int var75 = class508.field7745[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field5181.length; var76++) {
                                                if (var11.field5181[var76] == var75) {
                                                    class99 var77 = new class99();
                                                    var77.field1343 = var11;
                                                    var77.field1346 = var11.field5131;
                                                    class300.field4355.method2086((byte) -116, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5290 = class437.field6392;
                                }
                                if (var11.field5199 != null && class172.field2351 > var11.field5194) {
                                    if (var11.field5274 == null || class172.field2351 - var11.field5194 > 32) {
                                        class99 var83 = new class99();
                                        var83.field1343 = var11;
                                        var83.field1346 = var11.field5199;
                                        class300.field4355.method2086((byte) -113, var83);
                                    } else {
                                        label595: for (int var79 = var11.field5194; var79 < class172.field2351; var79++) {
                                            int var80 = class442.field6454[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field5274.length; var81++) {
                                                if (var11.field5274[var81] == var80) {
                                                    class99 var82 = new class99();
                                                    var82.field1343 = var11;
                                                    var82.field1346 = var11.field5199;
                                                    class300.field4355.method2086((byte) -122, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5194 = class172.field2351;
                                }
                                if (class40.field617 > var11.field5258 && var11.field5249 != null) {
                                    class99 var84 = new class99();
                                    var84.field1343 = var11;
                                    var84.field1346 = var11.field5249;
                                    class300.field4355.method2086((byte) -114, var84);
                                }
                                if (class145.field1888 > var11.field5258 && var11.field5210 != null) {
                                    class99 var85 = new class99();
                                    var85.field1343 = var11;
                                    var85.field1346 = var11.field5210;
                                    class300.field4355.method2086((byte) -127, var85);
                                }
                                if (class294.field4255 > var11.field5258 && var11.field5138 != null) {
                                    class99 var86 = new class99();
                                    var86.field1343 = var11;
                                    var86.field1346 = var11.field5138;
                                    class300.field4355.method2086((byte) -112, var86);
                                }
                                if (class19.field269 > var11.field5258 && var11.field5254 != null) {
                                    class99 var87 = new class99();
                                    var87.field1343 = var11;
                                    var87.field1346 = var11.field5254;
                                    class300.field4355.method2086((byte) -115, var87);
                                }
                                if (class28.field470 > var11.field5258 && var11.field5140 != null) {
                                    class99 var88 = new class99();
                                    var88.field1343 = var11;
                                    var88.field1346 = var11.field5140;
                                    class300.field4355.method2086((byte) -127, var88);
                                }
                                var11.field5258 = class490.field7491;
                                if (var11.field5237 != null) {
                                    for (int var89 = 0; var89 < class406.field5954; var89++) {
                                        class99 var90 = new class99();
                                        var90.field1343 = var11;
                                        var90.field1355 = class227.field3200[var89].method574(250);
                                        var90.field1342 = class227.field3200[var89].method575(26283);
                                        var90.field1346 = var11.field5237;
                                        class300.field4355.method2086((byte) -119, var90);
                                    }
                                }
                                if (class184.field2606 && var11.field5261 != null) {
                                    class99 var91 = new class99();
                                    var91.field1343 = var11;
                                    var91.field1346 = var11.field5261;
                                    class300.field4355.method2086((byte) -126, var91);
                                }
                            }
                            if (var11.field5170 == 5 && var11.field5231 != -1) {
                                var11.method2160((byte) 75, class75.field1067, class66.field988).method593(true, var11.field5169, class481.field6937);
                            }
                            class298.method1806(0, var11);
                            if (var11.field5170 == 0) {
                                method1181(arg0, var11.field5185, var14, var15, var16, var17, var12 - var11.field5219, var13 - var11.field5144, arg8, arg9);
                                if (var11.field5151 != null) {
                                    method1181(var11.field5151, var11.field5185, var14, var15, var16, var17, var12 - var11.field5219, var13 - var11.field5144, arg8, arg9);
                                }
                                class311 var92 = (class311) class213.field3010.method2310((byte) -96, (long) var11.field5185);
                                if (var92 != null) {
                                    if (class459.field6684 == class156.field1996 && var92.field4526 == 0 && !class174.field2387 && var21 && !class27.field438) {
                                        class190.method1200(107);
                                    }
                                    class235.method1426(var16, var15, arg9, var92.field4525, var14, -120, var13, var12, var17, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class298.method1806(0, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1182() {
        class70.field1026 = 0;
        for (int var0 = 0; var0 < class339.field4942; var0++) {
            class139 var1 = class504.field7697[class263.field3749[var0]];
            if (var1.field4185 && var1.method880(false) != -1) {
                int var2 = (var1.method1773(-99) - 1) * 64 + 60;
                int var3 = var1.field2959 - var2 >> 7;
                int var4 = var1.field2966 - var2 >> 7;
                class294 var5 = class387.method2324(60, var1.field2956, var4, var3);
                if (var5 != null) {
                    int var6 = var5.field4262;
                    if (var5 instanceof class139) {
                        var6 += 2048;
                    }
                    if (var5.field4245 == 0 && var5.method880(false) != -1) {
                        class52.field766[class70.field1026] = var6;
                        class481.field6940[class70.field1026] = var6;
                        class70.field1026++;
                        var5.field4245++;
                    }
                    class52.field766[class70.field1026] = var6;
                    class481.field6940[class70.field1026] = var1.field4262 + 2048;
                    class70.field1026++;
                    var5.field4245++;
                }
            }
        }
        class221.method1370((byte) -125, class481.field6940, class70.field1026 - 1, class52.field766, 0);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method1183(int arg0) {
        int var1 = class276.field3953;
        int[] var2 = class330.field4790;
        int var3 = class242.field3445 ? var1 : class339.field4942 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class294 var5;
            if (var4 < var1) {
                var5 = class262.field3742[var2[var4]];
            } else {
                var5 = class504.field7697[class263.field3749[var4 - var1]];
            }
            if (var5.field2956 == arg0) {
                var5.field4245 = 0;
                if (var5.field4264 < 0) {
                    var5.field4185 = false;
                } else {
                    int var6 = var5.method1773(-36);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field2959 & 0x7F) != 0 || (var5.field2966 & 0x7F) != 0) {
                            var5.field4185 = false;
                            continue;
                        }
                    } else if ((var5.field2959 & 0x7F) != 64 || (var5.field2966 & 0x7F) != 64) {
                        var5.field4185 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field2959 >> 7;
                        int var8 = var5.field2966 >> 7;
                        if (class381.field5678[var7][var8] != var5.field4264) {
                            var5.field4185 = true;
                            continue;
                        }
                        if (class90.field1237[var7][var8] > 1) {
                            var10002 = class90.field1237[var7][var8]--;
                            var5.field4185 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field2959 - var9 >> 7;
                        int var11 = var5.field2966 - var9 >> 7;
                        int var12 = var5.field2959 + var9 >> 7;
                        int var13 = var5.field2966 + var9 >> 7;
                        if (!class134.method759(var12, var11, var5.field4264, var13, var10, (byte) 115)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class381.field5678[var14][var15] == var5.field4264) {
                                        var10002 = class90.field1237[var14][var15]--;
                                    }
                                }
                            }
                            var5.field4185 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class313 && var5.field4283 != null && class263.field3748 >= var5.field4283.field2196 && class263.field3748 < var5.field4283.field2187) {
                        ((class313) var5).field4593 = false;
                    }
                    var5.field4185 = false;
                    var5.field2970 = class103.method620(var5.field2956, var5.field2966, (byte) 20, var5.field2959);
                    class76.method503(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1184() {
        for (int var0 = 0; var0 < class362.field5442; var0++) {
            int[] var1 = class381.field5678[var0];
            for (int var2 = 0; var2 < class203.field2813; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
    public static final int method1185(int arg0, int arg1) {
        field2658++;
        if (arg1 != -1875451670) {
            field2663 = null;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1186(int arg0) {
        field2668++;
        if (class397.field5865 < class90.field1238.field6620) {
            if (class389.field5780 == class140.field1834) {
                class140.field1834 = class265.field3762;
            } else {
                class140.field1834 = class389.field5780;
            }
            class484.field7018 = (class90.field1238.field6620 - 1) * 50 * 5;
            if (class484.field7018 > 3000) {
                class484.field7018 = 3000;
            }
            if (class90.field1238.field6620 >= 2 && class90.field1238.field6619 == 6) {
                this.method408("js5connect_outofdate", true);
                class323.field4729 = 1000;
                return;
            }
            if (class90.field1238.field6620 >= 4 && class90.field1238.field6619 == -1) {
                this.method408("js5crc", true);
                class323.field4729 = 1000;
                return;
            }
            if (class90.field1238.field6620 >= 4 && (class323.field4729 == 0 || class323.field4729 == 5)) {
                if (class90.field1238.field6619 == 7 || class90.field1238.field6619 == 9) {
                    this.method408("js5connect_full", true);
                } else if (class90.field1238.field6619 > 0) {
                    this.method408("js5connect", true);
                } else {
                    this.method408("js5io", true);
                }
                class323.field4729 = 1000;
                return;
            }
        }
        class397.field5865 = class90.field1238.field6620;
        if (class484.field7018 > 0) {
            class484.field7018--;
            return;
        }
        try {
            if (class122.field1599 == 0) {
                class25.field413 = class86.field1182.method333(class140.field1834, (byte) 111, class406.field5955);
                class122.field1599++;
            }
            if (class122.field1599 == 1) {
                if (class25.field413.field6417 == 2) {
                    this.method1176(true, 1000);
                    return;
                }
                if (class25.field413.field6417 == 1) {
                    class122.field1599++;
                }
            }
            if (class122.field1599 == 2) {
                class350.field5084 = new class350((Socket) class25.field413.field6416, class86.field1182);
                class156 var2 = new class156(5);
                var2.method947(-67, class58.field890.field5608);
                var2.method969(19869, 582);
                class350.field5084.method2121(5, var2.field2041, false, 0);
                class122.field1599++;
                class210.field2969 = class109.method653(false);
            }
            if (arg0 != 4) {
                field2674 = -71;
            }
            if (class122.field1599 == 3) {
                if (class323.field4729 == 0 || class323.field4729 == 5 || class350.field5084.method2120(105) > 0) {
                    int var3 = class350.field5084.method2122((byte) -37);
                    if (var3 != 0) {
                        this.method1176(true, var3);
                        return;
                    }
                    class122.field1599++;
                } else if (class109.method653(false) - class210.field2969 > 30000L) {
                    this.method1176(true, 1001);
                    return;
                }
            }
            if (class122.field1599 == 4) {
                boolean var4 = class323.field4729 == 5 || class323.field4729 == 10 || class323.field4729 == 28;
                class90.field1238.method2648((byte) -127, !var4, class350.field5084);
                class122.field1599 = 0;
                class25.field413 = null;
                class350.field5084 = null;
            }
        } catch (IOException var5) {
            this.method1176(true, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static void method1187(boolean arg0) {
        field2663 = null;
        if (arg0) {
            field2663 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2661++;
        if (!this.method409(-120)) {
            return;
        }
        class397.field5860 = Integer.parseInt(this.getParameter("worldid"));
        class371.field5567 = class187.method1174(Integer.parseInt(this.getParameter("modewhere")), 112);
        if (!class171.method1081(class371.field5567, 53) && class371.field5567 != class339.field4941) {
            class371.field5567 = class339.field4941;
        }
        class373.field5581 = class23.method160(Integer.parseInt(this.getParameter("modewhat")), 21901);
        if (class507.field7729 != class373.field5581 && class373.field5581 != class26.field436 && class373.field5581 != class178.field2564) {
            class373.field5581 = class178.field2564;
        }
        try {
            class81.field1122 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class81.field1122 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class32.field535 = true;
        } else {
            class32.field535 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class242.field3446 = true;
        } else {
            class242.field3446 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class159.field2070 = true;
        } else {
            class159.field2070 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class156.field1996 = class28.field486;
        } else {
            class156.field1996 = class459.field6684;
        }
        try {
            class111.field1456 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class111.field1456 = 0;
        }
        class422.field6234 = this.getParameter("quiturl");
        class477.field6870 = this.getParameter("settings");
        if (class477.field6870 == null) {
            class477.field6870 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class359.field5332 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class359.field5332 = 0;
            }
        }
        class181.field2594 = Integer.parseInt(this.getParameter("colourid"));
        if (class181.field2594 < 0 || class181.field2594 >= class337.field4904.length) {
            class181.field2594 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class387.field5743 = true;
            class460.field6686 = true;
        }
        if (class459.field6684 == class156.field1996) {
            class427.field6289 = 765;
            class160.field2084 = 503;
        } else if (class28.field486 == class156.field1996) {
            class160.field2084 = 480;
            class427.field6289 = 640;
        }
        class114.field1473 = this;
        this.method392(class160.field2084, class373.field5581.method2719((byte) -123) + 32, class427.field6289, 582, -25607);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lts;)Lcp;")
    public static final class489 method1188(class356 arg0) {
        class489 var1 = (class489) class7.field130.method2310((byte) -64, ((long) arg0.field5185 << 32) + (long) arg0.field5184);
        return var1 == null ? arg0.field5280 : var1;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1189(byte arg0) {
        if (arg0 > -75) {
            field2674 = -44;
        }
        field2662++;
        boolean var2 = class90.field1238.method2645(61);
        if (!var2) {
            this.method1186(4);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class166.method1045(-80, "argument count");
            }
            class397.field5860 = Integer.parseInt(arg0[0]);
            class371.field5567 = class355.field5129;
            if (arg0[1].equals("live")) {
                class373.field5581 = class178.field2564;
            } else if (arg0[1].equals("rc")) {
                class373.field5581 = class26.field436;
            } else if (arg0[1].equals("wip")) {
                class373.field5581 = class507.field7729;
            } else {
                class166.method1045(-57, "modewhat");
            }
            class81.field1122 = class251.method1575(arg0[2], (byte) -127);
            if (class81.field1122 == -1) {
                if (arg0[2].equals("english")) {
                    class81.field1122 = 0;
                } else if (arg0[2].equals("german")) {
                    class81.field1122 = 1;
                } else {
                    class166.method1045(-91, "language");
                }
            }
            class242.field3446 = false;
            class32.field535 = false;
            if (arg0[3].equals("game0")) {
                class156.field1996 = class459.field6684;
            } else if (arg0[3].equals("game1")) {
                class156.field1996 = class28.field486;
            } else {
                class166.method1045(-112, "game");
            }
            class111.field1456 = 0;
            class387.field5743 = true;
            class460.field6686 = true;
            class477.field6870 = "";
            class181.field2594 = class156.field1996.field4337;
            class359.field5332 = 0;
            client var1 = new client();
            class114.field1473 = var1;
            var1.method398(false, class156.field1996.field4339, 582, class373.field5581.method2719((byte) 69) + 32, 768, 1024, -25609, 30);
            class75.field1066.setLocation(40, 40);
        } catch (Exception var3) {
            class356.method2169(var3, null, (byte) 34);
        }
        field2671++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method407(int arg0) {
        field2664++;
        if (class323.field4729 == 1000) {
            return;
        }
        long var2 = class86.method537((byte) 14) / 1000000L - class482.field6953;
        class482.field6953 = class86.method537((byte) 14) / 1000000L;
        boolean var4 = class131.method720(arg0 + 1);
        if (var4 && class286.field4089 && class121.field1587 != null) {
            class121.field1587.method1711(true);
        }
        if (class323.field4729 == 30 || class323.field4729 == 10) {
            if (class84.field1159 != 0L && class84.field1159 < class109.method653(false)) {
                class208.method1284(class262.method1618(-29489), class118.field1533.field6893, class118.field1533.field6878, false, 106);
            } else if (!class481.field6937.method736() && class115.field1479) {
                class86.method540((byte) -33);
            }
        }
        if (class217.field3043 == null) {
            Container var5;
            if (class75.field1066 == null) {
                var5 = class86.field1182.field668;
            } else {
                var5 = class75.field1066;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class75.field1066 == var5) {
                Insets var8 = class75.field1066.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class452.field6577 != var6 || class380.field5667 != var7) {
                if (class481.field6937 == null || class481.field6937.method816()) {
                    class381.method2301((byte) -112);
                } else {
                    class380.field5667 = var7;
                    class452.field6577 = var6;
                }
                class84.field1159 = class109.method653(false) + 500L;
            }
        }
        if (class217.field3043 != null && !class145.field1886 && (class323.field4729 == 30 || class323.field4729 == 10)) {
            class208.method1284(class118.field1533.field6877, -1, -1, false, arg0 ^ 0xFFFFFFA6);
        }
        boolean var9 = false;
        if (class442.field6466) {
            var9 = true;
            class442.field6466 = false;
        }
        if (var9) {
            class270.method1650(-24453);
        }
        if (class481.field6937 != null && class481.field6937.method736() || class262.method1618(-29489) != 1) {
            class176.method1103(arg0);
        }
        if (class323.field4729 == arg0) {
            class185.method1163((byte) 115, class64.field963, var9, class438.field6409[class181.field2594], class477.field6874, class337.field4904[class181.field2594], class152.field1953[class181.field2594]);
        } else if (class323.field4729 == 5) {
            class114.method664(class481.field6937.method736() | var9, class458.field6676, class337.field4904[class181.field2594].getRGB(), class152.field1953[class181.field2594].getRGB(), class438.field6409[class181.field2594].getRGB(), class481.field6937, -38);
        } else if (class323.field4729 == 10) {
            class361.method2193(-32);
        } else if (class323.field4729 == 25 || class323.field4729 == 28) {
            if (class376.field5625 == 1) {
                if (class374.field5601 < class120.field1567) {
                    class374.field5601 = class120.field1567;
                }
                int var11 = (class374.field5601 - class120.field1567) * 50 / class374.field5601;
                class475.method2783(class181.field2587, class489.field7488.method1220(arg0 ^ 0xB99, class81.field1122) + "<br>(" + var11 + "%)", true, arg0 ^ 0x6);
            } else if (class376.field5625 == 2) {
                if (class507.field7740 > class411.field6031) {
                    class411.field6031 = class507.field7740;
                }
                int var10 = (class411.field6031 - class507.field7740) * 50 / class411.field6031 + 50;
                class475.method2783(class181.field2587, class489.field7488.method1220(2969, class81.field1122) + "<br>(" + var10 + "%)", true, 6);
            } else {
                class475.method2783(class181.field2587, class489.field7488.method1220(arg0 ^ 0xB99, class81.field1122), true, arg0 + 6);
            }
        } else if (class323.field4729 == 30) {
            class178.method1133((byte) 48, var2);
        } else if (class323.field4729 == 40) {
            class475.method2783(class181.field2587, class158.field2066.method1220(2969, class81.field1122) + "<br>" + class374.field5598.method1220(2969, class81.field1122), true, 6);
        }
        if (class78.field1099 == 3) {
            for (int var12 = 0; var12 < class55.field845; var12++) {
                Rectangle var13 = class309.field4495[var12];
                if (class193.field2738[var12]) {
                    class481.field6937.method801(arg0 ^ 0xFFFFE61F, var13.width, var13.y, -1996553985, var13.x, var13.height);
                } else if (class187.field2653[var12]) {
                    class481.field6937.method801(-6625, var13.width, var13.y, -1996554240, var13.x, var13.height);
                }
            }
        }
        if (class25.method220((byte) -44)) {
            class138.method868(class481.field6937, (byte) -128);
        }
        if ((class323.field4729 == 30 || class323.field4729 == 10) && class78.field1099 == 0 && class262.method1618(arg0 - 29489) == 1 && !var9 && class44.field669.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class55.field845; var15++) {
                if (class187.field2653[var15]) {
                    class187.field2653[var15] = false;
                    class141.field1847[var14++] = class309.field4495[var15];
                }
            }
            class481.field6937.method760(class141.field1847, var14);
        } else if (class323.field4729 != 0) {
            class481.field6937.method743();
            for (int var16 = 0; var16 < class55.field845; var16++) {
                class187.field2653[var16] = false;
            }
        }
        if (class118.field1533.field6881 == 0) {
            class322.method1935(true, 15L);
        } else if (class118.field1533.field6881 == 1) {
            class322.method1935(true, 10L);
        } else if (class118.field1533.field6881 == 2) {
            class322.method1935(true, 5L);
        } else if (class118.field1533.field6881 == 3) {
            class322.method1935(true, 2L);
        }
        if (class111.field1455) {
            class30.method248(-104);
        }
        if (class118.field1533.field6894 && class323.field4729 == 10 && class465.field6737 != -1) {
            class118.field1533.field6894 = false;
            class118.field1533.method2960(105, class86.field1182);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method1190(int arg0) {
        int var1 = class276.field3953;
        int[] var2 = class330.field4790;
        for (int var3 = 0; var3 < class339.field4942 + var1; var3++) {
            class294 var4;
            if (var3 < var1) {
                var4 = class262.field3742[var2[var3]];
            } else {
                var4 = class504.field7697[class263.field3749[var3 - var1]];
            }
            if (var4.field2956 == arg0 && var4.field4264 >= 0) {
                int var5 = var4.method1773(-44);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2959 & 0x7F) != 0 || (var4.field2966 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field2959 & 0x7F) != 64 || (var4.field2966 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field2959 >> 7;
                    int var7 = var4.field2966 >> 7;
                    if (var4.field4264 > class381.field5678[var6][var7]) {
                        class381.field5678[var6][var7] = var4.field4264;
                        class90.field1237[var6][var7] = 1;
                    } else if (class381.field5678[var6][var7] == var4.field4264) {
                        var10002 = class90.field1237[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field2959 - var8 >> 7;
                    int var10 = var4.field2966 - var8 >> 7;
                    int var11 = var4.field2959 + var8 >> 7;
                    int var12 = var4.field2966 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field4264 > class381.field5678[var13][var14]) {
                                class381.field5678[var13][var14] = var4.field4264;
                                class90.field1237[var13][var14] = 1;
                            } else if (class381.field5678[var13][var14] == var4.field4264) {
                                var10002 = class90.field1237[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method401(int arg0) {
        field2660++;
        if (class323.field4729 == 1000) {
            return;
        }
        class263.field3748++;
        if (class263.field3748 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class58.field902 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class134.field1708.setSeed((long) class58.field902);
        }
        if (class263.field3748 % 50 == 0) {
            class363.field5457 = class472.field6826;
            class472.field6826 = 0;
            class167.field2189 = class216.field3035;
            class216.field3035 = 0;
        }
        this.method1189((byte) -113);
        if (class138.field1802 != null) {
            class138.field1802.method2550(0);
        }
        class500.method3010((byte) -76);
        class489.field7484.method1872(arg0 ^ 0xFFFF90BB);
        if (arg0 != -28451) {
            field2663 = null;
        }
        class137.field1797.method2034(85);
        if (class212.field3009 != null) {
            int var3 = class212.field3009.method492(-118);
            class193.field2735 = var3;
        }
        if (class481.field6937 != null) {
            class481.field6937.method833((int) class109.method653(false));
        }
        class449.method2619((byte) -1);
        class406.field5954 = 0;
        for (class93 var4 = class489.field7484.method1876(true); var4 != null && class406.field5954 < 128; var4 = class489.field7484.method1876(true)) {
            if (var4.method576((byte) -121) != 1) {
                char var5 = var4.method575(26283);
                if (!class112.method661(2) || var5 != '`' && var5 != '§') {
                    class227.field3200[class406.field5954] = var4;
                    class406.field5954++;
                } else if (class25.method220((byte) -27)) {
                    class336.method2029(-111);
                } else {
                    class42.method313((byte) 89);
                }
            }
        }
        for (class270 var6 = class137.field1797.method2039(16); var6 != null; var6 = class137.field1797.method2039(arg0 + 28467)) {
            int var7 = var6.method1015(0);
            if (var7 == -1) {
                class54.field842.method2086((byte) -116, var6);
            } else if (class376.method2283(4829, var7)) {
                class265.field3759.method2086((byte) -123, var6);
            }
            if (class265.field3759.method2085(-18021) > 10) {
                class265.field3759.method2093(-10805);
            }
        }
        if (class25.method220((byte) -86)) {
            class484.method2825(false);
        }
        if (class323.field4729 == 0) {
            this.method1192(arg0 + 28347);
            class472.method2757(0);
        } else if (class323.field4729 == 5) {
            this.method1192(-122);
            class472.method2757(0);
        } else if (class323.field4729 == 25 || class323.field4729 == 28) {
            class158.method1012(-30179);
        }
        if (class323.field4729 == 10) {
            this.method1178((byte) -27);
            class468.method2741(127);
            class499.method3007((byte) -68);
            class174.method1093(0);
        } else if (class323.field4729 == 30) {
            class186.method1169(30000);
        } else if (class323.field4729 == 40) {
            class174.method1093(arg0 ^ 0xFFFF90DD);
            if (class384.field5705 != -3 && class384.field5705 != 2 && class384.field5705 != 15) {
                class202.method1246((byte) -102);
            }
        }
        class370.method2253((byte) -19, class481.field6937);
        class265.field3759.method2093(arg0 ^ 0x4516);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lts;)Z")
    public static final boolean method1191(class356 arg0) {
        if (class27.field438) {
            if (method1188(arg0).field7487 != 0) {
                return false;
            }
            if (arg0.field5170 == 0) {
                return false;
            }
        }
        return arg0.field5159;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method1192(int arg0) {
        if (!class118.field1533.field6894) {
            for (int var2 = 0; var2 < class406.field5954; var2++) {
                if (class227.field3200[var2].method575(26283) == 's' || class227.field3200[var2].method575(26283) == 'S') {
                    class118.field1533.field6894 = true;
                    break;
                }
            }
        }
        field2670++;
        if (class201.field2792 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class109.method653(false);
            if (class252.field3641 == 0L) {
                class252.field3641 = var5;
            }
            if (var4 > 16384 && var5 - class252.field3641 < 5000L) {
                if (var5 - class341.field4957 > 1000L) {
                    System.gc();
                    class341.field4957 = var5;
                }
                class477.field6874 = class28.field452.method1220(2969, class81.field1122);
                class64.field963 = 5;
            } else {
                class477.field6874 = class422.field6224.method1220(2969, class81.field1122);
                class64.field963 = 5;
                class201.field2792 = 10;
            }
        } else if (class201.field2792 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class169.field2234[var7] = class106.method635(class362.field5442, false, class203.field2813);
            }
            class477.field6874 = class406.field5952.method1220(2969, class81.field1122);
            class201.field2792 = 20;
            class64.field963 = 10;
        } else if (class201.field2792 == 20) {
            if (class138.field1802 == null) {
                class138.field1802 = new class428(class90.field1238, class493.field7529);
            }
            if (class138.field1802.method2548(15286)) {
                class226.field3190 = class216.method1333(1, 2852, 0, false, true);
                class275.field3937 = class216.method1333(1, 2852, 1, false, true);
                class235.field3308 = class216.method1333(1, 2852, 2, false, true);
                class285.field4074 = class216.method1333(1, 2852, 3, false, true);
                class238.field3338 = class216.method1333(1, 2852, 4, false, true);
                class67.field1004 = class216.method1333(1, 2852, 5, true, true);
                class389.field5781 = class216.method1333(1, 2852, 6, true, false);
                class212.field3005 = class216.method1333(1, 2852, 7, false, true);
                class445.field6482 = class216.method1333(1, 2852, 8, false, true);
                class337.field4916 = class216.method1333(1, 2852, 9, false, true);
                class456.field6643 = class216.method1333(1, 2852, 10, false, true);
                class158.field2064 = class216.method1333(1, 2852, 11, false, true);
                class336.field4868 = class216.method1333(1, 2852, 12, false, true);
                class1.field1 = class216.method1333(1, 2852, 13, false, true);
                class469.field6782 = class216.method1333(1, 2852, 14, false, false);
                class380.field5671 = class216.method1333(1, 2852, 15, false, true);
                class211.field2979 = class216.method1333(1, 2852, 16, false, true);
                class70.field1035 = class216.method1333(1, 2852, 17, false, true);
                class192.field2719 = class216.method1333(1, 2852, 18, false, true);
                class8.field136 = class216.method1333(1, 2852, 19, false, true);
                class69.field1020 = class216.method1333(1, 2852, 20, false, true);
                class3.field47 = class216.method1333(1, 2852, 21, false, true);
                class271.field3784 = class216.method1333(1, 2852, 22, false, true);
                class56.field881 = class216.method1333(1, 2852, 23, true, true);
                class317.field4657 = class216.method1333(1, 2852, 24, false, true);
                class310.field4515 = class216.method1333(1, 2852, 25, false, true);
                class444.field6480 = class216.method1333(1, 2852, 26, true, true);
                class38.field589 = class216.method1333(1, 2852, 27, false, true);
                class184.field2614 = class216.method1333(1, 2852, 28, true, true);
                class411.field6026 = class216.method1333(1, 2852, 29, false, true);
                class477.field6874 = class191.field2707.method1220(2969, class81.field1122);
                class201.field2792 = 30;
                class64.field963 = 15;
            } else {
                class477.field6874 = class319.field4685.method1220(2969, class81.field1122);
                class64.field963 = 12;
            }
        } else if (class201.field2792 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class375.field5606[var9].method1418((byte) 10) * class83.field1133[var9] / 100;
            }
            if (var8 == 100) {
                class477.field6874 = class169.field2232.method1220(2969, class81.field1122);
                class64.field963 = 20;
                class500.method3012(class445.field6482, -22569);
                class388.method2326((byte) 87, class445.field6482);
                class201.field2792 = 40;
            } else {
                if (var8 != 0) {
                    class477.field6874 = class235.field3304.method1220(2969, class81.field1122) + var8 + "%";
                }
                class64.field963 = 20;
            }
        } else if (class201.field2792 == 40) {
            if (class184.field2614.method1448(-14605)) {
                this.method1177(-128, class184.field2614.method1465(0, 1));
                class477.field6874 = class56.field879.method1220(2969, class81.field1122);
                class64.field963 = 25;
                class201.field2792 = 50;
            } else {
                class477.field6874 = class282.field4027.method1220(2969, class81.field1122) + class184.field2614.method1452(false) + "%";
                class64.field963 = 25;
            }
        } else if (class201.field2792 == 50) {
            class477.method2786(-1);
            class477.field6874 = class90.field1224.method1220(2969, class81.field1122);
            class201.field2792 = 60;
            class64.field963 = 30;
        } else if (class201.field2792 == 60) {
            int var10 = class477.method2787((byte) 20, class445.field6482, class1.field1);
            int var11 = class465.method2723(28);
            if (var11 > var10) {
                class477.field6874 = class334.field4844.method1220(2969, class81.field1122) + var10 * 100 / var11 + "%";
                class64.field963 = 35;
            } else {
                class477.field6874 = class313.field4559.method1220(2969, class81.field1122);
                class64.field963 = 35;
                class201.field2792 = 70;
            }
        } else {
            int var12 = -81 / ((-arg0 - 32) / 52);
            if (class201.field2792 == 70) {
                int var13 = class107.method639(class445.field6482, -26432);
                int var14 = class58.method427((byte) 127);
                if (var14 > var13) {
                    class477.field6874 = class27.field446.method1220(2969, class81.field1122) + var13 * 100 / var14 + "%";
                    class64.field963 = 40;
                } else {
                    class477.field6874 = class35.field555.method1220(2969, class81.field1122);
                    class64.field963 = 40;
                    class201.field2792 = 80;
                }
            } else if (class201.field2792 == 80) {
                if (class444.field6480.method1448(-14605)) {
                    class147.field1916 = new class133(class444.field6480, class337.field4916, class445.field6482);
                    class477.field6874 = class306.field4455.method1220(2969, class81.field1122);
                    class201.field2792 = 90;
                    class64.field963 = 45;
                } else {
                    class477.field6874 = class3.field49.method1220(2969, class81.field1122) + class444.field6480.method1452(false) + "%";
                    class64.field963 = 45;
                }
            } else if (class201.field2792 == 90) {
                class477.field6874 = class87.field1199.method1220(2969, class81.field1122);
                class64.field963 = 50;
                class201.field2792 = 95;
            } else if (class201.field2792 == 95) {
                if (class118.field1533.field6894) {
                    class118.field1533.field6905 = 0;
                    class118.field1533.field6902 = 0;
                    class118.field1533.field6877 = 1;
                    class118.field1533.field6895 = 0;
                    class118.field1533.field6904 = 0;
                }
                class118.field1533.field6894 = true;
                class118.field1533.method2960(103, class86.field1182);
                class204.method1259(class118.field1533.field6895, false, false);
                class477.field6874 = class246.field3529.method1220(2969, class81.field1122);
                class64.field963 = 55;
                class201.field2792 = 100;
            } else if (class201.field2792 == 100) {
                class479.method2800(0, class481.field6937, class445.field6482, class1.field1);
                class477.field6874 = class111.field1453.method1220(2969, class81.field1122);
                class64.field963 = 60;
                class319.method1921(15508, 5);
                class201.field2792 = 110;
            } else if (class201.field2792 == 110) {
                byte var15 = 0;
                class235.field3308.method1448(-14605);
                int var16 = var15 + class235.field3308.method1452(false);
                class211.field2979.method1448(-14605);
                int var17 = var16 + class211.field2979.method1452(false);
                class70.field1035.method1448(-14605);
                int var18 = var17 + class70.field1035.method1452(false);
                class192.field2719.method1448(-14605);
                int var19 = var18 + class192.field2719.method1452(false);
                class8.field136.method1448(-14605);
                int var20 = var19 + class8.field136.method1452(false);
                class69.field1020.method1448(-14605);
                int var21 = var20 + class69.field1020.method1452(false);
                class3.field47.method1448(-14605);
                int var22 = var21 + class3.field47.method1452(false);
                class271.field3784.method1448(-14605);
                int var23 = var22 + class271.field3784.method1452(false);
                class317.field4657.method1448(-14605);
                int var24 = var23 + class317.field4657.method1452(false);
                class310.field4515.method1448(-14605);
                int var25 = var24 + class310.field4515.method1452(false);
                class38.field589.method1448(-14605);
                int var26 = var25 + class38.field589.method1452(false);
                class411.field6026.method1448(-14605);
                int var27 = var26 + class411.field6026.method1452(false);
                if (var27 < 1200) {
                    class477.field6874 = class315.field4622.method1220(2969, class81.field1122) + var27 / 12 + "%";
                    class64.field963 = 65;
                } else {
                    class228.field3209 = new class246(class156.field1996, class81.field1122, class235.field3308);
                    class89.field1220 = new class70(class156.field1996, class81.field1122, class235.field3308);
                    class337.field4911 = new class254(class156.field1996, class81.field1122, class235.field3308, class445.field6482);
                    class413.field6132 = new class494(class156.field1996, class81.field1122, class70.field1035);
                    class129.field1649 = new class31(class156.field1996, class81.field1122, class235.field3308);
                    class475.field6857 = new class467(class156.field1996, class81.field1122, class235.field3308);
                    class315.field4621 = new class209(class156.field1996, class81.field1122, class235.field3308, class212.field3005);
                    class456.field6646 = new class427(class156.field1996, class81.field1122, class235.field3308);
                    class481.field6941 = new class216(class156.field1996, class81.field1122, class235.field3308);
                    class114.field1471 = new class351(class156.field1996, class81.field1122, true, class211.field2979, class212.field3005);
                    class96.field1295 = new class34(class156.field1996, class81.field1122, class235.field3308, class445.field6482);
                    class281.field4023 = new class205(class156.field1996, class81.field1122, class235.field3308, class445.field6482);
                    class508.field7744 = new class90(class156.field1996, class81.field1122, true, class192.field2719, class212.field3005);
                    class405.field5947 = new class184(class156.field1996, class81.field1122, true, class228.field3209, class8.field136, class212.field3005);
                    class127.field1627 = new class326(class156.field1996, class81.field1122, class235.field3308);
                    class286.field4083 = new class445(class156.field1996, class81.field1122, class69.field1020, class226.field3190, class275.field3937);
                    class75.field1067 = new class484(class156.field1996, class81.field1122, class235.field3308);
                    class66.field988 = new class469(class156.field1996, class81.field1122, class235.field3308);
                    class53.field820 = new class406(class156.field1996, class81.field1122, class3.field47, class212.field3005);
                    class66.field989 = new class224(class156.field1996, class81.field1122, class235.field3308);
                    class56.field880 = new class1(class156.field1996, class81.field1122, class235.field3308);
                    class355.field5125 = new class381(class156.field1996, class81.field1122, class235.field3308);
                    class78.field1102 = new class63(class156.field1996, class81.field1122, class271.field3784);
                    class503.field7685 = new class186(class156.field1996, class81.field1122, class235.field3308);
                    class163.method1035((byte) 67, class285.field4074, class212.field3005, class1.field1, class445.field6482);
                    class376.method2278(class411.field6026, -116);
                    class199.field2776 = new class355(class81.field1122, class317.field4657, class310.field4515);
                    class195.field2749 = new class363(class81.field1122, class317.field4657, class310.field4515, new class419());
                    class477.field6874 = class117.field1510.method1220(2969, class81.field1122);
                    class64.field963 = 65;
                    class14.method103((byte) -118);
                    class114.field1471.method2135(!class118.field1533.method2961(class293.field4174, 29), -49);
                    class453.field6591 = new class14();
                    class489.method2945(25095);
                    class53.method396(false, class38.field589);
                    class75.method497(class212.field3005, class147.field1916, true);
                    class201.field2792 = 120;
                }
            } else if (class201.field2792 == 120) {
                int var28 = class78.method512(class445.field6482, (byte) 111);
                int var29 = class34.method284((byte) -106);
                if (var28 < var29) {
                    class477.field6874 = class430.field6325.method1220(2969, class81.field1122) + var28 * 100 / var29 + "%";
                    class64.field963 = 70;
                } else {
                    class129.method717(class481.field6937, 1623, class445.field6482);
                    class181.method1148((byte) -97, class106.field1421);
                    class477.field6874 = class489.field7473.method1220(2969, class81.field1122);
                    class64.field963 = 70;
                    class201.field2792 = 130;
                }
            } else if (class201.field2792 == 130) {
                if (class456.field6643.method1459("", "huffman", -3)) {
                    class505 var30 = new class505(class456.field6643.method1469("huffman", (byte) 75, ""));
                    class71.method481(var30, 20162);
                    class477.field6874 = class456.field6641.method1220(2969, class81.field1122);
                    class64.field963 = 75;
                    class201.field2792 = 140;
                } else {
                    class477.field6874 = class232.field3234.method1220(2969, class81.field1122) + "0%";
                    class64.field963 = 75;
                }
            } else if (class201.field2792 == 140) {
                if (class285.field4074.method1448(-14605)) {
                    class477.field6874 = class212.field3002.method1220(2969, class81.field1122);
                    class201.field2792 = 150;
                    class64.field963 = 80;
                } else {
                    class477.field6874 = class447.field6519.method1220(2969, class81.field1122) + class285.field4074.method1452(false) + "%";
                    class64.field963 = 80;
                }
            } else if (class201.field2792 == 150) {
                if (class336.field4868.method1448(-14605)) {
                    class477.field6874 = class254.field3664.method1220(2969, class81.field1122);
                    class64.field963 = 82;
                    class201.field2792 = 160;
                } else {
                    class477.field6874 = class49.field752.method1220(2969, class81.field1122) + class336.field4868.method1452(false) + "%";
                    class64.field963 = 82;
                }
            } else if (class201.field2792 == 160) {
                if (class1.field1.method1448(-14605)) {
                    class477.field6874 = class27.field443.method1220(2969, class81.field1122);
                    class201.field2792 = 170;
                    class64.field963 = 85;
                } else {
                    class477.field6874 = class27.field443.method1220(2969, class81.field1122) + class1.field1.method1452(false) + "%";
                    class64.field963 = 85;
                }
            } else if (class201.field2792 == 170) {
                if (class56.field881.method1446(false, "details")) {
                    class249.method1552(class56.field881, class129.field1649, class475.field6857, class114.field1471, class96.field1295, class281.field4023, class453.field6591);
                    class477.field6874 = class163.field2138.method1220(2969, class81.field1122);
                    class201.field2792 = 180;
                    class64.field963 = 89;
                } else {
                    class477.field6874 = class209.field2952.method1220(2969, class81.field1122) + class56.field881.method1458("details", 27706) + "%";
                    class64.field963 = 87;
                }
            } else if (class201.field2792 == 180) {
                int var31 = class263.method1620(2);
                if (var31 == -1) {
                    class477.field6874 = class17.field239.method1220(2969, class81.field1122);
                    class64.field963 = 90;
                } else if (var31 == 7 || var31 == 9) {
                    this.method408("worldlistfull", true);
                    class319.method1921(15508, 1000);
                } else if (class464.field6730) {
                    class477.field6874 = class94.field1267.method1220(2969, class81.field1122);
                    class64.field963 = 90;
                    class201.field2792 = 190;
                } else {
                    this.method408("worldlistio_" + var31, true);
                    class319.method1921(15508, 1000);
                }
            } else if (class201.field2792 == 190) {
                class115.field1486 = new int[class355.field5125.field5674];
                class7.field129 = new String[class56.field880.field5];
                class420.field6208 = new boolean[class355.field5125.field5674];
                for (int var32 = 0; var32 < class355.field5125.field5674; var32++) {
                    if (class355.field5125.method2300(var32, -125).field2400 == 0) {
                        class420.field6208[var32] = true;
                        class438.field6411++;
                    }
                    class115.field1486[var32] = -1;
                }
                class342.method2069(5117);
                class118.field1526 = class285.field4074.method1444("loginscreen", (byte) 83);
                class67.field1004.method1450((byte) -104, true, false);
                class389.field5781.method1450((byte) -125, true, true);
                class445.field6482.method1450((byte) -114, true, true);
                class1.field1.method1450((byte) -124, true, true);
                class456.field6643.method1450((byte) -128, true, true);
                class285.field4074.method1450((byte) -122, true, true);
                class235.field3308.field3355 = 2;
                class111.field1455 = true;
                class70.field1035.field3355 = 2;
                class211.field2979.field3355 = 2;
                class192.field2719.field3355 = 2;
                class8.field136.field3355 = 2;
                class69.field1020.field3355 = 2;
                class3.field47.field3355 = 2;
                class208.method1284(class118.field1533.field6877, -1, -1, false, -119);
                class477.field6874 = class383.field5695.method1220(2969, class81.field1122);
                class64.field963 = 95;
                class201.field2792 = 200;
            } else if (class201.field2792 == 200) {
                class168.method1061(true, -31085);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1193() {
        int var0 = class276.field3953;
        int[] var1 = class330.field4790;
        boolean var2 = class118.field1533.field6909 == 1 && var0 > 200 || class118.field1533.field6909 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class313 var12 = class262.field3742[var1[var3]];
            if (var12.method1883(false)) {
                var12.method1295(98);
                if (var12.field2972 >= 0 && var12.field2975 >= 0 && var12.field2962 < class362.field5442 && var12.field2957 < class203.field2813) {
                    var12.field4593 = var12.field4209 ? var2 : false;
                    if (class415.field6145 == var12) {
                        var12.field4264 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field4185) {
                            var13++;
                        }
                        if (var12.field4252 > class263.field3748) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method1773(-71) << 2);
                        if (var12.field4557) {
                            var14 += 512;
                        } else {
                            if (class360.field5351 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field4264 = var14 + 1;
                    }
                } else {
                    var12.field4264 = -1;
                }
            } else {
                var12.field4264 = -1;
            }
        }
        for (int var4 = 0; var4 < class339.field4942; var4++) {
            class139 var9 = class504.field7697[class263.field3749[var4]];
            if (var9.method884(false) && var9.field1825.method1659(class453.field6591, (byte) 18)) {
                var9.method1295(80);
                if (var9.field2972 >= 0 && var9.field2975 >= 0 && var9.field2962 < class362.field5442 && var9.field2957 < class203.field2813) {
                    int var10 = 0;
                    if (!var9.field4185) {
                        var10++;
                    }
                    if (var9.field4252 > class263.field3748) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method1773(-87) << 2);
                    if (class360.field5351 == 0) {
                        if (var9.field1825.field3832) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class360.field5351 == 1) {
                        if (var9.field1825.field3832) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field1825.field3790) {
                        var11 += 1024;
                    } else if (!var9.field1825.field3838) {
                        var11 += 256;
                    }
                    var9.field4264 = var11 + 1;
                } else {
                    var9.field4264 = -1;
                }
            } else {
                var9.field4264 = -1;
            }
        }
        for (int var5 = 0; var5 < class254.field3662.length; var5++) {
            class434 var6 = class254.field3662[var5];
            if (var6 != null) {
                if (var6.field6358 == 1) {
                    class139 var7 = class504.field7697[var6.field6357];
                    if (var7 != null && var7.field4264 >= 0) {
                        var7.field4264 += 2048;
                    }
                } else if (var6.field6358 == 10) {
                    class313 var8 = class262.field3742[var6.field6357];
                    if (var8 != null && class415.field6145 != var8 && var8.field4264 >= 0) {
                        var8.field4264 += 2048;
                    }
                }
            }
        }
    }
}
