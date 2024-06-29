import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class97 {

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lmd;")
    public static class113 field496 = new class113(32);

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
    public static boolean field499 = false;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public static void method164(boolean arg0) {
        field496 = null;
        if (!arg0) {
            method164(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field491++;
        if (!this.method547(true)) {
            return;
        }
        class204.field3947 = Integer.parseInt(this.getParameter("worldid"));
        class178.field3545 = Integer.parseInt(this.getParameter("modewhat"));
        class131.field2466 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class182.method1186((byte) -95);
        } else {
            class91.method477(0);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class62.field988 = true;
        } else {
            class62.field988 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class8.method43((byte) 9);
            class43.field715 = class122.field2273;
            class139.field2693 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class141.field2749 = 1;
        } else {
            class141.field2749 = 0;
        }
        try {
            class72.field1323 = Integer.parseInt(this.getParameter("js"));
            class57.field936 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class41.field685 = this.getCodeBase().getHost();
        this.method540(479, class178.field3545 + 32, 503, 765, -25760);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method165(int arg0) {
        field494++;
        if (~class28.field455 != arg0) {
            boolean var2 = class121.method688(arg0 ^ 0xFFFFEC17);
            if (!var2) {
                this.method166(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    private final void method166(boolean arg0) {
        field485++;
        if (class181.field3578 >= 4) {
            this.method545("js5crc", -117);
            class28.field455 = 1000;
            return;
        }
        if (class2.field38 >= 4) {
            if (class28.field455 <= 5) {
                this.method545("js5io", 67);
                class28.field455 = 1000;
                return;
            }
            class96.field1774 = 3000;
            class2.field38 = 3;
        }
        if (class96.field1774-- > 0) {
            return;
        }
        try {
            if (class89.field1635 == 0) {
                class73.field1344 = class77.field1393.method915(class41.field685, 0, class121.field2242);
                class89.field1635++;
            }
            if (!arg0) {
                if (class89.field1635 == 1) {
                    if (class73.field1344.field344 == 2) {
                        this.method174(-1, (byte) -56);
                        return;
                    }
                    if (class73.field1344.field344 == 1) {
                        class89.field1635++;
                    }
                }
                if (class89.field1635 == 2) {
                    class205.field3981 = new class1((Socket) class73.field1344.field342, class77.field1393);
                    class158 var2 = new class158(5);
                    var2.method1069(15, (byte) -26);
                    var2.method1051(!arg0, 479);
                    class205.field3981.method6(0, var2.field3162, 5, (byte) -20);
                    class89.field1635++;
                    class115.field2165 = class171.method1146((byte) -3);
                }
                if (class89.field1635 == 3) {
                    if (class28.field455 <= 5 || class205.field3981.method4(5) > 0) {
                        int var3 = class205.field3981.method2(-68);
                        if (var3 != 0) {
                            this.method174(var3, (byte) -56);
                            return;
                        }
                        class89.field1635++;
                    } else if (class171.method1146((byte) 119) - class115.field2165 > 30000L) {
                        this.method174(-2, (byte) -56);
                        return;
                    }
                }
                if (class89.field1635 == 4) {
                    class107.method587(class28.field455 > 20, class205.field3981, 0);
                    class195.field3818 = 0;
                    class73.field1344 = null;
                    class89.field1635 = 0;
                    class205.field3981 = null;
                }
            }
        } catch (IOException var4) {
            this.method174(-3, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public static final void method167(boolean arg0) {
        for (int var1 = 0; var1 < class101.field1863; var1++) {
            int var10002 = class103.field1890[var1]--;
            if (class103.field1890[var1] >= -10) {
                class48 var3 = class166.field3318[var1];
                if (var3 == null) {
                    var3 = class48.method257(class76.field1375, class140.field2720[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class103.field1890[var1] += var3.method258();
                    class166.field3318[var1] = var3;
                }
                if (class103.field1890[var1] < 0) {
                    int var10;
                    if (class73.field1330[var1] == 0) {
                        var10 = class69.field1277;
                    } else {
                        int var4 = (class73.field1330[var1] & 0xFF) * 128;
                        int var5 = class73.field1330[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class106.field1940.field2032;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class73.field1330[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class106.field1940.field2045;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            class103.field1890[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class167.field3334 / var4;
                    }
                    if (var10 > 0) {
                        class202 var11 = var3.method260().method1317(class138.field2673);
                        class199 var12 = class199.method1272(var11, 100, var10);
                        var12.method1277(class59.field947[var1] - 1);
                        class184.field3634.method1137(var12);
                    }
                    class103.field1890[var1] = -100;
                }
            } else {
                class101.field1863--;
                for (int var2 = var1; var2 < class101.field1863; var2++) {
                    class140.field2720[var2] = class140.field2720[var2 + 1];
                    class166.field3318[var2] = class166.field3318[var2 + 1];
                    class59.field947[var2] = class59.field947[var2 + 1];
                    class103.field1890[var2] = class103.field1890[var2 + 1];
                    class73.field1330[var2] = class73.field1330[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0) {
            method167(false);
        }
        if (class171.field3393 && !class85.method431(0)) {
            if (class79.field1408 != 0 && class191.field3735 != -1) {
                class46.method246(class79.field1408, 0, class191.field3735, class63.field1000, (byte) 123, false);
            }
            class171.field3393 = false;
        }
        field497++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method168(boolean arg0) {
        field484++;
        if (class102.field1885 != null) {
            class102.field1885.field3747 = false;
        }
        class102.field1885 = null;
        if (class147.field2840 != null) {
            class147.field2840.method10(false);
            class147.field2840 = null;
        }
        class181.method1180(79);
        class179.method1176(arg0);
        class114.field2134 = null;
        if (class157.field3130 != null) {
            class157.field3130.method256(-6);
        }
        if (class144.field2815 != null) {
            class144.field2815.method256(120);
        }
        class115.method635(120);
        class172.method1148(0);
        try {
            if (class63.field996 != null) {
                class63.field996.method65(-1);
            }
            if (class126.field2377 != null) {
                for (int var2 = 0; var2 < class126.field2377.length; var2++) {
                    if (class126.field2377[var2] != null) {
                        class126.field2377[var2].method65(-1);
                    }
                }
            }
            if (class76.field1374 != null) {
                class76.field1374.method65(-1);
            }
            if (class153.field3012 != null) {
                class153.field3012.method65(-1);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method169(int arg0) {
        class21.field338++;
        field486++;
        if (arg0 != -382) {
            this.method173(42);
        }
        if (class21.field338 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class21.field335 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class124.field2311.setSeed((long) class21.field335);
        }
        this.method165(-1001);
        class73.method385((byte) -86);
        class75.method386(-23949);
        class201.method1316(0);
        class116.method644(-119);
        class204.method1330((byte) 0);
        if (class114.field2134 != null) {
            int var3 = class114.field2134.method555(true);
            class121.field2250 = var3;
        }
        if (class28.field455 == 0) {
            class122.method701(true);
            class153.method982(true);
        } else if (class28.field455 == 5) {
            class108.method592(10, this);
            class122.method701(true);
            class153.method982(true);
        } else if (class28.field455 == 10) {
            class108.method592(arg0 + 509, this);
        } else if (class28.field455 == 20) {
            class108.method592(arg0 ^ 0xFFFFFEF8, this);
            class1.method8((byte) -101);
        } else if (class28.field455 == 25) {
            class71.method376(false);
        }
        if (class28.field455 == 30) {
            class68.method363(-10022);
        } else if (class28.field455 == 40) {
            class1.method8((byte) 117);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        field489++;
        method164(true);
        class93.method484(64);
        class97.method548(true);
        class170.method1142(true);
        class188.method1221(-52);
        class193.method1243((byte) 35);
        class158.method1036((byte) -14);
        class1.method7(-111);
        class114.method625(128);
        class13.method75((byte) -25);
        class61.method321(true);
        class76.method389(4);
        class8.method44(-119);
        class134.method833();
        class151.method948(-1);
        class65.method334((byte) -38);
        class34.method192(256);
        class122.method700((byte) 116);
        class113.method620(1);
        class130.method760(32);
        class136.method859(-8001);
        class60.method314(68);
        class47.method249(53);
        class85.method428(false);
        class141.method888(-1918);
        class37.method205((byte) -46);
        class112.method611(24736);
        class179.method1177(200);
        class195.method1254(30);
        class78.method396(10);
        class44.method237(65);
        class53.method290(true);
        class176.method1165((byte) 125);
        class120.method679((byte) 29);
        class52.method280();
        class175.method1160(-114);
        class71.method374((byte) 125);
        class201.method1314((byte) -64);
        class123.method703((byte) 97);
        class25.method142(-87);
        class26.method143(-5344);
        class4.method20((byte) -45);
        class2.method12(true);
        class77.method394(true);
        class126.method719((byte) -93);
        class132.method781();
        class18.method107(18892);
        class86.method437();
        class16.method92(126);
        class143.method897(0);
        class194.method1246(-1);
        class154.method989((byte) -107);
        class171.method1145((byte) 105);
        class192.method1239((byte) -60);
        class21.method127(20878);
        class89.method464(66);
        class153.method988((byte) -2);
        class133.method795((byte) 95);
        class137.method862(-25894);
        class167.method1128(113);
        class80.method401(16260);
        class73.method383(-69);
        class100.method559(false);
        class30.method175((byte) -81);
        class14.method83(-117);
        class161.method1098(-25);
        class206.method1341(1);
        class121.method686((byte) 124);
        class24.method138(95);
        class118.method666();
        class12.method61((byte) -38);
        class150.method926();
        class172.method1150(0);
        class185.method1204();
        class19.method114(-101);
        class165.method1114(72);
        class160.method1094(false);
        class177.method1166(1);
        class66.method349(-18675);
        class157.method1031(true);
        class81.method415(-6);
        class166.method1125(75);
        class125.method713();
        class46.method244((byte) 123);
        class55.method303(true);
        class135.method855(-1);
        class204.method1322(-126);
        class205.method1337((byte) -103);
        class127.method722(-105);
        class156.method1006();
        class200.method1312(false);
        class67.method358(104);
        class174.method1155(-1);
        class63.method323(6);
        class49.method261((byte) 59);
        class62.method322(-596);
        class36.method196((byte) -108);
        class110.method595(-12818);
        class64.method330(false);
        class147.method902(true);
        class82.method417(1585128487);
        class104.method577(99);
        class116.method643(false);
        class108.method590(-111);
        class11.method58();
        class128.method728(8);
        class91.method476(false);
        class197.method1263((byte) -111);
        class131.method768((byte) 17);
        class189.method1224(-1);
        class182.method1187(-7093);
        class69.method367((byte) -56);
        class41.method223((byte) -28);
        class7.method38(17506);
        class83.method424(true);
        class183.method1192(true);
        class15.method87(true);
        class23.method133(79);
        class115.method636(false);
        class79.method399((byte) 55);
        class180.method1179(5);
        class187.method1219();
        class87.method439();
        class178.method1174(-5827);
        class163.method1107();
        class96.method539((byte) 126);
        class155.method993(0);
        class17.method97();
        class51.method267(4096);
        class152.method952(32);
        if (arg0 >= -110) {
            method167(false);
        }
        class144.method898(2048);
        class5.method27();
        class94.method533();
        class75.method388((byte) -58);
        class102.method565(true);
        class27.method147(-11941);
        class29.method158(true);
        class35.method194(1);
        class28.method157((byte) -49);
        class95.method536(-1);
        class191.method1233(-1);
        class169.method1140(-24718);
        class148.method906((byte) 79);
        class9.method50(-1152534036);
        class98.method552(2047);
        class106.method583((byte) -108);
        class139.method870(0);
        class32.method185(-72);
        class140.method874((byte) 104);
        class57.method306(118054252);
        class40.method219((byte) -55);
        class184.method1194(10734);
        class190.method1228((byte) 75);
        class39.method214(false);
        class68.method361((byte) 118);
        class159.method1090(true);
        class88.method444((byte) 127);
        class43.method230(2);
        class101.method563((byte) -125);
        class207.method1344(14035);
        class181.method1183(123);
        class50.method265(-58);
        class173.method1154((byte) -13);
        class59.method310(false);
        class203.method1318((byte) 30);
        class111.method600(10);
        class92.method481(false);
        class3.method16(32767);
        class10.method54(117);
        class107.method588(false);
        class103.method574(26567);
        class117.method646(8);
        class70.method370(1);
        class84.method426(-10470);
        class186.method1217(-4096);
        class124.method707(78);
        class138.method866(111);
        class142.method894((byte) -101);
        class145.method901(-31658);
        class72.method380(0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljg;ZI)Lsb;")
    public static final class165 method171(class89 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method171(null, false, -82);
        }
        byte[] var3 = arg0.method470(102, arg2);
        field488++;
        return var3 == null ? null : new class165(var3);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field493++;
        try {
            if (arg0.length != 7) {
                class130.method759(32);
            }
            class204.field3947 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class131.field2466 = 0;
            } else if (arg0[1].equals("office")) {
                class131.field2466 = 1;
            } else if (arg0[1].equals("local")) {
                class131.field2466 = 2;
            } else {
                class130.method759(32);
            }
            if (arg0[2].equals("live")) {
                class178.field3545 = 0;
            } else if (arg0[2].equals("rc")) {
                class178.field3545 = 1;
            } else if (arg0[2].equals("wip")) {
                class178.field3545 = 2;
            } else {
                class130.method759(32);
            }
            if (arg0[3].equals("lowmem")) {
                class182.method1186((byte) -127);
            } else if (arg0[3].equals("highmem")) {
                class91.method477(0);
            } else {
                class130.method759(32);
            }
            if (arg0[4].equals("free")) {
                class62.field988 = false;
            } else if (arg0[4].equals("members")) {
                class62.field988 = true;
            } else {
                class130.method759(32);
            }
            if (arg0[5].equals("english")) {
                class139.field2693 = 0;
            } else if (arg0[5].equals("german")) {
                class8.method43((byte) 9);
                class43.field715 = class122.field2273;
                class139.field2693 = 1;
            } else {
                class130.method759(32);
            }
            if (arg0[6].equals("game0")) {
                class141.field2749 = 0;
            } else if (arg0[6].equals("game1")) {
                class141.field2749 = 1;
            } else {
                class130.method759(32);
            }
            class41.field685 = "127.0.0.1";
            client var1 = new client();
            var1.method549(503, 16, 479, "runescape", 1, 765, class178.field3545 + 32);
            class68.field1262.setLocation(40, 40);
        } catch (Exception var3) {
            class141.method882(true, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method172(boolean arg0) {
        field487++;
        boolean var2 = class145.method900(2569);
        if (var2 && class171.field3393 && class157.field3130 != null) {
            class157.field3130.method255(true);
        }
        if (class28.field462) {
            class9.method49(class115.field2147, (byte) -127);
            class157.method1030(class115.field2147, (byte) -79);
            if (class114.field2134 != null) {
                class114.field2134.method554(class115.field2147, (byte) -85);
            }
            this.method541(25430);
            class135.method854(class115.field2147, -112);
            class195.method1247(-82, class115.field2147);
            if (class114.field2134 != null) {
                class114.field2134.method556(class115.field2147, -24021);
            }
        }
        if (class28.field455 == 0) {
            class100.method561(0, class148.field2843, class62.field985, null);
        } else if (class28.field455 == 5) {
            class77.method393(class68.field1250, 16777215, class203.field3923);
        } else if (class28.field455 == 10) {
            class77.method393(class68.field1250, 16777215, class203.field3923);
        } else if (class28.field455 == 20) {
            class77.method393(class68.field1250, 16777215, class203.field3923);
        } else if (class28.field455 == 25) {
            if (class142.field2783 == 1) {
                if (class10.field167 < class106.field1933) {
                    class10.field167 = class106.field1933;
                }
                int var3 = (class10.field167 - class106.field1933) * 50 / class10.field167;
                class157.method1024(class203.method1321(new class93[] { class34.field542, class195.field3821, class67.method357((byte) -93, var3), class62.field989 }, 119), false, 250);
            } else if (class142.field2783 == 2) {
                if (class67.field1224 < class85.field1552) {
                    class67.field1224 = class85.field1552;
                }
                int var4 = (class67.field1224 - class85.field1552) * 50 / class67.field1224 + 50;
                class157.method1024(class203.method1321(new class93[] { class34.field542, class195.field3821, class67.method357((byte) -101, var4), class62.field989 }, 105), false, 250);
            } else {
                class157.method1024(class34.field542, false, 250);
            }
        } else if (class28.field455 == 30) {
            class182.method1189((byte) -112);
        } else if (class28.field455 == 40) {
            class157.method1024(class203.method1321(new class93[] { class147.field2835, class128.field2430, class91.field1673 }, 108), false, 250);
        }
        if (arg0) {
            field496 = null;
        }
        if (class28.field455 == 30 && class144.field2797 == 0 && !class180.field3572) {
            try {
                Graphics var7 = class115.field2147.getGraphics();
                for (int var8 = 0; var8 < class23.field357; var8++) {
                    if (class88.field1600[var8]) {
                        class157.field3113.method86(class49.field783[var8], var7, class136.field2645[var8], arg0, class64.field1024[var8], class36.field592[var8]);
                        class88.field1600[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class115.field2147.repaint();
            }
        } else if (class28.field455 > 0) {
            try {
                Graphics var5 = class115.field2147.getGraphics();
                class157.field3113.method89(0, (byte) -16, var5, 0);
                class180.field3572 = false;
                for (int var6 = 0; var6 < class23.field357; var6++) {
                    class88.field1600[var6] = false;
                }
            } catch (Exception var10) {
                class115.field2147.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method173(int arg0) {
        if (class141.field2749 == 1) {
            class130.field2463 = class62.field984;
            class122.field2269 = class60.field962;
            class24.field367 = class83.field1526;
            class188.field3682 = class73.field1335;
        } else {
            class24.field367 = class88.field1601;
            class122.field2269 = class113.field2092;
            class130.field2463 = class61.field968;
            class188.field3682 = class207.field4062;
        }
        class39.field645 = class131.field2466 == 0 ? 43594 : class204.field3947 + 40000;
        field490++;
        class121.field2242 = class39.field645;
        class103.field1899 = class131.field2466 == 0 ? 443 : class204.field3947 + 50000;
        class123.method704((byte) 79);
        class135.method854(class115.field2147, -72);
        class195.method1247(-95, class115.field2147);
        class114.field2134 = class175.method1159(-127);
        int var2 = 32 % ((-arg0 - 23) / 56);
        if (class114.field2134 != null) {
            class114.field2134.method556(class115.field2147, -24021);
        }
        class120.field2236 = class149.field2882;
        try {
            if (class77.field1393.field2877 != null) {
                class63.field996 = new class13(class77.field1393.field2877, 5200, 0);
                for (int var3 = 0; var3 < 16; var3++) {
                    class126.field2377[var3] = new class13(class77.field1393.field2870[var3], 6000, 0);
                }
                class76.field1374 = new class13(class77.field1393.field2866, 6000, 0);
                class173.field3431 = new class61(255, class63.field996, class76.field1374, 500000);
                class153.field3012 = new class13(class77.field1393.field2871, 24, 0);
                class77.field1393.field2871 = null;
                class77.field1393.field2877 = null;
                class77.field1393.field2866 = null;
                class77.field1393.field2870 = null;
            }
        } catch (IOException var4) {
            class76.field1374 = null;
            class153.field3012 = null;
            class173.field3431 = null;
            class63.field996 = null;
        }
        if (class131.field2466 != 0) {
            class186.field3663 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method174(int arg0, byte arg1) {
        class205.field3981 = null;
        if (arg1 != -56) {
            this.method169(-37);
        }
        class73.field1344 = null;
        class195.field3818++;
        field492++;
        if (class39.field645 == class121.field2242) {
            class121.field2242 = class103.field1899;
        } else {
            class121.field2242 = class39.field645;
        }
        class89.field1635 = 0;
        if (class195.field3818 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class28.field455 <= 5) {
                this.method545("js5connect_full", 45);
                class28.field455 = 1000;
            } else {
                class96.field1774 = 3000;
            }
        } else if (class195.field3818 >= 2 && arg0 == 6) {
            this.method545("js5connect_outofdate", -120);
            class28.field455 = 1000;
        } else if (class195.field3818 >= 4) {
            if (class28.field455 <= 5) {
                this.method545("js5connect", -126);
                class28.field455 = 1000;
            } else {
                class96.field1774 = 3000;
            }
        }
    }
}
