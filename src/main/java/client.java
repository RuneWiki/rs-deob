import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class72 {

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field698 = 0;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field697 = 0;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lvd;")
    public static class222 field696 = class212.method1357("Lade Schrifts-=tze )2 ", 10731);

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lvd;")
    private static class222 field702 = class212.method1357("Enter your username (V password)3", 10731);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lvd;")
    private static class222 field703 = class212.method1357("You are standing in a members)2only area)3", 10731);

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lvd;")
    public static class222 field706 = field702;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lvd;")
    public static class222 field694 = field703;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lvd;")
    public static class222 field705 = class212.method1357("Mitglieder)2Welt", 10731);

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field704 = true;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    public static int[] field693 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method266(boolean arg0) {
        if (class186.field3444 != null) {
            class186.field3444.field1916 = false;
        }
        class186.field3444 = null;
        if (class31.field656 != null) {
            class31.field656.method784(5000);
            class31.field656 = null;
        }
        class172.method1090(class130.field2523, (byte) -17);
        field690++;
        class21.method202(class130.field2523, arg0);
        if (class149.field2850 != null) {
            class149.field2850.method367(class130.field2523, false);
        }
        class57.method419(906);
        class192.method1197(-115);
        class149.field2850 = null;
        if (class72.field1407 != null) {
            class72.field1407.method190(false);
        }
        if (class47.field963 != null) {
            class47.field963.method190(!arg0);
        }
        class28.method243((byte) 65);
        class93.method594((byte) 127);
        try {
            if (class205.field3807 != null) {
                class205.field3807.method1497(-1);
            }
            if (class73.field1459 != null) {
                for (int var2 = 0; var2 < class73.field1459.length; var2++) {
                    if (class73.field1459[var2] != null) {
                        class73.field1459[var2].method1497(-1);
                    }
                }
            }
            if (class68.field1274 != null) {
                class68.field1274.method1497(-1);
            }
            if (class70.field1312 != null) {
                class70.field1312.method1497(-1);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method267(byte arg0) {
        boolean var2 = class69.method473(3204);
        if (var2 && class176.field3293 && class72.field1407 != null) {
            class72.field1407.method182(false);
        }
        boolean var3 = false;
        field700++;
        if (arg0 != -85) {
            return;
        }
        if (class87.field1637) {
            var3 = true;
            class87.field1637 = false;
        }
        if (class34.field749 == 0) {
            class182.method1142(class97.field1804, class159.field3037, (byte) 112, null, var3);
        } else if (class34.field749 == 5 || class34.field749 == 10 || class34.field749 == 20) {
            class184.method1159((byte) 91, class227.field4261, class138.field2664);
        } else if (class34.field749 == 25) {
            if (class145.field2783 == 1) {
                if (class56.field1065 < field698) {
                    class56.field1065 = field698;
                }
                int var5 = (class56.field1065 - field698) * 50 / class56.field1065;
                class88.method571(class234.method1531(new class222[] { class29.field642, class226.field4240, class56.method414(arg0 ^ 0x28, var5), class168.field3208 }, arg0 - 10864), (byte) 121, false);
            } else if (class145.field2783 == 2) {
                if (class134.field2581 < class32.field680) {
                    class134.field2581 = class32.field680;
                }
                int var4 = (class134.field2581 - class32.field680) * 50 / class134.field2581 + 50;
                class88.method571(class234.method1531(new class222[] { class29.field642, class226.field4240, class56.method414(-97, var4), class168.field3208 }, arg0 - 10864), (byte) 119, false);
            } else {
                class88.method571(class29.field642, (byte) 108, false);
            }
        } else if (class34.field749 == 30) {
            class78.method520(false);
        } else if (class34.field749 == 40) {
            class88.method571(class234.method1531(new class222[] { class94.field1766, class128.field2495, class196.field3577 }, -10949), (byte) 105, false);
        }
        Canvas var6 = class130.field2523;
        if (class34.field749 == 30 && class197.field3600 == 0 && !var3) {
            try {
                Graphics var9 = var6.getGraphics();
                for (int var10 = 0; var10 < class98.field1834; var10++) {
                    if (class157.field3021[var10]) {
                        class93.field1750.method251(class214.field3982[var10], -1, class122.field2340[var10], class121.field2285[var10], var9, class56.field1062[var10]);
                        class157.field3021[var10] = false;
                    }
                }
            } catch (Exception var11) {
                var6.repaint();
            }
        } else if (class34.field749 > 0) {
            try {
                Graphics var7 = var6.getGraphics();
                class93.field1750.method250(true, 0, var7, 0);
                for (int var8 = 0; var8 < class98.field1834; var8++) {
                    class157.field3021[var8] = false;
                }
            } catch (Exception var12) {
                var6.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method268(int arg0, int arg1) {
        field691++;
        if (!class27.method232(arg1, arg0 + 9649)) {
            return;
        }
        class13[] var2 = class220.field4066[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class13 var4 = var2[var3];
            if (var4 != null) {
                var4.field270 = 0;
                var4.field262 = 0;
            }
        }
        if (arg0 != -17403) {
            field706 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static void method269(byte arg0) {
        field693 = null;
        field706 = null;
        field702 = null;
        if (arg0 == -83) {
            field694 = null;
            field705 = null;
            field696 = null;
            field703 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method270(int arg0) {
        field709++;
        if (class118.field2231 >= 4) {
            this.method492("js5crc", arg0 - 922);
            class34.field749 = 1000;
            return;
        }
        if (class177.field3310 >= 4) {
            if (class34.field749 <= 5) {
                this.method492("js5io", 110);
                class34.field749 = 1000;
                return;
            }
            class58.field1081 = 3000;
            class177.field3310 = 3;
        }
        if (class58.field1081-- > 0) {
            return;
        }
        try {
            if (class58.field1080 == 0) {
                class75.field1476 = class191.field3509.method278(class26.field593, (byte) 124, class120.field2266);
                class58.field1080++;
            }
            if (class58.field1080 == 1) {
                if (class75.field1476.field2716 == 2) {
                    this.method273(-1, 2);
                    return;
                }
                if (class75.field1476.field2716 == 1) {
                    class58.field1080++;
                }
            }
            if (class58.field1080 == 2) {
                class59.field1096 = new class123((Socket) class75.field1476.field2714, class191.field3509);
                class109 var2 = new class109(5);
                var2.method676(15, (byte) -3);
                var2.method684(492, 96);
                class59.field1096.method785(0, 0, var2.field2006, 5);
                class58.field1080++;
                class83.field1593 = class135.method849(true);
            }
            if (class58.field1080 == 3) {
                if (class34.field749 <= 5 || class59.field1096.method786(53) > 0) {
                    int var3 = class59.field1096.method780(arg0 - 1037);
                    if (var3 != 0) {
                        this.method273(var3, 2);
                        return;
                    }
                    class58.field1080++;
                } else if (class135.method849(true) - class83.field1593 > 30000L) {
                    this.method273(-2, 2);
                    return;
                }
            }
            if (class58.field1080 == 4) {
                class203.method1302(0, class34.field749 > 20, class59.field1096);
                class58.field1080 = 0;
                class159.field3031 = 0;
                class75.field1476 = null;
                class59.field1096 = null;
            }
        } catch (IOException var4) {
            this.method273(-3, 2);
        }
        if (arg0 != 1037) {
            field696 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field710++;
        if (!this.method493(0)) {
            return;
        }
        class208.field3875 = Integer.parseInt(this.getParameter("worldid"));
        class103.field1911 = Integer.parseInt(this.getParameter("modewhat"));
        class95.field1781 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class39.method312((byte) 55);
        } else {
            class120.method767(127);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class206.field3835 = true;
        } else {
            class206.field3835 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class183.method1149(-1);
            class103.field1915 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class70.field1328 = 1;
        } else {
            class70.field1328 = 0;
        }
        try {
            class204.field3798 = Integer.parseInt(this.getParameter("js"));
            class44.field925 = Integer.parseInt(this.getParameter("plug"));
            class77.field1490 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class135.field2613 = class39.field861.method1414(29649, this);
        if (class135.field2613 == null) {
            class135.field2613 = class29.field646;
        }
        class120.field2266 = this.getCodeBase().getHost();
        this.method490((byte) 109, 492, class103.field1911 + 32, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method271(int arg0) {
        class181.field3359 = class95.field1781 == 0 ? 43594 : class208.field3875 + 40000;
        if (class70.field1328 == 1) {
            class221.field4089 = class214.field3972;
            class140.field2708 = class99.field1859;
            class99.field1857 = class167.field3182;
            class211.field3930 = class119.field2262;
        } else {
            class140.field2708 = class120.field2274;
            class211.field3930 = class145.field2784;
            class221.field4089 = class160.field3044;
            class99.field1857 = class69.field1287;
        }
        class26.field593 = class181.field3359;
        class226.field4238 = class95.field1781 == 0 ? 443 : class208.field3875 + 50000;
        field699++;
        if (arg0 > -53) {
            this.method273(100, 119);
        }
        class218.method1387((byte) -62);
        class128.method811(class130.field2523, 126);
        class120.method769(class130.field2523, 4626);
        class149.field2850 = class65.method450(41);
        if (class149.field2850 != null) {
            class149.field2850.method371((byte) 118, class130.field2523);
        }
        class187.field3464 = class33.field721;
        try {
            if (class191.field3509.field724 != null) {
                class205.field3807 = new class228(class191.field3509.field724, 5200, 0);
                for (int var2 = 0; var2 < 24; var2++) {
                    class73.field1459[var2] = new class228(class191.field3509.field725[var2], 6000, 0);
                }
                class68.field1274 = new class228(class191.field3509.field722, 6000, 0);
                class228.field4297 = new class188(255, class205.field3807, class68.field1274, 500000);
                class70.field1312 = new class228(class191.field3509.field719, 24, 0);
                class191.field3509.field724 = null;
                class191.field3509.field725 = null;
                class191.field3509.field722 = null;
                class191.field3509.field719 = null;
            }
        } catch (IOException var3) {
            class228.field4297 = null;
            class205.field3807 = null;
            class70.field1312 = null;
            class68.field1274 = null;
        }
        if (class95.field1781 != 0) {
            class209.field3886 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method272(boolean arg0) {
        class175.field3280++;
        if (class175.field3280 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class32.field683 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class159.field3026.setSeed((long) class32.field683);
        }
        this.method274((byte) 115);
        field707++;
        class104.method641(-48001);
        class50.method364(arg0);
        class153.method980((byte) -128);
        class76.method508(-19506);
        class135.method851(0);
        if (class149.field2850 != null) {
            int var3 = class149.field2850.method370(32767);
            class225.field4209 = var3;
        }
        if (class34.field749 == 0) {
            this.method277(-6732);
            class97.method610(11637);
        } else if (class34.field749 == 5) {
            class159.method1006(4096, this);
            this.method277(-6732);
            class97.method610(11637);
        } else if (class34.field749 == 10) {
            class159.method1006(4096, this);
        } else if (class34.field749 == 20) {
            class159.method1006(4096, this);
            class173.method1095(31);
        } else if (class34.field749 == 25) {
            class65.method448(24421);
        }
        if (class34.field749 == 30) {
            class60.method426(0);
        } else if (class34.field749 == 40) {
            class173.method1095(31);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class8.method68(-1);
            }
            class208.field3875 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class95.field1781 = 0;
            } else if (arg0[1].equals("office")) {
                class95.field1781 = 1;
            } else if (arg0[1].equals("local")) {
                class95.field1781 = 2;
            } else {
                class8.method68(-1);
            }
            if (arg0[2].equals("live")) {
                class103.field1911 = 0;
            } else if (arg0[2].equals("rc")) {
                class103.field1911 = 1;
            } else if (arg0[2].equals("wip")) {
                class103.field1911 = 2;
            } else {
                class8.method68(-1);
            }
            if (arg0[3].equals("lowmem")) {
                class39.method312((byte) 55);
            } else if (arg0[3].equals("highmem")) {
                class120.method767(127);
            } else {
                class8.method68(-1);
            }
            if (arg0[4].equals("free")) {
                class206.field3835 = false;
            } else if (arg0[4].equals("members")) {
                class206.field3835 = true;
            } else {
                class8.method68(-1);
            }
            if (arg0[5].equals("english")) {
                class103.field1915 = 0;
            } else if (arg0[5].equals("german")) {
                class183.method1149(-1);
                class103.field1915 = 1;
            } else {
                class8.method68(-1);
            }
            if (arg0[6].equals("game0")) {
                class70.field1328 = 0;
            } else if (arg0[6].equals("game1")) {
                class70.field1328 = 1;
            } else {
                class8.method68(-1);
            }
            class135.field2613 = class29.field646;
            class120.field2266 = "127.0.0.1";
            class77.field1490 = 0;
            client var1 = new client();
            var1.method488(class103.field1911 + 32, "runescape", 503, 492, 24, 765, -121);
            class13.field342.setLocation(40, 40);
        } catch (Exception var3) {
            class68.method464(var3, 128, null);
        }
        field701++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method273(int arg0, int arg1) {
        class59.field1096 = null;
        field708++;
        if (arg1 != 2) {
            return;
        }
        class75.field1476 = null;
        if (class26.field593 == class181.field3359) {
            class26.field593 = class226.field4238;
        } else {
            class26.field593 = class181.field3359;
        }
        class58.field1080 = 0;
        class159.field3031++;
        if (class159.field3031 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class34.field749 <= 5) {
                this.method492("js5connect_full", arg1 + 90);
                class34.field749 = 1000;
            } else {
                class58.field1081 = 3000;
            }
        } else if (class159.field3031 >= 2 && arg0 == 6) {
            this.method492("js5connect_outofdate", 116);
            class34.field749 = 1000;
        } else if (class159.field3031 >= 4) {
            if (class34.field749 > 5) {
                class58.field1081 = 3000;
            } else {
                this.method492("js5connect", arg1 + 114);
                class34.field749 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method274(byte arg0) {
        if (arg0 < 96) {
            field706 = null;
        }
        field692++;
        if (class34.field749 != 1000) {
            boolean var2 = class119.method765(200);
            if (!var2) {
                this.method270(1037);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method275(int arg0) {
        field689++;
        method269((byte) -83);
        class222.method1411(true);
        class72.method487(-1);
        class184.method1155((byte) -118);
        class230.method1512((byte) 111);
        class103.method638(16006);
        class115.method745(128);
        class109.method714(false);
        class123.method782(false);
        class223.method1457(false);
        class228.method1499(-124);
        class188.method1184(-84);
        class193.method1202(-5);
        class211.method1354(0);
        class8.method71(107);
        class13.method113((byte) 72);
        class38.method310((byte) 34);
        class28.method241(1);
        class232.method1523(0);
        class51.method368((byte) 114);
        class80.method528(-108);
        class221.method1400(true);
        class20.method198(-1860);
        class25.method222(255);
        class226.method1483(-1);
        class183.method1148(-3592);
        class70.method475(arg0 - 90);
        class56.method415(0);
        class114.method739(121);
        class21.method206(arg0 ^ 0xFFFFFFB9);
        class132.method822(-65);
        class73.method502(false);
        class110.method716(arg0 ^ 0xFFFFA11F);
        class166.method1074((byte) -98);
        class129.method814(0);
        class96.method607(false);
        class62.method430((byte) -105);
        class121.method773(5);
        class23.method215((byte) -94);
        class156.method996(arg0 ^ 0xFFFF83D7);
        class44.method332((byte) 122);
        class137.method868((byte) -83);
        class94.method604((byte) 19);
        class201.method1284(true);
        class5.method53((byte) 125);
        class140.method879(-31610);
        class61.method429();
        class6.method55(3302);
        class92.method591((byte) 62);
        class215.method1370((byte) -53);
        class11.method105(false);
        class135.method853(arg0 - 22368);
        class31.method256((byte) 93);
        class26.method226((byte) 125);
        class3.method31(arg0 ^ arg0);
        class165.method1050(true);
        class179.method1120((byte) 61);
        class46.method340(arg0 + 15049);
        class66.method457((byte) -85);
        class151.method973(arg0 + 28);
        class118.method757(-114);
        class17.method145(161);
        class185.method1160(-108);
        class202.method1292((byte) 123);
        class212.method1355(94);
        class69.method472((byte) 117);
        class153.method984(-116);
        class68.method466((byte) 118);
        class65.method451(true);
        class199.method1267();
        class53.method400();
        class213.method1363(true);
        class34.method288(0);
        class15.method137();
        class88.method573((byte) 17);
        class101.method628(-62);
        class127.method802(6438);
        class105.method646((byte) 20);
        class93.method600((byte) 113);
        class82.method537(16752821);
        class134.method847(0);
        class148.method945();
        class231.method1515(true);
        class204.method1305(6179);
        class150.method970();
        class97.method612((byte) -120);
        class98.method615((byte) -110);
        class78.method515(39);
        class52.method379(arg0 ^ 0x6D1F);
        class125.method794(-105);
        class119.method760(false);
        class176.method1111((byte) 103);
        class32.method263((byte) -96);
        class142.method883();
        class187.method1169(arg0 - 10);
        class203.method1300(arg0 ^ 0xFFFFF008);
        class102.method635(-60);
        class155.method994((byte) 117);
        class233.method1526(92);
        class24.method216(128);
        class208.method1333((byte) 80);
        class77.method510(-11215);
        class133.method829();
        class138.method870(arg0 ^ 0xFFFFDB26);
        class216.method1376(0);
        class131.method821(arg0 + 21234);
        class83.method543(16);
        class191.method1193((byte) -48);
        class29.method248((byte) -117);
        class220.method1397(0);
        class89.method574();
        class104.method639(arg0 - 20871);
        class37.method299(false);
        class9.method85(124);
        class139.method875(-1);
        class126.method800(-29788);
        class43.method327((byte) -32);
        class225.method1473(arg0 + 18445);
        class146.method924((byte) -115);
        class35.method294(arg0 ^ 0xFFFFFFC9);
        class145.method919(true);
        class217.method1385(true);
        class106.method652((byte) -97);
        class122.method775(3873);
        class190.method1186(arg0 ^ 0x8D4);
        class79.method521((byte) 97);
        class18.method153(16);
        class74.method503();
        class224.method1468();
        class181.method1134((byte) -116);
        class207.method1332();
        class206.method1330((byte) -117);
        class174.method1101(43);
        class147.method929();
        class128.method809(true);
        class58.method422((byte) 100);
        class95.method605((byte) 121);
        class136.method858();
        class2.method9();
        class152.method979(123);
        class229.method1510(92);
        class81.method533(arg0 - 214);
        class205.method1325((byte) -112);
        class237.method1543((byte) 116);
        class47.method343(true);
        class197.method1216(0);
        class157.method1004(111);
        class86.method553(-1495);
        class10.method94(1);
        class22.method210(arg0 ^ 0x65);
        class192.method1200(true);
        class71.method484(false);
        class196.method1206(90);
        class235.method1534(true);
        class36.method296(-82);
        class159.method1005(11487);
        class55.method407((byte) -39);
        class161.method1012((byte) 105);
        class64.method437(arg0 ^ 0xFFFFFFE0);
        class214.method1364(arg0 + 20);
        class186.method1166((byte) 107);
        class182.method1140(arg0 ^ 0x58);
        class112.method724(false);
        class1.method3(-6568);
        class210.method1339((byte) 44);
        class99.method620(7475);
        class227.method1492(-7523);
        class173.method1096((byte) -125);
        class84.method546(arg0 ^ 0x1D);
        class177.method1119((byte) 113);
        class143.method912((byte) -9);
        class108.method656(-1731064800);
        class130.method818(116);
        class39.method313(arg0 ^ 0x64);
        class160.method1008(-19350);
        class168.method1084(2000);
        class87.method561(65408);
        class59.method425(arg0 ^ 0x3BE0);
        class42.method319(arg0 + 65180);
        class200.method1282(arg0 - 1539315128);
        class209.method1337(true);
        class7.method63(arg0 + 19836);
        class107.method655((byte) 65);
        class14.method122(false);
        class54.method406(-31563);
        class111.method718((byte) -128);
        class180.method1131(true);
        class234.method1528(80);
        class57.method418(-113);
        class50.method366((byte) 122);
        class172.method1088(32307);
        class162.method1023((byte) 127);
        class175.method1106(true);
        class27.method234(-25380);
        class149.method957(-5556);
        class76.method507(-35);
        class91.method582(76);
        class113.method731((byte) 38);
        class40.method315(0);
        class124.method789(31892);
        class16.method144((byte) -49);
        class120.method766((byte) 78);
        class218.method1388(73);
        class167.method1077((byte) -52);
        class116.method748(1000);
        class63.method435(16777215);
        class75.method506(-18524);
        if (class72.field1436) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Lvd;")
    public static final class222 method276(byte arg0, int arg1) {
        field695++;
        if (arg0 == 88) {
            return class72.field1434[arg1].method1444(-45) <= 0 ? class179.field3323[arg1] : class234.method1531(new class222[] { class179.field3323[arg1], class98.field1843, class72.field1434[arg1] }, -10949);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method277(int arg0) {
        field688++;
        if (class221.field4087 == 0) {
            class58.method421(4, 104, 104, class176.field3295);
            for (int var2 = 0; var2 < 4; var2++) {
                class108.field1993[var2] = new class8(104, 104);
            }
            class155.field2958 = new class19(512, 512);
            class159.field3037 = 5;
            class97.field1804 = class111.field2103;
            class221.field4087 = 20;
        } else if (class221.field4087 == 20) {
            int[] var3 = new int[9];
            for (int var4 = 0; var4 < 9; var4++) {
                int var5 = var4 * 32 + 128 + 15;
                int var6 = class199.field3640[var5];
                int var7 = var5 * 3 + 600;
                var3[var4] = var6 * var7 >> 16;
            }
            class105.method647(var3, 500, 800, 512, 334, 25, 3500);
            class159.field3037 = 10;
            class97.field1804 = class165.field3151;
            class221.field4087 = 30;
        } else if (class221.field4087 == 30) {
            class83.field1590 = class201.method1285(1000000, 0, true, true, false);
            class97.field1809 = class201.method1285(1000000, 1, true, true, false);
            class118.field2241 = class201.method1285(arg0 ^ 0xFFF0A7F4, 2, true, false, true);
            class115.field2197 = class201.method1285(1000000, 3, true, true, false);
            class153.field2941 = class201.method1285(1000000, 4, true, true, false);
            class109.field2037 = class201.method1285(1000000, 5, true, true, true);
            class187.field3466 = class201.method1285(1000000, 6, false, true, true);
            class116.field2217 = class201.method1285(1000000, 7, true, true, false);
            class78.field1508 = class201.method1285(arg0 + 1006732, 8, true, true, false);
            class130.field2531 = class201.method1285(arg0 + 1006732, 9, true, false, true);
            class120.field2268 = class201.method1285(1000000, 10, true, true, false);
            class87.field1655 = class201.method1285(1000000, 11, true, true, false);
            class43.field913 = class201.method1285(1000000, 12, true, true, false);
            class8.field126 = class201.method1285(arg0 ^ 0xFFF0A7F4, 13, true, false, true);
            class130.field2520 = class201.method1285(1000000, 14, false, true, false);
            class233.field4360 = class201.method1285(1000000, 15, true, true, false);
            class161.field3073 = class201.method1285(1000000, 16, true, true, false);
            class114.field2150 = class201.method1285(1000000, 17, true, true, false);
            class3.field35 = class201.method1285(1000000, 18, true, true, false);
            class214.field3974 = class201.method1285(1000000, 19, true, true, false);
            class39.field873 = class201.method1285(1000000, 20, true, true, false);
            class73.field1449 = class201.method1285(1000000, 21, true, true, false);
            class56.field1067 = class201.method1285(1000000, 22, true, true, false);
            class6.field94 = class201.method1285(arg0 + 1006732, 23, true, true, true);
            class97.field1804 = class101.field1886;
            class221.field4087 = 40;
            class159.field3037 = 20;
        } else if (class221.field4087 == 40) {
            byte var8 = 0;
            int var9 = var8 + class83.field1590.method1458(arg0 ^ 0x1A02) * 4 / 100;
            int var10 = var9 + class97.field1809.method1458(-74) * 4 / 100;
            int var11 = var10 + class118.field2241.method1458(-45) / 100;
            int var12 = var11 + class115.field2197.method1458(-90) * 2 / 100;
            int var13 = var12 + class153.field2941.method1458(-94) * 6 / 100;
            int var14 = var13 + class109.field2037.method1458(-118) * 4 / 100;
            int var15 = var14 + class187.field3466.method1458(-112) * 2 / 100;
            int var16 = var15 + class116.field2217.method1458(arg0 + 6643) * 53 / 100;
            int var17 = var16 + class78.field1508.method1458(-95) * 2 / 100;
            int var18 = var17 + class130.field2531.method1458(arg0 ^ 0x1A05) * 2 / 100;
            int var19 = var18 + class120.field2268.method1458(-86) * 2 / 100;
            int var20 = var19 + class87.field1655.method1458(-38) * 2 / 100;
            int var21 = var20 + class43.field913.method1458(-108) * 2 / 100;
            int var22 = var21 + class8.field126.method1458(-44) * 2 / 100;
            int var23 = var22 + class130.field2520.method1458(-72) * 2 / 100;
            int var24 = var23 + class233.field4360.method1458(arg0 + 6617) * 2 / 100;
            int var25 = var24 + class161.field3073.method1458(-117) / 100;
            int var26 = var25 + class114.field2150.method1458(arg0 ^ 0x1A0C) / 100;
            int var27 = var26 + class3.field35.method1458(-37) / 100;
            int var28 = var27 + class214.field3974.method1458(-59) / 100;
            int var29 = var28 + class39.field873.method1458(-44) / 100;
            int var30 = var29 + class73.field1449.method1458(-119) / 100;
            int var31 = var30 + class56.field1067.method1458(arg0 + 6679) / 100;
            int var32 = var31 + class6.field94.method1458(-88) / 100;
            if (var32 == 100) {
                class97.field1804 = class1.field2;
                class159.field3037 = 30;
                class43.method328(class78.field1508, class187.field3466, 113, class120.field2268);
                class221.field4087 = 45;
            } else {
                if (var32 != 0) {
                    class97.field1804 = class234.method1531(new class222[] { class121.field2279, class56.method414(-109, var32), class46.field951 }, -10949);
                }
                class159.field3037 = 30;
            }
        } else if (class221.field4087 == 45) {
            class104.method640(2, !class122.field2331, 22050, (byte) -49);
            class165 var33 = new class165();
            var33.method1056(128, 9, 0);
            class72.field1407 = class113.method734(127, 0, 22050, class191.field3509, class130.field2523);
            class72.field1407.method195(var33, false);
            class106.method653(class153.field2941, class130.field2520, class233.field4360, 124, var33);
            class47.field963 = class113.method734(-114, 1, 2048, class191.field3509, class130.field2523);
            class18.field443 = new class117();
            class47.field963.method195(class18.field443, false);
            class184.field3410 = new class25(22050, class106.field1956);
            class159.field3037 = 35;
            class97.field1804 = class23.field550;
            class221.field4087 = 50;
        } else if (class221.field4087 == 50) {
            int var34 = 0;
            if (class227.field4261 == null) {
                class227.field4261 = class149.method958(class46.field939, -27316, class29.field646, class8.field126, class78.field1508);
            } else {
                var34++;
            }
            if (class157.field3022 == null) {
                class157.field3022 = class227.field4261;
            } else {
                var34++;
            }
            if (class91.field1717 == null) {
                class91.field1717 = class149.method958(class118.field2237, -27316, class29.field646, class8.field126, class78.field1508);
            } else {
                var34++;
            }
            if (class138.field2664 == null) {
                class138.field2664 = class149.method958(class220.field4063, -27316, class29.field646, class8.field126, class78.field1508);
            } else {
                var34++;
            }
            if (var34 < 4) {
                class97.field1804 = class234.method1531(new class222[] { class162.field3092, class56.method414(-103, var34 * 100 / 4), class46.field951 }, -10949);
                class159.field3037 = 40;
            } else {
                class221.field4087 = 60;
                class159.field3037 = 40;
                class97.field1804 = class73.field1456;
            }
        } else if (class221.field4087 == 60) {
            int var35 = class24.method218(class78.field1508, class120.field2268, -123);
            int var36 = class187.method1178((byte) 82);
            if (var35 < var36) {
                class97.field1804 = class234.method1531(new class222[] { class196.field3565, class56.method414(-126, var35 * 100 / var36), class46.field951 }, -10949);
                class159.field3037 = 50;
            } else {
                class159.field3037 = 50;
                class221.field4087 = 65;
                class97.field1804 = class213.field3957;
            }
        } else if (class221.field4087 == 65) {
            class159.field3037 = 50;
            class97.field1804 = class173.field3243;
            class55.method410(5, 0);
            class221.field4087 = 70;
        } else if (class221.field4087 == 70) {
            class118.field2241.method17(0);
            byte var37 = 0;
            int var38 = var37 + class118.field2241.method19(0);
            class161.field3073.method17(0);
            int var39 = var38 + class161.field3073.method19(0);
            class114.field2150.method17(0);
            int var40 = var39 + class114.field2150.method19(arg0 ^ 0xFFFFE5B4);
            class3.field35.method17(arg0 + 6732);
            int var41 = var40 + class3.field35.method19(0);
            class214.field3974.method17(0);
            int var42 = var41 + class214.field3974.method19(0);
            class39.field873.method17(arg0 + 6732);
            int var43 = var42 + class39.field873.method19(0);
            class73.field1449.method17(arg0 ^ 0xFFFFE5B4);
            int var44 = var43 + class73.field1449.method19(0);
            class56.field1067.method17(arg0 + 6732);
            int var45 = var44 + class56.field1067.method19(arg0 ^ 0xFFFFE5B4);
            if (var45 < 800) {
                class97.field1804 = class234.method1531(new class222[] { class97.field1806, class56.method414(-96, var45 / 8), class46.field951 }, -10949);
                class159.field3037 = 60;
            } else {
                class172.method1093(-4805, class118.field2241);
                class221.method1402(class118.field2241, 1068912125);
                class83.method541(class116.field2217, class118.field2241, 1);
                class115.method746(class116.field2217, class122.field2331, class161.field3073, (byte) 76);
                class227.method1490(class3.field35, arg0 + 10828, class116.field2217);
                class67.method461(class116.field2217, class206.field3835, true, class214.field3974, class157.field3022);
                class145.method918(-28468, class97.field1809, class39.field873, class83.field1590);
                class101.method630(class73.field1449, class116.field2217, -95);
                class47.method342(class56.field1067, arg0 + 6750);
                class191.method1192(class118.field2241, false);
                class107.method654(class115.field2197, false, class116.field2217, class8.field126, class78.field1508);
                class11.method101(-12446, class118.field2241);
                class56.method416(arg0 + 6616, class114.field2150);
                class235.method1533(8, class118.field2241);
                class91.method583(class118.field2241, (byte) -78);
                class159.field3037 = 60;
                class97.field1804 = class9.field174;
                class129.method815(-118);
                class221.field4087 = 80;
            }
        } else if (class221.field4087 == 80) {
            int var46 = 0;
            if (class28.field614 == null) {
                class28.field614 = class21.method201(class78.field1508, class29.field646, true, class230.field4327);
            } else {
                var46++;
            }
            if (class21.field504 == null) {
                class21.field504 = class216.method1374(class78.field1508, 1288, class120.field2263, class29.field646);
            } else {
                var46++;
            }
            if (class59.field1111 == null) {
                class59.field1111 = class120.method768(class82.field1572, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class25.field573 == null) {
                class25.field573 = class59.field1111;
            } else {
                var46++;
            }
            if (class181.field3363 == null) {
                class181.field3363 = class120.method768(class230.field4324, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class151.field2914 == null) {
                class151.field2914 = class120.method768(class115.field2196, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class28.field609 == null) {
                class28.field609 = class120.method768(class173.field3244, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class91.field1709 == null) {
                class91.field1709 = class120.method768(class103.field1920, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class32.field667 == null) {
                class32.field667 = class120.method768(class50.field971, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class151.field2921 == null) {
                class151.field2921 = class120.method768(class216.field4019, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class201.field3687 == null) {
                class201.field3687 = class21.method201(class78.field1508, class29.field646, true, class103.field1913);
            } else {
                var46++;
            }
            if (class44.field927 == null) {
                class44.field927 = class120.method768(class211.field3933, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class235.field4379 == null) {
                class235.field4379 = class120.method768(class14.field398, (byte) -52, class78.field1508, class29.field646);
            } else {
                var46++;
            }
            if (class63.field1157 == null) {
                class63.field1157 = class216.method1374(class78.field1508, 1288, class110.field2066, class29.field646);
            } else {
                var46++;
            }
            if (class24.field552 == null) {
                class24.field552 = class216.method1374(class78.field1508, 1288, class83.field1588, class29.field646);
            } else {
                var46++;
            }
            var46++;
            if (var46 < 16) {
                class97.field1804 = class234.method1531(new class222[] { class14.field390, class56.method414(arg0 + 6606, var46 * 100 / 16), class46.field951 }, -10949);
                class159.field3037 = 70;
            } else {
                class227.field4261.method894(class24.field552, null);
                class91.field1717.method894(class24.field552, null);
                class138.field2664.method894(class24.field552, null);
                if (class227.field4261 != class157.field3022) {
                    class157.field3022.method894(class24.field552, null);
                }
                for (int var47 = 0; var47 < class151.field2921.length; var47++) {
                    class151.field2921[var47].method162();
                }
                class28.field614.method162();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 41.0D) - 20;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                for (int var52 = 0; var52 < class59.field1111.length; var52++) {
                    class59.field1111[var52].method179(var48 + var50, var49 + var50, var51 + var50);
                }
                class21.field504[0].method1389(var48 + var50, var49 - -var50, var50 + var51);
                class97.field1804 = class228.field4279;
                class221.field4087 = 90;
                class159.field3037 = 70;
            }
        } else if (class221.field4087 == 90) {
            if (class130.field2531.method17(0)) {
                class187 var53 = new class187(class130.field2531, class78.field1508, 20, class122.field2331 ? 64 : 128);
                class199.method1268(var53);
                class199.method1273(0.7F);
                class159.field3037 = 90;
                class221.field4087 = 110;
                class97.field1804 = class28.field623;
            } else {
                class97.field1804 = class234.method1531(new class222[] { class217.field4023, class56.method414(arg0 ^ 0x1A27, class130.field2531.method19(0)), class46.field951 }, -10949);
                class159.field3037 = 90;
            }
        } else if (class221.field4087 == 110) {
            class186.field3444 = new class103();
            class191.field3509.method283(class186.field3444, 10, 0);
            class221.field4087 = 120;
            class97.field1804 = class215.field3996;
            class159.field3037 = 94;
        } else if (class221.field4087 == 120) {
            if (class120.field2268.method40((byte) -30, class129.field2518, class29.field646)) {
                class102 var54 = new class102(class120.field2268.method20(arg0 + 22880, class29.field646, class129.field2518));
                class186.method1165(var54, (byte) -114);
                class97.field1804 = class111.field2082;
                class159.field3037 = 96;
                class221.field4087 = 130;
            } else {
                class97.field1804 = class234.method1531(new class222[] { class46.field945, class25.field584 }, arg0 ^ 0x308F);
                class159.field3037 = 96;
            }
        } else if (arg0 == -6732) {
            if (class221.field4087 == 130) {
                if (!class115.field2197.method17(0)) {
                    class97.field1804 = class234.method1531(new class222[] { class52.field1004, class56.method414(-104, class115.field2197.method19(arg0 + 6732) * 4 / 5), class46.field951 }, -10949);
                    class159.field3037 = 100;
                } else if (!class43.field913.method17(arg0 ^ 0xFFFFE5B4)) {
                    class97.field1804 = class234.method1531(new class222[] { class52.field1004, class56.method414(-110, class43.field913.method19(0) / 6 + 80), class46.field951 }, -10949);
                    class159.field3037 = 100;
                } else if (class8.field126.method17(0)) {
                    class97.field1804 = class28.field625;
                    class159.field3037 = 100;
                    class221.field4087 = 140;
                } else {
                    class97.field1804 = class234.method1531(new class222[] { class52.field1004, class56.method414(-107, class8.field126.method19(0) / 20 + 96), class46.field951 }, -10949);
                    class159.field3037 = 100;
                }
            } else if (class221.field4087 == 140) {
                class109.field2037.method44(true, false, false);
                class187.field3466.method44(true, false, true);
                class78.field1508.method44(true, false, true);
                class8.field126.method44(true, false, true);
                class120.field2268.method44(true, false, true);
                class55.method410(10, 0);
            }
        }
    }
}
