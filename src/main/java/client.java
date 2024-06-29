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
public class client extends class221 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
    public static int[] field2565 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!client", name = "B", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 4)
    public static final void method1134() {
        boolean var0 = class137.field2145 == 1 && class107.field1500 > 200 || class137.field2145 == 0 && class107.field1500 > 50;
        for (int var1 = 0; var1 < class107.field1500; var1++) {
            class219 var10 = class216.field3517[class132.field2063[var1]];
            if (var10.method1567(false)) {
                var10.method375(46);
                if (var10.field726 >= 0 && var10.field720 >= 0 && var10.field710 < class80.field1003 && var10.field711 < class380.field5751) {
                    var10.field3615 = var10.field1831 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field1819) {
                        var11++;
                    }
                    if (var10.field1863 > class183.field2987) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method903(-128) << 2);
                    if (class8.field103 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field1864 = var12 + 1;
                } else {
                    var10.field1864 = -1;
                }
            } else {
                var10.field1864 = -1;
            }
        }
        for (int var2 = 0; var2 < class397.field5940; var2++) {
            class50 var7 = class39.field499[class423.field6253[var2]];
            if (var7.method320(false) && var7.field615.method1615(-108)) {
                var7.method375(39);
                if (var7.field726 >= 0 && var7.field720 >= 0 && var7.field710 < class80.field1003 && var7.field711 < class380.field5751) {
                    int var8 = 0;
                    if (!var7.field1819) {
                        var8++;
                    }
                    if (var7.field1863 > class183.field2987) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method903(-57) << 2);
                    if (class8.field103 == 0) {
                        if (var7.field615.field3770) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class8.field103 == 1) {
                        if (var7.field615.field3770) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field615.field3803) {
                        var9 += 512;
                    } else if (!var7.field615.field3801) {
                        var9 += 256;
                    }
                    var7.field1864 = var9 + 1;
                } else {
                    var7.field1864 = -1;
                }
            } else {
                var7.field1864 = -1;
            }
        }
        for (int var3 = 0; var3 < class256.field4144.length; var3++) {
            class136 var4 = class256.field4144[var3];
            if (var4 != null) {
                if (var4.field2124 == 1) {
                    class50 var5 = class39.field499[var4.field2121];
                    if (var5 != null && var5.field1864 >= 0) {
                        var5.field1864 += 1024;
                    }
                } else if (var4.field2124 == 10) {
                    class219 var6 = class216.field3517[var4.field2121];
                    if (var6 != null && var6.field1864 >= 0) {
                        var6.field1864 += 1024;
                    }
                }
            }
        }
        class261.field4201.field1864 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 142)
    private final void method1135(byte[] arg0, int arg1) {
        field2562++;
        if (arg1 != -7653) {
            field2565 = null;
        }
        class186 var3 = new class186(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method1322(false);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class50.field618 = new int[6];
                    var5[0] = var3.method1272((byte) -71);
                    var5[1] = var3.method1272((byte) -102);
                    var5[2] = var3.method1272((byte) -118);
                    var5[3] = var3.method1272((byte) -67);
                    var5[4] = var3.method1272((byte) -76);
                    var5[5] = var3.method1272((byte) -54);
                } else if (var4 == 4) {
                    int var6 = var3.method1322(false);
                    class114.field1574 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class114.field1574[var7] = var3.method1272((byte) -112);
                        if (class114.field1574[var7] == 65535) {
                            class114.field1574[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 196)
    public static final void method1136() {
        class145.field2275 = 0;
        for (int var0 = 0; var0 < class397.field5940; var0++) {
            class50 var1 = class39.field499[class423.field6253[var0]];
            if (var1.field1819 && var1.method322(-26228) != -1) {
                int var2 = (var1.method903(-53) - 1) * 64 + 60;
                int var3 = var1.field724 - var2 >> 7;
                int var4 = var1.field722 - var2 >> 7;
                class124 var5 = class111.method820(class266.field4286, var3, var4, false);
                if (var5 != null) {
                    int var6 = var5.field1868;
                    if (var5 instanceof class50) {
                        var6 += 2048;
                    }
                    if (var5.field1834 == 0 && var5.method322(-26228) != -1) {
                        class390.field5861[class145.field2275] = var6;
                        class246.field4037[class145.field2275] = var6;
                        class145.field2275++;
                        var5.field1834++;
                    }
                    class390.field5861[class145.field2275] = var6;
                    class246.field4037[class145.field2275] = var1.field1868 + 2048;
                    class145.field2275++;
                    var5.field1834++;
                }
            }
        }
        class60.method395(class145.field2275 - 1, class246.field4037, -1, class390.field5861, 0);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 251)
    public static final void method1137() {
        int var0 = class77.field963 ? class107.field1500 : class397.field5940 + class107.field1500;
        for (int var1 = -1; var1 < var0; var1++) {
            class124 var2;
            if (var1 < 0) {
                var2 = class261.field4201;
            } else if (var1 < class107.field1500) {
                var2 = class216.field3517[class132.field2063[var1]];
            } else {
                var2 = class39.field499[class423.field6253[var1 - class107.field1500]];
            }
            var2.field1834 = 0;
            if (var2.field1864 < 0) {
                var2.field1819 = false;
            } else {
                int var3 = var2.method903(-33);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field724 & 0x7F) != 0 || (var2.field722 & 0x7F) != 0) {
                        var2.field1819 = false;
                        continue;
                    }
                } else if ((var2.field724 & 0x7F) != 64 || (var2.field722 & 0x7F) != 64) {
                    var2.field1819 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field724 >> 7;
                    int var5 = var2.field722 >> 7;
                    if (class241.field3993[var4][var5] != var2.field1864) {
                        var2.field1819 = true;
                        continue;
                    }
                    if (class97.field1364[var4][var5] > 1) {
                        var10002 = class97.field1364[var4][var5]--;
                        var2.field1819 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field724 - var6 >> 7;
                    int var8 = var2.field722 - var6 >> 7;
                    int var9 = var2.field724 + var6 >> 7;
                    int var10 = var2.field722 + var6 >> 7;
                    if (!class220.method1572(true, var8, var10, var2.field1864, var9, var7)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class241.field3993[var11][var12] == var2.field1864) {
                                    var10002 = class97.field1364[var11][var12]--;
                                }
                            }
                        }
                        var2.field1819 = true;
                        continue;
                    }
                }
                if (var2 instanceof class219 && var2.field1904 != null && class183.field2987 >= var2.field1908 && class183.field2987 < var2.field1900) {
                    ((class219) var2).field3615 = false;
                }
                var2.field1819 = false;
                var2.field721 = class58.method386(class266.field4286, (byte) -119, var2.field724, var2.field722);
                class239.method1689(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 366)
    public static void method1138(int arg0) {
        if (arg0 == 10) {
            field2565 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 380)
    public static final void method1139() {
        for (int var0 = 0; var0 < class80.field1003; var0++) {
            int[] var1 = class241.field3993[var0];
            for (int var2 = 0; var2 < class380.field5751; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 397)
    private final void method1140(int arg0) {
        field2573++;
        if (arg0 >= -104) {
            this.method1135((byte[]) null, 127);
        }
        boolean var2 = class298.field4739.method1838(1);
        if (!var2) {
            this.method1154(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 412)
    public final void method1141(int arg0) {
        field2564++;
        method1138(10);
        class98.method741(-1);
        class344.method2250((byte) 22);
        class221.method1584(-31051);
        class413.method2585(-27817);
        class435.method2681(true);
        class312.method2089((byte) -113);
        class45.method296(-18458);
        class136.method997(14295);
        class186.method1274((byte) 72);
        class156.method1097(-20126);
        class272.method1852(-127);
        class280.method1912(118);
        class330.method2190(118);
        class292.method1963((byte) 96);
        class447.method2786(0);
        class409.method2568((byte) -118);
        class52.method330((byte) 59);
        class50.method315(-122);
        class338.method2232(true);
        class72.method451((byte) 105);
        class21.method155((byte) 14);
        class362.method2344(-1);
        class267.method1816(-1007544913);
        class385.method2441(-125);
        class172.method1198(0);
        class364.method2346(36);
        class219.method1562((byte) -44);
        class256.method1777(-118);
        class37.method243(500);
        class353.method2299(1);
        class199.method1391(115);
        class214.method1505(true);
        class216.method1548((byte) -54);
        class208.method1472(-1);
        class417.method2604(1550411184);
        class124.method911((byte) -113);
        class232.method1650((byte) 43);
        class359.method2338(14530);
        class271.method1835(0);
        class196.method1371(-16777216);
        class53.method355(0);
        class245.method1708(-127);
        class275.method1857((byte) 117);
        class325.method2158(124);
        class86.method533((byte) 21);
        class348.method2264(-1);
        class129.method955(true);
        class198.method1384((byte) -111);
        class62.method405((byte) 24);
        class8.method93(-125);
        class80.method504(-103);
        class161.method1125(true);
        class54.method362(0);
        class114.method837(1582366825);
        class313.method2096(false);
        class380.method2422(true);
        class209.method1475(122);
        class318.method2114(18106);
        class407.method2551(240446186);
        class386.method2445(1);
        class239.method1691(1);
        class108.method811((byte) -87);
        class315.method2103(66);
        class81.method505(-9);
        class127.method941(2);
        class77.method483(81);
        class375.method2395((byte) 109);
        class163.method1132(0);
        class230.method1633((byte) 108);
        class226.method1622((byte) 123);
        class97.method736(-581581201);
        class392.method2478(-122);
        class190.method1336(0);
        class74.method476(128);
        class311.method2081(117);
        class115.method842(-722148948);
        class144.method1045((byte) -89);
        class139.method1014(-78);
        class322.method2137(-6980);
        class257.method1781(113);
        class67.method426((byte) -44);
        class3.method67((byte) 9);
        class1.method3(25458);
        class326.method2167(-109);
        class305.method2053(14994);
        class250.method1730(false);
        class112.method827(false);
        class345.method2256(17142);
        class192.method1354();
        class151.method1068((byte) 123);
        class331.method2198((byte) -125);
        class354.method2304((byte) 81);
        class241.method1697(69);
        class261.method1798(-19464);
        class126.method928(125);
        class155.method1091((byte) 69);
        class17.method139();
        class400.method2520();
        class189.method1333(0);
        class222.method1591(66);
        class148.method1055();
        class388.method2456(false);
        class324.method2145(-2789);
        class255.method1759((byte) 124);
        class134.method987(21813);
        class234.method1656((byte) -86);
        class342.method2246(0);
        class382.method2428((byte) 126);
        class309.method2075(19973);
        class7.method89(0);
        class235.method1666(-2);
        class440.method2710((byte) -102);
        class402.method2530(true);
        class73.method474(0);
        class51.method324(true);
        class68.method429(72);
        class349.method2283(28921);
        class379.method2418(-116);
        class42.method280(false);
        class185.method1265(-20473);
        class180.method1237(0);
        class201.method1396(-119);
        class132.method966(false);
        class270.method1830((byte) 119);
        class125.method918(197);
        class290.method1953(false);
        class138.method1010((byte) -69);
        class218.method1560(0);
        class71.method446(0);
        class308.method2067(-80);
        class296.method1999((byte) -47);
        class429.method2654(1603297761);
        class85.method520((byte) 119);
        class27.method178((byte) -48);
        class403.method2533(true);
        class439.method2701();
        class179.method1226(0);
        class343.method2249(5);
        class150.method1062((byte) 35);
        class415.method2597(127);
        class57.method373(0);
        class120.method867((byte) -124);
        class306.method2057((byte) -45);
        class142.method1037((byte) 120);
        class78.method490();
        class70.method439(56);
        class262.method1799(-71);
        class369.method2374(-13423323);
        class191.method1338((byte) 94);
        class101.method763(28198);
        class89.method537(4372);
        class303.method2035(-1);
        class247.method1714(-117);
        class102.method765(8);
        class84.method518(126);
        class436.method2688((byte) -125);
        class449.method2797((byte) 110);
        class351.method2290(-120);
        class33.method223((byte) 6);
        class59.method388(0);
        class299.method2018(2);
        class427.method2645(false);
        class317.method2111(107);
        class211.method1486((byte) -56);
        class58.method380(-1);
        class121.method869(true);
        class203.method1446((byte) 118);
        class377.method2401(-24255);
        class63.method409((byte) -124);
        class44.method293();
        class336.method2218((byte) 119);
        class236.method1670((byte) -56);
        class13.method121(12469);
        class166.method1170((byte) -120);
        class321.method2134(-86);
        class32.method216((byte) -109);
        class110.method818(9790);
        class91.method544(true);
        class9.method100(false);
        class193.method1357(-113);
        class181.method1245(98);
        class304.method2042(10);
        class284.method1931((byte) 43);
        class285.method1937((byte) 80);
        class212.method1491(115);
        class128.method954((byte) 105);
        class426.method2644(-123);
        class113.method833();
        class11.method107((byte) -5);
        class252.method1752(-37);
        class56.method365(-1);
        class75.method479((byte) 79);
        class183.method1251((byte) 125);
        class265.method1812(250);
        class182.method1246(2);
        class391.method2467(97);
        class130.method958(2);
        class105.method794(-102);
        class107.method805(17872);
        class237.method1676();
        class205.method1452(125);
        class328.method2178((byte) -108);
        class381.method2425((byte) -73);
        class444.method2754(false);
        class367.method2359(false);
        class264.method1808((byte) -108);
        class220.method1573((byte) -127);
        class419.method2614();
        class228.method1631();
        class329.method2181(0);
        class135.method991(-3);
        class300.method2019((byte) 12);
        class243.method1705((byte) -77);
        class423.method2627(0);
        class249.method1725((byte) 83);
        class160.method1117(true);
        class119.method861(2);
        class143.method1044(false);
        class350.method2287((byte) -79);
        class278.method1873();
        class174.method1219();
        class248.method1718(109);
        class39.method263(29357);
        class251.method1746();
        class302.method2027(false);
        class30.method208(-126);
        class374.method2387(1960899489);
        class450.method2805(13);
        class368.method2365(-31339);
        class314.method2101(-95);
        class376.method2399(true);
        class28.method182(64);
        class358.method2335((byte) 88);
        class281.method1920(255);
        class158.method1108(true);
        class297.method2002(-127);
        class213.method1501(-110);
        class431.method2670(true);
        class145.method1048(32026);
        class223.method1600((byte) -20);
        class361.method2343(true);
        class286.method1938(-72);
        if (arg0 > -35) {
            field2565 = null;
        }
        class40.method269(97);
        class432.method2671(-4348);
        class29.method187(256);
        class282.method1922((byte) 107);
        class337.method2221((byte) -128);
        class141.method1025(7832);
        class162.method1129((byte) 105);
        class217.method1554(-110);
        class372.method2377((byte) 14);
        class287.method1940(true);
        class61.method396(0);
        class258.method1785(true);
        class424.method2630((byte) -42);
        class441.method2715(78);
        class421.method2621((byte) -126);
        class411.method2580(2);
        class414.method2590(false);
        class60.method393(122);
        class373.method2382(-8840);
        class246.method1711(28);
        class140.method1023(96);
        class36.method237((byte) -93);
        class64.method414((byte) -15);
        class41.method273(-26);
        class38.method259(0);
        class396.method2496(4096);
        class291.method1957(false);
        class316.method2106((byte) 40);
        class390.method2464(-119);
        class31.method211((byte) -89);
        class12.method112(-3);
        class263.method1805((byte) -87);
        class430.method2664((byte) 107);
        class79.method501(true);
        class288.method1948((byte) 54);
        class298.method2013(118);
        class433.method2678(-45);
        class35.method231((byte) 113);
        class238.method1687(122);
        class19.method144(112);
        class122.method896();
        class310.method2077();
        class111.method826(true);
        class99.method743((byte) -85);
        class422.method2626(true);
        class357.method2330((byte) -122);
        class397.method2498(0);
        class428.method2651((byte) 108);
        class254.method1757(19165);
        class277.method1866(false);
        class412.method2581(-30472);
        class341.method2240((byte) 50);
        class173.method1213(false);
        class43.method287(-3);
        class405.method2543((byte) 63);
        class410.method2575(1976897985);
        class395.method2492(-117);
        class117.method856((byte) -31);
        class269.method1827(538277583);
        class106.method803((byte) -78);
        class418.method2613(-1);
        class225.method1610(-1);
        class92.method546((byte) -15);
        class104.method793(-4706);
        class224.method1607(13);
        class394.method2487(true);
        class82.method509(-60);
        class152.method1073(true);
        class47.method300(-531180500);
        if (class221.field3679) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 735)
    public final void method1142(int arg0) {
        if (class52.field636) {
            class8.method94(true);
        }
        field2569++;
        if (class284.field4547 != null) {
            class284.field4547.method2091(-15001);
        }
        if (class395.field5920 != null) {
            class303.method2036(arg0 + 5358, class63.field822, class395.field5920);
            class395.field5920 = null;
        }
        if (class182.field2981 != null) {
            class182.field2981.field572 = false;
        }
        class182.field2981 = null;
        if (class421.field6216 != null) {
            class421.field6216.method1098((byte) 118);
            class421.field6216 = null;
        }
        class330.method2188((byte) 56, class86.field1073);
        class50.method318(class86.field1073, true);
        if (class265.field4264 != null) {
            class265.field4264.method1001(21207, class86.field1073);
        }
        class142.method1036((byte) -26);
        class417.method2611(-1);
        class265.field4264 = null;
        if (class441.field6457 != null) {
            class441.field6457.method1549(arg0 ^ 0x1493);
        }
        if (class313.field4928 != null) {
            class313.field4928.method1549(arg0 + 5466);
        }
        class298.field4739.method1836((byte) -69);
        class382.field5773.method1910(arg0 ^ 0xFFFFEB64);
        if (class316.field4957 != null) {
            class316.field4957.method1727(-19432);
            class316.field4957 = null;
        }
        if (arg0 != -5342) {
            field2565 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 797)
    public static final void method1143() {
        int var0 = class77.field963 ? class107.field1500 : class397.field5940 + class107.field1500;
        for (int var1 = -1; var1 < var0; var1++) {
            class124 var2;
            if (var1 < 0) {
                var2 = class261.field4201;
            } else if (var1 < class107.field1500) {
                var2 = class216.field3517[class132.field2063[var1]];
            } else {
                var2 = class39.field499[class423.field6253[var1 - class107.field1500]];
            }
            if (var2.field1864 >= 0) {
                int var3 = var2.method903(-45);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field724 & 0x7F) == 0 && (var2.field722 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field724 & 0x7F) == 64 && (var2.field722 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class219 && var2.field1904 != null && class183.field2987 >= var2.field1908 && class183.field2987 < var2.field1900) {
                    ((class219) var2).field3615 = false;
                }
                var2.field721 = class58.method386(class266.field4286, (byte) -110, var2.field724, var2.field722);
                class239.method1689(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lne;)Z", line = 844)
    public static final boolean method1144(class172 arg0) {
        if (class80.field1000) {
            if (method1149(arg0).field671 != 0) {
                return false;
            }
            if (arg0.field2707 == 0) {
                return false;
            }
        }
        return arg0.field2809;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 857)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class441.method2712("argument count", -324293588);
            }
            class64.field841 = Integer.parseInt(arg0[0]);
            class141.field2184 = 2;
            if (arg0[1].equals("live")) {
                class348.field5355 = 0;
            } else if (arg0[1].equals("rc")) {
                class348.field5355 = 1;
            } else if (arg0[1].equals("wip")) {
                class348.field5355 = 2;
            } else {
                class441.method2712("modewhat", -324293588);
            }
            class205.field3298 = class82.method510(-7931, arg0[2]);
            if (class205.field3298 == -1) {
                if (arg0[2].equals("english")) {
                    class205.field3298 = 0;
                } else if (arg0[2].equals("german")) {
                    class205.field3298 = 1;
                } else {
                    class441.method2712("language", -324293588);
                }
            }
            class298.method2009(class205.field3298, (byte) -108);
            class199.field3216 = false;
            class115.field1599 = false;
            if (arg0[3].equals("game0")) {
                class61.field787 = 0;
            } else if (arg0[3].equals("game1")) {
                class61.field787 = 1;
            } else {
                class441.method2712("game", -324293588);
            }
            class140.field2176 = class61.field787;
            class272.field4379 = 0;
            class173.field2882 = 0;
            class341.field5264 = "";
            client var1 = new client();
            class97.field1359 = var1;
            var1.method1582(false, 564, class348.field5355 + 32, 768, 29, class61.field787 == 1 ? "stellardawn" : "runescape", true, 1024);
            class47.field587.setLocation(40, 40);
        } catch (Exception var3) {
            class272.method1845(var3, 126, (String) null);
        }
        field2559++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 923)
    public final void method1145(int arg0) {
        field2572++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class312.method2095(-112);
        class382.field5773 = new class280(class63.field822);
        class298.field4739 = new class272();
        if (class348.field5355 != 0) {
            class321.field5015 = new byte[50][];
        }
        class380.method2421(class63.field822, false);
        if (class141.field2184 == 0) {
            class316.field4959 = this.getCodeBase().getHost();
            class424.field6264 = 443;
            class382.field5769 = 43594;
        } else if (class141.field2184 == 1) {
            class316.field4959 = this.getCodeBase().getHost();
            class424.field6264 = class64.field841 + 50000;
            class382.field5769 = class64.field841 + 40000;
        } else if (class141.field2184 == 2) {
            class316.field4959 = "127.0.0.1";
            class382.field5769 = class64.field841 + 40000;
            class424.field6264 = class64.field841 + 50000;
        }
        class422.field6235 = class382.field5769;
        class11.field153 = class382.field5769;
        class196.field3170 = class424.field6264;
        class430.field6323 = class316.field4959;
        if (class61.field787 == 1) {
            class128.field2030 = class110.field1526;
            class121.field1691 = 16777215;
            class245.field4028 = class358.field5485;
            class82.field1011 = 0;
            class140.field2179 = class337.field5231;
            class183.field2983 = true;
            class343.field5287 = class330.field5160;
        } else {
            class128.field2030 = class102.field1418;
            class140.field2179 = class418.field6191;
            class245.field4028 = class328.field5144;
            class343.field5287 = class427.field6302;
        }
        class156.field2456 = class428.field6306 = class29.field357 = class223.field3714 = new short[256];
        if (class279.field4460 == 3) {
            class155.field2434 = class64.field841;
        }
        class299.field4756 = class11.field153;
        class60.method391((byte) -116);
        class94.method555(119, class86.field1073);
        class435.method2682(class86.field1073, (byte) 68);
        class265.field4264 = class50.method321(0);
        if (class265.field4264 != null) {
            class265.field4264.method1004(class86.field1073, true);
        }
        class402.field5993 = class279.field4460;
        try {
            if (class63.field822.field4463 != null) {
                class107.field1504 = new class409(class63.field822.field4463, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class126.field1934[var3] = new class409(class63.field822.field4472[var3], 6000, 0);
                }
                class256.field4141 = new class409(class63.field822.field4474, 6000, 0);
                class272.field4372 = new class333(255, class107.field1504, class256.field4141, 500000);
                class212.field3404 = new class409(class63.field822.field4475, 24, 0);
                class63.field822.field4463 = null;
                class63.field822.field4475 = null;
                class63.field822.field4472 = null;
                class63.field822.field4474 = null;
            }
        } catch (IOException var4) {
            class107.field1504 = null;
            class212.field3404 = null;
            class272.field4372 = null;
            class256.field4141 = null;
        }
        if (class61.field787 == 0) {
            class222.field3687 = class261.field4197;
        } else if (class61.field787 == 1) {
            class222.field3687 = class263.field4249;
        }
        if (class141.field2184 != 0) {
            class323.field5044 = true;
        }
        if (arg0 != -22253) {
            field2565 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1045)
    private final void method1146(boolean arg0) {
        field2560++;
        class269.field4316 = 0;
        while (class426.method2639(58) && class269.field4316 < 128) {
            if (!class211.method1483((byte) -42) || class140.field2180 != '`' && class140.field2180 != '§') {
                class271.field4342[class269.field4316] = class444.field6479;
                class291.field4651[class269.field4316] = class140.field2180;
                class269.field4316++;
            } else if (class409.method2569(6324)) {
                class61.method397(-14965);
            } else {
                class291.method1956((byte) 110);
            }
        }
        if (class409.method2569(6324)) {
            class375.method2391((byte) -63);
        }
        class62.field807++;
        class405.method2540(-1, -1, (class172) null, -1);
        class421.method2620(-124, (class172) null, -1, -1);
        class298.method2007(-1265899832);
        class223.field3724++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class50 var12 = class39.field499[var2];
            if (var12 != null) {
                byte var13 = var12.field615.field3782;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method903(-99);
                    if ((var13 & 0x2) != 0 && var12.field1909 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field1906[0] + var15;
                            int var18 = var12.field1916[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > (class80.field1003 - (var14 + 1))) {
                                var17 = class80.field1003 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (class380.field5751 - (var14 + 1) < var18) {
                                var18 = class380.field5751 - var14 - 1;
                            }
                            int var19 = class341.method2239(var18, class33.field413, var14, -3, var14, class73.field921, var12.field1906[0], var17, class162.field2547[var12.field714], -1, 0, var14, true, 0, var12.field1916[0]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field1906[var20] = class73.field921[var19 - var20 - 1];
                                    var12.field1916[var20] = class33.field413[var19 - var20 - 1];
                                    var12.field1912[var20] = 1;
                                }
                                var12.field1909 = var19;
                            }
                        }
                    }
                    class36.method234(var12, -2, true);
                    int var21 = class94.method552(var12, true);
                    class271.method1833(-44, var12, var21, class415.field6145, class290.field4634);
                    class98.method742(58, var12);
                }
            }
        }
        if (!arg0) {
            field2565 = null;
        }
        if (class300.field4760 == 0 && class31.field389 == 0) {
            if (class13.field194 == 2) {
                class258.method1786((byte) -36);
            } else {
                class351.method2294(-1451675060);
            }
            if ((class427.field6301 >> 7) < 14 || class80.field1003 - 14 <= class427.field6301 >> 7 || (class290.field4631 >> 7) < 14 || class290.field4631 >> 7 >= class380.field5751 - 14) {
                class308.method2065(-1);
            }
        }
        while (true) {
            class150 var3;
            class172 var4;
            class172 var5;
            do {
                var3 = (class150) class151.field2360.method248(-24951);
                if (var3 == null) {
                    while (true) {
                        class150 var6;
                        class172 var7;
                        class172 var8;
                        do {
                            var6 = (class150) class407.field6041.method248(-24951);
                            if (var6 == null) {
                                while (true) {
                                    class150 var9;
                                    class172 var10;
                                    class172 var11;
                                    do {
                                        var9 = (class150) class107.field1499.method248(-24951);
                                        if (var9 == null) {
                                            if (class329.field5152 != null) {
                                                class120.method865((byte) 109);
                                            }
                                            if ((class183.field2987 % 1500) == 0) {
                                                class91.method543((byte) -118);
                                            }
                                            class127.method937(71);
                                            if (class52.field636 && (class46.method297(27104) - 60000L) > class59.field762) {
                                                class8.method94(true);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2348;
                                        if (var10.field2693 < 0) {
                                            break;
                                        }
                                        var11 = class196.method1375(var10.field2735, (byte) -56);
                                    } while (var11 == null || var11.field2866 == null || var11.field2866.length <= var10.field2693 || var11.field2866[var10.field2693] != var10);
                                    class17.method135(var9);
                                }
                            }
                            var7 = var6.field2348;
                            if (var7.field2693 < 0) {
                                break;
                            }
                            var8 = class196.method1375(var7.field2735, (byte) -56);
                        } while (var8 == null || var8.field2866 == null || var8.field2866.length <= var7.field2693 || var8.field2866[var7.field2693] != var7);
                        class17.method135(var6);
                    }
                }
                var4 = var3.field2348;
                if (var4.field2693 < 0) {
                    break;
                }
                var5 = class196.method1375(var4.field2735, (byte) -56);
            } while (var5 == null || var5.field2866 == null || var4.field2693 >= var5.field2866.length || var5.field2866[var4.field2693] != var4);
            class17.method135(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLne;I)V", line = 1270)
    public static final void method1147(int arg0, boolean arg1, class172 arg2, int arg3) {
        if (arg1) {
            return;
        }
        if (arg2.field2835 == 0) {
            arg2.field2766 = arg2.field2739;
        } else if (arg2.field2835 == 1) {
            arg2.field2766 = (arg0 - arg2.field2705) / 2 + arg2.field2739;
        } else if (arg2.field2835 == 2) {
            arg2.field2766 = arg0 - arg2.field2705 - arg2.field2739;
        } else if (arg2.field2835 == 3) {
            arg2.field2766 = arg2.field2739 * arg0 >> 14;
        } else if (arg2.field2835 == 4) {
            arg2.field2766 = (arg0 - arg2.field2705) / 2 + (arg2.field2739 * arg0 >> 14);
        } else {
            arg2.field2766 = arg0 - (arg2.field2739 * arg0 >> 14) - arg2.field2705;
        }
        field2568++;
        if (arg2.field2824 == 0) {
            arg2.field2726 = arg2.field2828;
        } else if (arg2.field2824 == 1) {
            arg2.field2726 = (arg3 - arg2.field2834) / 2 + arg2.field2828;
        } else if (arg2.field2824 == 2) {
            arg2.field2726 = arg3 - (arg2.field2834 + arg2.field2828);
        } else if (arg2.field2824 == 3) {
            arg2.field2726 = arg2.field2828 * arg3 >> 14;
        } else if (arg2.field2824 == 4) {
            arg2.field2726 = (arg2.field2828 * arg3 >> 14) + (arg3 - arg2.field2834) / 2;
        } else {
            arg2.field2726 = arg3 - arg2.field2834 - (arg2.field2828 * arg3 >> 14);
        }
        if (!class80.field1000 || method1149(arg2).field671 == 0 && arg2.field2707 != 0) {
            return;
        }
        if (arg2.field2766 < 0) {
            arg2.field2766 = 0;
        } else if (arg2.field2766 + arg2.field2705 > arg0) {
            arg2.field2766 = arg0 - arg2.field2705;
        }
        if (arg2.field2726 < 0) {
            arg2.field2726 = 0;
        } else if ((arg2.field2834 + arg2.field2726) > arg3) {
            arg2.field2726 = arg3 - arg2.field2834;
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1340)
    public final void method1148(int arg0) {
        field2561++;
        if (class262.field4219 == 1000) {
            return;
        }
        long var2 = class73.method472((byte) -101) / 1000000L - class340.field5260;
        class340.field5260 = class73.method472((byte) -101) / 1000000L;
        boolean var4 = class413.method2588(true);
        if (var4 && class241.field3998 && class441.field6457 != null) {
            class441.field6457.method1550(2000);
        }
        if (class262.field4219 == 30 || class262.field4219 == 10) {
            if (class232.field3870 != 0L && class46.method297(27104) > class232.field3870) {
                class50.method319(false, class417.field6163, class199.method1386((byte) 112), 10371, class343.field5286);
            } else if (class284.field4547.method568() && class191.field3117) {
                class267.method1822(-125);
            }
        }
        if (class395.field5920 == null) {
            Container var5;
            if (class47.field587 == null) {
                var5 = class63.field822.field4464;
            } else {
                var5 = class47.field587;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class47.field587 == var5) {
                Insets var8 = class47.field587.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class318.field4984 != var6 || class284.field4567 != var7) {
                if (class284.field4547 == null || class284.field4547.method621()) {
                    class312.method2095(-79);
                } else {
                    class318.field4984 = var6;
                    class284.field4567 = var7;
                }
                class232.field3870 = class46.method297(arg0 + 27019) + 500L;
            }
        }
        if (arg0 != 85) {
            this.method1148(44);
        }
        if (class395.field5920 != null && !class348.field5345 && (class262.field4219 == 30 || class262.field4219 == 10)) {
            class50.method319(false, -1, class317.field4970, 10371, -1);
        }
        boolean var9 = false;
        if (class208.field3353) {
            var9 = true;
            class208.field3353 = false;
        }
        if (var9) {
            class403.method2537(-12029);
        }
        if (class284.field4547 != null && class284.field4547.method581() || class199.method1386((byte) -81) != 1) {
            class193.method1356((byte) 106);
        }
        if (class262.field4219 == 0) {
            class64.method412(class367.field5571[class140.field2176], arg0 + 30735, class97.field1300[class140.field2176], class32.field406[class140.field2176], class70.field873, var9, class173.field2887);
        } else if (class262.field4219 == 5) {
            class134.method982(class284.field4547.method581() | var9, class11.field133, 25427, class284.field4547, class32.field406[class140.field2176].getRGB(), class367.field5571[class140.field2176].getRGB(), class97.field1300[class140.field2176].getRGB());
        } else if (class262.field4219 == 10) {
            class131.method962((byte) 122);
        } else if (class262.field4219 == 25 || class262.field4219 == 28) {
            if (class201.field3224 == 1) {
                if (class32.field404 < class322.field5031) {
                    class32.field404 = class322.field5031;
                }
                int var11 = (class32.field404 - class322.field5031) * 50 / class32.field404;
                class136.method996(class330.field5168 + "<br>(" + var11 + "%)", true, (byte) -92, class435.field6411);
            } else if (class201.field3224 == 2) {
                if (class239.field3975 > class63.field827) {
                    class63.field827 = class239.field3975;
                }
                int var10 = ((class63.field827 - class239.field3975) * 50 / class63.field827) + 50;
                class136.method996(class330.field5168 + "<br>(" + var10 + "%)", true, (byte) -90, class435.field6411);
            } else {
                class136.method996(class330.field5168, true, (byte) -106, class435.field6411);
            }
        } else if (class262.field4219 == 30) {
            class173.method1207(5, var2);
        } else if (class262.field4219 == 40) {
            class136.method996(class72.field895 + "<br>" + class263.field4231, true, (byte) -68, class435.field6411);
        }
        if (class377.field5698 == 3) {
            for (int var12 = 0; var12 < class125.field1929; var12++) {
                Rectangle var13 = class119.field1631[var12];
                if (class27.field310[var12]) {
                    class284.field4547.method2086(var13.width, var13.x, var13.height, -1996553985, -765, var13.y);
                } else if (class239.field3976[var12]) {
                    class284.field4547.method2086(var13.width, var13.x, var13.height, -1996554240, -765, var13.y);
                }
            }
        }
        if (class409.method2569(6324)) {
            class152.method1075(3351159, class284.field4547);
        }
        if ((class262.field4219 == 30 || class262.field4219 == 10) && class377.field5698 == 0 && class199.method1386((byte) 101) == 1 && !var9 && class279.field4457.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class125.field1929; var15++) {
                if (class239.field3976[var15]) {
                    class239.field3976[var15] = false;
                    class132.field2060[var14++] = class119.field1631[var15];
                }
            }
            class284.field4547.method665(class132.field2060, var14);
        } else if (class262.field4219 != 0) {
            class284.field4547.method591();
            for (int var16 = 0; var16 < class125.field1929; var16++) {
                class239.field3976[var16] = false;
            }
        }
        if (class183.field2996 == 0) {
            class84.method517((byte) 122, 15L);
        } else if (class183.field2996 == 1) {
            class84.method517((byte) 127, 10L);
        } else if (class183.field2996 == 2) {
            class84.method517((byte) -24, 5L);
        } else if (class183.field2996 == 3) {
            class84.method517((byte) 125, 2L);
        }
        if (class186.field3069) {
            class236.method1668((byte) -125);
        }
        if (class392.field5887 && class262.field4219 == 10 && class306.field4847 != -1) {
            class392.field5887 = false;
            class306.method2062((byte) 115, class63.field822);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lne;)Lhk;", line = 1578)
    public static final class53 method1149(class172 arg0) {
        class53 var1 = (class53) class372.field5628.method1770(-880, ((long) arg0.field2865 << 32) + (long) arg0.field2693);
        return var1 == null ? arg0.field2709 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 1582)
    private final void method1150(int arg0, byte arg1) {
        class390.field5867 = 0;
        if (arg1 != -120) {
            field2565 = null;
        }
        field2566++;
        class426.field6283 = null;
        class298.field4739.field4386++;
        class298.field4739.field4385 = arg0;
        class201.field3229 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 1600)
    public static final void method1151() {
        for (int var0 = -1; var0 < class397.field5940 + class107.field1500; var0++) {
            class124 var1;
            if (var0 < 0) {
                var1 = class261.field4201;
            } else if (var0 < class107.field1500) {
                var1 = class216.field3517[class132.field2063[var0]];
            } else {
                var1 = class39.field499[class423.field6253[var0 - class107.field1500]];
            }
            if (var1.field1864 >= 0) {
                int var2 = var1.method903(-112);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field724 & 0x7F) != 0 || (var1.field722 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field724 & 0x7F) != 64 || (var1.field722 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field724 >> 7;
                    int var4 = var1.field722 >> 7;
                    if (var1.field1864 > class241.field3993[var3][var4]) {
                        class241.field3993[var3][var4] = var1.field1864;
                        class97.field1364[var3][var4] = 1;
                    } else if (class241.field3993[var3][var4] == var1.field1864) {
                        var10002 = class97.field1364[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field724 - var5 >> 7;
                    int var7 = var1.field722 - var5 >> 7;
                    int var8 = var1.field724 + var5 >> 7;
                    int var9 = var1.field722 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field1864 > class241.field3993[var10][var11]) {
                                class241.field3993[var10][var11] = var1.field1864;
                                class97.field1364[var10][var11] = 1;
                            } else if (class241.field3993[var10][var11] == var1.field1864) {
                                var10002 = class97.field1364[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1694)
    public final void method1152(byte arg0) {
        field2563++;
        if (class262.field4219 == 1000) {
            return;
        }
        class183.field2987++;
        if ((class183.field2987 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class318.field4985 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class376.field5680.setSeed((long) class318.field4985);
        }
        this.method1140(-109);
        if (class362.field5528 != null) {
            class362.field5528.method2192(-11666);
        }
        class171.method1185(0);
        class409.method2566(true);
        class379.method2416(30609);
        class43.method285(-82);
        int var3 = -23 % ((arg0 + 70) / 48);
        if (class265.field4264 != null) {
            int var4 = class265.field4264.method1000(true);
            class248.field4063 = var4;
        }
        if (class284.field4547 != null) {
            class284.field4547.method567((int) class46.method297(27104));
        }
        class297.method2000(-57);
        if (class262.field4219 == 0) {
            this.method1156((byte) -128);
            class448.method2793(-93);
        } else if (class262.field4219 == 5) {
            this.method1156((byte) -121);
            class448.method2793(-104);
        } else if (class262.field4219 == 25 || class262.field4219 == 28) {
            class171.method1184(-31081);
        }
        if (class262.field4219 == 10) {
            this.method1146(true);
            class415.method2595(-87);
            class427.method2647((byte) 109);
            class386.method2448(true);
        } else if (class262.field4219 == 30) {
            class131.method964((byte) -112);
        } else if (class262.field4219 == 40) {
            class386.method2448(true);
            if (class357.field5463 != -3) {
                if (class357.field5463 == 15) {
                    class213.method1500(true);
                } else if (class357.field5463 != 2) {
                    class392.method2474((byte) -12);
                }
            }
        }
        class121.method871(class284.field4547, false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lne;IIIIIIIII)V", line = 1793)
    public static final void method1153(class172[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class172 var11 = arg0[var10];
            if (var11 != null && var11.field2735 == arg1) {
                int var12 = var11.field2766 + arg6;
                int var13 = var11.field2726 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2707 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2705 + var12;
                    int var19 = var11.field2834 + var13;
                    if (var11.field2707 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (!var11.field2712 || var11.field2707 == 0 || var11.field2838 || method1149(var11).field671 != 0 || class158.field2516 == var11 || var11.field2831 == 1338) {
                    if (!var11.field2712 || !method1144(var11)) {
                        if (class329.field5152 == var11) {
                            class301.field4770 = true;
                            class82.field1012 = var12;
                            class338.field5249 = var13;
                        }
                        if (!var11.field2712 || var11.field2869 || var14 < var16 && var15 < var17) {
                            if (var11.field2707 == 0) {
                                if (!var11.field2712 && method1144(var11) && class391.field5872 != var11) {
                                    continue;
                                }
                                if (var11.field2721 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                    for (class150 var20 = (class150) class107.field1499.method253((byte) -6); var20 != null; var20 = (class150) class107.field1499.method247((byte) 59)) {
                                        if (var20.field2341) {
                                            var20.method1120(123);
                                            var20.field2348.field2812 = false;
                                        }
                                    }
                                    if (class415.field6139 == 0) {
                                        class329.field5152 = null;
                                        class158.field2516 = null;
                                    }
                                    class391.field5874 = 0;
                                    class409.field6073 = false;
                                    class143.field2259 = false;
                                    if (!class262.field4214) {
                                        class73.method471((byte) 127);
                                    }
                                }
                            }
                            boolean var21;
                            if (class414.field6125 >= var14 && class287.field4604 >= var15 && class414.field6125 < var16 && class287.field4604 < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class262.field4214 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class311.method2080(arg8 - var12, arg9 - var13, var11, (byte) -128);
                            }
                            if (var11.field2712) {
                                boolean var22 = false;
                                if (class218.field3567 == 1 && var21) {
                                    var22 = true;
                                }
                                boolean var23 = false;
                                if (class402.field6005 == 1 && class56.field692 >= var14 && class214.field3480 >= var15 && class56.field692 < var16 && class214.field3480 < var17) {
                                    var23 = true;
                                }
                                if (var11.field2723 != null) {
                                    for (int var24 = 0; var24 < var11.field2723.length; var24++) {
                                        if (class232.field3856[var11.field2723[var24]]) {
                                            if (var11.field2856 == null || class183.field2987 >= var11.field2856[var24]) {
                                                byte var25 = var11.field2833[var24];
                                                if (var25 == 0 || ((var25 & 0x8) == 0 || !class232.field3856[86] && !class232.field3856[82] && !class232.field3856[81]) && ((var25 & 0x2) == 0 || class232.field3856[86]) && ((var25 & 0x1) == 0 || class232.field3856[82]) && ((var25 & 0x4) == 0 || class232.field3856[81])) {
                                                    class385.method2431("", (byte) 61, var11.field2865, var24 + 1, -1);
                                                    int var26 = var11.field2786[var24];
                                                    if (var11.field2856 == null) {
                                                        var11.field2856 = new int[var11.field2723.length];
                                                    }
                                                    if (var26 == 0) {
                                                        var11.field2856[var24] = Integer.MAX_VALUE;
                                                    } else {
                                                        var11.field2856[var24] = class183.field2987 + var26;
                                                    }
                                                }
                                            }
                                        } else if (var11.field2856 != null) {
                                            var11.field2856[var24] = 0;
                                        }
                                    }
                                }
                                if (var23) {
                                    class326.method2166(true, class214.field3480 - var13, class56.field692 - var12, var11);
                                }
                                if (class329.field5152 != null && class329.field5152 != var11 && var21 && method1149(var11).method344(-108)) {
                                    class234.field3911 = var11;
                                }
                                if (class158.field2516 == var11) {
                                    class29.field342 = true;
                                    class63.field823 = var12;
                                    class11.field154 = var13;
                                }
                                if (var11.field2838 || var11.field2831 != 0) {
                                    if (var21 && class248.field4063 != 0 && var11.field2782 != null) {
                                        class150 var27 = new class150();
                                        var27.field2341 = true;
                                        var27.field2348 = var11;
                                        var27.field2344 = class248.field4063;
                                        var27.field2352 = var11.field2782;
                                        class107.field1499.method245(500, var27);
                                    }
                                    if (class329.field5152 != null || class129.field2037 != null || class262.field4214 || var11.field2831 != 1400 && class391.field5874 > 0) {
                                        var23 = false;
                                        var22 = false;
                                        var21 = false;
                                    }
                                    if (var11.field2831 != 0) {
                                        if (var11.field2831 == 1337 || var11.field2831 == 1403) {
                                            class379.field5720 = var11;
                                            if (class221.field3677 != null) {
                                                class221.field3677.method1817(var11.field2834, class284.field4547, 0);
                                            }
                                            if (var11.field2831 == 1337) {
                                                if (!class262.field4214 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                    class403.method2534((byte) -91, class284.field4547, arg8, arg9);
                                                    for (class13 var28 = (class13) class423.field6251.method2430(67); var28 != null; var28 = (class13) class423.field6251.method2435(-224)) {
                                                        if (arg8 >= var28.field182 && arg8 < var28.field187 && arg9 >= var28.field193 && arg9 < var28.field188) {
                                                            class73.method471((byte) 123);
                                                            class225.method1611(var28.field186, 24);
                                                        }
                                                    }
                                                }
                                                class405.method2540(var12, var13, var11, -1);
                                                continue;
                                            }
                                        }
                                        if (var11.field2831 == 1338) {
                                            if (var11.method1197(class284.field4547, -4) == null || class193.field3143 != 0 && class193.field3143 != 3 || class262.field4214 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                                continue;
                                            }
                                            int var29 = arg8 - var12;
                                            int var30 = arg9 - var13;
                                            int var31 = var11.field2700[var30];
                                            if (var29 < var31 || var29 > var11.field2713[var30] + var31) {
                                                continue;
                                            }
                                            int var32 = var29 - var11.field2705 / 2;
                                            int var33 = var30 - var11.field2834 / 2;
                                            int var34;
                                            if (class13.field194 == 4) {
                                                var34 = (int) class329.field5153 & 0x3FFF;
                                            } else {
                                                var34 = (int) class329.field5153 + class52.field650 & 0x3FFF;
                                            }
                                            int var35 = class258.field4177[var34];
                                            int var36 = class258.field4173[var34];
                                            if (class13.field194 != 4) {
                                                var35 = (class367.field5561 + 256) * var35 >> 8;
                                                var36 = (class367.field5561 + 256) * var36 >> 8;
                                            }
                                            int var37 = var32 * var36 + var33 * var35 >> 15;
                                            int var38 = var33 * var36 - var32 * var35 >> 15;
                                            int var39;
                                            int var40;
                                            if (class13.field194 == 4) {
                                                var39 = (class144.field2269 >> 7) + (var37 >> 2);
                                                var40 = (class290.field4639 >> 7) - (var38 >> 2);
                                            } else {
                                                int var41 = (class261.field4201.method903(-103) - 1) * 64;
                                                var39 = (class261.field4201.field724 - var41 >> 7) + (var37 >> 2);
                                                var40 = (class261.field4201.field722 - var41 >> 7) - (var38 >> 2);
                                            }
                                            if (class449.field6546 && (class379.field5737 & 0x40) != 0) {
                                                class172 var42 = class201.method1393(class436.field6419, class73.field925, -104);
                                                if (var42 == null) {
                                                    class11.method109(-13853);
                                                } else {
                                                    class413.method2587(1L, class306.field4854, var39, class248.field4058, 42, var40, " ->", -233);
                                                }
                                                continue;
                                            }
                                            if (class61.field787 == 1) {
                                                class413.method2587(1L, class286.field4596, var39, -1, 21, var40, "", -233);
                                            }
                                            class413.method2587(1L, class61.field790, var39, -1, 34, var40, "", -233);
                                            continue;
                                        }
                                        if (var11.field2831 == 1400) {
                                            class30.field367 = var11;
                                            if (var21) {
                                                class409.field6073 = true;
                                            }
                                            if (var23) {
                                                int var43 = (int) ((double) (class56.field692 - var12 - var11.field2705 / 2) * 2.0D / (double) class400.field5957);
                                                int var44 = (int) (-((double) (class214.field3480 - var13 - var11.field2834 / 2) * 2.0D / (double) class400.field5957));
                                                int var45 = class375.field5656 + var43 + class400.field5973;
                                                int var46 = class144.field2270 + var44 + class400.field5974;
                                                class21 var47 = class84.method516(18898);
                                                if (var47 == null) {
                                                    continue;
                                                }
                                                int[] var48 = new int[3];
                                                var47.method150(var45, var48, var46, (byte) -112);
                                                if (var48 != null) {
                                                    if (class232.field3856[82] && class382.field5772 > 0) {
                                                        class91.method542(var48[0], var48[1], -56, var48[2]);
                                                        continue;
                                                    }
                                                    class143.field2259 = true;
                                                    class397.field5936 = var48[0];
                                                    class422.field6227 = var48[1];
                                                    class171.field2685 = var48[2];
                                                }
                                                class391.field5874 = 1;
                                                class349.field5378 = false;
                                                class145.field2286 = class414.field6125;
                                                class152.field2375 = class287.field4604;
                                                continue;
                                            }
                                            if (var22 && class391.field5874 > 0) {
                                                if (class391.field5874 == 1 && (class414.field6125 != class145.field2286 || class287.field4604 != class152.field2375)) {
                                                    class333.field5201 = class375.field5656;
                                                    class379.field5738 = class144.field2270;
                                                    class391.field5874 = 2;
                                                }
                                                if (class391.field5874 == 2) {
                                                    class349.field5378 = true;
                                                    class141.method1024(false, (int) ((double) (class145.field2286 - class414.field6125) * 2.0D / (double) class400.field5953) + class333.field5201);
                                                    class201.method1399(-82, class379.field5738 - (int) ((double) (class152.field2375 - class287.field4604) * 2.0D / (double) class400.field5953));
                                                }
                                                continue;
                                            }
                                            if (class391.field5874 > 0 && !class349.field5378) {
                                                if ((class345.field5327 == 1 || class323.method2140((byte) 88)) && class144.field2267 > 2) {
                                                    class119.method859(2, 0);
                                                } else if (class225.method1612(-1)) {
                                                    class119.method859(1, 0);
                                                }
                                            }
                                            class391.field5874 = 0;
                                            continue;
                                        }
                                        if (var11.field2831 == 1401) {
                                            if (var22) {
                                                class209.method1476(class414.field6125 - var12, var11.field2705, (byte) 71, class287.field4604 - var13, var11.field2834);
                                            }
                                            continue;
                                        }
                                        if (var11.field2831 == 1406) {
                                            class421.method2620(-124, var11, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (!var11.field2815 && var23) {
                                        var11.field2815 = true;
                                        if (var11.field2868 != null) {
                                            class150 var49 = new class150();
                                            var49.field2341 = true;
                                            var49.field2348 = var11;
                                            var49.field2347 = class56.field692 - var12;
                                            var49.field2344 = class214.field3480 - var13;
                                            var49.field2352 = var11.field2868;
                                            class107.field1499.method245(500, var49);
                                        }
                                    }
                                    if (var11.field2815 && var22 && var11.field2761 != null) {
                                        class150 var50 = new class150();
                                        var50.field2341 = true;
                                        var50.field2348 = var11;
                                        var50.field2347 = class414.field6125 - var12;
                                        var50.field2344 = class287.field4604 - var13;
                                        var50.field2352 = var11.field2761;
                                        class107.field1499.method245(500, var50);
                                    }
                                    if (var11.field2815 && !var22) {
                                        var11.field2815 = false;
                                        if (var11.field2808 != null) {
                                            class150 var51 = new class150();
                                            var51.field2341 = true;
                                            var51.field2348 = var11;
                                            var51.field2347 = class414.field6125 - var12;
                                            var51.field2344 = class287.field4604 - var13;
                                            var51.field2352 = var11.field2808;
                                            class407.field6041.method245(500, var51);
                                        }
                                    }
                                    if (var22 && var11.field2765 != null) {
                                        class150 var52 = new class150();
                                        var52.field2341 = true;
                                        var52.field2348 = var11;
                                        var52.field2347 = class414.field6125 - var12;
                                        var52.field2344 = class287.field4604 - var13;
                                        var52.field2352 = var11.field2765;
                                        class107.field1499.method245(500, var52);
                                    }
                                    if (!var11.field2812 && var21) {
                                        var11.field2812 = true;
                                        if (var11.field2806 != null) {
                                            class150 var53 = new class150();
                                            var53.field2341 = true;
                                            var53.field2348 = var11;
                                            var53.field2347 = class414.field6125 - var12;
                                            var53.field2344 = class287.field4604 - var13;
                                            var53.field2352 = var11.field2806;
                                            class107.field1499.method245(500, var53);
                                        }
                                    }
                                    if (var11.field2812 && var21 && var11.field2737 != null) {
                                        class150 var54 = new class150();
                                        var54.field2341 = true;
                                        var54.field2348 = var11;
                                        var54.field2347 = class414.field6125 - var12;
                                        var54.field2344 = class287.field4604 - var13;
                                        var54.field2352 = var11.field2737;
                                        class107.field1499.method245(500, var54);
                                    }
                                    if (var11.field2812 && !var21) {
                                        var11.field2812 = false;
                                        if (var11.field2863 != null) {
                                            class150 var55 = new class150();
                                            var55.field2341 = true;
                                            var55.field2348 = var11;
                                            var55.field2347 = class414.field6125 - var12;
                                            var55.field2344 = class287.field4604 - var13;
                                            var55.field2352 = var11.field2863;
                                            class407.field6041.method245(500, var55);
                                        }
                                    }
                                    if (var11.field2744 != null) {
                                        class150 var56 = new class150();
                                        var56.field2348 = var11;
                                        var56.field2352 = var11.field2744;
                                        class151.field2360.method245(500, var56);
                                    }
                                    if (var11.field2859 != null && class422.field6241 > var11.field2711) {
                                        if (var11.field2755 == null || class422.field6241 - var11.field2711 > 32) {
                                            class150 var61 = new class150();
                                            var61.field2348 = var11;
                                            var61.field2352 = var11.field2859;
                                            class107.field1499.method245(500, var61);
                                        } else {
                                            label705: for (int var57 = var11.field2711; var57 < class422.field6241; var57++) {
                                                int var58 = class302.field4781[var57 & 0x1F];
                                                for (int var59 = 0; var59 < var11.field2755.length; var59++) {
                                                    if (var11.field2755[var59] == var58) {
                                                        class150 var60 = new class150();
                                                        var60.field2348 = var11;
                                                        var60.field2352 = var11.field2859;
                                                        class107.field1499.method245(500, var60);
                                                        break label705;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field2711 = class422.field6241;
                                    }
                                    if (var11.field2732 != null && class331.field5179 > var11.field2699) {
                                        if (var11.field2872 == null || class331.field5179 - var11.field2699 > 32) {
                                            class150 var66 = new class150();
                                            var66.field2348 = var11;
                                            var66.field2352 = var11.field2732;
                                            class107.field1499.method245(500, var66);
                                        } else {
                                            label685: for (int var62 = var11.field2699; var62 < class331.field5179; var62++) {
                                                int var63 = class163.field2557[var62 & 0x1F];
                                                for (int var64 = 0; var64 < var11.field2872.length; var64++) {
                                                    if (var11.field2872[var64] == var63) {
                                                        class150 var65 = new class150();
                                                        var65.field2348 = var11;
                                                        var65.field2352 = var11.field2732;
                                                        class107.field1499.method245(500, var65);
                                                        break label685;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field2699 = class331.field5179;
                                    }
                                    if (var11.field2852 != null && class91.field1128 > var11.field2855) {
                                        if (var11.field2811 == null || class91.field1128 - var11.field2855 > 32) {
                                            class150 var71 = new class150();
                                            var71.field2348 = var11;
                                            var71.field2352 = var11.field2852;
                                            class107.field1499.method245(500, var71);
                                        } else {
                                            label665: for (int var67 = var11.field2855; var67 < class91.field1128; var67++) {
                                                int var68 = class135.field2115[var67 & 0x1F];
                                                for (int var69 = 0; var69 < var11.field2811.length; var69++) {
                                                    if (var11.field2811[var69] == var68) {
                                                        class150 var70 = new class150();
                                                        var70.field2348 = var11;
                                                        var70.field2352 = var11.field2852;
                                                        class107.field1499.method245(500, var70);
                                                        break label665;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field2855 = class91.field1128;
                                    }
                                    if (var11.field2778 != null && class91.field1125 > var11.field2822) {
                                        if (var11.field2787 == null || class91.field1125 - var11.field2822 > 32) {
                                            class150 var76 = new class150();
                                            var76.field2348 = var11;
                                            var76.field2352 = var11.field2778;
                                            class107.field1499.method245(500, var76);
                                        } else {
                                            label645: for (int var72 = var11.field2822; var72 < class91.field1125; var72++) {
                                                int var73 = class280.field4488[var72 & 0x1F];
                                                for (int var74 = 0; var74 < var11.field2787.length; var74++) {
                                                    if (var11.field2787[var74] == var73) {
                                                        class150 var75 = new class150();
                                                        var75.field2348 = var11;
                                                        var75.field2352 = var11.field2778;
                                                        class107.field1499.method245(500, var75);
                                                        break label645;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field2822 = class91.field1125;
                                    }
                                    if (var11.field2844 != null && class440.field6451 > var11.field2870) {
                                        if (var11.field2736 == null || class440.field6451 - var11.field2870 > 32) {
                                            class150 var81 = new class150();
                                            var81.field2348 = var11;
                                            var81.field2352 = var11.field2844;
                                            class107.field1499.method245(500, var81);
                                        } else {
                                            label625: for (int var77 = var11.field2870; var77 < class440.field6451; var77++) {
                                                int var78 = class441.field6453[var77 & 0x1F];
                                                for (int var79 = 0; var79 < var11.field2736.length; var79++) {
                                                    if (var11.field2736[var79] == var78) {
                                                        class150 var80 = new class150();
                                                        var80.field2348 = var11;
                                                        var80.field2352 = var11.field2844;
                                                        class107.field1499.method245(500, var80);
                                                        break label625;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field2870 = class440.field6451;
                                    }
                                    if (class321.field4999 > var11.field2762 && var11.field2740 != null) {
                                        class150 var82 = new class150();
                                        var82.field2348 = var11;
                                        var82.field2352 = var11.field2740;
                                        class107.field1499.method245(500, var82);
                                    }
                                    if (class179.field2921 > var11.field2762 && var11.field2747 != null) {
                                        class150 var83 = new class150();
                                        var83.field2348 = var11;
                                        var83.field2352 = var11.field2747;
                                        class107.field1499.method245(500, var83);
                                    }
                                    if (class53.field667 > var11.field2762 && var11.field2832 != null) {
                                        class150 var84 = new class150();
                                        var84.field2348 = var11;
                                        var84.field2352 = var11.field2832;
                                        class107.field1499.method245(500, var84);
                                    }
                                    if (class50.field601 > var11.field2762 && var11.field2717 != null) {
                                        class150 var85 = new class150();
                                        var85.field2348 = var11;
                                        var85.field2352 = var11.field2717;
                                        class107.field1499.method245(500, var85);
                                    }
                                    if (class378.field5705 > var11.field2762 && var11.field2743 != null) {
                                        class150 var86 = new class150();
                                        var86.field2348 = var11;
                                        var86.field2352 = var11.field2743;
                                        class107.field1499.method245(500, var86);
                                    }
                                    var11.field2762 = class223.field3724;
                                    if (var11.field2847 != null) {
                                        for (int var87 = 0; var87 < class269.field4316; var87++) {
                                            class150 var88 = new class150();
                                            var88.field2348 = var11;
                                            var88.field2340 = class271.field4342[var87];
                                            var88.field2337 = class291.field4651[var87];
                                            var88.field2352 = var11.field2847;
                                            class107.field1499.method245(500, var88);
                                        }
                                    }
                                    if (class277.field4420 && var11.field2829 != null) {
                                        class150 var89 = new class150();
                                        var89.field2348 = var11;
                                        var89.field2352 = var11.field2829;
                                        class107.field1499.method245(500, var89);
                                    }
                                }
                                if (var11.field2707 == 5 && var11.field2728 != -1) {
                                    var11.method1201(47).method1817(var11.field2834, class284.field4547, 0);
                                }
                            }
                            if (!var11.field2712 && class329.field5152 == null && class129.field2037 == null && !class262.field4214) {
                                if ((var11.field2768 >= 0 || var11.field2706 != 0) && class414.field6125 >= var14 && class287.field4604 >= var15 && class414.field6125 < var16 && class287.field4604 < var17) {
                                    if (var11.field2768 >= 0) {
                                        class391.field5872 = arg0[var11.field2768];
                                    } else {
                                        class391.field5872 = var11;
                                    }
                                }
                                if (var11.field2707 == 8 && class414.field6125 >= var14 && class287.field4604 >= var15 && class414.field6125 < var16 && class287.field4604 < var17) {
                                    class318.field4983 = var11;
                                }
                                if (var11.field2830 > var11.field2834) {
                                    class8.method92(var11.field2705 + var12, class414.field6125, var11.field2834, 1, var13, class287.field4604, var11.field2830, var11);
                                }
                            }
                            class104.method790(arg2, (byte) 82, arg3, arg4, var12, var11, arg5, var13);
                            if (var11.field2707 == 0) {
                                method1153(arg0, var11.field2865, var14, var15, var16, var17, var12 - var11.field2791, var13 - var11.field2696, arg8, arg9);
                                if (var11.field2866 != null) {
                                    method1153(var11.field2866, var11.field2865, var14, var15, var16, var17, var12 - var11.field2791, var13 - var11.field2696, arg8, arg9);
                                }
                                class196 var90 = (class196) class392.field5891.method1770(-880, (long) var11.field2865);
                                if (var90 != null) {
                                    if (var90.field3177 == 0 && !class262.field4214 && var21 && !class80.field1000) {
                                        class73.method471((byte) 125);
                                    }
                                    class282.method1923(var13, var14, var90.field3171, arg9, var17, var15, var16, arg8, var12, (byte) -79);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class104.method790(arg2, (byte) 102, arg3, arg4, var12, var11, arg5, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 2706)
    private final void method1154(boolean arg0) {
        field2570++;
        if (class298.field4739.field4386 > class178.field2916) {
            class203.field3256 = (class298.field4739.field4386 * 50 - 50) * 5;
            if (class422.field6235 == class299.field4756) {
                class299.field4756 = class196.field3170;
            } else {
                class299.field4756 = class422.field6235;
            }
            if (class203.field3256 > 3000) {
                class203.field3256 = 3000;
            }
            if (class298.field4739.field4386 >= 2 && class298.field4739.field4385 == 6) {
                this.method1580("js5connect_outofdate", 10);
                class262.field4219 = 1000;
                return;
            }
            if (class298.field4739.field4386 >= 4 && class298.field4739.field4385 == -1) {
                this.method1580("js5crc", 10);
                class262.field4219 = 1000;
                return;
            }
            if (class298.field4739.field4386 >= 4 && (class262.field4219 == 0 || class262.field4219 == 5)) {
                if (class298.field4739.field4385 == 7 || class298.field4739.field4385 == 9) {
                    this.method1580("js5connect_full", 10);
                } else if (class298.field4739.field4385 <= 0) {
                    this.method1580("js5io", 10);
                } else {
                    this.method1580("js5connect", 10);
                }
                class262.field4219 = 1000;
                return;
            }
        }
        class178.field2916 = class298.field4739.field4386;
        if (class203.field3256 > 0) {
            class203.field3256--;
            return;
        }
        try {
            if (class390.field5867 == 0) {
                class426.field6283 = class63.field822.method1894(0, class430.field6323, class299.field4756);
                class390.field5867++;
            }
            if (class390.field5867 == 1) {
                if (class426.field6283.field304 == 2) {
                    this.method1150(1000, (byte) -120);
                    return;
                }
                if (class426.field6283.field304 == 1) {
                    class390.field5867++;
                }
            }
            if (class390.field5867 == 2) {
                class201.field3229 = new class156((Socket) class426.field6283.field305, class63.field822);
                class186 var2 = new class186(5);
                var2.method1312(15, -36);
                var2.method1315(564, (byte) 113);
                class201.field3229.method1101(var2.field3066, 0, 5, 3);
                class390.field5867++;
                class235.field3942 = class46.method297(27104);
            }
            if (class390.field5867 == 3) {
                if (class262.field4219 == 0 || class262.field4219 == 5 || class201.field3229.method1102(30000) > 0) {
                    int var3 = class201.field3229.method1105(false);
                    if (var3 != 0) {
                        this.method1150(var3, (byte) -120);
                        return;
                    }
                    class390.field5867++;
                } else if (class46.method297(27104) - class235.field3942 > 30000L) {
                    this.method1150(1001, (byte) -120);
                    return;
                }
            }
            if (class390.field5867 == 4) {
                boolean var4 = class262.field4219 == 5 || class262.field4219 == 10 || class262.field4219 == 28;
                class298.field4739.method1851((byte) -98, !var4, class201.field3229);
                class390.field5867 = 0;
                class426.field6283 = null;
                class201.field3229 = null;
            }
        } catch (IOException var5) {
            this.method1150(1002, (byte) -120);
        }
        if (arg0) {
            method1143();
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lne;)Lne;", line = 2853)
    public static final class172 method1155(class172 arg0) {
        int var1 = method1149(arg0).method343(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class196.method1375(arg0.field2735, (byte) -56);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2876)
    private final void method1156(byte arg0) {
        if (!class392.field5887) {
            label227: while (true) {
                do {
                    if (!class426.method2639(67)) {
                        break label227;
                    }
                } while (class140.field2180 != 's' && class140.field2180 != 'S');
                class392.field5887 = true;
            }
        }
        field2567++;
        if (class68.field856 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class46.method297(27104);
            if (class328.field5137 == 0L) {
                class328.field5137 = var4;
            }
            if (var3 > 16384 && var4 - class328.field5137 < 5000L) {
                if (var4 - class32.field395 > 1000L) {
                    System.gc();
                    class32.field395 = var4;
                }
                class70.field873 = class368.field5588;
                class173.field2887 = 5;
            } else {
                class70.field873 = class362.field5530;
                class173.field2887 = 5;
                class68.field856 = 10;
            }
        } else if (class68.field856 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class162.field2547[var6] = class430.method2665(0, class80.field1003, class380.field5751);
            }
            class173.field2887 = 10;
            class70.field873 = class343.field5292;
            class68.field856 = 20;
        } else if (class68.field856 == 20) {
            if (class362.field5528 == null) {
                class362.field5528 = new class330(class298.field4739, class382.field5773);
            }
            if (class362.field5528.method2187(21150)) {
                class79.field998 = class37.method244(1, true, 0, false, (byte) -108);
                class199.field3218 = class37.method244(1, true, 1, false, (byte) -108);
                class220.field3636 = class37.method244(1, true, 2, false, (byte) -108);
                class110.field1525 = class37.method244(1, true, 3, false, (byte) -108);
                class236.field3950 = class37.method244(1, true, 4, false, (byte) -108);
                class212.field3401 = class37.method244(1, true, 5, true, (byte) -108);
                class125.field1930 = class37.method244(1, false, 6, true, (byte) -108);
                class267.field4293 = class37.method244(1, true, 7, false, (byte) -108);
                class223.field3727 = class37.method244(1, true, 8, false, (byte) -108);
                class262.field4205 = class37.method244(1, true, 9, false, (byte) -108);
                class391.field5875 = class37.method244(1, true, 10, false, (byte) -108);
                class282.field4531 = class37.method244(1, true, 11, false, (byte) -108);
                class377.field5700 = class37.method244(1, true, 12, false, (byte) -108);
                class33.field407 = class37.method244(1, true, 13, false, (byte) -108);
                class156.field2460 = class37.method244(1, false, 14, false, (byte) -108);
                class127.field1990 = class37.method244(1, true, 15, false, (byte) -108);
                class132.field2058 = class37.method244(1, true, 16, false, (byte) -108);
                class150.field2335 = class37.method244(1, true, 17, false, (byte) -108);
                class412.field6103 = class37.method244(1, true, 18, false, (byte) -108);
                class56.field698 = class37.method244(1, true, 19, false, (byte) -108);
                class321.field5002 = class37.method244(1, true, 20, false, (byte) -108);
                class27.field309 = class37.method244(1, true, 21, false, (byte) -108);
                class300.field4759 = class37.method244(1, true, 22, false, (byte) -108);
                class311.field4900 = class37.method244(1, true, 23, true, (byte) -108);
                class447.field6512 = class37.method244(1, true, 24, false, (byte) -108);
                class430.field6326 = class37.method244(1, true, 25, false, (byte) -108);
                class47.field590 = class37.method244(1, true, 26, true, (byte) -108);
                class342.field5277 = class37.method244(1, true, 27, false, (byte) -108);
                class256.field4160 = class37.method244(1, true, 28, true, (byte) -108);
                class173.field2887 = 15;
                class70.field873 = class345.field5308;
                class68.field856 = 30;
            } else {
                class70.field873 = class272.field4375;
                class173.field2887 = 12;
            }
        } else if (class68.field856 == 30) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class106.field1495[var8].method1959(126) * class161.field2544[var8] / 100;
            }
            if (var7 == 100) {
                class173.field2887 = 20;
                class70.field873 = class64.field839;
                class239.method1688(class223.field3727, 8943);
                class222.method1589(125, class223.field3727);
                class68.field856 = 40;
            } else {
                class173.field2887 = 20;
                if (var7 != 0) {
                    class70.field873 = class130.field2048 + var7 + "%";
                }
            }
        } else if (class68.field856 == 40) {
            if (class256.field4160.method2778((byte) -117)) {
                this.method1135(class256.field4160.method2776(0, 1), -7653);
                class68.field856 = 50;
                class173.field2887 = 25;
                class70.field873 = class374.field5646;
            } else {
                class70.field873 = class271.field4344 + class256.field4160.method2781(0) + "%";
                class173.field2887 = 25;
            }
        } else if (class68.field856 == 50) {
            class185.method1261(true, 2, class349.field5410, 22050);
            class385.field5821 = new class214();
            class385.field5821.method1529(128, 9, -23475);
            class441.field6457 = class119.method862(class86.field1073, 29522, 0, class63.field822, 22050);
            class441.field6457.method1542((byte) 63, class385.field5821);
            class256.method1774(class236.field3950, class385.field5821, class156.field2460, -1, class127.field1990);
            class313.field4928 = class119.method862(class86.field1073, 29522, 1, class63.field822, 2048);
            class82.field1025 = new class393();
            class313.field4928.method1542((byte) 63, class82.field1025);
            class305.field4841 = new class171(22050, class413.field6106);
            class36.field438 = class125.field1930.method2791((byte) 44, "scape main");
            class173.field2887 = 30;
            class70.field873 = class104.field1463;
            class68.field856 = 60;
        } else if (class68.field856 == 60) {
            int var9 = class75.method480((byte) 127, class33.field407, class223.field3727);
            int var10 = class232.method1645(6);
            if (var9 < var10) {
                class173.field2887 = 35;
                class70.field873 = class269.field4319 + var9 * 100 / var10 + "%";
            } else {
                class173.field2887 = 35;
                class70.field873 = class19.field246;
                class68.field856 = 70;
            }
        } else if (class68.field856 == 70) {
            int var11 = class423.method2628(class223.field3727, 1024);
            int var12 = class171.method1186((byte) -78);
            if (var12 > var11) {
                class70.field873 = class272.field4374 + var11 * 100 / var12 + "%";
                class173.field2887 = 40;
            } else {
                class70.field873 = class441.field6462;
                class68.field856 = 80;
                class173.field2887 = 40;
            }
        } else if (class68.field856 == 80) {
            if (class47.field590.method2778((byte) -126)) {
                class35.field434 = new class134(class47.field590, class262.field4205, class223.field3727);
                class68.field856 = 90;
                class173.field2887 = 45;
                class70.field873 = class429.field6319;
            } else {
                class70.field873 = class3.field76 + class47.field590.method2781(0) + "%";
                class173.field2887 = 45;
            }
        } else if (class68.field856 == 90) {
            class68.field856 = 95;
            class70.field873 = class413.field6108;
            class173.field2887 = 50;
        } else {
            if (arg0 >= 0) {
                this.method1140(-61);
            }
            if (class68.field856 == 95) {
                if (class392.field5887) {
                    class86.field1103 = 0;
                    class452.field6579 = 0;
                    class386.field5835 = 0;
                    class317.field4970 = 1;
                    class418.field6198 = 0;
                }
                class392.field5887 = true;
                class306.method2062((byte) 110, class63.field822);
                class415.method2593(-11);
                class62.method406(false, class452.field6579, false);
                class68.field856 = 100;
                class173.field2887 = 55;
                class70.field873 = class361.field5507;
            } else if (class68.field856 == 100) {
                class287.method1942(class284.field4547, 8820, class223.field3727, class33.field407);
                class173.field2887 = 60;
                class70.field873 = class316.field4962;
                class128.method953(16205, 5);
                class68.field856 = 110;
            } else if (class68.field856 == 110) {
                class220.field3636.method2778((byte) -116);
                byte var13 = 0;
                int var14 = var13 + class220.field3636.method2781(0);
                class132.field2058.method2778((byte) -128);
                int var15 = var14 + class132.field2058.method2781(0);
                class150.field2335.method2778((byte) -108);
                int var16 = var15 + class150.field2335.method2781(0);
                class412.field6103.method2778((byte) -108);
                int var17 = var16 + class412.field6103.method2781(0);
                class56.field698.method2778((byte) -107);
                int var18 = var17 + class56.field698.method2781(0);
                class321.field5002.method2778((byte) -103);
                int var19 = var18 + class321.field5002.method2781(0);
                class27.field309.method2778((byte) -109);
                int var20 = var19 + class27.field309.method2781(0);
                class300.field4759.method2778((byte) -120);
                int var21 = var20 + class300.field4759.method2781(0);
                class447.field6512.method2778((byte) -108);
                int var22 = var21 + class447.field6512.method2781(0);
                class430.field6326.method2778((byte) -125);
                int var23 = var22 + class430.field6326.method2781(0);
                class342.field5277.method2778((byte) -103);
                int var24 = var23 + class342.field5277.method2781(0);
                if (var24 < 1100) {
                    class70.field873 = class222.field3690 + var24 / 11 + "%";
                    class173.field2887 = 65;
                } else {
                    class35.method225(class220.field3636, (byte) 41);
                    class40.method268((byte) 103, class220.field3636);
                    class257.method1782(class220.field3636, 21260);
                    class144.method1046((byte) -128, class220.field3636, class267.field4293);
                    class38.method258(0, class132.field2058, class267.field4293, true);
                    class230.method1632(true, class412.field6103, -119, class267.field4293);
                    class252.method1749(class267.field4293, 128, true, class56.field698);
                    class161.method1124(class220.field3636, true);
                    class394.method2486(class79.field998, -1, class199.field3218, class321.field5002);
                    class166.method1165(class220.field3636, 1);
                    class272.method1844(true, class267.field4293, class27.field309);
                    class41.method271((byte) -119, class300.field4759);
                    class234.method1659(16, class220.field3636);
                    class292.method1961(class223.field3727, (byte) -52, class33.field407, class267.field4293, class110.field1525);
                    class142.method1040(-1, class220.field3636);
                    class303.method2032(103, class150.field2335);
                    class111.method824(new class201(), class430.field6326, 512, class447.field6512);
                    class50.method310(class430.field6326, 17657, class447.field6512);
                    class199.method1389(class220.field3636, 2);
                    class133.method973((byte) 30, class220.field3636);
                    class94.method556(class220.field3636, -70);
                    class112.method832(class220.field3636, class223.field3727, false);
                    class281.method1917(class223.field3727, class220.field3636, 34);
                    class381.method2427(class220.field3636, 999999999);
                    class130.method959(class223.field3727, (byte) 96, class220.field3636);
                    class180.method1236(19, class220.field3636);
                    class277.method1863(105, class220.field3636);
                    class70.field873 = class250.field4093;
                    class173.field2887 = 65;
                    class414.method2591(-7702);
                    class68.field856 = 120;
                }
            } else if (class68.field856 == 120) {
                int var25 = class349.method2280(class223.field3727, (byte) -95);
                int var26 = class286.method1939((byte) 116);
                if (var25 < var26) {
                    class173.field2887 = 70;
                    class70.field873 = class388.field5854 + var25 * 100 / var26 + "%";
                } else {
                    class183.method1248(class223.field3727, class284.field4547, 108);
                    class124.method906(class181.field2960, 29865);
                    class70.field873 = class84.field1042;
                    class68.field856 = 130;
                    class173.field2887 = 70;
                }
            } else if (class68.field856 == 130) {
                class182.field2981 = new class45();
                class63.field822.method1897(10, class182.field2981, 2);
                class173.field2887 = 75;
                class70.field873 = class290.field4635;
                class68.field856 = 140;
            } else if (class68.field856 == 140) {
                if (class391.field5875.method2788(1, "", "huffman")) {
                    class429 var27 = new class429(class391.field5875.method2772(true, "huffman", ""));
                    class187.method1330(var27, -11425);
                    class68.field856 = 150;
                    class70.field873 = class163.field2554;
                    class173.field2887 = 80;
                } else {
                    class173.field2887 = 80;
                    class70.field873 = class232.field3859 + "0%";
                }
            } else if (class68.field856 == 150) {
                if (!class110.field1525.method2778((byte) -124)) {
                    class70.field873 = class226.field3800 + class110.field1525.method2781(0) * 3 / 4 + "%";
                    class173.field2887 = 85;
                } else if (!class377.field5700.method2778((byte) -108)) {
                    class70.field873 = class226.field3800 + (class377.field5700.method2781(0) / 10 + 75) + "%";
                    class173.field2887 = 85;
                } else if (!class33.field407.method2778((byte) -103)) {
                    class70.field873 = class226.field3800 + (class33.field407.method2781(0) / 20 + 85) + "%";
                    class173.field2887 = 85;
                } else if (class311.field4900.method2780("details", (byte) 125)) {
                    class400.method2514(class311.field4900);
                    class8.method95((byte) 116, class342.field5277);
                    class378.method2411(class267.field4293, class35.field434, -57);
                    class70.field873 = class19.field244;
                    class173.field2887 = 85;
                    class68.field856 = 160;
                } else {
                    class70.field873 = class226.field3800 + (class311.field4900.method2757("details", -113) / 10 + 90) + "%";
                    class173.field2887 = 85;
                }
            } else if (class68.field856 == 160) {
                int var28 = class262.method1800(false);
                if (var28 == -1) {
                    class173.field2887 = 90;
                    class70.field873 = class271.field4343;
                } else if (var28 == 7 || var28 == 9) {
                    this.method1580("worldlistfull", 10);
                    class128.method953(16205, 1000);
                } else if (class137.field2141) {
                    class70.field873 = class362.field5527;
                    class173.field2887 = 90;
                    class68.field856 = 170;
                } else {
                    this.method1580("worldlistio_" + var28, 10);
                    class128.method953(16205, 1000);
                }
            } else if (class68.field856 == 170) {
                class338.field5250 = new boolean[class430.field6322];
                class158.field2520 = new int[class430.field6322];
                class186.field3054 = new String[class263.field4240];
                for (int var29 = 0; var29 < class430.field6322; var29++) {
                    if (class54.method360((byte) -106, var29).field884 == 0) {
                        class338.field5250[var29] = true;
                        class151.field2365++;
                    }
                    class158.field2520[var29] = -1;
                }
                class53.method354(1);
                class33.field414 = class110.field1525.method2791((byte) -72, "loginscreen");
                class212.field3401.method2783(false, -16018, true);
                class125.field1930.method2783(true, -16018, true);
                class223.field3727.method2783(true, -16018, true);
                class33.field407.method2783(true, -16018, true);
                class391.field5875.method2783(true, -16018, true);
                class110.field1525.method2783(true, -16018, true);
                class220.field3636.field6510 = 2;
                class186.field3069 = true;
                class150.field2335.field6510 = 2;
                class132.field2058.field6510 = 2;
                class412.field6103.field6510 = 2;
                class56.field698.field6510 = 2;
                class321.field5002.field6510 = 2;
                class27.field309.field6510 = 2;
                class50.method319(false, -1, class317.field4970, 10371, -1);
                class68.field856 = 180;
                class173.field2887 = 95;
                class70.field873 = class30.field369;
            } else if (class68.field856 == 180) {
                class334.method2209(true, (byte) -60);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 3412)
    public final void init() {
        field2571++;
        if (!this.method1577((byte) 112)) {
            return;
        }
        class64.field841 = Integer.parseInt(this.getParameter("worldid"));
        class141.field2184 = Integer.parseInt(this.getParameter("modewhere"));
        if (class141.field2184 < 0 || class141.field2184 > 1) {
            class141.field2184 = 0;
        }
        class348.field5355 = Integer.parseInt(this.getParameter("modewhat"));
        if (class348.field5355 < 0 || class348.field5355 > 2) {
            class348.field5355 = 0;
        }
        try {
            class205.field3298 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class205.field3298 = 0;
        }
        class298.method2009(class205.field3298, (byte) -108);
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class199.field3216 = true;
        } else {
            class199.field3216 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class115.field1599 = true;
        } else {
            class115.field1599 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class61.field787 = 1;
        } else {
            class61.field787 = 0;
        }
        try {
            class173.field2882 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class173.field2882 = 0;
        }
        class312.field4916 = this.getParameter("quiturl");
        class341.field5264 = this.getParameter("settings");
        if (class341.field5264 == null) {
            class341.field5264 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class272.field4379 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class272.field4379 = 0;
            }
        }
        class140.field2176 = Integer.parseInt(this.getParameter("colourid"));
        if (class140.field2176 < 0 || class32.field406.length <= class140.field2176) {
            class140.field2176 = 0;
        }
        class97.field1359 = this;
        this.method1574(class348.field5355 + 32, 564, 765, (byte) -114, 503);
    }
}
