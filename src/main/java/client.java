import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class136 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lrd;")
    public static class117 field617 = class95.method812("(U", (byte) 8);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field624 = 0;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lrd;")
    private static class117 field626 = class95.method812("wishes to trade with you)3", (byte) 8);

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lrd;")
    public static class117 field618 = class95.method812("0(U", (byte) 8);

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lrd;")
    public static class117 field610 = field626;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lrd;")
    private static class117 field609 = class95.method812("Please wait )2 attempting to reestablish", (byte) 8);

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lrd;")
    public static class117 field627 = field609;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "J")
    public static long field619 = 0L;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
    public static int[] field630 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lrd;")
    private static class117 field631 = class95.method812("No matching objects found)1 please shorten search", (byte) 8);

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lrd;")
    public static class117 field628 = field631;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public static void method236(int arg0) {
        field610 = null;
        if (arg0 > -52) {
            return;
        }
        field631 = null;
        field618 = null;
        field617 = null;
        field627 = null;
        field630 = null;
        field609 = null;
        field626 = null;
        field628 = null;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field629++;
        if (!this.method1104(-95)) {
            return;
        }
        class138.field3317 = Integer.parseInt(this.getParameter("worldid"));
        class35.field1045 = Integer.parseInt(this.getParameter("modewhat"));
        class148.field3633 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class40.method464((byte) -22);
        } else {
            class147.method1184((byte) 61);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class33.field986 = true;
        } else {
            class33.field986 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class124.method1002(-24);
            class72.field2022 = 1;
        }
        this.method1108(765, 503, 452, class35.field1045 + 32, 0);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)I")
    public static final int method237(byte arg0) {
        if (arg0 < 42) {
            method237((byte) -49);
        }
        field614++;
        return 19;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class97.method831(1);
            }
            class138.field3317 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class148.field3633 = 0;
            } else if (arg0[1].equals("office")) {
                class148.field3633 = 1;
            } else if (arg0[1].equals("local")) {
                class148.field3633 = 2;
            } else {
                class97.method831(1);
            }
            if (arg0[2].equals("live")) {
                class35.field1045 = 0;
            } else if (arg0[2].equals("rc")) {
                class35.field1045 = 1;
            } else if (arg0[2].equals("wip")) {
                class35.field1045 = 2;
            } else {
                class97.method831(1);
            }
            if (arg0[3].equals("lowmem")) {
                class40.method464((byte) -22);
            } else if (arg0[3].equals("highmem")) {
                class147.method1184((byte) 61);
            } else {
                class97.method831(1);
            }
            if (arg0[4].equals("free")) {
                class33.field986 = false;
            } else if (arg0[4].equals("members")) {
                class33.field986 = true;
            } else {
                class97.method831(1);
            }
            if (arg0[5].equals("english")) {
                class72.field2022 = 0;
            } else if (arg0[5].equals("german")) {
                class124.method1002(-98);
                class72.field2022 = 1;
            } else {
                class97.method831(1);
            }
            client var1 = new client();
            var1.method1111(503, false, "runescape", 16, InetAddress.getLocalHost(), 765, 452, class35.field1045 + 32);
        } catch (Exception var3) {
            class109.method897(-8638, var3, null);
        }
        field622++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILrd;IIIILrd;)V")
    public static final void method238(int arg0, class117 arg1, int arg2, int arg3, int arg4, int arg5, class117 arg6) {
        field611++;
        if (class21.field604 < 500) {
            if (arg1.method954(-72) > 0) {
                class35.field1051[class21.field604] = class18.method193(new class117[] { arg6, class37.field1070, arg1 }, 105);
            } else {
                class35.field1051[class21.field604] = arg6;
            }
            class79.field2119[class21.field604] = arg5;
            class94.field2360[class21.field604] = arg2;
            class68.field1932[class21.field604] = arg4;
            class148.field3610[class21.field604] = arg0;
            class21.field604++;
        }
        int var7 = -109 % ((-arg3 - 39) / 62);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method239(byte arg0) {
        class85.field2236++;
        field632++;
        this.method244(arg0 ^ 0xFFFFD2A4);
        class63.method639(18110);
        class65.method653((byte) -37);
        class49.method544((byte) 106);
        class73.method695(false);
        class144.method1145(3);
        if (class45.field1263 != null) {
            int var2 = class45.field1263.method838(-10813);
            class39.field1133 = var2;
            class86.field2251 += var2;
        }
        if (class52.field1464 == 0) {
            class104.method861(true);
            class94.method809(0);
        } else if (class52.field1464 == 5) {
            class52.method573(127);
            class104.method861(true);
            class94.method809(0);
        } else if (class52.field1464 == 10) {
            class52.method573(-62);
        } else if (class52.field1464 == 20) {
            class52.method573(arg0 ^ 0xFFFFFFEB);
            class26.method281(arg0 ^ 0x4B5A);
        } else if (class52.field1464 == 25) {
            class74.method704(arg0 + 80);
        }
        if (class52.field1464 == 30) {
            class127.method1010(-106);
        } else if (class52.field1464 == 35) {
            class127.method1010(-113);
        } else if (class52.field1464 == 40) {
            class26.method281(-19250);
        }
        if (arg0 != -108) {
            field630 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method240(byte arg0) {
        class117.field2892 = class148.field3633 == 0 ? 443 : class138.field3317 + 50000;
        class58.field1610 = class148.field3633 == 0 ? 43594 : class138.field3317 + 40000;
        class2.field37 = class58.field1610;
        class52.method564((byte) -120);
        class74.method705(class42.field1216, (byte) 88);
        class60.method613(class42.field1216, true);
        class45.field1263 = class22.method249(0);
        if (class45.field1263 != null) {
            class45.field1263.method839(class42.field1216, true);
        }
        field615++;
        class124.field3005 = class9.field195;
        try {
            if (arg0 < 52) {
                field631 = null;
            }
            if (class4.field104.field200 != null) {
                class134.field3200 = new class148(class4.field104.field200, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class60.field1695[var2] = new class148(class4.field104.field190[var2], 6000, 0);
                }
                class49.field1436 = new class148(class4.field104.field186, 6000, 0);
                class35.field1050 = new class92(255, class134.field3200, class49.field1436, 500000);
                class4.field104.field190 = null;
                class4.field104.field186 = null;
                class4.field104.field200 = null;
            }
        } catch (IOException var3) {
            class35.field1050 = null;
            class49.field1436 = null;
            class134.field3200 = null;
        }
        if (class148.field3633 != 0) {
            class32.field969 = true;
        }
        class61.field1708 = new class144();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method241(int arg0, int arg1) {
        if (arg1 != 1000) {
            this.init();
        }
        field612++;
        class22.field638++;
        if (class58.field1610 == class2.field37) {
            class2.field37 = class117.field2892;
        } else {
            class2.field37 = class58.field1610;
        }
        class84.field2192 = 0;
        class65.field1862 = null;
        class97.field2437 = null;
        if (class22.field638 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class52.field1464 > 5) {
                class107.field2664 = 3000;
            } else {
                this.method1106("js5connect_full", 97);
                class52.field1464 = 1000;
            }
        } else if (class22.field638 >= 2 && arg0 == 6) {
            this.method1106("js5connect_outofdate", -110);
            class52.field1464 = 1000;
        } else if (class22.field638 >= 4) {
            if (class52.field1464 <= 5) {
                this.method1106("js5connect", arg1 - 964);
                class52.field1464 = 1000;
            } else {
                class107.field2664 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method242(int arg0) {
        field623++;
        method236(-79);
        class117.method971(-106);
        class136.method1110((byte) 126);
        class141.method1128((byte) -87);
        class44.method483((byte) 1);
        class80.method747((byte) 119);
        class14.method131(3);
        class83.method751(25);
        class7.method49(-3);
        class148.method1203((byte) 57);
        class92.method801(-85);
        class36.method447(4);
        class77.method738((byte) 121);
        class19.method206();
        class30.method331();
        class52.method562(-1);
        class101.method853(true);
        class1.method8(true);
        class144.method1142(false);
        class99.method841((byte) -127);
        class2.method26(false);
        class20.method224(-30516);
        class74.method700(-25137);
        class32.method383(0);
        class46.method500(6634);
        class25.method271(-2);
        class132.method1086((byte) 79);
        class17.method184((byte) -89);
        class73.method690(-27531);
        class35.method444((byte) -109);
        class93.method805(false);
        class85.method768(84);
        class28.method302();
        class11.method94();
        class5.method35(false);
        class111.method915(1640);
        class43.method482(-103);
        class108.method892(119);
        class38.method455(false);
        class142.method1134(-107);
        class60.method612((byte) 72);
        class33.method388(1);
        class57.method597(107);
        class37.method452(1239);
        class64.method644(2129);
        class69.method674();
        class119.method982(83);
        class71.method685(2);
        class105.method874((byte) -79);
        class124.method999((byte) 114);
        if (arg0 >= -10) {
            field619 = 76L;
        }
        class47.method528(0);
        class42.method475(96);
        class118.method978(1000);
        class128.method1020(28303);
        class4.method34(-31985);
        class39.method459(0);
        class65.method651(true);
        class18.method195((byte) 24);
        class134.method1098((byte) -98);
        class109.method902((byte) 120);
        class138.method1118(0);
        class94.method808((byte) 77);
        class129.method1052();
        class145.method1170();
        class63.method640((byte) -63);
        class84.method758(10804);
        class102.method854(0);
        class131.method1080();
        class110.method905(11);
        class68.method667(500);
        class16.method178(1716);
        class104.method864((byte) 110);
        class26.method279(0);
        class96.method824((byte) 26);
        class62.method626(-79);
        class49.method538((byte) 24);
        class66.method658(1);
        class87.method781(-16209);
        class40.method467(102);
        class127.method1013(765);
        class23.method254((byte) -32);
        class137.method1116(24);
        class51.method559();
        class13.method106(-10227);
        class24.method258(0);
        class140.method1125((byte) 107);
        class22.method252(0);
        class45.method490(false);
        class120.method986(0);
        class61.method619(80);
        class79.method744(94);
        class147.method1190(0);
        class3.method29();
        class53.method585(-18445);
        class107.method885((byte) 66);
        class56.method595((byte) -119);
        class54.method588((byte) 58);
        class116.method933(6628);
        class135.method1100(-357);
        class58.method599(128);
        class6.method43(true);
        class121.method989(32);
        class41.method474(0);
        class95.method813((byte) -98);
        class90.method796(-96);
        class100.method848(50);
        class21.method232(-16);
        class15.method174(false);
        class143.method1136(-15736);
        class112.method918();
        class98.method832();
        class133.method1087(true);
        class125.method1004();
        class115.method931(false);
        class29.method316();
        class59.method608(0);
        class27.method283(true);
        class67.method665(112);
        class72.method688((byte) 121);
        class146.method1176();
        class70.method682();
        class86.method775((byte) 105);
        class97.method829(true);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method243(byte arg0) {
        field616++;
        if (class64.field1831 >= 4) {
            this.method1106("js5crc", -125);
            class52.field1464 = 1000;
            return;
        }
        if (class74.field2070 >= 4) {
            if (class52.field1464 <= 5) {
                this.method1106("js5io", 91);
                class52.field1464 = 1000;
                return;
            }
            class107.field2664 = 3000;
            class74.field2070 = 3;
        }
        if (class107.field2664-- > 0) {
            return;
        }
        try {
            if (class84.field2192 == 0) {
                class65.field1862 = class4.field104.method62(class2.field37, 17266);
                class84.field2192++;
            }
            if (class84.field2192 == 1) {
                if (class65.field1862.field940 == 2) {
                    this.method241(-1, 1000);
                    return;
                }
                if (class65.field1862.field940 == 1) {
                    class84.field2192++;
                }
            }
            if (class84.field2192 == 2) {
                class97.field2437 = new class83((Socket) class65.field1862.field937, class4.field104);
                class14 var2 = new class14(5);
                var2.method162(15, -23339);
                var2.method124(452, 0);
                class97.field2437.method754(0, (byte) 59, 5, var2.field326);
                class84.field2192++;
                class104.field2606 = class105.method875((byte) -80);
            }
            if (arg0 > 12) {
                if (class84.field2192 == 3) {
                    if (class52.field1464 <= 5 || class97.field2437.method757(true) > 0) {
                        int var3 = class97.field2437.method752((byte) 94);
                        if (var3 != 0) {
                            this.method241(var3, 1000);
                            return;
                        }
                        class84.field2192++;
                    } else if (class105.method875((byte) -80) - class104.field2606 > 30000L) {
                        this.method241(-2, 1000);
                        return;
                    }
                }
                if (class84.field2192 == 4) {
                    class32.method382(class52.field1464 > 20, 0, class97.field2437);
                    class97.field2437 = null;
                    class84.field2192 = 0;
                    class22.field638 = 0;
                    class65.field1862 = null;
                }
            }
        } catch (IOException var4) {
            this.method241(-3, 1000);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method244(int arg0) {
        if (arg0 != 11568) {
            field626 = null;
        }
        field625++;
        if (class52.field1464 != 1000) {
            boolean var2 = class111.method916(-56);
            if (!var2) {
                this.method243((byte) 20);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method245(boolean arg0) {
        field621++;
        boolean var2 = class23.method257(101);
        if (var2 && class71.field1984 && class61.field1723 != null) {
            class61.field1723.method228((byte) 104);
        }
        if (class56.field1572) {
            class16.method183(21057, class42.field1216);
            class111.method917(class42.field1216, (byte) -55);
            if (class45.field1263 != null) {
                class45.field1263.method845(class42.field1216, 25384);
            }
            this.method1105(true);
            class74.method705(class42.field1216, (byte) 99);
            class60.method613(class42.field1216, true);
            if (class45.field1263 != null) {
                class45.field1263.method839(class42.field1216, true);
            }
        }
        if (class52.field1464 == 0) {
            class5.method41(class52.field1474, class56.field1560, null, -55);
        } else if (class52.field1464 == 5) {
            class1.method6(class109.field2731, -77, class137.field3305);
        } else if (class52.field1464 == 10) {
            class1.method6(class109.field2731, -122, class137.field3305);
        } else if (class52.field1464 == 20) {
            class1.method6(class109.field2731, -83, class137.field3305);
        } else if (class52.field1464 == 25) {
            if (class142.field3367 == 1) {
                if (class59.field1642 < class1.field12) {
                    class59.field1642 = class1.field12;
                }
                int var3 = (class59.field1642 - class1.field12) * 50 / class59.field1642;
                class110.method910(true, class18.method193(new class117[] { class111.field2786, class142.method1131(var3, true), class41.field1199 }, 104), 122, class133.field3194);
            } else if (class142.field3367 == 2) {
                if (class59.field1637 > class90.field2306) {
                    class90.field2306 = class59.field1637;
                }
                int var4 = (class90.field2306 - class59.field1637) * 50 / class90.field2306 + 50;
                class110.method910(true, class18.method193(new class117[] { class111.field2786, class142.method1131(var4, true), class41.field1199 }, 51), -115, class133.field3194);
            } else {
                class110.method910(false, null, -48, class133.field3194);
            }
        } else if (class52.field1464 == 30) {
            class26.method280(0);
        } else if (class52.field1464 == 35) {
            class147.method1188(false);
        } else if (class52.field1464 == 40) {
            class110.method910(false, field627, 126, class144.field3512);
        }
        class14.field336 = 0;
        class86.field2251 = 0;
        if (!arg0) {
            field627 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method246(boolean arg0) {
        field620++;
        if (class2.field42 != null) {
            class2.field42.field2127 = false;
        }
        class2.field42 = null;
        if (class119.field2923 != null) {
            class119.field2923.method755(-2);
            class119.field2923 = null;
        }
        class24.method260(20068);
        class58.method602(true);
        class45.field1263 = null;
        if (class61.field1723 != null) {
            class61.field1723.method226((byte) -68);
        }
        if (arg0) {
            this.init();
        }
        if (class116.field2830 != null) {
            class116.field2830.method226((byte) -81);
        }
        class32.method376(4);
        class2.method19((byte) 75);
        try {
            if (class134.field3200 != null) {
                class134.field3200.method1205(28248);
            }
            if (class60.field1695 != null) {
                for (int var2 = 0; var2 < class60.field1695.length; var2++) {
                    if (class60.field1695[var2] != null) {
                        class60.field1695[var2].method1205(28248);
                    }
                }
            }
            if (class49.field1436 != null) {
                class49.field1436.method1205(28248);
            }
        } catch (IOException var3) {
        }
    }
}
