import jagex3.jagmisc.jagmisc;
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
public class client extends class526 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lqp;")
    public static class586 field9083 = new class586(83, -2);

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field9098 = -50;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field9097;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field9099;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    public static boolean field9100;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3621(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 5)
    public static final void method3599() {
        int var0 = class264.field3925;
        int[] var1 = class533.field7895;
        boolean var2 = class94.field1158.field283 == 1 && var0 > 200 || class94.field1158.field283 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class179 var13 = class383.field5604[var1[var3]];
            if (var13.method1195(7772)) {
                var13.method504((byte) -126);
                if (var13.field3469 >= 0 && var13.field3472 >= 0 && var13.field3459 < class35.field399 && var13.field3462 < class382.field5586) {
                    var13.field2734 = var13.field1065 ? var2 : false;
                    if (class239.field3493 == var13) {
                        var13.field1070 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field1034) {
                            var14++;
                        }
                        if (var13.field1032 > class576.field8505) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method514(0) << 2);
                        if (var13.field2744) {
                            var15 += 512;
                        } else {
                            if (class3.field14 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field1070 = var15 + 1;
                    }
                } else {
                    var13.field1070 = -1;
                }
            } else {
                var13.field1070 = -1;
            }
        }
        for (int var4 = 0; var4 < class567.field8409; var4++) {
            class383 var10 = ((class234) class627.field9185.method1333((long) class25.field230[var4], false)).field3443;
            if (var10.method2320(7772) && var10.field5601.method2628(class406.field5823, true)) {
                var10.method504((byte) -126);
                if (var10.field3469 >= 0 && var10.field3472 >= 0 && var10.field3459 < class35.field399 && var10.field3462 < class382.field5586) {
                    int var11 = 0;
                    if (!var10.field1034) {
                        var11++;
                    }
                    if (var10.field1032 > class576.field8505) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method514(0) << 2);
                    if (class3.field14 == 0) {
                        if (var10.field5601.field6241) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class3.field14 == 1) {
                        if (var10.field5601.field6241) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field5601.field6254) {
                        var12 += 1024;
                    } else if (!var10.field5601.field6304) {
                        var12 += 256;
                    }
                    var10.field1070 = var12 + 1;
                } else {
                    var10.field1070 = -1;
                }
            } else {
                var10.field1070 = -1;
            }
        }
        for (int var5 = 0; var5 < class255.field3737.length; var5++) {
            class67 var6 = class255.field3737[var5];
            if (var6 != null) {
                if (var6.field769 == 1) {
                    class234 var7 = (class234) class627.field9185.method1333((long) var6.field776, false);
                    if (var7 != null) {
                        class383 var8 = var7.field3443;
                        if (var8.field1070 >= 0) {
                            var8.field1070 += 2048;
                        }
                    }
                } else if (var6.field769 == 10) {
                    class179 var9 = class383.field5604[var6.field776];
                    if (var9 != null && class239.field3493 != var9 && var9.field1070 >= 0) {
                        var9.field1070 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZI)V", line = 168)
    public static final void method3600(byte arg0, boolean arg1, int arg2) {
        if (arg0 > -91) {
            method3615();
        }
        class621.field9066 = arg2;
        class322.field4782 = 3;
        field9095++;
        class395.method2377(class311.field4669.field6633, class311.field4669.field6630, -2);
        if (arg1) {
            class18.method87(30245, false, "", "");
        } else {
            class15.method69((byte) -114);
            class18.method87(30245, false, class201.field3009, class537.field7950);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 189)
    public final void method3110(int arg0) {
        if (class515.field7619) {
            class223.field3276 = 64;
        }
        if (arg0 != -3) {
            this.method3604((byte) -1);
        }
        field9080++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class259.method1631(true);
        class462.field6681 = new class506(class328.field4850);
        class80.field919 = new class356();
        if (class643.field9339 != class582.field8561) {
            class25.field231 = new byte[50][];
        }
        class94.field1158 = new class436(class328.field4850);
        if (class643.field9339 == class582.field8561) {
            class648.field9400.field6630 = this.getCodeBase().getHost();
        } else if (class461.method2741(class582.field8561, 503)) {
            class648.field9400.field6630 = this.getCodeBase().getHost();
            class648.field9400.field6627 = class648.field9400.field6633 + 40000;
            class277.field4060.field6627 = class277.field4060.field6633 + 40000;
            class311.field4669.field6627 = class311.field4669.field6633 + 40000;
            class648.field9400.field6631 = class648.field9400.field6633 + 50000;
            class277.field4060.field6631 = class277.field4060.field6633 + 50000;
            class311.field4669.field6631 = class311.field4669.field6633 + 50000;
        } else if (class636.field9261 == class582.field8561) {
            class648.field9400.field6630 = "127.0.0.1";
            class277.field4060.field6630 = "127.0.0.1";
            class311.field4669.field6630 = "127.0.0.1";
            class648.field9400.field6627 = class648.field9400.field6633 + 40000;
            class277.field4060.field6627 = class277.field4060.field6633 + 40000;
            class311.field4669.field6627 = class311.field4669.field6633 + 40000;
            class648.field9400.field6631 = class648.field9400.field6633 + 50000;
            class277.field4060.field6631 = class277.field4060.field6633 + 50000;
            class311.field4669.field6631 = class311.field4669.field6633 + 50000;
        }
        class335.field4931 = class4.field44 = class71.field842 = class213.field3132 = new short[256];
        if (class461.field6666 == class181.field2783) {
            class264.field3922 = class206.field3067;
            class317.field4743 = class611.field8985;
            class228.field3347 = 16777215;
            class224.field3318 = class270.field4001;
            class601.field8869 = class456.field6640;
            class154.field1979 = true;
            class239.field3492 = 0;
        } else {
            class224.field3318 = class635.field9259;
            class317.field4743 = class289.field4253;
            class264.field3922 = class218.field3233;
            class601.field8869 = class631.field9223;
        }
        class536.field7933 = class648.field9400;
        if (class490.field7415 == class461.field6666) {
            class307.field4473 = false;
        }
        class542.field8105 = class261.method1661(class110.field1401, (byte) -125);
        class350.field5071 = class317.method1995(true, (byte) 56, class110.field1401);
        class408.field5832 = class353.field5140;
        try {
            if (class328.field4850.field5130 != null) {
                class551.field8210 = new class255(class328.field4850.field5130, 5200, 0);
                for (int var3 = 0; var3 < 32; var3++) {
                    class349.field5063[var3] = new class255(class328.field4850.field5131[var3], 6000, 0);
                }
                class57.field702 = new class255(class328.field4850.field5146, 6000, 0);
                class444.field6482 = new class18(255, class551.field8210, class57.field702, 500000);
                class550.field8201 = new class255(class328.field4850.field5135, 24, 0);
                class328.field4850.field5135 = null;
                class328.field4850.field5131 = null;
                class328.field4850.field5146 = null;
                class328.field4850.field5130 = null;
            }
        } catch (IOException var4) {
            class57.field702 = null;
            class550.field8201 = null;
            class444.field6482 = null;
            class551.field8210 = null;
        }
        if (class643.field9339 != class582.field8561) {
            class64.field740 = true;
        }
        if (class490.field7415 == class461.field6666) {
            class496.field7472 = class100.field1276.method2953(arg0 + 3184, class77.field889);
        } else if (class461.field6666 == class181.field2783) {
            class496.field7472 = class486.field7375.method2953(3181, class77.field889);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 314)
    public final void method3104(boolean arg0) {
        method3606((byte) 100);
        field9097++;
        class493.method2985(127);
        class621.method3595((byte) -85);
        class487.method2952(45);
        class163.method951(2);
        class533.method3135((byte) -91);
        class582.method3399((byte) 99);
        class623.method3641(18075);
        class551.method3226(0);
        class496.method2996(1);
        class384.method2328(2);
        class205.method1336(0);
        class526.method3102((byte) -58);
        class62.method386(-8185);
        class640.method3708((byte) 72);
        class500.method3009(true);
        class559.method3274(48);
        class105.method607((byte) 120);
        class167.method1064((byte) -50);
        class436.method2673(-128);
        class67.method415(-1);
        class110.method659((byte) -109);
        class419.method2486(11422);
        class51.method256(30244);
        class356.method2193((byte) 80);
        class247.method1574(6);
        class597.method3481((byte) 90);
        class255.method1612(false);
        class18.method84((byte) -120);
        class325.method2034(false);
        class89.method525(2);
        class209.method1357(-25233);
        class388.method2344(4);
        class4.method22((byte) 33);
        class14.method68((byte) -108);
        class301.method1865(5);
        class481.method2917((byte) 108);
        class320.method2006((byte) -105);
        class185.method1212((byte) -77);
        class270.method1710(true);
        class287.method1780(58);
        class574.method3367(75);
        class563.method3292((byte) 50);
        class601.method3501(1);
        class382.method2316((byte) 71);
        class642.method3715(16);
        class369.method2253(-8529);
        class544.method3196((byte) -16);
        class524.method3092(2);
        class421.method2506(3);
        class492.method2980(89);
        class626.method3651(-28006);
        class233.method1516(67);
        class122.method740(28651);
        class234.method1520(1);
        class192.method1245((byte) 122);
        class483.method2928((byte) -91);
        class586.method3423(72);
        class591.method3446((byte) 123);
        class387.method2340(804669548);
        class82.method479(0);
        class359.method2203(true);
        class191.method1240(20181);
        class36.method183((byte) -9);
        class126.method771((byte) -114);
        class311.method1906(0);
        class155.method900((byte) 76);
        class179.method1198(419684);
        class40.method207((byte) -111);
        class562.method3288((byte) -36);
        class256.method1622(17497);
        class86.method505((byte) 105);
        class262.method1677(8);
        class22.method100(arg0);
        class537.method3156((byte) -69);
        class539.method3165((byte) 61);
        class383.method2324(3);
        class184.method1211((byte) 120);
        class605.method3519(-1);
        class152.method888(-23977);
        class326.method2040((byte) 74);
        class528.method3119((byte) 122);
        class549.method3213(arg0);
        class153.method895((byte) -58);
        class121.method738(1025);
        class587.method3428(8);
        class130.method808((byte) -82);
        class162.method947(-11268);
        class635.method3686(9104);
        class418.method2485(-128);
        class455.method2733((byte) -50);
        class312.method1923(125);
        class519.method3079((byte) 124);
        class406.method2431(false);
        class318.method2000((byte) 117);
        class30.method133(0);
        class170.method1081((byte) -72);
        class433.method2642((byte) -72);
        class224.method1473(-104);
        class251.method1592(-1);
        class84.method490(393216);
        class278.method1753(124);
        class125.method767((byte) -102);
        class498.method3004(-125);
        class158.method925(43);
        class114.method696(true);
        class342.method2121(false);
        class543.method3189((byte) -122);
        class429.method2634(-199);
        class414.method2465(-129);
        class477.method2899((byte) 97);
        class594.method3453(1);
        class425.method2515(12911);
        class166.method1059(0);
        class535.method3152(1);
        class427.method2541((byte) 76);
        class104.method603(101);
        class585.method3417(true);
        class379.method2301(0);
        class160.method933(arg0);
        class59.method376(-29281);
        class268.method1708((byte) 3);
        class300.method1857((byte) 31);
        class631.method3675((byte) -27);
        class517.method3072((byte) 84);
        class475.method2889(arg0);
        class237.method1529(-19540);
        class239.method1534(true);
        class115.method705(30064);
        class213.method1380(true);
        class96.method551();
        class538.method3161(!arg0);
        class386.method2338(7588);
        class603.method3508(-1);
        class598.method3495(103);
        class19.method90((byte) -8);
        class330.method2079();
        class113.method680();
        class74.method432(false);
        class385.method2336(arg0);
        class440.method2683();
        class186.method1223(-24602);
        class42.method224(!arg0);
        class608.method3538((byte) 61);
        class149.method878((byte) 114);
        class614.method3573((byte) 118);
        class21.method96((byte) -85);
        class280.method1761(12);
        class43.method228(-112);
        class83.method487(117);
        class347.method2134(255);
        class579.method3383(0);
        class173.method1092(3);
        class604.method3512((byte) 125);
        class308.method1894(43);
        class206.method1345(false);
        class467.method2766(-18);
        class3.method7(!arg0);
        class349.method2137(1);
        class390.method2357(3641);
        class402.method2410((byte) 74);
        class127.method788(-18026);
        class435.method2656(-20);
        class80.method459(-1);
        class31.method139(-1);
        class465.method2764(-8527);
        class490.method2965(false);
        class499.method3007((byte) 75);
        class576.method3372((byte) 54);
        class106.method625(-5);
        class405.method2423((byte) 96);
        class361.method2216(22);
        class352.method2150(-24635);
        class313.method1935(5200);
        class242.method1562(1);
        class632.method3681(0);
        class622.method3625((byte) 109);
        class24.method104();
        class317.method1993(4);
        class316.method1987(0);
        class616.method3578((byte) -123);
        class172.method1091(2);
        class295.method1829(arg0);
        class145.method861(-105);
        class94.method538((byte) 71);
        class272.method1722(true);
        class323.method2020(1947154859);
        class33.method153((byte) -66);
        class190.method1236(115);
        class578.method3378((byte) -65);
        class73.method430(0);
        class639.method3704((byte) -42);
        class77.method448(1024);
        class88.method520(-76);
        class240.method1544(74);
        class200.method1294(-73);
        class85.method494(26);
        class181.method1207(-15);
        class246.method1573();
        class281.method1771(-108);
        class580.method3391(3334);
        class554.method3237(0);
        class434.method2650(5704);
        class137.method841(125);
        class212.method1373(-8001);
        class351.method2148((byte) -59);
        class446.method2711(true);
        class216.method1391((byte) -118);
        class420.method2501(29);
        class542.method3187(0);
        class228.method1487(16);
        class536.method3155((byte) 119);
        class258.method1630(-11956);
        class202.method1306(22266);
        class150.method881(true);
        class577.method3375((byte) -44);
        class165.method1047(80);
        class25.method115(!arg0);
        class243.method1569(7368);
        class10.method48(50);
        class627.method3663((byte) 93);
        class55.method361(95);
        class394.method2373(-1);
        class71.method426(true);
        class606.method3531((byte) 84);
        class154.method898(99);
        class100.method589(29173);
        class188.method1230(262144);
        class644.method3726(352);
        class197.method1273((byte) -31);
        class133.method816((byte) -75);
        class195.method1255(2);
        class108.method631((byte) -62);
        class462.method2745(true);
        class609.method3541(77);
        class321.method2012(-30788);
        class69.method419((byte) -124);
        class225.method1476((byte) 85);
        class271.method1720(true);
        class264.method1694(false);
        class293.method1825(128);
        class363.method2229();
        class600.method3497(6);
        class194.method1250(93);
        class111.method661(-107);
        class248.method1581(110);
        class331.method2081((byte) 55);
        class345.method2125(117);
        class196.method1267(-1);
        class46.method238(-122);
        class70.method424((byte) 109);
        class34.method172((byte) 42);
        class403.method2415(-11749);
        class159.method931(-127);
        class50.method253(false);
        class147.method866((byte) 112);
        class269.method1709(-24933);
        class647.method3734(22);
        class207.method1348(arg0);
        class340.method2111(2002681832);
        class2.method5(22556);
        class502.method3022(0);
        class87.method517(-67);
        class276.method1734();
        class410.method2439(true);
        class78.method457((byte) -118);
        class299.method1854();
        class645.method3730();
        class485.method2947();
        class138.method842((byte) 80);
        class482.method2923(-25667);
        class592.method3449();
        class395.method2376(0);
        class461.method2742((byte) 35);
        class169.method1074(true);
        class257.method1625(58);
        class49.method249((byte) 99);
        class215.method1389(arg0);
        class63.method397(2);
        class230.method1499();
        class371.method2262(34);
        class459.method2738(3);
        class139.method847(91);
        class220.method1449(-12433);
        class335.method2091(-19113);
        class226.method1479(-4361);
        class412.method2444(3);
        class362.method2219(-23521);
        class28.method124(90);
        class161.method945((byte) -94);
        class518.method3078(-103);
        class495.method2993((byte) 126);
        class532.method3132(0);
        class47.method244(-7038);
        class277.method1749(-97);
        class529.method3124((byte) -79);
        class468.method2838((byte) 79);
        class641.method3709(true);
        class32.method145((byte) -29);
        class99.method577(false);
        class260.method1638(0);
        class252.method1598(0);
        class235.method1526(1);
        class377.method2297(true);
        class292.method1820(-3);
        class541.method3180((byte) 17);
        class210.method1364((byte) -15);
        class273.method1726(116);
        class584.method3416(true);
        class156.method903(-13183);
        class444.method2702(7);
        class227.method1484(5);
        class176.method1182(false);
        class629.method3668(1);
        class588.method3433(256);
        class124.method745((byte) 79);
        class203.method1311(98);
        class68.method417(-8405);
        class464.method2751(2);
        class534.method3138(8);
        class182.method1209(8);
        class564.method3302((byte) -33);
        class567.method3310((byte) 42);
        class470.method2872(24091);
        class489.method2961(0);
        class404.method2422(-1803);
        class408.method2433(-1);
        class119.method733(127);
        class540.method3173((byte) 96);
        class283.method1774(0);
        class8.method37(-79);
        class98.method574();
        class445.method2705(16383);
        class458.method2737(-20158);
        class298.method1842(0);
        class259.method1633(true);
        class17.method82(0);
        class231.method1510(1430373515);
        class339.method2107((byte) 84);
        class221.method1458((byte) 88);
        class372.method2270(false);
        class294.method1827(-2048);
        class568.method3314(!arg0);
        class306.method1881((byte) 112);
        class411.method2442(3);
        class513.method3058(-1);
        class142.method855((byte) 95);
        class57.method365((byte) -61);
        class593.method3452(26986);
        class451.method2720(-112);
        class297.method1839(-110);
        class177.method1185(20);
        class343.method2123(0);
        class289.method1794(true);
        class341.method2117(2145738252);
        class307.method1885(-12210);
        class151.method884((byte) 121);
        class491.method2971((byte) -122);
        class358.method2200(16777216);
        class52.method267(0);
        class41.method216(-11340);
        class157.method905((byte) -39);
        class373.method2276();
        class545.method3204(-16777216);
        class288.method1793(-49);
        class64.method400(33);
        class375.method2294();
        class290.method1797((byte) -105);
        class102.method594((byte) 123);
        class613.method3569(1);
        class611.method3562((byte) -123);
        class20.method95((byte) 127);
        class178.method1189((byte) 64);
        class223.method1465(-1);
        class128.method801((byte) 30);
        class11.method51((byte) 23);
        class501.method3011((byte) 120);
        class422.method2507(true);
        class480.method2909(13282);
        class511.method3053(1);
        class118.method726((byte) 108);
        class120.method734(false);
        class76.method443(0);
        class456.method2736(0);
        class238.method1532(19);
        class469.method2855((byte) 125);
        class16.method75(1);
        class1.method1(0);
        class630.method3672(-57);
        class413.method2449((byte) -65);
        class494.method2987((byte) 38);
        class380.method2305((byte) 115);
        class522.method3090((byte) 2);
        class565.method3303(-16911);
        class92.method534((byte) 35);
        class135.method834((byte) -48);
        class123.method744(-14644);
        class296.method1833(-23453);
        class634.method3683((byte) -5);
        class338.method2103(0);
        class302.method1867((byte) -104);
        class336.method2097((byte) 39);
        class365.method2234(0);
        class625.method3649(1);
        class595.method3457(-180);
        class136.method838(1);
        class575.method3369((byte) -92);
        class346.method2127(-120);
        class23.method103(arg0);
        class319.method2001(-127);
        class232.method1513(-73);
        class523.method3091(true);
        class218.method1444((byte) -101);
        class249.method1588((byte) -17);
        class350.method2145((byte) -56);
        class183.method1210(-21647);
        class516.method3066((byte) 127);
        class253.method1600((byte) -11);
        class148.method873((byte) -121);
        class370.method2258((byte) 9);
        class441.method2688(0);
        class648.method3736(-27352);
        class39.method201(27599);
        class327.method2042(-98);
        class546.method3206((byte) -29);
        class561.method3282((byte) -127);
        class97.method562(4);
        class555.method3241((byte) 95);
        class637.method3692(true);
        class596.method3459(3);
        class66.method407(-127);
        class558.method3265((byte) 87);
        class643.method3721((byte) -122);
        class35.method178((byte) -84);
        class93.method536(1);
        class103.method598((byte) -103);
        class590.method3438(121);
        class486.method2949((byte) 73);
        class141.method853((byte) -33);
        class168.method1071((byte) -114);
        class620.method3587(1);
        class553.method3236(256);
        class566.method3306(-37);
        class201.method1303(false);
        class143.method856((byte) -27);
        class497.method2998(0);
        class424.method2510(-122);
        class508.method3038((byte) -115);
        class328.method2048(!arg0);
        class548.method3211(true);
        class392.method2362(-2807);
        class556.method3243(-26344);
        class453.method2730(0);
        class29.method126(-23844);
        class479.method2905(112);
        class646.method3731(-32525);
        class636.method3689((byte) 49);
        class393.method2371((byte) -124);
        class552.method3232(53);
        class628.method3664(-6366);
        class417.method2479((byte) 125);
        class189.method1235(20935);
        class530.method3128((byte) 79);
        class619.method3582(-11430);
        class602.method3505((byte) -82);
        class56.method363(9179409);
        class180.method1206((byte) -95);
        class550.method3223((byte) -79);
        class449.method2717((byte) 82);
        class463.method2746(-13);
        class109.method650(2);
        class442.method2692(24147);
        class265.method1696(3);
        class426.method2519(-8870);
        if (class526.field7809) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II[BIBII)Z", line = 795)
    public static final boolean method3601(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, int arg5, int arg6) {
        field9081++;
        int var7 = arg1 % arg5;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg0 + arg5 - 1) / arg5);
        int var10 = -((arg1 + arg5 - 1) / arg5);
        if (arg4 <= 51) {
            main(null);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg3] == 0) {
                    return true;
                }
                arg3 += arg5;
            }
            int var13 = arg3 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;", line = 846)
    public final String method3113(byte arg0) {
        field9090++;
        String var2 = null;
        try {
            var2 = "[1)" + class584.field8677 + "," + class424.field6061 + "," + class35.field399 + "," + class382.field5586 + "|";
            if (class239.field3493 != null) {
                var2 = var2 + "2)" + class355.field5157 + "," + (class239.field3493.field1090[0] + class584.field8677) + "," + (class239.field3493.field1089[0] + class424.field6061) + "|";
            }
            var2 = var2 + "3)" + class239.field3499 + "|4)" + class94.field1158.field285 + "|5)" + class608.method3540(125) + "|6)" + class522.field7735 + "," + class337.field4944 + "|";
            var2 = var2 + "7)" + class94.field1158.method130(-27423, class239.field3499) + "|";
            var2 = var2 + "8)" + class94.field1158.method131(false, class239.field3499) + "|";
            var2 = var2 + "9)" + class94.field1158.field299 + "|";
            var2 = var2 + "10)" + class94.field1158.field262 + "|";
            var2 = var2 + "11)" + class94.field1158.field297 + "|";
            var2 = var2 + "12)" + class94.field1158.method2675(0, class239.field3499) + "|";
            var2 = var2 + "13)" + class223.field3276 + "|";
            var2 = var2 + "14)" + class192.field2903;
            try {
                if (arg0 > -40) {
                    field9098 = 40;
                }
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class239.field3499 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field9099 == null ? (field9099 = method3621("client")) : field9099).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 930)
    public static final void main(String[] arg0) {
        field9093++;
        try {
            if (arg0.length != 6) {
                class316.method1992("Argument count", (byte) -97);
            }
            class648.field9400 = new class455();
            class648.field9400.field6633 = Integer.parseInt(arg0[0]);
            class277.field4060 = new class455();
            class277.field4060.field6633 = Integer.parseInt(arg0[1]);
            class311.field4669 = new class455();
            class311.field4669.field6633 = Integer.parseInt(arg0[2]);
            class582.field8561 = class636.field9261;
            if (arg0[3].equals("live")) {
                class338.field4956 = class640.field9303;
            } else if (arg0[3].equals("rc")) {
                class338.field4956 = class462.field6679;
            } else if (arg0[3].equals("wip")) {
                class338.field4956 = class377.field5548;
            } else {
                class316.method1992("modewhat", (byte) -26);
            }
            class77.field889 = class534.method3137((byte) 102, arg0[4]);
            if (class77.field889 == -1) {
                if (arg0[4].equals("english")) {
                    class77.field889 = 0;
                } else if (arg0[4].equals("german")) {
                    class77.field889 = 1;
                } else {
                    class316.method1992("language", (byte) 100);
                }
            }
            class606.field8951 = false;
            class187.field2854 = false;
            if (arg0[5].equals("game0")) {
                class461.field6666 = class490.field7415;
            } else if (arg0[5].equals("game1")) {
                class461.field6666 = class181.field2783;
            } else {
                class316.method1992("game", (byte) 109);
            }
            class144.field1871 = false;
            class515.field7619 = false;
            class311.field4583 = "";
            class567.field8408 = true;
            class109.field1382 = true;
            class555.field8240 = 0;
            class110.field1402 = 0;
            class83.field981 = 0;
            class145.field1874 = class461.field6666.field8301;
            class36.field420 = null;
            client var1 = new client();
            class621.field9076 = var1;
            var1.method3106(class338.field4956.method3706(-126) + 32, 607, false, class461.field6666.field8299, 32, 1024, (byte) -58, 768);
            class248.field3628.setLocation(40, 40);
        } catch (Exception var3) {
            class31.method140(null, -104, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1006)
    public static final void method3602(int arg0) {
        int var1 = class264.field3925;
        int[] var2 = class533.field7895;
        int var3 = class534.field7903 ? var1 : class567.field8409 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class86 var5;
            if (var4 < var1) {
                var5 = class383.field5604[var2[var4]];
            } else {
                var5 = ((class234) class627.field9185.method1333((long) class25.field230[var4 - var1], false)).field3443;
            }
            if (var5.field3457 == arg0) {
                var5.field1033 = 0;
                if (var5.field1070 < 0) {
                    var5.field1034 = false;
                } else {
                    int var6 = var5.method514(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3464 & 0x7F) != 0 || (var5.field3463 & 0x7F) != 0) {
                            var5.field1034 = false;
                            continue;
                        }
                    } else if ((var5.field3464 & 0x7F) != 64 || (var5.field3463 & 0x7F) != 64) {
                        var5.field1034 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3464 >> 7;
                        int var8 = var5.field3463 >> 7;
                        if (class226.field3335[var7][var8] != var5.field1070) {
                            var5.field1034 = true;
                            continue;
                        }
                        if (class122.field1576[var7][var8] > 1) {
                            var10002 = class122.field1576[var7][var8]--;
                            var5.field1034 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field3464 - var9 >> 7;
                        int var11 = var5.field3463 - var9 >> 7;
                        int var12 = var5.field3464 + var9 >> 7;
                        int var13 = var5.field3463 + var9 >> 7;
                        if (!class606.method3525(var5.field1070, var10, -112, var12, var11, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class226.field3335[var14][var15] == var5.field1070) {
                                        var10002 = class122.field1576[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1034 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class179 && var5.field1095 != null && class576.field8505 >= var5.field1095.field6598 && class576.field8505 < var5.field1095.field6608) {
                        ((class179) var5).field2734 = false;
                    }
                    var5.field1034 = false;
                    var5.field3460 = class226.method1477(var5.field3457, true, var5.field3464, var5.field3463);
                    class390.method2355(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwca;)Lwca;", line = 1127)
    public static final class311 method3603(class311 arg0) {
        int var1 = method3619(arg0).method3515(-128);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class436.method2659(true, arg0.field4551);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 1148)
    private final void method3604(byte arg0) {
        if (class192.field2903 == 6 && class395.field5743 == 0) {
            if (class223.field3280 > 1) {
                class223.field3280--;
                class151.field1944 = class73.field858;
            }
            if (!class139.field1826) {
                class209.method1355((byte) 90);
            }
            for (int var2 = 0; var2 < 100 && class358.method2201(arg0 - 85); var2++) {
            }
        }
        field9084++;
        class394.field5735++;
        class417.method2480(null, false, -1, -1);
        class588.method3429(32768, -1, null, -1);
        class94.method539(arg0 ^ 0x55);
        class73.field858++;
        for (int var3 = 0; var3 < class350.field5086; var3++) {
            class383 var4 = class579.field8530[var3].field3443;
            if (var4 != null) {
                byte var5 = var4.field5601.field6285;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method514(0);
                    if ((var5 & 0x2) != 0 && var4.field1091 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field1090[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class35.field399 - var6 - 1) < var9) {
                                var9 = class35.field399 - var6 - 1;
                            }
                            int var10 = var4.field1089[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class382.field5586 - var6 - 1)) {
                                var10 = class382.field5586 - var6 - 1;
                            }
                            int var11 = class124.method747(0, var6, class77.field886, var4.field1090[0], 4, var6, var10, class306.field4462, -1, 0, var4.field1089[0], var6, var9, class67.field772[var4.field3457], true);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field1090[var12] = class306.field4462[var11 - var12 - 1];
                                    var4.field1089[var12] = class77.field886[var11 - var12 - 1];
                                    var4.field1093[var12] = 1;
                                }
                                var4.field1091 = var11;
                            }
                        }
                    }
                    class155.method902(var4, true, (byte) -1);
                    int var13 = class465.method2757(var4, (byte) 5);
                    class488.method2958(class486.field7374, var13, arg0 - 85, class343.field5015, var4);
                    class436.method2678(var4, 119);
                }
            }
        }
        if (class395.field5743 == 0 && class304.field4433 == 0) {
            if (class287.field4232 == 2) {
                class290.method1795(true);
            } else {
                class621.method3597((byte) -111);
            }
            if ((class358.field5200 >> 7) < 14 || class35.field399 - 14 <= class358.field5200 >> 7 || class367.field5319 >> 7 < 14 || class382.field5586 - 14 <= class367.field5319 >> 7) {
                class251.method1591(1);
            }
        }
        while (true) {
            class355 var14;
            class311 var15;
            class311 var16;
            do {
                var14 = (class355) class614.field9005.method2498((byte) 14);
                if (var14 == null) {
                    while (true) {
                        class355 var17;
                        class311 var18;
                        class311 var19;
                        do {
                            var17 = (class355) class534.field7907.method2498((byte) 64);
                            if (var17 == null) {
                                while (true) {
                                    class355 var20;
                                    class311 var21;
                                    class311 var22;
                                    do {
                                        var20 = (class355) class50.field595.method2498((byte) 111);
                                        if (var20 == null) {
                                            if (class106.field1333 != null) {
                                                class556.method3244(-2);
                                            }
                                            if (class576.field8505 % 1500 == 0) {
                                                class591.method3441(117);
                                            }
                                            if (class192.field2903 == 6 && class395.field5743 == 0) {
                                                class129.method803(true);
                                            }
                                            class491.method2974(-1294896212);
                                            if (class528.field7834 && (class450.method2719((byte) 127) - 60000L) > class516.field7684) {
                                                class622.method3622(127);
                                            }
                                            for (class201 var23 = (class201) class76.field879.method772(0); var23 != null; var23 = (class201) class76.field879.method775(arg0 - 83)) {
                                                if ((class450.method2719((byte) -89) / 1000L - 5L) > ((long) var23.field3012)) {
                                                    if (var23.field3008 > 0) {
                                                        class549.method3214(68, var23.field3011 + class83.field958.method2953(arg0 ^ 0xC38, class77.field889), "", 0, "", 5);
                                                    }
                                                    if (var23.field3008 == 0) {
                                                        class549.method3214(90, var23.field3011 + class259.field3794.method2953(3181, class77.field889), "", 0, "", 5);
                                                    }
                                                    var23.method736((byte) -126);
                                                }
                                            }
                                            if (arg0 != 85) {
                                                return;
                                            }
                                            if (class192.field2903 == 6 && class395.field5743 == 0) {
                                                if (class513.field7606 == null) {
                                                    class550.method3221(arg0 ^ 0x55, false);
                                                    return;
                                                }
                                                class352.field5117++;
                                                if (class352.field5117 > 50) {
                                                    class637.field9277++;
                                                    class165.method1046(-3466, class590.field8733);
                                                }
                                                try {
                                                    if (class513.field7606 != null && class221.field3268.field6221 > 0) {
                                                        class411.field5858 += class221.field3268.field6221;
                                                        class513.field7606.method1243(class221.field3268.field6162, class221.field3268.field6221, 0, -27985);
                                                        class352.field5117 = 0;
                                                        class221.field3268.field6221 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class550.method3221(0, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5150;
                                        if (var21.field4558 < 0) {
                                            break;
                                        }
                                        var22 = class436.method2659(true, var21.field4551);
                                    } while (var22 == null || var22.field4652 == null || var21.field4558 >= var22.field4652.length || var22.field4652[var21.field4558] != var21);
                                    class330.method2072(var20);
                                }
                            }
                            var18 = var17.field5150;
                            if (var18.field4558 < 0) {
                                break;
                            }
                            var19 = class436.method2659(true, var18.field4551);
                        } while (var19 == null || var19.field4652 == null || var19.field4652.length <= var18.field4558 || var19.field4652[var18.field4558] != var18);
                        class330.method2072(var17);
                    }
                }
                var15 = var14.field5150;
                if (var15.field4558 < 0) {
                    break;
                }
                var16 = class436.method2659(true, var15.field4551);
            } while (var16 == null || var16.field4652 == null || var15.field4558 >= var16.field4652.length || var16.field4652[var15.field4558] != var15);
            class330.method2072(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V", line = 1428)
    private final void method3605(int arg0, byte[] arg1) {
        int var3 = -17 / ((-arg0 - 14) / 52);
        field9087++;
        class428 var4 = new class428(arg1);
        while (true) {
            int var5 = var4.method2561((byte) -123);
            if (var5 == 0) {
                return;
            }
            if (var5 == 2) {
                class117.field1528 = var4.method2620(79);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1454)
    public final void init() {
        field9078++;
        if (!this.method3101(-1)) {
            return;
        }
        class648.field9400 = new class455();
        class648.field9400.field6633 = Integer.parseInt(this.getParameter("worldid"));
        class277.field4060 = new class455();
        class277.field4060.field6633 = Integer.parseInt(this.getParameter("lobbyid"));
        class277.field4060.field6630 = this.getParameter("lobbyaddress");
        class311.field4669 = new class455();
        class311.field4669.field6633 = Integer.parseInt(this.getParameter("demoid"));
        class311.field4669.field6630 = this.getParameter("demoaddress");
        class582.field8561 = class436.method2672(Integer.parseInt(this.getParameter("modewhere")), false);
        if (!class461.method2741(class582.field8561, 503) && class643.field9339 != class582.field8561) {
            class582.field8561 = class643.field9339;
        }
        class338.field4956 = class285.method1778(Integer.parseInt(this.getParameter("modewhat")), 121);
        if (class377.field5548 != class338.field4956 && class462.field6679 != class338.field4956 && class640.field9303 != class338.field4956) {
            class338.field4956 = class640.field9303;
        }
        try {
            class77.field889 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class77.field889 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class187.field2854 = true;
        } else {
            class187.field2854 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class606.field8951 = true;
        } else {
            class606.field8951 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class231.field3420 = true;
        } else {
            class231.field3420 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class461.field6666 = class490.field7415;
            } else if (var4.equals("1")) {
                class461.field6666 = class181.field2783;
            }
        }
        try {
            class555.field8240 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class555.field8240 = 0;
        }
        class501.field7497 = this.getParameter("quiturl");
        class311.field4583 = this.getParameter("settings");
        if (class311.field4583 == null) {
            class311.field4583 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class110.field1402 = Integer.parseInt(var5);
            } catch (Exception var10) {
                class110.field1402 = 0;
            }
        }
        class145.field1874 = Integer.parseInt(this.getParameter("colourid"));
        if (class145.field1874 < 0 || class347.field5042.length <= class145.field1874) {
            class145.field1874 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class567.field8408 = true;
            class109.field1382 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class144.field1871 = true;
        }
        class36.field420 = this.getParameter("sskey");
        if (class36.field420 != null && class36.field420.length() < 2) {
            class36.field420 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class515.field7619 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class83.field981 = Integer.parseInt(var8);
            } catch (Exception var9) {
            }
        }
        if (class490.field7415 == class461.field6666) {
            class461.field6665 = 503;
            class632.field9239 = 765;
        } else if (class461.field6666 == class181.field2783) {
            class461.field6665 = 480;
            class632.field9239 = 640;
        }
        class621.field9076 = this;
        this.method3105(0, class632.field9239, class338.field4956.method3706(-127) + 32, 607, class461.field6665);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1591)
    public static void method3606(byte arg0) {
        field9083 = null;
        if (arg0 <= 99) {
            method3601(-72, -8, null, 14, (byte) -65, -89, -26);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1602)
    public final void method3098(int arg0) {
        field9079++;
        if (arg0 < 30) {
            field9083 = null;
        }
        if (class239.field3499 != 2) {
            this.method3612(3);
            return;
        }
        try {
            this.method3612(3);
        } catch (Throwable var3) {
            class31.method140(var3.getMessage() + " (Recovered) " + this.method3113((byte) -125), -115, var3);
            class447.method2712(10, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 1625)
    public final void method3109(byte arg0) {
        field9088++;
        if (arg0 <= 105) {
            field9098 = -9;
        }
        if (class528.field7834) {
            class622.method3622(126);
        }
        if (class379.field5558 != null) {
            class379.field5558.method1061(102);
        }
        if (class644.field9345 != null) {
            class470.method2864(class328.field4850, class644.field9345, 0);
            class644.field9345 = null;
        }
        if (class513.field7606 != null) {
            class513.field7606.method1247((byte) 124);
            class513.field7606 = null;
        }
        class356.method2183(false);
        class80.field919.method2184(19);
        class462.field6681.method3034(0);
        if (class470.field7161 != null) {
            class470.field7161.method3439(23407);
            class470.field7161 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V", line = 1667)
    private final void method3607(int arg0, byte arg1) {
        if (arg1 < 34) {
            return;
        }
        class425.field6073 = null;
        class511.field7595 = null;
        field9091++;
        class80.field919.field5192 = arg0;
        class287.field4229 = 0;
        class80.field919.field5193++;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1683)
    public static final void method3608(int arg0) {
        int var1 = class264.field3925;
        int[] var2 = class533.field7895;
        for (int var3 = 0; var3 < class567.field8409 + var1; var3++) {
            class86 var4;
            if (var3 < var1) {
                var4 = class383.field5604[var2[var3]];
            } else {
                var4 = ((class234) class627.field9185.method1333((long) class25.field230[var3 - var1], false)).field3443;
            }
            if (var4.field3457 == arg0 && var4.field1070 >= 0) {
                int var5 = var4.method514(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3464 & 0x7F) != 0 || (var4.field3463 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field3464 & 0x7F) != 64 || (var4.field3463 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3464 >> 7;
                    int var7 = var4.field3463 >> 7;
                    if (var4.field1070 > class226.field3335[var6][var7]) {
                        class226.field3335[var6][var7] = var4.field1070;
                        class122.field1576[var6][var7] = 1;
                    } else if (class226.field3335[var6][var7] == var4.field1070) {
                        var10002 = class122.field1576[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field3464 - var8 >> 7;
                    int var10 = var4.field3463 - var8 >> 7;
                    int var11 = var4.field3464 + var8 >> 7;
                    int var12 = var4.field3463 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1070 > class226.field3335[var13][var14]) {
                                class226.field3335[var13][var14] = var4.field1070;
                                class122.field1576[var13][var14] = 1;
                            } else if (class226.field3335[var13][var14] == var4.field1070) {
                                var10002 = class122.field1576[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1783)
    public static final void method3609() {
        for (int var0 = 0; var0 < class35.field399; var0++) {
            int[] var1 = class226.field3335[var0];
            for (int var2 = 0; var2 < class382.field5586; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 1802)
    private final void method3610(boolean arg0) {
        field9092++;
        if (!class94.field1158.field305) {
            for (int var2 = 0; var2 < class180.field2769; var2++) {
                if (class202.field3019[var2].method2363(28814) == 's' || class202.field3019[var2].method2363(28814) == 'S') {
                    class94.field1158.field305 = true;
                    break;
                }
            }
        }
        if (class359.field5214 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class450.method2719((byte) -73);
            if (class491.field7427 == 0L) {
                class491.field7427 = var5;
            }
            if (var4 > 16384 && var5 - class491.field7427 < 5000L) {
                if (var5 - class209.field3092 > 1000L) {
                    System.gc();
                    class209.field3092 = var5;
                }
                class483.field7335 = class3.field21.method2953(3181, class77.field889);
                class207.field3081 = 5;
            } else {
                class483.field7335 = class1.field3.method2953(3181, class77.field889);
                class207.field3081 = 5;
                class359.field5214 = 10;
            }
        } else if (class359.field5214 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class67.field772[var7] = class67.method413(class382.field5586, (byte) 7, class35.field399);
            }
            class483.field7335 = class154.field1975.method2953(3181, class77.field889);
            class207.field3081 = 10;
            class359.field5214 = 20;
        } else if (class359.field5214 == 20) {
            if (class179.field2759 == null) {
                class179.field2759 = new class247(class80.field919, class462.field6681, class499.field7484, class176.field2683);
            }
            if (class179.field2759.method1576(-28120)) {
                class3.field15 = class515.method3065(true, 1, 1000000, false, 0);
                class627.field9192 = class515.method3065(true, 1, 1000000, false, 1);
                class635.field9258 = class515.method3065(true, 1, 1000000, false, 2);
                class126.field1664 = class515.method3065(true, 1, 1000000, false, 3);
                class197.field2968 = class515.method3065(true, 1, 1000000, false, 4);
                class594.field8766 = class515.method3065(true, 1, 1000000, true, 5);
                class524.field7765 = class515.method3065(false, 1, 1000000, true, 6);
                class57.field700 = class515.method3065(true, 1, 1000000, false, 7);
                class371.field5368 = class515.method3065(true, 1, 1000000, false, 8);
                class280.field4166 = class515.method3065(true, 1, 1000000, false, 9);
                class493.field7443 = class515.method3065(true, 1, 1000000, false, 10);
                class11.field103 = class515.method3065(true, 1, 1000000, false, 11);
                class301.field4409 = class515.method3065(true, 1, 1000000, false, 12);
                class644.field9347 = class515.method3065(true, 1, 1000000, false, 13);
                class577.field8509 = class515.method3065(false, 1, 1000000, false, 14);
                class163.field2180 = class515.method3065(true, 1, 1000000, false, 15);
                class637.field9274 = class515.method3065(true, 1, 1000000, false, 16);
                class644.field9340 = class515.method3065(true, 1, 1000000, false, 17);
                class89.field1139 = class515.method3065(true, 1, 1000000, false, 18);
                class549.field8190 = class515.method3065(true, 1, 1000000, false, 19);
                class292.field4288 = class515.method3065(true, 1, 1000000, false, 20);
                class379.field5557 = class515.method3065(true, 1, 1000000, false, 21);
                class349.field5065 = class515.method3065(true, 1, 1000000, false, 22);
                class308.field4493 = class515.method3065(true, 1, 1000000, true, 23);
                class227.field3339 = class515.method3065(true, 1, 1000000, false, 24);
                class311.field4639 = class515.method3065(true, 1, 1000000, false, 25);
                class277.field4069 = class515.method3065(true, 1, 1000000, true, 26);
                class31.field321 = class515.method3065(true, 1, 1000000, false, 27);
                class130.field1714 = class515.method3065(true, 1, 1000000, true, 28);
                class312.field4689 = class515.method3065(true, 1, 1000000, false, 29);
                class20.field182 = class515.method3065(true, 1, 1000000, true, 30);
                class646.field9378 = class515.method3065(true, 1, 1000000, true, 31);
                class483.field7335 = class463.field6689.method2953(3181, class77.field889);
                class359.field5214 = 30;
                class207.field3081 = 15;
            } else {
                class483.field7335 = class212.field3120.method2953(3181, class77.field889);
                class207.field3081 = 12;
            }
        } else if (class359.field5214 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 32; var9++) {
                var8 += class532.field7888[var9].method1560(100) * class627.field9193[var9] / 100;
            }
            if (var8 == 100) {
                class483.field7335 = class392.field5711.method2953(3181, class77.field889);
                class207.field3081 = 20;
                class302.method1866(-112, class371.field5368);
                class249.method1590(true, class371.field5368);
                class359.field5214 = 35;
            } else {
                if (var8 != 0) {
                    class483.field7335 = class126.field1662.method2953(3181, class77.field889) + var8 + "%";
                }
                class207.field3081 = 20;
            }
        } else {
            if (!arg0) {
                this.method3614(-68);
            }
            if (class359.field5214 == 35) {
                class70.method420(2, class328.field4850, class20.field182);
                class483.field7335 = class594.field8765.method2953(3181, class77.field889);
                class207.field3081 = 20;
                class359.field5214 = 40;
            } else if (class359.field5214 == 40) {
                if (class130.field1714.method3468(-1)) {
                    this.method3620(5, class130.field1714.method3469(1, 114));
                    this.method3605(-110, class130.field1714.method3469(3, 113));
                    if (class117.field1528 == -1 || class57.field700.method3461(class117.field1528, 0, 0)) {
                        class483.field7335 = class158.field2018.method2953(3181, class77.field889);
                        class207.field3081 = 25;
                        class359.field5214 = 41;
                    }
                } else {
                    class483.field7335 = class421.field6040.method2953(3181, class77.field889) + class130.field1714.method3479(0) + "%";
                    class207.field3081 = 25;
                }
            } else if (class359.field5214 == 41) {
                int var10 = class179.method1192("jaggl", (byte) 104);
                if (var10 >= 0 && var10 < 100) {
                    class483.field7335 = class238.field3485.method2953(3181, class77.field889) + var10 + "%";
                    class207.field3081 = 25;
                } else {
                    class483.field7335 = class390.field5692.method2953(3181, class77.field889);
                    class207.field3081 = 25;
                    class359.field5214 = 42;
                }
            } else if (class359.field5214 == 42) {
                int var11 = class179.method1192("jagdx", (byte) 107);
                if (var11 >= 0 && var11 < 100) {
                    class483.field7335 = class564.field8367.method2953(3181, class77.field889) + var11 + "%";
                    class207.field3081 = 25;
                } else {
                    class483.field7335 = class302.field4423.method2953(3181, class77.field889);
                    class359.field5214 = 43;
                    class207.field3081 = 25;
                }
            } else if (class359.field5214 == 43) {
                int var12 = class179.method1192("jagmisc", (byte) 121);
                if (var12 >= 0 && var12 < 100) {
                    class483.field7335 = class566.field8399.method2953(3181, class77.field889) + var12 + "%";
                    class207.field3081 = 25;
                } else {
                    if (var12 == 100) {
                        this.method3099(123);
                    }
                    class483.field7335 = class619.field9028.method2953(3181, class77.field889);
                    class207.field3081 = 25;
                    class359.field5214 = 44;
                }
            } else if (class359.field5214 == 44) {
                int var13 = class179.method1192("sw3d", (byte) 104);
                if (var13 >= 0 && var13 < 100) {
                    class483.field7335 = class92.field1152.method2953(3181, class77.field889) + var13 + "%";
                    class207.field3081 = 25;
                } else {
                    class483.field7335 = class30.field304.method2953(3181, class77.field889);
                    class207.field3081 = 25;
                    class359.field5214 = 45;
                }
            } else if (class359.field5214 == 45) {
                int var14 = class179.method1192("jaclib", (byte) 125);
                if (var14 >= 0 && var14 < 100) {
                    class483.field7335 = class558.field8275.method2953(3181, class77.field889) + var14 + "%";
                    class207.field3081 = 25;
                } else {
                    if (var14 == 100) {
                        this.method3114(-41);
                    }
                    class483.field7335 = class102.field1289.method2953(3181, class77.field889);
                    class207.field3081 = 25;
                    class359.field5214 = 46;
                }
            } else if (class359.field5214 == 46) {
                int var15 = class179.method1192("hw3d", (byte) 120);
                if (var15 >= 0 && var15 < 100) {
                    class483.field7335 = class608.field8957.method2953(3181, class77.field889) + var15 + "%";
                    class207.field3081 = 25;
                } else {
                    class483.field7335 = class298.field4353.method2953(3181, class77.field889);
                    class207.field3081 = 25;
                    class359.field5214 = 47;
                }
            } else if (class359.field5214 == 47) {
                if (class646.field9378.method3468(-1)) {
                    class483.field7335 = class237.field3471.method2953(3181, class77.field889);
                    class207.field3081 = 25;
                    class359.field5214 = 50;
                } else {
                    class483.field7335 = class584.field8639.method2953(3181, class77.field889);
                    class207.field3081 = 25;
                }
            } else if (class359.field5214 == 50) {
                class629.method3669(125);
                class483.field7335 = class499.field7488.method2953(3181, class77.field889);
                class207.field3081 = 30;
                class359.field5214 = 60;
            } else if (class359.field5214 == 60) {
                int var16 = class181.method1208(class371.field5368, class644.field9347, -2);
                int var17 = class165.method1049(-69);
                if (var17 > var16) {
                    class483.field7335 = class137.field1818.method2953(3181, class77.field889) + var16 * 100 / var17 + "%";
                    class207.field3081 = 35;
                } else {
                    class483.field7335 = class295.field4325.method2953(3181, class77.field889);
                    class359.field5214 = 70;
                    class207.field3081 = 35;
                }
            } else if (class359.field5214 == 70) {
                int var18 = class82.method469(class371.field5368, 94);
                int var19 = class611.method3559((byte) 72);
                if (var18 < var19) {
                    class483.field7335 = class347.field5056.method2953(3181, class77.field889) + var18 * 100 / var19 + "%";
                    class207.field3081 = 40;
                } else {
                    class483.field7335 = class176.field2685.method2953(3181, class77.field889);
                    class207.field3081 = 40;
                    class359.field5214 = 80;
                }
            } else if (class359.field5214 == 80) {
                if (class277.field4069.method3468(-1)) {
                    class39.field441 = new class280(class277.field4069, class280.field4166, class371.field5368);
                    class483.field7335 = class293.field4307.method2953(3181, class77.field889);
                    class207.field3081 = 45;
                    class359.field5214 = 90;
                } else {
                    class483.field7335 = class486.field7372.method2953(3181, class77.field889) + class277.field4069.method3479(0) + "%";
                    class207.field3081 = 45;
                }
            } else if (class359.field5214 == 90) {
                class483.field7335 = class181.field2784.method2953(3181, class77.field889);
                class207.field3081 = 50;
                class359.field5214 = 95;
            } else if (class359.field5214 == 95) {
                if (class94.field1158.field305) {
                    class94.field1158.field264 = 0;
                    class94.field1158.field267 = 0;
                    class94.field1158.field278 = 0;
                    class94.field1158.field285 = 0;
                    class94.field1158.field293 = 1;
                }
                class94.field1158.field305 = true;
                class94.field1158.method2661(class328.field4850, -1);
                class243.method1568(false, (byte) -115, class94.field1158.field264);
                class483.field7335 = class153.field1957.method2953(3181, class77.field889);
                class359.field5214 = 100;
                class207.field3081 = 55;
            } else if (class359.field5214 == 100) {
                class59.method377(class379.field5558, class371.field5368, (byte) 8, class644.field9347);
                class483.field7335 = class433.field6341.method2953(3181, class77.field889);
                class207.field3081 = 60;
                class463.method2749(1, 1);
                class359.field5214 = 110;
            } else if (class359.field5214 == 110) {
                class635.field9258.method3468(-1);
                byte var20 = 0;
                int var21 = var20 + class635.field9258.method3479(0);
                class637.field9274.method3468(-1);
                int var22 = var21 + class637.field9274.method3479(0);
                class644.field9340.method3468(-1);
                int var23 = var22 + class644.field9340.method3479(0);
                class89.field1139.method3468(-1);
                int var24 = var23 + class89.field1139.method3479(0);
                class549.field8190.method3468(-1);
                int var25 = var24 + class549.field8190.method3479(0);
                class292.field4288.method3468(-1);
                int var26 = var25 + class292.field4288.method3479(0);
                class379.field5557.method3468(-1);
                int var27 = var26 + class379.field5557.method3479(0);
                class349.field5065.method3468(-1);
                int var28 = var27 + class349.field5065.method3479(0);
                class227.field3339.method3468(-1);
                int var29 = var28 + class227.field3339.method3479(0);
                class311.field4639.method3468(-1);
                int var30 = var29 + class311.field4639.method3479(0);
                class31.field321.method3468(-1);
                int var31 = var30 + class31.field321.method3479(0);
                class312.field4689.method3468(-1);
                int var32 = var31 + class312.field4689.method3479(0);
                if (var32 < 1200) {
                    class483.field7335 = class176.field2686.method2953(3181, class77.field889) + var32 / 12 + "%";
                    class207.field3081 = 65;
                } else {
                    class8.field74 = new class563(class461.field6666, class77.field889, class635.field9258);
                    class345.field5023 = new class89(class461.field6666, class77.field889, class635.field9258);
                    class271.field4008 = new class209(class461.field6666, class77.field889, class635.field9258, class371.field5368);
                    class458.field6651 = new class615(class461.field6666, class77.field889, class644.field9340);
                    class636.field9264 = new class388(class461.field6666, class77.field889, class635.field9258);
                    class264.field3924 = new class4(class461.field6666, class77.field889, class635.field9258);
                    class42.field507 = new class14(class461.field6666, class77.field889, class635.field9258, class57.field700);
                    class151.field1933 = new class301(class461.field6666, class77.field889, class635.field9258);
                    class191.field2897 = new class481(class461.field6666, class77.field889, class635.field9258);
                    class312.field4690 = new class320(class461.field6666, class77.field889, true, class637.field9274, class57.field700);
                    class540.field8011 = new class185(class461.field6666, class77.field889, class635.field9258, class371.field5368);
                    class402.field5766 = new class270(class461.field6666, class77.field889, class635.field9258, class371.field5368);
                    class369.field5329 = new class287(class461.field6666, class77.field889, true, class89.field1139, class57.field700);
                    class216.field3204 = new class574(class461.field6666, class77.field889, true, class8.field74, class549.field8190, class57.field700);
                    class247.field3618 = new class476(class461.field6666, class77.field889, class635.field9258);
                    class470.field7205 = new class601(class461.field6666, class77.field889, class292.field4288, class3.field15, class627.field9192);
                    class28.field255 = new class382(class461.field6666, class77.field889, class635.field9258);
                    class458.field6652 = new class642(class461.field6666, class77.field889, class635.field9258);
                    class138.field1821 = new class369(class461.field6666, class77.field889, class379.field5557, class57.field700);
                    class77.field888 = new class544(class461.field6666, class77.field889, class635.field9258);
                    class482.field7311 = new class524(class461.field6666, class77.field889, class635.field9258);
                    class180.field2761 = new class421(class461.field6666, class77.field889, class635.field9258);
                    class23.field200 = new class492(class461.field6666, class77.field889, class349.field5065);
                    class239.field3501 = new class626(class461.field6666, class77.field889, class635.field9258);
                    class180.method1205(class644.field9347, 0, class126.field1664, class57.field700, class371.field5368);
                    class436.method2663((byte) -12, class312.field4689);
                    class271.field4009 = new class233(class77.field889, class227.field3339, class311.field4639);
                    class609.field8967 = new class122(class77.field889, class227.field3339, class311.field4639, new class361());
                    class483.field7335 = class616.field9019.method2953(3181, class77.field889);
                    class207.field3081 = 65;
                    class249.method1589(107);
                    class312.field4690.method2007(!class94.field1158.method2675(0, class239.field3499), 31799);
                    class406.field5823 = new class110();
                    class394.method2372(arg0);
                    class434.method2651(class31.field321, (byte) 110);
                    class160.method932(class39.field441, class57.field700, -2258);
                    class359.field5214 = 120;
                }
            } else if (class359.field5214 == 120) {
                int var33 = class140.method851(class371.field5368, -108);
                int var34 = class436.method2674((byte) 102);
                if (var34 > var33) {
                    class483.field7335 = class602.field8882.method2953(3181, class77.field889) + var33 * 100 / var34 + "%";
                    class207.field3081 = 70;
                } else {
                    class361.method2212(class379.field5558, -126, class371.field5368);
                    class636.method3688(class372.field5384, 1);
                    class483.field7335 = class97.field1216.method2953(3181, class77.field889);
                    class207.field3081 = 70;
                    class359.field5214 = 130;
                }
            } else if (class359.field5214 == 130) {
                if (class493.field7443.method3472("huffman", "", (byte) -59)) {
                    class316 var35 = new class316(class493.field7443.method3466("", 0, "huffman"));
                    class190.method1237(arg0, var35);
                    class483.field7335 = class49.field570.method2953(3181, class77.field889);
                    class359.field5214 = 140;
                    class207.field3081 = 75;
                } else {
                    class483.field7335 = class385.field5629.method2953(3181, class77.field889) + "0%";
                    class207.field3081 = 75;
                }
            } else if (class359.field5214 == 140) {
                if (class126.field1664.method3468(-1)) {
                    class483.field7335 = class148.field1919.method2953(3181, class77.field889);
                    class207.field3081 = 80;
                    class359.field5214 = 150;
                } else {
                    class483.field7335 = class359.field5212.method2953(3181, class77.field889) + class126.field1664.method3479(0) + "%";
                    class207.field3081 = 80;
                }
            } else if (class359.field5214 == 150) {
                if (class301.field4409.method3468(-1)) {
                    class483.field7335 = class553.field8226.method2953(3181, class77.field889);
                    class359.field5214 = 160;
                    class207.field3081 = 82;
                } else {
                    class483.field7335 = class109.field1379.method2953(3181, class77.field889) + class301.field4409.method3479(0) + "%";
                    class207.field3081 = 82;
                }
            } else if (class359.field5214 == 160) {
                if (class644.field9347.method3468(-1)) {
                    class483.field7335 = class260.field3818.method2953(3181, class77.field889);
                    class359.field5214 = 170;
                    class207.field3081 = 85;
                } else {
                    class483.field7335 = class260.field3818.method2953(3181, class77.field889) + class644.field9347.method3479(0) + "%";
                    class207.field3081 = 85;
                }
            } else if (class359.field5214 == 170) {
                if (class308.field4493.method3476(100, "details")) {
                    class113.method676(class308.field4493, class636.field9264, class264.field3924, class312.field4690, class540.field8011, class402.field5766, class406.field5823);
                    class483.field7335 = class351.field5111.method2953(3181, class77.field889);
                    class207.field3081 = 89;
                    class359.field5214 = 190;
                } else {
                    class483.field7335 = class500.field7489.method2953(3181, class77.field889) + class308.field4493.method3471("details", 0) + "%";
                    class207.field3081 = 87;
                }
            } else if (class359.field5214 == 190) {
                class595.field8769 = new boolean[class180.field2761.field6036];
                class242.field3547 = new String[class482.field7311.field7759];
                class526.field7774 = new int[class180.field2761.field6036];
                for (int var36 = 0; var36 < class180.field2761.field6036; var36++) {
                    if (class180.field2761.method2502(var36, true).field7487 == 0) {
                        class595.field8769[var36] = true;
                        class178.field2706++;
                    }
                    class526.field7774[var36] = -1;
                }
                class1.method3((byte) -70);
                class600.field8841 = class126.field1664.method3478(-1, "loginscreen");
                class53.field635 = class126.field1664.method3478(-1, "lobbyscreen");
                class594.field8766.method3482(true, -21222, false);
                class524.field7765.method3482(true, -21222, true);
                class371.field5368.method3482(true, -21222, true);
                class644.field9347.method3482(true, -21222, true);
                class493.field7443.method3482(true, -21222, true);
                class126.field1664.method3482(true, -21222, true);
                class635.field9258.field8794 = 2;
                class318.field4752 = true;
                class644.field9340.field8794 = 2;
                class637.field9274.field8794 = 2;
                class89.field1139.field8794 = 2;
                class549.field8190.field8794 = 2;
                class292.field4288.field8794 = 2;
                class379.field5557.field8794 = 2;
                class463.method2748(-1, false, (byte) 125, -1, class94.field1158.field293);
                class483.field7335 = class377.field5544.method2953(3181, class77.field889);
                class359.field5214 = 200;
                class207.field3081 = 95;
            } else if (class359.field5214 == 200) {
                class463.method2749(1, 2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwca;IIIIIIIII)V", line = 2474)
    public static final void method3611(class311[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class311 var11 = arg0[var10];
            if (var11 != null && var11.field4551 == arg1) {
                int var12 = var11.field4596 + arg6;
                int var13 = var11.field4568 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field4655 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field4543 + var12;
                    int var19 = var11.field4620 + var13;
                    if (var11.field4655 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field4655 == 0 || var11.field4662 || method3619(var11).field8904 != 0 || class533.field7896 == var11 || class69.field784 == var11.field4678) {
                    if (!method3618(var11)) {
                        if (class106.field1333 == var11 && class201.method1302(-102, class106.field1333) != null) {
                            class186.field2824 = true;
                            class117.field1532 = var12;
                            class2.field9 = var13;
                        }
                        if (var11.field4592 || var14 < var16 && var15 < var17) {
                            if (var11.field4574 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class355 var20 = (class355) class50.field595.method2496((byte) -104); var20 != null; var20 = (class355) class50.field595.method2494(40)) {
                                    if (var20.field5152) {
                                        var20.method2997(1);
                                        var20.field5150.field4649 = false;
                                    }
                                }
                                if (class431.field6322 == 0) {
                                    class106.field1333 = null;
                                    class533.field7896 = null;
                                }
                                class89.field1140 = 0;
                                class582.field8560 = false;
                                class590.field8734 = false;
                                if (!class139.field1826) {
                                    class209.method1355((byte) 90);
                                }
                            }
                            boolean var21;
                            if (class350.field5071.method635(-192) >= var14 && class350.field5071.method633((byte) 29) >= var15 && class350.field5071.method635(-192) < var16 && class350.field5071.method633((byte) 29) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class369.field5337 && var21) {
                                if (var11.field4630 >= 0) {
                                    class362.field5233 = var11.field4630;
                                } else if (var11.field4574) {
                                    class362.field5233 = -1;
                                }
                            }
                            if (!class139.field1826 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class532.method3133(arg9 - var13, arg8 - var12, -124, var11);
                            }
                            boolean var22 = false;
                            if (class350.field5071.method645((byte) 107) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class497 var24 = (class497) class281.field4170.method2496((byte) 10);
                            if (var24 != null && var24.method32((byte) 107) == 0 && var24.method34(-3797) >= var14 && var24.method31(68) >= var15 && var24.method34(-3797) < var16 && var24.method31(87) < var17) {
                                var23 = true;
                            }
                            if (var11.field4540 != null) {
                                for (int var25 = 0; var25 < var11.field4540.length; var25++) {
                                    if (class542.field8105.method1259(true, var11.field4540[var25])) {
                                        if (var11.field4545 == null || class576.field8505 >= var11.field4545[var25]) {
                                            byte var26 = var11.field4554[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class542.field8105.method1259(true, 86) && !class542.field8105.method1259(true, 82) && !class542.field8105.method1259(true, 81)) && ((var26 & 0x2) == 0 || class542.field8105.method1259(true, 86)) && ((var26 & 0x1) == 0 || class542.field8105.method1259(true, 82)) && ((var26 & 0x4) == 0 || class542.field8105.method1259(true, 81))) {
                                                if (var25 < 10) {
                                                    class106.method628((byte) 73, var25 + 1, -1, var11.field4667, "");
                                                } else if (var25 == 10) {
                                                    class178.method1188((byte) -22);
                                                    class605 var27 = method3619(var11);
                                                    class494.method2988(5, var27.field8910, var11, var27.method3517((byte) 56));
                                                    class479.field7270 = class142.method854(22227, var11);
                                                    if (class479.field7270 == null) {
                                                        class479.field7270 = "Null";
                                                    }
                                                    class323.field4798 = var11.field4531 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field4654[var25];
                                                if (var11.field4545 == null) {
                                                    var11.field4545 = new int[var11.field4540.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field4545[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field4545[var25] = class576.field8505 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field4545 != null) {
                                        var11.field4545[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class3.method16(var24.method34(-3797) - var12, var11, var24.method31(32) - var13, -2941);
                            }
                            if (class106.field1333 != null && class106.field1333 != var11 && var21 && method3619(var11).method3521((byte) -33)) {
                                class343.field5011 = var11;
                            }
                            if (class533.field7896 == var11) {
                                class591.field8751 = true;
                                class215.field3151 = var12;
                                class408.field5833 = var13;
                            }
                            if (var11.field4662 || var11.field4678 != 0) {
                                if (var21 && class509.field7565 != 0 && var11.field4590 != null) {
                                    class355 var29 = new class355();
                                    var29.field5152 = true;
                                    var29.field5150 = var11;
                                    var29.field5161 = class509.field7565;
                                    var29.field5160 = var11.field4590;
                                    class50.field595.method2492(var29, (byte) -106);
                                }
                                if (class106.field1333 != null || class139.field1826 || class4.field41 != var11.field4678 && class89.field1140 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field4678 != 0) {
                                    if (class480.field7291 == var11.field4678 || class462.field6680 == var11.field4678) {
                                        class168.field2273 = var11;
                                        if (class477.field7267 != null) {
                                            class477.field7267.method184(var11.field4620, (byte) 59, class379.field5558);
                                        }
                                        if (class480.field7291 == var11.field4678) {
                                            if (!class139.field1826 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class545.method3202(class379.field5558, -538163834, arg9, arg8);
                                                for (class25 var30 = (class25) class142.field1855.method772(0); var30 != null; var30 = (class25) class142.field1855.method775(2)) {
                                                    if (arg8 >= var30.field226 && arg8 < var30.field222 && arg9 >= var30.field223 && arg9 < var30.field224) {
                                                        class209.method1355((byte) 90);
                                                        class22.method101(var30.field221, (byte) 126);
                                                    }
                                                }
                                            }
                                            class417.method2480(var11, false, var12, var13);
                                            continue;
                                        }
                                    }
                                    if (class69.field784 == var11.field4678) {
                                        if (var11.method1920(class379.field5558, 0) == null || class529.field7847 != 0 && class529.field7847 != 3 || class139.field1826 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field4553[var32];
                                        if (var31 < var33 || var31 > var11.field4548[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field4543 / 2;
                                        int var35 = var32 - var11.field4620 / 2;
                                        int var36;
                                        if (class287.field4232 == 4) {
                                            var36 = (int) class591.field8752 & 0x3FFF;
                                        } else {
                                            var36 = (int) class591.field8752 + class225.field3322 & 0x3FFF;
                                        }
                                        int var37 = class14.field129[var36];
                                        int var38 = class14.field130[var36];
                                        if (class287.field4232 != 4) {
                                            var37 = (class99.field1254 + 256) * var37 >> 8;
                                            var38 = (class99.field1254 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class287.field4232 == 4) {
                                            var41 = (class293.field4306 >> 7) + (var39 >> 2);
                                            var42 = (class392.field5713 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class239.field3493.method514(0) - 1) * 64;
                                            var41 = (class239.field3493.field3464 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class239.field3493.field3463 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class369.field5337 && (class270.field4003 & 0x40) != 0) {
                                            class311 var44 = class240.method1540(class564.field8360, class427.field6085, true);
                                            if (var44 == null) {
                                                class178.method1188((byte) -101);
                                            } else {
                                                class436.method2670(1L, var11.field4661, 9, var42, true, (byte) -5, class479.field7270, var41, " ->", class425.field6074, false);
                                            }
                                            continue;
                                        }
                                        if (class461.field6666 == class181.field2783) {
                                            class436.method2670(1L, -1, 23, var42, true, (byte) -5, class118.field1541.method2953(3181, class77.field889), var41, "", -1, false);
                                        }
                                        class436.method2670(1L, -1, 19, var42, true, (byte) -5, class549.field8189, var41, "", class630.field9219, false);
                                        continue;
                                    }
                                    if (class4.field41 == var11.field4678) {
                                        class384.field5622 = var11;
                                        if (var21) {
                                            class582.field8560 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method34(-3797) - var12 - var11.field4543 / 2) * 2.0D / (double) class113.field1426);
                                            int var46 = (int) (-((double) (var24.method31(107) - var13 - var11.field4620 / 2) * 2.0D / (double) class113.field1426));
                                            int var47 = class296.field4338 + var45 + class113.field1445;
                                            int var48 = class527.field7824 + var46 + class113.field1434;
                                            class53 var49 = class270.method1715((byte) -14);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method269(var48, var50, var47, (byte) 122);
                                            if (var50 != null) {
                                                if (class542.field8105.method1259(true, 82) && class370.field5351 > 0) {
                                                    class591.method3444(16755, var50[1], var50[0], var50[2]);
                                                    continue;
                                                }
                                                class590.field8734 = true;
                                                class258.field3777 = var50[0];
                                                class104.field1311 = var50[1];
                                                class194.field2924 = var50[2];
                                            }
                                            class89.field1140 = 1;
                                            class67.field771 = false;
                                            class158.field2107 = class350.field5071.method635(-192);
                                            class465.field6732 = class350.field5071.method633((byte) 29);
                                            continue;
                                        }
                                        if (var22 && class89.field1140 > 0) {
                                            if (class89.field1140 == 1 && (class158.field2107 != class350.field5071.method635(-192) || class465.field6732 != class350.field5071.method633((byte) 29))) {
                                                class611.field8986 = class296.field4338;
                                                class320.field4765 = class527.field7824;
                                                class89.field1140 = 2;
                                            }
                                            if (class89.field1140 == 2) {
                                                class67.field771 = true;
                                                class147.method864(class611.field8986 + (int) ((double) (class158.field2107 - class350.field5071.method635(-192)) * 2.0D / (double) class113.field1433), (byte) 117);
                                                class34.method155(class320.field4765 - (int) ((double) (class465.field6732 - class350.field5071.method633((byte) 29)) * 2.0D / (double) class113.field1433), 28651);
                                            }
                                            continue;
                                        }
                                        if (class89.field1140 > 0 && !class67.field771) {
                                            if ((class579.field8532 == 1 || class325.method2038(2)) && class487.field7385 > 2) {
                                                class372.method2271(1, class465.field6732, class158.field2107);
                                            } else if (class372.method2266(0)) {
                                                class372.method2271(1, class465.field6732, class158.field2107);
                                            }
                                        }
                                        class89.field1140 = 0;
                                        continue;
                                    }
                                    if (class205.field3051 == var11.field4678) {
                                        if (var22) {
                                            class19.method91(class350.field5071.method633((byte) 29) - var13, var11.field4543, class350.field5071.method635(-192) - var12, var11.field4620, (byte) -108);
                                        }
                                        continue;
                                    }
                                    if (class394.field5726 == var11.field4678) {
                                        class588.method3429(32768, var13, var11, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field4593 && var23) {
                                    var11.field4593 = true;
                                    if (var11.field4518 != null) {
                                        class355 var51 = new class355();
                                        var51.field5152 = true;
                                        var51.field5150 = var11;
                                        var51.field5158 = var24.method34(-3797) - var12;
                                        var51.field5161 = var24.method31(127) - var13;
                                        var51.field5160 = var11.field4518;
                                        class50.field595.method2492(var51, (byte) -114);
                                    }
                                }
                                if (var11.field4593 && var22 && var11.field4579 != null) {
                                    class355 var52 = new class355();
                                    var52.field5152 = true;
                                    var52.field5150 = var11;
                                    var52.field5158 = class350.field5071.method635(-192) - var12;
                                    var52.field5161 = class350.field5071.method633((byte) 29) - var13;
                                    var52.field5160 = var11.field4579;
                                    class50.field595.method2492(var52, (byte) -100);
                                }
                                if (var11.field4593 && !var22) {
                                    var11.field4593 = false;
                                    if (var11.field4549 != null) {
                                        class355 var53 = new class355();
                                        var53.field5152 = true;
                                        var53.field5150 = var11;
                                        var53.field5158 = class350.field5071.method635(-192) - var12;
                                        var53.field5161 = class350.field5071.method633((byte) 29) - var13;
                                        var53.field5160 = var11.field4549;
                                        class534.field7907.method2492(var53, (byte) -104);
                                    }
                                }
                                if (var22 && var11.field4609 != null) {
                                    class355 var54 = new class355();
                                    var54.field5152 = true;
                                    var54.field5150 = var11;
                                    var54.field5158 = class350.field5071.method635(-192) - var12;
                                    var54.field5161 = class350.field5071.method633((byte) 29) - var13;
                                    var54.field5160 = var11.field4609;
                                    class50.field595.method2492(var54, (byte) -96);
                                }
                                if (!var11.field4649 && var21) {
                                    var11.field4649 = true;
                                    if (var11.field4674 != null) {
                                        class355 var55 = new class355();
                                        var55.field5152 = true;
                                        var55.field5150 = var11;
                                        var55.field5158 = class350.field5071.method635(-192) - var12;
                                        var55.field5161 = class350.field5071.method633((byte) 29) - var13;
                                        var55.field5160 = var11.field4674;
                                        class50.field595.method2492(var55, (byte) 104);
                                    }
                                }
                                if (var11.field4649 && var21 && var11.field4622 != null) {
                                    class355 var56 = new class355();
                                    var56.field5152 = true;
                                    var56.field5150 = var11;
                                    var56.field5158 = class350.field5071.method635(-192) - var12;
                                    var56.field5161 = class350.field5071.method633((byte) 29) - var13;
                                    var56.field5160 = var11.field4622;
                                    class50.field595.method2492(var56, (byte) 63);
                                }
                                if (var11.field4649 && !var21) {
                                    var11.field4649 = false;
                                    if (var11.field4595 != null) {
                                        class355 var57 = new class355();
                                        var57.field5152 = true;
                                        var57.field5150 = var11;
                                        var57.field5158 = class350.field5071.method635(-192) - var12;
                                        var57.field5161 = class350.field5071.method633((byte) 29) - var13;
                                        var57.field5160 = var11.field4595;
                                        class534.field7907.method2492(var57, (byte) 37);
                                    }
                                }
                                if (var11.field4684 != null) {
                                    class355 var58 = new class355();
                                    var58.field5150 = var11;
                                    var58.field5160 = var11.field4684;
                                    class614.field9005.method2492(var58, (byte) 109);
                                }
                                if (var11.field4681 != null && class140.field1839 > var11.field4635) {
                                    if (var11.field4591 == null || class140.field1839 - var11.field4635 > 32) {
                                        class355 var63 = new class355();
                                        var63.field5150 = var11;
                                        var63.field5160 = var11.field4681;
                                        class50.field595.method2492(var63, (byte) -81);
                                    } else {
                                        label693: for (int var59 = var11.field4635; var59 < class140.field1839; var59++) {
                                            int var60 = class225.field3319[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field4591.length; var61++) {
                                                if (var11.field4591[var61] == var60) {
                                                    class355 var62 = new class355();
                                                    var62.field5150 = var11;
                                                    var62.field5160 = var11.field4681;
                                                    class50.field595.method2492(var62, (byte) 102);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4635 = class140.field1839;
                                }
                                if (var11.field4616 != null && class551.field8205 > var11.field4547) {
                                    if (var11.field4560 == null || class551.field8205 - var11.field4547 > 32) {
                                        class355 var68 = new class355();
                                        var68.field5150 = var11;
                                        var68.field5160 = var11.field4616;
                                        class50.field595.method2492(var68, (byte) -110);
                                    } else {
                                        label669: for (int var64 = var11.field4547; var64 < class551.field8205; var64++) {
                                            int var65 = class418.field6008[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field4560.length; var66++) {
                                                if (var11.field4560[var66] == var65) {
                                                    class355 var67 = new class355();
                                                    var67.field5150 = var11;
                                                    var67.field5160 = var11.field4616;
                                                    class50.field595.method2492(var67, (byte) -92);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4547 = class551.field8205;
                                }
                                if (var11.field4663 != null && class99.field1240 > var11.field4626) {
                                    if (var11.field4573 == null || class99.field1240 - var11.field4626 > 32) {
                                        class355 var73 = new class355();
                                        var73.field5150 = var11;
                                        var73.field5160 = var11.field4663;
                                        class50.field595.method2492(var73, (byte) 85);
                                    } else {
                                        label645: for (int var69 = var11.field4626; var69 < class99.field1240; var69++) {
                                            int var70 = class248.field3626[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field4573.length; var71++) {
                                                if (var11.field4573[var71] == var70) {
                                                    class355 var72 = new class355();
                                                    var72.field5150 = var11;
                                                    var72.field5160 = var11.field4663;
                                                    class50.field595.method2492(var72, (byte) 77);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4626 = class99.field1240;
                                }
                                if (var11.field4550 != null && class312.field4686 > var11.field4544) {
                                    if (var11.field4563 == null || class312.field4686 - var11.field4544 > 32) {
                                        class355 var78 = new class355();
                                        var78.field5150 = var11;
                                        var78.field5160 = var11.field4550;
                                        class50.field595.method2492(var78, (byte) 38);
                                    } else {
                                        label621: for (int var74 = var11.field4544; var74 < class312.field4686; var74++) {
                                            int var75 = class546.field8157[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field4563.length; var76++) {
                                                if (var11.field4563[var76] == var75) {
                                                    class355 var77 = new class355();
                                                    var77.field5150 = var11;
                                                    var77.field5160 = var11.field4550;
                                                    class50.field595.method2492(var77, (byte) -116);
                                                    break label621;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4544 = class312.field4686;
                                }
                                if (var11.field4632 != null && class178.field2703 > var11.field4641) {
                                    if (var11.field4625 == null || class178.field2703 - var11.field4641 > 32) {
                                        class355 var83 = new class355();
                                        var83.field5150 = var11;
                                        var83.field5160 = var11.field4632;
                                        class50.field595.method2492(var83, (byte) 67);
                                    } else {
                                        label597: for (int var79 = var11.field4641; var79 < class178.field2703; var79++) {
                                            int var80 = class616.field9016[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field4625.length; var81++) {
                                                if (var11.field4625[var81] == var80) {
                                                    class355 var82 = new class355();
                                                    var82.field5150 = var11;
                                                    var82.field5160 = var11.field4632;
                                                    class50.field595.method2492(var82, (byte) 69);
                                                    break label597;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4641 = class178.field2703;
                                }
                                if (class559.field8304 > var11.field4523 && var11.field4660 != null) {
                                    class355 var84 = new class355();
                                    var84.field5150 = var11;
                                    var84.field5160 = var11.field4660;
                                    class50.field595.method2492(var84, (byte) 30);
                                }
                                if (class555.field8238 > var11.field4523 && var11.field4665 != null) {
                                    class355 var85 = new class355();
                                    var85.field5150 = var11;
                                    var85.field5160 = var11.field4665;
                                    class50.field595.method2492(var85, (byte) -80);
                                }
                                if (class435.field6386 > var11.field4523 && var11.field4533 != null) {
                                    class355 var86 = new class355();
                                    var86.field5150 = var11;
                                    var86.field5160 = var11.field4533;
                                    class50.field595.method2492(var86, (byte) -115);
                                }
                                if (class371.field5365 > var11.field4523 && var11.field4570 != null) {
                                    class355 var87 = new class355();
                                    var87.field5150 = var11;
                                    var87.field5160 = var11.field4570;
                                    class50.field595.method2492(var87, (byte) -99);
                                }
                                if (class151.field1944 > var11.field4523 && var11.field4555 != null) {
                                    class355 var88 = new class355();
                                    var88.field5150 = var11;
                                    var88.field5160 = var11.field4555;
                                    class50.field595.method2492(var88, (byte) 70);
                                }
                                var11.field4523 = class73.field858;
                                if (var11.field4601 != null) {
                                    for (int var89 = 0; var89 < class180.field2769; var89++) {
                                        class355 var90 = new class355();
                                        var90.field5150 = var11;
                                        var90.field5151 = class202.field3019[var89].method2367(-28783);
                                        var90.field5154 = class202.field3019[var89].method2363(28814);
                                        var90.field5160 = var11.field4601;
                                        class50.field595.method2492(var90, (byte) -105);
                                    }
                                }
                                if (class554.field8233 && var11.field4566 != null) {
                                    class355 var91 = new class355();
                                    var91.field5150 = var11;
                                    var91.field5160 = var11.field4566;
                                    class50.field595.method2492(var91, (byte) -88);
                                }
                            }
                            if (var11.field4655 == 5 && var11.field4680 != -1) {
                                var11.method1914(class458.field6652, true, class28.field255).method184(var11.field4620, (byte) 59, class379.field5558);
                            }
                            class371.method2259(var11, -1);
                            if (var11.field4655 == 0) {
                                method3611(arg0, var11.field4667, var14, var15, var16, var17, var12 - var11.field4672, var13 - var11.field4668, arg8, arg9);
                                if (var11.field4652 != null) {
                                    method3611(var11.field4652, var11.field4667, var14, var15, var16, var17, var12 - var11.field4672, var13 - var11.field4668, arg8, arg9);
                                }
                                class184 var92 = (class184) class600.field8865.method1333((long) var11.field4667, false);
                                if (var92 != null) {
                                    if (class490.field7415 == class461.field6666 && var92.field2795 == 0 && !class139.field1826 && var21 && !class220.field3252) {
                                        class209.method1355((byte) 90);
                                    }
                                    class22.method99(var92.field2796, 0, arg9, var14, var12, var13, var15, var17, var16, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class371.method2259(var11, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 3375)
    public final void method3112(byte arg0) {
        if (class239.field3499 == 2) {
            try {
                this.method3614(-2);
            } catch (Throwable var3) {
                class31.method140(var3.getMessage() + " (Recovered) " + this.method3113((byte) -61), arg0 - 32, var3);
                class447.method2712(10, 0);
            }
        } else {
            this.method3614(arg0 ^ 0x58);
        }
        if (arg0 != -90) {
            field9083 = null;
        }
        field9089++;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 3397)
    private final void method3612(int arg0) {
        field9094++;
        if (class192.field2903 == 13) {
            return;
        }
        long var2 = class139.method846((byte) 53) / 1000000L - class370.field5346;
        class370.field5346 = class139.method846((byte) 53) / 1000000L;
        boolean var4 = class591.method3442(29510);
        if (var4 && class579.field8531 && class94.field1170 != null) {
            class94.field1170.method1649(56);
        }
        if (class283.method1773(class192.field2903, -3)) {
            if (class588.field8726 != 0L && class588.field8726 < class450.method2719((byte) -49)) {
                class463.method2748(class94.field1158.field302, false, (byte) 127, class94.field1158.field269, class608.method3540(125));
            } else if (!class379.field5558.method988() && class492.field7436) {
                class306.method1883((byte) -85);
            }
        }
        if (class644.field9345 == null) {
            Container var5;
            if (class248.field3628 == null) {
                var5 = class328.field4850.field5129;
            } else {
                var5 = class248.field3628;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class248.field3628 == var5) {
                Insets var8 = class248.field3628.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class507.field7548 != var6 || class564.field8356 != var7) {
                if (class379.field5558 == null || class379.field5558.method986()) {
                    class259.method1631(true);
                } else {
                    class564.field8356 = var7;
                    class507.field7548 = var6;
                }
                class588.field8726 = class450.method2719((byte) 123) + 500L;
            }
        }
        if (class644.field9345 != null && !class85.field989 && class283.method1773(class192.field2903, -3)) {
            class463.method2748(-1, false, (byte) 125, -1, class94.field1158.field293);
        }
        boolean var9 = false;
        if (class534.field7901) {
            class534.field7901 = false;
            var9 = true;
        }
        if (var9) {
            class390.method2356((byte) 115);
        }
        if (class379.field5558 != null && class379.field5558.method988() || class608.method3540(126) != 1) {
            class539.method3164(arg0 ^ 0xFFFFFF87);
        }
        if (class192.field2903 == 0) {
            class200.method1300(arg0 ^ 0x12C, var9, class483.field7335, class347.field5042[class145.field1874], class207.field3081, class56.field686[class145.field1874], class647.field9384[class145.field1874]);
        } else if (class192.field2903 == 1) {
            class492.method2978(arg0 + 123, class347.field5042[class145.field1874].getRGB(), class379.field5558, class179.field2757, var9 | class379.field5558.method988(), class56.field686[class145.field1874].getRGB(), class647.field9384[class145.field1874].getRGB());
        } else if (class578.method3377(class192.field2903, 4548)) {
            class14.method67((byte) -74);
        } else if (class404.method2421((byte) -121, class192.field2903)) {
            class14.method67((byte) -74);
        } else if (class444.method2698(7, class192.field2903)) {
            if (class63.field736 == 1) {
                if (class200.field2996 > class167.field2265) {
                    class167.field2265 = class200.field2996;
                }
                int var10 = (class167.field2265 - class200.field2996) * 50 / class167.field2265;
                class162.method946((byte) 89, class259.field3800, true, class288.field4237.method2953(arg0 + 3178, class77.field889) + "<br>(" + var10 + "%)");
            } else if (class63.field736 == 2) {
                if (class608.field8960 > class103.field1307) {
                    class103.field1307 = class608.field8960;
                }
                int var11 = (class103.field1307 - class608.field8960) * 50 / class103.field1307 + 50;
                class162.method946((byte) 97, class259.field3800, true, class288.field4237.method2953(3181, class77.field889) + "<br>(" + var11 + "%)");
            } else {
                class162.method946((byte) 93, class259.field3800, true, class288.field4237.method2953(3181, class77.field889));
            }
        } else if (class192.field2903 == 9) {
            class351.method2147((byte) 59, var2);
        } else if (class192.field2903 == 12) {
            class162.method946((byte) 49, class259.field3800, true, class436.field6428.method2953(3181, class77.field889) + "<br>" + class539.field7978.method2953(3181, class77.field889));
        }
        if (class40.field446 == arg0) {
            for (int var12 = 0; var12 < class395.field5741; var12++) {
                Rectangle var13 = class280.field4162[var12];
                if (class359.field5215[var12]) {
                    class379.field5558.method1066((byte) 101, var13.y, -1996553985, var13.x, var13.height, var13.width);
                } else if (class644.field9344[var12]) {
                    class379.field5558.method1066((byte) 124, var13.y, -1996554240, var13.x, var13.height, var13.width);
                }
            }
        }
        if (class540.method3168(0)) {
            class262.method1673(arg0 ^ 0x3, class379.field5558);
        }
        if (class283.method1773(class192.field2903, -3) && class40.field446 == 0 && class608.method3540(119) == 1 && !var9 && class353.field5138.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class395.field5741; var15++) {
                if (class644.field9344[var15]) {
                    class644.field9344[var15] = false;
                    class119.field1551[var14++] = class280.field4162[var15];
                }
            }
            try {
                class379.field5558.method354(class119.field1551, var14);
            } catch (class477 var19) {
            }
        } else if (class192.field2903 != 0) {
            for (int var16 = 0; var16 < class395.field5741; var16++) {
                class644.field9344[var16] = false;
            }
            try {
                class379.field5558.method288();
            } catch (class477 var18) {
                class31.method140(var18.getMessage() + " (Recovered) " + this.method3113((byte) -97), -115, var18);
                class447.method2712(10, 0);
            }
        }
        if (class94.field1158.field270 == 0) {
            class428.method2624(1, 15L);
        } else if (class94.field1158.field270 == 1) {
            class428.method2624(1, 10L);
        } else if (class94.field1158.field270 == 2) {
            class428.method2624(1, 5L);
        } else if (class94.field1158.field270 == 3) {
            class428.method2624(1, 2L);
        }
        if (class318.field4752) {
            class178.method1186((byte) 61);
        }
        if (class94.field1158.field305 && class192.field2903 == 2 && class540.field8007 != -1) {
            class94.field1158.field305 = false;
            class94.field1158.method2661(class328.field4850, -1);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 3642)
    private final void method3613(int arg0) {
        field9096++;
        if (arg0 >= -32) {
            field9098 = -78;
        }
        boolean var2 = class80.field919.method2196(true);
        if (!var2) {
            this.method3617((byte) 112);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 3660)
    private final void method3614(int arg0) {
        field9086++;
        if (class192.field2903 == 13) {
            return;
        }
        class576.field8505++;
        if (~(class576.field8505 % 1000) == arg0) {
            GregorianCalendar var2 = new GregorianCalendar();
            class364.field5237 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class530.field7864.setSeed((long) class364.field5237);
        }
        if ((class576.field8505 % 50) == 0) {
            class281.field4174 = class411.field5858;
            class447.field6566 = class605.field8905;
            class411.field5858 = 0;
            class605.field8905 = 0;
        }
        this.method3613(-116);
        if (class179.field2759 != null) {
            class179.field2759.method1578((byte) 112);
        }
        class615.method3575(arg0 + 66);
        class542.field8105.method1262((byte) -14);
        class350.field5071.method641(67);
        if (class379.field5558 != null) {
            class379.field5558.method351((int) class450.method2719((byte) -88));
        }
        class455.method2734(true);
        class180.field2769 = 0;
        class609.field8964 = 0;
        for (class454 var3 = class542.field8105.method1258(2048); var3 != null; var3 = class542.field8105.method1258(2048)) {
            int var6 = var3.method2360(true);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2363(arg0 ^ 0xFFFF8F70);
                if (class392.method2366(46) && var7 == '`' || var7 == '§') {
                    if (class540.method3168(0)) {
                        class530.method3125((byte) 28);
                    } else {
                        class51.method258(0);
                    }
                } else if (class180.field2769 < 128) {
                    class202.field3019[class180.field2769] = var3;
                    class180.field2769++;
                }
            } else if (var6 == 0 && class609.field8964 < 75) {
                class257.field3758[class609.field8964] = var3;
                class609.field8964++;
            }
        }
        class509.field7565 = 0;
        for (class497 var4 = class350.field5071.method632((byte) 104); var4 != null; var4 = class350.field5071.method632((byte) 104)) {
            int var5 = var4.method32((byte) 77);
            if (var5 == -1) {
                class498.field7482.method2492(var4, (byte) 127);
            } else if (var5 == 6) {
                class509.field7565 += var4.method30(true);
            } else if (class509.method3042(var5, (byte) 122)) {
                class281.field4170.method2492(var4, (byte) -88);
                if (class281.field4170.method2491(arg0 ^ 0x48C0) > 10) {
                    class281.field4170.method2498((byte) 100);
                }
            }
        }
        if (class540.method3168(0)) {
            class427.method2545(-1);
        }
        if (class192.field2903 == 0) {
            this.method3610(true);
            class304.method1879(arg0 ^ 0xFFFFFFFE);
        } else if (class192.field2903 == 1) {
            this.method3610(true);
            class304.method1879(0);
        } else if (class444.method2698(7, class192.field2903)) {
            class97.method566(-1);
        }
        if (class152.method894(class192.field2903, 1) && !class444.method2698(7, class192.field2903)) {
            this.method3604((byte) 85);
            class421.method2505(true);
            class304.method1873(126);
        } else if (class242.method1563((byte) 126, class192.field2903) && !class444.method2698(7, class192.field2903)) {
            this.method3604((byte) 85);
            class304.method1873(arg0 ^ 0x5E);
        } else if (class192.field2903 == 11) {
            class304.method1873(arg0 ^ 0x5F);
        } else if (class196.method1263((byte) -50, class192.field2903) && !class444.method2698(7, class192.field2903)) {
            class22.method98(arg0);
        } else if (class192.field2903 == 12) {
            class304.method1873(47);
            if (class308.field4490 != -3 && class308.field4490 != 2 && class308.field4490 != 15) {
                class550.method3221(0, false);
            }
        }
        class622.method3627(class379.field5558, (byte) 113);
        class281.field4170.method2498((byte) 68);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 3834)
    public static final void method3615() {
        int var0 = class264.field3925;
        int[] var1 = class533.field7895;
        int var2 = class534.field7903 ? var0 : class567.field8409 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class86 var4;
            if (var3 < var0) {
                var4 = class383.field5604[var1[var3]];
            } else {
                var4 = ((class234) class627.field9185.method1333((long) class25.field230[var3 - var0], false)).field3443;
            }
            if (var4.field1070 >= 0) {
                int var5 = var4.method514(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3464 & 0x7F) == 0 && (var4.field3463 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field3464 & 0x7F) == 64 && (var4.field3463 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class179 && var4.field1095 != null && class576.field8505 >= var4.field1095.field6598 && class576.field8505 < var4.field1095.field6608) {
                    ((class179) var4).field2734 = false;
                }
                var4.field3460 = class226.method1477(var4.field3457, true, var4.field3464, var4.field3463);
                class390.method2355(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3879)
    public static final void method3616() {
        class517.field7691 = 0;
        for (int var0 = 0; var0 < class567.field8409; var0++) {
            class383 var1 = ((class234) class627.field9185.method1333((long) class25.field230[var0], false)).field3443;
            if (var1.field1034 && var1.method503(-1) != -1) {
                int var2 = (var1.method514(0) - 1) * 64 + 60;
                int var3 = var1.field3464 - var2 >> 7;
                int var4 = var1.field3463 - var2 >> 7;
                class86 var5 = class112.method664(-19950, var3, var4, var1.field3457);
                if (var5 != null) {
                    int var6 = var5.field1053;
                    if (var5 instanceof class383) {
                        var6 += 2048;
                    }
                    if (var5.field1033 == 0 && var5.method503(-1) != -1) {
                        class298.field4350[class517.field7691] = var6;
                        class11.field101[class517.field7691] = var6;
                        class517.field7691++;
                        var5.field1033++;
                    }
                    class298.field4350[class517.field7691] = var6;
                    class11.field101[class517.field7691] = var1.field1053 + 2048;
                    class517.field7691++;
                    var5.field1033++;
                }
            }
        }
        class41.method211(class517.field7691 - 1, class11.field101, class298.field4350, 74, 0);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 3931)
    private final void method3617(byte arg0) {
        field9085++;
        if (class80.field919.field5193 > class19.field180) {
            class489.field7405 = (class80.field919.field5193 - 1) * 50 * 5;
            class536.field7933.field6634 = !class536.field7933.field6634;
            if (class489.field7405 > 3000) {
                class489.field7405 = 3000;
            }
            if (class80.field919.field5193 >= 2 && class80.field919.field5192 == 6) {
                this.method3108("js5connect_outofdate", -1);
                class192.field2903 = 13;
                return;
            }
            if (class80.field919.field5193 >= 4 && class80.field919.field5192 == -1) {
                this.method3108("js5crc", -1);
                class192.field2903 = 13;
                return;
            }
            if (class80.field919.field5193 >= 4 && class273.method1725(class192.field2903, (byte) 97)) {
                if (class80.field919.field5192 == 7 || class80.field919.field5192 == 9) {
                    this.method3108("js5connect_full", -1);
                } else if (class80.field919.field5192 > 0) {
                    this.method3108("js5connect", -1);
                } else {
                    this.method3108("js5io", -1);
                }
                class192.field2903 = 13;
                return;
            }
        }
        class19.field180 = class80.field919.field5193;
        if (arg0 < 40) {
            field9083 = null;
        }
        if (class489.field7405 > 0) {
            class489.field7405--;
            return;
        }
        try {
            if (class287.field4229 == 0) {
                class511.field7595 = class328.field4850.method2164(class536.field7933.field6630, (byte) -96, class536.field7933.method2731(-3386));
                class287.field4229++;
            }
            if (class287.field4229 == 1) {
                if (class511.field7595.field4208 == 2) {
                    this.method3607(1000, (byte) 90);
                    return;
                }
                if (class511.field7595.field4208 == 1) {
                    class287.field4229++;
                }
            }
            if (class287.field4229 == 2) {
                class425.field6073 = new class51((Socket) class511.field7595.field4213, class328.field4850);
                class428 var2 = new class428(5);
                var2.method2563(-13021, class538.field7959.field8954);
                var2.method2576(true, 607);
                class425.field6073.method255(0, 5, false, var2.field6162);
                class287.field4229++;
                class637.field9278 = class450.method2719((byte) 121);
            }
            if (class287.field4229 == 3) {
                if (class273.method1725(class192.field2903, (byte) 50) || class425.field6073.method257((byte) 48) > 0) {
                    int var3 = class425.field6073.method265(-31512);
                    if (var3 != 0) {
                        this.method3607(var3, (byte) 41);
                        return;
                    }
                    class287.field4229++;
                } else if ((class450.method2719((byte) -35) - class637.field9278) > 30000L) {
                    this.method3607(1001, (byte) 49);
                    return;
                }
            }
            if (class287.field4229 == 4) {
                boolean var4 = class192.field2903 == 1 || class152.method894(class192.field2903, 1) || class242.method1563((byte) 123, class192.field2903);
                class80.field919.method2188(0, !var4, class425.field6073);
                class287.field4229 = 0;
                class511.field7595 = null;
                class425.field6073 = null;
            }
        } catch (IOException var5) {
            this.method3607(1002, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwca;)Z", line = 4074)
    public static final boolean method3618(class311 arg0) {
        if (class220.field3252) {
            if (method3619(arg0).field8904 != 0) {
                return false;
            }
            if (arg0.field4655 == 0) {
                return false;
            }
        }
        return arg0.field4577;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwca;)Lqe;", line = 4089)
    public static final class605 method3619(class311 arg0) {
        class605 var1 = (class605) class125.field1642.method1333(((long) arg0.field4667 << 32) + (long) arg0.field4558, false);
        return var1 == null ? arg0.field4648 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I[B)V", line = 4093)
    private final void method3620(int arg0, byte[] arg1) {
        field9082++;
        class428 var3 = new class428(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method2561((byte) 120);
                if (var4 == 0) {
                    if (arg0 != 5) {
                        field9083 = null;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class120.field1557 = new int[6];
                    var5[0] = var3.method2620(72);
                    var5[1] = var3.method2620(class342.method2119(arg0, 80));
                    var5[2] = var3.method2620(105);
                    var5[3] = var3.method2620(arg0 + 17);
                    var5[4] = var3.method2620(20);
                    var5[5] = var3.method2620(arg0 + 92);
                } else if (var4 == 4) {
                    int var6 = var3.method2561((byte) -106);
                    class152.field1952 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class152.field1952[var7] = var3.method2620(25);
                        if (class152.field1952[var7] == 65535) {
                            class152.field1952[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method2561((byte) -66);
                    class19.field174 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class19.field174[var9] = var3.method2620(114);
                        if (class19.field174[var9] == 65535) {
                            class19.field174[var9] = -1;
                        }
                    }
                }
            }
        }
    }
}
