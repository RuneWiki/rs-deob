import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class69 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Lrf;")
    public static class163 field592 = class53.method392(78, "logo");

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lrf;")
    public static class163 field603 = class53.method392(119, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Lrf;")
    public static class163 field595 = class53.method392(-59, "leuchten3:");

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lrf;")
    public static class163 field598 = class53.method392(-48, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lrf;")
    private static class163 field597 = class53.method392(70, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lrf;")
    public static class163[] field610 = new class163[500];

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Lrf;")
    public static class163 field594 = field597;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lrf;")
    private static class163 field612 = class53.method392(126, "K");

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Lrf;")
    public static class163 field591 = field612;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    public static int[] field599 = new int[50];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Lrf;")
    public static class163 field593 = field612;

    @OriginalMember(owner = "client!client", name = "B", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Led;")
    public static class45 field613;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method192(int arg0, int arg1) {
        class155.field3216 = 0;
        class139.field2855 = null;
        field605++;
        class90.field1940++;
        if (arg0 != 3000) {
            this.method195(-53);
        }
        if (class62.field1324 == class177.field3578) {
            class177.field3578 = class4.field71;
        } else {
            class177.field3578 = class62.field1324;
        }
        class199.field3949 = null;
        if (class90.field1940 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class16.field277 > 5) {
                class41.field833 = 3000;
            } else {
                this.method489("js5connect_full", -85);
                class16.field277 = 1000;
            }
        } else if (class90.field1940 >= 2 && arg1 == 6) {
            this.method489("js5connect_outofdate", -125);
            class16.field277 = 1000;
        } else if (class90.field1940 >= 4) {
            if (class16.field277 > 5) {
                class41.field833 = 3000;
            } else {
                this.method489("js5connect", -123);
                class16.field277 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLrf;)I")
    private static final int method193(byte arg0, class163 arg1) {
        field596++;
        if (class133.field2763 == 1) {
            return 7;
        } else if (arg1.method1024(106, class20.field349)) {
            return 1;
        } else if (arg1.method1024(90, class168.field3429)) {
            return 1;
        } else if (arg1.method1024(118, class38.field794)) {
            return 2;
        } else if (arg1.method1024(124, class190.field3779)) {
            return 2;
        } else if (arg1.method1024(107, class53.field1100)) {
            return 3;
        } else if (arg1.method1024(99, class65.field1365)) {
            return 4;
        } else if (arg0 > -40) {
            return -50;
        } else if (arg1.method1024(125, class19.field322)) {
            return 4;
        } else if (arg1.method1024(118, class140.field2879)) {
            return 5;
        } else if (arg1.method1024(119, class73.field1534)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static final void method194(byte arg0) {
        if (arg0 < 74) {
            field606 = 99;
        }
        try {
            if (class205.field4013 == null) {
                class205.field4013 = new class6(class10.field197, class180.method1216(new class163[] { class5.field114, class36.field685, class43.field863 }, false).method1030(0));
            } else {
                byte[] var1 = class205.field4013.method56(119);
                if (var1 != null) {
                    class52 var2 = new class52(var1);
                    class168.field3426 = var2.method390((byte) 93);
                    class25.field454 = new class23[class168.field3426];
                    for (int var3 = 0; var3 < class168.field3426; var3++) {
                        class23 var4 = class25.field454[var3] = new class23();
                        int var5 = var2.method390((byte) 107);
                        var4.field400 = var5 & 0x7FFF;
                        var4.field406 = (var5 & 0x8000) != 0;
                        var4.field407 = var2.method363(19047);
                        var4.field404 = var2.method389(353);
                        var4.field405 = var3;
                        var4.field397 = method193((byte) -65, var4.field407);
                    }
                    class208.method1355(class134.field2780, -15230, class25.field454, class23.field399, 0, class25.field454.length - 1);
                    class205.field4013 = null;
                    class96.field2041 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class205.field4013 = null;
        }
        field611++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method195(int arg0) {
        class51.field1023++;
        field608++;
        if (arg0 != 40) {
            field597 = null;
        }
        if (class51.field1023 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class72.field1518 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class53.field1097.setSeed((long) class72.field1518);
        }
        this.method196(73);
        class188.method1266((byte) -7);
        class48.method296(false);
        method198((byte) -119);
        class105.method716((byte) 23);
        class161.method1008((byte) 44);
        if (class115.field2441 != null) {
            int var3 = class115.field2441.method532((byte) 112);
            class85.field1867 = var3;
        }
        if (class16.field277 == 0) {
            class7.method63(3351);
            class101.method691((byte) 54);
        } else if (class16.field277 == 5) {
            class87.method610((byte) -48, this);
            class7.method63(3351);
            class101.method691((byte) -83);
        } else if (class16.field277 == 10) {
            class87.method610((byte) -98, this);
        } else if (class16.field277 == 20) {
            class87.method610((byte) -63, this);
            class139.method914(100);
        } else if (class16.field277 == 25) {
            class146.method950(8);
        }
        if (class16.field277 == 30) {
            class134.method888(0);
        } else if (class16.field277 == 40) {
            class139.method914(105);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method196(int arg0) {
        field601++;
        if (class16.field277 == 1000) {
            return;
        }
        int var2 = -114 % ((-arg0 - 42) / 32);
        boolean var3 = class62.method451(-145);
        if (!var3) {
            this.method203(-3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method197(int arg0) {
        field604++;
        if (class72.field1517 != null) {
            class72.field1517.field1617 = false;
        }
        class72.field1517 = null;
        if (class92.field2004 != null) {
            class92.field2004.method694((byte) -93);
            class92.field2004 = null;
        }
        class205.method1348(79);
        class59.method425((byte) -120);
        class115.field2441 = null;
        if (class118.field2496 != null) {
            class118.field2496.method1190(0);
        }
        if (class195.field3830 != null) {
            class195.field3830.method1190(0);
        }
        class108.method731(2047);
        class150.method973((byte) 5);
        try {
            if (class23.field401 != null) {
                class23.field401.method952((byte) 112);
            }
            if (class25.field446 != null) {
                for (int var2 = 0; var2 < class25.field446.length; var2++) {
                    if (class25.field446[var2] != null) {
                        class25.field446[var2].method952((byte) 112);
                    }
                }
            }
            if (arg0 <= 35) {
                field613 = null;
            }
            if (class130.field2714 != null) {
                class130.field2714.method952((byte) 112);
            }
            if (class26.field484 != null) {
                class26.field484.method952((byte) 112);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static final void method198(byte arg0) {
        if (class195.field3830 != null) {
            class195.field3830.method1196(false);
        }
        field615++;
        if (class118.field2496 != null) {
            class118.field2496.method1196(false);
        }
        if (arg0 >= -111) {
            method198((byte) 77);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method199(int arg0) {
        boolean var2 = class21.method131((byte) -128);
        field602++;
        if (var2 && class107.field2234 && class118.field2496 != null) {
            class118.field2496.method1195(-78);
        }
        if (arg0 <= 88) {
            method194((byte) 35);
        }
        if (class5.field102) {
            class143.method934(class25.field445, -12127);
            class132.method881(-27021, class25.field445);
            if (class115.field2441 != null) {
                class115.field2441.method530((byte) 35, class25.field445);
            }
            this.method495(0);
            class188.method1267(class25.field445, (byte) -112);
            class163.method1053(24849, class25.field445);
            if (class115.field2441 != null) {
                class115.field2441.method531(30918, class25.field445);
            }
        }
        if (class16.field277 == 0) {
            class190.method1283((byte) 94, null, class202.field3979, class44.field900);
        } else if (class16.field277 == 5) {
            class184.method1233((byte) 122, class134.field2772, class138.field2833);
        } else if (class16.field277 == 10) {
            class184.method1233((byte) -29, class134.field2772, class138.field2833);
        } else if (class16.field277 == 20) {
            class184.method1233((byte) 117, class134.field2772, class138.field2833);
        } else if (class16.field277 == 25) {
            if (class124.field2583 == 1) {
                if (class103.field2153 > class114.field2429) {
                    class114.field2429 = class103.field2153;
                }
                int var4 = (class114.field2429 - class103.field2153) * 50 / class114.field2429;
                class48.method293(false, class180.method1216(new class163[] { class95.field2034, class180.field3606, class34.method217(var4, -123), class176.field3541 }, false), true);
            } else if (class124.field2583 == 2) {
                if (class141.field2900 > class59.field1182) {
                    class59.field1182 = class141.field2900;
                }
                int var3 = (class59.field1182 - class141.field2900) * 50 / class59.field1182 + 50;
                class48.method293(false, class180.method1216(new class163[] { class95.field2034, class180.field3606, class34.method217(var3, -88), class176.field3541 }, false), true);
            } else {
                class48.method293(false, class95.field2034, true);
            }
        } else if (class16.field277 == 30) {
            class84.method598((byte) -115);
        } else if (class16.field277 == 40) {
            class48.method293(false, class180.method1216(new class163[] { class48.field930, class109.field2274, class159.field3240 }, false), true);
        }
        if (class16.field277 == 30 && class49.field953 == 0 && !class12.field238) {
            try {
                Graphics var5 = class25.field445.getGraphics();
                for (int var6 = 0; var6 < class48.field944; var6++) {
                    if (class27.field498[var6]) {
                        class31.field622.method169(var5, class161.field3258[var6], class20.field351[var6], class99.field2092[var6], (byte) -65, class106.field2207[var6]);
                        class27.field498[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class25.field445.repaint();
            }
        } else if (class16.field277 > 0) {
            try {
                Graphics var7 = class25.field445.getGraphics();
                class31.field622.method165(var7, 0, 8, 0);
                class12.field238 = false;
                for (int var8 = 0; var8 < class48.field944; var8++) {
                    class27.field498[var8] = false;
                }
            } catch (Exception var10) {
                class25.field445.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field607++;
        if (!this.method491(true)) {
            return;
        }
        class27.field503 = Integer.parseInt(this.getParameter("worldid"));
        class5.field100 = Integer.parseInt(this.getParameter("modewhat"));
        class36.field700 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class88.method619(400788110);
        } else {
            class61.method446((byte) -119);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class143.field2955 = true;
        } else {
            class143.field2955 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class130.method855((byte) 99);
            class36.field685 = class154.field3200;
            class133.field2763 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class89.field1932 = 1;
        } else {
            class89.field1932 = 0;
        }
        try {
            class140.field2877 = Integer.parseInt(this.getParameter("js"));
            class20.field343 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class108.field2254 = this.getCodeBase().getHost();
        this.method497(503, 765, 483, class5.field100 + 32, (byte) 119);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method200(byte arg0) {
        if (class89.field1932 == 1) {
            class129.field2687 = class127.field2608;
            class117.field2481 = class168.field3400;
            class161.field3262 = class84.field1851;
            class199.field3938 = class41.field840;
        } else {
            class117.field2481 = class44.field889;
            class161.field3262 = class12.field232;
            class129.field2687 = class69.field1442;
            class199.field3938 = class186.field3714;
        }
        class4.field71 = class36.field700 == 0 ? 443 : class27.field503 + 50000;
        class62.field1324 = class36.field700 == 0 ? 43594 : class27.field503 + 40000;
        field614++;
        class177.field3578 = class62.field1324;
        class103.method703(-128);
        int var2 = -10 % ((arg0 + 70) / 54);
        class188.method1267(class25.field445, (byte) -114);
        class163.method1053(24849, class25.field445);
        class115.field2441 = class103.method707(-15728);
        if (class115.field2441 != null) {
            class115.field2441.method531(30918, class25.field445);
        }
        class38.field777 = class67.field1417;
        try {
            if (class10.field197.field1420 != null) {
                class23.field401 = new class147(class10.field197.field1420, 5200, 0);
                for (int var3 = 0; var3 < 16; var3++) {
                    class25.field446[var3] = new class147(class10.field197.field1422[var3], 6000, 0);
                }
                class130.field2714 = new class147(class10.field197.field1409, 6000, 0);
                class149.field3073 = new class16(255, class23.field401, class130.field2714, 500000);
                class26.field484 = new class147(class10.field197.field1413, 24, 0);
                class10.field197.field1409 = null;
                class10.field197.field1413 = null;
                class10.field197.field1420 = null;
                class10.field197.field1422 = null;
            }
        } catch (IOException var4) {
            class23.field401 = null;
            class130.field2714 = null;
            class26.field484 = null;
            class149.field3073 = null;
        }
        if (class36.field700 != 0) {
            class96.field2047 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static void method201(byte arg0) {
        field592 = null;
        field593 = null;
        field597 = null;
        field591 = null;
        int var1 = 49 % ((arg0 + 40) / 49);
        field610 = null;
        field612 = null;
        field613 = null;
        field594 = null;
        field595 = null;
        field598 = null;
        field603 = null;
        field599 = null;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class166.method1132(1);
            }
            class27.field503 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class36.field700 = 0;
            } else if (arg0[1].equals("office")) {
                class36.field700 = 1;
            } else if (arg0[1].equals("local")) {
                class36.field700 = 2;
            } else {
                class166.method1132(1);
            }
            if (arg0[2].equals("live")) {
                class5.field100 = 0;
            } else if (arg0[2].equals("rc")) {
                class5.field100 = 1;
            } else if (arg0[2].equals("wip")) {
                class5.field100 = 2;
            } else {
                class166.method1132(1);
            }
            if (arg0[3].equals("lowmem")) {
                class88.method619(400788110);
            } else if (arg0[3].equals("highmem")) {
                class61.method446((byte) -119);
            } else {
                class166.method1132(1);
            }
            if (arg0[4].equals("free")) {
                class143.field2955 = false;
            } else if (arg0[4].equals("members")) {
                class143.field2955 = true;
            } else {
                class166.method1132(1);
            }
            if (arg0[5].equals("english")) {
                class133.field2763 = 0;
            } else if (arg0[5].equals("german")) {
                class130.method855((byte) 109);
                class133.field2763 = 1;
                class36.field685 = class154.field3200;
            } else {
                class166.method1132(1);
            }
            if (arg0[6].equals("game0")) {
                class89.field1932 = 0;
            } else if (arg0[6].equals("game1")) {
                class89.field1932 = 1;
            } else {
                class166.method1132(1);
            }
            class108.field2254 = "127.0.0.1";
            client var1 = new client();
            var1.method492((byte) -29, 503, 16, "runescape", 483, class5.field100 + 32, 765);
            class141.field2907.setLocation(40, 40);
        } catch (Exception var3) {
            class152.method980(var3, null, true);
        }
        field600++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method202(byte arg0) {
        field609++;
        method201((byte) 36);
        class163.method1049((byte) -118);
        class69.method498(28347);
        class190.method1282(false);
        class138.method909(109);
        class80.method546(arg0 - 196);
        class52.method348(-1);
        class102.method701((byte) 1);
        class189.method1280(true);
        class147.method957(arg0 - 163);
        class16.method108(true);
        class70.method503(0);
        class51.method327((byte) -65);
        class131.method872(-1);
        class84.method597((byte) 89);
        class38.method239(true);
        class5.method49(true);
        class65.method467((byte) 83);
        class170.method1147((byte) -125);
        class206.method1349(86);
        class60.method428(arg0);
        class176.method1198((byte) -110);
        class185.method1256((byte) -107);
        class114.method795(true);
        class162.method1020(12);
        class36.method224(1);
        class64.method460(97);
        class129.method850(-14);
        class87.method611(false);
        class90.method631(-77);
        class205.method1344(-124);
        class196.method1301((byte) -125);
        class54.method395(1);
        class91.method634();
        class49.method300(0);
        class186.method1258(18205);
        class179.method1212(-26122);
        class111.method771(5);
        class121.method821(arg0 ^ 0xFFFFFFDF);
        class142.method926(-25631);
        class166.method1130(true);
        class72.method512((byte) -122);
        class122.method826((byte) 94);
        class9.method75(1);
        class50.method303();
        class108.method727(4748);
        class46.method275();
        class99.method681(108);
        class15.method101((byte) -69);
        class137.method903(false);
        class141.method924(1);
        class155.method995((byte) -22);
        class199.method1313((byte) -79);
        class96.method663((byte) -47);
        class184.method1229((byte) -120);
        class109.method751(false);
        class8.method66((byte) 95);
        class37.method235(-114);
        class6.method55(4);
        class23.method137(12598);
        class31.method204(74);
        class74.method525(-1);
        class55.method403((byte) 46);
        class57.method415(0);
        class39.method249(4);
        class79.method544((byte) 113);
        class128.method842(32);
        class127.method840(10487);
        class173.method1164();
        class106.method724(-58);
        class1.method12();
        class19.method121(0);
        class204.method1327();
        class113.method779(-111);
        class88.method614(arg0 - 28154);
        class21.method132(0);
        class11.method88(arg0 ^ 0xFFFFFFFB);
        class71.method509(arg0 ^ 0x5C);
        class154.method985(true);
        class61.method443(-122);
        class4.method33(arg0 - 189);
        class30.method177();
        class86.method607((byte) 38);
        class208.method1357((byte) 116);
        class100.method684(true);
        class73.method515((byte) -61);
        class132.method884(17771);
        class41.method254(33);
        class83.method556();
        class197.method1308(true);
        class92.method642(true);
        class167.method1137(-85);
        class210.method1370(false);
        class119.method815((byte) 57);
        class68.method486(-26458);
        class95.method660(-29950);
        class62.method449(4206);
        class149.method967(arg0 - 92);
        class201.method1320(4);
        class151.method975(arg0 ^ 0x54);
        class118.method809(true);
        class191.method1285(false);
        class188.method1269(arg0 ^ 0xFFFFFFFE);
        class171.method1150();
        class168.method1141(0);
        class77.method537((byte) 125);
        class17.method111(false);
        class148.method966(arg0 ^ 0x6E);
        class56.method407(-101);
        class48.method289(false);
        class181.method1217((byte) -46);
        class117.method805(arg0 - 4);
        class143.method931((byte) -108);
        class44.method271((byte) 111);
        class81.method547(25);
        class28.method164(12849);
        class120.method819((byte) -49);
        class53.method394(1);
        class133.method886(16163);
        class27.method160(-1);
        class98.method678();
        class94.method656();
        class135.method893((byte) 64);
        class198.method1311();
        class195.method1299(600);
        class161.method1005(4);
        class82.method553(arg0 - 25399);
        class18.method114();
        class59.method423((byte) 45);
        class13.method93((byte) 89);
        class107.method725(10426);
        class24.method143();
        class104.method714();
        class144.method937((byte) 18);
        class209.method1362((byte) 120);
        class139.method911(true);
        class116.method801(true);
        class112.method772(arg0 + 163);
        class7.method60(true);
        class43.method265(arg0 - 189);
        class200.method1315(0);
        class136.method898(-1);
        class140.method920(64);
        class187.method1265(0);
        class158.method1000(true);
        class134.method889(true);
        class150.method972((byte) 27);
        class85.method601(-125);
        class58.method421(arg0 - 25487);
        class101.method690((byte) -15);
        class26.method157((byte) 84);
        class93.method651(arg0 - 156);
        class32.method213(-24121);
        class193.method1289(122);
        class105.method717((byte) 76);
        class152.method976((byte) -80);
        class33.method215(true);
        class146.method947(Integer.MAX_VALUE);
        class194.method1293((byte) -101);
        class97.method672((byte) 52);
        class29.method171((byte) -124);
        class25.method154((byte) 42);
        class130.method858(arg0 ^ 0x53);
        class12.method91((byte) -58);
        class103.method702(arg0 - 201);
        class10.method79((byte) -113);
        class89.method620(2077);
        class115.method797((byte) -113);
        class34.method218(-112);
        class40.method252(74);
        class75.method527((byte) -38);
        class63.method456(-20403);
        class180.method1215(20310);
        class172.method1156(104);
        class177.method1201(0);
        class22.method134(128);
        class124.method834(0);
        class14.method96(arg0 ^ 0xFFFFC91B);
        class20.method125(2047);
        class175.method1187(false);
        class125.method837(arg0 - 218);
        class159.method1004((byte) 57);
        class202.method1325(-1);
        class3.method26((byte) 127);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method203(int arg0) {
        field590++;
        if (class167.field3390 >= 4) {
            this.method489("js5crc", -100);
            class16.field277 = 1000;
            return;
        }
        if (class109.field2265 >= 4) {
            if (class16.field277 <= 5) {
                this.method489("js5io", -91);
                class16.field277 = 1000;
                return;
            }
            class41.field833 = 3000;
            class109.field2265 = 3;
        }
        if (class41.field833-- > 0) {
            return;
        }
        try {
            if (class155.field3216 == 0) {
                class199.field3949 = class10.field197.method473(-27627, class177.field3578, class108.field2254);
                class155.field3216++;
            }
            if (class155.field3216 == 1) {
                if (class199.field3949.field855 == 2) {
                    this.method192(3000, -1);
                    return;
                }
                if (class199.field3949.field855 == 1) {
                    class155.field3216++;
                }
            }
            if (class155.field3216 == 2) {
                class139.field2855 = new class102((Socket) class199.field3949.field854, class10.field197);
                class52 var2 = new class52(5);
                var2.method370(15, (byte) 123);
                var2.method369(483, (byte) -114);
                class139.field2855.method697(var2.field1054, 5, (byte) -127, 0);
                class155.field3216++;
                class13.field244 = class155.method994(109);
            }
            if (class155.field3216 == 3) {
                if (class16.field277 <= 5 || class139.field2855.method693(-114) > 0) {
                    int var3 = class139.field2855.method695(false);
                    if (var3 != 0) {
                        this.method192(3000, var3);
                        return;
                    }
                    class155.field3216++;
                } else if (class155.method994(39) - class13.field244 > 30000L) {
                    this.method192(3000, -2);
                    return;
                }
            }
            int var4 = 76 / ((-arg0 - 58) / 48);
            if (class155.field3216 == 4) {
                class23.method138(class139.field2855, class16.field277 > 20, 0);
                class199.field3949 = null;
                class155.field3216 = 0;
                class90.field1940 = 0;
                class139.field2855 = null;
            }
        } catch (IOException var5) {
            this.method192(3000, -3);
        }
    }
}
