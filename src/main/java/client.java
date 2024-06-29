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
public class client extends class325 {

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lna;")
    private static class26 field4119 = class69.method505("cyan:", (byte) -124);

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lna;")
    public static class26 field4112 = field4119;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lna;")
    public static class26 field4117 = field4119;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lsc;")
    public static class259 field4109 = new class259(16);

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field4127;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
    public static int[] field4126;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[[Lhg;")
    public static class172[][] field4125;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 4)
    public final void method1724(int arg0) {
        field4115++;
        if (class207.field3217 == 1000) {
            return;
        }
        boolean var2 = class324.method2252(false);
        if (var2 && class243.field4003 && class166.field2580 != null) {
            class166.field2580.method392((byte) -78);
        }
        if ((class207.field3217 == 30 || class207.field3217 == 10) && (class132.field2016 || class291.field4847 != 0L && class291.field4847 < class128.method869((byte) -55))) {
            class86.method670(class132.field2016, class243.method1677(0), -8914, class283.field4721, class310.field5331);
        }
        if (class198.field3075 == null) {
            Container var3;
            if (class198.field3075 != null) {
                var3 = class198.field3075;
            } else if (class142.field2172 == null) {
                var3 = class45.field712.field2431;
            } else {
                var3 = class142.field2172;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class142.field2172 == var3) {
                Insets var6 = class142.field2172.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class224.field3562 != var4 || class267.field4407 != var5) {
                if (class156.field2436.startsWith("mac")) {
                    class224.field3562 = var4;
                    class267.field4407 = var5;
                } else {
                    class298.method2105(true);
                }
                class291.field4847 = class128.method869((byte) -55) + 500L;
            }
        }
        if (class198.field3075 != null && !class98.field1598 && (class207.field3217 == 30 || class207.field3217 == 10)) {
            class86.method670(false, class96.field1574, -8914, -1, -1);
        }
        if (arg0 != 40) {
            method1730((class297) null);
        }
        boolean var7 = false;
        if (class198.field3066) {
            var7 = true;
            class198.field3066 = false;
        }
        if (var7) {
            class295.method2076(arg0 ^ 0xFFFFFFD7);
        }
        if (class255.field4184) {
            for (int var8 = 0; var8 < 100; var8++) {
                class2.field21[var8] = true;
            }
        }
        if (class207.field3217 == 0) {
            class118.method821((Color) null, false, var7, class235.field3731, class4.field37);
        } else if (class207.field3217 == 5) {
            class323.method2244((byte) 117, false, class89.field1474);
        } else if (class207.field3217 == 10) {
            class235.method1579(true);
        } else if (class207.field3217 == 25 || class207.field3217 == 28) {
            if (class252.field4141 == 1) {
                if (class56.field903 < class185.field2879) {
                    class56.field903 = class185.field2879;
                }
                int var10 = (class56.field903 - class185.field2879) * 50 / class56.field903;
                class283.method1996((byte) -71, false, class236.method1587(new class26[] { class115.field1810, class315.field5401, class149.method1019((byte) 9, var10), class306.field5273 }, (byte) -62));
            } else if (class252.field4141 == 2) {
                if (class265.field4350 < class104.field1665) {
                    class265.field4350 = class104.field1665;
                }
                int var9 = (class265.field4350 - class104.field1665) * 50 / class265.field4350 + 50;
                class283.method1996((byte) -41, false, class236.method1587(new class26[] { class115.field1810, class315.field5401, class149.method1019((byte) 9, var9), class306.field5273 }, (byte) -68));
            } else {
                class283.method1996((byte) -73, false, class115.field1810);
            }
        } else if (class207.field3217 == 30) {
            class302.method2126(arg0 - 40);
        } else if (class207.field3217 == 40) {
            class283.method1996((byte) -95, false, class236.method1587(new class26[] { class157.field2448, class82.field1323, class307.field5285 }, (byte) -67));
        }
        if (class255.field4184 && class207.field3217 != 0) {
            class255.method1766();
            for (int var17 = 0; var17 < class66.field1041; var17++) {
                class139.field2123[var17] = false;
            }
        } else if ((class207.field3217 == 30 || class207.field3217 == 10) && class4.field42 == 0 && !var7) {
            try {
                Graphics var11 = class250.field4085.getGraphics();
                for (int var12 = 0; var12 < class66.field1041; var12++) {
                    if (class139.field2123[var12]) {
                        class134.field2040.method1026(class27.field457[var12], class53.field827[var12], 6260, class241.field3931[var12], var11, class159.field2475[var12]);
                        class139.field2123[var12] = false;
                    }
                }
            } catch (Exception var19) {
                class250.field4085.repaint();
            }
        } else if (class207.field3217 != 0) {
            try {
                Graphics var14 = class250.field4085.getGraphics();
                class134.field2040.method1030(0, 0, var14, 0);
                for (int var15 = 0; var15 < class66.field1041; var15++) {
                    class139.field2123[var15] = false;
                }
            } catch (Exception var18) {
                class250.field4085.repaint();
            }
        }
        if (class258.field4206) {
            class276.method1950(26211);
        }
        if (class26.field380 && class207.field3217 == 10 && class250.field4095 != -1) {
            class26.field380 = false;
            class298.method2106(class45.field712, (byte) 14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbe;)Lbe;", line = 256)
    public static final class297 method1725(class297 arg0) {
        int var1 = method1730(arg0).method2285((byte) -74);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class178.method1226((byte) 127, arg0.field4993);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 276)
    public static void method1726(boolean arg0) {
        if (!arg0) {
            field4125 = (class172[][]) ((class172[][]) null);
        }
        field4126 = null;
        field4112 = null;
        field4119 = null;
        field4109 = null;
        field4117 = null;
        field4125 = (class172[][]) null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 302)
    public final void method1727(byte arg0) {
        field4118++;
        if (class255.field4184) {
            class255.method1782();
        }
        if (class198.field3075 != null) {
            class304.method2135(class198.field3075, true, class45.field712);
            class198.field3075 = null;
        }
        if (class45.field712 != null) {
            class45.field712.method1059(this.getClass(), 0);
        }
        if (class25.field363 != null) {
            class25.field363.field2134 = false;
        }
        class25.field363 = null;
        if (class88.field1449 != null) {
            class88.field1449.method2018(14821);
            class88.field1449 = null;
        }
        class139.method930(class250.field4085, -9320);
        class259.method1830(4, class250.field4085);
        if (class45.field717 != null) {
            class45.field717.method1293(false, class250.field4085);
        }
        class114.method792(0);
        class305.method2141(8);
        class45.field717 = null;
        if (class166.field2580 != null) {
            class166.field2580.method397(false);
        }
        if (class23.field329 != null) {
            class23.field329.method397(false);
        }
        class258.field4212.method232(false);
        class292.field4855.method1571(3208);
        try {
            if (class225.field3569 != null) {
                class225.field3569.method332(false);
            }
            if (arg0 <= 20) {
                return;
            }
            if (class211.field3275 != null) {
                for (int var2 = 0; var2 < class211.field3275.length; var2++) {
                    if (class211.field3275[var2] != null) {
                        class211.field3275[var2].method332(false);
                    }
                }
            }
            if (class85.field1392 != null) {
                class85.field1392.method332(false);
            }
            if (class299.field5144 != null) {
                class299.field5144.method332(false);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 388)
    public final void init() {
        field4114++;
        if (!this.method2256(27496)) {
            return;
        }
        class78.field1209 = Integer.parseInt(this.getParameter("worldid"));
        class229.field3624 = Integer.parseInt(this.getParameter("modewhere"));
        if (class229.field3624 < 0 || class229.field3624 > 1) {
            class229.field3624 = 0;
        }
        class72.field1106 = Integer.parseInt(this.getParameter("modewhat"));
        if (class72.field1106 < 0 || class72.field1106 > 2) {
            class72.field1106 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class280.field4670 = true;
        } else {
            class280.field4670 = false;
        }
        try {
            class210.field3264 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class210.field3264 = 0;
        }
        class147.method1007(-31, class210.field3264);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class252.field4140 = true;
        } else {
            class252.field4140 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class277.field4634 = true;
        } else {
            class277.field4634 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class170.field2670 = 1;
        } else {
            class170.field2670 = 0;
        }
        try {
            class301.field5184 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class301.field5184 = 0;
        }
        class211.field3273 = class37.field604.method204((byte) 126, this);
        if (class211.field3273 == null) {
            class211.field3273 = class2.field18;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class174.field2726 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class174.field2726 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class25.field371 = true;
        } else {
            class25.field371 = false;
        }
        class136.field2085 = this;
        this.method2264((byte) -56, 765, class72.field1106 + 32, 1530, 503);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 489)
    public final void method1728(int arg0) {
        field4113++;
        class298.method2105(true);
        class292.field4855 = new class233();
        class258.field4212 = new class28();
        if (class72.field1106 != 0) {
            class202.field3141 = new byte[50][];
        }
        class8.method50(class45.field712, 0);
        if (class229.field3624 == 0) {
            class122.field1910 = this.getCodeBase().getHost();
            class291.field4848 = 443;
            class280.field4662 = 43594;
        } else if (class229.field3624 == 1) {
            class122.field1910 = this.getCodeBase().getHost();
            class291.field4848 = class78.field1209 + 50000;
            class280.field4662 = class78.field1209 + 40000;
        } else if (class229.field3624 == 2) {
            class122.field1910 = "127.0.0.1";
            class291.field4848 = class78.field1209 + 50000;
            class280.field4662 = class78.field1209 + 40000;
        }
        if (class170.field2670 == 1) {
            class225.field3564 = true;
            class289.field4822 = 16777215;
            class289.field4816 = 0;
            class316.field5408 = class97.field1580;
            class225.field3576 = class199.field3095;
            class186.field2889 = class9.field109;
            class228.field3621 = class55.field874;
        } else {
            class316.field5408 = class250.field4094;
            class228.field3621 = class112.field1765;
            class225.field3576 = class318.field5440;
            class186.field2889 = class134.field2045;
        }
        class279.field4656 = class291.field4848;
        class104.field1661 = class280.field4662;
        class11.field149 = class122.field1910;
        class269.field4443 = class280.field4662;
        class190.field2987 = class245.field4021 = class157.field2456 = class190.field2985 = new short[256];
        if (arg0 != 2) {
            method1737((class297) null);
        }
        class319.field5446 = class269.field4443;
        if (class156.field2427 == 3 && class229.field3624 != 2) {
            class263.field4309 = class78.field1209;
        }
        class47.method358(74);
        class84.method658((byte) 115, class250.field4085);
        class217.method1469(class250.field4085, false);
        class45.field717 = class168.method1139((byte) 15);
        if (class45.field717 != null) {
            class45.field717.method1295(class250.field4085, -97);
        }
        class205.field3211 = class156.field2427;
        try {
            if (class45.field712.field2429 != null) {
                class225.field3569 = new class41(class45.field712.field2429, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class211.field3275[var2] = new class41(class45.field712.field2425[var2], 6000, 0);
                }
                class85.field1392 = new class41(class45.field712.field2430, 6000, 0);
                class218.field3483 = new class153(255, class225.field3569, class85.field1392, 500000);
                class299.field5144 = new class41(class45.field712.field2426, 24, 0);
                class45.field712.field2425 = null;
                class45.field712.field2430 = null;
                class45.field712.field2426 = null;
                class45.field712.field2429 = null;
            }
        } catch (IOException var4) {
            class299.field5144 = null;
            class225.field3569 = null;
            class85.field1392 = null;
            class218.field3483 = null;
        }
        class216.field3385 = class39.field640;
        if (class229.field3624 != 0) {
            class318.field5443 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 608)
    public final void method1729(int arg0) {
        field4110++;
        method1726(true);
        class26.method172(-8635);
        class45.method342(21474);
        class66.method494((byte) -46);
        class12.method79(0);
        class325.method2253(113);
        class255.method1778();
        class271.method1924(24241);
        class170.method1171(false);
        class140.method932(25951);
        class145.method962((byte) 106);
        class82.method606(0);
        class285.method2013(0);
        class28.method220((byte) -88);
        class233.method1573(-16222);
        class321.method2229(-114);
        class203.method1369(false);
        class266.method1875(100);
        class41.method326(true);
        class153.method1039(true);
        class282.method1984(3101);
        class324.method2247(-3);
        class214.method1423(1);
        class228.method1526((byte) -124);
        class297.method2094(126);
        class25.method157((byte) 121);
        class159.method1085((byte) 121);
        class32.method259(0);
        class148.method1010((byte) 108);
        class259.method1821(103);
        class189.method1292(0);
        class131.method888(103);
        class37.method308(25);
        class146.method984((byte) 85);
        class53.method399(0);
        class107.method761((byte) -110);
        class209.method1406(8160);
        class249.method1711((byte) -108);
        class241.method1663((byte) -116);
        class55.method401(3353893);
        class78.method554(-11);
        class69.method506(2);
        class187.method1275((byte) 103);
        class174.method1193(26971);
        class327.method2282((byte) 120);
        class147.method1003((byte) 30);
        class246.method1691((byte) 106);
        class83.method648(119);
        class313.method2172(3);
        class132.method891(-29679);
        class21.method134((byte) 59);
        class191.method1297(-1);
        class108.method767((byte) 104);
        class42.method338((byte) 35);
        class298.method2104(-14256);
        class68.method503(-79);
        class192.method1301(-24912);
        class244.method1684((byte) -55);
        class122.method842(false);
        class318.method2208(5157);
        class216.method1444((byte) 126);
        class304.method2134((byte) 38);
        class103.method744((byte) 108);
        class67.method499(-126);
        class124.method852((byte) 24);
        class289.method2032();
        class308.method2153(true);
        class169.method1141();
        class157.method1071((byte) -45);
        class239.method1620();
        class217.method1461(3327);
        class270.method1922();
        class22.method141(118);
        class305.method2139(true);
        class38.method312(0);
        class243.method1680(90);
        class197.method1324();
        class316.method2193(100);
        class127.method866(0);
        class104.method748(-17413);
        class150.method1021(33);
        class175.method1206();
        class123.method846(-25247);
        class47.method355(186);
        class162.method1094();
        class293.method2056(-28918);
        class88.method691(true);
        class11.method72(false);
        class242.method1668();
        class226.method1511();
        class215.method1436((byte) -2);
        class73.method520(1);
        class212.method1415(0);
        class57.method416((byte) 120);
        class207.method1387(0);
        class34.method296();
        class163.method1115(-90);
        class302.method2129(99);
        class33.method271(0);
        class96.method719(-3);
        class5.method32((byte) 89);
        class89.method700(-2);
        class312.method2171(-17124);
        class24.method154((byte) -48);
        class284.method2000(-9893);
        class277.method1959(221301966);
        class193.method1304(true);
        class79.method566(69);
        class236.method1580(true);
        class300.method2112(6);
        class232.method1562(true);
        class167.method1133((byte) 62);
        class250.method1720(119);
        class133.method904(-1);
        class281.method1969(-2951);
        class178.method1227((byte) 126);
        class118.method816(-1667);
        class117.method812((byte) -86);
        class208.method1390((byte) -118);
        class9.method62(-27401);
        class13.method85(-11565);
        class275.method1945(20413);
        class27.method215(1);
        class200.method1359();
        class260.method1837((byte) 127);
        class273.method1937((byte) -124);
        class225.method1498((byte) 110);
        class291.method2047(false);
        class166.method1125(0);
        class279.method1963(31);
        class49.method364();
        class40.method324(false);
        class29.method238((byte) -93);
        class306.method2146(0);
        class263.method1850(false);
        class86.method668(0);
        class218.method1473((byte) 53);
        class172.method1181();
        class39.method317(128);
        class101.method741(10967);
        class267.method1901((byte) -87);
        class164.method1117((byte) 112);
        class137.method918((byte) 115);
        class149.method1017(1);
        class136.method916((byte) -58);
        class213.method1419();
        class235.method1578(-29113);
        class95.method713(30351);
        class258.method1814(-26723);
        class234.method1577();
        class269.method1907(false);
        class43.method340();
        class17.method115(-17148);
        class179.method1242();
        class152.method1035();
        class14.method106(119);
        class100.method738(-82);
        class116.method806(1000);
        class120.method834(3);
        class186.method1272(-128);
        class224.method1495(-3);
        class160.method1087(8642);
        class4.method22(-30497);
        class182.method1255();
        class154.method1047(-196);
        class138.method926((byte) 73);
        class326.method2267();
        class7.method44((byte) 81);
        class319.method2211(true);
        class272.method1932(0);
        class204.method1377(true);
        class141.method939((byte) 83);
        class265.method1864((byte) -120);
        class109.method770(2);
        class220.method1478(true);
        class295.method2074((byte) -94);
        class56.method412(-22749);
        class287.method2021(3846);
        class188.method1287(1);
        class23.method146(0);
        class71.method511((byte) -87);
        class317.method2205(13123);
        class50.method367(14635);
        class151.method1024(27316);
        class251.method1722(12881);
        class121.method838((byte) 81);
        class299.method2110((byte) 122);
        class254.method1759((byte) 67);
        class143.method954();
        class92.method708(2);
        class8.method49(3);
        class94.method711(-119);
        class97.method726(0);
        class202.method1362(2);
        class10.method64((byte) -128);
        class65.method488();
        class30.method242();
        class168.method1134(26);
        class307.method2147((byte) -69);
        class171.method1175();
        class3.method13();
        class290.method2044((byte) -113);
        class64.method485(-112);
        class296.method2080();
        class87.method686();
        class84.method652(false);
        class80.method573(true);
        class283.method1992(2);
        class58.method422(4);
        class314.method2180((byte) 102);
        class85.method659(65536);
        class35.method302(-46);
        class165.method1123(false);
        class229.method1544((byte) -115);
        class51.method372((byte) -74);
        class134.method908(128);
        class322.method2242((byte) -67);
        class294.method2070(-109);
        class223.method1489(37821);
        class177.method1222((byte) 26);
        int var2 = 87 % ((68 - arg0) / 49);
        class268.method1906(-2);
        class46.method348(1);
        class194.method1306(7759444);
        class240.method1653(true);
        class181.method1250(-125);
        class185.method1269((byte) 110);
        class1.method2(11597);
        class309.method2159((byte) -107);
        class261.method1844(false);
        class158.method1076(true);
        class144.method958(48);
        class155.method1048(-1443422260);
        class114.method793(-1771542303);
        class18.method122(-15028);
        class110.method779(-21136);
        class20.method133(0);
        class245.method1689((byte) 79);
        class303.method2132((byte) 74);
        class76.method548(false);
        class115.method799((byte) -41);
        class113.method790(-97);
        class72.method518(-3);
        class219.method1477(2);
        class74.method530(-127);
        class31.method249(true);
        class126.method864((byte) -54);
        class98.method730(1);
        class142.method943((byte) 122);
        class230.method1549(-9);
        class315.method2186(0);
        class198.method1330(1024);
        class292.method2055(9423);
        class112.method782(103);
        class320.method2221((byte) 119);
        class201.method1361((byte) 30);
        class264.method1857((byte) 85);
        class135.method911((byte) -91);
        class190.method1296(-1);
        class211.method1413((byte) -83);
        class81.method574(30358);
        class252.method1745((byte) -120);
        class59.method424((byte) 37);
        class139.method928((byte) 104);
        class205.method1385(false);
        class2.method10((byte) -122);
        class280.method1966(109);
        class63.method477(99);
        class323.method2243(true);
        class61.method473(-93);
        class262.method1847(true);
        class173.method1187(-11346);
        class210.method1410(25);
        class301.method2116((byte) 121);
        class222.method1482((byte) -115);
        class199.method1337(false);
        class276.method1952((byte) 100);
        class196.method1316((byte) 75);
        class36.method306(-71);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lbe;)Lbf;", line = 903)
    public static final class327 method1730(class297 arg0) {
        class327 var1 = (class327) class220.field3506.method1827(((long) arg0.field5088 << 32) + (long) arg0.field4994, 0);
        return var1 == null ? arg0.field5063 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ltk;", line = 910)
    public static final class249 method1731(int arg0, byte arg1) {
        if (arg1 != -20) {
            field4125 = (class172[][]) ((class172[][]) null);
        }
        field4123++;
        class249 var2 = (class249) class165.field2559.method1989((long) arg0, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class249.field4063.method1889(class271.method1923(arg0, -1732504441), (byte) -122, class140.method937(117, arg0));
        class249 var4 = new class249();
        var4.field4069 = arg0;
        if (var3 != null) {
            var4.method1707(new class82(var3), (byte) -102);
        }
        var4.method1712((byte) -41);
        class165.field2559.method1978((byte) -103, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V", line = 936)
    private final void method1732(boolean arg0, int arg1) {
        class258.field4212.field495++;
        class192.field3001 = null;
        field4116++;
        if (!arg0) {
            field4125 = (class172[][]) ((class172[][]) null);
        }
        class258.field4212.field494 = arg1;
        class61.field987 = null;
        class163.field2527 = 0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 970)
    private final void method1733(byte arg0) {
        class323.field5556 = 0;
        field4124++;
        while (class304.method2133(83) && class323.field5556 < 128) {
            class37.field616[class323.field5556] = class33.field562;
            class251.field4106[class323.field5556] = class309.field5319;
            class323.field5556++;
        }
        class25.field366++;
        if (class250.field4095 != -1) {
            class300.method2115(0, 0, 2, 0, class38.field622, class250.field4095, 0, class141.field2153);
        }
        class74.field1144++;
        if (class255.field4184) {
            int var2 = 19137023;
            label193: for (int var3 = 0; var3 < 32768; var3++) {
                class324 var4 = class185.field2877[var3];
                if (var4 != null) {
                    byte var5 = var4.field5565.field2925;
                    if ((var5 & 0x2) > 0 && var4.field3959 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field3932[0] = 1;
                            var4.field3904[0] = (var4.field3962 >> 7) + var6;
                            var4.field3890[0] = (var4.field3972 >> 7) + var7;
                            class218.field3479[class279.field4651].method1537(arg0 + 20850, var4.field3962 >> 7, var4.method1078((byte) 114), false, 0, var4.method1078((byte) 114), var4.field3972 >> 7);
                            if (var4.field3904[0] >= 0 && var4.field3904[0] <= 104 - var4.method1078((byte) 114) && var4.field3890[0] >= 0 && var4.field3890[0] <= 104 - var4.method1078((byte) 114) && class218.field3479[class279.field4651].method1535(-2, var4.field3972 >> 7, var4.field3890[0], var4.field3904[0], var4.field3962 >> 7)) {
                                if (var4.method1078((byte) 114) > 1) {
                                    for (int var8 = var4.field3904[0]; (var4.field3904[0] + var4.method1078((byte) 114)) > var8; var8++) {
                                        for (int var9 = var4.field3890[0]; var4.field3890[0] + var4.method1078((byte) 114) > var9; var9++) {
                                            if ((var2 & class218.field3479[class279.field4651].field3605[var8][var9]) != 0) {
                                                continue label193;
                                            }
                                        }
                                    }
                                }
                                var4.field3959 = 1;
                            }
                        }
                    }
                    class208.method1389((byte) -122, var4);
                    class192.method1300(65536, var4);
                    class236.method1584(var4, arg0 ^ 0xFFFFD13A);
                    class218.field3479[class279.field4651].method1524(var4.field3962 >> 7, false, (byte) 85, var4.field3972 >> 7, var4.method1078((byte) 114), var4.method1078((byte) 114));
                }
            }
        }
        if (arg0 != 1) {
            field4112 = (class26) null;
        }
        if (!class255.field4184) {
            class82.method583(true);
        } else if (class230.field3647 == 0 && class127.field1969 == 0) {
            if (class37.field614 == 2) {
                class263.method1853(arg0 ^ 0x401);
            } else {
                class120.method824(65535);
            }
            if (class324.field5589 >> 7 < 14 || class324.field5589 >> 7 >= 90 || class14.field231 >> 7 < 14 || (class14.field231 >> 7) >= 90) {
                class98.method728(arg0 ^ 0x4FFE);
            }
        }
        while (true) {
            class263 var10;
            class297 var11;
            class297 var12;
            do {
                var10 = (class263) class163.field2533.method262((byte) -3);
                if (var10 == null) {
                    while (true) {
                        class263 var13;
                        class297 var17;
                        class297 var18;
                        do {
                            var13 = (class263) class64.field1012.method262((byte) -3);
                            if (var13 == null) {
                                while (true) {
                                    class263 var14;
                                    class297 var15;
                                    class297 var16;
                                    do {
                                        var14 = (class263) class100.field1610.method262((byte) -3);
                                        if (var14 == null) {
                                            if (class95.field1549 != null) {
                                                class163.method1116(-1);
                                            }
                                            if (class316.field5417 != null && class316.field5417.field2811 == 1) {
                                                if (class316.field5417.field2812 != null) {
                                                    class67.method497(class185.field2881, (byte) 126, class26.field421);
                                                }
                                                class26.field421 = false;
                                                class185.field2881 = null;
                                                class316.field5417 = null;
                                            }
                                            if (class229.field3626 % 1500 == 0) {
                                                class149.method1014(true);
                                            }
                                            return;
                                        }
                                        var15 = var14.field4307;
                                        if (var15.field4994 < 0) {
                                            break;
                                        }
                                        var16 = class178.method1226((byte) 118, var15.field4993);
                                    } while (var16 == null || var16.field5068 == null || var16.field5068.length <= var15.field4994 || var16.field5068[var15.field4994] != var15);
                                    class215.method1442(1073376993, var14);
                                }
                            }
                            var17 = var13.field4307;
                            if (var17.field4994 < 0) {
                                break;
                            }
                            var18 = class178.method1226((byte) 112, var17.field4993);
                        } while (var18 == null || var18.field5068 == null || var17.field4994 >= var18.field5068.length || var18.field5068[var17.field4994] != var17);
                        class215.method1442(1073376993, var13);
                    }
                }
                var11 = var10.field4307;
                if (var11.field4994 < 0) {
                    break;
                }
                var12 = class178.method1226((byte) 126, var11.field4993);
            } while (var12 == null || var12.field5068 == null || var12.field5068.length <= var11.field4994 || var12.field5068[var11.field4994] != var11);
            class215.method1442(arg0 ^ 0x3FFA6EE0, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 1207)
    private final void method1734(boolean arg0) {
        boolean var2 = class258.field4212.method221((byte) -61);
        field4122++;
        if (!arg0) {
            field4119 = (class26) null;
        }
        if (!var2) {
            this.method1735(-31379);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1242)
    private final void method1735(int arg0) {
        if (arg0 != -31379) {
            method1737((class297) null);
        }
        field4107++;
        if (class252.field4148 < class258.field4212.field495) {
            class310.field5324 = (class258.field4212.field495 - 1) * 50 * 5;
            if (class319.field5446 == class104.field1661) {
                class319.field5446 = class279.field4656;
            } else {
                class319.field5446 = class104.field1661;
            }
            if (class310.field5324 > 3000) {
                class310.field5324 = 3000;
            }
            if (class258.field4212.field495 >= 2 && class258.field4212.field494 == 6) {
                this.method2258("js5connect_outofdate", -48);
                class207.field3217 = 1000;
                return;
            }
            if (class258.field4212.field495 >= 4 && class258.field4212.field494 == -1) {
                this.method2258("js5crc", -48);
                class207.field3217 = 1000;
                return;
            }
            if (class258.field4212.field495 >= 4 && (class207.field3217 == 0 || class207.field3217 == 5)) {
                if (class258.field4212.field494 == 7 || class258.field4212.field494 == 9) {
                    this.method2258("js5connect_full", -48);
                } else if (class258.field4212.field494 > 0) {
                    this.method2258("js5connect", -48);
                } else {
                    this.method2258("js5io", -48);
                }
                class207.field3217 = 1000;
                return;
            }
        }
        class252.field4148 = class258.field4212.field495;
        if (class310.field5324 > 0) {
            class310.field5324--;
            return;
        }
        try {
            if (class163.field2527 == 0) {
                class192.field3001 = class45.field712.method1056((byte) 8, class11.field149, class319.field5446);
                class163.field2527++;
            }
            if (class163.field2527 == 1) {
                if (class192.field3001.field2811 == 2) {
                    this.method1732(true, 1000);
                    return;
                }
                if (class192.field3001.field2811 == 1) {
                    class163.field2527++;
                }
            }
            if (class163.field2527 == 2) {
                class61.field987 = new class285((Socket) class192.field3001.field2812, class45.field712);
                class82 var2 = new class82(5);
                var2.method591((byte) -69, 15);
                var2.method577(arg0 + 31252, 530);
                class61.field987.method2014(false, 0, var2.field1280, 5);
                class163.field2527++;
                class18.field262 = class128.method869((byte) -55);
            }
            if (class163.field2527 == 3) {
                if (class207.field3217 == 0 || class207.field3217 == 5 || class61.field987.method2015(arg0 ^ 0x3D27) > 0) {
                    int var3 = class61.field987.method2012(0);
                    if (var3 != 0) {
                        this.method1732(true, var3);
                        return;
                    }
                    class163.field2527++;
                } else if ((class128.method869((byte) -55) - class18.field262) > 30000L) {
                    this.method1732(true, 1001);
                    return;
                }
            }
            if (class163.field2527 == 4) {
                boolean var4 = class207.field3217 == 5 || class207.field3217 == 10 || class207.field3217 == 28;
                class258.field4212.method227(!var4, class61.field987, arg0 + 31379);
                class61.field987 = null;
                class192.field3001 = null;
                class163.field2527 = 0;
            }
        } catch (IOException var6) {
            this.method1732(true, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1389)
    public static final void main(String[] arg0) {
        field4108++;
        try {
            if (arg0.length != 4) {
                class76.method544("argument count", (byte) 38);
            }
            int var1 = -1;
            class78.field1209 = Integer.parseInt(arg0[0]);
            class229.field3624 = 2;
            if (arg0[1].equals("live")) {
                class72.field1106 = 0;
            } else if (arg0[1].equals("rc")) {
                class72.field1106 = 1;
            } else if (arg0[1].equals("wip")) {
                class72.field1106 = 2;
            } else {
                class76.method544("modewhat", (byte) 38);
            }
            class280.field4670 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class20.method131(class320.method2222(var2, -4114, var2.length, 0), (byte) 13);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class210.field3264 = var1;
            } else if (arg0[2].equals("english")) {
                class210.field3264 = 0;
            } else if (arg0[2].equals("german")) {
                class210.field3264 = 1;
            } else {
                class76.method544("language", (byte) 38);
            }
            class147.method1007(-78, class210.field3264);
            class252.field4140 = false;
            class277.field4634 = false;
            if (arg0[3].equals("game0")) {
                class170.field2670 = 0;
            } else if (arg0[3].equals("game1")) {
                class170.field2670 = 1;
            } else {
                class76.method544("game", (byte) 38);
            }
            class174.field2726 = 0;
            class25.field371 = false;
            class301.field5184 = 0;
            class211.field3273 = class2.field18;
            client var4 = new client();
            class136.field2085 = var4;
            var4.method2263(class72.field1106 + 32, 530, false, 1024, "runescape", 768, -8057, 28);
            class142.field2172.setLocation(40, 40);
        } catch (Exception var7) {
            class302.method2124((String) null, var7, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lbe;IIIIIII)V", line = 1467)
    public static final void method1736(class297[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class297 var9 = arg0[var8];
            if (var9 != null && var9.field4993 == arg1 && (!var9.field5038 || var9.field4988 == 0 || var9.field4998 || method1730(var9).field5661 != 0 || class163.field2540 == var9 || var9.field4990 == 1338) && (!var9.field5038 || !method1737(var9))) {
                int var10 = var9.field5118 + arg6;
                int var11 = var9.field5014 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4988 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4967 + var10;
                    int var17 = var9.field4996 + var11;
                    if (var9.field4988 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class95.field1549 == var9) {
                    class168.field2596 = true;
                    class88.field1437 = var10;
                    class55.field873 = var11;
                }
                if (!var9.field5038 || var12 < var14 && var13 < var15) {
                    if (var9.field4988 == 0) {
                        if (!var9.field5038 && method1737(var9) && class204.field3193 != var9) {
                            continue;
                        }
                        if (var9.field5023 && class136.field2090 >= var12 && class259.field4235 >= var13 && class136.field2090 < var14 && class259.field4235 < var15) {
                            for (class263 var18 = (class263) class100.field1610.method264(-18); var18 != null; var18 = (class263) class100.field1610.method263(4)) {
                                if (var18.field4304) {
                                    var18.method1006(-1024);
                                    var18.field4307.field4962 = false;
                                }
                            }
                            if (class276.field4617 == 0) {
                                class95.field1549 = null;
                                class163.field2540 = null;
                            }
                            class131.field1991 = 0;
                        }
                    }
                    if (var9.field5038) {
                        boolean var19;
                        if (class136.field2090 >= var12 && class259.field4235 >= var13 && class136.field2090 < var14 && class259.field4235 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class310.field5325 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class277.field4639 == 1 && class205.field3210 >= var12 && class11.field152 >= var13 && class205.field3210 < var14 && class11.field152 < var15) {
                            var21 = true;
                        }
                        if (var9.field5069 != null) {
                            for (int var22 = 0; var22 < var9.field5069.length; var22++) {
                                if (class78.field1183[var9.field5069[var22]]) {
                                    if (var9.field5122 == null || class229.field3626 >= var9.field5122[var22]) {
                                        byte var23 = var9.field5036[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class78.field1183[86]) && ((var23 & 0x1) == 0 || class78.field1183[82]) && ((var23 & 0x4) == 0 || class78.field1183[81])) {
                                            class262.method1846(class2.field18, -1, var22 + 1, (byte) -29, var9.field5088);
                                            int var24 = var9.field5110[var22];
                                            if (var9.field5122 == null) {
                                                var9.field5122 = new int[var9.field5069.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field5122[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field5122[var22] = class229.field3626 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field5122 != null) {
                                    var9.field5122[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class120.method831(class11.field152 - var11, class205.field3210 - var10, 97, var9);
                        }
                        if (class95.field1549 != null && class95.field1549 != var9 && var19 && method1730(var9).method2289(false)) {
                            class322.field5544 = var9;
                        }
                        if (class163.field2540 == var9) {
                            class123.field1913 = true;
                            class72.field1115 = var10;
                            class287.field4801 = var11;
                        }
                        if (var9.field4998 || var9.field4990 != 0) {
                            if (var19 && class167.field2591 != 0 && var9.field4984 != null) {
                                class263 var25 = new class263();
                                var25.field4304 = true;
                                var25.field4307 = var9;
                                var25.field4298 = class167.field2591;
                                var25.field4306 = var9.field4984;
                                class100.field1610.method257(true, var25);
                            }
                            if (class95.field1549 != null || class140.field2138 != null || class11.field153 || var9.field4990 != 1400 && class131.field1991 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4990 != 0) {
                                if (var9.field4990 == 1337) {
                                    class89.field1465 = var9;
                                    class318.method2209(124, var9);
                                    continue;
                                }
                                if (var9.field4990 == 1338) {
                                    if (var21) {
                                        class273.field4572 = class205.field3210 - var10;
                                        class258.field4211 = class11.field152 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4990 == 1400) {
                                    class66.field1033 = var9;
                                    if (var21) {
                                        if (class78.field1183[82] && class201.field3119 > 0) {
                                            int var26 = (int) ((double) (class205.field3210 - var10 - var9.field4967 / 2) * 2.0D / (double) class229.field3640);
                                            int var27 = (int) ((double) (class11.field152 - var11 - var9.field4996 / 2) * 2.0D / (double) class229.field3640);
                                            int var28 = class118.field1860 + var26;
                                            int var29 = class69.field1069 + var27;
                                            int var30 = class135.field2057 + var28;
                                            int var31 = class317.field5436 + class9.field111 - var29 - 1;
                                            class41.method331(var30, var31, 0, (byte) -4);
                                            class181.method1253((byte) 126);
                                            continue;
                                        }
                                        class131.field1991 = 1;
                                        class254.field4150 = class136.field2090;
                                        class313.field5346 = class259.field4235;
                                        continue;
                                    }
                                    if (var20 && class131.field1991 > 0) {
                                        if (class131.field1991 == 1 && (class254.field4150 != class136.field2090 || class313.field5346 != class259.field4235)) {
                                            class103.field1658 = class118.field1860;
                                            class45.field705 = class69.field1069;
                                            class131.field1991 = 2;
                                        }
                                        if (class131.field1991 == 2) {
                                            class29.method235((int) ((double) (class254.field4150 - class136.field2090) * 2.0D / (double) class324.field5568) + class103.field1658, 112);
                                            class261.method1841(-126, (int) ((double) (class313.field5346 - class259.field4235) * 2.0D / (double) class324.field5568) + class45.field705);
                                        }
                                        continue;
                                    }
                                    class131.field1991 = 0;
                                    continue;
                                }
                                if (var9.field4990 == 1401) {
                                    if (var20) {
                                        class74.method534(-22611, var9.field4967, class259.field4235 - var11, class136.field2090 - var10, var9.field4996);
                                    }
                                    continue;
                                }
                                if (var9.field4990 == 1402) {
                                    if (!class255.field4184) {
                                        class318.method2209(113, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field4989 && var21) {
                                var9.field4989 = true;
                                if (var9.field4964 != null) {
                                    class263 var32 = new class263();
                                    var32.field4304 = true;
                                    var32.field4307 = var9;
                                    var32.field4305 = class205.field3210 - var10;
                                    var32.field4298 = class11.field152 - var11;
                                    var32.field4306 = var9.field4964;
                                    class100.field1610.method257(true, var32);
                                }
                            }
                            if (var9.field4989 && var20 && var9.field4969 != null) {
                                class263 var33 = new class263();
                                var33.field4304 = true;
                                var33.field4307 = var9;
                                var33.field4305 = class136.field2090 - var10;
                                var33.field4298 = class259.field4235 - var11;
                                var33.field4306 = var9.field4969;
                                class100.field1610.method257(true, var33);
                            }
                            if (var9.field4989 && !var20) {
                                var9.field4989 = false;
                                if (var9.field5044 != null) {
                                    class263 var34 = new class263();
                                    var34.field4304 = true;
                                    var34.field4307 = var9;
                                    var34.field4305 = class136.field2090 - var10;
                                    var34.field4298 = class259.field4235 - var11;
                                    var34.field4306 = var9.field5044;
                                    class64.field1012.method257(true, var34);
                                }
                            }
                            if (var20 && var9.field4979 != null) {
                                class263 var35 = new class263();
                                var35.field4304 = true;
                                var35.field4307 = var9;
                                var35.field4305 = class136.field2090 - var10;
                                var35.field4298 = class259.field4235 - var11;
                                var35.field4306 = var9.field4979;
                                class100.field1610.method257(true, var35);
                            }
                            if (!var9.field4962 && var19) {
                                var9.field4962 = true;
                                if (var9.field5054 != null) {
                                    class263 var36 = new class263();
                                    var36.field4304 = true;
                                    var36.field4307 = var9;
                                    var36.field4305 = class136.field2090 - var10;
                                    var36.field4298 = class259.field4235 - var11;
                                    var36.field4306 = var9.field5054;
                                    class100.field1610.method257(true, var36);
                                }
                            }
                            if (var9.field4962 && var19 && var9.field5085 != null) {
                                class263 var37 = new class263();
                                var37.field4304 = true;
                                var37.field4307 = var9;
                                var37.field4305 = class136.field2090 - var10;
                                var37.field4298 = class259.field4235 - var11;
                                var37.field4306 = var9.field5085;
                                class100.field1610.method257(true, var37);
                            }
                            if (var9.field4962 && !var19) {
                                var9.field4962 = false;
                                if (var9.field5091 != null) {
                                    class263 var38 = new class263();
                                    var38.field4304 = true;
                                    var38.field4307 = var9;
                                    var38.field4305 = class136.field2090 - var10;
                                    var38.field4298 = class259.field4235 - var11;
                                    var38.field4306 = var9.field5091;
                                    class64.field1012.method257(true, var38);
                                }
                            }
                            if (var9.field5076 != null) {
                                class263 var39 = new class263();
                                var39.field4307 = var9;
                                var39.field4306 = var9.field5076;
                                class163.field2533.method257(true, var39);
                            }
                            if (var9.field4960 != null && class163.field2539 > var9.field5094) {
                                if (var9.field5015 == null || class163.field2539 - var9.field5094 > 32) {
                                    class263 var44 = new class263();
                                    var44.field4307 = var9;
                                    var44.field4306 = var9.field4960;
                                    class100.field1610.method257(true, var44);
                                } else {
                                    label568: for (int var40 = var9.field5094; var40 < class163.field2539; var40++) {
                                        int var41 = class324.field5575[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field5015.length; var42++) {
                                            if (var9.field5015[var42] == var41) {
                                                class263 var43 = new class263();
                                                var43.field4307 = var9;
                                                var43.field4306 = var9.field4960;
                                                class100.field1610.method257(true, var43);
                                                break label568;
                                            }
                                        }
                                    }
                                }
                                var9.field5094 = class163.field2539;
                            }
                            if (var9.field5025 != null && class224.field3543 > var9.field5048) {
                                if (var9.field4986 == null || class224.field3543 - var9.field5048 > 32) {
                                    class263 var49 = new class263();
                                    var49.field4307 = var9;
                                    var49.field4306 = var9.field5025;
                                    class100.field1610.method257(true, var49);
                                } else {
                                    label544: for (int var45 = var9.field5048; var45 < class224.field3543; var45++) {
                                        int var46 = class252.field4147[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field4986.length; var47++) {
                                            if (var9.field4986[var47] == var46) {
                                                class263 var48 = new class263();
                                                var48.field4307 = var9;
                                                var48.field4306 = var9.field5025;
                                                class100.field1610.method257(true, var48);
                                                break label544;
                                            }
                                        }
                                    }
                                }
                                var9.field5048 = class224.field3543;
                            }
                            if (var9.field5092 != null && class260.field4258 > var9.field5017) {
                                if (var9.field5096 == null || class260.field4258 - var9.field5017 > 32) {
                                    class263 var54 = new class263();
                                    var54.field4307 = var9;
                                    var54.field4306 = var9.field5092;
                                    class100.field1610.method257(true, var54);
                                } else {
                                    label520: for (int var50 = var9.field5017; var50 < class260.field4258; var50++) {
                                        int var51 = class229.field3639[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field5096.length; var52++) {
                                            if (var9.field5096[var52] == var51) {
                                                class263 var53 = new class263();
                                                var53.field4307 = var9;
                                                var53.field4306 = var9.field5092;
                                                class100.field1610.method257(true, var53);
                                                break label520;
                                            }
                                        }
                                    }
                                }
                                var9.field5017 = class260.field4258;
                            }
                            if (var9.field4973 != null && class212.field3279 > var9.field5061) {
                                if (var9.field4974 == null || class212.field3279 - var9.field5061 > 32) {
                                    class263 var59 = new class263();
                                    var59.field4307 = var9;
                                    var59.field4306 = var9.field4973;
                                    class100.field1610.method257(true, var59);
                                } else {
                                    label496: for (int var55 = var9.field5061; var55 < class212.field3279; var55++) {
                                        int var56 = class281.field4672[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field4974.length; var57++) {
                                            if (var9.field4974[var57] == var56) {
                                                class263 var58 = new class263();
                                                var58.field4307 = var9;
                                                var58.field4306 = var9.field4973;
                                                class100.field1610.method257(true, var58);
                                                break label496;
                                            }
                                        }
                                    }
                                }
                                var9.field5061 = class212.field3279;
                            }
                            if (var9.field4957 != null && class302.field5208 > var9.field5123) {
                                if (var9.field5083 == null || class302.field5208 - var9.field5123 > 32) {
                                    class263 var64 = new class263();
                                    var64.field4307 = var9;
                                    var64.field4306 = var9.field4957;
                                    class100.field1610.method257(true, var64);
                                } else {
                                    label472: for (int var60 = var9.field5123; var60 < class302.field5208; var60++) {
                                        int var61 = class280.field4671[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field5083.length; var62++) {
                                            if (var9.field5083[var62] == var61) {
                                                class263 var63 = new class263();
                                                var63.field4307 = var9;
                                                var63.field4306 = var9.field4957;
                                                class100.field1610.method257(true, var63);
                                                break label472;
                                            }
                                        }
                                    }
                                }
                                var9.field5123 = class302.field5208;
                            }
                            if (class284.field4761 > var9.field5039 && var9.field5062 != null) {
                                class263 var65 = new class263();
                                var65.field4307 = var9;
                                var65.field4306 = var9.field5062;
                                class100.field1610.method257(true, var65);
                            }
                            if (class100.field1611 > var9.field5039 && var9.field4955 != null) {
                                class263 var66 = new class263();
                                var66.field4307 = var9;
                                var66.field4306 = var9.field4955;
                                class100.field1610.method257(true, var66);
                            }
                            if (class216.field3392 > var9.field5039 && var9.field5125 != null) {
                                class263 var67 = new class263();
                                var67.field4307 = var9;
                                var67.field4306 = var9.field5125;
                                class100.field1610.method257(true, var67);
                            }
                            if (class17.field243 > var9.field5039 && var9.field5074 != null) {
                                class263 var68 = new class263();
                                var68.field4307 = var9;
                                var68.field4306 = var9.field5074;
                                class100.field1610.method257(true, var68);
                            }
                            if (class319.field5463 > var9.field5039 && var9.field5127 != null) {
                                class263 var69 = new class263();
                                var69.field4307 = var9;
                                var69.field4306 = var9.field5127;
                                class100.field1610.method257(true, var69);
                            }
                            var9.field5039 = class74.field1144;
                            if (var9.field5024 != null) {
                                for (int var70 = 0; var70 < class323.field5556; var70++) {
                                    class263 var71 = new class263();
                                    var71.field4307 = var9;
                                    var71.field4302 = class37.field616[var70];
                                    var71.field4301 = class251.field4106[var70];
                                    var71.field4306 = var9.field5024;
                                    class100.field1610.method257(true, var71);
                                }
                            }
                            if (class118.field1847 && var9.field5021 != null) {
                                class263 var72 = new class263();
                                var72.field4307 = var9;
                                var72.field4306 = var9.field5021;
                                class100.field1610.method257(true, var72);
                            }
                        }
                    }
                    if (!var9.field5038 && class95.field1549 == null && class140.field2138 == null && !class11.field153) {
                        if ((var9.field5016 >= 0 || var9.field5033 != 0) && class136.field2090 >= var12 && class259.field4235 >= var13 && class136.field2090 < var14 && class259.field4235 < var15) {
                            if (var9.field5016 >= 0) {
                                class204.field3193 = arg0[var9.field5016];
                            } else {
                                class204.field3193 = var9;
                            }
                        }
                        if (var9.field4988 == 8 && class136.field2090 >= var12 && class259.field4235 >= var13 && class136.field2090 < var14 && class259.field4235 < var15) {
                            class318.field5445 = var9;
                        }
                        if (var9.field5058 > var9.field4996) {
                            class40.method325(class259.field4235, var9.field4996, var9, (byte) -101, class136.field2090, var9.field4967 + var10, var11, var9.field5058);
                        }
                    }
                    if (var9.field4988 == 0) {
                        method1736(arg0, var9.field5088, var12, var13, var14, var15, var10 - var9.field5053, var11 - var9.field5012);
                        if (var9.field5068 != null) {
                            method1736(var9.field5068, var9.field5088, var12, var13, var14, var15, var10 - var9.field5053, var11 - var9.field5012);
                        }
                        class174 var73 = (class174) class74.field1132.method1827((long) var9.field5088, 0);
                        if (var73 != null) {
                            class300.method2115(var10, var13, 2, var11, var14, var73.field2721, var12, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lbe;)Z", line = 2234)
    public static final boolean method1737(class297 arg0) {
        if (class299.field5146) {
            if (method1730(arg0).field5661 != 0) {
                return false;
            }
            if (arg0.field4988 == 0) {
                return false;
            }
        }
        return arg0.field4954;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2254)
    private final void method1738(int arg0) {
        if (!class26.field380) {
            label239: while (true) {
                do {
                    if (!class304.method2133(107)) {
                        break label239;
                    }
                } while (class309.field5319 != 115 && class309.field5319 != 83);
                class26.field380 = true;
            }
        }
        if (arg0 < 46) {
            return;
        }
        field4121++;
        if (class145.field2206 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class128.method869((byte) -55);
            if (class185.field2883 == 0L) {
                class185.field2883 = var4;
            }
            if (var3 > 16384 && var4 - class185.field2883 < 5000L) {
                if (var4 - class228.field3619 > 1000L) {
                    System.gc();
                    class228.field3619 = var4;
                }
                class4.field37 = 5;
                class235.field3731 = class76.field1161;
            } else {
                class235.field3731 = class26.field402;
                class145.field2206 = 10;
                class4.field37 = 5;
            }
        } else if (class145.field2206 == 10) {
            class226.method1504(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class218.field3479[var6] = new class228(104, 104);
            }
            class4.field37 = 10;
            class145.field2206 = 30;
            class235.field3731 = class57.field927;
        } else if (class145.field2206 == 30) {
            if (class73.field1127 == null) {
                class73.field1127 = new class321(class258.field4212, class292.field4855);
            }
            if (class73.field1127.method2230(255)) {
                class276.field4620 = class321.method2235(false, true, true, 0, true);
                class280.field4661 = class321.method2235(false, true, true, 1, true);
                class58.field941 = class321.method2235(true, true, false, 2, true);
                class109.field1710 = class321.method2235(false, true, true, 3, true);
                class189.field2969 = class321.method2235(false, true, true, 4, true);
                class98.field1597 = class321.method2235(true, true, true, 5, true);
                class36.field593 = class321.method2235(true, false, true, 6, true);
                class80.field1258 = class321.method2235(false, true, true, 7, true);
                class319.field5464 = class321.method2235(false, true, true, 8, true);
                class112.field1769 = class321.method2235(false, true, true, 9, true);
                class230.field3646 = class321.method2235(false, true, true, 10, true);
                class96.field1568 = class321.method2235(false, true, true, 11, true);
                class327.field5656 = class321.method2235(false, true, true, 12, true);
                class266.field4374 = class321.method2235(false, true, true, 13, true);
                class131.field1990 = class321.method2235(false, false, true, 14, true);
                class324.field5588 = class321.method2235(false, true, true, 15, true);
                class89.field1476 = class321.method2235(false, true, true, 16, true);
                class324.field5587 = class321.method2235(false, true, true, 17, true);
                class225.field3575 = class321.method2235(false, true, true, 18, true);
                class24.field347 = class321.method2235(false, true, true, 19, true);
                class264.field4325 = class321.method2235(false, true, true, 20, true);
                class267.field4420 = class321.method2235(false, true, true, 21, true);
                class47.field769 = class321.method2235(false, true, true, 22, true);
                class37.field610 = class321.method2235(true, true, true, 23, true);
                class141.field2161 = class321.method2235(false, true, true, 24, true);
                class69.field1076 = class321.method2235(false, true, true, 25, true);
                class314.field5378 = class321.method2235(true, true, true, 26, true);
                class108.field1693 = class321.method2235(false, true, true, 27, true);
                class4.field37 = 15;
                class235.field3731 = class25.field365;
                class145.field2206 = 40;
            } else {
                class235.field3731 = class107.field1680;
                class4.field37 = 12;
            }
        } else if (class145.field2206 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class82.field1338[var8].method1375(-61) * class115.field1819[var8] / 100;
            }
            if (var7 == 100) {
                class4.field37 = 20;
                class235.field3731 = class166.field2576;
                class160.method1092(208, class319.field5464);
                class314.method2181(111, class319.field5464);
                class72.method517(28280, class319.field5464);
                class145.field2206 = 45;
            } else {
                if (var7 != 0) {
                    class235.field3731 = class236.method1587(new class26[] { class137.field2104, class149.method1019((byte) 9, var7), class284.field4754 }, (byte) -93);
                }
                class4.field37 = 20;
            }
        } else if (class145.field2206 == 45) {
            class109.method771(256, 2, 22050, class303.field5227);
            class218.field3493 = new class146();
            class218.field3493.method972((byte) 98, 9, 128);
            class166.field2580 = class258.method1816(22050, class45.field712, class250.field4085, 0, 14);
            class166.field2580.method388(-116, class218.field3493);
            class236.method1581(17770, class218.field3493, class324.field5588, class131.field1990, class189.field2969);
            class23.field329 = class258.method1816(2048, class45.field712, class250.field4085, 1, 14);
            class301.field5195 = new class195();
            class23.field329.method388(-128, class301.field5195);
            class322.field5542 = new class107(22050, class168.field2603);
            class22.field318 = class36.field593.method1876(class273.field4569, (byte) -30);
            class4.field37 = 30;
            class145.field2206 = 50;
            class235.field3731 = class12.field178;
        } else if (class145.field2206 == 50) {
            int var28 = class31.method250(class319.field5464, class266.field4374, false);
            int var29 = class122.method840((byte) -5);
            if (var28 >= var29) {
                class235.field3731 = class207.field3221;
                class4.field37 = 35;
                class145.field2206 = 60;
            } else {
                class235.field3731 = class236.method1587(new class26[] { class277.field4637, class149.method1019((byte) 9, var28 * 100 / var29), class284.field4754 }, (byte) -59);
                class4.field37 = 35;
            }
        } else if (class145.field2206 == 60) {
            int var26 = class277.method1953(-20916, class319.field5464);
            int var27 = class208.method1394(6098);
            if (var27 <= var26) {
                class235.field3731 = class281.field4692;
                class145.field2206 = 65;
                class4.field37 = 40;
            } else {
                class235.field3731 = class236.method1587(new class26[] { class284.field4744, class149.method1019((byte) 9, var26 * 100 / var27), class284.field4754 }, (byte) -125);
                class4.field37 = 40;
            }
        } else if (class145.field2206 == 65) {
            class33.method268(class266.field4374, 0, class319.field5464);
            class4.field37 = 45;
            class235.field3731 = class38.field629;
            class193.method1302(5, 5);
            class145.field2206 = 70;
        } else if (class145.field2206 == 70) {
            class58.field941.method1869((byte) 34);
            byte var14 = 0;
            int var15 = var14 + class58.field941.method1892((byte) -124);
            class89.field1476.method1869((byte) 120);
            int var16 = var15 + class89.field1476.method1892((byte) -128);
            class324.field5587.method1869((byte) 70);
            int var17 = var16 + class324.field5587.method1892((byte) -123);
            class225.field3575.method1869((byte) 32);
            int var18 = var17 + class225.field3575.method1892((byte) -127);
            class24.field347.method1869((byte) 48);
            int var19 = var18 + class24.field347.method1892((byte) -128);
            class264.field4325.method1869((byte) 43);
            int var20 = var19 + class264.field4325.method1892((byte) -122);
            class267.field4420.method1869((byte) 23);
            int var21 = var20 + class267.field4420.method1892((byte) -122);
            class47.field769.method1869((byte) 94);
            int var22 = var21 + class47.field769.method1892((byte) -128);
            class141.field2161.method1869((byte) 91);
            int var23 = var22 + class141.field2161.method1892((byte) -126);
            class69.field1076.method1869((byte) 102);
            int var24 = var23 + class69.field1076.method1892((byte) -128);
            class108.field1693.method1869((byte) 126);
            int var25 = var24 + class108.field1693.method1892((byte) -124);
            if (var25 >= 1100) {
                class108.method766((byte) 96, class58.field941);
                class4.method21(false, class58.field941);
                class173.method1189(class58.field941, -1);
                class263.method1849(3, class80.field1258, class58.field941);
                class317.method2206(2, class89.field1476, class80.field1258, true);
                class217.method1453(class80.field1258, class225.field3575, false);
                class86.method672(true, (byte) -126, class24.field347, class107.field1688, class80.field1258);
                class167.method1129(class58.field941, 59);
                class210.method1411(class280.field4661, class264.field4325, -77, class276.field4620);
                class153.method1043((byte) -117, class58.field941);
                class170.method1170(class80.field1258, class267.field4420, 11504);
                class204.method1379(class47.field769, 255);
                class56.method408(class58.field941, (byte) -113);
                class147.method1009(true, class266.field4374, class319.field5464, class109.field1710, class80.field1258);
                class74.method531(2048, class58.field941);
                class191.method1298(class324.field5587, -6);
                class158.method1075(class69.field1076, 115, class141.field2161, new class178());
                class64.method483(class69.field1076, class141.field2161, -117);
                class258.method1818(class58.field941, (byte) 69);
                class254.method1755((byte) -125, class58.field941, class319.field5464);
                class204.method1376(class58.field941, class319.field5464, (byte) -67);
                class4.field37 = 50;
                class235.field3731 = class31.field520;
                class167.method1128(128);
                class145.field2206 = 80;
            } else {
                class235.field3731 = class236.method1587(new class26[] { class63.field1002, class149.method1019((byte) 9, var25 / 11), class284.field4754 }, (byte) -80);
                class4.field37 = 50;
            }
        } else if (class145.field2206 == 80) {
            int var9 = class69.method504(class319.field5464, (byte) -125);
            int var10 = class245.method1688(-119);
            if (var10 > var9) {
                class235.field3731 = class236.method1587(new class26[] { class190.field2974, class149.method1019((byte) 9, var9 * 100 / var10), class284.field4754 }, (byte) -66);
                class4.field37 = 60;
            } else {
                class42.method339(21, class319.field5464);
                class145.field2206 = 90;
                class4.field37 = 60;
                class235.field3731 = class259.field4231;
            }
        } else if (class145.field2206 == 90) {
            if (class314.field5378.method1869((byte) 58)) {
                class13 var13 = new class13(class112.field1769, class314.field5378, class319.field5464, 20, !class39.field643);
                class200.method1344(var13);
                if (class57.field923 == 1) {
                    class200.method1341(0.9F);
                }
                if (class57.field923 == 2) {
                    class200.method1341(0.8F);
                }
                if (class57.field923 == 3) {
                    class200.method1341(0.7F);
                }
                if (class57.field923 == 4) {
                    class200.method1341(0.6F);
                }
                class235.field3731 = class292.field4864;
                class145.field2206 = 100;
                class4.field37 = 70;
            } else {
                class235.field3731 = class236.method1587(new class26[] { class21.field293, class149.method1019((byte) 9, class314.field5378.method1892((byte) -125)), class284.field4754 }, (byte) -95);
                class4.field37 = 70;
            }
        } else if (class145.field2206 == 100) {
            if (class126.method865(class319.field5464, 0)) {
                class145.field2206 = 110;
            }
        } else if (class145.field2206 == 110) {
            class25.field363 = new class140();
            class45.field712.method1054(0, 10, class25.field363);
            class235.field3731 = class24.field346;
            class4.field37 = 75;
            class145.field2206 = 120;
        } else if (class145.field2206 == 120) {
            if (class230.field3646.method1881(class2.field18, (byte) 116, class275.field4593)) {
                class260 var12 = new class260(class230.field3646.method1879(0, class2.field18, class275.field4593));
                class273.method1935(var12, 104);
                class235.field3731 = class193.field3011;
                class145.field2206 = 130;
                class4.field37 = 80;
            } else {
                class235.field3731 = class236.method1587(new class26[] { class218.field3480, class61.field981 }, (byte) -98);
                class4.field37 = 80;
            }
        } else if (class145.field2206 == 130) {
            if (!class109.field1710.method1869((byte) 20)) {
                class235.field3731 = class236.method1587(new class26[] { class203.field3181, class149.method1019((byte) 9, class109.field1710.method1892((byte) -123) * 3 / 4), class284.field4754 }, (byte) -81);
                class4.field37 = 85;
            } else if (!class327.field5656.method1869((byte) 46)) {
                class235.field3731 = class236.method1587(new class26[] { class203.field3181, class149.method1019((byte) 9, (class327.field5656.method1892((byte) -128) / 10) + 75), class284.field4754 }, (byte) -120);
                class4.field37 = 85;
            } else if (!class266.field4374.method1869((byte) 89)) {
                class235.field3731 = class236.method1587(new class26[] { class203.field3181, class149.method1019((byte) 9, (class266.field4374.method1892((byte) -124) / 20) + 85), class284.field4754 }, (byte) -107);
                class4.field37 = 85;
            } else if (class37.field610.method1883((byte) -83, class313.field5356)) {
                class196.method1319(class13.field218, -11931, class37.field610);
                class4.field37 = 95;
                class235.field3731 = class82.field1312;
                class145.field2206 = 135;
            } else {
                class235.field3731 = class236.method1587(new class26[] { class203.field3181, class149.method1019((byte) 9, (class37.field610.method1872(22813, class313.field5356) / 10) + 90), class284.field4754 }, (byte) -72);
                class4.field37 = 85;
            }
        } else if (class145.field2206 == 135) {
            int var11 = class17.method117(29984);
            if (var11 == -1) {
                class4.field37 = 95;
                class235.field3731 = class269.field4438;
            } else if (var11 == 7 || var11 == 9) {
                this.method2258("worldlistfull", -48);
                class193.method1302(1000, 5);
            } else if (class41.field690) {
                class235.field3731 = class236.field3759;
                class145.field2206 = 140;
                class4.field37 = 96;
            } else {
                this.method2258("worldlistio_" + var11, -48);
                class193.method1302(1000, 5);
            }
        } else if (class145.field2206 == 140) {
            class47.field770 = class109.field1710.method1876(class324.field5586, (byte) -30);
            class98.field1597.method1871(-9, false, true);
            class36.field593.method1871(111, true, true);
            class319.field5464.method1871(-76, true, true);
            class266.field4374.method1871(91, true, true);
            class230.field3646.method1871(-116, true, true);
            class109.field1710.method1871(99, true, true);
            class4.field37 = 97;
            class235.field3731 = class265.field4339;
            class145.field2206 = 150;
            class258.field4206 = true;
        } else if (class145.field2206 == 150) {
            class49.method361();
            if (class26.field380) {
                class33.field560 = 0;
                class2.field17 = 0;
                class96.field1574 = 0;
                class210.field3269 = 0;
            }
            class26.field380 = true;
            class298.method2106(class45.field712, (byte) 14);
            class86.method670(false, class96.field1574, -8914, -1, -1);
            class4.field37 = 100;
            class145.field2206 = 160;
            class235.field3731 = class96.field1573;
        } else if (class145.field2206 == 160) {
            class46.method350(true, 3000);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2788)
    public final void method1739(byte arg0) {
        field4120++;
        if (class207.field3217 == 1000) {
            return;
        }
        class229.field3626++;
        if (class229.field3626 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class11.field156 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class142.field2166.setSeed((long) class11.field156);
        }
        this.method1734(true);
        if (class73.field1127 != null) {
            class73.field1127.method2231((byte) -70);
        }
        class56.method405(false);
        class258.method1815(-16385);
        class223.method1491(-43);
        class212.method1417(18074);
        if (class255.field4184) {
            class197.method1327();
        }
        if (class45.field717 != null) {
            int var3 = class45.field717.method1289(-1);
            class167.field2591 = var3;
        }
        if (class207.field3217 == 0) {
            this.method1738(48);
            class196.method1321(true);
        } else if (class207.field3217 == 5) {
            this.method1738(107);
            class196.method1321(true);
        } else if (class207.field3217 == 25 || class207.field3217 == 28) {
            class308.method2157(-117);
        }
        int var4 = 121 / ((arg0 - 27) / 42);
        if (class207.field3217 == 10) {
            this.method1733((byte) 1);
            class135.method910((byte) 36);
            class139.method931((byte) 81);
            class68.method501((byte) -9);
        } else if (class207.field3217 == 30) {
            class72.method519(true);
        } else if (class207.field3217 == 40) {
            class68.method501((byte) -9);
            if (class170.field2658 != -3) {
                if (class170.field2658 == 15) {
                    class168.method1135(false);
                } else if (class170.field2658 != 2) {
                    class216.method1451((byte) 46);
                }
            }
        }
    }
}
