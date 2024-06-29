import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class185 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lwa;")
    public static class219 field1771 = new class219(512);

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lsb;")
    public static class98 field1783 = class47.method368("<img=1>", 0);

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lac;")
    public static class188 field1782;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lub;")
    public static class8 field1781;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lq;)I")
    public static final int method761(class148 arg0) {
        class224 var1 = (class224) field1771.method1511((byte) -122, ((long) arg0.field2728 << 32) + (long) arg0.field2651);
        return var1 == null ? arg0.field2593 : var1.field3858;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lq;)Z")
    public static final boolean method762(class148 arg0) {
        if (class186.field3207) {
            if (method761(arg0) != 0) {
                return false;
            }
            if (arg0.field2665 == 0) {
                return false;
            }
        }
        return arg0.field2620;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class156.method1131(1);
            }
            class85.field1502 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class132.field2346 = 0;
            } else if (arg0[1].equals("office")) {
                class132.field2346 = 1;
            } else if (arg0[1].equals("local")) {
                class132.field2346 = 2;
            } else {
                class156.method1131(1);
            }
            if (arg0[2].equals("live")) {
                class242.field4202 = 0;
            } else if (arg0[2].equals("rc")) {
                class242.field4202 = 1;
            } else if (arg0[2].equals("wip")) {
                class242.field4202 = 2;
            } else {
                class156.method1131(1);
            }
            if (arg0[4].equals("free")) {
                class119.field2139 = false;
            } else if (arg0[4].equals("members")) {
                class119.field2139 = true;
            } else {
                class156.method1131(1);
            }
            if (arg0[5].equals("english")) {
                class76.field1355 = 0;
            } else if (arg0[5].equals("german")) {
                class177.method1230(true);
                class76.field1355 = 1;
            } else {
                class156.method1131(1);
            }
            if (arg0[6].equals("game0")) {
                class245.field4315 = 0;
            } else if (arg0[6].equals("game1")) {
                class245.field4315 = 1;
            } else {
                class156.method1131(1);
            }
            if (arg0.length != 8) {
                class222.field3819 = false;
            } else if (arg0[7].equals("safemode")) {
                class222.field3819 = true;
            } else {
                class156.method1131(1);
            }
            class85.field1507 = "127.0.0.1";
            class154.field2809 = class233.field4011;
            class184.field3166 = 0;
            client var1 = new client();
            var1.method1279(503, 27, class242.field4202 + 32, "runescape", 510, 2094, 765);
            class72.field1195.setLocation(40, 40);
        } catch (Exception var3) {
            class243.method1678((String) null, var3, (byte) -120);
        }
        field1776++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method763(byte arg0) {
        method773(arg0 ^ 0x73);
        class98.method721(10);
        field1773++;
        class221.method1529((byte) -96);
        class150.method1110(1);
        class252.method1744(4);
        class185.method1280(arg0 ^ 0x7A);
        class206.method1394(-107);
        class239.method1633(55);
        class251.method1739(20823);
        class88.method658((byte) 120);
        class216.method1440(-63);
        class102.method789(false);
        class188.method1299(1);
        class43.method347(0);
        class171.method1208(arg0 ^ 0x78);
        class226.method1555(true);
        class108.method824(64);
        class70.method482(-16166);
        class48.method374(false);
        class72.method511(65536);
        class148.method1084((byte) -113);
        class192.method1325(arg0 ^ 0x78);
        class219.method1512(4);
        class167.method1190(-9812);
        class86.method639(0);
        class46.method364((byte) -115);
        class82.method614(arg0 ^ 0x6A);
        class8.method81(6136);
        class229.method1584(122);
        class80.method598(-20876);
        class87.method648(100);
        class138.method1037(true);
        class255.method1767(125);
        class71.method492(33);
        class262.method1792(10);
        class120.method890((byte) 121);
        class34.method293(-22061);
        class235.method1606((byte) 51);
        class15.method118((byte) 21);
        class116.method869(-100);
        class218.method1504(arg0 ^ 0xFFFFFFC6);
        class232.method1591((byte) -67);
        class176.method1227((byte) 127);
        class64.method459(arg0 ^ 0x310C);
        class101.method780(0);
        class25.method265((byte) -94);
        class141.method1058(true);
        class21.method234(-91);
        class51.method390((byte) -29);
        class144.method1068((byte) 114);
        class75.method560(false);
        class240.method1650();
        class122.method908(true);
        class245.method1698(arg0 + 134);
        class58.method425();
        class85.method635(arg0 - 188);
        class106.method816(-1536);
        class164.method1185((byte) 101);
        class52.method394(arg0 - 122);
        class198.method1353((byte) -2);
        class117.method876(230);
        class137.method1027(1);
        class110.method833((byte) -118);
        class12.method107(arg0 ^ 0xFFFFFFEC);
        class174.method1221(-22039);
        class73.method538();
        class104.method800((byte) 9);
        class14.method116(15581);
        class74.method548(arg0 - 134);
        class119.method887((byte) 49);
        class225.method1552((byte) -128);
        class207.method1396((byte) 20);
        class53.method395((byte) -35);
        class205.method1384((byte) -78);
        class59.method432((byte) 25);
        class42.method335();
        class202.method1365((byte) 120);
        class190.method1314((byte) 100);
        class16.method147(0);
        class160.method1161();
        class128.method959();
        class91.method670(false);
        class166.method1187((byte) -72);
        class246.method1706(-58);
        class31.method283(-85);
        class212.method1420(true);
        class250.method1733((byte) 87);
        class38.method314();
        class115.method862(1);
        class236.method1617((byte) 40);
        class79.method594(-1);
        class33.method292(false);
        class78.method592(-82);
        class127.method948();
        class183.method1265(false);
        class234.method1601(121);
        class90.method664(124);
        class55.method404((byte) -89);
        class103.method797((byte) -97);
        class242.method1667(arg0 - 29703);
        class131.method989((byte) -79);
        class45.method355(32559);
        class260.method1778(0);
        class136.method1023(-60);
        class49.method383(-59);
        class112.method845(-75);
        class203.method1372((byte) 22);
        class191.method1321(-100);
        class93.method682((byte) 120);
        class133.method1003(-257);
        class132.method998(121);
        class61.method445(-1);
        class228.method1573(-326);
        class20.method221(125);
        class177.method1231(32);
        class13.method111(-93);
        class210.method1412(0);
        class214.method1429((byte) -32);
        class100.method758((byte) 82);
        class28.method270(arg0 ^ 0xFFFFE02F);
        class143.method1066((byte) 29);
        class54.method400(-1);
        class95.method689(arg0 + 3);
        class211.method1416(32);
        class134.method1007((byte) -126);
        class56.method410(101);
        class60.method436(23440);
        class83.method625((byte) -51);
        class180.method1243(false);
        class18.method169(4642031);
        class7.method44();
        class37.method306(-31938);
        class184.method1268(-92);
        class62.method451(arg0 ^ 0x78);
        class76.method582(false);
        class233.method1597((byte) -105);
        class224.method1546(5);
        class9.method92((byte) -76);
        class248.method1725(arg0 - 972372212);
        class227.method1570(-120);
        class97.method695(-24454);
        class197.method1347(1000);
        class109.method829((byte) 107);
        class249.method1729(32);
        class173.method1219((byte) 123);
        class153.method1118(119);
        class23.method245(123);
        class146.method1079(93);
        class129.method982((byte) -93);
        class6.method41((byte) 97);
        class158.method1142((byte) 36);
        class44.method353((byte) 89);
        class264.method1797((byte) 127);
        class181.method1252((byte) -56);
        class178.method1235(arg0 - 239);
        class149.method1101();
        class209.method1407();
        class241.method1666();
        class123.method917();
        class208.method1404(arg0 - 121);
        class11.method104(arg0 - 122);
        class99.method754(false);
        class40.method325();
        class29.method278();
        class126.method935(-33);
        class222.method1536(7405);
        class67.method470(102);
        class125.method928(10);
        class107.method820(128);
        class84.method629((byte) 116);
        class4.method15(8);
        class261.method1789(97);
        class69.method476(2);
        class36.method303((byte) -19);
        class238.method1626(115);
        class135.method1016(true);
        class217.method1500(false);
        class254.method1757(arg0 ^ 0x7);
        class230.method1588(true);
        class92.method679(250);
        class156.method1132(arg0 + 20386);
        class114.method853(-51);
        class1.method2(256);
        class142.method1064(-1);
        class162.method1172(0);
        class187.method1289(-74);
        class154.method1122(2);
        class96.method692(-12318);
        class196.method1345((byte) -35);
        class121.method904(arg0 + 3974);
        class145.method1072(20541);
        class223.method1542((byte) -74);
        class244.method1680(87);
        class157.method1137((byte) 44);
        class130.method985(-1365);
        class47.method366((byte) -2);
        class170.method1204(true);
        class237.method1621(21807);
        class2.method11(false);
        class258.method1777((byte) -128);
        class186.method1287(1048575);
        class41.method331((byte) 101);
        class118.method877(arg0);
        class263.method1795((byte) 114);
        class111.method838((byte) -81);
        class147.method1081((byte) 14);
        class68.method474((byte) 90);
        class32.method286(arg0 ^ 0xFFFFC9CE);
        class161.method1169(arg0 - 697077966);
        class215.method1435(-125);
        class81.method608(470);
        class243.method1675(151);
        class105.method810((byte) -117);
        class256.method1772((byte) 104);
        class199.method1360(0);
        class200.method1363((byte) 34);
        class220.method1520(arg0 ^ 0xFFFFE798);
        class139.method1048((byte) -121);
        class204.method1380(arg0 - 6975);
        class151.method1113(true);
        class194.method1340(true);
        class124.method924((byte) 30);
        class182.method1258(arg0 ^ 0xFFFFCE93);
        class253.method1747(65535);
        class189.method1303(50);
        class163.method1180(-1809864944);
        class265.method1801((byte) -16);
        class169.method1203((byte) 125);
        class26.method267(-52);
        class140.method1052(arg0 ^ 0x20);
        class113.method848(false);
        class155.method1127(0);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method764(int arg0) {
        field1767++;
        if (class93.field1634 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class164.method1183((byte) 80);
            if (class82.field1440 == 0L) {
                class82.field1440 = var4;
            }
            if (var3 > 16384 && (var4 - class82.field1440) < 5000L) {
                if ((var4 - class242.field4201) > 1000L) {
                    System.gc();
                    class242.field4201 = var4;
                }
                class250.field4386 = class248.field4353;
                class181.field3116 = 5;
            } else {
                class250.field4386 = class196.field3385;
                class93.field1634 = 10;
                class181.field3116 = 5;
            }
        } else if (class93.field1634 == 10) {
            class150.method1108(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class110.field1961[var6] = new class72(104, 104);
            }
            class93.field1634 = 30;
            class250.field4386 = class236.field4077;
            class181.field3116 = 10;
        } else if (arg0 == 130) {
            if (class93.field1634 == 30) {
                class86.field1517 = class218.method1506(true, false, 123, true, 0);
                class104.field1838 = class218.method1506(true, false, arg0 ^ 0xF8, true, 1);
                field1782 = class218.method1506(true, true, 126, false, 2);
                class137.field2419 = class218.method1506(true, false, arg0 ^ 0xFF, true, 3);
                class8.field156 = class218.method1506(true, false, 125, true, 4);
                class84.field1467 = class218.method1506(true, true, arg0 ^ 0xF7, true, 5);
                class143.field2525 = class218.method1506(false, true, 119, true, 6);
                class218.field3757 = class218.method1506(true, false, 125, true, 7);
                class31.field549 = class218.method1506(true, false, 125, true, 8);
                class70.field1123 = class218.method1506(true, false, 120, true, 9);
                class47.field787 = class218.method1506(true, false, 118, true, 10);
                class233.field4003 = class218.method1506(true, false, 120, true, 11);
                class205.field3507 = class218.method1506(true, false, 125, true, 12);
                class162.field2928 = class218.method1506(true, false, 117, true, 13);
                class197.field3401 = class218.method1506(false, false, 120, true, 14);
                class103.field1835 = class218.method1506(true, false, arg0 ^ 0xF8, true, 15);
                class59.field967 = class218.method1506(true, false, 117, true, 16);
                class41.field669 = class218.method1506(true, false, arg0 - 6, true, 17);
                class164.field2957 = class218.method1506(true, false, arg0 - 12, true, 18);
                class139.field2466 = class218.method1506(true, false, arg0 ^ 0xF4, true, 19);
                class120.field2177 = class218.method1506(true, false, 118, true, 20);
                class78.field1383 = class218.method1506(true, false, 120, true, 21);
                class212.field3626 = class218.method1506(true, false, 122, true, 22);
                class113.field1999 = class218.method1506(true, true, 125, true, 23);
                class45.field743 = class218.method1506(true, false, 120, true, 24);
                class255.field4522 = class218.method1506(true, false, 125, true, 25);
                class194.field3361 = class218.method1506(true, true, 125, true, 26);
                class250.field4386 = class253.field4436;
                class181.field3116 = 15;
                class93.field1634 = 40;
            } else if (class93.field1634 == 40) {
                byte var7 = 0;
                int var8 = var7 + class86.field1517.method1297((byte) -61) * 4 / 100;
                int var9 = var8 + class104.field1838.method1297((byte) -61) * 4 / 100;
                int var10 = var9 + field1782.method1297((byte) -61) / 100;
                int var11 = var10 + class137.field2419.method1297((byte) -61) * 2 / 100;
                int var12 = var11 + class8.field156.method1297((byte) -61) * 6 / 100;
                int var13 = var12 + class84.field1467.method1297((byte) -61) * 4 / 100;
                int var14 = var13 + class143.field2525.method1297((byte) -61) * 2 / 100;
                int var15 = var14 + class218.field3757.method1297((byte) -61) * 50 / 100;
                int var16 = var15 + class31.field549.method1297((byte) -61) * 2 / 100;
                int var17 = var16 + class70.field1123.method1297((byte) -61) * 2 / 100;
                int var18 = var17 + class47.field787.method1297((byte) -61) * 2 / 100;
                int var19 = var18 + class233.field4003.method1297((byte) -61) * 2 / 100;
                int var20 = var19 + class205.field3507.method1297((byte) -61) * 2 / 100;
                int var21 = var20 + class162.field2928.method1297((byte) -61) * 2 / 100;
                int var22 = var21 + class197.field3401.method1297((byte) -61) * 2 / 100;
                int var23 = var22 + class103.field1835.method1297((byte) -61) * 2 / 100;
                int var24 = var23 + class59.field967.method1297((byte) -61) / 100;
                int var25 = var24 + class41.field669.method1297((byte) -61) / 100;
                int var26 = var25 + class164.field2957.method1297((byte) -61) / 100;
                int var27 = var26 + class139.field2466.method1297((byte) -61) / 100;
                int var28 = var27 + class120.field2177.method1297((byte) -61) / 100;
                int var29 = var28 + class78.field1383.method1297((byte) -61) / 100;
                int var30 = var29 + class212.field3626.method1297((byte) -61) / 100;
                int var31 = var30 + class113.field1999.method1297((byte) -61) / 100;
                int var32 = var31 + class45.field743.method1297((byte) -61) / 100;
                int var33 = var32 + class255.field4522.method1297((byte) -61) / 100;
                int var34 = var33 + class194.field3361.method1297((byte) -61) / 100;
                if (var34 == 100) {
                    class181.field3116 = 20;
                    class250.field4386 = class83.field1465;
                    class258.method1775(true, class31.field549);
                    class56.method409(true, class31.field549);
                    class101.method781(class31.field549, -1);
                    class238.method1628(class31.field549, 1023);
                    class93.field1634 = 45;
                } else {
                    if (var34 != 0) {
                        class250.field4386 = class186.method1288(new class98[] { class87.field1550, class125.method930(25904, var34), class136.field2406 }, arg0 ^ 0x7B00);
                    }
                    class181.field3116 = 20;
                }
            } else if (class93.field1634 == 45) {
                class138.method1039((byte) -121, 22050, class158.field2873, 2);
                field1781 = new class8();
                field1781.method63(9, 128, 0);
                class262.field4606 = class10.method100(-113, 22050, class85.field1504, class119.field2145, 0);
                class262.field4606.method1583(110, field1781);
                class249.method1731(-21040, class103.field1835, field1781, class8.field156, class197.field3401);
                class235.field4057 = class10.method100(-121, 2048, class85.field1504, class119.field2145, 1);
                class36.field606 = new class172();
                class235.field4057.method1583(arg0 ^ 0xEE, class36.field606);
                class101.field1794 = new class80(22050, class253.field4432);
                class199.field3416 = class143.field2525.method564(class96.field1661, -14783);
                class93.field1634 = 50;
                class181.field3116 = 30;
                class250.field4386 = class92.field1620;
            } else if (class93.field1634 == 50) {
                int var35 = class117.method874(class162.field2928, class31.field549, 117);
                int var36 = class243.method1679((byte) -53);
                if (var35 < var36) {
                    class250.field4386 = class186.method1288(new class98[] { class248.field4339, class125.method930(25904, var35 * 100 / var36), class136.field2406 }, 31618);
                    class181.field3116 = 35;
                } else {
                    class250.field4386 = class239.field4108;
                    class181.field3116 = 35;
                    class93.field1634 = 60;
                }
            } else if (class93.field1634 == 60) {
                int var37 = class137.method1034(class31.field549, (byte) 80);
                int var38 = class134.method1013(arg0 ^ 0x80);
                if (var38 > var37) {
                    class250.field4386 = class186.method1288(new class98[] { class117.field2103, class125.method930(25904, var37 * 100 / var38), class136.field2406 }, arg0 + 31488);
                    class181.field3116 = 40;
                } else {
                    class181.field3116 = 40;
                    class250.field4386 = class126.field2275;
                    class93.field1634 = 65;
                }
            } else if (class93.field1634 == 65) {
                class183.method1262(class162.field2928, class31.field549, 15896);
                class250.field4386 = class136.field2410;
                class181.field3116 = 45;
                class220.method1521(5, 0);
                class93.field1634 = 70;
            } else if (class93.field1634 == 70) {
                byte var39 = 0;
                field1782.method568((byte) -14);
                int var40 = var39 + field1782.method578(0);
                class59.field967.method568((byte) -94);
                int var41 = var40 + class59.field967.method578(0);
                class41.field669.method568((byte) 112);
                int var42 = var41 + class41.field669.method578(0);
                class164.field2957.method568((byte) -45);
                int var43 = var42 + class164.field2957.method578(0);
                class139.field2466.method568((byte) -75);
                int var44 = var43 + class139.field2466.method578(0);
                class120.field2177.method568((byte) -115);
                int var45 = var44 + class120.field2177.method578(0);
                class78.field1383.method568((byte) 120);
                int var46 = var45 + class78.field1383.method578(0);
                class212.field3626.method568((byte) 105);
                int var47 = var46 + class212.field3626.method578(0);
                class45.field743.method568((byte) -97);
                int var48 = var47 + class45.field743.method578(0);
                class255.field4522.method568((byte) -93);
                int var49 = var48 + class255.field4522.method578(0);
                if (var49 < 1000) {
                    class250.field4386 = class186.method1288(new class98[] { class112.field1985, class125.method930(25904, var49 / 10), class136.field2406 }, 31618);
                    class181.field3116 = 50;
                } else {
                    class15.method120(true, field1782);
                    class210.method1411((byte) 78, field1782);
                    class1.method8((byte) -128, field1782);
                    class105.method803(class218.field3757, field1782, 3);
                    class18.method174((byte) -106, class119.field2139, class218.field3757, class59.field967);
                    class212.method1422(-93, class218.field3757, class164.field2957);
                    class253.method1746(0, class218.field3757, class119.field2139, class139.field2466, class255.field4467);
                    class4.method20(field1782, -12792);
                    class56.method413((byte) 28, class86.field1517, class104.field1838, class120.field2177);
                    class220.method1523(6627, class78.field1383, class218.field3757);
                    class125.method931(arg0 - 234, class212.field3626);
                    class261.method1786(3, field1782);
                    class206.method1391(class31.field549, class162.field2928, class218.field3757, -125, class137.field2419);
                    class212.method1421((byte) 100, field1782);
                    class224.method1547(1, class41.field669);
                    class151.method1116(new class228(), class45.field743, class255.field4522, 18265);
                    class118.method878(class45.field743, class255.field4522, -127);
                    class250.field4386 = class232.field3997;
                    class181.field3116 = 50;
                    class70.method481(arg0 ^ 0xFFFFF241);
                    class93.field1634 = 80;
                }
            } else if (class93.field1634 == 80) {
                int var50 = class124.method925((byte) -27, class31.field549);
                int var51 = class239.method1634(0);
                if (var50 < var51) {
                    class250.field4386 = class186.method1288(new class98[] { class163.field2946, class125.method930(25904, var50 * 100 / var51), class136.field2406 }, 31618);
                    class181.field3116 = 60;
                } else {
                    class242.method1672(arg0 - 109, class31.field549);
                    class93.field1634 = 90;
                    class181.field3116 = 60;
                    class250.field4386 = class140.field2476;
                }
            } else if (class93.field1634 == 90) {
                if (class194.field3361.method568((byte) 104)) {
                    class16 var52 = new class16(class70.field1123, class194.field3361, class31.field549, 20, !class12.field238);
                    class160.method1149(var52);
                    if (class120.field2172 == 1) {
                        class160.method1148(0.9F);
                    }
                    if (class120.field2172 == 2) {
                        class160.method1148(0.8F);
                    }
                    if (class120.field2172 == 3) {
                        class160.method1148(0.7F);
                    }
                    if (class120.field2172 == 4) {
                        class160.method1148(0.6F);
                    }
                    class93.field1634 = 100;
                    class181.field3116 = 70;
                    class250.field4386 = class197.field3399;
                } else {
                    class250.field4386 = class186.method1288(new class98[] { class151.field2783, class125.method930(arg0 ^ 0x65B2, class194.field3361.method578(arg0 ^ 0x82)), class136.field2406 }, 31618);
                    class181.field3116 = 70;
                }
            } else if (class93.field1634 == 100) {
                if (class265.method1802(false, class31.field549)) {
                    class93.field1634 = 110;
                }
            } else if (class93.field1634 == 110) {
                class130.field2311 = new class251();
                class119.field2145.method32(class130.field2311, 10, (byte) -121);
                class250.field4386 = class234.field4038;
                class181.field3116 = 75;
                class93.field1634 = 120;
            } else if (class93.field1634 == 120) {
                if (class47.field787.method555(class6.field92, arg0 ^ 0xFFFFFF07, class233.field4011)) {
                    class177 var53 = new class177(class47.field787.method574(arg0 ^ 0x643A, class233.field4011, class6.field92));
                    class41.method333(var53, 0);
                    class181.field3116 = 80;
                    class250.field4386 = class173.field3028;
                    class93.field1634 = 130;
                } else {
                    class250.field4386 = class186.method1288(new class98[] { class219.field3766, class106.field1904 }, 31618);
                    class181.field3116 = 80;
                }
            } else if (class93.field1634 == 130) {
                if (!class137.field2419.method568((byte) -37)) {
                    class250.field4386 = class186.method1288(new class98[] { class6.field87, class125.method930(25904, class137.field2419.method578(0) * 3 / 4), class136.field2406 }, arg0 + 31488);
                    class181.field3116 = 85;
                } else if (!class205.field3507.method568((byte) -98)) {
                    class250.field4386 = class186.method1288(new class98[] { class6.field87, class125.method930(25904, (class205.field3507.method578(arg0 - 130) / 10) + 75), class136.field2406 }, 31618);
                    class181.field3116 = 85;
                } else if (!class162.field2928.method568((byte) -49)) {
                    class250.field4386 = class186.method1288(new class98[] { class6.field87, class125.method930(25904, class162.field2928.method578(0) / 20 + 85), class136.field2406 }, 31618);
                    class181.field3116 = 85;
                } else if (class113.field1999.method566(class199.field3421, arg0 ^ 0xFFFFEA7A)) {
                    class46.method365(class246.field4335, class220.field3792, class13.field250, class243.field4218, (byte) 73, class113.field1999, class23.field467);
                    class93.field1634 = 140;
                    class250.field4386 = class164.field2951;
                    class181.field3116 = 100;
                } else {
                    class250.field4386 = class186.method1288(new class98[] { class6.field87, class125.method930(25904, (class113.field1999.method567(class199.field3421, arg0 ^ 0x32F0) / 10) + 90), class136.field2406 }, arg0 + 31488);
                    class181.field3116 = 85;
                }
            } else if (class93.field1634 == 140) {
                class189.field3279 = class137.field2419.method564(class132.field2356, -14783);
                class84.field1467.method577(true, 0, false);
                class143.field2525.method577(true, 0, true);
                class31.field549.method577(true, 0, true);
                class162.field2928.method577(true, 0, true);
                class47.field787.method577(true, 0, true);
                class137.field2419.method577(true, 0, true);
                class51.field835 = true;
                class264.method1798(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1770++;
        if (!this.method1273(-1)) {
            return;
        }
        class85.field1502 = Integer.parseInt(this.getParameter("worldid"));
        class242.field4202 = Integer.parseInt(this.getParameter("modewhat"));
        class132.field2346 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class222.field3819 = true;
        } else {
            class222.field3819 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class119.field2139 = true;
        } else {
            class119.field2139 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class177.method1230(true);
            class76.field1355 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class245.field4315 = 1;
        } else {
            class245.field4315 = 0;
        }
        try {
            class124.field2252 = Integer.parseInt(this.getParameter("js"));
            class151.field2777 = Integer.parseInt(this.getParameter("plug"));
            class184.field3166 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var10) {
        }
        class154.field2809 = class52.field846.method744(this, (byte) -124);
        if (class154.field2809 == null) {
            class154.field2809 = class233.field4011;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class98 var7 = class186.method1285(0, var6, var6.length, 0);
            boolean var8 = class248.method1726(var7, -7896);
            if (var8) {
                class62.field1039 = var7;
            }
        }
        class85.field1507 = this.getCodeBase().getHost();
        this.method1274(class242.field4202 + 32, 503, 765, -82, 510);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lq;)Lq;")
    public static final class148 method765(class148 arg0) {
        int var1 = class184.method1266(-117, method761(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class62.method455(-854073200, arg0.field2650);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)I")
    public static final int method766(int arg0, byte arg1, int arg2) {
        if (arg1 <= 20) {
            field1771 = null;
        }
        field1765++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method767(int arg0) {
        field1766++;
        class54.method398(this, (byte) 66);
        for (class85.field1488 = 0; class205.method1386((byte) -124) && class85.field1488 < 128; class85.field1488++) {
            class176.field3067[class85.field1488] = class45.field760;
            class191.field3312[class85.field1488] = class52.field839;
        }
        class199.field3418++;
        if (class232.field3992 != -1) {
            class226.method1562(class121.field2227, false, 0, 0, class232.field3992, class180.field3111, 0, 0);
        }
        class186.field3214++;
        class82.method616(-48);
        while (true) {
            class28 var2;
            class148 var3;
            class148 var4;
            do {
                var2 = (class28) class135.field2395.method372(63);
                if (var2 == null) {
                    while (true) {
                        class28 var5;
                        class148 var6;
                        class148 var7;
                        do {
                            var5 = (class28) class54.field871.method372(63);
                            if (var5 == null) {
                                if (arg0 > -89) {
                                    this.method774(true);
                                }
                                while (true) {
                                    class28 var8;
                                    class148 var9;
                                    class148 var10;
                                    do {
                                        var8 = (class28) class88.field1554.method372(63);
                                        if (var8 == null) {
                                            if (class199.field3427 != null) {
                                                class136.method1021((byte) 115);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field517;
                                        if (var9.field2651 < 0) {
                                            break;
                                        }
                                        var10 = class62.method455(-854073200, var9.field2650);
                                    } while (var10 == null || var10.field2751 == null || var9.field2651 >= var10.field2751.length || var10.field2751[var9.field2651] != var9);
                                    class192.method1327(var8, 200000);
                                }
                            }
                            var6 = var5.field517;
                            if (var6.field2651 < 0) {
                                break;
                            }
                            var7 = class62.method455(-854073200, var6.field2650);
                        } while (var7 == null || var7.field2751 == null || var6.field2651 >= var7.field2751.length || var7.field2751[var6.field2651] != var6);
                        class192.method1327(var5, 200000);
                    }
                }
                var3 = var2.field517;
                if (var3.field2651 < 0) {
                    break;
                }
                var4 = class62.method455(-854073200, var3.field2650);
            } while (var4 == null || var4.field2751 == null || var4.field2751.length <= var3.field2651 || var4.field2751[var3.field2651] != var3);
            class192.method1327(var2, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method768(int arg0) {
        field1780++;
        if (class249.field4370 == 1000) {
            return;
        }
        boolean var2 = class191.method1322(true);
        boolean var3 = false;
        if (var2 && class187.field3229 && class262.field4606 != null) {
            class262.field4606.method1581(-13476);
        }
        if (class249.field4370 == 30 || class249.field4370 == 10) {
            if (class11.field230) {
                class216.method1437(arg0 ^ 0x36A6);
            } else if (class244.field4246 != 0L && class164.method1183((byte) 80) > class244.field4246) {
                class216.method1437(arg0 - 14002);
            }
        }
        if (class125.field2261 != 0L && class125.field2261 < class164.method1183((byte) 80) && class46.field774 != null && (class249.field4370 == 30 || class249.field4370 == 25)) {
            class32.method287((byte) -105);
        }
        if (class199.field3424) {
            class199.field3424 = false;
            var3 = true;
        }
        if (var3) {
            class254.method1755(arg0 - 39342);
        }
        if (class249.field4370 == 0) {
            class142.method1065((Color) null, var3, class181.field3116, class250.field4386, (byte) 99);
        } else if (class249.field4370 == 5) {
            class64.method462(3, class90.field1581);
        } else if (class249.field4370 == 10) {
            class59.method431((byte) 116);
        } else if (class249.field4370 == 25 || class249.field4370 == 28) {
            if (class76.field1347 == 1) {
                if (class51.field837 < class204.field3484) {
                    class51.field837 = class204.field3484;
                }
                int var5 = (class51.field837 - class204.field3484) * 50 / class51.field837;
                class92.method680(false, class186.method1288(new class98[] { class106.field1909, class60.field1008, class125.method930(25904, var5), class117.field2105 }, 31618), true);
            } else if (class76.field1347 == 2) {
                if (class138.field2443 > class256.field4536) {
                    class256.field4536 = class138.field2443;
                }
                int var4 = (class256.field4536 - class138.field2443) * 50 / class256.field4536 + 50;
                class92.method680(false, class186.method1288(new class98[] { class106.field1909, class60.field1008, class125.method930(25904, var4), class117.field2105 }, arg0 ^ 0x4D61), true);
            } else {
                class92.method680(false, class106.field1909, true);
            }
        } else if (class249.field4370 == 30) {
            class117.method873((byte) 66);
        } else if (class249.field4370 == 40) {
            class92.method680(false, class186.method1288(new class98[] { class235.field4054, class145.field2549, class219.field3781 }, 31618), true);
        }
        if (arg0 != 14051) {
            return;
        }
        if ((class249.field4370 == 30 || class249.field4370 == 10) && class36.field601 == 0 && !var3) {
            try {
                Graphics var8 = class85.field1504.getGraphics();
                for (int var9 = 0; var9 < class120.field2215; var9++) {
                    if (class69.field1105[var9]) {
                        class189.field3278.method244(-116, class119.field2132[var9], class235.field4063[var9], var8, class150.field2762[var9], class11.field222[var9]);
                        class69.field1105[var9] = false;
                    }
                }
            } catch (Exception var13) {
                class85.field1504.repaint();
            }
        } else if (class249.field4370 != 0) {
            try {
                Graphics var6 = class85.field1504.getGraphics();
                class189.field3278.method241(false, var6, 0, 0);
                for (int var7 = 0; var7 < class120.field2215; var7++) {
                    class69.field1105[var7] = false;
                }
            } catch (Exception var14) {
                class85.field1504.repaint();
            }
        }
        if (class51.field835) {
            class31.method284(5);
        }
        if (!browsercontrol.iscreated() || class217.field3740 == 0) {
            return;
        }
        try {
            Point var10 = class85.field1504.getLocationOnScreen();
            Dimension var11 = class85.field1504.getSize();
            browsercontrol.set_position(var10.x, var10.y - class217.field3740, var11.width, class217.field3740);
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method769(int arg0) {
        field1778++;
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class119.field2145 != null) {
            class119.field2145.method29(this.getClass(), -25714);
        }
        if (class130.field2311 != null) {
            class130.field2311.field4393 = false;
        }
        class130.field2311 = null;
        if (class46.field774 != null) {
            class46.field774.method790(false);
            class46.field774 = null;
        }
        class70.method486(-1, class85.field1504);
        class117.method875(arg0, class85.field1504);
        if (class176.field3062 != null) {
            class176.field3062.method1192(class85.field1504, -96);
        }
        class33.method290(-1);
        class13.method113((byte) 86);
        class176.field3062 = null;
        if (class262.field4606 != null) {
            class262.field4606.method1585(13270);
        }
        if (class235.field4057 != null) {
            class235.field4057.method1585(arg0 ^ 0x33D6);
        }
        class198.method1354((byte) -25);
        class112.method840(arg0 - 31640);
        try {
            if (class207.field3537 != null) {
                class207.field3537.method345(arg0 + 1011);
            }
            if (class51.field833 != null) {
                for (int var2 = 0; var2 < class51.field833.length; var2++) {
                    if (class51.field833[var2] != null) {
                        class51.field833[var2].method345(1011);
                    }
                }
            }
            if (class135.field2397 != null) {
                class135.field2397.method345(1011);
            }
            if (class144.field2534 != null) {
                class144.field2534.method345(arg0 ^ 0x3F3);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILtg;I)[Lnj;")
    public static final class82[] method770(int arg0, int arg1, class75 arg2, int arg3) {
        field1774++;
        if (arg1 != 0) {
            method761((class148) null);
        }
        return class43.method341(arg2, -1, arg0, arg3) ? class223.method1543(0) : null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method771(int arg0) {
        field1772++;
        if (arg0 != 9792) {
            method778((class14) null);
        }
        boolean var2 = class227.method1568((byte) 103);
        if (!var2) {
            this.method775(arg0 ^ 0x261E);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method772(byte arg0, int arg1) {
        int var3 = 78 % ((arg0 - 36) / 61);
        if (class236.field4076 == class156.field2848) {
            class236.field4076 = class188.field3235;
        } else {
            class236.field4076 = class156.field2848;
        }
        class48.field799++;
        class164.field2955 = 0;
        field1768++;
        class234.field4048 = null;
        class81.field1425 = null;
        if (class48.field799 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class249.field4370 == 0 || class249.field4370 == 5) {
                this.method1275("js5connect_full", (byte) -111);
                class249.field4370 = 1000;
            } else {
                class49.field818 = 3000;
            }
        } else if (class48.field799 >= 2 && arg1 == 6) {
            this.method1275("js5connect_outofdate", (byte) -53);
            class249.field4370 = 1000;
        } else if (class48.field799 >= 4) {
            if (class249.field4370 == 0 || class249.field4370 == 5) {
                this.method1275("js5connect", (byte) -28);
                class249.field4370 = 1000;
            } else {
                class49.field818 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static void method773(int arg0) {
        field1771 = null;
        field1781 = null;
        field1783 = null;
        field1782 = null;
        if (arg0 != 9) {
            method778((class14) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method774(boolean arg0) {
        field1769++;
        if (class249.field4370 == 1000) {
            return;
        }
        class236.field4071++;
        if ((class236.field4071 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class44.field735 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class206.field3526.setSeed((long) class44.field735);
        }
        this.method771(9792);
        class98.method715(2);
        class21.method230(-124);
        class115.method867(62);
        class83.method623(52);
        class161.method1170((byte) 122);
        if (class176.field3062 != null) {
            int var3 = class176.field3062.method1195((byte) 126);
            class107.field1912 = var3;
        }
        if (class249.field4370 == 0) {
            this.method764(130);
            class111.method836(113);
        } else if (class249.field4370 == 5) {
            this.method764(130);
            class111.method836(21);
        } else if (class249.field4370 == 25 || class249.field4370 == 28) {
            class32.method289((byte) -128);
        }
        if (!arg0) {
            return;
        }
        if (class249.field4370 == 10) {
            this.method767(-105);
            class115.method864((byte) -115);
            class243.method1677((byte) 93);
        } else if (class249.field4370 == 30) {
            class23.method251(12);
        } else if (class249.field4370 == 40) {
            class243.method1677((byte) 87);
            if (class176.field3068 != -3) {
                if (class176.field3068 == 15) {
                    class204.method1381(0);
                    return;
                }
                if (class176.field3068 != 2) {
                    class264.method1798(!arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method775(int arg0) {
        field1764++;
        if (class169.field2991 >= 4) {
            this.method1275("js5crc", (byte) -111);
            class249.field4370 = 1000;
            return;
        }
        if (class112.field1995 >= 4) {
            if (class249.field4370 == 0 || class249.field4370 == 5) {
                this.method1275("js5io", (byte) -97);
                class249.field4370 = 1000;
                return;
            }
            class112.field1995 = 3;
            class49.field818 = 3000;
        }
        if ((class49.field818--) > 0) {
            return;
        }
        try {
            if (class164.field2955 == 0) {
                class234.field4048 = class119.field2145.method38(class236.field4076, class85.field1507, -59);
                class164.field2955++;
            }
            if (class164.field2955 == 1) {
                if (class234.field4048.field445 == 2) {
                    this.method772((byte) 99, -1);
                    return;
                }
                if (class234.field4048.field445 == 1) {
                    class164.field2955++;
                }
            }
            if (class164.field2955 == 2) {
                class81.field1425 = new class102((Socket) class234.field4048.field447, class119.field2145);
                class216 var2 = new class216(5);
                var2.method1477(15, -26755);
                var2.method1456(510, -23438);
                class81.field1425.method788(true, 0, 5, var2.field3706);
                class164.field2955++;
                class191.field3301 = class164.method1183((byte) 80);
            }
            if (class164.field2955 == 3) {
                if (class249.field4370 == 0 || class249.field4370 == 5 || class81.field1425.method786(4316) > 0) {
                    int var3 = class81.field1425.method785(-1795);
                    if (var3 != 0) {
                        this.method772((byte) -109, var3);
                        return;
                    }
                    class164.field2955++;
                } else if (class164.method1183((byte) 80) - class191.field3301 > 30000L) {
                    this.method772((byte) -43, -2);
                    return;
                }
            }
            int var4 = 43 % ((-arg0 - 25) / 37);
            if (class164.field2955 == 4) {
                boolean var5 = class249.field4370 == 5 || class249.field4370 == 10 || class249.field4370 == 28;
                class222.method1533(class81.field1425, 0, !var5);
                class81.field1425 = null;
                class234.field4048 = null;
                class48.field799 = 0;
                class164.field2955 = 0;
            }
        } catch (IOException var6) {
            this.method772((byte) 116, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method776(byte arg0) {
        field1777++;
        class52.method393((byte) 102, class119.field2145, class222.field3819);
        if (class245.field4315 == 1) {
            class214.field3646 = class60.field980;
            class16.field312 = class109.field1949;
            class115.field2059 = class55.field874;
            class205.field3506 = class222.field3838;
        } else {
            class205.field3506 = class90.field1587;
            class214.field3646 = class26.field512;
            class115.field2059 = class145.field2548;
            class16.field312 = class46.field772;
        }
        class188.field3235 = class132.field2346 == 0 ? 443 : class85.field1502 + 50000;
        class156.field2848 = class132.field2346 == 0 ? 43594 : class85.field1502 + 40000;
        class236.field4076 = class156.field2848;
        class87.field1539 = class93.field1641 = class120.field2163 = class154.field2821 = new short[256];
        class194.method1339(-109);
        class250.method1735(127, class85.field1504);
        if (arg0 != -113) {
            return;
        }
        class244.method1681(class85.field1504, (byte) -108);
        class176.field3062 = class226.method1558(90);
        if (class176.field3062 != null) {
            class176.field3062.method1189(114, class85.field1504);
        }
        class207.field3547 = class5.field75;
        try {
            if (class119.field2145.field74 != null) {
                class207.field3537 = new class43(class119.field2145.field74, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class51.field833[var2] = new class43(class119.field2145.field81[var2], 6000, 0);
                }
                class135.field2397 = new class43(class119.field2145.field70, 6000, 0);
                class264.field4624 = new class171(255, class207.field3537, class135.field2397, 500000);
                class144.field2534 = new class43(class119.field2145.field63, 24, 0);
                class119.field2145.field70 = null;
                class119.field2145.field63 = null;
                class119.field2145.field81 = null;
                class119.field2145.field74 = null;
            }
        } catch (IOException var3) {
            class264.field4624 = null;
            class207.field3537 = null;
            class135.field2397 = null;
            class144.field2534 = null;
        }
        class252.field4415 = class106.field1910;
        if (class132.field2346 != 0) {
            class82.field1447 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lq;IIIIIII)V")
    public static final void method777(class148[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class148 var9 = arg0[var8];
            if (var9 != null && var9.field2650 == arg1 && (!var9.field2619 || var9.field2665 == 0 || var9.field2639 || method761(var9) != 0 || class131.field2329 == var9 || var9.field2691 == 1338) && (!var9.field2619 || !method762(var9))) {
                int var10 = var9.field2598 + arg6;
                int var11 = var9.field2677 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2665 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2694 + var10;
                    int var17 = var9.field2647 + var11;
                    if (var9.field2665 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class199.field3427 == var9) {
                    class101.field1787 = true;
                    class206.field3528 = var10;
                    class196.field3391 = var11;
                }
                if (!var9.field2619 || var12 < var14 && var13 < var15) {
                    if (var9.field2665 == 0) {
                        if (!var9.field2619 && method762(var9) && class98.field1674 != var9) {
                            continue;
                        }
                        if (var9.field2689 && class75.field1322 >= var12 && class199.field3426 >= var13 && class75.field1322 < var14 && class199.field3426 < var15) {
                            for (class28 var18 = (class28) class88.field1554.method371((byte) 61); var18 != null; var18 = (class28) class88.field1554.method370(true)) {
                                if (var18.field521) {
                                    var18.method1611((byte) -128);
                                }
                            }
                            if (class154.field2806 == 0) {
                                class199.field3427 = null;
                                class131.field2329 = null;
                            }
                            class144.field2537 = false;
                        }
                    }
                    if (var9.field2619) {
                        boolean var19;
                        if (class75.field1322 >= var12 && class199.field3426 >= var13 && class75.field1322 < var14 && class199.field3426 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class81.field1433 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class48.field810 == 1 && class139.field2471 >= var12 && class250.field4384 >= var13 && class139.field2471 < var14 && class250.field4384 < var15) {
                            var21 = true;
                        }
                        if (class85.field1488 > 0 && var9.field2756 != null) {
                            for (int var22 = 0; var22 < var9.field2756.length; var22++) {
                                for (int var23 = 0; var23 < class85.field1488; var23++) {
                                    int var24 = var9.field2756[var22] & 0xFF;
                                    if (class176.field3067[var23] == var24) {
                                        if (var9.field2676 != null) {
                                            byte var25 = var9.field2676[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class107.field1915[86] || (var25 & 0x1) != 0 && !class107.field1915[82] || (var25 & 0x4) != 0 && !class107.field1915[81])) {
                                                continue;
                                            }
                                        }
                                        class227.method1571(-81, var22 + 1, var9.field2728, class233.field4011, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class56.method411(0, class139.field2471 - var10, var9, class250.field4384 - var11);
                        }
                        if (class199.field3427 != null && class199.field3427 != var9 && var19 && class106.method815(method761(var9), true)) {
                            class141.field2492 = var9;
                        }
                        if (class131.field2329 == var9) {
                            class153.field2804 = true;
                            class169.field2988 = var10;
                            class224.field3871 = var11;
                        }
                        if (var9.field2639 || var9.field2691 != 0) {
                            if (var19 && class107.field1912 != 0 && var9.field2594 != null) {
                                class28 var26 = new class28();
                                var26.field521 = true;
                                var26.field517 = var9;
                                var26.field516 = class107.field1912;
                                var26.field514 = var9.field2594;
                                class88.field1554.method376((byte) 13, var26);
                            }
                            if (class199.field3427 != null || class181.field3128 != null || class97.field1672 || var9.field2691 != 1400 && class144.field2537) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2691 != 0) {
                                if (var9.field2691 == 1337) {
                                    class23.field473 = var9;
                                    class72.method512(var9, 2);
                                    continue;
                                }
                                if (var9.field2691 == 1338) {
                                    if (var21) {
                                        class256.method1770((byte) 67, var9, class139.field2471 - var10, class250.field4384 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field2691 == 1400) {
                                    class106.field1901 = var9;
                                    if (var21) {
                                        if (class107.field1915[82] && class130.field2312 > 0) {
                                            int var27 = (int) ((double) (class139.field2471 - var10 - var9.field2694 / 2) * 2.0D / (double) class4.field42);
                                            int var28 = (int) ((double) (class250.field4384 - var11 - var9.field2647 / 2) * 2.0D / (double) class4.field42);
                                            int var29 = class211.field3612 + var27;
                                            int var30 = class211.field3613 + var28;
                                            int var31 = class51.field830 + var29;
                                            int var32 = class148.field2743 + class255.field4470 - var30 - 1;
                                            class115.method857(103, 0, var32, var31);
                                            class250.method1736((byte) 7);
                                            continue;
                                        }
                                        class144.field2537 = true;
                                        class144.field2530 = class75.field1322;
                                        class133.field2359 = class199.field3426;
                                        class204.field3486 = class211.field3612;
                                        class203.field3473 = class211.field3613;
                                        continue;
                                    }
                                    if (var20 && class144.field2537) {
                                        class21.method237((int) ((double) (class144.field2530 - class75.field1322) * 2.0D / (double) class148.field2726) + class204.field3486, (byte) -90);
                                        class237.method1620((int) ((double) (class133.field2359 - class199.field3426) * 2.0D / (double) class148.field2726) + class203.field3473, (byte) 71);
                                        continue;
                                    }
                                    class144.field2537 = false;
                                    continue;
                                }
                                if (var9.field2691 == 1401) {
                                    if (var20) {
                                        class72.method497(class199.field3426 - var11, var9.field2647, class75.field1322 - var10, (byte) -31, var9.field2694);
                                    }
                                    continue;
                                }
                                if (var9.field2691 == 1402) {
                                    class72.method512(var9, 2);
                                    continue;
                                }
                                if (var9.field2691 == 1404) {
                                    class72.method512(var9, 2);
                                    continue;
                                }
                            }
                            if (!var9.field2637 && var21) {
                                var9.field2637 = true;
                                if (var9.field2709 != null) {
                                    class28 var33 = new class28();
                                    var33.field521 = true;
                                    var33.field517 = var9;
                                    var33.field525 = class139.field2471 - var10;
                                    var33.field516 = class250.field4384 - var11;
                                    var33.field514 = var9.field2709;
                                    class88.field1554.method376((byte) 13, var33);
                                }
                            }
                            if (var9.field2637 && var20 && var9.field2710 != null) {
                                class28 var34 = new class28();
                                var34.field521 = true;
                                var34.field517 = var9;
                                var34.field525 = class75.field1322 - var10;
                                var34.field516 = class199.field3426 - var11;
                                var34.field514 = var9.field2710;
                                class88.field1554.method376((byte) 13, var34);
                            }
                            if (var9.field2637 && !var20) {
                                var9.field2637 = false;
                                if (var9.field2600 != null) {
                                    class28 var35 = new class28();
                                    var35.field521 = true;
                                    var35.field517 = var9;
                                    var35.field525 = class75.field1322 - var10;
                                    var35.field516 = class199.field3426 - var11;
                                    var35.field514 = var9.field2600;
                                    class54.field871.method376((byte) 13, var35);
                                }
                            }
                            if (var20 && var9.field2630 != null) {
                                class28 var36 = new class28();
                                var36.field521 = true;
                                var36.field517 = var9;
                                var36.field525 = class75.field1322 - var10;
                                var36.field516 = class199.field3426 - var11;
                                var36.field514 = var9.field2630;
                                class88.field1554.method376((byte) 13, var36);
                            }
                            if (!var9.field2707 && var19) {
                                var9.field2707 = true;
                                if (var9.field2701 != null) {
                                    class28 var37 = new class28();
                                    var37.field521 = true;
                                    var37.field517 = var9;
                                    var37.field525 = class75.field1322 - var10;
                                    var37.field516 = class199.field3426 - var11;
                                    var37.field514 = var9.field2701;
                                    class88.field1554.method376((byte) 13, var37);
                                }
                            }
                            if (var9.field2707 && var19 && var9.field2603 != null) {
                                class28 var38 = new class28();
                                var38.field521 = true;
                                var38.field517 = var9;
                                var38.field525 = class75.field1322 - var10;
                                var38.field516 = class199.field3426 - var11;
                                var38.field514 = var9.field2603;
                                class88.field1554.method376((byte) 13, var38);
                            }
                            if (var9.field2707 && !var19) {
                                var9.field2707 = false;
                                if (var9.field2660 != null) {
                                    class28 var39 = new class28();
                                    var39.field521 = true;
                                    var39.field517 = var9;
                                    var39.field525 = class75.field1322 - var10;
                                    var39.field516 = class199.field3426 - var11;
                                    var39.field514 = var9.field2660;
                                    class54.field871.method376((byte) 13, var39);
                                }
                            }
                            if (var9.field2672 != null) {
                                class28 var40 = new class28();
                                var40.field517 = var9;
                                var40.field514 = var9.field2672;
                                class135.field2395.method376((byte) 13, var40);
                            }
                            if (var9.field2692 != null && class80.field1413 > var9.field2746) {
                                if (var9.field2705 == null || class80.field1413 - var9.field2746 > 32) {
                                    class28 var45 = new class28();
                                    var45.field517 = var9;
                                    var45.field514 = var9.field2692;
                                    class88.field1554.method376((byte) 13, var45);
                                } else {
                                    label550: for (int var41 = var9.field2746; var41 < class80.field1413; var41++) {
                                        int var42 = class232.field3989[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field2705.length; var43++) {
                                            if (var9.field2705[var43] == var42) {
                                                class28 var44 = new class28();
                                                var44.field517 = var9;
                                                var44.field514 = var9.field2692;
                                                class88.field1554.method376((byte) 13, var44);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field2746 = class80.field1413;
                            }
                            if (var9.field2666 != null && class184.field3162 > var9.field2748) {
                                if (var9.field2696 == null || class184.field3162 - var9.field2748 > 32) {
                                    class28 var50 = new class28();
                                    var50.field517 = var9;
                                    var50.field514 = var9.field2666;
                                    class88.field1554.method376((byte) 13, var50);
                                } else {
                                    label526: for (int var46 = var9.field2748; var46 < class184.field3162; var46++) {
                                        int var47 = class83.field1460[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field2696.length; var48++) {
                                            if (var9.field2696[var48] == var47) {
                                                class28 var49 = new class28();
                                                var49.field517 = var9;
                                                var49.field514 = var9.field2666;
                                                class88.field1554.method376((byte) 13, var49);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field2748 = class184.field3162;
                            }
                            if (var9.field2704 != null && class253.field4430 > var9.field2668) {
                                if (var9.field2589 == null || class253.field4430 - var9.field2668 > 32) {
                                    class28 var55 = new class28();
                                    var55.field517 = var9;
                                    var55.field514 = var9.field2704;
                                    class88.field1554.method376((byte) 13, var55);
                                } else {
                                    label502: for (int var51 = var9.field2668; var51 < class253.field4430; var51++) {
                                        int var52 = class102.field1821[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field2589.length; var53++) {
                                            if (var9.field2589[var53] == var52) {
                                                class28 var54 = new class28();
                                                var54.field517 = var9;
                                                var54.field514 = var9.field2704;
                                                class88.field1554.method376((byte) 13, var54);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field2668 = class253.field4430;
                            }
                            if (var9.field2628 != null && class2.field30 > var9.field2703) {
                                if (var9.field2680 == null || class2.field30 - var9.field2703 > 32) {
                                    class28 var60 = new class28();
                                    var60.field517 = var9;
                                    var60.field514 = var9.field2628;
                                    class88.field1554.method376((byte) 13, var60);
                                } else {
                                    label478: for (int var56 = var9.field2703; var56 < class2.field30; var56++) {
                                        int var57 = class110.field1964[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field2680.length; var58++) {
                                            if (var9.field2680[var58] == var57) {
                                                class28 var59 = new class28();
                                                var59.field517 = var9;
                                                var59.field514 = var9.field2628;
                                                class88.field1554.method376((byte) 13, var59);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field2703 = class2.field30;
                            }
                            if (var9.field2744 != null && class96.field1660 > var9.field2690) {
                                if (var9.field2640 == null || class96.field1660 - var9.field2690 > 32) {
                                    class28 var65 = new class28();
                                    var65.field517 = var9;
                                    var65.field514 = var9.field2744;
                                    class88.field1554.method376((byte) 13, var65);
                                } else {
                                    label454: for (int var61 = var9.field2690; var61 < class96.field1660; var61++) {
                                        int var62 = class204.field3489[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field2640.length; var63++) {
                                            if (var9.field2640[var63] == var62) {
                                                class28 var64 = new class28();
                                                var64.field517 = var9;
                                                var64.field514 = var9.field2744;
                                                class88.field1554.method376((byte) 13, var64);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field2690 = class96.field1660;
                            }
                            if (class54.field866 > var9.field2693 && var9.field2657 != null) {
                                class28 var66 = new class28();
                                var66.field517 = var9;
                                var66.field514 = var9.field2657;
                                class88.field1554.method376((byte) 13, var66);
                            }
                            if (class237.field4093 > var9.field2693 && var9.field2700 != null) {
                                class28 var67 = new class28();
                                var67.field517 = var9;
                                var67.field514 = var9.field2700;
                                class88.field1554.method376((byte) 13, var67);
                            }
                            if (class258.field4554 > var9.field2693 && var9.field2734 != null) {
                                class28 var68 = new class28();
                                var68.field517 = var9;
                                var68.field514 = var9.field2734;
                                class88.field1554.method376((byte) 13, var68);
                            }
                            if (class143.field2526 > var9.field2693 && var9.field2674 != null) {
                                class28 var69 = new class28();
                                var69.field517 = var9;
                                var69.field514 = var9.field2674;
                                class88.field1554.method376((byte) 13, var69);
                            }
                            if (class68.field1099 > var9.field2693 && var9.field2648 != null) {
                                class28 var70 = new class28();
                                var70.field517 = var9;
                                var70.field514 = var9.field2648;
                                class88.field1554.method376((byte) 13, var70);
                            }
                            var9.field2693 = class186.field3214;
                            if (var9.field2719 != null) {
                                for (int var71 = 0; var71 < class85.field1488; var71++) {
                                    class28 var72 = new class28();
                                    var72.field517 = var9;
                                    var72.field519 = class176.field3067[var71];
                                    var72.field518 = class191.field3312[var71];
                                    var72.field514 = var9.field2719;
                                    class88.field1554.method376((byte) 13, var72);
                                }
                            }
                            if (class106.field1900 && var9.field2616 != null) {
                                class28 var73 = new class28();
                                var73.field517 = var9;
                                var73.field514 = var9.field2616;
                                class88.field1554.method376((byte) 13, var73);
                            }
                        }
                    }
                    if (!var9.field2619 && class199.field3427 == null && class181.field3128 == null && !class97.field1672) {
                        if ((var9.field2729 >= 0 || var9.field2730 != 0) && class75.field1322 >= var12 && class199.field3426 >= var13 && class75.field1322 < var14 && class199.field3426 < var15) {
                            if (var9.field2729 >= 0) {
                                class98.field1674 = arg0[var9.field2729];
                            } else {
                                class98.field1674 = var9;
                            }
                        }
                        if (var9.field2665 == 8 && class75.field1322 >= var12 && class199.field3426 >= var13 && class75.field1322 < var14 && class199.field3426 < var15) {
                            class34.field586 = var9;
                        }
                        if (var9.field2644 > var9.field2647) {
                            class107.method817(class199.field3426, var9.field2694 + var10, var9, var9.field2644, true, var9.field2647, var11, class75.field1322);
                        }
                    }
                    if (var9.field2665 == 0) {
                        method777(arg0, var9.field2728, var12, var13, var14, var15, var10 - var9.field2649, var11 - var9.field2615);
                        if (var9.field2751 != null) {
                            method777(var9.field2751, var9.field2728, var12, var13, var14, var15, var10 - var9.field2649, var11 - var9.field2615);
                        }
                        class34 var74 = (class34) class243.field4209.method1511((byte) -123, (long) var9.field2728);
                        if (var74 != null) {
                            class226.method1562(var14, false, var10, var12, var74.field596, var15, var11, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbe;)V")
    public static final void method778(class14 arg0) {
        for (int var1 = arg0.field268; var1 <= arg0.field255; var1++) {
            for (int var2 = arg0.field256; var2 <= arg0.field277; var2++) {
                class71 var3 = class31.field553[arg0.field254][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1149; var4++) {
                        if (var3.field1140[var4] == arg0) {
                            var3.field1149--;
                            for (int var5 = var4; var5 < var3.field1149; var5++) {
                                var3.field1140[var5] = var3.field1140[var5 + 1];
                                var3.field1159[var5] = var3.field1159[var5 + 1];
                            }
                            var3.field1140[var3.field1149] = null;
                            break;
                        }
                    }
                    var3.field1153 = 0;
                    for (int var6 = 0; var6 < var3.field1149; var6++) {
                        var3.field1153 |= var3.field1159[var6];
                    }
                }
            }
        }
    }
}
