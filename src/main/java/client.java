import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
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
public class client extends class631 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lnd;")
    public static class500 field3838 = new class500();

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[Ljava/lang/String;")
    public static String[] field3854 = new String[100];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field3856;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field3855;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1639() {
        for (int var0 = 0; var0 < class86.field1185; var0++) {
            int[] var1 = class561.field7570[var0];
            for (int var2 = 0; var2 < class526.field7212; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1640(byte arg0) {
        method1652(0);
        field3843++;
        class679.method3745(79);
        class9.method45(28875);
        class14.method69((byte) -47);
        class202.method1354(4);
        class538.method2967(0);
        class265.method1619((byte) 55);
        class539.method2970(false);
        class346.method2067((byte) 122);
        class631.method3511(-115);
        class427.method2418(-118);
        class324.method1966(-3);
        class647.method3604(255);
        class391.method2242(20258);
        class638.method3553((byte) -18);
        class375.method2188(100);
        class123.method870((byte) 13);
        class442.method2532((byte) -108);
        class451.method2587((byte) 53);
        class668.method3699((byte) 1);
        class132.method941(false);
        class476.method2705(0);
        class328.method1991((byte) -101);
        class180.method1217(-45);
        class92.method681((byte) 113);
        class169.method1161((byte) 87);
        class344.method2050(-124);
        class556.method3046(2);
        class516.method2868((byte) 75);
        class75.method596((byte) -29);
        class237.method1495(5);
        class558.method3057((byte) -99);
        class371.method2169(-66);
        class77.method608(111);
        class318.method1943((byte) 89);
        class309.method1903(-31612);
        class363.method2126((byte) -108);
        class210.method1385(255);
        class322.method1957(true);
        class173.method1189(-7565);
        class660.method3648((byte) -100);
        class129.method904((byte) 127);
        class16.method78(false);
        class666.method3694(true);
        class674.method3735(-100);
        class235.method1483(true);
        class181.method1221((byte) -39);
        class455.method2619(-680);
        class172.method1176(32308);
        class213.method1392(false);
        class216.method1405((byte) 85);
        class439.method2518((byte) -70);
        class663.method3677(0);
        class140.method995(113);
        class18.method98(30375);
        class286.method1716((byte) 117);
        class425.method2413((byte) -31);
        class76.method603((byte) -93);
        class457.method2631(-412617042);
        class194.method1301(-1277497864);
        class486.method2737(true);
        class568.method3134(-27464);
        class81.method640((byte) -22);
        class13.method60((byte) 110);
        class198.method1340(102);
        class513.method2849(false);
        class446.method2567((byte) 120);
        class480.method2722((byte) 91);
        class277.method1679((byte) 115);
        class243.method1510(5);
        class25.method119((byte) -94);
        class226.method1449((byte) -89);
        class680.method3753(8);
        class475.method2704(126);
        class676.method3740(true);
        class653.method3633(-124);
        class397.method2259(true);
        class335.method2024((byte) 80);
        class531.method2940((byte) 116);
        class247.method1526((byte) -104);
        class390.method2240(0);
        class597.method3305((byte) 74);
        class131.method911((byte) 57);
        class535.method2958(-12450);
        class352.method2092((byte) 79);
        class691.method3802(-52);
        class667.method3696(3296);
        class434.method2493((byte) 85);
        class381.method2204((byte) -27);
        class620.method3459((byte) -123);
        class661.method3661(116);
        class156.method1088(0);
        class136.method973(-14856);
        class161.method1124(true);
        class257.method1578((byte) 126);
        class124.method879(54);
        class127.method901(false);
        class212.method1391((byte) -112);
        class37.method174(10);
        class599.method3322(-112);
        class281.method1702(0);
        class154.method1085((byte) -51);
        class652.method3628((byte) -98);
        class432.method2466(1);
        class453.method2599((byte) -111);
        class629.method3494(16384);
        class45.method251((byte) -122);
        class583.method3258(16);
        class675.method3738((byte) -113);
        class690.method3800(14965);
        class97.method762(107);
        class449.method2579(true);
        class73.method583(-24397);
        class30.method135((byte) 101);
        class174.method1198((byte) -79);
        class514.method2859(-16);
        class148.method1036();
        class121.method863(false);
        class664.method3687((byte) 13);
        class78.method610(0);
        class177.method1208((byte) 103);
        class128.method903(true);
        class410.method2345(6);
        class687.method3781(17795);
        class496.method2774((byte) -126);
        class645.method3593((byte) -84);
        class401.method2283();
        class296.method1851((byte) -101);
        class308.method1897(-1);
        class287.method1728(true);
        class298.method1861(-104);
        class463.method2663(1000000);
        class608.method3362(false);
        class658.method3645(-9189);
        class523.method2896();
        class209.method1380(-113);
        class616.method3404();
        class307.method1884(-78);
        class376.method2190(67);
        class388.method2234((byte) -3);
        class433.method2491(true);
        class258.method1593((byte) -84);
        class648.method3609(-24261);
        class428.method2428(-67);
        class205.method1360(false);
        class517.method2879(true);
        class348.method2071(-23899);
        class32.method141(117);
        class404.method2312(0);
        class577.method3163(0);
        class271.method1635(-103);
        class561.method3107(false);
        class279.method1691();
        class34.method157(18);
        class643.method3582(1);
        class466.method2667(102);
        class204.method1359();
        class342.method2047(-105);
        class586.method3268(15261);
        class119.method856(-101);
        class421.method2399(0);
        class547.method3009(2);
        class572.method3151(true);
        class111.method836();
        class165.method1145(-18414);
        class460.method2650(105);
        class232.method1467(-108);
        class323.method1960((byte) 121);
        class305.method1878(126);
        class293.method1834(true);
        class633.method3516(123);
        class374.method2180(1);
        class603.method3340(-16);
        class491.method2752(-1);
        class100.method770(30941);
        class164.method1139(-2);
        class234.method1479((byte) 106);
        class400.method2274((byte) -63);
        class98.method764(-55);
        class191.method1266(94);
        class662.method3671(-19);
        class459.method2648(0);
        class319.method1949(true);
        class310.method1908(98);
        class230.method1460((byte) -123);
        class630.method3498(1);
        class569.method3136((byte) 88);
        class264.method1603(-90);
        class503.method2800(-128);
        class641.method3571((byte) 83);
        class552.method3034((byte) -93);
        class250.method1548(-25176);
        class435.method2500(-84);
        class650.method3617((byte) -64);
        class590.method3282(122);
        class624.method3468((byte) 23);
        class672.method3716(0);
        class106.method804((byte) 89);
        class689.method3794(-1);
        class238.method1502(4);
        class253.method1558((byte) -118);
        class487.method2742((byte) -60);
        class418.method2387(-93);
        class417.method2381(-18350);
        class64.method521(121);
        class207.method1371((byte) -41);
        class35.method163((byte) -77);
        class450.method2582(20444);
        class152.method1066(91);
        class146.method1021(98);
        class272.method1637(false);
        class479.method2718(124);
        class11.method54((byte) -11);
        class370.method2167(-11570);
        class485.method2735(-128);
        class509.method2832((byte) 117);
        class269.method1631(true);
        class44.method248(0);
        class312.method1914((byte) -2);
        class688.method3786(-44);
        class424.method2412(0);
        class316.method1935((byte) 126);
        class587.method3271(-31989);
        class83.method649(true);
        class490.method2748(0);
        class640.method3566(false);
        class469.method2671(-748);
        class526.method2924((byte) 74);
        class585.method3261((byte) 85);
        class317.method1942(10);
        class69.method569();
        class622.method3464(128);
        class112.method838(8182);
        class592.method3295(127);
        class72.method579(-30267);
        class315.method1927(0);
        class68.method558(0);
        class419.method2392((byte) -50);
        class125.method890((byte) 70);
        class108.method814(110);
        class615.method3402((byte) 113);
        class267.method1628((byte) -125);
        class139.method981(21493);
        class637.method3552(false);
        class385.method2218(false);
        class623.method3466(true);
        class415.method2368();
        class339.method2034(142);
        class63.method514(false);
        class409.method2340();
        class562.method3112();
        class19.method99((byte) 38);
        class579.method3170((byte) 127);
        class332.method2005();
        class301.method1864((byte) 19);
        class694.method3811(-107);
        class162.method1125(70);
        class184.method1236(-69);
        class536.method2962(2);
        class632.method3512(-24199);
        class80.method639((byte) -119);
        class182.method1232(3719);
        class206.method1365(-19334);
        class52.method373((byte) 121);
        class95.method692(-102);
        class166.method1147((byte) -118);
        class163.method1135();
        class423.method2404((byte) -91);
        class383.method2209((byte) 103);
        class99.method765(-29045);
        class143.method1008((byte) 48);
        class605.method3350(65535);
        class252.method1556(true);
        class683.method3769(-127);
        class635.method3527(32714);
        class290.method1823((byte) -125);
        class626.method3484(0);
        class477.method2711(false);
        class326.method1973(59);
        class200.method1345(-24056);
        class377.method2191(7640);
        class678.method3743((byte) -128);
        class422.method2401((byte) 85);
        class656.method3640(-117);
        class246.method1521(5);
        class36.method169(51);
        class581.method3254(false);
        class289.method1791(false);
        class471.method2682((byte) -124);
        class512.method2842(4);
        class525.method2915((byte) 84);
        class693.method3807((byte) 22);
        class133.method951(127);
        class524.method2902((byte) 125);
        class220.method1417((byte) 98);
        class186.method1245(1);
        class625.method3478(172);
        class591.method3291((byte) 7);
        class646.method3596((byte) -125);
        class159.method1098((byte) -63);
        class22.method111((byte) -111);
        class403.method2303(-128);
        class74.method593(14977);
        class57.method500(150198248);
        class389.method2238((byte) 16);
        class580.method3203((byte) 96);
        class657.method3642(18);
        class82.method642(19645);
        class292.method1831((byte) 115);
        class367.method2151((byte) 4);
        class228.method1456(6);
        class15.method74((byte) 102);
        class500.method2793((byte) 104);
        class53.method375(-127);
        class266.method1625(28);
        class654.method3635((byte) 98);
        class42.method231((byte) 123);
        class229.method1458((byte) -123);
        class84.method650(-27642);
        class354.method2101(9);
        class349.method2074((byte) 85);
        class120.method861(33984);
        class364.method2132(-111);
        class452.method2596();
        class368.method2164(16711680);
        class24.method116(7330);
        class454.method2604((byte) -76);
        class183.method1234(0);
        class395.method2249(false);
        class355.method2102((byte) -128);
        class465.method2666((byte) 0);
        class288.method1734(1363);
        class398.method2263((byte) 112);
        class441.method2525((byte) 125);
        if (arg0 < 28) {
            return;
        }
        class66.method541(28121);
        class105.method799((byte) 20);
        class7.method37(8);
        class29.method132((byte) -89);
        class507.method2824((byte) 39);
        class607.method3357((byte) 14);
        class414.method2361(-109);
        class87.method659(false);
        class23.method114(-124);
        class522.method2886(-3758);
        class604.method3346(-1706347103);
        class571.method3146(-21565);
        class94.method688(true);
        class628.method3491((byte) 90);
        class380.method2198((byte) 9);
        class673.method3723(true);
        class612.method3378((byte) -107);
        class502.method2799(-28509);
        class222.method1425((byte) 54);
        class636.method3540();
        class223.method1430(-1);
        class614.method3398(-19870);
        class686.method3774(1000);
        class611.method3376();
        class291.method1828(false);
        class448.method2574(-68);
        class85.method654((byte) 32);
        class437.method2511(125);
        class175.method1199(-115);
        class533.method2947(-4);
        class508.method2827(-29473);
        class134.method961((byte) -93);
        class135.method970(0);
        class540.method2976(4893);
        class91.method676(false);
        class601.method3332(true);
        class65.method533(-1);
        class610.method3372(66);
        class609.method3368(16);
        class46.method259(-61);
        class62.method511((byte) -124);
        class341.method2044(0);
        class168.method1157(74);
        class438.method2513((byte) -117);
        class327.method1977((byte) -68);
        class314.method1926(-3109);
        class334.method2022((byte) -95);
        class570.method3137((byte) 111);
        class278.method1685(true);
        class145.method1018((byte) -38);
        class331.method2000((byte) -68);
        class642.method3578(3);
        class199.method1343((byte) 108);
        class313.method1922((byte) 90);
        class325.method1970(0);
        class495.method2769(42);
        class71.method577(-15843);
        class506.method2818(1);
        class10.method46((byte) -104);
        class88.method661(33);
        class170.method1167(116);
        class26.method123(0);
        class227.method1453(0);
        class472.method2683(-27652);
        class548.method3015(true);
        class498.method2781(false);
        class150.method1051(0);
        class644.method3584(-116);
        class634.method3524(false);
        class474.method2694((byte) -108);
        class412.method2347(21108);
        class47.method264(1);
        class273.method1665((byte) -81);
        class41.method183(true);
        class179.method1210((byte) -85);
        class110.method822(-102);
        class684.method3771(115);
        class190.method1260(-1361);
        class340.method2037(4096);
        class126.method898(-58);
        class283.method1711((byte) 62);
        class244.method1512(3553);
        class102.method789((byte) -70);
        class387.method2232((byte) -111);
        class302.method1867(true);
        class594.method3297(1024);
        class350.method2078((byte) -5);
        class101.method778(-10);
        class231.method1463(21359);
        class488.method2744((byte) 65);
        class520.method2881(-3536);
        class311.method1909(-62);
        class93.method685((byte) -49);
        class270.method1634((byte) 124);
        class357.method2113(-125);
        class537.method2964((byte) -64);
        class208.method1376((byte) 127);
        class31.method139(13342);
        class185.method1242(21654);
        class362.method2123(88);
        class261.method1599((byte) 100);
        class137.method975(16777215);
        class113.method841((byte) 98);
        class158.method1095((byte) -123);
        class130.method906(-1);
        class345.method2056(90);
        class534.method2953((byte) 126);
        class546.method3005((byte) -102);
        class553.method3038(1);
        class240.method1508(false);
        class201.method1348(28);
        class280.method1699(641);
        class515.method2862((byte) -102);
        class528.method2929(8);
        class274.method1670(36);
        class138.method976((byte) -93);
        class551.method3030((byte) 65);
        class195.method1318((byte) -37);
        class575.method3160((byte) -72);
        class545.method2999((byte) 126);
        class239.method1506(true);
        class399.method2268(-90);
        class188.method1250((byte) 3);
        class245.method1518(5);
        class104.method795(25044);
        class1.method7((byte) 96);
        class602.method3335(125);
        class627.method3487(0);
        class117.method853(42);
        class249.method1539(-122);
        class144.method1010(14);
        if (class631.field8834) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method1641(int arg0) {
        int var1 = class64.field851;
        int[] var2 = class53.field759;
        for (int var3 = 0; var3 < class602.field8365 + var1; var3++) {
            class457 var4;
            if (var3 < var1) {
                var4 = class495.field6821[var2[var3]];
            } else {
                var4 = ((class178) class323.field4762.method2061(-17305, (long) class594.field8262[var3 - var1])).field2634;
            }
            if (var4.field520 == arg0 && var4.field6415 >= 0) {
                int var5 = var4.method1722((byte) -127);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field509 & 0x1FF) != 0 || (var4.field514 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field509 & 0x1FF) != 256 || (var4.field514 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field509 >> 9;
                    int var7 = var4.field514 >> 9;
                    if (var4.field6415 > class561.field7570[var6][var7]) {
                        class561.field7570[var6][var7] = var4.field6415;
                        class205.field3022[var6][var7] = 1;
                    } else if (class561.field7570[var6][var7] == var4.field6415) {
                        var10002 = class205.field3022[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field509 - var8 >> 9;
                    int var10 = var4.field514 - var8 >> 9;
                    int var11 = var4.field509 + var8 >> 9;
                    int var12 = var4.field514 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field6415 > class561.field7570[var13][var14]) {
                                class561.field7570[var13][var14] = var4.field6415;
                                class205.field3022[var13][var14] = 1;
                            } else if (class561.field7570[var13][var14] == var4.field6415) {
                                var10002 = class205.field3022[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II[IIIIII)V")
    public static final void method1642(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3848++;
        if (arg6 > 0 && !class17.method89(arg6, arg3 ^ 0x1E4C9E6F)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class17.method89(arg1, 508337774)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            int var9 = arg6 < arg1 ? arg6 : arg1;
            int var10 = arg6 >> 1;
            int var11 = arg1 >> 1;
            if (arg3 != 1) {
                field3854 = null;
            }
            int[] var12 = arg2;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg5, var8, arg7, arg6, arg1, 0, arg4, arg0, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg6 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 24 & 0xFF;
                        int var24 = (var20 & 0xFF98) >> 8;
                        int var25 = var20 & 0xFF;
                        int var26 = var20 >> 16 & 0xFF;
                        int var27 = var12[var16++];
                        int var28 = (var22 >> 24 & 0xFF) + var23;
                        int var29 = (var22 & 0xFF) + var25;
                        int var30 = ((var22 & 0xFFA5) >> 8) + var24;
                        int var31 = ((var22 & 0xFF0246) >> 16) + var26;
                        int var32 = (var21 >> 24 & 0xFF) + var28;
                        int var33 = (var21 >> 8 & 0xFF) + var30;
                        int var34 = (var21 >> 16 & 0xFF) + var31;
                        int var35 = (var21 & 0xFF) + var29;
                        int var36 = ((var27 & 0xFF5F) >> 8) + var33;
                        int var37 = (var27 >> 24 & 0xFF) + var32;
                        int var38 = (var27 >> 16 & 0xFF) + var34;
                        int var39 = (var27 & 0xFF) + var35;
                        var13[var14++] = class266.method1624(class266.method1624(class266.method1624(class249.method1537(var37 << 22, -16777216), class249.method1537(var38, 1020) << 14), class249.method1537(var36 << 6, 65280)), class249.method1537(255, var39 >> 2));
                    }
                    var15 += arg6;
                    var16 += arg6;
                }
                var13 = var12;
                var12 = var17;
                arg1 = var11;
                arg6 = var10;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1643(int arg0) {
        if (arg0 != 4) {
            field3838 = null;
        }
        field3841++;
        boolean var2 = class232.field3302.method2809((byte) 102);
        if (!var2) {
            this.method1660(1000);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1644(int arg0) {
        field3846++;
        if (class340.field4947 == 14) {
            return;
        }
        long var2 = class34.method158(-8502) / 1000000L - class459.field6501;
        class459.field6501 = class34.method158(-8502) / 1000000L;
        boolean var4 = class268.method1630(-123);
        if (var4 && class267.field3792 && class552.field7489 != null) {
            class552.field7489.method2228(-25981);
        }
        if (class608.method3366((byte) -61, class340.field4947)) {
            if (class438.field6179 != 0L && class438.field6179 < class680.method3756(-123)) {
                class679.method3752(class402.method2292(true), false, class274.field3872.field886, (byte) -120, class274.field3872.field912);
            } else if (!class630.field8790.method408() && class76.field1043) {
                class136.method972(false);
            }
        }
        if (class164.field2504 == null) {
            Container var5;
            if (class166.field2513 != null) {
                var5 = class166.field2513;
            } else if (class188.field2779 == null) {
                var5 = class374.field5299;
            } else {
                var5 = class188.field2779;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class166.field2513 == var5) {
                Insets var8 = class166.field2513.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class43.field650 != var6 || class693.field9716 != var7 || class43.field646) {
                if (class630.field8790 == null || class630.field8790.method447()) {
                    class245.method1517(-769);
                } else {
                    class693.field9716 = var7;
                    class43.field650 = var6;
                }
                class438.field6179 = class680.method3756(-113) + 500L;
                class43.field646 = false;
            }
        }
        if (class164.field2504 != null && !class368.field5268 && class608.method3366((byte) -122, class340.field4947)) {
            class679.method3752(class274.field3872.field917, false, -1, (byte) -112, -1);
        }
        boolean var9 = false;
        if (arg0 != -18130) {
            field3838 = null;
        }
        if (class192.field2835) {
            class192.field2835 = false;
            var9 = true;
        }
        if (var9) {
            class457.method2639((byte) 95);
        }
        if (class630.field8790 != null && class630.field8790.method408() || class402.method2292(true) != 1) {
            class336.method2026(100);
        }
        if (class324.method1964(class340.field4947, (byte) 66)) {
            class230.method1459(true, var9);
        } else if (class344.method2052(class340.field4947, 0)) {
            class504.method2802((byte) -118);
        } else if (class399.method2267(7, class340.field4947)) {
            class504.method2802((byte) -126);
        } else if (class112.method839(class340.field4947, 127)) {
            if (class594.field8263 == 1) {
                if (class388.field5452 > class437.field6165) {
                    class437.field6165 = class388.field5452;
                }
                int var10 = (class437.field6165 - class388.field5452) * 50 / class437.field6165;
                class364.method2133(class9.field99.method42(class666.field9377, 19572) + "<br>(" + var10 + "%)", 0, class668.field9418, true);
            } else if (class594.field8263 == 2) {
                if (class539.field7317 < class336.field4907) {
                    class539.field7317 = class336.field4907;
                }
                int var11 = (class539.field7317 - class336.field4907) * 50 / class539.field7317 + 50;
                class364.method2133(class9.field99.method42(class666.field9377, 19572) + "<br>(" + var11 + "%)", 0, class668.field9418, true);
            } else {
                class364.method2133(class9.field99.method42(class666.field9377, arg0 ^ 0xFFFFF55A), arg0 ^ 0xFFFFB92E, class668.field9418, true);
            }
        } else if (class340.field4947 == 10) {
            class85.method653(var2, -100);
        } else if (class340.field4947 == 13) {
            class364.method2133(class9.field101.method42(class666.field9377, 19572) + "<br>" + class9.field102.method42(class666.field9377, 19572), 0, class668.field9418, true);
        }
        if (class103.field1396 == 3) {
            for (int var12 = 0; var12 < class150.field2245; var12++) {
                Rectangle var13 = class121.field1678[var12];
                if (class291.field4388[var12]) {
                    class630.field8790.method3558((byte) 113, var13.y, -1996553985, var13.width, var13.height, var13.x);
                } else if (class183.field2696[var12]) {
                    class630.field8790.method3558((byte) 119, var13.y, -1996554240, var13.width, var13.height, var13.x);
                }
            }
        }
        if (class285.method1715(false)) {
            class179.method1212(class630.field8790, 30);
        }
        if (class503.field6878.field1090 && class608.method3366((byte) -65, class340.field4947) && class103.field1396 == 0 && class402.method2292(true) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class150.field2245; var17++) {
                if (class183.field2696[var17]) {
                    class183.field2696[var17] = false;
                    class427.field6003[var16++] = class121.field1678[var17];
                }
            }
            try {
                class630.field8790.method319(class427.field6003, var16);
            } catch (class211 var18) {
            }
        } else if (class340.field4947 != 0) {
            for (int var14 = 0; var14 < class150.field2245; var14++) {
                class183.field2696[var14] = false;
            }
            try {
                class630.field8790.method365();
            } catch (class211 var19) {
                class139.method985((byte) -108, var19.getMessage() + " (Recovered) " + this.method1659(11), var19);
                class339.method2033(0, -28863);
            }
        }
        if (class274.field3872.field883 == 0) {
            class419.method2390(124, 15L);
        } else if (class274.field3872.field883 == 1) {
            class419.method2390(106, 10L);
        } else if (class274.field3872.field883 == 2) {
            class419.method2390(53, 5L);
        } else if (class274.field3872.field883 == 3) {
            class419.method2390(116, 2L);
        }
        if (class244.field3481) {
            class584.method3259(arg0 ^ 0x46AB);
        }
        if (class274.field3872.field872 && class340.field4947 == 3 && class677.field9551 != -1) {
            class274.field3872.field872 = false;
            class274.field3872.method2439(-2, class503.field6878);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1645() {
        class26.field336 = 0;
        for (int var0 = 0; var0 < class602.field8365; var0++) {
            class225 var1 = ((class178) class323.field4762.method2061(-17305, (long) class594.field8262[var0])).field2634;
            if (var1.field6461 && var1.method1438((byte) -123) != -1) {
                int var2 = (var1.method1722((byte) -122) - 1) * 256 + 252;
                int var3 = var1.field509 - var2 >> 9;
                int var4 = var1.field514 - var2 >> 9;
                class457 var5 = class689.method3791(4, var4, var1.field520, var3);
                if (var5 != null) {
                    int var6 = var5.field6388;
                    if (var5 instanceof class225) {
                        var6 += 2048;
                    }
                    if (var5.field6401 == 0 && var5.method1438((byte) -101) != -1) {
                        class52.field749[class26.field336] = var6;
                        class551.field7456[class26.field336] = var6;
                        class26.field336++;
                        var5.field6401++;
                    }
                    class52.field749[class26.field336] = var6;
                    class551.field7456[class26.field336] = var1.field6388 + 2048;
                    class26.field336++;
                    var5.field6401++;
                }
            }
        }
        class65.method524(0, class26.field336 - 1, class52.field749, class551.field7456, (byte) -73);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3852++;
        if (!this.method3506(34)) {
            return;
        }
        class634.field8875 = new class397();
        class634.field8875.field5522 = Integer.parseInt(this.getParameter("worldid"));
        class92.field1218 = new class397();
        class92.field1218.field5522 = Integer.parseInt(this.getParameter("lobbyid"));
        class92.field1218.field5516 = this.getParameter("lobbyaddress");
        class680.field9588 = new class397();
        class680.field9588.field5522 = Integer.parseInt(this.getParameter("demoid"));
        class680.field9588.field5516 = this.getParameter("demoaddress");
        class500.field6862 = class492.method2756(Integer.parseInt(this.getParameter("modewhere")), (byte) 12);
        if (class500.field6862 == class46.field682) {
            class500.field6862 = class128.field1770;
        } else if (!class547.method3006(class500.field6862, 1) && class500.field6862 != class112.field1530) {
            class500.field6862 = class112.field1530;
        }
        class463.field6523 = class52.method370(Integer.parseInt(this.getParameter("modewhat")), -114);
        if (class463.field6523 != class318.field4722 && class463.field6523 != class448.field6267 && class463.field6523 != class150.field2236) {
            class463.field6523 = class150.field2236;
        }
        try {
            class666.field9377 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class666.field9377 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class80.field1106 = true;
        } else {
            class80.field1106 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class413.field5848 = true;
        } else {
            class413.field5848 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class181.field2679 = true;
        } else {
            class181.field2679 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class158.field2374 = class161.field2419;
            } else if (var4.equals("1")) {
                class158.field2374 = class350.field5045;
            }
        }
        try {
            class287.field3995 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class287.field3995 = 0;
        }
        class662.field9337 = this.getParameter("quiturl");
        class240.field3454 = this.getParameter("settings");
        if (class240.field3454 == null) {
            class240.field3454 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class383.field5368 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class383.field5368 = 0;
            }
        }
        class72.field991 = Integer.parseInt(this.getParameter("colourid"));
        if (class72.field991 < 0 || class327.field4829.length <= class72.field991) {
            class72.field991 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class135.field1909 = true;
            class206.field3037 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class288.field4013 = true;
        }
        class690.field9699 = this.getParameter("sskey");
        if (class690.field9699 != null && class690.field9699.length() < 2) {
            class690.field9699 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class188.field2778 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class677.field9552 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class531.field7245 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        if (class161.field2419 == class158.field2374) {
            class652.field9217 = 765;
            class603.field8386 = 503;
        } else if (class350.field5045 == class158.field2374) {
            class603.field8386 = 480;
            class652.field9217 = 640;
        }
        class258.field3685 = this;
        this.method3504(34, class603.field8386, class652.field9217, class158.field2374.field9177, false, class463.field6523.method1967(-16946) + 32, 614);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1646(byte arg0) {
        field3847++;
        if (class340.field4947 == 14) {
            return;
        }
        class239.field3440++;
        if (class239.field3440 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class311.field4617 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class68.field921.setSeed((long) class311.field4617);
        }
        if ((class239.field3440 % 50) == 0) {
            class592.field8247 = class321.field4747;
            class186.field2749 = class661.field9310;
            class321.field4747 = 0;
            class661.field9310 = 0;
        }
        this.method1643(4);
        if (class375.field5313 != null) {
            class375.field5313.method2353(64);
        }
        int var3 = 30 / ((-arg0 - 66) / 59);
        class686.method3777(false);
        class531.field7246.method667((byte) 74);
        class46.field686.method62(101);
        if (class630.field8790 != null) {
            class630.field8790.method299((int) class680.method3756(-47));
        }
        class588.method3272(24);
        class95.field1255 = 0;
        class438.field6178 = 0;
        for (class109 var4 = class531.field7246.method664((byte) -126); var4 != null; var4 = class531.field7246.method664((byte) -126)) {
            int var7 = var4.method820(-25607);
            if (var7 == 2 || var7 == 3) {
                char var8 = var4.method817((byte) -100);
                if (class492.method2755(22050) && (var8 == '`' || var8 == '§')) {
                    if (class285.method1715(false)) {
                        class427.method2419(-121);
                    } else {
                        class542.method2979((byte) 41);
                    }
                } else if (class95.field1255 < 128) {
                    class526.field7216[class95.field1255] = var4;
                    class95.field1255++;
                }
            } else if (var7 == 0 && class438.field6178 < 75) {
                class451.field6299[class438.field6178] = var4;
                class438.field6178++;
            }
        }
        class355.field5089 = 0;
        for (class113 var5 = class46.field686.method72(-49); var5 != null; var5 = class46.field686.method72(-49)) {
            int var6 = var5.method844(85);
            if (var6 == -1) {
                class679.field9570.method1273(var5, (byte) 122);
            } else if (var6 == 6) {
                class355.field5089 += var5.method842(15);
            } else if (class571.method3144(true, var6)) {
                class441.field6211.method1273(var5, (byte) 122);
                if (class441.field6211.method1276(127) > 10) {
                    class441.field6211.method1272(0);
                }
            }
        }
        if (class285.method1715(false)) {
            class169.method1163((byte) 21);
        }
        if (class324.method1964(class340.field4947, (byte) 110)) {
            class323.method1962(false);
            class456.method2629(true);
        } else if (class112.method839(class340.field4947, 84)) {
            class471.method2679((byte) -113);
        }
        if (class283.method1710(class340.field4947, -6060) && !class112.method839(class340.field4947, -105)) {
            this.method1653((byte) -121);
            class533.method2950((byte) -128);
            class654.method3638(3);
        } else if (class202.method1352(class340.field4947, (byte) -52) && !class112.method839(class340.field4947, -104)) {
            this.method1653((byte) -17);
            class654.method3638(3);
        } else if (class340.field4947 == 12) {
            class654.method3638(3);
        } else if (class601.method3330(-73, class340.field4947) && !class112.method839(class340.field4947, -92)) {
            class508.method2828(9620);
        } else if (class340.field4947 == 13) {
            class654.method3638(3);
            if (class448.field6268 != -3 && class448.field6268 != 2 && class448.field6268 != 15) {
                class528.method2930(false, 2);
            }
        }
        class104.method796(class630.field8790, 92);
        class441.field6211.method1272(0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lfaa;)Lfaa;")
    public static final class140 method1647(class140 arg0) {
        int var1 = method1655(arg0).method2843((byte) -35);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class266.method1626(arg0.field2054, 104);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1648(int arg0) {
        int var1 = class64.field851;
        int[] var2 = class53.field759;
        int var3 = class78.field1070 ? var1 : class602.field8365 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class457 var5;
            if (var4 < var1) {
                var5 = class495.field6821[var2[var4]];
            } else {
                var5 = ((class178) class323.field4762.method2061(-17305, (long) class594.field8262[var4 - var1])).field2634;
            }
            if (var5.field520 == arg0) {
                var5.field6401 = 0;
                if (var5.field6415 < 0) {
                    var5.field6461 = false;
                } else {
                    int var6 = var5.method1722((byte) -127);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field509 & 0x1FF) != 0 || (var5.field514 & 0x1FF) != 0) {
                            var5.field6461 = false;
                            continue;
                        }
                    } else if ((var5.field509 & 0x1FF) != 256 || (var5.field514 & 0x1FF) != 256) {
                        var5.field6461 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field509 >> 9;
                        int var8 = var5.field514 >> 9;
                        if (class561.field7570[var7][var8] != var5.field6415) {
                            var5.field6461 = true;
                            continue;
                        }
                        if (class205.field3022[var7][var8] > 1) {
                            var10002 = class205.field3022[var7][var8]--;
                            var5.field6461 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field509 - var9 >> 9;
                        int var11 = var5.field514 - var9 >> 9;
                        int var12 = var5.field509 + var9 >> 9;
                        int var13 = var5.field514 + var9 >> 9;
                        if (!class647.method3606(var5.field6415, var12, var10, var11, var13, 98)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class561.field7570[var14][var15] == var5.field6415) {
                                        var10002 = class205.field3022[var14][var15]--;
                                    }
                                }
                            }
                            var5.field6461 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class286 && var5.field6486 != null && class239.field3440 >= var5.field6486.field4425 && class239.field3440 < var5.field6486.field4436) {
                        ((class286) var5).field3974 = false;
                    }
                    var5.field6461 = false;
                    var5.field518 = class203.method1355(var5.field514, var5.field509, 4, var5.field520);
                    class580.method3224(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1649(int arg0) {
        field3850++;
        if (class188.field2778) {
            class202.field2968 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class245.method1517(-769);
        class234.field3319 = new class451(class503.field6878);
        class232.field3302 = new class504();
        if (class500.field6862 != class112.field1530) {
            class604.field8397 = new byte[50][];
        }
        class274.field3872 = new class431(class503.field6878);
        if (class500.field6862 == class112.field1530) {
            class634.field8875.field5516 = this.getCodeBase().getHost();
        } else if (class547.method3006(class500.field6862, 1)) {
            class634.field8875.field5516 = this.getCodeBase().getHost();
            class634.field8875.field5521 = class634.field8875.field5522 + 40000;
            class92.field1218.field5521 = class92.field1218.field5522 + 40000;
            class680.field9588.field5521 = class680.field9588.field5522 + 40000;
            class634.field8875.field5515 = class634.field8875.field5522 + 50000;
            class92.field1218.field5515 = class92.field1218.field5522 + 50000;
            class680.field9588.field5515 = class680.field9588.field5522 + 50000;
        } else if (class500.field6862 == class46.field682) {
            class634.field8875.field5516 = "127.0.0.1";
            class92.field1218.field5516 = "127.0.0.1";
            class634.field8875.field5521 = class634.field8875.field5522 + 40000;
            class680.field9588.field5516 = "127.0.0.1";
            class92.field1218.field5521 = class92.field1218.field5522 + 40000;
            class634.field8875.field5515 = class634.field8875.field5522 + 50000;
            class680.field9588.field5521 = class680.field9588.field5522 + 40000;
            class92.field1218.field5515 = class92.field1218.field5522 + 50000;
            class680.field9588.field5515 = class680.field9588.field5522 + 50000;
        }
        if (class161.field2419 == class158.field2374) {
            class503.field6880 = false;
        }
        if (class350.field5045 == class158.field2374) {
            class471.field6577 = class638.field9065;
            class531.field7241 = class640.field9079;
            class227.field3262 = class672.field9457;
            class137.field1930 = 16777215;
            class448.field6270 = 0;
            class46.field689 = true;
            class459.field6500 = class95.field1248;
        } else {
            class471.field6577 = class318.field4723;
            class531.field7241 = class200.field2958;
            class459.field6500 = class228.field3264;
            class227.field3262 = class25.field333;
        }
        class349.field5023 = class190.field2811 = class610.field8474 = class391.field5474 = new short[256];
        class195.field2887 = class634.field8875;
        class531.field7246 = class693.method3808(class105.field1413, 0);
        class46.field686 = class455.method2623(true, (byte) -122, class105.field1413);
        try {
            if (class503.field6878.field1094 != null) {
                class140.field2094 = new class408(class503.field6878.field1094, 5200, 0);
                for (int var3 = 0; var3 < 34; var3++) {
                    class435.field6148[var3] = new class408(class503.field6878.field1080[var3], 6000, 0);
                }
                class152.field2276 = new class408(class503.field6878.field1073, 6000, 0);
                class87.field1192 = new class476(255, class140.field2094, class152.field2276, 500000);
                class432.field6076 = new class408(class503.field6878.field1086, 24, 0);
                class503.field6878.field1094 = null;
                class503.field6878.field1086 = null;
                class503.field6878.field1080 = null;
                class503.field6878.field1073 = null;
            }
            if (arg0 != 500000) {
                this.method1662(false);
            }
        } catch (IOException var4) {
            class140.field2094 = null;
            class432.field6076 = null;
            class87.field1192 = null;
            class152.field2276 = null;
        }
        if (class500.field6862 != class112.field1530) {
            class99.field1356 = true;
        }
        if (class161.field2419 == class158.field2374) {
            class571.field7672 = class9.field84.method42(class666.field9377, 19572);
        } else if (class350.field5045 == class158.field2374) {
            class571.field7672 = class9.field90.method42(class666.field9377, 19572);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1650(int arg0, int arg1) {
        class309.field4604 = null;
        class81.field1136 = null;
        class232.field3302.field6909 = arg0;
        class232.field3302.field6907++;
        class458.field6493 = arg1;
        field3840++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1651(boolean arg0) {
        if (!arg0) {
            field3854 = null;
        }
        field3853++;
        if (class429.field6020 != 2) {
            this.method1644(-18130);
            return;
        }
        try {
            this.method1644(-18130);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class139.method985((byte) -97, var5.getMessage() + " (Recovered) " + this.method1659(11), var5);
            class339.method2033(0, -28863);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method1652(int arg0) {
        field3838 = null;
        field3854 = null;
        if (arg0 != 0) {
            method1656(null, 90, -92, -5, -81, 31, 41, 47, 15, 33);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1653(byte arg0) {
        if (class340.field4947 == 7 && class471.field6576 == 0) {
            if (class77.field1062 > 1) {
                class656.field9242 = class93.field1231;
                class77.field1062--;
            }
            if (!class229.field3278) {
                class72.method580(true);
            }
            for (int var2 = 0; var2 < 100 && class650.method3619(-51); var2++) {
            }
        }
        field3849++;
        class371.field5290++;
        class359.method2116(-1, null, 8191, -1);
        class212.method1389(-1, -1, null, (byte) 36);
        class396.method2252(-121);
        if (arg0 > -12) {
            return;
        }
        class93.field1231++;
        for (int var3 = 0; var3 < class679.field9578; var3++) {
            class225 var4 = class252.field3537[var3].field2634;
            if (var4 != null) {
                byte var5 = var4.field3245.field2466;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1722((byte) -119);
                    if ((var5 & 0x2) != 0 && var4.field6485 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field6483[0] + var7;
                            int var10 = var4.field6477[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class86.field1185 - var6 - 1) < var9) {
                                var9 = class86.field1185 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class526.field7212 - var6 - 1 < var10) {
                                var10 = class526.field7212 - var6 - 1;
                            }
                            int var11 = class371.method2170(-1, var10, class480.field6696[var4.field520], true, class315.field4687, false, var9, var6, var4.field6477[0], var6, class66.field871, var4.field6483[0], 0, var6, 0);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field6483[var12] = class66.field871[var11 - var12 - 1];
                                    var4.field6477[var12] = class315.field4687[var11 - var12 - 1];
                                    var4.field6482[var12] = 1;
                                }
                                var4.field6485 = var11;
                            }
                        }
                    }
                    class691.method3803(127, true, var4);
                    int var13 = class485.method2736((byte) -63, var4);
                    class291.method1827((byte) -50, var4, class308.field4576, var13, class326.field4811);
                    class414.method2359(-1, var4);
                }
            }
        }
        if (class471.field6576 == 0 && class595.field8273 == 0) {
            if (class670.field9445 == 2) {
                class309.method1906(true);
            } else {
                class455.method2610(-59);
            }
            if ((class172.field2572 >> 9) < 14 || class172.field2572 >> 9 >= class86.field1185 - 14 || class117.field1563 >> 9 < 14 || class117.field1563 >> 9 >= class526.field7212 - 14) {
                class65.method532(0);
            }
        }
        while (true) {
            class388 var14;
            class140 var15;
            class140 var16;
            do {
                var14 = (class388) class52.field744.method1272(0);
                if (var14 == null) {
                    while (true) {
                        class388 var17;
                        class140 var18;
                        class140 var19;
                        do {
                            var17 = (class388) class479.field6689.method1272(0);
                            if (var17 == null) {
                                while (true) {
                                    class388 var20;
                                    class140 var21;
                                    class140 var22;
                                    do {
                                        var20 = (class388) class1.field3.method1272(0);
                                        if (var20 == null) {
                                            if (class612.field8489 != null) {
                                                class689.method3793((byte) 37);
                                            }
                                            if ((class239.field3440 % 1500) == 0) {
                                                class1.method3(8);
                                            }
                                            if (class340.field4947 == 7 && class471.field6576 == 0) {
                                                class663.method3672(-15925);
                                            }
                                            class113.method846(true);
                                            if (class417.field5879 && (class680.method3756(-89) - 60000L) > class51.field741) {
                                                class603.method3342(503);
                                            }
                                            for (class261 var23 = (class261) class174.field2600.method3676((byte) -47); var23 != null; var23 = (class261) class174.field2600.method3682(-18176)) {
                                                if ((class680.method3756(-52) / 1000L - 5L) > ((long) var23.field3708)) {
                                                    if (var23.field3709 > 0) {
                                                        class250.method1549("", "", -1, "", 5, var23.field3710 + class9.field153.method42(class666.field9377, 19572), 0);
                                                    }
                                                    if (var23.field3709 == 0) {
                                                        class250.method1549("", "", -1, "", 5, var23.field3710 + class9.field154.method42(class666.field9377, 19572), 0);
                                                    }
                                                    var23.method118(-30545);
                                                }
                                            }
                                            if (class340.field4947 == 7 && class471.field6576 == 0) {
                                                if (class53.field758 == null) {
                                                    class528.method2930(false, 2);
                                                    return;
                                                }
                                                class668.field9401++;
                                                if (class668.field9401 > 50) {
                                                    class222.field3203++;
                                                    class1.method5(1, class200.field2951);
                                                }
                                                try {
                                                    if (class53.field758 != null && class288.field4014.field1301 > 0) {
                                                        class321.field4747 += class288.field4014.field1301;
                                                        class53.field758.method3126(class288.field4014.field1316, false, class288.field4014.field1301, 0);
                                                        class668.field9401 = 0;
                                                        class288.field4014.field1301 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class528.method2930(false, 2);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5443;
                                        if (var21.field2092 < 0) {
                                            break;
                                        }
                                        var22 = class266.method1626(var21.field2054, 108);
                                    } while (var22 == null || var22.field2043 == null || var22.field2043.length <= var21.field2092 || var22.field2043[var21.field2092] != var21);
                                    class523.method2890(var20);
                                }
                            }
                            var18 = var17.field5443;
                            if (var18.field2092 < 0) {
                                break;
                            }
                            var19 = class266.method1626(var18.field2054, 121);
                        } while (var19 == null || var19.field2043 == null || var19.field2043.length <= var18.field2092 || var19.field2043[var18.field2092] != var18);
                        class523.method2890(var17);
                    }
                }
                var15 = var14.field5443;
                if (var15.field2092 < 0) {
                    break;
                }
                var16 = class266.method1626(var15.field2054, 124);
            } while (var16 == null || var16.field2043 == null || var15.field2092 >= var16.field2043.length || var16.field2043[var15.field2092] != var15);
            class523.method2890(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1654() {
        int var0 = class64.field851;
        int[] var1 = class53.field759;
        boolean var2 = class274.field3872.field893 == 1 && var0 > 200 || class274.field3872.field893 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class286 var13 = class495.field6821[var1[var3]];
            if (var13.method1726(5757)) {
                var13.method178(12);
                if (var13.field517 >= 0 && var13.field512 >= 0 && var13.field516 < class86.field1185 && var13.field519 < class526.field7212) {
                    var13.field3974 = var13.field6428 ? var2 : false;
                    if (class253.field3576 == var13) {
                        var13.field6415 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field6461) {
                            var14++;
                        }
                        if (var13.field6466 > class239.field3440) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1722((byte) -124) << 2);
                        if (var13.field3983) {
                            var15 += 512;
                        } else {
                            if (class693.field9711 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field6415 = var15 + 1;
                    }
                } else {
                    var13.field6415 = -1;
                }
            } else {
                var13.field6415 = -1;
            }
        }
        for (int var4 = 0; var4 < class602.field8365; var4++) {
            class225 var10 = ((class178) class323.field4762.method2061(-17305, (long) class594.field8262[var4])).field2634;
            if (var10.method1437(5757) && var10.field3245.method1120(class195.field2888, (byte) -40)) {
                var10.method178(12);
                if (var10.field517 >= 0 && var10.field512 >= 0 && var10.field516 < class86.field1185 && var10.field519 < class526.field7212) {
                    int var11 = 0;
                    if (!var10.field6461) {
                        var11++;
                    }
                    if (var10.field6466 > class239.field3440) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1722((byte) -120) << 2);
                    if (class693.field9711 == 0) {
                        if (var10.field3245.field2436) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class693.field9711 == 1) {
                        if (var10.field3245.field2436) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field3245.field2416) {
                        var12 += 1024;
                    } else if (!var10.field3245.field2438) {
                        var12 += 256;
                    }
                    var10.field6415 = var12 + 1;
                } else {
                    var10.field6415 = -1;
                }
            } else {
                var10.field6415 = -1;
            }
        }
        for (int var5 = 0; var5 < class652.field9219.length; var5++) {
            class375 var6 = class652.field9219[var5];
            if (var6 != null) {
                if (var6.field5317 == 1) {
                    class178 var7 = (class178) class323.field4762.method2061(-17305, (long) var6.field5314);
                    if (var7 != null) {
                        class225 var8 = var7.field2634;
                        if (var8.field6415 >= 0) {
                            var8.field6415 += 2048;
                        }
                    }
                } else if (var6.field5317 == 10) {
                    class286 var9 = class495.field6821[var6.field5314];
                    if (var9 != null && class253.field3576 != var9 && var9.field6415 >= 0) {
                        var9.field6415 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class605.method3351(-115, "Argument count");
            }
            class634.field8875 = new class397();
            class634.field8875.field5522 = Integer.parseInt(arg0[0]);
            class92.field1218 = new class397();
            class92.field1218.field5522 = Integer.parseInt(arg0[1]);
            class680.field9588 = new class397();
            class680.field9588.field5522 = Integer.parseInt(arg0[2]);
            class500.field6862 = class46.field682;
            if (arg0[3].equals("live")) {
                class463.field6523 = class150.field2236;
            } else if (arg0[3].equals("rc")) {
                class463.field6523 = class448.field6267;
            } else if (arg0[3].equals("wip")) {
                class463.field6523 = class318.field4722;
            } else {
                class605.method3351(-43, "modewhat");
            }
            class666.field9377 = class460.method2651(arg0[4], (byte) 74);
            if (class666.field9377 == -1) {
                if (arg0[4].equals("english")) {
                    class666.field9377 = 0;
                } else if (arg0[4].equals("german")) {
                    class666.field9377 = 1;
                } else {
                    class605.method3351(-115, "language");
                }
            }
            class413.field5848 = false;
            class80.field1106 = false;
            if (arg0[5].equals("game0")) {
                class158.field2374 = class161.field2419;
            } else if (arg0[5].equals("game1")) {
                class158.field2374 = class350.field5045;
            } else {
                class605.method3351(108, "game");
            }
            class135.field1909 = true;
            class206.field3037 = true;
            class288.field4013 = false;
            class531.field7245 = 0L;
            class287.field3995 = 0;
            class677.field9552 = 0;
            class240.field3454 = "";
            class383.field5368 = 0;
            class188.field2778 = false;
            class690.field9699 = null;
            class72.field991 = class158.field2374.field9181;
            client var1 = new client();
            class258.field3685 = var1;
            var1.method3505(34, 768, class158.field2374.field9177, (byte) 66, 1024, false, 614, class463.field6523.method1967(-16946) + 32);
            class166.field2513.setLocation(40, 40);
        } catch (Exception var3) {
            class139.method985((byte) -89, null, var3);
        }
        field3845++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lfaa;)Lpo;")
    public static final class513 method1655(class140 arg0) {
        class513 var1 = (class513) class422.field5960.method2061(-17305, ((long) arg0.field2100 << 32) + (long) arg0.field2092);
        return var1 == null ? arg0.field1982 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lfaa;IIIIIIIII)V")
    public static final void method1656(class140[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class140 var11 = arg0[var10];
            if (var11 != null && var11.field2054 == arg1) {
                int var12 = var11.field2029 + arg6;
                int var13 = var11.field2027 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2023 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2121 + var12;
                    int var19 = var11.field2082 + var13;
                    if (var11.field2023 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2023 == 0 || var11.field1988 || method1655(var11).field7010 != 0 || class152.field2271 == var11 || class299.field4459 == var11.field1998) {
                    if (!method1658(var11)) {
                        if (class612.field8489 == var11 && class432.method2483(-12062, class612.field8489) != null) {
                            class605.field8434 = true;
                            class640.field9075 = var12;
                            class226.field3257 = var13;
                        }
                        if (var11.field2119 || var14 < var16 && var15 < var17) {
                            if (var11.field2057 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class388 var20 = (class388) class1.field3.method1270((byte) -25); var20 != null; var20 = (class388) class1.field3.method1282(0)) {
                                    if (var20.field5448) {
                                        var20.method2971(1);
                                        var20.field5443.field2016 = false;
                                    }
                                }
                                if (class364.field5202 == 0) {
                                    class612.field8489 = null;
                                    class152.field2271 = null;
                                }
                                class556.field7519 = 0;
                                class427.field6008 = false;
                                class537.field7299 = false;
                                if (!class229.field3278) {
                                    class72.method580(true);
                                }
                            }
                            boolean var21;
                            if (class46.field686.method70((byte) -115) >= var14 && class46.field686.method66(74) >= var15 && class46.field686.method70((byte) -83) < var16 && class46.field686.method66(74) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class457.field6455 && var21) {
                                if (var11.field2071 >= 0) {
                                    class130.field1787 = var11.field2071;
                                } else if (var11.field2057) {
                                    class130.field1787 = -1;
                                }
                            }
                            if (!class229.field3278 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class89.method665(var11, true, arg8 - var12, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class46.field686.method65((byte) 62) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class113 var24 = (class113) class441.field6211.method1270((byte) -25);
                            if (var24 != null && var24.method844(78) == 0 && var24.method847(-1) >= var14 && var24.method840(126) >= var15 && var24.method847(-1) < var16 && var24.method840(118) < var17) {
                                var23 = true;
                            }
                            if (var11.field2059 != null && !class285.method1715(false)) {
                                for (int var25 = 0; var25 < var11.field2059.length; var25++) {
                                    if (class531.field7246.method666(50, var11.field2059[var25])) {
                                        if (var11.field1968 == null || class239.field3440 >= var11.field1968[var25]) {
                                            byte var26 = var11.field2112[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class531.field7246.method666(50, 86) && !class531.field7246.method666(50, 82) && !class531.field7246.method666(50, 81)) && ((var26 & 0x2) == 0 || class531.field7246.method666(50, 86)) && ((var26 & 0x1) == 0 || class531.field7246.method666(50, 82)) && ((var26 & 0x4) == 0 || class531.field7246.method666(50, 81))) {
                                                if (var25 < 10) {
                                                    class15.method75("", var25 + 1, true, -1, var11.field2100);
                                                } else if (var25 == 10) {
                                                    class651.method3622(-1);
                                                    class513 var27 = method1655(var11);
                                                    class245.method1520(20316, var27.field7014, var27.method2848(-1), var11);
                                                    class281.field3927 = class397.method2262(var11, (byte) 23);
                                                    if (class281.field3927 == null) {
                                                        class281.field3927 = "Null";
                                                    }
                                                    class73.field1010 = var11.field2034 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field2046[var25];
                                                if (var11.field1968 == null) {
                                                    var11.field1968 = new int[var11.field2059.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field1968[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field1968[var25] = class239.field3440 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field1968 != null) {
                                        var11.field1968[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class601.method3331(var11, (byte) 112, var24.method847(-1) - var12, var24.method840(120) - var13);
                            }
                            if (class612.field8489 != null && class612.field8489 != var11 && var21 && method1655(var11).method2844(false)) {
                                class159.field2384 = var11;
                            }
                            if (class152.field2271 == var11) {
                                class363.field5178 = true;
                                class591.field8229 = var12;
                                class136.field1920 = var13;
                            }
                            if (var11.field1988 || var11.field1998 != 0) {
                                if (var21 && class355.field5089 != 0 && var11.field1977 != null) {
                                    class388 var29 = new class388();
                                    var29.field5448 = true;
                                    var29.field5443 = var11;
                                    var29.field5444 = class355.field5089;
                                    var29.field5451 = var11.field1977;
                                    class1.field3.method1273(var29, (byte) 122);
                                }
                                if (class612.field8489 != null || class229.field3278 || class687.field9669 != var11.field1998 && class556.field7519 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field1998 != 0) {
                                    if (class219.field3170 == var11.field1998 || class608.field8459 == var11.field1998) {
                                        class548.field7417 = var11;
                                        if (class127.field1765 != null) {
                                            class127.field1765.method2519(class630.field8790, 1, var11.field2082);
                                        }
                                        if (class219.field3170 == var11.field1998) {
                                            if (!class229.field3278 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class408.method2330(arg8, arg9, class630.field8790, -1);
                                                for (class503 var30 = (class503) class638.field9064.method3676((byte) -17); var30 != null; var30 = (class503) class638.field9064.method3682(-18176)) {
                                                    if (arg8 >= var30.field6881 && arg8 < var30.field6879 && arg9 >= var30.field6877 && arg9 < var30.field6883) {
                                                        class72.method580(true);
                                                        class380.method2200(-1, var30.field6882);
                                                    }
                                                }
                                            }
                                            class359.method2116(var12, var11, 8191, var13);
                                            continue;
                                        }
                                    }
                                    if (class299.field4459 == var11.field1998) {
                                        if (var11.method999((byte) -114, class630.field8790) == null || class124.field1722 != 0 && class124.field1722 != 3 || class229.field3278 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field2020[var32];
                                        if (var31 < var33 || var31 > var11.field2084[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field2121 / 2;
                                        int var35 = var32 - var11.field2082 / 2;
                                        int var36;
                                        if (class670.field9445 == 4) {
                                            var36 = (int) class646.field9167 & 0x3FFF;
                                        } else {
                                            var36 = (int) class646.field9167 + class156.field2356 & 0x3FFF;
                                        }
                                        int var37 = class675.field9542[var36];
                                        int var38 = class675.field9541[var36];
                                        if (class670.field9445 != 4) {
                                            var37 = (class455.field6362 + 256) * var37 >> 8;
                                            var38 = (class455.field6362 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class670.field9445 == 4) {
                                            var41 = (class264.field3734 >> 9) + (var39 >> 2);
                                            var42 = (class30.field363 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class253.field3576.method1722((byte) -128) - 1) * 256;
                                            var41 = (class253.field3576.field509 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class253.field3576.field514 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class457.field6455 && (class414.field5858 & 0x40) != 0) {
                                            class140 var44 = class474.method2695(-12025, class677.field9549, class366.field5205);
                                            if (var44 == null) {
                                                class651.method3622(-1);
                                            } else {
                                                class92.method678(" ->", var41, 58, var11.field1969, var42, 1L, class561.field7575, true, class281.field3927, (byte) -74, false);
                                            }
                                            continue;
                                        }
                                        if (class350.field5045 == class158.field2374) {
                                            class92.method678("", var41, 6, -1, var42, 1L, -1, true, class9.field161.method42(class666.field9377, 19572), (byte) -74, false);
                                        }
                                        class92.method678("", var41, 21, -1, var42, 1L, class584.field8148, true, class354.field5078, (byte) -74, false);
                                        continue;
                                    }
                                    if (class687.field9669 == var11.field1998) {
                                        class31.field375 = var11;
                                        if (var21) {
                                            class427.field6008 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method847(-1) - var12 - var11.field2121 / 2) * 2.0D / (double) class148.field2195);
                                            int var46 = (int) (-((double) (var24.method840(108) - var13 - var11.field2082 / 2) * 2.0D / (double) class148.field2195));
                                            int var47 = class306.field4504 + var45 + class148.field2208;
                                            int var48 = class480.field6695 + var46 + class148.field2206;
                                            class213 var49 = class482.method2725((byte) -113);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1397(var47, var48, var50, 0);
                                            if (var50 != null) {
                                                if (class531.field7246.method666(50, 82) && class658.field9267 > 0) {
                                                    class57.method502(var50[0], var50[2], (byte) -18, var50[1]);
                                                    continue;
                                                }
                                                class537.field7299 = true;
                                                class333.field4875 = var50[0];
                                                class131.field1803 = var50[1];
                                                class92.field1222 = var50[2];
                                            }
                                            class556.field7519 = 1;
                                            class325.field4805 = false;
                                            class534.field7276 = class46.field686.method70((byte) 115);
                                            class156.field2359 = class46.field686.method66(74);
                                            continue;
                                        }
                                        if (var22 && class556.field7519 > 0) {
                                            if (class556.field7519 == 1 && (class534.field7276 != class46.field686.method70((byte) 97) || class156.field2359 != class46.field686.method66(74))) {
                                                class350.field5048 = class306.field4504;
                                                class289.field4070 = class480.field6695;
                                                class556.field7519 = 2;
                                            }
                                            if (class556.field7519 == 2) {
                                                class325.field4805 = true;
                                                class424.method2406(90, class350.field5048 + (int) ((double) (class534.field7276 - class46.field686.method70((byte) 127)) * 2.0D / (double) class148.field2194));
                                                class380.method2201(class289.field4070 - (int) ((double) (class156.field2359 - class46.field686.method66(74)) * 2.0D / (double) class148.field2194), false);
                                            }
                                            continue;
                                        }
                                        if (class556.field7519 > 0 && !class325.field4805) {
                                            if ((class662.field9339 == 1 || class474.method2696((byte) 84)) && class315.field4697 > 2) {
                                                class660.method3652(class156.field2359, class534.field7276, -75);
                                            } else if (class39.method180(-47)) {
                                                class660.method3652(class156.field2359, class534.field7276, -30);
                                            }
                                        }
                                        class556.field7519 = 0;
                                        continue;
                                    }
                                    if (class525.field7166 == var11.field1998) {
                                        if (var22) {
                                            class595.method3298(var11.field2121, class46.field686.method66(74) - var13, 2, class46.field686.method70((byte) 118) - var12, var11.field2082);
                                        }
                                        continue;
                                    }
                                    if (class563.field7594 == var11.field1998) {
                                        class212.method1389(var12, var13, var11, (byte) 36);
                                        continue;
                                    }
                                }
                                if (!var11.field2068 && var23) {
                                    var11.field2068 = true;
                                    if (var11.field2097 != null) {
                                        class388 var51 = new class388();
                                        var51.field5448 = true;
                                        var51.field5443 = var11;
                                        var51.field5449 = var24.method847(-1) - var12;
                                        var51.field5444 = var24.method840(111) - var13;
                                        var51.field5451 = var11.field2097;
                                        class1.field3.method1273(var51, (byte) 122);
                                    }
                                }
                                if (var11.field2068 && var22 && var11.field2070 != null) {
                                    class388 var52 = new class388();
                                    var52.field5448 = true;
                                    var52.field5443 = var11;
                                    var52.field5449 = class46.field686.method70((byte) 111) - var12;
                                    var52.field5444 = class46.field686.method66(74) - var13;
                                    var52.field5451 = var11.field2070;
                                    class1.field3.method1273(var52, (byte) 122);
                                }
                                if (var11.field2068 && !var22) {
                                    var11.field2068 = false;
                                    if (var11.field2015 != null) {
                                        class388 var53 = new class388();
                                        var53.field5448 = true;
                                        var53.field5443 = var11;
                                        var53.field5449 = class46.field686.method70((byte) 86) - var12;
                                        var53.field5444 = class46.field686.method66(74) - var13;
                                        var53.field5451 = var11.field2015;
                                        class479.field6689.method1273(var53, (byte) 122);
                                    }
                                }
                                if (var22 && var11.field2055 != null) {
                                    class388 var54 = new class388();
                                    var54.field5448 = true;
                                    var54.field5443 = var11;
                                    var54.field5449 = class46.field686.method70((byte) -97) - var12;
                                    var54.field5444 = class46.field686.method66(74) - var13;
                                    var54.field5451 = var11.field2055;
                                    class1.field3.method1273(var54, (byte) 122);
                                }
                                if (!var11.field2016 && var21) {
                                    var11.field2016 = true;
                                    if (var11.field1991 != null) {
                                        class388 var55 = new class388();
                                        var55.field5448 = true;
                                        var55.field5443 = var11;
                                        var55.field5449 = class46.field686.method70((byte) 125) - var12;
                                        var55.field5444 = class46.field686.method66(74) - var13;
                                        var55.field5451 = var11.field1991;
                                        class1.field3.method1273(var55, (byte) 122);
                                    }
                                }
                                if (var11.field2016 && var21 && var11.field2117 != null) {
                                    class388 var56 = new class388();
                                    var56.field5448 = true;
                                    var56.field5443 = var11;
                                    var56.field5449 = class46.field686.method70((byte) 89) - var12;
                                    var56.field5444 = class46.field686.method66(74) - var13;
                                    var56.field5451 = var11.field2117;
                                    class1.field3.method1273(var56, (byte) 122);
                                }
                                if (var11.field2016 && !var21) {
                                    var11.field2016 = false;
                                    if (var11.field2087 != null) {
                                        class388 var57 = new class388();
                                        var57.field5448 = true;
                                        var57.field5443 = var11;
                                        var57.field5449 = class46.field686.method70((byte) 95) - var12;
                                        var57.field5444 = class46.field686.method66(74) - var13;
                                        var57.field5451 = var11.field2087;
                                        class479.field6689.method1273(var57, (byte) 122);
                                    }
                                }
                                if (var11.field2120 != null) {
                                    class388 var58 = new class388();
                                    var58.field5443 = var11;
                                    var58.field5451 = var11.field2120;
                                    class52.field744.method1273(var58, (byte) 122);
                                }
                                if (var11.field2022 != null && class587.field8202 > var11.field1970) {
                                    if (var11.field1984 == null || class587.field8202 - var11.field1970 > 32) {
                                        class388 var63 = new class388();
                                        var63.field5443 = var11;
                                        var63.field5451 = var11.field2022;
                                        class1.field3.method1273(var63, (byte) 122);
                                    } else {
                                        label694: for (int var59 = var11.field1970; var59 < class587.field8202; var59++) {
                                            int var60 = class439.field6181[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field1984.length; var61++) {
                                                if (var11.field1984[var61] == var60) {
                                                    class388 var62 = new class388();
                                                    var62.field5443 = var11;
                                                    var62.field5451 = var11.field2022;
                                                    class1.field3.method1273(var62, (byte) 122);
                                                    break label694;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1970 = class587.field8202;
                                }
                                if (var11.field2078 != null && class495.field6819 > var11.field2030) {
                                    if (var11.field1964 == null || class495.field6819 - var11.field2030 > 32) {
                                        class388 var68 = new class388();
                                        var68.field5443 = var11;
                                        var68.field5451 = var11.field2078;
                                        class1.field3.method1273(var68, (byte) 122);
                                    } else {
                                        label670: for (int var64 = var11.field2030; var64 < class495.field6819; var64++) {
                                            int var65 = class516.field7047[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field1964.length; var66++) {
                                                if (var11.field1964[var66] == var65) {
                                                    class388 var67 = new class388();
                                                    var67.field5443 = var11;
                                                    var67.field5451 = var11.field2078;
                                                    class1.field3.method1273(var67, (byte) 122);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2030 = class495.field6819;
                                }
                                if (var11.field2017 != null && class170.field2557 > var11.field2058) {
                                    if (var11.field2099 == null || class170.field2557 - var11.field2058 > 32) {
                                        class388 var73 = new class388();
                                        var73.field5443 = var11;
                                        var73.field5451 = var11.field2017;
                                        class1.field3.method1273(var73, (byte) 122);
                                    } else {
                                        label646: for (int var69 = var11.field2058; var69 < class170.field2557; var69++) {
                                            int var70 = class53.field760[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field2099.length; var71++) {
                                                if (var11.field2099[var71] == var70) {
                                                    class388 var72 = new class388();
                                                    var72.field5443 = var11;
                                                    var72.field5451 = var11.field2017;
                                                    class1.field3.method1273(var72, (byte) 122);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2058 = class170.field2557;
                                }
                                if (var11.field2039 != null && class379.field5342 > var11.field2115) {
                                    if (var11.field1960 == null || class379.field5342 - var11.field2115 > 32) {
                                        class388 var78 = new class388();
                                        var78.field5443 = var11;
                                        var78.field5451 = var11.field2039;
                                        class1.field3.method1273(var78, (byte) 122);
                                    } else {
                                        label622: for (int var74 = var11.field2115; var74 < class379.field5342; var74++) {
                                            int var75 = class144.field2140[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field1960.length; var76++) {
                                                if (var11.field1960[var76] == var75) {
                                                    class388 var77 = new class388();
                                                    var77.field5443 = var11;
                                                    var77.field5451 = var11.field2039;
                                                    class1.field3.method1273(var77, (byte) 122);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2115 = class379.field5342;
                                }
                                if (var11.field2075 != null && class372.field5292 > var11.field2005) {
                                    if (var11.field1989 == null || class372.field5292 - var11.field2005 > 32) {
                                        class388 var83 = new class388();
                                        var83.field5443 = var11;
                                        var83.field5451 = var11.field2075;
                                        class1.field3.method1273(var83, (byte) 122);
                                    } else {
                                        label598: for (int var79 = var11.field2005; var79 < class372.field5292; var79++) {
                                            int var80 = class572.field7710[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field1989.length; var81++) {
                                                if (var11.field1989[var81] == var80) {
                                                    class388 var82 = new class388();
                                                    var82.field5443 = var11;
                                                    var82.field5451 = var11.field2075;
                                                    class1.field3.method1273(var82, (byte) 122);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2005 = class372.field5292;
                                }
                                if (class23.field317 > var11.field1978 && var11.field2061 != null) {
                                    class388 var84 = new class388();
                                    var84.field5443 = var11;
                                    var84.field5451 = var11.field2061;
                                    class1.field3.method1273(var84, (byte) 122);
                                }
                                if (class200.field2957 > var11.field1978 && var11.field2090 != null) {
                                    class388 var85 = new class388();
                                    var85.field5443 = var11;
                                    var85.field5451 = var11.field2090;
                                    class1.field3.method1273(var85, (byte) 122);
                                }
                                if (class662.field9342 > var11.field1978 && var11.field1966 != null) {
                                    class388 var86 = new class388();
                                    var86.field5443 = var11;
                                    var86.field5451 = var11.field1966;
                                    class1.field3.method1273(var86, (byte) 122);
                                }
                                if (class364.field5201 > var11.field1978 && var11.field2093 != null) {
                                    class388 var87 = new class388();
                                    var87.field5443 = var11;
                                    var87.field5451 = var11.field2093;
                                    class1.field3.method1273(var87, (byte) 122);
                                }
                                if (class656.field9242 > var11.field1978 && var11.field1962 != null) {
                                    class388 var88 = new class388();
                                    var88.field5443 = var11;
                                    var88.field5451 = var11.field1962;
                                    class1.field3.method1273(var88, (byte) 122);
                                }
                                var11.field1978 = class93.field1231;
                                if (var11.field2028 != null) {
                                    for (int var89 = 0; var89 < class95.field1255; var89++) {
                                        class388 var90 = new class388();
                                        var90.field5443 = var11;
                                        var90.field5447 = class526.field7216[var89].method816(12377);
                                        var90.field5440 = class526.field7216[var89].method817((byte) -100);
                                        var90.field5451 = var11.field2028;
                                        class1.field3.method1273(var90, (byte) 122);
                                    }
                                }
                                if (class495.field6815 && var11.field2116 != null) {
                                    class388 var91 = new class388();
                                    var91.field5443 = var11;
                                    var91.field5451 = var11.field2116;
                                    class1.field3.method1273(var91, (byte) 122);
                                }
                            }
                            if (var11.field2023 == 5 && var11.field2052 != -1) {
                                var11.method986(124, class305.field4492, class169.field2547).method2519(class630.field8790, 1, var11.field2082);
                            }
                            class449.method2580(0, var11);
                            if (var11.field2023 == 0) {
                                method1656(arg0, var11.field2100, var14, var15, var16, var17, var12 - var11.field2122, var13 - var11.field2073, arg8, arg9);
                                if (var11.field2043 != null) {
                                    method1656(var11.field2043, var11.field2100, var14, var15, var16, var17, var12 - var11.field2122, var13 - var11.field2073, arg8, arg9);
                                }
                                class198 var92 = (class198) class368.field5262.method2061(-17305, (long) var11.field2100);
                                if (var92 != null) {
                                    if (class161.field2419 == class158.field2374 && var92.field2924 == 0 && !class229.field3278 && var21 && !class203.field2973) {
                                        class72.method580(true);
                                    }
                                    class347.method2069(var15, var13, var14, var12, var92.field2922, var17, arg9, false, var16, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class449.method2580(0, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1657(int arg0) {
        if (class417.field5879) {
            class603.method3342(503);
        }
        field3839++;
        if (class630.field8790 != null) {
            class630.field8790.method3554(true);
        }
        if (class164.field2504 != null) {
            class439.method2516(false, class164.field2504, class503.field6878);
            class164.field2504 = null;
        }
        if (class53.field758 != null) {
            class53.field758.method3127(106);
            class53.field758 = null;
        }
        if (arg0 > -26) {
            method1647(null);
        }
        class192.method1277(-106);
        class232.field3302.method2812((byte) 26);
        class234.field3319.method2584(-3);
        if (class486.field6740 != null) {
            class486.field6740.method1223(3);
            class486.field6740 = null;
        }
        try {
            class140.field2094.method2336(79);
            for (int var2 = 0; var2 < 34; var2++) {
                class435.field6148[var2].method2336(-115);
            }
            class152.field2276.method2336(-124);
            class432.field6076.method2336(-128);
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lfaa;)Z")
    public static final boolean method1658(class140 arg0) {
        if (class203.field2973) {
            if (method1655(arg0).field7010 != 0) {
                return false;
            }
            if (arg0.field2023 == 0) {
                return false;
            }
        }
        return arg0.field2051;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;")
    public final String method1659(int arg0) {
        field3851++;
        String var2 = null;
        try {
            var2 = "[1)" + class511.field6989 + "," + class124.field1726 + "," + class86.field1185 + "," + class526.field7212 + "|";
            if (class253.field3576 != null) {
                var2 = var2 + "2)" + class233.field3305 + "," + (class253.field3576.field6483[0] + class511.field6989) + "," + (class253.field3576.field6477[0] + class124.field1726) + "|";
            }
            var2 = var2 + "3)" + class429.field6020 + "|4)" + class274.field3872.field899 + "|5)" + class402.method2292(true) + "|6)" + class547.field7412 + "," + class124.field1711 + "|";
            if (arg0 != 11) {
                return null;
            }
            var2 = var2 + "7)" + class274.field3872.method546((byte) -110, class429.field6020) + "|";
            var2 = var2 + "8)" + class274.field3872.method543(class429.field6020, (byte) 20) + "|";
            var2 = var2 + "9)" + class274.field3872.field884 + "|";
            var2 = var2 + "10)" + class274.field3872.field885 + "|";
            var2 = var2 + "11)" + class274.field3872.field882 + "|";
            var2 = var2 + "12)" + class274.field3872.method2433(0, class429.field6020) + "|";
            var2 = var2 + "13)" + class202.field2968 + "|";
            var2 = var2 + "14)" + class340.field4947;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class429.field6020 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3855 == null ? (field3855 = method1663("client")) : field3855).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method1660(int arg0) {
        field3842++;
        if (class517.field7072 < class232.field3302.field6907) {
            class195.field2887.method2260((byte) -116);
            class336.field4908 = (class232.field3302.field6907 * 50 - 50) * 5;
            if (class336.field4908 > 3000) {
                class336.field4908 = 3000;
            }
            if (class232.field3302.field6907 >= 2 && class232.field3302.field6909 == 6) {
                this.method3510(10, "js5connect_outofdate");
                class340.field4947 = 14;
                return;
            }
            if (class232.field3302.field6907 >= 4 && class232.field3302.field6909 == -1) {
                this.method3510(arg0 ^ 0x3E2, "js5crc");
                class340.field4947 = 14;
                return;
            }
            if (class232.field3302.field6907 >= 4 && class324.method1964(class340.field4947, (byte) 86)) {
                if (class232.field3302.field6909 == 7 || class232.field3302.field6909 == 9) {
                    this.method3510(arg0 - 990, "js5connect_full");
                } else if (class232.field3302.field6909 <= 0) {
                    this.method3510(10, "js5io");
                } else if (class168.field2539 == null) {
                    this.method3510(10, "js5connect");
                } else {
                    this.method3510(10, "js5proxy_" + class168.field2539.trim());
                }
                class340.field4947 = 14;
                return;
            }
        }
        class517.field7072 = class232.field3302.field6907;
        if (class336.field4908 > 0) {
            class336.field4908--;
            return;
        }
        try {
            if (class458.field6493 == 0) {
                class81.field1136 = class195.field2887.method2256(arg0 + 42594, class503.field6878);
                class458.field6493++;
            }
            if (class458.field6493 == 1) {
                if (class81.field1136.field3702 == 2) {
                    if (class81.field1136.field3706 != null) {
                        class168.field2539 = (String) class81.field1136.field3706;
                    }
                    this.method1650(1000, 0);
                    return;
                }
                if (class81.field1136.field3702 == 1) {
                    class458.field6493++;
                }
            }
            if (class458.field6493 == 2) {
                class309.field4604 = new class442((Socket) class81.field1136.field3706, class503.field6878);
                class96 var2 = new class96(5);
                var2.method746((byte) -127, class599.field8311.field2617);
                var2.method741(614, (byte) 27);
                class309.field4604.method2531(5, 0, 0, var2.field1316);
                class458.field6493++;
                class585.field8165 = class680.method3756(-72);
            }
            if (class458.field6493 == 3) {
                if (class324.method1964(class340.field4947, (byte) 74) || class309.field4604.method2526((byte) -62) > 0) {
                    int var3 = class309.field4604.method2534(arg0 ^ 0x3AC);
                    if (var3 != 0) {
                        this.method1650(var3, 0);
                        return;
                    }
                    class458.field6493++;
                } else if (class680.method3756(-117) - class585.field8165 > 30000L) {
                    this.method1650(1001, 0);
                    return;
                }
            }
            if (class458.field6493 == 4) {
                boolean var4 = class324.method1964(class340.field4947, (byte) 119) || class283.method1710(class340.field4947, -6060) || class202.method1352(class340.field4947, (byte) -60);
                class232.field3302.method2807((byte) -77, class309.field4604, !var4);
                class81.field1136 = null;
                class309.field4604 = null;
                class458.field6493 = 0;
            }
        } catch (IOException var5) {
            this.method1650(1002, 0);
        }
        if (arg0 != 1000) {
            method1661();
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1661() {
        int var0 = class64.field851;
        int[] var1 = class53.field759;
        int var2 = class78.field1070 ? var0 : class602.field8365 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class457 var4;
            if (var3 < var0) {
                var4 = class495.field6821[var1[var3]];
            } else {
                var4 = ((class178) class323.field4762.method2061(-17305, (long) class594.field8262[var3 - var0])).field2634;
            }
            if (var4.field6415 >= 0) {
                int var5 = var4.method1722((byte) -120);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field509 & 0x1FF) == 0 && (var4.field514 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field509 & 0x1FF) == 256 && (var4.field514 & 0x1FF) == 256) {
                    continue;
                }
                if (var4 instanceof class286 && var4.field6486 != null && class239.field3440 >= var4.field6486.field4425 && class239.field3440 < var4.field6486.field4436) {
                    ((class286) var4).field3974 = false;
                }
                var4.field518 = class203.method1355(var4.field514, var4.field509, 4, var4.field520);
                class580.method3224(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method1662(boolean arg0) {
        if (arg0) {
            return;
        }
        field3844++;
        if (class429.field6020 != 2) {
            this.method1646((byte) 98);
            return;
        }
        try {
            this.method1646((byte) -2);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class139.method985((byte) -106, var5.getMessage() + " (Recovered) " + this.method1659(11), var5);
            class339.method2033(0, -28863);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1663(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
