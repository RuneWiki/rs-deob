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
public class client extends class97 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
    public static boolean field2582 = true;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public static final void method1083(int arg0, int arg1, int arg2, int arg3) {
        class36 var4 = class161.method1067(9, arg2, (byte) 81);
        if (arg3 >= 21) {
            var4.method219(-118);
            field2584++;
            var4.field458 = arg0;
            var4.field465 = arg1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method1084(byte arg0, byte[] arg1) {
        field2576++;
        if (arg0 <= 96) {
            field2582 = true;
        }
        class202 var3 = new class202(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method1420((byte) 0);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    var3.method1419(101);
                    var3.method1419(70);
                    var3.method1419(79);
                    var3.method1419(93);
                    var3.method1419(80);
                    var3.method1419(85);
                } else if (var4 == 4) {
                    int var5 = var3.method1420((byte) 0);
                    class22.field293 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class22.field293[var6] = var3.method1419(114);
                        if (class22.field293[var6] == 65535) {
                            class22.field293[var6] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkk;)Lim;")
    public static final class237 method1085(class254 arg0) {
        class237 var1 = (class237) class250.field3985.method872((byte) -86, ((long) arg0.field4077 << 32) + (long) arg0.field4040);
        return var1 == null ? arg0.field4151 : var1;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1086(int arg0) {
        if (arg0 != -9528) {
            method1095();
        }
        field2574++;
        boolean var2 = class229.field3663.method1690(arg0 + 9570);
        if (!var2) {
            this.method1093((byte) -101);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method629(int arg0) {
        field2585++;
        class77.method508();
        class141.method938(true);
        class42.method268(-126);
        class13.method80();
        class218.method1528(-1);
        class288.method2024((byte) -54);
        class97.method632(27441);
        class212.method1495((byte) -120);
        class19.method113(-1);
        class102.method664(0);
        class3.method9((byte) -110);
        class202.method1429(-87);
        class189.method1281((byte) 124);
        class242.method1689(-112);
        class159.method1057(-58);
        class4.method12(5);
        class220.method1546((byte) 109);
        class273.method1886(1);
        class241.method1680(2);
        class55.method322(true);
        class25.method143(-10494);
        class35.method208(67);
        class201.method1388((byte) -116);
        class142.method954(12633);
        class254.method1759(false);
        class208.method1478((byte) 122);
        class281.method1958((byte) 126);
        class294.method2053(-1);
        class130.method861((byte) -33);
        class37.method230((byte) -17);
        class138.method923(false);
        class295.method2055(-127);
        class282.method1996(128);
        class173.method1165(16128);
        class90.method585(-2);
        class157.method1031(-1305820368);
        class200.method1380((byte) -107);
        class154.method1018(1);
        class210.method1488(92);
        class106.method687((byte) -16);
        class229.method1612(7413);
        class237.method1645((byte) 115);
        class164.method1102((byte) 97);
        class134.method903(false);
        class177.method1193((byte) 82);
        class14.method85(-32491);
        class299.method2071((byte) -113);
        class146.method975((byte) -121);
        class219.method1530(-1);
        class79.method526((byte) 41);
        class140.method934(6);
        class156.method1030(500);
        class226.method1575(2);
        class150.method996((byte) -127);
        class72.method455((byte) 125);
        class223.method1557((byte) 29);
        class283.method1998(-82);
        class178.method1195(true);
        class105.method680(-69);
        class1.method1(123);
        class89.method579(6443);
        class311.method2114(1024);
        class211.method1494((byte) 40);
        class66.method422((byte) 101);
        class74.method474(-36);
        class232.method1626(14);
        class176.method1179(-585749368);
        class228.method1600();
        class2.method3(0);
        class191.method1312();
        class69.method436(true);
        class15.method97(-126);
        class56.method335((byte) 25);
        class304.method2087(-3814);
        class110.method709(-4);
        class116.method729();
        class248.method1732((byte) 63);
        class274.method1911(82);
        class122.method796();
        class101.method658(false);
        class236.method1638(1);
        class50.method307(8222);
        class314.method2126(11);
        class30.method175();
        class22.method129(-1);
        class256.method1791(11);
        class47.method292(false);
        class27.method165(-3);
        class163.method1079(3);
        class62.method398();
        class149.method987(true);
        class16.method105((byte) -83);
        class139.method925((byte) 71);
        class162.method1076(-6449);
        class193.method1341(-19880);
        class216.method1512((byte) -40);
        class63.method408(true);
        class272.method1867(116);
        class190.method1291((byte) -28);
        class82.method558((byte) -31);
        class209.method1485(26);
        class261.method1810((byte) -125);
        int var2 = -54 / ((50 - arg0) / 52);
        class119.method777(117);
        class270.method1858(78);
        class20.method120(255);
        class205.method1464();
        class265.method1829((byte) 92);
        class174.method1173((byte) 56);
        class43.method278((byte) -110);
        class71.method446(-10412);
        class81.method544();
        class59.method369(6);
        class175.method1178(-14377);
        class192.method1336((byte) -43);
        class184.method1218(30642);
        class266.method1835((byte) 67);
        class249.method1736((byte) 11);
        class49.method306((byte) 69);
        class117.method761(-97);
        class17.method106();
        class172.method1135();
        class113.method719(11169);
        class67.method424(26734);
        class53.method318(false);
        class187.method1269(true);
        class207.method1471(116);
        class160.method1061((byte) 78);
        class204.method1462(-125);
        class292.method2041(17);
        class224.method1565(true);
        class151.method1000(-1);
        class298.method2069((byte) 112);
        class276.method1922((byte) -79);
        class143.method967(-32628);
        class114.method721(0);
        class230.method1621(5063219);
        class169.method1116((byte) -48);
        class98.method634(true);
        class286.method2012(-126);
        class166.method1110(1002);
        class168.method1112(13876);
        class153.method1009();
        class51.method310((byte) 45);
        class127.method845(false);
        class28.method167();
        class225.method1569(25924);
        class75.method495(0);
        class92.method599(-1);
        class284.method2006(-1);
        class313.method2117(51);
        class36.method218(115);
        class120.method784(0);
        class145.method972(115);
        class144.method971((byte) -90);
        class213.method1498();
        class280.method1948(1);
        class126.method839(-1);
        class247.method1726(112);
        class100.method651((byte) 22);
        class245.method1718(true);
        class73.method463(8);
        class257.method1795(true);
        class111.method716(-7218);
        class297.method2065(-106);
        class11.method62(64);
        class260.method1805(-1);
        class271.method1860(-110);
        class68.method431(233);
        class221.method1552((byte) 98);
        class240.method1667();
        class277.method1926(-30204);
        class235.method1631(3);
        class180.method1202((byte) -1);
        class262.method1816(-17789);
        class217.method1520((byte) -105);
        class33.method191((byte) 82);
        class264.method1824((byte) -71);
        class78.method522((byte) 91);
        class197.method1365((byte) -71);
        class26.method160();
        class9.method49(4096);
        class306.method2094(116);
        class29.method169(8435);
        class70.method443((byte) -127);
        class131.method876(2718);
        class250.method1738(512);
        class136.method908();
        class279.method1941();
        class128.method851(52);
        class76.method501((byte) -64);
        class109.method706((byte) 102);
        class231.method1622(-110);
        class155.method1021();
        class289.method2027();
        class86.method571((byte) 20);
        class41.method264(1);
        class285.method2009(-1005611988);
        class198.method1366(-118);
        class99.method646(-11);
        class7.method39(false);
        class93.method606(21671);
        class10.method55((byte) 112);
        class263.method1822((byte) -73);
        class107.method699(-9998);
        class252.method1741(true);
        class161.method1065(-66);
        class296.method2062(61);
        class312.method2116(-86);
        class179.method1201(23708);
        class147.method979(1);
        class6.method33(20932);
        class275.method1914(121);
        class300.method2074(false);
        class118.method772(-96);
        class199.method1376(10367);
        class307.method2097((byte) 74);
        class305.method2090((byte) 115);
        class48.method301((byte) -60);
        class52.method315((byte) -103);
        class60.method372((byte) -60);
        class152.method1006(-2);
        class121.method790(4);
        class278.method1933(true);
        class34.method196(-56);
        class268.method1845((byte) -97);
        class45.method288((byte) -127);
        class137.method916(-80);
        class287.method2018(true);
        class181.method1207(false);
        class123.method812((byte) 16);
        class104.method673(-6654);
        class24.method140(true);
        class84.method564(0);
        class148.method985((byte) -105);
        class183.method1214(2);
        class258.method1798(2);
        class214.method1500(-63);
        class87.method577((byte) -93);
        class186.method1267(1);
        class57.method340(65536);
        class246.method1723((byte) 112);
        class96.method616(0);
        class196.method1361(-1);
        class18.method111(0);
        class171.method1129(true);
        class103.method668(32);
        class310.method2110((byte) 7);
        class194.method1346(116);
        class309.method2108(false);
        class227.method1577(26061);
        class12.method64(-9134);
        class85.method570(0);
        class44.method282(true);
        class259.method1801(65);
        class301.method2078(true);
        class253.method1749(7489);
        class31.method185((byte) 77);
        class239.method1663(1559);
        class115.method723(-106);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lkk;)Lkk;")
    public static final class254 method1087(class254 arg0) {
        int var1 = method1085(arg0).method1655(46);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class80.method534(112, arg0.field4167);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1088() {
        boolean var0 = class12.field160 && class249.field3964 > 200 || class249.field3964 > 50;
        for (int var1 = 0; var1 < class249.field3964; var1++) {
            class208 var10 = class300.field4925[class53.field713[var1]];
            var10.field839 = false;
            if (var10.method211(65535)) {
                var10.field3314 = var10.field857 == var10.method361(-1).field4282 ? var0 : false;
                int var11 = 0;
                if (!var10.field817) {
                    var11++;
                }
                if (var10.field885 > class4.field32) {
                    var11 += 2;
                }
                int var12 = var11 + (5 - var10.method362(25892) << 2);
                if (class85.field1335 == 0) {
                    var12 += 32;
                } else {
                    var12 += 128;
                }
                var12 += 256;
                var10.field879 = var12 + 1;
            } else {
                var10.field879 = -1;
            }
        }
        for (int var2 = 0; var2 < class14.field195; var2++) {
            class35 var7 = class76.field1188[class76.field1189[var2]];
            var7.field839 = false;
            if (var7.method211(65535) && var7.field442.method684((byte) 114)) {
                int var8 = 0;
                if (!var7.field817) {
                    var8++;
                }
                if (var7.field885 > class4.field32) {
                    var8 += 2;
                }
                int var9 = var8 + (5 - var7.method362(25892) << 2);
                if (class85.field1335 == 0) {
                    if (var7.field442.field1600) {
                        var9 += 64;
                    } else {
                        var9 += 128;
                    }
                } else if (class85.field1335 == 1) {
                    if (var7.field442.field1600) {
                        var9 += 32;
                    } else {
                        var9 += 64;
                    }
                }
                if (var7.field442.field1622) {
                    var9 += 512;
                } else if (!var7.field442.field1607) {
                    var9 += 256;
                }
                var7.field879 = var9 + 1;
            } else {
                var7.field879 = -1;
            }
        }
        for (int var3 = 0; var3 < class263.field4340.length; var3++) {
            class3 var4 = class263.field4340[var3];
            if (var4 != null) {
                if (var4.field16 == 1) {
                    class35 var5 = class76.field1188[var4.field17];
                    if (var5 != null && var5.field879 != -1) {
                        var5.field879 += 1024;
                    }
                } else if (var4.field16 == 10) {
                    class208 var6 = class300.field4925[var4.field17];
                    if (var6 != null && var6.field879 != -1) {
                        var6.field879 += 1024;
                    }
                }
            }
        }
        class309.field5006.field879 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    private final void method1089(byte arg0) {
        field2583++;
        if (!class192.field3039) {
            label241: while (true) {
                do {
                    if (!class58.method359(false)) {
                        break label241;
                    }
                } while (class242.field3823 != 's' && class242.field3823 != 'S');
                class192.field3039 = true;
            }
        }
        if (class12.field155 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class267.method1841((byte) 123);
            if (class110.field1678 == 0L) {
                class110.field1678 = var4;
            }
            if (var3 > 16384 && (var4 - class110.field1678) < 5000L) {
                if ((var4 - class101.field1521) > 1000L) {
                    System.gc();
                    class101.field1521 = var4;
                }
                class204.field3288 = 5;
                class248.field3941 = class245.field3900;
            } else {
                class12.field155 = 10;
                class204.field3288 = 5;
                class248.field3941 = class141.field2171;
            }
        } else if (class12.field155 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class183.field2841[var6] = new class142(104, 104);
            }
            class248.field3941 = class156.field2473;
            class204.field3288 = 10;
            class12.field155 = 30;
        } else if (class12.field155 == 30) {
            if (class18.field248 == null) {
                class18.field248 = new class4(class229.field3663, class69.field1012);
            }
            if (class18.field248.method14(8)) {
                class31.field397 = class150.method999(0, 14708, true, true, false);
                class265.field4361 = class150.method999(1, 14708, true, true, false);
                class121.field1859 = class150.method999(2, 14708, true, false, true);
                class190.field2931 = class150.method999(3, 14708, true, true, false);
                class9.field119 = class150.method999(4, 14708, true, true, false);
                class145.field2296 = class150.method999(5, 14708, true, true, true);
                class274.field4518 = class150.method999(6, 14708, false, true, true);
                class120.field1846 = class150.method999(7, 14708, true, true, false);
                class3.field22 = class150.method999(8, 14708, true, true, false);
                class141.field2192 = class150.method999(9, 14708, true, true, false);
                class173.field2691 = class150.method999(10, 14708, true, true, false);
                class66.field977 = class150.method999(11, 14708, true, true, false);
                class119.field1835 = class150.method999(12, 14708, true, true, false);
                class209.field3358 = class150.method999(13, 14708, true, true, false);
                class196.field3122 = class150.method999(14, 14708, false, true, false);
                class266.field4385 = class150.method999(15, 14708, true, true, false);
                class186.field2883 = class150.method999(16, 14708, true, true, false);
                class79.field1252 = class150.method999(17, 14708, true, true, false);
                class56.field760 = class150.method999(18, 14708, true, true, false);
                class18.field252 = class150.method999(19, 14708, true, true, false);
                class98.field1477 = class150.method999(20, 14708, true, true, false);
                class18.field247 = class150.method999(21, 14708, true, true, false);
                class92.field1398 = class150.method999(22, 14708, true, true, false);
                class157.field2499 = class150.method999(23, 14708, true, true, true);
                class193.field3048 = class150.method999(24, 14708, true, true, false);
                class245.field3898 = class150.method999(25, 14708, true, true, false);
                class283.field4738 = class150.method999(26, 14708, true, true, true);
                class212.field3390 = class150.method999(27, 14708, true, true, false);
                class4.field29 = class150.method999(28, 14708, true, true, true);
                class204.field3288 = 15;
                class248.field3941 = class160.field2528;
                class12.field155 = 40;
            } else {
                class204.field3288 = 12;
                class248.field3941 = class280.field4634;
            }
        } else if (class12.field155 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class163.field2559[var8].method1542(125) * class4.field36[var8] / 100;
            }
            if (var7 == 100) {
                class248.field3941 = class178.field2770;
                class204.field3288 = 20;
                class190.method1285(class3.field22, -71);
                class226.method1573((byte) -89, class3.field22);
                class15.method99((byte) -101, class3.field22);
                class12.field155 = 41;
            } else {
                class204.field3288 = 20;
                if (var7 != 0) {
                    class248.field3941 = class271.field4448 + var7 + "%";
                }
            }
        } else if (class12.field155 == 41) {
            if (class4.field29.method1894((byte) 23)) {
                this.method1084((byte) 127, class4.field29.method1884(1, (byte) 88));
                class12.field155 = 45;
                class248.field3941 = class175.field2742;
                class204.field3288 = 25;
            } else {
                class248.field3941 = class9.field116 + class4.field29.method1897(true) + "%";
                class204.field3288 = 25;
            }
        } else if (class12.field155 == 45) {
            class11.method57(2, 22050, -27833, class175.field2740);
            class126.field1948 = new class282();
            class126.field1948.method1973(9, -60, 128);
            class199.field3155 = class84.method561(class113.field1701, 22050, 0, class259.field4254, -24998);
            class199.field3155.method1163(126, class126.field1948);
            class57.method347(class266.field4385, class126.field1948, -110, class196.field3122, class9.field119);
            class60.field921 = class84.method561(class113.field1701, 2048, 1, class259.field4254, -24998);
            class71.field1024 = new class91();
            class60.field921.method1163(126, class71.field1024);
            class162.field2549 = new class90(22050, class131.field2018);
            class306.field4976 = class274.field4518.method1895("scape main", false);
            class204.field3288 = 30;
            class12.field155 = 50;
            class248.field3941 = class78.field1243;
        } else if (class12.field155 == 50) {
            int var9 = class67.method425(-8, class209.field3358, class3.field22);
            int var10 = class142.method952((byte) 127);
            if (var10 > var9) {
                class204.field3288 = 35;
                class248.field3941 = class75.field1184 + var9 * 100 / var10 + "%";
            } else {
                class12.field155 = 60;
                class248.field3941 = class12.field161;
                class204.field3288 = 35;
            }
        } else if (class12.field155 == 60) {
            int var11 = class182.method1212(0, class3.field22);
            int var12 = class98.method637(true);
            if (var12 > var11) {
                class248.field3941 = class36.field473 + var11 * 100 / var12 + "%";
                class204.field3288 = 40;
            } else {
                class204.field3288 = 40;
                class12.field155 = 65;
                class248.field3941 = class276.field4577;
            }
        } else if (class12.field155 == 65) {
            class311.method2115(class3.field22, false, class209.field3358);
            class248.field3941 = class79.field1246;
            class204.field3288 = 45;
            class229.method1614(5, 28);
            class12.field155 = 70;
        } else if (class12.field155 == 70) {
            class121.field1859.method1894((byte) 23);
            byte var13 = 0;
            int var14 = var13 + class121.field1859.method1897(true);
            class186.field2883.method1894((byte) 23);
            int var15 = var14 + class186.field2883.method1897(true);
            class79.field1252.method1894((byte) 23);
            int var16 = var15 + class79.field1252.method1897(true);
            class56.field760.method1894((byte) 23);
            int var17 = var16 + class56.field760.method1897(true);
            class18.field252.method1894((byte) 23);
            int var18 = var17 + class18.field252.method1897(true);
            class98.field1477.method1894((byte) 23);
            int var19 = var18 + class98.field1477.method1897(true);
            class18.field247.method1894((byte) 23);
            int var20 = var19 + class18.field247.method1897(true);
            class92.field1398.method1894((byte) 23);
            int var21 = var20 + class92.field1398.method1897(true);
            class193.field3048.method1894((byte) 23);
            int var22 = var21 + class193.field3048.method1897(true);
            class245.field3898.method1894((byte) 23);
            int var23 = var22 + class245.field3898.method1897(true);
            class212.field3390.method1894((byte) 23);
            int var24 = var23 + class212.field3390.method1897(true);
            if (var24 < 1100) {
                class204.field3288 = 50;
                class248.field3941 = class300.field4930 + var24 / 11 + "%";
            } else {
                class192.method1332(-64, class121.field1859);
                class139.method927(27937, class121.field1859);
                class101.method656((byte) 122, class121.field1859);
                class154.method1017(class120.field1846, class121.field1859, 1000);
                class181.method1205(class186.field2883, class120.field1846, true, false);
                class97.method626(true, class120.field1846, (byte) 63, class56.field760);
                class169.method1117(class18.field252, -1, class216.field3439, class120.field1846, true);
                class274.method1913(class121.field1859, -1);
                class142.method944((byte) -113, class265.field4361, class98.field1477, class31.field397);
                class275.method1916((byte) 68, class121.field1859);
                class144.method970(class18.field247, class120.field1846, -27977);
                class130.method863((byte) -29, class92.field1398);
                class262.method1815(class121.field1859, 115);
                class58.method353(class190.field2931, class3.field22, class209.field3358, class120.field1846, 11877);
                class60.method376(class121.field1859, true);
                class260.method1803(19326, class79.field1252);
                method1091(new class43(), class193.field3048, true, class245.field3898);
                class157.method1034(97, class245.field3898, class193.field3048);
                class306.method2091((byte) -40, class121.field1859);
                class270.method1854((byte) -92, class121.field1859);
                class296.method2060(7, class121.field1859);
                class139.method930(15, class121.field1859, class3.field22);
                class194.method1348(class3.field22, (byte) 35, class121.field1859);
                class115.method726(class3.field22, class121.field1859, (byte) -65);
                class248.field3941 = class72.field1050;
                class204.field3288 = 50;
                class69.method437((byte) -16);
                class12.field155 = 80;
            }
        } else if (class12.field155 == 80) {
            int var25 = class10.method51(class3.field22, (byte) -123);
            int var26 = class6.method31((byte) 69);
            if (var25 < var26) {
                class204.field3288 = 60;
                class248.field3941 = class263.field4347 + var25 * 100 / var26 + "%";
            } else {
                class37.method229(class3.field22, (byte) -123);
                class204.field3288 = 60;
                class12.field155 = 90;
                class248.field3941 = class93.field1413;
            }
        } else if (class12.field155 == 90) {
            if (class283.field4738.method1894((byte) 23)) {
                class266 var27 = new class266(class141.field2192, class283.field4738, class3.field22, 20, !class51.field687);
                class172.method1140(var27);
                if (class73.field1067 == 1) {
                    class172.method1137(0.9F);
                }
                if (class73.field1067 == 2) {
                    class172.method1137(0.8F);
                }
                if (class73.field1067 == 3) {
                    class172.method1137(0.7F);
                }
                if (class73.field1067 == 4) {
                    class172.method1137(0.6F);
                }
                class248.field3941 = class178.field2776;
                class204.field3288 = 70;
                class12.field155 = 100;
            } else {
                class248.field3941 = class11.field138 + class283.field4738.method1897(true) + "%";
                class204.field3288 = 70;
            }
        } else if (class12.field155 == 100) {
            if (class232.method1625(-6493, class3.field22)) {
                class12.field155 = 110;
            }
        } else if (class12.field155 == 110) {
            class282.field4721 = new class102();
            class259.field4254.method1777(10, class282.field4721, 2);
            class12.field155 = 120;
            class204.field3288 = 75;
            class248.field3941 = class274.field4528;
        } else if (class12.field155 == 120) {
            if (class173.field2691.method1880(3, "", "huffman")) {
                class113 var28 = new class113(class173.field2691.method1889(124, "", "huffman"));
                class134.method899(0, var28);
                class248.field3941 = class123.field1879;
                class204.field3288 = 80;
                class12.field155 = 130;
            } else {
                class204.field3288 = 80;
                class248.field3941 = class127.field1967 + "0%";
            }
        } else if (class12.field155 == 130) {
            if (!class190.field2931.method1894((byte) 23)) {
                class248.field3941 = class103.field1558 + class190.field2931.method1897(true) * 3 / 4 + "%";
                class204.field3288 = 85;
            } else if (!class119.field1835.method1894((byte) 23)) {
                class248.field3941 = class103.field1558 + (class119.field1835.method1897(true) / 10 + 75) + "%";
                class204.field3288 = 85;
            } else if (!class209.field3358.method1894((byte) 23)) {
                class248.field3941 = class103.field1558 + (class209.field3358.method1897(true) / 20 + 85) + "%";
                class204.field3288 = 85;
            } else if (class157.field2499.method1901(1, "details")) {
                class13.method70(class157.field2499);
                class77.method513(class212.field3390);
                class205.method1465(class120.field1846);
                class12.field155 = 135;
                class204.field3288 = 95;
                class248.field3941 = class147.field2306;
            } else {
                class248.field3941 = class103.field1558 + ((class157.field2499.method1879("details", (byte) 102) / 10) + 90) + "%";
                class204.field3288 = 85;
            }
        } else if (class12.field155 == 135) {
            int var29 = class35.method212((byte) -128);
            if (var29 == -1) {
                class204.field3288 = 95;
                class248.field3941 = class271.field4446;
            } else if (var29 == 7 || var29 == 9) {
                this.method627(-439, "worldlistfull");
                class229.method1614(1000, 28);
            } else if (class261.field4306) {
                class248.field3941 = class194.field3069;
                class12.field155 = 140;
                class204.field3288 = 96;
            } else {
                this.method627(-439, "worldlistio_" + var29);
                class229.method1614(1000, 28);
            }
        } else if (class12.field155 == 140) {
            class120.field1844 = class190.field2931.method1895("loginscreen", false);
            class145.field2296.method1900(true, true, false);
            class274.field4518.method1900(true, true, true);
            class3.field22.method1900(true, true, true);
            class209.field3358.method1900(true, true, true);
            class173.field2691.method1900(true, true, true);
            class190.field2931.method1900(true, true, true);
            class123.field1884 = true;
            class204.field3288 = 97;
            class12.field155 = 150;
            class248.field3941 = class73.field1083;
        } else if (arg0 <= -68) {
            if (class12.field155 == 150) {
                if (class192.field3039) {
                    class218.field3463 = 0;
                    class230.field3687 = 0;
                    class258.field4245 = 0;
                    class132.field2028 = 0;
                }
                class192.field3039 = true;
                class248.method1733(false, class259.field4254);
                class204.method1463(false, -1, class258.field4245, false, -1);
                class12.field155 = 160;
                class204.field3288 = 100;
                class248.field3941 = class216.field3448;
            } else if (class12.field155 == 160) {
                class176.method1180(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class229.method1613("argument count", 32277);
            }
            class189.field2901 = Integer.parseInt(arg0[0]);
            class138.field2130 = 2;
            if (arg0[1].equals("live")) {
                class169.field2630 = 0;
            } else if (arg0[1].equals("rc")) {
                class169.field2630 = 1;
            } else if (arg0[1].equals("wip")) {
                class169.field2630 = 2;
            } else {
                class229.method1613("modewhat", 32277);
            }
            class176.field2748 = false;
            class284.field4755 = class24.method141(true, arg0[2]);
            if (class284.field4755 == -1) {
                if (arg0[2].equals("english")) {
                    class284.field4755 = 0;
                } else if (arg0[2].equals("german")) {
                    class284.field4755 = 1;
                } else {
                    class229.method1613("language", 32277);
                }
            }
            class259.method1802(class284.field4755, (byte) 110);
            class119.field1836 = false;
            class295.field4850 = false;
            if (arg0[3].equals("game0")) {
                class121.field1857 = 0;
            } else if (arg0[3].equals("game1")) {
                class121.field1857 = 1;
            } else {
                class229.method1613("game", 32277);
            }
            class275.field4552 = "";
            class34.field420 = false;
            class280.field4630 = 0;
            class115.field1742 = 0;
            client var1 = new client();
            class145.field2295 = var1;
            var1.method617(1024, class169.field2630 + 32, class121.field1857 == 1 ? "mechscape" : "runescape", false, false, 553, 29, 768);
            class224.field3565.setLocation(40, 40);
        } catch (Exception var3) {
            class159.method1055((String) null, -17731, var3);
        }
        field2570++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1090() {
        for (int var0 = -1; var0 < class249.field3964 + class14.field195; var0++) {
            class58 var1;
            long var2;
            if (var0 < 0) {
                var1 = class309.field5006;
                var2 = 8791798054912L;
            } else if (var0 < class249.field3964) {
                int var4 = class53.field713[var0];
                var1 = class300.field4925[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class76.field1189[var0 - class249.field3964];
                class35 var6 = class76.field1188[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field442.field1648) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field879 < 0) {
                var1.field817 = false;
            } else {
                var1.field788 = -1;
                int var7 = var1.method362(25892);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field836 & 0x7F) != 0 || (var1.field850 & 0x7F) != 0) {
                        var1.field817 = false;
                        continue;
                    }
                } else if ((var1.field836 & 0x7F) != 64 || (var1.field850 & 0x7F) != 64) {
                    var1.field817 = false;
                    continue;
                }
                int var10002;
                if (var7 == 1) {
                    int var8 = var1.field836 >> 7;
                    int var9 = var1.field850 >> 7;
                    if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104) {
                        var1.field817 = true;
                        continue;
                    }
                    if (class209.field3357[var8][var9] != var1.field879) {
                        var1.field817 = true;
                        continue;
                    }
                    if (class92.field1400[var8][var9] > 1) {
                        var10002 = class92.field1400[var8][var9]--;
                        var1.field817 = true;
                        continue;
                    }
                } else {
                    int var10 = var1.field836 - var7 * 64 >> 7;
                    int var11 = var1.field850 - var7 * 64 >> 7;
                    int var12 = var7 + var10;
                    int var13 = var7 + var11;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    if (!class236.method1634(var10, var13, var12, var1.field879, -1497, var11)) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            for (int var15 = var11; var15 < var13; var15++) {
                                if (class209.field3357[var14][var15] == var1.field879) {
                                    var10002 = class92.field1400[var14][var15]--;
                                }
                            }
                        }
                        var1.field817 = true;
                        continue;
                    }
                }
                if (var1 instanceof class208 && var1.field882 != null && class4.field32 >= var1.field815 && class4.field32 < var1.field809) {
                    ((class208) var1).field3314 = false;
                    var1.field817 = false;
                    var1.field869 = class12.method66(var1.field836, class165.field2600, var1.field850, 0);
                    class4.method11(class165.field2600, var1.field836, var1.field850, var1.field869, var1, var1.field855, var2, var1.field820, var1.field811, var1.field828, var1.field798);
                } else {
                    var1.field817 = false;
                    var1.field869 = class12.method66(var1.field836, class165.field2600, var1.field850, 0);
                    class121.method786(class165.field2600, var1.field836, var1.field850, var1.field869, (var7 - 1) * 64 + 60, var1, var1.field855, var2, var1.field863);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhb;Lfa;ZLfa;)V")
    private static final void method1091(class233 arg0, class273 arg1, boolean arg2, class273 arg3) {
        if (!arg2) {
            return;
        }
        class220.field3522 = arg1;
        class270.field4426 = arg3;
        field2571++;
        class157.field2492 = arg0;
        if (class220.field3522 != null) {
            class4.field42 = class220.field3522.method1890(arg2, 1);
        }
        if (class270.field4426 != null) {
            class4.field43 = class270.field4426.method1890(true, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1092() {
        for (int var0 = -1; var0 < class249.field3964 + class14.field195; var0++) {
            class58 var1;
            if (var0 < 0) {
                var1 = class309.field5006;
            } else if (var0 < class249.field3964) {
                var1 = class300.field4925[class53.field713[var0]];
            } else {
                var1 = class76.field1188[class76.field1189[var0 - class249.field3964]];
            }
            if (var1.field879 >= 0) {
                int var2 = var1.method362(25892);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field836 & 0x7F) != 0 || (var1.field850 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field836 & 0x7F) != 64 || (var1.field850 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field836 >> 7;
                    int var4 = var1.field850 >> 7;
                    if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104 && var1.field879 >= class209.field3357[var3][var4]) {
                        if (var1.field879 > class209.field3357[var3][var4]) {
                            class209.field3357[var3][var4] = var1.field879;
                            class92.field1400[var3][var4] = 1;
                        } else {
                            var10002 = class92.field1400[var3][var4]++;
                        }
                    }
                } else {
                    int var5 = var1.field836 - var2 * 64 >> 7;
                    int var6 = var1.field850 - var2 * 64 >> 7;
                    int var7 = var5 + var1.method362(25892);
                    int var8 = var6 + var1.method362(25892);
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7 > 104) {
                        var7 = 104;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8 > 104) {
                        var8 = 104;
                    }
                    for (int var9 = var5; var9 < var7; var9++) {
                        for (int var10 = var6; var10 < var8; var10++) {
                            if (var1.field879 > class209.field3357[var9][var10]) {
                                class209.field3357[var9][var10] = var1.field879;
                                class92.field1400[var9][var10] = 1;
                            } else if (class209.field3357[var9][var10] == var1.field879) {
                                var10002 = class92.field1400[var9][var10]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method1093(byte arg0) {
        field2586++;
        if (class232.field3708 < class229.field3663.field3858) {
            class15.field216 = (class229.field3663.field3858 - 1) * 5 * 50;
            if (class15.field216 > 3000) {
                class15.field216 = 3000;
            }
            if (class246.field3931 == class148.field2323) {
                class148.field2323 = class37.field486;
            } else {
                class148.field2323 = class246.field3931;
            }
            if (class229.field3663.field3858 >= 2 && class229.field3663.field3856 == 6) {
                this.method627(-439, "js5connect_outofdate");
                class115.field1733 = 1000;
                return;
            }
            if (class229.field3663.field3858 >= 4 && class229.field3663.field3856 == -1) {
                this.method627(-439, "js5crc");
                class115.field1733 = 1000;
                return;
            }
            if (class229.field3663.field3858 >= 4 && (class115.field1733 == 0 || class115.field1733 == 5)) {
                if (class229.field3663.field3856 == 7 || class229.field3663.field3856 == 9) {
                    this.method627(-439, "js5connect_full");
                } else if (class229.field3663.field3856 > 0) {
                    this.method627(-439, "js5connect");
                } else {
                    this.method627(-439, "js5io");
                }
                class115.field1733 = 1000;
                return;
            }
        }
        class232.field3708 = class229.field3663.field3858;
        if (class15.field216 > 0) {
            class15.field216--;
            return;
        }
        try {
            if (class34.field421 == 0) {
                class119.field1813 = class259.field4254.method1776(class148.field2323, class57.field773, (byte) -52);
                class34.field421++;
            }
            if (class34.field421 == 1) {
                if (class119.field1813.field725 == 2) {
                    this.method1099(1000, 24992);
                    return;
                }
                if (class119.field1813.field725 == 1) {
                    class34.field421++;
                }
            }
            if (class34.field421 == 2) {
                class55.field745 = new class189((Socket) class119.field1813.field723, class259.field4254);
                class202 var2 = new class202(5);
                var2.method1446((byte) 64, 15);
                var2.method1425(553, (byte) -116);
                class55.field745.method1275(0, true, 5, var2.field3234);
                class34.field421++;
                class189.field2915 = class267.method1841((byte) 127);
            }
            if (class34.field421 == 3) {
                if (class115.field1733 == 0 || class115.field1733 == 5 || class55.field745.method1283((byte) -102) > 0) {
                    int var3 = class55.field745.method1276(95);
                    if (var3 != 0) {
                        this.method1099(var3, 24992);
                        return;
                    }
                    class34.field421++;
                } else if ((class267.method1841((byte) 113) - class189.field2915) > 30000L) {
                    this.method1099(1001, 24992);
                    return;
                }
            }
            if (class34.field421 == 4) {
                boolean var4 = class115.field1733 == 5 || class115.field1733 == 10 || class115.field1733 == 28;
                class229.field3663.method1698(!var4, (byte) -30, class55.field745);
                class34.field421 = 0;
                class55.field745 = null;
                class119.field1813 = null;
            }
        } catch (IOException var5) {
            this.method1099(1002, 24992);
        }
        if (arg0 >= -99) {
            field2581 = -4;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lkk;IIIIIII)V")
    public static final void method1094(class254[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class254 var9 = arg0[var8];
            if (var9 != null && var9.field4167 == arg1 && (!var9.field4181 || var9.field4052 == 0 || var9.field4110 || method1085(var9).field3765 != 0 || class197.field3130 == var9 || var9.field4060 == 1338) && (!var9.field4181 || !method1096(var9))) {
                int var10 = var9.field4197 + arg6;
                int var11 = var9.field4200 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4052 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4085 + var10;
                    int var17 = var9.field4152 + var11;
                    if (var9.field4052 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class138.field2135 == var9) {
                    class197.field3131 = true;
                    class6.field48 = var10;
                    class237.field3748 = var11;
                }
                if (!var9.field4181 || var12 < var14 && var13 < var15) {
                    if (var9.field4052 == 0) {
                        if (!var9.field4181 && method1096(var9) && class217.field3458 != var9) {
                            continue;
                        }
                        if (var9.field4078 && class1.field1 >= var12 && class60.field924 >= var13 && class1.field1 < var14 && class60.field924 < var15) {
                            for (class298 var18 = (class298) class276.field4573.method1959(205); var18 != null; var18 = (class298) class276.field4573.method1956(104)) {
                                if (var18.field4904) {
                                    var18.method900(110);
                                    var18.field4906.field4149 = false;
                                }
                            }
                            if (class60.field919 == 0) {
                                class138.field2135 = null;
                                class197.field3130 = null;
                            }
                            class242.field3837 = 0;
                            class64.field959 = false;
                        }
                    }
                    if (var9.field4181) {
                        boolean var19;
                        if (class1.field1 >= var12 && class60.field924 >= var13 && class1.field1 < var14 && class60.field924 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class109.field1669 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class102.field1548 == 1 && class199.field3158 >= var12 && class218.field3483 >= var13 && class199.field3158 < var14 && class218.field3483 < var15) {
                            var21 = true;
                        }
                        if (var9.field4185 != null) {
                            for (int var22 = 0; var22 < var9.field4185.length; var22++) {
                                if (class3.field26[var9.field4185[var22]]) {
                                    if (var9.field4055 == null || class4.field32 >= var9.field4055[var22]) {
                                        byte var23 = var9.field4058[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class3.field26[86] && !class3.field26[82] && !class3.field26[81]) && ((var23 & 0x2) == 0 || class3.field26[86]) && ((var23 & 0x1) == 0 || class3.field26[82]) && ((var23 & 0x4) == 0 || class3.field26[81])) {
                                            class117.method763(true, var22 + 1, "", -1, var9.field4077);
                                            int var24 = var9.field4082[var22];
                                            if (var9.field4055 == null) {
                                                var9.field4055 = new int[var9.field4185.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4055[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4055[var22] = class4.field32 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4055 != null) {
                                    var9.field4055[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class281.method1953(var9, class218.field3483 - var11, class199.field3158 - var10, 0);
                        }
                        if (class138.field2135 != null && class138.field2135 != var9 && var19 && method1085(var9).method1644(124)) {
                            class314.field5063 = var9;
                        }
                        if (class197.field3130 == var9) {
                            class115.field1744 = true;
                            class68.field992 = var10;
                            class199.field3164 = var11;
                        }
                        if (var9.field4110 || var9.field4060 != 0) {
                            if (var19 && class150.field2332 != 0 && var9.field4079 != null) {
                                class298 var25 = new class298();
                                var25.field4904 = true;
                                var25.field4906 = var9;
                                var25.field4909 = class150.field2332;
                                var25.field4905 = var9.field4079;
                                class276.field4573.method1952(var25, 76);
                            }
                            if (class138.field2135 != null || class156.field2470 != null || class220.field3525 || var9.field4060 != 1400 && class242.field3837 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4060 != 0) {
                                if (var9.field4060 == 1337) {
                                    class22.field296 = var9;
                                    continue;
                                }
                                if (var9.field4060 == 1338) {
                                    if (var21) {
                                        class36.field456 = class199.field3158 - var10;
                                        class242.field3831 = class218.field3483 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4060 == 1400) {
                                    class175.field2741 = var9;
                                    if (var19) {
                                        class64.field959 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class199.field3158 - var10 - var9.field4085 / 2) * 2.0D / (double) class13.field172);
                                        int var27 = (int) ((double) (class218.field3483 - var11 - var9.field4152 / 2) * 2.0D / (double) class13.field172);
                                        int var28 = class187.field2897 + var26;
                                        int var29 = class44.field606 + var27;
                                        int var30 = class13.field173 + var28;
                                        int var31 = class13.field165 + class13.field169 - var29 - 1;
                                        class218 var32 = class25.method146(-127);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method1524(6778, var31, var30, var33);
                                        if (var33 != null) {
                                            if (class3.field26[82] && class37.field484 > 0) {
                                                class209.method1482(var33[1], var33[0], 63, var33[2]);
                                                class278.method1940(2);
                                                continue;
                                            }
                                            class56.field762++;
                                            class276.field4572.method1391(0, 201);
                                            class276.field4572.method1448(var33[0] << 28 | var33[1] << 14 | var33[2], (byte) -122);
                                        }
                                        class242.field3837 = 1;
                                        class300.field4919 = false;
                                        class82.field1304 = class1.field1;
                                        class52.field702 = class60.field924;
                                        continue;
                                    }
                                    if (var20 && class242.field3837 > 0) {
                                        if (class242.field3837 == 1 && (class82.field1304 != class1.field1 || class60.field924 != class52.field702)) {
                                            class294.field4838 = class187.field2897;
                                            class25.field331 = class44.field606;
                                            class242.field3837 = 2;
                                        }
                                        if (class242.field3837 == 2) {
                                            class300.field4919 = true;
                                            class214.method1503((int) ((double) (class82.field1304 - class1.field1) * 2.0D / (double) class13.field174) + class294.field4838, -1);
                                            class101.method657((int) ((double) (class52.field702 - class60.field924) * 2.0D / (double) class13.field174) + class25.field331, -9188);
                                        }
                                        continue;
                                    }
                                    if (class242.field3837 > 0 && !class300.field4919) {
                                        if ((class258.field4246 == 1 || class144.method969(class18.field251 - 1, -1)) && class18.field251 > 2) {
                                            class90.method581(1);
                                        } else if (class18.field251 > 0) {
                                            class121.method791((byte) 88);
                                        }
                                    }
                                    class242.field3837 = 0;
                                    continue;
                                }
                                if (var9.field4060 == 1401) {
                                    if (var20) {
                                        class9.method50(class60.field924 - var11, var9.field4085, (byte) 107, class1.field1 - var10, var9.field4152);
                                    }
                                    continue;
                                }
                                if (var9.field4060 == 1402) {
                                    class58.method354(true, var9);
                                    continue;
                                }
                            }
                            if (!var9.field4104 && var21) {
                                var9.field4104 = true;
                                if (var9.field4039 != null) {
                                    class298 var34 = new class298();
                                    var34.field4904 = true;
                                    var34.field4906 = var9;
                                    var34.field4897 = class199.field3158 - var10;
                                    var34.field4909 = class218.field3483 - var11;
                                    var34.field4905 = var9.field4039;
                                    class276.field4573.method1952(var34, 76);
                                }
                            }
                            if (var9.field4104 && var20 && var9.field4108 != null) {
                                class298 var35 = new class298();
                                var35.field4904 = true;
                                var35.field4906 = var9;
                                var35.field4897 = class1.field1 - var10;
                                var35.field4909 = class60.field924 - var11;
                                var35.field4905 = var9.field4108;
                                class276.field4573.method1952(var35, 76);
                            }
                            if (var9.field4104 && !var20) {
                                var9.field4104 = false;
                                if (var9.field4030 != null) {
                                    class298 var36 = new class298();
                                    var36.field4904 = true;
                                    var36.field4906 = var9;
                                    var36.field4897 = class1.field1 - var10;
                                    var36.field4909 = class60.field924 - var11;
                                    var36.field4905 = var9.field4030;
                                    class154.field2405.method1952(var36, 76);
                                }
                            }
                            if (var20 && var9.field4083 != null) {
                                class298 var37 = new class298();
                                var37.field4904 = true;
                                var37.field4906 = var9;
                                var37.field4897 = class1.field1 - var10;
                                var37.field4909 = class60.field924 - var11;
                                var37.field4905 = var9.field4083;
                                class276.field4573.method1952(var37, 76);
                            }
                            if (!var9.field4149 && var19) {
                                var9.field4149 = true;
                                if (var9.field4029 != null) {
                                    class298 var38 = new class298();
                                    var38.field4904 = true;
                                    var38.field4906 = var9;
                                    var38.field4897 = class1.field1 - var10;
                                    var38.field4909 = class60.field924 - var11;
                                    var38.field4905 = var9.field4029;
                                    class276.field4573.method1952(var38, 76);
                                }
                            }
                            if (var9.field4149 && var19 && var9.field4179 != null) {
                                class298 var39 = new class298();
                                var39.field4904 = true;
                                var39.field4906 = var9;
                                var39.field4897 = class1.field1 - var10;
                                var39.field4909 = class60.field924 - var11;
                                var39.field4905 = var9.field4179;
                                class276.field4573.method1952(var39, 76);
                            }
                            if (var9.field4149 && !var19) {
                                var9.field4149 = false;
                                if (var9.field4090 != null) {
                                    class298 var40 = new class298();
                                    var40.field4904 = true;
                                    var40.field4906 = var9;
                                    var40.field4897 = class1.field1 - var10;
                                    var40.field4909 = class60.field924 - var11;
                                    var40.field4905 = var9.field4090;
                                    class154.field2405.method1952(var40, 76);
                                }
                            }
                            if (var9.field4198 != null) {
                                class298 var41 = new class298();
                                var41.field4906 = var9;
                                var41.field4905 = var9.field4198;
                                class24.field311.method1952(var41, 76);
                            }
                            if (var9.field4111 != null && class10.field134 > var9.field4084) {
                                if (var9.field4144 == null || class10.field134 - var9.field4084 > 32) {
                                    class298 var46 = new class298();
                                    var46.field4906 = var9;
                                    var46.field4905 = var9.field4111;
                                    class276.field4573.method1952(var46, 76);
                                } else {
                                    label600: for (int var42 = var9.field4084; var42 < class10.field134; var42++) {
                                        int var43 = class181.field2807[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field4144.length; var44++) {
                                            if (var9.field4144[var44] == var43) {
                                                class298 var45 = new class298();
                                                var45.field4906 = var9;
                                                var45.field4905 = var9.field4111;
                                                class276.field4573.method1952(var45, 76);
                                                break label600;
                                            }
                                        }
                                    }
                                }
                                var9.field4084 = class10.field134;
                            }
                            if (var9.field4116 != null && class29.field374 > var9.field4041) {
                                if (var9.field4027 == null || class29.field374 - var9.field4041 > 32) {
                                    class298 var51 = new class298();
                                    var51.field4906 = var9;
                                    var51.field4905 = var9.field4116;
                                    class276.field4573.method1952(var51, 76);
                                } else {
                                    label576: for (int var47 = var9.field4041; var47 < class29.field374; var47++) {
                                        int var48 = class103.field1557[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4027.length; var49++) {
                                            if (var9.field4027[var49] == var48) {
                                                class298 var50 = new class298();
                                                var50.field4906 = var9;
                                                var50.field4905 = var9.field4116;
                                                class276.field4573.method1952(var50, 76);
                                                break label576;
                                            }
                                        }
                                    }
                                }
                                var9.field4041 = class29.field374;
                            }
                            if (var9.field4124 != null && class84.field1333 > var9.field4038) {
                                if (var9.field4157 == null || class84.field1333 - var9.field4038 > 32) {
                                    class298 var56 = new class298();
                                    var56.field4906 = var9;
                                    var56.field4905 = var9.field4124;
                                    class276.field4573.method1952(var56, 76);
                                } else {
                                    label552: for (int var52 = var9.field4038; var52 < class84.field1333; var52++) {
                                        int var53 = class204.field3285[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4157.length; var54++) {
                                            if (var9.field4157[var54] == var53) {
                                                class298 var55 = new class298();
                                                var55.field4906 = var9;
                                                var55.field4905 = var9.field4124;
                                                class276.field4573.method1952(var55, 76);
                                                break label552;
                                            }
                                        }
                                    }
                                }
                                var9.field4038 = class84.field1333;
                            }
                            if (var9.field4070 != null && class226.field3591 > var9.field4136) {
                                if (var9.field4076 == null || class226.field3591 - var9.field4136 > 32) {
                                    class298 var61 = new class298();
                                    var61.field4906 = var9;
                                    var61.field4905 = var9.field4070;
                                    class276.field4573.method1952(var61, 76);
                                } else {
                                    label528: for (int var57 = var9.field4136; var57 < class226.field3591; var57++) {
                                        int var58 = class312.field5034[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field4076.length; var59++) {
                                            if (var9.field4076[var59] == var58) {
                                                class298 var60 = new class298();
                                                var60.field4906 = var9;
                                                var60.field4905 = var9.field4070;
                                                class276.field4573.method1952(var60, 76);
                                                break label528;
                                            }
                                        }
                                    }
                                }
                                var9.field4136 = class226.field3591;
                            }
                            if (var9.field4161 != null && class159.field2511 > var9.field4176) {
                                if (var9.field4071 == null || class159.field2511 - var9.field4176 > 32) {
                                    class298 var66 = new class298();
                                    var66.field4906 = var9;
                                    var66.field4905 = var9.field4161;
                                    class276.field4573.method1952(var66, 76);
                                } else {
                                    label504: for (int var62 = var9.field4176; var62 < class159.field2511; var62++) {
                                        int var63 = class313.field5050[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field4071.length; var64++) {
                                            if (var9.field4071[var64] == var63) {
                                                class298 var65 = new class298();
                                                var65.field4906 = var9;
                                                var65.field4905 = var9.field4161;
                                                class276.field4573.method1952(var65, 76);
                                                break label504;
                                            }
                                        }
                                    }
                                }
                                var9.field4176 = class159.field2511;
                            }
                            if (class174.field2731 > var9.field4130 && var9.field4036 != null) {
                                class298 var67 = new class298();
                                var67.field4906 = var9;
                                var67.field4905 = var9.field4036;
                                class276.field4573.method1952(var67, 76);
                            }
                            if (class287.field4783 > var9.field4130 && var9.field4026 != null) {
                                class298 var68 = new class298();
                                var68.field4906 = var9;
                                var68.field4905 = var9.field4026;
                                class276.field4573.method1952(var68, 76);
                            }
                            if (class186.field2887 > var9.field4130 && var9.field4180 != null) {
                                class298 var69 = new class298();
                                var69.field4906 = var9;
                                var69.field4905 = var9.field4180;
                                class276.field4573.method1952(var69, 76);
                            }
                            if (class229.field3655 > var9.field4130 && var9.field4194 != null) {
                                class298 var70 = new class298();
                                var70.field4906 = var9;
                                var70.field4905 = var9.field4194;
                                class276.field4573.method1952(var70, 76);
                            }
                            if (class96.field1419 > var9.field4130 && var9.field4115 != null) {
                                class298 var71 = new class298();
                                var71.field4906 = var9;
                                var71.field4905 = var9.field4115;
                                class276.field4573.method1952(var71, 76);
                            }
                            var9.field4130 = class40.field502;
                            if (var9.field4107 != null) {
                                for (int var72 = 0; var72 < class85.field1348; var72++) {
                                    class298 var73 = new class298();
                                    var73.field4906 = var9;
                                    var73.field4899 = class248.field3944[var72];
                                    var73.field4900 = class259.field4256[var72];
                                    var73.field4905 = var9.field4107;
                                    class276.field4573.method1952(var73, 76);
                                }
                            }
                            if (class42.field580 && var9.field4061 != null) {
                                class298 var74 = new class298();
                                var74.field4906 = var9;
                                var74.field4905 = var9.field4061;
                                class276.field4573.method1952(var74, 76);
                            }
                        }
                    }
                    if (!var9.field4181 && class138.field2135 == null && class156.field2470 == null && !class220.field3525) {
                        if ((var9.field4143 >= 0 || var9.field4126 != 0) && class1.field1 >= var12 && class60.field924 >= var13 && class1.field1 < var14 && class60.field924 < var15) {
                            if (var9.field4143 >= 0) {
                                class217.field3458 = arg0[var9.field4143];
                            } else {
                                class217.field3458 = var9;
                            }
                        }
                        if (var9.field4052 == 8 && class1.field1 >= var12 && class60.field924 >= var13 && class1.field1 < var14 && class60.field924 < var15) {
                            class156.field2471 = var9;
                        }
                        if (var9.field4081 > var9.field4152) {
                            class143.method966(var9.field4085 + var10, var11, class1.field1, class60.field924, var9.field4152, false, var9, var9.field4081);
                        }
                    }
                    if (var9.field4052 == 0) {
                        method1094(arg0, var9.field4077, var12, var13, var14, var15, var10 - var9.field4175, var11 - var9.field4125);
                        if (var9.field4123 != null) {
                            method1094(var9.field4123, var9.field4077, var12, var13, var14, var15, var10 - var9.field4175, var11 - var9.field4125);
                        }
                        class229 var75 = (class229) class258.field4241.method872((byte) -95, (long) var9.field4077);
                        if (var75 != null) {
                            class14.method87(var13, var11, var15, var12, var75.field3658, var10, false, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1095() {
        class173.field2687 = 0;
        for (int var0 = 0; var0 < class14.field195; var0++) {
            class35 var1 = class76.field1188[class76.field1189[var0]];
            if (var1.field817 && var1.method213(0) != -1) {
                int var2 = var1.field836 - (var1.method362(25892) - 1) * 64;
                int var3 = var1.field850 - (var1.method362(25892) - 1) * 64;
                class114 var4 = class84.method565(class165.field2600, var2 >> 7, var3 >> 7);
                if (var4 != null) {
                    long var5 = var4.field1712;
                    int var7 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
                    class58 var8;
                    if ((var5 >>> 29 & 0x3L) == 0L) {
                        var8 = class300.field4925[var7];
                    } else {
                        var8 = class76.field1188[var7];
                        var7 += 2048;
                    }
                    if (var8.field788 == -1) {
                        class309.field5007[class173.field2687] = var7;
                        class68.field999[class173.field2687++] = var7;
                        var8.field788 = 0;
                    }
                    class309.field5007[class173.field2687] = var7;
                    class68.field999[class173.field2687++] = class76.field1189[var0] + 2048;
                }
            }
        }
        class200.method1386(0, class309.field5007, (byte) -80, class68.field999, class173.field2687 - 1);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method630(int arg0) {
        field2579++;
        if (arg0 != 9) {
            return;
        }
        class44.method281(-19545);
        class69.field1012 = new class159();
        class229.field3663 = new class242();
        if (class169.field2630 != 0) {
            class183.field2837 = new byte[50][];
        }
        class273.method1902((byte) 112, class259.field4254);
        if (class138.field2130 == 0) {
            class178.field2765 = this.getCodeBase().getHost();
            class249.field3962 = 443;
            class58.field795 = 43594;
        } else if (class138.field2130 == 1) {
            class178.field2765 = this.getCodeBase().getHost();
            class58.field795 = class189.field2901 + 40000;
            class249.field3962 = class189.field2901 + 50000;
        } else if (class138.field2130 == 2) {
            class249.field3962 = class189.field2901 + 50000;
            class58.field795 = class189.field2901 + 40000;
            class178.field2765 = "127.0.0.1";
        }
        class246.field3931 = class58.field795;
        class137.field2129 = class58.field795;
        if (class121.field1857 == 1) {
            class310.field5015 = class105.field1576;
            class10.field127 = class128.field1982;
            class253.field4019 = true;
            class27.field345 = class295.field4856;
            class226.field3581 = class100.field1513;
        } else {
            class10.field127 = class31.field384;
            class226.field3581 = class307.field4988;
            class310.field5015 = class113.field1709;
            class27.field345 = class90.field1384;
        }
        class218.field3472 = class300.field4920 = class250.field3986 = class306.field4981 = new short[256];
        class37.field486 = class249.field3962;
        if (class255.field4217 == 3 && class138.field2130 != 2) {
            class285.field4763 = class189.field2901;
        }
        class57.field773 = class178.field2765;
        class148.field2323 = class137.field2129;
        class68.method430(223);
        class280.method1949(false, class113.field1701);
        class98.method638(class113.field1701, arg0 ^ 0x77);
        class254.field4069 = class202.method1456(128);
        if (class254.field4069 != null) {
            class254.field4069.method227(-64, class113.field1701);
        }
        class274.field4543 = class255.field4217;
        try {
            if (class259.field4254.field4219 != null) {
                class42.field530 = new class241(class259.field4254.field4219, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class143.field2250[var2] = new class241(class259.field4254.field4207[var2], 6000, 0);
                }
                class292.field4821 = new class241(class259.field4254.field4206, 6000, 0);
                class231.field3700 = new class55(255, class42.field530, class292.field4821, 500000);
                class93.field1416 = new class241(class259.field4254.field4205, 24, 0);
                class259.field4254.field4219 = null;
                class259.field4254.field4207 = null;
                class259.field4254.field4206 = null;
                class259.field4254.field4205 = null;
            }
        } catch (IOException var3) {
            class93.field1416 = null;
            class231.field3700 = null;
            class292.field4821 = null;
            class42.field530 = null;
        }
        if (class121.field1857 == 0) {
            class37.field487 = class218.field3488;
        } else if (class121.field1857 == 1) {
            class37.field487 = class52.field699;
        }
        if (class138.field2130 != 0) {
            class260.field4264 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lkk;)Z")
    public static final boolean method1096(class254 arg0) {
        if (class266.field4381) {
            if (method1085(arg0).field3765 != 0) {
                return false;
            }
            if (arg0.field4052 == 0) {
                return false;
            }
        }
        return arg0.field4049;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method628(int arg0) {
        field2577++;
        if (class115.field1733 == 1000) {
            return;
        }
        class4.field32++;
        if ((class4.field32 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class192.field3046 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class294.field4829.setSeed((long) class192.field3046);
        }
        this.method1086(-9528);
        if (class18.field248 != null) {
            class18.field248.method13((byte) -124);
        }
        class35.method215(arg0);
        class217.method1521(1);
        class92.method601((byte) 82);
        class74.method486((byte) -101);
        if (class254.field4069 != null) {
            int var3 = class254.field4069.method233(-18681);
            class150.field2332 = var3;
        }
        if (class115.field1733 == 0) {
            this.method1089((byte) -104);
            class252.method1748(9801);
        } else if (class115.field1733 == 5) {
            this.method1089((byte) -121);
            class252.method1748(9801);
        } else if (class115.field1733 == 25 || class115.field1733 == 28) {
            class252.method1746(4);
        }
        if (class115.field1733 == 10) {
            this.method1100(false);
            class284.method2004(-78);
            class180.method1203((byte) 74);
            class36.method217(0);
        } else if (class115.field1733 == 30) {
            class210.method1493(48);
        } else if (class115.field1733 == 40) {
            class36.method217(0);
            if (class198.field3133 != -3) {
                if (class198.field3133 == 15) {
                    class216.method1509((byte) -52);
                    return;
                }
                if (class198.field3133 != 2) {
                    class227.method1578(arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)I")
    public static final int method1097(byte arg0, boolean arg1) {
        long var2 = class267.method1841((byte) 109);
        field2578++;
        if (arg0 >= -81) {
            return -11;
        }
        for (class313 var4 = arg1 ? (class313) class36.field450.method871(-36) : (class313) class36.field450.method869(-14210); var4 != null; var4 = (class313) class36.field450.method869(-14210)) {
            if ((var4.field5041 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field5041 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2102;
                    class209.field3356[var5] = class178.field2775[var5];
                    var4.method900(60);
                    return var5;
                }
                var4.method900(53);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2573++;
        if (!this.method622(-49)) {
            return;
        }
        class189.field2901 = Integer.parseInt(this.getParameter("worldid"));
        class138.field2130 = Integer.parseInt(this.getParameter("modewhere"));
        if (class138.field2130 < 0 || class138.field2130 > 1) {
            class138.field2130 = 0;
        }
        class169.field2630 = Integer.parseInt(this.getParameter("modewhat"));
        if (class169.field2630 < 0 || class169.field2630 > 2) {
            class169.field2630 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class176.field2748 = true;
        } else {
            class176.field2748 = false;
        }
        try {
            class284.field4755 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class284.field4755 = 0;
        }
        class259.method1802(class284.field4755, (byte) 127);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class295.field4850 = true;
        } else {
            class295.field4850 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class119.field1836 = true;
        } else {
            class119.field1836 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class121.field1857 = 1;
        } else {
            class121.field1857 = 0;
        }
        try {
            class115.field1742 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class115.field1742 = 0;
        }
        class275.field4552 = this.getParameter("settings");
        if (class275.field4552 == null) {
            class275.field4552 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class280.field4630 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class280.field4630 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class34.field420 = true;
        } else {
            class34.field420 = false;
        }
        class145.field2295 = this;
        this.method621(-51, 765, class169.field2630 + 32, 553, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method623(boolean arg0) {
        field2569++;
        if (class115.field1733 == 1000) {
            return;
        }
        long var2 = class29.method171(0) / 1000000L - class152.field2363;
        class152.field2363 = class29.method171(0) / 1000000L;
        if (!arg0) {
            return;
        }
        boolean var4 = class247.method1725(22050);
        if (var4 && class6.field52 && class199.field3155 != null) {
            class199.field3155.method1164(true);
        }
        if ((class115.field1733 == 30 || class115.field1733 == 10) && (class296.field4864 || class74.field1155 != 0L && class267.method1841((byte) 111) > class74.field1155)) {
            class204.method1463(false, class152.field2373, class115.method725((byte) -42), class296.field4864, class296.field4867);
        }
        if (class180.field2797 == null) {
            Container var5;
            if (class180.field2797 != null) {
                var5 = class180.field2797;
            } else if (class224.field3565 == null) {
                var5 = class259.field4254.field4211;
            } else {
                var5 = class224.field3565;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class224.field3565 == var5) {
                Insets var8 = class224.field3565.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class143.field2233 != var6 || class131.field2013 != var7) {
                if (class255.field4203.startsWith("mac")) {
                    class131.field2013 = var7;
                    class143.field2233 = var6;
                } else {
                    class44.method281(-19545);
                }
                class74.field1155 = class267.method1841((byte) 126) + 500L;
            }
        }
        boolean var9 = false;
        if (class120.field1850) {
            class120.field1850 = false;
            var9 = true;
        }
        if (var9) {
            class203.method1461(126);
        }
        if (class115.field1733 == 0) {
            class124.method814((byte) 94, var9, class204.field3288, (Color) null, class248.field3941);
        } else if (class115.field1733 == 5) {
            class8.method43(false, class202.field3227, 120);
        } else if (class115.field1733 == 10) {
            class159.method1056(false);
        } else if (class115.field1733 == 25 || class115.field1733 == 28) {
            if (class273.field4500 == 1) {
                if (class14.field211 < class311.field5022) {
                    class14.field211 = class311.field5022;
                }
                int var11 = (class14.field211 - class311.field5022) * 50 / class14.field211;
                class152.method1007(false, class250.field3982 + "<br>(" + var11 + "%)", (byte) -121);
            } else if (class273.field4500 == 2) {
                if (class72.field1043 > class50.field683) {
                    class50.field683 = class72.field1043;
                }
                int var10 = (class50.field683 - class72.field1043) * 50 / class50.field683 + 50;
                class152.method1007(false, class250.field3982 + "<br>(" + var10 + "%)", (byte) -121);
            } else {
                class152.method1007(false, class250.field3982, (byte) -121);
            }
        } else if (class115.field1733 == 30) {
            class219.method1534((byte) 102, var2);
        } else if (class115.field1733 == 40) {
            class152.method1007(false, class126.field1954 + "<br>" + class126.field1949, (byte) -121);
        }
        if ((class115.field1733 == 30 || class115.field1733 == 10) && class37.field482 == 0 && !var9) {
            try {
                Graphics var14 = class113.field1701.getGraphics();
                for (int var15 = 0; var15 < class249.field3967; var15++) {
                    if (class241.field3799[var15]) {
                        class301.field4942.method115(class260.field4266[var15], class150.field2341[var15], -1, var14, class73.field1059[var15], class310.field5013[var15]);
                        class241.field3799[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class113.field1701.repaint();
            }
        } else if (class115.field1733 != 0) {
            try {
                Graphics var12 = class113.field1701.getGraphics();
                class301.field4942.method116(var12, 0, 0, (byte) 77);
                for (int var13 = 0; var13 < class249.field3967; var13++) {
                    class241.field3799[var13] = false;
                }
            } catch (Exception var17) {
                class113.field1701.repaint();
            }
        }
        if (class123.field1884) {
            class132.method897(-10);
        }
        if (class192.field3039 && class115.field1733 == 10 && class160.field2523 != -1) {
            class192.field3039 = false;
            class248.method1733(false, class259.field4254);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method1098() {
        for (int var0 = -1; var0 < class249.field3964 + class14.field195; var0++) {
            class58 var1;
            long var2;
            if (var0 < 0) {
                var1 = class309.field5006;
                var2 = 8791798054912L;
            } else if (var0 < class249.field3964) {
                int var4 = class53.field713[var0];
                var1 = class300.field4925[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class76.field1189[var0 - class249.field3964];
                class35 var6 = class76.field1188[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field442.field1648) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field879 >= 0) {
                int var7 = var1.method362(25892);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field836 & 0x7F) == 0 && (var1.field850 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var1.field836 & 0x7F) == 64 && (var1.field850 & 0x7F) == 64) {
                    continue;
                }
                if (var1 instanceof class208 && var1.field882 != null && class4.field32 >= var1.field815 && class4.field32 < var1.field809) {
                    ((class208) var1).field3314 = false;
                    var1.field869 = class12.method66(var1.field836, class165.field2600, var1.field850, 0);
                    class4.method11(class165.field2600, var1.field836, var1.field850, var1.field869, var1, var1.field855, var2, var1.field820, var1.field811, var1.field828, var1.field798);
                } else {
                    var1.field869 = class12.method66(var1.field836, class165.field2600, var1.field850, 0);
                    class121.method786(class165.field2600, var1.field836, var1.field850, var1.field869, (var7 - 1) * 64 + 60, var1, var1.field855, var2, var1.field863);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1099(int arg0, int arg1) {
        class55.field745 = null;
        if (arg1 != 24992) {
            field2581 = 64;
        }
        class119.field1813 = null;
        class34.field421 = 0;
        field2572++;
        class229.field3663.field3856 = arg0;
        class229.field3663.field3858++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method625(int arg0) {
        if (class282.field4721 != null) {
            class282.field4721.field1536 = false;
        }
        class282.field4721 = null;
        field2575++;
        if (class103.field1551 != null) {
            class103.field1551.method1277(false);
            class103.field1551 = null;
        }
        class242.method1699(class113.field1701, -1);
        class230.method1620(class113.field1701, 0);
        if (class254.field4069 != null) {
            class254.field4069.method232(-127, class113.field1701);
        }
        class230.method1617(-76);
        class117.method759(-1);
        class254.field4069 = null;
        if (class199.field3155 != null) {
            class199.field3155.method1158(-128);
        }
        int var2 = 72 % ((arg0 - 6) / 56);
        if (class60.field921 != null) {
            class60.field921.method1158(126);
        }
        class229.field3663.method1697((byte) -8);
        class69.field1012.method1059(25310);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1100(boolean arg0) {
        class85.field1348 = 0;
        field2580++;
        while (class58.method359(false) && class85.field1348 < 128) {
            class248.field3944[class85.field1348] = class264.field4355;
            class259.field4256[class85.field1348] = class242.field3823;
            class85.field1348++;
        }
        class247.field3938++;
        if (class160.field2523 != -1) {
            class14.method87(0, 0, class79.field1254, 0, class160.field2523, 0, arg0, class169.field2644);
        }
        class40.field502++;
        if (class121.field1857 == 0) {
            class79.method530(-126);
        } else if (class4.field34 == 0 && class52.field708 == 0) {
            if (class92.field1402 == 2) {
                class192.method1335(5000);
            } else {
                class121.method789(0);
            }
            if (class53.field715 >> 7 < 14 || class53.field715 >> 7 >= 90 || (class174.field2724 >> 7) < 14 || class174.field2724 >> 7 >= 90) {
                class78.method523(-1);
            }
        }
        while (true) {
            class298 var2;
            class254 var3;
            class254 var4;
            do {
                var2 = (class298) class24.field311.method1960((byte) -108);
                if (var2 == null) {
                    while (true) {
                        class298 var5;
                        class254 var6;
                        class254 var7;
                        do {
                            var5 = (class298) class154.field2405.method1960((byte) -103);
                            if (var5 == null) {
                                while (true) {
                                    class298 var8;
                                    class254 var9;
                                    class254 var10;
                                    do {
                                        var8 = (class298) class276.field4573.method1960((byte) -109);
                                        if (var8 == null) {
                                            if (class138.field2135 != null) {
                                                class130.method860(3);
                                            }
                                            if (arg0) {
                                                method1085((class254) null);
                                            }
                                            if (class104.field1569 != null && class104.field1569.field725 == 1) {
                                                if (class104.field1569.field723 != null) {
                                                    class182.method1210(class300.field4929, true, class212.field3387);
                                                }
                                                class212.field3387 = false;
                                                class300.field4929 = null;
                                                class104.field1569 = null;
                                            }
                                            if ((class4.field32 % 1500) == 0) {
                                                class250.method1740((byte) 117);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4906;
                                        if (var9.field4040 < 0) {
                                            break;
                                        }
                                        var10 = class80.method534(-68, var9.field4167);
                                    } while (var10 == null || var10.field4123 == null || var10.field4123.length <= var9.field4040 || var10.field4123[var9.field4040] != var9);
                                    class126.method844(200000, var8);
                                }
                            }
                            var6 = var5.field4906;
                            if (var6.field4040 < 0) {
                                break;
                            }
                            var7 = class80.method534(108, var6.field4167);
                        } while (var7 == null || var7.field4123 == null || var7.field4123.length <= var6.field4040 || var7.field4123[var6.field4040] != var6);
                        class126.method844(200000, var5);
                    }
                }
                var3 = var2.field4906;
                if (var3.field4040 < 0) {
                    break;
                }
                var4 = class80.method534(-58, var3.field4167);
            } while (var4 == null || var4.field4123 == null || var3.field4040 >= var4.field4123.length || var4.field4123[var3.field4040] != var3);
            class126.method844(200000, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method1101() {
        for (int var0 = 0; var0 < 104; var0++) {
            int[] var1 = class209.field3357[var0];
            for (int var2 = 0; var2 < 104; var2++) {
                var1[var2] = 0;
            }
        }
    }
}
