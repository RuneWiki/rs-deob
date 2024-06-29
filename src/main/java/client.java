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
public class client extends class444 {

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
    public static int[] field856 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lch;")
    private static class151 field858 = new class151("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[Ljava/lang/String;")
    public static String[] field874 = new String[100];

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lap;")
    public static class310 field873 = new class310(73, -1);

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lrn;")
    public static class417 field875;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field878;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[[B")
    public static byte[][] field876;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method552(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V", line = 3)
    private final void method529(byte arg0, byte[] arg1) {
        field859++;
        class161 var3 = new class161(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method1172((byte) 26);
                    if (var4 == 0) {
                        if (arg0 != -112) {
                            field876 = null;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class162.field2359 = new int[6];
                        var9[0] = var3.method1134(arg0 - 16736);
                        var9[1] = var3.method1134(-16848);
                        var9[2] = var3.method1134(class134.method993(arg0, 16800));
                        var9[3] = var3.method1134(-16848);
                        var9[4] = var3.method1134(-16848);
                        var9[5] = var3.method1134(-16848);
                    } else if (var4 == 4) {
                        int var5 = var3.method1172((byte) -107);
                        class241.field3521 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class241.field3521[var6] = var3.method1134(-16848);
                            if (class241.field3521[var6] == 65535) {
                                class241.field3521[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method1172((byte) -109);
                        class484.field6859 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class484.field6859[var8] = var3.method1134(-16848);
                            if (class484.field6859[var8] == 65535) {
                                class484.field6859[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 79)
    public static final void method530() {
        class254.field3647 = 0;
        for (int var0 = 0; var0 < class24.field257; var0++) {
            class361 var1 = class163.field2377[class193.field2873[var0]];
            if (var1.field5760 && var1.method243(-28773) != -1) {
                int var2 = (var1.method245(4452) - 1) * 64 + 60;
                int var3 = var1.field4537 - var2 >> 7;
                int var4 = var1.field4530 - var2 >> 7;
                class418 var5 = class91.method762(var1.field4531, var3, var4, 1);
                if (var5 != null) {
                    int var6 = var5.field5751;
                    if (var5 instanceof class361) {
                        var6 += 2048;
                    }
                    if (var5.field5754 == 0 && var5.method243(-28773) != -1) {
                        class365.field5022[class254.field3647] = var6;
                        class225.field3243[class254.field3647] = var6;
                        class254.field3647++;
                        var5.field5754++;
                    }
                    class365.field5022[class254.field3647] = var6;
                    class225.field3243[class254.field3647] = var1.field5751 + 2048;
                    class254.field3647++;
                    var5.field5754++;
                }
            }
        }
        class182.method1303((byte) 102, 0, class254.field3647 - 1, class225.field3243, class365.field5022);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 130)
    public static final void method531() {
        for (int var0 = 0; var0 < class36.field388; var0++) {
            int[] var1 = class154.field2133[var0];
            for (int var2 = 0; var2 < class68.field998; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lae;)Lae;", line = 151)
    public static final class172 method532(class172 arg0) {
        int var1 = method547(arg0).method874(-16368);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class361.method2217(arg0.field2532, -1060820048);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 172)
    public final void method533(byte arg0) {
        field869++;
        method538(4);
        class145.method1037((byte) 109);
        class333.method2097(-18267);
        class334.method2103(false);
        class151.method1077(28021);
        class269.method1823(false);
        class230.method1627(-51);
        class317.method2022(arg0 + 89);
        class47.method478((byte) 40);
        class449.method2713(-21041);
        class304.method1957((byte) 95);
        class155.method1103(arg0 ^ 0x7);
        class444.method2700(true);
        class192.method1342(1181);
        class294.method1915((byte) -105);
        class280.method1869(7);
        class89.method746(0);
        class177.method1272(arg0 ^ 0x7108);
        class255.method1723(24057);
        class92.method772((byte) -82);
        class79.method689(-14261);
        class332.method2086(20898);
        class412.method2463(0);
        class99.method816((byte) 109);
        class98.method806(arg0 - 16615);
        class189.method1325((byte) 25);
        class435.method2654(-54);
        class178.method1278((byte) 108);
        class102.method825((byte) -115);
        class336.method2115(1);
        class263.method1778(arg0 ^ 0xFFFFFF87);
        class439.method2671(-90);
        class185.method1317((byte) -106);
        class22.method162(4096);
        class300.method1932(960);
        class9.method48(6);
        class408.method2443(17075);
        class53.method500(128);
        class380.method2318(117);
        class106.method844((byte) -61);
        class314.method1996(arg0 ^ 0x4A);
        class237.method1650((byte) 106);
        class233.method1633(true);
        class307.method1969((byte) -108);
        class276.method1858(100);
        class82.method695(-104);
        class219.method1508(false);
        class238.method1659((byte) -114);
        class26.method179(false);
        class96.method799(22683);
        class209.method1429(-87);
        class382.method2331(23398);
        class411.method2462(103);
        class361.method2219((byte) -126);
        class84.method711(true);
        class108.method856(-108);
        class282.method1877(false);
        class445.method2703(3794);
        class18.method112(125);
        class454.method2734(arg0 + 136);
        class67.method627((byte) 118);
        if (arg0 != -28) {
            field874 = null;
        }
        class481.method2837(arg0 ^ 0xFFFFFFE5);
        class442.method2689((byte) 71);
        class262.method1770(0);
        class172.method1249(-711837116);
        class473.method2802((byte) -122);
        class39.method253(1);
        class56.method518(arg0 ^ 0x2F);
        class94.method791((byte) -9);
        class149.method1066((byte) 68);
        class74.method661((byte) -38);
        class161.method1149((byte) 5);
        class303.method1947(-17010);
        class418.method2503((byte) 127);
        class52.method494(0);
        class443.method2691(true);
        class399.method2399(-13954);
        class143.method1029(arg0 - 60);
        class110.method876(47);
        class310.method1981((byte) -110);
        class405.method2429(32739);
        class349.method2162(arg0 ^ 0xFFFFFFE4);
        class194.method1358(173);
        class430.method2576(arg0 ^ 0xFFFFFFDF);
        class468.method2786(0);
        class241.method1679((byte) 126);
        class404.method2426((byte) -97);
        class419.method2512(20779);
        class365.method2239(arg0 - 9971);
        class323.method2042((byte) -81);
        class401.method2410(0);
        class315.method2005(arg0 ^ 0xFFFFFFE9);
        class86.method729(true);
        class38.method237((byte) -120);
        class153.method1089(17);
        class186.method1318(true);
        class353.method2177(14389);
        class424.method2527((byte) 121);
        class135.method1000(0);
        class305.method1964(true);
        class225.method1531(112);
        class483.method2845(-115);
        class206.method1413((byte) -22);
        class267.method1805(-128);
        class406.method2433(5);
        class37.method224(true);
        class448.method2711(1);
        class312.method1988(9682);
        class370.method2262(-8786);
        class352.method2171((byte) 7);
        class372.method2271((byte) -60);
        class137.method1009(3);
        class157.method1127(false);
        class112.method885(8);
        class204.method1406(arg0 + 29);
        class477.method2825((byte) 93);
        class3.method23();
        class36.method216((byte) 120);
        class368.method2254((byte) -114);
        class20.method147(0);
        class71.method643((byte) -40);
        class268.method1816((byte) -14);
        class24.method170(arg0 - 71);
        class457.method2743();
        class330.method2064();
        class313.method1993(108);
        class266.method1795(true);
        class226.method1542();
        class450.method2721((byte) 29);
        class76.method672((byte) -82);
        class8.method44((byte) 25);
        class464.method2769(-1);
        class169.method1227((byte) 80);
        class118.method918(arg0 + 10272);
        class379.method2308(true);
        class462.method2763(22970);
        class129.method968((byte) -48);
        class389.method2360((byte) -81);
        class212.method1443((byte) 6);
        class62.method570((byte) -126);
        class261.method1760(true);
        class354.method2183(324522536);
        class54.method516((byte) 62);
        class397.method2392(-1);
        class125.method948(-128);
        class51.method490((byte) -84);
        class484.method2849((byte) 70);
        class162.method1198(true);
        class441.method2683(0);
        class373.method2276((byte) 112);
        class217.method1494(112);
        class175.method1264(-20626);
        class410.method2453(-1);
        class319.method2028(arg0 + 112);
        class384.method2344((byte) 63);
        class414.method2484(false);
        class476.method2817(false);
        class301.method1936(11);
        class167.method1217(true);
        class57.method523(arg0 ^ 0xFFFFFFE5);
        class168.method1221(-30538);
        class423.method2519((byte) 40);
        class290.method1907(-16019);
        class251.method1715();
        class196.method1364((byte) 25);
        class107.method852(-98);
        class21.method149((byte) -12);
        class191.method1341(arg0 + 43);
        class25.method175(-1);
        class35.method213((byte) -126);
        class254.method1722(-90);
        class385.method2345(arg0 + 22381);
        class472.method2801((byte) -121);
        class30.method195(-24);
        class292.method1911((byte) -128);
        class325.method2050(255);
        class309.method1974((byte) -40);
        class273.method1848(-1);
        class113.method894();
        class436.method2662(26123);
        class19.method134(0);
        class34.method209((byte) -55);
        class390.method2368((byte) 94);
        class174.method1259(arg0 + 27);
        class421.method2514(arg0 ^ 0xFFFFFBE4);
        class371.method2265(0);
        class131.method981(117);
        class340.method2126((byte) 8);
        class183.method1308(arg0 ^ 0xFFFFFFAA);
        class427.method2554((byte) -119);
        class55.method517(6);
        class48.method482(arg0 - 6709);
        class117.method911(34);
        class193.method1347(3);
        class285.method1883(-31);
        class31.method197(18689);
        class475.method2813(-4);
        class184.method1312(arg0 + 119);
        class311.method1983((byte) -89);
        class152.method1086();
        class342.method2134((byte) -27);
        class6.method33(-44);
        class27.method183((byte) 24);
        class260.method1747((byte) -77);
        class367.method2247(0);
        class398.method2394((byte) -65);
        class223.method1528(-128);
        class320.method2033((byte) 99);
        class164.method1207((byte) 114);
        class345.method2145(-441);
        class374.method2286(arg0 ^ 0xFFFFFFFB);
        class97.method804(-8892);
        class111.method884(1);
        class466.method2778((byte) -125);
        class291.method1909(-128);
        class61.method556((byte) -73);
        class471.method2796();
        class295.method1918((byte) 85);
        class428.method2557(true);
        class393.method2379(-2);
        class407.method2438((byte) -123);
        class138.method1011((byte) 23);
        class279.method1863(-2);
        class329.method2058(122);
        class91.method759(-1);
        class66.method622(-96);
        class287.method1892();
        class357.method2207(arg0 - 88);
        class7.method37(21963);
        class247.method1703(98);
        class4.method30((byte) 66);
        class432.method2618(-1);
        class15.method92(4);
        class469.method2794((byte) 53);
        class416.method2489((byte) 70);
        class158.method1130(29329);
        class13.method66(28132);
        class236.method1643(1942);
        class103.method833(arg0 + 9434);
        class480.method2833((byte) -107);
        class396.method2388();
        class346.method2154();
        class394.method2382(-1);
        class341.method2131(-90);
        class360.method2213((byte) 55);
        class69.method642((byte) -128);
        class478.method2828(arg0 ^ 0x63);
        class246.method1695();
        class147.method1039();
        class364.method2238((byte) 120);
        class72.method652();
        class198.method1369(21);
        class211.method1438((byte) 60);
        class264.method1786(arg0 + 131);
        class395.method2387((byte) 91);
        class363.method2236((byte) 83);
        class297.method1923(-16433);
        class127.method955(-123);
        class239.method1672(-112);
        class296.method1920((byte) 66);
        class93.method780(1);
        class437.method2670((byte) -106);
        class392.method2373(0);
        class207.method1420((byte) -67);
        class190.method1336(false);
        class386.method2350(true);
        class126.method950(81);
        class200.method1395(arg0 ^ 0x17CC);
        class116.method908(true);
        class165.method1212(false);
        class132.method986((byte) -21);
        class202.method1400((byte) 107);
        class1.method4(-1);
        class318.method2025(arg0 ^ 0xFFFFFFE4);
        class289.method1896(-4);
        class350.method2168((byte) 71);
        class124.method945((byte) 111);
        class467.method2779(-25880);
        class387.method2352((byte) 100);
        class369.method2260(-12613);
        class213.method1446(false);
        class154.method1094(true);
        class166.method1214((byte) 98);
        class75.method666(-1);
        class139.method1015(67);
        class278.method1862(arg0 - 53);
        class130.method974(arg0 ^ 0xFFFFFFDE);
        class433.method2620((byte) -102);
        class486.method2866(arg0 ^ 0xFFFFFFE4);
        class218.method1504((byte) -49);
        class274.method1852(26718);
        class259.method1744(arg0 - 93);
        class68.method635((byte) 47);
        class221.method1520(arg0 ^ 0x75);
        class339.method2125(8818);
        class227.method1549(arg0 + 120);
        class482.method2843(arg0 + 145);
        class490.method2875(103);
        class343.method2136(3);
        class142.method1025((byte) -21);
        class284.method1881(-2);
        class136.method1007(2);
        class119.method923(0);
        class77.method682(true);
        class141.method1018((byte) 125);
        class41.method287(arg0 - 30694);
        class163.method1204(-1);
        class229.method1570();
        class358.method2209();
        class187.method1322(arg0 - 8197);
        class128.method963(16711680);
        class181.method1301(0);
        class33.method206((byte) -97);
        class293.method1913(-44);
        class270.method1826((byte) -105);
        class150.method1072(arg0 - 45);
        class377.method2306(true);
        class347.method2156((byte) -96);
        class95.method794((byte) -3);
        class434.method2624(-13364);
        class105.method838(-256);
        class265.method1792((byte) -83);
        class46.method474(false);
        class271.method1829((byte) -60);
        class176.method1270(-1);
        class232.method1630(true);
        class388.method2355((byte) -124);
        class465.method2775(-21044);
        class88.method741((byte) -45);
        class73.method657((byte) -65);
        class422.method2517(true);
        class122.method935(109);
        class205.method1409((byte) -108);
        class243.method1684((byte) 114);
        class114.method905(83);
        class391.method2370(false);
        class173.method1257(-113);
        class409.method2449(-9831);
        class402.method2419(127);
        if (class444.field6340) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 521)
    public final void method534(int arg0) {
        field857++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class35.method215((byte) 126);
        class269.field3934 = new class99(class436.field6206);
        class380.field5220 = new class412();
        if (class480.field6799 != class389.field5379) {
            class198.field2930 = new byte[50][];
        }
        class265.method1790(class436.field6206, (byte) -8);
        if (class480.field6799 == class389.field5379) {
            class419.field5818 = this.getCodeBase().getHost();
            class76.field1127 = 43594;
            class46.field709 = 443;
        } else if (class96.method800(class389.field5379, -11714)) {
            class419.field5818 = this.getCodeBase().getHost();
            class76.field1127 = class25.field268 + 40000;
            class46.field709 = class25.field268 + 50000;
        } else if (class389.field5379 == class340.field4704) {
            class46.field709 = class25.field268 + 50000;
            class76.field1127 = class25.field268 + 40000;
            class419.field5818 = "127.0.0.1";
        }
        class41.field552 = class419.field5818;
        class118.field1643 = class76.field1127;
        class442.field6290 = class46.field709;
        if (arg0 != -27541) {
            return;
        }
        class167.field2427 = class76.field1127;
        class395.field5446 = class410.field5614 = class373.field5127 = class26.field277 = new short[256];
        if (class350.field4825 == class35.field378) {
            class428.field5969 = 0;
            class301.field4258 = class468.field6600;
            class53.field785 = class130.field1778;
            class336.field4675 = class300.field4247;
            class450.field6409 = 16777215;
            class243.field3533 = true;
            class343.field4740 = class336.field4668;
        } else {
            class343.field4740 = class266.field3821;
            class53.field785 = class282.field4061;
            class336.field4675 = class73.field1051;
            class301.field4258 = class436.field6209;
        }
        class239.field3494 = class118.field1643;
        if (class65.field961 == 3) {
            class379.field5212 = class25.field268;
        }
        class162.field2363 = class183.method1304(class33.field338, 100);
        class175.field2661 = class61.method557(true, (byte) 55, class33.field338);
        class296.field4177 = class27.method182(false);
        if (class296.field4177 != null) {
            class296.field4177.method691((byte) 99, class33.field338);
        }
        class365.field5019 = class65.field961;
        try {
            if (class436.field6206.field948 != null) {
                class79.field1161 = new class178(class436.field6206.field948, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class441.field6266[var3] = new class178(class436.field6206.field949[var3], 6000, 0);
                }
                class336.field4670 = new class178(class436.field6206.field946, 6000, 0);
                class443.field6302 = new class102(255, class79.field1161, class336.field4670, 500000);
                class469.field6614 = new class178(class436.field6206.field945, 24, 0);
                class436.field6206.field949 = null;
                class436.field6206.field946 = null;
                class436.field6206.field945 = null;
                class436.field6206.field948 = null;
            }
        } catch (IOException var4) {
            class469.field6614 = null;
            class443.field6302 = null;
            class79.field1161 = null;
            class336.field4670 = null;
        }
        if (class480.field6799 != class389.field5379) {
            class76.field1129 = true;
        }
        class317.field4477 = (class6.field42 == class35.field378 ? class4.field27 : class105.field1471).method1078(class66.field967, 100);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 640)
    public static final void method535() {
        for (int var0 = 0; var0 < class237.field3467; var0++) {
            if (!class392.field5409[var0]) {
                class87 var1 = class357.field4906[var0];
                int var2 = var1.field1226;
                int var3 = var1.field1467 - class289.field4100;
                int var4 = (var3 * 2 >> class380.field5232) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field1466 - var3 >> class380.field5232;
                int var8 = var1.field1461 - var3 >> class380.field5232;
                int var9 = var1.field1461 + var3 >> class380.field5232;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class97.field1374) {
                    var9 = class97.field1374 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field1228[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class310.field4401) {
                        var15 = class310.field4401 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class325 var18 = class106.method847(var2, var16, var10, field878 == null ? (field878 = method552("wt")) : field878);
                        if (var18 != null && var18.field4527 != 0) {
                            if (var18.field4527 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field1228[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field1228[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field1228[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field1228[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class392.field5409[var0] = true;
                class340.field4692[var2].method577(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 811)
    private final void method536(int arg0) {
        if (!class21.field231) {
            for (int var2 = 0; var2 < class484.field6858; var2++) {
                if (class399.field5469[var2].method477(arg0 ^ 0x4C) == 's' || class399.field5469[var2].method477(7) == 'S') {
                    class21.field231 = true;
                    break;
                }
            }
        }
        field871++;
        if (class182.field2748 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class10.method51(-3183);
            if (class428.field5973 == 0L) {
                class428.field5973 = var5;
            }
            if (var4 > 16384 && (var5 - class428.field5973) < 5000L) {
                if ((var5 - class22.field245) > 1000L) {
                    System.gc();
                    class22.field245 = var5;
                }
                class295.field4159 = class313.field4422.method1078(class66.field967, 100);
                class20.field217 = 5;
            } else {
                class295.field4159 = class353.field4851.method1078(class66.field967, 100);
                class182.field2748 = 10;
                class20.field217 = 5;
            }
        } else if (class182.field2748 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class300.field4249[var7] = class311.method1984(class36.field388, -1, class68.field998);
            }
            class295.field4159 = class139.field1924.method1078(class66.field967, 100);
            class20.field217 = 10;
            class182.field2748 = 20;
        } else if (class182.field2748 == 20) {
            if (class314.field4442 == null) {
                class314.field4442 = new class98(class380.field5220, class269.field3934);
            }
            if (class314.field4442.method805(arg0 - 11)) {
                class379.field5215 = class237.method1655(false, 1, false, true, 0);
                class19.field207 = class237.method1655(false, 1, false, true, 1);
                class69.field1009 = class237.method1655(false, 1, false, true, 2);
                class173.field2642 = class237.method1655(false, 1, false, true, 3);
                class74.field1070 = class237.method1655(false, 1, false, true, 4);
                class280.field4026 = class237.method1655(false, 1, true, true, 5);
                class38.field473 = class237.method1655(false, 1, true, false, 6);
                class15.field131 = class237.method1655(false, 1, false, true, 7);
                class454.field6440 = class237.method1655(false, 1, false, true, 8);
                class247.field3589 = class237.method1655(false, 1, false, true, 9);
                class444.field6306 = class237.method1655(false, 1, false, true, 10);
                class233.field3399 = class237.method1655(false, 1, false, true, 11);
                class291.field4126 = class237.method1655(false, 1, false, true, 12);
                class294.field4150 = class237.method1655(false, 1, false, true, 13);
                class388.field5327 = class237.method1655(false, 1, false, false, 14);
                class130.field1776 = class237.method1655(false, 1, false, true, 15);
                class25.field264 = class237.method1655(false, 1, false, true, 16);
                class432.field6114 = class237.method1655(false, 1, false, true, 17);
                class35.field379 = class237.method1655(false, 1, false, true, 18);
                class443.field6301 = class237.method1655(false, 1, false, true, 19);
                class442.field6291 = class237.method1655(false, 1, false, true, 20);
                class202.field2992 = class237.method1655(false, 1, false, true, 21);
                class433.field6134 = class237.method1655(false, 1, false, true, 22);
                class261.field3750 = class237.method1655(false, 1, true, true, 23);
                class363.field5003 = class237.method1655(false, 1, false, true, 24);
                class67.field985 = class237.method1655(false, 1, false, true, 25);
                class450.field6404 = class237.method1655(false, 1, true, true, 26);
                class36.field391 = class237.method1655(false, 1, false, true, 27);
                class8.field53 = class237.method1655(false, 1, true, true, 28);
                class295.field4159 = class127.field1722.method1078(class66.field967, 100);
                class20.field217 = 15;
                class182.field2748 = 30;
            } else {
                class295.field4159 = class255.field3657.method1078(class66.field967, arg0 ^ 0x2F);
                class20.field217 = 12;
            }
        } else if (class182.field2748 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class13.field111[var9].method1330((byte) -84) * class136.field1901[var9] / 100;
            }
            if (var8 == 100) {
                class295.field4159 = class39.field526.method1078(class66.field967, 100);
                class20.field217 = 20;
                class261.method1758(class454.field6440, (byte) -126);
                class448.method2709(class454.field6440, 24295);
                class182.field2748 = 40;
            } else {
                if (var8 != 0) {
                    class295.field4159 = class437.field6215.method1078(class66.field967, 100) + var8 + "%";
                }
                class20.field217 = 20;
            }
        } else if (class182.field2748 != 40) {
            if (arg0 != 75) {
                field877 = -7;
            }
            if (class182.field2748 == 50) {
                class114.method904(2, class55.field817, 22050, 46);
                class342.field4719 = new class431();
                class342.field4719.method2586(arg0 + 3480, 9, 128);
                class205.field3009 = class481.method2838(true, class436.field6206, class33.field338, 22050, 0);
                class205.field3009.method1069(class342.field4719, (byte) -105);
                class117.method913(class74.field1070, 0, class342.field4719, class130.field1776, class388.field5327);
                class411.field5619 = class481.method2838(true, class436.field6206, class33.field338, 2048, 1);
                class332.field4613 = new class400();
                class411.field5619.method1069(class332.field4613, (byte) -103);
                class445.field6349 = new class74(22050, class192.field2868);
                class241.field3516 = class38.field473.method2657("scape main", (byte) 15);
                class295.field4159 = class354.field4871.method1078(class66.field967, 100);
                class182.field2748 = 60;
                class20.field217 = 30;
            } else if (class182.field2748 == 60) {
                int var10 = class103.method830(class294.field4150, class454.field6440, arg0 - 19633);
                int var11 = class367.method2248(false);
                if (var10 < var11) {
                    class295.field4159 = class153.field2124.method1078(class66.field967, 100) + var10 * 100 / var11 + "%";
                    class20.field217 = 35;
                } else {
                    class295.field4159 = class126.field1708.method1078(class66.field967, arg0 ^ 0x2F);
                    class182.field2748 = 70;
                    class20.field217 = 35;
                }
            } else if (class182.field2748 == 70) {
                int var12 = class339.method2124(8850, class454.field6440);
                int var13 = class219.method1511((byte) 70);
                if (var12 < var13) {
                    class295.field4159 = class354.field4872.method1078(class66.field967, 100) + var12 * 100 / var13 + "%";
                    class20.field217 = 40;
                } else {
                    class295.field4159 = class15.field145.method1078(class66.field967, 100);
                    class20.field217 = 40;
                    class182.field2748 = 80;
                }
            } else if (class182.field2748 == 80) {
                if (class450.field6404.method2637(18181)) {
                    class74.field1071 = new class169(class450.field6404, class247.field3589, class454.field6440);
                    class295.field4159 = class410.field5616.method1078(class66.field967, 100);
                    class182.field2748 = 90;
                    class20.field217 = 45;
                } else {
                    class295.field4159 = class98.field1390.method1078(class66.field967, 100) + class450.field6404.method2629(false) + "%";
                    class20.field217 = 45;
                }
            } else if (class182.field2748 == 90) {
                class295.field4159 = class48.field728.method1078(class66.field967, arg0 + 25);
                class182.field2748 = 95;
                class20.field217 = 50;
            } else if (class182.field2748 == 95) {
                if (class21.field231) {
                    class223.field3222 = 1;
                    class227.field3260 = 0;
                    class443.field6300 = 0;
                    class30.field309 = 0;
                    class211.field3082 = 0;
                }
                class21.field231 = true;
                class77.method681(class436.field6206, (byte) 51);
                class124.method943(105, false, class211.field3082);
                class295.field4159 = class237.field3461.method1078(class66.field967, 100);
                class20.field217 = 55;
                class182.field2748 = 100;
            } else if (class182.field2748 == 100) {
                class257.method1737(class374.field5152, class454.field6440, (byte) 117, class294.field4150);
                class295.field4159 = class393.field5424.method1078(class66.field967, 100);
                class20.field217 = 60;
                class237.method1649(5, false);
                class182.field2748 = 110;
            } else if (class182.field2748 == 110) {
                class69.field1009.method2637(18181);
                byte var14 = 0;
                int var15 = var14 + class69.field1009.method2629(false);
                class25.field264.method2637(18181);
                int var16 = var15 + class25.field264.method2629(false);
                class432.field6114.method2637(18181);
                int var17 = var16 + class432.field6114.method2629(false);
                class35.field379.method2637(18181);
                int var18 = var17 + class35.field379.method2629(false);
                class443.field6301.method2637(18181);
                int var19 = var18 + class443.field6301.method2629(false);
                class442.field6291.method2637(18181);
                int var20 = var19 + class442.field6291.method2629(false);
                class202.field2992.method2637(arg0 ^ 0x474E);
                int var21 = var20 + class202.field2992.method2629(false);
                class433.field6134.method2637(18181);
                int var22 = var21 + class433.field6134.method2629(false);
                class363.field5003.method2637(18181);
                int var23 = var22 + class363.field5003.method2629(false);
                class67.field985.method2637(18181);
                int var24 = var23 + class67.field985.method2629(false);
                class36.field391.method2637(18181);
                int var25 = var24 + class36.field391.method2629(false);
                if (var25 < 1100) {
                    class295.field4159 = class207.field3048.method1078(class66.field967, 100) + var25 / 11 + "%";
                    class20.field217 = 65;
                } else {
                    class422.field5847 = new class233(class35.field378, class66.field967, class69.field1009);
                    class382.field5247 = new class263(class35.field378, class66.field967, class69.field1009);
                    class82.field1180 = new class439(class35.field378, class66.field967, class69.field1009, class454.field6440);
                    class108.field1519 = new class185(class35.field378, class66.field967, class432.field6114);
                    class305.field4337 = new class22(class35.field378, class66.field967, class69.field1009);
                    class110.field1541 = new class300(class35.field378, class66.field967, class69.field1009);
                    class353.field4854 = new class362(class35.field378, class66.field967, class69.field1009, class15.field131);
                    class95.field1341 = new class9(class35.field378, class66.field967, class69.field1009);
                    class84.field1213 = new class408(class35.field378, class66.field967, class69.field1009);
                    class468.field6599 = new class53(class35.field378, class66.field967, true, class25.field264, class15.field131);
                    class53.field788 = new class380(class35.field378, class66.field967, class69.field1009, class454.field6440);
                    class449.field6390 = new class106(class35.field378, class66.field967, class69.field1009, class454.field6440);
                    class363.field5001 = new class314(class35.field378, class66.field967, true, class35.field379, class15.field131);
                    class373.field5128 = new class237(class35.field378, class66.field967, true, class422.field5847, class443.field6301, class15.field131);
                    class93.field1312 = new class307(class35.field378, class66.field967, class69.field1009);
                    class386.field5289 = new class276(class35.field378, class66.field967, class442.field6291, class379.field5215, class19.field207);
                    class97.field1377 = new class82(class35.field378, class66.field967, class69.field1009);
                    class39.field534 = new class219(class35.field378, class66.field967, class69.field1009);
                    class371.field5108 = new class238(class35.field378, class66.field967, class202.field2992, class15.field131);
                    class407.field5577 = new class26(class35.field378, class66.field967, class69.field1009);
                    class386.field5298 = new class96(class35.field378, class66.field967, class69.field1009);
                    class98.field1395 = new class209(class35.field378, class66.field967, class69.field1009);
                    class97.field1365 = new class382(class35.field378, class66.field967, class433.field6134);
                    class31.field332 = new class411(class35.field378, class66.field967, class69.field1009);
                    class13.method67(class173.field2642, class294.field4150, class454.field6440, class15.field131, (byte) -99);
                    class183.method1305(-103, new class414(), class67.field985, class363.field5003);
                    class88.method738(class67.field985, 116, class363.field5003);
                    class295.field4159 = class9.field67.method1078(class66.field967, arg0 ^ 0x2F);
                    class20.field217 = 65;
                    class200.method1396(true);
                    class468.field6599.method502(!class435.method2628(2), 128);
                    class416.field5691 = new class255();
                    class399.method2401(-4518);
                    class182.field2748 = 120;
                }
            } else if (class182.field2748 == 120) {
                int var26 = class31.method196(128, class454.field6440);
                int var27 = class37.method233(16);
                if (var26 < var27) {
                    class295.field4159 = class476.field6746.method1078(class66.field967, arg0 ^ 0x2F) + var26 * 100 / var27 + "%";
                    class20.field217 = 70;
                } else {
                    class112.method886(class374.field5152, -108, class454.field6440);
                    class62.method568(0, class307.field4353);
                    class295.field4159 = class292.field4136.method1078(class66.field967, 100);
                    class20.field217 = 70;
                    class182.field2748 = 130;
                }
            } else if (class182.field2748 == 130) {
                class295.field4159 = class97.field1358.method1078(class66.field967, 100);
                class182.field2748 = 140;
                class20.field217 = 75;
            } else if (class182.field2748 == 140) {
                if (class444.field6306.method2647("huffman", 110, "")) {
                    class57 var28 = new class57(class444.field6306.method2626("", (byte) 120, "huffman"));
                    class91.method761(var28, true);
                    class295.field4159 = class71.field1019.method1078(class66.field967, 100);
                    class20.field217 = 80;
                    class182.field2748 = 150;
                } else {
                    class295.field4159 = class15.field144.method1078(class66.field967, 100) + "0%";
                    class20.field217 = 80;
                }
            } else if (class182.field2748 == 150) {
                if (!class173.field2642.method2637(18181)) {
                    class295.field4159 = class205.field3000.method1078(class66.field967, arg0 ^ 0x2F) + class173.field2642.method2629(false) * 3 / 4 + "%";
                    class20.field217 = 85;
                } else if (!class291.field4126.method2637(18181)) {
                    class295.field4159 = class205.field3000.method1078(class66.field967, 100) + (class291.field4126.method2629(false) / 10 + 75) + "%";
                    class20.field217 = 85;
                } else if (!class294.field4150.method2637(18181)) {
                    class295.field4159 = class205.field3000.method1078(class66.field967, 100) + (class294.field4150.method2629(false) / 20 + 85) + "%";
                    class20.field217 = 85;
                } else if (class261.field3750.method2640("details", 0)) {
                    class330.method2072(class261.field3750, class305.field4337, class110.field1541, class468.field6599, class53.field788, class449.field6390, class416.field5691);
                    class198.method1373(class36.field391, (byte) 121);
                    class363.method2232(false, class74.field1071, class15.field131);
                    class295.field4159 = class196.field2910.method1078(class66.field967, arg0 ^ 0x2F);
                    class182.field2748 = 160;
                    class20.field217 = 85;
                } else {
                    class295.field4159 = class205.field3000.method1078(class66.field967, arg0 + 25) + (class261.field3750.method2625("details", false) / 10 + 90) + "%";
                    class20.field217 = 85;
                }
            } else if (class182.field2748 == 160) {
                int var29 = class332.method2093((byte) -68);
                if (var29 == -1) {
                    class295.field4159 = class155.field2140.method1078(class66.field967, arg0 + 25);
                    class20.field217 = 90;
                } else if (var29 == 7 || var29 == 9) {
                    this.method2699(0, "worldlistfull");
                    class237.method1649(1000, false);
                } else if (class6.field36) {
                    class295.field4159 = class69.field1014.method1078(class66.field967, 100);
                    class182.field2748 = 170;
                    class20.field217 = 90;
                } else {
                    this.method2699(0, "worldlistio_" + var29);
                    class237.method1649(1000, false);
                }
            } else if (class182.field2748 == 170) {
                class401.field5505 = new String[class386.field5298.field1352];
                class339.field4689 = new int[class98.field1395.field3064];
                class394.field5443 = new boolean[class98.field1395.field3064];
                for (int var30 = 0; var30 < class98.field1395.field3064; var30++) {
                    if (class98.field1395.method1425(19, var30).field4746 == 0) {
                        class394.field5443[var30] = true;
                        class25.field265++;
                    }
                    class339.field4689[var30] = -1;
                }
                class7.method38((byte) -73);
                class291.field4123 = class173.field2642.method2657("loginscreen", (byte) 15);
                class280.field4026.method2632(arg0 ^ 0x52, false, true);
                class38.field473.method2632(119, true, true);
                class454.field6440.method2632(-119, true, true);
                class294.field4150.method2632(-105, true, true);
                class444.field6306.method2632(-106, true, true);
                class173.field2642.method2632(24, true, true);
                class227.field3271 = true;
                class69.field1009.field6151 = 2;
                class432.field6114.field6151 = 2;
                class25.field264.field6151 = 2;
                class35.field379.field6151 = 2;
                class443.field6301.field6151 = 2;
                class442.field6291.field6151 = 2;
                class202.field2992.field6151 = 2;
                class241.method1677(class223.field3222, -1, -1, false, true);
                class295.field4159 = class192.field2866.method1078(class66.field967, 100);
                class182.field2748 = 180;
                class20.field217 = 95;
            } else if (class182.field2748 == 180) {
                class162.method1201((byte) 21, true);
            }
        } else if (class8.field53.method2637(18181)) {
            this.method529((byte) -112, class8.field53.method2650((byte) -72, 1));
            class295.field4159 = class74.field1069.method1078(class66.field967, 100);
            class20.field217 = 25;
            class182.field2748 = 50;
        } else {
            class295.field4159 = field858.method1078(class66.field967, 100) + class8.field53.method2629(false) + "%";
            class20.field217 = 25;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1349)
    private final void method537(int arg0) {
        field860++;
        if (class380.field5220.field5663 > class124.field1677) {
            class82.field1173 = (class380.field5220.field5663 - 1) * 250;
            if (class239.field3494 == class167.field2427) {
                class239.field3494 = class442.field6290;
            } else {
                class239.field3494 = class167.field2427;
            }
            if (class82.field1173 > 3000) {
                class82.field1173 = 3000;
            }
            if (class380.field5220.field5663 >= 2 && class380.field5220.field5662 == 6) {
                this.method2699(0, "js5connect_outofdate");
                class347.field4787 = 1000;
                return;
            }
            if (class380.field5220.field5663 >= 4 && class380.field5220.field5662 == -1) {
                this.method2699(0, "js5crc");
                class347.field4787 = 1000;
                return;
            }
            if (class380.field5220.field5663 >= 4 && (class347.field4787 == 0 || class347.field4787 == 5)) {
                if (class380.field5220.field5662 == 7 || class380.field5220.field5662 == 9) {
                    this.method2699(0, "js5connect_full");
                } else if (class380.field5220.field5662 > 0) {
                    this.method2699(arg0 ^ 0x2, "js5connect");
                } else {
                    this.method2699(arg0 ^ 0x2, "js5io");
                }
                class347.field4787 = 1000;
                return;
            }
        }
        class124.field1677 = class380.field5220.field5663;
        if (class82.field1173 > 0) {
            class82.field1173--;
            return;
        }
        try {
            if (class416.field5724 == 0) {
                class294.field4147 = class436.field6206.method595(class239.field3494, (byte) 87, class41.field552);
                class416.field5724++;
            }
            if (class416.field5724 == 1) {
                if (class294.field4147.field3979 == 2) {
                    this.method550(110, 1000);
                    return;
                }
                if (class294.field4147.field3979 == 1) {
                    class416.field5724++;
                }
            }
            if (class416.field5724 == arg0) {
                class177.field2681 = new class332((Socket) class294.field4147.field3984, class436.field6206);
                class161 var2 = new class161(5);
                var2.method1180((byte) -110, class433.field6124.field60);
                var2.method1177(573, -54);
                class177.field2681.method2090(0, var2.field2262, (byte) -45, 5);
                class416.field5724++;
                class117.field1625 = class10.method51(-3183);
            }
            if (class416.field5724 == 3) {
                if (class347.field4787 == 0 || class347.field4787 == 5 || class177.field2681.method2089(false) > 0) {
                    int var3 = class177.field2681.method2088(2);
                    if (var3 != 0) {
                        this.method550(arg0 ^ 0xFFFFFFAB, var3);
                        return;
                    }
                    class416.field5724++;
                } else if (class10.method51(-3183) - class117.field1625 > 30000L) {
                    this.method550(105, 1001);
                    return;
                }
            }
            if (class416.field5724 == 4) {
                boolean var4 = class347.field4787 == 5 || class347.field4787 == 10 || class347.field4787 == 28;
                class380.field5220.method2476(class177.field2681, !var4, 108);
                class177.field2681 = null;
                class294.field4147 = null;
                class416.field5724 = 0;
            }
        } catch (IOException var5) {
            this.method550(-114, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1494)
    public static void method538(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field874 = null;
        field856 = null;
        field858 = null;
        field875 = null;
        field873 = null;
        field876 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1510)
    private final void method539(byte arg0) {
        field865++;
        if (arg0 < 4) {
            field875 = null;
        }
        boolean var2 = class380.field5220.method2475(true);
        if (!var2) {
            this.method537(2);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1527)
    public final void method540(int arg0) {
        field862++;
        if (class199.field2947) {
            class367.method2244(4);
        }
        if (class374.field5152 != null) {
            class374.field5152.method755(52);
        }
        if (class273.field3967 != null) {
            class480.method2834(class273.field3967, class436.field6206, 0);
            class273.field3967 = null;
        }
        if (class394.field5440 != null) {
            class394.field5440.method2095(false);
            class394.field5440 = null;
        }
        if (class296.field4177 != null) {
            class296.field4177.method690((byte) -9, class33.field338);
        }
        class296.field4177 = null;
        if (class205.field3009 != null) {
            class205.field3009.method1058(4);
        }
        if (class411.field5619 != null) {
            class411.field5619.method1058(4);
        }
        class380.field5220.method2466(arg0 ^ arg0);
        class269.field3934.method820(true);
        if (class304.field4317 != null) {
            class304.field4317.method1876(1);
            class304.field4317 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1574)
    public static final void main(String[] arg0) {
        field867++;
        try {
            if (arg0.length != 4) {
                class177.method1273("argument count", -1);
            }
            class25.field268 = Integer.parseInt(arg0[0]);
            class389.field5379 = class340.field4704;
            if (arg0[1].equals("live")) {
                class392.field5410 = class397.field5453;
            } else if (arg0[1].equals("rc")) {
                class392.field5410 = class116.field1616;
            } else if (arg0[1].equals("wip")) {
                class392.field5410 = class175.field2665;
            } else {
                class177.method1273("modewhat", -1);
            }
            class66.field967 = class363.method2234((byte) -123, arg0[2]);
            if (class66.field967 == -1) {
                if (arg0[2].equals("english")) {
                    class66.field967 = 0;
                } else if (arg0[2].equals("german")) {
                    class66.field967 = 1;
                } else {
                    class177.method1273("language", -1);
                }
            }
            class259.field3692 = false;
            class352.field4847 = false;
            if (arg0[3].equals("game0")) {
                class35.field378 = class6.field42;
            } else if (arg0[3].equals("game1")) {
                class35.field378 = class350.field4825;
            } else {
                class177.method1273("game", -1);
            }
            class105.field1474 = class35.field378.field4016;
            class237.field3468 = 0;
            class281.field4039 = true;
            class339.field4690 = true;
            class96.field1351 = 0;
            class114.field1604 = "";
            client var1 = new client();
            class204.field2997 = var1;
            var1.method2697(1024, class35.field378.field4022, 768, 0, 573, false, 29, class392.field5410.method1916(true) + 32);
            class467.field6587.setLocation(40, 40);
        } catch (Exception var3) {
            class83.method704((byte) 123, var3, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1640)
    public final void method541(int arg0) {
        field864++;
        if (class347.field4787 == 1000) {
            return;
        }
        long var2 = class174.method1262((byte) -86) / 1000000L - class190.field2856;
        class190.field2856 = class174.method1262((byte) -84) / 1000000L;
        boolean var4 = class131.method980(-30);
        if (var4 && class468.field6598 && class205.field3009 != null) {
            class205.field3009.method1056(false);
        }
        int var5 = 121 % ((arg0 - 2) / 48);
        if (class347.field4787 == 30 || class347.field4787 == 10) {
            if (class22.field251 != 0L && class10.method51(-3183) > class22.field251) {
                class241.method1677(class448.method2708(0), class185.field2787, class30.field312, false, true);
            } else if (class374.field5152.method419() && class124.field1680) {
                class94.method785((byte) -5);
            }
        }
        if (class273.field3967 == null) {
            Container var6;
            if (class467.field6587 == null) {
                var6 = class436.field6206.field960;
            } else {
                var6 = class467.field6587;
            }
            int var7 = var6.getSize().width;
            int var8 = var6.getSize().height;
            if (class467.field6587 == var6) {
                Insets var9 = class467.field6587.getInsets();
                var7 -= var9.right + var9.left;
                var8 -= var9.top + var9.bottom;
            }
            if (class59.field847 != var7 || class297.field4191 != var8) {
                if (class374.field5152 == null || class374.field5152.method340()) {
                    class35.method215((byte) 125);
                } else {
                    class297.field4191 = var8;
                    class59.field847 = var7;
                }
                class22.field251 = class10.method51(-3183) + 500L;
            }
        }
        if (class273.field3967 != null && !class190.field2853 && (class347.field4787 == 30 || class347.field4787 == 10)) {
            class241.method1677(class223.field3222, -1, -1, false, true);
        }
        boolean var10 = false;
        if (class464.field6540) {
            var10 = true;
            class464.field6540 = false;
        }
        if (var10) {
            class476.method2822(true);
        }
        if (class374.field5152 != null && class374.field5152.method390() || class448.method2708(0) != 1) {
            class125.method947(-58);
        }
        if (class347.field4787 == 0) {
            class393.method2378(class99.field1408[class105.field1474], var10, class116.field1617[class105.field1474], class167.field2421[class105.field1474], class295.field4159, class20.field217, -7785);
        } else if (class347.field4787 == 5) {
            class473.method2804(class374.field5152, class167.field2421[class105.field1474].getRGB(), class116.field1617[class105.field1474].getRGB(), class374.field5152.method390() | var10, class99.field1408[class105.field1474].getRGB(), class408.field5584, 13);
        } else if (class347.field4787 == 10) {
            class117.method915(2);
        } else if (class347.field4787 == 25 || class347.field4787 == 28) {
            if (class134.field1874 == 1) {
                if (class34.field357 > class268.field3924) {
                    class268.field3924 = class34.field357;
                }
                int var12 = (class268.field3924 - class34.field357) * 50 / class268.field3924;
                class315.method2004((byte) 116, class189.field2830, true, class225.field3247.method1078(class66.field967, 100) + "<br>(" + var12 + "%)");
            } else if (class134.field1874 == 2) {
                if (class190.field2860 < class448.field6381) {
                    class190.field2860 = class448.field6381;
                }
                int var11 = (class190.field2860 - class448.field6381) * 50 / class190.field2860 + 50;
                class315.method2004((byte) 99, class189.field2830, true, class225.field3247.method1078(class66.field967, 100) + "<br>(" + var11 + "%)");
            } else {
                class315.method2004((byte) 78, class189.field2830, true, class225.field3247.method1078(class66.field967, 100));
            }
        } else if (class347.field4787 == 30) {
            class74.method663(var2, (byte) 110);
        } else if (class347.field4787 == 40) {
            class315.method2004((byte) 88, class189.field2830, true, class69.field1006.method1078(class66.field967, 100) + "<br>" + class6.field40.method1078(class66.field967, 100));
        }
        if (class419.field5821 == 3) {
            for (int var13 = 0; var13 < class173.field2636; var13++) {
                Rectangle var14 = class341.field4711[var13];
                if (class432.field6115[var13]) {
                    class374.field5152.method742(11, var14.y, var14.height, var14.width, -1996553985, var14.x);
                } else if (class184.field2783[var13]) {
                    class374.field5152.method742(11, var14.y, var14.height, var14.width, -1996554240, var14.x);
                }
            }
        }
        if (class490.method2874(95)) {
            class108.method855(class374.field5152, (byte) -44);
        }
        if ((class347.field4787 == 30 || class347.field4787 == 10) && class419.field5821 == 0 && class448.method2708(0) == 1 && !var10 && class65.field954.equals("1.1")) {
            int var15 = 0;
            for (int var16 = 0; var16 < class173.field2636; var16++) {
                if (class184.field2783[var16]) {
                    class184.field2783[var16] = false;
                    class466.field6574[var15++] = class341.field4711[var16];
                }
            }
            class374.field5152.method393(class466.field6574, var15);
        } else if (class347.field4787 != 0) {
            class374.field5152.method343();
            for (int var17 = 0; var17 < class173.field2636; var17++) {
                class184.field2783[var17] = false;
            }
        }
        if (class69.field1010 == 0) {
            class89.method752(0, 15L);
        } else if (class69.field1010 == 1) {
            class89.method752(0, 10L);
        } else if (class69.field1010 == 2) {
            class89.method752(0, 5L);
        } else if (class69.field1010 == 3) {
            class89.method752(0, 2L);
        }
        if (class227.field3271) {
            class41.method288(255);
        }
        if (class21.field231 && class347.field4787 == 10 && class238.field3475 != -1) {
            class21.field231 = false;
            class77.method681(class436.field6206, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 1877)
    public static final void method542() {
        int var0 = class143.field1996;
        int[] var1 = class464.field6536;
        int var2 = class153.field2122 ? var0 : class24.field257 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class418 var4;
            if (var3 < var0) {
                var4 = class112.field1570[var1[var3]];
            } else {
                var4 = class163.field2377[class193.field2873[var3 - var0]];
            }
            if (var4.field5784 >= 0) {
                int var5 = var4.method245(4452);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4537 & 0x7F) == 0 && (var4.field4530 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field4537 & 0x7F) == 64 && (var4.field4530 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class39 && var4.field5813 != null && class364.field5010 >= var4.field5813.field6194 && class364.field5010 < var4.field5813.field6196) {
                    ((class39) var4).field509 = false;
                }
                var4.field4532 = class407.method2440(var4.field4537, -16490, var4.field4530, var4.field4531);
                class363.method2230(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1927)
    public final void method543(int arg0) {
        field863++;
        if (class347.field4787 == 1000) {
            return;
        }
        class364.field5010++;
        if (class364.field5010 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class2.field17 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class184.field2781.setSeed((long) class2.field17);
        }
        if ((class364.field5010 % 50) == 0) {
            class119.field1655 = class176.field2666;
            class176.field2666 = 0;
            class308.field4374 = class218.field3163;
            class218.field3163 = 0;
        }
        this.method539((byte) 85);
        if (class314.field4442 != null) {
            class314.field4442.method809(false);
        }
        class270.method1825(-27471);
        class208.method1423((byte) -33);
        class162.field2363.method1821(-1);
        class175.field2661.method1616(9001);
        if (class296.field4177 != null) {
            int var3 = class296.field4177.method693((byte) -90);
            class255.field3668 = var3;
        }
        if (class374.field5152 != null) {
            class374.field5152.method295((int) class10.method51(-3183));
        }
        class173.method1258(57);
        class484.field6858 = 0;
        if (arg0 != 250) {
            this.method549((byte) 109);
        }
        for (class46 var4 = class162.field2363.method1819(29626); var4 != null && class484.field6858 < 128; var4 = class162.field2363.method1819(arg0 ^ 0x7340)) {
            if (var4.method472((byte) 73) != 1) {
                char var5 = var4.method477(7);
                if (!class149.method1062(9104) || var5 != '`' && var5 != '§') {
                    class399.field5469[class484.field6858] = var4;
                    class484.field6858++;
                } else if (class490.method2874(arg0 - 136)) {
                    class156.method1110((byte) -80);
                } else {
                    class172.method1247(0);
                }
            }
        }
        class69.field1012 = null;
        for (class271 var6 = class175.field2661.method1622(true); var6 != null; var6 = class175.field2661.method1622(true)) {
            int var7 = var6.method937(arg0 - 245);
            if (var7 == -1) {
                class238.field3485.method766(var6, -1);
            } else if (class409.method2447(var7, (byte) 96)) {
                class69.field1012 = var6;
            }
        }
        if (class490.method2874(120)) {
            class21.method155(-29705);
        }
        if (class347.field4787 == 0) {
            this.method536(75);
            class442.method2687((byte) 117);
        } else if (class347.field4787 == 5) {
            this.method536(75);
            class442.method2687((byte) 52);
        } else if (class347.field4787 == 25 || class347.field4787 == 28) {
            class472.method2800((byte) -42);
        }
        if (class347.field4787 == 10) {
            this.method549((byte) 83);
            class196.method1363(4);
            class34.method207(0);
            class166.method1213(-2001);
        } else if (class347.field4787 == 30) {
            class478.method2831((byte) -104);
        } else if (class347.field4787 == 40) {
            class166.method1213(-2001);
            if (class27.field280 != -3 && class27.field280 != 2 && class27.field280 != 15) {
                class370.method2263(3);
            }
        }
        class255.method1731((byte) -1, class374.field5152);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2073)
    public static final void method544(int arg0) {
        int var1 = class143.field1996;
        int[] var2 = class464.field6536;
        for (int var3 = 0; var3 < class24.field257 + var1; var3++) {
            class418 var4;
            if (var3 < var1) {
                var4 = class112.field1570[var2[var3]];
            } else {
                var4 = class163.field2377[class193.field2873[var3 - var1]];
            }
            if (var4.field4531 == arg0 && var4.field5784 >= 0) {
                int var5 = var4.method245(4452);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4537 & 0x7F) != 0 || (var4.field4530 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field4537 & 0x7F) != 64 || (var4.field4530 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field4537 >> 7;
                    int var7 = var4.field4530 >> 7;
                    if (var4.field5784 > class154.field2133[var6][var7]) {
                        class154.field2133[var6][var7] = var4.field5784;
                        class314.field4435[var6][var7] = 1;
                    } else if (class154.field2133[var6][var7] == var4.field5784) {
                        var10002 = class314.field4435[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field4537 - var8 >> 7;
                    int var10 = var4.field4530 - var8 >> 7;
                    int var11 = var4.field4537 + var8 >> 7;
                    int var12 = var4.field4530 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field5784 > class154.field2133[var13][var14]) {
                                class154.field2133[var13][var14] = var4.field5784;
                                class314.field4435[var13][var14] = 1;
                            } else if (class154.field2133[var13][var14] == var4.field5784) {
                                var10002 = class314.field4435[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lae;IIIIIIIII)V", line = 2173)
    public static final void method545(class172[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class172 var11 = arg0[var10];
            if (var11 != null && var11.field2532 == arg1) {
                int var12 = var11.field2502 + arg6;
                int var13 = var11.field2466 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2602 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2554 + var12;
                    int var19 = var11.field2579 + var13;
                    if (var11.field2602 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2602 == 0 || var11.field2490 || method547(var11).field1544 != 0 || class86.field1215 == var11 || class466.field6576 == var11.field2624) {
                    if (!method551(var11)) {
                        if (class464.field6538 == var11) {
                            class487.field6893 = true;
                            class30.field307 = var12;
                            class332.field4628 = var13;
                        }
                        if (var11.field2560 || var14 < var16 && var15 < var17) {
                            if (var11.field2602 == 0 && var11.field2604 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class472 var20 = (class472) class262.field3780.method775(1); var20 != null; var20 = (class472) class262.field3780.method763(0)) {
                                    if (var20.field6653) {
                                        var20.method2714(109);
                                        var20.field6642.field2469 = false;
                                    }
                                }
                                if (class139.field1927 == 0) {
                                    class464.field6538 = null;
                                    class86.field1215 = null;
                                }
                                class169.field2446 = 0;
                                class382.field5244 = false;
                                class454.field6430 = false;
                                if (!class205.field3005) {
                                    class445.method2702(23770);
                                }
                            }
                            boolean var21;
                            if (class175.field2661.method1625((byte) -128) >= var14 && class175.field2661.method1617(false) >= var15 && class175.field2661.method1625((byte) -128) < var16 && class175.field2661.method1617(false) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class205.field3005 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class108.method857(arg8 - var12, arg9 - var13, var11, (byte) -127);
                            }
                            boolean var22 = false;
                            if (class175.field2661.method1618(true) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class69.field1012 != null && class69.field1012.method937(5) == 0 && class69.field1012.method936(0) >= var14 && class69.field1012.method938(1) >= var15 && class69.field1012.method936(0) < var16 && class69.field1012.method938(1) < var17) {
                                var23 = true;
                            }
                            if (var11.field2593 != null) {
                                for (int var24 = 0; var24 < var11.field2593.length; var24++) {
                                    if (class162.field2363.method1820((byte) -96, var11.field2593[var24])) {
                                        if (var11.field2503 == null || class364.field5010 >= var11.field2503[var24]) {
                                            byte var25 = var11.field2618[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class162.field2363.method1820((byte) -96, 86) && !class162.field2363.method1820((byte) -96, 82) && !class162.field2363.method1820((byte) -96, 81)) && ((var25 & 0x2) == 0 || class162.field2363.method1820((byte) -96, 86)) && ((var25 & 0x1) == 0 || class162.field2363.method1820((byte) -96, 82)) && ((var25 & 0x4) == 0 || class162.field2363.method1820((byte) -96, 81))) {
                                                class198.method1370(var11.field2543, "", var24 + 1, -31859, -1);
                                                int var26 = var11.field2625[var24];
                                                if (var11.field2503 == null) {
                                                    var11.field2503 = new int[var11.field2593.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field2503[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2503[var24] = class364.field5010 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field2503 != null) {
                                        var11.field2503[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class13.method79(0, var11, class69.field1012.method938(1) - var13, class69.field1012.method936(0) - var12);
                            }
                            if (class464.field6538 != null && class464.field6538 != var11 && var21 && method547(var11).method875(-1200)) {
                                class119.field1648 = var11;
                            }
                            if (class86.field1215 == var11) {
                                class442.field6293 = true;
                                class340.field4703 = var12;
                                class315.field4454 = var13;
                            }
                            if (var11.field2490 || var11.field2624 != 0) {
                                if (var21 && class255.field3668 != 0 && var11.field2464 != null) {
                                    class472 var27 = new class472();
                                    var27.field6653 = true;
                                    var27.field6642 = var11;
                                    var27.field6650 = class255.field3668;
                                    var27.field6649 = var11.field2464;
                                    class262.field3780.method766(var27, -1);
                                }
                                if (class464.field6538 != null || class205.field3005 || class129.field1761 != var11.field2624 && class169.field2446 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2624 != 0) {
                                    if (class136.field1892 == var11.field2624 || class430.field5981 == var11.field2624) {
                                        class486.field6890 = var11;
                                        if (class323.field4519 != null) {
                                            class323.field4519.method2688(class374.field5152, var11.field2579, (byte) -117);
                                        }
                                        if (class136.field1892 == var11.field2624) {
                                            if (!class205.field3005 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class1.method8(false, arg9, class374.field5152, arg8);
                                                for (class27 var28 = (class27) class255.field3658.method1763((byte) -48); var28 != null; var28 = (class27) class255.field3658.method1767(true)) {
                                                    if (arg8 >= var28.field283 && arg8 < var28.field290 && arg9 >= var28.field285 && arg9 < var28.field286) {
                                                        class445.method2702(23770);
                                                        class297.method1921(var28.field289, 21945);
                                                    }
                                                }
                                            }
                                            class230.method1623((byte) 110, var12, var11, var13);
                                            continue;
                                        }
                                    }
                                    if (class466.field6576 == var11.field2624) {
                                        if (var11.method1253(-14775, class374.field5152) == null || class38.field477 != 0 && class38.field477 != 3 || class205.field3005 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field2575[var30];
                                        if (var29 < var31 || var29 > var11.field2485[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field2554 / 2;
                                        int var33 = var30 - var11.field2579 / 2;
                                        int var34;
                                        if (class390.field5393 == 4) {
                                            var34 = (int) class91.field1281 & 0x3FFF;
                                        } else {
                                            var34 = (int) class91.field1281 + class462.field6529 & 0x3FFF;
                                        }
                                        int var35 = class319.field4501[var34];
                                        int var36 = class319.field4504[var34];
                                        if (class390.field5393 != 4) {
                                            var35 = (class20.field216 + 256) * var35 >> 8;
                                            var36 = (class20.field216 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class390.field5393 == 4) {
                                            var39 = (class318.field4496 >> 7) + (var37 >> 2);
                                            var40 = (class285.field4075 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class262.field3781.method245(4452) - 1) * 64;
                                            var39 = (class262.field3781.field4537 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class262.field3781.field4530 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class450.field6405 && (class182.field2751 & 0x40) != 0) {
                                            class172 var42 = class77.method678(class4.field29, -36, class124.field1679);
                                            if (var42 == null) {
                                                class2.method9(149799361);
                                            } else {
                                                class19.method140(false, (byte) 108, " ->", true, class347.field4784, var39, 1L, 21, var40, var11.field2483, class95.field1336);
                                            }
                                            continue;
                                        }
                                        if (class350.field4825 == class35.field378) {
                                            class19.method140(false, (byte) -128, "", true, class161.field2331.method1078(class66.field967, 100), var39, 1L, 51, var40, -1, -1);
                                        }
                                        class19.method140(false, (byte) -70, "", true, class309.field4390, var39, 1L, 60, var40, -1, -1);
                                        continue;
                                    }
                                    if (class129.field1761 == var11.field2624) {
                                        class125.field1697 = var11;
                                        if (var21) {
                                            class382.field5244 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class69.field1012.method936(0) - var12 - var11.field2554 / 2) * 2.0D / (double) class330.field4577);
                                            int var44 = (int) (-((double) (class69.field1012.method938(1) - var13 - var11.field2579 / 2) * 2.0D / (double) class330.field4577));
                                            int var45 = class309.field4388 + var43 + class330.field4596;
                                            int var46 = class25.field267 + var44 + class330.field4602;
                                            class67 var47 = class218.method1500(-28935);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method626(67, var48, var46, var45);
                                            if (var48 != null) {
                                                if (class162.field2363.method1820((byte) -96, 82) && class255.field3661 > 0) {
                                                    class449.method2716(var48[1], var48[0], var48[2], (byte) -57);
                                                    continue;
                                                }
                                                class454.field6430 = true;
                                                class127.field1736 = var48[0];
                                                class129.field1773 = var48[1];
                                                class59.field848 = var48[2];
                                            }
                                            class169.field2446 = 1;
                                            class241.field3520 = false;
                                            class423.field5856 = class175.field2661.method1625((byte) -128);
                                            class135.field1876 = class175.field2661.method1617(false);
                                            continue;
                                        }
                                        if (var22 && class169.field2446 > 0) {
                                            if (class169.field2446 == 1 && (class423.field5856 != class175.field2661.method1625((byte) -128) || class135.field1876 != class175.field2661.method1617(false))) {
                                                class468.field6596 = class309.field4388;
                                                class93.field1309 = class25.field267;
                                                class169.field2446 = 2;
                                            }
                                            if (class169.field2446 == 2) {
                                                class241.field3520 = true;
                                                class98.method811(104, class468.field6596 + (int) ((double) (class423.field5856 - class175.field2661.method1625((byte) -128)) * 2.0D / (double) class330.field4574));
                                                class405.method2431(true, class93.field1309 - (int) ((double) (class135.field1876 - class175.field2661.method1617(false)) * 2.0D / (double) class330.field4574));
                                            }
                                            continue;
                                        }
                                        if (class169.field2446 > 0 && !class241.field3520) {
                                            if ((class398.field5463 == 1 || class206.method1414((byte) 102)) && class303.field4310 > 2) {
                                                class67.method625((byte) -115, class135.field1876, class423.field5856);
                                            } else if (class391.method2371((byte) -100)) {
                                                class67.method625((byte) -112, class135.field1876, class423.field5856);
                                            }
                                        }
                                        class169.field2446 = 0;
                                        continue;
                                    }
                                    if (class344.field4750 == var11.field2624) {
                                        if (var22) {
                                            class379.method2311(class175.field2661.method1625((byte) -128) - var12, var11.field2579, class175.field2661.method1617(false) - var13, var11.field2554, -28154);
                                        }
                                        continue;
                                    }
                                    if (class284.field4073 == var11.field2624) {
                                        class427.method2555(var11, var12, -112, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field2582 && var23) {
                                    var11.field2582 = true;
                                    if (var11.field2522 != null) {
                                        class472 var49 = new class472();
                                        var49.field6653 = true;
                                        var49.field6642 = var11;
                                        var49.field6652 = class69.field1012.method936(0) - var12;
                                        var49.field6650 = class69.field1012.method938(1) - var13;
                                        var49.field6649 = var11.field2522;
                                        class262.field3780.method766(var49, -1);
                                    }
                                }
                                if (var11.field2582 && var22 && var11.field2609 != null) {
                                    class472 var50 = new class472();
                                    var50.field6653 = true;
                                    var50.field6642 = var11;
                                    var50.field6652 = class175.field2661.method1625((byte) -128) - var12;
                                    var50.field6650 = class175.field2661.method1617(false) - var13;
                                    var50.field6649 = var11.field2609;
                                    class262.field3780.method766(var50, -1);
                                }
                                if (var11.field2582 && !var22) {
                                    var11.field2582 = false;
                                    if (var11.field2607 != null) {
                                        class472 var51 = new class472();
                                        var51.field6653 = true;
                                        var51.field6642 = var11;
                                        var51.field6652 = class175.field2661.method1625((byte) -128) - var12;
                                        var51.field6650 = class175.field2661.method1617(false) - var13;
                                        var51.field6649 = var11.field2607;
                                        class484.field6857.method766(var51, -1);
                                    }
                                }
                                if (var22 && var11.field2603 != null) {
                                    class472 var52 = new class472();
                                    var52.field6653 = true;
                                    var52.field6642 = var11;
                                    var52.field6652 = class175.field2661.method1625((byte) -128) - var12;
                                    var52.field6650 = class175.field2661.method1617(false) - var13;
                                    var52.field6649 = var11.field2603;
                                    class262.field3780.method766(var52, -1);
                                }
                                if (!var11.field2469 && var21) {
                                    var11.field2469 = true;
                                    if (var11.field2619 != null) {
                                        class472 var53 = new class472();
                                        var53.field6653 = true;
                                        var53.field6642 = var11;
                                        var53.field6652 = class175.field2661.method1625((byte) -128) - var12;
                                        var53.field6650 = class175.field2661.method1617(false) - var13;
                                        var53.field6649 = var11.field2619;
                                        class262.field3780.method766(var53, -1);
                                    }
                                }
                                if (var11.field2469 && var21 && var11.field2487 != null) {
                                    class472 var54 = new class472();
                                    var54.field6653 = true;
                                    var54.field6642 = var11;
                                    var54.field6652 = class175.field2661.method1625((byte) -128) - var12;
                                    var54.field6650 = class175.field2661.method1617(false) - var13;
                                    var54.field6649 = var11.field2487;
                                    class262.field3780.method766(var54, -1);
                                }
                                if (var11.field2469 && !var21) {
                                    var11.field2469 = false;
                                    if (var11.field2564 != null) {
                                        class472 var55 = new class472();
                                        var55.field6653 = true;
                                        var55.field6642 = var11;
                                        var55.field6652 = class175.field2661.method1625((byte) -128) - var12;
                                        var55.field6650 = class175.field2661.method1617(false) - var13;
                                        var55.field6649 = var11.field2564;
                                        class484.field6857.method766(var55, -1);
                                    }
                                }
                                if (var11.field2472 != null) {
                                    class472 var56 = new class472();
                                    var56.field6642 = var11;
                                    var56.field6649 = var11.field2472;
                                    class450.field6398.method766(var56, -1);
                                }
                                if (var11.field2507 != null && class187.field2801 > var11.field2577) {
                                    if (var11.field2613 == null || class187.field2801 - var11.field2577 > 32) {
                                        class472 var61 = new class472();
                                        var61.field6642 = var11;
                                        var61.field6649 = var11.field2507;
                                        class262.field3780.method766(var61, -1);
                                    } else {
                                        label672: for (int var57 = var11.field2577; var57 < class187.field2801; var57++) {
                                            int var58 = class30.field313[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field2613.length; var59++) {
                                                if (var11.field2613[var59] == var58) {
                                                    class472 var60 = new class472();
                                                    var60.field6642 = var11;
                                                    var60.field6649 = var11.field2507;
                                                    class262.field3780.method766(var60, -1);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2577 = class187.field2801;
                                }
                                if (var11.field2620 != null && class280.field4020 > var11.field2571) {
                                    if (var11.field2553 == null || class280.field4020 - var11.field2571 > 32) {
                                        class472 var66 = new class472();
                                        var66.field6642 = var11;
                                        var66.field6649 = var11.field2620;
                                        class262.field3780.method766(var66, -1);
                                    } else {
                                        label648: for (int var62 = var11.field2571; var62 < class280.field4020; var62++) {
                                            int var63 = class462.field6527[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field2553.length; var64++) {
                                                if (var11.field2553[var64] == var63) {
                                                    class472 var65 = new class472();
                                                    var65.field6642 = var11;
                                                    var65.field6649 = var11.field2620;
                                                    class262.field3780.method766(var65, -1);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2571 = class280.field4020;
                                }
                                if (var11.field2538 != null && class62.field911 > var11.field2550) {
                                    if (var11.field2510 == null || class62.field911 - var11.field2550 > 32) {
                                        class472 var71 = new class472();
                                        var71.field6642 = var11;
                                        var71.field6649 = var11.field2538;
                                        class262.field3780.method766(var71, -1);
                                    } else {
                                        label624: for (int var67 = var11.field2550; var67 < class62.field911; var67++) {
                                            int var68 = class325.field4542[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field2510.length; var69++) {
                                                if (var11.field2510[var69] == var68) {
                                                    class472 var70 = new class472();
                                                    var70.field6642 = var11;
                                                    var70.field6649 = var11.field2538;
                                                    class262.field3780.method766(var70, -1);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2550 = class62.field911;
                                }
                                if (var11.field2468 != null && class362.field4988 > var11.field2470) {
                                    if (var11.field2569 == null || class362.field4988 - var11.field2470 > 32) {
                                        class472 var76 = new class472();
                                        var76.field6642 = var11;
                                        var76.field6649 = var11.field2468;
                                        class262.field3780.method766(var76, -1);
                                    } else {
                                        label600: for (int var72 = var11.field2470; var72 < class362.field4988; var72++) {
                                            int var73 = class483.field6824[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field2569.length; var74++) {
                                                if (var11.field2569[var74] == var73) {
                                                    class472 var75 = new class472();
                                                    var75.field6642 = var11;
                                                    var75.field6649 = var11.field2468;
                                                    class262.field3780.method766(var75, -1);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2470 = class362.field4988;
                                }
                                if (var11.field2565 != null && class279.field4013 > var11.field2496) {
                                    if (var11.field2514 == null || class279.field4013 - var11.field2496 > 32) {
                                        class472 var81 = new class472();
                                        var81.field6642 = var11;
                                        var81.field6649 = var11.field2565;
                                        class262.field3780.method766(var81, -1);
                                    } else {
                                        label576: for (int var77 = var11.field2496; var77 < class279.field4013; var77++) {
                                            int var78 = class178.field2686[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field2514.length; var79++) {
                                                if (var11.field2514[var79] == var78) {
                                                    class472 var80 = new class472();
                                                    var80.field6642 = var11;
                                                    var80.field6649 = var11.field2565;
                                                    class262.field3780.method766(var80, -1);
                                                    break label576;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2496 = class279.field4013;
                                }
                                if (class364.field5011 > var11.field2537 && var11.field2598 != null) {
                                    class472 var82 = new class472();
                                    var82.field6642 = var11;
                                    var82.field6649 = var11.field2598;
                                    class262.field3780.method766(var82, -1);
                                }
                                if (class33.field341 > var11.field2537 && var11.field2573 != null) {
                                    class472 var83 = new class472();
                                    var83.field6642 = var11;
                                    var83.field6649 = var11.field2573;
                                    class262.field3780.method766(var83, -1);
                                }
                                if (class314.field4436 > var11.field2537 && var11.field2547 != null) {
                                    class472 var84 = new class472();
                                    var84.field6642 = var11;
                                    var84.field6649 = var11.field2547;
                                    class262.field3780.method766(var84, -1);
                                }
                                if (class367.field5043 > var11.field2537 && var11.field2494 != null) {
                                    class472 var85 = new class472();
                                    var85.field6642 = var11;
                                    var85.field6649 = var11.field2494;
                                    class262.field3780.method766(var85, -1);
                                }
                                if (class416.field5725 > var11.field2537 && var11.field2530 != null) {
                                    class472 var86 = new class472();
                                    var86.field6642 = var11;
                                    var86.field6649 = var11.field2530;
                                    class262.field3780.method766(var86, -1);
                                }
                                var11.field2537 = class86.field1217;
                                if (var11.field2480 != null) {
                                    for (int var87 = 0; var87 < class484.field6858; var87++) {
                                        class472 var88 = new class472();
                                        var88.field6642 = var11;
                                        var88.field6643 = class399.field5469[var87].method471(-1);
                                        var88.field6651 = class399.field5469[var87].method477(7);
                                        var88.field6649 = var11.field2480;
                                        class262.field3780.method766(var88, -1);
                                    }
                                }
                                if (class295.field4165 && var11.field2574 != null) {
                                    class472 var89 = new class472();
                                    var89.field6642 = var11;
                                    var89.field6649 = var11.field2574;
                                    class262.field3780.method766(var89, -1);
                                }
                            }
                            if (var11.field2602 == 5 && var11.field2617 != -1) {
                                var11.method1246(class97.field1377, class39.field534, 97).method2688(class374.field5152, var11.field2579, (byte) 9);
                            }
                            class387.method2351(true, var11);
                            if (var11.field2602 == 0) {
                                method545(arg0, var11.field2543, var14, var15, var16, var17, var12 - var11.field2477, var13 - var11.field2518, arg8, arg9);
                                if (var11.field2541 != null) {
                                    method545(var11.field2541, var11.field2543, var14, var15, var16, var17, var12 - var11.field2477, var13 - var11.field2518, arg8, arg9);
                                }
                                class249 var90 = (class249) class310.field4399.method1104(-124, (long) var11.field2543);
                                if (var90 != null) {
                                    if (class6.field42 == class35.field378 && var90.field3591 == 0 && !class205.field3005 && var21 && !class79.field1162) {
                                        class445.method2702(23770);
                                    }
                                    class343.method2135(var17, 19112, arg9, var13, var12, arg8, var15, var90.field3593, var14, var16);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class387.method2351(true, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 3054)
    public final void init() {
        field868++;
        if (!this.method2696(-12061)) {
            return;
        }
        class25.field268 = Integer.parseInt(this.getParameter("worldid"));
        class389.field5379 = class84.method718(29670, Integer.parseInt(this.getParameter("modewhere")));
        if (!class96.method800(class389.field5379, -11714) && class480.field6799 != class389.field5379) {
            class389.field5379 = class480.field6799;
        }
        class392.field5410 = class88.method740(Integer.parseInt(this.getParameter("modewhat")), 0);
        if (class392.field5410 != class175.field2665 && class392.field5410 != class116.field1616 && class397.field5453 != class392.field5410) {
            class392.field5410 = class397.field5453;
        }
        try {
            class66.field967 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class66.field967 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class259.field3692 = true;
        } else {
            class259.field3692 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class352.field4847 = true;
        } else {
            class352.field4847 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class6.field41 = true;
        } else {
            class6.field41 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class35.field378 = class350.field4825;
        } else {
            class35.field378 = class6.field42;
        }
        try {
            class96.field1351 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class96.field1351 = 0;
        }
        class219.field3175 = this.getParameter("quiturl");
        class114.field1604 = this.getParameter("settings");
        if (class114.field1604 == null) {
            class114.field1604 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class237.field3468 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class237.field3468 = 0;
            }
        }
        class105.field1474 = Integer.parseInt(this.getParameter("colourid"));
        if (class105.field1474 < 0 || class167.field2421.length <= class105.field1474) {
            class105.field1474 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class281.field4039 = true;
            class339.field4690 = true;
        }
        class204.field2997 = this;
        if (class6.field42 == class35.field378) {
            class15.field146 = 765;
            class364.field5005 = 503;
        } else if (class350.field4825 == class35.field378) {
            class364.field5005 = 480;
            class15.field146 = 640;
        }
        this.method2694(573, class15.field146, class392.field5410.method1916(true) + 32, true, class364.field5005);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 3154)
    public static final void method546() {
        int var0 = class143.field1996;
        int[] var1 = class464.field6536;
        boolean var2 = class491.field6931 == 1 && var0 > 200 || class491.field6931 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class39 var12 = class112.field1570[var1[var3]];
            if (var12.method241(0)) {
                var12.method1753(true);
                if (var12.field4535 >= 0 && var12.field4539 >= 0 && var12.field4526 < class36.field388 && var12.field4534 < class68.field998) {
                    var12.field509 = var12.field5765 ? var2 : false;
                    if (class262.field3781 == var12) {
                        var12.field5784 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field5760) {
                            var13++;
                        }
                        if (var12.field5761 > class364.field5010) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method245(4452) << 2);
                        if (class196.field2911 == 0) {
                            var14 += 32;
                        } else {
                            var14 += 128;
                        }
                        var14 += 256;
                        var12.field5784 = var14 + 1;
                    }
                } else {
                    var12.field5784 = -1;
                }
            } else {
                var12.field5784 = -1;
            }
        }
        for (int var4 = 0; var4 < class24.field257; var4++) {
            class361 var9 = class163.field2377[class193.field2873[var4]];
            if (var9.method2221(0) && var9.field4952.method222(class416.field5691, true)) {
                var9.method1753(true);
                if (var9.field4535 >= 0 && var9.field4539 >= 0 && var9.field4526 < class36.field388 && var9.field4534 < class68.field998) {
                    int var10 = 0;
                    if (!var9.field5760) {
                        var10++;
                    }
                    if (var9.field5761 > class364.field5010) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method245(4452) << 2);
                    if (class196.field2911 == 0) {
                        if (var9.field4952.field424) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class196.field2911 == 1) {
                        if (var9.field4952.field424) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field4952.field461) {
                        var11 += 1024;
                    } else if (!var9.field4952.field422) {
                        var11 += 256;
                    }
                    var9.field5784 = var11 + 1;
                } else {
                    var9.field5784 = -1;
                }
            } else {
                var9.field5784 = -1;
            }
        }
        for (int var5 = 0; var5 < class143.field1994.length; var5++) {
            class177 var6 = class143.field1994[var5];
            if (var6 != null) {
                if (var6.field2678 == 1) {
                    class361 var7 = class163.field2377[var6.field2680];
                    if (var7 != null && var7.field5784 >= 0) {
                        var7.field5784 += 2048;
                    }
                } else if (var6.field2678 == 10) {
                    class39 var8 = class112.field1570[var6.field2680];
                    if (var8 != null && class262.field3781 != var8 && var8.field5784 >= 0) {
                        var8.field5784 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lae;)Lcc;", line = 3310)
    public static final class110 method547(class172 arg0) {
        class110 var1 = (class110) class329.field4558.method1104(-126, ((long) arg0.field2543 << 32) + (long) arg0.field2527);
        return var1 == null ? arg0.field2557 : var1;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3315)
    public static final void method548(int arg0) {
        int var1 = class143.field1996;
        int[] var2 = class464.field6536;
        int var3 = class153.field2122 ? var1 : class24.field257 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class418 var5;
            if (var4 < var1) {
                var5 = class112.field1570[var2[var4]];
            } else {
                var5 = class163.field2377[class193.field2873[var4 - var1]];
            }
            if (var5.field4531 == arg0) {
                var5.field5754 = 0;
                if (var5.field5784 < 0) {
                    var5.field5760 = false;
                } else {
                    int var6 = var5.method245(4452);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field4537 & 0x7F) != 0 || (var5.field4530 & 0x7F) != 0) {
                            var5.field5760 = false;
                            continue;
                        }
                    } else if ((var5.field4537 & 0x7F) != 64 || (var5.field4530 & 0x7F) != 64) {
                        var5.field5760 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field4537 >> 7;
                        int var8 = var5.field4530 >> 7;
                        if (class154.field2133[var7][var8] != var5.field5784) {
                            var5.field5760 = true;
                            continue;
                        }
                        if (class314.field4435[var7][var8] > 1) {
                            var10002 = class314.field4435[var7][var8]--;
                            var5.field5760 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field4537 - var9 >> 7;
                        int var11 = var5.field4530 - var9 >> 7;
                        int var12 = var5.field4537 + var9 >> 7;
                        int var13 = var5.field4530 + var9 >> 7;
                        if (!class209.method1427(var11, var12, 3, var5.field5784, var10, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class154.field2133[var14][var15] == var5.field5784) {
                                        var10002 = class314.field4435[var14][var15]--;
                                    }
                                }
                            }
                            var5.field5760 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class39 && var5.field5813 != null && class364.field5010 >= var5.field5813.field6194 && class364.field5010 < var5.field5813.field6196) {
                        ((class39) var5).field509 = false;
                    }
                    var5.field5760 = false;
                    var5.field4532 = class407.method2440(var5.field4537, -16490, var5.field4530, var5.field4531);
                    class363.method2230(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 3439)
    private final void method549(byte arg0) {
        field861++;
        class385.field5283++;
        class230.method1623((byte) 99, -1, (class172) null, -1);
        class427.method2555((class172) null, -1, -100, -1);
        if (arg0 != 83) {
            field876 = null;
        }
        class448.method2710((byte) -123);
        class86.field1217++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class361 var12 = class163.field2377[var2];
            if (var12 != null) {
                byte var13 = var12.field4952.field404;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method245(4452);
                    if ((var13 & 0x2) != 0 && var12.field5810 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field5811[0] + var15;
                            int var18 = var12.field5807[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class36.field388 - var14 - 1) {
                                var17 = class36.field388 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (class68.field998 - var14 - 1 < var18) {
                                var18 = class68.field998 - var14 - 1;
                            }
                            int var19 = class235.method1640(-1, true, class300.field4249[var12.field4531], var12.field5811[0], var14, 0, var14, 0, (byte) -111, var17, class399.field5473, var14, class162.field2350, var18, var12.field5807[0]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field5811[var20] = class399.field5473[var19 - var20 - 1];
                                    var12.field5807[var20] = class162.field2350[var19 - var20 - 1];
                                    var12.field5808[var20] = 1;
                                }
                                var12.field5810 = var19;
                            }
                        }
                    }
                    class222.method1526(true, var12, false);
                    int var21 = class218.method1503(arg0 - 184, var12);
                    class227.method1551(var12, class153.field2125, class92.field1300, 0, var21);
                    class92.method770((byte) -104, var12);
                }
            }
        }
        if (class336.field4667 == 0 && class181.field2729 == 0) {
            if (class390.field5393 == 2) {
                class228.method1552(-107);
            } else {
                class168.method1220((byte) 121);
            }
            if (class135.field1884 >> 7 < 14 || (class135.field1884 >> 7) >= (class36.field388 - 14) || (class184.field2784 >> 7) < 14 || class184.field2784 >> 7 >= class68.field998 - 14) {
                class243.method1686(-105);
            }
        }
        while (true) {
            class472 var3;
            class172 var4;
            class172 var5;
            do {
                var3 = (class472) class450.field6398.method776((byte) 51);
                if (var3 == null) {
                    while (true) {
                        class472 var6;
                        class172 var7;
                        class172 var8;
                        do {
                            var6 = (class472) class484.field6857.method776((byte) -69);
                            if (var6 == null) {
                                while (true) {
                                    class472 var9;
                                    class172 var10;
                                    class172 var11;
                                    do {
                                        var9 = (class472) class262.field3780.method776((byte) 113);
                                        if (var9 == null) {
                                            if (class464.field6538 != null) {
                                                class392.method2372(-85);
                                            }
                                            if (class364.field5010 % 1500 == 0) {
                                                class280.method1871(-32449);
                                            }
                                            class150.method1075(false);
                                            if (class199.field2947 && (class10.method51(arg0 ^ 0xFFFFF3C2) - 60000L) > class7.field44) {
                                                class367.method2244(arg0 ^ 0x57);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field6642;
                                        if (var10.field2527 < 0) {
                                            break;
                                        }
                                        var11 = class361.method2217(var10.field2532, -1060820048);
                                    } while (var11 == null || var11.field2541 == null || var10.field2527 >= var11.field2541.length || var11.field2541[var10.field2527] != var10);
                                    class457.method2745(var9);
                                }
                            }
                            var7 = var6.field6642;
                            if (var7.field2527 < 0) {
                                break;
                            }
                            var8 = class361.method2217(var7.field2532, -1060820048);
                        } while (var8 == null || var8.field2541 == null || var8.field2541.length <= var7.field2527 || var8.field2541[var7.field2527] != var7);
                        class457.method2745(var6);
                    }
                }
                var4 = var3.field6642;
                if (var4.field2527 < 0) {
                    break;
                }
                var5 = class361.method2217(var4.field2532, -1060820048);
            } while (var5 == null || var5.field2541 == null || var5.field2541.length <= var4.field2527 || var5.field2541[var4.field2527] != var4);
            class457.method2745(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 3641)
    private final void method550(int arg0, int arg1) {
        field866++;
        class380.field5220.field5662 = arg1;
        class380.field5220.field5663++;
        class416.field5724 = 0;
        class177.field2681 = null;
        class294.field4147 = null;
        int var3 = 42 / ((49 - arg0) / 54);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lae;)Z", line = 3658)
    public static final boolean method551(class172 arg0) {
        if (class79.field1162) {
            if (method547(arg0).field1544 != 0) {
                return false;
            }
            if (arg0.field2602 == 0) {
                return false;
            }
        }
        return arg0.field2567;
    }
}
