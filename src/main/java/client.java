import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class194 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lea;")
    public static class40 field542 = new class40();

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
    public static int[] field550 = new int[100];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Leh;")
    public static class47 field552 = class195.method1282((byte) -4, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
    public static int[] field553 = new int[50];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lea;")
    public static class40 field551 = new class40();

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Leh;")
    public static class47 field555 = class195.method1282((byte) -4, ":assist:");

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Leh;")
    private static class47 field558 = class195.method1282((byte) -4, "Please use a different world)3");

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Leh;")
    public static class47 field556 = field558;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Leh;")
    public static class47 field557 = field558;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Lqd;")
    public static class148 field537;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Ljava/awt/Image;")
    public static Image field544;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field554;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
    public static boolean field559;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field548++;
        try {
            if (arg0.length != 7) {
                class85.method702(0);
            }
            class195.field3805 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class94.field1954 = 0;
            } else if (arg0[1].equals("office")) {
                class94.field1954 = 1;
            } else if (arg0[1].equals("local")) {
                class94.field1954 = 2;
            } else {
                class85.method702(0);
            }
            if (arg0[2].equals("live")) {
                class105.field2210 = 0;
            } else if (arg0[2].equals("rc")) {
                class105.field2210 = 1;
            } else if (arg0[2].equals("wip")) {
                class105.field2210 = 2;
            } else {
                class85.method702(0);
            }
            if (arg0[3].equals("lowmem")) {
                class60.method505(true);
            } else if (arg0[3].equals("highmem")) {
                class18.method195(-105);
            } else {
                class85.method702(0);
            }
            if (arg0[4].equals("free")) {
                class99.field2096 = false;
            } else if (arg0[4].equals("members")) {
                class99.field2096 = true;
            } else {
                class85.method702(0);
            }
            if (arg0[5].equals("english")) {
                class132.field2606 = 0;
            } else if (arg0[5].equals("german")) {
                class146.method1031(39);
                class181.field3469 = class23.field448;
                class132.field2606 = 1;
            } else {
                class85.method702(0);
            }
            if (arg0[6].equals("game0")) {
                class51.field985 = 0;
            } else if (arg0[6].equals("game1")) {
                class51.field985 = 1;
            } else {
                class85.method702(0);
            }
            class94.field1945 = "127.0.0.1";
            client var1 = new client();
            var1.method1272(class105.field2210 + 32, 765, 16, (byte) -95, "runescape", 503, 481);
            class34.field655.setLocation(40, 40);
        } catch (Exception var3) {
            class167.method1131((byte) -51, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method254(int arg0) {
        if (class16.field324 != null) {
            class16.field324.field808 = false;
        }
        class16.field324 = null;
        field536++;
        if (class61.field1323 != null) {
            class61.field1323.method678((byte) -111);
            class61.field1323 = null;
        }
        class23.method227(6547);
        if (arg0 != 0) {
            field554 = false;
        }
        class124.method947(60);
        class3.field44 = null;
        if (class191.field3711 != null) {
            class191.field3711.method895(true);
        }
        if (class54.field1044 != null) {
            class54.field1044.method895(true);
        }
        class146.method1036(true);
        class59.method504(false);
        try {
            if (class148.field2906 != null) {
                class148.field2906.method297((byte) 118);
            }
            if (class80.field1732 != null) {
                for (int var2 = 0; var2 < class80.field1732.length; var2++) {
                    if (class80.field1732[var2] != null) {
                        class80.field1732[var2].method297((byte) 117);
                    }
                }
            }
            if (class141.field2765 != null) {
                class141.field2765.method297((byte) 118);
            }
            if (class126.field2532 != null) {
                class126.field2532.method297((byte) 125);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static void method255(int arg0) {
        field552 = null;
        field550 = null;
        field558 = null;
        field551 = null;
        field556 = null;
        field553 = null;
        field544 = null;
        if (arg0 == 26406) {
            field557 = null;
            field542 = null;
            field555 = null;
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method256(boolean arg0) {
        if (class51.field985 == 1) {
            class6.field106 = class178.field3408;
            class195.field3798 = class114.field2311;
            class85.field1797 = class44.field885;
            class185.field3536 = class21.field404;
        } else {
            class6.field106 = class86.field1815;
            class195.field3798 = class59.field1140;
            class85.field1797 = class107.field2228;
            class185.field3536 = class114.field2320;
        }
        class85.field1800 = class94.field1954 == 0 ? 43594 : class195.field3805 + 40000;
        field543++;
        class27.field520 = class94.field1954 == 0 ? 443 : class195.field3805 + 50000;
        class148.field2909 = class85.field1800;
        class197.method1292((byte) -78);
        class142.method1019(class47.field949, arg0);
        class180.method1200(30789, class47.field949);
        class3.field44 = class198.method1302(-21);
        if (class3.field44 != null) {
            class3.field44.method252((byte) 127, class47.field949);
        }
        class81.field1734 = class150.field2949;
        try {
            if (class142.field2782.field2934 != null) {
                class148.field2906 = new class34(class142.field2782.field2934, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class80.field1732[var2] = new class34(class142.field2782.field2933[var2], 6000, 0);
                }
                class141.field2765 = new class34(class142.field2782.field2942, 6000, 0);
                class39.field775 = new class62(255, class148.field2906, class141.field2765, 500000);
                class126.field2532 = new class34(class142.field2782.field2932, 24, 0);
                class142.field2782.field2933 = null;
                class142.field2782.field2942 = null;
                class142.field2782.field2932 = null;
                class142.field2782.field2934 = null;
            }
        } catch (IOException var3) {
            class148.field2906 = null;
            class39.field775 = null;
            class141.field2765 = null;
            class126.field2532 = null;
        }
        if (class94.field1954 != 0) {
            class124.field2503 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method257(boolean arg0) {
        field540++;
        boolean var2 = class143.method1021(-15252);
        if (var2 && class72.field1545 && class191.field3711 != null) {
            class191.field3711.method893(-117);
        }
        if (class197.field3845) {
            class98.method798(class47.field949, 22);
            class192.method1259(0, class47.field949);
            if (class3.field44 != null) {
                class3.field44.method250(class47.field949, (byte) 61);
            }
            this.method1277(0);
            class142.method1019(class47.field949, true);
            class180.method1200(30789, class47.field949);
            if (class3.field44 != null) {
                class3.field44.method252((byte) 127, class47.field949);
            }
        }
        if (class158.field3078 == 0) {
            class14.method125(class162.field3167, 2, null, class161.field3130);
        } else if (class158.field3078 == 5) {
            class81.method685(arg0, class52.field1014, class167.field3238);
        } else if (class158.field3078 == 10) {
            class81.method685(false, class52.field1014, class167.field3238);
        } else if (class158.field3078 == 20) {
            class81.method685(arg0, class52.field1014, class167.field3238);
        } else if (class158.field3078 == 25) {
            if (class116.field2362 == 1) {
                if (class156.field3049 > class184.field3522) {
                    class184.field3522 = class156.field3049;
                }
                int var4 = (class184.field3522 - class156.field3049) * 50 / class184.field3522;
                class148.method1046(false, false, class5.method24(new class47[] { class196.field3808, class144.field2835, class167.method1133(var4, (byte) 120), class152.field2996 }, (byte) 99));
            } else if (class116.field2362 == 2) {
                if (class185.field3541 < class132.field2605) {
                    class185.field3541 = class132.field2605;
                }
                int var3 = (class185.field3541 - class132.field2605) * 50 / class185.field3541 + 50;
                class148.method1046(false, false, class5.method24(new class47[] { class196.field3808, class144.field2835, class167.method1133(var3, (byte) -120), class152.field2996 }, (byte) 124));
            } else {
                class148.method1046(false, arg0, class196.field3808);
            }
        } else if (class158.field3078 == 30) {
            class204.method1335((byte) -31);
        } else if (class158.field3078 == 40) {
            class148.method1046(false, false, class5.method24(new class47[] { class124.field2506, class187.field3612, class143.field2810 }, (byte) 110));
        }
        if (class158.field3078 == 30 && class135.field2651 == 0 && !class63.field1346) {
            try {
                Graphics var7 = class47.field949.getGraphics();
                for (int var8 = 0; var8 < class3.field39; var8++) {
                    if (class137.field2679[var8]) {
                        class79.field1714.method1100(var7, field550[var8], (byte) -116, class191.field3713[var8], class75.field1629[var8], class90.field1899[var8]);
                        class137.field2679[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class47.field949.repaint();
            }
        } else if (class158.field3078 > 0) {
            try {
                Graphics var5 = class47.field949.getGraphics();
                class79.field1714.method1095(var5, 0, 0, -1);
                class63.field1346 = false;
                for (int var6 = 0; var6 < class3.field39; var6++) {
                    class137.field2679[var6] = false;
                }
            } catch (Exception var10) {
                class47.field949.repaint();
            }
        }
        if (arg0) {
            field551 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method258(byte arg0) {
        field538++;
        if (class123.field2484 >= 4) {
            this.method1274(true, "js5crc");
            class158.field3078 = 1000;
            return;
        }
        if (class53.field1032 >= 4) {
            if (class158.field3078 <= 5) {
                this.method1274(true, "js5io");
                class158.field3078 = 1000;
                return;
            }
            class53.field1032 = 3;
            class80.field1723 = 3000;
        }
        if (class80.field1723-- > 0) {
            return;
        }
        try {
            if (class161.field3134 == 0) {
                class14.field299 = class142.field2782.method1055(class148.field2909, 1, class94.field1945);
                class161.field3134++;
            }
            if (class161.field3134 == 1) {
                if (class14.field299.field2543 == 2) {
                    this.method261(99, -1);
                    return;
                }
                if (class14.field299.field2543 == 1) {
                    class161.field3134++;
                }
            }
            int var2 = 0 / ((62 - arg0) / 54);
            if (class161.field3134 == 2) {
                class176.field3375 = new class79((Socket) class14.field299.field2548, class142.field2782);
                class68 var3 = new class68(5);
                var3.method609(15, (byte) -116);
                var3.method606(481, -1424429928);
                class176.field3375.method679(5, (byte) 100, var3.field1495, 0);
                class161.field3134++;
                class159.field3095 = class201.method1313(29);
            }
            if (class161.field3134 == 3) {
                if (class158.field3078 <= 5 || class176.field3375.method680(0) > 0) {
                    int var4 = class176.field3375.method681(-105);
                    if (var4 != 0) {
                        this.method261(86, var4);
                        return;
                    }
                    class161.field3134++;
                } else if (class201.method1313(29) - class159.field3095 > 30000L) {
                    this.method261(117, -2);
                    return;
                }
            }
            if (class161.field3134 == 4) {
                class148.method1041(class176.field3375, class158.field3078 > 20, 256);
                class161.field3134 = 0;
                class152.field2968 = 0;
                class176.field3375 = null;
                class14.field299 = null;
            }
        } catch (IOException var5) {
            this.method261(80, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method259(int arg0) {
        field541++;
        class18.field362++;
        if (class18.field362 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class202.field3932 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class75.field1636.setSeed((long) class202.field3932);
        }
        this.method263(true);
        class32.method279(false);
        class87.method714(0);
        class126.method951((byte) -127);
        class99.method803(72);
        class190.method1249(0);
        if (arg0 != 24) {
            return;
        }
        if (class3.field44 != null) {
            int var3 = class3.field44.method251((byte) -83);
            class117.field2372 = var3;
        }
        if (class158.field3078 == 0) {
            class178.method1187(100);
            class108.method875((byte) 127);
        } else if (class158.field3078 == 5) {
            class122.method936((byte) 24, this);
            class178.method1187(100);
            class108.method875((byte) 105);
        } else if (class158.field3078 == 10) {
            class122.method936((byte) 24, this);
        } else if (class158.field3078 == 20) {
            class122.method936((byte) 24, this);
            class120.method926(arg0 + 69);
        } else if (class158.field3078 == 25) {
            class40.method347(true);
        }
        if (class158.field3078 == 30) {
            class20.method208(arg0 + 26);
        } else if (class158.field3078 == 40) {
            class120.method926(arg0 ^ 0x5E);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static final void method260(byte arg0) {
        field549++;
        if (arg0 != 50) {
            main(null);
        }
        class167.field3259.method993(1);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field534++;
        if (!this.method1279((byte) 31)) {
            return;
        }
        class195.field3805 = Integer.parseInt(this.getParameter("worldid"));
        class105.field2210 = Integer.parseInt(this.getParameter("modewhat"));
        class94.field1954 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class60.method505(true);
        } else {
            class18.method195(-48);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class99.field2096 = true;
        } else {
            class99.field2096 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class146.method1031(39);
            class132.field2606 = 1;
            class181.field3469 = class23.field448;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class51.field985 = 1;
        } else {
            class51.field985 = 0;
        }
        try {
            class52.field999 = Integer.parseInt(this.getParameter("js"));
            class161.field3129 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class94.field1945 = this.getCodeBase().getHost();
        this.method1273(765, 481, 503, (byte) -61, class105.field2210 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method261(int arg0, int arg1) {
        class152.field2968++;
        class176.field3375 = null;
        field539++;
        if (class85.field1800 == class148.field2909) {
            class148.field2909 = class27.field520;
        } else {
            class148.field2909 = class85.field1800;
        }
        class14.field299 = null;
        if (arg0 < 77) {
            field553 = null;
        }
        class161.field3134 = 0;
        if (class152.field2968 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class158.field3078 <= 5) {
                this.method1274(true, "js5connect_full");
                class158.field3078 = 1000;
            } else {
                class80.field1723 = 3000;
            }
        } else if (class152.field2968 >= 2 && arg1 == 6) {
            this.method1274(true, "js5connect_outofdate");
            class158.field3078 = 1000;
        } else if (class152.field2968 >= 4) {
            if (class158.field3078 > 5) {
                class80.field1723 = 3000;
            } else {
                this.method1274(true, "js5connect");
                class158.field3078 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method262(int arg0) {
        method255(26406);
        field547++;
        class47.method400((byte) -127);
        class194.method1275((byte) -125);
        class53.method467(23221);
        class160.method1097((byte) 88);
        class41.method351(-100);
        class68.method568(-93);
        class79.method675(arg0 ^ 0x1);
        class52.method458(3);
        class34.method289((byte) 66);
        class62.method529(arg0 ^ 0xFFFFFF82);
        class72.method633(arg0 ^ 0x5D);
        class75.method653(-12262);
        class37.method312((byte) -107);
        class61.method510(1);
        class32.method281((byte) 121);
        class40.method339(false);
        class204.method1334((byte) -8);
        class183.method1221(0);
        class88.method721(-12315);
        class36.method307((byte) -112);
        class114.method894(false);
        class198.method1304(arg0 ^ 0xFFFFE5E7);
        class182.method1211((byte) -62);
        class22.method214(arg0 + 4999);
        class170.method1159(false);
        class199.method1309(-1);
        class56.method479((byte) -49);
        class63.method531(1394690369);
        class110.method884(arg0);
        class203.method1331(true);
        class80.method684(0);
        class136.method988(0);
        class30.method267();
        class195.method1285(43);
        class143.method1022((byte) -52);
        class115.method907(arg0 - 122);
        class152.method1063((byte) 119);
        class60.method507(41);
        class142.method1020(-87);
        class92.method741(-15927);
        class44.method368(-27434);
        class117.method916((byte) -113);
        class200.method1311(119);
        class102.method821();
        class206.method1353(9073);
        class46.method375();
        class132.method971((byte) 126);
        class163.method1112(true);
        class27.method247(15164);
        class103.method845(0);
        class201.method1315(29);
        class185.method1228(0);
        class158.method1084(true);
        class9.method64(-128);
        class96.method784((byte) -61);
        class148.method1044(false);
        class166.method1129(-18763);
        class196.method1289(2047);
        class149.method1049(68);
        class25.method237(67);
        class123.method941(arg0);
        class184.method1225(-1);
        class205.method1347(-122);
        class31.method275((byte) 103);
        class119.method923(28);
        class116.method915((byte) 105);
        class51.method450(4309);
        class169.method1140();
        class106.method863(true);
        class17.method190();
        class130.method965(0);
        class65.method539();
        class97.method795((byte) 49);
        class178.method1190(false);
        class174.method1167(arg0 ^ 0x1B);
        class69.method621(true);
        class159.method1088((byte) -115);
        class26.method238((byte) -124);
        class202.method1327(arg0 ^ 0x1A32);
        class73.method638(true);
        class7.method50();
        class109.method881((byte) -60);
        class21.method211(false);
        class95.method758(-104);
        class186.method1236(true);
        class122.method937(10);
        class13.method108();
        class91.method733(322);
        class133.method975((byte) 74);
        class193.method1266(arg0 ^ 0x3FA6);
        class108.method870((byte) 123);
        class8.method56(false);
        class23.method231(false);
        class120.method930(arg0 + 6);
        class146.method1035(64);
        class67.method556((byte) -19);
        class83.method695(false);
        class125.method950(arg0 + 21366);
        class43.method366(200);
        class90.method724(250);
        class139.method1008(arg0 ^ 0xFFFFFFED);
        class4.method19();
        class86.method705((byte) 105);
        class162.method1106((byte) -81);
        class190.method1251(arg0 - 64);
        class141.method1015(-14292);
        class156.method1079(-1465171728);
        class100.method809(true);
        class24.method232(true);
        class87.method716(-1);
        class118.method920(true);
        class20.method206((byte) 117);
        class187.method1241((byte) 86);
        class167.method1136((byte) 121);
        class19.method202(22422);
        class59.method503(5681);
        class18.method198(95);
        class16.method174(-118);
        class58.method502();
        class45.method373();
        class82.method691(27768);
        class111.method888();
        class64.method534(true);
        class189.method1248(true);
        class181.method1203(-2210);
        class101.method813();
        class188.method1243((byte) -98);
        class107.method866((byte) 1);
        class33.method285(952081);
        class42.method355();
        class164.method1120();
        class127.method955(25);
        class6.method33((byte) -98);
        class105.method855((byte) 79);
        class81.method689((byte) -15);
        class176.method1176((byte) -108);
        class192.method1263((byte) -63);
        class2.method9((byte) -40);
        class39.method333(arg0 + 121);
        class165.method1126(true);
        class126.method954((byte) 121);
        class177.method1182(1113);
        class74.method651(arg0 + 118);
        class78.method674((byte) -45);
        class191.method1254(true);
        class151.method1060(arg0);
        class98.method796(16027);
        class137.method995((byte) 32);
        class35.method301(arg0 ^ 0x7DB0);
        class154.method1068((byte) 32);
        class3.method16((byte) -2);
        class179.method1192((byte) 118);
        class84.method699(true);
        class153.method1067(false);
        class131.method969(12);
        class12.method91((byte) 64);
        class124.method948(85);
        class77.method671((byte) 102);
        class70.method627(true);
        class140.method1013(false);
        class55.method477((byte) -48);
        class135.method983(true);
        class161.method1105((byte) -119);
        class14.method126(63);
        class54.method473((byte) -75);
        class180.method1196((byte) -25);
        class85.method701(-81);
        class144.method1029(arg0);
        class155.method1077((byte) 50);
        class94.method752(false);
        class173.method1164(4096);
        class5.method23((byte) 123);
        class138.method1001(1);
        class197.method1293(arg0 + 2);
        class121.method933(4000);
        class57.method494(125);
        class147.method1037(99);
        class76.method667(-126);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method263(boolean arg0) {
        field535++;
        if (class158.field3078 == 1000) {
            return;
        }
        if (!arg0) {
            field556 = null;
        }
        boolean var2 = class69.method622(16711680);
        if (!var2) {
            this.method258((byte) -88);
        }
    }
}
