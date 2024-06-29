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
public class client extends class113 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
    public static int[] field4069 = new int[32];

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
    public static int[] field4078;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    public static int[] field4079;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lok;")
    public static class146 field4082;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lok;")
    private static class146 field4086;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
    public static int[] field4087;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lok;")
    public static class146 field4084;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lgj;")
    public static class224 field4080;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
    public static boolean field4088;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIZB)V", line = 8)
    public static final void method1788(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        if (arg6 != 76) {
            method1791(-24);
        }
        field4066++;
        if (arg2) {
            class271.method1968();
        }
        if (class18.field358 != null && (arg3 != 3 || class124.field2020 != arg4 || class275.field4727 != arg0)) {
            class71.method527((byte) -12, class18.field358, class232.field3876);
            class18.field358 = null;
        }
        if (arg3 == 3 && class18.field358 == null) {
            class18.field358 = class225.method1663(true, 0, arg4, class232.field3876, 0, arg0);
            if (class18.field358 != null) {
                class275.field4727 = arg0;
                class124.field2020 = arg4;
                class166.method1291(-13383, class232.field3876);
            }
        }
        if (arg3 == 3 && class18.field358 == null) {
            method1788(-1, arg1, true, class91.field1435, -1, true, (byte) 76);
            return;
        }
        Container var7;
        if (class18.field358 != null) {
            var7 = class18.field358;
        } else if (class144.field2418 == null) {
            var7 = class232.field3876.field2162;
        } else {
            var7 = class144.field2418;
        }
        class72.field1173 = var7.getSize().width;
        class248.field4170 = var7.getSize().height;
        if (class144.field2418 == var7) {
            Insets var8 = class144.field2418.getInsets();
            class248.field4170 -= var8.top + var8.bottom;
            class72.field1173 -= var8.right + var8.left;
        }
        if (arg3 < 2) {
            class310.field5284 = 0;
            class56.field997 = 503;
            class63.field1091 = (class72.field1173 - 765) / 2;
            class148.field2518 = 765;
        } else {
            class56.field997 = class248.field4170;
            class148.field2518 = class72.field1173;
            class63.field1091 = 0;
            class310.field5284 = 0;
        }
        if (arg5) {
            class25.method169((byte) 102, class75.field1228);
            class228.method1682(class75.field1228, 0);
            if (class5.field108 != null) {
                class5.field108.method460(class75.field1228, arg6 - 76);
            }
            class151.field2569.method769(false);
            class250.method1825(class75.field1228, (byte) -105);
            class41.method291((byte) 101, class75.field1228);
            if (class5.field108 != null) {
                class5.field108.method461((byte) 127, class75.field1228);
            }
        } else {
            if (class271.field4640) {
                class271.method1970(class148.field2518, class56.field997);
            }
            class75.field1228.setSize(class148.field2518, class56.field997);
            if (class144.field2418 == var7) {
                Insets var9 = class144.field2418.getInsets();
                class75.field1228.setLocation(class63.field1091 + var9.left, var9.top - -class310.field5284);
            } else {
                class75.field1228.setLocation(class63.field1091, class310.field5284);
            }
        }
        if (arg3 == 0 && arg1 > 0) {
            class271.method1987(class75.field1228);
        }
        if (arg2 && arg3 > 0) {
            class75.field1228.setIgnoreRepaint(true);
            if (!class260.field4329) {
                class195.method1505();
                class139.field2307 = null;
                class139.field2307 = class57.method453(class75.field1228, class148.field2518, class56.field997, 0);
                class181.method1439();
                if (class238.field3973 == 5) {
                    class164.method1274(class39.field695, true, true);
                } else {
                    class55.method445(false, arg6 ^ 0x4C, class71.field1169);
                }
                try {
                    Graphics var10 = class75.field1228.getGraphics();
                    class139.field2307.method147(0, 0, var10, 99);
                } catch (Exception var14) {
                }
                class206.method1561(true);
                if (arg1 == 0) {
                    class139.field2307 = class57.method453(class75.field1228, 765, 503, 0);
                } else {
                    class139.field2307 = null;
                }
                class256 var12 = class232.field3876.method917((byte) -116, class151.field2569.getClass());
                while (var12.field4265 == 0) {
                    class281.method2041((byte) 120, 100L);
                }
                if (var12.field4265 == 1) {
                    class260.field4329 = true;
                }
            }
            if (class260.field4329) {
                class271.method1980(class75.field1228, class147.field2502 * 2);
            }
        }
        if (!class271.field4640 && arg3 > 0) {
            method1788(-1, arg1, true, 0, -1, true, (byte) 76);
            return;
        }
        if (arg3 > 0 && arg1 == 0) {
            class316.field5367.setPriority(5);
            class139.field2307 = null;
            class220.method1620();
            ((class120) class109.field1747).method839(200, (byte) -116);
            if (class102.field1641) {
                class109.method728(0.7F);
            }
            class273.method1994((byte) 104);
        } else if (arg3 == 0 && arg1 > 0) {
            class316.field5367.setPriority(1);
            class139.field2307 = class57.method453(class75.field1228, 765, 503, arg6 ^ 0x4C);
            class220.method1623();
            class284.method2050();
            ((class120) class109.field1747).method839(20, (byte) -63);
            if (class102.field1641) {
                if (class273.field4684 == 1) {
                    class109.method728(0.9F);
                }
                if (class273.field4684 == 2) {
                    class109.method728(0.8F);
                }
                if (class273.field4684 == 3) {
                    class109.method728(0.7F);
                }
                if (class273.field4684 == 4) {
                    class109.method728(0.6F);
                }
            }
            class286.method2060();
            class273.method1994((byte) 95);
        }
        class303.field5201 = !class322.method2236(-7750);
        if (arg2) {
            class88.method611(-2543);
        }
        if (arg3 >= 2) {
            class115.field1846 = true;
        } else {
            class115.field1846 = false;
        }
        if (class236.field3943 != -1) {
            class76.method555(true, 0);
        }
        if (class98.field1582 != null && (class238.field3973 == 30 || class238.field3973 == 25)) {
            class93.method644(0);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class14.field264[var13] = true;
        }
        class133.field2236 = true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lr;)I", line = 247)
    public static final int method1789(class264 arg0) {
        class101 var1 = (class101) class64.field1104.method810((byte) -93, ((long) arg0.field4461 << 32) + (long) arg0.field4417);
        return var1 == null ? arg0.field4431 : var1.field1627;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 261)
    public final void method765(int arg0) {
        field4072++;
        if (class238.field3973 == 1000) {
            return;
        }
        class203.field3385++;
        if ((class203.field3385 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class202.field3368 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class310.field5266.setSeed((long) class202.field3368);
        }
        this.method1797(true);
        if (class214.field3531 != null) {
            class214.field3531.method16(127);
        }
        class283.method2048(false);
        class3.method9(-80);
        class309.method2178(arg0 + 107);
        class267.method1945((byte) 50);
        if (class271.field4640) {
            class68.method507();
        }
        if (class5.field108 != null) {
            int var3 = class5.field108.method459((byte) 123);
            class236.field3947 = var3;
        }
        if (class238.field3973 == arg0) {
            this.method1800((byte) -89);
            class146.method1091(arg0 ^ 0x40A3);
        } else if (class238.field3973 == 5) {
            this.method1800((byte) -48);
            class146.method1091(16547);
        } else if (class238.field3973 == 25 || class238.field3973 == 28) {
            class171.method1327((byte) 79);
        }
        if (class238.field3973 == 10) {
            this.method1794((byte) 126);
            class187.method1457(16650);
            class165.method1285(0);
            class169.method1311(1027);
        } else if (class238.field3973 == 30) {
            class241.method1752(false);
        } else if (class238.field3973 == 40) {
            class169.method1311(arg0 ^ 0x403);
            if (class101.field1633 != -3) {
                if (class101.field1633 == 15) {
                    class263.method1902(38);
                } else if (class101.field1633 != 2) {
                    class239.method1743(arg0 ^ 0x77);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 356)
    public final void method771(boolean arg0) {
        field4065++;
        method1791(4);
        class146.method1109(arg0);
        class133.method985((byte) -115);
        class194.method1500(12800);
        class280.method2035(0);
        class113.method772(14777);
        class271.method1956();
        class64.method494(-68);
        class20.method144(3555);
        class60.method467(3842);
        class197.method1522(true);
        class47.method371(108);
        class40.method283(0);
        class156.method1214(0);
        class147.method1132((byte) -58);
        class4.method14(22496);
        class32.method232(-109);
        class15.method108(115);
        class62.method484(127);
        class245.method1773((byte) 127);
        class117.method800((byte) -108);
        class282.method2046(0);
        class224.method1654(-62);
        class144.method1069(110);
        class264.method1903(-2);
        class87.method606(true);
        class234.method1720(123);
        class160.method1255(80);
        class70.method522(false);
        class118.method811(124);
        class249.method1822(32);
        class211.method1583((byte) -45);
        class288.method2077(-109);
        class128.method890(-18104);
        class192.method1479((byte) 6);
        class200.method1539(-13798);
        class95.method658(-115);
        class287.method2062(2);
        class318.method2212((byte) -124);
        class11.method69(true);
        class185.method1449(0);
        class301.method2133((byte) 86);
        class142.method1044(0);
        class171.method1326(1302);
        class151.method1192(-2828);
        class135.method996(-7168);
        class121.method843(37);
        class254.method1849(1);
        class214.method1594(-1643851351);
        class63.method487(0);
        class263.method1901(61);
        class137.method1010(0);
        class265.method1925((byte) -67);
        class76.method554(125);
        class216.method1604(124);
        class1.method2(1);
        class123.method851(-109);
        class103.method702(-12);
        class85.method597(17666);
        class5.method33(-11411);
        class71.method524(false);
        class267.method1939((byte) 97);
        class231.method1697();
        class225.method1661(27635);
        class130.method963();
        class50.method411(0);
        class176.method1377();
        class248.method1803(78);
        class220.method1629();
        class305.method2152(false);
        class37.method262(true);
        class235.method1725((byte) 123);
        class215.method1598((byte) 122);
        class68.method506();
        class119.method816(124);
        class210.method1578(-79);
        class84.method590(0);
        class28.method181(3000);
        class30.method208();
        class155.method1210(true);
        class51.method417((byte) -112);
        class257.method1865();
        class43.method300(-317337008);
        class92.method633((byte) -1);
        class261.method1890(false);
        class246.method1785();
        class53.method432();
        class266.method1937(1);
        class127.method869(-61);
        class320.method2230(89);
        class115.method781(false);
        class18.method136(128);
        class181.method1418();
        class277.method2013((byte) -125);
        class177.method1405(23326);
        class319.method2226(115);
        class232.method1701(25446);
        class195.method1502(arg0);
        class9.method67((byte) -80);
        class145.method1075(11448);
        class274.method2001((byte) -118);
        class222.method1639(9104);
        class157.method1233(88);
        class25.method167(!arg0);
        class104.method708(-123);
        class72.method531((byte) -104);
        class140.method1028(-20);
        class79.method568(false);
        class134.method990(227);
        class45.method313(true);
        class169.method1307(-123);
        class250.method1834(-39);
        class251.method1837(-103);
        class226.method1669(-5);
        class35.method252(127);
        class120.method836(0);
        class96.method669(4);
        class167.method1295((byte) -68);
        class109.method730();
        class82.method581(false);
        class174.method1344(13500);
        class75.method550((byte) 125);
        class3.method11(-28316);
        class228.method1680(-98);
        class292.method2088((byte) 125);
        class243.method1757();
        class269.method1949(true);
        class31.method223((byte) -99);
        class293.method2092((byte) -86);
        class124.method852(-2418);
        class322.method2235(0);
        class175.method1346(-60);
        class286.method2058();
        class311.method2187(false);
        class302.method2139(-1);
        class278.method2022(-8);
        class19.method139((byte) -105);
        class164.method1283(0);
        class241.method1749(8902);
        class217.method1607(200);
        class162.method1267();
        class230.method1687((byte) -113);
        class182.method1440(65);
        class279.method2026((byte) -50);
        class196.method1512((byte) -126);
        class240.method1746();
        class89.method618(-1);
        class48.method404();
        class186.method1456();
        class173.method1338(14892);
        class187.method1461((byte) -108);
        class239.method1742(0);
        class158.method1239((byte) -44);
        class258.method1874(true);
        class206.method1565(-4689);
        class132.method982(62);
        class283.method2047(true);
        class33.method241((byte) -87);
        class255.method1854();
        class297.method2110((byte) 65);
        class78.method563((byte) -6);
        class131.method970();
        class41.method296(119);
        class46.method324(false);
        class106.method716(0);
        class298.method2112(0);
        class101.method691(-13492);
        class203.method1546(0);
        class161.method1262(-32768);
        class116.method787(-1);
        class88.method614(!arg0);
        class97.method673(117);
        class295.method2099((byte) 16);
        class138.method1014((byte) 7);
        class98.method677(-1466711632);
        class83.method588(4);
        class252.method1843(-16);
        class81.method577((byte) 110);
        class306.method2154(-7823);
        class207.method1570(-89);
        class238.method1738(false);
        class38.method266();
        class296.method2107(0);
        class223.method1645(!arg0);
        class321.method2232(27753);
        class303.method2142((byte) 79);
        class17.method132(8);
        class189.method1465((byte) -106);
        class270.method1951();
        class136.method1002();
        class291.method2084();
        class94.method646(19250);
        class165.method1288(40);
        class221.method1634();
        class77.method558();
        class227.method1674(180);
        class99.method687(64);
        class29.method188();
        class16.method129();
        class93.method642(!arg0);
        class202.method1542(2834);
        class262.method1892((byte) 49);
        class23.method159(false);
        class73.method537((byte) -31);
        class199.method1534(127);
        class190.method1466(137);
        class276.method2009(123);
        class191.method1474(-1);
        class273.method1996(107);
        class198.method1524(44);
        class272.method1991(4957);
        class80.method573(arg0);
        class22.method155(0);
        class112.method754((byte) 54);
        class168.method1300(arg0);
        class300.method2116((byte) -85);
        class179.method1410(-116);
        class56.method448(true);
        class310.method2182(-57);
        class27.method177(0);
        class26.method171(0);
        class236.method1726((byte) 11);
        class150.method1185((byte) -121);
        class316.method2211(-15);
        class143.method1051(6);
        class183.method1445(-121);
        class139.method1022(-128);
        class74.method545((byte) -79);
        class66.method497((byte) 123);
        class13.method77(-81);
        class242.method1754(64);
        class205.method1558(6051);
        class275.method2005((byte) 25);
        class91.method628((byte) 110);
        class21.method154((byte) 1);
        class218.method1609(0);
        class52.method423((byte) 114);
        class126.method868(4096);
        class309.method2176(-31547);
        class260.method1882(28802);
        class14.method84(arg0);
        class166.method1290(0);
        class7.method41(126);
        class259.method1880(2678);
        class281.method2042(-71);
        class107.method719((byte) 61);
        class102.method701((byte) 104);
        class100.method688(111);
        class152.method1203(32);
        class148.method1142(-14);
        class313.method2193((byte) -118);
        class110.method749(0);
        class86.method600(17206);
        class294.method2097(-3);
        class184.method1447((byte) -97);
        class122.method844(true);
        class55.method447((byte) -94);
        class114.method779(21454);
        class170.method1321(2875);
        class39.method276((byte) -37);
        class268.method1946(-89);
        class44.method309(-8362);
        class201.method1541((byte) 96);
        class58.method455(arg0);
        class180.method1415(true);
        class213.method1593(0);
        class237.method1732(31);
        class57.method452((byte) 10);
        class36.method257(-120);
        class159.method1246(109);
        class312.method2190(128);
        class229.method1685(293977132);
        if (class113.field1835) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z", line = 635)
    public static final boolean method1790(int arg0, byte arg1) {
        field4067++;
        if (arg1 != 86) {
            method1788(42, -122, true, -87, 53, true, (byte) -72);
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 653)
    public static void method1791(int arg0) {
        field4069 = null;
        field4087 = null;
        field4078 = null;
        field4086 = null;
        field4079 = null;
        field4084 = null;
        field4082 = null;
        field4080 = null;
        if (arg0 != 4) {
            field4079 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 675)
    public static final void main(String[] arg0) {
        field4077++;
        try {
            int var1 = -1;
            if (arg0.length != 4) {
                class171.method1328("argument count", 23466);
            }
            class79.field1266 = Integer.parseInt(arg0[0]);
            class22.field408 = 2;
            if (arg0[1].equals("live")) {
                class101.field1628 = 0;
            } else if (arg0[1].equals("rc")) {
                class101.field1628 = 1;
            } else if (arg0[1].equals("wip")) {
                class101.field1628 = 2;
            } else {
                class171.method1328("modewhat", 23466);
            }
            class251.field4204 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class86.method601(class316.method2210(1, var2.length, var2, 0), -122);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class14.field263 = var1;
            } else if (arg0[2].equals("english")) {
                class14.field263 = 0;
            } else if (arg0[2].equals("german")) {
                class14.field263 = 1;
            } else {
                class171.method1328("language", 23466);
            }
            class282.method2043(class14.field263, -1);
            class305.field5226 = false;
            class114.field1838 = false;
            if (arg0[3].equals("game0")) {
                class95.field1530 = 0;
            } else if (arg0[3].equals("game1")) {
                class95.field1530 = 1;
            } else {
                class171.method1328("game", 23466);
            }
            class139.field2318 = class161.field2740;
            class70.field1142 = false;
            class92.field1468 = 0;
            class203.field3378 = 0;
            client var4 = new client();
            class151.field2569 = var4;
            var4.method773(false, 1024, "runescape", class101.field1628 + 32, 528, 28, 768, (byte) -84);
            class144.field2418.setLocation(40, 40);
        } catch (Exception var7) {
            class245.method1771(var7, (String) null, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lr;)Lr;", line = 755)
    public static final class264 method1792(class264 arg0) {
        int var1 = class9.method64(method1789(arg0), -94);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class98.method680(arg0.field4497, false);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 778)
    private final void method1793(byte arg0, int arg1) {
        class70.field1139.field2632 = arg1;
        class249.field4175 = null;
        field4068++;
        class70.field1139.field2635++;
        class113.field1827 = null;
        int var3 = -34 % ((arg0 + 22) / 61);
        class92.field1476 = 0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 806)
    private final void method1794(byte arg0) {
        field4062++;
        for (class222.field3695 = 0; class52.method424((byte) -91) && class222.field3695 < 128; class222.field3695++) {
            class47.field878[class222.field3695] = class57.field1011;
            class202.field3374[class222.field3695] = class272.field4669;
        }
        class214.field3534++;
        int var2 = -85 / ((arg0 + 59) / 43);
        if (class236.field3943 != -1) {
            class192.method1480(false, 0, class148.field2518, 0, class56.field997, class236.field3943, 0, 0);
        }
        class13.field253++;
        if (class271.field4640) {
            int var3 = 19137023;
            label192: for (int var4 = 0; var4 < 32768; var4++) {
                class282 var5 = class173.field2906[var4];
                if (var5 != null) {
                    byte var6 = var5.field4838.field5121;
                    if ((var6 & 0x2) > 0 && var5.field5424 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var8 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var7 != 0 || var8 != 0) {
                            var5.field5419[0] = (var5.field5409 >> 7) + var7;
                            var5.field5432[0] = (var5.field5380 >> 7) + var8;
                            class251.field4202[class203.field3387].method1071(var5.field5380 >> 7, false, (byte) 124, var5.field5409 >> 7, var5.method1717(0), var5.method1717(0), 0);
                            if (var5.field5419[0] >= 0 && var5.field5419[0] <= 104 - var5.method1717(0) && var5.field5432[0] >= 0 && var5.field5432[0] <= (104 - var5.method1717(0)) && class251.field4202[class203.field3387].method1066(var5.field5419[0], var5.field5409 >> 7, var5.field5380 >> 7, 120, var5.field5432[0])) {
                                if (var5.method1717(0) > 1) {
                                    for (int var9 = var5.field5419[0]; (var5.field5419[0] + var5.method1717(0)) > var9; var9++) {
                                        for (int var10 = var5.field5432[0]; var10 < var5.field5432[0] + var5.method1717(0); var10++) {
                                            if ((class251.field4202[class203.field3387].field2392[var9][var10] & var3) != 0) {
                                                continue label192;
                                            }
                                        }
                                    }
                                }
                                var5.field5424 = 1;
                            }
                        }
                    }
                    class192.method1489(var5, 90);
                    class316.method2208(var5, -120);
                    class294.method2094(127, var5);
                    class251.field4202[class203.field3387].method1070((byte) -124, var5.method1717(0), var5.field5380 >> 7, false, var5.field5409 >> 7, var5.method1717(0));
                }
            }
        }
        if (!class271.field4640) {
            class169.method1306(0);
        } else if (class264.field4515 == 0 && class144.field2390 == 0) {
            if (class302.field5172 == 2) {
                class60.method462((byte) 126);
            } else {
                class122.method846((byte) 107);
            }
            if (class107.field1742 >> 7 < 14 || (class107.field1742 >> 7) >= 90 || class161.field2719 >> 7 < 14 || class161.field2719 >> 7 >= 90) {
                class14.method85(16277770);
            }
        }
        while (true) {
            class124 var11;
            class264 var18;
            class264 var19;
            do {
                var11 = (class124) class262.field4345.method1254(0);
                if (var11 == null) {
                    while (true) {
                        class124 var12;
                        class264 var16;
                        class264 var17;
                        do {
                            var12 = (class124) class21.field401.method1254(0);
                            if (var12 == null) {
                                while (true) {
                                    class124 var13;
                                    class264 var14;
                                    class264 var15;
                                    do {
                                        var13 = (class124) class158.field2667.method1254(0);
                                        if (var13 == null) {
                                            if (class213.field3521 != null) {
                                                class273.method1995((byte) -71);
                                            }
                                            if (class159.field2692 != null && class159.field2692.field4265 == 1) {
                                                if (class159.field2692.field4269 != null) {
                                                    class165.method1287(class148.field2511, -1, class55.field982);
                                                }
                                                class159.field2692 = null;
                                                class55.field982 = false;
                                                class148.field2511 = null;
                                            }
                                            if (class203.field3385 % 1500 == 0) {
                                                class192.method1488((byte) 72);
                                            }
                                            return;
                                        }
                                        var14 = var13.field2039;
                                        if (var14.field4417 < 0) {
                                            break;
                                        }
                                        var15 = class98.method680(var14.field4497, false);
                                    } while (var15 == null || var15.field4402 == null || var14.field4417 >= var15.field4402.length || var15.field4402[var14.field4417] != var14);
                                    class43.method297(3335, var13);
                                }
                            }
                            var16 = var12.field2039;
                            if (var16.field4417 < 0) {
                                break;
                            }
                            var17 = class98.method680(var16.field4497, false);
                        } while (var17 == null || var17.field4402 == null || var16.field4417 >= var17.field4402.length || var17.field4402[var16.field4417] != var16);
                        class43.method297(3335, var12);
                    }
                }
                var18 = var11.field2039;
                if (var18.field4417 < 0) {
                    break;
                }
                var19 = class98.method680(var18.field4497, false);
            } while (var19 == null || var19.field4402 == null || var19.field4402.length <= var18.field4417 || var19.field4402[var18.field4417] != var18);
            class43.method297(3335, var11);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lr;)Z", line = 1023)
    public static final boolean method1795(class264 arg0) {
        if (class128.field2096) {
            if (method1789(arg0) != 0) {
                return false;
            }
            if (arg0.field4536 == 0) {
                return false;
            }
        }
        return arg0.field4539;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lr;IIIIIII)V", line = 1053)
    public static final void method1796(class264[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class264 var9 = arg0[var8];
            if (var9 != null && var9.field4497 == arg1 && (!var9.field4462 || var9.field4536 == 0 || var9.field4409 || method1789(var9) != 0 || class33.field636 == var9 || var9.field4470 == 1338) && (!var9.field4462 || !method1795(var9))) {
                int var10 = var9.field4434 + arg6;
                int var11 = var9.field4424 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4536 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4393 + var10;
                    int var17 = var9.field4381 + var11;
                    if (var9.field4536 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class213.field3521 == var9) {
                    class185.field3094 = true;
                    class210.field3480 = var10;
                    class194.field3223 = var11;
                }
                if (!var9.field4462 || var12 < var14 && var13 < var15) {
                    if (var9.field4536 == 0) {
                        if (!var9.field4462 && method1795(var9) && class124.field2037 != var9) {
                            continue;
                        }
                        if (var9.field4499 && class232.field3875 >= var12 && class316.field5368 >= var13 && class232.field3875 < var14 && class316.field5368 < var15) {
                            for (class124 var18 = (class124) class158.field2667.method1251(-71); var18 != null; var18 = (class124) class158.field2667.method1253(69)) {
                                if (var18.field2040) {
                                    var18.method1325(-2935);
                                    var18.field2039.field4444 = false;
                                }
                            }
                            if (class22.field416 == 0) {
                                class213.field3521 = null;
                                class33.field636 = null;
                            }
                            class5.field83 = false;
                        }
                    }
                    if (var9.field4462) {
                        boolean var19;
                        if (class232.field3875 >= var12 && class316.field5368 >= var13 && class232.field3875 < var14 && class316.field5368 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class14.field272 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class251.field4203 == 1 && class120.field1974 >= var12 && class215.field3542 >= var13 && class120.field1974 < var14 && class215.field3542 < var15) {
                            var21 = true;
                        }
                        if (class222.field3695 > 0 && var9.field4475 != null) {
                            for (int var22 = 0; var22 < var9.field4475.length; var22++) {
                                for (int var23 = 0; var23 < class222.field3695; var23++) {
                                    int var24 = var9.field4475[var22] & 0xFF;
                                    if (class47.field878[var23] == var24) {
                                        if (var9.field4385 != null) {
                                            byte var25 = var9.field4385[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class113.field1813[86] || (var25 & 0x1) != 0 && !class113.field1813[82] || (var25 & 0x4) != 0 && !class113.field1813[81])) {
                                                continue;
                                            }
                                        }
                                        class241.method1748(class161.field2740, (byte) 119, -1, var9.field4461, var22 + 1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class80.method576(0, class120.field1974 - var10, var9, class215.field3542 - var11);
                        }
                        if (class213.field3521 != null && class213.field3521 != var9 && var19 && class206.method1562(method1789(var9), -45)) {
                            class13.field254 = var9;
                        }
                        if (class33.field636 == var9) {
                            class88.field1398 = true;
                            class267.field4602 = var10;
                            class302.field5162 = var11;
                        }
                        if (var9.field4409 || var9.field4470 != 0) {
                            if (var19 && class236.field3947 != 0 && var9.field4543 != null) {
                                class124 var26 = new class124();
                                var26.field2040 = true;
                                var26.field2039 = var9;
                                var26.field2033 = class236.field3947;
                                var26.field2031 = var9.field4543;
                                class158.field2667.method1258(0, var26);
                            }
                            if (class213.field3521 != null || class43.field738 != null || class295.field4998 || var9.field4470 != 1400 && class5.field83) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4470 != 0) {
                                if (var9.field4470 == 1337) {
                                    class207.field3452 = var9;
                                    class164.method1280(false, var9);
                                    continue;
                                }
                                if (var9.field4470 == 1338) {
                                    if (var21) {
                                        class97.field1578 = class120.field1974 - var10;
                                        class100.field1619 = class215.field3542 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4470 == 1400) {
                                    class185.field3081 = var9;
                                    if (var21) {
                                        if (class113.field1813[82] && class191.field3164 > 0) {
                                            int var27 = (int) ((double) (class120.field1974 - var10 - var9.field4393 / 2) * 2.0D / (double) class133.field2231);
                                            int var28 = (int) ((double) (class215.field3542 - var11 - var9.field4381 / 2) * 2.0D / (double) class133.field2231);
                                            int var29 = class148.field2508 + var27;
                                            int var30 = class236.field3937 + var28;
                                            int var31 = class277.field4764 + var29;
                                            int var32 = class33.field639 + class191.field3152 - var30 - 1;
                                            class87.method602(0, var31, -79, var32);
                                            class52.method425((byte) -123);
                                            continue;
                                        }
                                        class5.field83 = true;
                                        class248.field4146 = class232.field3875;
                                        class218.field3608 = class316.field5368;
                                        class205.field3415 = class148.field2508;
                                        class123.field2013 = class236.field3937;
                                        continue;
                                    }
                                    if (var20 && class5.field83) {
                                        class2.method7(100, (int) ((double) (class248.field4146 - class232.field3875) * 2.0D / (double) class28.field491) + class205.field3415);
                                        class170.method1316(120, (int) ((double) (class218.field3608 - class316.field5368) * 2.0D / (double) class28.field491) + class123.field2013);
                                        continue;
                                    }
                                    class5.field83 = false;
                                    continue;
                                }
                                if (var9.field4470 == 1401) {
                                    if (var20) {
                                        class277.method2016(var9.field4393, class232.field3875 - var10, var9.field4381, class316.field5368 - var11, true);
                                    }
                                    continue;
                                }
                                if (var9.field4470 == 1402) {
                                    if (!class271.field4640) {
                                        class164.method1280(false, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field4459 && var21) {
                                var9.field4459 = true;
                                if (var9.field4511 != null) {
                                    class124 var33 = new class124();
                                    var33.field2040 = true;
                                    var33.field2039 = var9;
                                    var33.field2024 = class120.field1974 - var10;
                                    var33.field2033 = class215.field3542 - var11;
                                    var33.field2031 = var9.field4511;
                                    class158.field2667.method1258(0, var33);
                                }
                            }
                            if (var9.field4459 && var20 && var9.field4441 != null) {
                                class124 var34 = new class124();
                                var34.field2040 = true;
                                var34.field2039 = var9;
                                var34.field2024 = class232.field3875 - var10;
                                var34.field2033 = class316.field5368 - var11;
                                var34.field2031 = var9.field4441;
                                class158.field2667.method1258(0, var34);
                            }
                            if (var9.field4459 && !var20) {
                                var9.field4459 = false;
                                if (var9.field4418 != null) {
                                    class124 var35 = new class124();
                                    var35.field2040 = true;
                                    var35.field2039 = var9;
                                    var35.field2024 = class232.field3875 - var10;
                                    var35.field2033 = class316.field5368 - var11;
                                    var35.field2031 = var9.field4418;
                                    class21.field401.method1258(0, var35);
                                }
                            }
                            if (var20 && var9.field4467 != null) {
                                class124 var36 = new class124();
                                var36.field2040 = true;
                                var36.field2039 = var9;
                                var36.field2024 = class232.field3875 - var10;
                                var36.field2033 = class316.field5368 - var11;
                                var36.field2031 = var9.field4467;
                                class158.field2667.method1258(0, var36);
                            }
                            if (!var9.field4444 && var19) {
                                var9.field4444 = true;
                                if (var9.field4502 != null) {
                                    class124 var37 = new class124();
                                    var37.field2040 = true;
                                    var37.field2039 = var9;
                                    var37.field2024 = class232.field3875 - var10;
                                    var37.field2033 = class316.field5368 - var11;
                                    var37.field2031 = var9.field4502;
                                    class158.field2667.method1258(0, var37);
                                }
                            }
                            if (var9.field4444 && var19 && var9.field4476 != null) {
                                class124 var38 = new class124();
                                var38.field2040 = true;
                                var38.field2039 = var9;
                                var38.field2024 = class232.field3875 - var10;
                                var38.field2033 = class316.field5368 - var11;
                                var38.field2031 = var9.field4476;
                                class158.field2667.method1258(0, var38);
                            }
                            if (var9.field4444 && !var19) {
                                var9.field4444 = false;
                                if (var9.field4495 != null) {
                                    class124 var39 = new class124();
                                    var39.field2040 = true;
                                    var39.field2039 = var9;
                                    var39.field2024 = class232.field3875 - var10;
                                    var39.field2033 = class316.field5368 - var11;
                                    var39.field2031 = var9.field4495;
                                    class21.field401.method1258(0, var39);
                                }
                            }
                            if (var9.field4457 != null) {
                                class124 var40 = new class124();
                                var40.field2039 = var9;
                                var40.field2031 = var9.field4457;
                                class262.field4345.method1258(0, var40);
                            }
                            if (var9.field4380 != null && class169.field2860 > var9.field4481) {
                                if (var9.field4440 == null || class169.field2860 - var9.field4481 > 32) {
                                    class124 var45 = new class124();
                                    var45.field2039 = var9;
                                    var45.field2031 = var9.field4380;
                                    class158.field2667.method1258(0, var45);
                                } else {
                                    label548: for (int var41 = var9.field4481; var41 < class169.field2860; var41++) {
                                        int var42 = class110.field1778[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field4440.length; var43++) {
                                            if (var9.field4440[var43] == var42) {
                                                class124 var44 = new class124();
                                                var44.field2039 = var9;
                                                var44.field2031 = var9.field4380;
                                                class158.field2667.method1258(0, var44);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field4481 = class169.field2860;
                            }
                            if (var9.field4460 != null && class83.field1323 > var9.field4414) {
                                if (var9.field4396 == null || class83.field1323 - var9.field4414 > 32) {
                                    class124 var50 = new class124();
                                    var50.field2039 = var9;
                                    var50.field2031 = var9.field4460;
                                    class158.field2667.method1258(0, var50);
                                } else {
                                    label524: for (int var46 = var9.field4414; var46 < class83.field1323; var46++) {
                                        int var47 = class222.field3698[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field4396.length; var48++) {
                                            if (var9.field4396[var48] == var47) {
                                                class124 var49 = new class124();
                                                var49.field2039 = var9;
                                                var49.field2031 = var9.field4460;
                                                class158.field2667.method1258(0, var49);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field4414 = class83.field1323;
                            }
                            if (var9.field4521 != null && class117.field1885 > var9.field4478) {
                                if (var9.field4422 == null || class117.field1885 - var9.field4478 > 32) {
                                    class124 var55 = new class124();
                                    var55.field2039 = var9;
                                    var55.field2031 = var9.field4521;
                                    class158.field2667.method1258(0, var55);
                                } else {
                                    label500: for (int var51 = var9.field4478; var51 < class117.field1885; var51++) {
                                        int var52 = class63.field1092[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field4422.length; var53++) {
                                            if (var9.field4422[var53] == var52) {
                                                class124 var54 = new class124();
                                                var54.field2039 = var9;
                                                var54.field2031 = var9.field4521;
                                                class158.field2667.method1258(0, var54);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field4478 = class117.field1885;
                            }
                            if (var9.field4472 != null && class104.field1686 > var9.field4546) {
                                if (var9.field4454 == null || class104.field1686 - var9.field4546 > 32) {
                                    class124 var60 = new class124();
                                    var60.field2039 = var9;
                                    var60.field2031 = var9.field4472;
                                    class158.field2667.method1258(0, var60);
                                } else {
                                    label476: for (int var56 = var9.field4546; var56 < class104.field1686; var56++) {
                                        int var57 = class184.field3070[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field4454.length; var58++) {
                                            if (var9.field4454[var58] == var57) {
                                                class124 var59 = new class124();
                                                var59.field2039 = var9;
                                                var59.field2031 = var9.field4472;
                                                class158.field2667.method1258(0, var59);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field4546 = class104.field1686;
                            }
                            if (var9.field4480 != null && class161.field2724 > var9.field4406) {
                                if (var9.field4501 == null || class161.field2724 - var9.field4406 > 32) {
                                    class124 var65 = new class124();
                                    var65.field2039 = var9;
                                    var65.field2031 = var9.field4480;
                                    class158.field2667.method1258(0, var65);
                                } else {
                                    label452: for (int var61 = var9.field4406; var61 < class161.field2724; var61++) {
                                        int var62 = class76.field1237[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field4501.length; var63++) {
                                            if (var9.field4501[var63] == var62) {
                                                class124 var64 = new class124();
                                                var64.field2039 = var9;
                                                var64.field2031 = var9.field4480;
                                                class158.field2667.method1258(0, var64);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field4406 = class161.field2724;
                            }
                            if (class55.field981 > var9.field4438 && var9.field4507 != null) {
                                class124 var66 = new class124();
                                var66.field2039 = var9;
                                var66.field2031 = var9.field4507;
                                class158.field2667.method1258(0, var66);
                            }
                            if (class150.field2550 > var9.field4438 && var9.field4439 != null) {
                                class124 var67 = new class124();
                                var67.field2039 = var9;
                                var67.field2031 = var9.field4439;
                                class158.field2667.method1258(0, var67);
                            }
                            if (class89.field1424 > var9.field4438 && var9.field4432 != null) {
                                class124 var68 = new class124();
                                var68.field2039 = var9;
                                var68.field2031 = var9.field4432;
                                class158.field2667.method1258(0, var68);
                            }
                            if (class272.field4672 > var9.field4438 && var9.field4517 != null) {
                                class124 var69 = new class124();
                                var69.field2039 = var9;
                                var69.field2031 = var9.field4517;
                                class158.field2667.method1258(0, var69);
                            }
                            if (class192.field3204 > var9.field4438 && var9.field4413 != null) {
                                class124 var70 = new class124();
                                var70.field2039 = var9;
                                var70.field2031 = var9.field4413;
                                class158.field2667.method1258(0, var70);
                            }
                            var9.field4438 = class13.field253;
                            if (var9.field4449 != null) {
                                for (int var71 = 0; var71 < class222.field3695; var71++) {
                                    class124 var72 = new class124();
                                    var72.field2039 = var9;
                                    var72.field2026 = class47.field878[var71];
                                    var72.field2034 = class202.field3374[var71];
                                    var72.field2031 = var9.field4449;
                                    class158.field2667.method1258(0, var72);
                                }
                            }
                            if (class121.field1986 && var9.field4452 != null) {
                                class124 var73 = new class124();
                                var73.field2039 = var9;
                                var73.field2031 = var9.field4452;
                                class158.field2667.method1258(0, var73);
                            }
                        }
                    }
                    if (!var9.field4462 && class213.field3521 == null && class43.field738 == null && !class295.field4998) {
                        if ((var9.field4526 >= 0 || var9.field4500 != 0) && class232.field3875 >= var12 && class316.field5368 >= var13 && class232.field3875 < var14 && class316.field5368 < var15) {
                            if (var9.field4526 >= 0) {
                                class124.field2037 = arg0[var9.field4526];
                            } else {
                                class124.field2037 = var9;
                            }
                        }
                        if (var9.field4536 == 8 && class232.field3875 >= var12 && class316.field5368 >= var13 && class232.field3875 < var14 && class316.field5368 < var15) {
                            class102.field1661 = var9;
                        }
                        if (var9.field4513 > var9.field4381) {
                            class117.method795(class316.field5368, var9, var11, var9.field4513, var9.field4393 + var10, var9.field4381, false, class232.field3875);
                        }
                    }
                    if (var9.field4536 == 0) {
                        method1796(arg0, var9.field4461, var12, var13, var14, var15, var10 - var9.field4430, var11 - var9.field4377);
                        if (var9.field4402 != null) {
                            method1796(var9.field4402, var9.field4461, var12, var13, var14, var15, var10 - var9.field4430, var11 - var9.field4377);
                        }
                        class142 var74 = (class142) class135.field2266.method810((byte) -109, (long) var9.field4461);
                        if (var74 != null) {
                            class192.method1480(false, var13, var14, var11, var15, var74.field2370, var12, var10);
                        }
                    }
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4069[var1] = var0 - 1;
            var0 += var0;
        }
        field4078 = new int[] { 1, -1, -1, 1 };
        field4079 = new int[5];
        field4082 = class235.method1724(-12908, "Starte 3D)2Softwarebibliothek)3");
        field4086 = class235.method1724(-12908, "wishes to trade with you)3");
        field4087 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
        field4083 = 0;
        field4085 = -1;
        field4084 = field4086;
        field4080 = new class224(5000);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 1846)
    private final void method1797(boolean arg0) {
        boolean var2 = class70.field1139.method1220(-2292);
        if (!var2) {
            this.method1799(0);
        }
        field4064++;
        if (!arg0) {
            field4083 = -68;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1863)
    public final void method768(boolean arg0) {
        field4063++;
        if (class238.field3973 == 1000) {
            return;
        }
        if (!arg0) {
            field4078 = (int[]) null;
        }
        boolean var2 = class321.method2231(96);
        if (var2 && class85.field1357 && class142.field2369 != null) {
            class142.field2369.method1485(98);
        }
        if ((class238.field3973 == 30 || class238.field3973 == 10) && (class312.field5308 || class145.field2424 != 0L && class145.field2424 < class67.method501(-102))) {
            class265.method1927(class312.field5308, class124.field2020, class157.method1228(1), class275.field4727, 0);
        }
        if (class18.field358 == null) {
            Container var3;
            if (class18.field358 != null) {
                var3 = class18.field358;
            } else if (class144.field2418 == null) {
                var3 = class232.field3876.field2162;
            } else {
                var3 = class144.field2418;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class144.field2418 == var3) {
                Insets var6 = class144.field2418.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class72.field1173 != var4 || class248.field4170 != var5) {
                if (class129.field2166.startsWith("mac")) {
                    class248.field4170 = var5;
                    class72.field1173 = var4;
                } else {
                    class18.method135(-120);
                }
                class145.field2424 = class67.method501(-96) + 500L;
            }
        }
        boolean var7 = false;
        if (class18.field358 != null && !class83.field1328 && (class238.field3973 == 30 || class238.field3973 == 10)) {
            class265.method1927(false, -1, class91.field1435, -1, 0);
        }
        if (class133.field2236) {
            var7 = true;
            class133.field2236 = false;
        }
        if (var7) {
            class206.method1561(true);
        }
        if (class271.field4640) {
            for (int var8 = 0; var8 < 100; var8++) {
                class14.field264[var8] = true;
            }
        }
        if (class238.field3973 == 0) {
            class305.method2151(var7, 30, class225.field3754, class40.field723, (Color) null);
        } else if (class238.field3973 == 5) {
            class164.method1274(class39.field695, false, true);
        } else if (class238.field3973 == 10) {
            class4.method18(false);
        } else if (class238.field3973 == 25 || class238.field3973 == 28) {
            if (class306.field5236 == 1) {
                if (class303.field5193 > class273.field4706) {
                    class273.field4706 = class303.field5193;
                }
                int var9 = (class273.field4706 - class303.field5193) * 50 / class273.field4706;
                class55.method445(false, 0, class112.method758(127, new class146[] { class71.field1169, class118.field1911, class82.method585(14744, var9), class202.field3367 }));
            } else if (class306.field5236 == 2) {
                if (class113.field1811 < class214.field3529) {
                    class113.field1811 = class214.field3529;
                }
                int var10 = (class113.field1811 - class214.field3529) * 50 / class113.field1811 + 50;
                class55.method445(false, 0, class112.method758(-114, new class146[] { class71.field1169, class118.field1911, class82.method585(14744, var10), class202.field3367 }));
            } else {
                class55.method445(false, 0, class71.field1169);
            }
        } else if (class238.field3973 == 30) {
            class272.method1990((byte) 116);
        } else if (class238.field3973 == 40) {
            class55.method445(false, 0, class112.method758(-46, new class146[] { class258.field4282, class272.field4667, class104.field1694 }));
        }
        if (class271.field4640 && class238.field3973 != 0) {
            class271.method1952();
            for (int var11 = 0; var11 < class227.field3783; var11++) {
                class269.field4623[var11] = false;
            }
        } else if ((class238.field3973 == 30 || class238.field3973 == 10) && class150.field2556 == 0 && !var7) {
            try {
                Graphics var12 = class75.field1228.getGraphics();
                for (int var13 = 0; var13 < class227.field3783; var13++) {
                    if (class269.field4623[var13]) {
                        class139.field2307.method148(class175.field2922[var13], var12, class91.field1442[var13], class52.field952[var13], class298.field5068[var13], -90);
                        class269.field4623[var13] = false;
                    }
                }
            } catch (Exception var19) {
                class75.field1228.repaint();
            }
        } else if (class238.field3973 != 0) {
            try {
                Graphics var15 = class75.field1228.getGraphics();
                class139.field2307.method147(0, 0, var15, 120);
                for (int var16 = 0; var16 < class227.field3783; var16++) {
                    class269.field4623[var16] = false;
                }
            } catch (Exception var18) {
                class75.field1228.repaint();
            }
        }
        if (class47.field877) {
            class99.method686((byte) 36);
        }
        if (class7.field164 && class238.field3973 == 10 && class236.field3943 != -1) {
            class7.field164 = false;
            class166.method1291(-13383, class232.field3876);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljh;", line = 2090)
    public static final class262 method1798(int arg0, int arg1) {
        if (arg0 != 12) {
            return (class262) null;
        }
        field4071++;
        if (arg1 == 0) {
            return new class168();
        } else if (arg1 == 1) {
            return new class300();
        } else if (arg1 == 2) {
            return new class179();
        } else if (arg1 == 3) {
            return new class56();
        } else if (arg1 == 4) {
            return new class310();
        } else if (arg1 == 5) {
            return new class27();
        } else if (arg1 == 6) {
            return new class26();
        } else if (arg1 == 7) {
            return new class236();
        } else if (arg1 == 8) {
            return new class150();
        } else if (arg1 == 9) {
            return new class316();
        } else if (arg1 == 10) {
            return new class143();
        } else if (arg1 == 11) {
            return new class183();
        } else if (arg1 == 12) {
            return new class139();
        } else if (arg1 == 13) {
            return new class74();
        } else if (arg1 == 14) {
            return new class66();
        } else if (arg1 == 15) {
            return new class13();
        } else if (arg1 == 16) {
            return new class242();
        } else if (arg1 == 17) {
            return new class205();
        } else if (arg1 == 18) {
            return new class275();
        } else if (arg1 == 19) {
            return new class21();
        } else if (arg1 == 20) {
            return new class218();
        } else if (arg1 == 21) {
            return new class52();
        } else if (arg1 == 22) {
            return new class126();
        } else if (arg1 == 23) {
            return new class309();
        } else if (arg1 == 24) {
            return new class260();
        } else if (arg1 == 25) {
            return new class14();
        } else if (arg1 == 26) {
            return new class166();
        } else if (arg1 == 27) {
            return new class7();
        } else if (arg1 == 28) {
            return new class259();
        } else if (arg1 == 29) {
            return new class281();
        } else if (arg1 == 30) {
            return new class107();
        } else if (arg1 == 31) {
            return new class102();
        } else if (arg1 == 32) {
            return new class100();
        } else if (arg1 == 33) {
            return new class152();
        } else if (arg1 == 34) {
            return new class93();
        } else if (arg1 == 35) {
            return new class148();
        } else if (arg1 == 36) {
            return new class313();
        } else if (arg1 == 37) {
            return new class110();
        } else if (arg1 == 38) {
            return new class86();
        } else if (arg1 == 39) {
            return new class91();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2412)
    private final void method1799(int arg0) {
        field4070++;
        if (class70.field1139.field2635 > class113.field1817) {
            class170.field2877 = (class70.field1139.field2635 - 1) * 50 * 5;
            if (class71.field1158 == class128.field2067) {
                class71.field1158 = class267.field4599;
            } else {
                class71.field1158 = class128.field2067;
            }
            if (class170.field2877 > 3000) {
                class170.field2877 = 3000;
            }
            if (class70.field1139.field2635 >= 2 && class70.field1139.field2632 == 6) {
                this.method760(0, "js5connect_outofdate");
                class238.field3973 = 1000;
                return;
            }
            if (class70.field1139.field2635 >= 4 && class70.field1139.field2632 == -1) {
                this.method760(0, "js5crc");
                class238.field3973 = 1000;
                return;
            }
            if (class70.field1139.field2635 >= 4 && (class238.field3973 == 0 || class238.field3973 == 5)) {
                if (class70.field1139.field2632 == 7 || class70.field1139.field2632 == 9) {
                    this.method760(0, "js5connect_full");
                } else if (class70.field1139.field2632 <= 0) {
                    this.method760(0, "js5io");
                } else {
                    this.method760(0, "js5connect");
                }
                class238.field3973 = 1000;
                return;
            }
        }
        class113.field1817 = class70.field1139.field2635;
        if (arg0 < class170.field2877) {
            class170.field2877--;
            return;
        }
        try {
            if (class92.field1476 == 0) {
                class249.field4175 = class232.field3876.method931(class17.field343, (byte) 43, class71.field1158);
                class92.field1476++;
            }
            if (class92.field1476 == 1) {
                if (class249.field4175.field4265 == 2) {
                    this.method1793((byte) -86, 1000);
                    return;
                }
                if (class249.field4175.field4265 == 1) {
                    class92.field1476++;
                }
            }
            if (class92.field1476 == 2) {
                class113.field1827 = new class40((Socket) class249.field4175.field4269, class232.field3876);
                class47 var2 = new class47(5);
                var2.method332(15, 122);
                var2.method387(528, 102);
                class113.field1827.method279(arg0 - 27, 0, 5, var2.field860);
                class92.field1476++;
                class60.field1021 = class67.method501(-110);
            }
            if (class92.field1476 == 3) {
                if (class238.field3973 == 0 || class238.field3973 == 5 || class113.field1827.method288(0) > 0) {
                    int var3 = class113.field1827.method280((byte) -36);
                    if (var3 != 0) {
                        this.method1793((byte) 106, var3);
                        return;
                    }
                    class92.field1476++;
                } else if (class67.method501(-100) - class60.field1021 > 30000L) {
                    this.method1793((byte) -122, 1001);
                    return;
                }
            }
            if (class92.field1476 == 4) {
                boolean var4 = class238.field3973 == 5 || class238.field3973 == 10 || class238.field3973 == 28;
                class70.field1139.method1223(!var4, 0, class113.field1827);
                class249.field4175 = null;
                class113.field1827 = null;
                class92.field1476 = 0;
            }
        } catch (IOException var6) {
            this.method1793((byte) 112, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2555)
    public final void init() {
        field4073++;
        if (!this.method766((byte) -118)) {
            return;
        }
        class79.field1266 = Integer.parseInt(this.getParameter("worldid"));
        class22.field408 = Integer.parseInt(this.getParameter("modewhere"));
        if (class22.field408 < 0 || class22.field408 > 1) {
            class22.field408 = 0;
        }
        class101.field1628 = Integer.parseInt(this.getParameter("modewhat"));
        if (class101.field1628 < 0 || class101.field1628 > 2) {
            class101.field1628 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class251.field4204 = true;
        } else {
            class251.field4204 = false;
        }
        try {
            class14.field263 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class14.field263 = 0;
        }
        class282.method2043(class14.field263, -1);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class114.field1838 = true;
        } else {
            class114.field1838 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class305.field5226 = true;
        } else {
            class305.field5226 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class95.field1530 = 1;
        } else {
            class95.field1530 = 0;
        }
        try {
            class92.field1468 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class92.field1468 = 0;
        }
        class139.field2318 = class4.field40.method1089(80, this);
        if (class139.field2318 == null) {
            class139.field2318 = class161.field2740;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class203.field3378 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class203.field3378 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class70.field1142 = true;
        } else {
            class70.field1142 = false;
        }
        class151.field2569 = this;
        this.method761(class101.field1628 + 32, 765, 503, (byte) -34, 528);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2649)
    private final void method1800(byte arg0) {
        field4075++;
        if (!class7.field164) {
            label236: while (true) {
                do {
                    if (!class52.method424((byte) -71)) {
                        break label236;
                    }
                } while (class272.field4669 != 115 && class272.field4669 != 83);
                class7.field164 = true;
            }
        }
        if (class166.field2813 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class67.method501(-109);
            if (class3.field14 == 0L) {
                class3.field14 = var28;
            }
            if (var27 > 16384 && (var28 - class3.field14) < 5000L) {
                if ((var28 - class160.field2699) > 1000L) {
                    System.gc();
                    class160.field2699 = var28;
                }
                class40.field723 = 5;
                class225.field3754 = class100.field1620;
            } else {
                class225.field3754 = class150.field2542;
                class166.field2813 = 10;
                class40.field723 = 5;
            }
        } else if (class166.field2813 == 10) {
            class53.method427(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class251.field4202[var2] = new class144(104, 104);
            }
            class225.field3754 = class107.field1726;
            class166.field2813 = 30;
            class40.field723 = 10;
        } else if (class166.field2813 == 30) {
            if (class214.field3531 == null) {
                class214.field3531 = new class4(class70.field1139, class112.field1784);
            }
            if (class214.field3531.method13(16)) {
                class84.field1335 = class260.method1886((byte) 12, true, 0, true, false);
                class168.field2844 = class260.method1886((byte) 12, true, 1, true, false);
                class237.field3955 = class260.method1886((byte) 12, false, 2, true, true);
                class75.field1218 = class260.method1886((byte) 12, true, 3, true, false);
                class313.field5333 = class260.method1886((byte) 12, true, 4, true, false);
                class280.field4807 = class260.method1886((byte) 12, true, 5, true, true);
                class116.field1865 = class260.method1886((byte) 12, true, 6, false, true);
                class275.field4728 = class260.method1886((byte) 12, true, 7, true, false);
                class196.field3273 = class260.method1886((byte) 12, true, 8, true, false);
                class79.field1273 = class260.method1886((byte) 12, true, 9, true, false);
                class280.field4810 = class260.method1886((byte) 12, true, 10, true, false);
                class144.field2406 = class260.method1886((byte) 12, true, 11, true, false);
                class283.field4843 = class260.method1886((byte) 12, true, 12, true, false);
                class269.field4619 = class260.method1886((byte) 12, true, 13, true, false);
                class36.field668 = class260.method1886((byte) 12, true, 14, false, false);
                class96.field1556 = class260.method1886((byte) 12, true, 15, true, false);
                class266.field4582 = class260.method1886((byte) 12, true, 16, true, false);
                class217.field3588 = class260.method1886((byte) 12, true, 17, true, false);
                class73.field1186 = class260.method1886((byte) 12, true, 18, true, false);
                class1.field5 = class260.method1886((byte) 12, true, 19, true, false);
                class32.field621 = class260.method1886((byte) 12, true, 20, true, false);
                class210.field3474 = class260.method1886((byte) 12, true, 21, true, false);
                class263.field4371 = class260.method1886((byte) 12, true, 22, true, false);
                class73.field1199 = class260.method1886((byte) 12, true, 23, true, true);
                class27.field476 = class260.method1886((byte) 12, true, 24, true, false);
                class72.field1174 = class260.method1886((byte) 12, true, 25, true, false);
                class266.field4572 = class260.method1886((byte) 12, true, 26, true, true);
                class81.field1294 = class260.method1886((byte) 12, true, 27, true, false);
                class166.field2813 = 40;
                class225.field3754 = class84.field1338;
                class40.field723 = 15;
            } else {
                class225.field3754 = class230.field3832;
                class40.field723 = 12;
            }
        } else {
            if (arg0 > -38) {
                field4085 = -66;
            }
            if (class166.field2813 == 40) {
                int var3 = 0;
                for (int var4 = 0; var4 < 28; var4++) {
                    var3 += class296.field5040[var4].method228(63) * class322.field5496[var4] / 100;
                }
                if (var3 == 100) {
                    class40.field723 = 20;
                    class225.field3754 = class9.field197;
                    class239.method1744((byte) -111, class196.field3273);
                    class228.method1681(class196.field3273, (byte) -114);
                    class194.method1495((byte) -115, class196.field3273);
                    class166.field2813 = 45;
                } else {
                    if (var3 != 0) {
                        class225.field3754 = class112.method758(-14, new class146[] { class86.field1369, class82.method585(14744, var3), class207.field3467 });
                    }
                    class40.field723 = 20;
                }
            } else if (class166.field2813 == 45) {
                class62.method480(class119.field1927, 22050, (byte) -102, 2);
                class155.field2600 = new class128();
                class155.field2600.method907(128, 1, 9);
                class142.field2369 = class258.method1875(0, class232.field3876, 22050, -99, class75.field1228);
                class142.field2369.method1487(2, class155.field2600);
                class123.method850(class155.field2600, class313.field5333, class36.field668, 0, class96.field1556);
                class138.field2303 = class258.method1875(1, class232.field3876, 2048, -94, class75.field1228);
                class82.field1315 = new class172();
                class138.field2303.method1487(2, class82.field1315);
                class47.field889 = new class200(22050, class218.field3594);
                class225.field3755 = class116.field1865.method103(72, class312.field5314);
                class225.field3754 = class97.field1573;
                class40.field723 = 30;
                class166.field2813 = 50;
            } else if (class166.field2813 == 50) {
                int var24 = class269.method1950(class269.field4619, (byte) 60, class196.field3273);
                int var25 = class288.method2075(7);
                if (var25 <= var24) {
                    class166.field2813 = 60;
                    class225.field3754 = class148.field2509;
                    class40.field723 = 35;
                } else {
                    class225.field3754 = class112.method758(-29, new class146[] { class266.field4585, class82.method585(14744, var24 * 100 / var25), class207.field3467 });
                    class40.field723 = 35;
                }
            } else if (class166.field2813 == 60) {
                int var5 = class32.method231(-28742, class196.field3273);
                int var6 = class116.method788((byte) -81);
                if (var6 <= var5) {
                    class225.field3754 = class155.field2598;
                    class40.field723 = 40;
                    class166.field2813 = 65;
                } else {
                    class225.field3754 = class112.method758(-87, new class146[] { class92.field1482, class82.method585(14744, var5 * 100 / var6), class207.field3467 });
                    class40.field723 = 40;
                }
            } else if (class166.field2813 == 65) {
                class93.method640(class196.field3273, class269.field4619, 26714);
                class225.field3754 = class28.field492;
                class40.field723 = 45;
                class1.method4(-41, 5);
                class166.field2813 = 70;
            } else if (class166.field2813 == 70) {
                byte var7 = 0;
                class237.field3955.method113((byte) -101);
                int var8 = var7 + class237.field3955.method116(94);
                class266.field4582.method113((byte) -126);
                int var9 = var8 + class266.field4582.method116(107);
                class217.field3588.method113((byte) -127);
                int var10 = var9 + class217.field3588.method116(108);
                class73.field1186.method113((byte) -113);
                int var11 = var10 + class73.field1186.method116(114);
                class1.field5.method113((byte) -103);
                int var12 = var11 + class1.field5.method116(110);
                class32.field621.method113((byte) -118);
                int var13 = var12 + class32.field621.method116(94);
                class210.field3474.method113((byte) 110);
                int var14 = var13 + class210.field3474.method116(126);
                class263.field4371.method113((byte) -97);
                int var15 = var14 + class263.field4371.method116(120);
                class27.field476.method113((byte) 45);
                int var16 = var15 + class27.field476.method116(102);
                class72.field1174.method113((byte) -102);
                int var17 = var16 + class72.field1174.method116(113);
                class81.field1294.method113((byte) 67);
                int var18 = var17 + class81.field1294.method116(113);
                if (var18 < 1100) {
                    class225.field3754 = class112.method758(-57, new class146[] { class288.field4937, class82.method585(14744, var18 / 11), class207.field3467 });
                    class40.field723 = 50;
                } else {
                    class14.method83(class237.field3955, 93);
                    class294.method2098(class237.field3955, -96);
                    class303.method2143(false, class237.field3955);
                    class205.method1557(class275.field4728, class237.field3955, (byte) 37);
                    class203.method1547(true, class275.field4728, true, class266.field4582);
                    class230.method1689(class275.field4728, (byte) -49, class73.field1186);
                    class280.method2031(class144.field2395, true, -1, class1.field5, class275.field4728);
                    class277.method2019(class237.field3955, -66);
                    class115.method780(class84.field1335, class32.field621, class168.field2844, (byte) -102);
                    class295.method2100((byte) 31, class210.field3474, class275.field4728);
                    class71.method528(class263.field4371, 100);
                    class137.method1008(-1, class237.field3955);
                    class281.method2040(class269.field4619, true, class196.field3273, class275.field4728, class75.field1218);
                    class15.method121(class237.field3955, 0);
                    class164.method1275(class217.field3588, (byte) -123);
                    class312.method2188(class72.field1174, (byte) 112, class27.field476, new class251());
                    class133.method989(-121, class27.field476, class72.field1174);
                    class180.method1414(-12888, class196.field3273, class237.field3955);
                    class225.field3754 = class182.field3050;
                    class40.field723 = 50;
                    class207.method1569(-1);
                    class166.field2813 = 80;
                }
            } else if (class166.field2813 == 80) {
                int var19 = class120.method829((byte) -114, class196.field3273);
                int var20 = class203.method1548(16);
                if (var20 <= var19) {
                    class187.method1463(class196.field3273, (byte) 114);
                    class166.field2813 = 90;
                    class40.field723 = 60;
                    class225.field3754 = class198.field3291;
                } else {
                    class225.field3754 = class112.method758(-84, new class146[] { class84.field1340, class82.method585(14744, var19 * 100 / var20), class207.field3467 });
                    class40.field723 = 60;
                }
            } else if (class166.field2813 == 90) {
                if (class266.field4572.method113((byte) 104)) {
                    class120 var21 = new class120(class79.field1273, class266.field4572, class196.field3273, 20, !class319.field5448);
                    class109.method736(var21);
                    if (class273.field4684 == 1) {
                        class109.method728(0.9F);
                    }
                    if (class273.field4684 == 2) {
                        class109.method728(0.8F);
                    }
                    if (class273.field4684 == 3) {
                        class109.method728(0.7F);
                    }
                    if (class273.field4684 == 4) {
                        class109.method728(0.6F);
                    }
                    class225.field3754 = class321.field5492;
                    class40.field723 = 70;
                    class166.field2813 = 100;
                } else {
                    class225.field3754 = class112.method758(-29, new class146[] { class92.field1474, class82.method585(14744, class266.field4572.method116(109)), class207.field3467 });
                    class40.field723 = 70;
                }
            } else if (class166.field2813 == 100) {
                if (class152.method1204(class196.field3273, true)) {
                    class166.field2813 = 110;
                }
            } else if (class166.field2813 == 110) {
                class273.field4679 = new class60();
                class232.field3876.method920(class273.field4679, 10, 0);
                class225.field3754 = class277.field4757;
                class40.field723 = 75;
                class166.field2813 = 120;
            } else if (class166.field2813 == 120) {
                if (class280.field4810.method110(class161.field2740, true, class110.field1770)) {
                    class82 var22 = new class82(class280.field4810.method105(-127, class161.field2740, class110.field1770));
                    class102.method699(1, var22);
                    class40.field723 = 80;
                    class225.field3754 = class303.field5199;
                    class166.field2813 = 130;
                } else {
                    class225.field3754 = class112.method758(127, new class146[] { class192.field3174, class134.field2246 });
                    class40.field723 = 80;
                }
            } else if (class166.field2813 == 130) {
                if (!class75.field1218.method113((byte) -88)) {
                    class225.field3754 = class112.method758(-77, new class146[] { class74.field1205, class82.method585(14744, class75.field1218.method116(123) * 3 / 4), class207.field3467 });
                    class40.field723 = 85;
                } else if (!class283.field4843.method113((byte) 116)) {
                    class225.field3754 = class112.method758(-41, new class146[] { class74.field1205, class82.method585(14744, class283.field4843.method116(107) / 10 + 75), class207.field3467 });
                    class40.field723 = 85;
                } else if (!class269.field4619.method113((byte) 73)) {
                    class225.field3754 = class112.method758(-8, new class146[] { class74.field1205, class82.method585(14744, class269.field4619.method116(124) / 20 + 85), class207.field3467 });
                    class40.field723 = 85;
                } else if (class73.field1199.method104(class217.field3585, (byte) 111)) {
                    class43.method302(class25.field448, class124.field2042, -1, class66.field1121, class190.field3149, class73.field1199, class175.field2926);
                    class225.field3754 = class47.field887;
                    class40.field723 = 95;
                    class166.field2813 = 135;
                } else {
                    class225.field3754 = class112.method758(120, new class146[] { class74.field1205, class82.method585(14744, class73.field1199.method88((byte) 80, class217.field3585) / 10 + 90), class207.field3467 });
                    class40.field723 = 85;
                }
            } else if (class166.field2813 == 135) {
                int var23 = class196.method1513(92);
                if (var23 == -1) {
                    class40.field723 = 95;
                    class225.field3754 = class84.field1343;
                } else if (var23 == 7 || var23 == 9) {
                    this.method760(0, "worldlistfull");
                    class1.method4(-41, 1000);
                } else if (class320.field5462) {
                    class166.field2813 = 140;
                    class40.field723 = 96;
                    class225.field3754 = class183.field3058;
                } else {
                    this.method760(0, "worldlistio_" + var23);
                    class1.method4(-41, 1000);
                }
            } else if (class166.field2813 == 140) {
                class166.field2806 = class75.field1218.method103(-60, class92.field1462);
                class280.field4807.method122(-120, true, false);
                class116.field1865.method122(-122, true, true);
                class196.field3273.method122(-125, true, true);
                class269.field4619.method122(-127, true, true);
                class280.field4810.method122(-114, true, true);
                class75.field1218.method122(-114, true, true);
                class225.field3754 = class248.field4094;
                class47.field877 = true;
                class40.field723 = 97;
                class166.field2813 = 150;
            } else if (class166.field2813 == 150) {
                class243.method1760();
                if (class7.field164) {
                    class264.field4508 = 0;
                    class91.field1435 = 0;
                    class23.field417 = 0;
                    class147.field2502 = 0;
                }
                class7.field164 = true;
                class166.method1291(-13383, class232.field3876);
                class265.method1927(false, -1, class91.field1435, -1, 0);
                class40.field723 = 100;
                class225.field3754 = class288.field4930;
                class166.field2813 = 160;
            } else if (class166.field2813 == 160) {
                class28.method182(true, 12252);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 3150)
    public final void method767(int arg0) {
        field4076++;
        if (class271.field4640) {
            class271.method1968();
        }
        if (class18.field358 != null) {
            class71.method527((byte) -12, class18.field358, class232.field3876);
            class18.field358 = null;
        }
        if (class232.field3876 != null) {
            class232.field3876.method921(true, this.getClass());
        }
        if (class273.field4679 != null) {
            class273.field4679.field1029 = false;
        }
        class273.field4679 = null;
        if (class98.field1582 != null) {
            class98.field1582.method284((byte) 81);
            class98.field1582 = null;
        }
        class25.method169((byte) 102, class75.field1228);
        class228.method1682(class75.field1228, 0);
        if (class5.field108 != null) {
            class5.field108.method460(class75.field1228, 0);
        }
        class156.method1211(false);
        if (arg0 != -141) {
            return;
        }
        class133.method987(64);
        class5.field108 = null;
        if (class142.field2369 != null) {
            class142.field2369.method1491(99);
        }
        if (class138.field2303 != null) {
            class138.field2303.method1491(arg0 ^ 0xF8);
        }
        class70.field1139.method1217(0);
        class112.field1784.method1130(arg0 ^ 0xF5);
        try {
            if (class79.field1268 != null) {
                class79.field1268.method474(-90);
            }
            if (class273.field4702 != null) {
                for (int var2 = 0; var2 < class273.field4702.length; var2++) {
                    if (class273.field4702[var2] != null) {
                        class273.field4702[var2].method474(-88);
                    }
                }
            }
            if (class202.field3375 != null) {
                class202.field3375.method474(-47);
            }
            if (class92.field1456 != null) {
                class92.field1456.method474(-51);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 3242)
    public final void method764(int arg0) {
        field4074++;
        class18.method135(73);
        class112.field1784 = new class147();
        class70.field1139 = new class156();
        if (class101.field1628 != 0) {
            class137.field2283 = new byte[50][];
        }
        class14.method86(class232.field3876, (byte) -106);
        if (class22.field408 == 0) {
            class180.field3019 = this.getCodeBase().getHost();
            class198.field3293 = 443;
            class265.field4556 = 43594;
        } else if (class22.field408 == 1) {
            class180.field3019 = this.getCodeBase().getHost();
            class265.field4556 = class79.field1266 + 40000;
            class198.field3293 = class79.field1266 + 50000;
        } else if (class22.field408 == 2) {
            class265.field4556 = class79.field1266 + 40000;
            class180.field3019 = "127.0.0.1";
            class198.field3293 = class79.field1266 + 50000;
        }
        class147.field2490 = class265.field4556;
        class71.field1158 = class147.field2490;
        if (class95.field1530 == 1) {
            class231.field3859 = 0;
            class231.field3861 = 16777215;
            class296.field5044 = class124.field2038;
            class245.field4045 = class145.field2421;
            class275.field4726 = class166.field2808;
            class115.field1851 = true;
            class313.field5332 = class102.field1650;
        } else {
            class245.field4045 = class62.field1065;
            class275.field4726 = class222.field3710;
            class296.field5044 = class213.field3520;
            class313.field5332 = class85.field1358;
        }
        class128.field2067 = class265.field4556;
        class245.field4048 = class1.field7 = class150.field2551 = class92.field1458 = new short[256];
        if (class129.field2154 == 3 && class22.field408 != 2) {
            class72.field1178 = class79.field1266;
        }
        class267.field4599 = class198.field3293;
        class17.field343 = class180.field3019;
        class225.method1662(1);
        class250.method1825(class75.field1228, (byte) -105);
        class41.method291((byte) 118, class75.field1228);
        class5.field108 = class312.method2189((byte) -18);
        if (class5.field108 != null) {
            class5.field108.method461((byte) 109, class75.field1228);
        }
        class103.field1665 = class129.field2154;
        try {
            if (class232.field3876.field2150 != null) {
                class79.field1268 = new class62(class232.field3876.field2150, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class273.field4702[var2] = new class62(class232.field3876.field2163[var2], 6000, 0);
                }
                class202.field3375 = new class62(class232.field3876.field2171, 6000, 0);
                class292.field4965 = new class245(255, class79.field1268, class202.field3375, 500000);
                class92.field1456 = new class62(class232.field3876.field2161, 24, 0);
                class232.field3876.field2150 = null;
                class232.field3876.field2161 = null;
                class232.field3876.field2171 = null;
                class232.field3876.field2163 = null;
            }
        } catch (IOException var4) {
            class202.field3375 = null;
            class292.field4965 = null;
            class92.field1456 = null;
            class79.field1268 = null;
        }
        class169.field2847 = class207.field3457;
        if (arg0 > -96) {
            this.init();
        }
        if (class22.field408 != 0) {
            class214.field3526 = true;
        }
    }
}
