import jagex3.jagmisc.jagmisc;
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
public class client extends class93 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[Z")
    public static boolean[] field1170 = new boolean[100];

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
    public static int[] field1180 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lbu;")
    public static class407 field1183;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field1184;

    static {
        new class306("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field1183 = new class407(8);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 5)
    public static final void method458() {
        int var0 = class151.field2425;
        int[] var1 = class45.field734;
        int var2 = class446.field6658 ? var0 : class86.field1471 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class197 var4;
            if (var3 < var0) {
                var4 = class435.field6489[var1[var3]];
            } else {
                var4 = ((class505) class147.field2396.method2516((long) class371.field5734[var3 - var0], -1)).field7355;
            }
            if (var4.field3122 >= 0) {
                int var5 = var4.method1143(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4716 & 0x7F) == 0 && (var4.field4714 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field4716 & 0x7F) == 64 && (var4.field4714 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class166 && var4.field3161 != null && class504.field7348 >= var4.field3161.field115 && class504.field7348 < var4.field3161.field118) {
                    ((class166) var4).field2644 = false;
                }
                var4.field4728 = class81.method592(var4.field4716, var4.field4714, 9251, var4.field4720);
                class177.method1198(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 49)
    private final void method459(int arg0) {
        field1162++;
        if (~class32.field515 == arg0) {
            return;
        }
        class504.field7348++;
        if (class504.field7348 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class38.field567 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class328.field5180.setSeed((long) class38.field567);
        }
        if (class504.field7348 % 50 == 0) {
            class405.field6156 = class496.field7267;
            class14.field163 = class452.field6749;
            class496.field7267 = 0;
            class452.field6749 = 0;
        }
        this.method474(118);
        if (class403.field6129 != null) {
            class403.field6129.method1544(-114);
        }
        class435.method2637(arg0 ^ 0xFFFFFA83);
        class468.field6955.method1370(false);
        class333.field5233.method1657((byte) 50);
        if (class144.field2350 != null) {
            int var3 = class144.field2350.method50((byte) 58);
            class147.field2394 = var3;
        }
        if (class305.field4873 != null) {
            class305.field4873.method864((int) class19.method91((byte) 109));
        }
        class251.method1708((byte) 54);
        class188.field2946 = 0;
        for (class472 var4 = class468.field6955.method1371((byte) 64); var4 != null && class188.field2946 < 128; var4 = class468.field6955.method1371((byte) -126)) {
            if (var4.method304(3155) != 1) {
                char var5 = var4.method306(0);
                if (!class229.method1589((byte) 38) || !(var5 == '`' || var5 == '§')) {
                    class447.field6677[class188.field2946] = var4;
                    class188.field2946++;
                } else if (class483.method2834(0)) {
                    class6.method35(true);
                } else {
                    class202.method1331(true);
                }
            }
        }
        for (class272 var6 = class333.field5233.method1647(8); var6 != null; var6 = class333.field5233.method1647(8)) {
            int var7 = var6.method385((byte) -14);
            if (var7 == -1) {
                class91.field1508.method2541(0, var6);
            } else if (class134.method1015(true, var7)) {
                class216.field3765.method2541(arg0 ^ 0xFFFFFFF2, var6);
            }
            if (class216.field3765.method2542(arg0 ^ 0x62) > 10) {
                class216.field3765.method2539(0);
            }
        }
        if (class483.method2834(arg0 + 14)) {
            class448.method2688((byte) -127);
        }
        if (class32.field515 == 0) {
            this.method471(15);
            class309.method1967(-7188);
        } else if (class32.field515 == 1) {
            this.method471(15);
            class309.method1967(arg0 ^ 0x1C1E);
        } else if (class276.method1820(class32.field515, arg0 - 103)) {
            class60.method400(-43);
        }
        if (class13.method70(arg0 + 1015, class32.field515) && !class276.method1820(class32.field515, arg0 ^ 0x71)) {
            this.method482(-123);
            class320.method2031(false);
            class235.method1622(arg0 ^ 0xFFFFD6FD);
        } else if (class7.method48((byte) -122, class32.field515) && !class276.method1820(class32.field515, -116)) {
            this.method482(46);
            class235.method1622(10511);
        } else if (class32.field515 == 11) {
            class235.method1622(10511);
        } else if (class279.method1834(68, class32.field515) && !class276.method1820(class32.field515, arg0 ^ 0x71)) {
            class281.method1843((byte) 107);
        } else if (class32.field515 == 12) {
            class235.method1622(10511);
            if (class23.field300 != -3 && class23.field300 != 2 && class23.field300 != 15) {
                class165.method1132(false, false);
            }
        }
        class347.method2243(class305.field4873, arg0 ^ 0xFFFFFFF2);
        class216.field3765.method2539(arg0 + 14);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 200)
    public static void method460(int arg0) {
        field1180 = null;
        field1170 = null;
        field1183 = null;
        if (arg0 != 6) {
            field1180 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V", line = 215)
    public static final void method461(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == -1) {
            field1182++;
            class284 var4 = class412.field6247[arg2][arg3];
            class46.method333(arg1, var4 == null ? class446.field6659 : var4, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 230)
    public static final void method462(int arg0) {
        int var1 = class151.field2425;
        int[] var2 = class45.field734;
        for (int var3 = 0; var3 < class86.field1471 + var1; var3++) {
            class197 var4;
            if (var3 < var1) {
                var4 = class435.field6489[var2[var3]];
            } else {
                var4 = ((class505) class147.field2396.method2516((long) class371.field5734[var3 - var1], -1)).field7355;
            }
            if (var4.field4720 == arg0 && var4.field3122 >= 0) {
                int var5 = var4.method1143(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4716 & 0x7F) != 0 || (var4.field4714 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field4716 & 0x7F) != 64 || (var4.field4714 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field4716 >> 7;
                    int var7 = var4.field4714 >> 7;
                    if (var4.field3122 > class18.field196[var6][var7]) {
                        class18.field196[var6][var7] = var4.field3122;
                        class94.field1592[var6][var7] = 1;
                    } else if (class18.field196[var6][var7] == var4.field3122) {
                        var10002 = class94.field1592[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field4716 - var8 >> 7;
                    int var10 = var4.field4714 - var8 >> 7;
                    int var11 = var4.field4716 + var8 >> 7;
                    int var12 = var4.field4714 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field3122 > class18.field196[var13][var14]) {
                                class18.field196[var13][var14] = var4.field3122;
                                class94.field1592[var13][var14] = 1;
                            } else if (class18.field196[var13][var14] == var4.field3122) {
                                var10002 = class94.field1592[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 333)
    public final void method463(boolean arg0) {
        field1174++;
        method460(6);
        class123.method974((byte) 70);
        class481.method2829(100);
        class306.method1952(0);
        class462.method2759((byte) 97);
        class379.method2400(96);
        class334.method2108(8);
        class77.method551(-112);
        class270.method1801((byte) -12);
        class276.method1824(-8);
        class516.method3052((byte) 111);
        class407.method2522(false);
        class93.method643(-55);
        class35.method265(-99);
        class206.method1352(111);
        class378.method2399((byte) -113);
        class535.method3171((byte) 7);
        class202.method1330(0);
        class491.method2861(-31966);
        class176.method1192(-31);
        class475.method2806((byte) 120);
        class301.method1928(-22407);
        class411.method2547((byte) -18);
        class40.method301((byte) -80);
        class473.method2802(21061);
        class226.method1566(true);
        class477.method2814(14322);
        class224.method1543(-68);
        class94.method653(true);
        class496.method2935((byte) -120);
        class172.method1163(-86);
        class436.method2642(65280);
        class302.method1933((byte) 126);
        class277.method1829(-116);
        class468.method2778(105);
        class217.method1498(0);
        class34.method261(64);
        class61.method403(7);
        class110.method795((byte) -42);
        class70.method498((byte) -111);
        class316.method2002(23);
        class156.method1092(100);
        class344.method2211(32);
        class351.method2254(true);
        class506.method2979(arg0);
        class91.method639(-1316275602);
        class235.method1615((byte) -108);
        class404.method2505(83);
        class434.method2635(true);
        class205.method1350(20591);
        class201.method1329((byte) -56);
        class330.method2074((byte) 48);
        class494.method2902(1000);
        class420.method2582(-1);
        class503.method2972(91);
        class421.method2588(14);
        class505.method2975(false);
        class340.method2157((byte) -126);
        class313.method1985(8);
        class269.method1797((byte) -122);
        class484.method2838((byte) -122);
        class251.method1716(-1);
        class83.method601(1);
        class346.method2233((byte) -69);
        class73.method518(0);
        class400.method2489(122);
        class78.method574((byte) -101);
        class68.method448((byte) -44);
        class502.method2967(15);
        class166.method1146(false);
        class111.method800((byte) -22);
        class444.method2668(15250);
        class23.method155((byte) -63);
        class197.method1306((byte) -106);
        class296.method1906(-6047);
        class465.method2769(-28164);
        class356.method2287((byte) 50);
        class283.method1847((byte) -99);
        class265.method1765((byte) 79);
        class52.method366(61);
        class326.method2047(-26493);
        class441.method2659(-104);
        class423.method2596(96);
        class388.method2431(23776);
        class328.method2068(!arg0);
        class275.method1814((byte) 123);
        class100.method694(false);
        class359.method2301((byte) -12);
        class519.method3069(arg0);
        class42.method310((byte) -100);
        class239.method1643(-128);
        class527.method3125(19);
        class487.method2850((byte) 120);
        class175.method1183(-100);
        class295.method1891(50);
        class18.method87(0);
        class171.method1159(-122);
        class325.method2042(0);
        class333.method2100(115);
        class530.method3137(true);
        class476.method2810(-23229);
        class284.method1854((byte) -45);
        class322.method2034((byte) -51);
        class103.method702(21091);
        class489.method2853(false);
        class220.method1519(-11659);
        class510.method3002(29427);
        class104.method708(114);
        class448.method2687((byte) -55);
        class511.method3009(114);
        class331.method2080(-128);
        class66.method430(0);
        class450.method2699(6);
        class32.method248((byte) 94);
        class374.method2351(0);
        class75.method537(104);
        class495.method2911((byte) -94);
        class452.method2704(13614);
        class305.method1948((byte) 82);
        class247.method1681(-1);
        class339.method2146(-3);
        class146.method1062(-25758);
        class432.method2628(-87);
        class147.method1067(-107);
        class30.method236(-77);
        class243.method1664(14);
        class430.method2620(4);
        class335.method2109(false);
        class122.method965();
        class49.method356(-1);
        class20.method108((byte) -125);
        class449.method2689((byte) -99);
        class215.method1490(-119);
        class521.method3082();
        class210.method1382();
        class439.method2653(true);
        class366.method2329(-13379);
        class514.method3043();
        class182.method1234((byte) 96);
        class445.method2676(-22);
        class64.method420(78);
        class415.method2563((byte) 85);
        class26.method196(238);
        class320.method2030(67);
        class406.method2510(false);
        class140.method1043(-1);
        class223.method1540((byte) 23);
        class419.method2575(true);
        class525.method3105(-3);
        class471.method2787((byte) 56);
        class337.method2122(-21);
        class348.method2248(-25);
        class469.method2784(-36);
        class517.method3059((byte) 65);
        class327.method2053(arg0);
        class204.method1340((byte) 119);
        class413.method2553(-81);
        class188.method1275(3);
        class526.method3116((byte) 62);
        class392.method2451(arg0);
        class431.method2623(4);
        class376.method2392((byte) -25);
        class299.method1918(-52);
        class121.method956((byte) 17);
        class21.method113(89);
        class280.method1838(1970);
        class71.method511(3335);
        class207.method1357(-18741);
        class360.method2303(true);
        class124.method980((byte) -60);
        class98.method678();
        class57.method390(1);
        class199.method1317((byte) -117);
        class189.method1278((byte) -103);
        class173.method1172(29538);
        class130.method996((byte) -70);
        class416.method2564(41);
        class403.method2500(-127);
        class405.method2509(14363);
        class488.method2851(-112);
        class194.method1296(-128);
        class429.method2616(false);
        class129.method995((byte) -105);
        class218.method1505(12);
        class192.method1290((byte) 121);
        class1.method2(31897);
        class398.method2487((byte) -75);
        class515.method3046(-1);
        class291.method1877((byte) -13);
        class355.method2281(false);
        class112.method805(32);
        class155.method1082(17);
        class451.method2701(6624);
        class300.method1922(false);
        class260.method1743(-13041);
        class153.method1076(16519);
        class115.method921((byte) 33);
        class14.method76((byte) -107);
        class507.method2987(false);
        class383.method2415((byte) 53);
        class159.method1106((byte) 114);
        class236.method1623(6);
        class219.method1508((byte) 41);
        class44.method323((byte) -3);
        class134.method1014(81);
        class459.method2739(21059);
        class279.method1835(3);
        class240.method1644(-128);
        class531.method3143(17014);
        class118.method944(0);
        class324.method2038((byte) -105);
        class371.method2340((byte) 117);
        class438.method2650(0);
        class76.method546(0);
        class67.method435((byte) 31);
        class191.method1289(-78);
        class233.method1606();
        class345.method2225((byte) -107);
        class150.method1070(-49);
        class318.method2015(0);
        class209.method1365(-112);
        class241.method1645(18751);
        class230.method1591(0);
        class158.method1105((byte) 110);
        class466.method2771((byte) -74);
        class257.method1733(28);
        class455.method2732(-1);
        class190.method1282((byte) -118);
        class174.method1177();
        class170.method1156(false);
        class422.method2590(17065);
        class490.method2857(15853);
        class105.method723(2164);
        class65.method424(-57);
        class375.method2388((byte) 65);
        class208.method1360(false);
        class361.method2310(-26579);
        class193.method1292(125);
        class386.method2422(-16601);
        class435.method2636(2048);
        class108.method779(true);
        class37.method275(24834);
        class116.method930(-381);
        class22.method114(26593);
        class17.method85(-63);
        class4.method13(-46);
        class317.method2011(-1);
        class2.method5(42);
        class394.method2462(-13287);
        class285.method1858((byte) -89);
        class310.method1979();
        class97.method674((byte) 94);
        class315.method2000(2);
        class354.method2271();
        class278.method1830();
        class245.method1674();
        class369.method2338((byte) -36);
        class99.method689(-107);
        class478.method2820();
        class282.method1844(901870944);
        class81.method589(-123);
        class164.method1127(true);
        class267.method1789();
        class229.method1587(118);
        class512.method3011(1);
        class268.method1792(0);
        class437.method2644((byte) -111);
        class467.method2773(0);
        class29.method231((byte) -6);
        class393.method2458((byte) 47);
        class352.method2261(62);
        class139.method1041(-774);
        class509.method2992(57);
        class395.method2472(22858);
        class343.method2210(false);
        class250.method1692(arg0);
        class319.method2025((byte) 113);
        class3.method9(-1);
        class424.method2597(!arg0);
        class24.method186(11791);
        class163.method1124(107);
        class222.method1534(32647);
        class31.method242((byte) -126);
        class338.method2133((byte) 124);
        class246.method1676((byte) -125);
        class252.method1717(5888);
        class263.method1754((byte) 12);
        class533.method3162(90);
        class179.method1203(0);
        class187.method1269(-120);
        class508.method2989(100);
        class536.method3175((byte) 36);
        class106.method759(88);
        class45.method326(-118);
        class364.method2322(187805048);
        class358.method2295(-89);
        class486.method2845();
        class180.method1215(-21488);
        class387.method2427((byte) -10);
        class281.method1842(-122);
        class90.method631(true);
        class463.method2760(31777);
        class212.method1397(110);
        class51.method363((byte) 120);
        class362.method2316(124);
        class120.method948(8);
        class396.method2474(-114);
        class298.method1916(116);
        class13.method69(15);
        class151.method1073((byte) -65);
        class350.method2252((byte) -127);
        class271.method1806((byte) -67);
        class69.method488(true);
        class447.method2685((byte) -108);
        class154.method1080(1325718700);
        class177.method1200((byte) 124);
        class131.method999((byte) -120);
        class203.method1333((byte) -62);
        class38.method279(15254);
        class323.method2036(false);
        class286.method1862(true);
        class157.method1098((byte) 96);
        class255.method1728(90);
        class101.method697(-101);
        class293.method1885((byte) 72);
        class36.method270(-1);
        class440.method2656((byte) 18);
        class238.method1631(13445);
        class117.method935(-116);
        class119.method945();
        class513.method3019();
        class137.method1031(6271);
        class397.method2481(-933);
        class128.method993((byte) -49);
        class167.method1149(arg0);
        class480.method2827(true);
        class357.method2293((byte) -127);
        class391.method2441(1);
        class498.method2952(-27605);
        class412.method2549((byte) -26);
        class256.method1731(111);
        class213.method1403((byte) 24);
        class261.method1747(3);
        class264.method1759(2826);
        class228.method1585(34336);
        class15.method77((byte) -76);
        class12.method65(2);
        class289.method1871(0);
        class95.method667(-18948);
        class485.method2839(-126);
        class426.method2602(14);
        class497.method2951(16773658);
        class304.method1945(104);
        class160.method1112(true);
        class178.method1202(true);
        class53.method370(34070);
        class309.method1966(34963);
        class367.method2333(98);
        class216.method1496((byte) 111);
        class382.method2414(2);
        class442.method2661((byte) -125);
        class373.method2348((byte) 112);
        class453.method2706(-125);
        class244.method1665((byte) -121);
        class259.method1742((byte) 78);
        class136.method1025((byte) 30);
        class534.method3170((byte) -30);
        class200.method1324(true);
        class303.method1940(0);
        class402.method2496(true);
        class529.method3133(false);
        class499.method2956(true);
        class60.method401(-109);
        class389.method2433((byte) 85);
        class528.method3129(-95);
        class141.method1047(-1);
        class9.method55(6);
        class79.method583(255);
        class54.method381(8);
        class321.method2032(4);
        class144.method1052(-14529);
        class165.method1130((byte) -44);
        class127.method989(57);
        class262.method1749((byte) 3);
        class82.method594(17);
        class460.method2740(false);
        class272.method1809((byte) 84);
        class88.method620((byte) -93);
        class353.method2264(-30264);
        class446.method2684(true);
        class417.method2568(31239);
        class162.method1120(true);
        class41.method307(-110);
        class55.method383(0);
        class126.method986((byte) -36);
        class5.method20(14957);
        class253.method1721((byte) -17);
        class418.method2572(11159);
        class16.method81(false);
        class457.method2736(5298);
        class84.method606(-25390);
        class363.method2318(false);
        class46.method327(102);
        class347.method2242(8);
        class237.method1630(false);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 747)
    public final void method464(byte arg0) {
        field1172++;
        try {
            int var2 = 7 % ((-arg0 - 69) / 47);
            this.method459(-14);
        } catch (OutOfMemoryError var4) {
            if (var4.getMessage() == null || !var4.getMessage().startsWith("native")) {
                throw var4;
            }
            class86.method616(0, 41);
            class502.method2968(var4.getMessage() + " (Recovered) " + this.method465((byte) -123), (byte) -118, var4);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;", line = 768)
    public final String method465(byte arg0) {
        field1171++;
        String var2 = null;
        try {
            var2 = "[1)" + class16.field181 + "," + class455.field6794 + "," + class217.field3775 + "," + class277.field4548 + "|";
            if (class302.field4850 != null) {
                var2 = var2 + "2)" + class93.field1556 + "," + (class302.field4850.field3159[0] + class16.field181) + "," + (class302.field4850.field3158[0] + class455.field6794) + "|";
            }
            var2 = var2 + "3)" + class511.field7485 + "|4)" + class510.field7403.field5093 + "|5)" + class287.method1865((byte) 118) + "|6)" + class358.field5581 + "," + class49.field825 + "|";
            var2 = var2 + "7)" + class510.field7403.method2045(4, class511.field7485) + "|";
            var2 = var2 + "8)" + class510.field7403.method2041(127, class511.field7485) + "|";
            int var3 = 10 / ((arg0 - 76) / 41);
            var2 = var2 + "9)" + class510.field7403.field5111 + "|";
            var2 = var2 + "10)" + class510.field7403.field5125 + "|";
            var2 = var2 + "11)" + class510.field7403.field5115 + "|";
            var2 = var2 + "12)" + class510.field7403.method1188(class511.field7485, -128) + "|";
            var2 = var2 + "13)" + class101.field1668 + "|";
            var2 = var2 + "14)" + class32.field515;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var4) {
            }
            var2 = var2 + "]";
        } catch (Throwable var5) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 803)
    public static final void method466(int arg0) {
        int var1 = class151.field2425;
        int[] var2 = class45.field734;
        int var3 = class446.field6658 ? var1 : class86.field1471 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class197 var5;
            if (var4 < var1) {
                var5 = class435.field6489[var2[var4]];
            } else {
                var5 = ((class505) class147.field2396.method2516((long) class371.field5734[var4 - var1], -1)).field7355;
            }
            if (var5.field4720 == arg0) {
                var5.field3095 = 0;
                if (var5.field3122 < 0) {
                    var5.field3090 = false;
                } else {
                    int var6 = var5.method1143(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field4716 & 0x7F) != 0 || (var5.field4714 & 0x7F) != 0) {
                            var5.field3090 = false;
                            continue;
                        }
                    } else if ((var5.field4716 & 0x7F) != 64 || (var5.field4714 & 0x7F) != 64) {
                        var5.field3090 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field4716 >> 7;
                        int var8 = var5.field4714 >> 7;
                        if (class18.field196[var7][var8] != var5.field3122) {
                            var5.field3090 = true;
                            continue;
                        }
                        if (class94.field1592[var7][var8] > 1) {
                            var10002 = class94.field1592[var7][var8]--;
                            var5.field3090 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field4716 - var9 >> 7;
                        int var11 = var5.field4714 - var9 >> 7;
                        int var12 = var5.field4716 + var9 >> 7;
                        int var13 = var5.field4714 + var9 >> 7;
                        if (!class395.method2469(var12, 1, var13, var11, var10, var5.field3122)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class18.field196[var14][var15] == var5.field3122) {
                                        var10002 = class94.field1592[var14][var15]--;
                                    }
                                }
                            }
                            var5.field3090 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class166 && var5.field3161 != null && class504.field7348 >= var5.field3161.field115 && class504.field7348 < var5.field3161.field118) {
                        ((class166) var5).field2644 = false;
                    }
                    var5.field3090 = false;
                    var5.field4728 = class81.method592(var5.field4716, var5.field4714, 9251, var5.field4720);
                    class177.method1198(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 920)
    private final void method467(byte arg0) {
        field1178++;
        if (class32.field515 == 13 || arg0 < 21) {
            return;
        }
        long var2 = class51.method362(-28150) / 1000000L - class325.field5102;
        class325.field5102 = class51.method362(-28150) / 1000000L;
        boolean var4 = class348.method2245((byte) 71);
        if (var4 && class151.field2419 && class177.field2811 != null) {
            class177.field2811.method541(2000);
        }
        if (class275.method1815((byte) -114, class32.field515)) {
            if (class309.field4905 != 0L && class309.field4905 < class19.method91((byte) 107)) {
                class142.method1049(class510.field7403.field5099, class287.method1865((byte) -98), false, (byte) -113, class510.field7403.field5089);
            } else if (!class305.field4873.method815() && class178.field2827) {
                class78.method570(-31);
            }
        }
        if (class422.field6374 == null) {
            Container var5;
            if (class346.field5450 == null) {
                var5 = class419.field6342.field7203;
            } else {
                var5 = class346.field5450;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class346.field5450 == var5) {
                Insets var8 = class346.field5450.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class412.field6245 != var6 || class314.field4950 != var7) {
                if (class305.field4873 == null || class305.field4873.method833()) {
                    class511.method3010(0);
                } else {
                    class314.field4950 = var7;
                    class412.field6245 = var6;
                }
                class309.field4905 = class19.method91((byte) 116) + 500L;
            }
        }
        if (class422.field6374 != null && !class131.field2248 && class275.method1815((byte) 61, class32.field515)) {
            class142.method1049(-1, class510.field7403.field5120, false, (byte) -122, -1);
        }
        boolean var9 = false;
        if (class45.field740) {
            var9 = true;
            class45.field740 = false;
        }
        if (var9) {
            class420.method2581(0);
        }
        if (class305.field4873 != null && class305.field4873.method815() || class287.method1865((byte) -63) != 1) {
            class408.method2530(17234);
        }
        if (class32.field515 == 0) {
            class418.method2571(class10.field109, 6, class391.field5981[class208.field3286], class352.field5497[class208.field3286], class235.field4074[class208.field3286], class91.field1518, var9);
        } else if (class32.field515 == 1) {
            class356.method2283(class127.field2188, class305.field4873, class305.field4873.method815() | var9, class235.field4074[class208.field3286].getRGB(), 102, class391.field5981[class208.field3286].getRGB(), class352.field5497[class208.field3286].getRGB());
        } else if (class121.method950(58, class32.field515)) {
            class67.method436((byte) 123);
        } else if (class313.method1984(class32.field515, 6)) {
            class67.method436((byte) 113);
        } else if (class276.method1820(class32.field515, -110)) {
            if (class517.field7647 == 1) {
                if (class509.field7393 > class340.field5329) {
                    class340.field5329 = class509.field7393;
                }
                int var11 = (class340.field5329 - class509.field7393) * 50 / class340.field5329;
                class499.method2954(true, class519.field7664.method1954(class300.field4813, -30366) + "<br>(" + var11 + "%)", 94, class531.field7796);
            } else if (class517.field7647 == 2) {
                if (class485.field7117 > class290.field4719) {
                    class290.field4719 = class485.field7117;
                }
                int var10 = (class290.field4719 - class485.field7117) * 50 / class290.field4719 + 50;
                class499.method2954(true, class519.field7664.method1954(class300.field4813, -30366) + "<br>(" + var10 + "%)", 92, class531.field7796);
            } else {
                class499.method2954(true, class519.field7664.method1954(class300.field4813, -30366), 106, class531.field7796);
            }
        } else if (class32.field515 == 9) {
            class413.method2557(1397, var2);
        } else if (class32.field515 == 12) {
            class499.method2954(true, class166.field2657.method1954(class300.field4813, -30366) + "<br>" + class284.field4649.method1954(class300.field4813, -30366), 87, class531.field7796);
        }
        if (class179.field2844 == 3) {
            for (int var12 = 0; var12 < class128.field2208; var12++) {
                Rectangle var13 = class166.field2665[var12];
                if (class67.field987[var12]) {
                    class305.field4873.method2864(var13.y, (byte) 13, var13.width, var13.x, var13.height, -1996553985);
                } else if (field1170[var12]) {
                    class305.field4873.method2864(var13.y, (byte) 13, var13.width, var13.x, var13.height, -1996554240);
                }
            }
        }
        if (class483.method2834(0)) {
            class209.method1363(class305.field4873, 350);
        }
        if (class275.method1815((byte) 41, class32.field515) && class179.field2844 == 0 && class287.method1865((byte) -70) == 1 && !var9 && class493.field7199.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class128.field2208; var15++) {
                if (field1170[var15]) {
                    field1170[var15] = false;
                    class510.field7418[var14++] = class166.field2665[var15];
                }
            }
            class305.field4873.method901(class510.field7418, var14);
        } else if (class32.field515 != 0) {
            class305.field4873.method844();
            for (int var16 = 0; var16 < class128.field2208; var16++) {
                field1170[var16] = false;
            }
        }
        if (class510.field7403.field5114 == 0) {
            class444.method2667(-28210, 15L);
        } else if (class510.field7403.field5114 == 1) {
            class444.method2667(-28210, 10L);
        } else if (class510.field7403.field5114 == 2) {
            class444.method2667(-28210, 5L);
        } else if (class510.field7403.field5114 == 3) {
            class444.method2667(-28210, 2L);
        }
        if (class206.field3262) {
            class453.method2710(5);
        }
        if (class510.field7403.field5098 && class32.field515 == 2 && class379.field5881 != -1) {
            class510.field7403.field5098 = false;
            class510.field7403.method1190(class419.field6342, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 1159)
    public final void method468(byte arg0) {
        field1176++;
        try {
            this.method467((byte) 53);
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class86.method616(0, -16);
            class502.method2968(var3.getMessage() + " (Recovered) " + this.method465((byte) 127), (byte) -109, var3);
        }
        if (arg0 < 65) {
            field1170 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1187)
    public static final void method469() {
        for (int var0 = 0; var0 < class217.field3775; var0++) {
            int[] var1 = class18.field196[var0];
            for (int var2 = 0; var2 < class277.field4548; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 1204)
    private final void method470(byte arg0) {
        field1175++;
        if (class78.field1366.field3916 > class193.field3015) {
            class244.field4183.field7138 = !class244.field4183.field7138;
            class128.field2201 = (class78.field1366.field3916 * 50 - 50) * 5;
            if (class128.field2201 > 3000) {
                class128.field2201 = 3000;
            }
            if (class78.field1366.field3916 >= 2 && class78.field1366.field3915 == 6) {
                this.method646((byte) -75, "js5connect_outofdate");
                class32.field515 = 13;
                return;
            }
            if (class78.field1366.field3916 >= 4 && class78.field1366.field3915 == -1) {
                this.method646((byte) -87, "js5crc");
                class32.field515 = 13;
                return;
            }
            if (class78.field1366.field3916 >= 4 && class452.method2705(arg0 + 15092, class32.field515)) {
                if (class78.field1366.field3915 == 7 || class78.field1366.field3915 == 9) {
                    this.method646((byte) -114, "js5connect_full");
                } else if (class78.field1366.field3915 > 0) {
                    this.method646((byte) -77, "js5connect");
                } else {
                    this.method646((byte) -108, "js5io");
                }
                class32.field515 = 13;
                return;
            }
        }
        class193.field3015 = class78.field1366.field3916;
        if (class128.field2201 > 0) {
            class128.field2201--;
            return;
        }
        try {
            if (class215.field3750 == 0) {
                class420.field6348 = class419.field6342.method2887(class244.field4183.method2847(arg0 + 13088), (byte) 112, class244.field4183.field7133);
                class215.field3750++;
            }
            if (class215.field3750 == 1) {
                if (class420.field6348.field2692 == 2) {
                    this.method472(1000, -19920);
                    return;
                }
                if (class420.field6348.field2692 == 1) {
                    class215.field3750++;
                }
            }
            if (class215.field3750 == 2) {
                class100.field1664 = new class473((Socket) class420.field6348.field2695, class419.field6342);
                class23 var2 = new class23(5);
                var2.method163(class23.field316.field955, (byte) 49);
                var2.method152(598, (byte) -38);
                class100.field1664.method2795(0, 5, (byte) 14, var2.field302);
                class215.field3750++;
                class393.field6021 = class19.method91((byte) 90);
            }
            if (class215.field3750 == 3) {
                if (class452.method2705(15105, class32.field515) || class100.field1664.method2803((byte) -123) > 0) {
                    int var3 = class100.field1664.method2799((byte) 74);
                    if (var3 != 0) {
                        this.method472(var3, -19920);
                        return;
                    }
                    class215.field3750++;
                } else if ((class19.method91((byte) 106) - class393.field6021) > 30000L) {
                    this.method472(1001, arg0 ^ 0xFFFFB23D);
                    return;
                }
            }
            if (class215.field3750 == 4) {
                boolean var4 = class32.field515 == 1 || class13.method70(1001, class32.field515) || class7.method48((byte) -125, class32.field515);
                class78.field1366.method1557(class100.field1664, !var4, -100);
                class100.field1664 = null;
                class215.field3750 = 0;
                class420.field6348 = null;
            }
            if (arg0 != 13) {
                field1170 = null;
            }
        } catch (IOException var5) {
            this.method472(1002, -19920);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1348)
    private final void method471(int arg0) {
        if (!class510.field7403.field5098) {
            for (int var2 = 0; var2 < class188.field2946; var2++) {
                if (class447.field6677[var2].method306(0) == 's' || class447.field6677[var2].method306(arg0 ^ 0xF) == 'S') {
                    class510.field7403.field5098 = true;
                    break;
                }
            }
        }
        field1165++;
        if (arg0 != 15) {
            field1166 = 58;
        }
        if (class204.field3221 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class19.method91((byte) 101);
            if (class408.field6192 == 0L) {
                class408.field6192 = var5;
            }
            if (var4 > 16384 && (var5 - class408.field6192) < 5000L) {
                if (var5 - class422.field6372 > 1000L) {
                    System.gc();
                    class422.field6372 = var5;
                }
                class91.field1518 = class533.field7818.method1954(class300.field4813, -30366);
                class10.field109 = 5;
            } else {
                class91.field1518 = class285.field4652.method1954(class300.field4813, -30366);
                class10.field109 = 5;
                class204.field3221 = 10;
            }
        } else if (class204.field3221 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class106.field1865[var7] = class517.method3058((byte) -93, class217.field3775, class277.field4548);
            }
            class91.field1518 = class256.field4329.method1954(class300.field4813, arg0 ^ 0xFFFF896D);
            class10.field109 = 10;
            class204.field3221 = 20;
        } else if (class204.field3221 == 20) {
            if (class403.field6129 == null) {
                class403.field6129 = new class224(class78.field1366, class37.field552);
            }
            if (class403.field6129.method1546(true)) {
                class362.field5635 = class9.method52(1, true, false, arg0 ^ 0x5BA9, 0);
                class374.field5817 = class9.method52(1, true, false, 23462, 1);
                class487.field7132 = class9.method52(1, true, false, 23462, 2);
                class480.field7081 = class9.method52(1, true, false, 23462, 3);
                class471.field6971 = class9.method52(1, true, false, arg0 ^ 0x5BA9, 4);
                class388.field5971 = class9.method52(1, true, true, 23462, 5);
                class29.field472 = class9.method52(1, false, true, arg0 + 23447, 6);
                class81.field1407 = class9.method52(1, true, false, 23462, 7);
                class536.field7881 = class9.method52(1, true, false, 23462, 8);
                class205.field3246 = class9.method52(1, true, false, 23462, 9);
                class467.field6939 = class9.method52(1, true, false, 23462, 10);
                class226.field3886 = class9.method52(1, true, false, 23462, 11);
                class488.field7142 = class9.method52(1, true, false, 23462, 12);
                class147.field2392 = class9.method52(1, true, false, 23462, 13);
                class298.field4799 = class9.method52(1, false, false, 23462, 14);
                class316.field4978 = class9.method52(1, true, false, arg0 ^ 0x5BA9, 15);
                class82.field1445 = class9.method52(1, true, false, 23462, 16);
                class536.field7870 = class9.method52(1, true, false, arg0 ^ 0x5BA9, 17);
                class18.field198 = class9.method52(1, true, false, arg0 + 23447, 18);
                class490.field7161 = class9.method52(1, true, false, arg0 ^ 0x5BA9, 19);
                class388.field5969 = class9.method52(1, true, false, arg0 + 23447, 20);
                class516.field7627 = class9.method52(1, true, false, 23462, 21);
                class451.field6719 = class9.method52(1, true, false, 23462, 22);
                class208.field3292 = class9.method52(1, true, true, 23462, 23);
                class358.field5574 = class9.method52(1, true, false, 23462, 24);
                class236.field4087 = class9.method52(1, true, false, 23462, 25);
                class191.field2968 = class9.method52(1, true, true, 23462, 26);
                class177.field2803 = class9.method52(1, true, false, arg0 + 23447, 27);
                class362.field5639 = class9.method52(1, true, true, 23462, 28);
                class295.field4754 = class9.method52(1, true, false, 23462, 29);
                class91.field1518 = class306.field4877.method1954(class300.field4813, arg0 - 30381);
                class10.field109 = 15;
                class204.field3221 = 30;
            } else {
                class91.field1518 = class220.field3804.method1954(class300.field4813, -30366);
                class10.field109 = 12;
            }
        } else if (class204.field3221 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class436.field6517[var9].method654(true) * class286.field4690[var9] / 100;
            }
            if (var8 == 100) {
                class91.field1518 = class529.field7783.method1954(class300.field4813, -30366);
                class10.field109 = 20;
                class71.method509(18, class536.field7881);
                class11.method61(-43, class536.field7881);
                class204.field3221 = 40;
            } else {
                if (var8 != 0) {
                    class91.field1518 = class151.field2417.method1954(class300.field4813, -30366) + var8 + "%";
                }
                class10.field109 = 20;
            }
        } else if (class204.field3221 == 40) {
            if (class362.field5639.method2913((byte) -11)) {
                this.method476((byte) 103, class362.field5639.method2942(1, -10365));
                class91.field1518 = class272.field4511.method1954(class300.field4813, arg0 ^ 0xFFFF896D);
                class204.field3221 = 50;
                class10.field109 = 25;
            } else {
                class91.field1518 = class374.field5768.method1954(class300.field4813, -30366) + class362.field5639.method2924((byte) -106) + "%";
                class10.field109 = 25;
            }
        } else if (class204.field3221 == 50) {
            class112.method803(-119);
            class91.field1518 = class201.field3191.method1954(class300.field4813, -30366);
            class10.field109 = 30;
            class204.field3221 = 60;
        } else if (class204.field3221 == 60) {
            int var10 = class16.method80(class147.field2392, 4, class536.field7881);
            int var11 = class75.method535(arg0 ^ 0x1);
            if (var10 < var11) {
                class91.field1518 = class298.field4796.method1954(class300.field4813, arg0 ^ 0xFFFF896D) + var10 * 100 / var11 + "%";
                class10.field109 = 35;
            } else {
                class91.field1518 = class480.field7077.method1954(class300.field4813, arg0 ^ 0xFFFF896D);
                class204.field3221 = 70;
                class10.field109 = 35;
            }
        } else if (class204.field3221 == 70) {
            int var12 = class393.method2455(class536.field7881, -77);
            int var13 = class201.method1326((byte) 19);
            if (var13 > var12) {
                class91.field1518 = class130.field2229.method1954(class300.field4813, -30366) + var12 * 100 / var13 + "%";
                class10.field109 = 40;
            } else {
                class91.field1518 = class296.field4777.method1954(class300.field4813, arg0 ^ 0xFFFF896D);
                class204.field3221 = 80;
                class10.field109 = 40;
            }
        } else if (class204.field3221 == 80) {
            if (class191.field2968.method2913((byte) -11)) {
                class317.field4980 = new class26(class191.field2968, class205.field3246, class536.field7881);
                class91.field1518 = class226.field3887.method1954(class300.field4813, -30366);
                class204.field3221 = 90;
                class10.field109 = 45;
            } else {
                class91.field1518 = class499.field7314.method1954(class300.field4813, -30366) + class191.field2968.method2924((byte) -106) + "%";
                class10.field109 = 45;
            }
        } else if (class204.field3221 == 90) {
            class91.field1518 = class339.field5320.method1954(class300.field4813, -30366);
            class10.field109 = 50;
            class204.field3221 = 95;
        } else if (class204.field3221 == 95) {
            if (class510.field7403.field5098) {
                class510.field7403.field5093 = 0;
                class510.field7403.field5095 = 0;
                class510.field7403.field5124 = 0;
                class510.field7403.field5120 = 1;
                class510.field7403.field5104 = 0;
            }
            class510.field7403.field5098 = true;
            class510.field7403.method1190(class419.field6342, false);
            class68.method457(false, -111, class510.field7403.field5095);
            class91.field1518 = class321.field5053.method1954(class300.field4813, -30366);
            class10.field109 = 55;
            class204.field3221 = 100;
        } else if (class204.field3221 == 100) {
            class318.method2018(class536.field7881, class147.field2392, (byte) 127, class305.field4873);
            class91.field1518 = class238.field4115.method1954(class300.field4813, arg0 - 30381);
            class10.field109 = 60;
            class75.method540(-7, 1);
            class204.field3221 = 110;
        } else if (class204.field3221 == 110) {
            byte var14 = 0;
            class487.field7132.method2913((byte) -11);
            int var15 = var14 + class487.field7132.method2924((byte) -106);
            class82.field1445.method2913((byte) -11);
            int var16 = var15 + class82.field1445.method2924((byte) -106);
            class536.field7870.method2913((byte) -11);
            int var17 = var16 + class536.field7870.method2924((byte) -106);
            class18.field198.method2913((byte) -11);
            int var18 = var17 + class18.field198.method2924((byte) -106);
            class490.field7161.method2913((byte) -11);
            int var19 = var18 + class490.field7161.method2924((byte) -106);
            class388.field5969.method2913((byte) -11);
            int var20 = var19 + class388.field5969.method2924((byte) -106);
            class516.field7627.method2913((byte) -11);
            int var21 = var20 + class516.field7627.method2924((byte) -106);
            class451.field6719.method2913((byte) -11);
            int var22 = var21 + class451.field6719.method2924((byte) -106);
            class358.field5574.method2913((byte) -11);
            int var23 = var22 + class358.field5574.method2924((byte) -106);
            class236.field4087.method2913((byte) -11);
            int var24 = var23 + class236.field4087.method2924((byte) -106);
            class177.field2803.method2913((byte) -11);
            int var25 = var24 + class177.field2803.method2924((byte) -106);
            class295.field4754.method2913((byte) -11);
            int var26 = var25 + class295.field4754.method2924((byte) -106);
            if (var26 < 1200) {
                class91.field1518 = class364.field5669.method1954(class300.field4813, -30366) + var26 / 12 + "%";
                class10.field109 = 65;
            } else {
                class213.field3383 = new class351(class271.field4501, class300.field4813, class487.field7132);
                class224.field3870 = new class302(class271.field4501, class300.field4813, class487.field7132);
                class209.field3313 = new class297(class271.field4501, class300.field4813, class487.field7132, class536.field7881);
                class75.field1310 = new class277(class271.field4501, class300.field4813, class536.field7870);
                class300.field4809 = new class468(class271.field4501, class300.field4813, class487.field7132);
                class1.field7 = new class500(class271.field4501, class300.field4813, class487.field7132);
                class106.field1901 = new class217(class271.field4501, class300.field4813, class487.field7132, class81.field1407);
                class243.field4173 = new class34(class271.field4501, class300.field4813, class487.field7132);
                class343.field5367 = new class61(class271.field4501, class300.field4813, class487.field7132);
                class61.field928 = new class110(class271.field4501, class300.field4813, true, class82.field1445, class81.field1407);
                class94.field1585 = new class70(class271.field4501, class300.field4813, class487.field7132, class536.field7881);
                class272.field4515 = new class316(class271.field4501, class300.field4813, class487.field7132, class536.field7881);
                class22.field239 = new class156(class271.field4501, class300.field4813, true, class18.field198, class81.field1407);
                class20.field218 = new class344(class271.field4501, class300.field4813, true, class213.field3383, class490.field7161, class81.field1407);
                class446.field6660 = new class506(class271.field4501, class300.field4813, class487.field7132);
                class130.field2232 = new class91(class271.field4501, class300.field4813, class388.field5969, class362.field5635, class374.field5817);
                class503.field7338 = new class235(class271.field4501, class300.field4813, class487.field7132);
                class279.field4582 = new class404(class271.field4501, class300.field4813, class487.field7132);
                class30.field482 = new class434(class271.field4501, class300.field4813, class516.field7627, class81.field1407);
                class160.field2563 = new class205(class271.field4501, class300.field4813, class487.field7132);
                class224.field3866 = new class201(class271.field4501, class300.field4813, class487.field7132);
                class175.field2778 = new class330(class271.field4501, class300.field4813, class487.field7132);
                class189.field2953 = new class494(class271.field4501, class300.field4813, class451.field6719);
                class338.field5296 = new class420(class271.field4501, class300.field4813, class487.field7132);
                class408.method2529(class147.field2392, class81.field1407, class480.field7081, 8113, class536.field7881);
                class177.method1197(class295.field4754, (byte) 2);
                class163.field2587 = new class503(class300.field4813, class358.field5574, class236.field4087);
                class313.field4936 = new class421(class300.field4813, class358.field5574, class236.field4087, new class21());
                class91.field1518 = class440.field6569.method1954(class300.field4813, -30366);
                class10.field109 = 65;
                class39.method286(0);
                class61.field928.method793(!class510.field7403.method1188(class511.field7485, -117), arg0 ^ 0xE);
                class327.field5160 = new class301();
                class494.method2906(-5419);
                class32.method249(-117, class177.field2803);
                class453.method2707(class317.field4980, class81.field1407, (byte) -37);
                class204.field3221 = 120;
            }
        } else if (class204.field3221 == 120) {
            int var27 = class292.method1880((byte) 112, class536.field7881);
            int var28 = class59.method395(-1049);
            if (var27 < var28) {
                class91.field1518 = class353.field5504.method1954(class300.field4813, arg0 - 30381) + var27 * 100 / var28 + "%";
                class10.field109 = 70;
            } else {
                class5.method25((byte) -125, class305.field4873, class536.field7881);
                class371.method2341(class359.field5589, 62);
                class91.field1518 = class473.field7008.method1954(class300.field4813, -30366);
                class204.field3221 = 130;
                class10.field109 = 70;
            }
        } else if (class204.field3221 == 130) {
            if (class467.field6939.method2933("", "huffman", 0)) {
                class199 var29 = new class199(class467.field6939.method2917(-18656, "", "huffman"));
                class306.method1950(var29, (byte) 77);
                class91.field1518 = class405.field6154.method1954(class300.field4813, -30366);
                class204.field3221 = 140;
                class10.field109 = 75;
            } else {
                class91.field1518 = class282.field4609.method1954(class300.field4813, -30366) + "0%";
                class10.field109 = 75;
            }
        } else if (class204.field3221 == 140) {
            if (class480.field7081.method2913((byte) -11)) {
                class91.field1518 = class295.field4753.method1954(class300.field4813, -30366);
                class10.field109 = 80;
                class204.field3221 = 150;
            } else {
                class91.field1518 = class431.field6461.method1954(class300.field4813, -30366) + class480.field7081.method2924((byte) -106) + "%";
                class10.field109 = 80;
            }
        } else if (class204.field3221 == 150) {
            if (class488.field7142.method2913((byte) -11)) {
                class91.field1518 = class204.field3232.method1954(class300.field4813, arg0 ^ 0xFFFF896D);
                class204.field3221 = 160;
                class10.field109 = 82;
            } else {
                class91.field1518 = class303.field4855.method1954(class300.field4813, -30366) + class488.field7142.method2924((byte) -106) + "%";
                class10.field109 = 82;
            }
        } else if (class204.field3221 == 160) {
            if (class147.field2392.method2913((byte) -11)) {
                class91.field1518 = class243.field4170.method1954(class300.field4813, -30366);
                class10.field109 = 85;
                class204.field3221 = 170;
            } else {
                class91.field1518 = class243.field4170.method1954(class300.field4813, -30366) + class147.field2392.method2924((byte) -106) + "%";
                class10.field109 = 85;
            }
        } else if (class204.field3221 == 170) {
            if (class208.field3292.method2915("details", arg0 ^ 0xF)) {
                class210.method1388(class208.field3292, class300.field4809, class1.field7, class61.field928, class94.field1585, class272.field4515, class327.field5160);
                class91.field1518 = class36.field540.method1954(class300.field4813, -30366);
                class204.field3221 = 190;
                class10.field109 = 89;
            } else {
                class91.field1518 = class305.field4871.method1954(class300.field4813, arg0 - 30381) + class208.field3292.method2943(44, "details") + "%";
                class10.field109 = 87;
            }
        } else if (class204.field3221 == 190) {
            class328.field5178 = new boolean[class175.field2778.field5192];
            class77.field1320 = new int[class175.field2778.field5192];
            class366.field5698 = new String[class224.field3866.field3195];
            for (int var30 = 0; var30 < class175.field2778.field5192; var30++) {
                if (class175.field2778.method2073(var30, 118).field6457 == 0) {
                    class328.field5178[var30] = true;
                    class131.field2241++;
                }
                class77.field1320[var30] = -1;
            }
            class320.method2028((byte) -63);
            class350.field5475 = class480.field7081.method2927("loginscreen", -123);
            class262.field4371 = class480.field7081.method2927("lobbyscreen", -15);
            class388.field5971.method2922(true, -14575, false);
            class29.field472.method2922(true, arg0 ^ 0xFFFFC71E, true);
            class536.field7881.method2922(true, -14575, true);
            class147.field2392.method2922(true, -14575, true);
            class467.field6939.method2922(true, -14575, true);
            class480.field7081.method2922(true, -14575, true);
            class487.field7132.field7274 = 2;
            class206.field3262 = true;
            class536.field7870.field7274 = 2;
            class82.field1445.field7274 = 2;
            class18.field198.field7274 = 2;
            class490.field7161.field7274 = 2;
            class388.field5969.field7274 = 2;
            class516.field7627.field7274 = 2;
            class142.method1049(-1, class510.field7403.field5120, false, (byte) -111, -1);
            class91.field1518 = class272.field4513.method1954(class300.field4813, -30366);
            class204.field3221 = 200;
            class10.field109 = 95;
        } else if (class204.field3221 == 200) {
            class75.method540(arg0 - 22, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 1861)
    private final void method472(int arg0, int arg1) {
        class100.field1664 = null;
        class78.field1366.field3916++;
        class420.field6348 = null;
        class215.field3750 = 0;
        class78.field1366.field3915 = arg0;
        field1169++;
        if (arg1 != -19920) {
            field1180 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1876)
    public static final void method473() {
        class191.field2974 = 0;
        for (int var0 = 0; var0 < class86.field1471; var0++) {
            class265 var1 = ((class505) class147.field2396.method2516((long) class371.field5734[var0], -1)).field7355;
            if (var1.field3090 && var1.method1141(-3) != -1) {
                int var2 = (var1.method1143(0) - 1) * 64 + 60;
                int var3 = var1.field4716 - var2 >> 7;
                int var4 = var1.field4714 - var2 >> 7;
                class197 var5 = class79.method578(var3, var4, 14918, var1.field4720);
                if (var5 != null) {
                    int var6 = var5.field3130;
                    if (var5 instanceof class265) {
                        var6 += 2048;
                    }
                    if (var5.field3095 == 0 && var5.method1141(-3) != -1) {
                        class209.field3312[class191.field2974] = var6;
                        class477.field7056[class191.field2974] = var6;
                        class191.field2974++;
                        var5.field3095++;
                    }
                    class209.field3312[class191.field2974] = var6;
                    class477.field7056[class191.field2974] = var1.field3130 + 2048;
                    class191.field2974++;
                    var5.field3095++;
                }
            }
        }
        class20.method106(0, class477.field7056, class209.field3312, class191.field2974 - 1, (byte) -104);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1924)
    private final void method474(int arg0) {
        field1163++;
        int var2 = 3 / ((arg0 - 52) / 57);
        boolean var3 = class78.field1366.method1553((byte) 25);
        if (!var3) {
            this.method470((byte) 13);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lec;)Lnj;", line = 1943)
    public static final class314 method475(class68 arg0) {
        class314 var1 = (class314) class81.field1408.method2516(((long) arg0.field1059 << 32) + (long) arg0.field1152, -1);
        return var1 == null ? arg0.field1022 : var1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1948)
    public final void init() {
        field1168++;
        if (!this.method644((byte) 99)) {
            return;
        }
        class244.field4180 = new class487();
        class244.field4180.field7139 = Integer.parseInt(this.getParameter("worldid"));
        class269.field4484 = new class487();
        class269.field4484.field7139 = Integer.parseInt(this.getParameter("lobbyid"));
        class269.field4484.field7133 = this.getParameter("lobbyaddress");
        class100.field1657 = new class487();
        class100.field1657.field7139 = Integer.parseInt(this.getParameter("demoid"));
        class100.field1657.field7133 = this.getParameter("demoaddress");
        class255.field4320 = class123.method972(Integer.parseInt(this.getParameter("modewhere")), (byte) 105);
        if (!class31.method240(class255.field4320, 1) && class255.field4320 != class180.field2857) {
            class255.field4320 = class180.field2857;
        }
        class511.field7483 = class475.method2809(Integer.parseInt(this.getParameter("modewhat")), true);
        if (class95.field1601 != class511.field7483 && class511.field7483 != class189.field2957 && class511.field7483 != class398.field6082) {
            class511.field7483 = class398.field6082;
        }
        try {
            class300.field4813 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class300.field4813 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class128.field2196 = true;
        } else {
            class128.field2196 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class193.field3011 = true;
        } else {
            class193.field3011 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class53.field861 = true;
        } else {
            class53.field861 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class271.field4501 = class251.field4283;
            } else if (var4.equals("1")) {
                class271.field4501 = class131.field2246;
            }
        }
        try {
            class57.field899 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class57.field899 = 0;
        }
        class252.field4300 = this.getParameter("quiturl");
        class60.field917 = this.getParameter("settings");
        if (class60.field917 == null) {
            class60.field917 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class317.field4990 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class317.field4990 = 0;
            }
        }
        class208.field3286 = Integer.parseInt(this.getParameter("colourid"));
        if (class208.field3286 < 0 || class391.field5981.length <= class208.field3286) {
            class208.field3286 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class289.field4705 = true;
            class348.field5467 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class164.field2597 = true;
        }
        if (class271.field4501 == class251.field4283) {
            class527.field7766 = 503;
            class146.field2382 = 765;
        } else if (class271.field4501 == class131.field2246) {
            class527.field7766 = 480;
            class146.field2382 = 640;
        }
        class326.field5138 = this;
        this.method640(598, class511.field7483.method1353((byte) -74) + 32, class527.field7766, class146.field2382, 9001);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V", line = 2069)
    private final void method476(byte arg0, byte[] arg1) {
        if (arg0 <= 38) {
            field1183 = null;
        }
        field1164++;
        class23 var3 = new class23(arg1);
        while (true) {
            int var4;
            label49: do {
                while (true) {
                    while (true) {
                        var4 = var3.method126((byte) -103);
                        if (var4 == 0) {
                            return;
                        }
                        if (var4 == 1) {
                            int[] var9 = class34.field525 = new int[6];
                            var9[0] = var3.method132(47);
                            var9[1] = var3.method132(90);
                            var9[2] = var3.method132(89);
                            var9[3] = var3.method132(60);
                            var9[4] = var3.method132(107);
                            var9[5] = var3.method132(60);
                        } else {
                            if (var4 != 4) {
                                continue label49;
                            }
                            int var7 = var3.method126((byte) -77);
                            class415.field6306 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                class415.field6306[var8] = var3.method132(79);
                                if (class415.field6306[var8] == 65535) {
                                    class415.field6306[var8] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var4 != 5);
            int var5 = var3.method126((byte) -117);
            class434.field6479 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class434.field6479[var6] = var3.method132(42);
                if (class434.field6479[var6] == 65535) {
                    class434.field6479[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2145)
    public static final void method477() {
        int var0 = class151.field2425;
        int[] var1 = class45.field734;
        boolean var2 = class510.field7403.field5106 == 1 && var0 > 200 || class510.field7403.field5106 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class166 var13 = class435.field6489[var1[var3]];
            if (var13.method1137(false)) {
                var13.method317((byte) -111);
                if (var13.field4718 >= 0 && var13.field4717 >= 0 && var13.field4722 < class217.field3775 && var13.field4713 < class277.field4548) {
                    var13.field2644 = var13.field3111 ? var2 : false;
                    if (class302.field4850 == var13) {
                        var13.field3122 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field3090) {
                            var14++;
                        }
                        if (var13.field3056 > class504.field7348) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1143(0) << 2);
                        if (var13.field2649) {
                            var15 += 512;
                        } else {
                            if (class15.field174 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field3122 = var15 + 1;
                    }
                } else {
                    var13.field3122 = -1;
                }
            } else {
                var13.field3122 = -1;
            }
        }
        for (int var4 = 0; var4 < class86.field1471; var4++) {
            class265 var10 = ((class505) class147.field2396.method2516((long) class371.field5734[var4], -1)).field7355;
            if (var10.method1771(false) && var10.field4430.method2999(class327.field5160, 1)) {
                var10.method317((byte) -111);
                if (var10.field4718 >= 0 && var10.field4717 >= 0 && var10.field4722 < class217.field3775 && var10.field4713 < class277.field4548) {
                    int var11 = 0;
                    if (!var10.field3090) {
                        var11++;
                    }
                    if (var10.field3056 > class504.field7348) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1143(0) << 2);
                    if (class15.field174 == 0) {
                        if (var10.field4430.field7430) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class15.field174 == 1) {
                        if (var10.field4430.field7430) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field4430.field7463) {
                        var12 += 1024;
                    } else if (!var10.field4430.field7412) {
                        var12 += 256;
                    }
                    var10.field3122 = var12 + 1;
                } else {
                    var10.field3122 = -1;
                }
            } else {
                var10.field3122 = -1;
            }
        }
        for (int var5 = 0; var5 < class413.field6289.length; var5++) {
            class475 var6 = class413.field6289[var5];
            if (var6 != null) {
                if (var6.field7032 == 1) {
                    class505 var7 = (class505) class147.field2396.method2516((long) var6.field7037, -1);
                    if (var7 != null) {
                        class265 var8 = var7.field7355;
                        if (var8.field3122 >= 0) {
                            var8.field3122 += 2048;
                        }
                    }
                } else if (var6.field7032 == 10) {
                    class166 var9 = class435.field6489[var6.field7037];
                    if (var9 != null && class302.field4850 != var9 && var9.field3122 >= 0) {
                        var9.field3122 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2308)
    public static final void main(String[] arg0) {
        field1179++;
        try {
            if (arg0.length != 6) {
                class383.method2416("Argument count", (byte) 66);
            }
            class244.field4180 = new class487();
            class244.field4180.field7139 = Integer.parseInt(arg0[0]);
            class269.field4484 = new class487();
            class269.field4484.field7139 = Integer.parseInt(arg0[1]);
            class100.field1657 = new class487();
            class100.field1657.field7139 = Integer.parseInt(arg0[2]);
            class255.field4320 = class327.field5150;
            if (arg0[3].equals("live")) {
                class511.field7483 = class398.field6082;
            } else if (arg0[3].equals("rc")) {
                class511.field7483 = class189.field2957;
            } else if (arg0[3].equals("wip")) {
                class511.field7483 = class95.field1601;
            } else {
                class383.method2416("modewhat", (byte) 73);
            }
            class300.field4813 = class59.method398(arg0[4], -1);
            if (class300.field4813 == -1) {
                if (arg0[4].equals("english")) {
                    class300.field4813 = 0;
                } else if (arg0[4].equals("german")) {
                    class300.field4813 = 1;
                } else {
                    class383.method2416("language", (byte) 108);
                }
            }
            class128.field2196 = false;
            class193.field3011 = false;
            if (arg0[5].equals("game0")) {
                class271.field4501 = class251.field4283;
            } else if (arg0[5].equals("game1")) {
                class271.field4501 = class131.field2246;
            } else {
                class383.method2416("game", (byte) 104);
            }
            class289.field4705 = true;
            class348.field5467 = true;
            class208.field3286 = class271.field4501.field7866;
            class317.field4990 = 0;
            class57.field899 = 0;
            class164.field2597 = false;
            class60.field917 = "";
            client var1 = new client();
            class326.field5138 = var1;
            var1.method649(false, 30, class271.field4501.field7861, true, class511.field7483.method1353((byte) -114) + 32, 1024, 768, 598);
            class346.field5450.setLocation(40, 40);
        } catch (Exception var3) {
            class502.method2968(null, (byte) -82, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2378)
    public static final void method478(int arg0) {
        if (arg0 != -19775) {
            method478(-114);
        }
        field1177++;
        for (int var1 = 0; var1 < 5; var1++) {
            class533.field7838[var1] = false;
        }
        class300.field4810 = class48.field764;
        class328.field5176 = -1;
        class165.field2615 = class381.field5891;
        class112.field1977 = -1;
        class199.field3164 = 0;
        class373.field5740 = class130.field2234;
        class393.field6007 = class227.field3927;
        class6.field69 = class504.field7348;
        class190.field2963 = 5;
        class412.field6254 = class473.field7021;
        class204.field3227 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2408)
    public final void method479(int arg0) {
        field1167++;
        if (class361.field5604) {
            class249.method1687(false);
        }
        if (class305.field4873 != null) {
            class305.field4873.method2867((byte) -85);
        }
        if (class422.field6374 != null) {
            class26.method190(class422.field6374, class419.field6342, arg0 ^ 0xFFFFFE79);
            class422.field6374 = null;
        }
        if (class463.field6886 != null) {
            class463.field6886.method2804(true);
            class463.field6886 = null;
        }
        if (class144.field2350 != null) {
            class144.field2350.method51(class270.field4495, (byte) 69);
        }
        class144.field2350 = null;
        class21.method112((byte) -12);
        if (arg0 != 503) {
            return;
        }
        class78.field1366.method1564(arg0 ^ 0xFFFFFE09);
        class37.field552.method2812(-55);
        if (class491.field7169 != null) {
            class491.field7169.method1798(100);
            class491.field7169 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lec;)Lec;", line = 2453)
    public static final class68 method480(class68 arg0) {
        int var1 = method475(arg0).method1989((byte) -63);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class22.method115(7521, arg0.field1047);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lec;)Z", line = 2474)
    public static final boolean method481(class68 arg0) {
        if (class494.field7214) {
            if (method475(arg0).field4938 != 0) {
                return false;
            }
            if (arg0.field1086 == 0) {
                return false;
            }
        }
        return arg0.field1029;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2498)
    private final void method482(int arg0) {
        if (class32.field515 == 6 && class350.field5480 == 0) {
            if (class265.field4447 > 0) {
                class265.field4447--;
            }
            if (class165.field2609 > 1) {
                class368.field5713 = class78.field1368;
                class165.field2609--;
            }
            if (!class387.field5967) {
                class423.method2595(-121);
            }
            for (int var2 = 0; var2 < 100 && class74.method523(false); var2++) {
            }
        }
        field1173++;
        class431.field6455++;
        class498.method2953(-1, 108, null, -1);
        class386.method2423(-1, null, (byte) 1, -1);
        class380.method2402(15666);
        class78.field1368++;
        for (int var3 = 0; var3 < class353.field5506; var3++) {
            class265 var4 = class393.field6008[var3].field7355;
            if (var4 != null) {
                byte var5 = var4.field4430.field7459;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1143(0);
                    if ((var5 & 0x2) != 0 && var4.field3153 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field3159[0] + var7;
                            int var10 = var4.field3158[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class217.field3775 - var6 - 1) < var9) {
                                var9 = class217.field3775 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class277.field4548 - var6 - 1)) {
                                var10 = class277.field4548 - var6 - 1;
                            }
                            int var11 = class88.method622(0, var10, -1, (byte) -64, var9, class295.field4751, class106.field1865[var4.field4720], var4.field3159[0], var4.field3158[0], 0, var6, var6, true, class229.field3998, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field3159[var12] = class295.field4751[var11 - var12 - 1];
                                    var4.field3158[var12] = class229.field3998[var11 - var12 - 1];
                                    var4.field3152[var12] = 1;
                                }
                                var4.field3153 = var11;
                            }
                        }
                    }
                    class345.method2228(true, 117, var4);
                    int var13 = class121.method954(var4, true);
                    class46.method329(var13, var4, class507.field7382, class453.field6756, (byte) -125);
                    class36.method272(var4, (byte) -105);
                }
            }
        }
        if (class350.field5480 == 0 && class266.field4460 == 0) {
            if (class190.field2963 == 2) {
                class494.method2900(false);
            } else {
                class532.method3146((byte) -73);
            }
            if ((class473.field7021 >> 7) < 14 || (class473.field7021 >> 7) >= (class217.field3775 - 14) || (class48.field764 >> 7) < 14 || (class48.field764 >> 7) >= (class277.field4548 - 14)) {
                class413.method2556(8616931);
            }
        }
        while (true) {
            class483 var14;
            class68 var15;
            class68 var16;
            do {
                var14 = (class483) class15.field180.method2539(0);
                if (var14 == null) {
                    while (true) {
                        class483 var17;
                        class68 var18;
                        class68 var19;
                        do {
                            var17 = (class483) class498.field7302.method2539(0);
                            if (var17 == null) {
                                while (true) {
                                    class483 var20;
                                    class68 var21;
                                    class68 var22;
                                    do {
                                        var20 = (class483) class503.field7344.method2539(0);
                                        if (var20 == null) {
                                            if (class164.field2598 != null) {
                                                class359.method2300(90);
                                            }
                                            if (class504.field7348 % 1500 == 0) {
                                                class215.method1491(-104);
                                            }
                                            if (class32.field515 == 6 && class350.field5480 == 0) {
                                                class5.method21((byte) -2);
                                            }
                                            class305.method1947((byte) -67);
                                            if (class361.field5604 && (class19.method91((byte) 109) - 60000L) > class223.field3856) {
                                                class249.method1687(false);
                                            }
                                            for (class262 var23 = (class262) class55.field888.method573(24037); var23 != null; var23 = (class262) class55.field888.method576(14)) {
                                                if (((long) var23.field4367) < (class19.method91((byte) 93) / 1000L - 5L)) {
                                                    if (var23.field4370 > 0) {
                                                        class81.method588("", 0, (byte) 98, var23.field4368 + class45.field738.method1954(class300.field4813, -30366), 5, "");
                                                    }
                                                    if (var23.field4370 == 0) {
                                                        class81.method588("", 0, (byte) 98, var23.field4368 + class120.field2117.method1954(class300.field4813, -30366), 5, "");
                                                    }
                                                    var23.method695(69);
                                                }
                                            }
                                            if (class32.field515 == 6 && class350.field5480 == 0) {
                                                if (class463.field6886 == null) {
                                                    class165.method1132(false, false);
                                                    return;
                                                }
                                                class151.field2424++;
                                                if (class151.field2424 > 50) {
                                                    class93.field1528++;
                                                    class265.method1775(-2, class507.field7377);
                                                }
                                                try {
                                                    if (class463.field6886 != null && class261.field4357.field301 > 0) {
                                                        class496.field7267 += class261.field4357.field301;
                                                        class463.field6886.method2795(0, class261.field4357.field301, (byte) 14, class261.field4357.field302);
                                                        class261.field4357.field301 = 0;
                                                        class151.field2424 = 0;
                                                    }
                                                } catch (IOException var25) {
                                                    class165.method1132(false, false);
                                                }
                                            }
                                            int var24 = 39 % ((arg0 + 72) / 37);
                                            return;
                                        }
                                        var21 = var20.field7100;
                                        if (var21.field1152 < 0) {
                                            break;
                                        }
                                        var22 = class22.method115(7521, var21.field1047);
                                    } while (var22 == null || var22.field997 == null || var22.field997.length <= var21.field1152 || var22.field997[var21.field1152] != var21);
                                    class521.method3073(var20);
                                }
                            }
                            var18 = var17.field7100;
                            if (var18.field1152 < 0) {
                                break;
                            }
                            var19 = class22.method115(7521, var18.field1047);
                        } while (var19 == null || var19.field997 == null || var18.field1152 >= var19.field997.length || var19.field997[var18.field1152] != var18);
                        class521.method3073(var17);
                    }
                }
                var15 = var14.field7100;
                if (var15.field1152 < 0) {
                    break;
                }
                var16 = class22.method115(7521, var15.field1047);
            } while (var16 == null || var16.field997 == null || var16.field997.length <= var15.field1152 || var16.field997[var15.field1152] != var15);
            class521.method3073(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 2786)
    public final void method483(int arg0) {
        field1181++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class511.method3010(0);
        class37.field552 = new class477(class419.field6342);
        class78.field1366 = new class226();
        if (class255.field4320 != class180.field2857) {
            class205.field3253 = new byte[50][];
        }
        class510.field7403 = new class176(class419.field6342);
        if (class255.field4320 == class180.field2857) {
            class244.field4180.field7133 = this.getCodeBase().getHost();
        } else if (class31.method240(class255.field4320, 1)) {
            class244.field4180.field7133 = this.getCodeBase().getHost();
            class244.field4180.field7137 = class244.field4180.field7139 + 40000;
            class269.field4484.field7137 = class269.field4484.field7139 + 40000;
            class100.field1657.field7137 = class100.field1657.field7139 + 40000;
            class244.field4180.field7136 = class244.field4180.field7139 + 50000;
            class269.field4484.field7136 = class269.field4484.field7139 + 50000;
            class100.field1657.field7136 = class100.field1657.field7139 + 50000;
        } else if (class327.field5150 == class255.field4320) {
            class244.field4180.field7133 = "127.0.0.1";
            class269.field4484.field7133 = "127.0.0.1";
            class244.field4180.field7137 = class244.field4180.field7139 + 40000;
            class100.field1657.field7133 = "127.0.0.1";
            class269.field4484.field7137 = class269.field4484.field7139 + 40000;
            class244.field4180.field7136 = class244.field4180.field7139 + 50000;
            class100.field1657.field7137 = class100.field1657.field7139 + 40000;
            class269.field4484.field7136 = class269.field4484.field7139 + 50000;
            class100.field1657.field7136 = class100.field1657.field7139 + 50000;
        }
        if (class271.field4501 == class251.field4283) {
            class263.field4385 = false;
        }
        if (class271.field4501 == class131.field2246) {
            class126.field2185 = 0;
            class73.field1253 = class490.field7160;
            class300.field4816 = class405.field6155;
            class529.field7782 = true;
            class506.field7373 = 16777215;
            class146.field2389 = class69.field1195;
            class175.field2775 = class442.field6598;
        } else {
            class73.field1253 = class360.field5595;
            class175.field2775 = class265.field4422;
            class146.field2389 = class320.field5042;
            class300.field4816 = class180.field2858;
        }
        class243.field4172 = class60.field919 = class41.field682 = class374.field5774 = new short[256];
        class244.field4183 = class244.field4180;
        class468.field6955 = class402.method2494(class270.field4495, (byte) -54);
        class333.field5233 = class237.method1628(class270.field4495, (byte) 12, true);
        class144.field2350 = class194.method1294((byte) 20);
        if (class144.field2350 != null) {
            class144.field2350.method49((byte) 117, class270.field4495);
        }
        int var3 = 88 / ((28 - arg0) / 54);
        class45.field737 = class493.field7198;
        try {
            if (class419.field6342.field7201 != null) {
                class495.field7229 = new class172(class419.field6342.field7201, 5200, 0);
                for (int var4 = 0; var4 < 30; var4++) {
                    class160.field2561[var4] = new class172(class419.field6342.field7191[var4], 6000, 0);
                }
                class378.field5875 = new class172(class419.field6342.field7205, 6000, 0);
                class485.field7115 = new class436(255, class495.field7229, class378.field5875, 500000);
                class188.field2937 = new class172(class419.field6342.field7202, 24, 0);
                class419.field6342.field7201 = null;
                class419.field6342.field7191 = null;
                class419.field6342.field7202 = null;
                class419.field6342.field7205 = null;
            }
        } catch (IOException var5) {
            class485.field7115 = null;
            class378.field5875 = null;
            class188.field2937 = null;
            class495.field7229 = null;
        }
        if (class255.field4320 != class180.field2857) {
            class81.field1420 = true;
        }
        if (class271.field4501 == class251.field4283) {
            class413.field6291 = class140.field2327.method1954(class300.field4813, -30366);
        } else if (class271.field4501 == class131.field2246) {
            class413.field6291 = class402.field6118.method1954(class300.field4813, -30366);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lec;IIIIIIIII)V", line = 2914)
    public static final void method484(class68[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class68 var11 = arg0[var10];
            if (var11 != null && var11.field1047 == arg1) {
                int var12 = var11.field1118 + arg6;
                int var13 = var11.field1127 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field1086 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field1009 + var12;
                    int var19 = var11.field1081 + var13;
                    if (var11.field1086 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field1086 == 0 || var11.field1090 || method475(var11).field4938 != 0 || class529.field7780 == var11 || class34.field529 == var11.field1115) {
                    if (!method481(var11)) {
                        if (class164.field2598 == var11) {
                            class228.field3990 = true;
                            class104.field1737 = var12;
                            class275.field4528 = var13;
                        }
                        if (var11.field1057 || var14 < var16 && var15 < var17) {
                            if (var11.field1034 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class483 var20 = (class483) class503.field7344.method2538(-3); var20 != null; var20 = (class483) class503.field7344.method2535((byte) -122)) {
                                    if (var20.field7106) {
                                        var20.method1821((byte) -128);
                                        var20.field7100.field1151 = false;
                                    }
                                }
                                if (class263.field4382 == 0) {
                                    class164.field2598 = null;
                                    class529.field7780 = null;
                                }
                                class217.field3778 = 0;
                                class2.field17 = false;
                                class32.field516 = false;
                                if (!class387.field5967) {
                                    class423.method2595(-125);
                                }
                            }
                            boolean var21;
                            if (class333.field5233.method1660(2766) >= var14 && class333.field5233.method1655(-113) >= var15 && class333.field5233.method1660(2766) < var16 && class333.field5233.method1655(-123) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class508.field7386 && var21) {
                                if (var11.field1021 >= 0) {
                                    class102.field1688 = var11.field1021;
                                } else if (var11.field1034) {
                                    class102.field1688 = -1;
                                }
                            }
                            if (!class387.field5967 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class103.method701(var11, -1, arg8 - var12, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class333.field5233.method1658((byte) -108) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class272 var24 = (class272) class216.field3765.method2538(-3);
                            if (var24 != null && var24.method385((byte) -14) == 0 && var24.method384((byte) -120) >= var14 && var24.method386((byte) -90) >= var15 && var24.method384((byte) -120) < var16 && var24.method386((byte) -69) < var17) {
                                var23 = true;
                            }
                            if (var11.field1071 != null) {
                                for (int var25 = 0; var25 < var11.field1071.length; var25++) {
                                    if (class468.field6955.method1369(var11.field1071[var25], 26)) {
                                        if (var11.field1045 == null || class504.field7348 >= var11.field1045[var25]) {
                                            byte var26 = var11.field1121[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class468.field6955.method1369(86, 26) && !class468.field6955.method1369(82, 26) && !class468.field6955.method1369(81, 26)) && ((var26 & 0x2) == 0 || class468.field6955.method1369(86, 26)) && ((var26 & 0x1) == 0 || class468.field6955.method1369(82, 26)) && ((var26 & 0x4) == 0 || class468.field6955.method1369(81, 26))) {
                                                if (var25 < 10) {
                                                    class41.method305(-1, "", var11.field1059, -5, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class467.method2772(false);
                                                    class314 var27 = method475(var11);
                                                    class121.method952(-51, var27.method1988(-20539), var27.field4949, var11);
                                                    class460.field6823 = class125.method983(true, var11);
                                                    if (class460.field6823 == null) {
                                                        class460.field6823 = "Null";
                                                    }
                                                    class15.field179 = var11.field1052 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field1105[var25];
                                                if (var11.field1045 == null) {
                                                    var11.field1045 = new int[var11.field1071.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field1045[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field1045[var25] = class504.field7348 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field1045 != null) {
                                        var11.field1045[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class264.method1762(var11, true, var24.method384((byte) -120) - var12, var24.method386((byte) -47) - var13);
                            }
                            if (class164.field2598 != null && class164.field2598 != var11 && var21 && method475(var11).method1995((byte) -56)) {
                                class38.field570 = var11;
                            }
                            if (class529.field7780 == var11) {
                                class420.field6357 = true;
                                class97.field1607 = var12;
                                class326.field5135 = var13;
                            }
                            if (var11.field1090 || var11.field1115 != 0) {
                                if (var21 && class147.field2394 != 0 && var11.field1137 != null) {
                                    class483 var29 = new class483();
                                    var29.field7106 = true;
                                    var29.field7100 = var11;
                                    var29.field7095 = class147.field2394;
                                    var29.field7101 = var11.field1137;
                                    class503.field7344.method2541(0, var29);
                                }
                                if (class164.field2598 != null || class387.field5967 || class424.field6392 != var11.field1115 && class217.field3778 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field1115 != 0) {
                                    if (class81.field1426 == var11.field1115 || class253.field4308 == var11.field1115) {
                                        class446.field6673 = var11;
                                        if (class162.field2571 != null) {
                                            class162.field2571.method2492(var11.field1081, (byte) 126, class305.field4873);
                                        }
                                        if (class81.field1426 == var11.field1115) {
                                            if (!class387.field5967 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class391.method2440(class305.field4873, arg8, true, arg9);
                                                for (class219 var30 = (class219) class70.field1209.method573(24037); var30 != null; var30 = (class219) class70.field1209.method576(14)) {
                                                    if (arg8 >= var30.field3795 && arg8 < var30.field3794 && arg9 >= var30.field3789 && arg9 < var30.field3792) {
                                                        class423.method2595(-85);
                                                        class473.method2805(var30.field3793, -23404);
                                                    }
                                                }
                                            }
                                            class498.method2953(var13, 118, var11, var12);
                                            continue;
                                        }
                                    }
                                    if (class34.field529 == var11.field1115) {
                                        if (var11.method449(true, class305.field4873) == null || class333.field5246 != 0 && class333.field5246 != 3 || class387.field5967 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field1020[var32];
                                        if (var31 < var33 || var31 > var11.field1019[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field1009 / 2;
                                        int var35 = var32 - var11.field1081 / 2;
                                        int var36;
                                        if (class190.field2963 == 4) {
                                            var36 = (int) class88.field1483 & 0x3FFF;
                                        } else {
                                            var36 = (int) class88.field1483 + class227.field3959 & 0x3FFF;
                                        }
                                        int var37 = class46.field757[var36];
                                        int var38 = class46.field755[var36];
                                        if (class190.field2963 != 4) {
                                            var37 = (class435.field6507 + 256) * var37 >> 8;
                                            var38 = (class435.field6507 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class190.field2963 == 4) {
                                            var41 = (class296.field4782 >> 7) + (var39 >> 2);
                                            var42 = (class535.field7865 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class302.field4850.method1143(0) - 1) * 64;
                                            var41 = (class302.field4850.field4716 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class302.field4850.field4714 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class508.field7386 && (class313.field4934 & 0x40) != 0) {
                                            class68 var44 = class453.method2708(class345.field5413, 104, class75.field1309);
                                            if (var44 == null) {
                                                class467.method2772(false);
                                            } else {
                                                class307.method1956(60, true, -1, false, class208.field3282, var11.field1062, var42, 1L, var41, class460.field6823, " ->");
                                            }
                                            continue;
                                        }
                                        if (class271.field4501 == class131.field2246) {
                                            class307.method1956(25, true, -1, false, -1, -1, var42, 1L, var41, class369.field5714.method1954(class300.field4813, -30366), "");
                                        }
                                        class307.method1956(23, true, -1, false, class276.field4541, -1, var42, 1L, var41, class528.field7775, "");
                                        continue;
                                    }
                                    if (class424.field6392 == var11.field1115) {
                                        class3.field27 = var11;
                                        if (var21) {
                                            class2.field17 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method384((byte) -120) - var12 - var11.field1009 / 2) * 2.0D / (double) class210.field3335);
                                            int var46 = (int) (-((double) (var24.method386((byte) -97) - var13 - var11.field1081 / 2) * 2.0D / (double) class210.field3335));
                                            int var47 = class494.field7217 + var45 + class210.field3357;
                                            int var48 = class471.field6970 + var46 + class210.field3340;
                                            class346 var49 = class16.method79(false);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2230(var48, true, var47, var50);
                                            if (var50 != null) {
                                                if (class468.field6955.method1369(82, 26) && class407.field6189 > 0) {
                                                    class381.method2407(var50[2], var50[1], var50[0], false);
                                                    continue;
                                                }
                                                class32.field516 = true;
                                                class498.field7307 = var50[0];
                                                class251.field4295 = var50[1];
                                                class108.field1937 = var50[2];
                                            }
                                            class217.field3778 = 1;
                                            class277.field4545 = false;
                                            class226.field3891 = class333.field5233.method1660(2766);
                                            class222.field3819 = class333.field5233.method1655(-117);
                                            continue;
                                        }
                                        if (var22 && class217.field3778 > 0) {
                                            if (class217.field3778 == 1 && (class226.field3891 != class333.field5233.method1660(2766) || class222.field3819 != class333.field5233.method1655(-121))) {
                                                class139.field2322 = class494.field7217;
                                                class209.field3320 = class471.field6970;
                                                class217.field3778 = 2;
                                            }
                                            if (class217.field3778 == 2) {
                                                class277.field4545 = true;
                                                class75.method524(class139.field2322 + (int) ((double) (class226.field3891 - class333.field5233.method1660(2766)) * 2.0D / (double) class210.field3339), (byte) -118);
                                                class179.method1207(class209.field3320 - (int) ((double) (class222.field3819 - class333.field5233.method1655(-122)) * 2.0D / (double) class210.field3339), -117);
                                            }
                                            continue;
                                        }
                                        if (class217.field3778 > 0 && !class277.field4545) {
                                            if ((class199.field3176 == 1 || class1.method4(1009)) && class480.field7080 > 2) {
                                                class281.method1841(class226.field3891, class222.field3819, -128);
                                            } else if (class275.method1816(72)) {
                                                class281.method1841(class226.field3891, class222.field3819, -89);
                                            }
                                        }
                                        class217.field3778 = 0;
                                        continue;
                                    }
                                    if (class460.field6819 == var11.field1115) {
                                        if (var22) {
                                            class525.method3113(11, class333.field5233.method1660(2766) - var12, var11.field1009, class333.field5233.method1655(-120) - var13, var11.field1081);
                                        }
                                        continue;
                                    }
                                    if (class117.field2086 == var11.field1115) {
                                        class386.method2423(var12, var11, (byte) 1, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field1027 && var23) {
                                    var11.field1027 = true;
                                    if (var11.field1144 != null) {
                                        class483 var51 = new class483();
                                        var51.field7106 = true;
                                        var51.field7100 = var11;
                                        var51.field7098 = var24.method384((byte) -120) - var12;
                                        var51.field7095 = var24.method386((byte) -113) - var13;
                                        var51.field7101 = var11.field1144;
                                        class503.field7344.method2541(0, var51);
                                    }
                                }
                                if (var11.field1027 && var22 && var11.field995 != null) {
                                    class483 var52 = new class483();
                                    var52.field7106 = true;
                                    var52.field7100 = var11;
                                    var52.field7098 = class333.field5233.method1660(2766) - var12;
                                    var52.field7095 = class333.field5233.method1655(-114) - var13;
                                    var52.field7101 = var11.field995;
                                    class503.field7344.method2541(0, var52);
                                }
                                if (var11.field1027 && !var22) {
                                    var11.field1027 = false;
                                    if (var11.field1040 != null) {
                                        class483 var53 = new class483();
                                        var53.field7106 = true;
                                        var53.field7100 = var11;
                                        var53.field7098 = class333.field5233.method1660(2766) - var12;
                                        var53.field7095 = class333.field5233.method1655(-123) - var13;
                                        var53.field7101 = var11.field1040;
                                        class498.field7302.method2541(0, var53);
                                    }
                                }
                                if (var22 && var11.field1094 != null) {
                                    class483 var54 = new class483();
                                    var54.field7106 = true;
                                    var54.field7100 = var11;
                                    var54.field7098 = class333.field5233.method1660(2766) - var12;
                                    var54.field7095 = class333.field5233.method1655(-100) - var13;
                                    var54.field7101 = var11.field1094;
                                    class503.field7344.method2541(0, var54);
                                }
                                if (!var11.field1151 && var21) {
                                    var11.field1151 = true;
                                    if (var11.field1135 != null) {
                                        class483 var55 = new class483();
                                        var55.field7106 = true;
                                        var55.field7100 = var11;
                                        var55.field7098 = class333.field5233.method1660(2766) - var12;
                                        var55.field7095 = class333.field5233.method1655(-117) - var13;
                                        var55.field7101 = var11.field1135;
                                        class503.field7344.method2541(0, var55);
                                    }
                                }
                                if (var11.field1151 && var21 && var11.field999 != null) {
                                    class483 var56 = new class483();
                                    var56.field7106 = true;
                                    var56.field7100 = var11;
                                    var56.field7098 = class333.field5233.method1660(2766) - var12;
                                    var56.field7095 = class333.field5233.method1655(-101) - var13;
                                    var56.field7101 = var11.field999;
                                    class503.field7344.method2541(0, var56);
                                }
                                if (var11.field1151 && !var21) {
                                    var11.field1151 = false;
                                    if (var11.field1140 != null) {
                                        class483 var57 = new class483();
                                        var57.field7106 = true;
                                        var57.field7100 = var11;
                                        var57.field7098 = class333.field5233.method1660(2766) - var12;
                                        var57.field7095 = class333.field5233.method1655(-124) - var13;
                                        var57.field7101 = var11.field1140;
                                        class498.field7302.method2541(0, var57);
                                    }
                                }
                                if (var11.field1064 != null) {
                                    class483 var58 = new class483();
                                    var58.field7100 = var11;
                                    var58.field7101 = var11.field1064;
                                    class15.field180.method2541(0, var58);
                                }
                                if (var11.field1033 != null && class251.field4292 > var11.field1143) {
                                    if (var11.field1100 == null || class251.field4292 - var11.field1143 > 32) {
                                        class483 var63 = new class483();
                                        var63.field7100 = var11;
                                        var63.field7101 = var11.field1033;
                                        class503.field7344.method2541(0, var63);
                                    } else {
                                        label691: for (int var59 = var11.field1143; var59 < class251.field4292; var59++) {
                                            int var60 = class222.field3816[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field1100.length; var61++) {
                                                if (var11.field1100[var61] == var60) {
                                                    class483 var62 = new class483();
                                                    var62.field7100 = var11;
                                                    var62.field7101 = var11.field1033;
                                                    class503.field7344.method2541(0, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1143 = class251.field4292;
                                }
                                if (var11.field1108 != null && class420.field6353 > var11.field1083) {
                                    if (var11.field1038 == null || class420.field6353 - var11.field1083 > 32) {
                                        class483 var68 = new class483();
                                        var68.field7100 = var11;
                                        var68.field7101 = var11.field1108;
                                        class503.field7344.method2541(0, var68);
                                    } else {
                                        label667: for (int var64 = var11.field1083; var64 < class420.field6353; var64++) {
                                            int var65 = class519.field7663[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field1038.length; var66++) {
                                                if (var11.field1038[var66] == var65) {
                                                    class483 var67 = new class483();
                                                    var67.field7100 = var11;
                                                    var67.field7101 = var11.field1108;
                                                    class503.field7344.method2541(0, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1083 = class420.field6353;
                                }
                                if (var11.field1122 != null && class49.field796 > var11.field1030) {
                                    if (var11.field1159 == null || class49.field796 - var11.field1030 > 32) {
                                        class483 var73 = new class483();
                                        var73.field7100 = var11;
                                        var73.field7101 = var11.field1122;
                                        class503.field7344.method2541(0, var73);
                                    } else {
                                        label643: for (int var69 = var11.field1030; var69 < class49.field796; var69++) {
                                            int var70 = class262.field4369[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field1159.length; var71++) {
                                                if (var11.field1159[var71] == var70) {
                                                    class483 var72 = new class483();
                                                    var72.field7100 = var11;
                                                    var72.field7101 = var11.field1122;
                                                    class503.field7344.method2541(0, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1030 = class49.field796;
                                }
                                if (var11.field1142 != null && class326.field5136 > var11.field996) {
                                    if (var11.field1075 == null || class326.field5136 - var11.field996 > 32) {
                                        class483 var78 = new class483();
                                        var78.field7100 = var11;
                                        var78.field7101 = var11.field1142;
                                        class503.field7344.method2541(0, var78);
                                    } else {
                                        label619: for (int var74 = var11.field996; var74 < class326.field5136; var74++) {
                                            int var75 = class374.field5818[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field1075.length; var76++) {
                                                if (var11.field1075[var76] == var75) {
                                                    class483 var77 = new class483();
                                                    var77.field7100 = var11;
                                                    var77.field7101 = var11.field1142;
                                                    class503.field7344.method2541(0, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field996 = class326.field5136;
                                }
                                if (var11.field1032 != null && class227.field3935 > var11.field1120) {
                                    if (var11.field1093 == null || class227.field3935 - var11.field1120 > 32) {
                                        class483 var83 = new class483();
                                        var83.field7100 = var11;
                                        var83.field7101 = var11.field1032;
                                        class503.field7344.method2541(0, var83);
                                    } else {
                                        label595: for (int var79 = var11.field1120; var79 < class227.field3935; var79++) {
                                            int var80 = class331.field5215[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field1093.length; var81++) {
                                                if (var11.field1093[var81] == var80) {
                                                    class483 var82 = new class483();
                                                    var82.field7100 = var11;
                                                    var82.field7101 = var11.field1032;
                                                    class503.field7344.method2541(0, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1120 = class227.field3935;
                                }
                                if (class505.field7356 > var11.field1076 && var11.field1035 != null) {
                                    class483 var84 = new class483();
                                    var84.field7100 = var11;
                                    var84.field7101 = var11.field1035;
                                    class503.field7344.method2541(0, var84);
                                }
                                if (class172.field2753 > var11.field1076 && var11.field1109 != null) {
                                    class483 var85 = new class483();
                                    var85.field7100 = var11;
                                    var85.field7101 = var11.field1109;
                                    class503.field7344.method2541(0, var85);
                                }
                                if (class480.field7078 > var11.field1076 && var11.field1136 != null) {
                                    class483 var86 = new class483();
                                    var86.field7100 = var11;
                                    var86.field7101 = var11.field1136;
                                    class503.field7344.method2541(0, var86);
                                }
                                if (class49.field801 > var11.field1076 && var11.field1150 != null) {
                                    class483 var87 = new class483();
                                    var87.field7100 = var11;
                                    var87.field7101 = var11.field1150;
                                    class503.field7344.method2541(0, var87);
                                }
                                if (class368.field5713 > var11.field1076 && var11.field1066 != null) {
                                    class483 var88 = new class483();
                                    var88.field7100 = var11;
                                    var88.field7101 = var11.field1066;
                                    class503.field7344.method2541(0, var88);
                                }
                                var11.field1076 = class78.field1368;
                                if (var11.field1117 != null) {
                                    for (int var89 = 0; var89 < class188.field2946; var89++) {
                                        class483 var90 = new class483();
                                        var90.field7100 = var11;
                                        var90.field7102 = class447.field6677[var89].method308(117);
                                        var90.field7103 = class447.field6677[var89].method306(0);
                                        var90.field7101 = var11.field1117;
                                        class503.field7344.method2541(0, var90);
                                    }
                                }
                                if (class71.field1240 && var11.field1119 != null) {
                                    class483 var91 = new class483();
                                    var91.field7100 = var11;
                                    var91.field7101 = var11.field1119;
                                    class503.field7344.method2541(0, var91);
                                }
                            }
                            if (var11.field1086 == 5 && var11.field1145 != -1) {
                                var11.method450((byte) -96, class503.field7338, class279.field4582).method2492(var11.field1081, (byte) 126, class305.field4873);
                            }
                            class193.method1293(var11, (byte) 70);
                            if (var11.field1086 == 0) {
                                method484(arg0, var11.field1059, var14, var15, var16, var17, var12 - var11.field1041, var13 - var11.field1042, arg8, arg9);
                                if (var11.field997 != null) {
                                    method484(var11.field997, var11.field1059, var14, var15, var16, var17, var12 - var11.field1041, var13 - var11.field1042, arg8, arg9);
                                }
                                class52 var92 = (class52) class259.field4346.method2516((long) var11.field1059, -1);
                                if (var92 != null) {
                                    if (class271.field4501 == class251.field4283 && var92.field843 == 0 && !class387.field5967 && var21 && !class494.field7214) {
                                        class423.method2595(-110);
                                    }
                                    class277.method1828(var12, arg9, var17, var16, var14, var13, var15, 98, arg8, var92.field841);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class193.method1293(var11, (byte) 105);
                }
            }
        }
    }
}
