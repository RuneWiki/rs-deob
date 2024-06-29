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
public class client extends class43 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1513 = "Continue";

    @OriginalMember(owner = "client!client", name = "S", descriptor = "[Ldl;")
    public static class308[] field1511 = new class308[4];

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lkm;")
    public static class133 field1518;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    public static boolean field1526;

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 8)
    public static void method812(int arg0) {
        field1518 = null;
        if (arg0 != 2) {
            field1513 = (String) null;
        }
        field1511 = null;
        field1513 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 21)
    private final void method813(byte[] arg0, int arg1) {
        field1515++;
        if (arg1 <= 50) {
            method818((class344) null);
        }
        class316 var3 = new class316(arg0);
        while (true) {
            int var4 = var3.method2219(16448);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                int[] var5 = class207.field2979 = new int[6];
                var5[0] = var3.method2220((byte) 120);
                var5[1] = var3.method2220((byte) 95);
                var5[2] = var3.method2220((byte) 117);
                var5[3] = var3.method2220((byte) 47);
                var5[4] = var3.method2220((byte) 46);
                var5[5] = var3.method2220((byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 64)
    public final void method269(byte arg0) {
        field1524++;
        if (class148.field2051 == 1000) {
            return;
        }
        long var2 = class320.method2237((byte) -93) / 1000000L - class153.field2131;
        class153.field2131 = class320.method2237((byte) -63) / 1000000L;
        boolean var4 = class295.method2009((byte) -103);
        if (var4 && class31.field384 && class96.field1291 != null) {
            class96.field1291.method1766((byte) -44);
        }
        if (arg0 > -9) {
            field1518 = (class133) null;
        }
        if ((class148.field2051 == 30 || class148.field2051 == 10) && (class340.field5112 || class100.field1385 != 0L && class100.field1385 < class29.method174(27763))) {
            class85.method663(class323.method2270(118), class253.field3625, class340.field5112, (byte) 44, class61.field810);
        }
        if (class329.field4964 == null) {
            Container var5;
            if (class329.field4964 != null) {
                var5 = class329.field4964;
            } else if (class138.field1898 == null) {
                var5 = class165.field2258.field1157;
            } else {
                var5 = class138.field1898;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class138.field1898 == var5) {
                Insets var8 = class138.field1898.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class226.field3237 != var6 || class223.field3203 != var7) {
                if (class80.field1164.startsWith("mac")) {
                    class226.field3237 = var6;
                    class223.field3203 = var7;
                } else {
                    class74.method549(false);
                }
                class100.field1385 = class29.method174(27763) + 500L;
            }
        }
        if (class329.field4964 != null && !class290.field4332 && (class148.field2051 == 30 || class148.field2051 == 10)) {
            class85.method663(class162.field2230, -1, false, (byte) 44, -1);
        }
        boolean var9 = false;
        if (class276.field4134) {
            var9 = true;
            class276.field4134 = false;
        }
        if (var9) {
            class172.method1206((byte) 95);
        }
        if (class67.field908) {
            for (int var10 = 0; var10 < 100; var10++) {
                class121.field1644[var10] = true;
            }
        }
        if (class148.field2051 == 0) {
            class68.method498(var9, (byte) -51, class271.field4052, class124.field1680, (Color) null);
        } else if (class148.field2051 == 5) {
            class246.method1689((byte) -113, false, class204.field2946);
        } else if (class148.field2051 == 10) {
            class209.method1472(-99);
        } else if (class148.field2051 == 25 || class148.field2051 == 28) {
            if (class294.field4368 == 1) {
                if (class113.field1543 > class274.field4109) {
                    class274.field4109 = class113.field1543;
                }
                int var11 = (class274.field4109 - class113.field1543) * 50 / class274.field4109;
                class301.method2052(false, (byte) -120, class175.field2382 + "<br>(" + var11 + "%)");
            } else if (class294.field4368 == 2) {
                if (class327.field4943 < class198.field2780) {
                    class327.field4943 = class198.field2780;
                }
                int var12 = (class327.field4943 - class198.field2780) * 50 / class327.field4943 + 50;
                class301.method2052(false, (byte) -119, class175.field2382 + "<br>(" + var12 + "%)");
            } else {
                class301.method2052(false, (byte) -120, class175.field2382);
            }
        } else if (class148.field2051 == 30) {
            class82.method644(0, var2);
        } else if (class148.field2051 == 40) {
            class301.method2052(false, (byte) -121, class39.field444 + "<br>" + class332.field4998);
        }
        if (class67.field908 && class148.field2051 != 0) {
            class67.method490();
            for (int var13 = 0; var13 < class231.field3266; var13++) {
                class304.field4571[var13] = false;
            }
        } else if ((class148.field2051 == 30 || class148.field2051 == 10) && class194.field2677 == 0 && !var9) {
            try {
                Graphics var14 = class150.field2079.getGraphics();
                for (int var15 = 0; var15 < class231.field3266; var15++) {
                    if (class304.field4571[var15]) {
                        class272.field4079.method1110(var14, class333.field5009[var15], (byte) -58, class262.field3852[var15], class66.field868[var15], class234.field3318[var15]);
                        class304.field4571[var15] = false;
                    }
                }
            } catch (Exception var21) {
                class150.field2079.repaint();
            }
        } else if (class148.field2051 != 0) {
            try {
                Graphics var17 = class150.field2079.getGraphics();
                class272.field4079.method1109(0, 30364, var17, 0);
                for (int var18 = 0; var18 < class231.field3266; var18++) {
                    class304.field4571[var18] = false;
                }
            } catch (Exception var20) {
                class150.field2079.repaint();
            }
        }
        if (class10.field91) {
            class217.method1503((byte) -88);
        }
        if (class334.field5045 && class148.field2051 == 10 && class183.field2521 != -1) {
            class334.field5045 = false;
            class275.method1894((byte) -100, class165.field2258);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 294)
    public final void method275(byte arg0) {
        method812(arg0 ^ 0x6E);
        class190.method1331((byte) -77);
        class176.method1222((byte) -85);
        class172.method1205(false);
        field1514++;
        class237.method1635(8);
        class41.method254(true);
        class43.method266((byte) 63);
        class67.method474();
        class153.method1108((byte) -53);
        class279.method1932(0);
        class324.method2274((byte) -91);
        class316.method2191(13755);
        class223.method1571(125);
        class13.method86(-24143);
        class25.method147(6834);
        class243.method1670(-112);
        class271.method1876(56);
        class56.method387(false);
        class330.method2305(arg0 + 147);
        class99.method728(-75);
        class329.method2299(7);
        class72.method538(true);
        class344.method2377(true);
        class31.method180(false);
        class241.method1648(0);
        class192.method1341(98);
        class170.method1196(false);
        class249.method1699(true);
        class112.method828((byte) -120);
        class219.method1515((byte) 45);
        class77.method564(arg0 - 108);
        class257.method1767((byte) 91);
        class222.method1567((byte) -57);
        class125.method909(3);
        class256.method1747(0);
        class202.method1433(false);
        class302.method2070(94);
        class238.method1637((byte) 41);
        class181.method1259((byte) -99);
        class300.method2042(6024102);
        class183.method1275((byte) -105);
        class193.method1351(113044970);
        class97.method707(false);
        class52.method362(false);
        class108.method791(arg0 + 27914);
        class188.method1317((byte) -101);
        class123.method888(20986);
        class332.method2312(8945);
        class140.method1013(4336);
        class6.method31((byte) -126);
        class74.method551((byte) 119);
        class154.method1117((byte) -59);
        class40.method250();
        class197.method1393(-16598);
        class59.method407((byte) 10);
        class272.method1878((byte) 103);
        class15.method97(false);
        class139.method1009();
        class19.method125(arg0 ^ 0x68);
        class308.method2098();
        class44.method282((byte) -125);
        class267.method1819();
        class198.method1397(arg0 - 48);
        class50.method342();
        class207.method1462(0);
        class96.method705(0);
        class251.method1709(97);
        class180.method1250();
        class261.method1788();
        class20.method127(500);
        class148.method1072(arg0 ^ 0xFFFFFFB6);
        class23.method136(-1);
        class4.method18(122);
        class277.method1923();
        class128.method921(111);
        class333.method2314((byte) 116);
        class200.method1415();
        class121.method878(-30556);
        class100.method734(arg0 - 108);
        class312.method2137(-4669);
        class283.method1958();
        class147.method1061();
        class270.method1859(arg0 ^ 0xFFFF9F68);
        class160.method1154(9445);
        class11.method67(false);
        class248.method1697(0);
        class38.method234();
        class323.method2271(284);
        class304.method2072(-110);
        class115.method852(109);
        class36.method203(arg0 - 109);
        class53.method367((byte) -121);
        class273.method1879(1190717);
        class230.method1595(-66);
        class119.method865((byte) -98);
        class78.method607(-23252);
        class35.method193(5164);
        class235.method1619(-1);
        class22.method133((byte) 14);
        class194.method1362(arg0 - 22646);
        class309.method2124(37);
        class157.method1134((byte) 122);
        class145.method1041((byte) -74);
        class49.method307();
        class26.method155(1);
        class28.method161(1);
        class287.method1969(-13299);
        class264.method1796((byte) 104);
        class71.method522((byte) 54);
        class295.method2010(-108);
        class195.method1375();
        class155.method1123(arg0 - 111);
        class141.method1019(0);
        class327.method2286(6449);
        class187.method1314(true);
        class204.method1445(arg0 ^ 0x4);
        class218.method1507(-93);
        class234.method1612(79);
        class274.method1883(true);
        class81.method631();
        class282.method1947((byte) -4);
        class184.method1279();
        class211.method1482(-21230);
        class89.method685((byte) -115);
        class179.method1242((byte) -99);
        class340.method2351(28);
        class259.method1783(-9618);
        class163.method1173(93);
        class69.method509();
        class85.method655((byte) 118);
        class75.method555();
        class226.method1583((byte) -88);
        class208.method1468(arg0 - 221);
        class83.method648(0);
        class171.method1204(15176);
        class132.method944((byte) -85);
        class268.method1848();
        class280.method1936(arg0 - 195);
        class209.method1471(12141);
        class7.method36((byte) -93);
        class269.method1852((byte) -88);
        class306.method2080(126);
        class186.method1306(-16);
        class149.method1079((byte) -79);
        class144.method1040();
        class339.method2346(28);
        class293.method2002(44);
        class314.method2144(arg0 ^ 0xFFFFFF93);
        class260.method1786();
        class322.method2264();
        class12.method70();
        class66.method450(arg0 - 108);
        class342.method2359((byte) -120);
        class105.method774();
        class102.method741();
        if (arg0 != 108) {
            return;
        }
        class46.method291();
        class252.method1715(false);
        class253.method1730(55);
        class292.method1999(-201);
        class276.method1895((byte) -43);
        class143.method1027(true);
        class113.method829(122);
        class98.method710((byte) 126);
        class8.method43(arg0 - 231);
        class221.method1560(arg0 ^ 0xF06F7CEB);
        class182.method1267();
        class37.method210((byte) 18);
        class231.method1601(27429);
        class326.method2280(arg0 ^ 0x2C);
        class16.method104(1412584498);
        class185.method1302(120);
        class224.method1580(87);
        class129.method926(true);
        class301.method2045((byte) -86);
        class336.method2327(false);
        class151.method1098(-78);
        class165.method1180(-112);
        class45.method288((byte) 19);
        class1.method4(0);
        class122.method883(-60);
        class51.method349(0);
        class307.method2086(155);
        class294.method2005((byte) 50);
        class158.method1146();
        class33.method186(arg0 ^ 0xFFFFFFE1);
        class250.method1707((byte) -114);
        class88.method681(-31);
        class175.method1218(11912);
        class47.method302((byte) -92);
        class228.method1593();
        class57.method398();
        class213.method1487(-2520);
        class90.method687(arg0 + 12);
        class337.method2332(arg0 - 19);
        class338.method2339(true);
        class27.method158();
        class18.method122();
        class246.method1690((byte) -79);
        class216.method1497((byte) -13);
        class227.method1592();
        class244.method1676();
        class14.method92();
        class116.method856(124);
        class290.method1992(-97);
        class317.method2223(21150);
        class196.method1386(402);
        class42.method256(126);
        class159.method1149(0);
        class173.method1211(-93);
        class136.method993(119);
        class55.method380((byte) 64);
        class150.method1084(arg0 + 12);
        class146.method1053(true);
        class247.method1692((byte) -25);
        class266.method1809((byte) 42);
        class313.method2141(-75);
        class311.method2132((byte) -9);
        class124.method893(116);
        class254.method1736((byte) 122);
        class288.method1980(0);
        class103.method758(true);
        class289.method1985(0);
        class101.method737((byte) -63);
        class262.method1794((byte) -102);
        class167.method1185((byte) 29);
        class242.method1665((byte) 86);
        class201.method1430((byte) -128);
        class73.method545((byte) 23);
        class92.method693(false);
        class210.method1476(-51);
        class24.method142((byte) 50);
        class203.method1439(true);
        class169.method1192((byte) -123);
        class334.method2321((byte) -98);
        class10.method63((byte) 85);
        class296.method2018((byte) -110);
        class106.method782((byte) -120);
        class275.method1891((byte) 112);
        class189.method1327(0);
        class70.method513((byte) 93);
        class117.method862((byte) 115);
        class130.method934(-4);
        class107.method787((byte) 39);
        class39.method238(arg0 - 13448);
        class217.method1500((byte) 107);
        class54.method373(arg0 ^ 0xFFFFFFEF);
        class109.method795((byte) -100);
        class286.method1962((byte) 33);
        class142.method1026((byte) 50);
        class21.method131(7);
        class315.method2148((byte) 1);
        class111.method807(25132);
        class255.method1744((byte) -84);
        class232.method1605((byte) -58);
        class76.method561(true);
        class291.method1995(arg0 + 9927);
        class131.method935(1);
        class138.method995(-96);
        class63.method423(arg0 - 108);
        class168.method1188(1);
        class134.method976((byte) 3);
        class199.method1413(true);
        class30.method176(arg0 ^ 0xFFFFFF99);
        class82.method642((byte) 121);
        class162.method1165(arg0 ^ 0xFFFFFFFB);
        class61.method409(arg0 + 31224);
        class166.method1183(-120);
        class135.method984(arg0 - 57);
        class240.method1643(-107);
        class174.method1213((byte) -7);
        class278.method1925(arg0 + 788);
        class126.method912(36);
        class68.method497(18);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 579)
    private final void method814(int arg0, int arg1) {
        field1521++;
        class101.field1393 = null;
        class78.field1133.field158++;
        class78.field1133.field159 = arg1;
        if (arg0 == 80) {
            class175.field2378 = 0;
            class52.field695 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lin;)Z", line = 595)
    public static final boolean method815(class344 arg0) {
        if (class63.field823) {
            if (method821(arg0).field4426 != 0) {
                return false;
            }
            if (arg0.field5316 == 0) {
                return false;
            }
        }
        return arg0.field5350;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 614)
    private final void method816(int arg0) {
        if (arg0 < 90) {
            method815((class344) null);
        }
        field1516++;
        for (class132.field1805 = 0; class306.method2081(16989) && class132.field1805 < 128; class132.field1805++) {
            class213.field3071[class132.field1805] = class44.field541;
            class23.field291[class132.field1805] = class124.field1673;
        }
        class287.field4278++;
        if (class183.field2521 != -1) {
            class123.method891(class64.field836, -123, 0, class183.field2521, 0, 0, class187.field2592, 0);
        }
        class185.field2549++;
        if (class67.field908) {
            int var2 = 2359807;
            label190: for (int var3 = 0; var3 < 32768; var3++) {
                class329 var4 = class42.field484[var3];
                if (var4 != null) {
                    byte var5 = var4.field4961.field2475;
                    if ((var5 & 0x2) > 0 && var4.field3743 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field3750[0] = 1;
                            var4.field3706[0] = (var4.field3745 >> 7) + var6;
                            var4.field3768[0] = (var4.field3679 >> 7) + var7;
                            class312.field4714[class251.field3603].method529(94, var4.field3745 >> 7, var4.method1653(-1), 0, var4.field3679 >> 7, false, var4.method1653(-1), false);
                            if (var4.field3706[0] >= 0 && var4.field3706[0] <= (104 - var4.method1653(-1)) && var4.field3768[0] >= 0 && var4.field3768[0] <= 104 - var4.method1653(-1) && class312.field4714[class251.field3603].method531(var4.field3679 >> 7, var4.field3768[0], true, var4.field3745 >> 7, var4.field3706[0])) {
                                if (var4.method1653(-1) > 1) {
                                    for (int var8 = var4.field3706[0]; var8 < (var4.field3706[0] + var4.method1653(-1)); var8++) {
                                        for (int var9 = var4.field3768[0]; var9 < (var4.field3768[0] + var4.method1653(-1)); var9++) {
                                            if ((class312.field4714[class251.field3603].field988[var8][var9] & var2) != 0) {
                                                continue label190;
                                            }
                                        }
                                    }
                                }
                                var4.field3743 = 1;
                            }
                        }
                    }
                    class154.method1114(69, var4);
                    class176.method1221(var4, -97);
                    class194.method1358(var4, false);
                    class312.field4714[class251.field3603].method525(var4.method1653(-1), false, var4.field3745 >> 7, var4.field3679 >> 7, -17110, false, var4.method1653(-1));
                }
            }
        }
        if (!class67.field908) {
            class339.method2348(21887);
        } else if (class198.field2822 == 0 && class275.field4128 == 0) {
            if (class343.field5168 == 2) {
                class206.method1454((byte) -126);
            } else {
                class78.method605(2);
            }
            if ((class198.field2820 >> 7) < 14 || class198.field2820 >> 7 >= 90 || (class275.field4123 >> 7) < 14 || class275.field4123 >> 7 >= 90) {
                class271.method1875((byte) 74);
            }
        }
        while (true) {
            class171 var10;
            class344 var11;
            class344 var12;
            do {
                var10 = (class171) class266.field3871.method1350((byte) -126);
                if (var10 == null) {
                    while (true) {
                        class171 var13;
                        class344 var17;
                        class344 var18;
                        do {
                            var13 = (class171) class269.field3982.method1350((byte) -125);
                            if (var13 == null) {
                                while (true) {
                                    class171 var14;
                                    class344 var15;
                                    class344 var16;
                                    do {
                                        var14 = (class171) class218.field3123.method1350((byte) -125);
                                        if (var14 == null) {
                                            if (class134.field1852 != null) {
                                                class43.method279(-119);
                                            }
                                            if (class106.field1436 != null && class106.field1436.field4241 == 1) {
                                                if (class106.field1436.field4244 != null) {
                                                    class221.method1557(-85, class93.field1287, class216.field3083);
                                                }
                                                class93.field1287 = false;
                                                class216.field3083 = null;
                                                class106.field1436 = null;
                                            }
                                            if (class329.field4966 % 1500 == 0) {
                                                class181.method1253(-18425);
                                            }
                                            return;
                                        }
                                        var15 = var14.field2341;
                                        if (var15.field5275 < 0) {
                                            break;
                                        }
                                        var16 = class151.method1101(-56, var15.field5246);
                                    } while (var16 == null || var16.field5248 == null || var16.field5248.length <= var15.field5275 || var16.field5248[var15.field5275] != var15);
                                    class314.method2145(-107, var14);
                                }
                            }
                            var17 = var13.field2341;
                            if (var17.field5275 < 0) {
                                break;
                            }
                            var18 = class151.method1101(-112, var17.field5246);
                        } while (var18 == null || var18.field5248 == null || var17.field5275 >= var18.field5248.length || var18.field5248[var17.field5275] != var17);
                        class314.method2145(113, var13);
                    }
                }
                var11 = var10.field2341;
                if (var11.field5275 < 0) {
                    break;
                }
                var12 = class151.method1101(-48, var11.field5246);
            } while (var12 == null || var12.field5248 == null || var12.field5248.length <= var11.field5275 || var12.field5248[var11.field5275] != var11);
            class314.method2145(110, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 827)
    private final void method817(int arg0) {
        field1525++;
        if (class16.field191 < class78.field1133.field158) {
            if (class54.field726 == class129.field1780) {
                class129.field1780 = class103.field1411;
            } else {
                class129.field1780 = class54.field726;
            }
            class126.field1740 = (class78.field1133.field158 - 1) * 5 * 50;
            if (class126.field1740 > 3000) {
                class126.field1740 = 3000;
            }
            if (class78.field1133.field158 >= 2 && class78.field1133.field159 == 6) {
                this.method265("js5connect_outofdate", 120);
                class148.field2051 = 1000;
                return;
            }
            if (class78.field1133.field158 >= 4 && class78.field1133.field159 == -1) {
                this.method265("js5crc", 56);
                class148.field2051 = 1000;
                return;
            }
            if (class78.field1133.field158 >= 4 && (class148.field2051 == 0 || class148.field2051 == 5)) {
                if (class78.field1133.field159 == 7 || class78.field1133.field159 == 9) {
                    this.method265("js5connect_full", 65);
                } else if (class78.field1133.field159 > 0) {
                    this.method265("js5connect", 107);
                } else {
                    this.method265("js5io", 79);
                }
                class148.field2051 = 1000;
                return;
            }
        }
        class16.field191 = class78.field1133.field158;
        if (class126.field1740 > 0) {
            class126.field1740--;
            return;
        }
        try {
            if (class175.field2378 == 0) {
                class101.field1393 = class165.field2258.method618(class129.field1780, class252.field3611, -54);
                class175.field2378++;
            }
            if (class175.field2378 == 1) {
                if (class101.field1393.field4241 == 2) {
                    this.method814(80, 1000);
                    return;
                }
                if (class101.field1393.field4241 == 1) {
                    class175.field2378++;
                }
            }
            if (class175.field2378 == 2) {
                class52.field695 = new class223((Socket) class101.field1393.field4244, class165.field2258);
                class316 var2 = new class316(5);
                var2.method2184((byte) 89, 15);
                var2.method2188(255, 541);
                class52.field695.method1575(5, 0, 5000, var2.field4798);
                class175.field2378++;
                class293.field4359 = class29.method174(27763);
            }
            int var3 = -73 % ((arg0 + 86) / 33);
            if (class175.field2378 == 3) {
                if (class148.field2051 == 0 || class148.field2051 == 5 || class52.field695.method1572(0) > 0) {
                    int var4 = class52.field695.method1570((byte) 76);
                    if (var4 != 0) {
                        this.method814(80, var4);
                        return;
                    }
                    class175.field2378++;
                } else if (class29.method174(27763) - class293.field4359 > 30000L) {
                    this.method814(80, 1001);
                    return;
                }
            }
            if (class175.field2378 == 4) {
                boolean var5 = class148.field2051 == 5 || class148.field2051 == 10 || class148.field2051 == 28;
                class78.field1133.method85(class52.field695, !var5, -1);
                class52.field695 = null;
                class175.field2378 = 0;
                class101.field1393 = null;
            }
        } catch (IOException var7) {
            this.method814(80, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lin;)Lin;", line = 975)
    public static final class344 method818(class344 arg0) {
        int var1 = method821(arg0).method2035(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class151.method1101(-38, arg0.field5246);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 998)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class323.method2267("argument count", -30901);
            }
            class85.field1236 = Integer.parseInt(arg0[0]);
            class6.field46 = 2;
            if (arg0[1].equals("live")) {
                class44.field530 = 0;
            } else if (arg0[1].equals("rc")) {
                class44.field530 = 1;
            } else if (arg0[1].equals("wip")) {
                class44.field530 = 2;
            } else {
                class323.method2267("modewhat", -30901);
            }
            class39.field446 = false;
            class202.field2874 = class339.method2347(arg0[2], (byte) -105);
            if (class202.field2874 == -1) {
                if (arg0[2].equals("english")) {
                    class202.field2874 = 0;
                } else if (arg0[2].equals("german")) {
                    class202.field2874 = 1;
                } else {
                    class323.method2267("language", -30901);
                }
            }
            class79.method609(3, class202.field2874);
            class153.field2116 = false;
            class333.field5034 = false;
            if (arg0[3].equals("game0")) {
                class39.field448 = 0;
            } else if (arg0[3].equals("game1")) {
                class39.field448 = 1;
            } else {
                class323.method2267("game", -30901);
            }
            class148.field2054 = false;
            class316.field4766 = 0;
            class169.field2297 = 0;
            class165.field2262 = "";
            client var1 = new client();
            class329.field4968 = var1;
            var1.method261(29, false, 1024, 768, class44.field530 + 32, 541, "runescape", -1);
            class138.field1898.setLocation(40, 40);
        } catch (Exception var3) {
            class187.method1307((String) null, var3, 116);
        }
        field1510++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1065)
    public final void method263(int arg0) {
        if (class67.field908) {
            class67.method469();
        }
        field1512++;
        if (class329.field4964 != null) {
            class145.method1048((byte) -32, class165.field2258, class329.field4964);
            class329.field4964 = null;
        }
        if (class165.field2258 != null) {
            class165.field2258.method619(-26049, this.getClass());
        }
        if (class28.field360 != null) {
            class28.field360.field4190 = false;
        }
        if (arg0 < 43) {
            return;
        }
        class28.field360 = null;
        if (class39.field442 != null) {
            class39.field442.method1577((byte) -128);
            class39.field442 = null;
        }
        class259.method1785(-26092, class150.field2079);
        class181.method1258(0, class150.field2079);
        if (class196.field2731 != null) {
            class196.field2731.method1700(class150.field2079, (byte) -52);
        }
        class270.method1857((byte) -30);
        class221.method1563((byte) -28);
        class196.field2731 = null;
        if (class96.field1291 != null) {
            class96.field1291.method1771(0);
        }
        if (class344.field5325 != null) {
            class344.field5325.method1771(0);
        }
        class78.field1133.method83((byte) -5);
        class76.field1040.method146(119);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1119)
    public final void method262(int arg0) {
        field1523++;
        class74.method549(false);
        class76.field1040 = new class25();
        class78.field1133 = new class13();
        if (class44.field530 != 0) {
            class85.field1235 = new byte[50][];
        }
        class241.method1655((byte) -64, class165.field2258);
        if (class6.field46 == 0) {
            class296.field4391 = this.getCodeBase().getHost();
            class66.field873 = 443;
            class137.field1888 = 43594;
        } else if (class6.field46 == 1) {
            class296.field4391 = this.getCodeBase().getHost();
            class137.field1888 = class85.field1236 + 40000;
            class66.field873 = class85.field1236 + 50000;
        } else if (class6.field46 == 2) {
            class137.field1888 = class85.field1236 + 40000;
            class296.field4391 = "127.0.0.1";
            class66.field873 = class85.field1236 + 50000;
        }
        class312.field4713 = class300.field4436 = class338.field5087 = class163.field2238 = new short[256];
        class273.field4088 = class137.field1888;
        class129.field1780 = class273.field4088;
        if (class39.field448 == 1) {
            class166.field2271 = class338.field5086;
            class251.field3604 = class304.field4567;
            class332.field4997 = class176.field2391;
            class167.field2276 = true;
            class194.field2694 = class116.field1587;
            class139.field1905 = 16777215;
            class139.field1907 = 0;
        } else {
            class332.field4997 = class276.field4137;
            class251.field3604 = class89.field1259;
            class194.field2694 = class157.field2175;
            class166.field2271 = class55.field750;
        }
        class103.field1411 = class66.field873;
        class252.field3611 = class296.field4391;
        if (class80.field1151 == 3 && class6.field46 != 2) {
            class199.field2838 = class85.field1236;
        }
        class54.field726 = class137.field1888;
        class56.method390((byte) 3);
        class22.method135(class150.field2079, false);
        class1.method5(-1, class150.field2079);
        class196.field2731 = class206.method1458(28570);
        if (class196.field2731 != null) {
            class196.field2731.method1702(-127, class150.field2079);
        }
        class230.field3263 = class80.field1151;
        int var2 = -68 % ((41 - arg0) / 49);
        try {
            if (class165.field2258.field1167 != null) {
                class302.field4495 = new class56(class165.field2258.field1167, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class272.field4077[var3] = new class56(class165.field2258.field1155[var3], 6000, 0);
                }
                class234.field3304 = new class56(class165.field2258.field1153, 6000, 0);
                class163.field2248 = new class330(255, class302.field4495, class234.field3304, 500000);
                class255.field3647 = new class56(class165.field2258.field1154, 24, 0);
                class165.field2258.field1167 = null;
                class165.field2258.field1155 = null;
                class165.field2258.field1153 = null;
                class165.field2258.field1154 = null;
            }
        } catch (IOException var5) {
            class163.field2248 = null;
            class234.field3304 = null;
            class302.field4495 = null;
            class255.field3647 = null;
        }
        if (class6.field46 != 0) {
            class221.field3165 = true;
        }
        class30.field371 = class193.field2656;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 1237)
    private final void method819(boolean arg0) {
        field1520++;
        if (!class334.field5045) {
            label276: while (true) {
                do {
                    if (!class306.method2081(16989)) {
                        break label276;
                    }
                } while (class124.field1673 != 's' && class124.field1673 != 'S');
                class334.field5045 = true;
            }
        }
        if (class107.field1450 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class29.method174(27763);
            if (class337.field5075 == 0L) {
                class337.field5075 = var28;
            }
            if (var27 > 16384 && var28 - class337.field5075 < 5000L) {
                if ((var28 - class266.field3881) > 1000L) {
                    System.gc();
                    class266.field3881 = var28;
                }
                class124.field1680 = class151.field2097;
                class271.field4052 = 5;
            } else {
                class124.field1680 = class154.field2135;
                class271.field4052 = 5;
                class107.field1450 = 10;
            }
        } else if (class107.field1450 == 10) {
            class147.method1056(4, 104, 104);
            for (int var25 = 0; var25 < 4; var25++) {
                class312.field4714[var25] = new class72(104, 104);
            }
            class124.field1680 = class317.field4846;
            class107.field1450 = 30;
            class271.field4052 = 10;
        } else if (class107.field1450 == 30) {
            if (class280.field4211 == null) {
                class280.field4211 = new class243(class78.field1133, class76.field1040);
            }
            if (class280.field4211.method1668((byte) 21)) {
                class249.field3577 = class150.method1089(false, -9067, 0, true, true);
                class289.field4308 = class150.method1089(false, -9067, 1, true, true);
                class221.field3179 = class150.method1089(true, -9067, 2, true, false);
                class145.field2004 = class150.method1089(false, -9067, 3, true, true);
                class259.field3811 = class150.method1089(false, -9067, 4, true, true);
                class92.field1281 = class150.method1089(true, -9067, 5, true, true);
                class173.field2349 = class150.method1089(true, -9067, 6, false, true);
                class249.field3579 = class150.method1089(false, -9067, 7, true, true);
                class204.field2948 = class150.method1089(false, -9067, 8, true, true);
                class1.field5 = class150.method1089(false, -9067, 9, true, true);
                class332.field5002 = class150.method1089(false, -9067, 10, true, true);
                class44.field544 = class150.method1089(false, -9067, 11, true, true);
                class20.field260 = class150.method1089(false, -9067, 12, true, true);
                class256.field3708 = class150.method1089(false, -9067, 13, true, true);
                class159.field2177 = class150.method1089(false, -9067, 14, false, true);
                class54.field724 = class150.method1089(false, -9067, 15, true, true);
                class43.field499 = class150.method1089(false, -9067, 16, true, true);
                class141.field1933 = class150.method1089(false, -9067, 17, true, true);
                class257.field3776 = class150.method1089(false, -9067, 18, true, true);
                class162.field2236 = class150.method1089(false, -9067, 19, true, true);
                class163.field2244 = class150.method1089(false, -9067, 20, true, true);
                class116.field1569 = class150.method1089(false, -9067, 21, true, true);
                class204.field2924 = class150.method1089(false, -9067, 22, true, true);
                class307.field4595 = class150.method1089(true, -9067, 23, true, true);
                class54.field719 = class150.method1089(false, -9067, 24, true, true);
                class85.field1234 = class150.method1089(false, -9067, 25, true, true);
                class44.field543 = class150.method1089(true, -9067, 26, true, true);
                class209.field3022 = class150.method1089(false, -9067, 27, true, true);
                class315.field4751 = class150.method1089(true, -9067, 28, true, true);
                class107.field1450 = 40;
                class124.field1680 = class74.field1019;
                class271.field4052 = 15;
            } else {
                class271.field4052 = 12;
                class124.field1680 = class339.field5089;
            }
        } else if (class107.field1450 == 40) {
            int var2 = 0;
            for (int var3 = 0; var3 < 29; var3++) {
                var2 += class201.field2855[var3].method1873(100) * class312.field4715[var3] / 100;
            }
            if (var2 == 100) {
                class271.field4052 = 20;
                class124.field1680 = class148.field2048;
                class338.method2342(class204.field2948, 40);
                class187.method1309(-13521, class204.field2948);
                class164.method1178((byte) 115, class204.field2948);
                class107.field1450 = 41;
            } else {
                if (var2 != 0) {
                    class124.field1680 = class271.field4065 + var2 + "%";
                }
                class271.field4052 = 20;
            }
        } else if (class107.field1450 != 41) {
            if (!arg0) {
                field1511 = (class308[]) null;
            }
            if (class107.field1450 == 45) {
                class340.method2352(8000, class72.field1000, 22050, 2);
                class20.field253 = new class77();
                class20.field253.method571(128, 9, true);
                class96.field1291 = class196.method1390(22050, class150.field2079, class165.field2258, 0, 116);
                class96.field1291.method1769(false, class20.field253);
                class125.method900(class54.field724, class259.field3811, class20.field253, 1, class159.field2177);
                class344.field5325 = class196.method1390(2048, class150.field2079, class165.field2258, 1, 110);
                class160.field2196 = new class156();
                class344.field5325.method1769(false, class160.field2196);
                class135.field1862 = new class222(22050, class273.field4085);
                class66.field875 = class173.field2349.method964(87, "scape main");
                class271.field4052 = 30;
                class124.field1680 = class300.field4431;
                class107.field1450 = 50;
            } else if (class107.field1450 == 50) {
                int var4 = class289.method1982(class204.field2948, 14489, class256.field3708);
                int var5 = class98.method715(503);
                if (var5 <= var4) {
                    class107.field1450 = 60;
                    class124.field1680 = class192.field2642;
                    class271.field4052 = 35;
                } else {
                    class271.field4052 = 35;
                    class124.field1680 = class167.field2279 + var4 * 100 / var5 + "%";
                }
            } else if (class107.field1450 == 60) {
                int var6 = class295.method2014(class204.field2948, false);
                int var7 = class226.method1590((byte) 120);
                if (var7 > var6) {
                    class124.field1680 = class176.field2398 + var6 * 100 / var7 + "%";
                    class271.field4052 = 40;
                } else {
                    class124.field1680 = class327.field4948;
                    class107.field1450 = 65;
                    class271.field4052 = 40;
                }
            } else if (class107.field1450 == 65) {
                class310.method2128((byte) 10, class204.field2948, class256.field3708);
                class124.field1680 = class92.field1273;
                class271.field4052 = 45;
                class189.method1325(1, 5);
                class107.field1450 = 70;
            } else if (class107.field1450 == 70) {
                class221.field3179.method959(false);
                byte var8 = 0;
                int var9 = var8 + class221.field3179.method957(114);
                class43.field499.method959(!arg0);
                int var10 = var9 + class43.field499.method957(113);
                class141.field1933.method959(false);
                int var11 = var10 + class141.field1933.method957(87);
                class257.field3776.method959(false);
                int var12 = var11 + class257.field3776.method957(120);
                class162.field2236.method959(false);
                int var13 = var12 + class162.field2236.method957(118);
                class163.field2244.method959(!arg0);
                int var14 = var13 + class163.field2244.method957(113);
                class116.field1569.method959(false);
                int var15 = var14 + class116.field1569.method957(102);
                class204.field2924.method959(false);
                int var16 = var15 + class204.field2924.method957(88);
                class54.field719.method959(!arg0);
                int var17 = var16 + class54.field719.method957(127);
                class85.field1234.method959(!arg0);
                int var18 = var17 + class85.field1234.method957(113);
                class209.field3022.method959(false);
                int var19 = var18 + class209.field3022.method957(87);
                if (var19 >= 1100) {
                    class66.method449(false, class221.field3179);
                    class186.method1305(class221.field3179, 0);
                    class72.method526(26892, class221.field3179);
                    class39.method236(class221.field3179, -108, class249.field3579);
                    class252.method1713((byte) 114, true, class43.field499, class249.field3579);
                    class111.method811(-1, class249.field3579, class257.field3776);
                    class63.method420((byte) 60, class162.field2236, class109.field1480, class249.field3579, true);
                    class217.method1502(class221.field3179, (byte) 85);
                    class223.method1574(class163.field2244, class249.field3577, class289.field4308, (byte) -122);
                    class279.method1935(class221.field3179, 88);
                    class136.method989(class116.field1569, (byte) -35, class249.field3579);
                    class243.method1671((byte) 18, class204.field2924);
                    class318.method2231(8324, class221.field3179);
                    class210.method1473(class256.field3708, class204.field2948, class145.field2004, -4096, class249.field3579);
                    class45.method287(class221.field3179, -85);
                    class148.method1076(-94, class141.field1933);
                    class99.method722(class54.field719, (byte) -103, new class264(), class85.field1234);
                    class291.method1994(1, class54.field719, class85.field1234);
                    class135.method981(class221.field3179, (byte) 110);
                    class262.method1793((byte) 122, class221.field3179);
                    class219.method1511(16, class221.field3179);
                    class256.method1754(class204.field2948, -115, class221.field3179);
                    class199.method1411((byte) 85, class204.field2948, class221.field3179);
                    class124.field1680 = class332.field5000;
                    class271.field4052 = 50;
                    class33.method189(117);
                    class107.field1450 = 80;
                } else {
                    class124.field1680 = class71.field968 + var19 / 11 + "%";
                    class271.field4052 = 50;
                }
            } else if (class107.field1450 == 80) {
                int var20 = class252.method1724(class204.field2948, -128);
                int var21 = class337.method2334(1);
                if (var21 > var20) {
                    class271.field4052 = 60;
                    class124.field1680 = class56.field770 + var20 * 100 / var21 + "%";
                } else {
                    class64.method429(-30362, class204.field2948);
                    class107.field1450 = 90;
                    class271.field4052 = 60;
                    class124.field1680 = class190.field2622;
                }
            } else if (class107.field1450 == 90) {
                if (class44.field543.method959(!arg0)) {
                    class204 var24 = new class204(class1.field5, class44.field543, class204.field2948, 20, !class218.field3118);
                    class184.method1282(var24);
                    if (class297.field4401 == 1) {
                        class184.method1281(0.9F);
                    }
                    if (class297.field4401 == 2) {
                        class184.method1281(0.8F);
                    }
                    if (class297.field4401 == 3) {
                        class184.method1281(0.7F);
                    }
                    if (class297.field4401 == 4) {
                        class184.method1281(0.6F);
                    }
                    class124.field1680 = class23.field292;
                    class107.field1450 = 100;
                    class271.field4052 = 70;
                } else {
                    class124.field1680 = class121.field1641 + class44.field543.method957(123) + "%";
                    class271.field4052 = 70;
                }
            } else if (class107.field1450 == 100) {
                if (class199.method1412(-22012, class204.field2948)) {
                    class107.field1450 = 110;
                }
            } else if (class107.field1450 == 110) {
                class28.field360 = new class279();
                class165.field2258.method612(class28.field360, 118, 10);
                class124.field1680 = class340.field5110;
                class271.field4052 = 75;
                class107.field1450 = 120;
            } else if (class107.field1450 == 120) {
                if (class332.field5002.method972("huffman", "", -32002)) {
                    class211 var23 = new class211(class332.field5002.method971("", "huffman", 93));
                    class100.method730(-9574, var23);
                    class124.field1680 = class275.field4122;
                    class107.field1450 = 130;
                    class271.field4052 = 80;
                } else {
                    class271.field4052 = 80;
                    class124.field1680 = class168.field2292 + "0%";
                }
            } else if (class107.field1450 == 130) {
                if (!class145.field2004.method959(false)) {
                    class124.field1680 = class237.field3363 + class145.field2004.method957(107) * 3 / 4 + "%";
                    class271.field4052 = 85;
                } else if (!class20.field260.method959(false)) {
                    class124.field1680 = class237.field3363 + (class20.field260.method957(122) / 10 + 75) + "%";
                    class271.field4052 = 85;
                } else if (!class256.field3708.method959(false)) {
                    class124.field1680 = class237.field3363 + (class256.field3708.method957(101) / 20 + 85) + "%";
                    class271.field4052 = 85;
                } else if (class307.field4595.method951("details", 2)) {
                    class301.method2046(class77.field1089, -33, class307.field4595);
                    class49.method309(class249.field3579);
                    class124.field1680 = class217.field3106;
                    class107.field1450 = 135;
                    class271.field4052 = 95;
                } else {
                    class124.field1680 = class237.field3363 + (class307.field4595.method968((byte) 126, "details") / 10 + 90) + "%";
                    class271.field4052 = 85;
                }
            } else if (class107.field1450 == 135) {
                int var22 = class143.method1034(-101);
                if (var22 == -1) {
                    class124.field1680 = class122.field1654;
                    class271.field4052 = 95;
                } else if (var22 == 7 || var22 == 9) {
                    this.method265("worldlistfull", -114);
                    class189.method1325(1, 1000);
                } else if (class101.field1395) {
                    class271.field4052 = 96;
                    class124.field1680 = class28.field353;
                    class107.field1450 = 140;
                } else {
                    this.method265("worldlistio_" + var22, -80);
                    class189.method1325(1, 1000);
                }
            } else if (class107.field1450 == 140) {
                class251.field3599 = class145.field2004.method964(76, "loginscreen");
                class92.field1281.method967(false, 0, true);
                class173.field2349.method967(true, 0, true);
                class204.field2948.method967(true, 0, true);
                class256.field3708.method967(true, 0, true);
                class332.field5002.method967(true, 0, true);
                class145.field2004.method967(true, 0, true);
                class124.field1680 = class323.field4899;
                class10.field91 = true;
                class107.field1450 = 150;
                class271.field4052 = 97;
            } else if (class107.field1450 == 150) {
                class69.method506();
                if (class334.field5045) {
                    class162.field2230 = 0;
                    class135.field1866 = 0;
                    class96.field1297 = 0;
                    class239.field3394 = 0;
                }
                class334.field5045 = true;
                class275.method1894((byte) 104, class165.field2258);
                class85.method663(class162.field2230, -1, false, (byte) 44, -1);
                class271.field4052 = 100;
                class107.field1450 = 160;
                class124.field1680 = class235.field3326;
            } else if (class107.field1450 == 160) {
                class257.method1764(true, -14413);
            }
        } else if (class315.field4751.method959(!arg0)) {
            this.method813(class315.field4751.method948((byte) 4, 1), 118);
            class271.field4052 = 25;
            class107.field1450 = 45;
            class124.field1680 = class280.field4209;
        } else {
            class124.field1680 = class10.field87 + class315.field4751.method957(103) + "%";
            class271.field4052 = 25;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1765)
    private final void method820(byte arg0) {
        field1509++;
        boolean var2 = class78.field1133.method75((byte) 120);
        if (arg0 == 63 && !var2) {
            this.method817(-124);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1786)
    public final void method264(int arg0) {
        field1522++;
        if (class148.field2051 == 1000) {
            return;
        }
        class329.field4966++;
        if (class329.field4966 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class266.field3884 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class153.field2125.setSeed((long) class266.field3884);
        }
        this.method820((byte) 63);
        if (class280.field4211 != null) {
            class280.field4211.method1666((byte) 0);
        }
        if (arg0 != -136) {
            return;
        }
        class43.method267(arg0 ^ 0xFFFFFF6D);
        class15.method98(arg0 + 29);
        class43.method277((byte) 35);
        class44.method283(arg0 + 61);
        if (class67.field908) {
            class180.method1248();
        }
        if (class196.field2731 != null) {
            int var3 = class196.field2731.method1701(0);
            class255.field3656 = var3;
        }
        if (class148.field2051 == 0) {
            this.method819(true);
            class276.method1896((byte) 62);
        } else if (class148.field2051 == 5) {
            this.method819(true);
            class276.method1896((byte) 125);
        } else if (class148.field2051 == 25 || class148.field2051 == 28) {
            class231.method1602((byte) 121);
        }
        if (class148.field2051 == 10) {
            this.method816(100);
            class173.method1208((byte) 102);
            class83.method646((byte) -94);
            class107.method788(arg0 + 131);
        } else if (class148.field2051 == 30) {
            class130.method932(-5666);
        } else if (class148.field2051 == 40) {
            class107.method788(-5);
            if (class68.field939 != -3) {
                if (class68.field939 == 15) {
                    class274.method1882(0);
                } else if (class68.field939 != 2) {
                    class37.method209(-122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lin;)Lfl;", line = 1881)
    public static final class300 method821(class344 arg0) {
        class300 var1 = (class300) class13.field150.method111(108, ((long) arg0.field5206 << 32) + (long) arg0.field5275);
        return var1 == null ? arg0.field5261 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V", line = 1886)
    public static final void method822(int arg0, int arg1, int arg2) {
        field1519++;
        if (arg0 >= -102) {
            method818((class344) null);
        }
        for (int var3 = 0; var3 < class326.field4930; var3++) {
            class273 var4 = class189.method1328(var3, 4);
            if (var4 != null) {
                int var5 = var4.field4097;
                if (var5 >= 0 && !class184.field2543.method678(-4402, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field4089 >= 0) {
                    int var10 = var4.field4089;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class184.field2527[class107.method790(79, var12, 96)];
                } else if (var5 >= 0) {
                    var6 = class184.field2527[class107.method790(120, class184.field2543.method669(var5, 64), 96)];
                } else if (var4.field4095 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field4095;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (var7 + arg2 & 0xFC00) + var8 + (var7 & 0x380);
                    var6 = class184.field2527[class107.method790(59, var9, 96)];
                }
                class301.field4447[var3 + 1] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1963)
    public final void init() {
        field1517++;
        if (!this.method271((byte) -110)) {
            return;
        }
        class85.field1236 = Integer.parseInt(this.getParameter("worldid"));
        class6.field46 = Integer.parseInt(this.getParameter("modewhere"));
        if (class6.field46 < 0 || class6.field46 > 1) {
            class6.field46 = 0;
        }
        class44.field530 = Integer.parseInt(this.getParameter("modewhat"));
        if (class44.field530 < 0 || class44.field530 > 2) {
            class44.field530 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class39.field446 = true;
        } else {
            class39.field446 = false;
        }
        try {
            class202.field2874 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class202.field2874 = 0;
        }
        class79.method609(3, class202.field2874);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class153.field2116 = true;
        } else {
            class153.field2116 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class333.field5034 = true;
        } else {
            class333.field5034 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class39.field448 = 1;
        } else {
            class39.field448 = 0;
        }
        try {
            class169.field2297 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class169.field2297 = 0;
        }
        class165.field2262 = this.getParameter("settings");
        if (class165.field2262 == null) {
            class165.field2262 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class316.field4766 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class316.field4766 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class148.field2054 = true;
        } else {
            class148.field2054 = false;
        }
        class329.field4968 = this;
        this.method270(5183, 1541, 503, class44.field530 + 32, 765);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I", line = 2047)
    public static int method823(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lin;IIIIIII)V", line = 2055)
    public static final void method824(class344[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class344 var9 = arg0[var8];
            if (var9 != null && var9.field5246 == arg1 && (!var9.field5267 || var9.field5316 == 0 || var9.field5269 || method821(var9).field4426 != 0 || class21.field281 == var9 || var9.field5317 == 1338) && (!var9.field5267 || !method815(var9))) {
                int var10 = var9.field5183 + arg6;
                int var11 = var9.field5315 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field5316 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field5334 + var10;
                    int var17 = var9.field5293 + var11;
                    if (var9.field5316 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class134.field1852 == var9) {
                    class259.field3816 = true;
                    class23.field296 = var10;
                    class262.field3842 = var11;
                }
                if (!var9.field5267 || var12 < var14 && var13 < var15) {
                    if (var9.field5316 == 0) {
                        if (!var9.field5267 && method815(var9) && class339.field5095 != var9) {
                            continue;
                        }
                        if (var9.field5229 && class206.field2962 >= var12 && class282.field4220 >= var13 && class206.field2962 < var14 && class282.field4220 < var15) {
                            for (class171 var18 = (class171) class218.field3123.method1335(1); var18 != null; var18 = (class171) class218.field3123.method1336(3)) {
                                if (var18.field2335) {
                                    var18.method1274((byte) -26);
                                    var18.field2341.field5324 = false;
                                }
                            }
                            if (class42.field483 == 0) {
                                class134.field1852 = null;
                                class21.field281 = null;
                            }
                            class343.field5158 = 0;
                        }
                    }
                    if (var9.field5267) {
                        boolean var19;
                        if (class206.field2962 >= var12 && class282.field4220 >= var13 && class206.field2962 < var14 && class282.field4220 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class337.field5067 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class123.field1666 == 1 && class217.field3104 >= var12 && class155.field2142 >= var13 && class217.field3104 < var14 && class155.field2142 < var15) {
                            var21 = true;
                        }
                        if (var9.field5308 != null) {
                            for (int var22 = 0; var22 < var9.field5308.length; var22++) {
                                if (class149.field2067[var9.field5308[var22]]) {
                                    if (var9.field5313 == null || class329.field4966 >= var9.field5313[var22]) {
                                        byte var23 = var9.field5186[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class149.field2067[86] && !class149.field2067[82] && !class149.field2067[81]) && ((var23 & 0x2) == 0 || class149.field2067[86]) && ((var23 & 0x1) == 0 || class149.field2067[82]) && ((var23 & 0x4) == 0 || class149.field2067[81])) {
                                            class31.method179(-1, var9.field5206, 2, "", var22 + 1);
                                            int var24 = var9.field5226[var22];
                                            if (var9.field5313 == null) {
                                                var9.field5313 = new int[var9.field5308.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field5313[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field5313[var22] = class329.field4966 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field5313 != null) {
                                    var9.field5313[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class332.method2313((byte) 49, var9, class155.field2142 - var11, class217.field3104 - var10);
                        }
                        if (class134.field1852 != null && class134.field1852 != var9 && var19 && method821(var9).method2041(116)) {
                            class82.field1193 = var9;
                        }
                        if (class21.field281 == var9) {
                            class262.field3855 = true;
                            class130.field1788 = var10;
                            class31.field377 = var11;
                        }
                        if (var9.field5269 || var9.field5317 != 0) {
                            if (var19 && class255.field3656 != 0 && var9.field5245 != null) {
                                class171 var25 = new class171();
                                var25.field2335 = true;
                                var25.field2341 = var9;
                                var25.field2342 = class255.field3656;
                                var25.field2333 = var9.field5245;
                                class218.field3123.method1339((byte) -118, var25);
                            }
                            if (class134.field1852 != null || class291.field4348 != null || class100.field1380 || var9.field5317 != 1400 && class343.field5158 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field5317 != 0) {
                                if (var9.field5317 == 1337) {
                                    class198.field2782 = var9;
                                    continue;
                                }
                                if (var9.field5317 == 1338) {
                                    if (var21) {
                                        class90.field1268 = class217.field3104 - var10;
                                        class146.field2009 = class155.field2142 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field5317 == 1400) {
                                    class266.field3865 = var9;
                                    if (var21) {
                                        if (class149.field2067[82] && class323.field4898 > 0) {
                                            int var26 = (int) ((double) (class217.field3104 - var10 - var9.field5334 / 2) * 2.0D / (double) class273.field4084);
                                            int var27 = (int) ((double) (class155.field2142 - var11 - var9.field5293 / 2) * 2.0D / (double) class273.field4084);
                                            int var28 = class312.field4712 + var26;
                                            int var29 = class170.field2315 + var27;
                                            int var30 = class174.field2374 + var28;
                                            int var31 = class56.field765 + class42.field481 - var29 - 1;
                                            class297 var32 = class103.method756(255);
                                            int[] var33 = var32.method2026(var30, -51, var31);
                                            if (var33 != null) {
                                                class127.method917((byte) 102, var33[1], var33[2], var33[0]);
                                                class310.method2130(-27883);
                                            }
                                            continue;
                                        }
                                        class343.field5158 = 1;
                                        class112.field1527 = class206.field2962;
                                        class172.field2346 = class282.field4220;
                                        continue;
                                    }
                                    if (var20 && class343.field5158 > 0) {
                                        if (class343.field5158 == 1 && (class206.field2962 != class112.field1527 || class282.field4220 != class172.field2346)) {
                                            class16.field219 = class312.field4712;
                                            class119.field1609 = class170.field2315;
                                            class343.field5158 = 2;
                                        }
                                        if (class343.field5158 == 2) {
                                            class44.method281(-89, (int) ((double) (class112.field1527 - class206.field2962) * 2.0D / (double) class343.field5137) + class16.field219);
                                            class41.method252((int) ((double) (class172.field2346 - class282.field4220) * 2.0D / (double) class343.field5137) + class119.field1609, 2);
                                        }
                                        continue;
                                    }
                                    class343.field5158 = 0;
                                    continue;
                                }
                                if (var9.field5317 == 1401) {
                                    if (var20) {
                                        class136.method991((byte) 22, class282.field4220 - var11, var9.field5334, class206.field2962 - var10, var9.field5293);
                                    }
                                    continue;
                                }
                                if (var9.field5317 == 1402) {
                                    if (!class67.field908) {
                                        class255.method1741(var9, false);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field5249 && var21) {
                                var9.field5249 = true;
                                if (var9.field5282 != null) {
                                    class171 var34 = new class171();
                                    var34.field2335 = true;
                                    var34.field2341 = var9;
                                    var34.field2344 = class217.field3104 - var10;
                                    var34.field2342 = class155.field2142 - var11;
                                    var34.field2333 = var9.field5282;
                                    class218.field3123.method1339((byte) -117, var34);
                                }
                            }
                            if (var9.field5249 && var20 && var9.field5318 != null) {
                                class171 var35 = new class171();
                                var35.field2335 = true;
                                var35.field2341 = var9;
                                var35.field2344 = class206.field2962 - var10;
                                var35.field2342 = class282.field4220 - var11;
                                var35.field2333 = var9.field5318;
                                class218.field3123.method1339((byte) -114, var35);
                            }
                            if (var9.field5249 && !var20) {
                                var9.field5249 = false;
                                if (var9.field5344 != null) {
                                    class171 var36 = new class171();
                                    var36.field2335 = true;
                                    var36.field2341 = var9;
                                    var36.field2344 = class206.field2962 - var10;
                                    var36.field2342 = class282.field4220 - var11;
                                    var36.field2333 = var9.field5344;
                                    class269.field3982.method1339((byte) -107, var36);
                                }
                            }
                            if (var20 && var9.field5196 != null) {
                                class171 var37 = new class171();
                                var37.field2335 = true;
                                var37.field2341 = var9;
                                var37.field2344 = class206.field2962 - var10;
                                var37.field2342 = class282.field4220 - var11;
                                var37.field2333 = var9.field5196;
                                class218.field3123.method1339((byte) 36, var37);
                            }
                            if (!var9.field5324 && var19) {
                                var9.field5324 = true;
                                if (var9.field5294 != null) {
                                    class171 var38 = new class171();
                                    var38.field2335 = true;
                                    var38.field2341 = var9;
                                    var38.field2344 = class206.field2962 - var10;
                                    var38.field2342 = class282.field4220 - var11;
                                    var38.field2333 = var9.field5294;
                                    class218.field3123.method1339((byte) 94, var38);
                                }
                            }
                            if (var9.field5324 && var19 && var9.field5345 != null) {
                                class171 var39 = new class171();
                                var39.field2335 = true;
                                var39.field2341 = var9;
                                var39.field2344 = class206.field2962 - var10;
                                var39.field2342 = class282.field4220 - var11;
                                var39.field2333 = var9.field5345;
                                class218.field3123.method1339((byte) -118, var39);
                            }
                            if (var9.field5324 && !var19) {
                                var9.field5324 = false;
                                if (var9.field5184 != null) {
                                    class171 var40 = new class171();
                                    var40.field2335 = true;
                                    var40.field2341 = var9;
                                    var40.field2344 = class206.field2962 - var10;
                                    var40.field2342 = class282.field4220 - var11;
                                    var40.field2333 = var9.field5184;
                                    class269.field3982.method1339((byte) -127, var40);
                                }
                            }
                            if (var9.field5217 != null) {
                                class171 var41 = new class171();
                                var41.field2341 = var9;
                                var41.field2333 = var9.field5217;
                                class266.field3871.method1339((byte) 90, var41);
                            }
                            if (var9.field5232 != null && class164.field2254 > var9.field5209) {
                                if (var9.field5222 == null || class164.field2254 - var9.field5209 > 32) {
                                    class171 var46 = new class171();
                                    var46.field2341 = var9;
                                    var46.field2333 = var9.field5232;
                                    class218.field3123.method1339((byte) -125, var46);
                                } else {
                                    label575: for (int var42 = var9.field5209; var42 < class164.field2254; var42++) {
                                        int var43 = class77.field1043[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field5222.length; var44++) {
                                            if (var9.field5222[var44] == var43) {
                                                class171 var45 = new class171();
                                                var45.field2341 = var9;
                                                var45.field2333 = var9.field5232;
                                                class218.field3123.method1339((byte) -107, var45);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field5209 = class164.field2254;
                            }
                            if (var9.field5331 != null && class219.field3137 > var9.field5266) {
                                if (var9.field5255 == null || class219.field3137 - var9.field5266 > 32) {
                                    class171 var51 = new class171();
                                    var51.field2341 = var9;
                                    var51.field2333 = var9.field5331;
                                    class218.field3123.method1339((byte) -113, var51);
                                } else {
                                    label551: for (int var47 = var9.field5266; var47 < class219.field3137; var47++) {
                                        int var48 = class306.field4587[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field5255.length; var49++) {
                                            if (var9.field5255[var49] == var48) {
                                                class171 var50 = new class171();
                                                var50.field2341 = var9;
                                                var50.field2333 = var9.field5331;
                                                class218.field3123.method1339((byte) -118, var50);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field5266 = class219.field3137;
                            }
                            if (var9.field5213 != null && class287.field4274 > var9.field5309) {
                                if (var9.field5258 == null || class287.field4274 - var9.field5309 > 32) {
                                    class171 var56 = new class171();
                                    var56.field2341 = var9;
                                    var56.field2333 = var9.field5213;
                                    class218.field3123.method1339((byte) 119, var56);
                                } else {
                                    label527: for (int var52 = var9.field5309; var52 < class287.field4274; var52++) {
                                        int var53 = class223.field3222[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field5258.length; var54++) {
                                            if (var9.field5258[var54] == var53) {
                                                class171 var55 = new class171();
                                                var55.field2341 = var9;
                                                var55.field2333 = var9.field5213;
                                                class218.field3123.method1339((byte) 65, var55);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field5309 = class287.field4274;
                            }
                            if (var9.field5193 != null && class103.field1406 > var9.field5243) {
                                if (var9.field5300 == null || class103.field1406 - var9.field5243 > 32) {
                                    class171 var61 = new class171();
                                    var61.field2341 = var9;
                                    var61.field2333 = var9.field5193;
                                    class218.field3123.method1339((byte) 19, var61);
                                } else {
                                    label503: for (int var57 = var9.field5243; var57 < class103.field1406; var57++) {
                                        int var58 = class218.field3130[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field5300.length; var59++) {
                                            if (var9.field5300[var59] == var58) {
                                                class171 var60 = new class171();
                                                var60.field2341 = var9;
                                                var60.field2333 = var9.field5193;
                                                class218.field3123.method1339((byte) -119, var60);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field5243 = class103.field1406;
                            }
                            if (var9.field5185 != null && class106.field1431 > var9.field5264) {
                                if (var9.field5175 == null || class106.field1431 - var9.field5264 > 32) {
                                    class171 var66 = new class171();
                                    var66.field2341 = var9;
                                    var66.field2333 = var9.field5185;
                                    class218.field3123.method1339((byte) 69, var66);
                                } else {
                                    label479: for (int var62 = var9.field5264; var62 < class106.field1431; var62++) {
                                        int var63 = class269.field3988[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field5175.length; var64++) {
                                            if (var9.field5175[var64] == var63) {
                                                class171 var65 = new class171();
                                                var65.field2341 = var9;
                                                var65.field2333 = var9.field5185;
                                                class218.field3123.method1339((byte) 33, var65);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field5264 = class106.field1431;
                            }
                            if (class231.field3274 > var9.field5353 && var9.field5187 != null) {
                                class171 var67 = new class171();
                                var67.field2341 = var9;
                                var67.field2333 = var9.field5187;
                                class218.field3123.method1339((byte) 91, var67);
                            }
                            if (class201.field2856 > var9.field5353 && var9.field5346 != null) {
                                class171 var68 = new class171();
                                var68.field2341 = var9;
                                var68.field2333 = var9.field5346;
                                class218.field3123.method1339((byte) 57, var68);
                            }
                            if (class79.field1144 > var9.field5353 && var9.field5179 != null) {
                                class171 var69 = new class171();
                                var69.field2341 = var9;
                                var69.field2333 = var9.field5179;
                                class218.field3123.method1339((byte) 91, var69);
                            }
                            if (class100.field1379 > var9.field5353 && var9.field5320 != null) {
                                class171 var70 = new class171();
                                var70.field2341 = var9;
                                var70.field2333 = var9.field5320;
                                class218.field3123.method1339((byte) -115, var70);
                            }
                            if (class239.field3389 > var9.field5353 && var9.field5219 != null) {
                                class171 var71 = new class171();
                                var71.field2341 = var9;
                                var71.field2333 = var9.field5219;
                                class218.field3123.method1339((byte) -119, var71);
                            }
                            var9.field5353 = class185.field2549;
                            if (var9.field5289 != null) {
                                for (int var72 = 0; var72 < class132.field1805; var72++) {
                                    class171 var73 = new class171();
                                    var73.field2341 = var9;
                                    var73.field2334 = class213.field3071[var72];
                                    var73.field2332 = class23.field291[var72];
                                    var73.field2333 = var9.field5289;
                                    class218.field3123.method1339((byte) -107, var73);
                                }
                            }
                            if (class22.field287 && var9.field5296 != null) {
                                class171 var74 = new class171();
                                var74.field2341 = var9;
                                var74.field2333 = var9.field5296;
                                class218.field3123.method1339((byte) 69, var74);
                            }
                        }
                    }
                    if (!var9.field5267 && class134.field1852 == null && class291.field4348 == null && !class100.field1380) {
                        if ((var9.field5285 >= 0 || var9.field5286 != 0) && class206.field2962 >= var12 && class282.field4220 >= var13 && class206.field2962 < var14 && class282.field4220 < var15) {
                            if (var9.field5285 >= 0) {
                                class339.field5095 = arg0[var9.field5285];
                            } else {
                                class339.field5095 = var9;
                            }
                        }
                        if (var9.field5316 == 8 && class206.field2962 >= var12 && class282.field4220 >= var13 && class206.field2962 < var14 && class282.field4220 < var15) {
                            class186.field2572 = var9;
                        }
                        if (var9.field5200 > var9.field5293) {
                            class189.method1322(16, var9.field5334 + var10, var9, var9.field5293, class206.field2962, var11, class282.field4220, var9.field5200);
                        }
                    }
                    if (var9.field5316 == 0) {
                        method824(arg0, var9.field5206, var12, var13, var14, var15, var10 - var9.field5203, var11 - var9.field5195);
                        if (var9.field5248 != null) {
                            method824(var9.field5248, var9.field5206, var12, var13, var14, var15, var10 - var9.field5203, var11 - var9.field5195);
                        }
                        class48 var75 = (class48) class211.field3056.method111(104, (long) var9.field5206);
                        if (var75 != null) {
                            class123.method891(var15, -21, var13, var75.field595, var11, var12, var14, var10);
                        }
                    }
                }
            }
        }
    }
}
