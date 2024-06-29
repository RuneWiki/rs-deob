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
public class client extends class188 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lms;")
    public static class453 field2275 = null;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lno;")
    public static class420 field2290 = new class420(64);

    @OriginalMember(owner = "client!client", name = "F", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lsg;")
    public static class226 field2272;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lnq;")
    public static class268 field2281;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field2291;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1083(int arg0) {
        if (arg0 < 86) {
            field2281 = null;
        }
        field2273++;
        boolean var2 = class306.field4231.method1279(106);
        if (!var2) {
            this.method1103((byte) -45);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1084(byte arg0) {
        field2274++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class222.method1476((byte) -71);
        class151.field2156 = new class145(class241.field3426);
        class306.field4231 = new class197();
        if (class412.field5854 != 0) {
            class285.field4028 = new byte[50][];
        }
        class442.method2766(0, class241.field3426);
        if (class203.field2787 == 0) {
            class173.field2375 = this.getCodeBase().getHost();
            class178.field2446 = 443;
            class292.field4094 = 43594;
        } else if (class203.field2787 == 1) {
            class173.field2375 = this.getCodeBase().getHost();
            class178.field2446 = class120.field1690 + 50000;
            class292.field4094 = class120.field1690 + 40000;
        } else if (class203.field2787 == 2) {
            class292.field4094 = class120.field1690 + 40000;
            class173.field2375 = "127.0.0.1";
            class178.field2446 = class120.field1690 + 50000;
        }
        class412.field5845 = class178.field2446;
        class129.field1811 = class292.field4094;
        class366.field5163 = class173.field2375;
        class13.field262 = class292.field4094;
        class310.field4250 = class312.field4272 = class427.field6017 = class307.field4236 = new short[256];
        class158.field2224 = class129.field1811;
        if (class129.field1827 == 1) {
            class447.field6275 = class114.field1642;
            class269.field3745 = 0;
            class432.field6112 = class352.field4821;
            class18.field320 = true;
            class19.field344 = 16777215;
            class192.field2639 = class150.field2123;
            class157.field2219 = class450.field6297;
        } else {
            class192.field2639 = class100.field1386;
            class447.field6275 = class90.field1256;
            class432.field6112 = class222.field3113;
            class157.field2219 = class11.field238;
        }
        if (class294.field4112 == 3) {
            class277.field3883 = class120.field1690;
        }
        class203.field2790 = class113.method794(class304.field4191, -8356);
        class239.field3410 = class311.method2004(class304.field4191, -124, true);
        class109.field1565 = class134.method934((byte) 68);
        if (class109.field1565 != null) {
            class109.field1565.method1644(class304.field4191, (byte) -118);
        }
        class143.field2052 = class294.field4112;
        try {
            if (class241.field3426.field4117 != null) {
                class151.field2147 = new class141(class241.field3426.field4117, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class155.field2187[var3] = new class141(class241.field3426.field4118[var3], 6000, 0);
                }
                class366.field5154 = new class141(class241.field3426.field4109, 6000, 0);
                class98.field1359 = new class99(255, class151.field2147, class366.field5154, 500000);
                class73.field1042 = new class141(class241.field3426.field4124, 24, 0);
                class241.field3426.field4109 = null;
                class241.field3426.field4118 = null;
                class241.field3426.field4117 = null;
                class241.field3426.field4124 = null;
            }
        } catch (IOException var4) {
            class366.field5154 = null;
            class73.field1042 = null;
            class151.field2147 = null;
            class98.field1359 = null;
        }
        if (arg0 <= 14) {
            field2275 = null;
        }
        if (class203.field2787 != 0) {
            class420.field5963 = true;
        }
        if (class129.field1827 == 0) {
            class242.field3438 = class380.field5428.method2763(-103, class210.field2935);
        } else if (class129.field1827 == 1) {
            class242.field3438 = class40.field575.method2763(118, class210.field2935);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method1085(byte arg0, int arg1) {
        field2282++;
        class306.field4231.field2729++;
        class434.field6118 = null;
        class390.field5596 = null;
        if (arg0 == -95) {
            class306.field4231.field2731 = arg1;
            class401.field5707 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1086(int arg0) {
        field2277++;
        method1087((byte) -79);
        class121.method827(60);
        class239.method1630(0);
        class442.method2764(-103);
        class364.method2356(true);
        class286.method1864(false);
        class161.method1065(arg0 ^ 0x5);
        class446.method2784(1);
        class390.method2469(arg0 + 100);
        class393.method2477((byte) 124);
        class129.method879(-12936);
        class188.method1228((byte) -64);
        class183.method1197((byte) -51);
        class417.method2620(true);
        class345.method2180((byte) 57);
        class285.method1859((byte) -125);
        class11.method214((byte) 9);
        class90.method640((byte) 10);
        class243.method1645(2);
        class348.method2208((byte) 105);
        class145.method992(3);
        class329.method2127(arg0 + 75);
        class173.method1144(-18626);
        class268.method1760((byte) 50);
        class141.method972(113);
        class99.method714(8);
        class131.method906(arg0 ^ 0xFFFFFFB0);
        class198.method1288((byte) 113);
        class181.method1183(-125);
        class67.method520(15922);
        class405.method2547(false);
        class92.method654((byte) -62);
        class384.method2439(true);
        class149.method1007((byte) 39);
        class453.method2814(-89);
        class2.method13(235);
        class218.method1405(200);
        class148.method1000((byte) 101);
        class210.method1361(403611948);
        class19.method255(0);
        class133.method918((byte) -17);
        class357.method2285(false);
        class125.method850(0);
        class380.method2424(-7201);
        class388.method2457(126);
        class26.method300((byte) -35);
        class139.method957(95);
        class241.method1637(102);
        class423.method2684((byte) 104);
        class337.method2157(8090);
        class223.method1483(-66);
        class394.method2498(-127);
        class242.method1643(57);
        class77.method569(118);
        class24.method289(1024);
        class275.method1794(true);
        class157.method1055((byte) 99);
        class41.method382(arg0 ^ 0x5E);
        class190.method1234(16731);
        class54.method446((byte) -50);
        class386.method2448((byte) -82);
        class66.method515((byte) -92);
        class160.method1062((byte) -46);
        class135.method943(false);
        class311.method2005(arg0 ^ 0x10);
        class392.method2474(true);
        class272.method1777(-104);
        class260.method1710(true);
        class64.method490(arg0 ^ 0xFFFFFF97);
        class76.method566((byte) -100);
        class310.method1997((byte) -76);
        class33.method331(-82);
        class327.method2100((byte) -39);
        class360.method2310((byte) 75);
        class416.method2613(-27819);
        class255.method1697(87);
        class305.method1969(122);
        class205.method1330(arg0 ^ 0xFFFFB725);
        class113.method795((byte) 121);
        class229.method1584((byte) 102);
        class16.method241(arg0);
        class175.method1149(arg0 ^ 0x45);
        class158.method1057(true);
        class373.method2381(false);
        class403.method2529((byte) 88);
        class437.method2746(119);
        class206.method1340((byte) -118);
        class315.method2042();
        class65.method502(-83);
        class290.method1879(-123);
        class425.method2687(true);
        class207.method1343(true);
        class341.method2168(121);
        class208.method1349(-1);
        class328.method2115(arg0 - 1);
        class177.method1165();
        class354.method2267();
        class62.method479((byte) -51);
        class435.method2735();
        class434.method2724((byte) 81);
        class25.method294(-17450);
        class163.method1076(512);
        class61.method475((byte) -23);
        class420.method2634(111);
        class454.method2821(-2);
        class222.method1473(-1);
        class231.method1593(-1331357333);
        class116.method805(arg0 ^ 0xFFFF86E0);
        class361.method2320(arg0 ^ 0x1E95);
        class40.method375(true);
        class211.method1393((byte) 84);
        class228.method1581(arg0 - 710382752);
        class428.method2700(true);
        class80.method581(12341);
        class29.method310(true);
        class326.method2095((byte) -87);
        class124.method846(1);
        class318.method2054((byte) 8);
        class376.method2400(119);
        class415.method2603((byte) -111);
        class431.method2719(15476);
        class17.method246((byte) 104);
        class378.method2418(8);
        class51.method427((byte) -22);
        class412.method2586(arg0 ^ 0xFFFFFF8D);
        class276.method1796(-31041);
        class375.method2396((byte) 123);
        class45.method403((byte) 120);
        class20.method276(arg0);
        class119.method819((byte) -127);
        class150.method1017((byte) 109);
        class176.method1158();
        class333.method2140(arg0 - 125);
        class271.method1774(2);
        class279.method1823((byte) 27);
        class7.method38(-102);
        class253.method1691(arg0 + 1);
        class447.method2786(-81);
        class203.method1317(-115);
        class170.method1121(arg0 ^ 0x7);
        class313.method2020();
        class312.method2014(8);
        class59.method462(false);
        class404.method2533(3);
        class109.method769(true);
        class184.method1203(true);
        class34.method333(16987);
        class214.method1401((byte) -63);
        class123.method830((byte) 92);
        class249.method1673(-12294);
        class69.method534(83);
        class144.method986((byte) -80);
        class368.method2369(-5166);
        class46.method412(false);
        class304.method1959(-431360888);
        class12.method215((byte) 122);
        class418.method2625(-122);
        class75.method558(-31931);
        class194.method1255(0);
        class108.method762(31378);
        class274.method1789(-119);
        class164.method1080(2);
        class299.method1940(29417);
        class273.method1785((byte) -55);
        class321.method2072();
        class196.method1268(0);
        class297.method1939((byte) -65);
        class91.method651(true);
        class277.method1802((byte) -45);
        class367.method2363(8995);
        class293.method1894((byte) -124);
        class436.method2743((byte) 98);
        class107.method760(arg0 + 1);
        class195.method1260(0);
        class440.method2760(27679);
        class282.method1841(arg0 ^ 0xFFFFFFD7);
        class247.method1665(false);
        class132.method916((byte) 1);
        class371.method2378((byte) 110);
        class60.method465();
        class48.method418(arg0 ^ 0x2);
        class245.method1657((byte) -116);
        class264.method1726(0);
        class114.method798(-118);
        class377.method2415((byte) -90);
        class258.method1703(8);
        class47.method415(arg0 ^ 0x4D);
        class100.method717(true);
        class15.method234((byte) -5);
        class427.method2696((byte) -66);
        class63.method482(true);
        class22.method285(117);
        class201.method1310();
        class187.method1214((byte) -97);
        class295.method1926(-8);
        class335.method2148(-111);
        class278.method1812((byte) 108);
        class30.method311(0);
        class387.method2455(2);
        class236.method1599();
        class31.method319();
        class292.method1891(-69);
        class200.method1306(-1);
        class406.method2549(104);
        class240.method1632(0);
        class44.method394(arg0 + 92);
        class316.method2050(arg0 + 128);
        class4.method21();
        class104.method741();
        class192.method1246(arg0 ^ 0x6E);
        class370.method2377(90);
        class32.method323();
        class251.method1682((byte) -116);
        class171.method1128(false);
        class296.method1931((byte) -115);
        class130.method891(arg0 ^ 0x1);
        class126.method861((byte) 87);
        class426.method2689(64);
        class284.method1852((byte) 73);
        class263.method1719(1);
        class399.method2514(true);
        class106.method755((byte) 21);
        class9.method148(-9589);
        class395.method2501((byte) 97);
        class414.method2597(arg0 + 9714);
        class18.method249(arg0 + 9789);
        class438.method2751(-71);
        class1.method6(-56);
        class267.method1732((byte) -34);
        class112.method792(false);
        class362.method2326((byte) -60);
        class347.method2197((byte) 3);
        class95.method688((byte) -89);
        class280.method1826(-30862);
        class35.method338(13);
        class382.method2434(-92);
        class291.method1883(arg0);
        class445.method2778((byte) 103);
        class117.method808(-19286);
        class98.method709(13406);
        class5.method32(2);
        class14.method230(2);
        class338.method2162(1604079724);
        class156.method1053(58);
        class212.method1397(false);
        class39.method366(6);
        class254.method1695(true);
        class21.method279((byte) 106);
        class50.method423(-10528);
        class56.method457((byte) -127);
        class237.method1604(-1);
        class306.method1973(1);
        class381.method2430(false);
        class349.method2218(1);
        class167.method1117(64);
        class79.method573((byte) 19);
        class165.method1108(66);
        class413.method2589(62);
        class189.method1232(-123);
        class57.method461(-107);
        class397.method2508(false);
        class143.method982(true);
        class346.method2192(1);
        class28.method302(false);
        class261.method1711(arg0 - 106);
        class191.method1242(26742);
        class178.method1171((byte) -61);
        class159.method1059((byte) -125);
        class53.method440(33);
        class303.method1952(arg0 ^ 0xFFFFFFCD);
        class89.method625(11767);
        class363.method2339();
        class86.method615();
        class288.method1875((byte) 65);
        class155.method1044(arg0);
        class204.method1323(-17575);
        class452.method2803(arg0 + 4);
        class334.method2143(arg0 + 2);
        class302.method1950((byte) -97);
        class331.method2133(0);
        class429.method2712(true);
        class352.method2226((byte) -117);
        class410.method2571(arg0 ^ 0x3F);
        class366.method2360(0);
        class73.method540(false);
        class307.method1976((byte) -94);
        class314.method2030(12766);
        class105.method750(0);
        class439.method2758((byte) 127);
        class128.method876((byte) 97);
        class248.method1671(arg0);
        class87.method618((byte) 72);
        class151.method1025(-18091);
        class42.method386(-109);
        class450.method2800(10310);
        class389.method2463(false);
        class432.method2722(4218);
        class74.method550((byte) 50);
        class217.method1402(-32696);
        class343.method2175((byte) 93);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method1087(byte arg0) {
        field2281 = null;
        field2275 = null;
        field2290 = null;
        if (arg0 == -79) {
            field2272 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1088(int arg0) {
        field2287++;
        if (class290.field4075) {
            class2.method9(-25817);
        }
        if (class64.field949 != null) {
            class64.field949.method2190(false);
        }
        if (class217.field2997 != null) {
            class92.method655(class217.field2997, (byte) 43, class241.field3426);
            class217.field2997 = null;
        }
        if (class156.field2207 != null) {
            class156.field2207.method2210(-2);
            class156.field2207 = null;
        }
        if (class109.field1565 != null) {
            class109.field1565.method1652(arg0 - 16777215, class304.field4191);
        }
        class109.field1565 = null;
        if (class417.field5927 != null) {
            class417.field5927.method258((byte) -118);
        }
        if (class119.field1682 != null) {
            class119.field1682.method258((byte) -118);
        }
        class306.field4231.method1284(arg0 ^ 0x74);
        if (arg0 != -1) {
            return;
        }
        class151.field2156.method993(arg0 - 4421);
        if (class200.field2763 != null) {
            class200.field2763.method1335((byte) -78);
            class200.field2763 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1089() {
        int var0 = class200.field2769 ? class26.field467 : class26.field467 + class125.field1758;
        for (int var1 = -1; var1 < var0; var1++) {
            class374 var2;
            if (var1 < 0) {
                var2 = class412.field5841;
            } else if (var1 < class26.field467) {
                var2 = class381.field5447[class66.field974[var1]];
            } else {
                var2 = class98.field1358[class135.field1967[var1 - class26.field467]];
            }
            if (var2.field5247 >= 0) {
                int var3 = var2.method942(false);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field6262 & 0x7F) == 0 && (var2.field6266 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field6262 & 0x7F) == 64 && (var2.field6266 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class134 && var2.field5343 != null && class276.field3837 >= var2.field5331 && class276.field3837 < var2.field5333) {
                    ((class134) var2).field1961 = false;
                }
                var2.field6270 = class285.method1858(var2.field6262, class142.field2034, var2.field6266, -64);
                class80.method583(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1090(int arg0) {
        field2276++;
        if (!class392.field5610) {
            for (int var2 = 0; var2 < class240.field3416; var2++) {
                if (class17.field303[var2].method547(arg0 + 4379) == 's' || class17.field303[var2].method547(0) == 'S') {
                    class392.field5610 = true;
                    break;
                }
            }
        }
        if (class375.field5352 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class385.method2442(-6631);
            if (class302.field4170 == 0L) {
                class302.field4170 = var5;
            }
            if (var4 > 16384 && var5 - class302.field4170 < 5000L) {
                if ((var5 - class210.field2881) > 1000L) {
                    System.gc();
                    class210.field2881 = var5;
                }
                class347.field4732 = class360.field4981.method2763(56, class210.field2935);
                class178.field2447 = 5;
            } else {
                class347.field4732 = class272.field3772.method2763(87, class210.field2935);
                class375.field5352 = 10;
                class178.field2447 = 5;
            }
        } else if (class375.field5352 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class426.field5999[var7] = class200.method1307(class290.field4061, class211.field2954, 126);
            }
            class347.field4732 = class9.field170.method2763(-83, class210.field2935);
            class375.field5352 = 20;
            class178.field2447 = 10;
        } else if (class375.field5352 == 20) {
            if (class75.field1070 == null) {
                class75.field1070 = new class329(class306.field4231, class151.field2156);
            }
            if (class75.field1070.method2120(-108)) {
                class114.field1639 = class253.method1692((byte) -106, 0, true, 1, false);
                class228.field3322 = class253.method1692((byte) -110, 1, true, 1, false);
                class129.field1810 = class253.method1692((byte) -125, 2, true, 1, false);
                class175.field2398 = class253.method1692((byte) -128, 3, true, 1, false);
                class130.field1829 = class253.method1692((byte) -100, 4, true, 1, false);
                class20.field375 = class253.method1692((byte) -111, 5, true, 1, true);
                class362.field5004 = class253.method1692((byte) -98, 6, false, 1, true);
                class248.field3512 = class253.method1692((byte) -104, 7, true, 1, false);
                class212.field2969 = class253.method1692((byte) -107, 8, true, 1, false);
                class200.field2767 = class253.method1692((byte) -115, 9, true, 1, false);
                class272.field3776 = class253.method1692((byte) -128, 10, true, 1, false);
                class410.field5803 = class253.method1692((byte) -120, 11, true, 1, false);
                class312.field4275 = class253.method1692((byte) -124, 12, true, 1, false);
                class260.field3643 = class253.method1692((byte) -105, 13, true, 1, false);
                class100.field1384 = class253.method1692((byte) -117, 14, false, 1, false);
                class130.field1833 = class253.method1692((byte) -111, 15, true, 1, false);
                class212.field2970 = class253.method1692((byte) -112, 16, true, 1, false);
                class348.field4781 = class253.method1692((byte) -118, 17, true, 1, false);
                class415.field5889 = class253.method1692((byte) -125, 18, true, 1, false);
                class415.field5897 = class253.method1692((byte) -125, 19, true, 1, false);
                class437.field6146 = class253.method1692((byte) -103, 20, true, 1, false);
                class364.field5135 = class253.method1692((byte) -114, 21, true, 1, false);
                class105.field1439 = class253.method1692((byte) -120, 22, true, 1, false);
                class370.field5203 = class253.method1692((byte) -112, 23, true, 1, true);
                class450.field6299 = class253.method1692((byte) -115, 24, true, 1, false);
                class167.field2307 = class253.method1692((byte) -116, 25, true, 1, false);
                class254.field3576 = class253.method1692((byte) -100, 26, true, 1, true);
                class26.field466 = class253.method1692((byte) -116, 27, true, 1, false);
                class45.field638 = class253.method1692((byte) -104, 28, true, 1, true);
                class347.field4732 = class373.field5233.method2763(-127, class210.field2935);
                class178.field2447 = 15;
                class375.field5352 = 30;
            } else {
                class347.field4732 = class163.field2262.method2763(-77, class210.field2935);
                class178.field2447 = 12;
            }
        } else if (class375.field5352 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class273.field3788[var9].method1143(true) * class204.field2792[var9] / 100;
            }
            if (var8 == 100) {
                class347.field4732 = class279.field3910.method2763(arg0 + 4292, class210.field2935);
                class178.field2447 = 20;
                class335.method2146(-90, class212.field2969);
                class240.method1635(class212.field2969, arg0 ^ 0xFFFFEEE5);
                class375.field5352 = 40;
            } else {
                if (var8 != 0) {
                    class347.field4732 = class108.field1564.method2763(44, class210.field2935) + var8 + "%";
                }
                class178.field2447 = 20;
            }
        } else if (class375.field5352 == 40) {
            if (class45.field638.method1766(arg0 ^ 0xFFFFEEA4)) {
                this.method1101((byte) -111, class45.field638.method1757(-3, 1));
                class347.field4732 = class333.field4597.method2763(arg0 ^ 0xFFFFEED6, class210.field2935);
                class375.field5352 = 50;
                class178.field2447 = 25;
            } else {
                class347.field4732 = class429.field6073.method2763(124, class210.field2935) + class45.field638.method1754((byte) 91) + "%";
                class178.field2447 = 25;
            }
        } else if (class375.field5352 == 50) {
            class376.method2402(2, (byte) 78, class133.field1904, 22050);
            class48.field683 = new class210();
            class48.field683.method1357(128, 9, arg0 + 14508);
            class417.field5927 = class74.method551(64, 22050, class304.field4191, class241.field3426, 0);
            class417.field5927.method260((byte) -77, class48.field683);
            class420.method2632(class48.field683, class130.field1829, class130.field1833, arg0 + 4472, class100.field1384);
            class119.field1682 = class74.method551(arg0 + 4495, 2048, class304.field4191, class241.field3426, 1);
            class164.field2266 = new class448();
            class119.field1682.method260((byte) -77, class164.field2266);
            class64.field957 = new class252(22050, class76.field1094);
            class349.field4808 = class362.field5004.method1751(113, "scape main");
            class347.field4732 = class183.field2497.method2763(47, class210.field2935);
            class178.field2447 = 30;
            class375.field5352 = 60;
        } else {
            if (arg0 != -4379) {
                this.method1086(63);
            }
            if (class375.field5352 == 60) {
                int var10 = class434.method2728(class212.field2969, -127, class260.field3643);
                int var11 = class428.method2699((byte) 118);
                if (var10 < var11) {
                    class347.field4732 = class59.field812.method2763(-107, class210.field2935) + var10 * 100 / var11 + "%";
                    class178.field2447 = 35;
                } else {
                    class347.field4732 = class26.field465.method2763(-84, class210.field2935);
                    class375.field5352 = 70;
                    class178.field2447 = 35;
                }
            } else if (class375.field5352 == 70) {
                int var12 = class16.method240(class212.field2969, 0);
                int var13 = class436.method2742(2);
                if (var12 < var13) {
                    class347.field4732 = class46.field649.method2763(arg0 + 4481, class210.field2935) + var12 * 100 / var13 + "%";
                    class178.field2447 = 40;
                } else {
                    class347.field4732 = class65.field969.method2763(38, class210.field2935);
                    class375.field5352 = 80;
                    class178.field2447 = 40;
                }
            } else if (class375.field5352 == 80) {
                if (class254.field3576.method1766(93)) {
                    class163.field2253 = new class61(class254.field3576, class200.field2767, class212.field2969);
                    class347.field4732 = class11.field243.method2763(73, class210.field2935);
                    class178.field2447 = 45;
                    class375.field5352 = 90;
                } else {
                    class347.field4732 = class33.field522.method2763(117, class210.field2935) + class254.field3576.method1754((byte) 85) + "%";
                    class178.field2447 = 45;
                }
            } else if (class375.field5352 == 90) {
                class347.field4732 = class393.field5628.method2763(101, class210.field2935);
                class375.field5352 = 95;
                class178.field2447 = 50;
            } else if (class375.field5352 == 95) {
                if (class392.field5610) {
                    class42.field614 = 0;
                    class284.field4010 = 1;
                    class403.field5720 = 0;
                    class205.field2824 = 0;
                    class251.field3544 = 0;
                }
                class392.field5610 = true;
                class271.method1775(class241.field3426, 78);
                class29.method309(205);
                class34.method336((byte) 99, false, class251.field3544);
                class347.field4732 = class450.field6301.method2763(107, class210.field2935);
                class178.field2447 = 55;
                class375.field5352 = 100;
            } else if (class375.field5352 == 100) {
                class331.method2134(class212.field2969, class260.field3643, class64.field949, -3560);
                class347.field4732 = class159.field2233.method2763(125, class210.field2935);
                class178.field2447 = 60;
                class139.method958(5, false);
                class375.field5352 = 110;
            } else if (class375.field5352 == 110) {
                byte var14 = 0;
                class129.field1810.method1766(arg0 + 4266);
                int var15 = var14 + class129.field1810.method1754((byte) 92);
                class212.field2970.method1766(-88);
                int var16 = var15 + class212.field2970.method1754((byte) 126);
                class348.field4781.method1766(78);
                int var17 = var16 + class348.field4781.method1754((byte) 105);
                class415.field5889.method1766(44);
                int var18 = var17 + class415.field5889.method1754((byte) 108);
                class415.field5897.method1766(81);
                int var19 = var18 + class415.field5897.method1754((byte) 58);
                class437.field6146.method1766(arg0 ^ 0x1143);
                int var20 = var19 + class437.field6146.method1754((byte) 122);
                class364.field5135.method1766(arg0 ^ 0x1141);
                int var21 = var20 + class364.field5135.method1754((byte) 113);
                class105.field1439.method1766(arg0 ^ 0xFFFFEEB2);
                int var22 = var21 + class105.field1439.method1754((byte) 47);
                class450.field6299.method1766(42);
                int var23 = var22 + class450.field6299.method1754((byte) 39);
                class167.field2307.method1766(-2);
                int var24 = var23 + class167.field2307.method1754((byte) 123);
                class26.field466.method1766(-126);
                int var25 = var24 + class26.field466.method1754((byte) 64);
                if (var25 < 1100) {
                    class347.field4732 = class392.field5615.method2763(-76, class210.field2935) + var25 / 11 + "%";
                    class178.field2447 = 65;
                } else {
                    class392.method2473(22784, class129.field1810);
                    class80.method575(class129.field1810, (byte) 1);
                    class223.method1489(false, class129.field1810);
                    class417.method2621(class248.field3512, (byte) -120, class129.field1810);
                    class130.method890(class210.field2935, 126, class212.field2970, class248.field3512, true);
                    class432.method2723(true, class248.field3512, (byte) -88, class210.field2935, class415.field5889);
                    class39.method361(class415.field5897, class248.field3512, class210.field2935, true, 108);
                    class401.method2523((byte) 108, class129.field1810);
                    class47.method413(class114.field1639, class437.field6146, (byte) 71, class228.field3322);
                    class359.method2300(arg0 + 19400, class129.field1810);
                    class9.method147(class248.field3512, (byte) -124, class364.field5135);
                    class230.method1587(class105.field1439, 87);
                    class329.method2118(class129.field1810, -175);
                    class114.method800(class212.field2969, class260.field3643, class248.field3512, -26718, class175.field2398);
                    class85.method612((byte) 87, class129.field1810);
                    class306.method1974((byte) 62, class348.field4781);
                    class21.method277(new class52(), class450.field6299, class167.field2307, 14830);
                    class30.method312(-126, class450.field6299, class167.field2307);
                    class239.method1627(-41, class129.field1810);
                    class286.method1869(-1, class129.field1810);
                    class178.method1173(70, class129.field1810);
                    class420.method2638(class129.field1810, (byte) 17, class212.field2969);
                    class15.method233(class212.field2969, class129.field1810, arg0 + 4378);
                    class131.method898(true, class129.field1810);
                    class2.method11(-7106, class212.field2969, class129.field1810);
                    class412.method2587(class129.field1810, -89);
                    class203.method1322((byte) -97, class129.field1810);
                    class347.field4732 = class208.field2861.method2763(114, class210.field2935);
                    class178.field2447 = 65;
                    class114.method799(0);
                    class375.field5352 = 120;
                }
            } else if (class375.field5352 == 120) {
                int var26 = class191.method1239(class212.field2969, 2);
                int var27 = class347.method2202(arg0 + 4302);
                if (var27 > var26) {
                    class347.field4732 = class108.field1562.method2763(arg0 ^ 0x114A, class210.field2935) + var26 * 100 / var27 + "%";
                    class178.field2447 = 70;
                } else {
                    class279.method1820(class212.field2969, false, class64.field949);
                    class128.method877(24, class278.field3900);
                    class347.field4732 = class418.field5937.method2763(arg0 + 4412, class210.field2935);
                    class375.field5352 = 130;
                    class178.field2447 = 70;
                }
            } else if (class375.field5352 == 130) {
                class347.field4732 = class121.field1695.method2763(-97, class210.field2935);
                class375.field5352 = 140;
                class178.field2447 = 75;
            } else if (class375.field5352 == 140) {
                if (class272.field3776.method1758("huffman", (byte) 55, "")) {
                    class45 var28 = new class45(class272.field3776.method1737("", -1, "huffman"));
                    class369.method2372(128, var28);
                    class347.field4732 = class1.field4.method2763(27, class210.field2935);
                    class178.field2447 = 80;
                    class375.field5352 = 150;
                } else {
                    class347.field4732 = class341.field4661.method2763(-123, class210.field2935) + "0%";
                    class178.field2447 = 80;
                }
            } else if (class375.field5352 == 150) {
                if (!class175.field2398.method1766(32)) {
                    class347.field4732 = class35.field538.method2763(-80, class210.field2935) + class175.field2398.method1754((byte) 58) * 3 / 4 + "%";
                    class178.field2447 = 85;
                } else if (!class312.field4275.method1766(-101)) {
                    class347.field4732 = class35.field538.method2763(43, class210.field2935) + (class312.field4275.method1754((byte) 104) / 10 + 75) + "%";
                    class178.field2447 = 85;
                } else if (!class260.field3643.method1766(27)) {
                    class347.field4732 = class35.field538.method2763(-84, class210.field2935) + (class260.field3643.method1754((byte) 78) / 20 + 85) + "%";
                    class178.field2447 = 85;
                } else if (class370.field5203.method1749(0, "details")) {
                    class354.method2275(class370.field5203);
                    class366.method2361((byte) 125, class26.field466);
                    class288.method1877(class248.field3512, 115, class163.field2253);
                    class347.field4732 = class87.field1221.method2763(arg0 ^ 0x1147, class210.field2935);
                    class178.field2447 = 85;
                    class375.field5352 = 160;
                } else {
                    class347.field4732 = class35.field538.method2763(-74, class210.field2935) + (class370.field5203.method1738("details", true) / 10 + 90) + "%";
                    class178.field2447 = 85;
                }
            } else if (class375.field5352 == 160) {
                int var29 = class397.method2511((byte) -104);
                if (var29 == -1) {
                    class347.field4732 = class14.field278.method2763(arg0 ^ 0x1163, class210.field2935);
                    class178.field2447 = 90;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1225("worldlistfull", arg0 + 4389);
                    class139.method958(1000, false);
                } else if (class327.field4481) {
                    class347.field4732 = class188.field2564.method2763(-116, class210.field2935);
                    class375.field5352 = 170;
                    class178.field2447 = 90;
                } else {
                    this.method1225("worldlistio_" + var29, 10);
                    class139.method958(1000, false);
                }
            } else if (class375.field5352 == 170) {
                class35.field545 = new String[class83.field1188];
                class389.field5580 = new int[class108.field1559];
                class15.field291 = new boolean[class108.field1559];
                for (int var30 = 0; var30 < class108.field1559; var30++) {
                    if (class117.method810(7, var30).field5853 == 0) {
                        class15.field291[var30] = true;
                        class194.field2662++;
                    }
                    class389.field5580[var30] = -1;
                }
                class125.method855(true);
                class181.field2489 = class175.field2398.method1751(33, "loginscreen");
                class20.field375.method1746((byte) -99, false, true);
                class362.field5004.method1746((byte) -84, true, true);
                class212.field2969.method1746((byte) -125, true, true);
                class260.field3643.method1746((byte) -112, true, true);
                class272.field3776.method1746((byte) -98, true, true);
                class175.field2398.method1746((byte) -91, true, true);
                class129.field1810.field3713 = 2;
                class139.field1986 = true;
                class348.field4781.field3713 = 2;
                class212.field2970.field3713 = 2;
                class415.field5889.field3713 = 2;
                class415.field5897.field3713 = 2;
                class437.field6146.field3713 = 2;
                class364.field5135.field3713 = 2;
                class388.method2460(-1538, -1, false, class284.field4010, -1);
                class347.field4732 = class426.field6002.method2763(77, class210.field2935);
                class178.field2447 = 95;
                class375.field5352 = 180;
            } else if (class375.field5352 == 180) {
                class19.method273(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lms;)Lse;")
    public static final class139 method1091(class453 arg0) {
        class139 var1 = (class139) class389.field5584.method886(((long) arg0.field6314 << 32) + (long) arg0.field6406, 25651);
        return var1 == null ? arg0.field6351 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLko;)[Ldp;")
    public static final class2[] method1092(byte arg0, class294 arg1) {
        field2279++;
        if (!arg1.method1903((byte) 107)) {
            return new class2[0];
        }
        if (arg0 < 26) {
            field2275 = null;
        }
        class283 var2 = arg1.method1904(true);
        while (var2.field3998 == 0) {
            class349.method2219(10L, -26);
        }
        if (var2.field3998 == 2) {
            return new class2[0];
        }
        int[] var3 = (int[]) var2.field3999;
        class2[] var4 = new class2[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class2 var6 = new class2();
            var4[var5] = var6;
            var6.field22 = var3[var5 << 2];
            var6.field20 = var3[(var5 << 2) + 1];
            var6.field26 = var3[(var5 << 2) + 2];
            var6.field23 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1093() {
        int var0 = class200.field2769 ? class26.field467 : class26.field467 + class125.field1758;
        for (int var1 = -1; var1 < var0; var1++) {
            class374 var2;
            if (var1 < 0) {
                var2 = class412.field5841;
            } else if (var1 < class26.field467) {
                var2 = class381.field5447[class66.field974[var1]];
            } else {
                var2 = class98.field1358[class135.field1967[var1 - class26.field467]];
            }
            var2.field5246 = 0;
            if (var2.field5247 < 0) {
                var2.field5317 = false;
            } else {
                int var3 = var2.method942(false);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field6262 & 0x7F) != 0 || (var2.field6266 & 0x7F) != 0) {
                        var2.field5317 = false;
                        continue;
                    }
                } else if ((var2.field6262 & 0x7F) != 64 || (var2.field6266 & 0x7F) != 64) {
                    var2.field5317 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field6262 >> 7;
                    int var5 = var2.field6266 >> 7;
                    if (class212.field2967[var4][var5] != var2.field5247) {
                        var2.field5317 = true;
                        continue;
                    }
                    if (class2.field27[var4][var5] > 1) {
                        var10002 = class2.field27[var4][var5]--;
                        var2.field5317 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field6262 - var6 >> 7;
                    int var8 = var2.field6266 - var6 >> 7;
                    int var9 = var2.field6262 + var6 >> 7;
                    int var10 = var2.field6266 + var6 >> 7;
                    if (!class204.method1325(var2.field5247, var7, var9, var8, var10, -29394)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class212.field2967[var11][var12] == var2.field5247) {
                                    var10002 = class2.field27[var11][var12]--;
                                }
                            }
                        }
                        var2.field5317 = true;
                        continue;
                    }
                }
                if (var2 instanceof class134 && var2.field5343 != null && class276.field3837 >= var2.field5331 && class276.field3837 < var2.field5333) {
                    ((class134) var2).field1961 = false;
                }
                var2.field5317 = false;
                var2.field6270 = class285.method1858(var2.field6262, class142.field2034, var2.field6266, -66);
                class80.method583(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public static final void method1094(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 33) {
            field2278++;
            class368.field5193 = new byte[arg0][arg1][arg3];
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public static final void method1095(boolean arg0) {
        field2289++;
        class345.method2184(109);
        class307.method1977(-4);
        class141.method974(0);
        class337.method2155((byte) 72);
        class184.method1200((byte) -116);
        class59.method463(-105);
        class250.method1677(-127);
        class237.method1601((byte) -114);
        class66.method511((byte) -91);
        class189.method1229((byte) 33);
        class252.method1683((byte) 66);
        if (arg0) {
            main((String[]) null);
        }
        class346.method2194((byte) 123);
        class346.method2193(-11904);
        class284.method1856(-5465);
        class237.method1605(1);
        class348.method2211(4);
        class275.method1792((byte) 77);
        class450.method2799(-28992);
        class191.method1240(-16777216);
        class261.method1713(37);
        class53.method439((byte) 99);
        class175.method1151(-1);
        if (class412.field5854 != 0) {
            for (int var1 = 0; var1 < class285.field4028.length; var1++) {
                class285.field4028[var1] = null;
            }
            class348.field4774 = 0;
        }
        class77.method567((byte) 4);
        class347.method2200(82);
        class79.method572(1);
        class278.method1809((byte) 113);
        class277.method1804(-1);
        class177.field2441.method905((byte) 18);
        class64.field949.method70();
        class41.field593.method2636(2);
        class141.method970(255);
        class114.field1639.method1767((byte) -78);
        class228.field3322.method1767((byte) -78);
        class129.field1810.method1767((byte) -78);
        class175.field2398.method1767((byte) -78);
        class130.field1829.method1767((byte) -78);
        class20.field375.method1767((byte) -78);
        class362.field5004.method1767((byte) -78);
        class248.field3512.method1767((byte) -78);
        class212.field2969.method1767((byte) -78);
        class200.field2767.method1767((byte) -78);
        class272.field3776.method1767((byte) -78);
        class410.field5803.method1767((byte) -78);
        class312.field4275.method1767((byte) -78);
        class260.field3643.method1767((byte) -78);
        class100.field1384.method1767((byte) -78);
        class130.field1833.method1767((byte) -78);
        class212.field2970.method1767((byte) -78);
        class348.field4781.method1767((byte) -78);
        class415.field5889.method1767((byte) -78);
        class415.field5897.method1767((byte) -78);
        class437.field6146.method1767((byte) -78);
        class364.field5135.method1767((byte) -78);
        class105.field1439.method1767((byte) -78);
        class370.field5203.method1767((byte) -78);
        class450.field6299.method1767((byte) -78);
        class167.field2307.method1767((byte) -78);
        class254.field3576.method1767((byte) -78);
        class26.field466.method1767((byte) -78);
        class45.field638.method1767((byte) -78);
        class375.field5348.method905((byte) 67);
        class412.field5842.method905((byte) 35);
        class425.field5992.method905((byte) 47);
        class5.field87.method905((byte) 60);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1096() {
        for (int var0 = -1; var0 < class26.field467 + class125.field1758; var0++) {
            class374 var1;
            if (var0 < 0) {
                var1 = class412.field5841;
            } else if (var0 < class26.field467) {
                var1 = class381.field5447[class66.field974[var0]];
            } else {
                var1 = class98.field1358[class135.field1967[var0 - class26.field467]];
            }
            if (var1.field5247 >= 0) {
                int var2 = var1.method942(false);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field6262 & 0x7F) != 0 || (var1.field6266 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field6262 & 0x7F) != 64 || (var1.field6266 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field6262 >> 7;
                    int var4 = var1.field6266 >> 7;
                    if (var1.field5247 > class212.field2967[var3][var4]) {
                        class212.field2967[var3][var4] = var1.field5247;
                        class2.field27[var3][var4] = 1;
                    } else if (class212.field2967[var3][var4] == var1.field5247) {
                        var10002 = class2.field27[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field6262 - var5 >> 7;
                    int var7 = var1.field6266 - var5 >> 7;
                    int var8 = var1.field6262 + var5 >> 7;
                    int var9 = var1.field6266 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field5247 > class212.field2967[var10][var11]) {
                                class212.field2967[var10][var11] = var1.field5247;
                                class2.field27[var10][var11] = 1;
                            } else if (class212.field2967[var10][var11] == var1.field5247) {
                                var10002 = class2.field27[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lms;)Z")
    public static final boolean method1097(class453 arg0) {
        if (class293.field4106) {
            if (method1091(arg0).field1985 != 0) {
                return false;
            }
            if (arg0.field6356 == 0) {
                return false;
            }
        }
        return arg0.field6409;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1098(int arg0) {
        field2284++;
        if (class446.field6250 == 1000) {
            return;
        }
        long var2 = class167.method1115(5) / 1000000L - class359.field4898;
        class359.field4898 = class167.method1115(5) / 1000000L;
        boolean var4 = class156.method1051(87);
        if (var4 && class429.field6078 && class417.field5927 != null) {
            class417.field5927.method262(-118);
        }
        if (class446.field6250 == 30 || class446.field6250 == 10) {
            if (class114.field1644 != 0L && class114.field1644 < class385.method2442(-6631)) {
                class388.method2460(-1538, class53.field741, false, class405.method2542(-1), class306.field4224);
            } else if (class64.field949.method52() && class144.field2062) {
                class121.method824((byte) -124);
            }
        }
        if (class217.field2997 == null) {
            Container var5;
            if (class79.field1119 == null) {
                var5 = class241.field3426.field4121;
            } else {
                var5 = class79.field1119;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class79.field1119 == var5) {
                Insets var8 = class79.field1119.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class197.field2713 != var6 || class335.field4614 != var7) {
                if (class64.field949 == null || class64.field949.method127()) {
                    class222.method1476((byte) -71);
                } else {
                    class335.field4614 = var7;
                    class197.field2713 = var6;
                }
                class114.field1644 = class385.method2442(-6631) + 500L;
            }
        }
        if (class217.field2997 != null && !class295.field4130 && (class446.field6250 == 30 || class446.field6250 == 10)) {
            class388.method2460(-1538, -1, false, class284.field4010, -1);
        }
        boolean var9 = false;
        if (class181.field2482) {
            var9 = true;
            class181.field2482 = false;
        }
        if (var9) {
            class21.method281(0);
        }
        if (class64.field949 != null && class64.field949.method78() || class405.method2542(-1) != 1) {
            class386.method2450((byte) -113);
        }
        if (arg0 <= 18) {
            field2275 = null;
        }
        if (class446.field6250 == 0) {
            class14.method228(class431.field6090[class74.field1065], var9, class178.field2447, class295.field4133[class74.field1065], class347.field4732, 1, class429.field6076[class74.field1065]);
        } else if (class446.field6250 == 5) {
            class50.method425((byte) 121, class295.field4133[class74.field1065].getRGB(), class429.field6076[class74.field1065].getRGB(), class431.field6090[class74.field1065].getRGB(), class64.field949, class64.field949.method78() | var9, class279.field3915);
        } else if (class446.field6250 == 10) {
            class268.method1744(false);
        } else if (class446.field6250 == 25 || class446.field6250 == 28) {
            if (class275.field3831 == 1) {
                if (class18.field321 < class53.field744) {
                    class18.field321 = class53.field744;
                }
                int var11 = (class18.field321 - class53.field744) * 50 / class18.field321;
                class427.method2692(class159.field2234, 45, true, class80.field1149.method2763(85, class210.field2935) + "<br>(" + var11 + "%)");
            } else if (class275.field3831 == 2) {
                if (class109.field1574 < class279.field3919) {
                    class109.field1574 = class279.field3919;
                }
                int var10 = (class109.field1574 - class279.field3919) * 50 / class109.field1574 + 50;
                class427.method2692(class159.field2234, 114, true, class80.field1149.method2763(92, class210.field2935) + "<br>(" + var10 + "%)");
            } else {
                class427.method2692(class159.field2234, 94, true, class80.field1149.method2763(108, class210.field2935));
            }
        } else if (class446.field6250 == 30) {
            class382.method2432((byte) -127, var2);
        } else if (class446.field6250 == 40) {
            class427.method2692(class159.field2234, 50, true, class75.field1074.method2763(72, class210.field2935) + "<br>" + class21.field389.method2763(-125, class210.field2935));
        }
        if (class18.field318 == 3) {
            for (int var12 = 0; var12 < class154.field2170; var12++) {
                Rectangle var13 = class192.field2642[var12];
                if (class141.field2028[var12]) {
                    class64.field949.method2182(var13.x, var13.y, var13.width, -1996553985, -114, var13.height);
                } else if (class25.field458[var12]) {
                    class64.field949.method2182(var13.x, var13.y, var13.width, -1996554240, 117, var13.height);
                }
            }
        }
        if (class7.method40(-809375828)) {
            class348.method2216((byte) 116, class64.field949);
        }
        if ((class446.field6250 == 30 || class446.field6250 == 10) && class18.field318 == 0 && class405.method2542(-1) == 1 && !var9 && class294.field4123.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class154.field2170; var15++) {
                if (class25.field458[var15]) {
                    class25.field458[var15] = false;
                    class346.field4726[var14++] = class192.field2642[var15];
                }
            }
            class64.field949.method92(class346.field4726, var14);
        } else if (class446.field6250 != 0) {
            class64.field949.method118();
            for (int var16 = 0; var16 < class154.field2170; var16++) {
                class25.field458[var16] = false;
            }
        }
        if (class411.field5840 == 0) {
            class349.method2219(15L, -46);
        } else if (class411.field5840 == 1) {
            class349.method2219(10L, -88);
        } else if (class411.field5840 == 2) {
            class349.method2219(5L, -18);
        } else if (class411.field5840 == 3) {
            class349.method2219(2L, -113);
        }
        if (class139.field1986) {
            class427.method2691(true);
        }
        if (class392.field5610 && class446.field6250 == 10 && class59.field801 != -1) {
            class392.field5610 = false;
            class271.method1775(class241.field3426, 93);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lms;IIIIIIIII)V")
    public static final void method1099(class453[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class453 var11 = arg0[var10];
            if (var11 != null && var11.field6470 == arg1) {
                int var12 = var11.field6363 + arg6;
                int var13 = var11.field6418 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6356 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6342 + var12;
                    int var19 = var11.field6447 + var13;
                    if (var11.field6356 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6356 == 0 || var11.field6345 || method1091(var11).field1985 != 0 || field2275 == var11 || var11.field6403 == 1338) {
                    if (!method1097(var11)) {
                        if (class432.field6109 == var11) {
                            class280.field3921 = true;
                            class17.field311 = var12;
                            class39.field557 = var13;
                        }
                        if (var11.field6384 || var14 < var16 && var15 < var17) {
                            if (var11.field6356 == 0 && var11.field6439 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class7 var20 = (class7) class139.field1981.method646(48); var20 != null; var20 = (class7) class139.field1981.method641(false)) {
                                    if (var20.field105) {
                                        var20.method2467((byte) 73);
                                        var20.field95.field6381 = false;
                                    }
                                }
                                if (class388.field5573 == 0) {
                                    class432.field6109 = null;
                                    field2275 = null;
                                }
                                class395.field5654 = 0;
                                class189.field2610 = false;
                                class425.field5995 = false;
                                if (!class271.field3762) {
                                    class318.method2059((byte) -53);
                                }
                            }
                            boolean var21;
                            if (class239.field3410.method1071((byte) -12) >= var14 && class239.field3410.method1068((byte) -51) >= var15 && class239.field3410.method1071((byte) -12) < var16 && class239.field3410.method1068((byte) 124) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class271.field3762 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class125.method854((byte) 14, arg8 - var12, var11, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class239.field3410.method1066((byte) -82) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class212.field2958 != null && class212.field2958.method388(107) == 0 && class212.field2958.method384(3) >= var14 && class212.field2958.method383(6) >= var15 && class212.field2958.method384(3) < var16 && class212.field2958.method383(6) < var17) {
                                var23 = true;
                            }
                            if (var11.field6462 != null) {
                                for (int var24 = 0; var24 < var11.field6462.length; var24++) {
                                    if (class203.field2790.method1872(var11.field6462[var24], 4463)) {
                                        if (var11.field6443 == null || class276.field3837 >= var11.field6443[var24]) {
                                            byte var25 = var11.field6392[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class203.field2790.method1872(86, 4463) && !class203.field2790.method1872(82, 4463) && !class203.field2790.method1872(81, 4463)) && ((var25 & 0x2) == 0 || class203.field2790.method1872(86, 4463)) && ((var25 & 0x1) == 0 || class203.field2790.method1872(82, 4463)) && ((var25 & 0x4) == 0 || class203.field2790.method1872(81, 4463))) {
                                                class41.method381(var11.field6314, var24 + 1, "", -1, (byte) -125);
                                                int var26 = var11.field6431[var24];
                                                if (var11.field6443 == null) {
                                                    var11.field6443 = new int[var11.field6462.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field6443[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6443[var24] = class276.field3837 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field6443 != null) {
                                        var11.field6443[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class352.method2225(0, class212.field2958.method384(3) - var12, var11, class212.field2958.method383(6) - var13);
                            }
                            if (class432.field6109 != null && class432.field6109 != var11 && var21 && method1091(var11).method953(true)) {
                                class1.field9 = var11;
                            }
                            if (field2275 == var11) {
                                class292.field4095 = true;
                                class326.field4459 = var12;
                                class373.field5242 = var13;
                            }
                            if (var11.field6345 || var11.field6403 != 0) {
                                if (var21 && class204.field2796 != 0 && var11.field6387 != null) {
                                    class7 var27 = new class7();
                                    var27.field105 = true;
                                    var27.field95 = var11;
                                    var27.field99 = class204.field2796;
                                    var27.field97 = var11.field6387;
                                    class139.field1981.method643(var27, -31);
                                }
                                if (class432.field6109 != null || class271.field3762 || var11.field6403 != 1400 && class395.field5654 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6403 != 0) {
                                    if (var11.field6403 == 1337 || var11.field6403 == 1403) {
                                        class143.field2056 = var11;
                                        if (class338.field4650 != null) {
                                            class338.field4650.method2440(1, class64.field949, var11.field6447);
                                        }
                                        if (var11.field6403 == 1337) {
                                            if (!class271.field3762 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class98.method707(arg8, arg9, class64.field949, -57);
                                                for (class91 var28 = (class91) class447.field6259.method1005(-1); var28 != null; var28 = (class91) class447.field6259.method1012((byte) -126)) {
                                                    if (arg8 >= var28.field1274 && arg8 < var28.field1277 && arg9 >= var28.field1273 && arg9 < var28.field1276) {
                                                        class318.method2059((byte) -115);
                                                        class276.method1797(false, var28.field1279);
                                                    }
                                                }
                                            }
                                            class316.method2049(var12, false, var11, var13);
                                            continue;
                                        }
                                    }
                                    if (var11.field6403 == 1338) {
                                        if (var11.method2811(class64.field949, (byte) -113) == null || class53.field743 != 0 && class53.field743 != 3 || class271.field3762 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field6420[var30];
                                        if (var29 < var31 || var29 > var11.field6404[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field6342 / 2;
                                        int var33 = var30 - var11.field6447 / 2;
                                        int var34;
                                        if (class128.field1807 == 4) {
                                            var34 = (int) class333.field4599 & 0x3FFF;
                                        } else {
                                            var34 = (int) class333.field4599 + class126.field1778 & 0x3FFF;
                                        }
                                        int var35 = class133.field1913[var34];
                                        int var36 = class133.field1908[var34];
                                        if (class128.field1807 != 4) {
                                            var35 = (class374.field5308 + 256) * var35 >> 8;
                                            var36 = (class374.field5308 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class128.field1807 == 4) {
                                            var39 = (class51.field702 >> 7) + (var37 >> 2);
                                            var40 = (class76.field1100 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class412.field5841.method942(false) - 1) * 64;
                                            var39 = (class412.field5841.field6262 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class412.field5841.field6266 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class327.field4511 && (class319.field4354 & 0x40) != 0) {
                                            class453 var42 = class143.method983(-1, class231.field3339, class178.field2451);
                                            if (var42 == null) {
                                                class418.method2624(-122);
                                            } else {
                                                class66.method514(var40, var39, 50, " ->", (byte) -16, class92.field1289, 1L, class249.field3519);
                                            }
                                            continue;
                                        }
                                        if (class129.field1827 == 1) {
                                            class66.method514(var40, var39, 3, "", (byte) -16, -1, 1L, class299.field4161.method2763(-82, class210.field2935));
                                        }
                                        class66.method514(var40, var39, 23, "", (byte) -16, -1, 1L, class160.field2244);
                                        continue;
                                    }
                                    if (var11.field6403 == 1400) {
                                        class437.field6152 = var11;
                                        if (var21) {
                                            class189.field2610 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class212.field2958.method384(3) - var12 - var11.field6342 / 2) * 2.0D / (double) class354.field4834);
                                            int var44 = (int) (-((double) (class212.field2958.method383(6) - var13 - var11.field6447 / 2) * 2.0D / (double) class354.field4834));
                                            int var45 = class222.field3100 + var43 + class354.field4843;
                                            int var46 = class254.field3580 + var44 + class354.field4858;
                                            class405 var47 = class403.method2528((byte) -101);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method2545(var48, true, var45, var46);
                                            if (var48 != null) {
                                                if (class203.field2790.method1872(82, 4463) && class105.field1435 > 0) {
                                                    class54.method447(var48[1], (byte) 48, var48[0], var48[2]);
                                                    continue;
                                                }
                                                class425.field5995 = true;
                                                class403.field5722 = var48[0];
                                                class312.field4263 = var48[1];
                                                class24.field410 = var48[2];
                                            }
                                            class395.field5654 = 1;
                                            class134.field1935 = false;
                                            class243.field3451 = class239.field3410.method1071((byte) -12);
                                            class73.field1048 = class239.field3410.method1068((byte) 118);
                                            continue;
                                        }
                                        if (var22 && class395.field5654 > 0) {
                                            if (class395.field5654 == 1 && (class243.field3451 != class239.field3410.method1071((byte) -12) || class73.field1048 != class239.field3410.method1068((byte) 89))) {
                                                class450.field6298 = class222.field3100;
                                                class7.field108 = class254.field3580;
                                                class395.field5654 = 2;
                                            }
                                            if (class395.field5654 == 2) {
                                                class134.field1935 = true;
                                                class292.method1892(class450.field6298 + (int) ((double) (class243.field3451 - class239.field3410.method1071((byte) -12)) * 2.0D / (double) class354.field4838), 4);
                                                class41.method380(-1, class7.field108 - (int) ((double) (class73.field1048 - class239.field3410.method1068((byte) 90)) * 2.0D / (double) class354.field4838));
                                            }
                                            continue;
                                        }
                                        if (class395.field5654 > 0 && !class134.field1935) {
                                            if ((class382.field5456 == 1 || class54.method448(-29170)) && class90.field1260 > 2) {
                                                class146.method996(class73.field1048, (byte) -80, 2, class243.field3451);
                                            } else if (class427.method2697(-1)) {
                                                class146.method996(class73.field1048, (byte) -77, 0, class243.field3451);
                                            }
                                        }
                                        class395.field5654 = 0;
                                        continue;
                                    }
                                    if (var11.field6403 == 1401) {
                                        if (var22) {
                                            class150.method1016((byte) -56, var11.field6342, class239.field3410.method1071((byte) -12) - var12, class239.field3410.method1068((byte) -126) - var13, var11.field6447);
                                        }
                                        continue;
                                    }
                                    if (var11.field6403 == 1406) {
                                        class396.method2505(true, var13, var12, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field6415 && var23) {
                                    var11.field6415 = true;
                                    if (var11.field6414 != null) {
                                        class7 var49 = new class7();
                                        var49.field105 = true;
                                        var49.field95 = var11;
                                        var49.field94 = class212.field2958.method384(3) - var12;
                                        var49.field99 = class212.field2958.method383(6) - var13;
                                        var49.field97 = var11.field6414;
                                        class139.field1981.method643(var49, -107);
                                    }
                                }
                                if (var11.field6415 && var22 && var11.field6451 != null) {
                                    class7 var50 = new class7();
                                    var50.field105 = true;
                                    var50.field95 = var11;
                                    var50.field94 = class239.field3410.method1071((byte) -12) - var12;
                                    var50.field99 = class239.field3410.method1068((byte) -75) - var13;
                                    var50.field97 = var11.field6451;
                                    class139.field1981.method643(var50, -64);
                                }
                                if (var11.field6415 && !var22) {
                                    var11.field6415 = false;
                                    if (var11.field6336 != null) {
                                        class7 var51 = new class7();
                                        var51.field105 = true;
                                        var51.field95 = var11;
                                        var51.field94 = class239.field3410.method1071((byte) -12) - var12;
                                        var51.field99 = class239.field3410.method1068((byte) -112) - var13;
                                        var51.field97 = var11.field6336;
                                        class427.field6016.method643(var51, -95);
                                    }
                                }
                                if (var22 && var11.field6357 != null) {
                                    class7 var52 = new class7();
                                    var52.field105 = true;
                                    var52.field95 = var11;
                                    var52.field94 = class239.field3410.method1071((byte) -12) - var12;
                                    var52.field99 = class239.field3410.method1068((byte) -96) - var13;
                                    var52.field97 = var11.field6357;
                                    class139.field1981.method643(var52, -44);
                                }
                                if (!var11.field6381 && var21) {
                                    var11.field6381 = true;
                                    if (var11.field6322 != null) {
                                        class7 var53 = new class7();
                                        var53.field105 = true;
                                        var53.field95 = var11;
                                        var53.field94 = class239.field3410.method1071((byte) -12) - var12;
                                        var53.field99 = class239.field3410.method1068((byte) -35) - var13;
                                        var53.field97 = var11.field6322;
                                        class139.field1981.method643(var53, -103);
                                    }
                                }
                                if (var11.field6381 && var21 && var11.field6369 != null) {
                                    class7 var54 = new class7();
                                    var54.field105 = true;
                                    var54.field95 = var11;
                                    var54.field94 = class239.field3410.method1071((byte) -12) - var12;
                                    var54.field99 = class239.field3410.method1068((byte) -68) - var13;
                                    var54.field97 = var11.field6369;
                                    class139.field1981.method643(var54, -101);
                                }
                                if (var11.field6381 && !var21) {
                                    var11.field6381 = false;
                                    if (var11.field6450 != null) {
                                        class7 var55 = new class7();
                                        var55.field105 = true;
                                        var55.field95 = var11;
                                        var55.field94 = class239.field3410.method1071((byte) -12) - var12;
                                        var55.field99 = class239.field3410.method1068((byte) -96) - var13;
                                        var55.field97 = var11.field6450;
                                        class427.field6016.method643(var55, -91);
                                    }
                                }
                                if (var11.field6324 != null) {
                                    class7 var56 = new class7();
                                    var56.field95 = var11;
                                    var56.field97 = var11.field6324;
                                    class98.field1354.method643(var56, -92);
                                }
                                if (var11.field6407 != null && class296.field4151 > var11.field6426) {
                                    if (var11.field6441 == null || class296.field4151 - var11.field6426 > 32) {
                                        class7 var61 = new class7();
                                        var61.field95 = var11;
                                        var61.field97 = var11.field6407;
                                        class139.field1981.method643(var61, -59);
                                    } else {
                                        label670: for (int var57 = var11.field6426; var57 < class296.field4151; var57++) {
                                            int var58 = class178.field2449[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field6441.length; var59++) {
                                                if (var11.field6441[var59] == var58) {
                                                    class7 var60 = new class7();
                                                    var60.field95 = var11;
                                                    var60.field97 = var11.field6407;
                                                    class139.field1981.method643(var60, -60);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6426 = class296.field4151;
                                }
                                if (var11.field6331 != null && class56.field767 > var11.field6311) {
                                    if (var11.field6429 == null || class56.field767 - var11.field6311 > 32) {
                                        class7 var66 = new class7();
                                        var66.field95 = var11;
                                        var66.field97 = var11.field6331;
                                        class139.field1981.method643(var66, -49);
                                    } else {
                                        label646: for (int var62 = var11.field6311; var62 < class56.field767; var62++) {
                                            int var63 = class386.field5537[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field6429.length; var64++) {
                                                if (var11.field6429[var64] == var63) {
                                                    class7 var65 = new class7();
                                                    var65.field95 = var11;
                                                    var65.field97 = var11.field6331;
                                                    class139.field1981.method643(var65, -79);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6311 = class56.field767;
                                }
                                if (var11.field6433 != null && class156.field2206 > var11.field6329) {
                                    if (var11.field6328 == null || class156.field2206 - var11.field6329 > 32) {
                                        class7 var71 = new class7();
                                        var71.field95 = var11;
                                        var71.field97 = var11.field6433;
                                        class139.field1981.method643(var71, -68);
                                    } else {
                                        label622: for (int var67 = var11.field6329; var67 < class156.field2206; var67++) {
                                            int var68 = class133.field1917[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field6328.length; var69++) {
                                                if (var11.field6328[var69] == var68) {
                                                    class7 var70 = new class7();
                                                    var70.field95 = var11;
                                                    var70.field97 = var11.field6433;
                                                    class139.field1981.method643(var70, -65);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6329 = class156.field2206;
                                }
                                if (var11.field6372 != null && class454.field6490 > var11.field6390) {
                                    if (var11.field6430 == null || class454.field6490 - var11.field6390 > 32) {
                                        class7 var76 = new class7();
                                        var76.field95 = var11;
                                        var76.field97 = var11.field6372;
                                        class139.field1981.method643(var76, -96);
                                    } else {
                                        label598: for (int var72 = var11.field6390; var72 < class454.field6490; var72++) {
                                            int var73 = class440.field6196[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field6430.length; var74++) {
                                                if (var11.field6430[var74] == var73) {
                                                    class7 var75 = new class7();
                                                    var75.field95 = var11;
                                                    var75.field97 = var11.field6372;
                                                    class139.field1981.method643(var75, -105);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6390 = class454.field6490;
                                }
                                if (var11.field6365 != null && class190.field2618 > var11.field6394) {
                                    if (var11.field6412 == null || class190.field2618 - var11.field6394 > 32) {
                                        class7 var81 = new class7();
                                        var81.field95 = var11;
                                        var81.field97 = var11.field6365;
                                        class139.field1981.method643(var81, -69);
                                    } else {
                                        label574: for (int var77 = var11.field6394; var77 < class190.field2618; var77++) {
                                            int var78 = class271.field3764[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field6412.length; var79++) {
                                                if (var11.field6412[var79] == var78) {
                                                    class7 var80 = new class7();
                                                    var80.field95 = var11;
                                                    var80.field97 = var11.field6365;
                                                    class139.field1981.method643(var80, -121);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6394 = class190.field2618;
                                }
                                if (class142.field2035 > var11.field6343 && var11.field6378 != null) {
                                    class7 var82 = new class7();
                                    var82.field95 = var11;
                                    var82.field97 = var11.field6378;
                                    class139.field1981.method643(var82, -77);
                                }
                                if (class159.field2236 > var11.field6343 && var11.field6349 != null) {
                                    class7 var83 = new class7();
                                    var83.field95 = var11;
                                    var83.field97 = var11.field6349;
                                    class139.field1981.method643(var83, -44);
                                }
                                if (class157.field2220 > var11.field6343 && var11.field6334 != null) {
                                    class7 var84 = new class7();
                                    var84.field95 = var11;
                                    var84.field97 = var11.field6334;
                                    class139.field1981.method643(var84, -68);
                                }
                                if (class303.field4189 > var11.field6343 && var11.field6411 != null) {
                                    class7 var85 = new class7();
                                    var85.field95 = var11;
                                    var85.field97 = var11.field6411;
                                    class139.field1981.method643(var85, -31);
                                }
                                if (class274.field3822 > var11.field6343 && var11.field6318 != null) {
                                    class7 var86 = new class7();
                                    var86.field95 = var11;
                                    var86.field97 = var11.field6318;
                                    class139.field1981.method643(var86, -80);
                                }
                                var11.field6343 = class367.field5186;
                                if (var11.field6347 != null) {
                                    for (int var87 = 0; var87 < class240.field3416; var87++) {
                                        class7 var88 = new class7();
                                        var88.field95 = var11;
                                        var88.field104 = class17.field303[var87].method548((byte) 105);
                                        var88.field100 = class17.field303[var87].method547(0);
                                        var88.field97 = var11.field6347;
                                        class139.field1981.method643(var88, -85);
                                    }
                                }
                                if (class204.field2814 && var11.field6419 != null) {
                                    class7 var89 = new class7();
                                    var89.field95 = var11;
                                    var89.field97 = var11.field6419;
                                    class139.field1981.method643(var89, -112);
                                }
                            }
                            if (var11.field6356 == 5 && var11.field6398 != -1) {
                                var11.method2817(17349).method2440(1, class64.field949, var11.field6447);
                            }
                            class126.method860(var11, (byte) -66);
                            if (var11.field6356 == 0) {
                                method1099(arg0, var11.field6314, var14, var15, var16, var17, var12 - var11.field6444, var13 - var11.field6344, arg8, arg9);
                                if (var11.field6382 != null) {
                                    method1099(var11.field6382, var11.field6314, var14, var15, var16, var17, var12 - var11.field6444, var13 - var11.field6344, arg8, arg9);
                                }
                                class26 var90 = (class26) class454.field6477.method886((long) var11.field6314, 25651);
                                if (var90 != null) {
                                    if (var90.field462 == 0 && !class271.field3762 && var21 && !class293.field4106) {
                                        class318.method2059((byte) -70);
                                    }
                                    class108.method767(var17, var15, var90.field463, arg9, var14, var13, arg8, false, var12, var16);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class126.method860(var11, (byte) -66);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lms;)Lms;")
    public static final class453 method1100(class453 arg0) {
        int var1 = method1091(arg0).method950(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class442.method2767(arg0.field6470, -1229996208);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method1101(byte arg0, byte[] arg1) {
        field2285++;
        class11 var3 = new class11(arg1);
        if (arg0 != -111) {
            method1097((class453) null);
        }
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method172((byte) 52);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class446.field6255 = new int[6];
                        var9[0] = var3.method174(arg0 + 366);
                        var9[1] = var3.method174(255);
                        var9[2] = var3.method174(255);
                        var9[3] = var3.method174(255);
                        var9[4] = var3.method174(255);
                        var9[5] = var3.method174(255);
                    } else if (var4 == 4) {
                        int var5 = var3.method172((byte) 52);
                        class310.field4248 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class310.field4248[var6] = var3.method174(255);
                            if (class310.field4248[var6] == 65535) {
                                class310.field4248[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method172((byte) 52);
                        class47.field653 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class47.field653[var8] = var3.method174(255);
                            if (class47.field653[var8] == 65535) {
                                class47.field653[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2280++;
        try {
            if (arg0.length != 4) {
                class196.method1267("argument count", 13616);
            }
            class120.field1690 = Integer.parseInt(arg0[0]);
            class203.field2787 = 2;
            if (arg0[1].equals("live")) {
                class412.field5854 = 0;
            } else if (arg0[1].equals("rc")) {
                class412.field5854 = 1;
            } else if (arg0[1].equals("wip")) {
                class412.field5854 = 2;
            } else {
                class196.method1267("modewhat", 13616);
            }
            class210.field2935 = class80.method578(arg0[2], 0);
            if (class210.field2935 == -1) {
                if (arg0[2].equals("english")) {
                    class210.field2935 = 0;
                } else if (arg0[2].equals("german")) {
                    class210.field2935 = 1;
                } else {
                    class196.method1267("language", 13616);
                }
            }
            class237.field3376 = false;
            class373.field5238 = false;
            if (arg0[3].equals("game0")) {
                class129.field1827 = 0;
            } else if (arg0[3].equals("game1")) {
                class129.field1827 = 1;
            } else {
                class196.method1267("game", 13616);
            }
            class328.field4547 = 0;
            class386.field5539 = "";
            class74.field1065 = class129.field1827;
            class331.field4578 = 0;
            client var1 = new client();
            class133.field1914 = var1;
            var1.method1220(class129.field1827 == 1 ? "stellardawn" : "runescape", false, 768, 1024, class412.field5854 + 32, -1, 29, 567);
            class79.field1119.setLocation(40, 40);
        } catch (Exception var3) {
            class271.method1776(-2296, var3, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1102(int arg0) {
        field2283++;
        if (class446.field6250 == 1000) {
            return;
        }
        class276.field3837++;
        if (class276.field3837 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class326.field4461 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class311.field4261.setSeed((long) class326.field4461);
        }
        this.method1083(102);
        if (class75.field1070 != null) {
            class75.field1070.method2124(0);
        }
        class30.method314(true);
        class285.method1860(12);
        class203.field2790.method1866((byte) -112);
        class239.field3410.method1069(false);
        if (class109.field1565 != null) {
            int var3 = class109.field1565.method1647(arg0 ^ 0xFFFFFFF6);
            class204.field2796 = var3;
        }
        if (class64.field949 != null) {
            class64.field949.method98((int) class385.method2442(arg0 ^ 0x19EF));
        }
        class434.method2732(-3);
        class240.field3416 = 0;
        if (arg0 != -10) {
            return;
        }
        for (class73 var4 = class203.field2790.method1871((byte) -104); var4 != null && class240.field3416 < 128; var4 = class203.field2790.method1871((byte) -125)) {
            if (var4.method546(-20986) != 1) {
                char var5 = var4.method547(0);
                if (!class151.method1029(true) || var5 != '`' && var5 != '§') {
                    class17.field303[class240.field3416] = var4;
                    class240.field3416++;
                } else if (class7.method40(-809375828)) {
                    class151.method1023((byte) -59);
                } else {
                    class195.method1262(arg0 + 110);
                }
            }
        }
        class212.field2958 = null;
        for (class307 var6 = class239.field3410.method1073((byte) -13); var6 != null; var6 = class239.field3410.method1073((byte) -13)) {
            int var7 = var6.method388(76);
            if (var7 == -1) {
                class261.field3657.method643(var6, -55);
            } else if (class204.method1326((byte) 17, var7)) {
                class212.field2958 = var6;
            }
        }
        if (class7.method40(-809375828)) {
            class94.method667(true);
        }
        if (class446.field6250 == 0) {
            this.method1090(arg0 ^ 0x1113);
            class195.method1263((byte) -50);
        } else if (class446.field6250 == 5) {
            this.method1090(-4379);
            class195.method1263((byte) -50);
        } else if (class446.field6250 == 25 || class446.field6250 == 28) {
            class62.method476(-14694);
        }
        if (class446.field6250 == 10) {
            this.method1106(arg0 ^ 0x4);
            class454.method2820((byte) -106);
            class109.method772(0);
            class56.method459(2);
        } else if (class446.field6250 == 30) {
            class107.method757(-113);
        } else if (class446.field6250 == 40) {
            class56.method459(2);
            if (class390.field5593 != -3) {
                if (class390.field5593 == 15) {
                    class406.method2548(24387);
                } else if (class390.field5593 != 2) {
                    class389.method2466((byte) 111);
                }
            }
        }
        class5.method28(0, class64.field949);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1103(byte arg0) {
        field2271++;
        if (class306.field4231.field2729 > class331.field4579) {
            class416.field5911 = (class306.field4231.field2729 * 50 - 50) * 5;
            if (class158.field2224 == class13.field262) {
                class158.field2224 = class412.field5845;
            } else {
                class158.field2224 = class13.field262;
            }
            if (class416.field5911 > 3000) {
                class416.field5911 = 3000;
            }
            if (class306.field4231.field2729 >= 2 && class306.field4231.field2731 == 6) {
                this.method1225("js5connect_outofdate", 10);
                class446.field6250 = 1000;
                return;
            }
            if (class306.field4231.field2729 >= 4 && class306.field4231.field2731 == -1) {
                this.method1225("js5crc", 10);
                class446.field6250 = 1000;
                return;
            }
            if (class306.field4231.field2729 >= 4 && (class446.field6250 == 0 || class446.field6250 == 5)) {
                if (class306.field4231.field2731 == 7 || class306.field4231.field2731 == 9) {
                    this.method1225("js5connect_full", 10);
                } else if (class306.field4231.field2731 <= 0) {
                    this.method1225("js5io", 10);
                } else {
                    this.method1225("js5connect", 10);
                }
                class446.field6250 = 1000;
                return;
            }
        }
        class331.field4579 = class306.field4231.field2729;
        if (class416.field5911 > 0) {
            class416.field5911--;
            return;
        }
        try {
            if (class401.field5707 == 0) {
                class434.field6118 = class241.field3426.method1912(class158.field2224, 1, class366.field5163);
                class401.field5707++;
            }
            if (class401.field5707 == 1) {
                if (class434.field6118.field3998 == 2) {
                    this.method1085((byte) -95, 1000);
                    return;
                }
                if (class434.field6118.field3998 == 1) {
                    class401.field5707++;
                }
            }
            if (class401.field5707 == 2) {
                class390.field5596 = new class348((Socket) class434.field6118.field3999, class241.field3426);
                class11 var2 = new class11(5);
                var2.method173(15, 255);
                var2.method155(15489, 567);
                class390.field5596.method2203(var2.field230, 0, 5, 114);
                class401.field5707++;
                class382.field5449 = class385.method2442(-6631);
            }
            int var3 = -3 % ((27 - arg0) / 33);
            if (class401.field5707 == 3) {
                if (class446.field6250 == 0 || class446.field6250 == 5 || class390.field5596.method2213(114) > 0) {
                    int var4 = class390.field5596.method2207(16776960);
                    if (var4 != 0) {
                        this.method1085((byte) -95, var4);
                        return;
                    }
                    class401.field5707++;
                } else if ((class385.method2442(-6631) - class382.field5449) > 30000L) {
                    this.method1085((byte) -95, 1001);
                    return;
                }
            }
            if (class401.field5707 == 4) {
                boolean var5 = class446.field6250 == 5 || class446.field6250 == 10 || class446.field6250 == 28;
                class306.field4231.method1285(-113, !var5, class390.field5596);
                class390.field5596 = null;
                class401.field5707 = 0;
                class434.field6118 = null;
            }
        } catch (IOException var6) {
            this.method1085((byte) -95, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1104() {
        for (int var0 = 0; var0 < class211.field2954; var0++) {
            int[] var1 = class212.field2967[var0];
            for (int var2 = 0; var2 < class290.field4061; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method1105() {
        boolean var0 = class237.field3369 == 1 && class26.field467 > 200 || class237.field3369 == 0 && class26.field467 > 50;
        for (int var1 = 0; var1 < class26.field467; var1++) {
            class134 var10 = class381.field5447[class66.field974[var1]];
            if (var10.method929((byte) -6)) {
                var10.method1800(-102123737);
                if (var10.field6261 >= 0 && var10.field6258 >= 0 && var10.field6272 < class211.field2954 && var10.field6264 < class290.field4061) {
                    var10.field1961 = var10.field5280 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field5317) {
                        var11++;
                    }
                    if (var10.field5299 > class276.field3837) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method942(false) << 2);
                    if (class132.field1887 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field5247 = var12 + 1;
                } else {
                    var10.field5247 = -1;
                }
            } else {
                var10.field5247 = -1;
            }
        }
        for (int var2 = 0; var2 < class125.field1758; var2++) {
            class198 var7 = class98.field1358[class135.field1967[var2]];
            if (var7.method1287((byte) -6) && var7.field2737.method2103(12122)) {
                var7.method1800(-102123737);
                if (var7.field6261 >= 0 && var7.field6258 >= 0 && var7.field6272 < class211.field2954 && var7.field6264 < class290.field4061) {
                    int var8 = 0;
                    if (!var7.field5317) {
                        var8++;
                    }
                    if (var7.field5299 > class276.field3837) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method942(false) << 2);
                    if (class132.field1887 == 0) {
                        if (var7.field2737.field4513) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class132.field1887 == 1) {
                        if (var7.field2737.field4513) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field2737.field4494) {
                        var9 += 512;
                    } else if (!var7.field2737.field4503) {
                        var9 += 256;
                    }
                    var7.field5247 = var9 + 1;
                } else {
                    var7.field5247 = -1;
                }
            } else {
                var7.field5247 = -1;
            }
        }
        for (int var3 = 0; var3 < class131.field1864.length; var3++) {
            class285 var4 = class131.field1864[var3];
            if (var4 != null) {
                if (var4.field4017 == 1) {
                    class198 var5 = class98.field1358[var4.field4025];
                    if (var5 != null && var5.field5247 >= 0) {
                        var5.field5247 += 1024;
                    }
                } else if (var4.field4017 == 10) {
                    class134 var6 = class381.field5447[var4.field4025];
                    if (var6 != null && var6.field5247 >= 0) {
                        var6.field5247 += 1024;
                    }
                }
            }
        }
        class412.field5841.field5247 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2286++;
        if (!this.method1223((byte) -95)) {
            return;
        }
        class120.field1690 = Integer.parseInt(this.getParameter("worldid"));
        class203.field2787 = Integer.parseInt(this.getParameter("modewhere"));
        if (class203.field2787 < 0 || class203.field2787 > 1) {
            class203.field2787 = 0;
        }
        class412.field5854 = Integer.parseInt(this.getParameter("modewhat"));
        if (class412.field5854 < 0 || class412.field5854 > 2) {
            class412.field5854 = 0;
        }
        try {
            class210.field2935 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class210.field2935 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class237.field3376 = true;
        } else {
            class237.field3376 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class373.field5238 = true;
        } else {
            class373.field5238 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class129.field1827 = 1;
        } else {
            class129.field1827 = 0;
        }
        try {
            class331.field4578 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class331.field4578 = 0;
        }
        class397.field5674 = this.getParameter("quiturl");
        class386.field5539 = this.getParameter("settings");
        if (class386.field5539 == null) {
            class386.field5539 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class328.field4547 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class328.field4547 = 0;
            }
        }
        class74.field1065 = Integer.parseInt(this.getParameter("colourid"));
        if (class74.field1065 < 0 || class295.field4133.length <= class74.field1065) {
            class74.field1065 = 0;
        }
        class133.field1914 = this;
        this.method1226(21669, 765, class412.field5854 + 32, 503, 567);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1106(int arg0) {
        field2288++;
        class349.field4797++;
        class316.method2049(-1, false, (class453) null, -1);
        class396.method2505(true, -1, -1, (class453) null);
        class207.method1347(-25449);
        class367.field5186++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class198 var12 = class98.field1358[var2];
            if (var12 != null) {
                byte var13 = var12.field2737.field4523;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method942(false);
                    if ((var13 & 0x2) != 0 && var12.field5344 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field5326[0] + var15;
                            int var18 = var12.field5332[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class211.field2954 - var14 - 1) {
                                var17 = class211.field2954 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > class290.field4061 - var14 - 1) {
                                var18 = class290.field4061 - var14 - 1;
                            }
                            int var19 = class420.method2639(true, class59.field813, var14, class145.field2064, -1, var12.field5326[0], 0, var14, var12.field5332[0], var18, var14, 48, 0, var17, class426.field5999[var12.field6267]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field5326[var20] = class145.field2064[var19 - var20 - 1];
                                    var12.field5332[var20] = class59.field813[var19 - var20 - 1];
                                    var12.field5337[var20] = 1;
                                }
                                var12.field5344 = var19;
                            }
                        }
                    }
                    class203.method1320(true, var12, true);
                    int var21 = class39.method368(true, var12);
                    class107.method758(class240.field3415, var12, class442.field6207, var21, 1);
                    class245.method1659(-19579, var12);
                }
            }
        }
        if (arg0 != -14) {
            field2272 = null;
        }
        if (class99.field1374 == 0 && class19.field367 == 0) {
            if (class128.field1807 == 2) {
                class293.method1895(122);
            } else {
                class288.method1874((byte) -55);
            }
            if (class106.field1447 >> 7 < 14 || (class106.field1447 >> 7) >= (class211.field2954 - 14) || class20.field376 >> 7 < 14 || class20.field376 >> 7 >= class290.field4061 - 14) {
                class423.method2680(10);
            }
        }
        while (true) {
            class7 var3;
            class453 var4;
            class453 var5;
            do {
                var3 = (class7) class98.field1354.method633(-80);
                if (var3 == null) {
                    while (true) {
                        class7 var6;
                        class453 var7;
                        class453 var8;
                        do {
                            var6 = (class7) class427.field6016.method633(arg0 - 106);
                            if (var6 == null) {
                                while (true) {
                                    class7 var9;
                                    class453 var10;
                                    class453 var11;
                                    do {
                                        var9 = (class7) class139.field1981.method633(-102);
                                        if (var9 == null) {
                                            if (class432.field6109 != null) {
                                                class362.method2328(-117);
                                            }
                                            if ((class276.field3837 % 1500) == 0) {
                                                class45.method402(-6594);
                                            }
                                            class261.method1712((byte) -125);
                                            if (class290.field4075 && (class385.method2442(-6631) - 60000L) > class92.field1288) {
                                                class2.method9(arg0 ^ 0x64D5);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field95;
                                        if (var10.field6406 < 0) {
                                            break;
                                        }
                                        var11 = class442.method2767(var10.field6470, arg0 - 1229996194);
                                    } while (var11 == null || var11.field6382 == null || var10.field6406 >= var11.field6382.length || var11.field6382[var10.field6406] != var10);
                                    class177.method1168(var9);
                                }
                            }
                            var7 = var6.field95;
                            if (var7.field6406 < 0) {
                                break;
                            }
                            var8 = class442.method2767(var7.field6470, -1229996208);
                        } while (var8 == null || var8.field6382 == null || var7.field6406 >= var8.field6382.length || var8.field6382[var7.field6406] != var7);
                        class177.method1168(var6);
                    }
                }
                var4 = var3.field95;
                if (var4.field6406 < 0) {
                    break;
                }
                var5 = class442.method2767(var4.field6470, arg0 ^ 0x495040A2);
            } while (var5 == null || var5.field6382 == null || var4.field6406 >= var5.field6382.length || var5.field6382[var4.field6406] != var4);
            class177.method1168(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method1107() {
        class28.field476 = 0;
        for (int var0 = 0; var0 < class125.field1758; var0++) {
            class198 var1 = class98.field1358[class135.field1967[var0]];
            if (var1.field5317 && var1.method937(1) != -1) {
                int var2 = (var1.method942(false) - 1) * 64 + 60;
                int var3 = var1.field6262 - var2 >> 7;
                int var4 = var1.field6266 - var2 >> 7;
                class374 var5 = class204.method1328(class142.field2034, var3, var4, (byte) 35);
                if (var5 != null) {
                    int var6 = var5.field5294;
                    if (var5 instanceof class198) {
                        var6 += 2048;
                    }
                    if (var5.field5246 == 0 && var5.method937(1) != -1) {
                        class28.field475[class28.field476] = var6;
                        class34.field527[class28.field476] = var6;
                        class28.field476++;
                        var5.field5246++;
                    }
                    class28.field475[class28.field476] = var6;
                    class34.field527[class28.field476] = var1.field5294 + 2048;
                    class28.field476++;
                    var5.field5246++;
                }
            }
        }
        class411.method2581(class28.field476 - 1, class34.field527, class28.field475, 0, 1);
    }
}
