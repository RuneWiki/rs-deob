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
public class client extends class658 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lbaa;")
    public static class593 field9533 = new class593(1, 2, 2, 0);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "F")
    public static float field9536;

    @OriginalMember(owner = "client!client", name = "B", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field9525;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field9543;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field9544;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    public static boolean field9545;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[Ljava/lang/String;")
    public static String[] field9541;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3821(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 10)
    public static final void method3801() {
        for (int var0 = 0; var0 < class431.field5395; var0++) {
            int[] var1 = class644.field9052[var0];
            for (int var2 = 0; var2 < class452.field5802; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 27)
    private final void method3802(int arg0) {
        field9534++;
        if (arg0 > -32) {
            field9533 = null;
        }
        if (class504.field6675 == 14) {
            return;
        }
        class133.field1735++;
        if ((class133.field1735 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class553.field7702 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class181.field2323.setSeed((long) class553.field7702);
        }
        if (class133.field1735 % 50 == 0) {
            class319.field4082 = class626.field8733;
            class626.field8733 = 0;
            class638.field8953 = class334.field4255;
            class334.field4255 = 0;
        }
        this.method3810(true);
        if (class89.field1261 != null) {
            class89.field1261.method1614(-18366);
        }
        class18.method117(0);
        class277.field3470.method455((byte) 32);
        class289.field3592.method949(false);
        if (class32.field452 != null) {
            class32.field452.method1051((int) class571.method3150(91));
        }
        class310.method1792(false);
        class4.field113 = 0;
        class404.field5070 = 0;
        for (class521 var3 = class277.field3470.method456((byte) -102); var3 != null; var3 = class277.field3470.method456((byte) -111)) {
            int var6 = var3.method563(-15194);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method561(true);
                if (class271.method1560(18403) && var7 == '`' || var7 == '§' || var7 == '²') {
                    if (class44.method267(-8908)) {
                        class430.method2272(-4);
                    } else {
                        class688.method3878(true);
                    }
                } else if (class404.field5070 < 128) {
                    class338.field4383[class404.field5070] = var3;
                    class404.field5070++;
                }
            } else if (var6 == 0 && class4.field113 < 75) {
                class265.field3366[class4.field113] = var3;
                class4.field113++;
            }
        }
        class204.field2592 = 0;
        for (class368 var4 = class289.field3592.method942(true); var4 != null; var4 = class289.field3592.method942(true)) {
            int var5 = var4.method438(false);
            if (var5 == -1) {
                class563.field7826.method239(var4, (byte) 93);
            } else if (var5 == 6) {
                class204.field2592 += var4.method435(122);
            } else if (class570.method3148(var5, 540800)) {
                class403.field5058.method239(var4, (byte) 93);
                if (class403.field5058.method241(-101) > 10) {
                    class403.field5058.method244(true);
                }
            }
        }
        if (class44.method267(-8908)) {
            class17.method114(true);
        }
        if (class278.method1579(34, class504.field6675)) {
            class28.method191(-1);
            class494.method2665(true);
        } else if (class36.method225((byte) 22, class504.field6675)) {
            class331.method1878(4);
        }
        if (class580.method3202(class504.field6675, 0) && !class36.method225((byte) 22, class504.field6675)) {
            this.method3813(94);
            class298.method1655(124);
            class224.method1351(108);
        } else if (class581.method3205(-66, class504.field6675) && !class36.method225((byte) 22, class504.field6675)) {
            this.method3813(109);
            class224.method1351(26);
        } else if (class504.field6675 == 12) {
            class224.method1351(73);
        } else if (class669.method3760(class504.field6675, (byte) -62) && !class36.method225((byte) 22, class504.field6675)) {
            class304.method1744(8);
        } else if (class504.field6675 == 13) {
            class224.method1351(-100);
            if (class195.field2453 != -3 && class195.field2453 != 2 && class195.field2453 != 15) {
                class413.method2189((byte) 45, false);
            }
        }
        class417.method2229((byte) -4, class32.field452);
        class403.field5058.method244(true);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 191)
    public final synchronized void method3700(byte arg0) {
        field9524++;
        if (class422.field5308 != null && class500.field6585 == null && !class590.field8289.field9138) {
            try {
                Class var2 = class422.field5308.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class500.field6585 = (Canvas) var3.get(class422.field5308);
                var3.set(class422.field5308, null);
                if (class500.field6585 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method3700((byte) 44);
        if (arg0 <= 20) {
            this.method3702(-10);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 222)
    public final void method3702(int arg0) {
        field9529++;
        method3820((byte) -9);
        class663.method3736(-26);
        class606.method3318(true);
        class592.method3254(false);
        class83.method477(arg0 + 19);
        class598.method3287((byte) -123);
        class540.method2923(true);
        class219.method1298((byte) 127);
        class565.method3108(arg0 - 30);
        class553.method3052(87);
        class89.method515(arg0 + 9933);
        class508.method2742(-126);
        class329.method1870(arg0 ^ 0xFFFFE404);
        class265.method1535((byte) 69);
        class68.method401(120);
        class669.method3758(0);
        class679.method3823(-19211);
        class104.method590((byte) 91);
        class112.method628((byte) 127);
        class491.method2645(-121);
        class566.method3115(arg0 - 33);
        class20.method133((byte) 5);
        class651.method3653((byte) -107);
        class40.method238((byte) 122);
        class419.method2235(0);
        class286.method1612((byte) 96);
        class287.method1617(242);
        class304.method1740(arg0 ^ 0xFFFFF039);
        class612.method3359(0);
        class635.method3553(arg0 - 5746);
        class676.method3789(arg0 - 27);
        class450.method2407((byte) 126);
        class338.method1899((byte) 116);
        class574.method3169((byte) 6);
        class289.method1624(false);
        class684.method3851(486539008);
        class631.method3530(1403);
        class195.method1177(-1);
        class568.method3134(arg0 ^ 0x1E);
        class672.method3770(75);
        class668.method3757(29);
        class255.method1488((byte) -45);
        class72.method432(-11);
        class468.method2475((byte) -68);
        class167.method961((byte) -120);
        class528.method2867((byte) 12);
        class415.method2211(arg0 ^ 0x1);
        class702.method3940(arg0 ^ 0xFFFFFF89);
        class324.method1858(arg0 ^ 0x6A);
        class431.method2276(false);
        class411.method2178((byte) -109);
        class636.method3563((byte) 62);
        class19.method124(16);
        class232.method1395((byte) -106);
        class673.method3778(4664);
        class204.method1233(14828);
        class608.method3325(-128);
        class30.method203(28554);
        class453.method2426(false);
        class42.method256(125);
        class356.method1949((byte) 20);
        class646.method3607(arg0 ^ 0xFFFFFFF1);
        class335.method1892(0);
        class588.method3239(0);
        class139.method806(arg0 - 13228);
        class507.method2734(-1);
        class170.method971(0);
        class514.method2787(false);
        class16.method112(false);
        class513.method2772(-26323);
        class611.method3337(7);
        class630.method3503((byte) -114);
        class704.method3947(105);
        class75.method444(arg0 ^ 0xFFFFFFB9);
        class266.method1548((byte) 108);
        class288.method1620(-117);
        class307.method1774(arg0 + 18955);
        class677.method3795((byte) 77);
        class470.method2491(arg0 + 32644);
        class168.method969(19714);
        class627.method3448((byte) 66);
        class569.method3145((byte) 112);
        class111.method624(-116);
        class181.method1134(false);
        class571.method3151(-28376);
        class532.method2888(6750);
        class525.method2858(112);
        class300.method1665((byte) -79);
        class317.method1827(0);
        class215.method1273(false);
        class349.method1928((byte) 94);
        class37.method230(11216);
        class120.method646(true);
        class498.method2679(0);
        class662.method3734(0);
        class395.method2117((byte) -89);
        class248.method1464((byte) 19);
        class474.method2502(-1);
        class256.method1495((byte) -119);
        class424.method2249(arg0 ^ 0xFFFFFF9B);
        class533.method2891((byte) 71);
        class434.method2283(arg0 ^ 0x11F);
        class441.method2361(62);
        class47.method293((byte) 80);
        class275.method1571((byte) -74);
        class272.method1563((byte) 113);
        class586.method3223(-104);
        class413.method2203(3);
        class180.method1131((byte) 50);
        class600.method3292(arg0 ^ 0x54);
        class385.method2074(false);
        class595.method3274((byte) 109);
        class27.method183(95);
        class332.method1887(arg0 ^ 0x7B);
        class454.method2428((byte) 57);
        class223.method1323((byte) 63);
        class258.method1507((byte) -91);
        class642.method3588(124);
        class377.method2048(false);
        class173.method1094(-24012);
        class590.method3243((byte) 70);
        class203.method1221((byte) 83);
        class177.method1119((byte) 123);
        class188.method1150((byte) 87);
        class410.method2171((byte) -47);
        class469.method2489(true);
        class156.method896((byte) -42);
        class212.method1261(2);
        class408.method2166(true);
        class530.method2878(56);
        class504.method2714(22050);
        class241.method1440((byte) -83);
        class515.method2789(-97);
        class645.method3600(81);
        class656.method3690();
        class705.method3950((byte) 34);
        class88.method501(arg0 - 134);
        class174.method1099((byte) -43);
        class235.method1415((byte) -71);
        class250.method1466((byte) -17);
        class10.method84(-29159);
        class665.method3740((byte) 97);
        class29.method193(0);
        class488.method2641(32064);
        class101.method575(-118);
        class362.method1991(-8862);
        class537.method2910(-11808);
        class93.method541();
        class601.method3295(arg0 - 1419);
        class581.method3207(-26723);
        class375.method2040(arg0 - 27749);
        class380.method2061(126);
        class393.method2112((byte) 127);
        class546.method2944(true);
        class197.method1198();
        class106.method599((byte) 28);
        class374.method2038(0);
        class316.method1825(17391);
        class543.method2936();
        class227.method1358(0);
        class31.method210(-1743);
        class127.method677(95);
        class71.method421(false);
        class372.method2029((byte) 89);
        class517.method2802(false);
        class559.method3072((byte) -93);
        class182.method1139(0);
        class378.method2056(-18);
        class652.method3658(arg0 + 25829);
        class391.method2099((byte) -72);
        class699.method3928(0);
        class137.method789(35);
        class138.method791(false);
        class119.method645(arg0 - 29);
        class681.method3837();
        class64.method385((byte) -103);
        class214.method1268(arg0 - 29);
        class674.method3783((byte) -32);
        class67.method397(18354);
        class144.method839();
        class280.method1591(27598);
        class473.method2499(0);
        class102.method577(-91);
        class388.method2086(-124);
        class447.method2390(arg0 ^ 0x401F);
        class492.method2649(arg0 ^ 0xFFFFFFB4);
        class373.method2031(-109);
        class164.method938(103);
        class416.method2217();
        class654.method3665(true);
        class689.method3881(2650);
        class221.method1307(arg0 - 29);
        class48.method303(4833);
        class683.method3842((byte) 17);
        class239.method1435((byte) 74);
        class542.method2925(0);
        class207.method1248(false);
        class500.method2694(arg0 ^ 0xFFFFFFE7);
        class397.method2127(2);
        class238.method1430(arg0 ^ 0xFFFFE0);
        class599.method3289((byte) 89);
        class549.method3028((byte) 127);
        class446.method2385(false);
        class422.method2241(0);
        class284.method1598(arg0 ^ 0xFFFF93F4);
        class128.method679((byte) -67);
        class556.method3062(125);
        class364.method1999(-16044);
        class695.method3918(3);
        class267.method1549((byte) -112);
        class298.method1658((byte) 64);
        class237.method1424(-108);
        class480.method2613(arg0 - 31);
        class509.method2750((byte) 122);
        class622.method3410(0);
        class650.method3647((byte) -123);
        class358.method1972(6407);
        class629.method3456(-74);
        class593.method3263((byte) 120);
        class209.method1252(arg0 ^ 0x50);
        class231.method1393(23460);
        class433.method2281(true);
        class451.method2421(true);
        class567.method3121((byte) 66);
        class308.method1784(arg0 ^ 0x1E);
        class135.method781(-80);
        class350.method1930(1);
        class281.method1594((byte) 113);
        class193.method1162((byte) 118);
        class680.method3828(65536);
        class270.method1555(8);
        class39.method234(arg0 ^ 0xFFFFFF0B);
        class570.method3147((byte) 116);
        class506.method2720(false);
        class529.method2874(67);
        class269.method1554((byte) 62);
        class490.method2643((byte) -115);
        class158.method899(-117);
        class192.method1160(arg0 ^ 0x6C);
        class452.method2423(false);
        class230.method1389(arg0 ^ 0xFFFFFFE0);
        class2.method10((byte) -115);
        class626.method3444((byte) -120);
        class389.method2095((byte) 121);
        class440.method2350(-1);
        class403.method2145((byte) -94);
        class199.method1204(arg0 - 31);
        class220.method1302(0);
        class518.method2804(true);
        class353.method1938((byte) -109);
        class406.method2161(false);
        class23.method168(false);
        class313.method1815(-69);
        class242.method1448((byte) 70);
        class257.method1499((byte) 78);
        class448.method2396();
        class510.method2754((byte) 124);
        class496.method2670(0);
        class55.method350((byte) 109);
        class25.method173((byte) -126);
        class657.method3694((byte) -110);
        class354.method1943(265391564);
        class407.method2163((byte) 123);
        class311.method1801((byte) -27);
        class639.method3577(true);
        class149.method861(true);
        class560.method3076((byte) 111);
        class262.method1518(false);
        class103.method588(arg0 - 31);
        class233.method1407(15223);
        class11.method85(-1);
        class224.method1349(-5);
        class147.method847(-1);
        class140.method813();
        class428.method2265(-1335466206);
        class234.method1409();
        class63.method379();
        class186.method1147(16383);
        class463.method2463(125);
        class200.method1209();
        class6.method52((byte) -42);
        class5.method48(0);
        class520.method2846(20285);
        class213.method1264(9179);
        class412.method2180(-2526);
        class516.method2795(arg0 ^ arg0);
        class301.method1669(true);
        class70.method416(-126);
        class66.method391(14793);
        class305.method1750(2);
        class296.method1652((byte) -83);
        class205.method1237(100);
        class494.method2664(-99);
        class620.method3405(2);
        class279.method1585(false);
        class671.method3766((byte) -73);
        class359.method1976(2048);
        class655.method3668(5);
        class614.method3383();
        class153.method871((byte) 80);
        class444.method2377(arg0 ^ 0xFFFFFF9F);
        class512.method2764((byte) 58);
        class32.method212(-20968);
        class26.method180((byte) -113);
        class575.method3174((byte) 7);
        class573.method3162(12531);
        class545.method2942(arg0 - 3158);
        class142.method834((byte) -100);
        class503.method2708(arg0 + 2147483616);
        class596.method3283(-5518);
        class587.method3233(27843);
        class57.method360((byte) -128);
        class398.method2130(false);
        class390.method2096(80);
        class366.method2008(false);
        class160.method926(-28916);
        class163.method935(-90);
        class461.method2456((byte) 115);
        class50.method315((byte) 123);
        class294.method1646((byte) -91);
        class584.method3215((byte) -19);
        class551.method3043((byte) -16);
        class245.method1457((byte) -40);
        class154.method883(-1);
        class159.method915(3790);
        class133.method771((byte) -96);
        class297.method1654(-23124);
        class4.method35(arg0 - 31);
        class263.method1528(15426);
        class325.method1863(-12191);
        class458.method2451(arg0 ^ 0x3D80);
        class478.method2522(0);
        class638.method3571(true);
        class117.method637(arg0 ^ 0x49FD);
        class190.method1157(110);
        class691.method3905(-3);
        class291.method1636(-101);
        class320.method1837(90);
        class347.method1922(arg0 ^ 0xFFFFFFA9);
        class74.method440((byte) 61);
        class352.method1934(arg0 ^ 0x1F);
        class290.method1625(-98);
        class81.method469(arg0 ^ 0x1F);
        class306.method1769((byte) 117);
        class162.method932((byte) 119);
        class34.method220(0);
        class563.method3087(120);
        class273.method1568((byte) -69);
        class337.method1893((byte) 88);
        class51.method320(-108);
        class363.method1997();
        class550.method3035((byte) -58);
        class175.method1102((byte) 55);
        class8.method62(0);
        class632.method3535((byte) -105);
        class61.method373(true);
        class157.method898(26);
        class105.method592(-49);
        class467.method2470(1);
        class472.method2494(-5300);
        class641.method3584(-120);
        class370.method2025(0);
        class341.method1906(false);
        class35.method224(arg0 - 142);
        class91.method530(-119);
        class402.method2140(true);
        class78.method464(1393315076);
        class129.method686(false);
        class579.method3197(false);
        class367.method2009(-82);
        class276.method1572(0);
        class383.method2069((byte) 16);
        class394.method2114((byte) -42);
        class686.method3857((byte) 107);
        class603.method3310(0);
        class58.method367(95);
        class198.method1202((byte) -49);
        class92.method531((byte) -121);
        class360.method1983((byte) -23);
        class429.method2270(-1024);
        class497.method2673((byte) 119);
        class45.method272();
        class132.method724();
        class355.method1945(arg0 - 4826);
        class152.method865(0);
        class523.method2854((byte) 110);
        class148.method853((byte) 106);
        class1.method4(arg0 + 88);
        class664.method3738(1000);
        class564.method3099(1);
        class442.method2370(1);
        class445.method2382(1135849320);
        class633.method3542(true);
        class392.method2104(-1);
        class400.method2134(17519);
        class319.method1836(1);
        class277.method1574((byte) -120);
        class161.method930((byte) -20);
        class700.method3931(13834);
        class95.method553(-90);
        class77.method462(false);
        class85.method487(-40);
        class659.method3713((byte) 120);
        class268.method1550((byte) -106);
        class52.method337(1);
        class583.method3212(0);
        class44.method268(false);
        class82.method474(arg0 - 31);
        class653.method3664(-106);
        class65.method387(127);
        class141.method826(-110);
        class225.method1356(30987);
        class46.method282(true);
        class561.method3080((byte) -109);
        class484.method2631(arg0 ^ 0x201D);
        class580.method3200(3317);
        class314.method1821((byte) 126);
        class562.method3085(arg0 + 5464);
        class698.method3926((byte) -74);
        class644.method3599((byte) 3);
        class15.method110(arg0 ^ 0x7D47);
        class396.method2126((byte) 125);
        class688.method3876((byte) 121);
        class425.method2258(0);
        class602.method3302(arg0 - 158);
        class576.method3177(28163);
        class100.method568((byte) -117);
        class344.method1917((byte) 126);
        class475.method2511(115);
        class22.method157(1);
        class405.method2158((byte) -114);
        class260.method1515(arg0 - 30);
        class323.method1854(-108);
        class481.method2618(false);
        class310.method1791((byte) -1);
        class476.method2516(true);
        class327.method1868(118);
        class228.method1363(arg0 + 5);
        class534.method2893(arg0 + 92);
        class184.method1143(6);
        class557.method3069((byte) -9);
        class386.method2078((byte) -122);
        class577.method3183(0);
        class318.method1829(-11521);
        class477.method2520(120);
        class678.method3800(3317);
        class493.method2657(-865);
        class670.method3762((byte) -80);
        class594.method3265((byte) -20);
        class36.method227((byte) -92);
        class610.method3333(-103);
        class330.method1877(false);
        class115.method636(32165);
        class538.method2920(-1);
        class511.method2760(false);
        class150.method862(0);
        class169.method970((byte) 68);
        class455.method2436(-1);
        class697.method3924(true);
        class531.method2883(0);
        class423.method2247(1201566057);
        class86.method492(1);
        class97.method559(true);
        class667.method3745(false);
        class80.method468(arg0 + 65504);
        class460.method2455((byte) 43);
        class122.method653((byte) 68);
        class368.method2015(54);
        class462.method2461(arg0 - 12451);
        class558.method3070(arg0 ^ 0x65);
        class348.method1925(-252896726);
        class465.method2467(arg0 ^ 0xE0);
        class145.method842((byte) 29);
        class382.method2066((byte) -104);
        class381.method2065(-102);
        class98.method565(4);
        class365.method2001((byte) 114);
        class49.method309((byte) -127);
        class84.method484(0);
        class572.method3156(arg0 - 142);
        class252.method1476(arg0 - 12933);
        class591.method3250(false);
        class179.method1130(arg0 - 15);
        class236.method1419(true);
        class456.method2437((byte) 99);
        class701.method3935(-111);
        class244.method1451((byte) -112);
        class201.method1215(false);
        class487.method2637((byte) 127);
        class582.method3208(arg0 - 128);
        class131.method691(false);
        class464.method2465((byte) 9);
        class351.method1932((byte) 122);
        class384.method2071(99);
        class404.method2152((byte) -70);
        class685.method3853(arg0 ^ 0xFFFFBBC3);
        class343.method1914(-9);
        class432.method2277((byte) -78);
        class693.method3908((byte) 40);
        class376.method2044((byte) 104);
        if (class658.field9326) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 732)
    public static final void main(String[] arg0) {
        field9523++;
        try {
            if (arg0.length != 6) {
                class278.method1577(-2747, "Argument count");
            }
            class584.field8165 = new class300();
            class584.field8165.field3685 = Integer.parseInt(arg0[0]);
            class381.field4817 = new class300();
            class381.field4817.field3685 = Integer.parseInt(arg0[1]);
            class82.field1091 = new class300();
            class82.field1091.field3685 = Integer.parseInt(arg0[2]);
            class591.field8310 = class408.field5117;
            if (arg0[3].equals("live")) {
                class325.field4177 = class559.field7750;
            } else if (arg0[3].equals("rc")) {
                class325.field4177 = class280.field3517;
            } else if (arg0[3].equals("wip")) {
                class325.field4177 = class356.field4534;
            } else {
                class278.method1577(-2747, "modewhat");
            }
            class250.field3068 = class203.method1224(2, arg0[4]);
            if (class250.field3068 == -1) {
                if (arg0[4].equals("english")) {
                    class250.field3068 = 0;
                } else if (arg0[4].equals("german")) {
                    class250.field3068 = 1;
                } else {
                    class278.method1577(-2747, "language");
                }
            }
            class453.field5814 = false;
            class406.field5082 = false;
            if (arg0[5].equals("game0")) {
                class98.field1337 = class662.field9360;
            } else if (arg0[5].equals("game1")) {
                class98.field1337 = class641.field9035;
            } else {
                class278.method1577(-2747, "game");
            }
            class157.field2045 = 0;
            class112.field1467 = false;
            class296.field3657 = true;
            class162.field2138 = true;
            class49.field702 = 0L;
            class89.field1237 = 0;
            class195.field2446 = null;
            class446.field5715 = false;
            class92.field1288 = "";
            class484.field6422 = class98.field1337.field1469;
            class322.field4130 = 0;
            class180.field2319 = null;
            client var1 = new client();
            class520.field7094 = var1;
            var1.method3698(true, 768, 621, false, 1024, class325.field4177.method3822((byte) -114) + 32, 35, class98.field1337.field1468);
            class582.field8140.setLocation(40, 40);
        } catch (Exception var3) {
            class106.method597(null, -2, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 812)
    public static final void method3803() {
        int var0 = class596.field8384;
        int[] var1 = class354.field4521;
        boolean var2 = class301.field3698.field6610 == 1 && var0 > 200 || class301.field3698.field6610 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class514 var13 = class351.field4490[var1[var3]];
            if (var13.method2778(-28)) {
                var13.method1092(0);
                if (var13.field2247 >= 0 && var13.field2243 >= 0 && var13.field2254 < class431.field5395 && var13.field2244 < class452.field5802) {
                    var13.field7020 = var13.field9660 ? var2 : false;
                    if (class376.field4748 == var13) {
                        var13.field9701 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field9671) {
                            var14++;
                        }
                        if (var13.field9735 > class133.field1735) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method2785(-1) << 2);
                        if (var13.field6985) {
                            var15 += 512;
                        } else {
                            if (class620.field8658 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field9701 = var15 + 1;
                    }
                } else {
                    var13.field9701 = -1;
                }
            } else {
                var13.field9701 = -1;
            }
        }
        for (int var4 = 0; var4 < class470.field5974; var4++) {
            class307 var10 = ((class206) class180.field2318.method399(-32748, (long) class153.field1958[var4])).field2618;
            if (var10.method1776(-117) && var10.field3902.method3225((byte) -33, class684.field9606)) {
                var10.method1092(0);
                if (var10.field2247 >= 0 && var10.field2243 >= 0 && var10.field2254 < class431.field5395 && var10.field2244 < class452.field5802) {
                    int var11 = 0;
                    if (!var10.field9671) {
                        var11++;
                    }
                    if (var10.field9735 > class133.field1735) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method2785(-1) << 2);
                    if (class620.field8658 == 0) {
                        if (var10.field3902.field8240) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class620.field8658 == 1) {
                        if (var10.field3902.field8240) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field3902.field8184) {
                        var12 += 1024;
                    } else if (!var10.field3902.field8207) {
                        var12 += 256;
                    }
                    var10.field9701 = var12 + 1;
                } else {
                    var10.field9701 = -1;
                }
            } else {
                var10.field9701 = -1;
            }
        }
        for (int var5 = 0; var5 < class52.field784.length; var5++) {
            class651 var6 = class52.field784[var5];
            if (var6 != null) {
                if (var6.field9181 == 1) {
                    class206 var7 = (class206) class180.field2318.method399(-32748, (long) var6.field9185);
                    if (var7 != null) {
                        class307 var8 = var7.field2618;
                        if (var8.field9701 >= 0) {
                            var8.field9701 += 2048;
                        }
                    }
                } else if (var6.field9181 == 10) {
                    class514 var9 = class351.field4490[var6.field9185];
                    if (var9 != null && class376.field4748 != var9 && var9.field9701 >= 0) {
                        var9.field9701 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 976)
    public static final void method3804(int arg0) {
        int var1 = class596.field8384;
        int[] var2 = class354.field4521;
        int var3 = class380.field4803 ? var1 : class470.field5974 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class687 var5;
            if (var4 < var1) {
                var5 = class351.field4490[var2[var4]];
            } else {
                var5 = ((class206) class180.field2318.method399(-32748, (long) class153.field1958[var4 - var1])).field2618;
            }
            if (var5.field6470 == arg0) {
                var5.field9726 = 0;
                if (var5.field9701 < 0) {
                    var5.field9671 = false;
                } else {
                    int var6 = var5.method2785(-1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6461 & 0x1FF) != 0 || (var5.field6464 & 0x1FF) != 0) {
                            var5.field9671 = false;
                            continue;
                        }
                    } else if ((var5.field6461 & 0x1FF) != 256 || (var5.field6464 & 0x1FF) != 256) {
                        var5.field9671 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6461 >> 9;
                        int var8 = var5.field6464 >> 9;
                        if (class644.field9052[var7][var8] != var5.field9701) {
                            var5.field9671 = true;
                            continue;
                        }
                        if (class453.field5805[var7][var8] > 1) {
                            var10002 = class453.field5805[var7][var8]--;
                            var5.field9671 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field6461 - var9 >> 9;
                        int var11 = var5.field6464 - var9 >> 9;
                        int var12 = var5.field6461 + var9 >> 9;
                        int var13 = var5.field6464 + var9 >> 9;
                        if (!class312.method1806(var12, var10, var11, var5.field9701, var13, (byte) -88)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class644.field9052[var14][var15] == var5.field9701) {
                                        var10002 = class453.field5805[var14][var15]--;
                                    }
                                }
                            }
                            var5.field9671 = true;
                            continue;
                        }
                    }
                    var5.field9671 = false;
                    var5.field6458 = class467.method2469(var5.field6461, var5.field6470, -20214, var5.field6464);
                    class231.method1391(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkp;)Lkp;", line = 1091)
    public static final class507 method3805(class507 arg0) {
        int var1 = method3819(arg0).method2019(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class156.method894(-1018745488, arg0.field6719);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lkp;IIIIIIIII)V", line = 1114)
    public static final void method3806(class507[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class507 var11 = arg0[var10];
            if (var11 != null && var11.field6719 == arg1) {
                int var12 = var11.field6726 + arg6;
                int var13 = var11.field6724 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6735 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6793 + var12;
                    int var19 = var11.field6700 + var13;
                    if (var11.field6735 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6735 == 0 || var11.field6787 || method3819(var11).field4678 != 0 || class34.field473 == var11 || class529.field7151 == var11.field6720 || class296.field3655 == var11.field6720) {
                    if (!method3809(var11)) {
                        if (class358.field4562 == var11 && class168.method968(74, class358.field4562) != null) {
                            class297.field3663 = true;
                            class239.field2990 = var12;
                            class68.field935 = var13;
                        }
                        if (var11.field6837 || var14 < var16 && var15 < var17) {
                            if (var11.field6824 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class71 var20 = (class71) class231.field2884.method237(93); var20 != null; var20 = (class71) class231.field2884.method245((byte) 113)) {
                                    if (var20.field959) {
                                        var20.method1871(-101);
                                        var20.field952.field6811 = false;
                                    }
                                }
                                if (class276.field3458 == 0) {
                                    class358.field4562 = null;
                                    class34.field473 = null;
                                }
                                class373.field4707 = 0;
                                class540.field7234 = false;
                                class271.field3429 = false;
                                if (!class84.field1188) {
                                    class477.method2521((byte) 91);
                                }
                            }
                            boolean var21;
                            if (class289.field3592.method944(2000) >= var14 && class289.field3592.method941(99) >= var15 && class289.field3592.method944(2000) < var16 && class289.field3592.method941(104) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class664.field9377 && var21) {
                                if (var11.field6841 >= 0) {
                                    class474.field6013 = var11.field6841;
                                } else if (var11.field6824) {
                                    class474.field6013 = -1;
                                }
                            }
                            if (!class84.field1188 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class631.method3528(var11, -16452, arg8 - var12, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class289.field3592.method945(-30249) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class368 var24 = (class368) class403.field5058.method237(109);
                            if (var24 != null && var24.method438(false) == 0 && var24.method437(9) >= var14 && var24.method439(true) >= var15 && var24.method437(9) < var16 && var24.method439(true) < var17) {
                                var23 = true;
                            }
                            if (var11.field6771 != null && !class44.method267(-8908)) {
                                for (int var25 = 0; var25 < var11.field6771.length; var25++) {
                                    if (class277.field3470.method448((byte) -68, var11.field6771[var25])) {
                                        if (var11.field6711 == null || class133.field1735 >= var11.field6711[var25]) {
                                            byte var26 = var11.field6842[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class277.field3470.method448((byte) -68, 86) && !class277.field3470.method448((byte) -68, 82) && !class277.field3470.method448((byte) -68, 81)) && ((var26 & 0x2) == 0 || class277.field3470.method448((byte) -68, 86)) && ((var26 & 0x1) == 0 || class277.field3470.method448((byte) -68, 82)) && ((var26 & 0x4) == 0 || class277.field3470.method448((byte) -68, 81))) {
                                                if (var25 < 10) {
                                                    class430.method2273(-1, 18365, var25 + 1, "", var11.field6764);
                                                } else if (var25 == 10) {
                                                    class476.method2518((byte) 31);
                                                    class369 var27 = method3819(var11);
                                                    class359.method1978(0, var11, var27.method2018(-1035661311), var27.field4683);
                                                    class537.field7208 = class678.method3798(var11, (byte) -111);
                                                    if (class537.field7208 == null) {
                                                        class537.field7208 = "Null";
                                                    }
                                                    class473.field6007 = var11.field6828 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field6822[var25];
                                                if (var11.field6711 == null) {
                                                    var11.field6711 = new int[var11.field6771.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field6711[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6711[var25] = class133.field1735 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field6711 != null) {
                                        var11.field6711[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class46.method281(var24.method437(9) - var12, (byte) -102, var11, var24.method439(true) - var13);
                            }
                            if (class358.field4562 != null && class358.field4562 != var11 && var21 && method3819(var11).method2020(-122)) {
                                class452.field5801 = var11;
                            }
                            if (class34.field473 == var11) {
                                class356.field4538 = true;
                                class65.field884 = var12;
                                class393.field4945 = var13;
                            }
                            if (var11.field6787 || var11.field6720 != 0) {
                                if (var21 && class204.field2592 != 0 && var11.field6744 != null) {
                                    class71 var29 = new class71();
                                    var29.field959 = true;
                                    var29.field952 = var11;
                                    var29.field956 = class204.field2592;
                                    var29.field963 = var11.field6744;
                                    class231.field2884.method239(var29, (byte) 93);
                                }
                                if (class358.field4562 != null || class84.field1188 || class366.field4658 != var11.field6720 && class373.field4707 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6720 != 0) {
                                    if (class205.field2605 == var11.field6720 || class631.field8854 == var11.field6720) {
                                        class31.field443 = var11;
                                        if (class419.field5274 != null) {
                                            class419.field5274.method3238((byte) -113, var11.field6700, class32.field452);
                                        }
                                        if (class205.field2605 == var11.field6720) {
                                            if (!class84.field1188 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class42.method258(arg8, class32.field452, (byte) -39, arg9);
                                                for (class480 var30 = (class480) class586.field8174.method802((byte) 97); var30 != null; var30 = (class480) class586.field8174.method800((byte) -106)) {
                                                    if (arg8 >= var30.field6383 && arg8 < var30.field6376 && arg9 >= var30.field6377 && arg9 < var30.field6382) {
                                                        class477.method2521((byte) 91);
                                                        class29.method196(var30.field6380, false);
                                                    }
                                                }
                                            }
                                            class244.method1452(var13, var12, var11, 17274);
                                            continue;
                                        }
                                    }
                                    if (class529.field7151 == var11.field6720) {
                                        if (var11.method2740((byte) 125, class32.field452) == null || class135.field1758 != 0 && class135.field1758 != 3 || class84.field1188 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field6818[var32];
                                        if (var31 < var33 || var31 > var11.field6838[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field6793 / 2;
                                        int var35 = var32 - var11.field6700 / 2;
                                        int var36;
                                        if (class296.field3661 == 4) {
                                            var36 = (int) class331.field4223 & 0x3FFF;
                                        } else {
                                            var36 = (int) class331.field4223 + class411.field5135 & 0x3FFF;
                                        }
                                        int var37 = class453.field5810[var36];
                                        int var38 = class453.field5811[var36];
                                        if (class296.field3661 != 4) {
                                            var37 = (class354.field4510 + 256) * var37 >> 8;
                                            var38 = (class354.field4510 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class296.field3661 == 4) {
                                            var41 = (class493.field6499 >> 9) + (var39 >> 2);
                                            var42 = (class214.field2661 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class376.field4748.method2785(-1) - 1) * 256;
                                            var41 = (class376.field4748.field6461 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class376.field4748.field6464 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class664.field9377 && (class639.field8984 & 0x40) != 0) {
                                            class507 var44 = class138.method795(class529.field7156, class172.field2252, (byte) 110);
                                            if (var44 == null) {
                                                class476.method2518((byte) 31);
                                            } else {
                                                class326.method1864(var41, false, var42, var11.field6832, true, class477.field6046, 30, 1L, " ->", 30, class537.field7208);
                                            }
                                            continue;
                                        }
                                        if (class98.field1337 == class641.field9035) {
                                            class326.method1864(var41, false, var42, -1, true, -1, -56, 1L, "", 21, class83.field1135.method476((byte) -64, class250.field3068));
                                        }
                                        class326.method1864(var41, false, var42, -1, true, class517.field7068, 126, 1L, "", 10, class674.field9482);
                                        continue;
                                    }
                                    if (class366.field4658 == var11.field6720) {
                                        class147.field1887 = var11;
                                        if (var21) {
                                            class540.field7234 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method437(9) - var12 - var11.field6793 / 2) * 2.0D / (double) class656.field9246);
                                            int var46 = (int) (-((double) (var24.method439(true) - var13 - var11.field6700 / 2) * 2.0D / (double) class656.field9246));
                                            int var47 = class198.field2501 + var45 + class656.field9265;
                                            int var48 = class635.field8898 + var46 + class656.field9264;
                                            class43 var49 = class671.method3769((byte) 103);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method264(var48, var47, var50, (byte) -127);
                                            if (var50 != null) {
                                                if (class277.field3470.method448((byte) -68, 82) && class199.field2531 > 0) {
                                                    class5.method41(1024908230, var50[0], var50[2], var50[1]);
                                                    continue;
                                                }
                                                class271.field3429 = true;
                                                class684.field9610 = var50[0];
                                                class665.field9382 = var50[1];
                                                class402.field5026 = var50[2];
                                            }
                                            class373.field4707 = 1;
                                            class429.field5382 = false;
                                            class222.field2716 = class289.field3592.method944(2000);
                                            class26.field387 = class289.field3592.method941(114);
                                            continue;
                                        }
                                        if (var22 && class373.field4707 > 0) {
                                            if (class373.field4707 == 1 && (class222.field2716 != class289.field3592.method944(2000) || class26.field387 != class289.field3592.method941(92))) {
                                                class493.field6501 = class198.field2501;
                                                class30.field432 = class635.field8898;
                                                class373.field4707 = 2;
                                            }
                                            if (class373.field4707 == 2) {
                                                class429.field5382 = true;
                                                class275.method1570(class493.field6501 + (int) ((double) (class222.field2716 - class289.field3592.method944(2000)) * 2.0D / (double) class656.field9248), (byte) -122);
                                                class193.method1168(class30.field432 - (int) ((double) (class26.field387 - class289.field3592.method941(113)) * 2.0D / (double) class656.field9248), -1);
                                            }
                                            continue;
                                        }
                                        if (class373.field4707 > 0 && !class429.field5382) {
                                            if ((class700.field9906 == 1 || class612.method3363(false)) && class463.field5904 > 2) {
                                                class560.method3074(class222.field2716, 106, class26.field387);
                                            } else if (class580.method3201(0)) {
                                                class560.method3074(class222.field2716, 124, class26.field387);
                                            }
                                        }
                                        class373.field4707 = 0;
                                        continue;
                                    }
                                    if (class291.field3623 == var11.field6720) {
                                        if (var22) {
                                            class355.method1948(var11.field6700, 1, class289.field3592.method944(2000) - var12, class289.field3592.method941(99) - var13, var11.field6793);
                                        }
                                        continue;
                                    }
                                    if (class296.field3655 == var11.field6720) {
                                        class58.method366((byte) 125, var11, var12, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field6797 && var23) {
                                    var11.field6797 = true;
                                    if (var11.field6792 != null) {
                                        class71 var51 = new class71();
                                        var51.field959 = true;
                                        var51.field952 = var11;
                                        var51.field957 = var24.method437(9) - var12;
                                        var51.field956 = var24.method439(true) - var13;
                                        var51.field963 = var11.field6792;
                                        class231.field2884.method239(var51, (byte) 93);
                                    }
                                }
                                if (var11.field6797 && var22 && var11.field6844 != null) {
                                    class71 var52 = new class71();
                                    var52.field959 = true;
                                    var52.field952 = var11;
                                    var52.field957 = class289.field3592.method944(2000) - var12;
                                    var52.field956 = class289.field3592.method941(117) - var13;
                                    var52.field963 = var11.field6844;
                                    class231.field2884.method239(var52, (byte) 93);
                                }
                                if (var11.field6797 && !var22) {
                                    var11.field6797 = false;
                                    if (var11.field6753 != null) {
                                        class71 var53 = new class71();
                                        var53.field959 = true;
                                        var53.field952 = var11;
                                        var53.field957 = class289.field3592.method944(2000) - var12;
                                        var53.field956 = class289.field3592.method941(116) - var13;
                                        var53.field963 = var11.field6753;
                                        class51.field768.method239(var53, (byte) 93);
                                    }
                                }
                                if (var22 && var11.field6795 != null) {
                                    class71 var54 = new class71();
                                    var54.field959 = true;
                                    var54.field952 = var11;
                                    var54.field957 = class289.field3592.method944(2000) - var12;
                                    var54.field956 = class289.field3592.method941(114) - var13;
                                    var54.field963 = var11.field6795;
                                    class231.field2884.method239(var54, (byte) 93);
                                }
                                if (!var11.field6811 && var21) {
                                    var11.field6811 = true;
                                    if (var11.field6703 != null) {
                                        class71 var55 = new class71();
                                        var55.field959 = true;
                                        var55.field952 = var11;
                                        var55.field957 = class289.field3592.method944(2000) - var12;
                                        var55.field956 = class289.field3592.method941(112) - var13;
                                        var55.field963 = var11.field6703;
                                        class231.field2884.method239(var55, (byte) 93);
                                    }
                                }
                                if (var11.field6811 && var21 && var11.field6773 != null) {
                                    class71 var56 = new class71();
                                    var56.field959 = true;
                                    var56.field952 = var11;
                                    var56.field957 = class289.field3592.method944(2000) - var12;
                                    var56.field956 = class289.field3592.method941(125) - var13;
                                    var56.field963 = var11.field6773;
                                    class231.field2884.method239(var56, (byte) 93);
                                }
                                if (var11.field6811 && !var21) {
                                    var11.field6811 = false;
                                    if (var11.field6778 != null) {
                                        class71 var57 = new class71();
                                        var57.field959 = true;
                                        var57.field952 = var11;
                                        var57.field957 = class289.field3592.method944(2000) - var12;
                                        var57.field956 = class289.field3592.method941(102) - var13;
                                        var57.field963 = var11.field6778;
                                        class51.field768.method239(var57, (byte) 93);
                                    }
                                }
                                if (var11.field6741 != null) {
                                    class71 var58 = new class71();
                                    var58.field952 = var11;
                                    var58.field963 = var11.field6741;
                                    class627.field8738.method239(var58, (byte) 93);
                                }
                                if (var11.field6709 != null && class492.field6497 > var11.field6749) {
                                    if (var11.field6814 == null || class492.field6497 - var11.field6749 > 32) {
                                        class71 var63 = new class71();
                                        var63.field952 = var11;
                                        var63.field963 = var11.field6709;
                                        class231.field2884.method239(var63, (byte) 93);
                                    } else {
                                        label696: for (int var59 = var11.field6749; var59 < class492.field6497; var59++) {
                                            int var60 = class510.field6939[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field6814.length; var61++) {
                                                if (var11.field6814[var61] == var60) {
                                                    class71 var62 = new class71();
                                                    var62.field952 = var11;
                                                    var62.field963 = var11.field6709;
                                                    class231.field2884.method239(var62, (byte) 93);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6749 = class492.field6497;
                                }
                                if (var11.field6743 != null && class574.field8007 > var11.field6786) {
                                    if (var11.field6766 == null || class574.field8007 - var11.field6786 > 32) {
                                        class71 var68 = new class71();
                                        var68.field952 = var11;
                                        var68.field963 = var11.field6743;
                                        class231.field2884.method239(var68, (byte) 93);
                                    } else {
                                        label672: for (int var64 = var11.field6786; var64 < class574.field8007; var64++) {
                                            int var65 = class213.field2649[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field6766.length; var66++) {
                                                if (var11.field6766[var66] == var65) {
                                                    class71 var67 = new class71();
                                                    var67.field952 = var11;
                                                    var67.field963 = var11.field6743;
                                                    class231.field2884.method239(var67, (byte) 93);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6786 = class574.field8007;
                                }
                                if (var11.field6854 != null && class88.field1236 > var11.field6775) {
                                    if (var11.field6715 == null || class88.field1236 - var11.field6775 > 32) {
                                        class71 var73 = new class71();
                                        var73.field952 = var11;
                                        var73.field963 = var11.field6854;
                                        class231.field2884.method239(var73, (byte) 93);
                                    } else {
                                        label648: for (int var69 = var11.field6775; var69 < class88.field1236; var69++) {
                                            int var70 = class428.field5363[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field6715.length; var71++) {
                                                if (var11.field6715[var71] == var70) {
                                                    class71 var72 = new class71();
                                                    var72.field952 = var11;
                                                    var72.field963 = var11.field6854;
                                                    class231.field2884.method239(var72, (byte) 93);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6775 = class88.field1236;
                                }
                                if (var11.field6831 != null && class598.field8403 > var11.field6708) {
                                    if (var11.field6740 == null || class598.field8403 - var11.field6708 > 32) {
                                        class71 var78 = new class71();
                                        var78.field952 = var11;
                                        var78.field963 = var11.field6831;
                                        class231.field2884.method239(var78, (byte) 93);
                                    } else {
                                        label624: for (int var74 = var11.field6708; var74 < class598.field8403; var74++) {
                                            int var75 = class138.field1799[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field6740.length; var76++) {
                                                if (var11.field6740[var76] == var75) {
                                                    class71 var77 = new class71();
                                                    var77.field952 = var11;
                                                    var77.field963 = var11.field6831;
                                                    class231.field2884.method239(var77, (byte) 93);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6708 = class598.field8403;
                                }
                                if (var11.field6807 != null && class350.field4467 > var11.field6779) {
                                    if (var11.field6819 == null || class350.field4467 - var11.field6779 > 32) {
                                        class71 var83 = new class71();
                                        var83.field952 = var11;
                                        var83.field963 = var11.field6807;
                                        class231.field2884.method239(var83, (byte) 93);
                                    } else {
                                        label600: for (int var79 = var11.field6779; var79 < class350.field4467; var79++) {
                                            int var80 = class608.field8545[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field6819.length; var81++) {
                                                if (var11.field6819[var81] == var80) {
                                                    class71 var82 = new class71();
                                                    var82.field952 = var11;
                                                    var82.field963 = var11.field6807;
                                                    class231.field2884.method239(var82, (byte) 93);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6779 = class350.field4467;
                                }
                                if (class39.field525 > var11.field6865 && var11.field6733 != null) {
                                    class71 var84 = new class71();
                                    var84.field952 = var11;
                                    var84.field963 = var11.field6733;
                                    class231.field2884.method239(var84, (byte) 93);
                                }
                                if (class95.field1312 > var11.field6865 && var11.field6734 != null) {
                                    class71 var85 = new class71();
                                    var85.field952 = var11;
                                    var85.field963 = var11.field6734;
                                    class231.field2884.method239(var85, (byte) 93);
                                }
                                if (class403.field5060 > var11.field6865 && var11.field6758 != null) {
                                    class71 var86 = new class71();
                                    var86.field952 = var11;
                                    var86.field963 = var11.field6758;
                                    class231.field2884.method239(var86, (byte) 93);
                                }
                                if (class433.field5414 > var11.field6865 && var11.field6821 != null) {
                                    class71 var87 = new class71();
                                    var87.field952 = var11;
                                    var87.field963 = var11.field6821;
                                    class231.field2884.method239(var87, (byte) 93);
                                }
                                if (class16.field266 > var11.field6865 && var11.field6789 != null) {
                                    class71 var88 = new class71();
                                    var88.field952 = var11;
                                    var88.field963 = var11.field6789;
                                    class231.field2884.method239(var88, (byte) 93);
                                }
                                var11.field6865 = class450.field5767;
                                if (var11.field6857 != null) {
                                    for (int var89 = 0; var89 < class404.field5070; var89++) {
                                        class71 var90 = new class71();
                                        var90.field952 = var11;
                                        var90.field964 = class338.field4383[var89].method566((byte) -87);
                                        var90.field955 = class338.field4383[var89].method561(true);
                                        var90.field963 = var11.field6857;
                                        class231.field2884.method239(var90, (byte) 93);
                                    }
                                }
                                if (class436.field5442 && var11.field6730 != null) {
                                    class71 var91 = new class71();
                                    var91.field952 = var11;
                                    var91.field963 = var11.field6730;
                                    class231.field2884.method239(var91, (byte) 93);
                                }
                            }
                            if (var11.field6735 == 5 && var11.field6827 != -1) {
                                var11.method2731(class64.field879, class470.field5972, (byte) 93).method3238((byte) -113, var11.field6700, class32.field452);
                            }
                            class494.method2668(18259, var11);
                            if (var11.field6735 == 0) {
                                method3806(arg0, var11.field6764, var14, var15, var16, var17, var12 - var11.field6785, var13 - var11.field6769, arg8, arg9);
                                if (var11.field6707 != null) {
                                    method3806(var11.field6707, var11.field6764, var14, var15, var16, var17, var12 - var11.field6785, var13 - var11.field6769, arg8, arg9);
                                }
                                class340 var92 = (class340) class138.field1797.method399(-32748, (long) var11.field6764);
                                if (var92 != null) {
                                    if (class98.field1337 == class662.field9360 && var92.field4391 == 0 && !class84.field1188 && var21 && !class253.field3101) {
                                        class477.method2521((byte) 91);
                                    }
                                    class514.method2779((byte) -102, var12, arg8, var14, var16, var15, var92.field4392, var13, arg9, var17);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class494.method2668(18259, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2015)
    private final void method3807(int arg0) {
        field9531++;
        if (class627.field8739 < class323.field4157.field5469) {
            class131.field1628.method1667(0);
            class224.field2807 = (class323.field4157.field5469 * 50 - 50) * 5;
            if (class224.field2807 > 3000) {
                class224.field2807 = 3000;
            }
            if (class323.field4157.field5469 >= 2 && class323.field4157.field5468 == 6) {
                this.method3695("js5connect_outofdate", -1);
                class504.field6675 = 14;
                return;
            }
            if (class323.field4157.field5469 >= 4 && class323.field4157.field5468 == -1) {
                this.method3695("js5crc", -1);
                class504.field6675 = 14;
                return;
            }
            if (class323.field4157.field5469 >= 4 && class278.method1579(arg0 + 104, class504.field6675)) {
                if (class323.field4157.field5468 == 7 || class323.field4157.field5468 == 9) {
                    this.method3695("js5connect_full", -1);
                } else if (class323.field4157.field5468 <= 0) {
                    this.method3695("js5io", -1);
                } else if (class366.field4660 == null) {
                    this.method3695("js5connect", -1);
                } else {
                    this.method3695("js5proxy_" + class366.field4660.trim(), -1);
                }
                class504.field6675 = 14;
                return;
            }
        }
        class627.field8739 = class323.field4157.field5469;
        if (class224.field2807 > 0) {
            class224.field2807--;
            return;
        }
        try {
            if (class238.field2971 == 0) {
                class419.field5260 = class131.field1628.method1664(0, class590.field8289);
                class238.field2971++;
            }
            if (class238.field2971 == 1) {
                if (class419.field5260.field3358 == 2) {
                    if (class419.field5260.field3356 != null) {
                        class366.field4660 = (String) class419.field5260.field3356;
                    }
                    this.method3812((byte) 125, 1000);
                    return;
                }
                if (class419.field5260.field3358 == 1) {
                    class238.field2971++;
                }
            }
            if (class238.field2971 == 2) {
                class411.field5139 = new class419((Socket) class419.field5260.field3356, class590.field8289);
                class630 var2 = new class630(5);
                var2.method3509(class350.field4471.field2831, (byte) -115);
                var2.method3464(621, -97);
                class411.field5139.method2236(5, 0, (byte) -93, var2.field8804);
                class238.field2971++;
                class71.field966 = class571.method3150(127);
            }
            if (class238.field2971 == 3) {
                if (class278.method1579(125, class504.field6675) || class411.field5139.method2239(-22874) > 0) {
                    int var3 = class411.field5139.method2231(12410);
                    if (var3 != 0) {
                        this.method3812((byte) 125, var3);
                        return;
                    }
                    class238.field2971++;
                } else if (class571.method3150(103) - class71.field966 > 30000L) {
                    this.method3812((byte) 125, 1001);
                    return;
                }
            }
            if (class238.field2971 == 4) {
                boolean var4 = class278.method1579(96, class504.field6675) || class580.method3202(class504.field6675, 0) || class581.method3205(-66, class504.field6675);
                class565[] var5 = class565.method3107(-119);
                class630 var6 = new class630(var5.length * 4);
                class411.field5139.method2234(0, var6.field8804, var6.field8804.length, arg0 + 14227);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method3105(var6.method3483(107), arg0 ^ 0x7C);
                }
                class323.field4157.method2295(arg0 ^ 0xFFFFFF98, !var4, class411.field5139);
                class238.field2971 = 0;
                class411.field5139 = null;
                class419.field5260 = null;
            }
        } catch (IOException var8) {
            this.method3812((byte) 123, 1002);
        }
        if (arg0 != -11) {
            field9536 = -0.5348778F;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBZIF)[[I", line = 2181)
    public static final int[][] method3808(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6, int arg7, float arg8) {
        field9530++;
        int[][] var9 = new int[arg1][arg7];
        class354 var10 = new class354();
        var10.field4506 = (int) (arg8 * 4096.0F);
        var10.field4519 = arg6;
        var10.field4504 = arg2;
        var10.field4513 = arg4;
        var10.field4509 = arg3;
        var10.method46(124);
        if (arg5 != 70) {
            field9541 = null;
        }
        class386.method2076(arg1, (byte) -30, arg7);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method1944(var11, (byte) 31, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lkp;)Z", line = 2212)
    public static final boolean method3809(class507 arg0) {
        if (class253.field3101) {
            if (method3819(arg0).field4678 != 0) {
                return false;
            }
            if (arg0.field6735 == 0) {
                return false;
            }
        }
        return arg0.field6859;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 2225)
    private final void method3810(boolean arg0) {
        field9542++;
        if (!arg0) {
            field9541 = null;
        }
        boolean var2 = class323.field4157.method2289(-98);
        if (!var2) {
            this.method3807(-11);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2242)
    public static final void method3811() {
        int var0 = class596.field8384;
        int[] var1 = class354.field4521;
        int var2 = class380.field4803 ? var0 : class470.field5974 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class687 var4;
            if (var3 < var0) {
                var4 = class351.field4490[var1[var3]];
            } else {
                var4 = ((class206) class180.field2318.method399(-32748, (long) class153.field1958[var3 - var0])).field2618;
            }
            if (var4.field9701 >= 0) {
                int var5 = var4.method2785(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6461 & 0x1FF) == 0 && (var4.field6464 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field6461 & 0x1FF) == 256 && (var4.field6464 & 0x1FF) == 256) {
                    continue;
                }
                var4.field6458 = class467.method2469(var4.field6461, var4.field6470, -20214, var4.field6464);
                class231.method1391(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2286)
    public final void method3710(int arg0) {
        if (class446.field5715) {
            class380.field4801 = 64;
        }
        field9527++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class321.method1838((byte) -112);
        class512.field6955 = new class286(class590.field8289);
        class323.field4157 = new class436();
        class26.method179(new int[] { 1000, 100 }, true, new int[] { 20, 260 });
        if (class591.field8310 != class1.field9) {
            class367.field4670 = new byte[50][];
        }
        class301.field3698 = new class20(class590.field8289);
        if (class591.field8310 == class1.field9) {
            class584.field8165.field3680 = this.getCodeBase().getHost();
        } else if (class631.method3532(1, class591.field8310)) {
            class584.field8165.field3680 = this.getCodeBase().getHost();
            class584.field8165.field3688 = class584.field8165.field3685 + 40000;
            class381.field4817.field3688 = class381.field4817.field3685 + 40000;
            class584.field8165.field3686 = class584.field8165.field3685 + 50000;
            class82.field1091.field3688 = class82.field1091.field3685 + 40000;
            class381.field4817.field3686 = class381.field4817.field3685 + 50000;
            class82.field1091.field3686 = class82.field1091.field3685 + 50000;
        } else if (class591.field8310 == class408.field5117) {
            class584.field8165.field3680 = "127.0.0.1";
            class381.field4817.field3680 = "127.0.0.1";
            class82.field1091.field3680 = "127.0.0.1";
            class584.field8165.field3688 = class584.field8165.field3685 + 40000;
            class381.field4817.field3688 = class381.field4817.field3685 + 40000;
            class82.field1091.field3688 = class82.field1091.field3685 + 40000;
            class584.field8165.field3686 = class584.field8165.field3685 + 50000;
            class381.field4817.field3686 = class381.field4817.field3685 + 50000;
            class82.field1091.field3686 = class82.field1091.field3685 + 50000;
        }
        class676.field9500 = class432.field5407 = class574.field8009 = class600.field8417 = new short[256];
        if (class98.field1337 == class662.field9360) {
            class557.field7743 = false;
        }
        if (class98.field1337 == class641.field9035) {
            class205.field2615 = class162.field2136;
            class267.field3381 = true;
            class130.field1620 = 16777215;
            class8.field161 = class150.field1926;
            class317.field4065 = 0;
        } else {
            class8.field161 = class513.field6963;
            class205.field2615 = class553.field7707;
        }
        class131.field1628 = class584.field8165;
        try {
            class434.field5437 = class520.field7094.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class277.field3470 = class3.method12(class500.field6585, arg0 ^ 0x1F5);
        class289.field3592 = class667.method3743(class500.field6585, 6611, true);
        try {
            if (arg0 != 511) {
                return;
            }
            if (class590.field8289.field9150 != null) {
                class232.field2896 = new class635(class590.field8289.field9150, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class419.field5272[var3] = new class635(class590.field8289.field9155[var3], 6000, 0);
                }
                class657.field9289 = new class635(class590.field8289.field9134, 6000, 0);
                class366.field4657 = new class676(255, class232.field2896, class657.field9289, 500000);
                class546.field7273 = new class635(class590.field8289.field9141, 24, 0);
                class590.field8289.field9150 = null;
                class590.field8289.field9155 = null;
                class590.field8289.field9134 = null;
                class590.field8289.field9141 = null;
            }
        } catch (IOException var5) {
            class657.field9289 = null;
            class366.field4657 = null;
            class546.field7273 = null;
            class232.field2896 = null;
        }
        if (class591.field8310 != class1.field9) {
            class605.field8512 = true;
        }
        if (class98.field1337 == class662.field9360) {
            class530.field7164 = class83.field1103.method476((byte) 101, class250.field3068);
        } else if (class98.field1337 == class641.field9035) {
            class530.field7164 = class83.field1105.method476((byte) 114, class250.field3068);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2410)
    public final void init() {
        field9537++;
        if (!this.method3699(-140)) {
            return;
        }
        class584.field8165 = new class300();
        class584.field8165.field3685 = Integer.parseInt(this.getParameter("worldid"));
        class381.field4817 = new class300();
        class381.field4817.field3685 = Integer.parseInt(this.getParameter("lobbyid"));
        class381.field4817.field3680 = this.getParameter("lobbyaddress");
        class82.field1091 = new class300();
        class82.field1091.field3685 = Integer.parseInt(this.getParameter("demoid"));
        class82.field1091.field3680 = this.getParameter("demoaddress");
        class591.field8310 = class606.method3319((byte) -54, Integer.parseInt(this.getParameter("modewhere")));
        if (class591.field8310 == class408.field5117) {
            class591.field8310 = class557.field7737;
        } else if (!class631.method3532(1, class591.field8310) && class591.field8310 != class1.field9) {
            class591.field8310 = class1.field9;
        }
        class325.field4177 = class510.method2753(Integer.parseInt(this.getParameter("modewhat")), (byte) -98);
        if (class356.field4534 != class325.field4177 && class325.field4177 != class280.field3517 && class559.field7750 != class325.field4177) {
            class325.field4177 = class559.field7750;
        }
        try {
            class250.field3068 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class250.field3068 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class406.field5082 = true;
        } else {
            class406.field5082 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class453.field5814 = true;
        } else {
            class453.field5814 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class545.field7263 = true;
        } else {
            class545.field7263 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class98.field1337 = class662.field9360;
            } else if (var4.equals("1")) {
                class98.field1337 = class641.field9035;
            }
        }
        try {
            class322.field4130 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class322.field4130 = 0;
        }
        class117.field1515 = this.getParameter("quiturl");
        class92.field1288 = this.getParameter("settings");
        if (class92.field1288 == null) {
            class92.field1288 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class157.field2045 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class157.field2045 = 0;
            }
        }
        class484.field6422 = Integer.parseInt(this.getParameter("colourid"));
        if (class484.field6422 < 0 || class511.field6942.length <= class484.field6422) {
            class484.field6422 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class296.field3657 = true;
            class162.field2138 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class112.field1467 = true;
        }
        class180.field2319 = this.getParameter("sskey");
        if (class180.field2319 != null && class180.field2319.length() < 2) {
            class180.field2319 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class446.field5715 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class89.field1237 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class49.field702 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class195.field2446 = this.getParameter("additionalInfo");
        if (class195.field2446 != null && class195.field2446.length() > 50) {
            class195.field2446 = null;
        }
        class520.field7094 = this;
        if (class98.field1337 == class662.field9360) {
            class316.field4060 = 503;
            class593.field8327 = 765;
        } else if (class98.field1337 == class641.field9035) {
            class316.field4060 = 480;
            class593.field8327 = 640;
        }
        this.method3706(class325.field4177.method3822((byte) -114) + 32, (byte) -21, class98.field1337.field1468, 621, class593.field8327, 35, class316.field4060);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 2566)
    public final void method3709(int arg0) {
        if (class665.field9381) {
            class469.method2484(false);
        }
        field9543++;
        class449.method2402(21074);
        if (class32.field452 != null) {
            class32.field452.method3119(1);
        }
        if (class655.field9229 != null) {
            class645.method3604(class655.field9229, class590.field8289, false);
            class655.field9229 = null;
        }
        if (class446.field5686 != null) {
            class446.field5686.method1235(0);
            class446.field5686 = null;
        }
        class112.method625(114);
        class323.field4157.method2291((byte) 76);
        class512.field6955.method1608((byte) -112);
        if (class473.field6005 != null) {
            class473.field6005.method255(false);
            class473.field6005 = null;
        }
        try {
            class232.field2896.method3560((byte) 101);
            for (int var2 = 0; var2 < 35; var2++) {
                class419.field5272[var2].method3560((byte) 101);
            }
            class657.field9289.method3560((byte) 101);
            if (arg0 != -36) {
                field9541 = null;
            }
            class546.field7273.method3560((byte) 101);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 2620)
    public final void method3704(int arg0) {
        if (arg0 != 82) {
            return;
        }
        field9532++;
        if (class651.field9191 != 2) {
            this.method3814(-101);
            return;
        }
        try {
            this.method3814(-101);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class106.method597(var5.getMessage() + " (Recovered) " + this.method3703((byte) -30), -2, var5);
            class393.method2111(0, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 2646)
    private final void method3812(byte arg0, int arg1) {
        class411.field5139 = null;
        class323.field4157.field5469++;
        if (arg0 > 121) {
            class323.field4157.field5468 = arg1;
            class238.field2971 = 0;
            class419.field5260 = null;
            field9540++;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2662)
    private final void method3813(int arg0) {
        if (class504.field6675 == 7 && class367.field4671 == 0) {
            if (class196.field2458 > 1) {
                class16.field266 = class450.field5767;
                class196.field2458--;
            }
            if (!class84.field1188) {
                class477.method2521((byte) 91);
            }
            for (int var2 = 0; var2 < 100 && class266.method1547(true); var2++) {
            }
        }
        if (arg0 <= 21) {
            field9536 = -1.7173753F;
        }
        field9539++;
        class653.field9220++;
        class244.method1452(-1, -1, null, 17274);
        class58.method366((byte) 61, null, -1, -1);
        class23.method169((byte) 98);
        class450.field5767++;
        for (int var3 = 0; var3 < class441.field5585; var3++) {
            class307 var4 = class518.field7076[var3].field2618;
            if (var4 != null) {
                byte var5 = var4.field3902.field8192;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2785(-1);
                    if ((var5 & 0x2) != 0 && var4.field9756 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field9758[0] + var7;
                            int var10 = var4.field9754[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class431.field5395 - var6 - 1 < var9) {
                                var9 = class431.field5395 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class452.field5802 - var6 - 1 < var10) {
                                var10 = class452.field5802 - var6 - 1;
                            }
                            int var11 = class395.method2116(class410.field5129, var6, var4.field9758[0], 0, var10, true, var6, class154.field1991[var4.field6470], var4.field9754[0], var9, true, var6, class105.field1407, -1, 0);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field9758[var12] = class105.field1407[var11 - var12 - 1];
                                    var4.field9754[var12] = class410.field5129[var11 - var12 - 1];
                                    var4.field9752[var12] = 1;
                                }
                                var4.field9756 = var11;
                            }
                        }
                    }
                    class377.method2047(true, var4, (byte) 78);
                    int var13 = class594.method3267((byte) 118, var4);
                    class523.method2852(var13, class454.field5820, var4, -26563, class480.field6388);
                    class81.method470(-6855, var4, class454.field5820);
                    class377.method2050(var4, (byte) 112);
                }
            }
        }
        if (class367.field4671 == 0 && class82.field1097 == 0) {
            if (class296.field3661 == 2) {
                class492.method2648(true);
            } else {
                class55.method354(-1202242076);
            }
            if ((class20.field292 >> 9) < 14 || class431.field5395 - 14 <= class20.field292 >> 9 || (class276.field3464 >> 9) < 14 || class452.field5802 - 14 <= class276.field3464 >> 9) {
                class604.method3311(-16777216);
            }
        }
        while (true) {
            class71 var14;
            class507 var15;
            class507 var16;
            do {
                var14 = (class71) class627.field8738.method244(true);
                if (var14 == null) {
                    while (true) {
                        class71 var17;
                        class507 var18;
                        class507 var19;
                        do {
                            var17 = (class71) class51.field768.method244(true);
                            if (var17 == null) {
                                while (true) {
                                    class71 var20;
                                    class507 var21;
                                    class507 var22;
                                    do {
                                        var20 = (class71) class231.field2884.method244(true);
                                        if (var20 == null) {
                                            if (class358.field4562 != null) {
                                                class353.method1937(7129);
                                            }
                                            if ((class133.field1735 % 1500) == 0) {
                                                class474.method2505(false);
                                            }
                                            if (class504.field6675 == 7 && class367.field4671 == 0) {
                                                class586.method3229(true);
                                            }
                                            class250.method1465(96);
                                            if (class665.field9381 && class571.method3150(116) - 60000L > class591.field8305) {
                                                class469.method2484(false);
                                            }
                                            for (class460 var23 = (class460) class594.field8339.method802((byte) 126); var23 != null; var23 = (class460) class594.field8339.method800((byte) -106)) {
                                                if (class571.method3150(100) / 1000L - 5L > (long) var23.field5846) {
                                                    if (var23.field5844 > 0) {
                                                        class1.method3("", var23.field5847 + class83.field1127.method476((byte) 77, class250.field3068), 5, -1, "", 0, "");
                                                    }
                                                    if (var23.field5844 == 0) {
                                                        class1.method3("", var23.field5847 + class83.field1128.method476((byte) 124, class250.field3068), 5, -1, "", 0, "");
                                                    }
                                                    var23.method3146(2);
                                                }
                                            }
                                            if (class504.field6675 == 7 && class367.field4671 == 0) {
                                                if (class446.field5686 == null) {
                                                    class413.method2189((byte) -20, false);
                                                    return;
                                                }
                                                class589.field8277++;
                                                if (class589.field8277 > 50) {
                                                    class490.field6479++;
                                                    class704 var24 = class314.method1820(class674.field9481, class400.field5014, (byte) -111);
                                                    class122.method654(var24, (byte) -36);
                                                }
                                                try {
                                                    class558.method3071((byte) 79);
                                                    return;
                                                } catch (IOException var25) {
                                                    class413.method2189((byte) 17, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field952;
                                        if (var21.field6834 < 0) {
                                            break;
                                        }
                                        var22 = class156.method894(-1018745488, var21.field6719);
                                    } while (var22 == null || var22.field6707 == null || var21.field6834 >= var22.field6707.length || var22.field6707[var21.field6834] != var21);
                                    class197.method1191(var20);
                                }
                            }
                            var18 = var17.field952;
                            if (var18.field6834 < 0) {
                                break;
                            }
                            var19 = class156.method894(-1018745488, var18.field6719);
                        } while (var19 == null || var19.field6707 == null || var19.field6707.length <= var18.field6834 || var19.field6707[var18.field6834] != var18);
                        class197.method1191(var17);
                    }
                }
                var15 = var14.field952;
                if (var15.field6834 < 0) {
                    break;
                }
                var16 = class156.method894(-1018745488, var15.field6719);
            } while (var16 == null || var16.field6707 == null || var16.field6707.length <= var15.field6834 || var16.field6707[var15.field6834] != var15);
            class197.method1191(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2951)
    private final void method3814(int arg0) {
        field9525++;
        if (class504.field6675 == 14) {
            return;
        }
        long var2 = class361.method1985(-27622) / 1000000L - class133.field1731;
        class133.field1731 = class361.method1985(arg0 - 27521) / 1000000L;
        boolean var4 = class86.method491((byte) 43);
        if (var4 && class639.field8989 && class260.field3213 != null) {
            class260.field3213.method1506(2000);
        }
        if (class253.method1480(-18705, class504.field6675)) {
            if (class86.field1210 != 0L && class571.method3150(arg0 + 206) > class86.field1210) {
                class220.method1301(false, (byte) 126, class301.field3698.field6642, class301.field3698.field6625, class193.method1167(15));
            } else if (!class32.field452.method1067() && class698.field9873) {
                class545.method2943(4);
            }
        }
        if (class655.field9229 == null) {
            Container var5;
            if (class582.field8140 != null) {
                var5 = class582.field8140;
            } else if (class422.field5308 == null) {
                var5 = class678.field9508;
            } else {
                var5 = class422.field5308;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class582.field8140 == var5) {
                Insets var8 = class582.field8140.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class95.field1307 != var6 || class366.field4659 != var7 || class376.field4745) {
                if (class32.field452 == null || class32.field452.method1076()) {
                    class321.method1838((byte) -63);
                } else {
                    class95.field1307 = var6;
                    class366.field4659 = var7;
                }
                class86.field1210 = class571.method3150(99) + 500L;
                class376.field4745 = false;
            }
        }
        if (arg0 != -101) {
            this.method3704(-54);
        }
        if (class655.field9229 != null && !class588.field8273 && class253.method1480(-18705, class504.field6675)) {
            class220.method1301(false, (byte) 126, -1, -1, class301.field3698.field6616);
        }
        boolean var9 = false;
        if (class317.field4067) {
            var9 = true;
            class317.field4067 = false;
        }
        if (var9) {
            class170.method972(arg0 ^ 0xFFFFFF9B);
        }
        if (class32.field452 != null && class32.field452.method1067() || class193.method1167(103) != 1) {
            class544.method2941(arg0 ^ 0xFFFFFF9B);
        }
        if (class278.method1579(42, class504.field6675)) {
            class309.method1786(true, var9);
        } else if (class582.method3209(5, class504.field6675)) {
            class7.method58(117);
        } else if (class91.method529(class504.field6675, arg0 ^ 0xFFFFFFFA)) {
            class7.method58(121);
        } else if (class36.method225((byte) 22, class504.field6675)) {
            if (class655.field9233 == 1) {
                if (class445.field5621 > class588.field8272) {
                    class588.field8272 = class445.field5621;
                }
                int var11 = (class588.field8272 - class445.field5621) * 50 / class588.field8272;
                class112.method627(true, class32.field452, true, class689.field9771, class133.field1729, class83.field1120.method476((byte) 87, class250.field3068) + "<br>(" + var11 + "%)");
            } else if (class655.field9233 == 2) {
                if (class517.field7069 < class508.field6879) {
                    class517.field7069 = class508.field6879;
                }
                int var10 = (class517.field7069 - class508.field6879) * 50 / class517.field7069 + 50;
                class112.method627(true, class32.field452, true, class689.field9771, class133.field1729, class83.field1120.method476((byte) -42, class250.field3068) + "<br>(" + var10 + "%)");
            } else {
                class112.method627(true, class32.field452, true, class689.field9771, class133.field1729, class83.field1120.method476((byte) 88, class250.field3068));
            }
        } else if (class504.field6675 == 10) {
            class203.method1225(11493, var2);
        } else if (class504.field6675 == 13) {
            class112.method627(true, class32.field452, false, class689.field9771, class133.field1729, class83.field1122.method476((byte) 125, class250.field3068) + "<br>" + class83.field1123.method476((byte) 75, class250.field3068));
        }
        if (class273.field3449 == 3) {
            for (int var12 = 0; var12 < class66.field905; var12++) {
                Rectangle var13 = class221.field2711[var12];
                if (class472.field5994[var12]) {
                    class32.field452.method3118(-1996553985, var13.x, var13.y, 1, var13.height, var13.width);
                } else if (class177.field2286[var12]) {
                    class32.field452.method3118(-1996554240, var13.x, var13.y, 1, var13.height, var13.width);
                }
            }
        }
        if (class44.method267(-8908)) {
            class74.method441(arg0 ^ 0x1B, class32.field452);
        }
        if (class590.field8289.field9138 && class253.method1480(-18705, class504.field6675) && class273.field3449 == 0 && class193.method1167(-118) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class66.field905; var17++) {
                if (class177.field2286[var17]) {
                    class177.field2286[var17] = false;
                    class653.field9218[var16++] = class221.field2711[var17];
                }
            }
            try {
                class32.field452.method987(class653.field9218, var16);
            } catch (class180 var18) {
            }
        } else if (!class278.method1579(arg0 + 176, class504.field6675)) {
            for (int var14 = 0; var14 < class66.field905; var14++) {
                class177.field2286[var14] = false;
            }
            try {
                class32.field452.method988();
            } catch (class180 var19) {
                class106.method597(var19.getMessage() + " (Recovered) " + this.method3703((byte) -30), -2, var19);
                class393.method2111(0, true);
            }
        }
        if (class301.field3698.field6617 == 0) {
            class419.method2233(-28448, 15L);
        } else if (class301.field3698.field6617 == 1) {
            class419.method2233(-28448, 10L);
        } else if (class301.field3698.field6617 == 2) {
            class419.method2233(arg0 - 28347, 5L);
        } else if (class301.field3698.field6617 == 3) {
            class419.method2233(-28448, 2L);
        }
        if (class574.field8006) {
            class242.method1446(98);
        }
        if (class301.field3698.field6620 && class504.field6675 == 3 && class316.field4063 != -1) {
            class301.field3698.field6620 = false;
            class301.field3698.method138(class590.field8289, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3203)
    public static final void method3815() {
        class514.field7027 = 0;
        for (int var0 = 0; var0 < class470.field5974; var0++) {
            class307 var1 = ((class206) class180.field2318.method399(-32748, (long) class153.field1958[var0])).field2618;
            if (var1.field9671 && var1.method1775((byte) -7) != -1) {
                int var2 = (var1.method2785(-1) - 1) * 256 + 252;
                int var3 = var1.field6461 - var2 >> 9;
                int var4 = var1.field6464 - var2 >> 9;
                class687 var5 = class228.method1362(var3, var1.field6470, var4, (byte) 23);
                if (var5 != null) {
                    int var6 = var5.field9676;
                    if (var5 instanceof class307) {
                        var6 += 2048;
                    }
                    if (var5.field9726 == 0 && var5.method1775((byte) -7) != -1) {
                        class396.field5000[class514.field7027] = var6;
                        class26.field397[class514.field7027] = var6;
                        class514.field7027++;
                        var5.field9726++;
                    }
                    class396.field5000[class514.field7027] = var6;
                    class26.field397[class514.field7027] = var1.field9676 + 2048;
                    class514.field7027++;
                    var5.field9726++;
                }
            }
        }
        class634.method3543(0, class396.field5000, (byte) 8, class514.field7027 - 1, class26.field397);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)I", line = 3251)
    public static final int method3816(int arg0, byte arg1) {
        field9538++;
        int var2 = -69 / ((39 - arg1) / 63);
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;", line = 3261)
    public final String method3703(byte arg0) {
        field9526++;
        String var2 = null;
        try {
            var2 = "[1)" + class145.field1879 + "," + class630.field8817 + "," + class431.field5395 + "," + class452.field5802 + "|";
            if (class376.field4748 != null) {
                var2 = var2 + "2)" + class476.field6039 + "," + (class376.field4748.field9758[0] + class145.field1879) + "," + (class376.field4748.field9754[0] + class630.field8817) + "|";
            }
            var2 = var2 + "3)" + class651.field9191 + "|4)" + class301.field3698.field6645 + "|5)" + class193.method1167(36) + "|6)" + class523.field7111 + "," + class244.field3022 + "|";
            if (arg0 != -30) {
                field9533 = null;
            }
            var2 = var2 + "7)" + class301.field3698.method2700(-65, class651.field9191) + "|";
            var2 = var2 + "8)" + class301.field3698.method2703(class651.field9191, -110) + "|";
            var2 = var2 + "9)" + class301.field3698.field6631 + "|";
            var2 = var2 + "10)" + class301.field3698.field6604 + "|";
            var2 = var2 + "11)" + class301.field3698.field6648 + "|";
            var2 = var2 + "12)" + class301.field3698.method135(class651.field9191, 92) + "|";
            var2 = var2 + "13)" + class380.field4801 + "|";
            var2 = var2 + "14)" + class504.field6675;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class651.field9191 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field9544 == null ? (field9544 = method3821("client")) : field9544).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
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

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 3347)
    public final void method3705(int arg0) {
        int var2 = -21 / ((arg0 - 58) / 43);
        field9535++;
        if (class651.field9191 != 2) {
            this.method3802(-63);
            return;
        }
        try {
            this.method3802(-84);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            class106.method597(var6.getMessage() + " (Recovered) " + this.method3703((byte) -30), -2, var6);
            class393.method2111(0, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Z", line = 3370)
    public static final boolean method3817(byte arg0, int arg1, int arg2) {
        if (arg0 < 51) {
            return false;
        } else {
            field9528++;
            return false;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3382)
    public static final void method3818(int arg0) {
        int var1 = class596.field8384;
        int[] var2 = class354.field4521;
        for (int var3 = 0; var3 < class470.field5974 + var1; var3++) {
            class687 var4;
            if (var3 < var1) {
                var4 = class351.field4490[var2[var3]];
            } else {
                var4 = ((class206) class180.field2318.method399(-32748, (long) class153.field1958[var3 - var1])).field2618;
            }
            if (var4.field6470 == arg0 && var4.field9701 >= 0) {
                int var5 = var4.method2785(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6461 & 0x1FF) != 0 || (var4.field6464 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field6461 & 0x1FF) != 256 || (var4.field6464 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6461 >> 9;
                    int var7 = var4.field6464 >> 9;
                    if (var4.field9701 > class644.field9052[var6][var7]) {
                        class644.field9052[var6][var7] = var4.field9701;
                        class453.field5805[var6][var7] = 1;
                    } else if (class644.field9052[var6][var7] == var4.field9701) {
                        var10002 = class453.field5805[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field6461 - var8 >> 9;
                    int var10 = var4.field6464 - var8 >> 9;
                    int var11 = var4.field6461 + var8 >> 9;
                    int var12 = var4.field6464 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field9701 > class644.field9052[var13][var14]) {
                                class644.field9052[var13][var14] = var4.field9701;
                                class453.field5805[var13][var14] = 1;
                            } else if (class644.field9052[var13][var14] == var4.field9701) {
                                var10002 = class453.field5805[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lkp;)Lnm;", line = 3480)
    public static final class369 method3819(class507 arg0) {
        class369 var1 = (class369) class39.field523.method399(-32748, ((long) arg0.field6764 << 32) + (long) arg0.field6834);
        return var1 == null ? arg0.field6871 : var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 3484)
    public static void method3820(byte arg0) {
        field9533 = null;
        field9541 = null;
        if (arg0 != -9) {
            field9533 = null;
        }
    }
}
