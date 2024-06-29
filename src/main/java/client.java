import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class276 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lck;")
    public static class119 field1387 = class298.method1987((byte) 46, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lck;")
    public static class119 field1389 = class298.method1987((byte) 81, "Art");

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lck;")
    public static class119 field1386 = class298.method1987((byte) 57, "::rebuild");

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[[S")
    private static short[][] field1402 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lck;")
    public static class119 field1403 = class298.method1987((byte) 95, "brookdale");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lva;")
    public static class36 field1397;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[[[B")
    public static byte[][][] field1392;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V", line = 6)
    private final void method609(int arg0, int arg1) {
        class181.field2870 = 0;
        class240.field3858 = null;
        field1391++;
        class58.field942 = null;
        if (class273.field4483 == class207.field3292) {
            class207.field3292 = class176.field2812;
        } else {
            class207.field3292 = class273.field4483;
        }
        int var3 = -99 % ((-arg1 - 75) / 46);
        class90.field1379++;
        if (class90.field1379 >= 2 && arg0 == 7 || arg0 == 9) {
            if (class214.field3407 <= 5) {
                this.method1821(-41, "js5connect_full");
                class214.field3407 = 1000;
            } else {
                class46.field674 = 3000;
            }
        } else if (class90.field1379 >= 2 && arg0 == 6) {
            this.method1821(-48, "js5connect_outofdate");
            class214.field3407 = 1000;
        } else if (class90.field1379 >= 4) {
            if (class214.field3407 <= 5) {
                this.method1821(-104, "js5connect");
                class214.field3407 = 1000;
            } else {
                class46.field674 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 59)
    public final void method610(int arg0) {
        method621((byte) -59);
        class119.method789(8);
        field1395++;
        class276.method1814((byte) 124);
        class264.method1713();
        class162.method1033((byte) -119);
        class258.method1653(-115);
        class100.method669((byte) -74);
        class229.method1487((byte) -93);
        class3.method70(110);
        class253.method1631(0);
        class23.method180(false);
        class174.method1109(30);
        class75.method538(9982);
        class163.method1036((byte) 113);
        class147.method965(true);
        class156.method990(16771501);
        class266.method1747(91);
        class134.method888((byte) 127);
        class72.method513(true);
        class292.method1943(false);
        class212.method1331(0);
        class230.method1488(0);
        class233.method1499(86);
        class49.method367(-193);
        class88.method602(1361938307);
        class191.method1210(1473);
        class39.method308(true);
        class93.method638(14);
        class260.method1666(false);
        class56.method424(false);
        class297.method1981(-102);
        class104.method688(0);
        class129.method860(47);
        class50.method380(true);
        class288.method1924(2);
        class79.method551(true);
        class209.method1313(6);
        class273.method1805(0);
        class67.method493((byte) -123);
        class211.method1323(-1);
        class217.method1371(-54);
        class246.method1600(true);
        class207.method1302((byte) -128);
        class236.method1514((byte) -128);
        class254.method1635((byte) 101);
        class152.method977((byte) 77);
        class291.method1931(109);
        class126.method848(44);
        class178.method1140();
        class78.method549(false);
        class36.method268(-16268);
        class267.method1764();
        class29.method226(-114);
        class228.method1463();
        class262.method1698(20839);
        class48.method366();
        class57.method429(16128);
        class153.method978(0);
        class110.method708(0);
        class92.method631(13771);
        class10.method104(100);
        class95.method646(-1);
        class131.method870((byte) -116);
        class143.method936();
        class27.method200(1024);
        class190.method1202((byte) 68);
        class81.method556(true);
        class278.method1826();
        class220.method1395(-99);
        class145.method948();
        class196.method1259(124);
        class169.method1067(7);
        class293.method1951((byte) -126);
        class146.method955(false);
        class106.method689(-117);
        class199.method1271(59);
        class69.method501((byte) -22);
        class37.method291((byte) 98);
        class41.method319();
        class21.method168();
        class138.method910(160);
        class73.method521(true);
        class87.method585((byte) 93);
        class216.method1369(-120);
        class284.method1901();
        class286.method1915();
        class279.method1851(true);
        class283.method1883(-111);
        class125.method839();
        class243.method1585(-123);
        class113.method723(-104);
        class139.method914((byte) -15);
        class172.method1085();
        class137.method909();
        class187.method1181(65536);
        class135.method898((byte) 77);
        class289.method1927(127);
        class158.method1014((byte) -76);
        class101.method671(false);
        class294.method1961();
        class185.method1176(-128);
        class97.method653(-95);
        class58.method434(0);
        class14.method119(0);
        class65.method481(1656);
        class117.method738(-1);
        class173.method1105(25285);
        class218.method1377();
        class62.method461(true);
        class177.method1132(-122);
        class184.method1171((byte) -124);
        class54.method402((byte) 54);
        class86.method575(-28729);
        class296.method1975(14);
        class259.method1655(0);
        class247.method1608(-10421);
        class261.method1684((byte) -87);
        class182.method1161(127);
        class272.method1802((byte) 112);
        class55.method410(-1);
        class240.method1565(119);
        class68.method499(-1024122105);
        class252.method1626(-26982);
        class44.method345((byte) -76);
        class295.method1966(6359);
        class20.method155(-97);
        class11.method106((byte) 39);
        class170.method1077((byte) -114);
        class96.method650(30265);
        class198.method1268(2);
        class281.method1863((byte) 18);
        class31.method234((byte) -127);
        class268.method1782(24);
        class1.method3((byte) -10);
        class176.method1124(true);
        class132.method871((byte) 116);
        class166.method1051(27512);
        class226.method1437((byte) -62);
        class164.method1042(0);
        class179.method1148((byte) 70);
        class142.method934(52);
        class32.method241(64);
        class181.method1157(-32255);
        class19.method152((byte) 50);
        class201.method1280(false);
        class116.method733();
        class124.method829((byte) 48);
        class241.method1570(68);
        class25.method189((byte) 21);
        class118.method745(0);
        class42.method322(0);
        class204.method1288((byte) 50);
        class256.method1642(-1);
        class222.method1405(21482);
        class298.method1990(-11);
        class99.method665(-97);
        class197.method1266((byte) -79);
        class277.method1824(-12450);
        class238.method1522(5879);
        class214.method1347(1);
        class265.method1742((byte) -115);
        class270.method1792(true);
        class245.method1596(0);
        class53.method396(4);
        class202.method1283(-128);
        class180.method1153();
        class112.method717();
        class165.method1045();
        class157.method1004(-128);
        class193.method1239(true);
        class61.method456(500);
        class108.method696(false);
        class225.method1436();
        class22.method171(52);
        class5.method81((byte) -34);
        class263.method1702((byte) -116);
        class210.method1317(90);
        class188.method1192();
        class194.method1244();
        class242.method1574(false);
        class195.method1250(false);
        class103.method684(-520865913);
        class285.method1905(2);
        class59.method437(18616);
        class140.method919(104);
        class136.method903();
        class248.method1611();
        class251.method1620();
        class98.method660(0);
        class234.method1504(29451);
        class64.method478((byte) -47);
        class24.method186(104);
        class4.method77((byte) -77);
        class46.method349(false);
        class171.method1084((byte) 25);
        class189.method1196((byte) 34);
        class63.method472((byte) -74);
        class200.method1275((byte) 111);
        class299.method1997(-1);
        class30.method231(112);
        class221.method1402((byte) 110);
        class70.method506(26187);
        class227.method1447(-128);
        class26.method192(104);
        class91.method626((byte) -99);
        class109.method706((byte) -127);
        class232.method1495(0);
        class205.method1297(-127);
        int var2 = -51 % ((55 - arg0) / 45);
        class128.method853((byte) -20);
        class111.method712(2048);
        class255.method1640((byte) 121);
        class269.method1788((byte) 90);
        class203.method1284(-54);
        class244.method1594(111);
        class6.method85(-89);
        class90.method608(0);
        class102.method674(0);
        class114.method725(2);
        class161.method1028(true);
        class144.method944((byte) -114);
        class7.method86(15);
        class215.method1354((byte) -95);
        class151.method971(false);
        class257.method1649((byte) -49);
        class2.method8((byte) 9);
        class35.method254(0);
        class85.method572((byte) 105);
        class84.method567(0);
        class237.method1518(-68);
        class208.method1309((byte) -105);
        class167.method1057(2047);
        class183.method1165(-72);
        class249.method1613(22);
        class76.method543(true);
        class231.method1491((byte) 121);
        class82.method562((byte) 44);
        class287.method1921((byte) 86);
        class13.method111(4);
        class150.method968(-1);
        class155.method989(true);
        class9.method100(1);
        class71.method509(true);
        class224.method1424(true);
        class154.method984(16);
        class168.method1066(0);
        class8.method90(117);
        class94.method642(125);
        class280.method1862((byte) 57);
        class120.method802((byte) 89);
        class206.method1299((byte) 105);
        class250.method1616(-113);
        class74.method533(16777215);
        if (class276.field4541) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 322)
    public final void method611(int arg0) {
        field1400++;
        if (class190.field2997 == arg0) {
        }
        class242.method1576(class220.field3533, arg0 ^ 0x71, class167.field2637);
        class176.field2812 = class289.field4744 == 0 ? 443 : class243.field3919 + 50000;
        if (class23.field359 == 1) {
            class46.field673 = class263.field4279;
            class19.field244 = class279.field4605;
            class42.field634 = class189.field2996;
            class178.field2843 = 0;
            class178.field2838 = 16777215;
            class206.field3274 = class295.field4896;
        } else {
            class42.field634 = class291.field4832;
            class19.field244 = field1402;
            class206.field3274 = class184.field2923;
            class46.field673 = class42.field639;
        }
        class234.field3782 = class142.field2271 = class153.field2436 = class92.field1425 = new short[256];
        class273.field4483 = class289.field4744 == 0 ? 43594 : class243.field3919 + 40000;
        class207.field3292 = class273.field4483;
        class8.method91(222);
        class119.method798(class39.field587, (byte) 26);
        class138.method912(class39.field587, (byte) -50);
        class280.field4637 = class35.method256(true);
        if (class280.field4637 != null) {
            class280.field4637.method354(32353, class39.field587);
        }
        class24.field369 = class282.field4667;
        try {
            if (class220.field3533.field4652 != null) {
                class154.field2464 = new class174(class220.field3533.field4652, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class68.field1058[var2] = new class174(class220.field3533.field4653[var2], 6000, 0);
                }
                class161.field2550 = new class174(class220.field3533.field4668, 6000, 0);
                class297.field4957 = new class75(255, class154.field2464, class161.field2550, 500000);
                class9.field175 = new class174(class220.field3533.field4661, 24, 0);
                class220.field3533.field4668 = null;
                class220.field3533.field4661 = null;
                class220.field3533.field4653 = null;
                class220.field3533.field4652 = null;
            }
        } catch (IOException var4) {
            class9.field175 = null;
            class161.field2550 = null;
            class297.field4957 = null;
            class154.field2464 = null;
        }
        if (class289.field4744 != 0) {
            class106.field1618 = true;
        }
        class4.field125 = class118.field1781;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lml;)Z", line = 409)
    public static final boolean method612(class134 arg0) {
        if (class106.field1626) {
            if (method620(arg0) != 0) {
                return false;
            }
            if (arg0.field2135 == 0) {
                return false;
            }
        }
        return arg0.field2160;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lml;IIIIIII)V", line = 436)
    public static final void method613(class134[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class134 var9 = arg0[var8];
            if (var9 != null && var9.field2024 == arg1 && (!var9.field2097 || var9.field2135 == 0 || var9.field2030 || method620(var9) != 0 || class288.field4742 == var9 || var9.field2068 == 1338) && (!var9.field2097 || !method612(var9))) {
                int var10 = var9.field2021 + arg6;
                int var11 = var9.field2100 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2135 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2180 + var10;
                    int var17 = var9.field2057 + var11;
                    if (var9.field2135 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class131.field2007 == var9) {
                    class94.field1447 = true;
                    class242.field3877 = var10;
                    class196.field3134 = var11;
                }
                if (!var9.field2097 || var12 < var14 && var13 < var15) {
                    if (var9.field2135 == 0) {
                        if (!var9.field2097 && method612(var9) && class93.field1439 != var9) {
                            continue;
                        }
                        if (var9.field2153 && class129.field1984 >= var12 && class65.field1024 >= var13 && class129.field1984 < var14 && class65.field1024 < var15) {
                            for (class1 var18 = (class1) class120.field1893.method995(1836596936); var18 != null; var18 = (class1) class120.field1893.method996(0)) {
                                if (var18.field13) {
                                    var18.method552((byte) 41);
                                }
                            }
                            if (class36.field521 == 0) {
                                class131.field2007 = null;
                                class288.field4742 = null;
                            }
                            class30.field431 = false;
                        }
                    }
                    if (var9.field2097) {
                        boolean var19;
                        if (class129.field1984 >= var12 && class65.field1024 >= var13 && class129.field1984 < var14 && class65.field1024 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class272.field4475 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class296.field4938 == 1 && class245.field3975 >= var12 && class210.field3346 >= var13 && class245.field3975 < var14 && class210.field3346 < var15) {
                            var21 = true;
                        }
                        if (class13.field215 > 0 && var9.field2036 != null) {
                            for (int var22 = 0; var22 < var9.field2036.length; var22++) {
                                for (int var23 = 0; var23 < class13.field215; var23++) {
                                    int var24 = var9.field2036[var22] & 0xFF;
                                    if (class35.field490[var23] == var24) {
                                        class234.method1507(126, -1, class203.field3220, var22 + 1, var9.field2120);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class82.method560(class210.field3346 - var11, class245.field3975 - var10, var9, 2);
                        }
                        if (class131.field2007 != null && class131.field2007 != var9 && var19 && class134.method881(false, method620(var9))) {
                            class292.field4855 = var9;
                        }
                        if (class288.field4742 == var9) {
                            class154.field2463 = true;
                            class210.field3357 = var10;
                            class142.field2269 = var11;
                        }
                        if (var9.field2030 || var9.field2068 != 0) {
                            if (var19 && class214.field3410 != 0 && var9.field2121 != null) {
                                class1 var25 = new class1();
                                var25.field13 = true;
                                var25.field8 = var9;
                                var25.field10 = class214.field3410;
                                var25.field14 = var9.field2121;
                                class120.field1893.method999(var25, (byte) -108);
                            }
                            if (class131.field2007 != null || class97.field1486 != null || class104.field1612 || var9.field2068 != 1400 && class30.field431) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2068 != 0) {
                                if (var9.field2068 == 1337) {
                                    class202.field3208 = var9;
                                    class26.method194(var9, -113);
                                    continue;
                                }
                                if (var9.field2068 == 1338) {
                                    if (var21) {
                                        class103.method680(class210.field3346 - var11, var9, 69, class245.field3975 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field2068 == 1400) {
                                    class187.field2942 = var9;
                                    if (var21) {
                                        if (class289.field4760[82] && class19.field248 > 0) {
                                            int var26 = (int) ((double) (class245.field3975 - var10 - var9.field2180 / 2) * 2.0D / class285.field4707) + class142.field2263 + class257.field4133;
                                            int var27 = class221.field3552 + class258.field4137 - (int) ((double) (class210.field3346 - var11 - var9.field2057 / 2) * 2.0D / class285.field4707) - class162.field2561;
                                            class119 var28 = class170.method1074(new class119[] { class171.field2716, class234.method1506(var26 >> 6, (byte) -79), class298.field5020, class234.method1506(var27 >> 6, (byte) -79), class298.field5020, class234.method1506(var26 & 0x3F, (byte) -79), class298.field5020, class234.method1506(var27 & 0x3F, (byte) -79) }, -118);
                                            var28.method797(7999);
                                            class206.method1300(var28, 13777);
                                            class71.method508(75);
                                            continue;
                                        }
                                        class30.field431 = true;
                                        class118.field1789 = class129.field1984;
                                        class250.field4038 = class65.field1024;
                                        class211.field3372 = class257.field4133;
                                        class65.field1026 = class162.field2561;
                                        continue;
                                    }
                                    if (var20 && class30.field431) {
                                        class27.method198(-1, (int) ((double) (class118.field1789 - class129.field1984) * 2.0D / class108.field1651) + class211.field3372);
                                        class233.method1500(-1, (int) ((double) (class250.field4038 - class65.field1024) * 2.0D / class108.field1651) + class65.field1026);
                                        continue;
                                    }
                                    class30.field431 = false;
                                    continue;
                                }
                                if (var9.field2068 == 1401) {
                                    if (var20) {
                                        class256.method1641(class65.field1024 - var11, var9.field2057, -124, var9.field2180, class129.field1984 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field2068 == 1402 || var9.field2068 == 1404) {
                                    continue;
                                }
                            }
                            if (!var9.field2179 && var21) {
                                var9.field2179 = true;
                                if (var9.field2116 != null) {
                                    class1 var29 = new class1();
                                    var29.field13 = true;
                                    var29.field8 = var9;
                                    var29.field11 = class245.field3975 - var10;
                                    var29.field10 = class210.field3346 - var11;
                                    var29.field14 = var9.field2116;
                                    class120.field1893.method999(var29, (byte) -108);
                                }
                            }
                            if (var9.field2179 && var20 && var9.field2124 != null) {
                                class1 var30 = new class1();
                                var30.field13 = true;
                                var30.field8 = var9;
                                var30.field11 = class129.field1984 - var10;
                                var30.field10 = class65.field1024 - var11;
                                var30.field14 = var9.field2124;
                                class120.field1893.method999(var30, (byte) -108);
                            }
                            if (var9.field2179 && !var20) {
                                var9.field2179 = false;
                                if (var9.field2060 != null) {
                                    class1 var31 = new class1();
                                    var31.field13 = true;
                                    var31.field8 = var9;
                                    var31.field11 = class129.field1984 - var10;
                                    var31.field10 = class65.field1024 - var11;
                                    var31.field14 = var9.field2060;
                                    class163.field2569.method999(var31, (byte) -108);
                                }
                            }
                            if (var20 && var9.field2167 != null) {
                                class1 var32 = new class1();
                                var32.field13 = true;
                                var32.field8 = var9;
                                var32.field11 = class129.field1984 - var10;
                                var32.field10 = class65.field1024 - var11;
                                var32.field14 = var9.field2167;
                                class120.field1893.method999(var32, (byte) -108);
                            }
                            if (!var9.field2046 && var19) {
                                var9.field2046 = true;
                                if (var9.field2101 != null) {
                                    class1 var33 = new class1();
                                    var33.field13 = true;
                                    var33.field8 = var9;
                                    var33.field11 = class129.field1984 - var10;
                                    var33.field10 = class65.field1024 - var11;
                                    var33.field14 = var9.field2101;
                                    class120.field1893.method999(var33, (byte) -108);
                                }
                            }
                            if (var9.field2046 && var19 && var9.field2142 != null) {
                                class1 var34 = new class1();
                                var34.field13 = true;
                                var34.field8 = var9;
                                var34.field11 = class129.field1984 - var10;
                                var34.field10 = class65.field1024 - var11;
                                var34.field14 = var9.field2142;
                                class120.field1893.method999(var34, (byte) -108);
                            }
                            if (var9.field2046 && !var19) {
                                var9.field2046 = false;
                                if (var9.field2062 != null) {
                                    class1 var35 = new class1();
                                    var35.field13 = true;
                                    var35.field8 = var9;
                                    var35.field11 = class129.field1984 - var10;
                                    var35.field10 = class65.field1024 - var11;
                                    var35.field14 = var9.field2062;
                                    class163.field2569.method999(var35, (byte) -108);
                                }
                            }
                            if (var9.field2108 != null) {
                                class1 var36 = new class1();
                                var36.field8 = var9;
                                var36.field14 = var9.field2108;
                                class209.field3342.method999(var36, (byte) -108);
                            }
                            if (var9.field2118 != null && class131.field2006 > var9.field2164) {
                                if (var9.field2045 == null || class131.field2006 - var9.field2164 > 32) {
                                    class1 var41 = new class1();
                                    var41.field8 = var9;
                                    var41.field14 = var9.field2118;
                                    class120.field1893.method999(var41, (byte) -108);
                                } else {
                                    label541: for (int var37 = var9.field2164; var37 < class131.field2006; var37++) {
                                        int var38 = class205.field3244[var37 & 0x1F];
                                        for (int var39 = 0; var39 < var9.field2045.length; var39++) {
                                            if (var9.field2045[var39] == var38) {
                                                class1 var40 = new class1();
                                                var40.field8 = var9;
                                                var40.field14 = var9.field2118;
                                                class120.field1893.method999(var40, (byte) -108);
                                                break label541;
                                            }
                                        }
                                    }
                                }
                                var9.field2164 = class131.field2006;
                            }
                            if (var9.field2148 != null && class139.field2224 > var9.field2035) {
                                if (var9.field2150 == null || class139.field2224 - var9.field2035 > 32) {
                                    class1 var46 = new class1();
                                    var46.field8 = var9;
                                    var46.field14 = var9.field2148;
                                    class120.field1893.method999(var46, (byte) -108);
                                } else {
                                    label517: for (int var42 = var9.field2035; var42 < class139.field2224; var42++) {
                                        int var43 = class26.field386[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2150.length; var44++) {
                                            if (var9.field2150[var44] == var43) {
                                                class1 var45 = new class1();
                                                var45.field8 = var9;
                                                var45.field14 = var9.field2148;
                                                class120.field1893.method999(var45, (byte) -108);
                                                break label517;
                                            }
                                        }
                                    }
                                }
                                var9.field2035 = class139.field2224;
                            }
                            if (var9.field2058 != null && class13.field212 > var9.field2147) {
                                if (var9.field2174 == null || class13.field212 - var9.field2147 > 32) {
                                    class1 var51 = new class1();
                                    var51.field8 = var9;
                                    var51.field14 = var9.field2058;
                                    class120.field1893.method999(var51, (byte) -108);
                                } else {
                                    label493: for (int var47 = var9.field2147; var47 < class13.field212; var47++) {
                                        int var48 = class1.field18[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2174.length; var49++) {
                                            if (var9.field2174[var49] == var48) {
                                                class1 var50 = new class1();
                                                var50.field8 = var9;
                                                var50.field14 = var9.field2058;
                                                class120.field1893.method999(var50, (byte) -108);
                                                break label493;
                                            }
                                        }
                                    }
                                }
                                var9.field2147 = class13.field212;
                            }
                            if (var9.field2077 != null && class199.field3173 > var9.field2053) {
                                if (var9.field2115 == null || class199.field3173 - var9.field2053 > 32) {
                                    class1 var56 = new class1();
                                    var56.field8 = var9;
                                    var56.field14 = var9.field2077;
                                    class120.field1893.method999(var56, (byte) -108);
                                } else {
                                    label469: for (int var52 = var9.field2053; var52 < class199.field3173; var52++) {
                                        int var53 = class62.field980[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2115.length; var54++) {
                                            if (var9.field2115[var54] == var53) {
                                                class1 var55 = new class1();
                                                var55.field8 = var9;
                                                var55.field14 = var9.field2077;
                                                class120.field1893.method999(var55, (byte) -108);
                                                break label469;
                                            }
                                        }
                                    }
                                }
                                var9.field2053 = class199.field3173;
                            }
                            if (var9.field2082 != null && class291.field4820 > var9.field2122) {
                                if (var9.field2094 == null || class291.field4820 - var9.field2122 > 32) {
                                    class1 var61 = new class1();
                                    var61.field8 = var9;
                                    var61.field14 = var9.field2082;
                                    class120.field1893.method999(var61, (byte) -108);
                                } else {
                                    label445: for (int var57 = var9.field2122; var57 < class291.field4820; var57++) {
                                        int var58 = class252.field4053[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2094.length; var59++) {
                                            if (var9.field2094[var59] == var58) {
                                                class1 var60 = new class1();
                                                var60.field8 = var9;
                                                var60.field14 = var9.field2082;
                                                class120.field1893.method999(var60, (byte) -108);
                                                break label445;
                                            }
                                        }
                                    }
                                }
                                var9.field2122 = class291.field4820;
                            }
                            if (class296.field4920 > var9.field2063 && var9.field2080 != null) {
                                class1 var62 = new class1();
                                var62.field8 = var9;
                                var62.field14 = var9.field2080;
                                class120.field1893.method999(var62, (byte) -108);
                            }
                            if (class261.field4196 > var9.field2063 && var9.field2129 != null) {
                                class1 var63 = new class1();
                                var63.field8 = var9;
                                var63.field14 = var9.field2129;
                                class120.field1893.method999(var63, (byte) -108);
                            }
                            if (class198.field3163 > var9.field2063 && var9.field2098 != null) {
                                class1 var64 = new class1();
                                var64.field8 = var9;
                                var64.field14 = var9.field2098;
                                class120.field1893.method999(var64, (byte) -108);
                            }
                            if (field1388 > var9.field2063 && var9.field2092 != null) {
                                class1 var65 = new class1();
                                var65.field8 = var9;
                                var65.field14 = var9.field2092;
                                class120.field1893.method999(var65, (byte) -108);
                            }
                            if (class91.field1418 > var9.field2063 && var9.field2076 != null) {
                                class1 var66 = new class1();
                                var66.field8 = var9;
                                var66.field14 = var9.field2076;
                                class120.field1893.method999(var66, (byte) -108);
                            }
                            var9.field2063 = class94.field1456;
                            if (var9.field2088 != null) {
                                for (int var67 = 0; var67 < class13.field215; var67++) {
                                    class1 var68 = new class1();
                                    var68.field8 = var9;
                                    var68.field3 = class35.field490[var67];
                                    var68.field12 = class87.field1321[var67];
                                    var68.field14 = var9.field2088;
                                    class120.field1893.method999(var68, (byte) -108);
                                }
                            }
                            if (class49.field751 && var9.field2183 != null) {
                                class1 var69 = new class1();
                                var69.field8 = var9;
                                var69.field14 = var9.field2183;
                                class120.field1893.method999(var69, (byte) -108);
                            }
                        }
                    }
                    if (!var9.field2097 && class131.field2007 == null && class97.field1486 == null && !class104.field1612) {
                        if ((var9.field2166 >= 0 || var9.field2109 != 0) && class129.field1984 >= var12 && class65.field1024 >= var13 && class129.field1984 < var14 && class65.field1024 < var15) {
                            if (var9.field2166 >= 0) {
                                class93.field1439 = arg0[var9.field2166];
                            } else {
                                class93.field1439 = var9;
                            }
                        }
                        if (var9.field2135 == 8 && class129.field1984 >= var12 && class65.field1024 >= var13 && class129.field1984 < var14 && class65.field1024 < var15) {
                            class78.field1197 = var9;
                        }
                        if (var9.field2095 > var9.field2057) {
                            class124.method825(class65.field1024, var9.field2057, var9.field2095, var9.field2180 + var10, var11, class129.field1984, 8, var9);
                        }
                    }
                    if (var9.field2135 == 0) {
                        method613(arg0, var9.field2120, var12, var13, var14, var15, var10 - var9.field2173, var11 - var9.field2169);
                        if (var9.field2061 != null) {
                            method613(var9.field2061, var9.field2120, var12, var13, var14, var15, var10 - var9.field2173, var11 - var9.field2169);
                        }
                        class288 var70 = (class288) class206.field3268.method1329((byte) 90, (long) var9.field2120);
                        if (var70 != null) {
                            class81.method557(var13, var14, var12, var10, var15, (byte) 72, var11, var70.field4739);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1159)
    public final void init() {
        field1394++;
        if (!this.method1817(78)) {
            return;
        }
        class243.field3919 = Integer.parseInt(this.getParameter("worldid"));
        class190.field2997 = Integer.parseInt(this.getParameter("modewhat"));
        class289.field4744 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class167.field2637 = true;
        } else {
            class167.field2637 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class232.field3744 = true;
        } else {
            class232.field3744 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class19.method149(true);
            class65.field1022 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class23.field359 = 1;
        } else {
            class23.field359 = 0;
        }
        try {
            class44.field656 = Integer.parseInt(this.getParameter("js"));
            class220.field3523 = Integer.parseInt(this.getParameter("plug"));
            class54.field867 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var10) {
        }
        class241.field3875 = class173.field2751.method792(this, 0);
        if (class241.field3875 == null) {
            class241.field3875 = class203.field3220;
        }
        String var6 = this.getParameter("advert");
        if (var6 != null) {
            byte[] var7 = var6.getBytes();
            class119 var8 = class250.method1615(var7, var7.length, 0, -76);
            boolean var9 = class13.method115(var8, (byte) 47);
            if (var9) {
                class93.field1442 = var6;
            }
        }
        class215.field3443 = this.getCodeBase().getHost();
        this.method1813(765, 503, class190.field2997 + 32, 503, (byte) 98);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1250)
    private final void method614(byte arg0) {
        field1393++;
        if (arg0 != -120) {
            field1387 = (class119) null;
        }
        boolean var2 = class22.method170((byte) -84);
        if (!var2) {
            this.method622((byte) 106);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1266)
    public static final void main(String[] arg0) {
        field1399++;
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class72.method514((byte) 112);
            }
            class243.field3919 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class289.field4744 = 0;
            } else if (arg0[1].equals("office")) {
                class289.field4744 = 1;
            } else if (arg0[1].equals("local")) {
                class289.field4744 = 2;
            } else {
                class72.method514((byte) 112);
            }
            if (arg0[2].equals("live")) {
                class190.field2997 = 0;
            } else if (arg0[2].equals("rc")) {
                class190.field2997 = 1;
            } else if (arg0[2].equals("wip")) {
                class190.field2997 = 2;
            } else {
                class72.method514((byte) 112);
            }
            if (arg0[4].equals("free")) {
                class232.field3744 = false;
            } else if (arg0[4].equals("members")) {
                class232.field3744 = true;
            } else {
                class72.method514((byte) 112);
            }
            if (arg0[5].equals("english")) {
                class65.field1022 = 0;
            } else if (arg0[5].equals("german")) {
                class19.method149(true);
                class65.field1022 = 1;
            } else {
                class72.method514((byte) 112);
            }
            if (arg0[6].equals("game0")) {
                class23.field359 = 0;
            } else if (arg0[6].equals("game1")) {
                class23.field359 = 1;
            } else {
                class72.method514((byte) 112);
            }
            if (arg0.length != 8) {
                class167.field2637 = false;
            } else if (arg0[7].equals("safemode")) {
                class167.field2637 = true;
            } else {
                class72.method514((byte) 112);
            }
            class215.field3443 = "127.0.0.1";
            class54.field867 = 0;
            class241.field3875 = class203.field3220;
            client var1 = new client();
            var1.method1822(27, 503, -122, 765, "runescape", 503, class190.field2997 + 32);
            class118.field1808.setLocation(40, 40);
        } catch (Exception var3) {
            class87.method591((String) null, var3, 58);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1374)
    private final void method615(int arg0) {
        class297.method1979(this, 39);
        field1384++;
        for (class13.field215 = 0; class198.method1267((byte) -126) && class13.field215 < 128; class13.field215++) {
            class35.field490[class13.field215] = class298.field5027;
            class87.field1321[class13.field215] = class156.field2491;
        }
        class164.field2592++;
        if (class119.field1822 != -1) {
            class81.method557(0, class269.field4437, 0, 0, class131.field2000, (byte) 72, 0, class119.field1822);
        }
        class94.field1456++;
        int var2 = 19137023;
        label172: for (int var3 = 0; var3 < 32768; var3++) {
            class163 var4 = class70.field1103[var3];
            if (var4 != null) {
                byte var5 = var4.field2575.field822;
                if ((var5 & 0x2) > 0 && var4.field4990 == 0 && Math.random() * 1000.0D < 10.0D) {
                    int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    if (var6 != 0 || var7 != 0) {
                        var4.field4963[0] = (var4.field4949 >> 7) + var6;
                        var4.field4973[0] = (var4.field4991 >> 7) + var7;
                        class217.field3510[class10.field189].method1750(var4.field4949 >> 7, false, var4.field4956, var4.field4991 >> 7, 0, 0, var4.field4956);
                        if (var4.field4963[0] >= 0 && (104 - var4.field4956) >= var4.field4963[0] && var4.field4973[0] >= 0 && var4.field4973[0] <= (104 - var4.field4956) && class217.field3510[class10.field189].method1755(19661064, var4.field4949 >> 7, var4.field4973[0], var4.field4963[0], var4.field4991 >> 7)) {
                            if (var4.field4956 > 1) {
                                for (int var8 = var4.field4963[0]; var8 < var4.field4963[0] + var4.field4956; var8++) {
                                    for (int var9 = var4.field4973[0]; var9 < (var4.field4973[0] + var4.field4956); var9++) {
                                        if ((class217.field3510[class10.field189].field4356[var8][var9] & var2) != 0) {
                                            continue label172;
                                        }
                                    }
                                }
                            }
                            var4.field4990 = 1;
                        }
                    }
                }
                class108.method700(var4, arg0 + 1314778066);
                class20.method162((byte) -111, var4);
                class234.method1512(var4, 1);
                class217.field3510[class10.field189].method1756(var4.field4956, var4.field4949 >> 7, 256, var4.field4956, var4.field4991 >> 7, false);
            }
        }
        if (class214.field3407 != 20) {
            if (class68.field1063 == 2) {
                class53.method395(2047);
            } else {
                class280.method1861(-71);
            }
            if ((class62.field987 >> 7) < 14 || class62.field987 >> 7 >= 90 || class70.field1097 >> 7 < 14 || (class70.field1097 >> 7) >= 90) {
                class216.method1368(-105);
            }
        }
        while (true) {
            class1 var10;
            class134 var11;
            class134 var12;
            do {
                var10 = (class1) class209.field3342.method991(16771501);
                if (var10 == null) {
                    while (true) {
                        class1 var13;
                        class134 var17;
                        class134 var18;
                        do {
                            var13 = (class1) class163.field2569.method991(16771501);
                            if (var13 == null) {
                                while (true) {
                                    class1 var14;
                                    class134 var15;
                                    class134 var16;
                                    do {
                                        var14 = (class1) class120.field1893.method991(16771501);
                                        if (var14 == null) {
                                            if (class131.field2007 != null) {
                                                class270.method1795(27359);
                                            }
                                            if (arg0 != -1314753881) {
                                                this.method614((byte) -11);
                                            }
                                            return;
                                        }
                                        var15 = var14.field8;
                                        if (var15.field2138 < 0) {
                                            break;
                                        }
                                        var16 = class20.method153(1, var15.field2024);
                                    } while (var16 == null || var16.field2061 == null || var15.field2138 >= var16.field2061.length || var16.field2061[var15.field2138] != var15);
                                    class184.method1170(var14, 127);
                                }
                            }
                            var17 = var13.field8;
                            if (var17.field2138 < 0) {
                                break;
                            }
                            var18 = class20.method153(1, var17.field2024);
                        } while (var18 == null || var18.field2061 == null || var17.field2138 >= var18.field2061.length || var18.field2061[var17.field2138] != var17);
                        class184.method1170(var13, 110);
                    }
                }
                var11 = var10.field8;
                if (var11.field2138 < 0) {
                    break;
                }
                var12 = class20.method153(1, var11.field2024);
            } while (var12 == null || var12.field2061 == null || var11.field2138 >= var12.field2061.length || var12.field2061[var11.field2138] != var11);
            class184.method1170(var10, arg0 ^ 0xB1A272D9);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1576)
    public final void method616(int arg0) {
        field1385++;
        class264.method1733();
        if (class295.field4900 != null) {
            class295.field4900.detach();
        }
        if (arg0 != 0) {
            field1389 = (class119) null;
        }
        if (class182.field2880 != null) {
            class81.method555(class182.field2880, class220.field3533, arg0 ^ 0x0);
            class182.field2880 = null;
        }
        if (class220.field3533 != null) {
            class220.field3533.method1878((byte) -87, this.getClass());
        }
        if (class111.field1705 != null) {
            class111.field1705.field1517 = false;
        }
        class111.field1705 = null;
        if (class44.field660 != null) {
            class44.field660.method1629(-80);
            class44.field660 = null;
        }
        class72.method517(class39.field587, 1730);
        class173.method1103(class39.field587, -117);
        if (class280.field4637 != null) {
            class280.field4637.method353(class39.field587, true);
        }
        class164.method1043((byte) -40);
        class44.method343(1);
        class280.field4637 = null;
        if (class49.field767 != null) {
            class49.field767.method313(19722);
        }
        if (class195.field3110 != null) {
            class195.field3110.method313(19722);
        }
        class169.method1069(-21771);
        class164.method1041(true);
        try {
            if (class154.field2464 != null) {
                class154.field2464.method1112(arg0 + 127);
            }
            if (class68.field1058 != null) {
                for (int var2 = 0; var2 < class68.field1058.length; var2++) {
                    if (class68.field1058[var2] != null) {
                        class68.field1058[var2].method1112(124);
                    }
                }
            }
            if (class161.field2550 != null) {
                class161.field2550.method1112(109);
            }
            if (class9.field175 != null) {
                class9.field175.method1112(108);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1674)
    public final void method617(boolean arg0) {
        field1396++;
        if (class214.field3407 == 1000) {
            return;
        }
        class1.field15++;
        if (class1.field15 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class67.field1048 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class88.field1341.setSeed((long) class67.field1048);
        }
        this.method614((byte) -120);
        class237.method1519((byte) -75);
        class13.method113((byte) 19);
        class91.method624(4096);
        class167.method1053(1);
        class58.method430((byte) -115);
        class143.method942();
        if (class280.field4637 != null) {
            int var3 = class280.field4637.method355((byte) 121);
            class214.field3410 = var3;
        }
        if (!arg0) {
            return;
        }
        if (class214.field3407 == 0) {
            this.method619(45);
            class184.method1173(32);
        } else if (class214.field3407 == 5) {
            this.method619(45);
            class184.method1173(32);
        } else if (class214.field3407 == 10) {
            this.method615(-1314753881);
            class295.method1963(0);
            return;
        } else if (class214.field3407 == 20) {
            this.method615(-1314753881);
            class220.method1396(false);
        } else if (class214.field3407 == 25) {
            class232.method1498((byte) 82);
        } else if (class214.field3407 == 28) {
            class232.method1498((byte) 90);
            class295.method1963(0);
        }
        if (class214.field3407 == 30) {
            class59.method441(-120);
        } else if (class214.field3407 == 10) {
            this.method615(-1314753881);
        } else if (class214.field3407 == 40) {
            class220.method1396(!arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1798)
    public final void method618(int arg0) {
        field1398++;
        if (class214.field3407 == 1000) {
            return;
        }
        boolean var2 = class285.method1906((byte) -66);
        if (var2 && class196.field3151 && class49.field767 != null) {
            class49.field767.method309(arg0 - 3970);
        }
        if (class75.field1176 && (class214.field3407 == 30 || class214.field3407 == 10)) {
            class291.method1929(2);
        }
        boolean var3 = false;
        if (class182.field2880 != null && !class242.field3895 && (class214.field3407 == 30 || class214.field3407 == 10)) {
            class135.method900(255);
        }
        if (class49.field754) {
            class49.field754 = false;
            var3 = true;
        }
        if (arg0 != 4226) {
            this.method616(71);
        }
        for (int var4 = 0; var4 < 100; var4++) {
            class212.field3379[var4] = true;
        }
        if (class214.field3407 == 0) {
            class211.method1324((Color) null, class158.field2517, var3, 127, class253.field4082);
        } else if (class214.field3407 == 5) {
            class8.method93(class110.field1683, -1821474996);
        } else if (class214.field3407 == 10 || class214.field3407 == 20) {
            class2.method7(-1);
        } else if (class214.field3407 == 25 || class214.field3407 == 28) {
            if (class20.field286 == 1) {
                if (class128.field1957 > class232.field3745) {
                    class232.field3745 = class128.field1957;
                }
                int var6 = (class232.field3745 - class128.field1957) * 50 / class232.field3745;
                class142.method930(false, class170.method1074(new class119[] { class244.field3961, class174.field2797, class234.method1506(var6, (byte) -79), class249.field4025 }, arg0 ^ 0xFFFFEF3B), 250);
            } else if (class20.field286 == 2) {
                if (class201.field3197 < class96.field1474) {
                    class201.field3197 = class96.field1474;
                }
                int var5 = ((class201.field3197 - class96.field1474) * 50 / class201.field3197) + 50;
                class142.method930(false, class170.method1074(new class119[] { class244.field3961, class174.field2797, class234.method1506(var5, (byte) -79), class249.field4025 }, arg0 ^ 0xFFFFEF30), 250);
            } else {
                class142.method930(false, class244.field3961, arg0 - 3976);
            }
        } else if (class214.field3407 == 30) {
            class106.method690(0);
        } else if (class214.field3407 == 40) {
            class142.method930(false, class170.method1074(new class119[] { class214.field3411, class119.field1840, class191.field3019 }, -87), 250);
        }
        if (class214.field3407 > 0) {
            class264.method1711();
            for (int var13 = 0; var13 < class36.field499; var13++) {
                class187.field2940[var13] = false;
            }
        } else if ((class214.field3407 == 30 || class214.field3407 == 10) && class256.field4108 == 0 && !var3) {
            try {
                Graphics var10 = class39.field587.getGraphics();
                for (int var11 = 0; var11 < class36.field499; var11++) {
                    if (class187.field2940[var11]) {
                        class208.field3329.method1652(class151.field2392[var11], class164.field2586[var11], class46.field681[var11], arg0 ^ 0xFFFFEF2F, class139.field2235[var11], var10);
                        class187.field2940[var11] = false;
                    }
                }
            } catch (Exception var14) {
                class39.field587.repaint();
            }
        } else if (class214.field3407 > 0) {
            try {
                Graphics var7 = class39.field587.getGraphics();
                class208.field3329.method1651(0, (byte) 69, 0, var7);
                for (int var8 = 0; var8 < class36.field499; var8++) {
                    class187.field2940[var8] = false;
                }
            } catch (Exception var15) {
                class39.field587.repaint();
            }
        }
        if (class150.field2387) {
            class203.method1286(-30537);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1989)
    private final void method619(int arg0) {
        field1390++;
        if (class276.field4528 == 0) {
            Runtime var53 = Runtime.getRuntime();
            int var54 = (int) ((var53.totalMemory() - var53.freeMemory()) / 1024L);
            long var55 = class110.method707((byte) 97);
            if (class299.field5038 == 0L) {
                class299.field5038 = var55;
            }
            if (var54 > 16384 && var55 - class299.field5038 < 5000L) {
                if (var55 - class150.field2379 > 1000L) {
                    System.gc();
                    class150.field2379 = var55;
                }
                class158.field2517 = 5;
                class253.field4082 = class244.field3936;
            } else {
                class158.field2517 = 5;
                class253.field4082 = class161.field2551;
                class276.field4528 = 10;
            }
        } else if (class276.field4528 == 10) {
            class69.method503(4, 104, 104, 28);
            class125.method836(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class217.field3510[var2] = new class266(104, 104);
            }
            class276.field4528 = 30;
            class253.field4082 = class298.field5019;
            class158.field2517 = 10;
        } else if (class276.field4528 == 30) {
            class210.field3352 = class69.method502(arg0 + 28973, true, false, 0, true);
            class61.field974 = class69.method502(arg0 ^ 0x7177, true, false, 1, true);
            class182.field2885 = class69.method502(arg0 + 28973, false, true, 2, true);
            class283.field4678 = class69.method502(29018, true, false, 3, true);
            class168.field2652 = class69.method502(arg0 + 28973, true, false, 4, true);
            class196.field3152 = class69.method502(29018, true, true, 5, true);
            class11.field193 = class69.method502(29018, true, true, 6, false);
            class117.field1764 = class69.method502(arg0 ^ 0x7177, true, false, 7, true);
            class1.field21 = class69.method502(29018, true, false, 8, true);
            class26.field389 = class69.method502(arg0 + 28973, true, false, 9, true);
            class13.field203 = class69.method502(29018, true, false, 10, true);
            class13.field208 = class69.method502(29018, true, false, 11, true);
            class42.field629 = class69.method502(29018, true, false, 12, true);
            class81.field1246 = class69.method502(29018, true, false, 13, true);
            class68.field1056 = class69.method502(29018, true, false, 14, false);
            class46.field668 = class69.method502(29018, true, false, 15, true);
            class82.field1251 = class69.method502(29018, true, false, 16, true);
            class72.field1118 = class69.method502(29018, true, false, 17, true);
            class30.field429 = class69.method502(29018, true, false, 18, true);
            class295.field4901 = class69.method502(arg0 ^ 0x7177, true, false, 19, true);
            class9.field177 = class69.method502(29018, true, false, 20, true);
            class201.field3195 = class69.method502(29018, true, false, 21, true);
            class139.field2233 = class69.method502(29018, true, false, 22, true);
            class152.field2426 = class69.method502(29018, true, true, 23, true);
            class70.field1102 = class69.method502(arg0 ^ 0x7177, true, false, 24, true);
            class249.field4026 = class69.method502(arg0 ^ 0x7177, true, false, 25, true);
            class55.field885 = class69.method502(arg0 + 28973, true, true, 26, true);
            class158.field2517 = 15;
            class276.field4528 = 40;
            class253.field4082 = class216.field3489;
        } else if (class276.field4528 == 40) {
            byte var25 = 0;
            int var26 = var25 + class210.field3352.method181((byte) -14) * 4 / 100;
            int var27 = var26 + class61.field974.method181((byte) -112) * 4 / 100;
            int var28 = var27 + class182.field2885.method181((byte) -59) / 100;
            int var29 = var28 + class283.field4678.method181((byte) -29) * 2 / 100;
            int var30 = var29 + class168.field2652.method181((byte) -75) * 6 / 100;
            int var31 = var30 + class196.field3152.method181((byte) 109) * 4 / 100;
            int var32 = var31 + class11.field193.method181((byte) -111) * 2 / 100;
            int var33 = var32 + class117.field1764.method181((byte) 117) * 50 / 100;
            int var34 = var33 + class1.field21.method181((byte) -41) * 2 / 100;
            int var35 = var34 + class26.field389.method181((byte) -32) * 2 / 100;
            int var36 = var35 + class13.field203.method181((byte) -73) * 2 / 100;
            int var37 = var36 + class13.field208.method181((byte) 116) * 2 / 100;
            int var38 = var37 + class42.field629.method181((byte) 121) * 2 / 100;
            int var39 = var38 + class81.field1246.method181((byte) -61) * 2 / 100;
            int var40 = var39 + class68.field1056.method181((byte) 110) * 2 / 100;
            int var41 = var40 + class46.field668.method181((byte) 114) * 2 / 100;
            int var42 = var41 + class82.field1251.method181((byte) -47) / 100;
            int var43 = var42 + class72.field1118.method181((byte) 111) / 100;
            int var44 = var43 + class30.field429.method181((byte) -125) / 100;
            int var45 = var44 + class295.field4901.method181((byte) 127) / 100;
            int var46 = var45 + class9.field177.method181((byte) 120) / 100;
            int var47 = var46 + class201.field3195.method181((byte) -38) / 100;
            int var48 = var47 + class139.field2233.method181((byte) -30) / 100;
            int var49 = var48 + class152.field2426.method181((byte) -64) / 100;
            int var50 = var49 + class70.field1102.method181((byte) 116) / 100;
            int var51 = var50 + class249.field4026.method181((byte) 127) / 100;
            int var52 = var51 + class55.field885.method181((byte) 113) / 100;
            if (var52 == 100) {
                class158.field2517 = 20;
                class253.field4082 = class245.field3973;
                class93.method635(-6607, class1.field21);
                class224.method1425(class1.field21, -106);
                class196.method1261(class1.field21, 0);
                class108.method701(8, class1.field21);
                class276.field4528 = 45;
            } else {
                if (var52 != 0) {
                    class253.field4082 = class170.method1074(new class119[] { class233.field3756, class234.method1506(var52, (byte) -79), class244.field3963 }, arg0 - 137);
                }
                class158.field2517 = 20;
            }
        } else if (class276.field4528 == arg0) {
            class216.method1362(2, class244.field3943, true, 22050);
            class68.field1062 = new class191();
            class68.field1062.method1216(128, (byte) 100, 9);
            class49.field767 = class42.method320(22050, class220.field3533, 0, class39.field587, -1);
            class49.field767.method306(0, class68.field1062);
            class257.method1648((byte) -111, class68.field1062, class168.field2652, class46.field668, class68.field1056);
            class195.field3110 = class42.method320(2048, class220.field3533, 1, class39.field587, -1);
            class230.field3721 = new class223();
            class195.field3110.method306(0, class230.field3721);
            class176.field2811 = new class93(22050, class230.field3728);
            class262.field4223 = class11.field193.method285(class119.field1874, true);
            class253.field4082 = class205.field3265;
            class276.field4528 = 50;
            class158.field2517 = 30;
        } else if (class276.field4528 == 50) {
            int var3 = class86.method578(class81.field1246, class1.field21, 0);
            int var4 = class208.method1307(-4304);
            if (var4 > var3) {
                class253.field4082 = class170.method1074(new class119[] { class263.field4287, class234.method1506(var3 * 100 / var4, (byte) -79), class244.field3963 }, -98);
                class158.field2517 = 35;
            } else {
                class253.field4082 = class69.field1070;
                class276.field4528 = 60;
                class158.field2517 = 35;
            }
        } else if (class276.field4528 == 60) {
            int var23 = class222.method1403((byte) -124, class1.field21);
            int var24 = class117.method736(32);
            if (var23 >= var24) {
                class253.field4082 = class244.field3959;
                class158.field2517 = 40;
                class276.field4528 = 65;
            } else {
                class253.field4082 = class170.method1074(new class119[] { class255.field4100, class234.method1506(var23 * 100 / var24, (byte) -79), class244.field3963 }, -76);
                class158.field2517 = 40;
            }
        } else if (class276.field4528 == 65) {
            for (int var5 = 0; var5 < 6; var5++) {
                class275 var6 = class220.field3533.method1873(this.getClass(), 4);
                while (var6.field4496 == 0) {
                    class232.method1493(100L, (byte) -51);
                }
                if (var6.field4496 == 1) {
                    break;
                }
                if (var5 == 5) {
                    this.method1821(-71, "dll");
                    class214.field3407 = 1000;
                    return;
                }
                class232.method1493(1000L, (byte) -51);
            }
            boolean var7 = class264.method1727(class39.field587, class10.field183 * 2);
            if (var7) {
                class172.method1093(104, 104);
                class9.method96(true, class1.field21, class81.field1246);
                class253.field4082 = class92.field1423;
                class158.field2517 = 45;
                class204.method1289(79, 5);
                class276.field4528 = 70;
            } else {
                this.method1821(-90, "caps");
                class214.field3407 = 1000;
            }
        } else if (class276.field4528 == 70) {
            class182.field2885.method273(arg0 + 19995);
            byte var12 = 0;
            int var13 = var12 + class182.field2885.method260(100);
            class82.field1251.method273(20040);
            int var14 = var13 + class82.field1251.method260(100);
            class72.field1118.method273(20040);
            int var15 = var14 + class72.field1118.method260(100);
            class30.field429.method273(20040);
            int var16 = var15 + class30.field429.method260(100);
            class295.field4901.method273(20040);
            int var17 = var16 + class295.field4901.method260(100);
            class9.field177.method273(20040);
            int var18 = var17 + class9.field177.method260(100);
            class201.field3195.method273(20040);
            int var19 = var18 + class201.field3195.method260(100);
            class139.field2233.method273(20040);
            int var20 = var19 + class139.field2233.method260(100);
            class70.field1102.method273(20040);
            int var21 = var20 + class70.field1102.method260(100);
            class249.field4026.method273(20040);
            int var22 = var21 + class249.field4026.method260(100);
            if (var22 >= 1000) {
                class26.method191(class182.field2885, true);
                class74.method531(4, class182.field2885);
                class134.method893(class182.field2885, -21);
                class119.method764(class117.field1764, (byte) -94, class182.field2885);
                class64.method477(class117.field1764, class232.field3744, arg0 + 67, class82.field1251);
                class19.method148(class117.field1764, (byte) 66, class30.field429);
                class102.method673((byte) 69, class240.field3846, class295.field4901, class117.field1764, class232.field3744);
                class189.method1195(-18536, class182.field2885);
                class150.method970(class9.field177, class61.field974, class210.field3352, -114);
                class99.method663(class117.field1764, class201.field3195, (byte) 108);
                class5.method80(class139.field2233, (byte) 84);
                class174.method1107(class182.field2885, true);
                class37.method287((byte) -121, class117.field1764, class81.field1246, class1.field21, class283.field4678);
                class215.method1353(class182.field2885, 2048);
                class118.method742(56, class72.field1118);
                class259.method1659(new class11(), class70.field1102, class249.field4026, true);
                class32.method236((byte) -16, class70.field1102, class249.field4026);
                class158.field2517 = 50;
                class253.field4082 = class27.field401;
                class9.method94((byte) 121);
                class276.field4528 = 80;
            } else {
                class253.field4082 = class170.method1074(new class119[] { class246.field3981, class234.method1506(var22 / 10, (byte) -79), class244.field3963 }, -79);
                class158.field2517 = 50;
            }
        } else if (class276.field4528 == 80) {
            int var10 = class2.method12(class1.field21, 12);
            int var11 = class154.method981((byte) 10);
            if (var11 <= var10) {
                class128.method855(class1.field21, (byte) 73);
                class158.field2517 = 60;
                class253.field4082 = class69.field1086;
                class276.field4528 = 90;
            } else {
                class253.field4082 = class170.method1074(new class119[] { class75.field1183, class234.method1506(var10 * 100 / var11, (byte) -79), class244.field3963 }, arg0 ^ 0xFFFFFF8C);
                class158.field2517 = 60;
            }
        } else if (class276.field4528 == 90) {
            if (class55.field885.method273(arg0 ^ 0x4E65)) {
                class216 var9 = new class216(class26.field389, class55.field885, class1.field21, 200, !class78.field1199);
                class284.method1897(var9);
                if (class6.field146) {
                    class284.method1898(0.7F);
                } else {
                    if (class99.field1503 == 1) {
                        class284.method1898(0.9F);
                    }
                    if (class99.field1503 == 2) {
                        class284.method1898(0.8F);
                    }
                    if (class99.field1503 == 3) {
                        class284.method1898(0.7F);
                    }
                    if (class99.field1503 == 4) {
                        class284.method1898(0.6F);
                    }
                }
                class253.field4082 = class240.field3856;
                class158.field2517 = 70;
                class276.field4528 = 100;
            } else {
                class253.field4082 = class170.method1074(new class119[] { class177.field2817, class234.method1506(class55.field885.method260(100), (byte) -79), class244.field3963 }, -85);
                class158.field2517 = 70;
            }
        } else if (class276.field4528 == 100) {
            class276.field4528 = 110;
        } else if (class276.field4528 == 110) {
            class111.field1705 = new class100();
            class220.field3533.method1879(2, 10, class111.field1705);
            class276.field4528 = 120;
            class253.field4082 = class231.field3730;
            class158.field2517 = 75;
        } else if (class276.field4528 == 120) {
            if (class13.field203.method272(class203.field3220, class55.field881, (byte) 104)) {
                class96 var8 = new class96(class13.field203.method275(class203.field3220, false, class55.field881));
                class103.method682(var8, 15889);
                class253.field4082 = class276.field4526;
                class158.field2517 = 80;
                class276.field4528 = 130;
            } else {
                class253.field4082 = class170.method1074(new class119[] { class204.field3238, class56.field918 }, -126);
                class158.field2517 = 80;
            }
        } else if (class276.field4528 == 130) {
            if (!class283.field4678.method273(arg0 ^ 0x4E65)) {
                class253.field4082 = class170.method1074(new class119[] { class126.field1944, class234.method1506(class283.field4678.method260(100) * 4 / 5, (byte) -79), class244.field3963 }, arg0 - 169);
                class158.field2517 = 85;
            } else if (!class42.field629.method273(20040)) {
                class253.field4082 = class170.method1074(new class119[] { class126.field1944, class234.method1506(class42.field629.method260(arg0 ^ 0x49) / 6 + 80, (byte) -79), class244.field3963 }, -86);
                class158.field2517 = 85;
            } else if (class81.field1246.method273(20040)) {
                class158.field2517 = 100;
                class276.field4528 = 140;
                class253.field4082 = class171.field2715;
            } else {
                class253.field4082 = class170.method1074(new class119[] { class126.field1944, class234.method1506(class81.field1246.method260(arg0 + 55) / 20 + 96, (byte) -79), class244.field3963 }, arg0 ^ 0xFFFFFFAA);
                class158.field2517 = 85;
            }
        } else if (class276.field4528 == 140) {
            class266.field4340 = class283.field4678.method285(class161.field2555, true);
            class196.field3152.method266(true, false, arg0 - 12990);
            class11.field193.method266(true, true, -12945);
            class1.field21.method266(true, true, -12945);
            class81.field1246.method266(true, true, -12945);
            class13.field203.method266(true, true, arg0 ^ 0xFFFFCD42);
            class283.field4678.method266(true, true, arg0 ^ 0xFFFFCD42);
            class150.field2387 = true;
            class204.method1289(arg0 ^ 0xFFFFFFBD, 8);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lml;)I", line = 2466)
    public static final int method620(class134 arg0) {
        class204 var1 = (class204) class249.field4024.method1329((byte) 90, ((long) arg0.field2120 << 32) + (long) arg0.field2138);
        return var1 == null ? arg0.field2039 : var1.field3230;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2492)
    public static void method621(byte arg0) {
        field1403 = null;
        field1392 = (byte[][][]) null;
        field1397 = null;
        field1387 = null;
        field1386 = null;
        field1389 = null;
        if (arg0 > -31) {
            field1397 = (class36) null;
        }
        field1402 = (short[][]) null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2511)
    private final void method622(byte arg0) {
        field1383++;
        if (class19.field239 >= 4) {
            this.method1821(-65, "js5crc");
            class214.field3407 = 1000;
            return;
        }
        if (class215.field3426 >= 4) {
            if (class214.field3407 <= 5) {
                this.method1821(-103, "js5io");
                class214.field3407 = 1000;
                return;
            }
            class46.field674 = 3000;
            class215.field3426 = 3;
        }
        if (class46.field674-- > 0) {
            return;
        }
        try {
            if (class181.field2870 == 0) {
                class240.field3858 = class220.field3533.method1871(0, class215.field3443, class207.field3292);
                class181.field2870++;
            }
            if (class181.field2870 == 1) {
                if (class240.field3858.field4496 == 2) {
                    this.method609(-1, 102);
                    return;
                }
                if (class240.field3858.field4496 == 1) {
                    class181.field2870++;
                }
            }
            if (class181.field2870 == 2) {
                class58.field942 = new class253((Socket) class240.field3858.field4499, class220.field3533);
                class3 var2 = new class3(5);
                var2.method32(15, (byte) -99);
                var2.method26(503, 35);
                class58.field942.method1630(0, 5, (byte) -70, var2.field101);
                class181.field2870++;
                class221.field3538 = class110.method707((byte) 98);
            }
            if (class181.field2870 == 3) {
                if (class214.field3407 <= 5 || class58.field942.method1633(97) > 0) {
                    int var3 = class58.field942.method1632((byte) -124);
                    if (var3 != 0) {
                        this.method609(var3, 64);
                        return;
                    }
                    class181.field2870++;
                } else if ((class110.method707((byte) 127) - class221.field3538) > 30000L) {
                    this.method609(-2, 61);
                    return;
                }
            }
            if (class181.field2870 == 4) {
                class88.method594(class214.field3407 > 20, class58.field942, 2047);
                class181.field2870 = 0;
                class90.field1379 = 0;
                class58.field942 = null;
                class240.field3858 = null;
            }
        } catch (IOException var5) {
            this.method609(-3, 118);
        }
        if (arg0 < 95) {
            field1387 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lml;)Lml;", line = 2630)
    public static final class134 method623(class134 arg0) {
        int var1 = class22.method172((byte) -80, method620(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class20.method153(1, arg0.field2024);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}
