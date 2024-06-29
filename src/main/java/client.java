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
public class client extends class299 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lad;")
    public static class275 field2666 = new class275(64);

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[C")
    public static char[] field2679 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method1119(int arg0) {
        field2671++;
        for (class79.field1275 = 0; class76.method549((byte) 119) && class79.field1275 < 128; class79.field1275++) {
            class263.field4309[class79.field1275] = class290.field4737;
            class21.field394[class79.field1275] = class233.field3645;
        }
        class61.field883++;
        if (class68.field1089 != -1) {
            class210.method1448(0, -14364, class195.field3161, class68.field1089, 0, 0, 0, class154.field2463);
        }
        class68.field1083++;
        int var2 = -82 / ((arg0 - 4) / 63);
        if (class106.field1656 == 0) {
            class263.method1772(4);
        } else if (class199.field3195 == 0 && class112.field1719 == 0) {
            if (class231.field3613 == 2) {
                class166.method1185(127);
            } else {
                class281.method1916((byte) 111);
            }
            if (class135.field2184 >> 7 < 14 || (class135.field2184 >> 7) >= 90 || (class123.field1960 >> 7) < 14 || class123.field1960 >> 7 >= 90) {
                class310.method2100(-25);
            }
        }
        while (true) {
            class78 var3;
            class248 var4;
            class248 var5;
            do {
                var3 = (class78) class150.field2389.method1555(0);
                if (var3 == null) {
                    while (true) {
                        class78 var6;
                        class248 var7;
                        class248 var8;
                        do {
                            var6 = (class78) class34.field550.method1555(0);
                            if (var6 == null) {
                                while (true) {
                                    class78 var9;
                                    class248 var10;
                                    class248 var11;
                                    do {
                                        var9 = (class78) class184.field3050.method1555(0);
                                        if (var9 == null) {
                                            if (class218.field3430 != null) {
                                                class296.method2029(-102);
                                            }
                                            if (class87.field1368 != null && class87.field1368.field4929 == 1) {
                                                if (class87.field1368.field4930 != null) {
                                                    class168.method1196(class21.field405, class169.field2774, 78);
                                                }
                                                class87.field1368 = null;
                                                class169.field2774 = false;
                                                class21.field405 = null;
                                            }
                                            if ((class274.field4472 % 1500) == 0) {
                                                class139.method960(92);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field1251;
                                        if (var10.field4019 < 0) {
                                            break;
                                        }
                                        var11 = class281.method1913(var10.field3974, (byte) -72);
                                    } while (var11 == null || var11.field4068 == null || var11.field4068.length <= var10.field4019 || var11.field4068[var10.field4019] != var10);
                                    class139.method959((byte) 118, var9);
                                }
                            }
                            var7 = var6.field1251;
                            if (var7.field4019 < 0) {
                                break;
                            }
                            var8 = class281.method1913(var7.field3974, (byte) 48);
                        } while (var8 == null || var8.field4068 == null || var7.field4019 >= var8.field4068.length || var8.field4068[var7.field4019] != var7);
                        class139.method959((byte) 101, var6);
                    }
                }
                var4 = var3.field1251;
                if (var4.field4019 < 0) {
                    break;
                }
                var5 = class281.method1913(var4.field3974, (byte) -99);
            } while (var5 == null || var5.field4068 == null || var4.field4019 >= var5.field4068.length || var5.field4068[var4.field4019] != var4);
            class139.method959((byte) 109, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1120(byte arg0) {
        field2677++;
        method1131(-16534);
        class181.method1280();
        class80.method579(true);
        class118.method815(false);
        class262.method1762();
        class166.method1184((byte) 88);
        class198.method1368(17218);
        class299.method2049(1);
        class307.method2090((byte) 24);
        class152.method1031(true);
        class221.method1506(false);
        class43.method292(-77);
        class274.method1811(-119);
        class63.method414(0);
        class101.method719((byte) -105);
        class115.method798(true);
        class140.method967(8);
        class133.method906(true);
        class164.method1154(-1);
        class28.method227(15283);
        class64.method422((byte) 23);
        class275.method1872(0);
        class104.method741(28208);
        class306.method2080(-15846);
        class55.method344(8);
        class248.method1689(1);
        class12.method93(true);
        class292.method2017(-31370);
        class58.method372(126);
        class16.method130((byte) 125);
        class50.method324(0);
        class8.method82(31582);
        class288.method1967(false);
        class13.method108(109);
        class7.method73(true);
        class280.method1903((byte) 87);
        class91.method632(99);
        class62.method406(90);
        class116.method800(-27943);
        class127.method870((byte) -100);
        class242.method1640((byte) 104);
        class109.method765((byte) -126);
        class22.method181((byte) 28);
        class15.method128(15732);
        class137.method951(232);
        class61.method390((byte) 96);
        class82.method593(-30753);
        class217.method1487((byte) -94);
        class294.method2021(65);
        class278.method1897((byte) 32);
        class120.method823(64);
        class206.method1426(301);
        class83.method596((byte) 23);
        class302.method2066((byte) 72);
        class102.method728((byte) 124);
        class146.method994(91);
        class192.method1347(1);
        class112.method783((byte) 2);
        class195.method1362(1);
        class31.method236((byte) -115);
        class35.method257(95);
        class175.method1238((byte) -122);
        class310.method2102(-126);
        class155.method1049(-20);
        class247.method1673(true);
        class268.method1790(123);
        class172.method1221(false);
        class14.method127(0);
        class88.method617(false);
        class201.method1388();
        class193.method1352(33);
        class158.method1082(-120);
        class3.method50();
        class253.method1717(128);
        class123.method847(14679);
        class271.method1799(15189);
        class4.method57(true);
        class60.method386(0);
        class197.method1367((byte) 118);
        class73.method521();
        class270.method1796((byte) -82);
        class139.method961((byte) 100);
        class228.method1585();
        class70.method489((byte) 20);
        class87.method612(false);
        class119.method820((byte) -89);
        class212.method1462();
        class277.method1888((byte) -114);
        class125.method861(true);
        class213.method1467(true);
        class226.method1564((byte) 103);
        class154.method1044(1);
        class265.method1779((byte) 126);
        class94.method680();
        class207.method1427(-128);
        class11.method91(22464);
        class114.method790(-1);
        class269.method1793(0);
        class66.method434((byte) 118);
        class21.method171(false);
        class124.method850(66);
        class257.method1737(-19527);
        class254.method1720((byte) 106);
        if (arg0 > -66) {
            field2660 = 81;
        }
        class156.method1058(-90);
        class92.method641(-93);
        class171.method1209(true);
        class142.method978();
        class178.method1254(9);
        class18.method138(121);
        class259.method1747(101);
        class243.method1655(2680);
        class183.method1290((byte) 125);
        class215.method1475((byte) -39);
        class209.method1432();
        class93.method647(false);
        class17.method133(22878);
        class159.method1086((byte) 96);
        class220.method1501(101);
        class298.method2047(-14000);
        class65.method427(-17);
        class202.method1411((byte) 70);
        class276.method1884();
        class136.method927();
        class266.method1783(-123);
        class57.method366(0);
        class261.method1750(43);
        class241.method1635((byte) -73);
        class168.method1195(false);
        class177.method1249((byte) 114);
        class312.method2107((byte) 116);
        class309.method2099(52);
        class72.method501((byte) -128);
        class148.method1005(16777215);
        class78.method565((byte) 46);
        class25.method202(-119);
        class34.method252((byte) -9);
        class130.method885(1023);
        class90.method624(127);
        class52.method328((byte) -114);
        class138.method954((byte) -5);
        class122.method844((byte) -6);
        class240.method1633(-1);
        class9.method84((byte) 93);
        class283.method1925();
        class182.method1286(8);
        class313.method2109(true);
        class214.method1471(13246);
        class38.method272();
        class165.method1176(-77);
        class189.method1332(128);
        class44.method295(78);
        class199.method1372(40);
        class291.method2005(-47);
        class74.method534(-107);
        class273.method1805((byte) 74);
        class19.method151();
        class99.method703((byte) 88);
        class54.method338(3964);
        class45.method297((byte) -42);
        class129.method882((byte) -59);
        class150.method1017(-128);
        class98.method699(false);
        class246.method1669((byte) 125);
        class161.method1106(128);
        class236.method1624(-998728343);
        class234.method1612(-55);
        class295.method2027(5);
        class255.method1729(120);
        class71.method499(0);
        class160.method1103();
        class76.method553(127);
        class111.method782(1);
        class285.method1936(0);
        class145.method992(-1);
        class200.method1378((byte) 122);
        class79.method575((byte) 91);
        class210.method1446(-126);
        class68.method469(0);
        class187.method1321();
        class6.method65(19650);
        class41.method287(false);
        class33.method244(false);
        class263.method1776((byte) 125);
        class251.method1704(true);
        class293.method2018();
        class47.method310();
        class287.method1948((byte) 100);
        class95.method684(256);
        class135.method923(false);
        class267.method1785(65);
        class20.method162();
        class77.method563();
        class284.method1929((byte) -94);
        class191.method1342(-3);
        class231.method1599(20191);
        class107.method752(100);
        class184.method1298(0);
        class131.method892((byte) 84);
        class144.method991(true);
        class117.method806(-1);
        class229.method1588(2);
        class230.method1597(-108);
        class134.method916(0);
        class218.method1489((byte) 109);
        class149.method1012(113);
        class188.method1328(3);
        class59.method381(true);
        class304.method2073(false);
        class249.method1698(0);
        class232.method1605((byte) 68);
        class53.method334(true);
        class24.method191(17860);
        class153.method1040((byte) 12);
        class297.method2039(64);
        class203.method1417(-1581401940);
        class174.method1237(101);
        class272.method1801(18804);
        class75.method544((byte) -43);
        class290.method1997(-30275);
        class311.method2106((byte) -97);
        class300.method2061((byte) -118);
        class85.method607((byte) -26);
        class157.method1061((byte) 120);
        class169.method1201(0);
        class186.method1315(91);
        class170.method1204((byte) 112);
        class225.method1561(2001);
        class211.method1452(116);
        class89.method622(-19644);
        class244.method1660(80);
        class81.method584(726104388);
        class132.method895((byte) -27);
        class48.method313(123);
        class296.method2032((byte) -27);
        class238.method1628(886854860);
        class46.method301(-42);
        class173.method1235(10124);
        class205.method1421(-106);
        class49.method318(-78);
        class239.method1629(20);
        class108.method761((byte) -10);
        class286.method1946(-1);
        class208.method1429((byte) -79);
        class121.method831((byte) 42);
        class27.method207(2);
        class26.method206((byte) 20);
        class29.method232(-29688);
        class51.method327(false);
        class106.method750(-3944);
        class103.method737((byte) 84);
        class179.method1259(43);
        class233.method1610(63);
        class40.method277(false);
        class237.method1627(false);
        class250.method1701((byte) 124);
        class162.method1113(-62);
        if (class299.field4912) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lrg;IIIIIII)V")
    public static final void method1121(class248[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class248 var9 = arg0[var8];
            if (var9 != null && var9.field3974 == arg1 && (!var9.field3952 || var9.field4038 == 0 || var9.field4065 || method1126(var9).field427 != 0 || class263.field4304 == var9 || var9.field3957 == 1338) && (!var9.field3952 || !method1137(var9))) {
                int var10 = var9.field4037 + arg6;
                int var11 = var9.field3916 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4038 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4016 + var10;
                    int var17 = var9.field4057 + var11;
                    if (var9.field4038 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class218.field3430 == var9) {
                    class254.field4202 = true;
                    class45.field672 = var10;
                    class140.field2261 = var11;
                }
                if (!var9.field3952 || var12 < var14 && var13 < var15) {
                    if (var9.field4038 == 0) {
                        if (!var9.field3952 && method1137(var9) && class85.field1356 != var9) {
                            continue;
                        }
                        if (var9.field4039 && class287.field4640 >= var12 && class55.field797 >= var13 && class287.field4640 < var14 && class55.field797 < var15) {
                            for (class78 var18 = (class78) class184.field3050.method1553(true); var18 != null; var18 = (class78) class184.field3050.method1551(0)) {
                                if (var18.field1259) {
                                    var18.method952((byte) 91);
                                    var18.field1251.field4021 = false;
                                }
                            }
                            if (class269.field4347 == 0) {
                                class218.field3430 = null;
                                class263.field4304 = null;
                            }
                            class154.field2459 = 0;
                            class55.field813 = false;
                        }
                    }
                    if (var9.field3952) {
                        boolean var19;
                        if (class287.field4640 >= var12 && class55.field797 >= var13 && class287.field4640 < var14 && class55.field797 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class90.field1400 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class295.field4805 == 1 && class295.field4806 >= var12 && class16.field302 >= var13 && class295.field4806 < var14 && class16.field302 < var15) {
                            var21 = true;
                        }
                        if (var9.field4027 != null) {
                            for (int var22 = 0; var22 < var9.field4027.length; var22++) {
                                if (class8.field170[var9.field4027[var22]]) {
                                    if (var9.field3907 == null || class274.field4472 >= var9.field3907[var22]) {
                                        byte var23 = var9.field3938[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class8.field170[86] && !class8.field170[82] && !class8.field170[81]) && ((var23 & 0x2) == 0 || class8.field170[86]) && ((var23 & 0x1) == 0 || class8.field170[82]) && ((var23 & 0x4) == 0 || class8.field170[81])) {
                                            class134.method914(var22 + 1, var9.field3968, "", false, -1);
                                            int var24 = var9.field3956[var22];
                                            if (var9.field3907 == null) {
                                                var9.field3907 = new int[var9.field4027.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3907[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3907[var22] = class274.field4472 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3907 != null) {
                                    var9.field3907[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class304.method2070(-103, var9, class295.field4806 - var10, class16.field302 - var11);
                        }
                        if (class218.field3430 != null && class218.field3430 != var9 && var19 && method1126(var9).method185((byte) -117)) {
                            class124.field1973 = var9;
                        }
                        if (class263.field4304 == var9) {
                            class113.field1732 = true;
                            class129.field2061 = var10;
                            class15.field298 = var11;
                        }
                        if (var9.field4065 || var9.field3957 != 0) {
                            if (var19 && class17.field309 != 0 && var9.field3931 != null) {
                                class78 var25 = new class78();
                                var25.field1259 = true;
                                var25.field1251 = var9;
                                var25.field1252 = class17.field309;
                                var25.field1265 = var9.field3931;
                                class184.field3050.method1554(5257, var25);
                            }
                            if (class218.field3430 != null || class202.field3270 != null || class41.field633 || var9.field3957 != 1400 && class154.field2459 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3957 != 0) {
                                if (var9.field3957 == 1337) {
                                    class170.field2790 = var9;
                                    continue;
                                }
                                if (var9.field3957 == 1338) {
                                    if (var21) {
                                        class310.field5023 = class295.field4806 - var10;
                                        class119.field1888 = class16.field302 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3957 == 1400) {
                                    class132.field2117 = var9;
                                    if (var19) {
                                        class55.field813 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class295.field4806 - var10 - var9.field4016 / 2) * 2.0D / (double) class262.field4270);
                                        int var27 = (int) ((double) (class16.field302 - var11 - var9.field4057 / 2) * 2.0D / (double) class262.field4270);
                                        int var28 = class249.field4095 + var26;
                                        int var29 = class45.field667 + var27;
                                        int var30 = class262.field4275 + var28;
                                        int var31 = class262.field4278 + class262.field4276 - var29 - 1;
                                        class166 var32 = class28.method228(false);
                                        int[] var33 = new int[3];
                                        var32.method1179(var31, (byte) 114, var30, var33);
                                        if (var33 != null) {
                                            if (class8.field170[82] && class117.field1796 > 0) {
                                                class85.method608(var33[1], var33[2], (byte) -123, var33[0]);
                                                class285.method1935(0);
                                                continue;
                                            }
                                            class215.field3400++;
                                            class311.field5027.method2081(false, 221);
                                            class311.field5027.method1831(var33[0] << 28 | var33[1] << 14 | var33[2], 119690440);
                                        }
                                        class154.field2459 = 1;
                                        class44.field650 = false;
                                        class100.field1573 = class287.field4640;
                                        class64.field1035 = class55.field797;
                                        continue;
                                    }
                                    if (var20 && class154.field2459 > 0) {
                                        if (class154.field2459 == 1 && (class287.field4640 != class100.field1573 || class64.field1035 != class55.field797)) {
                                            class290.field4736 = class249.field4095;
                                            class155.field2478 = class45.field667;
                                            class154.field2459 = 2;
                                        }
                                        if (class154.field2459 == 2) {
                                            class44.field650 = true;
                                            class168.method1193((int) ((double) (class100.field1573 - class287.field4640) * 2.0D / (double) class262.field4269) + class290.field4736, -1);
                                            class168.method1192(true, (int) ((double) (class64.field1035 - class55.field797) * 2.0D / (double) class262.field4269) + class155.field2478);
                                        }
                                        continue;
                                    }
                                    if (class154.field2459 > 0 && !class44.field650) {
                                        if ((class298.field4867 == 1 || class206.method1424((byte) 74, class291.field4776 - 1)) && class291.field4776 > 2) {
                                            class118.method809(true);
                                        } else if (class291.field4776 > 0) {
                                            class110.method770(false);
                                        }
                                    }
                                    class154.field2459 = 0;
                                    continue;
                                }
                                if (var9.field3957 == 1401) {
                                    if (var20) {
                                        class169.method1200(class55.field797 - var11, 106, var9.field4057, var9.field4016, class287.field4640 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field3957 == 1402) {
                                    class111.method776(var9, (byte) 25);
                                    continue;
                                }
                            }
                            if (!var9.field3930 && var21) {
                                var9.field3930 = true;
                                if (var9.field3975 != null) {
                                    class78 var34 = new class78();
                                    var34.field1259 = true;
                                    var34.field1251 = var9;
                                    var34.field1263 = class295.field4806 - var10;
                                    var34.field1252 = class16.field302 - var11;
                                    var34.field1265 = var9.field3975;
                                    class184.field3050.method1554(5257, var34);
                                }
                            }
                            if (var9.field3930 && var20 && var9.field3998 != null) {
                                class78 var35 = new class78();
                                var35.field1259 = true;
                                var35.field1251 = var9;
                                var35.field1263 = class287.field4640 - var10;
                                var35.field1252 = class55.field797 - var11;
                                var35.field1265 = var9.field3998;
                                class184.field3050.method1554(5257, var35);
                            }
                            if (var9.field3930 && !var20) {
                                var9.field3930 = false;
                                if (var9.field3904 != null) {
                                    class78 var36 = new class78();
                                    var36.field1259 = true;
                                    var36.field1251 = var9;
                                    var36.field1263 = class287.field4640 - var10;
                                    var36.field1252 = class55.field797 - var11;
                                    var36.field1265 = var9.field3904;
                                    class34.field550.method1554(5257, var36);
                                }
                            }
                            if (var20 && var9.field4067 != null) {
                                class78 var37 = new class78();
                                var37.field1259 = true;
                                var37.field1251 = var9;
                                var37.field1263 = class287.field4640 - var10;
                                var37.field1252 = class55.field797 - var11;
                                var37.field1265 = var9.field4067;
                                class184.field3050.method1554(5257, var37);
                            }
                            if (!var9.field4021 && var19) {
                                var9.field4021 = true;
                                if (var9.field3980 != null) {
                                    class78 var38 = new class78();
                                    var38.field1259 = true;
                                    var38.field1251 = var9;
                                    var38.field1263 = class287.field4640 - var10;
                                    var38.field1252 = class55.field797 - var11;
                                    var38.field1265 = var9.field3980;
                                    class184.field3050.method1554(5257, var38);
                                }
                            }
                            if (var9.field4021 && var19 && var9.field3905 != null) {
                                class78 var39 = new class78();
                                var39.field1259 = true;
                                var39.field1251 = var9;
                                var39.field1263 = class287.field4640 - var10;
                                var39.field1252 = class55.field797 - var11;
                                var39.field1265 = var9.field3905;
                                class184.field3050.method1554(5257, var39);
                            }
                            if (var9.field4021 && !var19) {
                                var9.field4021 = false;
                                if (var9.field3967 != null) {
                                    class78 var40 = new class78();
                                    var40.field1259 = true;
                                    var40.field1251 = var9;
                                    var40.field1263 = class287.field4640 - var10;
                                    var40.field1252 = class55.field797 - var11;
                                    var40.field1265 = var9.field3967;
                                    class34.field550.method1554(5257, var40);
                                }
                            }
                            if (var9.field3990 != null) {
                                class78 var41 = new class78();
                                var41.field1251 = var9;
                                var41.field1265 = var9.field3990;
                                class150.field2389.method1554(5257, var41);
                            }
                            if (var9.field3958 != null && class125.field1989 > var9.field3901) {
                                if (var9.field3984 == null || class125.field1989 - var9.field3901 > 32) {
                                    class78 var46 = new class78();
                                    var46.field1251 = var9;
                                    var46.field1265 = var9.field3958;
                                    class184.field3050.method1554(5257, var46);
                                } else {
                                    label597: for (int var42 = var9.field3901; var42 < class125.field1989; var42++) {
                                        int var43 = class9.field201[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3984.length; var44++) {
                                            if (var9.field3984[var44] == var43) {
                                                class78 var45 = new class78();
                                                var45.field1251 = var9;
                                                var45.field1265 = var9.field3958;
                                                class184.field3050.method1554(5257, var45);
                                                break label597;
                                            }
                                        }
                                    }
                                }
                                var9.field3901 = class125.field1989;
                            }
                            if (var9.field4060 != null && class306.field4982 > var9.field3954) {
                                if (var9.field4013 == null || class306.field4982 - var9.field3954 > 32) {
                                    class78 var51 = new class78();
                                    var51.field1251 = var9;
                                    var51.field1265 = var9.field4060;
                                    class184.field3050.method1554(5257, var51);
                                } else {
                                    label573: for (int var47 = var9.field3954; var47 < class306.field4982; var47++) {
                                        int var48 = class149.field2376[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4013.length; var49++) {
                                            if (var9.field4013[var49] == var48) {
                                                class78 var50 = new class78();
                                                var50.field1251 = var9;
                                                var50.field1265 = var9.field4060;
                                                class184.field3050.method1554(5257, var50);
                                                break label573;
                                            }
                                        }
                                    }
                                }
                                var9.field3954 = class306.field4982;
                            }
                            if (var9.field3928 != null && class234.field3680 > var9.field4033) {
                                if (var9.field4014 == null || class234.field3680 - var9.field4033 > 32) {
                                    class78 var56 = new class78();
                                    var56.field1251 = var9;
                                    var56.field1265 = var9.field3928;
                                    class184.field3050.method1554(5257, var56);
                                } else {
                                    label549: for (int var52 = var9.field4033; var52 < class234.field3680; var52++) {
                                        int var53 = class58.field855[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4014.length; var54++) {
                                            if (var9.field4014[var54] == var53) {
                                                class78 var55 = new class78();
                                                var55.field1251 = var9;
                                                var55.field1265 = var9.field3928;
                                                class184.field3050.method1554(5257, var55);
                                                break label549;
                                            }
                                        }
                                    }
                                }
                                var9.field4033 = class234.field3680;
                            }
                            if (var9.field3909 != null && class195.field3155 > var9.field4051) {
                                if (var9.field3981 == null || class195.field3155 - var9.field4051 > 32) {
                                    class78 var61 = new class78();
                                    var61.field1251 = var9;
                                    var61.field1265 = var9.field3909;
                                    class184.field3050.method1554(5257, var61);
                                } else {
                                    label525: for (int var57 = var9.field4051; var57 < class195.field3155; var57++) {
                                        int var58 = class64.field1037[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3981.length; var59++) {
                                            if (var9.field3981[var59] == var58) {
                                                class78 var60 = new class78();
                                                var60.field1251 = var9;
                                                var60.field1265 = var9.field3909;
                                                class184.field3050.method1554(5257, var60);
                                                break label525;
                                            }
                                        }
                                    }
                                }
                                var9.field4051 = class195.field3155;
                            }
                            if (var9.field4034 != null && class211.field3370 > var9.field4044) {
                                if (var9.field4006 == null || class211.field3370 - var9.field4044 > 32) {
                                    class78 var66 = new class78();
                                    var66.field1251 = var9;
                                    var66.field1265 = var9.field4034;
                                    class184.field3050.method1554(5257, var66);
                                } else {
                                    label501: for (int var62 = var9.field4044; var62 < class211.field3370; var62++) {
                                        int var63 = class192.field3141[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field4006.length; var64++) {
                                            if (var9.field4006[var64] == var63) {
                                                class78 var65 = new class78();
                                                var65.field1251 = var9;
                                                var65.field1265 = var9.field4034;
                                                class184.field3050.method1554(5257, var65);
                                                break label501;
                                            }
                                        }
                                    }
                                }
                                var9.field4044 = class211.field3370;
                            }
                            if (class244.field3869 > var9.field3949 && var9.field3943 != null) {
                                class78 var67 = new class78();
                                var67.field1251 = var9;
                                var67.field1265 = var9.field3943;
                                class184.field3050.method1554(5257, var67);
                            }
                            if (class24.field439 > var9.field3949 && var9.field3932 != null) {
                                class78 var68 = new class78();
                                var68.field1251 = var9;
                                var68.field1265 = var9.field3932;
                                class184.field3050.method1554(5257, var68);
                            }
                            if (class188.field3095 > var9.field3949 && var9.field4010 != null) {
                                class78 var69 = new class78();
                                var69.field1251 = var9;
                                var69.field1265 = var9.field4010;
                                class184.field3050.method1554(5257, var69);
                            }
                            if (class291.field4765 > var9.field3949 && var9.field4073 != null) {
                                class78 var70 = new class78();
                                var70.field1251 = var9;
                                var70.field1265 = var9.field4073;
                                class184.field3050.method1554(5257, var70);
                            }
                            if (class109.field1686 > var9.field3949 && var9.field3926 != null) {
                                class78 var71 = new class78();
                                var71.field1251 = var9;
                                var71.field1265 = var9.field3926;
                                class184.field3050.method1554(5257, var71);
                            }
                            var9.field3949 = class68.field1083;
                            if (var9.field3948 != null) {
                                for (int var72 = 0; var72 < class79.field1275; var72++) {
                                    class78 var73 = new class78();
                                    var73.field1251 = var9;
                                    var73.field1260 = class263.field4309[var72];
                                    var73.field1253 = class21.field394[var72];
                                    var73.field1265 = var9.field3948;
                                    class184.field3050.method1554(5257, var73);
                                }
                            }
                            if (class224.field3525 && var9.field3985 != null) {
                                class78 var74 = new class78();
                                var74.field1251 = var9;
                                var74.field1265 = var9.field3985;
                                class184.field3050.method1554(5257, var74);
                            }
                        }
                    }
                    if (!var9.field3952 && class218.field3430 == null && class202.field3270 == null && !class41.field633) {
                        if ((var9.field3960 >= 0 || var9.field3897 != 0) && class287.field4640 >= var12 && class55.field797 >= var13 && class287.field4640 < var14 && class55.field797 < var15) {
                            if (var9.field3960 >= 0) {
                                class85.field1356 = arg0[var9.field3960];
                            } else {
                                class85.field1356 = var9;
                            }
                        }
                        if (var9.field4038 == 8 && class287.field4640 >= var12 && class55.field797 >= var13 && class287.field4640 < var14 && class55.field797 < var15) {
                            class173.field2903 = var9;
                        }
                        if (var9.field3994 > var9.field4057) {
                            class296.method2031(var9.field3994, var9.field4057, var9, class55.field797, -256, class287.field4640, var9.field4016 + var10, var11);
                        }
                    }
                    if (var9.field4038 == 0) {
                        method1121(arg0, var9.field3968, var12, var13, var14, var15, var10 - var9.field3944, var11 - var9.field3953);
                        if (var9.field4068 != null) {
                            method1121(var9.field4068, var9.field3968, var12, var13, var14, var15, var10 - var9.field3944, var11 - var9.field3953);
                        }
                        class109 var75 = (class109) class74.field1192.method371(76, (long) var9.field3968);
                        if (var75 != null) {
                            class210.method1448(var13, -14364, var15, var75.field1689, var10, var11, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I")
    public static final int method1122(int arg0, int arg1) {
        field2680++;
        if (arg1 > arg0) {
            return 0;
        }
        class74 var2 = (class74) class57.field829.method371(103, (long) arg0);
        if (var2 == null) {
            return class164.method1166((byte) 115, arg0).field2951;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field1187.length; var4++) {
            if (var2.field1187[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class164.method1166((byte) 109, arg0).field2951 - var2.field1187.length);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
    private final void method1123(byte arg0, int arg1) {
        class55.field819 = null;
        class102.field1624.field1607++;
        class102.field1624.field1605 = arg1;
        class223.field3515 = 0;
        field2675++;
        if (arg0 == -43) {
            class271.field4368 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2663++;
        if (!this.method2056((byte) -119)) {
            return;
        }
        class254.field4200 = Integer.parseInt(this.getParameter("worldid"));
        class41.field625 = Integer.parseInt(this.getParameter("modewhere"));
        if (class41.field625 < 0 || class41.field625 > 1) {
            class41.field625 = 0;
        }
        class215.field3395 = Integer.parseInt(this.getParameter("modewhat"));
        if (class215.field3395 < 0 || class215.field3395 > 2) {
            class215.field3395 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class288.field4650 = true;
        } else {
            class288.field4650 = false;
        }
        try {
            class84.field1339 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class84.field1339 = 0;
        }
        class102.method731(class84.field1339, -107);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class163.field2658 = true;
        } else {
            class163.field2658 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class203.field3293 = true;
        } else {
            class203.field3293 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class106.field1656 = 1;
        } else {
            class106.field1656 = 0;
        }
        try {
            class215.field3396 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class215.field3396 = 0;
        }
        class179.field2966 = this.getParameter("settings");
        if (class179.field2966 == null) {
            class179.field2966 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class52.field767 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class52.field767 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class5.field109 = true;
        } else {
            class5.field109 = false;
        }
        class106.field1658 = this;
        this.method2051(10, class215.field3395 + 32, 503, 765, 549);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrg;)Lrg;")
    public static final class248 method1124(class248 arg0) {
        int var1 = method1126(arg0).method180(-8028);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class281.method1913(arg0.field3974, (byte) 112);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method1125(byte arg0, byte[] arg1) {
        class274 var3 = new class274(arg1);
        while (true) {
            int var4 = var3.method1849(255);
            if (var4 == 0) {
                field2669++;
                int var5 = -27 % ((arg0 - 6) / 60);
                return;
            }
            if (var4 == 1) {
                var3.method1837(252);
                var3.method1837(252);
                var3.method1837(252);
                var3.method1837(252);
                var3.method1837(252);
                var3.method1837(252);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lrg;)Lbk;")
    public static final class22 method1126(class248 arg0) {
        class22 var1 = (class22) class233.field3638.method371(-104, ((long) arg0.field3968 << 32) + (long) arg0.field4019);
        return var1 == null ? arg0.field3965 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZBLgi;)Lda;")
    public static final class198 method1127(String arg0, boolean arg1, byte arg2, class164 arg3) {
        int var4 = 38 / ((-arg2 - 4) / 57);
        field2673++;
        int var5 = arg3.method1160(arg0, -1);
        if (var5 == -1) {
            return new class198(0);
        }
        int[] var6 = arg3.method1162(0, var5);
        class198 var7 = new class198(var6.length);
        int var8 = 0;
        int var9 = 0;
        while (true) {
            while (var8 < var7.field3189) {
                class274 var10 = new class274(arg3.method1156(var5, var6[var9++], (byte) -16));
                int var11 = var10.method1833((byte) -104);
                int var12 = var10.method1837(252);
                int var13 = var10.method1849(255);
                if (!arg1 && var13 == 1) {
                    var7.field3189--;
                } else {
                    var7.field3185[var8] = var11;
                    var7.field3187[var8] = new class119();
                    var7.field3187[var8].field1877 = var12;
                    var8++;
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method1128(byte arg0) {
        if (class7.field166 != null) {
            class7.field166.field3479 = false;
        }
        class7.field166 = null;
        if (class18.field322 != null) {
            class18.field322.method416(64);
            class18.field322 = null;
        }
        if (arg0 <= 1) {
            return;
        }
        field2672++;
        class113.method786((byte) -109, class122.field1926);
        class28.method224(class122.field1926, -116);
        if (class299.field4907 != null) {
            class299.field4907.method3(-17, class122.field1926);
        }
        class250.method1699((byte) 126);
        class284.method1928((byte) 44);
        class299.field4907 = null;
        if (class122.field1939 != null) {
            class122.field1939.method114((byte) 113);
        }
        if (class80.field1296 != null) {
            class80.field1296.method114((byte) -120);
        }
        class102.field1624.method721(-15975);
        class61.field890.method797((byte) -104);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1129(byte arg0) {
        field2674++;
        int var2 = -17 / ((arg0 + 16) / 62);
        boolean var3 = class102.field1624.method717(87);
        if (!var3) {
            this.method1134((byte) -112);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII[Lkb;IIZ[BII)[I")
    public static final int[] method1130(int arg0, int arg1, int arg2, int arg3, class55[] arg4, int arg5, int arg6, boolean arg7, byte[] arg8, int arg9, int arg10) {
        field2662++;
        int var11 = (arg2 & 0x7) * 8;
        if (!arg7) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    int var14 = arg1 + class102.method735(var13 & 0x7, arg3, 2, var12 & 0x7);
                    int var15 = class306.method2078(var12 & 0x7, var13 & 0x7, arg3, true) + arg6;
                    if (var14 > 0 && var14 < 103 && var15 > 0 && var15 < 103) {
                        arg4[arg9].field811[var14][var15] = class233.method1609(arg4[arg9].field811[var14][var15], -2097153);
                    }
                }
            }
        }
        int var16 = (arg5 & 0x7) * 8;
        byte var17;
        if (arg7) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        class274 var18 = new class274(arg8);
        int var19 = (arg5 & 0xFFFFFFF8) << 3;
        int var20 = arg2 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg3 == 1) {
            var22 = 1;
        } else if (arg3 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg3 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var17; var23++) {
            for (int var45 = 0; var45 < 64; var45++) {
                for (int var46 = 0; var46 < 64; var46++) {
                    if (arg10 != var23 || var16 > var45 || var16 + 8 < var45 || var46 < var11 || var46 > var11 + 8) {
                        class138.method955(0, 0, 0, 0, -1, 0, false, -1, 0, true, var18, arg7);
                    } else if ((var16 + 8) == var45 || (var11 + 8) == var46) {
                        int var53;
                        int var54;
                        if (arg3 == 0) {
                            var54 = arg6 + var46 - var11;
                            var53 = arg1 + var45 - var16;
                        } else if (arg3 == 1) {
                            var53 = var46 + arg1 - var11;
                            var54 = var16 - (var45 - arg6 - 8);
                        } else if (arg3 == 2) {
                            var54 = arg6 + 8 - (-var11 + var46);
                            var53 = var16 + arg1 + 8 - var45;
                        } else {
                            var53 = arg1 + var11 + 8 - var46;
                            var54 = -var16 - (-var45 - arg6);
                        }
                        class138.method955(0, 0, var19 + var45, arg9, var54, 0, true, var53, var20 + var46, true, var18, arg7);
                    } else {
                        int var47 = arg1 + class102.method735(var46 & 0x7, arg3, 2, var45 & 0x7);
                        int var48 = class306.method2078(var45 & 0x7, var46 & 0x7, arg3, true) + arg6;
                        class138.method955(var21, arg3, var19 + var45, arg9, var48, var22, false, var47, var20 + var46, true, var18, arg7);
                        if (var45 == 63 || var46 == 63) {
                            int var49 = var45 == 63 ? 64 : var45;
                            int var50 = var46 == 63 ? 64 : var46;
                            int var51;
                            int var52;
                            if (arg3 == 0) {
                                var51 = arg6 + var50 - var11;
                                var52 = var49 + arg1 - var16;
                            } else if (arg3 == 1) {
                                var52 = arg1 + var50 - var11;
                                var51 = var16 + arg6 + 8 - var49;
                            } else if (arg3 == 2) {
                                var52 = arg1 + var16 + 8 - var49;
                                var51 = var11 + 8 - (var50 - arg6);
                            } else {
                                var52 = -var50 - (-var11 - arg1 - 8);
                                var51 = arg6 + var49 - var16;
                            }
                            if (var52 >= 0 && var52 < 104 && var51 >= 0 && var51 < 104) {
                                class166.field2746[arg9][var52][var51] = class166.field2746[arg9][var21 + var47][var22 + var48];
                            }
                        }
                    }
                }
            }
        }
        int var24 = -18 % ((-arg0 - 68) / 51);
        boolean var25 = false;
        boolean var26 = false;
        while (var18.field4458 < var18.field4441.length) {
            int var27 = var18.method1849(255);
            if (var27 == 128) {
                class93.field1474[0] = var18.method1837(252);
                var26 = true;
                class93.field1474[1] = var18.method1847(-404);
                class93.field1474[2] = var18.method1847(-404);
                class93.field1474[3] = var18.method1847(-404);
                class93.field1474[4] = var18.method1837(252);
            } else {
                if (var27 != 129) {
                    var18.field4458--;
                    break;
                }
                for (int var28 = 0; var28 < 4; var28++) {
                    byte var29 = var18.method1830((byte) 63);
                    if (var29 == 0) {
                        if (var28 <= arg10) {
                            int var37 = arg1;
                            int var38 = arg6;
                            if (arg1 < 0) {
                                var37 = 0;
                            } else if (arg1 >= 104) {
                                var37 = 104;
                            }
                            if (arg6 < 0) {
                                var38 = 0;
                            } else if (arg6 >= 104) {
                                var38 = 104;
                            }
                            int var39 = arg6 + 7;
                            if (var39 < 0) {
                                var39 = 0;
                            } else if (var39 >= 104) {
                                var39 = 104;
                            }
                            int var40 = arg1 + 7;
                            if (var40 < 0) {
                                var40 = 0;
                            } else if (var40 >= 104) {
                                var40 = 104;
                            }
                            while (var40 > var37) {
                                while (var38 < var39) {
                                    class54.field789[arg9][var37][var38] = 0;
                                    var38++;
                                }
                                var37++;
                            }
                        }
                    } else if (var29 == 1) {
                        for (int var30 = 0; var30 < 64; var30 += 4) {
                            for (int var31 = 0; var31 < 64; var31 += 4) {
                                byte var32 = var18.method1830((byte) 88);
                                if (arg10 >= var28) {
                                    for (int var33 = var30; var33 < var30 + 4; var33++) {
                                        for (int var34 = var31; var34 < (var31 + 4); var34++) {
                                            if (var33 >= var16 && (var16 + 8) > var33 && var11 <= var34 && var11 < var11 + 8) {
                                                int var35 = arg1 + class102.method735(var34 & 0x7, arg3, 2, var33 & 0x7);
                                                int var36 = class306.method2078(var33 & 0x7, var34 & 0x7, arg3, true) + arg6;
                                                if (var35 >= 0 && var35 < 104 && var36 >= 0 && var36 < 104) {
                                                    class54.field789[arg9][var35][var36] = var32;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!var25) {
            int var41 = arg6 + 7;
            int var42 = arg1 + 7;
            for (int var43 = arg1; var43 < var42; var43++) {
                for (int var44 = arg6; var44 < var41; var44++) {
                    class54.field789[arg9][var43][var44] = 0;
                }
            }
        }
        if (var26) {
            return class93.field1474;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static void method1131(int arg0) {
        field2679 = null;
        if (arg0 != -16534) {
            method1124((class248) null);
        }
        field2666 = null;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1132(int arg0) {
        field2678++;
        if (!class156.field2485) {
            label241: while (true) {
                do {
                    if (!class76.method549((byte) 116)) {
                        break label241;
                    }
                } while (class233.field3645 != 's' && class233.field3645 != 'S');
                class156.field2485 = true;
            }
        }
        if (class68.field1091 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class264.method1778(arg0 + 6568);
            if (class112.field1720 == 0L) {
                class112.field1720 = var4;
            }
            if (var3 > 16384 && var4 - class112.field1720 < 5000L) {
                if ((var4 - class4.field96) > 1000L) {
                    System.gc();
                    class4.field96 = var4;
                }
                class13.field269 = class225.field3532;
                class137.field2215 = 5;
            } else {
                class13.field269 = class225.field3529;
                class68.field1091 = 10;
                class137.field2215 = 5;
            }
        } else if (class68.field1091 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class310.field5021[var6] = new class55(104, 104);
            }
            class13.field269 = class74.field1197;
            class137.field2215 = 10;
            class68.field1091 = 30;
        } else if (class68.field1091 == 30) {
            if (class123.field1963 == null) {
                class123.field1963 = new class140(class102.field1624, class61.field890);
            }
            if (class123.field1963.method965((byte) -109)) {
                class93.field1492 = class311.method2105(false, true, 0, (byte) -98, true);
                class205.field3299 = class311.method2105(false, true, 1, (byte) -104, true);
                class254.field4201 = class311.method2105(true, true, 2, (byte) -88, false);
                class239.field3746 = class311.method2105(false, true, 3, (byte) -94, true);
                class53.field772 = class311.method2105(false, true, 4, (byte) -106, true);
                class175.field2919 = class311.method2105(true, true, 5, (byte) -115, true);
                class203.field3290 = class311.method2105(true, false, 6, (byte) -127, true);
                class164.field2710 = class311.method2105(false, true, 7, (byte) -68, true);
                class118.field1844 = class311.method2105(false, true, 8, (byte) -104, true);
                class197.field3172 = class311.method2105(false, true, 9, (byte) -105, true);
                class61.field880 = class311.method2105(false, true, 10, (byte) -119, true);
                class221.field3482 = class311.method2105(false, true, 11, (byte) -89, true);
                class6.field151 = class311.method2105(false, true, 12, (byte) -83, true);
                class217.field3416 = class311.method2105(false, true, 13, (byte) -108, true);
                class123.field1962 = class311.method2105(false, false, 14, (byte) -73, true);
                class177.field2940 = class311.method2105(false, true, 15, (byte) -102, true);
                class268.field4337 = class311.method2105(false, true, 16, (byte) -94, true);
                class203.field3292 = class311.method2105(false, true, 17, (byte) -77, true);
                class191.field3105 = class311.method2105(false, true, 18, (byte) -108, true);
                class55.field815 = class311.method2105(false, true, 19, (byte) -105, true);
                class203.field3283 = class311.method2105(false, true, 20, (byte) -122, true);
                class248.field4052 = class311.method2105(false, true, 21, (byte) -121, true);
                class83.field1334 = class311.method2105(false, true, 22, (byte) -112, true);
                class236.field3710 = class311.method2105(true, true, 23, (byte) -72, true);
                class35.field566 = class311.method2105(false, true, 24, (byte) -93, true);
                class242.field3837 = class311.method2105(false, true, 25, (byte) -124, true);
                class154.field2464 = class311.method2105(true, true, 26, (byte) -84, true);
                class15.field297 = class311.method2105(false, true, 27, (byte) -108, true);
                class200.field3200 = class311.method2105(true, true, 28, (byte) -87, true);
                class137.field2215 = 15;
                class68.field1091 = 40;
                class13.field269 = class123.field1961;
            } else {
                class13.field269 = class277.field4526;
                class137.field2215 = 12;
            }
        } else if (class68.field1091 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class79.field1273[var8].method902(0) * class40.field617[var8] / 100;
            }
            if (var7 == 100) {
                class137.field2215 = 20;
                class13.field269 = class17.field306;
                class119.method818(class118.field1844, (byte) 115);
                class304.method2069(class118.field1844, (byte) 123);
                class119.method819(class118.field1844, 11869);
                class68.field1091 = 41;
            } else {
                class137.field2215 = 20;
                if (var7 != 0) {
                    class13.field269 = class268.field4334 + var7 + "%";
                }
            }
        } else {
            if (arg0 != 5) {
                method1131(79);
            }
            if (class68.field1091 == 41) {
                if (class200.field3200.method1173((byte) -39)) {
                    this.method1125((byte) 97, class200.field3200.method1142(1, -10363));
                    class137.field2215 = 25;
                    class68.field1091 = 45;
                    class13.field269 = class70.field1131;
                } else {
                    class13.field269 = class229.field3582 + class200.field3200.method1140(arg0 ^ 0x6C) + "%";
                    class137.field2215 = 25;
                }
            } else if (class68.field1091 == 45) {
                class217.method1484(class127.field2032, 2, 67, 22050);
                class286.field4634 = new class288();
                class286.field4634.method1970((byte) 88, 9, 128);
                class122.field1939 = class33.method248(-1, 0, 22050, class122.field1926, class44.field659);
                class122.field1939.method117(class286.field4634, 92);
                class149.method1007(class123.field1962, class53.field772, (byte) -77, class177.field2940, class286.field4634);
                class80.field1296 = class33.method248(-1, 1, 2048, class122.field1926, class44.field659);
                class89.field1397 = new class194();
                class80.field1296.method117(class89.field1397, 112);
                class197.field3171 = new class7(22050, class296.field4841);
                class306.field4973 = class203.field3290.method1160("scape main", -1);
                class68.field1091 = 50;
                class13.field269 = class188.field3094;
                class137.field2215 = 30;
            } else if (class68.field1091 == 50) {
                int var9 = class120.method829(arg0 - 5, class217.field3416, class118.field1844);
                int var10 = class12.method103(arg0 ^ 0x6491);
                if (var10 > var9) {
                    class137.field2215 = 35;
                    class13.field269 = class248.field3910 + var9 * 100 / var10 + "%";
                } else {
                    class13.field269 = class22.field419;
                    class137.field2215 = 35;
                    class68.field1091 = 60;
                }
            } else if (class68.field1091 == 60) {
                int var11 = class63.method417(class118.field1844, (byte) -41);
                int var12 = class124.method851(arg0 - 5);
                if (var11 < var12) {
                    class137.field2215 = 40;
                    class13.field269 = class177.field2945 + var11 * 100 / var12 + "%";
                } else {
                    class137.field2215 = 40;
                    class68.field1091 = 65;
                    class13.field269 = class91.field1437;
                }
            } else if (class68.field1091 == 65) {
                class97.method692(class118.field1844, (byte) -92, class217.field3416);
                class137.field2215 = 45;
                class13.field269 = class4.field105;
                class143.method983(5, arg0 ^ 0x40CB);
                class68.field1091 = 70;
            } else if (class68.field1091 == 70) {
                class254.field4201.method1173((byte) -39);
                byte var13 = 0;
                int var14 = var13 + class254.field4201.method1140(-104);
                class268.field4337.method1173((byte) -39);
                int var15 = var14 + class268.field4337.method1140(-124);
                class203.field3292.method1173((byte) -39);
                int var16 = var15 + class203.field3292.method1140(-106);
                class191.field3105.method1173((byte) -39);
                int var17 = var16 + class191.field3105.method1140(-93);
                class55.field815.method1173((byte) -39);
                int var18 = var17 + class55.field815.method1140(66);
                class203.field3283.method1173((byte) -39);
                int var19 = var18 + class203.field3283.method1140(18);
                class248.field4052.method1173((byte) -39);
                int var20 = var19 + class248.field4052.method1140(-127);
                class83.field1334.method1173((byte) -39);
                int var21 = var20 + class83.field1334.method1140(-119);
                class35.field566.method1173((byte) -39);
                int var22 = var21 + class35.field566.method1140(-89);
                class242.field3837.method1173((byte) -39);
                int var23 = var22 + class242.field3837.method1140(53);
                class15.field297.method1173((byte) -39);
                int var24 = var23 + class15.field297.method1140(-86);
                if (var24 < 1100) {
                    class13.field269 = class59.field863 + var24 / 11 + "%";
                    class137.field2215 = 50;
                } else {
                    class74.method540(2, class254.field4201);
                    class7.method75(class254.field4201, -125);
                    class243.method1652(63, class254.field4201);
                    class155.method1050(7, class254.field4201, class164.field2710);
                    class159.method1084(true, 0, class268.field4337, class164.field2710);
                    class82.method590(class191.field3105, class164.field2710, true, arg0 ^ 0xFFFFFF81);
                    class65.method429(true, class164.field2710, (byte) 75, class268.field4336, class55.field815);
                    class29.method230(class254.field4201, arg0 ^ 0x4442);
                    class153.method1042(class93.field1492, class205.field3299, class203.field3283, (byte) -71);
                    class138.method956((byte) -49, class254.field4201);
                    class123.method845(class248.field4052, class164.field2710, arg0 ^ 0x2110);
                    class257.method1736((byte) -120, class83.field1334);
                    class254.method1723(class254.field4201, -11080);
                    class251.method1706(class164.field2710, class217.field3416, class118.field1844, class239.field3746, arg0 + 19);
                    class127.method868(class254.field4201, -1);
                    class161.method1107(class203.field3292, 23651);
                    class193.method1349(new class243(), 120, class35.field566, class242.field3837);
                    class59.method382(class242.field3837, true, class35.field566);
                    class122.method843((byte) 111, class254.field4201);
                    class287.method1949(0, class254.field4201);
                    class221.method1502(-127, class254.field4201);
                    class287.method1951((byte) -97, class254.field4201, class118.field1844);
                    class17.method134(class118.field1844, false, class254.field4201);
                    class79.method570(class254.field4201, class118.field1844, (byte) 108);
                    class137.field2215 = 50;
                    class13.field269 = class177.field2942;
                    class124.method855(-128);
                    class68.field1091 = 80;
                }
            } else if (class68.field1091 == 80) {
                int var25 = class286.method1944(0, class118.field1844);
                int var26 = class50.method320(93);
                if (var26 > var25) {
                    class13.field269 = class198.field3183 + var25 * 100 / var26 + "%";
                    class137.field2215 = 60;
                } else {
                    class54.method339(arg0 ^ 0xFFFFF0FA, class118.field1844);
                    class13.field269 = class263.field4298;
                    class68.field1091 = 90;
                    class137.field2215 = 60;
                }
            } else if (class68.field1091 == 90) {
                if (class154.field2464.method1173((byte) -39)) {
                    class220 var27 = new class220(class197.field3172, class154.field2464, class118.field1844, 20, !class236.field3701);
                    class136.method932(var27);
                    if (class288.field4664 == 1) {
                        class136.method939(0.9F);
                    }
                    if (class288.field4664 == 2) {
                        class136.method939(0.8F);
                    }
                    if (class288.field4664 == 3) {
                        class136.method939(0.7F);
                    }
                    if (class288.field4664 == 4) {
                        class136.method939(0.6F);
                    }
                    class68.field1091 = 100;
                    class13.field269 = class217.field3415;
                    class137.field2215 = 70;
                } else {
                    class13.field269 = class248.field4070 + class154.field2464.method1140(-113) + "%";
                    class137.field2215 = 70;
                }
            } else if (class68.field1091 == 100) {
                if (class134.method918(class118.field1844, -19873)) {
                    class68.field1091 = 110;
                }
            } else if (class68.field1091 == 110) {
                class7.field166 = new class221();
                class44.field659.method487(-20349, 10, class7.field166);
                class68.field1091 = 120;
                class137.field2215 = 75;
                class13.field269 = class155.field2472;
            } else if (class68.field1091 == 120) {
                if (class61.field880.method1172("", "huffman", -125)) {
                    class180 var28 = new class180(class61.field880.method1169("", 99, "huffman"));
                    class263.method1774(var28, -1);
                    class68.field1091 = 130;
                    class13.field269 = class232.field3626;
                    class137.field2215 = 80;
                } else {
                    class13.field269 = class99.field1563 + "0%";
                    class137.field2215 = 80;
                }
            } else if (class68.field1091 == 130) {
                if (!class239.field3746.method1173((byte) -39)) {
                    class13.field269 = class137.field2212 + class239.field3746.method1140(93) * 3 / 4 + "%";
                    class137.field2215 = 85;
                } else if (!class6.field151.method1173((byte) -39)) {
                    class13.field269 = class137.field2212 + (class6.field151.method1140(24) / 10 + 75) + "%";
                    class137.field2215 = 85;
                } else if (!class217.field3416.method1173((byte) -39)) {
                    class13.field269 = class137.field2212 + (class217.field3416.method1140(-97) / 20 + 85) + "%";
                    class137.field2215 = 85;
                } else if (class236.field3710.method1163(-126, "details")) {
                    class262.method1759(class236.field3710);
                    class181.method1278(class15.field297);
                    class142.method977(class164.field2710);
                    class137.field2215 = 95;
                    class68.field1091 = 135;
                    class13.field269 = class133.field2137;
                } else {
                    class13.field269 = class137.field2212 + (class236.field3710.method1148(90, "details") / 10 + 90) + "%";
                    class137.field2215 = 85;
                }
            } else if (class68.field1091 == 135) {
                int var29 = class128.method877((byte) 8);
                if (var29 == -1) {
                    class13.field269 = class192.field3131;
                    class137.field2215 = 95;
                } else if (var29 == 7 || var29 == 9) {
                    this.method2052("worldlistfull", arg0 + 7713);
                    class143.method983(1000, 16590);
                } else if (class273.field4420) {
                    class68.field1091 = 140;
                    class137.field2215 = 96;
                    class13.field269 = class146.field2350;
                } else {
                    this.method2052("worldlistio_" + var29, 7718);
                    class143.method983(1000, 16590);
                }
            } else if (class68.field1091 == 140) {
                class53.field774 = class239.field3746.method1160("loginscreen", -1);
                class175.field2919.method1153(true, (byte) 83, false);
                class203.field3290.method1153(true, (byte) 120, true);
                class118.field1844.method1153(true, (byte) 104, true);
                class217.field3416.method1153(true, (byte) 86, true);
                class61.field880.method1153(true, (byte) 111, true);
                class239.field3746.method1153(true, (byte) 53, true);
                class310.field5009 = true;
                class137.field2215 = 97;
                class68.field1091 = 150;
                class13.field269 = class302.field4947;
            } else if (class68.field1091 == 150) {
                if (class156.field2485) {
                    class265.field4313 = 0;
                    class46.field689 = 0;
                    class275.field4503 = 0;
                    class147.field2352 = 0;
                }
                class156.field2485 = true;
                class302.method2065(class44.field659, (byte) 93);
                class254.method1722(-1, false, -1, (byte) -118, class147.field2352);
                class137.field2215 = 100;
                class68.field1091 = 160;
                class13.field269 = class237.field3721;
            } else if (class68.field1091 == 160) {
                class107.method751(true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1133(byte arg0) {
        field2661++;
        if (class238.field3741 == 1000) {
            return;
        }
        long var2 = class171.method1213((byte) -84) / 1000000L - class14.field292;
        class14.field292 = class171.method1213((byte) 125) / 1000000L;
        if (arg0 != 90) {
            field2679 = null;
        }
        boolean var4 = class192.method1345(false);
        if (var4 && class85.field1355 && class122.field1939 != null) {
            class122.field1939.method109(arg0 ^ 0xFFFFAFEF);
        }
        if ((class238.field3741 == 30 || class238.field3741 == 10) && (class97.field1528 || class34.field559 != 0L && class34.field559 < class264.method1778(6573))) {
            class254.method1722(class220.field3456, class97.field1528, class8.field173, (byte) -35, class28.method215(15174));
        }
        if (class200.field3207 == null) {
            Container var5;
            if (class200.field3207 != null) {
                var5 = class200.field3207;
            } else if (class53.field776 == null) {
                var5 = class44.field659.field1105;
            } else {
                var5 = class53.field776;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class53.field776 == var5) {
                Insets var8 = class53.field776.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class74.field1185 != var6 || class132.field2124 != var7) {
                if (class69.field1109.startsWith("mac")) {
                    class74.field1185 = var6;
                    class132.field2124 = var7;
                } else {
                    class122.method842((byte) 58);
                }
                class34.field559 = class264.method1778(arg0 ^ 0x19F7) + 500L;
            }
        }
        boolean var9 = false;
        if (class233.field3650) {
            class233.field3650 = false;
            var9 = true;
        }
        if (var9) {
            class286.method1945((byte) -51);
        }
        if (class238.field3741 == 0) {
            class206.method1423((Color) null, class13.field269, var9, (byte) 113, class137.field2215);
        } else if (class238.field3741 == 5) {
            class237.method1625(false, 2, class170.field2792);
        } else if (class238.field3741 == 10) {
            class286.method1941(arg0 - 17409);
        } else if (class238.field3741 == 25 || class238.field3741 == 28) {
            if (class173.field2904 == 1) {
                if (class45.field670 < class52.field770) {
                    class45.field670 = class52.field770;
                }
                int var10 = (class45.field670 - class52.field770) * 50 / class45.field670;
                class247.method1671(class115.field1755 + "<br>(" + var10 + "%)", false, -436);
            } else if (class173.field2904 == 2) {
                if (class162.field2637 < class210.field3345) {
                    class162.field2637 = class210.field3345;
                }
                int var11 = (class162.field2637 - class210.field3345) * 50 / class162.field2637 + 50;
                class247.method1671(class115.field1755 + "<br>(" + var11 + "%)", false, -436);
            } else {
                class247.method1671(class115.field1755, false, -436);
            }
        } else if (class238.field3741 == 30) {
            class22.method173(true, var2);
        } else if (class238.field3741 == 40) {
            class247.method1671(class220.field3468 + "<br>" + class302.field4943, false, -436);
        }
        if ((class238.field3741 == 30 || class238.field3741 == 10) && class306.field4975 == 0 && !var9) {
            try {
                Graphics var12 = class122.field1926.getGraphics();
                for (int var13 = 0; var13 < class128.field2054; var13++) {
                    if (class197.field3170[var13]) {
                        class296.field4829.method975(class169.field2779[var13], var12, class248.field4071[var13], class165.field2732[var13], class270.field4353[var13], -111);
                        class197.field3170[var13] = false;
                    }
                }
            } catch (Exception var17) {
                class122.field1926.repaint();
            }
        } else if (class238.field3741 != 0) {
            try {
                Graphics var14 = class122.field1926.getGraphics();
                class296.field4829.method973(0, var14, 0, false);
                for (int var15 = 0; var15 < class128.field2054; var15++) {
                    class197.field3170[var15] = false;
                }
            } catch (Exception var16) {
                class122.field1926.repaint();
            }
        }
        if (class310.field5009) {
            class236.method1622(-78);
        }
        if (class156.field2485 && class238.field3741 == 10 && class68.field1089 != -1) {
            class156.field2485 = false;
            class302.method2065(class44.field659, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method1134(byte arg0) {
        field2670++;
        if (class195.field3158 < class102.field1624.field1607) {
            class70.field1128 = (class102.field1624.field1607 - 1) * 5 * 50;
            if (class70.field1128 > 3000) {
                class70.field1128 = 3000;
            }
            if (class290.field4739 == class221.field3480) {
                class221.field3480 = class274.field4460;
            } else {
                class221.field3480 = class290.field4739;
            }
            if (class102.field1624.field1607 >= 2 && class102.field1624.field1605 == 6) {
                this.method2052("js5connect_outofdate", 7718);
                class238.field3741 = 1000;
                return;
            }
            if (class102.field1624.field1607 >= 4 && class102.field1624.field1605 == -1) {
                this.method2052("js5crc", 7718);
                class238.field3741 = 1000;
                return;
            }
            if (class102.field1624.field1607 >= 4 && (class238.field3741 == 0 || class238.field3741 == 5)) {
                if (class102.field1624.field1605 == 7 || class102.field1624.field1605 == 9) {
                    this.method2052("js5connect_full", 7718);
                } else if (class102.field1624.field1605 <= 0) {
                    this.method2052("js5io", 7718);
                } else {
                    this.method2052("js5connect", 7718);
                }
                class238.field3741 = 1000;
                return;
            }
        }
        class195.field3158 = class102.field1624.field1607;
        if (class70.field1128 > 0) {
            class70.field1128--;
            return;
        }
        try {
            if (class223.field3515 == 0) {
                class55.field819 = class44.field659.method471(22874, class4.field103, class221.field3480);
                class223.field3515++;
            }
            if (class223.field3515 == 1) {
                if (class55.field819.field4929 == 2) {
                    this.method1123((byte) -43, 1000);
                    return;
                }
                if (class55.field819.field4929 == 1) {
                    class223.field3515++;
                }
            }
            if (class223.field3515 == 2) {
                class271.field4368 = new class63((Socket) class55.field819.field4930, class44.field659);
                class274 var2 = new class274(5);
                var2.method1865(15, -111);
                var2.method1831(549, 119690440);
                class271.field4368.method410(0, var2.field4441, 5, (byte) 76);
                class223.field3515++;
                class298.field4864 = class264.method1778(6573);
            }
            if (class223.field3515 == 3) {
                if (class238.field3741 == 0 || class238.field3741 == 5 || class271.field4368.method419((byte) -112) > 0) {
                    int var3 = class271.field4368.method415(114);
                    if (var3 != 0) {
                        this.method1123((byte) -43, var3);
                        return;
                    }
                    class223.field3515++;
                } else if (class264.method1778(6573) - class298.field4864 > 30000L) {
                    this.method1123((byte) -43, 1001);
                    return;
                }
            }
            int var4 = 61 / ((arg0 - 28) / 48);
            if (class223.field3515 == 4) {
                boolean var5 = class238.field3741 == 5 || class238.field3741 == 10 || class238.field3741 == 28;
                class102.field1624.method723(0, class271.field4368, !var5);
                class271.field4368 = null;
                class223.field3515 = 0;
                class55.field819 = null;
            }
        } catch (IOException var6) {
            this.method1123((byte) -43, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1135(boolean arg0) {
        field2668++;
        class122.method842((byte) 71);
        class61.field890 = new class115();
        class102.field1624 = new class101();
        if (class215.field3395 != 0) {
            class111.field1709 = new byte[50][];
        }
        class286.method1940(class44.field659, (byte) 57);
        if (class41.field625 == 0) {
            class182.field3021 = this.getCodeBase().getHost();
            class239.field3743 = 443;
            class174.field2910 = 43594;
        } else if (class41.field625 == 1) {
            class182.field3021 = this.getCodeBase().getHost();
            class239.field3743 = class254.field4200 + 50000;
            class174.field2910 = class254.field4200 + 40000;
        } else if (class41.field625 == 2) {
            class174.field2910 = class254.field4200 + 40000;
            class182.field3021 = "127.0.0.1";
            class239.field3743 = class254.field4200 + 50000;
        }
        if (class106.field1656 == 1) {
            class182.field3024 = class186.field3074;
            class66.field1080 = class257.field4234;
            class288.field4662 = class70.field1117;
            class81.field1306 = class11.field209;
            class122.field1929 = true;
        } else {
            class288.field4662 = class188.field3086;
            class182.field3024 = class93.field1480;
            class66.field1080 = class275.field4510;
            class81.field1306 = class148.field2370;
        }
        class4.field103 = class182.field3021;
        class140.field2281 = class174.field2910;
        class274.field4460 = class239.field3743;
        class290.field4739 = class174.field2910;
        if (class69.field1112 == 3 && class41.field625 != 2) {
            class62.field916 = class254.field4200;
        }
        class74.field1193 = class16.field304 = class104.field1648 = class22.field425 = new short[256];
        class221.field3480 = class140.field2281;
        class252.method1711(-127);
        class218.method1488(true, class122.field1926);
        class163.method1115(class122.field1926, arg0);
        class299.field4907 = class178.method1257(-26);
        if (class299.field4907 != null) {
            class299.field4907.method1(1, class122.field1926);
        }
        class269.field4339 = class69.field1112;
        try {
            if (class44.field659.field1108 != null) {
                class246.field3878 = new class28(class44.field659.field1108, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class17.field308[var2] = new class28(class44.field659.field1102[var2], 6000, 0);
                }
                class115.field1756 = new class28(class44.field659.field1099, 6000, 0);
                class169.field2775 = new class64(255, class246.field3878, class115.field1756, 500000);
                class253.field4148 = new class28(class44.field659.field1104, 24, 0);
                class44.field659.field1099 = null;
                class44.field659.field1108 = null;
                class44.field659.field1104 = null;
                class44.field659.field1102 = null;
            }
        } catch (IOException var3) {
            class253.field4148 = null;
            class169.field2775 = null;
            class115.field1756 = null;
            class246.field3878 = null;
        }
        if (class106.field1656 == 0) {
            class92.field1470 = class134.field2176;
        } else if (class106.field1656 == 1) {
            class92.field1470 = class48.field703;
        }
        if (class41.field625 != 0) {
            class118.field1837 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)I")
    public static final int method1136(byte arg0, int arg1) {
        field2664++;
        if (arg0 <= 14) {
            method1137((class248) null);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lrg;)Z")
    public static final boolean method1137(class248 arg0) {
        if (class61.field881) {
            if (method1126(arg0).field427 != 0) {
                return false;
            }
            if (arg0.field4038 == 0) {
                return false;
            }
        }
        return arg0.field4023;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class134.method920((byte) -110, "argument count");
            }
            class254.field4200 = Integer.parseInt(arg0[0]);
            class41.field625 = 2;
            if (arg0[1].equals("live")) {
                class215.field3395 = 0;
            } else if (arg0[1].equals("rc")) {
                class215.field3395 = 1;
            } else if (arg0[1].equals("wip")) {
                class215.field3395 = 2;
            } else {
                class134.method920((byte) 16, "modewhat");
            }
            class288.field4650 = false;
            class84.field1339 = class146.method997(-1, arg0[2]);
            if (class84.field1339 == -1) {
                if (arg0[2].equals("english")) {
                    class84.field1339 = 0;
                } else if (arg0[2].equals("german")) {
                    class84.field1339 = 1;
                } else {
                    class134.method920((byte) 22, "language");
                }
            }
            class102.method731(class84.field1339, -102);
            class203.field3293 = false;
            class163.field2658 = false;
            if (arg0[3].equals("game0")) {
                class106.field1656 = 0;
            } else if (arg0[3].equals("game1")) {
                class106.field1656 = 1;
            } else {
                class134.method920((byte) -128, "game");
            }
            class5.field109 = false;
            class179.field2966 = "";
            class52.field767 = 0;
            class215.field3396 = 0;
            client var1 = new client();
            class106.field1658 = var1;
            var1.method2053(class215.field3395 + 32, 1024, 768, 0, 549, 29, class106.field1656 == 1 ? "mechscape" : "runescape", false);
            class53.field776.setLocation(40, 40);
        } catch (Exception var3) {
            class284.method1930(59, (String) null, var3);
        }
        field2665++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1138(int arg0) {
        field2667++;
        if (class238.field3741 == 1000) {
            return;
        }
        class274.field4472++;
        if ((class274.field4472 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class164.field2727 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class170.field2783.setSeed((long) class164.field2727);
        }
        this.method1129((byte) 96);
        if (class123.field1963 != null) {
            class123.field1963.method970(false);
        }
        class117.method803(2);
        class243.method1653(false);
        class90.method625((byte) -74);
        class53.method333(0);
        if (class299.field4907 != null) {
            int var3 = class299.field4907.method2(true);
            class17.field309 = var3;
        }
        if (class238.field3741 == arg0) {
            this.method1132(5);
            class92.method639(120);
        } else if (class238.field3741 == 5) {
            this.method1132(5);
            class92.method639(33);
        } else if (class238.field3741 == 25 || class238.field3741 == 28) {
            class76.method554((byte) -82);
        }
        if (class238.field3741 == 10) {
            this.method1119(77);
            class122.method840(arg0 - 21498);
            class152.method1029(true);
            class158.method1075((byte) 118);
        } else if (class238.field3741 == 30) {
            class102.method727((byte) 122);
        } else if (class238.field3741 == 40) {
            class158.method1075((byte) 118);
            if (class191.field3120 != -3) {
                if (class191.field3120 == 15) {
                    class71.method495(false);
                } else if (class191.field3120 != 2) {
                    class116.method801(104);
                    return;
                }
                return;
            }
        }
    }
}
