import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class135 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lb;")
    public static class11 field498 = new class11(500);

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lsd;")
    private static class166 field507 = class135.method935("Jan", 0);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lsd;")
    private static class166 field511 = class135.method935("Nov", 0);

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field515 = 0;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lsd;")
    private static class166 field516 = class135.method935("Apr", 0);

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lsd;")
    private static class166 field513 = class135.method935("Feb", 0);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lsd;")
    private static class166 field517 = class135.method935("Mar", 0);

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lsd;")
    private static class166 field509 = class135.method935("Jul", 0);

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lsd;")
    private static class166 field519 = class135.method935("Sep", 0);

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lsd;")
    private static class166 field510 = class135.method935("Dec", 0);

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lsd;")
    private static class166 field518 = class135.method935("Aug", 0);

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Lsd;")
    private static class166 field522 = class135.method935("May", 0);

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Lsd;")
    private static class166 field521 = class135.method935("Jun", 0);

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lsd;")
    private static class166 field524 = class135.method935("Ok", 0);

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field520 = 0;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Lsd;")
    public static class166 field523 = field524;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lsd;")
    private static class166 field512 = class135.method935("Oct", 0);

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Lsd;")
    public static class166[] field525 = new class166[] { field507, field513, field517, field516, field522, field521, field509, field518, field519, field512, field511, field510 };

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lug;")
    private static class187 field493;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lf;")
    public static class47 field508;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
    public static boolean field526;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method205(byte arg0) {
        field499++;
        boolean var2 = class104.method782(84);
        if (var2 && class49.field913 && class89.field1761 != null) {
            class89.field1761.method1172(0);
        }
        if (class130.field2545) {
            class121.method873(-22727, class114.field2219);
            class144.method990(0, class114.field2219);
            if (field493 != null) {
                field493.method83(class114.field2219, true);
            }
            this.method940((byte) -72);
            class165.method1110(-1, class114.field2219);
            class16.method85(class114.field2219, 16956);
            if (field493 != null) {
                field493.method81(class114.field2219, -126);
            }
        }
        if (field520 == 0) {
            class202.method1331(class150.field2931, null, class12.field239, (byte) -43);
        } else if (field520 == 5) {
            class105.method787(true, class160.field3068, class125.field2464);
        } else if (field520 == 10) {
            class105.method787(true, class160.field3068, class125.field2464);
        } else if (field520 == 20) {
            class105.method787(true, class160.field3068, class125.field2464);
        } else if (field520 == 25) {
            if (class125.field2452 == 1) {
                if (class82.field1675 < class98.field1867) {
                    class82.field1675 = class98.field1867;
                }
                int var4 = (class82.field1675 - class98.field1867) * 50 / class82.field1675;
                class116.method838(250, false, class22.method148(new class166[] { class146.field2880, class142.field2762, class174.method1192(false, var4), class77.field1589 }, 0));
            } else if (class125.field2452 == 2) {
                if (class9.field175 > class64.field1343) {
                    class64.field1343 = class9.field175;
                }
                int var3 = (class64.field1343 - class9.field175) * 50 / class64.field1343 + 50;
                class116.method838(250, false, class22.method148(new class166[] { class146.field2880, class142.field2762, class174.method1192(false, var3), class77.field1589 }, 0));
            } else {
                class116.method838(250, false, class146.field2880);
            }
        } else if (field520 == 30) {
            method207(43);
        } else if (field520 == 40) {
            class116.method838(250, false, class22.method148(new class166[] { class42.field747, class42.field758, class147.field2890 }, 0));
        }
        if (field520 == 30 && class23.field401 == 0 && !class150.field2919) {
            try {
                Graphics var5 = class114.field2219.getGraphics();
                for (int var6 = 0; var6 < class91.field1788; var6++) {
                    if (class95.field1834[var6]) {
                        class99.field1885.method545(class82.field1663[var6], class184.field3515[var6], class38.field688[var6], var5, class22.field388[var6], (byte) 123);
                        class95.field1834[var6] = false;
                    }
                }
            } catch (Exception var10) {
                class114.field2219.repaint();
            }
        } else if (field520 > 0) {
            try {
                Graphics var7 = class114.field2219.getGraphics();
                class99.field1885.method547(0, 97, 0, var7);
                class150.field2919 = false;
                for (int var8 = 0; var8 < class91.field1788; var8++) {
                    class95.field1834[var8] = false;
                }
            } catch (Exception var9) {
                class114.field2219.repaint();
            }
        }
        if (arg0 >= -31) {
            this.init();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method206(int arg0, int arg1) {
        field497++;
        if (arg0 != 765) {
            this.init();
        }
        if (class117.field2260 == class115.field2241) {
            class117.field2260 = class110.field2128;
        } else {
            class117.field2260 = class115.field2241;
        }
        class37.field680 = 0;
        class106.field2080 = null;
        class175.field3318 = null;
        class159.field3052++;
        if (class159.field3052 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (field520 <= 5) {
                this.method932(13768, "js5connect_full");
                field520 = 1000;
            } else {
                class42.field751 = 3000;
            }
        } else if (class159.field3052 >= 2 && arg1 == 6) {
            this.method932(13768, "js5connect_outofdate");
            field520 = 1000;
        } else if (class159.field3052 >= 4) {
            if (field520 <= 5) {
                this.method932(13768, "js5connect");
                field520 = 1000;
            } else {
                class42.field751 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private static final void method207(int arg0) {
        field502++;
        if (!class192.field3654) {
            class11.field197[0] = class31.field569;
            class160.field3064 = 1;
            class200.field3970[0] = 1003;
            class182.field3462[0] = class196.field3891;
        }
        if (class146.field2884 != -1) {
            class99.method741(class146.field2884, (byte) -25);
        }
        for (int var1 = 0; var1 < class91.field1788; var1++) {
            if (class30.field556[var1]) {
                class95.field1834[var1] = true;
            }
            class156.field2993[var1] = class30.field556[var1];
            class30.field556[var1] = false;
        }
        class93.field1822 = class49.field910;
        class64.field1346 = -1;
        class144.field2803 = -1;
        class9.field184 = null;
        int var2 = 4 / ((-arg0 - 58) / 63);
        if (class146.field2884 != -1) {
            class91.field1788 = 0;
            class4.method27(765, class146.field2884, 503, (byte) -73, 0, 0, -1, 0, 0);
        }
        class17.method101();
        class12.method72(-26544);
        if (class192.field3654) {
            class82.method668(21291);
        } else if (class64.field1346 != -1) {
            class68.method555(class144.field2803, class64.field1346, 2);
        }
        if (class23.field401 == 3) {
            for (int var3 = 0; var3 < class91.field1788; var3++) {
                if (class156.field2993[var3]) {
                    class17.method96(class82.field1663[var3], class184.field3515[var3], class22.field388[var3], class38.field688[var3], 16711935, 128);
                } else if (class95.field1834[var3]) {
                    class17.method96(class82.field1663[var3], class184.field3515[var3], class22.field388[var3], class38.field688[var3], 16711680, 128);
                }
            }
        }
        class85.method681(80, class165.field3130, class187.field3570, class41.field728.field3526, class41.field728.field3513);
        class187.field3570 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method208(byte arg0) {
        if (class99.field1888 != null) {
            class99.field1888.field2215 = false;
        }
        class99.field1888 = null;
        if (class47.field861 != null) {
            class47.field861.method12((byte) -94);
            class47.field861 = null;
        }
        field504++;
        if (arg0 <= 95) {
            return;
        }
        class34.method248(false);
        class34.method246((byte) 101);
        field493 = null;
        if (class89.field1761 != null) {
            class89.field1761.method1171(0);
        }
        if (class153.field2949 != null) {
            class153.field2949.method1171(0);
        }
        class43.method295(111);
        class143.method979(-17543);
        try {
            if (class194.field3845 != null) {
                class194.field3845.method1263(3070);
            }
            if (class90.field1768 != null) {
                for (int var2 = 0; var2 < class90.field1768.length; var2++) {
                    if (class90.field1768[var2] != null) {
                        class90.field1768[var2].method1263(3070);
                    }
                }
            }
            if (class195.field3856 != null) {
                class195.field3856.method1263(3070);
            }
            if (class110.field2137 != null) {
                class110.field2137.method1263(3070);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public static final void method209(int arg0, long arg1) {
        field503++;
        if (arg1 == 0L) {
            return;
        }
        if (class119.field2344 >= 100) {
            class150.method1023((byte) -81, 0, class206.field4059, class196.field3891);
            return;
        }
        class166 var3 = class191.method1278(37, arg1).method1159(-103);
        for (int var4 = 0; var4 < class119.field2344; var4++) {
            if (class72.field1430[var4] == arg1) {
                class150.method1023((byte) 111, 0, class22.method148(new class166[] { var3, class140.field2732 }, 0), class196.field3891);
                return;
            }
        }
        if (arg0 != 4257) {
            method207(6);
        }
        for (int var5 = 0; var5 < class189.field3609; var5++) {
            if (class154.field2964[var5] == arg1) {
                class150.method1023((byte) -70, 0, class22.method148(new class166[] { class135.field2643, var3, class147.field2906 }, 0), class196.field3891);
                return;
            }
        }
        if (var3.method1138(class41.field728.field2412, (byte) 126)) {
            class150.method1023((byte) -110, 0, class156.field2982, class196.field3891);
            return;
        }
        class47.field837++;
        class72.field1430[class119.field2344] = arg1;
        class128.field2507[class119.field2344++] = class191.method1278(37, arg1);
        class128.field2508 = class95.field1844;
        class156.field2989.method705(201, (byte) 9);
        class156.field2989.method428(arg1, (byte) 109);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method210(boolean arg0) {
        field500++;
        if (arg0) {
            this.method214(81);
        }
        if (field520 != 1000) {
            boolean var2 = class113.method828(-1);
            if (!var2) {
                this.method213(5666);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method211(int arg0) {
        class49.field910++;
        field495++;
        if (class49.field910 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class58.field1202 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class14.field258.setSeed((long) class58.field1202);
        }
        this.method210(false);
        class143.method981(arg0 - 27517);
        class147.method1008(0);
        class121.method872(false);
        class85.method682((byte) -52);
        class35.method250(46);
        if (field493 != null) {
            int var3 = field493.method82(false);
            class31.field576 = var3;
        }
        if (field520 == arg0) {
            class19.method119(111);
            class62.method520(arg0 + 119);
        } else if (field520 == 5) {
            class167.method1166(-126, this);
            class19.method119(-55);
            class62.method520(-91);
        } else if (field520 == 10) {
            class167.method1166(-110, this);
        } else if (field520 == 20) {
            class167.method1166(-128, this);
            class204.method1337(arg0);
        } else if (field520 == 25) {
            class63.method526(16378);
        }
        if (field520 == 30) {
            class123.method884(-17131);
        } else if (field520 == 40) {
            class204.method1337(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method212(int arg0) {
        field524 = null;
        field523 = null;
        field498 = null;
        if (arg0 >= -76) {
            field517 = null;
        }
        field516 = null;
        field493 = null;
        field511 = null;
        field507 = null;
        field508 = null;
        field509 = null;
        field521 = null;
        field519 = null;
        field512 = null;
        field518 = null;
        field522 = null;
        field517 = null;
        field510 = null;
        field513 = null;
        field525 = null;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field505++;
        try {
            if (arg0.length != 7) {
                class174.method1196(41);
            }
            class106.field2071 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class102.field2015 = 0;
            } else if (arg0[1].equals("office")) {
                class102.field2015 = 1;
            } else if (arg0[1].equals("local")) {
                class102.field2015 = 2;
            } else {
                class174.method1196(124);
            }
            if (arg0[2].equals("live")) {
                class43.field765 = 0;
            } else if (arg0[2].equals("rc")) {
                class43.field765 = 1;
            } else if (arg0[2].equals("wip")) {
                class43.field765 = 2;
            } else {
                class174.method1196(90);
            }
            if (arg0[3].equals("lowmem")) {
                class180.method1219(-115);
            } else if (arg0[3].equals("highmem")) {
                class154.method1035(200);
            } else {
                class174.method1196(41);
            }
            if (arg0[4].equals("free")) {
                class121.field2369 = false;
            } else if (arg0[4].equals("members")) {
                class121.field2369 = true;
            } else {
                class174.method1196(113);
            }
            if (arg0[5].equals("english")) {
                class116.field2246 = 0;
            } else if (arg0[5].equals("german")) {
                class179.method1211(true);
                class196.field3895 = class9.field180;
                class116.field2246 = 1;
            } else {
                class174.method1196(103);
            }
            if (arg0[6].equals("game0")) {
                class179.field3395 = 0;
            } else if (arg0[6].equals("game1")) {
                class179.field3395 = 1;
            } else {
                class174.method1196(81);
            }
            class74.field1497 = "127.0.0.1";
            client var1 = new client();
            var1.method939(503, class43.field765 + 32, 476, "runescape", 16, 765, -4169);
            class102.field1996.setLocation(40, 40);
        } catch (Exception var3) {
            class32.method238((byte) -65, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field496++;
        if (!this.method930(-98)) {
            return;
        }
        class106.field2071 = Integer.parseInt(this.getParameter("worldid"));
        class43.field765 = Integer.parseInt(this.getParameter("modewhat"));
        class102.field2015 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class180.method1219(-127);
        } else {
            class154.method1035(200);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class121.field2369 = true;
        } else {
            class121.field2369 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class179.method1211(true);
            class116.field2246 = 1;
            class196.field3895 = class9.field180;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class179.field3395 = 1;
        } else {
            class179.field3395 = 0;
        }
        try {
            class124.field2442 = Integer.parseInt(this.getParameter("js"));
            class196.field3877 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class74.field1497 = this.getCodeBase().getHost();
        this.method937(1, 476, 765, class43.field765 + 32, 503);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method213(int arg0) {
        field494++;
        if (class130.field2553 >= 4) {
            this.method932(13768, "js5crc");
            field520 = 1000;
            return;
        }
        if (class58.field1193 >= 4) {
            if (field520 <= 5) {
                this.method932(13768, "js5io");
                field520 = 1000;
                return;
            }
            class58.field1193 = 3;
            class42.field751 = 3000;
        }
        if (class42.field751-- > 0) {
            return;
        }
        try {
            if (class37.field680 == 0) {
                class106.field2080 = class35.field664.method651(class117.field2260, 0, class74.field1497);
                class37.field680++;
            }
            if (class37.field680 == 1) {
                if (class106.field2080.field1351 == 2) {
                    this.method206(765, -1);
                    return;
                }
                if (class106.field2080.field1351 == 1) {
                    class37.field680++;
                }
            }
            if (class37.field680 == 2) {
                class175.field3318 = new class2((Socket) class106.field2080.field1352, class35.field664);
                class53 var2 = new class53(5);
                var2.method429(15, (byte) 116);
                var2.method438(423055928, 476);
                class175.field3318.method15(5, 0, (byte) -87, var2.field988);
                class37.field680++;
                class82.field1665 = class100.method748((byte) 35);
            }
            if (class37.field680 == 3) {
                if (field520 <= 5 || class175.field3318.method16((byte) -117) > 0) {
                    int var3 = class175.field3318.method10((byte) 119);
                    if (var3 != 0) {
                        this.method206(765, var3);
                        return;
                    }
                    class37.field680++;
                } else if (class100.method748((byte) 35) - class82.field1665 > 30000L) {
                    this.method206(765, -2);
                    return;
                }
            }
            if (class37.field680 == 4) {
                class200.method1320(field520 > 20, class175.field3318, -7266);
                class159.field3052 = 0;
                class175.field3318 = null;
                class37.field680 = 0;
                class106.field2080 = null;
            }
            if (arg0 != 5666) {
                field498 = null;
            }
        } catch (IOException var4) {
            this.method206(765, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method214(int arg0) {
        method212(arg0 - 13283);
        field501++;
        class166.method1156((byte) -110);
        class135.method933(arg0 ^ 0x222C);
        class162.method1094(true);
        class67.method546(-87);
        class114.method830(-97);
        class53.method406(2);
        class2.method14((byte) 52);
        class22.method155((byte) -57);
        class189.method1261(-110);
        class86.method685(arg0 ^ 0x733A);
        class154.method1036(16);
        class90.method710(arg0 ^ 0x33A7);
        class73.method612();
        class141.method970(true);
        class193.method1293((byte) -71);
        class123.method881(false);
        class165.method1107(-1250931468);
        class29.method227(49);
        class187.method1255(arg0 ^ arg0);
        class31.method231(arg0 ^ 0xFFFFCC21);
        class144.method986(128);
        class169.method1178((byte) -120);
        class87.method693(124);
        class111.method809(0);
        class62.method517(true);
        class184.method1245(80);
        class46.method349(arg0 - 13227);
        class77.method635(-98);
        class54.method443(-6582);
        class130.method914(0);
        class150.method1021(-903);
        class82.method670((byte) -41);
        class11.method69((byte) 101);
        class126.method900();
        class70.method563(arg0 ^ 0xFFFFCC62);
        class48.method373(0);
        class12.method76(arg0 ^ 0x1837);
        class33.method241(true);
        class4.method26(-30683);
        class196.method1302((byte) 62);
        class42.method292((byte) 126);
        class72.method574(arg0 - 12999);
        class106.method788((byte) -118);
        class122.method878(true);
        class101.method754();
        class69.method557(false);
        class198.method1306();
        class136.method943(true);
        class103.method774((byte) -105);
        class125.method893(arg0 - 13272);
        class147.method1009(-120);
        class100.method747((byte) -110);
        class37.method260(1);
        class10.method57((byte) -76);
        class47.method361(false);
        class56.method476((byte) -18);
        class199.method1315(5589);
        class75.method628(-19932);
        class61.method513((byte) -74);
        class143.method980((byte) -114);
        class175.method1198(256);
        class35.method249(arg0 - 13187);
        class157.method1047(116);
        class104.method783(35);
        class89.method700(arg0 ^ 0x3386);
        class38.method264((byte) -37);
        class32.method236(true);
        class60.method510(arg0 ^ 0xFFFFCC2C);
        class17.method102();
        class19.method120(-109);
        class40.method270();
        class43.method294((byte) -69);
        class20.method126();
        class79.method648((byte) 39);
        class167.method1165(-19712);
        class174.method1194(arg0 - 13030);
        class3.method17(-6);
        class5.method34((byte) 96);
        class64.method541(-1);
        class145.method992(27183);
        class57.method484(-1);
        class118.method857();
        class120.method866(0);
        class117.method839(128);
        class195.method1298(arg0 ^ 0xFFFFCC60);
        class97.method733(109);
        class171.method1186((byte) 73);
        class25.method195((byte) -84);
        class24.method170();
        class112.method818(true);
        class159.method1080(arg0 ^ 0x33F0);
        class131.method917(arg0 ^ 0xFFFFCC04);
        class127.method904((byte) 103);
        class164.method1102(16204);
        class190.method1273(0);
        class134.method928((byte) 115);
        class8.method54((byte) 57);
        class27.method202((byte) 116);
        class76.method632((byte) 123);
        class91.method716((byte) -111);
        class137.method945(true);
        class30.method229(100);
        class98.method739(-5527);
        class163.method1097();
        class18.method109(68);
        class58.method496(25238);
        class34.method247(arg0 - 13191);
        class119.method861((byte) 107);
        class185.method1250(-9);
        class180.method1217(true);
        class151.method1027(96);
        class52.method383(arg0 ^ 0xFFFFCC78);
        class177.method1205(0);
        class124.method887(-121);
        class140.method956(arg0 - 13187);
        class179.method1210(-96);
        class170.method1184(-9122);
        class14.method80(8);
        class28.method204(1);
        class7.method46();
        class83.method676();
        class203.method1335(536864357);
        class55.method444();
        class172.method1189((byte) -63);
        class153.method1034(arg0 ^ 0x33EC);
        class1.method8();
        class74.method627(arg0 - 13191);
        class128.method907(22588);
        class192.method1281(-118);
        class181.method1231();
        class201.method1327();
        class85.method683((byte) 94);
        class160.method1084((byte) 69);
        class59.method502(-21659);
        class178.method1207((byte) -116);
        class142.method974((byte) -104);
        class9.method56(-14878);
        class63.method529(true);
        class92.method720(arg0 - 9095);
        class156.method1044(4080);
        class93.method725((byte) 120);
        class115.method835(arg0 ^ 0x3397);
        class84.method680((byte) 26);
        class116.method837(-54);
        class139.method950((byte) -40);
        class99.method742(true);
        class51.method381((byte) 116);
        class88.method697(23818);
        class108.method793(false);
        class95.method727(arg0 - 13190);
        class41.method288((byte) -21);
        class102.method772(79);
        class129.method911(arg0 ^ 0xFFFFCC29);
        class23.method157((byte) -62);
        class138.method947(103);
        class132.method923(-1788249332);
        class107.method790(-118);
        class204.method1336(false);
        class113.method829(false);
        class202.method1332(-28398);
        class45.method345(-128);
        class191.method1277(0);
        class6.method43(1);
        class81.method663((byte) 118);
        class109.method795(-9464);
        class16.method84((byte) -64);
        class200.method1319(28264);
        class105.method786((byte) 103);
        class110.method797(arg0 ^ 0x338B);
        class176.method1201(arg0 + 52344);
        class121.method876((byte) 127);
        class194.method1297(-120);
        class206.method1347((byte) -102);
        class161.method1090(-16034);
        class68.method554(116);
        class182.method1233(true);
        class146.method1006(0);
        class49.method377(26885);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method215(int arg0) {
        class115.field2241 = class102.field2015 == 0 ? 43594 : class106.field2071 + 40000;
        if (class179.field3395 == 1) {
            class31.field568 = class77.field1593;
            class115.field2228 = class54.field1016;
            class5.field113 = class178.field3364;
            class177.field3357 = class134.field2607;
        } else {
            class115.field2228 = class58.field1189;
            class177.field3357 = class22.field380;
            class5.field113 = class97.field1861;
            class31.field568 = class199.field3938;
        }
        class117.field2260 = class115.field2241;
        class110.field2128 = class102.field2015 == 0 ? 443 : class106.field2071 + 50000;
        field506++;
        class100.method745(190);
        int var2 = -98 / ((arg0 - 45) / 60);
        class165.method1110(-1, class114.field2219);
        class16.method85(class114.field2219, 16956);
        field493 = class25.method196(43);
        if (field493 != null) {
            field493.method81(class114.field2219, -123);
        }
        class196.field3884 = class80.field1626;
        try {
            if (class35.field664.field1629 != null) {
                class194.field3845 = new class189(class35.field664.field1629, 5200, 0);
                for (int var3 = 0; var3 < 16; var3++) {
                    class90.field1768[var3] = new class189(class35.field664.field1631[var3], 6000, 0);
                }
                class195.field3856 = new class189(class35.field664.field1636, 6000, 0);
                class63.field1318 = new class86(255, class194.field3845, class195.field3856, 500000);
                class110.field2137 = new class189(class35.field664.field1643, 24, 0);
                class35.field664.field1629 = null;
                class35.field664.field1643 = null;
                class35.field664.field1636 = null;
                class35.field664.field1631 = null;
            }
        } catch (IOException var4) {
            class63.field1318 = null;
            class194.field3845 = null;
            class195.field3856 = null;
            class110.field2137 = null;
        }
        if (class102.field2015 != 0) {
            class127.field2493 = true;
        }
    }
}
