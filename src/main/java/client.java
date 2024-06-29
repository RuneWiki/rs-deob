import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class134 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
    public static boolean field476 = false;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lpd;")
    public static class94 field473 = class28.method249(-78, "");

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field477 = 0;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field474 = 1;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lpd;")
    public static class94 field485 = field473;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lpd;")
    public static class94 field491 = field473;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
    public static int[] field479 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lpd;")
    public static class94 field501 = class28.method249(-47, "");

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lpd;")
    public static class94 field492 = field473;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lpd;")
    public static class94 field484 = field473;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lpd;")
    public static class94 field494 = class28.method249(-94, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lpd;")
    public static class94 field499 = field473;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    public static int field502 = 0;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Lpd;")
    public static class94 field503 = field473;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lpd;")
    public static class94 field500 = class28.method249(-122, "sch-Utteln:");

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lmb;")
    public static class73 field486;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[[B")
    public static byte[][] field482;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 12)
    public final void method134(int arg0) {
        field481++;
        class26.field699++;
        this.method135(arg0 + 125);
        if (arg0 != 0) {
            return;
        }
        class9.method54((byte) -111);
        class123.method974(~arg0);
        class108.method786(false);
        class42.method316(-1);
        class95.method729(false);
        if (class115.field2922 == 0) {
            class126.method998(arg0 ^ 0xFFFFDB00);
            class81.method606(-82);
        } else if (class115.field2922 == 5) {
            class126.method998(-9472);
            class81.method606(arg0 - 116);
        } else if (class115.field2922 == 10) {
            class100.method754(1);
        } else if (class115.field2922 == 20) {
            class100.method754(1);
            class13.method81(0);
        } else if (class115.field2922 == 25) {
            class81.method604(79);
        }
        if (class115.field2922 == 30) {
            class75.method561(765);
        } else if (class115.field2922 == 35) {
            class75.method561(765);
        } else if (class115.field2922 == 40) {
            class13.method81(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 82)
    private final void method135(int arg0) {
        field478++;
        if (class115.field2922 == 1000) {
            return;
        }
        boolean var2 = class30.method262(115);
        if (arg0 <= 96) {
            this.method134(-96);
        }
        if (!var2) {
            this.method139((byte) -79);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 136)
    public final void method136(int arg0) {
        field504++;
        method140(-48);
        class94.method694(45);
        class134.method1062((byte) -128);
        class25.method227(true);
        class66.method497(41);
        class31.method266(0);
        class122.method959(3);
        class87.method640(-110);
        class73.method551(false);
        class55.method441(112);
        class50.method396(false);
        class80.method598(64);
        class43.method325((byte) -109);
        class16.method112();
        class24.method197();
        class88.method645((byte) 65);
        class89.method667(-116);
        class119.method891(56);
        class77.method572(76);
        class76.method570(-125);
        class70.method525((byte) 103);
        class8.method47(0);
        class37.method288((byte) -126);
        class113.method841(-109);
        class4.method25(4574);
        class136.method1072((byte) 114);
        class120.method902((byte) 39);
        class2.method13((byte) -62);
        class128.method1009((byte) 91);
        class57.method451(0);
        class48.method377();
        class108.method788(-5);
        class40.method306(123);
        class54.method431(7759444);
        class1.method2((byte) -31);
        class127.method1003(326);
        class28.method251((byte) 43);
        class12.method78(114);
        class30.method260(-91);
        class102.method764(1024);
        class97.method737(0);
        class81.method603((byte) -16);
        class59.method458();
        class13.method80((byte) 90);
        class64.method481((byte) 5);
        class115.method859((byte) -108);
        class99.method748(false);
        class111.method829((byte) 54);
        class9.method55(0);
        class123.method970(1);
        class85.method620(-122);
        class84.method614(0);
        class42.method317((byte) 50);
        class126.method997(93);
        class26.method231((byte) -123);
        class7.method42(-7660);
        class67.method502(124);
        class124.method984();
        class130.method1026();
        class100.method751(-1);
        class135.method1067(false);
        class95.method728(0);
        class63.method473(false);
        class121.method912((byte) -12);
        class45.method335(-4308);
        class27.method238(65535);
        class110.method800((byte) 82);
        class39.method299(1);
        class86.method632((byte) -74);
        class52.method407(true);
        class101.method761(33554431);
        class79.method583(-81);
        class44.method331();
        class23.method167(0);
        class98.method742(121);
        class46.method343(105);
        class75.method559(0);
        class29.method256((byte) 106);
        class20.method153(4);
        class19.method146(15);
        class18.method130();
        class133.method1053(12488);
        class14.method84(1024);
        class82.method609(128);
        class10.method61(78);
        class38.method293((byte) 46);
        class47.method347(true);
        class17.method127(false);
        class51.method405((byte) -87);
        class103.method767(-78);
        class41.method308(-1);
        class21.method158(true);
        class107.method784(11210);
        class69.method509(127);
        class105.method776(-15552);
        class34.method276();
        class117.method884(1115298848);
        class61.method460();
        class90.method672((byte) -65);
        class131.method1035();
        class72.method540((byte) 83);
        class33.method268(-99);
        class62.method464((byte) -32);
        if (arg0 < 104) {
            this.method142(56);
        }
        class36.method286(true);
        class65.method491();
        class96.method733();
        class74.method554(-17);
        class6.method36(104);
        class92.method684(-17);
        class15.method88();
        class112.method832(64);
        if (class134.field3306) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I", line = 261)
    public static final int method137(int arg0, boolean arg1, int arg2, int arg3) {
        field497++;
        if ((class108.field2679[arg3][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg1) {
            return arg3 <= 0 || (class108.field2679[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 107;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I", line = 300)
    public static final int method138(byte arg0, int arg1, int arg2, int arg3) {
        field493++;
        int var4 = arg3 & 0x3;
        int var5 = 52 / ((arg0 + 65) / 56);
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 324)
    private final void method139(byte arg0) {
        field495++;
        if (arg0 != -79) {
            method137(29, false, -76, -118);
        }
        if (class107.field2667 >= 4) {
            this.method1059((byte) 46, "js5crc");
            class115.field2922 = 1000;
            return;
        }
        if (class28.field814 >= 4) {
            if (class115.field2922 <= 5) {
                this.method1059((byte) 42, "js5io");
                class115.field2922 = 1000;
                return;
            }
            class28.field814 = 3;
            class82.field2105 = 3000;
        }
        if (class82.field2105-- > 0) {
            return;
        }
        try {
            if (class77.field1924 == 0) {
                class27.field730 = class112.field2832.method65(class64.field1588, 1);
                class77.field1924++;
            }
            if (class77.field1924 == 1) {
                if (class27.field730.field2944 == 2) {
                    this.method144((byte) 120, -1);
                    return;
                }
                if (class27.field730.field2944 == 1) {
                    class77.field1924++;
                }
            }
            if (class77.field1924 == 2) {
                class31.field881 = new class87((Socket) class27.field730.field2946, class112.field2832);
                class122 var2 = new class122(5);
                var2.method916(-2, 15);
                var2.method917(440, true);
                class31.field881.method639(var2.field3074, 1885, 5, 0);
                class77.field1924++;
                class31.field886 = class115.method856(true);
            }
            if (class77.field1924 == 3) {
                if (class115.field2922 <= 5 || class31.field881.method637(1) > 0) {
                    int var3 = class31.field881.method641(0);
                    if (var3 != 0) {
                        this.method144((byte) -10, var3);
                        return;
                    }
                    class77.field1924++;
                } else if (class115.method856(true) - class31.field886 > 30000L) {
                    this.method144((byte) -82, -2);
                    return;
                }
            }
            if (class77.field1924 == 4) {
                class82.method611(class31.field881, class115.field2922 > 20, 4);
                class27.field730 = null;
                class86.field2195 = 0;
                class31.field881 = null;
                class77.field1924 = 0;
            }
        } catch (IOException var4) {
            this.method144((byte) -74, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 443)
    public static void method140(int arg0) {
        field485 = null;
        field473 = null;
        if (arg0 > -12) {
            return;
        }
        field479 = null;
        field491 = null;
        field500 = null;
        field492 = null;
        field494 = null;
        field501 = null;
        field499 = null;
        field503 = null;
        field486 = null;
        field482 = null;
        field484 = null;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 554)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class86.method629((byte) 125);
            }
            class1.field36 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class122.field3097 = 0;
            } else if (arg0[1].equals("office")) {
                class122.field3097 = 1;
            } else if (arg0[1].equals("local")) {
                class122.field3097 = 2;
            } else {
                class86.method629((byte) 61);
            }
            if (arg0[2].equals("live")) {
                class70.field1704 = 0;
            } else if (arg0[2].equals("rc")) {
                class70.field1704 = 1;
            } else if (arg0[2].equals("wip")) {
                class70.field1704 = 2;
            } else {
                class86.method629((byte) -9);
            }
            if (arg0[3].equals("lowmem")) {
                class94.method685((byte) -86);
            } else if (arg0[3].equals("highmem")) {
                class57.method446(0);
            } else {
                class86.method629((byte) -115);
            }
            if (arg0[4].equals("free")) {
                class52.field1294 = false;
            } else if (arg0[4].equals("members")) {
                class52.field1294 = true;
            } else {
                class86.method629((byte) -21);
            }
            if (arg0[5].equals("english")) {
                class67.field1649 = 0;
            } else if (arg0[5].equals("german")) {
                class87.method643(-2551);
                class67.field1649 = 1;
            } else {
                class86.method629((byte) -124);
            }
            client var1 = new client();
            var1.method1056("runescape", 503, 13, 105, class70.field1704 + 32, InetAddress.getLocalHost(), 765, 440);
        } catch (Exception var3) {
            class81.method607(null, var3, (byte) -82);
        }
        field488++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 635)
    public final void method141(int arg0) {
        field498++;
        if (class108.field2681 != null) {
            class108.field2681.field878 = false;
        }
        class108.field2681 = null;
        if (class1.field47 != null) {
            class1.field47.method636(1);
            class1.field47 = null;
        }
        if (arg0 != -12197) {
            method137(82, false, -114, -119);
        }
        class84.method615(0);
        class54.method432(0);
        class123.method972(arg0 ^ 0xFFFFD033);
        class19.method150((byte) -30);
        class99.method745((byte) -54);
        class7.method43(1);
        try {
            if (class99.field2519 != null) {
                class99.field2519.method437(arg0 - 15472);
            }
            if (class55.field1399 != null) {
                for (int var2 = 0; var2 < class55.field1399.length; var2++) {
                    if (class55.field1399[var2] != null) {
                        class55.field1399[var2].method437(-27669);
                    }
                }
            }
            if (class42.field1057 != null) {
                class42.field1057.method437(-27669);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 696)
    public final void method142(int arg0) {
        if (arg0 != -21419) {
            return;
        }
        if (class88.field2253) {
            class122.method950(class128.field3218, -110);
            class79.method584((byte) 94, class128.field3218);
            this.method1061(arg0 + 21381);
            class20.method155(class128.field3218, (byte) -73);
            class52.method410(92, class128.field3218);
        }
        field483++;
        if (class115.field2922 == 0) {
            class37.method290(field503, null, class46.field1141, (byte) -51);
        } else if (class115.field2922 == 5) {
            class52.method411(100, class115.field2913, class9.field251);
        } else if (class115.field2922 == 10) {
            class52.method411(100, class115.field2913, class9.field251);
        } else if (class115.field2922 == 20) {
            class52.method411(100, class115.field2913, class9.field251);
        } else if (class115.field2922 == 25) {
            if (class13.field329 == 1) {
                if (class80.field2053 > class57.field1457) {
                    class57.field1457 = class80.field2053;
                }
                int var3 = (class57.field1457 - class80.field2053) * 50 / class57.field1457;
                class135.method1065(true, (byte) 124, class84.field2125, class4.method20(new class94[] { class8.field188, class51.method403(var3, true), class36.field943 }, true));
            } else if (class13.field329 == 2) {
                if (class25.field690 < class66.field1628) {
                    class25.field690 = class66.field1628;
                }
                int var2 = (class25.field690 - class66.field1628) * 50 / class25.field690 + 50;
                class135.method1065(true, (byte) 124, class84.field2125, class4.method20(new class94[] { class8.field188, class51.method403(var2, true), class36.field943 }, true));
            } else {
                class135.method1065(false, (byte) 124, class84.field2125, null);
            }
        } else if (class115.field2922 == 30) {
            class70.method520(-4307);
        } else if (class115.field2922 == 35) {
            class2.method11(false);
        } else if (class115.field2922 == 40) {
            class135.method1065(false, (byte) 124, class50.field1259, class135.field3320);
        }
        class37.field968 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 773)
    public final void method143(byte arg0) {
        class54.field1352 = class122.field3097 == 0 ? 43594 : class1.field36 + 40000;
        class63.field1525 = class122.field3097 == 0 ? 443 : class1.field36 + 50000;
        class64.field1588 = class54.field1352;
        field472++;
        class62.method462((byte) -127);
        class20.method155(class128.field3218, (byte) -73);
        class52.method410(92, class128.field3218);
        class20.field563 = class11.field275;
        try {
            int var2 = 104 / ((arg0 - 45) / 49);
            if (class112.field2832.field280 != null) {
                class99.field2519 = new class55(class112.field2832.field280, 5200, 0);
                for (int var3 = 0; var3 < 13; var3++) {
                    class55.field1399[var3] = new class55(class112.field2832.field293[var3], 6000, 0);
                }
                class42.field1057 = new class55(class112.field2832.field283, 6000, 0);
                class92.field2365 = new class50(255, class99.field2519, class42.field1057, 500000);
                class112.field2832.field293 = null;
                class112.field2832.field283 = null;
                class112.field2832.field280 = null;
            }
        } catch (IOException var4) {
            class42.field1057 = null;
            class99.field2519 = null;
            class92.field2365 = null;
        }
        if (class122.field3097 != 0) {
            class28.field813 = true;
        }
        class87.field2205 = new class77();
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 816)
    public final void init() {
        field496++;
        if (!this.method1055(64)) {
            return;
        }
        class1.field36 = Integer.parseInt(this.getParameter("worldid"));
        class70.field1704 = Integer.parseInt(this.getParameter("modewhat"));
        class122.field3097 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class94.method685((byte) 122);
        } else {
            class57.method446(0);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class52.field1294 = true;
        } else {
            class52.field1294 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class87.method643(-2551);
            class67.field1649 = 1;
        }
        this.method1057(765, -14778, 503, class70.field1704 + 32, 440);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 861)
    private final void method144(byte arg0, int arg1) {
        class27.field730 = null;
        if (class64.field1588 == class54.field1352) {
            class64.field1588 = class63.field1525;
        } else {
            class64.field1588 = class54.field1352;
        }
        class31.field881 = null;
        class86.field2195++;
        int var3 = 40 % ((arg0 - 58) / 59);
        field475++;
        class77.field1924 = 0;
        if (class86.field2195 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class115.field2922 > 5) {
                class82.field2105 = 3000;
            } else {
                this.method1059((byte) 72, "js5connect_full");
                class115.field2922 = 1000;
            }
        } else if (class86.field2195 >= 2 && arg1 == 6) {
            this.method1059((byte) 68, "js5connect_outofdate");
            class115.field2922 = 1000;
        } else if (class86.field2195 >= 4) {
            if (class115.field2922 <= 5) {
                this.method1059((byte) 43, "js5connect");
                class115.field2922 = 1000;
            } else {
                class82.field2105 = 3000;
            }
        }
    }
}
