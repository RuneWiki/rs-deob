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
public class client extends class234 {

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "J")
    public static volatile long field4106 = 0L;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private static int field4112;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lni;")
    public static class522 field4109;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field4116;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Z")
    public static boolean field4117;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[[B")
    public static byte[][] field4115;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1836(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 5)
    private final void method1818(byte arg0) {
        field4113++;
        if (class713.field9949 == 14) {
            return;
        }
        long var2 = class288.method1727(58) / 1000000L - class756.field10548;
        class756.field10548 = class288.method1727(arg0 + 67) / 1000000L;
        boolean var4 = class404.method2338(arg0 + 13308);
        if (var4 && class31.field270 && class566.field7989 != null) {
            class566.field7989.method495((byte) -99);
        }
        if (class557.method3154((byte) 101, class713.field9949)) {
            if (class376.field5228 != 0L && class538.method2963(-47) > class376.field5228) {
                class426.method2445(class381.method2243((byte) 12), class401.field5669, 3, class7.field49, false);
            } else if (!class21.field142.method450() && class689.field9654) {
                class201.method1114((byte) -51);
            }
        }
        if (class526.field7067 == null) {
            Container var5;
            if (class271.field3587 != null) {
                var5 = class271.field3587;
            } else if (class144.field1868 == null) {
                var5 = class561.field7928;
            } else {
                var5 = class144.field1868;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class271.field3587 == var5) {
                Insets var8 = class271.field3587.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class496.field6749 != var6 || class305.field4136 != var7 || class139.field1786) {
                if (class21.field142 == null || class21.field142.method419()) {
                    class716.method4005((byte) -98);
                } else {
                    class305.field4136 = var7;
                    class496.field6749 = var6;
                }
                class376.field5228 = class538.method2963(-47) + 500L;
                class139.field1786 = false;
            }
        }
        if (class526.field7067 != null && !class51.field539 && class557.method3154((byte) -51, class713.field9949)) {
            class426.method2445(class11.field68.field5517.method2812((byte) 126), -1, arg0 + 12, -1, false);
        }
        boolean var9 = false;
        if (class468.field6471) {
            class468.field6471 = false;
            var9 = true;
        }
        if (var9) {
            class105.method713(arg0 ^ 0xFFFFC91C);
        }
        if (class21.field142 != null && class21.field142.method450() || class381.method2243((byte) 110) != 1) {
            class340.method2004(2);
        }
        if (class32.method148(class713.field9949, 126)) {
            class219.method1244((byte) 50, var9);
        } else if (class56.method320(class713.field9949, (byte) -7)) {
            class61.method463(126);
        } else if (class527.method2925(class713.field9949, (byte) -116)) {
            class61.method463(105);
        } else if (class301.method1811(class713.field9949, ~arg0)) {
            if (class707.field9898 == 1) {
                if (class527.field7071 < class358.field4754) {
                    class527.field7071 = class358.field4754;
                }
                int var10 = (class527.field7071 - class358.field4754) * 50 / class527.field7071;
                class396.method2303(-75, class294.field3954, class399.field5650, true, class21.field142, class755.field10492.method4201(class723.field10095, (byte) 25) + "<br>(" + var10 + "%)");
            } else if (class707.field9898 == 2) {
                if (class579.field8117 > class268.field3550) {
                    class268.field3550 = class579.field8117;
                }
                int var11 = (class268.field3550 - class579.field8117) * 50 / class268.field3550 + 50;
                class396.method2303(-51, class294.field3954, class399.field5650, true, class21.field142, class755.field10492.method4201(class723.field10095, (byte) 25) + "<br>(" + var11 + "%)");
            } else {
                class396.method2303(-115, class294.field3954, class399.field5650, true, class21.field142, class755.field10492.method4201(class723.field10095, (byte) 25));
            }
        } else if (class713.field9949 == 10) {
            class654.method3693(var2, -54);
        } else if (class713.field9949 == 13) {
            class396.method2303(arg0 ^ 0x48, class294.field3954, class399.field5650, false, class21.field142, class755.field10494.method4201(class723.field10095, (byte) 25) + "<br>" + class755.field10495.method4201(class723.field10095, (byte) 25));
        }
        if (class171.field2132 == 3) {
            for (int var12 = 0; var12 < class497.field6763; var12++) {
                Rectangle var13 = class733.field10219[var12];
                if (class362.field4797[var12]) {
                    class21.field142.method393(true, var13.height, var13.width, -65281, var13.x, var13.y);
                } else if (class12.field78[var12]) {
                    class21.field142.method393(true, var13.height, var13.width, -65536, var13.x, var13.y);
                } else {
                    class21.field142.method393(true, var13.height, var13.width, -16711936, var13.x, var13.y);
                }
            }
        }
        if (class587.method3268(-8001)) {
            class93.method648(class21.field142, (byte) 126);
        }
        if (class287.field3823.field10283 && class557.method3154((byte) 105, class713.field9949) && class171.field2132 == 0 && class381.method2243((byte) 104) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class497.field6763; var15++) {
                if (class12.field78[var15]) {
                    class12.field78[var15] = false;
                    class268.field3551[var14++] = class733.field10219[var15];
                }
            }
            try {
                if (class247.field3206) {
                    class552.method3139(class268.field3551, var14, arg0 ^ 0xFFFFFEF3);
                } else {
                    class21.field142.method411(class268.field3551, var14, arg0 + 27188);
                }
            } catch (class353 var20) {
            }
        } else if (!class32.method148(class713.field9949, arg0 + 136)) {
            for (int var16 = 0; var16 < class497.field6763; var16++) {
                class12.field78[var16] = false;
            }
            try {
                if (class247.field3206) {
                    class348.method2031((byte) 10);
                } else {
                    class21.field142.method360(109);
                }
            } catch (class353 var19) {
                class760.method4223(var19, -126, var19.getMessage() + " (Recovered) " + this.method1409(0));
                class479.method2689(0, false, arg0 + 64);
            }
        }
        if (arg0 != -9) {
            return;
        }
        class652.method3680((byte) 101);
        int var18 = class11.field68.field5496.method1271((byte) 121);
        if (var18 == 0) {
            class267.method1599(0, 15L);
        } else if (var18 == 1) {
            class267.method1599(0, 10L);
        } else if (var18 == 2) {
            class267.method1599(0, 5L);
        } else if (var18 == 3) {
            class267.method1599(arg0 ^ 0xFFFFFFF7, 2L);
        }
        if (class231.field2977) {
            class727.method4075(false);
        }
        if (class11.field68.field5528.method3595((byte) 123) == 1 && class713.field9949 == 3 && class116.field1543 != -1) {
            class11.field68.method2276((byte) -13, 0, class11.field68.field5528);
            class355.method2054(-5964);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 263)
    public static void method1819(int arg0) {
        field4115 = null;
        if (arg0 >= -80) {
            field4112 = 10;
        }
        field4109 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 276)
    public final void method1405(int arg0) {
        method1819(-108);
        field4114++;
        class320.method1911((byte) 102);
        class520.method2865(-25882);
        class252.method1498((byte) 20);
        class755.method4202(38);
        class236.method1424((byte) 72);
        class70.method525(-1);
        class4.method11(false);
        class549.method3111((byte) 70);
        class656.method3711(false);
        class519.method2861((byte) -10);
        class652.method3681((byte) -117);
        class285.method1709((byte) -20);
        class392.method2286(0);
        class55.method313(false);
        class459.method2562((byte) -97);
        class348.method2029(2566);
        class303.method1816((byte) -112);
        class242.method1452(true);
        class60.method401(false);
        class391.method2271(true);
        class733.method4106(false);
        class641.method3606(-13);
        class633.method3551(arg0 ^ 0xFFFFEE74);
        class108.method721(false);
        class232.method1372(arg0 ^ 0x169E);
        class531.method2937((byte) 118);
        class660.method3733((byte) -101);
        class522.method2897(1);
        class332.method1971(true);
        class465.method2590(-24652);
        class262.method1567((byte) 22);
        class226.method1345(51);
        class162.method956((byte) 2);
        class731.method4096(-23881);
        class170.method984(0);
        class256.method1525(-1);
        class258.method1555((byte) 64);
        class600.method3320((byte) -109);
        class476.method2674((byte) 118);
        class735.method4114(-98);
        class277.method1651(-8433);
        class231.method1368((byte) 121);
        class728.method4082((byte) -82);
        class50.method298(arg0 + 36);
        class380.method2223(true);
        class501.method2800((byte) -124);
        class131.method826((byte) -67);
        class622.method3518(-19357);
        class568.method3195(true);
        class579.method3239(0);
        class304.method1841(false);
        class491.method2754((byte) -102);
        class268.method1607(-121);
        class706.method3976(true);
        class238.method1442(arg0 + 145149062);
        class611.method3442(81);
        class570.method3203(-20732);
        class547.method3101(77);
        class21.method83(-94);
        class294.method1756((byte) 83);
        class137.method852(-121);
        class469.method2639(-211);
        class29.method114((byte) -81);
        class118.method773(true);
        class83.method616(-2485);
        class690.method3900(arg0 ^ 0xFFFFFF9A);
        class278.method1654(true);
        class103.method704((byte) -90);
        class624.method3527(4390);
        class48.method282(107);
        class215.method1199(false);
        class526.method2918(0);
        class703.method3964((byte) 116);
        class506.method2818(26767);
        class166.method973(arg0 - 1);
        class359.method2063(30);
        class538.method2962(-59);
        class427.method2448((byte) 53);
        class695.method3924(-100);
        class564.method3176(43594);
        class194.method1081(16711935);
        class496.method2767(23950);
        class435.method2470(109);
        class216.method1204((byte) 80);
        class440.method2486((byte) 122);
        class148.method911(-2229);
        class452.method2526(arg0 ^ 0xFFFFFFD8);
        class300.method1800((byte) -26);
        class474.method2668(1);
        class472.method2654(arg0);
        class66.method509(false);
        class308.method1862(-15136);
        class342.method2015(100);
        class355.method2053((byte) -59);
        class685.method3885(-40);
        class696.method3927(38);
        class281.method1686(true);
        class150.method920((byte) -119);
        class574.method3225(arg0 - 72);
        class61.method478(-2);
        class13.method52(arg0 ^ 0xFFFFC793);
        class566.method3185(-1);
        class330.method1959(-111);
        class385.method2256(true);
        class473.method2662(-110);
        class607.method3355(-2);
        class127.method812(-96);
        class721.method4057(0);
        class210.method1172(-36);
        class571.method3211(34);
        class14.method56(arg0 ^ 0x10);
        class205.method1146(arg0 ^ 0xFFFF81DA);
        class478.method2686((byte) -51);
        class421.method2406(arg0 ^ 0x3);
        class39.method190(arg0 + 3);
        class480.method2693(8);
        class608.method3361(0);
        class110.method742(arg0);
        class38.method188(arg0 ^ 0xFFFFF1D9);
        class190.method1062(arg0 + 8192);
        class504.method2811(2);
        class200.method1108((byte) -58);
        class331.method1960((byte) -13);
        class223.method1270(4);
        class467.method2632((byte) 81);
        class639.method3598((byte) 122);
        class112.method751(97);
        class666.method3759(arg0 + 109);
        class18.method78(-19351);
        class758.method4215(0);
        class353.method2046((byte) -127);
        class487.method2745(true);
        class416.method2396(-112);
        class583.method3256(-115);
        class551.method3132(arg0 ^ 0xFFFFF24B);
        class120.method782(-128);
        class176.method1007((byte) -67);
        class716.method4002(0);
        class233.method1390(arg0);
        class573.method3217(115);
        class498.method2785();
        class125.method802(-9);
        class638.method3587(arg0 + 21237);
        class655.method3701(arg0 + 10);
        class293.method1746((byte) 95);
        class482.method2710(-3);
        class333.method1986(-18925);
        class193.method1077((byte) -119);
        class229.method1362(~arg0);
        class386.method2259((byte) 97);
        class489.method2752(1);
        class509.method2828(255);
        class681.method3868(-19788);
        class462.method2573((byte) -124);
        class505.method2815((byte) -119);
        class72.method533((byte) 49);
        class596.method3302(0);
        class140.method865((byte) -27);
        class642.method3627();
        class208.method1168(arg0 ^ 0x50);
        class344.method2019(0);
        class181.method1031((byte) -73);
        class99.method687(false);
        class659.method3726(-746085692);
        class289.method1730((byte) -47);
        class46.method276(0);
        class591.method3284((byte) -116);
        class676.method3844((byte) -60);
        class82.method604((byte) 54);
        class363.method2079((byte) -47);
        class158.method951(110);
        class651.method3677(2169);
        class62.method483((byte) -101);
        class665.method3758(2);
        class550.method3125();
        class351.method2043(-10494);
        class163.method963(30935);
        class615.method3463((byte) 7);
        class105.method718(-124);
        class525.method2914((byte) -69);
        class623.method3524(1204);
        class237.method1433(false);
        class192.method1076(57);
        class513.method2841(58);
        class119.method776();
        class202.method1120((byte) -101);
        class56.method318(arg0 ^ 0x79);
        class71.method531((byte) -63);
        class404.method2337(24301);
        class464.method2584(arg0 ^ 0x4C);
        class357.method2057(4);
        class358.method2058(-1);
        class669.method3768(68);
        class643.method3633((byte) 67);
        class142.method883(arg0 + 288450632);
        class699.method3952(-123);
        class719.method4043((byte) -93);
        class744.method4158(4);
        class603.method3336(-1);
        class94.method653(-1443);
        class141.method873();
        class653.method3683(arg0 - 75);
        class614.method3457(arg0 ^ 0xFFFFFF84);
        class388.method2267(-20899);
        class683.method3869();
        class191.method1067(35);
        class423.method2418((byte) 5);
        class49.method290(false);
        class88.method636(arg0 ^ 0x1765);
        class101.method698((byte) 112);
        class57.method325();
        class675.method3839(84);
        class169.method982((byte) -40);
        class677.method3849(1);
        class301.method1808(false);
        class599.method3319(false);
        class68.method515(arg0 ^ 0xFFFFC312);
        class171.method991((byte) 85);
        class135.method842(0);
        class264.method1581(-49);
        class589.method3279((byte) -63);
        class736.method4119(86);
        class732.method4099(true);
        class742.method4153((byte) -99);
        class327.method1947(-1025810040);
        class346.method2022(-11543);
        class76.method563(arg0 ^ 0xFFFFFFF7);
        class115.method760((byte) 107);
        class646.method3643(-11535);
        class687.method3891((byte) 41);
        class291.method1734(121);
        class552.method3138(79);
        class84.method619(true);
        class563.method3172(-386);
        class396.method2301((byte) -101);
        class33.method154((byte) -29);
        class640.method3604(arg0);
        class267.method1601((byte) 64);
        class347.method2026(true);
        class270.method1613(arg0 + 5);
        class165.method970((byte) 126);
        class634.method3564((byte) 99);
        class276.method1645(2);
        class539.method2964((byte) -53);
        class30.method135((byte) -37);
        class534.method2948((byte) 97);
        class43.method263(11);
        class312.method1870((byte) -94);
        class536.method2955(-1001);
        class98.method683(-22408);
        class25.method100(-17344);
        class266.method1594(3);
        class425.method2431(false);
        class750.method4181((byte) 122);
        class6.method15(arg0);
        class717.method4040(arg0 + 3);
        class746.method4164((byte) -106);
        class275.method1643(true);
        class424.method2425(2);
        class511.method2834(true);
        class658.method3722((byte) 52);
        class288.method1726(58);
        class263.method1579(arg0 + 10003);
        class58.method334(false);
        class335.method1993(-92);
        class761.method4234((byte) 37);
        class635.method3576(92);
        class713.method3994((byte) 70);
        class77.method571(true);
        class686.method3890(-71);
        class707.method3979(0);
        class173.method997(true);
        class149.method914(65535);
        class244.method1465(-23308);
        class188.method1056((byte) -124);
        class723.method4063(0);
        class453.method2530();
        class449.method2517(-88);
        class86.method625(22412);
        class73.method536(true);
        class754.method4198(arg0 + 25581);
        class265.method1589(-1);
        class704.method3971((byte) 102);
        class561.method3167(0);
        class317.method1892(1);
        class629.method3546(arg0 - 112);
        class273.method1629(97);
        class64.method490((byte) 116);
        class175.method1004(0);
        class636.method3582((byte) 87);
        class315.method1885((byte) -3);
        class426.method2441(false);
        class609.method3371();
        class477.method2683((byte) -84);
        class164.method968(arg0);
        class126.method810();
        class720.method4051();
        class734.method4107(true);
        class667.method3761();
        class645.method3641(104);
        class287.method1725(4);
        class577.method3234((byte) -71);
        class52.method308((byte) 123);
        class407.method2350(arg0);
        class471.method2651((byte) -127);
        class587.method3269((byte) 101);
        class494.method2764((byte) 16);
        class246.method1478(true);
        class684.method3870(-115);
        class147.method909((byte) -10);
        class411.method2364(arg0 ^ 0xFFFFF145);
        class203.method1121(arg0 ^ 0x7A);
        class180.method1029(false);
        class499.method2789(false);
        class37.method185(51);
        class438.method2479(arg0 + 7681);
        class129.method817(0);
        class146.method899(arg0 ^ 0x1);
        class409.method2360((byte) 49);
        class228.method1355();
        class206.method1150(1);
        class178.method1015((byte) 74);
        class51.method303(10);
        class324.method1936((byte) -112);
        class295.method1763((byte) 116);
        class408.method2357(-6086);
        class195.method1082(0);
        class272.method1627((byte) -108);
        class271.method1618(15029);
        class598.method3310((byte) 71);
        class661.method3740((byte) 102);
        class8.method21((byte) 45);
        class201.method1113(114);
        class69.method517(arg0 ^ 0xFFFFFF84);
        class726.method4072(127);
        class106.method719(false);
        class753.method4194(-104);
        class710.method3984(-20830);
        class606.method3350(64);
        class541.method3005(arg0);
        class307.method1860((byte) -59);
        class698.method3947(false);
        class412.method2381(13);
        class688.method3892((byte) 113);
        class463.method2583((byte) 112);
        class253.method1508((byte) 66);
        class286.method1719(arg0 ^ 0x1702);
        class365.method2088(true);
        class616.method3472(-40);
        class627.method3544(false);
        class495.method2765(-16573);
        class381.method2230(0);
        class475.method2671((byte) 23);
        class183.method1036(-125);
        class132.method834(false);
        class367.method2160(true);
        class239.method1444(arg0 - 116);
        class594.method3290(-120);
        class399.method2310(arg0 ^ 0x68DD);
        class648.method3655(-51);
        class514.method2842((byte) 15);
        class743.method4157((byte) -18);
        class619.method3508((byte) 114);
        class493.method2761(arg0 + 87);
        class143.method896(arg0 + 1);
        class78.method582(-1);
        class488.method2749((byte) -108);
        class729.method4092(255);
        class235.method1419(13);
        class362.method2074(false);
        class497.method2772(7315);
        class544.method3089();
        class418.method2402((byte) -121);
        class93.method647(true);
        class759.method4219(true);
        class507.method2822((byte) 98);
        class586.method3265((byte) 21);
        class3.method8((byte) 114);
        class576.method3230(arg0 - 80);
        class19.method79(119);
        class22.method87(615);
        class124.method799(false);
        class441.method2490((byte) 40);
        class626.method3538(arg0 + 125);
        class167.method977(arg0 + 2048);
        class565.method3180(0);
        class350.method2033(arg0 + 82);
        class26.method101(false);
        class374.method2201((byte) -100);
        class85.method621(10640);
        class593.method3287(4096);
        class559.method3159(arg0 ^ 0xFFFFFFA5);
        class1.method6(0);
        class692.method3903(75);
        class214.method1192(83);
        class197.method1093(arg0);
        class12.method46(0);
        class727.method4079(-1);
        class422.method2412((byte) -48);
        class413.method2387(-19406);
        class316.method1891();
        class582.method3254((byte) 29);
        class117.method772((byte) 13);
        class28.method110((byte) 21);
        class393.method2290(true);
        class527.method2924(1);
        class631.method3548(109);
        class139.method864((byte) -128);
        class604.method3341((byte) -81);
        class257.method1539(arg0 ^ 0xFFFFFF80);
        class387.method2264(-43327976);
        class503.method2807((byte) 113);
        class283.method1698(-24883);
        class361.method2070(arg0 ^ Integer.MAX_VALUE);
        class199.method1103((byte) 95);
        class290.method1731(false);
        class322.method1923(9949);
        class24.method96(6406);
        class518.method2854(true);
        class318.method1900(-22268);
        class321.method1916((byte) 44);
        class32.method146(true);
        class569.method3201(1);
        class702.method3960(90);
        class354.method2051(32414);
        class100.method688(arg0 ^ 0xFFFF903A);
        class578.method3238((byte) 89);
        class213.method1186(73);
        class102.method700(32132);
        class725.method4068(arg0 ^ 0xFFFFFFCA);
        class460.method2564(0);
        class31.method139(-3);
        class443.method2491((byte) -101);
        class415.method2393(23777);
        class337.method1999(928);
        class580.method3245(-70);
        class555.method3149(-6569);
        class219.method1243(arg0);
        class545.method3096(-382);
        class625.method3536(-129);
        class114.method758(22011);
        class136.method846(-16841);
        class601.method3325(true);
        class610.method3379(14441);
        class546.method3097((byte) -107);
        class97.method664(-14320);
        class133.method836(13);
        class431.method2464(arg0 - 10);
        class116.method769(8);
        class185.method1044(arg0 ^ 0x46C2E462);
        class557.method3156((byte) 77);
        class479.method2688(116);
        class584.method3259((byte) 19);
        class161.method953((byte) 4);
        class144.method898((byte) 105);
        class457.method2551(-128);
        class343.method2018(arg0 + 13432);
        class516.method2847(true);
        class461.method2567(10);
        class537.method2960(arg0);
        class245.method1467(0);
        class553.method3141((byte) 86);
        class284.method1700((byte) 0);
        class122.method788((byte) 122);
        class556.method3150(arg0);
        class430.method2455(true);
        class130.method821(arg0 + 14);
        class179.method1021(-95);
        class212.method1180(0);
        class621.method3515((byte) -122);
        class182.method1034(-15870);
        class420.method2403((byte) -101);
        class302.method1813((byte) 102);
        class450.method2521(-1);
        class395.method2299((byte) 119);
        class654.method3691(arg0 + 27387);
        class512.method2836(573132577);
        class339.method2003((byte) -80);
        class554.method3144((byte) -62);
        class532.method2946((byte) 78);
        class309.method1864(false);
        class585.method3262(-2496);
        class535.method2950(126);
        class523.method2908(false);
        class414.method2392((byte) 4);
        class299.method1794(-63);
        class650.method3670(76);
        class401.method2323(true);
        class109.method737(false);
        class617.method3474(-6292);
        class756.method4210((byte) 118);
        class227.method1350(true);
        class42.method256(125);
        class751.method4184(-15367);
        class211.method1175(0);
        class410.method2363(-1);
        class224.method1277(0);
        class11.method42(arg0 ^ 0x7166);
        class517.method2850((byte) -28);
        class397.method2306(-12477);
        class296.method1766(arg0 ^ 0x3CA9);
        class15.method64(arg0 + 8);
        class402.method2324((byte) -54);
        class63.method487((byte) 120);
        class360.method2065((byte) -102);
        class375.method2203(115);
        class745.method4159((byte) 11);
        class310.method1866((byte) -6);
        class222.method1265((byte) -30);
        class389.method2269(true);
        class647.method3645((byte) 72);
        class255.method1517((byte) -1);
        class705.method3972((byte) 89);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 807)
    public static final void method1820() {
        for (int var0 = 0; var0 < class272.field3589; var0++) {
            int[] var1 = class397.field5634[var0];
            for (int var2 = 0; var2 < class3.field26; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsba;)Lsba;", line = 830)
    public static final class218 method1821(class218 arg0) {
        int var1 = method1835(arg0).method3962(1);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class357.method2056(arg0.field2693, -9820);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILha;)V", line = 854)
    public static final void method1822(int arg0, class60 arg1) {
        field4102++;
        if (arg0 != 0) {
            field4112 = -100;
        }
        if (class445.field6185 != class653.field9086.field2175 && class77.field947 != null && class724.method4065(arg1, class653.field9086.field2175, 8939)) {
            class445.field6185 = class653.field9086.field2175;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 874)
    public final void method1408(int arg0) {
        field4097++;
        if (class11.field68.field5503.method741((byte) 123) == 2) {
            try {
                this.method1818((byte) -9);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class760.method4223(var5, -124, var5.getMessage() + " (Recovered) " + this.method1409(0));
                class598.field8329 = true;
                class479.method2689(0, false, 70);
            }
        } else {
            this.method1818((byte) -9);
        }
        if (arg0 <= 91) {
            method1829(-22);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lsba;IIIIIIIIIII)V", line = 901)
    public static final void method1823(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class218 var13 = arg0[var12];
            if (var13 != null && var13.field2693 == arg1) {
                int var14 = var13.field2824 + arg6;
                int var15 = var13.field2768 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field2832 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field2781 + var14;
                    int var21 = var13.field2718 + var15;
                    if (var13.field2832 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field2832 == 0 || var13.field2667 || method1835(var13).field9868 != 0 || class63.field690 == var13 || class665.field9263 == var13.field2776 || class147.field1895 == var13.field2776) {
                    if (!method1830(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class247.field3206) {
                            var22 = class63.method488((byte) 42);
                            var23 = class231.method1364(false);
                        }
                        if (class72.field774 == var13 && class50.method295(4456, class72.field774) != null) {
                            class18.field123 = true;
                            class171.field2136 = var14;
                            class118.field1563 = var15;
                        }
                        if (var13.field2681 || var16 < var18 && var17 < var19) {
                            if (var13.field2752 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class404 var24 = (class404) class213.field2550.method724(32); var24 != null; var24 = (class404) class213.field2550.method723(103)) {
                                    if (var24.field5708) {
                                        var24.method315(118);
                                        var24.field5714.field2796 = false;
                                    }
                                }
                                if (class125.field1633 == 0) {
                                    class72.field774 = null;
                                    class63.field690 = null;
                                }
                                class259.field3393 = 0;
                                class531.field7208 = false;
                                class549.field7776 = false;
                                if (!class83.field1156) {
                                    class403.method2331((byte) 103);
                                }
                            }
                            boolean var25;
                            if (class427.field6034.method528(124) + var22 >= var16 && class427.field6034.method521((byte) 60) + var23 >= var17 && class427.field6034.method528(70) + var22 < var18 && class427.field6034.method521((byte) 49) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class595.field8291 && var25) {
                                if (var13.field2789 >= 0) {
                                    class553.field7817 = var13.field2789;
                                } else if (var13.field2752) {
                                    class553.field7817 = -1;
                                }
                            }
                            if (!class83.field1156 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class600.method3322(59, var13, arg11 - var15, arg10 - var14);
                            }
                            boolean var26 = false;
                            if (class427.field6034.method520((byte) 121) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class314 var28 = (class314) class171.field2134.method724(32);
                            if (var28 != null && var28.method1880(-5) == 0 && var28.method1879(124) + var22 >= var16 && var28.method1875(123) + var23 >= var17 && var28.method1879(125) + var22 < var18 && var28.method1875(80) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field2822 != null && !class587.method3268(-8001)) {
                                for (int var29 = 0; var29 < var13.field2822.length; var29++) {
                                    if (class290.field3843.method1426(var13.field2822[var29], 5503)) {
                                        if (var13.field2680 == null || class406.field5732 >= var13.field2680[var29]) {
                                            byte var30 = var13.field2806[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class290.field3843.method1426(86, 5503) && !class290.field3843.method1426(82, 5503) && !class290.field3843.method1426(81, 5503)) && ((var30 & 0x2) == 0 || class290.field3843.method1426(86, 5503)) && ((var30 & 0x1) == 0 || class290.field3843.method1426(82, 5503)) && ((var30 & 0x4) == 0 || class290.field3843.method1426(81, 5503))) {
                                                if (var29 < 10) {
                                                    class461.method2566(var29 + 1, -1, "", -120, var13.field2708);
                                                } else if (var29 == 10) {
                                                    class96.method661((byte) -118);
                                                    class703 var31 = method1835(var13);
                                                    class572.method3215(var31.field9872, var13, var31.method3967(-1), -6838);
                                                    class702.field9857 = class117.method771(-1, var13);
                                                    if (class702.field9857 == null) {
                                                        class702.field9857 = "Null";
                                                    }
                                                    class719.field10067 = var13.field2683 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field2737[var29];
                                                if (var13.field2680 == null) {
                                                    var13.field2680 = new int[var13.field2822.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field2680[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field2680[var29] = class406.field5732 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field2680 != null) {
                                        var13.field2680[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class78.method587(var13, (byte) 52, var22 + var28.method1879(-89) - var14, var23 + var28.method1875(47) - var15);
                            }
                            if (class72.field774 != null && class72.field774 != var13 && var25 && method1835(var13).method3963(-1)) {
                                class594.field8283 = var13;
                            }
                            if (class63.field690 == var13) {
                                class670.field9313 = true;
                                class215.field2578 = var14;
                                class202.field2398 = var15;
                            }
                            if (var13.field2667 || var13.field2776 != 0) {
                                if (var25 && class619.field8673 != 0 && var13.field2740 != null) {
                                    class404 var33 = new class404();
                                    var33.field5708 = true;
                                    var33.field5714 = var13;
                                    var33.field5707 = class619.field8673;
                                    var33.field5709 = var13.field2740;
                                    class213.field2550.method725(var33, -20911);
                                }
                                if (class72.field774 != null || class83.field1156 || class653.field9101 != var13.field2776 && class259.field3393 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field2776 != 0) {
                                    if (class378.field5255 == var13.field2776 || class608.field8501 == var13.field2776) {
                                        class753.field10437 = var13;
                                        if (class257.field3343 != null) {
                                            class257.field3343.method2637(var13.field2718, 6, class21.field142);
                                        }
                                        if (class378.field5255 == var13.field2776) {
                                            if (class83.field1156 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class516.method2846(0, arg9, arg8, class21.field142);
                                            class396 var34 = (class396) class337.field4552.method113((byte) 15);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field5623 && arg10 < var34.field5621 && arg11 >= var34.field5618 && arg11 < var34.field5624) {
                                                    class403.method2331((byte) 101);
                                                    class719.method4042(var34.field5626, (byte) -124);
                                                }
                                                var34 = (class396) class337.field4552.method119(false);
                                            }
                                        }
                                    }
                                    if (class665.field9263 == var13.field2776) {
                                        if (var13.method1236(class21.field142, 115) == null || class168.field2101 != 0 && class168.field2101 != 3 || class83.field1156 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field2675[var36];
                                        if (var35 < var37 || var35 > var13.field2767[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field2781 / 2;
                                        int var39 = var36 - var13.field2718 / 2;
                                        int var40;
                                        if (class8.field57 == 4) {
                                            var40 = (int) class183.field2237 & 0x3FFF;
                                        } else {
                                            var40 = (int) class183.field2237 + class514.field6956 & 0x3FFF;
                                        }
                                        int var41 = class15.field113[var40];
                                        int var42 = class15.field115[var40];
                                        if (class8.field57 != 4) {
                                            var41 = (class283.field3747 + 256) * var41 >> 8;
                                            var42 = (class283.field3747 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class8.field57 == 4) {
                                            var45 = (class86.field1179 >> 9) + (var43 >> 2);
                                            var46 = (class232.field2981 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class653.field9086.method543(0) - 1) * 256;
                                            var45 = (class653.field9086.field2170 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class653.field9086.field2165 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class595.field8291 && (class372.field5190 & 0x40) != 0) {
                                            class218 var48 = class408.method2359((byte) 72, class631.field8779, class355.field4735);
                                            if (var48 == null) {
                                                class96.method661((byte) 111);
                                            } else {
                                                class218.method1237(false, true, 1L, class387.field5461, var45, " ->", true, var46, 46, (long) (var13.field2769 << 0 | var13.field2708), var13.field2771, false, class702.field9857);
                                            }
                                            continue;
                                        }
                                        if (class639.field8868 == class51.field541) {
                                            class218.method1237(false, true, 1L, -1, var45, "", true, var46, 60, 0L, -1, false, class755.field10507.method4201(class723.field10095, (byte) 25));
                                        }
                                        class218.method1237(false, true, 1L, class301.field4078, var45, "", true, var46, 6, 0L, -1, false, class29.field239);
                                        continue;
                                    }
                                    if (class653.field9101 == var13.field2776) {
                                        class162.field2034 = var13;
                                        if (var25) {
                                            class531.field7208 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1879(19) - var14 - var13.field2781 / 2) * 2.0D / (double) class642.field8936);
                                            int var50 = (int) (-((double) (var23 + var28.method1875(69) - var15 - var13.field2718 / 2) * 2.0D / (double) class642.field8936));
                                            int var51 = class510.field6893 + var49 + class642.field8947;
                                            int var52 = class450.field6297 + var50 + class642.field8950;
                                            class294 var53 = class124.method797(-3);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method1752(31960, var51, var54, var52);
                                            if (var54 != null) {
                                                if (class290.field3843.method1426(82, 5503) && class596.field8304 > 0) {
                                                    class363.method2077(var54[2], var54[1], var54[0], -52);
                                                    continue;
                                                }
                                                class549.field7776 = true;
                                                class168.field2100 = var54[0];
                                                class663.field9258 = var54[1];
                                                class181.field2223 = var54[2];
                                            }
                                            class259.field3393 = 1;
                                            class143.field1853 = false;
                                            class446.field6212 = class427.field6034.method528(106);
                                            class244.field3170 = class427.field6034.method521((byte) 46);
                                            continue;
                                        }
                                        if (var26 && class259.field3393 > 0) {
                                            if (class259.field3393 == 1 && (class446.field6212 != class427.field6034.method528(64) || class244.field3170 != class427.field6034.method521((byte) 89))) {
                                                field4112 = class510.field6893;
                                                class21.field143 = class450.field6297;
                                                class259.field3393 = 2;
                                            }
                                            if (class259.field3393 == 2) {
                                                class143.field1853 = true;
                                                class327.method1942(field4112 + (int) ((double) (class446.field6212 - class427.field6034.method528(27)) * 2.0D / (double) class642.field8940), -94);
                                                class750.method4179(-4365, class21.field143 - (int) ((double) (class244.field3170 - class427.field6034.method521((byte) 92)) * 2.0D / (double) class642.field8940));
                                            }
                                            continue;
                                        }
                                        if (class259.field3393 > 0 && !class143.field1853) {
                                            if ((class760.field10603 == 1 || class322.method1921((byte) 127)) && class43.field470 > 2) {
                                                class540.method2968(class244.field3170, class446.field6212, -2);
                                            } else if (class751.method4185(90)) {
                                                class540.method2968(class244.field3170, class446.field6212, -2);
                                            }
                                        }
                                        class259.field3393 = 0;
                                        continue;
                                    }
                                    if (class670.field9315 == var13.field2776) {
                                        if (var26) {
                                            class321.method1915((byte) 48, var23 + class427.field6034.method521((byte) 29) - var15, var13.field2781, var22 + class427.field6034.method528(18) - var14, var13.field2718);
                                        }
                                        continue;
                                    }
                                    if (class147.field1895 == var13.field2776) {
                                        class622.method3520(var15, var13, var14, 60);
                                        continue;
                                    }
                                }
                                if (!var13.field2701 && var27) {
                                    var13.field2701 = true;
                                    if (var13.field2757 != null) {
                                        class404 var55 = new class404();
                                        var55.field5708 = true;
                                        var55.field5714 = var13;
                                        var55.field5713 = var22 + var28.method1879(-25) - var14;
                                        var55.field5707 = var23 + var28.method1875(54) - var15;
                                        var55.field5709 = var13.field2757;
                                        class213.field2550.method725(var55, -20911);
                                    }
                                }
                                if (var13.field2701 && var26 && var13.field2811 != null) {
                                    class404 var56 = new class404();
                                    var56.field5708 = true;
                                    var56.field5714 = var13;
                                    var56.field5713 = var22 + class427.field6034.method528(118) - var14;
                                    var56.field5707 = var23 + class427.field6034.method521((byte) 47) - var15;
                                    var56.field5709 = var13.field2811;
                                    class213.field2550.method725(var56, -20911);
                                }
                                if (var13.field2701 && !var26) {
                                    var13.field2701 = false;
                                    if (var13.field2834 != null) {
                                        class404 var57 = new class404();
                                        var57.field5708 = true;
                                        var57.field5714 = var13;
                                        var57.field5713 = var22 + class427.field6034.method528(47) - var14;
                                        var57.field5707 = var23 + class427.field6034.method521((byte) 72) - var15;
                                        var57.field5709 = var13.field2834;
                                        class294.field3953.method725(var57, -20911);
                                    }
                                }
                                if (var26 && var13.field2689 != null) {
                                    class404 var58 = new class404();
                                    var58.field5708 = true;
                                    var58.field5714 = var13;
                                    var58.field5713 = var22 + class427.field6034.method528(51) - var14;
                                    var58.field5707 = var23 + class427.field6034.method521((byte) 85) - var15;
                                    var58.field5709 = var13.field2689;
                                    class213.field2550.method725(var58, -20911);
                                }
                                if (!var13.field2796 && var25) {
                                    var13.field2796 = true;
                                    if (var13.field2686 != null) {
                                        class404 var59 = new class404();
                                        var59.field5708 = true;
                                        var59.field5714 = var13;
                                        var59.field5713 = var22 + class427.field6034.method528(10) - var14;
                                        var59.field5707 = var23 + class427.field6034.method521((byte) 124) - var15;
                                        var59.field5709 = var13.field2686;
                                        class213.field2550.method725(var59, -20911);
                                    }
                                }
                                if (var13.field2796 && var25 && var13.field2785 != null) {
                                    class404 var60 = new class404();
                                    var60.field5708 = true;
                                    var60.field5714 = var13;
                                    var60.field5713 = var22 + class427.field6034.method528(45) - var14;
                                    var60.field5707 = var23 + class427.field6034.method521((byte) 99) - var15;
                                    var60.field5709 = var13.field2785;
                                    class213.field2550.method725(var60, -20911);
                                }
                                if (var13.field2796 && !var25) {
                                    var13.field2796 = false;
                                    if (var13.field2734 != null) {
                                        class404 var61 = new class404();
                                        var61.field5708 = true;
                                        var61.field5714 = var13;
                                        var61.field5713 = var22 + class427.field6034.method528(116) - var14;
                                        var61.field5707 = var23 + class427.field6034.method521((byte) 77) - var15;
                                        var61.field5709 = var13.field2734;
                                        class294.field3953.method725(var61, -20911);
                                    }
                                }
                                if (var13.field2731 != null) {
                                    class404 var62 = new class404();
                                    var62.field5714 = var13;
                                    var62.field5709 = var13.field2731;
                                    class136.field1737.method725(var62, -20911);
                                }
                                if (var13.field2670 != null && class295.field3971 > var13.field2682) {
                                    if (var13.field2764 == null || class295.field3971 - var13.field2682 > 32) {
                                        class404 var67 = new class404();
                                        var67.field5714 = var13;
                                        var67.field5709 = var13.field2670;
                                        class213.field2550.method725(var67, -20911);
                                    } else {
                                        label699: for (int var63 = var13.field2682; var63 < class295.field3971; var63++) {
                                            int var64 = class270.field3570[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field2764.length; var65++) {
                                                if (var13.field2764[var65] == var64) {
                                                    class404 var66 = new class404();
                                                    var66.field5714 = var13;
                                                    var66.field5709 = var13.field2670;
                                                    class213.field2550.method725(var66, -20911);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2682 = class295.field3971;
                                }
                                if (var13.field2793 != null && class123.field1612 > var13.field2746) {
                                    if (var13.field2819 == null || class123.field1612 - var13.field2746 > 32) {
                                        class404 var72 = new class404();
                                        var72.field5714 = var13;
                                        var72.field5709 = var13.field2793;
                                        class213.field2550.method725(var72, -20911);
                                    } else {
                                        label675: for (int var68 = var13.field2746; var68 < class123.field1612; var68++) {
                                            int var69 = class108.field1428[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field2819.length; var70++) {
                                                if (var13.field2819[var70] == var69) {
                                                    class404 var71 = new class404();
                                                    var71.field5714 = var13;
                                                    var71.field5709 = var13.field2793;
                                                    class213.field2550.method725(var71, -20911);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2746 = class123.field1612;
                                }
                                if (var13.field2730 != null && class670.field9318 > var13.field2803) {
                                    if (var13.field2749 == null || class670.field9318 - var13.field2803 > 32) {
                                        class404 var77 = new class404();
                                        var77.field5714 = var13;
                                        var77.field5709 = var13.field2730;
                                        class213.field2550.method725(var77, -20911);
                                    } else {
                                        label651: for (int var73 = var13.field2803; var73 < class670.field9318; var73++) {
                                            int var74 = class253.field3267[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field2749.length; var75++) {
                                                if (var13.field2749[var75] == var74) {
                                                    class404 var76 = new class404();
                                                    var76.field5714 = var13;
                                                    var76.field5709 = var13.field2730;
                                                    class213.field2550.method725(var76, -20911);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2803 = class670.field9318;
                                }
                                if (var13.field2712 != null && class566.field7986 > var13.field2798) {
                                    if (var13.field2709 == null || class566.field7986 - var13.field2798 > 32) {
                                        class404 var82 = new class404();
                                        var82.field5714 = var13;
                                        var82.field5709 = var13.field2712;
                                        class213.field2550.method725(var82, -20911);
                                    } else {
                                        label627: for (int var78 = var13.field2798; var78 < class566.field7986; var78++) {
                                            int var79 = class25.field192[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field2709.length; var80++) {
                                                if (var13.field2709[var80] == var79) {
                                                    class404 var81 = new class404();
                                                    var81.field5714 = var13;
                                                    var81.field5709 = var13.field2712;
                                                    class213.field2550.method725(var81, -20911);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2798 = class566.field7986;
                                }
                                if (var13.field2741 != null && class424.field5942 > var13.field2739) {
                                    if (var13.field2732 == null || class424.field5942 - var13.field2739 > 32) {
                                        class404 var87 = new class404();
                                        var87.field5714 = var13;
                                        var87.field5709 = var13.field2741;
                                        class213.field2550.method725(var87, -20911);
                                    } else {
                                        label603: for (int var83 = var13.field2739; var83 < class424.field5942; var83++) {
                                            int var84 = class426.field6012[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field2732.length; var85++) {
                                                if (var13.field2732[var85] == var84) {
                                                    class404 var86 = new class404();
                                                    var86.field5714 = var13;
                                                    var86.field5709 = var13.field2741;
                                                    class213.field2550.method725(var86, -20911);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2739 = class424.field5942;
                                }
                                if (class369.field5173 > var13.field2707 && var13.field2699 != null) {
                                    class404 var88 = new class404();
                                    var88.field5714 = var13;
                                    var88.field5709 = var13.field2699;
                                    class213.field2550.method725(var88, -20911);
                                }
                                if (class328.field4444 > var13.field2707 && var13.field2673 != null) {
                                    class404 var89 = new class404();
                                    var89.field5714 = var13;
                                    var89.field5709 = var13.field2673;
                                    class213.field2550.method725(var89, -20911);
                                }
                                if (class112.field1479 > var13.field2707 && var13.field2759 != null) {
                                    class404 var90 = new class404();
                                    var90.field5714 = var13;
                                    var90.field5709 = var13.field2759;
                                    class213.field2550.method725(var90, -20911);
                                }
                                if (class721.field10080 > var13.field2707 && var13.field2761 != null) {
                                    class404 var91 = new class404();
                                    var91.field5714 = var13;
                                    var91.field5709 = var13.field2761;
                                    class213.field2550.method725(var91, -20911);
                                }
                                if (class585.field8194 > var13.field2707 && var13.field2817 != null) {
                                    class404 var92 = new class404();
                                    var92.field5714 = var13;
                                    var92.field5709 = var13.field2817;
                                    class213.field2550.method725(var92, -20911);
                                }
                                var13.field2707 = class292.field3876;
                                if (var13.field2736 != null) {
                                    for (int var93 = 0; var93 < class28.field210; var93++) {
                                        class404 var94 = new class404();
                                        var94.field5714 = var13;
                                        var94.field5705 = class537.field7303[var93].method253(true);
                                        var94.field5704 = class537.field7303[var93].method258(13313);
                                        var94.field5709 = var13.field2736;
                                        class213.field2550.method725(var94, -20911);
                                    }
                                }
                                if (class631.field8782 && var13.field2678 != null) {
                                    class404 var95 = new class404();
                                    var95.field5714 = var13;
                                    var95.field5709 = var13.field2678;
                                    class213.field2550.method725(var95, -20911);
                                }
                            }
                            if (var13.field2832 == 5 && var13.field2728 != -1) {
                                var13.method1234(0, class278.field3718, class147.field1893).method2637(var13.field2718, 6, class21.field142);
                            }
                            class422.method2410(124, var13);
                            if (var13.field2832 == 0) {
                                method1823(arg0, var13.field2708, var16, var17, var18, var19, var14 - var13.field2706, var15 - var13.field2671, arg8, arg9, arg10, arg11);
                                if (var13.field2816 != null) {
                                    method1823(var13.field2816, var13.field2708, var16, var17, var18, var19, var14 - var13.field2706, var15 - var13.field2671, arg8, arg9, arg10, arg11);
                                }
                                class526 var96 = (class526) class520.field6994.method2552((long) var13.field2708, -1);
                                if (var96 != null) {
                                    if (class51.field541 == class257.field3338 && var96.field7064 == 0 && !class83.field1156 && var25 && !class116.field1519) {
                                        class403.method2331((byte) 117);
                                    }
                                    class758.method4216(arg10, var17, var96.field7062, var18, 0, var19, var14, arg8, arg9, arg11, var15, var16);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class422.method2410(108, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1817)
    public static final void method1824(int arg0) {
        int var1 = class427.field6032;
        int[] var2 = class619.field8682;
        for (int var3 = 0; var3 < class84.field1169 + var1; var3++) {
            class74 var4;
            if (var3 < var1) {
                var4 = class361.field4793[var2[var3]];
            } else {
                var4 = ((class706) class681.field9475.method2552((long) class665.field9261[var3 - var1], -1)).field9890;
            }
            if (var4.field2175 == arg0 && var4.field820 >= 0) {
                int var5 = var4.method543(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2170 & 0x1FF) != 0 || (var4.field2165 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field2170 & 0x1FF) != 256 || (var4.field2165 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field2170 >> 9;
                    int var7 = var4.field2165 >> 9;
                    if (var4.field820 > class397.field5634[var6][var7]) {
                        class397.field5634[var6][var7] = var4.field820;
                        class190.field2290[var6][var7] = 1;
                    } else if (class397.field5634[var6][var7] == var4.field820) {
                        var10002 = class190.field2290[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field2170 - var8 >> 9;
                    int var10 = var4.field2165 - var8 >> 9;
                    int var11 = var4.field2170 + var8 >> 9;
                    int var12 = var4.field2165 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field820 > class397.field5634[var13][var14]) {
                                class397.field5634[var13][var14] = var4.field820;
                                class190.field2290[var13][var14] = 1;
                            } else if (class397.field5634[var13][var14] == var4.field820) {
                                var10002 = class190.field2290[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 1915)
    public final void method1401(byte arg0) {
        if (arg0 != -6) {
            method1823(null, 101, 22, 118, 53, 94, -102, -124, -49, -22, -63, 30);
        }
        field4110++;
        if (class11.field68.field5503.method741((byte) 122) != 2) {
            this.method1827((byte) 68);
            return;
        }
        try {
            this.method1827((byte) 68);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class760.method4223(var5, arg0 ^ 0x7E, var5.getMessage() + " (Recovered) " + this.method1409(0));
            class598.field8329 = true;
            class479.method2689(0, false, -125);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1940)
    private final void method1825(byte arg0) {
        field4095++;
        if (class759.field10590.field3009 > class82.field1106) {
            class294.field3941.method3179(0);
            class732.field10198 = (class759.field10590.field3009 - 1) * 250;
            if (class732.field10198 > 3000) {
                class732.field10198 = 3000;
            }
            if (class759.field10590.field3009 >= 2 && class759.field10590.field3010 == 6) {
                this.method1412((byte) 89, "js5connect_outofdate");
                class713.field9949 = 14;
                return;
            }
            if (class759.field10590.field3009 >= 4 && class759.field10590.field3010 == -1) {
                this.method1412((byte) -126, "js5crc");
                class713.field9949 = 14;
                return;
            }
            if (class759.field10590.field3009 >= 4 && class32.method148(class713.field9949, 126)) {
                if (class759.field10590.field3010 == 7 || class759.field10590.field3010 == 9) {
                    this.method1412((byte) -79, "js5connect_full");
                } else if (class759.field10590.field3010 <= 0) {
                    this.method1412((byte) 112, "js5io");
                } else if (class281.field3725 == null) {
                    this.method1412((byte) 125, "js5connect");
                } else {
                    this.method1412((byte) -60, "js5proxy_" + class281.field3725.trim());
                }
                class713.field9949 = 14;
                return;
            }
        }
        class82.field1106 = class759.field10590.field3009;
        if (class732.field10198 > 0) {
            class732.field10198--;
            return;
        }
        try {
            if (arg0 <= -127) {
                if (class120.field1573 == 0) {
                    class1.field10 = class294.field3941.method3175(-111, class287.field3823);
                    class120.field1573++;
                }
                if (class120.field1573 == 1) {
                    if (class1.field10.field1419 == 2) {
                        if (class1.field10.field1418 != null) {
                            class281.field3725 = (String) class1.field10.field1418;
                        }
                        this.method1826((byte) -119, 1000);
                        return;
                    }
                    if (class1.field10.field1419 == 1) {
                        class120.field1573++;
                    }
                }
                if (class120.field1573 == 2) {
                    class290.field3844 = new class306((Socket) class1.field10.field1418, class287.field3823, 25000);
                    class611 var2 = new class611(5);
                    var2.method3393(class696.field9722.field2395, -84);
                    var2.method3384(1571862888, 637);
                    class290.field3844.method1851((byte) 77, 0, 5, var2.field8529);
                    class120.field1573++;
                    class263.field3443 = class538.method2963(-47);
                }
                if (class120.field1573 == 3) {
                    if (class32.method148(class713.field9949, 127) || class290.field3844.method1846(95) > 0) {
                        int var3 = class290.field3844.method1849(-14234);
                        if (var3 != 0) {
                            this.method1826((byte) -96, var3);
                            return;
                        }
                        class120.field1573++;
                    } else if (class538.method2963(-47) - class263.field3443 > 30000L) {
                        this.method1826((byte) -95, 1001);
                        return;
                    }
                }
                if (class120.field1573 == 4) {
                    boolean var4 = class32.method148(class713.field9949, 127) || class695.method3923(2048, class713.field9949) || class719.method4041(-6410, class713.field9949);
                    class549[] var5 = class549.method3107(4);
                    class611 var6 = new class611(var5.length * 4);
                    class290.field3844.method1852(0, true, var6.field8529.length, var6.field8529);
                    for (int var7 = 0; var7 < var5.length; var7++) {
                        var5[var7].method3109(var6.method3418(-2), 107);
                    }
                    class759.field10590.method1382(class290.field3844, !var4, (byte) 74);
                    class290.field3844 = null;
                    class120.field1573 = 0;
                    class1.field10 = null;
                }
            }
        } catch (IOException var8) {
            this.method1826((byte) -118, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 2107)
    public final void method1407(boolean arg0) {
        if (class711.field9923) {
            class115.method762((byte) 98);
        }
        field4101++;
        class482.method2712(124);
        if (class21.field142 != null) {
            class21.field142.method342(-1);
        }
        if (class526.field7067 != null) {
            class114.method757(arg0, class526.field7067, class287.field3823);
            class526.field7067 = null;
        }
        if (class582.field8161 != null) {
            class582.field8161.method1439(-18);
            class582.field8161 = null;
        }
        class536.method2952(true);
        class759.field10590.method1371(-84);
        class310.field4199.method2942((byte) -75);
        if (class185.field2255 != null) {
            class185.field2255.method84((byte) -103);
            class185.field2255 = null;
        }
        try {
            class395.field5609.method1963((byte) -54);
            int var2 = 0;
            if (arg0) {
                method1834();
            }
            while (var2 < 37) {
                class698.field9830[var2].method1963((byte) -99);
                var2++;
            }
            class195.field2333.method1963((byte) -73);
            class399.field5653.method1963((byte) -67);
            class495.method2766(true);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 2161)
    private final void method1826(byte arg0, int arg1) {
        field4098++;
        class120.field1573 = 0;
        class759.field10590.field3009++;
        if (arg0 >= -89) {
            method1834();
        }
        class1.field10 = null;
        class290.field3844 = null;
        class759.field10590.field3010 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2181)
    private final void method1827(byte arg0) {
        field4111++;
        if (class713.field9949 == 14) {
            return;
        }
        class406.field5732++;
        if ((class406.field5732 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class546.field7708 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class122.field1589.setSeed((long) class546.field7708);
        }
        if (class406.field5732 % 50 == 0) {
            class109.field1455 = class677.field9451;
            class104.field1389 = class678.field9463;
            class677.field9451 = 0;
            class678.field9463 = 0;
        }
        this.method1828((byte) 59);
        if (class489.field6696 != null) {
            class489.field6696.method3250(0);
        }
        class574.method3222((byte) 79);
        class14.method59(16543);
        class290.field3843.method1421((byte) -113);
        class427.field6034.method530((byte) 108);
        if (class21.field142 != null) {
            class21.field142.method430((int) class538.method2963(arg0 ^ 0xFFFFFF95));
        }
        class728.method4086(-2);
        class77.field948 = 0;
        class28.field210 = 0;
        if (arg0 != 68) {
            method1822(81, null);
        }
        for (class326 var3 = class290.field3843.method1423((byte) 31); var3 != null; var3 = class290.field3843.method1423((byte) 31)) {
            int var6 = var3.method255(-111);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method258(13313);
                if (class78.method590((byte) 57) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class587.method3268(-8001)) {
                        class600.method3323(true);
                    } else {
                        class318.method1907(0);
                    }
                } else if (class28.field210 < 128) {
                    class537.field7303[class28.field210] = var3;
                    class28.field210++;
                }
            } else if (var6 == 0 && class77.field948 < 75) {
                class525.field7059[class77.field948] = var3;
                class77.field948++;
            }
        }
        class619.field8673 = 0;
        for (class314 var4 = class427.field6034.method522(600); var4 != null; var4 = class427.field6034.method522(600)) {
            int var5 = var4.method1880(arg0 ^ 0xFFFFFFBF);
            if (var5 == -1) {
                class223.field2881.method725(var4, -20911);
            } else if (var5 == 6) {
                class619.field8673 += var4.method1876(arg0 - 66);
            } else if (class21.method82(arg0 - 192, var5)) {
                class171.field2134.method725(var4, arg0 ^ 0xFFFFAE15);
                if (class171.field2134.method730(0) > 10) {
                    class171.field2134.method727(arg0 ^ 0x191A);
                }
            }
        }
        if (class587.method3268(-8001)) {
            class186.method1048(104);
        }
        if (class32.method148(class713.field9949, 126)) {
            class482.method2709(-16798);
            class170.method986(false);
        } else if (class301.method1811(class713.field9949, 8)) {
            class136.method847((byte) 99);
        }
        if (class695.method3923(2048, class713.field9949) && !class301.method1811(class713.field9949, 8)) {
            this.method1831(10);
            class205.method1145(19700);
            class286.method1721(113);
        } else if (class719.method4041(-6410, class713.field9949) && !class301.method1811(class713.field9949, arg0 ^ 0x4C)) {
            this.method1831(arg0 - 58);
            class286.method1721(74);
        } else if (class713.field9949 == 12) {
            class286.method1721(115);
        } else if (class247.method1483(arg0 ^ 0xFFFFD39B, class713.field9949) && !class301.method1811(class713.field9949, 8)) {
            class150.method917((byte) -53);
        } else if (class713.field9949 == 13) {
            class286.method1721(120);
            if (class173.field2146 != -3 && class173.field2146 != 2 && class173.field2146 != 15) {
                class727.method4076(false, false);
            }
        }
        class260.method1560(arg0 ^ 0xFFFFFF82, class21.field142);
        class171.field2134.method727(arg0 ^ 0x191A);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Ljava/lang/String;", line = 2349)
    public final String method1409(int arg0) {
        field4107++;
        if (arg0 != 0) {
            this.method1410(13);
        }
        String var2 = null;
        try {
            var2 = "[1)" + class99.field1313 + "," + class133.field1704 + "," + class272.field3589 + "," + class3.field26 + "|";
            if (class653.field9086 != null) {
                var2 = var2 + "2)" + class61.field677 + "," + (class653.field9086.field898[0] + class99.field1313) + "," + (class653.field9086.field899[0] + class133.field1704) + "|";
            }
            var2 = var2 + "3)" + class11.field68.field5503.method741((byte) 124) + "|4)" + class11.field68.field5505.method1958((byte) 122) + "|5)" + class381.method2243((byte) -59) + "|6)" + class546.field7710 + "," + class512.field6932 + "|";
            var2 = var2 + "7)" + class11.field68.field5541.method3210((byte) 127) + "|";
            var2 = var2 + "8)" + class11.field68.field5545.method61((byte) 126) + "|";
            var2 = var2 + "9)" + class11.field68.field5534.method1058((byte) 121) + "|";
            var2 = var2 + "10)" + class11.field68.field5521.method3358((byte) 120) + "|";
            var2 = var2 + "11)" + class11.field68.field5536.method2257((byte) 127) + "|";
            var2 = var2 + "12)" + class11.field68.field5548.method186((byte) 126) + "|";
            var2 = var2 + "13)" + class206.field2483 + "|";
            var2 = var2 + "14)" + class713.field9949;
            if (class353.field4715 != null) {
                var2 = var2 + "|15)" + class353.field4715.field10203;
            }
            try {
                if (class11.field68.field5503.method741((byte) 125) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4116 == null ? (field4116 = method1836("client")) : field4116).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 2433)
    public final synchronized void method1402(int arg0) {
        field4105++;
        if (class144.field1868 != null && class725.field10121 == null && !class287.field3823.field10283) {
            try {
                Class var2 = class144.field1868.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class725.field10121 = (Canvas) var3.get(class144.field1868);
                var3.set(class144.field1868, null);
                if (class725.field10121 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1402(arg0);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2460)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class48.method281(1, "Argument count");
            }
            class252.field3246 = new class564();
            class252.field3246.field7967 = Integer.parseInt(arg0[0]);
            class425.field5993 = new class564();
            class425.field5993.field7967 = Integer.parseInt(arg0[1]);
            class650.field9068 = new class564();
            class650.field9068.field7967 = Integer.parseInt(arg0[2]);
            class200.field2376 = class287.field3824;
            if (arg0[3].equals("live")) {
                class299.field4020 = class427.field6029;
            } else if (arg0[3].equals("rc")) {
                class299.field4020 = class669.field9306;
            } else if (arg0[3].equals("wip")) {
                class299.field4020 = class535.field7257;
            } else {
                class48.method281(1, "modewhat");
            }
            class723.field10095 = class479.method2690(false, arg0[4]);
            if (class723.field10095 == -1) {
                if (arg0[4].equals("english")) {
                    class723.field10095 = 0;
                } else if (arg0[4].equals("german")) {
                    class723.field10095 = 1;
                } else {
                    class48.method281(1, "language");
                }
            }
            class584.field8175 = false;
            class494.field6735 = false;
            if (arg0[5].equals("game0")) {
                class51.field541 = class257.field3338;
            } else if (arg0[5].equals("game1")) {
                class51.field541 = class639.field8868;
            } else if (arg0[5].equals("game2")) {
                class51.field541 = class265.field3494;
            } else if (arg0[5].equals("game3")) {
                class51.field541 = class392.field5556;
            } else {
                class48.method281(1, "game");
            }
            class734.field10237 = "";
            class692.field9682 = null;
            class444.field6175 = 0;
            class392.field5551 = 0;
            class22.field162 = false;
            class377.field5237 = 0L;
            class78.field1012 = true;
            class205.field2436 = true;
            class3.field27 = null;
            class115.field1514 = false;
            class586.field8204 = 0;
            class11.field67 = class51.field541.field3141;
            client var1 = new client();
            class58.field623 = var1;
            var1.method1403(false, class51.field541.field3144, 37, 768, class299.field4020.method2032(-106) + 32, true, 637, 1024);
            class271.field3587.setLocation(40, 40);
        } catch (Exception var3) {
            class760.method4223(var3, -124, null);
        }
        field4096++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2545)
    private final void method1828(byte arg0) {
        field4103++;
        boolean var2 = class759.field10590.method1378(4096);
        if (arg0 != 59) {
            field4112 = -77;
        }
        if (!var2) {
            this.method1825((byte) -128);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2562)
    public static final void method1829(int arg0) {
        int var1 = class427.field6032;
        int[] var2 = class619.field8682;
        int var3 = class79.field1086 ? var1 : class84.field1169 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class74 var5;
            if (var4 < var1) {
                var5 = class361.field4793[var2[var4]];
            } else {
                var5 = ((class706) class681.field9475.method2552((long) class665.field9261[var4 - var1], -1)).field9890;
            }
            if (var5.field2175 == arg0) {
                var5.field802 = 0;
                if (var5.field820 < 0) {
                    var5.field819 = false;
                } else {
                    int var6 = var5.method543(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field2170 & 0x1FF) != 0 || (var5.field2165 & 0x1FF) != 0) {
                            var5.field819 = false;
                            continue;
                        }
                    } else if ((var5.field2170 & 0x1FF) != 256 || (var5.field2165 & 0x1FF) != 256) {
                        var5.field819 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field2170 >> 9;
                        int var8 = var5.field2165 >> 9;
                        if (class397.field5634[var7][var8] != var5.field820) {
                            var5.field819 = true;
                            continue;
                        }
                        if (class190.field2290[var7][var8] > 1) {
                            var10002 = class190.field2290[var7][var8]--;
                            var5.field819 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field2170 - var9 >> 9;
                        int var11 = var5.field2165 - var9 >> 9;
                        int var12 = var5.field2170 + var9 >> 9;
                        int var13 = var5.field2165 + var9 >> 9;
                        if (!class300.method1801(var13, var12, var10, 50, var11, var5.field820)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class397.field5634[var14][var15] == var5.field820) {
                                        var10002 = class190.field2290[var14][var15]--;
                                    }
                                }
                            }
                            var5.field819 = true;
                            continue;
                        }
                    }
                    var5.field819 = false;
                    var5.field2178 = class86.method624(var5.field2175, var5.field2165, var5.field2170, 24111);
                    class202.method1119(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lsba;)Z", line = 2676)
    public static final boolean method1830(class218 arg0) {
        if (class116.field1519) {
            if (method1835(arg0).field9868 != 0) {
                return false;
            }
            if (arg0.field2832 == 0) {
                return false;
            }
        }
        return arg0.field2762;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 2689)
    private final void method1831(int arg0) {
        field4099++;
        if (class713.field9949 == 7 && class421.field5893 == 0) {
            if (class167.field2097 > 1) {
                class585.field8194 = class292.field3876;
                class167.field2097--;
            }
            if (!class83.field1156) {
                class403.method2331((byte) 89);
            }
            for (int var2 = 0; var2 < 100 && class507.method2820(114); var2++) {
            }
        }
        class242.field3146++;
        class388.method2266(-1, arg0 - 119, -1, null);
        class622.method3520(-1, null, -1, 60);
        class165.method971(118);
        class292.field3876++;
        for (int var3 = 0; var3 < class12.field79; var3++) {
            class215 var4 = class746.field10359[var3].field9890;
            if (var4 != null) {
                byte var5 = var4.field2589.field3608;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method543(0);
                    if ((var5 & 0x2) != 0 && var4.field895 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field898[0] + var7;
                            int var10 = var4.field899[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class272.field3589 - var6 - 1) < var9) {
                                var9 = class272.field3589 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class3.field26 - var6 - 1 < var10) {
                                var10 = class3.field26 - var6 - 1;
                            }
                            int var11 = class234.method1411(class171.field2130[var4.field2175], var6, class161.field2022, 0, 0, var10, var6, var4.field899[0], class570.field8033, true, var9, -1, 48, var4.field898[0], var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field898[var12] = class161.field2022[var11 - var12 - 1];
                                    var4.field899[var12] = class570.field8033[var11 - var12 - 1];
                                    var4.field904[var12] = 1;
                                }
                                var4.field895 = var11;
                            }
                        }
                    }
                    class168.method981((byte) 57, true, var4);
                    int var13 = class726.method4071(var4, 0);
                    class45.method273(-90, var4);
                    class402.method2325(class68.field754, arg0 ^ 0x180A, var4, class330.field4458, var13);
                    class596.method3298((byte) 37, class330.field4458, var4);
                    class577.method3231(var4, -28111);
                }
            }
        }
        if (class421.field5893 == 0 && class284.field3753 == 0) {
            if (class8.field57 == 2) {
                class309.method1865(123);
            } else {
                class196.method1087(0);
            }
            if (class294.field3956 >> 9 < 14 || class294.field3956 >> 9 >= class272.field3589 - 14 || class684.field9518 >> 9 < 14 || (class684.field9518 >> 9) >= (class3.field26 - 14)) {
                class237.method1428((byte) 66);
            }
        }
        while (true) {
            class404 var14;
            class218 var15;
            class218 var16;
            do {
                var14 = (class404) class136.field1737.method727(6494);
                if (var14 == null) {
                    while (true) {
                        class404 var17;
                        class218 var18;
                        class218 var19;
                        do {
                            var17 = (class404) class294.field3953.method727(6494);
                            if (var17 == null) {
                                while (true) {
                                    class404 var20;
                                    class218 var21;
                                    class218 var22;
                                    do {
                                        var20 = (class404) class213.field2550.method727(6494);
                                        if (var20 == null) {
                                            if (class72.field774 != null) {
                                                class648.method3646(19653);
                                            }
                                            if ((class406.field5732 % 1500) == 0) {
                                                class51.method302((byte) 99);
                                            }
                                            if (class713.field9949 == 7 && class421.field5893 == 0) {
                                                class514.method2844((byte) 49);
                                            }
                                            class409.method2362((byte) -101);
                                            if (class711.field9923 && class322.field4325 < (class538.method2963(-47) - 60000L)) {
                                                class115.method762((byte) 98);
                                            }
                                            if (arg0 != 10) {
                                                field4112 = -112;
                                            }
                                            for (class554 var23 = (class554) class222.field2870.method113((byte) 15); var23 != null; var23 = (class554) class222.field2870.method119(false)) {
                                                if (class538.method2963(-47) / 1000L - 5L > (long) var23.field7828) {
                                                    if (var23.field7823 > 0) {
                                                        class270.method1616((byte) -97, 5, var23.field7824 + class755.field10499.method4201(class723.field10095, (byte) 25), 0, "", "", "");
                                                    }
                                                    if (var23.field7823 == 0) {
                                                        class270.method1616((byte) 109, 5, var23.field7824 + class755.field10500.method4201(class723.field10095, (byte) 25), 0, "", "", "");
                                                    }
                                                    var23.method975((byte) -97);
                                                }
                                            }
                                            if (class713.field9949 == 7 && class421.field5893 == 0) {
                                                if (class582.field8161 == null) {
                                                    class727.method4076(false, false);
                                                    return;
                                                }
                                                class303.field4093++;
                                                if (class303.field4093 > 50) {
                                                    class161.field2027++;
                                                    class103 var24 = class752.method4186(arg0 ^ 0x10E, class450.field6292, class449.field6285);
                                                    class27.method104(false, var24);
                                                }
                                                try {
                                                    class4.method10((byte) 124);
                                                    return;
                                                } catch (IOException var25) {
                                                    class727.method4076(false, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5714;
                                        if (var21.field2769 < 0) {
                                            break;
                                        }
                                        var22 = class357.method2056(var21.field2693, -9820);
                                    } while (var22 == null || var22.field2816 == null || var22.field2816.length <= var21.field2769 || var22.field2816[var21.field2769] != var21);
                                    class498.method2775(var20);
                                }
                            }
                            var18 = var17.field5714;
                            if (var18.field2769 < 0) {
                                break;
                            }
                            var19 = class357.method2056(var18.field2693, -9820);
                        } while (var19 == null || var19.field2816 == null || var18.field2769 >= var19.field2816.length || var19.field2816[var18.field2769] != var18);
                        class498.method2775(var17);
                    }
                }
                var15 = var14.field5714;
                if (var15.field2769 < 0) {
                    break;
                }
                var16 = class357.method2056(var15.field2693, -9820);
            } while (var16 == null || var16.field2816 == null || var16.field2816.length <= var15.field2769 || var16.field2816[var15.field2769] != var15);
            class498.method2775(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2972)
    public static final void method1832() {
        class590.field8235 = 0;
        for (int var0 = 0; var0 < class84.field1169; var0++) {
            class215 var1 = ((class706) class681.field9475.method2552((long) class665.field9261[var0], -1)).field9890;
            if (var1.field819 && var1.method544(28213) != -1) {
                int var2 = (var1.method543(0) - 1) * 256 + 252;
                int var3 = var1.field2170 - var2 >> 9;
                int var4 = var1.field2165 - var2 >> 9;
                class74 var5 = class191.method1064(var1.field2175, var3, var4, 64);
                if (var5 != null) {
                    int var6 = var5.field817;
                    if (var5 instanceof class215) {
                        var6 += 2048;
                    }
                    if (var5.field802 == 0 && var5.method544(28213) != -1) {
                        class102.field1376[class590.field8235] = var6;
                        class647.field9005[class590.field8235] = var6;
                        class590.field8235++;
                        var5.field802++;
                    }
                    class102.field1376[class590.field8235] = var6;
                    class647.field9005[class590.field8235] = var1.field817 + 2048;
                    class590.field8235++;
                    var5.field802++;
                }
            }
        }
        class120.method783((byte) -125, class102.field1376, class647.field9005, 0, class590.field8235 - 1);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 3022)
    public static final void method1833() {
        int var0 = class427.field6032;
        int[] var1 = class619.field8682;
        int var2 = class11.field68.field5510.method1173((byte) 127);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class83 var14 = class361.field4793[var1[var4]];
            if (!var14.method607((byte) 106)) {
                var14.field820 = -1;
            } else if (var14.field1126) {
                var14.field820 = -1;
            } else {
                var14.method161(-8675);
                if (var14.field10422 >= 0 && var14.field10421 >= 0 && var14.field10426 < class272.field3589 && var14.field10425 < class3.field26) {
                    var14.field1123 = var14.field803 ? var3 : false;
                    if (class653.field9086 == var14) {
                        var14.field820 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field819) {
                            var15++;
                        }
                        if (var14.field876 > class406.field5732) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method543(0) << 2);
                        if (var14.field1142) {
                            var16 += 512;
                        } else {
                            if (class678.field9468 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field820 = var16 + 1;
                    }
                } else {
                    var14.field820 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class84.field1169; var5++) {
            class215 var11 = ((class706) class681.field9475.method2552((long) class665.field9261[var5], -1)).field9890;
            if (var11.method1198((byte) 106) && var11.field2589.method1633(class386.field5455, (byte) -118)) {
                var11.method161(-8675);
                if (var11.field10422 >= 0 && var11.field10421 >= 0 && var11.field10426 < class272.field3589 && var11.field10425 < class3.field26) {
                    int var12 = 0;
                    if (!var11.field819) {
                        var12++;
                    }
                    if (var11.field876 > class406.field5732) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method543(0) << 2);
                    if (class678.field9468 == 0) {
                        if (var11.field2589.field3669) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class678.field9468 == 1) {
                        if (var11.field2589.field3669) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field2589.field3612) {
                        var13 += 1024;
                    } else if (!var11.field2589.field3663) {
                        var13 += 256;
                    }
                    var11.field820 = var13 + 1;
                } else {
                    var11.field820 = -1;
                }
            } else {
                var11.field820 = -1;
            }
        }
        for (int var6 = 0; var6 < class475.field6572.length; var6++) {
            class641 var7 = class475.field6572[var6];
            if (var7 != null) {
                if (var7.field8921 == 1) {
                    class706 var8 = (class706) class681.field9475.method2552((long) var7.field8918, -1);
                    if (var8 != null) {
                        class215 var9 = var8.field9890;
                        if (var9.field820 >= 0) {
                            var9.field820 += 2048;
                        }
                    }
                } else if (var7.field8921 == 10) {
                    class83 var10 = class361.field4793[var7.field8918];
                    if (var10 != null && class653.field9086 != var10 && var10.field820 >= 0) {
                        var10.field820 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 3194)
    public final void method1410(int arg0) {
        if (class115.field1514) {
            class206.field2483 = 64;
        }
        field4100++;
        if (arg0 != -13395) {
            return;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class716.method4005((byte) -106);
        class310.field4199 = new class531(class287.field3823);
        class759.field10590 = new class232();
        class192.method1071(new int[] { 20, 260 }, new int[] { 1000, 100 }, 0);
        if (class61.field673 != class200.field2376) {
            class493.field6728 = new byte[50][];
        }
        class11.field68 = class527.method2923(-122);
        if (class61.field673 == class200.field2376) {
            class252.field3246.field7975 = this.getCodeBase().getHost();
        } else if (class494.method2762(true, class200.field2376)) {
            class252.field3246.field7975 = this.getCodeBase().getHost();
            class252.field3246.field7974 = class252.field3246.field7967 + 40000;
            class425.field5993.field7974 = class425.field5993.field7967 + 40000;
            class650.field9068.field7974 = class650.field9068.field7967 + 40000;
            class252.field3246.field7969 = class252.field3246.field7967 + 50000;
            class425.field5993.field7969 = class425.field5993.field7967 + 50000;
            class650.field9068.field7969 = class650.field9068.field7967 + 50000;
        } else if (class287.field3824 == class200.field2376) {
            class252.field3246.field7975 = "127.0.0.1";
            class425.field5993.field7975 = "127.0.0.1";
            class650.field9068.field7975 = "127.0.0.1";
            class252.field3246.field7974 = class252.field3246.field7967 + 40000;
            class425.field5993.field7974 = class425.field5993.field7967 + 40000;
            class650.field9068.field7974 = class650.field9068.field7967 + 40000;
            class252.field3246.field7969 = class252.field3246.field7967 + 50000;
            class425.field5993.field7969 = class425.field5993.field7967 + 50000;
            class650.field9068.field7969 = class650.field9068.field7967 + 50000;
        }
        class294.field3941 = class252.field3246;
        if (class639.field8868 == class51.field541) {
            class425.field5994 = 16777215;
            class576.field8092 = class507.field6869;
            class581.field8149 = true;
            class63.field686 = 0;
            class237.field3103 = class222.field2866;
        } else if (class51.field541 == class392.field5556) {
            class237.field3103 = class471.field6516;
            class576.field8092 = class32.field280;
        } else {
            class576.field8092 = class404.field5715;
            class237.field3103 = class86.field1184;
        }
        if (class51.field541 == class257.field3338) {
            class561.field7931 = false;
        }
        class166.field2072 = class397.field5638 = class21.field147 = class573.field8058 = new short[256];
        try {
            class600.field8359 = class58.field623.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class290.field3843 = class409.method2361((byte) 10, class725.field10121);
        class427.field6034 = class213.method1187(class725.field10121, true, -16777216);
        try {
            if (class287.field3823.field10310 != null) {
                class395.field5609 = new class332(class287.field3823.field10310, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class698.field9830[var3] = new class332(class287.field3823.field10303[var3], 6000, 0);
                }
                class195.field2333 = new class332(class287.field3823.field10288, 6000, 0);
                class731.field10191 = new class465(255, class395.field5609, class195.field2333, 500000);
                class399.field5653 = new class332(class287.field3823.field10293, 24, 0);
                class287.field3823.field10293 = null;
                class287.field3823.field10310 = null;
                class287.field3823.field10303 = null;
                class287.field3823.field10288 = null;
            }
        } catch (IOException var5) {
            class395.field5609 = null;
            class195.field2333 = null;
            class731.field10191 = null;
            class399.field5653 = null;
        }
        if (class61.field673 != class200.field2376) {
            class518.field6978 = true;
        }
        class21.field148 = class755.field10492.method4201(class723.field10095, (byte) 25);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3320)
    public static final void method1834() {
        int var0 = class427.field6032;
        int[] var1 = class619.field8682;
        int var2 = class79.field1086 ? var0 : class84.field1169 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class74 var4;
            if (var3 < var0) {
                var4 = class361.field4793[var1[var3]];
            } else {
                var4 = ((class706) class681.field9475.method2552((long) class665.field9261[var3 - var0], -1)).field9890;
            }
            if (var4.field820 >= 0) {
                int var5 = var4.method543(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2170 & 0x1FF) == 0 && (var4.field2165 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field2170 & 0x1FF) == 256 && (var4.field2165 & 0x1FF) == 256) {
                    continue;
                }
                var4.field2178 = class86.method624(var4.field2175, var4.field2165, var4.field2170, 24111);
                class202.method1119(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 3365)
    public final void init() {
        field4104++;
        if (!this.method1404(31)) {
            return;
        }
        class252.field3246 = new class564();
        class252.field3246.field7967 = Integer.parseInt(this.getParameter("worldid"));
        class425.field5993 = new class564();
        class425.field5993.field7967 = Integer.parseInt(this.getParameter("lobbyid"));
        class425.field5993.field7975 = this.getParameter("lobbyaddress");
        class650.field9068 = new class564();
        class650.field9068.field7967 = Integer.parseInt(this.getParameter("demoid"));
        class650.field9068.field7975 = this.getParameter("demoaddress");
        class200.field2376 = class754.method4196(103, Integer.parseInt(this.getParameter("modewhere")));
        if (class287.field3824 == class200.field2376) {
            class200.field2376 = class522.field7046;
        } else if (!class494.method2762(true, class200.field2376) && class61.field673 != class200.field2376) {
            class200.field2376 = class61.field673;
        }
        class299.field4020 = class138.method855(Integer.parseInt(this.getParameter("modewhat")), 108);
        if (class535.field7257 != class299.field4020 && class669.field9306 != class299.field4020 && class427.field6029 != class299.field4020) {
            class299.field4020 = class427.field6029;
        }
        try {
            class723.field10095 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class723.field10095 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class494.field6735 = true;
        } else {
            class494.field6735 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class584.field8175 = true;
        } else {
            class584.field8175 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class624.field8724 = true;
        } else {
            class624.field8724 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class51.field541 = class257.field3338;
            } else if (var4.equals("1")) {
                class51.field541 = class639.field8868;
            } else if (var4.equals("2")) {
                class51.field541 = class265.field3494;
            } else if (var4.equals("3")) {
                class51.field541 = class392.field5556;
            }
        }
        try {
            class586.field8204 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class586.field8204 = 0;
        }
        class438.field6140 = this.getParameter("quiturl");
        class734.field10237 = this.getParameter("settings");
        if (class734.field10237 == null) {
            class734.field10237 = "";
        }
        class60.field647 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class444.field6175 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class444.field6175 = 0;
            }
        }
        class11.field67 = Integer.parseInt(this.getParameter("colourid"));
        if (class11.field67 < 0 || class728.field10167.length <= class11.field67) {
            class11.field67 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class78.field1012 = true;
            class205.field2436 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class22.field162 = true;
        }
        class692.field9682 = this.getParameter("sskey");
        if (class692.field9682 != null && class692.field9682.length() < 2) {
            class692.field9682 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class115.field1514 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class392.field5551 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class377.field5237 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class3.field27 = this.getParameter("additionalInfo");
        if (class3.field27 != null && class3.field27.length() > 50) {
            class3.field27 = null;
        }
        class58.field623 = this;
        if (class51.field541 == class257.field3338) {
            class396.field5620 = 503;
            class751.field10419 = 765;
        } else if (class639.field8868 == class51.field541) {
            class396.field5620 = 480;
            class751.field10419 = 640;
        }
        this.method1399(637, class396.field5620, 4, 37, class51.field541.field3144, class299.field4020.method2032(-124) + 32, class751.field10419);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lsba;)Lwaa;", line = 3527)
    public static final class703 method1835(class218 arg0) {
        class703 var1 = (class703) class310.field4196.method2552(((long) arg0.field2708 << 32) + (long) arg0.field2769, -1);
        return var1 == null ? arg0.field2825 : var1;
    }
}
