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
public class client extends class622 {

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Ltl;")
    public static class573 field3735 = new class573();

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Loe;")
    public static class183 field3749 = new class183();

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Ln;")
    public static class17 field3750 = null;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "J")
    public static long field3743;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Ljava/lang/Class;")
    public static Class field3751;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Ljava/lang/Class;")
    public static Class field3752;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
    public static boolean field3753;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[Lf;")
    public static class701[] field3739;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1640(byte arg0) {
        field3732++;
        if (class114.field1485 == 14) {
            return;
        }
        long var2 = class137.method909((byte) 41) / 1000000L - class297.field3997;
        class297.field3997 = class137.method909((byte) 41) / 1000000L;
        boolean var4 = class673.method3830(0);
        if (var4 && class621.field8895 && class600.field8656 != null) {
            class600.field8656.method1484((byte) 67);
        }
        if (class393.method2352(false, class114.field1485)) {
            if (class356.field4752 != 0L && class301.method1787((byte) -49) > class356.field4752) {
                class14.method153(class221.field2851.field4133, class158.method996(3), false, class221.field2851.field4140, (byte) 119);
            } else if (!class68.field1045.method316() && class322.field4241) {
                class302.method1792((byte) -125);
            }
        }
        if (class617.field8851 == null) {
            Container var5;
            if (class646.field9189 != null) {
                var5 = class646.field9189;
            } else if (class627.field8991 == null) {
                var5 = class66.field1028;
            } else {
                var5 = class627.field8991;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class646.field9189 == var5) {
                Insets var8 = class646.field9189.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class226.field2929 != var6 || class417.field5913 != var7 || class700.field9885) {
                if (class68.field1045 == null || class68.field1045.method225()) {
                    class414.method2489(26895);
                } else {
                    class226.field2929 = var6;
                    class417.field5913 = var7;
                }
                class356.field4752 = class301.method1787((byte) 87) + 500L;
                class700.field9885 = false;
            }
        }
        if (class617.field8851 != null && !class190.field2319 && class393.method2352(false, class114.field1485)) {
            class14.method153(-1, class221.field2851.field4148, false, -1, (byte) 89);
        }
        boolean var9 = false;
        if (class288.field3885) {
            class288.field3885 = false;
            var9 = true;
        }
        if (var9) {
            class518.method3067(1);
        }
        if (arg0 >= -112) {
            field3735 = null;
        }
        if (class68.field1045 != null && class68.field1045.method316() || class158.method996(3) != 1) {
            class100.method747(false);
        }
        if (class14.method151(class114.field1485, 0)) {
            class653.method3681(var9, 119);
        } else if (class120.method838(class114.field1485, false)) {
            class219.method1325((byte) -114);
        } else if (class628.method3606((byte) -121, class114.field1485)) {
            class219.method1325((byte) -101);
        } else if (class235.method1428(class114.field1485, (byte) -128)) {
            if (class118.field1523 == 1) {
                if (class15.field291 < class54.field870) {
                    class15.field291 = class54.field870;
                }
                int var10 = (class15.field291 - class54.field870) * 50 / class15.field291;
                class653.method3694(class68.field1045, class657.field9330, true, 0, class417.field5909, class424.field6050.method2561(class370.field4980, 0) + "<br>(" + var10 + "%)");
            } else if (class118.field1523 == 2) {
                if (class4.field23 > class283.field3847) {
                    class283.field3847 = class4.field23;
                }
                int var11 = ((class283.field3847 - class4.field23) * 50 / class283.field3847) + 50;
                class653.method3694(class68.field1045, class657.field9330, true, 0, class417.field5909, class424.field6050.method2561(class370.field4980, 0) + "<br>(" + var11 + "%)");
            } else {
                class653.method3694(class68.field1045, class657.field9330, true, 0, class417.field5909, class424.field6050.method2561(class370.field4980, 0));
            }
        } else if (class114.field1485 == 10) {
            class147.method944(var2, -1);
        } else if (class114.field1485 == 13) {
            class653.method3694(class68.field1045, class657.field9330, false, 0, class417.field5909, class424.field6052.method2561(class370.field4980, 0) + "<br>" + class424.field6053.method2561(class370.field4980, 0));
        }
        if (class149.field1835 == 3) {
            for (int var12 = 0; var12 < class643.field9183; var12++) {
                Rectangle var13 = class631.field9063[var12];
                if (class404.field5699[var12]) {
                    class68.field1045.method1042(var13.x, var13.width, 1, var13.y, -1996553985, var13.height);
                } else if (class325.field4339[var12]) {
                    class68.field1045.method1042(var13.x, var13.width, 1, var13.y, -1996554240, var13.height);
                }
            }
        }
        if (class405.method2438(2)) {
            class611.method3502(class68.field1045, -26942);
        }
        if (class517.field7570.field3401 && class393.method2352(false, class114.field1485) && class149.field1835 == 0 && class158.method996(3) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class643.field9183; var17++) {
                if (class325.field4339[var17]) {
                    class325.field4339[var17] = false;
                    class533.field7787[var16++] = class631.field9063[var17];
                }
            }
            try {
                class68.field1045.method240(class533.field7787, var16);
            } catch (class365 var18) {
            }
        } else if (!class14.method151(class114.field1485, 0)) {
            for (int var14 = 0; var14 < class643.field9183; var14++) {
                class325.field4339[var14] = false;
            }
            try {
                class68.field1045.method293();
            } catch (class365 var19) {
                class544.method3184(23383, var19.getMessage() + " (Recovered) " + this.method1657(true), var19);
                class435.method2608(103, 0);
            }
        }
        if (class221.field2851.field4164 == 0) {
            class151.method974((byte) -102, 15L);
        } else if (class221.field2851.field4164 == 1) {
            class151.method974((byte) -102, 10L);
        } else if (class221.field2851.field4164 == 2) {
            class151.method974((byte) -102, 5L);
        } else if (class221.field2851.field4164 == 3) {
            class151.method974((byte) -102, 2L);
        }
        if (class603.field8699) {
            class124.method862(5);
        }
        if (class221.field2851.field4163 && class114.field1485 == 3 && class127.field1619 != -1) {
            class221.field2851.field4163 = false;
            class221.field2851.method1742(class517.field7570, -1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1641() {
        int var0 = class394.field5564;
        int[] var1 = class82.field1176;
        boolean var2 = class221.field2851.field4137 == 1 && var0 > 200 || class221.field2851.field4137 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class613 var13 = class184.field2252[var1[var3]];
            if (!var13.method3514((byte) -111)) {
                var13.field2591 = -1;
            } else if (var13.field8795) {
                var13.field2591 = -1;
            } else {
                var13.method164(81);
                if (var13.field769 >= 0 && var13.field768 >= 0 && var13.field770 < class473.field6604 && var13.field765 < class205.field2465) {
                    var13.field8828 = var13.field2594 ? var2 : false;
                    if (class206.field2472 == var13) {
                        var13.field2591 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field2597) {
                            var14++;
                        }
                        if (var13.field2674 > class543.field7882) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1284((byte) -124) << 2);
                        if (var13.field8782) {
                            var15 += 512;
                        } else {
                            if (class324.field4336 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field2591 = var15 + 1;
                    }
                } else {
                    var13.field2591 = -1;
                }
            }
        }
        for (int var4 = 0; var4 < class99.field1332; var4++) {
            class557 var10 = ((class633) class522.field7662.method3678((long) class600.field8658[var4], -124)).field9097;
            if (var10.method3258((byte) -125) && var10.field8052.method1883(true, class410.field5804)) {
                var10.method164(84);
                if (var10.field769 >= 0 && var10.field768 >= 0 && var10.field770 < class473.field6604 && var10.field765 < class205.field2465) {
                    int var11 = 0;
                    if (!var10.field2597) {
                        var11++;
                    }
                    if (var10.field2674 > class543.field7882) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1284((byte) -124) << 2);
                    if (class324.field4336 == 0) {
                        if (var10.field8052.field4303) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class324.field4336 == 1) {
                        if (var10.field8052.field4303) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field8052.field4287) {
                        var12 += 1024;
                    } else if (!var10.field8052.field4278) {
                        var12 += 256;
                    }
                    var10.field2591 = var12 + 1;
                } else {
                    var10.field2591 = -1;
                }
            } else {
                var10.field2591 = -1;
            }
        }
        for (int var5 = 0; var5 < class631.field9068.length; var5++) {
            class341 var6 = class631.field9068[var5];
            if (var6 != null) {
                if (var6.field4508 == 1) {
                    class633 var7 = (class633) class522.field7662.method3678((long) var6.field4513, -122);
                    if (var7 != null) {
                        class557 var8 = var7.field9097;
                        if (var8.field2591 >= 0) {
                            var8.field2591 += 2048;
                        }
                    }
                } else if (var6.field4508 == 10) {
                    class613 var9 = class184.field2252[var6.field4513];
                    if (var9 != null && class206.field2472 != var9 && var9.field2591 >= 0) {
                        var9.field2591 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1642(boolean arg0) {
        field3741++;
        method1655((byte) 119);
        class100.method746((byte) 74);
        class14.method155(2204);
        class233.method1419(-1);
        class424.method2560(!arg0);
        class280.method1688(0);
        class442.method2623((byte) 91);
        class411.method2477((byte) 100);
        class119.method832(11337);
        class405.method2450(!arg0);
        class164.method1032(3405);
        class652.method3677(114);
        class622.method3563(-8079);
        class342.method1964(1120);
        class264.method1605((byte) 97);
        class90.method706((byte) -122);
        class394.method2383(0);
        class165.method1043((byte) -65);
        class295.method1758((byte) 123);
        class341.method1962((byte) 126);
        class544.method3189(true);
        class429.method2573((byte) -95);
        class149.method956(0);
        class689.method3895(109);
        class454.method2690(48);
        class214.method1307(-2);
        class668.method3791(51);
        class455.method2697(-128);
        class171.method1077((byte) -6);
        class472.method2774(73);
        class470.method2759(-23306);
        class331.method1919((byte) 101);
        class247.method1503((byte) -124);
        class376.method2188((byte) -110);
        class594.method3441(4253);
        class230.method1393((byte) -100);
        class113.method812(33);
        class670.method3820(-88);
        class53.method563((byte) 80);
        class338.method1948((byte) 123);
        class16.method187(60);
        class420.method2535(122);
        class299.method1776((byte) -126);
        class469.method2750((byte) -36);
        class417.method2508(arg0);
        class12.method138(-1);
        class310.method1820(-128);
        class71.method634(true);
        class452.method2677((byte) 114);
        class86.method688(-50);
        class425.method2562((byte) 118);
        class321.method1868((byte) -108);
        class685.method3882(-25598);
        class656.method3712((byte) 26);
        class5.method31(-129);
        class690.method3901((byte) -82);
        class8.method49((byte) 61);
        class302.method1795(0);
        class114.method818(-54);
        class79.method662((byte) 90);
        class504.method2920(0);
        class363.method2073((byte) 83);
        class17.method197(-1);
        class621.method3549(123);
        class599.method3461((byte) -72);
        class70.method628(-1);
        class432.method2593(124);
        class389.method2243(126);
        class213.method1296(339425321);
        class433.method2598(-9893);
        class82.method674(false);
        class32.method403(-116);
        class4.method22(!arg0);
        class557.method3254(-30871);
        class21.method341((byte) -72);
        class158.method993(-1);
        class155.method986(-32529);
        class529.method3114(true);
        class426.method2566(50);
        class195.method1195(-114);
        class589.method3421(27150);
        class324.method1890((byte) -92);
        class404.method2432(!arg0);
        class337.method1946(false);
        class198.method1212((byte) -74);
        class56.method584(-17);
        class554.method3245((byte) -68);
        class139.method920(105);
        class447.method2639((byte) 122);
        class533.method3132(true);
        class569.method3335((byte) -37);
        class612.method3505(50);
        class153.method981(-128);
        class327.method1905(-105);
        class618.method3540(true);
        class275.method1667(0);
        class634.method3624(true);
        class232.method1404((byte) 119);
        class173.method1092(0);
        class37.method433(1);
        class323.method1879((byte) 80);
        class238.method1455((byte) -17);
        class419.method2523(0);
        class191.method1179(-128);
        class365.method2115((byte) -115);
        class616.method3529(-79);
        class493.method2867(false);
        class50.method548(-16073);
        class436.method2609(1);
        class530.method3116(16708);
        class1.method2(10);
        class20.method337(122);
        class364.method2089((byte) -87);
        class538.method3161(21744);
        class68.method622(-80);
        class269.method1625(5);
        class308.method1815(-513);
        class236.method1431(114);
        class499.method2906(110);
        class697.method3912(true);
        class293.method1739(-51);
        class465.method2729((byte) 60);
        class502.method2914((byte) 77);
        class10.method58((byte) -12);
        class674.method3835(-10258);
        class285.method1702(28549);
        class675.method3837(-10926);
        class62.method608(1928);
        class550.method3217();
        class562.method3292(-2007);
        class287.method1712(328);
        class409.method2471(-3727);
        class137.method910(arg0);
        class311.method1825(65528);
        class7.method41(-316598032);
        class202.method1231((byte) -118);
        class564.method3299(arg0);
        class172.method1081(2);
        class516.method3059((byte) -115);
        class684.method3868();
        class573.method3351((byte) 79);
        class176.method1104(0);
        class231.method1400((byte) 74);
        class488.method2844(732);
        class441.method2621(true);
        class545.method3201();
        class300.method1784(false);
        class489.method2850((byte) 115);
        class9.method55(-86);
        class640.method3643();
        class289.method1720((byte) 120);
        class527.method3105((byte) -123);
        class333.method1928(750068456);
        class67.method621(-39);
        class189.method1170(-22253);
        class143.method934(-30);
        class115.method823((byte) -113);
        class286.method1708(2);
        class475.method2789(false);
        class524.method3100(false);
        class611.method3503(124);
        class242.method1476((byte) 83);
        class182.method1127((byte) 15);
        class54.method569(-111);
        class698.method3914(-27351);
        class259.method1578();
        class271.method1629(arg0);
        class604.method3479(16538);
        class190.method1173(-1);
        class517.method3061(-10115);
        class669.method3814();
        class585.method3394(true);
        class485.method2832(-13704);
        class608.method3486((byte) -36);
        class596.method3447(0);
        class42.method463(false);
        class122.method853(255);
        class246.method1495((byte) -56);
        class58.method587(-31720);
        class476.method2797();
        class309.method1819(128);
        class19.method331((byte) 119);
        class297.method1765((byte) 92);
        class128.method878(-110);
        class671.method3823((byte) -66);
        class617.method3531(112);
        class490.method2854((byte) -27);
        class184.method1143(0);
        class590.method3428((byte) -78);
        class251.method1536(102);
        class33.method405(15);
        class216.method1318(-181478686);
        class705.method3951(1);
        class146.method941(337336776);
        class552.method3239(-51);
        class336.method1937(false);
        class163.method1028(17503);
        class6.method40(-25307);
        class208.method1248(113);
        class109.method794((byte) -58);
        class385.method2207(-26076);
        class553.method3244(true);
        class15.method160(-64);
        class120.method834(2);
        class479.method2810(-13061);
        class507.method3017(arg0);
        class580.method3382(-26);
        class672.method3827(34);
        class406.method2463(22606);
        class28.method382(-3);
        class523.method3097((byte) -126);
        class170.method1066(-120);
        class512.method3032(-16445);
        class466.method2734(30178);
        class440.method2620(true);
        class654.method3704(32075);
        class177.method1109((byte) -43);
        class423.method2556((byte) 126);
        class221.method1336(-16715);
        class290.method1727(-21);
        class277.method1676(false);
        class39.method446(0);
        class356.method2009(22072);
        class91.method707(-40);
        class468.method2747((byte) 107);
        class435.method2607(255);
        class646.method3659(0);
        class116.method826((byte) 18);
        class467.method2740((byte) 81);
        class40.method453((byte) 63);
        class314.method1839((byte) -8);
        class505.method2927(103);
        class568.method3327(3);
        class344.method1973(19823);
        class65.method616(64);
        class408.method2466(-1);
        class437.method2614(true);
        class635.method3631((byte) -100);
        class692.method3905(6741);
        class326.method1898((byte) 108);
        class463.method2727(17474);
        class312.method1833(104);
        class398.method2404();
        class630.method3609(124);
        class196.method1199(4);
        class27.method381(76);
        class136.method907(0);
        class318.method1854(0);
        class263.method1602(true);
        class687.method3886(-114);
        class631.method3614(-103);
        class421.method2539(2);
        class473.method2785(0);
        class395.method2387(false);
        class374.method2178((byte) -125);
        class534.method3136(500);
        class570.method3341(true);
        class127.method873(-11623);
        class700.method3922(2048);
        class371.method2162();
        class201.method1226(false);
        class491.method2861();
        class107.method781();
        class354.method2001(0);
        class124.method861(5);
        class313.method1834();
        class48.method543(!arg0);
        class386.method2214(-90);
        class322.method1870((byte) -38);
        class474.method2787(100);
        class24.method363(9179409);
        class582.method3388((byte) 29);
        class222.method1352((byte) -91);
        class551.method3238((byte) -128);
        class679.method3854((byte) 29);
        class603.method3475(arg0);
        class514.method3049(8);
        class101.method752((byte) -55);
        class704.method3944((byte) 32);
        class219.method1328((byte) 79);
        class391.method2287((byte) -121);
        class193.method1186((byte) -121);
        class121.method850();
        class519.method3072(true);
        class412.method2483(63);
        class501.method2911((byte) 2);
        class430.method2585(-48);
        class355.method2005(-18219);
        class29.method386(-118);
        class662.method3744(-152331794);
        class497.method2892(4095);
        class166.method1055(false);
        class256.method1558(-30234);
        class188.method1166((byte) 6);
        class566.method3318(0);
        class77.method650(-9751);
        class361.method2060((byte) 89);
        class57.method586(1245);
        class141.method928(4080);
        class320.method1861(-96);
        class215.method1315((byte) 59);
        class228.method1384(109);
        class506.method3014(false);
        class540.method3168(125);
        class123.method857(-102);
        class160.method1018(false);
        class496.method2891(-106);
        class677.method3846((byte) 111);
        class510.method3024((byte) 62);
        class592.method3437(-14117);
        class239.method1468(-3181);
        class416.method2499(-120);
        class197.method1201(9984);
        class298.method1770(-7650);
        class340.method1958((byte) -127);
        class577.method3375(5126);
        class399.method2415((byte) -34);
        class226.method1379((byte) 100);
        class187.method1162(7585);
        class397.method2398((byte) -124);
        class279.method1681(127);
        class276.method1675((byte) 87);
        class653.method3699(2);
        class72.method640(true);
        class49.method546(-13022);
        class265.method1606(-1);
        class220.method1334(116);
        class262.method1596(1);
        class74.method646((byte) 10);
        class366.method2119(-27715);
        class607.method3483(76);
        class666.method3770(-43);
        class75.method647(1);
        class531.method3126((byte) -80);
        class632.method3617(0);
        class349.method1991(1171);
        class665.method3756(2);
        class138.method913();
        class73.method644(0);
        class574.method3361(123);
        class325.method1893((byte) 41);
        class418.method2511(17817);
        class478.method2806(-772285076);
        class457.method2713(0);
        class224.method1357(-124);
        class500.method2908(64);
        class380.method2200((byte) -99);
        class227.method1381(false);
        class150.method972(123);
        class487.method2841(108);
        class620.method3547((byte) -114);
        class192.method1181(true);
        class680.method3860(-128);
        class651.method3665(0);
        class89.method701(arg0);
        class563.method3295((byte) 12);
        class129.method880((byte) 102);
        class209.method1253(0);
        class445.method2632(111);
        class434.method2601(0);
        class23.method356(0);
        class258.method1571((byte) 113);
        class350.method1992(81);
        class78.method656(90);
        class102.method756(0);
        class643.method3655(431246284);
        class167.method1056((byte) -10);
        class328.method1910(-123);
        class335.method1935(124);
        class99.method745(false);
        class179.method1117();
        class11.method113();
        class676.method3839((byte) -104);
        class175.method1101(8);
        class148.method946((byte) -95);
        class561.method3275(124);
        class373.method2174(20);
        class657.method3721((byte) -117);
        class267.method1620(59);
        class257.method1568(arg0);
        class378.method2195(true);
        class268.method1622((byte) -39);
        class261.method1588((byte) -117);
        class702.method3939(-15455);
        class628.method3608(true);
        class351.method1994((byte) -87);
        class25.method368((byte) 127);
        class357.method2014(0);
        class678.method3851(16777215);
        class681.method3862(76);
        class588.method3407(0);
        class108.method783(-29727);
        class204.method1236(73);
        class641.method3648(64);
        class655.method3707(8448);
        class693.method3907(109);
        class152.method978(124);
        class81.method671(arg0);
        class273.method1634(-110);
        class602.method3470(5890);
        class443.method2625((byte) 72);
        class525.method3102((byte) 64);
        class498.method2901(0);
        class396.method2394(true);
        class159.method1003(0);
        class205.method1238((byte) -54);
        class97.method737(40);
        class627.method3603((byte) 94);
        class642.method3651(-1);
        class52.method558(false);
        class66.method620((byte) -95);
        class368.method2125((byte) 118);
        class332.method1925(0);
        class112.method803(-1);
        class703.method3940(false);
        class206.method1240(1);
        class13.method145(-74);
        class558.method3264(-1);
        class600.method3465(-25271);
        class186.method1156(0);
        class26.method376(123);
        class400.method2418((byte) 89);
        class329.method1912(0);
        class353.method1998((byte) 89);
        class683.method3865(0);
        class105.method770((byte) -67);
        class522.method3095(25130);
        class181.method1126(127);
        class682.method3864(3387);
        class427.method2570((byte) 126);
        class659.method3733((byte) 92);
        class362.method2064(110);
        class518.method3068(-1);
        class548.method3211((byte) 72);
        class407.method2465(0);
        class415.method2492(false);
        class410.method2474(0);
        class438.method2616((byte) -4);
        class372.method2168((byte) 89);
        class359.method2017(500);
        class571.method3344(false);
        class660.method3741((byte) 109);
        class125.method863((byte) 40);
        class234.method1427((byte) -59);
        class255.method1556(99);
        class549.method3213((byte) -68);
        class384.method2205((byte) 83);
        class456.method2710(-81);
        class207.method1244(-28561);
        class521.method3092(-1860);
        class591.method3429((byte) 110);
        class601.method3468(!arg0);
        class471.method2764((byte) -111);
        class431.method2591((byte) -125);
        class578.method3376(-36);
        class306.method1813(true);
        class156.method989(true);
        class377.method2193(255);
        class511.method3029((byte) -82);
        class330.method1915(-1);
        class260.method1586(0);
        class84.method676(true);
        class288.method1713(47);
        class147.method943(119);
        class281.method1689(125);
        class88.method699(41);
        class422.method2549(28155);
        class586.method3402(0);
        class30.method390(0);
        class151.method975(1);
        class661.method3742(5891);
        class664.method3753(7316);
        class180.method1121(128);
        class69.method625((byte) 97);
        class34.method412(true);
        class638.method3639((byte) -22);
        class673.method3831((byte) -122);
        class346.method1982(403053836);
        class637.method3635(false);
        class36.method416(-97);
        if (class622.field8940) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method1643(boolean arg0) {
        field3737++;
        if (arg0) {
            method1655((byte) -13);
        }
        if (class375.field5039 != 2) {
            this.method1653(-11);
            return;
        }
        try {
            this.method1653(-11);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class544.method3184(23383, var5.getMessage() + " (Recovered) " + this.method1657(!arg0), var5);
            class435.method2608(-108, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1644() {
        for (int var0 = 0; var0 < class473.field6604; var0++) {
            int[] var1 = class310.field4099[var0];
            for (int var2 = 0; var2 < class205.field2465; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1645(int arg0) {
        field3731++;
        if (class394.field5561 < class33.field673.field1856) {
            class281.field3813.method1944(arg0 + 1996553985);
            class89.field1244 = (class33.field673.field1856 - 1) * 5 * 50;
            if (class89.field1244 > 3000) {
                class89.field1244 = 3000;
            }
            if (class33.field673.field1856 >= 2 && class33.field673.field1853 == 6) {
                this.method3557((byte) -114, "js5connect_outofdate");
                class114.field1485 = 14;
                return;
            }
            if (class33.field673.field1856 >= 4 && class33.field673.field1853 == -1) {
                this.method3557((byte) -101, "js5crc");
                class114.field1485 = 14;
                return;
            }
            if (class33.field673.field1856 >= 4 && class14.method151(class114.field1485, arg0 ^ 0x88FF00FF)) {
                if (class33.field673.field1853 == 7 || class33.field673.field1853 == 9) {
                    this.method3557((byte) -80, "js5connect_full");
                } else if (class33.field673.field1853 <= 0) {
                    this.method3557((byte) -110, "js5io");
                } else if (class660.field9378 == null) {
                    this.method3557((byte) -103, "js5connect");
                } else {
                    this.method3557((byte) -80, "js5proxy_" + class660.field9378.trim());
                }
                class114.field1485 = 14;
                return;
            }
        }
        class394.field5561 = class33.field673.field1856;
        if (class89.field1244 > 0) {
            class89.field1244--;
        } else if (arg0 == -1996553985) {
            try {
                if (class197.field2384 == 0) {
                    class527.field7716 = class281.field3813.method1940(arg0 + 1996537892, class517.field7570);
                    class197.field2384++;
                }
                if (class197.field2384 == 1) {
                    if (class527.field7716.field6693 == 2) {
                        if (class527.field7716.field6695 != null) {
                            class660.field9378 = (String) class527.field7716.field6695;
                        }
                        this.method1664(1000, 0);
                        return;
                    }
                    if (class527.field7716.field6693 == 1) {
                        class197.field2384++;
                    }
                }
                if (class197.field2384 == 2) {
                    class195.field2361 = new class429((Socket) class527.field7716.field6695, class517.field7570);
                    class389 var2 = new class389(5);
                    var2.method2281((byte) 58, class238.field3276.field7714);
                    var2.method2233((byte) 119, 623);
                    class195.field2361.method2576(var2.field5205, (byte) -100, 0, 5);
                    class197.field2384++;
                    class416.field5875 = class301.method1787((byte) -106);
                }
                if (class197.field2384 == 3) {
                    if (class14.method151(class114.field1485, 0) || class195.field2361.method2582(false) > 0) {
                        int var3 = class195.field2361.method2577(89);
                        if (var3 != 0) {
                            this.method1664(var3, arg0 ^ 0x88FF00FF);
                            return;
                        }
                        class197.field2384++;
                    } else if (class301.method1787((byte) -111) - class416.field5875 > 30000L) {
                        this.method1664(1001, 0);
                        return;
                    }
                }
                if (class197.field2384 == 4) {
                    boolean var4 = class14.method151(class114.field1485, 0) || class501.method2912(-4, class114.field1485) || class657.method3723(class114.field1485, -10);
                    class411[] var5 = class411.method2478((byte) 125);
                    class389 var6 = new class389(var5.length * 4);
                    class195.field2361.method2581((byte) -88, 0, var6.field5205, var6.field5205.length);
                    for (int var7 = 0; var7 < var5.length; var7++) {
                        var5[var7].method2476(var6.method2255(255), true);
                    }
                    class33.field673.method963((byte) 97, !var4, class195.field2361);
                    class527.field7716 = null;
                    class197.field2384 = 0;
                    class195.field2361 = null;
                }
            } catch (IOException var8) {
                this.method1664(1002, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1646(byte arg0) {
        if (class114.field1485 == 7 && class690.field9842 == 0) {
            if (class242.field3323 > 1) {
                class345.field4534 = class59.field926;
                class242.field3323--;
            }
            if (!class361.field4805) {
                class47.method538(true);
            }
            for (int var2 = 0; var2 < 100 && class48.method539(true); var2++) {
            }
        }
        field3736++;
        class456.field6422++;
        class657.method3717(null, (byte) -119, -1, -1);
        class455.method2703(null, -1, -1, -45);
        class399.method2416(0);
        class59.field926++;
        for (int var3 = 0; var3 < class59.field928; var3++) {
            class557 var4 = class671.field9657[var3].field9097;
            if (var4 != null) {
                byte var5 = var4.field8052.field4314;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1284((byte) -124);
                    if ((var5 & 0x2) != 0 && var4.field2683 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field2689[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class473.field6604 - (var6 + 1))) {
                                var9 = class473.field6604 - var6 - 1;
                            }
                            int var10 = var4.field2686[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class205.field2465 - var6 - 1)) {
                                var10 = class205.field2465 - var6 - 1;
                            }
                            int var11 = class564.method3297(true, (byte) -85, var9, var10, var6, class349.field4642[var4.field532], class190.field2322, var4.field2686[0], var6, class566.field8283, var4.field2689[0], 0, -1, 0, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field2689[var12] = class190.field2322[var11 - var12 - 1];
                                    var4.field2686[var12] = class566.field8283[var11 - (var12 + 1)];
                                    var4.field2679[var12] = 1;
                                }
                                var4.field2683 = var11;
                            }
                        }
                    }
                    class521.method3090(true, var4, -13412);
                    int var13 = class445.method2630(-97, var4);
                    class4.method18(var4, 115);
                    class637.method3634(var4, class577.field8434, var13, class674.field9675, (byte) -29);
                    class531.method3125((byte) -41, class577.field8434, var4);
                    class7.method45(122, var4);
                }
            }
        }
        if (class690.field9842 == 0 && class382.field5103 == 0) {
            if (class586.field8507 == 2) {
                class324.method1888(-111);
            } else {
                class178.method1111(2);
            }
            if ((class346.field4550 >> 9) < 14 || (class346.field4550 >> 9) >= (class473.field6604 - 14) || class627.field8995 >> 9 < 14 || (class627.field8995 >> 9) >= (class205.field2465 - 14)) {
                class662.method3746((byte) 81);
            }
        }
        while (true) {
            class143 var14;
            class17 var15;
            class17 var16;
            do {
                var14 = (class143) class195.field2363.method1137(-1);
                if (var14 == null) {
                    while (true) {
                        class143 var17;
                        class17 var18;
                        class17 var19;
                        do {
                            var17 = (class143) class281.field3812.method1137(-1);
                            if (var17 == null) {
                                while (true) {
                                    class143 var20;
                                    class17 var21;
                                    class17 var22;
                                    do {
                                        var20 = (class143) class397.field5620.method1137(-1);
                                        if (var20 == null) {
                                            if (class386.field5135 != null) {
                                                class377.method2192(2);
                                            }
                                            if (class543.field7882 % 1500 == 0) {
                                                class485.method2836(-28247);
                                            }
                                            if (class114.field1485 == 7 && class690.field9842 == 0) {
                                                class36.method420(-115);
                                            }
                                            class55.method579(94);
                                            if (class62.field999 && (class301.method1787((byte) -61) - 60000L) > class1.field5) {
                                                class651.method3664((byte) -102);
                                            }
                                            for (class484 var23 = (class484) class1.field4.method2070((byte) 41); var23 != null; var23 = (class484) class1.field4.method2068(-2001)) {
                                                if (((long) var23.field6787) < (class301.method1787((byte) 80) / 1000L - 5L)) {
                                                    if (var23.field6782 > 0) {
                                                        class301.method1786("", var23.field6786 + class424.field6057.method2561(class370.field4980, 0), "", "", -1, 5, 0);
                                                    }
                                                    if (var23.field6782 == 0) {
                                                        class301.method1786("", var23.field6786 + class424.field6058.method2561(class370.field4980, 0), "", "", -1, 5, 0);
                                                    }
                                                    var23.method2564((byte) 2);
                                                }
                                            }
                                            if (class114.field1485 == 7 && class690.field9842 == 0) {
                                                if (class489.field6835 == null) {
                                                    class168.method1061((byte) 78, false);
                                                    return;
                                                }
                                                class634.field9102++;
                                                if (class634.field9102 > 50) {
                                                    class611.field8765++;
                                                    class543 var24 = class299.method1780(class84.field1196, class90.field1262, 112);
                                                    class511.method3028(7482, var24);
                                                }
                                                try {
                                                    class238.method1462(78);
                                                } catch (IOException var25) {
                                                    class168.method1061((byte) 118, false);
                                                }
                                            }
                                            if (arg0 < 114) {
                                                method1644();
                                                return;
                                            }
                                            return;
                                        }
                                        var21 = var20.field1789;
                                        if (var21.field485 < 0) {
                                            break;
                                        }
                                        var22 = class400.method2420((byte) -121, var21.field469);
                                    } while (var22 == null || var22.field429 == null || var22.field429.length <= var21.field485 || var22.field429[var21.field485] != var21);
                                    class545.method3204(var20);
                                }
                            }
                            var18 = var17.field1789;
                            if (var18.field485 < 0) {
                                break;
                            }
                            var19 = class400.method2420((byte) -104, var18.field469);
                        } while (var19 == null || var19.field429 == null || var19.field429.length <= var18.field485 || var19.field429[var18.field485] != var18);
                        class545.method3204(var17);
                    }
                }
                var15 = var14.field1789;
                if (var15.field485 < 0) {
                    break;
                }
                var16 = class400.method2420((byte) -111, var15.field469);
            } while (var16 == null || var16.field429 == null || var16.field429.length <= var15.field485 || var16.field429[var15.field485] != var15);
            class545.method3204(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1647() {
        class556.field8041 = 0;
        for (int var0 = 0; var0 < class99.field1332; var0++) {
            class557 var1 = ((class633) class522.field7662.method3678((long) class600.field8658[var0], -120)).field9097;
            if (var1.field2597 && var1.method1291(126) != -1) {
                int var2 = (var1.method1284((byte) -124) - 1) * 256 + 252;
                int var3 = var1.field530 - var2 >> 9;
                int var4 = var1.field531 - var2 >> 9;
                class213 var5 = class185.method1154(var1.field532, var4, var3, 3161);
                if (var5 != null) {
                    int var6 = var5.field2664;
                    if (var5 instanceof class557) {
                        var6 += 2048;
                    }
                    if (var5.field2582 == 0 && var5.method1291(113) != -1) {
                        class359.field4786[class556.field8041] = var6;
                        class23.field569[class556.field8041] = var6;
                        class556.field8041++;
                        var5.field2582++;
                    }
                    class359.field4786[class556.field8041] = var6;
                    class23.field569[class556.field8041] = var1.field2664 + 2048;
                    class556.field8041++;
                    var5.field2582++;
                }
            }
        }
        class14.method156(class359.field4786, class23.field569, 0, 115, class556.field8041 - 1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)Z")
    public static final boolean method1648(int arg0, byte arg1, int arg2, int arg3) {
        field3744++;
        if (arg1 >= -30) {
            method1644();
        }
        class691 var4 = (class691) class511.method3030(arg3, arg2, arg0);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class42.method461(var4, -72);
        }
        class691 var6 = (class691) class564.method3296(arg3, arg2, arg0, field3751 == null ? (field3751 = method1665("pn")) : field3751);
        if (var6 != null) {
            var5 &= class42.method461(var6, -103);
        }
        class691 var7 = (class691) class403.method2429(arg3, arg2, arg0);
        if (var7 != null) {
            var5 &= class42.method461(var7, -71);
        }
        return var5;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1649(int arg0) {
        int var1 = class394.field5564;
        int[] var2 = class82.field1176;
        int var3 = class689.field9830 ? var1 : class99.field1332 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class213 var5;
            if (var4 < var1) {
                var5 = class184.field2252[var2[var4]];
            } else {
                var5 = ((class633) class522.field7662.method3678((long) class600.field8658[var4 - var1], -120)).field9097;
            }
            if (var5.field532 == arg0) {
                var5.field2582 = 0;
                if (var5.field2591 < 0) {
                    var5.field2597 = false;
                } else {
                    int var6 = var5.method1284((byte) -124);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field530 & 0x1FF) != 0 || (var5.field531 & 0x1FF) != 0) {
                            var5.field2597 = false;
                            continue;
                        }
                    } else if ((var5.field530 & 0x1FF) != 256 || (var5.field531 & 0x1FF) != 256) {
                        var5.field2597 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field530 >> 9;
                        int var8 = var5.field531 >> 9;
                        if (class310.field4099[var7][var8] != var5.field2591) {
                            var5.field2597 = true;
                            continue;
                        }
                        if (class40.field748[var7][var8] > 1) {
                            var10002 = class40.field748[var7][var8]--;
                            var5.field2597 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field530 - var9 >> 9;
                        int var11 = var5.field531 - var9 >> 9;
                        int var12 = var5.field530 + var9 >> 9;
                        int var13 = var5.field531 + var9 >> 9;
                        if (!class488.method2845(var5.field2591, var11, var10, var12, (byte) -110, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class310.field4099[var14][var15] == var5.field2591) {
                                        var10002 = class40.field748[var14][var15]--;
                                    }
                                }
                            }
                            var5.field2597 = true;
                            continue;
                        }
                    }
                    var5.field2597 = false;
                    var5.field527 = class589.method3416(var5.field530, -102, var5.field532, var5.field531);
                    class667.method3777(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1650(int arg0) {
        if (arg0 != 256) {
            method1659(null);
        }
        field3746++;
        boolean var2 = class33.field673.method970(arg0 - 256);
        if (!var2) {
            this.method1645(-1996553985);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1651() {
        int var0 = class394.field5564;
        int[] var1 = class82.field1176;
        int var2 = class689.field9830 ? var0 : class99.field1332 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class213 var4;
            if (var3 < var0) {
                var4 = class184.field2252[var1[var3]];
            } else {
                var4 = ((class633) class522.field7662.method3678((long) class600.field8658[var3 - var0], -128)).field9097;
            }
            if (var4.field2591 >= 0) {
                int var5 = var4.method1284((byte) -124);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field530 & 0x1FF) == 0 && (var4.field531 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field530 & 0x1FF) == 256 && (var4.field531 & 0x1FF) == 256) {
                    continue;
                }
                var4.field527 = class589.method3416(var4.field530, -20, var4.field532, var4.field531);
                class667.method3777(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1652(int arg0) {
        int var1 = class394.field5564;
        int[] var2 = class82.field1176;
        for (int var3 = 0; var3 < class99.field1332 + var1; var3++) {
            class213 var4;
            if (var3 < var1) {
                var4 = class184.field2252[var2[var3]];
            } else {
                var4 = ((class633) class522.field7662.method3678((long) class600.field8658[var3 - var1], -122)).field9097;
            }
            if (var4.field532 == arg0 && var4.field2591 >= 0) {
                int var5 = var4.method1284((byte) -124);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field530 & 0x1FF) != 0 || (var4.field531 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field530 & 0x1FF) != 256 || (var4.field531 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field530 >> 9;
                    int var7 = var4.field531 >> 9;
                    if (var4.field2591 > class310.field4099[var6][var7]) {
                        class310.field4099[var6][var7] = var4.field2591;
                        class40.field748[var6][var7] = 1;
                    } else if (class310.field4099[var6][var7] == var4.field2591) {
                        var10002 = class40.field748[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field530 - var8 >> 9;
                    int var10 = var4.field531 - var8 >> 9;
                    int var11 = var4.field530 + var8 >> 9;
                    int var12 = var4.field531 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field2591 > class310.field4099[var13][var14]) {
                                class310.field4099[var13][var14] = var4.field2591;
                                class40.field748[var13][var14] = 1;
                            } else if (class310.field4099[var13][var14] == var4.field2591) {
                                var10002 = class40.field748[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1653(int arg0) {
        field3734++;
        if (class114.field1485 == 14) {
            return;
        }
        class543.field7882++;
        if ((class543.field7882 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class434.field6233 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class351.field4690.setSeed((long) class434.field6233);
        }
        if ((class543.field7882 % 50) == 0) {
            class432.field6203 = class151.field1873;
            class151.field1873 = 0;
            class164.field2004 = class263.field3626;
            class263.field3626 = 0;
        }
        this.method1650(arg0 ^ 0xFFFFFEF5);
        if (class394.field5565 != null) {
            class394.field5565.method2689((byte) -54);
        }
        class190.method1172(true);
        class376.field5043.method1686(-1);
        class478.field6713.method1340(false);
        if (class68.field1045 != null) {
            class68.field1045.method263((int) class301.method1787((byte) -112));
        }
        class440.method2619(21649);
        class171.field2089 = 0;
        class660.field9377 = 0;
        for (class446 var3 = class376.field5043.method1683(true); var3 != null; var3 = class376.field5043.method1683(true)) {
            int var6 = var3.method2634(-31752);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2636((byte) -111);
                if (class342.method1972(1) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class405.method2438(2)) {
                        class633.method3619(24825);
                    } else {
                        class191.method1177(arg0 + 11);
                    }
                } else if (class660.field9377 < 128) {
                    class159.field1934[class660.field9377] = var3;
                    class660.field9377++;
                }
            } else if (var6 == 0 && class171.field2089 < 75) {
                class391.field5240[class171.field2089] = var3;
                class171.field2089++;
            }
        }
        class131.field1668 = 0;
        for (class471 var4 = class478.field6713.method1350(-92); var4 != null; var4 = class478.field6713.method1350(27)) {
            int var5 = var4.method1730(true);
            if (var5 == -1) {
                class239.field3316.method1129(var4, 262144);
            } else if (var5 == 6) {
                class131.field1668 += var4.method1732((byte) 88);
            } else if (class385.method2208((byte) 72, var5)) {
                class404.field5707.method1129(var4, 262144);
                if (class404.field5707.method1142(-22382) > 10) {
                    class404.field5707.method1137(-1);
                }
            }
        }
        if (class405.method2438(2)) {
            class133.method890((byte) 89);
        }
        if (class14.method151(class114.field1485, arg0 ^ arg0)) {
            class295.method1760(116);
            class467.method2736(115);
        } else if (class235.method1428(class114.field1485, (byte) -119)) {
            class120.method840(0);
        }
        if (class501.method2912(arg0 ^ 0x9, class114.field1485) && !class235.method1428(class114.field1485, (byte) -120)) {
            this.method1646((byte) 123);
            class621.method3552(arg0 - 107);
            class566.method3320((byte) -83);
        } else if (class657.method3723(class114.field1485, arg0 + 1) && !class235.method1428(class114.field1485, (byte) -125)) {
            this.method1646((byte) 116);
            class566.method3320((byte) 124);
        } else if (class114.field1485 == 12) {
            class566.method3320((byte) 127);
        } else if (class506.method2995((byte) 99, class114.field1485) && !class235.method1428(class114.field1485, (byte) -123)) {
            class397.method2400(13464);
        } else if (class114.field1485 == 13) {
            class566.method3320((byte) -100);
            if (class48.field816 != -3 && class48.field816 != 2 && class48.field816 != 15) {
                class168.method1061((byte) 66, false);
            }
        }
        class108.method787(class68.field1045, (byte) 5);
        class404.field5707.method1137(-1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ln;IIIIIIIII)V")
    public static final void method1654(class17[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class17 var11 = arg0[var10];
            if (var11 != null && var11.field469 == arg1) {
                int var12 = var11.field460 + arg6;
                int var13 = var11.field351 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field379 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field414 + var12;
                    int var19 = var11.field402 + var13;
                    if (var11.field379 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field379 == 0 || var11.field425 || method1659(var11).field1929 != 0 || class441.field6296 == var11 || class55.field875 == var11.field346 || class664.field9402 == var11.field346) {
                    if (!method1660(var11)) {
                        if (class386.field5135 == var11 && class696.method3910(class386.field5135, true) != null) {
                            class161.field1984 = true;
                            class401.field5668 = var12;
                            class69.field1057 = var13;
                        }
                        if (var11.field328 || var14 < var16 && var15 < var17) {
                            if (var11.field482 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class143 var20 = (class143) class397.field5620.method1132((byte) -127); var20 != null; var20 = (class143) class397.field5620.method1134(8446)) {
                                    if (var20.field1781) {
                                        var20.method3045(true);
                                        var20.field1789.field452 = false;
                                    }
                                }
                                if (class594.field8581 == 0) {
                                    class386.field5135 = null;
                                    class441.field6296 = null;
                                }
                                class160.field1948 = 0;
                                class496.field6908 = false;
                                class295.field3977 = false;
                                if (!class361.field4805) {
                                    class47.method538(true);
                                }
                            }
                            boolean var21;
                            if (class478.field6713.method1349(38) >= var14 && class478.field6713.method1338(1) >= var15 && class478.field6713.method1349(-126) < var16 && class478.field6713.method1338(1) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class99.field1336 && var21) {
                                if (var11.field430 >= 0) {
                                    class10.field99 = var11.field430;
                                } else if (var11.field482) {
                                    class10.field99 = -1;
                                }
                            }
                            if (!class361.field4805 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class634.method3621(arg9 - var13, var11, arg8 - var12, true);
                            }
                            boolean var22 = false;
                            if (class478.field6713.method1347((byte) -62) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class471 var24 = (class471) class404.field5707.method1132((byte) -84);
                            if (var24 != null && var24.method1730(true) == 0 && var24.method1729(false) >= var14 && var24.method1733((byte) 117) >= var15 && var24.method1729(false) < var16 && var24.method1733((byte) 93) < var17) {
                                var23 = true;
                            }
                            if (var11.field347 != null && !class405.method2438(2)) {
                                for (int var25 = 0; var25 < var11.field347.length; var25++) {
                                    if (class376.field5043.method1687(-7653, var11.field347[var25])) {
                                        if (var11.field345 == null || class543.field7882 >= var11.field345[var25]) {
                                            byte var26 = var11.field426[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class376.field5043.method1687(-7653, 86) && !class376.field5043.method1687(-7653, 82) && !class376.field5043.method1687(-7653, 81)) && ((var26 & 0x2) == 0 || class376.field5043.method1687(-7653, 86)) && ((var26 & 0x1) == 0 || class376.field5043.method1687(-7653, 82)) && ((var26 & 0x4) == 0 || class376.field5043.method1687(-7653, 81))) {
                                                if (var25 < 10) {
                                                    class469.method2752(-1, (byte) -43, var25 + 1, "", var11.field465);
                                                } else if (var25 == 10) {
                                                    class415.method2491(56);
                                                    class158 var27 = method1659(var11);
                                                    class566.method3319(var27.method997((byte) -128), 120, var11, var27.field1923);
                                                    class52.field844 = class355.method2004((byte) -125, var11);
                                                    if (class52.field844 == null) {
                                                        class52.field844 = "Null";
                                                    }
                                                    class255.field3461 = var11.field438 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field393[var25];
                                                if (var11.field345 == null) {
                                                    var11.field345 = new int[var11.field347.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field345[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field345[var25] = class543.field7882 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field345 != null) {
                                        var11.field345[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class228.method1383(var24.method1733((byte) 120) - var13, var11, 23266, var24.method1729(false) - var12);
                            }
                            if (class386.field5135 != null && class386.field5135 != var11 && var21 && method1659(var11).method995((byte) 84)) {
                                class418.field5916 = var11;
                            }
                            if (class441.field6296 == var11) {
                                class504.field7033 = true;
                                class685.field9784 = var12;
                                class512.field7517 = var13;
                            }
                            if (var11.field425 || var11.field346 != 0) {
                                if (var21 && class131.field1668 != 0 && var11.field442 != null) {
                                    class143 var29 = new class143();
                                    var29.field1781 = true;
                                    var29.field1789 = var11;
                                    var29.field1784 = class131.field1668;
                                    var29.field1786 = var11.field442;
                                    class397.field5620.method1129(var29, 262144);
                                }
                                if (class386.field5135 != null || class361.field4805 || class168.field2055 != var11.field346 && class160.field1948 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field346 != 0) {
                                    if (class182.field2225 == var11.field346 || class27.field604 == var11.field346) {
                                        class504.field7030 = var11;
                                        if (class418.field5919 != null) {
                                            class418.field5919.method2918(var11.field402, (byte) -109, class68.field1045);
                                        }
                                        if (class182.field2225 == var11.field346) {
                                            if (!class361.field4805 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class333.method1929(arg9, arg8, -68, class68.field1045);
                                                for (class553 var30 = (class553) class627.field8993.method2070((byte) -128); var30 != null; var30 = (class553) class627.field8993.method2068(-2001)) {
                                                    if (arg8 >= var30.field8026 && arg8 < var30.field8028 && arg9 >= var30.field8031 && arg9 < var30.field8032) {
                                                        class47.method538(true);
                                                        class315.method1848((byte) -46, var30.field8027);
                                                    }
                                                }
                                            }
                                            class657.method3717(var11, (byte) -108, var12, var13);
                                            continue;
                                        }
                                    }
                                    if (class55.field875 == var11.field346) {
                                        if (var11.method192(class68.field1045, (byte) 94) == null || class301.field4043 != 0 && class301.field4043 != 3 || class361.field4805 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field450[var32];
                                        if (var31 < var33 || var31 > var11.field373[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field414 / 2;
                                        int var35 = var32 - var11.field402 / 2;
                                        int var36;
                                        if (class586.field8507 == 4) {
                                            var36 = (int) class115.field1495 & 0x3FFF;
                                        } else {
                                            var36 = (int) class115.field1495 + class186.field2277 & 0x3FFF;
                                        }
                                        int var37 = class395.field5579[var36];
                                        int var38 = class395.field5582[var36];
                                        if (class586.field8507 != 4) {
                                            var37 = (class680.field9743 + 256) * var37 >> 8;
                                            var38 = (class680.field9743 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class586.field8507 == 4) {
                                            var41 = (class394.field5560 >> 9) + (var39 >> 2);
                                            var42 = (class271.field3695 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class206.field2472.method1284((byte) -124) - 1) * 256;
                                            var41 = (class206.field2472.field530 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class206.field2472.field531 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class99.field1336 && (class251.field3440 & 0x40) != 0) {
                                            class17 var44 = class346.method1981(class391.field5243, class386.field5147, (byte) -114);
                                            if (var44 == null) {
                                                class415.method2491(107);
                                            } else {
                                                class240.method1471(1L, -24453, 57, false, var11.field412, class564.field8154, var42, class52.field844, var41, true, " ->");
                                            }
                                            continue;
                                        }
                                        if (class588.field8518 == class356.field4753) {
                                            class240.method1471(1L, -24453, 17, false, -1, -1, var42, class424.field6065.method2561(class370.field4980, 0), var41, true, "");
                                        }
                                        class240.method1471(1L, -24453, 60, false, -1, class521.field7632, var42, class62.field1000, var41, true, "");
                                        continue;
                                    }
                                    if (class168.field2055 == var11.field346) {
                                        class112.field1431 = var11;
                                        if (var21) {
                                            class496.field6908 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1729(false) - var12 - var11.field414 / 2) * 2.0D / (double) class550.field7984);
                                            int var46 = (int) (-((double) (var24.method1733((byte) 119) - var13 - var11.field402 / 2) * 2.0D / (double) class550.field7984));
                                            int var47 = class418.field5921 + var45 + class550.field8007;
                                            int var48 = class426.field6111 + var46 + class550.field8009;
                                            class114 var49 = class578.method3377(15504);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method819((byte) 64, var47, var50, var48);
                                            if (var50 != null) {
                                                if (class376.field5043.method1687(-7653, 82) && class37.field698 > 0) {
                                                    class51.method557(var50[2], var50[1], var50[0], -106);
                                                    continue;
                                                }
                                                class295.field3977 = true;
                                                class423.field6024 = var50[0];
                                                class423.field6021 = var50[1];
                                                class116.field1508 = var50[2];
                                            }
                                            class160.field1948 = 1;
                                            class598.field8636 = false;
                                            class109.field1421 = class478.field6713.method1349(-110);
                                            class385.field5121 = class478.field6713.method1338(1);
                                            continue;
                                        }
                                        if (var22 && class160.field1948 > 0) {
                                            if (class160.field1948 == 1 && (class109.field1421 != class478.field6713.method1349(112) || class385.field5121 != class478.field6713.method1338(1))) {
                                                class364.field4881 = class418.field5921;
                                                class499.field6981 = class426.field6111;
                                                class160.field1948 = 2;
                                            }
                                            if (class160.field1948 == 2) {
                                                class598.field8636 = true;
                                                class249.method1527(true, class364.field4881 + (int) ((double) (class109.field1421 - class478.field6713.method1349(66)) * 2.0D / (double) class550.field7983));
                                                class702.method3935(class499.field6981 - (int) ((double) (class385.field5121 - class478.field6713.method1338(1)) * 2.0D / (double) class550.field7983), -1);
                                            }
                                            continue;
                                        }
                                        if (class160.field1948 > 0 && !class598.field8636) {
                                            if ((class380.field5095 == 1 || class268.method1623(120)) && class271.field3704 > 2) {
                                                class220.method1331(class385.field5121, class109.field1421, 93);
                                            } else if (class529.method3109(0)) {
                                                class220.method1331(class385.field5121, class109.field1421, 47);
                                            }
                                        }
                                        class160.field1948 = 0;
                                        continue;
                                    }
                                    if (class585.field8497 == var11.field346) {
                                        if (var22) {
                                            class148.method951(var11.field414, (byte) 97, var11.field402, class478.field6713.method1338(1) - var13, class478.field6713.method1349(-110) - var12);
                                        }
                                        continue;
                                    }
                                    if (class664.field9402 == var11.field346) {
                                        class455.method2703(var11, var13, var12, 37);
                                        continue;
                                    }
                                }
                                if (!var11.field340 && var23) {
                                    var11.field340 = true;
                                    if (var11.field439 != null) {
                                        class143 var51 = new class143();
                                        var51.field1781 = true;
                                        var51.field1789 = var11;
                                        var51.field1790 = var24.method1729(false) - var12;
                                        var51.field1784 = var24.method1733((byte) 127) - var13;
                                        var51.field1786 = var11.field439;
                                        class397.field5620.method1129(var51, 262144);
                                    }
                                }
                                if (var11.field340 && var22 && var11.field418 != null) {
                                    class143 var52 = new class143();
                                    var52.field1781 = true;
                                    var52.field1789 = var11;
                                    var52.field1790 = class478.field6713.method1349(5) - var12;
                                    var52.field1784 = class478.field6713.method1338(1) - var13;
                                    var52.field1786 = var11.field418;
                                    class397.field5620.method1129(var52, 262144);
                                }
                                if (var11.field340 && !var22) {
                                    var11.field340 = false;
                                    if (var11.field341 != null) {
                                        class143 var53 = new class143();
                                        var53.field1781 = true;
                                        var53.field1789 = var11;
                                        var53.field1790 = class478.field6713.method1349(-117) - var12;
                                        var53.field1784 = class478.field6713.method1338(1) - var13;
                                        var53.field1786 = var11.field341;
                                        class281.field3812.method1129(var53, 262144);
                                    }
                                }
                                if (var22 && var11.field458 != null) {
                                    class143 var54 = new class143();
                                    var54.field1781 = true;
                                    var54.field1789 = var11;
                                    var54.field1790 = class478.field6713.method1349(-112) - var12;
                                    var54.field1784 = class478.field6713.method1338(1) - var13;
                                    var54.field1786 = var11.field458;
                                    class397.field5620.method1129(var54, 262144);
                                }
                                if (!var11.field452 && var21) {
                                    var11.field452 = true;
                                    if (var11.field473 != null) {
                                        class143 var55 = new class143();
                                        var55.field1781 = true;
                                        var55.field1789 = var11;
                                        var55.field1790 = class478.field6713.method1349(117) - var12;
                                        var55.field1784 = class478.field6713.method1338(1) - var13;
                                        var55.field1786 = var11.field473;
                                        class397.field5620.method1129(var55, 262144);
                                    }
                                }
                                if (var11.field452 && var21 && var11.field369 != null) {
                                    class143 var56 = new class143();
                                    var56.field1781 = true;
                                    var56.field1789 = var11;
                                    var56.field1790 = class478.field6713.method1349(-118) - var12;
                                    var56.field1784 = class478.field6713.method1338(1) - var13;
                                    var56.field1786 = var11.field369;
                                    class397.field5620.method1129(var56, 262144);
                                }
                                if (var11.field452 && !var21) {
                                    var11.field452 = false;
                                    if (var11.field471 != null) {
                                        class143 var57 = new class143();
                                        var57.field1781 = true;
                                        var57.field1789 = var11;
                                        var57.field1790 = class478.field6713.method1349(-122) - var12;
                                        var57.field1784 = class478.field6713.method1338(1) - var13;
                                        var57.field1786 = var11.field471;
                                        class281.field3812.method1129(var57, 262144);
                                    }
                                }
                                if (var11.field363 != null) {
                                    class143 var58 = new class143();
                                    var58.field1789 = var11;
                                    var58.field1786 = var11.field363;
                                    class195.field2363.method1129(var58, 262144);
                                }
                                if (var11.field423 != null && class253.field3451 > var11.field464) {
                                    if (var11.field484 == null || class253.field3451 - var11.field464 > 32) {
                                        class143 var63 = new class143();
                                        var63.field1789 = var11;
                                        var63.field1786 = var11.field423;
                                        class397.field5620.method1129(var63, 262144);
                                    } else {
                                        label696: for (int var59 = var11.field464; var59 < class253.field3451; var59++) {
                                            int var60 = class224.field2913[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field484.length; var61++) {
                                                if (var11.field484[var61] == var60) {
                                                    class143 var62 = new class143();
                                                    var62.field1789 = var11;
                                                    var62.field1786 = var11.field423;
                                                    class397.field5620.method1129(var62, 262144);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field464 = class253.field3451;
                                }
                                if (var11.field479 != null && class402.field5676 > var11.field397) {
                                    if (var11.field436 == null || class402.field5676 - var11.field397 > 32) {
                                        class143 var68 = new class143();
                                        var68.field1789 = var11;
                                        var68.field1786 = var11.field479;
                                        class397.field5620.method1129(var68, 262144);
                                    } else {
                                        label672: for (int var64 = var11.field397; var64 < class402.field5676; var64++) {
                                            int var65 = class264.field3634[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field436.length; var66++) {
                                                if (var11.field436[var66] == var65) {
                                                    class143 var67 = new class143();
                                                    var67.field1789 = var11;
                                                    var67.field1786 = var11.field479;
                                                    class397.field5620.method1129(var67, 262144);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field397 = class402.field5676;
                                }
                                if (var11.field336 != null && class631.field9083 > var11.field451) {
                                    if (var11.field356 == null || class631.field9083 - var11.field451 > 32) {
                                        class143 var73 = new class143();
                                        var73.field1789 = var11;
                                        var73.field1786 = var11.field336;
                                        class397.field5620.method1129(var73, 262144);
                                    } else {
                                        label648: for (int var69 = var11.field451; var69 < class631.field9083; var69++) {
                                            int var70 = class585.field8499[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field356.length; var71++) {
                                                if (var11.field356[var71] == var70) {
                                                    class143 var72 = new class143();
                                                    var72.field1789 = var11;
                                                    var72.field1786 = var11.field336;
                                                    class397.field5620.method1129(var72, 262144);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field451 = class631.field9083;
                                }
                                if (var11.field330 != null && class36.field692 > var11.field419) {
                                    if (var11.field374 == null || class36.field692 - var11.field419 > 32) {
                                        class143 var78 = new class143();
                                        var78.field1789 = var11;
                                        var78.field1786 = var11.field330;
                                        class397.field5620.method1129(var78, 262144);
                                    } else {
                                        label624: for (int var74 = var11.field419; var74 < class36.field692; var74++) {
                                            int var75 = class594.field8585[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field374.length; var76++) {
                                                if (var11.field374[var76] == var75) {
                                                    class143 var77 = new class143();
                                                    var77.field1789 = var11;
                                                    var77.field1786 = var11.field330;
                                                    class397.field5620.method1129(var77, 262144);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field419 = class36.field692;
                                }
                                if (var11.field381 != null && class356.field4754 > var11.field431) {
                                    if (var11.field435 == null || class356.field4754 - var11.field431 > 32) {
                                        class143 var83 = new class143();
                                        var83.field1789 = var11;
                                        var83.field1786 = var11.field381;
                                        class397.field5620.method1129(var83, 262144);
                                    } else {
                                        label600: for (int var79 = var11.field431; var79 < class356.field4754; var79++) {
                                            int var80 = class359.field4787[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field435.length; var81++) {
                                                if (var11.field435[var81] == var80) {
                                                    class143 var82 = new class143();
                                                    var82.field1789 = var11;
                                                    var82.field1786 = var11.field381;
                                                    class397.field5620.method1129(var82, 262144);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field431 = class356.field4754;
                                }
                                if (class190.field2320 > var11.field391 && var11.field487 != null) {
                                    class143 var84 = new class143();
                                    var84.field1789 = var11;
                                    var84.field1786 = var11.field487;
                                    class397.field5620.method1129(var84, 262144);
                                }
                                if (class698.field9879 > var11.field391 && var11.field427 != null) {
                                    class143 var85 = new class143();
                                    var85.field1789 = var11;
                                    var85.field1786 = var11.field427;
                                    class397.field5620.method1129(var85, 262144);
                                }
                                if (class531.field7755 > var11.field391 && var11.field411 != null) {
                                    class143 var86 = new class143();
                                    var86.field1789 = var11;
                                    var86.field1786 = var11.field411;
                                    class397.field5620.method1129(var86, 262144);
                                }
                                if (class568.field8308 > var11.field391 && var11.field481 != null) {
                                    class143 var87 = new class143();
                                    var87.field1789 = var11;
                                    var87.field1786 = var11.field481;
                                    class397.field5620.method1129(var87, 262144);
                                }
                                if (class345.field4534 > var11.field391 && var11.field417 != null) {
                                    class143 var88 = new class143();
                                    var88.field1789 = var11;
                                    var88.field1786 = var11.field417;
                                    class397.field5620.method1129(var88, 262144);
                                }
                                var11.field391 = class59.field926;
                                if (var11.field392 != null) {
                                    for (int var89 = 0; var89 < class660.field9377; var89++) {
                                        class143 var90 = new class143();
                                        var90.field1789 = var11;
                                        var90.field1779 = class159.field1934[var89].method2637(124);
                                        var90.field1778 = class159.field1934[var89].method2636((byte) -96);
                                        var90.field1786 = var11.field392;
                                        class397.field5620.method1129(var90, 262144);
                                    }
                                }
                                if (class655.field9305 && var11.field395 != null) {
                                    class143 var91 = new class143();
                                    var91.field1789 = var11;
                                    var91.field1786 = var11.field395;
                                    class397.field5620.method1129(var91, 262144);
                                }
                            }
                            if (var11.field379 == 5 && var11.field483 != -1) {
                                var11.method203(class415.field5873, (byte) 48, class32.field653).method2918(var11.field402, (byte) -113, class68.field1045);
                            }
                            class236.method1433(var11, false);
                            if (var11.field379 == 0) {
                                method1654(arg0, var11.field465, var14, var15, var16, var17, var12 - var11.field332, var13 - var11.field480, arg8, arg9);
                                if (var11.field429 != null) {
                                    method1654(var11.field429, var11.field465, var14, var15, var16, var17, var12 - var11.field332, var13 - var11.field480, arg8, arg9);
                                }
                                class21 var92 = (class21) class113.field1442.method3678((long) var11.field465, -126);
                                if (var92 != null) {
                                    if (class668.field9580 == class588.field8518 && var92.field541 == 0 && !class361.field4805 && var21 && !class679.field9734) {
                                        class47.method538(true);
                                    }
                                    class94.method730(var17, var14, var12, var15, var13, arg8, 105, arg9, var16, var92.field540);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class236.method1433(var11, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3738++;
        try {
            if (arg0.length != 6) {
                class5.method30((byte) 92, "Argument count");
            }
            class409.field5796 = new class337();
            class409.field5796.field4476 = Integer.parseInt(arg0[0]);
            class125.field1603 = new class337();
            class125.field1603.field4476 = Integer.parseInt(arg0[1]);
            class577.field8433 = new class337();
            class577.field8433.field4476 = Integer.parseInt(arg0[2]);
            class215.field2737 = class37.field708;
            if (arg0[3].equals("live")) {
                class5.field34 = class500.field6994;
            } else if (arg0[3].equals("rc")) {
                class5.field34 = class524.field7687;
            } else if (arg0[3].equals("wip")) {
                class5.field34 = class377.field5068;
            } else {
                class5.method30((byte) 65, "modewhat");
            }
            class370.field4980 = class434.method2600(arg0[4], 0);
            if (class370.field4980 == -1) {
                if (arg0[4].equals("english")) {
                    class370.field4980 = 0;
                } else if (arg0[4].equals("german")) {
                    class370.field4980 = 1;
                } else {
                    class5.method30((byte) 63, "language");
                }
            }
            class16.field298 = false;
            class16.field296 = false;
            if (arg0[5].equals("game0")) {
                class588.field8518 = class668.field9580;
            } else if (arg0[5].equals("game1")) {
                class588.field8518 = class356.field4753;
            } else {
                class5.method30((byte) 40, "game");
            }
            class163.field1995 = 0L;
            class353.field4723 = 0;
            class180.field2213 = true;
            class626.field8987 = true;
            class171.field2092 = 0;
            class55.field876 = 0;
            class675.field9686 = class588.field8518.field1256;
            class190.field2323 = "";
            class469.field6559 = false;
            class12.field203 = null;
            class424.field6102 = null;
            class586.field8503 = false;
            client var1 = new client();
            class683.field9762 = var1;
            var1.method3558((byte) 79, 768, 1024, 623, 35, class588.field8518.field1259, class5.field34.method1603(32767) + 32, false);
            class646.field9189.setLocation(40, 40);
        } catch (Exception var3) {
            class544.method3184(23383, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public static void method1655(byte arg0) {
        field3749 = null;
        field3735 = null;
        field3750 = null;
        field3739 = null;
        if (arg0 < 102) {
            field3749 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1656(int arg0) {
        field3730++;
        if (class62.field999) {
            class651.method3664((byte) -104);
        }
        class282.method1696(-45);
        if (class68.field1045 != null) {
            class68.field1045.method1047(1);
        }
        if (class617.field8851 != null) {
            class537.method3157(class617.field8851, 0, class517.field7570);
            class617.field8851 = null;
        }
        if (class489.field6835 != null) {
            class489.field6835.method1853((byte) 11);
            class489.field6835 = null;
        }
        class346.method1979(false);
        class33.field673.method962(-97);
        class512.field7508.method3893(arg0 ^ 0x33);
        if (class405.field5731 != null) {
            class405.field5731.method50(arg0 ^ 0xFFFFFFFB);
            class405.field5731 = null;
        }
        try {
            class662.field9390.method2705(false);
            for (int var2 = arg0; var2 < 35; var2++) {
                class466.field6498[var2].method2705(false);
            }
            class147.field1796.method2705(false);
            class23.field570.method2705(false);
            class599.method3462(arg0 ^ 0x9E333889);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method1657(boolean arg0) {
        field3742++;
        if (!arg0) {
            return null;
        }
        String var2 = null;
        try {
            var2 = "[1)" + class36.field689 + "," + class88.field1239 + "," + class473.field6604 + "," + class205.field2465 + "|";
            if (class206.field2472 != null) {
                var2 = var2 + "2)" + class617.field8853 + "," + (class206.field2472.field2689[0] + class36.field689) + "," + (class206.field2472.field2686[0] + class88.field1239) + "|";
            }
            var2 = var2 + "3)" + class375.field5039 + "|4)" + class221.field2851.field4152 + "|5)" + class158.method996(3) + "|6)" + class467.field6533 + "," + class300.field4038 + "|";
            var2 = var2 + "7)" + class221.field2851.method1841(class375.field5039, 3) + "|";
            var2 = var2 + "8)" + class221.field2851.method1844(class375.field5039, true) + "|";
            var2 = var2 + "9)" + class221.field2851.field4159 + "|";
            var2 = var2 + "10)" + class221.field2851.field4142 + "|";
            var2 = var2 + "11)" + class221.field2851.field4149 + "|";
            var2 = var2 + "12)" + class221.field2851.method1747(0, class375.field5039) + "|";
            var2 = var2 + "13)" + class590.field8558 + "|";
            var2 = var2 + "14)" + class114.field1485;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class375.field5039 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3752 == null ? (field3752 = method1665("client")) : field3752).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1658(byte arg0) {
        field3747++;
        if (class375.field5039 == 2) {
            try {
                this.method1640((byte) -113);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class544.method3184(23383, var5.getMessage() + " (Recovered) " + this.method1657(true), var5);
                class435.method2608(19, 0);
            }
        } else {
            this.method1640((byte) -126);
        }
        if (arg0 < 99) {
            field3735 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ln;)Laba;")
    public static final class158 method1659(class17 arg0) {
        class158 var1 = (class158) class512.field7516.method3678(((long) arg0.field465 << 32) + (long) arg0.field485, -125);
        return var1 == null ? arg0.field349 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ln;)Z")
    public static final boolean method1660(class17 arg0) {
        if (class679.field9734) {
            if (method1659(arg0).field1929 != 0) {
                return false;
            }
            if (arg0.field379 == 0) {
                return false;
            }
        }
        return arg0.field461;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1661(byte arg0) {
        if (class469.field6559) {
            class590.field8558 = 64;
        }
        field3740++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        if (arg0 != -24) {
            field3743 = -121L;
        }
        class414.method2489(26895);
        class512.field7508 = new class689(class517.field7570);
        class33.field673 = new class149();
        class452.method2680((byte) -15, new int[] { 20, 260 }, new int[] { 1000, 100 });
        if (class39.field729 != class215.field2737) {
            class432.field6202 = new byte[50][];
        }
        class221.field2851 = new class295(class517.field7570);
        if (class39.field729 == class215.field2737) {
            class409.field5796.field4480 = this.getCodeBase().getHost();
        } else if (class238.method1454(class215.field2737, 0)) {
            class409.field5796.field4480 = this.getCodeBase().getHost();
            class409.field5796.field4468 = class409.field5796.field4476 + 40000;
            class125.field1603.field4468 = class125.field1603.field4476 + 40000;
            class577.field8433.field4468 = class577.field8433.field4476 + 40000;
            class409.field5796.field4470 = class409.field5796.field4476 + 50000;
            class125.field1603.field4470 = class125.field1603.field4476 + 50000;
            class577.field8433.field4470 = class577.field8433.field4476 + 50000;
        } else if (class37.field708 == class215.field2737) {
            class409.field5796.field4480 = "127.0.0.1";
            class125.field1603.field4480 = "127.0.0.1";
            class577.field8433.field4480 = "127.0.0.1";
            class409.field5796.field4468 = class409.field5796.field4476 + 40000;
            class125.field1603.field4468 = class125.field1603.field4476 + 40000;
            class409.field5796.field4470 = class409.field5796.field4476 + 50000;
            class577.field8433.field4468 = class577.field8433.field4476 + 40000;
            class125.field1603.field4470 = class125.field1603.field4476 + 50000;
            class577.field8433.field4470 = class577.field8433.field4476 + 50000;
        }
        class281.field3813 = class409.field5796;
        if (class668.field9580 == class588.field8518) {
            class570.field8336 = false;
        }
        if (class588.field8518 == class356.field4753) {
            class499.field6975 = class463.field6473;
            class268.field3677 = 16777215;
            class189.field2310 = true;
            class422.field6004 = class176.field2174;
            class362.field4822 = 0;
        } else {
            class499.field6975 = class671.field9644;
            class422.field6004 = class487.field6819;
        }
        class120.field1560 = class488.field6824 = class397.field5619 = class664.field9399 = new short[256];
        try {
            class181.field2220 = class683.field9762.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class376.field5043 = class256.method1560(class646.field9190, false);
        class478.field6713 = class510.method3018(class646.field9190, 0, true);
        try {
            if (class517.field7570.field3411 != null) {
                class662.field9390 = new class455(class517.field7570.field3411, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class466.field6498[var3] = new class455(class517.field7570.field3413[var3], 6000, 0);
                }
                class147.field1796 = new class455(class517.field7570.field3399, 6000, 0);
                class504.field7034 = new class171(255, class662.field9390, class147.field1796, 500000);
                class23.field570 = new class455(class517.field7570.field3412, 24, 0);
                class517.field7570.field3413 = null;
                class517.field7570.field3411 = null;
                class517.field7570.field3412 = null;
                class517.field7570.field3399 = null;
            }
        } catch (IOException var5) {
            class662.field9390 = null;
            class504.field7034 = null;
            class147.field1796 = null;
            class23.field570 = null;
        }
        if (class39.field729 != class215.field2737) {
            class564.field8151 = true;
        }
        if (class668.field9580 == class588.field8518) {
            class364.field4903 = class424.field6037.method2561(class370.field4980, 0);
        } else if (class588.field8518 == class356.field4753) {
            class364.field4903 = class424.field6038.method2561(class370.field4980, arg0 ^ 0xFFFFFFE8);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final synchronized void method1662(int arg0) {
        field3745++;
        if (class627.field8991 != null && class646.field9190 == null && !class517.field7570.field3401) {
            try {
                Class var2 = class627.field8991.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class646.field9190 = (Canvas) var3.get(class627.field8991);
                var3.set(class627.field8991, null);
                if (class646.field9190 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1662(arg0);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3729++;
        if (!this.method3561(0)) {
            return;
        }
        class409.field5796 = new class337();
        class409.field5796.field4476 = Integer.parseInt(this.getParameter("worldid"));
        class125.field1603 = new class337();
        class125.field1603.field4476 = Integer.parseInt(this.getParameter("lobbyid"));
        class125.field1603.field4480 = this.getParameter("lobbyaddress");
        class577.field8433 = new class337();
        class577.field8433.field4476 = Integer.parseInt(this.getParameter("demoid"));
        class577.field8433.field4480 = this.getParameter("demoaddress");
        class215.field2737 = class586.method3399(Integer.parseInt(this.getParameter("modewhere")), 0);
        if (class37.field708 == class215.field2737) {
            class215.field2737 = class231.field3012;
        } else if (!class238.method1454(class215.field2737, 0) && class39.field729 != class215.field2737) {
            class215.field2737 = class39.field729;
        }
        class5.field34 = class672.method3826(true, Integer.parseInt(this.getParameter("modewhat")));
        if (class5.field34 != class377.field5068 && class524.field7687 != class5.field34 && class500.field6994 != class5.field34) {
            class5.field34 = class500.field6994;
        }
        try {
            class370.field4980 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class370.field4980 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class16.field298 = true;
        } else {
            class16.field298 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class16.field296 = true;
        } else {
            class16.field296 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class173.field2134 = true;
        } else {
            class173.field2134 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class588.field8518 = class668.field9580;
            } else if (var4.equals("1")) {
                class588.field8518 = class356.field4753;
            }
        }
        try {
            class171.field2092 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class171.field2092 = 0;
        }
        class310.field4103 = this.getParameter("quiturl");
        class190.field2323 = this.getParameter("settings");
        if (class190.field2323 == null) {
            class190.field2323 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class353.field4723 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class353.field4723 = 0;
            }
        }
        class675.field9686 = Integer.parseInt(this.getParameter("colourid"));
        if (class675.field9686 < 0 || class156.field1908.length <= class675.field9686) {
            class675.field9686 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class180.field2213 = true;
            class626.field8987 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class586.field8503 = true;
        }
        class424.field6102 = this.getParameter("sskey");
        if (class424.field6102 != null && class424.field6102.length() < 2) {
            class424.field6102 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class469.field6559 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class55.field876 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class163.field1995 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class12.field203 = this.getParameter("additionalInfo");
        if (class12.field203 != null && class12.field203.length() > 50) {
            class12.field203 = null;
        }
        if (class668.field9580 == class588.field8518) {
            class6.field60 = 503;
            class589.field8535 = 765;
        } else if (class588.field8518 == class356.field4753) {
            class589.field8535 = 640;
            class6.field60 = 480;
        }
        class683.field9762 = this;
        this.method3555(class588.field8518.field1259, class6.field60, 35, 623, (byte) -127, class5.field34.method1603(32767) + 32, class589.field8535);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ln;)Ln;")
    public static final class17 method1663(class17 arg0) {
        int var1 = method1659(arg0).method992((byte) 64);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class400.method2420((byte) -120, arg0.field469);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1664(int arg0, int arg1) {
        class33.field673.field1856++;
        class197.field2384 = arg1;
        class527.field7716 = null;
        field3748++;
        class33.field673.field1853 = arg0;
        class195.field2361 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1665(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
