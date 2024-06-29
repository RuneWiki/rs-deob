import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class208 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lqe;")
    public static class179 field700 = class206.method1380("Bitte versuchen Sie es in ", (byte) 50);

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lqe;")
    public static class179 field706 = class206.method1380(":chalreq:", (byte) 6);

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lqe;")
    public static class179 field707 = class206.method1380(" GMT", (byte) -126);

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method208(int arg0) {
        if (arg0 != 497) {
            this.init();
        }
        if (class199.field3702 != null) {
            class199.field3702.field1755 = false;
        }
        field694++;
        class199.field3702 = null;
        if (class199.field3714 != null) {
            class199.field3714.method303(arg0 ^ 0x1F0);
            class199.field3714 = null;
        }
        class54.method378(class81.field1571, (byte) 55);
        class127.method821(class81.field1571, false);
        if (class69.field1380 != null) {
            class69.field1380.method148(class81.field1571, arg0 ^ 0x1F0);
        }
        class222.method1440(false);
        class47.method318(false);
        class69.field1380 = null;
        if (class192.field3585 != null) {
            class192.field3585.method102(0);
        }
        if (class163.field2951 != null) {
            class163.field2951.method102(arg0 - 497);
        }
        class133.method850((byte) -24);
        class172.method1091(true);
        try {
            if (class185.field3434 != null) {
                class185.field3434.method967(false);
            }
            if (class141.field2579 != null) {
                for (int var2 = 0; var2 < class141.field2579.length; var2++) {
                    if (class141.field2579[var2] != null) {
                        class141.field2579[var2].method967(false);
                    }
                }
            }
            if (class109.field2030 != null) {
                class109.field2030.method967(false);
            }
            if (class171.field3066 != null) {
                class171.field3066.method967(false);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method209(int arg0) {
        field705++;
        if (class80.field1545 == 1000) {
            return;
        }
        if (arg0 != 30) {
            method213(121, 115);
        }
        boolean var2 = class205.method1376((byte) -126);
        if (!var2) {
            this.method219(arg0 ^ 0x306E);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method210(int arg0) {
        if (arg0 == -1001) {
            field700 = null;
            field707 = null;
            field706 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method211(int arg0, byte arg1) {
        class98.field1836 = null;
        class208.field3883 = null;
        field697++;
        if (class234.field4316 == class109.field2050) {
            class234.field4316 = class93.field1764;
        } else {
            class234.field4316 = class109.field2050;
        }
        class29.field642 = 0;
        class6.field175++;
        if (class6.field175 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class80.field1545 > 5) {
                class178.field3232 = 3000;
            } else {
                this.method1397("js5connect_full", 32000);
                class80.field1545 = 1000;
            }
        } else if (class6.field175 >= 2 && arg0 == 6) {
            this.method1397("js5connect_outofdate", arg1 ^ 0xFFFF82E2);
            class80.field1545 = 1000;
        } else if (class6.field175 >= 4) {
            if (class80.field1545 > 5) {
                class178.field3232 = 3000;
            } else {
                this.method1397("js5connect", 32000);
                class80.field1545 = 1000;
            }
        }
        if (arg1 != -30) {
            field700 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method212(int arg0) {
        field703++;
        class13.field322++;
        if (class13.field322 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class93.field1754 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class12.field312.setSeed((long) class93.field1754);
        }
        this.method209(30);
        class230.method1510(arg0 + 5069596);
        class109.method714(-26569);
        class218.method1422(3516);
        class130.method827(1);
        class109.method712(true);
        if (class69.field1380 != null) {
            int var3 = class69.field1380.method149(159);
            class30.field660 = var3;
        }
        if (class80.field1545 == 0) {
            this.method220(104);
            class132.method845(arg0 ^ 0xFFFFCABA);
        } else if (class80.field1545 == 5) {
            class39.method252(false, this);
            this.method220(-91);
            class132.method845(11693);
        } else if (class80.field1545 == 10) {
            class39.method252(false, this);
        } else if (class80.field1545 == 20) {
            class39.method252(false, this);
            class146.method942((byte) 72);
        } else if (class80.field1545 == 25) {
            class236.method1534(false);
        }
        if (arg0 != -6377) {
            method210(-118);
        }
        if (class80.field1545 == 30) {
            class46.method302((byte) -33);
        } else if (class80.field1545 == 40) {
            class146.method942((byte) 72);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I")
    public static final int method213(int arg0, int arg1) {
        field695++;
        if (arg1 != 255) {
            method213(-52, 116);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)I")
    public static final int method214(int arg0) {
        field709++;
        int var1 = -34 % ((arg0 - 24) / 39);
        int var2 = 3;
        if (class18.field480 < 310) {
            int var3 = class22.field538 >> 7;
            int var4 = class61.field1298.field3198 >> 7;
            int var5 = class61.field1298.field3159 >> 7;
            int var6 = class198.field3700 >> 7;
            int var7;
            if (var5 <= var3) {
                var7 = var3 - var5;
            } else {
                var7 = var5 - var3;
            }
            if ((class9.field265[class49.field1038][var3][var6] & 0x4) != 0) {
                var2 = class49.field1038;
            }
            int var8;
            if (var6 >= var4) {
                var8 = var6 - var4;
            } else {
                var8 = var4 - var6;
            }
            if (var8 < var7) {
                int var9 = var8 * 65536 / var7;
                int var10 = 32768;
                while (var3 != var5) {
                    if (var3 < var5) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((class9.field265[class49.field1038][var3][var6] & 0x4) != 0) {
                        var2 = class49.field1038;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 > var6) {
                            var6++;
                        } else if (var4 < var6) {
                            var6--;
                        }
                        if ((class9.field265[class49.field1038][var3][var6] & 0x4) != 0) {
                            var2 = class49.field1038;
                        }
                    }
                }
            } else {
                int var11 = var7 * 65536 / var8;
                int var12 = 32768;
                while (var4 != var6) {
                    var12 += var11;
                    if (var4 > var6) {
                        var6++;
                    } else if (var4 < var6) {
                        var6--;
                    }
                    if ((class9.field265[class49.field1038][var3][var6] & 0x4) != 0) {
                        var2 = class49.field1038;
                    }
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            var3++;
                        } else if (var3 > var5) {
                            var3--;
                        }
                        if ((class9.field265[class49.field1038][var3][var6] & 0x4) != 0) {
                            var2 = class49.field1038;
                        }
                    }
                }
            }
        }
        if ((class9.field265[class49.field1038][class61.field1298.field3159 >> 7][class61.field1298.field3198 >> 7] & 0x4) != 0) {
            var2 = class49.field1038;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class111.method718((byte) -78);
            }
            class136.field2515 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class240.field4411 = 0;
            } else if (arg0[1].equals("office")) {
                class240.field4411 = 1;
            } else if (arg0[1].equals("local")) {
                class240.field4411 = 2;
            } else {
                class111.method718((byte) -78);
            }
            if (arg0[2].equals("live")) {
                class189.field3504 = 0;
            } else if (arg0[2].equals("rc")) {
                class189.field3504 = 1;
            } else if (arg0[2].equals("wip")) {
                class189.field3504 = 2;
            } else {
                class111.method718((byte) -78);
            }
            if (arg0[3].equals("lowmem")) {
                class234.method1523(-128);
            } else if (arg0[3].equals("highmem")) {
                class164.method1053(114);
            } else {
                class111.method718((byte) -78);
            }
            if (arg0[4].equals("free")) {
                class134.field2444 = false;
            } else if (arg0[4].equals("members")) {
                class134.field2444 = true;
            } else {
                class111.method718((byte) -78);
            }
            if (arg0[5].equals("english")) {
                class113.field2129 = 0;
            } else if (arg0[5].equals("german")) {
                class23.method159(50);
                class113.field2129 = 1;
            } else {
                class111.method718((byte) -78);
            }
            if (arg0[6].equals("game0")) {
                class205.field3842 = 0;
            } else if (arg0[6].equals("game1")) {
                class205.field3842 = 1;
            } else {
                class111.method718((byte) -78);
            }
            class73.field1432 = class207.field3868;
            class151.field2730 = 0;
            class222.field4090 = "127.0.0.1";
            client var1 = new client();
            var1.method1390(503, 497, "runescape", class189.field3504 + 32, 765, 24, -1);
            class78.field1523.setLocation(40, 40);
        } catch (Exception var3) {
            class214.method1406(null, true, var3);
        }
        field699++;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method215(int arg0) {
        while (true) {
            if (class36.field789.method63(class150.field2705, 8) >= 11) {
                int var1 = class36.field789.method71(11, arg0 ^ 0xFFFF96F9);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class23.field554[var1] == null) {
                        var2 = true;
                        class23.field554[var1] = new class115();
                        if (class198.field3693[var1] != null) {
                            class23.field554[var1].method741(true, class198.field3693[var1]);
                        }
                    }
                    class10.field279[class22.field548++] = var1;
                    class115 var3 = class23.field554[var1];
                    var3.field3152 = class13.field322;
                    int var4 = class36.field789.method71(1, 128);
                    int var5 = class36.field789.method71(5, arg0 ^ 0xFFFF96F9);
                    int var6 = class36.field789.method71(1, 128);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    if (var6 == 1) {
                        class74.field1449[class202.field3742++] = var1;
                    }
                    int var7 = class92.field1740[class36.field789.method71(3, 128)];
                    if (var2) {
                        var3.field3162 = var3.field3177 = var7;
                    }
                    int var8 = class36.field789.method71(5, 128);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1108(class61.field1298.field3160[0] + var8, var4 == 1, class61.field1298.field3200[0] + var5, 20826);
                    continue;
                }
            }
            field698++;
            if (arg0 != -27015) {
                main(null);
            }
            class36.field789.method65((byte) 0);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method216(int arg0) {
        field708++;
        method210(-1001);
        class179.method1144((byte) 12);
        class208.method1388(4878);
        class130.method829(true);
        class73.method467((byte) -105);
        class93.method606(false);
        class165.method1058(true);
        class185.method1256((byte) 94);
        class46.method308((byte) -106);
        class49.method329(-1017200216);
        class152.method978(-1);
        class12.method87((byte) -34);
        class188.method1270((byte) -9);
        class10.method62(-7373);
        class156.method1018();
        int var2 = 42 / ((arg0 + 6) / 39);
        class40.method256(-120);
        class143.method903(-26912);
        class58.method396(-119);
        class6.method44(0);
        class115.method739((byte) -79);
        class36.method241(true);
        class144.method908(1);
        class85.method576(true);
        class241.method1561((byte) 44);
        class139.method883(200);
        class14.method97(-5);
        class196.method1312(false);
        class100.method639(64);
        class117.method754(-63);
        class175.method1104(100);
        class112.method724(120);
        class180.method1181(-1);
        class98.method628(-13313);
        class89.method588((byte) -34);
        class137.method874((byte) 11);
        class147.method944((byte) -128);
        class201.method1338(126);
        class212.method1404((byte) -45);
        class149.method954(true);
        class202.method1345((byte) 67);
        class78.method501((byte) 115);
        class197.method1317((byte) -121);
        class167.method1071((byte) -69);
        class109.method713(0);
        class186.method1258(100);
        class237.method1542((byte) 51);
        class169.method1075((byte) 24);
        class47.method316(-73);
        class171.method1088(-160);
        class76.method493();
        class215.method1412(true);
        class162.method1042(-50);
        class134.method864((byte) -124);
        class28.method186(true);
        class52.method348(-1);
        class194.method1305(-1);
        class224.method1465();
        class92.method604(50);
        class48.method320(0);
        class217.method1419(-28706);
        class80.method505((byte) -39);
        class230.method1509((byte) 35);
        class209.method1399((byte) 108);
        class106.method692(false);
        class101.method654(123);
        class173.method1097((byte) -118);
        class67.method433(4);
        class91.method599(-59);
        class163.method1043((byte) -125);
        class71.method453((byte) -29);
        class105.method689((byte) 95);
        class157.method1024((byte) 34);
        class116.method748(false);
        class136.method866(-111);
        class62.method415(0);
        class220.method1434((byte) 94);
        class159.method1031(-21);
        class228.method1503();
        class68.method437(4);
        class128.method823(true);
        class195.method1308(-10533);
        class87.method583((byte) 14);
        class96.method621(false);
        class141.method899((byte) -117);
        class64.method424(false);
        class164.method1049(-16503);
        class15.method116((byte) 102);
        class203.method1351();
        class60.method407((byte) 81);
        class54.method377(126);
        class23.method160((byte) 85);
        class4.method25(-11135);
        class225.method1474((byte) -114);
        class8.method53(-90);
        class131.method832(1);
        class59.method401(-125);
        class145.method932();
        class81.method519(32767);
        class53.method367(true);
        class27.method181();
        class114.method731((byte) 125);
        class206.method1377(111);
        class33.method221((byte) 95);
        class5.method30(64);
        class177.method1119(0);
        class7.method47((byte) -96);
        class3.method23((byte) -63);
        class166.method1061();
        class229.method1506(629);
        class138.method875(true);
        class239.method1549((byte) -49);
        class19.method136(17);
        class216.method1418(24805);
        class22.method152(114);
        class183.method1193(107);
        class82.method525();
        class13.method88(2);
        class44.method289((byte) 27);
        class219.method1433((byte) -44);
        class43.method283((byte) -103);
        class172.method1089((byte) -70);
        class55.method384(true);
        class99.method629((byte) -99);
        class11.method75(-121);
        class123.method778(-15460);
        class120.method772(-1001);
        class182.method1187(36);
        class97.method624((byte) -25);
        class84.method570(10);
        class191.method1287(-31096);
        class108.method709(15779);
        class150.method959(-128);
        class16.method125((byte) 40);
        class30.method197(11027);
        class51.method335();
        class153.method983();
        class94.method609((byte) -61);
        class213.method1405();
        class232.method1514(-32099);
        class140.method886();
        class42.method279(108);
        class31.method202(37);
        class127.method820(false);
        class222.method1443((byte) 100);
        class155.method992(0);
        class20.method143();
        class204.method1364();
        class39.method253(false);
        class160.method1034(-63);
        class102.method682(false);
        class211.method1401((byte) 52);
        class199.method1327(0);
        class34.method223((byte) 127);
        class90.method597(31840);
        class107.method697(128);
        class69.method445(0);
        class221.method1437(116);
        class235.method1529(65);
        class56.method387(-13453);
        class129.method826(104);
        class111.method717((byte) 106);
        class38.method248((byte) 96);
        class2.method15((byte) -40);
        class119.method766(4096);
        class205.method1373(-101);
        class238.method1544(0);
        class227.method1486(-113);
        class234.method1526(-94);
        class86.method579(2);
        class190.method1280(0);
        class214.method1410(4096);
        class187.method1269((byte) -73);
        class146.method938(11613);
        class77.method498((byte) -5);
        class113.method729(-3296);
        class88.method587(-26232);
        class125.method791(24748);
        class231.method1511(0);
        class161.method1039(125);
        class192.method1291(0);
        class9.method57(-1536269808);
        class243.method1564(25973);
        class236.method1531((byte) -77);
        class218.method1424((byte) -31);
        class95.method610(false);
        class193.method1293(false);
        class223.method1445(true);
        class17.method131(-16385);
        class132.method844(0);
        class198.method1323(true);
        class29.method189(-858392404);
        class61.method414(-256);
        class207.method1386(1442707532);
        class189.method1273(25976);
        class50.method332(128);
        class124.method783(0);
        class178.method1121(1);
        class176.method1114((byte) -15);
        class240.method1557(-5973);
        class110.method715(true);
        class18.method132(6773);
        class133.method851(16);
        class32.method205((byte) 125);
        class70.method452((byte) -80);
        class148.method946(-31);
        class66.method430(21558);
        class25.method163(75);
        class174.method1099(126);
        class135.method865((byte) -26);
        class168.method1072(119);
        class121.method775((byte) -74);
        class74.method472(1153530668);
        class151.method961((byte) -106);
        class233.method1517(-13810);
        if (class208.field3917) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field701++;
        if (!this.method1393(48)) {
            return;
        }
        class136.field2515 = Integer.parseInt(this.getParameter("worldid"));
        class189.field3504 = Integer.parseInt(this.getParameter("modewhat"));
        class240.field4411 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class234.method1523(68);
        } else {
            class164.method1053(62);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class134.field2444 = true;
        } else {
            class134.field2444 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class23.method159(118);
            class113.field2129 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class205.field3842 = 1;
        } else {
            class205.field3842 = 0;
        }
        try {
            class180.field3329 = Integer.parseInt(this.getParameter("js"));
            class59.field1258 = Integer.parseInt(this.getParameter("plug"));
            class151.field2730 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class73.field1432 = class17.field446.method1164(82, this);
        if (class73.field1432 == null) {
            class73.field1432 = class207.field3868;
        }
        class222.field4090 = this.getCodeBase().getHost();
        this.method1394(765, 17485, 497, class189.field3504 + 32, 503);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method217(int arg0) {
        boolean var2 = false;
        field702++;
        boolean var3 = class18.method133(true);
        if (var3 && class144.field2618 && class192.field3585 != null) {
            class192.field3585.method92((byte) -28);
        }
        if (class18.field473) {
            var2 = true;
            class18.field473 = false;
        }
        if (class80.field1545 == 0) {
            class217.method1420(var2, class52.field1146, class232.field4291, 123, null);
        } else if (class80.field1545 == 5 || class80.field1545 == 10 || class80.field1545 == 20) {
            class160.method1033(false, class90.field1712, class71.field1422);
        } else if (class80.field1545 == 25) {
            if (class60.field1290 == 1) {
                if (class47.field1021 > class6.field191) {
                    class6.field191 = class47.field1021;
                }
                int var4 = (class6.field191 - class47.field1021) * 50 / class6.field191;
                class163.method1045(4, false, class78.method502((byte) -100, new class179[] { class32.field683, class197.field3655, class148.method949((byte) -14, var4), class239.field4403 }));
            } else if (class60.field1290 == 2) {
                if (class121.field2263 < class95.field1799) {
                    class121.field2263 = class95.field1799;
                }
                int var5 = (class121.field2263 - class95.field1799) * 50 / class121.field2263 + 50;
                class163.method1045(4, false, class78.method502((byte) -127, new class179[] { class32.field683, class197.field3655, class148.method949((byte) -14, var5), class239.field4403 }));
            } else {
                class163.method1045(4, false, class32.field683);
            }
        } else if (class80.field1545 == 30) {
            class155.method993(-16371);
        } else if (class80.field1545 == 40) {
            class163.method1045(4, false, class78.method502((byte) -105, new class179[] { class30.field664, class31.field679, class38.field821 }));
        }
        Canvas var6 = class81.field1571;
        if (class80.field1545 == 30 && class110.field2056 == 0 && !var2) {
            try {
                Graphics var9 = var6.getGraphics();
                for (int var10 = 0; var10 < class160.field2907; var10++) {
                    if (class186.field3455[var10]) {
                        class217.field4010.method463(class99.field1845[var10], class116.field2185[var10], class15.field401[var10], var9, class84.field1636[var10], (byte) 79);
                        class186.field3455[var10] = false;
                    }
                }
            } catch (Exception var12) {
                var6.repaint();
            }
        } else if (class80.field1545 > 0) {
            try {
                Graphics var7 = var6.getGraphics();
                class217.field4010.method466(0, 0, var7, (byte) 120);
                for (int var8 = 0; var8 < class160.field2907; var8++) {
                    class186.field3455[var8] = false;
                }
            } catch (Exception var13) {
                var6.repaint();
            }
        }
        int var11 = -54 % ((-arg0 - 28) / 38);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method218(byte arg0) {
        class109.field2050 = class240.field4411 == 0 ? 43594 : class136.field2515 + 40000;
        if (class205.field3842 == 1) {
            class121.field2264 = class108.field2011;
            class52.field1147 = class14.field337;
            class3.field36 = class179.field3279;
            class3.field37 = class117.field2210;
        } else {
            class3.field37 = class185.field3423;
            class3.field36 = class123.field2276;
            class121.field2264 = class159.field2880;
            class52.field1147 = class49.field1045;
        }
        class134.field2435 = class87.field1667 = class241.field4430 = new short[256];
        class93.field1764 = class240.field4411 == 0 ? 443 : class136.field2515 + 50000;
        class234.field4316 = class109.field2050;
        class222.method1442((byte) 57);
        class11.method74(-3911, class81.field1571);
        class169.method1076(true, class81.field1571);
        field711++;
        class69.field1380 = class134.method852(2095);
        if (class69.field1380 != null) {
            class69.field1380.method150(-20016, class81.field1571);
        }
        class109.field2042 = class1.field14;
        try {
            if (class25.field588.field11 != null) {
                class185.field3434 = new class152(class25.field588.field11, 5200, 0);
                for (int var2 = 0; var2 < 24; var2++) {
                    class141.field2579[var2] = new class152(class25.field588.field9[var2], 6000, 0);
                }
                class109.field2030 = new class152(class25.field588.field10, 6000, 0);
                class174.field3120 = new class12(255, class185.field3434, class109.field2030, 500000);
                class171.field3066 = new class152(class25.field588.field6, 24, 0);
                class25.field588.field10 = null;
                class25.field588.field11 = null;
                class25.field588.field6 = null;
                class25.field588.field9 = null;
            }
        } catch (IOException var3) {
            class109.field2030 = null;
            class171.field3066 = null;
            class174.field3120 = null;
            class185.field3434 = null;
        }
        if (class240.field4411 != 0) {
            class191.field3568 = true;
        }
        if (arg0 <= 67) {
            field707 = null;
        }
        class187.field3485 = class168.field3028;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method219(int arg0) {
        field696++;
        if (class50.field1076 >= 4) {
            this.method1397("js5crc", 32000);
            class80.field1545 = 1000;
            return;
        }
        if (class191.field3571 >= 4) {
            if (class80.field1545 <= 5) {
                this.method1397("js5io", arg0 ^ 0x4D70);
                class80.field1545 = 1000;
                return;
            }
            class191.field3571 = 3;
            class178.field3232 = 3000;
        }
        if (class178.field3232-- > 0) {
            return;
        }
        try {
            if (class29.field642 == 0) {
                class98.field1836 = class25.field588.method1(class222.field4090, class234.field4316, -6138);
                class29.field642++;
            }
            if (class29.field642 == 1) {
                if (class98.field1836.field595 == 2) {
                    this.method211(-1, (byte) -30);
                    return;
                }
                if (class98.field1836.field595 == 1) {
                    class29.field642++;
                }
            }
            if (class29.field642 == 2) {
                class208.field3883 = new class46((Socket) class98.field1836.field591, class25.field588);
                class185 var2 = new class185(5);
                var2.method1230((byte) -122, 15);
                var2.method1229((byte) -109, 497);
                class208.field3883.method307(-83, 0, var2.field3397, 5);
                class29.field642++;
                class100.field1865 = class80.method504(arg0 ^ 0xFFFFCF8F);
            }
            if (class29.field642 == 3) {
                if (class80.field1545 <= 5 || class208.field3883.method305((byte) 85) > 0) {
                    int var3 = class208.field3883.method309((byte) 122);
                    if (var3 != 0) {
                        this.method211(var3, (byte) -30);
                        return;
                    }
                    class29.field642++;
                } else if (class80.method504(-1) - class100.field1865 > 30000L) {
                    this.method211(-2, (byte) -30);
                    return;
                }
            }
            if (class29.field642 == 4) {
                class214.method1408(class208.field3883, class80.field1545 > 20, 4096);
                class6.field175 = 0;
                class98.field1836 = null;
                class29.field642 = 0;
                class208.field3883 = null;
            }
            if (arg0 != 12400) {
                this.method209(-48);
            }
        } catch (IOException var4) {
            this.method211(-3, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method220(int arg0) {
        field704++;
        int var2 = -103 / ((arg0 + 33) / 58);
        if (class183.field3376 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class80.method504(-1);
            if (class160.field2910 == 0L) {
                class160.field2910 = var5;
            }
            if (var4 > 16384 && var5 - class160.field2910 < 5000L) {
                if (var5 - class18.field468 > 1000L) {
                    System.gc();
                    class18.field468 = var5;
                }
                class232.field4291 = class60.field1282;
                class52.field1146 = 5;
            } else {
                class52.field1146 = 5;
                class232.field4291 = class92.field1747;
                class183.field3376 = 10;
            }
        } else if (class183.field3376 == 10) {
            class10.method60(4, 104, 104, class194.field3619, 25);
            for (int var7 = 0; var7 < 4; var7++) {
                class135.field2492[var7] = new class40(104, 104);
            }
            class52.field1146 = 10;
            class232.field4291 = class29.field645;
            class183.field3376 = 30;
        } else if (class183.field3376 == 30) {
            class18.field475 = class168.method1073(true, 0, false, true, (byte) 94);
            class80.field1539 = class168.method1073(true, 1, false, true, (byte) 100);
            class227.field4192 = class168.method1073(false, 2, true, true, (byte) -107);
            class50.field1070 = class168.method1073(true, 3, false, true, (byte) 76);
            class157.field2850 = class168.method1073(true, 4, false, true, (byte) -83);
            class34.field753 = class168.method1073(true, 5, true, true, (byte) 77);
            class179.field3251 = class168.method1073(true, 6, true, false, (byte) -121);
            class183.field3381 = class168.method1073(true, 7, false, true, (byte) -98);
            class131.field2384 = class168.method1073(true, 8, false, true, (byte) -123);
            class38.field822 = class168.method1073(false, 9, true, true, (byte) -77);
            class223.field4108 = class168.method1073(true, 10, false, true, (byte) -74);
            class144.field2634 = class168.method1073(true, 11, false, true, (byte) 98);
            class237.field4380 = class168.method1073(true, 12, false, true, (byte) -120);
            class86.field1648 = class168.method1073(false, 13, true, true, (byte) -104);
            class48.field1033 = class168.method1073(true, 14, false, false, (byte) 48);
            class123.field2275 = class168.method1073(true, 15, false, true, (byte) 123);
            class50.field1083 = class168.method1073(true, 16, false, true, (byte) 109);
            class25.field579 = class168.method1073(true, 17, false, true, (byte) 121);
            class163.field2944 = class168.method1073(true, 18, false, true, (byte) 69);
            class66.field1346 = class168.method1073(true, 19, false, true, (byte) -73);
            class149.field2679 = class168.method1073(true, 20, false, true, (byte) -121);
            class106.field1986 = class168.method1073(true, 21, false, true, (byte) 71);
            class42.field904 = class168.method1073(true, 22, false, true, (byte) 75);
            class112.field2101 = class168.method1073(true, 23, true, true, (byte) 109);
            class232.field4291 = class17.field455;
            class183.field3376 = 40;
            class52.field1146 = 15;
        } else if (class183.field3376 == 40) {
            byte var8 = 0;
            int var9 = var8 + class18.field475.method326((byte) -70) * 4 / 100;
            int var10 = var9 + class80.field1539.method326((byte) -54) * 4 / 100;
            int var11 = var10 + class227.field4192.method326((byte) -58) / 100;
            int var12 = var11 + class50.field1070.method326((byte) -107) * 2 / 100;
            int var13 = var12 + class157.field2850.method326((byte) -84) * 6 / 100;
            int var14 = var13 + class34.field753.method326((byte) -70) * 4 / 100;
            int var15 = var14 + class179.field3251.method326((byte) -70) * 2 / 100;
            int var16 = var15 + class183.field3381.method326((byte) -128) * 53 / 100;
            int var17 = var16 + class131.field2384.method326((byte) -80) * 2 / 100;
            int var18 = var17 + class38.field822.method326((byte) -34) * 2 / 100;
            int var19 = var18 + class223.field4108.method326((byte) -125) * 2 / 100;
            int var20 = var19 + class144.field2634.method326((byte) -18) * 2 / 100;
            int var21 = var20 + class237.field4380.method326((byte) -85) * 2 / 100;
            int var22 = var21 + class86.field1648.method326((byte) -102) * 2 / 100;
            int var23 = var22 + class48.field1033.method326((byte) -48) * 2 / 100;
            int var24 = var23 + class123.field2275.method326((byte) -22) * 2 / 100;
            int var25 = var24 + class50.field1083.method326((byte) -104) / 100;
            int var26 = var25 + class25.field579.method326((byte) -127) / 100;
            int var27 = var26 + class163.field2944.method326((byte) -22) / 100;
            int var28 = var27 + class66.field1346.method326((byte) -72) / 100;
            int var29 = var28 + class149.field2679.method326((byte) -60) / 100;
            int var30 = var29 + class106.field1986.method326((byte) -43) / 100;
            int var31 = var30 + class42.field904.method326((byte) -74) / 100;
            int var32 = var31 + class112.field2101.method326((byte) -20) / 100;
            if (var32 == 100) {
                class232.field4291 = class15.field411;
                class52.field1146 = 20;
                class70.method451(class223.field4108, class131.field2384, class179.field3251, 0);
                class183.field3376 = 45;
            } else {
                if (var32 != 0) {
                    class232.field4291 = class78.method502((byte) -95, new class179[] { class59.field1270, class148.method949((byte) -14, var32), class240.field4420 });
                }
                class52.field1146 = 20;
            }
        } else if (class183.field3376 == 45) {
            class243.method1563(-48001, 2, 22050, !class180.field3307);
            class101 var33 = new class101();
            var33.method661(128, 9, (byte) -87);
            class192.field3585 = class119.method767(16384, 0, class81.field1571, class25.field588, 22050);
            class192.field3585.method106(0, var33);
            class214.method1407(class48.field1033, (byte) -95, class123.field2275, var33, class157.field2850);
            class163.field2951 = class119.method767(16384, 1, class81.field1571, class25.field588, 2048);
            class38.field824 = new class184();
            class163.field2951.method106(0, class38.field824);
            class15.field373 = new class196(22050, class80.field1542);
            class232.field4291 = class229.field4238;
            class52.field1146 = 30;
            class183.field3376 = 50;
        } else if (class183.field3376 == 50) {
            int var34 = 0;
            if (class131.field2384.method352(false, class120.field2252)) {
                var34++;
            }
            if (class131.field2384.method352(false, class211.field3944)) {
                var34++;
            }
            if (class131.field2384.method352(false, class239.field4407)) {
                var34++;
            }
            if (class86.field1648.method352(false, class120.field2252)) {
                var34++;
            }
            if (class86.field1648.method352(false, class211.field3944)) {
                var34++;
            }
            if (class86.field1648.method352(false, class239.field4407)) {
                var34++;
            }
            if (var34 < 6) {
                class232.field4291 = class78.method502((byte) -81, new class179[] { class30.field655, class148.method949((byte) -14, var34 * 100 / 6), class240.field4420 });
                class52.field1146 = 35;
            } else {
                class52.field1146 = 35;
                class183.field3376 = 60;
                class232.field4291 = class182.field3368;
            }
        } else if (class183.field3376 == 60) {
            int var35 = class238.method1547(class131.field2384, class223.field4108, (byte) 101);
            int var36 = class127.method819((byte) 120);
            if (var36 > var35) {
                class232.field4291 = class78.method502((byte) -80, new class179[] { class143.field2595, class148.method949((byte) -14, var35 * 100 / var36), class240.field4420 });
                class52.field1146 = 40;
            } else {
                class232.field4291 = class205.field3840;
                class183.field3376 = 65;
                class52.field1146 = 40;
            }
        } else if (class183.field3376 == 65) {
            class90.field1712 = class80.method506(class86.field1648, class120.field2252, false, class131.field2384, class207.field3868);
            class168.field3025 = (class65) class90.field1712;
            class191.field3546 = class80.method506(class86.field1648, class211.field3944, false, class131.field2384, class207.field3868);
            class71.field1422 = class80.method506(class86.field1648, class239.field4407, false, class131.field2384, class207.field3868);
            class232.field4291 = class74.field1455;
            class52.field1146 = 45;
            class223.method1449((byte) 106, 5);
            class183.field3376 = 70;
        } else if (class183.field3376 == 70) {
            byte var37 = 0;
            class227.field4192.method361((byte) -22);
            int var38 = var37 + class227.field4192.method358(-83);
            class50.field1083.method361((byte) -22);
            int var39 = var38 + class50.field1083.method358(-60);
            class25.field579.method361((byte) -22);
            int var40 = var39 + class25.field579.method358(-127);
            class163.field2944.method361((byte) -22);
            int var41 = var40 + class163.field2944.method358(-114);
            class66.field1346.method361((byte) -22);
            int var42 = var41 + class66.field1346.method358(-69);
            class149.field2679.method361((byte) -22);
            int var43 = var42 + class149.field2679.method358(-106);
            class106.field1986.method361((byte) -22);
            int var44 = var43 + class106.field1986.method358(-71);
            class42.field904.method361((byte) -22);
            int var45 = var44 + class42.field904.method358(-94);
            if (var45 < 800) {
                class232.field4291 = class78.method502((byte) -87, new class179[] { class150.field2706, class148.method949((byte) -14, var45 / 8), class240.field4420 });
                class52.field1146 = 50;
            } else {
                class43.method284(class227.field4192, 25);
                class209.method1398(-117, class227.field4192);
                class47.method315(class183.field3381, -18532, class227.field4192);
                class55.method381(30, class180.field3307, class134.field2444, class183.field3381, class50.field1083);
                class183.method1191(class163.field2944, 121, class183.field3381);
                class11.method77(class134.field2444, class66.field1346, 2, class168.field3025, class183.field3381);
                class81.method512(class149.field2679, class80.field1539, true, class18.field475);
                class219.method1427(class183.field3381, 0, class106.field1986);
                class89.method593(class42.field904, (byte) -26);
                class179.method1123(class227.field4192, false);
                class187.method1266((byte) -126, class86.field1648, class50.field1070, class183.field3381, class131.field2384);
                class47.method317((byte) 126, class227.field4192);
                class179.method1151((byte) -90, class25.field579);
                class223.method1448(true, class227.field4192);
                class231.method1512(false, class227.field4192);
                class232.field4291 = class186.field3462;
                class52.field1146 = 50;
                class206.method1379(0);
                class183.field3376 = 80;
            }
        } else if (class183.field3376 == 80) {
            int var46 = 0;
            if (class159.field2865 == null) {
                class126 var47 = class211.method1400(class207.field3868, (byte) -110, class183.field3371, class131.field2384);
                if (var47 != null) {
                    var47.method796();
                    class159.field2865 = var47;
                }
            } else {
                var46++;
            }
            if (class100.field1876 == null) {
                class100.field1876 = class23.method153(class207.field3868, 41, class133.field2419, class131.field2384);
            } else {
                var46++;
            }
            if (class149.field2688 == null) {
                class149.field2688 = class136.method869(class131.field2384, class64.field1328, class207.field3868, true);
            } else {
                var46++;
            }
            if (class43.field928 == null) {
                class43.field928 = class13.method89(class207.field3868, class216.field4006, 1, class131.field2384);
            } else {
                var46++;
            }
            if (class193.field3593 == null) {
                class193.field3593 = class13.method89(class207.field3868, class197.field3658, 1, class131.field2384);
            } else {
                var46++;
            }
            if (class149.field2693 == null) {
                class149.field2693 = class13.method89(class207.field3868, class191.field3559, 1, class131.field2384);
            } else {
                var46++;
            }
            if (class194.field3621 == null) {
                class194.field3621 = class13.method89(class207.field3868, class89.field1690, 1, class131.field2384);
            } else {
                var46++;
            }
            if (class216.field3999 == null) {
                class216.field3999 = class13.method89(class207.field3868, class128.field2342, 1, class131.field2384);
            } else {
                var46++;
            }
            if (class99.field1846 == null) {
                class126[] var48 = class136.method869(class131.field2384, class188.field3500, class207.field3868, true);
                if (var48 != null) {
                    for (int var49 = 0; var49 < var48.length; var49++) {
                        var48[var49].method796();
                    }
                    class99.field1846 = var48;
                }
            } else {
                var46++;
            }
            if (class128.field2354 == null) {
                class128.field2354 = class30.method195(class129.field2359, class131.field2384, class207.field3868, (byte) 7);
            } else {
                var46++;
            }
            if (class199.field3708 == null) {
                class199.field3708 = class13.method89(class207.field3868, class4.field55, 1, class131.field2384);
            } else {
                var46++;
            }
            if (class25.field584 == null) {
                class25.field584 = class13.method89(class207.field3868, class68.field1370, 1, class131.field2384);
            } else {
                var46++;
            }
            if (class196.field3648 == null) {
                class196.field3648 = class4.method24(class131.field2384, class207.field3868, class134.field2476, 5);
            } else {
                var46++;
            }
            if (class202.field3748 == null) {
                class202.field3748 = class4.method24(class131.field2384, class207.field3868, class125.field2306, 5);
            } else {
                var46++;
            }
            var46++;
            if (var46 < 15) {
                class232.field4291 = class78.method502((byte) -124, new class179[] { class187.field3471, class148.method949((byte) -14, var46 * 100 / 15), class240.field4420 });
                class52.field1146 = 60;
            } else {
                class90.field1712.method1001(class202.field3748, null);
                class191.field3546.method1001(class202.field3748, null);
                class71.field1422.method1001(class202.field3748, null);
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                for (int var54 = 0; var54 < class149.field2688.length; var54++) {
                    class149.field2688[var54].method798(var50 + var52, var51 - -var52, var52 + var53);
                }
                class100.field1876[0].method456(var50 + var52, var51 + var52, var52 + var53);
                class52.field1146 = 60;
                class232.field4291 = class121.field2273;
                class183.field3376 = 90;
                class59.field1257 = class149.field2688;
            }
        } else if (class183.field3376 == 90) {
            if (class38.field822.method361((byte) -22)) {
                class81 var55 = new class81(class38.field822, class131.field2384, 20, class180.field3307 ? 64 : 128);
                class27.method178(var55);
                class27.method164(0.7F);
                class232.field4291 = class206.field3853;
                class183.field3376 = 110;
                class52.field1146 = 70;
            } else {
                class232.field4291 = class78.method502((byte) -107, new class179[] { class206.field3847, class148.method949((byte) -14, class38.field822.method358(-120)), class240.field4420 });
                class52.field1146 = 70;
            }
        } else if (class183.field3376 == 110) {
            class199.field3702 = new class93();
            class25.field588.method8(0, class199.field3702, 10);
            class52.field1146 = 75;
            class232.field4291 = class40.field849;
            class183.field3376 = 120;
        } else if (class183.field3376 == 120) {
            if (class223.field4108.method364(class207.field3868, class220.field4075, (byte) 94)) {
                class114 var56 = new class114(class223.field4108.method350(class220.field4075, (byte) -90, class207.field3868));
                class30.method199(var56, true);
                class52.field1146 = 80;
                class232.field4291 = class143.field2600;
                class183.field3376 = 130;
            } else {
                class232.field4291 = class78.method502((byte) -108, new class179[] { class49.field1062, class131.field2388 });
                class52.field1146 = 80;
            }
        } else if (class183.field3376 == 130) {
            if (!class50.field1070.method361((byte) -22)) {
                class232.field4291 = class78.method502((byte) -95, new class179[] { class222.field4095, class148.method949((byte) -14, class50.field1070.method358(-62) * 4 / 5), class240.field4420 });
                class52.field1146 = 85;
            } else if (!class237.field4380.method361((byte) -22)) {
                class232.field4291 = class78.method502((byte) -90, new class179[] { class222.field4095, class148.method949((byte) -14, class237.field4380.method358(-116) / 6 + 80), class240.field4420 });
                class52.field1146 = 85;
            } else if (class86.field1648.method361((byte) -22)) {
                class52.field1146 = 100;
                class232.field4291 = class199.field3713;
                class183.field3376 = 140;
            } else {
                class232.field4291 = class78.method502((byte) -113, new class179[] { class222.field4095, class148.method949((byte) -14, class86.field1648.method358(-97) / 20 + 96), class240.field4420 });
                class52.field1146 = 85;
            }
        } else if (class183.field3376 == 140) {
            class34.field753.method349(false, true, (byte) 39);
            class179.field3251.method349(true, true, (byte) 39);
            class131.field2384.method349(true, true, (byte) 39);
            class86.field1648.method349(true, true, (byte) 39);
            class223.field4108.method349(true, true, (byte) 39);
            class223.method1449((byte) 106, 10);
        }
    }
}
