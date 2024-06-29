import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class128 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Ldc;")
    public static class37 field669 = class185.method1233((byte) 86, "m");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lib;")
    public static class89 field673 = new class89(0, 0);

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Ldc;")
    public static class37 field683 = class185.method1233((byte) 86, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Ldc;")
    public static class37 field685 = class185.method1233((byte) 86, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field681 = 0;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ldc;")
    public static class37 field684 = class185.method1233((byte) 86, ")2");

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Ldc;")
    private static class37 field680 = class185.method1233((byte) 86, " more options");

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Ldc;")
    public static class37 field687 = field680;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lwa;")
    public static class238 field663;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lig;")
    public static class93 field686;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
    public static boolean field688;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[Lji;")
    public static class106[] field679;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class29.method238(true);
            }
            class43.field918 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class50.field1018 = 0;
            } else if (arg0[1].equals("office")) {
                class50.field1018 = 1;
            } else if (arg0[1].equals("local")) {
                class50.field1018 = 2;
            } else {
                class29.method238(true);
            }
            if (arg0[2].equals("live")) {
                class151.field2860 = 0;
            } else if (arg0[2].equals("rc")) {
                class151.field2860 = 1;
            } else if (arg0[2].equals("wip")) {
                class151.field2860 = 2;
            } else {
                class29.method238(true);
            }
            if (arg0[3].equals("lowmem")) {
                class166.method1117(112);
            } else if (arg0[3].equals("highmem")) {
                class181.method1202(true);
            } else {
                class29.method238(true);
            }
            if (arg0[4].equals("free")) {
                class168.field3203 = false;
            } else if (arg0[4].equals("members")) {
                class168.field3203 = true;
            } else {
                class29.method238(true);
            }
            if (arg0[5].equals("english")) {
                class160.field3033 = 0;
            } else if (arg0[5].equals("german")) {
                class205.method1353(-123);
                class160.field3033 = 1;
            } else {
                class29.method238(true);
            }
            if (arg0[6].equals("game0")) {
                class192.field3592 = 0;
            } else if (arg0[6].equals("game1")) {
                class192.field3592 = 1;
            } else {
                class29.method238(true);
            }
            class97.field1695 = 0;
            class44.field950 = class243.field4462;
            class227.field4180 = "127.0.0.1";
            client var1 = new client();
            var1.method894(class151.field2860 + 32, 498, 26, 765, "runescape", true, 503);
            class131.field2451.setLocation(40, 40);
        } catch (Exception var3) {
            class60.method455(95, var3, null);
        }
        field674++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    private final void method274(boolean arg0) {
        field678++;
        if (class109.field1891 == 1000) {
            return;
        }
        boolean var2 = class194.method1290((byte) -98);
        if (!var2) {
            this.method283(true);
        }
        if (!arg0) {
            method278((byte) -54);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method275(int arg0) {
        class203.field3758++;
        if (arg0 != 45) {
            field687 = null;
        }
        field676++;
        if (class203.field3758 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class220.field4083 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class200.field3719.setSeed((long) class220.field4083);
        }
        this.method274(true);
        class141.method985(1);
        class204.method1344((byte) 114);
        class108.method707((byte) 92);
        class54.method435((byte) 122);
        class15.method109(true);
        if (class92.field1585 != null) {
            int var3 = class92.field1585.method395(-68);
            class108.field1884 = var3;
        }
        if (class109.field1891 == 0) {
            this.method281(6);
            class30.method250((byte) -86);
        } else if (class109.field1891 == 5) {
            class153.method1043(this, (byte) 101);
            this.method281(6);
            class30.method250((byte) -86);
        } else if (class109.field1891 == 10) {
            class153.method1043(this, (byte) 101);
        } else if (class109.field1891 == 20) {
            class153.method1043(this, (byte) 101);
            class99.method658((byte) -1);
        } else if (class109.field1891 == 25) {
            class209.method1391(7566);
        }
        if (class109.field1891 == 30) {
            class121.method832(-1990505050);
        } else if (class109.field1891 == 40) {
            class99.method658((byte) -1);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(III)J")
    public static final long method276(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        return var3 == null || var3.field292 == null ? 0L : var3.field292.field3409;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method277(byte arg0) {
        field670++;
        if (class245.field4476 != null) {
            class245.field4476.field4089 = false;
        }
        if (arg0 != 20) {
            field673 = null;
        }
        class245.field4476 = null;
        if (class180.field3352 != null) {
            class180.field3352.method557(false);
            class180.field3352 = null;
        }
        class196.method1305(class225.field4158, (byte) 34);
        class32.method265(-74, class225.field4158);
        if (class92.field1585 != null) {
            class92.field1585.method396(class225.field4158, (byte) 124);
        }
        class125.method845(arg0 - 20931);
        class66.method485(100);
        class92.field1585 = null;
        if (class68.field1250 != null) {
            class68.field1250.method97(0);
        }
        if (class218.field4075 != null) {
            class218.field4075.method97(0);
        }
        class192.method1281(-18065);
        class95.method639(113);
        try {
            if (class38.field803 != null) {
                class38.field803.method503((byte) 69);
            }
            if (class173.field3294 != null) {
                for (int var2 = 0; var2 < class173.field3294.length; var2++) {
                    if (class173.field3294[var2] != null) {
                        class173.field3294[var2].method503((byte) -30);
                    }
                }
            }
            if (class180.field3351 != null) {
                class180.field3351.method503((byte) -115);
            }
            if (class49.field964 != null) {
                class49.field964.method503((byte) -121);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static final void method278(byte arg0) {
        for (class201 var1 = (class201) class85.field1499.method1042((byte) -25); var1 != null; var1 = (class201) class85.field1499.method1041(true)) {
            int var2 = var1.field3746;
            if (class39.method352(-10924, var2)) {
                boolean var3 = true;
                class136[] var4 = class177.field3344[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2527;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1066;
                    class136 var7 = class180.method1200(var6, (byte) 111);
                    if (var7 != null) {
                        class210.method1395((byte) 29, var7);
                    }
                }
            }
        }
        field677++;
        if (arg0 != 102) {
            field686 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method279(boolean arg0) {
        field665++;
        boolean var2 = false;
        boolean var3 = class190.method1266(false);
        if (var3 && class238.field4376 && class68.field1250 != null) {
            class68.field1250.method96(false);
        }
        if (class194.field3617) {
            var2 = true;
            class194.field3617 = false;
        }
        if (class109.field1891 == 0) {
            class128.method903(null, 5000, class156.field2927, var2, class19.field311);
        } else if (class109.field1891 == 5 || class109.field1891 == 10 || class109.field1891 == 20) {
            class38.method349(class32.field633, field686, 112);
        } else if (class109.field1891 == 25) {
            if (class157.field2986 == 1) {
                if (class6.field65 < class92.field1588) {
                    class6.field65 = class92.field1588;
                }
                int var4 = (class6.field65 - class92.field1588) * 50 / class6.field65;
                class192.method1279(class80.method548(new class37[] { class136.field2649, class181.field3370, class151.method1034((byte) -9, var4), class227.field4186 }, -35), false, false);
            } else if (class157.field2986 == 2) {
                if (class61.field1123 > class75.field1330) {
                    class75.field1330 = class61.field1123;
                }
                int var5 = (class75.field1330 - class61.field1123) * 50 / class75.field1330 + 50;
                class192.method1279(class80.method548(new class37[] { class136.field2649, class181.field3370, class151.method1034((byte) -9, var5), class227.field4186 }, -114), false, false);
            } else {
                class192.method1279(class136.field2649, false, false);
            }
        } else if (class109.field1891 == 30) {
            class106.method686(25602);
        } else if (class109.field1891 == 40) {
            class192.method1279(class80.method548(new class37[] { class103.field1766, class35.field704, class5.field50 }, -32), false, false);
        }
        if (!arg0) {
            field682 = 125;
        }
        Canvas var6 = class225.field4158;
        if (class109.field1891 == 30 && class122.field2175 == 0 && !var2) {
            try {
                Graphics var7 = var6.getGraphics();
                for (int var8 = 0; var8 < class157.field2981; var8++) {
                    if (class85.field1505[var8]) {
                        class224.field4151.method393(class58.field1089[var8], class61.field1121[var8], (byte) 103, class64.field1167[var8], var7, class120.field2139[var8]);
                        class85.field1505[var8] = false;
                    }
                }
            } catch (Exception var11) {
                var6.repaint();
            }
        } else if (class109.field1891 > 0) {
            try {
                Graphics var9 = var6.getGraphics();
                class224.field4151.method394(3, var9, 0, 0);
                for (int var10 = 0; var10 < class157.field2981; var10++) {
                    class85.field1505[var10] = false;
                }
            } catch (Exception var12) {
                var6.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method280(int arg0, byte arg1) {
        class161.field3051 = 0;
        class3.field20++;
        class28.field472 = null;
        field667++;
        if (class77.field1363 == class161.field3036) {
            class161.field3036 = class73.field1298;
        } else {
            class161.field3036 = class77.field1363;
        }
        if (arg1 >= -7) {
            return;
        }
        class147.field2809 = null;
        if (class3.field20 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class109.field1891 > 5) {
                class243.field4454 = 3000;
            } else {
                this.method907(91, "js5connect_full");
                class109.field1891 = 1000;
            }
        } else if (class3.field20 >= 2 && arg0 == 6) {
            this.method907(59, "js5connect_outofdate");
            class109.field1891 = 1000;
        } else if (class3.field20 >= 4) {
            if (class109.field1891 <= 5) {
                this.method907(124, "js5connect");
                class109.field1891 = 1000;
            } else {
                class243.field4454 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field668++;
        if (!this.method905(true)) {
            return;
        }
        class43.field918 = Integer.parseInt(this.getParameter("worldid"));
        class151.field2860 = Integer.parseInt(this.getParameter("modewhat"));
        class50.field1018 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class166.method1117(112);
        } else {
            class181.method1202(true);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class168.field3203 = true;
        } else {
            class168.field3203 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class205.method1353(-123);
            class160.field3033 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class192.field3592 = 1;
        } else {
            class192.field3592 = 0;
        }
        try {
            class66.field1193 = Integer.parseInt(this.getParameter("js"));
            class107.field1876 = Integer.parseInt(this.getParameter("plug"));
            class97.field1695 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class44.field950 = class24.field423.method335(-15988, this);
        if (class44.field950 == null) {
            class44.field950 = class243.field4462;
        }
        class227.field4180 = this.getCodeBase().getHost();
        this.method904(-16273, 498, class151.field2860 + 32, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    private final void method281(int arg0) {
        field664++;
        if (class150.field2837 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class214.method1416(22624);
            if (class149.field2822 == 0L) {
                class149.field2822 = var4;
            }
            if (var3 > 16384 && var4 - class149.field2822 < 5000L) {
                if (var4 - class161.field3050 > 1000L) {
                    System.gc();
                    class161.field3050 = var4;
                }
                class156.field2927 = 5;
                class19.field311 = class237.field4318;
            } else {
                class156.field2927 = 5;
                class150.field2837 = 10;
                class19.field311 = class192.field3585;
            }
        } else if (class150.field2837 == 10) {
            class167.method1120(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class11.field143[var6] = new class163(104, 104);
            }
            class150.field2837 = 30;
            class19.field311 = class164.field3117;
            class156.field2927 = 10;
        } else if (class150.field2837 == 30) {
            class41.field858 = class63.method475((byte) 127, 0, true, true, false);
            class56.field1076 = class63.method475((byte) 127, 1, true, true, false);
            class159.field3005 = class63.method475((byte) 127, 2, true, false, true);
            class203.field3756 = class63.method475((byte) 127, 3, true, true, false);
            class69.field1254 = class63.method475((byte) 127, 4, true, true, false);
            class185.field3416 = class63.method475((byte) 127, 5, true, true, true);
            class68.field1236 = class63.method475((byte) 127, 6, false, true, true);
            class149.field2821 = class63.method475((byte) 127, 7, true, true, false);
            class212.field3958 = class63.method475((byte) 127, 8, true, true, false);
            class144.field2768 = class63.method475((byte) 127, 9, true, false, true);
            class161.field3047 = class63.method475((byte) 127, 10, true, true, false);
            class18.field298 = class63.method475((byte) 127, 11, true, true, false);
            class149.field2824 = class63.method475((byte) 127, 12, true, true, false);
            class211.field3947 = class63.method475((byte) 127, 13, true, false, true);
            class153.field2892 = class63.method475((byte) 127, 14, false, true, false);
            class242.field4443 = class63.method475((byte) 127, 15, true, true, false);
            class200.field3727 = class63.method475((byte) 127, 16, true, true, false);
            class68.field1249 = class63.method475((byte) 127, 17, true, true, false);
            class9.field121 = class63.method475((byte) 127, 18, true, true, false);
            class191.field3569 = class63.method475((byte) 127, 19, true, true, false);
            class79.field1406 = class63.method475((byte) 127, 20, true, true, false);
            class123.field2207 = class63.method475((byte) 127, 21, true, true, false);
            class117.field2097 = class63.method475((byte) 127, 22, true, true, false);
            class56.field1075 = class63.method475((byte) 127, 23, true, true, true);
            class157.field2977 = class63.method475((byte) 127, 24, true, true, false);
            class14.field207 = class63.method475((byte) 127, 25, true, true, false);
            class150.field2837 = 40;
            class156.field2927 = 15;
            class19.field311 = class133.field2470;
        } else if (class150.field2837 == 40) {
            byte var7 = 0;
            int var8 = var7 + class41.field858.method387(31890) * 4 / 100;
            int var9 = var8 + class56.field1076.method387(31890) * 4 / 100;
            int var10 = var9 + class159.field3005.method387(31890) / 100;
            int var11 = var10 + class203.field3756.method387(31890) * 2 / 100;
            int var12 = var11 + class69.field1254.method387(31890) * 6 / 100;
            int var13 = var12 + class185.field3416.method387(arg0 ^ 0x7C94) * 4 / 100;
            int var14 = var13 + class68.field1236.method387(31890) * 2 / 100;
            int var15 = var14 + class149.field2821.method387(arg0 + 31884) * 51 / 100;
            int var16 = var15 + class212.field3958.method387(31890) * 2 / 100;
            int var17 = var16 + class144.field2768.method387(31890) * 2 / 100;
            int var18 = var17 + class161.field3047.method387(31890) * 2 / 100;
            int var19 = var18 + class18.field298.method387(31890) * 2 / 100;
            int var20 = var19 + class149.field2824.method387(31890) * 2 / 100;
            int var21 = var20 + class211.field3947.method387(31890) * 2 / 100;
            int var22 = var21 + class153.field2892.method387(31890) * 2 / 100;
            int var23 = var22 + class242.field4443.method387(31890) * 2 / 100;
            int var24 = var23 + class200.field3727.method387(31890) / 100;
            int var25 = var24 + class68.field1249.method387(31890) / 100;
            int var26 = var25 + class9.field121.method387(arg0 + 31884) / 100;
            int var27 = var26 + class191.field3569.method387(31890) / 100;
            int var28 = var27 + class79.field1406.method387(31890) / 100;
            int var29 = var28 + class123.field2207.method387(31890) / 100;
            int var30 = var29 + class117.field2097.method387(31890) / 100;
            int var31 = var30 + class56.field1075.method387(arg0 ^ 0x7C94) / 100;
            int var32 = var31 + class157.field2977.method387(31890) / 100;
            int var33 = var32 + class14.field207.method387(31890) / 100;
            if (var33 == 100) {
                class156.field2927 = 20;
                class19.field311 = class118.field2110;
                class195.method1301(class68.field1236, class161.field3047, arg0 + 110, class212.field3958);
                class150.field2837 = 45;
            } else {
                if (var33 != 0) {
                    class19.field311 = class80.method548(new class37[] { class94.field1655, class151.method1034((byte) -9, var33), class44.field940 }, -124);
                }
                class156.field2927 = 20;
            }
        } else if (class150.field2837 == 45) {
            class243.method1587(!class16.field259, 22050, (byte) 53, 2);
            class112 var34 = new class112();
            var34.method758((byte) -82, 9, 128);
            class68.field1250 = class110.method712(22050, 0, (byte) 43, class10.field130, class225.field4158);
            class68.field1250.method103(var34, -15878);
            class235.method1519(class69.field1254, var34, class153.field2892, -114, class242.field4443);
            class218.field4075 = class110.method712(2048, 1, (byte) 117, class10.field130, class225.field4158);
            class49.field969 = new class219();
            class218.field4075.method103(class49.field969, -15878);
            class184.field3398 = new class104(22050, class72.field1278);
            class19.field311 = class20.field335;
            class150.field2837 = 50;
            class156.field2927 = 30;
        } else if (class150.field2837 == 50) {
            int var35 = 0;
            if (class212.field3958.method1561(class119.field2124, -1)) {
                var35++;
            }
            if (class212.field3958.method1561(class74.field1316, -1)) {
                var35++;
            }
            if (class212.field3958.method1561(class108.field1882, -1)) {
                var35++;
            }
            if (class211.field3947.method1561(class119.field2124, -1)) {
                var35++;
            }
            if (class211.field3947.method1561(class74.field1316, arg0 ^ 0xFFFFFFF9)) {
                var35++;
            }
            if (class211.field3947.method1561(class108.field1882, -1)) {
                var35++;
            }
            if (var35 < 6) {
                class19.field311 = class80.method548(new class37[] { class190.field3534, class151.method1034((byte) -9, var35 * 100 / 6), class44.field940 }, -100);
                class156.field2927 = 35;
            } else {
                class156.field2927 = 35;
                class19.field311 = class59.field1109;
                class150.field2837 = 60;
            }
        } else if (class150.field2837 == 60) {
            int var36 = class83.method572(27118, class212.field3958, class161.field3047);
            int var37 = class50.method425((byte) -105);
            if (var36 < var37) {
                class19.field311 = class80.method548(new class37[] { class115.field2066, class151.method1034((byte) -9, var36 * 100 / var37), class44.field940 }, arg0 ^ 0xFFFFFFD8);
                class156.field2927 = 40;
            } else {
                class150.field2837 = 65;
                class156.field2927 = 40;
                class19.field311 = class89.field1551;
            }
        } else if (class150.field2837 == 65) {
            field686 = class147.method1014(class211.field3947, class243.field4462, class212.field3958, (byte) 92, class119.field2124);
            class156.field2943 = (class90) field686;
            class190.field3468 = class147.method1014(class211.field3947, class243.field4462, class212.field3958, (byte) 87, class74.field1316);
            class32.field633 = class147.method1014(class211.field3947, class243.field4462, class212.field3958, (byte) 95, class108.field1882);
            class156.field2927 = 45;
            class19.field311 = class44.field935;
            class236.method1525(5, 27172);
            class150.field2837 = 70;
        } else if (class150.field2837 == 70) {
            class159.field3005.method1538((byte) -13);
            byte var38 = 0;
            int var39 = var38 + class159.field3005.method1552((byte) 123);
            class200.field3727.method1538((byte) -13);
            int var40 = var39 + class200.field3727.method1552((byte) 125);
            class68.field1249.method1538((byte) -13);
            int var41 = var40 + class68.field1249.method1552((byte) 124);
            class9.field121.method1538((byte) -13);
            int var42 = var41 + class9.field121.method1552((byte) 126);
            class191.field3569.method1538((byte) -13);
            int var43 = var42 + class191.field3569.method1552((byte) 127);
            class79.field1406.method1538((byte) -13);
            int var44 = var43 + class79.field1406.method1552((byte) 124);
            class123.field2207.method1538((byte) -13);
            int var45 = var44 + class123.field2207.method1552((byte) 126);
            class117.field2097.method1538((byte) -13);
            int var46 = var45 + class117.field2097.method1552((byte) 125);
            class157.field2977.method1538((byte) -13);
            int var47 = var46 + class157.field2977.method1552((byte) 123);
            class14.field207.method1538((byte) -13);
            int var48 = var47 + class14.field207.method1552((byte) 125);
            if (var48 < 1000) {
                class19.field311 = class80.method548(new class37[] { class163.field3101, class151.method1034((byte) -9, var48 / 10), class44.field940 }, -114);
                class156.field2927 = 50;
            } else {
                class160.method1074(class159.field3005, (byte) 110);
                class112.method771((byte) -123, class159.field3005);
                class18.method124((byte) -109, class159.field3005, class149.field2821);
                class218.method1443(class200.field3727, class16.field259, class149.field2821, (byte) -57, class168.field3203);
                class35.method293(class149.field2821, class9.field121, false);
                class238.method1558(class168.field3203, (byte) 119, class156.field2943, class149.field2821, class191.field3569);
                class23.method167(class56.field1076, class41.field858, 1024, class79.field1406);
                class173.method1172(class149.field2821, class123.field2207, 1949);
                class209.method1387(class117.field2097, (byte) 111);
                class157.method1062(class159.field3005, -128);
                class229.method1483(class211.field3947, class149.field2821, false, class212.field3958, class203.field3756);
                class167.method1124(class159.field3005, 125);
                class89.method592(class68.field1249, 0);
                class69.method506((byte) 83, class157.field2977, new class174(), class14.field207);
                class68.method501(class14.field207, class157.field2977, 75);
                class156.field2927 = 50;
                class19.field311 = class8.field104;
                class10.method69((byte) -118);
                class150.field2837 = 80;
            }
        } else if (class150.field2837 == 80) {
            int var49 = 0;
            if (class18.field277 == null) {
                class182 var50 = class106.method685(class212.field3958, 126, class243.field4462, class34.field695);
                if (var50 != null) {
                    var50.method1216();
                    class18.field277 = var50;
                }
            } else {
                var49++;
            }
            if (class217.field4042 == null) {
                class217.field4042 = class244.method1590(class102.field1761, class212.field3958, (byte) -81, class243.field4462);
            } else {
                var49++;
            }
            if (class54.field1058 == null) {
                class54.field1058 = class206.method1360(class8.field92, class243.field4462, class212.field3958, arg0 + 24294);
            } else {
                var49++;
            }
            if (class170.field3241 == null) {
                class170.field3241 = class221.method1457(class128.field2421, true, class243.field4462, class212.field3958);
            } else {
                var49++;
            }
            if (class201.field3750 == null) {
                class201.field3750 = class221.method1457(class97.field1702, true, class243.field4462, class212.field3958);
            } else {
                var49++;
            }
            if (class239.field4399 == null) {
                class239.field4399 = class221.method1457(class165.field3145, true, class243.field4462, class212.field3958);
            } else {
                var49++;
            }
            if (class12.field174 == null) {
                class12.field174 = class221.method1457(class149.field2825, true, class243.field4462, class212.field3958);
            } else {
                var49++;
            }
            if (class18.field270 == null) {
                class18.field270 = class221.method1457(class242.field4435, true, class243.field4462, class212.field3958);
            } else {
                var49++;
            }
            if (class83.field1475 == null) {
                class182[] var51 = class206.method1360(class201.field3754, class243.field4462, class212.field3958, 24300);
                if (var51 != null) {
                    for (int var52 = 0; var52 < var51.length; var52++) {
                        var51[var52].method1216();
                    }
                    class83.field1475 = var51;
                }
            } else {
                var49++;
            }
            if (class229.field4206 == null) {
                class229.field4206 = class24.method168(class212.field3958, class220.field4084, -95, class243.field4462);
            } else {
                var49++;
            }
            if (class24.field416 == null) {
                class24.field416 = class221.method1457(class8.field91, true, class243.field4462, class212.field3958);
            } else {
                var49++;
            }
            if (field679 == null) {
                field679 = class221.method1457(class39.field821, true, class243.field4462, class212.field3958);
            } else {
                var49++;
            }
            if (class181.field3374 == null) {
                class181.field3374 = class41.method360(class38.field804, class212.field3958, class243.field4462, true);
            } else {
                var49++;
            }
            if (class5.field33 == null) {
                class5.field33 = class41.method360(class119.field2134, class212.field3958, class243.field4462, true);
            } else {
                var49++;
            }
            var49++;
            if (var49 < 15) {
                class19.field311 = class80.method548(new class37[] { class125.field2244, class151.method1034((byte) -9, var49 * 100 / 15), class44.field940 }, -37);
                class156.field2927 = 60;
            } else {
                field686.method617(class5.field33, null);
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                class190.field3468.method617(class5.field33, null);
                int var56 = (int) (Math.random() * 41.0D) - 20;
                class32.field633.method617(class5.field33, null);
                for (int var57 = 0; var57 < class54.field1058.length; var57++) {
                    class54.field1058[var57].method1218(var54 + var56, var53 + var56, var55 + var56);
                }
                class217.field4042[0].method1023(var54 + var56, var53 + var56, var55 + var56);
                class156.field2927 = 60;
                class150.field2837 = 90;
                class19.field311 = class197.field3676;
                class112.field1983 = class54.field1058;
            }
        } else if (arg0 == 6) {
            if (class150.field2837 == 90) {
                if (class144.field2768.method1538((byte) -13)) {
                    class189 var58 = new class189(class144.field2768, class212.field3958, 20, class16.field259 ? 64 : 128);
                    class169.method1138(var58);
                    class169.method1136(0.7F);
                    class150.field2837 = 110;
                    class156.field2927 = 70;
                    class19.field311 = class207.field3878;
                } else {
                    class19.field311 = class80.method548(new class37[] { class114.field2033, class151.method1034((byte) -9, class144.field2768.method1552((byte) 123)), class44.field940 }, arg0 - 117);
                    class156.field2927 = 70;
                }
            } else if (class150.field2837 == 110) {
                class245.field4476 = new class220();
                class10.field130.method141(10, class245.field4476, (byte) 72);
                class150.field2837 = 120;
                class19.field311 = class107.field1858;
                class156.field2927 = 75;
            } else if (class150.field2837 == 120) {
                if (class161.field3047.method1566(-76, class240.field4402, class243.field4462)) {
                    class239 var59 = new class239(class161.field3047.method1540(class240.field4402, class243.field4462, 86));
                    class201.method1329(arg0 + 53, var59);
                    class19.field311 = class133.field2471;
                    class150.field2837 = 130;
                    class156.field2927 = 80;
                } else {
                    class19.field311 = class80.method548(new class37[] { class243.field4459, class217.field4028 }, arg0 - 117);
                    class156.field2927 = 80;
                }
            } else if (class150.field2837 == 130) {
                if (!class203.field3756.method1538((byte) -13)) {
                    class19.field311 = class80.method548(new class37[] { class196.field3674, class151.method1034((byte) -9, class203.field3756.method1552((byte) 125) * 4 / 5), class44.field940 }, -116);
                    class156.field2927 = 85;
                } else if (!class149.field2824.method1538((byte) -13)) {
                    class19.field311 = class80.method548(new class37[] { class196.field3674, class151.method1034((byte) -9, class149.field2824.method1552((byte) 126) / 6 + 80), class44.field940 }, -103);
                    class156.field2927 = 85;
                } else if (class211.field3947.method1538((byte) -13)) {
                    class150.field2837 = 140;
                    class156.field2927 = 100;
                    class19.field311 = class104.field1811;
                } else {
                    class19.field311 = class80.method548(new class37[] { class196.field3674, class151.method1034((byte) -9, class211.field3947.method1552((byte) 127) / 20 + 96), class44.field940 }, -118);
                    class156.field2927 = 85;
                }
            } else if (class150.field2837 == 140) {
                class185.field3416.method1560(false, true, (byte) 54);
                class68.field1236.method1560(true, true, (byte) 37);
                class212.field3958.method1560(true, true, (byte) 28);
                class211.field3947.method1560(true, true, (byte) 22);
                class161.field3047.method1560(true, true, (byte) 88);
                class236.method1525(10, 27172);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method282(byte arg0) {
        field662++;
        class77.field1363 = class50.field1018 == 0 ? 43594 : class43.field918 + 40000;
        if (class192.field3592 == 1) {
            class147.field2797 = class138.field2684;
            class196.field3667 = class95.field1668;
            class101.field1752 = class158.field2990;
            class99.field1728 = class221.field4100;
        } else {
            class99.field1728 = class70.field1268;
            class147.field2797 = class73.field1297;
            class196.field3667 = class135.field2493;
            class101.field1752 = class241.field4422;
        }
        class161.field3036 = class77.field1363;
        class165.field3129 = class209.field3933 = class191.field3572 = class39.field822 = new short[256];
        class73.field1298 = class50.field1018 == 0 ? 443 : class43.field918 + 50000;
        class80.method549((byte) 103);
        class79.method541((byte) 127, class225.field4158);
        class104.method679(95, class225.field4158);
        int var2 = -77 / ((arg0 - 77) / 44);
        class92.field1585 = class123.method837(0);
        if (class92.field1585 != null) {
            class92.field1585.method397(13474, class225.field4158);
        }
        class137.field2665 = class21.field349;
        try {
            if (class10.field130.field345 != null) {
                class38.field803 = new class68(class10.field130.field345, 5200, 0);
                for (int var3 = 0; var3 < 26; var3++) {
                    class173.field3294[var3] = new class68(class10.field130.field350[var3], 6000, 0);
                }
                class180.field3351 = new class68(class10.field130.field356, 6000, 0);
                class164.field3108 = new class32(255, class38.field803, class180.field3351, 500000);
                class49.field964 = new class68(class10.field130.field341, 24, 0);
                class10.field130.field345 = null;
                class10.field130.field350 = null;
                class10.field130.field341 = null;
                class10.field130.field356 = null;
            }
        } catch (IOException var4) {
            class38.field803 = null;
            class180.field3351 = null;
            class49.field964 = null;
            class164.field3108 = null;
        }
        if (class50.field1018 != 0) {
            class183.field3378 = true;
        }
        class131.field2459 = class235.field4279;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    private final void method283(boolean arg0) {
        field671++;
        if (class166.field3165 >= 4) {
            this.method907(-126, "js5crc");
            class109.field1891 = 1000;
            return;
        }
        if (class117.field2100 >= 4) {
            if (class109.field1891 <= 5) {
                this.method907(-88, "js5io");
                class109.field1891 = 1000;
                return;
            }
            class117.field2100 = 3;
            class243.field4454 = 3000;
        }
        if (class243.field4454-- > 0) {
            return;
        }
        try {
            if (class161.field3051 == 0) {
                class147.field2809 = class10.field130.method142(class227.field4180, class161.field3036, 126);
                class161.field3051++;
            }
            if (class161.field3051 == 1) {
                if (class147.field2809.field2461 == 2) {
                    this.method280(-1, (byte) -64);
                    return;
                }
                if (class147.field2809.field2461 == 1) {
                    class161.field3051++;
                }
            }
            if (class161.field3051 == 2) {
                class28.field472 = new class81((Socket) class147.field2809.field2465, class10.field130);
                class28 var2 = new class28(5);
                var2.method214((byte) 106, 15);
                var2.method183(498, -1137894376);
                class28.field472.method558(30000, 5, 0, var2.field502);
                class161.field3051++;
                class207.field3869 = class214.method1416(22624);
            }
            if (class161.field3051 == 3) {
                if (class109.field1891 <= 5 || class28.field472.method554(-80) > 0) {
                    int var3 = class28.field472.method552((byte) 10);
                    if (var3 != 0) {
                        this.method280(var3, (byte) -123);
                        return;
                    }
                    class161.field3051++;
                } else if (class214.method1416(22624) - class207.field3869 > 30000L) {
                    this.method280(-2, (byte) -42);
                    return;
                }
            }
            if (class161.field3051 == 4) {
                class66.method487(class28.field472, 0, class109.field1891 > 20);
                class28.field472 = null;
                class147.field2809 = null;
                class3.field20 = 0;
                class161.field3051 = 0;
            }
            if (!arg0) {
                field673 = null;
            }
        } catch (IOException var4) {
            this.method280(-3, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lf;Z)V")
    public static final void method284(class55 arg0, boolean arg1) {
        if (arg0.field1072 != null) {
            arg0.field1072.field954 = 0;
        }
        field675++;
        arg0.field1070 = false;
        if (arg1) {
            for (class55 var2 = arg0.method438(); var2 != null; var2 = arg0.method437()) {
                method284(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method285(byte arg0) {
        field663 = null;
        field685 = null;
        field680 = null;
        field673 = null;
        field679 = null;
        field686 = null;
        field669 = null;
        field683 = null;
        field684 = null;
        field687 = null;
        if (arg0 <= 48) {
            method284(null, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method286(byte arg0) {
        field672++;
        method285((byte) 101);
        class37.method343((byte) 89);
        class128.method897(false);
        class39.method351(true);
        class173.method1171(-78);
        class220.method1454(-95);
        class25.method172((byte) 125);
        class28.method209(-81);
        class81.method553((byte) 25);
        class44.method383(false);
        class68.method492((byte) -86);
        class32.method260(arg0 - 152);
        class66.method483(2047);
        class233.method1501(false);
        class93.method609();
        class163.method1098(0);
        class106.method695(3);
        class100.method661(true);
        class136.method945(-21558);
        class123.method839(-1803925744);
        class203.method1333(-1);
        class153.method1048(46);
        class143.method996(arg0 ^ 0x3B);
        class131.method918(0);
        class205.method1351(-20234);
        class15.method100(arg0 - 15731);
        class104.method674(true);
        class115.method803(-121);
        class208.method1384(arg0 ^ 0xFFFFAF7A);
        class190.method1268(-3);
        class166.method1114(109);
        class206.method1365(arg0 ^ 0xFFFFFFF9);
        class201.method1331(117);
        class54.method434((byte) -11);
        class150.method1029(-31834);
        class215.method1419(arg0 + 586448393);
        class176.method1185(-1);
        class101.method663(21150);
        class241.method1580(8404);
        class138.method963(false);
        class65.method479(85);
        class18.method127(arg0 + 199);
        class94.method632(arg0 ^ 0x38);
        class127.method891(2048);
        class88.method588(128);
        class184.method1230((byte) -36);
        class58.method446(arg0 ^ 0x38);
        class149.method1025(-1686910681);
        class237.method1531(false);
        class116.method812();
        class3.method27(32);
        class168.method1126(0);
        class30.method247(-125);
        class77.method532(-1399);
        class238.method1554(-1);
        class14.method89(arg0 - 152);
        class126.method867();
        class17.method120(-66);
        class125.method857(true);
        class42.method372();
        class72.method514(-7897);
        class26.method173((byte) 51);
        class214.method1415((byte) -100);
        class164.method1108(arg0 ^ 0x30);
        class16.method114(-119);
        class11.method72(-122);
        class112.method786((byte) -90);
        class35.method289(49);
        class109.method711(-107);
        class118.method816(true);
        class183.method1226(32);
        class74.method522((byte) 88);
        class59.method450((byte) 61);
        class62.method469(0);
        class231.method1495(false);
        class147.method1018(0);
        class235.method1518(-107);
        class49.method421(-1);
        class216.method1422();
        class162.method1087(-125);
        class19.method128((byte) 120);
        class122.method834((byte) 107);
        class85.method579((byte) 87);
        class12.method80(-2903);
        class124.method843(17);
        class223.method1466((byte) -117);
        class194.method1292(-1);
        class167.method1121((byte) -83);
        class191.method1274(0);
        class152.method1040((byte) 24);
        class29.method240((byte) -87);
        class207.method1374(128);
        class142.method993(arg0 ^ 0x38);
        class139.method976(-4);
        class174.method1174(true);
        class160.method1072(arg0 - 56);
        class48.method419();
        class189.method1259(false);
        class200.method1318(54);
        class169.method1142();
        class239.method1567(true);
        class52.method430(36);
        class232.method1500((byte) -127);
        class43.method378(-13488);
        class117.method814(false);
        class218.method1445(0);
        class108.method708((byte) 74);
        class187.method1243();
        class50.method426((byte) -3);
        class217.method1438(-89);
        class144.method1001((byte) 67);
        class51.method427((byte) -14);
        class60.method454(-119);
        class114.method797(63);
        class99.method656(15380);
        class213.method1414();
        class70.method510((byte) -128);
        class69.method508(arg0 - 54);
        class171.method1161((byte) -113);
        class185.method1234((byte) 123);
        class140.method979(arg0 - 55);
        class73.method517(arg0 + 35);
        class86.method583(arg0 ^ 0xC1BE5919);
        class119.method820((byte) -124);
        class120.method823(-24181);
        class133.method926((byte) 53);
        class222.method1465(true);
        class210.method1401(-30192);
        class240.method1573(1000);
        class244.method1591((byte) -126);
        class13.method83((byte) -80);
        class170.method1154(arg0 ^ 0x72);
        class96.method643(arg0 + 53);
        class212.method1409((byte) -73);
        class135.method940(-75);
        class229.method1486(70);
        class179.method1193();
        class27.method174();
        class20.method134(124);
        class36.method299();
        class105.method683((byte) 39);
        class188.method1254();
        class165.method1113(false);
        class67.method489((byte) 49);
        class83.method568((byte) -93);
        class102.method667(100);
        class107.method705(-109);
        class22.method148();
        class234.method1517();
        class2.method23(-96);
        class23.method160(true);
        class246.method1597(20);
        class82.method564(arg0 ^ 0xFFFFB7AC);
        class198.method1314(75);
        class121.method827((byte) 125);
        class113.method795((byte) 59);
        class236.method1527(118);
        class221.method1462(-117);
        class151.method1036(10);
        class195.method1300(true);
        class228.method1481((byte) 67);
        class193.method1285(true);
        class61.method457((byte) 74);
        class103.method672(arg0 ^ 0xFFFFFF88);
        class92.method604(true);
        class245.method1595((byte) -22);
        class230.method1490(-22323);
        class192.method1276(69);
        class157.method1063(-2);
        class75.method526(arg0 + 4040);
        class31.method258(true);
        class161.method1082(true);
        class76.method530((byte) -95);
        class34.method287((byte) 104);
        class242.method1581((byte) -23);
        class145.method1006(111);
        class5.method42((byte) 49);
        class211.method1402(-29876505);
        class10.method66(0);
        class177.method1186(104);
        class155.method1055(5864);
        class159.method1069(false);
        class56.method443(arg0 ^ 0x39);
        class91.method600(17);
        class196.method1306(-98);
        if (arg0 != 56) {
            return;
        }
        class95.method637((byte) 93);
        class79.method545(0);
        class243.method1585(0);
        class227.method1480(arg0 - 10003);
        class129.method910(-43);
        class80.method550(true);
        class199.method1316(false);
        class78.method538(6);
        class38.method350(-31116);
        class41.method359(6094);
        class8.method59((byte) 2);
        class181.method1201(arg0 ^ 0x7265);
        class158.method1067((byte) -28);
        class63.method476((byte) 62);
        class225.method1478(-789436973);
        class156.method1060((byte) 84);
        class24.method170(false);
        class6.method46(128);
        class9.method64(11);
        class97.method647(true);
        class224.method1474((byte) -113);
        class64.method477(true);
        class141.method983(2);
        class7.method49(true);
        class180.method1194((byte) -104);
        class89.method593(-111);
        class197.method1311(-13896);
        class204.method1347(-118);
        class209.method1393((byte) 65);
        class137.method955((byte) 64);
        class110.method716((byte) 107);
    }
}
