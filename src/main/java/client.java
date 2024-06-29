import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class247 {

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
    public static boolean field902 = true;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field910 = new String[100];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field911 = "flash2:";

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lkl;")
    public static class68 field908 = null;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Ljava/lang/String;")
    public static String field906 = "green:";

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "F")
    public static float field919;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
    public static boolean field920;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[[B")
    public static byte[][] field905;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 4)
    private final void method341(byte arg0) {
        field912++;
        if (class51.field1025 < class335.field5137.field4245) {
            class1.field14 = (class335.field5137.field4245 * 50 - 50) * 5;
            if (class1.field14 > 3000) {
                class1.field14 = 3000;
            }
            if (class329.field5049 == class205.field3347) {
                class205.field3347 = class313.field4760;
            } else {
                class205.field3347 = class329.field5049;
            }
            if (class335.field5137.field4245 >= 2 && class335.field5137.field4247 == 6) {
                this.method1631(302, "js5connect_outofdate");
                class38.field730 = 1000;
                return;
            }
            if (class335.field5137.field4245 >= 4 && class335.field5137.field4247 == -1) {
                this.method1631(302, "js5crc");
                class38.field730 = 1000;
                return;
            }
            if (class335.field5137.field4245 >= 4 && (class38.field730 == 0 || class38.field730 == 5)) {
                if (class335.field5137.field4247 == 7 || class335.field5137.field4247 == 9) {
                    this.method1631(302, "js5connect_full");
                } else if (class335.field5137.field4247 <= 0) {
                    this.method1631(302, "js5io");
                } else {
                    this.method1631(302, "js5connect");
                }
                class38.field730 = 1000;
                return;
            }
        }
        class51.field1025 = class335.field5137.field4245;
        if (class1.field14 > 0) {
            class1.field14--;
            return;
        }
        try {
            if (class276.field4222 == 0) {
                class165.field2672 = class177.field2849.method806(class245.field3808, class205.field3347, -27289);
                class276.field4222++;
            }
            if (arg0 > -18) {
                this.method344(119, 66);
            }
            if (class276.field4222 == 1) {
                if (class165.field2672.field1852 == 2) {
                    this.method344(59, 1000);
                    return;
                }
                if (class165.field2672.field1852 == 1) {
                    class276.field4222++;
                }
            }
            if (class276.field4222 == 2) {
                class49.field1006 = new class87((Socket) class165.field2672.field1853, class177.field2849);
                class202 var2 = new class202(5);
                var2.method1311(15, 10964);
                var2.method1359(16705, 537);
                class49.field1006.method611((byte) 60, 0, var2.field3273, 5);
                class276.field4222++;
                class19.field341 = class338.method2339((byte) -120);
            }
            if (class276.field4222 == 3) {
                if (class38.field730 == 0 || class38.field730 == 5 || class49.field1006.method608(-51) > 0) {
                    int var3 = class49.field1006.method616((byte) -108);
                    if (var3 != 0) {
                        this.method344(-120, var3);
                        return;
                    }
                    class276.field4222++;
                } else if ((class338.method2339((byte) -120) - class19.field341) > 30000L) {
                    this.method344(-120, 1001);
                    return;
                }
            }
            if (class276.field4222 == 4) {
                boolean var4 = class38.field730 == 5 || class38.field730 == 10 || class38.field730 == 28;
                class335.field5137.method1861(!var4, (byte) 88, class49.field1006);
                class276.field4222 = 0;
                class165.field2672 = null;
                class49.field1006 = null;
            }
        } catch (IOException var6) {
            this.method344(-122, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 152)
    public final void method342(int arg0) {
        field916++;
        method353(9);
        class4.method54(-109);
        class328.method2271(-6894);
        class234.method1561(false);
        class190.method1213((byte) -127);
        class122.method788((byte) -55);
        class343.method2380(-60);
        class247.method1638(122);
        class249.method1660();
        class274.method1838(-13400);
        class48.method368((byte) -33);
        class54.method418(-107);
        class339.method2341((byte) 101);
        class202.method1319((byte) 9);
        class87.method606((byte) 65);
        class276.method1848(13261);
        class32.method258(119);
        class169.method1077(4);
        class307.method2038(true);
        class204.method1375(61);
        class62.method478(5);
        class255.method1709((byte) 105);
        class25.method209(32);
        class68.method515((byte) 87);
        class197.method1264(50);
        class278.method1868(255);
        class55.method426(true);
        class283.method1903(125);
        class39.method305(6489);
        class71.method544(29187);
        class150.method977(-1);
        class209.method1413((byte) -86);
        class319.method2211(128);
        class225.method1487(-24718);
        class334.method2307(59);
        class260.method1740((byte) -103);
        class109.method708(-24824);
        class31.method251((byte) 101);
        class164.method1046(14712);
        class44.method336(-116);
        class222.method1476(65535);
        class268.method1781((byte) -128);
        class35.method280((byte) -121);
        class79.method574(0);
        class183.method1145((byte) 85);
        class81.method585(934);
        class294.method1969(376);
        class341.method2365(21);
        class293.method1966((byte) -25);
        class216.method1447(-1);
        class86.method604(-77);
        class151.method982(-111);
        class84.method592(110);
        class298.method1989((byte) -93);
        class221.method1474(-1);
        class61.method474(2000);
        class240.method1590(0);
        class195.method1251();
        class187.method1196((byte) -66);
        class128.method846((byte) 48);
        class263.method1757(108);
        class266.method1769(true);
        class65.method504();
        class24.method198(118);
        class3.method20();
        class15.method112((byte) 66);
        class184.method1173();
        class337.method2329(true);
        class20.method133();
        class148.method968(-28);
        class141.method915((byte) -123);
        class90.method621(16168);
        class244.method1617(0);
        class258.method1729();
        class92.method623();
        class162.method1038((byte) -72);
        class40.method312(88);
        class215.method1442(126);
        class112.method724(1023);
        class312.method2127();
        class345.method2389(true);
        class153.method993(-786063385);
        class311.method2095();
        class252.method1697((byte) -101);
        class239.method1584((byte) -122);
        class77.method571((byte) -76);
        if (arg0 <= 19) {
            method358((class68) null);
        }
        class257.method1717();
        class310.method2073();
        class1.method7((byte) 40);
        class28.method234(18056);
        class176.method1109((byte) 124);
        class12.method96(123);
        class210.method1420(7724);
        class270.method1820();
        class288.method1947(96);
        class218.method1450(-63);
        class74.method562((byte) 119);
        class305.method2020(false);
        class342.method2370(1);
        class101.method665(128);
        class208.method1409((byte) 98);
        class177.method1118(true);
        class14.method107((byte) 43);
        class226.method1508((byte) 50);
        class223.method1481(-17848);
        class302.method2008(-48);
        class322.method2242(-12937);
        class8.method65(-873511966);
        class155.method1003(0);
        class313.method2130(3);
        class145.method940();
        class165.method1053(0);
        class125.method826((byte) 95);
        class233.method1537(4);
        class306.method2025(-117);
        class97.method641(true);
        class340.method2347();
        class185.method1185(-107);
        class220.method1466(46);
        class327.method2263(-11591);
        class52.method405(128);
        class147.method959((byte) -87);
        class51.method381(-22894);
        class189.method1209(0);
        class243.method1608();
        class127.method840(-2034244880);
        class284.method1912();
        class286.method1930(-99);
        class18.method125(0);
        class317.method2186(true);
        class170.method1081(-118);
        class103.method671((byte) -127);
        class241.method1594(-99);
        class207.method1406();
        class336.method2318((byte) -123);
        class143.method926();
        class292.method1961(0);
        class136.method890((byte) 105);
        class228.method1513(128);
        class106.method690(107);
        class16.method119();
        class271.method1823((byte) 21);
        class41.method316(2);
        class11.method93(-20164);
        class289.method1948(-102);
        class59.method455(0);
        class154.method1001(false);
        class7.method64();
        class214.method1439((byte) -122);
        class72.method553((byte) 57);
        class290.method1950(-90);
        class182.method1141();
        class60.method470();
        class82.method586();
        class186.method1189(63);
        class219.method1461((byte) 52);
        class273.method1826();
        class115.method761();
        class105.method688();
        class123.method796((byte) 52);
        class296.method1979(44);
        class256.method1715(125);
        class2.method14(false);
        class281.method1891((byte) -105);
        class174.method1099((byte) -110);
        class134.method876((byte) 115);
        class203.method1362((byte) -64);
        class308.method2060();
        class75.method564(0);
        class80.method583(-21380);
        class114.method743(14718);
        class301.method2001((byte) 124);
        class100.method662(68);
        class140.method913(-71);
        class6.method61(-111);
        class331.method2292((byte) 126);
        class295.method1976((byte) -127);
        class166.method1060((byte) 123);
        class99.method658(false);
        class78.method572((byte) -81);
        class93.method627((byte) -55);
        class324.method2244(-119);
        class33.method266(124);
        class116.method766(-4751);
        class213.method1437(false);
        class246.method1627(-27045);
        class254.method1703((byte) -86);
        class159.method1029(13013);
        class287.method1943();
        class282.method1899(true);
        class178.method1122((byte) 126);
        class344.method2384((byte) 32);
        class267.method1772(0);
        class69.method537(false);
        class118.method776(4);
        class181.method1140();
        class152.method988();
        class179.method1124(true);
        class194.method1240(8222);
        class335.method2313((byte) 121);
        class95.method634((byte) 7);
        class22.method190();
        class139.method908();
        class245.method1624(-12911);
        class212.method1430(-11514);
        class36.method287();
        class133.method872(true);
        class57.method445();
        class238.method1578();
        class157.method1017((byte) 18);
        class156.method1005(-16251);
        class21.method182(23106);
        class27.method221(3);
        class163.method1039(-3683);
        class138.method907(false);
        class26.method219(true);
        class43.method324(false);
        class45.method363((byte) 25);
        class85.method593(0);
        class303.method2015(4096);
        class64.method491(true);
        class50.method378(21);
        class46.method365(127);
        class130.method857((byte) 75);
        class135.method883(-99);
        class132.method867(-1);
        class277.method1862(-33);
        class211.method1426((byte) -12);
        class63.method485(5939);
        class285.method1928(true);
        class329.method2280(2);
        class94.method631(6);
        class42.method318((byte) -14);
        class23.method192((byte) 101);
        class325.method2253((byte) -41);
        class248.method1645(false);
        class232.method1534(true);
        class291.method1960((byte) 11);
        class235.method1563((byte) 122);
        class171.method1083(2);
        class131.method860(false);
        class196.method1261(0);
        class330.method2286(39);
        class326.method2259(122);
        class149.method974(false);
        class224.method1486(1);
        class200.method1274(4);
        class280.method1886(-86);
        class236.method1569(124);
        class168.method1066(5);
        class269.method1797((byte) -86);
        class199.method1271((byte) 98);
        class121.method783(118);
        class38.method297(true);
        class66.method507(9712);
        class142.method919((byte) 111);
        class227.method1512(4096);
        class158.method1020(true);
        class180.method1133(-101);
        class49.method375(126);
        class56.method436(3);
        class259.method1739((byte) -54);
        class321.method2233(5);
        class264.method1759(4823);
        class29.method235(22826);
        class253.method1699(-92);
        class160.method1031(106);
        class119.method780(2);
        class104.method678(-5118);
        class318.method2188(0);
        class17.method123(-22595);
        class120.method781(128);
        class70.method538((byte) 9);
        class37.method288(-216954932);
        class67.method513((byte) 101);
        class250.method1692((byte) -51);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 443)
    public final void method343(int arg0) {
        field901++;
        if (class249.field3893) {
            class249.method1655();
        }
        if (class177.field2866 != null) {
            class266.method1771(class177.field2849, class177.field2866, true);
            class177.field2866 = null;
        }
        if (class177.field2849 != null) {
            class177.field2849.method812(this.getClass(), 0);
        }
        if (class156.field2541 != null) {
            class156.field2541.field1083 = false;
        }
        class156.field2541 = null;
        if (class177.field2860 != null) {
            class177.field2860.method607((byte) -76);
            class177.field2860 = null;
        }
        if (arg0 != 1) {
            this.method352(-117);
        }
        class327.method2260((byte) 90, class216.field3456);
        class196.method1258(class216.field3456, 89);
        if (class240.field3751 != null) {
            class240.field3751.method548((byte) 116, class216.field3456);
        }
        class293.method1968((byte) -128);
        class45.method361(32358);
        class240.field3751 = null;
        if (class41.field797 != null) {
            class41.field797.method1496(false);
        }
        if (class328.field5033 != null) {
            class328.field5033.method1496(false);
        }
        class335.field5137.method1859((byte) 39);
        class157.field2554.method1282(arg0 + 16373);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 493)
    private final void method344(int arg0, int arg1) {
        int var3 = 113 % ((-arg0 - 59) / 55);
        class49.field1006 = null;
        class165.field2672 = null;
        field914++;
        class335.field5137.field4245++;
        class276.field4222 = 0;
        class335.field5137.field4247 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 506)
    public final void method345(int arg0) {
        class35.method281((byte) -36);
        field917++;
        class157.field2554 = new class201();
        class335.field5137 = new class276();
        if (class201.field3204 != 0) {
            class325.field4974 = new byte[50][];
        }
        class250.method1691((byte) 31, class177.field2849);
        if (class260.field4068 == 0) {
            class305.field4624 = this.getCodeBase().getHost();
            class267.field4119 = 43594;
            class97.field1722 = 443;
        } else if (class260.field4068 == 1) {
            class305.field4624 = this.getCodeBase().getHost();
            class97.field1722 = class29.field549 + 50000;
            class267.field4119 = class29.field549 + 40000;
        } else if (class260.field4068 == 2) {
            class305.field4624 = "127.0.0.1";
            class267.field4119 = class29.field549 + 40000;
            class97.field1722 = class29.field549 + 50000;
        }
        class329.field5049 = class267.field4119;
        class313.field4760 = class97.field1722;
        if (class324.field4954 == 1) {
            class65.field1247 = 16777215;
            class65.field1238 = 0;
            class218.field3461 = class282.field4363;
            class40.field770 = class77.field1536;
            class232.field3640 = class291.field4465;
            class185.field3015 = true;
            class44.field859 = class122.field2116;
        } else {
            class232.field3640 = class160.field2606;
            class40.field770 = class334.field5124;
            class44.field859 = class259.field4032;
            class218.field3461 = class325.field4966;
        }
        if (class124.field2149 == 3 && class260.field4068 != 2) {
            class109.field1940 = class29.field549;
        }
        class46.field952 = class121.field2101 = class245.field3804 = class141.field2331 = new short[256];
        class151.field2469 = class267.field4119;
        if (arg0 != -31401) {
            return;
        }
        class245.field3808 = class305.field4624;
        class205.field3347 = class151.field2469;
        class334.method2299((byte) 117);
        class122.method790(class216.field3456, -115);
        class200.method1279((byte) -11, class216.field3456);
        class240.field3751 = class86.method599(108);
        if (class240.field3751 != null) {
            class240.field3751.method542(class216.field3456, (byte) -125);
        }
        class47.field977 = class124.field2149;
        try {
            if (class177.field2849.field2138 != null) {
                class17.field316 = new class204(class177.field2849.field2138, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class343.field5325[var2] = new class204(class177.field2849.field2147[var2], 6000, 0);
                }
                class331.field5077 = new class204(class177.field2849.field2146, 6000, 0);
                class187.field3037 = new class62(255, class17.field316, class331.field5077, 500000);
                class158.field2585 = new class204(class177.field2849.field2136, 24, 0);
                class177.field2849.field2146 = null;
                class177.field2849.field2136 = null;
                class177.field2849.field2147 = null;
                class177.field2849.field2138 = null;
            }
        } catch (IOException var4) {
            class331.field5077 = null;
            class187.field3037 = null;
            class158.field2585 = null;
            class17.field316 = null;
        }
        if (class260.field4068 != 0) {
            class95.field1705 = true;
        }
        class248.field3861 = class135.field2270;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 625)
    private final void method346(int arg0) {
        field909++;
        for (class324.field4956 = 0; class135.method882(arg0 + 1930) && class324.field4956 < 128; class324.field4956++) {
            class232.field3641[class324.field4956] = class301.field4562;
            class286.field4430[class324.field4956] = class87.field1654;
        }
        class176.field2836++;
        if (class158.field2580 != -1) {
            class156.method1009(0, 0, 0, class158.field2580, 0, (byte) 98, class88.field1658, class134.field2257);
        }
        if (arg0 != -1929) {
            method353(-30);
        }
        class342.field5323++;
        if (class249.field3893) {
            int var2 = 2359807;
            label198: for (int var3 = 0; var3 < 32768; var3++) {
                class255 var4 = class8.field179[var3];
                if (var4 != null) {
                    byte var5 = var4.field3991.field867;
                    if ((var5 & 0x2) > 0 && var4.field1877 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1879[0] = 1;
                            var4.field1871[0] = (var4.field1869 >> 7) + var6;
                            var4.field1899[0] = (var4.field1872 >> 7) + var7;
                            class326.field4990[class289.field4438].method208(var4.field1869 >> 7, var4.method710(-1), 0, var4.field1872 >> 7, (byte) -54, var4.method710(arg0 + 1928), false, false);
                            if (var4.field1871[0] >= 0 && var4.field1871[0] <= (104 - var4.method710(-1)) && var4.field1899[0] >= 0 && var4.field1899[0] <= (104 - var4.method710(-1)) && class326.field4990[class289.field4438].method213(7236, var4.field1899[0], var4.field1872 >> 7, var4.field1869 >> 7, var4.field1871[0])) {
                                if (var4.method710(-1) > 1) {
                                    for (int var8 = var4.field1871[0]; var8 < (var4.field1871[0] + var4.method710(-1)); var8++) {
                                        for (int var9 = var4.field1899[0]; (var4.field1899[0] + var4.method710(-1)) > var9; var9++) {
                                            if ((class326.field4990[class289.field4438].field501[var8][var9] & var2) != 0) {
                                                continue label198;
                                            }
                                        }
                                    }
                                }
                                var4.field1877 = 1;
                            }
                        }
                    }
                    class190.method1218(58, var4);
                    class221.method1472(var4, 1);
                    class31.method248(arg0 ^ 0xFFFFFD2A, var4);
                    class326.field4990[class289.field4438].method211(false, true, var4.field1869 >> 7, var4.method710(-1), var4.field1872 >> 7, var4.method710(-1), false);
                }
            }
        }
        if (!class249.field3893) {
            class236.method1567((byte) 119);
        } else if (class322.field4911 == 0 && class53.field1075 == 0) {
            if (class135.field2271 == 2) {
                class135.method886((byte) 39);
            } else {
                class313.method2135((byte) 99);
            }
            if (class38.field742 >> 7 < 14 || (class38.field742 >> 7) >= 90 || class283.field4381 >> 7 < 14 || class283.field4381 >> 7 >= 90) {
                class221.method1473(true);
            }
        }
        while (true) {
            class106 var10;
            class68 var17;
            class68 var18;
            do {
                var10 = (class106) class95.field1701.method430(5);
                if (var10 == null) {
                    while (true) {
                        class106 var11;
                        class68 var12;
                        class68 var13;
                        do {
                            var11 = (class106) class24.field482.method430(5);
                            if (var11 == null) {
                                while (true) {
                                    class106 var14;
                                    class68 var15;
                                    class68 var16;
                                    do {
                                        var14 = (class106) class12.field238.method430(5);
                                        if (var14 == null) {
                                            if (class289.field4445 != null) {
                                                class41.method315(true);
                                            }
                                            if (class306.field4628 != null && class306.field4628.field1852 == 1) {
                                                if (class306.field4628.field1853 != null) {
                                                    class173.method1092(true, class294.field4499, class45.field931);
                                                }
                                                class45.field931 = null;
                                                class306.field4628 = null;
                                                class294.field4499 = false;
                                            }
                                            if (class25.field494 % 1500 == 0) {
                                                class335.method2314((byte) 125);
                                            }
                                            return;
                                        }
                                        var15 = var14.field1823;
                                        if (var15.field1365 < 0) {
                                            break;
                                        }
                                        var16 = class319.method2196(-1351736944, var15.field1308);
                                    } while (var16 == null || var16.field1372 == null || var16.field1372.length <= var15.field1365 || var16.field1372[var15.field1365] != var15);
                                    class156.method1008(true, var14);
                                }
                            }
                            var12 = var11.field1823;
                            if (var12.field1365 < 0) {
                                break;
                            }
                            var13 = class319.method2196(arg0 ^ 0x5091D9E7, var12.field1308);
                        } while (var13 == null || var13.field1372 == null || var13.field1372.length <= var12.field1365 || var13.field1372[var12.field1365] != var12);
                        class156.method1008(true, var11);
                    }
                }
                var17 = var10.field1823;
                if (var17.field1365 < 0) {
                    break;
                }
                var18 = class319.method2196(arg0 - 1351735015, var17.field1308);
            } while (var18 == null || var18.field1372 == null || var18.field1372.length <= var17.field1365 || var18.field1372[var17.field1365] != var17);
            class156.method1008(true, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILag;)Luf;", line = 844)
    public static final class228 method347(int arg0, class202 arg1) {
        field907++;
        if (arg0 == 14) {
            class228 var2 = new class228();
            var2.field3596 = arg1.method1315(arg0 + 14275);
            var2.field3609 = class169.method1079(var2.field3596, (byte) -51);
            return var2;
        } else {
            return (class228) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lkl;IIIIIII)V", line = 882)
    public static final void method348(class68[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class68 var9 = arg0[var8];
            if (var9 != null && var9.field1308 == arg1 && (!var9.field1429 || var9.field1358 == 0 || var9.field1406 || method359(var9).field4125 != 0 || class1.field26 == var9 || var9.field1438 == 1338) && (!var9.field1429 || !method355(var9))) {
                int var10 = var9.field1324 + arg6;
                int var11 = var9.field1340 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1358 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1416 + var10;
                    int var17 = var9.field1414 + var11;
                    if (var9.field1358 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class289.field4445 == var9) {
                    class42.field812 = true;
                    class215.field3445 = var10;
                    class191.field3111 = var11;
                }
                if (!var9.field1429 || var12 < var14 && var13 < var15) {
                    if (var9.field1358 == 0) {
                        if (!var9.field1429 && method355(var9) && class61.field1174 != var9) {
                            continue;
                        }
                        if (var9.field1456 && class120.field2083 >= var12 && class9.field196 >= var13 && class120.field2083 < var14 && class9.field196 < var15) {
                            for (class106 var18 = (class106) class12.field238.method424(-100); var18 != null; var18 = (class106) class12.field238.method425(-32547)) {
                                if (var18.field1837) {
                                    var18.method278((byte) -105);
                                    var18.field1823.field1366 = false;
                                }
                            }
                            if (class212.field3412 == 0) {
                                class289.field4445 = null;
                                class1.field26 = null;
                            }
                            class277.field4254 = 0;
                        }
                    }
                    if (var9.field1429) {
                        boolean var19;
                        if (class120.field2083 >= var12 && class9.field196 >= var13 && class120.field2083 < var14 && class9.field196 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class335.field5140 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class187.field3036 == 1 && class215.field3441 >= var12 && class72.field1510 >= var13 && class215.field3441 < var14 && class72.field1510 < var15) {
                            var21 = true;
                        }
                        if (var9.field1312 != null) {
                            for (int var22 = 0; var22 < var9.field1312.length; var22++) {
                                if (class342.field5317[var9.field1312[var22]]) {
                                    if (var9.field1405 == null || class25.field494 >= var9.field1405[var22]) {
                                        byte var23 = var9.field1376[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class342.field5317[86] && !class342.field5317[82] && !class342.field5317[81]) && ((var23 & 0x2) == 0 || class342.field5317[86]) && ((var23 & 0x1) == 0 || class342.field5317[82]) && ((var23 & 0x4) == 0 || class342.field5317[81])) {
                                            class2.method12("", 127, -1, var22 + 1, var9.field1284);
                                            int var24 = var9.field1415[var22];
                                            if (var9.field1405 == null) {
                                                var9.field1405 = new int[var9.field1312.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field1405[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field1405[var22] = class25.field494 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field1405 != null) {
                                    var9.field1405[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class177.method1115((byte) -4, class72.field1510 - var11, class215.field3441 - var10, var9);
                        }
                        if (class289.field4445 != null && class289.field4445 != var9 && var19 && method359(var9).method1776(1507)) {
                            class179.field2874 = var9;
                        }
                        if (class1.field26 == var9) {
                            class313.field4754 = true;
                            class302.field4579 = var10;
                            class342.field5316 = var11;
                        }
                        if (var9.field1406 || var9.field1438 != 0) {
                            if (var19 && class157.field2567 != 0 && var9.field1452 != null) {
                                class106 var25 = new class106();
                                var25.field1837 = true;
                                var25.field1823 = var9;
                                var25.field1824 = class157.field2567;
                                var25.field1841 = var9.field1452;
                                class12.field238.method427((byte) -108, var25);
                            }
                            if (class289.field4445 != null || class288.field4434 != null || class290.field4459 || var9.field1438 != 1400 && class277.field4254 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1438 != 0) {
                                if (var9.field1438 == 1337) {
                                    field908 = var9;
                                    continue;
                                }
                                if (var9.field1438 == 1338) {
                                    if (var21) {
                                        class148.field2437 = class215.field3441 - var10;
                                        class75.field1526 = class72.field1510 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1438 == 1400) {
                                    class118.field2065 = var9;
                                    if (var21) {
                                        if (class342.field5317[82] && class29.field545 > 0) {
                                            int var26 = (int) ((double) (class215.field3441 - var10 - var9.field1416 / 2) * 2.0D / (double) class244.field3799);
                                            int var27 = (int) ((double) (class72.field1510 - var11 - var9.field1414 / 2) * 2.0D / (double) class244.field3799);
                                            int var28 = class318.field4808 + var26;
                                            int var29 = class250.field3923 + var27;
                                            int var30 = class38.field734 + var28;
                                            int var31 = class9.field199 + class17.field322 - var29 - 1;
                                            class328 var32 = class194.method1242(false);
                                            int[] var33 = var32.method2275(var30, var31, 104);
                                            if (var33 != null) {
                                                class54.method420(true, var33[1], var33[2], var33[0]);
                                                class208.method1410((byte) 98);
                                            }
                                            continue;
                                        }
                                        class277.field4254 = 1;
                                        class21.field451 = class120.field2083;
                                        class159.field2603 = class9.field196;
                                        continue;
                                    }
                                    if (var20 && class277.field4254 > 0) {
                                        if (class277.field4254 == 1 && (class21.field451 != class120.field2083 || class9.field196 != class159.field2603)) {
                                            class221.field3510 = class318.field4808;
                                            class59.field1164 = class250.field3923;
                                            class277.field4254 = 2;
                                        }
                                        if (class277.field4254 == 2) {
                                            class202.method1326((byte) 106, (int) ((double) (class21.field451 - class120.field2083) * 2.0D / (double) class248.field3867) + class221.field3510);
                                            class34.method273(9, (int) ((double) (class159.field2603 - class9.field196) * 2.0D / (double) class248.field3867) + class59.field1164);
                                        }
                                        continue;
                                    }
                                    class277.field4254 = 0;
                                    continue;
                                }
                                if (var9.field1438 == 1401) {
                                    if (var20) {
                                        class53.method416(2538, var9.field1414, class9.field196 - var11, class120.field2083 - var10, var9.field1416);
                                    }
                                    continue;
                                }
                                if (var9.field1438 == 1402) {
                                    if (!class249.field3893) {
                                        class317.method2183((byte) -7, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field1408 && var21) {
                                var9.field1408 = true;
                                if (var9.field1387 != null) {
                                    class106 var34 = new class106();
                                    var34.field1837 = true;
                                    var34.field1823 = var9;
                                    var34.field1831 = class215.field3441 - var10;
                                    var34.field1824 = class72.field1510 - var11;
                                    var34.field1841 = var9.field1387;
                                    class12.field238.method427((byte) 65, var34);
                                }
                            }
                            if (var9.field1408 && var20 && var9.field1331 != null) {
                                class106 var35 = new class106();
                                var35.field1837 = true;
                                var35.field1823 = var9;
                                var35.field1831 = class120.field2083 - var10;
                                var35.field1824 = class9.field196 - var11;
                                var35.field1841 = var9.field1331;
                                class12.field238.method427((byte) -92, var35);
                            }
                            if (var9.field1408 && !var20) {
                                var9.field1408 = false;
                                if (var9.field1316 != null) {
                                    class106 var36 = new class106();
                                    var36.field1837 = true;
                                    var36.field1823 = var9;
                                    var36.field1831 = class120.field2083 - var10;
                                    var36.field1824 = class9.field196 - var11;
                                    var36.field1841 = var9.field1316;
                                    class24.field482.method427((byte) 80, var36);
                                }
                            }
                            if (var20 && var9.field1373 != null) {
                                class106 var37 = new class106();
                                var37.field1837 = true;
                                var37.field1823 = var9;
                                var37.field1831 = class120.field2083 - var10;
                                var37.field1824 = class9.field196 - var11;
                                var37.field1841 = var9.field1373;
                                class12.field238.method427((byte) 81, var37);
                            }
                            if (!var9.field1366 && var19) {
                                var9.field1366 = true;
                                if (var9.field1307 != null) {
                                    class106 var38 = new class106();
                                    var38.field1837 = true;
                                    var38.field1823 = var9;
                                    var38.field1831 = class120.field2083 - var10;
                                    var38.field1824 = class9.field196 - var11;
                                    var38.field1841 = var9.field1307;
                                    class12.field238.method427((byte) -127, var38);
                                }
                            }
                            if (var9.field1366 && var19 && var9.field1292 != null) {
                                class106 var39 = new class106();
                                var39.field1837 = true;
                                var39.field1823 = var9;
                                var39.field1831 = class120.field2083 - var10;
                                var39.field1824 = class9.field196 - var11;
                                var39.field1841 = var9.field1292;
                                class12.field238.method427((byte) -103, var39);
                            }
                            if (var9.field1366 && !var19) {
                                var9.field1366 = false;
                                if (var9.field1313 != null) {
                                    class106 var40 = new class106();
                                    var40.field1837 = true;
                                    var40.field1823 = var9;
                                    var40.field1831 = class120.field2083 - var10;
                                    var40.field1824 = class9.field196 - var11;
                                    var40.field1841 = var9.field1313;
                                    class24.field482.method427((byte) 103, var40);
                                }
                            }
                            if (var9.field1353 != null) {
                                class106 var41 = new class106();
                                var41.field1823 = var9;
                                var41.field1841 = var9.field1353;
                                class95.field1701.method427((byte) 95, var41);
                            }
                            if (var9.field1339 != null && class205.field3348 > var9.field1448) {
                                if (var9.field1409 == null || class205.field3348 - var9.field1448 > 32) {
                                    class106 var46 = new class106();
                                    var46.field1823 = var9;
                                    var46.field1841 = var9.field1339;
                                    class12.field238.method427((byte) 60, var46);
                                } else {
                                    label575: for (int var42 = var9.field1448; var42 < class205.field3348; var42++) {
                                        int var43 = class168.field2695[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field1409.length; var44++) {
                                            if (var9.field1409[var44] == var43) {
                                                class106 var45 = new class106();
                                                var45.field1823 = var9;
                                                var45.field1841 = var9.field1339;
                                                class12.field238.method427((byte) 83, var45);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field1448 = class205.field3348;
                            }
                            if (var9.field1434 != null && class93.field1680 > var9.field1333) {
                                if (var9.field1298 == null || class93.field1680 - var9.field1333 > 32) {
                                    class106 var51 = new class106();
                                    var51.field1823 = var9;
                                    var51.field1841 = var9.field1434;
                                    class12.field238.method427((byte) 75, var51);
                                } else {
                                    label551: for (int var47 = var9.field1333; var47 < class93.field1680; var47++) {
                                        int var48 = class118.field2056[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field1298.length; var49++) {
                                            if (var9.field1298[var49] == var48) {
                                                class106 var50 = new class106();
                                                var50.field1823 = var9;
                                                var50.field1841 = var9.field1434;
                                                class12.field238.method427((byte) -111, var50);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field1333 = class93.field1680;
                            }
                            if (var9.field1289 != null && class210.field3390 > var9.field1393) {
                                if (var9.field1440 == null || class210.field3390 - var9.field1393 > 32) {
                                    class106 var56 = new class106();
                                    var56.field1823 = var9;
                                    var56.field1841 = var9.field1289;
                                    class12.field238.method427((byte) -125, var56);
                                } else {
                                    label527: for (int var52 = var9.field1393; var52 < class210.field3390; var52++) {
                                        int var53 = class327.field5010[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field1440.length; var54++) {
                                            if (var9.field1440[var54] == var53) {
                                                class106 var55 = new class106();
                                                var55.field1823 = var9;
                                                var55.field1841 = var9.field1289;
                                                class12.field238.method427((byte) 102, var55);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field1393 = class210.field3390;
                            }
                            if (var9.field1391 != null && class292.field4473 > var9.field1418) {
                                if (var9.field1280 == null || class292.field4473 - var9.field1418 > 32) {
                                    class106 var61 = new class106();
                                    var61.field1823 = var9;
                                    var61.field1841 = var9.field1391;
                                    class12.field238.method427((byte) -109, var61);
                                } else {
                                    label503: for (int var57 = var9.field1418; var57 < class292.field4473; var57++) {
                                        int var58 = class127.field2184[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field1280.length; var59++) {
                                            if (var9.field1280[var59] == var58) {
                                                class106 var60 = new class106();
                                                var60.field1823 = var9;
                                                var60.field1841 = var9.field1391;
                                                class12.field238.method427((byte) 104, var60);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field1418 = class292.field4473;
                            }
                            if (var9.field1361 != null && class274.field4199 > var9.field1304) {
                                if (var9.field1398 == null || class274.field4199 - var9.field1304 > 32) {
                                    class106 var66 = new class106();
                                    var66.field1823 = var9;
                                    var66.field1841 = var9.field1361;
                                    class12.field238.method427((byte) -92, var66);
                                } else {
                                    label479: for (int var62 = var9.field1304; var62 < class274.field4199; var62++) {
                                        int var63 = class296.field4516[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field1398.length; var64++) {
                                            if (var9.field1398[var64] == var63) {
                                                class106 var65 = new class106();
                                                var65.field1823 = var9;
                                                var65.field1841 = var9.field1361;
                                                class12.field238.method427((byte) 84, var65);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field1304 = class274.field4199;
                            }
                            if (class46.field942 > var9.field1374 && var9.field1377 != null) {
                                class106 var67 = new class106();
                                var67.field1823 = var9;
                                var67.field1841 = var9.field1377;
                                class12.field238.method427((byte) -126, var67);
                            }
                            if (class165.field2670 > var9.field1374 && var9.field1328 != null) {
                                class106 var68 = new class106();
                                var68.field1823 = var9;
                                var68.field1841 = var9.field1328;
                                class12.field238.method427((byte) -68, var68);
                            }
                            if (class202.field3221 > var9.field1374 && var9.field1279 != null) {
                                class106 var69 = new class106();
                                var69.field1823 = var9;
                                var69.field1841 = var9.field1279;
                                class12.field238.method427((byte) 63, var69);
                            }
                            if (class209.field3374 > var9.field1374 && var9.field1413 != null) {
                                class106 var70 = new class106();
                                var70.field1823 = var9;
                                var70.field1841 = var9.field1413;
                                class12.field238.method427((byte) -118, var70);
                            }
                            if (class53.field1073 > var9.field1374 && var9.field1411 != null) {
                                class106 var71 = new class106();
                                var71.field1823 = var9;
                                var71.field1841 = var9.field1411;
                                class12.field238.method427((byte) 106, var71);
                            }
                            var9.field1374 = class342.field5323;
                            if (var9.field1302 != null) {
                                for (int var72 = 0; var72 < class324.field4956; var72++) {
                                    class106 var73 = new class106();
                                    var73.field1823 = var9;
                                    var73.field1835 = class232.field3641[var72];
                                    var73.field1833 = class286.field4430[var72];
                                    var73.field1841 = var9.field1302;
                                    class12.field238.method427((byte) -114, var73);
                                }
                            }
                            if (class317.field4791 && var9.field1457 != null) {
                                class106 var74 = new class106();
                                var74.field1823 = var9;
                                var74.field1841 = var9.field1457;
                                class12.field238.method427((byte) 72, var74);
                            }
                        }
                    }
                    if (!var9.field1429 && class289.field4445 == null && class288.field4434 == null && !class290.field4459) {
                        if ((var9.field1384 >= 0 || var9.field1301 != 0) && class120.field2083 >= var12 && class9.field196 >= var13 && class120.field2083 < var14 && class9.field196 < var15) {
                            if (var9.field1384 >= 0) {
                                class61.field1174 = arg0[var9.field1384];
                            } else {
                                class61.field1174 = var9;
                            }
                        }
                        if (var9.field1358 == 8 && class120.field2083 >= var12 && class9.field196 >= var13 && class120.field2083 < var14 && class9.field196 < var15) {
                            class24.field484 = var9;
                        }
                        if (var9.field1401 > var9.field1414) {
                            class319.method2219(var11, var9, (byte) 79, var9.field1416 + var10, var9.field1401, class9.field196, class120.field2083, var9.field1414);
                        }
                    }
                    if (var9.field1358 == 0) {
                        method348(arg0, var9.field1284, var12, var13, var14, var15, var10 - var9.field1288, var11 - var9.field1419);
                        if (var9.field1372 != null) {
                            method348(var9.field1372, var9.field1284, var12, var13, var14, var15, var10 - var9.field1288, var11 - var9.field1419);
                        }
                        class222 var75 = (class222) class185.field3013.method303((long) var9.field1284, (byte) 106);
                        if (var75 != null) {
                            class156.method1009(var11, var12, var10, var75.field3514, var13, (byte) 119, var14, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbm;Lbm;I)V", line = 1651)
    private static final void method349(class307 arg0, class307 arg1, int arg2) {
        class149.field2443 = arg1;
        if (arg2 == -15112) {
            class103.field1786 = arg0;
            field898++;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 1665)
    private final void method350(byte[] arg0, int arg1) {
        class202 var3 = new class202(arg0);
        while (true) {
            int var4 = var3.method1317((byte) -84);
            if (var4 == 0) {
                if (arg1 != 2) {
                    method353(-88);
                }
                field903++;
                return;
            }
            if (var4 == 1) {
                int[] var5 = class101.field1776 = new int[6];
                var5[0] = var3.method1315(14289);
                var5[1] = var3.method1315(14289);
                var5[2] = var3.method1315(14289);
                var5[3] = var3.method1315(arg1 + 14287);
                var5[4] = var3.method1315(14289);
                var5[5] = var3.method1315(14289);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1703)
    public final void method351(int arg0) {
        field904++;
        if (class38.field730 == 1000) {
            return;
        }
        long var2 = class338.method2339((byte) -120) - class121.field2099;
        if (arg0 != 21315) {
            this.method357(14);
        }
        class121.field2099 = class338.method2339((byte) -120);
        boolean var4 = class290.method1953((byte) -88);
        if (var4 && class146.field2389 && class41.field797 != null) {
            class41.field797.method1493((byte) 12);
        }
        if ((class38.field730 == 30 || class38.field730 == 10) && (class104.field1796 || class274.field4205 != 0L && class274.field4205 < class338.method2339((byte) -120))) {
            class119.method777(class104.field1796, (byte) 51, class180.field2902, class241.method1595(arg0 ^ 0x5341), class171.field2757);
        }
        if (class177.field2866 == null) {
            Container var5;
            if (class177.field2866 != null) {
                var5 = class177.field2866;
            } else if (class283.field4376 == null) {
                var5 = class177.field2849.field2139;
            } else {
                var5 = class283.field4376;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class283.field4376 == var5) {
                Insets var8 = class283.field4376.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class61.field1183 != var6 || class177.field2864 != var7) {
                if (class124.field2140.startsWith("mac")) {
                    class61.field1183 = var6;
                    class177.field2864 = var7;
                } else {
                    class35.method281((byte) -96);
                }
                class274.field4205 = class338.method2339((byte) -120) + 500L;
            }
        }
        if (class177.field2866 != null && !class106.field1827 && (class38.field730 == 30 || class38.field730 == 10)) {
            class119.method777(false, (byte) 54, -1, class52.field1051, -1);
        }
        boolean var9 = false;
        if (class246.field3815) {
            class246.field3815 = false;
            var9 = true;
        }
        if (var9) {
            class334.method2300(0);
        }
        if (class249.field3893) {
            for (int var10 = 0; var10 < 100; var10++) {
                class337.field5220[var10] = true;
            }
        }
        if (class38.field730 == 0) {
            class268.method1778(class276.field4226, var9, (Color) null, class282.field4341, arg0 + 279323819);
        } else if (class38.field730 == 5) {
            class291.method1959(false, 2, class214.field3428);
        } else if (class38.field730 == 10) {
            class156.method1014(-461017140);
        } else if (class38.field730 == 25 || class38.field730 == 28) {
            if (class84.field1593 == 1) {
                if (class31.field583 > class11.field232) {
                    class11.field232 = class31.field583;
                }
                int var11 = (class11.field232 - class31.field583) * 50 / class11.field232;
                class188.method1200(false, class219.field3478 + "<br>(" + var11 + "%)", false);
            } else if (class84.field1593 == 2) {
                if (class153.field2505 < class264.field4102) {
                    class153.field2505 = class264.field4102;
                }
                int var12 = (class153.field2505 - class264.field4102) * 50 / class153.field2505 + 50;
                class188.method1200(false, class219.field3478 + "<br>(" + var12 + "%)", false);
            } else {
                class188.method1200(false, class219.field3478, false);
            }
        } else if (class38.field730 == 30) {
            class149.method973((byte) -90, var2);
        } else if (class38.field730 == 40) {
            class188.method1200(false, class235.field3691 + "<br>" + class345.field5352, false);
        }
        if (class249.field3893 && class38.field730 != 0) {
            class249.method1686();
            for (int var13 = 0; var13 < class147.field2401; var13++) {
                class220.field3490[var13] = false;
            }
        } else if ((class38.field730 == 30 || class38.field730 == 10) && class79.field1567 == 0 && !var9) {
            try {
                Graphics var17 = class216.field3456.getGraphics();
                for (int var18 = 0; var18 < class147.field2401; var18++) {
                    if (class220.field3490[var18]) {
                        class330.field5055.method264(var17, class215.field3444[var18], -122, class186.field3029[var18], class77.field1541[var18], class263.field4086[var18]);
                        class220.field3490[var18] = false;
                    }
                }
            } catch (Exception var20) {
                class216.field3456.repaint();
            }
        } else if (class38.field730 != 0) {
            try {
                Graphics var14 = class216.field3456.getGraphics();
                class330.field5055.method265(0, var14, 0, (byte) -112);
                for (int var15 = 0; var15 < class147.field2401; var15++) {
                    class220.field3490[var15] = false;
                }
            } catch (Exception var21) {
                class216.field3456.repaint();
            }
        }
        if (class62.field1196) {
            class282.method1895(5);
        }
        if (class236.field3714 && class38.field730 == 10 && class158.field2580 != -1) {
            class236.field3714 = false;
            class271.method1824(117, class177.field2849);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 1924)
    private final void method352(int arg0) {
        if (!class236.field3714) {
            label245: while (true) {
                do {
                    if (!class135.method882(1)) {
                        break label245;
                    }
                } while (class87.field1654 != 's' && class87.field1654 != 'S');
                class236.field3714 = true;
            }
        }
        if (arg0 >= -45) {
            return;
        }
        field899++;
        if (class202.field3247 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class338.method2339((byte) -120);
            if (class256.field4003 == 0L) {
                class256.field4003 = var28;
            }
            if (var27 > 16384 && (var28 - class256.field4003) < 5000L) {
                if ((var28 - class239.field3744) > 1000L) {
                    System.gc();
                    class239.field3744 = var28;
                }
                class276.field4226 = class148.field2427;
                class282.field4341 = 5;
            } else {
                class276.field4226 = class342.field5320;
                class282.field4341 = 5;
                class202.field3247 = 10;
            }
        } else if (class202.field3247 == 10) {
            class310.method2085(4, 104, 104);
            for (int var25 = 0; var25 < 4; var25++) {
                class326.field4990[var25] = new class25(104, 104);
            }
            class202.field3247 = 30;
            class276.field4226 = class136.field2287;
            class282.field4341 = 10;
        } else if (class202.field3247 == 30) {
            if (class136.field2284 == null) {
                class136.field2284 = new class32(class335.field5137, class157.field2554);
            }
            if (class136.field2284.method259(30181)) {
                class84.field1592 = class77.method569(true, 0, true, false, true);
                class186.field3026 = class77.method569(true, 1, true, false, true);
                class212.field3416 = class77.method569(false, 2, true, true, true);
                class331.field5069 = class77.method569(true, 3, true, false, true);
                class221.field3508 = class77.method569(true, 4, true, false, true);
                class138.field2304 = class77.method569(true, 5, true, true, true);
                class75.field1530 = class77.method569(true, 6, true, true, false);
                class136.field2278 = class77.method569(true, 7, true, false, true);
                class154.field2514 = class77.method569(true, 8, true, false, true);
                class52.field1040 = class77.method569(true, 9, true, false, true);
                class259.field4026 = class77.method569(true, 10, true, false, true);
                class118.field2060 = class77.method569(true, 11, true, false, true);
                class84.field1596 = class77.method569(true, 12, true, false, true);
                class18.field330 = class77.method569(true, 13, true, false, true);
                class235.field3698 = class77.method569(true, 14, true, false, false);
                class301.field4570 = class77.method569(true, 15, true, false, true);
                class211.field3398 = class77.method569(true, 16, true, false, true);
                class103.field1789 = class77.method569(true, 17, true, false, true);
                class62.field1188 = class77.method569(true, 18, true, false, true);
                class176.field2829 = class77.method569(true, 19, true, false, true);
                class260.field4059 = class77.method569(true, 20, true, false, true);
                class240.field3754 = class77.method569(true, 21, true, false, true);
                class104.field1799 = class77.method569(true, 22, true, false, true);
                class109.field1923 = class77.method569(true, 23, true, true, true);
                class81.field1578 = class77.method569(true, 24, true, false, true);
                class147.field2417 = class77.method569(true, 25, true, false, true);
                class48.field994 = class77.method569(true, 26, true, true, true);
                class330.field5054 = class77.method569(true, 27, true, false, true);
                class252.field3945 = class77.method569(true, 28, true, true, true);
                class202.field3247 = 40;
                class276.field4226 = class134.field2258;
                class282.field4341 = 15;
            } else {
                class282.field4341 = 12;
                class276.field4226 = class116.field2047;
            }
        } else if (class202.field3247 == 40) {
            int var23 = 0;
            for (int var24 = 0; var24 < 29; var24++) {
                var23 += class61.field1172[var24].method1071(0) * class11.field222[var24] / 100;
            }
            if (var23 == 100) {
                class282.field4341 = 20;
                class276.field4226 = class21.field450;
                class335.method2316(127, class154.field2514);
                class253.method1698((byte) 126, class154.field2514);
                class141.method916(class154.field2514, (byte) 39);
                class202.field3247 = 41;
            } else {
                if (var23 != 0) {
                    class276.field4226 = class85.field1601 + var23 + "%";
                }
                class282.field4341 = 20;
            }
        } else if (class202.field3247 == 41) {
            if (class252.field3945.method2048(-6833)) {
                this.method350(class252.field3945.method2045(0, 1), 2);
                class282.field4341 = 25;
                class276.field4226 = class256.field4004;
                class202.field3247 = 45;
            } else {
                class276.field4226 = class90.field1662 + class252.field3945.method2042((byte) 11) + "%";
                class282.field4341 = 25;
            }
        } else if (class202.field3247 == 45) {
            class21.method172(22050, 2, class191.field3110, -2603);
            class305.field4613 = new class319();
            class305.field4613.method2228(128, 9, 109);
            class41.field797 = class23.method194(22050, class216.field3456, 0, class177.field2849, 106);
            class41.field797.method1492((byte) 57, class305.field4613);
            class282.method1894(class235.field3698, class301.field4570, class221.field3508, class305.field4613, false);
            class328.field5033 = class23.method194(2048, class216.field3456, 1, class177.field2849, 112);
            class11.field230 = new class192();
            class328.field5033.method1492((byte) -120, class11.field230);
            class290.field4449 = new class334(22050, class303.field4596);
            class162.field2612 = class75.field1530.method2052("scape main", true);
            class276.field4226 = class70.field1487;
            class282.field4341 = 30;
            class202.field3247 = 50;
        } else if (class202.field3247 == 50) {
            int var21 = class156.method1007(112, class154.field2514, class18.field330);
            int var22 = class255.method1704(6);
            if (var21 < var22) {
                class282.field4341 = 35;
                class276.field4226 = class259.field4033 + var21 * 100 / var22 + "%";
            } else {
                class202.field3247 = 60;
                class276.field4226 = class283.field4372;
                class282.field4341 = 35;
            }
        } else if (class202.field3247 == 60) {
            int var2 = class246.method1626(0, class154.field2514);
            int var3 = class180.method1138(2);
            if (var2 >= var3) {
                class282.field4341 = 40;
                class202.field3247 = 65;
                class276.field4226 = class227.field3590;
            } else {
                class282.field4341 = 40;
                class276.field4226 = class38.field736 + var2 * 100 / var3 + "%";
            }
        } else if (class202.field3247 == 65) {
            class55.method431(false, class18.field330, class154.field2514);
            class282.field4341 = 45;
            class276.field4226 = class162.field2614;
            class9.method79((byte) -101, 5);
            class202.field3247 = 70;
        } else if (class202.field3247 == 70) {
            byte var9 = 0;
            class212.field3416.method2048(-6833);
            int var10 = var9 + class212.field3416.method2042((byte) 11);
            class211.field3398.method2048(-6833);
            int var11 = var10 + class211.field3398.method2042((byte) 11);
            class103.field1789.method2048(-6833);
            int var12 = var11 + class103.field1789.method2042((byte) 11);
            class62.field1188.method2048(-6833);
            int var13 = var12 + class62.field1188.method2042((byte) 11);
            class176.field2829.method2048(-6833);
            int var14 = var13 + class176.field2829.method2042((byte) 11);
            class260.field4059.method2048(-6833);
            int var15 = var14 + class260.field4059.method2042((byte) 11);
            class240.field3754.method2048(-6833);
            int var16 = var15 + class240.field3754.method2042((byte) 11);
            class104.field1799.method2048(-6833);
            int var17 = var16 + class104.field1799.method2042((byte) 11);
            class81.field1578.method2048(-6833);
            int var18 = var17 + class81.field1578.method2042((byte) 11);
            class147.field2417.method2048(-6833);
            int var19 = var18 + class147.field2417.method2042((byte) 11);
            class330.field5054.method2048(-6833);
            int var20 = var19 + class330.field5054.method2042((byte) 11);
            if (var20 >= 1100) {
                class218.method1452(97, class212.field3416);
                class210.method1422(-118, class212.field3416);
                class86.method602((byte) -116, class212.field3416);
                class172.method1089(93, class212.field3416, class136.field2278);
                class133.method873(true, class211.field3398, class136.field2278, true);
                class40.method313(-126, class136.field2278, class62.field1188);
                class209.method1414(class176.field2829, class136.field2278, class61.field1179, 0, true);
                class44.method337((byte) -85, class212.field3416);
                class313.method2134(20973, class84.field1592, class186.field3026, class260.field4059);
                class203.method1361(class212.field3416, 75);
                class317.method2184(-27015, class240.field3754, class136.field2278);
                class95.method638(-20, class104.field1799);
                class14.method101(class212.field3416, (byte) -116);
                class191.method1219(class331.field5069, class154.field2514, true, class18.field330, class136.field2278);
                class43.method325(class212.field3416, 5);
                class4.method57((byte) 100, class103.field1789);
                class14.method110(class81.field1578, class147.field2417, new class306(), 0);
                class342.method2373(class81.field1578, class147.field2417, false);
                class191.method1222((byte) -104, class212.field3416);
                class188.method1202(-89, class212.field3416);
                class266.method1770(class212.field3416, 0);
                method349(class154.field2514, class212.field3416, -15112);
                class341.method2364(class154.field2514, false, class212.field3416);
                class276.field4226 = class294.field4491;
                class282.field4341 = 50;
                class334.method2301(false);
                class202.field3247 = 80;
            } else {
                class282.field4341 = 50;
                class276.field4226 = class329.field5048 + var20 / 11 + "%";
            }
        } else if (class202.field3247 == 80) {
            int var4 = class114.method741(class154.field2514, true);
            int var5 = class52.method392(true);
            if (var4 < var5) {
                class282.field4341 = 60;
                class276.field4226 = class322.field4899 + var4 * 100 / var5 + "%";
            } else {
                class50.method379((byte) -118, class154.field2514);
                class276.field4226 = class185.field3017;
                class282.field4341 = 60;
                class202.field3247 = 90;
            }
        } else if (class202.field3247 == 90) {
            if (class48.field994.method2048(-6833)) {
                class52 var6 = new class52(class52.field1040, class48.field994, class154.field2514, 20, !class318.field4809);
                class284.method1914(var6);
                if (class331.field5068 == 1) {
                    class284.method1920(0.9F);
                }
                if (class331.field5068 == 2) {
                    class284.method1920(0.8F);
                }
                if (class331.field5068 == 3) {
                    class284.method1920(0.7F);
                }
                if (class331.field5068 == 4) {
                    class284.method1920(0.6F);
                }
                class202.field3247 = 100;
                class276.field4226 = class247.field3830;
                class282.field4341 = 70;
            } else {
                class276.field4226 = class123.field2131 + class48.field994.method2042((byte) 11) + "%";
                class282.field4341 = 70;
            }
        } else if (class202.field3247 == 100) {
            if (class158.method1023((byte) 123, class154.field2514)) {
                class202.field3247 = 110;
            }
        } else if (class202.field3247 == 110) {
            class156.field2541 = new class54();
            class177.field2849.method802(10, 126, class156.field2541);
            class282.field4341 = 75;
            class202.field3247 = 120;
            class276.field4226 = class61.field1182;
        } else if (class202.field3247 == 120) {
            if (class259.field4026.method2029("", (byte) 41, "huffman")) {
                class286 var7 = new class286(class259.field4026.method2059(true, "huffman", ""));
                class171.method1086(var7, 8);
                class282.field4341 = 80;
                class276.field4226 = class165.field2657;
                class202.field3247 = 130;
            } else {
                class282.field4341 = 80;
                class276.field4226 = class150.field2455 + "0%";
            }
        } else if (class202.field3247 == 130) {
            if (!class331.field5069.method2048(-6833)) {
                class276.field4226 = class344.field5344 + class331.field5069.method2042((byte) 11) * 3 / 4 + "%";
                class282.field4341 = 85;
            } else if (!class84.field1596.method2048(-6833)) {
                class276.field4226 = class344.field5344 + (class84.field1596.method2042((byte) 11) / 10 + 75) + "%";
                class282.field4341 = 85;
            } else if (!class18.field330.method2048(-6833)) {
                class276.field4226 = class344.field5344 + (class18.field330.method2042((byte) 11) / 20 + 85) + "%";
                class282.field4341 = 85;
            } else if (class109.field1923.method2049("details", 4)) {
                class179.method1126(true, class303.field4585, class109.field1923);
                class145.method941(class136.field2278);
                class282.field4341 = 95;
                class202.field3247 = 135;
                class276.field4226 = class41.field785;
            } else {
                class276.field4226 = class344.field5344 + ((class109.field1923.method2028("details", true) / 10) + 90) + "%";
                class282.field4341 = 85;
            }
        } else if (class202.field3247 == 135) {
            int var8 = class12.method98((byte) 102);
            if (var8 == -1) {
                class276.field4226 = class294.field4498;
                class282.field4341 = 95;
            } else if (var8 == 7 || var8 == 9) {
                this.method1631(302, "worldlistfull");
                class9.method79((byte) -101, 1000);
            } else if (class263.field4089) {
                class282.field4341 = 96;
                class276.field4226 = class42.field810;
                class202.field3247 = 140;
            } else {
                this.method1631(302, "worldlistio_" + var8);
                class9.method79((byte) -101, 1000);
            }
        } else if (class202.field3247 == 140) {
            class209.field3382 = class331.field5069.method2052("loginscreen", true);
            class138.field2304.method2054(false, (byte) 121, true);
            class75.field1530.method2054(true, (byte) 124, true);
            class154.field2514.method2054(true, (byte) 124, true);
            class18.field330.method2054(true, (byte) 125, true);
            class259.field4026.method2054(true, (byte) 123, true);
            class331.field5069.method2054(true, (byte) 127, true);
            class282.field4341 = 97;
            class202.field3247 = 150;
            class276.field4226 = class197.field3175;
            class62.field1196 = true;
        } else if (class202.field3247 == 150) {
            class207.method1401();
            if (class236.field3714) {
                class52.field1051 = 0;
                class337.field5238 = 0;
                class219.field3477 = 0;
                class259.field4028 = 0;
            }
            class236.field3714 = true;
            class271.method1824(92, class177.field2849);
            class119.method777(false, (byte) 86, -1, class52.field1051, -1);
            class202.field3247 = 160;
            class282.field4341 = 100;
            class276.field4226 = class112.field1978;
        } else if (class202.field3247 == 160) {
            class9.method82(100, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2452)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class21.method181("argument count", true);
            }
            class29.field549 = Integer.parseInt(arg0[0]);
            class260.field4068 = 2;
            if (arg0[1].equals("live")) {
                class201.field3204 = 0;
            } else if (arg0[1].equals("rc")) {
                class201.field3204 = 1;
            } else if (arg0[1].equals("wip")) {
                class201.field3204 = 2;
            } else {
                class21.method181("modewhat", true);
            }
            class63.field1219 = false;
            class321.field4894 = class337.method2324((byte) 55, arg0[2]);
            if (class321.field4894 == -1) {
                if (arg0[2].equals("english")) {
                    class321.field4894 = 0;
                } else if (arg0[2].equals("german")) {
                    class321.field4894 = 1;
                } else {
                    class21.method181("language", true);
                }
            }
            class119.method778(true, class321.field4894);
            class46.field949 = false;
            class276.field4214 = false;
            if (arg0[3].equals("game0")) {
                class324.field4954 = 0;
            } else if (arg0[3].equals("game1")) {
                class324.field4954 = 1;
            } else {
                class21.method181("game", true);
            }
            class307.field4674 = 0;
            class190.field3090 = 0;
            class246.field3814 = false;
            class228.field3604 = "";
            client var1 = new client();
            class72.field1506 = var1;
            var1.method1642(10, false, 768, 1024, 29, "runescape", class201.field3204 + 32, 537);
            class283.field4376.setLocation(40, 40);
        } catch (Exception var3) {
            class106.method694(var3, (String) null, (byte) -84);
        }
        field897++;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 2518)
    public static void method353(int arg0) {
        field905 = (byte[][]) null;
        if (arg0 == 9) {
            field906 = null;
            field910 = null;
            field911 = null;
            field908 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2537)
    private final void method354(boolean arg0) {
        if (!arg0) {
            method359((class68) null);
        }
        field918++;
        boolean var2 = class335.field5137.method1855(36);
        if (!var2) {
            this.method341((byte) -127);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkl;)Z", line = 2551)
    public static final boolean method355(class68 arg0) {
        if (class29.field551) {
            if (method359(arg0).field4125 != 0) {
                return false;
            }
            if (arg0.field1358 == 0) {
                return false;
            }
        }
        return arg0.field1435;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;", line = 2569)
    public static final String method356(int arg0, int arg1) {
        if (arg1 == 0) {
            field900++;
            return arg0 < 999999999 ? Integer.toString(arg0) : "*";
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 2584)
    public final void method357(int arg0) {
        field896++;
        if (class38.field730 == 1000) {
            return;
        }
        class25.field494++;
        if (class25.field494 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class46.field950 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class324.field4941.setSeed((long) class46.field950);
        }
        this.method354(true);
        if (class136.field2284 != null) {
            class136.field2284.method260(arg0 + 21064);
        }
        class53.method413(true);
        class268.method1782(true);
        class260.method1748(0);
        class42.method320((byte) -82);
        if (class249.field3893) {
            class258.method1726();
        }
        if (arg0 != -21185) {
            field910 = (String[]) null;
        }
        if (class240.field3751 != null) {
            int var3 = class240.field3751.method549((byte) -109);
            class157.field2567 = var3;
        }
        if (class38.field730 == 0) {
            this.method352(-126);
            class204.method1367(false);
        } else if (class38.field730 == 5) {
            this.method352(-59);
            class204.method1367(false);
        } else if (class38.field730 == 25 || class38.field730 == 28) {
            class48.method367(arg0 + 21301);
        }
        if (class38.field730 == 10) {
            this.method346(-1929);
            class211.method1429(-122);
            class286.method1935(-1);
            class247.method1634(-16);
        } else if (class38.field730 == 30) {
            class66.method512(true);
        } else if (class38.field730 == 40) {
            class247.method1634(arg0 ^ 0x52CF);
            if (class157.field2565 != -3) {
                if (class157.field2565 == 15) {
                    class30.method239((byte) -119);
                } else if (class157.field2565 != 2) {
                    class264.method1761((byte) 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2676)
    public final void init() {
        field913++;
        if (!this.method1644(-27946)) {
            return;
        }
        class29.field549 = Integer.parseInt(this.getParameter("worldid"));
        class260.field4068 = Integer.parseInt(this.getParameter("modewhere"));
        if (class260.field4068 < 0 || class260.field4068 > 1) {
            class260.field4068 = 0;
        }
        class201.field3204 = Integer.parseInt(this.getParameter("modewhat"));
        if (class201.field3204 < 0 || class201.field3204 > 2) {
            class201.field3204 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class63.field1219 = true;
        } else {
            class63.field1219 = false;
        }
        try {
            class321.field4894 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class321.field4894 = 0;
        }
        class119.method778(true, class321.field4894);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class46.field949 = true;
        } else {
            class46.field949 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class276.field4214 = true;
        } else {
            class276.field4214 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class324.field4954 = 1;
        } else {
            class324.field4954 = 0;
        }
        try {
            class190.field3090 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class190.field3090 = 0;
        }
        class228.field3604 = this.getParameter("settings");
        if (class228.field3604 == null) {
            class228.field3604 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class307.field4674 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class307.field4674 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class246.field3814 = true;
        } else {
            class246.field3814 = false;
        }
        class72.field1506 = this;
        this.method1636(class201.field3204 + 32, 503, (byte) -85, 1537, 765);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lkl;)Lkl;", line = 2767)
    public static final class68 method358(class68 arg0) {
        int var1 = method359(arg0).method1780((byte) 89);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class319.method2196(-1351736944, arg0.field1308);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lkl;)Lcd;", line = 2790)
    public static final class268 method359(class68 arg0) {
        class268 var1 = (class268) class222.field3516.method303(((long) arg0.field1284 << 32) + (long) arg0.field1365, (byte) 121);
        return var1 == null ? arg0.field1407 : var1;
    }
}
