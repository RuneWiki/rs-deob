import jagex3.jagmisc.jagmisc;
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
public class client extends class281 {

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[[I")
    public static int[][] field1430 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Liba;")
    public static class211 field1438 = new class211(63, -1);

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Lps;")
    public static class5 field1440 = null;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Liba;")
    public static class211 field1439 = new class211(32, 7);

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field1437;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Ljava/lang/Class;")
    public static Class field1441;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
    public static boolean field1442;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method585(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 5)
    public final void method559(int arg0) {
        method573((byte) 14);
        field1425++;
        class418.method2540(-17368);
        class489.method2796(-54);
        class279.method1653((byte) -82);
        class430.method2570(16);
        class547.method3201(-106);
        class565.method3256(true);
        class541.method3175((byte) 62);
        class705.method3947(79);
        class690.method3863(-100);
        class321.method1990(-1);
        class158.method1129(false);
        class322.method2000(3);
        class281.method1663(-4);
        class416.method2531((byte) 101);
        class271.method1621(16384);
        class318.method1971(false);
        class373.method2295(-263);
        class98.method698((byte) -116);
        class603.method3430(-17);
        class131.method935(48);
        class14.method100(true);
        class302.method1899(true);
        class347.method2154(true);
        class498.method2849((byte) 109);
        class370.method2290(25083);
        class614.method3496((byte) 92);
        class295.method1824(true);
        class19.method131(-1);
        class70.method406(true);
        class104.method743(0);
        class291.method1795(128);
        class397.method2469((byte) 120);
        class488.method2787((byte) -64);
        class621.method3577(true);
        class533.method3086(64);
        class481.method2754(-100);
        class40.method228((byte) -113);
        class153.method1096(-118);
        class247.method1504((byte) 106);
        class236.method1452(-126);
        class524.method2970(false);
        class61.method373(13240);
        class28.method181(0);
        class9.method70((byte) -115);
        class73.method425(1109655552);
        class199.method1296((byte) -30);
        class315.method1960(16191);
        class108.method818(100);
        class480.method2750(-107);
        class177.method1207(-29208);
        class215.method1360(1);
        class162.method1153(256);
        class311.method1943((byte) 61);
        class342.method2121(3);
        class165.method1162((byte) 72);
        class94.method591(106);
        class604.method3448((byte) -64);
        class69.method403(-125);
        class319.method1972(-114);
        class383.method2363((byte) 85);
        class5.method30(0);
        class11.method75((byte) 123);
        class540.method3119(-957401312);
        class654.method3699(121);
        class523.method2965(-1);
        class44.method252((byte) -82);
        class2.method6((byte) 75);
        class285.method1684(-3);
        class678.method3813(false);
        class53.method319(false);
        class200.method1299((byte) 56);
        class78.method458(-126);
        class431.method2572(27763);
        class413.method2522((byte) 121);
        class282.method1673(43);
        class138.method976(false);
        class50.method301(false);
        class400.method2482(-18);
        class60.method372((byte) -89);
        class82.method473((byte) -68);
        class206.method1323(5);
        class116.method859((byte) 82);
        class688.method3853((byte) -122);
        class102.method732((byte) -118);
        class367.method2248(0);
        class198.method1294(true);
        class564.method3255((byte) -71);
        class448.method2643(301006384);
        class317.method1969(-86);
        class674.method3784((byte) -35);
        class242.method1488((byte) -27);
        class128.method915(-8921);
        class47.method279(128);
        class220.method1383(-88);
        class395.method2461(16383);
        class313.method1948((byte) -90);
        class453.method2659((byte) 120);
        class249.method1514(-95);
        class677.method3795(3);
        class193.method1256(-120);
        class682.method3823(-43);
        class390.method2405(90);
        class568.method3274((byte) -116);
        class232.method1438((byte) 40);
        class591.method3369(true);
        class606.method3463((byte) 74);
        class620.method3569((byte) 94);
        class334.method2043(116);
        class181.method1217(-123);
        class538.method3105(53);
        class617.method3556(-100);
        class22.method144(-83);
        class501.method2858((byte) -65);
        class268.method1603((byte) -17);
        class572.method3289(-1);
        class553.method3220(8069);
        class473.method2723(false);
        class580.method3333((byte) 91);
        class512.method2901(25);
        class175.method1198(-3752);
        class80.method463((byte) 106);
        class134.method959((byte) -106);
        class48.method289(0);
        class474.method2731(2);
        class341.method2114(false);
        class420.method2544((byte) 93);
        class475.method2733((byte) 111);
        class595.method3388(108);
        class197.method1286(0);
        class55.method331();
        class575.method3314(false);
        class124.method896(true);
        class222.method1391((byte) -68);
        class623.method3588(95);
        class79.method460(16985);
        class545.method3195(-101);
        class305.method1918(64);
        class218.method1376(95);
        class62.method386(100);
        class343.method2123(true);
        class16.method115();
        class589.method3361(-85);
        class665.method3736(46);
        class608.method3474((byte) -112);
        class641.method3653((byte) -121);
        class422.method2555(6407);
        class195.method1271();
        class561.method3249((byte) 117);
        class194.method1258((byte) -41);
        class656.method3703(20048);
        class421.method2551();
        class697.method3918(123);
        class348.method2163(3);
        class327.method2021(-11);
        class510.method2895((byte) 123);
        class303.method1912(false);
        class653.method3695(512);
        class97.method602(true);
        class597.method3402(false);
        class310.method1933(-16477);
        class471.method2714(-75);
        class486.method2776(125);
        class518.method2930(true);
        class306.method1919(0);
        class332.method2041(13);
        class391.method2422((byte) -118);
        class361.method2220(12);
        class425.method2560(-21482);
        class130.method924();
        class30.method190(-3);
        class586.method3351((byte) -122);
        class484.method2767(6703);
        class639.method3646((byte) 122);
        class333.method2042();
        class211.method1335(117);
        class144.method999(-97);
        class684.method3835(117);
        class525.method2978((byte) 123);
        class15.method106(true);
        class539.method3106((byte) -84);
        class65.method393(0);
        class137.method969();
        class272.method1626((byte) -127);
        class143.method998((byte) 117);
        class335.method2056((byte) 127);
        class520.method2936((byte) -115);
        class389.method2397((byte) 118);
        class350.method2165(1);
        class434.method2580((byte) 127);
        class278.method1647(118);
        class554.method3222((byte) -101);
        class49.method294(127);
        class112.method843(-1);
        class696.method3911(87);
        class612.method3485(-1);
        class661.method3718((byte) 111);
        class582.method3340((byte) -102);
        class154.method1099(-1);
        class185.method1233((byte) 73);
        class246.method1501(-83);
        class261.method1572((byte) 102);
        class562.method3251((byte) 111);
        class537.method3095(-69);
        class699.method3922((byte) -102);
        class668.method3747(2);
        class234.method1444(15);
        class212.method1346(true);
        class273.method1628(124);
        class647.method3684(120);
        class417.method2535(true);
        class155.method1108((byte) -84);
        class202.method1310(false);
        class685.method3840((byte) 62);
        class230.method1431((byte) 126);
        class379.method2347(-48);
        class139.method982((byte) 89);
        class574.method3305(18008);
        class365.method2236(true);
        class683.method3827(false);
        class505.method2875((byte) 115);
        class145.method1005((byte) -120);
        class251.method1518(-67);
        class441.method2608((byte) -10);
        class403.method2490((byte) -100);
        class231.method1433(-113);
        class508.method2887(68);
        class96.method600(11);
        class543.method3189(102);
        class457.method2675(-121);
        class414.method2526((byte) 101);
        class237.method1462(3277);
        class369.method2278((byte) -89);
        class579.method3325((byte) 59);
        class203.method1313((byte) 126);
        class45.method257(-102);
        class250.method1516(82);
        class244.method1494((byte) 65);
        class54.method326(0);
        class72.method423(13097);
        class63.method389(-8474);
        class519.method2934(93);
        class452.method2655((byte) 85);
        class27.method175((byte) -71);
        class262.method1578(121);
        class299.method1865(0);
        class628.method3612();
        class7.method41(8788);
        class23.method157((byte) -116);
        class275.method1633((byte) -42);
        class652.method3689(118);
        class454.method2664(-22386);
        class68.method399(4);
        class188.method1241(1);
        class264.method1583((byte) 108);
        class187.method1239(-90);
        class46.method260(119);
        class468.method2699((byte) 97);
        class258.method1541(-99);
        class259.method1546(-104);
        class444.method2624((byte) 126);
        class464.method2691(-1);
        class110.method837();
        class637.method3640((byte) 126);
        class12.method81(-123);
        class599.method3410();
        class31.method198();
        class526.method2982((byte) 116);
        class91.method506((byte) -87);
        class33.method201();
        class507.method2880(-2000);
        class642.method3655(-127);
        class164.method1158(-101);
        class57.method361(124);
        class221.method1387(16383);
        class631.method3626(34);
        class556.method3231((byte) 98);
        class478.method2742(-4015);
        class223.method1393((byte) 106);
        class357.method2203((byte) 1);
        class132.method943(false);
        class283.method1675((byte) -128);
        class701.method3933(32520);
        class378.method2335((byte) -96);
        class191.method1252(100);
        class594.method3383((byte) 66);
        class156.method1117();
        class329.method2026((byte) 65);
        class424.method2559((byte) -90);
        class204.method1318((byte) -95);
        class29.method185(-51);
        class169.method1182((byte) -87);
        class274.method1629(false);
        class638.method3643(false);
        class640.method3649(75);
        class298.method1861(-21661);
        class150.method1072(-109);
        class406.method2500((byte) 4);
        class542.method3185((byte) -62);
        class433.method2577(true);
        class85.method483(-115);
        class90.method501((byte) -102);
        class552.method3217((byte) -104);
        class56.method351((byte) 76);
        class287.method1769(256);
        class610.method3481(0);
        class58.method364((byte) 64);
        class43.method243(0);
        class362.method2222(16111);
        class573.method3291((byte) -82);
        class196.method1280(29571);
        class117.method863(7);
        class503.method2867(1);
        class517.method2923(-102);
        class340.method2100(true);
        class39.method222(false);
        class449.method2649(-1480066456);
        class528.method3040(121);
        class455.method2666(16);
        class106.method751(100);
        class300.method1882(-73);
        class324.method2009((byte) -128);
        class619.method3564(-121);
        class141.method989(-1);
        class353.method2194((byte) -108);
        class551.method3216(-1);
        class476.method2738(1);
        class314.method1950(1436353504);
        class375.method2309(-5032);
        class149.method1065((byte) -113);
        class529.method3071((byte) -119);
        class157.method1124(true);
        class388.method2393(-62);
        class700.method3925(-3686);
        class386.method2379(2);
        class363.method2226();
        class613.method3489(-96);
        class297.method1853((byte) -27);
        class41.method238((byte) 100);
        class111.method839(true);
        class309.method1927(18740);
        class405.method2493(1);
        class401.method2485(0);
        class428.method2567((byte) 121);
        class492.method2817(101);
        class504.method2869(4);
        class643.method3663(-121);
        class634.method3634(-1024);
        class587.method3353(true);
        class496.method2832(0);
        class115.method858(-13697);
        class460.method2679(false);
        class183.method1224(126);
        class635.method3636((byte) 27);
        class380.method2356(-849780020);
        class394.method2451(0);
        class125.method899(-30839);
        class239.method1473(0);
        class645.method3674((byte) -26);
        class66.method397(false);
        class584.method3345((byte) -27);
        class625.method3596(4096);
        class630.method3623((byte) 123);
        class189.method1247((byte) -9);
        class555.method3226((byte) 59);
        class1.method4((byte) -114);
        class252.method1522((byte) 127);
        class207.method1329();
        class368.method2249();
        class92.method510((byte) -99);
        class296.method1852(false);
        class326.method2015(4806);
        class550.method3208(25454);
        class152.method1084(1);
        class588.method3354(-120);
        class436.method2590((byte) 91);
        class267.method1600(0);
        class276.method1635(-595);
        class398.method2474((byte) -75);
        class170.method1183((byte) 58);
        class160.method1138((byte) -109);
        class330.method2038(8211);
        class563.method3252(-21590);
        class495.method2827((byte) -113);
        class59.method370((byte) -1);
        class20.method136(1);
        class544.method3191(6);
        class245.method1496(8226);
        class442.method2612(-13094);
        class423.method2557(126);
        class18.method124(-12081);
        class627.method3610((byte) -75);
        class527.method2983((byte) -128);
        class657.method3707(-126);
        class546.method3197(107);
        class443.method2617(false);
        class148.method1063(-6);
        class502.method2861(0);
        class13.method90(2199);
        class280.method1656(109);
        class356.method2199(-473338320);
        class129.method920(7749);
        class288.method1772((byte) -72);
        class600.method3412(83);
        class238.method1468(-9456);
        class103.method738((byte) -127);
        class240.method1479((byte) -3);
        class392.method2430((byte) 57);
        class284.method1680(-11427);
        class8.method54(9029);
        class571.method3279(-113);
        class351.method2172(-128);
        class607.method3471(541404965);
        class81.method465(-1);
        class142.method995(31);
        class479.method2747(49);
        class86.method489((byte) 85);
        class243.method1493(1024);
        class618.method3562(2152);
        class372.method2294((byte) 94);
        class270.method1617(32);
        class629.method3621(0);
        class466.method2696(7006);
        class487.method2782(124);
        class119.method871(-112);
        class445.method2633(1);
        class323.method2006(-25);
        class399.method2476((byte) -112);
        class224.method1398(124);
        class451.method2652(true);
        class205.method1319(34336);
        class583.method3344((byte) 123);
        class257.method1539(32530);
        class557.method3234((byte) -77);
        class6.method37((byte) 98);
        class338.method2091((byte) 35);
        class186.method1236(31984);
        class693.method3905(14700);
        class308.method1925(-17655);
        int var2 = -2 % ((15 - arg0) / 56);
        class216.method1367(1);
        class25.method170((byte) 17);
        class263.method1581((byte) -119);
        class522.method2952((byte) 104);
        class549.method3205(Integer.MAX_VALUE);
        class581.method3337((byte) 120);
        class592.method3371((byte) -54);
        class217.method1370(50);
        class209.method1334((byte) -79);
        class147.method1059(0);
        class374.method2303(-101);
        class42.method239((byte) 125);
        class456.method2669(255);
        class426.method2565(46);
        class74.method428(-1);
        class51.method302(-9218);
        class118.method870(-118);
        class470.method2711(19);
        class687.method3849((byte) -109);
        class694.method3909((byte) -11);
        class412.method2519(-10581);
        class64.method391((byte) -82);
        class235.method1446((byte) -124);
        class178.method1212((byte) -3);
        class485.method2770(2);
        class408.method2502(-36056599);
        class497.method2833(true);
        class325.method2010(true);
        class446.method2642(30);
        class229.method1429((byte) -10);
        class109.method822((byte) -7);
        class24.method166(115);
        class410.method2514(108);
        class409.method2511((byte) -24);
        class461.method2685(2);
        class624.method3593(-12393);
        class509.method2890((byte) 125);
        class35.method206(29616);
        class352.method2187((byte) 77);
        class248.method1509((byte) -108);
        if (class281.field3753) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 493)
    private final void method560(boolean arg0) {
        field1432++;
        if (class212.field2856.field7064 > class116.field1740) {
            class684.field9654.method729(31292);
            class299.field4395 = (class212.field2856.field7064 * 50 - 50) * 5;
            if (class299.field4395 > 3000) {
                class299.field4395 = 3000;
            }
            if (class212.field2856.field7064 >= 2 && class212.field2856.field7063 == 6) {
                this.method1665(!arg0, "js5connect_outofdate");
                class264.field3451 = 14;
                return;
            }
            if (class212.field2856.field7064 >= 4 && class212.field2856.field7063 == -1) {
                this.method1665(true, "js5crc");
                class264.field3451 = 14;
                return;
            }
            if (class212.field2856.field7064 >= 4 && class497.method2834((byte) 120, class264.field3451)) {
                if (class212.field2856.field7063 == 7 || class212.field2856.field7063 == 9) {
                    this.method1665(true, "js5connect_full");
                } else if (class212.field2856.field7063 <= 0) {
                    this.method1665(true, "js5io");
                } else if (class375.field5658 == null) {
                    this.method1665(true, "js5connect");
                } else {
                    this.method1665(true, "js5proxy_" + class375.field5658.trim());
                }
                class264.field3451 = 14;
                return;
            }
        }
        class116.field1740 = class212.field2856.field7064;
        if (class299.field4395 > 0) {
            class299.field4395--;
            return;
        }
        try {
            if (class43.field641 == 0) {
                class582.field8466 = class684.field9654.method733(443, class61.field978);
                class43.field641++;
            }
            if (class43.field641 == 1) {
                if (class582.field8466.field3311 == 2) {
                    if (class582.field8466.field3307 != null) {
                        class375.field5658 = (String) class582.field8466.field3307;
                    }
                    this.method583(1000, (byte) 112);
                    return;
                }
                if (class582.field8466.field3311 == 1) {
                    class43.field641++;
                }
            }
            if (class43.field641 == 2) {
                class410.field6103 = new class347((Socket) class582.field8466.field3307, class61.field978, 25000);
                class540 var2 = new class540(5);
                var2.method3110(class196.field2670.field9823, 103);
                var2.method3146(627, 117);
                class410.field6103.method2155(var2.field7952, -31137, 0, 5);
                class43.field641++;
                class325.field4714 = class60.method371(false);
            }
            if (class43.field641 == 3) {
                if (class497.method2834((byte) 115, class264.field3451) || class410.field6103.method2157(!arg0) > 0) {
                    int var3 = class410.field6103.method2151(false);
                    if (var3 != 0) {
                        this.method583(var3, (byte) 112);
                        return;
                    }
                    class43.field641++;
                } else if ((class60.method371(false) - class325.field4714) > 30000L) {
                    this.method583(1001, (byte) 112);
                    return;
                }
            }
            if (class43.field641 == 4) {
                boolean var4 = class497.method2834((byte) 118, class264.field3451) || class591.method3368(class264.field3451, 26386) || class261.method1566((byte) 5, class264.field3451);
                class541[] var5 = class541.method3180(-1);
                class540 var6 = new class540(var5.length * 4);
                class410.field6103.method2162((byte) 1, var6.field7952, 0, var6.field7952.length);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method3177(var6.method3160(false), (byte) 57);
                }
                class212.field2856.method2841(-87, !var4, class410.field6103);
                class582.field8466 = null;
                class410.field6103 = null;
                class43.field641 = 0;
            }
        } catch (IOException var8) {
            this.method583(1002, (byte) 112);
        }
        if (arg0) {
            this.method575(58);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrg;BZ)V", line = 662)
    public static final void method561(class523 arg0, byte arg1, boolean arg2) {
        if (arg1 <= 70) {
            method563(83);
        }
        field1435++;
        class589 var3 = arg0.method2957(true);
        if (arg0.field7436 == 0) {
            arg0.field7432 = 0;
            class391.field5909 = 0;
            class309.field4559 = -1;
            return;
        }
        if (arg0.field7389 != -1 && arg0.field7392 == 0) {
            class47 var4 = class203.field2769.method2971(-85, arg0.field7389);
            if (arg0.field7434 > 0 && var4.field731 == 0) {
                arg0.field7432++;
                class309.field4559 = -1;
                class391.field5909 = 0;
                return;
            }
            if (arg0.field7434 <= 0 && var4.field744 == 0) {
                arg0.field7432++;
                class309.field4559 = -1;
                class391.field5909 = 0;
                return;
            }
        }
        if (arg0.field7360 != -1 && arg0.field7401 <= class45.field685) {
            class525 var5 = class134.field1945.method3082((byte) 50, arg0.field7360);
            if (var5.field7470 && var5.field7457 != -1) {
                class47 var6 = class203.field2769.method2971(-71, var5.field7457);
                if (arg0.field7434 > 0 && var6.field731 == 0) {
                    class391.field5909 = 0;
                    arg0.field7432++;
                    class309.field4559 = -1;
                    return;
                }
                if (arg0.field7434 <= 0 && var6.field744 == 0) {
                    class309.field4559 = -1;
                    class391.field5909 = 0;
                    arg0.field7432++;
                    return;
                }
            }
        }
        if (arg0.field7360 != -1 && class45.field685 >= arg0.field7401) {
            class525 var7 = class134.field1945.method3082((byte) 50, arg0.field7360);
            if (var7.field7470 && var7.field7457 != -1) {
                class47 var8 = class203.field2769.method2971(-97, var7.field7457);
                if (arg0.field7434 > 0 && var8.field731 == 0) {
                    class391.field5909 = 0;
                    class309.field4559 = -1;
                    arg0.field7432++;
                    return;
                }
                if (arg0.field7434 <= 0 && var8.field744 == 0) {
                    arg0.field7432++;
                    class391.field5909 = 0;
                    class309.field4559 = -1;
                    return;
                }
            }
        }
        int var9 = arg0.field7895;
        int var10 = arg0.field7896;
        int var11 = arg0.field7430[arg0.field7436 - 1] * 512 + arg0.method422((byte) -63) * 256;
        int var12 = arg0.field7429[arg0.field7436 - 1] * 512 + (arg0.method422((byte) 53) * 256);
        if (var9 >= var11) {
            if (var11 < var9) {
                if (var10 < var12) {
                    arg0.method2954((byte) -98, 6144);
                } else if (var12 >= var10) {
                    arg0.method2954((byte) 78, 4096);
                } else {
                    arg0.method2954((byte) -85, 2048);
                }
            } else if (var12 > var10) {
                arg0.method2954((byte) 107, 8192);
            } else if (var10 > var12) {
                arg0.method2954((byte) 112, 0);
            }
        } else if (var12 > var10) {
            arg0.method2954((byte) -99, 10240);
        } else if (var12 < var10) {
            arg0.method2954((byte) 117, 14336);
        } else {
            arg0.method2954((byte) 59, 12288);
        }
        byte var13 = arg0.field7439[arg0.field7436 - 1];
        if (!arg2 && (var11 - var9 > 1024 || var11 - var9 < -1024 || var12 - var10 > 1024 || var12 - var10 < -1024)) {
            arg0.field7896 = var12;
            arg0.field7895 = var11;
            arg0.method2956(arg0.field7333, false, -12);
            class391.field5909 = 0;
            if (arg0.field7434 > 0) {
                arg0.field7434--;
            }
            arg0.field7436--;
            class309.field4559 = -1;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg0 instanceof class53) {
            var15 = ((class53) arg0).field805.field1176;
        }
        if (var15) {
            int var16 = arg0.field7333 - arg0.field7349.field5078;
            if (var16 != 0 && arg0.field7423 == -1 && arg0.field7390 != 0) {
                var14 = 8;
            }
            if (!arg2 && arg0.field7436 > 2) {
                var14 = 24;
            }
            if (!arg2 && arg0.field7436 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg2 && arg0.field7436 > 1) {
                var14 = 24;
            }
            if (!arg2 && arg0.field7436 > 2) {
                var14 = 32;
            }
        }
        if (arg0.field7432 > 0 && arg0.field7436 > 1) {
            arg0.field7432--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field8535 != -1) {
            int var17 = var14 << 9;
            if (arg0.field7436 == 1) {
                int var18 = arg0.field7433 * arg0.field7433;
                int var19 = (arg0.field7895 > var11 ? arg0.field7895 - var11 : -arg0.field7895 + var11) << 9;
                int var20 = (var12 >= arg0.field7896 ? var12 - arg0.field7896 : -var12 + arg0.field7896) << 9;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field8535 * 2 * var21;
                if (var18 > var22) {
                    arg0.field7433 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg0.field7433 -= var3.field8535;
                    if (arg0.field7433 < 0) {
                        arg0.field7433 = 0;
                    }
                } else if (arg0.field7433 < var17) {
                    arg0.field7433 += var3.field8535;
                    if (arg0.field7433 > var17) {
                        arg0.field7433 = var17;
                    }
                }
            } else if (arg0.field7433 < var17) {
                arg0.field7433 += var3.field8535;
                if (var17 < arg0.field7433) {
                    arg0.field7433 = var17;
                }
            } else if (arg0.field7433 > 0) {
                arg0.field7433 -= var3.field8535;
                if (arg0.field7433 < 0) {
                    arg0.field7433 = 0;
                }
            }
            var14 = arg0.field7433 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class391.field5909 = 0;
        if (var9 == var11 && var10 == var12) {
            class309.field4559 = -1;
        } else {
            if (var9 < var11) {
                class391.field5909 |= 0x4;
                arg0.field7895 += var14;
                if (var11 < arg0.field7895) {
                    arg0.field7895 = var11;
                }
            } else if (var9 > var11) {
                class391.field5909 |= 0x8;
                arg0.field7895 -= var14;
                if (arg0.field7895 < var11) {
                    arg0.field7895 = var11;
                }
            }
            if (var14 < 32) {
                class309.field4559 = var13;
            } else {
                class309.field4559 = 2;
            }
            if (var10 < var12) {
                class391.field5909 |= 0x1;
                arg0.field7896 += var14;
                if (var12 < arg0.field7896) {
                    arg0.field7896 = var12;
                }
            } else if (var10 > var12) {
                arg0.field7896 -= var14;
                class391.field5909 |= 0x2;
                if (var12 > arg0.field7896) {
                    arg0.field7896 = var12;
                }
            }
        }
        if (arg0.field7895 != var11 || arg0.field7896 != var12) {
            return;
        }
        arg0.field7436--;
        if (arg0.field7434 > 0) {
            arg0.field7434--;
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1011)
    public static final void method562() {
        int var0 = class416.field6150;
        int[] var1 = class35.field554;
        int var2 = class263.field3411 ? var0 : class155.field2213 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class523 var4;
            if (var3 < var0) {
                var4 = class35.field551[var1[var3]];
            } else {
                var4 = ((class177) class271.field3550.method2002((byte) -126, (long) class523.field7379[var3 - var0])).field2476;
            }
            if (var4.field7394 >= 0) {
                int var5 = var4.method422((byte) -54);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field7895 & 0x1FF) == 0 && (var4.field7896 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field7895 & 0x1FF) == 256 && (var4.field7896 & 0x1FF) == 256) {
                    continue;
                }
                var4.field7894 = class504.method2870((byte) -120, var4.field7896, var4.field7895, var4.field7905);
                class591.method3367(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1053)
    public static final void method563(int arg0) {
        int var1 = class416.field6150;
        int[] var2 = class35.field554;
        for (int var3 = 0; var3 < class155.field2213 + var1; var3++) {
            class523 var4;
            if (var3 < var1) {
                var4 = class35.field551[var2[var3]];
            } else {
                var4 = ((class177) class271.field3550.method2002((byte) -118, (long) class523.field7379[var3 - var1])).field2476;
            }
            if (var4.field7905 == arg0 && var4.field7394 >= 0) {
                int var5 = var4.method422((byte) -55);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field7895 & 0x1FF) != 0 || (var4.field7896 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field7895 & 0x1FF) != 256 || (var4.field7896 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field7895 >> 9;
                    int var7 = var4.field7896 >> 9;
                    if (var4.field7394 > class607.field8780[var6][var7]) {
                        class607.field8780[var6][var7] = var4.field7394;
                        class668.field9446[var6][var7] = 1;
                    } else if (class607.field8780[var6][var7] == var4.field7394) {
                        var10002 = class668.field9446[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field7895 - var8 >> 9;
                    int var10 = var4.field7896 - var8 >> 9;
                    int var11 = var4.field7895 + var8 >> 9;
                    int var12 = var4.field7896 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field7394 > class607.field8780[var13][var14]) {
                                class607.field8780[var13][var14] = var4.field7394;
                                class668.field9446[var13][var14] = 1;
                            } else if (class607.field8780[var13][var14] == var4.field7394) {
                                var10002 = class668.field9446[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lps;)Liga;", line = 1151)
    public static final class78 method564(class5 arg0) {
        class78 var1 = (class78) class584.field8483.method2002((byte) -115, ((long) arg0.field65 << 32) + (long) arg0.field53);
        return var1 == null ? arg0.field128 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lps;IIIIIIIII)V", line = 1159)
    public static final void method565(class5[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class5 var11 = arg0[var10];
            if (var11 != null && var11.field87 == arg1) {
                int var12 = var11.field80 + arg6;
                int var13 = var11.field150 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field172 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field202 + var12;
                    int var19 = var11.field76 + var13;
                    if (var11.field172 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field172 == 0 || var11.field71 || method564(var11).field1275 != 0 || class272.field3554 == var11 || class317.field4618 == var11.field96 || class395.field5984 == var11.field96) {
                    if (!method569(var11)) {
                        if (class188.field2561 == var11 && class473.method2724(124, class188.field2561) != null) {
                            class361.field5296 = true;
                            class183.field2515 = var12;
                            class422.field6196 = var13;
                        }
                        if (var11.field50 || var14 < var16 && var15 < var17) {
                            if (var11.field91 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class303 var20 = (class303) class625.field9038.method1904(false); var20 != null; var20 = (class303) class625.field9038.method1901(113)) {
                                    if (var20.field4505) {
                                        var20.method2360((byte) 66);
                                        var20.field4499.field174 = false;
                                    }
                                }
                                if (class323.field4703 == 0) {
                                    class188.field2561 = null;
                                    class272.field3554 = null;
                                }
                                class393.field5949 = 0;
                                class22.field401 = false;
                                class625.field9043 = false;
                                if (!class683.field9638) {
                                    class542.method3187(-115);
                                }
                            }
                            boolean var21;
                            if (class315.field4612.method2340(40960) >= var14 && class315.field4612.method2338((byte) 84) >= var15 && class315.field4612.method2340(40960) < var16 && class315.field4612.method2338((byte) 59) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class240.field3164 && var21) {
                                if (var11.field197 >= 0) {
                                    class222.field2943 = var11.field197;
                                } else if (var11.field91) {
                                    class222.field2943 = -1;
                                }
                            }
                            if (!class683.field9638 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class575.method3313(-100, arg8 - var12, arg9 - var13, var11);
                            }
                            boolean var22 = false;
                            if (class315.field4612.method2337(-57) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class147 var24 = (class147) class430.field6262.method1904(false);
                            if (var24 != null && var24.method479((byte) 41) == 0 && var24.method478(0) >= var14 && var24.method475(-2) >= var15 && var24.method478(0) < var16 && var24.method475(-2) < var17) {
                                var23 = true;
                            }
                            if (var11.field72 != null && !class291.method1796(true)) {
                                for (int var25 = 0; var25 < var11.field72.length; var25++) {
                                    if (class18.field362.method1609(var11.field72[var25], -27453)) {
                                        if (var11.field48 == null || class45.field685 >= var11.field48[var25]) {
                                            byte var26 = var11.field98[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class18.field362.method1609(86, -27453) && !class18.field362.method1609(82, -27453) && !class18.field362.method1609(81, -27453)) && ((var26 & 0x2) == 0 || class18.field362.method1609(86, -27453)) && ((var26 & 0x1) == 0 || class18.field362.method1609(82, -27453)) && ((var26 & 0x4) == 0 || class18.field362.method1609(81, -27453))) {
                                                if (var25 < 10) {
                                                    class485.method2771(var11.field65, "", var25 + 1, 104, -1);
                                                } else if (var25 == 10) {
                                                    class541.method3183(1);
                                                    class78 var27 = method564(var11);
                                                    class446.method2638(6, var27.method452(16711680), var11, var27.field1272);
                                                    class697.field9824 = class234.method1443(127, var11);
                                                    if (class697.field9824 == null) {
                                                        class697.field9824 = "Null";
                                                    }
                                                    class372.field5508 = var11.field119 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field94[var25];
                                                if (var11.field48 == null) {
                                                    var11.field48 = new int[var11.field72.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field48[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field48[var25] = class45.field685 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field48 != null) {
                                        var11.field48[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class529.method3070(var11, var24.method478(0) - var12, 88, var24.method475(-2) - var13);
                            }
                            if (class188.field2561 != null && class188.field2561 != var11 && var21 && method564(var11).method449((byte) 123)) {
                                class403.field6050 = var11;
                            }
                            if (class272.field3554 == var11) {
                                class603.field8716 = true;
                                class371.field5495 = var12;
                                class697.field9821 = var13;
                            }
                            if (var11.field71 || var11.field96 != 0) {
                                if (var21 && class623.field9013 != 0 && var11.field135 != null) {
                                    class303 var29 = new class303();
                                    var29.field4505 = true;
                                    var29.field4499 = var11;
                                    var29.field4503 = class623.field9013;
                                    var29.field4500 = var11.field135;
                                    class625.field9038.method1909(var29, (byte) -81);
                                }
                                if (class188.field2561 != null || class683.field9638 || class164.field2306 != var11.field96 && class393.field5949 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field96 != 0) {
                                    if (class188.field2535 == var11.field96 || class556.field8169 == var11.field96) {
                                        class94.field1453 = var11;
                                        if (class383.field5750 != null) {
                                            class383.field5750.method1977((byte) 90, var11.field76, class332.field4821);
                                        }
                                        if (class188.field2535 == var11.field96) {
                                            if (!class683.field9638 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class380.method2357(arg9, class332.field4821, arg8, -126);
                                                for (class562 var30 = (class562) class118.field1765.method2370(-26173); var30 != null; var30 = (class562) class118.field1765.method2369((byte) 127)) {
                                                    if (arg8 >= var30.field8225 && arg8 < var30.field8223 && arg9 >= var30.field8222 && arg9 < var30.field8224) {
                                                        class542.method3187(-107);
                                                        class169.method1178(var30.field8220, 89);
                                                    }
                                                }
                                            }
                                            class569.method3276(var12, var11, true, var13);
                                            continue;
                                        }
                                    }
                                    if (class317.field4618 == var11.field96) {
                                        if (var11.method18(class332.field4821, (byte) 68) == null || class65.field1038 != 0 && class65.field1038 != 3 || class683.field9638 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field200[var32];
                                        if (var31 < var33 || var31 > var11.field154[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field202 / 2;
                                        int var35 = var32 - var11.field76 / 2;
                                        int var36;
                                        if (class684.field9659 == 4) {
                                            var36 = (int) class311.field4589 & 0x3FFF;
                                        } else {
                                            var36 = (int) class311.field4589 + class53.field817 & 0x3FFF;
                                        }
                                        int var37 = class271.field3549[var36];
                                        int var38 = class271.field3544[var36];
                                        if (class684.field9659 != 4) {
                                            var37 = (class697.field9826 + 256) * var37 >> 8;
                                            var38 = (class697.field9826 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class684.field9659 == 4) {
                                            var41 = (class475.field6814 >> 9) + (var39 >> 2);
                                            var42 = (class35.field550 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class321.field4681.method422((byte) -52) - 1) * 256;
                                            var41 = (class321.field4681.field7895 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class321.field4681.field7896 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class240.field3164 && (class282.field3771 & 0x40) != 0) {
                                            class5 var44 = class194.method1261(class412.field6116, class492.field7003, 6);
                                            if (var44 == null) {
                                                class541.method3183(1);
                                            } else {
                                                class621.method3581(class697.field9824, var42, 57, 1L, var41, (byte) 127, " ->", false, var11.field59, class142.field2061, true);
                                            }
                                            continue;
                                        }
                                        if (class478.field6840 == class132.field1922) {
                                            class621.method3581(class279.field3652.method1654(126, class262.field3401), var42, 17, 1L, var41, (byte) 127, "", false, -1, -1, true);
                                        }
                                        class621.method3581(class365.field5356, var42, 10, 1L, var41, (byte) 127, "", false, -1, class132.field1924, true);
                                        continue;
                                    }
                                    if (class164.field2306 == var11.field96) {
                                        class574.field8343 = var11;
                                        if (var21) {
                                            class22.field401 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method478(0) - var12 - var11.field202 / 2) * 2.0D / (double) class55.field844);
                                            int var46 = (int) (-((double) (var24.method475(-2) - var13 - var11.field76 / 2) * 2.0D / (double) class55.field844));
                                            int var47 = class108.field1617 + var45 + class55.field865;
                                            int var48 = class19.field375 + var46 + class55.field866;
                                            class604 var49 = class394.method2452((byte) -81);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method3447(var50, var48, var47, -6038);
                                            if (var50 != null) {
                                                if (class18.field362.method1609(82, -27453) && class248.field3272 > 0) {
                                                    class164.method1160(70, var50[1], var50[0], var50[2]);
                                                    continue;
                                                }
                                                class625.field9043 = true;
                                                class59.field961 = var50[0];
                                                class609.field8810 = var50[1];
                                                class330.field4793 = var50[2];
                                            }
                                            class393.field5949 = 1;
                                            class657.field9384 = false;
                                            class230.field3048 = class315.field4612.method2340(40960);
                                            class581.field8459 = class315.field4612.method2338((byte) -67);
                                            continue;
                                        }
                                        if (var22 && class393.field5949 > 0) {
                                            if (class393.field5949 == 1 && (class230.field3048 != class315.field4612.method2340(40960) || class581.field8459 != class315.field4612.method2338((byte) 89))) {
                                                class348.field5158 = class108.field1617;
                                                class302.field4490 = class19.field375;
                                                class393.field5949 = 2;
                                            }
                                            if (class393.field5949 == 2) {
                                                class657.field9384 = true;
                                                class265.method1592((byte) 104, class348.field5158 + (int) ((double) (class230.field3048 - class315.field4612.method2340(40960)) * 2.0D / (double) class55.field842));
                                                class150.method1069(class302.field4490 - (int) ((double) (class581.field8459 - class315.field4612.method2338((byte) 126)) * 2.0D / (double) class55.field842), (byte) 94);
                                            }
                                            continue;
                                        }
                                        if (class393.field5949 > 0 && !class657.field9384) {
                                            if ((class342.field5060 == 1 || class221.method1388((byte) -47)) && class373.field5520 > 2) {
                                                class410.method2515(class581.field8459, class230.field3048, true);
                                            } else if (class682.method3821((byte) 85)) {
                                                class410.method2515(class581.field8459, class230.field3048, true);
                                            }
                                        }
                                        class393.field5949 = 0;
                                        continue;
                                    }
                                    if (class457.field6592 == var11.field96) {
                                        if (var22) {
                                            class314.method1951(var11.field202, class315.field4612.method2340(40960) - var12, var11.field76, 15081, class315.field4612.method2338((byte) -98) - var13);
                                        }
                                        continue;
                                    }
                                    if (class395.field5984 == var11.field96) {
                                        class436.method2591(var11, var12, (byte) -72, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field92 && var23) {
                                    var11.field92 = true;
                                    if (var11.field67 != null) {
                                        class303 var51 = new class303();
                                        var51.field4505 = true;
                                        var51.field4499 = var11;
                                        var51.field4507 = var24.method478(0) - var12;
                                        var51.field4503 = var24.method475(-2) - var13;
                                        var51.field4500 = var11.field67;
                                        class625.field9038.method1909(var51, (byte) -81);
                                    }
                                }
                                if (var11.field92 && var22 && var11.field95 != null) {
                                    class303 var52 = new class303();
                                    var52.field4505 = true;
                                    var52.field4499 = var11;
                                    var52.field4507 = class315.field4612.method2340(40960) - var12;
                                    var52.field4503 = class315.field4612.method2338((byte) 122) - var13;
                                    var52.field4500 = var11.field95;
                                    class625.field9038.method1909(var52, (byte) -81);
                                }
                                if (var11.field92 && !var22) {
                                    var11.field92 = false;
                                    if (var11.field121 != null) {
                                        class303 var53 = new class303();
                                        var53.field4505 = true;
                                        var53.field4499 = var11;
                                        var53.field4507 = class315.field4612.method2340(40960) - var12;
                                        var53.field4503 = class315.field4612.method2338((byte) 53) - var13;
                                        var53.field4500 = var11.field121;
                                        class389.field5826.method1909(var53, (byte) -81);
                                    }
                                }
                                if (var22 && var11.field113 != null) {
                                    class303 var54 = new class303();
                                    var54.field4505 = true;
                                    var54.field4499 = var11;
                                    var54.field4507 = class315.field4612.method2340(40960) - var12;
                                    var54.field4503 = class315.field4612.method2338((byte) -114) - var13;
                                    var54.field4500 = var11.field113;
                                    class625.field9038.method1909(var54, (byte) -81);
                                }
                                if (!var11.field174 && var21) {
                                    var11.field174 = true;
                                    if (var11.field123 != null) {
                                        class303 var55 = new class303();
                                        var55.field4505 = true;
                                        var55.field4499 = var11;
                                        var55.field4507 = class315.field4612.method2340(40960) - var12;
                                        var55.field4503 = class315.field4612.method2338((byte) -93) - var13;
                                        var55.field4500 = var11.field123;
                                        class625.field9038.method1909(var55, (byte) -81);
                                    }
                                }
                                if (var11.field174 && var21 && var11.field184 != null) {
                                    class303 var56 = new class303();
                                    var56.field4505 = true;
                                    var56.field4499 = var11;
                                    var56.field4507 = class315.field4612.method2340(40960) - var12;
                                    var56.field4503 = class315.field4612.method2338((byte) -80) - var13;
                                    var56.field4500 = var11.field184;
                                    class625.field9038.method1909(var56, (byte) -81);
                                }
                                if (var11.field174 && !var21) {
                                    var11.field174 = false;
                                    if (var11.field66 != null) {
                                        class303 var57 = new class303();
                                        var57.field4505 = true;
                                        var57.field4499 = var11;
                                        var57.field4507 = class315.field4612.method2340(40960) - var12;
                                        var57.field4503 = class315.field4612.method2338((byte) -76) - var13;
                                        var57.field4500 = var11.field66;
                                        class389.field5826.method1909(var57, (byte) -81);
                                    }
                                }
                                if (var11.field118 != null) {
                                    class303 var58 = new class303();
                                    var58.field4499 = var11;
                                    var58.field4500 = var11.field118;
                                    class296.field4361.method1909(var58, (byte) -81);
                                }
                                if (var11.field68 != null && class309.field4563 > var11.field192) {
                                    if (var11.field198 == null || class309.field4563 - var11.field192 > 32) {
                                        class303 var63 = new class303();
                                        var63.field4499 = var11;
                                        var63.field4500 = var11.field68;
                                        class625.field9038.method1909(var63, (byte) -81);
                                    } else {
                                        label696: for (int var59 = var11.field192; var59 < class309.field4563; var59++) {
                                            int var60 = class23.field437[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field198.length; var61++) {
                                                if (var11.field198[var61] == var60) {
                                                    class303 var62 = new class303();
                                                    var62.field4499 = var11;
                                                    var62.field4500 = var11.field68;
                                                    class625.field9038.method1909(var62, (byte) -81);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field192 = class309.field4563;
                                }
                                if (var11.field85 != null && class32.field538 > var11.field63) {
                                    if (var11.field206 == null || class32.field538 - var11.field63 > 32) {
                                        class303 var68 = new class303();
                                        var68.field4499 = var11;
                                        var68.field4500 = var11.field85;
                                        class625.field9038.method1909(var68, (byte) -81);
                                    } else {
                                        label672: for (int var64 = var11.field63; var64 < class32.field538; var64++) {
                                            int var65 = class454.field6554[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field206.length; var66++) {
                                                if (var11.field206[var66] == var65) {
                                                    class303 var67 = new class303();
                                                    var67.field4499 = var11;
                                                    var67.field4500 = var11.field85;
                                                    class625.field9038.method1909(var67, (byte) -81);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field63 = class32.field538;
                                }
                                if (var11.field160 != null && class572.field8306 > var11.field156) {
                                    if (var11.field114 == null || class572.field8306 - var11.field156 > 32) {
                                        class303 var73 = new class303();
                                        var73.field4499 = var11;
                                        var73.field4500 = var11.field160;
                                        class625.field9038.method1909(var73, (byte) -81);
                                    } else {
                                        label648: for (int var69 = var11.field156; var69 < class572.field8306; var69++) {
                                            int var70 = class456.field6573[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field114.length; var71++) {
                                                if (var11.field114[var71] == var70) {
                                                    class303 var72 = new class303();
                                                    var72.field4499 = var11;
                                                    var72.field4500 = var11.field160;
                                                    class625.field9038.method1909(var72, (byte) -81);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field156 = class572.field8306;
                                }
                                if (var11.field205 != null && class324.field4706 > var11.field134) {
                                    if (var11.field149 == null || class324.field4706 - var11.field134 > 32) {
                                        class303 var78 = new class303();
                                        var78.field4499 = var11;
                                        var78.field4500 = var11.field205;
                                        class625.field9038.method1909(var78, (byte) -81);
                                    } else {
                                        label624: for (int var74 = var11.field134; var74 < class324.field4706; var74++) {
                                            int var75 = class222.field2942[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field149.length; var76++) {
                                                if (var11.field149[var76] == var75) {
                                                    class303 var77 = new class303();
                                                    var77.field4499 = var11;
                                                    var77.field4500 = var11.field205;
                                                    class625.field9038.method1909(var77, (byte) -81);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field134 = class324.field4706;
                                }
                                if (var11.field129 != null && class549.field8077 > var11.field180) {
                                    if (var11.field83 == null || class549.field8077 - var11.field180 > 32) {
                                        class303 var83 = new class303();
                                        var83.field4499 = var11;
                                        var83.field4500 = var11.field129;
                                        class625.field9038.method1909(var83, (byte) -81);
                                    } else {
                                        label600: for (int var79 = var11.field180; var79 < class549.field8077; var79++) {
                                            int var80 = class520.field7296[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field83.length; var81++) {
                                                if (var11.field83[var81] == var80) {
                                                    class303 var82 = new class303();
                                                    var82.field4499 = var11;
                                                    var82.field4500 = var11.field129;
                                                    class625.field9038.method1909(var82, (byte) -81);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field180 = class549.field8077;
                                }
                                if (class432.field6270 > var11.field133 && var11.field52 != null) {
                                    class303 var84 = new class303();
                                    var84.field4499 = var11;
                                    var84.field4500 = var11.field52;
                                    class625.field9038.method1909(var84, (byte) -81);
                                }
                                if (class516.field7245 > var11.field133 && var11.field194 != null) {
                                    class303 var85 = new class303();
                                    var85.field4499 = var11;
                                    var85.field4500 = var11.field194;
                                    class625.field9038.method1909(var85, (byte) -81);
                                }
                                if (class223.field2953 > var11.field133 && var11.field166 != null) {
                                    class303 var86 = new class303();
                                    var86.field4499 = var11;
                                    var86.field4500 = var11.field166;
                                    class625.field9038.method1909(var86, (byte) -81);
                                }
                                if (class79.field1285 > var11.field133 && var11.field101 != null) {
                                    class303 var87 = new class303();
                                    var87.field4499 = var11;
                                    var87.field4500 = var11.field101;
                                    class625.field9038.method1909(var87, (byte) -81);
                                }
                                if (class608.field8809 > var11.field133 && var11.field199 != null) {
                                    class303 var88 = new class303();
                                    var88.field4499 = var11;
                                    var88.field4500 = var11.field199;
                                    class625.field9038.method1909(var88, (byte) -81);
                                }
                                var11.field133 = class351.field5215;
                                if (var11.field179 != null) {
                                    for (int var89 = 0; var89 < class314.field4593; var89++) {
                                        class303 var90 = new class303();
                                        var90.field4499 = var11;
                                        var90.field4502 = class272.field3551[var89].method2606(true);
                                        var90.field4501 = class272.field3551[var89].method2604(-94);
                                        var90.field4500 = var11.field179;
                                        class625.field9038.method1909(var90, (byte) -81);
                                    }
                                }
                                if (class408.field6088 && var11.field99 != null) {
                                    class303 var91 = new class303();
                                    var91.field4499 = var11;
                                    var91.field4500 = var11.field99;
                                    class625.field9038.method1909(var91, (byte) -81);
                                }
                            }
                            if (var11.field172 == 5 && var11.field37 != -1) {
                                var11.method29(class274.field3588, class251.field3294, (byte) -103).method1977((byte) 68, var11.field76, class332.field4821);
                            }
                            class540.method3125(var11, false);
                            if (var11.field172 == 0) {
                                method565(arg0, var11.field65, var14, var15, var16, var17, var12 - var11.field74, var13 - var11.field196, arg8, arg9);
                                if (var11.field109 != null) {
                                    method565(var11.field109, var11.field65, var14, var15, var16, var17, var12 - var11.field74, var13 - var11.field196, arg8, arg9);
                                }
                                class200 var92 = (class200) class318.field4623.method2002((byte) -107, (long) var11.field65);
                                if (var92 != null) {
                                    if (class518.field7269 == class478.field6840 && var92.field2721 == 0 && !class683.field9638 && var21 && !class1.field9) {
                                        class542.method3187(-109);
                                    }
                                    class641.method3651(var12, var15, var92.field2716, var17, arg8, var13, var14, arg9, var16, false);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class540.method3125(var11, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 2060)
    public final void method566(byte arg0) {
        if (class364.field5343) {
            class190.field2576 = 64;
        }
        field1421++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class280.method1657(82);
        class72.field1147 = new class346(class61.field978);
        class212.field2856 = new class498();
        class328.method2023((byte) 122, new int[] { 20, 260 }, new int[] { 1000, 100 });
        if (arg0 > -127) {
            field1430 = null;
        }
        if (class280.field3708 != class215.field2882) {
            class102.field1535 = new byte[50][];
        }
        class335.field4872 = new class603(class61.field978);
        if (class280.field3708 == class215.field2882) {
            class202.field2763.field1527 = this.getCodeBase().getHost();
        } else if (class57.method355(60, class215.field2882)) {
            class202.field2763.field1527 = this.getCodeBase().getHost();
            class202.field2763.field1526 = class202.field2763.field1522 + 40000;
            class584.field8491.field1526 = class584.field8491.field1522 + 40000;
            class202.field2763.field1528 = class202.field2763.field1522 + 50000;
            class389.field5824.field1526 = class389.field5824.field1522 + 40000;
            class584.field8491.field1528 = class584.field8491.field1522 + 50000;
            class389.field5824.field1528 = class389.field5824.field1522 + 50000;
        } else if (class436.field6358 == class215.field2882) {
            class202.field2763.field1527 = "127.0.0.1";
            class584.field8491.field1527 = "127.0.0.1";
            class389.field5824.field1527 = "127.0.0.1";
            class202.field2763.field1526 = class202.field2763.field1522 + 40000;
            class584.field8491.field1526 = class584.field8491.field1522 + 40000;
            class202.field2763.field1528 = class202.field2763.field1522 + 50000;
            class389.field5824.field1526 = class389.field5824.field1522 + 40000;
            class584.field8491.field1528 = class584.field8491.field1522 + 50000;
            class389.field5824.field1528 = class389.field5824.field1522 + 50000;
        }
        if (class518.field7269 == class478.field6840) {
            class240.field3162 = false;
        }
        class488.field6928 = class436.field6376 = class537.field7865 = class157.field2236 = new short[256];
        if (class478.field6840 == class132.field1922) {
            class51.field790 = true;
            class440.field6398 = 0;
            class685.field9675 = class23.field436;
            class383.field5749 = class134.field1951;
            class20.field384 = 16777215;
        } else {
            class383.field5749 = class454.field6552;
            class685.field9675 = class625.field9048;
        }
        class684.field9654 = class202.field2763;
        try {
            class562.field8219 = class420.field6187.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class18.field362 = class327.method2020((byte) 74, class410.field6110);
        class315.field4612 = class461.method2686(true, (byte) 106, class410.field6110);
        try {
            if (class61.field978.field3000 != null) {
                class687.field9702 = new class344(class61.field978.field3000, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class496.field7024[var3] = new class344(class61.field978.field2987[var3], 6000, 0);
                }
                class475.field6815 = new class344(class61.field978.field3010, 6000, 0);
                class552.field8124 = new class19(255, class687.field9702, class475.field6815, 500000);
                class259.field3354 = new class344(class61.field978.field3001, 24, 0);
                class61.field978.field2987 = null;
                class61.field978.field3000 = null;
                class61.field978.field3001 = null;
                class61.field978.field3010 = null;
            }
        } catch (IOException var5) {
            class687.field9702 = null;
            class475.field6815 = null;
            class552.field8124 = null;
            class259.field3354 = null;
        }
        if (class280.field3708 != class215.field2882) {
            class300.field4448 = true;
        }
        if (class518.field7269 == class478.field6840) {
            class288.field4179 = class279.field3619.method1654(92, class262.field3401);
        } else if (class478.field6840 == class132.field1922) {
            class288.field4179 = class279.field3622.method1654(119, class262.field3401);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;", line = 2188)
    public final String method567(int arg0) {
        field1420++;
        String var2 = null;
        try {
            if (arg0 > -79) {
                return null;
            }
            var2 = "[1)" + class397.field6005 + "," + class403.field6049 + "," + class72.field1144 + "," + class668.field9444 + "|";
            if (class321.field4681 != null) {
                var2 = var2 + "2)" + class49.field779 + "," + (class321.field4681.field7430[0] + class397.field6005) + "," + (class321.field4681.field7429[0] + class403.field6049) + "|";
            }
            var2 = var2 + "3)" + class62.field996 + "|4)" + class335.field4872.field9485 + "|5)" + class38.method219(-2) + "|6)" + class454.field6538 + "," + class425.field6218 + "|";
            var2 = var2 + "7)" + class335.field4872.method3785(class62.field996, 3) + "|";
            var2 = var2 + "8)" + class335.field4872.method3786(class62.field996, false) + "|";
            var2 = var2 + "9)" + class335.field4872.field9491 + "|";
            var2 = var2 + "10)" + class335.field4872.field9465 + "|";
            var2 = var2 + "11)" + class335.field4872.field9473 + "|";
            var2 = var2 + "12)" + class335.field4872.method3439(class62.field996, false) + "|";
            var2 = var2 + "13)" + class190.field2576 + "|";
            var2 = var2 + "14)" + class264.field3451;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class62.field996 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field1441 == null ? (field1441 = method585("client")) : field1441).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2275)
    private final void method568(byte arg0) {
        if (class264.field3451 == 7 && class641.field9191 == 0) {
            if (class149.field2111 > 1) {
                class608.field8809 = class351.field5215;
                class149.field2111--;
            }
            if (!class683.field9638) {
                class542.method3187(-109);
            }
            for (int var2 = 0; var2 < 100 && class217.method1371((byte) -92); var2++) {
            }
        }
        field1436++;
        class255.field3319++;
        class569.method3276(-1, null, true, -1);
        class436.method2591(null, -1, (byte) 122, -1);
        class492.method2811(true);
        class351.field5215++;
        int var3 = 0;
        int var4 = -40 % ((-arg0 - 58) / 39);
        while (class378.field5678 > var3) {
            class53 var5 = class13.field299[var3].field2476;
            if (var5 != null) {
                byte var6 = var5.field805.field1206;
                if ((var6 & 0x1) != 0) {
                    int var7 = var5.method422((byte) 61);
                    if ((var6 & 0x2) != 0 && var5.field7436 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var9 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var8 != 0 || var9 != 0) {
                            int var10 = var5.field7430[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class72.field1144 - var7 - 1) < var10) {
                                var10 = class72.field1144 - var7 - 1;
                            }
                            int var11 = var5.field7429[0] + var9;
                            if (var11 < 0) {
                                var11 = 0;
                            } else if ((class668.field9444 - var7 - 1) < var11) {
                                var11 = class668.field9444 - var7 - 1;
                            }
                            int var12 = class14.method98(var7, -1, 0, var5.field7429[0], class642.field9198, class574.field8346, var5.field7430[0], 0, var7, var7, class629.field9104[var5.field7905], true, var11, var10, (byte) 52);
                            if (var12 > 0) {
                                if (var12 > 9) {
                                    var12 = 9;
                                }
                                for (int var13 = 0; var13 < var12; var13++) {
                                    var5.field7430[var13] = class574.field8346[var12 - var13 - 1];
                                    var5.field7429[var13] = class642.field9198[var12 - var13 - 1];
                                    var5.field7439[var13] = 1;
                                }
                                var5.field7436 = var12;
                            }
                        }
                    }
                    method561(var5, (byte) 121, true);
                    int var14 = class221.method1386(var5, (byte) -95);
                    class261.method1571(7, var5);
                    class704.method3941((byte) -92, var5, class309.field4559, class391.field5909, var14);
                    class582.method3339(class309.field4559, (byte) -57, var5);
                    class202.method1309(70, var5);
                }
            }
            var3++;
        }
        if (class641.field9191 == 0 && class175.field2458 == 0) {
            if (class684.field9659 == 2) {
                class160.method1137(1000);
            } else {
                class519.method2933((byte) 122);
            }
            if (class306.field4529 >> 9 < 14 || class72.field1144 - 14 <= class306.field4529 >> 9 || (class603.field8702 >> 9) < 14 || (class668.field9444 - 14) <= (class603.field8702 >> 9)) {
                class656.method3705(4);
            }
        }
        while (true) {
            class303 var15;
            class5 var16;
            class5 var17;
            do {
                var15 = (class303) class296.field4361.method1902(109);
                if (var15 == null) {
                    while (true) {
                        class303 var18;
                        class5 var19;
                        class5 var20;
                        do {
                            var18 = (class303) class389.field5826.method1902(106);
                            if (var18 == null) {
                                while (true) {
                                    class303 var21;
                                    class5 var22;
                                    class5 var23;
                                    do {
                                        var21 = (class303) class625.field9038.method1902(107);
                                        if (var21 == null) {
                                            if (class188.field2561 != null) {
                                                class636.method3637(false);
                                            }
                                            if (class45.field685 % 1500 == 0) {
                                                class153.method1087(-16823);
                                            }
                                            if (class264.field3451 == 7 && class641.field9191 == 0) {
                                                class704.method3943((byte) -79);
                                            }
                                            class466.method2695(-95);
                                            if (class347.field5135 && (class60.method371(false) - 60000L) > class624.field9017) {
                                                class177.method1206((byte) -112);
                                            }
                                            for (class592 var24 = (class592) class688.field9715.method2370(-26173); var24 != null; var24 = (class592) class688.field9715.method2369((byte) -97)) {
                                                if ((long) var24.field8593 < class60.method371(false) / 1000L - 5L) {
                                                    if (var24.field8594 > 0) {
                                                        class46.method275("", 5, var24.field8597 + class279.field3644.method1654(91, class262.field3401), "", 255, "", 0);
                                                    }
                                                    if (var24.field8594 == 0) {
                                                        class46.method275("", 5, var24.field8597 + class279.field3645.method1654(-51, class262.field3401), "", 255, "", 0);
                                                    }
                                                    var24.method300((byte) 61);
                                                }
                                            }
                                            if (class264.field3451 == 7 && class641.field9191 == 0) {
                                                if (class230.field3051 == null) {
                                                    class65.method395(false, 108);
                                                    return;
                                                }
                                                class227.field3021++;
                                                if (class227.field3021 > 50) {
                                                    class577.field8379++;
                                                    class654 var25 = class631.method3628(class688.field9716, (byte) -51, class357.field5280);
                                                    class444.method2623(119, var25);
                                                }
                                                try {
                                                    class220.method1385(true);
                                                    return;
                                                } catch (IOException var26) {
                                                    class65.method395(false, -65);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var22 = var21.field4499;
                                        if (var22.field53 < 0) {
                                            break;
                                        }
                                        var23 = class705.method3944(var22.field87, (byte) 127);
                                    } while (var23 == null || var23.field109 == null || var22.field53 >= var23.field109.length || var23.field109[var22.field53] != var22);
                                    class195.method1270(var21);
                                }
                            }
                            var19 = var18.field4499;
                            if (var19.field53 < 0) {
                                break;
                            }
                            var20 = class705.method3944(var19.field87, (byte) 107);
                        } while (var20 == null || var20.field109 == null || var20.field109.length <= var19.field53 || var20.field109[var19.field53] != var19);
                        class195.method1270(var18);
                    }
                }
                var16 = var15.field4499;
                if (var16.field53 < 0) {
                    break;
                }
                var17 = class705.method3944(var16.field87, (byte) 109);
            } while (var17 == null || var17.field109 == null || var17.field109.length <= var16.field53 || var17.field109[var16.field53] != var16);
            class195.method1270(var15);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lps;)Z", line = 2559)
    public static final boolean method569(class5 arg0) {
        if (class1.field9) {
            if (method564(arg0).field1275 != 0) {
                return false;
            }
            if (arg0.field172 == 0) {
                return false;
            }
        }
        return arg0.field173;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2573)
    private final void method570(int arg0) {
        field1422++;
        if (class264.field3451 == 14) {
            return;
        }
        long var2 = class692.method3898(false) / 1000000L - class509.field7192;
        class509.field7192 = class692.method3898(false) / 1000000L;
        boolean var4 = class12.method78(89);
        if (var4 && class700.field9845 && class128.field1846 != null) {
            class128.field1846.method151(-4501);
        }
        if (class327.method2019(class264.field3451, -11)) {
            if (class178.field2486 != 0L && class178.field2486 < class60.method371(false)) {
                class378.method2336(class335.field4872.field9490, false, (byte) -117, class335.field4872.field9505, class38.method219(-2));
            } else if (!class332.field4821.method663() && class128.field1845) {
                class106.method749(255);
            }
        }
        if (class348.field5160 == null) {
            Container var5;
            if (class388.field5808 != null) {
                var5 = class388.field5808;
            } else if (class551.field8116 == null) {
                var5 = class679.field9602;
            } else {
                var5 = class551.field8116;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class388.field5808 == var5) {
                Insets var8 = class388.field5808.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class173.field2443 != var6 || class300.field4447 != var7 || class239.field3144) {
                if (class332.field4821 == null || class332.field4821.method685()) {
                    class280.method1657(82);
                } else {
                    class300.field4447 = var7;
                    class173.field2443 = var6;
                }
                class178.field2486 = class60.method371(false) + 500L;
                class239.field3144 = false;
            }
        }
        if (class348.field5160 != null && !class696.field9809 && class327.method2019(class264.field3451, -11)) {
            class378.method2336(-1, false, (byte) -113, -1, class335.field4872.field9474);
        }
        boolean var9 = false;
        if (class471.field6786) {
            class471.field6786 = false;
            var9 = true;
        }
        if (var9) {
            class549.method3204(false);
        }
        if (class332.field4821 != null && class332.field4821.method663() || class38.method219(-2) != 1) {
            class12.method83((byte) -82);
        }
        if (class497.method2834((byte) 114, class264.field3451)) {
            class135.method961(var9, 5);
        } else if (class142.method997(class264.field3451, (byte) -109)) {
            class525.method2977(-30673);
        } else if (class188.method1243(class264.field3451, 1679)) {
            class525.method2977(arg0 ^ 0xFFFF882F);
        } else if (class474.method2730(120, class264.field3451)) {
            if (class520.field7295 == 1) {
                if (class194.field2608 < class30.field518) {
                    class194.field2608 = class30.field518;
                }
                int var11 = (class194.field2608 - class30.field518) * 50 / class194.field2608;
                class453.method2656(arg0, class244.field3236, class279.field3637.method1654(arg0 - 50, class262.field3401) + "<br>(" + var11 + "%)", class332.field4821, true, class624.field9024);
            } else if (class520.field7295 == 2) {
                if (class318.field4626 < class65.field1040) {
                    class318.field4626 = class65.field1040;
                }
                int var10 = (class318.field4626 - class65.field1040) * 50 / class318.field4626 + 50;
                class453.method2656(arg0, class244.field3236, class279.field3637.method1654(arg0 ^ 0x65, class262.field3401) + "<br>(" + var10 + "%)", class332.field4821, true, class624.field9024);
            } else {
                class453.method2656(0, class244.field3236, class279.field3637.method1654(115, class262.field3401), class332.field4821, true, class624.field9024);
            }
        } else if (class264.field3451 == 10) {
            class631.method3624(arg0 - 2, var2);
        } else if (class264.field3451 == 13) {
            class453.method2656(0, class244.field3236, class279.field3639.method1654(-48, class262.field3401) + "<br>" + class279.field3640.method1654(-117, class262.field3401), class332.field4821, false, class624.field9024);
        }
        if (class145.field2086 == 3) {
            for (int var12 = 0; var12 < class7.field215; var12++) {
                Rectangle var13 = class696.field9811[var12];
                if (class586.field8509[var12]) {
                    class332.field4821.method710(var13.y, 22339, -1996553985, var13.width, var13.x, var13.height);
                } else if (class27.field475[var12]) {
                    class332.field4821.method710(var13.y, 22339, -1996554240, var13.width, var13.x, var13.height);
                }
            }
        }
        if (class291.method1796(true)) {
            class474.method2728(false, class332.field4821);
        }
        if (class61.field978.field2983 && class327.method2019(class264.field3451, -11) && class145.field2086 == 0 && class38.method219(arg0 ^ 0xFFFFFFFE) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class7.field215; var15++) {
                if (class27.field475[var15]) {
                    class27.field475[var15] = false;
                    class193.field2593[var14++] = class696.field9811[var15];
                }
            }
            try {
                class332.field4821.method689(class193.field2593, var14);
            } catch (class232 var19) {
            }
        } else if (!class497.method2834((byte) 121, class264.field3451)) {
            for (int var16 = 0; var16 < class7.field215; var16++) {
                class27.field475[var16] = false;
            }
            try {
                class332.field4821.method655();
            } catch (class232 var18) {
                class118.method869(var18, (byte) -128, var18.getMessage() + " (Recovered) " + this.method567(-88));
                class409.method2509(512, 0);
            }
        }
        if (class335.field4872.field9476 == arg0) {
            class687.method3846(15L, -98);
        } else if (class335.field4872.field9476 == 1) {
            class687.method3846(10L, arg0 ^ 0x4B);
        } else if (class335.field4872.field9476 == 2) {
            class687.method3846(5L, 84);
        } else if (class335.field4872.field9476 == 3) {
            class687.method3846(2L, 111);
        }
        if (class544.field8040) {
            class135.method960((byte) 30);
        }
        if (class335.field4872.field9494 && class264.field3451 == 3 && class567.field8270 != -1) {
            class335.field4872.field9494 = false;
            class335.field4872.method3442(class61.field978, 118);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lps;)Lps;", line = 2821)
    public static final class5 method571(class5 arg0) {
        int var1 = method564(arg0).method457(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class705.method3944(arg0.field87, (byte) 124);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2840)
    public final void init() {
        field1424++;
        if (!this.method1664((byte) -23)) {
            return;
        }
        class202.field2763 = new class102();
        class202.field2763.field1522 = Integer.parseInt(this.getParameter("worldid"));
        class584.field8491 = new class102();
        class584.field8491.field1522 = Integer.parseInt(this.getParameter("lobbyid"));
        class584.field8491.field1527 = this.getParameter("lobbyaddress");
        class389.field5824 = new class102();
        class389.field5824.field1522 = Integer.parseInt(this.getParameter("demoid"));
        class389.field5824.field1527 = this.getParameter("demoaddress");
        class215.field2882 = class40.method234((byte) 67, Integer.parseInt(this.getParameter("modewhere")));
        if (class436.field6358 == class215.field2882) {
            class215.field2882 = class448.field6497;
        } else if (!class57.method355(60, class215.field2882) && class280.field3708 != class215.field2882) {
            class215.field2882 = class280.field3708;
        }
        class452.field6515 = class203.method1311(Integer.parseInt(this.getParameter("modewhat")), 18444);
        if (class476.field6820 != class452.field6515 && class637.field9158 != class452.field6515 && class452.field6515 != class43.field644) {
            class452.field6515 = class43.field644;
        }
        try {
            class262.field3401 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class262.field3401 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class517.field7256 = true;
        } else {
            class517.field7256 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class295.field4357 = true;
        } else {
            class295.field4357 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class449.field6501 = true;
        } else {
            class449.field6501 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class478.field6840 = class518.field7269;
            } else if (var4.equals("1")) {
                class478.field6840 = class132.field1922;
            }
        }
        try {
            class122.field1815 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class122.field1815 = 0;
        }
        class468.field6738 = this.getParameter("quiturl");
        class433.field6283 = this.getParameter("settings");
        if (class433.field6283 == null) {
            class433.field6283 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class661.field9414 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class661.field9414 = 0;
            }
        }
        class2.field18 = Integer.parseInt(this.getParameter("colourid"));
        if (class2.field18 < 0 || class29.field498.length <= class2.field18) {
            class2.field18 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class186.field2524 = true;
            class221.field2937 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class59.field960 = true;
        }
        class119.field1771 = this.getParameter("sskey");
        if (class119.field1771 != null && class119.field1771.length() < 2) {
            class119.field1771 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class364.field5343 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class605.field8743 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class224.field2970 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class222.field2944 = this.getParameter("additionalInfo");
        if (class222.field2944 != null && class222.field2944.length() > 50) {
            class222.field2944 = null;
        }
        if (class518.field7269 == class478.field6840) {
            class677.field9591 = 765;
            class619.field8966 = 503;
        } else if (class478.field6840 == class132.field1922) {
            class619.field8966 = 480;
            class677.field9591 = 640;
        }
        class420.field6187 = this;
        this.method1661(class478.field6840.field5511, 35, class619.field8966, class677.field9591, 1, 627, class452.field6515.method1619(-24991) + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(FIIIIIFF)[F", line = 3004)
    public static final float[] method572(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7) {
        field1431++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[2] = var11;
        var8[6] = -var11;
        var8[4] = 1.0F;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        var8[8] = var10;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) ((float) arg4 - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg5 * arg5));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg5 / var19;
                var14 = (float) (-arg2) / var19;
            }
            var13[7] = -var14 * var17;
            var13[5] = var14 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[2] = var14 * var15 * var18;
            var13[4] = var16;
            var13[3] = -var15 * var17;
            var13[6] = var14 * var15 * var18;
            var13[1] = var15 * var17;
            var13[0] = var14 * var14 * var18 + var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg7;
        var9[4] *= arg0;
        var9[1] *= arg6;
        var9[5] *= arg0;
        var9[7] *= arg7;
        var9[0] *= arg6;
        var9[8] *= arg7;
        var9[2] *= arg6;
        var9[3] *= arg0;
        return var9;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 3086)
    public static void method573(byte arg0) {
        field1430 = null;
        field1440 = null;
        field1439 = null;
        if (arg0 != 14) {
            field1440 = null;
        }
        field1438 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 3101)
    public static final void method574() {
        int var0 = class416.field6150;
        int[] var1 = class35.field554;
        boolean var2 = class335.field4872.field9503 == 1 && var0 > 200 || class335.field4872.field9503 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class71 var13 = class35.field551[var1[var3]];
            if (!var13.method416(-5658)) {
                var13.field7394 = -1;
            } else if (var13.field1130) {
                var13.field7394 = -1;
            } else {
                var13.method1803((byte) -76);
                if (var13.field4299 >= 0 && var13.field4300 >= 0 && var13.field4294 < class72.field1144 && var13.field4305 < class668.field9444) {
                    var13.field1115 = var13.field7404 ? var2 : false;
                    if (class321.field4681 == var13) {
                        var13.field7394 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field7372) {
                            var14++;
                        }
                        if (var13.field7339 > class45.field685) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method422((byte) -124) << 2);
                        if (var13.field1140) {
                            var15 += 512;
                        } else {
                            if (class10.field267 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field7394 = var15 + 1;
                    }
                } else {
                    var13.field7394 = -1;
                }
            }
        }
        for (int var4 = 0; var4 < class155.field2213; var4++) {
            class53 var10 = ((class177) class271.field3550.method2002((byte) -120, (long) class523.field7379[var4])).field2476;
            if (var10.method322(-5658) && var10.field805.method439(class308.field4545, true)) {
                var10.method1803((byte) -76);
                if (var10.field4299 >= 0 && var10.field4300 >= 0 && var10.field4294 < class72.field1144 && var10.field4305 < class668.field9444) {
                    int var11 = 0;
                    if (!var10.field7372) {
                        var11++;
                    }
                    if (var10.field7339 > class45.field685) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method422((byte) -40) << 2);
                    if (class10.field267 == 0) {
                        if (var10.field805.field1204) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class10.field267 == 1) {
                        if (var10.field805.field1204) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field805.field1198) {
                        var12 += 1024;
                    } else if (!var10.field805.field1181) {
                        var12 += 256;
                    }
                    var10.field7394 = var12 + 1;
                } else {
                    var10.field7394 = -1;
                }
            } else {
                var10.field7394 = -1;
            }
        }
        for (int var5 = 0; var5 < class700.field9879.length; var5++) {
            class14 var6 = class700.field9879[var5];
            if (var6 != null) {
                if (var6.field317 == 1) {
                    class177 var7 = (class177) class271.field3550.method2002((byte) -111, (long) var6.field309);
                    if (var7 != null) {
                        class53 var8 = var7.field2476;
                        if (var8.field7394 >= 0) {
                            var8.field7394 += 2048;
                        }
                    }
                } else if (var6.field317 == 10) {
                    class71 var9 = class35.field551[var6.field309];
                    if (var9 != null && class321.field4681 != var9 && var9.field7394 >= 0) {
                        var9.field7394 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 3271)
    public final synchronized void method575(int arg0) {
        field1434++;
        if (class551.field8116 != null && class410.field6110 == null && !class61.field978.field2983) {
            try {
                Class var2 = class551.field8116.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class410.field6110 = (Canvas) var3.get(class551.field8116);
                var3.set(class551.field8116, null);
                if (class410.field6110 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method575(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 3305)
    public final void method576(boolean arg0) {
        if (arg0) {
            field1430 = null;
        }
        field1429++;
        if (class62.field996 != 2) {
            this.method570(0);
            return;
        }
        try {
            this.method570(0);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class118.method869(var5, (byte) -128, var5.getMessage() + " (Recovered) " + this.method567(-126));
            class409.method2509(512, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 3332)
    public static final void method577() {
        for (int var0 = 0; var0 < class72.field1144; var0++) {
            int[] var1 = class607.field8780[var0];
            for (int var2 = 0; var2 < class668.field9444; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3350)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class44.method253(78, "Argument count");
            }
            class202.field2763 = new class102();
            class202.field2763.field1522 = Integer.parseInt(arg0[0]);
            class584.field8491 = new class102();
            class584.field8491.field1522 = Integer.parseInt(arg0[1]);
            class389.field5824 = new class102();
            class389.field5824.field1522 = Integer.parseInt(arg0[2]);
            class215.field2882 = class436.field6358;
            if (arg0[3].equals("live")) {
                class452.field6515 = class43.field644;
            } else if (arg0[3].equals("rc")) {
                class452.field6515 = class637.field9158;
            } else if (arg0[3].equals("wip")) {
                class452.field6515 = class476.field6820;
            } else {
                class44.method253(78, "modewhat");
            }
            class262.field3401 = class498.method2847(arg0[4], (byte) 17);
            if (class262.field3401 == -1) {
                if (arg0[4].equals("english")) {
                    class262.field3401 = 0;
                } else if (arg0[4].equals("german")) {
                    class262.field3401 = 1;
                } else {
                    class44.method253(78, "language");
                }
            }
            class517.field7256 = false;
            class295.field4357 = false;
            if (arg0[5].equals("game0")) {
                class478.field6840 = class518.field7269;
            } else if (arg0[5].equals("game1")) {
                class478.field6840 = class132.field1922;
            } else {
                class44.method253(78, "game");
            }
            class605.field8743 = 0;
            class59.field960 = false;
            class222.field2944 = null;
            class119.field1771 = null;
            class433.field6283 = "";
            class224.field2970 = 0L;
            class661.field9414 = 0;
            class364.field5343 = false;
            class122.field1815 = 0;
            class2.field18 = class478.field6840.field5519;
            class186.field2524 = true;
            class221.field2937 = true;
            client var1 = new client();
            class420.field6187 = var1;
            var1.method1667(1024, 768, -121, class478.field6840.field5511, 627, 35, false, class452.field6515.method1619(-24991) + 32);
            class388.field5808.setLocation(40, 40);
        } catch (Exception var3) {
            class118.method869(var3, (byte) -128, null);
        }
        field1427++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 3429)
    public final void method578(byte arg0) {
        field1433++;
        if (class62.field996 == 2) {
            try {
                this.method579(-9369);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class118.method869(var5, (byte) -128, var5.getMessage() + " (Recovered) " + this.method567(-125));
                class409.method2509(512, 0);
            }
        } else {
            this.method579(-9369);
        }
        if (arg0 >= -44) {
            this.init();
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 3453)
    private final void method579(int arg0) {
        if (arg0 != -9369) {
            return;
        }
        field1423++;
        if (class264.field3451 == 14) {
            return;
        }
        class45.field685++;
        if (class45.field685 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class696.field9796 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class19.field373.setSeed((long) class696.field9796);
        }
        if (class45.field685 % 50 == 0) {
            class370.field5493 = class355.field5255;
            class355.field5255 = 0;
            class13.field302 = class232.field3070;
            class232.field3070 = 0;
        }
        this.method580(93);
        if (class550.field8096 != null) {
            class550.field8096.method2291(arg0 ^ 0xDB67);
        }
        class245.method1500(arg0 + 9263);
        class18.field362.method1613(-93);
        class315.field4612.method2342((byte) -32);
        if (class332.field4821 != null) {
            class332.field4821.method639((int) class60.method371(false));
        }
        class452.method2654((byte) 96);
        class417.field6162 = 0;
        class314.field4593 = 0;
        for (class439 var3 = class18.field362.method1614(-46); var3 != null; var3 = class18.field362.method1614(-98)) {
            int var6 = var3.method2607((byte) 106);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2604(-72);
                if (class643.method3659(62) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class291.method1796(true)) {
                        class520.method2937((byte) -99);
                    } else {
                        class57.method356(false);
                    }
                } else if (class314.field4593 < 128) {
                    class272.field3551[class314.field4593] = var3;
                    class314.field4593++;
                }
            } else if (var6 == 0 && class417.field6162 < 75) {
                class640.field9188[class417.field6162] = var3;
                class417.field6162++;
            }
        }
        class623.field9013 = 0;
        for (class147 var4 = class315.field4612.method2346(true); var4 != null; var4 = class315.field4612.method2346(true)) {
            int var5 = var4.method479((byte) 41);
            if (var5 == -1) {
                class373.field5510.method1909(var4, (byte) -81);
            } else if (var5 == 6) {
                class623.field9013 += var4.method476(false);
            } else if (class98.method632(var5, 1)) {
                class430.field6262.method1909(var4, (byte) -81);
                if (class430.field6262.method1907((byte) 55) > 10) {
                    class430.field6262.method1902(97);
                }
            }
        }
        if (class291.method1796(true)) {
            class35.method208(arg0 + 9369);
        }
        if (class497.method2834((byte) 125, class264.field3451)) {
            class231.method1434(0);
            class232.method1437(-101);
        } else if (class474.method2730(102, class264.field3451)) {
            class7.method42(-1);
        }
        if (class591.method3368(class264.field3451, 26386) && !class474.method2730(112, class264.field3451)) {
            this.method568((byte) 43);
            class206.method1325((byte) -118);
            class685.method3842((byte) -71);
        } else if (class261.method1566((byte) 5, class264.field3451) && !class474.method2730(117, class264.field3451)) {
            this.method568((byte) 2);
            class685.method3842((byte) -71);
        } else if (class264.field3451 == 12) {
            class685.method3842((byte) -71);
        } else if (class515.method2903(class264.field3451, arg0 ^ 0x2494) && !class474.method2730(74, class264.field3451)) {
            class607.method3467(-79);
        } else if (class264.field3451 == 13) {
            class685.method3842((byte) -71);
            if (class687.field9711 != -3 && class687.field9711 != 2 && class687.field9711 != 15) {
                class65.method395(false, -127);
            }
        }
        class347.method2161(123, class332.field4821);
        class430.field6262.method1902(116);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 3613)
    private final void method580(int arg0) {
        field1437++;
        boolean var2 = class212.field2856.method2843(-128);
        if (!var2) {
            this.method560(false);
        }
        int var3 = 57 / ((arg0 - 2) / 61);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3628)
    public static final void method581() {
        class22.field400 = 0;
        for (int var0 = 0; var0 < class155.field2213; var0++) {
            class53 var1 = ((class177) class271.field3550.method2002((byte) -112, (long) class523.field7379[var0])).field2476;
            if (var1.field7372 && var1.method310((byte) 4) != -1) {
                int var2 = (var1.method422((byte) -52) - 1) * 256 + 252;
                int var3 = var1.field7895 - var2 >> 9;
                int var4 = var1.field7896 - var2 >> 9;
                class523 var5 = class353.method2191(var1.field7905, var3, var4, 30078);
                if (var5 != null) {
                    int var6 = var5.field7405;
                    if (var5 instanceof class53) {
                        var6 += 2048;
                    }
                    if (var5.field7368 == 0 && var5.method310((byte) 4) != -1) {
                        class417.field6159[class22.field400] = var6;
                        class243.field3229[class22.field400] = var6;
                        class22.field400++;
                        var5.field7368++;
                    }
                    class417.field6159[class22.field400] = var6;
                    class243.field3229[class22.field400] = var1.field7405 + 2048;
                    class22.field400++;
                    var5.field7368++;
                }
            }
        }
        class594.method3382((byte) 68, class417.field6159, class243.field3229, 0, class22.field400 - 1);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 3678)
    public static final void method582(int arg0) {
        int var1 = class416.field6150;
        int[] var2 = class35.field554;
        int var3 = class263.field3411 ? var1 : class155.field2213 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class523 var5;
            if (var4 < var1) {
                var5 = class35.field551[var2[var4]];
            } else {
                var5 = ((class177) class271.field3550.method2002((byte) -117, (long) class523.field7379[var4 - var1])).field2476;
            }
            if (var5.field7905 == arg0) {
                var5.field7368 = 0;
                if (var5.field7394 < 0) {
                    var5.field7372 = false;
                } else {
                    int var6 = var5.method422((byte) -109);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field7895 & 0x1FF) != 0 || (var5.field7896 & 0x1FF) != 0) {
                            var5.field7372 = false;
                            continue;
                        }
                    } else if ((var5.field7895 & 0x1FF) != 256 || (var5.field7896 & 0x1FF) != 256) {
                        var5.field7372 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field7895 >> 9;
                        int var8 = var5.field7896 >> 9;
                        if (class607.field8780[var7][var8] != var5.field7394) {
                            var5.field7372 = true;
                            continue;
                        }
                        if (class668.field9446[var7][var8] > 1) {
                            var10002 = class668.field9446[var7][var8]--;
                            var5.field7372 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field7895 - var9 >> 9;
                        int var11 = var5.field7896 - var9 >> 9;
                        int var12 = var5.field7895 + var9 >> 9;
                        int var13 = var5.field7896 + var9 >> 9;
                        if (!class216.method1368((byte) -109, var10, var11, var5.field7394, var13, var12)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class607.field8780[var14][var15] == var5.field7394) {
                                        var10002 = class668.field9446[var14][var15]--;
                                    }
                                }
                            }
                            var5.field7372 = true;
                            continue;
                        }
                    }
                    var5.field7372 = false;
                    var5.field7894 = class504.method2870((byte) -123, var5.field7896, var5.field7895, var5.field7905);
                    class591.method3367(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 3793)
    private final void method583(int arg0, byte arg1) {
        class43.field641 = 0;
        class582.field8466 = null;
        if (arg1 != 112) {
            field1440 = null;
        }
        field1426++;
        class410.field6103 = null;
        class212.field2856.field7063 = arg0;
        class212.field2856.field7064++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 3810)
    public final void method584(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1428++;
        if (class347.field5135) {
            class177.method1206((byte) -112);
        }
        class549.method3206(0);
        if (class332.field4821 != null) {
            class332.field4821.method623((byte) -116);
        }
        if (class348.field5160 != null) {
            class683.method3826(class348.field5160, 10, class61.field978);
            class348.field5160 = null;
        }
        if (class230.field3051 != null) {
            class230.field3051.method1362((byte) 120);
            class230.field3051 = null;
        }
        class248.method1511(-124);
        class212.field2856.method2842(-93);
        class72.field1147.method2146((byte) -127);
        if (class23.field434 != null) {
            class23.field434.method2122(-120);
            class23.field434 = null;
        }
        try {
            class687.field9702.method2132(20699);
            for (int var2 = 0; var2 < 35; var2++) {
                class496.field7024[var2].method2132(20699);
            }
            class475.field6815.method2132(20699);
            class259.field3354.method2132(20699);
            class436.method2592(12);
        } catch (Exception var3) {
        }
    }
}
