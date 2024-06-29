import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class180 {

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lai;")
    public static class10 field449 = class44.method278("p11_full", 105);

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[Lai;")
    public static class10[] field443 = new class10[100];

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lai;")
    private static class10 field455 = class44.method278("cyan:", -102);

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lai;")
    public static class10 field444 = field455;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lai;")
    public static class10 field452 = field455;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Ljava/awt/Frame;")
    public static Frame field448;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method186(int arg0) {
        field442++;
        class120.field2304++;
        if (class120.field2304 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class205.field3983 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class40.field667.setSeed((long) class205.field3983);
        }
        this.method193(arg0 ^ 0xFFFF83E2);
        class21.method157(0);
        class11.method74(arg0 - 10);
        class67.method441(-1);
        class19.method130((byte) 66);
        class162.method1071(65);
        if (class184.field3508 != null) {
            int var3 = class184.field3508.method670((byte) -93);
            class169.field3264 = var3;
        }
        if (class174.field3353 == 0) {
            class185.method1193((byte) 78);
            class40.method259(32);
        } else if (class174.field3353 == 5) {
            class135.method920(98, this);
            class185.method1193((byte) 78);
            class40.method259(arg0 + 21);
        } else if (class174.field3353 == 10) {
            class135.method920(arg0 ^ 0x69, this);
        } else if (class174.field3353 == 20) {
            class135.method920(98, this);
            class193.method1237((byte) -68);
        } else if (class174.field3353 == 25) {
            class163.method1078(89);
        }
        if (arg0 != 11) {
            this.method194((byte) -24);
        }
        if (class174.field3353 == 30) {
            class207.method1338(arg0 - 12559);
        } else if (class174.field3353 == 40) {
            class193.method1237((byte) -68);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method187(byte arg0) {
        field440++;
        method191(true);
        class10.method71((byte) -81);
        class180.method1160(-10138);
        class6.method15((byte) 86);
        class163.method1075((byte) -106);
        class104.method680((byte) 2);
        class114.method814(false);
        class91.method553(true);
        class111.method713(0);
        class85.method519(-13034);
        class87.method535((byte) 124);
        class125.method868(-24553);
        class96.method630(0);
        class92.method591();
        class100.method662((byte) -54);
        class200.method1300(0);
        class38.method252(2);
        class192.method1227((byte) -50);
        class32.method211(-16);
        class102.method669((byte) -24);
        class9.method33((byte) -119);
        class115.method817(0);
        class206.method1328((byte) -119);
        class201.method1303((byte) -89);
        class116.method826(-45);
        class77.method480(-1);
        class65.method431(0);
        class171.method1127(-72);
        class188.method1203(false);
        class118.method843((byte) -103);
        class119.method847(115);
        class53.method371((byte) 23);
        class160.method1066(-87);
        class34.method223(100);
        class164.method1094();
        class140.method951((byte) -66);
        class63.method418(true);
        class74.method462((byte) 37);
        class99.method646(31179);
        class15.method92((byte) -42);
        class50.method355(-15357);
        class122.method857(-32768);
        class186.method1200(false);
        class101.method666(-97);
        class134.method918(false);
        class112.method737();
        class66.method436(93);
        class103.method675();
        class152.method1034(913);
        class195.method1244(0);
        class27.method173(349335560);
        class97.method640(127);
        class80.method492(0);
        class137.method932(19246);
        class149.method1025(true);
        class21.method146((byte) -23);
        class144.method999((byte) 125);
        class24.method164(false);
        class95.method628(-115);
        class71.method452(4);
        class35.method236(98);
        class18.method126(3);
        class120.method850(false);
        class129.method898(-1);
        class194.method1241((byte) -54);
        class189.method1209((byte) -100);
        class168.method1117(-126);
        if (arg0 >= -74) {
            return;
        }
        class207.method1340((byte) -16);
        class62.method401();
        class196.method1249(0);
        class113.method741();
        class19.method127(127);
        class127.method877();
        class135.method922(-86);
        class106.method686((byte) -89);
        class4.method12(262144);
        class145.method1007(-6);
        class7.method22(false);
        class36.method245((byte) 0);
        class47.method298(true);
        class94.method620(78);
        class167.method1111();
        class185.method1194(-2942);
        class154.method1042((byte) 59);
        class67.method438(125);
        class20.method132(-72);
        class107.method690(32);
        class93.method611((byte) -67);
        class198.method1263();
        class117.method836(-1);
        class151.method1031(true);
        class121.method856(true);
        class3.method9(123);
        class1.method2(-1);
        class55.method378((byte) -70);
        class131.method909(-1401);
        class170.method1125(26355);
        class128.method892((byte) 109);
        class37.method247((byte) 96);
        class41.method262(13249);
        class5.method14(73);
        class56.method382(4959);
        class176.method1148((byte) 89);
        class51.method358();
        class153.method1041(2047);
        class139.method946(15);
        class29.method184(0);
        class42.method263(16711935);
        class162.method1073(-1303);
        class57.method386(127);
        class191.method1215(94);
        class79.method487((byte) 99);
        class133.method916(-1);
        class109.method699(-19518);
        class28.method179(101);
        class193.method1240(9);
        class70.method448((byte) 76);
        class165.method1097(-9323);
        class64.method421(true);
        class61.method398(0);
        class98.method644(0);
        class105.method682();
        class132.method910();
        class130.method908((byte) 77);
        class90.method550();
        class166.method1103((byte) 60);
        class82.method504((byte) -82);
        class202.method1313();
        class148.method1020((byte) 62);
        class39.method258((byte) 69);
        class155.method1049((byte) -105);
        class138.method943();
        class52.method363();
        class175.method1147(true);
        class169.method1121(98);
        class142.method962((byte) -98);
        class73.method458(-1);
        class84.method513((byte) 16);
        class44.method277(255);
        class141.method954(5978);
        class184.method1190(false);
        class172.method1131(-127);
        class33.method220(1);
        class46.method286(-334031132);
        class89.method547((byte) 126);
        class2.method4(false);
        class11.method73(-24);
        class83.method510(54);
        class68.method447((byte) 74);
        class146.method1011(2024629548);
        class49.method350(382);
        class13.method87((byte) -97);
        class147.method1019(7);
        class183.method1184(-81);
        class158.method1059((byte) -3);
        class43.method274(false);
        class30.method198(121);
        class179.method1156(-97);
        class203.method1320(-2);
        class75.method464(28942);
        class190.method1214((byte) -116);
        class159.method1061(80);
        class25.method166(32567);
        class126.method871(59);
        class157.method1055(105);
        class123.method858(true);
        class40.method260(3);
        class78.method486(0);
        class14.method88((byte) 115);
        class76.method469(7);
        class182.method1179((byte) 105);
        class58.method394(8982);
        class72.method454((byte) -125);
        class54.method377((byte) 58);
        class136.method929(0);
        class124.method863(0);
        class108.method696(126);
        class45.method283((byte) 78);
        class174.method1142((byte) -18);
        class205.method1321(0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I")
    public static final int method188(int arg0, int arg1, int arg2) {
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        int var4 = -48 / ((-arg2 - 41) / 46);
        while (arg1 != 0) {
            int var5 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var5;
        }
        field439++;
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method189(int arg0, int arg1) {
        class195.field3706 = null;
        class30.field469 = 0;
        if (arg0 <= 72) {
            field455 = null;
        }
        class171.field3311++;
        class89.field1567 = null;
        field450++;
        if (class186.field3546 == class133.field2494) {
            class186.field3546 = class146.field2785;
        } else {
            class186.field3546 = class133.field2494;
        }
        if (class171.field3311 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class174.field3353 <= 5) {
                this.method1166("js5connect_full", (byte) -52);
                class174.field3353 = 1000;
            } else {
                class144.field2757 = 3000;
            }
        } else if (class171.field3311 >= 2 && arg1 == 6) {
            this.method1166("js5connect_outofdate", (byte) -52);
            class174.field3353 = 1000;
        } else if (class171.field3311 >= 4) {
            if (class174.field3353 <= 5) {
                this.method1166("js5connect", (byte) -52);
                class174.field3353 = 1000;
            } else {
                class144.field2757 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field454++;
        if (!this.method1169(48)) {
            return;
        }
        class191.field3630 = Integer.parseInt(this.getParameter("worldid"));
        class44.field720 = Integer.parseInt(this.getParameter("modewhat"));
        class128.field2427 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class154.method1043(64);
        } else {
            class114.method778(-28823);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class25.field377 = true;
        } else {
            class25.field377 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class195.method1243(116);
            class10.field131 = class175.field3364;
            class63.field1057 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class73.field1249 = 1;
        } else {
            class73.field1249 = 0;
        }
        try {
            class75.field1305 = Integer.parseInt(this.getParameter("js"));
            class114.field2175 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class11.field179 = this.getCodeBase().getHost();
        this.method1170(477, 27910, 503, class44.field720 + 32, 765);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field446++;
        try {
            if (arg0.length != 7) {
                class93.method610((byte) -42);
            }
            class191.field3630 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class128.field2427 = 0;
            } else if (arg0[1].equals("office")) {
                class128.field2427 = 1;
            } else if (arg0[1].equals("local")) {
                class128.field2427 = 2;
            } else {
                class93.method610((byte) 127);
            }
            if (arg0[2].equals("live")) {
                class44.field720 = 0;
            } else if (arg0[2].equals("rc")) {
                class44.field720 = 1;
            } else if (arg0[2].equals("wip")) {
                class44.field720 = 2;
            } else {
                class93.method610((byte) -26);
            }
            if (arg0[3].equals("lowmem")) {
                class154.method1043(64);
            } else if (arg0[3].equals("highmem")) {
                class114.method778(-28823);
            } else {
                class93.method610((byte) 122);
            }
            if (arg0[4].equals("free")) {
                class25.field377 = false;
            } else if (arg0[4].equals("members")) {
                class25.field377 = true;
            } else {
                class93.method610((byte) 123);
            }
            if (arg0[5].equals("english")) {
                class63.field1057 = 0;
            } else if (arg0[5].equals("german")) {
                class195.method1243(94);
                class63.field1057 = 1;
                class10.field131 = class175.field3364;
            } else {
                class93.method610((byte) -4);
            }
            if (arg0[6].equals("game0")) {
                class73.field1249 = 0;
            } else if (arg0[6].equals("game1")) {
                class73.field1249 = 1;
            } else {
                class93.method610((byte) 120);
            }
            class11.field179 = "127.0.0.1";
            client var1 = new client();
            var1.method1161(class44.field720 + 32, 16, 1, 765, "runescape", 503, 477);
            field448.setLocation(40, 40);
        } catch (Exception var3) {
            class109.method700(var3, null, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method190(int arg0) {
        boolean var2 = class174.method1139(0);
        if (var2 && class61.field1040 && class153.field2950 != null) {
            class153.field2950.method1335(-128);
        }
        int var3 = 75 / ((12 - arg0) / 47);
        if (class10.field125) {
            class104.method679(class134.field2513, -125);
            class58.method395(class134.field2513, (byte) -69);
            if (class184.field3508 != null) {
                class184.field3508.method673(class134.field2513, (byte) 32);
            }
            this.method1168(-46);
            class147.method1013(class134.field2513, (byte) -87);
            class166.method1099((byte) 45, class134.field2513);
            if (class184.field3508 != null) {
                class184.field3508.method668(15312, class134.field2513);
            }
        }
        field445++;
        if (class174.field3353 == 0) {
            class45.method282(class10.field139, null, class109.field2026, (byte) -65);
        } else if (class174.field3353 == 5) {
            class49.method352(class67.field1162, 302, class97.field1795);
        } else if (class174.field3353 == 10) {
            class49.method352(class67.field1162, 302, class97.field1795);
        } else if (class174.field3353 == 20) {
            class49.method352(class67.field1162, 302, class97.field1795);
        } else if (class174.field3353 == 25) {
            if (class136.field2553 == 1) {
                if (class61.field1037 > class89.field1573) {
                    class89.field1573 = class61.field1037;
                }
                int var5 = (class89.field1573 - class61.field1037) * 50 / class89.field1573;
                class68.method444(-114, false, class67.method440(0, new class10[] { class130.field2460, class196.field3707, class119.method846(0, var5), class195.field3700 }));
            } else if (class136.field2553 == 2) {
                if (class83.field1455 > class75.field1284) {
                    class75.field1284 = class83.field1455;
                }
                int var4 = (class75.field1284 - class83.field1455) * 50 / class75.field1284 + 50;
                class68.method444(-118, false, class67.method440(0, new class10[] { class130.field2460, class196.field3707, class119.method846(0, var4), class195.field3700 }));
            } else {
                class68.method444(-106, false, class130.field2460);
            }
        } else if (class174.field3353 == 30) {
            class10.method46(115);
        } else if (class174.field3353 == 40) {
            class68.method444(-119, false, class67.method440(0, new class10[] { class29.field436, class128.field2440, class53.field954 }));
        }
        if (class174.field3353 == 30 && class93.field1682 == 0 && !class87.field1550) {
            try {
                Graphics var8 = class134.field2513.getGraphics();
                for (int var9 = 0; var9 < class11.field175; var9++) {
                    if (class152.field2919[var9]) {
                        class190.field3622.method968(var8, class70.field1201[var9], class4.field32[var9], class33.field499[var9], 0, class67.field1176[var9]);
                        class152.field2919[var9] = false;
                    }
                }
            } catch (Exception var10) {
                class134.field2513.repaint();
            }
        } else if (class174.field3353 > 0) {
            try {
                Graphics var6 = class134.field2513.getGraphics();
                class190.field3622.method969(0, var6, 13, 0);
                class87.field1550 = false;
                for (int var7 = 0; var7 < class11.field175; var7++) {
                    class152.field2919[var7] = false;
                }
            } catch (Exception var11) {
                class134.field2513.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public static void method191(boolean arg0) {
        field444 = null;
        field449 = null;
        field443 = null;
        field448 = null;
        field452 = null;
        field455 = null;
        if (!arg0) {
            field451 = -68;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method192(int arg0) {
        if (arg0 != 4581) {
            return;
        }
        field441++;
        if (class44.field723 >= 4) {
            this.method1166("js5crc", (byte) -52);
            class174.field3353 = 1000;
            return;
        }
        if (class64.field1066 >= 4) {
            if (class174.field3353 <= 5) {
                this.method1166("js5io", (byte) -52);
                class174.field3353 = 1000;
                return;
            }
            class144.field2757 = 3000;
            class64.field1066 = 3;
        }
        if (class144.field2757-- > 0) {
            return;
        }
        try {
            if (class30.field469 == 0) {
                class89.field1567 = class120.field2313.method499(class186.field3546, class11.field179, arg0 - 4652);
                class30.field469++;
            }
            if (class30.field469 == 1) {
                if (class89.field1567.field352 == 2) {
                    this.method189(102, -1);
                    return;
                }
                if (class89.field1567.field352 == 1) {
                    class30.field469++;
                }
            }
            if (class30.field469 == 2) {
                class195.field3706 = new class91((Socket) class89.field1567.field353, class120.field2313);
                class114 var2 = new class114(5);
                var2.method781(0, 15);
                var2.method786(477, (byte) -79);
                class195.field3706.method557(5, var2.field2160, 0, arg0 ^ 0x1191);
                class30.field469++;
                class119.field2299 = class80.method491(2);
            }
            if (class30.field469 == 3) {
                if (class174.field3353 <= 5 || class195.field3706.method551(false) > 0) {
                    int var3 = class195.field3706.method554((byte) 17);
                    if (var3 != 0) {
                        this.method189(81, var3);
                        return;
                    }
                    class30.field469++;
                } else if (class80.method491(2) - class119.field2299 > 30000L) {
                    this.method189(103, -2);
                    return;
                }
            }
            if (class30.field469 == 4) {
                class64.method419(class195.field3706, (byte) 54, class174.field3353 > 20);
                class30.field469 = 0;
                class89.field1567 = null;
                class195.field3706 = null;
                class171.field3311 = 0;
            }
        } catch (IOException var4) {
            this.method189(87, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method193(int arg0) {
        field438++;
        if (class174.field3353 == 1000) {
            return;
        }
        boolean var2 = class137.method934(arg0 ^ 0x7C16);
        if (arg0 != -31767) {
            this.method194((byte) 30);
        }
        if (!var2) {
            this.method192(arg0 + 36348);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method194(byte arg0) {
        field456++;
        if (class42.field701 != null) {
            class42.field701.field1948 = false;
        }
        class42.field701 = null;
        if (class188.field3593 != null) {
            class188.field3593.method552(-5034);
            class188.field3593 = null;
        }
        class109.method698(112);
        class171.method1126(-61);
        class184.field3508 = null;
        if (arg0 <= 72) {
            main(null);
        }
        if (class153.field2950 != null) {
            class153.field2950.method1324(16750);
        }
        if (class180.field3418 != null) {
            class180.field3418.method1324(16750);
        }
        class25.method168((byte) 68);
        class7.method27((byte) 107);
        try {
            if (class32.field486 != null) {
                class32.field486.method521((byte) 94);
            }
            if (class171.field3301 != null) {
                for (int var2 = 0; var2 < class171.field3301.length; var2++) {
                    if (class171.field3301[var2] != null) {
                        class171.field3301[var2].method521((byte) 104);
                    }
                }
            }
            if (class125.field2395 != null) {
                class125.field2395.method521((byte) 107);
            }
            if (class205.field3988 != null) {
                class205.field3988.method521((byte) 103);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method195(int arg0) {
        if (class73.field1249 == 1) {
            class93.field1681 = class133.field2502;
            class24.field365 = class185.field3518;
            class171.field3318 = class189.field3617;
            class183.field3482 = class191.field3631;
        } else {
            class24.field365 = class206.field3999;
            class183.field3482 = class165.field3163;
            class93.field1681 = class36.field555;
            class171.field3318 = class53.field943;
        }
        class146.field2785 = class128.field2427 == 0 ? 443 : class191.field3630 + 50000;
        class133.field2494 = class128.field2427 == 0 ? 43594 : class191.field3630 + 40000;
        class186.field3546 = class133.field2494;
        class129.method899((byte) -14);
        field447++;
        class147.method1013(class134.field2513, (byte) -97);
        class166.method1099((byte) 67, class134.field2513);
        if (arg0 != -10153) {
            this.method194((byte) -109);
        }
        class184.field3508 = class1.method3((byte) -114);
        if (class184.field3508 != null) {
            class184.field3508.method668(15312, class134.field2513);
        }
        class106.field1964 = class81.field1418;
        try {
            if (class120.field2313.field1417 != null) {
                class32.field486 = new class85(class120.field2313.field1417, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class171.field3301[var2] = new class85(class120.field2313.field1420[var2], 6000, 0);
                }
                class125.field2395 = new class85(class120.field2313.field1415, 6000, 0);
                class158.field3053 = new class87(255, class32.field486, class125.field2395, 500000);
                class205.field3988 = new class85(class120.field2313.field1413, 24, 0);
                class120.field2313.field1420 = null;
                class120.field2313.field1413 = null;
                class120.field2313.field1417 = null;
                class120.field2313.field1415 = null;
            }
        } catch (IOException var3) {
            class32.field486 = null;
            class158.field3053 = null;
            class125.field2395 = null;
            class205.field3988 = null;
        }
        if (class128.field2427 != 0) {
            class123.field2358 = true;
        }
    }
}
