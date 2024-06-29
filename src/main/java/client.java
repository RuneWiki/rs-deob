import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class359 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    public static boolean field4357 = false;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field4374 = -1;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field4373;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/Class;")
    public static Class field4375;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
    public static boolean field4376;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
    public static int[] field4370;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1884(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 7)
    private final void method1859(int arg0) {
        field4373++;
        if (class414.field5731 < class448.field6137.field4909) {
            class284.field4030.method3103((byte) -127);
            class473.field6487 = (class448.field6137.field4909 - 1) * 250;
            if (class473.field6487 > 3000) {
                class473.field6487 = 3000;
            }
            if (class448.field6137.field4909 >= 2 && class448.field6137.field4910 == 6) {
                this.method2127(32673, "js5connect_outofdate");
                class15.field215 = 14;
                return;
            }
            if (class448.field6137.field4909 >= 4 && class448.field6137.field4910 == -1) {
                this.method2127(32673, "js5crc");
                class15.field215 = 14;
                return;
            }
            if (class448.field6137.field4909 >= 4 && class412.method2402(class15.field215, 113)) {
                if (class448.field6137.field4910 == 7 || class448.field6137.field4910 == 9) {
                    this.method2127(32673, "js5connect_full");
                } else if (class448.field6137.field4910 <= 0) {
                    this.method2127(32673, "js5io");
                } else if (class183.field2772 == null) {
                    this.method2127(32673, "js5connect");
                } else {
                    this.method2127(32673, "js5proxy_" + class183.field2772.trim());
                }
                class15.field215 = 14;
                return;
            }
        }
        class414.field5731 = class448.field6137.field4909;
        if (class473.field6487 > 0) {
            class473.field6487--;
            return;
        }
        try {
            if (class35.field516 == 0) {
                class432.field5945 = class284.field4030.method3104(43594, class66.field828);
                class35.field516++;
            }
            if (class35.field516 == 1) {
                if (class432.field5945.field2987 == 2) {
                    if (class432.field5945.field2986 != null) {
                        class183.field2772 = (String) class432.field5945.field2986;
                    }
                    this.method1863(1000, (byte) 86);
                    return;
                }
                if (class432.field5945.field2987 == 1) {
                    class35.field516++;
                }
            }
            if (class35.field516 == 2) {
                class223.field3167 = new class477((Socket) class432.field5945.field2986, class66.field828, 25000);
                class677 var2 = new class677(5);
                var2.method3823(-117, class86.field1041.field4660);
                var2.method3798(27695, 640);
                class223.field3167.method2685(-5324, var2.field9399, 0, 5);
                class35.field516++;
                class463.field6372 = class375.method2193(116);
            }
            if (class35.field516 == 3) {
                if (class412.method2402(class15.field215, 125) || class223.field3167.method2693((byte) -124) > 0) {
                    int var3 = class223.field3167.method2692((byte) 75);
                    if (var3 != 0) {
                        this.method1863(var3, (byte) 115);
                        return;
                    }
                    class35.field516++;
                } else if (class375.method2193(116) - class463.field6372 > 30000L) {
                    this.method1863(1001, (byte) 102);
                    return;
                }
            }
            if (class35.field516 == 4) {
                boolean var4 = class412.method2402(class15.field215, 85) || class745.method4176(-6, class15.field215) || class239.method1501((byte) -14, class15.field215);
                class101[] var5 = class101.method753((byte) -82);
                class677 var6 = new class677(var5.length * 4);
                class223.field3167.method2689(var6.field9399, var6.field9399.length, 0, (byte) 82);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method754(16837, var6.method3799(false));
                }
                class448.field6137.method2087(!var4, class223.field3167, 4);
                class432.field5945 = null;
                class223.field3167 = null;
                class35.field516 = 0;
            }
            if (arg0 >= -57) {
                this.method1859(101);
            }
        } catch (IOException var8) {
            this.method1863(1002, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 175)
    public final void method1860(byte arg0) {
        if (arg0 != 59) {
            method1869(82);
        }
        field4372++;
        if (class411.field5711.field3913.method3282(true) != 2) {
            this.method1867(arg0 ^ 0x3B);
            return;
        }
        try {
            this.method1867(0);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class135.method1056(var5.getMessage() + " (Recovered) " + this.method1882(-4), var5, 1);
            class421.field5801 = true;
            class421.method2435(false, 99, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 201)
    public final void method1861(byte arg0) {
        if (arg0 != -95) {
            return;
        }
        field4369++;
        if (class411.field5711.field3913.method3282(true) != 2) {
            this.method1880(0);
            return;
        }
        try {
            this.method1880(0);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class135.method1056(var5.getMessage() + " (Recovered) " + this.method1882(-84), var5, 1);
            class421.field5801 = true;
            class421.method2435(false, 80, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)[B", line = 227)
    public static final byte[] method1862(byte arg0, byte[] arg1) {
        field4363++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == 3) {
            byte[] var2 = new byte[arg1.length];
            class335.method2020(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 246)
    private final void method1863(int arg0, byte arg1) {
        class448.field6137.field4910 = arg0;
        class35.field516 = 0;
        class432.field5945 = null;
        field4365++;
        if (arg1 <= 69) {
            method1862((byte) 81, null);
        }
        class448.field6137.field4909++;
        class223.field3167 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 261)
    public final void method1864(int arg0) {
        field4371++;
        method1869(7879);
        class525.method2904(arg0 + 15360);
        class127.method1005(71);
        class517.method2880(0);
        class734.method4105(0);
        class104.method775(3161);
        class99.method732(128);
        class447.method2563(arg0 ^ 0xFFFFCB9B);
        class101.method760(6);
        class254.method1551((byte) -62);
        class481.method2709(0);
        class416.method2412(false);
        class656.method3565(true);
        class721.method4059(-1);
        class359.method2130((byte) -105);
        class555.method3089((byte) -19);
        class548.method3063(119);
        class763.method4243(0);
        class333.method2003(-92);
        class278.method1673((byte) -99);
        class648.method3546(arg0 ^ 0xFFFFC467);
        class317.method1927(32);
        class723.method4070(-1);
        class2.method20((byte) 58);
        class348.method2080((byte) -127);
        class244.method1521(81);
        class84.method648(-17);
        class71.method583(1);
        class376.method2230((byte) 50);
        class569.method3136((byte) 94);
        class498.method2811(115);
        class586.method3201((byte) 126);
        class483.method2730(-18039);
        class496.method2799(arg0 ^ 0x3BF4);
        class528.method2951(true);
        class709.method3984(37);
        class614.method3339(-7913);
        class118.method964(75);
        class334.method2006(true);
        class269.method1624((byte) -103);
        class163.method1174((byte) -109);
        class743.method4147(false);
        class286.method1773(-120);
        class86.method659((byte) -90);
        class668.method3683(2);
        class480.method2706(-15046);
        class696.method3927((byte) -50);
        class172.method1214(98);
        class228.method1452((byte) 115);
        class261.method1581(true);
        class349.method2095(120);
        class702.method3950((byte) 116);
        class677.method3786(255);
        class417.method2422(-22833);
        class276.method1658(128);
        class752.method4212(arg0 + 15373);
        class681.method3847(-115);
        class74.method600((byte) -78);
        class385.method2278(-95);
        class362.method2156(1520207683);
        class676.method3765(0);
        class687.method3867((byte) 116);
        class672.method3722(-121);
        class565.method3125(-117);
        class383.method2265(9600);
        class714.method4004(87);
        class281.method1732(-2001);
        class612.method3333(-3);
        class583.method3188(-15098);
        class582.method3183(arg0 - 5752);
        class11.method102(11);
        class556.method3094(false);
        class8.method94(-128);
        class200.method1352(-4);
        class32.method275(true);
        class54.method369((byte) -98);
        class432.method2489((byte) 117);
        class592.method3222((byte) 43);
        class499.method2816(arg0 + 7395);
        class324.method1960((byte) -126);
        class375.method2192(20079);
        class503.method2833(true);
        class557.method3107((byte) -57);
        class514.method2870(29142);
        class563.method3116(14);
        class393.method2324((byte) 119);
        class320.method1948((byte) -119);
        class37.method300(-26);
        class456.method2595((byte) 89);
        class458.method2604((byte) -126);
        class475.method2680((byte) -54);
        class224.method1434(false);
        class241.method1512((byte) -74);
        class210.method1397(19669);
        class710.method3988(-3602);
        class100.method742(-19550);
        class538.method2995(0);
        class407.method2384(2077735568);
        class282.method1745(-1);
        class379.method2242((byte) -17);
        class166.method1187(false);
        class131.method1024(arg0 ^ 0xFFFFC464);
        class597.method3242(true);
        class60.method529(34);
        class574.method3160(arg0 ^ 0xFFFFC464);
        class176.method1229(true);
        class4.method69(-91);
        class536.method2977(18);
        class92.method693(true);
        class199.method1342(-30504);
        class217.method1407((byte) 36);
        class427.method2463((byte) -2);
        class164.method1179(false);
        class448.method2565((byte) -128);
        class549.method3071((byte) 105);
        class135.method1053((byte) 106);
        class397.method2336(-123);
        class187.method1288(arg0 + 15260);
        class299.method1840(1);
        class537.method2978(false);
        class603.method3278(0);
        class123.method983(-2649);
        class70.method572(2);
        class547.method3059(20418);
        class211.method1400(120);
        class420.method2433(117);
        class358.method2122(31266);
        class240.method1505((byte) -10);
        class149.method1113((byte) -42);
        class490.method2779(arg0 + 15136);
        class418.method2425(arg0 + 15387);
        class539.method3002((byte) -87);
        class388.method2299((byte) -105);
        class87.method668(arg0 ^ 0xFFFFACA9);
        class36.method295((byte) 100);
        class256.method1559((byte) -85);
        class3.method25(-20927);
        class289.method1797((byte) -29);
        class298.method1837((byte) -128);
        class182.method1257();
        class47.method334((byte) -126);
        class235.method1480((byte) 64);
        class543.method3041(-15626);
        class202.method1357(0);
        class179.method1239(-56);
        class352.method2110(-26000);
        class587.method3208(true);
        class14.method110(4);
        class727.method4086(42);
        class21.method227(22136);
        class692.method3903(115);
        class93.method696((byte) -23);
        class7.method89(0);
        class43.method314(true);
        class683.method3852(arg0 ^ 0xFFFFC40F);
        class744.method4154();
        class90.method687(-28);
        class465.method2635(-125);
        class79.method627(3);
        class559.method3109(-3);
        class125.method988(13334);
        class209.method1393((byte) 86);
        class311.method1910(0);
        class512.method2858(-127);
        class394.method2327((byte) 109);
        class511.method2855(arg0 + 18767);
        class689.method3878(95);
        class350.method2098(-27121);
        class17.method119();
        class98.method726(arg0 + 15247);
        class103.method767(arg0 + 15209);
        class20.method222((byte) -113);
        class35.method286(116);
        class165.method1186(-1);
        class509.method2853(arg0 ^ 0x3BF4);
        class425.method2456(-1);
        class716.method4009((byte) -46);
        class630.method3468((byte) 88);
        class340.method2046();
        class331.method1998((byte) 4);
        class717.method4015(1);
        class309.method1902(-1333244320);
        class270.method1628(1);
        class468.method2642(true);
        class566.method3127((byte) -127);
        class690.method3879(22767);
        class126.method998(arg0 ^ 0x3BE1);
        class552.method3078(arg0 + 47657);
        class343.method2051(3);
        class649.method3548((byte) 99);
        class694.method3904(16);
        class10.method100(arg0 + 15260);
        class184.method1270(-1);
        class355.method2119((byte) -55);
        class344.method2052();
        class730.method4093((byte) 49);
        class207.method1380(115);
        class88.method677(false);
        class138.method1067();
        class622.method3425((byte) -58);
        class94.method704(arg0 + 15439);
        class414.method2408(true);
        class287.method1781(255);
        class568.method3133(arg0 + 29308);
        class627.method3456();
        class78.method626(22580);
        class753.method4219(true);
        class31.method271((byte) -50);
        class403.method2370(-30914);
        class155.method1125(-1);
        class671.method3698(true);
        class513.method2867((byte) -58);
        class62.method540((byte) 21);
        class141.method1084(33);
        class705.method3964(arg0 ^ 0x68D2);
        class323.method1954(true);
        class273.method1642(false);
        class258.method1568(0);
        class259.method1571(false);
        class6.method81(14205);
        class247.method1527((byte) 116);
        class534.method2968(false);
        class650.method3551((byte) -122);
        class654.method3558(true);
        class85.method656((byte) -23);
        class302.method1847(0);
        class620.method3414((byte) -36);
        class469.method2644((byte) -82);
        class575.method3164(true);
        class109.method809(arg0 ^ 0x3B9B);
        class628.method3461((byte) 52);
        class381.method2247(arg0 + 25260);
        class626.method3444(128);
        class635.method3484(-112);
        class500.method2818((byte) 60);
        class293.method1815((byte) -50);
        class53.method366(arg0 ^ 0x6279);
        class562.method3114((byte) -112);
        class275.method1653(-7);
        class227.method1449(arg0 ^ 0x7A73);
        class435.method2500((byte) -47);
        class161.method1149(-108);
        class353.method2112(arg0 + 15256);
        class284.method1762((byte) -79);
        class462.method2625(false);
        class593.method3225(0);
        class390.method2311(-9959);
        class189.method1293(arg0 ^ 0x5178);
        class419.method2428(arg0 ^ 0xFFFFC40F);
        class392.method2320(arg0 ^ 0xFFFFC464);
        class142.method1086((byte) 94);
        class15.method113(true);
        class423.method2452(1);
        class295.method1827((byte) 100);
        class409.method2391(-3706);
        class27.method253(arg0 ^ 0xFFFFC400);
        class83.method645(true);
        class758.method4225((byte) -67);
        class193.method1325(-879071864);
        class305.method1888(false);
        class453.method2577(-27627);
        class119.method969(-2);
        class24.method238((byte) 113);
        class370.method2176(arg0 ^ 0x3BCC);
        class745.method4177(false);
        class148.method1109(118);
        class313.method1917(arg0 + 15260);
        class732.method4100(91);
        class271.method1630(0);
        class384.method2275(-99);
        class26.method247(arg0 + 15263);
        class422.method2447((byte) 125);
        class319.method1933(true);
        class332.method2002(25);
        class434.method2497(arg0 + 15262);
        class623.method3433();
        class606.method3295(120);
        class243.method1516(107);
        class371.method2178(107);
        class225.method1438(-1462072736);
        class684.method3856(arg0 ^ 0xFFFFC425);
        class595.method3230(85);
        class761.method4233(65535);
        class255.method1554(arg0 + 45051);
        class464.method2634((byte) -4);
        class183.method1263(arg0 - 375877564);
        class248.method1528(arg0 + 24814);
        class454.method2580(arg0 ^ arg0);
        class208.method1388(arg0 ^ 0xFFFFC424);
        class18.method141(false);
        class482.method2712();
        class410.method2393((byte) -114);
        class746.method4180(false);
        class196.method1337();
        class386.method2296();
        class505.method2841(1);
        class577.method3167(arg0 + 42987);
        class590.method3217();
        class739.method4122(-105);
        class175.method1223(false);
        class601.method3267(-11148);
        class659.method3575((byte) -74);
        class706.method3970((byte) -63);
        class5.method76(false);
        class442.method2546((byte) -109);
        class306.method1895((byte) 113);
        class300.method1844(-29864);
        class497.method2805(-30978);
        class519.method2881(-23738);
        class45.method322(true);
        class631.method3469(arg0 + 15260);
        class372.method2183((byte) 117);
        class660.method3579(arg0 ^ 0x44E0);
        class312.method1912(arg0 - 15092);
        class699.method3939();
        class292.method1806(true);
        class218.method1409(63);
        class260.method1577(0);
        class128.method1011(-4400);
        class426.method2458((byte) 38);
        class327.method1977(3200);
        class759.method4227(arg0 + 15161);
        class114.method954(-38);
        class604.method3289(1871698636);
        class704.method3959(115);
        class58.method389(-11);
        class747.method4186(1);
        class229.method1456((byte) -90);
        class195.method1333(arg0 ^ 0xFFFFC464);
        class167.method1200(119);
        class328.method1982((byte) 85);
        class223.method1428(2);
        class116.method957((byte) -44);
        class267.method1616((byte) -58);
        class12.method104((byte) -41);
        class137.method1064(102);
        class472.method2660(209);
        class140.method1076(arg0 + 17011);
        class288.method1782(0);
        class34.method282(false);
        class708.method3976(28478);
        class749.method4193((byte) 19);
        class712.method3996(arg0 ^ 0x3BFF);
        class452.method2575(true);
        class718.method4018(false);
        class572.method3149((byte) 85);
        class451.method2572(25819);
        class111.method912(3584);
        class143.method1087(125);
        class408.method2385(2);
        class639.method3497(0);
        class615.method3349(-59);
        class50.method357(-11922);
        class294.method1818(29281);
        class573.method3153(-12296);
        class366.method2164(0);
        class662.method3586(-33);
        class347.method2071(-16766);
        class171.method1210(-25694);
        class608.method3309(0);
        class105.method782(126);
        class637.method3492(115);
        class380.method2243(false);
        class76.method612(-24048);
        class459.method2607((byte) 101);
        class49.method352();
        class51.method359((byte) -33);
        class44.method319(0);
        class679.method3840((byte) 32);
        class629.method3465((byte) -97);
        class28.method256(4096);
        class411.method2399(true);
        class97.method723((byte) -99);
        class682.method3849(105);
        class643.method3526(4096);
        class609.method3322((byte) 117);
        class194.method1327(false);
        class264.method1599((byte) -69);
        class66.method565(false);
        class436.method2509(false);
        class588.method3211(-1378707903);
        class64.method549(28045);
        class63.method542((byte) -67);
        class1.method3(-24214);
        class252.method1542(-15789);
        class600.method3265(0);
        class197.method1338((byte) -57);
        class250.method1530(4521);
        class657.method3568(2048);
        class96.method720(2);
        class91.method689((byte) -123);
        class180.method1246(true);
        class113.method951(0);
        class170.method1209(5);
        class607.method3297(-99);
        class178.method1235(19706);
        class169.method1201(arg0 + 15138);
        class13.method109((byte) 78);
        class33.method278(16);
        class413.method2405();
        class506.method2846(1);
        class532.method2966((byte) 101);
        class68.method569(arg0 + 17878);
        class762.method4236(false);
        class541.method3019(-31835);
        class396.method2330(16);
        class750.method4203(-128);
        class190.method1298(-11773);
        class304.method1855((byte) 86);
        class680.method3842(true);
        class439.method2533(3520);
        class719.method4030(false);
        class156.method1135(arg0 ^ 0x3BC2);
        class550.method3074((byte) -75);
        class378.method2238((byte) -118);
        class153.method1119((byte) -78);
        class524.method2900(0);
        class330.method1995(-1);
        class561.method3112((byte) 76);
        class495.method2792(arg0 ^ 0x3B9B);
        class540.method3009(8218);
        class230.method1466(-9111);
        class341.method2047(arg0 + 15136);
        class711.method3992((byte) -126);
        class314.method1921(119);
        class374.method2188(arg0 ^ 0xFFFFC422);
        class428.method2470(false);
        class338.method2034(false);
        class307.method1899(-8554);
        class204.method1369(0);
        class516.method2876(arg0 + 49426);
        class686.method3862(true);
        class82.method642(arg0 + 18604);
        class551.method3076(arg0 + 15328);
        class491.method2785(arg0 ^ 0xFFFFACC3);
        class57.method380((byte) -74);
        class584.method3191(arg0 + 15151);
        class112.method950(26162);
        class238.method1499((byte) -63);
        class110.method812(-116);
        class520.method2886((byte) -79);
        class508.method2852((byte) 120);
        class658.method3570(7);
        class599.method3262(-4);
        class431.method2487((byte) -38);
        class564.method3121(0);
        class77.method617((byte) 22);
        class526.method2905(arg0 + 15264);
        class591.method3218(-126);
        class471.method2654((byte) -123);
        class265.method1603((byte) 64);
        class339.method2039(arg0 ^ 0x4F39);
        class75.method604(1002);
        class232.method1472((byte) -82);
        class226.method1448(27966);
        class470.method2648(arg0 ^ 0x3B9B);
        class446.method2558(17);
        class48.method345((byte) -123);
        class625.method3435(true);
        class478.method2695(3317);
        class756.method4221(-25050);
        class251.method1531((byte) 16);
        class363.method2158((byte) 67);
        class546.method3058((byte) -85);
        class369.method2174(arg0 ^ 0xFFFF4CF7);
        class55.method371((byte) 62);
        class69.method570(-6937);
        class703.method3956((byte) -118);
        class257.method1562(true);
        class42.method311(false);
        class646.method3537(28616);
        class445.method2554((byte) 76);
        class361.method2149(1011);
        class580.method3179((byte) 99);
        class567.method3130((byte) 127);
        class29.method261(arg0 + 14769);
        class239.method1504(true);
        class22.method230((byte) -100);
        class132.method1026(-28431);
        class9.method96(3006);
        class466.method2640((byte) 120);
        class107.method786((byte) 13);
        class507.method2850(true);
        class365.method2161((byte) -125);
        class596.method3237((byte) 126);
        class661.method3584(255);
        class621.method3419((byte) -19);
        class236.method1483(false);
        class433.method2493(-16334);
        class382.method2255(-30831);
        class253.method1544(-110);
        class322.method1953((byte) 79);
        class136.method1060(false);
        class56.method377(true);
        class731.method4097(-20099);
        class401.method2363((byte) 88);
        class283.method1751(arg0 ^ 0xFFFFBF63);
        class494.method2790(15839);
        class290.method1800(-1);
        class277.method1665(arg0 + 15387);
        class377.method2232((byte) -119);
        class201.method1354(false);
        class367.method2169((byte) -103);
        class736.method4110((byte) 90);
        class308.method1900(false);
        class354.method2116((byte) -114);
        class315.method1923(23132);
        class405.method2378(arg0 + 15152);
        class316.method1926((byte) 116);
        class310.method1907((byte) 113);
        class670.method3697(3);
        class402.method2368(126);
        class117.method960(-127);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 781)
    public final void method1865(boolean arg0) {
        if (class464.field6381) {
            class654.method3560((byte) -89);
        }
        field4368++;
        class713.method4002((byte) 70);
        if (class341.field4807 != null) {
            class341.field4807.method487(122);
        }
        if (class200.field3012 != null) {
            class515.method2874(class66.field828, class200.field3012, -2);
            class200.field3012 = null;
        }
        if (class209.field3089 != null) {
            class209.field3089.method1439(-1);
            class209.field3089 = null;
        }
        if (arg0) {
            return;
        }
        class461.method2622(-1409991511);
        class448.field6137.method2082((byte) -107);
        class339.field4798.method1520(-106);
        if (class462.field6346 != null) {
            class462.field6346.method3844((byte) 113);
            class462.field6346 = null;
        }
        try {
            class736.field10177.method3143(-128);
            for (int var2 = 0; var2 < 37; var2++) {
                class140.field2217[var2].method3143(-127);
            }
            class20.field352.method3143(-119);
            class671.field9154.method3143(-108);
            class606.method3293(-28975);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 838)
    public static final void method1866() {
        int var0 = class586.field7665;
        int[] var1 = class20.field351;
        int var2 = class184.field2780 ? var0 : class306.field4404 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class742 var4;
            if (var3 < var0) {
                var4 = class248.field3438[var1[var3]];
            } else {
                var4 = ((class134) class390.field5470.method2135((long) class628.field8351[var3 - var0], (byte) 31)).field2154;
            }
            if (var4.field10223 >= 0) {
                int var5 = var4.method2256(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3505 & 0x1FF) == 0 && (var4.field3502 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field3505 & 0x1FF) == 256 && (var4.field3502 & 0x1FF) == 256) {
                    continue;
                }
                var4.field3510 = class153.method1118(var4.field3502, var4.field3505, 27, var4.field3508);
                class294.method1821(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 879)
    private final void method1867(int arg0) {
        field4366++;
        if (class15.field215 == 14) {
            return;
        }
        long var2 = class237.method1494(true) / 1000000L - class437.field6021;
        class437.field6021 = class237.method1494(true) / 1000000L;
        boolean var4 = class524.method2898(28984);
        if (var4 && class122.field1996 && class453.field6187 != null) {
            class453.field6187.method1792(121);
        }
        if (class294.method1820(class15.field215, (byte) -97)) {
            if (class497.field6699 != 0L && class375.method2193(116) > class497.field6699) {
                class554.method3084(false, class343.method2050((byte) -112), class68.field840, class756.field10527, -1);
            } else if (!class341.field4807.method414() && class762.field10613) {
                class442.method2543((byte) 127);
            }
        }
        if (class200.field3012 == null) {
            Container var5;
            if (class218.field3143 != null) {
                var5 = class218.field3143;
            } else if (class514.field6818 == null) {
                var5 = class670.field9145;
            } else {
                var5 = class514.field6818;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class218.field3143 == var5) {
                Insets var8 = class218.field3143.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class201.field3018 != var6 || class749.field10428 != var7 || class50.field641) {
                if (class341.field4807 == null || class341.field4807.method443()) {
                    class659.method3576(-2);
                } else {
                    class749.field10428 = var7;
                    class201.field3018 = var6;
                }
                class497.field6699 = class375.method2193(116) + 500L;
                class50.field641 = false;
            }
        }
        if (class200.field3012 != null && !class709.field9831 && class294.method1820(class15.field215, (byte) 113)) {
            class554.method3084(false, class411.field5711.field3901.method2537(true), -1, -1, -1);
        }
        boolean var9 = false;
        if (class690.field9598) {
            var9 = true;
            class690.field9598 = false;
        }
        if (var9) {
            class565.method3123(false);
        }
        if (class341.field4807 != null && class341.field4807.method414() || class343.method2050((byte) -112) != 1) {
            class312.method1915(-101);
        }
        if (class412.method2402(class15.field215, arg0 ^ 0x76)) {
            class722.method4062(-3740, var9);
        } else if (class477.method2690(12459, class15.field215)) {
            class517.method2878(-1);
        } else if (class680.method3843(class15.field215, (byte) 102)) {
            class517.method2878(-1);
        } else if (class608.method3313(arg0 ^ 0xFFFFFFD6, class15.field215)) {
            if (class582.field7631 == 1) {
                if (class74.field902 > class440.field6075) {
                    class440.field6075 = class74.field902;
                }
                int var11 = (class440.field6075 - class74.field902) * 50 / class440.field6075;
                class88.method675(class180.field2728, class148.field2334, class341.field4807, (byte) -27, true, class517.field6852.method2877(class713.field9854, (byte) -108) + "<br>(" + var11 + "%)");
            } else if (class582.field7631 == 2) {
                if (class613.field8162 > class708.field9799) {
                    class708.field9799 = class613.field8162;
                }
                int var10 = (class708.field9799 - class613.field8162) * 50 / class708.field9799 + 50;
                class88.method675(class180.field2728, class148.field2334, class341.field4807, (byte) -27, true, class517.field6852.method2877(class713.field9854, (byte) -108) + "<br>(" + var10 + "%)");
            } else {
                class88.method675(class180.field2728, class148.field2334, class341.field4807, (byte) -27, true, class517.field6852.method2877(class713.field9854, (byte) -108));
            }
        } else if (class15.field215 == 10) {
            class742.method4144(var2, arg0 ^ 0xFFFFFF8B);
        } else if (class15.field215 == 13) {
            class88.method675(class180.field2728, class148.field2334, class341.field4807, (byte) -27, false, class517.field6854.method2877(class713.field9854, (byte) -108) + "<br>" + class517.field6855.method2877(class713.field9854, (byte) -108));
        }
        if (class263.field3674 == 3) {
            for (int var12 = 0; var12 < class601.field7899; var12++) {
                Rectangle var13 = class179.field2712[var12];
                if (class525.field6963[var12]) {
                    class341.field4807.method434(var13.height, -65281, var13.width, 104, var13.y, var13.x);
                } else if (class319.field4545[var12]) {
                    class341.field4807.method434(var13.height, -65536, var13.width, arg0 + 115, var13.y, var13.x);
                } else {
                    class341.field4807.method434(var13.height, -16711936, var13.width, 119, var13.y, var13.x);
                }
            }
        }
        if (class48.method335((byte) 111)) {
            class460.method2617((byte) 70, class341.field4807);
        }
        if (class66.field828.field2900 && class294.method1820(class15.field215, (byte) -57) && class263.field3674 == 0 && class343.method2050((byte) -112) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class601.field7899; var15++) {
                if (class319.field4545[var15]) {
                    class319.field4545[var15] = false;
                    class629.field8382[var14++] = class179.field2712[var15];
                }
            }
            try {
                if (class24.field412) {
                    class53.method368(class629.field8382, var14, (byte) 116);
                } else {
                    class341.field4807.method470(class629.field8382, var14, 0);
                }
            } catch (class149 var20) {
            }
        } else if (!class412.method2402(class15.field215, 84)) {
            for (int var16 = 0; var16 < class601.field7899; var16++) {
                class319.field4545[var16] = false;
            }
            try {
                if (class24.field412) {
                    class351.method2104((byte) 56);
                } else {
                    class341.field4807.method498(5);
                }
            } catch (class149 var19) {
                class135.method1056(var19.getMessage() + " (Recovered) " + this.method1882(arg0 + 109), var19, arg0 + 1);
                class421.method2435(false, -55, 0);
            }
        }
        class428.method2469(true);
        int var18 = class411.field5711.field3873.method3261(true);
        if (arg0 == var18) {
            class226.method1447((byte) -124, 15L);
        } else if (var18 == 1) {
            class226.method1447((byte) -124, 10L);
        } else if (var18 == 2) {
            class226.method1447((byte) -124, 5L);
        } else if (var18 == 3) {
            class226.method1447((byte) -124, 2L);
        }
        if (class4.field116) {
            class613.method3337(-25694);
        }
        if (class411.field5711.field3885.method1399(true) == 1 && class15.field215 == 3 && class443.field6101 != -1) {
            class411.field5711.method1677(class411.field5711.field3885, (byte) -71, 0);
            class2.method15(17458);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1135)
    private final void method1868(byte arg0) {
        int var2 = 29 % ((arg0 - 8) / 38);
        field4359++;
        boolean var3 = class448.field6137.method2081((byte) -99);
        if (!var3) {
            this.method1859(-101);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1151)
    public static void method1869(int arg0) {
        if (arg0 != 7879) {
            field4370 = null;
        }
        field4370 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1174)
    public final synchronized void method1870(int arg0) {
        field4358++;
        if (class514.field6818 != null && class295.field4217 == null && !class66.field828.field2900) {
            try {
                Class var2 = class514.field6818.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class295.field4217 = (Canvas) var3.get(class514.field6818);
                var3.set(class514.field6818, null);
                if (class295.field4217 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1870(arg0);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1205)
    public static final void method1871(int arg0) {
        int var1 = class586.field7665;
        int[] var2 = class20.field351;
        int var3 = class184.field2780 ? var1 : class306.field4404 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class742 var5;
            if (var4 < var1) {
                var5 = class248.field3438[var2[var4]];
            } else {
                var5 = ((class134) class390.field5470.method2135((long) class628.field8351[var4 - var1], (byte) 31)).field2154;
            }
            if (var5.field3508 == arg0) {
                var5.field10300 = 0;
                if (var5.field10223 < 0) {
                    var5.field10252 = false;
                } else {
                    int var6 = var5.method2256(-1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3505 & 0x1FF) != 0 || (var5.field3502 & 0x1FF) != 0) {
                            var5.field10252 = false;
                            continue;
                        }
                    } else if ((var5.field3505 & 0x1FF) != 256 || (var5.field3502 & 0x1FF) != 256) {
                        var5.field10252 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3505 >> 9;
                        int var8 = var5.field3502 >> 9;
                        if (class689.field9589[var7][var8] != var5.field10223) {
                            var5.field10252 = true;
                            continue;
                        }
                        if (class562.field7369[var7][var8] > 1) {
                            var10002 = class562.field7369[var7][var8]--;
                            var5.field10252 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field3505 - var9 >> 9;
                        int var11 = var5.field3502 - var9 >> 9;
                        int var12 = var5.field3505 + var9 >> 9;
                        int var13 = var5.field3502 + var9 >> 9;
                        if (!class446.method2557(var12, var11, false, var13, var10, var5.field10223)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class689.field9589[var14][var15] == var5.field10223) {
                                        var10002 = class562.field7369[var14][var15]--;
                                    }
                                }
                            }
                            var5.field10252 = true;
                            continue;
                        }
                    }
                    var5.field10252 = false;
                    var5.field3510 = class153.method1118(var5.field3502, var5.field3505, 127, var5.field3508);
                    class294.method1821(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1323)
    public static final void method1872() {
        class690.field9615 = 0;
        for (int var0 = 0; var0 < class306.field4404; var0++) {
            class556 var1 = ((class134) class390.field5470.method2135((long) class628.field8351[var0], (byte) 31)).field2154;
            if (var1.field10252 && var1.method2266((byte) 82) != -1) {
                int var2 = (var1.method2256(-1) - 1) * 256 + 252;
                int var3 = var1.field3505 - var2 >> 9;
                int var4 = var1.field3502 - var2 >> 9;
                class742 var5 = class608.method3303(var1.field3508, -28802, var4, var3);
                if (var5 != null) {
                    int var6 = var5.field10297;
                    if (var5 instanceof class556) {
                        var6 += 2048;
                    }
                    if (var5.field10300 == 0 && var5.method2266((byte) 99) != -1) {
                        class459.field6265[class690.field9615] = var6;
                        class28.field441[class690.field9615] = var6;
                        class690.field9615++;
                        var5.field10300++;
                    }
                    class459.field6265[class690.field9615] = var6;
                    class28.field441[class690.field9615] = var1.field10297 + 2048;
                    class690.field9615++;
                    var5.field10300++;
                }
            }
        }
        class169.method1204(class28.field441, 0, (byte) -105, class459.field6265, class690.field9615 - 1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lvfa;)Lvfa;", line = 1372)
    public static final class672 method1873(class672 arg0) {
        int var1 = method1875(arg0).method1344(121);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class21.method225(65535, arg0.field9255);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 1393)
    public static final void method1874(int arg0) {
        int var1 = class586.field7665;
        int[] var2 = class20.field351;
        for (int var3 = 0; var3 < class306.field4404 + var1; var3++) {
            class742 var4;
            if (var3 < var1) {
                var4 = class248.field3438[var2[var3]];
            } else {
                var4 = ((class134) class390.field5470.method2135((long) class628.field8351[var3 - var1], (byte) 31)).field2154;
            }
            if (var4.field3508 == arg0 && var4.field10223 >= 0) {
                int var5 = var4.method2256(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3505 & 0x1FF) != 0 || (var4.field3502 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field3505 & 0x1FF) != 256 || (var4.field3502 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3505 >> 9;
                    int var7 = var4.field3502 >> 9;
                    if (var4.field10223 > class689.field9589[var6][var7]) {
                        class689.field9589[var6][var7] = var4.field10223;
                        class562.field7369[var6][var7] = 1;
                    } else if (class689.field9589[var6][var7] == var4.field10223) {
                        var10002 = class562.field7369[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field3505 - var8 >> 9;
                    int var10 = var4.field3502 - var8 >> 9;
                    int var11 = var4.field3505 + var8 >> 9;
                    int var12 = var4.field3502 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field10223 > class689.field9589[var13][var14]) {
                                class689.field9589[var13][var14] = var4.field10223;
                                class562.field7369[var13][var14] = 1;
                            } else if (class689.field9589[var13][var14] == var4.field10223) {
                                var10002 = class562.field7369[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1493)
    public final void init() {
        field4356++;
        if (!this.method2128(-116)) {
            return;
        }
        class402.field5608 = new class557();
        class402.field5608.field7338 = Integer.parseInt(this.getParameter("worldid"));
        class202.field3033 = new class557();
        class202.field3033.field7338 = Integer.parseInt(this.getParameter("lobbyid"));
        class202.field3033.field7333 = this.getParameter("lobbyaddress");
        class478.field6562 = new class557();
        class478.field6562.field7338 = Integer.parseInt(this.getParameter("demoid"));
        class478.field6562.field7333 = this.getParameter("demoaddress");
        class508.field6778 = class155.method1129(0, Integer.parseInt(this.getParameter("modewhere")));
        if (class76.field924 == class508.field6778) {
            class508.field6778 = class464.field6384;
        } else if (!class434.method2496(-128, class508.field6778) && class508.field6778 != class304.field4326) {
            class508.field6778 = class304.field4326;
        }
        class426.field5869 = class354.method2118(Integer.parseInt(this.getParameter("modewhat")), 83);
        if (class563.field7375 != class426.field5869 && class606.field7951 != class426.field5869 && class426.field5869 != class418.field5768) {
            class426.field5869 = class418.field5768;
        }
        try {
            class713.field9854 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class713.field9854 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class343.field4824 = true;
        } else {
            class343.field4824 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class358.field4998 = true;
        } else {
            class358.field4998 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class589.field7687 = true;
        } else {
            class589.field7687 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class683.field9532 = class628.field8355;
            } else if (var4.equals("1")) {
                class683.field9532 = class12.field187;
            } else if (var4.equals("2")) {
                class683.field9532 = class718.field9950;
            } else if (var4.equals("3")) {
                class683.field9532 = class563.field7374;
            }
        }
        try {
            class236.field3316 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class236.field3316 = 0;
        }
        class277.field3865 = this.getParameter("quiturl");
        class686.field9560 = this.getParameter("settings");
        if (class686.field9560 == null) {
            class686.field9560 = "";
        }
        class574.field7531 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class75.field915 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class75.field915 = 0;
            }
        }
        class287.field4064 = Integer.parseInt(this.getParameter("colourid"));
        if (class287.field4064 < 0 || class567.field7455.length <= class287.field4064) {
            class287.field4064 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class525.field6968 = true;
            class224.field3170 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class289.field4122 = true;
        }
        class677.field9393 = this.getParameter("sskey");
        if (class677.field9393 != null && class677.field9393.length() < 2) {
            class677.field9393 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class471.field6445 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class36.field519 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class310.field4461 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class354.field4992 = this.getParameter("additionalInfo");
        if (class354.field4992 != null && class354.field4992.length() > 50) {
            class354.field4992 = null;
        }
        class243.field3401 = this;
        if (class683.field9532 == class628.field8355) {
            class69.field844 = 765;
            class304.field4321 = 503;
        } else if (class683.field9532 == class12.field187) {
            class304.field4321 = 480;
            class69.field844 = 640;
        }
        this.method2123(class426.field5869.method3068(-183) + 32, class683.field9532.field10630, 640, class69.field844, class304.field4321, (byte) -24, 37);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lvfa;)Lwfa;", line = 1655)
    public static final class200 method1875(class672 arg0) {
        class200 var1 = (class200) class33.field501.method2135(((long) arg0.field9200 << 32) + (long) arg0.field9277, (byte) 31);
        return var1 == null ? arg0.field9265 : var1;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 1660)
    private final void method1876(int arg0) {
        if (class15.field215 == 7 && class597.field7823 == 0) {
            if (class397.field5539 > 1) {
                class101.field1416 = class691.field9630;
                class397.field5539--;
            }
            if (!class403.field5625) {
                class645.method3532((byte) 106);
            }
            for (int var2 = 0; var2 < 100 && class47.method332((byte) -7); var2++) {
            }
        }
        field4360++;
        class244.field3417++;
        class668.method3690(-1, -104, null, -1);
        class416.method2410(-1, null, -1, (byte) 13);
        class473.method2667(0);
        class691.field9630++;
        for (int var3 = 0; var3 < class243.field3403; var3++) {
            class556 var4 = class302.field4281[var3].field2154;
            if (var4 != null) {
                byte var5 = var4.field7328.field2519;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2256(-1);
                    if ((var5 & 0x2) != 0 && var4.field10316 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field10322[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class719.field10004 - var6 - 1 < var9) {
                                var9 = class719.field10004 - var6 - 1;
                            }
                            int var10 = var4.field10321[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class107.field1453 - (var6 + 1))) {
                                var10 = class107.field1453 - var6 - 1;
                            }
                            int var11 = class270.method1627(var6, var4.field10322[0], class456.field6226[var4.field3508], var4.field10321[0], var6, class142.field2270, true, var6, 0, 28002, var10, 0, class481.field6585, var9, -1);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field10322[var12] = class142.field2270[var11 - var12 - 1];
                                    var4.field10321[var12] = class481.field6585[var11 - var12 - 1];
                                    var4.field10312[var12] = 1;
                                }
                                var4.field10316 = var11;
                            }
                        }
                    }
                    class388.method2301(arg0 ^ 0xFFFF85A4, var4, true);
                    int var13 = class614.method3340(-1, var4);
                    class360.method2145(-14705, var4);
                    class116.method955(class353.field4963, var4, (byte) -66, var13, class204.field3050);
                    class725.method4083(var4, class204.field3050, 0);
                    class572.method3150((byte) -111, var4);
                }
            }
        }
        if (class597.field7823 == 0 && class594.field7712 == 0) {
            if (class278.field3898 == 2) {
                class421.method2436(18128);
            } else {
                class514.method2872(arg0 ^ 0x79A6);
            }
            if ((class694.field9662 >> 9) < 14 || (class694.field9662 >> 9) >= (class719.field10004 - 14) || (class314.field4488 >> 9) < 14 || (class314.field4488 >> 9) >= (class107.field1453 - 14)) {
                class98.method730((byte) -73);
            }
        }
        while (true) {
            class309 var14;
            class672 var15;
            class672 var16;
            do {
                var14 = (class309) class127.field2095.method10(false);
                if (var14 == null) {
                    while (true) {
                        class309 var17;
                        class672 var18;
                        class672 var19;
                        do {
                            var17 = (class309) class706.field9783.method10(false);
                            if (var17 == null) {
                                while (true) {
                                    class309 var20;
                                    class672 var21;
                                    class672 var22;
                                    do {
                                        var20 = (class309) class358.field5005.method10(false);
                                        if (var20 == null) {
                                            if (class137.field2182 != null) {
                                                class59.method461((byte) 39);
                                            }
                                            if ((class29.field474 % 1500) == 0) {
                                                class742.method4133(arg0 ^ 0x23D3);
                                            }
                                            if (arg0 != 31140) {
                                                field4374 = 56;
                                            }
                                            if (class15.field215 == 7 && class597.field7823 == 0) {
                                                class442.method2544((byte) -89);
                                            }
                                            class304.method1856(false);
                                            if (class464.field6381 && class640.field8487 < class375.method2193(116) - 60000L) {
                                                class654.method3560((byte) -117);
                                            }
                                            for (class22 var23 = (class22) class407.field5653.method3874((byte) 92); var23 != null; var23 = (class22) class407.field5653.method3868(-24951)) {
                                                if ((class375.method2193(arg0 - 31024) / 1000L - 5L) > ((long) var23.field393)) {
                                                    if (var23.field397 > 0) {
                                                        class494.method2789(0, var23.field396 + class517.field6859.method2877(class713.field9854, (byte) -108), "", (byte) -15, "", "", 5);
                                                    }
                                                    if (var23.field397 == 0) {
                                                        class494.method2789(0, var23.field396 + class517.field6860.method2877(class713.field9854, (byte) -108), "", (byte) -15, "", "", 5);
                                                    }
                                                    var23.method2815(-123);
                                                }
                                            }
                                            if (class15.field215 == 7 && class597.field7823 == 0) {
                                                if (class209.field3089 == null) {
                                                    class339.method2036(arg0 - 31067, false);
                                                    return;
                                                }
                                                class567.field7457++;
                                                if (class567.field7457 > 50) {
                                                    class388.field5410++;
                                                    class583 var24 = class381.method2246(1, class128.field2105, class587.field7673);
                                                    class42.method309(var24, 0);
                                                }
                                                try {
                                                    class539.method3007(7388);
                                                    return;
                                                } catch (IOException var25) {
                                                    class339.method2036(102, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field4435;
                                        if (var21.field9277 < 0) {
                                            break;
                                        }
                                        var22 = class21.method225(65535, var21.field9255);
                                    } while (var22 == null || var22.field9240 == null || var22.field9240.length <= var21.field9277 || var22.field9240[var21.field9277] != var21);
                                    class182.method1249(var20);
                                }
                            }
                            var18 = var17.field4435;
                            if (var18.field9277 < 0) {
                                break;
                            }
                            var19 = class21.method225(65535, var18.field9255);
                        } while (var19 == null || var19.field9240 == null || var19.field9240.length <= var18.field9277 || var19.field9240[var18.field9277] != var18);
                        class182.method1249(var17);
                    }
                }
                var15 = var14.field4435;
                if (var15.field9277 < 0) {
                    break;
                }
                var16 = class21.method225(65535, var15.field9255);
            } while (var16 == null || var16.field9240 == null || var15.field9277 >= var16.field9240.length || var16.field9240[var15.field9277] != var15);
            class182.method1249(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1944)
    public static final void method1877() {
        int var0 = class586.field7665;
        int[] var1 = class20.field351;
        int var2 = class411.field5711.field3879.method2566(true);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class383 var14 = class248.field3438[var1[var4]];
            if (!var14.method2259((byte) -84)) {
                var14.field10223 = -1;
            } else if (var14.field5369) {
                var14.field10223 = -1;
            } else {
                var14.method794((byte) -128);
                if (var14.field9367 >= 0 && var14.field9354 >= 0 && var14.field9361 < class719.field10004 && var14.field9360 < class107.field1453) {
                    var14.field5345 = var14.field10304 ? var3 : false;
                    if (class472.field6475 == var14) {
                        var14.field10223 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field10252) {
                            var15++;
                        }
                        if (var14.field10229 > class29.field474) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2256(-1) << 2);
                        if (var14.field5349) {
                            var16 += 512;
                        } else {
                            if (class41.field550 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field10223 = var16 + 1;
                    }
                } else {
                    var14.field10223 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class306.field4404; var5++) {
            class556 var11 = ((class134) class390.field5470.method2135((long) class628.field8351[var5], (byte) 31)).field2154;
            if (var11.method3092((byte) -84) && var11.field7328.method1188(-1, class74.field901)) {
                var11.method794((byte) -128);
                if (var11.field9367 >= 0 && var11.field9354 >= 0 && var11.field9361 < class719.field10004 && var11.field9360 < class107.field1453) {
                    int var12 = 0;
                    if (!var11.field10252) {
                        var12++;
                    }
                    if (var11.field10229 > class29.field474) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2256(-1) << 2);
                    if (class41.field550 == 0) {
                        if (var11.field7328.field2503) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class41.field550 == 1) {
                        if (var11.field7328.field2503) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field7328.field2509) {
                        var13 += 1024;
                    } else if (!var11.field7328.field2541) {
                        var13 += 256;
                    }
                    var11.field10223 = var13 + 1;
                } else {
                    var11.field10223 = -1;
                }
            } else {
                var11.field10223 = -1;
            }
        }
        for (int var6 = 0; var6 < class27.field435.length; var6++) {
            class317 var7 = class27.field435[var6];
            if (var7 != null) {
                if (var7.field4526 == 1) {
                    class134 var8 = (class134) class390.field5470.method2135((long) var7.field4521, (byte) 31);
                    if (var8 != null) {
                        class556 var9 = var8.field2154;
                        if (var9.field10223 >= 0) {
                            var9.field10223 += 2048;
                        }
                    }
                } else if (var7.field4526 == 10) {
                    class383 var10 = class248.field3438[var7.field4521];
                    if (var10 != null && class472.field6475 != var10 && var10.field10223 >= 0) {
                        var10.field10223 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2117)
    public static final void method1878() {
        for (int var0 = 0; var0 < class719.field10004; var0++) {
            int[] var1 = class689.field9589[var0];
            for (int var2 = 0; var2 < class107.field1453; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lvfa;IIIIIIIIIII)V", line = 2137)
    public static final void method1879(class672[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class672 var13 = arg0[var12];
            if (var13 != null && var13.field9255 == arg1) {
                int var14 = var13.field9212 + arg6;
                int var15 = var13.field9325 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field9239 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field9287 + var14;
                    int var21 = var13.field9178 + var15;
                    if (var13.field9239 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field9239 == 0 || var13.field9250 || method1875(var13).field3004 != 0 || class758.field10549 == var13 || class371.field5165 == var13.field9160 || class511.field6789 == var13.field9160) {
                    if (!method1883(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class24.field412) {
                            var22 = class367.method2167(-2);
                            var23 = class672.method3717((byte) -37);
                        }
                        if (class137.field2182 == var13 && class277.method1667((byte) 48, class137.field2182) != null) {
                            class700.field9719 = true;
                            class736.field10180 = var14;
                            class277.field3856 = var15;
                        }
                        if (var13.field9251 || var16 < var18 && var17 < var19) {
                            if (var13.field9214 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class309 var24 = (class309) class358.field5005.method21(2); var24 != null; var24 = (class309) class358.field5005.method9(-127)) {
                                    if (var24.field4446) {
                                        var24.method3564(true);
                                        var24.field4435.field9221 = false;
                                    }
                                }
                                if (class587.field7672 == 0) {
                                    class137.field2182 = null;
                                    class758.field10549 = null;
                                }
                                class211.field3105 = 0;
                                class591.field7696 = false;
                                class305.field4394 = false;
                                if (!class403.field5625) {
                                    class645.method3532((byte) 61);
                                }
                            }
                            boolean var25;
                            if (class569.field7492.method780((byte) -56) + var22 >= var16 && class569.field7492.method772(127) + var23 >= var17 && class569.field7492.method780((byte) -123) + var22 < var18 && class569.field7492.method772(95) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class142.field2268 && var25) {
                                if (var13.field9249 >= 0) {
                                    class737.field10192 = var13.field9249;
                                } else if (var13.field9214) {
                                    class737.field10192 = -1;
                                }
                            }
                            if (!class403.field5625 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class225.method1437(88, arg11 - var15, var13, arg10 - var14);
                            }
                            boolean var26 = false;
                            if (class569.field7492.method777((byte) 119) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class466 var28 = (class466) class334.field4747.method21(2);
                            if (var28 != null && var28.method1100(-127) == 0 && var28.method1098(-15204) + var22 >= var16 && var28.method1099((byte) -68) + var23 >= var17 && var28.method1098(-15204) + var22 < var18 && var28.method1099((byte) -77) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field9262 != null && !class48.method335((byte) 65)) {
                                for (int var29 = 0; var29 < var13.field9262.length; var29++) {
                                    if (class153.field2345.method2313(true, var13.field9262[var29])) {
                                        if (var13.field9324 == null || class29.field474 >= var13.field9324[var29]) {
                                            byte var30 = var13.field9285[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class153.field2345.method2313(true, 86) && !class153.field2345.method2313(true, 82) && !class153.field2345.method2313(true, 81)) && ((var30 & 0x2) == 0 || class153.field2345.method2313(true, 86)) && ((var30 & 0x1) == 0 || class153.field2345.method2313(true, 82)) && ((var30 & 0x4) == 0 || class153.field2345.method2313(true, 81))) {
                                                if (var29 < 10) {
                                                    class50.method355("", -1, -1, var13.field9200, var29 + 1);
                                                } else if (var29 == 10) {
                                                    class617.method3377((byte) 65);
                                                    class200 var31 = method1875(var13);
                                                    class679.method3839(var31.field2998, 1, var13, var31.method1351(2));
                                                    class719.field10008 = class596.method3239(-1, var13);
                                                    if (class719.field10008 == null) {
                                                        class719.field10008 = "Null";
                                                    }
                                                    class341.field4808 = var13.field9165 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field9167[var29];
                                                if (var13.field9324 == null) {
                                                    var13.field9324 = new int[var13.field9262.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field9324[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field9324[var29] = class29.field474 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field9324 != null) {
                                        var13.field9324[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class155.method1128(var13, var22 + var28.method1098(-15204) - var14, var23 + var28.method1099((byte) -18) - var15, -103);
                            }
                            if (class137.field2182 != null && class137.field2182 != var13 && var25 && method1875(var13).method1345(-94)) {
                                class366.field5132 = var13;
                            }
                            if (class758.field10549 == var13) {
                                class463.field6373 = true;
                                class362.field5100 = var14;
                                class352.field4941 = var15;
                            }
                            if (var13.field9250 || var13.field9160 != 0) {
                                if (var25 && class118.field1903 != 0 && var13.field9159 != null) {
                                    class309 var33 = new class309();
                                    var33.field4446 = true;
                                    var33.field4435 = var13;
                                    var33.field4437 = class118.field1903;
                                    var33.field4439 = var13.field9159;
                                    class358.field5005.method11(var33, -114);
                                }
                                if (class137.field2182 != null || class403.field5625 || class501.field6729 != var13.field9160 && class211.field3105 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field9160 != 0) {
                                    if (class336.field4764 == var13.field9160 || class736.field10175 == var13.field9160) {
                                        class577.field7570 = var13;
                                        if (class749.field10430 != null) {
                                            class749.field10430.method3766(2, var13.field9178, class341.field4807);
                                        }
                                        if (class336.field4764 == var13.field9160) {
                                            if (class403.field5625 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class86.method658(class341.field4807, arg9, arg8, -284797828);
                                            class575 var34 = (class575) class747.field10394.method3874((byte) 50);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field7549 && arg10 < var34.field7553 && arg11 >= var34.field7556 && arg11 < var34.field7548) {
                                                    class645.method3532((byte) 73);
                                                    class362.method2155(var34.field7551, -123);
                                                }
                                                var34 = (class575) class747.field10394.method3868(-24951);
                                            }
                                        }
                                    }
                                    if (class371.field5165 == var13.field9160) {
                                        if (var13.method3715(class341.field4807, 0) == null || class694.field9657 != 0 && class694.field9657 != 3 || class403.field5625 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field9193[var36];
                                        if (var35 < var37 || var35 > var13.field9317[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field9287 / 2;
                                        int var39 = var36 - var13.field9178 / 2;
                                        int var40;
                                        if (class278.field3898 == 4) {
                                            var40 = (int) class547.field7230 & 0x3FFF;
                                        } else {
                                            var40 = (int) class547.field7230 + class649.field8626 & 0x3FFF;
                                        }
                                        int var41 = class451.field6174[var40];
                                        int var42 = class451.field6177[var40];
                                        if (class278.field3898 != 4) {
                                            var41 = (class260.field3629 + 256) * var41 >> 8;
                                            var42 = (class260.field3629 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class278.field3898 == 4) {
                                            var45 = (class513.field6808 >> 9) + (var43 >> 2);
                                            var46 = (class248.field3439 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class472.field6475.method2256(-1) - 1) * 256;
                                            var45 = (class472.field6475.field3505 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class472.field6475.field3502 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class142.field2268 && (class575.field7557 & 0x40) != 0) {
                                            class672 var48 = class239.method1503(class649.field8631, class136.field2168, 0);
                                            if (var48 == null) {
                                                class617.method3377((byte) 87);
                                            } else {
                                                class586.method3203(true, (long) (var13.field9277 << 0 | var13.field9200), 1L, true, var46, 21, false, var13.field9318, class414.field5733, class719.field10008, (byte) 87, " ->", var45);
                                            }
                                            continue;
                                        }
                                        if (class683.field9532 == class12.field187) {
                                            class586.method3203(true, 0L, 1L, true, var46, 2, false, -1, -1, class517.field6867.method2877(class713.field9854, (byte) -108), (byte) 87, "", var45);
                                        }
                                        class586.method3203(true, 0L, 1L, true, var46, 45, false, -1, class721.field10041, class643.field8558, (byte) 87, "", var45);
                                        continue;
                                    }
                                    if (class501.field6729 == var13.field9160) {
                                        class557.field7340 = var13;
                                        if (var25) {
                                            class591.field7696 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1098(-15204) - var14 - var13.field9287 / 2) * 2.0D / (double) class744.field10349);
                                            int var50 = (int) (-((double) (var23 + var28.method1099((byte) 122) - var15 - var13.field9178 / 2) * 2.0D / (double) class744.field10349));
                                            int var51 = class194.field2929 + var49 + class744.field10370;
                                            int var52 = class432.field5949 + var50 + class744.field10371;
                                            class640 var53 = class339.method2037(123);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method3507(var51, var52, -81, var54);
                                            if (var54 != null) {
                                                if (class153.field2345.method2313(true, 82) && class257.field3521 > 0) {
                                                    class559.method3108(var54[2], var54[1], var54[0], false);
                                                    continue;
                                                }
                                                class305.field4394 = true;
                                                class322.field4585 = var54[0];
                                                class333.field4733 = var54[1];
                                                class388.field5408 = var54[2];
                                            }
                                            class211.field3105 = 1;
                                            class670.field9134 = false;
                                            class228.field3253 = class569.field7492.method780((byte) -128);
                                            class568.field7466 = class569.field7492.method772(67);
                                            continue;
                                        }
                                        if (var26 && class211.field3105 > 0) {
                                            if (class211.field3105 == 1 && (class228.field3253 != class569.field7492.method780((byte) -122) || class568.field7466 != class569.field7492.method772(98))) {
                                                class727.field10096 = class194.field2929;
                                                class214.field3125 = class432.field5949;
                                                class211.field3105 = 2;
                                            }
                                            if (class211.field3105 == 2) {
                                                class670.field9134 = true;
                                                class29.method263((byte) -123, class727.field10096 + (int) ((double) (class228.field3253 - class569.field7492.method780((byte) -71)) * 2.0D / (double) class744.field10350));
                                                class422.method2449(class214.field3125 - (int) ((double) (class568.field7466 - class569.field7492.method772(62)) * 2.0D / (double) class744.field10350), -1);
                                            }
                                            continue;
                                        }
                                        if (class211.field3105 > 0 && !class670.field9134) {
                                            if ((class536.field7066 == 1 || class281.method1733(-555)) && class181.field2730 > 2) {
                                                class262.method1588(class568.field7466, 2, class228.field3253);
                                            } else if (class263.method1598(-1)) {
                                                class262.method1588(class568.field7466, 2, class228.field3253);
                                            }
                                        }
                                        class211.field3105 = 0;
                                        continue;
                                    }
                                    if (class585.field7652 == var13.field9160) {
                                        if (var26) {
                                            class565.method3126(var13.field9178, var13.field9287, var23 + class569.field7492.method772(118) - var15, (byte) -128, var22 + class569.field7492.method780((byte) -103) - var14);
                                        }
                                        continue;
                                    }
                                    if (class511.field6789 == var13.field9160) {
                                        class416.method2410(var14, var13, var15, (byte) 13);
                                        continue;
                                    }
                                }
                                if (!var13.field9275 && var27) {
                                    var13.field9275 = true;
                                    if (var13.field9183 != null) {
                                        class309 var55 = new class309();
                                        var55.field4446 = true;
                                        var55.field4435 = var13;
                                        var55.field4443 = var22 + var28.method1098(-15204) - var14;
                                        var55.field4437 = var23 + var28.method1099((byte) 127) - var15;
                                        var55.field4439 = var13.field9183;
                                        class358.field5005.method11(var55, -124);
                                    }
                                }
                                if (var13.field9275 && var26 && var13.field9271 != null) {
                                    class309 var56 = new class309();
                                    var56.field4446 = true;
                                    var56.field4435 = var13;
                                    var56.field4443 = var22 + class569.field7492.method780((byte) -71) - var14;
                                    var56.field4437 = var23 + class569.field7492.method772(87) - var15;
                                    var56.field4439 = var13.field9271;
                                    class358.field5005.method11(var56, -114);
                                }
                                if (var13.field9275 && !var26) {
                                    var13.field9275 = false;
                                    if (var13.field9215 != null) {
                                        class309 var57 = new class309();
                                        var57.field4446 = true;
                                        var57.field4435 = var13;
                                        var57.field4443 = var22 + class569.field7492.method780((byte) -128) - var14;
                                        var57.field4437 = var23 + class569.field7492.method772(126) - var15;
                                        var57.field4439 = var13.field9215;
                                        class706.field9783.method11(var57, -107);
                                    }
                                }
                                if (var26 && var13.field9179 != null) {
                                    class309 var58 = new class309();
                                    var58.field4446 = true;
                                    var58.field4435 = var13;
                                    var58.field4443 = var22 + class569.field7492.method780((byte) -51) - var14;
                                    var58.field4437 = var23 + class569.field7492.method772(74) - var15;
                                    var58.field4439 = var13.field9179;
                                    class358.field5005.method11(var58, -128);
                                }
                                if (!var13.field9221 && var25) {
                                    var13.field9221 = true;
                                    if (var13.field9303 != null) {
                                        class309 var59 = new class309();
                                        var59.field4446 = true;
                                        var59.field4435 = var13;
                                        var59.field4443 = var22 + class569.field7492.method780((byte) -121) - var14;
                                        var59.field4437 = var23 + class569.field7492.method772(46) - var15;
                                        var59.field4439 = var13.field9303;
                                        class358.field5005.method11(var59, -91);
                                    }
                                }
                                if (var13.field9221 && var25 && var13.field9162 != null) {
                                    class309 var60 = new class309();
                                    var60.field4446 = true;
                                    var60.field4435 = var13;
                                    var60.field4443 = var22 + class569.field7492.method780((byte) -79) - var14;
                                    var60.field4437 = var23 + class569.field7492.method772(67) - var15;
                                    var60.field4439 = var13.field9162;
                                    class358.field5005.method11(var60, -109);
                                }
                                if (var13.field9221 && !var25) {
                                    var13.field9221 = false;
                                    if (var13.field9175 != null) {
                                        class309 var61 = new class309();
                                        var61.field4446 = true;
                                        var61.field4435 = var13;
                                        var61.field4443 = var22 + class569.field7492.method780((byte) -51) - var14;
                                        var61.field4437 = var23 + class569.field7492.method772(126) - var15;
                                        var61.field4439 = var13.field9175;
                                        class706.field9783.method11(var61, -106);
                                    }
                                }
                                if (var13.field9306 != null) {
                                    class309 var62 = new class309();
                                    var62.field4435 = var13;
                                    var62.field4439 = var13.field9306;
                                    class127.field2095.method11(var62, -104);
                                }
                                if (var13.field9222 != null && class105.field1449 > var13.field9312) {
                                    if (var13.field9232 == null || class105.field1449 - var13.field9312 > 32) {
                                        class309 var67 = new class309();
                                        var67.field4435 = var13;
                                        var67.field4439 = var13.field9222;
                                        class358.field5005.method11(var67, -122);
                                    } else {
                                        label699: for (int var63 = var13.field9312; var63 < class105.field1449; var63++) {
                                            int var64 = class660.field8719[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field9232.length; var65++) {
                                                if (var13.field9232[var65] == var64) {
                                                    class309 var66 = new class309();
                                                    var66.field4435 = var13;
                                                    var66.field4439 = var13.field9222;
                                                    class358.field5005.method11(var66, -115);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9312 = class105.field1449;
                                }
                                if (var13.field9180 != null && class82.field991 > var13.field9204) {
                                    if (var13.field9197 == null || class82.field991 - var13.field9204 > 32) {
                                        class309 var72 = new class309();
                                        var72.field4435 = var13;
                                        var72.field4439 = var13.field9180;
                                        class358.field5005.method11(var72, -97);
                                    } else {
                                        label675: for (int var68 = var13.field9204; var68 < class82.field991; var68++) {
                                            int var69 = class278.field3914[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field9197.length; var70++) {
                                                if (var13.field9197[var70] == var69) {
                                                    class309 var71 = new class309();
                                                    var71.field4435 = var13;
                                                    var71.field4439 = var13.field9180;
                                                    class358.field5005.method11(var71, -118);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9204 = class82.field991;
                                }
                                if (var13.field9313 != null && class142.field2265 > var13.field9191) {
                                    if (var13.field9207 == null || class142.field2265 - var13.field9191 > 32) {
                                        class309 var77 = new class309();
                                        var77.field4435 = var13;
                                        var77.field4439 = var13.field9313;
                                        class358.field5005.method11(var77, -97);
                                    } else {
                                        label651: for (int var73 = var13.field9191; var73 < class142.field2265; var73++) {
                                            int var74 = class135.field2157[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field9207.length; var75++) {
                                                if (var13.field9207[var75] == var74) {
                                                    class309 var76 = new class309();
                                                    var76.field4435 = var13;
                                                    var76.field4439 = var13.field9313;
                                                    class358.field5005.method11(var76, -106);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9191 = class142.field2265;
                                }
                                if (var13.field9217 != null && class392.field5479 > var13.field9264) {
                                    if (var13.field9279 == null || class392.field5479 - var13.field9264 > 32) {
                                        class309 var82 = new class309();
                                        var82.field4435 = var13;
                                        var82.field4439 = var13.field9217;
                                        class358.field5005.method11(var82, -104);
                                    } else {
                                        label627: for (int var78 = var13.field9264; var78 < class392.field5479; var78++) {
                                            int var79 = class475.field6511[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field9279.length; var80++) {
                                                if (var13.field9279[var80] == var79) {
                                                    class309 var81 = new class309();
                                                    var81.field4435 = var13;
                                                    var81.field4439 = var13.field9217;
                                                    class358.field5005.method11(var81, -124);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9264 = class392.field5479;
                                }
                                if (var13.field9201 != null && class471.field6449 > var13.field9256) {
                                    if (var13.field9182 == null || class471.field6449 - var13.field9256 > 32) {
                                        class309 var87 = new class309();
                                        var87.field4435 = var13;
                                        var87.field4439 = var13.field9201;
                                        class358.field5005.method11(var87, -95);
                                    } else {
                                        label603: for (int var83 = var13.field9256; var83 < class471.field6449; var83++) {
                                            int var84 = class466.field6414[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field9182.length; var85++) {
                                                if (var13.field9182[var85] == var84) {
                                                    class309 var86 = new class309();
                                                    var86.field4435 = var13;
                                                    var86.field4439 = var13.field9201;
                                                    class358.field5005.method11(var86, -92);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9256 = class471.field6449;
                                }
                                if (class225.field3199 > var13.field9332 && var13.field9268 != null) {
                                    class309 var88 = new class309();
                                    var88.field4435 = var13;
                                    var88.field4439 = var13.field9268;
                                    class358.field5005.method11(var88, -120);
                                }
                                if (class241.field3387 > var13.field9332 && var13.field9213 != null) {
                                    class309 var89 = new class309();
                                    var89.field4435 = var13;
                                    var89.field4439 = var13.field9213;
                                    class358.field5005.method11(var89, -123);
                                }
                                if (class433.field5953 > var13.field9332 && var13.field9331 != null) {
                                    class309 var90 = new class309();
                                    var90.field4435 = var13;
                                    var90.field4439 = var13.field9331;
                                    class358.field5005.method11(var90, -111);
                                }
                                if (class399.field5566 > var13.field9332 && var13.field9181 != null) {
                                    class309 var91 = new class309();
                                    var91.field4435 = var13;
                                    var91.field4439 = var13.field9181;
                                    class358.field5005.method11(var91, -124);
                                }
                                if (class101.field1416 > var13.field9332 && var13.field9169 != null) {
                                    class309 var92 = new class309();
                                    var92.field4435 = var13;
                                    var92.field4439 = var13.field9169;
                                    class358.field5005.method11(var92, -106);
                                }
                                var13.field9332 = class691.field9630;
                                if (var13.field9310 != null) {
                                    for (int var93 = 0; var93 < class26.field424; var93++) {
                                        class309 var94 = new class309();
                                        var94.field4435 = var13;
                                        var94.field4448 = class26.field421[var93].method2250(-18458);
                                        var94.field4449 = class26.field421[var93].method2248((byte) -47);
                                        var94.field4439 = var13.field9310;
                                        class358.field5005.method11(var94, -113);
                                    }
                                }
                                if (class462.field6358 && var13.field9326 != null) {
                                    class309 var95 = new class309();
                                    var95.field4435 = var13;
                                    var95.field4439 = var13.field9326;
                                    class358.field5005.method11(var95, -114);
                                }
                            }
                            if (var13.field9239 == 5 && var13.field9246 != -1) {
                                var13.method3707((byte) -52, class2.field26, class137.field2187).method3766(2, var13.field9178, class341.field4807);
                            }
                            class296.method1831((byte) -24, var13);
                            if (var13.field9239 == 0) {
                                method1879(arg0, var13.field9200, var16, var17, var18, var19, var14 - var13.field9216, var15 - var13.field9226, arg8, arg9, arg10, arg11);
                                if (var13.field9240 != null) {
                                    method1879(var13.field9240, var13.field9200, var16, var17, var18, var19, var14 - var13.field9216, var15 - var13.field9226, arg8, arg9, arg10, arg11);
                                }
                                class8 var96 = (class8) class350.field4925.method2135((long) var13.field9200, (byte) 31);
                                if (var96 != null) {
                                    if (class683.field9532 == class628.field8355 && var96.field157 == 0 && !class403.field5625 && var25 && !class320.field4567) {
                                        class645.method3532((byte) 109);
                                    }
                                    class114.method952(arg8, arg9, var16, var14, var15, var17, 102, arg10, arg11, var18, var19, var96.field161);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class296.method1831((byte) -24, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3050)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class449.method2569("Argument count", false);
            }
            class402.field5608 = new class557();
            class402.field5608.field7338 = Integer.parseInt(arg0[0]);
            class202.field3033 = new class557();
            class202.field3033.field7338 = Integer.parseInt(arg0[1]);
            class478.field6562 = new class557();
            class478.field6562.field7338 = Integer.parseInt(arg0[2]);
            class508.field6778 = class76.field924;
            if (arg0[3].equals("live")) {
                class426.field5869 = class418.field5768;
            } else if (arg0[3].equals("rc")) {
                class426.field5869 = class606.field7951;
            } else if (arg0[3].equals("wip")) {
                class426.field5869 = class563.field7375;
            } else {
                class449.method2569("modewhat", false);
            }
            class713.field9854 = class114.method953(arg0[4], 5);
            if (class713.field9854 == -1) {
                if (arg0[4].equals("english")) {
                    class713.field9854 = 0;
                } else if (arg0[4].equals("german")) {
                    class713.field9854 = 1;
                } else {
                    class449.method2569("language", false);
                }
            }
            class358.field4998 = false;
            class343.field4824 = false;
            if (arg0[5].equals("game0")) {
                class683.field9532 = class628.field8355;
            } else if (arg0[5].equals("game1")) {
                class683.field9532 = class12.field187;
            } else if (arg0[5].equals("game2")) {
                class683.field9532 = class718.field9950;
            } else if (arg0[5].equals("game3")) {
                class683.field9532 = class563.field7374;
            } else {
                class449.method2569("game", false);
            }
            class677.field9393 = null;
            class289.field4122 = false;
            class310.field4461 = 0L;
            class354.field4992 = null;
            class471.field6445 = false;
            class236.field3316 = 0;
            class686.field9560 = "";
            class75.field915 = 0;
            class287.field4064 = class683.field9532.field10627;
            class36.field519 = 0;
            class525.field6968 = true;
            class224.field3170 = true;
            client var1 = new client();
            class243.field3401 = var1;
            var1.method2124(1024, class683.field9532.field10630, false, 37, 640, 768, class426.field5869.method3068(-183) + 32, -124);
            class218.field3143.setLocation(40, 40);
        } catch (Exception var3) {
            class135.method1056(null, var3, 1);
        }
        field4361++;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V", line = 3137)
    private final void method1880(int arg0) {
        field4364++;
        if (class15.field215 == 14) {
            return;
        }
        class29.field474++;
        if ((class29.field474 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class43.field567 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class459.field6266.setSeed((long) class43.field567);
        }
        if (class29.field474 % 50 == 0) {
            class42.field554 = class598.field7848;
            class517.field6908 = class333.field4734;
            class598.field7848 = 0;
            class333.field4734 = 0;
        }
        this.method1868((byte) 73);
        if (class690.field9610 != null) {
            class690.field9610.method654((byte) -43);
        }
        class498.method2806(-122);
        class60.method526((byte) 125);
        class153.field2345.method2307((byte) -92);
        class569.field7492.method778(-6928);
        if (class341.field4807 != null) {
            class341.field4807.method501((int) class375.method2193(arg0 + 116));
        }
        class400.method2359(-3);
        class639.field8478 = 0;
        class26.field424 = 0;
        for (class638 var3 = class153.field2345.method2316(arg0 + 20175); var3 != null; var3 = class153.field2345.method2316(arg0 + 20175)) {
            int var6 = var3.method2253(-24548);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2248((byte) -77);
                if (class578.method3169(arg0 ^ 0x52) && var7 == '`' || var7 == '§' || var7 == '²') {
                    if (class48.method335((byte) 83)) {
                        class229.method1454((byte) -15);
                    } else {
                        class309.method1905(false);
                    }
                } else if (class26.field424 < 128) {
                    class26.field421[class26.field424] = var3;
                    class26.field424++;
                }
            } else if (var6 == 0 && class639.field8478 < 75) {
                class32.field495[class639.field8478] = var3;
                class639.field8478++;
            }
        }
        class118.field1903 = arg0;
        for (class466 var4 = class569.field7492.method773((byte) 127); var4 != null; var4 = class569.field7492.method773((byte) 126)) {
            int var5 = var4.method1100(-128);
            if (var5 == -1) {
                class63.field774.method11(var4, arg0 ^ 0xFFFFFF91);
            } else if (var5 == 6) {
                class118.field1903 += var4.method1097(19702);
            } else if (class354.method2117(var5, (byte) 79)) {
                class334.field4747.method11(var4, -97);
                if (class334.field4747.method14(0) > 10) {
                    class334.field4747.method10(false);
                }
            }
        }
        if (class48.method335((byte) 107)) {
            class47.method331(arg0 ^ 0x2280);
        }
        if (class412.method2402(class15.field215, 114)) {
            class226.method1446((byte) 66);
            class308.method1901(0);
        } else if (class608.method3313(-86, class15.field215)) {
            class401.method2364((byte) -105);
        }
        if (class745.method4176(arg0 - 6, class15.field215) && !class608.method3313(arg0 - 92, class15.field215)) {
            this.method1876(31140);
            class531.method2960((byte) -33);
            class277.method1669(arg0 + 14);
        } else if (class239.method1501((byte) -14, class15.field215) && !class608.method3313(-41, class15.field215)) {
            this.method1876(31140);
            class277.method1669(14);
        } else if (class15.field215 == 12) {
            class277.method1669(14);
        } else if (class574.method3162((byte) 13, class15.field215) && !class608.method3313(arg0 - 74, class15.field215)) {
            class438.method2517((byte) -44);
        } else if (class15.field215 == 13) {
            class277.method1669(14);
            if (class299.field4249 != -3 && class299.field4249 != 2 && class299.field4249 != 15) {
                class339.method2036(arg0 ^ 0x1F, false);
            }
        }
        class546.method3057(26160, class341.field4807);
        class334.field4747.method10(false);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 3302)
    public final void method1881(int arg0) {
        field4367++;
        if (class471.field6445) {
            class365.field5128 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class659.method3576(arg0 ^ 0xFFFFFFEA);
        class339.field4798 = new class244(class66.field828);
        class448.field6137 = new class348();
        class90.method685(new int[] { 1000, 100 }, false, new int[] { arg0, 260 });
        if (class508.field6778 != class304.field4326) {
            class746.field10383 = new byte[50][];
        }
        class411.field5711 = class440.method2535(0);
        if (class508.field6778 == class304.field4326) {
            class402.field5608.field7333 = this.getCodeBase().getHost();
        } else if (class434.method2496(-119, class508.field6778)) {
            class402.field5608.field7333 = this.getCodeBase().getHost();
            class402.field5608.field7345 = class402.field5608.field7338 + 40000;
            class202.field3033.field7345 = class202.field3033.field7338 + 40000;
            class478.field6562.field7345 = class478.field6562.field7338 + 40000;
            class402.field5608.field7342 = class402.field5608.field7338 + 50000;
            class202.field3033.field7342 = class202.field3033.field7338 + 50000;
            class478.field6562.field7342 = class478.field6562.field7338 + 50000;
        } else if (class76.field924 == class508.field6778) {
            class402.field5608.field7333 = "127.0.0.1";
            class202.field3033.field7333 = "127.0.0.1";
            class402.field5608.field7345 = class402.field5608.field7338 + 40000;
            class478.field6562.field7333 = "127.0.0.1";
            class202.field3033.field7345 = class202.field3033.field7338 + 40000;
            class478.field6562.field7345 = class478.field6562.field7338 + 40000;
            class402.field5608.field7342 = class402.field5608.field7338 + 50000;
            class202.field3033.field7342 = class202.field3033.field7338 + 50000;
            class478.field6562.field7342 = class478.field6562.field7338 + 50000;
        }
        if (class683.field9532 == class628.field8355) {
            class613.field8161 = false;
        }
        class393.field5486 = class454.field6195 = class601.field7894 = class528.field7010 = new short[256];
        class284.field4030 = class402.field5608;
        if (class683.field9532 == class12.field187) {
            class434.field5978 = class547.field7227;
            class213.field3119 = 16777215;
            class658.field8699 = true;
            class412.field5715 = 0;
            class445.field6119 = class358.field5000;
        } else if (class683.field9532 == class563.field7374) {
            class434.field5978 = class123.field2063;
            class445.field6119 = class97.field1199;
        } else {
            class434.field5978 = class286.field4054;
            class445.field6119 = class105.field1444;
        }
        try {
            class710.field9837 = class243.field3401.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class153.field2345 = class727.method4087(class295.field4217, true);
        class569.field7492 = class675.method3761(class295.field4217, true, (byte) 122);
        try {
            if (class66.field828.field2895 != null) {
                class736.field10177 = new class569(class66.field828.field2895, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class140.field2217[var3] = new class569(class66.field828.field2886[var3], 6000, 0);
                }
                class20.field352 = new class569(class66.field828.field2889, 6000, 0);
                class615.field8203 = new class498(255, class736.field10177, class20.field352, 500000);
                class671.field9154 = new class569(class66.field828.field2887, 24, 0);
                class66.field828.field2889 = null;
                class66.field828.field2887 = null;
                class66.field828.field2886 = null;
                class66.field828.field2895 = null;
            }
        } catch (IOException var5) {
            class736.field10177 = null;
            class671.field9154 = null;
            class20.field352 = null;
            class615.field8203 = null;
        }
        if (class508.field6778 != class304.field4326) {
            class365.field5129 = true;
        }
        class314.field4489 = class517.field6852.method2877(class713.field9854, (byte) -108);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/lang/String;", line = 3426)
    public final String method1882(int arg0) {
        field4362++;
        int var2 = 17 % ((arg0 - 43) / 32);
        String var3 = null;
        try {
            var3 = "[1)" + class503.field6752 + "," + class334.field4757 + "," + class719.field10004 + "," + class107.field1453 + "|";
            if (class472.field6475 != null) {
                var3 = var3 + "2)" + class507.field6775 + "," + (class472.field6475.field10322[0] + class503.field6752) + "," + (class472.field6475.field10321[0] + class334.field4757) + "|";
            }
            var3 = var3 + "3)" + class411.field5711.field3913.method3282(true) + "|4)" + class411.field5711.field3895.method74(true) + "|5)" + class343.method2050((byte) -112) + "|6)" + class228.field3251 + "," + class199.field2993 + "|";
            var3 = var3 + "7)" + class411.field5711.field3902.method3070(true) + "|";
            var3 = var3 + "8)" + class411.field5711.field3897.method1057(true) + "|";
            var3 = var3 + "9)" + class411.field5711.field3915.method574(true) + "|";
            var3 = var3 + "10)" + class411.field5711.field3868.method1851(true) + "|";
            var3 = var3 + "11)" + class411.field5711.field3876.method2974(true) + "|";
            var3 = var3 + "12)" + class411.field5711.field3890.method984(true) + "|";
            var3 = var3 + "13)" + class365.field5128 + "|";
            var3 = var3 + "14)" + class15.field215;
            if (class136.field2170 != null) {
                var3 = var3 + "|15)" + class136.field2170.field8620;
            }
            try {
                if (class411.field5711.field3913.method3282(true) == 2) {
                    Class var4 = Class.forName("java.lang.ClassLoader");
                    Field var5 = var4.getDeclaredField("nativeLibraries");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var7.invoke(var5, Boolean.TRUE);
                    Vector var8 = (Vector) var5.get((field4375 == null ? (field4375 = method1884("client")) : field4375).getClassLoader());
                    for (int var9 = 0; var8.size() > var9; var9++) {
                        try {
                            Object var10 = var8.elementAt(var9);
                            Field var11 = var10.getClass().getDeclaredField("name");
                            var7.invoke(var11, Boolean.TRUE);
                            try {
                                String var12 = (String) var11.get(var10);
                                if (var12 != null && var12.indexOf("sw3d.dll") != -1) {
                                    Field var13 = var10.getClass().getDeclaredField("handle");
                                    var7.invoke(var13, Boolean.TRUE);
                                    var3 = var3 + "|16)" + Long.toHexString(var13.getLong(var10));
                                    var7.invoke(var13, Boolean.FALSE);
                                }
                            } catch (Throwable var14) {
                            }
                            var7.invoke(var11, Boolean.FALSE);
                        } catch (Throwable var15) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var3 = var3 + "]";
        } catch (Throwable var17) {
        }
        return var3;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lvfa;)Z", line = 3509)
    public static final boolean method1883(class672 arg0) {
        if (class320.field4567) {
            if (method1875(arg0).field3004 != 0) {
                return false;
            }
            if (arg0.field9239 == 0) {
                return false;
            }
        }
        return arg0.field9248;
    }
}
