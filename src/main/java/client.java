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
public class client extends class185 {

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2521 = 0;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Lf;")
    public static class36 field2517 = null;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Z")
    public static boolean field2523 = false;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Lub;")
    public static class89 field2518;

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1080(int arg0) {
        field2526++;
        if (class284.field4486.field4092 > class39.field740) {
            class8.field112 = (class284.field4486.field4092 - 1) * 50 * 5;
            if (class99.field1628 == class245.field3922) {
                class245.field3922 = class271.field4276;
            } else {
                class245.field3922 = class99.field1628;
            }
            if (class8.field112 > 3000) {
                class8.field112 = 3000;
            }
            if (class284.field4486.field4092 >= 2 && class284.field4486.field4090 == 6) {
                this.method1251(false, "js5connect_outofdate");
                class273.field4336 = 1000;
                return;
            }
            if (class284.field4486.field4092 >= 4 && class284.field4486.field4090 == -1) {
                this.method1251(false, "js5crc");
                class273.field4336 = 1000;
                return;
            }
            if (class284.field4486.field4092 >= 4 && (class273.field4336 == 0 || class273.field4336 == 5)) {
                if (class284.field4486.field4090 == 7 || class284.field4486.field4090 == 9) {
                    this.method1251(false, "js5connect_full");
                } else if (class284.field4486.field4090 <= 0) {
                    this.method1251(false, "js5io");
                } else {
                    this.method1251(false, "js5connect");
                }
                class273.field4336 = 1000;
                return;
            }
        }
        class39.field740 = class284.field4486.field4092;
        if (arg0 != -4914) {
            method1089((class36) null);
        }
        if (class8.field112 > 0) {
            class8.field112--;
            return;
        }
        try {
            if (class195.field3116 == 0) {
                class215.field3513 = class105.field1684.method1135(arg0 + 5015, class200.field3195, class245.field3922);
                class195.field3116++;
            }
            if (class195.field3116 == 1) {
                if (class215.field3513.field2589 == 2) {
                    this.method1087(-15818, 1000);
                    return;
                }
                if (class215.field3513.field2589 == 1) {
                    class195.field3116++;
                }
            }
            if (class195.field3116 == 2) {
                class47.field846 = new class1((Socket) class215.field3513.field2594, class105.field1684);
                class221 var2 = new class221(5);
                var2.method1548(-494964184, 15);
                var2.method1529((byte) 127, 533);
                class47.field846.method2(0, var2.field3653, arg0 + 4788, 5);
                class195.field3116++;
                class205.field3282 = class276.method1861((byte) 122);
            }
            if (class195.field3116 == 3) {
                if (class273.field4336 == 0 || class273.field4336 == 5 || class47.field846.method6(-10) > 0) {
                    int var3 = class47.field846.method9(arg0 + 22249);
                    if (var3 != 0) {
                        this.method1087(-15818, var3);
                        return;
                    }
                    class195.field3116++;
                } else if ((class276.method1861((byte) 122) - class205.field3282) > 30000L) {
                    this.method1087(arg0 ^ 0x2EF8, 1001);
                    return;
                }
            }
            if (class195.field3116 == 4) {
                boolean var4 = class273.field4336 == 5 || class273.field4336 == 10 || class273.field4336 == 28;
                class284.field4486.method1749(class47.field846, !var4, (byte) -111);
                class47.field846 = null;
                class215.field3513 = null;
                class195.field3116 = 0;
            }
        } catch (IOException var5) {
            this.method1087(arg0 ^ 0x2EF8, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method1081(int arg0) {
        method1092(-121);
        field2516++;
        class71.method508(-128);
        class16.method126(108);
        class137.method962((byte) 120);
        class194.method1319((byte) 35);
        class7.method54(arg0 + 4178);
        class79.method550(-3);
        class185.method1254(-84);
        class156.method1098((byte) -81);
        class224.method1579(-31876);
        class60.method433((byte) -32);
        class221.method1510((byte) 102);
        class1.method1((byte) 121);
        class256.method1740(81);
        class255.method1739((byte) -125);
        class186.method1263(-1);
        class279.method1883((byte) 120);
        class201.method1381(arg0 - 1);
        class112.method817((byte) 117);
        class146.method1001((byte) -111);
        class68.method482((byte) 45);
        class15.method120((byte) -97);
        class76.method531(-115);
        class22.method201((byte) 111);
        class36.method300((byte) -105);
        class33.method280((byte) -87);
        class115.method844(true);
        class238.method1651(-12431);
        class204.method1408((byte) -108);
        class277.method1866((byte) 106);
        class87.method633((byte) 30);
        class149.method1022(8);
        class175.method1193(5000);
        class220.method1496(-13);
        class110.method810(-125);
        class207.method1437(-4196);
        class135.method946(true);
        class285.method1919(false);
        class107.method780(-1);
        class258.method1760(0);
        class84.method610((byte) -89);
        class202.method1391(80);
        class106.method773((byte) 86);
        class282.method1899((byte) 119);
        class228.method1603(false);
        class129.method914(15914854);
        class47.method380(104);
        class120.method872(0);
        class61.method436(arg0 + 32450);
        class34.method286(-1);
        class100.method734(false);
        class3.method38((byte) 119);
        class105.method762(104);
        class210.method1448(0);
        class26.method231(false);
        class102.method750(-29865);
        class271.method1833((byte) -82);
        class179.method1221(arg0 ^ 0x56);
        class131.method926(86);
        class73.method519(false);
        class150.method1031();
        class12.method97(arg0);
        class187.method1276();
        class162.method1124(0);
        class184.method1244((byte) -113);
        class198.method1343(false);
        class183.method1238(-19902);
        class155.method1079(false);
        class226.method1595((byte) 105);
        class269.method1808();
        class266.method1795(255);
        class41.method355(arg0 ^ 0xFFFF898B);
        class31.method265();
        class153.method1064(true);
        class136.method961((byte) 121);
        class57.method426(104);
        class147.method1008();
        class118.method868((byte) 126);
        class248.method1699(false);
        class176.method1200(2047);
        class103.method753((byte) 126);
        class2.method34();
        class196.method1331(-15313);
        class152.method1061(-31);
        class39.method341(false);
        class4.method41(-65);
        class270.method1828(true);
        class45.method365(-8192);
        class284.method1911((byte) -75);
        class236.method1641(true);
        class169.method1166(0);
        class81.method589(true);
        class234.method1632(arg0 + 2);
        class13.method108(8);
        class252.method1717(arg0 ^ 0xFFFFFFF7);
        class188.method1284(true);
        class173.method1182(83);
        class35.method291(5);
        class244.method1680((byte) -64);
        class85.method620(arg0 - 26415);
        class108.method790(121);
        class189.method1291(arg0 + 61);
        class247.method1694(-128);
        class44.method361(1);
        class99.method732(arg0 + 36);
        class227.method1598(-18204);
        class273.method1844(109);
        class20.method191(0);
        class69.method503();
        class67.method468(arg0 + 23388);
        class222.method1565(-7463);
        class200.method1351((byte) 116);
        class280.method1889((byte) 126);
        class78.method544(-128);
        class124.method897(-19308);
        class32.method277(-122);
        class250.method1709(-106);
        class213.method1466((byte) 125);
        class260.method1778(-128);
        class289.method1933(4574);
        class126.method901(true);
        class229.method1608(108);
        class278.method1870(arg0 - 9685);
        class42.method356(arg0 + 3206);
        class235.method1638(-124);
        class48.method382((byte) 57);
        class272.method1838();
        class215.method1470(112);
        class96.method711(arg0 ^ 0xFFFFFF84);
        class158.method1108((byte) 91);
        class166.method1147();
        class209.method1446(arg0 - 127);
        class241.method1664(arg0 + 19517);
        class259.method1775(14985);
        class239.method1654(-14386);
        class97.method719(false);
        class182.method1236(arg0);
        class19.method187(false);
        class62.method444();
        class95.method708((byte) 107);
        class254.method1728(-1);
        class54.method405(125);
        class64.method454((byte) 108);
        class170.method1177((byte) 89);
        class24.method221((byte) 112);
        class66.method462((byte) -29);
        class128.method909((byte) -70);
        class148.method1014((byte) -93);
        class40.method350(-36);
        class10.method76((byte) -89);
        class142.method981(arg0 - 91);
        class231.method1619(-1);
        class83.method596(-1);
        class52.method398(arg0 ^ 0xFFFFFFAE);
        class72.method515(true);
        class253.method1722(0);
        class111.method811((byte) -18);
        class275.method1859((byte) 103);
        class133.method938(-29390);
        class63.method449((byte) -96);
        class283.method1903();
        class263.method1791(-15275);
        class205.method1414(25388);
        class240.method1659((byte) 62);
        class274.method1850(0);
        class230.method1613(65408);
        class288.method1931(0);
        class171.method1178();
        class208.method1443();
        class178.method1213(false);
        class245.method1686((byte) -110);
        class168.method1156(true);
        class218.method1487();
        class46.method373();
        class9.method67(arg0 ^ 0xFFFFFF83);
        class203.method1397(false);
        class139.method966((byte) 28);
        class29.method252((byte) 57);
        class225.method1586(-1271523481);
        class127.method904(68);
        class281.method1891(-127);
        class91.method683(arg0 + 99);
        class49.method385((byte) 65);
        class161.method1118(true);
        class6.method48(88);
        class51.method396(false);
        class190.method1298(1);
        class43.method360(true);
        class14.method111(64);
        class86.method626((byte) 85);
        class121.method877((byte) 98);
        class50.method391(0);
        class101.method748((byte) 61);
        class113.method830((byte) 18);
        class223.method1569(false);
        class211.method1453(arg0 - 54);
        class199.method1346(2101401217);
        class5.method43(Integer.MAX_VALUE);
        class144.method988((byte) -88);
        class212.method1462(29558);
        class145.method994(0);
        class92.method695((byte) 119);
        class122.method880((byte) -123);
        class17.method132((byte) -103);
        class56.method418((byte) 50);
        class77.method543((byte) -101);
        class90.method679((byte) -16);
        class28.method247((byte) -98);
        class167.method1152(arg0 ^ 0xFFFFE662);
        class219.method1493(127);
        class119.method870(arg0 ^ 0x65);
        class94.method702((byte) -103);
        class82.method593((byte) -6);
        class193.method1311((byte) -102);
        class25.method228(arg0 ^ 0x6D51);
        class286.method1920((byte) 117);
        class214.method1469(-256);
        class164.method1125((byte) -118);
        class206.method1422(true);
        class197.method1339(-15880);
        class216.method1476((byte) -112);
        class53.method403(23291);
        class143.method984((byte) 125);
        class257.method1756(arg0 + 120);
        class11.method82(-2);
        class154.method1069((byte) -47);
        class141.method975((byte) -81);
        class21.method199((byte) 125);
        class180.method1224(true);
        class174.method1188(2000);
        class195.method1329(111);
        class70.method504(true);
        class74.method524(arg0 ^ 0xFFFFFFC5);
        class157.method1100(false);
        class75.method527((byte) 123);
        class264.method1792((byte) 118);
        class27.method237((byte) -29);
        class132.method933(arg0 - 125);
        class262.method1786(arg0);
        class123.method890((byte) -126);
        class98.method725(arg0 ^ 0xFFFFFF88);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2529++;
        if (!this.method1253(-1)) {
            return;
        }
        class60.field991 = Integer.parseInt(this.getParameter("worldid"));
        class205.field3287 = Integer.parseInt(this.getParameter("modewhere"));
        if (class205.field3287 < 0 || class205.field3287 > 1) {
            class205.field3287 = 0;
        }
        class117.field1934 = Integer.parseInt(this.getParameter("modewhat"));
        if (class117.field1934 < 0 || class117.field1934 > 2) {
            class117.field1934 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class60.field993 = true;
        } else {
            class60.field993 = false;
        }
        try {
            class135.field2192 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class135.field2192 = 0;
        }
        class217.method1480(class135.field2192, (byte) 106);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class56.field967 = true;
        } else {
            class56.field967 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class167.field2656 = true;
        } else {
            class167.field2656 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class111.field1837 = 1;
        } else {
            class111.field1837 = 0;
        }
        try {
            class54.field926 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class54.field926 = 0;
        }
        class238.field3868 = this.getParameter("settings");
        if (class238.field3868 == null) {
            class238.field3868 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class254.field4043 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class254.field4043 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class148.field2388 = true;
        } else {
            class148.field2388 = false;
        }
        class105.field1689 = this;
        this.method1259(class117.field1934 + 32, 765, 533, 117, 503);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2528++;
        try {
            if (arg0.length != 4) {
                class13.method105(31, "argument count");
            }
            class60.field991 = Integer.parseInt(arg0[0]);
            class205.field3287 = 2;
            if (arg0[1].equals("live")) {
                class117.field1934 = 0;
            } else if (arg0[1].equals("rc")) {
                class117.field1934 = 1;
            } else if (arg0[1].equals("wip")) {
                class117.field1934 = 2;
            } else {
                class13.method105(47, "modewhat");
            }
            class60.field993 = false;
            class135.field2192 = class221.method1503(arg0[2], false);
            if (class135.field2192 == -1) {
                if (arg0[2].equals("english")) {
                    class135.field2192 = 0;
                } else if (arg0[2].equals("german")) {
                    class135.field2192 = 1;
                } else {
                    class13.method105(34, "language");
                }
            }
            class217.method1480(class135.field2192, (byte) 110);
            class56.field967 = false;
            class167.field2656 = false;
            if (arg0[3].equals("game0")) {
                class111.field1837 = 0;
            } else if (arg0[3].equals("game1")) {
                class111.field1837 = 1;
            } else {
                class13.method105(-111, "game");
            }
            class238.field3868 = "";
            class54.field926 = 0;
            class254.field4043 = 0;
            class148.field2388 = false;
            client var1 = new client();
            class105.field1689 = var1;
            var1.method1250(false, class117.field1934 + 32, 533, 28, (byte) 120, "runescape", 1024, 768);
            class110.field1811.setLocation(40, 40);
        } catch (Exception var3) {
            class178.method1211((String) null, -124, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1082(byte arg0) {
        class213.method1465(false);
        field2515++;
        class216.field3531 = new class255();
        class284.field4486 = new class256();
        if (class117.field1934 != 0) {
            class71.field1161 = new byte[50][];
        }
        method1083((byte) 71, class105.field1684);
        if (class205.field3287 == 0) {
            class121.field1972 = this.getCodeBase().getHost();
            class78.field1253 = 43594;
            class95.field1554 = 443;
        } else if (class205.field3287 == 1) {
            class121.field1972 = this.getCodeBase().getHost();
            class95.field1554 = class60.field991 + 50000;
            class78.field1253 = class60.field991 + 40000;
        } else if (class205.field3287 == 2) {
            class95.field1554 = class60.field991 + 50000;
            class121.field1972 = "127.0.0.1";
            class78.field1253 = class60.field991 + 40000;
        }
        class99.field1628 = class78.field1253;
        class271.field4276 = class95.field1554;
        class143.field2308 = class78.field1253;
        class43.field796 = class288.field4564 = class206.field3298 = class288.field4558 = new short[256];
        if (class165.field2609 == 3 && class205.field3287 != 2) {
            class4.field46 = class60.field991;
        }
        class245.field3922 = class143.field2308;
        class200.field3195 = class121.field1972;
        if (class111.field1837 == 1) {
            class222.field3688 = class112.field1848;
            class183.field2869 = true;
            class39.field734 = class277.field4358;
            class149.field2392 = class250.field3979;
            class280.field4437 = class139.field2277;
        } else {
            class39.field734 = class162.field2581;
            class280.field4437 = class81.field1275;
            class149.field2392 = class289.field4565;
            class222.field3688 = class112.field1869;
        }
        class281.method1893(74);
        class124.method891((byte) -11, class155.field2511);
        class157.method1099(class155.field2511, 5926);
        class146.field2347 = class39.method340((byte) -95);
        if (arg0 < 92) {
            return;
        }
        if (class146.field2347 != null) {
            class146.field2347.method1689(39, class155.field2511);
        }
        class155.field2498 = class165.field2609;
        try {
            if (class105.field1684.field2606 != null) {
                class194.field3104 = new class112(class105.field1684.field2606, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class111.field1841[var2] = new class112(class105.field1684.field2621[var2], 6000, 0);
                }
                class7.field79 = new class112(class105.field1684.field2608, 6000, 0);
                class123.field2004 = new class146(255, class194.field3104, class7.field79, 500000);
                class274.field4341 = new class112(class105.field1684.field2623, 24, 0);
                class105.field1684.field2606 = null;
                class105.field1684.field2621 = null;
                class105.field1684.field2608 = null;
                class105.field1684.field2623 = null;
            }
        } catch (IOException var3) {
            class7.field79 = null;
            class194.field3104 = null;
            class274.field4341 = null;
            class123.field2004 = null;
        }
        if (class205.field3287 != 0) {
            class282.field4473 = true;
        }
        class101.field1665 = class281.field4448;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLj;)V")
    private static final void method1083(byte arg0, class165 arg1) {
        class20.field342 = 3;
        class237 var2 = null;
        class205.method1417(true, -10681);
        class260.field4139 = true;
        class107.field1776 = true;
        class169.field2671 = true;
        class94.field1550 = 127;
        class236.field3851 = true;
        class22.field361 = true;
        class178.field2801 = 0;
        class79.field1269 = true;
        class284.field4480 = 255;
        class78.field1254 = true;
        class284.field4487 = true;
        class51.field893 = true;
        class4.field50 = 0;
        class281.field4459 = true;
        class252.field4018 = 0;
        if (arg0 <= 24) {
            return;
        }
        class97.field1575 = 2;
        class64.field1073 = 0;
        class229.field3785 = true;
        field2527++;
        class107.field1745 = 127;
        if (class4.field44 >= 96) {
            class130.method922(2);
        } else {
            class130.method922(0);
        }
        class235.field3836 = false;
        class100.field1649 = 0;
        class282.field4463 = 0;
        class278.field4370 = false;
        class22.field379 = true;
        class235.field3831 = 0;
        class231.field3808 = false;
        try {
            class163 var3 = arg1.method1136("runescape", (byte) -101);
            while (var3.field2589 == 0) {
                class43.method358(1L, false);
            }
            if (var3.field2589 == 1) {
                var2 = (class237) var3.field2594;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method1650(0)];
                while (var4 < var5.length) {
                    int var6 = var2.method1645(var4, 0, var5.length - var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class278.method1871(115, new class221(var5));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1646(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method1084(byte arg0) {
        if (!class231.field3808) {
            label233: while (true) {
                do {
                    if (!class263.method1790(16)) {
                        break label233;
                    }
                } while (class200.field3194 != 's' && class200.field3194 != 'S');
                class231.field3808 = true;
            }
        }
        field2525++;
        if (class270.field4251 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class276.method1861((byte) 122);
            if (class179.field2808 == 0L) {
                class179.field2808 = var4;
            }
            if (var3 > 16384 && (var4 - class179.field2808) < 5000L) {
                if ((var4 - class85.field1353) > 1000L) {
                    System.gc();
                    class85.field1353 = var4;
                }
                class263.field4186 = 5;
                class4.field51 = class247.field3933;
            } else {
                class4.field51 = class100.field1641;
                class270.field4251 = 10;
                class263.field4186 = 5;
            }
        } else if (class270.field4251 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class167.field2657[var6] = new class22(104, 104);
            }
            class4.field51 = class179.field2824;
            class263.field4186 = 10;
            class270.field4251 = 30;
        } else if (class270.field4251 == 30) {
            if (class266.field4219 == null) {
                class266.field4219 = new class186(class284.field4486, class216.field3531);
            }
            if (class266.field4219.method1269(false)) {
                class280.field4435 = class9.method73(true, (byte) -123, false, 0, true);
                class210.field3433 = class9.method73(true, (byte) -125, false, 1, true);
                class135.field2180 = class9.method73(true, (byte) -107, true, 2, false);
                class115.field1921 = class9.method73(true, (byte) -93, false, 3, true);
                class44.field806 = class9.method73(true, (byte) -87, false, 4, true);
                class122.field1982 = class9.method73(true, (byte) -112, true, 5, true);
                class168.field2665 = class9.method73(false, (byte) -93, true, 6, true);
                class95.field1556 = class9.method73(true, (byte) -115, false, 7, true);
                class222.field3687 = class9.method73(true, (byte) -89, false, 8, true);
                class51.field887 = class9.method73(true, (byte) -89, false, 9, true);
                class230.field3792 = class9.method73(true, (byte) -102, false, 10, true);
                class203.field3251 = class9.method73(true, (byte) -91, false, 11, true);
                class207.field3383 = class9.method73(true, (byte) -86, false, 12, true);
                class256.field4066 = class9.method73(true, (byte) -114, false, 13, true);
                class70.field1157 = class9.method73(false, (byte) -96, false, 14, true);
                class156.field2533 = class9.method73(true, (byte) -99, false, 15, true);
                class168.field2662 = class9.method73(true, (byte) -88, false, 16, true);
                class135.field2228 = class9.method73(true, (byte) -114, false, 17, true);
                class45.field818 = class9.method73(true, (byte) -104, false, 18, true);
                class127.field2054 = class9.method73(true, (byte) -117, false, 19, true);
                class173.field2723 = class9.method73(true, (byte) -90, false, 20, true);
                class262.field4166 = class9.method73(true, (byte) -98, false, 21, true);
                class57.field971 = class9.method73(true, (byte) -124, false, 22, true);
                class29.field462 = class9.method73(true, (byte) -89, true, 23, true);
                class95.field1565 = class9.method73(true, (byte) -107, false, 24, true);
                class87.field1388 = class9.method73(true, (byte) -92, false, 25, true);
                class284.field4481 = class9.method73(true, (byte) -120, true, 26, true);
                class92.field1520 = class9.method73(true, (byte) -85, false, 27, true);
                class270.field4251 = 40;
                class263.field4186 = 15;
                class4.field51 = class35.field546;
            } else {
                class4.field51 = class282.field4474;
                class263.field4186 = 12;
            }
        } else if (class270.field4251 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class247.field3931[var8].method1875((byte) -113) * class239.field3882[var8] / 100;
            }
            if (var7 == 100) {
                class4.field51 = class13.field236;
                class263.field4186 = 20;
                class72.method512(arg0 ^ 0x848, class222.field3687);
                class195.method1327(-108, class222.field3687);
                class168.method1158(0, class222.field3687);
                class270.field4251 = 45;
            } else {
                if (var7 != 0) {
                    class4.field51 = class193.field3099 + var7 + "%";
                }
                class263.field4186 = 20;
            }
        } else if (class270.field4251 == 45) {
            class1.method3(22050, (byte) -28, class260.field4139, 2);
            field2518 = new class89();
            field2518.method639(128, true, 9);
            class74.field1203 = class231.method1615(class155.field2511, class105.field1684, 0, 22050, -59);
            class74.field1203.method1194(field2518, arg0 ^ 0x48);
            class132.method929(class70.field1157, true, class156.field2533, field2518, class44.field806);
            class13.field243 = class231.method1615(class155.field2511, class105.field1684, 1, 2048, 117);
            class195.field3123 = new class249();
            class13.field243.method1194(class195.field3123, 0);
            class168.field2668 = new class220(22050, class99.field1621);
            class229.field3787 = class168.field2665.method1373(59, "scape main");
            class4.field51 = class206.field3297;
            class270.field4251 = 50;
            class263.field4186 = 30;
        } else if (class270.field4251 == 50) {
            int var9 = class106.method765(class222.field3687, arg0 - 105, class256.field4066);
            int var10 = class101.method741((byte) -93);
            if (var10 > var9) {
                class263.field4186 = 35;
                class4.field51 = class27.field430 + var9 * 100 / var10 + "%";
            } else {
                class263.field4186 = 35;
                class270.field4251 = 60;
                class4.field51 = class248.field3956;
            }
        } else if (class270.field4251 == 60) {
            int var11 = class56.method422(class222.field3687, (byte) -48);
            int var12 = class285.method1915(123);
            if (var12 > var11) {
                class263.field4186 = 40;
                class4.field51 = class83.field1304 + var11 * 100 / var12 + "%";
            } else {
                class263.field4186 = 40;
                class4.field51 = class118.field1942;
                class270.field4251 = 65;
            }
        } else if (class270.field4251 == 65) {
            class236.method1644(class256.field4066, class222.field3687, -16789);
            class263.field4186 = 45;
            class4.field51 = class220.field3595;
            class1.method5(5, -74);
            class270.field4251 = 70;
        } else if (class270.field4251 == 70) {
            class135.field2180.method1382((byte) 14);
            byte var13 = 0;
            int var14 = var13 + class135.field2180.method1385(-2492);
            class168.field2662.method1382((byte) 14);
            int var15 = var14 + class168.field2662.method1385(-2492);
            class135.field2228.method1382((byte) 14);
            int var16 = var15 + class135.field2228.method1385(-2492);
            class45.field818.method1382((byte) 14);
            int var17 = var16 + class45.field818.method1385(-2492);
            class127.field2054.method1382((byte) 14);
            int var18 = var17 + class127.field2054.method1385(-2492);
            class173.field2723.method1382((byte) 14);
            int var19 = var18 + class173.field2723.method1385(arg0 - 2564);
            class262.field4166.method1382((byte) 14);
            int var20 = var19 + class262.field4166.method1385(-2492);
            class57.field971.method1382((byte) 14);
            int var21 = var20 + class57.field971.method1385(-2492);
            class95.field1565.method1382((byte) 14);
            int var22 = var21 + class95.field1565.method1385(arg0 - 2564);
            class87.field1388.method1382((byte) 14);
            int var23 = var22 + class87.field1388.method1385(-2492);
            class92.field1520.method1382((byte) 14);
            int var24 = var23 + class92.field1520.method1385(arg0 - 2564);
            if (var24 < 1100) {
                class4.field51 = class141.field2281 + var24 / 11 + "%";
                class263.field4186 = 50;
            } else {
                class198.method1345(false, class135.field2180);
                class199.method1347((byte) -122, class135.field2180);
                class72.method511(class135.field2180, true);
                class154.method1075(arg0 ^ 0x1A, class95.field1556, class135.field2180);
                class178.method1212(class168.field2662, true, (byte) -119, class95.field1556);
                class274.method1854(class95.field1556, (byte) 45, class45.field818);
                class79.method551(class48.field865, class127.field2054, true, (byte) -128, class95.field1556);
                class50.method390(arg0 + 42, class135.field2180);
                class259.method1774(class173.field2723, class280.field4435, class210.field3433, (byte) -8);
                class60.method434(class135.field2180, (byte) -115);
                class224.method1578(class95.field1556, class262.field4166, -122);
                class158.method1106(true, class57.field971);
                class28.method241(16, class135.field2180);
                class193.method1317(class95.field1556, class256.field4066, 10734, class222.field3687, class115.field1921);
                class76.method529(false, class135.field2180);
                class86.method628(29387, class135.field2228);
                class102.method749((byte) -108, new class189(), class95.field1565, class87.field1388);
                class101.method744(class95.field1565, class87.field1388, 96);
                class167.method1150(class135.field2180, -114);
                class273.method1843(class135.field2180, 18781, class222.field3687);
                class157.method1101(class222.field3687, (byte) 122, class135.field2180);
                class263.field4186 = 50;
                class4.field51 = class33.field535;
                class71.method509(25);
                class270.field4251 = 80;
            }
        } else if (class270.field4251 == 80) {
            int var25 = class189.method1289(-10097, class222.field3687);
            int var26 = class203.method1395(false);
            if (var26 > var25) {
                class4.field51 = class50.field885 + var25 * 100 / var26 + "%";
                class263.field4186 = 60;
            } else {
                class83.method597(class222.field3687, arg0 ^ 0xFFFFFFD4);
                class4.field51 = class73.field1190;
                class263.field4186 = 60;
                class270.field4251 = 90;
            }
        } else if (class270.field4251 == 90) {
            if (class284.field4481.method1382((byte) 14)) {
                class273 var27 = new class273(class51.field887, class284.field4481, class222.field3687, 20, !class284.field4487);
                class69.method489(var27);
                if (class20.field342 == 1) {
                    class69.method487(0.9F);
                }
                if (class20.field342 == 2) {
                    class69.method487(0.8F);
                }
                if (class20.field342 == 3) {
                    class69.method487(0.7F);
                }
                if (class20.field342 == 4) {
                    class69.method487(0.6F);
                }
                class270.field4251 = 100;
                class4.field51 = class282.field4467;
                class263.field4186 = 70;
            } else {
                class4.field51 = class78.field1256 + class284.field4481.method1385(-2492) + "%";
                class263.field4186 = 70;
            }
        } else if (class270.field4251 == 100) {
            if (class174.method1187(class222.field3687, (byte) -125)) {
                class270.field4251 = 110;
            }
        } else if (class270.field4251 == 110) {
            class68.field1135 = new class138();
            class105.field1684.method1133(10, class68.field1135, (byte) 113);
            class263.field4186 = 75;
            class4.field51 = class63.field1033;
            class270.field4251 = 120;
        } else if (class270.field4251 != 120) {
            if (arg0 != 72) {
                this.method1087(117, 20);
            }
            if (class270.field4251 == 130) {
                if (!class115.field1921.method1382((byte) 14)) {
                    class4.field51 = class85.field1347 + class115.field1921.method1385(-2492) * 3 / 4 + "%";
                    class263.field4186 = 85;
                } else if (!class207.field3383.method1382((byte) 14)) {
                    class4.field51 = class85.field1347 + ((class207.field3383.method1385(-2492) / 10) + 75) + "%";
                    class263.field4186 = 85;
                } else if (!class256.field4066.method1382((byte) 14)) {
                    class4.field51 = class85.field1347 + (class256.field4066.method1385(arg0 - 2564) / 20 + 85) + "%";
                    class263.field4186 = 85;
                } else if (class29.field462.method1356("details", (byte) 106)) {
                    class66.method465(class190.field3080, class29.field462, false);
                    class263.field4186 = 95;
                    class4.field51 = class14.field247;
                    class270.field4251 = 135;
                } else {
                    class4.field51 = class85.field1347 + (class29.field462.method1363((byte) -90, "details") / 10 + 90) + "%";
                    class263.field4186 = 85;
                }
            } else if (class270.field4251 == 135) {
                int var29 = class92.method692((byte) 114);
                if (var29 == -1) {
                    class4.field51 = class73.field1198;
                    class263.field4186 = 95;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1251(false, "worldlistfull");
                    class1.method5(1000, arg0 ^ 0x35);
                } else if (class142.field2301) {
                    class263.field4186 = 96;
                    class4.field51 = class122.field1977;
                    class270.field4251 = 140;
                } else {
                    this.method1251(false, "worldlistio_" + var29);
                    class1.method5(1000, -18);
                }
            } else if (class270.field4251 == 140) {
                class119.field1946 = class115.field1921.method1373(arg0 ^ 0x13, "loginscreen");
                class122.field1982.method1374(false, true, -61);
                class168.field2665.method1374(true, true, 120);
                class222.field3687.method1374(true, true, -68);
                class256.field4066.method1374(true, true, -45);
                class230.field3792.method1374(true, true, -98);
                class115.field1921.method1374(true, true, arg0 + 50);
                class4.field51 = class212.field3472;
                class270.field4251 = 150;
                class16.field263 = true;
                class263.field4186 = 97;
            } else if (class270.field4251 == 150) {
                if (class231.field3808) {
                    class100.field1649 = 0;
                    class64.field1073 = 0;
                    class252.field4018 = 0;
                    class282.field4463 = 0;
                }
                class231.field3808 = true;
                class257.method1755(class105.field1684, false);
                class285.method1917(-1, class282.field4463, -1, -1, false);
                class263.field4186 = 100;
                class270.field4251 = 160;
                class4.field51 = class49.field869;
            } else if (class270.field4251 == 160) {
                class17.method133(true, arg0 - 70);
            }
        } else if (class230.field3792.method1359("", "huffman", (byte) -101)) {
            class67 var28 = new class67(class230.field3792.method1376("huffman", (byte) 44, ""));
            class183.method1243(122, var28);
            class263.field4186 = 80;
            class270.field4251 = 130;
            class4.field51 = class99.field1639;
        } else {
            class263.field4186 = 80;
            class4.field51 = class105.field1685 + "0%";
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1085(int arg0) {
        field2522++;
        if (class273.field4336 == 1000) {
            return;
        }
        class222.field3682++;
        if ((class222.field3682 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class89.field1441 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class198.field3162.setSeed((long) class89.field1441);
        }
        this.method1091((byte) -8);
        if (class266.field4219 != null) {
            class266.field4219.method1267(-70);
        }
        class54.method406(116);
        class254.method1730(-92);
        class55.method410(-23014);
        class13.method107(117);
        if (class146.field2347 != null) {
            int var3 = class146.field2347.method1688(-2);
            class66.field1096 = var3;
        }
        if (class273.field4336 == 0) {
            this.method1084((byte) 72);
            class235.method1636((byte) 86);
        } else if (class273.field4336 == 5) {
            this.method1084((byte) 72);
            class235.method1636((byte) 91);
        } else if (class273.field4336 == 25 || class273.field4336 == 28) {
            class87.method631(16882);
        }
        if (arg0 < 66) {
            field2523 = true;
        }
        if (class273.field4336 == 10) {
            this.method1086((byte) 49);
            class164.method1129((byte) 118);
            class134.method940((byte) 35);
            class7.method50(1);
        } else if (class273.field4336 == 30) {
            class185.method1255(-101);
        } else if (class273.field4336 == 40) {
            class7.method50(1);
            if (class33.field515 != -3) {
                if (class33.field515 == 15) {
                    class143.method986(32);
                } else if (class33.field515 != 2) {
                    class72.method514(104);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method1086(byte arg0) {
        if (arg0 != 49) {
            method1083((byte) 30, (class165) null);
        }
        field2531++;
        for (class225.field3732 = 0; class263.method1790(16) && class225.field3732 < 128; class225.field3732++) {
            class52.field911[class225.field3732] = class203.field3257;
            class135.field2229[class225.field3732] = class200.field3194;
        }
        class287.field4533++;
        if (class157.field2548 != -1) {
            class206.method1424(arg0 ^ 0xFFFFFFCE, class84.field1326, 0, class157.field2548, 0, 0, 0, class279.field4423);
        }
        class66.field1094++;
        class183.method1239((byte) 81);
        while (true) {
            class213 var2;
            class36 var3;
            class36 var4;
            do {
                var2 = (class213) class50.field886.method845((byte) -16);
                if (var2 == null) {
                    while (true) {
                        class213 var5;
                        class36 var6;
                        class36 var7;
                        do {
                            var5 = (class213) class286.field4520.method845((byte) -21);
                            if (var5 == null) {
                                while (true) {
                                    class213 var8;
                                    class36 var9;
                                    class36 var10;
                                    do {
                                        var8 = (class213) class182.field2860.method845((byte) 88);
                                        if (var8 == null) {
                                            if (field2517 != null) {
                                                class184.method1247((byte) 110);
                                            }
                                            if (class5.field68 != null && class5.field68.field2589 == 1) {
                                                if (class5.field68.field2594 != null) {
                                                    class287.method1930(class155.field2510, (byte) 93, class110.field1807);
                                                }
                                                class155.field2510 = null;
                                                class5.field68 = null;
                                                class110.field1807 = false;
                                            }
                                            if ((class222.field3682 % 1500) == 0) {
                                                class77.method542(true);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field3480;
                                        if (var9.field661 < 0) {
                                            break;
                                        }
                                        var10 = class64.method455(var9.field632, arg0 ^ 0x234FB8A1);
                                    } while (var10 == null || var10.field658 == null || var9.field661 >= var10.field658.length || var10.field658[var9.field661] != var9);
                                    class89.method645(-89, var8);
                                }
                            }
                            var6 = var5.field3480;
                            if (var6.field661 < 0) {
                                break;
                            }
                            var7 = class64.method455(var6.field632, 592427152);
                        } while (var7 == null || var7.field658 == null || var6.field661 >= var7.field658.length || var7.field658[var6.field661] != var6);
                        class89.method645(-93, var5);
                    }
                }
                var3 = var2.field3480;
                if (var3.field661 < 0) {
                    break;
                }
                var4 = class64.method455(var3.field632, 592427152);
            } while (var4 == null || var4.field658 == null || var4.field658.length <= var3.field661 || var4.field658[var3.field661] != var3);
            class89.method645(arg0 ^ 0xFFFFFF96, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1087(int arg0, int arg1) {
        class284.field4486.field4092++;
        class47.field846 = null;
        class195.field3116 = 0;
        class215.field3513 = null;
        class284.field4486.field4090 = arg1;
        field2520++;
        if (arg0 != -15818) {
            this.method1082((byte) 124);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lf;)Lf;")
    public static final class36 method1088(class36 arg0) {
        int var1 = method1093(arg0).method601(3);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class64.method455(arg0.field632, 592427152);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lf;)Z")
    public static final boolean method1089(class36 arg0) {
        if (class103.field1675) {
            if (method1093(arg0).field1313 != 0) {
                return false;
            }
            if (arg0.field709 == 0) {
                return false;
            }
        }
        return arg0.field667;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1090(boolean arg0) {
        if (class68.field1135 != null) {
            class68.field1135.field2265 = false;
        }
        class68.field1135 = null;
        if (!arg0) {
            field2518 = null;
        }
        if (class5.field69 != null) {
            class5.field69.method7((byte) 18);
            class5.field69 = null;
        }
        class118.method867(class155.field2511, 106);
        field2524++;
        class123.method887(61, class155.field2511);
        if (class146.field2347 != null) {
            class146.field2347.method1690(class155.field2511, (byte) 93);
        }
        class197.method1336(arg0);
        class32.method275((byte) -56);
        class146.field2347 = null;
        if (class74.field1203 != null) {
            class74.field1203.method1196(1);
        }
        if (class13.field243 != null) {
            class13.field243.method1196(1);
        }
        class284.field4486.method1741(-101);
        class216.field3531.method1732((byte) -47);
        try {
            if (class194.field3104 != null) {
                class194.field3104.method823((byte) 117);
            }
            if (class111.field1841 != null) {
                for (int var2 = 0; var2 < class111.field1841.length; var2++) {
                    if (class111.field1841[var2] != null) {
                        class111.field1841[var2].method823((byte) 102);
                    }
                }
            }
            if (class7.field79 != null) {
                class7.field79.method823((byte) 108);
            }
            if (class274.field4341 != null) {
                class274.field4341.method823((byte) 109);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method1091(byte arg0) {
        field2519++;
        boolean var2 = class284.field4486.method1742((byte) 105);
        if (!var2) {
            this.method1080(-4914);
        }
        int var3 = 104 % ((arg0 - 46) / 52);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method1092(int arg0) {
        if (arg0 >= -31) {
            main((String[]) null);
        }
        field2518 = null;
        field2517 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lf;)Llc;")
    public static final class84 method1093(class36 arg0) {
        class84 var1 = (class84) class271.field4274.method1400(((long) arg0.field648 << 32) + (long) arg0.field661, true);
        return var1 == null ? arg0.field634 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method1094(boolean arg0) {
        field2530++;
        if (class273.field4336 == 1000) {
            return;
        }
        boolean var2 = class68.method475((byte) 12);
        if (var2 && class98.field1601 && class74.field1203 != null) {
            class74.field1203.method1195((byte) -41);
        }
        if ((class273.field4336 == 30 || class273.field4336 == 10) && (class36.field715 || class1.field13 != 0L && class1.field13 < class276.method1861((byte) 122))) {
            class285.method1917(-1, class259.method1764(0), class178.field2801, class4.field50, class36.field715);
        }
        if (class77.field1234 == null) {
            Container var3;
            if (class77.field1234 != null) {
                var3 = class77.field1234;
            } else if (class110.field1811 == null) {
                var3 = class105.field1684.field2620;
            } else {
                var3 = class110.field1811;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class110.field1811 == var3) {
                Insets var6 = class110.field1811.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class255.field4048 != var4 || class258.field4099 != var5) {
                if (class165.field2624.startsWith("mac")) {
                    class258.field4099 = var5;
                    class255.field4048 = var4;
                } else {
                    class213.method1465(false);
                }
                class1.field13 = class276.method1861((byte) 122) + 500L;
            }
        }
        boolean var7 = false;
        if (class245.field3923) {
            class245.field3923 = false;
            var7 = true;
        }
        if (var7) {
            class196.method1334(-1);
        }
        if (!arg0) {
            field2521 = -5;
        }
        if (class273.field4336 == 0) {
            class117.method860(-11506, (Color) null, class263.field4186, class4.field51, var7);
        } else if (class273.field4336 == 5) {
            class213.method1467(false, 0, class262.field4165);
        } else if (class273.field4336 == 10) {
            class286.method1921(-128);
        } else if (class273.field4336 == 25 || class273.field4336 == 28) {
            if (class216.field3538 == 1) {
                if (class164.field2597 > class11.field156) {
                    class11.field156 = class164.field2597;
                }
                int var9 = (class11.field156 - class164.field2597) * 50 / class11.field156;
                class148.method1016(-31620, class1.field30 + "<br>(" + var9 + "%)", false);
            } else if (class216.field3538 == 2) {
                if (class33.field521 < class205.field3283) {
                    class33.field521 = class205.field3283;
                }
                int var8 = (class33.field521 - class205.field3283) * 50 / class33.field521 + 50;
                class148.method1016(-31620, class1.field30 + "<br>(" + var8 + "%)", false);
            } else {
                class148.method1016(-31620, class1.field30, false);
            }
        } else if (class273.field4336 == 30) {
            class250.method1712(25659);
        } else if (class273.field4336 == 40) {
            class148.method1016(-31620, class248.field3963 + "<br>" + class264.field4212, false);
        }
        if ((class273.field4336 == 30 || class273.field4336 == 10) && class173.field2727 == 0 && !var7) {
            try {
                Graphics var10 = class155.field2511.getGraphics();
                for (int var11 = 0; var11 < class98.field1615; var11++) {
                    if (class223.field3698[var11]) {
                        class79.field1263.method337(100, var10, class124.field2006[var11], class158.field2550[var11], class142.field2295[var11], class98.field1616[var11]);
                        class223.field3698[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class155.field2511.repaint();
            }
        } else if (class273.field4336 != 0) {
            try {
                Graphics var12 = class155.field2511.getGraphics();
                class79.field1263.method338(var12, -15816, 0, 0);
                for (int var13 = 0; var13 < class98.field1615; var13++) {
                    class223.field3698[var13] = false;
                }
            } catch (Exception var14) {
                class155.field2511.repaint();
            }
        }
        if (class16.field263) {
            class194.method1323(5);
        }
        if (class231.field3808 && class273.field4336 == 10 && class157.field2548 != -1) {
            class231.field3808 = false;
            class257.method1755(class105.field1684, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lf;IIIIIII)V")
    public static final void method1095(class36[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class36 var9 = arg0[var8];
            if (var9 != null && var9.field632 == arg1 && (!var9.field597 || var9.field709 == 0 || var9.field626 || method1093(var9).field1313 != 0 || class173.field2725 == var9 || var9.field570 == 1338) && (!var9.field597 || !method1089(var9))) {
                int var10 = var9.field606 + arg6;
                int var11 = var9.field607 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field709 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field642 + var10;
                    int var17 = var9.field676 + var11;
                    if (var9.field709 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (field2517 == var9) {
                    class109.field1805 = true;
                    class96.field1566 = var10;
                    class161.field2563 = var11;
                }
                if (!var9.field597 || var12 < var14 && var13 < var15) {
                    if (var9.field709 == 0) {
                        if (!var9.field597 && method1089(var9) && class135.field2168 != var9) {
                            continue;
                        }
                        if (var9.field717 && class241.field3898 >= var12 && class109.field1801 >= var13 && class241.field3898 < var14 && class109.field1801 < var15) {
                            for (class213 var18 = (class213) class182.field2860.method843(102); var18 != null; var18 = (class213) class182.field2860.method852((byte) 123)) {
                                if (var18.field3484) {
                                    var18.method1388(29);
                                    var18.field3480.field684 = false;
                                }
                            }
                            if (class239.field3877 == 0) {
                                field2517 = null;
                                class173.field2725 = null;
                            }
                            class167.field2658 = 0;
                        }
                    }
                    if (var9.field597) {
                        boolean var19;
                        if (class241.field3898 >= var12 && class109.field1801 >= var13 && class241.field3898 < var14 && class109.field1801 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class270.field4259 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class115.field1920 == 1 && class248.field3953 >= var12 && class235.field3829 >= var13 && class248.field3953 < var14 && class235.field3829 < var15) {
                            var21 = true;
                        }
                        if (var9.field633 != null) {
                            for (int var22 = 0; var22 < var9.field633.length; var22++) {
                                if (class73.field1193[var9.field633[var22]]) {
                                    if (var9.field576 == null || class222.field3682 >= var9.field576[var22]) {
                                        byte var23 = var9.field628[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class73.field1193[86]) && ((var23 & 0x1) == 0 || class73.field1193[82]) && ((var23 & 0x4) == 0 || class73.field1193[81])) {
                                            class25.method226(-1, var22 + 1, false, "", var9.field648);
                                            int var24 = var9.field575[var22];
                                            if (var9.field576 == null) {
                                                var9.field576 = new int[var9.field633.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field576[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field576[var22] = class222.field3682 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field576 != null) {
                                    var9.field576[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class47.method381(class235.field3829 - var11, var9, class248.field3953 - var10, (byte) 18);
                        }
                        if (field2517 != null && field2517 != var9 && var19 && method1093(var9).method599(29046)) {
                            class108.field1787 = var9;
                        }
                        if (class173.field2725 == var9) {
                            field2523 = true;
                            class110.field1815 = var10;
                            class78.field1258 = var11;
                        }
                        if (var9.field626 || var9.field570 != 0) {
                            if (var19 && class66.field1096 != 0 && var9.field616 != null) {
                                class213 var25 = new class213();
                                var25.field3484 = true;
                                var25.field3480 = var9;
                                var25.field3487 = class66.field1096;
                                var25.field3477 = var9.field616;
                                class182.field2860.method855(false, var25);
                            }
                            if (field2517 != null || class274.field4345 != null || class199.field3181 || var9.field570 != 1400 && class167.field2658 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field570 != 0) {
                                if (var9.field570 == 1337) {
                                    class277.field4360 = var9;
                                    class280.method1886(var9, 32);
                                    continue;
                                }
                                if (var9.field570 == 1338) {
                                    if (var21) {
                                        class245.field3926 = class248.field3953 - var10;
                                        class68.field1131 = class235.field3829 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field570 == 1400) {
                                    class286.field4525 = var9;
                                    if (var21) {
                                        if (class73.field1193[82] && class144.field2313 > 0) {
                                            int var26 = (int) ((double) (class248.field3953 - var10 - var9.field642 / 2) * 2.0D / (double) class221.field3668);
                                            int var27 = (int) ((double) (class235.field3829 - var11 - var9.field676 / 2) * 2.0D / (double) class221.field3668);
                                            int var28 = class28.field448 + var26;
                                            int var29 = class126.field2046 + var27;
                                            int var30 = class161.field2568 + var28;
                                            int var31 = class210.field3428 + class223.field3692 - var29 - 1;
                                            class241.method1666(var31, 0, var30, -2358);
                                            class273.method1845((byte) -111);
                                            continue;
                                        }
                                        class167.field2658 = 1;
                                        class241.field3900 = class241.field3898;
                                        class107.field1711 = class109.field1801;
                                        continue;
                                    }
                                    if (var20 && class167.field2658 > 0) {
                                        if (class167.field2658 == 1 && (class241.field3900 != class241.field3898 || class109.field1801 != class107.field1711)) {
                                            class221.field3615 = class28.field448;
                                            class35.field545 = class126.field2046;
                                            class167.field2658 = 2;
                                        }
                                        if (class167.field2658 == 2) {
                                            class186.method1266((byte) -118, (int) ((double) (class241.field3900 - class241.field3898) * 2.0D / (double) class28.field445) + class221.field3615);
                                            class277.method1868(-65536, (int) ((double) (class107.field1711 - class109.field1801) * 2.0D / (double) class28.field445) + class35.field545);
                                        }
                                        continue;
                                    }
                                    class167.field2658 = 0;
                                    continue;
                                }
                                if (var9.field570 == 1401) {
                                    if (var20) {
                                        class113.method834(29419, var9.field642, var9.field676, class241.field3898 - var10, class109.field1801 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field570 == 1402) {
                                    class280.method1886(var9, 32);
                                    continue;
                                }
                            }
                            if (!var9.field692 && var21) {
                                var9.field692 = true;
                                if (var9.field697 != null) {
                                    class213 var32 = new class213();
                                    var32.field3484 = true;
                                    var32.field3480 = var9;
                                    var32.field3491 = class248.field3953 - var10;
                                    var32.field3487 = class235.field3829 - var11;
                                    var32.field3477 = var9.field697;
                                    class182.field2860.method855(false, var32);
                                }
                            }
                            if (var9.field692 && var20 && var9.field581 != null) {
                                class213 var33 = new class213();
                                var33.field3484 = true;
                                var33.field3480 = var9;
                                var33.field3491 = class241.field3898 - var10;
                                var33.field3487 = class109.field1801 - var11;
                                var33.field3477 = var9.field581;
                                class182.field2860.method855(false, var33);
                            }
                            if (var9.field692 && !var20) {
                                var9.field692 = false;
                                if (var9.field687 != null) {
                                    class213 var34 = new class213();
                                    var34.field3484 = true;
                                    var34.field3480 = var9;
                                    var34.field3491 = class241.field3898 - var10;
                                    var34.field3487 = class109.field1801 - var11;
                                    var34.field3477 = var9.field687;
                                    class286.field4520.method855(false, var34);
                                }
                            }
                            if (var20 && var9.field701 != null) {
                                class213 var35 = new class213();
                                var35.field3484 = true;
                                var35.field3480 = var9;
                                var35.field3491 = class241.field3898 - var10;
                                var35.field3487 = class109.field1801 - var11;
                                var35.field3477 = var9.field701;
                                class182.field2860.method855(false, var35);
                            }
                            if (!var9.field684 && var19) {
                                var9.field684 = true;
                                if (var9.field665 != null) {
                                    class213 var36 = new class213();
                                    var36.field3484 = true;
                                    var36.field3480 = var9;
                                    var36.field3491 = class241.field3898 - var10;
                                    var36.field3487 = class109.field1801 - var11;
                                    var36.field3477 = var9.field665;
                                    class182.field2860.method855(false, var36);
                                }
                            }
                            if (var9.field684 && var19 && var9.field716 != null) {
                                class213 var37 = new class213();
                                var37.field3484 = true;
                                var37.field3480 = var9;
                                var37.field3491 = class241.field3898 - var10;
                                var37.field3487 = class109.field1801 - var11;
                                var37.field3477 = var9.field716;
                                class182.field2860.method855(false, var37);
                            }
                            if (var9.field684 && !var19) {
                                var9.field684 = false;
                                if (var9.field643 != null) {
                                    class213 var38 = new class213();
                                    var38.field3484 = true;
                                    var38.field3480 = var9;
                                    var38.field3491 = class241.field3898 - var10;
                                    var38.field3487 = class109.field1801 - var11;
                                    var38.field3477 = var9.field643;
                                    class286.field4520.method855(false, var38);
                                }
                            }
                            if (var9.field675 != null) {
                                class213 var39 = new class213();
                                var39.field3480 = var9;
                                var39.field3477 = var9.field675;
                                class50.field886.method855(false, var39);
                            }
                            if (var9.field562 != null && class204.field3265 > var9.field669) {
                                if (var9.field622 == null || class204.field3265 - var9.field669 > 32) {
                                    class213 var44 = new class213();
                                    var44.field3480 = var9;
                                    var44.field3477 = var9.field562;
                                    class182.field2860.method855(false, var44);
                                } else {
                                    label565: for (int var40 = var9.field669; var40 < class204.field3265; var40++) {
                                        int var41 = class135.field2230[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field622.length; var42++) {
                                            if (var9.field622[var42] == var41) {
                                                class213 var43 = new class213();
                                                var43.field3480 = var9;
                                                var43.field3477 = var9.field562;
                                                class182.field2860.method855(false, var43);
                                                break label565;
                                            }
                                        }
                                    }
                                }
                                var9.field669 = class204.field3265;
                            }
                            if (var9.field713 != null && class239.field3881 > var9.field589) {
                                if (var9.field629 == null || class239.field3881 - var9.field589 > 32) {
                                    class213 var49 = new class213();
                                    var49.field3480 = var9;
                                    var49.field3477 = var9.field713;
                                    class182.field2860.method855(false, var49);
                                } else {
                                    label541: for (int var45 = var9.field589; var45 < class239.field3881; var45++) {
                                        int var46 = class161.field2559[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field629.length; var47++) {
                                            if (var9.field629[var47] == var46) {
                                                class213 var48 = new class213();
                                                var48.field3480 = var9;
                                                var48.field3477 = var9.field713;
                                                class182.field2860.method855(false, var48);
                                                break label541;
                                            }
                                        }
                                    }
                                }
                                var9.field589 = class239.field3881;
                            }
                            if (var9.field646 != null && class176.field2785 > var9.field698) {
                                if (var9.field677 == null || class176.field2785 - var9.field698 > 32) {
                                    class213 var54 = new class213();
                                    var54.field3480 = var9;
                                    var54.field3477 = var9.field646;
                                    class182.field2860.method855(false, var54);
                                } else {
                                    label517: for (int var50 = var9.field698; var50 < class176.field2785; var50++) {
                                        int var51 = class85.field1356[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field677.length; var52++) {
                                            if (var9.field677[var52] == var51) {
                                                class213 var53 = new class213();
                                                var53.field3480 = var9;
                                                var53.field3477 = var9.field646;
                                                class182.field2860.method855(false, var53);
                                                break label517;
                                            }
                                        }
                                    }
                                }
                                var9.field698 = class176.field2785;
                            }
                            if (var9.field582 != null && class90.field1485 > var9.field579) {
                                if (var9.field696 == null || class90.field1485 - var9.field579 > 32) {
                                    class213 var59 = new class213();
                                    var59.field3480 = var9;
                                    var59.field3477 = var9.field582;
                                    class182.field2860.method855(false, var59);
                                } else {
                                    label493: for (int var55 = var9.field579; var55 < class90.field1485; var55++) {
                                        int var56 = class277.field4359[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field696.length; var57++) {
                                            if (var9.field696[var57] == var56) {
                                                class213 var58 = new class213();
                                                var58.field3480 = var9;
                                                var58.field3477 = var9.field582;
                                                class182.field2860.method855(false, var58);
                                                break label493;
                                            }
                                        }
                                    }
                                }
                                var9.field579 = class90.field1485;
                            }
                            if (var9.field623 != null && class148.field2359 > var9.field599) {
                                if (var9.field680 == null || class148.field2359 - var9.field599 > 32) {
                                    class213 var64 = new class213();
                                    var64.field3480 = var9;
                                    var64.field3477 = var9.field623;
                                    class182.field2860.method855(false, var64);
                                } else {
                                    label469: for (int var60 = var9.field599; var60 < class148.field2359; var60++) {
                                        int var61 = class270.field4253[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field680.length; var62++) {
                                            if (var9.field680[var62] == var61) {
                                                class213 var63 = new class213();
                                                var63.field3480 = var9;
                                                var63.field3477 = var9.field623;
                                                class182.field2860.method855(false, var63);
                                                break label469;
                                            }
                                        }
                                    }
                                }
                                var9.field599 = class148.field2359;
                            }
                            if (class220.field3606 > var9.field584 && var9.field577 != null) {
                                class213 var65 = new class213();
                                var65.field3480 = var9;
                                var65.field3477 = var9.field577;
                                class182.field2860.method855(false, var65);
                            }
                            if (class99.field1633 > var9.field584 && var9.field615 != null) {
                                class213 var66 = new class213();
                                var66.field3480 = var9;
                                var66.field3477 = var9.field615;
                                class182.field2860.method855(false, var66);
                            }
                            if (class112.field1847 > var9.field584 && var9.field627 != null) {
                                class213 var67 = new class213();
                                var67.field3480 = var9;
                                var67.field3477 = var9.field627;
                                class182.field2860.method855(false, var67);
                            }
                            if (class39.field725 > var9.field584 && var9.field614 != null) {
                                class213 var68 = new class213();
                                var68.field3480 = var9;
                                var68.field3477 = var9.field614;
                                class182.field2860.method855(false, var68);
                            }
                            if (class169.field2687 > var9.field584 && var9.field624 != null) {
                                class213 var69 = new class213();
                                var69.field3480 = var9;
                                var69.field3477 = var9.field624;
                                class182.field2860.method855(false, var69);
                            }
                            var9.field584 = class66.field1094;
                            if (var9.field618 != null) {
                                for (int var70 = 0; var70 < class225.field3732; var70++) {
                                    class213 var71 = new class213();
                                    var71.field3480 = var9;
                                    var71.field3479 = class52.field911[var70];
                                    var71.field3483 = class135.field2229[var70];
                                    var71.field3477 = var9.field618;
                                    class182.field2860.method855(false, var71);
                                }
                            }
                            if (class94.field1542 && var9.field554 != null) {
                                class213 var72 = new class213();
                                var72.field3480 = var9;
                                var72.field3477 = var9.field554;
                                class182.field2860.method855(false, var72);
                            }
                        }
                    }
                    if (!var9.field597 && field2517 == null && class274.field4345 == null && !class199.field3181) {
                        if ((var9.field586 >= 0 || var9.field700 != 0) && class241.field3898 >= var12 && class109.field1801 >= var13 && class241.field3898 < var14 && class109.field1801 < var15) {
                            if (var9.field586 >= 0) {
                                class135.field2168 = arg0[var9.field586];
                            } else {
                                class135.field2168 = var9;
                            }
                        }
                        if (var9.field709 == 8 && class241.field3898 >= var12 && class109.field1801 >= var13 && class241.field3898 < var14 && class109.field1801 < var15) {
                            class285.field4503 = var9;
                        }
                        if (var9.field602 > var9.field676) {
                            class98.method724(class241.field3898, var9.field676, var9.field642 + var10, class109.field1801, var9, var9.field602, var11, 8);
                        }
                    }
                    if (var9.field709 == 0) {
                        method1095(arg0, var9.field648, var12, var13, var14, var15, var10 - var9.field630, var11 - var9.field571);
                        if (var9.field658 != null) {
                            method1095(var9.field658, var9.field648, var12, var13, var14, var15, var10 - var9.field630, var11 - var9.field571);
                        }
                        class258 var73 = (class258) class128.field2062.method1400((long) var9.field648, true);
                        if (var73 != null) {
                            class206.method1424(-1, var14, var10, var73.field4100, var11, var12, var13, var15);
                        }
                    }
                }
            }
        }
    }
}
