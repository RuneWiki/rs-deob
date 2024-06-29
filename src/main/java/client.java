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
public class client extends class19 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4564 = -1;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lic;")
    public static class160 field4569 = new class160(100);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field4580 = "Prepared sound engine";

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[S")
    public static short[] field4581 = new short[256];

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Ljava/lang/String;")
    public static String field4582 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "J")
    private static long field4579;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field4583;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lwf;")
    public static class17[] field4577;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkj;)Ljh;")
    public static final class253 method1916(class114 arg0) {
        class253 var1 = (class253) class67.field1137.method1063((byte) -63, ((long) arg0.field1789 << 32) + (long) arg0.field1916);
        return var1 == null ? arg0.field1751 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
    private final void method1917(boolean arg0, byte[] arg1) {
        class136 var3 = new class136(arg1);
        while (true) {
            int var4 = var3.method1012(4);
            if (var4 == 0) {
                if (!arg0) {
                    field4579 = 1L;
                }
                field4560++;
                return;
            }
            if (var4 == 1) {
                var3.method996(65280);
                var3.method996(65280);
                var3.method996(65280);
                var3.method996(65280);
                var3.method996(65280);
                var3.method996(65280);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLsb;Lsb;)V")
    private static final void method1918(byte arg0, class124 arg1, class124 arg2) {
        if (arg0 != -83) {
            field4564 = -126;
        }
        class164.field2668 = arg1;
        field4565++;
        class252.field4005 = arg2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method149(byte arg0) {
        field4558++;
        if (class146.field2401 == 1000) {
            return;
        }
        long var2 = class47.method410(1) / 1000000L - class71.field1182;
        class71.field1182 = class47.method410(1) / 1000000L;
        boolean var4 = class40.method333(11422);
        if (var4 && class178.field2968 && class165.field2709 != null) {
            class165.field2709.method1595((byte) 94);
        }
        if ((class146.field2401 == 30 || class146.field2401 == 10) && (class179.field2975 || class11.field153 != 0L && class62.method472(102) > class11.field153)) {
            class245.method1632(-112, class218.method1447(-769845689), class179.field2975, class134.field2221, class37.field626);
        }
        if (class201.field3273 == null) {
            Container var5;
            if (class201.field3273 != null) {
                var5 = class201.field3273;
            } else if (class207.field3327 == null) {
                var5 = class205.field3294.field1291;
            } else {
                var5 = class207.field3327;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class207.field3327 == var5) {
                Insets var8 = class207.field3327.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class205.field3297 != var6 || class56.field991 != var7) {
                if (class78.field1300.startsWith("mac")) {
                    class56.field991 = var7;
                    class205.field3297 = var6;
                } else {
                    class281.method1890(115);
                }
                class11.field153 = class62.method472(101) + 500L;
            }
        }
        boolean var9 = false;
        if (arg0 != 37) {
            return;
        }
        if (class285.field4540) {
            var9 = true;
            class285.field4540 = false;
        }
        if (var9) {
            class149.method1092(128);
        }
        if (class146.field2401 == 0) {
            class229.method1528(var9, (Color) null, (byte) -56, class43.field783, class219.field3512);
        } else if (class146.field2401 == 5) {
            class258.method1727(515, class23.field362, false);
        } else if (class146.field2401 == 10) {
            class254.method1696(0);
        } else if (class146.field2401 == 25 || class146.field2401 == 28) {
            if (class36.field619 == 1) {
                if (class12.field164 > class87.field1404) {
                    class87.field1404 = class12.field164;
                }
                int var11 = (class87.field1404 - class12.field164) * 50 / class87.field1404;
                class72.method554(false, class35.field591 + "<br>(" + var11 + "%)", (byte) -59);
            } else if (class36.field619 == 2) {
                if (class161.field2631 > class45.field824) {
                    class45.field824 = class161.field2631;
                }
                int var10 = (class45.field824 - class161.field2631) * 50 / class45.field824 + 50;
                class72.method554(false, class35.field591 + "<br>(" + var10 + "%)", (byte) -59);
            } else {
                class72.method554(false, class35.field591, (byte) -59);
            }
        } else if (class146.field2401 == 30) {
            class152.method1103(var2, false);
        } else if (class146.field2401 == 40) {
            class72.method554(false, class27.field476 + "<br>" + class59.field1021, (byte) -59);
        }
        if ((class146.field2401 == 30 || class146.field2401 == 10) && class229.field3657 == 0 && !var9) {
            try {
                Graphics var12 = class22.field340.getGraphics();
                for (int var13 = 0; var13 < class258.field4114; var13++) {
                    if (class229.field3659[var13]) {
                        class263.field4173.method745(class287.field4594[var13], class220.field3522[var13], -46, class164.field2670[var13], class252.field4009[var13], var12);
                        class229.field3659[var13] = false;
                    }
                }
            } catch (Exception var17) {
                class22.field340.repaint();
            }
        } else if (class146.field2401 != 0) {
            try {
                Graphics var14 = class22.field340.getGraphics();
                class263.field4173.method744(arg0 ^ 0x4A5, 0, var14, 0);
                for (int var15 = 0; var15 < class258.field4114; var15++) {
                    class229.field3659[var15] = false;
                }
            } catch (Exception var16) {
                class22.field340.repaint();
            }
        }
        if (class251.field3998) {
            class242.method1602(5);
        }
        if (class234.field3710 && class146.field2401 == 10 && class223.field3558 != -1) {
            class234.field3710 = false;
            class112.method829(class205.field3294, 16751);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1919(int arg0) {
        field4576++;
        for (class232.field3672 = 0; class174.method1249((byte) 78) && class232.field3672 < 128; class232.field3672++) {
            class113.field1737[class232.field3672] = class278.field4413;
            class165.field2708[class232.field3672] = class216.field3457;
        }
        class232.field3681++;
        if (class223.field3558 != -1) {
            class26.method237(class223.field3558, 0, class33.field557, 0, 0, 0, (byte) 52, class137.field2301);
        }
        class61.field1040++;
        if (arg0 != 30000) {
            this.method153((byte) 67);
        }
        class224.method1507((byte) 0);
        while (true) {
            class196 var2;
            class114 var3;
            class114 var4;
            do {
                var2 = (class196) class12.field165.method1811(-26875);
                if (var2 == null) {
                    while (true) {
                        class196 var5;
                        class114 var6;
                        class114 var7;
                        do {
                            var5 = (class196) class262.field4157.method1811(-26875);
                            if (var5 == null) {
                                while (true) {
                                    class196 var8;
                                    class114 var9;
                                    class114 var10;
                                    do {
                                        var8 = (class196) class131.field2187.method1811(-26875);
                                        if (var8 == null) {
                                            if (class23.field365 != null) {
                                                class235.method1558(110);
                                            }
                                            if (class160.field2598 != null && class160.field2598.field1937 == 1) {
                                                if (class160.field2598.field1936 != null) {
                                                    class128.method934(class206.field3312, class176.field2944, (byte) 120);
                                                }
                                                class176.field2944 = null;
                                                class160.field2598 = null;
                                                class206.field3312 = false;
                                            }
                                            if (class207.field3336 % 1500 == 0) {
                                                class28.method251((byte) 113);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field3213;
                                        if (var9.field1916 < 0) {
                                            break;
                                        }
                                        var10 = class8.method43(var9.field1910, (byte) 17);
                                    } while (var10 == null || var10.field1820 == null || var9.field1916 >= var10.field1820.length || var10.field1820[var9.field1916] != var9);
                                    class129.method938(arg0 ^ 0x754D, var8);
                                }
                            }
                            var6 = var5.field3213;
                            if (var6.field1916 < 0) {
                                break;
                            }
                            var7 = class8.method43(var6.field1910, (byte) 90);
                        } while (var7 == null || var7.field1820 == null || var7.field1820.length <= var6.field1916 || var7.field1820[var6.field1916] != var6);
                        class129.method938(-50, var5);
                    }
                }
                var3 = var2.field3213;
                if (var3.field1916 < 0) {
                    break;
                }
                var4 = class8.method43(var3.field1910, (byte) 33);
            } while (var4 == null || var4.field1820 == null || var4.field1820.length <= var3.field1916 || var4.field1820[var3.field1916] != var3);
            class129.method938(-92, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4567++;
        if (!this.method159(-75)) {
            return;
        }
        class45.field814 = Integer.parseInt(this.getParameter("worldid"));
        class197.field3225 = Integer.parseInt(this.getParameter("modewhere"));
        if (class197.field3225 < 0 || class197.field3225 > 1) {
            class197.field3225 = 0;
        }
        class237.field3745 = Integer.parseInt(this.getParameter("modewhat"));
        if (class237.field3745 < 0 || class237.field3745 > 2) {
            class237.field3745 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class47.field869 = true;
        } else {
            class47.field869 = false;
        }
        try {
            class145.field2391 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class145.field2391 = 0;
        }
        class137.method1034((byte) 35, class145.field2391);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class229.field3646 = true;
        } else {
            class229.field3646 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class137.field2309 = true;
        } else {
            class137.field2309 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class238.field3752 = 1;
        } else {
            class238.field3752 = 0;
        }
        try {
            class252.field4019 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class252.field4019 = 0;
        }
        class241.field3801 = this.getParameter("settings");
        if (class241.field3801 == null) {
            class241.field3801 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class237.field3743 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class237.field3743 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class217.field3480 = true;
        } else {
            class217.field3480 = false;
        }
        class208.field3344 = this;
        this.method155(503, false, 765, class237.field3745 + 32, 538);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method153(byte arg0) {
        method1927(103);
        class288.method1939(-121);
        class119.method872(12800);
        class254.method1694(-7843);
        class107.method799((byte) 109);
        field4574++;
        class143.method1057(0);
        class204.method1378((byte) -5);
        class272.method1848(false);
        class19.method161(124);
        class164.method1186((byte) 19);
        class130.method944(true);
        class209.method1397((byte) -84);
        class179.method1267((byte) 113);
        class136.method969((byte) -128);
        class35.method291(-121);
        class159.method1146(0);
        class116.method858(99);
        class233.method1546((byte) 126);
        class47.method397((byte) -113);
        class124.method915((byte) 125);
        class217.method1439(-1);
        class239.method1579((byte) 98);
        class160.method1158(14);
        class139.method1039(-1);
        class76.method609(15418);
        class13.method86(100);
        class114.method838((byte) -15);
        class213.method1415((byte) -111);
        class266.method1815((byte) 87);
        class144.method1069((byte) -63);
        class134.method960(0);
        class108.method802(true);
        class66.method507((byte) -125);
        class25.method199((byte) -77);
        class241.method1596(-5302);
        class106.method786(false);
        class81.method653((byte) -82);
        class77.method621(3);
        class171.method1221(431460592);
        class129.method940(true);
        class248.method1659(false);
        class110.method820(2);
        class165.method1191((byte) 118);
        class167.method1201(-63);
        class253.method1688(0);
        class146.method1076(true);
        class10.method65((byte) -103);
        class156.method1126(true);
        class29.method259(0);
        class169.method1212(-30113);
        class161.method1169(64);
        class12.method78((byte) 126);
        class82.method659(0);
        class178.method1263(false);
        class140.method1046(-5236);
        class230.method1531(-13993);
        class94.method707((byte) -44);
        class174.method1245(5844);
        class157.method1135(13423);
        class96.method732(-5959);
        class274.method1857(124);
        class294.method1976(1);
        class212.method1407(28716);
        if (arg0 < 109) {
            this.method156((byte) -121);
        }
        class242.method1601((byte) -117);
        class264.method1796();
        class67.method516(false);
        class41.method366();
        class191.method1315(true);
        class154.method1116(4096);
        class72.method555(0);
        class141.method1049((byte) -117);
        class49.method421(-16760);
        class184.method1284(29);
        class149.method1093((byte) -110);
        class73.method582();
        class247.method1643(true);
        class267.method1822(125);
        class261.method1746();
        class252.method1676(-43);
        class33.method281(3253);
        class203.method1367();
        class113.method831(7487);
        class131.method949((byte) -19);
        class238.method1571((byte) 63);
        class185.method1289(528);
        class63.method473();
        class52.method435(false);
        class138.method1036((byte) -125);
        class70.method544(-1);
        class112.method826(false);
        class236.method1566(9881);
        class286.method1914((byte) 117);
        class259.method1730(-129);
        class9.method51((byte) -48);
        class262.method1758((byte) 83);
        class198.method1348(-1);
        class250.method1666((byte) 99);
        class38.method316(-124);
        class281.method1889(false);
        class172.method1235(32768);
        class8.method40(false);
        class121.method881();
        class97.method738(-90);
        class293.method1968(false);
        class18.method145(-1822);
        class251.method1671(2);
        class258.method1722(30);
        class234.method1548(5);
        class103.method769();
        class205.method1380(-112);
        class104.method774((byte) -112);
        class6.method33((byte) -73);
        class283.method1899(0);
        class2.method9((byte) 111);
        class79.method640((byte) -85);
        class28.method245((byte) -85);
        class284.method1905();
        class95.method727();
        class263.method1772(-10812);
        class152.method1105((byte) -70);
        class292.method1953(16647);
        class137.method1031(-29401);
        class80.method644(15655);
        class43.method374((byte) -66);
        class126.method925(1555);
        class37.method313((byte) 98);
        class297.method1990(24866);
        class196.method1340((byte) 65);
        class60.method464(-121);
        class190.method1312((byte) -122);
        class228.method1523(113);
        class128.method933(2);
        class195.method1335(-15576);
        class249.method1663((byte) 56);
        class192.method1318(65);
        class105.method780(104);
        class117.method863();
        class111.method825(-90);
        class277.method1867(126);
        class180.method1273(101);
        class177.method1262();
        class278.method1869(27598);
        class57.method452(-89);
        class5.method25((byte) 94);
        class23.method185(false);
        class194.method1329(3208);
        class219.method1452(true);
        class193.method1323(true);
        class54.method442();
        class176.method1261(-1453);
        class87.method681(99);
        class135.method963(-7709);
        class14.method96((byte) -109);
        class50.method423(179);
        class271.method1844(true);
        class207.method1388(-1);
        class187.method1295(-22753);
        class100.method750(8);
        class92.method702(true);
        class186.method1292(1);
        class189.method1310(1917);
        class269.method1829(-8);
        class245.method1624(22599);
        class282.method1891(true);
        class151.method1101(14276);
        class208.method1391(false);
        class145.method1071(84);
        class181.method1276((byte) -33);
        class175.method1256();
        class170.method1218((byte) 126);
        class291.method1952(-4050);
        class224.method1505(97);
        class260.method1736(-28100);
        class229.method1526(2);
        class199.method1351(114);
        class275.method1861();
        class51.method429();
        class85.method679((byte) -97);
        class296.method1986(-1637949142);
        class223.method1500(true);
        class89.method690(-1);
        class109.method812();
        class147.method1081();
        class163.method1175(false);
        class237.method1568(14538);
        class273.method1852(107);
        class290.method1946(18);
        class45.method393((byte) 26);
        class218.method1451((byte) -20);
        class244.method1621(0);
        class20.method170((byte) 17);
        class287.method1935(true);
        class69.method539(-5584);
        class150.method1096(0);
        class40.method327(0);
        class270.method1838(0);
        class265.method1805((byte) -123);
        class201.method1356(4);
        class285.method1913((byte) 20);
        class64.method497((byte) 107);
        class44.method383((byte) 95);
        class32.method277(4252);
        class91.method695((byte) -46);
        class21.method174((byte) -85);
        class42.method371(true);
        class240.method1582(false);
        class27.method243(-111);
        class211.method1405(-51);
        class34.method285(1490763052);
        class11.method74(100);
        class210.method1400(false);
        class206.method1384(false);
        class58.method456(0);
        class75.method600((byte) -95);
        class295.method1980(-117);
        class118.method868(22882);
        class279.method1880(1785641548);
        class155.method1121((byte) -120);
        class3.method15(-27577);
        class15.method105(1057001181);
        class220.method1453(-71);
        class225.method1510(256);
        class4.method23((byte) -62);
        class56.method451(0);
        class216.method1432(2048);
        class26.method236((byte) 114);
        class127.method927((byte) -125);
        class7.method36(-1);
        class22.method179(122);
        class246.method1636(2);
        class153.method1108(0);
        class256.method1713(-110);
        class101.method753((byte) -75);
        class71.method550(16384);
        class197.method1344(-108);
        class61.method470(4);
        class276.method1865(-86);
        class65.method503(122);
        class255.method1704((byte) -19);
        class59.method459(98);
        class48.method413((byte) 54);
        class36.method312((byte) 121);
        class183.method1280(true);
        class200.method1355(-25319);
        class268.method1825((byte) -91);
        class148.method1088(-15886);
        if (class19.field305) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lkj;IIIIIII)V")
    public static final void method1920(class114[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class114 var9 = arg0[var8];
            if (var9 != null && var9.field1910 == arg1 && (!var9.field1765 || var9.field1898 == 0 || var9.field1879 || method1916(var9).field4028 != 0 || class189.field3092 == var9 || var9.field1929 == 1338) && (!var9.field1765 || !method1928(var9))) {
                int var10 = var9.field1779 + arg6;
                int var11 = var9.field1875 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1898 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1790 + var10;
                    int var17 = var9.field1919 + var11;
                    if (var9.field1898 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class23.field365 == var9) {
                    class279.field4437 = true;
                    class269.field4326 = var10;
                    class220.field3526 = var11;
                }
                if (!var9.field1765 || var12 < var14 && var13 < var15) {
                    if (var9.field1898 == 0) {
                        if (!var9.field1765 && method1928(var9) && class89.field1424 != var9) {
                            continue;
                        }
                        if (var9.field1818 && class269.field4311 >= var12 && class165.field2719 >= var13 && class269.field4311 < var14 && class165.field2719 < var15) {
                            for (class196 var18 = (class196) class131.field2187.method1807(-122); var18 != null; var18 = (class196) class131.field2187.method1808((byte) 88)) {
                                if (var18.field3215) {
                                    var18.method1074((byte) -127);
                                    var18.field3213.field1822 = false;
                                }
                            }
                            if (class210.field3368 == 0) {
                                class23.field365 = null;
                                class189.field3092 = null;
                            }
                            class206.field3310 = 0;
                        }
                    }
                    if (var9.field1765) {
                        boolean var19;
                        if (class269.field4311 >= var12 && class165.field2719 >= var13 && class269.field4311 < var14 && class165.field2719 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class216.field3469 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class230.field3666 == 1 && class269.field4320 >= var12 && class111.field1707 >= var13 && class269.field4320 < var14 && class111.field1707 < var15) {
                            var21 = true;
                        }
                        if (var9.field1914 != null) {
                            for (int var22 = 0; var22 < var9.field1914.length; var22++) {
                                if (class13.field184[var9.field1914[var22]]) {
                                    if (var9.field1804 == null || class207.field3336 >= var9.field1804[var22]) {
                                        byte var23 = var9.field1780[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class13.field184[86] && !class13.field184[82] && !class13.field184[81]) && ((var23 & 0x2) == 0 || class13.field184[86]) && ((var23 & 0x1) == 0 || class13.field184[82]) && ((var23 & 0x4) == 0 || class13.field184[81])) {
                                            class276.method1863(69, var22 + 1, var9.field1789, -1, "");
                                            int var24 = var9.field1803[var22];
                                            if (var9.field1804 == null) {
                                                var9.field1804 = new int[var9.field1914.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field1804[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field1804[var22] = class207.field3336 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field1804 != null) {
                                    var9.field1804[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class84.method671(class111.field1707 - var11, var9, class269.field4320 - var10, -3);
                        }
                        if (class23.field365 != null && class23.field365 != var9 && var19 && method1916(var9).method1689((byte) -123)) {
                            class114.field1882 = var9;
                        }
                        if (class189.field3092 == var9) {
                            class140.field2337 = true;
                            class160.field2616 = var10;
                            class212.field3398 = var11;
                        }
                        if (var9.field1879 || var9.field1929 != 0) {
                            if (var19 && class208.field3351 != 0 && var9.field1848 != null) {
                                class196 var25 = new class196();
                                var25.field3215 = true;
                                var25.field3213 = var9;
                                var25.field3203 = class208.field3351;
                                var25.field3205 = var9.field1848;
                                class131.field2187.method1809(5, var25);
                            }
                            if (class23.field365 != null || class174.field2929 != null || class198.field3226 || var9.field1929 != 1400 && class206.field3310 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1929 != 0) {
                                if (var9.field1929 == 1337) {
                                    class181.field3006 = var9;
                                    continue;
                                }
                                if (var9.field1929 == 1338) {
                                    if (var21) {
                                        class172.field2919 = class269.field4320 - var10;
                                        class255.field4061 = class111.field1707 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1929 == 1400) {
                                    class288.field4603 = var9;
                                    if (var21) {
                                        if (class13.field184[82] && class58.field1012 > 0) {
                                            int var26 = (int) ((double) (class269.field4320 - var10 - var9.field1790 / 2) * 2.0D / (double) class170.field2791);
                                            int var27 = (int) ((double) (class111.field1707 - var11 - var9.field1919 / 2) * 2.0D / (double) class170.field2791);
                                            int var28 = class94.field1462 + var26;
                                            int var29 = class22.field343 + var27;
                                            int var30 = class285.field4524 + var28;
                                            int var31 = class31.field524 + class253.field4030 - var29 - 1;
                                            class119 var32 = class104.method778((byte) 116);
                                            int[] var33 = var32.method871(var31, (byte) -124, var30);
                                            if (var33 != null) {
                                                class209.method1393(var33[2], var33[0], var33[1], -25174);
                                                class137.method1033(49);
                                            }
                                            continue;
                                        }
                                        class206.field3310 = 1;
                                        class255.field4064 = class269.field4311;
                                        class14.field220 = class165.field2719;
                                        continue;
                                    }
                                    if (var20 && class206.field3310 > 0) {
                                        if (class206.field3310 == 1 && (class269.field4311 != class255.field4064 || class165.field2719 != class14.field220)) {
                                            class238.field3746 = class94.field1462;
                                            class225.field3588 = class22.field343;
                                            class206.field3310 = 2;
                                        }
                                        if (class206.field3310 == 2) {
                                            class23.method187(255, (int) ((double) (class255.field4064 - class269.field4311) * 2.0D / (double) class199.field3249) + class238.field3746);
                                            class151.method1097((int) ((double) (class14.field220 - class165.field2719) * 2.0D / (double) class199.field3249) + class225.field3588, true);
                                        }
                                        continue;
                                    }
                                    class206.field3310 = 0;
                                    continue;
                                }
                                if (var9.field1929 == 1401) {
                                    if (var20) {
                                        class251.method1668(var9.field1919, class269.field4311 - var10, (byte) -6, class165.field2719 - var11, var9.field1790);
                                    }
                                    continue;
                                }
                                if (var9.field1929 == 1402) {
                                    class72.method556(0, var9);
                                    continue;
                                }
                            }
                            if (!var9.field1814 && var21) {
                                var9.field1814 = true;
                                if (var9.field1856 != null) {
                                    class196 var34 = new class196();
                                    var34.field3215 = true;
                                    var34.field3213 = var9;
                                    var34.field3211 = class269.field4320 - var10;
                                    var34.field3203 = class111.field1707 - var11;
                                    var34.field3205 = var9.field1856;
                                    class131.field2187.method1809(5, var34);
                                }
                            }
                            if (var9.field1814 && var20 && var9.field1837 != null) {
                                class196 var35 = new class196();
                                var35.field3215 = true;
                                var35.field3213 = var9;
                                var35.field3211 = class269.field4311 - var10;
                                var35.field3203 = class165.field2719 - var11;
                                var35.field3205 = var9.field1837;
                                class131.field2187.method1809(5, var35);
                            }
                            if (var9.field1814 && !var20) {
                                var9.field1814 = false;
                                if (var9.field1922 != null) {
                                    class196 var36 = new class196();
                                    var36.field3215 = true;
                                    var36.field3213 = var9;
                                    var36.field3211 = class269.field4311 - var10;
                                    var36.field3203 = class165.field2719 - var11;
                                    var36.field3205 = var9.field1922;
                                    class262.field4157.method1809(5, var36);
                                }
                            }
                            if (var20 && var9.field1854 != null) {
                                class196 var37 = new class196();
                                var37.field3215 = true;
                                var37.field3213 = var9;
                                var37.field3211 = class269.field4311 - var10;
                                var37.field3203 = class165.field2719 - var11;
                                var37.field3205 = var9.field1854;
                                class131.field2187.method1809(5, var37);
                            }
                            if (!var9.field1822 && var19) {
                                var9.field1822 = true;
                                if (var9.field1792 != null) {
                                    class196 var38 = new class196();
                                    var38.field3215 = true;
                                    var38.field3213 = var9;
                                    var38.field3211 = class269.field4311 - var10;
                                    var38.field3203 = class165.field2719 - var11;
                                    var38.field3205 = var9.field1792;
                                    class131.field2187.method1809(5, var38);
                                }
                            }
                            if (var9.field1822 && var19 && var9.field1802 != null) {
                                class196 var39 = new class196();
                                var39.field3215 = true;
                                var39.field3213 = var9;
                                var39.field3211 = class269.field4311 - var10;
                                var39.field3203 = class165.field2719 - var11;
                                var39.field3205 = var9.field1802;
                                class131.field2187.method1809(5, var39);
                            }
                            if (var9.field1822 && !var19) {
                                var9.field1822 = false;
                                if (var9.field1886 != null) {
                                    class196 var40 = new class196();
                                    var40.field3215 = true;
                                    var40.field3213 = var9;
                                    var40.field3211 = class269.field4311 - var10;
                                    var40.field3203 = class165.field2719 - var11;
                                    var40.field3205 = var9.field1886;
                                    class262.field4157.method1809(5, var40);
                                }
                            }
                            if (var9.field1787 != null) {
                                class196 var41 = new class196();
                                var41.field3213 = var9;
                                var41.field3205 = var9.field1787;
                                class12.field165.method1809(5, var41);
                            }
                            if (var9.field1813 != null && class80.field1328 > var9.field1840) {
                                if (var9.field1867 == null || class80.field1328 - var9.field1840 > 32) {
                                    class196 var46 = new class196();
                                    var46.field3213 = var9;
                                    var46.field3205 = var9.field1813;
                                    class131.field2187.method1809(5, var46);
                                } else {
                                    label572: for (int var42 = var9.field1840; var42 < class80.field1328; var42++) {
                                        int var43 = class254.field4046[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field1867.length; var44++) {
                                            if (var9.field1867[var44] == var43) {
                                                class196 var45 = new class196();
                                                var45.field3213 = var9;
                                                var45.field3205 = var9.field1813;
                                                class131.field2187.method1809(5, var45);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field1840 = class80.field1328;
                            }
                            if (var9.field1871 != null && class167.field2749 > var9.field1907) {
                                if (var9.field1925 == null || class167.field2749 - var9.field1907 > 32) {
                                    class196 var51 = new class196();
                                    var51.field3213 = var9;
                                    var51.field3205 = var9.field1871;
                                    class131.field2187.method1809(5, var51);
                                } else {
                                    label548: for (int var47 = var9.field1907; var47 < class167.field2749; var47++) {
                                        int var48 = class283.field4496[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field1925.length; var49++) {
                                            if (var9.field1925[var49] == var48) {
                                                class196 var50 = new class196();
                                                var50.field3213 = var9;
                                                var50.field3205 = var9.field1871;
                                                class131.field2187.method1809(5, var50);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1907 = class167.field2749;
                            }
                            if (var9.field1821 != null && class36.field612 > var9.field1866) {
                                if (var9.field1890 == null || class36.field612 - var9.field1866 > 32) {
                                    class196 var56 = new class196();
                                    var56.field3213 = var9;
                                    var56.field3205 = var9.field1821;
                                    class131.field2187.method1809(5, var56);
                                } else {
                                    label524: for (int var52 = var9.field1866; var52 < class36.field612; var52++) {
                                        int var53 = class291.field4634[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field1890.length; var54++) {
                                            if (var9.field1890[var54] == var53) {
                                                class196 var55 = new class196();
                                                var55.field3213 = var9;
                                                var55.field3205 = var9.field1821;
                                                class131.field2187.method1809(5, var55);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field1866 = class36.field612;
                            }
                            if (var9.field1766 != null && class216.field3465 > var9.field1873) {
                                if (var9.field1900 == null || class216.field3465 - var9.field1873 > 32) {
                                    class196 var61 = new class196();
                                    var61.field3213 = var9;
                                    var61.field3205 = var9.field1766;
                                    class131.field2187.method1809(5, var61);
                                } else {
                                    label500: for (int var57 = var9.field1873; var57 < class216.field3465; var57++) {
                                        int var58 = class32.field538[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field1900.length; var59++) {
                                            if (var9.field1900[var59] == var58) {
                                                class196 var60 = new class196();
                                                var60.field3213 = var9;
                                                var60.field3205 = var9.field1766;
                                                class131.field2187.method1809(5, var60);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1873 = class216.field3465;
                            }
                            if (var9.field1817 != null && class199.field3237 > var9.field1835) {
                                if (var9.field1755 == null || class199.field3237 - var9.field1835 > 32) {
                                    class196 var66 = new class196();
                                    var66.field3213 = var9;
                                    var66.field3205 = var9.field1817;
                                    class131.field2187.method1809(5, var66);
                                } else {
                                    label476: for (int var62 = var9.field1835; var62 < class199.field3237; var62++) {
                                        int var63 = class169.field2760[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field1755.length; var64++) {
                                            if (var9.field1755[var64] == var63) {
                                                class196 var65 = new class196();
                                                var65.field3213 = var9;
                                                var65.field3205 = var9.field1817;
                                                class131.field2187.method1809(5, var65);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1835 = class199.field3237;
                            }
                            if (class152.field2483 > var9.field1831 && var9.field1809 != null) {
                                class196 var67 = new class196();
                                var67.field3213 = var9;
                                var67.field3205 = var9.field1809;
                                class131.field2187.method1809(5, var67);
                            }
                            if (class204.field3288 > var9.field1831 && var9.field1901 != null) {
                                class196 var68 = new class196();
                                var68.field3213 = var9;
                                var68.field3205 = var9.field1901;
                                class131.field2187.method1809(5, var68);
                            }
                            if (class52.field941 > var9.field1831 && var9.field1850 != null) {
                                class196 var69 = new class196();
                                var69.field3213 = var9;
                                var69.field3205 = var9.field1850;
                                class131.field2187.method1809(5, var69);
                            }
                            if (class154.field2505 > var9.field1831 && var9.field1774 != null) {
                                class196 var70 = new class196();
                                var70.field3213 = var9;
                                var70.field3205 = var9.field1774;
                                class131.field2187.method1809(5, var70);
                            }
                            if (class263.field4167 > var9.field1831 && var9.field1849 != null) {
                                class196 var71 = new class196();
                                var71.field3213 = var9;
                                var71.field3205 = var9.field1849;
                                class131.field2187.method1809(5, var71);
                            }
                            var9.field1831 = class61.field1040;
                            if (var9.field1836 != null) {
                                for (int var72 = 0; var72 < class232.field3672; var72++) {
                                    class196 var73 = new class196();
                                    var73.field3213 = var9;
                                    var73.field3212 = class113.field1737[var72];
                                    var73.field3206 = class165.field2708[var72];
                                    var73.field3205 = var9.field1836;
                                    class131.field2187.method1809(5, var73);
                                }
                            }
                            if (class174.field2930 && var9.field1783 != null) {
                                class196 var74 = new class196();
                                var74.field3213 = var9;
                                var74.field3205 = var9.field1783;
                                class131.field2187.method1809(5, var74);
                            }
                        }
                    }
                    if (!var9.field1765 && class23.field365 == null && class174.field2929 == null && !class198.field3226) {
                        if ((var9.field1791 >= 0 || var9.field1845 != 0) && class269.field4311 >= var12 && class165.field2719 >= var13 && class269.field4311 < var14 && class165.field2719 < var15) {
                            if (var9.field1791 >= 0) {
                                class89.field1424 = arg0[var9.field1791];
                            } else {
                                class89.field1424 = var9;
                            }
                        }
                        if (var9.field1898 == 8 && class269.field4311 >= var12 && class165.field2719 >= var13 && class269.field4311 < var14 && class165.field2719 < var15) {
                            class216.field3472 = var9;
                        }
                        if (var9.field1807 > var9.field1919) {
                            class106.method794(var9.field1919, var9, class165.field2719, var9.field1790 + var10, var9.field1807, (byte) -124, var11, class269.field4311);
                        }
                    }
                    if (var9.field1898 == 0) {
                        method1920(arg0, var9.field1789, var12, var13, var14, var15, var10 - var9.field1828, var11 - var9.field1842);
                        if (var9.field1820 != null) {
                            method1920(var9.field1820, var9.field1789, var12, var13, var14, var15, var10 - var9.field1828, var11 - var9.field1842);
                        }
                        class167 var75 = (class167) class91.field1434.method1063((byte) -53, (long) var9.field1789);
                        if (var75 != null) {
                            class26.method237(var75.field2756, var11, var15, var13, var10, var12, (byte) 52, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1921(int arg0) {
        class257.field4085++;
        class87.field1405.method607(83, (byte) 112);
        if (arg0 <= 81) {
            return;
        }
        class87.field1405.method966((byte) 70, class218.method1447(-769845689));
        class87.field1405.method971(3792, class137.field2301);
        field4566++;
        class87.field1405.method971(3792, class33.field557);
        class87.field1405.method966((byte) 104, class163.field2643);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lkj;)Lkj;")
    public static final class114 method1922(class114 arg0) {
        int var1 = method1916(arg0).method1683(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class8.method43(arg0.field1910, (byte) -112);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method160(byte arg0) {
        field4575++;
        class281.method1890(arg0 ^ 0x12);
        class273.field4368 = new class116();
        class57.field1002 = new class159();
        if (class237.field3745 != 0) {
            class23.field366 = new byte[50][];
        }
        class294.method1975(class205.field3294, 75);
        if (class197.field3225 == 0) {
            class136.field2276 = this.getCodeBase().getHost();
            class25.field437 = 43594;
            class277.field4404 = 443;
        } else if (class197.field3225 == 1) {
            class136.field2276 = this.getCodeBase().getHost();
            class277.field4404 = class45.field814 + 50000;
            class25.field437 = class45.field814 + 40000;
        } else if (class197.field3225 == 2) {
            class277.field4404 = class45.field814 + 50000;
            class25.field437 = class45.field814 + 40000;
            class136.field2276 = "127.0.0.1";
        }
        class213.field3423 = class25.field437;
        class113.field1741 = class25.field437;
        if (arg0 != 107) {
            method1927(13);
        }
        class130.field2153 = class136.field2276;
        class42.field779 = class52.field945 = field4581 = class82.field1355 = new short[256];
        if (class78.field1306 == 3 && class197.field3225 != 2) {
            class295.field4680 = class45.field814;
        }
        if (class238.field3752 == 1) {
            class232.field3678 = true;
            class110.field1697 = class201.field3267;
            class113.field1747 = class145.field2395;
            class212.field3397 = class129.field2138;
            class77.field1288 = class96.field1496;
        } else {
            class77.field1288 = class146.field2409;
            class110.field1697 = class152.field2481;
            class212.field3397 = class195.field3199;
            class113.field1747 = class40.field690;
        }
        class236.field3735 = class277.field4404;
        class194.field3176 = class213.field3423;
        class26.method238((byte) -125);
        class69.method538(-30739, class22.field340);
        class197.method1345(class22.field340, -26187);
        class35.field605 = class45.method391(arg0 ^ 0x6B);
        if (class35.field605 != null) {
            class35.field605.method957((byte) -84, class22.field340);
        }
        class233.field3700 = class78.field1306;
        try {
            if (class205.field3294.field1305 != null) {
                class207.field3334 = new class217(class205.field3294.field1305, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class85.field1397[var2] = new class217(class205.field3294.field1289[var2], 6000, 0);
                }
                class89.field1423 = new class217(class205.field3294.field1292, 6000, 0);
                class283.field4487 = new class239(255, class207.field3334, class89.field1423, 500000);
                class249.field3969 = new class217(class205.field3294.field1304, 24, 0);
                class205.field3294.field1304 = null;
                class205.field3294.field1289 = null;
                class205.field3294.field1305 = null;
                class205.field3294.field1292 = null;
            }
        } catch (IOException var3) {
            class283.field4487 = null;
            class89.field1423 = null;
            class249.field3969 = null;
            class207.field3334 = null;
        }
        class281.field4449 = class228.field3635;
        if (class197.field3225 != 0) {
            class258.field4095 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1923(int arg0) {
        if (!class234.field3710) {
            label237: while (true) {
                do {
                    if (!class174.method1249((byte) 78)) {
                        break label237;
                    }
                } while (class216.field3457 != 's' && class216.field3457 != 'S');
                class234.field3710 = true;
            }
        }
        field4562++;
        if (class286.field4557 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class62.method472(arg0 ^ 0x79);
            if (class104.field1585 == 0L) {
                class104.field1585 = var4;
            }
            if (var3 > 16384 && var4 - class104.field1585 < 5000L) {
                if ((var4 - class80.field1321) > 1000L) {
                    System.gc();
                    class80.field1321 = var4;
                }
                class219.field3512 = 5;
                class43.field783 = class96.field1497;
            } else {
                class219.field3512 = 5;
                class43.field783 = class89.field1427;
                class286.field4557 = 10;
            }
        } else if (class286.field4557 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class141.field2352[var6] = new class13(104, 104);
            }
            class43.field783 = class65.field1068;
            class286.field4557 = 30;
            class219.field3512 = 10;
        } else if (class286.field4557 == 30) {
            if (class114.field1834 == null) {
                class114.field1834 = new class233(class57.field1002, class273.field4368);
            }
            if (class114.field1834.method1539(-17095)) {
                class2.field21 = class278.method1871(true, false, (byte) 73, true, 0);
                class185.field3045 = class278.method1871(true, false, (byte) 103, true, 1);
                class219.field3513 = class278.method1871(false, true, (byte) 123, true, 2);
                class262.field4160 = class278.method1871(true, false, (byte) 39, true, 3);
                class205.field3300 = class278.method1871(true, false, (byte) 32, true, 4);
                class91.field1431 = class278.method1871(true, true, (byte) 119, true, 5);
                class10.field134 = class278.method1871(true, true, (byte) 81, false, 6);
                class197.field3219 = class278.method1871(true, false, (byte) 76, true, 7);
                class35.field594 = class278.method1871(true, false, (byte) 56, true, 8);
                class176.field2942 = class278.method1871(true, false, (byte) 79, true, 9);
                class268.field4305 = class278.method1871(true, false, (byte) 116, true, 10);
                class94.field1471 = class278.method1871(true, false, (byte) 72, true, 11);
                class234.field3712 = class278.method1871(true, false, (byte) 64, true, 12);
                class209.field3358 = class278.method1871(true, false, (byte) 97, true, 13);
                class240.field3778 = class278.method1871(true, false, (byte) 73, false, 14);
                class144.field2385 = class278.method1871(true, false, (byte) 70, true, 15);
                class268.field4297 = class278.method1871(true, false, (byte) 48, true, 16);
                class198.field3228 = class278.method1871(true, false, (byte) 48, true, 17);
                class129.field2134 = class278.method1871(true, false, (byte) 57, true, 18);
                class267.field4282 = class278.method1871(true, false, (byte) 96, true, 19);
                class4.field58 = class278.method1871(true, false, (byte) 76, true, 20);
                class285.field4543 = class278.method1871(true, false, (byte) 67, true, 21);
                class131.field2177 = class278.method1871(true, false, (byte) 109, true, 22);
                class184.field3035 = class278.method1871(true, true, (byte) 117, true, 23);
                class252.field4012 = class278.method1871(true, false, (byte) 97, true, 24);
                class116.field1950 = class278.method1871(true, false, (byte) 35, true, 25);
                class92.field1446 = class278.method1871(true, true, (byte) 47, true, 26);
                class134.field2222 = class278.method1871(true, false, (byte) 68, true, 27);
                class233.field3699 = class278.method1871(true, true, (byte) 59, true, 28);
                class219.field3512 = 15;
                class286.field4557 = 40;
                class43.field783 = class241.field3795;
            } else {
                class43.field783 = class91.field1443;
                class219.field3512 = 12;
            }
        } else if (class286.field4557 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class267.field4276[var8].method402(13918) * class56.field994[var8] / 100;
            }
            if (var7 == 100) {
                class219.field3512 = 20;
                class43.field783 = class184.field3036;
                class119.method874(class35.field594, (byte) -116);
                class270.method1836(false, class35.field594);
                class217.method1441(class35.field594, (byte) -98);
                class286.field4557 = 41;
            } else {
                class219.field3512 = 20;
                if (var7 != 0) {
                    class43.field783 = class239.field3760 + var7 + "%";
                }
            }
        } else if (class286.field4557 == 41) {
            if (class233.field3699.method895(false)) {
                this.method1917(true, class233.field3699.method897(false, 1));
                class43.field783 = class3.field41;
                class219.field3512 = 25;
                class286.field4557 = 45;
            } else {
                class43.field783 = class33.field556 + class233.field3699.method893(true) + "%";
                class219.field3512 = 25;
            }
        } else if (class286.field4557 == 45) {
            class55.method446(2, 18047, 22050, class179.field2991);
            class265.field4239 = new class25();
            class265.field4239.method231(9, 17027, 128);
            class165.field2709 = class71.method549(class22.field340, true, 0, class205.field3294, 22050);
            class165.field2709.method1593(class265.field4239, (byte) 101);
            class31.method271(class240.field3778, 21588, class144.field2385, class205.field3300, class265.field4239);
            class212.field3396 = class71.method549(class22.field340, true, 1, class205.field3294, 2048);
            class145.field2394 = new class173();
            class212.field3396.method1593(class145.field2394, (byte) 101);
            class137.field2310 = new class106(22050, class23.field359);
            class97.field1509 = class10.field134.method889("scape main", -1);
            class43.field783 = field4580;
            class219.field3512 = 30;
            class286.field4557 = 50;
        } else if (class286.field4557 == 50) {
            int var9 = class151.method1098(class209.field3358, class35.field594, (byte) -21);
            int var10 = class108.method807((byte) 58);
            if (var10 > var9) {
                class43.field783 = class285.field4549 + var9 * 100 / var10 + "%";
                class219.field3512 = 35;
            } else {
                class219.field3512 = 35;
                class286.field4557 = 60;
                class43.field783 = class152.field2488;
            }
        } else if (class286.field4557 == arg0) {
            int var11 = class180.method1270(false, class35.field594);
            int var12 = class135.method964(2);
            if (var12 > var11) {
                class219.field3512 = 40;
                class43.field783 = class107.field1631 + var11 * 100 / var12 + "%";
            } else {
                class286.field4557 = 65;
                class219.field3512 = 40;
                class43.field783 = class165.field2690;
            }
        } else if (class286.field4557 == 65) {
            class294.method1971(arg0 + 16860, class35.field594, class209.field3358);
            class219.field3512 = 45;
            class43.field783 = class244.field3858;
            class274.method1856(5, 5);
            class286.field4557 = 70;
        } else if (class286.field4557 == 70) {
            byte var13 = 0;
            class219.field3513.method895(false);
            int var14 = var13 + class219.field3513.method893(true);
            class268.field4297.method895(false);
            int var15 = var14 + class268.field4297.method893(true);
            class198.field3228.method895(false);
            int var16 = var15 + class198.field3228.method893(true);
            class129.field2134.method895(false);
            int var17 = var16 + class129.field2134.method893(true);
            class267.field4282.method895(false);
            int var18 = var17 + class267.field4282.method893(true);
            class4.field58.method895(false);
            int var19 = var18 + class4.field58.method893(true);
            class285.field4543.method895(false);
            int var20 = var19 + class285.field4543.method893(true);
            class131.field2177.method895(false);
            int var21 = var20 + class131.field2177.method893(true);
            class252.field4012.method895(false);
            int var22 = var21 + class252.field4012.method893(true);
            class116.field1950.method895(false);
            int var23 = var22 + class116.field1950.method893(true);
            class134.field2222.method895(false);
            int var24 = var23 + class134.field2222.method893(true);
            if (var24 < 1100) {
                class219.field3512 = 50;
                class43.field783 = class156.field2541 + var24 / 11 + "%";
            } else {
                class77.method622(class219.field3513, 79);
                class228.method1520(arg0 - 60, class219.field3513);
                class44.method381((byte) -71, class219.field3513);
                class192.method1321(class197.field3219, arg0 + 64, class219.field3513);
                class118.method865(true, arg0 - 15279, class268.field4297, class197.field3219);
                class179.method1266(arg0 - 12931, class129.field2134, class197.field3219);
                class105.method783(class267.field4282, 6456, true, class197.field3219, class223.field3554);
                class3.method14(true, class219.field3513);
                class60.method467(class4.field58, class185.field3045, -1, class2.field21);
                class87.method684(class219.field3513, (byte) -124);
                class251.method1673(class285.field4543, arg0 - 59, class197.field3219);
                class69.method542(class131.field2177, (byte) -121);
                class110.method821(false, class219.field3513);
                class8.method45(class262.field4160, class35.field594, class209.field3358, (byte) -69, class197.field3219);
                class106.method790(class219.field3513, (byte) 96);
                class154.method1115(class198.field3228, 84);
                class174.method1246(class116.field1950, 1, new class251(), class252.field4012);
                method1918((byte) -83, class116.field1950, class252.field4012);
                class40.method328((byte) 88, class219.field3513);
                class82.method656(class219.field3513, true);
                class146.method1073(true, class219.field3513);
                class140.method1042((byte) -101, class35.field594, class219.field3513);
                class152.method1106(class35.field594, (byte) 104, class219.field3513);
                class219.field3512 = 50;
                class43.field783 = class75.field1231;
                class157.method1136(16);
                class286.field4557 = 80;
            }
        } else if (class286.field4557 == 80) {
            int var25 = class89.method691(class35.field594, (byte) 101);
            int var26 = class152.method1104((byte) 53);
            if (var25 < var26) {
                class219.field3512 = 60;
                class43.field783 = class295.field4678 + var25 * 100 / var26 + "%";
            } else {
                class195.method1332(class35.field594, arg0 - 64);
                class286.field4557 = 90;
                class219.field3512 = 60;
                class43.field783 = class76.field1248;
            }
        } else if (class286.field4557 == 90) {
            if (class92.field1446.method895(false)) {
                class283 var27 = new class283(class176.field2942, class92.field1446, class35.field594, 20, !class112.field1731);
                class95.method719(var27);
                if (class220.field3520 == 1) {
                    class95.method716(0.9F);
                }
                if (class220.field3520 == 2) {
                    class95.method716(0.8F);
                }
                if (class220.field3520 == 3) {
                    class95.method716(0.7F);
                }
                if (class220.field3520 == 4) {
                    class95.method716(0.6F);
                }
                class286.field4557 = 100;
                class43.field783 = class277.field4403;
                class219.field3512 = 70;
            } else {
                class43.field783 = class224.field3578 + class92.field1446.method893(true) + "%";
                class219.field3512 = 70;
            }
        } else if (class286.field4557 == 100) {
            if (class32.method275(class35.field594, 7121)) {
                class286.field4557 = 110;
            }
        } else if (class286.field4557 == 110) {
            class59.field1013 = new class209();
            class205.field3294.method628(10, class59.field1013, (byte) 82);
            class219.field3512 = 75;
            class43.field783 = class279.field4429;
            class286.field4557 = 120;
        } else if (class286.field4557 == 120) {
            if (class268.field4305.method898("", 12213, "huffman")) {
                class263 var28 = new class263(class268.field4305.method906("", "huffman", (byte) -120));
                class49.method419(var28, arg0 - 60);
                class43.field783 = class23.field363;
                class219.field3512 = 80;
                class286.field4557 = 130;
            } else {
                class43.field783 = class105.field1607 + "0%";
                class219.field3512 = 80;
            }
        } else if (class286.field4557 == 130) {
            if (!class262.field4160.method895(false)) {
                class43.field783 = class29.field508 + class262.field4160.method893(true) * 3 / 4 + "%";
                class219.field3512 = 85;
            } else if (!class234.field3712.method895(false)) {
                class43.field783 = class29.field508 + (class234.field3712.method893(true) / 10 + 75) + "%";
                class219.field3512 = 85;
            } else if (!class209.field3358.method895(false)) {
                class43.field783 = class29.field508 + ((class209.field3358.method893(true) / 20) + 85) + "%";
                class219.field3512 = 85;
            } else if (class184.field3035.method902("details", (byte) 102)) {
                class283.method1900(class184.field3035, 0, class34.field567);
                class121.method879(class197.field3219);
                class219.field3512 = 95;
                class43.field783 = class160.field2612;
                class286.field4557 = 135;
            } else {
                class43.field783 = class29.field508 + (class184.field3035.method886((byte) -78, "details") / 10 + 90) + "%";
                class219.field3512 = 85;
            }
        } else if (class286.field4557 == 135) {
            int var29 = class199.method1353((byte) 56);
            if (var29 == -1) {
                class219.field3512 = 95;
                class43.field783 = class210.field3366;
            } else if (var29 == 7 || var29 == 9) {
                this.method163("worldlistfull", -2);
                class274.method1856(1000, 5);
            } else if (class185.field3037) {
                class219.field3512 = 96;
                class43.field783 = class11.field152;
                class286.field4557 = 140;
            } else {
                this.method163("worldlistio_" + var29, -2);
                class274.method1856(1000, arg0 - 55);
            }
        } else if (class286.field4557 == 140) {
            class250.field3984 = class262.field4160.method889("loginscreen", arg0 - 61);
            class91.field1431.method908(-17338, false, true);
            class10.field134.method908(-17338, true, true);
            class35.field594.method908(arg0 ^ 0xFFFFBC7A, true, true);
            class209.field3358.method908(arg0 - 17398, true, true);
            class268.field4305.method908(arg0 - 17398, true, true);
            class262.field4160.method908(-17338, true, true);
            class219.field3512 = 97;
            class251.field3998 = true;
            class43.field783 = class82.field1364;
            class286.field4557 = 150;
        } else if (class286.field4557 == 150) {
            if (class234.field3710) {
                class163.field2643 = 0;
                class282.field4476 = 0;
                class179.field2990 = 0;
                class255.field4071 = 0;
            }
            class234.field3710 = true;
            class112.method829(class205.field3294, 16751);
            class245.method1632(-89, class179.field2990, false, -1, -1);
            class219.field3512 = 100;
            class43.field783 = class213.field3433;
            class286.field4557 = 160;
        } else if (class286.field4557 == 160) {
            class256.method1710(-16454, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method152(int arg0) {
        if (arg0 > -63) {
            this.method152(60);
        }
        if (class59.field1013 != null) {
            class59.field1013.field3359 = false;
        }
        class59.field1013 = null;
        if (class23.field360 != null) {
            class23.field360.method294((byte) -122);
            class23.field360 = null;
        }
        field4559++;
        class75.method599(-11987, class22.field340);
        class245.method1625((byte) 41, class22.field340);
        if (class35.field605 != null) {
            class35.field605.method959(2, class22.field340);
        }
        class161.method1171(-105);
        class189.method1307(1);
        class35.field605 = null;
        if (class165.field2709 != null) {
            class165.field2709.method1592((byte) -2);
        }
        if (class212.field3396 != null) {
            class212.field3396.method1592((byte) -2);
        }
        class57.field1002.method1145((byte) -128);
        class273.field4368.method859(12363);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method156(byte arg0) {
        field4570++;
        if (class146.field2401 == 1000) {
            return;
        }
        class207.field3336++;
        if (arg0 != -121) {
            return;
        }
        if (class207.field3336 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class58.field1008 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class258.field4107.setSeed((long) class58.field1008);
        }
        this.method1926(1402);
        if (class114.field1834 != null) {
            class114.field1834.method1542(arg0 - 15517);
        }
        class111.method823((byte) 0);
        class260.method1738(true);
        class186.method1291(true);
        class216.method1433(false);
        if (class35.field605 != null) {
            int var3 = class35.field605.method956(64);
            class208.field3351 = var3;
        }
        if (class146.field2401 == 0) {
            this.method1923(60);
            class151.method1099(arg0 ^ 0xFFFFFFE3);
        } else if (class146.field2401 == 5) {
            this.method1923(60);
            class151.method1099(116);
        } else if (class146.field2401 == 25 || class146.field2401 == 28) {
            class15.method104(0);
        }
        if (class146.field2401 == 10) {
            this.method1919(arg0 ^ 0xFFFF8AB7);
            class19.method164((byte) 105);
            class263.method1768((byte) -38);
            class208.method1390(arg0 ^ 0x72);
        } else if (class146.field2401 == 30) {
            class131.method948((byte) -100);
        } else if (class146.field2401 == 40) {
            class208.method1390(-11);
            if (class106.field1615 != -3) {
                if (class106.field1615 == 15) {
                    class164.method1182(arg0 + 120);
                } else if (class106.field1615 != 2) {
                    class31.method270(31377);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field4571++;
        try {
            if (arg0.length != 4) {
                class8.method39(43, "argument count");
            }
            class45.field814 = Integer.parseInt(arg0[0]);
            class197.field3225 = 2;
            if (arg0[1].equals("live")) {
                class237.field3745 = 0;
            } else if (arg0[1].equals("rc")) {
                class237.field3745 = 1;
            } else if (arg0[1].equals("wip")) {
                class237.field3745 = 2;
            } else {
                class8.method39(62, "modewhat");
            }
            class47.field869 = false;
            class145.field2391 = class69.method541(10743, arg0[2]);
            if (class145.field2391 == -1) {
                if (arg0[2].equals("english")) {
                    class145.field2391 = 0;
                } else if (arg0[2].equals("german")) {
                    class145.field2391 = 1;
                } else {
                    class8.method39(75, "language");
                }
            }
            class137.method1034((byte) 35, class145.field2391);
            class137.field2309 = false;
            class229.field3646 = false;
            if (arg0[3].equals("game0")) {
                class238.field3752 = 0;
            } else if (arg0[3].equals("game1")) {
                class238.field3752 = 1;
            } else {
                class8.method39(49, "game");
            }
            class237.field3743 = 0;
            class252.field4019 = 0;
            class241.field3801 = "";
            class217.field3480 = false;
            client var1 = new client();
            class208.field3344 = var1;
            var1.method154(class237.field3745 + 32, 29, 768, "runescape", (byte) 87, 1024, 538, false);
            class207.field3327.setLocation(40, 40);
        } catch (Exception var3) {
            class161.method1167(var3, -126, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1924(byte arg0) {
        field4568++;
        if (class259.field4117 < class57.field1002.field2594) {
            if (class194.field3176 == class113.field1741) {
                class194.field3176 = class236.field3735;
            } else {
                class194.field3176 = class113.field1741;
            }
            class52.field943 = (class57.field1002.field2594 - 1) * 5 * 50;
            if (class52.field943 > 3000) {
                class52.field943 = 3000;
            }
            if (class57.field1002.field2594 >= 2 && class57.field1002.field2592 == 6) {
                this.method163("js5connect_outofdate", -2);
                class146.field2401 = 1000;
                return;
            }
            if (class57.field1002.field2594 >= 4 && class57.field1002.field2592 == -1) {
                this.method163("js5crc", -2);
                class146.field2401 = 1000;
                return;
            }
            if (class57.field1002.field2594 >= 4 && (class146.field2401 == 0 || class146.field2401 == 5)) {
                if (class57.field1002.field2592 == 7 || class57.field1002.field2592 == 9) {
                    this.method163("js5connect_full", -2);
                } else if (class57.field1002.field2592 <= 0) {
                    this.method163("js5io", -2);
                } else {
                    this.method163("js5connect", -2);
                }
                class146.field2401 = 1000;
                return;
            }
        }
        class259.field4117 = class57.field1002.field2594;
        if (class52.field943 > 0) {
            class52.field943--;
            return;
        }
        try {
            if (class130.field2159 == 0) {
                class61.field1036 = class205.field3294.method637(class130.field2153, class194.field3176, (byte) -59);
                class130.field2159++;
            }
            if (class130.field2159 == 1) {
                if (class61.field1036.field1937 == 2) {
                    this.method1925(1000, (byte) 52);
                    return;
                }
                if (class61.field1036.field1937 == 1) {
                    class130.field2159++;
                }
            }
            if (class130.field2159 == 2) {
                class218.field3510 = new class35((Socket) class61.field1036.field1936, class205.field3294);
                class136 var2 = new class136(5);
                var2.method966((byte) 109, 15);
                var2.method1029(538, 15430);
                class218.field3510.method301(5, 0, var2.field2263, (byte) 123);
                class130.field2159++;
                field4579 = class62.method472(58);
            }
            if (class130.field2159 == 3) {
                if (class146.field2401 == 0 || class146.field2401 == 5 || class218.field3510.method296(66) > 0) {
                    int var3 = class218.field3510.method295(-8922);
                    if (var3 != 0) {
                        this.method1925(var3, (byte) 108);
                        return;
                    }
                    class130.field2159++;
                } else if (class62.method472(49) - field4579 > 30000L) {
                    this.method1925(1001, (byte) 105);
                    return;
                }
            }
            if (arg0 > 39 && class130.field2159 == 4) {
                boolean var4 = class146.field2401 == 5 || class146.field2401 == 10 || class146.field2401 == 28;
                class57.field1002.method1147(class218.field3510, true, !var4);
                class61.field1036 = null;
                class218.field3510 = null;
                class130.field2159 = 0;
            }
        } catch (IOException var5) {
            this.method1925(1002, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1925(int arg0, byte arg1) {
        field4572++;
        class57.field1002.field2594++;
        class57.field1002.field2592 = arg0;
        class130.field2159 = 0;
        class61.field1036 = null;
        class218.field3510 = null;
        if (arg1 < 0) {
            method1920((class114[]) null, -125, -80, -101, -112, 51, 74, -22);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1926(int arg0) {
        field4561++;
        boolean var2 = class57.field1002.method1152(-513);
        if (arg0 == 1402 && !var2) {
            this.method1924((byte) 95);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field4569 = null;
        field4582 = null;
        field4577 = null;
        if (arg0 > 9) {
            field4581 = null;
            field4580 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lkj;)Z")
    public static final boolean method1928(class114 arg0) {
        if (class199.field3247) {
            if (method1916(arg0).field4028 != 0) {
                return false;
            }
            if (arg0.field1898 == 0) {
                return false;
            }
        }
        return arg0.field1885;
    }
}
