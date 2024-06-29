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
public class client extends class277 {

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Lbd;")
    public static class162 field1885 = class17.method142(0, "hint_mapedge");

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lbd;")
    private static class162 field1890 = class17.method142(0, "Allocated memory");

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lbd;")
    public static class162 field1896 = field1890;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Lli;")
    public static class18 field1884 = new class18();

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lbd;")
    public static class162 field1904 = class17.method142(0, "(R");

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lbd;")
    public static class162 field1905 = class17.method142(0, "leuchten2:");

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lbd;")
    private static class162 field1908 = class17.method142(0, "red:");

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lbd;")
    public static class162 field1907 = field1908;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lbd;")
    public static class162 field1901 = field1908;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lib;")
    public static class28 field1903;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
    public static boolean field1909;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    public static int[] field1902;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lbd;")
    public static class162[] field1906;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 26)
    private final void method849(int arg0) {
        for (class209.field3529 = 0; class27.method220(25039) && class209.field3529 < 128; class209.field3529++) {
            class23.field393[class209.field3529] = class261.field4351;
            class56.field878[class209.field3529] = class308.field5174;
        }
        field1899++;
        class149.field2680++;
        if (arg0 != -2) {
            this.init();
        }
        if (class265.field4412 != -1) {
            class255.method1764(class252.field4205, 0, class251.field4201, 0, class265.field4412, 0, -1803, 0);
        }
        class284.field4808++;
        if (class117.field2159) {
            int var2 = 19137023;
            label187: for (int var3 = 0; var3 < 32768; var3++) {
                class60 var4 = class204.field3446[var3];
                if (var4 != null) {
                    byte var5 = var4.field926.field1480;
                    if ((var5 & 0x2) > 0 && var4.field5006 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field5050[0] = (var4.field5013 >> 7) + var6;
                            var4.field5034[0] = (var4.field5047 >> 7) + var7;
                            class267.field4473[class157.field2765].method1361(0, false, var4.field5013 >> 7, var4.field5047 >> 7, var4.method293((byte) 25), var4.method293((byte) 25), true);
                            if (var4.field5050[0] >= 0 && var4.field5050[0] <= (104 - var4.method293((byte) 25)) && var4.field5034[0] >= 0 && var4.field5034[0] <= 104 - var4.method293((byte) 25) && class267.field4473[class157.field2765].method1358(var4.field5047 >> 7, var4.field5013 >> 7, var4.field5034[0], (byte) 125, var4.field5050[0])) {
                                if (var4.method293((byte) 25) > 1) {
                                    for (int var8 = var4.field5050[0]; (var4.field5050[0] + var4.method293((byte) 25)) > var8; var8++) {
                                        for (int var9 = var4.field5034[0]; (var4.field5034[0] + var4.method293((byte) 25)) > var9; var9++) {
                                            if ((class267.field4473[class157.field2765].field3061[var8][var9] & var2) != 0) {
                                                continue label187;
                                            }
                                        }
                                    }
                                }
                                var4.field5006 = 1;
                            }
                        }
                    }
                    class256.method1767(-128, var4);
                    class64.method438(true, var4);
                    class61.method414(var4, (byte) 81);
                    class267.field4473[class157.field2765].method1355(false, true, var4.method293((byte) 25), var4.field5013 >> 7, var4.field5047 >> 7, var4.method293((byte) 25));
                }
            }
        }
        if (!class117.field2159) {
            class239.method1687(64);
        } else if (class131.field2364 == 0 && class87.field1556 == 0) {
            if (class302.field5085 == 2) {
                class34.method269(-76);
            } else {
                class274.method1861(true);
            }
            if (class160.field2800 >> 7 < 14 || class160.field2800 >> 7 >= 90 || (class67.field1083 >> 7) < 14 || (class67.field1083 >> 7) >= 90) {
                class160.method1228(arg0 ^ 0xFFFFFFC9);
            }
        }
        while (true) {
            class180 var10;
            class78 var17;
            class78 var18;
            do {
                var10 = (class180) class39.field619.method170(117);
                if (var10 == null) {
                    while (true) {
                        class180 var11;
                        class78 var12;
                        class78 var13;
                        do {
                            var11 = (class180) class96.field1750.method170(arg0 + 95);
                            if (var11 == null) {
                                while (true) {
                                    class180 var14;
                                    class78 var15;
                                    class78 var16;
                                    do {
                                        var14 = (class180) class292.field4920.method170(118);
                                        if (var14 == null) {
                                            if (class17.field284 != null) {
                                                class153.method1191((byte) -56);
                                            }
                                            if (class177.field3041 != null && class177.field3041.field2934 == 1) {
                                                if (class177.field3041.field2933 != null) {
                                                    class72.method520(class307.field5157, arg0 ^ 0x74, class244.field4065);
                                                }
                                                class244.field4065 = false;
                                                class307.field5157 = null;
                                                class177.field3041 = null;
                                            }
                                            return;
                                        }
                                        var15 = var14.field3099;
                                        if (var15.field1276 < 0) {
                                            break;
                                        }
                                        var16 = class61.method419((byte) 28, var15.field1371);
                                    } while (var16 == null || var16.field1363 == null || var15.field1276 >= var16.field1363.length || var16.field1363[var15.field1276] != var15);
                                    class31.method257(-32581, var14);
                                }
                            }
                            var12 = var11.field3099;
                            if (var12.field1276 < 0) {
                                break;
                            }
                            var13 = class61.method419((byte) 28, var12.field1371);
                        } while (var13 == null || var13.field1363 == null || var12.field1276 >= var13.field1363.length || var13.field1363[var12.field1276] != var12);
                        class31.method257(arg0 - 32579, var11);
                    }
                }
                var17 = var10.field3099;
                if (var17.field1276 < 0) {
                    break;
                }
                var18 = class61.method419((byte) 28, var17.field1371);
            } while (var18 == null || var18.field1363 == null || var18.field1363.length <= var17.field1276 || var18.field1363[var17.field1276] != var17);
            class31.method257(-32581, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 263)
    public static final void method850(int arg0, int arg1) {
        field1894++;
        if (!class12.method104(arg0, 571329488)) {
            return;
        }
        if (arg1 != 21850) {
            field1902 = (int[]) null;
        }
        class78[] var2 = class95.field1739[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class78 var4 = var2[var3];
            if (var4 != null) {
                var4.field1288 = 0;
                var4.field1270 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 312)
    private final void method851(int arg0) {
        boolean var2 = class55.field863.method1691(74);
        field1888++;
        if (!var2) {
            this.method860(0);
        }
        if (arg0 != 15) {
            field1885 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 352)
    public static void method852(byte arg0) {
        field1896 = null;
        if (arg0 != -70) {
            field1896 = (class162) null;
        }
        field1906 = null;
        field1901 = null;
        field1884 = null;
        field1905 = null;
        field1907 = null;
        field1890 = null;
        field1908 = null;
        field1903 = null;
        field1885 = null;
        field1902 = null;
        field1904 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 373)
    public final void method853(byte arg0) {
        field1889++;
        if (class262.field4380 == 1000) {
            return;
        }
        boolean var2 = class133.method1051(22050);
        if (var2 && class127.field2307 && class268.field4484 != null) {
            class268.field4484.method466((byte) -94);
        }
        if ((class262.field4380 == 30 || class262.field4380 == 10) && (class180.field3089 || class82.field1432 != 0L && class82.field1432 < class300.method2048((byte) 18))) {
            class266.method1822((byte) -35, class204.field3452, class138.field2465, class251.method1754((byte) -126), class180.field3089);
        }
        if (class168.field2950 == null) {
            Container var3;
            if (class168.field2950 != null) {
                var3 = class168.field2950;
            } else if (class95.field1740 == null) {
                var3 = field1903.field469;
            } else {
                var3 = class95.field1740;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class95.field1740 == var3) {
                Insets var6 = class95.field1740.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class194.field3273 != var4 || class212.field3562 != var5) {
                if (class28.field472.startsWith("mac")) {
                    class212.field3562 = var5;
                    class194.field3273 = var4;
                } else {
                    class91.method690((byte) 20);
                }
                class82.field1432 = class300.method2048((byte) 18) + 500L;
            }
        }
        if (class168.field2950 != null && !class141.field2498 && (class262.field4380 == 30 || class262.field4380 == 10)) {
            class266.method1822((byte) -35, -1, -1, class258.field4296, false);
        }
        boolean var7 = false;
        if (class238.field3958) {
            class238.field3958 = false;
            var7 = true;
        }
        if (arg0 > -53) {
            this.method854(109, -25);
        }
        if (var7) {
            class240.method1702(0);
        }
        if (class117.field2159) {
            for (int var8 = 0; var8 < 100; var8++) {
                class73.field1159[var8] = true;
            }
        }
        if (class262.field4380 == 0) {
            class172.method1317(var7, class40.field654, class220.field3682, (Color) null, 2);
        } else if (class262.field4380 == 5) {
            class291.method2016(false, (byte) 104, class207.field3507);
        } else if (class262.field4380 == 10) {
            class83.method646(0);
        } else if (class262.field4380 == 25 || class262.field4380 == 28) {
            if (class63.field984 == 1) {
                if (class259.field4321 < class32.field529) {
                    class259.field4321 = class32.field529;
                }
                int var10 = (class259.field4321 - class32.field529) * 50 / class259.field4321;
                class94.method706(class135.method1062(new class162[] { class235.field3934, class268.field4486, class156.method1212(10, var10), class114.field2036 }, true), -116, false);
            } else if (class63.field984 == 2) {
                if (class105.field1914 < class80.field1400) {
                    class105.field1914 = class80.field1400;
                }
                int var9 = ((class105.field1914 - class80.field1400) * 50 / class105.field1914) + 50;
                class94.method706(class135.method1062(new class162[] { class235.field3934, class268.field4486, class156.method1212(10, var9), class114.field2036 }, true), 40, false);
            } else {
                class94.method706(class235.field3934, 114, false);
            }
        } else if (class262.field4380 == 30) {
            class302.method2059((byte) -127);
        } else if (class262.field4380 == 40) {
            class94.method706(class135.method1062(new class162[] { class298.field4983, class273.field4540, class260.field4329 }, true), -123, false);
        }
        if (class117.field2159 && class262.field4380 != 0) {
            class117.method965();
            for (int var17 = 0; var17 < class258.field4293; var17++) {
                class252.field4211[var17] = false;
            }
        } else if ((class262.field4380 == 30 || class262.field4380 == 10) && class240.field3982 == 0 && !var7) {
            try {
                Graphics var11 = class308.field5173.getGraphics();
                for (int var12 = 0; var12 < class258.field4293; var12++) {
                    if (class252.field4211[var12]) {
                        class139.field2484.method12(class111.field2015[var12], var11, class283.field4799[var12], class214.field3593[var12], (byte) -23, class230.field3834[var12]);
                        class252.field4211[var12] = false;
                    }
                }
            } catch (Exception var19) {
                class308.field5173.repaint();
            }
        } else if (class262.field4380 != 0) {
            try {
                Graphics var14 = class308.field5173.getGraphics();
                class139.field2484.method10((byte) 86, var14, 0, 0);
                for (int var15 = 0; var15 < class258.field4293; var15++) {
                    class252.field4211[var15] = false;
                }
            } catch (Exception var18) {
                class308.field5173.repaint();
            }
        }
        if (class257.field4262) {
            class70.method507(5);
        }
        if (class25.field413 && class262.field4380 == 10 && class265.field4412 != -1) {
            class25.field413 = false;
            class27.method217(field1903, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V", line = 593)
    private final void method854(int arg0, int arg1) {
        field1893++;
        class289.field4880 = 0;
        class55.field863.field4010++;
        class55.field863.field4011 = arg0;
        class256.field4234 = null;
        if (arg1 == -30128) {
            class63.field990 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 614)
    public final void method855(boolean arg0) {
        method852((byte) -70);
        class162.method1271(48);
        class90.method684(-117);
        class177.method1341((byte) -112);
        field1898++;
        class32.method262((byte) -59);
        class277.method1897(-89);
        class117.method940();
        class237.method1681(1);
        class86.method655((byte) 1);
        class73.method527(-99);
        class222.method1611((byte) -94);
        class94.method728((byte) -3);
        class267.method1825((byte) 127);
        class240.method1705(6828);
        class298.method2047((byte) 88);
        class173.method1328(-124);
        class23.method193(85);
        class143.method1151(-22667);
        class258.method1778(6440);
        class315.method2148((byte) 95);
        class209.method1534(1);
        class60.method412(0);
        class47.method343(true);
        class179.method1368(0);
        class97.method778((byte) 50);
        class39.method295(-7588);
        class18.method162(0);
        class235.method1665(-1);
        class206.method1522((byte) 127);
        class171.method1315(-2);
        class122.method986((byte) -57);
        class71.method519(-10728);
        class280.method1923(-981);
        class66.method460(4);
        class134.method1060((byte) 124);
        class200.method1493((byte) -53);
        class142.method1116((byte) 1);
        class301.method2054((byte) 25);
        class225.method1626(arg0);
        class183.method1387((byte) 121);
        class83.method637((byte) 2);
        class172.method1320(2);
        class151.method1181(false);
        class53.method372((byte) -94);
        class288.method1997(64);
        class308.method2089((byte) 100);
        class74.method532((byte) 91);
        class158.method1224(-90);
        class244.method1725(5);
        class84.method651(true);
        class89.method677((byte) -57);
        class212.method1553((byte) 124);
        class119.method972(-5826);
        class311.method2107(-118);
        class279.method1918((byte) -82);
        class108.method877();
        class56.method395((byte) -123);
        class195.method1451();
        class128.method1033((byte) 24);
        class100.method811();
        class116.method931((byte) -112);
        class11.method93();
        class247.method1737(-11764);
        class251.method1756(-1);
        class262.method1805(124);
        class141.method1100(1);
        class41.method302();
        class187.method1405(false);
        class264.method1811(0);
        class139.method1082((byte) 122);
        class34.method271(-17251);
        class276.method1888();
        class168.method1309(-1);
        class233.method1658(10);
        class69.method499();
        class260.method1793(-1);
        class303.method2065(0);
        class167.method1307(124);
        class215.method1563();
        class221.method1600();
        class196.method1472(28244);
        class105.method867(-1);
        class256.method1773((byte) -118);
        class127.method1025((byte) 9);
        class203.method1513(106);
        class316.method2175();
        class252.method1758((byte) -120);
        class4.method17((byte) 54);
        class278.method1909((byte) -41);
        class216.method1572((byte) -84);
        class182.method1380(7);
        class266.method1824((byte) 51);
        class112.method898(true);
        class49.method360(3);
        class123.method993(94);
        class268.method1836((byte) 58);
        class45.method327((byte) 115);
        class297.method2036(-103);
        class54.method382(false);
        class42.method313(!arg0);
        class70.method511(-1);
        class194.method1436(arg0);
        class217.method1579(!arg0);
        class313.method2134((byte) 77);
        class87.method656((byte) -84);
        class68.method484((byte) -63);
        class88.method667(115);
        class17.method149(0);
        class250.method1753(-28);
        class29.method243(-1);
        class312.method2125();
        class204.method1517(13835);
        class211.method1551(11);
        class178.method1348(-1);
        class259.method1791(8);
        class223.method1614((byte) -59);
        class210.method1543();
        class213.method1557(arg0);
        class146.method1166(-124);
        class20.method178((byte) 12);
        class180.method1373(238);
        class255.method1765((byte) 111);
        class160.method1229(0);
        class26.method211();
        class43.method318((byte) 90);
        class22.method181((byte) 6);
        class273.method1855(false);
        class138.method1078((byte) -27);
        class147.method1167(-1);
        class184.method1393((byte) -118);
        class80.method617(false);
        class164.method1297();
        class282.method1958(0);
        class125.method1014(256);
        class46.method329(5846);
        class271.method1849();
        class214.method1558((byte) -107);
        class287.method1994();
        class226.method1630();
        class15.method120((byte) -27);
        class283.method1961(960);
        class156.method1215(-107);
        class63.method432(true);
        class101.method835(0);
        class64.method436(-118);
        class239.method1689(-127);
        class181.method1375((byte) 4);
        class115.method907((byte) -13);
        class234.method1664();
        class3.method16((byte) -109);
        class16.method136();
        class284.method1963((byte) 84);
        class257.method1774(0);
        class110.method890(80);
        class8.method47(-1);
        class285.method1967(-1);
        class188.method1408((byte) 76);
        class57.method400((byte) -54);
        class302.method2057(50);
        class305.method2079(1024);
        class224.method1620(false);
        class93.method701(true);
        class120.method980(-569);
        class48.method355(31323);
        class304.method2070(-10140);
        class238.method1682(1);
        class102.method840(100);
        class220.method1586(-44);
        class242.method1716((byte) 68);
        class61.method416(-92);
        class202.method1505(0);
        class13.method115(20257);
        class193.method1425();
        class248.method1740((byte) -118);
        class72.method523(0);
        class95.method765((byte) 8);
        class10.method62((byte) 126);
        class9.method55(0);
        class137.method1072(-67);
        class192.method1421();
        class155.method1206();
        class52.method371();
        class82.method625(-2329);
        class126.method1018((byte) 125);
        class30.method252(-99);
        class149.method1179(-128);
        class124.method1007();
        class174.method1330();
        class7.method35(-15457);
        class25.method203(2048);
        class92.method699(-106);
        class58.method405((byte) -73);
        class296.method2028((byte) -107);
        class243.method1722(238);
        class286.method1970(-16777216);
        class1.method7((byte) 82);
        class144.method1162((byte) 51);
        class12.method107(0);
        class205.method1518((byte) -67);
        class186.method1402(3310);
        class165.method1299((byte) 85);
        class306.method2082(6);
        class121.method981();
        class36.method280();
        class6.method31((byte) 97);
        class314.method2143(true);
        class51.method370((byte) -128);
        class19.method173(false);
        class157.method1220((byte) -89);
        class35.method278(false);
        class190.method1418(false);
        class265.method1819(1);
        class131.method1048((byte) -90);
        class231.method1652(arg0);
        class263.method1807(6817);
        class55.method387((byte) 64);
        class274.method1860(83);
        class261.method1799((byte) -68);
        class163.method1293((byte) 42);
        class245.method1730(53);
        class289.method2003((byte) -111);
        class50.method363(true);
        class275.method1867(0);
        class307.method2085(-4861);
        class27.method213(-124);
        class104.method847((byte) 73);
        class270.method1848(-126);
        class81.method620((byte) -109);
        class292.method2020((byte) -106);
        class106.method868(-22826);
        class228.method1634(3);
        class207.method1526(!arg0);
        class77.method581((byte) 82);
        class67.method481(109);
        class199.method1487((byte) -98);
        class198.method1480(-17909);
        class208.method1527(88);
        class295.method2026(51);
        class218.method1582(255);
        class136.method1070(8);
        class229.method1635(158);
        class185.method1399((byte) 89);
        class230.method1646(128);
        class135.method1065(false);
        class153.method1196(-19725);
        class293.method2023(-8193);
        class114.method904(111);
        class291.method2017((byte) -74);
        class31.method254(200000);
        class129.method1037(-5417);
        class40.method298(3924);
        class98.method786(-122);
        class133.method1052(255);
        class201.method1501((byte) -70);
        class290.method2012(-54);
        class109.method884(124);
        class154.method1199((byte) -67);
        class91.method691((byte) 79);
        class317.method2180((byte) 73);
        class111.method893((byte) 116);
        class62.method423(-106);
        class96.method774(56);
        class269.method1843(110);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 887)
    public final void method856(byte arg0) {
        if (arg0 != -20) {
            this.method851(47);
        }
        field1897++;
        if (class262.field4380 == 1000) {
            return;
        }
        class90.field1598++;
        if ((class90.field1598 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class288.field4855 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class181.field3111.setSeed((long) class288.field4855);
        }
        this.method851(15);
        if (class157.field2762 != null) {
            class157.field2762.method1327(0);
        }
        class50.method364(arg0 + 94);
        class58.method401((byte) 62);
        class77.method580((byte) -123);
        class148.method1177(-1225615508);
        if (class117.field2159) {
            class41.method305();
        }
        if (class264.field4406 != null) {
            int var3 = class264.field4406.method201(true);
            class157.field2766 = var3;
        }
        if (class262.field4380 == 0) {
            this.method859((byte) 90);
            class220.method1590(0);
        } else if (class262.field4380 == 5) {
            this.method859((byte) 90);
            class220.method1590(0);
        } else if (class262.field4380 == 25 || class262.field4380 == 28) {
            class304.method2072(100);
        }
        if (class262.field4380 == 10) {
            this.method849(-2);
            class245.method1732((byte) -74);
            class203.method1509(arg0 + 94);
            class247.method1736(-26538);
        } else if (class262.field4380 == 30) {
            class256.method1771((byte) -126);
        } else if (class262.field4380 == 40) {
            class247.method1736(arg0 - 26518);
            if (class217.field3620 != -3) {
                if (class217.field3620 == 15) {
                    class116.method915(0);
                } else if (class217.field3620 != 2) {
                    class297.method2034(arg0 + 20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lob;IIIIIII)V", line = 983)
    public static final void method857(class78[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class78 var9 = arg0[var8];
            if (var9 != null && var9.field1371 == arg1 && (!var9.field1229 || var9.field1231 == 0 || var9.field1332 || method861(var9) != 0 || class205.field3464 == var9 || var9.field1313 == 1338) && (!var9.field1229 || !method864(var9))) {
                int var10 = var9.field1377 + arg6;
                int var11 = var9.field1289 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1231 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1340 + var10;
                    int var17 = var9.field1367 + var11;
                    if (var9.field1231 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class17.field284 == var9) {
                    class230.field3839 = true;
                    class207.field3499 = var10;
                    class258.field4300 = var11;
                }
                if (!var9.field1229 || var12 < var14 && var13 < var15) {
                    if (var9.field1231 == 0) {
                        if (!var9.field1229 && method864(var9) && class289.field4863 != var9) {
                            continue;
                        }
                        if (var9.field1263 && class109.field1961 >= var12 && class274.field4554 >= var13 && class109.field1961 < var14 && class274.field4554 < var15) {
                            for (class180 var18 = (class180) class292.field4920.method169(-120); var18 != null; var18 = (class180) class292.field4920.method165((byte) -101)) {
                                if (var18.field3098) {
                                    var18.method1183(false);
                                }
                            }
                            if (class231.field3861 == 0) {
                                class17.field284 = null;
                                class205.field3464 = null;
                            }
                            class168.field2948 = false;
                            class123.field2236 = null;
                        }
                    }
                    if (var9.field1229) {
                        boolean var19;
                        if (class109.field1961 >= var12 && class274.field4554 >= var13 && class109.field1961 < var14 && class274.field4554 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class92.field1628 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class238.field3954 == 1 && class153.field2721 >= var12 && class183.field3158 >= var13 && class153.field2721 < var14 && class183.field3158 < var15) {
                            var21 = true;
                        }
                        if (class209.field3529 > 0 && var9.field1260 != null) {
                            for (int var22 = 0; var22 < var9.field1260.length; var22++) {
                                for (int var23 = 0; var23 < class209.field3529; var23++) {
                                    int var24 = var9.field1260[var22] & 0xFF;
                                    if (class23.field393[var23] == var24) {
                                        if (var9.field1238 != null) {
                                            byte var25 = var9.field1238[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class63.field991[86] || (var25 & 0x1) != 0 && !class63.field991[82] || (var25 & 0x4) != 0 && !class63.field991[81])) {
                                                continue;
                                            }
                                        }
                                        class304.method2076((byte) -101, var22 + 1, var9.field1235, class244.field4053, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class126.method1021(var9, class153.field2721 - var10, class183.field3158 - var11, true);
                        }
                        if (class17.field284 != null && class17.field284 != var9 && var19 && class167.method1303(-7175, method861(var9))) {
                            class277.field4635 = var9;
                        }
                        if (class205.field3464 == var9) {
                            class58.field909 = true;
                            class84.field1513 = var10;
                            class46.field737 = var11;
                        }
                        if (var9.field1332 || var9.field1313 != 0) {
                            if (var19 && class157.field2766 != 0 && var9.field1265 != null) {
                                class180 var26 = new class180();
                                var26.field3098 = true;
                                var26.field3099 = var9;
                                var26.field3083 = class157.field2766;
                                var26.field3102 = var9.field1265;
                                class292.field4920.method167(false, var26);
                            }
                            if (class17.field284 != null || class115.field2041 != null || class32.field539 || var9.field1313 != 1400 && class168.field2948) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1313 != 0) {
                                if (var9.field1313 == 1337) {
                                    class171.field2970 = var9;
                                    class55.method386(0, var9);
                                    continue;
                                }
                                if (var9.field1313 == 1338) {
                                    if (var21) {
                                        class123.field2236 = var9;
                                        class170.field2958 = class153.field2721 - var10;
                                        class220.field3681 = class183.field3158 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1313 == 1400) {
                                    class314.field5304 = var9;
                                    if (var21) {
                                        if (class63.field991[82] && class83.field1438 > 0) {
                                            int var27 = (int) ((double) (class153.field2721 - var10 - var9.field1340 / 2) * 2.0D / (double) class149.field2689);
                                            int var28 = (int) ((double) (class183.field3158 - var11 - var9.field1367 / 2) * 2.0D / (double) class149.field2689);
                                            int var29 = class136.field2420 + var27;
                                            int var30 = class278.field4682 + var28;
                                            int var31 = class290.field4893 + var29;
                                            int var32 = class9.field114 + class87.field1536 - var30 - 1;
                                            class104.method848(0, var32, 60, var31);
                                            class56.method398((byte) -78);
                                            continue;
                                        }
                                        class168.field2948 = true;
                                        class250.field4171 = class109.field1961;
                                        class30.field506 = class274.field4554;
                                        class58.field916 = class136.field2420;
                                        class317.field5336 = class278.field4682;
                                        continue;
                                    }
                                    if (var20 && class168.field2948) {
                                        class248.method1743((int) ((double) (class250.field4171 - class109.field1961) * 2.0D / (double) class267.field4447) + class58.field916, (byte) 79);
                                        class8.method51(122, (int) ((double) (class30.field506 - class274.field4554) * 2.0D / (double) class267.field4447) + class317.field5336);
                                        continue;
                                    }
                                    class168.field2948 = false;
                                    continue;
                                }
                                if (var9.field1313 == 1401) {
                                    if (var20) {
                                        class314.method2145(var9.field1367, class274.field4554 - var11, var9.field1340, (byte) -31, class109.field1961 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field1313 == 1402) {
                                    if (!class117.field2159) {
                                        class55.method386(0, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field1324 && var21) {
                                var9.field1324 = true;
                                if (var9.field1355 != null) {
                                    class180 var33 = new class180();
                                    var33.field3098 = true;
                                    var33.field3099 = var9;
                                    var33.field3090 = class153.field2721 - var10;
                                    var33.field3083 = class183.field3158 - var11;
                                    var33.field3102 = var9.field1355;
                                    class292.field4920.method167(false, var33);
                                }
                            }
                            if (var9.field1324 && var20 && var9.field1221 != null) {
                                class180 var34 = new class180();
                                var34.field3098 = true;
                                var34.field3099 = var9;
                                var34.field3090 = class109.field1961 - var10;
                                var34.field3083 = class274.field4554 - var11;
                                var34.field3102 = var9.field1221;
                                class292.field4920.method167(false, var34);
                            }
                            if (var9.field1324 && !var20) {
                                var9.field1324 = false;
                                if (var9.field1308 != null) {
                                    class180 var35 = new class180();
                                    var35.field3098 = true;
                                    var35.field3099 = var9;
                                    var35.field3090 = class109.field1961 - var10;
                                    var35.field3083 = class274.field4554 - var11;
                                    var35.field3102 = var9.field1308;
                                    class96.field1750.method167(false, var35);
                                }
                            }
                            if (var20 && var9.field1383 != null) {
                                class180 var36 = new class180();
                                var36.field3098 = true;
                                var36.field3099 = var9;
                                var36.field3090 = class109.field1961 - var10;
                                var36.field3083 = class274.field4554 - var11;
                                var36.field3102 = var9.field1383;
                                class292.field4920.method167(false, var36);
                            }
                            if (!var9.field1382 && var19) {
                                var9.field1382 = true;
                                if (var9.field1337 != null) {
                                    class180 var37 = new class180();
                                    var37.field3098 = true;
                                    var37.field3099 = var9;
                                    var37.field3090 = class109.field1961 - var10;
                                    var37.field3083 = class274.field4554 - var11;
                                    var37.field3102 = var9.field1337;
                                    class292.field4920.method167(false, var37);
                                }
                            }
                            if (var9.field1382 && var19 && var9.field1352 != null) {
                                class180 var38 = new class180();
                                var38.field3098 = true;
                                var38.field3099 = var9;
                                var38.field3090 = class109.field1961 - var10;
                                var38.field3083 = class274.field4554 - var11;
                                var38.field3102 = var9.field1352;
                                class292.field4920.method167(false, var38);
                            }
                            if (var9.field1382 && !var19) {
                                var9.field1382 = false;
                                if (var9.field1379 != null) {
                                    class180 var39 = new class180();
                                    var39.field3098 = true;
                                    var39.field3099 = var9;
                                    var39.field3090 = class109.field1961 - var10;
                                    var39.field3083 = class274.field4554 - var11;
                                    var39.field3102 = var9.field1379;
                                    class96.field1750.method167(false, var39);
                                }
                            }
                            if (var9.field1358 != null) {
                                class180 var40 = new class180();
                                var40.field3099 = var9;
                                var40.field3102 = var9.field1358;
                                class39.field619.method167(false, var40);
                            }
                            if (var9.field1380 != null && class267.field4458 > var9.field1296) {
                                if (var9.field1319 == null || class267.field4458 - var9.field1296 > 32) {
                                    class180 var45 = new class180();
                                    var45.field3099 = var9;
                                    var45.field3102 = var9.field1380;
                                    class292.field4920.method167(false, var45);
                                } else {
                                    label548: for (int var41 = var9.field1296; var41 < class267.field4458; var41++) {
                                        int var42 = class239.field3972[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1319.length; var43++) {
                                            if (var9.field1319[var43] == var42) {
                                                class180 var44 = new class180();
                                                var44.field3099 = var9;
                                                var44.field3102 = var9.field1380;
                                                class292.field4920.method167(false, var44);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1296 = class267.field4458;
                            }
                            if (var9.field1302 != null && class72.field1146 > var9.field1247) {
                                if (var9.field1336 == null || class72.field1146 - var9.field1247 > 32) {
                                    class180 var50 = new class180();
                                    var50.field3099 = var9;
                                    var50.field3102 = var9.field1302;
                                    class292.field4920.method167(false, var50);
                                } else {
                                    label524: for (int var46 = var9.field1247; var46 < class72.field1146; var46++) {
                                        int var47 = class68.field1100[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1336.length; var48++) {
                                            if (var9.field1336[var48] == var47) {
                                                class180 var49 = new class180();
                                                var49.field3099 = var9;
                                                var49.field3102 = var9.field1302;
                                                class292.field4920.method167(false, var49);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field1247 = class72.field1146;
                            }
                            if (var9.field1303 != null && class223.field3733 > var9.field1234) {
                                if (var9.field1378 == null || class223.field3733 - var9.field1234 > 32) {
                                    class180 var55 = new class180();
                                    var55.field3099 = var9;
                                    var55.field3102 = var9.field1303;
                                    class292.field4920.method167(false, var55);
                                } else {
                                    label500: for (int var51 = var9.field1234; var51 < class223.field3733; var51++) {
                                        int var52 = class82.field1434[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field1378.length; var53++) {
                                            if (var9.field1378[var53] == var52) {
                                                class180 var54 = new class180();
                                                var54.field3099 = var9;
                                                var54.field3102 = var9.field1303;
                                                class292.field4920.method167(false, var54);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1234 = class223.field3733;
                            }
                            if (var9.field1333 != null && class207.field3505 > var9.field1292) {
                                if (var9.field1369 == null || class207.field3505 - var9.field1292 > 32) {
                                    class180 var60 = new class180();
                                    var60.field3099 = var9;
                                    var60.field3102 = var9.field1333;
                                    class292.field4920.method167(false, var60);
                                } else {
                                    label476: for (int var56 = var9.field1292; var56 < class207.field3505; var56++) {
                                        int var57 = class292.field4917[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field1369.length; var58++) {
                                            if (var9.field1369[var58] == var57) {
                                                class180 var59 = new class180();
                                                var59.field3099 = var9;
                                                var59.field3102 = var9.field1333;
                                                class292.field4920.method167(false, var59);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1292 = class207.field3505;
                            }
                            if (var9.field1222 != null && class70.field1125 > var9.field1376) {
                                if (var9.field1293 == null || class70.field1125 - var9.field1376 > 32) {
                                    class180 var65 = new class180();
                                    var65.field3099 = var9;
                                    var65.field3102 = var9.field1222;
                                    class292.field4920.method167(false, var65);
                                } else {
                                    label452: for (int var61 = var9.field1376; var61 < class70.field1125; var61++) {
                                        int var62 = class25.field411[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1293.length; var63++) {
                                            if (var9.field1293[var63] == var62) {
                                                class180 var64 = new class180();
                                                var64.field3099 = var9;
                                                var64.field3102 = var9.field1222;
                                                class292.field4920.method167(false, var64);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field1376 = class70.field1125;
                            }
                            if (class128.field2316 > var9.field1364 && var9.field1311 != null) {
                                class180 var66 = new class180();
                                var66.field3099 = var9;
                                var66.field3102 = var9.field1311;
                                class292.field4920.method167(false, var66);
                            }
                            if (class149.field2681 > var9.field1364 && var9.field1298 != null) {
                                class180 var67 = new class180();
                                var67.field3099 = var9;
                                var67.field3102 = var9.field1298;
                                class292.field4920.method167(false, var67);
                            }
                            if (class127.field2313 > var9.field1364 && var9.field1279 != null) {
                                class180 var68 = new class180();
                                var68.field3099 = var9;
                                var68.field3102 = var9.field1279;
                                class292.field4920.method167(false, var68);
                            }
                            if (class233.field3887 > var9.field1364 && var9.field1321 != null) {
                                class180 var69 = new class180();
                                var69.field3099 = var9;
                                var69.field3102 = var9.field1321;
                                class292.field4920.method167(false, var69);
                            }
                            if (class268.field4490 > var9.field1364 && var9.field1285 != null) {
                                class180 var70 = new class180();
                                var70.field3099 = var9;
                                var70.field3102 = var9.field1285;
                                class292.field4920.method167(false, var70);
                            }
                            var9.field1364 = class284.field4808;
                            if (var9.field1330 != null) {
                                for (int var71 = 0; var71 < class209.field3529; var71++) {
                                    class180 var72 = new class180();
                                    var72.field3099 = var9;
                                    var72.field3082 = class23.field393[var71];
                                    var72.field3100 = class56.field878[var71];
                                    var72.field3102 = var9.field1330;
                                    class292.field4920.method167(false, var72);
                                }
                            }
                            if (class7.field61 && var9.field1225 != null) {
                                class180 var73 = new class180();
                                var73.field3099 = var9;
                                var73.field3102 = var9.field1225;
                                class292.field4920.method167(false, var73);
                            }
                        }
                    }
                    if (!var9.field1229 && class17.field284 == null && class115.field2041 == null && !class32.field539) {
                        if ((var9.field1351 >= 0 || var9.field1248 != 0) && class109.field1961 >= var12 && class274.field4554 >= var13 && class109.field1961 < var14 && class274.field4554 < var15) {
                            if (var9.field1351 >= 0) {
                                class289.field4863 = arg0[var9.field1351];
                            } else {
                                class289.field4863 = var9;
                            }
                        }
                        if (var9.field1231 == 8 && class109.field1961 >= var12 && class274.field4554 >= var13 && class109.field1961 < var14 && class274.field4554 < var15) {
                            class70.field1111 = var9;
                        }
                        if (var9.field1220 > var9.field1367) {
                            class127.method1026(class274.field4554, 14284, var9.field1367, var11, class109.field1961, var9, var9.field1340 + var10, var9.field1220);
                        }
                    }
                    if (var9.field1231 == 0) {
                        method857(arg0, var9.field1235, var12, var13, var14, var15, var10 - var9.field1326, var11 - var9.field1258);
                        if (var9.field1363 != null) {
                            method857(var9.field1363, var9.field1235, var12, var13, var14, var15, var10 - var9.field1326, var11 - var9.field1258);
                        }
                        class172 var74 = (class172) class137.field2440.method1672((long) var9.field1235, 19760);
                        if (var74 != null) {
                            class255.method1764(var15, var13, var14, var11, var74.field2985, var12, -1803, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1734)
    public final void method858(int arg0) {
        field1900++;
        class91.method690((byte) 20);
        class162.field2854 = new class298();
        class55.field863 = new class240();
        if (class257.field4264 != 0) {
        }
        class95.method772(field1903, 3702);
        if (class8.field88 == 0) {
            class83.field1441 = this.getCodeBase().getHost();
            class19.field310 = 443;
            class171.field2962 = 43594;
        } else if (class8.field88 == 1) {
            class83.field1441 = this.getCodeBase().getHost();
            class171.field2962 = class291.field4904 + 40000;
            class19.field310 = class291.field4904 + 50000;
        } else if (class8.field88 == 2) {
            class83.field1441 = "127.0.0.1";
            class19.field310 = class291.field4904 + 50000;
            class171.field2962 = class291.field4904 + 40000;
        }
        class250.field4179 = class83.field1441;
        if (class53.field841 == 1) {
            class153.field2723 = class137.field2452;
            class199.field3377 = class283.field4801;
            class211.field3551 = class201.field3414;
            class108.field1950 = 16777215;
            class108.field1945 = 0;
            class84.field1518 = class154.field2731;
        } else {
            class211.field3551 = class207.field3496;
            class153.field2723 = class157.field2771;
            class199.field3377 = class1.field13;
            class84.field1518 = class258.field4295;
        }
        class243.field4033 = class19.field310;
        class163.field2880 = class171.field2962;
        class265.field4410 = class295.field4940 = class180.field3085 = class278.field4687 = new short[256];
        class156.field2745 = class171.field2962;
        if (arg0 <= 72) {
            field1904 = (class162) null;
        }
        if (class28.field470 == 3 && class8.field88 != 2) {
            class212.field3566 = class291.field4904;
        }
        class146.field2642 = class156.field2745;
        class183.method1388(-32);
        class91.method689(class308.field5173, (byte) 17);
        class288.method2001((byte) -118, class308.field5173);
        class264.field4406 = class12.method105(96);
        if (class264.field4406 != null) {
            class264.field4406.method200(class308.field5173, 0);
        }
        class90.field1597 = class28.field470;
        try {
            if (field1903.field467 != null) {
                class66.field1052 = new class258(field1903.field467, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class250.field4174[var2] = new class258(field1903.field480[var2], 6000, 0);
                }
                class147.field2660 = new class258(field1903.field484, 6000, 0);
                class183.field3161 = new class315(255, class66.field1052, class147.field2660, 500000);
                class224.field3748 = new class258(field1903.field483, 24, 0);
                field1903.field483 = null;
                field1903.field484 = null;
                field1903.field467 = null;
                field1903.field480 = null;
            }
        } catch (IOException var4) {
            class147.field2660 = null;
            class183.field3161 = null;
            class66.field1052 = null;
            class224.field3748 = null;
        }
        class87.field1553 = class242.field4030;
        if (class8.field88 != 0) {
            class203.field3440 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1845)
    private final void method859(byte arg0) {
        if (!class25.field413) {
            label238: while (true) {
                do {
                    if (!class27.method220(25039)) {
                        break label238;
                    }
                } while (class308.field5174 != 115 && class308.field5174 != 83);
                class25.field413 = true;
            }
        }
        field1883++;
        if (class182.field3142 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class300.method2048((byte) 18);
            if (class298.field4992 == 0L) {
                class298.field4992 = var4;
            }
            if (var3 > 16384 && var4 - class298.field4992 < 5000L) {
                if ((var4 - class119.field2167) > 1000L) {
                    System.gc();
                    class119.field2167 = var4;
                }
                class220.field3682 = 5;
                class40.field654 = class119.field2177;
            } else {
                class182.field3142 = 10;
                class220.field3682 = 5;
                class40.field654 = field1896;
            }
        } else if (class182.field3142 == 10) {
            class221.method1606(4, 104, 104);
            for (int var28 = 0; var28 < 4; var28++) {
                class267.field4473[var28] = new class179(104, 104);
            }
            class40.field654 = class277.field4647;
            class182.field3142 = 30;
            class220.field3682 = 10;
        } else if (class182.field3142 == 30) {
            if (class157.field2762 == null) {
                class157.field2762 = new class173(class55.field863, class162.field2854);
            }
            if (class157.field2762.method1325((byte) -97)) {
                class213.field3577 = class154.method1200(true, 0, true, false, (byte) -61);
                class143.field2574 = class154.method1200(true, 1, true, false, (byte) 63);
                class50.field806 = class154.method1200(true, 2, false, true, (byte) -79);
                class151.field2693 = class154.method1200(true, 3, true, false, (byte) 92);
                class157.field2764 = class154.method1200(true, 4, true, false, (byte) 96);
                class91.field1614 = class154.method1200(true, 5, true, true, (byte) -70);
                class178.field3047 = class154.method1200(false, 6, true, true, (byte) 59);
                class158.field2782 = class154.method1200(true, 7, true, false, (byte) -68);
                class35.field577 = class154.method1200(true, 8, true, false, (byte) -92);
                class181.field3120 = class154.method1200(true, 9, true, false, (byte) 94);
                class105.field1920 = class154.method1200(true, 10, true, false, (byte) 90);
                class67.field1081 = class154.method1200(true, 11, true, false, (byte) -64);
                class97.field1768 = class154.method1200(true, 12, true, false, (byte) -112);
                class51.field817 = class154.method1200(true, 13, true, false, (byte) -74);
                class243.field4037 = class154.method1200(false, 14, true, false, (byte) -79);
                class127.field2308 = class154.method1200(true, 15, true, false, (byte) -79);
                class247.field4087 = class154.method1200(true, 16, true, false, (byte) -110);
                class203.field3435 = class154.method1200(true, 17, true, false, (byte) -123);
                class296.field4956 = class154.method1200(true, 18, true, false, (byte) 74);
                class154.field2728 = class154.method1200(true, 19, true, false, (byte) 98);
                class34.field546 = class154.method1200(true, 20, true, false, (byte) 117);
                class252.field4209 = class154.method1200(true, 21, true, false, (byte) -63);
                class12.field201 = class154.method1200(true, 22, true, false, (byte) -64);
                class6.field50 = class154.method1200(true, 23, true, true, (byte) 66);
                class181.field3110 = class154.method1200(true, 24, true, false, (byte) -121);
                class147.field2657 = class154.method1200(true, 25, true, false, (byte) 122);
                class206.field3468 = class154.method1200(true, 26, true, true, (byte) 107);
                class40.field654 = class120.field2185;
                class182.field3142 = 40;
                class220.field3682 = 15;
            } else {
                class220.field3682 = 12;
                class40.field654 = class157.field2773;
            }
        } else if (class182.field3142 == 40) {
            int var26 = 0;
            for (int var27 = 0; var27 < 27; var27++) {
                var26 += class68.field1091[var27].method186((byte) -112) * class237.field3953[var27] / 100;
            }
            if (var26 == 100) {
                class220.field3682 = 20;
                class40.field654 = class73.field1160;
                class209.method1539(class35.field577, (byte) -78);
                class308.method2092(class35.field577, false);
                class184.method1391(104, class35.field577);
                class182.field3142 = 45;
            } else {
                if (var26 != 0) {
                    class40.field654 = class135.method1062(new class162[] { class279.field4696, class156.method1212(10, var26), class213.field3578 }, true);
                }
                class220.field3682 = 20;
            }
        } else if (class182.field3142 == 45) {
            class179.method1350(22050, class156.field2746, 2, (byte) 87);
            class27.field464 = new class280();
            class27.field464.method1948(9, -18, 128);
            class268.field4484 = class46.method328(field1903, 11, 0, class308.field5173, 22050);
            class268.field4484.method464(arg0 ^ 0x5A, class27.field464);
            class212.method1552(class157.field2764, class243.field4037, -3112, class27.field464, class127.field2308);
            class247.field4100 = class46.method328(field1903, 11, 1, class308.field5173, 2048);
            class313.field5290 = new class65();
            class247.field4100.method464(0, class313.field5290);
            class222.field3710 = new class134(22050, class306.field5146);
            class53.field837 = class178.field3047.method1136(class245.field4068, 63);
            class182.field3142 = 50;
            class220.field3682 = 30;
            class40.field654 = class158.field2783;
        } else if (class182.field3142 == 50) {
            int var24 = class211.method1548(class35.field577, class51.field817, 64);
            int var25 = class292.method2019(false);
            if (var24 >= var25) {
                class182.field3142 = 60;
                class40.field654 = class230.field3841;
                class220.field3682 = 35;
            } else {
                class40.field654 = class135.method1062(new class162[] { class68.field1095, class156.method1212(10, var24 * 100 / var25), class213.field3578 }, true);
                class220.field3682 = 35;
            }
        } else if (class182.field3142 == 60) {
            int var22 = class248.method1739(class35.field577, -1);
            int var23 = class279.method1915(2);
            if (var22 < var23) {
                class40.field654 = class135.method1062(new class162[] { class263.field4392, class156.method1212(arg0 ^ 0x50, var22 * 100 / var23), class213.field3578 }, true);
                class220.field3682 = 40;
            } else {
                class220.field3682 = 40;
                class182.field3142 = 65;
                class40.field654 = class77.field1207;
            }
        } else if (class182.field3142 == 65) {
            class6.method33(class51.field817, class35.field577, -147);
            class40.field654 = class268.field4474;
            class220.field3682 = 45;
            class122.method984(5, 2047);
            class182.field3142 = 70;
        } else if (class182.field3142 == 70) {
            class50.field806.method1129(false);
            byte var6 = 0;
            int var7 = var6 + class50.field806.method1133(-1);
            class247.field4087.method1129(false);
            int var8 = var7 + class247.field4087.method1133(-1);
            class203.field3435.method1129(false);
            int var9 = var8 + class203.field3435.method1133(-1);
            class296.field4956.method1129(false);
            int var10 = var9 + class296.field4956.method1133(-1);
            class154.field2728.method1129(false);
            int var11 = var10 + class154.field2728.method1133(-1);
            class34.field546.method1129(false);
            int var12 = var11 + class34.field546.method1133(arg0 - 91);
            class252.field4209.method1129(false);
            int var13 = var12 + class252.field4209.method1133(arg0 - 91);
            class12.field201.method1129(false);
            int var14 = var13 + class12.field201.method1133(arg0 ^ 0xFFFFFFA5);
            class181.field3110.method1129(false);
            int var15 = var14 + class181.field3110.method1133(-1);
            class147.field2657.method1129(false);
            int var16 = var15 + class147.field2657.method1133(arg0 - 91);
            if (var16 < 1000) {
                class40.field654 = class135.method1062(new class162[] { class261.field4365, class156.method1212(10, var16 / 10), class213.field3578 }, true);
                class220.field3682 = 50;
            } else {
                class273.method1856((byte) -89, class50.field806);
                class13.method114(true, class50.field806);
                class172.method1319((byte) -123, class50.field806);
                class47.method349(class50.field806, true, class158.field2782);
                class212.method1554(true, class247.field4087, (byte) -101, class158.field2782);
                class46.method335(class158.field2782, class296.field4956, arg0 + 9407);
                class82.method623(class158.field2782, (byte) 1, true, class147.field2663, class154.field2728);
                class248.method1742(class50.field806, (byte) 80);
                class308.method2090(false, class34.field546, class143.field2574, class213.field3577);
                class231.method1650(class158.field2782, arg0 ^ 0xFFFFFFD4, class252.field4209);
                class274.method1864(class12.field201, 2);
                class64.method443(class50.field806, 22897);
                class104.method844(class158.field2782, class51.field817, class151.field2693, class35.field577, 1);
                class304.method2073(class50.field806, (byte) 115);
                class55.method391(class203.field3435, 3);
                class297.method2037(new class68(), class147.field2657, true, class181.field3110);
                class184.method1392(class147.field2657, class181.field3110, -114);
                class40.field654 = class188.field3238;
                class220.field3682 = 50;
                class90.method682(0);
                class182.field3142 = 80;
            }
        } else if (class182.field3142 == 80) {
            int var20 = class53.method375(false, class35.field577);
            int var21 = class122.method987(16);
            if (var20 < var21) {
                class40.field654 = class135.method1062(new class162[] { class74.field1181, class156.method1212(10, var20 * 100 / var21), class213.field3578 }, true);
                class220.field3682 = 60;
            } else {
                class190.method1417(class35.field577, 21);
                class182.field3142 = 90;
                class220.field3682 = 60;
                class40.field654 = class259.field4314;
            }
        } else {
            if (arg0 != 90) {
                field1885 = (class162) null;
            }
            if (class182.field3142 == 90) {
                if (class206.field3468.method1129(false)) {
                    class17 var19 = new class17(class181.field3120, class206.field3468, class35.field577, 20, !class203.field3439);
                    class312.method2111(var19);
                    if (class39.field639 == 1) {
                        class312.method2130(0.9F);
                    }
                    if (class39.field639 == 2) {
                        class312.method2130(0.8F);
                    }
                    if (class39.field639 == 3) {
                        class312.method2130(0.7F);
                    }
                    if (class39.field639 == 4) {
                        class312.method2130(0.6F);
                    }
                    class182.field3142 = 100;
                    class40.field654 = class317.field5340;
                    class220.field3682 = 70;
                } else {
                    class40.field654 = class135.method1062(new class162[] { class163.field2888, class156.method1212(10, class206.field3468.method1133(arg0 - 91)), class213.field3578 }, true);
                    class220.field3682 = 70;
                }
            } else if (class182.field3142 == 100) {
                if (class296.method2031(-4097, class35.field577)) {
                    class182.field3142 = 110;
                }
            } else if (class182.field3142 == 110) {
                class184.field3182 = new class73();
                field1903.method241((byte) -110, class184.field3182, 10);
                class182.field3142 = 120;
                class220.field3682 = 75;
                class40.field654 = class56.field876;
            } else if (class182.field3142 == 120) {
                if (class105.field1920.method1138((byte) -105, class244.field4053, class136.field2421)) {
                    class204 var17 = new class204(class105.field1920.method1141(class136.field2421, class244.field4053, (byte) -119));
                    class293.method2024(-28571, var17);
                    class220.field3682 = 80;
                    class40.field654 = class23.field392;
                    class182.field3142 = 130;
                } else {
                    class40.field654 = class135.method1062(new class162[] { class74.field1179, class171.field2963 }, true);
                    class220.field3682 = 80;
                }
            } else if (class182.field3142 == 130) {
                if (!class151.field2693.method1129(false)) {
                    class40.field654 = class135.method1062(new class162[] { class64.field998, class156.method1212(10, class151.field2693.method1133(-1) * 3 / 4), class213.field3578 }, true);
                    class220.field3682 = 85;
                } else if (!class97.field1768.method1129(false)) {
                    class40.field654 = class135.method1062(new class162[] { class64.field998, class156.method1212(arg0 ^ 0x50, class97.field1768.method1133(arg0 ^ 0xFFFFFFA5) / 10 + 75), class213.field3578 }, true);
                    class220.field3682 = 85;
                } else if (!class51.field817.method1129(false)) {
                    class40.field654 = class135.method1062(new class162[] { class64.field998, class156.method1212(10, (class51.field817.method1133(-1) / 20) + 85), class213.field3578 }, true);
                    class220.field3682 = 85;
                } else if (class6.field50.method1124(class94.field1669, -1)) {
                    class217.method1578(class129.field2336, class18.field303, class128.field2325, class63.field989, class6.field50, class297.field4978, arg0 ^ 0xFFFFFFBC);
                    class220.field3682 = 95;
                    class40.field654 = class212.field3563;
                    class182.field3142 = 135;
                } else {
                    class40.field654 = class135.method1062(new class162[] { class64.field998, class156.method1212(10, (class6.field50.method1130(class94.field1669, 77) / 10) + 90), class213.field3578 }, true);
                    class220.field3682 = 85;
                }
            } else if (class182.field3142 == 135) {
                int var18 = class137.method1073((byte) 16);
                if (var18 == -1) {
                    class40.field654 = class105.field1919;
                    class220.field3682 = 95;
                } else if (var18 == 7 || var18 == 9) {
                    this.method1902(true, "worldlistfull");
                    class122.method984(1000, arg0 + 1957);
                } else if (class245.field4081) {
                    class220.field3682 = 96;
                    class40.field654 = class151.field2703;
                    class182.field3142 = 140;
                } else {
                    this.method1902(true, "worldlistio");
                    class122.method984(1000, 2047);
                }
            } else if (class182.field3142 == 140) {
                class178.field3044 = class151.field2693.method1136(class277.field4652, arg0 ^ 0x65);
                class91.field1614.method1117((byte) 112, true, false);
                class178.field3047.method1117((byte) 108, true, true);
                class35.field577.method1117((byte) 120, true, true);
                class51.field817.method1117((byte) 117, true, true);
                class105.field1920.method1117((byte) 108, true, true);
                class151.field2693.method1117((byte) 110, true, true);
                class182.field3142 = 150;
                class220.field3682 = 97;
                class40.field654 = class29.field493;
                class257.field4262 = true;
            } else if (class182.field3142 == 150) {
                class210.method1545();
                if (class25.field413) {
                    class258.field4296 = 0;
                }
                class25.field413 = true;
                class27.method217(field1903, (byte) 119);
                class266.method1822((byte) -35, -1, -1, class258.field4296, false);
                class220.field3682 = 100;
                class182.field3142 = 160;
                class40.field654 = class225.field3750;
            } else if (class182.field3142 == 160) {
                class256.method1766(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2338)
    private final void method860(int arg0) {
        field1887++;
        if (class280.field4739 < class55.field863.field4010) {
            if (class163.field2880 == class146.field2642) {
                class146.field2642 = class243.field4033;
            } else {
                class146.field2642 = class163.field2880;
            }
            class201.field3412 = (class55.field863.field4010 * 50 - 50) * 5;
            if (class201.field3412 > 3000) {
                class201.field3412 = 3000;
            }
            if (class55.field863.field4010 >= 2 && class55.field863.field4011 == 6) {
                this.method1902(true, "js5connect_outofdate");
                class262.field4380 = 1000;
                return;
            }
            if (class55.field863.field4010 >= 4 && class55.field863.field4011 == -1) {
                this.method1902(true, "js5crc");
                class262.field4380 = 1000;
                return;
            }
            if (class55.field863.field4010 >= 4 && (class262.field4380 == 0 || class262.field4380 == 5)) {
                if (class55.field863.field4011 == 7 || class55.field863.field4011 == 9) {
                    this.method1902(true, "js5connect_full");
                } else if (class55.field863.field4011 <= 0) {
                    this.method1902(true, "js5io");
                } else {
                    this.method1902(true, "js5connect");
                }
                class262.field4380 = 1000;
                return;
            }
        }
        class280.field4739 = class55.field863.field4010;
        if (class201.field3412 > arg0) {
            class201.field3412--;
            return;
        }
        try {
            if (class289.field4880 == 0) {
                class256.field4234 = field1903.method237(class146.field2642, -6303, class250.field4179);
                class289.field4880++;
            }
            if (class289.field4880 == 1) {
                if (class256.field4234.field2934 == 2) {
                    this.method854(1000, arg0 ^ 0xFFFF8A50);
                    return;
                }
                if (class256.field4234.field2934 == 1) {
                    class289.field4880++;
                }
            }
            if (class289.field4880 == 2) {
                class63.field990 = new class267((Socket) class256.field4234.field2933, field1903);
                class94 var2 = new class94(5);
                var2.method753(15, true);
                var2.method730(false, 517);
                class63.field990.method1827(0, 83, var2.field1681, 5);
                class289.field4880++;
                class45.field723 = class300.method2048((byte) 18);
            }
            if (class289.field4880 == 3) {
                if (class262.field4380 == 0 || class262.field4380 == 5 || class63.field990.method1826(100) > 0) {
                    int var3 = class63.field990.method1832(arg0 + 25831);
                    if (var3 != 0) {
                        this.method854(var3, arg0 - 30128);
                        return;
                    }
                    class289.field4880++;
                } else if ((class300.method2048((byte) 18) - class45.field723) > 30000L) {
                    this.method854(1001, -30128);
                    return;
                }
            }
            if (class289.field4880 == 4) {
                boolean var4 = class262.field4380 == 5 || class262.field4380 == 10 || class262.field4380 == 28;
                class55.field863.method1696(class63.field990, !var4, (byte) -104);
                class289.field4880 = 0;
                class63.field990 = null;
                class256.field4234 = null;
            }
        } catch (IOException var6) {
            this.method854(1002, arg0 - 30128);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lob;)I", line = 2488)
    public static final int method861(class78 arg0) {
        class188 var1 = (class188) class178.field3046.method1672(((long) arg0.field1235 << 32) + (long) arg0.field1276, 19760);
        return var1 == null ? arg0.field1236 : var1.field3237;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 2497)
    public final void method862(int arg0) {
        if (class117.field2159) {
            class117.method952();
        }
        field1891++;
        if (class168.field2950 != null) {
            class59.method411(field1903, class168.field2950, (byte) 57);
            class168.field2950 = null;
        }
        if (field1903 != null) {
            field1903.method239((byte) 20, this.getClass());
        }
        if (class184.field3182 != null) {
            class184.field3182.field1165 = false;
        }
        class184.field3182 = null;
        if (class116.field2054 != null) {
            class116.field2054.method1829((byte) 4);
            class116.field2054 = null;
        }
        class138.method1079((byte) -37, class308.field5173);
        class9.method58((byte) -101, class308.field5173);
        if (class264.field4406 != null) {
            class264.field4406.method199((byte) 126, class308.field5173);
        }
        class29.method242(false);
        class147.method1172(-1);
        class264.field4406 = null;
        if (class268.field4484 != null) {
            class268.field4484.method465(-1);
        }
        if (class247.field4100 != null) {
            class247.field4100.method465(-1);
        }
        class55.field863.method1707(16776960);
        class162.field2854.method2040((byte) 123);
        if (arg0 <= 19) {
            return;
        }
        try {
            if (class66.field1052 != null) {
                class66.field1052.method1776((byte) 96);
            }
            if (class250.field4174 != null) {
                for (int var2 = 0; var2 < class250.field4174.length; var2++) {
                    if (class250.field4174[var2] != null) {
                        class250.field4174[var2].method1776((byte) 96);
                    }
                }
            }
            if (class147.field2660 != null) {
                class147.field2660.method1776((byte) 96);
            }
            if (class224.field3748 != null) {
                class224.field3748.method1776((byte) 96);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lob;)Lob;", line = 2599)
    public static final class78 method863(class78 arg0) {
        int var1 = class288.method2000(method861(arg0), (byte) -107);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class61.method419((byte) 28, arg0.field1371);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2628)
    public static final void main(String[] arg0) {
        field1892++;
        try {
            if (arg0.length != 4) {
                class186.method1401(3, "argument count");
            }
            class291.field4904 = Integer.parseInt(arg0[0]);
            class8.field88 = 2;
            if (arg0[1].equals("live")) {
                class257.field4264 = 0;
            } else if (arg0[1].equals("rc")) {
                class257.field4264 = 1;
            } else if (arg0[1].equals("wip")) {
                class257.field4264 = 2;
            } else {
                class186.method1401(3, "modewhat");
            }
            class273.field4537 = false;
            int var1 = -1;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class265.method1818(class95.method768(var2.length, 0, var2, (byte) 123), (byte) 68);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class260.field4344 = var1;
            } else if (arg0[2].equals("english")) {
                class260.field4344 = 0;
            } else if (arg0[2].equals("german")) {
                class260.field4344 = 1;
            } else {
                class186.method1401(3, "language");
            }
            class67.method480(0, class260.field4344);
            class177.field3032 = false;
            class187.field3232 = false;
            if (arg0[3].equals("game0")) {
                class53.field841 = 0;
            } else if (arg0[3].equals("game1")) {
                class53.field841 = 1;
            } else {
                class186.method1401(3, "game");
            }
            class61.field939 = false;
            class262.field4377 = 0;
            class35.field590 = class244.field4053;
            client var4 = new client();
            class135.field2414 = var4;
            var4.method1903(517, 27, 768, class257.field4264 + 32, "runescape", true, 1024);
            class95.field1740.setLocation(40, 40);
        } catch (Exception var7) {
            class129.method1039(-8, (String) null, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lob;)Z", line = 2708)
    public static final boolean method864(class78 arg0) {
        if (class255.field4223) {
            if (method861(arg0) != 0) {
                return false;
            }
            if (arg0.field1231 == 0) {
                return false;
            }
        }
        return arg0.field1318;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I", line = 2727)
    public static final int method865(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 42 / ((arg2 - 29) / 57);
        int var5 = arg0 & 0x3;
        field1895++;
        if (var5 == 0) {
            return arg3;
        } else if (var5 == 1) {
            return arg1;
        } else if (var5 == 2) {
            return 1023 - arg3;
        } else {
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2752)
    public final void init() {
        field1886++;
        if (!this.method1907(23923)) {
            return;
        }
        class291.field4904 = Integer.parseInt(this.getParameter("worldid"));
        class8.field88 = Integer.parseInt(this.getParameter("modewhere"));
        if (class8.field88 < 0 || class8.field88 > 1) {
            class8.field88 = 0;
        }
        class257.field4264 = Integer.parseInt(this.getParameter("modewhat"));
        if (class257.field4264 < 0 || class257.field4264 > 2) {
            class257.field4264 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class273.field4537 = true;
        } else {
            class273.field4537 = false;
        }
        try {
            class260.field4344 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class260.field4344 = 0;
        }
        class67.method480(0, class260.field4344);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class187.field3232 = true;
        } else {
            class187.field3232 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class177.field3032 = true;
        } else {
            class177.field3032 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class53.field841 = 1;
        } else {
            class53.field841 = 0;
        }
        try {
            class262.field4377 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class262.field4377 = 0;
        }
        class35.field590 = class97.field1762.method1280(this, 0);
        if (class35.field590 == null) {
            class35.field590 = class244.field4053;
        }
        String var7 = this.getParameter("haveie6");
        if (var7 != null && var7.equals("1")) {
            class61.field939 = true;
        } else {
            class61.field939 = false;
        }
        class135.field2414 = this;
        this.method1901(503, class257.field4264 + 32, 765, true, 517);
    }
}
