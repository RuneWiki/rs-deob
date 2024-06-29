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
public class client extends class154 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Ldh;")
    public static class179 field4227 = new class179(50);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4231 = -1;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field4234;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[[Z")
    public static boolean[][] field4232;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 8)
    public final void init() {
        field4213++;
        if (!this.method1038((byte) 106)) {
            return;
        }
        class315.field4854 = Integer.parseInt(this.getParameter("worldid"));
        class5.field83 = Integer.parseInt(this.getParameter("modewhere"));
        if (class5.field83 < 0 || class5.field83 > 1) {
            class5.field83 = 0;
        }
        class15.field216 = Integer.parseInt(this.getParameter("modewhat"));
        if (class15.field216 < 0 || class15.field216 > 2) {
            class15.field216 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class175.field2511 = true;
        } else {
            class175.field2511 = false;
        }
        try {
            class172.field2484 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class172.field2484 = 0;
        }
        class328.method2271(class172.field2484, true);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class330.field5043 = true;
        } else {
            class330.field5043 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class89.field1119 = true;
        } else {
            class89.field1119 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class249.field3769 = 1;
        } else {
            class249.field3769 = 0;
        }
        try {
            class244.field3667 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class244.field3667 = 0;
        }
        class230.field3363 = this.getParameter("settings");
        if (class230.field3363 == null) {
            class230.field3363 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class303.field4711 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class303.field4711 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class311.field4806 = true;
        } else {
            class311.field4806 = false;
        }
        class90.field1132 = this;
        this.method1035(503, 1542, class15.field216 + 32, 765, -1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILp;)Lkh;", line = 95)
    public static final class16 method1941(int arg0, class107 arg1) {
        if (arg0 != 13) {
            field4231 = 85;
        }
        field4230++;
        class16 var2 = new class16();
        var2.field221 = arg1.method624(arg0 + 14599);
        var2.field220 = class135.method897((byte) 79, var2.field221);
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 113)
    private final void method1942(int arg0) {
        field4229++;
        if (class22.field283.field2003 > class177.field2568) {
            if (class152.field2095 == class15.field200) {
                class152.field2095 = class307.field4746;
            } else {
                class152.field2095 = class15.field200;
            }
            class238.field3500 = (class22.field283.field2003 * 50 - 50) * 5;
            if (class238.field3500 > 3000) {
                class238.field3500 = 3000;
            }
            if (class22.field283.field2003 >= 2 && class22.field283.field2002 == 6) {
                this.method1031("js5connect_outofdate", (byte) 92);
                class17.field236 = 1000;
                return;
            }
            if (class22.field283.field2003 >= 4 && class22.field283.field2002 == -1) {
                this.method1031("js5crc", (byte) 60);
                class17.field236 = 1000;
                return;
            }
            if (class22.field283.field2003 >= 4 && (class17.field236 == 0 || class17.field236 == 5)) {
                if (class22.field283.field2002 == 7 || class22.field283.field2002 == 9) {
                    this.method1031("js5connect_full", (byte) 80);
                } else if (class22.field283.field2002 <= 0) {
                    this.method1031("js5io", (byte) 42);
                } else {
                    this.method1031("js5connect", (byte) 27);
                }
                class17.field236 = 1000;
                return;
            }
        }
        class177.field2568 = class22.field283.field2003;
        if (class238.field3500 > 0) {
            class238.field3500--;
            return;
        }
        try {
            if (arg0 != 20785) {
                field4231 = 29;
            }
            if (class20.field260 == 0) {
                class335.field5174 = class9.field131.method1915(class320.field4916, class152.field2095, false);
                class20.field260++;
            }
            if (class20.field260 == 1) {
                if (class335.field5174.field238 == 2) {
                    this.method1947(arg0 ^ 0x52D9, 1000);
                    return;
                }
                if (class335.field5174.field238 == 1) {
                    class20.field260++;
                }
            }
            if (class20.field260 == 2) {
                class35.field419 = new class167((Socket) class335.field5174.field241, class9.field131);
                class107 var2 = new class107(5);
                var2.method648(15, (byte) 38);
                var2.method641(arg0 + 1773181735, 542);
                class35.field419.method1097(var2.field1388, 0, true, 5);
                class20.field260++;
                class80.field1034 = class200.method1375(arg0 ^ 0xFFFF91F6);
            }
            if (class20.field260 == 3) {
                if (class17.field236 == 0 || class17.field236 == 5 || class35.field419.method1091((byte) 18) > 0) {
                    int var3 = class35.field419.method1094((byte) 67);
                    if (var3 != 0) {
                        this.method1947(1000, var3);
                        return;
                    }
                    class20.field260++;
                } else if ((class200.method1375(-16185) - class80.field1034) > 30000L) {
                    this.method1947(1000, 1001);
                    return;
                }
            }
            if (class20.field260 == 4) {
                boolean var4 = class17.field236 == 5 || class17.field236 == 10 || class17.field236 == 28;
                class22.field283.method947(class35.field419, !var4, -1);
                class335.field5174 = null;
                class35.field419 = null;
                class20.field260 = 0;
            }
        } catch (IOException var6) {
            this.method1947(1000, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 260)
    public final void method1040(boolean arg0) {
        field4214++;
        if (class17.field236 == 1000) {
            return;
        }
        class38.field463++;
        if ((class38.field463 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class110.field1529 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class22.field286.setSeed((long) class110.field1529);
        }
        this.method1955(-10554);
        if (class320.field4918 != null) {
            class320.field4918.method2169((byte) 105);
        }
        class239.method1708((byte) 75);
        class239.method1713(31532);
        class267.method1936(true);
        class314.method2199(95);
        if (arg0) {
            this.method1034(89);
        }
        if (class250.field3787) {
            class266.method1931();
        }
        if (class336.field5178 != null) {
            int var3 = class336.field5178.method546(99);
            class196.field2817 = var3;
        }
        if (class17.field236 == 0) {
            this.method1949((byte) 97);
            class339.method2350(0);
        } else if (class17.field236 == 5) {
            this.method1949((byte) 32);
            class339.method2350(0);
        } else if (class17.field236 == 25 || class17.field236 == 28) {
            class227.method1563(8);
        }
        if (class17.field236 == 10) {
            this.method1951((byte) 109);
            class321.method2239(121);
            class137.method917(arg0);
            class307.method2159(100);
        } else if (class17.field236 == 30) {
            class277.method1991((byte) 108);
        } else if (class17.field236 == 40) {
            class307.method2159(102);
            if (class255.field3876 != -3) {
                if (class255.field3876 == 15) {
                    class76.method457(-1);
                } else if (class255.field3876 != 2) {
                    class171.method1117((byte) 19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Lm;", line = 351)
    public static final class54 method1943(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3213;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 360)
    public final void method1036(boolean arg0) {
        method1945(-23789);
        field4221++;
        class45.method270((byte) -104);
        class79.method468(0);
        class269.method1956((byte) 114);
        class35.method207(false);
        class205.method1396(37);
        class90.method528(110);
        class29.method179(4738);
        class154.method1027(-82);
        class250.method1833();
        class17.method117((byte) 86);
        class23.method152(256);
        class219.method1505(arg0);
        class107.method633((byte) -27);
        class167.method1093(86);
        class142.method950(2000000);
        class289.method2061(0);
        class309.method2174(112);
        class236.method1677(5204);
        class175.method1190(-16711936);
        class50.method302(arg0);
        class315.method2204(0);
        class179.method1238(0);
        class184.method1277(28455);
        class94.method571(-114);
        class22.method135(255);
        class149.method999(28699);
        class109.method746((byte) -46);
        class337.method2324(0);
        class91.method534((byte) 115);
        class224.method1545((byte) -117);
        class292.method2076(8);
        class40.method238((byte) 87);
        class233.method1641(-166125016);
        class228.method1599((byte) 95);
        class239.method1718(1);
        class232.method1630(!arg0);
        class336.method2313(-18315);
        class247.method1777(107);
        class170.method1112(32645);
        class225.method1549(-65536);
        class7.method25((byte) -100);
        class282.method2019((byte) 80);
        class343.method2372((byte) -91);
        class171.method1127(0);
        class84.method493(0);
        class281.method2011(256);
        class267.method1940((byte) 112);
        class115.method788(33);
        class204.method1393(1);
        class242.method1745(-94);
        class256.method1859(123);
        class283.method2026(315);
        class61.method357(false);
        class26.method165(-23718);
        class196.method1357(1);
        class158.method1048((byte) 99);
        class293.method2084((byte) -78);
        class153.method1020(0);
        class124.method830();
        class106.method614((byte) -122);
        class183.method1270(18276);
        class9.method46((byte) -77);
        class113.method778(true);
        class98.method593((byte) -108);
        class64.method395();
        class308.method2162(-6760);
        class207.method1424();
        class42.method244(85);
        class108.method711();
        class333.method2296();
        class319.method2224((byte) 99);
        class287.method2050(-1);
        class240.method1724((byte) 94);
        class266.method1934();
        class294.method2089();
        class147.method990(3);
        class262.method1881((byte) -89);
        class307.method2158((byte) -95);
        class11.method77();
        class5.method19((byte) -55);
        class137.method911((byte) 10);
        class182.method1260();
        class276.method1982((byte) -108);
        class27.method169((byte) -128);
        class288.method2060();
        class193.method1332();
        class62.method360((byte) 14);
        class13.method93(5845);
        class322.method2243(-114);
        class177.method1217(-29921);
        class144.method976();
        class284.method2032(108);
        class248.method1785((byte) -19);
        class30.method185((byte) 98);
        class104.method609((byte) 123);
        class227.method1568(0);
        class226.method1555(1087616432);
        class129.method870(119);
        class318.method2218((byte) -64);
        class81.method481(false);
        class291.method2074(-9536);
        class191.method1326(36);
        class159.method1056((byte) -62);
        class161.method1065((byte) -40);
        class237.method1690(-101);
        class344.method2376();
        class325.method2254(true);
        class230.method1622(0);
        class44.method264(-116);
        class216.method1490((byte) 75);
        class254.method1846(520);
        class345.method2382(1);
        class241.method1733();
        class339.method2347(true);
        class139.method925(arg0);
        class235.method1669(false);
        class63.method383(-50);
        class89.method522(2047);
        class97.method589(false);
        class198.method1368(-72);
        class66.method415();
        class25.method162(15817);
        class215.method1471();
        class116.method795(-1);
        class312.method2191(-32421);
        class12.method87(!arg0);
        class211.method1448(1023);
        class163.method1072(arg0);
        class74.method449((byte) -3);
        class246.method1769();
        class222.method1525((byte) 10);
        class28.method175();
        class121.method820(2541);
        class249.method1786(-17819);
        class16.method111(8);
        class176.method1210((byte) -123);
        class47.method280((byte) 114);
        class245.method1765();
        class80.method477((byte) -79);
        class342.method2366(136);
        class168.method1099(68);
        class54.method328(0);
        class138.method922((byte) -103);
        class146.method986(-1);
        class57.method335(50);
        class290.method2070();
        class134.method891((byte) -44);
        class165.method1083(75);
        class145.method980(873896416);
        class83.method490();
        class178.method1229();
        class114.method781();
        class58.method339(0);
        class221.method1518(-91);
        class297.method2105();
        class306.method2151();
        class209.method1441();
        class49.method291(13013);
        class320.method2232(-115);
        class43.method249(0);
        class231.method1627(arg0);
        class286.method2044(109);
        class298.method2111(true);
        class326.method2257(-1);
        class2.method4();
        class305.method2137(118);
        class88.method518((byte) -116);
        class99.method601(-58);
        class187.method1296(-803);
        class330.method2279((byte) -103);
        class110.method758((byte) -128);
        class120.method812(arg0);
        class172.method1131(64);
        class112.method768(-26051);
        class295.method2090(23040);
        class157.method1043((byte) -44);
        class220.method1516(12633);
        class243.method1752((byte) -107);
        class334.method2304((byte) -76);
        class340.method2353((byte) -126);
        class327.method2265();
        class48.method282((byte) 107);
        class164.method1076(50);
        class188.method1301((byte) 27);
        class141.method934((byte) 127);
        class271.method1964(-103);
        class253.method1840(arg0);
        class251.method1835();
        class212.method1450();
        class31.method190((byte) 57);
        class37.method222(0);
        class127.method845(-28473);
        class102.method604();
        class46.method273();
        class32.method194((byte) -59);
        class301.method2120((byte) 73);
        class210.method1443();
        class213.method1457(-112);
        class338.method2342();
        class341.method2359();
        class217.method1496(true);
        class67.method421(-2075442228);
        class128.method861(8);
        class132.method879(3725);
        class135.method899((byte) -33);
        class181.method1252(43);
        class41.method240(true);
        class148.method996(0);
        class329.method2275(94);
        class280.method2004(96);
        class185.method1286(27169);
        class36.method210((byte) -87);
        class103.method607(true);
        class20.method122(16);
        class60.method352(4);
        class272.method1968(23);
        class152.method1015(1);
        class76.method454(true);
        class150.method1009((byte) -125);
        class285.method2037(true);
        class56.method334((byte) 96);
        class85.method505((byte) -96);
        class303.method2128(false);
        class59.method344(-84);
        class323.method2249(1486);
        class258.method1869(true);
        class140.method932((byte) -114);
        class223.method1530((byte) 67);
        class229.method1610(false);
        class257.method1862((byte) -90);
        class68.method427(true);
        class162.method1068(-1);
        class261.method1879(65280);
        class21.method127((byte) -108);
        class208.method1432(2);
        class279.method1998((byte) 115);
        class299.method2113((byte) 46);
        class195.method1353((byte) 119);
        class331.method2281((byte) 74);
        class15.method101(-46);
        class78.method463(false);
        class38.method225(128);
        class244.method1759((byte) 110);
        class335.method2307((byte) 111);
        class328.method2268(14635);
        class206.method1398((byte) -86);
        class72.method437(-26253);
        class19.method119(!arg0);
        class255.method1855(arg0);
        class73.method440(86);
        class277.method1993((byte) -75);
        class275.method1980(-128);
        class314.method2197((byte) 95);
        class321.method2233(6814);
        class264.method1904(124);
        class270.method1963(4);
        class100.method603((byte) -128);
        class118.method800((byte) 91);
        class180.method1248((byte) -116);
        class316.method2207(184);
        class260.method1877(true);
        class10.method50((byte) 95);
        class259.method1874(127);
        class69.method428(7);
        class252.method1838(110);
        class218.method1502((byte) 54);
        class186.method1295((byte) -67);
        class133.method880((byte) -97);
        class311.method2186(-128);
        class296.method2093((byte) -125);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Lcf;", line = 639)
    public static final class139 method1944(int arg0, int arg1) {
        field4228++;
        class139 var2 = (class139) class259.field3929.method1239((byte) -42, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class40.field478.method1199(arg1 ^ 0x7090, arg0, arg1);
        class139 var4 = new class139();
        if (var3 != null) {
            var4.method927(0, new class107(var3), arg0);
        }
        class259.field3929.method1243(var4, (long) arg0, arg1 ^ 0xFFFF8D81);
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 666)
    public static void method1945(int arg0) {
        field4232 = (boolean[][]) null;
        field4227 = null;
        if (arg0 != -23789) {
            main((String[]) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 678)
    public static final void main(String[] arg0) {
        field4218++;
        try {
            if (arg0.length != 4) {
                class113.method777(false, "argument count");
            }
            class315.field4854 = Integer.parseInt(arg0[0]);
            class5.field83 = 2;
            if (arg0[1].equals("live")) {
                class15.field216 = 0;
            } else if (arg0[1].equals("rc")) {
                class15.field216 = 1;
            } else if (arg0[1].equals("wip")) {
                class15.field216 = 2;
            } else {
                class113.method777(false, "modewhat");
            }
            class175.field2511 = false;
            class172.field2484 = class277.method1992(-1, arg0[2]);
            if (class172.field2484 == -1) {
                if (arg0[2].equals("english")) {
                    class172.field2484 = 0;
                } else if (arg0[2].equals("german")) {
                    class172.field2484 = 1;
                } else {
                    class113.method777(false, "language");
                }
            }
            class328.method2271(class172.field2484, true);
            class330.field5043 = false;
            class89.field1119 = false;
            if (arg0[3].equals("game0")) {
                class249.field3769 = 0;
            } else if (arg0[3].equals("game1")) {
                class249.field3769 = 1;
            } else {
                class113.method777(false, "game");
            }
            class244.field3667 = 0;
            class311.field4806 = false;
            class303.field4711 = 0;
            class230.field3363 = "";
            client var1 = new client();
            class90.field1132 = var1;
            var1.method1030(29, class15.field216 + 32, 768, 542, false, (byte) -119, "runescape", 1024);
            class329.field5029.setLocation(40, 40);
        } catch (Exception var3) {
            class42.method245((String) null, 1, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lcc;)Z", line = 746)
    public static final boolean method1946(class263 arg0) {
        if (class309.field4772) {
            if (method1952(arg0).field2467 != 0) {
                return false;
            }
            if (arg0.field3981 == 0) {
                return false;
            }
        }
        return arg0.field4001;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 760)
    private final void method1947(int arg0, int arg1) {
        field4222++;
        if (arg0 != 1000) {
            method1941(-75, (class107) null);
        }
        class22.field283.field2003++;
        class35.field419 = null;
        class22.field283.field2002 = arg1;
        class20.field260 = 0;
        class335.field5174 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lcc;IIIIIII)V", line = 777)
    public static final void method1948(class263[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class263 var9 = arg0[var8];
            if (var9 != null && var9.field4065 == arg1 && (!var9.field3993 || var9.field3981 == 0 || var9.field4145 || method1952(var9).field2467 != 0 || class110.field1540 == var9 || var9.field4113 == 1338) && (!var9.field3993 || !method1946(var9))) {
                int var10 = var9.field4027 + arg6;
                int var11 = var9.field4074 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3981 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3989 + var10;
                    int var17 = var9.field4096 + var11;
                    if (var9.field3981 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class116.field1649 == var9) {
                    class121.field1697 = true;
                    class118.field1665 = var10;
                    class270.field4258 = var11;
                }
                if (!var9.field3993 || var12 < var14 && var13 < var15) {
                    if (var9.field3981 == 0) {
                        if (!var9.field3993 && method1946(var9) && class113.field1611 != var9) {
                            continue;
                        }
                        if (var9.field4046 && class211.field2987 >= var12 && class161.field2216 >= var13 && class211.field2987 < var14 && class161.field2216 < var15) {
                            for (class176 var18 = (class176) class115.field1627.method2331((byte) 69); var18 != null; var18 = (class176) class115.field1627.method2332(-52)) {
                                if (var18.field2558) {
                                    var18.method2285(true);
                                    var18.field2552.field3977 = false;
                                }
                            }
                            if (class22.field303 == 0) {
                                class116.field1649 = null;
                                class110.field1540 = null;
                            }
                            class60.field732 = 0;
                        }
                    }
                    if (var9.field3993) {
                        boolean var19;
                        if (class211.field2987 >= var12 && class161.field2216 >= var13 && class211.field2987 < var14 && class161.field2216 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class261.field3953 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class196.field2814 == 1 && class148.field2055 >= var12 && class224.field3184 >= var13 && class148.field2055 < var14 && class224.field3184 < var15) {
                            var21 = true;
                        }
                        if (var9.field4156 != null) {
                            for (int var22 = 0; var22 < var9.field4156.length; var22++) {
                                if (class184.field2650[var9.field4156[var22]]) {
                                    if (var9.field4032 == null || class38.field463 >= var9.field4032[var22]) {
                                        byte var23 = var9.field4090[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class184.field2650[86] && !class184.field2650[82] && !class184.field2650[81]) && ((var23 & 0x2) == 0 || class184.field2650[86]) && ((var23 & 0x1) == 0 || class184.field2650[82]) && ((var23 & 0x4) == 0 || class184.field2650[81])) {
                                            class216.method1495(0, -1, var22 + 1, "", var9.field4083);
                                            int var24 = var9.field4051[var22];
                                            if (var9.field4032 == null) {
                                                var9.field4032 = new int[var9.field4156.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4032[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4032[var22] = class38.field463 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4032 != null) {
                                    var9.field4032[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class196.method1359(class148.field2055 - var10, (byte) 0, class224.field3184 - var11, var9);
                        }
                        if (class116.field1649 != null && class116.field1649 != var9 && var19 && method1952(var9).method1129((byte) -45)) {
                            class127.field1745 = var9;
                        }
                        if (class110.field1540 == var9) {
                            class62.field762 = true;
                            class157.field2169 = var10;
                            class331.field5058 = var11;
                        }
                        if (var9.field4145 || var9.field4113 != 0) {
                            if (var19 && class196.field2817 != 0 && var9.field4095 != null) {
                                class176 var25 = new class176();
                                var25.field2558 = true;
                                var25.field2552 = var9;
                                var25.field2562 = class196.field2817;
                                var25.field2551 = var9.field4095;
                                class115.field1627.method2325(var25, (byte) 34);
                            }
                            if (class116.field1649 != null || class326.field4995 != null || class140.field1951 || var9.field4113 != 1400 && class60.field732 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4113 != 0) {
                                if (var9.field4113 == 1337) {
                                    class226.field3230 = var9;
                                    continue;
                                }
                                if (var9.field4113 == 1338) {
                                    if (var21) {
                                        class109.field1523 = class148.field2055 - var10;
                                        class337.field5211 = class224.field3184 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4113 == 1400) {
                                    class16.field223 = var9;
                                    if (var21) {
                                        if (class184.field2650[82] && class154.field2151 > 0) {
                                            int var26 = (int) ((double) (class148.field2055 - var10 - var9.field3989 / 2) * 2.0D / (double) class5.field78);
                                            int var27 = (int) ((double) (class224.field3184 - var11 - var9.field4096 / 2) * 2.0D / (double) class5.field78);
                                            int var28 = class231.field3373 + var26;
                                            int var29 = class184.field2663 + var27;
                                            int var30 = class239.field3595 + var28;
                                            int var31 = class308.field4766 + class249.field3771 - var29 - 1;
                                            class79 var32 = class188.method1300(-126);
                                            int[] var33 = var32.method472((byte) -118, var30, var31);
                                            if (var33 != null) {
                                                class198.method1373(var33[2], var33[1], true, var33[0]);
                                                class68.method426(true);
                                            }
                                            continue;
                                        }
                                        class60.field732 = 1;
                                        class247.field3742 = class211.field2987;
                                        class242.field3651 = class161.field2216;
                                        continue;
                                    }
                                    if (var20 && class60.field732 > 0) {
                                        if (class60.field732 == 1 && (class247.field3742 != class211.field2987 || class242.field3651 != class161.field2216)) {
                                            class55.field671 = class231.field3373;
                                            class21.field269 = class184.field2663;
                                            class60.field732 = 2;
                                        }
                                        if (class60.field732 == 2) {
                                            class332.method2287((byte) 83, (int) ((double) (class247.field3742 - class211.field2987) * 2.0D / (double) class184.field2652) + class55.field671);
                                            class316.method2208((int) ((double) (class242.field3651 - class161.field2216) * 2.0D / (double) class184.field2652) + class21.field269, -1027);
                                        }
                                        continue;
                                    }
                                    class60.field732 = 0;
                                    continue;
                                }
                                if (var9.field4113 == 1401) {
                                    if (var20) {
                                        class198.method1371(class211.field2987 - var10, var9.field3989, class161.field2216 - var11, var9.field4096, 20196);
                                    }
                                    continue;
                                }
                                if (var9.field4113 == 1402) {
                                    if (!class250.field3787) {
                                        class239.method1712(0, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field4079 && var21) {
                                var9.field4079 = true;
                                if (var9.field3976 != null) {
                                    class176 var34 = new class176();
                                    var34.field2558 = true;
                                    var34.field2552 = var9;
                                    var34.field2550 = class148.field2055 - var10;
                                    var34.field2562 = class224.field3184 - var11;
                                    var34.field2551 = var9.field3976;
                                    class115.field1627.method2325(var34, (byte) 34);
                                }
                            }
                            if (var9.field4079 && var20 && var9.field4052 != null) {
                                class176 var35 = new class176();
                                var35.field2558 = true;
                                var35.field2552 = var9;
                                var35.field2550 = class211.field2987 - var10;
                                var35.field2562 = class161.field2216 - var11;
                                var35.field2551 = var9.field4052;
                                class115.field1627.method2325(var35, (byte) 34);
                            }
                            if (var9.field4079 && !var20) {
                                var9.field4079 = false;
                                if (var9.field4080 != null) {
                                    class176 var36 = new class176();
                                    var36.field2558 = true;
                                    var36.field2552 = var9;
                                    var36.field2550 = class211.field2987 - var10;
                                    var36.field2562 = class161.field2216 - var11;
                                    var36.field2551 = var9.field4080;
                                    class328.field5006.method2325(var36, (byte) 34);
                                }
                            }
                            if (var20 && var9.field4133 != null) {
                                class176 var37 = new class176();
                                var37.field2558 = true;
                                var37.field2552 = var9;
                                var37.field2550 = class211.field2987 - var10;
                                var37.field2562 = class161.field2216 - var11;
                                var37.field2551 = var9.field4133;
                                class115.field1627.method2325(var37, (byte) 34);
                            }
                            if (!var9.field3977 && var19) {
                                var9.field3977 = true;
                                if (var9.field4049 != null) {
                                    class176 var38 = new class176();
                                    var38.field2558 = true;
                                    var38.field2552 = var9;
                                    var38.field2550 = class211.field2987 - var10;
                                    var38.field2562 = class161.field2216 - var11;
                                    var38.field2551 = var9.field4049;
                                    class115.field1627.method2325(var38, (byte) 34);
                                }
                            }
                            if (var9.field3977 && var19 && var9.field4026 != null) {
                                class176 var39 = new class176();
                                var39.field2558 = true;
                                var39.field2552 = var9;
                                var39.field2550 = class211.field2987 - var10;
                                var39.field2562 = class161.field2216 - var11;
                                var39.field2551 = var9.field4026;
                                class115.field1627.method2325(var39, (byte) 34);
                            }
                            if (var9.field3977 && !var19) {
                                var9.field3977 = false;
                                if (var9.field4054 != null) {
                                    class176 var40 = new class176();
                                    var40.field2558 = true;
                                    var40.field2552 = var9;
                                    var40.field2550 = class211.field2987 - var10;
                                    var40.field2562 = class161.field2216 - var11;
                                    var40.field2551 = var9.field4054;
                                    class328.field5006.method2325(var40, (byte) 34);
                                }
                            }
                            if (var9.field3987 != null) {
                                class176 var41 = new class176();
                                var41.field2552 = var9;
                                var41.field2551 = var9.field3987;
                                class107.field1367.method2325(var41, (byte) 34);
                            }
                            if (var9.field4098 != null && class56.field675 > var9.field4072) {
                                if (var9.field4044 == null || class56.field675 - var9.field4072 > 32) {
                                    class176 var46 = new class176();
                                    var46.field2552 = var9;
                                    var46.field2551 = var9.field4098;
                                    class115.field1627.method2325(var46, (byte) 34);
                                } else {
                                    label575: for (int var42 = var9.field4072; var42 < class56.field675; var42++) {
                                        int var43 = class337.field5199[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field4044.length; var44++) {
                                            if (var9.field4044[var44] == var43) {
                                                class176 var45 = new class176();
                                                var45.field2552 = var9;
                                                var45.field2551 = var9.field4098;
                                                class115.field1627.method2325(var45, (byte) 34);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field4072 = class56.field675;
                            }
                            if (var9.field4125 != null && class231.field3369 > var9.field4055) {
                                if (var9.field4040 == null || class231.field3369 - var9.field4055 > 32) {
                                    class176 var51 = new class176();
                                    var51.field2552 = var9;
                                    var51.field2551 = var9.field4125;
                                    class115.field1627.method2325(var51, (byte) 34);
                                } else {
                                    label551: for (int var47 = var9.field4055; var47 < class231.field3369; var47++) {
                                        int var48 = class195.field2806[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4040.length; var49++) {
                                            if (var9.field4040[var49] == var48) {
                                                class176 var50 = new class176();
                                                var50.field2552 = var9;
                                                var50.field2551 = var9.field4125;
                                                class115.field1627.method2325(var50, (byte) 34);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field4055 = class231.field3369;
                            }
                            if (var9.field4075 != null && class68.field889 > var9.field4137) {
                                if (var9.field4069 == null || class68.field889 - var9.field4137 > 32) {
                                    class176 var56 = new class176();
                                    var56.field2552 = var9;
                                    var56.field2551 = var9.field4075;
                                    class115.field1627.method2325(var56, (byte) 34);
                                } else {
                                    label527: for (int var52 = var9.field4137; var52 < class68.field889; var52++) {
                                        int var53 = class319.field4908[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4069.length; var54++) {
                                            if (var9.field4069[var54] == var53) {
                                                class176 var55 = new class176();
                                                var55.field2552 = var9;
                                                var55.field2551 = var9.field4075;
                                                class115.field1627.method2325(var55, (byte) 34);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field4137 = class68.field889;
                            }
                            if (var9.field4009 != null && class256.field3896 > var9.field4150) {
                                if (var9.field4060 == null || class256.field3896 - var9.field4150 > 32) {
                                    class176 var61 = new class176();
                                    var61.field2552 = var9;
                                    var61.field2551 = var9.field4009;
                                    class115.field1627.method2325(var61, (byte) 34);
                                } else {
                                    label503: for (int var57 = var9.field4150; var57 < class256.field3896; var57++) {
                                        int var58 = class49.field598[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field4060.length; var59++) {
                                            if (var9.field4060[var59] == var58) {
                                                class176 var60 = new class176();
                                                var60.field2552 = var9;
                                                var60.field2551 = var9.field4009;
                                                class115.field1627.method2325(var60, (byte) 34);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field4150 = class256.field3896;
                            }
                            if (var9.field4111 != null && class74.field952 > var9.field3997) {
                                if (var9.field4114 == null || class74.field952 - var9.field3997 > 32) {
                                    class176 var66 = new class176();
                                    var66.field2552 = var9;
                                    var66.field2551 = var9.field4111;
                                    class115.field1627.method2325(var66, (byte) 34);
                                } else {
                                    label479: for (int var62 = var9.field3997; var62 < class74.field952; var62++) {
                                        int var63 = class295.field4607[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field4114.length; var64++) {
                                            if (var9.field4114[var64] == var63) {
                                                class176 var65 = new class176();
                                                var65.field2552 = var9;
                                                var65.field2551 = var9.field4111;
                                                class115.field1627.method2325(var65, (byte) 34);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field3997 = class74.field952;
                            }
                            if (class61.field751 > var9.field4035 && var9.field3988 != null) {
                                class176 var67 = new class176();
                                var67.field2552 = var9;
                                var67.field2551 = var9.field3988;
                                class115.field1627.method2325(var67, (byte) 34);
                            }
                            if (class186.field2686 > var9.field4035 && var9.field4144 != null) {
                                class176 var68 = new class176();
                                var68.field2552 = var9;
                                var68.field2551 = var9.field4144;
                                class115.field1627.method2325(var68, (byte) 34);
                            }
                            if (class54.field663 > var9.field4035 && var9.field4124 != null) {
                                class176 var69 = new class176();
                                var69.field2552 = var9;
                                var69.field2551 = var9.field4124;
                                class115.field1627.method2325(var69, (byte) 34);
                            }
                            if (class320.field4920 > var9.field4035 && var9.field4058 != null) {
                                class176 var70 = new class176();
                                var70.field2552 = var9;
                                var70.field2551 = var9.field4058;
                                class115.field1627.method2325(var70, (byte) 34);
                            }
                            if (class229.field3341 > var9.field4035 && var9.field4036 != null) {
                                class176 var71 = new class176();
                                var71.field2552 = var9;
                                var71.field2551 = var9.field4036;
                                class115.field1627.method2325(var71, (byte) 34);
                            }
                            var9.field4035 = class331.field5060;
                            if (var9.field4041 != null) {
                                for (int var72 = 0; var72 < class162.field2242; var72++) {
                                    class176 var73 = new class176();
                                    var73.field2552 = var9;
                                    var73.field2554 = class254.field3856[var72];
                                    var73.field2556 = class237.field3482[var72];
                                    var73.field2551 = var9.field4041;
                                    class115.field1627.method2325(var73, (byte) 34);
                                }
                            }
                            if (class342.field5297 && var9.field4073 != null) {
                                class176 var74 = new class176();
                                var74.field2552 = var9;
                                var74.field2551 = var9.field4073;
                                class115.field1627.method2325(var74, (byte) 34);
                            }
                        }
                    }
                    if (!var9.field3993 && class116.field1649 == null && class326.field4995 == null && !class140.field1951) {
                        if ((var9.field4020 >= 0 || var9.field4129 != 0) && class211.field2987 >= var12 && class161.field2216 >= var13 && class211.field2987 < var14 && class161.field2216 < var15) {
                            if (var9.field4020 >= 0) {
                                class113.field1611 = arg0[var9.field4020];
                            } else {
                                class113.field1611 = var9;
                            }
                        }
                        if (var9.field3981 == 8 && class211.field2987 >= var12 && class161.field2216 >= var13 && class211.field2987 < var14 && class161.field2216 < var15) {
                            class204.field2868 = var9;
                        }
                        if (var9.field4059 > var9.field4096) {
                            class60.method350(class211.field2987, class161.field2216, (byte) 114, var9.field3989 + var10, var9.field4096, var11, var9.field4059, var9);
                        }
                    }
                    if (var9.field3981 == 0) {
                        method1948(arg0, var9.field4083, var12, var13, var14, var15, var10 - var9.field4068, var11 - var9.field3990);
                        if (var9.field3975 != null) {
                            method1948(var9.field3975, var9.field4083, var12, var13, var14, var15, var10 - var9.field4068, var11 - var9.field3990);
                        }
                        class343 var75 = (class343) class292.field4585.method1537((long) var9.field4083, -22708);
                        if (var75 != null) {
                            class31.method187(var11, var13, var75.field5329, -1, var14, var10, var12, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1551)
    public final void method1034(int arg0) {
        class129.method869(false);
        field4217++;
        class218.field3063 = new class289();
        class22.field283 = new class142();
        if (class15.field216 != 0) {
            class330.field5045 = new byte[50][];
        }
        class228.method1592(arg0 - 74, class9.field131);
        if (class5.field83 == 0) {
            class311.field4823 = this.getCodeBase().getHost();
            class320.field4911 = 443;
            class298.field4647 = 43594;
        } else if (class5.field83 == 1) {
            class311.field4823 = this.getCodeBase().getHost();
            class320.field4911 = class315.field4854 + 50000;
            class298.field4647 = class315.field4854 + 40000;
        } else if (class5.field83 == 2) {
            class298.field4647 = class315.field4854 + 40000;
            class311.field4823 = "127.0.0.1";
            class320.field4911 = class315.field4854 + 50000;
        }
        class320.field4916 = class311.field4823;
        class26.field346 = class74.field959 = class195.field2805 = class85.field1088 = new short[256];
        if (class265.field4178 == 3 && class5.field83 != 2) {
            class109.field1500 = class315.field4854;
        }
        class230.field3364 = class298.field4647;
        class15.field200 = class298.field4647;
        class307.field4746 = class320.field4911;
        if (class249.field3769 == 1) {
            class44.field530 = class271.field4264;
            class153.field2109 = class84.field1073;
            class64.field836 = 0;
            class64.field835 = 16777215;
            class299.field4668 = class321.field4932;
            class320.field4915 = class153.field2110;
            class163.field2247 = true;
        } else {
            class44.field530 = class261.field3946;
            class320.field4915 = class285.field4484;
            class299.field4668 = class106.field1354;
            class153.field2109 = class112.field1590;
        }
        class152.field2095 = class230.field3364;
        class214.method1461((byte) -122);
        class112.method771(-27335, class260.field3941);
        class128.method858(-127, class260.field3941);
        class336.field5178 = class330.method2280(-55);
        if (class336.field5178 != null) {
            class336.field5178.method545(arg0 - 48, class260.field3941);
        }
        class25.field333 = class265.field4178;
        try {
            if (class9.field131.field4186 != null) {
                class22.field287 = new class50(class9.field131.field4186, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class183.field2633[var2] = new class50(class9.field131.field4187[var2], 6000, 0);
                }
                class299.field4664 = new class50(class9.field131.field4183, 6000, 0);
                class17.field235 = new class315(255, class22.field287, class299.field4664, 500000);
                class89.field1115 = new class50(class9.field131.field4169, 24, 0);
                class9.field131.field4169 = null;
                class9.field131.field4186 = null;
                class9.field131.field4183 = null;
                class9.field131.field4187 = null;
            }
        } catch (IOException var4) {
            class89.field1115 = null;
            class299.field4664 = null;
            class22.field287 = null;
            class17.field235 = null;
        }
        class44.field528 = class315.field4858;
        if (class5.field83 != arg0) {
            class132.field1819 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1666)
    public final void method1032(byte arg0) {
        field4215++;
        if (class17.field236 == 1000) {
            return;
        }
        long var2 = class242.method1748(9434) / 1000000L - class271.field4261;
        class271.field4261 = class242.method1748(9434) / 1000000L;
        if (arg0 >= -16) {
            main((String[]) null);
        }
        boolean var4 = class177.method1212(-126);
        if (var4 && class253.field3838 && class170.field2380 != null) {
            class170.field2380.method1710(-9039);
        }
        if ((class17.field236 == 30 || class17.field236 == 10) && (class63.field823 || class84.field1075 != 0L && class84.field1075 < class200.method1375(-16185))) {
            class35.method208(class63.field823, method1954(true), class235.field3416, class154.field2127, 26332);
        }
        if (class243.field3659 == null) {
            Container var5;
            if (class243.field3659 != null) {
                var5 = class243.field3659;
            } else if (class329.field5029 == null) {
                var5 = class9.field131.field4179;
            } else {
                var5 = class329.field5029;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class329.field5029 == var5) {
                Insets var8 = class329.field5029.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class73.field943 != var6 || class138.field1938 != var7) {
                if (class265.field4172.startsWith("mac")) {
                    class73.field943 = var6;
                    class138.field1938 = var7;
                } else {
                    class129.method869(false);
                }
                class84.field1075 = class200.method1375(-16185) + 500L;
            }
        }
        if (class243.field3659 != null && !class54.field658 && (class17.field236 == 30 || class17.field236 == 10)) {
            class35.method208(false, class191.field2746, -1, -1, 26332);
        }
        boolean var9 = false;
        if (class76.field970) {
            var9 = true;
            class76.field970 = false;
        }
        if (var9) {
            class45.method269((byte) 13);
        }
        if (class250.field3787) {
            for (int var10 = 0; var10 < 100; var10++) {
                class285.field4483[var10] = true;
            }
        }
        if (class17.field236 == 0) {
            class74.method450(class315.field4853, class204.field2859, 20825, (Color) null, var9);
        } else if (class17.field236 == 5) {
            class293.method2086(class88.field1097, -118, false);
        } else if (class17.field236 == 10) {
            class68.method424(-2112214548);
        } else if (class17.field236 == 25 || class17.field236 == 28) {
            if (class219.field3078 == 1) {
                if (class12.field172 < class161.field2225) {
                    class12.field172 = class161.field2225;
                }
                int var12 = (class12.field172 - class161.field2225) * 50 / class12.field172;
                class23.method154((byte) -32, class163.field2251 + "<br>(" + var12 + "%)", false);
            } else if (class219.field3078 == 2) {
                if (class132.field1818 > class263.field4106) {
                    class263.field4106 = class132.field1818;
                }
                int var11 = (class263.field4106 - class132.field1818) * 50 / class263.field4106 + 50;
                class23.method154((byte) -32, class163.field2251 + "<br>(" + var11 + "%)", false);
            } else {
                class23.method154((byte) -32, class163.field2251, false);
            }
        } else if (class17.field236 == 30) {
            class186.method1294(var2, 1487763143);
        } else if (class17.field236 == 40) {
            class23.method154((byte) -32, class196.field2812 + "<br>" + class158.field2176, false);
        }
        if (class250.field3787 && class17.field236 != 0) {
            class250.method1809();
            for (int var13 = 0; var13 < class247.field3751; var13++) {
                class211.field2985[var13] = false;
            }
        } else if ((class17.field236 == 30 || class17.field236 == 10) && class177.field2569 == 0 && !var9) {
            try {
                Graphics var17 = class260.field3941.getGraphics();
                for (int var18 = 0; var18 < class247.field3751; var18++) {
                    if (class211.field2985[var18]) {
                        class72.field916.method906(class228.field3291[var18], class115.field1625[var18], false, var17, class17.field234[var18], class78.field984[var18]);
                        class211.field2985[var18] = false;
                    }
                }
            } catch (Exception var20) {
                class260.field3941.repaint();
            }
        } else if (class17.field236 != 0) {
            try {
                Graphics var14 = class260.field3941.getGraphics();
                class72.field916.method909(var14, 0, 0, (byte) 71);
                for (int var15 = 0; var15 < class247.field3751; var15++) {
                    class211.field2985[var15] = false;
                }
            } catch (Exception var21) {
                class260.field3941.repaint();
            }
        }
        if (class322.field4950) {
            class132.method878(5);
        }
        if (class305.field4732 && class17.field236 == 10 && class146.field2031 != -1) {
            class305.field4732 = false;
            class319.method2223(class9.field131, 24398);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 1890)
    private final void method1949(byte arg0) {
        if (!class305.field4732) {
            label247: while (true) {
                do {
                    if (!class220.method1508(false)) {
                        break label247;
                    }
                } while (class12.field167 != 's' && class12.field167 != 'S');
                class305.field4732 = true;
            }
        }
        field4216++;
        if (class80.field1020 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class200.method1375(-16185);
            if (class308.field4758 == 0L) {
                class308.field4758 = var28;
            }
            if (var27 > 16384 && var28 - class308.field4758 < 5000L) {
                if (var28 - class272.field4277 > 1000L) {
                    System.gc();
                    class272.field4277 = var28;
                }
                class204.field2859 = 5;
                class315.field4853 = class285.field4477;
            } else {
                class204.field2859 = 5;
                class315.field4853 = class227.field3239;
                class80.field1020 = 10;
            }
        } else if (class80.field1020 == 10) {
            class193.method1338(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class149.field2072[var2] = new class22(104, 104);
            }
            class315.field4853 = class170.field2431;
            class204.field2859 = 10;
            class80.field1020 = 30;
        } else if (class80.field1020 == 30) {
            if (class320.field4918 == null) {
                class320.field4918 = new class309(class22.field283, class218.field3063);
            }
            if (class320.field4918.method2165(-4558)) {
                class283.field4439 = class313.method2196(true, -4, true, 0, false);
                class120.field1686 = class313.method2196(true, -50, true, 1, false);
                class165.field2284 = class313.method2196(true, 124, false, 2, true);
                class48.field568 = class313.method2196(true, 127, true, 3, false);
                class148.field2060 = class313.method2196(true, -34, true, 4, false);
                class222.field3133 = class313.method2196(true, -53, true, 5, true);
                class318.field4892 = class313.method2196(false, -122, true, 6, true);
                class48.field582 = class313.method2196(true, 126, true, 7, false);
                class164.field2271 = class313.method2196(true, 41, true, 8, false);
                class311.field4818 = class313.method2196(true, -107, true, 9, false);
                class67.field864 = class313.method2196(true, -111, true, 10, false);
                class320.field4914 = class313.method2196(true, 121, true, 11, false);
                class254.field3862 = class313.method2196(true, 47, true, 12, false);
                class78.field979 = class313.method2196(true, -92, true, 13, false);
                class56.field677 = class313.method2196(false, -20, true, 14, false);
                class326.field4989 = class313.method2196(true, 127, true, 15, false);
                class237.field3480 = class313.method2196(true, -16, true, 16, false);
                class261.field3951 = class313.method2196(true, 125, true, 17, false);
                class206.field2881 = class313.method2196(true, 125, true, 18, false);
                class140.field1955 = class313.method2196(true, -119, true, 19, false);
                class128.field1765 = class313.method2196(true, 118, true, 20, false);
                class140.field1952 = class313.method2196(true, 20, true, 21, false);
                class289.field4534 = class313.method2196(true, 127, true, 22, false);
                class206.field2889 = class313.method2196(true, 126, true, 23, true);
                class60.field733 = class313.method2196(true, 118, true, 24, false);
                class128.field1761 = class313.method2196(true, 118, true, 25, false);
                class191.field2760 = class313.method2196(true, 124, true, 26, true);
                class339.field5267 = class313.method2196(true, 125, true, 27, false);
                class253.field3839 = class313.method2196(true, -98, true, 28, true);
                class80.field1020 = 40;
                class204.field2859 = 15;
                class315.field4853 = class129.field1775;
            } else {
                class315.field4853 = class171.field2457;
                class204.field2859 = 12;
            }
        } else if (class80.field1020 == 40) {
            int var24 = 0;
            for (int var25 = 0; var25 < 29; var25++) {
                var24 += class165.field2273[var25].method1682(true) * class118.field1663[var25] / 100;
            }
            if (var24 == 100) {
                class315.field4853 = class328.field5017;
                class204.field2859 = 20;
                class281.method2006(class164.field2271, 126);
                class149.method1000(0, class164.field2271);
                class146.method988(0, class164.field2271);
                class80.field1020 = 41;
            } else {
                if (var24 != 0) {
                    class315.field4853 = class236.field3436 + var24 + "%";
                }
                class204.field2859 = 20;
            }
        } else if (class80.field1020 == 41) {
            if (class253.field3839.method1188(-1)) {
                this.method1953(51, class253.field3839.method1195(1, 1));
                class315.field4853 = class38.field461;
                class80.field1020 = 45;
                class204.field2859 = 25;
            } else {
                class315.field4853 = class339.field5263 + class253.field3839.method1202(121) + "%";
                class204.field2859 = 25;
            }
        } else if (class80.field1020 == 45) {
            class271.method1965(class54.field668, (byte) 68, 2, 22050);
            class282.field4422 = new class228();
            class282.field4422.method1586(128, 9, -29505);
            class170.field2380 = class175.method1196(class9.field131, 22050, 5741, class260.field3941, 0);
            class170.field2380.method1720(-5605, class282.field4422);
            class337.method2327(class148.field2060, class282.field4422, class56.field677, (byte) 111, class326.field4989);
            class224.field3186 = class175.method1196(class9.field131, 2048, 5741, class260.field3941, 1);
            class19.field255 = new class8();
            class224.field3186.method1720(-5605, class19.field255);
            class255.field3880 = new class232(22050, class276.field4312);
            class177.field2580 = class318.field4892.method1179((byte) -118, "scape main");
            class315.field4853 = class61.field749;
            class80.field1020 = 50;
            class204.field2859 = 30;
        } else if (class80.field1020 == 50) {
            int var22 = class291.method2071(28404, class78.field979, class164.field2271);
            int var23 = class120.method817(-12);
            if (var22 < var23) {
                class204.field2859 = 35;
                class315.field4853 = class316.field4875 + var22 * 100 / var23 + "%";
            } else {
                class315.field4853 = class195.field2799;
                class204.field2859 = 35;
                class80.field1020 = 60;
            }
        } else if (class80.field1020 == 60) {
            int var3 = class223.method1532((byte) -14, class164.field2271);
            int var4 = class133.method883(0);
            if (var3 >= var4) {
                class204.field2859 = 40;
                class315.field4853 = class204.field2869;
                class80.field1020 = 65;
            } else {
                class315.field4853 = class154.field2128 + var3 * 100 / var4 + "%";
                class204.field2859 = 40;
            }
        } else if (class80.field1020 == 65) {
            class192.method1329(class164.field2271, 0, class78.field979);
            class204.field2859 = 45;
            class315.field4853 = class186.field2693;
            class97.method587(-15525, 5);
            class80.field1020 = 70;
        } else if (class80.field1020 == 70) {
            class165.field2284.method1188(-1);
            byte var10 = 0;
            int var11 = var10 + class165.field2284.method1202(114);
            class237.field3480.method1188(-1);
            int var12 = var11 + class237.field3480.method1202(115);
            class261.field3951.method1188(-1);
            int var13 = var12 + class261.field3951.method1202(122);
            class206.field2881.method1188(-1);
            int var14 = var13 + class206.field2881.method1202(116);
            class140.field1955.method1188(-1);
            int var15 = var14 + class140.field1955.method1202(120);
            class128.field1765.method1188(-1);
            int var16 = var15 + class128.field1765.method1202(125);
            class140.field1952.method1188(-1);
            int var17 = var16 + class140.field1952.method1202(122);
            class289.field4534.method1188(-1);
            int var18 = var17 + class289.field4534.method1202(123);
            class60.field733.method1188(-1);
            int var19 = var18 + class60.field733.method1202(126);
            class128.field1761.method1188(-1);
            int var20 = var19 + class128.field1761.method1202(126);
            class339.field5267.method1188(-1);
            int var21 = var20 + class339.field5267.method1202(121);
            if (var21 < 1100) {
                class315.field4853 = class254.field3870 + var21 / 11 + "%";
                class204.field2859 = 50;
            } else {
                class276.method1985(class165.field2284, -1033);
                class27.method168(class165.field2284, -7077);
                class187.method1299(class165.field2284, (byte) -67);
                class147.method994(class48.field582, (byte) -110, class165.field2284);
                class279.method1999(true, class237.field3480, class48.field582, -15311);
                class56.method331(class48.field582, class206.field2881, 2);
                class44.method265(class140.field1955, class322.field4948, -94, true, class48.field582);
                class293.method2081(class165.field2284, (byte) -118);
                class121.method821(class120.field1686, class283.field4439, (byte) 76, class128.field1765);
                class325.method2252(class165.field2284, -12031);
                class23.method155(class140.field1952, class48.field582, 8957);
                class284.method2029((byte) 80, class289.field4534);
                class62.method359(class165.field2284, 4096);
                class219.method1506(true, class48.field568, class48.field582, class164.field2271, class78.field979);
                class41.method239(-25704, class165.field2284);
                class252.method1836(-11910, class261.field3951);
                class134.method892(class128.field1761, new class216(), class60.field733, (byte) -52);
                class308.method2160(class128.field1761, class60.field733, -85);
                class196.method1358(class165.field2284, -90);
                class216.method1488((byte) -52, class165.field2284);
                class339.method2349((byte) 108, class165.field2284);
                class40.method237((byte) 55, class165.field2284, class164.field2271);
                class160.method1059(class164.field2271, false, class165.field2284);
                class204.field2859 = 50;
                class315.field4853 = class116.field1641;
                class211.method1449((byte) 91);
                class80.field1020 = 80;
            }
        } else {
            if (arg0 < 20) {
                this.method1955(39);
            }
            if (class80.field1020 == 80) {
                int var5 = class43.method252((byte) 35, class164.field2271);
                int var6 = class284.method2033((byte) -61);
                if (var5 < var6) {
                    class315.field4853 = class264.field4164 + var5 * 100 / var6 + "%";
                    class204.field2859 = 60;
                } else {
                    class312.method2193(class164.field2271, -104);
                    class204.field2859 = 60;
                    class80.field1020 = 90;
                    class315.field4853 = class163.field2255;
                }
            } else if (class80.field1020 == 90) {
                if (class191.field2760.method1188(-1)) {
                    class63 var9 = new class63(class311.field4818, class191.field2760, class164.field2271, 20, !class117.field1661);
                    class215.method1478(var9);
                    if (class165.field2289 == 1) {
                        class215.method1486(0.9F);
                    }
                    if (class165.field2289 == 2) {
                        class215.method1486(0.8F);
                    }
                    if (class165.field2289 == 3) {
                        class215.method1486(0.7F);
                    }
                    if (class165.field2289 == 4) {
                        class215.method1486(0.6F);
                    }
                    class80.field1020 = 100;
                    class315.field4853 = class27.field353;
                    class204.field2859 = 70;
                } else {
                    class315.field4853 = class239.field3591 + class191.field2760.method1202(115) + "%";
                    class204.field2859 = 70;
                }
            } else if (class80.field1020 == 100) {
                if (class205.method1395(-1, class164.field2271)) {
                    class80.field1020 = 110;
                }
            } else if (class80.field1020 == 110) {
                class331.field5062 = new class23();
                class9.field131.method1926(10, (byte) 49, class331.field5062);
                class80.field1020 = 120;
                class315.field4853 = class134.field1859;
                class204.field2859 = 75;
            } else if (class80.field1020 == 120) {
                if (class67.field864.method1204("", 32203, "huffman")) {
                    class116 var8 = new class116(class67.field864.method1180(-116, "", "huffman"));
                    class21.method128(var8, false);
                    class315.field4853 = class146.field2035;
                    class204.field2859 = 80;
                    class80.field1020 = 130;
                } else {
                    class204.field2859 = 80;
                    class315.field4853 = class146.field2025 + "0%";
                }
            } else if (class80.field1020 == 130) {
                if (!class48.field568.method1188(-1)) {
                    class315.field4853 = class289.field4527 + class48.field568.method1202(121) * 3 / 4 + "%";
                    class204.field2859 = 85;
                } else if (!class254.field3862.method1188(-1)) {
                    class315.field4853 = class289.field4527 + (class254.field3862.method1202(125) / 10 + 75) + "%";
                    class204.field2859 = 85;
                } else if (!class78.field979.method1188(-1)) {
                    class315.field4853 = class289.field4527 + (class78.field979.method1202(115) / 20 + 85) + "%";
                    class204.field2859 = 85;
                } else if (class206.field2889.method1207("details", false)) {
                    class106.method621(0, class206.field2889, class275.field4287);
                    class344.method2378(class48.field582);
                    class80.field1020 = 135;
                    class204.field2859 = 95;
                    class315.field4853 = class311.field4810;
                } else {
                    class315.field4853 = class289.field4527 + (class206.field2889.method1176("details", (byte) -125) / 10 + 90) + "%";
                    class204.field2859 = 85;
                }
            } else if (class80.field1020 == 135) {
                int var7 = class279.method2001((byte) -103);
                if (var7 == -1) {
                    class315.field4853 = class27.field354;
                    class204.field2859 = 95;
                } else if (var7 == 7 || var7 == 9) {
                    this.method1031("worldlistfull", (byte) 36);
                    class97.method587(-15525, 1000);
                } else if (class192.field2764) {
                    class315.field4853 = class342.field5312;
                    class80.field1020 = 140;
                    class204.field2859 = 96;
                } else {
                    this.method1031("worldlistio_" + var7, (byte) 78);
                    class97.method587(-15525, 1000);
                }
            } else if (class80.field1020 == 140) {
                class244.field3678 = class48.field568.method1179((byte) -115, "loginscreen");
                class222.field3133.method1193(false, true, 52);
                class318.field4892.method1193(true, true, 98);
                class164.field2271.method1193(true, true, 43);
                class78.field979.method1193(true, true, -102);
                class67.field864.method1193(true, true, 104);
                class48.field568.method1193(true, true, 106);
                class204.field2859 = 97;
                class80.field1020 = 150;
                class315.field4853 = class56.field685;
                class322.field4950 = true;
            } else if (class80.field1020 == 150) {
                class246.method1768();
                if (class305.field4732) {
                    class67.field878 = 0;
                    class191.field2746 = 0;
                    class285.field4465 = 0;
                    class163.field2260 = 0;
                }
                class305.field4732 = true;
                class319.method2223(class9.field131, 24398);
                class35.method208(false, class191.field2746, -1, -1, 26332);
                class204.field2859 = 100;
                class80.field1020 = 160;
                class315.field4853 = class159.field2201;
            } else if (class80.field1020 == 160) {
                class179.method1244(false, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lcc;)Lcc;", line = 2416)
    public static final class263 method1950(class263 arg0) {
        int var1 = method1952(arg0).method1115((byte) 24);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class91.method530(arg0.field4065, 10989328);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 2436)
    private final void method1951(byte arg0) {
        field4223++;
        class162.field2242 = 0;
        if (arg0 != 109) {
            method1944(89, -102);
        }
        while (class220.method1508(false) && class162.field2242 < 128) {
            class254.field3856[class162.field2242] = class320.field4912;
            class237.field3482[class162.field2242] = class12.field167;
            class162.field2242++;
        }
        class322.field4939++;
        if (class146.field2031 != -1) {
            class31.method187(0, 0, class146.field2031, arg0 - 110, class188.field2712, 0, 0, class314.field4847);
        }
        class331.field5060++;
        if (class250.field3787) {
            int var2 = 2359807;
            label194: for (int var3 = 0; var3 < 32768; var3++) {
                class184 var4 = class223.field3159[var3];
                if (var4 != null) {
                    byte var5 = var4.field2657.field4426;
                    if ((var5 & 0x2) > 0 && var4.field2411 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field2359[0] = (var4.field2392 >> 7) + var6;
                            var4.field2403[0] = (var4.field2357 >> 7) + var7;
                            var4.field2406[0] = 1;
                            class149.field2072[class138.field1940].method137(0, var4.field2392 >> 7, var4.field2357 >> 7, 128, false, false, var4.method748(false), var4.method748(false));
                            if (var4.field2359[0] >= 0 && var4.field2359[0] <= 104 - var4.method748(false) && var4.field2403[0] >= 0 && var4.field2403[0] <= (104 - var4.method748(false)) && class149.field2072[class138.field1940].method141(var4.field2403[0], var4.field2357 >> 7, var4.field2359[0], var4.field2392 >> 7, (byte) 124)) {
                                if (var4.method748(false) > 1) {
                                    for (int var8 = var4.field2359[0]; var8 < (var4.field2359[0] + var4.method748(false)); var8++) {
                                        for (int var9 = var4.field2403[0]; var9 < (var4.field2403[0] + var4.method748(false)); var9++) {
                                            if ((var2 & class149.field2072[class138.field1940].field282[var8][var9]) != 0) {
                                                continue label194;
                                            }
                                        }
                                    }
                                }
                                var4.field2411 = 1;
                            }
                        }
                    }
                    class137.method919(false, var4);
                    class149.method1003(0, var4);
                    class10.method54(var4, true);
                    class149.field2072[class138.field1940].method133(var4.method748(false), 8, false, false, var4.method748(false), var4.field2392 >> 7, var4.field2357 >> 7);
                }
            }
        }
        if (!class250.field3787) {
            class332.method2286(25485);
        } else if (class60.field739 == 0 && class239.field3585 == 0) {
            if (class118.field1671 == 2) {
                class55.method329(-120);
            } else {
                class262.method1885(arg0 + 15);
            }
            if (class130.field1792 >> 7 < 14 || (class130.field1792 >> 7) >= 90 || (class109.field1506 >> 7) < 14 || (class109.field1506 >> 7) >= 90) {
                class329.method2276(25);
            }
        }
        while (true) {
            class176 var10;
            class263 var11;
            class263 var12;
            do {
                var10 = (class176) class107.field1367.method2323((byte) -63);
                if (var10 == null) {
                    while (true) {
                        class176 var13;
                        class263 var17;
                        class263 var18;
                        do {
                            var13 = (class176) class328.field5006.method2323((byte) -27);
                            if (var13 == null) {
                                while (true) {
                                    class176 var14;
                                    class263 var15;
                                    class263 var16;
                                    do {
                                        var14 = (class176) class115.field1627.method2323((byte) -44);
                                        if (var14 == null) {
                                            if (class116.field1649 != null) {
                                                class138.method921((byte) 99);
                                            }
                                            if (class32.field408 != null && class32.field408.field238 == 1) {
                                                if (class32.field408.field241 != null) {
                                                    class15.method108((byte) -49, class163.field2257, class243.field3662);
                                                }
                                                class163.field2257 = null;
                                                class32.field408 = null;
                                                class243.field3662 = false;
                                            }
                                            if ((class38.field463 % 1500) == 0) {
                                                class318.method2221((byte) -48);
                                            }
                                            return;
                                        }
                                        var15 = var14.field2552;
                                        if (var15.field4012 < 0) {
                                            break;
                                        }
                                        var16 = class91.method530(var15.field4065, arg0 + 10989219);
                                    } while (var16 == null || var16.field3975 == null || var16.field3975.length <= var15.field4012 || var16.field3975[var15.field4012] != var15);
                                    class283.method2027(200000, var14);
                                }
                            }
                            var17 = var13.field2552;
                            if (var17.field4012 < 0) {
                                break;
                            }
                            var18 = class91.method530(var17.field4065, 10989328);
                        } while (var18 == null || var18.field3975 == null || var17.field4012 >= var18.field3975.length || var18.field3975[var17.field4012] != var17);
                        class283.method2027(arg0 ^ 0x30D2D, var13);
                    }
                }
                var11 = var10.field2552;
                if (var11.field4012 < 0) {
                    break;
                }
                var12 = class91.method530(var11.field4065, 10989328);
            } while (var12 == null || var12.field3975 == null || var12.field3975.length <= var11.field4012 || var12.field3975[var11.field4012] != var11);
            class283.method2027(arg0 + 199891, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2654)
    public final void method1022(byte arg0) {
        field4219++;
        if (class250.field3787) {
            class250.method1805();
        }
        if (class243.field3659 != null) {
            class244.method1756(class9.field131, -27740, class243.field3659);
            class243.field3659 = null;
        }
        if (class9.field131 != null) {
            class9.field131.method1925(this.getClass(), -76);
        }
        if (class331.field5062 != null) {
            class331.field5062.field309 = false;
        }
        class331.field5062 = null;
        if (class236.field3463 != null) {
            class236.field3463.method1096((byte) 82);
            class236.field3463 = null;
        }
        class345.method2380(-1, class260.field3941);
        class89.method523(class260.field3941, -96);
        if (class336.field5178 != null) {
            class336.field5178.method544(class260.field3941, (byte) 105);
        }
        class63.method388((byte) -100);
        if (arg0 > -20) {
            field4233 = 102;
        }
        class7.method22(false);
        class336.field5178 = null;
        if (class170.field2380 != null) {
            class170.field2380.method1709(0);
        }
        if (class224.field3186 != null) {
            class224.field3186.method1709(0);
        }
        class22.field283.method955((byte) 106);
        class218.field3063.method2066(3);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lcc;)Lng;", line = 2706)
    public static final class171 method1952(class263 arg0) {
        class171 var1 = (class171) class277.field4315.method1537(((long) arg0.field4083 << 32) + (long) arg0.field4012, -22708);
        return var1 == null ? arg0.field4089 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V", line = 2711)
    private final void method1953(int arg0, byte[] arg1) {
        field4220++;
        class107 var3 = new class107(arg1);
        int var4 = 2 / ((-arg0 - 9) / 32);
        while (true) {
            int var5 = var3.method661(-1);
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                int[] var6 = class91.field1141 = new int[6];
                var6[0] = var3.method624(14612);
                var6[1] = var3.method624(14612);
                var6[2] = var3.method624(14612);
                var6[3] = var3.method624(14612);
                var6[4] = var3.method624(14612);
                var6[5] = var3.method624(14612);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)I", line = 2758)
    public static final int method1954(boolean arg0) {
        field4226++;
        if (class243.field3659 != null) {
            return 3;
        } else if (class250.field3787 && class309.field4783) {
            return 2;
        } else {
            if (!arg0) {
                method1944(-25, -34);
            }
            return class250.field3787 && !class309.field4783 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2784)
    private final void method1955(int arg0) {
        field4225++;
        if (arg0 != -10554) {
            this.method1942(-3);
        }
        boolean var2 = class22.field283.method942(0);
        if (!var2) {
            this.method1942(arg0 + 31339);
        }
    }
}
