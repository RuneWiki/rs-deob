import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class116 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
    public static boolean field1525 = true;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lpe;")
    public static class100 field1524 = new class100(64);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lij;")
    public static class50 field1534 = class78.method578(123, "blinken3:");

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1535 = 20;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
    public static int[] field1536 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field1537;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method604(byte arg0) {
        field1514++;
        if (class25.field537 == 1000 || arg0 != 79) {
            return;
        }
        class244.field4245++;
        if (class244.field4245 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class59.field1086 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class41.field759.setSeed((long) class59.field1086);
        }
        this.method606((byte) -52);
        class254.method1718(50);
        class176.method1214(false);
        class244.method1665(0);
        class45.method345(1);
        class35.method281((byte) -124);
        if (class199.field3282 != null) {
            int var3 = class199.field3282.method536(205);
            class31.field632 = var3;
        }
        if (class25.field537 == 0) {
            this.method626(97);
            class97.method733((byte) 38);
        } else if (class25.field537 == 5) {
            this.method626(arg0 ^ 0x1F);
            class97.method733((byte) 75);
        } else if (class25.field537 == 25 || class25.field537 == 28) {
            class29.method259((byte) 0);
        }
        if (class25.field537 == 10) {
            this.method612(13345);
            class235.method1590(0);
            class129.method917((byte) 119);
        } else if (class25.field537 == 30) {
            class68.method520(-6442);
        } else if (class25.field537 == 40) {
            class129.method917((byte) -115);
            if (class91.field1719 != -3) {
                if (class91.field1719 == 15) {
                    class54.method430(104);
                } else if (class91.field1719 != 2) {
                    class231.method1577((byte) 3);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lce;)I")
    public static final int method605(class10 arg0) {
        class199 var1 = (class199) class232.field3896.method443(((long) arg0.field155 << 32) + (long) arg0.field216, (byte) -52);
        return var1 == null ? arg0.field288 : var1.field3286;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method606(byte arg0) {
        field1515++;
        if (arg0 > -51) {
            method616(-108);
        }
        boolean var2 = class37.method301((byte) 117);
        if (!var2) {
            this.method614(113);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method607(byte arg0) {
        method616(-27498);
        class116.method834((byte) 83);
        class148.method1034((byte) -4);
        class58.method457(10);
        class224.method1535(-28306);
        field1513++;
        class141.method988(-119);
        class217.method1472(1083051504);
        class83.method629(0);
        class21.method153((byte) 110);
        class75.method559(10227);
        class47.method353(520);
        class53.method425((byte) 125);
        class235.method1589((byte) 50);
        class86.method682(23952);
        class44.method327(-65537);
        class10.method60(-11033);
        class187.method1263(-127);
        class56.method441(1);
        class71.method539(872189087);
        class66.method507(11);
        class95.method720(-1);
        class85.method672(false);
        class84.method665(true);
        class82.method602((byte) -69);
        class18.method139(-127);
        class36.method286(true);
        class186.method1257(-128);
        class237.method1606(113);
        class65.method505(-28739);
        class203.method1375(0);
        class62.method488(0);
        class87.method692(-122);
        class32.method268(16773818);
        class189.method1274((byte) -100);
        class179.method1221((byte) 73);
        class100.method769(0);
        class204.method1377(-1);
        class209.method1400(5);
        class6.method40(false);
        class155.method1089((byte) 79);
        class184.method1248(98);
        class91.method708(false);
        class243.method1655(true);
        class54.method434(-1);
        class219.method1501((byte) -41);
        class22.method175(-1);
        class202.method1360();
        class214.method1423((byte) -68);
        class239.method1621(true);
        class149.method1045();
        class160.method1126((byte) 24);
        class33.method271((byte) -125);
        class104.method788((byte) -55);
        class131.method927(-95);
        class45.method343(9895);
        class225.method1536((byte) -114);
        class118.method856((byte) -36);
        class192.method1302(8);
        class223.method1532((byte) 13);
        class207.method1392((byte) -91);
        class152.method1074();
        class182.method1239(76);
        class106.method799(20663);
        class255.method1725((byte) -99);
        class16.method130(1);
        class55.method435(115);
        class139.method968((byte) 58);
        class102.method776(false);
        class200.method1336((byte) -84);
        class70.method530((byte) -57);
        class128.method916();
        class248.method1692(-2);
        class127.method909(124);
        class247.method1683(true);
        class220.method1511(-84);
        class13.method87();
        class158.method1112();
        class210.method1406((byte) -48);
        class227.method1553(32640);
        class14.method109(3628);
        class90.method705(106);
        class163.method1138((byte) 113);
        class57.method451(-107);
        class244.method1664(-17432);
        class143.method997();
        class48.method356((byte) 0);
        class120.method872(104);
        class228.method1557((byte) -8);
        class142.method993(-125);
        class27.method247(true);
        class145.method1025();
        class260.method1753(false);
        class213.method1415(32767);
        class41.method312(true);
        class153.method1082(115);
        class193.method1305(87);
        class3.method16(3);
        class151.method1054(true);
        class231.method1575(false);
        class119.method860(-1);
        class123.method893((byte) -91);
        class115.method829(124);
        class121.method877(-115);
        class109.method807((byte) -115);
        class28.method252((byte) 113);
        class258.method1740(false);
        class240.method1636((byte) -107);
        class117.method848((byte) 113);
        class191.method1300(0);
        class19.method146((byte) -41);
        class221.method1512(-7);
        class183.method1245((byte) 90);
        class43.method320((byte) 89);
        class97.method734((byte) -121);
        class206.method1390(-1);
        class80.method590((byte) 35);
        class93.method714((byte) 92);
        class126.method906(true);
        class37.method300(-28655);
        class154.method1086(4);
        class101.method774((byte) 61);
        class137.method954(14620);
        class99.method758(1000);
        class60.method467((byte) 31);
        class20.method152(121);
        class31.method265(124);
        class205.method1385((byte) -93);
        class257.method1732();
        class26.method242(1);
        class78.method580(true);
        class51.method418((byte) 89);
        class59.method462(-32768);
        class40.method307(-7);
        class199.method1333(false);
        class114.method822(24790);
        class256.method1727(255);
        class176.method1213(0);
        class79.method583(0);
        class201.method1342(false);
        class250.method1698((byte) -91);
        class161.method1130(0);
        class157.method1093(false);
        class241.method1639((byte) 52);
        class2.method9(false);
        class49.method362((byte) 10);
        class112.method817(96);
        class35.method279(26535);
        class170.method1183(112);
        class4.method26();
        class110.method812();
        class147.method1031();
        class68.method524(-55);
        class162.method1134((byte) -86);
        class76.method571((byte) 97);
        class168.method1157();
        class69.method527((byte) -118);
        class94.method716((byte) -80);
        class46.method348(false);
        class124.method896((byte) -59);
        class226.method1550();
        class230.method1566();
        class222.method1520(1);
        class175.method1205((byte) -119);
        class136.method943(-91);
        class52.method424(256);
        class29.method263(0);
        class15.method118(true);
        class215.method1429((byte) -128);
        class125.method904((byte) 127);
        class146.method1030((byte) -82);
        class24.method236(true);
        class211.method1414(0);
        class122.method889(1);
        class164.method1143(true);
        class178.method1219(-10260);
        class7.method43(-1);
        class197.method1322(1);
        class89.method699(true);
        class246.method1679((byte) -90);
        class195.method1318((byte) 116);
        class5.method38(-27973);
        class236.method1601(0);
        class261.method1758((byte) 50);
        class232.method1581((byte) 52);
        class132.method928(0);
        class196.method1320(127);
        class173.method1197(2);
        class130.method923((byte) -68);
        class259.method1743(-107);
        class134.method938(-27839);
        class167.method1151(18665);
        class159.method1124((byte) 36);
        class177.method1216(39);
        class96.method722(-24340);
        class188.method1270(-67);
        class144.method1007(0);
        class229.method1560(18560);
        class194.method1311(44);
        class245.method1674(12966);
        class133.method937(89);
        class252.method1708(-1);
        if (arg0 >= -97) {
            return;
        }
        class208.method1398(110);
        class74.method552(-127);
        class73.method550(-9514);
        class174.method1202(30);
        class25.method241(-18193);
        class140.method972(-74);
        class190.method1279((byte) 121);
        class251.method1701(0);
        class61.method471(12);
        class103.method783((byte) -26);
        class17.method133(-1);
        class216.method1432((byte) 92);
        class166.method1148(-91);
        class238.method1612(0);
        class39.method305(1);
        class254.method1720(-111);
        class1.method3((byte) 38);
        class129.method919(4);
        class8.method50(28362);
        class63.method490(2902);
        class172.method1190(100);
        class64.method497(-1686);
        class249.method1694(626024748);
        class42.method317(1743168352);
        class233.method1583(-35);
        if (class116.field2056) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Luj;")
    public static final class137 method608(int arg0, boolean arg1, int arg2) {
        field1520++;
        if (arg1) {
            return null;
        }
        class137 var3 = (class137) class213.field3528.method443((long) arg2 | (long) arg0 << 32, (byte) -84);
        if (var3 == null) {
            var3 = new class137(arg0, arg2);
            class213.field3528.method445(75, var3.field635, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Lud;")
    public static final class139 method609(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class139 var4 = var3.field1235;
            var3.field1235 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
    public static final void method610(int arg0, int arg1, int arg2) {
        field1529++;
        if (arg2 != 0) {
            field1535 = -93;
        }
        class137 var3 = method608(1, false, arg0);
        var3.method952((byte) 60);
        var3.field2383 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method611(byte arg0) {
        field1532++;
        if (class206.field3414 != null) {
            class206.field3414.destroy();
            class206.field3414 = null;
        }
        if (class186.field3058 != null) {
            class186.field3058.method955(this.getClass(), (byte) 123);
        }
        if (class238.field4045 != null) {
            class238.field4045.field3771 = false;
        }
        class238.field4045 = null;
        if (class148.field2547 != null) {
            class148.field2547.method630(2);
            class148.field2547 = null;
        }
        class114.method825(false, class228.field3834);
        class252.method1704((byte) -112, class228.field3834);
        if (arg0 <= 70) {
            return;
        }
        if (class199.field3282 != null) {
            class199.field3282.method537((byte) -79, class228.field3834);
        }
        class255.method1723(true);
        class125.method903((byte) 127);
        class199.field3282 = null;
        if (class219.field3664 != null) {
            class219.field3664.method597(-125);
        }
        if (class133.field2330 != null) {
            class133.field2330.method597(126);
        }
        class246.method1678(90);
        class58.method456(true);
        try {
            if (class241.field4147 != null) {
                class241.field4147.method561((byte) -115);
            }
            if (class17.field377 != null) {
                for (int var2 = 0; var2 < class17.field377.length; var2++) {
                    if (class17.field377[var2] != null) {
                        class17.field377[var2].method561((byte) -108);
                    }
                }
            }
            if (class45.field835 != null) {
                class45.field835.method561((byte) -14);
            }
            if (class211.field3506 != null) {
                class211.field3506.method561((byte) -73);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    private final void method612(int arg0) {
        class46.method350(this, (byte) 115);
        if (arg0 != 13345) {
            field1535 = -92;
        }
        field1516++;
        for (class62.field1162 = 0; class141.method986(arg0 ^ 0xFFFFB177) && class62.field1162 < 128; class62.field1162++) {
            class124.field2175[class62.field1162] = class190.field3153;
            class100.field1842[class62.field1162] = class133.field2333;
        }
        class55.field988++;
        if (class48.field871 != -1) {
            class205.method1383(class1.field1, class136.field2370, -1, 0, class48.field871, 0, 0, 0);
        }
        class217.field3649++;
        class187.method1261((byte) 115);
        while (true) {
            class93 var2;
            class10 var3;
            class10 var4;
            do {
                var2 = (class93) class183.field3018.method679((byte) -94);
                if (var2 == null) {
                    while (true) {
                        class93 var5;
                        class10 var6;
                        class10 var7;
                        do {
                            var5 = (class93) class36.field685.method679((byte) -94);
                            if (var5 == null) {
                                while (true) {
                                    class93 var8;
                                    class10 var9;
                                    class10 var10;
                                    do {
                                        var8 = (class93) class160.field2751.method679((byte) -94);
                                        if (var8 == null) {
                                            if (class206.field3413 != null) {
                                                class102.method778(23877);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1740;
                                        if (var9.field216 < 0) {
                                            break;
                                        }
                                        var10 = class89.method698(var9.field149, (byte) 94);
                                    } while (var10 == null || var10.field297 == null || var10.field297.length <= var9.field216 || var10.field297[var9.field216] != var9);
                                    class214.method1422(var8, -15181);
                                }
                            }
                            var6 = var5.field1740;
                            if (var6.field216 < 0) {
                                break;
                            }
                            var7 = class89.method698(var6.field149, (byte) 94);
                        } while (var7 == null || var7.field297 == null || var7.field297.length <= var6.field216 || var7.field297[var6.field216] != var6);
                        class214.method1422(var5, -15181);
                    }
                }
                var3 = var2.field1740;
                if (var3.field216 < 0) {
                    break;
                }
                var4 = class89.method698(var3.field149, (byte) 94);
            } while (var4 == null || var4.field297 == null || var4.field297.length <= var3.field216 || var4.field297[var3.field216] != var3);
            class214.method1422(var2, -15181);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1533++;
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class170.method1180((byte) -128);
            }
            class14.field332 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class40.field737 = 0;
            } else if (arg0[1].equals("office")) {
                class40.field737 = 1;
            } else if (arg0[1].equals("local")) {
                class40.field737 = 2;
            } else {
                class170.method1180((byte) -126);
            }
            if (arg0[2].equals("live")) {
                class57.field1025 = 0;
            } else if (arg0[2].equals("rc")) {
                class57.field1025 = 1;
            } else if (arg0[2].equals("wip")) {
                class57.field1025 = 2;
            } else {
                class170.method1180((byte) -126);
            }
            if (arg0[4].equals("free")) {
                class151.field2628 = false;
            } else if (arg0[4].equals("members")) {
                class151.field2628 = true;
            } else {
                class170.method1180((byte) -128);
            }
            if (arg0[5].equals("english")) {
                class44.field804 = 0;
            } else if (arg0[5].equals("german")) {
                class52.method422((byte) -72);
                class44.field804 = 1;
            } else {
                class170.method1180((byte) -126);
            }
            if (arg0[6].equals("game0")) {
                class57.field1037 = 0;
            } else if (arg0[6].equals("game1")) {
                class57.field1037 = 1;
            } else {
                class170.method1180((byte) -126);
            }
            if (arg0.length != 8) {
                class178.field2980 = false;
            } else if (arg0[7].equals("safemode")) {
                class178.field2980 = true;
            } else {
                class170.method1180((byte) -128);
            }
            class144.field2505 = class245.field4271;
            class89.field1693 = 0;
            class176.field2950 = "127.0.0.1";
            client var1 = new client();
            var1.method830(505, class57.field1025 + 32, 765, "runescape", 27, (byte) 92, 503);
            class251.field4357.setLocation(40, 40);
        } catch (Exception var3) {
            class121.method883((String) null, (byte) -112, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method613(boolean arg0) {
        class63.method492(class178.field2980, class186.field3058, 255);
        field1522++;
        class102.field1875 = class32.field639 = class167.field2833 = class21.field433 = new short[256];
        class82.field1479 = class40.field737 == 0 ? 43594 : class14.field332 + 40000;
        if (class57.field1037 == 1) {
            class141.field2480 = class101.field1865;
            class220.field3682 = class57.field1030;
            class132.field2312 = class251.field4361;
            class136.field2366 = class122.field2148;
        } else {
            class132.field2312 = class20.field423;
            class136.field2366 = class115.field2019;
            class141.field2480 = class114.field2002;
            class220.field3682 = class100.field1849;
        }
        if (!arg0) {
            field1534 = null;
        }
        class249.field4319 = class40.field737 == 0 ? 443 : class14.field332 + 50000;
        class15.field344 = class82.field1479;
        class166.method1147(43);
        class213.method1418((byte) -79, class228.field3834);
        class57.method450(0, class228.field3834);
        class199.field3282 = class155.method1088(0);
        if (class199.field3282 != null) {
            class199.field3282.method540(class228.field3834, -7270);
        }
        class148.field2551 = class138.field2402;
        try {
            if (class186.field3058.field2409 != null) {
                class241.field4147 = new class75(class186.field3058.field2409, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class17.field377[var2] = new class75(class186.field3058.field2393[var2], 6000, 0);
                }
                class45.field835 = new class75(class186.field3058.field2405, 6000, 0);
                class162.field2779 = new class47(255, class241.field4147, class45.field835, 500000);
                class211.field3506 = new class75(class186.field3058.field2388, 24, 0);
                class186.field3058.field2405 = null;
                class186.field3058.field2393 = null;
                class186.field3058.field2388 = null;
                class186.field3058.field2409 = null;
            }
        } catch (IOException var3) {
            class162.field2779 = null;
            class211.field3506 = null;
            class45.field835 = null;
            class241.field4147 = null;
        }
        if (class40.field737 != 0) {
            class244.field4253 = true;
        }
        class104.field1900 = class40.field738;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method614(int arg0) {
        field1526++;
        if (class196.field3254 >= 4) {
            this.method835("js5crc", false);
            class25.field537 = 1000;
            return;
        }
        int var2 = 108 % ((arg0 + 35) / 54);
        if (class133.field2319 >= 4) {
            if (class25.field537 == 0 || class25.field537 == 5) {
                this.method835("js5io", false);
                class25.field537 = 1000;
                return;
            }
            class133.field2319 = 3;
            class70.field1354 = 3000;
        }
        if ((class70.field1354--) > 0) {
            return;
        }
        try {
            if (class8.field114 == 0) {
                class207.field3445 = class186.field3058.method966((byte) 51, class176.field2950, class15.field344);
                class8.field114++;
            }
            if (class8.field114 == 1) {
                if (class207.field3445.field133 == 2) {
                    this.method623(2, -1);
                    return;
                }
                if (class207.field3445.field133 == 1) {
                    class8.field114++;
                }
            }
            if (class8.field114 == 2) {
                class37.field719 = new class83((Socket) class207.field3445.field132, class186.field3058);
                class217 var3 = new class217(5);
                var3.method1471(15, (byte) 24);
                var3.method1446(-42, 505);
                class37.field719.method632(0, var3.field3633, 5, true);
                class8.field114++;
                class164.field2806 = class104.method785(-1);
            }
            if (class8.field114 == 3) {
                if (class25.field537 == 0 || class25.field537 == 5 || class37.field719.method631((byte) -45) > 0) {
                    int var4 = class37.field719.method627((byte) 48);
                    if (var4 != 0) {
                        this.method623(2, var4);
                        return;
                    }
                    class8.field114++;
                } else if (class104.method785(-1) - class164.field2806 > 30000L) {
                    this.method623(2, -2);
                    return;
                }
            }
            if (class8.field114 == 4) {
                boolean var5 = class25.field537 == 5 || class25.field537 == 10 || class25.field537 == 28;
                class62.method483(class37.field719, !var5, 4);
                class8.field114 = 0;
                class37.field719 = null;
                class207.field3445 = null;
                class243.field4195 = 0;
            }
        } catch (IOException var6) {
            this.method623(2, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjd;IILce;I)V")
    public static final void method615(int arg0, int arg1, class85 arg2, int arg3, int arg4, class10 arg5, int arg6) {
        field1521++;
        if (arg2 == null) {
            return;
        }
        int var7 = class45.field832 + class160.field2758 & arg6;
        int var8 = Math.max(arg5.field243 / 2, arg5.field242 / 2) + 10;
        int var9 = arg1 * arg1 + arg3 * arg3;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class13.field311[var7];
        int var11 = var10 * 256 / (class252.field4381 + 256);
        int var12 = class13.field313[var7];
        int var13 = var12 * 256 / (class252.field4381 + 256);
        int var14 = arg3 * var13 + (arg1 * var11) >> 16;
        int var15 = arg3 * var11 - arg1 * var13 >> 16;
        ((class169) arg2).method1177(arg5.field243 / 2 + var14 + arg4 - (arg2.field1648 / 2), arg5.field242 / 2 + -(arg2.field1637 / 2) + arg0 - var15, arg5.field158, arg5.field286);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static void method616(int arg0) {
        if (arg0 != -27498) {
            method617((class10) null, -10, 91, 75);
        }
        field1524 = null;
        field1536 = null;
        field1534 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lce;III)V")
    public static final void method617(class10 arg0, int arg1, int arg2, int arg3) {
        field1530++;
        if (arg0.field247 == 1) {
            class126.field2208++;
            class129.method921(arg0.field244, class245.field4271, 0, arg0.field155, (short) 42, true, 0L);
        }
        if (arg0.field247 == 2 && !class188.field3116) {
            class50 var4 = class190.method1281(arg0, arg3 - 13);
            if (var4 != null) {
                class245.field4277++;
                class129.method921(var4, class80.method589(new class50[] { class127.field2227, arg0.field285 }, 28743), -1, arg0.field155, (short) 28, true, 0L);
            }
        }
        if (arg0.field247 == 3) {
            class129.method921(class160.field2757, class245.field4271, 0, arg0.field155, (short) 29, true, 0L);
            class241.field4152++;
        }
        if (arg0.field247 == 4) {
            class76.field1430++;
            class129.method921(arg0.field244, class245.field4271, 0, arg0.field155, (short) 13, true, 0L);
        }
        if (arg3 != 100) {
            method625((byte) 3);
        }
        if (arg0.field247 == 5) {
            class129.method921(arg0.field244, class245.field4271, 0, arg0.field155, (short) 9, true, 0L);
            class40.field747++;
        }
        if (arg0.field247 == 6 && class220.field3676 == null) {
            class235.field3941++;
            class129.method921(arg0.field244, class245.field4271, -1, arg0.field155, (short) 23, true, 0L);
        }
        if (arg0.field227 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field178; var6++) {
                for (int var7 = 0; var7 < arg0.field229; var7++) {
                    int var8 = (arg0.field210 + 32) * var7;
                    int var9 = (arg0.field274 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field180[var5];
                        var8 += arg0.field267[var5];
                    }
                    if (arg2 >= var8 && arg1 >= var9 && arg2 < (var8 + 32) && arg1 < (var9 + 32)) {
                        class45.field834 = arg0;
                        class41.field752 = var5;
                        if (arg0.field298[var5] > 0) {
                            class239 var10 = class15.method111(arg0.field298[var5] - 1, false);
                            if (class114.field1992 == 1 && class34.method278((byte) -122, method605(arg0))) {
                                if (class15.field353 != arg0.field155 || class239.field4075 != var5) {
                                    class129.method921(class220.field3686, class80.method589(new class50[] { class19.field407, class29.field605, var10.field4103 }, 28743), var5, arg0.field155, (short) 39, true, (long) var10.field4091);
                                    class124.field2176++;
                                }
                            } else if (!class188.field3116 || !class34.method278((byte) 43, method605(arg0))) {
                                class227.field3821++;
                                class50[] var11 = var10.field4063;
                                if (class140.field2454) {
                                    var11 = class243.method1647(-6, var11);
                                }
                                if (class34.method278((byte) 89, method605(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 47;
                                            } else {
                                                var13 = 4;
                                            }
                                            class39.field723++;
                                            class129.method921(var11[var12], class80.method589(new class50[] { class61.field1123, var10.field4103 }, 28743), var5, arg0.field155, var13, true, (long) var10.field4091);
                                        } else if (var12 == 4) {
                                            class129.method921(class251.field4355, class80.method589(new class50[] { class61.field1123, var10.field4103 }, 28743), var5, arg0.field155, (short) 4, true, (long) var10.field4091);
                                            class214.field3544++;
                                        }
                                    }
                                }
                                if (class71.method535(false, method605(arg0))) {
                                    field1523++;
                                    class129.method921(class220.field3686, class80.method589(new class50[] { class61.field1123, var10.field4103 }, 28743), var5, arg0.field155, (short) 38, true, (long) var10.field4091);
                                }
                                if (class34.method278((byte) -119, method605(arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class52.field954++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 21;
                                            }
                                            if (var14 == 1) {
                                                var15 = 51;
                                            }
                                            if (var14 == 2) {
                                                var15 = 19;
                                            }
                                            class129.method921(var11[var14], class80.method589(new class50[] { class61.field1123, var10.field4103 }, arg3 + 28643), var5, arg0.field155, var15, true, (long) var10.field4091);
                                        }
                                    }
                                }
                                class50[] var16 = arg0.field263;
                                if (class140.field2454) {
                                    var16 = class243.method1647(-6, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class61.field1127++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 36;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 31;
                                            }
                                            if (var17 == 4) {
                                                var18 = 33;
                                            }
                                            class129.method921(var16[var17], class80.method589(new class50[] { class61.field1123, var10.field4103 }, 28743), var5, arg0.field155, var18, true, (long) var10.field4091);
                                        }
                                    }
                                }
                                class129.method921(class109.field1959, class80.method589(new class50[] { class61.field1123, var10.field4103 }, arg3 + 28643), var5, arg0.field155, (short) 1005, true, (long) var10.field4091);
                            } else if ((class129.field2270 & 0x10) == 16) {
                                class129.method921(class41.field766, class80.method589(new class50[] { class18.field396, class29.field605, var10.field4103 }, 28743), var5, arg0.field155, (short) 57, true, (long) var10.field4091);
                                class246.field4285++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field222) {
            return;
        }
        if (!class188.field3116) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class50 var23 = class99.method760(var19, -61, arg0);
                if (var23 != null) {
                    class129.method921(var23, arg0.field181, arg0.field216, arg0.field155, (short) 1001, true, (long) (var19 + 1));
                    class193.field3203++;
                }
            }
            class50 var20 = class190.method1281(arg0, 75);
            if (var20 != null) {
                class129.method921(var20, arg0.field181, arg0.field216, arg0.field155, (short) 28, true, 0L);
                class245.field4277++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class50 var22 = class99.method760(var21, -71, arg0);
                if (var22 != null) {
                    class129.method921(var22, arg0.field181, arg0.field216, arg0.field155, (short) 14, true, (long) (var21 + 1));
                    class193.field3203++;
                }
            }
            if (!class33.method270(-2, method605(arg0))) {
                return;
            }
            class235.field3941++;
            class129.method921(class223.field3755, class245.field4271, arg0.field216, arg0.field155, (short) 23, true, 0L);
        } else if (class90.method701(255, method605(arg0)) && (class129.field2270 & 0x20) == 32) {
            class129.method921(class41.field766, class80.method589(new class50[] { class18.field396, class193.field3205, arg0.field181 }, 28743), arg0.field216, arg0.field155, (short) 1, true, 0L);
            class106.field1909++;
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lce;)Lce;")
    public static final class10 method618(class10 arg0) {
        int var1 = class222.method1522(method605(arg0), 1981643761);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class89.method698(arg0.field149, (byte) 94);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lce;IIIIIII)V")
    public static final void method619(class10[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class10 var9 = arg0[var8];
            if (var9 != null && var9.field149 == arg1 && (!var9.field222 || var9.field227 == 0 || var9.field206 || method605(var9) != 0 || class60.field1103 == var9 || var9.field259 == 1338) && (!var9.field222 || !method624(var9))) {
                int var10 = var9.field272 + arg6;
                int var11 = var9.field241 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field227 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field243 + var10;
                    int var17 = var9.field242 + var11;
                    if (var9.field227 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class206.field3413 == var9) {
                    class220.field3683 = true;
                    class258.field4495 = var10;
                    class53.field962 = var11;
                }
                if (!var9.field222 || var12 < var14 && var13 < var15) {
                    if (var9.field227 == 0) {
                        if (!var9.field222 && method624(var9) && class29.field615 != var9) {
                            continue;
                        }
                        if (var9.field262 && class69.field1297 >= var12 && class173.field2904 >= var13 && class69.field1297 < var14 && class173.field2904 < var15) {
                            for (class93 var18 = (class93) class160.field2751.method689(1001); var18 != null; var18 = (class93) class160.field2751.method688(-41)) {
                                if (var18.field1737) {
                                    var18.method267(-104);
                                }
                            }
                            if (class126.field2215 == 0) {
                                class206.field3413 = null;
                                class60.field1103 = null;
                            }
                            class229.field3841 = false;
                        }
                    }
                    if (var9.field222) {
                        boolean var19;
                        if (class69.field1297 >= var12 && class173.field2904 >= var13 && class69.field1297 < var14 && class173.field2904 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class238.field4039 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class193.field3200 == 1 && class56.field1000 >= var12 && class52.field950 >= var13 && class56.field1000 < var14 && class52.field950 < var15) {
                            var21 = true;
                        }
                        if (class62.field1162 > 0 && var9.field151 != null) {
                            for (int var22 = 0; var22 < var9.field151.length; var22++) {
                                for (int var23 = 0; var23 < class62.field1162; var23++) {
                                    int var24 = var9.field151[var22] & 0xFF;
                                    if (class124.field2175[var23] == var24) {
                                        class22.method164(-7958, var22 + 1, var9.field155, -1, class245.field4271);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class54.method433(class52.field950 - var11, var9, class56.field1000 - var10, 16244);
                        }
                        if (class206.field3413 != null && class206.field3413 != var9 && var19 && class137.method953((byte) 90, method605(var9))) {
                            class22.field470 = var9;
                        }
                        if (class60.field1103 == var9) {
                            class211.field3516 = true;
                            class238.field4037 = var10;
                            class124.field2167 = var11;
                        }
                        if (var9.field206 || var9.field259 != 0) {
                            if (var19 && class31.field632 != 0 && var9.field289 != null) {
                                class93 var25 = new class93();
                                var25.field1737 = true;
                                var25.field1740 = var9;
                                var25.field1734 = class31.field632;
                                var25.field1739 = var9.field289;
                                class160.field2751.method684(var25, (byte) 109);
                            }
                            if (class206.field3413 != null || class7.field97 != null || class205.field3406 || var9.field259 != 1400 && class229.field3841) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field259 != 0) {
                                if (var9.field259 == 1337) {
                                    class115.field2018 = var9;
                                    class140.method979((byte) 42, var9);
                                    continue;
                                }
                                if (var9.field259 == 1338) {
                                    if (var21) {
                                        class51.method417(class52.field950 - var11, -480948313, class56.field1000 - var10, var9);
                                    }
                                    continue;
                                }
                                if (var9.field259 == 1400) {
                                    class19.field398 = var9;
                                    if (var21) {
                                        if (class46.field846[82] && class18.field397 > 0) {
                                            int var26 = (int) ((double) (class56.field1000 - var10 - var9.field243 / 2) * 2.0D / class2.field20) + class90.field1714 + class215.field3559;
                                            int var27 = class46.field847 + class140.field2460 - (int) ((double) (class52.field950 - var11 - var9.field242 / 2) * 2.0D / class2.field20) - class222.field3744;
                                            class50 var28 = class80.method589(new class50[] { class201.field3316, class78.method579(var26 >> 6, -26225), class16.field358, class78.method579(var27 >> 6, -26225), class16.field358, class78.method579(var26 & 0x3F, -26225), class16.field358, class78.method579(var27 & 0x3F, -26225) }, 28743);
                                            var28.method411(0);
                                            class233.method1584((byte) 33, var28);
                                            class116.method837(true);
                                            continue;
                                        }
                                        class229.field3841 = true;
                                        class121.field2133 = class69.field1297;
                                        class120.field2114 = class173.field2904;
                                        class221.field3724 = class215.field3559;
                                        class194.field3215 = class222.field3744;
                                        continue;
                                    }
                                    if (var20 && class229.field3841) {
                                        class259.method1742((byte) 103, (int) ((double) (class121.field2133 - class69.field1297) * 2.0D / class252.field4369) + class221.field3724);
                                        method621((int) ((double) (class120.field2114 - class173.field2904) * 2.0D / class252.field4369) + class194.field3215, 2);
                                        continue;
                                    }
                                    class229.field3841 = false;
                                    continue;
                                }
                                if (var9.field259 == 1401) {
                                    if (var20) {
                                        class69.method528(-1, class173.field2904 - var11, var9.field243, var9.field242, class69.field1297 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field259 == 1402) {
                                    class140.method979((byte) 84, var9);
                                    continue;
                                }
                                if (var9.field259 == 1404) {
                                    class140.method979((byte) 66, var9);
                                    continue;
                                }
                            }
                            if (!var9.field257 && var21) {
                                var9.field257 = true;
                                if (var9.field187 != null) {
                                    class93 var29 = new class93();
                                    var29.field1737 = true;
                                    var29.field1740 = var9;
                                    var29.field1741 = class56.field1000 - var10;
                                    var29.field1734 = class52.field950 - var11;
                                    var29.field1739 = var9.field187;
                                    class160.field2751.method684(var29, (byte) 109);
                                }
                            }
                            if (var9.field257 && var20 && var9.field143 != null) {
                                class93 var30 = new class93();
                                var30.field1737 = true;
                                var30.field1740 = var9;
                                var30.field1741 = class69.field1297 - var10;
                                var30.field1734 = class173.field2904 - var11;
                                var30.field1739 = var9.field143;
                                class160.field2751.method684(var30, (byte) 109);
                            }
                            if (var9.field257 && !var20) {
                                var9.field257 = false;
                                if (var9.field266 != null) {
                                    class93 var31 = new class93();
                                    var31.field1737 = true;
                                    var31.field1740 = var9;
                                    var31.field1741 = class69.field1297 - var10;
                                    var31.field1734 = class173.field2904 - var11;
                                    var31.field1739 = var9.field266;
                                    class36.field685.method684(var31, (byte) 109);
                                }
                            }
                            if (var20 && var9.field185 != null) {
                                class93 var32 = new class93();
                                var32.field1737 = true;
                                var32.field1740 = var9;
                                var32.field1741 = class69.field1297 - var10;
                                var32.field1734 = class173.field2904 - var11;
                                var32.field1739 = var9.field185;
                                class160.field2751.method684(var32, (byte) 109);
                            }
                            if (!var9.field198 && var19) {
                                var9.field198 = true;
                                if (var9.field166 != null) {
                                    class93 var33 = new class93();
                                    var33.field1737 = true;
                                    var33.field1740 = var9;
                                    var33.field1741 = class69.field1297 - var10;
                                    var33.field1734 = class173.field2904 - var11;
                                    var33.field1739 = var9.field166;
                                    class160.field2751.method684(var33, (byte) 109);
                                }
                            }
                            if (var9.field198 && var19 && var9.field214 != null) {
                                class93 var34 = new class93();
                                var34.field1737 = true;
                                var34.field1740 = var9;
                                var34.field1741 = class69.field1297 - var10;
                                var34.field1734 = class173.field2904 - var11;
                                var34.field1739 = var9.field214;
                                class160.field2751.method684(var34, (byte) 109);
                            }
                            if (var9.field198 && !var19) {
                                var9.field198 = false;
                                if (var9.field209 != null) {
                                    class93 var35 = new class93();
                                    var35.field1737 = true;
                                    var35.field1740 = var9;
                                    var35.field1741 = class69.field1297 - var10;
                                    var35.field1734 = class173.field2904 - var11;
                                    var35.field1739 = var9.field209;
                                    class36.field685.method684(var35, (byte) 109);
                                }
                            }
                            if (var9.field142 != null) {
                                class93 var36 = new class93();
                                var36.field1740 = var9;
                                var36.field1739 = var9.field142;
                                class183.field3018.method684(var36, (byte) 109);
                            }
                            if (var9.field226 != null && class191.field3170 > var9.field261) {
                                if (var9.field194 == null || class191.field3170 - var9.field261 > 32) {
                                    class93 var41 = new class93();
                                    var41.field1740 = var9;
                                    var41.field1739 = var9.field226;
                                    class160.field2751.method684(var41, (byte) 109);
                                } else {
                                    label543: for (int var37 = var9.field261; var37 < class191.field3170; var37++) {
                                        int var38 = class21.field449[var37 & 0x1F];
                                        for (int var39 = 0; var39 < var9.field194.length; var39++) {
                                            if (var9.field194[var39] == var38) {
                                                class93 var40 = new class93();
                                                var40.field1740 = var9;
                                                var40.field1739 = var9.field226;
                                                class160.field2751.method684(var40, (byte) 109);
                                                break label543;
                                            }
                                        }
                                    }
                                }
                                var9.field261 = class191.field3170;
                            }
                            if (var9.field192 != null && class52.field953 > var9.field191) {
                                if (var9.field141 == null || class52.field953 - var9.field191 > 32) {
                                    class93 var46 = new class93();
                                    var46.field1740 = var9;
                                    var46.field1739 = var9.field192;
                                    class160.field2751.method684(var46, (byte) 109);
                                } else {
                                    label519: for (int var42 = var9.field191; var42 < class52.field953; var42++) {
                                        int var43 = class251.field4350[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field141.length; var44++) {
                                            if (var9.field141[var44] == var43) {
                                                class93 var45 = new class93();
                                                var45.field1740 = var9;
                                                var45.field1739 = var9.field192;
                                                class160.field2751.method684(var45, (byte) 109);
                                                break label519;
                                            }
                                        }
                                    }
                                }
                                var9.field191 = class52.field953;
                            }
                            if (var9.field275 != null && class197.field3276 > var9.field189) {
                                if (var9.field153 == null || class197.field3276 - var9.field189 > 32) {
                                    class93 var51 = new class93();
                                    var51.field1740 = var9;
                                    var51.field1739 = var9.field275;
                                    class160.field2751.method684(var51, (byte) 109);
                                } else {
                                    label495: for (int var47 = var9.field189; var47 < class197.field3276; var47++) {
                                        int var48 = class10.field190[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field153.length; var49++) {
                                            if (var9.field153[var49] == var48) {
                                                class93 var50 = new class93();
                                                var50.field1740 = var9;
                                                var50.field1739 = var9.field275;
                                                class160.field2751.method684(var50, (byte) 109);
                                                break label495;
                                            }
                                        }
                                    }
                                }
                                var9.field189 = class197.field3276;
                            }
                            if (var9.field249 != null && class124.field2172 > var9.field148) {
                                if (var9.field299 == null || class124.field2172 - var9.field148 > 32) {
                                    class93 var56 = new class93();
                                    var56.field1740 = var9;
                                    var56.field1739 = var9.field249;
                                    class160.field2751.method684(var56, (byte) 109);
                                } else {
                                    label471: for (int var52 = var9.field148; var52 < class124.field2172; var52++) {
                                        int var53 = class155.field2705[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field299.length; var54++) {
                                            if (var9.field299[var54] == var53) {
                                                class93 var55 = new class93();
                                                var55.field1740 = var9;
                                                var55.field1739 = var9.field249;
                                                class160.field2751.method684(var55, (byte) 109);
                                                break label471;
                                            }
                                        }
                                    }
                                }
                                var9.field148 = class124.field2172;
                            }
                            if (var9.field230 != null && class41.field763 > var9.field233) {
                                if (var9.field235 == null || class41.field763 - var9.field233 > 32) {
                                    class93 var61 = new class93();
                                    var61.field1740 = var9;
                                    var61.field1739 = var9.field230;
                                    class160.field2751.method684(var61, (byte) 109);
                                } else {
                                    label447: for (int var57 = var9.field233; var57 < class41.field763; var57++) {
                                        int var58 = class61.field1128[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field235.length; var59++) {
                                            if (var9.field235[var59] == var58) {
                                                class93 var60 = new class93();
                                                var60.field1740 = var9;
                                                var60.field1739 = var9.field230;
                                                class160.field2751.method684(var60, (byte) 109);
                                                break label447;
                                            }
                                        }
                                    }
                                }
                                var9.field233 = class41.field763;
                            }
                            if (class160.field2744 > var9.field279 && var9.field269 != null) {
                                class93 var62 = new class93();
                                var62.field1740 = var9;
                                var62.field1739 = var9.field269;
                                class160.field2751.method684(var62, (byte) 109);
                            }
                            if (class184.field3023 > var9.field279 && var9.field255 != null) {
                                class93 var63 = new class93();
                                var63.field1740 = var9;
                                var63.field1739 = var9.field255;
                                class160.field2751.method684(var63, (byte) 109);
                            }
                            if (class256.field4452 > var9.field279 && var9.field291 != null) {
                                class93 var64 = new class93();
                                var64.field1740 = var9;
                                var64.field1739 = var9.field291;
                                class160.field2751.method684(var64, (byte) 109);
                            }
                            if (class241.field4136 > var9.field279 && var9.field134 != null) {
                                class93 var65 = new class93();
                                var65.field1740 = var9;
                                var65.field1739 = var9.field134;
                                class160.field2751.method684(var65, (byte) 109);
                            }
                            if (class255.field4399 > var9.field279 && var9.field147 != null) {
                                class93 var66 = new class93();
                                var66.field1740 = var9;
                                var66.field1739 = var9.field147;
                                class160.field2751.method684(var66, (byte) 109);
                            }
                            var9.field279 = class217.field3649;
                            if (var9.field195 != null) {
                                for (int var67 = 0; var67 < class62.field1162; var67++) {
                                    class93 var68 = new class93();
                                    var68.field1740 = var9;
                                    var68.field1735 = class124.field2175[var67];
                                    var68.field1747 = class100.field1842[var67];
                                    var68.field1739 = var9.field195;
                                    class160.field2751.method684(var68, (byte) 109);
                                }
                            }
                            if (class213.field3520 && var9.field196 != null) {
                                class93 var69 = new class93();
                                var69.field1740 = var9;
                                var69.field1739 = var9.field196;
                                class160.field2751.method684(var69, (byte) 109);
                            }
                        }
                    }
                    if (!var9.field222 && class206.field3413 == null && class7.field97 == null && !class205.field3406) {
                        if ((var9.field245 >= 0 || var9.field136 != 0) && class69.field1297 >= var12 && class173.field2904 >= var13 && class69.field1297 < var14 && class173.field2904 < var15) {
                            if (var9.field245 >= 0) {
                                class29.field615 = arg0[var9.field245];
                            } else {
                                class29.field615 = var9;
                            }
                        }
                        if (var9.field227 == 8 && class69.field1297 >= var12 && class173.field2904 >= var13 && class69.field1297 < var14 && class173.field2904 < var15) {
                            class134.field2340 = var9;
                        }
                        if (var9.field292 > var9.field242) {
                            class20.method150(class69.field1297, var9.field292, class173.field2904, var11, var9.field243 + var10, var9, var9.field242, 116);
                        }
                    }
                    if (var9.field227 == 0) {
                        method619(arg0, var9.field155, var12, var13, var14, var15, var10 - var9.field156, var11 - var9.field239);
                        if (var9.field297 != null) {
                            method619(var9.field297, var9.field155, var12, var13, var14, var15, var10 - var9.field156, var11 - var9.field239);
                        }
                        class87 var70 = (class87) class132.field2304.method443((long) var9.field155, (byte) 113);
                        if (var70 != null) {
                            class205.method1383(var14, var15, -1, var12, var70.field1678, var11, var10, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method620(int arg0) {
        field1519++;
        if (class25.field537 == 1000) {
            return;
        }
        boolean var2 = class252.method1705(arg0 + 3);
        if (var2 && class91.field1718 && class219.field3664 != null) {
            class219.field3664.method599(-121);
        }
        if (class27.field579 && (class25.field537 == 30 || class25.field537 == 10)) {
            class63.method491(arg0 ^ 0xC13101D);
        }
        boolean var3 = false;
        if (class28.field599) {
            var3 = true;
            class28.field599 = false;
        }
        if (arg0 != -1) {
            return;
        }
        if (class25.field537 == 0) {
            class19.method145(class59.field1049, class58.field1046, (Color) null, true, var3);
        } else if (class25.field537 == 5) {
            class140.method983(class57.field1029, (byte) -87);
        } else if (class25.field537 == 10) {
            class207.method1394(-1);
        } else if (class25.field537 == 25 || class25.field537 == 28) {
            if (class83.field1543 == 1) {
                if (class174.field2912 < class203.field3375) {
                    class174.field2912 = class203.field3375;
                }
                int var4 = (class174.field2912 - class203.field3375) * 50 / class174.field2912;
                class75.method564(-9117, false, class80.method589(new class50[] { class188.field3115, class56.field1005, class78.method579(var4, -26225), class233.field3909 }, 28743));
            } else if (class83.field1543 == 2) {
                if (class154.field2692 > class68.field1290) {
                    class68.field1290 = class154.field2692;
                }
                int var5 = (class68.field1290 - class154.field2692) * 50 / class68.field1290 + 50;
                class75.method564(-9117, false, class80.method589(new class50[] { class188.field3115, class56.field1005, class78.method579(var5, -26225), class233.field3909 }, 28743));
            } else {
                class75.method564(-9117, false, class188.field3115);
            }
        } else if (class25.field537 == 30) {
            class52.method421(3);
        } else if (class25.field537 == 40) {
            class75.method564(-9117, false, class80.method589(new class50[] { class222.field3741, class56.field994, class208.field3453 }, 28743));
        }
        if ((class25.field537 == 30 || class25.field537 == 10) && class54.field967 == 0 && !var3) {
            try {
                Graphics var6 = class228.field3834.getGraphics();
                for (int var7 = 0; var7 < class60.field1094; var7++) {
                    if (class208.field3458[var7]) {
                        class221.field3725.method453(class238.field4046[var7], class159.field2741[var7], class172.field2877[var7], (byte) 7, var6, class151.field2624[var7]);
                        class208.field3458[var7] = false;
                    }
                }
            } catch (Exception var13) {
                class228.field3834.repaint();
            }
        } else if (class25.field537 != 0) {
            try {
                Graphics var8 = class228.field3834.getGraphics();
                class221.field3725.method455(0, -117, var8, 0);
                for (int var9 = 0; var9 < class60.field1094; var9++) {
                    class208.field3458[var9] = false;
                }
            } catch (Exception var12) {
                class228.field3834.repaint();
            }
        }
        if (class248.field4312) {
            method625((byte) 29);
        }
        if (class206.field3414 != null && class90.field1717 != 0) {
            Point var10 = class228.field3834.getLocationOnScreen();
            Dimension var11 = class228.field3834.getSize();
            class206.field3414.set_position(var10.x, var10.y - class90.field1717, var11.width, class90.field1717);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private static final void method621(int arg0, int arg1) {
        class254.field4393 = -1;
        class222.field3744 = arg0;
        if (arg1 != 2) {
            main((String[]) null);
        }
        field1531++;
        class254.field4393 = -1;
        class125.method899(arg1 ^ 0xFFFFFFFD);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIII)V")
    public static final void method622(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field1535 = 0;
        }
        if (arg2 < arg0) {
            for (int var5 = arg2; var5 < arg0; var5++) {
                class177.field2963[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; var6++) {
                class177.field2963[var6][arg4] = arg1;
            }
        }
        field1517++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method623(int arg0, int arg1) {
        class8.field114 = 0;
        class243.field4195++;
        class37.field719 = null;
        class207.field3445 = null;
        field1512++;
        if (class82.field1479 == class15.field344) {
            class15.field344 = class249.field4319;
        } else {
            class15.field344 = class82.field1479;
        }
        if (arg0 <= class243.field4195 && (arg1 == 7 || arg1 == 9)) {
            if (class25.field537 == 0 || class25.field537 == 5) {
                this.method835("js5connect_full", false);
                class25.field537 = 1000;
            } else {
                class70.field1354 = 3000;
            }
        } else if (class243.field4195 >= 2 && arg1 == 6) {
            this.method835("js5connect_outofdate", false);
            class25.field537 = 1000;
        } else if (class243.field4195 >= 4) {
            if (class25.field537 == 0 || class25.field537 == 5) {
                this.method835("js5connect", false);
                class25.field537 = 1000;
            } else {
                class70.field1354 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lce;)Z")
    public static final boolean method624(class10 arg0) {
        if (class126.field2206) {
            if (method605(arg0) != 0) {
                return false;
            }
            if (arg0.field227 == 0) {
                return false;
            }
        }
        return arg0.field268;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private static final void method625(byte arg0) {
        field1527++;
        class70.method534(120, 5);
        class64.method500(5, 109);
        class209.method1399(true, 5);
        class207.method1391(0, 5);
        class8.method51((byte) -127, 5);
        class97.method732(arg0 - 144, 5);
        class132.method931(false, 5);
        class37.method299((byte) -92, 5);
        if (arg0 != 29) {
            field1534 = null;
        }
        class103.method782(5, false);
        class184.method1247(5, -9574);
        class245.method1671(5, 2048);
        class89.method697(16494, 50);
        class245.method1675(arg0 - 92, 5);
        class162.method1133(5, (byte) -100);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1518++;
        if (!this.method838(124)) {
            return;
        }
        class14.field332 = Integer.parseInt(this.getParameter("worldid"));
        class57.field1025 = Integer.parseInt(this.getParameter("modewhat"));
        class40.field737 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class178.field2980 = true;
        } else {
            class178.field2980 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class151.field2628 = true;
        } else {
            class151.field2628 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class52.method422((byte) -72);
            class44.field804 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class57.field1037 = 1;
        } else {
            class57.field1037 = 0;
        }
        try {
            class219.field3661 = Integer.parseInt(this.getParameter("js"));
            class36.field686 = Integer.parseInt(this.getParameter("plug"));
            class89.field1693 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var10) {
        }
        class144.field2505 = class46.field842.method369(true, this);
        if (class144.field2505 == null) {
            class144.field2505 = class245.field4271;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class50 var7 = class2.method7(0, var6.length, -15075, var6);
            boolean var8 = class39.method304((byte) 93, var7);
            if (var8) {
                class255.field4397 = var7;
            }
        }
        class176.field2950 = this.getCodeBase().getHost();
        this.method836(765, class57.field1025 + 32, 503, 505, -4);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method626(int arg0) {
        field1528++;
        if (class130.field2289 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class104.method785(-1);
            if (class233.field3907 == 0L) {
                class233.field3907 = var4;
            }
            if (var3 > 16384 && var4 - class233.field3907 < 5000L) {
                if (var4 - class127.field2226 > 1000L) {
                    System.gc();
                    class127.field2226 = var4;
                }
                class58.field1046 = 5;
                class59.field1049 = class255.field4410;
            } else {
                class58.field1046 = 5;
                class59.field1049 = class175.field2936;
                class130.field2289 = 10;
            }
        } else if (class130.field2289 == 10) {
            class27.method250(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class45.field826[var6] = new class44(104, 104);
            }
            class59.field1049 = class75.field1416;
            class130.field2289 = 30;
            class58.field1046 = 10;
        } else if (class130.field2289 == 30) {
            class10.field179 = class134.method939(true, 0, true, false, true);
            class219.field3653 = class134.method939(true, 1, true, false, true);
            class48.field865 = class134.method939(true, 2, true, true, false);
            class71.field1365 = class134.method939(true, 3, true, false, true);
            class124.field2181 = class134.method939(true, 4, true, false, true);
            class142.field2495 = class134.method939(true, 5, true, true, true);
            class56.field1014 = class134.method939(true, 6, false, true, true);
            class97.field1809 = class134.method939(true, 7, true, false, true);
            class24.field530 = class134.method939(true, 8, true, false, true);
            class6.field74 = class134.method939(true, 9, true, false, true);
            class140.field2451 = class134.method939(true, 10, true, false, true);
            class66.field1264 = class134.method939(true, 11, true, false, true);
            class245.field4265 = class134.method939(true, 12, true, false, true);
            class87.field1675 = class134.method939(true, 13, true, false, true);
            class82.field1476 = class134.method939(true, 14, false, false, true);
            class219.field3659 = class134.method939(true, 15, true, false, true);
            class102.field1877 = class134.method939(true, 16, true, false, true);
            class137.field2375 = class134.method939(true, 17, true, false, true);
            class46.field838 = class134.method939(true, 18, true, false, true);
            class245.field4281 = class134.method939(true, 19, true, false, true);
            class118.field2081 = class134.method939(true, 20, true, false, true);
            class195.field3238 = class134.method939(true, 21, true, false, true);
            class177.field2967 = class134.method939(true, 22, true, false, true);
            class37.field715 = class134.method939(true, 23, true, true, true);
            class27.field585 = class134.method939(true, 24, true, false, true);
            class10.field293 = class134.method939(true, 25, true, false, true);
            class20.field417 = class134.method939(true, 26, true, true, true);
            class59.field1049 = class100.field1836;
            class130.field2289 = 40;
            class58.field1046 = 15;
        } else if (class130.field2289 == 40) {
            byte var7 = 0;
            int var8 = var7 + class10.field179.method159((byte) -27) * 4 / 100;
            int var9 = var8 + class219.field3653.method159((byte) -27) * 4 / 100;
            int var10 = var9 + class48.field865.method159((byte) -27) / 100;
            int var11 = var10 + class71.field1365.method159((byte) -27) * 2 / 100;
            int var12 = var11 + class124.field2181.method159((byte) -27) * 6 / 100;
            int var13 = var12 + class142.field2495.method159((byte) -27) * 4 / 100;
            int var14 = var13 + class56.field1014.method159((byte) -27) * 2 / 100;
            int var15 = var14 + class97.field1809.method159((byte) -27) * 50 / 100;
            int var16 = var15 + class24.field530.method159((byte) -27) * 2 / 100;
            int var17 = var16 + class6.field74.method159((byte) -27) * 2 / 100;
            int var18 = var17 + class140.field2451.method159((byte) -27) * 2 / 100;
            int var19 = var18 + class66.field1264.method159((byte) -27) * 2 / 100;
            int var20 = var19 + class245.field4265.method159((byte) -27) * 2 / 100;
            int var21 = var20 + class87.field1675.method159((byte) -27) * 2 / 100;
            int var22 = var21 + class82.field1476.method159((byte) -27) * 2 / 100;
            int var23 = var22 + class219.field3659.method159((byte) -27) * 2 / 100;
            int var24 = var23 + class102.field1877.method159((byte) -27) / 100;
            int var25 = var24 + class137.field2375.method159((byte) -27) / 100;
            int var26 = var25 + class46.field838.method159((byte) -27) / 100;
            int var27 = var26 + class245.field4281.method159((byte) -27) / 100;
            int var28 = var27 + class118.field2081.method159((byte) -27) / 100;
            int var29 = var28 + class195.field3238.method159((byte) -27) / 100;
            int var30 = var29 + class177.field2967.method159((byte) -27) / 100;
            int var31 = var30 + class37.field715.method159((byte) -27) / 100;
            int var32 = var31 + class27.field585.method159((byte) -27) / 100;
            int var33 = var32 + class10.field293.method159((byte) -27) / 100;
            int var34 = var33 + class20.field417.method159((byte) -27) / 100;
            if (var34 == 100) {
                class58.field1046 = 20;
                class59.field1049 = class204.field3389;
                class191.method1297(class24.field530, 0);
                class47.method352((byte) -78, class24.field530);
                class195.method1316(class24.field530, (byte) -125);
                class14.method106(1, class24.field530);
                class130.field2289 = 45;
            } else {
                if (var34 != 0) {
                    class59.field1049 = class80.method589(new class50[] { class162.field2774, class78.method579(var34, -26225), class100.field1856 }, 28743);
                }
                class58.field1046 = 20;
            }
        } else {
            if (arg0 <= 31) {
                this.method623(-56, 30);
            }
            if (class130.field2289 == 45) {
                class5.method34(22050, -24096, class5.field68, 2);
                class148.field2545 = new class84();
                class148.field2545.method638(false, 9, 128);
                class219.field3664 = class119.method865(class228.field3834, 22050, 0, class186.field3058, (byte) 82);
                class219.field3664.method603(class148.field2545, (byte) 47);
                class162.method1135(class82.field1476, class148.field2545, class124.field2181, 9240, class219.field3659);
                class133.field2330 = class119.method865(class228.field3834, 2048, 1, class186.field3058, (byte) 83);
                class174.field2907 = new class11();
                class133.field2330.method603(class174.field2907, (byte) 47);
                class166.field2818 = new class18(22050, class160.field2755);
                class25.field541 = class56.field1014.method186(40, class64.field1226);
                class130.field2289 = 50;
                class59.field1049 = class193.field3199;
                class58.field1046 = 30;
            } else if (class130.field2289 == 50) {
                int var35 = class140.method974(class87.field1675, false, class24.field530);
                int var36 = class104.method786((byte) -122);
                if (var35 < var36) {
                    class59.field1049 = class80.method589(new class50[] { class191.field3165, class78.method579(var35 * 100 / var36, -26225), class100.field1856 }, 28743);
                    class58.field1046 = 35;
                } else {
                    class130.field2289 = 60;
                    class59.field1049 = class256.field4434;
                    class58.field1046 = 35;
                }
            } else if (class130.field2289 == 60) {
                int var37 = class19.method142(class24.field530, -118);
                int var38 = class68.method522(122);
                if (var37 < var38) {
                    class59.field1049 = class80.method589(new class50[] { class142.field2491, class78.method579(var37 * 100 / var38, -26225), class100.field1856 }, 28743);
                    class58.field1046 = 40;
                } else {
                    class130.field2289 = 65;
                    class59.field1049 = class2.field35;
                    class58.field1046 = 40;
                }
            } else if (class130.field2289 == 65) {
                class243.method1660(class87.field1675, class24.field530, false);
                class59.field1049 = class173.field2890;
                class58.field1046 = 45;
                class120.method868(69, 5);
                class130.field2289 = 70;
            } else if (class130.field2289 == 70) {
                byte var39 = 0;
                class48.field865.method176(-111);
                int var40 = var39 + class48.field865.method189((byte) -127);
                class102.field1877.method176(-114);
                int var41 = var40 + class102.field1877.method189((byte) 13);
                class137.field2375.method176(-114);
                int var42 = var41 + class137.field2375.method189((byte) 126);
                class46.field838.method176(-123);
                int var43 = var42 + class46.field838.method189((byte) -40);
                class245.field4281.method176(-24);
                int var44 = var43 + class245.field4281.method189((byte) -55);
                class118.field2081.method176(-96);
                int var45 = var44 + class118.field2081.method189((byte) -116);
                class195.field3238.method176(-40);
                int var46 = var45 + class195.field3238.method189((byte) -70);
                class177.field2967.method176(-121);
                int var47 = var46 + class177.field2967.method189((byte) -52);
                class27.field585.method176(-92);
                int var48 = var47 + class27.field585.method189((byte) 127);
                class10.field293.method176(-27);
                int var49 = var48 + class10.field293.method189((byte) 124);
                if (var49 < 1000) {
                    class59.field1049 = class80.method589(new class50[] { class17.field383, class78.method579(var49 / 10, -26225), class100.field1856 }, 28743);
                    class58.field1046 = 50;
                } else {
                    class87.method694(class48.field865, 2047);
                    class140.method977(class48.field865, (byte) 88);
                    class159.method1122(class48.field865, -81);
                    class15.method113(class48.field865, class97.field1809, false);
                    class167.method1152(170691052, class97.field1809, class151.field2628, class102.field1877);
                    class117.method843(class46.field838, class97.field1809, -2);
                    class183.method1240((byte) 100, class97.field1809, class245.field4281, class233.field3921, class151.field2628);
                    class157.method1096(256, class48.field865);
                    class199.method1330(class219.field3653, class10.field179, class118.field2081, (byte) -96);
                    class163.method1139(class195.field3238, (byte) 21, class97.field1809);
                    class191.method1287((byte) 23, class177.field2967);
                    class186.method1253(class48.field865, (byte) 2);
                    class122.method887(class71.field1365, 49, class87.field1675, class97.field1809, class24.field530);
                    class116.method839((byte) -107, class48.field865);
                    class192.method1303(48, class137.field2375);
                    class250.method1699(true, new class19(), class10.field293, class27.field585);
                    class167.method1149(class10.field293, class27.field585, (byte) -86);
                    class59.field1049 = class188.field3111;
                    class58.field1046 = 50;
                    class162.method1132((byte) -127);
                    class130.field2289 = 80;
                }
            } else if (class130.field2289 == 80) {
                int var50 = class140.method982(31666, class24.field530);
                int var51 = class7.method45((byte) 73);
                if (var51 > var50) {
                    class59.field1049 = class80.method589(new class50[] { class232.field3897, class78.method579(var50 * 100 / var51, -26225), class100.field1856 }, 28743);
                    class58.field1046 = 60;
                } else {
                    class103.method781(class24.field530, 97);
                    class130.field2289 = 90;
                    class58.field1046 = 60;
                    class59.field1049 = class191.field3161;
                }
            } else if (class130.field2289 == 90) {
                if (class20.field417.method176(-93)) {
                    class220 var52 = new class220(class6.field74, class20.field417, class24.field530, 20, !class21.field459);
                    class13.method91(var52);
                    if (class99.field1828 == 1) {
                        class13.method92(0.9F);
                    }
                    if (class99.field1828 == 2) {
                        class13.method92(0.8F);
                    }
                    if (class99.field1828 == 3) {
                        class13.method92(0.7F);
                    }
                    if (class99.field1828 == 4) {
                        class13.method92(0.6F);
                    }
                    class58.field1046 = 70;
                    class130.field2289 = 100;
                    class59.field1049 = class130.field2288;
                } else {
                    class59.field1049 = class80.method589(new class50[] { class173.field2902, class78.method579(class20.field417.method189((byte) 24), -26225), class100.field1856 }, 28743);
                    class58.field1046 = 70;
                }
            } else if (class130.field2289 == 100) {
                if (class252.method1711(class24.field530, 22389)) {
                    class130.field2289 = 110;
                }
            } else if (class130.field2289 == 110) {
                class238.field4045 = new class224();
                class186.field3058.method956(class238.field4045, (byte) -125, 10);
                class58.field1046 = 75;
                class59.field1049 = class170.field2840;
                class130.field2289 = 120;
            } else if (class130.field2289 == 120) {
                if (class140.field2451.method172(1, class60.field1113, class245.field4271)) {
                    class183 var53 = new class183(class140.field2451.method181(class60.field1113, -123, class245.field4271));
                    class99.method756(var53, (byte) 125);
                    class58.field1046 = 80;
                    class130.field2289 = 130;
                    class59.field1049 = class136.field2365;
                } else {
                    class59.field1049 = class80.method589(new class50[] { class54.field973, class36.field693 }, 28743);
                    class58.field1046 = 80;
                }
            } else if (class130.field2289 == 130) {
                if (!class71.field1365.method176(-61)) {
                    class59.field1049 = class80.method589(new class50[] { class2.field32, class78.method579(class71.field1365.method189((byte) -110) * 4 / 5, -26225), class100.field1856 }, 28743);
                    class58.field1046 = 85;
                } else if (!class245.field4265.method176(-67)) {
                    class59.field1049 = class80.method589(new class50[] { class2.field32, class78.method579((class245.field4265.method189((byte) -87) / 6) + 80, -26225), class100.field1856 }, 28743);
                    class58.field1046 = 85;
                } else if (class87.field1675.method176(-30)) {
                    class130.field2289 = 140;
                    class59.field1049 = class241.field4153;
                    class58.field1046 = 100;
                } else {
                    class59.field1049 = class80.method589(new class50[] { class2.field32, class78.method579((class87.field1675.method189((byte) -73) / 20) + 96, -26225), class100.field1856 }, 28743);
                    class58.field1046 = 85;
                }
            } else if (class130.field2289 == 140) {
                class233.field3911 = class71.field1365.method186(61, class21.field435);
                class142.field2495.method165((byte) 106, true, false);
                class56.field1014.method165((byte) 117, true, true);
                class24.field530.method165((byte) -123, true, true);
                class87.field1675.method165((byte) 119, true, true);
                class140.field2451.method165((byte) 120, true, true);
                class71.field1365.method165((byte) 127, true, true);
                class248.field4312 = true;
                class231.method1577((byte) 3);
            }
        }
    }
}
