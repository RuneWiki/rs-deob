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
public class client extends class149 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
    public static volatile boolean field3297 = true;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
    public static int[] field3301 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method1426(int arg0) {
        class194.field2790 = null;
        field3292++;
        class48.field678 = null;
        class221.field3278 = null;
        class13.field204 = null;
        if (arg0 != 28748) {
            field3301 = null;
        }
        class56.field863 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Lja;")
    public static final class55 method1427(byte arg0) {
        int var1 = -3 % ((-arg0 - 62) / 32);
        class229.field3446 = 0;
        field3289++;
        return class236.method1551(true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lha;)Z")
    public static final boolean method1428(class267 arg0) {
        if (class268.field4194) {
            if (method1439(arg0).field1395 != 0) {
                return false;
            }
            if (arg0.field4149 == 0) {
                return false;
            }
        }
        return arg0.field4023;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3294++;
        if (!this.method1003(98)) {
            return;
        }
        class276.field4433 = Integer.parseInt(this.getParameter("worldid"));
        class180.field2579 = Integer.parseInt(this.getParameter("modewhere"));
        if (class180.field2579 < 0 || class180.field2579 > 1) {
            class180.field2579 = 0;
        }
        class118.field1732 = Integer.parseInt(this.getParameter("modewhat"));
        if (class118.field1732 < 0 || class118.field1732 > 2) {
            class118.field1732 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class182.field2604 = true;
        } else {
            class182.field2604 = false;
        }
        try {
            class149.field2135 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class149.field2135 = 0;
        }
        class115.method799(50, class149.field2135);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class173.field2475 = true;
        } else {
            class173.field2475 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class272.field4303 = true;
        } else {
            class272.field4303 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class69.field1076 = 1;
        } else {
            class69.field1076 = 0;
        }
        try {
            class76.field1177 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class76.field1177 = 0;
        }
        class39.field585 = this.getParameter("settings");
        if (class39.field585 == null) {
            class39.field585 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class98.field1476 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class98.field1476 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class118.field1736 = true;
        } else {
            class118.field1736 = false;
        }
        class80.field1237 = this;
        this.method1004(-30430, class118.field1732 + 32, 503, 534, 765);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class51.method344(1, "argument count");
            }
            class276.field4433 = Integer.parseInt(arg0[0]);
            class180.field2579 = 2;
            if (arg0[1].equals("live")) {
                class118.field1732 = 0;
            } else if (arg0[1].equals("rc")) {
                class118.field1732 = 1;
            } else if (arg0[1].equals("wip")) {
                class118.field1732 = 2;
            } else {
                class51.method344(1, "modewhat");
            }
            class182.field2604 = false;
            class149.field2135 = class158.method1061(arg0[2], -1);
            if (class149.field2135 == -1) {
                if (arg0[2].equals("english")) {
                    class149.field2135 = 0;
                } else if (arg0[2].equals("german")) {
                    class149.field2135 = 1;
                } else {
                    class51.method344(1, "language");
                }
            }
            class115.method799(84, class149.field2135);
            class173.field2475 = false;
            class272.field4303 = false;
            if (arg0[3].equals("game0")) {
                class69.field1076 = 0;
            } else if (arg0[3].equals("game1")) {
                class69.field1076 = 1;
            } else {
                class51.method344(1, "game");
            }
            class76.field1177 = 0;
            class118.field1736 = false;
            class98.field1476 = 0;
            class39.field585 = "";
            client var1 = new client();
            class80.field1237 = var1;
            var1.method994(28, "runescape", false, 534, 1024, 768, class118.field1732 + 32, (byte) -94);
            class282.field4503.setLocation(40, 40);
        } catch (Exception var3) {
            class37.method259(-74, (String) null, var3);
        }
        field3291++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIJZ)Z")
    public static final boolean method1429(int arg0, int arg1, long arg2, boolean arg3) {
        field3284++;
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = ((int) arg2 & 0x3C54F2) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class250 var8 = class91.method618(113, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field3821;
                var10 = var8.field3808;
            } else {
                var9 = var8.field3808;
                var10 = var8.field3821;
            }
            int var11 = var8.field3755;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class193.method1241(class55.field847.field50[0], arg1, var10, var9, !arg3, class55.field847.field119[0], true, var11, 2, 0, arg0, 0);
        } else {
            class193.method1241(class55.field847.field50[0], arg1, 0, 0, !arg3, class55.field847.field119[0], true, 0, 2, var6, arg0, var5 + 1);
        }
        if (!arg3) {
            method1441(false);
        }
        class270.field4236 = class279.field4465;
        class290.field4582 = 2;
        class65.field1021 = class42.field602;
        class107.field1550 = 0;
        return true;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lha;)Lha;")
    public static final class267 method1430(class267 arg0) {
        int var1 = method1439(arg0).method632((byte) -123);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class282.method1897(arg0.field4139, 101);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1002(byte arg0) {
        field3286++;
        method1440((byte) -59);
        class227.method1484(-99);
        class225.method1469((byte) 24);
        class78.method516(false);
        class245.method1600(61);
        class289.method1934(-80);
        class19.method153(-121);
        class89.method604(20867);
        class149.method1001(0);
        class28.method209(0);
        class173.method1143((byte) 98);
        class130.method896(23);
        class39.method269((byte) -72);
        class114.method742(454144424);
        class54.method365((byte) -64);
        class247.method1618((byte) 100);
        class266.method1767((byte) -116);
        class226.method1480((byte) 11);
        class217.method1389((byte) -95);
        class233.method1534(8211);
        class48.method327((byte) 34);
        class141.method937(5);
        class37.method256((byte) 124);
        class72.method490((byte) -105);
        class79.method523((byte) -112);
        class86.method590((byte) -101);
        class267.method1777(-1);
        class53.method351(3496);
        class97.method655(5);
        class69.method472(-89);
        class190.method1221(false);
        class161.method1082(true);
        class80.method534((byte) -86);
        class61.method417(-3722);
        class154.method1045((byte) -78);
        class220.method1412(-82);
        class5.method69(-47);
        class131.method900(-30097);
        class250.method1641((byte) 30);
        class272.method1827((byte) 30);
        class261.method1744(-93);
        class254.method1705(9564);
        class151.method1025(118);
        class269.method1803((byte) 24);
        class22.method166(-50);
        class246.method1610(1);
        class235.method1548(1);
        class251.method1655(-32146);
        class156.method1053(16563);
        class20.method157((byte) 58);
        class218.method1405((byte) -121);
        class13.method109((byte) 74);
        class134.method908(1);
        class209.method1338((byte) -102);
        class24.method181(-1);
        class91.method620((byte) -59);
        class203.method1315(119);
        class118.method814((byte) 35);
        class52.method346(-29149);
        class88.method597(23638);
        class146.method977((byte) -64);
        class127.method886();
        class110.method720(-110);
        class273.method1836(24);
        class215.method1376();
        class210.method1341(-125);
        class57.method385(-25);
        class172.method1135((byte) -39);
        class158.method1065(true);
        class10.method89((byte) -110);
        class259.method1737((byte) -79);
        class175.method1146(-1);
        class198.method1290();
        class123.method835(6016);
        class191.method1227((byte) 114);
        int var2 = 36 / ((76 - arg0) / 48);
        class126.method854();
        class181.method1171((byte) -111);
        class137.method923(0);
        class21.method158((byte) 117);
        class11.method103();
        class258.method1730(true);
        class221.method1423(10);
        class87.method593(123);
        class96.method646(12093);
        class144.method956();
        class33.method233(-121);
        class280.method1885(2047);
        class228.method1491(182);
        class90.method613(-1);
        class231.method1502(-113);
        class197.method1261(99);
        class42.method286(false);
        class279.method1883(false);
        class102.method680(-59);
        class184.method1192(true);
        class204.method1320(-1);
        class9.method85(0);
        class35.method242(-123);
        class7.method79(-30);
        class237.method1555((byte) -116);
        class183.method1179(-24203);
        class31.method225(-5);
        class213.method1360((byte) -94);
        class100.method668(-27106);
        class214.method1367(false);
        class262.method1745((byte) -79);
        class224.method1464((byte) 18);
        class185.method1197(3);
        class242.method1571((byte) 71);
        class284.method1913(1);
        class18.method131();
        class81.method540(false);
        class253.method1700(122);
        class195.method1246(false);
        class104.method692(74);
        class55.method373(14);
        class70.method479(-92);
        class211.method1349(true);
        class142.method943(2048);
        class234.method1543(0);
        class219.method1406(true);
        class162.method1089((byte) 108);
        class229.method1497((byte) 127);
        class288.method1929((byte) 107);
        class264.method1754((byte) -1);
        class109.method714(18519);
        class62.method437(-3369);
        class163.method1092((byte) 23);
        class139.method930();
        class101.method672(104);
        class32.method227(32);
        class188.method1209(101);
        class249.method1637();
        class12.method106((byte) 113);
        class147.method984((byte) -84);
        class107.method706(5196);
        class270.method1807(-1574506480);
        class255.method1713(107);
        class30.method216(5725);
        class17.method128(118);
        class25.method187(26580);
        class165.method1104();
        class94.method638(-2);
        class176.method1150((byte) 85);
        class189.method1212((byte) -128);
        class202.method1309((byte) 81);
        class263.method1746((byte) -104);
        class59.method391((byte) -50);
        class113.method729((byte) 88);
        class26.method197((byte) -80);
        class285.method1919(119);
        class64.method447(47);
        class152.method1032(false);
        class212.method1352(128);
        class98.method661(0);
        class194.method1243((byte) -106);
        class27.method203((byte) -51);
        class14.method113(-128);
        class67.method456((byte) -119);
        class140.method932(60);
        class76.method504(52);
        class278.method1873();
        class153.method1034(2);
        class283.method1908(0);
        class193.method1238((byte) 94);
        class169.method1119((byte) 52);
        class122.method831((byte) 3);
        class3.method42();
        class199.method1292();
        class171.method1129((byte) -52);
        class16.method123(0);
        class236.method1550(0);
        class99.method667((byte) 121);
        class49.method335();
        class265.method1757();
        class23.method171((byte) -123);
        class182.method1178(-113);
        class115.method800((byte) 120);
        class1.method3(-100);
        class68.method464(-16045);
        class129.method892((byte) 104);
        class257.method1727(125);
        class281.method1889(1);
        class103.method689(0);
        class145.method970((byte) -121);
        class65.method448(-99);
        class180.method1166((byte) -69);
        class232.method1507((byte) -89);
        class82.method547(-124);
        class60.method393(28);
        class178.method1156(true);
        class155.method1047((byte) -39);
        class63.method441((byte) 47);
        class138.method928(126);
        class256.method1722((byte) 55);
        class160.method1077(-31118);
        class166.method1108((byte) 4);
        class243.method1580(0);
        class206.method1330(1);
        class66.method455(-10935);
        class77.method510(-123);
        class75.method502((byte) 119);
        class93.method634(true);
        class40.method272(true);
        class34.method237(-72);
        class207.method1333((byte) -109);
        class111.method724(73);
        class187.method1208((byte) -69);
        class132.method906(1);
        class276.method1858((byte) -70);
        class15.method120((byte) 124);
        class38.method267(false);
        class135.method913(126);
        class74.method498(52);
        class240.method1562(true);
        class168.method1113(3);
        class84.method563(-1);
        class128.method891((byte) 115);
        class275.method1854(-14206);
        class277.method1866((byte) -41);
        class268.method1792((byte) 107);
        class95.method642(false);
        class179.method1159(0);
        class124.method839((byte) 113);
        class248.method1636(17470);
        class121.method829((byte) 124);
        class58.method386(1);
        class120.method824((byte) 103);
        class282.method1899(16768);
        class286.method1924(28827);
        class274.method1847(0);
        class136.method920((byte) 62);
        class290.method1936((byte) 111);
        class45.method301(4);
        class43.method296((byte) -122);
        class170.method1127(42);
        class51.method345((byte) -126);
        class260.method1740(32767);
        class119.method816(-14650);
        class200.method1298((byte) 110);
        class192.method1232(-5);
        class56.method376((byte) -55);
        class47.method308(true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method996(byte arg0) {
        field3298++;
        if (class124.field1807 != null) {
            class124.field1807.field1898 = false;
        }
        class124.field1807 = null;
        if (class10.field180 != null) {
            class10.field180.method362(false);
            class10.field180 = null;
        }
        class28.method211(class80.field1247, -126);
        class17.method130(class80.field1247, (byte) -5);
        if (class27.field388 != null) {
            class27.field388.method82(class80.field1247, -27503);
        }
        class27.method200((byte) 47);
        class135.method916(16);
        class27.field388 = null;
        if (class217.field3198 != null) {
            class217.field3198.method1457(true);
        }
        if (class240.field3599 != null) {
            class240.field3599.method1457(true);
        }
        class81.field1257.method1619((byte) -107);
        class37.field551.method1768((byte) 88);
        try {
            if (class135.field1964 != null) {
                class135.field1964.method319(true);
            }
            if (class12.field193 != null) {
                for (int var2 = 0; var2 < class12.field193.length; var2++) {
                    if (class12.field193[var2] != null) {
                        class12.field193[var2].method319(true);
                    }
                }
            }
            if (arg0 < 63) {
                method1431((byte) -66, (class114) null);
            }
            if (class178.field2542 != null) {
                class178.field2542.method319(true);
            }
            if (class56.field859 != null) {
                class56.field859.method319(true);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLkl;)Ltb;")
    public static final class192 method1431(byte arg0, class114 arg1) {
        field3300++;
        if (arg0 != -32) {
            method1439((class267) null);
        }
        return new class192(arg1.method763(true), arg1.method763(true), arg1.method763(true), arg1.method763(true), arg1.method763(true), arg1.method763(true), arg1.method763(true), arg1.method763(true), arg1.method779(arg0 ^ 0xFF00FFE0), arg1.method760(false));
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1432(int arg0) {
        if (arg0 != 0) {
            field3297 = false;
        }
        boolean var2 = class81.field1257.method1614(109);
        field3285++;
        if (!var2) {
            this.method1435((byte) -121);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
    public static final boolean method1433(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class237.field3579; var3++) {
            class229 var4 = class80.field1243[var3];
            if (var4.field3445 == 1) {
                int var5 = var4.field3423 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3436 * var5 >> 8) + var4.field3426;
                    int var7 = (var4.field3424 * var5 >> 8) + var4.field3433;
                    int var8 = (var4.field3441 * var5 >> 8) + var4.field3438;
                    int var9 = (var4.field3431 * var5 >> 8) + var4.field3428;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3445 == 2) {
                int var10 = arg0 - var4.field3423;
                if (var10 > 0) {
                    int var11 = (var4.field3436 * var10 >> 8) + var4.field3426;
                    int var12 = (var4.field3424 * var10 >> 8) + var4.field3433;
                    int var13 = (var4.field3441 * var10 >> 8) + var4.field3438;
                    int var14 = (var4.field3431 * var10 >> 8) + var4.field3428;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3445 == 3) {
                int var15 = var4.field3426 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3432 * var15 >> 8) + var4.field3423;
                    int var17 = (var4.field3430 * var15 >> 8) + var4.field3444;
                    int var18 = (var4.field3441 * var15 >> 8) + var4.field3438;
                    int var19 = (var4.field3431 * var15 >> 8) + var4.field3428;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3445 == 4) {
                int var20 = arg2 - var4.field3426;
                if (var20 > 0) {
                    int var21 = (var4.field3432 * var20 >> 8) + var4.field3423;
                    int var22 = (var4.field3430 * var20 >> 8) + var4.field3444;
                    int var23 = (var4.field3441 * var20 >> 8) + var4.field3438;
                    int var24 = (var4.field3431 * var20 >> 8) + var4.field3428;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3445 == 5) {
                int var25 = arg1 - var4.field3438;
                if (var25 > 0) {
                    int var26 = (var4.field3432 * var25 >> 8) + var4.field3423;
                    int var27 = (var4.field3430 * var25 >> 8) + var4.field3444;
                    int var28 = (var4.field3436 * var25 >> 8) + var4.field3426;
                    int var29 = (var4.field3424 * var25 >> 8) + var4.field3433;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method1434(byte arg0, int arg1) {
        field3299++;
        class190.field2707 = null;
        class163.field2373 = null;
        class81.field1257.field3719 = arg1;
        class68.field1059 = 0;
        class81.field1257.field3717++;
        if (arg0 != -73) {
            method1436((class267[]) null, -93, -72, -2, -111, -118, -87, 17);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1005(int arg0) {
        field3288++;
        class48.method320(122);
        class37.field551 = new class266();
        class81.field1257 = new class247();
        if (class118.field1732 != 0) {
            class195.field2811 = new byte[50][];
        }
        class256.method1723(class163.field2378, 0);
        int var2 = -61 % ((arg0 + 86) / 39);
        if (class180.field2579 == 0) {
            class282.field4498 = this.getCodeBase().getHost();
            class43.field614 = 43594;
            class255.field3868 = 443;
        } else if (class180.field2579 == 1) {
            class282.field4498 = this.getCodeBase().getHost();
            class255.field3868 = class276.field4433 + 50000;
            class43.field614 = class276.field4433 + 40000;
        } else if (class180.field2579 == 2) {
            class43.field614 = class276.field4433 + 40000;
            class282.field4498 = "127.0.0.1";
            class255.field3868 = class276.field4433 + 50000;
        }
        class281.field4489 = class1.field14 = class90.field1368 = class124.field1795 = new short[256];
        class60.field910 = class282.field4498;
        class132.field1939 = class255.field3868;
        if (class83.field1286 == 3 && class180.field2579 != 2) {
            class29.field415 = class276.field4433;
        }
        class39.field581 = class43.field614;
        class88.field1347 = class43.field614;
        class224.field3349 = class88.field1347;
        if (class69.field1076 == 1) {
            class156.field2279 = class236.field3561;
            class224.field3348 = class131.field1918;
            class15.field226 = class235.field3547;
            class268.field4204 = true;
            class237.field3578 = class207.field2994;
        } else {
            class15.field226 = class34.field494;
            class156.field2279 = class264.field3981;
            class237.field3578 = class33.field480;
            class224.field3348 = class100.field1491;
        }
        class104.method691(false);
        class211.method1346(126, class80.field1247);
        class240.method1566((byte) 125, class80.field1247);
        class27.field388 = class156.method1054(120);
        if (class27.field388 != null) {
            class27.field388.method84(class80.field1247, (byte) 78);
        }
        class177.field2516 = class83.field1286;
        try {
            if (class163.field2378.field1280 != null) {
                class135.field1964 = new class48(class163.field2378.field1280, 5200, 0);
                for (int var3 = 0; var3 < 28; var3++) {
                    class12.field193[var3] = new class48(class163.field2378.field1276[var3], 6000, 0);
                }
                class178.field2542 = new class48(class163.field2378.field1278, 6000, 0);
                class187.field2661 = new class141(255, class135.field1964, class178.field2542, 500000);
                class56.field859 = new class48(class163.field2378.field1269, 24, 0);
                class163.field2378.field1269 = null;
                class163.field2378.field1278 = null;
                class163.field2378.field1276 = null;
                class163.field2378.field1280 = null;
            }
        } catch (IOException var4) {
            class187.field2661 = null;
            class178.field2542 = null;
            class56.field859 = null;
            class135.field1964 = null;
        }
        if (class180.field2579 != 0) {
            class246.field3676 = true;
        }
        class288.field4564 = class181.field2598;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1435(byte arg0) {
        field3293++;
        if (class128.field1873 < class81.field1257.field3717) {
            class191.field2722 = (class81.field1257.field3717 - 1) * 50 * 5;
            if (class191.field2722 > 3000) {
                class191.field2722 = 3000;
            }
            if (class39.field581 == class224.field3349) {
                class224.field3349 = class132.field1939;
            } else {
                class224.field3349 = class39.field581;
            }
            if (class81.field1257.field3717 >= 2 && class81.field1257.field3719 == 6) {
                this.method1007("js5connect_outofdate", -2764);
                class192.field2754 = 1000;
                return;
            }
            if (class81.field1257.field3717 >= 4 && class81.field1257.field3719 == -1) {
                this.method1007("js5crc", -2764);
                class192.field2754 = 1000;
                return;
            }
            if (class81.field1257.field3717 >= 4 && (class192.field2754 == 0 || class192.field2754 == 5)) {
                if (class81.field1257.field3719 == 7 || class81.field1257.field3719 == 9) {
                    this.method1007("js5connect_full", arg0 ^ 0xAB3);
                } else if (class81.field1257.field3719 > 0) {
                    this.method1007("js5connect", -2764);
                } else {
                    this.method1007("js5io", -2764);
                }
                class192.field2754 = 1000;
                return;
            }
        }
        class128.field1873 = class81.field1257.field3717;
        if (class191.field2722 > 0) {
            class191.field2722--;
            return;
        }
        try {
            if (class68.field1059 == 0) {
                class190.field2707 = class163.field2378.method550(class60.field910, 32606, class224.field3349);
                class68.field1059++;
            }
            if (class68.field1059 == 1) {
                if (class190.field2707.field3588 == 2) {
                    this.method1434((byte) -73, 1000);
                    return;
                }
                if (class190.field2707.field3588 == 1) {
                    class68.field1059++;
                }
            }
            if (class68.field1059 == 2) {
                class163.field2373 = new class54((Socket) class190.field2707.field3585, class163.field2378);
                class114 var2 = new class114(5);
                var2.method775(15, -120);
                var2.method737(-2645, 534);
                class163.field2373.method356((byte) 13, var2.field1629, 0, 5);
                class68.field1059++;
                class152.field2195 = class287.method1928(27332);
            }
            if (class68.field1059 == 3) {
                if (class192.field2754 == 0 || class192.field2754 == 5 || class163.field2373.method357((byte) -111) > 0) {
                    int var3 = class163.field2373.method358(65);
                    if (var3 != 0) {
                        this.method1434((byte) -73, var3);
                        return;
                    }
                    class68.field1059++;
                } else if (class287.method1928(27332) - class152.field2195 > 30000L) {
                    this.method1434((byte) -73, 1001);
                    return;
                }
            }
            if (class68.field1059 == 4) {
                boolean var4 = class192.field2754 == 5 || class192.field2754 == 10 || class192.field2754 == 28;
                class81.field1257.method1626((byte) -101, class163.field2373, !var4);
                class190.field2707 = null;
                class68.field1059 = 0;
                class163.field2373 = null;
            }
        } catch (IOException var5) {
            this.method1434((byte) -73, 1002);
        }
        if (arg0 != -121) {
            this.method996((byte) 41);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lha;IIIIIII)V")
    public static final void method1436(class267[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class267 var9 = arg0[var8];
            if (var9 != null && var9.field4139 == arg1 && (!var9.field4039 || var9.field4149 == 0 || var9.field4027 || method1439(var9).field1395 != 0 || class219.field3231 == var9 || var9.field4104 == 1338) && (!var9.field4039 || !method1428(var9))) {
                int var10 = var9.field4173 + arg6;
                int var11 = var9.field4035 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4149 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4177 + var10;
                    int var17 = var9.field4051 + var11;
                    if (var9.field4149 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class273.field4357 == var9) {
                    class219.field3229 = true;
                    class37.field545 = var10;
                    class12.field186 = var11;
                }
                if (!var9.field4039 || var12 < var14 && var13 < var15) {
                    if (var9.field4149 == 0) {
                        if (!var9.field4039 && method1428(var9) && class250.field3790 != var9) {
                            continue;
                        }
                        if (var9.field4049 && class25.field345 >= var12 && class190.field2688 >= var13 && class25.field345 < var14 && class190.field2688 < var15) {
                            for (class234 var18 = (class234) class255.field3873.method656(108); var18 != null; var18 = (class234) class255.field3873.method650(127)) {
                                if (var18.field3534) {
                                    var18.method1706(-125);
                                    var18.field3531.field4191 = false;
                                }
                            }
                            if (class203.field2946 == 0) {
                                class273.field4357 = null;
                                class219.field3231 = null;
                            }
                            class193.field2766 = 0;
                        }
                    }
                    if (var9.field4039) {
                        boolean var19;
                        if (class25.field345 >= var12 && class190.field2688 >= var13 && class25.field345 < var14 && class190.field2688 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class137.field1987 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class200.field2894 == 1 && class279.field4465 >= var12 && class42.field602 >= var13 && class279.field4465 < var14 && class42.field602 < var15) {
                            var21 = true;
                        }
                        if (var9.field4096 != null) {
                            for (int var22 = 0; var22 < var9.field4096.length; var22++) {
                                if (class19.field267[var9.field4096[var22]]) {
                                    if (var9.field4021 == null || class82.field1267 >= var9.field4021[var22]) {
                                        byte var23 = var9.field4050[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class19.field267[86]) && ((var23 & 0x1) == 0 || class19.field267[82]) && ((var23 & 0x4) == 0 || class19.field267[81])) {
                                            class173.method1144(var22 + 1, 15119, var9.field4113, "", -1);
                                            int var24 = var9.field4129[var22];
                                            if (var9.field4021 == null) {
                                                var9.field4021 = new int[var9.field4096.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4021[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4021[var22] = class82.field1267 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4021 != null) {
                                    var9.field4021[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class263.method1752(class279.field4465 - var10, class42.field602 - var11, var9, (byte) -127);
                        }
                        if (class273.field4357 != null && class273.field4357 != var9 && var19 && method1439(var9).method625(-108)) {
                            class231.field3453 = var9;
                        }
                        if (class219.field3231 == var9) {
                            class70.field1091 = true;
                            class32.field472 = var10;
                            class142.field2060 = var11;
                        }
                        if (var9.field4027 || var9.field4104 != 0) {
                            if (var19 && class204.field2959 != 0 && var9.field4130 != null) {
                                class234 var25 = new class234();
                                var25.field3534 = true;
                                var25.field3531 = var9;
                                var25.field3519 = class204.field2959;
                                var25.field3530 = var9.field4130;
                                class255.field3873.method652(62, var25);
                            }
                            if (class273.field4357 != null || class16.field235 != null || class151.field2185 || var9.field4104 != 1400 && class193.field2766 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4104 != 0) {
                                if (var9.field4104 == 1337) {
                                    class21.field280 = var9;
                                    class217.method1396(false, var9);
                                    continue;
                                }
                                if (var9.field4104 == 1338) {
                                    if (var21) {
                                        class138.field2002 = class279.field4465 - var10;
                                        class21.field281 = class42.field602 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4104 == 1400) {
                                    class204.field2952 = var9;
                                    if (var21) {
                                        if (class19.field267[82] && class270.field4228 > 0) {
                                            int var26 = (int) ((double) (class279.field4465 - var10 - var9.field4177 / 2) * 2.0D / (double) class276.field4428);
                                            int var27 = (int) ((double) (class42.field602 - var11 - var9.field4051 / 2) * 2.0D / (double) class276.field4428);
                                            int var28 = class136.field1967 + var26;
                                            int var29 = class286.field4544 + var27;
                                            int var30 = class212.field3040 + var28;
                                            int var31 = class63.field1009 + class54.field828 - var29 - 1;
                                            class281.method1896(var31, 0, var30, 125);
                                            class173.method1140(false);
                                            continue;
                                        }
                                        class193.field2766 = 1;
                                        class123.field1786 = class25.field345;
                                        class35.field504 = class190.field2688;
                                        continue;
                                    }
                                    if (var20 && class193.field2766 > 0) {
                                        if (class193.field2766 == 1 && (class25.field345 != class123.field1786 || class35.field504 != class190.field2688)) {
                                            class34.field492 = class136.field1967;
                                            class195.field2812 = class286.field4544;
                                            class193.field2766 = 2;
                                        }
                                        if (class193.field2766 == 2) {
                                            class12.method104(-1, (int) ((double) (class123.field1786 - class25.field345) * 2.0D / (double) class9.field166) + class34.field492);
                                            class147.method986((int) ((double) (class35.field504 - class190.field2688) * 2.0D / (double) class9.field166) + class195.field2812, -13712);
                                        }
                                        continue;
                                    }
                                    class193.field2766 = 0;
                                    continue;
                                }
                                if (var9.field4104 == 1401) {
                                    if (var20) {
                                        class255.method1708((byte) 27, class190.field2688 - var11, var9.field4177, class25.field345 - var10, var9.field4051);
                                    }
                                    continue;
                                }
                                if (var9.field4104 == 1402) {
                                    class217.method1396(false, var9);
                                    continue;
                                }
                            }
                            if (!var9.field4121 && var21) {
                                var9.field4121 = true;
                                if (var9.field4128 != null) {
                                    class234 var32 = new class234();
                                    var32.field3534 = true;
                                    var32.field3531 = var9;
                                    var32.field3528 = class279.field4465 - var10;
                                    var32.field3519 = class42.field602 - var11;
                                    var32.field3530 = var9.field4128;
                                    class255.field3873.method652(105, var32);
                                }
                            }
                            if (var9.field4121 && var20 && var9.field4029 != null) {
                                class234 var33 = new class234();
                                var33.field3534 = true;
                                var33.field3531 = var9;
                                var33.field3528 = class25.field345 - var10;
                                var33.field3519 = class190.field2688 - var11;
                                var33.field3530 = var9.field4029;
                                class255.field3873.method652(59, var33);
                            }
                            if (var9.field4121 && !var20) {
                                var9.field4121 = false;
                                if (var9.field4099 != null) {
                                    class234 var34 = new class234();
                                    var34.field3534 = true;
                                    var34.field3531 = var9;
                                    var34.field3528 = class25.field345 - var10;
                                    var34.field3519 = class190.field2688 - var11;
                                    var34.field3530 = var9.field4099;
                                    class225.field3385.method652(67, var34);
                                }
                            }
                            if (var20 && var9.field4083 != null) {
                                class234 var35 = new class234();
                                var35.field3534 = true;
                                var35.field3531 = var9;
                                var35.field3528 = class25.field345 - var10;
                                var35.field3519 = class190.field2688 - var11;
                                var35.field3530 = var9.field4083;
                                class255.field3873.method652(90, var35);
                            }
                            if (!var9.field4191 && var19) {
                                var9.field4191 = true;
                                if (var9.field4168 != null) {
                                    class234 var36 = new class234();
                                    var36.field3534 = true;
                                    var36.field3531 = var9;
                                    var36.field3528 = class25.field345 - var10;
                                    var36.field3519 = class190.field2688 - var11;
                                    var36.field3530 = var9.field4168;
                                    class255.field3873.method652(125, var36);
                                }
                            }
                            if (var9.field4191 && var19 && var9.field4166 != null) {
                                class234 var37 = new class234();
                                var37.field3534 = true;
                                var37.field3531 = var9;
                                var37.field3528 = class25.field345 - var10;
                                var37.field3519 = class190.field2688 - var11;
                                var37.field3530 = var9.field4166;
                                class255.field3873.method652(103, var37);
                            }
                            if (var9.field4191 && !var19) {
                                var9.field4191 = false;
                                if (var9.field4101 != null) {
                                    class234 var38 = new class234();
                                    var38.field3534 = true;
                                    var38.field3531 = var9;
                                    var38.field3528 = class25.field345 - var10;
                                    var38.field3519 = class190.field2688 - var11;
                                    var38.field3530 = var9.field4101;
                                    class225.field3385.method652(77, var38);
                                }
                            }
                            if (var9.field4088 != null) {
                                class234 var39 = new class234();
                                var39.field3531 = var9;
                                var39.field3530 = var9.field4088;
                                class9.field165.method652(84, var39);
                            }
                            if (var9.field4117 != null && class286.field4542 > var9.field4157) {
                                if (var9.field4146 == null || class286.field4542 - var9.field4157 > 32) {
                                    class234 var44 = new class234();
                                    var44.field3531 = var9;
                                    var44.field3530 = var9.field4117;
                                    class255.field3873.method652(124, var44);
                                } else {
                                    label565: for (int var40 = var9.field4157; var40 < class286.field4542; var40++) {
                                        int var41 = class23.field295[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field4146.length; var42++) {
                                            if (var9.field4146[var42] == var41) {
                                                class234 var43 = new class234();
                                                var43.field3531 = var9;
                                                var43.field3530 = var9.field4117;
                                                class255.field3873.method652(67, var43);
                                                break label565;
                                            }
                                        }
                                    }
                                }
                                var9.field4157 = class286.field4542;
                            }
                            if (var9.field4176 != null && class128.field1885 > var9.field4103) {
                                if (var9.field4116 == null || class128.field1885 - var9.field4103 > 32) {
                                    class234 var49 = new class234();
                                    var49.field3531 = var9;
                                    var49.field3530 = var9.field4176;
                                    class255.field3873.method652(95, var49);
                                } else {
                                    label541: for (int var45 = var9.field4103; var45 < class128.field1885; var45++) {
                                        int var46 = class111.field1599[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field4116.length; var47++) {
                                            if (var9.field4116[var47] == var46) {
                                                class234 var48 = new class234();
                                                var48.field3531 = var9;
                                                var48.field3530 = var9.field4176;
                                                class255.field3873.method652(106, var48);
                                                break label541;
                                            }
                                        }
                                    }
                                }
                                var9.field4103 = class128.field1885;
                            }
                            if (var9.field4085 != null && class115.field1703 > var9.field4188) {
                                if (var9.field4025 == null || class115.field1703 - var9.field4188 > 32) {
                                    class234 var54 = new class234();
                                    var54.field3531 = var9;
                                    var54.field3530 = var9.field4085;
                                    class255.field3873.method652(124, var54);
                                } else {
                                    label517: for (int var50 = var9.field4188; var50 < class115.field1703; var50++) {
                                        int var51 = class284.field4527[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field4025.length; var52++) {
                                            if (var9.field4025[var52] == var51) {
                                                class234 var53 = new class234();
                                                var53.field3531 = var9;
                                                var53.field3530 = var9.field4085;
                                                class255.field3873.method652(95, var53);
                                                break label517;
                                            }
                                        }
                                    }
                                }
                                var9.field4188 = class115.field1703;
                            }
                            if (var9.field4024 != null && class209.field3011 > var9.field4045) {
                                if (var9.field4044 == null || class209.field3011 - var9.field4045 > 32) {
                                    class234 var59 = new class234();
                                    var59.field3531 = var9;
                                    var59.field3530 = var9.field4024;
                                    class255.field3873.method652(127, var59);
                                } else {
                                    label493: for (int var55 = var9.field4045; var55 < class209.field3011; var55++) {
                                        int var56 = class149.field2128[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field4044.length; var57++) {
                                            if (var9.field4044[var57] == var56) {
                                                class234 var58 = new class234();
                                                var58.field3531 = var9;
                                                var58.field3530 = var9.field4024;
                                                class255.field3873.method652(50, var58);
                                                break label493;
                                            }
                                        }
                                    }
                                }
                                var9.field4045 = class209.field3011;
                            }
                            if (var9.field4069 != null && class152.field2189 > var9.field4124) {
                                if (var9.field4145 == null || class152.field2189 - var9.field4124 > 32) {
                                    class234 var64 = new class234();
                                    var64.field3531 = var9;
                                    var64.field3530 = var9.field4069;
                                    class255.field3873.method652(57, var64);
                                } else {
                                    label469: for (int var60 = var9.field4124; var60 < class152.field2189; var60++) {
                                        int var61 = class114.field1656[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field4145.length; var62++) {
                                            if (var9.field4145[var62] == var61) {
                                                class234 var63 = new class234();
                                                var63.field3531 = var9;
                                                var63.field3530 = var9.field4069;
                                                class255.field3873.method652(68, var63);
                                                break label469;
                                            }
                                        }
                                    }
                                }
                                var9.field4124 = class152.field2189;
                            }
                            if (class57.field884 > var9.field4098 && var9.field4189 != null) {
                                class234 var65 = new class234();
                                var65.field3531 = var9;
                                var65.field3530 = var9.field4189;
                                class255.field3873.method652(96, var65);
                            }
                            if (class113.field1611 > var9.field4098 && var9.field4182 != null) {
                                class234 var66 = new class234();
                                var66.field3531 = var9;
                                var66.field3530 = var9.field4182;
                                class255.field3873.method652(112, var66);
                            }
                            if (class32.field466 > var9.field4098 && var9.field4078 != null) {
                                class234 var67 = new class234();
                                var67.field3531 = var9;
                                var67.field3530 = var9.field4078;
                                class255.field3873.method652(87, var67);
                            }
                            if (class45.field639 > var9.field4098 && var9.field4171 != null) {
                                class234 var68 = new class234();
                                var68.field3531 = var9;
                                var68.field3530 = var9.field4171;
                                class255.field3873.method652(97, var68);
                            }
                            if (class108.field1559 > var9.field4098 && var9.field4180 != null) {
                                class234 var69 = new class234();
                                var69.field3531 = var9;
                                var69.field3530 = var9.field4180;
                                class255.field3873.method652(90, var69);
                            }
                            var9.field4098 = class213.field3063;
                            if (var9.field4183 != null) {
                                for (int var70 = 0; var70 < class277.field4444; var70++) {
                                    class234 var71 = new class234();
                                    var71.field3531 = var9;
                                    var71.field3532 = class185.field2637[var70];
                                    var71.field3537 = class141.field2044[var70];
                                    var71.field3530 = var9.field4183;
                                    class255.field3873.method652(108, var71);
                                }
                            }
                            if (class55.field840 && var9.field4034 != null) {
                                class234 var72 = new class234();
                                var72.field3531 = var9;
                                var72.field3530 = var9.field4034;
                                class255.field3873.method652(61, var72);
                            }
                        }
                    }
                    if (!var9.field4039 && class273.field4357 == null && class16.field235 == null && !class151.field2185) {
                        if ((var9.field4131 >= 0 || var9.field4053 != 0) && class25.field345 >= var12 && class190.field2688 >= var13 && class25.field345 < var14 && class190.field2688 < var15) {
                            if (var9.field4131 >= 0) {
                                class250.field3790 = arg0[var9.field4131];
                            } else {
                                class250.field3790 = var9;
                            }
                        }
                        if (var9.field4149 == 8 && class25.field345 >= var12 && class190.field2688 >= var13 && class25.field345 < var14 && class190.field2688 < var15) {
                            class15.field221 = var9;
                        }
                        if (var9.field4134 > var9.field4051) {
                            class276.method1859(class190.field2688, 57, var11, var9.field4051, var9, var9.field4134, var9.field4177 + var10, class25.field345);
                        }
                    }
                    if (var9.field4149 == 0) {
                        method1436(arg0, var9.field4113, var12, var13, var14, var15, var10 - var9.field4059, var11 - var9.field4140);
                        if (var9.field4160 != null) {
                            method1436(var9.field4160, var9.field4113, var12, var13, var14, var15, var10 - var9.field4059, var11 - var9.field4140);
                        }
                        class261 var73 = (class261) class128.field1874.method1218((long) var9.field4113, 124);
                        if (var73 != null) {
                            class247.method1622(var15, var73.field3940, var13, var11, var10, var12, var14, (byte) 87);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method995(int arg0) {
        field3296++;
        if (class192.field2754 == 1000) {
            return;
        }
        class82.field1267++;
        if (arg0 != -11721) {
            field3297 = true;
        }
        if ((class82.field1267 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class118.field1731 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class25.field334.setSeed((long) class118.field1731);
        }
        this.method1432(arg0 + 11721);
        if (class209.field3014 != null) {
            class209.field3014.method1479(0);
        }
        class190.method1214((byte) 121);
        class270.method1804(10288);
        class182.method1176(-28556);
        class130.method898(50);
        if (class27.field388 != null) {
            int var3 = class27.field388.method83(arg0 + 11844);
            class204.field2959 = var3;
        }
        if (class192.field2754 == 0) {
            this.method1438((byte) -34);
            class32.method231((byte) 115);
        } else if (class192.field2754 == 5) {
            this.method1438((byte) -26);
            class32.method231((byte) 51);
        } else if (class192.field2754 == 25 || class192.field2754 == 28) {
            class203.method1316(arg0 + 28093);
        }
        if (class192.field2754 == 10) {
            this.method1437(-115);
            class162.method1085((byte) 127);
            class107.method707(2);
            class283.method1909((byte) -78);
        } else if (class192.field2754 == 30) {
            class35.method243(arg0 ^ 0xFFFFA868);
        } else if (class192.field2754 == 40) {
            class283.method1909((byte) -78);
            if (class118.field1741 != -3) {
                if (class118.field1741 == 15) {
                    class282.method1900((byte) -6);
                } else if (class118.field1741 != 2) {
                    class178.method1157(true);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1437(int arg0) {
        class277.field4444 = 0;
        field3290++;
        if (arg0 >= -100) {
            field3297 = false;
        }
        while (class71.method483(1) && class277.field4444 < 128) {
            class185.field2637[class277.field4444] = class7.field152;
            class141.field2044[class277.field4444] = class247.field3692;
            class277.field4444++;
        }
        class38.field566++;
        if (class193.field2774 != -1) {
            class247.method1622(class250.field3813, class193.field2774, 0, 0, 0, 0, class214.field3080, (byte) 69);
        }
        class213.field3063++;
        class55.method367(-1);
        while (true) {
            class234 var2;
            class267 var3;
            class267 var4;
            do {
                var2 = (class234) class9.field165.method653((byte) 111);
                if (var2 == null) {
                    while (true) {
                        class234 var5;
                        class267 var6;
                        class267 var7;
                        do {
                            var5 = (class234) class225.field3385.method653((byte) 103);
                            if (var5 == null) {
                                while (true) {
                                    class234 var8;
                                    class267 var9;
                                    class267 var10;
                                    do {
                                        var8 = (class234) class255.field3873.method653((byte) 116);
                                        if (var8 == null) {
                                            if (class273.field4357 != null) {
                                                class86.method592(3647);
                                            }
                                            if (class184.field2631 != null && class184.field2631.field3588 == 1) {
                                                if (class184.field2631.field3585 != null) {
                                                    class114.method788((byte) -36, class211.field3032, class96.field1457);
                                                }
                                                class184.field2631 = null;
                                                class211.field3032 = false;
                                                class96.field1457 = null;
                                            }
                                            if ((class82.field1267 % 1500) == 0) {
                                                class214.method1371(-127);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field3531;
                                        if (var9.field4058 < 0) {
                                            break;
                                        }
                                        var10 = class282.method1897(var9.field4139, 87);
                                    } while (var10 == null || var10.field4160 == null || var9.field4058 >= var10.field4160.length || var10.field4160[var9.field4058] != var9);
                                    class15.method118((byte) 74, var8);
                                }
                            }
                            var6 = var5.field3531;
                            if (var6.field4058 < 0) {
                                break;
                            }
                            var7 = class282.method1897(var6.field4139, 120);
                        } while (var7 == null || var7.field4160 == null || var7.field4160.length <= var6.field4058 || var7.field4160[var6.field4058] != var6);
                        class15.method118((byte) 105, var5);
                    }
                }
                var3 = var2.field3531;
                if (var3.field4058 < 0) {
                    break;
                }
                var4 = class282.method1897(var3.field4139, 72);
            } while (var4 == null || var4.field4160 == null || var4.field4160.length <= var3.field4058 || var4.field4160[var3.field4058] != var3);
            class15.method118((byte) 54, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method999(byte arg0) {
        field3302++;
        if (class192.field2754 == 1000) {
            return;
        }
        boolean var2 = class150.method1013((byte) -50);
        if (arg0 <= 30) {
            method1436((class267[]) null, -79, 98, 125, 11, -89, -114, -41);
        }
        if (var2 && class200.field2884 && class217.field3198 != null) {
            class217.field3198.method1448(-96);
        }
        if ((class192.field2754 == 30 || class192.field2754 == 10) && (class248.field3729 || class114.field1681 != 0L && class287.method1928(27332) > class114.field1681)) {
            class122.method832(0, class194.field2784, class13.field199, class24.method178(-16648), class248.field3729);
        }
        if (class166.field2415 == null) {
            Container var3;
            if (class166.field2415 != null) {
                var3 = class166.field2415;
            } else if (class282.field4503 == null) {
                var3 = class163.field2378.field1273;
            } else {
                var3 = class282.field4503;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class282.field4503 == var3) {
                Insets var6 = class282.field4503.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class286.field4545 != var4 || class191.field2735 != var5) {
                if (class83.field1270.startsWith("mac")) {
                    class286.field4545 = var4;
                    class191.field2735 = var5;
                } else {
                    class48.method320(119);
                }
                class114.field1681 = class287.method1928(27332) + 500L;
            }
        }
        boolean var7 = false;
        if (field3297) {
            var7 = true;
            field3297 = false;
        }
        if (var7) {
            method1441(true);
        }
        if (class192.field2754 == 0) {
            class26.method192(class33.field482, var7, 1941262274, class48.field704, (Color) null);
        } else if (class192.field2754 == 5) {
            class134.method912((byte) -65, class179.field2556, false);
        } else if (class192.field2754 == 10) {
            class255.method1709((byte) -128);
        } else if (class192.field2754 == 25 || class192.field2754 == 28) {
            if (class35.field525 == 1) {
                if (class245.field3673 > class93.field1408) {
                    class93.field1408 = class245.field3673;
                }
                int var9 = (class93.field1408 - class245.field3673) * 50 / class93.field1408;
                class69.method474(false, class86.field1333 + "<br>(" + var9 + "%)", true);
            } else if (class35.field525 == 2) {
                if (class264.field3973 > class242.field3650) {
                    class242.field3650 = class264.field3973;
                }
                int var8 = (class242.field3650 - class264.field3973) * 50 / class242.field3650 + 50;
                class69.method474(false, class86.field1333 + "<br>(" + var8 + "%)", true);
            } else {
                class69.method474(false, class86.field1333, true);
            }
        } else if (class192.field2754 == 30) {
            class57.method384((byte) -112);
        } else if (class192.field2754 == 40) {
            class69.method474(false, class55.field846 + "<br>" + class227.field3409, true);
        }
        if ((class192.field2754 == 30 || class192.field2754 == 10) && class222.field3305 == 0 && !var7) {
            try {
                Graphics var10 = class80.field1247.getGraphics();
                for (int var11 = 0; var11 < class220.field3252; var11++) {
                    if (class119.field1753[var11]) {
                        class251.field3828.method206(class263.field3964[var11], class109.field1579[var11], (byte) -114, class1.field4[var11], var10, class99.field1480[var11]);
                        class119.field1753[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class80.field1247.repaint();
            }
        } else if (class192.field2754 != 0) {
            try {
                Graphics var12 = class80.field1247.getGraphics();
                class251.field3828.method201((byte) -84, var12, 0, 0);
                for (int var13 = 0; var13 < class220.field3252; var13++) {
                    class119.field1753[var13] = false;
                }
            } catch (Exception var14) {
                class80.field1247.repaint();
            }
        }
        if (class193.field2762) {
            class17.method126(5);
        }
        if (class207.field2997 && class192.field2754 == 10 && class193.field2774 != -1) {
            class207.field2997 = false;
            class285.method1920(class163.field2378, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method1438(byte arg0) {
        field3303++;
        if (!class207.field2997) {
            label233: while (true) {
                do {
                    if (!class71.method483(1)) {
                        break label233;
                    }
                } while (class247.field3692 != 's' && class247.field3692 != 'S');
                class207.field2997 = true;
            }
        }
        if (class109.field1567 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class287.method1928(27332);
            if (class52.field759 == 0L) {
                class52.field759 = var4;
            }
            if (var3 > 16384 && var4 - class52.field759 < 5000L) {
                if (var4 - class257.field3899 > 1000L) {
                    System.gc();
                    class257.field3899 = var4;
                }
                class48.field704 = 5;
                class33.field482 = class23.field309;
            } else {
                class33.field482 = class273.field4341;
                class48.field704 = 5;
                class109.field1567 = 10;
            }
        } else if (class109.field1567 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class246.field3681[var6] = new class86(104, 104);
            }
            class109.field1567 = 30;
            class48.field704 = 10;
            class33.field482 = class51.field746;
        } else if (class109.field1567 == 30) {
            if (class209.field3014 == null) {
                class209.field3014 = new class226(class81.field1257, class37.field551);
            }
            if (class209.field3014.method1475((byte) -111)) {
                class118.field1727 = class232.method1504(0, true, true, false, true);
                class246.field3675 = class232.method1504(1, true, true, false, true);
                class155.field2275 = class232.method1504(2, true, false, true, true);
                class181.field2597 = class232.method1504(3, true, true, false, true);
                class67.field1040 = class232.method1504(4, true, true, false, true);
                class136.field1971 = class232.method1504(5, true, true, true, true);
                class53.field777 = class232.method1504(6, false, true, true, true);
                class26.field378 = class232.method1504(7, true, true, false, true);
                class45.field634 = class232.method1504(8, true, true, false, true);
                class65.field1024 = class232.method1504(9, true, true, false, true);
                class37.field557 = class232.method1504(10, true, true, false, true);
                class211.field3030 = class232.method1504(11, true, true, false, true);
                class236.field3557 = class232.method1504(12, true, true, false, true);
                class10.field179 = class232.method1504(13, true, true, false, true);
                class190.field2705 = class232.method1504(14, false, true, false, true);
                class243.field3659 = class232.method1504(15, true, true, false, true);
                class175.field2496 = class232.method1504(16, true, true, false, true);
                class225.field3388 = class232.method1504(17, true, true, false, true);
                class257.field3908 = class232.method1504(18, true, true, false, true);
                class94.field1434 = class232.method1504(19, true, true, false, true);
                class149.field2150 = class232.method1504(20, true, true, false, true);
                class128.field1884 = class232.method1504(21, true, true, false, true);
                class210.field3027 = class232.method1504(22, true, true, false, true);
                class132.field1936 = class232.method1504(23, true, true, true, true);
                class234.field3533 = class232.method1504(24, true, true, false, true);
                class242.field3648 = class232.method1504(25, true, true, false, true);
                class123.field1787 = class232.method1504(26, true, true, true, true);
                class138.field2003 = class232.method1504(27, true, true, false, true);
                class48.field704 = 15;
                class33.field482 = class78.field1209;
                class109.field1567 = 40;
            } else {
                class48.field704 = 12;
                class33.field482 = class140.field2027;
            }
        } else if (class109.field1567 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class90.field1371[var8].method1388(true) * class30.field420[var8] / 100;
            }
            if (var7 == 100) {
                class33.field482 = class262.field3946;
                class48.field704 = 20;
                class161.method1083(class45.field634, -27);
                class110.method719((byte) 57, class45.field634);
                class35.method247(class45.field634, 7);
                class109.field1567 = 45;
            } else {
                class48.field704 = 20;
                if (var7 != 0) {
                    class33.field482 = class248.field3722 + var7 + "%";
                }
            }
        } else if (class109.field1567 == 45) {
            class89.method607(2, 22050, 3, class195.field2797);
            class213.field3069 = new class61();
            class213.field3069.method406(128, 9, 0);
            class217.field3198 = class43.method297(22050, class163.field2378, class80.field1247, 256, 0);
            class217.field3198.method1450(class213.field3069, 2000);
            class150.method1015(class67.field1040, class243.field3659, class190.field2705, class213.field3069, 10);
            class240.field3599 = class43.method297(2048, class163.field2378, class80.field1247, 256, 1);
            class152.field2201 = new class41();
            class240.field3599.method1450(class152.field2201, 2000);
            class101.field1510 = new class154(22050, class276.field4426);
            class87.field1345 = class53.field777.method1522(7233, "scape main");
            class33.field482 = class43.field627;
            class109.field1567 = 50;
            class48.field704 = 30;
        } else if (class109.field1567 == 50) {
            int var9 = class29.method213(class45.field634, (byte) 59, class10.field179);
            int var10 = class102.method683((byte) 105);
            if (var10 > var9) {
                class48.field704 = 35;
                class33.field482 = class110.field1591 + var9 * 100 / var10 + "%";
            } else {
                class48.field704 = 35;
                class33.field482 = class123.field1781;
                class109.field1567 = 60;
            }
        } else if (class109.field1567 == 60) {
            int var11 = class62.method436(class45.field634, (byte) 34);
            int var12 = class56.method379(true);
            if (var12 > var11) {
                class33.field482 = class176.field2504 + var11 * 100 / var12 + "%";
                class48.field704 = 40;
            } else {
                class33.field482 = class80.field1238;
                class48.field704 = 40;
                class109.field1567 = 65;
            }
        } else if (class109.field1567 == 65) {
            class58.method388((byte) -45, class45.field634, class10.field179);
            class33.field482 = class194.field2795;
            class48.field704 = 45;
            class245.method1608((byte) 84, 5);
            class109.field1567 = 70;
        } else if (class109.field1567 == 70) {
            class155.field2275.method1528((byte) -108);
            byte var13 = 0;
            int var14 = var13 + class155.field2275.method1535((byte) -100);
            class175.field2496.method1528((byte) -98);
            int var15 = var14 + class175.field2496.method1535((byte) 125);
            class225.field3388.method1528((byte) -101);
            int var16 = var15 + class225.field3388.method1535((byte) 55);
            class257.field3908.method1528((byte) -79);
            int var17 = var16 + class257.field3908.method1535((byte) -96);
            class94.field1434.method1528((byte) -112);
            int var18 = var17 + class94.field1434.method1535((byte) 124);
            class149.field2150.method1528((byte) -85);
            int var19 = var18 + class149.field2150.method1535((byte) -112);
            class128.field1884.method1528((byte) -61);
            int var20 = var19 + class128.field1884.method1535((byte) -75);
            class210.field3027.method1528((byte) -116);
            int var21 = var20 + class210.field3027.method1535((byte) -122);
            class234.field3533.method1528((byte) -113);
            int var22 = var21 + class234.field3533.method1535((byte) -99);
            class242.field3648.method1528((byte) -67);
            int var23 = var22 + class242.field3648.method1535((byte) 53);
            class138.field2003.method1528((byte) -75);
            int var24 = var23 + class138.field2003.method1535((byte) -112);
            if (var24 < 1100) {
                class33.field482 = class124.field1809 + var24 / 11 + "%";
                class48.field704 = 50;
            } else {
                class75.method501(class155.field2275, 92);
                class88.method598((byte) 107, class155.field2275);
                class56.method375(-1, class155.field2275);
                class250.method1638(class155.field2275, class26.field378, false);
                class13.method112(class175.field2496, class26.field378, (byte) 120, true);
                class286.method1927(class257.field3908, 0, class26.field378);
                class267.method1782(class94.field1434, 19523, class26.field378, class43.field624, true);
                class251.method1658(true, class155.field2275);
                class168.method1112(class118.field1727, class246.field3675, false, class149.field2150);
                class153.method1033(class155.field2275, 0);
                class73.method493(class128.field1884, class26.field378, 1);
                class173.method1137(class210.field3027, false);
                class229.method1494(-20713, class155.field2275);
                class197.method1260(class26.field378, class181.field2597, class45.field634, class10.field179, 48);
                class148.method992(-90, class155.field2275);
                class97.method654((byte) -124, class225.field3388);
                class221.method1421(new class100(), class242.field3648, -1, class234.field3533);
                class43.method298(class242.field3648, 37, class234.field3533);
                class155.method1050(3, class155.field2275);
                class121.method828(class45.field634, class155.field2275, 86);
                class42.method288(21, class155.field2275, class45.field634);
                class48.field704 = 50;
                class33.field482 = class123.field1784;
                class160.method1074((byte) 124);
                class109.field1567 = 80;
            }
        } else if (class109.field1567 == 80) {
            int var25 = class74.method499(class45.field634, 0);
            int var26 = class205.method1324(false);
            if (var25 < var26) {
                class48.field704 = 60;
                class33.field482 = class72.field1116 + var25 * 100 / var26 + "%";
            } else {
                class150.method1011(class45.field634, (byte) -126);
                class33.field482 = class48.field697;
                class48.field704 = 60;
                class109.field1567 = 90;
            }
        } else if (class109.field1567 == 90) {
            if (class123.field1787.method1528((byte) -108)) {
                class242 var27 = new class242(class65.field1024, class123.field1787, class45.field634, 20, !class193.field2760);
                class18.method143(var27);
                if (class92.field1401 == 1) {
                    class18.method139(0.9F);
                }
                if (class92.field1401 == 2) {
                    class18.method139(0.8F);
                }
                if (class92.field1401 == 3) {
                    class18.method139(0.7F);
                }
                if (class92.field1401 == 4) {
                    class18.method139(0.6F);
                }
                class48.field704 = 70;
                class109.field1567 = 100;
                class33.field482 = class203.field2942;
            } else {
                class33.field482 = class91.field1385 + class123.field1787.method1535((byte) 58) + "%";
                class48.field704 = 70;
            }
        } else if (class109.field1567 == 100) {
            if (class277.method1864(class45.field634, 127)) {
                class109.field1567 = 110;
            }
        } else if (class109.field1567 == 110) {
            class124.field1807 = new class130();
            class163.field2378.method553(class124.field1807, false, 10);
            class109.field1567 = 120;
            class33.field482 = class13.field208;
            class48.field704 = 75;
        } else if (class109.field1567 == 120) {
            if (class37.field557.method1531("huffman", 11716, "")) {
                class81 var28 = new class81(class37.field557.method1511(-21698, "huffman", ""));
                class67.method459(-1, var28);
                class33.field482 = class39.field586;
                class109.field1567 = 130;
                class48.field704 = 80;
            } else {
                class33.field482 = class194.field2787 + "0%";
                class48.field704 = 80;
            }
        } else if (class109.field1567 != 130) {
            if (arg0 > -19) {
                this.method995(-23);
            }
            if (class109.field1567 == 135) {
                int var29 = class269.method1798(6);
                if (var29 == -1) {
                    class48.field704 = 95;
                    class33.field482 = class58.field895;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1007("worldlistfull", -2764);
                    class245.method1608((byte) 84, 1000);
                } else if (class56.field862) {
                    class48.field704 = 96;
                    class109.field1567 = 140;
                    class33.field482 = class16.field232;
                } else {
                    this.method1007("worldlistio_" + var29, -2764);
                    class245.method1608((byte) 84, 1000);
                }
            } else if (class109.field1567 == 140) {
                class259.field3925 = class181.field2597.method1522(7233, "loginscreen");
                class136.field1971.method1516(false, true, true);
                class53.field777.method1516(true, true, true);
                class45.field634.method1516(true, true, true);
                class10.field179.method1516(true, true, true);
                class37.field557.method1516(true, true, true);
                class181.field2597.method1516(true, true, true);
                class48.field704 = 97;
                class109.field1567 = 150;
                class193.field2762 = true;
                class33.field482 = class155.field2263;
            } else if (class109.field1567 == 150) {
                if (class207.field2997) {
                    class161.field2333 = 0;
                    class148.field2112 = 0;
                    class185.field2645 = 0;
                    class243.field3661 = 0;
                }
                class207.field2997 = true;
                class285.method1920(class163.field2378, (byte) -122);
                class122.method832(0, -1, -1, class161.field2333, false);
                class109.field1567 = 160;
                class33.field482 = class163.field2366;
                class48.field704 = 100;
            } else if (class109.field1567 == 160) {
                class283.method1902(true, 86);
            }
        } else if (!class181.field2597.method1528((byte) -97)) {
            class33.field482 = class42.field611 + class181.field2597.method1535((byte) -67) * 3 / 4 + "%";
            class48.field704 = 85;
        } else if (!class236.field3557.method1528((byte) -96)) {
            class33.field482 = class42.field611 + (class236.field3557.method1535((byte) -88) / 10 + 75) + "%";
            class48.field704 = 85;
        } else if (!class10.field179.method1528((byte) -98)) {
            class33.field482 = class42.field611 + ((class10.field179.method1535((byte) 43) / 20) + 85) + "%";
            class48.field704 = 85;
        } else if (class132.field1936.method1533("details", 0)) {
            class170.method1124(0, class158.field2301, class132.field1936);
            class48.field704 = 95;
            class109.field1567 = 135;
            class33.field482 = class166.field2424;
        } else {
            class33.field482 = class42.field611 + (class132.field1936.method1532("details", 1) / 10 + 90) + "%";
            class48.field704 = 85;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lha;)Ldc;")
    public static final class92 method1439(class267 arg0) {
        class92 var1 = (class92) class53.field780.method1218(((long) arg0.field4113 << 32) + (long) arg0.field4058, 125);
        return var1 == null ? arg0.field4046 : var1;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public static void method1440(byte arg0) {
        if (arg0 == -59) {
            field3301 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public static final void method1441(boolean arg0) {
        field3287++;
        int var1 = class290.field4581;
        int var2 = class23.field294;
        int var3 = class191.field2735 - var2 - class250.field3813;
        if (!arg0) {
            return;
        }
        int var4 = class286.field4545 - class214.field3080 - var1;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class166.field2415 != null) {
                var6 = class166.field2415;
            } else if (class282.field4503 == null) {
                var6 = class163.field2378.field1273;
            } else {
                var6 = class282.field4503;
            }
            int var7 = 0;
            if (class282.field4503 == var6) {
                Insets var8 = class282.field4503.getInsets();
                var7 = var8.top;
                var5 = var8.left;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var7, var1, class191.field2735);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var7, class286.field4545, var2);
            }
            if (var4 > 0) {
                var9.fillRect(var5 + class286.field4545 - var4, var7, var4, class191.field2735);
            }
            if (var3 > 0) {
                var9.fillRect(var5, class191.field2735 + var7 - var3, class286.field4545, var3);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
    public static final int method1442(byte arg0, int arg1, int arg2, int arg3) {
        field3295++;
        int var4 = -42 % ((arg0 - 71) / 43);
        if ((class189.field2684[arg1][arg3][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class189.field2684[1][arg3][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }
}
