import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class39 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lea;")
    public static class38 field536 = class9.method46((byte) 112, "cross");

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lea;")
    public static class38 field535 = class9.method46((byte) 115, "nav");

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lea;")
    public static class38 field541 = class9.method46((byte) 124, ")3");

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lrc;")
    public static class155 field542 = new class155(64);

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field548 = 0;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
    public static boolean field549;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    private final void method156(int arg0, boolean arg1) {
        if (!arg1) {
            this.method162(112);
        }
        class132.field2808 = null;
        field540++;
        class167.field3446++;
        if (class19.field440 == class178.field3606) {
            class19.field440 = class59.field1474;
        } else {
            class19.field440 = class178.field3606;
        }
        class132.field2791 = null;
        class95.field2136 = 0;
        if (class167.field3446 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class86.field2005 > 5) {
                class74.field1803 = 3000;
            } else {
                this.method288("js5connect_full", 1);
                class86.field2005 = 1000;
            }
        } else if (class167.field3446 >= 2 && arg0 == 6) {
            this.method288("js5connect_outofdate", 1);
            class86.field2005 = 1000;
        } else if (class167.field3446 >= 4) {
            if (class86.field2005 > 5) {
                class74.field1803 = 3000;
            } else {
                this.method288("js5connect", 1);
                class86.field2005 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        field546++;
        if (class194.field3822 == 1) {
            class19.field442 = class9.field203;
            class2.field71 = class70.field1734;
            class123.field2625 = class203.field4002;
            class95.field2143 = class115.field2540;
        } else {
            class19.field442 = class96.field2162;
            class123.field2625 = class31.field609;
            class2.field71 = class196.field3850;
            class95.field2143 = class23.field497;
        }
        class178.field3606 = class109.field2450 == 0 ? 43594 : class125.field2699 + 40000;
        class59.field1474 = class109.field2450 == 0 ? 443 : class125.field2699 + 50000;
        class19.field440 = class178.field3606;
        class101.method834(true);
        class181.method1239(arg0 ^ 0xFFFFFFA7, class51.field1313);
        class30.method190(89, class51.field1313);
        if (arg0 != -89) {
            return;
        }
        class62.field1499 = class14.method80((byte) 70);
        if (class62.field1499 != null) {
            class62.field1499.method874(class51.field1313, (byte) 92);
        }
        class202.field3981 = class129.field2768;
        try {
            if (class186.field3708.field2761 != null) {
                class141.field2953 = new class111(class186.field3708.field2761, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class19.field439[var2] = new class111(class186.field3708.field2773[var2], 6000, 0);
                }
                class195.field3832 = new class111(class186.field3708.field2769, 6000, 0);
                class25.field514 = new class161(255, class141.field2953, class195.field3832, 500000);
                class166.field3433 = new class111(class186.field3708.field2764, 24, 0);
                class186.field3708.field2764 = null;
                class186.field3708.field2761 = null;
                class186.field3708.field2769 = null;
                class186.field3708.field2773 = null;
            }
        } catch (IOException var3) {
            class166.field3433 = null;
            class141.field2953 = null;
            class25.field514 = null;
            class195.field3832 = null;
        }
        if (class109.field2450 != 0) {
            class154.field3208 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method158(byte arg0) {
        class45.field1098++;
        field543++;
        if (class45.field1098 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class103.field2324 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class87.field2016.setSeed((long) class103.field2324);
        }
        this.method160(1000);
        class59.method424(true);
        class41.method303(false);
        class167.method1188(2);
        class143.method1033(arg0 ^ 0xFFFFFFEE);
        class98.method811(false);
        if (arg0 != -98) {
            field536 = null;
        }
        if (class62.field1499 != null) {
            int var3 = class62.field1499.method873(0);
            class102.field2288 = var3;
        }
        if (class86.field2005 == 0) {
            class113.method891(600);
            class5.method26(arg0 - 7144);
        } else if (class86.field2005 == 5) {
            class99.method816(this, 0);
            class113.method891(600);
            class5.method26(arg0 ^ 0x1C28);
        } else if (class86.field2005 == 10) {
            class99.method816(this, 0);
        } else if (class86.field2005 == 20) {
            class99.method816(this, 0);
            class95.method798(-21482);
        } else if (class86.field2005 == 25) {
            class141.method1013((byte) 114);
        }
        if (class86.field2005 == 30) {
            class111.method880(0);
        } else if (class86.field2005 == 40) {
            class95.method798(arg0 - 21384);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static void method159(byte arg0) {
        field542 = null;
        field535 = null;
        if (arg0 == 103) {
            field536 = null;
            field541 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class123.method924(20);
            }
            class125.field2699 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class109.field2450 = 0;
            } else if (arg0[1].equals("office")) {
                class109.field2450 = 1;
            } else if (arg0[1].equals("local")) {
                class109.field2450 = 2;
            } else {
                class123.method924(20);
            }
            if (arg0[2].equals("live")) {
                class94.field2128 = 0;
            } else if (arg0[2].equals("rc")) {
                class94.field2128 = 1;
            } else if (arg0[2].equals("wip")) {
                class94.field2128 = 2;
            } else {
                class123.method924(20);
            }
            if (arg0[3].equals("lowmem")) {
                class48.method338((byte) 119);
            } else if (arg0[3].equals("highmem")) {
                class166.method1183((byte) 74);
            } else {
                class123.method924(20);
            }
            if (arg0[4].equals("free")) {
                class143.field2978 = false;
            } else if (arg0[4].equals("members")) {
                class143.field2978 = true;
            } else {
                class123.method924(20);
            }
            if (arg0[5].equals("english")) {
                class158.field3317 = 0;
            } else if (arg0[5].equals("german")) {
                class135.method982((byte) 74);
                class70.field1742 = class155.field3217;
                class158.field3317 = 1;
            } else {
                class123.method924(20);
            }
            if (arg0[6].equals("game0")) {
                class194.field3822 = 0;
            } else if (arg0[6].equals("game1")) {
                class194.field3822 = 1;
            } else {
                class123.method924(20);
            }
            class48.field1168 = "127.0.0.1";
            client var1 = new client();
            var1.method290("runescape", 503, 16, class94.field2128 + 32, 474, 765, (byte) -72);
            class96.field2151.setLocation(40, 40);
        } catch (Exception var3) {
            class17.method95(-49, null, var3);
        }
        field534++;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method160(int arg0) {
        field537++;
        if (class86.field2005 != arg0) {
            boolean var2 = class84.method715(arg0 ^ 0x621B);
            if (!var2) {
                this.method161((byte) -90);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field547++;
        if (!this.method287(11641)) {
            return;
        }
        class125.field2699 = Integer.parseInt(this.getParameter("worldid"));
        class94.field2128 = Integer.parseInt(this.getParameter("modewhat"));
        class109.field2450 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class48.method338((byte) -39);
        } else {
            class166.method1183((byte) 74);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class143.field2978 = true;
        } else {
            class143.field2978 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class135.method982((byte) 74);
            class158.field3317 = 1;
            class70.field1742 = class155.field3217;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class194.field3822 = 1;
        } else {
            class194.field3822 = 0;
        }
        try {
            class28.field551 = Integer.parseInt(this.getParameter("js"));
            class25.field508 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class48.field1168 = this.getCodeBase().getHost();
        this.method289(474, 503, class94.field2128 + 32, 765, (byte) -17);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method161(byte arg0) {
        field532++;
        if (class203.field4012 >= 4) {
            this.method288("js5crc", 1);
            class86.field2005 = 1000;
            return;
        }
        if (class140.field2943 >= 4) {
            if (class86.field2005 <= 5) {
                this.method288("js5io", 1);
                class86.field2005 = 1000;
                return;
            }
            class140.field2943 = 3;
            class74.field1803 = 3000;
        }
        if (class74.field1803-- > 0) {
            return;
        }
        try {
            if (class95.field2136 == 0) {
                class132.field2791 = class186.field3708.method951(class48.field1168, class19.field440, true);
                class95.field2136++;
            }
            if (arg0 < -76) {
                if (class95.field2136 == 1) {
                    if (class132.field2791.field1486 == 2) {
                        this.method156(-1, true);
                        return;
                    }
                    if (class132.field2791.field1486 == 1) {
                        class95.field2136++;
                    }
                }
                if (class95.field2136 == 2) {
                    class132.field2808 = new class50((Socket) class132.field2791.field1490, class186.field3708);
                    class66 var2 = new class66(5);
                    var2.method495(110, 15);
                    var2.method478((byte) -123, 474);
                    class132.field2808.method361(0, (byte) 99, var2.field1627, 5);
                    class95.field2136++;
                    class186.field3705 = class166.method1184((byte) -80);
                }
                if (class95.field2136 == 3) {
                    if (class86.field2005 <= 5 || class132.field2808.method363(-107) > 0) {
                        int var3 = class132.field2808.method362(false);
                        if (var3 != 0) {
                            this.method156(var3, true);
                            return;
                        }
                        class95.field2136++;
                    } else if (class166.method1184((byte) -80) - class186.field3705 > 30000L) {
                        this.method156(-2, true);
                        return;
                    }
                }
                if (class95.field2136 == 4) {
                    class154.method1072(class132.field2808, 0, class86.field2005 > 20);
                    class95.field2136 = 0;
                    class132.field2791 = null;
                    class167.field3446 = 0;
                    class132.field2808 = null;
                }
            }
        } catch (IOException var4) {
            this.method156(-3, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method162(int arg0) {
        if (arg0 != -14749) {
            field533 = -7;
        }
        field539++;
        if (class163.field3397 != null) {
            class163.field3397.field2827 = false;
        }
        class163.field3397 = null;
        if (class39.field876 != null) {
            class39.field876.method366((byte) -128);
            class39.field876 = null;
        }
        class87.method727(true);
        class37.method244(arg0 ^ 0x39F4);
        class62.field1499 = null;
        if (class202.field3991 != null) {
            class202.field3991.method437(-127);
        }
        if (class52.field1339 != null) {
            class52.field1339.method437(-120);
        }
        class83.method708(17242);
        class162.method1163((byte) 84);
        try {
            if (class141.field2953 != null) {
                class141.field2953.method879(arg0 ^ 0xFFFFC663);
            }
            if (class19.field439 != null) {
                for (int var2 = 0; var2 < class19.field439.length; var2++) {
                    if (class19.field439[var2] != null) {
                        class19.field439[var2].method879(0);
                    }
                }
            }
            if (class195.field3832 != null) {
                class195.field3832.method879(0);
            }
            if (class166.field3433 != null) {
                class166.field3433.method879(0);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method163(int arg0) {
        method159((byte) 103);
        class38.method250((byte) 74);
        class39.method292(-110);
        class130.method961(-71);
        class86.method717(20);
        field544++;
        class134.method980((byte) -67);
        class66.method516(false);
        class50.method364(-3);
        class127.method943(11729);
        class111.method886((byte) -120);
        class161.method1159(false);
        class102.method838(1954378439);
        class28.method175(-128);
        class157.method1134();
        class54.method397(1);
        class43.method311(arg0 ^ 0xFFFF55ED);
        class144.method1037((byte) 119);
        class141.method1025(8);
        class29.method182(true);
        class116.method901(0);
        class135.method981(-22126);
        class150.method1052(-127);
        class62.method446((byte) 96);
        class75.method596((byte) -107);
        class73.method584((byte) 55);
        class140.method1011((byte) -36);
        class19.method111((byte) -61);
        class9.method47(true);
        class152.method1062((byte) -26);
        class42.method310(0);
        class97.method810(-23867);
        class11.method56(arg0 - 43587);
        class202.method1329(false);
        class155.method1075(115);
        class159.method1150();
        class81.method685();
        class96.method803((byte) -27);
        class40.method301(-1);
        class115.method897(arg0 ^ 0xFFFF2418);
        class123.method922(arg0 - 43592);
        class68.method551((byte) -73);
        class185.method1252((byte) 58);
        class52.method378(-98);
        class175.method1219(0);
        class108.method868(-6321);
        class103.method840(arg0 - 43598);
        class128.method948(false);
        class153.method1071();
        class190.method1270((byte) 113);
        class133.method976(false);
        class57.method418(arg0 - 43594);
        class22.method132((byte) 91);
        class166.method1182(-19);
        class21.method131(-55);
        class6.method30(0);
        class32.method217(107);
        class67.method527(23171);
        class172.method1206(true);
        class138.method993(-10);
        class59.method428(true);
        class137.method991((byte) 125);
        class118.method910(2);
        class200.method1310(true);
        class3.method17(-1788);
        class179.method1232(arg0 - 43570);
        class143.method1032(-4587);
        class146.method1044(arg0 ^ 0xCB2E);
        class18.method103(1000000);
        class145.method1040((byte) 0);
        class71.method562();
        class14.method82(8);
        class93.method771();
        class74.method590(16491);
        class20.method121();
        class37.method242(-26088);
        class119.method913(true);
        class8.method44((byte) -27);
        class55.method410(-50);
        class7.method35(122);
        class12.method63(true);
        class106.method859(6989);
        class2.method6(-21294);
        class170.method1200((byte) -46);
        class198.method1302(-6);
        class23.method138((byte) 103);
        class149.method1051(500);
        class180.method1237((byte) 92);
        class83.method705(50);
        class77.method652();
        class191.method1275(-105);
        class4.method24(-124);
        class30.method187((byte) 60);
        class154.method1073((byte) 25);
        class113.method895(20);
        class196.method1294((byte) -15);
        class105.method855(-108);
        class45.method329((byte) -117);
        class31.method191(true);
        class63.method448(-84);
        class167.method1190(78);
        class48.method340(-1);
        class95.method797(-9);
        class183.method1242(false);
        class15.method88();
        class49.method345();
        class33.method219(arg0 ^ 0xAA4B);
        class176.method1220(6237);
        class53.method383((byte) 19);
        class46.method333((byte) 59);
        class112.method890(-1159911866);
        class5.method28(true);
        class192.method1281(arg0 ^ 0xAA03);
        class80.method678(81);
        class199.method1308((byte) -108);
        class124.method929(arg0 - 43671);
        class34.method228((byte) -78);
        class160.method1156((byte) 124);
        if (arg0 != 43594) {
            return;
        }
        class177.method1222(2);
        class25.method146(74);
        class65.method457(28345);
        class204.method1336(0);
        class60.method433();
        class91.method763();
        class117.method903(false);
        class147.method1046();
        class203.method1335((byte) 121);
        class36.method239(72);
        class78.method668();
        class195.method1292(true);
        class156.method1084(-1);
        class201.method1318();
        class104.method848();
        class126.method937(-193);
        class41.method308(false);
        class51.method368(17106);
        class169.method1198(-14813);
        class186.method1256(arg0 - 43561);
        class98.method812(4096);
        class87.method726(arg0 ^ 0xAA75);
        class101.method829(-125);
        class136.method987((byte) 126);
        class205.method1338(-107);
        class58.method420(124);
        class158.method1141(false);
        class193.method1284(-10453);
        class35.method233(-90);
        class122.method919((byte) -107);
        class178.method1226((byte) 28);
        class168.method1194(96);
        class99.method818(arg0 - 35989);
        class163.method1165((byte) 94);
        class94.method793(arg0 - 43591);
        class165.method1180(101);
        class90.method761(103);
        class187.method1260(-1);
        class125.method931((byte) 80);
        class188.method1267((byte) -76);
        class151.method1056(false);
        class132.method972((byte) -86);
        class88.method729(-83);
        class84.method714((byte) 62);
        class10.method53((byte) -22);
        class162.method1164((byte) -57);
        class181.method1238(50);
        class139.method999(206);
        class109.method870(4096);
        class194.method1286(32258);
        class70.method555(arg0 ^ 0xAA27);
        class44.method325(-84);
        class17.method96(-1950612276);
        class56.method414(125);
        class16.method93(arg0 - 43562);
        class100.method823(-13207);
        class148.method1048((byte) -122);
        class171.method1204(2048);
        class92.method769((byte) -126);
        class114.method896((byte) -111);
        class120.method917((byte) -33);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method164(int arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class40) {
            class40 var3 = (class40) arg1;
            arg1 = var3.field887;
            var2 = var3.field885 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        field531++;
        int var6 = 38 / ((-arg0 - 7) / 58);
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var2 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method165(int arg0) {
        field545++;
        if (arg0 != 22001) {
            method159((byte) -88);
        }
        boolean var2 = class90.method759((byte) 22);
        if (var2 && class134.field2826 && class202.field3991 != null) {
            class202.field3991.method439((byte) 101);
        }
        if (class151.field3124) {
            class37.method245(-1, class51.field1313);
            class18.method104(arg0 ^ 0x57A0, class51.field1313);
            if (class62.field1499 != null) {
                class62.field1499.method872(arg0 - 21984, class51.field1313);
            }
            this.method295((byte) -84);
            class181.method1239(arg0 ^ 0x55F1, class51.field1313);
            class30.method190(100, class51.field1313);
            if (class62.field1499 != null) {
                class62.field1499.method874(class51.field1313, (byte) 123);
            }
        }
        if (class86.field2005 == 0) {
            class167.method1191(class187.field3721, null, arg0 - 22000, class163.field3380);
        } else if (class86.field2005 == 5) {
            class56.method416(class14.field289, class33.field686, (byte) 69);
        } else if (class86.field2005 == 10) {
            class56.method416(class14.field289, class33.field686, (byte) 69);
        } else if (class86.field2005 == 20) {
            class56.method416(class14.field289, class33.field686, (byte) 69);
        } else if (class86.field2005 == 25) {
            if (class178.field3603 == 1) {
                if (class17.field358 < field548) {
                    class17.field358 = field548;
                }
                int var4 = (class17.field358 - field548) * 50 / class17.field358;
                class185.method1253(class163.method1168(-110, new class38[] { class198.field3925, class200.field3944, class151.method1059(var4, (byte) -114), class128.field2738 }), false, 1);
            } else if (class178.field3603 == 2) {
                if (class177.field3594 > class102.field2285) {
                    class102.field2285 = class177.field3594;
                }
                int var3 = (class102.field2285 - class177.field3594) * 50 / class102.field2285 + 50;
                class185.method1253(class163.method1168(-128, new class38[] { class198.field3925, class200.field3944, class151.method1059(var3, (byte) -114), class128.field2738 }), false, 1);
            } else {
                class185.method1253(class198.field3925, false, 1);
            }
        } else if (class86.field2005 == 30) {
            class94.method791(arg0 - 21999);
        } else if (class86.field2005 == 40) {
            class185.method1253(class163.method1168(-8, new class38[] { class95.field2145, class90.field2065, class42.field928 }), false, 1);
        }
        if (class86.field2005 == 30 && class143.field2980 == 0 && !class11.field235) {
            try {
                Graphics var5 = class51.field1313.getGraphics();
                for (int var6 = 0; var6 < class205.field4035; var6++) {
                    if (class10.field228[var6]) {
                        class57.field1443.method223(class166.field3434[var6], 64, class176.field3559[var6], class28.field552[var6], class113.field2526[var6], var5);
                        class10.field228[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class51.field1313.repaint();
            }
        } else if (class86.field2005 > 0) {
            try {
                Graphics var7 = class51.field1313.getGraphics();
                class57.field1443.method230(0, var7, 0, false);
                class11.field235 = false;
                for (int var8 = 0; var8 < class205.field4035; var8++) {
                    class10.field228[var8] = false;
                }
            } catch (Exception var10) {
                class51.field1313.repaint();
            }
        }
    }
}
