import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class79 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lje;")
    public static class67 field384 = class85.method592(255, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lje;")
    public static class67 field391 = class85.method592(255, "T");

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lje;")
    private static class67 field404 = class85.method592(255, "Login");

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field403 = 0;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lje;")
    public static class67 field392 = field404;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lhc;")
    public static class52 field383;

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method142(int arg0) {
        field391 = null;
        field384 = null;
        field404 = null;
        field383 = null;
        field392 = null;
        if (arg0 != 1) {
            field397 = 72;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method143(int arg0) {
        class34.field627++;
        field399++;
        this.method152(arg0 ^ 0xFFFFFC15);
        class38.method237(arg0 ^ 0x409F);
        class112.method896((byte) 89);
        class67.method485(arg0 ^ 0x3);
        class83.method588((byte) 48);
        class35.method227(0);
        if (class142.field3277 != null) {
            int var2 = class142.field3277.method595(57);
            class91.field1986 = var2;
        }
        if (class128.field2823 == 0) {
            class82.method580(-4);
            class55.method385((byte) 65);
        } else if (class128.field2823 == 5) {
            class116.method932(this, (byte) -102);
            class82.method580(-4);
            class55.method385((byte) 69);
        } else if (class128.field2823 == 10) {
            class116.method932(this, (byte) -107);
        } else if (class128.field2823 == 20) {
            class116.method932(this, (byte) -69);
            class17.method120(-109);
        } else if (class128.field2823 == 25) {
            class95.method733(-4001);
        }
        if (arg0 != -3) {
            this.method145(-44);
        }
        if (class128.field2823 == 30) {
            class80.method571(arg0 - 87);
        } else if (class128.field2823 == 40) {
            class17.method120(arg0 - 109);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([IIB[II[Lsb;)V")
    public static final void method144(int[] arg0, int arg1, byte arg2, int[] arg3, int arg4, class127[] arg5) {
        field401++;
        if (arg1 > arg4) {
            int var6 = arg1 + 1;
            int var7 = (arg1 + arg4) / 2;
            int var8 = arg4 - 1;
            class127 var9 = arg5[var7];
            arg5[var7] = arg5[arg4];
            arg5[arg4] = var9;
            while (var6 > var8) {
                boolean var10 = true;
                do {
                    var6--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg3[var11] == 2) {
                            var12 = arg5[var6].field2793;
                            var13 = var9.field2793;
                        } else if (arg3[var11] == 1) {
                            var12 = arg5[var6].field2782;
                            var13 = var9.field2782;
                            if (var13 == -1 && arg0[var11] == 1) {
                                var13 = 2001;
                            }
                            if (var12 == -1 && arg0[var11] == 1) {
                                var12 = 2001;
                            }
                        } else if (arg3[var11] == 3) {
                            var12 = arg5[var6].field2778 ? 1 : 0;
                            var13 = var9.field2778 ? 1 : 0;
                        } else {
                            var13 = var9.field2784;
                            var12 = arg5[var6].field2784;
                        }
                        if (var12 != var13) {
                            if ((arg0[var11] != 1 || var13 >= var12) && (arg0[var11] != 0 || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var8++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg3[var15] == 2) {
                            var16 = var9.field2793;
                            var17 = arg5[var8].field2793;
                        } else if (arg3[var15] == 1) {
                            var17 = arg5[var8].field2782;
                            if (var17 == -1 && arg0[var15] == 1) {
                                var17 = 2001;
                            }
                            var16 = var9.field2782;
                            if (var16 == -1 && arg0[var15] == 1) {
                                var16 = 2001;
                            }
                        } else if (arg3[var15] == 3) {
                            var16 = var9.field2778 ? 1 : 0;
                            var17 = arg5[var8].field2778 ? 1 : 0;
                        } else {
                            var17 = arg5[var8].field2784;
                            var16 = var9.field2784;
                        }
                        if (var16 != var17) {
                            if ((arg0[var15] != 1 || var16 <= var17) && (arg0[var15] != 0 || var17 <= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var8 < var6) {
                    class127 var18 = arg5[var8];
                    arg5[var8] = arg5[var6];
                    arg5[var6] = var18;
                }
            }
            method144(arg0, var6, (byte) -114, arg3, arg4, arg5);
            method144(arg0, arg1, (byte) -114, arg3, var6 + 1, arg5);
        }
        if (arg2 != -114) {
            field391 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method145(int arg0) {
        field394++;
        if (class91.field2017 >= 4) {
            this.method570((byte) -89, "js5crc");
            class128.field2823 = 1000;
            return;
        }
        if (class19.field367 >= 4) {
            if (class128.field2823 <= 5) {
                this.method570((byte) -89, "js5io");
                class128.field2823 = 1000;
                return;
            }
            class19.field367 = 3;
            class55.field1071 = 3000;
        }
        if (class55.field1071-- > 0) {
            return;
        }
        try {
            if (class120.field2710 == 0) {
                class76.field1632 = class154.field3519.method873((byte) -106, class55.field1091, class58.field1146);
                class120.field2710++;
            }
            if (arg0 == 5) {
                if (class120.field2710 == 1) {
                    if (class76.field1632.field806 == 2) {
                        this.method149(67, -1);
                        return;
                    }
                    if (class76.field1632.field806 == 1) {
                        class120.field2710++;
                    }
                }
                if (class120.field2710 == 2) {
                    class135.field3059 = new class107((Socket) class76.field1632.field808, class154.field3519);
                    class91 var2 = new class91(5);
                    var2.method653(15, 76);
                    var2.method629((byte) -124, 467);
                    class135.field3059.method842(var2.field1991, 5, arg0 ^ 0xFFFFFFE9, 0);
                    class120.field2710++;
                    class142.field3242 = class150.method1148(-85808345);
                }
                if (class120.field2710 == 3) {
                    if (class128.field2823 <= 5 || class135.field3059.method848((byte) -125) > 0) {
                        int var3 = class135.field3059.method845((byte) 121);
                        if (var3 != 0) {
                            this.method149(107, var3);
                            return;
                        }
                        class120.field2710++;
                    } else if (class150.method1148(arg0 - 85808350) - class142.field3242 > 30000L) {
                        this.method149(49, -2);
                        return;
                    }
                }
                if (class120.field2710 == 4) {
                    class86.method604((byte) 122, class135.field3059, class128.field2823 > 20);
                    class76.field1632 = null;
                    class4.field70 = 0;
                    class120.field2710 = 0;
                    class135.field3059 = null;
                }
            }
        } catch (IOException var4) {
            this.method149(arg0 + 26, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method146(int arg0) {
        if (arg0 != 1000) {
            method142(78);
        }
        boolean var2 = class39.method240((byte) -52);
        if (var2 && class105.field2404 && class39.field701 != null) {
            class39.field701.method1001(arg0 ^ 0x3E9);
        }
        if (class152.field3492) {
            class75.method537(class98.field2193, 0);
            class141.method1073(true, class98.field2193);
            if (class142.field3277 != null) {
                class142.field3277.method598(-16597, class98.field2193);
            }
            this.method567(102);
            class143.method1106(class98.field2193, 255);
            class56.method392(class98.field2193, true);
            if (class142.field3277 != null) {
                class142.field3277.method593((byte) 125, class98.field2193);
            }
        }
        if (class128.field2823 == 0) {
            class65.method438(class93.field2100, class106.field2425, null, (byte) 123);
        } else if (class128.field2823 == 5) {
            class134.method1019(class89.field1976, true, class116.field2625);
        } else if (class128.field2823 == 10) {
            class134.method1019(class89.field1976, true, class116.field2625);
        } else if (class128.field2823 == 20) {
            class134.method1019(class89.field1976, true, class116.field2625);
        } else if (class128.field2823 == 25) {
            if (class116.field2621 == 1) {
                if (class101.field2262 > class128.field2805) {
                    class128.field2805 = class101.field2262;
                }
                int var3 = (class128.field2805 - class101.field2262) * 50 / class128.field2805;
                class6.method56(false, class49.method314(new class67[] { class39.field703, class82.field1813, class60.method420(var3, arg0 ^ 0x6CBA), class104.field2388 }, 0), 14489);
            } else if (class116.field2621 == 2) {
                if (class27.field487 > class126.field2777) {
                    class126.field2777 = class27.field487;
                }
                int var4 = (class126.field2777 - class27.field487) * 50 / class126.field2777 + 50;
                class6.method56(false, class49.method314(new class67[] { class39.field703, class82.field1813, class60.method420(var4, 28498), class104.field2388 }, 0), arg0 + 13489);
            } else {
                class6.method56(false, class39.field703, 14489);
            }
        } else if (class128.field2823 == 30) {
            class79.method564(-83);
        } else if (class128.field2823 == 40) {
            class6.method56(false, class49.method314(new class67[] { class127.field2781, class126.field2776, class2.field23 }, 0), 14489);
        }
        field393++;
        if (class128.field2823 == 30 && class79.field1739 == 0 && !class9.field210) {
            try {
                Graphics var7 = class98.field2193.getGraphics();
                for (int var8 = 0; var8 < class86.field1918; var8++) {
                    if (class103.field2301[var8]) {
                        class81.field1792.method97(var7, true, class75.field1625[var8], class30.field540[var8], class56.field1114[var8], class141.field3228[var8]);
                        class103.field2301[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class98.field2193.repaint();
            }
        } else if (class128.field2823 > 0) {
            try {
                Graphics var5 = class98.field2193.getGraphics();
                class81.field1792.method102(true, 0, var5, 0);
                class9.field210 = false;
                for (int var6 = 0; var6 < class86.field1918; var6++) {
                    class103.field2301[var6] = false;
                }
            } catch (Exception var10) {
                class98.field2193.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method147(byte arg0) {
        field398++;
        if (class137.field3090 != null) {
            class137.field3090.field2597 = false;
        }
        class137.field3090 = null;
        if (class104.field2367 != null) {
            class104.field2367.method847(arg0 - 83);
            class104.field2367 = null;
        }
        class101.method799(true);
        class126.method971(0);
        class142.field3277 = null;
        if (class39.field701 != null) {
            class39.field701.method1008(1817);
        }
        if (class35.field638 != null) {
            class35.field638.method1008(1817);
        }
        class47.method309((byte) 105);
        if (arg0 != 38) {
            this.method150(-26);
        }
        class127.method977(1);
        try {
            if (class24.field444 != null) {
                class24.field444.method1177(arg0 ^ 0xFFFFFFD9);
            }
            if (class52.field1035 != null) {
                for (int var2 = 0; var2 < class52.field1035.length; var2++) {
                    if (class52.field1035[var2] != null) {
                        class52.field1035[var2].method1177(-1);
                    }
                }
            }
            if (class69.field1423 != null) {
                class69.field1423.method1177(arg0 ^ 0xFFFFFFD9);
            }
            if (class127.field2798 != null) {
                class127.field2798.method1177(-1);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method148(byte arg0) {
        class9.field205 = class41.field769 == 0 ? 43594 : class19.field366 + 40000;
        class105.field2400 = class41.field769 == 0 ? 443 : class19.field366 + 50000;
        class58.field1146 = class9.field205;
        if (class30.field532 == 1) {
            class31.field553 = class81.field1786;
            class32.field567 = class95.field2129;
            class151.field3457 = class105.field2405;
            class116.field2613 = class142.field3266;
        } else {
            class151.field3457 = class27.field484;
            class31.field553 = class150.field3446;
            class32.field567 = class9.field208;
            class116.field2613 = class25.field457;
        }
        field400++;
        class59.method411(192);
        class143.method1106(class98.field2193, 255);
        class56.method392(class98.field2193, true);
        class142.field3277 = class69.method508(true);
        if (class142.field3277 != null) {
            class142.field3277.method593((byte) 119, class98.field2193);
        }
        if (arg0 > -31) {
            field395 = -34;
        }
        class97.field2180 = class111.field2501;
        try {
            if (class154.field3519.field2512 != null) {
                class24.field444 = new class155(class154.field3519.field2512, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class52.field1035[var2] = new class155(class154.field3519.field2511[var2], 6000, 0);
                }
                class69.field1423 = new class155(class154.field3519.field2508, 6000, 0);
                class133.field2939 = new class50(255, class24.field444, class69.field1423, 500000);
                class127.field2798 = new class155(class154.field3519.field2502, 24, 0);
                class154.field3519.field2512 = null;
                class154.field3519.field2508 = null;
                class154.field3519.field2502 = null;
                class154.field3519.field2511 = null;
            }
        } catch (IOException var3) {
            class24.field444 = null;
            class133.field2939 = null;
            class127.field2798 = null;
            class69.field1423 = null;
        }
        if (class41.field769 != 0) {
            class46.field855 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field386++;
        if (!this.method563(101)) {
            return;
        }
        class19.field366 = Integer.parseInt(this.getParameter("worldid"));
        class101.field2279 = Integer.parseInt(this.getParameter("modewhat"));
        class41.field769 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class145.method1123(0);
        } else {
            class68.method494(256);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class112.field2523 = true;
        } else {
            class112.field2523 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class97.method759(113);
            class23.field415 = 1;
            class52.field1040 = class143.field3290;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class30.field532 = 1;
        } else {
            class30.field532 = 0;
        }
        try {
            class159.field3657 = Integer.parseInt(this.getParameter("js"));
            class3.field44 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class55.field1091 = this.getCodeBase().getHost();
        this.method561(class101.field2279 + 32, 467, 765, -79, 503);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class117.method940(-19045);
            }
            class19.field366 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class41.field769 = 0;
            } else if (arg0[1].equals("office")) {
                class41.field769 = 1;
            } else if (arg0[1].equals("local")) {
                class41.field769 = 2;
            } else {
                class117.method940(-19045);
            }
            if (arg0[2].equals("live")) {
                class101.field2279 = 0;
            } else if (arg0[2].equals("rc")) {
                class101.field2279 = 1;
            } else if (arg0[2].equals("wip")) {
                class101.field2279 = 2;
            } else {
                class117.method940(-19045);
            }
            if (arg0[3].equals("lowmem")) {
                class145.method1123(0);
            } else if (arg0[3].equals("highmem")) {
                class68.method494(256);
            } else {
                class117.method940(-19045);
            }
            if (arg0[4].equals("free")) {
                class112.field2523 = false;
            } else if (arg0[4].equals("members")) {
                class112.field2523 = true;
            } else {
                class117.method940(-19045);
            }
            if (arg0[5].equals("english")) {
                class23.field415 = 0;
            } else if (arg0[5].equals("german")) {
                class97.method759(83);
                class52.field1040 = class143.field3290;
                class23.field415 = 1;
            } else {
                class117.method940(-19045);
            }
            if (arg0[6].equals("game0")) {
                class30.field532 = 0;
            } else if (arg0[6].equals("game1")) {
                class30.field532 = 1;
            } else {
                class117.method940(-19045);
            }
            class55.field1091 = "127.0.0.1";
            client var1 = new client();
            var1.method556(16, class101.field2279 + 32, 79, 503, "runescape", 765, 467);
        } catch (Exception var3) {
            class112.method887(-32453, var3, null);
        }
        field390++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method149(int arg0, int arg1) {
        class4.field70++;
        if (class9.field205 == class58.field1146) {
            class58.field1146 = class105.field2400;
        } else {
            class58.field1146 = class9.field205;
        }
        if (arg0 < 26) {
            this.method149(-99, -123);
        }
        class120.field2710 = 0;
        field387++;
        class76.field1632 = null;
        class135.field3059 = null;
        if (class4.field70 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class128.field2823 <= 5) {
                this.method570((byte) -89, "js5connect_full");
                class128.field2823 = 1000;
            } else {
                class55.field1071 = 3000;
            }
        } else if (class4.field70 >= 2 && arg1 == 6) {
            this.method570((byte) -89, "js5connect_outofdate");
            class128.field2823 = 1000;
        } else if (class4.field70 >= 4) {
            if (class128.field2823 > 5) {
                class55.field1071 = 3000;
            } else {
                this.method570((byte) -89, "js5connect");
                class128.field2823 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        method142(1);
        class67.method453((byte) -59);
        field388++;
        class79.method559((byte) 127);
        class106.method840((byte) 37);
        class14.method98((byte) -126);
        class115.method929(true);
        class91.method644(-2140622584);
        class107.method846(32);
        class140.method1058(32502);
        class155.method1179(true);
        class50.method322(true);
        class24.method167(arg0 ^ 0xFFFFFFAA);
        class44.method280((byte) 88);
        class51.method332();
        class34.method209(arg0 - 125);
        class72.method527(true);
        class83.method584(-114);
        class4.method20(-25883);
        class145.method1117(true);
        class85.method596(true);
        class92.method678((byte) 70);
        class132.method1002(123);
        class52.method379((byte) -62);
        class68.method498(1);
        class93.method685((byte) -85);
        class133.method1015(-2150);
        class138.method1049(~arg0);
        class112.method883(-23005);
        class60.method419(0);
        class16.method116((byte) 126);
        class130.method992(arg0 - 1);
        class88.method611(arg0 ^ 0xFFFFFF9E);
        class99.method763(true);
        class5.method34();
        class156.method1190();
        class27.method178(-59);
        class118.method944(-1);
        class45.method289(true);
        class134.method1017(true);
        class89.method616(arg0 + 64);
        class58.method409(39);
        class105.method832(15929);
        class17.method122((byte) -50);
        class41.method271(107);
        class12.method90(true);
        class65.method437(-61);
        class87.method609();
        class15.method105(false);
        class97.method758(true);
        class23.method162((byte) 125);
        class19.method133((byte) 64);
        class150.method1151(8526);
        class114.method927((byte) 106);
        class9.method83(999);
        class40.method268(arg0);
        class141.method1096((byte) -63);
        class2.method7(-2);
        class66.method444(arg0 + 42);
        class32.method204(false);
        class127.method975(-16950);
        class129.method984((byte) -121);
        class143.method1103((byte) 104);
        class49.method318((byte) 127);
        class104.method829(112);
        class120.method950(31236);
        class122.method957(13501);
        class82.method583(2);
        class59.method413(104);
        class8.method61();
        class30.method194(-1);
        class96.method753();
        class142.method1100((byte) -75);
        class136.method1038();
        class116.method935((byte) -17);
        class31.method201(2);
        class29.method190((byte) -107);
        class131.method996((byte) 44);
        class18.method127((byte) 118);
        class158.method1219((byte) -86);
        class47.method306(117);
        class103.method817(0);
        class86.method601(-115);
        class144.method1113(102);
        class64.method432(3);
        class95.method735(arg0 + 2);
        class147.method1137((byte) 48);
        class152.method1163(-128);
        class100.method782();
        class69.method509(2);
        class13.method95();
        class33.method205(-1);
        class37.method233(25655);
        class123.method964(arg0 + 7344);
        class121.method953(false);
        class117.method938(true);
        class75.method536(-109);
        class101.method800((byte) 82);
        class38.method236(-100);
        class126.method970(-25322);
        class35.method226(-91);
        class6.method54(3);
        class135.method1025(127);
        class119.method946();
        class55.method388((byte) 98);
        class63.method428(true);
        class84.method590(arg0 ^ 0xFFFFFF95);
        class39.method243(32768);
        class3.method14(-113);
        class71.method515(-124);
        class148.method1139(arg0 - 107);
        class46.method297(115);
        class81.method575(113);
        class26.method176(45);
        class154.method1168(-127);
        class159.method1229(-118);
        class149.method1145((byte) -91);
        class76.method540((byte) 62);
        class128.method981((byte) -121);
        class61.method423((byte) 124);
        class153.method1164();
        class28.method186();
        class137.method1043((byte) 28);
        class54.method382();
        class151.method1155((byte) 67);
        class98.method762((byte) 57);
        class108.method857();
        class77.method548(0);
        class42.method276((byte) 83);
        class80.method572(-1);
        class110.method862();
        class157.method1214();
        class25.method170(arg0 ^ 0x3A);
        class56.method393((byte) -28);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[Lje;)[Lje;")
    public static final class67[] method151(boolean arg0, class67[] arg1) {
        if (!arg0) {
            main(null);
        }
        field389++;
        class67[] var2 = new class67[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class49.method314(new class67[] { class60.method420(var3, 28498), class117.field2634 }, 0);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class49.method314(new class67[] { var2[var3], arg1[var3] }, 0);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method152(int arg0) {
        field402++;
        if (class128.field2823 != arg0) {
            boolean var2 = class18.method130(true);
            if (!var2) {
                this.method145(5);
            }
        }
    }
}
