import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class27 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lja;")
    public static class62 field480 = class30.method243(43, "<col=ffff00>");

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
    public static boolean field494 = false;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "J")
    public static long field488 = 0L;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field497 = -1;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lja;")
    private static class62 field484 = class30.method243(43, "Please try using a different world)3");

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lja;")
    public static class62 field490 = field484;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lja;")
    private static class62 field502 = class30.method243(43, "Sorry invited players only)3");

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lja;")
    public static class62 field498 = field484;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lja;")
    public static class62 field483 = field484;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field508 = 50;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lja;")
    public static class62 field493 = field484;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lja;")
    public static class62 field499 = field502;

    @OriginalMember(owner = "client!client", name = "B", descriptor = "Lja;")
    private static class62 field476 = class30.method243(43, "Members object");

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lja;")
    public static class62 field491 = field484;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lja;")
    public static class62 field510 = field484;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Lja;")
    public static class62 field507 = field476;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lpd;")
    public static class108 field505;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method153(int arg0) {
        field486++;
        boolean var2 = class144.method1137((byte) -16);
        if (var2 && class56.field1383 && class85.field2036 != null) {
            class85.field2036.method396(906);
        }
        if (class103.field2406) {
            class136.method1092(0, class9.field240);
            method154(0, class9.field240);
            if (class135.field3122 != null) {
                class135.field3122.method324(class9.field240, 15);
            }
            this.method214(789980720);
            class134.method1071(class9.field240, (byte) 84);
            class111.method907(256, class9.field240);
            if (class135.field3122 != null) {
                class135.field3122.method322(false, class9.field240);
            }
        }
        if (class103.field2405 == 0) {
            class22.method173(class83.field2005, class7.field208, 2, null);
        } else if (class103.field2405 == 5) {
            class53.method363(382, class70.field1789, class65.field1611);
        } else if (class103.field2405 == 10) {
            class53.method363(382, class70.field1789, class65.field1611);
        } else if (class103.field2405 == 20) {
            class53.method363(382, class70.field1789, class65.field1611);
        } else if (class103.field2405 == 25) {
            if (class88.field2096 == 1) {
                if (class110.field2521 < class80.field1945) {
                    class110.field2521 = class80.field1945;
                }
                int var3 = (class110.field2521 - class80.field1945) * 50 / class110.field2521;
                class122.method964(class70.method594(new class62[] { class43.field991, class28.field685, class31.method249(true, var3), class68.field1700 }, 1229), -13897, false);
            } else if (class88.field2096 == 2) {
                if (class132.field3009 > class130.field2973) {
                    class130.field2973 = class132.field3009;
                }
                int var4 = (class130.field2973 - class132.field3009) * 50 / class130.field2973 + 50;
                class122.method964(class70.method594(new class62[] { class43.field991, class28.field685, class31.method249(true, var4), class68.field1700 }, 1229), -13897, false);
            } else {
                class122.method964(class43.field991, -13897, false);
            }
        } else if (class103.field2405 == 30) {
            class150.method1185(false);
        } else if (class103.field2405 == 40) {
            class122.method964(class70.method594(new class62[] { class147.field3457, class79.field1931, class30.field743 }, 1229), -13897, false);
        }
        if (arg0 > -12) {
            method161(-103, null, true, -111);
        }
        if (class103.field2405 == 30 && class1.field11 == 0 && !class67.field1672) {
            try {
                Graphics var7 = class9.field240.getGraphics();
                for (int var8 = 0; var8 < class102.field2371; var8++) {
                    if (class134.field3070[var8]) {
                        class105.field2419.method84(class13.field313[var8], class34.field824[var8], -16711936, class130.field2979[var8], class111.field2558[var8], var7);
                        class134.field3070[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class9.field240.repaint();
            }
        } else if (class103.field2405 > 0) {
            try {
                Graphics var5 = class9.field240.getGraphics();
                class105.field2419.method83(0, (byte) -119, var5, 0);
                class67.field1672 = false;
                for (int var6 = 0; var6 < class102.field2371; var6++) {
                    class134.field3070[var6] = false;
                }
            } catch (Exception var10) {
                class9.field240.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private static final void method154(int arg0, Component arg1) {
        arg1.removeMouseListener(class70.field1788);
        arg1.removeMouseMotionListener(class70.field1788);
        arg1.removeFocusListener(class70.field1788);
        class86.field2062 = arg0;
        field478++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field479++;
        if (!this.method215(0)) {
            return;
        }
        class59.field1449 = Integer.parseInt(this.getParameter("worldid"));
        class15.field356 = Integer.parseInt(this.getParameter("modewhat"));
        class4.field39 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class83.method646((byte) -125);
        } else {
            class119.method950(104);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class121.field2768 = true;
        } else {
            class121.field2768 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class135.method1085(-101);
            class83.field1999 = class105.field2444;
            class52.field1189 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class113.field2604 = 1;
        } else {
            class113.field2604 = 0;
        }
        try {
            class70.field1796 = Integer.parseInt(this.getParameter("js"));
            class128.field2901 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class38.field893 = this.getCodeBase().getHost();
        this.method220(765, 460, 503, (byte) 105, class15.field356 + 32);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static void method155(byte arg0) {
        field507 = null;
        if (arg0 != -17) {
            return;
        }
        field491 = null;
        field484 = null;
        field490 = null;
        field502 = null;
        field510 = null;
        field476 = null;
        field493 = null;
        field498 = null;
        field505 = null;
        field483 = null;
        field499 = null;
        field480 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method156(int arg0) {
        class86.field2060++;
        this.method159(arg0 ^ 0x3E2);
        class47.method331(true);
        if (arg0 != 10) {
            this.method164(39);
        }
        class148.method1179(105);
        field482++;
        class147.method1173((byte) 10);
        class151.method1189((byte) 87);
        class135.method1081(0);
        if (class135.field3122 != null) {
            int var2 = class135.field3122.method323(80);
            class100.field2324 = var2;
        }
        if (class103.field2405 == 0) {
            class38.method291(4);
            class82.method642(-23891);
        } else if (class103.field2405 == 5) {
            class108.method882(arg0 - 32529, this);
            class38.method291(4);
            class82.method642(arg0 - 23901);
        } else if (class103.field2405 == 10) {
            class108.method882(arg0 ^ 0xFFFF80F3, this);
        } else if (class103.field2405 == 20) {
            class108.method882(-32519, this);
            class50.method353((byte) 84);
        } else if (class103.field2405 == 25) {
            class80.method636(true);
        }
        if (class103.field2405 == 30) {
            class143.method1136((byte) 116);
        } else if (class103.field2405 == 40) {
            class50.method353((byte) 84);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field485++;
        try {
            if (arg0.length != 7) {
                class20.method151(-122);
            }
            class59.field1449 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class4.field39 = 0;
            } else if (arg0[1].equals("office")) {
                class4.field39 = 1;
            } else if (arg0[1].equals("local")) {
                class4.field39 = 2;
            } else {
                class20.method151(-126);
            }
            if (arg0[2].equals("live")) {
                class15.field356 = 0;
            } else if (arg0[2].equals("rc")) {
                class15.field356 = 1;
            } else if (arg0[2].equals("wip")) {
                class15.field356 = 2;
            } else {
                class20.method151(-119);
            }
            if (arg0[3].equals("lowmem")) {
                class83.method646((byte) -110);
            } else if (arg0[3].equals("highmem")) {
                class119.method950(104);
            } else {
                class20.method151(-121);
            }
            if (arg0[4].equals("free")) {
                class121.field2768 = false;
            } else if (arg0[4].equals("members")) {
                class121.field2768 = true;
            } else {
                class20.method151(-123);
            }
            if (arg0[5].equals("english")) {
                class52.field1189 = 0;
            } else if (arg0[5].equals("german")) {
                class135.method1085(-98);
                class52.field1189 = 1;
                class83.field1999 = class105.field2444;
            } else {
                class20.method151(-127);
            }
            if (arg0[6].equals("game0")) {
                class113.field2604 = 0;
            } else if (arg0[6].equals("game1")) {
                class113.field2604 = 1;
            } else {
                class20.method151(-124);
            }
            class38.field893 = "127.0.0.1";
            client var1 = new client();
            var1.method211(460, "runescape", (byte) 108, 765, 16, 503, class15.field356 + 32);
        } catch (Exception var3) {
            class93.method715(var3, null, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lhe;II)V")
    public static final void method157(class54[] arg0, int arg1, int arg2) {
        int var3 = -120 / ((-arg1 - 39) / 61);
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class54 var5 = arg0[var4];
            if (var5 != null && var5.field1234 == arg2 && (!var5.field1322 || !class86.method667((byte) -54, var5))) {
                if (var5.field1279 == 0) {
                    if (!var5.field1322 && class86.method667((byte) -111, var5) && class100.field2323 != var5) {
                        continue;
                    }
                    method157(arg0, 67, var5.field1291);
                    if (var5.field1325 != null) {
                        method157(var5.field1325, -111, var5.field1291);
                    }
                    class81 var6 = (class81) class16.field372.method537(-1, (long) var5.field1291);
                    if (var6 != null) {
                        class82.method644(var6.field1963, (byte) 67);
                    }
                }
                if (var5.field1279 == 6) {
                    if (var5.field1247 != -1 || var5.field1335 != -1) {
                        boolean var7 = class68.method529((byte) 104, var5);
                        int var8;
                        if (var7) {
                            var8 = var5.field1335;
                        } else {
                            var8 = var5.field1247;
                        }
                        if (var8 != -1) {
                            class12 var9 = class141.method1121(var8, -24732);
                            var5.field1280 += class45.field1024;
                            while (var9.field280[var5.field1348] < var5.field1280) {
                                var5.field1280 -= var9.field280[var5.field1348];
                                var5.field1348++;
                                if (var5.field1348 >= var9.field263.length) {
                                    var5.field1348 -= var9.field273;
                                    if (var5.field1348 < 0 || var5.field1348 >= var9.field263.length) {
                                        var5.field1348 = 0;
                                    }
                                }
                                method163(var5, -85);
                            }
                        }
                    }
                    if (var5.field1297 != 0 && !var5.field1322) {
                        int var10 = var5.field1297 >> 16;
                        int var11 = var5.field1297 << 16 >> 16;
                        int var12 = class45.field1024 * var10;
                        var5.field1267 = var5.field1267 + var12 & 0x7FF;
                        int var13 = class45.field1024 * var11;
                        var5.field1282 = var5.field1282 + var13 & 0x7FF;
                        method163(var5, -80);
                    }
                }
            }
        }
        field487++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method158(byte arg0, int arg1) {
        class17.field394 = 0;
        class98.field2290 = null;
        if (class144.field3359 == class122.field2798) {
            class144.field3359 = class149.field3509;
        } else {
            class144.field3359 = class122.field2798;
        }
        if (arg0 < 1) {
            field490 = null;
        }
        class29.field727 = null;
        class35.field838++;
        if (class35.field838 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class103.field2405 <= 5) {
                this.method212("js5connect_full", true);
                class103.field2405 = 1000;
            } else {
                class132.field3012 = 3000;
            }
        } else if (class35.field838 >= 2 && arg1 == 6) {
            this.method212("js5connect_outofdate", true);
            class103.field2405 = 1000;
        } else if (class35.field838 >= 4) {
            if (class103.field2405 <= 5) {
                this.method212("js5connect", true);
                class103.field2405 = 1000;
            } else {
                class132.field3012 = 3000;
            }
        }
        field506++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method159(int arg0) {
        field477++;
        if (class103.field2405 != arg0) {
            boolean var2 = class47.method332((byte) -29);
            if (!var2) {
                this.method160((byte) -60);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method160(byte arg0) {
        field509++;
        if (class155.field3602 >= 4) {
            this.method212("js5crc", true);
            class103.field2405 = 1000;
            return;
        }
        if (class75.field1865 >= 4) {
            if (class103.field2405 <= 5) {
                this.method212("js5io", true);
                class103.field2405 = 1000;
                return;
            }
            class75.field1865 = 3;
            class132.field3012 = 3000;
        }
        if (class132.field3012-- > 0) {
            return;
        }
        try {
            if (class17.field394 == 0) {
                class98.field2290 = class148.field3481.method308(class38.field893, false, class144.field3359);
                class17.field394++;
            }
            if (class17.field394 == 1) {
                if (class98.field2290.field471 == 2) {
                    this.method158((byte) 67, -1);
                    return;
                }
                if (class98.field2290.field471 == 1) {
                    class17.field394++;
                }
            }
            if (arg0 != -60) {
                method155((byte) -88);
            }
            if (class17.field394 == 2) {
                class29.field727 = new class124((Socket) class98.field2290.field473, class148.field3481);
                class128 var2 = new class128(5);
                var2.method1010(15, 32768);
                var2.method1040(460, -1308601992);
                class29.field727.method979(5, 19770, var2.field2874, 0);
                class17.field394++;
                class85.field2050 = class26.method209((byte) 120);
            }
            if (class17.field394 == 3) {
                if (class103.field2405 <= 5 || class29.field727.method982(-121) > 0) {
                    int var3 = class29.field727.method977((byte) 80);
                    if (var3 != 0) {
                        this.method158((byte) 55, var3);
                        return;
                    }
                    class17.field394++;
                } else if (class26.method209((byte) -41) - class85.field2050 > 30000L) {
                    this.method158((byte) 103, -2);
                    return;
                }
            }
            if (class17.field394 == 4) {
                class36.method280(class29.field727, 4, class103.field2405 > 20);
                class29.field727 = null;
                class17.field394 = 0;
                class98.field2290 = null;
                class35.field838 = 0;
            }
        } catch (IOException var4) {
            this.method158((byte) 21, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILqd;ZI)V")
    public static final void method161(int arg0, class115 arg1, boolean arg2, int arg3) {
        if ((arg0 & 0x10) != 0) {
            int var4 = class38.field879.method1022((byte) 77);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class38.field879.method989(true);
            class36.method279(var4, true, arg1, var5);
        }
        field481++;
        if ((arg0 & 0x8) != 0) {
            int var6 = class38.field879.method995(-59);
            byte[] var7 = new byte[var6];
            class128 var8 = new class128(var7);
            class38.field879.method1012(0, 76, var7, var6);
            class108.field2499[arg3] = var8;
            arg1.method939(var8, 2);
        }
        if ((arg0 & 0x1) != 0) {
            arg1.field172 = class38.field879.method1041(212464720);
            if (arg1.field172 == 65535) {
                arg1.field172 = -1;
            }
        }
        if ((arg0 & 0x200) != 0) {
            arg1.field166 = class38.field879.method989(arg2);
            arg1.field143 = class38.field879.method1023((byte) -97);
            arg1.field173 = class38.field879.method995(-18);
            arg1.field148 = class38.field879.method995(-16);
            arg1.field150 = class38.field879.method1041(212464720) + class86.field2060;
            arg1.field187 = class38.field879.method1004(-101981656) + class86.field2060;
            arg1.field164 = class38.field879.method1023((byte) -8);
            arg1.field185 = 0;
            arg1.field156 = 1;
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field195 = class38.field879.method1004(-101981656);
            int var9 = class38.field879.method1032(-986860040);
            arg1.field159 = class86.field2060 + (var9 & 0xFFFF);
            arg1.field196 = var9 >> 16;
            if (arg1.field195 == 65535) {
                arg1.field195 = -1;
            }
            arg1.field198 = 0;
            arg1.field184 = 0;
            if (arg1.field159 > class86.field2060) {
                arg1.field184 = -1;
            }
        }
        if (!arg2) {
            return;
        }
        if ((arg0 & 0x80) != 0) {
            int var10 = class38.field879.method1004(-101981656);
            int var11 = class38.field879.method995(-121);
            int var12 = class38.field879.method989(true);
            int var13 = class38.field879.field2873;
            if (arg1.field2653 != null && arg1.field2626 != null) {
                boolean var14 = false;
                long var15 = arg1.field2653.method448(37);
                if (var11 <= 1) {
                    for (int var17 = 0; var17 < class100.field2339; var17++) {
                        if (class47.field1077[var17] == var15) {
                            var14 = true;
                            break;
                        }
                    }
                }
                if (!var14 && class30.field744 == 0) {
                    class27.field647.field2873 = 0;
                    class38.field879.method991((byte) -112, 0, class27.field647.field2874, var12);
                    class27.field647.field2873 = 0;
                    class62 var18 = class89.method679(class136.method1091(class27.field647, 33).method449((byte) 123));
                    arg1.field157 = var18.method464((byte) 119);
                    arg1.field179 = var10 >> 8;
                    arg1.field170 = 150;
                    arg1.field199 = var10 & 0xFF;
                    if (var11 == 2 || var11 == 3) {
                        class43.method320(0, 1, var18, class70.method594(new class62[] { class15.field365, arg1.field2653 }, 1229));
                    } else if (var11 == 1) {
                        class43.method320(0, 1, var18, class70.method594(new class62[] { class42.field966, arg1.field2653 }, 1229));
                    } else {
                        class43.method320(0, 2, var18, arg1.field2653);
                    }
                }
            }
            class38.field879.field2873 = var12 + var13;
        }
        if ((arg0 & 0x2) != 0) {
            arg1.field157 = class38.field879.method1015((byte) -100);
            if (arg1.field157.method446((byte) -15, 0) == 126) {
                arg1.field157 = arg1.field157.method471((byte) -110, 1);
                class43.method320(0, 2, arg1.field157, arg1.field2653);
            } else if (class40.field936 == arg1) {
                class43.method320(0, 2, arg1.field157, arg1.field2653);
            }
            arg1.field170 = 150;
            arg1.field199 = 0;
            arg1.field179 = 0;
        }
        if ((arg0 & 0x100) != 0) {
            int var19 = class38.field879.method989(true);
            int var20 = class38.field879.method995(-41);
            arg1.method62(var19, 122, class86.field2060, var20);
            arg1.field142 = class86.field2060 + 300;
            arg1.field182 = class38.field879.method989(true);
            arg1.field162 = class38.field879.method1025(255);
        }
        if ((arg0 & 0x4) != 0) {
            arg1.field186 = class38.field879.method1041(212464720);
            arg1.field133 = class38.field879.method1004(-101981656);
        }
        if ((arg0 & 0x20) == 0) {
            return;
        }
        int var21 = class38.field879.method1025(255);
        int var22 = class38.field879.method995(-20);
        arg1.method62(var21, -102, class86.field2060, var22);
        arg1.field142 = class86.field2060 + 300;
        arg1.field182 = class38.field879.method1025(255);
        arg1.field162 = class38.field879.method1025(255);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)V")
    public static final void method162(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class7.field214[arg0][arg2 + var4][arg3 + var7] = 0;
            }
        }
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class7.field214[arg0][arg2][arg3 + var5] = class7.field214[arg0][arg2 - 1][arg3 + var5];
            }
        }
        field504++;
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class7.field214[arg0][arg2 + var6][arg3] = class7.field214[arg0][arg2 + var6][arg3 - 1];
            }
        }
        if (arg2 > 0 && class7.field214[arg0][arg2 - 1][arg3] != 0) {
            class7.field214[arg0][arg2][arg3] = class7.field214[arg0][arg2 - 1][arg3];
        } else if (arg3 > 0 && class7.field214[arg0][arg2][arg3 - 1] != 0) {
            class7.field214[arg0][arg2][arg3] = class7.field214[arg0][arg2][arg3 - 1];
        } else if (arg2 > 0 && arg3 > 0 && class7.field214[arg0][arg2 - 1][arg3 - 1] != 0) {
            class7.field214[arg0][arg2][arg3] = class7.field214[arg0][arg2 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhe;I)V")
    public static final void method163(class54 arg0, int arg1) {
        if (class36.field859 == arg0.field1327) {
            class18.field416[arg0.field1268] = true;
        }
        field501++;
        if (arg1 > -68) {
            method163(null, 52);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method164(int arg0) {
        class149.field3509 = class4.field39 == 0 ? 443 : class59.field1449 + 50000;
        class122.field2798 = class4.field39 == 0 ? 43594 : class59.field1449 + 40000;
        field503++;
        class144.field3359 = class122.field2798;
        class54.method372(119);
        class134.method1071(class9.field240, (byte) 99);
        class111.method907(256, class9.field240);
        class135.field3122 = class68.method535(arg0 ^ 0x452D);
        if (class135.field3122 != null) {
            class135.field3122.method322(false, class9.field240);
        }
        class22.field532 = class41.field956;
        try {
            if (class148.field3481.field954 != null) {
                class121.field2780 = new class60(class148.field3481.field954, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class100.field2330[var2] = new class60(class148.field3481.field945[var2], 6000, 0);
                }
                class4.field54 = new class60(class148.field3481.field948, 6000, 0);
                class18.field406 = new class141(255, class121.field2780, class4.field54, 500000);
                class148.field3481.field945 = null;
                class148.field3481.field954 = null;
                class148.field3481.field948 = null;
            }
        } catch (IOException var3) {
            class18.field406 = null;
            class121.field2780 = null;
            class4.field54 = null;
        }
        if (class4.field39 != 0) {
            class126.field2843 = true;
        }
        if (arg0 != -17760) {
            field491 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method165(byte arg0) {
        field492++;
        if (class124.field2837 != null) {
            class124.field2837.field2839 = false;
        }
        class124.field2837 = null;
        if (class59.field1444 != null) {
            class59.field1444.method978(arg0 - 31);
            class59.field1444 = null;
        }
        class102.method820(963311);
        class63.method484(31);
        class135.field3122 = null;
        if (class85.field2036 != null) {
            class85.field2036.method388(124);
        }
        if (class82.field1980 != null) {
            class82.field1980.method388(125);
        }
        class147.method1172(true);
        if (arg0 != 118) {
            return;
        }
        class70.method598((byte) -110);
        try {
            if (class121.field2780 != null) {
                class121.field2780.method433(true);
            }
            if (class100.field2330 != null) {
                for (int var2 = 0; var2 < class100.field2330.length; var2++) {
                    if (class100.field2330[var2] != null) {
                        class100.field2330[var2].method433(true);
                    }
                }
            }
            if (class4.field54 != null) {
                class4.field54.method433(true);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method166(int arg0) {
        method155((byte) -17);
        class62.method465((byte) -119);
        field495++;
        class27.method219((byte) 126);
        class110.method888(81);
        class83.method650(7);
        class126.method987(-23);
        class128.method988((byte) -124);
        class124.method980((byte) 119);
        class29.method236(1);
        class60.method432(0);
        class141.method1123((byte) -114);
        class130.method1053(-125);
        class100.method807(-64);
        class89.method682();
        class69.method552();
        class155.method1210(1);
        class54.method377(-26897);
        class115.method938(false);
        class105.method850(0);
        class68.method540(-126);
        class116.method941(32);
        class132.method1064(true);
        class57.method397(118);
        class85.method658(41);
        class111.method901(81);
        class12.method89(65);
        class6.method67((byte) 55);
        class131.method1055(5);
        class138.method1110((byte) 115);
        class81.method638(true);
        class148.method1177((byte) -58);
        class90.method702((byte) -50);
        class38.method290((byte) -89);
        class18.method126(1);
        class145.method1153();
        class112.method928();
        class10.method81(false);
        class71.method602((byte) -74);
        class7.method68(105);
        class72.method603((byte) 69);
        class32.method254(126);
        class133.method1066((byte) 73);
        class140.method1116((byte) 126);
        class149.method1181(-119);
        class34.method264(true);
        if (arg0 > -48) {
            field502 = null;
        }
        class3.method8((byte) 93);
        class36.method276(126);
        class76.method618();
        class118.method946(0);
        class119.method951(104);
        class26.method205(true);
        class24.method193(false);
        class52.method359((byte) 56);
        class108.method871(true);
        class5.method37((byte) -105);
        class15.method104((byte) 118);
        class1.method2((byte) -94);
        class79.method626((byte) 29);
        class139.method1112(false);
        class46.method329(-119);
        class67.method528(67);
        class153.method1192((byte) 32);
        class8.method73((byte) -96);
        class50.method349(true);
        class16.method113(97);
        class82.method641(124);
        class31.method247((byte) 47);
        class19.method148();
        class28.method223((byte) 109);
        class66.method512();
        class134.method1072(-13223);
        class95.method735();
        class45.method325((byte) 21);
        class94.method720(0);
        class150.method1184(1061);
        class103.method828(-256);
        class96.method742(-105);
        class135.method1078(6);
        class65.method495(17647);
        class23.method185(93);
        class22.method174((byte) 76);
        class120.method958(114);
        class151.method1186(-113);
        class56.method380(-9);
        class42.method316((byte) 84);
        class137.method1095(1820774599);
        class13.method94(0);
        class91.method710();
        class70.method596(123);
        class142.method1127(1);
        class122.method966((byte) 103);
        class30.method244(false);
        class93.method718(false);
        class63.method485(1259424066);
        class47.method339(0);
        class40.method301(-26800);
        class75.method616((byte) 125);
        class113.method929(6);
        class51.method357((byte) 52);
        class39.method295((byte) -118);
        class101.method812();
        class48.method341((byte) -114);
        class143.method1128(-2);
        class77.method621(-2412);
        class146.method1165(0);
        class43.method318((byte) -106);
        class17.method121(-325);
        class4.method15(32105);
        class86.method668(31);
        class59.method425(80);
        class97.method749(37);
        class35.method271((byte) 106);
        class102.method821(19790);
        class53.method362((byte) -90);
        class136.method1094(-1362);
        class80.method637(-48);
        class37.method282();
        class107.method857();
        class121.method963((byte) -99);
        class14.method101();
        class88.method675(125);
        class144.method1138((byte) 107);
        class64.method494();
        class20.method152(71);
        class84.method654(0);
        class98.method757((byte) 65);
        class129.method1045();
        class104.method834();
        class9.method78(3510);
        class147.method1169((byte) 35);
    }
}
