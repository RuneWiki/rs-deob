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
public class client extends class205 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
    public static boolean field5162 = true;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
    public static int[] field5167;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 6)
    private final void method2047(int arg0) {
        field5163++;
        if (arg0 == -17293) {
            boolean var2 = class246.field4185.method1763((byte) 66);
            if (!var2) {
                this.method2054(-29336);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 35)
    public final void method1440(int arg0) {
        field5168++;
        if (arg0 != 122) {
            main((String[]) null);
        }
        if (class118.field1983 == 1000) {
            return;
        }
        boolean var2 = class226.method1597(arg0 + 1854);
        if (var2 && class91.field1429 && class221.field3800 != null) {
            class221.field3800.method861(124);
        }
        if (class118.field1983 == 30 || class118.field1983 == 10) {
            if (class163.field2648) {
                class108.method833(arg0 - 43);
            } else if (class282.field4816 != 0L && class293.method1985((byte) -71) > class282.field4816) {
                class108.method833(89);
            }
        }
        if (class271.field4617 != 0L && class271.field4617 < class293.method1985((byte) -71) && class200.field3381 != null && (class118.field1983 == 30 || class118.field1983 == 25)) {
            class278.method1903(-63);
        }
        if (class212.field3569 == null) {
            Container var3;
            if (class212.field3569 != null) {
                var3 = class212.field3569;
            } else if (class216.field3686 == null) {
                var3 = class193.field3246.field4878;
            } else {
                var3 = class216.field3686;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class216.field3686 == var3) {
                Insets var6 = class216.field3686.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class90.field1421 != var4 || class229.field3977 != var5) {
                class197.method1378(false, 500);
            }
        }
        boolean var7 = false;
        if (class212.field3569 != null && !class74.field1170 && (class118.field1983 == 30 || class118.field1983 == 10)) {
            class57.method376(arg0 ^ 0xFFFF91EE);
        }
        if (class226.field3930) {
            var7 = true;
            class226.field3930 = false;
        }
        if (var7) {
            class294.method1998((byte) 120);
        }
        for (int var8 = 0; var8 < 100; var8++) {
            class220.field3784[var8] = true;
        }
        if (class118.field1983 == 0) {
            class137.method1039(var7, class81.field1361, class271.field4622, 73, (Color) null);
        } else if (class118.field1983 == 5) {
            class125.method946(class296.field5047, 2);
        } else if (class118.field1983 == 10) {
            class80.method616((byte) 105);
        } else if (class118.field1983 == 25 || class118.field1983 == 28) {
            if (class148.field2335 == 1) {
                if (class306.field5260 > class192.field3228) {
                    class192.field3228 = class306.field5260;
                }
                int var9 = (class192.field3228 - class306.field5260) * 50 / class192.field3228;
                class17.method67(class254.method1772(new class62[] { class74.field1139, class45.field674, class42.method284(var9, -124), class248.field4214 }, arg0 - 122), false, arg0 ^ 0x70);
            } else if (class148.field2335 == 2) {
                if (class290.field4930 > class265.field4479) {
                    class265.field4479 = class290.field4930;
                }
                int var10 = ((class265.field4479 - class290.field4930) * 50 / class265.field4479) + 50;
                class17.method67(class254.method1772(new class62[] { class74.field1139, class45.field674, class42.method284(var10, -128), class248.field4214 }, 0), false, 10);
            } else {
                class17.method67(class74.field1139, false, 10);
            }
        } else if (class118.field1983 == 30) {
            class287.method1962(5681);
        } else if (class118.field1983 == 40) {
            class17.method67(class254.method1772(new class62[] { class87.field1398, class220.field3782, class133.field2168 }, 0), false, 10);
        }
        if (class118.field1983 != 0) {
            class154.method1114();
            for (int var17 = 0; var17 < class221.field3805; var17++) {
                class159.field2560[var17] = false;
            }
        } else if ((class118.field1983 == 30 || class118.field1983 == 10) && class32.field444 == 0 && !var7) {
            try {
                Graphics var11 = class243.field4132.getGraphics();
                for (int var12 = 0; var12 < class221.field3805; var12++) {
                    if (class159.field2560[var12]) {
                        class219.field3778.method1459(class161.field2604[var12], class166.field2725[var12], class183.field2935[var12], var11, class199.field3362[var12], (byte) 74);
                        class159.field2560[var12] = false;
                    }
                }
            } catch (Exception var23) {
                class243.field4132.repaint();
            }
        } else if (class118.field1983 != 0) {
            try {
                Graphics var14 = class243.field4132.getGraphics();
                class219.field3778.method1467(var14, 0, 0, true);
                for (int var15 = 0; var15 < class221.field3805; var15++) {
                    class159.field2560[var15] = false;
                }
            } catch (Exception var22) {
                class243.field4132.repaint();
            }
        }
        if (class268.field4544) {
            class206.method1450((byte) -127);
        }
        if (!browsercontrol.iscreated() || class282.field4811 == 0) {
            return;
        }
        try {
            Point var18 = class243.field4132.getLocationOnScreen();
            Dimension var19 = class243.field4132.getSize();
            browsercontrol.set_position(var18.x, var18.y - class282.field4811, var19.width, class282.field4811);
        } catch (Exception var21) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 274)
    public final void method1443(byte arg0) {
        field5171++;
        method2049(0);
        class62.method441(-18161);
        class94.method756(32032);
        class274.method1873((byte) 122);
        class226.method1600(-28993);
        class205.method1437(0);
        class154.method1139();
        class309.method2103((byte) 105);
        class209.method1463((byte) -4);
        class1.method4(false);
        class133.method1008(-1);
        class92.method716((byte) 29);
        class165.method1190(true);
        class252.method1761(false);
        class229.method1620((byte) -102);
        class143.method1059(121);
        class112.method868((byte) -63);
        class26.method145((byte) 13);
        class294.method1999(15208);
        class177.method1244((byte) -127);
        class199.method1389(103);
        class204.method1424(23891);
        class241.method1689(8);
        class218.method1562(0);
        class191.method1329(59);
        class304.method2085(1);
        class153.method1098(124);
        class52.method327(true);
        class49.method321((byte) -125);
        class269.method1848(-121);
        class225.method1596((byte) 127);
        class201.method1412(100);
        class135.method1019(-106);
        class74.method538(127);
        class111.method863((byte) 73);
        class235.method1657((byte) -128);
        class20.method90(Integer.MIN_VALUE);
        class96.method779(true);
        class222.method1579(64);
        class166.method1196(-101);
        class148.method1070((byte) 26);
        class275.method1876((byte) -112);
        class146.method1065(0);
        class206.method1447((byte) -97);
        class250.method1738((byte) -105);
        class247.method1727(256);
        class97.method782(-104);
        class66.method474(0);
        class149.method1074(-8365);
        class42.method282(true);
        class21.method96((byte) 120);
        class185.method1296(true);
        class251.method1747(true);
        class43.method286(0);
        class19.method82(6);
        class208.method1457(true);
        class216.method1530(false);
        class286.method1959(true);
        class179.method1261();
        class159.method1164(50);
        class76.method583();
        class291.method1978((byte) 68);
        class213.method1489();
        class37.method251(-118);
        class67.method476();
        class109.method839(-124);
        class263.method1819(-29962);
        class293.method1986(false);
        class121.method932(128);
        class75.method569(5000);
        class79.method610();
        class228.method1610((byte) -106);
        class152.method1094(-116);
        class24.method122(false);
        class299.method2042();
        class85.method648(false);
        class224.method1588();
        class164.method1180(-2516);
        class27.method166(512);
        class123.method938(-8);
        class54.method355(0);
        class268.method1843(-11);
        class32.method210(-1);
        class264.method1821(true);
        class187.method1309((byte) -37);
        class295.method2003();
        class142.method1051();
        class203.method1422((byte) -86);
        class38.method256(-103);
        class29.method193(0);
        class23.method105();
        class280.method1910();
        class91.method682(2);
        class15.method55(-108);
        class117.method905();
        class292.method1980(false);
        class170.method1218(-10663);
        class259.method1803(0);
        class168.method1210();
        class28.method172();
        class22.method103((byte) -57);
        class100.method796((byte) -123);
        class311.method2119();
        class137.method1035((byte) -94);
        class68.method505(14367);
        class242.method1703();
        class116.method900((byte) 49);
        class190.method1328(26203);
        class89.method672();
        class17.method66((byte) 72);
        class110.method844(false);
        class103.method813(27878);
        class276.method1891((byte) -23);
        class104.method819((byte) 114);
        class266.method1834(true);
        class197.method1380(0);
        class136.method1033((byte) -28);
        class227.method1605(2);
        class35.method229(false);
        class290.method1976((byte) -9);
        class5.method25((byte) -101);
        class158.method1157(90);
        class134.method1016(-114);
        class44.method289(-8261);
        class282.method1922(0);
        class271.method1858((byte) 77);
        class297.method2012(false);
        class200.method1402((byte) -24);
        class31.method207((byte) 122);
        class56.method365(431684839);
        class258.method1800((byte) 18);
        class39.method264(-31576);
        class53.method351(127);
        class45.method292((byte) -127);
        class186.method1305((byte) 107);
        class127.method952((byte) -51);
        class60.method392((byte) 100);
        class214.method1515(22);
        class161.method1172((byte) -46);
        class307.method2093(-1);
        class87.method651((byte) 49);
        class220.method1568(false);
        class71.method511((byte) -87);
        class176.method1242((byte) -115);
        class151.method1084(128);
        class272.method1865(99999);
        class114.method890((byte) -126);
        class70.method508((byte) 14);
        class64.method464(false);
        class248.method1729(-12176);
        class160.method1168();
        class107.method829(271667011);
        class169.method1216(28040);
        class198.method1384(true);
        class288.method1971(false);
        class125.method944((byte) -124);
        class194.method1364(-123);
        class173.method1235(26429);
        class41.method281(false);
        class265.method1824(16);
        class131.method963((byte) -66);
        int var2 = -7 / ((arg0 - 3) / 50);
        class256.method1780(false);
        class230.method1625(-124);
        class113.method880(-88);
        class90.method677((byte) -34);
        class278.method1902(104);
        class50.method324((byte) -101);
        class8.method38(true);
        class196.method1376((byte) -127);
        class156.method1151(-1);
        class124.method941((byte) -84);
        class249.method1734(-119);
        class115.method896(-126);
        class33.method211();
        class267.method1835((byte) -121);
        class106.method823(-2947);
        class232.method1641(1783363559);
        class287.method1963((byte) 64);
        class171.method1230((byte) -88);
        class72.method520((byte) 119);
        class130.method960();
        class253.method1770();
        class83.method646();
        class236.method1663(795797038);
        class238.method1676(true);
        class246.method1720((byte) 73);
        class289.method1972((byte) 15);
        class302.method2073();
        class65.method470();
        class98.method787(118);
        class270.method1851((byte) -27);
        class262.method1809(-18238);
        class129.method958((byte) 117);
        class78.method606((byte) -91);
        class118.method923(112);
        class141.method1050((byte) -40);
        class306.method2087(2);
        class16.method62((byte) 101);
        class219.method1565((byte) 101);
        class308.method2098((byte) 76);
        class40.method272();
        class145.method1062();
        class59.method389();
        class244.method1712(-64);
        class69.method506(-61);
        class245.method1715((byte) -97);
        class181.method1275(false);
        class7.method35(1);
        class30.method199((byte) 117);
        class182.method1285(false);
        class283.method1923(10263);
        class243.method1707((byte) -128);
        class63.method459(0);
        class284.method1935(0);
        class99.method793(true);
        class57.method375((byte) -27);
        class215.method1520(true);
        class105.method820(-70);
        class184.method1291(false);
        class12.method51(-100);
        class101.method802(true);
        class81.method624(2);
        class140.method1048((byte) -7);
        class212.method1477(4096);
        class4.method18((byte) -123);
        class163.method1179(true);
        class298.method2017(true);
        class2.method9(26478);
        class102.method810(117);
        class55.method358(true);
        class174.method1237(1);
        class300.method2043(-117);
        class260.method1804(6703);
        class195.method1367(34);
        class162.method1176((byte) -107);
        class73.method522(1878053152);
        class36.method232(true);
        class233.method1645(122);
        class261.method1808((byte) -20);
        class254.method1775(49);
        class183.method1286((byte) 50);
        class207.method1452((byte) -96);
        class108.method835((byte) 18);
        class77.method592(false);
        class189.method1323(2048);
        class84.method647((byte) 41);
        class234.method1649(true);
        class14.method54(25690);
        class80.method619((byte) -54);
        class155.method1150(94);
        class144.method1060(-122);
        class301.method2060(false);
        class281.method1916(0);
        class119.method925(-50);
        class193.method1353(30393);
        class122.method935(1);
        class240.method1681(-87);
        class150.method1077(1);
        class46.method296(19801);
        class120.method929((byte) 1);
        class296.method2006(18);
        class192.method1350(105);
        class221.method1574((byte) -124);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 555)
    public final void method1434(byte arg0) {
        field5159++;
        if (class118.field1983 == 1000) {
            return;
        }
        class199.field3367++;
        if ((class199.field3367 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class22.field236 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class182.field2905.setSeed((long) class22.field236);
        }
        this.method2047(-17293);
        if (class274.field4652 != null) {
            class274.field4652.method1055(false);
        }
        int var3 = 12 % ((arg0 - 64) / 36);
        class114.method889(69);
        class209.method1460(100);
        class140.method1045(-1);
        class283.method1926(0);
        class79.method611();
        if (class94.field1549 != null) {
            int var4 = class94.field1549.method1265((byte) -122);
            class269.field4565 = var4;
        }
        if (class118.field1983 == 0) {
            this.method2057((byte) -109);
            class176.method1239((byte) -94);
        } else if (class118.field1983 == 5) {
            this.method2057((byte) 115);
            class176.method1239((byte) -94);
        } else if (class118.field1983 == 25 || class118.field1983 == 28) {
            class236.method1664((byte) 105);
        }
        if (class118.field1983 == 10) {
            this.method2059(1);
            class183.method1287((byte) -80);
            class159.method1163(117);
        } else if (class118.field1983 == 30) {
            class60.method391((byte) -22);
        } else if (class118.field1983 == 40) {
            class159.method1163(-16);
            if (class114.field1922 != -3) {
                if (class114.field1922 == 15) {
                    class71.method513((byte) -7);
                } else if (class114.field1922 != 2) {
                    class7.method33((byte) 65);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 649)
    private final String method2048(String arg0, int arg1) {
        field5157++;
        StringBuffer var3 = new StringBuffer();
        for (int var4 = 0; arg0.length() > var4; var4++) {
            char var5 = arg0.charAt(var4);
            if ((var5 < '0' || var5 > '9') && (var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z')) {
                var3.append('%');
                int var6 = var5 >> 4 & 0xF;
                if (var6 >= 0 && var6 <= 9) {
                    var3.append((char) (var6 + 48));
                } else if (var6 >= 10 && var6 <= 15) {
                    var3.append((char) (65 - (10 - var6)));
                }
                int var7 = var5 & 0xF;
                if (var7 >= 0 && var7 <= 9) {
                    var3.append((char) (var7 + 48));
                } else if (var7 >= 10 && var7 <= 15) {
                    var3.append((char) (65 - (10 - var7)));
                }
            } else {
                var3.append(var5);
            }
        }
        if (arg1 == -10) {
            return var3.toString();
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 715)
    public static void method2049(int arg0) {
        if (arg0 != 0) {
            field5162 = false;
        }
        field5167 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)I", line = 730)
    public static final int method2050(byte arg0) {
        field5172++;
        if (arg0 <= 46) {
            field5167 = (int[]) null;
        }
        if (class212.field3569 == null) {
            return class235.field4039 ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsg;)Z", line = 761)
    public static final boolean method2051(class191 arg0) {
        if (class263.field4433) {
            if (method2058(arg0) != 0) {
                return false;
            }
            if (arg0.field3068 == 0) {
                return false;
            }
        }
        return arg0.field3116;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 775)
    public final void method1433(int arg0) {
        field5165++;
        class154.method1127();
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class212.field3569 != null) {
            class184.method1289(class212.field3569, class193.field3246, (byte) 92);
            class212.field3569 = null;
        }
        if (class193.field3246 != null) {
            class193.field3246.method1948(false, this.getClass());
        }
        if (class197.field3336 != null) {
            class197.field3336.field4 = false;
        }
        class197.field3336 = null;
        if (class200.field3381 != null) {
            class200.field3381.method1193(-1);
            class200.field3381 = null;
        }
        class278.method1898(8, class243.field4132);
        class301.method2061(arg0 ^ 0xFFFFFF90, class243.field4132);
        if (arg0 != 30) {
            return;
        }
        if (class94.field1549 != null) {
            class94.field1549.method1264((byte) -95, class243.field4132);
        }
        class284.method1933(arg0 ^ 0xFFFFFF91);
        class30.method194((byte) -70);
        class94.field1549 = null;
        if (class221.field3800 != null) {
            class221.field3800.method854(-16385);
        }
        if (class158.field2537 != null) {
            class158.field2537.method854(-16385);
        }
        class246.field4185.method1751(8);
        class99.field1632.method1621((byte) -20);
        try {
            if (class36.field499 != null) {
                class36.field499.method1989(true);
            }
            if (class107.field1732 != null) {
                for (int var2 = 0; var2 < class107.field1732.length; var2++) {
                    if (class107.field1732[var2] != null) {
                        class107.field1732[var2].method1989(true);
                    }
                }
            }
            if (class281.field4796 != null) {
                class281.field4796.method1989(true);
            }
            if (class129.field2119 != null) {
                class129.field2119.method1989(true);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 872)
    private final void method2052(int arg0, int arg1) {
        class143.field2292++;
        class282.field4810 = 0;
        class114.field1889 = null;
        class104.field1711 = null;
        field5164++;
        if (arg1 != 3000) {
            return;
        }
        if (class78.field1315 == class20.field202) {
            class78.field1315 = class243.field4136;
        } else {
            class78.field1315 = class20.field202;
        }
        if (class143.field2292 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class118.field1983 == 0 || class118.field1983 == 5) {
                this.method1438(true, "js5connect_full");
                class118.field1983 = 1000;
            } else {
                class35.field469 = 3000;
            }
        } else if (class143.field2292 >= 2 && arg0 == 6) {
            this.method1438(true, "js5connect_outofdate");
            class118.field1983 = 1000;
        } else if (class143.field2292 >= 4) {
            if (class118.field1983 == 0 || class118.field1983 == 5) {
                this.method1438(true, "js5connect");
                class118.field1983 = 1000;
            } else {
                class35.field469 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lsg;)Lsg;", line = 925)
    public static final class191 method2053(class191 arg0) {
        int var1 = class205.method1441(1, method2058(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class1.method2(arg0.field3074, (byte) -37);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 958)
    private final void method2054(int arg0) {
        field5160++;
        if (class246.field4185.field4297 >= 4) {
            this.method1438(true, "js5crc");
            class118.field1983 = 1000;
            return;
        }
        if (class246.field4185.field4299 >= 4) {
            if (class118.field1983 == 0 || class118.field1983 == 5) {
                this.method1438(true, "js5io");
                class118.field1983 = 1000;
                return;
            }
            class246.field4185.field4299 = 3;
            class35.field469 = 3000;
        }
        if ((class35.field469--) > 0) {
            return;
        }
        try {
            if (class282.field4810 == 0) {
                class104.field1711 = class193.field3246.method1947(false, class78.field1315, class36.field474);
                class282.field4810++;
            }
            if (class282.field4810 == 1) {
                if (class104.field1711.field2322 == 2) {
                    this.method2052(-1, 3000);
                    return;
                }
                if (class104.field1711.field2322 == 1) {
                    class282.field4810++;
                }
            }
            if (class282.field4810 == 2) {
                class114.field1889 = new class165((Socket) class104.field1711.field2323, class193.field3246);
                class92 var2 = new class92(5);
                var2.method717(1, 15);
                var2.method712(513, arg0 + 29456);
                class114.field1889.method1187(0, 5, -84, var2.field1495);
                class282.field4810++;
                class191.field3167 = class293.method1985((byte) -71);
            }
            if (class282.field4810 == 3) {
                if (class118.field1983 == 0 || class118.field1983 == 5 || class114.field1889.method1185((byte) 124) > 0) {
                    int var3 = class114.field1889.method1191((byte) 127);
                    if (var3 != 0) {
                        this.method2052(var3, 3000);
                        return;
                    }
                    class282.field4810++;
                } else if (class293.method1985((byte) -71) - class191.field3167 > 30000L) {
                    this.method2052(-2, 3000);
                    return;
                }
            }
            if (class282.field4810 == 4) {
                boolean var4 = class118.field1983 == 5 || class118.field1983 == 10 || class118.field1983 == 28;
                class246.field4185.method1757(class114.field1889, !var4, 65);
                class282.field4810 = 0;
                class114.field1889 = null;
                class104.field1711 = null;
                class143.field2292 = 0;
            }
            if (arg0 != -29336) {
                this.method2052(15, 97);
            }
        } catch (IOException var6) {
            this.method2052(-3, arg0 ^ -31024);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILsg;)I", line = 1090)
    public static final int method2055(int arg0, int arg1, class191 arg2) {
        field5158++;
        if (arg2.field3121 == null || arg1 >= arg2.field3121.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field3121[arg1];
            if (arg0 != -19) {
                return 77;
            }
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                byte var7 = 0;
                int var8 = var4[var3++];
                int var9 = 0;
                if (var8 == 0) {
                    return var6;
                }
                if (var8 == 1) {
                    var9 = class146.field2314[var4[var3++]];
                }
                if (var8 == 15) {
                    var7 = 1;
                }
                if (var8 == 16) {
                    var7 = 2;
                }
                if (var8 == 2) {
                    var9 = class260.field4372[var4[var3++]];
                }
                if (var8 == 17) {
                    var7 = 3;
                }
                if (var8 == 3) {
                    var9 = class52.field742[var4[var3++]];
                }
                if (var8 == 4) {
                    int var10 = var4[var3++] << 16;
                    int var11 = var10 + var4[var3++];
                    class191 var12 = class1.method2(var11, (byte) -37);
                    int var13 = var4[var3++];
                    if (var13 != -1 && (!class189.method1320(0, var13).field526 || class294.field5021)) {
                        for (int var14 = 0; var14 < var12.field3085.length; var14++) {
                            if (var13 + 1 == var12.field3085[var14]) {
                                var9 += var12.field3106[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class222.field3877[var4[var3++]];
                }
                if (var8 == 6) {
                    var9 = class259.field4363[class260.field4372[var4[var3++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class222.field3877[var4[var3++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class268.field4551.field2441;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class97.field1601[var15]) {
                            var9 += class260.field4372[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var4[var3++] << 16;
                    int var17 = var16 + var4[var3++];
                    class191 var18 = class1.method2(var17, (byte) -37);
                    int var19 = var4[var3++];
                    if (var19 != -1 && (!class189.method1320(0, var19).field526 || class294.field5021)) {
                        for (int var20 = 0; var20 < var18.field3085.length; var20++) {
                            if (var19 + 1 == var18.field3085[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class238.field4074;
                }
                if (var8 == 12) {
                    var9 = class292.field4974;
                }
                if (var8 == 13) {
                    int var21 = class222.field3877[var4[var3++]];
                    int var22 = var4[var3++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var4[var3++];
                    var9 = class103.method812(8, var23);
                }
                if (var8 == 18) {
                    var9 = (class268.field4551.field3821 >> 7) + class120.field2006;
                }
                if (var8 == 19) {
                    var9 = (class268.field4551.field3814 >> 7) + class290.field4936;
                }
                if (var8 == 20) {
                    var9 = var4[var3++];
                }
                if (var7 == 0) {
                    if (var5 == 0) {
                        var6 += var9;
                    }
                    if (var5 == 1) {
                        var6 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var6 /= var9;
                    }
                    if (var5 == 3) {
                        var6 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var7;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1321)
    public final void init() {
        field5169++;
        if (!this.method1429(-1)) {
            return;
        }
        class123.field2046 = Integer.parseInt(this.getParameter("worldid"));
        class123.field2045 = Integer.parseInt(this.getParameter("modewhat"));
        class101.field1669 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class75.field1214 = true;
        } else {
            class75.field1214 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class294.field5021 = true;
        } else {
            class294.field5021 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null) {
            try {
                class185.field2964 = Integer.parseInt(var3);
            } catch (Exception var14) {
            }
        }
        class195.method1370(class185.field2964, 18201);
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class131.field2132 = 1;
        } else {
            class131.field2132 = 0;
        }
        try {
            class19.field186 = Integer.parseInt(this.getParameter("js"));
            class278.field4772 = Integer.parseInt(this.getParameter("plug"));
            class291.field4950 = Integer.parseInt(this.getParameter("affid"));
            class60.field868 = Integer.parseInt(this.getParameter("haveie6")) == 1;
        } catch (Exception var13) {
        }
        class181.field2879 = class102.field1690.method435((byte) 36, this);
        if (class181.field2879 == null) {
            class181.field2879 = class275.field4694;
        }
        String var7 = this.getParameter("advert");
        if (var7 != null) {
            byte[] var8;
            try {
                var8 = var7.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var12) {
                var8 = var7.getBytes();
            }
            class62 var10 = class266.method1833(0, var8.length, var8, 0);
            boolean var11 = class94.method760(126, var10);
            if (var11) {
                class252.field4277 = var10;
            }
        }
        class36.field474 = this.getCodeBase().getHost();
        this.method1430(503, 513, (byte) 126, 765, class123.field2045 + 32);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1403)
    public final void method1431(int arg0) {
        class99.field1632 = new class229();
        field5161++;
        class246.field4185 = new class252();
        if (class123.field2045 == 0) {
        }
        class112.method870(class75.field1214, class193.field3246, (byte) 81);
        class20.field202 = class101.field1669 == 0 ? 43594 : class123.field2046 + 40000;
        class233.field4028 = class118.field1973 = class96.field1557 = class244.field4158 = new short[256];
        class78.field1315 = class20.field202;
        if (class131.field2132 == 1) {
            class179.field2860 = 16777215;
            class179.field2859 = 0;
            class104.field1702 = class197.field3329;
            class4.field42 = class44.field661;
            class158.field2533 = class94.field1544;
            class151.field2378 = class94.field1547;
        } else {
            class4.field42 = class137.field2228;
            class158.field2533 = class268.field4545;
            class151.field2378 = class287.field4901;
            class104.field1702 = class114.field1919;
        }
        class243.field4136 = class101.field1669 == 0 ? 443 : class123.field2046 + 50000;
        class171.method1228((byte) -101);
        if (arg0 < 63) {
            return;
        }
        class209.method1462(class243.field4132, (byte) -120);
        class74.method557((byte) 125, class243.field4132);
        class94.field1549 = class170.method1219(43);
        if (class94.field1549 != null) {
            class94.field1549.method1263(65280, class243.field4132);
        }
        class27.field351 = class285.field4883;
        try {
            if (class193.field3246.field4881 != null) {
                class36.field499 = new class294(class193.field3246.field4881, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class107.field1732[var2] = new class294(class193.field3246.field4870[var2], 6000, 0);
                }
                class281.field4796 = new class294(class193.field3246.field4879, 6000, 0);
                class4.field44 = new class177(255, class36.field499, class281.field4796, 500000);
                class129.field2119 = new class294(class193.field3246.field4867, 24, 0);
                class193.field3246.field4881 = null;
                class193.field3246.field4879 = null;
                class193.field3246.field4867 = null;
                class193.field3246.field4870 = null;
            }
        } catch (IOException var4) {
            class129.field2119 = null;
            class281.field4796 = null;
            class4.field44 = null;
            class36.field499 = null;
        }
        if (class101.field1669 != 0) {
            class214.field3639 = true;
        }
        class227.field3945 = class192.field3232;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lsg;IIIIIII)V", line = 1489)
    public static final void method2056(class191[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class191 var9 = arg0[var8];
            if (var9 != null && var9.field3074 == arg1 && (!var9.field3209 || var9.field3068 == 0 || var9.field3069 || method2058(var9) != 0 || class80.field1342 == var9 || var9.field3083 == 1338) && (!var9.field3209 || !method2051(var9))) {
                int var10 = var9.field3152 + arg6;
                int var11 = var9.field3098 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3068 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3190 + var10;
                    int var17 = var9.field3126 + var11;
                    if (var9.field3068 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class164.field2674 == var9) {
                    class215.field3652 = true;
                    class53.field780 = var10;
                    class264.field4442 = var11;
                }
                if (!var9.field3209 || var12 < var14 && var13 < var15) {
                    if (var9.field3068 == 0) {
                        if (!var9.field3209 && method2051(var9) && class166.field2716 != var9) {
                            continue;
                        }
                        if (var9.field3075 && class275.field4725 >= var12 && class221.field3795 >= var13 && class275.field4725 < var14 && class221.field3795 < var15) {
                            for (class161 var18 = (class161) class116.field1945.method334(-18673); var18 != null; var18 = (class161) class116.field1945.method335((byte) 109)) {
                                if (var18.field2608) {
                                    var18.method1444((byte) 89);
                                }
                            }
                            if (class263.field4431 == 0) {
                                class164.field2674 = null;
                                class80.field1342 = null;
                            }
                            class278.field4779 = false;
                        }
                    }
                    if (var9.field3209) {
                        boolean var19;
                        if (class275.field4725 >= var12 && class221.field3795 >= var13 && class275.field4725 < var14 && class221.field3795 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class127.field2106 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class235.field4049 == 1 && class171.field2786 >= var12 && class207.field3520 >= var13 && class171.field2786 < var14 && class207.field3520 < var15) {
                            var21 = true;
                        }
                        if (class99.field1628 > 0 && var9.field3183 != null) {
                            for (int var22 = 0; var22 < var9.field3183.length; var22++) {
                                for (int var23 = 0; var23 < class99.field1628; var23++) {
                                    int var24 = var9.field3183[var22] & 0xFF;
                                    if (class158.field2539[var23] == var24) {
                                        if (var9.field3185 != null) {
                                            byte var25 = var9.field3185[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class291.field4939[86] || (var25 & 0x1) != 0 && !class291.field4939[82] || (var25 & 0x4) != 0 && !class291.field4939[81])) {
                                                continue;
                                            }
                                        }
                                        class261.method1806(-1, var22 + 1, var9.field3142, false, class275.field4694);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class222.method1578(class207.field3520 - var11, class171.field2786 - var10, var9, 32);
                        }
                        if (class164.field2674 != null && class164.field2674 != var9 && var19 && class201.method1408((byte) -19, method2058(var9))) {
                            class26.field301 = var9;
                        }
                        if (class80.field1342 == var9) {
                            class205.field3453 = true;
                            class131.field2139 = var10;
                            class232.field4005 = var11;
                        }
                        if (var9.field3069 || var9.field3083 != 0) {
                            if (var19 && class269.field4565 != 0 && var9.field3084 != null) {
                                class161 var26 = new class161();
                                var26.field2608 = true;
                                var26.field2597 = var9;
                                var26.field2606 = class269.field4565;
                                var26.field2598 = var9.field3084;
                                class116.field1945.method330(var26, -87);
                            }
                            if (class164.field2674 != null || class254.field4319 != null || class80.field1341 || var9.field3083 != 1400 && class278.field4779) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3083 != 0) {
                                if (var9.field3083 == 1337) {
                                    class297.field5074 = var9;
                                    class250.method1744(var9, (byte) 108);
                                    continue;
                                }
                                if (var9.field3083 == 1338) {
                                    if (var21) {
                                        class238.method1678(var9, class207.field3520 - var11, class171.field2786 - var10, (byte) 119);
                                    }
                                    continue;
                                }
                                if (var9.field3083 == 1400) {
                                    class152.field2399 = var9;
                                    if (var21) {
                                        if (class291.field4939[82] && class293.field4985 > 0) {
                                            int var27 = (int) ((double) (class171.field2786 - var10 - var9.field3190 / 2) * 2.0D / (double) class187.field2990);
                                            int var28 = (int) ((double) (class207.field3520 - var11 - var9.field3126 / 2) * 2.0D / (double) class187.field2990);
                                            int var29 = class114.field1915 + var27;
                                            int var30 = class282.field4813 + var28;
                                            int var31 = class22.field239 + var29;
                                            int var32 = class248.field4219 + class164.field2666 - var30 - 1;
                                            class159.method1165(40, var32, 0, var31);
                                            class287.method1965(0);
                                            continue;
                                        }
                                        class278.field4779 = true;
                                        class72.field1101 = class275.field4725;
                                        class209.field3544 = class221.field3795;
                                        class165.field2689 = class114.field1915;
                                        class276.field4728 = class282.field4813;
                                        continue;
                                    }
                                    if (var20 && class278.field4779) {
                                        class78.method607(-1, (int) ((double) (class72.field1101 - class275.field4725) * 2.0D / (double) class169.field2758) + class165.field2689);
                                        class14.method53(103, (int) ((double) (class209.field3544 - class221.field3795) * 2.0D / (double) class169.field2758) + class276.field4728);
                                        continue;
                                    }
                                    class278.field4779 = false;
                                    continue;
                                }
                                if (var9.field3083 == 1401) {
                                    if (var20) {
                                        class80.method621(var9.field3126, class275.field4725 - var10, var9.field3190, true, class221.field3795 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field3083 == 1402 || var9.field3083 == 1404) {
                                    continue;
                                }
                            }
                            if (!var9.field3139 && var21) {
                                var9.field3139 = true;
                                if (var9.field3151 != null) {
                                    class161 var33 = new class161();
                                    var33.field2608 = true;
                                    var33.field2597 = var9;
                                    var33.field2603 = class171.field2786 - var10;
                                    var33.field2606 = class207.field3520 - var11;
                                    var33.field2598 = var9.field3151;
                                    class116.field1945.method330(var33, -84);
                                }
                            }
                            if (var9.field3139 && var20 && var9.field3063 != null) {
                                class161 var34 = new class161();
                                var34.field2608 = true;
                                var34.field2597 = var9;
                                var34.field2603 = class275.field4725 - var10;
                                var34.field2606 = class221.field3795 - var11;
                                var34.field2598 = var9.field3063;
                                class116.field1945.method330(var34, 46);
                            }
                            if (var9.field3139 && !var20) {
                                var9.field3139 = false;
                                if (var9.field3114 != null) {
                                    class161 var35 = new class161();
                                    var35.field2608 = true;
                                    var35.field2597 = var9;
                                    var35.field2603 = class275.field4725 - var10;
                                    var35.field2606 = class221.field3795 - var11;
                                    var35.field2598 = var9.field3114;
                                    class125.field2072.method330(var35, 107);
                                }
                            }
                            if (var20 && var9.field3132 != null) {
                                class161 var36 = new class161();
                                var36.field2608 = true;
                                var36.field2597 = var9;
                                var36.field2603 = class275.field4725 - var10;
                                var36.field2606 = class221.field3795 - var11;
                                var36.field2598 = var9.field3132;
                                class116.field1945.method330(var36, -127);
                            }
                            if (!var9.field3059 && var19) {
                                var9.field3059 = true;
                                if (var9.field3195 != null) {
                                    class161 var37 = new class161();
                                    var37.field2608 = true;
                                    var37.field2597 = var9;
                                    var37.field2603 = class275.field4725 - var10;
                                    var37.field2606 = class221.field3795 - var11;
                                    var37.field2598 = var9.field3195;
                                    class116.field1945.method330(var37, -112);
                                }
                            }
                            if (var9.field3059 && var19 && var9.field3087 != null) {
                                class161 var38 = new class161();
                                var38.field2608 = true;
                                var38.field2597 = var9;
                                var38.field2603 = class275.field4725 - var10;
                                var38.field2606 = class221.field3795 - var11;
                                var38.field2598 = var9.field3087;
                                class116.field1945.method330(var38, 114);
                            }
                            if (var9.field3059 && !var19) {
                                var9.field3059 = false;
                                if (var9.field3060 != null) {
                                    class161 var39 = new class161();
                                    var39.field2608 = true;
                                    var39.field2597 = var9;
                                    var39.field2603 = class275.field4725 - var10;
                                    var39.field2606 = class221.field3795 - var11;
                                    var39.field2598 = var9.field3060;
                                    class125.field2072.method330(var39, 83);
                                }
                            }
                            if (var9.field3203 != null) {
                                class161 var40 = new class161();
                                var40.field2597 = var9;
                                var40.field2598 = var9.field3203;
                                class75.field1220.method330(var40, -97);
                            }
                            if (var9.field3054 != null && class162.field2629 > var9.field3131) {
                                if (var9.field3102 == null || class162.field2629 - var9.field3131 > 32) {
                                    class161 var45 = new class161();
                                    var45.field2597 = var9;
                                    var45.field2598 = var9.field3054;
                                    class116.field1945.method330(var45, 97);
                                } else {
                                    label550: for (int var41 = var9.field3131; var41 < class162.field2629; var41++) {
                                        int var42 = class183.field2930[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field3102.length; var43++) {
                                            if (var9.field3102[var43] == var42) {
                                                class161 var44 = new class161();
                                                var44.field2597 = var9;
                                                var44.field2598 = var9.field3054;
                                                class116.field1945.method330(var44, 116);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field3131 = class162.field2629;
                            }
                            if (var9.field3078 != null && class222.field3810 > var9.field3056) {
                                if (var9.field3205 == null || class222.field3810 - var9.field3056 > 32) {
                                    class161 var50 = new class161();
                                    var50.field2597 = var9;
                                    var50.field2598 = var9.field3078;
                                    class116.field1945.method330(var50, 45);
                                } else {
                                    label526: for (int var46 = var9.field3056; var46 < class222.field3810; var46++) {
                                        int var47 = class244.field4142[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field3205.length; var48++) {
                                            if (var9.field3205[var48] == var47) {
                                                class161 var49 = new class161();
                                                var49.field2597 = var9;
                                                var49.field2598 = var9.field3078;
                                                class116.field1945.method330(var49, -76);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field3056 = class222.field3810;
                            }
                            if (var9.field3162 != null && class5.field57 > var9.field3099) {
                                if (var9.field3097 == null || class5.field57 - var9.field3099 > 32) {
                                    class161 var55 = new class161();
                                    var55.field2597 = var9;
                                    var55.field2598 = var9.field3162;
                                    class116.field1945.method330(var55, 107);
                                } else {
                                    label502: for (int var51 = var9.field3099; var51 < class5.field57; var51++) {
                                        int var52 = class248.field4217[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field3097.length; var53++) {
                                            if (var9.field3097[var53] == var52) {
                                                class161 var54 = new class161();
                                                var54.field2597 = var9;
                                                var54.field2598 = var9.field3162;
                                                class116.field1945.method330(var54, -111);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field3099 = class5.field57;
                            }
                            if (var9.field3055 != null && class261.field4381 > var9.field3110) {
                                if (var9.field3052 == null || class261.field4381 - var9.field3110 > 32) {
                                    class161 var60 = new class161();
                                    var60.field2597 = var9;
                                    var60.field2598 = var9.field3055;
                                    class116.field1945.method330(var60, 117);
                                } else {
                                    label478: for (int var56 = var9.field3110; var56 < class261.field4381; var56++) {
                                        int var57 = class194.field3285[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field3052.length; var58++) {
                                            if (var9.field3052[var58] == var57) {
                                                class161 var59 = new class161();
                                                var59.field2597 = var9;
                                                var59.field2598 = var9.field3055;
                                                class116.field1945.method330(var59, 119);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field3110 = class261.field4381;
                            }
                            if (var9.field3161 != null && class270.field4591 > var9.field3127) {
                                if (var9.field3045 == null || class270.field4591 - var9.field3127 > 32) {
                                    class161 var65 = new class161();
                                    var65.field2597 = var9;
                                    var65.field2598 = var9.field3161;
                                    class116.field1945.method330(var65, 48);
                                } else {
                                    label454: for (int var61 = var9.field3127; var61 < class270.field4591; var61++) {
                                        int var62 = class87.field1399[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field3045.length; var63++) {
                                            if (var9.field3045[var63] == var62) {
                                                class161 var64 = new class161();
                                                var64.field2597 = var9;
                                                var64.field2598 = var9.field3161;
                                                class116.field1945.method330(var64, 61);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field3127 = class270.field4591;
                            }
                            if (class78.field1310 > var9.field3155 && var9.field3111 != null) {
                                class161 var66 = new class161();
                                var66.field2597 = var9;
                                var66.field2598 = var9.field3111;
                                class116.field1945.method330(var66, -108);
                            }
                            if (class17.field153 > var9.field3155 && var9.field3112 != null) {
                                class161 var67 = new class161();
                                var67.field2597 = var9;
                                var67.field2598 = var9.field3112;
                                class116.field1945.method330(var67, -106);
                            }
                            if (class15.field123 > var9.field3155 && var9.field3154 != null) {
                                class161 var68 = new class161();
                                var68.field2597 = var9;
                                var68.field2598 = var9.field3154;
                                class116.field1945.method330(var68, -125);
                            }
                            if (class141.field2272 > var9.field3155 && var9.field3208 != null) {
                                class161 var69 = new class161();
                                var69.field2597 = var9;
                                var69.field2598 = var9.field3208;
                                class116.field1945.method330(var69, 107);
                            }
                            if (class149.field2356 > var9.field3155 && var9.field3148 != null) {
                                class161 var70 = new class161();
                                var70.field2597 = var9;
                                var70.field2598 = var9.field3148;
                                class116.field1945.method330(var70, 75);
                            }
                            var9.field3155 = class105.field1716;
                            if (var9.field3147 != null) {
                                for (int var71 = 0; var71 < class99.field1628; var71++) {
                                    class161 var72 = new class161();
                                    var72.field2597 = var9;
                                    var72.field2605 = class158.field2539[var71];
                                    var72.field2594 = class125.field2096[var71];
                                    var72.field2598 = var9.field3147;
                                    class116.field1945.method330(var72, -116);
                                }
                            }
                            if (class66.field993 && var9.field3136 != null) {
                                class161 var73 = new class161();
                                var73.field2597 = var9;
                                var73.field2598 = var9.field3136;
                                class116.field1945.method330(var73, 109);
                            }
                        }
                    }
                    if (!var9.field3209 && class164.field2674 == null && class254.field4319 == null && !class80.field1341) {
                        if ((var9.field3191 >= 0 || var9.field3058 != 0) && class275.field4725 >= var12 && class221.field3795 >= var13 && class275.field4725 < var14 && class221.field3795 < var15) {
                            if (var9.field3191 >= 0) {
                                class166.field2716 = arg0[var9.field3191];
                            } else {
                                class166.field2716 = var9;
                            }
                        }
                        if (var9.field3068 == 8 && class275.field4725 >= var12 && class221.field3795 >= var13 && class275.field4725 < var14 && class221.field3795 < var15) {
                            class22.field229 = var9;
                        }
                        if (var9.field3067 > var9.field3126) {
                            class265.method1830(class221.field3795, class275.field4725, var11, var9, var9.field3126, var9.field3190 + var10, var9.field3067, 18218);
                        }
                    }
                    if (var9.field3068 == 0) {
                        method2056(arg0, var9.field3142, var12, var13, var14, var15, var10 - var9.field3073, var11 - var9.field3188);
                        if (var9.field3180 != null) {
                            method2056(var9.field3180, var9.field3142, var12, var13, var14, var15, var10 - var9.field3073, var11 - var9.field3188);
                        }
                        class146 var74 = (class146) class214.field3632.method311((byte) 114, (long) var9.field3142);
                        if (var74 != null) {
                            class200.method1404(var13, var10, var14, var12, var11, false, var15, var74.field2312);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2246)
    public static final void main(String[] arg0) {
        field5170++;
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class198.method1381(-1791455576);
            }
            class123.field2046 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class101.field1669 = 0;
            } else if (arg0[1].equals("office")) {
                class101.field1669 = 1;
            } else if (arg0[1].equals("local")) {
                class101.field1669 = 2;
            } else {
                class198.method1381(-1791455576);
            }
            int var1 = -1;
            if (arg0[2].equals("live")) {
                class123.field2045 = 0;
            } else if (arg0[2].equals("rc")) {
                class123.field2045 = 1;
            } else if (arg0[2].equals("wip")) {
                class123.field2045 = 2;
            } else {
                class198.method1381(-1791455576);
            }
            if (arg0[4].equals("free")) {
                class294.field5021 = false;
            } else if (arg0[4].equals("members")) {
                class294.field5021 = true;
            } else {
                class198.method1381(-1791455576);
            }
            try {
                byte[] var2 = arg0[5].getBytes("ISO-8859-1");
                var1 = class170.method1220(0, class266.method1833(0, var2.length, var2, 0));
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class185.field2964 = var1;
            } else if (arg0[5].equals("english")) {
                class185.field2964 = 0;
            } else if (arg0[5].equals("german")) {
                class185.field2964 = 1;
            } else {
                class198.method1381(-1791455576);
            }
            class195.method1370(class185.field2964, 18201);
            if (arg0[6].equals("game0")) {
                class131.field2132 = 0;
            } else if (arg0[6].equals("game1")) {
                class131.field2132 = 1;
            } else {
                class198.method1381(-1791455576);
            }
            if (arg0.length != 8) {
                class75.field1214 = false;
            } else if (arg0[7].equals("safemode")) {
                class75.field1214 = true;
            } else {
                class198.method1381(-1791455576);
            }
            class181.field2879 = class275.field4694;
            class291.field4950 = 0;
            class36.field474 = "127.0.0.1";
            client var4 = new client();
            var4.method1426(768, 513, 27, "runescape", 0, 1024, class123.field2045 + 32);
            class216.field3686.setLocation(40, 40);
        } catch (Exception var7) {
            class235.method1659(var7, (String) null, -28677);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 2356)
    private final void method2057(byte arg0) {
        field5166++;
        if (class221.field3798 == 0) {
            Runtime var34 = Runtime.getRuntime();
            int var35 = (int) ((var34.totalMemory() - var34.freeMemory()) / 1024L);
            long var36 = class293.method1985((byte) -71);
            if (class199.field3353 == 0L) {
                class199.field3353 = var36;
            }
            if (var35 > 16384 && (var36 - class199.field3353) < 5000L) {
                if ((var36 - class276.field4748) > 1000L) {
                    System.gc();
                    class276.field4748 = var36;
                }
                class271.field4622 = class38.field596;
                class81.field1361 = 5;
            } else {
                class221.field3798 = 10;
                class271.field4622 = class294.field5018;
                class81.field1361 = 5;
            }
        } else if (class221.field3798 == 10) {
            class91.method684(4, 104, 104, 28);
            class117.method904(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class250.field4244[var2] = new class218(104, 104);
            }
            class81.field1361 = 10;
            class221.field3798 = 30;
            class271.field4622 = class177.field2833;
        } else if (class221.field3798 == 30) {
            if (class274.field4652 == null) {
                class274.field4652 = new class143(class246.field4185, class99.field1632);
            }
            if (class274.field4652.method1053((byte) 69)) {
                class112.field1852 = class31.method203(1000000, true, 0, true, false);
                class200.field3382 = class31.method203(1000000, true, 1, true, false);
                class300.field5148 = class31.method203(1000000, true, 2, false, true);
                class37.field500 = class31.method203(1000000, true, 3, true, false);
                class272.field4629 = class31.method203(1000000, true, 4, true, false);
                class113.field1874 = class31.method203(1000000, true, 5, true, true);
                class163.field2649 = class31.method203(1000000, false, 6, true, true);
                class218.field3753 = class31.method203(1000000, true, 7, true, false);
                class53.field781 = class31.method203(1000000, true, 8, true, false);
                class194.field3277 = class31.method203(1000000, true, 9, true, false);
                class32.field440 = class31.method203(1000000, true, 10, true, false);
                class14.field115 = class31.method203(1000000, true, 11, true, false);
                class35.field471 = class31.method203(1000000, true, 12, true, false);
                class281.field4800 = class31.method203(1000000, true, 13, true, false);
                class201.field3416 = class31.method203(1000000, false, 14, true, false);
                class290.field4931 = class31.method203(1000000, true, 15, true, false);
                class194.field3260 = class31.method203(1000000, true, 16, true, false);
                class105.field1722 = class31.method203(1000000, true, 17, true, false);
                class35.field470 = class31.method203(1000000, true, 18, true, false);
                class198.field3350 = class31.method203(1000000, true, 19, true, false);
                class298.field5084 = class31.method203(1000000, true, 20, true, false);
                class98.field1622 = class31.method203(1000000, true, 21, true, false);
                class196.field3319 = class31.method203(1000000, true, 22, true, false);
                class275.field4718 = class31.method203(1000000, true, 23, true, true);
                class150.field2364 = class31.method203(1000000, true, 24, true, false);
                class173.field2799 = class31.method203(1000000, true, 25, true, false);
                class203.field3429 = class31.method203(1000000, true, 26, true, true);
                class221.field3798 = 40;
                class81.field1361 = 15;
                class271.field4622 = class77.field1288;
            } else {
                class81.field1361 = 12;
                class271.field4622 = class90.field1424;
            }
        } else if (class221.field3798 == 40) {
            int var32 = 0;
            for (int var33 = 0; var33 < 27; var33++) {
                var32 += class170.field2765[var33].method867(3194) * class99.field1633[var33] / 100;
            }
            if (var32 == 100) {
                class271.field4622 = class227.field3958;
                class81.field1361 = 20;
                class17.method72((byte) -80, class53.field781);
                class215.method1517(class53.field781, (byte) 124);
                class105.method821(true, class53.field781);
                class37.method254((byte) 18, class53.field781);
                class221.field3798 = 45;
            } else {
                if (var32 != 0) {
                    class271.field4622 = class254.method1772(new class62[] { class43.field656, class42.method284(var32, -127), class74.field1197 }, 0);
                }
                class81.field1361 = 20;
            }
        } else if (class221.field3798 == 45) {
            class205.method1428(2, 22050, 3, class218.field3770);
            class113.field1871 = new class74();
            class113.field1871.method549(128, 9, (byte) 89);
            class221.field3800 = class233.method1644((byte) 127, 22050, class243.field4132, class193.field3246, 0);
            class221.field3800.method856(-13346, class113.field1871);
            class234.method1652(class201.field3416, -1760300720, class272.field4629, class290.field4931, class113.field1871);
            class158.field2537 = class233.method1644((byte) 127, 2048, class243.field4132, class193.field3246, 1);
            class27.field331 = new class25();
            class158.field2537.method856(-13346, class27.field331);
            class22.field238 = new class235(22050, class151.field2393);
            class19.field183 = class163.field2649.method153((byte) 110, class176.field2813);
            class271.field4622 = class183.field2936;
            class221.field3798 = 50;
            class81.field1361 = 30;
        } else if (class221.field3798 == 50) {
            int var3 = class209.method1464(class281.field4800, class53.field781, -90);
            int var4 = class208.method1458(6);
            if (var4 <= var3) {
                class81.field1361 = 35;
                class271.field4622 = class78.field1319;
                class221.field3798 = 60;
            } else {
                class271.field4622 = class254.method1772(new class62[] { class233.field4029, class42.method284(var3 * 100 / var4, -121), class74.field1197 }, 0);
                class81.field1361 = 35;
            }
        } else if (class221.field3798 == 60) {
            int var5 = class181.method1267((byte) 94, class53.field781);
            int var6 = class136.method1031(false);
            if (var5 < var6) {
                class271.field4622 = class254.method1772(new class62[] { class44.field664, class42.method284(var5 * 100 / var6, -116), class74.field1197 }, 0);
                class81.field1361 = 40;
            } else {
                class81.field1361 = 40;
                class271.field4622 = class92.field1511;
                class221.field3798 = 65;
            }
        } else if (class221.field3798 == 65) {
            for (int var23 = 0; var23 < 6; var23++) {
                class147 var24 = class193.field3246.method1946(10, this.getClass());
                while (var24.field2322 == 0) {
                    class99.method792(-1, 100L);
                }
                if (var24.field2322 == 1) {
                    break;
                }
                if (var23 == 5) {
                    this.method1438(true, "dll");
                    class118.field1983 = 1000;
                    return;
                }
                class99.method792(-1, 1000L);
            }
            int var25 = class154.method1117(class243.field4132, class97.field1596 * 2);
            if (var25 == 0) {
                class168.method1199(104, 104);
                class31.field427 = false;
                class30.method198(class281.field4800, false, class53.field781);
                class81.field1361 = 45;
                class271.field4622 = class101.field1665;
                class276.method1889(-128, 5);
                class221.field3798 = 70;
            } else {
                String var26 = class154.field2484;
                String var27 = class154.field2486;
                String var28 = "unknown";
                String var29 = var26.toLowerCase();
                if (var29.indexOf("microsoft") != -1) {
                    var28 = "vesa";
                } else if (var29.indexOf("nvidia") != -1) {
                    var28 = "nvidia";
                } else if (var29.indexOf("intel") != -1) {
                    var28 = "intel";
                } else if (var29.indexOf("s3") == -1) {
                    if (var29.indexOf("ati") != -1) {
                        var28 = "ati";
                    }
                } else if (var27.toLowerCase().indexOf("unichrome") == -1) {
                    var28 = "s3";
                } else {
                    var28 = "via_s3";
                }
                String var30 = this.method2048(class285.field4873 + " " + class285.field4882 + " " + class285.field4875, -10);
                String var31 = this.method2048(var26 + " " + var27, -10);
                this.method1435(-85, "caps_" + var28, "os=" + var30 + "&gcard=" + var31 + "&error_code=" + var25);
                class118.field1983 = 1000;
            }
        } else if (class221.field3798 == 70) {
            class300.field5148.method148(-126);
            byte var12 = 0;
            int var13 = var12 + class300.field5148.method156(true);
            class194.field3260.method148(-128);
            int var14 = var13 + class194.field3260.method156(true);
            class105.field1722.method148(-120);
            int var15 = var14 + class105.field1722.method156(true);
            class35.field470.method148(-119);
            int var16 = var15 + class35.field470.method156(true);
            class198.field3350.method148(-117);
            int var17 = var16 + class198.field3350.method156(true);
            class298.field5084.method148(-116);
            int var18 = var17 + class298.field5084.method156(true);
            class98.field1622.method148(-124);
            int var19 = var18 + class98.field1622.method156(true);
            class196.field3319.method148(-124);
            int var20 = var19 + class196.field3319.method156(true);
            class150.field2364.method148(-114);
            int var21 = var20 + class150.field2364.method156(true);
            class173.field2799.method148(-117);
            int var22 = var21 + class173.field2799.method156(true);
            if (var22 < 1000) {
                class271.field4622 = class254.method1772(new class62[] { class52.field737, class42.method284(var22 / 10, -128), class74.field1197 }, 0);
                class81.field1361 = 50;
            } else {
                class307.method2092(-60, class300.field5148);
                class119.method926((byte) -38, class300.field5148);
                class198.method1386(-1479, class300.field5148);
                class182.method1279(3, class300.field5148, class218.field3753);
                class228.method1613(false, class294.field5021, class218.field3753, class194.field3260);
                class155.method1144(class218.field3753, class35.field470, 1);
                class94.method758(class294.field5021, -107, class218.field3753, class198.field3350, class169.field2748);
                class53.method349(class300.field5148, (byte) 126);
                class152.method1092((byte) 54, class298.field5084, class200.field3382, class112.field1852);
                class277.method1893(class98.field1622, 1, class218.field3753);
                class107.method826(5863, class196.field3319);
                class252.method1758(98, class300.field5148);
                class77.method602(class218.field3753, class281.field4800, true, class53.field781, class37.field500);
                class287.method1967(class300.field5148, false);
                class8.method37(14665, class105.field1722);
                class288.method1970(32768, class150.field2364, new class39(), class173.field2799);
                class165.method1188(class150.field2364, (byte) 46, class173.field2799);
                class81.field1361 = 50;
                class271.field4622 = class110.field1786;
                class278.method1896((byte) 90);
                class221.field3798 = 80;
            }
        } else if (class221.field3798 == 80) {
            int var7 = class200.method1398(class53.field781, -1);
            int var8 = class30.method196(true);
            if (var7 >= var8) {
                class187.method1315(class53.field781, (byte) 117);
                class271.field4622 = class17.field159;
                class221.field3798 = 90;
                class81.field1361 = 60;
            } else {
                class271.field4622 = class254.method1772(new class62[] { class44.field666, class42.method284(var7 * 100 / var8, -121), class74.field1197 }, 0);
                class81.field1361 = 60;
            }
        } else {
            int var9 = 109 / ((76 - arg0) / 39);
            if (class221.field3798 == 90) {
                if (class203.field3429.method148(-114)) {
                    class29 var10 = new class29(class194.field3277, class203.field3429, class53.field781, 200, !class306.field5262);
                    class23.method107(var10);
                    if (field5162) {
                        class23.method104(0.7F);
                    } else {
                        if (class44.field662 == 1) {
                            class23.method104(0.9F);
                        }
                        if (class44.field662 == 2) {
                            class23.method104(0.8F);
                        }
                        if (class44.field662 == 3) {
                            class23.method104(0.7F);
                        }
                        if (class44.field662 == 4) {
                            class23.method104(0.6F);
                        }
                    }
                    class221.field3798 = 100;
                    class81.field1361 = 70;
                    class271.field4622 = class290.field4934;
                } else {
                    class271.field4622 = class254.method1772(new class62[] { class103.field1700, class42.method284(class203.field3429.method156(true), -121), class74.field1197 }, 0);
                    class81.field1361 = 70;
                }
            } else if (class221.field3798 == 100) {
                class221.field3798 = 110;
            } else if (class221.field3798 == 110) {
                class197.field3336 = new class1();
                class193.field3246.method1954(10, 0, class197.field3336);
                class271.field4622 = class156.field2513;
                class81.field1361 = 75;
                class221.field3798 = 120;
            } else if (class221.field3798 == 120) {
                if (class32.field440.method162(class35.field457, class275.field4694, 0)) {
                    class45 var11 = new class45(class32.field440.method139(class35.field457, class275.field4694, 10));
                    class306.method2089(81, var11);
                    class81.field1361 = 80;
                    class271.field4622 = class251.field4258;
                    class221.field3798 = 130;
                } else {
                    class271.field4622 = class254.method1772(new class62[] { class63.field954, class114.field1896 }, 0);
                    class81.field1361 = 80;
                }
            } else if (class221.field3798 == 130) {
                if (!class37.field500.method148(-112)) {
                    class271.field4622 = class254.method1772(new class62[] { class122.field2024, class42.method284(class37.field500.method156(true) * 3 / 4, -121), class74.field1197 }, 0);
                    class81.field1361 = 85;
                } else if (!class35.field471.method148(-111)) {
                    class271.field4622 = class254.method1772(new class62[] { class122.field2024, class42.method284(class35.field471.method156(true) / 10 + 75, -128), class74.field1197 }, 0);
                    class81.field1361 = 85;
                } else if (!class281.field4800.method148(-122)) {
                    class271.field4622 = class254.method1772(new class62[] { class122.field2024, class42.method284(class281.field4800.method156(true) / 20 + 85, -123), class74.field1197 }, 0);
                    class81.field1361 = 85;
                } else if (class275.field4718.method158(-102, class234.field4036)) {
                    class267.method1837(class108.field1748, class275.field4718, class220.field3788, 16174, class192.field3233, class270.field4594, class212.field3567);
                    class221.field3798 = 140;
                    class81.field1361 = 100;
                    class271.field4622 = class278.field4782;
                } else {
                    class271.field4622 = class254.method1772(new class62[] { class122.field2024, class42.method284((class275.field4718.method141(class234.field4036, true) / 10) + 90, -126), class74.field1197 }, 0);
                    class81.field1361 = 85;
                }
            } else if (class221.field3798 == 140) {
                class197.field3339 = class37.field500.method153((byte) 110, class62.field942);
                class113.field1874.method138(true, 79, false);
                class163.field2649.method138(true, -72, true);
                class53.field781.method138(true, -128, true);
                class281.field4800.method138(true, 119, true);
                class32.field440.method138(true, 88, true);
                class37.field500.method138(true, 100, true);
                class268.field4544 = true;
                class7.method33((byte) 99);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lsg;)I", line = 2869)
    public static final int method2058(class191 arg0) {
        class173 var1 = (class173) class183.field2929.method311((byte) 114, ((long) arg0.field3142 << 32) + (long) arg0.field3104);
        return var1 == null ? arg0.field3076 : var1.field2796;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2880)
    private final void method2059(int arg0) {
        if (arg0 != 1) {
            field5162 = false;
        }
        field5156++;
        class221.method1571(arg0 - 105, this);
        for (class99.field1628 = 0; class293.method1987(true) && class99.field1628 < 128; class99.field1628++) {
            class158.field2539[class99.field1628] = class246.field4182;
            class125.field2096[class99.field1628] = class73.field1125;
        }
        class277.field4757++;
        if (class301.field5183 != -1) {
            class200.method1404(0, 0, class306.field5258, 0, 0, false, class60.field878, class301.field5183);
        }
        class105.field1716++;
        int var2 = 19137023;
        label188: for (int var3 = 0; var3 < 32768; var3++) {
            class204 var4 = class301.field5186[var3];
            if (var4 != null) {
                byte var5 = var4.field3435.field4712;
                if ((var5 & 0x2) > 0 && var4.field3808 == 0 && Math.random() * 1000.0D < 10.0D) {
                    int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    if (var6 != 0 || var7 != 0) {
                        var4.field3828[0] = (var4.field3821 >> 7) + var6;
                        var4.field3846[0] = (var4.field3814 >> 7) + var7;
                        class250.field4244[class7.field85].method1552((byte) 17, false, var4.field3821 >> 7, 0, var4.method1101(true), var4.field3814 >> 7, var4.method1101(true));
                        if (var4.field3828[0] >= 0 && var4.field3828[0] <= (104 - var4.method1101(true)) && var4.field3846[0] >= 0 && var4.field3846[0] <= (104 - var4.method1101(true)) && class250.field4244[class7.field85].method1546(var4.field3814 >> 7, var4.field3846[0], var4.field3821 >> 7, (byte) 125, var4.field3828[0])) {
                            if (var4.method1101(true) > 1) {
                                for (int var8 = var4.field3828[0]; var4.field3828[0] + var4.method1101(true) > var8; var8++) {
                                    for (int var9 = var4.field3846[0]; var4.field3846[0] + var4.method1101(true) > var9; var9++) {
                                        if ((class250.field4244[class7.field85].field3756[var8][var9] & var2) != 0) {
                                            continue label188;
                                        }
                                    }
                                }
                            }
                            var4.field3808 = 1;
                        }
                    }
                }
                class155.method1149(var4, arg0 ^ 0xFFFFFFA5);
                class112.method877(var4, 0);
                class118.method917(var4, (byte) -6);
                class250.field4244[class7.field85].method1554(var4.field3821 >> 7, -1, false, var4.method1101(true), var4.method1101(true), var4.field3814 >> 7);
            }
        }
        if (class296.field5052 == 0 && class265.field4466 == 0) {
            if (class21.field220 == 2) {
                class237.method1672((byte) 102);
            } else {
                class298.method2013(true);
            }
            if (class258.field4351 >> 7 < 14 || (class258.field4351 >> 7) >= 90 || class215.field3647 >> 7 < 14 || class215.field3647 >> 7 >= 90) {
                class286.method1958(0);
            }
        }
        while (true) {
            class161 var10;
            class191 var11;
            class191 var12;
            do {
                var10 = (class161) class75.field1220.method329(25);
                if (var10 == null) {
                    while (true) {
                        class161 var13;
                        class191 var14;
                        class191 var15;
                        do {
                            var13 = (class161) class125.field2072.method329(25);
                            if (var13 == null) {
                                while (true) {
                                    class161 var16;
                                    class191 var17;
                                    class191 var18;
                                    do {
                                        var16 = (class161) class116.field1945.method329(arg0 + 24);
                                        if (var16 == null) {
                                            if (class164.field2674 != null) {
                                                class90.method673(arg0 ^ 0x1);
                                            }
                                            if (class133.field2174 != null && class133.field2174.field2322 == 1) {
                                                if (class133.field2174.field2323 != null) {
                                                    class300.method2044(class248.field4218, class200.field3390, 99);
                                                }
                                                class248.field4218 = null;
                                                class200.field3390 = false;
                                                class133.field2174 = null;
                                            }
                                            return;
                                        }
                                        var17 = var16.field2597;
                                        if (var17.field3104 < 0) {
                                            break;
                                        }
                                        var18 = class1.method2(var17.field3074, (byte) -37);
                                    } while (var18 == null || var18.field3180 == null || var18.field3180.length <= var17.field3104 || var18.field3180[var17.field3104] != var17);
                                    class262.method1818(var16, 71);
                                }
                            }
                            var14 = var13.field2597;
                            if (var14.field3104 < 0) {
                                break;
                            }
                            var15 = class1.method2(var14.field3074, (byte) -37);
                        } while (var15 == null || var15.field3180 == null || var14.field3104 >= var15.field3180.length || var15.field3180[var14.field3104] != var14);
                        class262.method1818(var13, arg0 ^ 0xFFFFFF8F);
                    }
                }
                var11 = var10.field2597;
                if (var11.field3104 < 0) {
                    break;
                }
                var12 = class1.method2(var11.field3074, (byte) -37);
            } while (var12 == null || var12.field3180 == null || var11.field3104 >= var12.field3180.length || var12.field3180[var11.field3104] != var11);
            class262.method1818(var10, 28);
        }
    }
}
