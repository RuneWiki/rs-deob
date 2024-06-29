import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class47 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field364 = -1;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lb;")
    public static class7 field361 = new class7();

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lmc;")
    public static class75 field377 = class30.method234(true, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private static int field379 = 0;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lmc;")
    public static class75 field375 = class30.method234(true, "Fertigkeit)2");

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lmc;")
    public static class75 field376 = class30.method234(true, "@gr1@");

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Lmc;")
    public static class75 field380 = class30.method234(true, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lpb;")
    public static class92 field374;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
    public static boolean field382;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 12)
    private final void method125(int arg0) {
        field371++;
        if (arg0 != 25) {
            field364 = -92;
        }
        if (class7.field100 >= 4) {
            this.method358("js5crc", (byte) 76);
            class110.field2787 = 1000;
            return;
        }
        if (class70.field1791 >= 4) {
            if (class110.field2787 <= 5) {
                this.method358("js5io", (byte) 76);
                class110.field2787 = 1000;
                return;
            }
            class97.field2436 = 3000;
            class70.field1791 = 3;
        }
        if (class97.field2436-- > 0) {
            return;
        }
        try {
            if (field379 == 0) {
                class85.field2102 = class78.field1967.method983(class112.field2841, true);
                field379++;
            }
            if (field379 == 1) {
                if (class85.field2102.field2964 == 2) {
                    this.method135(1000, -1);
                    return;
                }
                if (class85.field2102.field2964 == 1) {
                    field379++;
                }
            }
            if (field379 == 2) {
                class16.field304 = new class91((Socket) class85.field2102.field2959, class78.field1967);
                class61 var2 = new class61(5);
                var2.method493((byte) 88, 15);
                var2.method526(419, (byte) 7);
                class16.field304.method761(5, 0, var2.field1577, 0);
                field379++;
                class56.field1430 = System.currentTimeMillis();
            }
            if (field379 == 3) {
                if (class110.field2787 <= 5 || class16.field304.method753(arg0 - 25) > 0) {
                    int var3 = class16.field304.method759((byte) 70);
                    if (var3 != 0) {
                        this.method135(arg0 ^ 0x3F1, var3);
                        return;
                    }
                    field379++;
                } else if (System.currentTimeMillis() - class56.field1430 > 30000L) {
                    this.method135(arg0 + 975, -2);
                    return;
                }
            }
            if (field379 == 4) {
                class28.method181((byte) -73, class16.field304, class110.field2787 > 20);
                class85.field2102 = null;
                class16.field304 = null;
                field379 = 0;
                class13.field254 = 0;
            }
        } catch (IOException var4) {
            this.method135(arg0 + 975, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 138)
    private final void method126(int arg0) {
        field370++;
        if (class110.field2787 == 1000) {
            return;
        }
        if (arg0 != -637) {
            field381 = -51;
        }
        boolean var2 = class38.method294(0);
        if (!var2) {
            this.method125(25);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 164)
    public final void method127(int arg0) {
        if (arg0 != 50) {
            field374 = null;
        }
        field365++;
        if (class52.field1284) {
            class76.method661(true, class108.field2738);
            class63.method557(arg0 + 21839, class108.field2738);
            this.method360((byte) 32);
            class68.method584(class108.field2738, true);
            class62.method548(arg0 ^ 0xE, class108.field2738);
        }
        if (class110.field2787 == 0) {
            class63.method554(class62.field1627, -113, class47.field1122, null);
        } else if (class110.field2787 == 5) {
            class26.method174(class5.field77, class44.field1046, (byte) -41);
        } else if (class110.field2787 == 10) {
            class26.method174(class5.field77, class44.field1046, (byte) -41);
        } else if (class110.field2787 == 20) {
            class26.method174(class5.field77, class44.field1046, (byte) -41);
        } else if (class110.field2787 == 25) {
            if (class56.field1427 == 1) {
                if (class109.field2773 > class16.field296) {
                    class16.field296 = class109.field2773;
                }
                int var2 = (class16.field296 - class109.field2773) * 50 / class16.field296;
                class26.method173(true, class69.method586(new class75[] { class41.field991, class45.method345(22978, var2), class40.field950 }, (byte) 99), arg0 + 55, class7.field96);
            } else if (class56.field1427 == 2) {
                if (class97.field2443 > class25.field495) {
                    class25.field495 = class97.field2443;
                }
                int var3 = (class25.field495 - class97.field2443) * 50 / class25.field495 + 50;
                class26.method173(true, class69.method586(new class75[] { class41.field991, class45.method345(22978, var3), class40.field950 }, (byte) 28), 104, class7.field96);
            } else {
                class26.method173(false, null, arg0 + 75, class7.field96);
            }
        } else if (class110.field2787 == 30) {
            class78.method668((byte) -51);
        } else if (class110.field2787 == 35) {
            class8.method44(false);
        } else if (class110.field2787 == 40) {
            class26.method173(false, class40.field966, 113, class94.field2384);
        }
        class28.field600 = 0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 243)
    public final void init() {
        field368++;
        if (!this.method362((byte) 126)) {
            return;
        }
        class58.field1468 = Integer.parseInt(this.getParameter("worldid"));
        class82.field2046 = Integer.parseInt(this.getParameter("modewhat"));
        class117.field2911 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class23.method163(77);
        } else {
            class84.method694(-86);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class109.field2755 = true;
        } else {
            class109.field2755 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class57.method461(64);
            class7.field109 = 1;
        }
        this.method356(503, 765, 419, class82.field2046 + 32, 11063);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)I", line = 303)
    public static final int method128(int arg0, int arg1, byte arg2) {
        field362++;
        int var3 = class108.method892(arg1 + 45365, 4, arg0 + 91923, (byte) 94) + (class108.method892(arg1 + 10294, 2, arg0 + 37821, (byte) 77) - 128 >> 1) + (class108.method892(arg1, 1, arg0, (byte) 120) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg2 < 29) {
            return 59;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 326)
    public final void method129(byte arg0) {
        class100.field2593 = class117.field2911 == 0 ? 43594 : class58.field1468 + 40000;
        class112.field2841 = class100.field2593;
        field369++;
        class79.field2004 = class117.field2911 == 0 ? 443 : class58.field1468 + 50000;
        class17.method123(18);
        class68.method584(class108.field2738, true);
        class62.method548(60, class108.field2738);
        class16.field301 = class124.field3024;
        try {
            if (arg0 < 84) {
                field377 = null;
            }
            if (class78.field1967.field3025 != null) {
                class68.field1740 = new class79(class78.field1967.field3025, 5200, 0);
                for (int var2 = 0; var2 < 12; var2++) {
                    class37.field893[var2] = new class79(class78.field1967.field3027[var2], 6000, 0);
                }
                class31.field703 = new class79(class78.field1967.field3030, 6000, 0);
                class30.field676 = new class12(255, class68.field1740, class31.field703, 500000);
                class78.field1967.field3025 = null;
                class78.field1967.field3027 = null;
                class78.field1967.field3030 = null;
            }
        } catch (IOException var3) {
            class31.field703 = null;
            class68.field1740 = null;
            class30.field676 = null;
        }
        if (class117.field2911 != 0) {
            class3.field43 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 375)
    public final void method130(byte arg0) {
        method132((byte) -50);
        field373++;
        class75.method638((byte) 45);
        class47.method352(-79);
        class82.method692(-17328);
        class57.method460(64);
        class92.method768(24997);
        class68.method582(-76);
        class61.method502((byte) -57);
        class91.method757(1978886640);
        class90.method748((byte) -121);
        class79.method669(arg0 ^ 0xFFFFE7BB);
        class12.method82(arg0 + 50);
        class97.method814(false);
        class85.method706(-63);
        class54.method419();
        class29.method191();
        class8.method53((byte) 63);
        class122.method957(arg0 ^ 0x69);
        class32.method249((byte) 109);
        class99.method823((byte) -99);
        class23.method162(-6151);
        class44.method340((byte) 101);
        class50.method385(arg0 ^ 0x3EE);
        class24.method166(arg0 + 132);
        class34.method269(-30);
        class74.method612((byte) -126);
        if (arg0 != -7) {
            field381 = 15;
        }
        class69.method591(100);
        class56.method459(1);
        class130.method1017(44);
        class129.method1014(0);
        class55.method448(0);
        class63.method552(-96);
        class107.method872(1);
        class93.method799();
        class40.method311((byte) 56);
        class1.method2(17315);
        class45.method347(-18);
        class125.method996((byte) -120);
        class112.method908((byte) 124);
        class64.method560((byte) -119);
        class3.method19(334);
        class131.method1018(true);
        class78.method665(true);
        class25.method171(14171);
        class39.method302();
        class84.method699(38);
        class126.method997(arg0 - 101);
        class6.method28(arg0 + 7);
        class117.method932((byte) -73);
        class38.method293(false);
        class70.method594(104);
        class31.method244(63);
        class114.method916((byte) -75);
        class7.method35((byte) -97);
        class101.method838(0);
        class128.method1007(63);
        class49.method383();
        class66.method573();
        class58.method462(arg0 ^ 0xFFFFB441);
        class28.method179((byte) -4);
        class37.method286(3);
        class21.method145(14779);
        class15.method103(-16);
        class62.method540(4473);
        class59.method472((byte) -112);
        class10.method61((byte) 14);
        class26.method175(10858);
        class86.method722(arg0 ^ 0xFFFFFF92);
        class111.method903(32384);
        class119.method950((byte) 47);
        class16.method105(122);
        class80.method681();
        class41.method313(128);
        class17.method122(false);
        class110.method901(false);
        class100.method833(27427);
        class96.method811((byte) 126);
        class33.method257();
        class36.method283(97);
        class108.method890(0);
        class94.method804((byte) -2);
        class13.method88((byte) 80);
        class87.method728(1);
        class127.method1002(-23282);
        class5.method27(false);
        class118.method946((byte) -8);
        class30.method235((byte) -118);
        class109.method894((byte) -50);
        class52.method404((byte) 46);
        class98.method819(true);
        class48.method367();
        class104.method862(29635);
        class115.method927();
        class27.method177(-30689);
        class120.method952();
        class42.method322(7170);
        class65.method567(128);
        class71.method599((byte) 12);
        class43.method324(768);
        class113.method912();
        class103.method857();
        class72.method604(-28828);
        class35.method279((byte) -100);
        class88.method729((byte) 81);
        class102.method848();
        class76.method660(2);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 497)
    public final void method131(byte arg0) {
        class34.field781++;
        field360++;
        this.method126(-637);
        class117.method935(false);
        class117.method939(108);
        class15.method99(1000);
        if (arg0 <= 108) {
            return;
        }
        class68.method583(24097);
        class112.method909(-8911);
        if (class110.field2787 == 0) {
            class47.method361(3);
            class55.method429((byte) -37);
        } else if (class110.field2787 == 5) {
            class47.method361(3);
            class55.method429((byte) -83);
        } else if (class110.field2787 == 10) {
            class10.method64(true);
        } else if (class110.field2787 == 20) {
            class10.method64(true);
            class10.method76(false);
        } else if (class110.field2787 == 25) {
            class110.method900(-1829);
        }
        if (class110.field2787 == 30) {
            class107.method876(-154057396);
        } else if (class110.field2787 == 35) {
            class107.method876(-154057396);
            return;
        } else if (class110.field2787 == 40) {
            class10.method76(false);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 556)
    public static void method132(byte arg0) {
        field380 = null;
        field377 = null;
        field375 = null;
        if (arg0 >= -40) {
            field361 = null;
        }
        field361 = null;
        field376 = null;
        field374 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lmc;", line = 591)
    public static final class75 method133(int arg0, byte arg1) {
        field363++;
        class75 var2 = class45.method345(22978, arg0);
        for (int var3 = var2.method621(-19198) - 3; var3 > 0; var3 -= 3) {
            var2 = class69.method586(new class75[] { var2.method647(0, 0, var3), class107.field2668, var2.method645(var3, (byte) 110) }, (byte) 79);
        }
        if (var2.method621(-19198) > 8) {
            var2 = class69.method586(new class75[] { class55.field1404, var2.method647(0, 0, var2.method621(-19198) - 8), class100.field2584, class34.field774, var2, class99.field2519 }, (byte) 52);
        } else if (var2.method621(arg1 - 19251) > 4) {
            var2 = class69.method586(new class75[] { class40.field972, var2.method647(arg1 ^ 0x35, 0, var2.method621(arg1 - 19251) - 4), class21.field400, class34.field774, var2, class99.field2519 }, (byte) 103);
        }
        if (arg1 != 53) {
            field380 = null;
        }
        return class69.method586(new class75[] { class71.field1805, var2 }, (byte) 24);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 639)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class92.method765(1);
            }
            class58.field1468 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class117.field2911 = 0;
            } else if (arg0[1].equals("office")) {
                class117.field2911 = 1;
            } else if (arg0[1].equals("local")) {
                class117.field2911 = 2;
            } else {
                class92.method765(1);
            }
            if (arg0[2].equals("live")) {
                class82.field2046 = 0;
            } else if (arg0[2].equals("rc")) {
                class82.field2046 = 1;
            } else if (arg0[2].equals("wip")) {
                class82.field2046 = 2;
            } else {
                class92.method765(1);
            }
            if (arg0[3].equals("lowmem")) {
                class23.method163(123);
            } else if (arg0[3].equals("highmem")) {
                class84.method694(-86);
            } else {
                class92.method765(1);
            }
            if (arg0[4].equals("free")) {
                class109.field2755 = false;
            } else if (arg0[4].equals("members")) {
                class109.field2755 = true;
            } else {
                class92.method765(1);
            }
            if (arg0[5].equals("english")) {
                class7.field109 = 0;
            } else if (arg0[5].equals("german")) {
                class57.method461(64);
                class7.field109 = 1;
            } else {
                class92.method765(1);
            }
            client var1 = new client();
            var1.method355(InetAddress.getLocalHost(), "runescape", class82.field2046 + 32, 419, 12, 765, 503, 50);
        } catch (Exception var3) {
            class114.method918(12541, null, var3);
        }
        field372++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 732)
    public final void method134(int arg0) {
        if (class40.field969 != null) {
            class40.field969.field1726 = false;
        }
        field366++;
        class40.field969 = null;
        if (class70.field1795 != null) {
            class70.field1795.method756(arg0 ^ 0xFFFFCAC7);
        }
        class36.method280(1552068359);
        class129.method1012(0);
        class117.method938(115);
        if (arg0 != -13691) {
            field381 = -53;
        }
        class16.method108(true);
        class42.method323((byte) 61);
        class107.method884((byte) 97);
        try {
            if (class68.field1740 != null) {
                class68.field1740.method673((byte) 126);
            }
            if (class37.field893 != null) {
                for (int var2 = 0; var2 < class37.field893.length; var2++) {
                    if (class37.field893[var2] != null) {
                        class37.field893[var2].method673((byte) -97);
                    }
                }
            }
            if (class31.field703 != null) {
                class31.field703.method673((byte) -127);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 807)
    private final void method135(int arg0, int arg1) {
        if (arg0 != 1000) {
            field374 = null;
        }
        class16.field304 = null;
        if (class112.field2841 == class100.field2593) {
            class112.field2841 = class79.field2004;
        } else {
            class112.field2841 = class100.field2593;
        }
        class13.field254++;
        class85.field2102 = null;
        field367++;
        field379 = 0;
        if (class13.field254 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class110.field2787 <= 5) {
                this.method358("js5connect_full", (byte) 76);
                class110.field2787 = 1000;
            } else {
                class97.field2436 = 3000;
            }
        } else if (class13.field254 >= 2 && arg1 == 6) {
            this.method358("js5connect_outofdate", (byte) 76);
            class110.field2787 = 1000;
        } else if (class13.field254 >= 4) {
            if (class110.field2787 > 5) {
                class97.field2436 = 3000;
            } else {
                this.method358("js5connect", (byte) 76);
                class110.field2787 = 1000;
            }
        }
    }
}
