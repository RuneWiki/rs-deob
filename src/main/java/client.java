import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class34 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lkd;")
    private static class73 field593 = class126.method1070((byte) -66, "You have only just left another world)3");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lkd;")
    private static class73 field603 = class126.method1070((byte) -66, "Loaded title screen");

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
    public static boolean field594 = false;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lkd;")
    public static class73 field598 = class126.method1070((byte) -66, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lkd;")
    public static class73 field611 = field593;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lkd;")
    public static class73 field606 = field603;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lkd;")
    private static class73 field614 = class126.method1070((byte) -66, "Connection lost");

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lkd;")
    public static class73 field615 = class126.method1070((byte) -66, "<col=ffffff>");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lkd;")
    public static class73 field599 = field614;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lua;")
    public static class137 field620;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    public static int[] field607;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method173(byte arg0) {
        if (class92.field2368 != null) {
            class92.field2368.field3527 = false;
        }
        field619++;
        class92.field2368 = null;
        if (class31.field862 != null) {
            class31.field862.method1135(-108);
            class31.field862 = null;
        }
        class122.method1041((byte) 84);
        class15.method121((byte) -45);
        class48.field1268 = null;
        if (class73.field1891 != null) {
            class73.field1891.method400(2000);
        }
        if (class21.field582 != null) {
            class21.field582.method400(2000);
        }
        class16.method129((byte) 98);
        class48.method391((byte) -78);
        try {
            if (arg0 != 44) {
                method178(-92, (byte) 78, -88);
            }
            if (class119.field3026 != null) {
                class119.field3026.method819(-1);
            }
            if (class141.field3511 != null) {
                for (int var2 = 0; var2 < class141.field3511.length; var2++) {
                    if (class141.field3511[var2] != null) {
                        class141.field3511[var2].method819(-1);
                    }
                }
            }
            if (class143.field3562 != null) {
                class143.field3562.method819(-1);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field612++;
        if (!this.method267((byte) 121)) {
            return;
        }
        class115.field2906 = Integer.parseInt(this.getParameter("worldid"));
        class53.field1423 = Integer.parseInt(this.getParameter("modewhat"));
        class50.field1353 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class150.method1209(18);
        } else {
            class58.method495(27);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class50.field1362 = true;
        } else {
            class50.field1362 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class28.method217((byte) 124);
            class9.field290 = class136.field3393;
            class143.field3558 = 1;
        }
        try {
            class92.field2375 = Integer.parseInt(this.getParameter("js"));
            class109.field2673 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var4) {
        }
        class26.field753 = this.getCodeBase().getHost();
        this.method272(503, class53.field1423 + 32, 457, 3, 765);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method174(int arg0) {
        field613++;
        class22.field630 = class50.field1353 == 0 ? 443 : class115.field2906 + 50000;
        class32.field891 = class50.field1353 == 0 ? 43594 : class115.field2906 + 40000;
        if (arg0 != 500000) {
            return;
        }
        class81.field2047 = class32.field891;
        method176((byte) 125);
        class98.method805(arg0 ^ 0xFFF85EDF, class18.field519);
        class13.method112(arg0 ^ 0x7B8C3, class18.field519);
        class48.field1268 = class83.method704((byte) -5);
        if (class48.field1268 != null) {
            class48.field1268.method802(class18.field519, 0);
        }
        class89.field2268 = class148.field3626;
        try {
            if (class107.field2637.field3618 != null) {
                class119.field3026 = new class102(class107.field2637.field3618, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class141.field3511[var2] = new class102(class107.field2637.field3624[var2], 6000, 0);
                }
                class143.field3562 = new class102(class107.field2637.field3628, 6000, 0);
                class50.field1312 = new class109(255, class119.field3026, class143.field3562, 500000);
                class107.field2637.field3628 = null;
                class107.field2637.field3618 = null;
                class107.field2637.field3624 = null;
            }
        } catch (IOException var3) {
            class119.field3026 = null;
            class143.field3562 = null;
            class50.field1312 = null;
        }
        if (class50.field1353 != 0) {
            class92.field2378 = true;
        }
        class150.field3714 = new class1();
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class71.method592(1);
            }
            class115.field2906 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class50.field1353 = 0;
            } else if (arg0[1].equals("office")) {
                class50.field1353 = 1;
            } else if (arg0[1].equals("local")) {
                class50.field1353 = 2;
            } else {
                class71.method592(1);
            }
            if (arg0[2].equals("live")) {
                class53.field1423 = 0;
            } else if (arg0[2].equals("rc")) {
                class53.field1423 = 1;
            } else if (arg0[2].equals("wip")) {
                class53.field1423 = 2;
            } else {
                class71.method592(1);
            }
            if (arg0[3].equals("lowmem")) {
                class150.method1209(18);
            } else if (arg0[3].equals("highmem")) {
                class58.method495(102);
            } else {
                class71.method592(1);
            }
            if (arg0[4].equals("free")) {
                class50.field1362 = false;
            } else if (arg0[4].equals("members")) {
                class50.field1362 = true;
            } else {
                class71.method592(1);
            }
            if (arg0[5].equals("english")) {
                class143.field3558 = 0;
            } else if (arg0[5].equals("german")) {
                class28.method217((byte) -106);
                class9.field290 = class136.field3393;
                class143.field3558 = 1;
            } else {
                class71.method592(1);
            }
            class26.field753 = "127.0.0.1";
            client var1 = new client();
            var1.method276("runescape", 16, 457, 503, -1, class53.field1423 + 32, 765);
        } catch (Exception var3) {
            class111.method894(null, var3, (byte) 2);
        }
        field610++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method175(int arg0) {
        class49.field1308++;
        this.method187((byte) -92);
        field600++;
        class60.method507(-58);
        class44.method329((byte) -72);
        class92.method771((byte) 50);
        if (arg0 != 5) {
            field598 = null;
        }
        class136.method1113(0);
        class104.method833(-339);
        if (class48.field1268 != null) {
            int var2 = class48.field1268.method801((byte) -113);
            class83.field2087 += var2;
            class54.field1448 = var2;
        }
        if (class1.field35 == 0) {
            class1.method9(0);
            class150.method1208((byte) -110);
        } else if (class1.field35 == 5) {
            class48.method387((byte) 101, this);
            class1.method9(arg0 ^ 0x5);
            class150.method1208((byte) -101);
        } else if (class1.field35 == 10) {
            class48.method387((byte) 127, this);
        } else if (class1.field35 == 20) {
            class48.method387((byte) 97, this);
            class122.method1044((byte) -16);
        } else if (class1.field35 == 25) {
            class28.method228(arg0 ^ 0xFFFFFF85);
        }
        if (class1.field35 == 30) {
            class79.method681((byte) -108);
        } else if (class1.field35 == 35) {
            class79.method681((byte) -120);
        } else if (class1.field35 == 40) {
            class122.method1044((byte) -64);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private static final void method176(byte arg0) {
        field596++;
        if (class148.field3616.toLowerCase().indexOf("microsoft") == -1) {
            class5.field187[93] = 43;
            class5.field187[91] = 42;
            class5.field187[47] = 73;
            class5.field187[59] = 57;
            class5.field187[92] = 74;
            if (class148.field3621 == null) {
                class5.field187[192] = 58;
                class5.field187[222] = 59;
            } else {
                class5.field187[222] = 58;
                class5.field187[192] = 28;
                class5.field187[520] = 59;
            }
            class5.field187[44] = 71;
            class5.field187[46] = 72;
            class5.field187[61] = 27;
            class5.field187[45] = 26;
        } else {
            class5.field187[192] = 58;
            class5.field187[219] = 42;
            class5.field187[186] = 57;
            class5.field187[220] = 74;
            class5.field187[223] = 28;
            class5.field187[188] = 71;
            class5.field187[190] = 72;
            class5.field187[221] = 43;
            class5.field187[222] = 59;
            class5.field187[187] = 27;
            class5.field187[191] = 73;
            class5.field187[189] = 26;
        }
        int var1 = 52 % ((69 - arg0) / 54);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmf;I)V")
    public static final void method177(class89 arg0, int arg1) {
        if (arg0.field2281 == 0) {
            arg0.field2293 = 1024;
        }
        if (arg0.field2281 == 1) {
            arg0.field2293 = 1536;
        }
        int var2 = arg0.field2238 - class49.field1308;
        int var3 = arg0.field2279 * 128 + arg0.field2233 * 64;
        field601++;
        int var4 = arg0.field2292 * 128 + arg0.field2233 * 64;
        if (arg1 != 1024) {
            field615 = null;
        }
        if (arg0.field2281 == 2) {
            arg0.field2293 = 0;
        }
        arg0.field2237 = 0;
        arg0.field2264 += (var4 - arg0.field2264) / var2;
        if (arg0.field2281 == 3) {
            arg0.field2293 = 512;
        }
        arg0.field2277 += (var3 - arg0.field2277) / var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)I")
    public static final int method178(int arg0, byte arg1, int arg2) {
        field609++;
        class2 var3 = (class2) class70.field1768.method1099(arg1 + 148, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field151.length) {
            return arg1 == -109 ? var3.field151[arg0] : 71;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method179(int arg0) {
        field620 = null;
        field599 = null;
        field611 = null;
        field614 = null;
        if (arg0 != 1000) {
            field615 = null;
        }
        field606 = null;
        field615 = null;
        field598 = null;
        field603 = null;
        field593 = null;
        field607 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method180(int arg0, byte arg1) {
        field608++;
        class36.field1002 = null;
        class36.field1006 = 0;
        class126.field3242++;
        if (arg1 >= -32) {
            return;
        }
        if (class81.field2047 == class32.field891) {
            class81.field2047 = class22.field630;
        } else {
            class81.field2047 = class32.field891;
        }
        class33.field902 = null;
        if (class126.field3242 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class1.field35 > 5) {
                class112.field2800 = 3000;
            } else {
                this.method268(50, "js5connect_full");
                class1.field35 = 1000;
            }
        } else if (class126.field3242 >= 2 && arg0 == 6) {
            this.method268(50, "js5connect_outofdate");
            class1.field35 = 1000;
        } else if (class126.field3242 >= 4) {
            if (class1.field35 > 5) {
                class112.field2800 = 3000;
            } else {
                this.method268(50, "js5connect");
                class1.field35 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static final void method181(byte arg0) {
        field602++;
        class139.field3458++;
        if (arg0 != 3) {
            method179(24);
        }
        class121.field3079.method1215(122, 190);
        if (class105.field2624 != -1) {
            class53.method425(class105.field2624, (byte) -83);
            class149.field3666 = true;
            class105.field2624 = -1;
            class38.field1028 = true;
            class143.field3574 = -1;
        }
        if (class129.field3246 != -1) {
            class53.method425(class129.field3246, (byte) -114);
            class132.field3304 = true;
            class143.field3574 = -1;
            class129.field3246 = -1;
        }
        if (class81.field2033 != -1) {
            class53.method425(class81.field2033, (byte) -90);
            class81.field2033 = -1;
            class45.method337(30, (byte) -101);
        }
        if (class18.field528 != -1) {
            class53.method425(class18.field528, (byte) 65);
            class18.field528 = -1;
        }
        if (class52.field1393 != -1) {
            class53.method425(class52.field1393, (byte) -73);
            class143.field3574 = -1;
            class52.field1393 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method182(int arg0) {
        method179(arg0 + 995);
        class73.method631((byte) -67);
        field621++;
        class34.method266(arg0 - 123);
        class30.method249(30);
        class11.method102(-128);
        class142.method1154(87);
        class114.method931((byte) 110);
        class140.method1145(1);
        class137.method1125(true);
        class102.method822((byte) 114);
        class109.method875(9099);
        class9.method91((byte) -114);
        class150.method1214((byte) 122);
        class46.method348();
        class8.method49();
        class47.method364(arg0 ^ 0xFFFFE07E);
        class118.method1022(arg0 ^ 0xFFFFFF8D);
        class61.method520((byte) 87);
        class1.method1(18299);
        class100.method813((byte) 121);
        class131.method1097(-627);
        class80.method688((byte) 97);
        class50.method396((byte) 104);
        class48.method385((byte) -126);
        class54.method432(arg0 + 1995);
        class36.method286(-1610612736);
        class89.method746(arg0 + 507);
        class132.method1104((byte) -45);
        class28.method223(-106);
        class141.method1149(false);
        class78.method677(true);
        class104.method836(-113);
        class64.method535((byte) -17);
        class91.method748();
        class67.method554();
        class33.method262((byte) -106);
        class94.method779(17378);
        class52.method419((byte) -85);
        class55.method442(7846);
        class39.method304(26941);
        class112.method911((byte) 73);
        class18.method151(-110);
        class103.method831(arg0 ^ 0xFFFFFFA0);
        class16.method127((byte) -128);
        if (arg0 != 5) {
            field599 = null;
        }
        class26.method206(0);
        class31.method252(false);
        class134.method1109();
        class133.method1108(40);
        class81.method692(arg0 + 8270331);
        class146.method1165((byte) -122);
        class45.method334(arg0 ^ 0xFFFFFFFA);
        class111.method908(-2);
        class153.method1222(true);
        class58.method494(-128);
        class116.method1012(true);
        class43.method322(false);
        class105.method839(-10075);
        class72.method604(-83);
        class151.method1217(-2);
        class5.method25(15);
        class74.method645((byte) -50);
        class143.method1156(24544);
        class76.method658((byte) 110);
        class13.method115(false);
        class29.method245();
        class17.method138();
        class145.method1164((byte) -33);
        class120.method1033((byte) 106);
        class62.method522((byte) 1);
        class99.method808(-1);
        class88.method729();
        class66.method545(103);
        class110.method883(-122);
        class38.method301(arg0 ^ 0x25);
        class12.method104((byte) -107);
        class123.method1051((byte) -62);
        class63.method529(arg0 ^ 0xFFFF966B);
        class149.method1193(arg0 + 108);
        class126.method1069(-8);
        class115.method981(111);
        class121.method1040((byte) 124);
        class41.method306((byte) -124);
        class51.method414((byte) -23);
        class32.method259(256);
        class42.method318(true);
        class84.method709(false);
        class6.method27();
        class129.method1082((byte) 119);
        class22.method188((byte) -14);
        class71.method597((byte) -113);
        class82.method694((byte) 102);
        class2.method16((byte) 41);
        class23.method192((byte) -67);
        class60.method504(5000);
        class98.method806((byte) 111);
        class92.method773((byte) -84);
        class7.method33();
        class83.method705(arg0 + 90);
        class20.method167(0);
        class79.method682(124);
        class125.method1057((byte) 127);
        class77.method668(11);
        class24.method198(arg0 ^ 0xFFFFFFFA);
        class53.method422(arg0 ^ 0x5);
        class87.method722((byte) 125);
        class44.method332(arg0 - 3);
        class21.method171((byte) 121);
        class119.method1029(-13972);
        class15.method119(-1);
        class70.method586(1);
        class14.method117(true);
        class107.method867(0);
        class37.method297((byte) 120);
        class127.method1076();
        class96.method796();
        class49.method393(-43);
        class124.method1053();
        class86.method718(129);
        class69.method576();
        class25.method203(-113);
        class136.method1114((byte) -41);
        class139.method1130(-1);
        class95.method785();
        class130.method1089();
        class19.method156((byte) 50);
        class57.method491(false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method183(boolean arg0) {
        field592++;
        boolean var2 = class44.method333((byte) -51);
        if (var2 && class12.field402 && class73.field1891 != null) {
            class73.field1891.method411(2000);
        }
        if (class42.field1132) {
            class118.method1024(class18.field519, arg0);
            class119.method1030((byte) 126, class18.field519);
            if (class48.field1268 != null) {
                class48.field1268.method800((byte) -113, class18.field519);
            }
            this.method270(0);
            class98.method805(-1, class18.field519);
            class13.method112(6627, class18.field519);
            if (class48.field1268 != null) {
                class48.field1268.method802(class18.field519, 0);
            }
        }
        if (class1.field35 == 0) {
            class146.method1167(class116.field2969, null, class42.field1135, 991);
        } else if (class1.field35 == 5) {
            class11.method101(class58.field1553, class114.field2860, 16776960);
        } else if (class1.field35 == 10) {
            class11.method101(class58.field1553, class114.field2860, 16776960);
        } else if (class1.field35 == 20) {
            class11.method101(class58.field1553, class114.field2860, 16776960);
        } else if (class1.field35 == 25) {
            if (class126.field3240 == 1) {
                if (class86.field2177 > class9.field308) {
                    class9.field308 = class86.field2177;
                }
                int var4 = (class9.field308 - class86.field2177) * 50 / class9.field308;
                class11.method97(class137.field3406, false, true, class32.method258(-62, new class73[] { class19.field533, class78.method676(var4, -79), class23.field660 }));
            } else if (class126.field3240 == 2) {
                if (class18.field529 < class81.field2053) {
                    class18.field529 = class81.field2053;
                }
                int var3 = (class18.field529 - class81.field2053) * 50 / class18.field529 + 50;
                class11.method97(class137.field3406, false, true, class32.method258(-82, new class73[] { class19.field533, class78.method676(var3, -48), class23.field660 }));
            } else {
                class11.method97(class137.field3406, false, false, null);
            }
        } else if (class1.field35 == 30) {
            class70.method589((byte) 106);
        } else if (class1.field35 == 35) {
            class112.method915(24004);
        } else if (class1.field35 == 40) {
            class11.method97(field599, false, false, class5.field179);
        }
        class78.field1996 = 0;
        class83.field2087 = 0;
        if (arg0) {
            method184(-33, -60, (byte) 59, 57);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)V")
    public static final void method184(int arg0, int arg1, byte arg2, int arg3) {
        field617++;
        if (arg2 != -87) {
            return;
        }
        class1 var4 = class34.method269(arg3, false, arg1);
        if (var4 != null && var4.field75 != null) {
            class57.method490(var4.field75, 0, (byte) 78, null, 0, var4, 0);
        }
        class50.field1329 = true;
        class145.field3592 = arg3;
        class94.field2392 = arg0;
        class86.field2176 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method185(byte arg0) {
        field604++;
        if (class30.field856 >= 4) {
            this.method268(50, "js5crc");
            class1.field35 = 1000;
            return;
        }
        if (class104.field2597 >= 4) {
            if (class1.field35 <= 5) {
                this.method268(50, "js5io");
                class1.field35 = 1000;
                return;
            }
            class104.field2597 = 3;
            class112.field2800 = 3000;
        }
        if (class112.field2800-- > 0) {
            return;
        }
        try {
            if (class36.field1006 == 0) {
                class33.field902 = class107.field2637.method1178(2280, class81.field2047, class26.field753);
                class36.field1006++;
            }
            if (class36.field1006 == 1) {
                if (class33.field902.field1695 == 2) {
                    this.method180(-1, (byte) -43);
                    return;
                }
                if (class33.field902.field1695 == 1) {
                    class36.field1006++;
                }
            }
            if (class36.field1006 == 2) {
                class36.field1002 = new class140((Socket) class33.field902.field1693, class107.field2637);
                class114 var2 = new class114(5);
                var2.method956((byte) 10, 15);
                var2.method937(-1370716840, 457);
                class36.field1002.method1143(5000, 0, var2.field2880, 5);
                class36.field1006++;
                class104.field2599 = class146.method1168(-77);
            }
            if (class36.field1006 == 3) {
                if (class1.field35 <= 5 || class36.field1002.method1136(0) > 0) {
                    int var3 = class36.field1002.method1139(-5440);
                    if (var3 != 0) {
                        this.method180(var3, (byte) -92);
                        return;
                    }
                    class36.field1006++;
                } else if (class146.method1168(-111) - class104.field2599 > 30000L) {
                    this.method180(-2, (byte) -74);
                    return;
                }
            }
            int var4 = -31 / ((44 - arg0) / 45);
            if (class36.field1006 == 4) {
                method186(class36.field1002, class1.field35 > 20, -1);
                class126.field3242 = 0;
                class36.field1002 = null;
                class36.field1006 = 0;
                class33.field902 = null;
            }
        } catch (IOException var5) {
            this.method180(-3, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lud;ZI)V")
    private static final void method186(class140 arg0, boolean arg1, int arg2) {
        if (class80.field2028 != null) {
            try {
                class80.field2028.method1135(-121);
            } catch (Exception var8) {
            }
            class80.field2028 = null;
        }
        field605++;
        class80.field2028 = arg0;
        class111.method892(-2, arg1);
        class103.field2564 = 0;
        class66.field1704 = null;
        class116.field2941.field2816 = 0;
        class81.field2044 = null;
        while (true) {
            class122 var3 = (class122) class38.field1040.method1096((byte) 98);
            if (var3 == null) {
                while (true) {
                    class122 var4 = (class122) class74.field1911.method1096((byte) 98);
                    if (var4 == null) {
                        if (~class139.field3460 != arg2) {
                            try {
                                class114 var5 = new class114(4);
                                var5.method956((byte) 10, 4);
                                var5.method956((byte) 10, class139.field3460);
                                var5.method947(0, arg2 + 23662);
                                class80.field2028.method1143(5000, 0, var5.field2880, 4);
                            } catch (IOException var7) {
                                try {
                                    class80.field2028.method1135(-127);
                                } catch (Exception var6) {
                                }
                                class104.field2597++;
                                class80.field2028 = null;
                            }
                        }
                        class14.field434 = 0;
                        class28.field826 = class146.method1168(-84);
                        return;
                    }
                    class80.field2017.method655(var4, (byte) 86);
                    class115.field2894.method1093((byte) -59, var4, var4.field3522);
                    class61.field1599--;
                    class102.field2529++;
                }
            }
            class79.field2006.method1093((byte) 117, var3, var3.field3522);
            class57.field1512++;
            class143.field3564--;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method187(byte arg0) {
        field597++;
        if (class1.field35 == 1000) {
            return;
        }
        boolean var2 = class89.method741(-102);
        int var3 = 99 / ((arg0 + 43) / 34);
        if (!var2) {
            this.method185((byte) 109);
        }
    }
}
