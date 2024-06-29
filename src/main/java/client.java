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
public class client extends class315 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lqd;")
    public static class40 field4040 = class147.method1106("Lade Wordpack )2 ", (byte) -64);

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lqd;")
    public static class40 field4048 = class147.method1106("<col=ffb000>", (byte) -109);

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lqd;")
    public static class40 field4049 = class147.method1106(":chalreq:", (byte) -126);

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lqd;")
    public static class40 field4047 = class147.method1106("<col=00ffff>", (byte) -122);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lqd;")
    public static class40 field4050 = class147.method1106(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) -123);

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field4051 = true;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lqd;")
    public static class40 field4042 = class147.method1106("Null", (byte) -82);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    public static boolean field4064 = false;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "[B")
    public static byte[] field4063 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lqd;")
    private static class40 field4066 = class147.method1106("scape main", (byte) -82);

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lce;")
    public static class239 field4057;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
    public static boolean field4067;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "[Lda;")
    public static class114[] field4061;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 29)
    private final void method1717(int arg0, int arg1) {
        if (arg1 <= 63) {
            field4050 = (class40) null;
        }
        class58.field1113 = null;
        class255.field4236 = 0;
        class134.field2265 = null;
        field4056++;
        class123.field2139.field5112 = arg0;
        class123.field2139.field5113++;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 63)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class312.method2154(1, "argument count");
            }
            int var1 = -1;
            class228.field3769 = Integer.parseInt(arg0[0]);
            class188.field3049 = 2;
            if (arg0[1].equals("live")) {
                class202.field3204 = 0;
            } else if (arg0[1].equals("rc")) {
                class202.field3204 = 1;
            } else if (arg0[1].equals("wip")) {
                class202.field3204 = 2;
            } else {
                class312.method2154(1, "modewhat");
            }
            class10.field161 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class108.method821(class34.method298(var2, -22277, var2.length, 0), (byte) 96);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class248.field4106 = var1;
            } else if (arg0[2].equals("english")) {
                class248.field4106 = 0;
            } else if (arg0[2].equals("german")) {
                class248.field4106 = 1;
            } else {
                class312.method2154(1, "language");
            }
            class58.method485((byte) -127, class248.field4106);
            class301.field5052 = false;
            class315.field5319 = false;
            if (arg0[3].equals("game0")) {
                class249.field4110 = 0;
            } else if (arg0[3].equals("game1")) {
                class249.field4110 = 1;
            } else {
                class312.method2154(1, "game");
            }
            class6.field80 = 0;
            class177.field2914 = false;
            class162.field2691 = 0;
            class46.field895 = class264.field4421;
            client var4 = new client();
            class312.field5265 = var4;
            var4.method2182(1024, "runescape", 521, class202.field3204 + 32, 768, false, 27);
            class106.field1867.setLocation(40, 40);
        } catch (Exception var7) {
            class44.method412(var7, -14997, (String) null);
        }
        field4058++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 138)
    public final void init() {
        field4053++;
        if (!this.method2180((byte) 96)) {
            return;
        }
        class228.field3769 = Integer.parseInt(this.getParameter("worldid"));
        class188.field3049 = Integer.parseInt(this.getParameter("modewhere"));
        if (class188.field3049 < 0 || class188.field3049 > 1) {
            class188.field3049 = 0;
        }
        class202.field3204 = Integer.parseInt(this.getParameter("modewhat"));
        if (class202.field3204 < 0 || class202.field3204 > 2) {
            class202.field3204 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class10.field161 = true;
        } else {
            class10.field161 = false;
        }
        try {
            class248.field4106 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class248.field4106 = 0;
        }
        class58.method485((byte) -125, class248.field4106);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class301.field5052 = true;
        } else {
            class301.field5052 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class315.field5319 = true;
        } else {
            class315.field5319 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class249.field4110 = 1;
        } else {
            class249.field4110 = 0;
        }
        try {
            class162.field2691 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class162.field2691 = 0;
        }
        class46.field895 = class46.field896.method374(-75, this);
        if (class46.field895 == null) {
            class46.field895 = class264.field4421;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class6.field80 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class6.field80 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class177.field2914 = true;
        } else {
            class177.field2914 = false;
        }
        class312.field5265 = this;
        this.method2176(765, 0, class202.field3204 + 32, 503, 521);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 221)
    public final void method1718(byte arg0) {
        method1723(2919);
        class40.method361(0);
        field4046++;
        class153.method1194(true);
        class208.method1471(-6);
        class313.method2162((byte) 6);
        class315.method2187(-89);
        class21.method139();
        class289.method1996(3);
        class135.method1000(-2986);
        class159.method1221(-16949);
        class189.method1361((byte) 120);
        class104.method788((byte) 75);
        class304.method2074((byte) -85);
        class225.method1579(true);
        class223.method1565(13782);
        class87.method678((byte) 117);
        class239.method1668((byte) -100);
        class58.method486((byte) -62);
        class41.method381((byte) 74);
        class186.method1352(-123);
        class42.method385(true);
        class207.method1460((byte) -98);
        class44.method403(-104);
        class213.method1508(3);
        class197.method1392(-74);
        class258.method1813(102);
        class282.method1968(true);
        class199.method1402(false);
        class37.method312((byte) -45);
        class178.method1312(-10);
        class126.method943(117);
        class185.method1344((byte) 53);
        class80.method607(0);
        class19.method122(-61);
        class61.method509(32768);
        class52.method455(-29);
        class300.method2044(-107);
        class86.method657(0);
        class14.method85((byte) 104);
        class65.method521(0);
        class121.method920(false);
        class297.method2030(-1);
        class307.method2097(-26062);
        class9.method58((byte) 110);
        class149.method1117((byte) 104);
        class89.method691(-5592);
        class296.method2024((byte) -92);
        class140.method1034(108);
        class261.method1842((byte) 86);
        class83.method635(0);
        class33.method291((byte) 120);
        class238.method1643(8);
        class108.method820(18986);
        class27.method260(0);
        class174.method1276((byte) 18);
        class253.method1782((byte) -71);
        class273.method1895();
        class131.method968(23989);
        class311.method2131();
        class294.method2016(-1);
        class152.method1165();
        class277.method1940((byte) -95);
        class175.method1278();
        class95.method716(127);
        class53.method460((byte) -65);
        class85.method654(23183);
        class250.method1769(-125);
        class136.method1004();
        class271.method1877(true);
        class156.method1207(7);
        class209.method1477(100);
        class249.method1760(1);
        class259.method1819();
        class31.method280(-64);
        class45.method417(128);
        class144.method1045();
        class233.method1615(8);
        class11.method69((byte) 33);
        class301.method2058((byte) -115);
        class75.method552();
        class84.method640();
        class90.method697((byte) -117);
        class230.method1605(false);
        class3.method9(false);
        class272.method1883((byte) -39);
        class220.method1540(0);
        class115.method861();
        class92.method702(-123);
        class252.method1780(0);
        class290.method1999(false);
        class122.method926(123);
        class133.method978((byte) -31);
        class50.method438(-77);
        class267.method1862(-38);
        class308.method2109(-22243);
        class218.method1527((byte) -63);
        class157.method1216(true);
        class257.method1806(false);
        class221.method1548(true);
        class76.method563(-1);
        class276.method1925(true);
        class314.method2168((byte) -121);
        class214.method1515((byte) -126);
        class56.method475(91);
        class247.method1745(false);
        class274.method1902(false);
        class163.method1236(1);
        class206.method1451((byte) -111);
        class212.method1491(-87);
        class254.method1784((byte) -81);
        class182.method1326(381499047);
        class203.method1425();
        class134.method989(22683);
        class118.method892((byte) 11);
        class125.method938(true);
        class265.method1855(2);
        class291.method2003((byte) 94);
        class256.method1800(-1);
        class176.method1298();
        class211.method1482(255);
        class171.method1266(0);
        class94.method713((byte) 122);
        class109.method822(0);
        class196.method1390(true);
        class217.method1523((byte) -118);
        class47.method420();
        class193.method1379(1);
        class236.method1637(-1);
        class302.method2063(3);
        class20.method126(-18210);
        class102.method770((byte) 50);
        class299.method2040(106);
        class30.method278((byte) -75);
        class113.method849();
        class312.method2153(1);
        class48.method427(28);
        class248.method1753(7354);
        class82.method633();
        class235.method1631(-11388);
        class241.method1690();
        class219.method1537();
        class151.method1132(true);
        class269.method1868(21472);
        class177.method1301((byte) 49);
        class164.method1239(83);
        class255.method1797(32236);
        class71.method536(2);
        class112.method848(false);
        class284.method1977(1);
        class18.method104();
        class2.method6(5);
        class111.method837();
        class180.method1318(1);
        class103.method775((byte) 101);
        class147.method1105((byte) -109);
        class12.method79((byte) -34);
        class46.method419(255);
        class270.method1870(2983);
        class146.method1102(0);
        class280.method1955((byte) 122);
        class303.method2068(255);
        class28.method267(-122);
        class60.method506(16);
        class129.method962(19605);
        class242.method1707(72);
        if (arg0 > -85) {
            field4051 = false;
        }
        class123.method931(-75);
        class55.method468((byte) 13);
        class29.method276(-11);
        class169.method1260((byte) 54);
        class110.method829(13828096);
        class81.method630(-185909240);
        class298.method2032((byte) 91);
        class168.method1252((byte) -8);
        class25.method186((byte) 120);
        class224.method1568();
        class188.method1358(256);
        class181.method1319(125);
        class7.method36((byte) 120);
        class130.method966((byte) -124);
        class142.method1041(1252752458);
        class51.method446(0);
        class187.method1353();
        class154.method1199();
        class215.method1518();
        class210.method1481((byte) -20);
        class63.method515(-52);
        class138.method1020();
        class127.method949();
        class251.method1774(3000);
        class309.method2115((byte) 25);
        class23.method172(62);
        class205.method1442(false);
        class166.method1247(4);
        class98.method725(64);
        class158.method1217((byte) -126);
        class139.method1033((byte) -122);
        class34.method300(-110);
        class237.method1640(4096);
        class292.method2007(118);
        class49.method435(-25955);
        class91.method700((byte) 30);
        class119.method896(8881);
        class93.method712(true);
        class143.method1043();
        class305.method2088();
        class310.method2117((byte) -107);
        class15.method90(1307538946);
        class96.method720(false);
        class195.method1388((byte) -49);
        class286.method1987(-51);
        class264.method1852((byte) -43);
        class128.method957((byte) 2);
        class6.method28((byte) -105);
        class106.method792((byte) -64);
        class120.method903(false);
        class148.method1113(0);
        class204.method1437(93);
        class306.method2091(10137);
        class22.method169((byte) 120);
        class160.method1232((byte) -104);
        class54.method465(1);
        class275.method1915(false);
        class57.method481(31791);
        class263.method1850(2);
        class162.method1234(2);
        class5.method27((byte) -103);
        class101.method766(0);
        class192.method1378(2695);
        class39.method322(-3701);
        class227.method1592(false);
        class59.method499((byte) -103);
        class279.method1953((byte) -83);
        class228.method1595(30606);
        class73.method543(false);
        class68.method528(119);
        class285.method1984(-128);
        class222.method1557(-3);
        class172.method1270((byte) -105);
        class8.method47(94);
        class293.method2011(44);
        class288.method1993(1);
        class150.method1128((byte) -30);
        class268.method1863(true);
        class244.method1715((byte) -75);
        class10.method67(1013);
        class243.method1709(2500);
        class202.method1407((byte) 3);
        class317.method2189(3658);
        class72.method541((byte) -60);
        class105.method791(127);
        class240.method1683((byte) -127);
        class229.method1602(12546);
        class116.method885(-28194);
        class246.method1741(114);
        class165.method1244(14043);
        class226.method1587(75);
        class88.method685((byte) 117);
        class278.method1948(true);
        class17.method95((byte) -108);
        class194.method1384(4);
        class78.method583(-12886);
        class232.method1613(82);
        class62.method513(-12352);
        class1.method4((byte) -105);
        class43.method394((byte) 19);
        if (class315.field5360) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 497)
    public final void method1719(int arg0) {
        field4041++;
        if (class6.field87 == 1000) {
            return;
        }
        boolean var2 = class131.method969(0);
        if (var2 && class101.field1775 && class119.field2011 != null) {
            class119.field2011.method113(2000);
        }
        if ((class6.field87 == 30 || class6.field87 == 10) && (class156.field2617 || class274.field4565 != 0L && class69.method535(true) > class274.field4565)) {
            class289.method1997(class182.field2961, class304.method2073((byte) 117), class156.field2617, true, class159.field2665);
        }
        if (arg0 > -113) {
            field4048 = (class40) null;
        }
        if (class271.field4503 == null) {
            Container var3;
            if (class271.field4503 != null) {
                var3 = class271.field4503;
            } else if (class106.field1867 == null) {
                var3 = class275.field4573.field1876;
            } else {
                var3 = class106.field1867;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class106.field1867 == var3) {
                Insets var6 = class106.field1867.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class59.field1139 != var4 || class182.field2955 != var5) {
                if (class107.field1883.startsWith("mac")) {
                    class59.field1139 = var4;
                    class182.field2955 = var5;
                } else {
                    class221.method1546(0);
                }
                class274.field4565 = class69.method535(true) + 500L;
            }
        }
        if (class271.field4503 != null && !class227.field3755 && (class6.field87 == 30 || class6.field87 == 10)) {
            class289.method1997(-1, class204.field3230, false, true, -1);
        }
        boolean var7 = false;
        if (class280.field4714) {
            class280.field4714 = false;
            var7 = true;
        }
        if (var7) {
            class146.method1103(0);
        }
        if (class21.field350) {
            for (int var8 = 0; var8 < 100; var8++) {
                class229.field3778[var8] = true;
            }
        }
        if (class6.field87 == 0) {
            class301.method2055(304, (Color) null, class37.field698, var7, class5.field67);
        } else if (class6.field87 == 5) {
            class41.method380(class230.field3789, false, 17302);
        } else if (class6.field87 == 10) {
            class125.method939((byte) 91);
        } else if (class6.field87 == 25 || class6.field87 == 28) {
            if (class44.field840 == 1) {
                if (class50.field961 > class94.field1704) {
                    class94.field1704 = class50.field961;
                }
                int var9 = (class94.field1704 - class50.field961) * 50 / class94.field1704;
                class28.method269((byte) -105, class153.method1192(new class40[] { class128.field2210, class285.field4805, class276.method1927((byte) -99, var9), class290.field4859 }, (byte) 126), false);
            } else if (class44.field840 == 2) {
                if (class160.field2676 > class228.field3767) {
                    class228.field3767 = class160.field2676;
                }
                int var10 = (class228.field3767 - class160.field2676) * 50 / class228.field3767 + 50;
                class28.method269((byte) -105, class153.method1192(new class40[] { class128.field2210, class285.field4805, class276.method1927((byte) -101, var10), class290.field4859 }, (byte) -87), false);
            } else {
                class28.method269((byte) -105, class128.field2210, false);
            }
        } else if (class6.field87 == 30) {
            class189.method1368((byte) 114);
        } else if (class6.field87 == 40) {
            class28.method269((byte) -105, class153.method1192(new class40[] { class118.field1997, class235.field3846, class265.field4435 }, (byte) 126), false);
        }
        if (class21.field350 && class6.field87 != 0) {
            class21.method161();
            for (int var17 = 0; var17 < class83.field1438; var17++) {
                class309.field5192[var17] = false;
            }
        } else if ((class6.field87 == 30 || class6.field87 == 10) && class48.field938 == 0 && !var7) {
            try {
                Graphics var14 = class213.field3470.getGraphics();
                for (int var15 = 0; var15 < class83.field1438; var15++) {
                    if (class309.field5192[var15]) {
                        class237.field3903.method549(class280.field4728[var15], var14, class197.field3166[var15], class53.field1036[var15], class181.field2947[var15], 0);
                        class309.field5192[var15] = false;
                    }
                }
            } catch (Exception var18) {
                class213.field3470.repaint();
            }
        } else if (class6.field87 != 0) {
            try {
                Graphics var11 = class213.field3470.getGraphics();
                class237.field3903.method548(0, 0, 0, var11);
                for (int var12 = 0; var12 < class83.field1438; var12++) {
                    class309.field5192[var12] = false;
                }
            } catch (Exception var19) {
                class213.field3470.repaint();
            }
        }
        if (class271.field4492) {
            class106.method795(-105);
        }
        if (class33.field669 && class6.field87 == 10 && class148.field2499 != -1) {
            class33.field669 = false;
            class94.method714(1, class275.field4573);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrb;)I", line = 733)
    public static final int method1720(class213 arg0) {
        class270 var1 = (class270) class192.field3091.method1405((byte) 115, ((long) arg0.field3507 << 32) + (long) arg0.field3494);
        return var1 == null ? arg0.field3476 : var1.field4483;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 749)
    public final void method1721(byte arg0) {
        if (class21.field350) {
            class21.method166();
        }
        if (class271.field4503 != null) {
            class194.method1382(class275.field4573, class271.field4503, (byte) 84);
            class271.field4503 = null;
        }
        if (class275.field4573 != null) {
            class275.field4573.method810((byte) -6, this.getClass());
        }
        if (class7.field105 != null) {
            class7.field105.field2650 = false;
        }
        field4065++;
        class7.field105 = null;
        if (class140.field2369 != null) {
            class140.field2369.method784(101);
            class140.field2369 = null;
        }
        class232.method1608(class213.field3470, 660);
        class92.method704((byte) -69, class213.field3470);
        if (class119.field2015 != null) {
            class119.field2015.method309(-7257, class213.field3470);
        }
        class278.method1946(false);
        class92.method705((byte) -97);
        class119.field2015 = null;
        if (class119.field2011 != null) {
            class119.field2011.method116((byte) 107);
        }
        if (class248.field4107 != null) {
            class248.field4107.method116((byte) 107);
        }
        class123.field2139.method2082((byte) -125);
        class186.field3004.method1580((byte) 118);
        try {
            if (class292.field4886 != null) {
                class292.field4886.method493(-119);
            }
            int var2 = -44 % ((arg0 - 54) / 61);
            if (class180.field2944 != null) {
                for (int var3 = 0; var3 < class180.field2944.length; var3++) {
                    if (class180.field2944[var3] != null) {
                        class180.field2944[var3].method493(48);
                    }
                }
            }
            if (class211.field3357 != null) {
                class211.field3357.method493(46);
            }
            if (class310.field5206 != null) {
                class310.field5206.method493(96);
            }
        } catch (IOException var5) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 864)
    public static final void method1722(int arg0) {
        class254.field4202.method1349(true);
        if (arg0 > -27) {
            method1730((class213) null);
        }
        field4062++;
        class68.field1245.method1349(true);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 910)
    public static void method1723(int arg0) {
        field4040 = null;
        field4050 = null;
        if (arg0 != 2919) {
            return;
        }
        field4042 = null;
        field4048 = null;
        field4061 = null;
        field4066 = null;
        field4047 = null;
        field4063 = null;
        field4057 = null;
        field4049 = null;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 932)
    private final void method1724(int arg0) {
        field4054++;
        if (class123.field2139.field5113 > class222.field3693) {
            class309.field5190 = (class123.field2139.field5113 * 50 - 50) * 5;
            if (class23.field398 == class20.field340) {
                class23.field398 = class233.field3843;
            } else {
                class23.field398 = class20.field340;
            }
            if (class309.field5190 > 3000) {
                class309.field5190 = 3000;
            }
            if (class123.field2139.field5113 >= 2 && class123.field2139.field5112 == 6) {
                this.method2181(94, "js5connect_outofdate");
                class6.field87 = 1000;
                return;
            }
            if (class123.field2139.field5113 >= 4 && class123.field2139.field5112 == -1) {
                this.method2181(127, "js5crc");
                class6.field87 = 1000;
                return;
            }
            if (class123.field2139.field5113 >= 4 && (class6.field87 == 0 || class6.field87 == 5)) {
                if (class123.field2139.field5112 == 7 || class123.field2139.field5112 == 9) {
                    this.method2181(97, "js5connect_full");
                } else if (class123.field2139.field5112 > 0) {
                    this.method2181(126, "js5connect");
                } else {
                    this.method2181(97, "js5io");
                }
                class6.field87 = 1000;
                return;
            }
        }
        if (arg0 >= -32) {
            return;
        }
        class222.field3693 = class123.field2139.field5113;
        if (class309.field5190 > 0) {
            class309.field5190--;
            return;
        }
        try {
            if (class255.field4236 == 0) {
                class134.field2265 = class275.field4573.method812(class195.field3145, class23.field398, 14038);
                class255.field4236++;
            }
            if (class255.field4236 == 1) {
                if (class134.field2265.field1258 == 2) {
                    this.method1717(1000, 108);
                    return;
                }
                if (class134.field2265.field1258 == 1) {
                    class255.field4236++;
                }
            }
            if (class255.field4236 == 2) {
                class58.field1113 = new class104((Socket) class134.field2265.field1260, class275.field4573);
                class26 var2 = new class26(5);
                var2.method218(15, -19914);
                var2.method239((byte) -66, 521);
                class58.field1113.method779(5, 16333, 0, var2.field472);
                class255.field4236++;
                class49.field950 = class69.method535(true);
            }
            if (class255.field4236 == 3) {
                if (class6.field87 == 0 || class6.field87 == 5 || class58.field1113.method790((byte) 66) > 0) {
                    int var3 = class58.field1113.method789((byte) 22);
                    if (var3 != 0) {
                        this.method1717(var3, 84);
                        return;
                    }
                    class255.field4236++;
                } else if ((class69.method535(true) - class49.field950) > 30000L) {
                    this.method1717(1001, 96);
                    return;
                }
            }
            if (class255.field4236 == 4) {
                boolean var4 = class6.field87 == 5 || class6.field87 == 10 || class6.field87 == 28;
                class123.field2139.method2079(!var4, 4, class58.field1113);
                class255.field4236 = 0;
                class58.field1113 = null;
                class134.field2265 = null;
            }
        } catch (IOException var6) {
            this.method1717(1002, 125);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1078)
    public static final void method1725(int arg0) {
        field4060++;
        if (arg0 != 40) {
            field4066 = (class40) null;
        }
        class157.field2637.method277(100);
        for (int var1 = 0; var1 < 32; var1++) {
            class225.field3719[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class163.field2711[var2] = 0L;
        }
        class308.field5175 = 0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1106)
    private final void method1726(byte arg0) {
        for (class196.field3156 = 0; class1.method1(-84) && class196.field3156 < 128; class196.field3156++) {
            class271.field4498[class196.field3156] = class199.field3186;
            class168.field2758[class196.field3156] = class65.field1222;
        }
        field4055++;
        class189.field3059++;
        if (class148.field2499 != -1) {
            class301.method2060(class148.field2499, 0, 0, 16492, class112.field1945, 0, class73.field1287, 0);
        }
        class60.field1152++;
        if (class21.field350) {
            int var2 = 19137023;
            label198: for (int var3 = 0; var3 < 32768; var3++) {
                class42 var4 = class91.field1656[var3];
                if (var4 != null) {
                    byte var5 = var4.field796.field2095;
                    if ((var5 & 0x2) > 0 && var4.field1516 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1489[0] = (var4.field1531 >> 7) + var6;
                            var4.field1532[0] = (var4.field1497 >> 7) + var7;
                            class255.field4247[class160.field2671].method404(0, var4.method666(24207), false, 0, var4.field1531 >> 7, var4.field1497 >> 7, var4.method666(24207));
                            if (var4.field1489[0] >= 0 && var4.field1489[0] <= 104 - var4.method666(24207) && var4.field1532[0] >= 0 && var4.field1532[0] <= (104 - var4.method666(24207)) && class255.field4247[class160.field2671].method413(-1, var4.field1497 >> 7, var4.field1531 >> 7, var4.field1489[0], var4.field1532[0])) {
                                if (var4.method666(arg0 ^ 0x5ECC) > 1) {
                                    for (int var8 = var4.field1489[0]; var8 < (var4.field1489[0] + var4.method666(24207)); var8++) {
                                        for (int var9 = var4.field1532[0]; var9 < (var4.field1532[0] + var4.method666(24207)); var9++) {
                                            if ((class255.field4247[class160.field2671].field839[var8][var9] & var2) != 0) {
                                                continue label198;
                                            }
                                        }
                                    }
                                }
                                var4.field1516 = 1;
                            }
                        }
                    }
                    class172.method1267(var4, true);
                    class91.method698(32768, var4);
                    class221.method1551((byte) 10, var4);
                    class255.field4247[class160.field2671].method410(var4.field1531 >> 7, 72, var4.field1497 >> 7, var4.method666(24207), false, var4.method666(arg0 + 24140));
                }
            }
        }
        if (!class21.field350) {
            class315.method2184(96);
        } else if (class54.field1062 == 0 && class272.field4520 == 0) {
            if (class103.field1814 == 2) {
                class6.method31(-17352);
            } else {
                class314.method2167(arg0 - 194);
            }
            if ((class238.field3922 >> 7) < 14 || (class238.field3922 >> 7) >= 90 || class289.field4841 >> 7 < 14 || (class289.field4841 >> 7) >= 90) {
                class166.method1250(6);
            }
        }
        while (true) {
            class109 var10;
            class213 var17;
            class213 var18;
            do {
                var10 = (class109) class210.field3352.method1969(100);
                if (var10 == null) {
                    while (true) {
                        class109 var11;
                        class213 var12;
                        class213 var13;
                        do {
                            var11 = (class109) class148.field2498.method1969(100);
                            if (var11 == null) {
                                while (true) {
                                    class109 var14;
                                    class213 var15;
                                    class213 var16;
                                    do {
                                        var14 = (class109) class58.field1117.method1969(100);
                                        if (var14 == null) {
                                            if (class28.field596 != null) {
                                                class265.method1857(true);
                                            }
                                            if (arg0 != 67) {
                                                this.method1719(37);
                                            }
                                            if (class149.field2504 != null && class149.field2504.field1258 == 1) {
                                                if (class149.field2504.field1260 != null) {
                                                    class236.method1638(109, class25.field444, class48.field931);
                                                }
                                                class149.field2504 = null;
                                                class48.field931 = null;
                                                class25.field444 = false;
                                            }
                                            if (class256.field4266 % 1500 == 0) {
                                                class89.method692(27755);
                                            }
                                            return;
                                        }
                                        var15 = var14.field1910;
                                        if (var15.field3494 < 0) {
                                            break;
                                        }
                                        var16 = class314.method2172((byte) 102, var15.field3421);
                                    } while (var16 == null || var16.field3415 == null || var15.field3494 >= var16.field3415.length || var16.field3415[var15.field3494] != var15);
                                    class121.method912(var14, arg0 ^ 0xFFFFFFD4);
                                }
                            }
                            var12 = var11.field1910;
                            if (var12.field3494 < 0) {
                                break;
                            }
                            var13 = class314.method2172((byte) 64, var12.field3421);
                        } while (var13 == null || var13.field3415 == null || var12.field3494 >= var13.field3415.length || var13.field3415[var12.field3494] != var12);
                        class121.method912(var11, 52);
                    }
                }
                var17 = var10.field1910;
                if (var17.field3494 < 0) {
                    break;
                }
                var18 = class314.method2172((byte) 76, var17.field3421);
            } while (var18 == null || var18.field3415 == null || var18.field3415.length <= var17.field3494 || var18.field3415[var17.field3494] != var17);
            class121.method912(var10, arg0 - 172);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1331)
    public final void method1727(int arg0) {
        field4045++;
        class221.method1546(0);
        class186.field3004 = new class225();
        class123.field2139 = new class304();
        if (class202.field3204 == 0) {
        }
        class133.method987(-22904, class275.field4573);
        if (class188.field3049 == 0) {
            class120.field2040 = this.getCodeBase().getHost();
            class315.field5341 = 43594;
            class103.field1806 = 443;
        } else if (class188.field3049 == 1) {
            class120.field2040 = this.getCodeBase().getHost();
            class315.field5341 = class228.field3769 + 40000;
            class103.field1806 = class228.field3769 + 50000;
        } else if (class188.field3049 == 2) {
            class103.field1806 = class228.field3769 + 50000;
            class120.field2040 = "127.0.0.1";
            class315.field5341 = class228.field3769 + 40000;
        }
        if (arg0 != -17636) {
            this.method1717(50, -53);
        }
        class92.field1670 = class315.field5341;
        class233.field3843 = class103.field1806;
        if (class107.field1884 == 3 && class188.field3049 != 2) {
            class81.field1426 = class228.field3769;
        }
        class23.field398 = class92.field1670;
        class195.field3145 = class120.field2040;
        class20.field340 = class315.field5341;
        class265.field4446 = class232.field3804 = class254.field4217 = class96.field1736 = new short[256];
        if (class249.field4110 == 1) {
            class226.field3738 = class119.field2013;
            class132.field2243 = true;
            class273.field4527 = 0;
            class273.field4533 = 16777215;
            class93.field1685 = class250.field4131;
            class80.field1411 = class153.field2589;
            class43.field817 = class59.field1137;
        } else {
            class93.field1685 = class317.field5363;
            class43.field817 = class6.field86;
            class226.field3738 = class210.field3348;
            class80.field1411 = class189.field3077;
        }
        class188.method1355(43);
        class55.method470(class213.field3470, 57);
        class101.method765(class213.field3470, (byte) 52);
        class119.field2015 = class8.method43(false);
        if (class119.field2015 != null) {
            class119.field2015.method313(0, class213.field3470);
        }
        class6.field83 = class107.field1884;
        try {
            if (class275.field4573.field1875 != null) {
                class292.field4886 = new class58(class275.field4573.field1875, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class180.field2944[var2] = new class58(class275.field4573.field1868[var2], 6000, 0);
                }
                class211.field3357 = new class58(class275.field4573.field1874, 6000, 0);
                class300.field5023 = new class41(255, class292.field4886, class211.field3357, 500000);
                class310.field5206 = new class58(class275.field4573.field1872, 24, 0);
                class275.field4573.field1875 = null;
                class275.field4573.field1868 = null;
                class275.field4573.field1874 = null;
                class275.field4573.field1872 = null;
            }
        } catch (IOException var4) {
            class292.field4886 = null;
            class310.field5206 = null;
            class300.field5023 = null;
            class211.field3357 = null;
        }
        class94.field1700 = class23.field399;
        if (class188.field3049 != 0) {
            class89.field1598 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1446)
    public final void method1728(int arg0) {
        field4059++;
        if (class6.field87 == 1000) {
            return;
        }
        class256.field4266++;
        if (arg0 != -2192) {
            return;
        }
        if (class256.field4266 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class128.field2200 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class217.field3614.setSeed((long) class128.field2200);
        }
        this.method1733(0);
        if (class31.field644 != null) {
            class31.field644.method1558(arg0 + 2065);
        }
        class134.method992(arg0 ^ 0xFFFFF771);
        class194.method1385(4);
        class222.method1554((byte) 122);
        class149.method1119(arg0 + 2192);
        if (class21.field350) {
            class136.method1005();
        }
        if (class119.field2015 != null) {
            int var3 = class119.field2015.method311(arg0 ^ 0x8FD);
            class292.field4895 = var3;
        }
        if (class6.field87 == 0) {
            this.method1731((byte) -38);
            method1725(40);
        } else if (class6.field87 == 5) {
            this.method1731((byte) -127);
            method1725(40);
        } else if (class6.field87 == 25 || class6.field87 == 28) {
            class177.method1307((byte) -49);
        }
        if (class6.field87 == 10) {
            this.method1726((byte) 67);
            class116.method886(-113);
            class101.method764(0);
            class10.method59(arg0 ^ 0xFFFFF704);
        } else if (class6.field87 == 30) {
            class78.method581((byte) -127);
        } else if (class6.field87 == 40) {
            class10.method59(83);
            if (class271.field4501 != -3) {
                if (class271.field4501 == 15) {
                    class303.method2067(arg0 ^ 0xFFFF860E);
                } else if (class271.field4501 != 2) {
                    class159.method1223(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lrb;IIIIIII)V", line = 1540)
    public static final void method1729(class213[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class213 var9 = arg0[var8];
            if (var9 != null && var9.field3421 == arg1 && (!var9.field3520 || var9.field3525 == 0 || var9.field3523 || method1720(var9) != 0 || class6.field89 == var9 || var9.field3510 == 1338) && (!var9.field3520 || !method1730(var9))) {
                int var10 = var9.field3442 + arg6;
                int var11 = var9.field3554 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3525 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3502 + var10;
                    int var17 = var9.field3565 + var11;
                    if (var9.field3525 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class28.field596 == var9) {
                    class163.field2714 = true;
                    class151.field2528 = var10;
                    class169.field2784 = var11;
                }
                if (!var9.field3520 || var12 < var14 && var13 < var15) {
                    if (var9.field3525 == 0) {
                        if (!var9.field3520 && method1730(var9) && class230.field3793 != var9) {
                            continue;
                        }
                        if (var9.field3466 && class48.field936 >= var12 && class46.field893 >= var13 && class48.field936 < var14 && class46.field893 < var15) {
                            for (class109 var18 = (class109) class58.field1117.method1971(100); var18 != null; var18 = (class109) class58.field1117.method1967(100)) {
                                if (var18.field1899) {
                                    var18.method2095(0);
                                    var18.field1910.field3576 = false;
                                }
                            }
                            if (class293.field4930 == 0) {
                                class28.field596 = null;
                                class6.field89 = null;
                            }
                            class276.field4596 = false;
                            class123.field2137 = null;
                        }
                    }
                    if (var9.field3520) {
                        boolean var19;
                        if (class48.field936 >= var12 && class46.field893 >= var13 && class48.field936 < var14 && class46.field893 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class244.field4030 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class288.field4833 == 1 && class128.field2208 >= var12 && class62.field1171 >= var13 && class128.field2208 < var14 && class62.field1171 < var15) {
                            var21 = true;
                        }
                        if (class196.field3156 > 0 && var9.field3543 != null) {
                            for (int var22 = 0; var22 < var9.field3543.length; var22++) {
                                for (int var23 = 0; var23 < class196.field3156; var23++) {
                                    int var24 = var9.field3543[var22] & 0xFF;
                                    if (class271.field4498[var23] == var24) {
                                        if (var9.field3556 != null) {
                                            byte var25 = var9.field3556[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class251.field4162[86] || (var25 & 0x1) != 0 && !class251.field4162[82] || (var25 & 0x4) != 0 && !class251.field4162[81])) {
                                                continue;
                                            }
                                        }
                                        class254.method1783(var22 + 1, (byte) -102, class264.field4421, -1, var9.field3507);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class78.method584(var9, (byte) 100, class128.field2208 - var10, class62.field1171 - var11);
                        }
                        if (class28.field596 != null && class28.field596 != var9 && var19 && class89.method690(method1720(var9), (byte) 121)) {
                            class93.field1687 = var9;
                        }
                        if (class6.field89 == var9) {
                            class49.field952 = true;
                            class89.field1603 = var10;
                            class149.field2505 = var11;
                        }
                        if (var9.field3523 || var9.field3510 != 0) {
                            if (var19 && class292.field4895 != 0 && var9.field3527 != null) {
                                class109 var26 = new class109();
                                var26.field1899 = true;
                                var26.field1910 = var9;
                                var26.field1904 = class292.field4895;
                                var26.field1908 = var9.field3527;
                                class58.field1117.method1972(var26, -124);
                            }
                            if (class28.field596 != null || class235.field3852 != null || class27.field518 || var9.field3510 != 1400 && class276.field4596) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3510 != 0) {
                                if (var9.field3510 == 1337) {
                                    class221.field3671 = var9;
                                    class25.method188(0, var9);
                                    continue;
                                }
                                if (var9.field3510 == 1338) {
                                    if (var21) {
                                        class123.field2137 = var9;
                                        class227.field3746 = class128.field2208 - var10;
                                        class252.field4185 = class62.field1171 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3510 == 1400) {
                                    class240.field3980 = var9;
                                    if (var21) {
                                        if (class251.field4162[82] && class162.field2689 > 0) {
                                            int var27 = (int) ((double) (class128.field2208 - var10 - var9.field3502 / 2) * 2.0D / (double) class101.field1786);
                                            int var28 = (int) ((double) (class62.field1171 - var11 - var9.field3565 / 2) * 2.0D / (double) class101.field1786);
                                            int var29 = class110.field1931 + var27;
                                            int var30 = class92.field1675 + var28;
                                            int var31 = class91.field1662 + var29;
                                            int var32 = class268.field4462 + class272.field4524 - var30 - 1;
                                            class274.method1901(var32, var31, 0, true);
                                            class43.method395(true);
                                            continue;
                                        }
                                        class276.field4596 = true;
                                        class19.field313 = class48.field936;
                                        class225.field3722 = class46.field893;
                                        class277.field4682 = class110.field1931;
                                        class290.field4849 = class92.field1675;
                                        continue;
                                    }
                                    if (var20 && class276.field4596) {
                                        class172.method1269(true, (int) ((double) (class19.field313 - class48.field936) * 2.0D / (double) class186.field3008) + class277.field4682);
                                        class239.method1669((byte) 38, (int) ((double) (class225.field3722 - class46.field893) * 2.0D / (double) class186.field3008) + class290.field4849);
                                        continue;
                                    }
                                    class276.field4596 = false;
                                    continue;
                                }
                                if (var9.field3510 == 1401) {
                                    if (var20) {
                                        class242.method1706(class48.field936 - var10, -1, var9.field3502, class46.field893 - var11, var9.field3565);
                                    }
                                    continue;
                                }
                                if (var9.field3510 == 1402) {
                                    if (!class21.field350) {
                                        class25.method188(0, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field3577 && var21) {
                                var9.field3577 = true;
                                if (var9.field3550 != null) {
                                    class109 var33 = new class109();
                                    var33.field1899 = true;
                                    var33.field1910 = var9;
                                    var33.field1900 = class128.field2208 - var10;
                                    var33.field1904 = class62.field1171 - var11;
                                    var33.field1908 = var9.field3550;
                                    class58.field1117.method1972(var33, 117);
                                }
                            }
                            if (var9.field3577 && var20 && var9.field3435 != null) {
                                class109 var34 = new class109();
                                var34.field1899 = true;
                                var34.field1910 = var9;
                                var34.field1900 = class48.field936 - var10;
                                var34.field1904 = class46.field893 - var11;
                                var34.field1908 = var9.field3435;
                                class58.field1117.method1972(var34, -116);
                            }
                            if (var9.field3577 && !var20) {
                                var9.field3577 = false;
                                if (var9.field3513 != null) {
                                    class109 var35 = new class109();
                                    var35.field1899 = true;
                                    var35.field1910 = var9;
                                    var35.field1900 = class48.field936 - var10;
                                    var35.field1904 = class46.field893 - var11;
                                    var35.field1908 = var9.field3513;
                                    class148.field2498.method1972(var35, -98);
                                }
                            }
                            if (var20 && var9.field3460 != null) {
                                class109 var36 = new class109();
                                var36.field1899 = true;
                                var36.field1910 = var9;
                                var36.field1900 = class48.field936 - var10;
                                var36.field1904 = class46.field893 - var11;
                                var36.field1908 = var9.field3460;
                                class58.field1117.method1972(var36, 53);
                            }
                            if (!var9.field3576 && var19) {
                                var9.field3576 = true;
                                if (var9.field3426 != null) {
                                    class109 var37 = new class109();
                                    var37.field1899 = true;
                                    var37.field1910 = var9;
                                    var37.field1900 = class48.field936 - var10;
                                    var37.field1904 = class46.field893 - var11;
                                    var37.field1908 = var9.field3426;
                                    class58.field1117.method1972(var37, -124);
                                }
                            }
                            if (var9.field3576 && var19 && var9.field3490 != null) {
                                class109 var38 = new class109();
                                var38.field1899 = true;
                                var38.field1910 = var9;
                                var38.field1900 = class48.field936 - var10;
                                var38.field1904 = class46.field893 - var11;
                                var38.field1908 = var9.field3490;
                                class58.field1117.method1972(var38, -124);
                            }
                            if (var9.field3576 && !var19) {
                                var9.field3576 = false;
                                if (var9.field3501 != null) {
                                    class109 var39 = new class109();
                                    var39.field1899 = true;
                                    var39.field1910 = var9;
                                    var39.field1900 = class48.field936 - var10;
                                    var39.field1904 = class46.field893 - var11;
                                    var39.field1908 = var9.field3501;
                                    class148.field2498.method1972(var39, -98);
                                }
                            }
                            if (var9.field3433 != null) {
                                class109 var40 = new class109();
                                var40.field1910 = var9;
                                var40.field1908 = var9.field3433;
                                class210.field3352.method1972(var40, -113);
                            }
                            if (var9.field3495 != null && class204.field3250 > var9.field3516) {
                                if (var9.field3477 == null || class204.field3250 - var9.field3516 > 32) {
                                    class109 var45 = new class109();
                                    var45.field1910 = var9;
                                    var45.field1908 = var9.field3495;
                                    class58.field1117.method1972(var45, -101);
                                } else {
                                    label548: for (int var41 = var9.field3516; var41 < class204.field3250; var41++) {
                                        int var42 = class225.field3726[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field3477.length; var43++) {
                                            if (var9.field3477[var43] == var42) {
                                                class109 var44 = new class109();
                                                var44.field1910 = var9;
                                                var44.field1908 = var9.field3495;
                                                class58.field1117.method1972(var44, -101);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field3516 = class204.field3250;
                            }
                            if (var9.field3454 != null && class251.field4173 > var9.field3440) {
                                if (var9.field3475 == null || class251.field4173 - var9.field3440 > 32) {
                                    class109 var50 = new class109();
                                    var50.field1910 = var9;
                                    var50.field1908 = var9.field3454;
                                    class58.field1117.method1972(var50, 99);
                                } else {
                                    label524: for (int var46 = var9.field3440; var46 < class251.field4173; var46++) {
                                        int var47 = class301.field5049[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field3475.length; var48++) {
                                            if (var9.field3475[var48] == var47) {
                                                class109 var49 = new class109();
                                                var49.field1910 = var9;
                                                var49.field1908 = var9.field3454;
                                                class58.field1117.method1972(var49, -97);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field3440 = class251.field4173;
                            }
                            if (var9.field3574 != null && class125.field2158 > var9.field3427) {
                                if (var9.field3515 == null || class125.field2158 - var9.field3427 > 32) {
                                    class109 var55 = new class109();
                                    var55.field1910 = var9;
                                    var55.field1908 = var9.field3574;
                                    class58.field1117.method1972(var55, -109);
                                } else {
                                    label500: for (int var51 = var9.field3427; var51 < class125.field2158; var51++) {
                                        int var52 = class303.field5077[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field3515.length; var53++) {
                                            if (var9.field3515[var53] == var52) {
                                                class109 var54 = new class109();
                                                var54.field1910 = var9;
                                                var54.field1908 = var9.field3574;
                                                class58.field1117.method1972(var54, -127);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field3427 = class125.field2158;
                            }
                            if (var9.field3548 != null && class307.field5139 > var9.field3449) {
                                if (var9.field3511 == null || class307.field5139 - var9.field3449 > 32) {
                                    class109 var60 = new class109();
                                    var60.field1910 = var9;
                                    var60.field1908 = var9.field3548;
                                    class58.field1117.method1972(var60, -118);
                                } else {
                                    label476: for (int var56 = var9.field3449; var56 < class307.field5139; var56++) {
                                        int var57 = class188.field3021[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field3511.length; var58++) {
                                            if (var9.field3511[var58] == var57) {
                                                class109 var59 = new class109();
                                                var59.field1910 = var9;
                                                var59.field1908 = var9.field3548;
                                                class58.field1117.method1972(var59, 50);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field3449 = class307.field5139;
                            }
                            if (var9.field3581 != null && class90.field1645 > var9.field3557) {
                                if (var9.field3459 == null || class90.field1645 - var9.field3557 > 32) {
                                    class109 var65 = new class109();
                                    var65.field1910 = var9;
                                    var65.field1908 = var9.field3581;
                                    class58.field1117.method1972(var65, 69);
                                } else {
                                    label452: for (int var61 = var9.field3557; var61 < class90.field1645; var61++) {
                                        int var62 = class235.field3859[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field3459.length; var63++) {
                                            if (var9.field3459[var63] == var62) {
                                                class109 var64 = new class109();
                                                var64.field1910 = var9;
                                                var64.field1908 = var9.field3581;
                                                class58.field1117.method1972(var64, -107);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field3557 = class90.field1645;
                            }
                            if (class2.field22 > var9.field3428 && var9.field3429 != null) {
                                class109 var66 = new class109();
                                var66.field1910 = var9;
                                var66.field1908 = var9.field3429;
                                class58.field1117.method1972(var66, -124);
                            }
                            if (class166.field2754 > var9.field3428 && var9.field3412 != null) {
                                class109 var67 = new class109();
                                var67.field1910 = var9;
                                var67.field1908 = var9.field3412;
                                class58.field1117.method1972(var67, 108);
                            }
                            if (class56.field1082 > var9.field3428 && var9.field3461 != null) {
                                class109 var68 = new class109();
                                var68.field1910 = var9;
                                var68.field1908 = var9.field3461;
                                class58.field1117.method1972(var68, 49);
                            }
                            if (class308.field5172 > var9.field3428 && var9.field3491 != null) {
                                class109 var69 = new class109();
                                var69.field1910 = var9;
                                var69.field1908 = var9.field3491;
                                class58.field1117.method1972(var69, -128);
                            }
                            if (class134.field2278 > var9.field3428 && var9.field3434 != null) {
                                class109 var70 = new class109();
                                var70.field1910 = var9;
                                var70.field1908 = var9.field3434;
                                class58.field1117.method1972(var70, -111);
                            }
                            var9.field3428 = class60.field1152;
                            if (var9.field3506 != null) {
                                for (int var71 = 0; var71 < class196.field3156; var71++) {
                                    class109 var72 = new class109();
                                    var72.field1910 = var9;
                                    var72.field1901 = class271.field4498[var71];
                                    var72.field1911 = class168.field2758[var71];
                                    var72.field1908 = var9.field3506;
                                    class58.field1117.method1972(var72, 8);
                                }
                            }
                            if (class104.field1849 && var9.field3445 != null) {
                                class109 var73 = new class109();
                                var73.field1910 = var9;
                                var73.field1908 = var9.field3445;
                                class58.field1117.method1972(var73, 34);
                            }
                        }
                    }
                    if (!var9.field3520 && class28.field596 == null && class235.field3852 == null && !class27.field518) {
                        if ((var9.field3489 >= 0 || var9.field3482 != 0) && class48.field936 >= var12 && class46.field893 >= var13 && class48.field936 < var14 && class46.field893 < var15) {
                            if (var9.field3489 >= 0) {
                                class230.field3793 = arg0[var9.field3489];
                            } else {
                                class230.field3793 = var9;
                            }
                        }
                        if (var9.field3525 == 8 && class48.field936 >= var12 && class46.field893 >= var13 && class48.field936 < var14 && class46.field893 < var15) {
                            class182.field2963 = var9;
                        }
                        if (var9.field3437 > var9.field3565) {
                            class250.method1771(var9, class46.field893, class48.field936, var9.field3502 + var10, var9.field3437, false, var11, var9.field3565);
                        }
                    }
                    if (var9.field3525 == 0) {
                        method1729(arg0, var9.field3507, var12, var13, var14, var15, var10 - var9.field3530, var11 - var9.field3583);
                        if (var9.field3415 != null) {
                            method1729(var9.field3415, var9.field3507, var12, var13, var14, var15, var10 - var9.field3530, var11 - var9.field3583);
                        }
                        class297 var74 = (class297) class165.field2731.method1405((byte) 115, (long) var9.field3507);
                        if (var74 != null) {
                            class301.method2060(var74.field4959, var11, var10, 16492, var14, var12, var15, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lrb;)Z", line = 2297)
    public static final boolean method1730(class213 arg0) {
        if (class126.field2176) {
            if (method1720(arg0) != 0) {
                return false;
            }
            if (arg0.field3525 == 0) {
                return false;
            }
        }
        return arg0.field3441;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 2322)
    private final void method1731(byte arg0) {
        if (!class33.field669) {
            label238: while (true) {
                do {
                    if (!class1.method1(-59)) {
                        break label238;
                    }
                } while (class65.field1222 != 115 && class65.field1222 != 83);
                class33.field669 = true;
            }
        }
        field4044++;
        if (class68.field1253 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class69.method535(true);
            if (class238.field3921 == 0L) {
                class238.field3921 = var4;
            }
            if (var3 > 16384 && var4 - class238.field3921 < 5000L) {
                if ((var4 - class185.field2974) > 1000L) {
                    System.gc();
                    class185.field2974 = var4;
                }
                class5.field67 = 5;
                class37.field698 = class250.field4136;
            } else {
                class68.field1253 = 10;
                class37.field698 = class312.field5262;
                class5.field67 = 5;
            }
        } else if (class68.field1253 == 10) {
            class84.method651(4, 104, 104);
            for (int var28 = 0; var28 < 4; var28++) {
                class255.field4247[var28] = new class44(104, 104);
            }
            class68.field1253 = 30;
            class5.field67 = 10;
            class37.field698 = class204.field3239;
        } else if (class68.field1253 == 30) {
            if (class31.field644 == null) {
                class31.field644 = new class223(class123.field2139, class186.field3004);
            }
            if (class31.field644.method1563(-62)) {
                class140.field2368 = class25.method184(false, true, 1000000, true, 0);
                class5.field61 = class25.method184(false, true, 1000000, true, 1);
                class233.field3818 = class25.method184(true, false, 1000000, true, 2);
                field4057 = class25.method184(false, true, 1000000, true, 3);
                class156.field2612 = class25.method184(false, true, 1000000, true, 4);
                class172.field2807 = class25.method184(true, true, 1000000, true, 5);
                class199.field3189 = class25.method184(true, true, 1000000, false, 6);
                class85.field1472 = class25.method184(false, true, 1000000, true, 7);
                class120.field2030 = class25.method184(false, true, 1000000, true, 8);
                class23.field408 = class25.method184(false, true, 1000000, true, 9);
                class212.field3400 = class25.method184(false, true, 1000000, true, 10);
                class274.field4562 = class25.method184(false, true, 1000000, true, 11);
                class186.field3005 = class25.method184(false, true, 1000000, true, 12);
                class41.field791 = class25.method184(false, true, 1000000, true, 13);
                class301.field5058 = class25.method184(false, true, 1000000, false, 14);
                class169.field2790 = class25.method184(false, true, 1000000, true, 15);
                class92.field1672 = class25.method184(false, true, 1000000, true, 16);
                class256.field4275 = class25.method184(false, true, 1000000, true, 17);
                class151.field2530 = class25.method184(false, true, 1000000, true, 18);
                class17.field258 = class25.method184(false, true, 1000000, true, 19);
                class28.field602 = class25.method184(false, true, 1000000, true, 20);
                class293.field4909 = class25.method184(false, true, 1000000, true, 21);
                class313.field5287 = class25.method184(false, true, 1000000, true, 22);
                class280.field4739 = class25.method184(true, true, 1000000, true, 23);
                class153.field2594 = class25.method184(false, true, 1000000, true, 24);
                class256.field4274 = class25.method184(false, true, 1000000, true, 25);
                class103.field1812 = class25.method184(true, true, 1000000, true, 26);
                class37.field698 = class220.field3668;
                class5.field67 = 15;
                class68.field1253 = 40;
            } else {
                class5.field67 = 12;
                class37.field698 = class236.field3886;
            }
        } else if (class68.field1253 == 40) {
            int var6 = 0;
            for (int var7 = 0; var7 < 27; var7++) {
                var6 += class96.field1721[var7].method669(0) * class195.field3136[var7] / 100;
            }
            if (var6 == 100) {
                class5.field67 = 20;
                class37.field698 = class52.field998;
                class254.method1785(-3, class120.field2030);
                class71.method537((byte) -7, class120.field2030);
                class302.method2061(-20294, class120.field2030);
                class68.field1253 = 45;
            } else {
                if (var6 != 0) {
                    class37.field698 = class153.method1192(new class40[] { class284.field4765, class276.method1927((byte) -94, var6), class53.field1031 }, (byte) 7);
                }
                class5.field67 = 20;
            }
        } else if (class68.field1253 == 45) {
            class265.method1853(class142.field2387, 22050, -587, 2);
            class303.field5074 = new class80();
            class303.field5074.method599(128, 9, -121);
            class119.field2011 = class72.method539(class275.field4573, 22050, -5690, class213.field3470, 0);
            class119.field2011.method107(255, class303.field5074);
            class263.method1846(class303.field5074, class169.field2790, class301.field5058, 1960552908, class156.field2612);
            class248.field4107 = class72.method539(class275.field4573, 2048, -5690, class213.field3470, 1);
            class89.field1610 = new class184();
            class248.field4107.method107(255, class89.field1610);
            class252.field4181 = new class61(22050, class25.field448);
            class29.field613 = class199.field3189.method1665(field4066, (byte) -66);
            class5.field67 = 30;
            class68.field1253 = 50;
            class37.field698 = class233.field3842;
        } else if (class68.field1253 == 50) {
            int var26 = class232.method1611(class120.field2030, class41.field791, 27447);
            int var27 = class103.method777(-103);
            if (var26 >= var27) {
                class68.field1253 = 60;
                class37.field698 = class5.field73;
                class5.field67 = 35;
            } else {
                class37.field698 = class153.method1192(new class40[] { class252.field4180, class276.method1927((byte) -69, var26 * 100 / var27), class53.field1031 }, (byte) 127);
                class5.field67 = 35;
            }
        } else if (class68.field1253 == 60) {
            int var24 = class109.method824(-15745, class120.field2030);
            int var25 = class95.method715((byte) -70);
            if (var24 < var25) {
                class37.field698 = class153.method1192(new class40[] { class28.field609, class276.method1927((byte) -96, var24 * 100 / var25), class53.field1031 }, (byte) -24);
                class5.field67 = 40;
            } else {
                class37.field698 = class242.field3993;
                class5.field67 = 40;
                class68.field1253 = 65;
            }
        } else if (class68.field1253 == 65) {
            class148.method1116(class120.field2030, -9875, class41.field791);
            class5.field67 = 45;
            class37.field698 = class250.field4130;
            class271.method1879(5, 17646);
            class68.field1253 = 70;
        } else if (class68.field1253 == 70) {
            class233.field3818.method1670(false);
            byte var13 = 0;
            int var14 = var13 + class233.field3818.method1677((byte) 1);
            class92.field1672.method1670(false);
            int var15 = var14 + class92.field1672.method1677((byte) 111);
            class256.field4275.method1670(false);
            int var16 = var15 + class256.field4275.method1677((byte) 125);
            class151.field2530.method1670(false);
            int var17 = var16 + class151.field2530.method1677((byte) 119);
            class17.field258.method1670(false);
            int var18 = var17 + class17.field258.method1677((byte) 110);
            class28.field602.method1670(false);
            int var19 = var18 + class28.field602.method1677((byte) -48);
            class293.field4909.method1670(false);
            int var20 = var19 + class293.field4909.method1677((byte) -11);
            class313.field5287.method1670(false);
            int var21 = var20 + class313.field5287.method1677((byte) -69);
            class153.field2594.method1670(false);
            int var22 = var21 + class153.field2594.method1677((byte) 105);
            class256.field4274.method1670(false);
            int var23 = var22 + class256.field4274.method1677((byte) -14);
            if (var23 < 1000) {
                class37.field698 = class153.method1192(new class40[] { class125.field2163, class276.method1927((byte) -122, var23 / 10), class53.field1031 }, (byte) 42);
                class5.field67 = 50;
            } else {
                class310.method2121(class233.field3818, (byte) 69);
                class159.method1218(class233.field3818, (byte) 85);
                class192.method1377((byte) -127, class233.field3818);
                class270.method1869(15, class233.field3818, class85.field1472);
                class223.method1560(true, class92.field1672, (byte) 122, class85.field1472);
                class301.method2056(class85.field1472, class151.field2530, 32320);
                class34.method293(class17.field258, true, class40.field762, class85.field1472, 100);
                class236.method1633((byte) 83, class233.field3818);
                class93.method711(class28.field602, class140.field2368, 31002, class5.field61);
                class5.method21(class293.field4909, class85.field1472, true);
                class294.method2015(class313.field5287, -33);
                class132.method972(class233.field3818, -1);
                class51.method445(class120.field2030, class41.field791, true, field4057, class85.field1472);
                class285.method1985(0, class233.field3818);
                class8.method46(-127, class256.field4275);
                class242.method1708(class153.field2594, (byte) 122, new class163(), class256.field4274);
                class197.method1391(class153.field2594, class256.field4274, -22282);
                class37.field698 = class290.field4853;
                class5.field67 = 50;
                class2.method7(-92);
                class68.field1253 = 80;
            }
        } else {
            if (arg0 >= -15) {
                field4040 = (class40) null;
            }
            if (class68.field1253 == 80) {
                int var8 = class8.method42(-1, class120.field2030);
                int var9 = class250.method1765(-23887);
                if (var8 < var9) {
                    class37.field698 = class153.method1192(new class40[] { class29.field620, class276.method1927((byte) -102, var8 * 100 / var9), class53.field1031 }, (byte) 126);
                    class5.field67 = 60;
                } else {
                    class307.method2100((byte) 110, class120.field2030);
                    class37.field698 = class207.field3307;
                    class68.field1253 = 90;
                    class5.field67 = 60;
                }
            } else if (class68.field1253 == 90) {
                if (class103.field1812.method1670(false)) {
                    class212 var12 = new class212(class23.field408, class103.field1812, class120.field2030, 20, !class81.field1429);
                    class203.method1424(var12);
                    if (class162.field2692 == 1) {
                        class203.method1422(0.9F);
                    }
                    if (class162.field2692 == 2) {
                        class203.method1422(0.8F);
                    }
                    if (class162.field2692 == 3) {
                        class203.method1422(0.7F);
                    }
                    if (class162.field2692 == 4) {
                        class203.method1422(0.6F);
                    }
                    class68.field1253 = 100;
                    class37.field698 = class125.field2167;
                    class5.field67 = 70;
                } else {
                    class37.field698 = class153.method1192(new class40[] { class220.field3661, class276.method1927((byte) -67, class103.field1812.method1677((byte) -20)), class53.field1031 }, (byte) -13);
                    class5.field67 = 70;
                }
            } else if (class68.field1253 == 100) {
                if (class122.method928(class120.field2030, (byte) 80)) {
                    class68.field1253 = 110;
                }
            } else if (class68.field1253 == 110) {
                class7.field105 = new class159();
                class275.field4573.method800(-122, class7.field105, 10);
                class68.field1253 = 120;
                class37.field698 = class192.field3099;
                class5.field67 = 75;
            } else if (class68.field1253 == 120) {
                if (class212.field3400.method1647(class258.field4326, class264.field4421, 25716)) {
                    class134 var11 = new class134(class212.field3400.method1680((byte) 34, class264.field4421, class258.field4326));
                    class52.method458(3, var11);
                    class37.field698 = class156.field2618;
                    class5.field67 = 80;
                    class68.field1253 = 130;
                } else {
                    class37.field698 = class153.method1192(new class40[] { class239.field3933, class128.field2209 }, (byte) -92);
                    class5.field67 = 80;
                }
            } else if (class68.field1253 == 130) {
                if (!field4057.method1670(false)) {
                    class37.field698 = class153.method1192(new class40[] { class298.field4975, class276.method1927((byte) -86, field4057.method1677((byte) -59) * 3 / 4), class53.field1031 }, (byte) -1);
                    class5.field67 = 85;
                } else if (!class186.field3005.method1670(false)) {
                    class37.field698 = class153.method1192(new class40[] { class298.field4975, class276.method1927((byte) -82, class186.field3005.method1677((byte) -114) / 10 + 75), class53.field1031 }, (byte) 124);
                    class5.field67 = 85;
                } else if (!class41.field791.method1670(false)) {
                    class37.field698 = class153.method1192(new class40[] { class298.field4975, class276.method1927((byte) -119, class41.field791.method1677((byte) -83) / 20 + 85), class53.field1031 }, (byte) 36);
                    class5.field67 = 85;
                } else if (class280.field4739.method1682(-92, class214.field3590)) {
                    class116.method884(class130.field2224, 0, class96.field1724, class3.field46, class172.field2817, class280.field4739, class244.field4024);
                    class37.field698 = class284.field4779;
                    class5.field67 = 95;
                    class68.field1253 = 135;
                } else {
                    class37.field698 = class153.method1192(new class40[] { class298.field4975, class276.method1927((byte) -105, class280.field4739.method1672((byte) -22, class214.field3590) / 10 + 90), class53.field1031 }, (byte) -60);
                    class5.field67 = 85;
                }
            } else if (class68.field1253 == 135) {
                int var10 = class271.method1876(true);
                if (var10 == -1) {
                    class37.field698 = class30.field641;
                    class5.field67 = 95;
                } else if (var10 == 7 || var10 == 9) {
                    this.method2181(98, "worldlistfull");
                    class271.method1879(1000, 17646);
                } else if (class1.field12) {
                    class5.field67 = 96;
                    class37.field698 = class304.field5102;
                    class68.field1253 = 140;
                } else {
                    this.method2181(111, "worldlistio_" + var10);
                    class271.method1879(1000, 17646);
                }
            } else if (class68.field1253 == 140) {
                class249.field4117 = field4057.method1665(class254.field4226, (byte) -28);
                class172.field2807.method1658(true, 143, false);
                class199.field3189.method1658(true, 143, true);
                class120.field2030.method1658(true, 143, true);
                class41.field791.method1658(true, 143, true);
                class212.field3400.method1658(true, 143, true);
                field4057.method1658(true, 143, true);
                class5.field67 = 97;
                class68.field1253 = 150;
                class37.field698 = class276.field4612;
                class271.field4492 = true;
            } else if (class68.field1253 == 150) {
                class176.method1294();
                if (class33.field669) {
                    class296.field4952 = 0;
                    class104.field1848 = 0;
                    class204.field3230 = 0;
                }
                class33.field669 = true;
                class94.method714(1, class275.field4573);
                class289.method1997(-1, class204.field3230, false, true, -1);
                class68.field1253 = 160;
                class37.field698 = class209.field3339;
                class5.field67 = 100;
            } else if (class68.field1253 == 160) {
                class251.method1777(-1, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lrb;)Lrb;", line = 2820)
    public static final class213 method1732(class213 arg0) {
        int var1 = class284.method1975(method1720(arg0), 1);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class314.method2172((byte) -114, arg0.field3421);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2861)
    private final void method1733(int arg0) {
        boolean var2 = class123.field2139.method2081(512);
        if (!var2) {
            this.method1724(arg0 - 59);
        }
        field4043++;
        if (arg0 != 0) {
            field4051 = false;
        }
    }
}
