import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class109 {

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field520 = -1;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static volatile int field522 = 0;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Loc;")
    private static class99 field521 = class48.method402((byte) -104, " ");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Loc;")
    public static class99 field513 = field521;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Loc;")
    public static class99 field528 = class48.method402((byte) -104, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
    public static int[] field523 = new int[128];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lra;")
    public static class115 field529;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Z")
    public static boolean field531;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field530++;
        if (!this.method936((byte) 92)) {
            return;
        }
        class137.field3418 = Integer.parseInt(this.getParameter("worldid"));
        class15.field362 = Integer.parseInt(this.getParameter("modewhat"));
        class133.field3248 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class122.method1016(125);
        } else {
            class137.method1143(true);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class143.field3554 = true;
        } else {
            class143.field3554 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class112.method954(192);
            class137.field3423 = class128.field3141;
            class77.field1921 = 1;
        }
        try {
            class30.field715 = Integer.parseInt(this.getParameter("js"));
            class60.field1620 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var4) {
        }
        class122.field2968 = this.getCodeBase().getHost();
        this.method935(503, (byte) -56, class15.field362 + 32, 765, 453);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static final void method195(byte arg0) {
        class39.field965.method865(false);
        int var1 = class39.field965.method864(8, -25644);
        if (var1 < class86.field2151) {
            for (int var2 = var1; var2 < class86.field2151; var2++) {
                class140.field3471[class91.field2224++] = class9.field232[var2];
            }
        }
        field515++;
        if (var1 > class86.field2151) {
            throw new RuntimeException("gnpov1");
        }
        class86.field2151 = 0;
        if (arg0 > -36) {
            method196((byte) -13);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class9.field232[var3];
            class149 var5 = class149.field3691[var4];
            int var6 = class39.field965.method864(1, -25644);
            if (var6 == 0) {
                class9.field232[class86.field2151++] = var4;
                var5.field3068 = class101.field2444;
            } else {
                int var7 = class39.field965.method864(2, -25644);
                if (var7 == 0) {
                    class9.field232[class86.field2151++] = var4;
                    var5.field3068 = class101.field2444;
                    class126.field3041[class141.field3493++] = var4;
                } else if (var7 == 1) {
                    class9.field232[class86.field2151++] = var4;
                    var5.field3068 = class101.field2444;
                    int var8 = class39.field965.method864(3, -25644);
                    var5.method1037(119, var8, false);
                    int var9 = class39.field965.method864(1, -25644);
                    if (var9 == 1) {
                        class126.field3041[class141.field3493++] = var4;
                    }
                } else if (var7 == 2) {
                    class9.field232[class86.field2151++] = var4;
                    var5.field3068 = class101.field2444;
                    int var10 = class39.field965.method864(3, -25644);
                    var5.method1037(51, var10, true);
                    int var11 = class39.field965.method864(3, -25644);
                    var5.method1037(-28, var11, true);
                    int var12 = class39.field965.method864(1, -25644);
                    if (var12 == 1) {
                        class126.field3041[class141.field3493++] = var4;
                    }
                } else if (var7 == 3) {
                    class140.field3471[class91.field2224++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method196(byte arg0) {
        field529 = null;
        field521 = null;
        if (arg0 == 125) {
            field513 = null;
            field528 = null;
            field523 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method197(boolean arg0) {
        field512++;
        if (class91.field2243 != null) {
            class91.field2243.field3469 = false;
        }
        class91.field2243 = null;
        if (class104.field2536 != null) {
            class104.field2536.method1215(false);
            class104.field2536 = null;
        }
        class20.method190(1321);
        if (!arg0) {
            field528 = null;
        }
        class105.method907((byte) -68);
        class109.field2695 = null;
        if (class114.field2853 != null) {
            class114.field2853.method1085(25);
        }
        if (class47.field1142 != null) {
            class47.field1142.method1085(83);
        }
        class137.method1145((byte) 121);
        class100.method858((byte) -102);
        try {
            if (class36.field920 != null) {
                class36.field920.method94(67);
            }
            if (class25.field594 != null) {
                for (int var2 = 0; var2 < class25.field594.length; var2++) {
                    if (class25.field594[var2] != null) {
                        class25.field594[var2].method94(122);
                    }
                }
            }
            if (class21.field500 != null) {
                class21.field500.method94(110);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method198(boolean arg0) {
        class101.field2444++;
        field524++;
        this.method200(123);
        class25.method226((byte) 99);
        class101.method868(95);
        class111.method949(18645);
        class99.method852(65);
        class133.method1079((byte) -66);
        if (class109.field2695 != null) {
            int var2 = class109.field2695.method778(-75);
            class33.field802 = var2;
            class27.field673 += var2;
        }
        if (class66.field1699 == 0) {
            class59.method530(100);
            class54.method451((byte) 54);
        } else if (class66.field1699 == 5) {
            class58.method521(this, -92);
            class59.method530(100);
            class54.method451((byte) 54);
        } else if (class66.field1699 == 10) {
            class58.method521(this, -66);
        } else if (class66.field1699 == 20) {
            class58.method521(this, -118);
            class134.method1094((byte) -2);
        } else if (class66.field1699 == 25) {
            class52.method431((byte) -125);
        }
        if (arg0) {
            this.method200(9);
        }
        if (class66.field1699 == 30) {
            class58.method524((byte) -124);
        } else if (class66.field1699 == 35) {
            class58.method524((byte) -126);
        } else if (class66.field1699 == 40) {
            class134.method1094((byte) -2);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method199(boolean arg0) {
        field526++;
        class118.field2905 = class133.field3248 == 0 ? 443 : class137.field3418 + 50000;
        class72.field1829 = class133.field3248 == 0 ? 43594 : class137.field3418 + 40000;
        class30.field720 = class72.field1829;
        class59.method528((byte) -3);
        class83.method723(114, class5.field99);
        class142.method1162(0, class5.field99);
        class109.field2695 = class137.method1141((byte) -7);
        if (class109.field2695 != null) {
            class109.field2695.method779(class5.field99, 121);
        }
        class109.field2705 = class50.field1219;
        try {
            if (!arg0) {
                this.method201(-29, 51);
            }
            if (class43.field1058.field1215 != null) {
                class36.field920 = new class7(class43.field1058.field1215, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class25.field594[var2] = new class7(class43.field1058.field1206[var2], 6000, 0);
                }
                class21.field500 = new class7(class43.field1058.field1211, 6000, 0);
                class81.field2000 = new class144(255, class36.field920, class21.field500, 500000);
                class43.field1058.field1206 = null;
                class43.field1058.field1211 = null;
                class43.field1058.field1215 = null;
            }
        } catch (IOException var3) {
            class81.field2000 = null;
            class36.field920 = null;
            class21.field500 = null;
        }
        if (class133.field3248 != 0) {
            class100.field2427 = true;
        }
        class79.field1939 = new class54();
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method200(int arg0) {
        field519++;
        if (class66.field1699 == 1000) {
            return;
        }
        if (arg0 <= 107) {
            field520 = 3;
        }
        boolean var2 = class89.method748(2031725280);
        if (!var2) {
            this.method203(-17161);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class69.method607(1);
            }
            class137.field3418 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class133.field3248 = 0;
            } else if (arg0[1].equals("office")) {
                class133.field3248 = 1;
            } else if (arg0[1].equals("local")) {
                class133.field3248 = 2;
            } else {
                class69.method607(1);
            }
            if (arg0[2].equals("live")) {
                class15.field362 = 0;
            } else if (arg0[2].equals("rc")) {
                class15.field362 = 1;
            } else if (arg0[2].equals("wip")) {
                class15.field362 = 2;
            } else {
                class69.method607(1);
            }
            if (arg0[3].equals("lowmem")) {
                class122.method1016(122);
            } else if (arg0[3].equals("highmem")) {
                class137.method1143(true);
            } else {
                class69.method607(1);
            }
            if (arg0[4].equals("free")) {
                class143.field3554 = false;
            } else if (arg0[4].equals("members")) {
                class143.field3554 = true;
            } else {
                class69.method607(1);
            }
            if (arg0[5].equals("english")) {
                class77.field1921 = 0;
            } else if (arg0[5].equals("german")) {
                class112.method954(192);
                class77.field1921 = 1;
                class137.field3423 = class128.field3141;
            } else {
                class69.method607(1);
            }
            class122.field2968 = "127.0.0.1";
            client var1 = new client();
            var1.method939("runescape", 503, 1, 453, class15.field362 + 32, 765, 16);
        } catch (Exception var3) {
            class72.method659(var3, (byte) 112, null);
        }
        field525++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method201(int arg0, int arg1) {
        class73.field1849 = null;
        if (arg1 != 4) {
            this.method198(true);
        }
        class104.field2531 = 0;
        if (class72.field1829 == class30.field720) {
            class30.field720 = class118.field2905;
        } else {
            class30.field720 = class72.field1829;
        }
        field514++;
        class55.field1427++;
        class97.field2337 = null;
        if (class55.field1427 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class66.field1699 > 5) {
                class86.field2146 = 3000;
            } else {
                this.method931(-71, "js5connect_full");
                class66.field1699 = 1000;
            }
        } else if (class55.field1427 >= 2 && arg0 == 6) {
            this.method931(-97, "js5connect_outofdate");
            class66.field1699 = 1000;
        } else if (class55.field1427 >= 4) {
            if (class66.field1699 <= 5) {
                this.method931(arg1 - 116, "js5connect");
                class66.field1699 = 1000;
            } else {
                class86.field2146 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method202(int arg0) {
        field517++;
        if (arg0 != -41) {
            field520 = -35;
        }
        boolean var2 = class79.method684((byte) 74);
        if (var2 && class72.field1837 && class114.field2853 != null) {
            class114.field2853.method1087(true);
        }
        if (class74.field1872) {
            class140.method1153(arg0 + 168, class5.field99);
            class97.method801(true, class5.field99);
            if (class109.field2695 != null) {
                class109.field2695.method780(true, class5.field99);
            }
            this.method932(4783);
            class83.method723(-122, class5.field99);
            class142.method1162(0, class5.field99);
            if (class109.field2695 != null) {
                class109.field2695.method779(class5.field99, arg0 ^ 0xFFFFFFB1);
            }
        }
        if (class66.field1699 == 0) {
            class133.method1084(class134.field3304, 2, class109.field2710, null);
        } else if (class66.field1699 == 5) {
            class108.method922((byte) -103, class125.field2998, class48.field1162);
        } else if (class66.field1699 == 10) {
            class108.method922((byte) 123, class125.field2998, class48.field1162);
        } else if (class66.field1699 == 20) {
            class108.method922((byte) -127, class125.field2998, class48.field1162);
        } else if (class66.field1699 == 25) {
            if (class14.field326 == 1) {
                if (class100.field2438 < class68.field1759) {
                    class100.field2438 = class68.field1759;
                }
                int var4 = (class100.field2438 - class68.field1759) * 50 / class100.field2438;
                class53.method437(class61.field1638, true, (byte) 84, class20.method189(new class99[] { class89.field2194, class5.method31(var4, arg0 + 51), class37.field949 }, 26));
            } else if (class14.field326 == 2) {
                if (class100.field2443 < class135.field3364) {
                    class100.field2443 = class135.field3364;
                }
                int var3 = (class100.field2443 - class135.field3364) * 50 / class100.field2443 + 50;
                class53.method437(class61.field1638, true, (byte) 76, class20.method189(new class99[] { class89.field2194, class5.method31(var3, 10), class37.field949 }, 107));
            } else {
                class53.method437(class61.field1638, false, (byte) 86, null);
            }
        } else if (class66.field1699 == 30) {
            class89.method749(107);
        } else if (class66.field1699 == 35) {
            class150.method1212((byte) -125);
        } else if (class66.field1699 == 40) {
            class53.method437(class27.field678, false, (byte) 111, class107.field2615);
        }
        class11.field258 = 0;
        class27.field673 = 0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method203(int arg0) {
        field527++;
        if (class87.field2179 >= 4) {
            this.method931(-96, "js5crc");
            class66.field1699 = 1000;
            return;
        }
        if (class1.field19 >= 4) {
            if (class66.field1699 <= 5) {
                this.method931(-74, "js5io");
                class66.field1699 = 1000;
                return;
            }
            class1.field19 = 3;
            class86.field2146 = 3000;
        }
        if (class86.field2146-- > 0) {
            return;
        }
        try {
            if (arg0 != -17161) {
                field528 = null;
            }
            if (class104.field2531 == 0) {
                class73.field1849 = class43.field1058.method415(class30.field720, class122.field2968, 8);
                class104.field2531++;
            }
            if (class104.field2531 == 1) {
                if (class73.field1849.field688 == 2) {
                    this.method201(-1, 4);
                    return;
                }
                if (class73.field1849.field688 == 1) {
                    class104.field2531++;
                }
            }
            if (class104.field2531 == 2) {
                class97.field2337 = new class150((Socket) class73.field1849.field685, class43.field1058);
                class57 var2 = new class57(5);
                var2.method514((byte) 73, 15);
                var2.method507(25135, 453);
                class97.field2337.method1214(0, true, var2.field1469, 5);
                class104.field2531++;
                class118.field2894 = class60.method535(arg0 + 17163);
            }
            if (class104.field2531 == 3) {
                if (class66.field1699 <= 5 || class97.field2337.method1216(-12320) > 0) {
                    int var3 = class97.field2337.method1211((byte) -120);
                    if (var3 != 0) {
                        this.method201(var3, 4);
                        return;
                    }
                    class104.field2531++;
                } else if (class60.method535(2) - class118.field2894 > 30000L) {
                    this.method201(-2, arg0 + 17165);
                    return;
                }
            }
            if (class104.field2531 == 4) {
                class126.method1034((byte) -118, class66.field1699 > 20, class97.field2337);
                class97.field2337 = null;
                class73.field1849 = null;
                class55.field1427 = 0;
                class104.field2531 = 0;
            }
        } catch (IOException var4) {
            this.method201(-3, arg0 ^ -17165);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method204(byte arg0) {
        method196((byte) 125);
        field518++;
        class99.method828((byte) -96);
        class109.method937(-121);
        class3.method20((byte) -48);
        class102.method875(4121);
        class140.method1155(4);
        class57.method503(-71);
        class150.method1217((byte) 71);
        class35.method301((byte) 124);
        class7.method87(arg0 - 40);
        class144.method1180(-1654066136);
        class149.method1204(0);
        class101.method866(-1);
        class115.method977();
        class6.method56();
        class34.method297(-112);
        class126.method1028(15886);
        class83.method721((byte) -122);
        class54.method457((byte) 16);
        class95.method777(-20386);
        class119.method1003((byte) 35);
        class134.method1096((byte) 59);
        class77.method681((byte) -104);
        class133.method1081(76);
        class81.method699(true);
        class127.method1040(-85);
        class148.method1201(0);
        class46.method390(-5);
        class47.method395(false);
        class42.method364(true);
        class141.method1158(true);
        class118.method995(-22);
        class26.method245();
        class129.method1050();
        class53.method440(true);
        class4.method25(-127);
        class107.method918(125);
        class84.method731((byte) -37);
        class5.method32(true);
        class30.method265(-30033);
        class88.method745(arg0 + 7428);
        class55.method462(-24);
        class66.method589((byte) 31);
        class100.method862(true);
        class1.method5(arg0 ^ 0x22C4);
        class85.method733();
        class125.method1025((byte) 61);
        class12.method130(0);
        class60.method536((byte) -46);
        class121.method1009((byte) 104);
        class105.method887(false);
        class58.method523(-4380);
        class23.method210(arg0 - 6);
        class135.method1119(98);
        class33.method279((byte) 66);
        class70.method612((byte) -43);
        class43.method371(true);
        class80.method695(arg0 + 130);
        class69.method603((byte) 125);
        class15.method151(1);
        class72.method662((byte) 85);
        class68.method596((byte) -122);
        class61.method542(true);
        class48.method401(false);
        class40.method334();
        class96.method789();
        class2.method10(-36);
        class142.method1159((byte) 0);
        class74.method668(-5279);
        class41.method355();
        class108.method919((byte) -39);
        class113.method958(29837);
        class104.method881(-24329);
        class25.method224(arg0 ^ 0xFFFFFEE0);
        class145.method1190(-29741);
        class93.method771(25469);
        class16.method158(arg0 + 31);
        class143.method1169(-1);
        class39.method326(false);
        class14.method143(-4952);
        class18.method176(13056);
        class49.method411((byte) -97);
        class138.method1150(256);
        class79.method693(104);
        class51.method428();
        class114.method961((byte) -57);
        class45.method378((byte) 127);
        class122.method1018((byte) 127);
        class86.method736(arg0 + 32);
        class36.method313(true);
        class110.method945(true);
        class63.method554((byte) -36);
        class136.method1133((byte) -10);
        class87.method740((byte) 71);
        class103.method878();
        class111.method947(arg0 - 30677);
        class67.method593((byte) -101);
        class21.method194(5);
        class130.method1063((byte) -76);
        class73.method664((byte) 68);
        class32.method277((byte) -41);
        class112.method951((byte) 26);
        class97.method803(4910);
        class37.method316(arg0 ^ 0xFFFF8AD0);
        class82.method709(-127);
        class137.method1142(1);
        class9.method112(false);
        class11.method125(0);
        class17.method168((byte) -90);
        class20.method187(-3);
        class128.method1041(121);
        class62.method548();
        class29.method263();
        if (arg0 != -32) {
            field513 = null;
        }
        class89.method750((byte) 118);
        class56.method463();
        class27.method257(arg0 ^ 0x1F);
        class19.method186();
        class59.method527(-1);
        class132.method1070((byte) 13);
        class94.method775(false);
        class31.method272((byte) -107);
        class13.method141();
        class10.method119();
        class52.method433((byte) -7);
        class91.method755(18);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public static final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2048 - arg5 & 0x7FF;
        int var8 = 0;
        field516++;
        int var9 = 2048 - arg1 & 0x7FF;
        int var10 = 0;
        int var11 = arg4;
        if (var7 != 0) {
            int var12 = class40.field982[var7];
            int var13 = class40.field981[var7];
            int var14 = var10 * var13 - arg4 * var12 >> 16;
            var11 = var10 * var12 + arg4 * var13 >> 16;
            var10 = var14;
        }
        if (var9 != 0) {
            int var15 = class40.field982[var9];
            int var16 = class40.field981[var9];
            int var17 = var8 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var8 * var15 >> 16;
            var8 = var17;
        }
        class94.field2290 = arg3 - var11;
        class32.field754 = arg5;
        class145.field3611 = arg2 - var8;
        if (arg0 != -12664) {
            main(null);
        }
        class12.field266 = arg6 - var10;
        class94.field2288 = arg1;
    }
}
