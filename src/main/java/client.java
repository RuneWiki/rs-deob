import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class13 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field693 = 0;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Loc;")
    public static class151 field698 = class137.method873(2, "Fallen lassen");

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Lwa;")
    public static class229 field686 = new class229(new byte[5000]);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lv;")
    public static class218 field699 = new class218();

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Loc;")
    public static class151 field701 = class137.method873(2, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lkh;")
    public static class116 field700;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lsd;")
    public static class192 field702;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[S")
    public static short[] field695;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method244(int arg0, byte arg1) {
        field687++;
        class109.field1919 = null;
        if (class36.field745 == class206.field3657) {
            class36.field745 = class203.field3606;
        } else {
            class36.field745 = class206.field3657;
        }
        class32.field655 = 0;
        if (arg1 >= -106) {
            this.method104(-7);
        }
        class171.field3106++;
        class232.field4272 = null;
        if (class171.field3106 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class200.field3534 > 5) {
                class123.field2201 = 3000;
            } else {
                this.method103(4, "js5connect_full");
                class200.field3534 = 1000;
            }
        } else if (class171.field3106 >= 2 && arg0 == 6) {
            this.method103(4, "js5connect_outofdate");
            class200.field3534 = 1000;
        } else if (class171.field3106 >= 4) {
            if (class200.field3534 > 5) {
                class123.field2201 = 3000;
            } else {
                this.method103(4, "js5connect");
                class200.field3534 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field692++;
        try {
            if (arg0.length != 7) {
                class120.method732(false);
            }
            class13.field296 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class115.field2052 = 0;
            } else if (arg0[1].equals("office")) {
                class115.field2052 = 1;
            } else if (arg0[1].equals("local")) {
                class115.field2052 = 2;
            } else {
                class120.method732(false);
            }
            if (arg0[2].equals("live")) {
                class146.field2607 = 0;
            } else if (arg0[2].equals("rc")) {
                class146.field2607 = 1;
            } else if (arg0[2].equals("wip")) {
                class146.field2607 = 2;
            } else {
                class120.method732(false);
            }
            if (arg0[3].equals("lowmem")) {
                class1.method15(-2);
            } else if (arg0[3].equals("highmem")) {
                class26.method207(4096);
            } else {
                class120.method732(false);
            }
            if (arg0[4].equals("free")) {
                class15.field347 = false;
            } else if (arg0[4].equals("members")) {
                class15.field347 = true;
            } else {
                class120.method732(false);
            }
            if (arg0[5].equals("english")) {
                class123.field2212 = 0;
            } else if (arg0[5].equals("german")) {
                class204.method1295((byte) 44);
                class123.field2212 = 1;
            } else {
                class120.method732(false);
            }
            if (arg0[6].equals("game0")) {
                class71.field1385 = 0;
            } else if (arg0[6].equals("game1")) {
                class71.field1385 = 1;
            } else {
                class120.method732(false);
            }
            class191.field3373 = "127.0.0.1";
            class175.field3175 = 0;
            class215.field3767 = class134.field2441;
            client var1 = new client();
            var1.method100(1, 503, 493, 24, class146.field2607 + 32, "runescape", 765);
            class189.field3348.setLocation(40, 40);
        } catch (Exception var3) {
            class123.method746(var3, null, -12134);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method245(boolean arg0) {
        if (arg0) {
            method246(-33, (byte) 59, null, null);
        }
        field683++;
        if (class71.field1380 >= 4) {
            this.method103(4, "js5crc");
            class200.field3534 = 1000;
            return;
        }
        if (class215.field3766 >= 4) {
            if (class200.field3534 <= 5) {
                this.method103(4, "js5io");
                class200.field3534 = 1000;
                return;
            }
            class215.field3766 = 3;
            class123.field2201 = 3000;
        }
        if (class123.field2201-- > 0) {
            return;
        }
        try {
            if (class32.field655 == 0) {
                class109.field1919 = class174.field3151.method258(class36.field745, class191.field3373, (byte) -51);
                class32.field655++;
            }
            if (class32.field655 == 1) {
                if (class109.field1919.field1501 == 2) {
                    this.method244(-1, (byte) -114);
                    return;
                }
                if (class109.field1919.field1501 == 1) {
                    class32.field655++;
                }
            }
            if (class32.field655 == 2) {
                class232.field4272 = new class47((Socket) class109.field1919.field1503, class174.field3151);
                class229 var2 = new class229(5);
                var2.method1447(-1, 15);
                var2.method1461(493, (byte) 76);
                class232.field4272.method331(12, 5, var2.field4087, 0);
                class32.field655++;
                class82.field1562 = class217.method1351(-78);
            }
            if (class32.field655 == 3) {
                if (class200.field3534 <= 5 || class232.field4272.method337(true) > 0) {
                    int var3 = class232.field4272.method339((byte) 125);
                    if (var3 != 0) {
                        this.method244(var3, (byte) -119);
                        return;
                    }
                    class32.field655++;
                } else if (class217.method1351(102) - class82.field1562 > 30000L) {
                    this.method244(-2, (byte) -125);
                    return;
                }
            }
            if (class32.field655 == 4) {
                class79.method510(0, class200.field3534 > 20, class232.field4272);
                class232.field4272 = null;
                class32.field655 = 0;
                class109.field1919 = null;
                class171.field3106 = 0;
            }
        } catch (IOException var4) {
            this.method244(-3, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method104(int arg0) {
        if (arg0 != 45) {
            this.method106(true);
        }
        class206.field3657 = class115.field2052 == 0 ? 43594 : class13.field296 + 40000;
        field689++;
        class203.field3606 = class115.field2052 == 0 ? 443 : class13.field296 + 50000;
        if (class71.field1385 == 1) {
            class28.field595 = class128.field2303;
            class26.field562 = class200.field3539;
            class146.field2612 = class124.field2240;
            class192.field3393 = class185.field3314;
        } else {
            class28.field595 = class224.field3912;
            class146.field2612 = class33.field665;
            class192.field3393 = class138.field2518;
            class26.field562 = class32.field663;
        }
        class36.field745 = class206.field3657;
        class36.method271(arg0 ^ 0x14);
        class39.method286(class39.field798, (byte) -74);
        class187.method1161(class39.field798, -9877);
        class103.field1863 = class81.method518(106);
        if (class103.field1863 != null) {
            class103.field1863.method386(-28698, class39.field798);
        }
        class166.field3035 = class35.field721;
        try {
            if (class174.field3151.field714 != null) {
                class232.field4277 = new class166(class174.field3151.field714, 5200, 0);
                for (int var2 = 0; var2 < 24; var2++) {
                    class79.field1529[var2] = new class166(class174.field3151.field712[var2], 6000, 0);
                }
                class50.field1011 = new class166(class174.field3151.field709, 6000, 0);
                class166.field3033 = new class69(255, class232.field4277, class50.field1011, 500000);
                class42.field864 = new class166(class174.field3151.field725, 24, 0);
                class174.field3151.field725 = null;
                class174.field3151.field709 = null;
                class174.field3151.field714 = null;
                class174.field3151.field712 = null;
            }
        } catch (IOException var3) {
            class42.field864 = null;
            class166.field3033 = null;
            class232.field4277 = null;
            class50.field1011 = null;
        }
        if (class115.field2052 != 0) {
            class196.field3482 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method108(byte arg0) {
        method249(false);
        field691++;
        class151.method986((byte) 70);
        class13.method113(-7425);
        class164.method1057(106);
        class193.method1214(-26457);
        class149.method944((byte) 125);
        class109.method656(0);
        class229.method1464((byte) 72);
        class47.method332(false);
        class142.method910(0);
        class166.method1079(0);
        class69.method469(false);
        class203.method1287(11356);
        class108.method643((byte) 78);
        class138.method878(-128);
        class232.method1516(-31774);
        class20.method176(false);
        class218.method1362(-18219);
        class236.method1533(-91);
        class58.method387(-599906324);
        class91.method581((byte) 111);
        class21.method181(46);
        class165.method1065((byte) 127);
        class99.method607(-6864);
        class43.method303(0);
        class115.method695((byte) -87);
        class228.method1432(-128);
        class212.method1326((byte) 56);
        class67.method442(false);
        class147.method936(122);
        class106.method638((byte) -122);
        class197.method1239(83);
        class95.method602(false);
        class156.method1023(0);
        class31.method232(-64);
        class187.method1159((byte) 102);
        class39.method288(7);
        class72.method475((byte) 125);
        class124.method751(121);
        class168.method1088((byte) 100);
        class235.method1530(47);
        class4.method30((byte) -89);
        class23.method191(0);
        class213.method1332((byte) -9);
        class73.method480((byte) 127);
        class225.method1416(96);
        class173.method1107();
        class140.method903(122);
        class45.method323(true);
        class123.method742(96);
        class101.method619(120);
        class217.method1349((byte) -81);
        class78.method503(-91);
        class169.method1093(true);
        class192.method1201((byte) 73);
        class129.method789((byte) -128);
        class116.method705((byte) 124);
        class174.method1108(2);
        class182.method1142(-25521);
        class5.method33(true);
        class63.method425(-7907);
        class209.method1305(217);
        class163.method1055(-107);
        class46.method326(false);
        class188.method1165(-1);
        class65.method433((byte) 97);
        class205.method1299(false);
        class94.method600(false);
        class93.method593((byte) -46);
        class61.method416();
        class221.method1383();
        class178.method1131(true);
        class230.method1497();
        class146.method929(false);
        class118.method721((byte) -77);
        class177.method1126(-24586);
        class74.method485((byte) 80);
        class211.method1316(0);
        class33.method239(0);
        class2.method26((byte) 71);
        class10.method64();
        class159.method1038((byte) 103);
        class12.method89(0);
        class76.method495();
        class195.method1223(127);
        class52.method358((byte) 87);
        class152.method1006(106);
        class36.method270((byte) 59);
        class175.method1114((byte) 53);
        class55.method378((byte) -116);
        class223.method1398(36);
        class37.method278(-16);
        class201.method1268();
        class68.method460(103);
        class25.method202(119);
        class162.method1052((byte) 20);
        class157.method1029(117);
        class104.method633(11703);
        class154.method1011(31);
        class110.method660(11023);
        class219.method1369(-2);
        class214.method1337();
        class22.method188(127);
        class16.method134(80);
        class120.method726(65535);
        class215.method1345(-34);
        class224.method1410(-6882);
        class194.method1220(-62);
        class227.method1423((byte) 103);
        class161.method1046(false);
        int var2 = 123 % ((arg0 - 56) / 52);
        class100.method615();
        class11.method82(10852);
        class112.method678(28920);
        class160.method1040((byte) -118);
        class170.method1097(-110);
        class180.method1139(true);
        class15.method125(29423);
        class132.method817((byte) 103);
        class107.method641((byte) 122);
        class79.method508((byte) -34);
        class139.method900(100);
        class64.method430(64);
        class66.method438(152227622);
        class44.method318(91);
        class83.method528(119);
        class102.method624(4712);
        class27.method210(32);
        class75.method487((byte) -118);
        class6.method40();
        class172.method1101();
        class32.method237((byte) -117);
        class119.method723();
        class126.method760(true);
        class220.method1370(97);
        class17.method146();
        class40.method289(2);
        class185.method1151(7054);
        class233.method1525((byte) 123);
        class127.method766();
        class88.method563();
        class231.method1508((byte) -104);
        class41.method294(9366);
        class1.method5(1);
        class19.method168(false);
        class144.method921(-11234);
        class130.method812((byte) 124);
        class90.method576(4134);
        class191.method1184(true);
        class54.method368(29392);
        class14.method123(0);
        class134.method824(-97);
        class208.method1302(85);
        class200.method1250(false);
        class153.method1008((byte) 42);
        class103.method627(28440);
        class89.method571(true);
        class26.method204((byte) -17);
        class148.method943(78);
        class176.method1123(15150);
        class155.method1019(118);
        class92.method582((byte) 117);
        class189.method1170(false);
        class111.method673(126);
        class59.method394(32215);
        class9.method51(128);
        class196.method1230(true);
        class56.method382(941700452);
        class51.method355((byte) -24);
        class57.method385(59);
        class48.method347(false);
        class237.method1544((byte) -124);
        class121.method733((byte) -117);
        class150.method950((byte) 35);
        class114.method686((byte) -59);
        class7.method46((byte) -102);
        class222.method1396(0);
        class28.method215(-18572);
        class190.method1178((byte) -30);
        class81.method516(false);
        class53.method363(-1);
        class179.method1137(-13392024);
        class113.method681(27);
        class137.method875(26581);
        class204.method1294(74);
        class50.method351((byte) 105);
        class71.method472(-91);
        class141.method906(114);
        class206.method1301(0);
        class167.method1085(-98);
        class42.method300(9813);
        class202.method1284(3469);
        class210.method1308(72);
        class158.method1036((byte) -96);
        class128.method774(-100);
        class216.method1347(13820);
        class122.method737(-4097);
        class117.method712((byte) 72);
        class85.method557((byte) 12);
        class226.method1418(false);
        class82.method520(false);
        class181.method1141(-103);
        class38.method283(true);
        class131.method816((byte) 109);
        class8.method49(8454);
        class29.method221(104);
        if (class13.field313) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method105(int arg0) {
        field697++;
        if (class39.field793 != null) {
            class39.field793.field2667 = false;
        }
        class39.field793 = null;
        if (class142.field2588 != null) {
            class142.field2588.method336(arg0 - 17289);
            class142.field2588 = null;
        }
        class103.method628(class39.field798, (byte) 93);
        class28.method213((byte) -58, class39.field798);
        if (class103.field1863 != null) {
            class103.field1863.method388(class39.field798, (byte) 114);
        }
        class43.method307(arg0 ^ 0x3FFFEFAE);
        if (arg0 != 4177) {
            return;
        }
        class152.method1002(1);
        class103.field1863 = null;
        if (class64.field1251 != null) {
            class64.field1251.method1067(0);
        }
        if (class137.field2498 != null) {
            class137.field2498.method1067(0);
        }
        class48.method341((byte) 102);
        class50.method353(1);
        try {
            if (class232.field4277 != null) {
                class232.field4277.method1082((byte) -33);
            }
            if (class79.field1529 != null) {
                for (int var2 = 0; var2 < class79.field1529.length; var2++) {
                    if (class79.field1529[var2] != null) {
                        class79.field1529[var2].method1082((byte) 125);
                    }
                }
            }
            if (class50.field1011 != null) {
                class50.field1011.method1082((byte) -21);
            }
            if (class42.field864 != null) {
                class42.field864.method1082((byte) 127);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLoc;Loc;)V")
    public static final void method246(int arg0, byte arg1, class151 arg2, class151 arg3) {
        field696++;
        class67.method448(-1, null, -1, arg0, arg3, arg2);
        if (arg1 >= -73) {
            method249(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method116(int arg0) {
        boolean var2 = class237.method1545((byte) 102);
        if (var2 && class149.field2669 && class64.field1251 != null) {
            class64.field1251.method1060(true);
        }
        field685++;
        boolean var3 = false;
        if (class200.field3535) {
            var3 = true;
            class200.field3535 = false;
        }
        if (class200.field3534 == 0) {
            class38.method285(var3, class160.field2894, null, (byte) -82, class123.field2209);
        } else if (class200.field3534 == 5 || class200.field3534 == 10 || class200.field3534 == 20) {
            class158.method1032(class147.field2643, class19.field403, -124);
        } else if (class200.field3534 == 25) {
            if (class92.field1685 == 1) {
                if (class234.field4314 < class209.field3673) {
                    class234.field4314 = class209.field3673;
                }
                int var5 = (class234.field4314 - class209.field3673) * 50 / class234.field4314;
                class192.method1207(class126.method761(new class151[] { class190.field3365, class235.field4356, class137.method874(var5, false), class72.field1391 }, 10260), false, 255);
            } else if (class92.field1685 == 2) {
                if (class91.field1671 > class181.field3280) {
                    class181.field3280 = class91.field1671;
                }
                int var4 = (class181.field3280 - class91.field1671) * 50 / class181.field3280 + 50;
                class192.method1207(class126.method761(new class151[] { class190.field3365, class235.field4356, class137.method874(var4, false), class72.field1391 }, arg0 + 10230), false, 255);
            } else {
                class192.method1207(class190.field3365, false, 255);
            }
        } else if (class200.field3534 == 30) {
            class50.method350(127);
        } else if (class200.field3534 == 40) {
            class192.method1207(class126.method761(new class151[] { class118.field2126, class5.field99, class114.field2024 }, 10260), false, 255);
        }
        if (arg0 != 30) {
            this.method247((byte) 78);
        }
        Canvas var6 = class39.field798;
        if (class200.field3534 == 30 && class169.field3081 == 0 && !var3) {
            try {
                Graphics var9 = var6.getGraphics();
                for (int var10 = 0; var10 < class147.field2628; var10++) {
                    if (class63.field1234[var10]) {
                        class215.field3764.method524(class192.field3407[var10], 0, class210.field3679[var10], class222.field3858[var10], var9, class121.field2176[var10]);
                        class63.field1234[var10] = false;
                    }
                }
            } catch (Exception var11) {
                var6.repaint();
            }
        } else if (class200.field3534 > 0) {
            try {
                Graphics var7 = var6.getGraphics();
                class215.field3764.method523(0, var7, 0, 0);
                for (int var8 = 0; var8 < class147.field2628; var8++) {
                    class63.field1234[var8] = false;
                }
            } catch (Exception var12) {
                var6.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method247(byte arg0) {
        if (arg0 != -114) {
            return;
        }
        field688++;
        if (class200.field3534 != 1000) {
            boolean var2 = class147.method937((byte) 120);
            if (!var2) {
                this.method245(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field690++;
        if (!this.method101((byte) 76)) {
            return;
        }
        class13.field296 = Integer.parseInt(this.getParameter("worldid"));
        class146.field2607 = Integer.parseInt(this.getParameter("modewhat"));
        class115.field2052 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class1.method15(-2);
        } else {
            class26.method207(4096);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class15.field347 = true;
        } else {
            class15.field347 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class204.method1295((byte) 44);
            class123.field2212 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class71.field1385 = 1;
        } else {
            class71.field1385 = 0;
        }
        try {
            class89.field1634 = Integer.parseInt(this.getParameter("js"));
            class159.field2869 = Integer.parseInt(this.getParameter("plug"));
            class175.field3175 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class215.field3767 = class170.field3099.method954(this, 0);
        if (class215.field3767 == null) {
            class215.field3767 = class134.field2441;
        }
        class191.field3373 = this.getCodeBase().getHost();
        this.method114(765, 493, 3, 503, class146.field2607 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method106(boolean arg0) {
        field694++;
        class200.field3541++;
        if (class200.field3541 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class48.field992 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class130.field2384.setSeed((long) class48.field992);
        }
        this.method247((byte) -114);
        class211.method1321((byte) 110);
        class175.method1117(78);
        class16.method131(-11903);
        class83.method525(arg0);
        class109.method658(-128);
        if (class103.field1863 != null) {
            int var3 = class103.field1863.method389(-14322);
            class11.field211 = var3;
        }
        if (class200.field3534 == 0) {
            this.method248(6);
            class5.method34(98);
        } else if (class200.field3534 == 5) {
            class153.method1009(321, this);
            this.method248(6);
            class5.method34(63);
        } else if (class200.field3534 == 10) {
            class153.method1009(321, this);
        } else if (class200.field3534 == 20) {
            class153.method1009(321, this);
            class171.method1100(8);
        } else if (class200.field3534 == 25) {
            class48.method344((byte) 98);
        }
        if (class200.field3534 == 30) {
            class115.method701(true);
        } else if (class200.field3534 == 40) {
            class171.method1100(8);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method248(int arg0) {
        field684++;
        if (class44.field907 == 0) {
            class93.method585(4, 104, 104, class104.field1872);
            for (int var2 = 0; var2 < 4; var2++) {
                class95.field1768[var2] = new class138(104, 104);
            }
            class216.field3775 = new class84(512, 512);
            class44.field907 = 20;
            class123.field2209 = 5;
            class160.field2894 = class197.field3512;
        } else if (class44.field907 == 20) {
            int[] var3 = new int[9];
            for (int var4 = 0; var4 < 9; var4++) {
                int var5 = var4 * 32 + 128 + 15;
                int var6 = var5 * 3 + 600;
                int var7 = class61.field1191[var5];
                var3[var4] = var6 * var7 >> 16;
            }
            class72.method476(var3, 500, 800, 512, 334, 25, 3500);
            class123.field2209 = 10;
            class44.field907 = 30;
            class160.field2894 = class146.field2608;
        } else if (class44.field907 == 30) {
            class155.field2810 = class212.method1330(true, false, arg0 ^ 0xF4246, true, 0);
            class228.field4023 = class212.method1330(true, false, 1000000, true, 1);
            class175.field3181 = class212.method1330(false, true, 1000000, true, 2);
            class178.field3224 = class212.method1330(true, false, 1000000, true, 3);
            class56.field1126 = class212.method1330(true, false, arg0 + 999994, true, 4);
            class140.field2548 = class212.method1330(true, true, arg0 + 999994, true, 5);
            class16.field363 = class212.method1330(true, true, 1000000, false, 6);
            class176.field3188 = class212.method1330(true, false, 1000000, true, 7);
            class164.field2960 = class212.method1330(true, false, arg0 + 999994, true, 8);
            class36.field738 = class212.method1330(false, true, 1000000, true, 9);
            class23.field521 = class212.method1330(true, false, arg0 + 999994, true, 10);
            class106.field1884 = class212.method1330(true, false, 1000000, true, 11);
            class222.field3853 = class212.method1330(true, false, arg0 ^ 0xF4246, true, 12);
            class36.field755 = class212.method1330(false, true, 1000000, true, 13);
            class200.field3540 = class212.method1330(true, false, 1000000, false, 14);
            class48.field993 = class212.method1330(true, false, 1000000, true, 15);
            class164.field2964 = class212.method1330(true, false, 1000000, true, 16);
            class91.field1661 = class212.method1330(true, false, 1000000, true, 17);
            class236.field4383 = class212.method1330(true, false, 1000000, true, 18);
            class91.field1668 = class212.method1330(true, false, 1000000, true, 19);
            class56.field1127 = class212.method1330(true, false, 1000000, true, 20);
            class37.field777 = class212.method1330(true, false, 1000000, true, 21);
            class40.field829 = class212.method1330(true, false, 1000000, true, 22);
            class58.field1164 = class212.method1330(true, true, arg0 + 999994, true, 23);
            class44.field907 = 40;
            class160.field2894 = class40.field843;
            class123.field2209 = 20;
        } else if (class44.field907 == 40) {
            byte var8 = 0;
            int var9 = var8 + class155.field2810.method918((byte) -126) * 4 / 100;
            int var10 = var9 + class228.field4023.method918((byte) -100) * 4 / 100;
            int var11 = var10 + class175.field3181.method918((byte) -127) / 100;
            int var12 = var11 + class178.field3224.method918((byte) -77) * 2 / 100;
            int var13 = var12 + class56.field1126.method918((byte) -124) * 6 / 100;
            int var14 = var13 + class140.field2548.method918((byte) -124) * 4 / 100;
            int var15 = var14 + class16.field363.method918((byte) -74) * 2 / 100;
            int var16 = var15 + class176.field3188.method918((byte) -102) * 53 / 100;
            int var17 = var16 + class164.field2960.method918((byte) -82) * 2 / 100;
            int var18 = var17 + class36.field738.method918((byte) -82) * 2 / 100;
            int var19 = var18 + class23.field521.method918((byte) -93) * 2 / 100;
            int var20 = var19 + class106.field1884.method918((byte) -102) * 2 / 100;
            int var21 = var20 + class222.field3853.method918((byte) -126) * 2 / 100;
            int var22 = var21 + class36.field755.method918((byte) -94) * 2 / 100;
            int var23 = var22 + class200.field3540.method918((byte) -83) * 2 / 100;
            int var24 = var23 + class48.field993.method918((byte) -109) * 2 / 100;
            int var25 = var24 + class164.field2964.method918((byte) -120) / 100;
            int var26 = var25 + class91.field1661.method918((byte) -110) / 100;
            int var27 = var26 + class236.field4383.method918((byte) -111) / 100;
            int var28 = var27 + class91.field1668.method918((byte) -108) / 100;
            int var29 = var28 + class56.field1127.method918((byte) -89) / 100;
            int var30 = var29 + class37.field777.method918((byte) -106) / 100;
            int var31 = var30 + class40.field829.method918((byte) -84) / 100;
            int var32 = var31 + class58.field1164.method918((byte) -115) / 100;
            if (var32 == 100) {
                class123.field2209 = 30;
                class160.field2894 = class167.field3044;
                class13.method102(arg0 + 82, class164.field2960, class16.field363, class23.field521);
                class44.field907 = 45;
            } else {
                if (var32 != 0) {
                    class160.field2894 = class126.method761(new class151[] { class27.field575, class137.method874(var32, false), class78.field1509 }, 10260);
                }
                class123.field2209 = 30;
            }
        } else if (class44.field907 == 45) {
            class141.method904(2, arg0 ^ 0x36758D, 22050, !class13.field300);
            class129 var33 = new class129();
            var33.method783((byte) 125, 128, 9);
            class64.field1251 = class40.method290(22050, 0, class39.field798, class174.field3151, (byte) 125);
            class64.field1251.method1068(arg0 ^ 0x6, var33);
            class206.method1300(class56.field1126, var33, class200.field3540, class48.field993, (byte) -104);
            class137.field2498 = class40.method290(2048, 1, class39.field798, class174.field3151, (byte) 123);
            class109.field1937 = new class125();
            class137.field2498.method1068(0, class109.field1937);
            class195.field3480 = new class99(22050, class204.field3624);
            class123.field2209 = 35;
            class44.field907 = 50;
            class160.field2894 = class215.field3768;
        } else if (class44.field907 == 50) {
            int var34 = 0;
            if (class147.field2643 == null) {
                class147.field2643 = class22.method190(class134.field2441, class36.field755, (byte) 42, class85.field1595, class164.field2960);
            } else {
                var34++;
            }
            if (class41.field860 == null) {
                class41.field860 = class147.field2643;
            } else {
                var34++;
            }
            if (class227.field3955 == null) {
                class227.field3955 = class22.method190(class134.field2441, class36.field755, (byte) 42, class228.field3992, class164.field2960);
            } else {
                var34++;
            }
            if (class19.field403 == null) {
                class19.field403 = class22.method190(class134.field2441, class36.field755, (byte) 42, class52.field1043, class164.field2960);
            } else {
                var34++;
            }
            if (var34 < 4) {
                class160.field2894 = class126.method761(new class151[] { class179.field3251, class137.method874(var34 * 100 / 4, false), class78.field1509 }, 10260);
                class123.field2209 = 40;
            } else {
                class160.field2894 = class121.field2181;
                class44.field907 = 60;
                class123.field2209 = 40;
            }
        } else if (class44.field907 == 60) {
            int var35 = class223.method1408(class23.field521, class164.field2960, false);
            int var36 = class95.method605(arg0 ^ 0x6);
            if (var36 > var35) {
                class160.field2894 = class126.method761(new class151[] { class45.field924, class137.method874(var35 * 100 / var36, false), class78.field1509 }, arg0 ^ 0x2812);
                class123.field2209 = 50;
            } else {
                class160.field2894 = class223.field3867;
                class123.field2209 = 50;
                class44.field907 = 65;
            }
        } else if (class44.field907 == 65) {
            class123.field2209 = 50;
            class160.field2894 = class42.field868;
            class137.method871(5, (byte) 122);
            class44.field907 = 70;
        } else {
            if (arg0 != 6) {
                field700 = null;
            }
            if (class44.field907 == 70) {
                class175.field3181.method1206(arg0 ^ 0x48B1);
                byte var37 = 0;
                int var38 = var37 + class175.field3181.method1189(arg0 ^ 0xFFFFECF7);
                class164.field2964.method1206(18615);
                int var39 = var38 + class164.field2964.method1189(-4879);
                class91.field1661.method1206(18615);
                int var40 = var39 + class91.field1661.method1189(-4879);
                class236.field4383.method1206(arg0 ^ 0x48B1);
                int var41 = var40 + class236.field4383.method1189(-4879);
                class91.field1668.method1206(18615);
                int var42 = var41 + class91.field1668.method1189(-4879);
                class56.field1127.method1206(18615);
                int var43 = var42 + class56.field1127.method1189(arg0 ^ 0xFFFFECF7);
                class37.field777.method1206(18615);
                int var44 = var43 + class37.field777.method1189(arg0 ^ 0xFFFFECF7);
                class40.field829.method1206(18615);
                int var45 = var44 + class40.field829.method1189(-4879);
                if (var45 < 800) {
                    class160.field2894 = class126.method761(new class151[] { class210.field3685, class137.method874(var45 / 8, false), class78.field1509 }, 10260);
                    class123.field2209 = 60;
                } else {
                    class21.method182((byte) -128, class175.field3181);
                    class124.method747(arg0 + 14344, class175.field3181);
                    class123.method743(class176.field3188, class175.field3181, 120);
                    class7.method42(-21297055, class176.field3188, class13.field300, class164.field2964);
                    class158.method1037(false, class176.field3188, class236.field4383);
                    class20.method175(class176.field3188, class15.field347, (byte) 22, class41.field860, class91.field1668);
                    class41.method295(class228.field4023, class56.field1127, class155.field2810, 255);
                    class160.method1042(class37.field777, (byte) 124, class176.field3188);
                    class16.method130(0, class40.field829);
                    class177.method1125(class175.field3181, (byte) 126);
                    class165.method1069(class178.field3224, class164.field2960, class176.field3188, (byte) 119, class36.field755);
                    class64.method428(class175.field3181, (byte) 102);
                    class138.method882(class91.field1661, false);
                    class23.method193(class175.field3181, -83);
                    class37.method279(class175.field3181, 127);
                    class160.field2894 = class55.field1119;
                    class123.field2209 = 60;
                    class47.method335(false);
                    class44.field907 = 80;
                }
            } else if (class44.field907 == 80) {
                int var46 = 0;
                if (class8.field131 == null) {
                    class8.field131 = class200.method1253(class164.field2960, class108.field1903, class134.field2441, 22464);
                } else {
                    var46++;
                }
                if (class123.field2195 == null) {
                    class123.field2195 = class95.method604(class134.field2441, 119, class219.field3816, class164.field2960);
                } else {
                    var46++;
                }
                if (class31.field642 == null) {
                    class31.field642 = class231.method1511(class134.field2441, (byte) 61, class68.field1347, class164.field2960);
                } else {
                    var46++;
                }
                if (class192.field3428 == null) {
                    class192.field3428 = class31.field642;
                } else {
                    var46++;
                }
                if (class112.field1968 == null) {
                    class112.field1968 = class231.method1511(class134.field2441, (byte) 61, class150.field2680, class164.field2960);
                } else {
                    var46++;
                }
                if (class131.field2404 == null) {
                    class131.field2404 = class231.method1511(class134.field2441, (byte) 61, class29.field619, class164.field2960);
                } else {
                    var46++;
                }
                if (class192.field3412 == null) {
                    class192.field3412 = class231.method1511(class134.field2441, (byte) 61, class202.field3598, class164.field2960);
                } else {
                    var46++;
                }
                if (class157.field2838 == null) {
                    class157.field2838 = class231.method1511(class134.field2441, (byte) 61, class37.field767, class164.field2960);
                } else {
                    var46++;
                }
                if (class110.field1944 == null) {
                    class110.field1944 = class231.method1511(class134.field2441, (byte) 61, class178.field3216, class164.field2960);
                } else {
                    var46++;
                }
                if (class224.field3910 == null) {
                    class224.field3910 = class231.method1511(class134.field2441, (byte) 61, class113.field2008, class164.field2960);
                } else {
                    var46++;
                }
                if (class227.field3962 == null) {
                    class227.field3962 = class200.method1253(class164.field2960, class197.field3526, class134.field2441, 22464);
                } else {
                    var46++;
                }
                if (class216.field3769 == null) {
                    class216.field3769 = class231.method1511(class134.field2441, (byte) 61, class129.field2371, class164.field2960);
                } else {
                    var46++;
                }
                if (class167.field3039 == null) {
                    class167.field3039 = class231.method1511(class134.field2441, (byte) 61, class180.field3266, class164.field2960);
                } else {
                    var46++;
                }
                if (class53.field1081 == null) {
                    class53.field1081 = class95.method604(class134.field2441, -101, class129.field2361, class164.field2960);
                } else {
                    var46++;
                }
                if (class160.field2882 == null) {
                    class160.field2882 = class95.method604(class134.field2441, 58, class82.field1561, class164.field2960);
                } else {
                    var46++;
                }
                var46++;
                if (var46 < 16) {
                    class160.field2894 = class126.method761(new class151[] { class55.field1116, class137.method874(var46 * 100 / 16, false), class78.field1509 }, 10260);
                    class123.field2209 = 70;
                } else {
                    class147.field2643.method1271(class160.field2882, null);
                    class227.field3955.method1271(class160.field2882, null);
                    class19.field403.method1271(class160.field2882, null);
                    if (class41.field860 != class147.field2643) {
                        class41.field860.method1271(class160.field2882, null);
                    }
                    for (int var47 = 0; var47 < class224.field3910.length; var47++) {
                        class224.field3910[var47].method538();
                    }
                    class8.field131.method538();
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 41.0D) - 20;
                    for (int var52 = 0; var52 < class31.field642.length; var52++) {
                        class31.field642[var52].method537(var48 + var51, var49 - -var51, var50 + var51);
                    }
                    class123.field2195[0].method224(var48 + var51, var49 + var51, var50 + var51);
                    class44.field907 = 90;
                    class160.field2894 = class11.field198;
                    class123.field2209 = 70;
                }
            } else if (class44.field907 == 90) {
                if (class36.field738.method1206(18615)) {
                    class68 var53 = new class68(class36.field738, class164.field2960, 20, class13.field300 ? 64 : 128);
                    class61.method401(var53);
                    class61.method406(0.7F);
                    class160.field2894 = class45.field944;
                    class123.field2209 = 90;
                    class44.field907 = 110;
                } else {
                    class160.field2894 = class126.method761(new class151[] { class72.field1417, class137.method874(class36.field738.method1189(arg0 ^ 0xFFFFECF7), false), class78.field1509 }, arg0 ^ 0x2812);
                    class123.field2209 = 90;
                }
            } else if (class44.field907 == 110) {
                class39.field793 = new class149();
                class174.field3151.method263(class39.field793, 10, false);
                class123.field2209 = 94;
                class160.field2894 = class104.field1868;
                class44.field907 = 120;
            } else if (class44.field907 == 120) {
                if (class23.field521.method1194((byte) 82, class212.field3736, class134.field2441)) {
                    class162 var54 = new class162(class23.field521.method1195(class134.field2441, 0, class212.field3736));
                    class134.method823(46, var54);
                    class123.field2209 = 96;
                    class160.field2894 = class27.field565;
                    class44.field907 = 130;
                } else {
                    class160.field2894 = class126.method761(new class151[] { class193.field3461, class168.field3066 }, arg0 + 10254);
                    class123.field2209 = 96;
                }
            } else if (class44.field907 == 130) {
                if (!class178.field3224.method1206(18615)) {
                    class160.field2894 = class126.method761(new class151[] { class179.field3239, class137.method874(class178.field3224.method1189(-4879) * 4 / 5, false), class78.field1509 }, 10260);
                    class123.field2209 = 100;
                } else if (!class222.field3853.method1206(18615)) {
                    class160.field2894 = class126.method761(new class151[] { class179.field3239, class137.method874(class222.field3853.method1189(-4879) / 6 + 80, false), class78.field1509 }, arg0 ^ 0x2812);
                    class123.field2209 = 100;
                } else if (class36.field755.method1206(18615)) {
                    class123.field2209 = 100;
                    class160.field2894 = class219.field3814;
                    class44.field907 = 140;
                } else {
                    class160.field2894 = class126.method761(new class151[] { class179.field3239, class137.method874(class36.field755.method1189(-4879) / 20 + 96, false), class78.field1509 }, 10260);
                    class123.field2209 = 100;
                }
            } else if (class44.field907 == 140) {
                class140.field2548.method1188(47, true, false);
                class16.field363.method1188(44, true, true);
                class164.field2960.method1188(arg0 ^ 0x78, true, true);
                class36.field755.method1188(59, true, true);
                class23.field521.method1188(arg0 + 120, true, true);
                class137.method871(10, (byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public static void method249(boolean arg0) {
        field698 = null;
        field699 = null;
        field695 = null;
        if (arg0) {
            field686 = null;
        }
        field700 = null;
        field701 = null;
        field686 = null;
        field702 = null;
    }
}
