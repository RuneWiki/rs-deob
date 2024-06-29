import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class79 {

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Luf;")
    public static class168 field4929 = class148.method1019(-1720, "leuchten3:");

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field4939 = true;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field4941 = false;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Ln;")
    public static class222 field4933;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    public static boolean field4935;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Z")
    public static boolean field4948;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "[Lsk;")
    public static class193[] field4945;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lg;)Lg;", line = 15)
    public static final class242 method2003(class242 arg0) {
        int var1 = class252.method1724(method2015(arg0), (byte) -88);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class130.method910((byte) -87, arg0.field3977);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 45)
    private final void method2004(int arg0) {
        field4942++;
        if (class272.field4581 >= 4) {
            this.method478("js5crc", arg0 - 13317);
            class193.field3143 = 1000;
            return;
        }
        if (class214.field3497 >= 4) {
            if (class193.field3143 == 0 || class193.field3143 == 5) {
                this.method478("js5io", arg0 - 13371);
                class193.field3143 = 1000;
                return;
            }
            class214.field3497 = 3;
            class274.field4608 = 3000;
        }
        if (class274.field4608-- > 0) {
            return;
        }
        try {
            if (class36.field409 == 0) {
                class125.field1926 = class51.field622.method428(class201.field3307, 0, class229.field3698);
                class36.field409++;
            }
            if (class36.field409 == 1) {
                if (class125.field1926.field1746 == 2) {
                    this.method2007((byte) 1, -1);
                    return;
                }
                if (class125.field1926.field1746 == 1) {
                    class36.field409++;
                }
            }
            if (class36.field409 == 2) {
                class251.field4264 = new class169((Socket) class125.field1926.field1742, class51.field622);
                class153 var2 = new class153(5);
                var2.method1095(15, arg0 - 13280);
                var2.method1045(510, (byte) 15);
                class251.field4264.method1233((byte) 18, var2.field2359, 5, 0);
                class36.field409++;
                class229.field3699 = class194.method1368((byte) -123);
            }
            if (class36.field409 == 3) {
                if (class193.field3143 == 0 || class193.field3143 == 5 || class251.field4264.method1227(0) > 0) {
                    int var3 = class251.field4264.method1232(0);
                    if (var3 != 0) {
                        this.method2007((byte) 1, var3);
                        return;
                    }
                    class36.field409++;
                } else if ((class194.method1368((byte) 124) - class229.field3699) > 30000L) {
                    this.method2007((byte) 1, -2);
                    return;
                }
            }
            if (arg0 != 13249) {
                return;
            }
            if (class36.field409 == 4) {
                boolean var4 = class193.field3143 == 5 || class193.field3143 == 10 || class193.field3143 == 28;
                class103.method775(!var4, (byte) -43, class251.field4264);
                class36.field409 = 0;
                class169.field2774 = 0;
                class125.field1926 = null;
                class251.field4264 = null;
            }
        } catch (IOException var6) {
            this.method2007((byte) 1, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 172)
    private final void method2005(byte arg0) {
        field4940++;
        boolean var2 = class188.method1328(0);
        if (arg0 < 91) {
            field4939 = false;
        }
        if (!var2) {
            this.method2004(13249);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)[B", line = 195)
    public static final byte[] method2006(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        field4946++;
        byte[] var3 = new byte[var2];
        class185.method1308(arg1, arg0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 220)
    private final void method2007(byte arg0, int arg1) {
        class169.field2774++;
        class36.field409 = 0;
        class251.field4264 = null;
        if (arg0 != 1) {
            method2015((class242) null);
        }
        field4931++;
        class125.field1926 = null;
        if (class27.field338 == class229.field3698) {
            class229.field3698 = class266.field4491;
        } else {
            class229.field3698 = class27.field338;
        }
        if (class169.field2774 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class193.field3143 == 0 || class193.field3143 == 5) {
                this.method478("js5connect_full", -114);
                class193.field3143 = 1000;
            } else {
                class274.field4608 = 3000;
            }
        } else if (class169.field2774 >= 2 && arg1 == 6) {
            this.method478("js5connect_outofdate", arg0 ^ 0xFFFFFF8F);
            class193.field3143 = 1000;
        } else if (class169.field2774 >= 4) {
            if (class193.field3143 == 0 || class193.field3143 == 5) {
                this.method478("js5connect", -91);
                class193.field3143 = 1000;
            } else {
                class274.field4608 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 278)
    private final String method2008(int arg0, String arg1) {
        field4943++;
        StringBuffer var3 = new StringBuffer();
        int var4 = 0;
        if (arg0 > -75) {
            return (String) null;
        }
        while (arg1.length() > var4) {
            char var5 = arg1.charAt(var4);
            if ((var5 < '0' || var5 > '9') && (var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z')) {
                var3.append('%');
                int var6 = (var5 & 0xF3) >> 4;
                if (var6 >= 0 && var6 <= 9) {
                    var3.append((char) (var6 + 48));
                } else if (var6 >= 10 && var6 <= 15) {
                    var3.append((char) (var6 + 65 - 10));
                }
                int var7 = var5 & 0xF;
                if (var7 >= 0 && var7 <= 9) {
                    var3.append((char) (var7 + 48));
                } else if (var7 >= 10 && var7 <= 15) {
                    var3.append((char) (var7 + 65 - 10));
                }
            } else {
                var3.append(var5);
            }
            var4++;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 331)
    public static final void main(String[] arg0) {
        field4944++;
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class55.method305(1);
            }
            class188.field2984 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class217.field3542 = 0;
            } else if (arg0[1].equals("office")) {
                class217.field3542 = 1;
            } else if (arg0[1].equals("local")) {
                class217.field3542 = 2;
            } else {
                class55.method305(1);
            }
            if (arg0[2].equals("live")) {
                class110.field1710 = 0;
            } else if (arg0[2].equals("rc")) {
                class110.field1710 = 1;
            } else if (arg0[2].equals("wip")) {
                class110.field1710 = 2;
            } else {
                class55.method305(1);
            }
            if (arg0[4].equals("free")) {
                class58.field764 = false;
            } else if (arg0[4].equals("members")) {
                class58.field764 = true;
            } else {
                class55.method305(1);
            }
            if (arg0[5].equals("english")) {
                class164.field2634 = 0;
            } else if (arg0[5].equals("german")) {
                class2.method7(19345);
                class164.field2634 = 1;
            } else {
                class55.method305(1);
            }
            if (arg0[6].equals("game0")) {
                class58.field765 = 0;
            } else if (arg0[6].equals("game1")) {
                class58.field765 = 1;
            } else {
                class55.method305(1);
            }
            if (arg0.length != 8) {
                class294.field4985 = false;
            } else if (arg0[7].equals("safemode")) {
                class294.field4985 = true;
            } else {
                class55.method305(1);
            }
            class45.field553 = class182.field2934;
            class201.field3307 = "127.0.0.1";
            class26.field329 = 0;
            client var1 = new client();
            var1.method482(-105, 27, 510, 765, class110.field1710 + 32, 503, "runescape");
            class283.field4782.setLocation(40, 40);
        } catch (Exception var3) {
            class43.method234(var3, -15954, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 431)
    public final void method476(int arg0) {
        field4934++;
        class90.method611();
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class8.field98 != null) {
            class293.method2018(class51.field622, (byte) -127, class8.field98);
            class8.field98 = null;
        }
        if (class51.field622 != null) {
            class51.field622.method433((byte) -70, this.getClass());
        }
        if (class15.field170 != null) {
            class15.field170.field3161 = false;
        }
        class15.field170 = null;
        if (class157.field2493 != null) {
            class157.field2493.method1229(545);
            class157.field2493 = null;
        }
        class249.method1711(class189.field3023, -1477252336);
        class196.method1385(-1, class189.field3023);
        if (class31.field382 != null) {
            class31.field382.method333(class189.field3023, false);
        }
        if (arg0 != -22024) {
            field4935 = false;
        }
        class12.method41(76);
        class224.method1542((byte) 126);
        class31.field382 = null;
        if (class291.field4907 != null) {
            class291.field4907.method998((byte) 97);
        }
        if (class103.field1601 != null) {
            class103.field1601.method998((byte) 97);
        }
        class200.method1406(9149);
        class196.method1377(115);
        try {
            if (class283.field4779 != null) {
                class283.field4779.method365(true);
            }
            if (class294.field4990 != null) {
                for (int var2 = 0; var2 < class294.field4990.length; var2++) {
                    if (class294.field4990[var2] != null) {
                        class294.field4990[var2].method365(true);
                    }
                }
            }
            if (class153.field2365 != null) {
                class153.field2365.method365(true);
            }
            if (class38.field477 != null) {
                class38.field477.method365(true);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 524)
    public final void init() {
        field4947++;
        if (!this.method483(0)) {
            return;
        }
        class188.field2984 = Integer.parseInt(this.getParameter("worldid"));
        class110.field1710 = Integer.parseInt(this.getParameter("modewhat"));
        class217.field3542 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class294.field4985 = true;
        } else {
            class294.field4985 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class58.field764 = true;
        } else {
            class58.field764 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class2.method7(19345);
            class164.field2634 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class58.field765 = 1;
        } else {
            class58.field765 = 0;
        }
        try {
            class67.field888 = Integer.parseInt(this.getParameter("js"));
            class27.field336 = Integer.parseInt(this.getParameter("plug"));
            class26.field329 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var12) {
        }
        class45.field553 = class113.field1748.method1220(this, false);
        if (class45.field553 == null) {
            class45.field553 = class182.field2934;
        }
        String var6 = this.getParameter("advert");
        if (var6 != null) {
            byte[] var7;
            try {
                var7 = var6.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var11) {
                var7 = var6.getBytes();
            }
            class168 var9 = class183.method1302((byte) -10, 0, var7.length, var7);
            boolean var10 = class20.method93(var9, (byte) -38);
            if (var10) {
                class273.field4589 = var9;
            }
        }
        class201.field3307 = this.getCodeBase().getHost();
        this.method480(class110.field1710 + 32, 3, 510, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 608)
    public final void method469(boolean arg0) {
        field4927++;
        if (class193.field3143 == 1000) {
            return;
        }
        class203.field3335++;
        if ((class203.field3335 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class124.field1919 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class299.field5075.setSeed((long) class124.field1919);
        }
        this.method2005((byte) 115);
        class289.method1990(1);
        class57.method325(-32485);
        class254.method1750((byte) 116);
        class150.method1034(-18);
        class120.method863((byte) -99);
        if (arg0) {
            return;
        }
        class7.method30();
        if (class31.field382 != null) {
            int var3 = class31.field382.method331(32713);
            class26.field324 = var3;
        }
        if (class193.field3143 == 0) {
            this.method2009((byte) -45);
            class289.method1987(88);
        } else if (class193.field3143 == 5) {
            this.method2009((byte) -47);
            class289.method1987(110);
        } else if (class193.field3143 == 25 || class193.field3143 == 28) {
            class278.method1923((byte) 113);
        }
        if (class193.field3143 == 10) {
            this.method2010(-122);
            class178.method1281(124);
            class109.method806(-124);
        } else if (class193.field3143 == 30) {
            class251.method1714((byte) 76);
        } else if (class193.field3143 == 40) {
            class109.method806(-124);
            if (class165.field2638 != -3) {
                if (class165.field2638 == 15) {
                    class224.method1539(true);
                } else if (class165.field2638 != 2) {
                    class68.method382(15979);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 720)
    public final void method484(boolean arg0) {
        field4932++;
        method2013(!arg0);
        class168.method1210(0);
        class278.method1921((byte) -5);
        class175.method1266((byte) 28);
        class244.method1678(117);
        class79.method470(64);
        class90.method612();
        class183.method1300(-1);
        class285.method1972(115);
        class195.method1370((byte) -106);
        class15.method58(1);
        class153.method1056((byte) -97);
        class169.method1234((byte) -88);
        class283.method1955(255);
        class63.method364(-15747);
        class110.method814(1439);
        class204.method1423(120);
        class22.method117((byte) 55);
        class95.method724(4);
        class76.method452((byte) 113);
        class253.method1742(32);
        class242.method1670(20);
        class99.method739(arg0);
        class80.method489(arg0);
        class72.method406(-59);
        class67.method377(true);
        class179.method1286((byte) -4);
        class284.method1959((byte) 118);
        class82.method553((byte) -100);
        class145.method1002(true);
        class62.method352(-13139);
        class216.method1494(false);
        class190.method1346(true);
        class189.method1330(0);
        class127.method897(64);
        class196.method1382(-1);
        class240.method1621(12666);
        class24.method122(0);
        class273.method1887(45);
        class68.method386(0);
        class296.method2030((byte) 100);
        class111.method825((byte) 104);
        class106.method790(0);
        class8.method33((byte) 104);
        class206.method1437((byte) -95);
        class2.method5(true);
        class213.method1481((byte) -65);
        class161.method1127((byte) -74);
        class144.method983(false);
        class34.method166();
        class118.method850(-84);
        class241.method1655(123);
        class208.method1449();
        class12.method39((byte) -2);
        class93.method683();
        class238.method1617((byte) 99);
        class246.method1691();
        class251.method1718(0);
        class205.method1433((byte) 93);
        class194.method1367((byte) 42);
        class174.method1259(120);
        class281.method1939(!arg0);
        class101.method764((byte) -63);
        class139.method957((byte) 17);
        class7.method25();
        class55.method307((byte) 19);
        class301.method2056(-47);
        class193.method1360((byte) 87);
        class37.method198();
        class71.method400(12607);
        class192.method1357();
        class91.method646((byte) 40);
        class94.method713(arg0);
        class231.method1577((byte) -123);
        class28.method145(-15802);
        class40.method221(-601);
        class292.method2001(true);
        class130.method909(3);
        class264.method1835((byte) 105);
        class4.method9();
        class255.method1751();
        class209.method1463(16);
        class36.method188(87);
        class85.method586(255);
        class173.method1257();
        class277.method1917();
        class109.method811(118);
        class58.method327(30455);
        class257.method1761();
        class291.method1997((byte) -65);
        class102.method770(7);
        class131.method916((byte) -105);
        class100.method750();
        class42.method231();
        class61.method339(25);
        class288.method1983(arg0);
        class228.method1555();
        class116.method843((byte) -123);
        class23.method121(31251);
        class35.method179();
        class96.method731((byte) 51);
        class201.method1407((byte) 122);
        class14.method53((byte) 109);
        class295.method2025((byte) 56);
        class64.method369(100);
        class221.method1524((byte) 22);
        class77.method456(-8818);
        class84.method570();
        class237.method1593(false);
        class261.method1824((byte) -88);
        class27.method143(883044776);
        class164.method1147(-21277);
        class125.method887(256);
        class203.method1422(2);
        class60.method337(1);
        class149.method1027((byte) 109);
        class298.method2038(18382);
        class207.method1444((byte) -104);
        class92.method651(95);
        class103.method773(-14980);
        class5.method10(-90);
        class73.method413(-103);
        class287.method1981((byte) -97);
        class134.method940(108);
        class187.method1321(-95);
        class279.method1931(false);
        class269.method1869((byte) -114);
        class56.method312(arg0);
        class166.method1159((byte) 126);
        class178.method1282((byte) 32);
        class272.method1879(4);
        class124.method881(-19129);
        class199.method1401(1);
        class182.method1299(102);
        class148.method1016((byte) 103);
        class53.method293(110);
        class9.method34(!arg0);
        class276.method1905(30557);
        class215.method1492((byte) -91);
        class26.method140(-13077);
        class143.method982((byte) -82);
        class113.method831((byte) 119);
        class218.method1513((byte) 49);
        class299.method2049(-26907);
        class154.method1099(94);
        class160.method1123();
        class271.method1874(-1);
        class263.method1833(2);
        class217.method1508((byte) -91);
        class282.method1944(-32768);
        class155.method1105(0);
        class69.method391((byte) 99);
        class45.method246(26292);
        class132.method919(true);
        class214.method1487(false);
        class188.method1327(-83);
        class167.method1164((byte) 104);
        class123.method877(0);
        class211.method1471((byte) 43);
        class135.method942(124);
        class159.method1120((byte) 89);
        class43.method237((byte) -86);
        class266.method1849(106);
        class39.method218(-99);
        class141.method973(arg0);
        class197.method1389((byte) 117);
        class121.method866(false);
        class200.method1405((byte) 116);
        class293.method2016(10);
        class212.method1476();
        class146.method1010();
        class239.method1620();
        class249.method1707(-1477252336);
        class104.method786();
        class226.method1548(257);
        class172.method1239(arg0);
        class138.method953((byte) -82);
        class108.method795();
        class230.method1573();
        class120.method860(-1189383294);
        class224.method1534(arg0);
        class52.method292(false);
        class114.method833(-24135);
        class165.method1152(0);
        class233.method1581(0);
        class268.method1867((byte) -67);
        class184.method1303();
        class181.method1297();
        class129.method906();
        class171.method1238(-89);
        class300.method2050(-7456);
        class87.method598(106);
        class50.method282((byte) 120);
        class19.method88((byte) 104);
        class142.method975(true);
        class229.method1566((byte) -101);
        class275.method1900(255);
        class177.method1274((byte) -6);
        class57.method323((byte) 118);
        class122.method873(50);
        class38.method214(-23492);
        class252.method1721(2081856760);
        class105.method789((byte) 117);
        class245.method1685(arg0);
        class234.method1588(18922);
        class17.method75((byte) -4);
        class267.method1856(104);
        class162.method1143(87);
        class289.method1993(true);
        class157.method1117(11);
        class115.method838(10);
        class21.method104(128);
        class280.method1937((byte) 47);
        class303.method2060(17278);
        class70.method398(6814);
        class219.method1516((byte) -48);
        class119.method859((byte) 70);
        class259.method1777(true);
        class25.method128(true);
        class126.method893((byte) -37);
        class6.method21((byte) -79);
        class65.method371((byte) -128);
        class248.method1703(27878);
        class270.method1871(-6861);
        class133.method926(98);
        class150.method1032(!arg0);
        class236.method1590((byte) -9);
        class225.method1545((byte) -88);
        class107.method792(0);
        class48.method261(11312);
        class78.method465(118);
        class156.method1109(1);
        class83.method557(true);
        class46.method250(-65);
        class31.method155(-107);
        class20.method95(150);
        class180.method1290((byte) 112);
        class247.method1701((byte) 99);
        class136.method948((byte) -123);
        class1.method3((byte) 48);
        class198.method1395(-10750);
        class254.method1749((byte) -115);
        class18.method82(1);
        class227.method1549((byte) -77);
        class51.method284(45);
        class297.method2034(0);
        class274.method1892((byte) -85);
        class86.method594(8511);
        class294.method2020(-1);
        class44.method242(127);
        class256.method1753((byte) -60);
        class140.method963((byte) -71);
        class151.method1038(-84318132);
        class128.method902((byte) 66);
        class262.method1827(-1238476948);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 984)
    private final void method2009(byte arg0) {
        field4930++;
        if (class209.field3455 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class194.method1368((byte) -1);
            if (class248.field4239 == 0L) {
                class248.field4239 = var4;
            }
            if (var3 > 16384 && (var4 - class248.field4239) < 5000L) {
                if (var4 - class267.field4514 > 1000L) {
                    System.gc();
                    class267.field4514 = var4;
                }
                class278.field4659 = 5;
                class180.field2898 = class171.field2794;
            } else {
                class209.field3455 = 10;
                class180.field2898 = class199.field3282;
                class278.field4659 = 5;
            }
        } else if (class209.field3455 == 10) {
            class55.method306(4, 104, 104, 28);
            class257.method1764(4, 104, 104);
            for (int var62 = 0; var62 < 4; var62++) {
                class140.field2176[var62] = new class253(104, 104);
            }
            class209.field3455 = 30;
            class278.field4659 = 10;
            class180.field2898 = class256.field4362;
        } else if (class209.field3455 == 30) {
            class145.field2247 = class92.method654(true, false, (byte) 42, 0, true);
            class269.field4533 = class92.method654(true, false, (byte) 42, 1, true);
            class242.field4126 = class92.method654(false, true, (byte) 42, 2, true);
            class244.field4159 = class92.method654(true, false, (byte) 42, 3, true);
            class198.field3272 = class92.method654(true, false, (byte) 42, 4, true);
            class175.field2830 = class92.method654(true, true, (byte) 42, 5, true);
            class278.field4658 = class92.method654(true, true, (byte) 42, 6, false);
            class143.field2209 = class92.method654(true, false, (byte) 42, 7, true);
            class61.field792 = class92.method654(true, false, (byte) 42, 8, true);
            class213.field3480 = class92.method654(true, false, (byte) 42, 9, true);
            class200.field3303 = class92.method654(true, false, (byte) 42, 10, true);
            class82.field1179 = class92.method654(true, false, (byte) 42, 11, true);
            class40.field510 = class92.method654(true, false, (byte) 42, 12, true);
            class276.field4644 = class92.method654(true, false, (byte) 42, 13, true);
            class62.field822 = class92.method654(true, false, (byte) 42, 14, false);
            class58.field768 = class92.method654(true, false, (byte) 42, 15, true);
            class195.field3164 = class92.method654(true, false, (byte) 42, 16, true);
            class188.field2987 = class92.method654(true, false, (byte) 42, 17, true);
            class303.field5109 = class92.method654(true, false, (byte) 42, 18, true);
            class161.field2594 = class92.method654(true, false, (byte) 42, 19, true);
            class116.field1813 = class92.method654(true, false, (byte) 42, 20, true);
            class22.field272 = class92.method654(true, false, (byte) 42, 21, true);
            class154.field2426 = class92.method654(true, false, (byte) 42, 22, true);
            class91.field1401 = class92.method654(true, true, (byte) 42, 23, true);
            class264.field4469 = class92.method654(true, false, (byte) 42, 24, true);
            class153.field2394 = class92.method654(true, false, (byte) 42, 25, true);
            class134.field2103 = class92.method654(true, true, (byte) 42, 26, true);
            class209.field3455 = 40;
            class180.field2898 = class266.field4482;
            class278.field4659 = 15;
        } else if (class209.field3455 == 40) {
            byte var34 = 0;
            int var35 = var34 + class145.field2247.method1956(128) * 4 / 100;
            int var36 = var35 + class269.field4533.method1956(128) * 4 / 100;
            int var37 = var36 + class242.field4126.method1956(128) / 100;
            int var38 = var37 + class244.field4159.method1956(128) * 2 / 100;
            int var39 = var38 + class198.field3272.method1956(128) * 6 / 100;
            int var40 = var39 + class175.field2830.method1956(128) * 4 / 100;
            int var41 = var40 + class278.field4658.method1956(128) * 2 / 100;
            int var42 = var41 + class143.field2209.method1956(128) * 50 / 100;
            int var43 = var42 + class61.field792.method1956(128) * 2 / 100;
            int var44 = var43 + class213.field3480.method1956(128) * 2 / 100;
            int var45 = var44 + class200.field3303.method1956(128) * 2 / 100;
            int var46 = var45 + class82.field1179.method1956(128) * 2 / 100;
            int var47 = var46 + class40.field510.method1956(128) * 2 / 100;
            int var48 = var47 + class276.field4644.method1956(128) * 2 / 100;
            int var49 = var48 + class62.field822.method1956(128) * 2 / 100;
            int var50 = var49 + class58.field768.method1956(128) * 2 / 100;
            int var51 = var50 + class195.field3164.method1956(128) / 100;
            int var52 = var51 + class188.field2987.method1956(128) / 100;
            int var53 = var52 + class303.field5109.method1956(128) / 100;
            int var54 = var53 + class161.field2594.method1956(128) / 100;
            int var55 = var54 + class116.field1813.method1956(128) / 100;
            int var56 = var55 + class22.field272.method1956(128) / 100;
            int var57 = var56 + class154.field2426.method1956(128) / 100;
            int var58 = var57 + class91.field1401.method1956(128) / 100;
            int var59 = var58 + class264.field4469.method1956(128) / 100;
            int var60 = var59 + class153.field2394.method1956(128) / 100;
            int var61 = var60 + class134.field2103.method1956(128) / 100;
            if (var61 == 100) {
                class180.field2898 = class51.field626;
                class278.field4659 = 20;
                class17.method77(false, class61.field792);
                class20.method92(true, class61.field792);
                class43.method236((byte) 113, class61.field792);
                class219.method1514(-47, class61.field792);
                class209.field3455 = 45;
            } else {
                if (var61 != 0) {
                    class180.field2898 = class134.method938((byte) -125, new class168[] { class111.field1733, class169.method1228(var61, 0), class27.field345 });
                }
                class278.field4659 = 20;
            }
        } else if (class209.field3455 == 45) {
            class178.method1280(class53.field653, 22050, 2, (byte) -84);
            class299.field5076 = new class82();
            class299.field5076.method532(-1255, 128, 9);
            class291.field4907 = class54.method302(class189.field3023, 0, class51.field622, 22050, (byte) 105);
            class291.field4907.method996(class299.field5076, 86);
            class67.method379(class62.field822, true, class58.field768, class198.field3272, class299.field5076);
            class103.field1601 = class54.method302(class189.field3023, 1, class51.field622, 2048, (byte) 105);
            field4933 = new class222();
            class103.field1601.method996(field4933, 55);
            class20.field247 = new class62(22050, class62.field820);
            class65.field863 = class278.field4658.method1646(-27248, class60.field784);
            class278.field4659 = 30;
            class180.field2898 = class217.field3539;
            class209.field3455 = 50;
        } else if (arg0 < -35) {
            if (class209.field3455 == 50) {
                int var32 = class156.method1110((byte) 115, class276.field4644, class61.field792);
                int var33 = class241.method1659(-62);
                if (var32 < var33) {
                    class180.field2898 = class134.method938((byte) -126, new class168[] { class55.field713, class169.method1228(var32 * 100 / var33, 0), class27.field345 });
                    class278.field4659 = 35;
                } else {
                    class180.field2898 = class273.field4584;
                    class209.field3455 = 60;
                    class278.field4659 = 35;
                }
            } else if (class209.field3455 == 60) {
                int var30 = class103.method776(true, class61.field792);
                int var31 = class249.method1708((byte) 114);
                if (var31 <= var30) {
                    class278.field4659 = 40;
                    class180.field2898 = class227.field3684;
                    class209.field3455 = 65;
                } else {
                    class180.field2898 = class134.method938((byte) -128, new class168[] { class24.field287, class169.method1228(var30 * 100 / var31, 0), class27.field345 });
                    class278.field4659 = 40;
                }
            } else if (class209.field3455 == 65) {
                for (int var6 = 0; var6 < 6; var6++) {
                    class112 var7 = class51.field622.method420(false, this.getClass());
                    while (var7.field1746 == 0) {
                        class300.method2054(10, 100L);
                    }
                    if (var7.field1746 == 1) {
                        break;
                    }
                    if (var6 == 5) {
                        this.method478("dll", -60);
                        class193.field3143 = 1000;
                        return;
                    }
                    class300.method2054(10, 1000L);
                }
                int var8 = class90.method618(class189.field3023, class161.field2599 * 2);
                if (var8 == 0) {
                    class100.method753(104, 104);
                    class224.method1540(class276.field4644, class61.field792, true);
                    class180.field2898 = class154.field2428;
                    class278.field4659 = 45;
                    class109.method810(5, 8858);
                    class209.field3455 = 70;
                } else {
                    String var9 = class90.field1370;
                    String var10 = "unknown";
                    String var11 = class90.field1364;
                    String var12 = var9.toLowerCase();
                    if (var12.indexOf("microsoft") != -1) {
                        var10 = "vesa";
                    } else if (var12.indexOf("nvidia") != -1) {
                        var10 = "nvidia";
                    } else if (var12.indexOf("intel") != -1) {
                        var10 = "intel";
                    } else if (var12.indexOf("s3") == -1) {
                        if (var12.indexOf("ati") != -1) {
                            var10 = "ati";
                        }
                    } else if (var11.toLowerCase().indexOf("unichrome") == -1) {
                        var10 = "s3";
                    } else {
                        var10 = "via_s3";
                    }
                    String var13 = this.method2008(-81, class75.field1004 + " " + class75.field1007 + " " + class75.field1006);
                    String var14 = this.method2008(-97, var9 + " " + var11);
                    this.method473((byte) -66, "os=" + var13 + "&gcard=" + var14 + "&error_code=" + var8, "caps_" + var10);
                    class193.field3143 = 1000;
                }
            } else if (class209.field3455 == 70) {
                class242.field4126.method1627(0);
                byte var15 = 0;
                int var16 = var15 + class242.field4126.method1629((byte) -95);
                class195.field3164.method1627(0);
                int var17 = var16 + class195.field3164.method1629((byte) -118);
                class188.field2987.method1627(0);
                int var18 = var17 + class188.field2987.method1629((byte) -121);
                class303.field5109.method1627(0);
                int var19 = var18 + class303.field5109.method1629((byte) 41);
                class161.field2594.method1627(0);
                int var20 = var19 + class161.field2594.method1629((byte) 38);
                class116.field1813.method1627(0);
                int var21 = var20 + class116.field1813.method1629((byte) -101);
                class22.field272.method1627(0);
                int var22 = var21 + class22.field272.method1629((byte) -88);
                class154.field2426.method1627(0);
                int var23 = var22 + class154.field2426.method1629((byte) 60);
                class264.field4469.method1627(0);
                int var24 = var23 + class264.field4469.method1629((byte) -127);
                class153.field2394.method1627(0);
                int var25 = var24 + class153.field2394.method1629((byte) 56);
                if (var25 >= 1000) {
                    class262.method1829((byte) -87, class242.field4126);
                    class278.method1920(class242.field4126, (byte) 120);
                    class21.method103(2, class242.field4126);
                    class85.method583(-2693, class143.field2209, class242.field4126);
                    class134.method939(128, class195.field3164, class58.field764, class143.field2209);
                    class80.method494(class143.field2209, 112, class303.field5109);
                    class22.method114(-103, class293.field4963, class161.field2594, class143.field2209, class58.field764);
                    class252.method1723(class242.field4126, 77);
                    class292.method2000(26443, class116.field1813, class269.field4533, class145.field2247);
                    class79.method474((byte) -29, class143.field2209, class22.field272);
                    class297.method2032(class154.field2426, (byte) -65);
                    class118.method854(class242.field4126, 255);
                    class187.method1317(false, class244.field4159, class143.field2209, class61.field792, class276.field4644);
                    class80.method497(false, class242.field4126);
                    class167.method1165(class188.field2987, (byte) -121);
                    class206.method1438(new class269(), (byte) -119, class264.field4469, class153.field2394);
                    class18.method81(class264.field4469, class153.field2394, 1);
                    class278.field4659 = 50;
                    class180.field2898 = class64.field857;
                    class15.method63(21698);
                    class209.field3455 = 80;
                } else {
                    class180.field2898 = class134.method938((byte) -124, new class168[] { class155.field2448, class169.method1228(var25 / 10, 0), class27.field345 });
                    class278.field4659 = 50;
                }
            } else if (class209.field3455 == 80) {
                int var28 = class171.method1237(class61.field792, false);
                int var29 = class231.method1575(-90);
                if (var29 <= var28) {
                    class245.method1688((byte) -95, class61.field792);
                    class278.field4659 = 60;
                    class209.field3455 = 90;
                    class180.field2898 = class159.field2522;
                } else {
                    class180.field2898 = class134.method938((byte) -125, new class168[] { class85.field1291, class169.method1228(var28 * 100 / var29, 0), class27.field345 });
                    class278.field4659 = 60;
                }
            } else if (class209.field3455 == 90) {
                if (class134.field2103.method1627(0)) {
                    class85 var26 = new class85(class213.field3480, class134.field2103, class61.field792, 200, !class145.field2250);
                    class173.method1248(var26);
                    if (class44.field539) {
                        class173.method1255(0.7F);
                    } else {
                        if (class69.field913 == 1) {
                            class173.method1255(0.9F);
                        }
                        if (class69.field913 == 2) {
                            class173.method1255(0.8F);
                        }
                        if (class69.field913 == 3) {
                            class173.method1255(0.7F);
                        }
                        if (class69.field913 == 4) {
                            class173.method1255(0.6F);
                        }
                    }
                    class209.field3455 = 100;
                    class278.field4659 = 70;
                    class180.field2898 = class179.field2891;
                } else {
                    class180.field2898 = class134.method938((byte) -128, new class168[] { class175.field2843, class169.method1228(class134.field2103.method1629((byte) 119), 0), class27.field345 });
                    class278.field4659 = 70;
                }
            } else if (class209.field3455 == 100) {
                class209.field3455 = 110;
            } else if (class209.field3455 == 110) {
                class15.field170 = new class195();
                class51.field622.method429(class15.field170, 0, 10);
                class278.field4659 = 75;
                class180.field2898 = class289.field4881;
                class209.field3455 = 120;
            } else if (class209.field3455 == 120) {
                if (class200.field3303.method1637(class182.field2934, -77, class219.field3566)) {
                    class166 var27 = new class166(class200.field3303.method1626((byte) 70, class182.field2934, class219.field3566));
                    class213.method1482(var27, 0);
                    class180.field2898 = class70.field936;
                    class278.field4659 = 80;
                    class209.field3455 = 130;
                } else {
                    class180.field2898 = class134.method938((byte) -125, new class168[] { class58.field773, class60.field781 });
                    class278.field4659 = 80;
                }
            } else if (class209.field3455 == 130) {
                if (!class244.field4159.method1627(0)) {
                    class180.field2898 = class134.method938((byte) -124, new class168[] { class144.field2212, class169.method1228(class244.field4159.method1629((byte) 82) * 3 / 4, 0), class27.field345 });
                    class278.field4659 = 85;
                } else if (!class40.field510.method1627(0)) {
                    class180.field2898 = class134.method938((byte) -125, new class168[] { class144.field2212, class169.method1228(class40.field510.method1629((byte) -107) / 10 + 75, 0), class27.field345 });
                    class278.field4659 = 85;
                } else if (!class276.field4644.method1627(0)) {
                    class180.field2898 = class134.method938((byte) -128, new class168[] { class144.field2212, class169.method1228(class276.field4644.method1629((byte) 31) / 20 + 85, 0), class27.field345 });
                    class278.field4659 = 85;
                } else if (class91.field1401.method1649(-1630, class6.field78)) {
                    class166.method1155(class225.field3635, (byte) 76, class276.field4645, class178.field2880, class91.field1401, class157.field2494, class26.field314);
                    class209.field3455 = 140;
                    class278.field4659 = 100;
                    class180.field2898 = class275.field4624;
                } else {
                    class180.field2898 = class134.method938((byte) -126, new class168[] { class144.field2212, class169.method1228((class91.field1401.method1639(class6.field78, (byte) 75) / 10) + 90, 0), class27.field345 });
                    class278.field4659 = 85;
                }
            } else if (class209.field3455 == 140) {
                class153.field2371 = class244.field4159.method1646(-27248, class15.field169);
                class175.field2830.method1630(8, true, false);
                class278.field4658.method1630(8, true, true);
                class61.field792.method1630(8, true, true);
                class276.field4644.method1630(8, true, true);
                class200.field3303.method1630(8, true, true);
                class244.field4159.method1630(8, true, true);
                class39.field489 = true;
                class68.method382(15979);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1514)
    private final void method2010(int arg0) {
        class165.method1154(this, -18543);
        field4936++;
        for (class138.field2132 = 0; class69.method390(-13828) && class138.field2132 < 128; class138.field2132++) {
            class106.field1631[class138.field2132] = class80.field1161;
            class103.field1605[class138.field2132] = class86.field1339;
        }
        class274.field4619++;
        if (class19.field221 != -1) {
            class303.method2061(0, class299.field5069, class19.field221, 0, 0, 16572, class14.field142, 0);
        }
        class9.field116++;
        int var2 = 19137023;
        if (arg0 >= -93) {
            return;
        }
        label174: for (int var3 = 0; var3 < 32768; var3++) {
            class22 var4 = class190.field3065[var3];
            if (var4 != null) {
                byte var5 = var4.field267.field3233;
                if ((var5 & 0x2) > 0 && var4.field2997 == 0 && Math.random() * 1000.0D < 10.0D) {
                    int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    if (var6 != 0 || var7 != 0) {
                        var4.field3020[0] = (var4.field3027 >> 7) + var6;
                        var4.field3033[0] = (var4.field3021 >> 7) + var7;
                        class140.field2176[class79.field1127].method1729(var4.field3012, var4.field3021 >> 7, 0, false, var4.field3027 >> 7, (byte) -127, var4.field3012);
                        if (var4.field3020[0] >= 0 && var4.field3020[0] <= 104 - var4.field3012 && var4.field3033[0] >= 0 && var4.field3033[0] <= (104 - var4.field3012) && class140.field2176[class79.field1127].method1747(var4.field3021 >> 7, 17488, var4.field3033[0], var4.field3027 >> 7, var4.field3020[0])) {
                            if (var4.field3012 > 1) {
                                for (int var8 = var4.field3020[0]; var8 < var4.field3020[0] + var4.field3012; var8++) {
                                    for (int var9 = var4.field3033[0]; var9 < var4.field3033[0] + var4.field3012; var9++) {
                                        if ((class140.field2176[class79.field1127].field4317[var8][var9] & var2) != 0) {
                                            continue label174;
                                        }
                                    }
                                }
                            }
                            var4.field2997 = 1;
                        }
                    }
                }
                class156.method1107(100, var4);
                class221.method1525(-1, var4);
                class266.method1852((byte) 126, var4);
                class140.field2176[class79.field1127].method1731(var4.field3021 >> 7, var4.field3027 >> 7, (byte) -71, var4.field3012, var4.field3012, false);
            }
        }
        if (class51.field621 == 0 && class38.field476 == 0) {
            if (class289.field4867 == 2) {
                class289.method1994((byte) 43);
            } else {
                class19.method90((byte) -128);
            }
            if (class248.field4249 >> 7 < 14 || (class248.field4249 >> 7) >= 90 || class157.field2483 >> 7 < 14 || class157.field2483 >> 7 >= 90) {
                class251.method1712(-63);
            }
        }
        while (true) {
            class182 var10;
            class242 var11;
            class242 var12;
            do {
                var10 = (class182) class238.field3816.method447(true);
                if (var10 == null) {
                    while (true) {
                        class182 var13;
                        class242 var17;
                        class242 var18;
                        do {
                            var13 = (class182) class5.field56.method447(true);
                            if (var13 == null) {
                                while (true) {
                                    class182 var14;
                                    class242 var15;
                                    class242 var16;
                                    do {
                                        var14 = (class182) class266.field4478.method447(true);
                                        if (var14 == null) {
                                            if (class177.field2861 != null) {
                                                class113.method827(16777215);
                                            }
                                            return;
                                        }
                                        var15 = var14.field2928;
                                        if (var15.field3956 < 0) {
                                            break;
                                        }
                                        var16 = class130.method910((byte) -78, var15.field3977);
                                    } while (var16 == null || var16.field4004 == null || var16.field4004.length <= var15.field3956 || var16.field4004[var15.field3956] != var15);
                                    class177.method1270(var14, (byte) -128);
                                }
                            }
                            var17 = var13.field2928;
                            if (var17.field3956 < 0) {
                                break;
                            }
                            var18 = class130.method910((byte) -78, var17.field3977);
                        } while (var18 == null || var18.field4004 == null || var17.field3956 >= var18.field4004.length || var18.field4004[var17.field3956] != var17);
                        class177.method1270(var13, (byte) -103);
                    }
                }
                var11 = var10.field2928;
                if (var11.field3956 < 0) {
                    break;
                }
                var12 = class130.method910((byte) -124, var11.field3977);
            } while (var12 == null || var12.field4004 == null || var12.field4004.length <= var11.field3956 || var12.field4004[var11.field3956] != var11);
            class177.method1270(var10, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLg;)V", line = 1710)
    public static final void method2011(byte arg0, class242 arg1) {
        field4937++;
        if (arg0 != -59) {
            field4929 = (class168) null;
        }
        if (class127.field1976 == arg1.field4068) {
            class214.field3495[arg1.field4096] = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lg;)Z", line = 1728)
    public static final boolean method2012(class242 arg0) {
        if (class245.field4165) {
            if (method2015(arg0) != 0) {
                return false;
            }
            if (arg0.field4073 == 0) {
                return false;
            }
        }
        return arg0.field4028;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 1745)
    public final void method481(byte arg0) {
        field4938++;
        if (class193.field3143 == 1000) {
            return;
        }
        boolean var2 = class94.method714(false);
        if (var2 && class5.field55 && class291.field4907 != null) {
            class291.field4907.method994(arg0 - 47);
        }
        if (class193.field3143 == 30 || class193.field3143 == 10) {
            if (class103.field1602) {
                class134.method941(125);
            } else if (class233.field3742 != 0L && class194.method1368((byte) -115) > class233.field3742) {
                class134.method941(70);
            }
        }
        if (class205.field3373 != 0L && class205.field3373 < class194.method1368((byte) -110) && class157.field2493 != null && (class193.field3143 == 30 || class193.field3143 == 25)) {
            class261.method1826(200);
        }
        if (class8.field98 == null) {
            Container var3;
            if (class8.field98 != null) {
                var3 = class8.field98;
            } else if (class283.field4782 == null) {
                var3 = class51.field622.field1000;
            } else {
                var3 = class283.field4782;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class283.field4782 == var3) {
                Insets var6 = class283.field4782.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class196.field3240 != var4 || class197.field3264 != var5) {
                class161.method1130(arg0 ^ 0xFFFFFFE2, 500);
            }
        }
        if (arg0 != -81) {
            method2003((class242) null);
        }
        if (class8.field98 != null && !field4935 && (class193.field3143 == 30 || class193.field3143 == 10)) {
            class78.method463(arg0 ^ 0x50);
        }
        boolean var7 = false;
        if (class227.field3683) {
            var7 = true;
            class227.field3683 = false;
        }
        if (var7) {
            class55.method303(arg0 + 81);
        }
        for (int var8 = 0; var8 < 100; var8++) {
            class214.field3495[var8] = true;
        }
        if (class193.field3143 == 0) {
            class198.method1398(class278.field4659, var7, (Color) null, (byte) -35, class180.field2898);
        } else if (class193.field3143 == 5) {
            class238.method1613(class102.field1588, -28796);
        } else if (class193.field3143 == 10) {
            class63.method354(1023);
        } else if (class193.field3143 == 25 || class193.field3143 == 28) {
            if (class178.field2870 == 1) {
                if (class236.field3777 > class296.field5012) {
                    class296.field5012 = class236.field3777;
                }
                int var9 = (class296.field5012 - class236.field3777) * 50 / class296.field5012;
                class113.method830(false, 13, class134.method938((byte) -128, new class168[] { class70.field920, class56.field738, class169.method1228(var9, 0), class197.field3257 }));
            } else if (class178.field2870 == 2) {
                if (class226.field3678 < class263.field4455) {
                    class226.field3678 = class263.field4455;
                }
                int var10 = ((class226.field3678 - class263.field4455) * 50 / class226.field3678) + 50;
                class113.method830(false, 13, class134.method938((byte) -126, new class168[] { class70.field920, class56.field738, class169.method1228(var10, 0), class197.field3257 }));
            } else {
                class113.method830(false, 13, class70.field920);
            }
        } else if (class193.field3143 == 30) {
            class95.method719((byte) 36);
        } else if (class193.field3143 == 40) {
            class113.method830(false, 13, class134.method938((byte) -125, new class168[] { class165.field2635, class249.field4255, class280.field4709 }));
        }
        if (class193.field3143 != 0) {
            class90.method621();
            for (int var17 = 0; var17 < class227.field3685; var17++) {
                class131.field2028[var17] = false;
            }
        } else if ((class193.field3143 == 30 || class193.field3143 == 10) && class254.field4348 == 0 && !var7) {
            try {
                Graphics var14 = class189.field3023.getGraphics();
                for (int var15 = 0; var15 < class227.field3685; var15++) {
                    if (class131.field2028[var15]) {
                        class107.field1647.method1969(class69.field915[var15], class256.field4357[var15], class204.field3346[var15], class82.field1168[var15], (byte) -54, var14);
                        class131.field2028[var15] = false;
                    }
                }
            } catch (Exception var22) {
                class189.field3023.repaint();
            }
        } else if (class193.field3143 != 0) {
            try {
                Graphics var11 = class189.field3023.getGraphics();
                class107.field1647.method1967(false, var11, 0, 0);
                for (int var12 = 0; var12 < class227.field3685; var12++) {
                    class131.field2028[var12] = false;
                }
            } catch (Exception var23) {
                class189.field3023.repaint();
            }
        }
        if (class39.field489) {
            class217.method1506(-128);
        }
        if (!browsercontrol.iscreated() || class171.field2789 == 0) {
            return;
        }
        try {
            Point var18 = class189.field3023.getLocationOnScreen();
            Dimension var19 = class189.field3023.getSize();
            browsercontrol.set_position(var18.x, var18.y - class171.field2789, var19.width, class171.field2789);
        } catch (Exception var21) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V", line = 1977)
    public static void method2013(boolean arg0) {
        field4933 = null;
        field4929 = null;
        if (!arg0) {
            method2013(false);
        }
        field4945 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2003)
    public final void method468(int arg0) {
        if (class110.field1710 != 0) {
        }
        class118.method853(class51.field622, class294.field4985, -109);
        if (class58.field765 == 1) {
            class296.field5006 = class124.field1915;
            class62.field823 = class40.field503;
            class204.field3351 = class169.field2778;
            class34.field396 = 16777215;
            class34.field390 = 0;
            class101.field1573 = class133.field2090;
        } else {
            class101.field1573 = class261.field4435;
            class296.field5006 = class9.field118;
            class204.field3351 = class169.field2776;
            class62.field823 = class214.field3494;
        }
        class266.field4491 = class217.field3542 == 0 ? 443 : class188.field2984 + 50000;
        class27.field338 = class217.field3542 == 0 ? 43594 : class188.field2984 + 40000;
        class229.field3698 = class27.field338;
        field4928++;
        class58.field772 = class207.field3392 = class215.field3511 = class227.field3681 = new short[256];
        class102.method769(187);
        if (arg0 != 4) {
            return;
        }
        class48.method258((byte) -64, class189.field3023);
        class127.method896(0, class189.field3023);
        class31.field382 = class130.method912((byte) 108);
        if (class31.field382 != null) {
            class31.field382.method332(class189.field3023, 21014);
        }
        class301.field5095 = class75.field994;
        try {
            if (class51.field622.field997 != null) {
                class283.field4779 = new class63(class51.field622.field997, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class294.field4990[var2] = new class63(class51.field622.field991[var2], 6000, 0);
                }
                class153.field2365 = new class63(class51.field622.field986, 6000, 0);
                class133.field2084 = new class110(255, class283.field4779, class153.field2365, 500000);
                class38.field477 = new class63(class51.field622.field1003, 24, 0);
                class51.field622.field986 = null;
                class51.field622.field1003 = null;
                class51.field622.field991 = null;
                class51.field622.field997 = null;
            }
        } catch (IOException var4) {
            class38.field477 = null;
            class133.field2084 = null;
            class153.field2365 = null;
            class283.field4779 = null;
        }
        class96.field1541 = class199.field3279;
        if (class217.field3542 != 0) {
            class294.field4982 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lg;IIIIIII)V", line = 2090)
    public static final void method2014(class242[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class242 var9 = arg0[var8];
            if (var9 != null && var9.field3977 == arg1 && (!var9.field4040 || var9.field4073 == 0 || var9.field4025 || method2015(var9) != 0 || class248.field4241 == var9 || var9.field4115 == 1338) && (!var9.field4040 || !method2012(var9))) {
                int var10 = var9.field3988 + arg6;
                int var11 = var9.field4108 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4073 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3989 + var10;
                    int var17 = var9.field4057 + var11;
                    if (var9.field4073 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class177.field2861 == var9) {
                    class303.field5106 = true;
                    class291.field4891 = var10;
                    class67.field890 = var11;
                }
                if (!var9.field4040 || var12 < var14 && var13 < var15) {
                    if (var9.field4073 == 0) {
                        if (!var9.field4040 && method2012(var9) && class177.field2855 != var9) {
                            continue;
                        }
                        if (var9.field4127 && class262.field4442 >= var12 && class155.field2457 >= var13 && class262.field4442 < var14 && class155.field2457 < var15) {
                            for (class182 var18 = (class182) class266.field4478.method442(65293); var18 != null; var18 = (class182) class266.field4478.method440(3)) {
                                if (var18.field2926) {
                                    var18.method124((byte) 99);
                                }
                            }
                            if (class60.field787 == 0) {
                                class177.field2861 = null;
                                class248.field4241 = null;
                            }
                            class24.field297 = false;
                        }
                    }
                    if (var9.field4040) {
                        boolean var19;
                        if (class262.field4442 >= var12 && class155.field2457 >= var13 && class262.field4442 < var14 && class155.field2457 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class281.field4725 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class106.field1634 == 1 && class206.field3384 >= var12 && class83.field1244 >= var13 && class206.field3384 < var14 && class83.field1244 < var15) {
                            var21 = true;
                        }
                        if (class138.field2132 > 0 && var9.field3958 != null) {
                            for (int var22 = 0; var22 < var9.field3958.length; var22++) {
                                for (int var23 = 0; var23 < class138.field2132; var23++) {
                                    int var24 = var9.field3958[var22] & 0xFF;
                                    if (class106.field1631[var23] == var24) {
                                        if (var9.field4054 != null) {
                                            byte var25 = var9.field4054[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class190.field3071[86] || (var25 & 0x1) != 0 && !class190.field3071[82] || (var25 & 0x4) != 0 && !class190.field3071[81])) {
                                                continue;
                                            }
                                        }
                                        class215.method1490(var9.field3996, class182.field2934, var22 + 1, -1, true);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class65.method373(class206.field3384 - var10, class83.field1244 - var11, false, var9);
                        }
                        if (class177.field2861 != null && class177.field2861 != var9 && var19 && class52.method287(method2015(var9), true)) {
                            class242.field3970 = var9;
                        }
                        if (class248.field4241 == var9) {
                            class299.field5074 = true;
                            class61.field798 = var10;
                            class27.field342 = var11;
                        }
                        if (var9.field4025 || var9.field4115 != 0) {
                            if (var19 && class26.field324 != 0 && var9.field3995 != null) {
                                class182 var26 = new class182();
                                var26.field2926 = true;
                                var26.field2928 = var9;
                                var26.field2915 = class26.field324;
                                var26.field2919 = var9.field3995;
                                class266.field4478.method451(-91453648, var26);
                            }
                            if (class177.field2861 != null || class24.field291 != null || class121.field1888 || var9.field4115 != 1400 && class24.field297) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4115 != 0) {
                                if (var9.field4115 == 1337) {
                                    class143.field2206 = var9;
                                    method2011((byte) -59, var9);
                                    continue;
                                }
                                if (var9.field4115 == 1338) {
                                    if (var21) {
                                        class52.method289(class206.field3384 - var10, 81, var9, class83.field1244 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field4115 == 1400) {
                                    class77.field1045 = var9;
                                    if (var21) {
                                        if (class190.field3071[82] && class280.field4694 > 0) {
                                            int var27 = (int) ((double) (class206.field3384 - var10 - var9.field3989 / 2) * 2.0D / (double) class15.field149);
                                            int var28 = (int) ((double) (class83.field1244 - var11 - var9.field4057 / 2) * 2.0D / (double) class15.field149);
                                            int var29 = class291.field4895 + var27;
                                            int var30 = class274.field4602 + var28;
                                            int var31 = class40.field506 + var29;
                                            int var32 = class172.field2801 + class261.field4420 - var30 - 1;
                                            class151.method1036(var32, 895969644, 0, var31);
                                            class252.method1726(false);
                                            continue;
                                        }
                                        class24.field297 = true;
                                        class266.field4493 = class262.field4442;
                                        class190.field3085 = class155.field2457;
                                        class120.field1876 = class291.field4895;
                                        class109.field1697 = class274.field4602;
                                        continue;
                                    }
                                    if (var20 && class24.field297) {
                                        class216.method1495(39, (int) ((double) (class266.field4493 - class262.field4442) * 2.0D / (double) class175.field2836) + class120.field1876);
                                        class145.method1005((int) ((double) (class190.field3085 - class155.field2457) * 2.0D / (double) class175.field2836) + class109.field1697, -123);
                                        continue;
                                    }
                                    class24.field297 = false;
                                    continue;
                                }
                                if (var9.field4115 == 1401) {
                                    if (var20) {
                                        class8.method32(var9.field3989, var9.field4057, -118, class155.field2457 - var11, class262.field4442 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field4115 == 1402 || var9.field4115 == 1404) {
                                    continue;
                                }
                            }
                            if (!var9.field3987 && var21) {
                                var9.field3987 = true;
                                if (var9.field4020 != null) {
                                    class182 var33 = new class182();
                                    var33.field2926 = true;
                                    var33.field2928 = var9;
                                    var33.field2914 = class206.field3384 - var10;
                                    var33.field2915 = class83.field1244 - var11;
                                    var33.field2919 = var9.field4020;
                                    class266.field4478.method451(-91453648, var33);
                                }
                            }
                            if (var9.field3987 && var20 && var9.field4053 != null) {
                                class182 var34 = new class182();
                                var34.field2926 = true;
                                var34.field2928 = var9;
                                var34.field2914 = class262.field4442 - var10;
                                var34.field2915 = class155.field2457 - var11;
                                var34.field2919 = var9.field4053;
                                class266.field4478.method451(-91453648, var34);
                            }
                            if (var9.field3987 && !var20) {
                                var9.field3987 = false;
                                if (var9.field4107 != null) {
                                    class182 var35 = new class182();
                                    var35.field2926 = true;
                                    var35.field2928 = var9;
                                    var35.field2914 = class262.field4442 - var10;
                                    var35.field2915 = class155.field2457 - var11;
                                    var35.field2919 = var9.field4107;
                                    class5.field56.method451(-91453648, var35);
                                }
                            }
                            if (var20 && var9.field3969 != null) {
                                class182 var36 = new class182();
                                var36.field2926 = true;
                                var36.field2928 = var9;
                                var36.field2914 = class262.field4442 - var10;
                                var36.field2915 = class155.field2457 - var11;
                                var36.field2919 = var9.field3969;
                                class266.field4478.method451(-91453648, var36);
                            }
                            if (!var9.field4070 && var19) {
                                var9.field4070 = true;
                                if (var9.field4051 != null) {
                                    class182 var37 = new class182();
                                    var37.field2926 = true;
                                    var37.field2928 = var9;
                                    var37.field2914 = class262.field4442 - var10;
                                    var37.field2915 = class155.field2457 - var11;
                                    var37.field2919 = var9.field4051;
                                    class266.field4478.method451(-91453648, var37);
                                }
                            }
                            if (var9.field4070 && var19 && var9.field3963 != null) {
                                class182 var38 = new class182();
                                var38.field2926 = true;
                                var38.field2928 = var9;
                                var38.field2914 = class262.field4442 - var10;
                                var38.field2915 = class155.field2457 - var11;
                                var38.field2919 = var9.field3963;
                                class266.field4478.method451(-91453648, var38);
                            }
                            if (var9.field4070 && !var19) {
                                var9.field4070 = false;
                                if (var9.field4023 != null) {
                                    class182 var39 = new class182();
                                    var39.field2926 = true;
                                    var39.field2928 = var9;
                                    var39.field2914 = class262.field4442 - var10;
                                    var39.field2915 = class155.field2457 - var11;
                                    var39.field2919 = var9.field4023;
                                    class5.field56.method451(-91453648, var39);
                                }
                            }
                            if (var9.field4075 != null) {
                                class182 var40 = new class182();
                                var40.field2928 = var9;
                                var40.field2919 = var9.field4075;
                                class238.field3816.method451(-91453648, var40);
                            }
                            if (var9.field4058 != null && class224.field3611 > var9.field4060) {
                                if (var9.field4121 == null || class224.field3611 - var9.field4060 > 32) {
                                    class182 var45 = new class182();
                                    var45.field2928 = var9;
                                    var45.field2919 = var9.field4058;
                                    class266.field4478.method451(-91453648, var45);
                                } else {
                                    label550: for (int var41 = var9.field4060; var41 < class224.field3611; var41++) {
                                        int var42 = class283.field4790[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field4121.length; var43++) {
                                            if (var9.field4121[var43] == var42) {
                                                class182 var44 = new class182();
                                                var44.field2928 = var9;
                                                var44.field2919 = var9.field4058;
                                                class266.field4478.method451(-91453648, var44);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field4060 = class224.field3611;
                            }
                            if (var9.field4059 != null && class51.field624 > var9.field4119) {
                                if (var9.field4044 == null || class51.field624 - var9.field4119 > 32) {
                                    class182 var50 = new class182();
                                    var50.field2928 = var9;
                                    var50.field2919 = var9.field4059;
                                    class266.field4478.method451(-91453648, var50);
                                } else {
                                    label526: for (int var46 = var9.field4119; var46 < class51.field624; var46++) {
                                        int var47 = class18.field212[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field4044.length; var48++) {
                                            if (var9.field4044[var48] == var47) {
                                                class182 var49 = new class182();
                                                var49.field2928 = var9;
                                                var49.field2919 = var9.field4059;
                                                class266.field4478.method451(-91453648, var49);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field4119 = class51.field624;
                            }
                            if (var9.field4026 != null && class67.field878 > var9.field4039) {
                                if (var9.field4087 == null || class67.field878 - var9.field4039 > 32) {
                                    class182 var55 = new class182();
                                    var55.field2928 = var9;
                                    var55.field2919 = var9.field4026;
                                    class266.field4478.method451(-91453648, var55);
                                } else {
                                    label502: for (int var51 = var9.field4039; var51 < class67.field878; var51++) {
                                        int var52 = class242.field3997[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field4087.length; var53++) {
                                            if (var9.field4087[var53] == var52) {
                                                class182 var54 = new class182();
                                                var54.field2928 = var9;
                                                var54.field2919 = var9.field4026;
                                                class266.field4478.method451(-91453648, var54);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field4039 = class67.field878;
                            }
                            if (var9.field4021 != null && class180.field2904 > var9.field4074) {
                                if (var9.field3994 == null || class180.field2904 - var9.field4074 > 32) {
                                    class182 var60 = new class182();
                                    var60.field2928 = var9;
                                    var60.field2919 = var9.field4021;
                                    class266.field4478.method451(-91453648, var60);
                                } else {
                                    label478: for (int var56 = var9.field4074; var56 < class180.field2904; var56++) {
                                        int var57 = class198.field3274[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field3994.length; var58++) {
                                            if (var9.field3994[var58] == var57) {
                                                class182 var59 = new class182();
                                                var59.field2928 = var9;
                                                var59.field2919 = var9.field4021;
                                                class266.field4478.method451(-91453648, var59);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field4074 = class180.field2904;
                            }
                            if (var9.field4014 != null && class105.field1611 > var9.field4076) {
                                if (var9.field4063 == null || class105.field1611 - var9.field4076 > 32) {
                                    class182 var65 = new class182();
                                    var65.field2928 = var9;
                                    var65.field2919 = var9.field4014;
                                    class266.field4478.method451(-91453648, var65);
                                } else {
                                    label454: for (int var61 = var9.field4076; var61 < class105.field1611; var61++) {
                                        int var62 = class25.field307[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field4063.length; var63++) {
                                            if (var9.field4063[var63] == var62) {
                                                class182 var64 = new class182();
                                                var64.field2928 = var9;
                                                var64.field2919 = var9.field4014;
                                                class266.field4478.method451(-91453648, var64);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field4076 = class105.field1611;
                            }
                            if (class68.field905 > var9.field4049 && var9.field4128 != null) {
                                class182 var66 = new class182();
                                var66.field2928 = var9;
                                var66.field2919 = var9.field4128;
                                class266.field4478.method451(-91453648, var66);
                            }
                            if (class285.field4828 > var9.field4049 && var9.field4086 != null) {
                                class182 var67 = new class182();
                                var67.field2928 = var9;
                                var67.field2919 = var9.field4086;
                                class266.field4478.method451(-91453648, var67);
                            }
                            if (class48.field595 > var9.field4049 && var9.field3981 != null) {
                                class182 var68 = new class182();
                                var68.field2928 = var9;
                                var68.field2919 = var9.field3981;
                                class266.field4478.method451(-91453648, var68);
                            }
                            if (class120.field1873 > var9.field4049 && var9.field4083 != null) {
                                class182 var69 = new class182();
                                var69.field2928 = var9;
                                var69.field2919 = var9.field4083;
                                class266.field4478.method451(-91453648, var69);
                            }
                            if (class50.field612 > var9.field4049 && var9.field4093 != null) {
                                class182 var70 = new class182();
                                var70.field2928 = var9;
                                var70.field2919 = var9.field4093;
                                class266.field4478.method451(-91453648, var70);
                            }
                            var9.field4049 = class9.field116;
                            if (var9.field4042 != null) {
                                for (int var71 = 0; var71 < class138.field2132; var71++) {
                                    class182 var72 = new class182();
                                    var72.field2928 = var9;
                                    var72.field2927 = class106.field1631[var71];
                                    var72.field2929 = class103.field1605[var71];
                                    var72.field2919 = var9.field4042;
                                    class266.field4478.method451(-91453648, var72);
                                }
                            }
                            if (class153.field2369 && var9.field4097 != null) {
                                class182 var73 = new class182();
                                var73.field2928 = var9;
                                var73.field2919 = var9.field4097;
                                class266.field4478.method451(-91453648, var73);
                            }
                        }
                    }
                    if (!var9.field4040 && class177.field2861 == null && class24.field291 == null && !class121.field1888) {
                        if ((var9.field4037 >= 0 || var9.field3974 != 0) && class262.field4442 >= var12 && class155.field2457 >= var13 && class262.field4442 < var14 && class155.field2457 < var15) {
                            if (var9.field4037 >= 0) {
                                class177.field2855 = arg0[var9.field4037];
                            } else {
                                class177.field2855 = var9;
                            }
                        }
                        if (var9.field4073 == 8 && class262.field4442 >= var12 && class155.field2457 >= var13 && class262.field4442 < var14 && class155.field2457 < var15) {
                            class271.field4553 = var9;
                        }
                        if (var9.field4007 > var9.field4057) {
                            class150.method1031(var9.field3989 + var10, (byte) -103, var9, var9.field4057, var9.field4007, var11, class262.field4442, class155.field2457);
                        }
                    }
                    if (var9.field4073 == 0) {
                        method2014(arg0, var9.field3996, var12, var13, var14, var15, var10 - var9.field4092, var11 - var9.field4079);
                        if (var9.field4004 != null) {
                            method2014(var9.field4004, var9.field3996, var12, var13, var14, var15, var10 - var9.field4092, var11 - var9.field4079);
                        }
                        class240 var74 = (class240) class26.field319.method493((long) var9.field3996, 66);
                        if (var74 != null) {
                            class303.method2061(var12, var15, var74.field3898, var10, var11, 16572, var14, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lg;)I", line = 2837)
    public static final int method2015(class242 arg0) {
        class69 var1 = (class69) class48.field590.method493(((long) arg0.field3996 << 32) + (long) arg0.field3956, 79);
        return var1 == null ? arg0.field3971 : var1.field919;
    }
}
