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
public class client extends class144 {

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lmia;")
    public static class63 field4263 = new class63(47, 3);

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lde;")
    public static class533 field4275 = new class533();

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Leia;")
    public static class243 field4276 = new class243();

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
    public static boolean field4277 = false;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "J")
    public static long field4278 = 1L;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    public static int field4281;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Ljava/lang/Class;")
    public static Class field4280;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1906(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsca;)Lue;", line = 5)
    public static final class233 method1886(class46 arg0) {
        class233 var1 = (class233) class255.field3657.method2287(((long) arg0.field610 << 32) + (long) arg0.field603, (byte) -117);
        return var1 == null ? arg0.field663 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 10)
    public final void method1000(int arg0) {
        method1897(true);
        field4257++;
        class381.method2458(2);
        class150.method1119(arg0 + 18);
        class430.method2680(5);
        class385.method2477(false);
        class435.method2693((byte) 122);
        class20.method109(arg0 - 132);
        class157.method1160((byte) -51);
        class334.method2103(23497);
        class154.method1152((byte) 0);
        class74.method623(21530);
        class407.method2591(true);
        class9.method58((byte) -107);
        class408.method2594((byte) 50);
        class184.method1300(0);
        class603.method3509((byte) 79);
        class372.method2284((byte) 94);
        class144.method1003(-127);
        class453.method2773((byte) -54);
        class37.method186((byte) -59);
        class464.method2824((byte) 53);
        class60.method507(false);
        class728.method4109(true);
        class528.method3087((byte) -69);
        class635.method3656(-1);
        class411.method2609((byte) 103);
        class164.method1193((byte) 110);
        class308.method1949(23618);
        class2.method17((byte) -48);
        class419.method2643((byte) -121);
        class39.method227(107);
        class590.method3415((byte) -120);
        class492.method2938(-41);
        class106.method799((byte) 104);
        class466.method2825((byte) -114);
        class236.method1568((byte) -48);
        class530.method3098((byte) 1);
        class11.method77((byte) -125);
        class27.method140(arg0 ^ 0xFFFFFFCD);
        class85.method694(-7339);
        class118.method865(103);
        class730.method4121((byte) 92);
        class574.method3324(arg0 ^ 0x37);
        class329.method2081(false);
        class251.method1650(0);
        class376.method2434(arg0 ^ 0x7E);
        class427.method2667(true);
        class505.method2994(true);
        class33.method168((byte) -26);
        class598.method3478(110);
        class752.method4194(arg0 ^ 0x34);
        class476.method2869(arg0 + 47);
        class190.method1321((byte) 102);
        class124.method885(77);
        class269.method1718((byte) 17);
        class432.method2685(true);
        class115.method848(arg0 - 52);
        class645.method3721(14378);
        class304.method1920(false);
        class469.method2840(arg0 + 7450);
        class257.method1682(-1);
        class240.method1600(true);
        class227.method1524((byte) -112);
        class120.method875(arg0 - 51);
        class152.method1130(arg0 ^ 0x7990);
        class243.method1618(117);
        class46.method338(arg0 ^ 0x36);
        class141.method984(true);
        class689.method3921((byte) -95);
        class409.method2601((byte) 105);
        class468.method2838(60);
        class186.method1307(-1);
        class629.method3629((byte) 65);
        class661.method3808(4318);
        class282.method1800(7);
        class421.method2647(33);
        class261.method1690(27389);
        class579.method3362(-8941);
        class116.method856((byte) 75);
        class92.method726(arg0 ^ 0x5ED0);
        class55.method387(-38);
        class515.method3042(-7476);
        class361.method2250((byte) -102);
        class524.method3074((byte) 124);
        class413.method2620(20796);
        class535.method3139(89);
        class218.method1464(arg0 ^ 0x73);
        class28.method141(14094);
        class575.method3331(true);
        class443.method2750(false);
        class509.method3019((byte) 118);
        class375.method2429(119);
        class370.method2274((byte) 117);
        class234.method1560(116);
        class35.method179((byte) -90);
        class520.method3067((byte) -66);
        class253.method1665((byte) -93);
        class288.method1837((byte) -93);
        class473.method2857(-1);
        class397.method2530((byte) 36);
        class374.method2426((byte) 103);
        class213.method1447(-6937);
        class211.method1435(2);
        class77.method638(-125);
        class280.method1785(14);
        class348.method2202(110);
        class367.method2264(-60);
        class578.method3349(false);
        class61.method557((byte) 102);
        class390.method2503(arg0 ^ 0x4B);
        class565.method3295(-35);
        class210.method1423(-4751);
        class470.method2847(2048);
        class311.method1965(-120);
        class526.method3081(true);
        class378.method2443(0);
        class406.method2587(-1);
        class314.method1991((byte) 54);
        class339.method2161(arg0 + 72);
        class510.method3020(2);
        class529.method3092(arg0 ^ 0x30);
        class756.method4218((byte) -114);
        class678.method3894(1);
        class705.method4008(false);
        class672.method3843(false);
        class50.method367(-1);
        class726.method4092(-21473);
        class135.method954((byte) 88);
        class504.method2992(arg0 ^ 0x33);
        class169.method1227(0);
        class91.method723(104);
        class368.method2267(true);
        class44.method304((byte) -108);
        class305.method1931((byte) -122);
        class100.method778(18);
        class48.method356(116);
        class566.method3298(8);
        class488.method2925((byte) -126);
        class66.method582(67);
        class624.method3599((byte) -91);
        class609.method3532((byte) -102);
        class230.method1545((byte) 102);
        class593.method3464((byte) 98);
        class336.method2134(true);
        class313.method1977((byte) 126);
        class589.method3406(-15);
        class247.method1642(arg0 ^ 0x33);
        class709.method4029();
        class63.method564((byte) 61);
        class73.method621((byte) -105);
        class166.method1219((byte) -84);
        class54.method383(0);
        class221.method1489(-104);
        class561.method3277(-86);
        class320.method2025((byte) -14);
        class59.method413((byte) -77);
        class673.method3852(false);
        class140.method983(15448);
        class732.method4126(-4081);
        class692.method3931(66);
        class606.method3516(8);
        class43.method299(75);
        class500.method2977(0);
        class601.method3492((byte) 72);
        class84.method670();
        class582.method3376((byte) -81);
        class437.method2703((byte) 115);
        class332.method2095((byte) -31);
        class727.method4098((byte) -125);
        class490.method2932(18841);
        class328.method2075(arg0 + 27);
        class189.method1316(true);
        class64.method567(arg0 ^ 0xFFFFEB19);
        class716.method4069((byte) -86);
        class346.method2187(1627932896);
        class127.method895((byte) -14);
        class187.method1310((byte) -80);
        class98.method755((byte) -87);
        class626.method3609();
        class264.method1703(arg0 ^ 0xFFFFFFCD);
        class364.method2255((byte) -50);
        class201.method1380(true);
        class627.method3620(false);
        class25.method127((byte) -114);
        class622.method3598((byte) 106);
        class519.method3062(-125);
        class477.method2875();
        class637.method3663(11683);
        class326.method2071(arg0 - 51);
        class86.method704((byte) 112);
        class177.method1260(28442);
        class193.method1343(0);
        class143.method992(true);
        class220.method1477((byte) -89);
        class748.method4178(88);
        class343.method2179(false);
        class608.method3526((byte) 29);
        class12.method81(126);
        class665.method3822((byte) -93);
        class754.method4202(-2114);
        class183.method1296(true);
        class540.method3161();
        class459.method2800((byte) 15);
        class542.method3173((byte) 110);
        class173.method1236((byte) -73);
        class97.method750();
        class196.method1368((byte) -110);
        class274.method1733((byte) 18);
        class170.method1228(arg0 ^ 0xFFFFFFDC);
        class384.method2469(109);
        class81.method651(3);
        class449.method2766((byte) -126);
        class552.method3217();
        class514.method3036((byte) 89);
        class448.method2764(false);
        class22.method117((byte) 127);
        class456.method2793(true);
        class707.method4019(-112);
        class438.method2714((byte) -117);
        class72.method616(123);
        class638.method3667(-6);
        class323.method2054((byte) 4);
        class62.method559(false);
        class493.method2940(false);
        class359.method2238(false);
        class717.method4076(arg0 ^ 0xFFFFFFD0);
        class516.method3049(arg0 - 80);
        class741.method4146(false);
        class15.method93(4);
        class393.method2512((byte) 69);
        class686.method3907(arg0 ^ 0xFFFFE805);
        class71.method615((byte) -68);
        class710.method4040((byte) 126);
        class667.method3827(-11316);
        class19.method108(0);
        class294.method1867(-127);
        class611.method3544(0);
        class83.method666(0);
        class457.method2797(0);
        class93.method731(-4);
        class402.method2549((byte) 93);
        class291.method1861((byte) -37);
        class258.method1686((byte) -106);
        class69.method602(2471);
        class471.method2849(-16);
        class554.method3238((byte) 97);
        class235.method1562(84);
        class614.method3552(-100);
        class241.method1607((byte) -102);
        class618.method3562((byte) -109);
        class128.method901(0);
        class78.method640(false);
        class734.method4130(-60);
        class423.method2652(arg0 - 13474);
        class632.method3643(true);
        class502.method2983(-62);
        class758.method4226(-55);
        class325.method2068(-122);
        class521.method3070((byte) -23);
        class742.method4151(arg0 - 30);
        class10.method73(2);
        class478.method2881(true);
        class132.method935(true);
        class279.method1780(arg0 + 19805);
        class107.method810((byte) -118);
        class80.method649(-89);
        class647.method3766(arg0 - 14581);
        class293.method1864(11124);
        class700.method3973(arg0 - 26502);
        class110.method823(false);
        class702.method3993(-5226);
        class518.method3055((byte) 85);
        class446.method2759(false);
        class417.method2635(arg0 - 163);
        class232.method1548((byte) -75);
        class58.method407(arg0 - 38);
        class687.method3910(64);
        class387.method2492((byte) 51);
        class296.method1872((byte) 57);
        class355.method2220(arg0 + 77);
        class630.method3631(11902);
        class463.method2820((byte) -127);
        class743.method4155();
        class331.method2093((byte) 127);
        class133.method940(-126);
        class337.method2154(103);
        class452.method2771(false);
        class242.method1609(29526);
        class631.method3638(26835);
        class45.method330(arg0 + 6252);
        class693.method3939((byte) 54);
        class317.method2013(-41);
        class751.method4191((byte) 99);
        class362.method2253(20000000);
        class400.method2543(-24565);
        class403.method2557();
        class284.method1821((byte) 27);
        class330.method2091();
        class380.method2450();
        class587.method3395(8);
        class625.method3601((byte) -2);
        class205.method1396();
        class458.method2799((byte) -122);
        class564.method3287((byte) 121);
        class602.method3497(false);
        class4.method29(0);
        class636.method3658(arg0 ^ 0xFFFFFF80);
        class760.method4230((byte) -110);
        class13.method86((byte) 78);
        class335.method2112((byte) 20);
        class633.method3649(-10278);
        class382.method2460((byte) 127);
        class454.method2778((byte) -30);
        class683.method3903(false);
        class176.method1257((byte) -110);
        class739.method4140((byte) -13);
        class588.method3401((byte) 120);
        class353.method2216((byte) 36);
        class222.method1498(false);
        class188.method1312(92);
        class497.method2961(true);
        class371.method2276((byte) 73);
        class65.method574();
        class664.method3821(0);
        class537.method3153(-105);
        class462.method2816(0);
        class547.method3198(75);
        class79.method642(false);
        class571.method3309(116);
        class105.method791((byte) 32);
        class657.method3796((byte) 2);
        class573.method3314(false);
        class460.method2806(-52);
        class199.method1377(-122);
        class117.method858(false);
        class691.method3926(0);
        class67.method594((byte) -77);
        class736.method4135((byte) 123);
        class87.method706((byte) 124);
        class684.method3905((byte) -47);
        class394.method2519((byte) -97);
        class255.method1674(512);
        class612.method3548(-10552);
        class99.method770(16383);
        class395.method2524(16129);
        class103.method789(1);
        class237.method1571((byte) 118);
        class607.method3519(true);
        class309.method1957(1);
        class506.method3006(arg0 ^ 0x67D9);
        class30.method156(241);
        class195.method1363((byte) 115);
        class76.method632((byte) -45);
        class474.method2862((byte) 106);
        class531.method3104(-5231);
        class153.method1137((byte) -98);
        class268.method1717(31);
        class699.method3969(true);
        class373.method2339(true);
        class369.method2270(64);
        class256.method1677((byte) -117);
        class333.method2101(false);
        class441.method2722(-101);
        class340.method2167(-27);
        class165.method1207(true);
        class297.method1878(true);
        class648.method3770(arg0 ^ 0x32);
        class239.method1583(15126);
        class168.method1225(17);
        class307.method1942(0);
        class254.method1670((byte) -75);
        class259.method1687(false);
        class238.method1576((byte) 73);
        class533.method3135((byte) -124);
        class290.method1855(true);
        class489.method2928(-118);
        class704.method4002((byte) 69);
        class182.method1288(-128);
        if (arg0 != 50) {
            this.method994((byte) 26);
        }
        class560.method3276();
        class160.method1171(true);
        class461.method2812(0);
        class272.method1727(0);
        class592.method3459(4096);
        class740.method4143((byte) 26);
        class206.method1399((byte) 90);
        class483.method2890(2832);
        class576.method3337((byte) -80);
        class610.method3538((byte) 127);
        class654.method3784(72);
        class287.method1831(arg0 ^ 0x54);
        class171.method1231(false);
        class108.method811(3);
        class677.method3890(-121);
        class424.method2654(1);
        class260.method1689(4096);
        class356.method2225((byte) -93);
        class95.method745(1);
        class392.method2510(arg0 - 144);
        class145.method1013(-128);
        class698.method3964(false);
        class499.method2970(8);
        class475.method2864(-124);
        class298.method1881(0);
        class379.method2448((byte) -32);
        class327.method2073((byte) 10);
        class681.method3900(-123);
        class555.method3242(arg0 ^ 0xFFFFFFA9);
        class600.method3491(-1);
        class142.method988(arg0 - 50);
        class563.method3286();
        class225.method1519(25);
        class341.method2170(-78);
        class302.method1909(-105);
        class597.method3475(-2001);
        class658.method3802(2);
        class276.method1751(71);
        class538.method3159(2);
        class644.method3690((byte) 109);
        class634.method3655(-4255);
        class111.method834(2048);
        class49.method359(-2239);
        class51.method373(arg0 + 3978);
        class209.method1412(-2);
        class249.method1647(0);
        class718.method4080((byte) -80);
        class70.method609(arg0 ^ 0x12);
        class442.method2748(true);
        class265.method1706((byte) 123);
        class112.method842(arg0 ^ 0xC68);
        class277.method1761(arg0 + 5838);
        class569.method3303((byte) 73);
        class729.method4118((byte) -117);
        class570.method3305(12157);
        class134.method945(16281);
        class146.method1016(false);
        class523.method3072((byte) 9);
        class347.method2190((byte) 93);
        class671.method3841(3317);
        class354.method2217(-110);
        class136.method956((byte) -126);
        class396.method2528(-43);
        class577.method3339((byte) 11);
        class123.method884(true);
        class21.method111(true);
        class228.method1540(0);
        class750.method4185(true);
        class596.method3471(42);
        class712.method4062(arg0 ^ 0xFFFFFFF4);
        class224.method1506(arg0 - 50);
        class660.method3807(true);
        class662.method3811(-1728);
        class162.method1182(105);
        class289.method1844(0);
        class122.method880((byte) -113);
        class358.method2237((byte) 123);
        class559.method3270((byte) 95);
        class426.method2661(1);
        class229.method1542(16);
        class214.method1452(-13222);
        class324.method2061(-10056);
        class604.method3511(arg0 ^ 0x5F);
        class89.method718(85);
        class676.method3886(-27249);
        class179.method1269(64);
        class192.method1341((byte) -87);
        class753.method4197(arg0 ^ 0xFFFFE68F);
        class389.method2495(3942);
        class720.method4083(arg0 ^ 0x32);
        class434.method2687((byte) -54);
        class391.method2509((byte) -31);
        class365.method2262(true);
        class412.method2615(1);
        class724.method4088(3617);
        class595.method3469(0);
        class494.method2945(arg0 - 50);
        class223.method1501(false);
        class262.method1694(arg0 - 172);
        class208.method1406(-8025);
        class352.method2213(true);
        class250.method1649(true);
        class175.method1243(-256);
        class639.method3672(-30);
        class656.method3794(19593);
        class501.method2978(arg0 ^ 0x2C);
        class345.method2183((byte) -121);
        class650.method3772(-42);
        class467.method2836((byte) 106);
        class194.method1347(false);
        class451.method2770((byte) 50);
        class350.method2208(13173);
        class32.method162(-31870);
        class8.method53((byte) -47);
        class445.method2755(18304);
        class252.method1659(1);
        class299.method1883((byte) 117);
        class567.method3301(arg0 - 51);
        class88.method710(0);
        class131.method929(arg0 ^ 0x6255);
        class244.method1629(-126);
        class562.method3283(arg0 + 75);
        class248.method1644(arg0 ^ 0xFFFFFFBD);
        class679.method3897((byte) 118);
        class640.method3674((byte) -30);
        class29.method142((byte) -117);
        class96.method748(true);
        class338.method2158(0);
        class315.method1992((byte) -113);
        class303.method1910((byte) 101);
        class130.method923(arg0 + 15);
        class149.method1113(-3);
        class581.method3367((byte) 69);
        class725.method4089(false);
        class245.method1637(4);
        class357.method2232(-110);
        class31.method160(321413452);
        class273.method1729(arg0 ^ 0xFFFFCD);
        class642.method3676(-112);
        class246.method1639(arg0 ^ 0x4F418033);
        if (class144.field1910) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lsca;)Lsca;", line = 540)
    public static final class46 method1887(class46 arg0) {
        int var1 = method1886(arg0).method1554(1);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class405.method2580(arg0.field557, -128);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 559)
    private final void method1888(int arg0) {
        field4255++;
        if (class87.field1246 == 14) {
            return;
        }
        long var2 = class115.method847(-87) / 1000000L - class341.field4944;
        class341.field4944 = class115.method847(-83) / 1000000L;
        boolean var4 = class50.method366((byte) -93);
        if (var4 && class202.field3022 && class176.field2719 != null) {
            class176.field2719.method1976(arg0 ^ 0xFFFFF454);
        }
        if (class627.method3618(7, class87.field1246)) {
            if (class533.field7669 != 0L && class524.method3075(arg0 ^ 0x12) > class533.field7669) {
                class417.method2633(false, class112.field1565, class756.method4219((byte) 8), class332.field4772, 4);
            } else if (!class736.field10316.method537() && class398.field5953) {
                class72.method617((byte) -101);
            }
        }
        if (class183.field2801 == null) {
            Container var5;
            if (class169.field2648 != null) {
                var5 = class169.field2648;
            } else if (class466.field6830 == null) {
                var5 = class176.field2729;
            } else {
                var5 = class466.field6830;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class169.field2648 == var5) {
                Insets var8 = class169.field2648.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class153.field2475 != var6 || class455.field6702 != var7 || class424.field6300) {
                if (class736.field10316 == null || class736.field10316.method532()) {
                    class509.method3014(36);
                } else {
                    class153.field2475 = var6;
                    class455.field6702 = var7;
                }
                class533.field7669 = class524.method3075(18) + 500L;
                class424.field6300 = false;
            }
        }
        if (class183.field2801 != null && !class201.field3018 && class627.method3618(7, class87.field1246)) {
            class417.method2633(false, -1, class63.field916.field10172.method953(17503), -1, 4);
        }
        boolean var9 = false;
        if (class72.field1017) {
            var9 = true;
            class72.field1017 = false;
        }
        if (var9) {
            class378.method2447((byte) 84);
        }
        if (class736.field10316 != null && class736.field10316.method537() || class756.method4219((byte) 8) != 1) {
            class459.method2805(23);
        }
        if (class657.method3798(class87.field1246, (byte) -72)) {
            class79.method647(var9, (byte) -39);
        } else if (class310.method1962(class87.field1246, (byte) 81)) {
            class386.method2485(true);
        } else if (class659.method3804((byte) 106, class87.field1246)) {
            class386.method2485(true);
        } else if (class221.method1487(-9, class87.field1246)) {
            if (class505.field7183 == 1) {
                if (class456.field6729 > class304.field4319) {
                    class304.field4319 = class456.field6729;
                }
                int var10 = (class304.field4319 - class456.field6729) * 50 / class304.field4319;
                class310.method1960(true, class430.field6382.method2679(class650.field9160, 124) + "<br>(" + var10 + "%)", class55.field764, class358.field5201, (byte) -124, class736.field10316);
            } else if (class505.field7183 == 2) {
                if (class44.field477 > class376.field5697) {
                    class376.field5697 = class44.field477;
                }
                int var11 = (class376.field5697 - class44.field477) * 50 / class376.field5697 + 50;
                class310.method1960(true, class430.field6382.method2679(class650.field9160, arg0 - 48) + "<br>(" + var11 + "%)", class55.field764, class358.field5201, (byte) -124, class736.field10316);
            } else {
                class310.method1960(true, class430.field6382.method2679(class650.field9160, 115), class55.field764, class358.field5201, (byte) -124, class736.field10316);
            }
        } else if (class87.field1246 == 10) {
            class574.method3330((byte) -79, var2);
        } else if (class87.field1246 == 13) {
            class310.method1960(false, class430.field6384.method2679(class650.field9160, arg0 - 91) + "<br>" + class430.field6385.method2679(class650.field9160, -120), class55.field764, class358.field5201, (byte) -124, class736.field10316);
        }
        if (class425.field6308 == 3) {
            for (int var12 = 0; var12 < class196.field2983; var12++) {
                Rectangle var13 = class184.field2816[var12];
                if (class432.field6444[var12]) {
                    class736.field10316.method481(-65281, -60, var13.x, var13.y, var13.width, var13.height);
                } else if (class50.field715[var12]) {
                    class736.field10316.method481(-65536, arg0 + 31, var13.x, var13.y, var13.width, var13.height);
                } else {
                    class736.field10316.method481(-16711936, -47, var13.x, var13.y, var13.width, var13.height);
                }
            }
        }
        if (class559.method3268((byte) 95)) {
            class340.method2164((byte) 119, class736.field10316);
        }
        if (class179.field2759.field10022 && class627.method3618(7, class87.field1246) && class425.field6308 == 0 && class756.method4219((byte) 8) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class196.field2983; var15++) {
                if (class50.field715[var15]) {
                    class50.field715[var15] = false;
                    class437.field6476[var14++] = class184.field2816[var15];
                }
            }
            try {
                if (class419.field6265) {
                    class398.method2532(var14, class437.field6476, arg0 ^ 0xFFFFF6C1);
                } else {
                    class736.field10316.method513(var14, class437.field6476, 104);
                }
            } catch (class566 var20) {
            }
        } else if (!class657.method3798(class87.field1246, (byte) -72)) {
            for (int var16 = 0; var16 < class196.field2983; var16++) {
                class50.field715[var16] = false;
            }
            try {
                if (class419.field6265) {
                    class509.method3018(-30201);
                } else {
                    class736.field10316.method420(0);
                }
            } catch (class566 var19) {
                class326.method2072(-3753, var19, var19.getMessage() + " (Recovered) " + this.method997(5200));
                class134.method950(arg0, 0, false);
            }
        }
        class572.method3311((byte) -78);
        if (arg0 != 0) {
            field4279 = 38;
        }
        int var18 = class63.field916.field10188.method2650(17503);
        if (var18 == 0) {
            class277.method1759(15L, -123);
        } else if (var18 == 1) {
            class277.method1759(10L, -93);
        } else if (var18 == 2) {
            class277.method1759(5L, -98);
        } else if (var18 == 3) {
            class277.method1759(2L, arg0 - 93);
        }
        if (class54.field759) {
            class738.method4138((byte) 112);
        }
        if (class63.field916.field10186.method725(17503) == 1 && class87.field1246 == 3 && class87.field1249 != -1) {
            class63.field916.method4111(82, 0, class63.field916.field10186);
            class585.method3384(-100);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 816)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class317.method2014((byte) 48, "Argument count");
            }
            class642.field9006 = new class575();
            class642.field9006.field8131 = Integer.parseInt(arg0[0]);
            class15.field202 = new class575();
            class15.field202.field8131 = Integer.parseInt(arg0[1]);
            class92.field1287 = new class575();
            class92.field1287.field8131 = Integer.parseInt(arg0[2]);
            class206.field3043 = class396.field5945;
            if (arg0[3].equals("live")) {
                class230.field3378 = class324.field4617;
            } else if (arg0[3].equals("rc")) {
                class230.field3378 = class637.field8947;
            } else if (arg0[3].equals("wip")) {
                class230.field3378 = class686.field9488;
            } else {
                class317.method2014((byte) 60, "modewhat");
            }
            class650.field9160 = class500.method2973((byte) -121, arg0[4]);
            if (class650.field9160 == -1) {
                if (arg0[4].equals("english")) {
                    class650.field9160 = 0;
                } else if (arg0[4].equals("german")) {
                    class650.field9160 = 1;
                } else {
                    class317.method2014((byte) 115, "language");
                }
            }
            class590.field8364 = false;
            class701.field9736 = false;
            if (arg0[5].equals("game0")) {
                class199.field2993 = class555.field7936;
            } else if (arg0[5].equals("game1")) {
                class199.field2993 = class373.field5652;
            } else if (arg0[5].equals("game2")) {
                class199.field2993 = class61.field883;
            } else if (arg0[5].equals("game3")) {
                class199.field2993 = class337.field4912;
            } else {
                class317.method2014((byte) 108, "game");
            }
            class582.field8279 = 0;
            class73.field1026 = class199.field2993.field6820;
            class580.field8247 = false;
            class293.field4177 = 0L;
            class221.field3257 = false;
            class612.field8655 = 0;
            class64.field925 = null;
            class72.field1015 = null;
            class299.field4243 = 0;
            class736.field10317 = "";
            class230.field3377 = true;
            class71.field1005 = true;
            client var1 = new client();
            class236.field3433 = var1;
            var1.method1011(1024, 639, 0, 37, class230.field3378.method1233(-32687) + 32, class199.field2993.field6822, 768, false);
            class169.field2648.setLocation(40, 40);
        } catch (Exception var3) {
            class326.method2072(-3753, var3, null);
        }
        field4264++;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 907)
    public final void method1009(int arg0) {
        if (arg0 <= 11) {
            return;
        }
        if (class580.field8247) {
            class265.field3794 = 64;
        }
        field4267++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class509.method3014(36);
        class376.field5694 = new class312(class179.field2759);
        class115.field1594 = new class2();
        class227.method1526(new int[] { 20, 260 }, new int[] { 1000, 100 }, (byte) 96);
        if (class607.field8585 != class206.field3043) {
            class326.field4656 = new byte[50][];
        }
        class63.field916 = class509.method3015(6);
        if (class607.field8585 == class206.field3043) {
            class642.field9006.field8138 = this.getCodeBase().getHost();
        } else if (class410.method2604(class206.field3043, (byte) 67)) {
            class642.field9006.field8138 = this.getCodeBase().getHost();
            class642.field9006.field8136 = class642.field9006.field8131 + 40000;
            class15.field202.field8136 = class15.field202.field8131 + 40000;
            class642.field9006.field8139 = class642.field9006.field8131 + 50000;
            class92.field1287.field8136 = class92.field1287.field8131 + 40000;
            class15.field202.field8139 = class15.field202.field8131 + 50000;
            class92.field1287.field8139 = class92.field1287.field8131 + 50000;
        } else if (class396.field5945 == class206.field3043) {
            class642.field9006.field8138 = "127.0.0.1";
            class15.field202.field8138 = "127.0.0.1";
            class92.field1287.field8138 = "127.0.0.1";
            class642.field9006.field8136 = class642.field9006.field8131 + 40000;
            class15.field202.field8136 = class15.field202.field8131 + 40000;
            class92.field1287.field8136 = class92.field1287.field8131 + 40000;
            class642.field9006.field8139 = class642.field9006.field8131 + 50000;
            class15.field202.field8139 = class15.field202.field8131 + 50000;
            class92.field1287.field8139 = class92.field1287.field8131 + 50000;
        }
        class528.field7513 = class642.field9006;
        class751.field10499 = class74.field1028 = class751.field10498 = class64.field924 = new short[256];
        if (class555.field7936 == class199.field2993) {
            class516.field7373 = false;
        }
        if (class373.field5652 == class199.field2993) {
            class209.field3064 = true;
            class283.field4021 = 16777215;
            class162.field2576 = 0;
            class639.field8976 = class387.field5845;
            class244.field3560 = class582.field8294;
        } else if (class337.field4912 == class199.field2993) {
            class639.field8976 = class660.field9239;
            class244.field3560 = class588.field8339;
        } else {
            class639.field8976 = class413.field6205;
            class244.field3560 = class28.field276;
        }
        try {
            class365.field5271 = class236.field3433.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class35.field371 = class218.method1465(-1, class106.field1476);
        class632.field8840 = class173.method1235(class106.field1476, true, (byte) -62);
        try {
            if (class179.field2759.field10028 != null) {
                class329.field4694 = new class590(class179.field2759.field10028, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class165.field2608[var3] = new class590(class179.field2759.field10032[var3], 6000, 0);
                }
                class333.field4776 = new class590(class179.field2759.field10036, 6000, 0);
                class260.field3707 = new class492(255, class329.field4694, class333.field4776, 500000);
                class73.field1020 = new class590(class179.field2759.field10033, 24, 0);
                class179.field2759.field10028 = null;
                class179.field2759.field10033 = null;
                class179.field2759.field10032 = null;
                class179.field2759.field10036 = null;
            }
        } catch (IOException var5) {
            class73.field1020 = null;
            class333.field4776 = null;
            class260.field3707 = null;
            class329.field4694 = null;
        }
        if (class607.field8585 != class206.field3043) {
            class475.field6906 = true;
        }
        class284.field4034 = class430.field6382.method2679(class650.field9160, -119);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lsca;)Z", line = 1032)
    public static final boolean method1889(class46 arg0) {
        if (class501.field7119) {
            if (method1886(arg0).field3393 != 0) {
                return false;
            }
            if (arg0.field577 == 0) {
                return false;
            }
        }
        return arg0.field682;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lsca;IIIIIIIIIII)V", line = 1048)
    public static final void method1890(class46[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class46 var13 = arg0[var12];
            if (var13 != null && var13.field557 == arg1) {
                int var14 = var13.field669 + arg6;
                int var15 = var13.field643 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field577 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field549 + var14;
                    int var21 = var13.field574 + var15;
                    if (var13.field577 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field577 == 0 || var13.field602 || method1886(var13).field3393 != 0 || class531.field7570 == var13 || class221.field3248 == var13.field521 || class377.field5713 == var13.field521) {
                    if (!method1889(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class419.field6265) {
                            var22 = class210.method1422(true);
                            var23 = class407.method2589((byte) -45);
                        }
                        if (class609.field8613 == var13 && class608.method3527(class609.field8613, 28) != null) {
                            class354.field5151 = true;
                            class249.field3612 = var14;
                            class112.field1564 = var15;
                        }
                        if (var13.field572 || var16 < var18 && var17 < var19) {
                            if (var13.field641 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class177 var24 = (class177) class150.field2337.method1195(0); var24 != null; var24 = (class177) class150.field2337.method1201(2)) {
                                    if (var24.field2738) {
                                        var24.method1304((byte) 7);
                                        var24.field2743.field604 = false;
                                    }
                                }
                                if (class95.field1353 == 0) {
                                    class609.field8613 = null;
                                    class531.field7570 = null;
                                }
                                class189.field2871 = 0;
                                class752.field10514 = false;
                                class149.field2331 = false;
                                if (!class483.field6967) {
                                    class579.method3363((byte) 73);
                                }
                            }
                            boolean var25;
                            if (class632.field8840.method2697(4212) + var22 >= var16 && class632.field8840.method2698(0) + var23 >= var17 && class632.field8840.method2697(4212) + var22 < var18 && class632.field8840.method2698(0) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class282.field3986 && var25) {
                                if (var13.field653 >= 0) {
                                    class389.field5865 = var13.field653;
                                } else if (var13.field641) {
                                    class389.field5865 = -1;
                                }
                            }
                            if (!class483.field6967 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class468.method2837(arg10 - var14, (byte) -12, var13, arg11 - var15);
                            }
                            boolean var26 = false;
                            if (class632.field8840.method2690(27621) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class467 var28 = (class467) class264.field3741.method1195(0);
                            if (var28 != null && var28.method1792((byte) -127) == 0 && var28.method1794((byte) 122) + var22 >= var16 && var28.method1793((byte) -75) + var23 >= var17 && var28.method1794((byte) 118) + var22 < var18 && var28.method1793((byte) 104) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field660 != null && !class559.method3268((byte) 127)) {
                                for (int var29 = 0; var29 < var13.field660.length; var29++) {
                                    if (class35.field371.method2474(var13.field660[var29], (byte) 127)) {
                                        if (var13.field670 == null || class357.field5189 >= var13.field670[var29]) {
                                            byte var30 = var13.field684[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class35.field371.method2474(86, (byte) 115) && !class35.field371.method2474(82, (byte) 119) && !class35.field371.method2474(81, (byte) 121)) && ((var30 & 0x2) == 0 || class35.field371.method2474(86, (byte) 120)) && ((var30 & 0x1) == 0 || class35.field371.method2474(82, (byte) 126)) && ((var30 & 0x4) == 0 || class35.field371.method2474(81, (byte) 124))) {
                                                if (var29 < 10) {
                                                    class607.method3525(var13.field610, "", -1, (byte) -58, var29 + 1);
                                                } else if (var29 == 10) {
                                                    class148.method1087(-34848);
                                                    class233 var31 = method1886(var13);
                                                    class754.method4204(var31.method1555(10061), var13, 5131, var31.field3396);
                                                    class298.field4229 = class227.method1527(true, var13);
                                                    if (class298.field4229 == null) {
                                                        class298.field4229 = "Null";
                                                    }
                                                    class29.field278 = var13.field612 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field632[var29];
                                                if (var13.field670 == null) {
                                                    var13.field670 = new int[var13.field660.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field670[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field670[var29] = class357.field5189 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field670 != null) {
                                        var13.field670[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class15.method94(var13, var23 + var28.method1793((byte) -20) - var15, false, var22 + var28.method1794((byte) 116) - var14);
                            }
                            if (class609.field8613 != null && class609.field8613 != var13 && var25 && method1886(var13).method1551(-8963)) {
                                class177.field2752 = var13;
                            }
                            if (class531.field7570 == var13) {
                                class172.field2674 = true;
                                class339.field4933 = var14;
                                class242.field3518 = var15;
                            }
                            if (var13.field602 || var13.field521 != 0) {
                                if (var25 && class671.field9360 != 0 && var13.field626 != null) {
                                    class177 var33 = new class177();
                                    var33.field2738 = true;
                                    var33.field2743 = var13;
                                    var33.field2734 = class671.field9360;
                                    var33.field2737 = var13.field626;
                                    class150.field2337.method1203(var33, (byte) -128);
                                }
                                if (class609.field8613 != null || class483.field6967 || class246.field3577 != var13.field521 && class189.field2871 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field521 != 0) {
                                    if (class476.field6917 == var13.field521 || class239.field3475 == var13.field521) {
                                        class171.field2663 = var13;
                                        if (class704.field9842 != null) {
                                            class704.field9842.method2673(class736.field10316, 80, var13.field574);
                                        }
                                        if (class476.field6917 == var13.field521) {
                                            if (class483.field6967 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class537.method3157(class736.field10316, (byte) 115, arg8, arg9);
                                            class457 var34 = (class457) class325.field4637.method1615((byte) 69);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field6745 && arg10 < var34.field6739 && arg11 >= var34.field6747 && arg11 < var34.field6738) {
                                                    class579.method3363((byte) 73);
                                                    class724.method4086(var34.field6737, 52);
                                                }
                                                var34 = (class457) class325.field4637.method1625(-79);
                                            }
                                        }
                                    }
                                    if (class221.field3248 == var13.field521) {
                                        if (var13.method339(class736.field10316, 30475) == null || class567.field8049 != 0 && class567.field8049 != 3 || class483.field6967 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field672[var36];
                                        if (var35 < var37 || var35 > var13.field552[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field549 / 2;
                                        int var39 = var36 - var13.field574 / 2;
                                        int var40;
                                        if (class264.field3784 == 4) {
                                            var40 = (int) class255.field3659 & 0x3FFF;
                                        } else {
                                            var40 = (int) class255.field3659 + class748.field10464 & 0x3FFF;
                                        }
                                        int var41 = class373.field5548[var40];
                                        int var42 = class373.field5549[var40];
                                        if (class264.field3784 != 4) {
                                            var41 = (class305.field4322 + 256) * var41 >> 8;
                                            var42 = (class305.field4322 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class264.field3784 == 4) {
                                            var45 = (class189.field2869 >> 9) + (var43 >> 2);
                                            var46 = (class537.field7685 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class130.field1749.method2579(false) - 1) * 256;
                                            var45 = (class130.field1749.field8423 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class130.field1749.field8428 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class282.field3986 && (class295.field4202 & 0x40) != 0) {
                                            class46 var48 = class700.method3972(class76.field1062, class745.field10436, true);
                                            if (var48 == null) {
                                                class148.method1087(-34848);
                                            } else {
                                                class240.method1593(class298.field4229, var45, (byte) -6, false, 1L, class488.field6984, true, var13.field687, 6, var46, true, (long) (var13.field603 << 0 | var13.field610), " ->");
                                            }
                                            continue;
                                        }
                                        if (class373.field5652 == class199.field2993) {
                                            class240.method1593(class430.field6397.method2679(class650.field9160, 97), var45, (byte) 112, false, 1L, -1, true, -1, 50, var46, true, 0L, "");
                                        }
                                        class240.method1593(class337.field4909, var45, (byte) 123, false, 1L, class62.field906, true, -1, 58, var46, true, 0L, "");
                                        continue;
                                    }
                                    if (class246.field3577 == var13.field521) {
                                        class55.field769 = var13;
                                        if (var25) {
                                            class752.field10514 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1794((byte) 127) - var14 - var13.field549 / 2) * 2.0D / (double) class84.field1178);
                                            int var50 = (int) (-((double) (var23 + var28.method1793((byte) -100) - var15 - var13.field574 / 2) * 2.0D / (double) class84.field1178));
                                            int var51 = class633.field8862 + var49 + class84.field1201;
                                            int var52 = field4272 + var50 + class84.field1190;
                                            class120 var53 = class566.method3297(-121);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method871(var51, var52, (byte) 45, var54);
                                            if (var54 != null) {
                                                if (class35.field371.method2474(82, (byte) 119) && class245.field3569 > 0) {
                                                    class343.method2178(var54[0], var54[2], var54[1], false);
                                                    continue;
                                                }
                                                class149.field2331 = true;
                                                class257.field3692 = var54[0];
                                                class270.field3856 = var54[1];
                                                class341.field4949 = var54[2];
                                            }
                                            class189.field2871 = 1;
                                            class178.field2755 = false;
                                            class612.field8649 = class632.field8840.method2697(4212);
                                            class289.field4114 = class632.field8840.method2698(0);
                                            continue;
                                        }
                                        if (var26 && class189.field2871 > 0) {
                                            if (class189.field2871 == 1 && (class612.field8649 != class632.field8840.method2697(4212) || class289.field4114 != class632.field8840.method2698(0))) {
                                                class74.field1034 = class633.field8862;
                                                class341.field4950 = field4272;
                                                class189.field2871 = 2;
                                            }
                                            if (class189.field2871 == 2) {
                                                class178.field2755 = true;
                                                class476.method2872((byte) -40, class74.field1034 + (int) ((double) (class612.field8649 - class632.field8840.method2697(4212)) * 2.0D / (double) class84.field1179));
                                                class478.method2880(-1, class341.field4950 - (int) ((double) (class289.field4114 - class632.field8840.method2698(0)) * 2.0D / (double) class84.field1179));
                                            }
                                            continue;
                                        }
                                        if (class189.field2871 > 0 && !class178.field2755) {
                                            if ((class190.field2881 == 1 || class268.method1716((byte) -57)) && class68.field969 > 2) {
                                                class249.method1648(class612.field8649, class289.field4114, -127);
                                            } else if (class267.method1713((byte) -114)) {
                                                class249.method1648(class612.field8649, class289.field4114, -128);
                                            }
                                        }
                                        class189.field2871 = 0;
                                        continue;
                                    }
                                    if (class248.field3607 == var13.field521) {
                                        if (var26) {
                                            class262.method1692(var13.field574, var22 + class632.field8840.method2697(4212) - var14, 121, var13.field549, var23 + class632.field8840.method2698(0) - var15);
                                        }
                                        continue;
                                    }
                                    if (class377.field5713 == var13.field521) {
                                        class48.method357(true, var14, var13, var15);
                                        continue;
                                    }
                                }
                                if (!var13.field616 && var27) {
                                    var13.field616 = true;
                                    if (var13.field648 != null) {
                                        class177 var55 = new class177();
                                        var55.field2738 = true;
                                        var55.field2743 = var13;
                                        var55.field2741 = var22 + var28.method1794((byte) 119) - var14;
                                        var55.field2734 = var23 + var28.method1793((byte) 104) - var15;
                                        var55.field2737 = var13.field648;
                                        class150.field2337.method1203(var55, (byte) 75);
                                    }
                                }
                                if (var13.field616 && var26 && var13.field622 != null) {
                                    class177 var56 = new class177();
                                    var56.field2738 = true;
                                    var56.field2743 = var13;
                                    var56.field2741 = var22 + class632.field8840.method2697(4212) - var14;
                                    var56.field2734 = var23 + class632.field8840.method2698(0) - var15;
                                    var56.field2737 = var13.field622;
                                    class150.field2337.method1203(var56, (byte) 76);
                                }
                                if (var13.field616 && !var26) {
                                    var13.field616 = false;
                                    if (var13.field600 != null) {
                                        class177 var57 = new class177();
                                        var57.field2738 = true;
                                        var57.field2743 = var13;
                                        var57.field2741 = var22 + class632.field8840.method2697(4212) - var14;
                                        var57.field2734 = var23 + class632.field8840.method2698(0) - var15;
                                        var57.field2737 = var13.field600;
                                        class716.field10073.method1203(var57, (byte) 91);
                                    }
                                }
                                if (var26 && var13.field524 != null) {
                                    class177 var58 = new class177();
                                    var58.field2738 = true;
                                    var58.field2743 = var13;
                                    var58.field2741 = var22 + class632.field8840.method2697(4212) - var14;
                                    var58.field2734 = var23 + class632.field8840.method2698(0) - var15;
                                    var58.field2737 = var13.field524;
                                    class150.field2337.method1203(var58, (byte) -87);
                                }
                                if (!var13.field604 && var25) {
                                    var13.field604 = true;
                                    if (var13.field662 != null) {
                                        class177 var59 = new class177();
                                        var59.field2738 = true;
                                        var59.field2743 = var13;
                                        var59.field2741 = var22 + class632.field8840.method2697(4212) - var14;
                                        var59.field2734 = var23 + class632.field8840.method2698(0) - var15;
                                        var59.field2737 = var13.field662;
                                        class150.field2337.method1203(var59, (byte) -60);
                                    }
                                }
                                if (var13.field604 && var25 && var13.field542 != null) {
                                    class177 var60 = new class177();
                                    var60.field2738 = true;
                                    var60.field2743 = var13;
                                    var60.field2741 = var22 + class632.field8840.method2697(4212) - var14;
                                    var60.field2734 = var23 + class632.field8840.method2698(0) - var15;
                                    var60.field2737 = var13.field542;
                                    class150.field2337.method1203(var60, (byte) 100);
                                }
                                if (var13.field604 && !var25) {
                                    var13.field604 = false;
                                    if (var13.field689 != null) {
                                        class177 var61 = new class177();
                                        var61.field2738 = true;
                                        var61.field2743 = var13;
                                        var61.field2741 = var22 + class632.field8840.method2697(4212) - var14;
                                        var61.field2734 = var23 + class632.field8840.method2698(0) - var15;
                                        var61.field2737 = var13.field689;
                                        class716.field10073.method1203(var61, (byte) 85);
                                    }
                                }
                                if (var13.field688 != null) {
                                    class177 var62 = new class177();
                                    var62.field2743 = var13;
                                    var62.field2737 = var13.field688;
                                    class533.field7665.method1203(var62, (byte) 76);
                                }
                                if (var13.field563 != null && class703.field9798 > var13.field519) {
                                    if (var13.field545 == null || class703.field9798 - var13.field519 > 32) {
                                        class177 var67 = new class177();
                                        var67.field2743 = var13;
                                        var67.field2737 = var13.field563;
                                        class150.field2337.method1203(var67, (byte) 97);
                                    } else {
                                        label699: for (int var63 = var13.field519; var63 < class703.field9798; var63++) {
                                            int var64 = class369.field5315[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field545.length; var65++) {
                                                if (var13.field545[var65] == var64) {
                                                    class177 var66 = new class177();
                                                    var66.field2743 = var13;
                                                    var66.field2737 = var13.field563;
                                                    class150.field2337.method1203(var66, (byte) -69);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field519 = class703.field9798;
                                }
                                if (var13.field636 != null && class703.field9802 > var13.field539) {
                                    if (var13.field584 == null || class703.field9802 - var13.field539 > 32) {
                                        class177 var72 = new class177();
                                        var72.field2743 = var13;
                                        var72.field2737 = var13.field636;
                                        class150.field2337.method1203(var72, (byte) 102);
                                    } else {
                                        label675: for (int var68 = var13.field539; var68 < class703.field9802; var68++) {
                                            int var69 = class378.field5714[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field584.length; var70++) {
                                                if (var13.field584[var70] == var69) {
                                                    class177 var71 = new class177();
                                                    var71.field2743 = var13;
                                                    var71.field2737 = var13.field636;
                                                    class150.field2337.method1203(var71, (byte) 104);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field539 = class703.field9802;
                                }
                                if (var13.field570 != null && class356.field5174 > var13.field631) {
                                    if (var13.field673 == null || class356.field5174 - var13.field631 > 32) {
                                        class177 var77 = new class177();
                                        var77.field2743 = var13;
                                        var77.field2737 = var13.field570;
                                        class150.field2337.method1203(var77, (byte) -98);
                                    } else {
                                        label651: for (int var73 = var13.field631; var73 < class356.field5174; var73++) {
                                            int var74 = class339.field4934[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field673.length; var75++) {
                                                if (var13.field673[var75] == var74) {
                                                    class177 var76 = new class177();
                                                    var76.field2743 = var13;
                                                    var76.field2737 = var13.field570;
                                                    class150.field2337.method1203(var76, (byte) -38);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field631 = class356.field5174;
                                }
                                if (var13.field576 != null && class25.field261 > var13.field536) {
                                    if (var13.field587 == null || class25.field261 - var13.field536 > 32) {
                                        class177 var82 = new class177();
                                        var82.field2743 = var13;
                                        var82.field2737 = var13.field576;
                                        class150.field2337.method1203(var82, (byte) 98);
                                    } else {
                                        label627: for (int var78 = var13.field536; var78 < class25.field261; var78++) {
                                            int var79 = class143.field1867[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field587.length; var80++) {
                                                if (var13.field587[var80] == var79) {
                                                    class177 var81 = new class177();
                                                    var81.field2743 = var13;
                                                    var81.field2737 = var13.field576;
                                                    class150.field2337.method1203(var81, (byte) 77);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field536 = class25.field261;
                                }
                                if (var13.field515 != null && class312.field4410 > var13.field581) {
                                    if (var13.field547 == null || class312.field4410 - var13.field581 > 32) {
                                        class177 var87 = new class177();
                                        var87.field2743 = var13;
                                        var87.field2737 = var13.field515;
                                        class150.field2337.method1203(var87, (byte) 116);
                                    } else {
                                        label603: for (int var83 = var13.field581; var83 < class312.field4410; var83++) {
                                            int var84 = class460.field6784[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field547.length; var85++) {
                                                if (var13.field547[var85] == var84) {
                                                    class177 var86 = new class177();
                                                    var86.field2743 = var13;
                                                    var86.field2737 = var13.field515;
                                                    class150.field2337.method1203(var86, (byte) -45);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field581 = class312.field4410;
                                }
                                if (class81.field1137 > var13.field677 && var13.field532 != null) {
                                    class177 var88 = new class177();
                                    var88.field2743 = var13;
                                    var88.field2737 = var13.field532;
                                    class150.field2337.method1203(var88, (byte) -76);
                                }
                                if (class211.field3149 > var13.field677 && var13.field525 != null) {
                                    class177 var89 = new class177();
                                    var89.field2743 = var13;
                                    var89.field2737 = var13.field525;
                                    class150.field2337.method1203(var89, (byte) -81);
                                }
                                if (class677.field9413 > var13.field677 && var13.field618 != null) {
                                    class177 var90 = new class177();
                                    var90.field2743 = var13;
                                    var90.field2737 = var13.field618;
                                    class150.field2337.method1203(var90, (byte) 72);
                                }
                                if (class727.field10151 > var13.field677 && var13.field647 != null) {
                                    class177 var91 = new class177();
                                    var91.field2743 = var13;
                                    var91.field2737 = var13.field647;
                                    class150.field2337.method1203(var91, (byte) 114);
                                }
                                if (class76.field1064 > var13.field677 && var13.field586 != null) {
                                    class177 var92 = new class177();
                                    var92.field2743 = var13;
                                    var92.field2737 = var13.field586;
                                    class150.field2337.method1203(var92, (byte) -70);
                                }
                                var13.field677 = class589.field8351;
                                if (var13.field561 != null) {
                                    for (int var93 = 0; var93 < class730.field10232; var93++) {
                                        class177 var94 = new class177();
                                        var94.field2743 = var13;
                                        var94.field2740 = class516.field7374[var93].method711(10196);
                                        var94.field2739 = class516.field7374[var93].method712((byte) -92);
                                        var94.field2737 = var13.field561;
                                        class150.field2337.method1203(var94, (byte) -89);
                                    }
                                }
                                if (class261.field3714 && var13.field551 != null) {
                                    class177 var95 = new class177();
                                    var95.field2743 = var13;
                                    var95.field2737 = var13.field551;
                                    class150.field2337.method1203(var95, (byte) -50);
                                }
                            }
                            if (var13.field577 == 5 && var13.field559 != -1) {
                                var13.method340(-512, class288.field4108, class684.field9464).method2673(class736.field10316, -124, var13.field574);
                            }
                            class163.method1189(19919, var13);
                            if (var13.field577 == 0) {
                                method1890(arg0, var13.field610, var16, var17, var18, var19, var14 - var13.field527, var15 - var13.field554, arg8, arg9, arg10, arg11);
                                if (var13.field621 != null) {
                                    method1890(var13.field621, var13.field610, var16, var17, var18, var19, var14 - var13.field527, var15 - var13.field554, arg8, arg9, arg10, arg11);
                                }
                                class421 var96 = (class421) class291.field4168.method2287((long) var13.field610, (byte) -117);
                                if (var96 != null) {
                                    if (class555.field7936 == class199.field2993 && var96.field6285 == 0 && !class483.field6967 && var25 && !class501.field7119) {
                                        class579.method3363((byte) 73);
                                    }
                                    class644.method3691(arg10, var19, var18, 3, var17, var15, var96.field6282, arg9, var16, var14, arg8, arg11);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class163.method1189(19919, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1960)
    public static final void method1891() {
        int var0 = class254.field3653;
        int[] var1 = class345.field4993;
        int var2 = class459.field6759 ? var0 : class441.field6552 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class405 var4;
            if (var3 < var0) {
                var4 = class314.field4456[var1[var3]];
            } else {
                var4 = ((class432) class497.field7067.method2287((long) class338.field4921[var3 - var0], (byte) -117)).field6439;
            }
            if (var4.field6114 >= 0) {
                int var5 = var4.method2579(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8423 & 0x1FF) == 0 && (var4.field8428 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field8423 & 0x1FF) == 256 && (var4.field8428 & 0x1FF) == 256) {
                    continue;
                }
                var4.field8421 = class384.method2468(true, var4.field8423, var4.field8429, var4.field8428);
                class9.method57(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V", line = 2002)
    public static final void method1892(int arg0, boolean arg1) {
        field4256++;
        if (arg1 && class84.field1177 != null) {
            class425.field6314 = class84.field1177.field1641;
        } else {
            class425.field6314 = -1;
        }
        class55.field769 = null;
        if (arg0 > -118) {
            field4275 = null;
        }
        class735.field10311 = 0;
        class603.field8529 = null;
        class84.field1177 = null;
        class84.method671();
        class84.field1180.method1200(68);
        class228.field3353 = null;
        class462.field6807 = null;
        class656.field9196 = null;
        class270.field3860 = -1;
        class381.field5751 = null;
        class242.field3537 = null;
        class449.field6663 = null;
        class519.field7415 = null;
        class190.field2880 = -1;
        class84.field1181 = null;
        class355.field5168 = null;
        class284.field4043 = null;
        if (class84.field1175 != null) {
            class84.field1175.method860(256);
            class84.field1175.method863(-257, 128, 64);
        }
        if (class84.field1174 != null) {
            class84.field1174.method4123(-27393, 64, 64);
        }
        if (class84.field1172 != null) {
            class84.field1172.method397(-8513, 64);
        }
        class665.field9346.method3010(64, (byte) 123);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2050)
    public final void method1005(int arg0) {
        if (arg0 >= -80) {
            return;
        }
        field4266++;
        if (class63.field916.field10200.method3848(17503) != 2) {
            this.method1888(0);
            return;
        }
        try {
            this.method1888(0);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class326.method2072(-3753, var5, var5.getMessage() + " (Recovered) " + this.method997(5200));
            class394.field5926 = true;
            class134.method950(0, 0, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2079)
    public final void method1004(int arg0) {
        field4262++;
        if (arg0 != 0) {
            return;
        }
        if (class63.field916.field10200.method3848(17503) != 2) {
            this.method1899(arg0);
            return;
        }
        try {
            this.method1899(0);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class326.method2072(-3753, var5, var5.getMessage() + " (Recovered) " + this.method997(5200));
            class394.field5926 = true;
            class134.method950(0, 0, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2105)
    private final void method1893(int arg0) {
        field4260++;
        if (class115.field1594.field33 > class41.field445) {
            class528.field7513.method3332(arg0 ^ 0xFFFF0C76);
            class701.field9738 = (class115.field1594.field33 - 1) * 5 * 50;
            if (class701.field9738 > 3000) {
                class701.field9738 = 3000;
            }
            if (class115.field1594.field33 >= 2 && class115.field1594.field36 == 6) {
                this.method1008("js5connect_outofdate", false);
                class87.field1246 = 14;
                return;
            }
            if (class115.field1594.field33 >= 4 && class115.field1594.field36 == -1) {
                this.method1008("js5crc", false);
                class87.field1246 = 14;
                return;
            }
            if (class115.field1594.field33 >= 4 && class657.method3798(class87.field1246, (byte) -72)) {
                if (class115.field1594.field36 == 7 || class115.field1594.field36 == 9) {
                    this.method1008("js5connect_full", false);
                } else if (class115.field1594.field36 <= 0) {
                    this.method1008("js5io", false);
                } else if (class237.field3454 == null) {
                    this.method1008("js5connect", false);
                } else {
                    this.method1008("js5proxy_" + class237.field3454.trim(), false);
                }
                class87.field1246 = 14;
                return;
            }
        }
        class41.field445 = class115.field1594.field33;
        if (class701.field9738 > 0) {
            class701.field9738--;
            return;
        }
        try {
            if (class193.field2925 == 0) {
                class67.field955 = class528.field7513.method3334(class179.field2759, false);
                class193.field2925++;
            }
            if (class193.field2925 == 1) {
                if (class67.field955.field2986 == 2) {
                    if (class67.field955.field2990 != null) {
                        class237.field3454 = (String) class67.field955.field2990;
                    }
                    this.method1905(90, 1000);
                    return;
                }
                if (class67.field955.field2986 == 1) {
                    class193.field2925++;
                }
            }
            if (class193.field2925 == 2) {
                class19.field217 = new class308((Socket) class67.field955.field2990, class179.field2759, 25000);
                class645 var2 = new class645(5);
                var2.method3730(109, class725.field10120.field7796);
                var2.method3695(639, 255);
                class19.field217.method1950(0, var2.field9068, 5, 5000);
                class193.field2925++;
                class347.field5009 = class524.method3075(arg0 - 49982);
            }
            if (arg0 != 50000) {
                method1894(-23, -75);
            }
            if (class193.field2925 == 3) {
                if (class657.method3798(class87.field1246, (byte) -72) || class19.field217.method1951((byte) -128) > 0) {
                    int var3 = class19.field217.method1945(false);
                    if (var3 != 0) {
                        this.method1905(arg0 - 49897, var3);
                        return;
                    }
                    class193.field2925++;
                } else if ((class524.method3075(18) - class347.field5009) > 30000L) {
                    this.method1905(117, 1001);
                    return;
                }
            }
            if (class193.field2925 == 4) {
                boolean var4 = class657.method3798(class87.field1246, (byte) -72) || class245.method1633(class87.field1246, 695) || class245.method1631(-10, class87.field1246);
                class334[] var5 = class334.method2104((byte) 67);
                class645 var6 = new class645(var5.length * 4);
                class19.field217.method1948(var6.field9068.length, 0, (byte) 12, var6.field9068);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method2107((byte) -89, var6.method3720(-19541));
                }
                class115.field1594.method8(class19.field217, (byte) -50, !var4);
                class67.field955 = null;
                class193.field2925 = 0;
                class19.field217 = null;
            }
        } catch (IOException var8) {
            this.method1905(-110, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I", line = 2275)
    public static final int method1894(int arg0, int arg1) {
        field4268++;
        if (arg0 != 26831) {
            return 98;
        }
        byte var2;
        if (arg1 > 12000) {
            class647.method3761(arg0 ^ 0xFFFFF947);
            var2 = 4;
        } else if (arg1 > 5000) {
            class505.method2999(0);
            var2 = 3;
        } else if (arg1 <= 2000) {
            class645.method3699(true, false);
            var2 = 1;
        } else {
            var2 = 2;
            class242.method1608(arg0 ^ 0x68CF);
        }
        if (class63.field916.field10200.method3848(arg0 - 9328) != 2) {
            class63.field916.method4111(102, 2, class63.field916.field10177);
            class134.method950(0, 2, false);
        }
        class585.method3384(99);
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2322)
    public final void init() {
        field4273++;
        if (!this.method1012((byte) -32)) {
            return;
        }
        class642.field9006 = new class575();
        class642.field9006.field8131 = Integer.parseInt(this.getParameter("worldid"));
        class15.field202 = new class575();
        class15.field202.field8131 = Integer.parseInt(this.getParameter("lobbyid"));
        class15.field202.field8138 = this.getParameter("lobbyaddress");
        class92.field1287 = new class575();
        class92.field1287.field8131 = Integer.parseInt(this.getParameter("demoid"));
        class92.field1287.field8138 = this.getParameter("demoaddress");
        class206.field3043 = class214.method1454(true, Integer.parseInt(this.getParameter("modewhere")));
        if (class396.field5945 == class206.field3043) {
            class206.field3043 = class370.field5322;
        } else if (!class410.method2604(class206.field3043, (byte) 67) && class607.field8585 != class206.field3043) {
            class206.field3043 = class607.field8585;
        }
        class230.field3378 = class559.method3266(Integer.parseInt(this.getParameter("modewhat")), -5);
        if (class686.field9488 != class230.field3378 && class637.field8947 != class230.field3378 && class324.field4617 != class230.field3378) {
            class230.field3378 = class324.field4617;
        }
        try {
            class650.field9160 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class650.field9160 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class701.field9736 = true;
        } else {
            class701.field9736 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class590.field8364 = true;
        } else {
            class590.field8364 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class716.field10075 = true;
        } else {
            class716.field10075 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class199.field2993 = class555.field7936;
            } else if (var4.equals("1")) {
                class199.field2993 = class373.field5652;
            } else if (var4.equals("2")) {
                class199.field2993 = class61.field883;
            } else if (var4.equals("3")) {
                class199.field2993 = class337.field4912;
            }
        }
        try {
            class299.field4243 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class299.field4243 = 0;
        }
        class79.field1108 = this.getParameter("quiturl");
        class736.field10317 = this.getParameter("settings");
        if (class736.field10317 == null) {
            class736.field10317 = "";
        }
        class8.field108 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class582.field8279 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class582.field8279 = 0;
            }
        }
        class73.field1026 = Integer.parseInt(this.getParameter("colourid"));
        if (class73.field1026 < 0 || class13.field178.length <= class73.field1026) {
            class73.field1026 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class230.field3377 = true;
            class71.field1005 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class221.field3257 = true;
        }
        class72.field1015 = this.getParameter("sskey");
        if (class72.field1015 != null && class72.field1015.length() < 2) {
            class72.field1015 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class580.field8247 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class612.field8655 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class293.field4177 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class64.field925 = this.getParameter("additionalInfo");
        if (class64.field925 != null && class64.field925.length() > 50) {
            class64.field925 = null;
        }
        if (class555.field7936 == class199.field2993) {
            class344.field4988 = 503;
            class291.field4165 = 765;
        } else if (class373.field5652 == class199.field2993) {
            class344.field4988 = 480;
            class291.field4165 = 640;
        }
        class236.field3433 = this;
        this.method995(class230.field3378.method1233(-32687) + 32, class291.field4165, 639, 48, class344.field4988, 37, class199.field2993.field6822);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2482)
    public static final void method1895() {
        class246.field3580 = 0;
        for (int var0 = 0; var0 < class441.field6552; var0++) {
            class282 var1 = ((class432) class497.field7067.method2287((long) class338.field4921[var0], (byte) -117)).field6439;
            if (var1.field6095 && var1.method1799(314462286) != -1) {
                int var2 = (var1.method2579(false) - 1) * 256 + 252;
                int var3 = var1.field8423 - var2 >> 9;
                int var4 = var1.field8428 - var2 >> 9;
                class405 var5 = class51.method369(var1.field8429, -106, var3, var4);
                if (var5 != null) {
                    int var6 = var5.field6118;
                    if (var5 instanceof class282) {
                        var6 += 2048;
                    }
                    if (var5.field6067 == 0 && var5.method1799(314462286) != -1) {
                        class261.field3713[class246.field3580] = var6;
                        class62.field891[class246.field3580] = var6;
                        class246.field3580++;
                        var5.field6067++;
                    }
                    class261.field3713[class246.field3580] = var6;
                    class62.field891[class246.field3580] = var1.field6118 + 2048;
                    class246.field3580++;
                    var5.field6067++;
                }
            }
        }
        class194.method1346(class246.field3580 - 1, 0, class62.field891, class261.field3713, (byte) 58);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2530)
    private final void method1896(int arg0) {
        if (class87.field1246 == 7 && class233.field3400 == 0) {
            if (class677.field9415 > 1) {
                class677.field9415--;
                class76.field1064 = class589.field8351;
            }
            if (!class483.field6967) {
                class579.method3363((byte) 73);
            }
            for (int var2 = 0; var2 < 100 && class763.method4235((byte) 123); var2++) {
            }
        }
        field4271++;
        class12.field171++;
        class325.method2065(-1, null, -11167, -1);
        class48.method357(true, -1, null, -1);
        class67.method595(-24367);
        class589.field8351++;
        for (int var3 = 0; var3 < class567.field8058; var3++) {
            class282 var4 = class488.field6985[var3].field6439;
            if (var4 != null) {
                byte var5 = var4.field4008.field5100;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2579(false);
                    if ((var5 & 0x2) != 0 && var4.field6130 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field6133[0] + var7;
                            int var10 = var4.field6139[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class194.field2946 - var6 - 1) < var9) {
                                var9 = class194.field2946 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class255.field3656 - var6 - 1 < var10) {
                                var10 = class255.field3656 - var6 - 1;
                            }
                            int var11 = class64.method570(var4.field6139[0], var4.field6133[0], var9, var6, true, false, -1, var6, 0, class595.field8437, class326.field4655[var4.field8429], var10, 0, var6, class35.field361);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field6133[var12] = class595.field8437[var11 - var12 - 1];
                                    var4.field6139[var12] = class35.field361[var11 - var12 - 1];
                                    var4.field6131[var12] = 1;
                                }
                                var4.field6130 = var11;
                            }
                        }
                    }
                    class50.method365(true, 23467, var4);
                    int var13 = class705.method4007(0, var4);
                    class618.method3560(var4, (byte) -102);
                    class647.method3765(var4, var13, class164.field2591, class13.field177, arg0 ^ 0xFFFF38FF);
                    class94.method742((byte) 114, class164.field2591, var4);
                    class96.method747((byte) -97, var4);
                }
            }
        }
        if (class233.field3400 == 0 && class661.field9245 == 0) {
            if (class264.field3784 == 2) {
                class343.method2176(97);
            } else {
                class233.method1552(125);
            }
            if (class364.field5254 >> 9 < 14 || class194.field2946 - 14 <= class364.field5254 >> 9 || class460.field6783 >> 9 < 14 || class255.field3656 - 14 <= class460.field6783 >> 9) {
                class606.method3517(false);
            }
        }
        while (true) {
            class177 var14;
            class46 var15;
            class46 var16;
            do {
                var14 = (class177) class533.field7665.method1198((byte) 60);
                if (var14 == null) {
                    while (true) {
                        class177 var17;
                        class46 var18;
                        class46 var19;
                        do {
                            var17 = (class177) class716.field10073.method1198((byte) 62);
                            if (var17 == null) {
                                if (arg0 != -65281) {
                                    field4272 = -101;
                                }
                                while (true) {
                                    class177 var20;
                                    class46 var21;
                                    class46 var22;
                                    do {
                                        var20 = (class177) class150.field2337.method1198((byte) 61);
                                        if (var20 == null) {
                                            if (class609.field8613 != null) {
                                                class562.method3282(false);
                                            }
                                            if ((class357.field5189 % 1500) == 0) {
                                                class596.method3472((byte) -127);
                                            }
                                            if (class87.field1246 == 7 && class233.field3400 == 0) {
                                                class179.method1267(true);
                                            }
                                            class724.method4084(false);
                                            if (class479.field6948 && (class524.method3075(arg0 ^ -65299) - 60000L) > class673.field9388) {
                                                class88.method708(false);
                                            }
                                            for (class501 var23 = (class501) class123.field1662.method1615((byte) 62); var23 != null; var23 = (class501) class123.field1662.method1625(arg0 + 65201)) {
                                                if ((long) var23.field7113 < class524.method3075(18) / 1000L - 5L) {
                                                    if (var23.field7114 > 0) {
                                                        class25.method125(0, "", 0, var23.field7118 + class430.field6389.method2679(class650.field9160, arg0 ^ 0xFF37), 5, "", "");
                                                    }
                                                    if (var23.field7114 == 0) {
                                                        class25.method125(0, "", 0, var23.field7118 + class430.field6390.method2679(class650.field9160, -75), 5, "", "");
                                                    }
                                                    var23.method385((byte) -23);
                                                }
                                            }
                                            if (class87.field1246 == 7 && class233.field3400 == 0) {
                                                if (class533.field7668 == null) {
                                                    class109.method812(false, (byte) -70);
                                                    return;
                                                }
                                                class77.field1072++;
                                                if (class77.field1072 > 50) {
                                                    class748.field10465++;
                                                    class468 var24 = class93.method734(class29.field284, class173.field2684, 8174);
                                                    class120.method872((byte) 80, var24);
                                                }
                                                try {
                                                    class691.method3927(arg0 ^ 0xFFFF069C);
                                                    return;
                                                } catch (IOException var25) {
                                                    class109.method812(false, (byte) 98);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field2743;
                                        if (var21.field603 < 0) {
                                            break;
                                        }
                                        var22 = class405.method2580(var21.field557, -57);
                                    } while (var22 == null || var22.field621 == null || var22.field621.length <= var21.field603 || var22.field621[var21.field603] != var21);
                                    class709.method4025(var20);
                                }
                            }
                            var18 = var17.field2743;
                            if (var18.field603 < 0) {
                                break;
                            }
                            var19 = class405.method2580(var18.field557, arg0 ^ 0xFFFF00B8);
                        } while (var19 == null || var19.field621 == null || var19.field621.length <= var18.field603 || var19.field621[var18.field603] != var18);
                        class709.method4025(var17);
                    }
                }
                var15 = var14.field2743;
                if (var15.field603 < 0) {
                    break;
                }
                var16 = class405.method2580(var15.field557, 91);
            } while (var16 == null || var16.field621 == null || var16.field621.length <= var15.field603 || var16.field621[var15.field603] != var15);
            class709.method4025(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2814)
    public static void method1897(boolean arg0) {
        field4275 = null;
        field4263 = null;
        field4276 = null;
        if (!arg0) {
            method1904(-42);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2828)
    public static final void method1898() {
        for (int var0 = 0; var0 < class194.field2946; var0++) {
            int[] var1 = class740.field10379[var0];
            for (int var2 = 0; var2 < class255.field3656; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2846)
    public final void method994(byte arg0) {
        if (class479.field6948) {
            class88.method708(false);
        }
        field4259++;
        class697.method3960(1);
        if (class736.field10316 != null) {
            class736.field10316.method447((byte) -9);
        }
        if (class183.field2801 != null) {
            class295.method1869(class183.field2801, (byte) -34, class179.field2759);
            class183.field2801 = null;
        }
        if (class533.field7668 != null) {
            class533.field7668.method850(2);
            class533.field7668 = null;
        }
        class54.method380(0);
        class115.field1594.method16(0);
        class376.field5694.method1968(127);
        if (class720.field10102 != null) {
            class720.field10102.method1274(-1);
            class720.field10102 = null;
        }
        try {
            class329.field4694.method3413(-117);
            for (int var2 = 0; var2 < 37; var2++) {
                class165.field2608[var2].method3413(-53);
            }
            class333.field4776.method3413(-123);
            class73.field1020.method3413(-99);
            if (arg0 > -78) {
                method1898();
            }
            class615.method3556((byte) 2);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 2905)
    private final void method1899(int arg0) {
        field4254++;
        if (class87.field1246 == 14) {
            return;
        }
        class357.field5189++;
        if ((class357.field5189 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class374.field5678 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class299.field4250.setSeed((long) class374.field5678);
        }
        if (class357.field5189 % 50 == 0) {
            class181.field2782 = class649.field9151;
            class286.field4072 = class123.field1666;
            class649.field9151 = 0;
            class123.field1666 = 0;
        }
        this.method1900(arg0 ^ 0xFFFF8D44);
        if (class176.field2726 != null) {
            class176.field2726.method2641(arg0 + 6);
        }
        class57.method401(-24289);
        class420.method2646((byte) -120);
        class35.field371.method2473((byte) 33);
        class632.field8840.method2691(9231);
        if (class736.field10316 != null) {
            class736.field10316.method487((int) class524.method3075(18));
        }
        class411.method2606((byte) 36);
        class730.field10232 = 0;
        class748.field10462 = 0;
        for (class204 var3 = class35.field371.method2476(83); var3 != null; var3 = class35.field371.method2476(82)) {
            int var6 = var3.method714(49);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method712((byte) -92);
                if (class157.method1159(1) && var7 == '`' || var7 == '§' || var7 == '²') {
                    if (class559.method3268((byte) 108)) {
                        class196.method1369(0);
                    } else {
                        class731.method4125((byte) -126);
                    }
                } else if (class730.field10232 < 128) {
                    class516.field7374[class730.field10232] = var3;
                    class730.field10232++;
                }
            } else if (var6 == 0 && class748.field10462 < 75) {
                class618.field8688[class748.field10462] = var3;
                class748.field10462++;
            }
        }
        class671.field9360 = arg0;
        for (class467 var4 = class632.field8840.method2699(false); var4 != null; var4 = class632.field8840.method2699(false)) {
            int var5 = var4.method1792((byte) -58);
            if (var5 == -1) {
                class665.field9341.method1203(var4, (byte) 93);
            } else if (var5 == 6) {
                class671.field9360 += var4.method1795((byte) -71);
            } else if (class442.method2743(var5, false)) {
                class264.field3741.method1203(var4, (byte) 108);
                if (class264.field3741.method1196(-2) > 10) {
                    class264.field3741.method1198((byte) 66);
                }
            }
        }
        if (class559.method3268((byte) 119)) {
            class41.method290(-121);
        }
        if (class657.method3798(class87.field1246, (byte) -72)) {
            class511.method3029(false);
            class375.method2430((byte) -108);
        } else if (class221.method1487(arg0 - 9, class87.field1246)) {
            class681.method3901(arg0 ^ 0x70B0);
        }
        if (class245.method1633(class87.field1246, 695) && !class221.method1487(arg0 - 9, class87.field1246)) {
            this.method1896(-65281);
            class597.method3476((byte) 97);
            class335.method2113(-236);
        } else if (class245.method1631(-10, class87.field1246) && !class221.method1487(arg0 - 9, class87.field1246)) {
            this.method1896(arg0 ^ 0xFFFF00FF);
            class335.method2113(-236);
        } else if (class87.field1246 == 12) {
            class335.method2113(-236);
        } else if (class239.method1585(class87.field1246, (byte) 99) && !class221.method1487(-9, class87.field1246)) {
            class749.method4181(61);
        } else if (class87.field1246 == 13) {
            class335.method2113(arg0 ^ 0xFFFFFF14);
            if (class209.field3057 != -3 && class209.field3057 != 2 && class209.field3057 != 15) {
                class109.method812(false, (byte) -75);
            }
        }
        class45.method311((byte) -100, class736.field10316);
        class264.field3741.method1198((byte) 83);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;", line = 3068)
    public final String method997(int arg0) {
        field4270++;
        if (arg0 != 5200) {
            this.method1009(84);
        }
        String var2 = null;
        try {
            var2 = "[1)" + class361.field5224 + "," + class582.field8288 + "," + class194.field2946 + "," + class255.field3656 + "|";
            if (class130.field1749 != null) {
                var2 = var2 + "2)" + class341.field4946 + "," + (class130.field1749.field6133[0] + class361.field5224) + "," + (class130.field1749.field6139[0] + class582.field8288) + "|";
            }
            var2 = var2 + "3)" + class63.field916.field10200.method3848(17503) + "|4)" + class63.field916.field10196.method1426(17503) + "|5)" + class756.method4219((byte) 8) + "|6)" + class501.field7123 + "," + class510.field7263 + "|";
            var2 = var2 + "7)" + class63.field916.field10175.method1990(arg0 + 12303) + "|";
            var2 = var2 + "8)" + class63.field916.field10185.method2160(17503) + "|";
            var2 = var2 + "9)" + class63.field916.field10166.method4091(17503) + "|";
            var2 = var2 + "10)" + class63.field916.field10162.method4009(17503) + "|";
            var2 = var2 + "11)" + class63.field916.field10201.method2846(arg0 ^ 0x500F) + "|";
            var2 = var2 + "12)" + class63.field916.field10204.method368(17503) + "|";
            var2 = var2 + "13)" + class265.field3794 + "|";
            var2 = var2 + "14)" + class87.field1246;
            if (class259.field3702 != null) {
                var2 = var2 + "|15)" + class259.field3702.field7533;
            }
            try {
                if (class63.field916.field10200.method3848(17503) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4280 == null ? (field4280 = method1906("client")) : field4280).getClassLoader());
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
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V", line = 3152)
    private final void method1900(int arg0) {
        if (arg0 != -29372) {
            return;
        }
        field4265++;
        boolean var2 = class115.field1594.method6(true);
        if (!var2) {
            this.method1893(50000);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsca;II)I", line = 3170)
    public static final int method1901(class46 arg0, int arg1, int arg2) {
        if (arg1 >= -35) {
            method1903();
        }
        field4261++;
        if (!method1886(arg0).method1556(arg2, 97) && arg0.field608 == null) {
            return -1;
        } else if (arg0.field678 == null || arg0.field678.length <= arg2) {
            return -1;
        } else {
            return arg0.field678[arg2];
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V", line = 3186)
    public static final void method1902(int arg0) {
        int var1 = class254.field3653;
        int[] var2 = class345.field4993;
        int var3 = class459.field6759 ? var1 : class441.field6552 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class405 var5;
            if (var4 < var1) {
                var5 = class314.field4456[var2[var4]];
            } else {
                var5 = ((class432) class497.field7067.method2287((long) class338.field4921[var4 - var1], (byte) -117)).field6439;
            }
            if (var5.field8429 == arg0) {
                var5.field6067 = 0;
                if (var5.field6114 < 0) {
                    var5.field6095 = false;
                } else {
                    int var6 = var5.method2579(false);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field8423 & 0x1FF) != 0 || (var5.field8428 & 0x1FF) != 0) {
                            var5.field6095 = false;
                            continue;
                        }
                    } else if ((var5.field8423 & 0x1FF) != 256 || (var5.field8428 & 0x1FF) != 256) {
                        var5.field6095 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field8423 >> 9;
                        int var8 = var5.field8428 >> 9;
                        if (class740.field10379[var7][var8] != var5.field6114) {
                            var5.field6095 = true;
                            continue;
                        }
                        if (class426.field6326[var7][var8] > 1) {
                            var10002 = class426.field6326[var7][var8]--;
                            var5.field6095 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field8423 - var9 >> 9;
                        int var11 = var5.field8428 - var9 >> 9;
                        int var12 = var5.field8423 + var9 >> 9;
                        int var13 = var5.field8428 + var9 >> 9;
                        if (!class149.method1109(var10, var12, var5.field6114, var13, (byte) 117, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class740.field10379[var14][var15] == var5.field6114) {
                                        var10002 = class426.field6326[var14][var15]--;
                                    }
                                }
                            }
                            var5.field6095 = true;
                            continue;
                        }
                    }
                    var5.field6095 = false;
                    var5.field8421 = class384.method2468(true, var5.field8423, var5.field8429, var5.field8428);
                    class9.method57(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3301)
    public static final void method1903() {
        int var0 = class254.field3653;
        int[] var1 = class345.field4993;
        int var2 = class63.field916.field10165.method2588(17503);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class689 var14 = class314.field4456[var1[var4]];
            if (!var14.method3920(true)) {
                var14.field6114 = -1;
            } else if (var14.field9532) {
                var14.field6114 = -1;
            } else {
                var14.method736((byte) -93);
                if (var14.field1628 >= 0 && var14.field1626 >= 0 && var14.field1632 < class194.field2946 && var14.field1624 < class255.field3656) {
                    var14.field9518 = var14.field6032 ? var3 : false;
                    if (class130.field1749 == var14) {
                        var14.field6114 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field6095) {
                            var15++;
                        }
                        if (var14.field6027 > class357.field5189) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2579(false) << 2);
                        if (var14.field9497) {
                            var16 += 512;
                        } else {
                            if (class413.field6211 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field6114 = var16 + 1;
                    }
                } else {
                    var14.field6114 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class441.field6552; var5++) {
            class282 var11 = ((class432) class497.field7067.method2287((long) class338.field4921[var5], (byte) -117)).field6439;
            if (var11.method1807(true) && var11.field4008.method2196(0, class83.field1160)) {
                var11.method736((byte) -93);
                if (var11.field1628 >= 0 && var11.field1626 >= 0 && var11.field1632 < class194.field2946 && var11.field1624 < class255.field3656) {
                    int var12 = 0;
                    if (!var11.field6095) {
                        var12++;
                    }
                    if (var11.field6027 > class357.field5189) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2579(false) << 2);
                    if (class413.field6211 == 0) {
                        if (var11.field4008.field5098) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class413.field6211 == 1) {
                        if (var11.field4008.field5098) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field4008.field5042) {
                        var13 += 1024;
                    } else if (!var11.field4008.field5066) {
                        var13 += 256;
                    }
                    var11.field6114 = var13 + 1;
                } else {
                    var11.field6114 = -1;
                }
            } else {
                var11.field6114 = -1;
            }
        }
        for (int var6 = 0; var6 < class554.field7904.length; var6++) {
            class635 var7 = class554.field7904[var6];
            if (var7 != null) {
                if (var7.field8922 == 1) {
                    class432 var8 = (class432) class497.field7067.method2287((long) var7.field8921, (byte) -117);
                    if (var8 != null) {
                        class282 var9 = var8.field6439;
                        if (var9.field6114 >= 0) {
                            var9.field6114 += 2048;
                        }
                    }
                } else if (var7.field8922 == 10) {
                    class689 var10 = class314.field4456[var7.field8921];
                    if (var10 != null && class130.field1749 != var10 && var10.field6114 >= 0) {
                        var10.field6114 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V", line = 3474)
    public static final void method1904(int arg0) {
        int var1 = class254.field3653;
        int[] var2 = class345.field4993;
        for (int var3 = 0; var3 < class441.field6552 + var1; var3++) {
            class405 var4;
            if (var3 < var1) {
                var4 = class314.field4456[var2[var3]];
            } else {
                var4 = ((class432) class497.field7067.method2287((long) class338.field4921[var3 - var1], (byte) -117)).field6439;
            }
            if (var4.field8429 == arg0 && var4.field6114 >= 0) {
                int var5 = var4.method2579(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8423 & 0x1FF) != 0 || (var4.field8428 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field8423 & 0x1FF) != 256 || (var4.field8428 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field8423 >> 9;
                    int var7 = var4.field8428 >> 9;
                    if (var4.field6114 > class740.field10379[var6][var7]) {
                        class740.field10379[var6][var7] = var4.field6114;
                        class426.field6326[var6][var7] = 1;
                    } else if (class740.field10379[var6][var7] == var4.field6114) {
                        var10002 = class426.field6326[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field8423 - var8 >> 9;
                    int var10 = var4.field8428 - var8 >> 9;
                    int var11 = var4.field8423 + var8 >> 9;
                    int var12 = var4.field8428 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field6114 > class740.field10379[var13][var14]) {
                                class740.field10379[var13][var14] = var4.field6114;
                                class426.field6326[var13][var14] = 1;
                            } else if (class740.field10379[var13][var14] == var4.field6114) {
                                var10002 = class426.field6326[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 3571)
    private final void method1905(int arg0, int arg1) {
        class19.field217 = null;
        class67.field955 = null;
        int var3 = -125 % ((arg0 - 17) / 59);
        class115.field1594.field36 = arg1;
        class115.field1594.field33++;
        class193.field2925 = 0;
        field4258++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 3588)
    public final synchronized void method1002(byte arg0) {
        field4269++;
        if (arg0 <= 21) {
            field4274 = -32;
        }
        if (class466.field6830 != null && class106.field1476 == null && !class179.field2759.field10022) {
            try {
                Class var2 = class466.field6830.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class106.field1476 = (Canvas) var3.get(class466.field6830);
                var3.set(class466.field6830, null);
                if (class106.field1476 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1002((byte) 107);
    }
}
