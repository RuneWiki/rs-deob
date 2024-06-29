import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class115 {

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field578 = 1;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[Lvb;")
    public static class191[] field575 = new class191[4];

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lsg;")
    private static class169 field574 = class165.method1060("Loading textures )2 ", 1536);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lsg;")
    public static class169 field583 = field574;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
    public static boolean field599;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
    public static int[] field585;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lgd;")
    public static class59[] field582;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[[[B")
    public static byte[][][] field577;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[[[B")
    public static byte[][][] field587;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    private final void method193(boolean arg0, int arg1) {
        if (class56.field1026 == class13.field304) {
            class56.field1026 = class80.field1472;
        } else {
            class56.field1026 = class13.field304;
        }
        class98.field1830 = null;
        class13.field302++;
        if (!arg0) {
            return;
        }
        field589++;
        class140.field2592 = null;
        class126.field2306 = 0;
        if (class13.field302 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class111.field2031 <= 5) {
                this.method708("js5connect_full", 0);
                class111.field2031 = 1000;
            } else {
                class204.field3997 = 3000;
            }
        } else if (class13.field302 >= 2 && arg1 == 6) {
            this.method708("js5connect_outofdate", 0);
            class111.field2031 = 1000;
        } else if (class13.field302 >= 4) {
            if (class111.field2031 > 5) {
                class204.field3997 = 3000;
            } else {
                this.method708("js5connect", 0);
                class111.field2031 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method194(int arg0) {
        field593++;
        if (class56.field1037 >= 4) {
            this.method708("js5crc", 0);
            class111.field2031 = 1000;
            return;
        }
        if (class193.field3813 >= 4) {
            if (class111.field2031 <= 5) {
                this.method708("js5io", 0);
                class111.field2031 = 1000;
                return;
            }
            class204.field3997 = 3000;
            class193.field3813 = 3;
        }
        if (class204.field3997-- > 0) {
            return;
        }
        try {
            if (class126.field2306 == 0) {
                class98.field1830 = class163.field3134.method671(class56.field1026, class20.field442, 70);
                class126.field2306++;
            }
            if (class126.field2306 == 1) {
                if (class98.field1830.field3296 == 2) {
                    this.method193(true, -1);
                    return;
                }
                if (class98.field1830.field3296 == 1) {
                    class126.field2306++;
                }
            }
            if (class126.field2306 == 2) {
                class140.field2592 = new class57((Socket) class98.field1830.field3299, class163.field3134);
                class127 var2 = new class127(5);
                var2.method821(15, 64);
                var2.method802((byte) 64, 475);
                class140.field2592.method361(0, 5, -1, var2.field2325);
                class126.field2306++;
                class23.field488 = class116.method712((byte) -61);
            }
            if (class126.field2306 == 3) {
                if (class111.field2031 <= 5 || class140.field2592.method358(-10633) > 0) {
                    int var3 = class140.field2592.method362(-117);
                    if (var3 != 0) {
                        this.method193(true, var3);
                        return;
                    }
                    class126.field2306++;
                } else if (class116.method712((byte) -49) - class23.field488 > 30000L) {
                    this.method193(true, -2);
                    return;
                }
            }
            if (class126.field2306 == 4) {
                class45.method285(class111.field2031 > 20, class140.field2592, 4);
                class13.field302 = 0;
                class98.field1830 = null;
                class126.field2306 = 0;
                class140.field2592 = null;
            }
        } catch (IOException var4) {
            this.method193(true, -3);
        }
        if (arg0 != 50) {
            this.init();
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method195(int arg0) {
        if (arg0 != 7604) {
            field587 = null;
        }
        field576++;
        class162.field3107++;
        if (class162.field3107 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class144.field2678 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class63.field1153.setSeed((long) class144.field2678);
        }
        this.method199((byte) 15);
        class189.method1247(0);
        class152.method1001((byte) -26);
        class37.method240((byte) -68);
        class164.method1053(-110);
        class193.method1276(true);
        if (class68.field1289 != null) {
            int var3 = class68.field1289.method225(arg0 - 7606);
            class115.field2118 = var3;
        }
        if (class111.field2031 == 0) {
            class48.method302((byte) 87);
            class114.method699((byte) -103);
        } else if (class111.field2031 == 5) {
            class51.method317((byte) 46, this);
            class48.method302((byte) 63);
            class114.method699((byte) -103);
        } else if (class111.field2031 == 10) {
            class51.method317((byte) 72, this);
        } else if (class111.field2031 == 20) {
            class51.method317((byte) 29, this);
            class92.method537(123);
        } else if (class111.field2031 == 25) {
            class127.method800(13);
        }
        if (class111.field2031 == 30) {
            class25.method182((byte) -18);
        } else if (class111.field2031 == 40) {
            class92.method537(90);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field581++;
        if (!this.method702(114)) {
            return;
        }
        class80.field1482 = Integer.parseInt(this.getParameter("worldid"));
        class22.field469 = Integer.parseInt(this.getParameter("modewhat"));
        class20.field439 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class196.method1290(false);
        } else {
            class155.method1012(-112);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class175.field3398 = true;
        } else {
            class175.field3398 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class191.method1267(1);
            class154.field2976 = 1;
            class45.field844 = class163.field3130;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class199.field3899 = 1;
        } else {
            class199.field3899 = 0;
        }
        try {
            class7.field202 = Integer.parseInt(this.getParameter("js"));
            class187.field3640 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class20.field442 = this.getCodeBase().getHost();
        this.method704(765, class22.field469 + 32, 3617, 503, 475);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method196(int arg0) {
        method202((byte) 76);
        field595++;
        class169.method1120((byte) -61);
        class115.method709(30);
        class143.method946(false);
        class165.method1062((byte) -86);
        class86.method514(-128);
        class127.method794(arg0 - 15978);
        class57.method360((byte) -87);
        class148.method971(-1);
        class206.method1336((byte) 107);
        class142.method945(true);
        class197.method1295(4418);
        class160.method1025((byte) 104);
        class133.method880();
        class191.method1256(10);
        class150.method980(-128);
        class196.method1292((byte) -94);
        class22.method156((byte) 75);
        class163.method1048(2301979);
        class126.method770(arg0 ^ 0x2);
        class70.method435(124);
        class107.method628(0);
        class184.method1222(arg0 - 83);
        class48.method306((byte) -109);
        class1.method4((byte) -110);
        class174.method1156((byte) -96);
        class189.method1245(29940);
        class105.method619(-30585);
        class175.method1170(-78);
        class80.method488(-54);
        class182.method1210(arg0 ^ 0xFFFFFF90);
        class104.method617(arg0 - 65);
        class28.method192(arg0 - 32);
        class181.method1202(44);
        class24.method162();
        class110.method683(-47);
        class49.method309((byte) -114);
        class155.method1011((byte) 123);
        class51.method318((byte) -62);
        class141.method937((byte) -102);
        class91.method531(31165);
        class4.method31(0);
        class5.method36(arg0 - 3);
        class129.method837((byte) 108);
        class154.method1006((byte) -125);
        class52.method336();
        class138.method924(true);
        class153.method1003();
        class43.method276(708);
        class111.method688(1);
        class21.method144(10);
        class60.method376(0);
        class116.method711((byte) -30);
        class82.method495(true);
        class20.method140(-102);
        class95.method557(arg0 ^ 0x3);
        class167.method1091(false);
        class65.method406(-29176);
        class159.method1020(16076);
        class128.method832(-117);
        class187.method1234((byte) -105);
        class26.method184(-117);
        class29.method206(0);
        class188.method1238(-120);
        class13.method83(-117);
        class8.method45((byte) -9);
        class151.method997((byte) -78);
        class16.method93(0);
        class130.method844();
        class149.method975((byte) 121);
        class12.method80();
        class202.method1316(true);
        class39.method248();
        class158.method1019((byte) 61);
        class85.method513((byte) -122);
        class199.method1306(0);
        class56.method349(-1);
        class35.method236(-26993);
        class180.method1199((byte) -85);
        class17.method102(false);
        class73.method455((byte) 70);
        class30.method211();
        class96.method576(0);
        class76.method468(-86);
        class75.method461(arg0 - 1);
        class93.method541((byte) -122);
        class81.method491((byte) 51);
        class190.method1253(5);
        class117.method735();
        class103.method599(0);
        class58.method367(247);
        class69.method433((byte) 15);
        class134.method916(arg0 - 2);
        class77.method471(118);
        class61.method378(110272750);
        class87.method517(arg0 ^ 0xFFFFFFBF);
        class205.method1331((byte) -112);
        class9.method51((byte) 36);
        class27.method188(19365);
        class164.method1056(arg0 ^ arg0);
        class200.method1308((byte) -78);
        class121.method754(arg0 - 67);
        class32.method223(arg0 + 932729);
        class74.method460();
        class7.method42((byte) -55);
        class192.method1273(0);
        class6.method38(-1);
        class145.method957(256);
        class162.method1041((byte) -16);
        class135.method918(99);
        class46.method290(4);
        class171.method1143((byte) -113);
        class106.method623((byte) 23);
        class41.method266((byte) 121);
        class144.method953(-14175);
        class137.method923(arg0 ^ 0x2);
        class114.method698(0);
        class94.method549((byte) 83);
        class177.method1185((byte) 125);
        class147.method960(63);
        class34.method232();
        class173.method1150();
        class179.method1189((byte) -1);
        class40.method263();
        class203.method1322(110);
        class45.method282((byte) -77);
        class47.method297();
        class161.method1036(95);
        class89.method524((byte) 54);
        class31.method217(false);
        class84.method508();
        class78.method473();
        class193.method1278(17);
        class64.method405(0);
        class90.method528(1668462);
        class62.method386(arg0 + 550);
        class55.method346((byte) 122);
        class25.method179((byte) 115);
        class3.method28((byte) -128);
        class139.method928(1825402948);
        class66.method417(0);
        class185.method1229(-15335);
        class102.method596((byte) -117);
        class54.method344(50);
        class172.method1146(arg0 + 28430);
        class125.method766(true);
        class63.method390(-1);
        class123.method759((byte) -15);
        class92.method538(-112);
        class99.method590(-82);
        class136.method920(arg0 - 57);
        class42.method271(-56);
        class132.method860(arg0 ^ 0x76B6);
        class67.method426((byte) -91);
        class2.method12(arg0 ^ 0x2002);
        class140.method931(123);
        class176.method1181(-123);
        class15.method89(true);
        class156.method1013(111);
        class44.method279(arg0);
        class11.method60(arg0 - 2);
        class131.method859(1);
        class88.method522((byte) -58);
        class152.method1000(-121);
        class98.method586(arg0 ^ 0x78);
        class122.method756(true);
        class68.method428(-79);
        class183.method1214((byte) 43);
        class204.method1327(false);
        class19.method138(false);
        class178.method1187(1);
        class37.method241(30048);
        class112.method693(-119);
        class120.method750(26358);
        class195.method1289(arg0 - 2);
        class201.method1315(128);
        class118.method746((byte) 58);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method197(int arg0) {
        boolean var2 = class22.method146(false);
        field584++;
        if (var2 && class8.field216 && class20.field438 != null) {
            class20.field438.method1221((byte) 123);
        }
        if (class185.field3615) {
            class132.method862(class1.field4, arg0 - 80);
            class162.method1038(class1.field4, (byte) -120);
            if (class68.field1289 != null) {
                class68.field1289.method226(arg0 - 5, class1.field4);
            }
            this.method707(true);
            class23.method160(class1.field4, (byte) 49);
            class3.method21((byte) -13, class1.field4);
            if (class68.field1289 != null) {
                class68.field1289.method224(false, class1.field4);
            }
        }
        if (class111.field2031 == 0) {
            class102.method597(class55.field1006, null, class43.field811, 2);
        } else if (class111.field2031 == 5) {
            class110.method685(class114.field2087, class98.field1839, 9040);
        } else if (class111.field2031 == 10) {
            class110.method685(class114.field2087, class98.field1839, 9040);
        } else if (class111.field2031 == 20) {
            class110.method685(class114.field2087, class98.field1839, 9040);
        } else if (class111.field2031 == 25) {
            if (class82.field1508 == 1) {
                if (class17.field354 > class46.field851) {
                    class46.field851 = class17.field354;
                }
                int var3 = (class46.field851 - class17.field354) * 50 / class46.field851;
                class104.method612(-109, class165.method1058(0, new class169[] { class149.field2749, class141.field2628, class2.method18((byte) -62, var3), class26.field535 }), false);
            } else if (class82.field1508 == 2) {
                if (class141.field2632 > field578) {
                    field578 = class141.field2632;
                }
                int var4 = (field578 - class141.field2632) * 50 / field578 + 50;
                class104.method612(-120, class165.method1058(arg0 - 5, new class169[] { class149.field2749, class141.field2628, class2.method18((byte) -62, var4), class26.field535 }), false);
            } else {
                class104.method612(-119, class149.field2749, false);
            }
        } else if (class111.field2031 == 30) {
            class161.method1035(-4);
        } else if (class111.field2031 == 40) {
            class104.method612(arg0 ^ 0xFFFFFFAE, class165.method1058(0, new class169[] { class158.field3026, class185.field3608, class203.field3982 }), false);
        }
        if (class111.field2031 == 30 && class65.field1209 == 0 && !class180.field3513) {
            try {
                Graphics var5 = class1.field4.getGraphics();
                for (int var6 = 0; var6 < class201.field3930; var6++) {
                    if (class176.field3449[var6]) {
                        class174.field3354.method765(64, class85.field1570[var6], var5, class112.field2055[var6], class107.field1952[var6], class63.field1164[var6]);
                        class176.field3449[var6] = false;
                    }
                }
            } catch (Exception var10) {
                class1.field4.repaint();
            }
        } else if (class111.field2031 > 0) {
            try {
                Graphics var7 = class1.field4.getGraphics();
                class174.field3354.method763(18307, 0, var7, 0);
                class180.field3513 = false;
                for (int var8 = 0; var8 < class201.field3930; var8++) {
                    class176.field3449[var8] = false;
                }
            } catch (Exception var9) {
                class1.field4.repaint();
            }
        }
        if (arg0 != 5) {
            field594 = 69;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field586++;
        try {
            if (arg0.length != 7) {
                class171.method1142((byte) 46);
            }
            class80.field1482 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class20.field439 = 0;
            } else if (arg0[1].equals("office")) {
                class20.field439 = 1;
            } else if (arg0[1].equals("local")) {
                class20.field439 = 2;
            } else {
                class171.method1142((byte) 46);
            }
            if (arg0[2].equals("live")) {
                class22.field469 = 0;
            } else if (arg0[2].equals("rc")) {
                class22.field469 = 1;
            } else if (arg0[2].equals("wip")) {
                class22.field469 = 2;
            } else {
                class171.method1142((byte) 46);
            }
            if (arg0[3].equals("lowmem")) {
                class196.method1290(false);
            } else if (arg0[3].equals("highmem")) {
                class155.method1012(-75);
            } else {
                class171.method1142((byte) 46);
            }
            if (arg0[4].equals("free")) {
                class175.field3398 = false;
            } else if (arg0[4].equals("members")) {
                class175.field3398 = true;
            } else {
                class171.method1142((byte) 46);
            }
            if (arg0[5].equals("english")) {
                class154.field2976 = 0;
            } else if (arg0[5].equals("german")) {
                class191.method1267(1);
                class154.field2976 = 1;
                class45.field844 = class163.field3130;
            } else {
                class171.method1142((byte) 46);
            }
            if (arg0[6].equals("game0")) {
                class199.field3899 = 0;
            } else if (arg0[6].equals("game1")) {
                class199.field3899 = 1;
            } else {
                class171.method1142((byte) 46);
            }
            class20.field442 = "127.0.0.1";
            client var1 = new client();
            var1.method701(475, 765, 127, 16, "runescape", 503, class22.field469 + 32);
            class164.field3148.setLocation(40, 40);
        } catch (Exception var3) {
            class21.method142(54, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method198(int arg0) {
        if (class62.field1150 != null) {
            class62.field1150.field1580 = false;
        }
        class62.field1150 = null;
        field596++;
        if (class2.field37 != null) {
            class2.field37.method359((byte) 102);
            class2.field37 = null;
        }
        class8.method47(true);
        class177.method1182((byte) -47);
        class68.field1289 = null;
        if (class20.field438 != null) {
            class20.field438.method1220(71);
        }
        if (class149.field2762 != null) {
            class149.field2762.method1220(arg0 ^ 0x285);
        }
        class122.method757(-124);
        if (arg0 != 765) {
            method204(-32, null);
        }
        class118.method743(arg0 ^ 0xFFFFFD02);
        try {
            if (class104.field1916 != null) {
                class104.field1916.method1339(-13288);
            }
            if (class179.field3491 != null) {
                for (int var2 = 0; var2 < class179.field3491.length; var2++) {
                    if (class179.field3491[var2] != null) {
                        class179.field3491[var2].method1339(-13288);
                    }
                }
            }
            if (class82.field1512 != null) {
                class82.field1512.method1339(arg0 ^ 0xFFFFCEE5);
            }
            if (class181.field3531 != null) {
                class181.field3531.method1339(arg0 ^ 0xFFFFCEE5);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    private final void method199(byte arg0) {
        field580++;
        if (arg0 != 15) {
            field582 = null;
        }
        if (class111.field2031 != 1000) {
            boolean var2 = class91.method532(72);
            if (!var2) {
                this.method194(50);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public static final int method200(int arg0, int arg1, int arg2, int arg3) {
        field597++;
        if (arg0 != 4096) {
            method204(33, null);
        }
        return (4096 - arg3) * arg1 + arg2 * arg3 >> 12;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method201(int arg0) {
        field591++;
        class13.field304 = class20.field439 == 0 ? 43594 : class80.field1482 + 40000;
        class56.field1026 = class13.field304;
        if (class199.field3899 == 1) {
            class6.field116 = class158.field3025;
            class161.field3057 = class192.field3802;
            class70.field1310 = class4.field95;
            class80.field1474 = class171.field3311;
        } else {
            class161.field3057 = class110.field2014;
            class70.field1310 = class128.field2399;
            class80.field1474 = class189.field3690;
            class6.field116 = class182.field3545;
        }
        class80.field1472 = class20.field439 == 0 ? 443 : class80.field1482 + 50000;
        class151.method998((byte) -22);
        class23.method160(class1.field4, (byte) 49);
        class3.method21((byte) -13, class1.field4);
        class68.field1289 = class172.method1149(false);
        if (class68.field1289 != null) {
            class68.field1289.method224(false, class1.field4);
        }
        class181.field3534 = class109.field1988;
        try {
            if (class163.field3134.field1995 != null) {
                class104.field1916 = new class206(class163.field3134.field1995, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class179.field3491[var2] = new class206(class163.field3134.field2000[var2], 6000, 0);
                }
                class82.field1512 = new class206(class163.field3134.field1998, 6000, 0);
                class204.field3992 = new class142(255, class104.field1916, class82.field1512, 500000);
                class181.field3531 = new class206(class163.field3134.field1983, 24, 0);
                class163.field3134.field1998 = null;
                class163.field3134.field1995 = null;
                class163.field3134.field2000 = null;
                class163.field3134.field1983 = null;
            }
        } catch (IOException var3) {
            class204.field3992 = null;
            class104.field1916 = null;
            class181.field3531 = null;
            class82.field1512 = null;
        }
        if (class20.field439 != arg0) {
            class8.field225 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public static void method202(byte arg0) {
        field574 = null;
        field585 = null;
        field575 = null;
        field582 = null;
        if (arg0 != 76) {
            main(null);
        }
        field587 = null;
        field583 = null;
        field577 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
    public static final void method203(long arg0, byte arg1) {
        field598++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class45.method287((byte) 78, arg0 - 1L);
            class45.method287((byte) 103, 1L);
        } else {
            class45.method287((byte) 79, arg0);
        }
        if (arg1 >= -54) {
            method200(-40, 33, -65, 100);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILsg;)Z")
    public static final boolean method204(int arg0, class169 arg1) {
        field588++;
        if (arg1 == null) {
            return false;
        } else if (arg0 == -1569) {
            for (int var2 = 0; var2 < class57.field1064; var2++) {
                if (arg1.method1110(class137.field2553[var2], 70)) {
                    return true;
                }
            }
            return arg1.method1110(class4.field79.field3856, 70);
        } else {
            return true;
        }
    }
}
