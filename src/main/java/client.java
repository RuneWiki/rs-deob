import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client")
public class client extends class185 {

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    public static int field662 = -1;

    @OriginalMember(owner = "client", name = "ab", descriptor = "[I")
    public static int[] field667 = new int[5];

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    public static int[] field676 = new int[32];

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client", name = "E", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Lbg;")
    public static class18 field680;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Lhf;")
    public static class75 field683;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field685;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field686;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "ub", descriptor = "Ljava/lang/Class;")
    public static Class field687;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "vb", descriptor = "Ljava/lang/Class;")
    public static Class field688;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "wb", descriptor = "Ljava/lang/Class;")
    public static Class field689;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "xb", descriptor = "Ljava/lang/Class;")
    public static Class field690;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "yb", descriptor = "Ljava/lang/Class;")
    public static Class field691;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field692;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Ab", descriptor = "Ljava/lang/Class;")
    public static Class field693;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Bb", descriptor = "Ljava/lang/Class;")
    public static Class field694;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Cb", descriptor = "Ljava/lang/Class;")
    public static Class field695;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Db", descriptor = "Ljava/lang/Class;")
    public static Class field696;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Eb", descriptor = "Ljava/lang/Class;")
    public static Class field697;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Fb", descriptor = "Ljava/lang/Class;")
    public static Class field698;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Gb", descriptor = "Ljava/lang/Class;")
    public static Class field699;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Hb", descriptor = "Ljava/lang/Class;")
    public static Class field700;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Ib", descriptor = "Ljava/lang/Class;")
    public static Class field701;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Jb", descriptor = "Ljava/lang/Class;")
    public static Class field702;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Kb", descriptor = "Ljava/lang/Class;")
    public static Class field703;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Lb", descriptor = "Ljava/lang/Class;")
    public static Class field704;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Mb", descriptor = "Ljava/lang/Class;")
    public static Class field705;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Nb", descriptor = "Ljava/lang/Class;")
    public static Class field706;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Ob", descriptor = "Ljava/lang/Class;")
    public static Class field707;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Pb", descriptor = "Ljava/lang/Class;")
    public static Class field708;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Qb", descriptor = "Ljava/lang/Class;")
    public static Class field709;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Rb", descriptor = "Ljava/lang/Class;")
    public static Class field710;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Sb", descriptor = "Ljava/lang/Class;")
    public static Class field711;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Tb", descriptor = "Ljava/lang/Class;")
    public static Class field712;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Ub", descriptor = "Ljava/lang/Class;")
    public static Class field713;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Vb", descriptor = "Ljava/lang/Class;")
    public static Class field714;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Wb", descriptor = "Ljava/lang/Class;")
    public static Class field715;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Xb", descriptor = "Ljava/lang/Class;")
    public static Class field716;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Yb", descriptor = "Ljava/lang/Class;")
    public static Class field717;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "Zb", descriptor = "Ljava/lang/Class;")
    public static Class field718;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "ac", descriptor = "Ljava/lang/Class;")
    public static Class field719;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "bc", descriptor = "Ljava/lang/Class;")
    public static Class field720;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "cc", descriptor = "Ljava/lang/Class;")
    public static Class field721;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "dc", descriptor = "Ljava/lang/Class;")
    public static Class field722;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "ec", descriptor = "Ljava/lang/Class;")
    public static Class field723;

    // $FF: synthetic field
    @OriginalMember(owner = "client", name = "fc", descriptor = "Ljava/lang/Class;")
    public static Class field724;

    @OriginalMember(owner = "client", name = "pb", descriptor = "[Lkf;")
    public static class100[] field682;

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field671++;
        if (!this.method1255(true)) {
            return;
        }
        class73.field1413 = Integer.parseInt(this.getParameter("worldid"));
        class29.field631 = Integer.parseInt(this.getParameter("modewhat"));
        class29.field635 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class146.method1020(true);
        } else {
            class123.method885(6);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class68.field1326 = true;
        } else {
            class68.field1326 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class156.method1069((byte) 73);
            class174.field3309 = class136.field2632;
            class49.field1011 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class168.field3120 = 1;
        } else {
            class168.field3120 = 0;
        }
        try {
            class139.field2695 = Integer.parseInt(this.getParameter("js"));
            class201.field3959 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class190.field3646 = this.getCodeBase().getHost();
        this.method1250(765, 503, (byte) -120, class29.field631 + 32, 484);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    private final void method245(int arg0) {
        field678++;
        if (class192.field3676 >= 4) {
            this.method1249((byte) -62, "js5crc");
            class107.field2123 = 1000;
            return;
        }
        if (class75.field1428 >= 4) {
            if (class107.field2123 <= 5) {
                this.method1249((byte) -70, "js5io");
                class107.field2123 = 1000;
                return;
            }
            class42.field877 = 3000;
            class75.field1428 = 3;
        }
        if (class42.field877-- > 0) {
            return;
        }
        if (arg0 != -34) {
            method259(123, -4);
        }
        try {
            if (class41.field857 == 0) {
                class132.field2554 = class49.field1009.method701(class129.field2490, false, class190.field3646);
                class41.field857++;
            }
            if (class41.field857 == 1) {
                if (class132.field2554.field746 == 2) {
                    this.method254(-1, true);
                    return;
                }
                if (class132.field2554.field746 == 1) {
                    class41.field857++;
                }
            }
            if (class41.field857 == 2) {
                class5.field81 = new class125((Socket) class132.field2554.field748, class49.field1009);
                class86 var2 = new class86(5);
                var2.method568(-13488, 15);
                var2.method588((byte) 108, 484);
                class5.field81.method908(arg0 - 17, 0, 5, var2.field1808);
                class41.field857++;
                class201.field3960 = class123.method880(false);
            }
            if (class41.field857 == 3) {
                if (class107.field2123 <= 5 || class5.field81.method907(-83) > 0) {
                    int var3 = class5.field81.method914(true);
                    if (var3 != 0) {
                        this.method254(var3, true);
                        return;
                    }
                    class41.field857++;
                } else if (class123.method880(false) - class201.field3960 > 30000L) {
                    this.method254(-2, true);
                    return;
                }
            }
            if (class41.field857 == 4) {
                class76.method481(class5.field81, class107.field2123 > 20, true);
                class131.field2527 = 0;
                class41.field857 = 0;
                class5.field81 = null;
                class132.field2554 = null;
            }
        } catch (IOException var4) {
            this.method254(-3, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Lbi;")
    public static final class20 method246(int arg0, int arg1) {
        field664++;
        class20 var2 = (class20) class193.field3685.method1086((long) arg1, -110);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class71.field1379.method147(0, arg1, arg0);
        class20 var4 = new class20();
        if (var3 != null) {
            var4.method184(new class86(var3), (byte) 70);
        }
        var4.method190(-121);
        class193.field3685.method1082((long) arg1, 62, var4);
        return var4;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public static final void method247(int arg0) {
        field661++;
        for (int var1 = arg0; var1 < class1.field10; var1++) {
            int var2 = class1.field8[var1];
            class139 var3 = class183.field3444[var2];
            if (var3 != null) {
                class40.method292((byte) 58, var3, var3.field2691.field3175);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    private static final void method248(int arg0) {
        field666++;
        class79 var1 = class205.field4019;
        synchronized (class205.field4019) {
            if (arg0 < 58) {
                field680 = null;
            }
            class177.field3347 = class54.field1086;
            if (class77.field1475 >= 0) {
                while (class77.field1475 != class55.field1112) {
                    int var2 = class159.field2985[class55.field1112];
                    class55.field1112 = class55.field1112 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class74.field1423[var2] = true;
                    } else {
                        class74.field1423[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class74.field1423[var3] = false;
                }
                class77.field1475 = class55.field1112;
            }
            class54.field1086 = class115.field2272;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    private final void method249(int arg0) {
        if (arg0 < 75) {
            field684 = -65;
        }
        field665++;
        if (class107.field2123 != 1000) {
            boolean var2 = class173.method1160(26761);
            if (!var2) {
                this.method245(-34);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZ)V")
    public static final void method250(int arg0, int arg1, int arg2, boolean arg3) {
        field672++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class169.field3133 = arg3;
        class54.field1085 = arg1;
        if (arg2 != 28352) {
            method246(-124, -114);
        }
        class23.field519 = arg0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public static void method251(byte arg0) {
        if (arg0 < 56) {
            field682 = null;
        }
        field683 = null;
        field667 = null;
        field680 = null;
        field676 = null;
        field682 = null;
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field669++;
        try {
            if (arg0.length != 7) {
                class129.method937(14750);
            }
            class73.field1413 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class29.field635 = 0;
            } else if (arg0[1].equals("office")) {
                class29.field635 = 1;
            } else if (arg0[1].equals("local")) {
                class29.field635 = 2;
            } else {
                class129.method937(14750);
            }
            if (arg0[2].equals("live")) {
                class29.field631 = 0;
            } else if (arg0[2].equals("rc")) {
                class29.field631 = 1;
            } else if (arg0[2].equals("wip")) {
                class29.field631 = 2;
            } else {
                class129.method937(14750);
            }
            if (arg0[3].equals("lowmem")) {
                class146.method1020(true);
            } else if (arg0[3].equals("highmem")) {
                class123.method885(115);
            } else {
                class129.method937(14750);
            }
            if (arg0[4].equals("free")) {
                class68.field1326 = false;
            } else if (arg0[4].equals("members")) {
                class68.field1326 = true;
            } else {
                class129.method937(14750);
            }
            if (arg0[5].equals("english")) {
                class49.field1011 = 0;
            } else if (arg0[5].equals("german")) {
                class156.method1069((byte) 113);
                class49.field1011 = 1;
                class174.field3309 = class136.field2632;
            } else {
                class129.method937(14750);
            }
            if (arg0[6].equals("game0")) {
                class168.field3120 = 0;
            } else if (arg0[6].equals("game1")) {
                class168.field3120 = 1;
            } else {
                class129.method937(14750);
            }
            class190.field3646 = "127.0.0.1";
            client var1 = new client();
            var1.method1257(765, 484, "runescape", 37, 503, class29.field631 + 32, 16);
            class26.field558.setLocation(40, 40);
        } catch (Exception var3) {
            class9.method43(null, -36, var3);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    private static final void method252(byte arg0) {
        Object var1 = class203.field3987;
        synchronized (class203.field3987) {
            if (class21.field475 != 0) {
                class21.field475 = 1;
                try {
                    class203.field3987.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
        field670++;
        int var2 = -22 / ((arg0 + 10) / 63);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method253(int arg0) {
        if (arg0 != 16) {
            return;
        }
        field668++;
        boolean var2 = class34.method272(-105);
        if (var2 && class36.field792 && class164.field3071 != null) {
            class164.field3071.method44((byte) 119);
        }
        if (class173.field3234) {
            class121.method873(-1, class6.field88);
            class5.method21((byte) -106, class6.field88);
            if (class141.field2738 != null) {
                class141.field2738.method688((byte) 118, class6.field88);
            }
            this.method1251(0);
            class143.method1011((byte) 124, class6.field88);
            class31.method265(class6.field88, (byte) 78);
            if (class141.field2738 != null) {
                class141.field2738.method686(class6.field88, -44);
            }
        }
        if (class107.field2123 == 0) {
            class91.method665(null, class86.field1786, class145.field2797, arg0 ^ 0x13C);
        } else if (class107.field2123 == 5) {
            class194.method1300(class74.field1426, class46.field957, false);
        } else if (class107.field2123 == 10) {
            class194.method1300(class74.field1426, class46.field957, false);
        } else if (class107.field2123 == 20) {
            class194.method1300(class74.field1426, class46.field957, false);
        } else if (class107.field2123 == 25) {
            if (class172.field3226 == 1) {
                if (class49.field1008 > class138.field2678) {
                    class138.field2678 = class49.field1008;
                }
                int var4 = (class138.field2678 - class49.field1008) * 50 / class138.field2678;
                class103.method742(class36.method279(new class109[] { class117.field2315, class35.field778, class52.method345((byte) 85, var4), class28.field615 }, arg0 ^ 0x68), -1, false);
            } else if (class172.field3226 == 2) {
                if (class98.field1983 < class141.field2736) {
                    class98.field1983 = class141.field2736;
                }
                int var3 = (class98.field1983 - class141.field2736) * 50 / class98.field1983 + 50;
                class103.method742(class36.method279(new class109[] { class117.field2315, class35.field778, class52.method345((byte) 85, var3), class28.field615 }, 126), -1, false);
            } else {
                class103.method742(class117.field2315, arg0 - 17, false);
            }
        } else if (class107.field2123 == 30) {
            class183.method1242((byte) 79);
        } else if (class107.field2123 == 40) {
            class103.method742(class36.method279(new class109[] { class177.field3341, class210.field4092, class123.field2365 }, 126), -1, false);
        }
        if (class107.field2123 == 30 && class173.field3229 == 0 && !class80.field1589) {
            try {
                Graphics var7 = class6.field88.getGraphics();
                for (int var8 = 0; var8 < class113.field2239; var8++) {
                    if (class186.field3538[var8]) {
                        class68.field1320.method329(class68.field1317[var8], class200.field3956[var8], 0, var7, class27.field587[var8], class60.field1176[var8]);
                        class186.field3538[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class6.field88.repaint();
            }
        } else if (class107.field2123 > 0) {
            try {
                Graphics var5 = class6.field88.getGraphics();
                class68.field1320.method328(0, (byte) -65, var5, 0);
                class80.field1589 = false;
                for (int var6 = 0; var6 < class113.field2239; var6++) {
                    class186.field3538[var6] = false;
                }
            } catch (Exception var10) {
                class6.field88.repaint();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    private final void method254(int arg0, boolean arg1) {
        field663++;
        class132.field2554 = null;
        class131.field2527++;
        class41.field857 = 0;
        if (!arg1) {
            this.method257((byte) -59);
        }
        if (class206.field4050 == class129.field2490) {
            class129.field2490 = class63.field1211;
        } else {
            class129.field2490 = class206.field4050;
        }
        class5.field81 = null;
        if (class131.field2527 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class107.field2123 <= 5) {
                this.method1249((byte) -52, "js5connect_full");
                class107.field2123 = 1000;
            } else {
                class42.field877 = 3000;
            }
        } else if (class131.field2527 >= 2 && arg0 == 6) {
            this.method1249((byte) -63, "js5connect_outofdate");
            class107.field2123 = 1000;
        } else if (class131.field2527 >= 4) {
            if (class107.field2123 > 5) {
                class42.field877 = 3000;
            } else {
                this.method1249((byte) -38, "js5connect");
                class107.field2123 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method255(byte arg0, String arg1) throws ClassNotFoundException {
        field679++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0 != -63) {
                field676 = null;
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method256(int arg0) {
        if (class168.field3120 == 1) {
            class40.field856 = class31.field730;
            class81.field1604 = class157.field2959;
            class164.field3085 = class84.field1713;
            class84.field1704 = class57.field1153;
        } else {
            class40.field856 = class203.field3992;
            class84.field1704 = class169.field3134;
            class164.field3085 = class201.field3958;
            class81.field1604 = class90.field1860;
        }
        class206.field4050 = class29.field635 == 0 ? 43594 : class73.field1413 + 40000;
        class129.field2490 = class206.field4050;
        field677++;
        class63.field1211 = class29.field635 == 0 ? 443 : class73.field1413 + 50000;
        class80.method511(-120);
        if (arg0 != 40000) {
            method247(-12);
        }
        class143.method1011((byte) 127, class6.field88);
        class31.method265(class6.field88, (byte) 78);
        class141.field2738 = class38.method288(5);
        if (class141.field2738 != null) {
            class141.field2738.method686(class6.field88, -126);
        }
        class69.field1339 = class99.field2002;
        try {
            if (class49.field1009.field1988 != null) {
                class179.field3388 = new class75(class49.field1009.field1988, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class93.field1907[var2] = new class75(class49.field1009.field1999[var2], 6000, 0);
                }
                class130.field2521 = new class75(class49.field1009.field1990, 6000, 0);
                class16.field307 = new class204(255, class179.field3388, class130.field2521, 500000);
                field683 = new class75(class49.field1009.field1991, 24, 0);
                class49.field1009.field1991 = null;
                class49.field1009.field1999 = null;
                class49.field1009.field1988 = null;
                class49.field1009.field1990 = null;
            }
        } catch (IOException var3) {
            field683 = null;
            class16.field307 = null;
            class179.field3388 = null;
            class130.field2521 = null;
        }
        if (class29.field635 != 0) {
            class131.field2528 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method257(byte arg0) {
        field674++;
        method251((byte) 112);
        class109.method796(true);
        class185.method1254(31);
        class190.method1284(42);
        class48.method326(108);
        class156.method1070((byte) -113);
        class86.method551((byte) 119);
        class125.method909(arg0 ^ 0xBB9A05EA);
        class138.method989(-1);
        class75.method467((byte) 100);
        class204.method1347(-99);
        class139.method997(true);
        class203.method1336(5681);
        class105.method753(false);
        class200.method1321((byte) 90);
        class184.method1247((byte) -124);
        class181.method1232(true);
        class49.method332(-8917);
        class96.method685((byte) 121);
        class88.method653(-82);
        class132.method946((byte) 123);
        class9.method49(16128);
        class140.method999((byte) -115);
        class16.method108(1073741823);
        class20.method183(125);
        class187.method1266((byte) 108);
        class81.method515(380184944);
        class170.method1142(1);
        class60.method394(-27022);
        class71.method450((byte) 118);
        class15.method100(true);
        class130.method940((byte) -102);
        class160.method1085(1);
        class189.method1278();
        class173.method1155(-21365);
        class153.method1049(95);
        class142.method1008((byte) 116);
        class3.method14((byte) 126);
        class45.method315((byte) -119);
        class164.method1112((byte) 13);
        class95.method682(false);
        class12.method82(0);
        class104.method748((byte) -105);
        class50.method341(0);
        class135.method954();
        class127.method922(512);
        class43.method307();
        class183.method1243(-1);
        class65.method418(-5115);
        class79.method509((byte) 93);
        class143.method1012((byte) -23);
        class123.method884(-97);
        class202.method1330((byte) -92);
        class62.method407((byte) 97);
        class18.method175((byte) 61);
        class174.method1171((byte) -115);
        class23.method209(true);
        class39.method291(-818007391);
        class80.method514(arg0 ^ 0xFFFFD983);
        class55.method360((byte) -115);
        class69.method446((byte) 127);
        class168.method1126((byte) -128);
        class137.method983(126);
        class103.method737(255);
        class180.method1225(false);
        class84.method534(-101);
        class41.method301(-10);
        class1.method2(arg0);
        class11.method73();
        class147.method1028(57);
        class124.method904();
        class199.method1312(true);
        class154.method1056();
        class118.method862(-1);
        class114.method842(2);
        class57.method376((byte) -91);
        class28.method227(-103);
        class128.method929(true);
        class77.method488((byte) -15);
        class78.method498(-126);
        class83.method526(13799);
        class66.method420();
        class179.method1221(-58);
        class111.method828((byte) -42);
        class161.method1092((byte) 17);
        class74.method463(true);
        class54.method353(false);
        class4.method15((byte) 89);
        class17.method144();
        class14.method88((byte) 81);
        class169.method1130(arg0 + 2045);
        class5.method24((byte) -106);
        if (arg0 != 2) {
            field676 = null;
        }
        class201.method1328(-1048);
        class162.method1101(0);
        class10.method58((byte) -13);
        class106.method768(-64);
        class91.method666(false);
        class194.method1302(arg0 ^ 0x4B);
        class59.method387(arg0 - 1);
        class152.method1046(arg0 ^ 0x53);
        class82.method518((byte) -79);
        class8.method39(-1);
        class47.method322(-1);
        class196.method1306();
        class30.method240(-119);
        class117.method858((byte) -77);
        class19.method179((byte) -42);
        class72.method455(false);
        class67.method439(20617);
        class7.method33((byte) -124);
        class159.method1080((byte) -68);
        class144.method1016(true);
        class210.method1367(-84);
        class121.method870(0);
        class115.method850(105);
        class146.method1023((byte) -117);
        class42.method303(-11830);
        class22.method200(-67);
        class76.method480(-122);
        class119.method864();
        class207.method1354();
        class53.method348(false);
        class195.method1304();
        class38.method286(arg0 ^ 0x7);
        class70.method449((byte) -28);
        class136.method978(-30878);
        class110.method813();
        class27.method222(true);
        class36.method276(5685);
        class126.method919((byte) 23);
        class56.method364();
        class61.method397();
        class116.method854(8);
        class209.method1361(0);
        class85.method541(13218);
        class192.method1291(arg0 ^ 0xFFFFFFFD);
        class141.method1007((byte) 101);
        class158.method1075(-4);
        class93.method675(arg0 + 2);
        class113.method836(2);
        class149.method1043(arg0 ^ 0xFFFFFF8B);
        class150.method1045(false);
        class35.method273(96);
        class31.method267(arg0 ^ 0xFFFFFFA8);
        class134.method952(arg0 ^ 0x602);
        class206.method1353(-111);
        class182.method1239((byte) 81);
        class163.method1104(true);
        class107.method770(17);
        class178.method1211((byte) -74);
        class131.method941((byte) -126);
        class165.method1116(124);
        class26.method220(false);
        class51.method343(true);
        class186.method1261(false);
        class177.method1208(59);
        class129.method933(84);
        class46.method319(1);
        class112.method830(93);
        class193.method1298((byte) 121);
        class44.method309(arg0 ^ 0x2);
        class205.method1348((byte) 44);
        class145.method1018(arg0 - 100);
        class68.method442(arg0 ^ 0x2DF2);
        class13.method84(true);
        class172.method1153(-2);
        class6.method30((byte) 110);
        class24.method215((byte) -85);
        class197.method1309((byte) 73);
        class98.method692((byte) -86);
        class157.method1073(4382);
        class52.method347(arg0 ^ 0x2);
        class40.method296((byte) 105);
        class171.method1152(arg0 ^ 0xA2997A6E);
        class191.method1288(arg0 ^ 0x77);
        class148.method1034(-16);
        class102.method735((byte) -119);
        class21.method196((byte) 0);
        class34.method268((byte) -87);
        class90.method660((byte) -71);
        class92.method670((byte) 127);
        class73.method460(arg0 ^ 0xFFFFF4F3);
        class29.method233(0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method258(byte arg0) {
        class143.field2754++;
        if (class143.field2754 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class90.field1861 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class90.field1855.setSeed((long) class90.field1861);
        }
        this.method249(91);
        field673++;
        class173.method1157(13238);
        class12.method80(false);
        class190.method1285((byte) 111);
        method248(93);
        class111.method821(false);
        if (class141.field2738 != null) {
            int var3 = class141.field2738.method687((byte) 31);
            class46.field963 = var3;
        }
        if (class107.field2123 == 0) {
            class170.method1145(100);
            class39.method289((byte) 1);
        } else if (class107.field2123 == 5) {
            class180.method1223(this, (byte) -59);
            class170.method1145(126);
            class39.method289((byte) 1);
        } else if (class107.field2123 == 10) {
            class180.method1223(this, (byte) -42);
        } else if (class107.field2123 == 20) {
            class180.method1223(this, (byte) 101);
            class174.method1162(true);
        } else if (class107.field2123 == 25) {
            class69.method443(-83);
        }
        if (arg0 > -86) {
            main(null);
        }
        if (class107.field2123 == 30) {
            class201.method1326(-7866);
        } else if (class107.field2123 == 40) {
            class174.method1162(true);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/Class;")
    public static final Class method259(int arg0, int arg1) {
        field675++;
        if (arg1 != -13) {
            return null;
        } else if (arg0 == 0) {
            return field685 == null ? (field685 = method261("ra")) : field685;
        } else if (arg0 == 1) {
            return field686 == null ? (field686 = method261("dd")) : field686;
        } else if (arg0 == 2) {
            return field687 == null ? (field687 = method261("d")) : field687;
        } else if (arg0 == 3) {
            return field688 == null ? (field688 = method261("od")) : field688;
        } else if (arg0 == 4) {
            return field689 == null ? (field689 = method261("wd")) : field689;
        } else if (arg0 == 5) {
            return field690 == null ? (field690 = method261("tg")) : field690;
        } else if (arg0 == 6) {
            return field691 == null ? (field691 = method261("rf")) : field691;
        } else if (arg0 == 7) {
            return field692 == null ? (field692 = method261("ld")) : field692;
        } else if (arg0 == 8) {
            return field693 == null ? (field693 = method261("tc")) : field693;
        } else if (arg0 == 9) {
            return field694 == null ? (field694 = method261("oa")) : field694;
        } else if (arg0 == 10) {
            return field695 == null ? (field695 = method261("rh")) : field695;
        } else if (arg0 == 11) {
            return field696 == null ? (field696 = method261("ce")) : field696;
        } else if (arg0 == 12) {
            return field697 == null ? (field697 = method261("f")) : field697;
        } else if (arg0 == 13) {
            return field698 == null ? (field698 = method261("ub")) : field698;
        } else if (arg0 == 14) {
            return field699 == null ? (field699 = method261("tb")) : field699;
        } else if (arg0 == 15) {
            return field700 == null ? (field700 = method261("nh")) : field700;
        } else if (arg0 == 16) {
            return field701 == null ? (field701 = method261("ee")) : field701;
        } else if (arg0 == 17) {
            return field702 == null ? (field702 = method261("m")) : field702;
        } else if (arg0 == 18) {
            return field703 == null ? (field703 = method261("v")) : field703;
        } else if (arg0 == 19) {
            return field704 == null ? (field704 = method261("ec")) : field704;
        } else if (arg0 == 20) {
            return field705 == null ? (field705 = method261("wc")) : field705;
        } else if (arg0 == 21) {
            return field706 == null ? (field706 = method261("pf")) : field706;
        } else if (arg0 == 22) {
            return field707 == null ? (field707 = method261("gh")) : field707;
        } else if (arg0 == 23) {
            return field708 == null ? (field708 = method261("bb")) : field708;
        } else if (arg0 == 24) {
            return field709 == null ? (field709 = method261("sf")) : field709;
        } else if (arg0 == 25) {
            return field710 == null ? (field710 = method261("ae")) : field710;
        } else if (arg0 == 26) {
            return field711 == null ? (field711 = method261("cc")) : field711;
        } else if (arg0 == 27) {
            return field712 == null ? (field712 = method261("vd")) : field712;
        } else if (arg0 == 28) {
            return field713 == null ? (field713 = method261("kd")) : field713;
        } else if (arg0 == 29) {
            return field714 == null ? (field714 = method261("r")) : field714;
        } else if (arg0 == 30) {
            return field715 == null ? (field715 = method261("fa")) : field715;
        } else if (arg0 == 31) {
            return field716 == null ? (field716 = method261("di")) : field716;
        } else if (arg0 == 32) {
            return field717 == null ? (field717 = method261("se")) : field717;
        } else if (arg0 == 33) {
            return field718 == null ? (field718 = method261("ug")) : field718;
        } else if (arg0 == 34) {
            return field719 == null ? (field719 = method261("q")) : field719;
        } else if (arg0 == 35) {
            return field720 == null ? (field720 = method261("kh")) : field720;
        } else if (arg0 == 36) {
            return field721 == null ? (field721 = method261("qb")) : field721;
        } else if (arg0 == 37) {
            return field722 == null ? (field722 = method261("c")) : field722;
        } else if (arg0 == 38) {
            return field723 == null ? (field723 = method261("dc")) : field723;
        } else if (arg0 == 39) {
            return field724 == null ? (field724 = method261("qa")) : field724;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method260(boolean arg0) {
        if (class90.field1857 != null) {
            class90.field1857.field2938 = false;
        }
        class90.field1857 = null;
        field660++;
        if (class55.field1114 != null) {
            class55.field1114.method915((byte) -40);
            class55.field1114 = null;
        }
        class163.method1106((byte) -48);
        class47.method324(arg0);
        class141.field2738 = null;
        if (class164.field3071 != null) {
            class164.field3071.method50(2);
        }
        if (class41.field872 != null) {
            class41.field872.method50(2);
        }
        class91.method667(!arg0);
        method252((byte) 61);
        try {
            if (class179.field3388 != null) {
                class179.field3388.method469(2);
            }
            if (class93.field1907 != null) {
                for (int var2 = 0; var2 < class93.field1907.length; var2++) {
                    if (class93.field1907[var2] != null) {
                        class93.field1907[var2].method469(2);
                    }
                }
            }
            if (class130.field2521 != null) {
                class130.field2521.method469(2);
            }
            if (field683 != null) {
                field683.method469(2);
            }
        } catch (IOException var3) {
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method261(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field676[var1] = var0 - 1;
            var0 += var0;
        }
        field681 = 0;
        field684 = 3;
    }
}
