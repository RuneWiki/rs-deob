import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class121 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lod;")
    public static class101 field490 = class46.method335(-109, "AUS");

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private static int field475;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lsa;")
    public static class126 field485;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class146.method1153(false);
            }
            class47.field1130 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class141.field3243 = 0;
            } else if (arg0[1].equals("office")) {
                class141.field3243 = 1;
            } else if (arg0[1].equals("local")) {
                class141.field3243 = 2;
            } else {
                class146.method1153(false);
            }
            if (arg0[2].equals("live")) {
                class158.field3644 = 0;
            } else if (arg0[2].equals("rc")) {
                class158.field3644 = 1;
            } else if (arg0[2].equals("wip")) {
                class158.field3644 = 2;
            } else {
                class146.method1153(false);
            }
            if (arg0[3].equals("lowmem")) {
                class134.method1037((byte) 101);
            } else if (arg0[3].equals("highmem")) {
                class1.method4((byte) -100);
            } else {
                class146.method1153(false);
            }
            if (arg0[4].equals("free")) {
                class32.field821 = false;
            } else if (arg0[4].equals("members")) {
                class32.field821 = true;
            } else {
                class146.method1153(false);
            }
            if (arg0[5].equals("english")) {
                class13.field287 = 0;
            } else if (arg0[5].equals("german")) {
                class13.method94(false);
                class13.field287 = 1;
                class26.field667 = class32.field823;
            } else {
                class146.method1153(false);
            }
            if (arg0[6].equals("game0")) {
                class22.field521 = 0;
            } else if (arg0[6].equals("game1")) {
                class22.field521 = 1;
            } else {
                class146.method1153(false);
            }
            class80.field1704 = "127.0.0.1";
            client var1 = new client();
            var1.method908(503, 16, class158.field3644 + 32, 465, (byte) 85, 765, "runescape");
        } catch (Exception var3) {
            class142.method1130(null, var3, 7565);
        }
        field484++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
    public static final boolean method164(int arg0, int arg1) {
        field489++;
        if (arg1 != -618353250) {
            method165(false);
        }
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private static final void method165(boolean arg0) {
        if (!arg0) {
            return;
        }
        field473++;
        while (true) {
            class78 var1 = class41.field983;
            class83 var2;
            synchronized (class41.field983) {
                var2 = (class83) class27.field712.method536(-8898);
            }
            if (var2 == null) {
                return;
            }
            var2.field1812.method1023(var2.field1810, 0, (int) var2.field2723, false, var2.field1813);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method166(int arg0) {
        if (arg0 > -16) {
            return;
        }
        field478++;
        if (class145.field3335 != 1000) {
            boolean var2 = class49.method366(-84);
            if (!var2) {
                this.method172((byte) -59);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method167(int arg0) {
        class84.field1837.method135(0);
        field476++;
        if (arg0 != 465) {
            field475 = -43;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method168(int arg0) {
        if (arg0 != 3000) {
            method165(false);
        }
        field485 = null;
        field490 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method169(byte arg0) {
        field480++;
        class61.field1369 = class141.field3243 == 0 ? 443 : class47.field1130 + 50000;
        class26.field665 = class141.field3243 == 0 ? 43594 : class47.field1130 + 40000;
        if (class22.field521 == 1) {
            class133.field3049 = class75.field1600;
            class10.field141 = class50.field1170;
            class97.field2112 = class95.field2061;
            class46.field1075 = class90.field1965;
        } else {
            class133.field3049 = class22.field497;
            class97.field2112 = class115.field2528;
            class46.field1075 = class46.field1083;
            class10.field141 = class8.field125;
        }
        class98.field2116 = class26.field665;
        class129.method996(-85);
        class82.method596(false, class134.field3062);
        class32.method245(class134.field3062, (byte) -7);
        class27.field730 = class118.method890(20520);
        if (class27.field730 != null) {
            class27.field730.method244(class134.field3062, -6502);
        }
        field475 = class151.field3450;
        try {
            if (class129.field2954.field3448 != null) {
                class49.field1165 = new class26(class129.field2954.field3448, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class155.field3525[var2] = new class26(class129.field2954.field3445[var2], 6000, 0);
                }
                class147.field3356 = new class26(class129.field2954.field3456, 6000, 0);
                class125.field2725 = new class96(255, class49.field1165, class147.field3356, 500000);
                class95.field2051 = new class26(class129.field2954.field3446, 24, 0);
                class129.field2954.field3456 = null;
                class129.field2954.field3445 = null;
                class129.field2954.field3446 = null;
                class129.field2954.field3448 = null;
            }
        } catch (IOException var3) {
            class49.field1165 = null;
            class95.field2051 = null;
            class125.field2725 = null;
            class147.field3356 = null;
        }
        if (arg0 >= -46) {
            this.method170(91);
        }
        if (class141.field3243 != 0) {
            class158.field3639 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method170(int arg0) {
        field477++;
        if (class39.field941 != null) {
            class39.field941.field1045 = false;
        }
        class39.field941 = null;
        if (class90.field1958 != null) {
            class90.field1958.method444((byte) -85);
            class90.field1958 = null;
        }
        class20.method159((byte) -79);
        class64.method439(arg0);
        class27.field730 = null;
        if (class105.field2259 != null) {
            class105.field2259.method142(3);
        }
        if (class138.field3150 != null) {
            class138.field3150.method142(3);
        }
        class54.method391(arg0 ^ 0xFFFFFF82);
        class152.method1182(79);
        try {
            if (class49.field1165 != null) {
                class49.field1165.method212((byte) -65);
            }
            if (class155.field3525 != null) {
                for (int var2 = 0; var2 < class155.field3525.length; var2++) {
                    if (class155.field3525[var2] != null) {
                        class155.field3525[var2].method212((byte) -65);
                    }
                }
            }
            if (class147.field3356 != null) {
                class147.field3356.method212((byte) -101);
            }
            if (class95.field2051 != null) {
                class95.field2051.method212((byte) -55);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method171(int arg0) {
        field487++;
        boolean var2 = class57.method400((byte) -117);
        if (arg0 != 16097) {
            return;
        }
        if (var2 && class155.field3569 && class105.field2259 != null) {
            class105.field2259.method149(0);
        }
        if (class102.field2247) {
            class44.method323(class134.field3062, -51);
            class32.method247(class134.field3062, 5222);
            if (class27.field730 != null) {
                class27.field730.method240(false, class134.field3062);
            }
            this.method903((byte) 125);
            class82.method596(false, class134.field3062);
            class32.method245(class134.field3062, (byte) -126);
            if (class27.field730 != null) {
                class27.field730.method244(class134.field3062, arg0 - 22599);
            }
        }
        if (class145.field3335 == 0) {
            class36.method269(class119.field2625, class85.field1877, (byte) 119, null);
        } else if (class145.field3335 == 5) {
            class102.method742((byte) -120, class118.field2612, class34.field867);
        } else if (class145.field3335 == 10) {
            class102.method742((byte) -126, class118.field2612, class34.field867);
        } else if (class145.field3335 == 20) {
            class102.method742((byte) -125, class118.field2612, class34.field867);
        } else if (class145.field3335 == 25) {
            if (class5.field62 == 1) {
                if (class112.field2389 < class75.field1610) {
                    class112.field2389 = class75.field1610;
                }
                int var3 = (class112.field2389 - class75.field1610) * 50 / class112.field2389;
                class125.method961(102, false, class15.method101(-104, new class101[] { class41.field993, class155.field3537, class82.method592(false, var3), class40.field950 }));
            } else if (class5.field62 == 2) {
                if (class17.field369 < class33.field852) {
                    class17.field369 = class33.field852;
                }
                int var4 = (class17.field369 - class33.field852) * 50 / class17.field369 + 50;
                class125.method961(-36, false, class15.method101(arg0 - 16171, new class101[] { class41.field993, class155.field3537, class82.method592(false, var4), class40.field950 }));
            } else {
                class125.method961(arg0 ^ 0xFFFFC10E, false, class41.field993);
            }
        } else if (class145.field3335 == 30) {
            class31.method239((byte) -122);
        } else if (class145.field3335 == 40) {
            class125.method961(127, false, class15.method101(-87, new class101[] { class96.field2075, class90.field1964, class98.field2132 }));
        }
        if (class145.field3335 == 30 && class135.field3096 == 0 && !class22.field492) {
            try {
                Graphics var5 = class134.field3062.getGraphics();
                for (int var6 = 0; var6 < class157.field3626; var6++) {
                    if (class132.field3021[var6]) {
                        class106.field2294.method153(class85.field1893[var6], class96.field2076[var6], 524287, var5, class131.field2990[var6], class126.field2818[var6]);
                        class132.field3021[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class134.field3062.repaint();
            }
        } else if (class145.field3335 > 0) {
            try {
                Graphics var7 = class134.field3062.getGraphics();
                class106.field2294.method156(var7, 0, arg0 - 16097, 0);
                class22.field492 = false;
                for (int var8 = 0; var8 < class157.field3626; var8++) {
                    class132.field3021[var8] = false;
                }
            } catch (Exception var10) {
                class134.field3062.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field474++;
        if (!this.method905((byte) -124)) {
            return;
        }
        class47.field1130 = Integer.parseInt(this.getParameter("worldid"));
        class158.field3644 = Integer.parseInt(this.getParameter("modewhat"));
        class141.field3243 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class134.method1037((byte) -116);
        } else {
            class1.method4((byte) -109);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class32.field821 = true;
        } else {
            class32.field821 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class13.method94(false);
            class26.field667 = class32.field823;
            class13.field287 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class22.field521 = 1;
        } else {
            class22.field521 = 0;
        }
        try {
            class65.field1480 = Integer.parseInt(this.getParameter("js"));
            class56.field1259 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class80.field1704 = this.getCodeBase().getHost();
        this.method904(-84, class158.field3644 + 32, 765, 503, 465);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method172(byte arg0) {
        field481++;
        if (class43.field1030 >= 4) {
            this.method910(0, "js5crc");
            class145.field3335 = 1000;
            return;
        }
        if (class6.field82 >= 4) {
            if (class145.field3335 <= 5) {
                this.method910(0, "js5io");
                class145.field3335 = 1000;
                return;
            }
            class144.field3318 = 3000;
            class6.field82 = 3;
        }
        if (class144.field3318-- > 0) {
            return;
        }
        try {
            if (class98.field2120 == 0) {
                class152.field3473 = class129.field2954.method1172(111, class98.field2116, class80.field1704);
                class98.field2120++;
            }
            if (class98.field2120 == 1) {
                if (class152.field3473.field1591 == 2) {
                    this.method174(-1, (byte) -115);
                    return;
                }
                if (class152.field3473.field1591 == 1) {
                    class98.field2120++;
                }
            }
            if (arg0 != -59) {
                field490 = null;
            }
            if (class98.field2120 == 2) {
                class93.field1991 = new class64((Socket) class152.field3473.field1590, class129.field2954);
                class138 var2 = new class138(5);
                var2.method1101(15, (byte) -32);
                var2.method1090((byte) 38, 465);
                class93.field1991.method442(5, -95, 0, var2.field3213);
                class98.field2120++;
                class96.field2093 = class10.method47(18889);
            }
            if (class98.field2120 == 3) {
                if (class145.field3335 <= 5 || class93.field1991.method443((byte) -114) > 0) {
                    int var3 = class93.field1991.method437(16466);
                    if (var3 != 0) {
                        this.method174(var3, (byte) -118);
                        return;
                    }
                    class98.field2120++;
                } else if (class10.method47(18889) - class96.field2093 > 30000L) {
                    this.method174(-2, (byte) -128);
                    return;
                }
            }
            if (class98.field2120 == 4) {
                class1.method3(class145.field3335 > 20, class93.field1991, (byte) -26);
                class98.field2120 = 0;
                class90.field1957 = 0;
                class152.field3473 = null;
                class93.field1991 = null;
            }
        } catch (IOException var4) {
            this.method174(-3, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method173(int arg0) {
        method168(3000);
        field488++;
        class101.method739((byte) -61);
        class121.method909(arg0 ^ 0xDB24AD9B);
        class152.method1180(false);
        class93.method645((byte) 121);
        class44.method324((byte) 111);
        class138.method1092(697227944);
        class64.method438((byte) -24);
        class132.method1018((byte) -60);
        class26.method206((byte) -74);
        class96.method670(3);
        class62.method430(0);
        class61.method422(arg0 + 618353993);
        class81.method577();
        class47.method350((byte) 94);
        class126.method976(false);
        class13.method91(80);
        class78.method528(true);
        class143.method1138(true);
        class31.method243(arg0 + 618351837);
        class27.method221(true);
        class18.method147(true);
        class106.method760(2);
        class82.method594((byte) -56);
        class95.method663((byte) 100);
        class57.method407(true);
        class156.method1213(false);
        class115.method878(arg0 + 618353248);
        class133.method1027(arg0 + 618353265);
        class125.method960(arg0 ^ 0x24DB15B4);
        class94.method651((byte) 43);
        class48.method355(arg0 ^ 0xDB24ADEB);
        class17.method134(arg0 + 618353342);
        class113.method833();
        class110.method811();
        class73.method512(arg0 ^ 0xDB24FBC5);
        class8.method38(4937);
        class56.method398(arg0 ^ 0xDB24DB38);
        class149.method1164((byte) 71);
        class112.method822(-4681);
        class32.method248(-1);
        class49.method364(106);
        class1.method2(-2);
        class28.method225((byte) 92);
        class46.method330(false);
        class129.method1000((byte) -110);
        class71.method502();
        class148.method1161((byte) 82);
        class119.method899(false);
        class67.method451(-20468);
        class153.method1185(5);
        class10.method48(true);
        class79.method537(-80);
        class29.method229((byte) 92);
        class15.method126((byte) -85);
        class11.method63((byte) 79);
        class105.method754(-123);
        class140.method1117((byte) -58);
        class90.method634(23847);
        class34.method257(128);
        class102.method743(true);
        class120.method901(true);
        class98.method682(arg0 + 618353254);
        class99.method689(arg0 + 618353188);
        class87.method625(arg0 + 618378904);
        class36.method265(arg0 + 618353257);
        class33.method253(15435);
        class7.method34(arg0 + 618353127);
        class38.method291();
        class75.method514((byte) -29);
        class124.method955();
        class135.method1041(123);
        class109.method790();
        class134.method1036(true);
        class127.method978(6215);
        class145.method1148((byte) 119);
        class131.method1009(3547);
        class54.method392(arg0 ^ 0xDB24ADD1);
        class40.method301(arg0 ^ 0x24DB520C);
        class24.method194(arg0 ^ 0xDB24AD9E);
        class155.method1195(1975);
        if (arg0 != -618353250) {
            return;
        }
        class146.method1150((byte) 93);
        class25.method204(true);
        class158.method1220((byte) 114);
        class35.method259(false);
        class108.method773(arg0 ^ 0xDB24BBCF);
        class23.method182(-3);
        class114.method861();
        class118.method886((byte) -123);
        class69.method496();
        class52.method373(46);
        class5.method23(true);
        class142.method1132(29651);
        class65.method445((byte) 120);
        class130.method1001(false);
        class157.method1217((byte) -111);
        class100.method693((byte) -78);
        class86.method618((byte) 107);
        class6.method31((byte) -29);
        class141.method1129(46);
        class43.method319((byte) 87);
        class2.method7(arg0 ^ 0xDB24AD96);
        class21.method162();
        class22.method180(-21757);
        class85.method617(-26803);
        class42.method315(128);
        class12.method90((byte) -88);
        class111.method820((byte) -48);
        class39.method292(true);
        class89.method632((byte) -119);
        class41.method310(-123);
        class92.method643(false);
        class3.method14((byte) 84);
        class20.method152(true);
        class154.method1189((byte) -94);
        class144.method1146(999999999);
        class147.method1159(arg0 + 618353249);
        class80.method540((byte) 97);
        class50.method370(99);
        class16.method132();
        class91.method636();
        class97.method675(25032);
        class117.method885();
        class137.method1047((byte) 127);
        class83.method608(false);
        class139.method1113();
        class63.method435(26387);
        class84.method609(true);
        class150.method1167((byte) 49);
        class128.method987();
        class159.method1225();
        class53.method382((byte) 123);
        class30.method233((byte) 125);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method174(int arg0, byte arg1) {
        field483++;
        if (class98.field2116 == class26.field665) {
            class98.field2116 = class61.field1369;
        } else {
            class98.field2116 = class26.field665;
        }
        class98.field2120 = 0;
        class93.field1991 = null;
        class152.field3473 = null;
        class90.field1957++;
        if (arg1 >= -114) {
            this.method170(67);
        }
        if (class90.field1957 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class145.field3335 <= 5) {
                this.method910(0, "js5connect_full");
                class145.field3335 = 1000;
            } else {
                class144.field3318 = 3000;
            }
        } else if (class90.field1957 >= 2 && arg0 == 6) {
            this.method910(0, "js5connect_outofdate");
            class145.field3335 = 1000;
        } else if (class90.field1957 >= 4) {
            if (class145.field3335 <= 5) {
                this.method910(0, "js5connect");
                class145.field3335 = 1000;
            } else {
                class144.field3318 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 != -26) {
            method164(88, -84);
        }
        class143.field3305++;
        field479++;
        this.method166(-48);
        method165(true);
        class84.method611((byte) -43);
        class49.method367(13057);
        class75.method516(0);
        class34.method256(0);
        if (class27.field730 != null) {
            int var2 = class27.field730.method241(-101);
            class129.field2943 = var2;
        }
        if (class145.field3335 == 0) {
            class8.method37(-15);
            class141.method1128(0);
        } else if (class145.field3335 == 5) {
            class40.method302(0, this);
            class8.method37(-15);
            class141.method1128(0);
        } else if (class145.field3335 == 10) {
            class40.method302(0, this);
        } else if (class145.field3335 == 20) {
            class40.method302(0, this);
            class100.method698(8);
        } else if (class145.field3335 == 25) {
            class155.method1205(arg0 ^ 0x19);
        }
        if (class145.field3335 == 30) {
            class146.method1155(arg0 - 94);
        } else if (class145.field3335 == 40) {
            class100.method698(arg0 ^ 0xFFFFFFEE);
        }
    }
}
