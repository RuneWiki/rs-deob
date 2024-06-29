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
public class client extends class553 {

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static volatile int field6070 = -1;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "J")
    public static long field6076;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field6078;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field6077;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method2621(byte arg0) {
        field6074++;
        String var2 = null;
        try {
            var2 = "[1)" + class714.field9407 + "," + class240.field3293 + "," + class240.field3280 + "," + class276.field3602 + "|";
            if (class422.field5564 != null) {
                var2 = var2 + "2)" + class309.field3877 + "," + (class422.field5564.field4767[0] + class714.field9407) + "," + (class422.field5564.field4758[0] + class240.field3293) + "|";
            }
            var2 = var2 + "3)" + class485.field6252.field6949.method2402(false) + "|4)" + class485.field6252.field6953.method3350(false) + "|5)" + class400.method2313((byte) -101) + "|6)" + class372.field4550 + "," + class463.field6021 + "|";
            var2 = var2 + "7)" + class485.field6252.field6947.method106(false) + "|";
            var2 = var2 + "8)" + class485.field6252.field6952.method665(false) + "|";
            var2 = var2 + "9)" + class485.field6252.field6951.method1703(false) + "|";
            var2 = var2 + "10)" + class485.field6252.field6913.method3304(false) + "|";
            var2 = var2 + "11)" + class485.field6252.field6936.method3272(false) + "|";
            if (arg0 <= 117) {
                field6076 = -112L;
            }
            var2 = var2 + "12)" + class485.field6252.field6942.method2278(false) + "|";
            var2 = var2 + "13)" + class91.field1248 + "|";
            var2 = var2 + "14)" + class332.field4052;
            if (class231.field3108 != null) {
                var2 = var2 + "|15)" + class231.field3108.field4432;
            }
            try {
                if (class485.field6252.field6949.method2402(false) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field6077 == null ? (field6077 = method2647("client")) : field6077).getClassLoader());
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
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method2622(int arg0) {
        class52.method327((byte) -120);
        field6065++;
        class614.method3280(false);
        class659.method3586((byte) 123);
        class394.method2282((byte) -33);
        class686.method3676(27974);
        class493.method2745((byte) 70);
        class568.method3061(36);
        class641.method3469(false);
        class678.method3651((byte) -119);
        class342.method1987((byte) 124);
        class188.method1319(-23703);
        class597.method3217((byte) 103);
        class337.method1943(false);
        class719.method3856((byte) -62);
        class467.method2613(-249);
        class610.method3266(121);
        class71.method426((byte) -126);
        class66.method387(78);
        class473.method2669(121);
        class465.method2609(-64);
        class570.method3069(0);
        class551.method2982(true);
        class364.method2093(0);
        class28.method119(true);
        class228.method1471(true);
        class661.method3595(-3030);
        class235.method1558(-1);
        class116.method685(126);
        class594.method3203(-23635);
        class30.method158((byte) 35);
        class310.method1825(85);
        class356.method2047(false);
        class382.method2191((byte) -57);
        class684.method3670(104);
        class472.method2662(true);
        class691.method3696(64);
        class511.method2825(false);
        class341.method1978((byte) -97);
        class783.method4295((byte) 86);
        class401.method2319(-64);
        class480.method2691(-16099);
        class117.method696((byte) -103);
        class755.method4095(-86);
        class306.method1806((byte) 54);
        class778.method4267(3350);
        class723.method3868(92);
        class93.method558(-9104);
        class280.method1719((byte) 48);
        class108.method640(-81);
        class37.method224(false);
        class451.method2567(-91);
        class203.method1381((byte) 95);
        class517.method2858(0);
        class232.method1486(true);
        class308.method1813(59);
        class234.method1524(1126);
        class152.method867(-18235);
        class740.method4026(691891335);
        class208.method1401((byte) -120);
        class788.method4316(true);
        class204.method1384(false);
        class340.method1969(0);
        class752.method4081(96);
        class389.method2243(19751);
        class151.method854(8192);
        class391.method2253(true);
        class264.method1671(false);
        class33.method172(0);
        class725.method3882((byte) 80);
        class139.method797(1);
        class652.method3527(-23334);
        class400.method2318(-101);
        class27.method116((byte) 86);
        class13.method58(29);
        class381.method2172(false);
        class766.method4162(-24169);
        class64.method377(93);
        class278.method1708(0);
        class372.method2132(1023);
        class399.method2307((byte) 124);
        class566.method3056((byte) 124);
        class279.method1713(-5347);
        class386.method2222(0);
        class411.method2385(false);
        class303.method1796(-102);
        class230.method1476(true);
        class246.method1607(20467);
        class213.method1416(102);
        class567.method3059(true);
        class31.method164(0);
        class423.method2442(-82);
        class106.method633(-9801);
        class251.method1636(-20292);
        class331.method1915(1932);
        class756.method4103((byte) 79);
        class413.method2392(-3160);
        class350.method2023(100);
        class11.method50((byte) 96);
        class129.method761((byte) 90);
        class299.method1789(0);
        class174.method1090(3);
        class133.method777(24341);
        class589.method3169((byte) -50);
        class19.method86(22228);
        class351.method2026(0);
        class773.method4208(true);
        class615.method3285(27839);
        class358.method2061(0);
        class702.method3802(1);
        class240.method1578(28095);
        class425.method2451(false);
        class48.method304(29081);
        class420.method2428((byte) -114);
        class80.method498(32);
        class627.method3353(-1);
        class611.method3273((byte) -90);
        class305.method1801(-1);
        class252.method1639((byte) -23);
        class17.method79(-1);
        class397.method2295(27);
        class387.method2225((byte) 71);
        class456.method2588(true);
        class24.method108((byte) -117);
        class114.method666(-1);
        class309.method1823((byte) -128);
        class644.method3482((byte) -128);
        class503.method2790(86);
        class617.method3305(true);
        class416.method2404(0);
        class393.method2279(0);
        class276.method1702(123);
        class111.method649(2);
        class271.method1691(4);
        class675.method3635((byte) 10);
        class192.method1342(-114);
        class734.method3993((byte) 112);
        class86.method533(82);
        class600.method3242((byte) 35);
        class291.method1760(-78);
        class15.method61(128);
        class596.method3214(15770);
        class270.method1686(true);
        class166.method1055(81);
        class757.method4118(false);
        class506.method2803(true);
        class620.method3318(true);
        class210.method1410((byte) -49);
        class654.method3541(121);
        class161.method1023(32);
        class632.method3372((byte) -120);
        class327.method1904(108);
        class760.method4145();
        class633.method3377(12);
        class582.method3118(true);
        class433.method2489(0);
        class102.method598(0);
        class784.method4300(127);
        class407.method2364(true);
        class435.method2495(29);
        class338.method1954(-17296);
        class485.method2721(false);
        class206.method1393(24660);
        class4.method12(-10106);
        class170.method1078(-7616);
        class731.method3901((byte) -71);
        class544.method2954(0);
        class685.method3672((byte) -70);
        class527.method2893((byte) -48);
        class402.method2348();
        class190.method1323(true);
        class223.method1448(109);
        class323.method1875((byte) 33);
        class366.method2106(0);
        class628.method3357((byte) -125);
        class325.method1881((byte) 90);
        class118.method706(5);
        class20.method88(8);
        class138.method792(-2343);
        class530.method2901(false);
        class780.method4273(true);
        class266.method1676(-1);
        class486.method2725(3);
        class427.method2471((byte) -12);
        class505.method2796(16383);
        class513.method2835();
        class68.method397((byte) 58);
        class119.method709((byte) 93);
        class56.method341(87);
        class737.method4002((byte) 99);
        class629.method3365(-1);
        class519.method2864((byte) 105);
        class681.method3661(false);
        class454.method2581((byte) 87);
        class624.method3345(-73);
        class619.method3315();
        class134.method780((byte) 122);
        class571.method3080(false);
        class7.method20(-18928);
        class244.method1600(-4042);
        class368.method2115(false);
        class682.method3663(true);
        class735.method3998((byte) -5);
        class417.method2411(31180);
        class590.method3172((byte) -16);
        class721.method3865((byte) -62);
        class121.method720(128);
        class569.method3063(-87);
        class736.method4000(false);
        class491.method2740(-22836);
        class690.method3686();
        class581.method3110(32765);
        class335.method1933((byte) 56);
        class359.method2073(0);
        class153.method871();
        class483.method2716((byte) -74);
        class640.method3451(true);
        class144.method831(13008);
        class148.method846((byte) 82);
        class171.method1079((byte) 40);
        class74.method445();
        class253.method1642((byte) 76);
        class599.method3238(true);
        class23.method103(122);
        class562.method3038(-1);
        class186.method1310(-127);
        class329.method1906(95);
        class510.method2821(true);
        class558.method3024(-23451);
        class57.method346(true);
        class361.method2080(false);
        class376.method2151(-106);
        class330.method1911(-22893);
        class523.method2877(-125);
        class657.method3584(65475);
        class419.method2417(123);
        class336.method1937(1);
        class564.method3050(true);
        class58.method350(-20928);
        class446.method2553(false);
        class324.method1877(true);
        class136.method787((byte) -50);
        class714.method3846((byte) -45);
        class418.method2413((byte) 23);
        class738.method4005(false);
        class622.method3320(2);
        class781.method4284(120);
        class127.method746(0);
        class38.method229((byte) -67);
        class115.method667((byte) 126);
        class89.method543(-19);
        class541.method2943((byte) -61);
        class479.method2686((byte) -72);
        class104.method608((byte) 40);
        class54.method334(78);
        class311.method1831(-18064);
        class746.method4054((byte) -51);
        class193.method1344(0);
        class549.method2974(2);
        class693.method3700(10);
        class219.method1433((byte) -71);
        class638.method3436((byte) -101);
        class572.method3086(true);
        class283.method1731(-1);
        class187.method1317(127);
        class45.method279(-1202);
        class398.method2302(27);
        class576.method3098(68);
        class373.method2138(122);
        class194.method1349(106);
        class26.method114((byte) 83);
        class560.method3033(false);
        class370.method2124(111);
        class507.method2807(7);
        class1.method1(124);
        class167.method1063(-115);
        class196.method1352(-9451);
        class575.method3095((byte) -95);
        class191.method1336(false);
        class374.method2144(-122);
        class645.method3491(-658883001);
        class225.method1454(0);
        class647.method3496(false);
        class464.method2607(false);
        class292.method1762(15754);
        class318.method1859(7);
        class290.method1756(-107);
        class579.method3106(85);
        class88.method540((byte) 61);
        class406.method2362(-32001);
        class443.method2547(true);
        class85.method532(121);
        class538.method2940(519);
        class297.method1773((byte) -123);
        class521.method2875(30784);
        class481.method2702();
        class202.method1376(true);
        class390.method2250((byte) 121);
        class656.method3579(30000);
        class785.method4306((byte) -97);
        class552.method2992(-127);
        class497.method2758((byte) 126);
        class439.method2512((byte) -104);
        class346.method2006(65280);
        class405.method2359((byte) -82);
        class55.method336(-126);
        class181.method1213(0);
        class408.method2374(-89);
        class285.method1738((byte) 125);
        class178.method1142(-114);
        class468.method2649((byte) -50);
        class69.method412();
        class302.method1792(123);
        class790.method4325(-87);
        class792.method4334();
        class707.method3825();
        class501.method2784((byte) -67);
        class459.method2593((byte) -67);
        class672.method3626();
        class563.method3049((byte) -98);
        class81.method512((byte) 55);
        class205.method1389(-101);
        class601.method3246(99);
        class730.method3898(true);
        class540.method2941(-58);
        class42.method255(true);
        class162.method1036((byte) -75);
        class317.method1853(-21023);
        class145.method833(-120);
        class14.method59((byte) -125);
        class288.method1749((byte) 45);
        class298.method1777(52);
        class748.method4061(-31863);
        class384.method2199((byte) 69);
        class729.method3897(119);
        class200.method1369(0);
        class676.method3639(123);
        class679.method3656(-9);
        class584.method3126();
        class286.method1741(false);
        class239.method1575(3);
        class61.method362(-111);
        class165.method1047(-1);
        class470.method2654(73);
        class695.method3705((byte) 109);
        class273.method1695(128);
        class321.method1866(true);
        class395.method2287((byte) 56);
        class651.method3512(0);
        class357.method2055((byte) 21);
        class143.method826(150);
        class602.method3249(0);
        class295.method1769(4);
        class609.method3265((byte) -55);
        class789.method4319(-89);
        class761.method4152((byte) 69);
        class256.method1649(-96);
        class548.method2968((byte) 74);
        class149.method852((byte) -126);
        class231.method1483(-127);
        class82.method519(-121);
        class182.method1223((byte) -11);
        class75.method459((byte) 67);
        class34.method194(-14801);
        class634.method3389((byte) 118);
        class128.method754((byte) -124);
        class520.method2869(-127);
        class745.method4042((byte) 77);
        class375.method2150((byte) 92);
        class333.method1922(false);
        class528.method2899((byte) 68);
        class696.method3755(256);
        class604.method3252(0);
        class73.method433(2);
        class135.method782((byte) -25);
        class588.method3147((byte) -61);
        class779.method4271((byte) 75);
        class542.method2947(1);
        class667.method3618(-2881);
        class113.method662((byte) -42);
        class499.method2769(7);
        class414.method2396(5);
        class687.method3677(-4011);
        class753.method4087(110);
        class83.method528(3);
        class592.method3189(-112);
        class238.method1572(1);
        class179.method1173(0);
        class289.method1752(true);
        class587.method3139();
        class598.method3231(-12);
        class776.method4252((byte) -128);
        class559.method3032((byte) -109);
        class763.method4156(-1090782256);
        class282.method1725((byte) -41);
        class469.method2651(4096);
        class410.method2383(-128);
        class484.method2718(-21990);
        class107.method636(true);
        class120.method716((byte) 77);
        class269.method1684(38);
        class732.method3906(12);
        class110.method645(90);
        class754.method4092((byte) 77);
        class229.method1472(11);
        class452.method2573(100);
        class648.method3499(6);
        class249.method1624(-39);
        class177.method1137(-585072574);
        class751.method4069(118);
        class430.method2481((byte) -85);
        class726.method3885(88);
        class62.method367(-33);
        class316.method1852(false);
        class43.method258(-11550);
        class172.method1081(-29867);
        class606.method3256(-14695);
        class409.method2377((byte) 66);
        class343.method1990((byte) 102);
        class137.method791((byte) 125);
        class743.method4036();
        class383.method2197((byte) -127);
        class498.method2766((byte) -128);
        class332.method1917(23240);
        class436.method2501(-28560);
        class655.method3577(4);
        class664.method3613(-110);
        class201.method1373((byte) -101);
        class377.method2155(58);
        class455.method2585(true);
        class477.method2684(-126);
        class362.method2083((byte) 21);
        class263.method1667(0);
        class301.method1791(0);
        class722.method3866(3553);
        class92.method557(-13360);
        class87.method537(65280);
        class67.method388(48);
        class474.method2673((byte) -11);
        class5.method14(true);
        class787.method4309(127);
        class296.method1770(512);
        class32.method167(-1);
        class154.method874((byte) -27);
        class21.method93(true);
        class448.method2564(18987);
        class155.method875((byte) 126);
        class650.method3505(-31795);
        class515.method2850(-12863);
        class514.method2848(1);
        class169.method1072((byte) 47);
        class281.method1722((byte) -128);
        class561.method3036(1);
        class9.method21((byte) 8);
        class96.method567(106);
        class380.method2166(true);
        class668.method3621(true);
        class130.method764((byte) 113);
        class525.method2887(-11053);
        class512.method2827(108);
        class198.method1360(false);
        class556.method3020(5571);
        class703.method3807(-49);
        class496.method2755(0);
        class565.method3055(-104);
        class218.method1431((byte) -103);
        class500.method2776((byte) 119);
        class392.method2274((byte) -36);
        class101.method580(true);
        class3.method8((byte) -127);
        class254.method1644(14554);
        class141.method804((byte) -99);
        class463.method2603((byte) 113);
        class653.method3537((byte) -67);
        class583.method3120(-256);
        class774.method4228(-116);
        class524.method2885((byte) 125);
        class662.method3606(0);
        int var2 = -3 / ((-arg0 - 46) / 36);
        class176.method1128((byte) 92);
        class29.method124(true);
        class535.method2916(-252136560);
        class294.method1767(34336);
        class494.method2750((byte) 122);
        class40.method251(60);
        class197.method1357(true);
        class595.method3206(-124);
        class438.method2507(108);
        class349.method2018(-128);
        class415.method2399(13);
        class185.method1307(11563);
        class580.method3109(14178);
        class482.method2710(false);
        class215.method1420((byte) -124);
        class207.method1397(-88);
        class488.method2730(-118);
        class718.method3854((byte) 106);
        class578.method3103(22203);
        class713.method3841(20705);
        class573.method3088(4);
        class195.method1350(4096);
        class793.method4337(5607);
        class25.method110(90);
        class168.method1065(5131);
        class585.method3133((byte) 0);
        class461.method2599(0);
        class453.method2575(-6);
        class212.method1413(-963144989);
        class403.method2356(29415);
        class765.method4159(0);
        class504.method2793(false);
        class157.method1005((byte) -61);
        class643.method3481((byte) -60);
        class663.method3611(-275995543);
        class259.method1654(true);
        class704.method3813((byte) 120);
        class444.method2550(-119);
        class226.method1458((byte) 37);
        class319.method1861(27778);
        class221.method1437((byte) 107);
        class689.method3683(-76);
        class91.method551((byte) -109);
        class345.method1998(-22391);
        class63.method372(-31330);
        class268.method1683(-113);
        class698.method3794((byte) 122);
        class490.method2738((byte) -116);
        class41.method253((byte) -111);
        class683.method3668((byte) 114);
        class159.method1016(-52);
        class237.method1569(-8043);
        class224.method1449(-7184);
        class272.method1693((byte) -116);
        class699.method3797(300);
        class450.method2565(-16193);
        class636.method3434(0);
        class412.method2388((byte) -109);
        class72.method428(1);
        class429.method2480(87);
        class77.method474(3);
        class526.method2890(false);
        class518.method2862(true);
        class379.method2164(false);
        class422.method2440((byte) 106);
        class164.method1043(-111);
        class84.method531((byte) -120);
        class547.method2963(false);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method2623(int arg0) {
        field6075++;
        if (class332.field4052 == 14) {
            return;
        }
        class693.field8900++;
        if ((class693.field8900 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class383.field4785 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class540.field6796.setSeed((long) class383.field4785);
        }
        if (arg0 != 167) {
            this.method2623(112);
        }
        if (class693.field8900 % 50 == 0) {
            class486.field6271 = class498.field6386;
            class129.field1730 = class582.field7369;
            class498.field6386 = 0;
            class582.field7369 = 0;
        }
        this.method2636((byte) -31);
        if (class198.field2762 != null) {
            class198.field2762.method2119((byte) -12);
        }
        class475.method2677(arg0 ^ 0xA7);
        class600.method3241(35);
        class679.field8781.method274(false);
        class737.field9980.method211((byte) -94);
        if (class576.field7320 != null) {
            class576.field7320.method963((int) class502.method2786(-7114));
        }
        class488.method2733(-3);
        class470.field6129 = 0;
        class86.field1199 = 0;
        for (class637 var3 = class679.field8781.method270(122); var3 != null; var3 = class679.field8781.method270(122)) {
            int var6 = var3.method369(-89);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method375(3206);
                if (class78.method488(true) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class538.method2939(-100)) {
                        class202.method1379(arg0 - 11804);
                    } else {
                        class337.method1945((byte) 85);
                    }
                } else if (class86.field1199 < 128) {
                    class278.field3615[class86.field1199] = var3;
                    class86.field1199++;
                }
            } else if (var6 == 0 && class470.field6129 < 75) {
                class787.field10782[class470.field6129] = var3;
                class470.field6129++;
            }
        }
        class479.field6200 = 0;
        for (class793 var4 = class737.field9980.method219((byte) 82); var4 != null; var4 = class737.field9980.method219((byte) 88)) {
            int var5 = var4.method1593(20259);
            if (var5 == -1) {
                class234.field3187.method3593(var4, 15);
            } else if (var5 == 6) {
                class479.field6200 += var4.method1590((byte) -3);
            } else if (class167.method1062(var5, arg0 ^ 0xFFFFFF58)) {
                class600.field7629.method3593(var4, arg0 - 152);
                if (class600.field7629.method3597(-107) > 10) {
                    class600.field7629.method3599(-46);
                }
            }
        }
        if (class538.method2939(-71)) {
            class559.method3030(arg0 - 286);
        }
        if (class315.method1845(class332.field4052, 255)) {
            class105.method624(0);
            class116.method676(8);
        } else if (class597.method3225(class332.field4052, (byte) 45)) {
            class145.method834(false);
        }
        if (class217.method1424(false, class332.field4052) && !class597.method3225(class332.field4052, (byte) 45)) {
            this.method2627(-110);
            class194.method1348(false);
            class11.method44(true);
        } else if (class176.method1123(-112, class332.field4052) && !class597.method3225(class332.field4052, (byte) 45)) {
            this.method2627(-105);
            class11.method44(true);
        } else if (class332.field4052 == 12) {
            class11.method44(true);
        } else if (class553.method3008(-22038, class332.field4052) && !class597.method3225(class332.field4052, (byte) 45)) {
            class186.method1314(4);
        } else if (class332.field4052 == 13) {
            class11.method44(true);
            if (class747.field10205 != -3 && class747.field10205 != 2 && class747.field10205 != 15) {
                class480.method2697((byte) 8, false);
            }
        }
        class144.method830(class576.field7320, -15067);
        class600.field7629.method3599(-83);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method2624(byte arg0) {
        if (arg0 <= 80) {
            method2626((byte) -79);
        }
        field6062++;
        if (class485.field6252.field6949.method2402(false) != 2) {
            this.method2642((byte) -93);
            return;
        }
        try {
            this.method2642((byte) -120);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class416.method2401(1, var5, var5.getMessage() + " (Recovered) " + this.method2621((byte) 124));
            class251.field3422 = true;
            class432.method2483((byte) 76, 0, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
    public static final void method2625(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        if (var3 != null) {
            class733.method3911(var3.field10426);
            if (var3.field10426 != null) {
                var3.field10426 = null;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
    public static final int method2626(byte arg0) {
        field6063++;
        if (arg0 != 56) {
            field6076 = -81L;
        }
        return class138.field1827;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method2627(int arg0) {
        field6073++;
        if (class332.field4052 == 7 && class203.field2816 == 0) {
            if (class520.field6618 > 1) {
                class383.field4791 = class518.field6597;
                class520.field6618--;
            }
            if (!class525.field6678) {
                class632.method3371(0);
            }
            for (int var2 = 0; var2 < 100 && class272.method1692((byte) 124); var2++) {
            }
        }
        class621.field7858++;
        class500.method2774(-1, -26279, -1, null);
        class37.method221((byte) -119, -1, null, -1);
        class307.method1812(-17827);
        class518.field6597++;
        int var3 = 30 % ((arg0 + 29) / 56);
        for (int var4 = 0; var4 < class750.field10228; var4++) {
            class727 var5 = class542.field6811[var4].field3125;
            if (var5 != null) {
                byte var6 = var5.field9545.field3308;
                if ((var6 & 0x1) != 0) {
                    int var7 = var5.method190((byte) -114);
                    if ((var6 & 0x2) != 0 && var5.field4764 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var9 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var8 != 0 || var9 != 0) {
                            int var10 = var5.field4767[0] + var8;
                            int var11 = var5.field4758[0] + var9;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class240.field3280 - (var7 + 1))) {
                                var10 = class240.field3280 - var7 - 1;
                            }
                            if (var11 < 0) {
                                var11 = 0;
                            } else if (var11 > (class276.field3602 - (var7 + 1))) {
                                var11 = class276.field3602 - var7 - 1;
                            }
                            int var12 = class15.method64(var5.field4767[0], -1, (byte) 103, 0, 0, class106.field1449, var5.field4758[0], var10, var7, var7, var11, var7, true, class299.field3792, class179.field2391[var5.field2895]);
                            if (var12 > 0) {
                                if (var12 > 9) {
                                    var12 = 9;
                                }
                                for (int var13 = 0; var13 < var12; var13++) {
                                    var5.field4767[var13] = class106.field1449[var12 - var13 - 1];
                                    var5.field4758[var13] = class299.field3792[var12 - var13 - 1];
                                    var5.field4761[var13] = 1;
                                }
                                var5.field4764 = var12;
                            }
                        }
                    }
                    class204.method1386(6144, true, var5);
                    int var14 = class106.method631(var5, 91);
                    class461.method2598(var5, 1073741823);
                    class503.method2788(-113, var14, class463.field6020, var5, class781.field10681);
                    class393.method2281(class781.field10681, var5, 0);
                    class540.method2942(var5, -17946);
                }
            }
        }
        if (class203.field2816 == 0 && class778.field10629 == 0) {
            if (class507.field6476 == 2) {
                class184.method1304(-3030);
            } else {
                class83.method527(3);
            }
            if (class97.field1309 >> 9 < 14 || (class240.field3280 - 14) <= (class97.field1309 >> 9) || (class148.field1890 >> 9) < 14 || class148.field1890 >> 9 >= class276.field3602 - 14) {
                class395.method2288(0);
            }
        }
        while (true) {
            class244 var15;
            class391 var16;
            class391 var17;
            do {
                var15 = (class244) class191.field2683.method3599(-47);
                if (var15 == null) {
                    while (true) {
                        class244 var18;
                        class391 var19;
                        class391 var20;
                        do {
                            var18 = (class244) class357.field4356.method3599(-50);
                            if (var18 == null) {
                                while (true) {
                                    class244 var21;
                                    class391 var22;
                                    class391 var23;
                                    do {
                                        var21 = (class244) class251.field3427.method3599(-122);
                                        if (var21 == null) {
                                            if (class430.field5649 != null) {
                                                class366.method2102((byte) -34);
                                            }
                                            if (class693.field8900 % 1500 == 0) {
                                                class393.method2280(95);
                                            }
                                            if (class332.field4052 == 7 && class203.field2816 == 0) {
                                                class470.method2658(33);
                                            }
                                            class400.method2317((byte) -118);
                                            if (class564.field7164 && class17.field168 < (class502.method2786(-7114) - 60000L)) {
                                                class399.method2308((byte) 80);
                                            }
                                            for (class713 var24 = (class713) class414.field5484.method857(-110); var24 != null; var24 = (class713) class414.field5484.method864(true)) {
                                                if (((long) var24.field9398) < (class502.method2786(-7114) / 1000L - 5L)) {
                                                    if (var24.field9399 > 0) {
                                                        class416.method2405(0, "", "", "", var24.field9401 + class659.field8563.method3589(class496.field6338, -22395), 5, -1);
                                                    }
                                                    if (var24.field9399 == 0) {
                                                        class416.method2405(0, "", "", "", var24.field9401 + class659.field8564.method3589(class496.field6338, -22395), 5, -1);
                                                    }
                                                    var24.method3306(false);
                                                }
                                            }
                                            if (class332.field4052 == 7 && class203.field2816 == 0) {
                                                if (class252.field3437 == null) {
                                                    class480.method2697((byte) 125, false);
                                                    return;
                                                }
                                                class341.field4177++;
                                                if (class341.field4177 > 50) {
                                                    class358.field4376++;
                                                    class13 var25 = class659.method3587(class68.field909, 98, class230.field3098);
                                                    class116.method679(var25, 0);
                                                }
                                                try {
                                                    class610.method3269(24);
                                                    return;
                                                } catch (IOException var26) {
                                                    class480.method2697((byte) -48, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var22 = var21.field3350;
                                        if (var22.field5039 < 0) {
                                            break;
                                        }
                                        var23 = class738.method4006(96, var22.field5136);
                                    } while (var23 == null || var23.field5145 == null || var22.field5039 >= var23.field5145.length || var23.field5145[var22.field5039] != var22);
                                    class760.method4148(var21);
                                }
                            }
                            var19 = var18.field3350;
                            if (var19.field5039 < 0) {
                                break;
                            }
                            var20 = class738.method4006(35, var19.field5136);
                        } while (var20 == null || var20.field5145 == null || var19.field5039 >= var20.field5145.length || var20.field5145[var19.field5039] != var19);
                        class760.method4148(var18);
                    }
                }
                var16 = var15.field3350;
                if (var16.field5039 < 0) {
                    break;
                }
                var17 = class738.method4006(106, var16.field5136);
            } while (var17 == null || var17.field5145 == null || var16.field5039 >= var17.field5145.length || var17.field5145[var16.field5039] != var16);
            class760.method4148(var15);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2628() {
        int var0 = class20.field189;
        int[] var1 = class503.field6451;
        int var2 = class480.field6205 ? var0 : class349.field4271 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class381 var4;
            if (var3 < var0) {
                var4 = class263.field3508[var1[var3]];
            } else {
                var4 = ((class232) class444.field5811.method2616((long) class88.field1224[var3 - var0], (byte) -87)).field3125;
            }
            if (var4.field4683 >= 0) {
                int var5 = var4.method190((byte) -83);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2896 & 0x1FF) == 0 && (var4.field2900 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field2896 & 0x1FF) == 256 && (var4.field2900 & 0x1FF) == 256) {
                    continue;
                }
                var4.field2892 = class512.method2831(var4.field2895, (byte) -41, var4.field2896, var4.field2900);
                class376.method2154(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JIZI)V")
    public static final void method2629(long arg0, int arg1, boolean arg2, int arg3) {
        field6068++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        if (!arg2) {
            field6076 = 84L;
        }
        int var6 = ((int) arg0 & 0x3DC052) >> 20;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class11.method48(55, arg3, var6, arg1, 0, var5, 0, 0, true);
            return;
        }
        class773 var8 = class390.field4983.method4292(var7, (byte) -107);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field10466;
            var9 = var8.field10484;
        } else {
            var9 = var8.field10466;
            var10 = var8.field10484;
        }
        int var11 = var8.field10516;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class11.method48(66, arg3, 0, arg1, var10, 0, var11, var9, true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Luaa;)Z")
    public static final boolean method2630(class391 arg0) {
        if (class538.field6782) {
            if (method2637(arg0).field4547 != 0) {
                return false;
            }
            if (arg0.field5007 == 0) {
                return false;
            }
        }
        return arg0.field4986;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Luaa;)Luaa;")
    public static final class391 method2631(class391 arg0) {
        int var1 = method2637(arg0).method2128((byte) -87);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class738.method4006(56, arg0.field5136);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method2632(int arg0) {
        field6066++;
        if (class485.field6252.field6949.method2402(false) == 2) {
            try {
                this.method2623(167);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class416.method2401(1, var5, var5.getMessage() + " (Recovered) " + this.method2621((byte) 120));
                class251.field3422 = true;
                class432.method2483((byte) 76, 0, false);
            }
        } else {
            this.method2623(167);
        }
        if (arg0 != 4) {
            field6076 = 123L;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method2633(int arg0) {
        int var1 = class20.field189;
        int[] var2 = class503.field6451;
        int var3 = class480.field6205 ? var1 : class349.field4271 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class381 var5;
            if (var4 < var1) {
                var5 = class263.field3508[var2[var4]];
            } else {
                var5 = ((class232) class444.field5811.method2616((long) class88.field1224[var4 - var1], (byte) 99)).field3125;
            }
            if (var5.field2895 == arg0) {
                var5.field4733 = 0;
                if (var5.field4683 < 0) {
                    var5.field4688 = false;
                } else {
                    int var6 = var5.method190((byte) 108);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field2896 & 0x1FF) != 0 || (var5.field2900 & 0x1FF) != 0) {
                            var5.field4688 = false;
                            continue;
                        }
                    } else if ((var5.field2896 & 0x1FF) != 256 || (var5.field2900 & 0x1FF) != 256) {
                        var5.field4688 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field2896 >> 9;
                        int var8 = var5.field2900 >> 9;
                        if (class310.field3885[var7][var8] != var5.field4683) {
                            var5.field4688 = true;
                            continue;
                        }
                        if (class562.field7136[var7][var8] > 1) {
                            var10002 = class562.field7136[var7][var8]--;
                            var5.field4688 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field2896 - var9 >> 9;
                        int var11 = var5.field2900 - var9 >> 9;
                        int var12 = var5.field2896 + var9 >> 9;
                        int var13 = var5.field2900 + var9 >> 9;
                        if (!class382.method2188(var5.field4683, var12, var13, var10, var11, -76)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class310.field3885[var14][var15] == var5.field4683) {
                                        var10002 = class562.field7136[var14][var15]--;
                                    }
                                }
                            }
                            var5.field4688 = true;
                            continue;
                        }
                    }
                    var5.field4688 = false;
                    var5.field2892 = class512.method2831(var5.field2895, (byte) 113, var5.field2896, var5.field2900);
                    class376.method2154(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method2634(boolean arg0) {
        field6071++;
        if (class722.field9484.field1548 > class533.field6740) {
            class379.field4640.method1602(-89);
            class536.field6760 = (class722.field9484.field1548 * 50 - 50) * 5;
            if (class536.field6760 > 3000) {
                class536.field6760 = 3000;
            }
            if (class722.field9484.field1548 >= 2 && class722.field9484.field1550 == 6) {
                this.method3000(!arg0, "js5connect_outofdate");
                class332.field4052 = 14;
                return;
            }
            if (class722.field9484.field1548 >= 4 && class722.field9484.field1550 == -1) {
                this.method3000(false, "js5crc");
                class332.field4052 = 14;
                return;
            }
            if (class722.field9484.field1548 >= 4 && class315.method1845(class332.field4052, 255)) {
                if (class722.field9484.field1550 == 7 || class722.field9484.field1550 == 9) {
                    this.method3000(false, "js5connect_full");
                } else if (class722.field9484.field1550 <= 0) {
                    this.method3000(false, "js5io");
                } else if (class71.field969 == null) {
                    this.method3000(false, "js5connect");
                } else {
                    this.method3000(false, "js5proxy_" + class71.field969.trim());
                }
                class332.field4052 = 14;
                return;
            }
        }
        class533.field6740 = class722.field9484.field1548;
        if (class536.field6760 > 0) {
            class536.field6760--;
            return;
        }
        if (!arg0) {
            method2631(null);
        }
        try {
            if (class204.field2824 == 0) {
                class783.field10716 = class379.field4640.method1604((byte) 96, class740.field10014);
                class204.field2824++;
            }
            if (class204.field2824 == 1) {
                if (class783.field10716.field4144 == 2) {
                    if (class783.field10716.field4142 != null) {
                        class71.field969 = (String) class783.field10716.field4142;
                    }
                    this.method2635((byte) -124, 1000);
                    return;
                }
                if (class783.field10716.field4144 == 1) {
                    class204.field2824++;
                }
            }
            if (class204.field2824 == 2) {
                class29.field264 = new class235((Socket) class783.field10716.field4142, class740.field10014, 25000);
                class234 var2 = new class234(5);
                var2.method1491(-129, class117.field1577.field1774);
                var2.method1496(647, (byte) 108);
                class29.field264.method1562(var2.field3193, false, 0, 5);
                class204.field2824++;
                class316.field3931 = class502.method2786(-7114);
            }
            if (class204.field2824 == 3) {
                if (class315.method1845(class332.field4052, 255) || class29.field264.method1565(20045) > 0) {
                    int var3 = class29.field264.method1557((byte) 119);
                    if (var3 != 0) {
                        this.method2635((byte) -127, var3);
                        return;
                    }
                    class204.field2824++;
                } else if ((class502.method2786(-7114) - class316.field3931) > 30000L) {
                    this.method2635((byte) -117, 1001);
                    return;
                }
            }
            if (class204.field2824 == 4) {
                boolean var4 = class315.method1845(class332.field4052, 255) || class217.method1424(false, class332.field4052) || class176.method1123(125, class332.field4052);
                class641[] var5 = class641.method3468((byte) 124);
                class234 var6 = new class234(var5.length * 4);
                class29.field264.method1564(var6.field3193.length, 0, var6.field3193, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method3472((byte) -80, var6.method1497((byte) 115));
                }
                class722.field9484.method677(!var4, 0, class29.field264);
                class783.field10716 = null;
                class204.field2824 = 0;
                class29.field264 = null;
            }
        } catch (IOException var8) {
            this.method2635((byte) -125, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method2635(byte arg0, int arg1) {
        class29.field264 = null;
        class783.field10716 = null;
        class204.field2824 = 0;
        class722.field9484.field1550 = arg1;
        if (arg0 > -116) {
            method2644();
        }
        class722.field9484.field1548++;
        field6060++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method2636(byte arg0) {
        field6064++;
        boolean var2 = class722.field9484.method671(arg0 + 117);
        if (!var2) {
            this.method2634(true);
        }
        if (arg0 != -31) {
            field6076 = -78L;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Luaa;)Lb;")
    public static final class372 method2637(class391 arg0) {
        class372 var1 = (class372) class14.field145.method2616(((long) arg0.field5151 << 32) + (long) arg0.field5039, (byte) 15);
        return var1 == null ? arg0.field5053 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2638() {
        class757.field10320 = 0;
        for (int var0 = 0; var0 < class349.field4271; var0++) {
            class727 var1 = ((class232) class444.field5811.method2616((long) class88.field1224[var0], (byte) 103)).field3125;
            if (var1.field4688 && var1.method183(-21397) != -1) {
                int var2 = (var1.method190((byte) 96) - 1) * 256 + 252;
                int var3 = var1.field2896 - var2 >> 9;
                int var4 = var1.field2900 - var2 >> 9;
                class381 var5 = class177.method1139(var1.field2895, var4, false, var3);
                if (var5 != null) {
                    int var6 = var5.field4737;
                    if (var5 instanceof class727) {
                        var6 += 2048;
                    }
                    if (var5.field4733 == 0 && var5.method183(-21397) != -1) {
                        class576.field7317[class757.field10320] = var6;
                        class641.field8226[class757.field10320] = var6;
                        class757.field10320++;
                        var5.field4733++;
                    }
                    class576.field7317[class757.field10320] = var6;
                    class641.field8226[class757.field10320] = var1.field4737 + 2048;
                    class757.field10320++;
                    var5.field4733++;
                }
            }
        }
        class71.method423(29708, 0, class576.field7317, class757.field10320 - 1, class641.field8226);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final synchronized void method2639(int arg0) {
        field6067++;
        if (class80.field1134 != null && class678.field8763 == null && !class740.field10014.field10581) {
            try {
                Class var2 = class80.field1134.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class678.field8763 = (Canvas) var3.get(class80.field1134);
                var3.set(class80.field1134, null);
                if (class678.field8763 != null) {
                    return;
                }
            } catch (Exception var5) {
            }
        }
        int var4 = -83 % ((-arg0 - 47) / 60);
        super.method2639(52);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method2640(byte arg0) {
        field6069++;
        if (class160.field2079) {
            class91.field1248 = 64;
        }
        Frame var2 = new Frame("Jagex");
        if (arg0 > -67) {
            field6076 = -82L;
        }
        var2.pack();
        var2.dispose();
        class398.method2301(120);
        class161.field2125 = new class554(class740.field10014);
        class722.field9484 = new class116();
        class117.method698(0, new int[] { 20, 260 }, new int[] { 1000, 100 });
        if (class611.field7718 != class290.field3701) {
            class685.field8829 = new byte[50][];
        }
        class485.field6252 = class61.method361((byte) -124);
        if (class611.field7718 == class290.field3701) {
            class219.field2988.field3374 = this.getCodeBase().getHost();
        } else if (class689.method3679(class611.field7718, -117)) {
            class219.field2988.field3374 = this.getCodeBase().getHost();
            class219.field2988.field3379 = class219.field2988.field3371 + 40000;
            class185.field2596.field3379 = class185.field2596.field3371 + 40000;
            class219.field2988.field3366 = class219.field2988.field3371 + 50000;
            class376.field4589.field3379 = class376.field4589.field3371 + 40000;
            class185.field2596.field3366 = class185.field2596.field3371 + 50000;
            class376.field4589.field3366 = class376.field4589.field3371 + 50000;
        } else if (class611.field7718 == class169.field2235) {
            class219.field2988.field3374 = "127.0.0.1";
            class185.field2596.field3374 = "127.0.0.1";
            class376.field4589.field3374 = "127.0.0.1";
            class219.field2988.field3379 = class219.field2988.field3371 + 40000;
            class185.field2596.field3379 = class185.field2596.field3371 + 40000;
            class219.field2988.field3366 = class219.field2988.field3371 + 50000;
            class376.field4589.field3379 = class376.field4589.field3371 + 40000;
            class185.field2596.field3366 = class185.field2596.field3371 + 50000;
            class376.field4589.field3366 = class376.field4589.field3371 + 50000;
        }
        class155.field1972 = class333.field4069 = class120.field1618 = class552.field6962 = new short[256];
        if (class433.field5672 == class201.field2799) {
            class542.field6809 = false;
        }
        if (class201.field2799 == class186.field2600) {
            class698.field9249 = true;
            class493.field6321 = class389.field4966;
            class45.field513 = class569.field7187;
            class661.field8617 = 16777215;
            class14.field148 = 0;
        } else if (class201.field2799 == class177.field2329) {
            class493.field6321 = class237.field3234;
            class45.field513 = class240.field3323;
        } else {
            class45.field513 = class547.field6833;
            class493.field6321 = class592.field7511;
        }
        class379.field4640 = class219.field2988;
        try {
            class423.field5566 = class102.field1382.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class679.field8781 = class757.method4114(2, class678.field8763);
        class737.field9980 = class777.method4260(true, class678.field8763, true);
        try {
            if (class740.field10014.field10585 != null) {
                class358.field4374 = new class222(class740.field10014.field10585, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class422.field5559[var3] = new class222(class740.field10014.field10562[var3], 6000, 0);
                }
                class200.field2783 = new class222(class740.field10014.field10578, 6000, 0);
                class40.field463 = new class310(255, class358.field4374, class200.field2783, 500000);
                class409.field5432 = new class222(class740.field10014.field10570, 24, 0);
                class740.field10014.field10585 = null;
                class740.field10014.field10570 = null;
                class740.field10014.field10562 = null;
                class740.field10014.field10578 = null;
            }
        } catch (IOException var5) {
            class409.field5432 = null;
            class40.field463 = null;
            class358.field4374 = null;
            class200.field2783 = null;
        }
        if (class611.field7718 != class290.field3701) {
            class520.field6621 = true;
        }
        class212.field2922 = class659.field8556.method3589(class496.field6338, -22395);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Luaa;IIIIIIIIIII)V")
    public static final void method2641(class391[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class391 var13 = arg0[var12];
            if (var13 != null && var13.field5136 == arg1) {
                int var14 = var13.field5119 + arg6;
                int var15 = var13.field5003 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field5007 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field5117 + var14;
                    int var21 = var13.field5031 + var15;
                    if (var13.field5007 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field5007 == 0 || var13.field5098 || method2637(var13).field4547 != 0 || class198.field2759 == var13 || class131.field1737 == var13.field5110 || class4.field52 == var13.field5110) {
                    if (!method2630(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class602.field7657) {
                            var22 = class498.method2765((byte) -127);
                            var23 = class507.method2806((byte) -128);
                        }
                        if (class430.field5649 == var13 && class648.method3500(class430.field5649, true) != null) {
                            class757.field10331 = true;
                            class397.field5232 = var14;
                            class499.field6396 = var15;
                        }
                        if (var13.field5060 || var16 < var18 && var17 < var19) {
                            if (var13.field5121 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class244 var24 = (class244) class251.field3427.method3591(0); var24 != null; var24 = (class244) class251.field3427.method3600((byte) 114)) {
                                    if (var24.field3347) {
                                        var24.method1946(-10364);
                                        var24.field3350.field5078 = false;
                                    }
                                }
                                if (class369.field4527 == 0) {
                                    class430.field5649 = null;
                                    class198.field2759 = null;
                                }
                                class412.field5459 = 0;
                                class686.field8838 = false;
                                class488.field6294 = false;
                                if (!class525.field6678) {
                                    class632.method3371(0);
                                }
                            }
                            boolean var25;
                            if (class737.field9980.method210(0) + var22 >= var16 && class737.field9980.method208(-105) + var23 >= var17 && class737.field9980.method210(0) + var22 < var18 && class737.field9980.method208(-106) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class47.field549 && var25) {
                                if (var13.field5153 >= 0) {
                                    class20.field185 = var13.field5153;
                                } else if (var13.field5121) {
                                    class20.field185 = -1;
                                }
                            }
                            if (!class525.field6678 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class668.method3620(false, arg10 - var14, arg11 - var15, var13);
                            }
                            boolean var26 = false;
                            if (class737.field9980.method213(1) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class793 var28 = (class793) class600.field7629.method3591(0);
                            if (var28 != null && var28.method1593(20259) == 0 && var28.method1592(-19898) + var22 >= var16 && var28.method1591(99) + var23 >= var17 && var28.method1592(-19898) + var22 < var18 && var28.method1591(83) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field5052 != null && !class538.method2939(-13)) {
                                for (int var29 = 0; var29 < var13.field5052.length; var29++) {
                                    if (class679.field8781.method271((byte) 94, var13.field5052[var29])) {
                                        if (var13.field5047 == null || class693.field8900 >= var13.field5047[var29]) {
                                            byte var30 = var13.field5076[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class679.field8781.method271((byte) 120, 86) && !class679.field8781.method271((byte) 98, 82) && !class679.field8781.method271((byte) 102, 81)) && ((var30 & 0x2) == 0 || class679.field8781.method271((byte) 91, 86)) && ((var30 & 0x1) == 0 || class679.field8781.method271((byte) 96, 82)) && ((var30 & 0x4) == 0 || class679.field8781.method271((byte) 124, 81))) {
                                                if (var29 < 10) {
                                                    class318.method1857(var29 + 1, 0, "", var13.field5151, -1);
                                                } else if (var29 == 10) {
                                                    class38.method230((byte) 71);
                                                    class372 var31 = method2637(var13);
                                                    class434.method2493(-79, var13, var31.field4548, var31.method2130((byte) -117));
                                                    class726.field9525 = class581.method3113(1482, var13);
                                                    if (class726.field9525 == null) {
                                                        class726.field9525 = "Null";
                                                    }
                                                    class130.field1732 = var13.field5008 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field5140[var29];
                                                if (var13.field5047 == null) {
                                                    var13.field5047 = new int[var13.field5052.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field5047[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field5047[var29] = class693.field8900 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field5047 != null) {
                                        var13.field5047[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class515.method2852(var13, var23 + var28.method1591(-65) - var15, var22 + var28.method1592(-19898) - var14, 125);
                            }
                            if (class430.field5649 != null && class430.field5649 != var13 && var25 && method2637(var13).method2129(true)) {
                                class652.field8356 = var13;
                            }
                            if (class198.field2759 == var13) {
                                class553.field7004 = true;
                                class72.field978 = var14;
                                class330.field4040 = var15;
                            }
                            if (var13.field5098 || var13.field5110 != 0) {
                                if (var25 && class479.field6200 != 0 && var13.field5054 != null) {
                                    class244 var33 = new class244();
                                    var33.field3347 = true;
                                    var33.field3350 = var13;
                                    var33.field3358 = class479.field6200;
                                    var33.field3349 = var13.field5054;
                                    class251.field3427.method3593(var33, 15);
                                }
                                if (class430.field5649 != null || class525.field6678 || class232.field3121 != var13.field5110 && class412.field5459 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field5110 != 0) {
                                    if (class66.field870 == var13.field5110 || class638.field8117 == var13.field5110) {
                                        class377.field4620 = var13;
                                        if (class38.field430 != null) {
                                            class38.field430.method355(var13.field5031, (byte) 13, class576.field7320);
                                        }
                                        if (class66.field870 == var13.field5110) {
                                            if (class525.field6678 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class599.method3236(-11466, arg9, class576.field7320, arg8);
                                            class622 var34 = (class622) class168.field2229.method857(-121);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field7864 && arg10 < var34.field7871 && arg11 >= var34.field7866 && arg11 < var34.field7869) {
                                                    class632.method3371(0);
                                                    class350.method2022((byte) -102, var34.field7865);
                                                }
                                                var34 = (class622) class168.field2229.method864(true);
                                            }
                                        }
                                    }
                                    if (class131.field1737 == var13.field5110) {
                                        if (var13.method2251(true, class576.field7320) == null || class380.field4658 != 0 && class380.field4658 != 3 || class525.field6678 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field5086[var36];
                                        if (var35 < var37 || var35 > var13.field5105[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field5117 / 2;
                                        int var39 = var36 - var13.field5031 / 2;
                                        int var40;
                                        if (class507.field6476 == 4) {
                                            var40 = (int) class698.field9250 & 0x3FFF;
                                        } else {
                                            var40 = (int) class698.field9250 + class757.field10329 & 0x3FFF;
                                        }
                                        int var41 = class541.field6805[var40];
                                        int var42 = class541.field6806[var40];
                                        if (class507.field6476 != 4) {
                                            var41 = (class718.field9432 + 256) * var41 >> 8;
                                            var42 = (class718.field9432 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class507.field6476 == 4) {
                                            var45 = (class12.field125 >> 9) + (var43 >> 2);
                                            var46 = (class433.field5674 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class422.field5564.method190((byte) 101) - 1) * 256;
                                            var45 = (class422.field5564.field2896 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class422.field5564.field2900 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class47.field549 && (class610.field7710 & 0x40) != 0) {
                                            class391 var48 = class752.method4075(class170.field2260, (byte) -88, class777.field10600);
                                            if (var48 == null) {
                                                class38.method230((byte) 102);
                                            } else {
                                                class259.method1655(class726.field9525, false, var13.field5128, class559.field7106, 6070, true, 1L, var46, 5, (long) (var13.field5039 << 0 | var13.field5151), var45, " ->", true);
                                            }
                                            continue;
                                        }
                                        if (class201.field2799 == class186.field2600) {
                                            class259.method1655(class659.field8571.method3589(class496.field6338, -22395), false, -1, -1, 6070, true, 1L, var46, 4, 0L, var45, "", true);
                                        }
                                        class259.method1655(class494.field6324, false, -1, class67.field882, 6070, true, 1L, var46, 16, 0L, var45, "", true);
                                        continue;
                                    }
                                    if (class232.field3121 == var13.field5110) {
                                        class558.field7088 = var13;
                                        if (var25) {
                                            class686.field8838 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1592(-19898) - var14 - var13.field5117 / 2) * 2.0D / (double) class402.field5335);
                                            int var50 = (int) (-((double) (var23 + var28.method1591(114) - var15 - var13.field5031 / 2) * 2.0D / (double) class402.field5335));
                                            int var51 = class669.field8692 + var49 + class402.field5357;
                                            int var52 = class238.field3238 + var50 + class402.field5347;
                                            class389 var53 = class757.method4115((byte) 45);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method2242(var54, 40, var51, var52);
                                            if (var54 != null) {
                                                if (class679.field8781.method271((byte) 114, 82) && class20.field186 > 0) {
                                                    class119.method710(var54[1], 0, var54[2], var54[0]);
                                                    continue;
                                                }
                                                class488.field6294 = true;
                                                class740.field10022 = var54[0];
                                                class283.field3659 = var54[1];
                                                class376.field4591 = var54[2];
                                            }
                                            class412.field5459 = 1;
                                            class9.field74 = false;
                                            class251.field3426 = class737.field9980.method210(0);
                                            class307.field3858 = class737.field9980.method208(-73);
                                            continue;
                                        }
                                        if (var26 && class412.field5459 > 0) {
                                            if (class412.field5459 == 1 && (class251.field3426 != class737.field9980.method210(0) || class307.field3858 != class737.field9980.method208(-40))) {
                                                class544.field6818 = class669.field8692;
                                                class549.field6889 = class238.field3238;
                                                class412.field5459 = 2;
                                            }
                                            if (class412.field5459 == 2) {
                                                class9.field74 = true;
                                                class299.method1788(class544.field6818 + (int) ((double) (class251.field3426 - class737.field9980.method210(0)) * 2.0D / (double) class402.field5336), (byte) -125);
                                                class629.method3364(class549.field6889 - (int) ((double) (class307.field3858 - class737.field9980.method208(-36)) * 2.0D / (double) class402.field5336), -14181);
                                            }
                                            continue;
                                        }
                                        if (class412.field5459 > 0 && !class9.field74) {
                                            if ((class484.field6248 == 1 || class631.method3367(true)) && class628.field7982 > 2) {
                                                class652.method3525(class307.field3858, (byte) -85, class251.field3426);
                                            } else if (class675.method3638(0)) {
                                                class652.method3525(class307.field3858, (byte) -42, class251.field3426);
                                            }
                                        }
                                        class412.field5459 = 0;
                                        continue;
                                    }
                                    if (class621.field7859 == var13.field5110) {
                                        if (var26) {
                                            class765.method4160(123, var22 + class737.field9980.method210(0) - var14, var13.field5117, var13.field5031, var23 + class737.field9980.method208(-39) - var15);
                                        }
                                        continue;
                                    }
                                    if (class4.field52 == var13.field5110) {
                                        class37.method221((byte) -103, var15, var13, var14);
                                        continue;
                                    }
                                }
                                if (!var13.field5038 && var27) {
                                    var13.field5038 = true;
                                    if (var13.field5158 != null) {
                                        class244 var55 = new class244();
                                        var55.field3347 = true;
                                        var55.field3350 = var13;
                                        var55.field3346 = var22 + var28.method1592(-19898) - var14;
                                        var55.field3358 = var23 + var28.method1591(-13) - var15;
                                        var55.field3349 = var13.field5158;
                                        class251.field3427.method3593(var55, 15);
                                    }
                                }
                                if (var13.field5038 && var26 && var13.field5111 != null) {
                                    class244 var56 = new class244();
                                    var56.field3347 = true;
                                    var56.field3350 = var13;
                                    var56.field3346 = var22 + class737.field9980.method210(0) - var14;
                                    var56.field3358 = var23 + class737.field9980.method208(-78) - var15;
                                    var56.field3349 = var13.field5111;
                                    class251.field3427.method3593(var56, 15);
                                }
                                if (var13.field5038 && !var26) {
                                    var13.field5038 = false;
                                    if (var13.field5026 != null) {
                                        class244 var57 = new class244();
                                        var57.field3347 = true;
                                        var57.field3350 = var13;
                                        var57.field3346 = var22 + class737.field9980.method210(0) - var14;
                                        var57.field3358 = var23 + class737.field9980.method208(-102) - var15;
                                        var57.field3349 = var13.field5026;
                                        class357.field4356.method3593(var57, 15);
                                    }
                                }
                                if (var26 && var13.field5137 != null) {
                                    class244 var58 = new class244();
                                    var58.field3347 = true;
                                    var58.field3350 = var13;
                                    var58.field3346 = var22 + class737.field9980.method210(0) - var14;
                                    var58.field3358 = var23 + class737.field9980.method208(-35) - var15;
                                    var58.field3349 = var13.field5137;
                                    class251.field3427.method3593(var58, 15);
                                }
                                if (!var13.field5078 && var25) {
                                    var13.field5078 = true;
                                    if (var13.field5015 != null) {
                                        class244 var59 = new class244();
                                        var59.field3347 = true;
                                        var59.field3350 = var13;
                                        var59.field3346 = var22 + class737.field9980.method210(0) - var14;
                                        var59.field3358 = var23 + class737.field9980.method208(-81) - var15;
                                        var59.field3349 = var13.field5015;
                                        class251.field3427.method3593(var59, 15);
                                    }
                                }
                                if (var13.field5078 && var25 && var13.field5072 != null) {
                                    class244 var60 = new class244();
                                    var60.field3347 = true;
                                    var60.field3350 = var13;
                                    var60.field3346 = var22 + class737.field9980.method210(0) - var14;
                                    var60.field3358 = var23 + class737.field9980.method208(-106) - var15;
                                    var60.field3349 = var13.field5072;
                                    class251.field3427.method3593(var60, 15);
                                }
                                if (var13.field5078 && !var25) {
                                    var13.field5078 = false;
                                    if (var13.field5059 != null) {
                                        class244 var61 = new class244();
                                        var61.field3347 = true;
                                        var61.field3350 = var13;
                                        var61.field3346 = var22 + class737.field9980.method210(0) - var14;
                                        var61.field3358 = var23 + class737.field9980.method208(-102) - var15;
                                        var61.field3349 = var13.field5059;
                                        class357.field4356.method3593(var61, 15);
                                    }
                                }
                                if (var13.field5101 != null) {
                                    class244 var62 = new class244();
                                    var62.field3350 = var13;
                                    var62.field3349 = var13.field5101;
                                    class191.field2683.method3593(var62, 15);
                                }
                                if (var13.field5021 != null && class106.field1445 > var13.field4987) {
                                    if (var13.field5092 == null || class106.field1445 - var13.field4987 > 32) {
                                        class244 var67 = new class244();
                                        var67.field3350 = var13;
                                        var67.field3349 = var13.field5021;
                                        class251.field3427.method3593(var67, 15);
                                    } else {
                                        label711: for (int var63 = var13.field4987; var63 < class106.field1445; var63++) {
                                            int var64 = class538.field6792[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field5092.length; var65++) {
                                                if (var13.field5092[var65] == var64) {
                                                    class244 var66 = new class244();
                                                    var66.field3350 = var13;
                                                    var66.field3349 = var13.field5021;
                                                    class251.field3427.method3593(var66, 15);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field4987 = class106.field1445;
                                }
                                if (var13.field5099 != null && class130.field1733 > var13.field5011) {
                                    if (var13.field5022 == null || class130.field1733 - var13.field5011 > 32) {
                                        class244 var72 = new class244();
                                        var72.field3350 = var13;
                                        var72.field3349 = var13.field5099;
                                        class251.field3427.method3593(var72, 15);
                                    } else {
                                        label687: for (int var68 = var13.field5011; var68 < class130.field1733; var68++) {
                                            int var69 = class335.field4078[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field5022.length; var70++) {
                                                if (var13.field5022[var70] == var69) {
                                                    class244 var71 = new class244();
                                                    var71.field3350 = var13;
                                                    var71.field3349 = var13.field5099;
                                                    class251.field3427.method3593(var71, 15);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5011 = class130.field1733;
                                }
                                if (var13.field5040 != null && class407.field5406 > var13.field5046) {
                                    if (var13.field5081 == null || class407.field5406 - var13.field5046 > 32) {
                                        class244 var77 = new class244();
                                        var77.field3350 = var13;
                                        var77.field3349 = var13.field5040;
                                        class251.field3427.method3593(var77, 15);
                                    } else {
                                        label663: for (int var73 = var13.field5046; var73 < class407.field5406; var73++) {
                                            int var74 = class703.field9294[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field5081.length; var75++) {
                                                if (var13.field5081[var75] == var74) {
                                                    class244 var76 = new class244();
                                                    var76.field3350 = var13;
                                                    var76.field3349 = var13.field5040;
                                                    class251.field3427.method3593(var76, 15);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5046 = class407.field5406;
                                }
                                if (var13.field4988 != null && class434.field5691 > var13.field5020) {
                                    if (var13.field5129 == null || class434.field5691 - var13.field5020 > 32) {
                                        class244 var82 = new class244();
                                        var82.field3350 = var13;
                                        var82.field3349 = var13.field4988;
                                        class251.field3427.method3593(var82, 15);
                                    } else {
                                        label639: for (int var78 = var13.field5020; var78 < class434.field5691; var78++) {
                                            int var79 = class560.field7123[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field5129.length; var80++) {
                                                if (var13.field5129[var80] == var79) {
                                                    class244 var81 = new class244();
                                                    var81.field3350 = var13;
                                                    var81.field3349 = var13.field4988;
                                                    class251.field3427.method3593(var81, 15);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5020 = class434.field5691;
                                }
                                if (var13.field5091 != null && class568.field7183 > var13.field5033) {
                                    if (var13.field5017 == null || class568.field7183 - var13.field5033 > 32) {
                                        class244 var87 = new class244();
                                        var87.field3350 = var13;
                                        var87.field3349 = var13.field5091;
                                        class251.field3427.method3593(var87, 15);
                                    } else {
                                        label615: for (int var83 = var13.field5033; var83 < class568.field7183; var83++) {
                                            int var84 = class651.field8304[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field5017.length; var85++) {
                                                if (var13.field5017[var85] == var84) {
                                                    class244 var86 = new class244();
                                                    var86.field3350 = var13;
                                                    var86.field3349 = var13.field5091;
                                                    class251.field3427.method3593(var86, 15);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5033 = class568.field7183;
                                }
                                if (class72.field983 > var13.field5083 && var13.field5077 != null) {
                                    class244 var88 = new class244();
                                    var88.field3350 = var13;
                                    var88.field3349 = var13.field5077;
                                    class251.field3427.method3593(var88, 15);
                                }
                                if (class351.field4289 > var13.field5083 && var13.field4990 != null) {
                                    class244 var89 = new class244();
                                    var89.field3350 = var13;
                                    var89.field3349 = var13.field4990;
                                    class251.field3427.method3593(var89, 15);
                                }
                                if (class480.field6214 > var13.field5083 && var13.field5000 != null) {
                                    class244 var90 = new class244();
                                    var90.field3350 = var13;
                                    var90.field3349 = var13.field5000;
                                    class251.field3427.method3593(var90, 15);
                                }
                                if (class37.field417 > var13.field5083 && var13.field5075 != null) {
                                    class244 var91 = new class244();
                                    var91.field3350 = var13;
                                    var91.field3349 = var13.field5075;
                                    class251.field3427.method3593(var91, 15);
                                }
                                if (class176.field2310 > var13.field5083 && var13.field5122 != null) {
                                    class244 var92 = new class244();
                                    var92.field3350 = var13;
                                    var92.field3349 = var13.field5122;
                                    class251.field3427.method3593(var92, 15);
                                }
                                if (class592.field7502 > var13.field5083 && var13.field5094 != null) {
                                    class244 var93 = new class244();
                                    var93.field3350 = var13;
                                    var93.field3349 = var13.field5094;
                                    class251.field3427.method3593(var93, 15);
                                }
                                if (class383.field4791 > var13.field5083 && var13.field5064 != null) {
                                    class244 var94 = new class244();
                                    var94.field3350 = var13;
                                    var94.field3349 = var13.field5064;
                                    class251.field3427.method3593(var94, 15);
                                }
                                var13.field5083 = class518.field6597;
                                if (var13.field5127 != null) {
                                    for (int var95 = 0; var95 < class86.field1199; var95++) {
                                        class244 var96 = new class244();
                                        var96.field3350 = var13;
                                        var96.field3348 = class278.field3615[var95].method371(false);
                                        var96.field3355 = class278.field3615[var95].method375(3206);
                                        var96.field3349 = var13.field5127;
                                        class251.field3427.method3593(var96, 15);
                                    }
                                }
                                if (class399.field5277 && var13.field5044 != null) {
                                    class244 var97 = new class244();
                                    var97.field3350 = var13;
                                    var97.field3349 = var13.field5044;
                                    class251.field3427.method3593(var97, 15);
                                }
                            }
                            if (var13.field5007 == 5 && var13.field5012 != -1) {
                                var13.method2262(class55.field708, false, class526.field6688).method355(var13.field5031, (byte) 13, class576.field7320);
                            }
                            class289.method1753(var13, (byte) 72);
                            if (var13.field5007 == 0) {
                                method2641(arg0, var13.field5151, var16, var17, var18, var19, var14 - var13.field4994, var15 - var13.field4984, arg8, arg9, arg10, arg11);
                                if (var13.field5145 != null) {
                                    method2641(var13.field5145, var13.field5151, var16, var17, var18, var19, var14 - var13.field4994, var15 - var13.field4984, arg8, arg9, arg10, arg11);
                                }
                                class278 var98 = (class278) class149.field1895.method2616((long) var13.field5151, (byte) -92);
                                if (var98 != null) {
                                    if (class433.field5672 == class201.field2799 && var98.field3613 == 0 && !class525.field6678 && var25 && !class538.field6782) {
                                        class632.method3371(0);
                                    }
                                    class368.method2116(arg9, var16, var18, var17, arg11, arg8, var14, var19, var15, -116, arg10, var98.field3617);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class289.method1753(var13, (byte) 72);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    private final void method2642(byte arg0) {
        field6058++;
        if (class332.field4052 == 14) {
            return;
        }
        long var2 = class413.method2391((byte) -74) / 1000000L - class198.field2752;
        class198.field2752 = class413.method2391((byte) -74) / 1000000L;
        boolean var4 = class515.method2851(255);
        if (var4 && class718.field9436 && class331.field4047 != null) {
            class331.field4047.method1030((byte) 125);
        }
        if (class364.method2095(class332.field4052, true)) {
            if (class536.field6775 != 0L && class502.method2786(-7114) > class536.field6775) {
                class52.method329(class647.field8260, false, class400.method2313((byte) -101), class662.field8646, 0);
            } else if (!class576.field7320.method953() && class569.field7188) {
                class793.method4339((byte) -38);
            }
        }
        if (class9.field80 == null) {
            Container var5;
            if (class340.field4176 != null) {
                var5 = class340.field4176;
            } else if (class80.field1134 == null) {
                var5 = class29.field265;
            } else {
                var5 = class80.field1134;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class340.field4176 == var5) {
                Insets var8 = class340.field4176.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class773.field10518 != var6 || class310.field3886 != var7 || class459.field5997) {
                if (class576.field7320 == null || class576.field7320.method965()) {
                    class398.method2301(60);
                } else {
                    class773.field10518 = var6;
                    class310.field3886 = var7;
                }
                class536.field6775 = class502.method2786(-7114) + 500L;
                class459.field5997 = false;
            }
        }
        if (class9.field80 != null && !class522.field6651 && class364.method2095(class332.field4052, true)) {
            class52.method329(-1, false, class485.field6252.field6935.method643(false), -1, 0);
        }
        boolean var9 = false;
        if (arg0 > -88) {
            return;
        }
        if (class192.field2684) {
            class192.field2684 = false;
            var9 = true;
        }
        if (var9) {
            class90.method544((byte) -41);
        }
        if (class576.field7320 != null && class576.field7320.method953() || class400.method2313((byte) -101) != 1) {
            class135.method783(0);
        }
        if (class315.method1845(class332.field4052, 255)) {
            class207.method1396(255, var9);
        } else if (class790.method4323(class332.field4052, -4)) {
            class493.method2746((byte) -107);
        } else if (class559.method3031(class332.field4052, false)) {
            class493.method2746((byte) -107);
        } else if (class597.method3225(class332.field4052, (byte) 45)) {
            if (class751.field10241 == 1) {
                if (class739.field9996 > class774.field10545) {
                    class774.field10545 = class739.field9996;
                }
                int var11 = (class774.field10545 - class739.field9996) * 50 / class774.field10545;
                class530.method2903(class659.field8556.method3589(class496.field6338, -22395) + "<br>(" + var11 + "%)", class576.field7320, class225.field3058, true, -1, class411.field5453);
            } else if (class751.field10241 == 2) {
                if (class122.field1631 > class331.field4046) {
                    class331.field4046 = class122.field1631;
                }
                int var10 = ((class331.field4046 - class122.field1631) * 50 / class331.field4046) + 50;
                class530.method2903(class659.field8556.method3589(class496.field6338, -22395) + "<br>(" + var10 + "%)", class576.field7320, class225.field3058, true, -1, class411.field5453);
            } else {
                class530.method2903(class659.field8556.method3589(class496.field6338, -22395), class576.field7320, class225.field3058, true, -1, class411.field5453);
            }
        } else if (class332.field4052 == 10) {
            class231.method1485((byte) 74, var2);
        } else if (class332.field4052 == 13) {
            class530.method2903(class659.field8558.method3589(class496.field6338, -22395) + "<br>" + class659.field8559.method3589(class496.field6338, -22395), class576.field7320, class225.field3058, false, -1, class411.field5453);
        }
        if (class97.field1311 == 3) {
            for (int var12 = 0; var12 < class547.field6839; var12++) {
                Rectangle var13 = class393.field5181[var12];
                if (class40.field461[var12]) {
                    class576.field7320.method3075(var13.x, var13.width, var13.height, (byte) 85, var13.y, -65281);
                } else if (class576.field7318[var12]) {
                    class576.field7320.method3075(var13.x, var13.width, var13.height, (byte) 85, var13.y, -65536);
                } else {
                    class576.field7320.method3075(var13.x, var13.width, var13.height, (byte) 85, var13.y, -16711936);
                }
            }
        }
        if (class538.method2939(-58)) {
            class160.method1019(class576.field7320, (byte) -38);
        }
        if (class740.field10014.field10581 && class364.method2095(class332.field4052, true) && class97.field1311 == 0 && class400.method2313((byte) -101) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class547.field6839; var17++) {
                if (class576.field7318[var17]) {
                    class576.field7318[var17] = false;
                    class350.field4276[var16++] = class393.field5181[var17];
                }
            }
            try {
                if (class602.field7657) {
                    class446.method2554(var16, (byte) -104, class350.field4276);
                } else {
                    class576.field7320.method3071(var16, class350.field4276, true);
                }
            } catch (class15 var19) {
            }
        } else if (!class315.method1845(class332.field4052, 255)) {
            for (int var14 = 0; var14 < class547.field6839; var14++) {
                class576.field7318[var14] = false;
            }
            try {
                if (class602.field7657) {
                    class129.method762((byte) -110);
                } else {
                    class576.field7320.method3073(0);
                }
            } catch (class15 var20) {
                class416.method2401(1, var20, var20.getMessage() + " (Recovered) " + this.method2621((byte) 126));
                class432.method2483((byte) 76, 0, false);
            }
        }
        class590.method3174((byte) 64);
        int var18 = class485.field6252.field6932.method2013(false);
        if (var18 == 0) {
            class591.method3181(15L, 0);
        } else if (var18 == 1) {
            class591.method3181(10L, 0);
        } else if (var18 == 2) {
            class591.method3181(5L, 0);
        } else if (var18 == 3) {
            class591.method3181(2L, 0);
        }
        if (class499.field6406) {
            class186.method1309(122);
        }
        if (class485.field6252.field6911.method1417(false) == 1 && class332.field4052 == 3 && field6070 != -1) {
            class485.field6252.method2986(0, class485.field6252.field6911, (byte) 108);
            class627.method3356(17);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method2643(int arg0) {
        int var1 = class20.field189;
        int[] var2 = class503.field6451;
        for (int var3 = 0; var3 < class349.field4271 + var1; var3++) {
            class381 var4;
            if (var3 < var1) {
                var4 = class263.field3508[var2[var3]];
            } else {
                var4 = ((class232) class444.field5811.method2616((long) class88.field1224[var3 - var1], (byte) 23)).field3125;
            }
            if (var4.field2895 == arg0 && var4.field4683 >= 0) {
                int var5 = var4.method190((byte) 125);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2896 & 0x1FF) != 0 || (var4.field2900 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field2896 & 0x1FF) != 256 || (var4.field2900 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field2896 >> 9;
                    int var7 = var4.field2900 >> 9;
                    if (var4.field4683 > class310.field3885[var6][var7]) {
                        class310.field3885[var6][var7] = var4.field4683;
                        class562.field7136[var6][var7] = 1;
                    } else if (class310.field3885[var6][var7] == var4.field4683) {
                        var10002 = class562.field7136[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field2896 - var8 >> 9;
                    int var10 = var4.field2900 - var8 >> 9;
                    int var11 = var4.field2896 + var8 >> 9;
                    int var12 = var4.field2900 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field4683 > class310.field3885[var13][var14]) {
                                class310.field3885[var13][var14] = var4.field4683;
                                class562.field7136[var13][var14] = 1;
                            } else if (class310.field3885[var13][var14] == var4.field4683) {
                                var10002 = class562.field7136[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2644() {
        for (int var0 = 0; var0 < class240.field3280; var0++) {
            int[] var1 = class310.field3885[var0];
            for (int var2 = 0; var2 < class276.field3602; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field6072++;
        try {
            if (arg0.length != 6) {
                class169.method1074(true, "Argument count");
            }
            class219.field2988 = new class246();
            class219.field2988.field3371 = Integer.parseInt(arg0[0]);
            class185.field2596 = new class246();
            class185.field2596.field3371 = Integer.parseInt(arg0[1]);
            class376.field4589 = new class246();
            class376.field4589.field3371 = Integer.parseInt(arg0[2]);
            class611.field7718 = class169.field2235;
            if (arg0[3].equals("live")) {
                class652.field8357 = class790.field10827;
            } else if (arg0[3].equals("rc")) {
                class652.field8357 = class106.field1447;
            } else if (arg0[3].equals("wip")) {
                class652.field8357 = class463.field6015;
            } else {
                class169.method1074(true, "modewhat");
            }
            class496.field6338 = class3.method7(arg0[4], 111);
            if (class496.field6338 == -1) {
                if (arg0[4].equals("english")) {
                    class496.field6338 = 0;
                } else if (arg0[4].equals("german")) {
                    class496.field6338 = 1;
                } else {
                    class169.method1074(true, "language");
                }
            }
            class469.field6110 = false;
            class87.field1218 = false;
            if (arg0[5].equals("game0")) {
                class201.field2799 = class433.field5672;
            } else if (arg0[5].equals("game1")) {
                class201.field2799 = class186.field2600;
            } else if (arg0[5].equals("game2")) {
                class201.field2799 = class551.field6910;
            } else if (arg0[5].equals("game3")) {
                class201.field2799 = class177.field2329;
            } else {
                class169.method1074(true, "game");
            }
            class337.field4113 = true;
            class159.field2065 = true;
            class713.field9400 = 0L;
            class597.field7580 = false;
            class310.field3887 = "";
            class673.field8709 = class201.field2799.field6153;
            class160.field2079 = false;
            class517.field6589 = 0;
            class600.field7626 = 0;
            class195.field2708 = 0;
            class504.field6459 = null;
            class528.field6708 = null;
            client var1 = new client();
            class102.field1382 = var1;
            var1.method3001(class652.field8357.method424((byte) -3) + 32, (byte) 39, 37, 1024, class201.field2799.field6157, 768, 647, false);
            class340.field4176.setLocation(40, 40);
        } catch (Exception var3) {
            class416.method2401(1, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field6059++;
        if (!this.method2997(11)) {
            return;
        }
        class219.field2988 = new class246();
        class219.field2988.field3371 = Integer.parseInt(this.getParameter("worldid"));
        class185.field2596 = new class246();
        class185.field2596.field3371 = Integer.parseInt(this.getParameter("lobbyid"));
        class185.field2596.field3374 = this.getParameter("lobbyaddress");
        class376.field4589 = new class246();
        class376.field4589.field3371 = Integer.parseInt(this.getParameter("demoid"));
        class376.field4589.field3374 = this.getParameter("demoaddress");
        class611.field7718 = class459.method2592(Integer.parseInt(this.getParameter("modewhere")), (byte) -7);
        if (class611.field7718 == class169.field2235) {
            class611.field7718 = class620.field7843;
        } else if (!class689.method3679(class611.field7718, -92) && class611.field7718 != class290.field3701) {
            class611.field7718 = class290.field3701;
        }
        class652.field8357 = class731.method3902(0, Integer.parseInt(this.getParameter("modewhat")));
        if (class652.field8357 != class463.field6015 && class652.field8357 != class106.field1447 && class790.field10827 != class652.field8357) {
            class652.field8357 = class790.field10827;
        }
        try {
            class496.field6338 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class496.field6338 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class469.field6110 = true;
        } else {
            class469.field6110 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class87.field1218 = true;
        } else {
            class87.field1218 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class563.field7154 = true;
        } else {
            class563.field7154 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class201.field2799 = class433.field5672;
            } else if (var4.equals("1")) {
                class201.field2799 = class186.field2600;
            } else if (var4.equals("2")) {
                class201.field2799 = class551.field6910;
            } else if (var4.equals("3")) {
                class201.field2799 = class177.field2329;
            }
        }
        try {
            class517.field6589 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class517.field6589 = 0;
        }
        class391.field5133 = this.getParameter("quiturl");
        class310.field3887 = this.getParameter("settings");
        if (class310.field3887 == null) {
            class310.field3887 = "";
        }
        class336.field4097 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class195.field2708 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class195.field2708 = 0;
            }
        }
        class673.field8709 = Integer.parseInt(this.getParameter("colourid"));
        if (class673.field8709 < 0 || class673.field8709 >= class256.field3475.length) {
            class673.field8709 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class337.field4113 = true;
            class159.field2065 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class597.field7580 = true;
        }
        class528.field6708 = this.getParameter("sskey");
        if (class528.field6708 != null && class528.field6708.length() < 2) {
            class528.field6708 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class160.field2079 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class600.field7626 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class713.field9400 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class504.field6459 = this.getParameter("additionalInfo");
        if (class504.field6459 != null && class504.field6459.length() > 50) {
            class504.field6459 = null;
        }
        if (class433.field5672 == class201.field2799) {
            class398.field5240 = 503;
            class719.field9443 = 765;
        } else if (class201.field2799 == class186.field2600) {
            class398.field5240 = 480;
            class719.field9443 = 640;
        }
        class102.field1382 = this;
        this.method2998(class719.field9443, 115, 647, class398.field5240, class652.field8357.method424((byte) -60) + 32, 37, class201.field2799.field6157);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method2645(boolean arg0) {
        if (class564.field7164) {
            class399.method2308((byte) -123);
        }
        field6061++;
        class573.method3087(122);
        if (class576.field7320 != null) {
            class576.field7320.method3072(5);
        }
        if (class9.field80 != null) {
            class578.method3101(class740.field10014, class9.field80, -108);
            class9.field80 = null;
        }
        if (class252.field3437 != null) {
            class252.field3437.method1817(-126);
            class252.field3437 = null;
        }
        class410.method2381(-224);
        class722.field9484.method672(52);
        class161.field2125.method3011(-15);
        if (class129.field1729 != null) {
            class129.field1729.method4313(10);
            class129.field1729 = null;
        }
        try {
            class358.field4374.method1441(-1);
            for (int var2 = 0; var2 < 37; var2++) {
                class422.field5559[var2].method1441(-1);
            }
            if (arg0) {
                method2629(-124L, -26, true, 8);
            }
            class200.field2783.method1441(-1);
            class409.field5432.method1441(-1);
            class289.method1754(true);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2646() {
        int var0 = class20.field189;
        int[] var1 = class503.field6451;
        int var2 = class485.field6252.field6945.method2587(false);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class33 var14 = class263.field3508[var1[var4]];
            if (!var14.method181((byte) -106)) {
                var14.field4683 = -1;
            } else if (var14.field374) {
                var14.field4683 = -1;
            } else {
                var14.method2186(621526601);
                if (var14.field7852 >= 0 && var14.field7844 >= 0 && var14.field7849 < class240.field3280 && var14.field7850 < class276.field3602) {
                    var14.field329 = var14.field4715 ? var3 : false;
                    if (class422.field5564 == var14) {
                        var14.field4683 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field4688) {
                            var15++;
                        }
                        if (var14.field4676 > class693.field8900) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method190((byte) -122) << 2);
                        if (var14.field342 || var14.field344) {
                            var16 += 512;
                        } else {
                            if (class340.field4173 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field4683 = var16 + 1;
                    }
                } else {
                    var14.field4683 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class349.field4271; var5++) {
            class727 var11 = ((class232) class444.field5811.method2616((long) class88.field1224[var5], (byte) 107)).field3125;
            if (var11.method3892((byte) -106) && var11.field9545.method1579(-120, class381.field4705)) {
                var11.method2186(621526601);
                if (var11.field7852 >= 0 && var11.field7844 >= 0 && var11.field7849 < class240.field3280 && var11.field7850 < class276.field3602) {
                    int var12 = 0;
                    if (!var11.field4688) {
                        var12++;
                    }
                    if (var11.field4676 > class693.field8900) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method190((byte) 59) << 2);
                    if (class340.field4173 == 0) {
                        if (var11.field9545.field3327) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class340.field4173 == 1) {
                        if (var11.field9545.field3327) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field9545.field3257) {
                        var13 += 1024;
                    } else if (!var11.field9545.field3320) {
                        var13 += 256;
                    }
                    var11.field4683 = var13 + 1;
                } else {
                    var11.field4683 = -1;
                }
            } else {
                var11.field4683 = -1;
            }
        }
        for (int var6 = 0; var6 < class589.field7475.length; var6++) {
            class28 var7 = class589.field7475[var6];
            if (var7 != null) {
                if (var7.field250 == 1) {
                    class232 var8 = (class232) class444.field5811.method2616((long) var7.field251, (byte) -79);
                    if (var8 != null) {
                        class727 var9 = var8.field3125;
                        if (var9.field4683 >= 0) {
                            var9.field4683 += 2048;
                        }
                    }
                } else if (var7.field250 == 10) {
                    class33 var10 = class263.field3508[var7.field251];
                    if (var10 != null && class422.field5564 != var10 && var10.field4683 >= 0) {
                        var10.field4683 += 2048;
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2647(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class582("", 73);
        field6076 = -1L;
    }
}
