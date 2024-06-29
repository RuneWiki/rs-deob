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
public class client extends class705 {

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field6142;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Ljava/lang/Class;")
    public static Class field6141;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2691(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 3)
    private final void method2666(int arg0, byte arg1) {
        class741.field10329 = null;
        class552.field7808 = null;
        class480.field6528.field3884++;
        field6137++;
        if (arg1 != 40) {
            method2679();
        }
        class688.field9648 = 0;
        class480.field6528.field3886 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 19)
    public final void method2667(int arg0) {
        field6127++;
        if (arg0 != 32089) {
            return;
        }
        if (class97.field1411) {
            class244.method1551(-86);
        }
        class56.method381(arg0 - 44853);
        if (class96.field1401 != null) {
            class96.field1401.method3253(arg0 - 38191);
        }
        if (class455.field6257 != null) {
            class329.method1916(120, class455.field6257, class379.field5339);
            class455.field6257 = null;
        }
        if (class275.field3699 != null) {
            class275.field3699.method2461(false);
            class275.field3699 = null;
        }
        class724.method4056(63);
        class480.field6528.method1751(arg0 - 32085);
        class474.field6488.method204(arg0 ^ 0xFFFF82E9);
        if (class641.field9106 != null) {
            class641.field9106.method3727(0);
            class641.field9106 = null;
        }
        try {
            class324.field4170.method3006(0);
            for (int var2 = 0; var2 < 37; var2++) {
                class652.field9218[var2].method3006(0);
            }
            class396.field5505.method3006(arg0 - 32089);
            class658.field9296.method3006(0);
            class103.method698((byte) -127);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V", line = 72)
    private final void method2668(byte arg0) {
        field6135++;
        boolean var2 = class480.field6528.method1744(true);
        if (!var2) {
            this.method2670((byte) -19);
        }
        if (arg0 < 4) {
            method2673();
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 89)
    public final void method2669(byte arg0) {
        if (arg0 != -27) {
            return;
        }
        field6131++;
        if (class674.field9500.field5158.method1006(0) != 2) {
            this.method2681(12218);
            return;
        }
        try {
            this.method2681(arg0 + 12245);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class233.method1495((byte) -82, var5, var5.getMessage() + " (Recovered) " + this.method2686((byte) -87));
            class736.method4088((byte) 122, false, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V", line = 115)
    private final void method2670(byte arg0) {
        field6132++;
        if (class480.field6528.field3884 > class18.field218) {
            class396.field5504.method388((byte) 125);
            class412.field5732 = (class480.field6528.field3884 * 50 - 50) * 5;
            if (class412.field5732 > 3000) {
                class412.field5732 = 3000;
            }
            if (class480.field6528.field3884 >= 2 && class480.field6528.field3886 == 6) {
                this.method3970("js5connect_outofdate", 10);
                class213.field3004 = 14;
                return;
            }
            if (class480.field6528.field3884 >= 4 && class480.field6528.field3886 == -1) {
                this.method3970("js5crc", 10);
                class213.field3004 = 14;
                return;
            }
            if (class480.field6528.field3884 >= 4 && class599.method3533(class213.field3004, arg0 ^ 0xFFFFFFED)) {
                if (class480.field6528.field3886 == 7 || class480.field6528.field3886 == 9) {
                    this.method3970("js5connect_full", arg0 + 29);
                } else if (class480.field6528.field3886 <= 0) {
                    this.method3970("js5io", 10);
                } else if (class151.field2088 == null) {
                    this.method3970("js5connect", 10);
                } else {
                    this.method3970("js5proxy_" + class151.field2088.trim(), arg0 + 29);
                }
                class213.field3004 = 14;
                return;
            }
        }
        class18.field218 = class480.field6528.field3884;
        if (class412.field5732 > 0) {
            class412.field5732--;
        } else if (arg0 == -19) {
            try {
                if (class688.field9648 == 0) {
                    class552.field7808 = class396.field5504.method391(false, class379.field5339);
                    class688.field9648++;
                }
                if (class688.field9648 == 1) {
                    if (class552.field7808.field5975 == 2) {
                        if (class552.field7808.field5973 != null) {
                            class151.field2088 = (String) class552.field7808.field5973;
                        }
                        this.method2666(1000, (byte) 40);
                        return;
                    }
                    if (class552.field7808.field5975 == 1) {
                        class688.field9648++;
                    }
                }
                if (class688.field9648 == 2) {
                    class741.field10329 = new class325((Socket) class552.field7808.field5973, class379.field5339, 25000);
                    class26 var2 = new class26(5);
                    var2.method184(class241.field3356.field2237, -34);
                    var2.method199(true, 631);
                    class741.field10329.method1904(5, (byte) 39, var2.field279, 0);
                    class688.field9648++;
                    class704.field9792 = class224.method1457((byte) -62);
                }
                if (class688.field9648 == 3) {
                    if (class599.method3533(class213.field3004, 0) || class741.field10329.method1905(false) > 0) {
                        int var3 = class741.field10329.method1898(-26946);
                        if (var3 != 0) {
                            this.method2666(var3, (byte) 40);
                            return;
                        }
                        class688.field9648++;
                    } else if ((class224.method1457((byte) -62) - class704.field9792) > 30000L) {
                        this.method2666(1001, (byte) 40);
                        return;
                    }
                }
                if (class688.field9648 == 4) {
                    boolean var4 = class599.method3533(class213.field3004, 0) || class66.method432((byte) 126, class213.field3004) || class275.method1670(-97, class213.field3004);
                    class83[] var5 = class83.method491(-110);
                    class26 var6 = new class26(var5.length * 4);
                    class741.field10329.method1897(var6.field279.length, 0, (byte) 12, var6.field279);
                    for (int var7 = 0; var7 < var5.length; var7++) {
                        var5[var7].method490((byte) -47, var6.method189(255));
                    }
                    class480.field6528.method1747(-128, class741.field10329, !var4);
                    class741.field10329 = null;
                    class688.field9648 = 0;
                    class552.field7808 = null;
                }
            } catch (IOException var8) {
                this.method2666(1002, (byte) 40);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 280)
    public static final void method2671(int arg0) {
        int var1 = class147.field2030;
        int[] var2 = class351.field4456;
        for (int var3 = 0; var3 < class676.field9533 + var1; var3++) {
            class584 var4;
            if (var3 < var1) {
                var4 = class40.field563[var2[var3]];
            } else {
                var4 = ((class15) class403.field5587.method1381(true, (long) class731.field10231[var3 - var1])).field204;
            }
            if (var4.field9501 == arg0 && var4.field8383 >= 0) {
                int var5 = var4.method3470(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field9490 & 0x1FF) != 0 || (var4.field9489 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field9490 & 0x1FF) != 256 || (var4.field9489 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field9490 >> 9;
                    int var7 = var4.field9489 >> 9;
                    if (var4.field8383 > class491.field6605[var6][var7]) {
                        class491.field6605[var6][var7] = var4.field8383;
                        class284.field3767[var6][var7] = 1;
                    } else if (class491.field6605[var6][var7] == var4.field8383) {
                        var10002 = class284.field3767[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field9490 - var8 >> 9;
                    int var10 = var4.field9489 - var8 >> 9;
                    int var11 = var4.field9490 + var8 >> 9;
                    int var12 = var4.field9489 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field8383 > class491.field6605[var13][var14]) {
                                class491.field6605[var13][var14] = var4.field8383;
                                class284.field3767[var13][var14] = 1;
                            } else if (class491.field6605[var13][var14] == var4.field8383) {
                                var10002 = class284.field3767[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 377)
    public final void method2672(byte arg0) {
        field6130++;
        class439.method2629(-123);
        class90.method545(arg0 ^ 0x45);
        class118.method772(-120);
        class138.method890((byte) -117);
        class232.method1491((byte) -78);
        class284.method1699((byte) -51);
        class658.method3796(10922);
        class83.method496(-23937);
        class730.method4067(false);
        class105.method717((byte) 121);
        class513.method3066((byte) -119);
        class98.method663(-69);
        class209.method1386(false);
        class705.method3961(arg0 - 26);
        class130.method830((byte) -19);
        class594.method3522((byte) -95);
        class380.method2333(500);
        class121.method784(2048);
        class545.method3266(19792);
        class374.method2247(arg0 ^ 0x42);
        class736.method4091(85);
        class522.method3119(true);
        class325.method1899(-1);
        class452.method2719((byte) 113);
        class504.method3015(true);
        class244.method1550(true);
        class538.method3203(-334);
        class267.method1642(104);
        class169.method1065(arg0 ^ 0x4E);
        class157.method990(true);
        class140.method906(true);
        class4.method14(128);
        class206.method1373((byte) 60);
        class610.method3566(31);
        class534.method3193(7);
        class139.method899((byte) 124);
        class678.method3886(-101);
        class511.method3055(-1);
        class392.method2385((byte) 127);
        class370.method2064(64);
        class322.method1885((byte) -107);
        class184.method1233((byte) 31);
        class713.method4019(0);
        class708.method3982((byte) 116);
        class399.method2421(15);
        class114.method759((byte) -105);
        class274.method1663(127);
        class637.method3704((byte) -113);
        class631.method3673((byte) 127);
        class627.method3660(false);
        class405.method2460(false);
        class583.method3468(false);
        class643.method3726((byte) 117);
        class672.method3845(22050);
        class141.method917(-1);
        class295.method1728(arg0 - 76);
        class520.method3089((byte) 127);
        class608.method3559(3);
        class336.method1953((byte) 120);
        class712.method4013(-1);
        class473.method2811((byte) 119);
        class53.method358(1);
        class199.method1349((byte) 105);
        class26.method179(-129);
        class120.method783(32);
        class38.method264(0);
        class640.method3718(-25985);
        class200.method1352((byte) 87);
        class175.method1100((byte) 82);
        class55.method369(-87);
        class14.method77((byte) -128);
        class409.method2497((byte) -93);
        class632.method3677((byte) -59);
        class1.method2(8);
        class280.method1679(arg0 ^ 0xFFFFFFCE);
        class467.method2783(true);
        class224.method1455(false);
        class645.method3742(true);
        class183.method1223(31);
        class749.method4162((byte) -126);
        class417.method2535(2);
        class703.method3956(6);
        class202.method1358((byte) 51);
        class331.method1925(-1);
        class651.method3767(arg0 ^ 0x4C);
        class540.method3218(-51);
        class286.method1703(7);
        class635.method3688((byte) -89);
        class154.method982(true);
        class696.method3942(21541);
        class283.method1695((byte) -6);
        class294.method1721((byte) 79);
        class78.method473((byte) 108);
        class240.method1532((byte) -61);
        class30.method217(arg0 ^ 0xFFFFC8A8);
        class64.method418(343290798);
        class693.method3939(2);
        class339.method1958((byte) 75);
        class11.method57(0);
        class544.method3251(-83);
        class400.method2433(20151);
        class721.method4045(-95746376);
        class324.method1894(1);
        class646.method3747(1);
        class463.method2766(arg0 ^ 0x3D);
        class614.method3601(48);
        class189.method1260(-54);
        class96.method654(1339);
        class156.method986(true);
        class483.method2842(-108);
        class31.method230(-31967);
        class249.method1587((byte) -94);
        class389.method2362(-29932);
        class265.method1634(-1733);
        class652.method3768((byte) -21);
        class466.method2777(arg0 ^ 0x4C);
        class426.method2596(false);
        class161.method1009(arg0 - 76);
        class659.method3797(16);
        class340.method1964((byte) 56);
        class167.method1059(true);
        class345.method1984(-48);
        class547.method3268((byte) -27);
        class13.method69(0);
        class692.method3937((byte) -65);
        class539.method3215(-103);
        class702.method3954(false);
        class425.method2593(arg0 ^ 0x4E);
        class571.method3414(false);
        class256.method1600(6880);
        class742.method4142((byte) 95);
        class347.method1986(true);
        class757.method4207(-1);
        class438.method2627(-115);
        class743.method4143((byte) 57);
        class674.method3866(-5);
        class379.method2320(-191542872);
        class529.method3142(false);
        class624.method3652((byte) 117);
        class318.method1843();
        class102.method688(111);
        class747.method4154((byte) -67);
        class673.method3861((byte) -111);
        class45.method309(-2759);
        class168.method1063(0);
        class560.method3354(0);
        class323.method1887((byte) 36);
        class269.method1645(0);
        class478.method2827(0);
        class471.method2809(true);
        class317.method1835((byte) 107);
        class602.method3537(arg0 ^ 0x4C);
        class210.method1393(-6);
        class109.method733((byte) 106);
        class639.method3714(false);
        class122.method787(true);
        class531.method3165();
        class460.method2758(arg0 - 74);
        class455.method2733((byte) 36);
        class179.method1174((byte) -18);
        class710.method3989(arg0 - 13);
        class563.method3365(arg0 ^ 0x4F);
        class112.method753(-129);
        class92.method552(-21012);
        class482.method2837(63);
        class369.method2058(true);
        class193.method1280((byte) 19);
        class321.method1874(true);
        class596.method3529(false);
        class446.method2660(0);
        class198.method1337();
        class591.method3509((byte) -21);
        class241.method1536(65);
        class153.method975(-114);
        class456.method2737((byte) -51);
        class430.method2605(true);
        class7.method31(0);
        class395.method2405((byte) 120);
        class46.method312(arg0 ^ 0x10);
        class753.method4178(arg0 - 197);
        class185.method1240(true);
        class443.method2649();
        class162.method1013((byte) 125);
        class75.method466((byte) -119);
        class449.method2698((byte) 96);
        class700.method3950((byte) 70);
        class228.method1475((byte) -122);
        class155.method983(-5724);
        class63.method408((byte) 86);
        class617.method3622((byte) -128);
        class519.method3085((byte) -28);
        class270.method1653(1813);
        class50.method343(true);
        class527.method3137(7000);
        class590.method3506(arg0 - 172);
        class706.method3972(9468);
        class327.method1914(-67);
        class334.method1937();
        class57.method384((byte) 10);
        class648.method3758(0);
        class9.method44(72);
        class41.method284((byte) -78);
        class342.method1970();
        class754.method4183(arg0 - 76);
        class756.method4193(arg0 - 75);
        class42.method287((byte) -10);
        class187.method1253(1);
        class159.method996(-1);
        class67.method434(-126);
        class110.method746();
        class390.method2369(-8867);
        class60.method393((byte) -103);
        class552.method3297(-10316);
        class589.method3496((byte) 108);
        class494.method2957(-96);
        class54.method364(-2);
        class403.method2450((byte) -111);
        class752.method4167(false);
        class365.method2047(1);
        class569.method3405(false);
        class440.method2634(46);
        class326.method1908(0);
        class177.method1110(10639);
        class160.method1003(arg0 ^ 0xFFFFFFB0);
        class451.method2711(0);
        class670.method3835((byte) 121);
        class577.method3447(117);
        class205.method1370(-96);
        class330.method1921(arg0 + 36);
        class474.method2815(arg0 ^ 0x7C);
        class542.method3227(28529);
        class487.method2854((byte) 47);
        class524.method3129((byte) -75);
        class220.method1439(104);
        class656.method3792((byte) -115);
        class746.method4148(arg0 ^ 0x4C);
        class80.method480(true);
        class731.method4070(true);
        class586.method3487(-54);
        class52.method356(22156);
        class19.method94(4);
        class391.method2373(126);
        class701.method3952((byte) -84);
        class686.method3912(-10);
        class447.method2663(0);
        class314.method1826(122);
        class410.method2506((byte) -114);
        class40.method266(false);
        class313.method1825((byte) -95);
        class108.method729(arg0 + 18942);
        class47.method323(121);
        class126.method813(-82);
        class214.method1413(arg0 + 2);
        class36.method257(arg0 ^ 0x4C);
        class621.method3638(8);
        class691.method3931(38);
        class555.method3301(true);
        class271.method1657(0);
        class32.method233(-1);
        class104.method703((byte) -82);
        class751.method4165(arg0 ^ 0xFFFFFFD0);
        class548.method3272((byte) 88);
        class459.method2753(-1);
        class306.method1787(1);
        class468.method2790(1);
        class634.method3685(arg0 - 451565828);
        class507.method3035(true);
        class470.method2799(-1);
        class501.method2993(false);
        class218.method1426((byte) -120);
        class231.method1489(-5459);
        class718.method4034(115);
        class304.method1782(32768);
        class260.method1618(-101);
        class694.method3940((byte) 114);
        class741.method4131(false);
        class475.method2819(false);
        class383.method2339(-11200);
        class502.method3000((byte) -23);
        class667.method3823((byte) 102);
        class89.method536();
        class215.method1414(4096);
        class745.method4147(127);
        class486.method2846(true);
        class263.method1627(15540);
        class62.method397(arg0 - 12343);
        class278.method1676(arg0 ^ 0xFFFFFFCF);
        class707.method3977(23479);
        class619.method3629(124);
        class35.method247(19758);
        class688.method3922(0);
        class407.method2483((byte) -126);
        class384.method2348(9461);
        class17.method84((byte) -8);
        class261.method1621((byte) 12);
        class496.method2973();
        class647.method3751(arg0 - 135);
        class191.method1266(78);
        class402.method2443();
        class684.method3910();
        class163.method1014((byte) -58);
        class49.method337((byte) -6);
        class444.method2652();
        class363.method2042((byte) 125);
        class144.method941(123);
        class225.method1458(121);
        class748.method4158(3);
        class33.method235(false);
        class433.method2611(-4);
        class526.method3134((byte) 34);
        class23.method127(true);
        class132.method837(124);
        class237.method1514(-401938354);
        class235.method1500(arg0 ^ 0xFFFF89D0);
        class151.method969((byte) -77);
        class575.method3424((byte) -127);
        class626.method3657((byte) -99);
        class312.method1823(false);
        class682.method3898(arg0);
        class230.method1485(true);
        class127.method818(arg0 - 74);
        class537.method3197(125);
        class373.method2235();
        class352.method2003(arg0 ^ 0x3F);
        class10.method45(false);
        class585.method3485((byte) 88);
        class196.method1322(arg0 - 177);
        class387.method2357(arg0 + 20950);
        class441.method2636(-1);
        class609.method3561(false);
        class488.method2857(0);
        class442.method2644(false);
        class142.method931(125);
        class676.method3870((byte) -118);
        class535.method3195(-1);
        class211.method1397(-79);
        class503.method3004(true);
        class675.method3869(12830);
        class61.method394(false);
        class429.method2604(256);
        class562.method3361(-25344);
        class123.method790(true);
        class86.method526(arg0 ^ 0xFFFFFFCE);
        class125.method799(1);
        class349.method1992(16383);
        class351.method1997(-28841);
        class371.method2129(true);
        class393.method2392((byte) -69);
        class457.method2747(Integer.MAX_VALUE);
        class408.method2490(arg0 ^ 0x4C);
        class136.method877(false);
        class197.method1329((byte) -122);
        class437.method2619(arg0 + 51);
        class290.method1714(-128);
        class517.method3073(-117);
        class396.method2414(36);
        class204.method1365((byte) 15);
        class111.method749(5);
        class146.method949((byte) -87);
        class178.method1137(true);
        class329.method1915(529);
        class128.method822((byte) 15);
        class492.method2916(127);
        class91.method549(true);
        class720.method4041((byte) -81);
        class20.method99((byte) 126);
        class173.method1092((byte) 121);
        class497.method2980(95);
        class528.method3138(-28651);
        class735.method4081(-32722);
        class512.method3060(15675);
        class303.method1775((byte) -56);
        class77.method472(104);
        class728.method4064(arg0 ^ 0xFFFFF42F);
        class378.method2290((byte) 34);
        class574.method3420((byte) 99);
        class93.method613(14648);
        class281.method1684((byte) 52);
        class302.method1768();
        class164.method1021((byte) -119);
        class5.method24(6668);
        class413.method2517(512);
        class116.method768((byte) 127);
        class72.method454(1);
        class554.method3299((byte) -109);
        class223.method1453(92);
        class316.method1830(-5);
        class275.method1667(arg0 ^ 0x84C);
        class568.method3399((byte) -56);
        class296.method1740(4096);
        class573.method3417(arg0 + 6);
        class464.method2774((byte) -4);
        class149.method959(45047404);
        class717.method4032(arg0 - 1600551552);
        class259.method1610((byte) 79);
        class176.method1105((byte) -124);
        class289.method1710(false);
        class625.method3656(88);
        class506.method3022(arg0 + 14865);
        class76.method468(true);
        class70.method447((byte) -114);
        class666.method3819((byte) -97);
        class186.method1251(121);
        class229.method1480((byte) 68);
        class453.method2728(true);
        class543.method3228((byte) -71);
        class66.method433(arg0 ^ 0x48);
        class618.method3625();
        class333.method1930((byte) 0);
        class293.method1720(true);
        class252.method1594(31332);
        class699.method3944(false);
        class641.method3723(-30663);
        class465.method2776((byte) 42);
        class88.method532(30);
        class644.method3735(34);
        class628.method3667(-101);
        class375.method2260(-83);
        class622.method3640(18997);
        class87.method528(arg0 ^ 0x22DE);
        class264.method1632(-25572);
        class226.method1465(7784);
        class165.method1024(true);
        class565.method3380(true);
        class233.method1493(true);
        class253.method1596((byte) -124);
        class477.method2824((byte) -42);
        class669.method3832((byte) -60);
        class359.method2026(0);
        class213.method1409(arg0 + 34303);
        class282.method1687(0);
        class603.method3538((byte) -105);
        class357.method2020(arg0 + 21);
        class532.method3176(0);
        class592.method3517(35044);
        class714.method4025(-97);
        class660.method3799(-1);
        class664.method3811((byte) -95);
        class99.method669(121);
        class593.method3519((byte) -61);
        class687.method3917(-24224);
        class689.method3929(-89);
        class367.method2057(1);
        class661.method3800((byte) 110);
        class262.method1626((byte) -123);
        class510.method3043((byte) 21);
        class704.method3959(47);
        class308.method1809(109);
        class97.method659(-108);
        class298.method1755((byte) 126);
        class356.method2012((byte) -114);
        class450.method2706((byte) 46);
        class523.method3125(97);
        class431.method2607(false);
        class82.method488(0);
        class556.method3304(arg0 - 61);
        class663.method3804(-121);
        class124.method797((byte) 86);
        class435.method2613(19474);
        class740.method4125(0);
        class8.method34((byte) -3);
        class238.method1517(79);
        class419.method2537(arg0 ^ 0x70);
        class71.method453((byte) 111);
        class616.method3615(-108);
        class335.method1942((byte) 15);
        class245.method1552(false);
        class514.method3067((byte) -128);
        class533.method3180(true);
        class461.method2759(0);
        class550.method3287(arg0 ^ 0x21);
        class445.method2654((byte) -6);
        class579.method3450(105);
        class629.method3671(2);
        class671.method3842(false);
        class604.method3542((byte) 29);
        class665.method3818(true);
        class158.method992(99);
        class81.method483((byte) -67);
        class372.method2232(arg0 - 66);
        class137.method888((byte) 113);
        class272.method1658((byte) -74);
        class366.method2053(-52);
        class448.method2694(1);
        class422.method2578((byte) -47);
        class416.method2532((byte) -48);
        class133.method839(true);
        class101.method683((byte) -102);
        class690.method3930((byte) -108);
        class677.method3879((byte) 51);
        class192.method1272(true);
        class599.method3532(4);
        class490.method2863(-54);
        class559.method3347(true);
        class734.method4076((byte) 2);
        class611.method3572((byte) -25);
        class16.method82(72);
        class491.method2865(arg0 + 29703);
        class480.method2833((byte) 93);
        class6.method28(true);
        class683.method3900((byte) -106);
        class404.method2453(-115);
        class150.method963(0);
        class680.method3894((byte) -107);
        class337.method1957(-73);
        class570.method3406((byte) -25);
        class355.method2009(5000);
        class566.method3387((byte) -118);
        class292.method1715((byte) -49);
        class222.method1447((byte) -123);
        class485.method2845((byte) -81);
        class65.method428(arg0 - 201);
        class300.method1758((byte) -70);
        class332.method1926(arg0 ^ 0x4C);
        class190.method1264(-1);
        class216.method1416(-83);
        class638.method3709(97);
        class48.method325(arg0 - 7547);
        class242.method1538(5716);
        class499.method2988(16777215);
        class350.method1994(-7483);
        class558.method3346(-29527);
        if (class705.field9831) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 908)
    public static final void method2673() {
        int var0 = class147.field2030;
        int[] var1 = class351.field4456;
        int var2 = class674.field9500.field5137.method231(0);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class655 var14 = class40.field563[var1[var4]];
            if (!var14.method3782(-713165362)) {
                var14.field8383 = -1;
            } else if (var14.field9255) {
                var14.field8383 = -1;
            } else {
                var14.method3480(false);
                if (var14.field10352 >= 0 && var14.field10357 >= 0 && var14.field10365 < class514.field7179 && var14.field10353 < class456.field6281) {
                    var14.field9280 = var14.field8352 ? var3 : false;
                    if (class473.field6483 == var14) {
                        var14.field8383 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field8312) {
                            var15++;
                        }
                        if (var14.field8341 > class245.field3409) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method3470(-1) << 2);
                        if (var14.field9264) {
                            var16 += 512;
                        } else {
                            if (class6.field54 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field8383 = var16 + 1;
                    }
                } else {
                    var14.field8383 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class676.field9533; var5++) {
            class55 var11 = ((class15) class403.field5587.method1381(true, (long) class731.field10231[var5])).field204;
            if (var11.method370(-713165362) && var11.field771.method53(class554.field7826, -1)) {
                var11.method3480(false);
                if (var11.field10352 >= 0 && var11.field10357 >= 0 && var11.field10365 < class514.field7179 && var11.field10353 < class456.field6281) {
                    int var12 = 0;
                    if (!var11.field8312) {
                        var12++;
                    }
                    if (var11.field8341 > class245.field3409) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method3470(-1) << 2);
                    if (class6.field54 == 0) {
                        if (var11.field771.field123) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class6.field54 == 1) {
                        if (var11.field771.field123) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field771.field122) {
                        var13 += 1024;
                    } else if (!var11.field771.field138) {
                        var13 += 256;
                    }
                    var11.field8383 = var13 + 1;
                } else {
                    var11.field8383 = -1;
                }
            } else {
                var11.field8383 = -1;
            }
        }
        for (int var6 = 0; var6 < class349.field4441.length; var6++) {
            class729 var7 = class349.field4441[var6];
            if (var7 != null) {
                if (var7.field10216 == 1) {
                    class15 var8 = (class15) class403.field5587.method1381(true, (long) var7.field10224);
                    if (var8 != null) {
                        class55 var9 = var8.field204;
                        if (var9.field8383 >= 0) {
                            var9.field8383 += 2048;
                        }
                    }
                } else if (var7.field10216 == 10) {
                    class655 var10 = class40.field563[var7.field10224];
                    if (var10 != null && class473.field6483 != var10 && var10.field8383 >= 0) {
                        var10.field8383 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1081)
    private final void method2674(int arg0) {
        field6125++;
        if (class213.field3004 == 14) {
            return;
        }
        class245.field3409++;
        if (class245.field3409 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class11.field171 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class304.field3952.setSeed((long) class11.field171);
        }
        if ((class245.field3409 % 50) == 0) {
            class463.field6347 = class321.field4138;
            class441.field6045 = class628.field8976;
            class321.field4138 = 0;
            class628.field8976 = 0;
        }
        this.method2668((byte) 116);
        if (class433.field5948 != null) {
            class433.field5948.method2725(87);
        }
        class419.method2540(31378);
        class17.method83(0);
        class196.field2837.method322(0);
        class93.field1263.method809(-100);
        if (class96.field1401 != null) {
            class96.field1401.method639((int) class224.method1457((byte) -62));
        }
        class314.method1827(-2);
        if (arg0 < 64) {
            return;
        }
        class748.field10427 = 0;
        class457.field6296 = 0;
        for (class243 var3 = class196.field2837.method320(91); var3 != null; var3 = class196.field2837.method320(86)) {
            int var6 = var3.method1543((byte) 109);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1544(-28046);
                if (class612.method3575(125) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class364.method2046(-4507)) {
                        class262.method1624(-127);
                    } else {
                        class294.method1722(0);
                    }
                } else if (class457.field6296 < 128) {
                    class751.field10438[class457.field6296] = var3;
                    class457.field6296++;
                }
            } else if (var6 == 0 && class748.field10427 < 75) {
                class168.field2295[class748.field10427] = var3;
                class748.field10427++;
            }
        }
        class120.field1657 = 0;
        for (class12 var4 = class93.field1263.method802((byte) 0); var4 != null; var4 = class93.field1263.method802((byte) -121)) {
            int var5 = var4.method67((byte) 113);
            if (var5 == -1) {
                class522.field7338.method3116(29066, var4);
            } else if (var5 == 6) {
                class120.field1657 += var4.method62((byte) -49);
            } else if (class392.method2383(0, var5)) {
                class36.field508.method3116(29066, var4);
                if (class36.field508.method3113((byte) -120) > 10) {
                    class36.field508.method3115(true);
                }
            }
        }
        if (class364.method2046(-4507)) {
            class497.method2982(0);
        }
        if (class599.method3533(class213.field3004, 0)) {
            class298.method1757(false);
            class83.method497((byte) 67);
        } else if (class603.method3540(class213.field3004, -5)) {
            class658.method3793((byte) -119);
        }
        if (class66.method432((byte) 118, class213.field3004) && !class603.method3540(class213.field3004, -5)) {
            this.method2678(-64);
            class192.method1274((byte) 112);
            class674.method3865((byte) 5);
        } else if (class275.method1670(-97, class213.field3004) && !class603.method3540(class213.field3004, -5)) {
            this.method2678(-124);
            class674.method3865((byte) 51);
        } else if (class213.field3004 == 12) {
            class674.method3865((byte) 21);
        } else if (class439.method2630(class213.field3004, (byte) -78) && !class603.method3540(class213.field3004, -5)) {
            class183.method1225(-84);
        } else if (class213.field3004 == 13) {
            class674.method3865((byte) 35);
            if (class178.field2525 != -3 && class178.field2525 != 2 && class178.field2525 != 15) {
                class529.method3148(0, false);
            }
        }
        class396.method2417(119, class96.field1401);
        class36.field508.method3115(true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lpaa;)Lrm;", line = 1247)
    public static final class94 method2675(class712 arg0) {
        class94 var1 = (class94) class331.field4247.method1381(true, ((long) arg0.field9998 << 32) + (long) arg0.field10026);
        return var1 == null ? arg0.field10104 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1253)
    public static final void method2676() {
        for (int var0 = 0; var0 < class514.field7179; var0++) {
            int[] var1 = class491.field6605[var0];
            for (int var2 = 0; var2 < class456.field6281; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1271)
    public static final void method2677(int arg0) {
        int var1 = class147.field2030;
        int[] var2 = class351.field4456;
        int var3 = class555.field7830 ? var1 : class676.field9533 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class584 var5;
            if (var4 < var1) {
                var5 = class40.field563[var2[var4]];
            } else {
                var5 = ((class15) class403.field5587.method1381(true, (long) class731.field10231[var4 - var1])).field204;
            }
            if (var5.field9501 == arg0) {
                var5.field8389 = 0;
                if (var5.field8383 < 0) {
                    var5.field8312 = false;
                } else {
                    int var6 = var5.method3470(-1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field9490 & 0x1FF) != 0 || (var5.field9489 & 0x1FF) != 0) {
                            var5.field8312 = false;
                            continue;
                        }
                    } else if ((var5.field9490 & 0x1FF) != 256 || (var5.field9489 & 0x1FF) != 256) {
                        var5.field8312 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field9490 >> 9;
                        int var8 = var5.field9489 >> 9;
                        if (class491.field6605[var7][var8] != var5.field8383) {
                            var5.field8312 = true;
                            continue;
                        }
                        if (class284.field3767[var7][var8] > 1) {
                            var10002 = class284.field3767[var7][var8]--;
                            var5.field8312 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field9490 - var9 >> 9;
                        int var11 = var5.field9489 - var9 >> 9;
                        int var12 = var5.field9490 + var9 >> 9;
                        int var13 = var5.field9489 + var9 >> 9;
                        if (!class36.method250(var5.field8383, var13, var12, true, var11, var10)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class491.field6605[var14][var15] == var5.field8383) {
                                        var10002 = class284.field3767[var14][var15]--;
                                    }
                                }
                            }
                            var5.field8312 = true;
                            continue;
                        }
                    }
                    var5.field8312 = false;
                    var5.field9502 = class438.method2628(var5.field9490, var5.field9501, var5.field9489, (byte) 120);
                    class257.method1603(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1389)
    public final void init() {
        field6128++;
        if (!this.method3971(-1)) {
            return;
        }
        class450.field6183 = new class59();
        class450.field6183.field812 = Integer.parseInt(this.getParameter("worldid"));
        class177.field2403 = new class59();
        class177.field2403.field812 = Integer.parseInt(this.getParameter("lobbyid"));
        class177.field2403.field813 = this.getParameter("lobbyaddress");
        class104.field1501 = new class59();
        class104.field1501.field812 = Integer.parseInt(this.getParameter("demoid"));
        class104.field1501.field813 = this.getParameter("demoaddress");
        class746.field10392 = class707.method3979(0, Integer.parseInt(this.getParameter("modewhere")));
        if (class746.field10392 == class14.field193) {
            class746.field10392 = class363.field4650;
        } else if (!class635.method3698(class746.field10392, true) && class746.field10392 != class456.field6280) {
            class746.field10392 = class456.field6280;
        }
        class455.field6260 = class458.method2749(Integer.parseInt(this.getParameter("modewhat")), (byte) 73);
        if (class455.field6260 != class183.field2653 && class455.field6260 != class20.field246 && class746.field10396 != class455.field6260) {
            class455.field6260 = class746.field10396;
        }
        try {
            class369.field4721 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class369.field4721 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class72.field1014 = true;
        } else {
            class72.field1014 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class668.field9408 = true;
        } else {
            class668.field9408 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class400.field5533 = true;
        } else {
            class400.field5533 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class210.field2984 = class75.field1037;
            } else if (var4.equals("1")) {
                class210.field2984 = class324.field4159;
            } else if (var4.equals("2")) {
                class210.field2984 = class447.field6123;
            } else if (var4.equals("3")) {
                class210.field2984 = class355.field4560;
            }
        }
        try {
            class711.field9915 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class711.field9915 = 0;
        }
        class638.field9074 = this.getParameter("quiturl");
        class686.field9626 = this.getParameter("settings");
        if (class686.field9626 == null) {
            class686.field9626 = "";
        }
        class624.field8919 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class382.field5363 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class382.field5363 = 0;
            }
        }
        class225.field3153 = Integer.parseInt(this.getParameter("colourid"));
        if (class225.field3153 < 0 || class408.field5670.length <= class225.field3153) {
            class225.field3153 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class159.field2149 = true;
            class290.field3796 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class64.field888 = true;
        }
        class617.field8784 = this.getParameter("sskey");
        if (class617.field8784 != null && class617.field8784.length() < 2) {
            class617.field8784 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class274.field3674 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class59.field814 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class471.field6468 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class485.field6554 = this.getParameter("additionalInfo");
        if (class485.field6554 != null && class485.field6554.length() > 50) {
            class485.field6554 = null;
        }
        if (class75.field1037 == class210.field2984) {
            class95.field1381 = 765;
            class631.field8989 = 503;
        } else if (class324.field4159 == class210.field2984) {
            class631.field8989 = 480;
            class95.field1381 = 640;
        }
        class306.field3966 = this;
        this.method3966(631, class631.field8989, class210.field2984.field1661, class455.field6260.method3524(-106) + 32, 37, class95.field1381, -4);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1550)
    private final void method2678(int arg0) {
        if (class213.field3004 == 7 && class213.field3003 == 0) {
            if (class658.field9294 > 1) {
                class658.field9294--;
                class269.field3632 = class564.field8023;
            }
            if (!class484.field6549) {
                class748.method4156(2);
            }
            for (int var2 = 0; var2 < 100 && class83.method495((byte) -13); var2++) {
            }
        }
        field6134++;
        class284.field3763++;
        class38.method265(-1, -1, null, (byte) -3);
        class172.method1073(-1, null, -1, (byte) 46);
        class517.method3075(4084);
        class564.field8023++;
        if (arg0 >= -23) {
            method2679();
        }
        for (int var3 = 0; var3 < class287.field3776; var3++) {
            class55 var4 = class312.field4003[var3].field204;
            if (var4 != null) {
                byte var5 = var4.field771.field135;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method3470(-1);
                    if ((var5 & 0x2) != 0 && var4.field8419 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field8421[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class514.field7179 - var6 - 1 < var9) {
                                var9 = class514.field7179 - var6 - 1;
                            }
                            int var10 = var4.field8414[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class456.field6281 - var6 - 1 < var10) {
                                var10 = class456.field6281 - var6 - 1;
                            }
                            int var11 = class49.method335(-1, (byte) -119, class300.field3920, class745.field10380, var6, var9, true, class464.field6351[var4.field9501], 0, var4.field8421[0], var6, var6, var10, var4.field8414[0], 0);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field8421[var12] = class745.field10380[var11 - var12 - 1];
                                    var4.field8414[var12] = class300.field3920[var11 - var12 - 1];
                                    var4.field8420[var12] = 1;
                                }
                                var4.field8419 = var11;
                            }
                        }
                    }
                    class749.method4164(-18, var4, true);
                    int var13 = class641.method3722((byte) 120, var4);
                    class614.method3598(var4, 0);
                    class389.method2363(var13, -108, class118.field1642, var4, class749.field10431);
                    class423.method2580((byte) -124, var4, class749.field10431);
                    class223.method1454((byte) 62, var4);
                }
            }
        }
        if (class213.field3003 == 0 && class95.field1393 == 0) {
            if (class665.field9377 == 2) {
                class20.method97(-30512);
            } else {
                class413.method2518(89);
            }
            if ((class24.field266 >> 9) < 14 || class514.field7179 - 14 <= class24.field266 >> 9 || class235.field3250 >> 9 < 14 || (class235.field3250 >> 9) >= (class456.field6281 - 14)) {
                class449.method2699((byte) -91);
            }
        }
        while (true) {
            class700 var14;
            class712 var15;
            class712 var16;
            do {
                var14 = (class700) class447.field6121.method3115(true);
                if (var14 == null) {
                    while (true) {
                        class700 var17;
                        class712 var18;
                        class712 var19;
                        do {
                            var17 = (class700) class323.field4155.method3115(true);
                            if (var17 == null) {
                                while (true) {
                                    class700 var20;
                                    class712 var21;
                                    class712 var22;
                                    do {
                                        var20 = (class700) class14.field200.method3115(true);
                                        if (var20 == null) {
                                            if (class740.field10315 != null) {
                                                class633.method3679((byte) -104);
                                            }
                                            if ((class245.field3409 % 1500) == 0) {
                                                class615.method3613(1);
                                            }
                                            if (class213.field3004 == 7 && class213.field3003 == 0) {
                                                class643.method3731(-761);
                                            }
                                            class753.method4171((byte) -106);
                                            if (class97.field1411 && class703.field9781 < (class224.method1457((byte) -62) - 60000L)) {
                                                class244.method1551(-94);
                                            }
                                            for (class101 var23 = (class101) class367.field4709.method1945(false); var23 != null; var23 = (class101) class367.field4709.method1944(9408)) {
                                                if ((long) var23.field1447 < class224.method1457((byte) -62) / 1000L - 5L) {
                                                    if (var23.field1453 > 0) {
                                                        class441.method2638("", 0, (byte) 17, "", var23.field1448 + class138.field1855.method891(-2041650704, class369.field4721), "", 5);
                                                    }
                                                    if (var23.field1453 == 0) {
                                                        class441.method2638("", 0, (byte) 17, "", var23.field1448 + class138.field1856.method891(-2041650704, class369.field4721), "", 5);
                                                    }
                                                    var23.method1(-101);
                                                }
                                            }
                                            if (class213.field3004 == 7 && class213.field3003 == 0) {
                                                if (class275.field3699 == null) {
                                                    class529.method3148(0, false);
                                                    return;
                                                }
                                                class585.field8425++;
                                                if (class585.field8425 > 50) {
                                                    class471.field6441++;
                                                    class120 var24 = class292.method1716(class608.field8668, true, class471.field6464);
                                                    class471.method2805(92, var24);
                                                }
                                                try {
                                                    class458.method2748(true);
                                                    return;
                                                } catch (IOException var25) {
                                                    class529.method3148(0, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field9745;
                                        if (var21.field10026 < 0) {
                                            break;
                                        }
                                        var22 = class733.method4073(true, var21.field10030);
                                    } while (var22 == null || var22.field9981 == null || var21.field10026 >= var22.field9981.length || var22.field9981[var21.field10026] != var21);
                                    class318.method1840(var20);
                                }
                            }
                            var18 = var17.field9745;
                            if (var18.field10026 < 0) {
                                break;
                            }
                            var19 = class733.method4073(true, var18.field10030);
                        } while (var19 == null || var19.field9981 == null || var18.field10026 >= var19.field9981.length || var19.field9981[var18.field10026] != var18);
                        class318.method1840(var17);
                    }
                }
                var15 = var14.field9745;
                if (var15.field10026 < 0) {
                    break;
                }
                var16 = class733.method4073(true, var15.field10030);
            } while (var16 == null || var16.field9981 == null || var16.field9981.length <= var15.field10026 || var16.field9981[var15.field10026] != var15);
            class318.method1840(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1829)
    public static final void method2679() {
        class314.field4056 = 0;
        for (int var0 = 0; var0 < class676.field9533; var0++) {
            class55 var1 = ((class15) class403.field5587.method1381(true, (long) class731.field10231[var0])).field204;
            if (var1.field8312 && var1.method371(-7508) != -1) {
                int var2 = (var1.method3470(-1) - 1) * 256 + 252;
                int var3 = var1.field9490 - var2 >> 9;
                int var4 = var1.field9489 - var2 >> 9;
                class584 var5 = class577.method3448(var4, var3, var1.field9501, -18721);
                if (var5 != null) {
                    int var6 = var5.field8344;
                    if (var5 instanceof class55) {
                        var6 += 2048;
                    }
                    if (var5.field8389 == 0 && var5.method371(-7508) != -1) {
                        class32.field481[class314.field4056] = var6;
                        class449.field6171[class314.field4056] = var6;
                        class314.field4056++;
                        var5.field8389++;
                    }
                    class32.field481[class314.field4056] = var6;
                    class449.field6171[class314.field4056] = var1.field8344 + 2048;
                    class314.field4056++;
                    var5.field8389++;
                }
            }
        }
        class667.method3821(class314.field4056 - 1, class449.field6171, 21678, class32.field481, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILep;I)Ldd;", line = 1878)
    public static final class146 method2680(int arg0, int arg1, int arg2, int arg3, class371 arg4, int arg5) {
        if (arg5 != -1) {
            method2680(-73, 114, 111, 107, null, -64);
        }
        field6124++;
        if (!arg4.field4991 && (!class447.method2664(~arg5, arg0) || !class447.method2664(~arg5, arg2))) {
            return arg4.field5001 ? new class146(arg4, 34037, arg1, arg3, arg0, arg2, true) : new class146(arg4, arg1, arg3, arg0, arg2, class670.method3834(arg0, arg5 + 23539), class670.method3834(arg2, 23538), true);
        } else {
            return new class146(arg4, 3553, arg1, arg3, arg0, arg2, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1898)
    private final void method2681(int arg0) {
        field6138++;
        if (class213.field3004 == 14) {
            return;
        }
        long var2 = class661.method3802(4540) / 1000000L - class327.field4207;
        class327.field4207 = class661.method3802(4540) / 1000000L;
        boolean var4 = class178.method1125(21618);
        if (var4 && class105.field1538 && class510.field7114 != null) {
            class510.field7114.method3149((byte) -20);
        }
        if (class139.method894(class213.field3004, (byte) 86)) {
            if (class395.field5493 != 0L && class395.field5493 < class224.method1457((byte) -62)) {
                class518.method3079(false, class150.field2078, class314.field4058, true, class615.method3609((byte) 98));
            } else if (!class96.field1401.method2214() && class626.field8944) {
                class148.method954(-120);
            }
        }
        if (class455.field6257 == null) {
            Container var5;
            if (class244.field3384 != null) {
                var5 = class244.field3384;
            } else if (class622.field8847 == null) {
                var5 = class128.field1752;
            } else {
                var5 = class622.field8847;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class244.field3384 == var5) {
                Insets var8 = class244.field3384.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class389.field5428 != var6 || class611.field8696 != var7 || class295.field3852) {
                if (class96.field1401 == null || class96.field1401.method2099()) {
                    class611.method3571(true);
                } else {
                    class611.field8696 = var7;
                    class389.field5428 = var6;
                }
                class395.field5493 = class224.method1457((byte) -62) + 500L;
                class295.field3852 = false;
            }
        }
        if (class455.field6257 != null && !class614.field8741 && class139.method894(class213.field3004, (byte) 71)) {
            class518.method3079(false, -1, -1, true, class674.field9500.field5133.method1962(0));
        }
        boolean var9 = false;
        if (class686.field9628) {
            var9 = true;
            class686.field9628 = false;
        }
        if (var9) {
            class183.method1221(0);
        }
        if (class96.field1401 != null && class96.field1401.method2214() || class615.method3609((byte) 98) != 1) {
            class330.method1918(7);
        }
        if (class599.method3533(class213.field3004, 0)) {
            class534.method3184(var9, true);
        } else if (class512.method3058(class213.field3004, (byte) -45)) {
            class67.method438((byte) 123);
        } else if (class707.method3978(class213.field3004, (byte) -73)) {
            class67.method438((byte) -31);
        } else if (class603.method3540(class213.field3004, -5)) {
            if (class133.field1795 == 1) {
                if (class711.field9925 > class575.field8122) {
                    class575.field8122 = class711.field9925;
                }
                int var10 = (class575.field8122 - class711.field9925) * 50 / class575.field8122;
                class665.method3817(class442.field6064, -125, class138.field1848.method891(-2041650704, class369.field4721) + "<br>(" + var10 + "%)", class339.field4345, true, class96.field1401);
            } else if (class133.field1795 == 2) {
                if (class369.field4722 > class24.field270) {
                    class24.field270 = class369.field4722;
                }
                int var11 = (class24.field270 - class369.field4722) * 50 / class24.field270 + 50;
                class665.method3817(class442.field6064, 49, class138.field1848.method891(arg0 ^ 0x864ECE4A, class369.field4721) + "<br>(" + var11 + "%)", class339.field4345, true, class96.field1401);
            } else {
                class665.method3817(class442.field6064, 78, class138.field1848.method891(-2041650704, class369.field4721), class339.field4345, true, class96.field1401);
            }
        } else if (class213.field3004 == 10) {
            class224.method1456(var2, 0);
        } else if (class213.field3004 == 13) {
            class665.method3817(class442.field6064, arg0 ^ 0xFFFFD03F, class138.field1850.method891(-2041650704, class369.field4721) + "<br>" + class138.field1851.method891(-2041650704, class369.field4721), class339.field4345, false, class96.field1401);
        }
        if (class575.field8125 == 3) {
            for (int var12 = 0; var12 < class752.field10450; var12++) {
                Rectangle var13 = class391.field5453[var12];
                if (class513.field7167[var12]) {
                    class96.field1401.method3263(var13.x, -65281, (byte) -68, var13.height, var13.y, var13.width);
                } else if (class523.field7346[var12]) {
                    class96.field1401.method3263(var13.x, -65536, (byte) -43, var13.height, var13.y, var13.width);
                } else {
                    class96.field1401.method3263(var13.x, -16711936, (byte) -58, var13.height, var13.y, var13.width);
                }
            }
        }
        if (class364.method2046(-4507)) {
            class646.method3746(class96.field1401, -16);
        }
        if (class379.field5339.field8720 && class139.method894(class213.field3004, (byte) 126) && class575.field8125 == 0 && class615.method3609((byte) 98) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class752.field10450; var17++) {
                if (class523.field7346[var17]) {
                    class523.field7346[var17] = false;
                    class747.field10401[var16++] = class391.field5453[var17];
                }
            }
            try {
                if (class264.field3595) {
                    class92.method551(var16, class747.field10401, false);
                } else {
                    class96.field1401.method3254(class747.field10401, var16, (byte) 98);
                }
            } catch (class425 var19) {
            }
        } else if (!class599.method3533(class213.field3004, arg0 - 12218)) {
            for (int var14 = 0; var14 < class752.field10450; var14++) {
                class523.field7346[var14] = false;
            }
            try {
                if (class264.field3595) {
                    class529.method3147(false);
                } else {
                    class96.field1401.method3262(0);
                }
            } catch (class425 var20) {
                class233.method1495((byte) -81, var20, var20.getMessage() + " (Recovered) " + this.method2686((byte) 114));
                class736.method4088((byte) 122, false, 0);
            }
        }
        class164.method1022((byte) 32);
        int var18 = class674.field9500.field5153.method3270(arg0 ^ arg0);
        if (var18 == 0) {
            class740.method4124(15L, 73);
        } else if (var18 == 1) {
            class740.method4124(10L, arg0 ^ 0x2FF5);
        } else if (var18 == 2) {
            class740.method4124(5L, 72);
        } else if (var18 == 3) {
            class740.method4124(2L, arg0 ^ 0x2FC7);
        }
        if (class594.field8565) {
            class423.method2581(arg0 ^ 0xFFFFD033);
        }
        if (class674.field9500.field5164.method3935(0) == 1 && class213.field3004 == 3 && class312.field4004 != -1) {
            class674.field9500.method2250((byte) 114, 0, class674.field9500.field5164);
            class199.method1350(-26159);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lpaa;IIIIIIIIIII)V", line = 2158)
    public static final void method2682(class712[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class712 var13 = arg0[var12];
            if (var13 != null && var13.field10030 == arg1) {
                int var14 = var13.field10048 + arg6;
                int var15 = var13.field10013 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field10039 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field9966 + var14;
                    int var21 = var13.field10011 + var15;
                    if (var13.field10039 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field10039 == 0 || var13.field10012 || method2675(var13).field1372 != 0 || class316.field4062 == var13 || class59.field811 == var13.field9930 || class646.field9162 == var13.field9930) {
                    if (!method2685(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class264.field3595) {
                            var22 = class468.method2788(false);
                            var23 = class142.method934((byte) -88);
                        }
                        if (class740.field10315 == var13 && class327.method1911(class740.field10315, 88) != null) {
                            class218.field3086 = true;
                            class659.field9306 = var14;
                            class42.field593 = var15;
                        }
                        if (var13.field9975 || var16 < var18 && var17 < var19) {
                            if (var13.field10081 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class700 var24 = (class700) class14.field200.method3118((byte) 73); var24 != null; var24 = (class700) class14.field200.method3111(127)) {
                                    if (var24.field9748) {
                                        var24.method3065(-17363);
                                        var24.field9745.field10068 = false;
                                    }
                                }
                                if (class223.field3142 == 0) {
                                    class740.field10315 = null;
                                    class316.field4062 = null;
                                }
                                class392.field5462 = 0;
                                class701.field9770 = false;
                                class719.field10152 = false;
                                if (!class484.field6549) {
                                    class748.method4156(2);
                                }
                            }
                            boolean var25;
                            if (class93.field1263.method805(0) + var22 >= var16 && class93.field1263.method806(0) + var23 >= var17 && class93.field1263.method805(0) + var22 < var18 && class93.field1263.method806(0) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class13.field187 && var25) {
                                if (var13.field9967 >= 0) {
                                    class565.field8033 = var13.field9967;
                                } else if (var13.field10081) {
                                    class565.field8033 = -1;
                                }
                            }
                            if (!class484.field6549 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class23.method132(arg10 - var14, arg11 - var15, var13, 0);
                            }
                            boolean var26 = false;
                            if (class93.field1263.method815(-123) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class12 var28 = (class12) class36.field508.method3118((byte) 73);
                            if (var28 != null && var28.method67((byte) -71) == 0 && var28.method63(5245) + var22 >= var16 && var28.method64(-1) + var23 >= var17 && var28.method63(5245) + var22 < var18 && var28.method64(-1) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field10098 != null && !class364.method2046(-4507)) {
                                for (int var29 = 0; var29 < var13.field10098.length; var29++) {
                                    if (class196.field2837.method315(123, var13.field10098[var29])) {
                                        if (var13.field9931 == null || class245.field3409 >= var13.field9931[var29]) {
                                            byte var30 = var13.field9989[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class196.field2837.method315(-79, 86) && !class196.field2837.method315(-95, 82) && !class196.field2837.method315(-16, 81)) && ((var30 & 0x2) == 0 || class196.field2837.method315(-65, 86)) && ((var30 & 0x1) == 0 || class196.field2837.method315(-125, 82)) && ((var30 & 0x4) == 0 || class196.field2837.method315(89, 81))) {
                                                if (var29 < 10) {
                                                    class140.method907(-1, "", var29 + 1, (byte) 119, var13.field9998);
                                                } else if (var29 == 10) {
                                                    class254.method1598((byte) 126);
                                                    class94 var31 = method2675(var13);
                                                    class445.method2655(var31.method647((byte) -125), true, var13, var31.field1376);
                                                    class215.field3044 = class392.method2389(var13, 15269);
                                                    if (class215.field3044 == null) {
                                                        class215.field3044 = "Null";
                                                    }
                                                    class146.field2027 = var13.field9941 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field10083[var29];
                                                if (var13.field9931 == null) {
                                                    var13.field9931 = new int[var13.field10098.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field9931[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field9931[var29] = class245.field3409 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field9931 != null) {
                                        var13.field9931[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class366.method2054(var13, true, var22 + var28.method63(5245) - var14, var23 + var28.method64(-1) - var15);
                            }
                            if (class740.field10315 != null && class740.field10315 != var13 && var25 && method2675(var13).method648(2111642)) {
                                class692.field9684 = var13;
                            }
                            if (class316.field4062 == var13) {
                                class441.field6047 = true;
                                class94.field1375 = var14;
                                class416.field5798 = var15;
                            }
                            if (var13.field10012 || var13.field9930 != 0) {
                                if (var25 && class120.field1657 != 0 && var13.field10023 != null) {
                                    class700 var33 = new class700();
                                    var33.field9748 = true;
                                    var33.field9745 = var13;
                                    var33.field9758 = class120.field1657;
                                    var33.field9757 = var13.field10023;
                                    class14.field200.method3116(29066, var33);
                                }
                                if (class740.field10315 != null || class484.field6549 || class538.field7526 != var13.field9930 && class392.field5462 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field9930 != 0) {
                                    if (class224.field3145 == var13.field9930 || class213.field3006 == var13.field9930) {
                                        class713.field10107 = var13;
                                        if (class67.field932 != null) {
                                            class67.field932.method3553(class96.field1401, var13.field10011, false);
                                        }
                                        if (class224.field3145 == var13.field9930) {
                                            if (class484.field6549 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class591.method3508(arg9, arg8, class96.field1401, (byte) -104);
                                            class656 var34 = (class656) class734.field10265.method1945(false);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field9284 && arg10 < var34.field9286 && arg11 >= var34.field9287 && arg11 < var34.field9285) {
                                                    class748.method4156(2);
                                                    class264.method1630(var34.field9288, (byte) -19);
                                                }
                                                var34 = (class656) class734.field10265.method1944(9408);
                                            }
                                        }
                                    }
                                    if (class59.field811 == var13.field9930) {
                                        if (var13.method3996(-70, class96.field1401) == null || class486.field6561 != 0 && class486.field6561 != 3 || class484.field6549 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field9983[var36];
                                        if (var35 < var37 || var35 > var13.field10019[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field9966 / 2;
                                        int var39 = var36 - var13.field10011 / 2;
                                        int var40;
                                        if (class665.field9377 == 4) {
                                            var40 = (int) class403.field5597 & 0x3FFF;
                                        } else {
                                            var40 = (int) class403.field5597 + class732.field10234 & 0x3FFF;
                                        }
                                        int var41 = class231.field3217[var40];
                                        int var42 = class231.field3218[var40];
                                        if (class665.field9377 != 4) {
                                            var41 = (class592.field8541 + 256) * var41 >> 8;
                                            var42 = (class592.field8541 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class665.field9377 == 4) {
                                            var45 = (class264.field3603 >> 9) + (var43 >> 2);
                                            var46 = (class668.field9412 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class473.field6483.method3470(-1) - 1) * 256;
                                            var45 = (class473.field6483.field9490 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class473.field6483.field9489 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class13.field187 && (class626.field8934 & 0x40) != 0) {
                                            class712 var48 = class654.method3778((byte) -52, class480.field6527, class724.field10190);
                                            if (var48 == null) {
                                                class254.method1598((byte) 109);
                                            } else {
                                                class370.method2059(true, var45, 28, var13.field9953, class101.field1454, false, var46, (long) (var13.field10026 << 0 | var13.field9998), class215.field3044, 1L, 4, true, " ->");
                                            }
                                            continue;
                                        }
                                        if (class324.field4159 == class210.field2984) {
                                            class370.method2059(true, var45, 28, -1, -1, false, var46, 0L, class138.field1863.method891(-2041650704, class369.field4721), 1L, 48, true, "");
                                        }
                                        class370.method2059(true, var45, 28, -1, class401.field5551, false, var46, 0L, class511.field7117, 1L, 12, true, "");
                                        continue;
                                    }
                                    if (class538.field7526 == var13.field9930) {
                                        class355.field4559 = var13;
                                        if (var25) {
                                            class701.field9770 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method63(5245) - var14 - var13.field9966 / 2) * 2.0D / (double) class531.field7430);
                                            int var50 = (int) (-((double) (var23 + var28.method64(-1) - var15 - var13.field10011 / 2) * 2.0D / (double) class531.field7430));
                                            int var51 = class538.field7524 + var49 + class531.field7447;
                                            int var52 = class29.field372 + var50 + class531.field7452;
                                            class520 var53 = class63.method407(2793);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method3090(var52, 1062, var54, var51);
                                            if (var54 != null) {
                                                if (class196.field2837.method315(83, 82) && class467.field6375 > 0) {
                                                    class482.method2839(-4118, var54[0], var54[1], var54[2]);
                                                    continue;
                                                }
                                                class719.field10152 = true;
                                                class274.field3687 = var54[0];
                                                class145.field2001 = var54[1];
                                                class337.field4335 = var54[2];
                                            }
                                            class392.field5462 = 1;
                                            class79.field1069 = false;
                                            class281.field3737 = class93.field1263.method805(0);
                                            class138.field1900 = class93.field1263.method806(0);
                                            continue;
                                        }
                                        if (var26 && class392.field5462 > 0) {
                                            if (class392.field5462 == 1 && (class281.field3737 != class93.field1263.method805(0) || class138.field1900 != class93.field1263.method806(0))) {
                                                class283.field3751 = class538.field7524;
                                                class488.field6582 = class29.field372;
                                                class392.field5462 = 2;
                                            }
                                            if (class392.field5462 == 2) {
                                                class79.field1069 = true;
                                                class544.method3234(-1, class283.field3751 + (int) ((double) (class281.field3737 - class93.field1263.method805(0)) * 2.0D / (double) class531.field7438));
                                                class608.method3555(class488.field6582 - (int) ((double) (class138.field1900 - class93.field1263.method806(0)) * 2.0D / (double) class531.field7438), false);
                                            }
                                            continue;
                                        }
                                        if (class392.field5462 > 0 && !class79.field1069) {
                                            if ((class536.field7507 == 1 || class647.method3753(1002)) && class605.field8642 > 2) {
                                                class510.method3042(class281.field3737, class138.field1900, (byte) -93);
                                            } else if (class4.method18(-3427)) {
                                                class510.method3042(class281.field3737, class138.field1900, (byte) -85);
                                            }
                                        }
                                        class392.field5462 = 0;
                                        continue;
                                    }
                                    if (class409.field5689 == var13.field9930) {
                                        if (var26) {
                                            class99.method668(-18747, var13.field10011, var23 + class93.field1263.method806(0) - var15, var22 + class93.field1263.method805(0) - var14, var13.field9966);
                                        }
                                        continue;
                                    }
                                    if (class646.field9162 == var13.field9930) {
                                        class172.method1073(var14, var13, var15, (byte) 46);
                                        continue;
                                    }
                                }
                                if (!var13.field10080 && var27) {
                                    var13.field10080 = true;
                                    if (var13.field10044 != null) {
                                        class700 var55 = new class700();
                                        var55.field9748 = true;
                                        var55.field9745 = var13;
                                        var55.field9747 = var22 + var28.method63(5245) - var14;
                                        var55.field9758 = var23 + var28.method64(-1) - var15;
                                        var55.field9757 = var13.field10044;
                                        class14.field200.method3116(29066, var55);
                                    }
                                }
                                if (var13.field10080 && var26 && var13.field10089 != null) {
                                    class700 var56 = new class700();
                                    var56.field9748 = true;
                                    var56.field9745 = var13;
                                    var56.field9747 = var22 + class93.field1263.method805(0) - var14;
                                    var56.field9758 = var23 + class93.field1263.method806(0) - var15;
                                    var56.field9757 = var13.field10089;
                                    class14.field200.method3116(29066, var56);
                                }
                                if (var13.field10080 && !var26) {
                                    var13.field10080 = false;
                                    if (var13.field9972 != null) {
                                        class700 var57 = new class700();
                                        var57.field9748 = true;
                                        var57.field9745 = var13;
                                        var57.field9747 = var22 + class93.field1263.method805(0) - var14;
                                        var57.field9758 = var23 + class93.field1263.method806(0) - var15;
                                        var57.field9757 = var13.field9972;
                                        class323.field4155.method3116(29066, var57);
                                    }
                                }
                                if (var26 && var13.field9986 != null) {
                                    class700 var58 = new class700();
                                    var58.field9748 = true;
                                    var58.field9745 = var13;
                                    var58.field9747 = var22 + class93.field1263.method805(0) - var14;
                                    var58.field9758 = var23 + class93.field1263.method806(0) - var15;
                                    var58.field9757 = var13.field9986;
                                    class14.field200.method3116(29066, var58);
                                }
                                if (!var13.field10068 && var25) {
                                    var13.field10068 = true;
                                    if (var13.field10006 != null) {
                                        class700 var59 = new class700();
                                        var59.field9748 = true;
                                        var59.field9745 = var13;
                                        var59.field9747 = var22 + class93.field1263.method805(0) - var14;
                                        var59.field9758 = var23 + class93.field1263.method806(0) - var15;
                                        var59.field9757 = var13.field10006;
                                        class14.field200.method3116(29066, var59);
                                    }
                                }
                                if (var13.field10068 && var25 && var13.field9939 != null) {
                                    class700 var60 = new class700();
                                    var60.field9748 = true;
                                    var60.field9745 = var13;
                                    var60.field9747 = var22 + class93.field1263.method805(0) - var14;
                                    var60.field9758 = var23 + class93.field1263.method806(0) - var15;
                                    var60.field9757 = var13.field9939;
                                    class14.field200.method3116(29066, var60);
                                }
                                if (var13.field10068 && !var25) {
                                    var13.field10068 = false;
                                    if (var13.field9936 != null) {
                                        class700 var61 = new class700();
                                        var61.field9748 = true;
                                        var61.field9745 = var13;
                                        var61.field9747 = var22 + class93.field1263.method805(0) - var14;
                                        var61.field9758 = var23 + class93.field1263.method806(0) - var15;
                                        var61.field9757 = var13.field9936;
                                        class323.field4155.method3116(29066, var61);
                                    }
                                }
                                if (var13.field10034 != null) {
                                    class700 var62 = new class700();
                                    var62.field9745 = var13;
                                    var62.field9757 = var13.field10034;
                                    class447.field6121.method3116(29066, var62);
                                }
                                if (var13.field10056 != null && class754.field10476 > var13.field10078) {
                                    if (var13.field9980 == null || class754.field10476 - var13.field10078 > 32) {
                                        class700 var67 = new class700();
                                        var67.field9745 = var13;
                                        var67.field9757 = var13.field10056;
                                        class14.field200.method3116(29066, var67);
                                    } else {
                                        label699: for (int var63 = var13.field10078; var63 < class754.field10476; var63++) {
                                            int var64 = class90.field1219[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field9980.length; var65++) {
                                                if (var13.field9980[var65] == var64) {
                                                    class700 var66 = new class700();
                                                    var66.field9745 = var13;
                                                    var66.field9757 = var13.field10056;
                                                    class14.field200.method3116(29066, var66);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field10078 = class754.field10476;
                                }
                                if (var13.field9988 != null && class401.field5560 > var13.field9985) {
                                    if (var13.field10092 == null || class401.field5560 - var13.field9985 > 32) {
                                        class700 var72 = new class700();
                                        var72.field9745 = var13;
                                        var72.field9757 = var13.field9988;
                                        class14.field200.method3116(29066, var72);
                                    } else {
                                        label675: for (int var68 = var13.field9985; var68 < class401.field5560; var68++) {
                                            int var69 = class127.field1751[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field10092.length; var70++) {
                                                if (var13.field10092[var70] == var69) {
                                                    class700 var71 = new class700();
                                                    var71.field9745 = var13;
                                                    var71.field9757 = var13.field9988;
                                                    class14.field200.method3116(29066, var71);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9985 = class401.field5560;
                                }
                                if (var13.field9933 != null && class151.field2087 > var13.field10090) {
                                    if (var13.field10032 == null || class151.field2087 - var13.field10090 > 32) {
                                        class700 var77 = new class700();
                                        var77.field9745 = var13;
                                        var77.field9757 = var13.field9933;
                                        class14.field200.method3116(29066, var77);
                                    } else {
                                        label651: for (int var73 = var13.field10090; var73 < class151.field2087; var73++) {
                                            int var74 = class718.field10147[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field10032.length; var75++) {
                                                if (var13.field10032[var75] == var74) {
                                                    class700 var76 = new class700();
                                                    var76.field9745 = var13;
                                                    var76.field9757 = var13.field9933;
                                                    class14.field200.method3116(29066, var76);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field10090 = class151.field2087;
                                }
                                if (var13.field10052 != null && class663.field9360 > var13.field10073) {
                                    if (var13.field9932 == null || class663.field9360 - var13.field10073 > 32) {
                                        class700 var82 = new class700();
                                        var82.field9745 = var13;
                                        var82.field9757 = var13.field10052;
                                        class14.field200.method3116(29066, var82);
                                    } else {
                                        label627: for (int var78 = var13.field10073; var78 < class663.field9360; var78++) {
                                            int var79 = class712.field10100[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field9932.length; var80++) {
                                                if (var13.field9932[var80] == var79) {
                                                    class700 var81 = new class700();
                                                    var81.field9745 = var13;
                                                    var81.field9757 = var13.field10052;
                                                    class14.field200.method3116(29066, var81);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field10073 = class663.field9360;
                                }
                                if (var13.field9991 != null && class404.field5616 > var13.field9995) {
                                    if (var13.field10033 == null || class404.field5616 - var13.field9995 > 32) {
                                        class700 var87 = new class700();
                                        var87.field9745 = var13;
                                        var87.field9757 = var13.field9991;
                                        class14.field200.method3116(29066, var87);
                                    } else {
                                        label603: for (int var83 = var13.field9995; var83 < class404.field5616; var83++) {
                                            int var84 = class491.field6607[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field10033.length; var85++) {
                                                if (var13.field10033[var85] == var84) {
                                                    class700 var86 = new class700();
                                                    var86.field9745 = var13;
                                                    var86.field9757 = var13.field9991;
                                                    class14.field200.method3116(29066, var86);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9995 = class404.field5616;
                                }
                                if (class31.field477 > var13.field10101 && var13.field10031 != null) {
                                    class700 var88 = new class700();
                                    var88.field9745 = var13;
                                    var88.field9757 = var13.field10031;
                                    class14.field200.method3116(29066, var88);
                                }
                                if (class666.field9387 > var13.field10101 && var13.field10010 != null) {
                                    class700 var89 = new class700();
                                    var89.field9745 = var13;
                                    var89.field9757 = var13.field10010;
                                    class14.field200.method3116(29066, var89);
                                }
                                if (class724.field10195 > var13.field10101 && var13.field10018 != null) {
                                    class700 var90 = new class700();
                                    var90.field9745 = var13;
                                    var90.field9757 = var13.field10018;
                                    class14.field200.method3116(29066, var90);
                                }
                                if (class144.field1991 > var13.field10101 && var13.field9968 != null) {
                                    class700 var91 = new class700();
                                    var91.field9745 = var13;
                                    var91.field9757 = var13.field9968;
                                    class14.field200.method3116(29066, var91);
                                }
                                if (class269.field3632 > var13.field10101 && var13.field10051 != null) {
                                    class700 var92 = new class700();
                                    var92.field9745 = var13;
                                    var92.field9757 = var13.field10051;
                                    class14.field200.method3116(29066, var92);
                                }
                                var13.field10101 = class564.field8023;
                                if (var13.field9969 != null) {
                                    for (int var93 = 0; var93 < class457.field6296; var93++) {
                                        class700 var94 = new class700();
                                        var94.field9745 = var13;
                                        var94.field9753 = class751.field10438[var93].method1541(-26820);
                                        var94.field9759 = class751.field10438[var93].method1544(-28046);
                                        var94.field9757 = var13.field9969;
                                        class14.field200.method3116(29066, var94);
                                    }
                                }
                                if (class698.field9719 && var13.field9962 != null) {
                                    class700 var95 = new class700();
                                    var95.field9745 = var13;
                                    var95.field9757 = var13.field9962;
                                    class14.field200.method3116(29066, var95);
                                }
                            }
                            if (var13.field10039 == 5 && var13.field10094 != -1) {
                                var13.method4004(class533.field7474, 123, class128.field1758).method3553(class96.field1401, var13.field10011, false);
                            }
                            class150.method964(var13, -128);
                            if (var13.field10039 == 0) {
                                method2682(arg0, var13.field9998, var16, var17, var18, var19, var14 - var13.field9971, var15 - var13.field10014, arg8, arg9, arg10, arg11);
                                if (var13.field9981 != null) {
                                    method2682(var13.field9981, var13.field9998, var16, var17, var18, var19, var14 - var13.field9971, var15 - var13.field10014, arg8, arg9, arg10, arg11);
                                }
                                class14 var96 = (class14) class426.field5894.method1381(true, (long) var13.field9998);
                                if (var96 != null) {
                                    if (class75.field1037 == class210.field2984 && var96.field195 == 0 && !class484.field6549 && var25 && !class399.field5526) {
                                        class748.method4156(2);
                                    }
                                    class15.method79(arg10, var16, var17, var18, -1, var19, arg8, var96.field194, arg11, var15, arg9, var14);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class150.method964(var13, 13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lpaa;)Lpaa;", line = 3070)
    public static final class712 method2683(class712 arg0) {
        int var1 = method2675(arg0).method646((byte) -122);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class733.method4073(true, arg0.field10030);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 3094)
    public final void method2684(byte arg0) {
        if (arg0 != 19) {
            return;
        }
        field6129++;
        if (class674.field9500.field5158.method1006(0) != 2) {
            this.method2674(arg0 + 47);
            return;
        }
        try {
            this.method2674(arg0 + 74);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class233.method1495((byte) -109, var5, var5.getMessage() + " (Recovered) " + this.method2686((byte) -14));
            class736.method4088((byte) 122, false, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3126)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class719.method4037("Argument count", -20702);
            }
            class450.field6183 = new class59();
            class450.field6183.field812 = Integer.parseInt(arg0[0]);
            class177.field2403 = new class59();
            class177.field2403.field812 = Integer.parseInt(arg0[1]);
            class104.field1501 = new class59();
            class104.field1501.field812 = Integer.parseInt(arg0[2]);
            class746.field10392 = class14.field193;
            if (arg0[3].equals("live")) {
                class455.field6260 = class746.field10396;
            } else if (arg0[3].equals("rc")) {
                class455.field6260 = class20.field246;
            } else if (arg0[3].equals("wip")) {
                class455.field6260 = class183.field2653;
            } else {
                class719.method4037("modewhat", -20702);
            }
            class369.field4721 = class757.method4208(30259, arg0[4]);
            if (class369.field4721 == -1) {
                if (arg0[4].equals("english")) {
                    class369.field4721 = 0;
                } else if (arg0[4].equals("german")) {
                    class369.field4721 = 1;
                } else {
                    class719.method4037("language", -20702);
                }
            }
            class72.field1014 = false;
            class668.field9408 = false;
            if (arg0[5].equals("game0")) {
                class210.field2984 = class75.field1037;
            } else if (arg0[5].equals("game1")) {
                class210.field2984 = class324.field4159;
            } else if (arg0[5].equals("game2")) {
                class210.field2984 = class447.field6123;
            } else if (arg0[5].equals("game3")) {
                class210.field2984 = class355.field4560;
            } else {
                class719.method4037("game", -20702);
            }
            class485.field6554 = null;
            class471.field6468 = 0L;
            class617.field8784 = null;
            class274.field3674 = false;
            class159.field2149 = true;
            class290.field3796 = true;
            class64.field888 = false;
            class225.field3153 = class210.field2984.field1662;
            class382.field5363 = 0;
            class711.field9915 = 0;
            class59.field814 = 0;
            class686.field9626 = "";
            client var1 = new client();
            class306.field3966 = var1;
            var1.method3967(false, 1024, 37, class210.field2984.field1661, true, class455.field6260.method3524(-106) + 32, 768, 631);
            class244.field3384.setLocation(40, 40);
        } catch (Exception var3) {
            class233.method1495((byte) -112, var3, null);
        }
        field6139++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lpaa;)Z", line = 3212)
    public static final boolean method2685(class712 arg0) {
        if (class399.field5526) {
            if (method2675(arg0).field1372 != 0) {
                return false;
            }
            if (arg0.field10039 == 0) {
                return false;
            }
        }
        return arg0.field10015;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;", line = 3226)
    public final String method2686(byte arg0) {
        field6140++;
        String var2 = null;
        try {
            var2 = "[1)" + class179.field2535 + "," + class510.field7109 + "," + class514.field7179 + "," + class456.field6281 + "|";
            if (class473.field6483 != null) {
                var2 = var2 + "2)" + class392.field5459 + "," + (class473.field6483.field8421[0] + class179.field2535) + "," + (class473.field6483.field8414[0] + class510.field7109) + "|";
            }
            var2 = var2 + "3)" + class674.field9500.field5158.method1006(0) + "|4)" + class674.field9500.field5135.method133(0) + "|5)" + class615.method3609((byte) 98) + "|6)" + class58.field807 + "," + class582.field8281 + "|";
            var2 = var2 + "7)" + class674.field9500.field5162.method1586(0) + "|";
            var2 = var2 + "8)" + class674.field9500.field5151.method2364(0) + "|";
            var2 = var2 + "9)" + class674.field9500.field5134.method2336(0) + "|";
            var2 = var2 + "10)" + class674.field9500.field5130.method1257(0) + "|";
            var2 = var2 + "11)" + class674.field9500.field5132.method3744(0) + "|";
            var2 = var2 + "12)" + class674.field9500.field5113.method3798(0) + "|";
            var2 = var2 + "13)" + class674.field9497 + "|";
            int var3 = -17 / ((52 - arg0) / 53);
            var2 = var2 + "14)" + class213.field3004;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var16) {
            }
            try {
                if (class674.field9500.field5158.method1006(0) == 2) {
                    Class var4 = Class.forName("java.lang.ClassLoader");
                    Field var5 = var4.getDeclaredField("nativeLibraries");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var7.invoke(var5, Boolean.TRUE);
                    Vector var8 = (Vector) var5.get((field6141 == null ? (field6141 = method2691("client")) : field6141).getClassLoader());
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
                                    var2 = var2 + "|16)" + Long.toHexString(var13.getLong(var10));
                                    var7.invoke(var13, Boolean.FALSE);
                                }
                            } catch (Throwable var14) {
                            }
                            var7.invoke(var11, Boolean.FALSE);
                        } catch (Throwable var15) {
                        }
                    }
                }
            } catch (Throwable var17) {
            }
            var2 = var2 + "]";
        } catch (Throwable var18) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z", line = 3309)
    public static final boolean method2687(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6136++;
        if ((class429.field5916[0][arg1][arg2] & 0x2) != 0) {
            return true;
        } else if ((class429.field5916[arg0][arg1][arg2] & 0x10) == 0) {
            int var5 = 42 / ((arg4 + 31) / 48);
            return arg3 == class253.method1597(arg2, arg0, arg1, (byte) 108);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 3331)
    public final void method2688(byte arg0) {
        field6133++;
        if (class274.field3674) {
            class674.field9497 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class611.method3571(true);
        class474.field6488 = new class28(class379.field5339);
        class480.field6528 = new class297();
        class158.method994(new int[] { 20, 260 }, (byte) -73, new int[] { 1000, 100 });
        if (class746.field10392 != class456.field6280) {
            class82.field1119 = new byte[50][];
        }
        class674.field9500 = class182.method1216(true);
        if (arg0 != 123) {
            return;
        }
        if (class746.field10392 == class456.field6280) {
            class450.field6183.field813 = this.getCodeBase().getHost();
        } else if (class635.method3698(class746.field10392, true)) {
            class450.field6183.field813 = this.getCodeBase().getHost();
            class450.field6183.field820 = class450.field6183.field812 + 40000;
            class177.field2403.field820 = class177.field2403.field812 + 40000;
            class450.field6183.field815 = class450.field6183.field812 + 50000;
            class104.field1501.field820 = class104.field1501.field812 + 40000;
            class177.field2403.field815 = class177.field2403.field812 + 50000;
            class104.field1501.field815 = class104.field1501.field812 + 50000;
        } else if (class746.field10392 == class14.field193) {
            class450.field6183.field813 = "127.0.0.1";
            class177.field2403.field813 = "127.0.0.1";
            class450.field6183.field820 = class450.field6183.field812 + 40000;
            class104.field1501.field813 = "127.0.0.1";
            class177.field2403.field820 = class177.field2403.field812 + 40000;
            class104.field1501.field820 = class104.field1501.field812 + 40000;
            class450.field6183.field815 = class450.field6183.field812 + 50000;
            class177.field2403.field815 = class177.field2403.field812 + 50000;
            class104.field1501.field815 = class104.field1501.field812 + 50000;
        }
        if (class75.field1037 == class210.field2984) {
            class31.field478 = false;
        }
        class396.field5504 = class450.field6183;
        class149.field2058 = class150.field2079 = class60.field824 = class450.field6188 = new short[256];
        if (class324.field4159 == class210.field2984) {
            class5.field44 = class718.field10144;
            class93.field1283 = 16777215;
            class349.field4447 = true;
            class56.field783 = 0;
            class672.field9453 = class140.field1932;
        } else if (class355.field4560 == class210.field2984) {
            class5.field44 = class81.field1106;
            class672.field9453 = class624.field8913;
        } else {
            class5.field44 = class329.field4223;
            class672.field9453 = class661.field9317;
        }
        try {
            class278.field3716 = class306.field3966.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class196.field2837 = class507.method3025((byte) 67, class438.field6016);
        class93.field1263 = class573.method3416(class438.field6016, true, 512);
        try {
            if (class379.field5339.field8716 != null) {
                class324.field4170 = new class504(class379.field5339.field8716, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class652.field9218[var3] = new class504(class379.field5339.field8730[var3], 6000, 0);
                }
                class396.field5505 = new class504(class379.field5339.field8709, 6000, 0);
                class189.field2754 = new class244(255, class324.field4170, class396.field5505, 500000);
                class658.field9296 = new class504(class379.field5339.field8715, 24, 0);
                class379.field5339.field8730 = null;
                class379.field5339.field8716 = null;
                class379.field5339.field8709 = null;
                class379.field5339.field8715 = null;
            }
        } catch (IOException var5) {
            class324.field4170 = null;
            class396.field5505 = null;
            class658.field9296 = null;
            class189.field2754 = null;
        }
        if (class746.field10392 != class456.field6280) {
            class222.field3119 = true;
        }
        class629.field8977 = class138.field1848.method891(-2041650704, class369.field4721);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3458)
    public static final void method2689() {
        int var0 = class147.field2030;
        int[] var1 = class351.field4456;
        int var2 = class555.field7830 ? var0 : class676.field9533 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class584 var4;
            if (var3 < var0) {
                var4 = class40.field563[var1[var3]];
            } else {
                var4 = ((class15) class403.field5587.method1381(true, (long) class731.field10231[var3 - var0])).field204;
            }
            if (var4.field8383 >= 0) {
                int var5 = var4.method3470(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field9490 & 0x1FF) == 0 && (var4.field9489 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field9490 & 0x1FF) == 256 && (var4.field9489 & 0x1FF) == 256) {
                    continue;
                }
                var4.field9502 = class438.method2628(var4.field9490, var4.field9501, var4.field9489, (byte) 113);
                class257.method1603(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 3499)
    public final synchronized void method2690(byte arg0) {
        field6126++;
        if (class622.field8847 != null && class438.field6016 == null && !class379.field5339.field8720) {
            try {
                Class var2 = class622.field8847.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class438.field6016 = (Canvas) var3.get(class622.field8847);
                var3.set(class622.field8847, null);
                if (class438.field6016 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        if (arg0 >= 21) {
            super.method2690((byte) 109);
        }
    }
}
