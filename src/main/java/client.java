import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class457 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2876 = 0;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2870 = 0;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lrn;")
    public static class174 field2873 = new class174(8, 0);

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field2887;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1335(byte arg0) {
        field2879++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class303.method1917(122);
        class519.field7726 = new class102(class368.field5553);
        class405.field6072 = new class103();
        if (class446.field6661 != class423.field6322) {
            class271.field3918 = new byte[50][];
        }
        class443.field6623 = new class474(class368.field5553);
        if (class446.field6661 == class423.field6322) {
            class171.field2649 = this.getCodeBase().getHost();
            class307.field4693 = 43594;
            class308.field4706 = 443;
        } else if (class234.method1540((byte) -104, class423.field6322)) {
            class171.field2649 = this.getCodeBase().getHost();
            class307.field4693 = class306.field4681 + 40000;
            class308.field4706 = class306.field4681 + 50000;
        } else if (class423.field6322 == class177.field2702) {
            class171.field2649 = "127.0.0.1";
            class308.field4706 = class306.field4681 + 50000;
            class307.field4693 = class306.field4681 + 40000;
        }
        class175.field2679 = class308.field4706;
        class132.field2082 = class307.field4693;
        class315.field4742 = class171.field2649;
        class503.field7420 = class307.field4693;
        if (class428.field6357 == class403.field6054) {
            class45.field834 = class432.field6425;
            class124.field2008 = class168.field2612;
            class420.field6277 = true;
            class246.field3537 = class413.field6166;
            class83.field1436 = class147.field2355;
            class175.field2682 = 0;
            class170.field2635 = 16777215;
        } else {
            class45.field834 = class514.field7562;
            class124.field2008 = class330.field4981;
            class246.field3537 = class294.field4190;
            class83.field1436 = class203.field2972;
        }
        class163.field2527 = class519.field7724 = class240.field3447 = class173.field2663 = new short[256];
        int var3 = 58 / ((arg0 - 23) / 37);
        class187.field2793 = class503.field7420;
        if (class293.field4179 == 3) {
            class487.field7219 = class306.field4681;
        }
        class380.field5726 = class304.method1997(class370.field5611, 118);
        class166.field2579 = class151.method1153(class370.field5611, (byte) 84, true);
        class477.field7122 = class329.method2115((byte) -32);
        if (class477.field7122 != null) {
            class477.field7122.method2829(class370.field5611, -29157);
        }
        class308.field4715 = class293.field4179;
        try {
            if (class368.field5553.field4166 != null) {
                class36.field693 = new class101(class368.field5553.field4166, 5200, 0);
                for (int var4 = 0; var4 < 30; var4++) {
                    class486.field7209[var4] = new class101(class368.field5553.field4173[var4], 6000, 0);
                }
                class66.field1149 = new class101(class368.field5553.field4163, 6000, 0);
                class193.field2855 = new class438(255, class36.field693, class66.field1149, 500000);
                class1.field15 = new class101(class368.field5553.field4176, 24, 0);
                class368.field5553.field4166 = null;
                class368.field5553.field4173 = null;
                class368.field5553.field4163 = null;
                class368.field5553.field4176 = null;
            }
        } catch (IOException var5) {
            class193.field2855 = null;
            class66.field1149 = null;
            class1.field15 = null;
            class36.field693 = null;
        }
        if (class446.field6661 != class423.field6322) {
            class109.field1828 = true;
        }
        class427.field6347 = (class403.field6054 == class168.field2608 ? class87.field1523 : class4.field108).method2180(field2870, 29491);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1336() {
        int var0 = class409.field6135;
        int[] var1 = class358.field5445;
        int var2 = class267.field3844 ? var0 : class510.field7529 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class517 var4;
            if (var3 < var0) {
                var4 = class183.field2747[var1[var3]];
            } else {
                var4 = class34.field668[class148.field2363[var3 - var0]];
            }
            if (var4.field7630 >= 0) {
                int var5 = var4.method1654(101);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6228 & 0x7F) == 0 && (var4.field6233 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6228 & 0x7F) == 64 && (var4.field6233 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class256 && var4.field7689 != null && class531.field7821 >= var4.field7689.field2441 && class531.field7821 < var4.field7689.field2448) {
                    ((class256) var4).field3692 = false;
                }
                var4.field6230 = class343.method2188(var4.field6232, var4.field6228, (byte) -102, var4.field6233);
                class84.method651(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1337(int arg0) {
        field2881++;
        if (class281.field4023 == 1000) {
            return;
        }
        class531.field7821++;
        if (class531.field7821 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class106.field1772 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class60.field1059.setSeed((long) class106.field1772);
        }
        if ((class531.field7821 % 50) == 0) {
            class124.field2007 = class451.field6739;
            class341.field5147 = class368.field5568;
            class451.field6739 = 0;
            class368.field5568 = 0;
        }
        this.method1346((byte) -94);
        if (class11.field177 != null) {
            class11.field177.method2297((byte) 119);
        }
        class147.method1131((byte) -97);
        class380.field5726.method1588((byte) 39);
        class166.field2579.method1020((byte) 69);
        if (class477.field7122 != null) {
            int var3 = class477.field7122.method2828((byte) -106);
            class50.field908 = var3;
        }
        if (class4.field109 != null) {
            class4.field109.method213((int) class211.method1419(12921));
        }
        class300.method1897((byte) -128);
        if (arg0 != -23077) {
            method1338(-83);
        }
        class483.field7187 = 0;
        for (class156 var4 = class380.field5726.method1585((byte) -109); var4 != null && class483.field7187 < 128; var4 = class380.field5726.method1585((byte) -113)) {
            if (var4.method1170(4) != 1) {
                char var5 = var4.method1176((byte) 73);
                if (!class177.method1265(arg0 ^ 0x708F) || var5 != '`' && var5 != '§') {
                    class109.field1842[class483.field7187] = var4;
                    class483.field7187++;
                } else if (class370.method2316(arg0 + 23089)) {
                    class47.method445(4096);
                } else {
                    class42.method423((byte) 93);
                }
            }
        }
        for (class432 var6 = class166.field2579.method1015(false); var6 != null; var6 = class166.field2579.method1015(false)) {
            int var7 = var6.method2187((byte) 11);
            if (var7 == -1) {
                class449.field6726.method2417(-124, var6);
            } else if (class491.method2922(var7, (byte) -128)) {
                class502.field7411.method2417(-123, var6);
            }
            if (class502.field7411.method2420(0) > 10) {
                class502.field7411.method2423(0);
            }
        }
        if (class370.method2316(44)) {
            class294.method1874(false);
        }
        if (class281.field4023 == 0) {
            this.method1341(true);
            class466.method2762((byte) 79);
        } else if (class281.field4023 == 5) {
            this.method1341(true);
            class466.method2762((byte) 50);
        } else if (class281.field4023 == 25 || class281.field4023 == 28) {
            class365.method2285(19429);
        }
        if (class281.field4023 == 10) {
            this.method1344(2048);
            class483.method2879((byte) -41);
            class100.method744(arg0 + 23018);
            class41.method412(115);
        } else if (class281.field4023 == 30) {
            class33.method357(-84);
        } else if (class281.field4023 == 40) {
            class41.method412(arg0 ^ 0xFFFFA5A9);
            if (class68.field1169 != -3 && class68.field1169 != 2 && class68.field1169 != 15) {
                class217.method1446(false);
            }
        }
        class26.method315(class4.field109, -32178);
        class502.field7411.method2423(0);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field2873 = null;
        if (arg0 >= -31) {
            field2873 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2875++;
        if (!this.method2720(false)) {
            return;
        }
        class306.field4681 = Integer.parseInt(this.getParameter("worldid"));
        class423.field6322 = class135.method1010(Integer.parseInt(this.getParameter("modewhere")), false);
        if (!class234.method1540((byte) -104, class423.field6322) && class446.field6661 != class423.field6322) {
            class423.field6322 = class446.field6661;
        }
        class86.field1505 = class86.method665(-120, Integer.parseInt(this.getParameter("modewhat")));
        if (class86.field1505 != class521.field7739 && class86.field1505 != class427.field6346 && class86.field1505 != class296.field4205) {
            class86.field1505 = class296.field4205;
        }
        try {
            field2870 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            field2870 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class302.field4284 = true;
        } else {
            class302.field4284 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class61.field1073 = true;
        } else {
            class61.field1073 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class528.field7788 = true;
        } else {
            class528.field7788 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class403.field6054 = class428.field6357;
        } else {
            class403.field6054 = class168.field2608;
        }
        try {
            class110.field1871 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class110.field1871 = 0;
        }
        class403.field6055 = this.getParameter("quiturl");
        class66.field1138 = this.getParameter("settings");
        if (class66.field1138 == null) {
            class66.field1138 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class233.field3400 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class233.field3400 = 0;
            }
        }
        class518.field7708 = Integer.parseInt(this.getParameter("colourid"));
        if (class518.field7708 < 0 || class215.field3097.length <= class518.field7708) {
            class518.field7708 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class485.field7207 = true;
            class110.field1867 = true;
        }
        if (class403.field6054 == class168.field2608) {
            class25.field543 = 765;
            class347.field5193 = 503;
        } else if (class428.field6357 == class403.field6054) {
            class25.field543 = 640;
            class347.field5193 = 480;
        }
        class19.field322 = this;
        this.method2726(590, (byte) -90, class347.field5193, class86.field1505.method2204(-4553) + 32, class25.field543);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method1339(int arg0) {
        field2883++;
        String var2 = null;
        try {
            var2 = "[1)" + class200.field2931 + "," + class403.field6059 + "," + class33.field662 + "," + class121.field1966 + "|";
            if (class139.field2224 != null) {
                var2 = var2 + "2)" + class163.field2525 + "," + (class139.field2224.field7692[0] + class200.field2931) + "," + (class139.field2224.field7694[0] + class403.field6059) + "|";
            }
            var2 = var2 + "3)" + class169.field2624 + "|4)" + class443.field6623.field610 + "|5)" + class8.method43(false) + "|6)" + class466.field6952 + "," + class77.field1297 + "|";
            var2 = var2 + "7)" + class443.field6623.method337(class169.field2624, (byte) 114) + "|";
            var2 = var2 + "8)" + class443.field6623.method338(-4, class169.field2624) + "|";
            var2 = var2 + "9)" + class443.field6623.field629 + "|";
            if (arg0 != 0) {
                return null;
            }
            var2 = var2 + "10)" + class443.field6623.field616 + "|";
            var2 = var2 + "11)" + class443.field6623.field623 + "|";
            var2 = var2 + "12)" + class443.field6623.method2840(255, class169.field2624) + "|";
            var2 = var2 + "13)" + class457.field6854 + "]";
        } catch (Throwable var3) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmq;)Z")
    public static final boolean method1340(class350 arg0) {
        if (class210.field3027) {
            if (method1349(arg0).field3585 != 0) {
                return false;
            }
            if (arg0.field5215 == 0) {
                return false;
            }
        }
        return arg0.field5358;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method1341(boolean arg0) {
        if (!class443.field6623.field608) {
            for (int var2 = 0; var2 < class483.field7187; var2++) {
                if (class109.field1842[var2].method1176((byte) 35) == 's' || class109.field1842[var2].method1176((byte) 103) == 'S') {
                    class443.field6623.field608 = true;
                    break;
                }
            }
        }
        field2886++;
        if (class6.field131 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class211.method1419(12921);
            if (class48.field888 == 0L) {
                class48.field888 = var5;
            }
            if (var4 > 16384 && var5 - class48.field888 < 5000L) {
                if (var5 - class520.field7727 > 1000L) {
                    System.gc();
                    class520.field7727 = var5;
                }
                class12.field207 = class146.field2329.method2180(field2870, 29491);
                class35.field672 = 5;
            } else {
                class12.field207 = class83.field1450.method2180(field2870, 29491);
                class35.field672 = 5;
                class6.field131 = 10;
            }
        } else if (class6.field131 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class141.field2244[var7] = class78.method615(class33.field662, false, class121.field1966);
            }
            class12.field207 = class162.field2514.method2180(field2870, 29491);
            class6.field131 = 20;
            class35.field672 = 10;
        } else if (class6.field131 == 20) {
            if (class11.field177 == null) {
                class11.field177 = new class367(class405.field6072, class519.field7726);
            }
            if (class11.field177.method2296(124)) {
                class98.field1634 = class157.method1178(1, (byte) 2, 0, false, true);
                class80.field1417 = class157.method1178(1, (byte) 2, 1, false, true);
                class445.field6649 = class157.method1178(1, (byte) 2, 2, false, true);
                class451.field6741 = class157.method1178(1, (byte) 2, 3, false, true);
                class209.field3017 = class157.method1178(1, (byte) 2, 4, false, true);
                class5.field122 = class157.method1178(1, (byte) 2, 5, true, true);
                class84.field1455 = class157.method1178(1, (byte) 2, 6, true, false);
                class474.field7088 = class157.method1178(1, (byte) 2, 7, false, true);
                class151.field2407 = class157.method1178(1, (byte) 2, 8, false, true);
                class109.field1800 = class157.method1178(1, (byte) 2, 9, false, true);
                class268.field3857 = class157.method1178(1, (byte) 2, 10, false, true);
                class285.field4069 = class157.method1178(1, (byte) 2, 11, false, true);
                class201.field2946 = class157.method1178(1, (byte) 2, 12, false, true);
                class76.field1270 = class157.method1178(1, (byte) 2, 13, false, true);
                class260.field3788 = class157.method1178(1, (byte) 2, 14, false, false);
                class50.field901 = class157.method1178(1, (byte) 2, 15, false, true);
                class138.field2214 = class157.method1178(1, (byte) 2, 16, false, true);
                class290.field4133 = class157.method1178(1, (byte) 2, 17, false, true);
                class466.field6955 = class157.method1178(1, (byte) 2, 18, false, true);
                class488.field7222 = class157.method1178(1, (byte) 2, 19, false, true);
                class20.field333 = class157.method1178(1, (byte) 2, 20, false, true);
                class368.field5571 = class157.method1178(1, (byte) 2, 21, false, true);
                class352.field5394 = class157.method1178(1, (byte) 2, 22, false, true);
                class407.field6109 = class157.method1178(1, (byte) 2, 23, true, true);
                class56.field981 = class157.method1178(1, (byte) 2, 24, false, true);
                class457.field6853 = class157.method1178(1, (byte) 2, 25, false, true);
                class419.field6273 = class157.method1178(1, (byte) 2, 26, true, true);
                class57.field1008 = class157.method1178(1, (byte) 2, 27, false, true);
                class100.field1641 = class157.method1178(1, (byte) 2, 28, true, true);
                class42.field789 = class157.method1178(1, (byte) 2, 29, false, true);
                class12.field207 = class320.field4902.method2180(field2870, 29491);
                class6.field131 = 30;
                class35.field672 = 15;
            } else {
                class12.field207 = class286.field4087.method2180(field2870, 29491);
                class35.field672 = 12;
            }
        } else if (class6.field131 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class197.field2914[var9].method1629(false) * class107.field1782[var9] / 100;
            }
            if (var8 == 100) {
                class12.field207 = class88.field1545.method2180(field2870, 29491);
                class35.field672 = 20;
                class441.method2646((byte) 29, class151.field2407);
                class97.method736(class151.field2407, 32591);
                class6.field131 = 40;
            } else {
                if (var8 != 0) {
                    class12.field207 = class169.field2627.method2180(field2870, 29491) + var8 + "%";
                }
                class35.field672 = 20;
            }
        } else if (class6.field131 == 40) {
            if (class100.field1641.method139(0)) {
                this.method1348(false, class100.field1641.method140(1, 1));
                class12.field207 = class173.field2662.method2180(field2870, 29491);
                class6.field131 = 50;
                class35.field672 = 25;
            } else {
                class12.field207 = class203.field2965.method2180(field2870, 29491) + class100.field1641.method125(-32008) + "%";
                class35.field672 = 25;
            }
        } else if (class6.field131 == 50) {
            class250.method1615(21141);
            class12.field207 = class253.field3618.method2180(field2870, 29491);
            class35.field672 = 30;
            class6.field131 = 60;
        } else if (class6.field131 == 60) {
            int var10 = class303.method1950(class76.field1270, class151.field2407, 58);
            int var11 = class19.method152(6);
            if (var10 < var11) {
                class12.field207 = class86.field1496.method2180(field2870, 29491) + var10 * 100 / var11 + "%";
                class35.field672 = 35;
            } else {
                class12.field207 = class150.field2378.method2180(field2870, 29491);
                class6.field131 = 70;
                class35.field672 = 35;
            }
        } else if (class6.field131 == 70) {
            int var12 = class183.method1285(class151.field2407, (byte) -112);
            int var13 = class333.method2137((byte) -127);
            if (var13 > var12) {
                class12.field207 = class65.field1121.method2180(field2870, 29491) + var12 * 100 / var13 + "%";
                class35.field672 = 40;
            } else {
                class12.field207 = class110.field1864.method2180(field2870, 29491);
                class6.field131 = 80;
                class35.field672 = 40;
            }
        } else if (class6.field131 == 80) {
            if (class419.field6273.method139(0)) {
                class455.field6791 = new class277(class419.field6273, class109.field1800, class151.field2407);
                class12.field207 = class291.field4139.method2180(field2870, 29491);
                class35.field672 = 45;
                class6.field131 = 90;
            } else {
                class12.field207 = class462.field6917.method2180(field2870, 29491) + class419.field6273.method125(-32008) + "%";
                class35.field672 = 45;
            }
        } else if (class6.field131 == 90) {
            class12.field207 = class17.field284.method2180(field2870, 29491);
            class35.field672 = 50;
            class6.field131 = 95;
        } else {
            if (!arg0) {
                this.method1337(-117);
            }
            if (class6.field131 == 95) {
                if (class443.field6623.field608) {
                    class443.field6623.field615 = 0;
                    class443.field6623.field611 = 0;
                    class443.field6623.field604 = 0;
                    class443.field6623.field610 = 0;
                    class443.field6623.field619 = 1;
                }
                class443.field6623.field608 = true;
                class443.field6623.method2844(class368.field5553, 25133);
                class236.method1554(false, class443.field6623.field604, 2);
                class12.field207 = class485.field7206.method2180(field2870, 29491);
                class35.field672 = 55;
                class6.field131 = 100;
            } else if (class6.field131 == 100) {
                class478.method2855(class76.field1270, 9700, class151.field2407, class4.field109);
                class12.field207 = class53.field924.method2180(field2870, 29491);
                class35.field672 = 60;
                class244.method1590(5, (byte) 31);
                class6.field131 = 110;
            } else if (class6.field131 == 110) {
                byte var14 = 0;
                class445.field6649.method139(0);
                int var15 = var14 + class445.field6649.method125(-32008);
                class138.field2214.method139(0);
                int var16 = var15 + class138.field2214.method125(-32008);
                class290.field4133.method139(0);
                int var17 = var16 + class290.field4133.method125(-32008);
                class466.field6955.method139(0);
                int var18 = var17 + class466.field6955.method125(-32008);
                class488.field7222.method139(0);
                int var19 = var18 + class488.field7222.method125(-32008);
                class20.field333.method139(0);
                int var20 = var19 + class20.field333.method125(-32008);
                class368.field5571.method139(0);
                int var21 = var20 + class368.field5571.method125(-32008);
                class352.field5394.method139(0);
                int var22 = var21 + class352.field5394.method125(-32008);
                class56.field981.method139(0);
                int var23 = var22 + class56.field981.method125(-32008);
                class457.field6853.method139(0);
                int var24 = var23 + class457.field6853.method125(-32008);
                class57.field1008.method139(0);
                int var25 = var24 + class57.field1008.method125(-32008);
                class42.field789.method139(0);
                int var26 = var25 + class42.field789.method125(-32008);
                if (var26 < 1200) {
                    class12.field207 = class281.field4025.method2180(field2870, 29491) + var26 / 12 + "%";
                    class35.field672 = 65;
                } else {
                    class162.field2506 = new class74(class403.field6054, field2870, class445.field6649);
                    class203.field2969 = new class169(class403.field6054, field2870, class445.field6649);
                    class500.field7377 = new class215(class403.field6054, field2870, class445.field6649, class151.field2407);
                    class365.field5520 = new class120(class403.field6054, field2870, class290.field4133);
                    class106.field1773 = new class272(class403.field6054, field2870, class445.field6649);
                    class43.field831 = new class358(class403.field6054, field2870, class445.field6649);
                    class217.field3125 = new class68(class403.field6054, field2870, class445.field6649, class474.field7088);
                    class237.field3429 = new class364(class403.field6054, field2870, class445.field6649);
                    class511.field7544 = new class309(class403.field6054, field2870, class445.field6649);
                    class319.field4807 = new class482(class403.field6054, field2870, true, class138.field2214, class474.field7088);
                    class160.field2479 = new class285(class403.field6054, field2870, class445.field6649, class151.field2407);
                    class397.field5996 = new class161(class403.field6054, field2870, class445.field6649, class151.field2407);
                    class61.field1070 = new class56(class403.field6054, field2870, true, class466.field6955, class474.field7088);
                    class367.field5550 = new class188(class403.field6054, field2870, true, class162.field2506, class488.field7222, class474.field7088);
                    class495.field7314 = new class130(class403.field6054, field2870, class445.field6649);
                    class431.field6419 = new class147(class403.field6054, field2870, class20.field333, class98.field1634, class80.field1417);
                    class519.field7721 = new class304(class403.field6054, field2870, class445.field6649);
                    class2.field93 = new class234(class403.field6054, field2870, class445.field6649);
                    class140.field2233 = new class355(class403.field6054, field2870, class368.field5571, class474.field7088);
                    class365.field5521 = new class216(class403.field6054, field2870, class445.field6649);
                    class398.field6002 = new class142(class403.field6054, field2870, class445.field6649);
                    class390.field5911 = new class206(class403.field6054, field2870, class445.field6649);
                    class419.field6271 = new class201(class403.field6054, field2870, class352.field5394);
                    class255.field3670 = new class318(class403.field6054, field2870, class445.field6649);
                    class87.method682(class151.field2407, class474.field7088, class451.field6741, true, class76.field1270);
                    class463.method2759(128, class42.field789);
                    class283.field4048 = new class90(field2870, class56.field981, class457.field6853);
                    class474.field7099 = new class222(field2870, class56.field981, class457.field6853, new class374());
                    class12.field207 = class501.field7382.method2180(field2870, 29491);
                    class35.field672 = 65;
                    class93.method715((byte) -59);
                    class319.field4807.method2872((byte) -59, !class443.field6623.method2840(255, class169.field2624));
                    class335.field5059 = new class368();
                    class497.method2981(30);
                    class167.method1227(1002, class57.field1008);
                    class147.method1133(class455.field6791, class474.field7088, (byte) 125);
                    class6.field131 = 120;
                }
            } else if (class6.field131 == 120) {
                int var27 = class476.method2851((byte) -92, class151.field2407);
                int var28 = class374.method2327(true);
                if (var27 < var28) {
                    class12.field207 = class330.field4982.method2180(field2870, 29491) + var27 * 100 / var28 + "%";
                    class35.field672 = 70;
                } else {
                    class474.method2846(class4.field109, class151.field2407, 88);
                    class526.method3129(true, class35.field675);
                    class12.field207 = class271.field3917.method2180(field2870, 29491);
                    class35.field672 = 70;
                    class6.field131 = 130;
                }
            } else if (class6.field131 == 130) {
                if (class268.field3857.method141((byte) -86, "", "huffman")) {
                    class483 var29 = new class483(class268.field3857.method142((byte) -57, "huffman", ""));
                    class86.method667(-22129, var29);
                    class12.field207 = class21.field388.method2180(field2870, 29491);
                    class6.field131 = 140;
                    class35.field672 = 75;
                } else {
                    class12.field207 = class364.field5512.method2180(field2870, 29491) + "0%";
                    class35.field672 = 75;
                }
            } else if (class6.field131 == 140) {
                if (class451.field6741.method139(0)) {
                    class12.field207 = class408.field6131.method2180(field2870, 29491);
                    class35.field672 = 80;
                    class6.field131 = 150;
                } else {
                    class12.field207 = class56.field968.method2180(field2870, 29491) + class451.field6741.method125(-32008) + "%";
                    class35.field672 = 80;
                }
            } else if (class6.field131 == 150) {
                if (class201.field2946.method139(0)) {
                    class12.field207 = class182.field2734.method2180(field2870, 29491);
                    class35.field672 = 82;
                    class6.field131 = 160;
                } else {
                    class12.field207 = class414.field6180.method2180(field2870, 29491) + class201.field2946.method125(-32008) + "%";
                    class35.field672 = 82;
                }
            } else if (class6.field131 == 160) {
                if (class76.field1270.method139(0)) {
                    class12.field207 = class54.field938.method2180(field2870, 29491);
                    class6.field131 = 170;
                    class35.field672 = 85;
                } else {
                    class12.field207 = class54.field938.method2180(field2870, 29491) + class76.field1270.method125(-32008) + "%";
                    class35.field672 = 85;
                }
            } else if (class6.field131 == 170) {
                if (class407.field6109.method133("details", (byte) -95)) {
                    class509.method3037(class407.field6109, class106.field1773, class43.field831, class319.field4807, class160.field2479, class397.field5996, class335.field5059);
                    class12.field207 = class393.field5950.method2180(field2870, 29491);
                    class35.field672 = 89;
                    class6.field131 = 180;
                } else {
                    class12.field207 = class329.field4964.method2180(field2870, 29491) + class407.field6109.method117("details", 0) + "%";
                    class35.field672 = 87;
                }
            } else if (class6.field131 == 180) {
                int var30 = class132.method985((byte) -61);
                if (var30 == -1) {
                    class12.field207 = class479.field7134.method2180(field2870, 29491);
                    class35.field672 = 90;
                } else if (var30 == 7 || var30 == 9) {
                    this.method2719("worldlistfull", 1);
                    class244.method1590(1000, (byte) 81);
                } else if (class206.field2985) {
                    class12.field207 = class341.field5145.method2180(field2870, 29491);
                    class35.field672 = 90;
                    class6.field131 = 190;
                } else {
                    this.method2719("worldlistio_" + var30, 1);
                    class244.method1590(1000, (byte) 53);
                }
            } else if (class6.field131 == 190) {
                class255.field3672 = new boolean[class390.field5911.field2977];
                class352.field5392 = new String[class398.field6002.field2248];
                class170.field2629 = new int[class390.field5911.field2977];
                for (int var31 = 0; var31 < class390.field5911.field2977; var31++) {
                    if (class390.field5911.method1400(63, var31).field2373 == 0) {
                        class255.field3672[var31] = true;
                        class358.field5443++;
                    }
                    class170.field2629[var31] = -1;
                }
                class419.method2531(-2);
                class99.field1635 = class451.field6741.method136("loginscreen", -77);
                class5.field122.method120(true, false, -128);
                class84.field1455.method120(true, true, -123);
                class151.field2407.method120(true, true, -126);
                class76.field1270.method120(true, true, -126);
                class268.field3857.method120(true, true, -125);
                class451.field6741.method120(true, true, -120);
                class445.field6649.field247 = 2;
                class4.field110 = true;
                class290.field4133.field247 = 2;
                class138.field2214.field247 = 2;
                class466.field6955.field247 = 2;
                class488.field7222.field247 = 2;
                class20.field333.field247 = 2;
                class368.field5571.field247 = 2;
                class228.method1489(class443.field6623.field619, false, -1, -1, false);
                class12.field207 = class277.field3984.method2180(field2870, 29491);
                class6.field131 = 200;
                class35.field672 = 95;
            } else if (class6.field131 == 200) {
                class319.method2078((byte) -100, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1342(int arg0) {
        method1338(-70);
        field2884++;
        class405.method2475(-1);
        class182.method1281(61);
        class54.method475(13);
        class104.method786(arg0 + 2);
        class137.method1021(-29314);
        class11.method79((byte) 11);
        class320.method2088(12118);
        class259.method1680((byte) -64);
        class20.method167(0);
        class457.method2717(78);
        class485.method2884(arg0 + 2314);
        class347.method2207(arg0 + 6033);
        class124.method951(true);
        class239.method1558((byte) 62);
        class414.method2506((byte) 108);
        class162.method1194(arg0 ^ 0xFFFFFFA2);
        class474.method2835(false);
        class128.method965(-21140);
        class368.method2308(false);
        class392.method2429(0);
        class471.method2831(12);
        class187.method1307(-2);
        class103.method774(true);
        class102.method762(arg0);
        class367.method2299(11239);
        class253.method1632(-125);
        class17.method112(0);
        class101.method749(arg0 + 98);
        class438.method2619(arg0 + 16188);
        class55.method483(69);
        class169.method1240(arg0 + 13840);
        class215.method1437((byte) -1);
        class120.method887(1);
        class272.method1750(200);
        class358.method2256(-128);
        class68.method561(13);
        class364.method2283((byte) -122);
        class309.method2024((byte) -82);
        class482.method2870(true);
        class285.method1817((byte) 100);
        class161.method1186(64);
        class56.method497(arg0 ^ 0x78);
        class188.method1317((byte) 108);
        class74.method599(-97);
        class130.method973(true);
        class147.method1134((byte) -64);
        class234.method1541((byte) -16);
        class355.method2248((byte) -99);
        class142.method1054(15);
        class206.method1402(107);
        class201.method1387(-6);
        class318.method2067(false);
        class90.method703((byte) 80);
        class255.method1643((byte) 117);
        class64.method546(5067);
        class463.method2753(false);
        class472.method2832(arg0 - 1);
        class268.method1729(-1);
        class85.method657(arg0 ^ 0x5F);
        class419.method2529(0);
        class7.method42(-1311);
        class105.method790(5350);
        class254.method1639((byte) -123);
        class350.method2230(124);
        class256.method1653((byte) 2);
        class388.method2396(13721);
        class135.method1012(true);
        class499.method2990(-12039);
        class489.method2907(-125);
        class429.method2569(arg0 ^ 0x4830);
        class296.method1880(52);
        class408.method2485(arg0 ^ 0xFFFF94DC);
        class352.method2239((byte) 116);
        class250.method1613(-8202);
        class403.method2469(-61);
        class527.method3130((byte) 126);
        class177.method1261((byte) -44);
        class203.method1397(39);
        class34.method358(9293);
        class179.method1270((byte) -110);
        class400.method2461((byte) 41);
        class217.method1449(-65);
        class298.method1886(-28692);
        class29.method336(-93);
        class19.method151(-115);
        class291.method1840(-1456982776);
        class165.method1218(-127);
        class53.method473(1);
        class121.method918(true);
        class115.method851(-24138);
        class226.method1483(-105);
        class424.method2554((byte) -57);
        class79.method623(-102);
        class380.method2367(arg0 + 45);
        class95.method731(500);
        class35.method363(24);
        class42.method417(-104);
        class134.method1004(-1);
        class426.method2562((byte) -116);
        class470.method2825(arg0 ^ 0x2);
        class86.method679(-11454);
        class348.method2210((byte) 117);
        class150.method1147(false);
        class381.method2372(false);
        class49.method458(-121);
        class462.method2751(-87);
        class467.method2772(100);
        class354.method2244(0);
        class393.method2436((byte) 6);
        class195.method1334((byte) -122);
        class139.method1039(114);
        class190.method1326(-1);
        class325.method2103(5);
        class417.method2525(arg0 + 32);
        class8.method46((byte) 111);
        class163.method1206(true);
        class329.method2117(arg0);
        class94.method727();
        class435.method2596(-1);
        class486.method2885(376);
        class77.method612(false);
        class526.method3128(true);
        class196.method1367(61);
        class513.method3066(-19224);
        class437.method2605();
        class509.method3054();
        class440.method2641(arg0 + 1);
        class353.method2241((byte) 59);
        class351.method2237();
        class510.method3057(57);
        class447.method2672(105);
        class410.method2493((byte) -113);
        class284.method1809(200);
        class277.method1768(-108);
        class366.method2292((byte) -125);
        class83.method650(0);
        class315.method2054((byte) -96);
        class61.method533((byte) -100);
        class386.method2392(5);
        class308.method2017(1);
        class180.method1275(2145578080);
        class361.method2270(-1);
        class466.method2765(21697);
        class199.method1376((byte) -90);
        class257.method1667((byte) -78);
        class421.method2547((byte) 102);
        class523.method3120((byte) -127);
        class402.method2468((byte) -106);
        class193.method1330(16506);
        class110.method819((byte) 113);
        class153.method1160(4642);
        class149.method1143(-76);
        class416.method2522(30556);
        class300.method1894((byte) 103);
        class453.method2705((byte) 113);
        class374.method2326(115);
        class335.method2144(arg0 ^ 0xFFFFFF81);
        class23.method193(1);
        class92.method712(5000);
        class170.method1246(arg0);
        class519.method3103(90);
        class266.method1705();
        class30.method339(false);
        class483.method2878(arg0 - 58);
        class261.method1690(-11);
        class341.method2179((byte) 83);
        class175.method1258((byte) 56);
        class89.method696(512);
        class281.method1796(-1);
        class168.method1235(106);
        class491.method2920(21973);
        class63.method540(arg0 ^ 0xFFFFF6E5);
        class511.method3059((byte) 19);
        class207.method1406(262144);
        class494.method2973(true);
        class227.method1484(-1);
        class431.method2582(-25311);
        class531.method3144((byte) 123);
        class459.method2731(2048);
        class480.method2859((byte) 42);
        class481.method2864(arg0 ^ 0xF5E);
        class241.method1577(arg0 - 29966);
        class166.method1224((byte) -120);
        class478.method2854(arg0 ^ 0xFFFFFF8D);
        class377.method2345(arg0);
        class310.method2032(true);
        class267.method1717(9);
        class328.method2108(30574);
        class3.method31(true);
        class37.method384(arg0 + 23446);
        class72.method587((byte) 75);
        class382.method2376(0);
        class495.method2976(true);
        class69.method567(0);
        class21.method174(10);
        class146.method1128(arg0 ^ 0x5959);
        class384.method2379((byte) 94);
        class412.method2497(arg0 ^ 0x4E);
        class365.method2284(true);
        class465.method2761(-15675);
        class271.method1749((byte) 109);
        class109.method816((byte) -11);
        class441.method2649((byte) -63);
        class43.method429(350);
        class159.method1182(-2);
        class294.method1876(~arg0);
        class362.method2275((byte) -58);
        class66.method556((byte) -11);
        class138.method1029(arg0 ^ 0x1);
        class369.method2314(false);
        class460.method2741(true);
        class334.method2143(true);
        class404.method2474(arg0 ^ 0xFFFFFF99);
        class498.method2986(-2);
        class191.method1328();
        class26.method317((byte) 124);
        class501.method3001((byte) 94);
        class275.method1763((byte) 101);
        class445.method2657(-7051);
        class396.method2445(-121);
        class282.method1798((byte) 107);
        class520.method3105(arg0 + 104);
        class118.method881(20750);
        class428.method2568(arg0 ^ 0xFFFFFF81);
        class127.method962(true);
        class91.method707(108);
        class278.method1776();
        class274.method1758(0);
        class337.method2163((byte) 110);
        class500.method2997(16);
        class140.method1045(11);
        class394.method2437((byte) -109);
        class25.method311(false);
        class2.method21((byte) 0);
        class244.method1589((byte) -93);
        class65.method549(-10562);
        class213.method1424((byte) 103);
        class167.method1229(-12);
        class339.method2175(0);
        class36.method382((byte) 38);
        class197.method1370((byte) -53);
        class451.method2690(6);
        class521.method3108(0);
        class14.method89(1690713128);
        class38.method390();
        class151.method1152(-14015);
        class375.method2330();
        class18.method146();
        class230.method1503();
        class516.method3077(-489022006);
        class288.method1828(16716);
        class450.method2685();
        class233.method1536(arg0 + 95);
        class141.method1048(-17);
        class372.method2322(arg0 + 46);
        class297.method1885(1554494904);
        class41.method410(2);
        class376.method2344((byte) 98);
        class235.method1549();
        class427.method2564((byte) -16);
        class299.method1892(1);
        class45.method439((byte) -99);
        class6.method41(arg0 ^ 0xFFFFFFC3);
        class164.method1209(1);
        class111.method830((byte) -66);
        class116.method857((byte) -126);
        class425.method2555(false);
        class399.method2459(0);
        class448.method2678((byte) -125);
        class28.method332(-125);
        class518.method3098(-24);
        class359.method2261((byte) 90);
        class502.method3003(-4096);
        class84.method652((byte) -114);
        class46.method443(12438);
        class1.method1((byte) -8);
        class303.method1918(true);
        class71.method581((byte) 75);
        class290.method1834(-113);
        class57.method511(true);
        class503.method3011((byte) 114);
        class246.method1600((byte) -97);
        class398.method2457(arg0);
        class270.method1743((byte) -58);
        class240.method1560((byte) 32);
        class492.method2923(arg0 ^ 0x4A9E);
        class286.method1820((byte) -39);
        class93.method714(127);
        class39.method404((byte) 5);
        class319.method2083((byte) -52);
        class221.method1469((byte) -104);
        class269.method1736();
        class407.method2483(arg0 ^ 0x78);
        class475.method2848(-4245);
        class488.method2890((byte) 41);
        class406.method2478((byte) -127);
        class171.method1249(-1424070544);
        class232.method1529((byte) -114);
        class228.method1488((byte) -94);
        class129.method968(128);
        class51.method463((byte) 116);
        class446.method2664(false);
        class528.method3132(arg0 ^ 0xFFFFFFFD);
        class283.method1803(0);
        class443.method2655(-9385);
        class464.method2760(true);
        class59.method522(arg0 - 1);
        class98.method738((byte) 67);
        class433.method2589(arg0 - 125);
        class12.method84((byte) 125);
        class373.method2325((byte) -111);
        class9.method48((byte) 93);
        class97.method735((byte) 17);
        class62.method537(true);
        class378.method2351(arg0 + 499);
        class260.method1682(-83);
        class317.method2064((byte) 82);
        class423.method2551(-6275);
        class515.method3072(-2043055700);
        class212.method1422((byte) -37);
        class123.method947(126);
        class87.method685(true);
        class265.method1704((byte) 61);
        class430.method2578(arg0 + 12868);
        class280.method1793((byte) -79);
        class258.method1669(0);
        class5.method36(arg0 ^ 0x1);
        class112.method838();
        class231.method1517();
        class4.method34(arg0 - 91);
        class100.method743(-123);
        class125.method954(arg0 ^ 0x1A7B);
        class409.method2488(-102);
        class78.method617(77);
        class88.method691(true);
        class152.method1156((byte) -124);
        class497.method2982(false);
        class345.method2196((byte) -119);
        class106.method800(-73);
        class389.method2405(arg0 + 64);
        class436.method2599(34336);
        class287.method1825(-10536);
        class48.method455(arg0 ^ 0x22);
        class76.method607((byte) 14);
        class363.method2278((byte) 42);
        class229.method1492(7);
        class390.method2406(65535);
        class219.method1461(arg0 ^ 0xB3A68627);
        class306.method2004((byte) 10);
        class442.method2653(2);
        class209.method1410(122);
        class242.method1580((byte) 110);
        class107.method805((byte) -121);
        class449.method2682(false);
        class322.method2096((byte) -44);
        class370.method2319(2);
        class183.method1283((byte) -126);
        class455.method2715(5890);
        class202.method1394(false);
        class252.method1622(arg0 ^ 0x1059);
        class360.method2266(-105);
        class338.method2166(-30221);
        class32.method345((byte) -70);
        class247.method1603(31793);
        class214.method1430(arg0 ^ 0xB);
        class108.method806(-123);
        class295.method1878((byte) -56);
        class13.method86((byte) 45);
        class397.method2450(-10138);
        class148.method1140(false);
        class479.method2856((byte) 19);
        class158.method1181(true);
        class173.method1251((byte) 86);
        class160.method1184(true);
        class468.method2773(false);
        class47.method449((byte) -47);
        class122.method940((byte) 45);
        class132.method983(-1845);
        class413.method2500(-112);
        class477.method2852((byte) -108);
        class504.method3017(true);
        class420.method2540(false);
        class22.method180((byte) 75);
        class357.method2254(true);
        class236.method1553(78643200);
        class156.method1168(arg0);
        class432.method2586(974428047);
        class530.method3143(arg0 + 4);
        class237.method1556(-87);
        class476.method2850(19467);
        class514.method3067(100);
        class208.method1407(arg0 + 37);
        class343.method2181(true);
        class40.method407(arg0);
        class50.method461((byte) -27);
        class185.method1292((byte) 65);
        class60.method529(124);
        class245.method1591((byte) -87);
        class487.method2887((byte) 98);
        class80.method638((byte) -84);
        class58.method520((byte) -47);
        class264.method1701(-1927413812);
        class292.method1843(16777215);
        class385.method2381(0);
        class330.method2120((byte) 7);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1343() {
        for (int var0 = 0; var0 < class33.field662; var0++) {
            int[] var1 = class511.field7542[var0];
            for (int var2 = 0; var2 < class121.field1966; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1344(int arg0) {
        class514.field7564++;
        field2869++;
        class452.method2693(-1, 255, null, -1);
        class196.method1360(-1, 3, null, -1);
        class497.method2979(0);
        class431.field6404++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class255 var12 = class34.field668[var2];
            if (var12 != null) {
                byte var13 = var12.field3677.field756;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method1654(97);
                    if ((var13 & 0x2) != 0 && var12.field7690 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field7692[0] + var15;
                            int var18 = var12.field7694[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if ((class33.field662 - (var14 + 1)) < var17) {
                                var17 = class33.field662 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class121.field1966 - var14 - 1)) {
                                var18 = class121.field1966 - var14 - 1;
                            }
                            int var19 = class408.method2484(-1, var12.field7692[0], true, var17, var14, class141.field2244[var12.field6232], var14, 69, var12.field7694[0], var18, var14, 0, class149.field2375, class338.field5094, 0);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field7692[var20] = class338.field5094[var19 - var20 - 1];
                                    var12.field7694[var20] = class149.field2375[var19 - var20 - 1];
                                    var12.field7691[var20] = 1;
                                }
                                var12.field7690 = var19;
                            }
                        }
                    }
                    class23.method188(var12, 0, true);
                    int var21 = class48.method452(var12, 114);
                    class277.method1764(arg0 - 2049, class465.field6947, var12, var21, class213.field3073);
                    class83.method648(var12, -65);
                }
            }
        }
        if (class350.field5217 == 0 && class91.field1568 == 0) {
            if (class85.field1473 == 2) {
                class57.method508(115);
            } else {
                class106.method797(false);
            }
            if ((class40.field732 >> 7) < 14 || (class40.field732 >> 7) >= (class33.field662 - 14) || class405.field6075 >> 7 < 14 || (class405.field6075 >> 7) >= (class121.field1966 - 14)) {
                class516.method3076(false);
            }
        }
        while (true) {
            class207 var3;
            class350 var4;
            class350 var5;
            do {
                var3 = (class207) class72.field1243.method2423(arg0 - 2048);
                if (var3 == null) {
                    while (true) {
                        class207 var6;
                        class350 var7;
                        class350 var8;
                        do {
                            var6 = (class207) class491.field7262.method2423(arg0 ^ 0x800);
                            if (var6 == null) {
                                while (true) {
                                    class207 var9;
                                    class350 var10;
                                    class350 var11;
                                    do {
                                        var9 = (class207) class378.field5715.method2423(0);
                                        if (var9 == null) {
                                            if (class475.field7100 != null) {
                                                class246.method1598((byte) -117);
                                            }
                                            if ((class531.field7821 % 1500) == 0) {
                                                class294.method1875(10429);
                                            }
                                            class71.method582((byte) 125);
                                            if (arg0 != 2048) {
                                                field2870 = -64;
                                            }
                                            if (class310.field4724 && class290.field4125 < class211.method1419(arg0 ^ 0x3A79) - 60000L) {
                                                class33.method349(true);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2995;
                                        if (var10.field5354 < 0) {
                                            break;
                                        }
                                        var11 = class319.method2075(true, var10.field5297);
                                    } while (var11 == null || var11.field5291 == null || var10.field5354 >= var11.field5291.length || var11.field5291[var10.field5354] != var10);
                                    class437.method2614(var9);
                                }
                            }
                            var7 = var6.field2995;
                            if (var7.field5354 < 0) {
                                break;
                            }
                            var8 = class319.method2075(true, var7.field5297);
                        } while (var8 == null || var8.field5291 == null || var7.field5354 >= var8.field5291.length || var8.field5291[var7.field5354] != var7);
                        class437.method2614(var6);
                    }
                }
                var4 = var3.field2995;
                if (var4.field5354 < 0) {
                    break;
                }
                var5 = class319.method2075(true, var4.field5297);
            } while (var5 == null || var5.field5291 == null || var5.field5291.length <= var4.field5354 || var5.field5291[var4.field5354] != var4);
            class437.method2614(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1345() {
        int var0 = class409.field6135;
        int[] var1 = class358.field5445;
        boolean var2 = class443.field6623.field595 == 1 && var0 > 200 || class443.field6623.field595 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class256 var12 = class183.field2747[var1[var3]];
            if (var12.method1662(16928)) {
                var12.method808((byte) 45);
                if (var12.field6231 >= 0 && var12.field6238 >= 0 && var12.field6235 < class33.field662 && var12.field6226 < class121.field1966) {
                    var12.field3692 = var12.field7682 ? var2 : false;
                    if (class139.field2224 == var12) {
                        var12.field7630 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field7608) {
                            var13++;
                        }
                        if (var12.field7616 > class531.field7821) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method1654(76) << 2);
                        if (var12.field3685) {
                            var14 += 512;
                        } else {
                            if (class159.field2470 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field7630 = var14 + 1;
                    }
                } else {
                    var12.field7630 = -1;
                }
            } else {
                var12.field7630 = -1;
            }
        }
        for (int var4 = 0; var4 < class510.field7529; var4++) {
            class255 var9 = class34.field668[class148.field2363[var4]];
            if (var9.method1650(16928) && var9.field3677.method428((byte) -126, class335.field5059)) {
                var9.method808((byte) 45);
                if (var9.field6231 >= 0 && var9.field6238 >= 0 && var9.field6235 < class33.field662 && var9.field6226 < class121.field1966) {
                    int var10 = 0;
                    if (!var9.field7608) {
                        var10++;
                    }
                    if (var9.field7616 > class531.field7821) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method1654(83) << 2);
                    if (class159.field2470 == 0) {
                        if (var9.field3677.field761) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class159.field2470 == 1) {
                        if (var9.field3677.field761) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field3677.field752) {
                        var11 += 1024;
                    } else if (!var9.field3677.field779) {
                        var11 += 256;
                    }
                    var9.field7630 = var11 + 1;
                } else {
                    var9.field7630 = -1;
                }
            } else {
                var9.field7630 = -1;
            }
        }
        for (int var5 = 0; var5 < class45.field835.length; var5++) {
            class128 var6 = class45.field835[var5];
            if (var6 != null) {
                if (var6.field2038 == 1) {
                    class255 var7 = class34.field668[var6.field2032];
                    if (var7 != null && var7.field7630 >= 0) {
                        var7.field7630 += 2048;
                    }
                } else if (var6.field2038 == 10) {
                    class256 var8 = class183.field2747[var6.field2032];
                    if (var8 != null && class139.field2224 != var8 && var8.field7630 >= 0) {
                        var8.field7630 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method1346(byte arg0) {
        field2878++;
        if (arg0 != -94) {
            this.init();
        }
        boolean var2 = class405.field6072.method768((byte) 120);
        if (!var2) {
            this.method1347(arg0 - 23);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1347(int arg0) {
        field2877++;
        if (class405.field6072.field1720 > class64.field1099) {
            class339.field5139 = (class405.field6072.field1720 * 50 - 50) * 5;
            if (class187.field2793 == class132.field2082) {
                class187.field2793 = class175.field2679;
            } else {
                class187.field2793 = class132.field2082;
            }
            if (class339.field5139 > 3000) {
                class339.field5139 = 3000;
            }
            if (class405.field6072.field1720 >= 2 && class405.field6072.field1722 == 6) {
                this.method2719("js5connect_outofdate", 1);
                class281.field4023 = 1000;
                return;
            }
            if (class405.field6072.field1720 >= 4 && class405.field6072.field1722 == -1) {
                this.method2719("js5crc", 1);
                class281.field4023 = 1000;
                return;
            }
            if (class405.field6072.field1720 >= 4 && (class281.field4023 == 0 || class281.field4023 == 5)) {
                if (class405.field6072.field1722 == 7 || class405.field6072.field1722 == 9) {
                    this.method2719("js5connect_full", 1);
                } else if (class405.field6072.field1722 <= 0) {
                    this.method2719("js5io", 1);
                } else {
                    this.method2719("js5connect", 1);
                }
                class281.field4023 = 1000;
                return;
            }
        }
        class64.field1099 = class405.field6072.field1720;
        if (class339.field5139 > 0) {
            class339.field5139--;
            return;
        }
        try {
            if (class72.field1245 == 0) {
                class297.field4234 = class368.field5553.method1852(class187.field2793, class315.field4742, (byte) 38);
                class72.field1245++;
            }
            if (class72.field1245 == 1) {
                if (class297.field4234.field4940 == 2) {
                    this.method1352(1000, 16383);
                    return;
                }
                if (class297.field4234.field4940 == 1) {
                    class72.field1245++;
                }
            }
            if (class72.field1245 == 2) {
                class43.field830 = new class187((Socket) class297.field4234.field4939, class368.field5553);
                class145 var2 = new class145(5);
                var2.method1109(false, class339.field5129.field6139);
                var2.method1117(590, (byte) 12);
                class43.field830.method1304(var2.field2270, 0, 5, (byte) -44);
                class72.field1245++;
                class476.field7118 = class211.method1419(12921);
            }
            if (arg0 > -112) {
                this.method1346((byte) 32);
            }
            if (class72.field1245 == 3) {
                if (class281.field4023 == 0 || class281.field4023 == 5 || class43.field830.method1308(14971) > 0) {
                    int var3 = class43.field830.method1309(127);
                    if (var3 != 0) {
                        this.method1352(var3, 16383);
                        return;
                    }
                    class72.field1245++;
                } else if (class211.method1419(12921) - class476.field7118 > 30000L) {
                    this.method1352(1001, 16383);
                    return;
                }
            }
            if (class72.field1245 == 4) {
                boolean var4 = class281.field4023 == 5 || class281.field4023 == 10 || class281.field4023 == 28;
                class405.field6072.method770(!var4, class43.field830, true);
                class43.field830 = null;
                class297.field4234 = null;
                class72.field1245 = 0;
            }
        } catch (IOException var5) {
            this.method1352(1002, 16383);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
    private final void method1348(boolean arg0, byte[] arg1) {
        field2885++;
        class145 var3 = new class145(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method1063((byte) -44);
                if (var4 == 0) {
                    if (arg0) {
                        field2873 = null;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class390.field5910 = new int[6];
                    var5[0] = var3.method1069((byte) -103);
                    var5[1] = var3.method1069((byte) -59);
                    var5[2] = var3.method1069((byte) -67);
                    var5[3] = var3.method1069((byte) -37);
                    var5[4] = var3.method1069((byte) -25);
                    var5[5] = var3.method1069((byte) -14);
                } else if (var4 == 4) {
                    int var6 = var3.method1063((byte) 121);
                    class80.field1419 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class80.field1419[var7] = var3.method1069((byte) -122);
                        if (class80.field1419[var7] == 65535) {
                            class80.field1419[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method1063((byte) 109);
                    class107.field1785 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class107.field1785[var9] = var3.method1069((byte) -86);
                        if (class107.field1785[var9] == 65535) {
                            class107.field1785[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class376.method2343("argument count", 1);
            }
            class306.field4681 = Integer.parseInt(arg0[0]);
            class423.field6322 = class177.field2702;
            if (arg0[1].equals("live")) {
                class86.field1505 = class296.field4205;
            } else if (arg0[1].equals("rc")) {
                class86.field1505 = class427.field6346;
            } else if (arg0[1].equals("wip")) {
                class86.field1505 = class521.field7739;
            } else {
                class376.method2343("modewhat", 1);
            }
            field2870 = class65.method552((byte) 0, arg0[2]);
            if (field2870 == -1) {
                if (arg0[2].equals("english")) {
                    field2870 = 0;
                } else if (arg0[2].equals("german")) {
                    field2870 = 1;
                } else {
                    class376.method2343("language", 1);
                }
            }
            class61.field1073 = false;
            class302.field4284 = false;
            if (arg0[3].equals("game0")) {
                class403.field6054 = class168.field2608;
            } else if (arg0[3].equals("game1")) {
                class403.field6054 = class428.field6357;
            } else {
                class376.method2343("game", 1);
            }
            class110.field1871 = 0;
            class233.field3400 = 0;
            class485.field7207 = true;
            class110.field1867 = true;
            class518.field7708 = class403.field6054.field3439;
            class66.field1138 = "";
            client var1 = new client();
            class19.field322 = var1;
            var1.method2721(90, false, class403.field6054.field3438, class86.field1505.method2204(-4553) + 32, 590, 1024, 768, 30);
            class423.field6321.setLocation(40, 40);
        } catch (Exception var3) {
            class320.method2087(0, var3, null);
        }
        field2872++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lmq;)Lwu;")
    public static final class250 method1349(class350 arg0) {
        class250 var1 = (class250) class37.field704.method171((byte) -98, ((long) arg0.field5322 << 32) + (long) arg0.field5354);
        return var1 == null ? arg0.field5301 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lmq;)Lmq;")
    public static final class350 method1350(class350 arg0) {
        int var1 = method1349(arg0).method1611(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class319.method2075(true, arg0.field5297);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZLjava/lang/String;Loa;)V")
    public static final void method1351(byte arg0, boolean arg1, String arg2, class489 arg3) {
        field2871++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class8.field140.method2129(null, 250, 111, arg2);
        int var8 = -26 % ((40 - arg0) / 42);
        int var9 = class8.field140.method2132(250, null, (byte) -82, arg2) * 13;
        class4.field109.method253(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var9 - -var4, -16777216, 0);
        class4.field109.method239(var5 - var4, -var4 + var6, var4 + var7 + var4, var9 - -var4 + var4, -1, 0);
        arg3.method2908(1, 0, 0, null, -16777216, null, var7, -1, arg2, -1, 1, var9, 0, var5, null, var6);
        class62.method534((byte) 60, var4 + var7 + var4, var4 + var9 + var4, var5 - var4, -var4 + var6);
        if (arg1) {
            class4.field109.method203();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1352(int arg0, int arg1) {
        if (arg1 != 16383) {
            this.method1352(-98, 37);
        }
        class405.field6072.field1720++;
        class43.field830 = null;
        class72.field1245 = 0;
        class297.field4234 = null;
        class405.field6072.field1722 = arg0;
        field2874++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1353(boolean arg0) {
        field2880++;
        if (class281.field4023 == 1000) {
            return;
        }
        long var2 = class315.method2055((byte) -113) / 1000000L - class12.field205;
        class12.field205 = class315.method2055((byte) -128) / 1000000L;
        boolean var4 = class240.method1562(0);
        if (var4 && class217.field3129 && class427.field6349 != null) {
            class427.field6349.method678(false);
        }
        if (class281.field4023 == 30 || class281.field4023 == 10) {
            if (class479.field7137 != 0L && class479.field7137 < class211.method1419(12921)) {
                class228.method1489(class8.method43(false), false, class443.field6623.field628, class443.field6623.field599, false);
            } else if (!class4.field109.method285() && class177.field2700) {
                class435.method2595(0);
            }
        }
        if (class197.field2913 == null) {
            Container var5;
            if (class423.field6321 == null) {
                var5 = class368.field5553.field4170;
            } else {
                var5 = class423.field6321;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class423.field6321 == var5) {
                Insets var8 = class423.field6321.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class431.field6418 != var6 || class420.field6275 != var7) {
                if (class4.field109 == null || class4.field109.method223()) {
                    class303.method1917(112);
                } else {
                    class420.field6275 = var7;
                    class431.field6418 = var6;
                }
                class479.field7137 = class211.method1419(12921) + 500L;
            }
        }
        if (class197.field2913 != null && !class160.field2478 && (class281.field4023 == 30 || class281.field4023 == 10)) {
            class228.method1489(class443.field6623.field619, !arg0, -1, -1, false);
        }
        if (!arg0) {
            this.method1339(28);
        }
        boolean var9 = false;
        if (class455.field6788) {
            var9 = true;
            class455.field6788 = false;
        }
        if (var9) {
            class79.method633((byte) -121);
        }
        if (class4.field109 != null && class4.field109.method285() || class8.method43(false) != 1) {
            class511.method3061(22843);
        }
        if (class281.field4023 == 0) {
            class141.method1051(class215.field3097[class518.field7708], (byte) 19, class303.field4451[class518.field7708], var9, class12.field207, class35.field672, class111.field1875[class518.field7708]);
        } else if (class281.field4023 == 5) {
            class499.method2989((byte) 80, class111.field1875[class518.field7708].getRGB(), class215.field3097[class518.field7708].getRGB(), class4.field109, class303.field4451[class518.field7708].getRGB(), class4.field109.method285() | var9, class310.field4726);
        } else if (class281.field4023 == 10) {
            class152.method1154((byte) 115);
        } else if (class281.field4023 == 25 || class281.field4023 == 28) {
            if (class161.field2493 == 1) {
                if (class358.field5442 > class121.field1968) {
                    class121.field1968 = class358.field5442;
                }
                int var11 = (class121.field1968 - class358.field5442) * 50 / class121.field1968;
                method1351((byte) -71, true, class516.field7590.method2180(field2870, 29491) + "<br>(" + var11 + "%)", class464.field6944);
            } else if (class161.field2493 == 2) {
                if (class170.field2638 < class455.field6794) {
                    class170.field2638 = class455.field6794;
                }
                int var10 = (class170.field2638 - class455.field6794) * 50 / class170.field2638 + 50;
                method1351((byte) 103, true, class516.field7590.method2180(field2870, 29491) + "<br>(" + var10 + "%)", class464.field6944);
            } else {
                method1351((byte) -63, true, class516.field7590.method2180(field2870, 29491), class464.field6944);
            }
        } else if (class281.field4023 == 30) {
            class88.method692(-22, var2);
        } else if (class281.field4023 == 40) {
            method1351((byte) -5, true, class386.field5826.method2180(field2870, 29491) + "<br>" + class219.field3138.method2180(field2870, 29491), class464.field6944);
        }
        if (class506.field7461 == 3) {
            for (int var12 = 0; var12 < class100.field1650; var12++) {
                Rectangle var13 = class362.field5483[var12];
                if (class115.field1908[var12]) {
                    class4.field109.method1200(-1996553985, var13.height, var13.x, var13.y, var13.width, 10);
                } else if (class467.field6966[var12]) {
                    class4.field109.method1200(-1996554240, var13.height, var13.x, var13.y, var13.width, 10);
                }
            }
        }
        if (class370.method2316(69)) {
            class43.method430(0, class4.field109);
        }
        if ((class281.field4023 == 30 || class281.field4023 == 10) && class506.field7461 == 0 && class8.method43(!arg0) == 1 && !var9 && class293.field4169.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class100.field1650; var15++) {
                if (class467.field6966[var15]) {
                    class467.field6966[var15] = false;
                    class1.field4[var14++] = class362.field5483[var15];
                }
            }
            class4.field109.method227(class1.field4, var14);
        } else if (class281.field4023 != 0) {
            class4.field109.method203();
            for (int var16 = 0; var16 < class100.field1650; var16++) {
                class467.field6966[var16] = false;
            }
        }
        if (class443.field6623.field626 == 0) {
            class71.method583(15L, 27);
        } else if (class443.field6623.field626 == 1) {
            class71.method583(10L, -119);
        } else if (class443.field6623.field626 == 2) {
            class71.method583(5L, -88);
        } else if (class443.field6623.field626 == 3) {
            class71.method583(2L, 58);
        }
        if (class4.field110) {
            class34.method359(50);
        }
        if (class443.field6623.field608 && class281.field4023 == 10 && class364.field5513 != -1) {
            class443.field6623.field608 = false;
            class443.field6623.method2844(class368.field5553, 25133);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method1354(int arg0) {
        int var1 = class409.field6135;
        int[] var2 = class358.field5445;
        for (int var3 = 0; var3 < class510.field7529 + var1; var3++) {
            class517 var4;
            if (var3 < var1) {
                var4 = class183.field2747[var2[var3]];
            } else {
                var4 = class34.field668[class148.field2363[var3 - var1]];
            }
            if (var4.field6232 == arg0 && var4.field7630 >= 0) {
                int var5 = var4.method1654(104);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6228 & 0x7F) != 0 || (var4.field6233 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6228 & 0x7F) != 64 || (var4.field6233 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6228 >> 7;
                    int var7 = var4.field6233 >> 7;
                    if (var4.field7630 > class511.field7542[var6][var7]) {
                        class511.field7542[var6][var7] = var4.field7630;
                        class54.field942[var6][var7] = 1;
                    } else if (class511.field7542[var6][var7] == var4.field7630) {
                        var10002 = class54.field942[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6228 - var8 >> 7;
                    int var10 = var4.field6233 - var8 >> 7;
                    int var11 = var4.field6228 + var8 >> 7;
                    int var12 = var4.field6233 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field7630 > class511.field7542[var13][var14]) {
                                class511.field7542[var13][var14] = var4.field7630;
                                class54.field942[var13][var14] = 1;
                            } else if (class511.field7542[var13][var14] == var4.field7630) {
                                var10002 = class54.field942[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1355() {
        class385.field5813 = 0;
        for (int var0 = 0; var0 < class510.field7529; var0++) {
            class255 var1 = class34.field668[class148.field2363[var0]];
            if (var1.field7608 && var1.method1644((byte) 115) != -1) {
                int var2 = (var1.method1654(107) - 1) * 64 + 60;
                int var3 = var1.field6228 - var2 >> 7;
                int var4 = var1.field6233 - var2 >> 7;
                class517 var5 = class310.method2029(var1.field6232, var3, var4, -93);
                if (var5 != null) {
                    int var6 = var5.field7669;
                    if (var5 instanceof class255) {
                        var6 += 2048;
                    }
                    if (var5.field7649 == 0 && var5.method1644((byte) 118) != -1) {
                        class95.field1605[class385.field5813] = var6;
                        class366.field5529[class385.field5813] = var6;
                        class385.field5813++;
                        var5.field7649++;
                    }
                    class95.field1605[class385.field5813] = var6;
                    class366.field5529[class385.field5813] = var1.field7669 + 2048;
                    class385.field5813++;
                    var5.field7649++;
                }
            }
        }
        class339.method2174(class95.field1605, class366.field5529, class385.field5813 - 1, (byte) 18, 0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1356(int arg0) {
        if (class310.field4724) {
            class33.method349(true);
        }
        if (arg0 != 13) {
            return;
        }
        field2882++;
        if (class4.field109 != null) {
            class4.field109.method1203(arg0 ^ 0xFFFFFFAE);
        }
        if (class197.field2913 != null) {
            class283.method1804(class368.field5553, arg0 ^ 0x69, class197.field2913);
            class197.field2913 = null;
        }
        if (class116.field1927 != null) {
            class116.field1927.method1305((byte) -73);
            class116.field1927 = null;
        }
        if (class477.field7122 != null) {
            class477.field7122.method2830(73, class370.field5611);
        }
        class477.field7122 = null;
        class243.method1587(0);
        class405.field6072.method776((byte) -81);
        class519.field7726.method761(arg0 - 10);
        if (class390.field5892 != null) {
            class390.field5892.method2754(true);
            class390.field5892 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lmq;IIIIIIIII)V")
    public static final void method1357(class350[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class350 var11 = arg0[var10];
            if (var11 != null && var11.field5297 == arg1) {
                int var12 = var11.field5225 + arg6;
                int var13 = var11.field5234 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5215 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5329 + var12;
                    int var19 = var11.field5269 + var13;
                    if (var11.field5215 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field5215 == 0 || var11.field5326 || method1349(var11).field3585 != 0 || class78.field1310 == var11 || class419.field6274 == var11.field5219) {
                    if (!method1340(var11)) {
                        if (class475.field7100 == var11) {
                            class174.field2673 = true;
                            class45.field839 = var12;
                            class196.field2889 = var13;
                        }
                        if (var11.field5319 || var14 < var16 && var15 < var17) {
                            if (var11.field5279 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class207 var20 = (class207) class378.field5715.method2427(115); var20 != null; var20 = (class207) class378.field5715.method2422(-109)) {
                                    if (var20.field2987) {
                                        var20.method2090(-1);
                                        var20.field2995.field5350 = false;
                                    }
                                }
                                if (class303.field4329 == 0) {
                                    class475.field7100 = null;
                                    class78.field1310 = null;
                                }
                                class333.field5035 = 0;
                                class424.field6325 = false;
                                class274.field3952 = false;
                                if (!class197.field2903) {
                                    class369.method2313((byte) 104);
                                }
                            }
                            boolean var21;
                            if (class166.field2579.method1024(true) >= var14 && class166.field2579.method1019((byte) 3) >= var15 && class166.field2579.method1024(true) < var16 && class166.field2579.method1019((byte) 3) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class99.field1638 && var21) {
                                if (var11.field5330 >= 0) {
                                    class245.field3518 = var11.field5330;
                                } else if (var11.field5279) {
                                    class245.field3518 = -1;
                                }
                            }
                            if (!class197.field2903 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class167.method1228(-1, arg9 - var13, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class166.field2579.method1025(-61) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class432 var24 = (class432) class502.field7411.method2427(110);
                            if (var24 != null && var24.method2187((byte) 11) == 0 && var24.method2183(-5) >= var14 && var24.method2186((byte) 115) >= var15 && var24.method2183(-5) < var16 && var24.method2186((byte) 120) < var17) {
                                var23 = true;
                            }
                            if (var11.field5370 != null) {
                                for (int var25 = 0; var25 < var11.field5370.length; var25++) {
                                    if (class380.field5726.method1584(14, var11.field5370[var25])) {
                                        if (var11.field5320 == null || class531.field7821 >= var11.field5320[var25]) {
                                            byte var26 = var11.field5366[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class380.field5726.method1584(14, 86) && !class380.field5726.method1584(14, 82) && !class380.field5726.method1584(14, 81)) && ((var26 & 0x2) == 0 || class380.field5726.method1584(14, 86)) && ((var26 & 0x1) == 0 || class380.field5726.method1584(14, 82)) && ((var26 & 0x4) == 0 || class380.field5726.method1584(14, 81))) {
                                                if (var25 < 10) {
                                                    class329.method2118(var25 + 1, -1, var11.field5322, (byte) -56, "");
                                                } else if (var25 == 10) {
                                                    class227.method1486(0);
                                                    class250 var27 = method1349(var11);
                                                    class474.method2838(var27.method1607(-1), -11, var27.field3578, var11);
                                                    class432.field6423 = class449.method2683(-1, var11);
                                                    if (class432.field6423 == null) {
                                                        class432.field6423 = "Null";
                                                    }
                                                    class1.field7 = var11.field5305 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field5365[var25];
                                                if (var11.field5320 == null) {
                                                    var11.field5320 = new int[var11.field5370.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field5320[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field5320[var25] = class531.field7821 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field5320 != null) {
                                        var11.field5320[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class347.method2203(var11, 0, var24.method2183(-5) - var12, var24.method2186((byte) 108) - var13);
                            }
                            if (class475.field7100 != null && class475.field7100 != var11 && var21 && method1349(var11).method1614((byte) -54)) {
                                class504.field7446 = var11;
                            }
                            if (class78.field1310 == var11) {
                                class449.field6730 = true;
                                class481.field7163 = var12;
                                class280.field4017 = var13;
                            }
                            if (var11.field5326 || var11.field5219 != 0) {
                                if (var21 && class50.field908 != 0 && var11.field5294 != null) {
                                    class207 var29 = new class207();
                                    var29.field2987 = true;
                                    var29.field2995 = var11;
                                    var29.field2988 = class50.field908;
                                    var29.field2996 = var11.field5294;
                                    class378.field5715.method2417(-119, var29);
                                }
                                if (class475.field7100 != null || class197.field2903 || class41.field742 != var11.field5219 && class333.field5035 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field5219 != 0) {
                                    if (class128.field2041 == var11.field5219 || class201.field2944 == var11.field5219) {
                                        class28.field579 = var11;
                                        if (class381.field5778 != null) {
                                            class381.field5778.method796(105, class4.field109, var11.field5269);
                                        }
                                        if (class128.field2041 == var11.field5219) {
                                            if (!class197.field2903 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class389.method2402(class4.field109, arg9, 23662, arg8);
                                                for (class271 var30 = (class271) class470.field7034.method1640(false); var30 != null; var30 = (class271) class470.field7034.method1641(true)) {
                                                    if (arg8 >= var30.field3914 && arg8 < var30.field3913 && arg9 >= var30.field3911 && arg9 < var30.field3912) {
                                                        class369.method2313((byte) 75);
                                                        class470.method2823((byte) -69, var30.field3915);
                                                    }
                                                }
                                            }
                                            class452.method2693(var12, 255, var11, var13);
                                            continue;
                                        }
                                    }
                                    if (class419.field6274 == var11.field5219) {
                                        if (var11.method2218((byte) 72, class4.field109) == null || class128.field2030 != 0 && class128.field2030 != 3 || class197.field2903 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field5318[var32];
                                        if (var31 < var33 || var31 > var11.field5310[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field5329 / 2;
                                        int var35 = var32 - var11.field5269 / 2;
                                        int var36;
                                        if (class85.field1473 == 4) {
                                            var36 = (int) class526.field7779 & 0x3FFF;
                                        } else {
                                            var36 = (int) class526.field7779 + class255.field3674 & 0x3FFF;
                                        }
                                        int var37 = class528.field7783[var36];
                                        int var38 = class528.field7786[var36];
                                        if (class85.field1473 != 4) {
                                            var37 = (class70.field1215 + 256) * var37 >> 8;
                                            var38 = (class70.field1215 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class85.field1473 == 4) {
                                            var41 = (class141.field2245 >> 7) + (var39 >> 2);
                                            var42 = (class206.field2980 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class139.field2224.method1654(85) - 1) * 64;
                                            var41 = (class139.field2224.field6228 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class139.field2224.field6233 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class99.field1638 && (class417.field6234 & 0x40) != 0) {
                                            class350 var44 = class83.method649((byte) 106, class383.field5790, class347.field5187);
                                            if (var44 == null) {
                                                class227.method1486(0);
                                            } else {
                                                class338.method2167(" ->", 1L, class56.field980, 1, var42, true, class432.field6423, false, var41, var11.field5273, 46);
                                            }
                                            continue;
                                        }
                                        if (class428.field6357 == class403.field6054) {
                                            class338.method2167("", 1L, -1, 1, var42, true, class499.field7369.method2180(field2870, 29491), false, var41, -1, 59);
                                        }
                                        class338.method2167("", 1L, class416.field6208, 1, var42, true, class165.field2561, false, var41, -1, 16);
                                        continue;
                                    }
                                    if (class41.field742 == var11.field5219) {
                                        class47.field876 = var11;
                                        if (var21) {
                                            class424.field6325 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method2183(-5) - var12 - var11.field5329 / 2) * 2.0D / (double) class509.field7493);
                                            int var46 = (int) (-((double) (var24.method2186((byte) 113) - var13 - var11.field5269 / 2) * 2.0D / (double) class509.field7493));
                                            int var47 = class404.field6067 + var45 + class509.field7503;
                                            int var48 = class158.field2464 + var46 + class509.field7519;
                                            class419 var49 = class452.method2695(-4);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2530(-13274, var50, var48, var47);
                                            if (var50 != null) {
                                                if (class380.field5726.method1584(14, 82) && class75.field1260 > 0) {
                                                    class470.method2794(true, var50[1], var50[2], var50[0]);
                                                    continue;
                                                }
                                                class274.field3952 = true;
                                                class80.field1414 = var50[0];
                                                class353.field5407 = var50[1];
                                                class418.field6241 = var50[2];
                                            }
                                            class333.field5035 = 1;
                                            class477.field7123 = false;
                                            class77.field1288 = class166.field2579.method1024(true);
                                            class438.field6545 = class166.field2579.method1019((byte) 3);
                                            continue;
                                        }
                                        if (var22 && class333.field5035 > 0) {
                                            if (class333.field5035 == 1 && (class77.field1288 != class166.field2579.method1024(true) || class438.field6545 != class166.field2579.method1019((byte) 3))) {
                                                class410.field6143 = class404.field6067;
                                                class385.field5811 = class158.field2464;
                                                class333.field5035 = 2;
                                            }
                                            if (class333.field5035 == 2) {
                                                class477.field7123 = true;
                                                class460.method2737(class410.field6143 + (int) ((double) (class77.field1288 - class166.field2579.method1024(true)) * 2.0D / (double) class509.field7492), -104);
                                                class409.method2491(class385.field5811 - (int) ((double) (class438.field6545 - class166.field2579.method1019((byte) 3)) * 2.0D / (double) class509.field7492), false);
                                            }
                                            continue;
                                        }
                                        if (class333.field5035 > 0 && !class477.field7123) {
                                            if ((class300.field4272 == 1 || class516.method3081((byte) -46)) && class363.field5500 > 2) {
                                                class385.method2385((byte) 99, class77.field1288, class438.field6545);
                                            } else if (class320.method2089((byte) 38)) {
                                                class385.method2385((byte) 124, class77.field1288, class438.field6545);
                                            }
                                        }
                                        class333.field5035 = 0;
                                        continue;
                                    }
                                    if (class30.field637 == var11.field5219) {
                                        if (var22) {
                                            class223.method1479(-1, var11.field5269, class166.field2579.method1019((byte) 3) - var13, class166.field2579.method1024(true) - var12, var11.field5329);
                                        }
                                        continue;
                                    }
                                    if (class294.field4194 == var11.field5219) {
                                        class196.method1360(var12, 3, var11, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field5239 && var23) {
                                    var11.field5239 = true;
                                    if (var11.field5374 != null) {
                                        class207 var51 = new class207();
                                        var51.field2987 = true;
                                        var51.field2995 = var11;
                                        var51.field2994 = var24.method2183(-5) - var12;
                                        var51.field2988 = var24.method2186((byte) 110) - var13;
                                        var51.field2996 = var11.field5374;
                                        class378.field5715.method2417(-119, var51);
                                    }
                                }
                                if (var11.field5239 && var22 && var11.field5314 != null) {
                                    class207 var52 = new class207();
                                    var52.field2987 = true;
                                    var52.field2995 = var11;
                                    var52.field2994 = class166.field2579.method1024(true) - var12;
                                    var52.field2988 = class166.field2579.method1019((byte) 3) - var13;
                                    var52.field2996 = var11.field5314;
                                    class378.field5715.method2417(-120, var52);
                                }
                                if (var11.field5239 && !var22) {
                                    var11.field5239 = false;
                                    if (var11.field5307 != null) {
                                        class207 var53 = new class207();
                                        var53.field2987 = true;
                                        var53.field2995 = var11;
                                        var53.field2994 = class166.field2579.method1024(true) - var12;
                                        var53.field2988 = class166.field2579.method1019((byte) 3) - var13;
                                        var53.field2996 = var11.field5307;
                                        class491.field7262.method2417(83, var53);
                                    }
                                }
                                if (var22 && var11.field5259 != null) {
                                    class207 var54 = new class207();
                                    var54.field2987 = true;
                                    var54.field2995 = var11;
                                    var54.field2994 = class166.field2579.method1024(true) - var12;
                                    var54.field2988 = class166.field2579.method1019((byte) 3) - var13;
                                    var54.field2996 = var11.field5259;
                                    class378.field5715.method2417(-128, var54);
                                }
                                if (!var11.field5350 && var21) {
                                    var11.field5350 = true;
                                    if (var11.field5278 != null) {
                                        class207 var55 = new class207();
                                        var55.field2987 = true;
                                        var55.field2995 = var11;
                                        var55.field2994 = class166.field2579.method1024(true) - var12;
                                        var55.field2988 = class166.field2579.method1019((byte) 3) - var13;
                                        var55.field2996 = var11.field5278;
                                        class378.field5715.method2417(-119, var55);
                                    }
                                }
                                if (var11.field5350 && var21 && var11.field5338 != null) {
                                    class207 var56 = new class207();
                                    var56.field2987 = true;
                                    var56.field2995 = var11;
                                    var56.field2994 = class166.field2579.method1024(true) - var12;
                                    var56.field2988 = class166.field2579.method1019((byte) 3) - var13;
                                    var56.field2996 = var11.field5338;
                                    class378.field5715.method2417(109, var56);
                                }
                                if (var11.field5350 && !var21) {
                                    var11.field5350 = false;
                                    if (var11.field5295 != null) {
                                        class207 var57 = new class207();
                                        var57.field2987 = true;
                                        var57.field2995 = var11;
                                        var57.field2994 = class166.field2579.method1024(true) - var12;
                                        var57.field2988 = class166.field2579.method1019((byte) 3) - var13;
                                        var57.field2996 = var11.field5295;
                                        class491.field7262.method2417(47, var57);
                                    }
                                }
                                if (var11.field5348 != null) {
                                    class207 var58 = new class207();
                                    var58.field2995 = var11;
                                    var58.field2996 = var11.field5348;
                                    class72.field1243.method2417(-120, var58);
                                }
                                if (var11.field5313 != null && class23.field483 > var11.field5248) {
                                    if (var11.field5328 == null || class23.field483 - var11.field5248 > 32) {
                                        class207 var63 = new class207();
                                        var63.field2995 = var11;
                                        var63.field2996 = var11.field5313;
                                        class378.field5715.method2417(68, var63);
                                    } else {
                                        label691: for (int var59 = var11.field5248; var59 < class23.field483; var59++) {
                                            int var60 = class199.field2922[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field5328.length; var61++) {
                                                if (var11.field5328[var61] == var60) {
                                                    class207 var62 = new class207();
                                                    var62.field2995 = var11;
                                                    var62.field2996 = var11.field5313;
                                                    class378.field5715.method2417(13, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5248 = class23.field483;
                                }
                                if (var11.field5227 != null && class353.field5404 > var11.field5264) {
                                    if (var11.field5247 == null || class353.field5404 - var11.field5264 > 32) {
                                        class207 var68 = new class207();
                                        var68.field2995 = var11;
                                        var68.field2996 = var11.field5227;
                                        class378.field5715.method2417(-120, var68);
                                    } else {
                                        label667: for (int var64 = var11.field5264; var64 < class353.field5404; var64++) {
                                            int var65 = class495.field7311[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field5247.length; var66++) {
                                                if (var11.field5247[var66] == var65) {
                                                    class207 var67 = new class207();
                                                    var67.field2995 = var11;
                                                    var67.field2996 = var11.field5227;
                                                    class378.field5715.method2417(-125, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5264 = class353.field5404;
                                }
                                if (var11.field5214 != null && class474.field7083 > var11.field5337) {
                                    if (var11.field5290 == null || class474.field7083 - var11.field5337 > 32) {
                                        class207 var73 = new class207();
                                        var73.field2995 = var11;
                                        var73.field2996 = var11.field5214;
                                        class378.field5715.method2417(-128, var73);
                                    } else {
                                        label643: for (int var69 = var11.field5337; var69 < class474.field7083; var69++) {
                                            int var70 = class531.field7825[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field5290.length; var71++) {
                                                if (var11.field5290[var71] == var70) {
                                                    class207 var72 = new class207();
                                                    var72.field2995 = var11;
                                                    var72.field2996 = var11.field5214;
                                                    class378.field5715.method2417(-119, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5337 = class474.field7083;
                                }
                                if (var11.field5306 != null && class227.field3225 > var11.field5316) {
                                    if (var11.field5268 == null || class227.field3225 - var11.field5316 > 32) {
                                        class207 var78 = new class207();
                                        var78.field2995 = var11;
                                        var78.field2996 = var11.field5306;
                                        class378.field5715.method2417(51, var78);
                                    } else {
                                        label619: for (int var74 = var11.field5316; var74 < class227.field3225; var74++) {
                                            int var75 = class29.field634[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field5268.length; var76++) {
                                                if (var11.field5268[var76] == var75) {
                                                    class207 var77 = new class207();
                                                    var77.field2995 = var11;
                                                    var77.field2996 = var11.field5306;
                                                    class378.field5715.method2417(50, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5316 = class227.field3225;
                                }
                                if (var11.field5333 != null && class203.field2971 > var11.field5376) {
                                    if (var11.field5285 == null || class203.field2971 - var11.field5376 > 32) {
                                        class207 var83 = new class207();
                                        var83.field2995 = var11;
                                        var83.field2996 = var11.field5333;
                                        class378.field5715.method2417(-127, var83);
                                    } else {
                                        label595: for (int var79 = var11.field5376; var79 < class203.field2971; var79++) {
                                            int var80 = class385.field5810[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field5285.length; var81++) {
                                                if (var11.field5285[var81] == var80) {
                                                    class207 var82 = new class207();
                                                    var82.field2995 = var11;
                                                    var82.field2996 = var11.field5333;
                                                    class378.field5715.method2417(-124, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5376 = class203.field2971;
                                }
                                if (class368.field5570 > var11.field5257 && var11.field5236 != null) {
                                    class207 var84 = new class207();
                                    var84.field2995 = var11;
                                    var84.field2996 = var11.field5236;
                                    class378.field5715.method2417(-119, var84);
                                }
                                if (class85.field1475 > var11.field5257 && var11.field5281 != null) {
                                    class207 var85 = new class207();
                                    var85.field2995 = var11;
                                    var85.field2996 = var11.field5281;
                                    class378.field5715.method2417(37, var85);
                                }
                                if (class409.field6133 > var11.field5257 && var11.field5302 != null) {
                                    class207 var86 = new class207();
                                    var86.field2995 = var11;
                                    var86.field2996 = var11.field5302;
                                    class378.field5715.method2417(-128, var86);
                                }
                                if (class523.field7751 > var11.field5257 && var11.field5331 != null) {
                                    class207 var87 = new class207();
                                    var87.field2995 = var11;
                                    var87.field2996 = var11.field5331;
                                    class378.field5715.method2417(50, var87);
                                }
                                if (class232.field3381 > var11.field5257 && var11.field5373 != null) {
                                    class207 var88 = new class207();
                                    var88.field2995 = var11;
                                    var88.field2996 = var11.field5373;
                                    class378.field5715.method2417(-128, var88);
                                }
                                var11.field5257 = class431.field6404;
                                if (var11.field5346 != null) {
                                    for (int var89 = 0; var89 < class483.field7187; var89++) {
                                        class207 var90 = new class207();
                                        var90.field2995 = var11;
                                        var90.field2990 = class109.field1842[var89].method1171((byte) 101);
                                        var90.field2989 = class109.field1842[var89].method1176((byte) 37);
                                        var90.field2996 = var11.field5346;
                                        class378.field5715.method2417(48, var90);
                                    }
                                }
                                if (class250.field3577 && var11.field5267 != null) {
                                    class207 var91 = new class207();
                                    var91.field2995 = var11;
                                    var91.field2996 = var11.field5267;
                                    class378.field5715.method2417(0, var91);
                                }
                            }
                            if (var11.field5215 == 5 && var11.field5233 != -1) {
                                var11.method2223(class2.field93, -2, class519.field7721).method796(92, class4.field109, var11.field5269);
                            }
                            class130.method977((byte) 66, var11);
                            if (var11.field5215 == 0) {
                                method1357(arg0, var11.field5322, var14, var15, var16, var17, var12 - var11.field5265, var13 - var11.field5226, arg8, arg9);
                                if (var11.field5291 != null) {
                                    method1357(var11.field5291, var11.field5322, var14, var15, var16, var17, var12 - var11.field5265, var13 - var11.field5226, arg8, arg9);
                                }
                                class352 var92 = (class352) class162.field2507.method171((byte) -96, (long) var11.field5322);
                                if (var92 != null) {
                                    if (class403.field6054 == class168.field2608 && var92.field5390 == 0 && !class197.field2903 && var21 && !class210.field3027) {
                                        class369.method2313((byte) 35);
                                    }
                                    class48.method454(var15, var12, var13, arg8, var17, (byte) 85, var92.field5391, var14, var16, arg9);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class130.method977((byte) 114, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method1358(int arg0) {
        int var1 = class409.field6135;
        int[] var2 = class358.field5445;
        int var3 = class267.field3844 ? var1 : class510.field7529 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class517 var5;
            if (var4 < var1) {
                var5 = class183.field2747[var2[var4]];
            } else {
                var5 = class34.field668[class148.field2363[var4 - var1]];
            }
            if (var5.field6232 == arg0) {
                var5.field7649 = 0;
                if (var5.field7630 < 0) {
                    var5.field7608 = false;
                } else {
                    int var6 = var5.method1654(92);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6228 & 0x7F) != 0 || (var5.field6233 & 0x7F) != 0) {
                            var5.field7608 = false;
                            continue;
                        }
                    } else if ((var5.field6228 & 0x7F) != 64 || (var5.field6233 & 0x7F) != 64) {
                        var5.field7608 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6228 >> 7;
                        int var8 = var5.field6233 >> 7;
                        if (class511.field7542[var7][var8] != var5.field7630) {
                            var5.field7608 = true;
                            continue;
                        }
                        if (class54.field942[var7][var8] > 1) {
                            var10002 = class54.field942[var7][var8]--;
                            var5.field7608 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6228 - var9 >> 7;
                        int var11 = var5.field6233 - var9 >> 7;
                        int var12 = var5.field6228 + var9 >> 7;
                        int var13 = var5.field6233 + var9 >> 7;
                        if (!class115.method852(var10, var5.field7630, var12, var11, -2, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class511.field7542[var14][var15] == var5.field7630) {
                                        var10002 = class54.field942[var14][var15]--;
                                    }
                                }
                            }
                            var5.field7608 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class256 && var5.field7689 != null && class531.field7821 >= var5.field7689.field2441 && class531.field7821 < var5.field7689.field2448) {
                        ((class256) var5).field3692 = false;
                    }
                    var5.field7608 = false;
                    var5.field6230 = class343.method2188(var5.field6232, var5.field6228, (byte) -102, var5.field6233);
                    class84.method651(var5, true);
                }
            }
        }
    }
}
