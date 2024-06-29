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
public class client extends class374 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
    public static int[] field2735 = new int[500];

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2728 = 205;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lvb;")
    public static class130 field2731;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lre;")
    public static class425 field2732;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lf;")
    public static class529 field2740;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field2742;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method1249(int arg0, byte arg1) {
        if (arg1 == 36) {
            field2726++;
            class253 var2 = class332.method1911(arg0, (byte) -117, 5);
            var2.method1523((byte) -111);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 20)
    public final void method1250(byte arg0) {
        field2725++;
        if (arg0 > -120) {
            return;
        }
        if (class269.field3538) {
            class519.method3060((byte) 104);
        }
        if (class370.field4984 != null) {
            class370.field4984.method1095(15512);
        }
        if (class297.field3882 != null) {
            class423.method2437(class297.field3882, true, class389.field5281);
            class297.field3882 = null;
        }
        if (class304.field4004 != null) {
            class304.field4004.method1886(-1);
            class304.field4004 = null;
        }
        if (class298.field3942 != null) {
            class298.field3942.method1491(class518.field7663, -113);
        }
        class298.field3942 = null;
        class406.method2361(-31302);
        class287.field3760.method1548(-2);
        class229.field3086.method663((byte) -96);
        if (class321.field4199 != null) {
            class321.field4199.method665(1);
            class321.field4199 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 64)
    public final void method1251(byte arg0) {
        field2720++;
        method1265(true);
        class420.method2420((byte) -111);
        class111.method767(5);
        class253.method1521(-28554);
        class304.method1763(67);
        class256.method1542(0);
        class202.method1301((byte) -80);
        class273.method1628(-122);
        class499.method2855(30115);
        class42.method299((byte) 108);
        class114.method781((byte) -121);
        class18.method180((byte) -126);
        class72.method470(false);
        class443.method2555(63);
        class26.method223(12);
        class234.method1452(false);
        class162.method1101(-17774);
        class321.method1846((byte) -86);
        class370.method2140(8);
        class295.method1730(true);
        class280.method1661(2);
        class285.method1688(37);
        class326.method1881(false);
        class257.method1553(-80);
        class91.method659(82);
        class264.method1589((byte) 0);
        class433.method2491(-24930);
        class473.method2729(-1);
        class462.method2635((byte) -127);
        class135.method955(6);
        class236.method1468(4649);
        class13.method134((byte) -4);
        class402.method2332((byte) -34);
        class458.method2608(14220);
        class170.method1139(94);
        class52.method384(-31223);
        class439.method2538(24);
        class354.method2070((byte) 122);
        class344.method1998(-77);
        class147.method1008(64);
        class49.method373((byte) 41);
        class413.method2397(0);
        class97.method697((byte) -95);
        class224.method1407(-100);
        class267.method1600(-4589);
        class406.method2363(true);
        class130.method931(-119);
        class423.method2441(-25366);
        class365.method2128((byte) 115);
        class380.method2254(45);
        class60.method426((byte) 88);
        class189.method1215((byte) -57);
        class434.method2503(32768);
        class117.method802(113);
        class108.method751(51);
        class9.method105((byte) 60);
        class92.method668((byte) -84);
        class21.method200(-1);
        class173.method1148(false);
        class205.method1312((byte) -54);
        class54.method400(22259);
        class397.method2320(3465);
        class112.method769(119);
        class305.method1769(10157);
        class403.method2340((byte) 92);
        class515.method3030(-124);
        class282.method1680((byte) 118);
        class375.method2175((byte) -77);
        class379.method2228(-23423);
        class455.method2599((byte) -127);
        class489.method2810((byte) 97);
        class409.method2372((byte) 87);
        class166.method1117(true);
        class322.method1858((byte) 13);
        class238.method1476(-1);
        class301.method1756(-20223);
        class350.method2045(-128);
        class183.method1198((byte) 77);
        class392.method2303(1609);
        class479.method2744((byte) 87);
        class383.method2273((byte) 60);
        class388.method2293(false);
        class520.method3065(-1);
        class156.method1071((byte) -112);
        class123.method900((byte) -106);
        class467.method2652(false);
        class172.method1145(0);
        class294.method1719(-25231);
        class525.method3090(true);
        class480.method2751((byte) 126);
        class5.method31(-6257);
        class250.method1509((byte) 124);
        class121.method867(0);
        class149.method1026(-74);
        class477.method2739(23450);
        class1.method1(-129);
        class118.method811(true);
        class208.method1326(14);
        class35.method273((byte) -20);
        class506.method2891((byte) -120);
        class482.method2768((byte) -55);
        class415.method2407(-30631);
        class340.method1931((byte) -76);
        class428.method2468(-3);
        class309.method1792(false);
        class381.method2262(72);
        class16.method166(3);
        class425.method2454((byte) 106);
        class411.method2375(8823);
        class451.method2583(28);
        class270.method1617(6);
        class63.method438(2);
        class314.method1819((byte) 115);
        class192.method1238(11);
        class368.method2136((byte) -9);
        class258.method1558((byte) -128);
        class450.method2575(24588);
        class237.method1470(0);
        class98.method700(1);
        class241.method1484((byte) 121);
        class447.method2565(33);
        class349.method2041((byte) -93);
        class122.method890();
        class6.method46();
        class22.method202(-123);
        class228.method1425(-5325);
        class274.method1643();
        class290.method1702(0);
        class103.method721((byte) 107);
        class27.method228((byte) 88);
        class95.method675(80);
        class252.method1519(-24681);
        class278.method1652(-106);
        class356.method2082(-98);
        class150.method1031((byte) 42);
        class20.method187(1);
        class106.method741(true);
        class46.method332(-1);
        class490.method2827((byte) -67);
        class363.method2115(false);
        class518.method3056((byte) -103);
        class185.method1206(2);
        class405.method2356(5);
        class348.method2027((byte) 122);
        class310.method1802(-108);
        class167.method1121(-25);
        class155.method1068((byte) -9);
        class201.method1288(-21042);
        class320.method1843(-8988);
        class76.method487(-2);
        class102.method719((byte) -123);
        class70.method460(-501);
        class174.method1166((byte) -124);
        class240.method1482((byte) 55);
        class227.method1417((byte) -115);
        class441.method2540(true);
        class190.method1224();
        class179.method1186(true);
        class293.method1718(true);
        class66.method448((byte) -98);
        class386.method2285(6);
        class422.method2432((byte) -24);
        class233.method1450(-1);
        class353.method2065(-32322);
        class317.method1837(true);
        class318.method1840(2);
        class37.method286((byte) -75);
        class140.method993(100);
        class514.method3022(-113);
        class287.method1695((byte) -102);
        class527.method3102();
        class485.method2792((byte) -73);
        class361.method2103((byte) 119);
        class435.method2506(8);
        class431.method2488(-123);
        class55.method403((byte) -126);
        class56.method405((byte) -107);
        class165.method1115((byte) -126);
        class377.method2180((byte) -126);
        class302.method1757(-121);
        class457.method2605((byte) -8);
        class32.method252(true);
        class517.method3045((byte) 9);
        class50.method378((byte) -122);
        class212.method1340(-77);
        class400.method2329(-1);
        class219.method1390(3726);
        class298.method1739((byte) 123);
        class261.method1578((byte) 119);
        class389.method2295(false);
        class399.method2327(-21);
        class268.method1612(-127);
        class99.method709(0);
        class177.method1185((byte) -118);
        class373.method2159(4152);
        class327.method1896(true);
        class62.method432(31);
        class308.method1786(-14603);
        class289.method1699((byte) 63);
        class215.method1349(-1);
        class412.method2386(79);
        class478.method2743(0);
        class180.method1191(-777598329);
        class131.method932((byte) 74);
        class109.method760((byte) -78);
        class426.method2458(-5254);
        class410.method2373();
        class96.method687((byte) 1);
        class516.method3041((byte) 95);
        class57.method407((byte) 33);
        class44.method312(128);
        class508.method2901((byte) -124);
        class110.method762(102);
        class94.method673((byte) 121);
        class496.method2847(-21457);
        class12.method129((byte) 124);
        class31.method251(4);
        class465.method2647((byte) 102);
        class449.method2572((byte) 103);
        class299.method1746(-109);
        class230.method1440();
        class169.method1133(6);
        class303.method1761(4095);
        class530.method3117(-111);
        class193.method1242(5000);
        class120.method832(false);
        class456.method2601(-27982);
        class358.method2090((byte) -7);
        class124.method907((byte) 68);
        class51.method380(true);
        class286.method1690(0);
        class245.method1493(123);
        class291.method1709(-104);
        class148.method1016(false);
        class387.method2288(-1);
        class494.method2840(63);
        class307.method1782(126);
        class71.method463(-225);
        class341.method1982();
        class132.method934(2634);
        class255.method1539((byte) 60);
        class82.method515();
        class25.method220();
        class68.method451();
        class119.method831(true);
        class418.method2412();
        class85.method633(22284);
        class503.method2871(0);
        class29.method234(109);
        class531.method3127();
        class454.method2587(-16129);
        int var2 = -120 / ((arg0 + 23) / 53);
        class159.method1085((byte) 63);
        class14.method144(true);
        class88.method640((byte) 9);
        class444.method2559(127);
        class306.method1779(0);
        class247.method1500((byte) -125);
        class391.method2301((byte) 63);
        class436.method2509(false);
        class523.method3082((byte) 84);
        class288.method1697((byte) -111);
        class64.method443(false);
        class152.method1040(20339);
        class154.method1061(209);
        class522.method3074((byte) 55);
        class232.method1443(7873);
        class312.method1808(17367);
        class157.method1073((byte) -52);
        class511.method3000(32);
        class259.method1563(-9332);
        class101.method711(false);
        class89.method644((byte) 96);
        class153.method1059(7);
        class138.method986(8);
        class65.method444(33);
        class324.method1870(0);
        class48.method365(18654);
        class501.method2865(-76);
        class316.method1829(-78);
        class372.method2153(-29);
        class347.method2014(4);
        class34.method264(123);
        class81.method500();
        class229.method1431(86);
        class246.method1497((byte) -99);
        class471.method2675(106);
        class28.method233(22940);
        class461.method2624(8341);
        class129.method923(-127);
        class200.method1281(-27);
        class265.method1592((byte) -25);
        class466.method2649(0);
        class300.method1750((byte) 125);
        class339.method1928(0);
        class281.method1675(true);
        class141.method994(12);
        class53.method389(1);
        class78.method493(13987);
        class249.method1506(8192);
        class43.method304(-1982245396);
        class67.method450(0);
        class507.method2897((byte) 83);
        class481.method2762(2);
        class319.method1841(1);
        class337.method1925(65280);
        class470.method2670(-64);
        class61.method430(0);
        class80.method496(false);
        class186.method1208(true);
        class125.method914((byte) 117);
        class393.method2308(2004);
        class335.method1918(-54);
        class359.method2093((byte) 120);
        class116.method793(-16734);
        class59.method419(-17419);
        class36.method282();
        class509.method2908();
        class332.method1912((byte) -91);
        class519.method3059((byte) -87);
        class315.method1823(false);
        class58.method412(0);
        class182.method1196((byte) 127);
        class206.method1321((byte) 123);
        class333.method1913((byte) -119);
        class474.method2730((byte) 105);
        class488.method2802((byte) -116);
        class343.method1991(96);
        class297.method1736((byte) -88);
        class73.method476(128);
        class279.method1658((byte) 127);
        class222.method1398(71);
        class45.method315(false);
        class292.method1713((byte) 30);
        class204.method1309(false);
        class429.method2476((byte) 125);
        class151.method1035(true);
        class362.method2109(-2382);
        class371.method2147(-127);
        class74.method478(-86);
        class176.method1177(8);
        class421.method2423(-124);
        class331.method1908(42);
        class93.method672(-128);
        class366.method2132((byte) 26);
        class184.method1201((byte) 86);
        class105.method731((byte) 113);
        class329.method1901((byte) -106);
        class394.method2309((byte) -116);
        class30.method243(37);
        class226.method1415(-7);
        class296.method1731(125);
        class505.method2882(8194);
        class242.method1487(0);
        class452.method2585(false);
        class191.method1234((byte) -102);
        class127.method915((byte) 20);
        class17.method171(25906);
        class209.method1327(4);
        class168.method1131(9018);
        class497.method2851((byte) -20);
        class352.method2064((byte) -128);
        class430.method2486(128);
        class207.method1324((byte) 46);
        class390.method2296(-88);
        class128.method919(112);
        class277.method1650(113);
        class463.method2641((byte) 102);
        class385.method2280(-121);
        class367.method2135(4);
        class323.method1862(-11711256);
        class376.method2179(-123);
        class283.method1681(104);
        class378.method2183(true);
        class196.method1277(-114);
        class146.method1007(-28);
        class476.method2737(255);
        class199.method1279(-115);
        class203.method1303(true);
        class225.method1414(5099);
        class33.method261(true);
        class266.method1599(-28274);
        class484.method2789((byte) 102);
        class195.method1245((byte) 12);
        class401.method2331(0);
        class217.method1381(true);
        class487.method2797(95);
        class364.method2124(2);
        class223.method1402(false);
        class513.method3020(92);
        class23.method206(118);
        class220.method1393(-7987);
        class526.method3091(true);
        class427.method2460(-377);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 469)
    public final void init() {
        field2737++;
        if (!this.method2170(true)) {
            return;
        }
        class337.field4414 = Integer.parseInt(this.getParameter("worldid"));
        class281.field3698 = class402.method2335(false, Integer.parseInt(this.getParameter("modewhere")));
        if (!class471.method2676(class281.field3698, 10) && class281.field3698 != class168.field2433) {
            class281.field3698 = class168.field2433;
        }
        class470.field6474 = class96.method688(Integer.parseInt(this.getParameter("modewhat")), 7892);
        if (class470.field6474 != class365.field4944 && class470.field6474 != class31.field518 && class470.field6474 != class288.field3773) {
            class470.field6474 = class288.field3773;
        }
        try {
            class489.field6789 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class489.field6789 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class33.field543 = true;
        } else {
            class33.field543 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class223.field3009 = true;
        } else {
            class223.field3009 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class35.field560 = true;
        } else {
            class35.field560 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class155.field2265 = class191.field2691;
        } else {
            class155.field2265 = class362.field4883;
        }
        try {
            class213.field2891 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class213.field2891 = 0;
        }
        class114.field1626 = this.getParameter("quiturl");
        class88.field1341 = this.getParameter("settings");
        if (class88.field1341 == null) {
            class88.field1341 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class88.field1342 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class88.field1342 = 0;
            }
        }
        class43.field637 = Integer.parseInt(this.getParameter("colourid"));
        if (class43.field637 < 0 || class5.field136.length <= class43.field637) {
            class43.field637 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class507.field7046 = true;
            class412.field5681 = true;
        }
        class170.field2476 = this;
        if (class362.field4883 == class155.field2265) {
            class310.field4079 = 503;
            class61.field949 = 765;
        } else if (class191.field2691 == class155.field2265) {
            class310.field4079 = 480;
            class61.field949 = 640;
        }
        this.method2161(class310.field4079, class470.field6474.method2557(16966) + 32, class61.field949, 585, -68);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 564)
    private final void method1252(int arg0) {
        field2741++;
        if (class78.field1171 < class287.field3760.field3409) {
            if (class456.field6271 == class437.field5997) {
                class456.field6271 = class477.field6572;
            } else {
                class456.field6271 = class437.field5997;
            }
            class223.field3008 = (class287.field3760.field3409 - 1) * 250;
            if (class223.field3008 > 3000) {
                class223.field3008 = 3000;
            }
            if (class287.field3760.field3409 >= 2 && class287.field3760.field3407 == 6) {
                this.method2163("js5connect_outofdate", (byte) -58);
                class454.field6161 = 1000;
                return;
            }
            if (class287.field3760.field3409 >= 4 && class287.field3760.field3407 == -1) {
                this.method2163("js5crc", (byte) -124);
                class454.field6161 = 1000;
                return;
            }
            if (class287.field3760.field3409 >= 4 && (class454.field6161 == 0 || class454.field6161 == 5)) {
                if (class287.field3760.field3407 == 7 || class287.field3760.field3407 == 9) {
                    this.method2163("js5connect_full", (byte) 98);
                } else if (class287.field3760.field3407 <= 0) {
                    this.method2163("js5io", (byte) 118);
                } else {
                    this.method2163("js5connect", (byte) -73);
                }
                class454.field6161 = 1000;
                return;
            }
        }
        class78.field1171 = class287.field3760.field3409;
        if (arg0 != 250) {
            return;
        }
        if (class223.field3008 > 0) {
            class223.field3008--;
            return;
        }
        try {
            if (class60.field939 == 0) {
                class94.field1412 = class389.field5281.method1376(1, class456.field6271, class273.field3588);
                class60.field939++;
            }
            if (class60.field939 == 1) {
                if (class94.field1412.field6100 == 2) {
                    this.method1272(false, 1000);
                    return;
                }
                if (class94.field1412.field6100 == 1) {
                    class60.field939++;
                }
            }
            if (class60.field939 == 2) {
                class283.field3714 = new class326((Socket) class94.field1412.field6104, class389.field5281);
                class379 var2 = new class379(5);
                var2.method2200(7, class514.field7575.field1514);
                var2.method2214(106, 585);
                class283.field3714.method1880(var2.field5152, 103, 0, 5);
                class60.field939++;
                class233.field3140 = class498.method2854(-118);
            }
            if (class60.field939 == 3) {
                if (class454.field6161 == 0 || class454.field6161 == 5 || class283.field3714.method1879(0) > 0) {
                    int var3 = class283.field3714.method1887((byte) -123);
                    if (var3 != 0) {
                        this.method1272(false, var3);
                        return;
                    }
                    class60.field939++;
                } else if ((class498.method2854(-121) - class233.field3140) > 30000L) {
                    this.method1272(false, 1001);
                    return;
                }
            }
            if (class60.field939 == 4) {
                boolean var4 = class454.field6161 == 5 || class454.field6161 == 10 || class454.field6161 == 28;
                class287.field3760.method1546(!var4, class283.field3714, 4);
                class283.field3714 = null;
                class94.field1412 = null;
                class60.field939 = 0;
            }
        } catch (IOException var5) {
            this.method1272(false, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 712)
    public final void method1253(boolean arg0) {
        field2730++;
        if (class454.field6161 == 1000) {
            return;
        }
        long var2 = class473.method2714(0) / 1000000L - class108.field1578;
        class108.field1578 = class473.method2714(0) / 1000000L;
        boolean var4 = class88.method642(116);
        if (var4 && class21.field380 && class487.field6768 != null) {
            class487.field6768.method2466((byte) -117);
        }
        if (class454.field6161 == 30 || class454.field6161 == 10) {
            if (class287.field3753 != 0L && class498.method2854(-113) > class287.field3753) {
                class412.method2388(-37, false, class154.field2244.field7759, class154.field2244.field7777, class170.method1136((byte) 76));
            } else if (!class370.field4984.method578() && class18.field302) {
                class298.method1737(-4816);
            }
        }
        if (class297.field3882 == null) {
            Container var5;
            if (class273.field3572 == null) {
                var5 = class389.field5281.field2917;
            } else {
                var5 = class273.field3572;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class273.field3572 == var5) {
                Insets var8 = class273.field3572.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class184.field2617 != var6 || class445.field6092 != var7) {
                if (class370.field4984 == null || class370.field4984.method543()) {
                    class261.method1575((byte) 63);
                } else {
                    class445.field6092 = var7;
                    class184.field2617 = var6;
                }
                class287.field3753 = class498.method2854(-109) + 500L;
            }
        }
        if (class297.field3882 != null && !class334.field4378 && (class454.field6161 == 30 || class454.field6161 == 10)) {
            class412.method2388(112, false, -1, -1, class154.field2244.field7752);
        }
        boolean var9 = arg0;
        if (class366.field4959) {
            class366.field4959 = false;
            var9 = true;
        }
        if (var9) {
            class124.method909(3545);
        }
        if (class370.field4984 != null && class370.field4984.method578() || class170.method1136((byte) 98) != 1) {
            class260.method1570(118);
        }
        if (class454.field6161 == 0) {
            class270.method1616(class371.field5006, var9, class343.field4533[class43.field637], class159.field2359, class292.field3833[class43.field637], class5.field136[class43.field637], (byte) -97);
        } else if (class454.field6161 == 5) {
            class145.method1005(116, class292.field3833[class43.field637].getRGB(), var9 | class370.field4984.method578(), class5.field136[class43.field637].getRGB(), class370.field4984, class219.field2961, class343.field4533[class43.field637].getRGB());
        } else if (class454.field6161 == 10) {
            class163.method1105(-99);
        } else if (class454.field6161 == 25 || class454.field6161 == 28) {
            if (class523.field7734 == 1) {
                if (class191.field2694 < class286.field3743) {
                    class191.field2694 = class286.field3743;
                }
                int var11 = (class191.field2694 - class286.field3743) * 50 / class191.field2694;
                class253.method1525(class299.field3960.method1764(class489.field6789, arg0) + "<br>(" + var11 + "%)", class302.field3995, 1, true);
            } else if (class523.field7734 == 2) {
                if (class496.field6881 > class128.field1869) {
                    class128.field1869 = class496.field6881;
                }
                int var10 = ((class128.field1869 - class496.field6881) * 50 / class128.field1869) + 50;
                class253.method1525(class299.field3960.method1764(class489.field6789, false) + "<br>(" + var10 + "%)", class302.field3995, 1, true);
            } else {
                class253.method1525(class299.field3960.method1764(class489.field6789, arg0), class302.field3995, 1, true);
            }
        } else if (class454.field6161 == 30) {
            class308.method1788(-1, var2);
        } else if (class454.field6161 == 40) {
            class253.method1525(class290.field3799.method1764(class489.field6789, false) + "<br>" + class285.field3724.method1764(class489.field6789, arg0), class302.field3995, 1, true);
        }
        if (class67.field1030 == 3) {
            for (int var12 = 0; var12 < class210.field2871; var12++) {
                Rectangle var13 = class108.field1564[var12];
                if (class110.field1586[var12]) {
                    class370.field4984.method1093(var13.height, var13.x, var13.y, 3, var13.width, -1996553985);
                } else if (class153.field2231[var12]) {
                    class370.field4984.method1093(var13.height, var13.x, var13.y, 3, var13.width, -1996554240);
                }
            }
        }
        if (class461.method2625((byte) 62)) {
            class98.method703((byte) -22, class370.field4984);
        }
        if ((class454.field6161 == 30 || class454.field6161 == 10) && class67.field1030 == 0 && class170.method1136((byte) 121) == 1 && !var9 && class216.field2918.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class210.field2871; var15++) {
                if (class153.field2231[var15]) {
                    class153.field2231[var15] = false;
                    class189.field2661[var14++] = class108.field1564[var15];
                }
            }
            class370.field4984.method601(class189.field2661, var14);
        } else if (class454.field6161 != 0) {
            class370.field4984.method529();
            for (int var16 = 0; var16 < class210.field2871; var16++) {
                class153.field2231[var16] = false;
            }
        }
        if (class154.field2244.field7761 == 0) {
            class94.method674(15L, 1);
        } else if (class154.field2244.field7761 == 1) {
            class94.method674(10L, 1);
        } else if (class154.field2244.field7761 == 2) {
            class94.method674(5L, 1);
        } else if (class154.field2244.field7761 == 3) {
            class94.method674(2L, 1);
        }
        if (class260.field3443) {
            class268.method1610(5);
        }
        if (class154.field2244.field7741 && class454.field6161 == 10 && class474.field6555 != -1) {
            class154.field2244.field7741 = false;
            class154.field2244.method1852(class389.field5281, (byte) -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 951)
    public static final void method1254() {
        int var0 = class461.field6368;
        int[] var1 = class461.field6370;
        boolean var2 = class154.field2244.field7737 == 1 && var0 > 200 || class154.field2244.field7737 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class515 var12 = class499.field6901[var1[var3]];
            if (var12.method3037((byte) -78)) {
                var12.method287(96);
                if (var12.field581 >= 0 && var12.field587 >= 0 && var12.field580 < class12.field251 && var12.field569 < class289.field3782) {
                    var12.field7633 = var12.field6217 ? var2 : false;
                    if (class385.field5232 == var12) {
                        var12.field6187 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field6200) {
                            var13++;
                        }
                        if (var12.field6165 > class31.field516) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method2590(0) << 2);
                        if (var12.field7639) {
                            var14 += 512;
                        } else {
                            if (class172.field2505 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field6187 = var14 + 1;
                    }
                } else {
                    var12.field6187 = -1;
                }
            } else {
                var12.field6187 = -1;
            }
        }
        for (int var4 = 0; var4 < class60.field942; var4++) {
            class117 var9 = class291.field3822[class162.field2369[var4]];
            if (var9.method801((byte) -78) && var9.field1661.method2890(-63, class301.field3980)) {
                var9.method287(102);
                if (var9.field581 >= 0 && var9.field587 >= 0 && var9.field580 < class12.field251 && var9.field569 < class289.field3782) {
                    int var10 = 0;
                    if (!var9.field6200) {
                        var10++;
                    }
                    if (var9.field6165 > class31.field516) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method2590(0) << 2);
                    if (class172.field2505 == 0) {
                        if (var9.field1661.field6996) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class172.field2505 == 1) {
                        if (var9.field1661.field6996) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field1661.field6968) {
                        var11 += 1024;
                    } else if (!var9.field1661.field7021) {
                        var11 += 256;
                    }
                    var9.field6187 = var11 + 1;
                } else {
                    var9.field6187 = -1;
                }
            } else {
                var9.field6187 = -1;
            }
        }
        for (int var5 = 0; var5 < class335.field4395.length; var5++) {
            class370 var6 = class335.field4395[var5];
            if (var6 != null) {
                if (var6.field4980 == 1) {
                    class117 var7 = class291.field3822[var6.field4973];
                    if (var7 != null && var7.field6187 >= 0) {
                        var7.field6187 += 2048;
                    }
                } else if (var6.field4980 == 10) {
                    class515 var8 = class499.field6901[var6.field4973];
                    if (var8 != null && class385.field5232 != var8 && var8.field6187 >= 0) {
                        var8.field6187 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lcr;)Lek;", line = 1113)
    public static final class350 method1255(class403 arg0) {
        class350 var1 = (class350) class127.field1849.method182(((long) arg0.field5431 << 32) + (long) arg0.field5553, (byte) 83);
        return var1 == null ? arg0.field5410 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1117)
    public static final void method1256() {
        class391.field5301 = 0;
        for (int var0 = 0; var0 < class60.field942; var0++) {
            class117 var1 = class291.field3822[class162.field2369[var0]];
            if (var1.field6200 && var1.method807((byte) 24) != -1) {
                int var2 = (var1.method2590(0) - 1) * 64 + 60;
                int var3 = var1.field584 - var2 >> 7;
                int var4 = var1.field574 - var2 >> 7;
                class455 var5 = class309.method1793(var1.field573, var3, (byte) 95, var4);
                if (var5 != null) {
                    int var6 = var5.field6170;
                    if (var5 instanceof class117) {
                        var6 += 2048;
                    }
                    if (var5.field6169 == 0 && var5.method807((byte) 24) != -1) {
                        field2735[class391.field5301] = var6;
                        class518.field7664[class391.field5301] = var6;
                        class391.field5301++;
                        var5.field6169++;
                    }
                    field2735[class391.field5301] = var6;
                    class518.field7664[class391.field5301] = var1.field6170 + 2048;
                    class391.field5301++;
                    var5.field6169++;
                }
            }
        }
        class19.method185(class391.field5301 - 1, 0, class518.field7664, 2127, field2735);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1166)
    private final void method1257(int arg0) {
        if (!class154.field2244.field7741) {
            for (int var2 = 0; var2 < class361.field4878; var2++) {
                if (class242.field3235[var2].method1331((byte) 83) == 's' || class242.field3235[var2].method1331((byte) 87) == 'S') {
                    class154.field2244.field7741 = true;
                    break;
                }
            }
        }
        field2729++;
        if (class523.field7732 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class498.method2854(-118);
            if (class58.field914 == 0L) {
                class58.field914 = var5;
            }
            if (var4 > 16384 && var5 - class58.field914 < 5000L) {
                if (var5 - class65.field1016 > 1000L) {
                    System.gc();
                    class65.field1016 = var5;
                }
                class371.field5006 = class443.field6074.method1764(class489.field6789, false);
                class159.field2359 = 5;
            } else {
                class371.field5006 = class44.field644.method1764(class489.field6789, false);
                class159.field2359 = 5;
                class523.field7732 = 10;
            }
            return;
        }
        if (arg0 <= 119) {
            method1274(null);
        }
        if (class523.field7732 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class120.field1754[var7] = class507.method2896((byte) -78, class12.field251, class289.field3782);
            }
            class371.field5006 = class296.field3870.method1764(class489.field6789, false);
            class523.field7732 = 20;
            class159.field2359 = 10;
        } else if (class523.field7732 == 20) {
            if (class202.field2797 == null) {
                class202.field2797 = new class264(class287.field3760, class229.field3086);
            }
            if (class202.field2797.method1588(-96)) {
                class226.field3056 = class452.method2584(-123, 0, 1, false, true);
                class124.field1821 = class452.method2584(-128, 1, 1, false, true);
                class258.field3420 = class452.method2584(-123, 2, 1, false, true);
                class184.field2619 = class452.method2584(-119, 3, 1, false, true);
                class50.field774 = class452.method2584(-128, 4, 1, false, true);
                class88.field1340 = class452.method2584(-120, 5, 1, true, true);
                class449.field6118 = class452.method2584(-128, 6, 1, true, false);
                class505.field6946 = class452.method2584(-126, 7, 1, false, true);
                class71.field1082 = class452.method2584(-126, 8, 1, false, true);
                class273.field3581 = class452.method2584(-121, 9, 1, false, true);
                class131.field1899 = class452.method2584(-126, 10, 1, false, true);
                class53.field816 = class452.method2584(-124, 11, 1, false, true);
                class48.field752 = class452.method2584(-118, 12, 1, false, true);
                class201.field2790 = class452.method2584(-116, 13, 1, false, true);
                class204.field2826 = class452.method2584(-126, 14, 1, false, false);
                class496.field6878 = class452.method2584(-117, 15, 1, false, true);
                class347.field4685 = class452.method2584(-118, 16, 1, false, true);
                class149.field2130 = class452.method2584(-123, 17, 1, false, true);
                class280.field3677 = class452.method2584(-123, 18, 1, false, true);
                class277.field3630 = class452.method2584(-125, 19, 1, false, true);
                class435.field5973 = class452.method2584(-127, 20, 1, false, true);
                class48.field753 = class452.method2584(-125, 21, 1, false, true);
                class366.field4956 = class452.method2584(-128, 22, 1, false, true);
                class393.field5326 = class452.method2584(-122, 23, 1, true, true);
                class150.field2136 = class452.method2584(-125, 24, 1, false, true);
                class461.field6375 = class452.method2584(-117, 25, 1, false, true);
                class98.field1471 = class452.method2584(-122, 26, 1, true, true);
                class226.field3054 = class452.method2584(-117, 27, 1, false, true);
                class23.field403 = class452.method2584(-125, 28, 1, true, true);
                class359.field4848 = class452.method2584(-119, 29, 1, false, true);
                class371.field5006 = class220.field2975.method1764(class489.field6789, false);
                class523.field7732 = 30;
                class159.field2359 = 15;
            } else {
                class371.field5006 = class46.field680.method1764(class489.field6789, false);
                class159.field2359 = 12;
            }
        } else if (class523.field7732 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class28.field477[var9].method2496(false) * class18.field305[var9] / 100;
            }
            if (var8 == 100) {
                class371.field5006 = class80.field1182.method1764(class489.field6789, false);
                class159.field2359 = 20;
                class71.method462((byte) 50, class71.field1082);
                class331.method1905((byte) -66, class71.field1082);
                class523.field7732 = 40;
            } else {
                if (var8 != 0) {
                    class371.field5006 = class370.field4983.method1764(class489.field6789, false) + var8 + "%";
                }
                class159.field2359 = 20;
            }
        } else if (class523.field7732 == 40) {
            if (class23.field403.method2699(-22265)) {
                this.method1271((byte) 91, class23.field403.method2707(1, 0));
                class371.field5006 = class17.field290.method1764(class489.field6789, false);
                class159.field2359 = 25;
                class523.field7732 = 50;
            } else {
                class371.field5006 = class513.field7548.method1764(class489.field6789, false) + class23.field403.method2717((byte) 81) + "%";
                class159.field2359 = 25;
            }
        } else if (class523.field7732 == 50) {
            class306.method1776(true);
            class371.field5006 = class305.field4014.method1764(class489.field6789, false);
            class159.field2359 = 30;
            class523.field7732 = 60;
        } else if (class523.field7732 == 60) {
            int var10 = class92.method666(class71.field1082, class201.field2790, true);
            int var11 = class29.method239(1933102119);
            if (var10 < var11) {
                class371.field5006 = class278.field3653.method1764(class489.field6789, false) + var10 * 100 / var11 + "%";
                class159.field2359 = 35;
            } else {
                class371.field5006 = class240.field3206.method1764(class489.field6789, false);
                class159.field2359 = 35;
                class523.field7732 = 70;
            }
        } else if (class523.field7732 == 70) {
            int var12 = class326.method1889(false, class71.field1082);
            int var13 = class279.method1656(2);
            if (var12 < var13) {
                class371.field5006 = class30.field500.method1764(class489.field6789, false) + var12 * 100 / var13 + "%";
                class159.field2359 = 40;
            } else {
                class371.field5006 = class473.field6531.method1764(class489.field6789, false);
                class159.field2359 = 40;
                class523.field7732 = 80;
            }
        } else if (class523.field7732 == 80) {
            if (class98.field1471.method2699(-22265)) {
                class66.field1022 = new class95(class98.field1471, class273.field3581, class71.field1082);
                class371.field5006 = class285.field3726.method1764(class489.field6789, false);
                class159.field2359 = 45;
                class523.field7732 = 90;
            } else {
                class371.field5006 = class156.field2279.method1764(class489.field6789, false) + class98.field1471.method2717((byte) 81) + "%";
                class159.field2359 = 45;
            }
        } else if (class523.field7732 == 90) {
            class371.field5006 = class376.field5101.method1764(class489.field6789, false);
            class523.field7732 = 95;
            class159.field2359 = 50;
        } else if (class523.field7732 == 95) {
            if (class154.field2244.field7741) {
                class154.field2244.field7768 = 0;
                class154.field2244.field7756 = 0;
                class154.field2244.field7743 = 0;
                class154.field2244.field7757 = 0;
                class154.field2244.field7752 = 1;
            }
            class154.field2244.field7741 = true;
            class154.field2244.method1852(class389.field5281, (byte) 13);
            class240.method1480((byte) -7, false, class154.field2244.field7743);
            class371.field5006 = class233.field3139.method1764(class489.field6789, false);
            class159.field2359 = 55;
            class523.field7732 = 100;
        } else if (class523.field7732 == 100) {
            class127.method916(114, class370.field4984, class71.field1082, class201.field2790);
            class371.field5006 = class319.field4181.method1764(class489.field6789, false);
            class159.field2359 = 60;
            class507.method2898(1, 5);
            class523.field7732 = 110;
        } else if (class523.field7732 == 110) {
            class258.field3420.method2699(-22265);
            byte var14 = 0;
            int var15 = var14 + class258.field3420.method2717((byte) 81);
            class347.field4685.method2699(-22265);
            int var16 = var15 + class347.field4685.method2717((byte) 81);
            class149.field2130.method2699(-22265);
            int var17 = var16 + class149.field2130.method2717((byte) 81);
            class280.field3677.method2699(-22265);
            int var18 = var17 + class280.field3677.method2717((byte) 81);
            class277.field3630.method2699(-22265);
            int var19 = var18 + class277.field3630.method2717((byte) 81);
            class435.field5973.method2699(-22265);
            int var20 = var19 + class435.field5973.method2717((byte) 81);
            class48.field753.method2699(-22265);
            int var21 = var20 + class48.field753.method2717((byte) 81);
            class366.field4956.method2699(-22265);
            int var22 = var21 + class366.field4956.method2717((byte) 81);
            class150.field2136.method2699(-22265);
            int var23 = var22 + class150.field2136.method2717((byte) 81);
            class461.field6375.method2699(-22265);
            int var24 = var23 + class461.field6375.method2717((byte) 81);
            class226.field3054.method2699(-22265);
            int var25 = var24 + class226.field3054.method2717((byte) 81);
            class359.field4848.method2699(-22265);
            int var26 = var25 + class359.field4848.method2717((byte) 81);
            if (var26 < 1200) {
                class371.field5006 = class60.field940.method1764(class489.field6789, false) + var26 / 12 + "%";
                class159.field2359 = 65;
            } else {
                class270.field3546 = new class97(class155.field2265, class489.field6789, class258.field3420);
                class291.field3825 = new class13(class155.field2265, class489.field6789, class258.field3420);
                class31.field513 = new class402(class155.field2265, class489.field6789, class258.field3420, class71.field1082);
                class168.field2436 = new class458(class155.field2265, class489.field6789, class149.field2130);
                class516.field7655 = new class170(class155.field2265, class489.field6789, class258.field3420);
                class310.field4072 = new class52(class155.field2265, class489.field6789, class258.field3420);
                class204.field2828 = new class439(class155.field2265, class489.field6789, class258.field3420, class505.field6946);
                class78.field1169 = new class354(class155.field2265, class489.field6789, class258.field3420);
                class201.field2792 = new class493(class155.field2265, class489.field6789, class258.field3420);
                class402.field5388 = new class344(class155.field2265, class489.field6789, true, class347.field4685, class505.field6946);
                class267.field3522 = new class147(class155.field2265, class489.field6789, class258.field3420, class71.field1082);
                class466.field6434 = new class49(class155.field2265, class489.field6789, class258.field3420, class71.field1082);
                class206.field2849 = new class442(class155.field2265, class489.field6789, true, class280.field3677, class505.field6946);
                class127.field1852 = new class413(class155.field2265, class489.field6789, true, class270.field3546, class277.field3630, class505.field6946);
                class159.field2353 = new class224(class155.field2265, class489.field6789, class258.field3420);
                class423.field5791 = new class267(class155.field2265, class489.field6789, class435.field5973, class226.field3056, class124.field1821);
                class389.field5280 = new class90(class155.field2265, class489.field6789, class258.field3420);
                class520.field7700 = new class406(class155.field2265, class489.field6789, class258.field3420);
                class441.field6049 = new class104(class155.field2265, class489.field6789, class48.field753, class505.field6946);
                field2731 = new class130(class155.field2265, class489.field6789, class258.field3420);
                class193.field2711 = new class423(class155.field2265, class489.field6789, class258.field3420);
                class349.field4710 = new class365(class155.field2265, class489.field6789, class258.field3420);
                class185.field2626 = new class380(class155.field2265, class489.field6789, class366.field4956);
                class206.field2850 = new class60(class155.field2265, class489.field6789, class258.field3420);
                class217.method1383(class184.field2619, (byte) 106, class201.field2790, class71.field1082, class505.field6946);
                class202.method1295(class359.field4848, 123);
                class329.field4344 = new class189(class489.field6789, class150.field2136, class461.field6375);
                class507.field7044 = new class434(class489.field6789, class150.field2136, class461.field6375, new class102());
                class371.field5006 = class348.field4693.method1764(class489.field6789, false);
                class159.field2359 = 65;
                class383.method2271((byte) 79);
                class402.field5388.method1996(!class154.field2244.method1855((byte) -90, class166.field2414), 618);
                class301.field3980 = new class295();
                class72.method471(30);
                class435.method2507(class226.field3054, true);
                class47.method346(class66.field1022, class505.field6946, -8318);
                class523.field7732 = 120;
            }
        } else if (class523.field7732 == 120) {
            int var27 = class423.method2440(5900, class71.field1082);
            int var28 = class519.method3057((byte) -28);
            if (var27 < var28) {
                class371.field5006 = class400.field5372.method1764(class489.field6789, false) + var27 * 100 / var28 + "%";
                class159.field2359 = 70;
            } else {
                class327.method1891(109, class71.field1082, class370.field4984);
                class21.method201(class514.field7590, (byte) -80);
                class371.field5006 = class307.field4046.method1764(class489.field6789, false);
                class159.field2359 = 70;
                class523.field7732 = 130;
            }
        } else if (class523.field7732 == 130) {
            if (class131.field1899.method2698("huffman", false, "")) {
                class179 var29 = new class179(class131.field1899.method2696(100, "", "huffman"));
                class350.method2042(var29, 127);
                class371.field5006 = class149.field2128.method1764(class489.field6789, false);
                class159.field2359 = 75;
                class523.field7732 = 140;
            } else {
                class371.field5006 = class362.field4896.method1764(class489.field6789, false) + "0%";
                class159.field2359 = 75;
            }
        } else if (class523.field7732 == 140) {
            if (class184.field2619.method2699(-22265)) {
                class371.field5006 = class320.field4188.method1764(class489.field6789, false);
                class523.field7732 = 150;
                class159.field2359 = 80;
            } else {
                class371.field5006 = class285.field3727.method1764(class489.field6789, false) + class184.field2619.method2717((byte) 81) + "%";
                class159.field2359 = 80;
            }
        } else if (class523.field7732 == 150) {
            if (class48.field752.method2699(-22265)) {
                class371.field5006 = class48.field749.method1764(class489.field6789, false);
                class523.field7732 = 160;
                class159.field2359 = 82;
            } else {
                class371.field5006 = class386.field5254.method1764(class489.field6789, false) + class48.field752.method2717((byte) 81) + "%";
                class159.field2359 = 82;
            }
        } else if (class523.field7732 == 160) {
            if (class201.field2790.method2699(-22265)) {
                class371.field5006 = class127.field1855.method1764(class489.field6789, false);
                class523.field7732 = 170;
                class159.field2359 = 85;
            } else {
                class371.field5006 = class127.field1855.method1764(class489.field6789, false) + class201.field2790.method2717((byte) 81) + "%";
                class159.field2359 = 85;
            }
        } else if (class523.field7732 == 170) {
            if (class393.field5326.method2702(31269, "details")) {
                class6.method38(class393.field5326, class516.field7655, class310.field4072, class402.field5388, class267.field3522, class466.field6434, class301.field3980);
                class371.field5006 = class530.field7812.method1764(class489.field6789, false);
                class159.field2359 = 89;
                class523.field7732 = 180;
            } else {
                class371.field5006 = class56.field883.method1764(class489.field6789, false) + class393.field5326.method2701("details", -15149) + "%";
                class159.field2359 = 87;
            }
        } else if (class523.field7732 == 180) {
            int var30 = class365.method2127(53);
            if (var30 == -1) {
                class371.field5006 = class323.field4257.method1764(class489.field6789, false);
                class159.field2359 = 90;
            } else if (var30 == 7 || var30 == 9) {
                this.method2163("worldlistfull", (byte) -92);
                class507.method2898(1, 1000);
            } else if (class168.field2434) {
                class371.field5006 = class128.field1860.method1764(class489.field6789, false);
                class523.field7732 = 190;
                class159.field2359 = 90;
            } else {
                this.method2163("worldlistio_" + var30, (byte) 52);
                class507.method2898(1, 1000);
            }
        } else if (class523.field7732 == 190) {
            class98.field1478 = new int[class349.field4710.field4938];
            class131.field1900 = new boolean[class349.field4710.field4938];
            class344.field4551 = new String[class193.field2711.field5788];
            for (int var31 = 0; var31 < class349.field4710.field4938; var31++) {
                if (class349.field4710.method2126((byte) -116, var31).field4186 == 0) {
                    class131.field1900[var31] = true;
                    class151.field2147++;
                }
                class98.field1478[var31] = -1;
            }
            class64.method439((byte) 17);
            class506.field7024 = class184.field2619.method2704("loginscreen", true);
            class88.field1340.method2715(true, false, 0);
            class449.field6118.method2715(true, true, 0);
            class71.field1082.method2715(true, true, 0);
            class201.field2790.method2715(true, true, 0);
            class131.field1899.method2715(true, true, 0);
            class184.field2619.method2715(true, true, 0);
            class260.field3443 = true;
            class258.field3420.field6535 = 2;
            class149.field2130.field6535 = 2;
            class347.field4685.field6535 = 2;
            class280.field3677.field6535 = 2;
            class277.field3630.field6535 = 2;
            class435.field5973.field6535 = 2;
            class48.field753.field6535 = 2;
            class412.method2388(-62, false, -1, -1, class154.field2244.field7752);
            class371.field5006 = class229.field3084.method1764(class489.field6789, false);
            class523.field7732 = 200;
            class159.field2359 = 95;
        } else if (class523.field7732 == 200) {
            class39.method291(true, -1);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V", line = 1712)
    public static final void method1258(int arg0, byte arg1) {
        if (arg1 <= 19) {
            method1249(-44, (byte) -71);
        }
        class60.field943 = null;
        class342.field4520 = 1;
        class49.field759 = -1;
        class528.field7808 = 0;
        class108.field1575 = arg0;
        class433.field5910 = -1;
        class177.field2570 = false;
        field2721++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 1733)
    public final void method1259(byte arg0) {
        field2722++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class261.method1575((byte) 63);
        class229.field3086 = new class91(class389.field5281);
        class287.field3760 = new class257();
        if (class281.field3698 != class168.field2433) {
            class74.field1115 = new byte[50][];
        }
        class154.field2244 = new class321(class389.field5281);
        if (class281.field3698 == class168.field2433) {
            class356.field4806 = this.getCodeBase().getHost();
            class330.field4351 = 443;
            class203.field2817 = 43594;
        } else if (class471.method2676(class281.field3698, 10)) {
            class356.field4806 = this.getCodeBase().getHost();
            class330.field4351 = class337.field4414 + 50000;
            class203.field2817 = class337.field4414 + 40000;
        } else if (class281.field3698 == class132.field1908) {
            class203.field2817 = class337.field4414 + 40000;
            class356.field4806 = "127.0.0.1";
            class330.field4351 = class337.field4414 + 50000;
        }
        class273.field3588 = class356.field4806;
        class231.field3112 = class203.field2817;
        class477.field6572 = class330.field4351;
        class437.field5997 = class203.field2817;
        if (class216.field2911 == 3) {
            class145.field2063 = class337.field4414;
        }
        if (class191.field2691 == class155.field2265) {
            class253.field3351 = class44.field643;
            class353.field4778 = 0;
            class73.field1105 = class234.field3145;
            class59.field929 = class89.field1347;
            class514.field7588 = class300.field3976;
            class39.field597 = true;
            class105.field1546 = 16777215;
        } else {
            class59.field929 = class365.field4936;
            class253.field3351 = class17.field296;
            class514.field7588 = class212.field2890;
            class73.field1105 = class282.field3705;
        }
        class392.field5308 = class350.field4722 = class129.field1876 = class456.field6287 = new short[256];
        class456.field6271 = class231.field3112;
        class32.field523 = class314.method1820((byte) 66, class518.field7663);
        class267.field3526 = class18.method184(arg0 ^ 0xFFFFFFAE, true, class518.field7663);
        if (arg0 != -82) {
            return;
        }
        class298.field3942 = class238.method1475(true);
        if (class298.field3942 != null) {
            class298.field3942.method1490((byte) 122, class518.field7663);
        }
        class250.field3324 = class216.field2911;
        try {
            if (class389.field5281.field2920 != null) {
                class62.field970 = new class462(class389.field5281.field2920, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class105.field1539[var3] = new class462(class389.field5281.field2913[var3], 6000, 0);
                }
                class344.field4548 = new class462(class389.field5281.field2914, 6000, 0);
                class27.field458 = new class135(255, class62.field970, class344.field4548, 500000);
                class202.field2803 = new class462(class389.field5281.field2919, 24, 0);
                class389.field5281.field2914 = null;
                class389.field5281.field2919 = null;
                class389.field5281.field2920 = null;
                class389.field5281.field2913 = null;
            }
        } catch (IOException var4) {
            class344.field4548 = null;
            class27.field458 = null;
            class62.field970 = null;
            class202.field2803 = null;
        }
        if (class281.field3698 != class168.field2433) {
            class290.field3801 = true;
        }
        class89.field1352 = (class362.field4883 == class155.field2265 ? class57.field896 : class23.field407).method1764(class489.field6789, false);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1850)
    private final void method1260(int arg0) {
        field2733++;
        if (arg0 != 10274) {
            field2732 = null;
        }
        boolean var2 = class287.field3760.method1545(0);
        if (!var2) {
            this.method1252(arg0 - 10024);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1868)
    public static final void method1261() {
        for (int var0 = 0; var0 < class12.field251; var0++) {
            int[] var1 = class74.field1116[var0];
            for (int var2 = 0; var2 < class289.field3782; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 1889)
    public static final void method1262(byte arg0) {
        field2738++;
        if (class154.field2244.method1849(class166.field2414, (byte) -81) != 2) {
            return;
        }
        byte var1 = (byte) (class33.field531 - 4 & 0xFF);
        int var2 = class33.field531 % class12.field251;
        if (arg0 != -124) {
            return;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class289.field3782; var16++) {
                class99.field1482[var3][var2][var16] = var1;
            }
        }
        if (class411.field5656 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class196.field2752[var4] = -1000000;
            class199.field2760[var4] = 1000000;
            class457.field6298[var4] = 0;
            class125.field1845[var4] = 1000000;
            class426.field5818[var4] = 0;
        }
        if (class42.field623 != 1) {
            int var15 = class210.method1330(class411.field5656, (byte) -107, class430.field5888, class168.field2438);
            if ((var15 - class365.field4937) >= 800 || (class117.field1677[class411.field5656][class430.field5888 >> 7][class168.field2438 >> 7] & 0x4) == 0) {
                return;
            }
            class327.method1894(class168.field2438 >> 7, class497.field6886, (byte) 57, 1, class430.field5888 >> 7, false);
            return;
        }
        if ((class117.field1677[class411.field5656][class385.field5232.field584 >> 7][class385.field5232.field574 >> 7] & 0x4) != 0) {
            class327.method1894(class385.field5232.field574 >> 7, class497.field6886, (byte) -84, 0, class385.field5232.field584 >> 7, false);
        }
        if (class168.field2439 >= 2560) {
            return;
        }
        int var5 = class430.field5888 >> 7;
        int var6 = class168.field2438 >> 7;
        int var7 = class385.field5232.field584 >> 7;
        int var8 = class385.field5232.field574 >> 7;
        int var9;
        if (var5 >= var7) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -class12.field251 && class12.field251 > var9 && (-class289.field3782) < var10 && var10 < class289.field3782) {
            if (var9 > var10) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class117.field1677[class411.field5656][var5][var6] & 0x4) != 0) {
                        class327.method1894(var6, class497.field6886, (byte) 92, 1, var5, false);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var6 < var8) {
                            var6++;
                        } else if (var6 > var8) {
                            var6--;
                        }
                        if ((class117.field1677[class411.field5656][var5][var6] & 0x4) != 0) {
                            class327.method1894(var6, class497.field6886, (byte) -65, 1, var5, false);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class117.field1677[class411.field5656][var5][var6] & 0x4) != 0) {
                    class327.method1894(var6, class497.field6886, (byte) -43, 1, var5, false);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var7 > var5) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    var14 -= 65536;
                    if ((class117.field1677[class411.field5656][var5][var6] & 0x4) != 0) {
                        class327.method1894(var6, class497.field6886, (byte) -90, 1, var5, false);
                        return;
                    }
                }
            }
            return;
        }
        class504.method2879(null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class401.field5382 + "," + class421.field5762, -19638);
        return;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lcr;IIIIIIIII)V", line = 2080)
    public static final void method1263(class403[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class403 var11 = arg0[var10];
            if (var11 != null && var11.field5517 == arg1) {
                int var12 = var11.field5438 + arg6;
                int var13 = var11.field5537 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5480 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5450 + var12;
                    int var19 = var11.field5404 + var13;
                    if (var11.field5480 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field5480 == 0 || var11.field5411 || method1255(var11).field4714 != 0 || class393.field5317 == var11 || class299.field3962 == var11.field5468) {
                    if (!method1274(var11)) {
                        if (class484.field6735 == var11) {
                            class334.field4377 = true;
                            class211.field2875 = var12;
                            class9.field214 = var13;
                        }
                        if (var11.field5418 || var14 < var16 && var15 < var17) {
                            if (var11.field5535 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class353 var20 = (class353) class55.field869.method1672((byte) -99); var20 != null; var20 = (class353) class55.field869.method1668(-1)) {
                                    if (var20.field4766) {
                                        var20.method300(false);
                                        var20.field4770.field5400 = false;
                                    }
                                }
                                if (class176.field2567 == 0) {
                                    class484.field6735 = null;
                                    class393.field5317 = null;
                                }
                                class78.field1175 = 0;
                                class433.field5905 = false;
                                class9.field219 = false;
                                if (!class379.field5189) {
                                    class389.method2294(false);
                                }
                            }
                            boolean var21;
                            if (class267.field3526.method1302(-4362) >= var14 && class267.field3526.method1297(true) >= var15 && class267.field3526.method1302(-4362) < var16 && class267.field3526.method1297(true) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class32.field529 && var21) {
                                if (var11.field5486 >= 0) {
                                    class16.field285 = var11.field5486;
                                } else if (var11.field5535) {
                                    class16.field285 = -1;
                                }
                            }
                            if (!class379.field5189 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class91.method657(arg9 - var13, -44, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class267.field3526.method1294((byte) -28) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class378 var24 = (class378) class511.field7294.method1672((byte) -125);
                            if (var24 != null && var24.method256((byte) -128) == 0 && var24.method255(112) >= var14 && var24.method263((byte) -127) >= var15 && var24.method255(126) < var16 && var24.method263((byte) -124) < var17) {
                                var23 = true;
                            }
                            if (var11.field5562 != null) {
                                for (int var25 = 0; var25 < var11.field5562.length; var25++) {
                                    if (class32.field523.method305(var11.field5562[var25], (byte) 59)) {
                                        if (var11.field5462 == null || class31.field516 >= var11.field5462[var25]) {
                                            byte var26 = var11.field5549[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class32.field523.method305(86, (byte) 59) && !class32.field523.method305(82, (byte) 59) && !class32.field523.method305(81, (byte) 59)) && ((var26 & 0x2) == 0 || class32.field523.method305(86, (byte) 59)) && ((var26 & 0x1) == 0 || class32.field523.method305(82, (byte) 59)) && ((var26 & 0x4) == 0 || class32.field523.method305(81, (byte) 59))) {
                                                if (var25 < 10) {
                                                    class116.method796(var25 + 1, "", 9, var11.field5431, -1);
                                                } else if (var25 == 10) {
                                                    class506.method2892(65535);
                                                    class350 var27 = method1255(var11);
                                                    class63.method434(var11, var27.method2046((byte) -127), var27.field4718, 5465);
                                                    class59.field925 = class228.method1420(-99, var11);
                                                    if (class59.field925 == null) {
                                                        class59.field925 = "Null";
                                                    }
                                                    class455.field6214 = var11.field5544 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field5481[var25];
                                                if (var11.field5462 == null) {
                                                    var11.field5462 = new int[var11.field5562.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field5462[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field5462[var25] = class31.field516 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field5462 != null) {
                                        var11.field5462[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class189.method1217(var24.method263((byte) -128) - var13, 64, var24.method255(112) - var12, var11);
                            }
                            if (class484.field6735 != null && class484.field6735 != var11 && var21 && method1255(var11).method2043(119)) {
                                class366.field4954 = var11;
                            }
                            if (class393.field5317 == var11) {
                                class129.field1883 = true;
                                class426.field5823 = var12;
                                class236.field3173 = var13;
                            }
                            if (var11.field5411 || var11.field5468 != 0) {
                                if (var21 && class476.field6560 != 0 && var11.field5426 != null) {
                                    class353 var29 = new class353();
                                    var29.field4766 = true;
                                    var29.field4770 = var11;
                                    var29.field4768 = class476.field6560;
                                    var29.field4772 = var11.field5426;
                                    class55.field869.method1666((byte) 70, var29);
                                }
                                if (class484.field6735 != null || class379.field5189 || class405.field5578 != var11.field5468 && class78.field1175 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field5468 != 0) {
                                    if (class430.field5890 == var11.field5468 || class228.field3083 == var11.field5468) {
                                        class112.field1596 = var11;
                                        if (class121.field1775 != null) {
                                            class121.field1775.method775(var11.field5404, class370.field4984, 4);
                                        }
                                        if (class430.field5890 == var11.field5468) {
                                            if (!class379.field5189 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class157.method1075((byte) -33, arg8, class370.field4984, arg9);
                                                for (class437 var30 = (class437) class234.field3148.method1771(113); var30 != null; var30 = (class437) class234.field3148.method1774((byte) -81)) {
                                                    if (arg8 >= var30.field5991 && arg8 < var30.field5990 && arg9 >= var30.field5992 && arg9 < var30.field5993) {
                                                        class389.method2294(false);
                                                        class251.method1512(var30.field5988, (byte) -58);
                                                    }
                                                }
                                            }
                                            class9.method102(var11, 13132, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class299.field3962 == var11.field5468) {
                                        if (var11.method2345(-1, class370.field4984) == null || class130.field1894 != 0 && class130.field1894 != 3 || class379.field5189 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field5514[var32];
                                        if (var31 < var33 || var31 > var11.field5490[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field5450 / 2;
                                        int var35 = var32 - var11.field5404 / 2;
                                        int var36;
                                        if (class42.field623 == 4) {
                                            var36 = (int) class184.field2621 & 0x3FFF;
                                        } else {
                                            var36 = (int) class184.field2621 + class361.field4871 & 0x3FFF;
                                        }
                                        int var37 = class305.field4019[var36];
                                        int var38 = class305.field4022[var36];
                                        if (class42.field623 != 4) {
                                            var37 = (class514.field7589 + 256) * var37 >> 8;
                                            var38 = (class514.field7589 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class42.field623 == 4) {
                                            var41 = (class375.field5094 >> 7) + (var39 >> 2);
                                            var42 = (class183.field2610 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class385.field5232.method2590(0) - 1) * 64;
                                            var41 = (class385.field5232.field584 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class385.field5232.field574 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class32.field529 && (class351.field4740 & 0x40) != 0) {
                                            class403 var44 = class381.method2261(-10673, class196.field2749, class94.field1415);
                                            if (var44 == null) {
                                                class506.method2892(65535);
                                            } else {
                                                class70.method459(var11.field5530, " ->", true, var42, 30, 23856, class59.field925, class394.field5341, 1L, var41, false);
                                            }
                                            continue;
                                        }
                                        if (class191.field2691 == class155.field2265) {
                                            class70.method459(-1, "", true, var42, 9, 23856, class530.field7814.method1764(class489.field6789, false), -1, 1L, var41, false);
                                        }
                                        class70.method459(-1, "", true, var42, 6, 23856, class312.field4106, class53.field835, 1L, var41, false);
                                        continue;
                                    }
                                    if (class405.field5578 == var11.field5468) {
                                        class53.field836 = var11;
                                        if (var21) {
                                            class433.field5905 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method255(110) - var12 - var11.field5450 / 2) * 2.0D / (double) class6.field164);
                                            int var46 = (int) (-((double) (var24.method263((byte) -128) - var13 - var11.field5404 / 2) * 2.0D / (double) class6.field164));
                                            int var47 = class5.field152 + var45 + class6.field175;
                                            int var48 = class391.field5300 + var46 + class6.field172;
                                            class54 var49 = class71.method467((byte) 89);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method394(var47, -21, var50, var48);
                                            if (var50 != null) {
                                                if (class32.field523.method305(82, (byte) 59) && class196.field2745 > 0) {
                                                    class268.method1611(var50[2], (byte) -123, var50[0], var50[1]);
                                                    continue;
                                                }
                                                class9.field219 = true;
                                                class519.field7696 = var50[0];
                                                class506.field7034 = var50[1];
                                                class347.field4683 = var50[2];
                                            }
                                            class78.field1175 = 1;
                                            class30.field506 = false;
                                            class37.field583 = class267.field3526.method1302(-4362);
                                            class18.field311 = class267.field3526.method1297(true);
                                            continue;
                                        }
                                        if (var22 && class78.field1175 > 0) {
                                            if (class78.field1175 == 1 && (class37.field583 != class267.field3526.method1302(-4362) || class18.field311 != class267.field3526.method1297(true))) {
                                                class174.field2547 = class5.field152;
                                                class245.field3268 = class391.field5300;
                                                class78.field1175 = 2;
                                            }
                                            if (class78.field1175 == 2) {
                                                class30.field506 = true;
                                                class365.method2130((byte) 124, class174.field2547 + (int) ((double) (class37.field583 - class267.field3526.method1302(-4362)) * 2.0D / (double) class6.field170));
                                                class305.method1772(class245.field3268 - (int) ((double) (class18.field311 - class267.field3526.method1297(true)) * 2.0D / (double) class6.field170), (byte) -121);
                                            }
                                            continue;
                                        }
                                        if (class78.field1175 > 0 && !class30.field506) {
                                            if ((class513.field7561 == 1 || class277.method1649(-2001)) && class412.field5693 > 2) {
                                                class191.method1233(true, class37.field583, class18.field311);
                                            } else if (class252.method1514(-1)) {
                                                class191.method1233(true, class37.field583, class18.field311);
                                            }
                                        }
                                        class78.field1175 = 0;
                                        continue;
                                    }
                                    if (class23.field408 == var11.field5468) {
                                        if (var22) {
                                            class514.method3027(var11.field5404, false, class267.field3526.method1302(-4362) - var12, var11.field5450, class267.field3526.method1297(true) - var13);
                                        }
                                        continue;
                                    }
                                    if (class251.field3331 == var11.field5468) {
                                        class75.method483(var12, var11, (byte) 119, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field5460 && var23) {
                                    var11.field5460 = true;
                                    if (var11.field5522 != null) {
                                        class353 var51 = new class353();
                                        var51.field4766 = true;
                                        var51.field4770 = var11;
                                        var51.field4775 = var24.method255(112) - var12;
                                        var51.field4768 = var24.method263((byte) -124) - var13;
                                        var51.field4772 = var11.field5522;
                                        class55.field869.method1666((byte) 108, var51);
                                    }
                                }
                                if (var11.field5460 && var22 && var11.field5441 != null) {
                                    class353 var52 = new class353();
                                    var52.field4766 = true;
                                    var52.field4770 = var11;
                                    var52.field4775 = class267.field3526.method1302(-4362) - var12;
                                    var52.field4768 = class267.field3526.method1297(true) - var13;
                                    var52.field4772 = var11.field5441;
                                    class55.field869.method1666((byte) -119, var52);
                                }
                                if (var11.field5460 && !var22) {
                                    var11.field5460 = false;
                                    if (var11.field5491 != null) {
                                        class353 var53 = new class353();
                                        var53.field4766 = true;
                                        var53.field4770 = var11;
                                        var53.field4775 = class267.field3526.method1302(-4362) - var12;
                                        var53.field4768 = class267.field3526.method1297(true) - var13;
                                        var53.field4772 = var11.field5491;
                                        class349.field4709.method1666((byte) -71, var53);
                                    }
                                }
                                if (var22 && var11.field5466 != null) {
                                    class353 var54 = new class353();
                                    var54.field4766 = true;
                                    var54.field4770 = var11;
                                    var54.field4775 = class267.field3526.method1302(-4362) - var12;
                                    var54.field4768 = class267.field3526.method1297(true) - var13;
                                    var54.field4772 = var11.field5466;
                                    class55.field869.method1666((byte) -54, var54);
                                }
                                if (!var11.field5400 && var21) {
                                    var11.field5400 = true;
                                    if (var11.field5526 != null) {
                                        class353 var55 = new class353();
                                        var55.field4766 = true;
                                        var55.field4770 = var11;
                                        var55.field4775 = class267.field3526.method1302(-4362) - var12;
                                        var55.field4768 = class267.field3526.method1297(true) - var13;
                                        var55.field4772 = var11.field5526;
                                        class55.field869.method1666((byte) -80, var55);
                                    }
                                }
                                if (var11.field5400 && var21 && var11.field5425 != null) {
                                    class353 var56 = new class353();
                                    var56.field4766 = true;
                                    var56.field4770 = var11;
                                    var56.field4775 = class267.field3526.method1302(-4362) - var12;
                                    var56.field4768 = class267.field3526.method1297(true) - var13;
                                    var56.field4772 = var11.field5425;
                                    class55.field869.method1666((byte) 127, var56);
                                }
                                if (var11.field5400 && !var21) {
                                    var11.field5400 = false;
                                    if (var11.field5433 != null) {
                                        class353 var57 = new class353();
                                        var57.field4766 = true;
                                        var57.field4770 = var11;
                                        var57.field4775 = class267.field3526.method1302(-4362) - var12;
                                        var57.field4768 = class267.field3526.method1297(true) - var13;
                                        var57.field4772 = var11.field5433;
                                        class349.field4709.method1666((byte) -57, var57);
                                    }
                                }
                                if (var11.field5453 != null) {
                                    class353 var58 = new class353();
                                    var58.field4770 = var11;
                                    var58.field4772 = var11.field5453;
                                    class379.field5188.method1666((byte) -44, var58);
                                }
                                if (var11.field5511 != null && class149.field2129 > var11.field5509) {
                                    if (var11.field5443 == null || class149.field2129 - var11.field5509 > 32) {
                                        class353 var63 = new class353();
                                        var63.field4770 = var11;
                                        var63.field4772 = var11.field5511;
                                        class55.field869.method1666((byte) -123, var63);
                                    } else {
                                        label691: for (int var59 = var11.field5509; var59 < class149.field2129; var59++) {
                                            int var60 = class58.field904[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field5443.length; var61++) {
                                                if (var11.field5443[var61] == var60) {
                                                    class353 var62 = new class353();
                                                    var62.field4770 = var11;
                                                    var62.field4772 = var11.field5511;
                                                    class55.field869.method1666((byte) -33, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5509 = class149.field2129;
                                }
                                if (var11.field5440 != null && class102.field1508 > var11.field5500) {
                                    if (var11.field5547 == null || class102.field1508 - var11.field5500 > 32) {
                                        class353 var68 = new class353();
                                        var68.field4770 = var11;
                                        var68.field4772 = var11.field5440;
                                        class55.field869.method1666((byte) -88, var68);
                                    } else {
                                        label667: for (int var64 = var11.field5500; var64 < class102.field1508; var64++) {
                                            int var65 = class184.field2614[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field5547.length; var66++) {
                                                if (var11.field5547[var66] == var65) {
                                                    class353 var67 = new class353();
                                                    var67.field4770 = var11;
                                                    var67.field4772 = var11.field5440;
                                                    class55.field869.method1666((byte) -66, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5500 = class102.field1508;
                                }
                                if (var11.field5409 != null && class49.field763 > var11.field5454) {
                                    if (var11.field5447 == null || class49.field763 - var11.field5454 > 32) {
                                        class353 var73 = new class353();
                                        var73.field4770 = var11;
                                        var73.field4772 = var11.field5409;
                                        class55.field869.method1666((byte) 124, var73);
                                    } else {
                                        label643: for (int var69 = var11.field5454; var69 < class49.field763; var69++) {
                                            int var70 = class324.field4276[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field5447.length; var71++) {
                                                if (var11.field5447[var71] == var70) {
                                                    class353 var72 = new class353();
                                                    var72.field4770 = var11;
                                                    var72.field4772 = var11.field5409;
                                                    class55.field869.method1666((byte) -103, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5454 = class49.field763;
                                }
                                if (var11.field5402 != null && class375.field5091 > var11.field5505) {
                                    if (var11.field5559 == null || class375.field5091 - var11.field5505 > 32) {
                                        class353 var78 = new class353();
                                        var78.field4770 = var11;
                                        var78.field4772 = var11.field5402;
                                        class55.field869.method1666((byte) 96, var78);
                                    } else {
                                        label619: for (int var74 = var11.field5505; var74 < class375.field5091; var74++) {
                                            int var75 = class312.field4109[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field5559.length; var76++) {
                                                if (var11.field5559[var76] == var75) {
                                                    class353 var77 = new class353();
                                                    var77.field4770 = var11;
                                                    var77.field4772 = var11.field5402;
                                                    class55.field869.method1666((byte) -94, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5505 = class375.field5091;
                                }
                                if (var11.field5525 != null && class42.field628 > var11.field5407) {
                                    if (var11.field5399 == null || class42.field628 - var11.field5407 > 32) {
                                        class353 var83 = new class353();
                                        var83.field4770 = var11;
                                        var83.field4772 = var11.field5525;
                                        class55.field869.method1666((byte) -77, var83);
                                    } else {
                                        label595: for (int var79 = var11.field5407; var79 < class42.field628; var79++) {
                                            int var80 = class72.field1092[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field5399.length; var81++) {
                                                if (var11.field5399[var81] == var80) {
                                                    class353 var82 = new class353();
                                                    var82.field4770 = var11;
                                                    var82.field4772 = var11.field5525;
                                                    class55.field869.method1666((byte) -82, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5407 = class42.field628;
                                }
                                if (class402.field5383 > var11.field5482 && var11.field5554 != null) {
                                    class353 var84 = new class353();
                                    var84.field4770 = var11;
                                    var84.field4772 = var11.field5554;
                                    class55.field869.method1666((byte) -56, var84);
                                }
                                if (class57.field895 > var11.field5482 && var11.field5487 != null) {
                                    class353 var85 = new class353();
                                    var85.field4770 = var11;
                                    var85.field4772 = var11.field5487;
                                    class55.field869.method1666((byte) 89, var85);
                                }
                                if (class462.field6404 > var11.field5482 && var11.field5495 != null) {
                                    class353 var86 = new class353();
                                    var86.field4770 = var11;
                                    var86.field4772 = var11.field5495;
                                    class55.field869.method1666((byte) 103, var86);
                                }
                                if (class494.field6859 > var11.field5482 && var11.field5427 != null) {
                                    class353 var87 = new class353();
                                    var87.field4770 = var11;
                                    var87.field4772 = var11.field5427;
                                    class55.field869.method1666((byte) -111, var87);
                                }
                                if (class222.field2994 > var11.field5482 && var11.field5449 != null) {
                                    class353 var88 = new class353();
                                    var88.field4770 = var11;
                                    var88.field4772 = var11.field5449;
                                    class55.field869.method1666((byte) 82, var88);
                                }
                                var11.field5482 = class308.field4051;
                                if (var11.field5428 != null) {
                                    for (int var89 = 0; var89 < class361.field4878; var89++) {
                                        class353 var90 = new class353();
                                        var90.field4770 = var11;
                                        var90.field4771 = class242.field3235[var89].method1332(44);
                                        var90.field4769 = class242.field3235[var89].method1331((byte) 91);
                                        var90.field4772 = var11.field5428;
                                        class55.field869.method1666((byte) 89, var90);
                                    }
                                }
                                if (class457.field6296 && var11.field5412 != null) {
                                    class353 var91 = new class353();
                                    var91.field4770 = var11;
                                    var91.field4772 = var11.field5412;
                                    class55.field869.method1666((byte) -77, var91);
                                }
                            }
                            if (var11.field5480 == 5 && var11.field5518 != -1) {
                                var11.method2343(true, class520.field7700, class389.field5280).method775(var11.field5404, class370.field4984, 4);
                            }
                            class220.method1392((byte) -9, var11);
                            if (var11.field5480 == 0) {
                                method1263(arg0, var11.field5431, var14, var15, var16, var17, var12 - var11.field5520, var13 - var11.field5442, arg8, arg9);
                                if (var11.field5420 != null) {
                                    method1263(var11.field5420, var11.field5431, var14, var15, var16, var17, var12 - var11.field5520, var13 - var11.field5442, arg8, arg9);
                                }
                                class301 var92 = (class301) class27.field457.method182((long) var11.field5431, (byte) 125);
                                if (var92 != null) {
                                    if (class362.field4883 == class155.field2265 && var92.field3981 == 0 && !class379.field5189 && var21 && !class299.field3964) {
                                        class389.method2294(false);
                                    }
                                    class489.method2815(var16, arg9, var12, var92.field3982, var17, var15, -36, var14, var13, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class220.method1392((byte) 127, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lcr;)Lcr;", line = 2982)
    public static final class403 method1264(class403 arg0) {
        int var1 = method1255(arg0).method2048(386216370);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class213.method1345((byte) -113, arg0.field5517);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 3001)
    public static void method1265(boolean arg0) {
        field2735 = null;
        field2732 = null;
        field2731 = null;
        if (!arg0) {
            method1249(124, (byte) 49);
        }
        field2740 = null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V", line = 3014)
    private final void method1266(byte arg0) {
        field2734++;
        class128.field1871++;
        class9.method102(null, 13132, -1, -1);
        class75.method483(-1, null, (byte) -37, -1);
        class14.method135(true);
        class308.field4051++;
        if (arg0 > -40) {
            method1249(3, (byte) -56);
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            class117 var12 = class291.field3822[var2];
            if (var12 != null) {
                byte var13 = var12.field1661.field6993;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method2590(0);
                    if ((var13 & 0x2) != 0 && var12.field6257 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field6261[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > (class12.field251 - var14 - 1)) {
                                var17 = class12.field251 - var14 - 1;
                            }
                            int var18 = var12.field6266[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class289.field3782 - var14 - 1)) {
                                var18 = class289.field3782 - var14 - 1;
                            }
                            int var19 = class290.method1705(0, var14, 0, var18, var12.field6261[0], -1, var12.field6266[0], class120.field1754[var12.field573], class270.field3545, var14, class59.field926, var17, (byte) -76, var14, true);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field6261[var20] = class59.field926[var19 - var20 - 1];
                                    var12.field6266[var20] = class270.field3545[var19 - var20 - 1];
                                    var12.field6265[var20] = 1;
                                }
                                var12.field6257 = var19;
                            }
                        }
                    }
                    class45.method316(var12, true, 8);
                    int var21 = class429.method2477(-22, var12);
                    class165.method1114(class51.field803, var21, class270.field3542, 23245, var12);
                    class382.method2266(-1, var12);
                }
            }
        }
        if (class27.field459 == 0 && class314.field4116 == 0) {
            if (class42.field623 == 2) {
                class48.method355(true);
            } else {
                class406.method2360(-2);
            }
            if (class430.field5888 >> 7 < 14 || (class12.field251 - 14) <= (class430.field5888 >> 7) || class168.field2438 >> 7 < 14 || class168.field2438 >> 7 >= class289.field3782 - 14) {
                class224.method1404((byte) -125);
            }
        }
        while (true) {
            class353 var3;
            class403 var4;
            class403 var5;
            do {
                var3 = (class353) class379.field5188.method1662((byte) 95);
                if (var3 == null) {
                    while (true) {
                        class353 var6;
                        class403 var7;
                        class403 var8;
                        do {
                            var6 = (class353) class349.field4709.method1662((byte) 114);
                            if (var6 == null) {
                                while (true) {
                                    class353 var9;
                                    class403 var10;
                                    class403 var11;
                                    do {
                                        var9 = (class353) class55.field869.method1662((byte) 120);
                                        if (var9 == null) {
                                            if (class484.field6735 != null) {
                                                class514.method3026(83);
                                            }
                                            if ((class31.field516 % 1500) == 0) {
                                                class441.method2543((byte) 99);
                                            }
                                            class105.method729(50);
                                            if (class269.field3538 && class21.field386 < class498.method2854(-127) - 60000L) {
                                                class519.method3060((byte) 4);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field4770;
                                        if (var10.field5553 < 0) {
                                            break;
                                        }
                                        var11 = class213.method1345((byte) -110, var10.field5517);
                                    } while (var11 == null || var11.field5420 == null || var10.field5553 >= var11.field5420.length || var11.field5420[var10.field5553] != var10);
                                    class122.method893(var9);
                                }
                            }
                            var7 = var6.field4770;
                            if (var7.field5553 < 0) {
                                break;
                            }
                            var8 = class213.method1345((byte) 37, var7.field5517);
                        } while (var8 == null || var8.field5420 == null || var8.field5420.length <= var7.field5553 || var8.field5420[var7.field5553] != var7);
                        class122.method893(var6);
                    }
                }
                var4 = var3.field4770;
                if (var4.field5553 < 0) {
                    break;
                }
                var5 = class213.method1345((byte) -110, var4.field5517);
            } while (var5 == null || var5.field5420 == null || var4.field5553 >= var5.field5420.length || var5.field5420[var4.field5553] != var4);
            class122.method893(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 3224)
    public final void method1267(byte arg0) {
        field2727++;
        if (class454.field6161 == 1000) {
            return;
        }
        class31.field516++;
        if (class31.field516 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class467.field6439 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class373.field5040.setSeed((long) class467.field6439);
        }
        if (class31.field516 % 50 == 0) {
            class227.field3062 = class132.field1911;
            class132.field1911 = 0;
            class405.field5577 = class386.field5259;
            class386.field5259 = 0;
        }
        this.method1260(10274);
        if (class202.field2797 != null) {
            class202.field2797.method1590(-100);
        }
        class26.method225(true);
        class32.field523.method307(110);
        class267.field3526.method1296((byte) 64);
        if (class298.field3942 != null) {
            int var3 = class298.field3942.method1489((byte) 78);
            class476.field6560 = var3;
        }
        if (class370.field4984 != null) {
            class370.field4984.method575((int) class498.method2854(-125));
        }
        class153.method1053((byte) -103);
        class361.field4878 = 0;
        for (class210 var4 = class32.field523.method311((byte) -121); var4 != null && class361.field4878 < 128; var4 = class32.field523.method311((byte) -121)) {
            if (var4.method1333((byte) 85) != 1) {
                char var5 = var4.method1331((byte) 79);
                if (!class148.method1021((byte) 88) || !(var5 == '`' || var5 == '§')) {
                    class242.field3235[class361.field4878] = var4;
                    class361.field4878++;
                } else if (class461.method2625((byte) 119)) {
                    class320.method1844(106);
                } else {
                    class125.method913(true);
                }
            }
        }
        if (arg0 != -22) {
            field2740 = null;
        }
        for (class378 var6 = class267.field3526.method1298(arg0 ^ 0xFFFFFFEA); var6 != null; var6 = class267.field3526.method1298(0)) {
            int var7 = var6.method256((byte) -128);
            if (var7 == -1) {
                class264.field3484.method1666((byte) -86, var6);
            } else if (class201.method1286(true, var7)) {
                class511.field7294.method1666((byte) -92, var6);
            }
            if (class511.field7294.method1669(32291) > 10) {
                class511.field7294.method1662((byte) 95);
            }
        }
        if (class461.method2625((byte) 105)) {
            class157.method1074((byte) 82);
        }
        if (class454.field6161 == 0) {
            this.method1257(125);
            class171.method1143((byte) 111);
        } else if (class454.field6161 == 5) {
            this.method1257(arg0 + 145);
            class171.method1143((byte) 105);
        } else if (class454.field6161 == 25 || class454.field6161 == 28) {
            class374.method2168((byte) 95);
        }
        if (class454.field6161 == 10) {
            this.method1266((byte) -73);
            class433.method2501(255);
            class511.method2962(0);
            class444.method2562(46);
        } else if (class454.field6161 == 30) {
            class55.method402(30034);
        } else if (class454.field6161 == 40) {
            class444.method2562(126);
            if (class458.field6312 != -3 && class458.field6312 != 2 && class458.field6312 != 15) {
                class476.method2735(arg0 ^ 0xFFFFFF15);
            }
        }
        class523.method3085(class370.field4984, -1);
        class511.field7294.method1662((byte) 102);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 3371)
    public static final void method1268(int arg0) {
        int var1 = class461.field6368;
        int[] var2 = class461.field6370;
        for (int var3 = 0; var3 < class60.field942 + var1; var3++) {
            class455 var4;
            if (var3 < var1) {
                var4 = class499.field6901[var2[var3]];
            } else {
                var4 = class291.field3822[class162.field2369[var3 - var1]];
            }
            if (var4.field573 == arg0 && var4.field6187 >= 0) {
                int var5 = var4.method2590(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field584 & 0x7F) != 0 || (var4.field574 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field584 & 0x7F) != 64 || (var4.field574 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field584 >> 7;
                    int var7 = var4.field574 >> 7;
                    if (var4.field6187 > class74.field1116[var6][var7]) {
                        class74.field1116[var6][var7] = var4.field6187;
                        class349.field4711[var6][var7] = 1;
                    } else if (class74.field1116[var6][var7] == var4.field6187) {
                        var10002 = class349.field4711[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field584 - var8 >> 7;
                    int var10 = var4.field574 - var8 >> 7;
                    int var11 = var4.field584 + var8 >> 7;
                    int var12 = var4.field574 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field6187 > class74.field1116[var13][var14]) {
                                class74.field1116[var13][var14] = var4.field6187;
                                class349.field4711[var13][var14] = 1;
                            } else if (class74.field1116[var13][var14] == var4.field6187) {
                                var10002 = class349.field4711[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 3472)
    public static final void method1269(int arg0) {
        class457.field6297.method1458((byte) -121);
        field2723++;
        if (arg0 != 0) {
            field2728 = 84;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 3487)
    public static final void method1270(int arg0) {
        int var1 = class461.field6368;
        int[] var2 = class461.field6370;
        int var3 = class42.field631 ? var1 : class60.field942 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class455 var5;
            if (var4 < var1) {
                var5 = class499.field6901[var2[var4]];
            } else {
                var5 = class291.field3822[class162.field2369[var4 - var1]];
            }
            if (var5.field573 == arg0) {
                var5.field6169 = 0;
                if (var5.field6187 < 0) {
                    var5.field6200 = false;
                } else {
                    int var6 = var5.method2590(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field584 & 0x7F) != 0 || (var5.field574 & 0x7F) != 0) {
                            var5.field6200 = false;
                            continue;
                        }
                    } else if ((var5.field584 & 0x7F) != 64 || (var5.field574 & 0x7F) != 64) {
                        var5.field6200 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field584 >> 7;
                        int var8 = var5.field574 >> 7;
                        if (class74.field1116[var7][var8] != var5.field6187) {
                            var5.field6200 = true;
                            continue;
                        }
                        if (class349.field4711[var7][var8] > 1) {
                            var10002 = class349.field4711[var7][var8]--;
                            var5.field6200 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field584 - var9 >> 7;
                        int var11 = var5.field574 - var9 >> 7;
                        int var12 = var5.field584 + var9 >> 7;
                        int var13 = var5.field574 + var9 >> 7;
                        if (!class310.method1799(var12, var10, true, var5.field6187, var11, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class74.field1116[var14][var15] == var5.field6187) {
                                        var10002 = class349.field4711[var14][var15]--;
                                    }
                                }
                            }
                            var5.field6200 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class515 && var5.field6258 != null && class31.field516 >= var5.field6258.field6747 && class31.field516 < var5.field6258.field6755) {
                        ((class515) var5).field7633 = false;
                    }
                    var5.field6200 = false;
                    var5.field568 = class210.method1330(var5.field573, (byte) -24, var5.field584, var5.field574);
                    class48.method357(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V", line = 3604)
    private final void method1271(byte arg0, byte[] arg1) {
        field2724++;
        class379 var3 = new class379(arg1);
        if (arg0 <= 26) {
            return;
        }
        while (true) {
            int var4;
            label47: do {
                while (true) {
                    while (true) {
                        var4 = var3.method2238(255);
                        if (var4 == 0) {
                            return;
                        }
                        if (var4 == 1) {
                            int[] var9 = class425.field5815 = new int[6];
                            var9[0] = var3.method2212((byte) 83);
                            var9[1] = var3.method2212((byte) 83);
                            var9[2] = var3.method2212((byte) 83);
                            var9[3] = var3.method2212((byte) 83);
                            var9[4] = var3.method2212((byte) 83);
                            var9[5] = var3.method2212((byte) 83);
                        } else {
                            if (var4 != 4) {
                                continue label47;
                            }
                            int var7 = var3.method2238(255);
                            class359.field4847 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                class359.field4847[var8] = var3.method2212((byte) 83);
                                if (class359.field4847[var8] == 65535) {
                                    class359.field4847[var8] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var4 != 5);
            int var5 = var3.method2238(255);
            class441.field6051 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class441.field6051[var6] = var3.method2212((byte) 83);
                if (class441.field6051[var6] == 65535) {
                    class441.field6051[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3682)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class429.method2478("argument count", (byte) 101);
            }
            class337.field4414 = Integer.parseInt(arg0[0]);
            class281.field3698 = class132.field1908;
            if (arg0[1].equals("live")) {
                class470.field6474 = class288.field3773;
            } else if (arg0[1].equals("rc")) {
                class470.field6474 = class31.field518;
            } else if (arg0[1].equals("wip")) {
                class470.field6474 = class365.field4944;
            } else {
                class429.method2478("modewhat", (byte) 35);
            }
            class489.field6789 = class106.method744((byte) 96, arg0[2]);
            if (class489.field6789 == -1) {
                if (arg0[2].equals("english")) {
                    class489.field6789 = 0;
                } else if (arg0[2].equals("german")) {
                    class489.field6789 = 1;
                } else {
                    class429.method2478("language", (byte) 117);
                }
            }
            class223.field3009 = false;
            class33.field543 = false;
            if (arg0[3].equals("game0")) {
                class155.field2265 = class362.field4883;
            } else if (arg0[3].equals("game1")) {
                class155.field2265 = class191.field2691;
            } else {
                class429.method2478("game", (byte) 20);
            }
            class507.field7046 = true;
            class412.field5681 = true;
            class213.field2891 = 0;
            class88.field1341 = "";
            class88.field1342 = 0;
            class43.field637 = class155.field2265.field3146;
            client var1 = new client();
            class170.field2476 = var1;
            var1.method2174((byte) -1, false, 585, 30, class155.field2265.field3144, 1024, class470.field6474.method2557(16966) + 32, 768);
            class273.field3572.setLocation(40, 40);
        } catch (Exception var3) {
            class504.method2879(var3, null, -19638);
        }
        field2736++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V", line = 3748)
    private final void method1272(boolean arg0, int arg1) {
        class287.field3760.field3409++;
        field2739++;
        class60.field939 = 0;
        class94.field1412 = null;
        if (arg0) {
            field2740 = null;
        }
        class283.field3714 = null;
        class287.field3760.field3407 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3765)
    public static final void method1273() {
        int var0 = class461.field6368;
        int[] var1 = class461.field6370;
        int var2 = class42.field631 ? var0 : class60.field942 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class455 var4;
            if (var3 < var0) {
                var4 = class499.field6901[var1[var3]];
            } else {
                var4 = class291.field3822[class162.field2369[var3 - var0]];
            }
            if (var4.field6187 >= 0) {
                int var5 = var4.method2590(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field584 & 0x7F) == 0 && (var4.field574 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field584 & 0x7F) == 64 && (var4.field574 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class515 && var4.field6258 != null && class31.field516 >= var4.field6258.field6747 && class31.field516 < var4.field6258.field6755) {
                    ((class515) var4).field7633 = false;
                }
                var4.field568 = class210.method1330(var4.field573, (byte) -20, var4.field584, var4.field574);
                class48.method357(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lcr;)Z", line = 3809)
    public static final boolean method1274(class403 arg0) {
        if (class299.field3964) {
            if (method1255(arg0).field4714 != 0) {
                return false;
            }
            if (arg0.field5480 == 0) {
                return false;
            }
        }
        return arg0.field5550;
    }
}
