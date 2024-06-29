import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class93 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field523 = -1;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lwb;")
    private static class130 field532 = class26.method212("Choose Option", -32376);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lwb;")
    public static class130 field536 = class26.method212(" )2> @cya@", -32376);

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lwb;")
    public static class130 field527 = field532;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lwb;")
    public static class130 field537 = class26.method212("Verbinde mit Server)3)3)3", -32376);

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lge;")
    public static class41 field522 = new class41(100);

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lwb;")
    public static class130 field540 = class26.method212("Bitte versuchen Sie)1", -32376);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    public static boolean field542 = false;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
    public static boolean field539 = false;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lwb;")
    private static class130 field544 = class26.method212("Cancel", -32376);

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lwb;")
    public static class130 field543 = class26.method212(": ", -32376);

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lwb;")
    public static class130 field541 = field544;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Lwb;")
    public static class130 field545 = class26.method212(" Sekunde(Xn(Y -Ubertragen)3", -32376);

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lk;")
    public static class60 field521;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
    public static int[] field548;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 19)
    public static final void method156(byte arg0) {
        field533++;
        class130 var1 = null;
        for (int var2 = 0; var2 < class26.field757; var2++) {
            if (class105.field2546[var2].method973(class48.field1290, -31451) != -1) {
                var1 = class105.field2546[var2].method977(class105.field2546[var2].method973(class48.field1290, -31451), true);
                break;
            }
        }
        if (var1 == null) {
            class8.method66(true);
            return;
        }
        int var3 = class18.field496;
        int var4 = class69.field1767;
        if (var3 < 0) {
            var3 = 0;
        }
        int var5 = class119.field2908;
        int var6 = class35.field1007;
        if (var5 > 190) {
            var5 = 190;
        }
        int var7 = 6116423;
        class49.method440(var3, var4, var5, var6, var7);
        class49.method440(var3 + 1, var4 - -1, var5 - 2, 16, 0);
        class49.method431(var3 + 1, var4 + 18, var5 - 2, var6 + -19, 0);
        if (arg0 > -88) {
            field521 = null;
        }
        class43.field1187.method1000(var1, var3 + 3, var4 + 14, var7, false);
        int var8 = class101.field2429;
        int var9 = class18.field483;
        if (class116.field2863 == 0) {
            var9 -= 4;
            var8 -= 4;
        }
        if (class116.field2863 == 1) {
            var8 -= 205;
            var9 -= 553;
        }
        if (class116.field2863 == 2) {
            var9 -= 17;
            var8 -= 357;
        }
        for (int var10 = 0; var10 < class26.field757; var10++) {
            int var11 = 16777215;
            int var12 = (class26.field757 - var10 - 1) * 15 + var4 + 31;
            if (var9 > var3 && var9 < var3 + var5 && var8 > var12 - 13 && var8 < var12 + 3) {
                var11 = 16776960;
            }
            class130 var13 = class105.field2546[var10];
            if (var13.method982(-107, var1)) {
                var13 = var13.method970(true, var13.method958((byte) -38) - var1.method958((byte) -38), 0);
                if (var13.method982(-115, class41.field1167)) {
                    var13 = var13.method970(true, var13.method958((byte) -38) - class41.field1167.method958((byte) -38), 0);
                }
            }
            class43.field1187.method1000(var13, var3 + 3, var12, var11, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 126)
    public static void method157(boolean arg0) {
        field521 = null;
        field548 = null;
        field522 = null;
        field536 = null;
        field541 = null;
        field544 = null;
        field543 = null;
        if (arg0) {
            method161(true);
        }
        field545 = null;
        field537 = null;
        field532 = null;
        field540 = null;
        field527 = null;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 157)
    public static final void main(String[] arg0) {
        field524++;
        try {
            if (arg0.length != 6) {
                class32.method255(1);
            }
            class47.field1258 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class64.field1635 = 0;
            } else if (arg0[1].equals("office")) {
                class64.field1635 = 1;
            } else if (arg0[1].equals("local")) {
                class64.field1635 = 2;
            } else {
                class32.method255(1);
            }
            if (arg0[2].equals("live")) {
                class60.field1541 = 0;
            } else if (arg0[2].equals("rc")) {
                class60.field1541 = 1;
            } else if (arg0[2].equals("wip")) {
                class60.field1541 = 2;
            } else {
                class32.method255(1);
            }
            if (arg0[3].equals("lowmem")) {
                class37.method379((byte) -53);
            } else if (arg0[3].equals("highmem")) {
                class6.method49(54);
            } else {
                class32.method255(1);
            }
            if (arg0[4].equals("free")) {
                class124.field2999 = false;
            } else if (arg0[4].equals("members")) {
                class124.field2999 = true;
            } else {
                class32.method255(1);
            }
            if (arg0[5].equals("english")) {
                class67.field1708 = 0;
            } else if (arg0[5].equals("german")) {
                class45.method411((byte) -112);
                class67.field1708 = 1;
            } else {
                class32.method255(1);
            }
            client var1 = new client();
            var1.method696("runescape", 503, InetAddress.getLocalHost(), 12, 765, 427, class60.field1541 + 32, 73);
        } catch (Exception var3) {
            class33.method264(null, var3, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 232)
    public final void method158(int arg0) {
        field538++;
        if (class117.field2892 != null) {
            class117.field2892.field309 = false;
        }
        class117.field2892 = null;
        if (class47.field1255 != null) {
            class47.field1255.method148(93);
            class47.field1255 = null;
        }
        class36.method369((byte) -111);
        class103.method795(-17);
        class65.method541(27762);
        class106.method801(false);
        class65.method540(false);
        class128.method945(0);
        try {
            if (class47.field1272 != null) {
                class47.field1272.method28((byte) -120);
            }
            if (class116.field2869 != null) {
                for (int var2 = 0; var2 < class116.field2869.length; var2++) {
                    if (class116.field2869[var2] != null) {
                        class116.field2869[var2].method28((byte) -105);
                    }
                }
            }
            if (class56.field1436 != null) {
                class56.field1436.method28((byte) -124);
            }
            if (arg0 >= -108) {
                method169((byte) 86);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 301)
    public final void method159(int arg0) {
        if (class88.field2105) {
            class67.method551(class84.field2003, 10);
            class95.method708(class84.field2003, (byte) 119);
            this.method689(false);
            class61.method514((byte) 55, class84.field2003);
            class17.method136(class84.field2003, true);
        }
        if (~class40.field1109 == arg0) {
            class95.method707((byte) -116, class124.field2998, class41.field1164, null);
        } else if (class40.field1109 == 5) {
            class119.method913((byte) -99, class43.field1187, class68.field1766);
        } else if (class40.field1109 == 10) {
            class119.method913((byte) -99, class43.field1187, class68.field1766);
        } else if (class40.field1109 == 20) {
            class119.method913((byte) -99, class43.field1187, class68.field1766);
        } else if (class40.field1109 == 25) {
            if (class54.field1403 == 1) {
                if (class119.field2906 < class42.field1176) {
                    class119.field2906 = class42.field1176;
                }
                int var3 = (class119.field2906 - class42.field1176) * 50 / class119.field2906;
                class4.method30(class15.method114(new class130[] { class3.field87, class109.method831(var3, arg0 + 11), class23.field675 }, -20349), true, (byte) 95, class45.field1228);
            } else if (class54.field1403 == 2) {
                if (class115.field2829 > class96.field2317) {
                    class96.field2317 = class115.field2829;
                }
                int var2 = (class96.field2317 - class115.field2829) * 50 / class96.field2317 + 50;
                class4.method30(class15.method114(new class130[] { class3.field87, class109.method831(var2, 10), class23.field675 }, -20349), true, (byte) 43, class45.field1228);
            } else {
                class4.method30(null, false, (byte) 105, class45.field1228);
            }
        } else if (class40.field1109 == 30) {
            class2.method13(-15701);
        } else if (class40.field1109 == 35) {
            class58.method479(false);
        } else if (class40.field1109 == 40) {
            class4.method30(class88.field2097, false, (byte) 97, class42.field1174);
        }
        field520++;
        class108.field2611 = 0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 391)
    public final void method160(int arg0) {
        method157(false);
        field518++;
        class130.method987(-75);
        class93.method698((byte) 76);
        class106.method804(true);
        class20.method186(false);
        class9.method72((byte) -112);
        class36.method338(arg0 ^ 0x72);
        class18.method150(false);
        class75.method592(68);
        class4.method25(false);
        class7.method53(16302);
        class33.method266(arg0 ^ 0x7B);
        class97.method729(arg0 + 4226);
        class131.method1005();
        class34.method318();
        class121.method927(arg0 + 16777217);
        class59.method487(arg0);
        class108.method812(~arg0);
        class3.method18(arg0);
        class17.method137(14760);
        class101.method753(125);
        class88.method654((byte) -96);
        class64.method530(-62);
        class84.method625(-1);
        class10.method74(-1);
        class96.method716(true);
        class117.method906((byte) -74);
        class43.method410((byte) -122);
        class29.method240((byte) 75);
        class60.method488(114);
        class41.method404(-22861);
        class40.method385(false);
        class102.method790();
        class132.method1016((byte) 0);
        class27.method221(-122);
        class124.method939((byte) -15);
        class30.method246(112);
        class113.method864(false);
        class89.method662(31782);
        class22.method197((byte) 94);
        class71.method566(-32);
        class58.method480(true);
        class128.method947((byte) 121);
        class105.method797(true);
        class50.method444();
        class51.method445(arg0 - 116);
        class35.method320(arg0 ^ 0x7C);
        class90.method666(arg0 ^ 0xFFFFFFFD);
        class83.method623(-106);
        class65.method532(1);
        class111.method855(-1);
        class31.method247(-81);
        class95.method709(105);
        class56.method471(0);
        class53.method452((byte) -42);
        class99.method742((byte) 98);
        class129.method949(32768);
        class12.method96();
        class49.method441();
        class14.method107(true);
        class52.method447(~arg0);
        class120.method920(false);
        class15.method111(-58);
        class94.method706(arg0 ^ 0xFFFFFF00);
        class8.method62(false);
        class109.method824(4097);
        class67.method548(-18260);
        class79.method608((byte) -74);
        class112.method857(-6);
        class63.method526(true);
        class115.method880(-1);
        class6.method44(arg0 ^ 0xFFFF85F8);
        class107.method806();
        class1.method2(false);
        class119.method915(40);
        class69.method565((byte) 99);
        class23.method200(-24051);
        class92.method686(false);
        class13.method102();
        class68.method558(-41);
        class2.method11((byte) -26);
        class85.method642(arg0 ^ 0xFFFFFF9F);
        class47.method421((byte) 63);
        class46.method419(true);
        class48.method424(-99);
        class32.method252(-54);
        class123.method934(0);
        class98.method733((byte) -122);
        class54.method463(true);
        class72.method568((byte) -85);
        class61.method516(30425);
        class55.method468();
        class103.method793((byte) -78);
        class74.method582();
        class24.method204((byte) 115);
        class87.method650();
        class26.method214((byte) -124);
        class37.method374((byte) -85);
        class19.method180(-371);
        class81.method617(126);
        class86.method645();
        class77.method601();
        class42.method407(0);
        class45.method417((byte) -124);
        class116.method899(7);
        class16.method135();
        class21.method191(85);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)Lrd;", line = 515)
    public static final class106 method161(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field525++;
        try {
            return (class106) Class.forName("bd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class54();
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 541)
    public final void method162(byte arg0) {
        class64.field1622 = class64.field1635 == 0 ? 43594 : class47.field1258 + 40000;
        class51.field1344 = class64.field1622;
        class19.field562 = class64.field1635 == 0 ? 443 : class47.field1258 + 50000;
        int var2 = 19 % ((5 - arg0) / 41);
        class84.method626(-21960);
        field530++;
        class61.method514((byte) -102, class84.field2003);
        class17.method136(class84.field2003, true);
        class26.field743 = class110.field2711;
        try {
            if (class113.field2779.field2714 != null) {
                class47.field1272 = new class4(class113.field2779.field2714, 5200, 0);
                for (int var3 = 0; var3 < 12; var3++) {
                    class116.field2869[var3] = new class4(class113.field2779.field2703[var3], 6000, 0);
                }
                class56.field1436 = new class4(class113.field2779.field2698, 6000, 0);
                class101.field2446 = new class7(255, class47.field1272, class56.field1436, 500000);
                class113.field2779.field2703 = null;
                class113.field2779.field2698 = null;
                class113.field2779.field2714 = null;
            }
        } catch (IOException var4) {
            class56.field1436 = null;
            class47.field1272 = null;
            class101.field2446 = null;
        }
        if (class64.field1635 != 0) {
            class51.field1345 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 588)
    private final void method163(int arg0, int arg1) {
        class10.field338 = arg1;
        class116.field2878 = null;
        class19.field567++;
        if (class64.field1622 == class51.field1344) {
            class51.field1344 = class19.field562;
        } else {
            class51.field1344 = class64.field1622;
        }
        field535++;
        class69.field1780 = null;
        if (class19.field567 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class40.field1109 <= 5) {
                this.method693(true, "js5connect_full");
                class40.field1109 = 1000;
            } else {
                class132.field3197 = 3000;
            }
        } else if (class19.field567 >= 2 && arg0 == 6) {
            this.method693(true, "js5connect_outofdate");
            class40.field1109 = 1000;
        } else if (class19.field567 >= 4) {
            if (class40.field1109 <= 5) {
                this.method693(true, "js5connect");
                class40.field1109 = 1000;
            } else {
                class132.field3197 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 650)
    public final void method164(byte arg0) {
        field528++;
        class130.field3128++;
        this.method167((byte) 126);
        class53.method455(false);
        class65.method533((byte) 1);
        class26.method216(0);
        class1.method3(8);
        class109.method821((byte) -80);
        if (arg0 != -7) {
            this.method162((byte) -92);
        }
        if (class40.field1109 == 0) {
            class61.method513((byte) 78);
            class46.method420((byte) 108);
        } else if (class40.field1109 == 5) {
            class61.method513((byte) 78);
            class46.method420((byte) 123);
        } else if (class40.field1109 == 10) {
            class45.method416(arg0 + 7);
        } else if (class40.field1109 == 20) {
            class45.method416(0);
            class48.method428(arg0 + 5);
        } else if (class40.field1109 == 25) {
            class40.method384(false);
        }
        if (class40.field1109 == 30) {
            class30.method245(-1);
        } else if (class40.field1109 == 35) {
            class30.method245(arg0 + 6);
        } else if (class40.field1109 == 40) {
            class48.method428(arg0 ^ 0x7);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 712)
    private final void method165(int arg0) {
        field534++;
        if (class116.field2877 >= 4) {
            this.method693(true, "js5crc");
            class40.field1109 = 1000;
            return;
        }
        if (class29.field817 >= 4) {
            if (class40.field1109 <= 5) {
                this.method693(true, "js5io");
                class40.field1109 = 1000;
                return;
            }
            class29.field817 = 3;
            class132.field3197 = 3000;
        }
        if (arg0 != -3860) {
            field522 = null;
        }
        if (class132.field3197-- > 0) {
            return;
        }
        try {
            if (class10.field338 == 0) {
                class116.field2878 = class113.field2779.method839((byte) 81, class51.field1344);
                class10.field338++;
            }
            if (class10.field338 == 1) {
                if (class116.field2878.field1099 == 2) {
                    this.method163(-1, 0);
                    return;
                }
                if (class116.field2878.field1099 == 1) {
                    class10.field338++;
                }
            }
            if (class10.field338 == 2) {
                class69.field1780 = new class18((Socket) class116.field2878.field1100, class113.field2779);
                class36 var2 = new class36(5);
                var2.method330(-1, 15);
                var2.method325(-405801808, 427);
                class69.field1780.method145(arg0 + 3860, 5, 0, var2.field1067);
                class10.field338++;
                class35.field1003 = class90.method668(false);
            }
            if (class10.field338 == 3) {
                if (class40.field1109 <= 5 || class69.field1780.method155((byte) -116) > 0) {
                    int var3 = class69.field1780.method153((byte) -99);
                    if (var3 != 0) {
                        this.method163(var3, 0);
                        return;
                    }
                    class10.field338++;
                } else if (class90.method668(false) - class35.field1003 > 30000L) {
                    this.method163(-2, 0);
                    return;
                }
            }
            if (class10.field338 == 4) {
                class83.method621(arg0 ^ 0xF12, class69.field1780, class40.field1109 > 20);
                class10.field338 = 0;
                class19.field567 = 0;
                class116.field2878 = null;
                class69.field1780 = null;
            }
        } catch (IOException var4) {
            this.method163(-3, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 833)
    public static final void method166(int arg0) {
        class23 var1 = (class23) class23.field653.method813(-110);
        if (arg0 <= 25) {
            method161(false);
        }
        while (var1 != null) {
            if (var1.field650 != null) {
                class9.field297.method873(var1.field650);
                var1.field650 = null;
            }
            if (var1.field667 != null) {
                class9.field297.method873(var1.field667);
                var1.field667 = null;
            }
            var1 = (class23) class23.field653.method814((byte) -19);
        }
        field531++;
        class23.field653.method816((byte) 96);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 883)
    private final void method167(byte arg0) {
        field529++;
        if (class40.field1109 == 1000) {
            return;
        }
        if (arg0 <= 111) {
            this.method158(-21);
        }
        boolean var2 = class92.method685(0);
        if (!var2) {
            this.method165(-3860);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwb;ILwb;Lk;)Lwc;", line = 902)
    public static final class131 method168(class130 arg0, int arg1, class130 arg2, class60 arg3) {
        int var4 = arg3.method507(arg2, -1);
        if (arg1 >= -93) {
            field540 = null;
        }
        field519++;
        int var5 = arg3.method502(arg0, false, var4);
        return class99.method740(arg3, var5, false, var4);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 920)
    public final void init() {
        field546++;
        if (!this.method692((byte) -34)) {
            return;
        }
        class47.field1258 = Integer.parseInt(this.getParameter("worldid"));
        class60.field1541 = Integer.parseInt(this.getParameter("modewhat"));
        class64.field1635 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class37.method379((byte) -103);
        } else {
            class6.method49(45);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class124.field2999 = true;
        } else {
            class124.field2999 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class45.method411((byte) -124);
            class67.field1708 = 1;
        }
        this.method687(427, -84, 765, class60.field1541 + 32, 503);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 964)
    public static final void method169(byte arg0) {
        field526++;
        int var1 = -84 % ((arg0 - 66) / 36);
        class111.field2718.method401(26116);
    }
}
