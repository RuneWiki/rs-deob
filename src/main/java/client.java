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
public class client extends class124 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
    public static boolean field2147 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2149 = 0;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static volatile int field2141 = 0;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lij;")
    public static class175 field2152 = new class175();

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field2157;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 7)
    public final void method816(byte arg0) {
        field2154++;
        if (class253.field4323) {
            class253.method1724();
        }
        if (class317.field5460 != null) {
            class51.method405(class272.field4658, class317.field5460, -4);
            class317.field5460 = null;
        }
        if (class272.field4658 != null) {
            class272.field4658.method25((byte) 127, this.getClass());
        }
        if (class59.field1078 != null) {
            class59.field1078.field4507 = false;
        }
        class59.field1078 = null;
        if (arg0 != -92) {
            field2156 = 116;
        }
        if (class196.field3586 != null) {
            class196.field3586.method1627(94);
            class196.field3586 = null;
        }
        class114.method785(class186.field3271, true);
        class251.method1686((byte) -107, class186.field3271);
        if (class17.field232 != null) {
            class17.field232.method883(class186.field3271, arg0 ^ 0xFFFFFFA4);
        }
        class14.method83(-8083);
        class311.method2153(-92);
        class17.field232 = null;
        if (class134.field2335 != null) {
            class134.field2335.method1404((byte) -40);
        }
        if (class114.field2011 != null) {
            class114.field2011.method1404((byte) -40);
        }
        class201.field3665.method879(-124);
        class119.field2111.method720((byte) -100);
        try {
            if (class292.field5057 != null) {
                class292.field5057.method903(-126);
            }
            if (class75.field1432 != null) {
                for (int var2 = 0; var2 < class75.field1432.length; var2++) {
                    if (class75.field1432[var2] != null) {
                        class75.field1432[var2].method903(-69);
                    }
                }
            }
            if (class295.field5126 != null) {
                class295.field5126.method903(-41);
            }
            if (class161.field2859 != null) {
                class161.field2859.method903(arg0 ^ 0x3A);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 93)
    public final void method817(int arg0) {
        method830(100);
        class256.method1776((byte) -18);
        field2150++;
        class250.method1684(-646173530);
        class31.method219((byte) -103);
        class242.method1617(0);
        class124.method854(true);
        class253.method1734();
        class99.method714(22971);
        class159.method1180(-115);
        class261.method1829(arg0 + 13421772);
        class96.method694(-14415);
        class41.method360(false);
        class243.method1632(94);
        class126.method869((byte) -123);
        class100.method723(2);
        class277.method1916(121);
        class302.method2118(arg0 ^ 0xFFFF83C7);
        class138.method996((byte) 11);
        class132.method896(arg0 + 50);
        class75.method573(false);
        class297.method2081(-101);
        class279.method1959(arg0 ^ 0x2);
        class238.method1605(2);
        class37.method280(arg0 + 8);
        class188.method1367((byte) 121);
        class317.method2207(-93);
        class144.method1059(arg0 - 1);
        class175.method1268(false);
        class135.method961(arg0 + 22838);
        class254.method1752(true);
        class300.method2096(true);
        class183.method1344(32);
        class150.method1121(-9);
        class278.method1951((byte) 10);
        class195.method1407(arg0 + 23734);
        class318.method2212(23345);
        class49.method393(-2044538552);
        class117.method799((byte) 105);
        class67.method516((byte) -113);
        class271.method1870(0);
        class32.method225(-6110);
        class74.method557((byte) 123);
        class316.method2200((byte) -52);
        class163.method1200(-24797);
        class70.method533(-1);
        class153.method1143(true);
        class165.method1211(-96);
        class10.method62((byte) -70);
        class191.method1386(arg0 ^ 0xFF00FF);
        class274.method1897((byte) 120);
        class11.method72(true);
        class85.method627(7171);
        class255.method1755(false);
        class72.method547(-13642);
        class303.method2121((byte) 114);
        class9.method58(50);
        class54.method428(1);
        class19.method120(false);
        class63.method492(64);
        class273.method1884(91);
        class76.method575((byte) 112);
        class97.method696(arg0 ^ 0x22);
        class169.method1231();
        class88.method650(arg0 ^ 0x1C);
        class315.method2196();
        class196.method1420((byte) 77);
        class149.method1106();
        class36.method265(false);
        class89.method666();
        class48.method385(6445);
        class167.method1216(arg0 ^ 0x50);
        class298.method2085(false);
        class181.method1327((byte) -11);
        class221.method1520();
        class270.method1869(true);
        class307.method2134(159);
        class24.method155(111);
        class290.method2017(arg0 ^ 0xFFFFC6B1);
        class293.method2046();
        class241.method1614(104);
        class234.method1585(-1);
        class20.method136();
        class222.method1529(arg0);
        class285.method1999(-126);
        class108.method765((byte) -44);
        class319.method2215();
        class245.method1652();
        class118.method804(arg0 ^ 0x5F);
        class79.method591(2);
        class65.method502(77);
        class310.method2151((byte) -115);
        class201.method1439(arg0 - 18195);
        class178.method1308();
        class237.method1590(false);
        class209.method1476((byte) 24);
        class68.method523((byte) 27);
        class34.method237(false);
        class174.method1265((byte) -124);
        class192.method1395(97);
        class84.method621(true);
        class53.method422(arg0 + 24);
        class1.method7(arg0 - 121);
        class45.method379(false);
        class130.method890((byte) -117);
        class56.method441((byte) 112);
        class172.method1252(-94);
        class203.method1445((byte) -80);
        class38.method293(96);
        class94.method687((byte) 22);
        class294.method2064(arg0 ^ 0x32);
        class292.method2023(-3);
        class17.method110(-28);
        class272.method1876(117);
        class189.method1377(6791);
        class83.method613(19962);
        class27.method185(150);
        class308.method2139(true);
        class215.method1505((byte) 89);
        class136.method978();
        class252.method1697(30843);
        class121.method813((byte) 37);
        class321.method2231(96);
        class129.method886((byte) 85);
        class182.method1333(arg0 - 107);
        class264.method1848(arg0 + 127);
        class296.method2071();
        class267.method1856(-127);
        class286.method2000(arg0 + arg0);
        class200.method1434(arg0 - 103);
        class119.method808(93);
        class51.method407(1);
        class62.method488(14920);
        class113.method775();
        class269.method1861(-1);
        class171.method1244((byte) -29);
        class197.method1424((byte) 99);
        class39.method300((byte) -81);
        class223.method1534(true);
        class139.method1028(arg0 + 1000);
        class198.method1425(-90);
        class3.method17();
        class230.method1564((byte) -25);
        class320.method2225(0);
        class186.method1350(true);
        class42.method370(arg0 + 192);
        class276.method1909();
        class21.method138((byte) -80);
        class123.method833();
        class55.method437();
        class13.method76(10456);
        class177.method1286((byte) -115);
        class155.method1156(true);
        class77.method583(arg0 + 1471867872);
        class185.method1347((byte) -125);
        class187.method1351((byte) 120);
        class90.method669((byte) 98);
        class137.method988(arg0 - 95);
        class301.method2103((byte) 96);
        class258.method1817();
        class58.method457(-100);
        class93.method682(126);
        class60.method471();
        class78.method588(30);
        class30.method213(true);
        class23.method151(104);
        class295.method2066(false);
        class6.method47(0);
        class143.method1045(false);
        class101.method726(arg0 ^ 0x1);
        class240.method1612(-22670);
        class208.method1471(27351);
        class14.method84((byte) -112);
        class134.method956(false);
        class71.method545(arg0 - 127);
        class107.method756((byte) 71);
        class216.method1513((byte) -48);
        class170.method1240(arg0 ^ 0xFFFFFF89);
        class57.method445(92);
        class205.method1455((byte) -87);
        class313.method2167(-88);
        class280.method1963(1);
        class160.method1183(arg0 - 14291);
        class81.method608();
        class29.method211(false);
        class22.method142(67);
        class140.method1033(arg0 + 5);
        class213.method1496(-119);
        class146.method1069(arg0);
        class157.method1166(true);
        class33.method228();
        class18.method116();
        class125.method865();
        class95.method690(arg0 ^ 0xFFFFFF85);
        class114.method782(2);
        class304.method2124();
        class16.method92();
        class180.method1320(125);
        class206.method1461(-30806);
        class151.method1128();
        class312.method2161();
        class168.method1223(true);
        class260.method1828(32535);
        class179.method1315(30);
        class284.method1989(~arg0);
        class59.method462(-4664);
        class173.method1256((byte) -86);
        class229.method1561(128);
        class210.method1480(-64);
        class199.method1431(120);
        class35.method243(-83);
        class112.method770(arg0 ^ 0x7F);
        class116.method792(64);
        class289.method2012(false);
        class287.method2007((byte) -121);
        class91.method676(-1);
        class233.method1578(-25530);
        class40.method303(8);
        class152.method1142(arg0 - 116);
        class66.method509(268435455);
        class64.method496((byte) 103);
        class193.method1399((byte) -47);
        class44.method372(2);
        class244.method1643((byte) -26);
        class246.method1664((byte) -114);
        class73.method549(-8904);
        class281.method1966(62);
        class154.method1153(true);
        class156.method1162(7);
        class5.method44((byte) 85);
        class236.method1588(64);
        class52.method417(-23223);
        class142.method1037(arg0);
        class251.method1689((byte) 16);
        class102.method739(127);
        class282.method1972(1);
        class247.method1668(-1);
        class28.method207((byte) -105);
        class50.method404(0);
        class8.method53(arg0 ^ 0x0);
        class15.method88((byte) 66);
        class194.method1403(true);
        class207.method1466((byte) 19);
        class225.method1538(true);
        class204.method1448(-23043);
        class305.method2129(59);
        class162.method1195((byte) 51);
        class239.method1607(0);
        class164.method1205(-4548);
        class104.method744((byte) -111);
        class161.method1187(false);
        class115.method789(-124);
        class98.method706(arg0 + 123);
        class105.method748(64);
        class148.method1077((byte) -125);
        class122.method815((byte) -126);
        class145.method1062(false);
        class92.method681(arg0 ^ 0x7E40E);
        class106.method751(25914);
        class46.method380((byte) -59);
        class249.method1678(arg0 - 1);
        class248.method1672(0);
        class311.method2156(false);
        class166.method1213(-90);
        class80.method600(255);
        class214.method1499(30000);
        class288.method2009((byte) -119);
        class7.method51(false);
        class211.method1484(15466);
        class25.method157(6133);
        class141.method1035((byte) 112);
        class86.method633(-1);
        class257.method1812((byte) 15);
        class231.method1565(arg0);
        class111.method769(false);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 378)
    private final void method818(byte arg0) {
        if (!class137.field2392) {
            label238: while (true) {
                do {
                    if (!class1.method3(127)) {
                        break label238;
                    }
                } while (class318.field5475 != 115 && class318.field5475 != 83);
                class137.field2392 = true;
            }
        }
        field2139++;
        if (class272.field4654 == 0) {
            Runtime var27 = Runtime.getRuntime();
            int var28 = (int) ((var27.totalMemory() - var27.freeMemory()) / 1024L);
            long var29 = class224.method1536(false);
            if (class134.field2329 == 0L) {
                class134.field2329 = var29;
            }
            if (var28 > 16384 && (var29 - class134.field2329) < 5000L) {
                if (var29 - class8.field124 > 1000L) {
                    System.gc();
                    class8.field124 = var29;
                }
                class84.field1533 = class274.field4747;
                class277.field4770 = 5;
            } else {
                class277.field4770 = 5;
                class272.field4654 = 10;
                class84.field1533 = class185.field3263;
            }
        } else if (class272.field4654 == 10) {
            class245.method1655(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class124.field2201[var2] = new class37(104, 104);
            }
            class272.field4654 = 30;
            class84.field1533 = class1.field8;
            class277.field4770 = 10;
        } else {
            int var3 = 97 % ((43 - arg0) / 33);
            if (class272.field4654 == 30) {
                if (class244.field4157 == null) {
                    class244.field4157 = new class277(class201.field3665, class119.field2111);
                }
                if (class244.field4157.method1918(-1)) {
                    class216.field3851 = class94.method686(true, 0, false, (byte) -48, true);
                    class185.field3258 = class94.method686(true, 1, false, (byte) -112, true);
                    class267.field4564 = class94.method686(true, 2, true, (byte) -107, false);
                    class166.field2939 = class94.method686(true, 3, false, (byte) -102, true);
                    class96.field1702 = class94.method686(true, 4, false, (byte) -56, true);
                    class246.field4184 = class94.method686(true, 5, true, (byte) -65, true);
                    class21.field277 = class94.method686(false, 6, true, (byte) -77, true);
                    class297.field5141 = class94.method686(true, 7, false, (byte) -102, true);
                    class153.field2743 = class94.method686(true, 8, false, (byte) -127, true);
                    class104.field1854 = class94.method686(true, 9, false, (byte) -63, true);
                    class240.field4094 = class94.method686(true, 10, false, (byte) -47, true);
                    class80.field1488 = class94.method686(true, 11, false, (byte) -63, true);
                    class73.field1336 = class94.method686(true, 12, false, (byte) -60, true);
                    class285.field4956 = class94.method686(true, 13, false, (byte) -109, true);
                    class298.field5163 = class94.method686(false, 14, false, (byte) -64, true);
                    class204.field3696 = class94.method686(true, 15, false, (byte) -69, true);
                    class195.field3568 = class94.method686(true, 16, false, (byte) -45, true);
                    class72.field1321 = class94.method686(true, 17, false, (byte) -78, true);
                    class142.field2488 = class94.method686(true, 18, false, (byte) -126, true);
                    class284.field4928 = class94.method686(true, 19, false, (byte) -112, true);
                    class72.field1317 = class94.method686(true, 20, false, (byte) -122, true);
                    class68.field1258 = class94.method686(true, 21, false, (byte) -58, true);
                    class22.field285 = class94.method686(true, 22, false, (byte) -83, true);
                    class249.field4233 = class94.method686(true, 23, true, (byte) -127, true);
                    class73.field1337 = class94.method686(true, 24, false, (byte) -120, true);
                    class153.field2729 = class94.method686(true, 25, false, (byte) -61, true);
                    class63.field1110 = class94.method686(true, 26, true, (byte) -65, true);
                    class39.field714 = class94.method686(true, 27, false, (byte) -117, true);
                    class84.field1533 = class213.field3806;
                    class272.field4654 = 40;
                    class277.field4770 = 15;
                } else {
                    class277.field4770 = 12;
                    class84.field1533 = class57.field1043;
                }
            } else if (class272.field4654 == 40) {
                int var25 = 0;
                for (int var26 = 0; var26 < 28; var26++) {
                    var25 += class234.field4006[var26].method2114(-17707) * class310.field5349[var26] / 100;
                }
                if (var25 == 100) {
                    class277.field4770 = 20;
                    class84.field1533 = class230.field3946;
                    class5.method43(false, class153.field2743);
                    class36.method263(-21479, class153.field2743);
                    class208.method1474(2000, class153.field2743);
                    class272.field4654 = 45;
                } else {
                    if (var25 != 0) {
                        class84.field1533 = class30.method214(new class256[] { class261.field4503, class305.method2125((byte) 47, var25), class36.field648 }, 29784);
                    }
                    class277.field4770 = 20;
                }
            } else if (class272.field4654 == 45) {
                class54.method435(2, 22050, -22929, class171.field3050);
                class168.field2988 = new class278();
                class168.field2988.method1936(18076, 128, 9);
                class134.field2335 = class51.method406(22050, class272.field4658, class186.field3271, -25535, 0);
                class134.field2335.method1417(class168.field2988, 89);
                class97.method697(class96.field1702, class204.field3696, class298.field5163, (byte) -87, class168.field2988);
                class114.field2011 = class51.method406(2048, class272.field4658, class186.field3271, -25535, 1);
                class197.field3603 = new class322();
                class114.field2011.method1417(class197.field3603, 77);
                class290.field5025 = new class318(22050, class175.field3109);
                class105.field1890 = class21.field277.method1006((byte) -58, class116.field2033);
                class277.field4770 = 30;
                class272.field4654 = 50;
                class84.field1533 = class185.field3255;
            } else if (class272.field4654 == 50) {
                int var23 = class154.method1151(class153.field2743, -103, class285.field4956);
                int var24 = class243.method1634((byte) -40);
                if (var24 > var23) {
                    class84.field1533 = class30.method214(new class256[] { class86.field1563, class305.method2125((byte) 101, var23 * 100 / var24), class36.field648 }, 29784);
                    class277.field4770 = 35;
                } else {
                    class277.field4770 = 35;
                    class272.field4654 = 60;
                    class84.field1533 = class139.field2452;
                }
            } else if (class272.field4654 == 60) {
                int var21 = class8.method57(-104, class153.field2743);
                int var22 = class40.method302(1001);
                if (var21 < var22) {
                    class84.field1533 = class30.method214(new class256[] { class289.field5006, class305.method2125((byte) 121, var21 * 100 / var22), class36.field648 }, 29784);
                    class277.field4770 = 40;
                } else {
                    class272.field4654 = 65;
                    class84.field1533 = class138.field2411;
                    class277.field4770 = 40;
                }
            } else if (class272.field4654 == 65) {
                class71.method542(class285.field4956, 0, class153.field2743);
                class277.field4770 = 45;
                class84.field1533 = class180.field3177;
                class11.method67((byte) 74, 5);
                class272.field4654 = 70;
            } else if (class272.field4654 == 70) {
                class267.field4564.method1023((byte) -127);
                byte var9 = 0;
                int var10 = var9 + class267.field4564.method1020(2);
                class195.field3568.method1023((byte) -42);
                int var11 = var10 + class195.field3568.method1020(2);
                class72.field1321.method1023((byte) -48);
                int var12 = var11 + class72.field1321.method1020(2);
                class142.field2488.method1023((byte) -69);
                int var13 = var12 + class142.field2488.method1020(2);
                class284.field4928.method1023((byte) -41);
                int var14 = var13 + class284.field4928.method1020(2);
                class72.field1317.method1023((byte) -84);
                int var15 = var14 + class72.field1317.method1020(2);
                class68.field1258.method1023((byte) -72);
                int var16 = var15 + class68.field1258.method1020(2);
                class22.field285.method1023((byte) -7);
                int var17 = var16 + class22.field285.method1020(2);
                class73.field1337.method1023((byte) -82);
                int var18 = var17 + class73.field1337.method1020(2);
                class153.field2729.method1023((byte) -7);
                int var19 = var18 + class153.field2729.method1020(2);
                class39.field714.method1023((byte) -51);
                int var20 = var19 + class39.field714.method1020(2);
                if (var20 >= 1100) {
                    class260.method1825(class267.field4564, (byte) 84);
                    class189.method1373((byte) 117, class267.field4564);
                    class170.method1241(class267.field4564, (byte) 107);
                    class252.method1693(113, class297.field5141, class267.field4564);
                    class177.method1285(class195.field3568, class297.field5141, true, (byte) 49);
                    class153.method1144(class142.field2488, false, class297.field5141);
                    class144.method1049(true, class297.field5141, false, class284.field4928, class170.field3017);
                    class27.method201(class267.field4564, (byte) -34);
                    class112.method772(-26199, class216.field3851, class72.field1317, class185.field3258);
                    class290.method2016(class68.field1258, class297.field5141, (byte) 109);
                    class272.method1874(class22.field285, -87);
                    class237.method1593(class267.field4564, -6264);
                    class252.method1701(class285.field4956, class166.field2939, class153.field2743, (byte) 0, class297.field5141);
                    class272.method1878(true, class267.field4564);
                    class189.method1380(true, class72.field1321);
                    class36.method254(class73.field1337, new class272(), class153.field2729, 1);
                    class215.method1504(class73.field1337, (byte) 91, class153.field2729);
                    class37.method282(class153.field2743, (byte) 111, class267.field4564);
                    class277.field4770 = 50;
                    class84.field1533 = class175.field3113;
                    class255.method1758((byte) 115);
                    class272.field4654 = 80;
                } else {
                    class84.field1533 = class30.method214(new class256[] { class310.field5351, class305.method2125((byte) 84, var20 / 11), class36.field648 }, 29784);
                    class277.field4770 = 50;
                }
            } else if (class272.field4654 == 80) {
                int var7 = class108.method764((byte) 105, class153.field2743);
                int var8 = class270.method1867((byte) -77);
                if (var7 >= var8) {
                    class242.method1621(-24, class153.field2743);
                    class277.field4770 = 60;
                    class272.field4654 = 90;
                    class84.field1533 = class129.field2265;
                } else {
                    class84.field1533 = class30.method214(new class256[] { class193.field3532, class305.method2125((byte) 94, var7 * 100 / var8), class36.field648 }, 29784);
                    class277.field4770 = 60;
                }
            } else if (class272.field4654 == 90) {
                if (class63.field1110.method1023((byte) -120)) {
                    class27 var4 = new class27(class104.field1854, class63.field1110, class153.field2743, 20, !class236.field4032);
                    class136.method965(var4);
                    if (class106.field1895 == 1) {
                        class136.method976(0.9F);
                    }
                    if (class106.field1895 == 2) {
                        class136.method976(0.8F);
                    }
                    if (class106.field1895 == 3) {
                        class136.method976(0.7F);
                    }
                    if (class106.field1895 == 4) {
                        class136.method976(0.6F);
                    }
                    class272.field4654 = 100;
                    class84.field1533 = class25.field324;
                    class277.field4770 = 70;
                } else {
                    class84.field1533 = class30.method214(new class256[] { class203.field3669, class305.method2125((byte) 127, class63.field1110.method1020(2)), class36.field648 }, 29784);
                    class277.field4770 = 70;
                }
            } else if (class272.field4654 == 100) {
                if (class250.method1681(4, class153.field2743)) {
                    class272.field4654 = 110;
                }
            } else if (class272.field4654 == 110) {
                class59.field1078 = new class261();
                class272.field4658.method20(10, class59.field1078, (byte) 126);
                class272.field4654 = 120;
                class277.field4770 = 75;
                class84.field1533 = class248.field4220;
            } else if (class272.field4654 == 120) {
                if (class240.field4094.method1015(false, class46.field844, class94.field1690)) {
                    class252 var6 = new class252(class240.field4094.method1019(class94.field1690, class46.field844, true));
                    class233.method1579(var6, -1);
                    class272.field4654 = 130;
                    class277.field4770 = 80;
                    class84.field1533 = class240.field4101;
                } else {
                    class84.field1533 = class30.method214(new class256[] { class122.field2138, class30.field464 }, 29784);
                    class277.field4770 = 80;
                }
            } else if (class272.field4654 == 130) {
                if (!class166.field2939.method1023((byte) -11)) {
                    class84.field1533 = class30.method214(new class256[] { class216.field3840, class305.method2125((byte) 30, class166.field2939.method1020(2) * 3 / 4), class36.field648 }, 29784);
                    class277.field4770 = 85;
                } else if (!class73.field1336.method1023((byte) -11)) {
                    class84.field1533 = class30.method214(new class256[] { class216.field3840, class305.method2125((byte) 126, class73.field1336.method1020(2) / 10 + 75), class36.field648 }, 29784);
                    class277.field4770 = 85;
                } else if (!class285.field4956.method1023((byte) -40)) {
                    class84.field1533 = class30.method214(new class256[] { class216.field3840, class305.method2125((byte) 78, class285.field4956.method1020(2) / 20 + 85), class36.field648 }, 29784);
                    class277.field4770 = 85;
                } else if (class249.field4233.method1022((byte) 95, class194.field3543)) {
                    class27.method191(class6.field91, class249.field4233, class6.field96, class57.field1037, class264.field4533, class116.field2035, -1);
                    class272.field4654 = 135;
                    class277.field4770 = 95;
                    class84.field1533 = class166.field2944;
                } else {
                    class84.field1533 = class30.method214(new class256[] { class216.field3840, class305.method2125((byte) 109, class249.field4233.method998(0, class194.field3543) / 10 + 90), class36.field648 }, 29784);
                    class277.field4770 = 85;
                }
            } else if (class272.field4654 == 135) {
                int var5 = class40.method305((byte) 127);
                if (var5 == -1) {
                    class84.field1533 = class311.field5366;
                    class277.field4770 = 95;
                } else if (var5 == 7 || var5 == 9) {
                    this.method857(12245, "worldlistfull");
                    class11.method67((byte) 74, 1000);
                } else if (class303.field5241) {
                    class277.field4770 = 96;
                    class272.field4654 = 140;
                    class84.field1533 = class48.field860;
                } else {
                    this.method857(12245, "worldlistio_" + var5);
                    class11.method67((byte) 74, 1000);
                }
            } else if (class272.field4654 == 140) {
                class66.field1175 = class166.field2939.method1006((byte) 125, class301.field5180);
                class246.field4184.method1000(false, true, (byte) -106);
                class21.field277.method1000(true, true, (byte) -111);
                class153.field2743.method1000(true, true, (byte) -69);
                class285.field4956.method1000(true, true, (byte) -113);
                class240.field4094.method1000(true, true, (byte) -78);
                class166.field2939.method1000(true, true, (byte) -113);
                class84.field1533 = class208.field3764;
                class49.field897 = true;
                class272.field4654 = 150;
                class277.field4770 = 97;
            } else if (class272.field4654 == 150) {
                class296.method2070();
                if (class137.field2392) {
                    class115.field2023 = 0;
                    class274.field4743 = 0;
                    class237.field4037 = 0;
                    class163.field2882 = 0;
                }
                class137.field2392 = true;
                class183.method1337(false, class272.field4658);
                class248.method1671(-1, false, class237.field4037, -1, true);
                class84.field1533 = class154.field2762;
                class277.field4770 = 100;
                class272.field4654 = 160;
            } else if (class272.field4654 == 160) {
                class104.method742(true, -15214);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 884)
    public final void init() {
        field2144++;
        if (!this.method852(-58)) {
            return;
        }
        class281.field4888 = Integer.parseInt(this.getParameter("worldid"));
        class40.field724 = Integer.parseInt(this.getParameter("modewhere"));
        if (class40.field724 < 0 || class40.field724 > 1) {
            class40.field724 = 0;
        }
        class175.field3103 = Integer.parseInt(this.getParameter("modewhat"));
        if (class175.field3103 < 0 || class175.field3103 > 2) {
            class175.field3103 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class72.field1318 = true;
        } else {
            class72.field1318 = false;
        }
        try {
            class204.field3699 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class204.field3699 = 0;
        }
        class320.method2226((byte) 114, class204.field3699);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class141.field2477 = true;
        } else {
            class141.field2477 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class92.field1674 = true;
        } else {
            class92.field1674 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class206.field3735 = 1;
        } else {
            class206.field3735 = 0;
        }
        try {
            class7.field107 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class7.field107 = 0;
        }
        class281.field4882 = class294.field5116.method1798(104, this);
        if (class281.field4882 == null) {
            class281.field4882 = class46.field844;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class111.field1948 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class111.field1948 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class66.field1176 = true;
        } else {
            class66.field1176 = false;
        }
        class307.field5289 = this;
        this.method855(class175.field3103 + 32, 526, 503, 765, 67);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 970)
    private final void method819(int arg0, int arg1) {
        class201.field3665.field2249++;
        class201.field3665.field2247 = arg0;
        if (arg1 != -5056) {
            field2156 = -90;
        }
        class10.field154 = 0;
        field2140++;
        class181.field3212 = null;
        class62.field1096 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 987)
    private final void method820(byte arg0) {
        class208.field3767 = 0;
        field2151++;
        while (class1.method3(127) && class208.field3767 < 128) {
            class50.field925[class208.field3767] = class7.field116;
            class119.field2105[class208.field3767] = class318.field5475;
            class208.field3767++;
        }
        class29.field398++;
        if (class211.field3803 != -1) {
            class54.method433(0, 0, arg0 ^ 0xC, class112.field1969, 0, class124.field2200, class211.field3803, 0);
        }
        class35.field549++;
        if (arg0 != -13) {
            return;
        }
        if (class253.field4323) {
            int var2 = 19137023;
            label195: for (int var3 = 0; var3 < 32768; var3++) {
                class279 var4 = class187.field3281[var3];
                if (var4 != null) {
                    byte var5 = var4.field4860.field1362;
                    if ((var5 & 0x2) > 0 && var4.field1239 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1215[0] = (var4.field1192 >> 7) + var6;
                            var4.field1254[0] = (var4.field1197 >> 7) + var7;
                            class124.field2201[class255.field4377].method283(var4.field1192 >> 7, 0, var4.field1197 >> 7, var4.method515(5373952), false, var4.method515(5373952), (byte) 35);
                            if (var4.field1215[0] >= 0 && var4.field1215[0] <= 104 - var4.method515(arg0 ^ 0xFFADFFF3) && var4.field1254[0] >= 0 && var4.field1254[0] <= (104 - var4.method515(5373952)) && class124.field2201[class255.field4377].method290((byte) 36, var4.field1215[0], var4.field1197 >> 7, var4.field1192 >> 7, var4.field1254[0])) {
                                if (var4.method515(5373952) > 1) {
                                    for (int var8 = var4.field1215[0]; var4.field1215[0] + var4.method515(arg0 + 5373965) > var8; var8++) {
                                        for (int var9 = var4.field1254[0]; var4.field1254[0] + var4.method515(5373952) > var9; var9++) {
                                            if ((class124.field2201[class255.field4377].field653[var8][var9] & var2) != 0) {
                                                continue label195;
                                            }
                                        }
                                    }
                                }
                                var4.field1239 = 1;
                            }
                        }
                    }
                    class282.method1976(var4, 0);
                    class54.method434(arg0 ^ 0xFFFFFFF2, var4);
                    class86.method628(-1, var4);
                    class124.field2201[class255.field4377].method278(var4.field1197 >> 7, false, var4.method515(arg0 ^ 0xFFADFFF3), var4.method515(arg0 ^ 0xFFADFFF3), false, var4.field1192 >> 7);
                }
            }
        }
        if (!class253.field4323) {
            class57.method447(121);
        } else if (class137.field2390 == 0 && class54.field1000 == 0) {
            if (class192.field3510 == 2) {
                class193.method1400(-1);
            } else {
                class96.method693((byte) -102);
            }
            if (class50.field926 >> 7 < 14 || (class50.field926 >> 7) >= 90 || (class72.field1319 >> 7) < 14 || class72.field1319 >> 7 >= 90) {
                class107.method761((byte) -119);
            }
        }
        while (true) {
            class119 var10;
            class188 var17;
            class188 var18;
            do {
                var10 = (class119) class165.field2927.method1267(-15);
                if (var10 == null) {
                    while (true) {
                        class119 var11;
                        class188 var12;
                        class188 var13;
                        do {
                            var11 = (class119) class208.field3758.method1267(arg0 + 116);
                            if (var11 == null) {
                                while (true) {
                                    class119 var14;
                                    class188 var15;
                                    class188 var16;
                                    do {
                                        var14 = (class119) class116.field2031.method1267(125);
                                        if (var14 == null) {
                                            if (class240.field4096 != null) {
                                                class204.method1449((byte) -71);
                                            }
                                            if (class24.field317 != null && class24.field317.field1500 == 1) {
                                                if (class24.field317.field1499 != null) {
                                                    class85.method624(class83.field1515, class31.field509, (byte) 39);
                                                }
                                                class24.field317 = null;
                                                class83.field1515 = false;
                                                class31.field509 = null;
                                            }
                                            if ((class45.field840 % 1500) == 0) {
                                                class76.method580((byte) -26);
                                            }
                                            return;
                                        }
                                        var15 = var14.field2116;
                                        if (var15.field3305 < 0) {
                                            break;
                                        }
                                        var16 = class182.method1335((byte) 111, var15.field3468);
                                    } while (var16 == null || var16.field3368 == null || var16.field3368.length <= var15.field3305 || var16.field3368[var15.field3305] != var15);
                                    class91.method678((byte) 120, var14);
                                }
                            }
                            var12 = var11.field2116;
                            if (var12.field3305 < 0) {
                                break;
                            }
                            var13 = class182.method1335((byte) 114, var12.field3468);
                        } while (var13 == null || var13.field3368 == null || var12.field3305 >= var13.field3368.length || var13.field3368[var12.field3305] != var12);
                        class91.method678((byte) 104, var11);
                    }
                }
                var17 = var10.field2116;
                if (var17.field3305 < 0) {
                    break;
                }
                var18 = class182.method1335((byte) 121, var17.field3468);
            } while (var18 == null || var18.field3368 == null || var18.field3368.length <= var17.field3305 || var18.field3368[var17.field3305] != var17);
            class91.method678((byte) 70, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1207)
    public final void method821(int arg0) {
        field2155++;
        if (class86.field1550 == 1000) {
            return;
        }
        boolean var2 = class146.method1066(94);
        if (var2 && class250.field4242 && class134.field2335 != null) {
            class134.field2335.method1406((byte) 127);
        }
        if ((class86.field1550 == 30 || class86.field1550 == 10) && (class277.field4765 || class37.field668 != 0L && class224.method1536(false) > class37.field668)) {
            class248.method1671(class141.field2479, class277.field4765, class35.method247(0), class145.field2566, true);
        }
        if (class317.field5460 == null) {
            Container var3;
            if (class317.field5460 != null) {
                var3 = class317.field5460;
            } else if (class198.field3627 == null) {
                var3 = class272.field4658.field52;
            } else {
                var3 = class198.field3627;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class198.field3627 == var3) {
                Insets var6 = class198.field3627.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.left + var6.right;
            }
            if (class308.field5326 != var4 || class186.field3269 != var5) {
                if (class4.field70.startsWith("mac")) {
                    class186.field3269 = var5;
                    class308.field5326 = var4;
                } else {
                    class216.method1510(-765);
                }
                class37.field668 = class224.method1536(false) + 500L;
            }
        }
        if (class317.field5460 != null && !class305.field5263 && (class86.field1550 == 30 || class86.field1550 == 10)) {
            class248.method1671(-1, false, class237.field4037, -1, true);
        }
        boolean var7 = false;
        if (class105.field1889) {
            class105.field1889 = false;
            var7 = true;
        }
        if (arg0 != 11994) {
            field2156 = 97;
        }
        if (var7) {
            class124.method862((byte) 96);
        }
        if (class253.field4323) {
            for (int var8 = 0; var8 < 100; var8++) {
                class53.field974[var8] = true;
            }
        }
        if (class86.field1550 == 0) {
            class211.method1485((byte) -93, (Color) null, class84.field1533, class277.field4770, var7);
        } else if (class86.field1550 == 5) {
            class96.method695(class17.field215, (byte) 99, false);
        } else if (class86.field1550 == 10) {
            class233.method1581(arg0 ^ 0x2ED8);
        } else if (class86.field1550 == 25 || class86.field1550 == 28) {
            if (class284.field4925 == 1) {
                if (class57.field1053 < class73.field1330) {
                    class57.field1053 = class73.field1330;
                }
                int var10 = (class57.field1053 - class73.field1330) * 50 / class57.field1053;
                class159.method1176(false, class30.method214(new class256[] { class177.field3127, class300.field5175, class305.method2125((byte) 63, var10), class24.field315 }, 29784), (byte) 99);
            } else if (class284.field4925 == 2) {
                if (class274.field4744 < class29.field414) {
                    class274.field4744 = class29.field414;
                }
                int var9 = ((class274.field4744 - class29.field414) * 50 / class274.field4744) + 50;
                class159.method1176(false, class30.method214(new class256[] { class177.field3127, class300.field5175, class305.method2125((byte) 88, var9), class24.field315 }, 29784), (byte) 93);
            } else {
                class159.method1176(false, class177.field3127, (byte) 112);
            }
        } else if (class86.field1550 == 30) {
            class200.method1432((byte) -34);
        } else if (class86.field1550 == 40) {
            class159.method1176(false, class30.method214(new class256[] { class297.field5147, class17.field230, class130.field2277 }, 29784), (byte) 102);
        }
        if (class253.field4323 && class86.field1550 != 0) {
            class253.method1733();
            for (int var11 = 0; var11 < class138.field2396; var11++) {
                class302.field5220[var11] = false;
            }
        } else if ((class86.field1550 == 30 || class86.field1550 == 10) && class255.field4369 == 0 && !var7) {
            try {
                Graphics var12 = class186.field3271.getGraphics();
                for (int var13 = 0; var13 < class138.field2396; var13++) {
                    if (class302.field5220[var13]) {
                        class108.field1920.method446(class102.field1840[var13], arg0 - 12088, class56.field1017[var13], class163.field2892[var13], class255.field4366[var13], var12);
                        class302.field5220[var13] = false;
                    }
                }
            } catch (Exception var19) {
                class186.field3271.repaint();
            }
        } else if (class86.field1550 != 0) {
            try {
                Graphics var15 = class186.field3271.getGraphics();
                class108.field1920.method452(0, (byte) -16, 0, var15);
                for (int var16 = 0; var16 < class138.field2396; var16++) {
                    class302.field5220[var16] = false;
                }
            } catch (Exception var18) {
                class186.field3271.repaint();
            }
        }
        if (class49.field897) {
            class140.method1031(false);
        }
        if (class137.field2392 && class86.field1550 == 10 && class211.field3803 != -1) {
            class137.field2392 = false;
            class183.method1337(false, class272.field4658);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1458)
    public final void method822(int arg0) {
        field2142++;
        if (class86.field1550 == 1000) {
            return;
        }
        class45.field840++;
        if (class45.field840 % 1000 == arg0) {
            GregorianCalendar var2 = new GregorianCalendar();
            class156.field2777 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class290.field5023.setSeed((long) class156.field2777);
        }
        this.method825((byte) -60);
        if (class244.field4157 != null) {
            class244.field4157.method1914(121);
        }
        class134.method958((byte) 106);
        class65.method506(true);
        class213.method1494((byte) -117);
        class59.method466(false);
        if (class253.field4323) {
            class221.method1521();
        }
        if (class17.field232 != null) {
            int var3 = class17.field232.method881(33);
            class157.field2795 = var3;
        }
        if (class86.field1550 == 0) {
            this.method818((byte) -74);
            class39.method297(true);
        } else if (class86.field1550 == 5) {
            this.method818((byte) -77);
            class39.method297(true);
        } else if (class86.field1550 == 25 || class86.field1550 == 28) {
            class320.method2227((byte) -121);
        }
        if (class86.field1550 == 10) {
            this.method820((byte) -13);
            class98.method703(0);
            class62.method489(arg0 - 3);
            class135.method960((byte) 115);
        } else if (class86.field1550 == 30) {
            class274.method1900((byte) -127);
        } else if (class86.field1550 == 40) {
            class135.method960((byte) 115);
            if (class118.field2086 != -3) {
                if (class118.field2086 == 15) {
                    class112.method771((byte) 93);
                } else if (class118.field2086 != 2) {
                    class241.method1615((byte) -24);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1554)
    public final void method823(byte arg0) {
        class216.method1510(-765);
        field2148++;
        class119.field2111 = new class100();
        class201.field3665 = new class126();
        if (class175.field3103 != 0) {
            class79.field1475 = new byte[50][];
        }
        class282.method1977(105, class272.field4658);
        if (class40.field724 == 0) {
            class200.field3652 = this.getCodeBase().getHost();
            class5.field89 = 43594;
            class68.field1259 = 443;
        } else if (class40.field724 == 1) {
            class200.field3652 = this.getCodeBase().getHost();
            class5.field89 = class281.field4888 + 40000;
            class68.field1259 = class281.field4888 + 50000;
        } else if (class40.field724 == 2) {
            class5.field89 = class281.field4888 + 40000;
            class200.field3652 = "127.0.0.1";
            class68.field1259 = class281.field4888 + 50000;
        }
        class5.field78 = class68.field1259;
        if (class4.field66 == 3 && class40.field724 != 2) {
            class240.field4089 = class281.field4888;
        }
        class320.field5490 = class5.field89;
        class53.field968 = class5.field89;
        class29.field409 = class200.field3652;
        class286.field4968 = class320.field5490;
        if (class206.field3735 == 1) {
            class34.field542 = class30.field454;
            class169.field2997 = 16777215;
            class169.field2996 = 0;
            class196.field3588 = class73.field1344;
            class302.field5230 = true;
            class171.field3043 = class75.field1425;
            class284.field4915 = class15.field200;
        } else {
            class284.field4915 = class205.field3722;
            class34.field542 = class99.field1770;
            class196.field3588 = class99.field1763;
            class171.field3043 = class163.field2883;
        }
        class157.field2798 = class236.field4028 = class36.field646 = class144.field2555 = new short[256];
        class42.method368(57);
        class27.method186((byte) -56, class186.field3271);
        class1.method9(class186.field3271, true);
        class17.field232 = class34.method233(109);
        if (class17.field232 != null) {
            class17.field232.method882(73, class186.field3271);
        }
        class111.field1951 = class4.field66;
        try {
            if (class272.field4658.field56 != null) {
                class292.field5057 = new class132(class272.field4658.field56, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class75.field1432[var2] = new class132(class272.field4658.field69[var2], 6000, 0);
                }
                class295.field5126 = new class132(class272.field4658.field62, 6000, 0);
                class231.field3978 = new class75(255, class292.field5057, class295.field5126, 500000);
                class161.field2859 = new class132(class272.field4658.field63, 24, 0);
                class272.field4658.field69 = null;
                class272.field4658.field63 = null;
                class272.field4658.field56 = null;
                class272.field4658.field62 = null;
            }
        } catch (IOException var4) {
            class292.field5057 = null;
            class231.field3978 = null;
            class295.field5126 = null;
            class161.field2859 = null;
        }
        if (class40.field724 != 0) {
            class40.field728 = true;
        }
        class6.field95 = class181.field3213;
        if (arg0 >= -115) {
            this.method825((byte) 118);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)J", line = 1670)
    public static final long method824(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        return var3 == null || var3.field4628 == null ? 0L : var3.field4628.field3902;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 1705)
    private final void method825(byte arg0) {
        field2146++;
        boolean var2 = class201.field3665.method873((byte) 116);
        if (arg0 >= -2) {
            this.method826((byte) 55);
        }
        if (!var2) {
            this.method826((byte) -89);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1741)
    public static final void main(String[] arg0) {
        try {
            int var1 = -1;
            if (arg0.length != 4) {
                class225.method1539("argument count", 1);
            }
            class281.field4888 = Integer.parseInt(arg0[0]);
            class40.field724 = 2;
            if (arg0[1].equals("live")) {
                class175.field3103 = 0;
            } else if (arg0[1].equals("rc")) {
                class175.field3103 = 1;
            } else if (arg0[1].equals("wip")) {
                class175.field3103 = 2;
            } else {
                class225.method1539("modewhat", 1);
            }
            class72.field1318 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class310.method2150(class49.method392(var2, (byte) 106, 0, var2.length), 121);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class204.field3699 = var1;
            } else if (arg0[2].equals("english")) {
                class204.field3699 = 0;
            } else if (arg0[2].equals("german")) {
                class204.field3699 = 1;
            } else {
                class225.method1539("language", 1);
            }
            class320.method2226((byte) 106, class204.field3699);
            class92.field1674 = false;
            class141.field2477 = false;
            if (arg0[3].equals("game0")) {
                class206.field3735 = 0;
            } else if (arg0[3].equals("game1")) {
                class206.field3735 = 1;
            } else {
                class225.method1539("game", 1);
            }
            class7.field107 = 0;
            class281.field4882 = class46.field844;
            class111.field1948 = 0;
            class66.field1176 = false;
            client var4 = new client();
            class307.field5289 = var4;
            var4.method851(768, false, true, class175.field3103 + 32, 526, "runescape", 1024, 28);
            class198.field3627.setLocation(40, 40);
        } catch (Exception var7) {
            class7.method48((String) null, (byte) 108, var7);
        }
        field2145++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 1821)
    private final void method826(byte arg0) {
        if (arg0 > -71) {
            this.method825((byte) -90);
        }
        field2143++;
        if (class201.field3665.field2249 > class95.field1697) {
            class237.field4050 = (class201.field3665.field2249 * 50 - 50) * 5;
            if (class53.field968 == class286.field4968) {
                class286.field4968 = class5.field78;
            } else {
                class286.field4968 = class53.field968;
            }
            if (class237.field4050 > 3000) {
                class237.field4050 = 3000;
            }
            if (class201.field3665.field2249 >= 2 && class201.field3665.field2247 == 6) {
                this.method857(12245, "js5connect_outofdate");
                class86.field1550 = 1000;
                return;
            }
            if (class201.field3665.field2249 >= 4 && class201.field3665.field2247 == -1) {
                this.method857(12245, "js5crc");
                class86.field1550 = 1000;
                return;
            }
            if (class201.field3665.field2249 >= 4 && (class86.field1550 == 0 || class86.field1550 == 5)) {
                if (class201.field3665.field2247 == 7 || class201.field3665.field2247 == 9) {
                    this.method857(12245, "js5connect_full");
                } else if (class201.field3665.field2247 > 0) {
                    this.method857(12245, "js5connect");
                } else {
                    this.method857(12245, "js5io");
                }
                class86.field1550 = 1000;
                return;
            }
        }
        class95.field1697 = class201.field3665.field2249;
        if (class237.field4050 > 0) {
            class237.field4050--;
            return;
        }
        try {
            if (class10.field154 == 0) {
                class62.field1096 = class272.field4658.method32(class286.field4968, (byte) 111, class29.field409);
                class10.field154++;
            }
            if (class10.field154 == 1) {
                if (class62.field1096.field1500 == 2) {
                    this.method819(1000, -5056);
                    return;
                }
                if (class62.field1096.field1500 == 1) {
                    class10.field154++;
                }
            }
            if (class10.field154 == 2) {
                class181.field3212 = new class243((Socket) class62.field1096.field1499, class272.field4658);
                class41 var2 = new class41(5);
                var2.method308(15, -2);
                var2.method365((byte) -32, 526);
                class181.field3212.method1636((byte) 20, 0, var2.field772, 5);
                class10.field154++;
                class302.field5194 = class224.method1536(false);
            }
            if (class10.field154 == 3) {
                if (class86.field1550 == 0 || class86.field1550 == 5 || class181.field3212.method1633((byte) -5) > 0) {
                    int var3 = class181.field3212.method1629(0);
                    if (var3 != 0) {
                        this.method819(var3, -5056);
                        return;
                    }
                    class10.field154++;
                } else if ((class224.method1536(false) - class302.field5194) > 30000L) {
                    this.method819(1001, -5056);
                    return;
                }
            }
            if (class10.field154 == 4) {
                boolean var4 = class86.field1550 == 5 || class86.field1550 == 10 || class86.field1550 == 28;
                class201.field3665.method875(class181.field3212, !var4, (byte) 109);
                class62.field1096 = null;
                class10.field154 = 0;
                class181.field3212 = null;
            }
        } catch (IOException var6) {
            this.method819(1002, -5056);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lla;)Z", line = 1985)
    public static final boolean method827(class188 arg0) {
        if (class37.field654) {
            if (method828(arg0) != 0) {
                return false;
            }
            if (arg0.field3467 == 0) {
                return false;
            }
        }
        return arg0.field3418;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lla;)I", line = 1999)
    public static final int method828(class188 arg0) {
        class6 var1 = (class6) class36.field643.method1744((byte) 123, ((long) arg0.field3342 << 32) + (long) arg0.field3305);
        return var1 == null ? arg0.field3327 : var1.field94;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lla;)Lla;", line = 2008)
    public static final class188 method829(class188 arg0) {
        int var1 = class252.method1702(method828(arg0), (byte) 39);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class182.method1335((byte) 119, arg0.field3468);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 2031)
    public static void method830(int arg0) {
        if (arg0 == 100) {
            field2152 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lla;IIIIIII)V", line = 2051)
    public static final void method831(class188[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class188 var9 = arg0[var8];
            if (var9 != null && var9.field3468 == arg1 && (!var9.field3396 || var9.field3467 == 0 || var9.field3453 || method828(var9) != 0 || class260.field4492 == var9 || var9.field3357 == 1338) && (!var9.field3396 || !method827(var9))) {
                int var10 = var9.field3400 + arg6;
                int var11 = var9.field3333 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3467 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3391 + var10;
                    int var17 = var9.field3343 + var11;
                    if (var9.field3467 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class240.field4096 == var9) {
                    class164.field2914 = true;
                    class29.field415 = var10;
                    class52.field962 = var11;
                }
                if (!var9.field3396 || var12 < var14 && var13 < var15) {
                    if (var9.field3467 == 0) {
                        if (!var9.field3396 && method827(var9) && class7.field112 != var9) {
                            continue;
                        }
                        if (var9.field3350 && class286.field4963 >= var12 && class208.field3762 >= var13 && class286.field4963 < var14 && class208.field3762 < var15) {
                            for (class119 var18 = (class119) class116.field2031.method1270((byte) -121); var18 != null; var18 = (class119) class116.field2031.method1277(1)) {
                                if (var18.field2103) {
                                    var18.method1199(21966);
                                    var18.field2116.field3337 = false;
                                }
                            }
                            if (class116.field2036 == 0) {
                                class240.field4096 = null;
                                class260.field4492 = null;
                            }
                            class32.field523 = false;
                        }
                    }
                    if (var9.field3396) {
                        boolean var19;
                        if (class286.field4963 >= var12 && class208.field3762 >= var13 && class286.field4963 < var14 && class208.field3762 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class287.field4978 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class83.field1503 == 1 && class311.field5365 >= var12 && class160.field2855 >= var13 && class311.field5365 < var14 && class160.field2855 < var15) {
                            var21 = true;
                        }
                        if (class208.field3767 > 0 && var9.field3314 != null) {
                            for (int var22 = 0; var22 < var9.field3314.length; var22++) {
                                for (int var23 = 0; var23 < class208.field3767; var23++) {
                                    int var24 = var9.field3314[var22] & 0xFF;
                                    if (class50.field925[var23] == var24) {
                                        if (var9.field3336 != null) {
                                            byte var25 = var9.field3336[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class140.field2468[86] || (var25 & 0x1) != 0 && !class140.field2468[82] || (var25 & 0x4) != 0 && !class140.field2468[81])) {
                                                continue;
                                            }
                                        }
                                        class206.method1459(var22 + 1, class46.field844, 10205, var9.field3342, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class102.method734(class311.field5365 - var10, class160.field2855 - var11, -5779, var9);
                        }
                        if (class240.field4096 != null && class240.field4096 != var9 && var19 && class57.method448(-1506623691, method828(var9))) {
                            class138.field2420 = var9;
                        }
                        if (class260.field4492 == var9) {
                            class320.field5491 = true;
                            class76.field1445 = var10;
                            class208.field3754 = var11;
                        }
                        if (var9.field3453 || var9.field3357 != 0) {
                            if (var19 && class157.field2795 != 0 && var9.field3361 != null) {
                                class119 var26 = new class119();
                                var26.field2103 = true;
                                var26.field2116 = var9;
                                var26.field2109 = class157.field2795;
                                var26.field2114 = var9.field3361;
                                class116.field2031.method1269(false, var26);
                            }
                            if (class240.field4096 != null || class242.field4123 != null || class73.field1341 || var9.field3357 != 1400 && class32.field523) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3357 != 0) {
                                if (var9.field3357 == 1337) {
                                    class204.field3695 = var9;
                                    class64.method500(var9, (byte) -117);
                                    continue;
                                }
                                if (var9.field3357 == 1338) {
                                    if (var21) {
                                        class240.field4097 = class311.field5365 - var10;
                                        class84.field1532 = class160.field2855 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3357 == 1400) {
                                    class100.field1774 = var9;
                                    if (var21) {
                                        if (class140.field2468[82] && class106.field1896 > 0) {
                                            int var27 = (int) ((double) (class311.field5365 - var10 - var9.field3391 / 2) * 2.0D / (double) class213.field3816);
                                            int var28 = (int) ((double) (class160.field2855 - var11 - var9.field3343 / 2) * 2.0D / (double) class213.field3816);
                                            int var29 = class311.field5360 + var27;
                                            int var30 = class271.field4645 + var28;
                                            int var31 = class313.field5383 + var29;
                                            int var32 = class154.field2753 + class8.field133 - var30 - 1;
                                            class281.method1968(false, var31, var32, 0);
                                            class64.method499((byte) -121);
                                            continue;
                                        }
                                        class32.field523 = true;
                                        class117.field2047 = class286.field4963;
                                        class75.field1426 = class208.field3762;
                                        class302.field5206 = class311.field5360;
                                        class74.field1408 = class271.field4645;
                                        continue;
                                    }
                                    if (var20 && class32.field523) {
                                        class135.method959((int) ((double) (class117.field2047 - class286.field4963) * 2.0D / (double) class45.field843) + class302.field5206, -97);
                                        class90.method671((int) ((double) (class75.field1426 - class208.field3762) * 2.0D / (double) class45.field843) + class74.field1408, -104);
                                        continue;
                                    }
                                    class32.field523 = false;
                                    continue;
                                }
                                if (var9.field3357 == 1401) {
                                    if (var20) {
                                        class124.method861(var9.field3343, class286.field4963 - var10, class208.field3762 - var11, -1, var9.field3391);
                                    }
                                    continue;
                                }
                                if (var9.field3357 == 1402) {
                                    if (!class253.field4323) {
                                        class64.method500(var9, (byte) -117);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field3461 && var21) {
                                var9.field3461 = true;
                                if (var9.field3382 != null) {
                                    class119 var33 = new class119();
                                    var33.field2103 = true;
                                    var33.field2116 = var9;
                                    var33.field2120 = class311.field5365 - var10;
                                    var33.field2109 = class160.field2855 - var11;
                                    var33.field2114 = var9.field3382;
                                    class116.field2031.method1269(false, var33);
                                }
                            }
                            if (var9.field3461 && var20 && var9.field3449 != null) {
                                class119 var34 = new class119();
                                var34.field2103 = true;
                                var34.field2116 = var9;
                                var34.field2120 = class286.field4963 - var10;
                                var34.field2109 = class208.field3762 - var11;
                                var34.field2114 = var9.field3449;
                                class116.field2031.method1269(false, var34);
                            }
                            if (var9.field3461 && !var20) {
                                var9.field3461 = false;
                                if (var9.field3349 != null) {
                                    class119 var35 = new class119();
                                    var35.field2103 = true;
                                    var35.field2116 = var9;
                                    var35.field2120 = class286.field4963 - var10;
                                    var35.field2109 = class208.field3762 - var11;
                                    var35.field2114 = var9.field3349;
                                    class208.field3758.method1269(false, var35);
                                }
                            }
                            if (var20 && var9.field3443 != null) {
                                class119 var36 = new class119();
                                var36.field2103 = true;
                                var36.field2116 = var9;
                                var36.field2120 = class286.field4963 - var10;
                                var36.field2109 = class208.field3762 - var11;
                                var36.field2114 = var9.field3443;
                                class116.field2031.method1269(false, var36);
                            }
                            if (!var9.field3337 && var19) {
                                var9.field3337 = true;
                                if (var9.field3451 != null) {
                                    class119 var37 = new class119();
                                    var37.field2103 = true;
                                    var37.field2116 = var9;
                                    var37.field2120 = class286.field4963 - var10;
                                    var37.field2109 = class208.field3762 - var11;
                                    var37.field2114 = var9.field3451;
                                    class116.field2031.method1269(false, var37);
                                }
                            }
                            if (var9.field3337 && var19 && var9.field3465 != null) {
                                class119 var38 = new class119();
                                var38.field2103 = true;
                                var38.field2116 = var9;
                                var38.field2120 = class286.field4963 - var10;
                                var38.field2109 = class208.field3762 - var11;
                                var38.field2114 = var9.field3465;
                                class116.field2031.method1269(false, var38);
                            }
                            if (var9.field3337 && !var19) {
                                var9.field3337 = false;
                                if (var9.field3338 != null) {
                                    class119 var39 = new class119();
                                    var39.field2103 = true;
                                    var39.field2116 = var9;
                                    var39.field2120 = class286.field4963 - var10;
                                    var39.field2109 = class208.field3762 - var11;
                                    var39.field2114 = var9.field3338;
                                    class208.field3758.method1269(false, var39);
                                }
                            }
                            if (var9.field3377 != null) {
                                class119 var40 = new class119();
                                var40.field2116 = var9;
                                var40.field2114 = var9.field3377;
                                class165.field2927.method1269(false, var40);
                            }
                            if (var9.field3439 != null && class298.field5165 > var9.field3331) {
                                if (var9.field3401 == null || class298.field5165 - var9.field3331 > 32) {
                                    class119 var45 = new class119();
                                    var45.field2116 = var9;
                                    var45.field2114 = var9.field3439;
                                    class116.field2031.method1269(false, var45);
                                } else {
                                    label548: for (int var41 = var9.field3331; var41 < class298.field5165; var41++) {
                                        int var42 = class154.field2751[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field3401.length; var43++) {
                                            if (var9.field3401[var43] == var42) {
                                                class119 var44 = new class119();
                                                var44.field2116 = var9;
                                                var44.field2114 = var9.field3439;
                                                class116.field2031.method1269(false, var44);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field3331 = class298.field5165;
                            }
                            if (var9.field3387 != null && class114.field2013 > var9.field3301) {
                                if (var9.field3308 == null || class114.field2013 - var9.field3301 > 32) {
                                    class119 var50 = new class119();
                                    var50.field2116 = var9;
                                    var50.field2114 = var9.field3387;
                                    class116.field2031.method1269(false, var50);
                                } else {
                                    label524: for (int var46 = var9.field3301; var46 < class114.field2013; var46++) {
                                        int var47 = class229.field3930[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field3308.length; var48++) {
                                            if (var9.field3308[var48] == var47) {
                                                class119 var49 = new class119();
                                                var49.field2116 = var9;
                                                var49.field2114 = var9.field3387;
                                                class116.field2031.method1269(false, var49);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field3301 = class114.field2013;
                            }
                            if (var9.field3424 != null && class249.field4235 > var9.field3356) {
                                if (var9.field3328 == null || class249.field4235 - var9.field3356 > 32) {
                                    class119 var55 = new class119();
                                    var55.field2116 = var9;
                                    var55.field2114 = var9.field3424;
                                    class116.field2031.method1269(false, var55);
                                } else {
                                    label500: for (int var51 = var9.field3356; var51 < class249.field4235; var51++) {
                                        int var52 = class165.field2930[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field3328.length; var53++) {
                                            if (var9.field3328[var53] == var52) {
                                                class119 var54 = new class119();
                                                var54.field2116 = var9;
                                                var54.field2114 = var9.field3424;
                                                class116.field2031.method1269(false, var54);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field3356 = class249.field4235;
                            }
                            if (var9.field3438 != null && class292.field5052 > var9.field3416) {
                                if (var9.field3397 == null || class292.field5052 - var9.field3416 > 32) {
                                    class119 var60 = new class119();
                                    var60.field2116 = var9;
                                    var60.field2114 = var9.field3438;
                                    class116.field2031.method1269(false, var60);
                                } else {
                                    label476: for (int var56 = var9.field3416; var56 < class292.field5052; var56++) {
                                        int var57 = class93.field1679[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field3397.length; var58++) {
                                            if (var9.field3397[var58] == var57) {
                                                class119 var59 = new class119();
                                                var59.field2116 = var9;
                                                var59.field2114 = var9.field3438;
                                                class116.field2031.method1269(false, var59);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field3416 = class292.field5052;
                            }
                            if (var9.field3385 != null && class216.field3846 > var9.field3304) {
                                if (var9.field3316 == null || class216.field3846 - var9.field3304 > 32) {
                                    class119 var65 = new class119();
                                    var65.field2116 = var9;
                                    var65.field2114 = var9.field3385;
                                    class116.field2031.method1269(false, var65);
                                } else {
                                    label452: for (int var61 = var9.field3304; var61 < class216.field3846; var61++) {
                                        int var62 = class108.field1926[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field3316.length; var63++) {
                                            if (var9.field3316[var63] == var62) {
                                                class119 var64 = new class119();
                                                var64.field2116 = var9;
                                                var64.field2114 = var9.field3385;
                                                class116.field2031.method1269(false, var64);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field3304 = class216.field3846;
                            }
                            if (class181.field3214 > var9.field3414 && var9.field3452 != null) {
                                class119 var66 = new class119();
                                var66.field2116 = var9;
                                var66.field2114 = var9.field3452;
                                class116.field2031.method1269(false, var66);
                            }
                            if (class7.field113 > var9.field3414 && var9.field3321 != null) {
                                class119 var67 = new class119();
                                var67.field2116 = var9;
                                var67.field2114 = var9.field3321;
                                class116.field2031.method1269(false, var67);
                            }
                            if (class179.field3155 > var9.field3414 && var9.field3366 != null) {
                                class119 var68 = new class119();
                                var68.field2116 = var9;
                                var68.field2114 = var9.field3366;
                                class116.field2031.method1269(false, var68);
                            }
                            if (class182.field3222 > var9.field3414 && var9.field3325 != null) {
                                class119 var69 = new class119();
                                var69.field2116 = var9;
                                var69.field2114 = var9.field3325;
                                class116.field2031.method1269(false, var69);
                            }
                            if (class163.field2884 > var9.field3414 && var9.field3346 != null) {
                                class119 var70 = new class119();
                                var70.field2116 = var9;
                                var70.field2114 = var9.field3346;
                                class116.field2031.method1269(false, var70);
                            }
                            var9.field3414 = class35.field549;
                            if (var9.field3375 != null) {
                                for (int var71 = 0; var71 < class208.field3767; var71++) {
                                    class119 var72 = new class119();
                                    var72.field2116 = var9;
                                    var72.field2104 = class50.field925[var71];
                                    var72.field2117 = class119.field2105[var71];
                                    var72.field2114 = var9.field3375;
                                    class116.field2031.method1269(false, var72);
                                }
                            }
                            if (class90.field1647 && var9.field3344 != null) {
                                class119 var73 = new class119();
                                var73.field2116 = var9;
                                var73.field2114 = var9.field3344;
                                class116.field2031.method1269(false, var73);
                            }
                        }
                    }
                    if (!var9.field3396 && class240.field4096 == null && class242.field4123 == null && !class73.field1341) {
                        if ((var9.field3360 >= 0 || var9.field3422 != 0) && class286.field4963 >= var12 && class208.field3762 >= var13 && class286.field4963 < var14 && class208.field3762 < var15) {
                            if (var9.field3360 >= 0) {
                                class7.field112 = arg0[var9.field3360];
                            } else {
                                class7.field112 = var9;
                            }
                        }
                        if (var9.field3467 == 8 && class286.field4963 >= var12 && class208.field3762 >= var13 && class286.field4963 < var14 && class208.field3762 < var15) {
                            class233.field3984 = var9;
                        }
                        if (var9.field3393 > var9.field3343) {
                            class177.method1281(var11, var9.field3343, class286.field4963, var9, 30, var9.field3393, class208.field3762, var9.field3391 + var10);
                        }
                    }
                    if (var9.field3467 == 0) {
                        method831(arg0, var9.field3342, var12, var13, var14, var15, var10 - var9.field3442, var11 - var9.field3463);
                        if (var9.field3368 != null) {
                            method831(var9.field3368, var9.field3342, var12, var13, var14, var15, var10 - var9.field3442, var11 - var9.field3463);
                        }
                        class316 var74 = (class316) class62.field1098.method1744((byte) 127, (long) var9.field3342);
                        if (var74 != null) {
                            class54.method433(var10, var13, -1, var14, var11, var15, var74.field5453, var12);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Lla;", line = 2799)
    public static final class188 method832(int arg0, int arg1, int arg2) {
        field2153++;
        if (arg1 != 25767) {
            return (class188) null;
        }
        class188 var3 = class182.method1335((byte) 87, arg0);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3368 == null || arg2 >= var3.field3368.length) {
            return null;
        } else {
            return var3.field3368[arg2];
        }
    }
}
