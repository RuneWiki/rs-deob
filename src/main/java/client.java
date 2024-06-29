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
public class client extends class228 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[F")
    public static float[] field2843 = new float[4];

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2856 = -2;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lcw;")
    public static class119 field2857;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lic;")
    public static class491 field2847;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field2860;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1315(int arg0) {
        field2858++;
        if (class394.field5938) {
            class352.method2206(true);
        }
        if (class348.field5015 != null) {
            class348.field5015.method1108(-7682);
        }
        if (class82.field1255 != null) {
            class498.method2984(100, class483.field7077, class82.field1255);
            class82.field1255 = null;
        }
        if (class90.field1361 != null) {
            class90.field1361.method2312(false);
            class90.field1361 = null;
        }
        if (class450.field6709 != null) {
            class450.field6709.method35((byte) 76, class364.field5570);
        }
        class450.field6709 = null;
        class483.method2867((byte) -126);
        if (arg0 < 40) {
            return;
        }
        class62.field949.method275((byte) 105);
        class81.field1222.method1147(2);
        if (class458.field6776 != null) {
            class458.field6776.method1345((byte) 59);
            class458.field6776 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method1316(byte arg0) {
        field2847 = null;
        field2843 = null;
        if (arg0 == -127) {
            field2857 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1317(byte arg0) {
        field2851++;
        if (arg0 != -98) {
            field2857 = null;
        }
        boolean var2 = class62.field949.method272(-1);
        if (!var2) {
            this.method1338(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method1318(int arg0) {
        int var1 = class74.field1105;
        int[] var2 = class272.field3948;
        for (int var3 = 0; var3 < class402.field6044 + var1; var3++) {
            class129 var4;
            if (var3 < var1) {
                var4 = class44.field707[var2[var3]];
            } else {
                var4 = class193.field2821[class378.field5766[var3 - var1]];
            }
            if (var4.field1768 == arg0 && var4.field1913 >= 0) {
                int var5 = var4.method847(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1763 & 0x7F) != 0 || (var4.field1769 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field1763 & 0x7F) != 64 || (var4.field1769 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1763 >> 7;
                    int var7 = var4.field1769 >> 7;
                    if (var4.field1913 > class397.field5963[var6][var7]) {
                        class397.field5963[var6][var7] = var4.field1913;
                        class468.field6902[var6][var7] = 1;
                    } else if (class397.field5963[var6][var7] == var4.field1913) {
                        var10002 = class468.field6902[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field1763 - var8 >> 7;
                    int var10 = var4.field1769 - var8 >> 7;
                    int var11 = var4.field1763 + var8 >> 7;
                    int var12 = var4.field1769 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1913 > class397.field5963[var13][var14]) {
                                class397.field5963[var13][var14] = var4.field1913;
                                class468.field6902[var13][var14] = 1;
                            } else if (class397.field5963[var13][var14] == var4.field1913) {
                                var10002 = class468.field6902[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method1319(byte arg0) {
        field2854++;
        String var2 = null;
        try {
            var2 = "[1)" + class68.field1038 + "," + class24.field259 + "," + class30.field323 + "," + class182.field2661 + "|";
            if (class500.field7365 != null) {
                var2 = var2 + "2)" + class79.field1192 + "," + (class500.field7365.field1997[0] + class68.field1038) + "," + (class500.field7365.field1996[0] + class24.field259) + "|";
            }
            var2 = var2 + "3)" + class170.field2529 + "|4)" + class426.field6401.field982 + "|5)" + class14.method89(false) + "|6)" + class4.field57 + "," + class116.field1743 + "|";
            var2 = var2 + "7)" + class426.field6401.method392(-2, class170.field2529) + "|";
            if (arg0 != -96) {
                return null;
            }
            var2 = var2 + "8)" + class426.field6401.method393(class170.field2529, 1) + "|";
            var2 = var2 + "9)" + class426.field6401.field997 + "|";
            var2 = var2 + "10)" + class426.field6401.field989 + "|";
            var2 = var2 + "11)" + class426.field6401.field980 + "|";
            var2 = var2 + "12)" + class426.field6401.method2532(1, class170.field2529) + "|";
            var2 = var2 + "13)" + class34.field363 + "]";
        } catch (Throwable var3) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2855++;
        try {
            if (arg0.length != 4) {
                class443.method2665("argument count", -86);
            }
            class40.field588 = Integer.parseInt(arg0[0]);
            class447.field6662 = class482.field7063;
            if (arg0[1].equals("live")) {
                class455.field6742 = class301.field4264;
            } else if (arg0[1].equals("rc")) {
                class455.field6742 = class493.field7289;
            } else if (arg0[1].equals("wip")) {
                class455.field6742 = class266.field3896;
            } else {
                class443.method2665("modewhat", -125);
            }
            class143.field2137 = class335.method2044(arg0[2], 56);
            if (class143.field2137 == -1) {
                if (arg0[2].equals("english")) {
                    class143.field2137 = 0;
                } else if (arg0[2].equals("german")) {
                    class143.field2137 = 1;
                } else {
                    class443.method2665("language", -123);
                }
            }
            class186.field2765 = false;
            class398.field5967 = false;
            if (arg0[3].equals("game0")) {
                class183.field2707 = class26.field273;
            } else if (arg0[3].equals("game1")) {
                class183.field2707 = class359.field5513;
            } else {
                class443.method2665("game", -96);
            }
            class159.field2357 = 0;
            class412.field6196 = class183.field2707.field6355;
            class245.field3617 = true;
            class31.field341 = true;
            class465.field6885 = "";
            class363.field5568 = 0;
            client var1 = new client();
            class436.field6522 = var1;
            var1.method1556(589, class455.field6742.method2404((byte) 65) + 32, 768, 30, class183.field2707.field6359, (byte) 36, false, 1024);
            class214.field3119.setLocation(40, 40);
        } catch (Exception var3) {
            class235.method1598(var3, null, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1320(int arg0) {
        field2845++;
        method1316((byte) -127);
        class352.method2208(3);
        class137.method916((byte) 67);
        class338.method2051(255);
        class475.method2839(arg0 + 138);
        class54.method331(-1);
        class199.method1358(arg0 ^ 0x47);
        class263.method1743(32);
        class244.method1631(-29697);
        class271.method1785(arg0 + 24175);
        class337.method2048(0);
        class88.method519(-14986);
        class228.method1560(true);
        class470.method2816((byte) -18);
        class398.method2406(48);
        class207.method1395(6610);
        class423.method2543(-3621);
        class162.method1064((byte) 116);
        class420.method2521((byte) 124);
        class308.method1939((byte) 95);
        class178.method1211((byte) -109);
        class123.method822((byte) -75);
        class6.method37((byte) 86);
        class376.method2305(0);
        class43.method264(arg0 + 15);
        class165.method1150((byte) -77);
        class317.method1980(-1);
        class491.method2954(false);
        class494.method2966(7926);
        class135.method897(0);
        class226.method1537(arg0 ^ 0xFFFFFFA7);
        class277.method1812((byte) -79);
        class37.method215((byte) 87);
        class154.method994(123);
        class268.method1773(9447);
        class245.method1649(false);
        class67.method401((byte) -52);
        class468.method2799(5602);
        class64.method380((byte) 50);
        class447.method2687(arg0 ^ 0xFFFFFFE5);
        class93.method544(arg0 - 90);
        class177.method1203(34);
        class261.method1735(false);
        class86.method504(true);
        class108.method670(true);
        class172.method1181(false);
        class382.method2331(-125);
        class391.method2379(arg0 ^ 0xFFFFFF8A);
        class454.method2728(160);
        class380.method2326(0);
        class477.method2845((byte) -88);
        class515.method3040(160);
        class250.method1675((byte) 40);
        class191.method1299(0);
        class471.method2825(1);
        class167.method1164(false);
        class252.method1688((byte) 0);
        class73.method419(-41);
        class197.method1344(2);
        class119.method788((byte) 42);
        class314.method1965((byte) -13);
        class111.method683((byte) 86);
        class28.method167(-684953913);
        class38.method222(true);
        class267.method1766(127);
        class239.method1613(-16706);
        class169.method1173(arg0 ^ 0xA);
        class230.method1582(96);
        class209.method1416((byte) 67);
        class489.method2914((byte) -97);
        class518.method3051(true);
        class278.method1816(-23);
        class237.method1603(true);
        class92.method534(true);
        class387.method2366(arg0 ^ 0x76);
        class498.method2985(65280);
        class79.method464(-31305);
        class467.method2794((byte) 109);
        class5.method29(arg0 - 26533);
        class503.method2998(arg0 ^ 0x71);
        class371.method2288(-107);
        class33.method188(-26);
        class231.method1587(-63);
        class11.method74((byte) 121);
        class496.method2977(false);
        class189.method1292((byte) 114);
        class192.method1303(arg0 ^ 0xA);
        class66.method394((byte) 70);
        class42.method257(arg0 + 11);
        class329.method2023((byte) -26);
        class315.method1971(4096);
        class388.method2368(0);
        class234.method1597(-64);
        class436.method2620(-204);
        class434.method2610(-114);
        class519.method3070(117);
        class521.method3081(12456);
        class266.method1765((byte) 74);
        class35.method209(-1);
        class342.method2095((byte) -73);
        class339.method2074((byte) 107);
        class426.method2556(0);
        class183.method1268(-29927);
        class400.method2408((byte) -121);
        class264.method1756(-3672);
        class297.method1884((byte) -113);
        class381.method2327((byte) 116);
        class16.method112((byte) 76);
        class275.method1798(-15676);
        class133.method889(arg0 - 111);
        class451.method2721(true);
        class203.method1378(-1);
        class150.method987(arg0 ^ 0x60);
        class461.method2777(64);
        class301.method1902((byte) 108);
        class184.method1271((byte) -61);
        class517.method3047(9584);
        class117.method783(-111);
        class68.method402((byte) 96);
        class405.method2437(true);
        class114.method761(67);
        class201.method1361();
        class164.method1143(arg0 ^ 0x501);
        class82.method486(-100);
        class27.method165((byte) 55);
        class74.method423((byte) 120);
        class324.method2009((byte) 94);
        class99.method609((byte) -63);
        class187.method1288((byte) 122);
        class360.method2247();
        class460.method2763();
        class453.method2725(arg0 ^ 0xFFFFEC7D);
        class355.method2222(61);
        class362.method2257();
        class285.method1844(128);
        class158.method1012(127);
        class480.method2855(false);
        class149.method977(arg0 - 115);
        class23.method146(false);
        class321.method1993((byte) 126);
        class208.method1399(-513);
        class326.method2016(arg0 - 25114);
        class83.method494(false);
        class31.method181(false);
        class47.method297(arg0 + 11);
        class487.method2894(256);
        class140.method931(3);
        class367.method2279((byte) 58);
        class411.method2473((byte) 87);
        class464.method2789(-108);
        class163.method1129((byte) 92);
        class343.method2104(32768);
        class100.method617((byte) 78);
        class253.method1702((byte) -94);
        class104.method647(-1092);
        class322.method2000(31);
        class76.method429(-109);
        class407.method2444((byte) -110);
        class81.method481(32);
        class441.method2661(0);
        class80.method467(-1);
        class242.method1629(12);
        class12.method79((byte) 113);
        class440.method2652();
        class125.method834(8);
        class504.method3002(-115);
        class331.method2026(0);
        class225.method1531(82);
        class412.method2479(125);
        class500.method2991(0);
        class145.method959(false);
        class512.method3027(47);
        class115.method765((byte) -72);
        class3.method22(9179409);
        class168.method1168(-3078);
        class202.method1374(arg0 ^ 0xFFFFFFF1);
        class526.method3108(58);
        class335.method2046(-1);
        class419.method2515(arg0 + 4107);
        class185.method1273(arg0 + 139);
        class18.method117(75);
        class364.method2264(-8222);
        class522.method3096(false);
        class284.method1839(0);
        class377.method2313(3);
        class305.method1922(-52);
        class8.method48((byte) -81);
        class138.method919(20140);
        class462.method2785(0);
        class493.method2955(-111);
        class105.method651(-1);
        class404.method2432(-19026);
        class485.method2881(26);
        class299.method1895((byte) -74);
        class196.method1342((byte) -81);
        class410.method2472(arg0 ^ 0xA);
        class443.method2666((byte) 111);
        class57.method346(arg0 + 10);
        class106.method653((byte) -18);
        class229.method1573((byte) -84);
        class354.method2218(-1);
        class417.method2502((byte) 127);
        class51.method313(21072);
        class84.method495(-101);
        class39.method237((byte) -114);
        class200.method1359((byte) 83);
        class372.method2291(0);
        class283.method1826(arg0 + 124);
        class170.method1178(true);
        class151.method989((byte) 18);
        class458.method2744(-191);
        class65.method382((byte) 5);
        class393.method2389(24);
        class316.method1974();
        class52.method320(1);
        class255.method1704((byte) 127);
        class251.method1677(arg0 + 139);
        class511.method3024(arg0 - 23839);
        class361.method2252((byte) -36);
        class182.method1232((byte) -128);
        class235.method1599(false);
        class101.method619(1024);
        class287.method1850(15);
        class474.method2831(true);
        class91.method530(arg0 ^ 0xFFFFFFF4);
        class124.method830();
        class289.method1856((byte) -1);
        class22.method144(false);
        class179.method1219((byte) -24);
        class455.method2734(4);
        class465.method2792(123);
        class409.method2468((byte) -43);
        class219.method1516(arg0 ^ 0x74);
        class473.method2827(-17707);
        class44.method285(arg0 + 12);
        class120.method790(true);
        class2.method6((byte) -94);
        class350.method2201(true);
        class211.method1477(arg0 ^ 0xFFFFFFE7);
        class484.method2873(0);
        class306.method1927(16383);
        class141.method939(false);
        class90.method523((byte) 99);
        class61.method362(0);
        class448.method2706();
        if (arg0 != -11) {
            field2847 = null;
        }
        class340.method2079((byte) -128);
        class49.method303(arg0 ^ 0xFFFFFF9A);
        class383.method2338();
        class7.method43();
        class113.method754();
        class190.method1295(false);
        class87.method510((byte) 120);
        class379.method2321();
        class210.method1475(arg0 + 65);
        class525.method3103(false);
        class392.method2384(true);
        class479.method2854(53);
        class312.method1947(0);
        class206.method1390();
        class195.method1312(arg0 ^ 0xFFFC000A);
        class59.method355((byte) -102);
        class148.method976((byte) 89);
        class394.method2394((byte) 100);
        class385.method2355(118);
        class401.method2419(arg0 + 12);
        class85.method499(-124);
        class502.method2997((byte) -82);
        class75.method425(-1788807324);
        class378.method2317((byte) -113);
        class291.method1864(-12696);
        class333.method2028((byte) -111);
        class143.method948(571);
        class176.method1200((byte) 64);
        class431.method2569(arg0 - 101);
        class56.method342(false);
        class353.method2210(arg0 ^ 0xFFFFFFB8);
        class248.method1664(false);
        class349.method2125((byte) 113);
        class415.method2493(arg0 + 10);
        class403.method2426(arg0 - 103);
        class227.method1555((byte) 89);
        class530.method3131((byte) 48);
        class375.method2301((byte) -83);
        class77.method436(-2);
        class260.method1727(25173);
        class213.method1487(2);
        class279.method1820(0);
        class323.method2007((byte) 118);
        class374.method2299(126);
        class95.method549();
        class173.method1186(true);
        class356.method2223((byte) 76);
        class29.method171(false);
        class98.method602((byte) 108);
        class4.method24(19783);
        class463.method2786(-81);
        class241.method1626(257029100);
        class425.method2549((byte) -128);
        class444.method2672(0);
        class34.method190((byte) 89);
        class157.method1001(true);
        class272.method1787((byte) -31);
        class89.method521((byte) -80);
        class442.method2664(12);
        class60.method357(arg0 - 82);
        class318.method1986(arg0 ^ 0xFFFFFFEC);
        class508.method3008(-98);
        class9.method51(1);
        class26.method162(1);
        class294.method1869(-125);
        class457.method2741(73);
        class282.method1821(88);
        class257.method1711((byte) 64);
        class70.method407(16);
        class30.method173(false);
        class482.method2857(65280);
        class435.method2616(2);
        class45.method287(-756674292);
        class514.method3033(-1086042900);
        class366.method2271(-2);
        class258.method1717(false);
        class166.method1155(arg0 ^ 0x4E);
        class161.method1018();
        class112.method734();
        class437.method2624(-116);
        class459.method2750((byte) -81);
        class265.method1760((byte) 11);
        class146.method961(arg0 ^ 0xFFFF00F5);
        class25.method156(arg0 - 53);
        class499.method2990(64);
        class13.method83((byte) -74);
        class334.method2033(0);
        class363.method2262(105);
        class48.method299((byte) 94);
        class413.method2487(false);
        class438.method2632(true);
        class193.method1306(5199);
        class478.method2849(arg0 ^ 0x7885);
        class155.method998((byte) 115);
        class483.method2871((byte) -21);
        class220.method1522(-53);
        class418.method2509(-45);
        class180.method1223((byte) 54);
        class495.method2969((byte) -116);
        class456.method2740(-1);
        class445.method2675(arg0 + 12);
        class365.method2269(true);
        class386.method2358((byte) -124);
        class359.method2228((byte) -56);
        class131.method882(0);
        class523.method3098(-128);
        class46.method289(16);
        class186.method1282(770);
        class450.method2718((byte) 35);
        class290.method1859((byte) -16);
        class109.method672(arg0 + 10);
        class424.method2545(72);
        class397.method2400(false);
        class357.method2225(-26006);
        class307.method1932(arg0 + 13103);
        class223.method1529(arg0 ^ 0xFFFFF61A);
        class14.method90(-82);
        class221.method1524(38);
        class1.method3(true);
        class17.method114(320);
        class490.method2919(-24089);
        class24.method153((byte) -101);
        class94.method545(1);
        class509.method3012(-20557);
        class449.method2713(127);
        class147.method970(arg0 ^ 0xFFFFFFFD);
        class20.method133(95);
        class348.method2118(-11038);
        class139.method926((byte) 111);
        class41.method244(-98);
        class102.method621(123);
        class214.method1490(-31);
        class246.method1651((byte) 87);
        class320.method1990(0);
        class531.method3134((byte) -114);
        class303.method1905(250);
        class370.method2285((byte) 121);
        class62.method364(-1422875028);
        class325.method2013(arg0 + 10);
        class118.method785(true);
        class40.method240(-64);
        class132.method885((byte) 120);
        class233.method1590(108);
        class134.method892((byte) -111);
        class421.method2535(true);
        class159.method1014(29988);
        class302.method1903((byte) -96);
        class69.method406((byte) 95);
        class402.method2424((byte) 57);
        class310.method1943((byte) 77);
        class422.method2539((byte) 105);
        class390.method2370(false);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1321(int arg0) {
        int var1 = class74.field1105;
        int[] var2 = class272.field3948;
        int var3 = class289.field4157 ? var1 : class402.field6044 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class129 var5;
            if (var4 < var1) {
                var5 = class44.field707[var2[var4]];
            } else {
                var5 = class193.field2821[class378.field5766[var4 - var1]];
            }
            if (var5.field1768 == arg0) {
                var5.field1918 = 0;
                if (var5.field1913 < 0) {
                    var5.field1990 = false;
                } else {
                    int var6 = var5.method847(-1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1763 & 0x7F) != 0 || (var5.field1769 & 0x7F) != 0) {
                            var5.field1990 = false;
                            continue;
                        }
                    } else if ((var5.field1763 & 0x7F) != 64 || (var5.field1769 & 0x7F) != 64) {
                        var5.field1990 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1763 >> 7;
                        int var8 = var5.field1769 >> 7;
                        if (class397.field5963[var7][var8] != var5.field1913) {
                            var5.field1990 = true;
                            continue;
                        }
                        if (class468.field6902[var7][var8] > 1) {
                            var10002 = class468.field6902[var7][var8]--;
                            var5.field1990 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field1763 - var9 >> 7;
                        int var11 = var5.field1769 - var9 >> 7;
                        int var12 = var5.field1763 + var9 >> 7;
                        int var13 = var5.field1769 + var9 >> 7;
                        if (!class487.method2892(var5.field1913, var10, var11, var13, (byte) 86, var12)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class397.field5963[var14][var15] == var5.field1913) {
                                        var10002 = class468.field6902[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1990 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class239 && var5.field1993 != null && class317.field4559 >= var5.field1993.field2416 && class317.field4559 < var5.field1993.field2406) {
                        ((class239) var5).field3511 = false;
                    }
                    var5.field1990 = false;
                    var5.field1766 = class377.method2316(var5.field1769, false, var5.field1763, var5.field1768);
                    class114.method758(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1322() {
        int var0 = class74.field1105;
        int[] var1 = class272.field3948;
        boolean var2 = class426.field6401.field987 == 1 && var0 > 200 || class426.field6401.field987 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class239 var12 = class44.field707[var1[var3]];
            if (var12.method1618(-1)) {
                var12.method784(true);
                if (var12.field1762 >= 0 && var12.field1771 >= 0 && var12.field1770 < class30.field323 && var12.field1765 < class182.field2661) {
                    var12.field3511 = var12.field1963 ? var2 : false;
                    if (class500.field7365 == var12) {
                        var12.field1913 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field1990) {
                            var13++;
                        }
                        if (var12.field1958 > class317.field4559) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method847(-1) << 2);
                        if (var12.field3525) {
                            var14 += 512;
                        } else {
                            if (class252.field3739 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field1913 = var14 + 1;
                    }
                } else {
                    var12.field1913 = -1;
                }
            } else {
                var12.field1913 = -1;
            }
        }
        for (int var4 = 0; var4 < class402.field6044; var4++) {
            class167 var9 = class193.field2821[class378.field5766[var4]];
            if (var9.method1158(-1) && var9.field2472.method2085((byte) -19, class49.field796)) {
                var9.method784(true);
                if (var9.field1762 >= 0 && var9.field1771 >= 0 && var9.field1770 < class30.field323 && var9.field1765 < class182.field2661) {
                    int var10 = 0;
                    if (!var9.field1990) {
                        var10++;
                    }
                    if (var9.field1958 > class317.field4559) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method847(-1) << 2);
                    if (class252.field3739 == 0) {
                        if (var9.field2472.field4905) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class252.field3739 == 1) {
                        if (var9.field2472.field4905) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field2472.field4911) {
                        var11 += 1024;
                    } else if (!var9.field2472.field4925) {
                        var11 += 256;
                    }
                    var9.field1913 = var11 + 1;
                } else {
                    var9.field1913 = -1;
                }
            } else {
                var9.field1913 = -1;
            }
        }
        for (int var5 = 0; var5 < class409.field6169.length; var5++) {
            class308 var6 = class409.field6169[var5];
            if (var6 != null) {
                if (var6.field4436 == 1) {
                    class167 var7 = class193.field2821[var6.field4443];
                    if (var7 != null && var7.field1913 >= 0) {
                        var7.field1913 += 2048;
                    }
                } else if (var6.field4436 == 10) {
                    class239 var8 = class44.field707[var6.field4443];
                    if (var8 != null && class500.field7365 != var8 && var8.field1913 >= 0) {
                        var8.field1913 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1323() {
        int var0 = class74.field1105;
        int[] var1 = class272.field3948;
        int var2 = class289.field4157 ? var0 : class402.field6044 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class129 var4;
            if (var3 < var0) {
                var4 = class44.field707[var1[var3]];
            } else {
                var4 = class193.field2821[class378.field5766[var3 - var0]];
            }
            if (var4.field1913 >= 0) {
                int var5 = var4.method847(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1763 & 0x7F) == 0 && (var4.field1769 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field1763 & 0x7F) == 64 && (var4.field1769 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class239 && var4.field1993 != null && class317.field4559 >= var4.field1993.field2416 && class317.field4559 < var4.field1993.field2406) {
                    ((class239) var4).field3511 = false;
                }
                var4.field1766 = class377.method2316(var4.field1769, false, var4.field1763, var4.field1768);
                class114.method758(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1324(int arg0) {
        field2842++;
        if (!class426.field6401.field979) {
            for (int var2 = 0; var2 < class268.field3913; var2++) {
                if (class525.field7766[var2].method1658(255) == 's' || class525.field7766[var2].method1658(255) == 'S') {
                    class426.field6401.field979 = true;
                    break;
                }
            }
        }
        if (class459.field6791 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class256.method1708((byte) 118);
            if (class394.field5942 == 0L) {
                class394.field5942 = var5;
            }
            if (var4 > 16384 && (var5 - class394.field5942) < 5000L) {
                if ((var5 - class88.field1352) > 1000L) {
                    System.gc();
                    class88.field1352 = var5;
                }
                class420.field6324 = class491.field7282.method2838(false, class143.field2137);
                class228.field3367 = 5;
            } else {
                class420.field6324 = class444.field6612.method2838(false, class143.field2137);
                class228.field3367 = 5;
                class459.field6791 = 10;
            }
        } else if (class459.field6791 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class434.field6500[var7] = class11.method71(class30.field323, class182.field2661, (byte) 121);
            }
            class420.field6324 = class425.field6389.method2838(false, class143.field2137);
            class459.field6791 = 20;
            class228.field3367 = 10;
        } else if (class459.field6791 == 20) {
            if (class386.field5853 == null) {
                class386.field5853 = new class63(class62.field949, class81.field1222);
            }
            if (class386.field5853.method371(114)) {
                class150.field2234 = class474.method2830(false, 1, false, 0, true);
                class244.field3601 = class474.method2830(false, 1, false, 1, true);
                class434.field6497 = class474.method2830(false, 1, false, 2, true);
                class251.field3735 = class474.method2830(false, 1, false, 3, true);
                class65.field976 = class474.method2830(false, 1, false, 4, true);
                class132.field2035 = class474.method2830(true, 1, false, 5, true);
                class465.field6881 = class474.method2830(true, 1, false, 6, false);
                class195.field2835 = class474.method2830(false, 1, false, 7, true);
                class6.field81 = class474.method2830(false, 1, false, 8, true);
                class8.field117 = class474.method2830(false, 1, false, 9, true);
                class523.field7740 = class474.method2830(false, 1, false, 10, true);
                class151.field2253 = class474.method2830(false, 1, false, 11, true);
                class297.field4228 = class474.method2830(false, 1, false, 12, true);
                class105.field1522 = class474.method2830(false, 1, false, 13, true);
                class157.field2296 = class474.method2830(false, 1, false, 14, false);
                class6.field80 = class474.method2830(false, 1, false, 15, true);
                class267.field3907 = class474.method2830(false, 1, false, 16, true);
                class434.field6498 = class474.method2830(false, 1, false, 17, true);
                class159.field2353 = class474.method2830(false, 1, false, 18, true);
                class423.field6356 = class474.method2830(false, 1, false, 19, true);
                class495.field7325 = class474.method2830(false, 1, false, 20, true);
                field2847 = class474.method2830(false, 1, false, 21, true);
                class226.field3325 = class474.method2830(false, 1, false, 22, true);
                class277.field3994 = class474.method2830(true, 1, false, 23, true);
                class119.field1795 = class474.method2830(false, 1, false, 24, true);
                class148.field2203 = class474.method2830(false, 1, false, 25, true);
                class331.field4690 = class474.method2830(true, 1, false, 26, true);
                class354.field5453 = class474.method2830(false, 1, false, 27, true);
                class456.field6749 = class474.method2830(true, 1, false, 28, true);
                class37.field396 = class474.method2830(false, 1, false, 29, true);
                class420.field6324 = class43.field666.method2838(false, class143.field2137);
                class228.field3367 = 15;
                class459.field6791 = 30;
            } else {
                class420.field6324 = class435.field6506.method2838(false, class143.field2137);
                class228.field3367 = 12;
            }
        } else if (class459.field6791 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class326.field4650[var9].method1982(-1) * class431.field6448[var9] / 100;
            }
            if (var8 == 100) {
                class420.field6324 = class491.field7279.method2838(false, class143.field2137);
                class228.field3367 = 20;
                class523.method3099(class6.field81, (byte) 61);
                class513.method3029(94, class6.field81);
                class459.field6791 = 40;
            } else {
                if (var8 != 0) {
                    class420.field6324 = class134.field2053.method2838(false, class143.field2137) + var8 + "%";
                }
                class228.field3367 = 20;
            }
        } else if (class459.field6791 == 40) {
            if (class456.field6749.method2928(-22019)) {
                this.method1330(class456.field6749.method2944(1, 95), -64);
                class420.field6324 = class61.field925.method2838(false, class143.field2137);
                class228.field3367 = 25;
                class459.field6791 = 50;
            } else {
                class420.field6324 = class385.field5839.method2838(false, class143.field2137) + class456.field6749.method2921(40) + "%";
                class228.field3367 = 25;
            }
        } else if (class459.field6791 == 50) {
            class259.method1722((byte) -124);
            class420.field6324 = class531.field7823.method2838(false, class143.field2137);
            class228.field3367 = 30;
            class459.field6791 = 60;
        } else if (class459.field6791 == 60) {
            int var10 = class321.method1994((byte) -98, class6.field81, class105.field1522);
            int var11 = class434.method2614(6);
            if (var11 > var10) {
                class420.field6324 = class242.field3572.method2838(false, class143.field2137) + var10 * 100 / var11 + "%";
                class228.field3367 = 35;
            } else {
                class420.field6324 = class9.field120.method2838(false, class143.field2137);
                class228.field3367 = 35;
                class459.field6791 = 70;
            }
        } else if (class459.field6791 == 70) {
            int var12 = class369.method2284(class6.field81, -1);
            int var13 = class390.method2372(-118);
            if (var13 > var12) {
                class420.field6324 = class340.field4855.method2838(false, class143.field2137) + var12 * 100 / var13 + "%";
                class228.field3367 = 40;
            } else {
                class420.field6324 = class102.field1470.method2838(false, class143.field2137);
                class228.field3367 = 40;
                class459.field6791 = 80;
            }
        } else if (arg0 <= -88) {
            if (class459.field6791 == 80) {
                if (class331.field4690.method2928(-22019)) {
                    class109.field1563 = new class149(class331.field4690, class8.field117, class6.field81);
                    class420.field6324 = class266.field3892.method2838(false, class143.field2137);
                    class459.field6791 = 90;
                    class228.field3367 = 45;
                } else {
                    class420.field6324 = class225.field3300.method2838(false, class143.field2137) + class331.field4690.method2921(57) + "%";
                    class228.field3367 = 45;
                }
            } else if (class459.field6791 == 90) {
                class420.field6324 = class74.field1091.method2838(false, class143.field2137);
                class459.field6791 = 95;
                class228.field3367 = 50;
            } else if (class459.field6791 == 95) {
                if (class426.field6401.field979) {
                    class426.field6401.field1002 = 0;
                    class426.field6401.field982 = 0;
                    class426.field6401.field1001 = 0;
                    class426.field6401.field994 = 0;
                    class426.field6401.field991 = 1;
                }
                class426.field6401.field979 = true;
                class426.field6401.method2523(class483.field7077, -48);
                class88.method513(-74, false, class426.field6401.field994);
                class420.field6324 = class134.field2047.method2838(false, class143.field2137);
                class228.field3367 = 55;
                class459.field6791 = 100;
            } else if (class459.field6791 == 100) {
                class517.method3045(class348.field5015, class6.field81, class105.field1522, -39);
                class420.field6324 = class521.field7720.method2838(false, class143.field2137);
                class228.field3367 = 60;
                class11.method76(false, 5);
                class459.field6791 = 110;
            } else if (class459.field6791 == 110) {
                class434.field6497.method2928(-22019);
                byte var14 = 0;
                int var15 = var14 + class434.field6497.method2921(50);
                class267.field3907.method2928(-22019);
                int var16 = var15 + class267.field3907.method2921(46);
                class434.field6498.method2928(-22019);
                int var17 = var16 + class434.field6498.method2921(46);
                class159.field2353.method2928(-22019);
                int var18 = var17 + class159.field2353.method2921(42);
                class423.field6356.method2928(-22019);
                int var19 = var18 + class423.field6356.method2921(115);
                class495.field7325.method2928(-22019);
                int var20 = var19 + class495.field7325.method2921(121);
                field2847.method2928(-22019);
                int var21 = var20 + field2847.method2921(99);
                class226.field3325.method2928(-22019);
                int var22 = var21 + class226.field3325.method2921(48);
                class119.field1795.method2928(-22019);
                int var23 = var22 + class119.field1795.method2921(117);
                class148.field2203.method2928(-22019);
                int var24 = var23 + class148.field2203.method2921(116);
                class354.field5453.method2928(-22019);
                int var25 = var24 + class354.field5453.method2921(85);
                class37.field396.method2928(-22019);
                int var26 = var25 + class37.field396.method2921(96);
                if (var26 < 1200) {
                    class420.field6324 = class24.field256.method2838(false, class143.field2137) + var26 / 12 + "%";
                    class228.field3367 = 65;
                } else {
                    class381.field5778 = new class86(class183.field2707, class143.field2137, class434.field6497);
                    class45.field717 = new class277(class183.field2707, class143.field2137, class434.field6497);
                    class26.field282 = new class37(class183.field2707, class143.field2137, class434.field6497, class6.field81);
                    class463.field6858 = new class154(class183.field2707, class143.field2137, class434.field6498);
                    class335.field4729 = new class268(class183.field2707, class143.field2137, class434.field6497);
                    class493.field7291 = new class245(class183.field2707, class143.field2137, class434.field6497);
                    class456.field6745 = new class67(class183.field2707, class143.field2137, class434.field6497, class195.field2835);
                    class514.field7512 = new class468(class183.field2707, class143.field2137, class434.field6497);
                    class449.field6685 = new class64(class183.field2707, class143.field2137, class434.field6497);
                    class252.field3743 = new class447(class183.field2707, class143.field2137, true, class267.field3907, class195.field2835);
                    class14.field176 = new class93(class183.field2707, class143.field2137, class434.field6497, class6.field81);
                    class57.field872 = new class177(class183.field2707, class143.field2137, class434.field6497, class6.field81);
                    class431.field6451 = new class261(class183.field2707, class143.field2137, true, class159.field2353, class195.field2835);
                    class294.field4196 = new class78(class183.field2707, class143.field2137, true, class381.field5778, class423.field6356, class195.field2835);
                    class140.field2104 = new class108(class183.field2707, class143.field2137, class434.field6497);
                    class84.field1295 = new class172(class183.field2707, class143.field2137, class495.field7325, class150.field2234, class244.field3601);
                    class77.field1154 = new class382(class183.field2707, class143.field2137, class434.field6497);
                    class515.field7515 = new class391(class183.field2707, class143.field2137, class434.field6497);
                    class512.field7494 = new class454(class183.field2707, class143.field2137, field2847, class195.field2835);
                    class91.field1368 = new class238(class183.field2707, class143.field2137, class434.field6497);
                    class184.field2745 = new class380(class183.field2707, class143.field2137, class434.field6497);
                    class317.field4554 = new class477(class183.field2707, class143.field2137, class434.field6497);
                    class64.field961 = new class515(class183.field2707, class143.field2137, class226.field3325);
                    class377.field5753 = new class250(class183.field2707, class143.field2137, class434.field6497);
                    class170.method1175(class105.field1522, (byte) 100, class251.field3735, class195.field2835, class6.field81);
                    class391.method2375(-1520110140, class37.field396);
                    class105.field1524 = new class191(class143.field2137, class119.field1795, class148.field2203);
                    class169.field2507 = new class471(class143.field2137, class119.field1795, class148.field2203, new class81());
                    class420.field6324 = class14.field180.method2838(false, class143.field2137);
                    class228.field3367 = 65;
                    class29.method169(101);
                    class252.field3743.method2688((byte) 98, !class426.field6401.method2532(1, class170.field2529));
                    class49.field796 = new class178();
                    class411.method2475(-80);
                    class141.method938(class354.field5453, (byte) -28);
                    class293.method1865(class195.field2835, class109.field1563, -120);
                    class459.field6791 = 120;
                }
            } else if (class459.field6791 == 120) {
                int var27 = class437.method2629((byte) 88, class6.field81);
                int var28 = class459.method2749(16);
                if (var28 > var27) {
                    class420.field6324 = class38.field557.method2838(false, class143.field2137) + var27 * 100 / var28 + "%";
                    class228.field3367 = 70;
                } else {
                    class284.method1840(-86, class6.field81, class348.field5015);
                    class116.method773(116, class167.field2476);
                    class420.field6324 = class517.field7538.method2838(false, class143.field2137);
                    class459.field6791 = 130;
                    class228.field3367 = 70;
                }
            } else if (class459.field6791 == 130) {
                if (class523.field7740.method2931("huffman", "", 0)) {
                    class504 var29 = new class504(class523.field7740.method2946("", "huffman", false));
                    class8.method47(-126, var29);
                    class420.field6324 = class187.field2782.method2838(false, class143.field2137);
                    class228.field3367 = 75;
                    class459.field6791 = 140;
                } else {
                    class420.field6324 = class145.field2150.method2838(false, class143.field2137) + "0%";
                    class228.field3367 = 75;
                }
            } else if (class459.field6791 == 140) {
                if (class251.field3735.method2928(-22019)) {
                    class420.field6324 = class85.field1309.method2838(false, class143.field2137);
                    class459.field6791 = 150;
                    class228.field3367 = 80;
                } else {
                    class420.field6324 = class47.field762.method2838(false, class143.field2137) + class251.field3735.method2921(115) + "%";
                    class228.field3367 = 80;
                }
            } else if (class459.field6791 == 150) {
                if (class297.field4228.method2928(-22019)) {
                    class420.field6324 = class157.field2295.method2838(false, class143.field2137);
                    class459.field6791 = 160;
                    class228.field3367 = 82;
                } else {
                    class420.field6324 = class83.field1282.method2838(false, class143.field2137) + class297.field4228.method2921(108) + "%";
                    class228.field3367 = 82;
                }
            } else if (class459.field6791 == 160) {
                if (class105.field1522.method2928(-22019)) {
                    class420.field6324 = class517.field7541.method2838(false, class143.field2137);
                    class228.field3367 = 85;
                    class459.field6791 = 170;
                } else {
                    class420.field6324 = class517.field7541.method2838(false, class143.field2137) + class105.field1522.method2921(76) + "%";
                    class228.field3367 = 85;
                }
            } else if (class459.field6791 == 170) {
                if (class277.field3994.method2925(4, "details")) {
                    class460.method2771(class277.field3994, class335.field4729, class493.field7291, class252.field3743, class14.field176, class57.field872, class49.field796);
                    class420.field6324 = class80.field1200.method2838(false, class143.field2137);
                    class228.field3367 = 89;
                    class459.field6791 = 180;
                } else {
                    class420.field6324 = class356.field5473.method2838(false, class143.field2137) + class277.field3994.method2938(0, "details") + "%";
                    class228.field3367 = 87;
                }
            } else if (class459.field6791 == 180) {
                int var30 = class419.method2517(1000);
                if (var30 == -1) {
                    class420.field6324 = class317.field4531.method2838(false, class143.field2137);
                    class228.field3367 = 90;
                } else if (var30 == 7 || var30 == 9) {
                    this.method1567("worldlistfull", (byte) 113);
                    class11.method76(false, 1000);
                } else if (class76.field1131) {
                    class420.field6324 = class445.field6623.method2838(false, class143.field2137);
                    class228.field3367 = 90;
                    class459.field6791 = 190;
                } else {
                    this.method1567("worldlistio_" + var30, (byte) 113);
                    class11.method76(false, 1000);
                }
            } else if (class459.field6791 == 190) {
                class35.field371 = new String[class184.field2745.field5773];
                class146.field2173 = new int[class317.field4554.field7009];
                class436.field6519 = new boolean[class317.field4554.field7009];
                for (int var31 = 0; var31 < class317.field4554.field7009; var31++) {
                    if (class317.field4554.method2843((byte) 127, var31).field3818 == 0) {
                        class436.field6519[var31] = true;
                        class323.field4627++;
                    }
                    class146.field2173[var31] = -1;
                }
                class419.method2514(29472);
                class269.field3922 = class251.field3735.method2940("loginscreen", false);
                class132.field2035.method2923(true, true, false);
                class465.field6881.method2923(true, true, true);
                class6.field81.method2923(true, true, true);
                class105.field1522.method2923(true, true, true);
                class523.field7740.method2923(true, true, true);
                class251.field3735.method2923(true, true, true);
                class434.field6497.field7271 = 2;
                class329.field4683 = true;
                class434.field6498.field7271 = 2;
                class267.field3907.field7271 = 2;
                class159.field2353.field7271 = 2;
                class423.field6356.field7271 = 2;
                class495.field7325.field7271 = 2;
                field2847.field7271 = 2;
                class407.method2447(-1, false, class426.field6401.field991, -1, (byte) -49);
                class420.field6324 = class168.field2494.method2838(false, class143.field2137);
                class228.field3367 = 95;
                class459.field6791 = 200;
            } else if (class459.field6791 == 200) {
                class500.method2992(true, false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1325(int arg0) {
        field2844++;
        if (class193.field2832 == 1000) {
            return;
        }
        class317.field4559++;
        if (class317.field4559 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class107.field1548 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class402.field6052.setSeed((long) class107.field1548);
        }
        if ((class317.field4559 % 50) == 0) {
            class478.field7027 = class476.field7003;
            class436.field6520 = class259.field3813;
            class476.field7003 = 0;
            class259.field3813 = 0;
        }
        this.method1317((byte) -98);
        if (class386.field5853 != null) {
            class386.field5853.method370(0);
        }
        class308.method1941(-10304);
        class162.field2368.method1353(arg0 ^ arg0);
        class54.field838.method1745(67);
        if (class450.field6709 != null) {
            int var3 = class450.field6709.method34(7581);
            class244.field3594 = var3;
        }
        if (class348.field5015 != null) {
            class348.field5015.method1035((int) class256.method1708((byte) 118));
        }
        class436.method2618((byte) -80);
        class268.field3913 = 0;
        for (class246 var4 = class162.field2368.method1350(128); var4 != null && class268.field3913 < 128; var4 = class162.field2368.method1350(128)) {
            if (var4.method1656((byte) 25) != 1) {
                char var5 = var4.method1658(255);
                if (!class200.method1360(17952) || var5 != '`' && var5 != '§') {
                    class525.field7766[class268.field3913] = var4;
                    class268.field3913++;
                } else if (class31.method180(false)) {
                    class141.method937(false);
                } else {
                    class252.method1698((byte) -95);
                }
            }
        }
        for (class320 var6 = class54.field838.method1752(118); var6 != null; var6 = class54.field838.method1752(21)) {
            int var7 = var6.method239(-47);
            if (var7 == -1) {
                class375.field5727.method809(var6, false);
            } else if (class183.method1244(var7, (byte) -101)) {
                class111.field1597.method809(var6, false);
            }
            if (class111.field1597.method810(false) > 10) {
                class111.field1597.method815(arg0 ^ 0xFFFFCEE2);
            }
        }
        if (class31.method180(false)) {
            class248.method1662(false);
        }
        if (class193.field2832 == 0) {
            this.method1324(-99);
            class457.method2742(arg0 ^ 0x3167);
        } else if (class193.field2832 == 5) {
            this.method1324(-120);
            class457.method2742(0);
        } else if (class193.field2832 == 25 || class193.field2832 == 28) {
            class391.method2378(-1);
        }
        if (class193.field2832 == 10) {
            this.method1332(arg0 - 12645);
            class314.method1960(true);
            class268.method1770(true);
            class104.method645(7);
        } else if (class193.field2832 == 30) {
            class49.method307(arg0 - 3788);
        } else if (class193.field2832 == 40) {
            class104.method645(7);
            if (class80.field1217 != -3 && class80.field1217 != 2 && class80.field1217 != 15) {
                class246.method1653(arg0 - 17195);
            }
        }
        class393.method2387(class348.field5015, true);
        class111.field1597.method815(arg0 ^ 0xFFFFCEE7);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1326(boolean arg0) {
        field2841++;
        if (arg0) {
            method1339(null);
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class248.method1667(-124);
        class81.field1222 = new class165(class483.field7077);
        class62.field949 = new class43();
        if (class447.field6662 != class125.field1890) {
            class241.field3567 = new byte[50][];
        }
        class426.field6401 = new class420(class483.field7077);
        if (class447.field6662 == class125.field1890) {
            class375.field5717 = this.getCodeBase().getHost();
            class257.field3800 = 443;
            class323.field4625 = 43594;
        } else if (class323.method2004((byte) -78, class447.field6662)) {
            class375.field5717 = this.getCodeBase().getHost();
            class323.field4625 = class40.field588 + 40000;
            class257.field3800 = class40.field588 + 50000;
        } else if (class482.field7063 == class447.field6662) {
            class257.field3800 = class40.field588 + 50000;
            class375.field5717 = "127.0.0.1";
            class323.field4625 = class40.field588 + 40000;
        }
        class241.field3566 = class257.field3800;
        class285.field4101 = class375.field5717;
        class484.field7104 = class323.field4625;
        class64.field965 = class323.field4625;
        if (class359.field5513 == class183.field2707) {
            class4.field52 = class526.field7786;
            class241.field3562 = 16777215;
            class263.field3856 = class463.field6857;
            class389.field5870 = true;
            class26.field279 = 0;
            class68.field1041 = class138.field2080;
            class150.field2236 = class167.field2468;
        } else {
            class263.field3856 = class31.field332;
            class150.field2236 = class308.field4432;
            class4.field52 = class76.field1121;
            class68.field1041 = class143.field2143;
        }
        class499.field7358 = class484.field7104;
        if (class432.field6459 == 3) {
            class102.field1474 = class40.field588;
        }
        class210.field3061 = class394.field5939 = class371.field5671 = class371.field5669 = new short[256];
        class162.field2368 = class404.method2431(63, class364.field5570);
        class54.field838 = class59.method351(class364.field5570, arg0, true);
        class450.field6709 = class447.method2685(-112);
        if (class450.field6709 != null) {
            class450.field6709.method33(arg0, class364.field5570);
        }
        class57.field877 = class432.field6459;
        try {
            if (class483.field7077.field6458 != null) {
                class23.field252 = new class494(class483.field7077.field6458, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class118.field1786[var3] = new class494(class483.field7077.field6455[var3], 6000, 0);
                }
                class199.field2886 = new class494(class483.field7077.field6464, 6000, 0);
                class289.field4159 = new class135(255, class23.field252, class199.field2886, 500000);
                class225.field3299 = new class494(class483.field7077.field6469, 24, 0);
                class483.field7077.field6469 = null;
                class483.field7077.field6458 = null;
                class483.field7077.field6464 = null;
                class483.field7077.field6455 = null;
            }
        } catch (IOException var4) {
            class225.field3299 = null;
            class23.field252 = null;
            class289.field4159 = null;
            class199.field2886 = null;
        }
        if (class447.field6662 != class125.field1890) {
            class390.field5883 = true;
        }
        class197.field2873 = (class26.field273 == class183.field2707 ? class3.field44 : class415.field6233).method2838(arg0, class143.field2137);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1327(int arg0) {
        field2852++;
        for (int var1 = arg0; var1 < class402.field6044; var1++) {
            int var2 = class378.field5766[var1];
            class167 var3 = class193.field2821[var2];
            if (var3 != null) {
                class199.method1354(arg0 - 99, var3, var3.field2472.field4881);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lvg;)Lfs;")
    public static final class387 method1328(class38 arg0) {
        class387 var1 = (class387) class251.field3713.method2605(false, ((long) arg0.field467 << 32) + (long) arg0.field547);
        return var1 == null ? arg0.field399 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1329() {
        for (int var0 = 0; var0 < class30.field323; var0++) {
            int[] var1 = class397.field5963[var0];
            for (int var2 = 0; var2 < class182.field2661; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method1330(byte[] arg0, int arg1) {
        if (arg1 > -4) {
            this.method1331(4, (byte) -26);
        }
        field2840++;
        class209 var3 = new class209(arg0);
        while (true) {
            int var4;
            label49: do {
                while (true) {
                    while (true) {
                        var4 = var3.method1428(32122);
                        if (var4 == 0) {
                            return;
                        }
                        if (var4 == 1) {
                            int[] var9 = class203.field2928 = new int[6];
                            var9[0] = var3.method1450((byte) 62);
                            var9[1] = var3.method1450((byte) 98);
                            var9[2] = var3.method1450((byte) 119);
                            var9[3] = var3.method1450((byte) 81);
                            var9[4] = var3.method1450((byte) 67);
                            var9[5] = var3.method1450((byte) 28);
                        } else {
                            if (var4 != 4) {
                                continue label49;
                            }
                            int var7 = var3.method1428(32122);
                            class123.field1865 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                class123.field1865[var8] = var3.method1450((byte) 114);
                                if (class123.field1865[var8] == 65535) {
                                    class123.field1865[var8] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var4 != 5);
            int var5 = var3.method1428(32122);
            class220.field3238 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class220.field3238[var6] = var3.method1450((byte) 28);
                if (class220.field3238[var6] == 65535) {
                    class220.field3238[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1331(int arg0, byte arg1) {
        class333.field4695 = null;
        class62.field949.field675++;
        int var3 = -30 % ((arg1 - 45) / 52);
        class475.field6990 = null;
        class62.field949.field674 = arg0;
        field2848++;
        class453.field6719 = 0;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1332(int arg0) {
        class500.field7364++;
        field2846++;
        class429.method2561(-1, -1, 27711, null);
        class287.method1852(-1, -1, true, null);
        class484.method2872(1);
        class99.field1453++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class167 var12 = class193.field2821[var2];
            if (var12 != null) {
                byte var13 = var12.field2472.field4921;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method847(arg0 - 3);
                    if ((var13 & 0x2) != 0 && var12.field2000 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field1997[0] + var15;
                            int var18 = var12.field1996[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class30.field323 - var14 - 1) {
                                var17 = class30.field323 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class182.field2661 - var14 - 1)) {
                                var18 = class182.field2661 - var14 - 1;
                            }
                            int var19 = class190.method1296(-1, var12.field1997[0], var17, 0, class150.field2231, var12.field1996[0], var18, class434.field6500[var12.field1768], class157.field2288, true, var14, (byte) -96, var14, 0, var14);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field1997[var20] = class150.field2231[var19 - var20 - 1];
                                    var12.field1996[var20] = class157.field2288[var19 - var20 - 1];
                                    var12.field2003[var20] = 1;
                                }
                                var12.field2000 = var19;
                            }
                        }
                    }
                    class168.method1166(true, var12, (byte) 111);
                    int var21 = class421.method2534(-1, var12);
                    class509.method3015(class308.field4439, class348.field5014, var12, var21, false);
                    class169.method1172(var12, -1);
                }
            }
        }
        if (class242.field3573 == 0 && class90.field1360 == 0) {
            if (class140.field2103 == 2) {
                class187.method1287(16384);
            } else {
                class305.method1923((byte) -119);
            }
            if ((class24.field258 >> 7) < 14 || class30.field323 - 14 <= class24.field258 >> 7 || class260.field3827 >> 7 < 14 || (class182.field2661 - 14) <= (class260.field3827 >> 7)) {
                class125.method833(-5564);
            }
        }
        while (true) {
            class168 var3;
            class38 var4;
            class38 var5;
            do {
                var3 = (class168) class199.field2883.method815(-120);
                if (var3 == null) {
                    while (true) {
                        class168 var6;
                        class38 var7;
                        class38 var8;
                        do {
                            var6 = (class168) class147.field2178.method815(-125);
                            if (var6 == null) {
                                while (true) {
                                    class168 var9;
                                    class38 var10;
                                    class38 var11;
                                    do {
                                        var9 = (class168) class163.field2396.method815(arg0 ^ 0xFFFFFF87);
                                        if (var9 == null) {
                                            if (class283.field4065 != null) {
                                                class51.method314(-124);
                                            }
                                            if (arg0 != 2) {
                                                field2843 = null;
                                            }
                                            if ((class317.field4559 % 1500) == 0) {
                                                class490.method2917(true);
                                            }
                                            class322.method1998(false);
                                            if (class394.field5938 && (class256.method1708((byte) 118) - 60000L) > class84.field1294) {
                                                class352.method2206(true);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2488;
                                        if (var10.field547 < 0) {
                                            break;
                                        }
                                        var11 = class149.method979((byte) -111, var10.field480);
                                    } while (var11 == null || var11.field452 == null || var11.field452.length <= var10.field547 || var11.field452[var10.field547] != var10);
                                    class360.method2238(var9);
                                }
                            }
                            var7 = var6.field2488;
                            if (var7.field547 < 0) {
                                break;
                            }
                            var8 = class149.method979((byte) -120, var7.field480);
                        } while (var8 == null || var8.field452 == null || var7.field547 >= var8.field452.length || var8.field452[var7.field547] != var7);
                        class360.method2238(var6);
                    }
                }
                var4 = var3.field2488;
                if (var4.field547 < 0) {
                    break;
                }
                var5 = class149.method979((byte) -73, var4.field480);
            } while (var5 == null || var5.field452 == null || var5.field452.length <= var4.field547 || var5.field452[var4.field547] != var4);
            class360.method2238(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lvg;)Z")
    public static final boolean method1333(class38 arg0) {
        if (class187.field2783) {
            if (method1328(arg0).field5858 != 0) {
                return false;
            }
            if (arg0.field492 == 0) {
                return false;
            }
        }
        return arg0.field459;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1334(byte arg0) {
        field2859++;
        if (class193.field2832 == 1000) {
            return;
        }
        long var2 = class32.method187(125) / 1000000L - class447.field6670;
        class447.field6670 = class32.method187(126) / 1000000L;
        boolean var4 = class444.method2673((byte) -12);
        if (var4 && class104.field1515 && class35.field368 != null) {
            class35.field368.method2410((byte) 5);
        }
        if (class193.field2832 == 30 || class193.field2832 == 10) {
            if (class259.field3819 != 0L && class256.method1708((byte) 118) > class259.field3819) {
                class407.method2447(class426.field6401.field1000, false, class14.method89(false), class426.field6401.field1026, (byte) -49);
            } else if (!class348.field5015.method1096() && class291.field4174) {
                class195.method1311(-126);
            }
        }
        if (class82.field1255 == null) {
            Container var5;
            if (class214.field3119 == null) {
                var5 = class483.field7077.field6462;
            } else {
                var5 = class214.field3119;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class214.field3119 == var5) {
                Insets var8 = class214.field3119.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class293.field4195 != var6 || class453.field6721 != var7) {
                if (class348.field5015 == null || class348.field5015.method1097()) {
                    class248.method1667(-125);
                } else {
                    class293.field4195 = var6;
                    class453.field6721 = var7;
                }
                class259.field3819 = class256.method1708((byte) 118) + 500L;
            }
        }
        if (class82.field1255 != null && !class521.field7697 && (class193.field2832 == 30 || class193.field2832 == 10)) {
            class407.method2447(-1, false, class426.field6401.field991, -1, (byte) -49);
        }
        boolean var9 = false;
        if (class155.field2286) {
            class155.field2286 = false;
            var9 = true;
        }
        if (var9) {
            class150.method988(2056);
        }
        if (class348.field5015 != null && class348.field5015.method1096() || class14.method89(false) != 1) {
            class377.method2315(false);
        }
        int var10 = -32 % ((arg0 + 14) / 62);
        if (class193.field2832 == 0) {
            class390.method2371(class255.field3784[class412.field6196], class210.field3056[class412.field6196], class3.field45[class412.field6196], var9, class420.field6324, 92, class228.field3367);
        } else if (class193.field2832 == 5) {
            class50.method309(class294.field4202, class210.field3056[class412.field6196].getRGB(), class255.field3784[class412.field6196].getRGB(), false, class348.field5015, class3.field45[class412.field6196].getRGB(), var9 | class348.field5015.method1096());
        } else if (class193.field2832 == 10) {
            class301.method1900((byte) 41);
        } else if (class193.field2832 == 25 || class193.field2832 == 28) {
            if (class11.field143 == 1) {
                if (class119.field1797 > class282.field4034) {
                    class282.field4034 = class119.field1797;
                }
                int var12 = (class282.field4034 - class119.field1797) * 50 / class282.field4034;
                class183.method1254(94, class147.field2181, class237.field3490.method2838(false, class143.field2137) + "<br>(" + var12 + "%)", true);
            } else if (class11.field143 == 2) {
                if (class37.field395 > class418.field6282) {
                    class418.field6282 = class37.field395;
                }
                int var11 = ((class418.field6282 - class37.field395) * 50 / class418.field6282) + 50;
                class183.method1254(65, class147.field2181, class237.field3490.method2838(false, class143.field2137) + "<br>(" + var11 + "%)", true);
            } else {
                class183.method1254(76, class147.field2181, class237.field3490.method2838(false, class143.field2137), true);
            }
        } else if (class193.field2832 == 30) {
            class420.method2522(var2, -8137);
        } else if (class193.field2832 == 40) {
            class183.method1254(98, class147.field2181, class484.field7103.method2838(false, class143.field2137) + "<br>" + class512.field7490.method2838(false, class143.field2137), true);
        }
        if (class172.field2540 == 3) {
            for (int var13 = 0; var13 < class446.field6641; var13++) {
                Rectangle var14 = class125.field1885[var13];
                if (class16.field183[var13]) {
                    class348.field5015.method1087(var14.y, var14.x, 117, var14.height, -1996553985, var14.width);
                } else if (class343.field4944[var13]) {
                    class348.field5015.method1087(var14.y, var14.x, 125, var14.height, -1996554240, var14.width);
                }
            }
        }
        if (class31.method180(false)) {
            class38.method230(-16, class348.field5015);
        }
        if ((class193.field2832 == 30 || class193.field2832 == 10) && class172.field2540 == 0 && class14.method89(false) == 1 && !var9 && class432.field6457.equals("1.1")) {
            int var15 = 0;
            for (int var16 = 0; var16 < class446.field6641; var16++) {
                if (class343.field4944[var16]) {
                    class343.field4944[var16] = false;
                    class17.field186[var15++] = class125.field1885[var16];
                }
            }
            class348.field5015.method1080(class17.field186, var15);
        } else if (class193.field2832 != 0) {
            class348.field5015.method1019();
            for (int var17 = 0; var17 < class446.field6641; var17++) {
                class343.field4944[var17] = false;
            }
        }
        if (class426.field6401.field1007 == 0) {
            class246.method1659((byte) 117, 15L);
        } else if (class426.field6401.field1007 == 1) {
            class246.method1659((byte) 117, 10L);
        } else if (class426.field6401.field1007 == 2) {
            class246.method1659((byte) 117, 5L);
        } else if (class426.field6401.field1007 == 3) {
            class246.method1659((byte) 117, 2L);
        }
        if (class329.field4683) {
            class135.method896(6);
        }
        if (class426.field6401.field979 && class193.field2832 == 10 && class6.field79 != -1) {
            class426.field6401.field979 = false;
            class426.field6401.method2523(class483.field7077, -118);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1335() {
        class68.field1040 = 0;
        for (int var0 = 0; var0 < class402.field6044; var0++) {
            class167 var1 = class193.field2821[class378.field5766[var0]];
            if (var1.field1990 && var1.method852((byte) 75) != -1) {
                int var2 = (var1.method847(-1) - 1) * 64 + 60;
                int var3 = var1.field1763 - var2 >> 7;
                int var4 = var1.field1769 - var2 >> 7;
                class129 var5 = class52.method323(var4, var3, var1.field1768, -92);
                if (var5 != null) {
                    int var6 = var5.field1942;
                    if (var5 instanceof class167) {
                        var6 += 2048;
                    }
                    if (var5.field1918 == 0 && var5.method852((byte) 75) != -1) {
                        class420.field6323[class68.field1040] = var6;
                        class159.field2350[class68.field1040] = var6;
                        class68.field1040++;
                        var5.field1918++;
                    }
                    class420.field6323[class68.field1040] = var6;
                    class159.field2350[class68.field1040] = var1.field1942 + 2048;
                    class68.field1040++;
                    var5.field1918++;
                }
            }
        }
        class25.method158(class159.field2350, class68.field1040 - 1, 1, 0, class420.field6323);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2853++;
        if (!this.method1557(-1)) {
            return;
        }
        class40.field588 = Integer.parseInt(this.getParameter("worldid"));
        class447.field6662 = class239.method1614(Integer.parseInt(this.getParameter("modewhere")), 98);
        if (!class323.method2004((byte) -78, class447.field6662) && class447.field6662 != class125.field1890) {
            class447.field6662 = class125.field1890;
        }
        class455.field6742 = class18.method118(Integer.parseInt(this.getParameter("modewhat")), true);
        if (class455.field6742 != class266.field3896 && class493.field7289 != class455.field6742 && class455.field6742 != class301.field4264) {
            class455.field6742 = class301.field4264;
        }
        try {
            class143.field2137 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class143.field2137 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class398.field5967 = true;
        } else {
            class398.field5967 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class186.field2765 = true;
        } else {
            class186.field2765 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class3.field43 = true;
        } else {
            class3.field43 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class183.field2707 = class359.field5513;
        } else {
            class183.field2707 = class26.field273;
        }
        try {
            class159.field2357 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class159.field2357 = 0;
        }
        class177.field2613 = this.getParameter("quiturl");
        class465.field6885 = this.getParameter("settings");
        if (class465.field6885 == null) {
            class465.field6885 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class363.field5568 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class363.field5568 = 0;
            }
        }
        class412.field6196 = Integer.parseInt(this.getParameter("colourid"));
        if (class412.field6196 < 0 || class412.field6196 >= class3.field45.length) {
            class412.field6196 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class245.field3617 = true;
            class31.field341 = true;
        }
        class436.field6522 = this;
        if (class26.field273 == class183.field2707) {
            class149.field2204 = 503;
            class365.field5579 = 765;
        } else if (class359.field5513 == class183.field2707) {
            class149.field2204 = 480;
            class365.field5579 = 640;
        }
        this.method1566(589, class365.field5579, class455.field6742.method2404((byte) 65) + 32, class149.field2204, (byte) 104);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)[Lri;")
    public static final class73[] method1336(byte arg0) {
        field2850++;
        if (arg0 != 89) {
            method1333(null);
        }
        return new class73[] { class229.field3417, class12.field154, class234.field3466, class138.field2083, class111.field1577, class166.field2447, class143.field2133, class315.field4497, class252.field3757, class482.field7071, class22.field233, class179.field2635, class475.field6991, class301.field4265, class108.field1556, class441.field6591, class512.field7491, class490.field7238, class141.field2115, class37.field390, class227.field3360, class31.field340, class228.field3398, class108.field1549, class242.field3571, class310.field4452, class41.field605, class117.field1767, class278.field4013, class322.field4614, class405.field6116, class99.field1451, class231.field3445, class431.field6449, class29.field303, class334.field4709, class141.field2118, class335.field4726, class199.field2887, class148.field2198, class106.field1528, class39.field571, class494.field7307, class287.field4113, class68.field1036, class443.field6601, class246.field3625, class184.field2743, class41.field615, class421.field6335, class148.field2186, class196.field2865, class84.field1292, class334.field4714, class138.field2073, class56.field858, class321.field4584, class326.field4646, class4.field48, class31.field334, class425.field6390, class431.field6444, class335.field4716, class361.field5552, class73.field1085, class407.field6137, class511.field7476, class465.field6882, class42.field632, class173.field2555, class420.field6322, class139.field2087, class92.field1375, class108.field1560, class415.field6235, class221.field3280, class329.field4674, class353.field5401, class331.field4687, class25.field265, class456.field6748, class334.field4705, class225.field3303, class289.field4155, class40.field587, class397.field5958, class251.field3733, class119.field1799, class525.field7771, class229.field3427, class79.field1190, class39.field573, class380.field5774, class301.field4262, class321.field4603, class333.field4694, class385.field5836, class464.field6876, class133.field2045, class484.field7105, class471.field6936, class69.field1045, class398.field5970, class202.field2924, class461.field6846, class377.field5757, class402.field6035, class213.field3110, class265.field3882, class326.field4651 };
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lvg;IIIIIIIII)V")
    public static final void method1337(class38[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class38 var11 = arg0[var10];
            if (var11 != null && var11.field480 == arg1) {
                int var12 = var11.field412 + arg6;
                int var13 = var11.field501 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field492 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field553 + var12;
                    int var19 = var11.field472 + var13;
                    if (var11.field492 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field492 == 0 || var11.field460 || method1328(var11).field5858 != 0 || class163.field2399 == var11 || class349.field5083 == var11.field448) {
                    if (!method1333(var11)) {
                        if (class283.field4065 == var11) {
                            class518.field7546 = true;
                            class12.field164 = var12;
                            class88.field1338 = var13;
                        }
                        if (var11.field445 || var14 < var16 && var15 < var17) {
                            if (var11.field403 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class168 var20 = (class168) class163.field2396.method816(104); var20 != null; var20 = (class168) class163.field2396.method812(84)) {
                                    if (var20.field2482) {
                                        var20.method2049(-122);
                                        var20.field2488.field565 = false;
                                    }
                                }
                                if (class456.field6744 == 0) {
                                    class283.field4065 = null;
                                    class163.field2399 = null;
                                }
                                class62.field940 = 0;
                                class132.field2037 = false;
                                class372.field5680 = false;
                                if (!class207.field2963) {
                                    class189.method1290((byte) -114);
                                }
                            }
                            boolean var21;
                            if (class54.field838.method1751(32) >= var14 && class54.field838.method1749((byte) -127) >= var15 && class54.field838.method1751(32) < var16 && class54.field838.method1749((byte) -128) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class61.field932 && var21) {
                                if (var11.field420 >= 0) {
                                    class195.field2839 = var11.field420;
                                } else if (var11.field403) {
                                    class195.field2839 = -1;
                                }
                            }
                            if (!class207.field2963 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class83.method492(false, arg8 - var12, arg9 - var13, var11);
                            }
                            boolean var22 = false;
                            if (class54.field838.method1748((byte) 117) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class320 var24 = (class320) class111.field1597.method816(98);
                            if (var24 != null && var24.method239(-90) == 0 && var24.method243((byte) -109) >= var14 && var24.method238(54) >= var15 && var24.method243((byte) -109) < var16 && var24.method238(38) < var17) {
                                var23 = true;
                            }
                            if (var11.field406 != null) {
                                for (int var25 = 0; var25 < var11.field406.length; var25++) {
                                    if (class162.field2368.method1352(var11.field406[var25], 126)) {
                                        if (var11.field534 == null || class317.field4559 >= var11.field534[var25]) {
                                            byte var26 = var11.field468[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class162.field2368.method1352(86, 98) && !class162.field2368.method1352(82, 125) && !class162.field2368.method1352(81, 90)) && ((var26 & 0x2) == 0 || class162.field2368.method1352(86, 108)) && ((var26 & 0x1) == 0 || class162.field2368.method1352(82, 108)) && ((var26 & 0x4) == 0 || class162.field2368.method1352(81, 122))) {
                                                if (var25 < 10) {
                                                    class361.method2251("", (byte) 125, var25 + 1, var11.field467, -1);
                                                } else if (var25 == 10) {
                                                    class138.method920((byte) -43);
                                                    class387 var27 = method1328(var11);
                                                    class353.method2211((byte) -16, var27.method2361((byte) 121), var27.field5860, var11);
                                                    class509.field7432 = class487.method2889(3644, var11);
                                                    if (class509.field7432 == null) {
                                                        class509.field7432 = "Null";
                                                    }
                                                    class187.field2779 = var11.field499 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field556[var25];
                                                if (var11.field534 == null) {
                                                    var11.field534 = new int[var11.field406.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field534[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field534[var25] = class317.field4559 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field534 != null) {
                                        var11.field534[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class433.method2604(var11, var24.method238(45) - var13, var24.method243((byte) -109) - var12, 0);
                            }
                            if (class283.field4065 != null && class283.field4065 != var11 && var21 && method1328(var11).method2364(-1427285771)) {
                                class82.field1262 = var11;
                            }
                            if (class163.field2399 == var11) {
                                class100.field1462 = true;
                                class110.field1573 = var12;
                                class518.field7543 = var13;
                            }
                            if (var11.field460 || var11.field448 != 0) {
                                if (var21 && class244.field3594 != 0 && var11.field497 != null) {
                                    class168 var29 = new class168();
                                    var29.field2482 = true;
                                    var29.field2488 = var11;
                                    var29.field2481 = class244.field3594;
                                    var29.field2484 = var11.field497;
                                    class163.field2396.method809(var29, false);
                                }
                                if (class283.field4065 != null || class207.field2963 || class47.field767 != var11.field448 && class62.field940 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field448 != 0) {
                                    if (class272.field3957 == var11.field448 || class392.field5916 == var11.field448) {
                                        class415.field6234 = var11;
                                        if (class323.field4623 != null) {
                                            class323.field4623.method1486((byte) 111, class348.field5015, var11.field472);
                                        }
                                        if (class272.field3957 == var11.field448) {
                                            if (!class207.field2963 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class361.method2253(arg9, class348.field5015, arg8, true);
                                                for (class229 var30 = (class229) class230.field3442.method1873((byte) -122); var30 != null; var30 = (class229) class230.field3442.method1880(-61)) {
                                                    if (arg8 >= var30.field3410 && arg8 < var30.field3419 && arg9 >= var30.field3422 && arg9 < var30.field3416) {
                                                        class189.method1290((byte) -89);
                                                        class50.method310(var30.field3420, (byte) -85);
                                                    }
                                                }
                                            }
                                            class429.method2561(var12, var13, 27711, var11);
                                            continue;
                                        }
                                    }
                                    if (class349.field5083 == var11.field448) {
                                        if (var11.method225(-1, class348.field5015) == null || class425.field6375 != 0 && class425.field6375 != 3 || class207.field2963 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field539[var32];
                                        if (var31 < var33 || var31 > var11.field486[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field553 / 2;
                                        int var35 = var32 - var11.field472 / 2;
                                        int var36;
                                        if (class140.field2103 == 4) {
                                            var36 = (int) class382.field5792 & 0x3FFF;
                                        } else {
                                            var36 = (int) class382.field5792 + class289.field4132 & 0x3FFF;
                                        }
                                        int var37 = class457.field6760[var36];
                                        int var38 = class457.field6759[var36];
                                        if (class140.field2103 != 4) {
                                            var37 = (class410.field6171 + 256) * var37 >> 8;
                                            var38 = (class410.field6171 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class140.field2103 == 4) {
                                            var41 = (class94.field1398 >> 7) + (var39 >> 2);
                                            var42 = (class367.field5612 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class500.field7365.method847(-1) - 1) * 64;
                                            var41 = (class500.field7365.field1763 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class500.field7365.field1769 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class61.field932 && (class217.field3177 & 0x40) != 0) {
                                            class38 var44 = class229.method1575(class267.field3903, 0, class266.field3893);
                                            if (var44 == null) {
                                                class138.method920((byte) -43);
                                            } else {
                                                class496.method2976(false, var41, 1L, " ->", class213.field3114, true, class509.field7432, var11.field535, -111, var42, 45);
                                            }
                                            continue;
                                        }
                                        if (class359.field5513 == class183.field2707) {
                                            class496.method2976(false, var41, 1L, "", -1, true, class442.field6598.method2838(false, class143.field2137), -1, -122, var42, 44);
                                        }
                                        class496.method2976(false, var41, 1L, "", class135.field2065, true, class39.field572, -1, -125, var42, 5);
                                        continue;
                                    }
                                    if (class47.field767 == var11.field448) {
                                        class166.field2455 = var11;
                                        if (var21) {
                                            class132.field2037 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method243((byte) -109) - var12 - var11.field553 / 2) * 2.0D / (double) class460.field6808);
                                            int var46 = (int) (-((double) (var24.method238(41) - var13 - var11.field472 / 2) * 2.0D / (double) class460.field6808));
                                            int var47 = class271.field3940 + var45 + class460.field6818;
                                            int var48 = class335.field4715 + var46 + class460.field6825;
                                            class111 var49 = class264.method1757(72);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method684(var47, var50, var48, false);
                                            if (var50 != null) {
                                                if (class162.field2368.method1352(82, 127) && class402.field6053 > 0) {
                                                    class404.method2433(var50[0], var50[1], 4566, var50[2]);
                                                    continue;
                                                }
                                                class372.field5680 = true;
                                                class223.field3290 = var50[0];
                                                class122.field1848 = var50[1];
                                                class208.field2973 = var50[2];
                                            }
                                            class62.field940 = 1;
                                            class425.field6392 = false;
                                            class141.field2117 = class54.field838.method1751(32);
                                            class479.field7038 = class54.field838.method1749((byte) -124);
                                            continue;
                                        }
                                        if (var22 && class62.field940 > 0) {
                                            if (class62.field940 == 1 && (class141.field2117 != class54.field838.method1751(32) || class479.field7038 != class54.field838.method1749((byte) -128))) {
                                                class294.field4197 = class271.field3940;
                                                class213.field3115 = class335.field4715;
                                                class62.field940 = 2;
                                            }
                                            if (class62.field940 == 2) {
                                                class425.field6392 = true;
                                                class468.method2796(class294.field4197 + (int) ((double) (class141.field2117 - class54.field838.method1751(32)) * 2.0D / (double) class460.field6813), true);
                                                class257.method1712(4096, class213.field3115 - (int) ((double) (class479.field7038 - class54.field838.method1749((byte) -123)) * 2.0D / (double) class460.field6813));
                                            }
                                            continue;
                                        }
                                        if (class62.field940 > 0 && !class425.field6392) {
                                            if ((class242.field3574 == 1 || class278.method1818(4519)) && class450.field6706 > 2) {
                                                class29.method170(class141.field2117, class479.field7038, (byte) 37);
                                            } else if (class255.method1706(0)) {
                                                class29.method170(class141.field2117, class479.field7038, (byte) 90);
                                            }
                                        }
                                        class62.field940 = 0;
                                        continue;
                                    }
                                    if (class28.field291 == var11.field448) {
                                        if (var22) {
                                            class457.method2743(var11.field553, class54.field838.method1751(32) - var12, -122, class54.field838.method1749((byte) -125) - var13, var11.field472);
                                        }
                                        continue;
                                    }
                                    if (class253.field3771 == var11.field448) {
                                        class287.method1852(var13, var12, true, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field531 && var23) {
                                    var11.field531 = true;
                                    if (var11.field437 != null) {
                                        class168 var51 = new class168();
                                        var51.field2482 = true;
                                        var51.field2488 = var11;
                                        var51.field2486 = var24.method243((byte) -109) - var12;
                                        var51.field2481 = var24.method238(39) - var13;
                                        var51.field2484 = var11.field437;
                                        class163.field2396.method809(var51, false);
                                    }
                                }
                                if (var11.field531 && var22 && var11.field463 != null) {
                                    class168 var52 = new class168();
                                    var52.field2482 = true;
                                    var52.field2488 = var11;
                                    var52.field2486 = class54.field838.method1751(32) - var12;
                                    var52.field2481 = class54.field838.method1749((byte) -124) - var13;
                                    var52.field2484 = var11.field463;
                                    class163.field2396.method809(var52, false);
                                }
                                if (var11.field531 && !var22) {
                                    var11.field531 = false;
                                    if (var11.field516 != null) {
                                        class168 var53 = new class168();
                                        var53.field2482 = true;
                                        var53.field2488 = var11;
                                        var53.field2486 = class54.field838.method1751(32) - var12;
                                        var53.field2481 = class54.field838.method1749((byte) -125) - var13;
                                        var53.field2484 = var11.field516;
                                        class147.field2178.method809(var53, false);
                                    }
                                }
                                if (var22 && var11.field473 != null) {
                                    class168 var54 = new class168();
                                    var54.field2482 = true;
                                    var54.field2488 = var11;
                                    var54.field2486 = class54.field838.method1751(32) - var12;
                                    var54.field2481 = class54.field838.method1749((byte) -125) - var13;
                                    var54.field2484 = var11.field473;
                                    class163.field2396.method809(var54, false);
                                }
                                if (!var11.field565 && var21) {
                                    var11.field565 = true;
                                    if (var11.field416 != null) {
                                        class168 var55 = new class168();
                                        var55.field2482 = true;
                                        var55.field2488 = var11;
                                        var55.field2486 = class54.field838.method1751(32) - var12;
                                        var55.field2481 = class54.field838.method1749((byte) -123) - var13;
                                        var55.field2484 = var11.field416;
                                        class163.field2396.method809(var55, false);
                                    }
                                }
                                if (var11.field565 && var21 && var11.field477 != null) {
                                    class168 var56 = new class168();
                                    var56.field2482 = true;
                                    var56.field2488 = var11;
                                    var56.field2486 = class54.field838.method1751(32) - var12;
                                    var56.field2481 = class54.field838.method1749((byte) -126) - var13;
                                    var56.field2484 = var11.field477;
                                    class163.field2396.method809(var56, false);
                                }
                                if (var11.field565 && !var21) {
                                    var11.field565 = false;
                                    if (var11.field530 != null) {
                                        class168 var57 = new class168();
                                        var57.field2482 = true;
                                        var57.field2488 = var11;
                                        var57.field2486 = class54.field838.method1751(32) - var12;
                                        var57.field2481 = class54.field838.method1749((byte) -128) - var13;
                                        var57.field2484 = var11.field530;
                                        class147.field2178.method809(var57, false);
                                    }
                                }
                                if (var11.field528 != null) {
                                    class168 var58 = new class168();
                                    var58.field2488 = var11;
                                    var58.field2484 = var11.field528;
                                    class199.field2883.method809(var58, false);
                                }
                                if (var11.field441 != null && class131.field2031 > var11.field450) {
                                    if (var11.field544 == null || class131.field2031 - var11.field450 > 32) {
                                        class168 var63 = new class168();
                                        var63.field2488 = var11;
                                        var63.field2484 = var11.field441;
                                        class163.field2396.method809(var63, false);
                                    } else {
                                        label691: for (int var59 = var11.field450; var59 < class131.field2031; var59++) {
                                            int var60 = class391.field5897[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field544.length; var61++) {
                                                if (var11.field544[var61] == var60) {
                                                    class168 var62 = new class168();
                                                    var62.field2488 = var11;
                                                    var62.field2484 = var11.field441;
                                                    class163.field2396.method809(var62, false);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field450 = class131.field2031;
                                }
                                if (var11.field405 != null && class237.field3497 > var11.field541) {
                                    if (var11.field510 == null || class237.field3497 - var11.field541 > 32) {
                                        class168 var68 = new class168();
                                        var68.field2488 = var11;
                                        var68.field2484 = var11.field405;
                                        class163.field2396.method809(var68, false);
                                    } else {
                                        label667: for (int var64 = var11.field541; var64 < class237.field3497; var64++) {
                                            int var65 = class77.field1159[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field510.length; var66++) {
                                                if (var11.field510[var66] == var65) {
                                                    class168 var67 = new class168();
                                                    var67.field2488 = var11;
                                                    var67.field2484 = var11.field405;
                                                    class163.field2396.method809(var67, false);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field541 = class237.field3497;
                                }
                                if (var11.field495 != null && class355.field5467 > var11.field506) {
                                    if (var11.field551 == null || class355.field5467 - var11.field506 > 32) {
                                        class168 var73 = new class168();
                                        var73.field2488 = var11;
                                        var73.field2484 = var11.field495;
                                        class163.field2396.method809(var73, false);
                                    } else {
                                        label643: for (int var69 = var11.field506; var69 < class355.field5467; var69++) {
                                            int var70 = class419.field6297[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field551.length; var71++) {
                                                if (var11.field551[var71] == var70) {
                                                    class168 var72 = new class168();
                                                    var72.field2488 = var11;
                                                    var72.field2484 = var11.field495;
                                                    class163.field2396.method809(var72, false);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field506 = class355.field5467;
                                }
                                if (var11.field462 != null && class269.field3926 > var11.field511) {
                                    if (var11.field424 == null || class269.field3926 - var11.field511 > 32) {
                                        class168 var78 = new class168();
                                        var78.field2488 = var11;
                                        var78.field2484 = var11.field462;
                                        class163.field2396.method809(var78, false);
                                    } else {
                                        label619: for (int var74 = var11.field511; var74 < class269.field3926; var74++) {
                                            int var75 = class387.field5864[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field424.length; var76++) {
                                                if (var11.field424[var76] == var75) {
                                                    class168 var77 = new class168();
                                                    var77.field2488 = var11;
                                                    var77.field2484 = var11.field462;
                                                    class163.field2396.method809(var77, false);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field511 = class269.field3926;
                                }
                                if (var11.field521 != null && class424.field6367 > var11.field418) {
                                    if (var11.field507 == null || class424.field6367 - var11.field418 > 32) {
                                        class168 var83 = new class168();
                                        var83.field2488 = var11;
                                        var83.field2484 = var11.field521;
                                        class163.field2396.method809(var83, false);
                                    } else {
                                        label595: for (int var79 = var11.field418; var79 < class424.field6367; var79++) {
                                            int var80 = class421.field6336[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field507.length; var81++) {
                                                if (var11.field507[var81] == var80) {
                                                    class168 var82 = new class168();
                                                    var82.field2488 = var11;
                                                    var82.field2484 = var11.field521;
                                                    class163.field2396.method809(var82, false);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field418 = class424.field6367;
                                }
                                if (class491.field7283 > var11.field422 && var11.field453 != null) {
                                    class168 var84 = new class168();
                                    var84.field2488 = var11;
                                    var84.field2484 = var11.field453;
                                    class163.field2396.method809(var84, false);
                                }
                                if (class447.field6663 > var11.field422 && var11.field525 != null) {
                                    class168 var85 = new class168();
                                    var85.field2488 = var11;
                                    var85.field2484 = var11.field525;
                                    class163.field2396.method809(var85, false);
                                }
                                if (class342.field4903 > var11.field422 && var11.field537 != null) {
                                    class168 var86 = new class168();
                                    var86.field2488 = var11;
                                    var86.field2484 = var11.field537;
                                    class163.field2396.method809(var86, false);
                                }
                                if (class438.field6545 > var11.field422 && var11.field554 != null) {
                                    class168 var87 = new class168();
                                    var87.field2488 = var11;
                                    var87.field2484 = var11.field554;
                                    class163.field2396.method809(var87, false);
                                }
                                if (class296.field4212 > var11.field422 && var11.field502 != null) {
                                    class168 var88 = new class168();
                                    var88.field2488 = var11;
                                    var88.field2484 = var11.field502;
                                    class163.field2396.method809(var88, false);
                                }
                                var11.field422 = class99.field1453;
                                if (var11.field430 != null) {
                                    for (int var89 = 0; var89 < class268.field3913; var89++) {
                                        class168 var90 = new class168();
                                        var90.field2488 = var11;
                                        var90.field2487 = class525.field7766[var89].method1655(true);
                                        var90.field2485 = class525.field7766[var89].method1658(255);
                                        var90.field2484 = var11.field430;
                                        class163.field2396.method809(var90, false);
                                    }
                                }
                                if (class329.field4686 && var11.field423 != null) {
                                    class168 var91 = new class168();
                                    var91.field2488 = var11;
                                    var91.field2484 = var11.field423;
                                    class163.field2396.method809(var91, false);
                                }
                            }
                            if (var11.field492 == 5 && var11.field401 != -1) {
                                var11.method219(class77.field1154, 748, class515.field7515).method1486((byte) 80, class348.field5015, var11.field472);
                            }
                            class110.method676(5, var11);
                            if (var11.field492 == 0) {
                                method1337(arg0, var11.field467, var14, var15, var16, var17, var12 - var11.field505, var13 - var11.field415, arg8, arg9);
                                if (var11.field452 != null) {
                                    method1337(var11.field452, var11.field467, var14, var15, var16, var17, var12 - var11.field505, var13 - var11.field415, arg8, arg9);
                                }
                                class92 var92 = (class92) class431.field6450.method2605(false, (long) var11.field467);
                                if (var92 != null) {
                                    if (class26.field273 == class183.field2707 && var92.field1376 == 0 && !class207.field2963 && var21 && !class187.field2783) {
                                        class189.method1290((byte) -87);
                                    }
                                    class99.method613((byte) -22, var12, var17, arg8, var16, var15, arg9, var14, var92.field1378, var13);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class110.method676(5, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1338(boolean arg0) {
        field2849++;
        if (class62.field949.field675 > class5.field75) {
            if (class64.field965 == class499.field7358) {
                class499.field7358 = class241.field3566;
            } else {
                class499.field7358 = class64.field965;
            }
            class388.field5868 = (class62.field949.field675 * 50 - 50) * 5;
            if (class388.field5868 > 3000) {
                class388.field5868 = 3000;
            }
            if (class62.field949.field675 >= 2 && class62.field949.field674 == 6) {
                this.method1567("js5connect_outofdate", (byte) 113);
                class193.field2832 = 1000;
                return;
            }
            if (class62.field949.field675 >= 4 && class62.field949.field674 == -1) {
                this.method1567("js5crc", (byte) 113);
                class193.field2832 = 1000;
                return;
            }
            if (class62.field949.field675 >= 4 && (class193.field2832 == 0 || class193.field2832 == 5)) {
                if (class62.field949.field674 == 7 || class62.field949.field674 == 9) {
                    this.method1567("js5connect_full", (byte) 113);
                } else if (class62.field949.field674 <= 0) {
                    this.method1567("js5io", (byte) 113);
                } else {
                    this.method1567("js5connect", (byte) 113);
                }
                class193.field2832 = 1000;
                return;
            }
        }
        class5.field75 = class62.field949.field675;
        if (class388.field5868 > 0) {
            class388.field5868--;
            return;
        }
        try {
            if (class453.field6719 == 0) {
                class475.field6990 = class483.field7077.method2598(class285.field4101, class499.field7358, (byte) 123);
                class453.field6719++;
            }
            if (arg0) {
                if (class453.field6719 == 1) {
                    if (class475.field6990.field4032 == 2) {
                        this.method1331(1000, (byte) -9);
                        return;
                    }
                    if (class475.field6990.field4032 == 1) {
                        class453.field6719++;
                    }
                }
                if (class453.field6719 == 2) {
                    class333.field4695 = new class376((Socket) class475.field6990.field4030, class483.field7077);
                    class209 var2 = new class209(5);
                    var2.method1410(class46.field735.field4730, -27645);
                    var2.method1415(589, (byte) -92);
                    class333.field4695.method2311(5, var2.field3036, 4900, 0);
                    class453.field6719++;
                    class179.field2636 = class256.method1708((byte) 118);
                }
                if (class453.field6719 == 3) {
                    if (class193.field2832 == 0 || class193.field2832 == 5 || class333.field4695.method2310(118) > 0) {
                        int var3 = class333.field4695.method2306((byte) 95);
                        if (var3 != 0) {
                            this.method1331(var3, (byte) 127);
                            return;
                        }
                        class453.field6719++;
                    } else if (class256.method1708((byte) 118) - class179.field2636 > 30000L) {
                        this.method1331(1001, (byte) 101);
                        return;
                    }
                }
                if (class453.field6719 == 4) {
                    boolean var4 = class193.field2832 == 5 || class193.field2832 == 10 || class193.field2832 == 28;
                    class62.field949.method277((byte) 3, class333.field4695, !var4);
                    class475.field6990 = null;
                    class333.field4695 = null;
                    class453.field6719 = 0;
                }
            }
        } catch (IOException var5) {
            this.method1331(1002, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lvg;)Lvg;")
    public static final class38 method1339(class38 arg0) {
        int var1 = method1328(arg0).method2367(1929833);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class149.method979((byte) -126, arg0.field480);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}
