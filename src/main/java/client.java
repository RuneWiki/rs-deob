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
public class client extends class237 {

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lwf;")
    public static class16 field4679 = new class16(50);

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lha;")
    public static class46 field4702 = class271.method1828("Starte 3D)2Softwarebibliothek)3", -46);

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field4700 = false;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
    public static int[] field4701 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lpi;")
    public static class181 field4698;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lri;")
    public static class251 field4696;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[Lrk;")
    public static class179[] field4682;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lrk;")
    public static class179[] field4699;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwe;B)V")
    public static final void method1807(class75 arg0, byte arg1) {
        field4695++;
        if (arg1 != -122) {
            field4698 = null;
        }
        for (int var2 = 0; var2 < class126.field2314; var2++) {
            int var3 = arg0.method557(-22718);
            int var4 = arg0.method545((byte) -98);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class202.field3629[var3] != null) {
                class202.field3629[var3].field3731 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1808(int arg0) {
        field4694++;
        if (arg0 != 762) {
            field4682 = null;
        }
        for (class156.field2787 = 0; class114.method925(false) && class156.field2787 < 128; class156.field2787++) {
            class188.field3355[class156.field2787] = class274.field4784;
            class126.field2311[class156.field2787] = class244.field4336;
        }
        class237.field4202++;
        if (class114.field2157 != -1) {
            class168.method1192(0, (byte) -1, class114.field2157, 0, class163.field2895, 0, class50.field876, 0);
        }
        class86.field1635++;
        class249.method1691((byte) -118);
        while (true) {
            class275 var2;
            class24 var3;
            class24 var4;
            do {
                var2 = (class275) class162.field2871.method260((byte) 57);
                if (var2 == null) {
                    while (true) {
                        class275 var5;
                        class24 var6;
                        class24 var7;
                        do {
                            var5 = (class275) class113.field2133.method260((byte) 57);
                            if (var5 == null) {
                                while (true) {
                                    class275 var8;
                                    class24 var9;
                                    class24 var10;
                                    do {
                                        var8 = (class275) class271.field4727.method260((byte) 57);
                                        if (var8 == null) {
                                            if (class259.field4517 != null) {
                                                class222.method1535((byte) -6);
                                            }
                                            if (class12.field193 != null && class12.field193.field2925 == 1) {
                                                if (class12.field193.field2921 != null) {
                                                    class105.method791((byte) -99, class120.field2247, class236.field4127);
                                                }
                                                class236.field4127 = false;
                                                class120.field2247 = null;
                                                class12.field193 = null;
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4792;
                                        if (var9.field436 < 0) {
                                            break;
                                        }
                                        var10 = class13.method73(1506528624, var9.field440);
                                    } while (var10 == null || var10.field503 == null || var10.field503.length <= var9.field436 || var10.field503[var9.field436] != var9);
                                    class215.method1509(var8, -56);
                                }
                            }
                            var6 = var5.field4792;
                            if (var6.field436 < 0) {
                                break;
                            }
                            var7 = class13.method73(1506528624, var6.field440);
                        } while (var7 == null || var7.field503 == null || var7.field503.length <= var6.field436 || var7.field503[var6.field436] != var6);
                        class215.method1509(var5, 55);
                    }
                }
                var3 = var2.field4792;
                if (var3.field436 < 0) {
                    break;
                }
                var4 = class13.method73(1506528624, var3.field440);
            } while (var4 == null || var4.field503 == null || var4.field503.length <= var3.field436 || var4.field503[var3.field436] != var3);
            class215.method1509(var2, 79);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhi;)Z")
    public static final boolean method1809(class24 arg0) {
        if (class40.field701) {
            if (method1811(arg0) != 0) {
                return false;
            }
            if (arg0.field485 == 0) {
                return false;
            }
        }
        return arg0.field495;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class186.method1344("argument count", true);
            }
            class139.field2499 = Integer.parseInt(arg0[0]);
            class216.field3821 = 2;
            if (arg0[1].equals("live")) {
                class238.field4222 = 0;
            } else if (arg0[1].equals("rc")) {
                class238.field4222 = 1;
            } else if (arg0[1].equals("wip")) {
                class238.field4222 = 2;
            } else {
                class186.method1344("modewhat", true);
            }
            class26.field518 = false;
            int var1 = -1;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class108.method838((byte) -83, class177.method1265(0, var2.length, var2, 46));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class135.field2443 = var1;
            } else if (arg0[2].equals("english")) {
                class135.field2443 = 0;
            } else if (arg0[2].equals("german")) {
                class135.field2443 = 1;
            } else {
                class186.method1344("language", true);
            }
            class203.method1437(class135.field2443, false);
            class3.field59 = false;
            class10.field176 = false;
            if (arg0[3].equals("game0")) {
                class32.field601 = 0;
            } else if (arg0[3].equals("game1")) {
                class32.field601 = 1;
            } else {
                class186.method1344("game", true);
            }
            class51.field889 = 0;
            class20.field266 = false;
            class237.field4197 = class85.field1613;
            client var3 = new client();
            class42.field710 = var3;
            var3.method1635("runescape", class238.field4222 + 32, 27, 768, 64, 1024, 518);
            class227.field3983.setLocation(40, 40);
        } catch (Exception var6) {
            class272.method1835(var6, -29, (String) null);
        }
        field4693++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1810(int arg0) {
        field4686++;
        if (class205.field3677.field3107 > class71.field1280) {
            if (class227.field3973 == class129.field2363) {
                class227.field3973 = class82.field1578;
            } else {
                class227.field3973 = class129.field2363;
            }
            class73.field1305 = (class205.field3677.field3107 - 1) * 50 * 5;
            if (class73.field1305 > 3000) {
                class73.field1305 = 3000;
            }
            if (class205.field3677.field3107 >= 2 && class205.field3677.field3105 == 6) {
                this.method1622("js5connect_outofdate", false);
                class135.field2448 = 1000;
                return;
            }
            if (class205.field3677.field3107 >= 4 && class205.field3677.field3105 == -1) {
                this.method1622("js5crc", false);
                class135.field2448 = 1000;
                return;
            }
            if (class205.field3677.field3107 >= 4 && (class135.field2448 == 0 || class135.field2448 == 5)) {
                if (class205.field3677.field3105 == 7 || class205.field3677.field3105 == 9) {
                    this.method1622("js5connect_full", false);
                } else if (class205.field3677.field3105 > 0) {
                    this.method1622("js5connect", false);
                } else {
                    this.method1622("js5io", false);
                }
                class135.field2448 = 1000;
                return;
            }
        }
        class71.field1280 = class205.field3677.field3107;
        if (class73.field1305 > 0) {
            class73.field1305--;
            return;
        }
        try {
            if (class14.field209 == 0) {
                class70.field1209 = class8.field130.method48(class227.field3973, class269.field4672, 0);
                class14.field209++;
            }
            if (arg0 >= -30) {
                method1813((byte) 77, (class46) null);
            }
            if (class14.field209 == 1) {
                if (class70.field1209.field2925 == 2) {
                    this.method1821(0, 1000);
                    return;
                }
                if (class70.field1209.field2925 == 1) {
                    class14.field209++;
                }
            }
            if (class14.field209 == 2) {
                class151.field2690 = new class109((Socket) class70.field1209.field2921, class8.field130);
                class75 var2 = new class75(5);
                var2.method570(15, 15619);
                var2.method581(true, 518);
                class151.field2690.method860(0, var2.field1368, 5, 102);
                class14.field209++;
                class87.field1660 = class223.method1537(-26619);
            }
            if (class14.field209 == 3) {
                if (class135.field2448 == 0 || class135.field2448 == 5 || class151.field2690.method850((byte) 121) > 0) {
                    int var3 = class151.field2690.method859(88);
                    if (var3 != 0) {
                        this.method1821(0, var3);
                        return;
                    }
                    class14.field209++;
                } else if ((class223.method1537(-26619) - class87.field1660) > 30000L) {
                    this.method1821(0, 1001);
                    return;
                }
            }
            if (class14.field209 == 4) {
                boolean var4 = class135.field2448 == 5 || class135.field2448 == 10 || class135.field2448 == 28;
                class205.field3677.method1241(-51, !var4, class151.field2690);
                class70.field1209 = null;
                class151.field2690 = null;
                class14.field209 = 0;
            }
        } catch (IOException var5) {
            this.method1821(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1633(int arg0) {
        method1815((byte) 63);
        field4678++;
        class46.method347((byte) 100);
        class86.method672(-1);
        class74.method537(true);
        class238.method1638((byte) 27);
        class237.method1627(2);
        class157.method1156(-5390);
        class112.method911((byte) 117);
        class2.method7(-8646);
        class109.method849(-41);
        class173.method1235((byte) -23);
        class134.method1032(true);
        class96.method753(107);
        class232.method1575(-2);
        class181.method1306(24839);
        class258.method1730((byte) -109);
        class73.method529((byte) -88);
        class16.method88(-4163);
        class26.method189(false);
        class43.method292((byte) 84);
        class154.method1118(42);
        class24.method174(11834);
        class81.method638((byte) -96);
        class39.method263(-105);
        class235.method1594(false);
        class190.method1377(128);
        class97.method757(false);
        class63.method440(-8);
        class263.method1773((byte) 34);
        class106.method804(2);
        class155.method1137(true);
        class270.method1825(true);
        class76.method601(-85);
        class170.method1211(2);
        class141.method1063((byte) -59);
        class201.method1428((byte) -82);
        class78.method622(116);
        class31.method208((byte) -104);
        class69.method497((byte) -42);
        class242.method1656(1502);
        class50.method366((byte) 77);
        class183.method1332(119);
        class247.method1683((byte) 22);
        class231.method1566(-98);
        class14.method76(-257);
        class203.method1436(65535);
        class5.method19(-104);
        class177.method1267(0);
        class90.method697((byte) 115);
        class236.method1615(false);
        class1.method2((byte) 84);
        class84.method664((byte) 120);
        class148.method1098(-1);
        class67.method470();
        class71.method506((byte) -116);
        class192.method1387();
        class210.method1484(-23908);
        class87.method680(0);
        class219.method1522((byte) -81);
        class128.method989(-3);
        class251.method1701(true);
        class215.method1510(28740);
        class267.method1790((byte) 77);
        class22.method135();
        class200.method1424(true);
        class174.method1248(24962);
        class91.method706();
        class82.method650((byte) 120);
        class277.method1863(74);
        class162.method1179((byte) 111);
        class211.method1493();
        class248.method1687(-101);
        class8.method34(-7);
        class15.method79((byte) -113);
        class262.method1759();
        class54.method384(120);
        class233.method1584(true);
        class185.method1341(56);
        class171.method1222(0);
        class188.method1368((byte) -116);
        class194.method1400(-83);
        class48.method355(0);
        if (arg0 > -94) {
            return;
        }
        class156.method1150((byte) -94);
        class118.method948((byte) 44);
        class129.method999(16);
        class30.method205((byte) 103);
        class264.method1782((byte) -30);
        class77.method615(-116);
        class272.method1839(110);
        class273.method1849(false);
        class10.method55((byte) -128);
        class13.method71(0);
        class37.method248((byte) -122);
        class186.method1347((byte) -60);
        class126.method979((byte) -107);
        class130.method1012(30942);
        class93.method736((byte) -56);
        class135.method1044(255);
        class62.method423();
        class64.method446(-1);
        class114.method927((byte) -61);
        class100.method767(0);
        class140.method1060((byte) -100);
        class119.method954((byte) -108);
        class122.method961((byte) 99);
        class40.method273(7885);
        class180.method1288((byte) -61);
        class111.method909((byte) -122);
        class275.method1857(1);
        class139.method1058((byte) -86);
        class197.method1408((byte) -36);
        class249.method1695(41);
        class255.method1716(false);
        class168.method1196(6);
        class52.method380(-107);
        class265.method1785(0);
        class59.method401();
        class149.method1102((byte) 2);
        class229.method1559(-91);
        class160.method1173((byte) 0);
        class246.method1681((byte) -64);
        class150.method1103((byte) -127);
        class152.method1115(0);
        class146.method1089(-103);
        class80.method635(-1);
        class269.method1798((byte) -126);
        class241.method1655(95);
        class225.method1539(20741);
        class252.method1705(-21);
        class27.method191();
        class105.method789((byte) -83);
        class216.method1514((byte) -64);
        class169.method1201(100);
        class226.method1544(1409004646);
        class83.method658(0);
        class176.method1264((byte) -27);
        class144.method1076(true);
        class127.method984(128);
        class240.method1649((byte) -90);
        class212.method1496((byte) 120);
        class124.method967(21113);
        class70.method504(86);
        class213.method1502(-5445);
        class261.method1745(69);
        class92.method717((byte) -127);
        class23.method158(11182);
        class234.method1590((byte) 44);
        class271.method1830(112);
        class56.method389((byte) 57);
        class230.method1565(8813);
        class250.method1697(0);
        class132.method1019();
        class163.method1181((byte) -45);
        class151.method1113(82);
        class12.method69((byte) 123);
        class220.method1527(-6470);
        class115.method931(0);
        class244.method1672(38);
        class136.method1046();
        class11.method61();
        class35.method222();
        class214.method1506(29934);
        class274.method1852(110);
        class131.method1016(250);
        class204.method1443();
        class125.method978();
        class49.method361((byte) -113);
        class32.method213(-21901);
        class89.method696((byte) -41);
        class209.method1472(-116);
        class108.method845(true);
        class116.method937((byte) 96);
        class113.method921((byte) -92);
        class208.method1470((byte) -108);
        class102.method776((byte) -112);
        class57.method395(-101);
        class17.method92((byte) -50);
        class175.method1254(1);
        class79.method632(true);
        class38.method255((byte) -33);
        class53.method382(0);
        class3.method11(-72);
        class29.method201(1442470928);
        class221.method1531(-11009);
        class259.method1738(-28073);
        class95.method742(false);
        class7.method29((byte) 59);
        class227.method1551(1);
        class120.method956(174);
        class85.method669(2048);
        class4.method15(-35);
        class207.method1465(false);
        class193.method1395(false);
        class158.method1160((byte) -108);
        class107.method836((byte) 66);
        class217.method1516(-124);
        class138.method1055(true);
        class66.method459(-31303);
        class189.method1369((byte) -99);
        class166.method1187(24357);
        class42.method279((byte) 66);
        class6.method27(29222);
        class260.method1742(-26950);
        class205.method1452(false);
        class245.method1680((byte) 105);
        class239.method1645((byte) -59);
        class34.method218(126);
        class178.method1274(-15237);
        class243.method1669((byte) -44);
        class98.method764(-78);
        class137.method1051((byte) -126);
        class218.method1519(92);
        class206.method1458(123);
        class202.method1431(100000);
        class161.method1178((byte) 50);
        class268.method1795(5544);
        class58.method399((byte) 120);
        class199.method1423((byte) -21);
        class257.method1723(-14456);
        class47.method353((byte) -123);
        class184.method1333(-30194);
        class254.method1714(4);
        class187.method1358((byte) -119);
        class28.method197(1);
        class33.method216(105);
        class198.method1416(-14225);
        class20.method107(5);
        class142.method1071((byte) 122);
        class51.method377(true);
        class147.method1090(-4);
        class60.method408((byte) 64);
        class196.method1403(1);
        class61.method413((byte) 114);
        class103.method779((byte) 87);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lhi;)I")
    public static final int method1811(class24 arg0) {
        class176 var1 = (class176) class51.field893.method1601(100, ((long) arg0.field374 << 32) + (long) arg0.field436);
        return var1 == null ? arg0.field425 : var1.field3166;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static final void method1812(byte arg0) {
        class12.field188 = null;
        class113.field2146 = null;
        field4683++;
        class210.field3760 = null;
        class10.field175 = null;
        class270.field4712 = null;
        class214.field3797 = null;
        class227.field3976 = null;
        class188.field3350 = null;
        class46.field764 = 0;
        class161.field2839 = null;
        class189.field3370 = null;
        class218.field3852 = null;
        class252.field4438.method266(arg0 ^ 0x32);
        class142.field2601 = null;
        class152.field2701 = null;
        if (arg0 != 55) {
            return;
        }
        class122.field2274 = null;
        class163.field2914 = null;
        class171.field3056 = null;
        class63.field1071 = null;
        class189.field3378 = null;
        class247.field4374 = null;
        class170.field3029 = null;
        class187.field3343 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLha;)I")
    public static final int method1813(byte arg0, class46 arg1) {
        if (arg0 != 87) {
            method1815((byte) 7);
        }
        field4692++;
        return arg1.method314(91) + 1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1630(byte arg0) {
        field4684++;
        class42.method281(-128);
        class78.field1457 = new class134();
        class205.field3677 = new class173();
        class116.method933(class8.field130, (byte) 0);
        if (class216.field3821 == 0) {
            class254.field4457 = this.getCodeBase().getHost();
            class263.field4582 = 43594;
            class252.field4444 = 443;
        } else if (class216.field3821 == 1) {
            class254.field4457 = this.getCodeBase().getHost();
            class263.field4582 = class139.field2499 + 40000;
            class252.field4444 = class139.field2499 + 50000;
        } else if (class216.field3821 == 2) {
            class254.field4457 = "127.0.0.1";
            class252.field4444 = class139.field2499 + 50000;
            class263.field4582 = class139.field2499 + 40000;
        }
        if (class9.field160 == 3 && class216.field3821 != 2) {
            class97.field1808 = class139.field2499;
        }
        class95.field1775 = class263.field4582;
        class129.field2363 = class263.field4582;
        if (class32.field601 == 1) {
            class108.field2010 = class16.field233;
            class66.field1121 = class154.field2733;
            class171.field3060 = class273.field4774;
            class8.field122 = class242.field4297;
        } else {
            class66.field1121 = class93.field1759;
            class171.field3060 = class1.field1;
            class8.field122 = class109.field2064;
            class108.field2010 = class83.field1599;
        }
        class269.field4672 = class254.field4457;
        class227.field3973 = class95.field1775;
        class112.field2117 = class241.field4285 = class240.field4279 = class151.field2695 = new short[256];
        class82.field1578 = class252.field4444;
        if (arg0 > -115) {
            method1813((byte) 49, (class46) null);
        }
        class14.method75((byte) -119);
        class10.method54(class258.field4508, (byte) -19);
        class269.method1804((byte) 125, class258.field4508);
        class5.field77 = class160.method1169(32);
        if (class5.field77 != null) {
            class5.field77.method93(class258.field4508, 65480);
        }
        class65.field1097 = class9.field160;
        try {
            if (class8.field130.field157 != null) {
                class30.field580 = new class258(class8.field130.field157, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class158.field2818[var2] = new class258(class8.field130.field142[var2], 6000, 0);
                }
                class180.field3215 = new class258(class8.field130.field156, 6000, 0);
                class134.field2428 = new class73(255, class30.field580, class180.field3215, 500000);
                class66.field1115 = new class258(class8.field130.field153, 24, 0);
                class8.field130.field157 = null;
                class8.field130.field153 = null;
                class8.field130.field156 = null;
                class8.field130.field142 = null;
            }
        } catch (IOException var3) {
            class134.field2428 = null;
            class180.field3215 = null;
            class66.field1115 = null;
            class30.field580 = null;
        }
        class168.field2969 = class106.field1917;
        if (class216.field3821 != 0) {
            class4.field74 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public static final void method1814(boolean arg0, int arg1) {
        class237.field4188.method81((byte) 30, arg1);
        field4690++;
        if (arg0) {
            class28.field560.method81((byte) 30, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method1815(byte arg0) {
        field4698 = null;
        field4702 = null;
        field4679 = null;
        field4701 = null;
        field4696 = null;
        field4682 = null;
        if (arg0 == 63) {
            field4699 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lhi;IIIIIII)V")
    public static final void method1816(class24[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class24 var9 = arg0[var8];
            if (var9 != null && var9.field440 == arg1 && (!var9.field480 || var9.field485 == 0 || var9.field365 || method1811(var9) != 0 || class177.field3184 == var9 || var9.field407 == 1338) && (!var9.field480 || !method1809(var9))) {
                int var10 = var9.field421 + arg6;
                int var11 = var9.field501 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field485 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field468 + var10;
                    int var17 = var9.field341 + var11;
                    if (var9.field485 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class259.field4517 == var9) {
                    class130.field2386 = true;
                    class39.field688 = var10;
                    class95.field1780 = var11;
                }
                if (!var9.field480 || var12 < var14 && var13 < var15) {
                    if (var9.field485 == 0) {
                        if (!var9.field480 && method1809(var9) && class216.field3831 != var9) {
                            continue;
                        }
                        if (var9.field459 && class7.field116 >= var12 && class208.field3735 >= var13 && class7.field116 < var14 && class208.field3735 < var15) {
                            for (class275 var18 = (class275) class271.field4727.method264(-46); var18 != null; var18 = (class275) class271.field4727.method269((byte) 7)) {
                                if (var18.field4800) {
                                    var18.method501(0);
                                }
                            }
                            if (class242.field4286 == 0) {
                                class259.field4517 = null;
                                class177.field3184 = null;
                            }
                            class127.field2341 = false;
                            class146.field2641 = null;
                        }
                    }
                    if (var9.field480) {
                        boolean var19;
                        if (class7.field116 >= var12 && class208.field3735 >= var13 && class7.field116 < var14 && class208.field3735 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class177.field3183 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class71.field1270 == 1 && class100.field1850 >= var12 && class143.field2607 >= var13 && class100.field1850 < var14 && class143.field2607 < var15) {
                            var21 = true;
                        }
                        if (class156.field2787 > 0 && var9.field356 != null) {
                            for (int var22 = 0; var22 < var9.field356.length; var22++) {
                                for (int var23 = 0; var23 < class156.field2787; var23++) {
                                    int var24 = var9.field356[var22] & 0xFF;
                                    if (class188.field3355[var23] == var24) {
                                        if (var9.field346 != null) {
                                            byte var25 = var9.field346[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class162.field2878[86] || (var25 & 0x1) != 0 && !class162.field2878[82] || (var25 & 0x4) != 0 && !class162.field2878[81])) {
                                                continue;
                                            }
                                        }
                                        class61.method417(199959756, var22 + 1, var9.field374, -1, class85.field1613);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class170.method1217(var9, class143.field2607 - var11, class100.field1850 - var10, (byte) 107);
                        }
                        if (class259.field4517 != null && class259.field4517 != var9 && var19 && class168.method1197(method1811(var9), 111)) {
                            class244.field4326 = var9;
                        }
                        if (class177.field3184 == var9) {
                            class137.field2473 = true;
                            class32.field598 = var10;
                            class14.field211 = var11;
                        }
                        if (var9.field365 || var9.field407 != 0) {
                            if (var19 && class114.field2152 != 0 && var9.field449 != null) {
                                class275 var26 = new class275();
                                var26.field4800 = true;
                                var26.field4792 = var9;
                                var26.field4804 = class114.field2152;
                                var26.field4796 = var9.field449;
                                class271.field4727.method265(var26, -501);
                            }
                            if (class259.field4517 != null || class144.field2622 != null || class222.field3910 || var9.field407 != 1400 && class127.field2341) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field407 != 0) {
                                if (var9.field407 == 1337) {
                                    class240.field4277 = var9;
                                    class226.method1549(false, var9);
                                    continue;
                                }
                                if (var9.field407 == 1338) {
                                    if (var21) {
                                        class146.field2641 = var9;
                                        class203.field3636 = class100.field1850 - var10;
                                        class61.field1013 = class143.field2607 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field407 == 1400) {
                                    class188.field3350 = var9;
                                    if (var21) {
                                        if (class162.field2878[82] && class245.field4355 > 0) {
                                            int var27 = (int) ((double) (class100.field1850 - var10 - var9.field468 / 2) * 2.0D / (double) class45.field746);
                                            int var28 = (int) ((double) (class143.field2607 - var11 - var9.field341 / 2) * 2.0D / (double) class45.field746);
                                            int var29 = class57.field950 + var27;
                                            int var30 = class194.field3490 + var28;
                                            int var31 = class194.field3493 + var29;
                                            int var32 = class49.field836 + class232.field4039 - var30 - 1;
                                            class237.method1625(0, (byte) 111, var31, var32);
                                            class198.method1414(81);
                                            continue;
                                        }
                                        class127.field2341 = true;
                                        class47.field823 = class7.field116;
                                        class229.field3995 = class208.field3735;
                                        class254.field4453 = class57.field950;
                                        class188.field3357 = class194.field3490;
                                        continue;
                                    }
                                    if (var20 && class127.field2341) {
                                        class24.method181((byte) 57, (int) ((double) (class47.field823 - class7.field116) * 2.0D / (double) class83.field1602) + class254.field4453);
                                        class218.method1521(0, (int) ((double) (class229.field3995 - class208.field3735) * 2.0D / (double) class83.field1602) + class188.field3357);
                                        continue;
                                    }
                                    class127.field2341 = false;
                                    continue;
                                }
                                if (var9.field407 == 1401) {
                                    if (var20) {
                                        class95.method745(class7.field116 - var10, var9.field468, (byte) -127, var9.field341, class208.field3735 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field407 == 1402) {
                                    class226.method1549(false, var9);
                                    continue;
                                }
                            }
                            if (!var9.field438 && var21) {
                                var9.field438 = true;
                                if (var9.field490 != null) {
                                    class275 var33 = new class275();
                                    var33.field4800 = true;
                                    var33.field4792 = var9;
                                    var33.field4802 = class100.field1850 - var10;
                                    var33.field4804 = class143.field2607 - var11;
                                    var33.field4796 = var9.field490;
                                    class271.field4727.method265(var33, -501);
                                }
                            }
                            if (var9.field438 && var20 && var9.field364 != null) {
                                class275 var34 = new class275();
                                var34.field4800 = true;
                                var34.field4792 = var9;
                                var34.field4802 = class7.field116 - var10;
                                var34.field4804 = class208.field3735 - var11;
                                var34.field4796 = var9.field364;
                                class271.field4727.method265(var34, -501);
                            }
                            if (var9.field438 && !var20) {
                                var9.field438 = false;
                                if (var9.field477 != null) {
                                    class275 var35 = new class275();
                                    var35.field4800 = true;
                                    var35.field4792 = var9;
                                    var35.field4802 = class7.field116 - var10;
                                    var35.field4804 = class208.field3735 - var11;
                                    var35.field4796 = var9.field477;
                                    class113.field2133.method265(var35, -501);
                                }
                            }
                            if (var20 && var9.field416 != null) {
                                class275 var36 = new class275();
                                var36.field4800 = true;
                                var36.field4792 = var9;
                                var36.field4802 = class7.field116 - var10;
                                var36.field4804 = class208.field3735 - var11;
                                var36.field4796 = var9.field416;
                                class271.field4727.method265(var36, -501);
                            }
                            if (!var9.field404 && var19) {
                                var9.field404 = true;
                                if (var9.field508 != null) {
                                    class275 var37 = new class275();
                                    var37.field4800 = true;
                                    var37.field4792 = var9;
                                    var37.field4802 = class7.field116 - var10;
                                    var37.field4804 = class208.field3735 - var11;
                                    var37.field4796 = var9.field508;
                                    class271.field4727.method265(var37, -501);
                                }
                            }
                            if (var9.field404 && var19 && var9.field395 != null) {
                                class275 var38 = new class275();
                                var38.field4800 = true;
                                var38.field4792 = var9;
                                var38.field4802 = class7.field116 - var10;
                                var38.field4804 = class208.field3735 - var11;
                                var38.field4796 = var9.field395;
                                class271.field4727.method265(var38, -501);
                            }
                            if (var9.field404 && !var19) {
                                var9.field404 = false;
                                if (var9.field447 != null) {
                                    class275 var39 = new class275();
                                    var39.field4800 = true;
                                    var39.field4792 = var9;
                                    var39.field4802 = class7.field116 - var10;
                                    var39.field4804 = class208.field3735 - var11;
                                    var39.field4796 = var9.field447;
                                    class113.field2133.method265(var39, -501);
                                }
                            }
                            if (var9.field415 != null) {
                                class275 var40 = new class275();
                                var40.field4792 = var9;
                                var40.field4796 = var9.field415;
                                class162.field2871.method265(var40, -501);
                            }
                            if (var9.field394 != null && class100.field1841 > var9.field462) {
                                if (var9.field393 == null || class100.field1841 - var9.field462 > 32) {
                                    class275 var45 = new class275();
                                    var45.field4792 = var9;
                                    var45.field4796 = var9.field394;
                                    class271.field4727.method265(var45, -501);
                                } else {
                                    label546: for (int var41 = var9.field462; var41 < class100.field1841; var41++) {
                                        int var42 = class139.field2496[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field393.length; var43++) {
                                            if (var9.field393[var43] == var42) {
                                                class275 var44 = new class275();
                                                var44.field4792 = var9;
                                                var44.field4796 = var9.field394;
                                                class271.field4727.method265(var44, -501);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field462 = class100.field1841;
                            }
                            if (var9.field362 != null && class85.field1626 > var9.field422) {
                                if (var9.field384 == null || class85.field1626 - var9.field422 > 32) {
                                    class275 var50 = new class275();
                                    var50.field4792 = var9;
                                    var50.field4796 = var9.field362;
                                    class271.field4727.method265(var50, -501);
                                } else {
                                    label522: for (int var46 = var9.field422; var46 < class85.field1626; var46++) {
                                        int var47 = class189.field3381[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field384.length; var48++) {
                                            if (var9.field384[var48] == var47) {
                                                class275 var49 = new class275();
                                                var49.field4792 = var9;
                                                var49.field4796 = var9.field362;
                                                class271.field4727.method265(var49, -501);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field422 = class85.field1626;
                            }
                            if (var9.field426 != null && class87.field1647 > var9.field360) {
                                if (var9.field450 == null || class87.field1647 - var9.field360 > 32) {
                                    class275 var55 = new class275();
                                    var55.field4792 = var9;
                                    var55.field4796 = var9.field426;
                                    class271.field4727.method265(var55, -501);
                                } else {
                                    label498: for (int var51 = var9.field360; var51 < class87.field1647; var51++) {
                                        int var52 = class105.field1890[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field450.length; var53++) {
                                            if (var9.field450[var53] == var52) {
                                                class275 var54 = new class275();
                                                var54.field4792 = var9;
                                                var54.field4796 = var9.field426;
                                                class271.field4727.method265(var54, -501);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field360 = class87.field1647;
                            }
                            if (var9.field368 != null && class214.field3798 > var9.field469) {
                                if (var9.field380 == null || class214.field3798 - var9.field469 > 32) {
                                    class275 var60 = new class275();
                                    var60.field4792 = var9;
                                    var60.field4796 = var9.field368;
                                    class271.field4727.method265(var60, -501);
                                } else {
                                    label474: for (int var56 = var9.field469; var56 < class214.field3798; var56++) {
                                        int var57 = class69.field1192[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field380.length; var58++) {
                                            if (var9.field380[var58] == var57) {
                                                class275 var59 = new class275();
                                                var59.field4792 = var9;
                                                var59.field4796 = var9.field368;
                                                class271.field4727.method265(var59, -501);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field469 = class214.field3798;
                            }
                            if (var9.field429 != null && class197.field3518 > var9.field347) {
                                if (var9.field478 == null || class197.field3518 - var9.field347 > 32) {
                                    class275 var65 = new class275();
                                    var65.field4792 = var9;
                                    var65.field4796 = var9.field429;
                                    class271.field4727.method265(var65, -501);
                                } else {
                                    label450: for (int var61 = var9.field347; var61 < class197.field3518; var61++) {
                                        int var62 = class78.field1485[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field478.length; var63++) {
                                            if (var9.field478[var63] == var62) {
                                                class275 var64 = new class275();
                                                var64.field4792 = var9;
                                                var64.field4796 = var9.field429;
                                                class271.field4727.method265(var64, -501);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field347 = class197.field3518;
                            }
                            if (class126.field2316 > var9.field400 && var9.field494 != null) {
                                class275 var66 = new class275();
                                var66.field4792 = var9;
                                var66.field4796 = var9.field494;
                                class271.field4727.method265(var66, -501);
                            }
                            if (class14.field219 > var9.field400 && var9.field382 != null) {
                                class275 var67 = new class275();
                                var67.field4792 = var9;
                                var67.field4796 = var9.field382;
                                class271.field4727.method265(var67, -501);
                            }
                            if (class1.field14 > var9.field400 && var9.field432 != null) {
                                class275 var68 = new class275();
                                var68.field4792 = var9;
                                var68.field4796 = var9.field432;
                                class271.field4727.method265(var68, -501);
                            }
                            if (class63.field1070 > var9.field400 && var9.field441 != null) {
                                class275 var69 = new class275();
                                var69.field4792 = var9;
                                var69.field4796 = var9.field441;
                                class271.field4727.method265(var69, -501);
                            }
                            if (class273.field4768 > var9.field400 && var9.field482 != null) {
                                class275 var70 = new class275();
                                var70.field4792 = var9;
                                var70.field4796 = var9.field482;
                                class271.field4727.method265(var70, -501);
                            }
                            var9.field400 = class86.field1635;
                            if (var9.field367 != null) {
                                for (int var71 = 0; var71 < class156.field2787; var71++) {
                                    class275 var72 = new class275();
                                    var72.field4792 = var9;
                                    var72.field4799 = class188.field3355[var71];
                                    var72.field4809 = class126.field2311[var71];
                                    var72.field4796 = var9.field367;
                                    class271.field4727.method265(var72, -501);
                                }
                            }
                            if (class17.field252 && var9.field493 != null) {
                                class275 var73 = new class275();
                                var73.field4792 = var9;
                                var73.field4796 = var9.field493;
                                class271.field4727.method265(var73, -501);
                            }
                        }
                    }
                    if (!var9.field480 && class259.field4517 == null && class144.field2622 == null && !class222.field3910) {
                        if ((var9.field424 >= 0 || var9.field398 != 0) && class7.field116 >= var12 && class208.field3735 >= var13 && class7.field116 < var14 && class208.field3735 < var15) {
                            if (var9.field424 >= 0) {
                                class216.field3831 = arg0[var9.field424];
                            } else {
                                class216.field3831 = var9;
                            }
                        }
                        if (var9.field485 == 8 && class7.field116 >= var12 && class208.field3735 >= var13 && class7.field116 < var14 && class208.field3735 < var15) {
                            class83.field1589 = var9;
                        }
                        if (var9.field350 > var9.field341) {
                            class210.method1481((byte) 71, var9.field341, var11, class208.field3735, class7.field116, var9, var9.field350, var9.field468 + var10);
                        }
                    }
                    if (var9.field485 == 0) {
                        method1816(arg0, var9.field374, var12, var13, var14, var15, var10 - var9.field506, var11 - var9.field412);
                        if (var9.field503 != null) {
                            method1816(var9.field503, var9.field374, var12, var13, var14, var15, var10 - var9.field506, var11 - var9.field412);
                        }
                        class31 var74 = (class31) class93.field1727.method1601(98, (long) var9.field374);
                        if (var74 != null) {
                            class168.method1192(var12, (byte) -1, var74.field582, var11, var15, var10, var14, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1817(int arg0) {
        field4688++;
        if (!class149.field2672) {
            label233: while (true) {
                do {
                    if (!class114.method925(false)) {
                        break label233;
                    }
                } while (class244.field4336 != 115 && class244.field4336 != 83);
                class149.field2672 = true;
            }
        }
        if (class78.field1467 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class223.method1537(-26619);
            if (class208.field3729 == 0L) {
                class208.field3729 = var4;
            }
            if (var3 > 16384 && var4 - class208.field3729 < 5000L) {
                if (var4 - class212.field3777 > 1000L) {
                    System.gc();
                    class212.field3777 = var4;
                }
                class212.field3774 = 5;
                class226.field3971 = class225.field3941;
            } else {
                class212.field3774 = 5;
                class226.field3971 = class98.field1818;
                class78.field1467 = 10;
            }
        } else if (class78.field1467 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class183.field3282[var6] = new class154(104, 104);
            }
            class226.field3971 = class214.field3802;
            class78.field1467 = 30;
            class212.field3774 = 10;
        } else if (class78.field1467 == 30) {
            if (class268.field4633 == null) {
                class268.field4633 = new class96(class205.field3677, class78.field1457);
            }
            if (class268.field4633.method750((byte) -33)) {
                class56.field947 = class193.method1398(69, false, 0, true, true);
                class221.field3890 = class193.method1398(arg0 ^ 0xFFFFCD54, false, 1, true, true);
                class163.field2886 = class193.method1398(80, true, 2, false, true);
                class70.field1208 = class193.method1398(72, false, 3, true, true);
                class181.field3250 = class193.method1398(-32, false, 4, true, true);
                class232.field4018 = class193.method1398(119, true, 5, true, true);
                class130.field2390 = class193.method1398(102, true, 6, true, false);
                class242.field4308 = class193.method1398(arg0 + 13114, false, 7, true, true);
                class261.field4549 = class193.method1398(arg0 + 13135, false, 8, true, true);
                class209.field3744 = class193.method1398(76, false, 9, true, true);
                class107.field1982 = class193.method1398(arg0 ^ 0x32CF, false, 10, true, true);
                class112.field2125 = class193.method1398(-56, false, 11, true, true);
                class108.field2022 = class193.method1398(arg0 ^ 0xFFFFCD61, false, 12, true, true);
                class92.field1721 = class193.method1398(80, false, 13, true, true);
                class148.field2661 = class193.method1398(-80, false, 14, true, false);
                class81.field1534 = class193.method1398(arg0 + 12966, false, 15, true, true);
                class272.field4750 = class193.method1398(-121, false, 16, true, true);
                class243.field4310 = class193.method1398(arg0 ^ 0xFFFFCD73, false, 17, true, true);
                class77.field1431 = class193.method1398(85, false, 18, true, true);
                class230.field4002 = class193.method1398(-86, false, 19, true, true);
                class186.field3318 = class193.method1398(105, false, 20, true, true);
                class122.field2266 = class193.method1398(67, false, 21, true, true);
                class271.field4731 = class193.method1398(117, false, 22, true, true);
                class26.field516 = class193.method1398(-120, true, 23, true, true);
                class24.field390 = class193.method1398(-68, false, 24, true, true);
                class201.field3581 = class193.method1398(69, false, 25, true, true);
                class155.field2743 = class193.method1398(arg0 ^ 0x32D6, true, 26, true, true);
                class78.field1467 = 40;
                class212.field3774 = 15;
                class226.field3971 = class34.field623;
            } else {
                class212.field3774 = 12;
                class226.field3971 = class203.field3635;
            }
        } else if (class78.field1467 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class119.field2236[var8].method1582((byte) 2) * class174.field3139[var8] / 100;
            }
            if (var7 == 100) {
                class226.field3971 = class212.field3773;
                class212.field3774 = 20;
                class214.method1503(class261.field4549, -1);
                class269.method1802(3, class261.field4549);
                class167.method1189(class261.field4549, false);
                class78.field1467 = 45;
            } else {
                if (var7 != 0) {
                    class226.field3971 = class109.method855(arg0 ^ 0xFFFFCD05, new class46[] { class119.field2237, class115.method932(false, var7), class163.field2888 });
                }
                class212.field3774 = 20;
            }
        } else if (class78.field1467 == 45) {
            class38.method258(2, class42.field715, 22050, -92);
            class157.field2801 = new class106();
            class157.field2801.method826(9, 128, -6611);
            class242.field4293 = class230.method1564(22050, class258.field4508, 0, false, class8.field130);
            class242.field4293.method1142(117, class157.field2801);
            class150.method1108(4, class181.field3250, class148.field2661, class81.field1534, class157.field2801);
            class152.field2702 = class230.method1564(2048, class258.field4508, 1, false, class8.field130);
            class236.field4116 = new class253();
            class152.field2702.method1142(arg0 + 13174, class236.field4116);
            class89.field1696 = new class270(22050, class265.field4606);
            class208.field3737 = class130.field2390.method1320((byte) 63, class85.field1628);
            class212.field3774 = 30;
            class226.field3971 = class92.field1718;
            class78.field1467 = 50;
        } else {
            if (arg0 != -13051) {
                method1807((class75) null, (byte) 3);
            }
            if (class78.field1467 == 50) {
                int var9 = class271.method1829(class92.field1721, class261.field4549, -126);
                int var10 = class111.method903((byte) 83);
                if (var9 < var10) {
                    class226.field3971 = class109.method855(0, new class46[] { class274.field4790, class115.method932(false, var9 * 100 / var10), class163.field2888 });
                    class212.field3774 = 35;
                } else {
                    class78.field1467 = 60;
                    class212.field3774 = 35;
                    class226.field3971 = class264.field4590;
                }
            } else if (class78.field1467 == 60) {
                int var11 = class182.method1328(class261.field4549, arg0 ^ 0xFFFFCDFA);
                int var12 = class57.method393(2);
                if (var11 < var12) {
                    class226.field3971 = class109.method855(0, new class46[] { class194.field3482, class115.method932(false, var11 * 100 / var12), class163.field2888 });
                    class212.field3774 = 40;
                } else {
                    class226.field3971 = class38.field666;
                    class212.field3774 = 40;
                    class78.field1467 = 65;
                }
            } else if (class78.field1467 == 65) {
                class210.method1483(arg0 + 16724986, class92.field1721, class261.field4549);
                class226.field3971 = class13.field207;
                class212.field3774 = 45;
                class83.method661(5, 0);
                class78.field1467 = 70;
            } else if (class78.field1467 == 70) {
                class163.field2886.method1317((byte) -32);
                byte var13 = 0;
                int var14 = var13 + class163.field2886.method1326(false);
                class272.field4750.method1317((byte) -100);
                int var15 = var14 + class272.field4750.method1326(false);
                class243.field4310.method1317((byte) -24);
                int var16 = var15 + class243.field4310.method1326(false);
                class77.field1431.method1317((byte) -102);
                int var17 = var16 + class77.field1431.method1326(false);
                class230.field4002.method1317((byte) -26);
                int var18 = var17 + class230.field4002.method1326(false);
                class186.field3318.method1317((byte) -64);
                int var19 = var18 + class186.field3318.method1326(false);
                class122.field2266.method1317((byte) -52);
                int var20 = var19 + class122.field2266.method1326(false);
                class271.field4731.method1317((byte) -56);
                int var21 = var20 + class271.field4731.method1326(false);
                class24.field390.method1317((byte) -104);
                int var22 = var21 + class24.field390.method1326(false);
                class201.field3581.method1317((byte) -42);
                int var23 = var22 + class201.field3581.method1326(false);
                if (var23 < 1000) {
                    class226.field3971 = class109.method855(arg0 ^ 0xFFFFCD05, new class46[] { class50.field873, class115.method932(false, var23 / 10), class163.field2888 });
                    class212.field3774 = 50;
                } else {
                    class200.method1427(false, class163.field2886);
                    class89.method690(4, class163.field2886);
                    class118.method945(class163.field2886, 16205);
                    class2.method6(3, class242.field4308, class163.field2886);
                    class236.method1608((byte) -37, class272.field4750, true, class242.field4308);
                    class61.method418(class242.field4308, class77.field1431, -3);
                    class220.method1525(class230.field4002, true, class126.field2318, class242.field4308, true);
                    class102.method778(class163.field2886, true);
                    class127.method981(-2265, class221.field3890, class186.field3318, class56.field947);
                    class58.method398(class122.field2266, class242.field4308, -9502);
                    class31.method209(false, class271.field4731);
                    class222.method1536(-96, class163.field2886);
                    class89.method694(class92.field1721, class242.field4308, class261.field4549, (byte) -13, class70.field1208);
                    class251.method1699(79, class163.field2886);
                    class16.method87((byte) 107, class243.field4310);
                    class73.method531(new class126(), class24.field390, -93, class201.field3581);
                    class217.method1518(class24.field390, class201.field3581, arg0 + 15370);
                    class212.field3774 = 50;
                    class226.field3971 = class52.field912;
                    class30.method204(true);
                    class78.field1467 = 80;
                }
            } else if (class78.field1467 == 80) {
                int var24 = class64.method449(-32, class261.field4549);
                int var25 = class129.method1001((byte) -127);
                if (var24 < var25) {
                    class226.field3971 = class109.method855(arg0 + 13051, new class46[] { class275.field4807, class115.method932(false, var24 * 100 / var25), class163.field2888 });
                    class212.field3774 = 60;
                } else {
                    class197.method1406(class261.field4549, -900);
                    class212.field3774 = 60;
                    class226.field3971 = class80.field1519;
                    class78.field1467 = 90;
                }
            } else if (class78.field1467 == 90) {
                if (class155.field2743.method1317((byte) -106)) {
                    class93 var26 = new class93(class209.field3744, class155.field2743, class261.field4549, 20, !class46.field809);
                    class62.method436(var26);
                    if (class65.field1111 == 1) {
                        class62.method437(0.9F);
                    }
                    if (class65.field1111 == 2) {
                        class62.method437(0.8F);
                    }
                    if (class65.field1111 == 3) {
                        class62.method437(0.7F);
                    }
                    if (class65.field1111 == 4) {
                        class62.method437(0.6F);
                    }
                    class78.field1467 = 100;
                    class212.field3774 = 70;
                    class226.field3971 = class53.field920;
                } else {
                    class226.field3971 = class109.method855(0, new class46[] { class42.field706, class115.method932(false, class155.field2743.method1326(false)), class163.field2888 });
                    class212.field3774 = 70;
                }
            } else if (class78.field1467 == 100) {
                if (class109.method858(arg0 ^ 0x59B3, class261.field4549)) {
                    class78.field1467 = 110;
                }
            } else if (class78.field1467 == 110) {
                class252.field4439 = new class2();
                class8.field130.method36(class252.field4439, -115, 10);
                class78.field1467 = 120;
                class212.field3774 = 75;
                class226.field3971 = class180.field3209;
            } else if (class78.field1467 == 120) {
                if (class107.field1982.method1324(class85.field1613, class247.field4369, 0)) {
                    class64 var27 = new class64(class107.field1982.method1313(-19091, class247.field4369, class85.field1613));
                    class272.method1836((byte) 18, var27);
                    class226.field3971 = class162.field2861;
                    class78.field1467 = 130;
                    class212.field3774 = 80;
                } else {
                    class226.field3971 = class109.method855(arg0 ^ 0xFFFFCD05, new class46[] { class47.field821, class202.field3612 });
                    class212.field3774 = 80;
                }
            } else if (class78.field1467 == 130) {
                if (!class70.field1208.method1317((byte) -121)) {
                    class226.field3971 = class109.method855(arg0 ^ 0xFFFFCD05, new class46[] { class7.field119, class115.method932(false, class70.field1208.method1326(false) * 3 / 4), class163.field2888 });
                    class212.field3774 = 85;
                } else if (!class108.field2022.method1317((byte) -121)) {
                    class226.field3971 = class109.method855(0, new class46[] { class7.field119, class115.method932(false, class108.field2022.method1326(false) / 10 + 75), class163.field2888 });
                    class212.field3774 = 85;
                } else if (!class92.field1721.method1317((byte) -65)) {
                    class226.field3971 = class109.method855(arg0 + 13051, new class46[] { class7.field119, class115.method932(false, class92.field1721.method1326(false) / 20 + 85), class163.field2888 });
                    class212.field3774 = 85;
                } else if (class26.field516.method1316(class56.field948, arg0 ^ 0xFFFFCD67)) {
                    class236.method1611(class8.field127, class37.field657, class257.field4484, class26.field516, class24.field497, true, class273.field4766);
                    class212.field3774 = 95;
                    class78.field1467 = 135;
                    class226.field3971 = class107.field1985;
                } else {
                    class226.field3971 = class109.method855(0, new class46[] { class7.field119, class115.method932(false, class26.field516.method1325(class56.field948, (byte) 26) / 10 + 90), class163.field2888 });
                    class212.field3774 = 85;
                }
            } else if (class78.field1467 == 135) {
                int var28 = class76.method608(false);
                if (var28 == -1) {
                    class226.field3971 = class233.field4057;
                    class212.field3774 = 95;
                } else if (var28 == 7 || var28 == 9) {
                    this.method1622("worldlistfull", false);
                    class83.method661(1000, 0);
                } else if (class71.field1217) {
                    class226.field3971 = class160.field2827;
                    class78.field1467 = 140;
                    class212.field3774 = 96;
                } else {
                    this.method1622("worldlistio", false);
                    class83.method661(1000, 0);
                }
            } else if (class78.field1467 == 140) {
                class83.field1598 = class70.field1208.method1320((byte) 63, class217.field3841);
                class232.field4018.method1312(true, false, (byte) -104);
                class130.field2390.method1312(true, true, (byte) -104);
                class261.field4549.method1312(true, true, (byte) -104);
                class92.field1721.method1312(true, true, (byte) -104);
                class107.field1982.method1312(true, true, (byte) -104);
                class70.field1208.method1312(true, true, (byte) -104);
                class212.field3774 = 97;
                class78.field1467 = 150;
                class226.field3971 = class30.field578;
                class137.field2467 = true;
            } else if (class78.field1467 == 150) {
                if (class149.field2672) {
                    class138.field2484 = 0;
                }
                class149.field2672 = true;
                class33.method215(class8.field130, (byte) 9);
                class255.method1715(-1, class138.field2484, 93, false, -1);
                class212.field3774 = 100;
                class226.field3971 = class183.field3286;
                class78.field1467 = 160;
            } else if (class78.field1467 == 160) {
                class232.method1569(true, -2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4687++;
        if (!this.method1634(false)) {
            return;
        }
        class139.field2499 = Integer.parseInt(this.getParameter("worldid"));
        class216.field3821 = Integer.parseInt(this.getParameter("modewhere"));
        if (class216.field3821 < 0 || class216.field3821 > 1) {
            class216.field3821 = 0;
        }
        class238.field4222 = Integer.parseInt(this.getParameter("modewhat"));
        if (class238.field4222 < 0 || class238.field4222 > 2) {
            class238.field4222 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class26.field518 = true;
        } else {
            class26.field518 = false;
        }
        try {
            class135.field2443 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class135.field2443 = 0;
        }
        class203.method1437(class135.field2443, false);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class10.field176 = true;
        } else {
            class10.field176 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class3.field59 = true;
        } else {
            class3.field59 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class32.field601 = 1;
        } else {
            class32.field601 = 0;
        }
        try {
            class51.field889 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class51.field889 = 0;
        }
        class237.field4197 = class264.field4595.method317(this, -2);
        if (class237.field4197 == null) {
            class237.field4197 = class85.field1613;
        }
        String var5 = this.getParameter("haveie6");
        if (var5 != null && var5.equals("1")) {
            class20.field266 = true;
        } else {
            class20.field266 = false;
        }
        class42.field710 = this;
        this.method1629(765, class238.field4222 + 32, 518, 1, 503);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1626(byte arg0) {
        field4677++;
        if (arg0 <= 49) {
            field4682 = null;
        }
        if (class135.field2448 == 1000) {
            return;
        }
        class157.field2803++;
        if ((class157.field2803 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class122.field2273 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class174.field3138.setSeed((long) class122.field2273);
        }
        this.method1820(true);
        if (class268.field4633 != null) {
            class268.field4633.method756((byte) -72);
        }
        class142.method1072(-1);
        class267.method1789(98);
        class269.method1805(-1);
        class129.method1005(2048);
        if (class5.field77 != null) {
            int var3 = class5.field77.method95(-100);
            class114.field2152 = var3;
        }
        if (class135.field2448 == 0) {
            this.method1817(-13051);
            class82.method654((byte) -113);
        } else if (class135.field2448 == 5) {
            this.method1817(-13051);
            class82.method654((byte) -126);
        } else if (class135.field2448 == 25 || class135.field2448 == 28) {
            class169.method1203((byte) 70);
        }
        if (class135.field2448 == 10) {
            this.method1808(762);
            class74.method538(110);
            class50.method372(80);
            class151.method1110(-12782);
        } else if (class135.field2448 == 30) {
            class178.method1276(31);
        } else if (class135.field2448 == 40) {
            class151.method1110(-12782);
            if (class40.field698 != -3) {
                if (class40.field698 == 15) {
                    class24.method179(-5);
                } else if (class40.field698 != 2) {
                    class109.method856(-22374);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1632(int arg0) {
        field4685++;
        if (arg0 != 37) {
            field4702 = null;
        }
        if (class252.field4439 != null) {
            class252.field4439.field25 = false;
        }
        class252.field4439 = null;
        if (class71.field1214 != null) {
            class71.field1214.method852(5790);
            class71.field1214 = null;
        }
        class169.method1200(class258.field4508, (byte) -117);
        class120.method957(class258.field4508, 11225);
        if (class5.field77 != null) {
            class5.field77.method94(class258.field4508, 28786);
        }
        class274.method1853((byte) 36);
        class45.method302((byte) 122);
        class5.field77 = null;
        if (class242.field4293 != null) {
            class242.field4293.method1139(arg0 ^ 0x17);
        }
        if (class152.field2702 != null) {
            class152.field2702.method1139(50);
        }
        class205.field3677.method1236(4);
        class78.field1457.method1034(96);
        try {
            if (class30.field580 != null) {
                class30.field580.method1733(0);
            }
            if (class158.field2818 != null) {
                for (int var2 = 0; var2 < class158.field2818.length; var2++) {
                    if (class158.field2818[var2] != null) {
                        class158.field2818[var2].method1733(0);
                    }
                }
            }
            if (class180.field3215 != null) {
                class180.field3215.method1733(0);
            }
            if (class66.field1115 != null) {
                class66.field1115.method1733(0);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lhi;)Lhi;")
    public static final class24 method1818(class24 arg0) {
        int var1 = class74.method539(124, method1811(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class13.method73(1506528624, arg0.field440);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1621(boolean arg0) {
        if (!arg0) {
            field4699 = null;
        }
        field4680++;
        if (class135.field2448 == 1000) {
            return;
        }
        boolean var2 = class84.method662(2);
        if (var2 && class29.field572 && class242.field4293 != null) {
            class242.field4293.method1133((byte) 107);
        }
        if ((class135.field2448 == 30 || class135.field2448 == 10) && (class183.field3278 || class28.field558 != 0L && class223.method1537(-26619) > class28.field558)) {
            class255.method1715(class140.field2504, class221.method1533(24454), 113, class183.field3278, class112.field2119);
        }
        if (class161.field2851 == null) {
            Container var3;
            if (class161.field2851 != null) {
                var3 = class161.field2851;
            } else if (class227.field3983 == null) {
                var3 = class8.field130.field143;
            } else {
                var3 = class227.field3983;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class227.field3983 == var3) {
                Insets var6 = class227.field3983.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class29.field565 != var4 || class236.field4118 != var5) {
                if (class9.field150.startsWith("mac")) {
                    class29.field565 = var4;
                    class236.field4118 = var5;
                } else {
                    class42.method281(-122);
                }
                class28.field558 = class223.method1537(-26619) + 500L;
            }
        }
        boolean var7 = false;
        if (class184.field3291) {
            var7 = true;
            class184.field3291 = false;
        }
        if (var7) {
            class180.method1289(116);
        }
        if (class135.field2448 == 0) {
            class74.method543((Color) null, (byte) -39, class226.field3971, class212.field3774, var7);
        } else if (class135.field2448 == 5) {
            class76.method602((byte) 111, class190.field3384, false);
        } else if (class135.field2448 == 10) {
            class198.method1411((byte) -97);
        } else if (class135.field2448 == 25 || class135.field2448 == 28) {
            if (class33.field617 == 1) {
                if (class150.field2678 < class3.field47) {
                    class150.field2678 = class3.field47;
                }
                int var8 = (class150.field2678 - class3.field47) * 50 / class150.field2678;
                class131.method1014((byte) -123, false, class109.method855(0, new class46[] { class181.field3256, class82.field1583, class115.method932(false, var8), class212.field3775 }));
            } else if (class33.field617 == 2) {
                if (class139.field2501 < class155.field2753) {
                    class139.field2501 = class155.field2753;
                }
                int var9 = ((class139.field2501 - class155.field2753) * 50 / class139.field2501) + 50;
                class131.method1014((byte) -105, false, class109.method855(0, new class46[] { class181.field3256, class82.field1583, class115.method932(false, var9), class212.field3775 }));
            } else {
                class131.method1014((byte) -91, false, class181.field3256);
            }
        } else if (class135.field2448 == 30) {
            class34.method221(0);
        } else if (class135.field2448 == 40) {
            class131.method1014((byte) 39, false, class109.method855(0, new class46[] { class51.field892, class105.field1886, class239.field4263 }));
        }
        if ((class135.field2448 == 30 || class135.field2448 == 10) && class158.field2812 == 0 && !var7) {
            try {
                Graphics var10 = class258.field4508.getGraphics();
                for (int var11 = 0; var11 < class193.field3473; var11++) {
                    if (class52.field905[var11]) {
                        class177.field3176.method683(114, class98.field1816[var11], class175.field3156[var11], class51.field894[var11], var10, class186.field3336[var11]);
                        class52.field905[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class258.field4508.repaint();
            }
        } else if (class135.field2448 != 0) {
            try {
                Graphics var12 = class258.field4508.getGraphics();
                class177.field3176.method682(0, 0, 128, var12);
                for (int var13 = 0; var13 < class193.field3473; var13++) {
                    class52.field905[var13] = false;
                }
            } catch (Exception var14) {
                class258.field4508.repaint();
            }
        }
        if (class137.field2467) {
            class103.method781(-128);
        }
        if (class149.field2672 && class135.field2448 == 10 && class114.field2157 != -1) {
            class149.field2672 = false;
            class33.method215(class8.field130, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method1819(int arg0) {
        if (arg0 != -22977) {
            method1814(false, 2);
        }
        class215.field3815.method84(-32377);
        class17.field250.method84(-32377);
        field4681++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1820(boolean arg0) {
        field4689++;
        if (arg0) {
            boolean var2 = class205.field3677.method1234(2);
            if (!var2) {
                this.method1810(-106);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1821(int arg0, int arg1) {
        class70.field1209 = null;
        class14.field209 = arg0;
        class205.field3677.field3107++;
        class151.field2690 = null;
        field4691++;
        class205.field3677.field3105 = arg1;
    }
}
