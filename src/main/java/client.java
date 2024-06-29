import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class100 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lv;")
    public static class122 field443 = class55.method425(-78, ": ");

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field445 = 0;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lv;")
    public static class122 field442 = class55.method425(-53, "Ung\u001c1ltiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lv;")
    public static class122 field446 = class55.method425(-72, "m");

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lv;")
    public static class122 field448 = class55.method425(-99, "titlebutton");

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lv;")
    public static class122 field457 = class55.method425(-122, "Chat panel redrawn");

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lv;")
    public static class122 field466 = class55.method425(-72, "backhmid1");

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field465 = 0;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lv;")
    public static class122 field468 = class55.method425(-77, "scape main");

    @OriginalMember(owner = "client!client", name = "E", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lrd;")
    public static class106 field453;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
    public static boolean field469;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 49)
    public final void method175(int arg0) {
        class16.field396++;
        field452++;
        if (arg0 != 25) {
            field453 = null;
        }
        this.method179((byte) -105);
        class49.method396(true);
        class109.method842((byte) 62);
        class51.method403(false);
        class11.method114(1901);
        class26.method265(false);
        if (class44.field1156 == 0) {
            class90.method721(3);
            class114.method874((byte) -11);
        } else if (class44.field1156 == 5) {
            class90.method721(3);
            class114.method874((byte) -11);
        } else if (class44.field1156 == 10) {
            class112.method860(7218);
        } else if (class44.field1156 == 20) {
            class112.method860(7218);
            class47.method390((byte) 45);
        } else if (class44.field1156 == 25) {
            class93.method743((byte) 16);
        }
        if (class44.field1156 == 30) {
            class28.method273(arg0 + 5551);
        } else if (class44.field1156 == 35) {
            class28.method273(5576);
        } else if (class44.field1156 == 40) {
            class47.method390((byte) 45);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 111)
    public final void method176(byte arg0) {
        class72.field1853 = class24.field668 == 0 ? 43594 : class106.field2637 + 40000;
        class102.field2531 = class72.field1853;
        field444++;
        class25.field680 = class24.field668 == 0 ? 443 : class106.field2637 + 50000;
        class114.method875((byte) 97);
        if (arg0 >= -102) {
            field445 = 22;
        }
        class115.method886(-24789, class54.field1411);
        class19.method193(class54.field1411, (byte) 100);
        class61.field1556 = class57.field1502;
        try {
            if (class2.field70.field1489 != null) {
                class82.field2128 = new class19(class2.field70.field1489, 5200, 0);
                for (int var2 = 0; var2 < 12; var2++) {
                    class115.field2820[var2] = new class19(class2.field70.field1501[var2], 6000, 0);
                }
                class47.field1222 = new class19(class2.field70.field1487, 6000, 0);
                class62.field1594 = new class83(255, class82.field2128, class47.field1222, 500000);
                class2.field70.field1489 = null;
                class2.field70.field1501 = null;
                class2.field70.field1487 = null;
            }
        } catch (IOException var3) {
            class62.field1594 = null;
            class47.field1222 = null;
            class82.field2128 = null;
        }
        if (class24.field668 != 0) {
            class108.field2672 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 160)
    public final void init() {
        field463++;
        if (!this.method768(48)) {
            return;
        }
        class106.field2637 = Integer.parseInt(this.getParameter("worldid"));
        class67.field1737 = Integer.parseInt(this.getParameter("modewhat"));
        class24.field668 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class89.method702((byte) -89);
        } else {
            class30.method278(-1);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class70.field1838 = true;
        } else {
            class70.field1838 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("de")) {
            class88.method695(60);
            class120.field2917 = 1;
        }
        this.method765(-116, 417, 503, class67.field1737 + 32, 765);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 201)
    public final void method177(int arg0) {
        field467++;
        method180(false);
        class122.method934((byte) 107);
        class100.method769(arg0 ^ 0xFFFFFF80);
        class58.method453(0);
        class14.method126((byte) 97);
        class62.method476(0);
        class59.method455((byte) 112);
        class64.method526((byte) 123);
        class72.method588((byte) 77);
        class106.method821((byte) 122);
        class19.method197(-20941);
        class83.method675(false);
        class80.method664((byte) 124);
        class125.method989(7);
        class105.method817();
        class1.method36();
        class16.method146(-124);
        class55.method430((byte) 102);
        class34.method309(32);
        class36.method316(-94);
        class18.method174(false);
        class92.method736(false);
        class11.method111(arg0 - 31273);
        class5.method68(arg0 + 3);
        class21.method218((byte) 2);
        class75.method629(16711680);
        class24.method257(-1);
        class107.method831(-1591506782);
        class6.method73(false);
        class129.method1011((byte) -46);
        class74.method626((byte) 75);
        class56.method435((byte) -111);
        class89.method711(12);
        class68.method543();
        class4.method67((byte) 75);
        class52.method409(-112);
        class73.method599(false);
        class37.method330(-7980);
        class33.method295(-18596);
        class60.method460((byte) 112);
        class8.method89(111);
        class81.method666((byte) -120);
        class32.method288(0);
        class43.method369(1625013320);
        class87.method687();
        class46.method380(arg0 + 130);
        class28.method272(-25305);
        class113.method865(arg0 - 105);
        class109.method845(true);
        class22.method231(-10882);
        class69.method570((byte) -87);
        class119.method911((byte) 3);
        class91.method723(false);
        class70.method575((byte) -67);
        class82.method670(111);
        class45.method379(arg0 ^ 0x57);
        class77.method648();
        class117.method899();
        class126.method998(27672);
        class30.method280(0);
        class76.method640(arg0 ^ 0x474C);
        class93.method745(8);
        class41.method350(383);
        class103.method787((byte) -84);
        class42.method360(0);
        class10.method96((byte) 65);
        class118.method903((byte) -113);
        class114.method876((byte) 99);
        class90.method719((byte) 27);
        class26.method262(4302);
        class23.method243(-1);
        class128.method1010();
        class47.method391(180);
        class7.method81((byte) 104);
        class29.method276((byte) -38);
        class51.method405(16028);
        class44.method371(true);
        class123.method972();
        class88.method696(0);
        class127.method1002(1);
        class94.method749((byte) 84);
        class131.method1016(17456);
        class102.method780(2);
        class66.method532(75);
        class67.method537(false);
        class108.method838((byte) -7);
        class40.method344((byte) 64);
        class2.method55(-104);
        class49.method395(arg0 ^ arg0);
        class50.method398(104);
        class101.method775();
        class84.method677((byte) 39);
        class121.method929();
        class54.method414(-114);
        class53.method413();
        class115.method883((byte) 86);
        class95.method753((byte) -127);
        class120.method918((byte) 126);
        class38.method334(false);
        class79.method659();
        class71.method581();
        class25.method261(arg0 + 129);
        class63.method478(-50);
        class61.method470((byte) 127);
        class15.method140();
        class112.method862(1684);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrd;II)V", line = 340)
    public static final void method178(class106 arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method178(null, 62, -15);
        }
        field441++;
        if (class91.field2335 == null) {
            class34.method303(true, 255, arg2 ^ 0x1, 0, (byte) 0, 255, null);
            class126.field3061[arg1] = arg0;
        } else {
            class91.field2335.field1617 = arg1 * 4 + 5;
            int var3 = class91.field2335.method487(arg2 ^ 0x81);
            arg0.method828((byte) 0, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 368)
    private final void method179(byte arg0) {
        field451++;
        if (class44.field1156 == 1000) {
            return;
        }
        int var2 = 71 / ((arg0 + 34) / 52);
        boolean var3 = class75.method636((byte) 126);
        if (!var3) {
            this.method186(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 401)
    public static void method180(boolean arg0) {
        field442 = null;
        field453 = null;
        field448 = null;
        field457 = null;
        if (arg0) {
            field455 = -79;
        }
        field446 = null;
        field468 = null;
        field443 = null;
        field466 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILbd;)V", line = 420)
    public static final void method181(int arg0, class11 arg1) {
        if (arg0 != 22174) {
            field453 = null;
        }
        arg1.field291 = false;
        if (arg1.field305 != -1) {
            class89 var2 = class51.method401(arg0 - 52499, arg1.field305);
            arg1.field298++;
            if (var2.field2299.length > arg1.field278 && var2.field2287[arg1.field278] < arg1.field298) {
                arg1.field298 = 1;
                arg1.field278++;
            }
            if (var2.field2299.length <= arg1.field278) {
                arg1.field298 = 0;
                arg1.field278 = 0;
            }
        }
        if (arg1.field315 != -1 && class16.field396 >= arg1.field276) {
            if (arg1.field326 < 0) {
                arg1.field326 = 0;
            }
            int var3 = class126.method999((byte) 88, arg1.field315).field2784;
            if (var3 == -1) {
                arg1.field315 = -1;
            } else {
                class89 var4 = class51.method401(arg0 - 52499, var3);
                arg1.field329++;
                if (var4.field2299.length > arg1.field326 && var4.field2287[arg1.field326] < arg1.field329) {
                    arg1.field329 = 1;
                    arg1.field326++;
                }
                if (arg1.field326 >= var4.field2299.length && (arg1.field326 < 0 || arg1.field326 >= var4.field2299.length)) {
                    arg1.field315 = -1;
                }
            }
        }
        field461++;
        if (arg1.field324 != -1 && arg1.field292 <= 1) {
            class89 var5 = class51.method401(-30325, arg1.field324);
            if (var5.field2286 == 1 && arg1.field306 > 0 && arg1.field312 <= class16.field396 && arg1.field288 < class16.field396) {
                arg1.field292 = 1;
                return;
            }
        }
        if (arg1.field324 != -1 && arg1.field292 == 0) {
            class89 var6 = class51.method401(-30325, arg1.field324);
            arg1.field302++;
            if (arg1.field301 < var6.field2299.length && arg1.field302 > var6.field2287[arg1.field301]) {
                arg1.field301++;
                arg1.field302 = 1;
            }
            if (var6.field2299.length <= arg1.field301) {
                arg1.field301 -= var6.field2283;
                arg1.field304++;
                if (var6.field2282 <= arg1.field304) {
                    arg1.field324 = -1;
                }
                if (arg1.field301 < 0 || arg1.field301 >= var6.field2299.length) {
                    arg1.field324 = -1;
                }
            }
            arg1.field291 = var6.field2292;
        }
        if (arg1.field292 > 0) {
            arg1.field292--;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmb;Lmb;I)I", line = 537)
    public static final int method182(class74 arg0, class74 arg1, int arg2) {
        field456++;
        int var3 = arg2;
        if (arg1.method624(class88.field2260, -1, class50.field1281)) {
            var3 = arg2 + 1;
        }
        if (arg0.method624(class88.field2260, -1, class62.field1586)) {
            var3++;
        }
        if (arg0.method624(class88.field2260, -1, class115.field2812)) {
            var3++;
        }
        if (arg0.method624(class88.field2260, -1, field448)) {
            var3++;
        }
        if (arg0.method624(class88.field2260, -1, class114.field2780)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 567)
    public final void method183(boolean arg0) {
        field450++;
        if (class106.field2636 != null) {
            class106.field2636.field1526 = false;
        }
        class106.field2636 = null;
        if (class66.field1686 != null) {
            class66.field1686.method586(82);
        }
        class64.method516(true);
        class4.method66(38);
        class109.method850(arg0);
        class89.method708(true);
        class114.method870(95);
        class38.method332(1);
        try {
            if (class82.field2128 != null) {
                class82.field2128.method190(-111);
            }
            if (class115.field2820 != null) {
                for (int var2 = 0; var2 < class115.field2820.length; var2++) {
                    if (class115.field2820[var2] != null) {
                        class115.field2820[var2].method190(-110);
                    }
                }
            }
            if (class47.field1222 != null) {
                class47.field1222.method190(-88);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 636)
    public static final void main(String[] arg0) {
        field464++;
        try {
            if (arg0.length != 6) {
                class28.method274((byte) 5);
            }
            class106.field2637 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class24.field668 = 0;
            } else if (arg0[1].equals("office")) {
                class24.field668 = 1;
            } else if (arg0[1].equals("local")) {
                class24.field668 = 2;
            } else {
                class28.method274((byte) 5);
            }
            if (arg0[2].equals("live")) {
                class67.field1737 = 0;
            } else if (arg0[2].equals("rc")) {
                class67.field1737 = 1;
            } else if (arg0[2].equals("wip")) {
                class67.field1737 = 2;
            } else {
                class28.method274((byte) 5);
            }
            if (arg0[3].equals("lowmem")) {
                class89.method702((byte) -103);
            } else if (arg0[3].equals("highmem")) {
                class30.method278(-1);
            } else {
                class28.method274((byte) 5);
            }
            if (arg0[4].equals("free")) {
                class70.field1838 = false;
            } else if (arg0[4].equals("members")) {
                class70.field1838 = true;
            } else {
                class28.method274((byte) 5);
            }
            if (arg0[5].equals("english")) {
                class120.field2917 = 0;
            } else if (arg0[5].equals("german")) {
                class88.method695(101);
                class120.field2917 = 1;
            } else {
                class28.method274((byte) 5);
            }
            client var1 = new client();
            var1.method766("runescape", class67.field1737 + 32, (byte) 15, InetAddress.getLocalHost(), 12, 765, 417, 503);
        } catch (Exception var3) {
            class84.method678(null, var3, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 714)
    private final void method184(int arg0, int arg1) {
        class63.field1606++;
        class2.field68 = 0;
        if (class72.field1853 == class102.field2531) {
            class102.field2531 = class25.field680;
        } else {
            class102.field2531 = class72.field1853;
        }
        field462++;
        class112.field2735 = null;
        if (arg0 != -3) {
            this.method176((byte) -104);
        }
        class44.field1155 = null;
        if (class63.field1606 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class44.field1156 > 5) {
                class131.field3183 = 3000;
            } else {
                this.method763(-8240, "js5connect_full");
                class44.field1156 = 1000;
            }
        } else if (class63.field1606 >= 2 && arg1 == 6) {
            this.method763(-8240, "js5connect_outofdate");
            class44.field1156 = 1000;
        } else if (class63.field1606 >= 4) {
            if (class44.field1156 <= 5) {
                this.method763(arg0 - 8237, "js5connect");
                class44.field1156 = 1000;
            } else {
                class131.field3183 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z", line = 768)
    public static final boolean method185(int arg0, int arg1, int arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        field460++;
        class42 var3 = class14.method124((byte) 52, arg0);
        if (arg2 != 4) {
            method181(-112, null);
        }
        return var3.method359(65535, arg1);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 790)
    private final void method186(boolean arg0) {
        field454++;
        if (class103.field2540 >= 4) {
            this.method763(-8240, "js5crc");
            class44.field1156 = 1000;
            return;
        }
        if (class22.field588 >= 4) {
            if (class44.field1156 <= 5) {
                this.method763(-8240, "js5io");
                class44.field1156 = 1000;
                return;
            }
            class131.field3183 = 3000;
            class22.field588 = 3;
        }
        if (class131.field3183-- > 0) {
            return;
        }
        try {
            if (class2.field68 == 0) {
                class112.field2735 = class2.field70.method441((byte) -120, class102.field2531);
                class2.field68++;
            }
            if (arg0) {
                if (class2.field68 == 1) {
                    if (class112.field2735.field2454 == 2) {
                        this.method184(-3, -1);
                        return;
                    }
                    if (class112.field2735.field2454 == 1) {
                        class2.field68++;
                    }
                }
                if (class2.field68 == 2) {
                    class44.field1155 = new class72((Socket) class112.field2735.field2456, class2.field70);
                    class64 var2 = new class64(5);
                    var2.method523(255, 15);
                    var2.method509((byte) -73, 417);
                    class44.field1155.method594((byte) 121, 0, var2.field1679, 5);
                    class2.field68++;
                    class25.field673 = System.currentTimeMillis();
                }
                if (class2.field68 == 3) {
                    if (class44.field1156 <= 5 || class44.field1155.method590((byte) -96) > 0) {
                        int var3 = class44.field1155.method585((byte) -92);
                        if (var3 != 0) {
                            this.method184(-3, var3);
                            return;
                        }
                        class2.field68++;
                    } else if (System.currentTimeMillis() - class25.field673 > 30000L) {
                        this.method184(-3, -2);
                        return;
                    }
                }
                if (class2.field68 == 4) {
                    class66.method533(class44.field1156 > 20, class44.field1155, -27147);
                    class112.field2735 = null;
                    class44.field1155 = null;
                    class2.field68 = 0;
                    class63.field1606 = 0;
                }
            }
        } catch (IOException var4) {
            this.method184(-3, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 951)
    public final void method187(int arg0) {
        if (arg0 > -70) {
            method182(null, null, -49);
        }
        if (class5.field133) {
            class113.method866(class54.field1411, 7840);
            class90.method713(117, class54.field1411);
            this.method767((byte) -108);
            class115.method886(-24789, class54.field1411);
            class19.method193(class54.field1411, (byte) 126);
        }
        field449++;
        if (class44.field1156 == 0) {
            class54.method418(class113.field2755, class88.field2262, null, true);
        } else if (class44.field1156 == 5) {
            class60.method461(23688, class103.field2545, class83.field2169);
        } else if (class44.field1156 == 10) {
            class60.method461(23688, class103.field2545, class83.field2169);
        } else if (class44.field1156 == 20) {
            class60.method461(23688, class103.field2545, class83.field2169);
        } else if (class44.field1156 == 25) {
            if (field458 == 1) {
                if (class50.field1279 < class19.field476) {
                    class50.field1279 = class19.field476;
                }
                int var3 = (class50.field1279 - class19.field476) * 50 / class50.field1279;
                class88.method697(class59.method454(new class122[] { class108.field2666, class119.method914(var3, 10), class100.field2479 }, 5176), 882, class112.field2741, true);
            } else if (field458 == 2) {
                if (class7.field174 > class26.field701) {
                    class26.field701 = class7.field174;
                }
                int var2 = (class26.field701 - class7.field174) * 50 / class26.field701 + 50;
                class88.method697(class59.method454(new class122[] { class108.field2666, class119.method914(var2, 10), class100.field2479 }, 5176), 882, class112.field2741, true);
            } else {
                class88.method697(null, 882, class112.field2741, false);
            }
        } else if (class44.field1156 == 30) {
            class36.method319(0);
        } else if (class44.field1156 == 35) {
            class36.method323((byte) -120);
        } else if (class44.field1156 == 40) {
            class88.method697(class126.field3054, 882, class43.field1142, false);
        }
        class94.field2429 = 0;
    }
}
