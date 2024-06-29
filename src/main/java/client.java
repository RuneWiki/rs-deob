import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class110 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field398 = 0;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lrd;")
    public static class114 field401 = class84.method656("p12_full", (byte) 116);

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lrd;")
    public static class114 field406 = class84.method656("m", (byte) 124);

    @OriginalMember(owner = "client!client", name = "W", descriptor = "[S")
    public static short[] field397 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field409 = 99;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lgb;")
    public static class45 field399;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Ljd;")
    public static class66 field411;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
    public static boolean field400;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private static final void method142(Component arg0, int arg1) {
        field412++;
        arg0.removeKeyListener(class90.field2084);
        arg0.removeFocusListener(class90.field2084);
        int var2 = -64 / ((arg1 - 54) / 43);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method143(int arg0) {
        field413++;
        method145(-96);
        class114.method850(0);
        class110.method842(-15040);
        class34.method249(-10377);
        class66.method527((byte) -110);
        class28.method207(false);
        class60.method481(24480);
        class42.method296((byte) -90);
        class73.method597(17579);
        class10.method83(arg0 + 3);
        class22.method154(-18233);
        class8.method68((byte) -63);
        class131.method1057((byte) 65);
        class45.method336();
        class129.method1015();
        class89.method679(-123);
        class126.method977(arg0 + 37);
        class84.method649(arg0 + 7);
        class90.method686(arg0 + 23817);
        class135.method1106(0);
        class101.method779((byte) 126);
        class49.method356(true);
        class92.method709((byte) -69);
        class29.method210((byte) -83);
        class36.method256(-1);
        class98.method743(-1);
        class124.method963(arg0 ^ 0xFFFFFF96);
        class67.method534(65536);
        class25.method182(-125);
        class9.method73((byte) 114);
        class26.method202((byte) 125);
        class133.method1076();
        class71.method567();
        class72.method586((byte) 125);
        class58.method422((byte) 66);
        class5.method52(arg0 ^ 0xFFFFFFFC);
        class85.method657(arg0 ^ 0xFFFFFF93);
        class75.method609(-118);
        class109.method825(arg0 ^ 0xFFFFD6E8);
        class50.method358(false);
        class122.method949(63);
        class11.method86((byte) 122);
        class111.method845((byte) -51);
        class88.method665(9380);
        class94.method727();
        class140.method1116(77);
        class39.method277(true);
        class99.method748((byte) -104);
        class64.method518(arg0 ^ 0xFFFFFFDD);
        class100.method760(arg0 ^ arg0);
        class21.method138(arg0 ^ 0xFFFFFFFD);
        class78.method617((byte) 4);
        class31.method227((byte) 4);
        class48.method348((byte) -60);
        class46.method342(8);
        class121.method945((byte) -110);
        class13.method112((byte) -116);
        class128.method987((byte) -110);
        class80.method634(-627);
        class134.method1097();
        class59.method440();
        class77.method612((byte) 14);
        class18.method126(91);
        class102.method789((byte) -85);
        class55.method407((byte) -32);
        class117.method904(256);
        class141.method1128((byte) -114);
        class12.method104(true);
        class52.method372(128);
        class1.method5(16711680);
        class62.method502(true);
        class116.method898(-93);
        class86.method662(-15421);
        class79.method627((byte) 12);
        class144.method1141((byte) -113);
        class108.method824();
        class70.method557((byte) -20);
        class32.method232((byte) -121);
        class51.method360(true);
        class63.method514(arg0 - 14062);
        class132.method1060(true);
        class65.method524(15310);
        class142.method1135(-8185);
        class112.method846(18818);
        class16.method124(0);
        class68.method543();
        class69.method546((byte) -128);
        class127.method986(arg0 + 78);
        class145.method1149(48);
        class20.method133(arg0 + 2);
        class130.method1044(arg0 ^ 0xFFFFFFF8);
        class96.method734(true);
        class123.method957((byte) -101);
        class137.method1112(true);
        class103.method794((byte) -32);
        class38.method276((byte) -42);
        class47.method345(25);
        class107.method815((byte) -120);
        class14.method114((byte) 84);
        class82.method639(112);
        class61.method499(arg0 + 32770);
        class3.method9(arg0 ^ 0xFFFF8D67);
        class6.method60();
        class7.method62(arg0 ^ 0x1D1);
        class41.method288();
        class56.method415((byte) -119);
        class40.method286();
        class74.method607(false);
        class125.method971(true);
        class118.method917(arg0 ^ 0x21B8);
        class106.method813(arg0 + 13405);
        class37.method265();
        class97.method738();
        class143.method1140(true);
        class120.method937((byte) -25);
        class104.method807(3);
        class119.method926();
        class24.method174(true);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method144(int arg0) {
        field410++;
        if (class49.field1013) {
            method142(class114.field2678, -121);
            class56.method416(196, class114.field2678);
            if (class118.field2775 != null) {
                class118.field2775.method729(-1, class114.field2678);
            }
            this.method831((byte) 75);
            class66.method531(class114.field2678, -100);
            class143.method1139(50, class114.field2678);
            if (class118.field2775 != null) {
                class118.field2775.method730(81, class114.field2678);
            }
        }
        if (class77.field1764 == 0) {
            class67.method541(null, class114.field2668, class42.field858, -3857);
        } else if (class77.field1764 == 5) {
            class124.method960(class29.field609, field399, 1);
        } else if (class77.field1764 == 10) {
            class124.method960(class29.field609, field399, 1);
        } else if (class77.field1764 == 20) {
            class124.method960(class29.field609, field399, 1);
        } else if (class77.field1764 == 25) {
            if (class141.field3368 == 1) {
                if (class56.field1183 < class22.field431) {
                    class56.field1183 = class22.field431;
                }
                int var2 = (class56.field1183 - class22.field431) * 50 / class56.field1183;
                class90.method694(0, class101.method786((byte) 127, new class114[] { class100.field2288, class14.method113(var2, -31766), class132.field3198 }), true, class117.field2753);
            } else if (class141.field3368 == 2) {
                if (class25.field495 < class52.field1078) {
                    class25.field495 = class52.field1078;
                }
                int var3 = (class25.field495 - class52.field1078) * 50 / class25.field495 + 50;
                class90.method694(0, class101.method786((byte) 127, new class114[] { class100.field2288, class14.method113(var3, -31766), class132.field3198 }), true, class117.field2753);
            } else {
                class90.method694(0, null, false, class117.field2753);
            }
        } else if (class77.field1764 == 30) {
            class69.method552((byte) 92);
        } else if (class77.field1764 == 35) {
            class118.method918(true);
        } else if (class77.field1764 == 40) {
            class90.method694(0, class145.field3451, false, class77.field1755);
        }
        class144.field3416 = 0;
        int var4 = 13 / ((arg0 + 36) / 62);
        class62.field1320 = 0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method145(int arg0) {
        field399 = null;
        field397 = null;
        field401 = null;
        field411 = null;
        if (arg0 < -39) {
            field406 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class11.method87((byte) 11);
            }
            class117.field2741 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class56.field1176 = 0;
            } else if (arg0[1].equals("office")) {
                class56.field1176 = 1;
            } else if (arg0[1].equals("local")) {
                class56.field1176 = 2;
            } else {
                class11.method87((byte) 11);
            }
            if (arg0[2].equals("live")) {
                class78.field1770 = 0;
            } else if (arg0[2].equals("rc")) {
                class78.field1770 = 1;
            } else if (arg0[2].equals("wip")) {
                class78.field1770 = 2;
            } else {
                class11.method87((byte) 11);
            }
            if (arg0[3].equals("lowmem")) {
                class26.method198(126);
            } else if (arg0[3].equals("highmem")) {
                class70.method559(-107);
            } else {
                class11.method87((byte) 11);
            }
            if (arg0[4].equals("free")) {
                class135.field3292 = false;
            } else if (arg0[4].equals("members")) {
                class135.field3292 = true;
            } else {
                class11.method87((byte) 11);
            }
            if (arg0[5].equals("english")) {
                class46.field941 = 0;
            } else if (arg0[5].equals("german")) {
                class123.method958(-1);
                class46.field941 = 1;
            } else {
                class11.method87((byte) 11);
            }
            client var1 = new client();
            var1.method833(449, 14, 765, (byte) 120, 503, "runescape", class78.field1770 + 32, InetAddress.getLocalHost());
        } catch (Exception var3) {
            class121.method943((byte) -125, var3, null);
        }
        field402++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private static final void method146(byte arg0) {
        field418++;
        if (class63.field1340 != null) {
            class39 var1 = class63.field1340;
            synchronized (class63.field1340) {
                class63.field1340 = null;
            }
        }
        if (arg0 < 116) {
            method146((byte) 102);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method147(byte arg0) {
        class20.field370++;
        this.method151(-1001);
        field419++;
        if (arg0 < 30) {
            return;
        }
        class98.method742(-122);
        class78.method626((byte) 69);
        class122.method954(1000);
        class110.method832((byte) 20);
        class126.method980(49);
        if (class118.field2775 != null) {
            int var2 = class118.field2775.method728(false);
            class20.field352 = var2;
            class144.field3416 += var2;
        }
        if (class77.field1764 == 0) {
            class7.method63((byte) -64);
            class3.method13((byte) -16);
        } else if (class77.field1764 == 5) {
            class7.method63((byte) -64);
            class3.method13((byte) -16);
        } else if (class77.field1764 == 10) {
            class123.method959((byte) -127);
        } else if (class77.field1764 == 20) {
            class123.method959((byte) -67);
            class110.method830((byte) -80);
        } else if (class77.field1764 == 25) {
            class72.method583(255);
        }
        if (class77.field1764 == 30) {
            class63.method517((byte) -124);
        } else if (class77.field1764 == 35) {
            class63.method517((byte) -69);
            return;
        } else if (class77.field1764 == 40) {
            class110.method830((byte) -80);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field416++;
        if (!this.method836(14)) {
            return;
        }
        class117.field2741 = Integer.parseInt(this.getParameter("worldid"));
        class78.field1770 = Integer.parseInt(this.getParameter("modewhat"));
        class56.field1176 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class26.method198(-39);
        } else {
            class70.method559(-107);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class135.field3292 = true;
        } else {
            class135.field3292 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class123.method958(-1);
            class46.field941 = 1;
        }
        this.method840(765, class78.field1770 + 32, 503, 14, 449);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method148(int arg0, int arg1) {
        class49.field1022 = 0;
        if (arg0 > -4) {
            return;
        }
        class32.field660 = null;
        field407++;
        if (class60.field1241 == class127.field3044) {
            class127.field3044 = class86.field1929;
        } else {
            class127.field3044 = class60.field1241;
        }
        class74.field1666++;
        class63.field1355 = null;
        if (class74.field1666 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class77.field1764 <= 5) {
                this.method841(77, "js5connect_full");
                class77.field1764 = 1000;
            } else {
                class39.field831 = 3000;
            }
        } else if (class74.field1666 >= 2 && arg1 == 6) {
            this.method841(77, "js5connect_outofdate");
            class77.field1764 = 1000;
        } else if (class74.field1666 >= 4) {
            if (class77.field1764 <= 5) {
                this.method841(77, "js5connect");
                class77.field1764 = 1000;
            } else {
                class39.field831 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method149(byte arg0) {
        class60.field1241 = class56.field1176 == 0 ? 43594 : class117.field2741 + 40000;
        class127.field3044 = class60.field1241;
        field414++;
        class86.field1929 = class56.field1176 == 0 ? 443 : class117.field2741 + 50000;
        class9.method72((byte) 123);
        class66.method531(class114.field2678, -13);
        class143.method1139(50, class114.field2678);
        class118.field2775 = class107.method817(53);
        if (class118.field2775 != null) {
            class118.field2775.method730(105, class114.field2678);
        }
        class109.field2508 = class43.field889;
        int var2 = -46 % ((arg0 + 33) / 37);
        try {
            if (class36.field764.field886 != null) {
                class8.field106 = new class10(class36.field764.field886, 5200, 0);
                for (int var3 = 0; var3 < 14; var3++) {
                    class25.field505[var3] = new class10(class36.field764.field890[var3], 6000, 0);
                }
                class55.field1158 = new class10(class36.field764.field892, 6000, 0);
                class69.field1514 = new class22(255, class8.field106, class55.field1158, 500000);
                class36.field764.field892 = null;
                class36.field764.field886 = null;
                class36.field764.field890 = null;
            }
        } catch (IOException var4) {
            class55.field1158 = null;
            class69.field1514 = null;
            class8.field106 = null;
        }
        if (class56.field1176 != 0) {
            class122.field2850 = true;
        }
        class142.field3379 = new class90();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
    public static final boolean method150(int arg0, int arg1) {
        field404++;
        if (!class1.method1(arg1, arg0)) {
            return false;
        }
        boolean var2 = false;
        class90[] var3 = class78.field1772[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class90 var5 = var3[var4];
            if (var5 != null && var5.field2024 == 6) {
                if (var5.field2022 != -1 || var5.field2050 != -1) {
                    boolean var6 = class98.method740(-118, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field2050;
                    } else {
                        var7 = var5.field2022;
                    }
                    if (var7 != -1) {
                        class29 var8 = class12.method97(var7, false);
                        var5.field2007 += class135.field3289;
                        label53: while (true) {
                            do {
                                do {
                                    if (var8.field605[var5.field2042] >= var5.field2007) {
                                        break label53;
                                    }
                                    var2 = true;
                                    var5.field2007 -= var8.field605[var5.field2042];
                                    var5.field2042++;
                                } while (var5.field2042 < var8.field607.length);
                                var5.field2042 -= var8.field602;
                            } while (var5.field2042 >= 0 && var5.field2042 < var8.field607.length);
                            var5.field2042 = 0;
                        }
                    }
                }
                if (var5.field2096 != 0 && !var5.field2011) {
                    var2 = true;
                    int var9 = var5.field2096 >> 16;
                    int var10 = class135.field3289 * var9;
                    var5.field2117 = var5.field2117 + var10 & 0x7FF;
                    int var11 = var5.field2096 << 16 >> 16;
                    int var12 = class135.field3289 * var11;
                    var5.field2127 = var5.field2127 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method151(int arg0) {
        field408++;
        if (~class77.field1764 != arg0) {
            boolean var2 = class117.method906(true);
            if (!var2) {
                this.method153(arg0 ^ 0xFFFFFC73);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method152(int arg0) {
        field405++;
        if (class49.field1028 != null) {
            class49.field1028.field552 = false;
        }
        class49.field1028 = null;
        if (class18.field343 != null) {
            class18.field343.method292(arg0 + 25830);
            class18.field343 = null;
        }
        class132.method1063(-17);
        method146((byte) 120);
        class118.field2775 = null;
        class78.method623((byte) -104);
        class70.method560(arg0 - 104);
        class132.method1062(-29025);
        if (arg0 != 0) {
            method145(41);
        }
        class34.method247(30770);
        try {
            if (class8.field106 != null) {
                class8.field106.method82((byte) -121);
            }
            if (class25.field505 != null) {
                for (int var2 = 0; var2 < class25.field505.length; var2++) {
                    if (class25.field505[var2] != null) {
                        class25.field505[var2].method82((byte) -121);
                    }
                }
            }
            if (class55.field1158 != null) {
                class55.field1158.method82((byte) -121);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method153(int arg0) {
        field403++;
        if (class55.field1145 >= 4) {
            this.method841(77, "js5crc");
            class77.field1764 = 1000;
            return;
        }
        if (class13.field295 >= 4) {
            if (class77.field1764 <= 5) {
                this.method841(77, "js5io");
                class77.field1764 = 1000;
                return;
            }
            class13.field295 = 3;
            class39.field831 = 3000;
        }
        if (class39.field831-- > 0) {
            return;
        }
        try {
            if (class49.field1022 == 0) {
                class63.field1355 = class36.field764.method304(0, class127.field3044);
                class49.field1022++;
            }
            if (class49.field1022 == 1) {
                if (class63.field1355.field1826 == 2) {
                    this.method148(-22, -1);
                    return;
                }
                if (class63.field1355.field1826 == 1) {
                    class49.field1022++;
                }
            }
            if (class49.field1022 == 2) {
                class32.field660 = new class42((Socket) class63.field1355.field1823, class36.field764);
                class60 var2 = new class60(5);
                var2.method478((byte) 104, 15);
                var2.method476(-7155, 449);
                class32.field660.method290(false, 5, 0, var2.field1248);
                class49.field1022++;
                class32.field655 = class99.method747(0);
            }
            if (class49.field1022 == 3) {
                if (class77.field1764 <= 5 || class32.field660.method289((byte) -82) > 0) {
                    int var3 = class32.field660.method297(116);
                    if (var3 != 0) {
                        this.method148(-125, var3);
                        return;
                    }
                    class49.field1022++;
                } else if (class99.method747(0) - class32.field655 > 30000L) {
                    this.method148(-20, -2);
                    return;
                }
            }
            if (class49.field1022 == 4) {
                class60.method474((byte) -94, class77.field1764 > 20, class32.field660);
                class49.field1022 = 0;
                class32.field660 = null;
                class63.field1355 = null;
                class74.field1666 = 0;
            }
        } catch (IOException var4) {
            this.method148(-116, -3);
        }
        if (arg0 < 91) {
            field415 = 20;
        }
    }
}
