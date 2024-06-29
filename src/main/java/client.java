import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class87 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lba;")
    public static class7 field459 = new class7(64);

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lgd;")
    private static class40 field467 = class14.method90(false, "Loaded interfaces");

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    public static int[] field465 = new int[99];

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lgd;")
    public static class40 field470 = class14.method90(false, "mapdots");

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lgd;")
    public static class40 field469 = field467;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Lgd;")
    public static class40 field474 = class14.method90(false, "null");

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lgd;")
    private static class40 field466 = class14.method90(false, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lgd;")
    public static class40 field472 = field466;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field473 = 0;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Lgd;")
    public static class40 field475 = class14.method90(false, "null");

    @OriginalMember(owner = "client!client", name = "F", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Loc;")
    public static class86 field468;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field465[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 18)
    public final void method107(int arg0) {
        field455++;
        class10.field242++;
        this.method108((byte) 117);
        class59.method444(false);
        class94.method639(19938);
        class99.method701(14002);
        class103.method734(100);
        class82.method545((byte) -104);
        if (class115.field2769 == 0) {
            class93.method627(100);
            class130.method1029((byte) -126);
        } else if (class115.field2769 == 5) {
            class93.method627(100);
            class130.method1029((byte) -122);
        } else if (class115.field2769 == 10) {
            class48.method370((byte) 124);
        } else if (class115.field2769 == 20) {
            class48.method370((byte) 104);
            class135.method1067((byte) -124);
        } else if (class115.field2769 == 25) {
            class31.method200((byte) 73);
        }
        if (arg0 != -4026) {
            this.method107(-54);
        }
        if (class115.field2769 == 30) {
            class91.method609(arg0 ^ 0xFFFFB841);
        } else if (class115.field2769 == 35) {
            class91.method609(18439);
        } else if (class115.field2769 == 40) {
            class135.method1067((byte) -29);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 83)
    private final void method108(byte arg0) {
        field454++;
        if (class115.field2769 != 1000) {
            boolean var2 = class70.method491(arg0 ^ 0x770B);
            if (arg0 == 117 && !var2) {
                this.method113(-80);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 113)
    public static final void method109(int arg0, int arg1) {
        field451++;
        class133 var2 = (class133) class10.field259.method142((long) arg0, 23056);
        if (var2 != null) {
            if (arg1 > -58) {
                field473 = 107;
            }
            var2.method833(4);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 133)
    public final void method110(byte arg0) {
        method115(arg0 ^ 0x144A);
        field461++;
        class40.method251(-10);
        class87.method575(0);
        class59.method445(119);
        class86.method564(-36);
        class79.method532(arg0 ^ 0x114B);
        class104.method799((byte) 84);
        class137.method1083(382);
        class135.method1060((byte) 60);
        class91.method616((byte) 98);
        class82.method542(118);
        class23.method134(0);
        class43.method296((byte) 74);
        class47.method344();
        class124.method953();
        class99.method687(-1);
        class96.method646(true);
        class89.method584(9);
        class30.method194(arg0 - 25);
        class48.method376((byte) -35);
        class112.method869(true);
        class31.method207(arg0 ^ 0xFFFFED13);
        class93.method630(104);
        class128.method1010((byte) 89);
        class24.method146((byte) -20);
        class108.method832(false);
        class64.method461(5);
        class74.method501(false);
        class7.method41(24040);
        class45.method308((byte) 116);
        class97.method665();
        class16.method97(-1);
        class136.method1070(arg0 - 25706);
        class60.method447(1585);
        class54.method411(536857562);
        class120.method911((byte) 113);
        class42.method283(arg0 + 88);
        class1.method7(-24467);
        class2.method9(32767);
        class44.method307(-70);
        class61.method450(arg0 + 80);
        class52.method406(-71);
        class95.method643();
        class58.method440(-1);
        class118.method904((byte) -107);
        class98.method685(0);
        class67.method483((byte) 109);
        class103.method730((byte) 80);
        class70.method488((byte) -2);
        class94.method635((byte) 68);
        class12.method65(7);
        class100.method703((byte) 61);
        class21.method122(-1);
        class34.method213((byte) -32);
        class76.method512(arg0 - 101);
        class85.method559(-70);
        class115.method890(-126);
        class109.method838();
        class27.method159();
        class63.method458(-11);
        class18.method105(true);
        class69.method485(arg0 ^ 0x11A);
        if (arg0 != 26) {
            return;
        }
        class22.method128(0);
        class122.method934(false);
        class130.method1026(9556);
        class14.method84(0);
        class4.method26(arg0 ^ 0x1A);
        class131.method1036(-1);
        class49.method386((byte) 31);
        class125.method991(false);
        class114.method881((byte) -65);
        class92.method624((byte) -20);
        class6.method32();
        class129.method1018(0);
        class110.method855(-5000);
        class88.method580((byte) 116);
        class56.method419((byte) 123);
        class133.method1043(arg0 ^ 0xFFFFFFE6);
        class101.method708(-20132);
        class107.method824(0);
        class29.method187((byte) 121);
        class3.method13();
        class35.method219(-94);
        class55.method417(-1);
        class66.method479(0);
        class5.method30(1);
        class106.method823(0);
        class41.method280(arg0 + 24);
        class38.method237(-108);
        class51.method395(5117);
        class83.method551(true);
        class134.method1048(false);
        class50.method393(-1);
        class65.method466(arg0 - 10);
        class11.method59(12269);
        class26.method157();
        class8.method44(arg0 - 147);
        class25.method151();
        class80.method537(78);
        class105.method818();
        class132.method1040(0);
        class53.method408((byte) -81);
        class113.method879(-14019);
        class10.method56((byte) -109);
        class36.method225();
        class111.method859();
        class9.method53(false);
        class126.method1004(-24286);
        class77.method516(arg0 ^ 0xFFFFFF80);
        class90.method600(-87);
        class121.method930();
        class13.method73(-23329);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 259)
    public final void method111(byte arg0) {
        class120.field2823 = class50.field1283 == 0 ? 443 : class4.field108 + 50000;
        field456++;
        if (arg0 != -33) {
            field473 = -11;
        }
        class108.field2645 = class50.field1283 == 0 ? 43594 : class4.field108 + 40000;
        class21.field486 = class108.field2645;
        class76.method514(true);
        class115.method891(class30.field761, -121);
        class42.method287(24446, class30.field761);
        class86.field1934 = class102.field2420;
        try {
            if (class30.field737.field2440 != null) {
                class4.field145 = new class91(class30.field737.field2440, 5200, 0);
                for (int var2 = 0; var2 < 14; var2++) {
                    class96.field2227[var2] = new class91(class30.field737.field2427[var2], 6000, 0);
                }
                class44.field1111 = new class91(class30.field737.field2421, 6000, 0);
                class65.field1588 = new class82(255, class4.field145, class44.field1111, 500000);
                class30.field737.field2421 = null;
                class30.field737.field2440 = null;
                class30.field737.field2427 = null;
            }
        } catch (IOException var3) {
            class44.field1111 = null;
            class4.field145 = null;
            class65.field1588 = null;
        }
        if (class50.field1283 != 0) {
            class122.field2871 = true;
        }
        class31.field783 = new class30();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 308)
    public final void method112(int arg0) {
        if (class8.field201) {
            class29.method188(class30.field761, (byte) -125);
            class118.method906(class30.field761, (byte) -95);
            this.method569((byte) 24);
            class115.method891(class30.field761, -88);
            class42.method287(24446, class30.field761);
        }
        if (class115.field2769 == 0) {
            class51.method399((byte) 107, class92.field2113, class13.field342, null);
        } else if (class115.field2769 == 5) {
            class136.method1069(121, class1.field17, class77.field1778);
        } else if (class115.field2769 == 10) {
            class136.method1069(-27, class1.field17, class77.field1778);
        } else if (class115.field2769 == 20) {
            class136.method1069(69, class1.field17, class77.field1778);
        } else if (class115.field2769 == 25) {
            if (class103.field2473 == 1) {
                if (class11.field273 > class131.field3184) {
                    class131.field3184 = class11.field273;
                }
                int var2 = (class131.field3184 - class11.field273) * 50 / class131.field3184;
                class100.method704(true, method114(true, new class40[] { class74.field1723, class21.method121(23444, var2), class83.field1871 }), true, class69.field1668);
            } else if (class103.field2473 == 2) {
                if (class13.field346 > class34.field869) {
                    class34.field869 = class13.field346;
                }
                int var3 = (class34.field869 - class13.field346) * 50 / class34.field869 + 50;
                class100.method704(true, method114(true, new class40[] { class74.field1723, class21.method121(23444, var3), class83.field1871 }), true, class69.field1668);
            } else {
                class100.method704(false, null, true, class69.field1668);
            }
        } else if (class115.field2769 == 30) {
            class63.method457((byte) -98);
        } else if (class115.field2769 == 35) {
            class42.method282(-18566);
        } else if (class115.field2769 == 40) {
            class100.method704(false, class70.field1682, true, class10.field256);
        }
        class49.field1259 = 0;
        field452++;
        int var4 = -57 % ((-arg0 - 70) / 44);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 387)
    private final void method113(int arg0) {
        field463++;
        int var2 = -37 % ((41 - arg0) / 53);
        if (class60.field1503 >= 4) {
            this.method577(28, "js5crc");
            class115.field2769 = 1000;
            return;
        }
        if (class112.field2713 >= 4) {
            if (class115.field2769 <= 5) {
                this.method577(28, "js5io");
                class115.field2769 = 1000;
                return;
            }
            class112.field2713 = 3;
            class108.field2634 = 3000;
        }
        if (class108.field2634-- > 0) {
            return;
        }
        try {
            if (class29.field620 == 0) {
                class106.field2593 = class30.field737.method722(true, class21.field486);
                class29.field620++;
            }
            if (class29.field620 == 1) {
                if (class106.field2593.field2885 == 2) {
                    this.method117(0, -1);
                    return;
                }
                if (class106.field2593.field2885 == 1) {
                    class29.field620++;
                }
            }
            if (class29.field620 == 2) {
                class100.field2383 = new class137((Socket) class106.field2593.field2887, class30.field737);
                class104 var3 = new class104(5);
                var3.method756(15, 1);
                var3.method761(441, -23644);
                class100.field2383.method1086(0, var3.field2554, 5, (byte) 118);
                class29.field620++;
                class120.field2812 = class98.method683(0);
            }
            if (class29.field620 == 3) {
                if (class115.field2769 <= 5 || class100.field2383.method1085(0) > 0) {
                    int var4 = class100.field2383.method1084(-90);
                    if (var4 != 0) {
                        this.method117(0, var4);
                        return;
                    }
                    class29.field620++;
                } else if (class98.method683(0) - class120.field2812 > 30000L) {
                    this.method117(0, -2);
                    return;
                }
            }
            if (class29.field620 == 4) {
                class45.method311(class100.field2383, class115.field2769 > 20, 2);
                class29.field620 = 0;
                class45.field1145 = 0;
                class100.field2383 = null;
                class106.field2593 = null;
            }
        } catch (IOException var5) {
            this.method117(0, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 537)
    public final void init() {
        field460++;
        if (!this.method567(15731)) {
            return;
        }
        class4.field108 = Integer.parseInt(this.getParameter("worldid"));
        class82.field1852 = Integer.parseInt(this.getParameter("modewhat"));
        class50.field1283 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class120.method912(true);
        } else {
            class29.method189(7887591);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class44.field1104 = true;
        } else {
            class44.field1104 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class136.method1076(126);
            class115.field2758 = 1;
        }
        this.method578(97, 503, 441, 765, class82.field1852 + 32);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 588)
    public static final void main(String[] arg0) {
        field453++;
        try {
            if (arg0.length != 6) {
                class9.method51(1);
            }
            class4.field108 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class50.field1283 = 0;
            } else if (arg0[1].equals("office")) {
                class50.field1283 = 1;
            } else if (arg0[1].equals("local")) {
                class50.field1283 = 2;
            } else {
                class9.method51(1);
            }
            if (arg0[2].equals("live")) {
                class82.field1852 = 0;
            } else if (arg0[2].equals("rc")) {
                class82.field1852 = 1;
            } else if (arg0[2].equals("wip")) {
                class82.field1852 = 2;
            } else {
                class9.method51(1);
            }
            if (arg0[3].equals("lowmem")) {
                class120.method912(true);
            } else if (arg0[3].equals("highmem")) {
                class29.method189(7887591);
            } else {
                class9.method51(1);
            }
            if (arg0[4].equals("free")) {
                class44.field1104 = false;
            } else if (arg0[4].equals("members")) {
                class44.field1104 = true;
            } else {
                class9.method51(1);
            }
            if (arg0[5].equals("english")) {
                class115.field2758 = 0;
            } else if (arg0[5].equals("german")) {
                class136.method1076(127);
                class115.field2758 = 1;
            } else {
                class9.method51(1);
            }
            client var1 = new client();
            var1.method568(441, InetAddress.getLocalHost(), 41, 503, 14, class82.field1852 + 32, "runescape", 765);
        } catch (Exception var3) {
            class50.method392(43, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[Lgd;)Lgd;", line = 695)
    public static final class40 method114(boolean arg0, class40[] arg1) {
        field450++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg0) {
            return class131.method1038((byte) 59, 0, arg1.length, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 719)
    public static void method115(int arg0) {
        field468 = null;
        field465 = null;
        field459 = null;
        field474 = null;
        field469 = null;
        field467 = null;
        field475 = null;
        if (arg0 != 5200) {
            method118(-12);
        }
        field466 = null;
        field472 = null;
        field470 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 738)
    public final void method116(byte arg0) {
        if (class66.field1608 != null) {
            class66.field1608.field1816 = false;
        }
        class66.field1608 = null;
        if (class110.field2684 != null) {
            class110.field2684.method1079(true);
            class110.field2684 = null;
        }
        class66.method471(-4);
        class126.method1003(-361);
        class94.method640(-9475);
        int var2 = 29 / ((arg0 - 19) / 57);
        field449++;
        class79.method529(-19);
        class136.method1077(-34);
        class70.method492(-1);
        try {
            if (class4.field145 != null) {
                class4.field145.method610(-5691);
            }
            if (class96.field2227 != null) {
                for (int var3 = 0; var3 < class96.field2227.length; var3++) {
                    if (class96.field2227[var3] != null) {
                        class96.field2227[var3].method610(-5691);
                    }
                }
            }
            if (class44.field1111 != null) {
                class44.field1111.method610(-5691);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 790)
    private final void method117(int arg0, int arg1) {
        class106.field2593 = null;
        field458++;
        class29.field620 = arg0;
        if (class21.field486 == class108.field2645) {
            class21.field486 = class120.field2823;
        } else {
            class21.field486 = class108.field2645;
        }
        class45.field1145++;
        class100.field2383 = null;
        if (class45.field1145 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class115.field2769 <= 5) {
                this.method577(arg0 ^ 0x1C, "js5connect_full");
                class115.field2769 = 1000;
            } else {
                class108.field2634 = 3000;
            }
        } else if (class45.field1145 >= 2 && arg1 == 6) {
            this.method577(28, "js5connect_outofdate");
            class115.field2769 = 1000;
        } else if (class45.field1145 >= 4) {
            if (class115.field2769 > 5) {
                class108.field2634 = 3000;
            } else {
                this.method577(arg0 ^ 0x1C, "js5connect");
                class115.field2769 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 865)
    public static final void method118(int arg0) {
        field457++;
        if (class74.field1713 == 0) {
            return;
        }
        class47 var1 = class133.field3238;
        int var2 = arg0;
        if (class82.field1856 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class30.field664[var3] != null) {
                int var4 = class52.field1316[var3];
                byte var5 = 0;
                class40 var6 = class10.field247[var3];
                if (var6 != null && var6.method276(36, class7.field196)) {
                    var5 = 1;
                    var6 = var6.method240(-28427, 5);
                }
                if (var6 != null && var6.method276(arg0 ^ 0x24, class55.field1408)) {
                    var6 = var6.method240(-28427, 5);
                    var5 = 2;
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class94.field2163 == 0 || class94.field2163 == 1 && class66.method478(true, var6))) {
                    byte var7 = 4;
                    int var8 = 329 - var2 * 13;
                    var1.method353(class100.field2372, var7, var8, 0);
                    var2++;
                    var1.method353(class100.field2372, var7, var8 - 1, 65535);
                    int var9 = var7 + var1.method367(class100.field2372);
                    int var10 = var9 + var1.method350(32);
                    if (var5 == 1) {
                        class54.field1394[0].method497(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var5 == 2) {
                        class54.field1394[1].method497(var10, var8 - 12);
                        var10 += 14;
                    }
                    var1.method353(method114(true, new class40[] { var6, class10.field257, class30.field664[var3] }), var10, var8, 0);
                    var1.method353(method114(true, new class40[] { var6, class10.field257, class30.field664[var3] }), var10, var8 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class94.field2163 < 2) {
                    int var11 = 329 - var2 * 13;
                    var1.method353(class30.field664[var3], 4, var11, 0);
                    var1.method353(class30.field664[var3], 4, var11 - 1, 65535);
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class94.field2163 < 2) {
                    int var12 = 329 - var2 * 13;
                    var2++;
                    var1.method353(method114(true, new class40[] { class108.field2625, class9.field237, var6, class10.field257, class30.field664[var3] }), 4, var12, 0);
                    var1.method353(method114(true, new class40[] { class108.field2625, class9.field237, var6, class10.field257, class30.field664[var3] }), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }
}
