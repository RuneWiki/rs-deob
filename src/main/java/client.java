import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class362 {

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field1583;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field1582;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[[Z")
    public static boolean[][] field1581;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1566++;
        if (!this.method2176(-58)) {
            return;
        }
        class488.field6706 = new class407();
        class488.field6706.field5598 = Integer.parseInt(this.getParameter("worldid"));
        class243.field3481 = new class407();
        class243.field3481.field5598 = Integer.parseInt(this.getParameter("lobbyid"));
        class243.field3481.field5595 = this.getParameter("lobbyaddress");
        class243.field3480 = new class407();
        class243.field3480.field5598 = Integer.parseInt(this.getParameter("demoid"));
        class243.field3480.field5595 = this.getParameter("demoaddress");
        class145.field2353 = class338.method2065(-645087229, Integer.parseInt(this.getParameter("modewhere")));
        if (class63.field963 == class145.field2353) {
            class145.field2353 = class121.field2060;
        } else if (!class110.method875(class145.field2353, -1) && class94.field1340 != class145.field2353) {
            class145.field2353 = class94.field1340;
        }
        class27.field288 = class596.method3479(Integer.parseInt(this.getParameter("modewhat")), 0);
        if (class92.field1319 != class27.field288 && class27.field288 != class229.field3356 && class51.field729 != class27.field288) {
            class27.field288 = class51.field729;
        }
        try {
            class423.field5892 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class423.field5892 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class780.field10691 = true;
        } else {
            class780.field10691 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class781.field10717 = true;
        } else {
            class781.field10717 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class758.field10503 = true;
        } else {
            class758.field10503 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class113.field1647 = class448.field6175;
            } else if (var4.equals("1")) {
                class113.field1647 = class429.field5944;
            } else if (var4.equals("2")) {
                class113.field1647 = class665.field9367;
            } else if (var4.equals("3")) {
                class113.field1647 = class266.field3765;
            }
        }
        try {
            class276.field3953 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class276.field3953 = 0;
        }
        class275.field3848 = this.getParameter("quiturl");
        class121.field2061 = this.getParameter("settings");
        if (class121.field2061 == null) {
            class121.field2061 = "";
        }
        class477.field6535 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class363.field5166 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class363.field5166 = 0;
            }
        }
        class263.field3712 = Integer.parseInt(this.getParameter("colourid"));
        if (class263.field3712 < 0 || class263.field3712 >= class521.field7308.length) {
            class263.field3712 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class620.field8761 = true;
            class29.field315 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class245.field3515 = true;
        }
        class692.field9757 = this.getParameter("sskey");
        if (class692.field9757 != null && class692.field9757.length() < 2) {
            class692.field9757 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class615.field8729 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class122.field2074 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class578.field8335 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class18.field190 = this.getParameter("additionalInfo");
        if (class18.field190 != null && class18.field190.length() > 50) {
            class18.field190 = null;
        }
        class199.field2988 = this;
        if (class448.field6175 == class113.field1647) {
            class381.field5334 = 503;
            class499.field6858 = 765;
        } else if (class429.field5944 == class113.field1647) {
            class499.field6858 = 640;
            class381.field5334 = 480;
        }
        this.method2177(643, 37, class381.field5334, class113.field1647.field479, class27.field288.method3570(0) + 32, -111, class499.field6858);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method879(int arg0) {
        int var1 = class469.field6382;
        int[] var2 = class464.field6311;
        int var3 = class508.field6986 ? var1 : class657.field9270 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class281 var5;
            if (var4 < var1) {
                var5 = class588.field8451[var2[var4]];
            } else {
                var5 = ((class647) class486.field6697.method4253((long) class350.field4963[var4 - var1], -1)).field9191;
            }
            if (var5.field10361 == arg0) {
                var5.field4059 = 0;
                if (var5.field4049 < 0) {
                    var5.field4120 = false;
                } else {
                    int var6 = var5.method209(true);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field10347 & 0x1FF) != 0 || (var5.field10350 & 0x1FF) != 0) {
                            var5.field4120 = false;
                            continue;
                        }
                    } else if ((var5.field10347 & 0x1FF) != 256 || (var5.field10350 & 0x1FF) != 256) {
                        var5.field4120 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field10347 >> 9;
                        int var8 = var5.field10350 >> 9;
                        if (class128.field2153[var7][var8] != var5.field4049) {
                            var5.field4120 = true;
                            continue;
                        }
                        if (class195.field2935[var7][var8] > 1) {
                            var10002 = class195.field2935[var7][var8]--;
                            var5.field4120 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field10347 - var9 >> 9;
                        int var11 = var5.field10350 - var9 >> 9;
                        int var12 = var5.field10347 + var9 >> 9;
                        int var13 = var5.field10350 + var9 >> 9;
                        if (!class551.method3179(var13, var12, -31718, var10, var5.field4049, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class128.field2153[var14][var15] == var5.field4049) {
                                        var10002 = class195.field2935[var14][var15]--;
                                    }
                                }
                            }
                            var5.field4120 = true;
                            continue;
                        }
                    }
                    var5.field4120 = false;
                    var5.field10358 = class577.method3399(var5.field10350, var5.field10347, -8724, var5.field10361);
                    class630.method3597(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method880(int arg0) {
        field1565++;
        if (class193.field2899) {
            class203.method1433(arg0 + 11446);
        }
        class203.method1430(187);
        if (class686.field9702 != null) {
            class686.field9702.method2779((byte) -112);
        }
        if (class259.field3676 != null) {
            class253.method1670((byte) -98, class336.field4775, class259.field3676);
            class259.field3676 = null;
        }
        if (arg0 != -11401) {
            return;
        }
        if (class600.field8551 != null) {
            class600.field8551.method183((byte) 88);
            class600.field8551 = null;
        }
        class112.method931(-104);
        class138.field2286.method1846((byte) 125);
        class628.field8909.method3473(-15090);
        if (class224.field3278 != null) {
            class224.field3278.method4262(arg0 ^ 0xFFFFD09F);
            class224.field3278 = null;
        }
        try {
            class439.field6100.method1402(false);
            for (int var2 = 0; var2 < 37; var2++) {
                class641.field9024[var2].method1402(false);
            }
            class261.field3706.method1402(false);
            class523.field7324.method1402(false);
            class580.method3409(802);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method881() {
        int var0 = class469.field6382;
        int[] var1 = class464.field6311;
        int var2 = class508.field6986 ? var0 : class657.field9270 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class281 var4;
            if (var3 < var0) {
                var4 = class588.field8451[var1[var3]];
            } else {
                var4 = ((class647) class486.field6697.method4253((long) class350.field4963[var3 - var0], -1)).field9191;
            }
            if (var4.field4049 >= 0) {
                int var5 = var4.method209(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field10347 & 0x1FF) == 0 && (var4.field10350 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field10347 & 0x1FF) == 256 && (var4.field10350 & 0x1FF) == 256) {
                    continue;
                }
                var4.field10358 = class577.method3399(var4.field10350, var4.field10347, -8724, var4.field10361);
                class630.method3597(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static void method882(byte arg0) {
        if (arg0 != -60) {
            field1581 = null;
        }
        field1581 = null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method883(int arg0) {
        if (arg0 != 48) {
            this.method890(true);
        }
        field1576++;
        boolean var2 = class138.field2286.method1844((byte) 22);
        if (!var2) {
            this.method896((byte) -124);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method884(int arg0, int arg1) {
        class138.field2286.field4268++;
        field1579++;
        class248.field3564 = null;
        class273.field3834 = null;
        class3.field49 = arg0;
        class138.field2286.field4266 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Luf;)Lbs;")
    public static final class169 method885(class519 arg0) {
        class169 var1 = (class169) class114.field1802.method4253(((long) arg0.field7247 << 32) + (long) arg0.field7193, -1);
        return var1 == null ? arg0.field7217 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Luf;)Luf;")
    public static final class519 method886(class519 arg0) {
        int var1 = method885(arg0).method1249(11511);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class604.method3506(arg0.field7223, 255);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method887() {
        class327.field4662 = 0;
        for (int var0 = 0; var0 < class657.field9270; var0++) {
            class506 var1 = ((class647) class486.field6697.method4253((long) class350.field4963[var0], -1)).field9191;
            if (var1.field4120 && var1.method200((byte) -128) != -1) {
                int var2 = (var1.method209(true) - 1) * 256 + 252;
                int var3 = var1.field10347 - var2 >> 9;
                int var4 = var1.field10350 - var2 >> 9;
                class281 var5 = class477.method2827(var1.field10361, var3, var4, (byte) 84);
                if (var5 != null) {
                    int var6 = var5.field4051;
                    if (var5 instanceof class506) {
                        var6 += 2048;
                    }
                    if (var5.field4059 == 0 && var5.method200((byte) -128) != -1) {
                        class554.field7688[class327.field4662] = var6;
                        class2.field34[class327.field4662] = var6;
                        class327.field4662++;
                        var5.field4059++;
                    }
                    class554.field7688[class327.field4662] = var6;
                    class2.field34[class327.field4662] = var1.field4051 + 2048;
                    class327.field4662++;
                    var5.field4059++;
                }
            }
        }
        class81.method716(class327.field4662 - 1, class554.field7688, 0, class2.field34, Integer.MIN_VALUE);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    private final void method888(boolean arg0) {
        field1577++;
        if (class141.field2306 == 14) {
            return;
        }
        long var2 = class380.method2290(-10179) / 1000000L - class355.field5023;
        class355.field5023 = class380.method2290(-10179) / 1000000L;
        boolean var4 = class475.method2775(false);
        if (var4 && class301.field4330 && class646.field9183 != null) {
            class646.field9183.method3619((byte) -116);
        }
        if (class195.method1386(class141.field2306, (byte) 105)) {
            if (class753.field10466 != 0L && class337.method2062(arg0) > class753.field10466) {
                class548.method3169(class262.field3709, -8361, class388.method2333((byte) 47), class635.field8971, false);
            } else if (!class686.field9702.method446() && class745.field10357) {
                class145.method1158(-3);
            }
        }
        if (class259.field3676 == null) {
            Container var5;
            if (class410.field5617 != null) {
                var5 = class410.field5617;
            } else if (class343.field4881 == null) {
                var5 = class149.field2396;
            } else {
                var5 = class343.field4881;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class410.field5617 == var5) {
                Insets var8 = class410.field5617.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class688.field9724 != var6 || class668.field9393 != var7 || class789.field10785) {
                if (class686.field9702 == null || class686.field9702.method443()) {
                    class743.method4109(2);
                } else {
                    class668.field9393 = var7;
                    class688.field9724 = var6;
                }
                class753.field10466 = class337.method2062(false) + 500L;
                class789.field10785 = false;
            }
        }
        if (class259.field3676 != null && !class531.field7395 && class195.method1386(class141.field2306, (byte) 105)) {
            class548.method3169(-1, -8361, class420.field5820.field9488.method3773(17539), -1, false);
        }
        boolean var9 = arg0;
        if (class291.field4243) {
            var9 = true;
            class291.field4243 = false;
        }
        if (var9) {
            class39.method294((byte) 83);
        }
        if (class686.field9702 != null && class686.field9702.method446() || class388.method2333((byte) 47) != 1) {
            class31.method262((byte) -104);
        }
        if (class29.method246((byte) -70, class141.field2306)) {
            class2.method21(17, var9);
        } else if (class414.method2438(false, class141.field2306)) {
            class327.method1989((byte) -125);
        } else if (class461.method2694(class141.field2306, 83)) {
            class327.method1989((byte) -117);
        } else if (class532.method3099(class141.field2306, 0)) {
            if (class106.field1524 == 1) {
                if (class183.field2786 < class165.field2524) {
                    class183.field2786 = class165.field2524;
                }
                int var10 = (class183.field2786 - class165.field2524) * 50 / class183.field2786;
                class609.method3526(class563.field7810.method3281(class423.field5892, -1) + "<br>(" + var10 + "%)", class686.field9702, (byte) -23, class30.field322, class420.field5827, true);
            } else if (class106.field1524 == 2) {
                if (class83.field1247 < class472.field6427) {
                    class83.field1247 = class472.field6427;
                }
                int var11 = (class83.field1247 - class472.field6427) * 50 / class83.field1247 + 50;
                class609.method3526(class563.field7810.method3281(class423.field5892, -1) + "<br>(" + var11 + "%)", class686.field9702, (byte) -75, class30.field322, class420.field5827, true);
            } else {
                class609.method3526(class563.field7810.method3281(class423.field5892, -1), class686.field9702, (byte) -82, class30.field322, class420.field5827, true);
            }
        } else if (class141.field2306 == 10) {
            class56.method611(var2, -80);
        } else if (class141.field2306 == 13) {
            class609.method3526(class563.field7812.method3281(class423.field5892, -1) + "<br>" + class563.field7813.method3281(class423.field5892, -1), class686.field9702, (byte) -91, class30.field322, class420.field5827, false);
        }
        if (class707.field9903 == 3) {
            for (int var12 = 0; var12 < class538.field7479; var12++) {
                Rectangle var13 = class342.field4863[var12];
                if (class713.field9957[var12]) {
                    class686.field9702.method2771(var13.height, var13.x, -65281, 115, var13.y, var13.width);
                } else if (class780.field10685[var12]) {
                    class686.field9702.method2771(var13.height, var13.x, -65536, 125, var13.y, var13.width);
                } else {
                    class686.field9702.method2771(var13.height, var13.x, -16711936, 114, var13.y, var13.width);
                }
            }
        }
        if (class594.method3471(0)) {
            class3.method22(class686.field9702, -8);
        }
        if (class336.field4775.field1588 && class195.method1386(class141.field2306, (byte) 126) && class707.field9903 == 0 && class388.method2333((byte) 47) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class538.field7479; var15++) {
                if (class780.field10685[var15]) {
                    class780.field10685[var15] = false;
                    class95.field1359[var14++] = class342.field4863[var15];
                }
            }
            try {
                if (class593.field8489) {
                    class216.method1484(var14, 126, class95.field1359);
                } else {
                    class686.field9702.method2766(class95.field1359, var14, true);
                }
            } catch (class684 var20) {
            }
        } else if (!class29.method246((byte) -59, class141.field2306)) {
            for (int var16 = 0; var16 < class538.field7479; var16++) {
                class780.field10685[var16] = false;
            }
            try {
                if (class593.field8489) {
                    class714.method3969((byte) -51);
                } else {
                    class686.field9702.method2777(-16679);
                }
            } catch (class684 var19) {
                class349.method2122(var19, var19.getMessage() + " (Recovered) " + this.method898((byte) -102), 1);
                class636.method3625(false, 0, -101);
            }
        }
        class423.method2491(-482);
        int var18 = class420.field5820.field9470.method3126(17539);
        if (var18 == 0) {
            class579.method3405(15L, 10);
        } else if (var18 == 1) {
            class579.method3405(10L, 10);
        } else if (var18 == 2) {
            class579.method3405(5L, 10);
        } else if (var18 == 3) {
            class579.method3405(2L, 10);
        }
        if (class640.field9011) {
            class116.method1025(5);
        }
        if (class420.field5820.field9458.method1457(17539) == 1 && class141.field2306 == 3 && class379.field5314 != -1) {
            class420.field5820.method3781(class420.field5820.field9458, 104, 0);
            class95.method797(-61);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method889(int arg0) {
        field1572++;
        if (class141.field2306 == 14) {
            return;
        }
        class594.field8494++;
        if (class594.field8494 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class688.field9721 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class430.field5950.setSeed((long) class688.field9721);
        }
        if (class594.field8494 % 50 == 0) {
            class477.field6516 = class42.field546;
            class201.field2989 = class519.field7125;
            class42.field546 = 0;
            class519.field7125 = 0;
        }
        this.method883(48);
        if (class330.field4697 != null) {
            class330.field4697.method3504(255);
        }
        class674.method3774((byte) 109);
        class695.method3907((byte) 105);
        class681.field9656.method679(61);
        class754.field10496.method3068(-1);
        if (class686.field9702 != null) {
            class686.field9702.method74((int) class337.method2062(false));
        }
        class182.method1320(2);
        class79.field1174 = 0;
        class125.field2147 = 0;
        for (class618 var3 = class681.field9656.method680(13); var3 != null; var3 = class681.field9656.method680(13)) {
            int var6 = var3.method766(3036);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method764((byte) 87);
                if (class108.method866((byte) -126) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class594.method3471(0)) {
                        class21.method191(arg0 + 17387);
                    } else {
                        class215.method1480((byte) -95);
                    }
                } else if (class125.field2147 < 128) {
                    class321.field4560[class125.field2147] = var3;
                    class125.field2147++;
                }
            } else if (var6 == 0 && class79.field1174 < 75) {
                class506.field6944[class79.field1174] = var3;
                class79.field1174++;
            }
        }
        if (arg0 != -17480) {
            field1581 = null;
        }
        class179.field2745 = 0;
        for (class453 var4 = class754.field10496.method3069(-1); var4 != null; var4 = class754.field10496.method3069(-1)) {
            int var5 = var4.method1868((byte) -92);
            if (var5 == -1) {
                class483.field6658.method3728((byte) 125, var4);
            } else if (var5 == 6) {
                class179.field2745 += var4.method1872((byte) 66);
            } else if (class11.method153(var5, -2)) {
                class397.field5480.method3728((byte) 112, var4);
                if (class397.field5480.method3732(256) > 10) {
                    class397.field5480.method3726(12691);
                }
            }
        }
        if (class594.method3471(0)) {
            class726.method4023((byte) 74);
        }
        if (class29.method246((byte) -79, class141.field2306)) {
            class237.method1604((byte) -18);
            class691.method3885(79);
        } else if (class532.method3099(class141.field2306, 0)) {
            class697.method3913(true);
        }
        if (class251.method1665(-124, class141.field2306) && !class532.method3099(class141.field2306, 0)) {
            this.method903(-23362);
            class307.method1892((byte) -77);
            class243.method1617(20854);
        } else if (class761.method4207((byte) 99, class141.field2306) && !class532.method3099(class141.field2306, 0)) {
            this.method903(-23362);
            class243.method1617(20854);
        } else if (class141.field2306 == 12) {
            class243.method1617(20854);
        } else if (class659.method3694(9, class141.field2306) && !class532.method3099(class141.field2306, arg0 ^ 0xFFFFBBB8)) {
            class558.method3256(-102);
        } else if (class141.field2306 == 13) {
            class243.method1617(20854);
            if (class431.field6011 != -3 && class431.field6011 != 2 && class431.field6011 != 15) {
                class477.method2832(false, (byte) 123);
            }
        }
        class373.method2227(class686.field9702, -71);
        class397.field5480.method3726(arg0 + 30171);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final synchronized void method890(boolean arg0) {
        field1574++;
        if (class343.field4881 != null && class213.field3128 == null && !class336.field4775.field1588) {
            try {
                Class var2 = class343.field4881.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class213.field3128 = (Canvas) var3.get(class343.field4881);
                var3.set(class343.field4881, null);
                if (class213.field3128 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method890(arg0);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method891(int arg0) {
        if (class615.field8729) {
            class139.field2293 = 64;
        }
        field1580++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class743.method4109(2);
        class628.field8909 = new class595(class336.field4775);
        class138.field2286 = new class291();
        class561.method3265(new int[] { 20, 260 }, new int[] { 1000, 100 }, true);
        if (class94.field1340 != class145.field2353) {
            class351.field4977 = new byte[50][];
        }
        class420.field5820 = class555.method3202((byte) -90);
        if (class94.field1340 == class145.field2353) {
            class488.field6706.field5595 = this.getCodeBase().getHost();
        } else if (class110.method875(class145.field2353, -1)) {
            class488.field6706.field5595 = this.getCodeBase().getHost();
            class488.field6706.field5597 = class488.field6706.field5598 + 40000;
            class243.field3481.field5597 = class243.field3481.field5598 + 40000;
            class243.field3480.field5597 = class243.field3480.field5598 + 40000;
            class488.field6706.field5599 = class488.field6706.field5598 + 50000;
            class243.field3481.field5599 = class243.field3481.field5598 + 50000;
            class243.field3480.field5599 = class243.field3480.field5598 + 50000;
        } else if (class63.field963 == class145.field2353) {
            class488.field6706.field5595 = "127.0.0.1";
            class243.field3481.field5595 = "127.0.0.1";
            class488.field6706.field5597 = class488.field6706.field5598 + 40000;
            class243.field3480.field5595 = "127.0.0.1";
            class243.field3481.field5597 = class243.field3481.field5598 + 40000;
            class488.field6706.field5599 = class488.field6706.field5598 + 50000;
            class243.field3480.field5597 = class243.field3480.field5598 + 40000;
            class243.field3481.field5599 = class243.field3481.field5598 + 50000;
            class243.field3480.field5599 = class243.field3480.field5598 + 50000;
        }
        if (class429.field5944 == class113.field1647) {
            class611.field8683 = class247.field3536;
            class277.field4005 = 16777215;
            class78.field1169 = class284.field4173;
            class553.field7666 = true;
            class792.field10857 = 0;
        } else if (class266.field3765 == class113.field1647) {
            class611.field8683 = class712.field9945;
            class78.field1169 = class77.field1166;
        } else {
            class78.field1169 = class41.field478;
            class611.field8683 = class327.field4670;
        }
        class715.field9993 = class684.field9682 = class771.field10640 = class156.field2454 = new short[256];
        class472.field6424 = class488.field6706;
        if (class448.field6175 == class113.field1647) {
            class458.field6260 = false;
        }
        try {
            if (arg0 < 122) {
                return;
            }
            class338.field4798 = class199.field2988.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class681.field9656 = class39.method293(class213.field3128, true);
        class754.field10496 = class244.method1622(class213.field3128, true, true);
        try {
            if (class336.field4775.field1603 != null) {
                class439.field6100 = new class197(class336.field4775.field1603, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class641.field9024[var3] = new class197(class336.field4775.field1605[var3], 6000, 0);
                }
                class261.field3706 = new class197(class336.field4775.field1604, 6000, 0);
                class164.field2511 = new class590(255, class439.field6100, class261.field3706, 500000);
                class523.field7324 = new class197(class336.field4775.field1608, 24, 0);
                class336.field4775.field1603 = null;
                class336.field4775.field1605 = null;
                class336.field4775.field1608 = null;
                class336.field4775.field1604 = null;
            }
        } catch (IOException var5) {
            class261.field3706 = null;
            class523.field7324 = null;
            class164.field2511 = null;
            class439.field6100 = null;
        }
        if (class94.field1340 != class145.field2353) {
            class530.field7378 = true;
        }
        class281.field4113 = class563.field7810.method3281(class423.field5892, -1);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method892(int arg0) {
        int var1 = class469.field6382;
        int[] var2 = class464.field6311;
        for (int var3 = 0; var3 < class657.field9270 + var1; var3++) {
            class281 var4;
            if (var3 < var1) {
                var4 = class588.field8451[var2[var3]];
            } else {
                var4 = ((class647) class486.field6697.method4253((long) class350.field4963[var3 - var1], -1)).field9191;
            }
            if (var4.field10361 == arg0 && var4.field4049 >= 0) {
                int var5 = var4.method209(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field10347 & 0x1FF) != 0 || (var4.field10350 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field10347 & 0x1FF) != 256 || (var4.field10350 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field10347 >> 9;
                    int var7 = var4.field10350 >> 9;
                    if (var4.field4049 > class128.field2153[var6][var7]) {
                        class128.field2153[var6][var7] = var4.field4049;
                        class195.field2935[var6][var7] = 1;
                    } else if (class128.field2153[var6][var7] == var4.field4049) {
                        var10002 = class195.field2935[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field10347 - var8 >> 9;
                    int var10 = var4.field10350 - var8 >> 9;
                    int var11 = var4.field10347 + var8 >> 9;
                    int var12 = var4.field10350 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field4049 > class128.field2153[var13][var14]) {
                                class128.field2153[var13][var14] = var4.field4049;
                                class195.field2935[var13][var14] = 1;
                            } else if (class128.field2153[var13][var14] == var4.field4049) {
                                var10002 = class195.field2935[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Luf;IIIIIIIIIII)V")
    public static final void method893(class519[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class519 var13 = arg0[var12];
            if (var13 != null && var13.field7223 == arg1) {
                int var14 = var13.field7191 + arg6;
                int var15 = var13.field7151 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field7190 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field7128 + var14;
                    int var21 = var13.field7255 + var15;
                    if (var13.field7190 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field7190 == 0 || var13.field7140 || method885(var13).field2564 != 0 || class6.field86 == var13 || class688.field9723 == var13.field7232 || class344.field4891 == var13.field7232) {
                    if (!method901(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class593.field8489) {
                            var22 = class45.method342(false);
                            var23 = class87.method771(-2);
                        }
                        if (class766.field10586 == var13 && class391.method2345(class766.field10586, -30553) != null) {
                            class302.field4344 = true;
                            class507.field6968 = var14;
                            class58.field885 = var15;
                        }
                        if (var13.field7238 || var16 < var18 && var17 < var19) {
                            if (var13.field7154 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class511 var24 = (class511) class37.field441.method3731((byte) -108); var24 != null; var24 = (class511) class37.field441.method3729((byte) -119)) {
                                    if (var24.field7020) {
                                        var24.method4237(-1);
                                        var24.field7023.field7293 = false;
                                    }
                                }
                                if (class435.field6063 == 0) {
                                    class766.field10586 = null;
                                    class6.field86 = null;
                                }
                                class653.field9249 = 0;
                                class716.field9999 = false;
                                class153.field2439 = false;
                                if (!class383.field5382) {
                                    class110.method877(122);
                                }
                            }
                            boolean var25;
                            if (class754.field10496.method3065(-28062) + var22 >= var16 && class754.field10496.method3066(72) + var23 >= var17 && class754.field10496.method3065(-28062) + var22 < var18 && class754.field10496.method3066(72) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class295.field4298 && var25) {
                                if (var13.field7263 >= 0) {
                                    class578.field8338 = var13.field7263;
                                } else if (var13.field7154) {
                                    class578.field8338 = -1;
                                }
                            }
                            if (!class383.field5382 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class72.method682((byte) 113, arg10 - var14, var13, arg11 - var15);
                            }
                            boolean var26 = false;
                            if (class754.field10496.method3064(91) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class453 var28 = (class453) class397.field5480.method3731((byte) -124);
                            if (var28 != null && var28.method1868((byte) 91) == 0 && var28.method1873(-95) + var22 >= var16 && var28.method1869((byte) 123) + var23 >= var17 && var28.method1873(-117) + var22 < var18 && var28.method1869((byte) -40) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field7163 != null && !class594.method3471(0)) {
                                for (int var29 = 0; var29 < var13.field7163.length; var29++) {
                                    if (class681.field9656.method681((byte) 108, var13.field7163[var29])) {
                                        if (var13.field7236 == null || class594.field8494 >= var13.field7236[var29]) {
                                            byte var30 = var13.field7186[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class681.field9656.method681((byte) 110, 86) && !class681.field9656.method681((byte) 120, 82) && !class681.field9656.method681((byte) 104, 81)) && ((var30 & 0x2) == 0 || class681.field9656.method681((byte) 97, 86)) && ((var30 & 0x1) == 0 || class681.field9656.method681((byte) 102, 82)) && ((var30 & 0x4) == 0 || class681.field9656.method681((byte) 114, 81))) {
                                                if (var29 < 10) {
                                                    class628.method3589("", var29 + 1, -25984, var13.field7247, -1);
                                                } else if (var29 == 10) {
                                                    class558.method3253(109);
                                                    class169 var31 = method885(var13);
                                                    class227.method1540(var31.method1255((byte) 119), 23342, var31.field2555, var13);
                                                    class470.field6405 = class481.method2846(var13, true);
                                                    if (class470.field6405 == null) {
                                                        class470.field6405 = "Null";
                                                    }
                                                    class460.field6275 = var13.field7123 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field7174[var29];
                                                if (var13.field7236 == null) {
                                                    var13.field7236 = new int[var13.field7163.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field7236[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field7236[var29] = class594.field8494 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field7236 != null) {
                                        var13.field7236[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class370.method2207(var22 + var28.method1873(-121) - var14, var13, false, var23 + var28.method1869((byte) 125) - var15);
                            }
                            if (class766.field10586 != null && class766.field10586 != var13 && var25 && method885(var13).method1252(-30978)) {
                                class600.field8556 = var13;
                            }
                            if (class6.field86 == var13) {
                                class466.field6363 = true;
                                class47.field639 = var14;
                                class445.field6150 = var15;
                            }
                            if (var13.field7140 || var13.field7232 != 0) {
                                if (var25 && class179.field2745 != 0 && var13.field7207 != null) {
                                    class511 var33 = new class511();
                                    var33.field7020 = true;
                                    var33.field7023 = var13;
                                    var33.field7019 = class179.field2745;
                                    var33.field7021 = var13.field7207;
                                    class37.field441.method3728((byte) 109, var33);
                                }
                                if (class766.field10586 != null || class383.field5382 || class422.field5874 != var13.field7232 && class653.field9249 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field7232 != 0) {
                                    if (class744.field10340 == var13.field7232 || class575.field8294 == var13.field7232) {
                                        class341.field4857 = var13;
                                        if (class283.field4157 != null) {
                                            class283.field4157.method2320(var13.field7255, class686.field9702, 23527);
                                        }
                                        if (class744.field10340 == var13.field7232) {
                                            if (class383.field5382 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class422.method2487(class686.field9702, 86, arg9, arg8);
                                            class400 var34 = (class400) class209.field3056.method1730((byte) 45);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field5510 && arg10 < var34.field5513 && arg11 >= var34.field5517 && arg11 < var34.field5515) {
                                                    class110.method877(120);
                                                    class626.method3585(true, var34.field5516);
                                                }
                                                var34 = (class400) class209.field3056.method1729((byte) 100);
                                            }
                                        }
                                    }
                                    if (class688.field9723 == var13.field7232) {
                                        if (var13.method3047(65, class686.field9702) == null || class198.field2985 != 0 && class198.field2985 != 3 || class383.field5382 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field7135[var36];
                                        if (var35 < var37 || var35 > var13.field7259[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field7128 / 2;
                                        int var39 = var36 - var13.field7255 / 2;
                                        int var40;
                                        if (class783.field10725 == 4) {
                                            var40 = (int) class98.field1423 & 0x3FFF;
                                        } else {
                                            var40 = (int) class98.field1423 + class654.field9251 & 0x3FFF;
                                        }
                                        int var41 = class253.field3634[var40];
                                        int var42 = class253.field3633[var40];
                                        if (class783.field10725 != 4) {
                                            var41 = (class592.field8487 + 256) * var41 >> 8;
                                            var42 = (class592.field8487 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class783.field10725 == 4) {
                                            var45 = (class374.field5256 >> 9) + (var43 >> 2);
                                            var46 = (class45.field598 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class719.field10041.method209(true) - 1) * 256;
                                            var45 = (class719.field10041.field10347 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class719.field10041.field10350 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class295.field4298 && (class345.field4896 & 0x40) != 0) {
                                            class519 var48 = class153.method1203(0, class65.field979, class568.field7906);
                                            if (var48 == null) {
                                                class558.method3253(-101);
                                            } else {
                                                class526.method3076(var13.field7129, true, 1L, 500, " ->", var46, var45, false, true, class745.field10364, (long) (var13.field7193 << 0 | var13.field7247), 48, class470.field6405);
                                            }
                                            continue;
                                        }
                                        if (class429.field5944 == class113.field1647) {
                                            class526.method3076(-1, true, 1L, 500, "", var46, var45, false, true, -1, 0L, 45, class563.field7825.method3281(class423.field5892, -1));
                                        }
                                        class526.method3076(-1, true, 1L, 500, "", var46, var45, false, true, class367.field5189, 0L, 2, class143.field2332);
                                        continue;
                                    }
                                    if (class422.field5874 == var13.field7232) {
                                        class260.field3685 = var13;
                                        if (var25) {
                                            class716.field9999 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1873(-127) - var14 - var13.field7128 / 2) * 2.0D / (double) class751.field10425);
                                            int var50 = (int) (-((double) (var23 + var28.method1869((byte) 125) - var15 - var13.field7255 / 2) * 2.0D / (double) class751.field10425));
                                            int var51 = class761.field10553 + var49 + class751.field10445;
                                            int var52 = class488.field6705 + var50 + class751.field10446;
                                            class250 var53 = class466.method2723(50);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method1657((byte) -90, var54, var52, var51);
                                            if (var54 != null) {
                                                if (class681.field9656.method681((byte) 127, 82) && class778.field10675 > 0) {
                                                    class499.method2917(var54[1], var54[0], 63, var54[2]);
                                                    continue;
                                                }
                                                class153.field2439 = true;
                                                class770.field10627 = var54[0];
                                                class420.field5832 = var54[1];
                                                class338.field4797 = var54[2];
                                            }
                                            class653.field9249 = 1;
                                            class100.field1491 = false;
                                            class286.field4209 = class754.field10496.method3065(-28062);
                                            class591.field8482 = class754.field10496.method3066(72);
                                            continue;
                                        }
                                        if (var26 && class653.field9249 > 0) {
                                            if (class653.field9249 == 1 && (class286.field4209 != class754.field10496.method3065(-28062) || class591.field8482 != class754.field10496.method3066(72))) {
                                                class707.field9898 = class761.field10553;
                                                class692.field9756 = class488.field6705;
                                                class653.field9249 = 2;
                                            }
                                            if (class653.field9249 == 2) {
                                                class100.field1491 = true;
                                                class466.method2722(class707.field9898 + (int) ((double) (class286.field4209 - class754.field10496.method3065(-28062)) * 2.0D / (double) class751.field10428), 57);
                                                class662.method3710(class692.field9756 - (int) ((double) (class591.field8482 - class754.field10496.method3066(72)) * 2.0D / (double) class751.field10428), (byte) 87);
                                            }
                                            continue;
                                        }
                                        if (class653.field9249 > 0 && !class100.field1491) {
                                            if ((class194.field2907 == 1 || class278.method1775((byte) -109)) && class624.field8863 > 2) {
                                                class410.method2415(class591.field8482, class286.field4209, 6406);
                                            } else if (class433.method2592(-1)) {
                                                class410.method2415(class591.field8482, class286.field4209, 6406);
                                            }
                                        }
                                        class653.field9249 = 0;
                                        continue;
                                    }
                                    if (class153.field2444 == var13.field7232) {
                                        if (var26) {
                                            class139.method1133(var23 + class754.field10496.method3066(72) - var15, var13.field7128, var13.field7255, (byte) -26, var22 + class754.field10496.method3065(-28062) - var14);
                                        }
                                        continue;
                                    }
                                    if (class344.field4891 == var13.field7232) {
                                        class623.method3565(var14, var13, var15, (byte) 91);
                                        continue;
                                    }
                                }
                                if (!var13.field7218 && var27) {
                                    var13.field7218 = true;
                                    if (var13.field7196 != null) {
                                        class511 var55 = new class511();
                                        var55.field7020 = true;
                                        var55.field7023 = var13;
                                        var55.field7029 = var22 + var28.method1873(-105) - var14;
                                        var55.field7019 = var23 + var28.method1869((byte) 121) - var15;
                                        var55.field7021 = var13.field7196;
                                        class37.field441.method3728((byte) 110, var55);
                                    }
                                }
                                if (var13.field7218 && var26 && var13.field7240 != null) {
                                    class511 var56 = new class511();
                                    var56.field7020 = true;
                                    var56.field7023 = var13;
                                    var56.field7029 = var22 + class754.field10496.method3065(-28062) - var14;
                                    var56.field7019 = var23 + class754.field10496.method3066(72) - var15;
                                    var56.field7021 = var13.field7240;
                                    class37.field441.method3728((byte) 113, var56);
                                }
                                if (var13.field7218 && !var26) {
                                    var13.field7218 = false;
                                    if (var13.field7224 != null) {
                                        class511 var57 = new class511();
                                        var57.field7020 = true;
                                        var57.field7023 = var13;
                                        var57.field7029 = var22 + class754.field10496.method3065(-28062) - var14;
                                        var57.field7019 = var23 + class754.field10496.method3066(72) - var15;
                                        var57.field7021 = var13.field7224;
                                        class349.field4958.method3728((byte) 122, var57);
                                    }
                                }
                                if (var26 && var13.field7239 != null) {
                                    class511 var58 = new class511();
                                    var58.field7020 = true;
                                    var58.field7023 = var13;
                                    var58.field7029 = var22 + class754.field10496.method3065(-28062) - var14;
                                    var58.field7019 = var23 + class754.field10496.method3066(72) - var15;
                                    var58.field7021 = var13.field7239;
                                    class37.field441.method3728((byte) 99, var58);
                                }
                                if (!var13.field7293 && var25) {
                                    var13.field7293 = true;
                                    if (var13.field7159 != null) {
                                        class511 var59 = new class511();
                                        var59.field7020 = true;
                                        var59.field7023 = var13;
                                        var59.field7029 = var22 + class754.field10496.method3065(-28062) - var14;
                                        var59.field7019 = var23 + class754.field10496.method3066(72) - var15;
                                        var59.field7021 = var13.field7159;
                                        class37.field441.method3728((byte) 112, var59);
                                    }
                                }
                                if (var13.field7293 && var25 && var13.field7130 != null) {
                                    class511 var60 = new class511();
                                    var60.field7020 = true;
                                    var60.field7023 = var13;
                                    var60.field7029 = var22 + class754.field10496.method3065(-28062) - var14;
                                    var60.field7019 = var23 + class754.field10496.method3066(72) - var15;
                                    var60.field7021 = var13.field7130;
                                    class37.field441.method3728((byte) 104, var60);
                                }
                                if (var13.field7293 && !var25) {
                                    var13.field7293 = false;
                                    if (var13.field7253 != null) {
                                        class511 var61 = new class511();
                                        var61.field7020 = true;
                                        var61.field7023 = var13;
                                        var61.field7029 = var22 + class754.field10496.method3065(-28062) - var14;
                                        var61.field7019 = var23 + class754.field10496.method3066(72) - var15;
                                        var61.field7021 = var13.field7253;
                                        class349.field4958.method3728((byte) 112, var61);
                                    }
                                }
                                if (var13.field7231 != null) {
                                    class511 var62 = new class511();
                                    var62.field7023 = var13;
                                    var62.field7021 = var13.field7231;
                                    class781.field10710.method3728((byte) 121, var62);
                                }
                                if (var13.field7260 != null && class335.field4772 > var13.field7200) {
                                    if (var13.field7265 == null || class335.field4772 - var13.field7200 > 32) {
                                        class511 var67 = new class511();
                                        var67.field7023 = var13;
                                        var67.field7021 = var13.field7260;
                                        class37.field441.method3728((byte) 126, var67);
                                    } else {
                                        label711: for (int var63 = var13.field7200; var63 < class335.field4772; var63++) {
                                            int var64 = class455.field6218[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field7265.length; var65++) {
                                                if (var13.field7265[var65] == var64) {
                                                    class511 var66 = new class511();
                                                    var66.field7023 = var13;
                                                    var66.field7021 = var13.field7260;
                                                    class37.field441.method3728((byte) 118, var66);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7200 = class335.field4772;
                                }
                                if (var13.field7277 != null && class586.field8418 > var13.field7185) {
                                    if (var13.field7234 == null || class586.field8418 - var13.field7185 > 32) {
                                        class511 var72 = new class511();
                                        var72.field7023 = var13;
                                        var72.field7021 = var13.field7277;
                                        class37.field441.method3728((byte) 108, var72);
                                    } else {
                                        label687: for (int var68 = var13.field7185; var68 < class586.field8418; var68++) {
                                            int var69 = class656.field9265[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field7234.length; var70++) {
                                                if (var13.field7234[var70] == var69) {
                                                    class511 var71 = new class511();
                                                    var71.field7023 = var13;
                                                    var71.field7021 = var13.field7277;
                                                    class37.field441.method3728((byte) 114, var71);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7185 = class586.field8418;
                                }
                                if (var13.field7172 != null && class16.field180 > var13.field7155) {
                                    if (var13.field7286 == null || class16.field180 - var13.field7155 > 32) {
                                        class511 var77 = new class511();
                                        var77.field7023 = var13;
                                        var77.field7021 = var13.field7172;
                                        class37.field441.method3728((byte) 122, var77);
                                    } else {
                                        label663: for (int var73 = var13.field7155; var73 < class16.field180; var73++) {
                                            int var74 = class133.field2228[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field7286.length; var75++) {
                                                if (var13.field7286[var75] == var74) {
                                                    class511 var76 = new class511();
                                                    var76.field7023 = var13;
                                                    var76.field7021 = var13.field7172;
                                                    class37.field441.method3728((byte) 117, var76);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7155 = class16.field180;
                                }
                                if (var13.field7250 != null && class87.field1299 > var13.field7195) {
                                    if (var13.field7171 == null || class87.field1299 - var13.field7195 > 32) {
                                        class511 var82 = new class511();
                                        var82.field7023 = var13;
                                        var82.field7021 = var13.field7250;
                                        class37.field441.method3728((byte) 123, var82);
                                    } else {
                                        label639: for (int var78 = var13.field7195; var78 < class87.field1299; var78++) {
                                            int var79 = class296.field4304[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field7171.length; var80++) {
                                                if (var13.field7171[var80] == var79) {
                                                    class511 var81 = new class511();
                                                    var81.field7023 = var13;
                                                    var81.field7021 = var13.field7250;
                                                    class37.field441.method3728((byte) 118, var81);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7195 = class87.field1299;
                                }
                                if (var13.field7288 != null && class453.field6201 > var13.field7149) {
                                    if (var13.field7214 == null || class453.field6201 - var13.field7149 > 32) {
                                        class511 var87 = new class511();
                                        var87.field7023 = var13;
                                        var87.field7021 = var13.field7288;
                                        class37.field441.method3728((byte) 122, var87);
                                    } else {
                                        label615: for (int var83 = var13.field7149; var83 < class453.field6201; var83++) {
                                            int var84 = class341.field4861[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field7214.length; var85++) {
                                                if (var13.field7214[var85] == var84) {
                                                    class511 var86 = new class511();
                                                    var86.field7023 = var13;
                                                    var86.field7021 = var13.field7288;
                                                    class37.field441.method3728((byte) 123, var86);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7149 = class453.field6201;
                                }
                                if (class329.field4685 > var13.field7229 && var13.field7197 != null) {
                                    class511 var88 = new class511();
                                    var88.field7023 = var13;
                                    var88.field7021 = var13.field7197;
                                    class37.field441.method3728((byte) 104, var88);
                                }
                                if (class732.field10182 > var13.field7229 && var13.field7272 != null) {
                                    class511 var89 = new class511();
                                    var89.field7023 = var13;
                                    var89.field7021 = var13.field7272;
                                    class37.field441.method3728((byte) 117, var89);
                                }
                                if (class129.field2192 > var13.field7229 && var13.field7136 != null) {
                                    class511 var90 = new class511();
                                    var90.field7023 = var13;
                                    var90.field7021 = var13.field7136;
                                    class37.field441.method3728((byte) 98, var90);
                                }
                                if (class266.field3762 > var13.field7229 && var13.field7204 != null) {
                                    class511 var91 = new class511();
                                    var91.field7023 = var13;
                                    var91.field7021 = var13.field7204;
                                    class37.field441.method3728((byte) 102, var91);
                                }
                                if (class68.field1100 > var13.field7229 && var13.field7210 != null) {
                                    class511 var92 = new class511();
                                    var92.field7023 = var13;
                                    var92.field7021 = var13.field7210;
                                    class37.field441.method3728((byte) 126, var92);
                                }
                                if (class603.field8567 > var13.field7229 && var13.field7206 != null) {
                                    class511 var93 = new class511();
                                    var93.field7023 = var13;
                                    var93.field7021 = var13.field7206;
                                    class37.field441.method3728((byte) 101, var93);
                                }
                                if (class700.field9818 > var13.field7229 && var13.field7274 != null) {
                                    class511 var94 = new class511();
                                    var94.field7023 = var13;
                                    var94.field7021 = var13.field7274;
                                    class37.field441.method3728((byte) 99, var94);
                                }
                                var13.field7229 = class745.field10359;
                                if (var13.field7182 != null) {
                                    for (int var95 = 0; var95 < class125.field2147; var95++) {
                                        class511 var96 = new class511();
                                        var96.field7023 = var13;
                                        var96.field7027 = class321.field4560[var95].method765(-124);
                                        var96.field7030 = class321.field4560[var95].method764((byte) -32);
                                        var96.field7021 = var13.field7182;
                                        class37.field441.method3728((byte) 115, var96);
                                    }
                                }
                                if (class339.field4805 && var13.field7262 != null) {
                                    class511 var97 = new class511();
                                    var97.field7023 = var13;
                                    var97.field7021 = var13.field7262;
                                    class37.field441.method3728((byte) 103, var97);
                                }
                            }
                            if (var13.field7190 == 5 && var13.field7241 != -1) {
                                var13.method3048(class606.field8616, class648.field9192, true).method2320(var13.field7255, class686.field9702, 23527);
                            }
                            class761.method4210(-1, var13);
                            if (var13.field7190 == 0) {
                                method893(arg0, var13.field7247, var16, var17, var18, var19, var14 - var13.field7145, var15 - var13.field7244, arg8, arg9, arg10, arg11);
                                if (var13.field7170 != null) {
                                    method893(var13.field7170, var13.field7247, var16, var17, var18, var19, var14 - var13.field7145, var15 - var13.field7244, arg8, arg9, arg10, arg11);
                                }
                                class27 var98 = (class27) class37.field437.method4253((long) var13.field7247, -1);
                                if (var98 != null) {
                                    if (class448.field6175 == class113.field1647 && var98.field285 == 0 && !class383.field5382 && var25 && !class346.field4929) {
                                        class110.method877(105);
                                    }
                                    class613.method3538(var15, var98.field284, arg9, var17, arg11, var19, var14, arg10, arg8, -1, var16, var18);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class761.method4210(-1, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static final void method894(byte arg0) {
        field1567++;
        if (class63.field963 == class145.field2353) {
            return;
        }
        try {
            if (arg0 <= -65) {
                class154.method1204(class199.field2988, "tbrefresh", 22458);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method895(byte arg0) {
        field1564++;
        method882((byte) -60);
        class693.method3892((byte) -114);
        class371.method2209((byte) 16);
        class563.method3282((byte) 81);
        class72.method683((byte) -107);
        class522.method3072(29285);
        class51.method410((byte) 75);
        class129.method1093(1);
        class218.method1506((byte) 109);
        class467.method2731((byte) 106);
        class613.method3537((byte) 99);
        class390.method2344(-98);
        class454.method2669(3919);
        class766.method4232((byte) -123);
        class30.method250(0);
        class769.method4255(-118);
        class362.method2173(-58);
        class517.method3028(-67);
        class41.method303(-110);
        class765.method4228((byte) 99);
        class475.method2778(76);
        class675.method3777(115);
        class780.method4283((byte) 57);
        class665.method3727((byte) 114);
        class626.method3588(false);
        class291.method1834((byte) 87);
        class595.method3476(0);
        class604.method3505(false);
        class677.method3790(8579);
        class513.method3013((byte) -102);
        class197.method1405((byte) 126);
        class590.method3457(7);
        class494.method2883(3);
        class277.method1771(false);
        class538.method3119(false);
        class670.method3760((byte) -117);
        class12.method158((byte) -60);
        class556.method3208(true);
        class498.method2915(true);
        class496.method2904(64);
        class213.method1471(10);
        class47.method372((byte) 14);
        class456.method2671(26835);
        class564.method3288((byte) -76);
        class397.method2364((byte) 115);
        class158.method1221(61);
        class290.method1833(true);
        class582.method3417(-27718);
        class273.method1740((byte) -89);
        class619.method3553(-1);
        class663.method3716((byte) 124);
        class265.method1706((byte) -90);
        class739.method4071(32768);
        class402.method2389((byte) -108);
        class647.method3662(0);
        class20.method184(108);
        class431.method2575((byte) 103);
        class781.method4286(-12631);
        class773.method4264(true);
        class395.method2357((byte) -27);
        class79.method707(true);
        class250.method1662(-1);
        class78.method699(116);
        class384.method2319(false);
        class271.method1727(-25669);
        class157.method1216((byte) -67);
        class21.method193(256);
        class646.method3659(-1);
        class661.method3704(-125);
        class50.method399((byte) -109);
        class465.method2718((byte) 92);
        class302.method1880(0);
        class281.method1797(-21035);
        class396.method2359(113);
        class636.method3624(17871);
        class506.method2961((byte) 70);
        class27.method225((byte) -103);
        class169.method1256((byte) 97);
        class486.method2856(0);
        int var2 = -120 / ((-arg0 - 58) / 45);
        class156.method1208(113);
        class163.method1235(16711935);
        class107.method860((byte) 112);
        class91.method780(-16835);
        class167.method1242(0);
        class144.method1151(127);
        class422.method2489((byte) -62);
        class117.method1031(false);
        class407.method2407((byte) -108);
        class491.method2869(106);
        class242.method1613(-1);
        class723.method4016(24094);
        class324.method1960(7);
        class587.method3444((byte) -96);
        class285.method1812(98);
        class643.method3647(30094);
        class495.method2897(0);
        class98.method809((byte) -106);
        class596.method3480((byte) -81);
        class233.method1589((byte) 127);
        class105.method853((byte) -113);
        class341.method2096(18253);
        class458.method2679((byte) 64);
        class126.method1086(false);
        class109.method872(9481);
        class678.method3801(-94);
        class419.method2475(1);
        class179.method1306(-156);
        class443.method2634(-16777216);
        class694.method3903(106);
        class754.method4161((byte) -126);
        class84.method744(-60);
        class320.method1942(4159);
        class142.method1146(true);
        class703.method3935((byte) 29);
        class95.method795(63);
        class722.method4011(false);
        class38.method289((byte) -70);
        class668.method3740(12542);
        class479.method2837((byte) 80);
        class387.method2329(1);
        class583.method3422(1);
        class216.method1482((byte) -27);
        class542.method3132((byte) -20);
        class546.method3158((byte) -104);
        class527.method3079((byte) -7);
        class389.method2341(28);
        class254.method1678((byte) 54);
        class386.method2327(true);
        class555.method3203(false);
        class658.method3691(-18195);
        class539.method3128(1);
        class363.method2185(993);
        class191.method1369((byte) 127);
        class392.method2349(-5051);
        class438.method2609(-28192);
        class165.method1237((byte) 29);
        class684.method3871((byte) -111);
        class470.method2747(0);
        class667.method3737((byte) -13);
        class217.method1487((byte) 61);
        class199.method1412(-1737);
        class208.method1443(false);
        class745.method4111(24717);
        class477.method2814((byte) 84);
        class635.method3614(0);
        class420.method2479(false);
        class46.method359();
        class570.method3299((byte) -118);
        class307.method1893(2);
        class562.method3276(0);
        class715.method3974((byte) -103);
        class578.method3402(29615);
        class747.method4120(0);
        class125.method1083(93);
        class330.method2006(-3286);
        class697.method3914(114);
        class346.method2113(true);
        class252.method1669(-111);
        class733.method4058(16589);
        class712.method3965(0);
        class591.method3464((byte) 50);
        class319.method1934(1);
        class432.method2586(false);
        class234.method1590(0);
        class751.method4138();
        class464.method2705(true);
        class67.method657(1000);
        class288.method1822(12);
        class23.method213(true);
        class493.method2878(107);
        class388.method2334(false);
        class128.method1087((byte) -57);
        class150.method1182((byte) -28);
        class565.method3292((byte) 109);
        class345.method2111(20695);
        class620.method3557(-1);
        class300.method1875((byte) -89);
        class724.method4021(false);
        class162.method1231(-16);
        class248.method1646(-128);
        class614.method3539((byte) 121);
        class293.method1854(0);
        class187.method1351();
        class76.method693(true);
        class170.method1259(0);
        class631.method3601(0);
        class13.method166(-16368);
        class617.method3548((byte) 10);
        class710.method3960(117);
        class770.method4258((byte) 105);
        class548.method3167(1);
        class49.method384();
        class104.method852(2);
        class58.method615(100);
        class473.method2760(-108);
        class136.method1126(31972);
        class347.method2118((byte) -24);
        class729.method4053(0);
        class210.method1452(-7);
        class284.method1805(19751);
        class203.method1431(256);
        class336.method2060(128);
        class338.method2066(49);
        class427.method2504((byte) -92);
        class11.method154((byte) 93);
        class115.method1023((byte) 53);
        class602.method3497(34037);
        class82.method729();
        class335.method2056(118);
        class740.method4075((byte) -100);
        class143.method1150(2);
        class760.method4197(-1);
        class566.method3295();
        class108.method863(2015625216);
        class382.method2308(0);
        class113.method937(2);
        class426.method2502(3);
        class393.method2355((byte) 55);
        class421.method2484(80);
        class543.method3145();
        class138.method1132(8);
        class194.method1381((byte) -116);
        class405.method2397((byte) -85);
        class100.method838((byte) 93);
        class224.method1534(107);
        class168.method1243((byte) -118);
        class580.method3410(true);
        class309.method1899(true);
        class93.method787(85);
        class61.method627(21);
        class414.method2437(92);
        class603.method3501(23277);
        class261.method1695(-1);
        class623.method3562(-7648);
        class119.method1048(0);
        class500.method2921(0);
        class29.method241(false);
        class459.method2684(90);
        class771.method4261(256);
        class183.method1324(-17262);
        class541.method3130((byte) -66);
        class160.method1225(4);
        class350.method2124(2);
        class452.method2658(0);
        class18.method178((byte) 106);
        class774.method4269(2388);
        class400.method2378((byte) 43);
        class316.method1924(-118);
        class190.method1366(3);
        class36.method280(true);
        class482.method2847(-119);
        class505.method2956(90);
        class153.method1202((byte) -25);
        class40.method297((byte) -14);
        class122.method1067(-19572);
        class656.method3680(61);
        class295.method1862((byte) 106);
        class753.method4156(true);
        class266.method1713(126);
        class356.method2156(-123);
        class413.method2431(-1);
        class148.method1171(true);
        class457.method2677((byte) 25);
        class409.method2411(-1);
        class606.method3514(-2);
        class353.method2139(true);
        class370.method2208(-109);
        class510.method2981(-93);
        class368.method2204(0);
        class57.method613(-1);
        class579.method3406(-45);
        class272.method1737((byte) -59);
        class110.method876((byte) -114);
        class490.method2866((byte) -126);
        class469.method2742(-14559);
        class719.method4004((byte) -84);
        class709.method3952(94);
        class584.method3431(1);
        class641.method3639(62);
        class762.method4214(true);
        class137.method1127((byte) -80);
        class358.method2164((byte) -114);
        class726.method4024((byte) 45);
        class312.method1906((byte) 85);
        class599.method3492(33);
        class717.method3996(98);
        class243.method1614(false);
        class367.method2197((byte) -84);
        class359.method2168(false);
        class246.method1634(255);
        class782.method4296(0);
        class196.method1388();
        class123.method1069(-102);
        class374.method2231((byte) -75);
        class112.method928(0);
        class439.method2612(-103);
        class651.method3668((byte) 110);
        class497.method2909((byte) 46);
        class352.method2138(0);
        class594.method3468(0);
        class209.method1447(19678);
        class48.method378(false);
        class725.method4022(true);
        class662.method3708((byte) -87);
        class74.method687((byte) -106);
        class391.method2346(-27469);
        class351.method2131(false);
        class239.method1606(-1);
        class325.method1970();
        class94.method794((byte) 67);
        class704.method3938();
        class625.method3572();
        class185.method1338((byte) -118);
        class269.method1717((byte) 110);
        class378.method2278();
        class698.method3915(true);
        class752.method4154((byte) 28);
        class687.method3877(-95);
        class334.method2048((byte) -23);
        class149.method1180(-118);
        class342.method2100(-68);
        class508.method2969(-11922);
        class102.method840(true);
        class283.method1802(false);
        class621.method3559(-16531);
        class206.method1438(2);
        class714.method3970(0);
        class92.method785(-36);
        class166.method1240((byte) 3);
        class2.method18(0);
        class535.method3108((byte) 90);
        class60.method621(-88);
        class589.method3451(false);
        class77.method697((byte) 38);
        class472.method2755(88);
        class52.method418();
        class83.method730(31);
        class777.method4276((byte) 36);
        class611.method3532((byte) -53);
        class24.method219(-104);
        class728.method4043(1);
        class116.method1026(5);
        class133.method1103((byte) -77);
        class588.method3449(8);
        class707.method3949(-1);
        class789.method4316((byte) -51);
        class121.method1060((byte) -97);
        class488.method2862(1992662764);
        class640.method3634((byte) 57);
        class460.method2692((byte) -118);
        class792.method4327(false);
        class483.method2851(true);
        class573.method3322((byte) -33);
        class561.method3263(true);
        class411.method2419((byte) 96);
        class212.method1463(125);
        class553.method3194(-59);
        class229.method1573(-128);
        class436.method2606((byte) -15);
        class303.method1882(19512);
        class727.method4029(true);
        class504.method2947(22140);
        class296.method1866(-11741);
        class68.method666((byte) 123);
        class501.method2927((byte) -103);
        class653.method3673((byte) 125);
        class114.method1017(-21599);
        class664.method3719((byte) 68);
        class629.method3594((byte) -112);
        class227.method1543(128);
        class461.method2696(9);
        class657.method3687(-3);
        class768.method4246(1);
        class329.method2003(0);
        class429.method2509(-6640);
        class451.method2654(true);
        class161.method1230(-113);
        class276.method1755(475097287);
        class600.method3494((byte) -116);
        class705.method3941(0);
        class547.method3164(false);
        class249.method1653(true);
        class713.method3968(12799);
        class5.method37((byte) 86);
        class750.method4127();
        class37.method284(true);
        class81.method718(-52);
        class430.method2512(0);
        class790.method4317((byte) 63);
        class645.method3657(false);
        class289.method1823(5);
        class681.method3836(false);
        class433.method2591((byte) 114);
        class560.method3262(-474453951);
        class616.method3544((byte) -116);
        class575.method3390((byte) 69);
        class607.method3520(95);
        class379.method2285(true);
        class648.method3665(-315737692);
        class259.method1690(-1);
        class274.method1741((byte) 94);
        class552.method3184(false);
        class530.method3092(1);
        class145.method1155((byte) 85);
        class442.method2617((byte) 51);
        class245.method1627(80);
        class176.method1290(-14458);
        class4.method31((byte) -128);
        class608.method3524(115);
        class568.method3296(3);
        class321.method1945(2048);
        class256.method1683(false);
        class549.method3175(false);
        class230.method1576();
        class17.method176(18864);
        class361.method2170(1000);
        class576.method3395(265);
        class63.method638((byte) 127);
        class447.method2648(16);
        class26.method222(-1);
        class247.method1643(28933);
        class174.method1278(95);
        class700.method3921(6);
        class195.method1383((byte) 122);
        class25.method220((byte) 33);
        class188.method1360(3317);
        class399.method2370(-115);
        class364.method2193(0);
        class692.method3889(22261);
        class193.method1379(0);
        class586.method3443(123);
        class615.method3541(false);
        class531.method3094(0);
        class778.method4277(976);
        class410.method2414(-21409);
        class264.method1702(13706);
        class701.method3924(1683);
        class152.method1196((byte) -89);
        class71.method678(-21555);
        class237.method1599((byte) -60);
        class435.method2595(1);
        class267.method1716(-20455);
        class184.method1328(34962);
        class311.method1904(-21772);
        class509.method2972(124);
        class221.method1521(-128);
        class134.method1116((byte) 40);
        class523.method3074(1);
        class263.method1699(17643);
        class275.method1746(false);
        class235.method1593(-24209);
        class628.method3591(97);
        class286.method1821((byte) -25);
        class455.method2670((byte) 127);
        class605.method3512(3);
        class97.method800((byte) -5);
        class401.method2385((byte) 126);
        class315.method1918(-18831);
        class99.method814(-103);
        class124.method1076(4);
        class492.method2872(-96);
        class317.method1927(15601);
        class178.method1296((byte) 119);
        class215.method1479((byte) -113);
        class706.method3944((byte) 126);
        class514.method3022(0);
        class6.method42(-26296);
        class737.method4067(35);
        class673.method3767(true);
        class253.method1674(16384);
        class323.method1952(0);
        class87.method768((byte) 115);
        class686.method3872(4);
        class327.method1985(36);
        class44.method335(3314);
        class62.method632(false);
        class383.method2315(true);
        class180.method1310(-622);
        class322.method1949(-116);
        class279.method1778(false);
        class695.method3908((byte) 127);
        class55.method601((byte) 111);
        class369.method2206(-23571);
        class69.method674(90);
        class120.method1056(105);
        class205.method1437(true);
        class56.method610((byte) 111);
        class632.method3608((byte) -125);
        class654.method3677(-21054);
        class785.method4301((byte) -114);
        class691.method3888(-26079);
        class679.method3818((byte) -126);
        class521.method3060((byte) 71);
        class639.method3630((byte) 15);
        class478.method2835(false);
        class453.method2661(5);
        class622.method3561((byte) -85);
        class406.method2402(101);
        class262.method1698(-33);
        class228.method1546((byte) 98);
        class741.method4077((byte) 102);
        class231.method1578((byte) 1);
        class343.method2103(-100);
        class551.method3178(-1);
        class554.method3195(35);
        class507.method2968((byte) 60);
        class502.method2930(6);
        class732.method4056((byte) -126);
        class198.method1410(30);
        class280.method1780(-1);
        class403.method2395(-49);
        class106.method856((byte) 119);
        class222.method1525(true);
        class659.method3693(10370);
        class721.method4008(0);
        class448.method2649(-1);
        class349.method2121(true);
        class581.method3412((byte) 106);
        class260.method1691((byte) -127);
        class251.method1667(0);
        class86.method767(true);
        class297.method1867(-48);
        class339.method2076(0);
        class425.method2500(true);
        class466.method2728((byte) 113);
        class518.method3032(32);
        class141.method1143(100);
        class445.method2638(0);
        class39.method295(-2996);
        class164.method1236(30);
        class775.method4272((byte) 30);
        class528.method3087(12);
        class7.method51((byte) 100);
        class192.method1374(-118);
        class348.method2119((byte) 78);
        class278.method1776(-18196);
        class182.method1321((byte) 112);
        class720.method4007((byte) -126);
        class33.method272(-7549);
        class610.method3531((byte) 62);
        class223.method1530(124);
        if (class362.field5139) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method896(byte arg0) {
        field1573++;
        if (class252.field3616 < class138.field2286.field4268) {
            class472.field6424.method2406(20);
            class14.field174 = (class138.field2286.field4268 * 50 - 50) * 5;
            if (class14.field174 > 3000) {
                class14.field174 = 3000;
            }
            if (class138.field2286.field4268 >= 2 && class138.field2286.field4266 == 6) {
                this.method2174("js5connect_outofdate", (byte) -96);
                class141.field2306 = 14;
                return;
            }
            if (class138.field2286.field4268 >= 4 && class138.field2286.field4266 == -1) {
                this.method2174("js5crc", (byte) -91);
                class141.field2306 = 14;
                return;
            }
            if (class138.field2286.field4268 >= 4 && class29.method246((byte) -58, class141.field2306)) {
                if (class138.field2286.field4266 == 7 || class138.field2286.field4266 == 9) {
                    this.method2174("js5connect_full", (byte) -103);
                } else if (class138.field2286.field4266 <= 0) {
                    this.method2174("js5io", (byte) -69);
                } else if (class247.field3558 == null) {
                    this.method2174("js5connect", (byte) -96);
                } else {
                    this.method2174("js5proxy_" + class247.field3558.trim(), (byte) -127);
                }
                class141.field2306 = 14;
                return;
            }
        }
        class252.field3616 = class138.field2286.field4268;
        if (class14.field174 > 0) {
            class14.field174--;
            return;
        }
        try {
            if (arg0 < -100) {
                if (class3.field49 == 0) {
                    class248.field3564 = class472.field6424.method2409(class336.field4775, (byte) 76);
                    class3.field49++;
                }
                if (class3.field49 == 1) {
                    if (class248.field3564.field10365 == 2) {
                        if (class248.field3564.field10371 != null) {
                            class247.field3558 = (String) class248.field3564.field10371;
                        }
                        this.method884(0, 1000);
                        return;
                    }
                    if (class248.field3564.field10365 == 1) {
                        class3.field49++;
                    }
                }
                if (class3.field49 == 2) {
                    class273.field3834 = new class626((Socket) class248.field3564.field10371, class336.field4775, 25000);
                    class431 var2 = new class431(5);
                    var2.method2524(false, class260.field3686.field9792);
                    var2.method2548(643, (byte) -123);
                    class273.field3834.method3583(true, 5, 0, var2.field6002);
                    class3.field49++;
                    class176.field2646 = class337.method2062(false);
                }
                if (class3.field49 == 3) {
                    if (class29.method246((byte) -81, class141.field2306) || class273.field3834.method3586(true) > 0) {
                        int var3 = class273.field3834.method3582((byte) -108);
                        if (var3 != 0) {
                            this.method884(0, var3);
                            return;
                        }
                        class3.field49++;
                    } else if ((class337.method2062(false) - class176.field2646) > 30000L) {
                        this.method884(0, 1001);
                        return;
                    }
                }
                if (class3.field49 == 4) {
                    boolean var4 = class29.method246((byte) -35, class141.field2306) || class251.method1665(-97, class141.field2306) || class761.method4207((byte) 99, class141.field2306);
                    class129[] var5 = class129.method1090(19872);
                    class431 var6 = new class431(var5.length * 4);
                    class273.field3834.method3579(var6.field6002.length, var6.field6002, 0, 0);
                    for (int var7 = 0; var7 < var5.length; var7++) {
                        var5[var7].method1092(var6.method2526(17), true);
                    }
                    class138.field2286.method1841((byte) -10, class273.field3834, !var4);
                    class3.field49 = 0;
                    class248.field3564 = null;
                    class273.field3834 = null;
                }
            }
        } catch (IOException var8) {
            this.method884(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method897(int arg0) {
        field1575++;
        if (arg0 != -936) {
            return;
        }
        if (class420.field5820.field9482.method2338(arg0 + 18475) != 2) {
            this.method889(-17480);
            return;
        }
        try {
            this.method889(-17480);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class349.method2122(var5, var5.getMessage() + " (Recovered) " + this.method898((byte) -105), 1);
            class61.field934 = true;
            class636.method3625(false, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1568++;
        try {
            if (arg0.length != 6) {
                class208.method1446("Argument count", (byte) -40);
            }
            class488.field6706 = new class407();
            class488.field6706.field5598 = Integer.parseInt(arg0[0]);
            class243.field3481 = new class407();
            class243.field3481.field5598 = Integer.parseInt(arg0[1]);
            class243.field3480 = new class407();
            class243.field3480.field5598 = Integer.parseInt(arg0[2]);
            class145.field2353 = class63.field963;
            if (arg0[3].equals("live")) {
                class27.field288 = class51.field729;
            } else if (arg0[3].equals("rc")) {
                class27.field288 = class229.field3356;
            } else if (arg0[3].equals("wip")) {
                class27.field288 = class92.field1319;
            } else {
                class208.method1446("modewhat", (byte) -40);
            }
            class423.field5892 = class745.method4112(arg0[4], -29639);
            if (class423.field5892 == -1) {
                if (arg0[4].equals("english")) {
                    class423.field5892 = 0;
                } else if (arg0[4].equals("german")) {
                    class423.field5892 = 1;
                } else {
                    class208.method1446("language", (byte) -40);
                }
            }
            class781.field10717 = false;
            class780.field10691 = false;
            if (arg0[5].equals("game0")) {
                class113.field1647 = class448.field6175;
            } else if (arg0[5].equals("game1")) {
                class113.field1647 = class429.field5944;
            } else if (arg0[5].equals("game2")) {
                class113.field1647 = class665.field9367;
            } else if (arg0[5].equals("game3")) {
                class113.field1647 = class266.field3765;
            } else {
                class208.method1446("game", (byte) -40);
            }
            class363.field5166 = 0;
            class276.field3953 = 0;
            class692.field9757 = null;
            class578.field8335 = 0L;
            class245.field3515 = false;
            class18.field190 = null;
            class615.field8729 = false;
            class620.field8761 = true;
            class29.field315 = true;
            class263.field3712 = class113.field1647.field482;
            class121.field2061 = "";
            class122.field2074 = 0;
            client var1 = new client();
            class199.field2988 = var1;
            var1.method2175(class27.field288.method3570(0) + 32, 643, 1024, class113.field1647.field479, 768, false, 37, -62);
            class410.field5617.setLocation(40, 40);
        } catch (Exception var3) {
            class349.method2122(var3, null, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method898(byte arg0) {
        field1570++;
        String var2 = null;
        try {
            var2 = "[1)" + class222.field3266 + "," + class697.field9798 + "," + class192.field2891 + "," + class456.field6225 + "|";
            if (class719.field10041 != null) {
                var2 = var2 + "2)" + class403.field5560 + "," + (class719.field10041.field4142[0] + class222.field3266) + "," + (class719.field10041.field4136[0] + class697.field9798) + "|";
            }
            var2 = var2 + "3)" + class420.field5820.field9482.method2338(17539) + "|4)" + class420.field5820.field9485.method745(17539) + "|5)" + class388.method2333((byte) 47) + "|6)" + class709.field9923 + "," + class448.field6174 + "|";
            var2 = var2 + "7)" + class420.field5820.field9481.method3155(17539) + "|";
            var2 = var2 + "8)" + class420.field5820.field9457.method3741(17539) + "|";
            var2 = var2 + "9)" + class420.field5820.field9489.method2326(17539) + "|";
            if (arg0 >= -92) {
                field1581 = null;
            }
            var2 = var2 + "10)" + class420.field5820.field9487.method3081(17539) + "|";
            var2 = var2 + "11)" + class420.field5820.field9476.method1941(17539) + "|";
            var2 = var2 + "12)" + class420.field5820.field9495.method1677(17539) + "|";
            var2 = var2 + "13)" + class139.field2293 + "|";
            var2 = var2 + "14)" + class141.field2306;
            if (class63.field964 != null) {
                var2 = var2 + "|15)" + class63.field964.field10844;
            }
            try {
                if (class420.field5820.field9482.method2338(17539) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field1582 == null ? (field1582 = method905("client")) : field1582).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method899() {
        int var0 = class469.field6382;
        int[] var1 = class464.field6311;
        int var2 = class420.field5820.field9468.method776(17539);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class21 var14 = class588.field8451[var1[var4]];
            if (!var14.method206(-119)) {
                var14.field4049 = -1;
            } else if (var14.field221) {
                var14.field4049 = -1;
            } else {
                var14.method1445(245373737);
                if (var14.field3027 >= 0 && var14.field3035 >= 0 && var14.field3030 < class192.field2891 && var14.field3038 < class456.field6225) {
                    var14.field230 = var14.field4109 ? var3 : false;
                    if (class719.field10041 == var14) {
                        var14.field4049 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field4120) {
                            var15++;
                        }
                        if (var14.field4128 > class594.field8494) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method209(true) << 2);
                        if (var14.field206 || var14.field215) {
                            var16 += 512;
                        } else {
                            if (class752.field10461 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field4049 = var16 + 1;
                    }
                } else {
                    var14.field4049 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class657.field9270; var5++) {
            class506 var11 = ((class647) class486.field6697.method4253((long) class350.field4963[var5], -1)).field9191;
            if (var11.method2967(-110) && var11.field6964.method1307(class578.field8328, -6959)) {
                var11.method1445(245373737);
                if (var11.field3027 >= 0 && var11.field3035 >= 0 && var11.field3030 < class192.field2891 && var11.field3038 < class456.field6225) {
                    int var12 = 0;
                    if (!var11.field4120) {
                        var12++;
                    }
                    if (var11.field4128 > class594.field8494) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method209(true) << 2);
                    if (class752.field10461 == 0) {
                        if (var11.field6964.field2697) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class752.field10461 == 1) {
                        if (var11.field6964.field2697) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field6964.field2708) {
                        var13 += 1024;
                    } else if (!var11.field6964.field2746) {
                        var13 += 256;
                    }
                    var11.field4049 = var13 + 1;
                } else {
                    var11.field4049 = -1;
                }
            } else {
                var11.field4049 = -1;
            }
        }
        for (int var6 = 0; var6 < class55.field870.length; var6++) {
            class780 var7 = class55.field870[var6];
            if (var7 != null) {
                if (var7.field10692 == 1) {
                    class647 var8 = (class647) class486.field6697.method4253((long) var7.field10686, -1);
                    if (var8 != null) {
                        class506 var9 = var8.field9191;
                        if (var9.field4049 >= 0) {
                            var9.field4049 += 2048;
                        }
                    }
                } else if (var7.field10692 == 10) {
                    class21 var10 = class588.field8451[var7.field10686];
                    if (var10 != null && class719.field10041 != var10 && var10.field4049 >= 0) {
                        var10.field4049 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method900(boolean arg0) {
        field1571++;
        if (arg0) {
            method887();
        }
        if (class420.field5820.field9482.method2338(17539) != 2) {
            this.method888(false);
            return;
        }
        try {
            this.method888(false);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class349.method2122(var5, var5.getMessage() + " (Recovered) " + this.method898((byte) -97), 1);
            class61.field934 = true;
            class636.method3625(false, 0, 117);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Luf;)Z")
    public static final boolean method901(class519 arg0) {
        if (class346.field4929) {
            if (method885(arg0).field2564 != 0) {
                return false;
            }
            if (arg0.field7190 == 0) {
                return false;
            }
        }
        return arg0.field7264;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method902() {
        for (int var0 = 0; var0 < class192.field2891; var0++) {
            int[] var1 = class128.field2153[var0];
            for (int var2 = 0; var2 < class456.field6225; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method903(int arg0) {
        field1578++;
        if (class141.field2306 == 7 && class373.field5243 == 0) {
            if (class609.field8651 > 1) {
                class700.field9818 = class745.field10359;
                class609.field8651--;
            }
            if (!class383.field5382) {
                class110.method877(121);
            }
            for (int var2 = 0; var2 < 100 && class466.method2726((byte) -99); var2++) {
            }
        }
        class662.field9326++;
        class246.method1633(false, -1, null, -1);
        class623.method3565(-1, null, -1, (byte) 125);
        class141.method1141((byte) 111);
        class745.field10359++;
        for (int var3 = 0; var3 < class51.field731; var3++) {
            class506 var4 = class654.field9252[var3].field9191;
            if (var4 != null) {
                byte var5 = var4.field6964.field2690;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method209(true);
                    if ((var5 & 0x2) != 0 && var4.field4141 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field4142[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class192.field2891 - var6 - 1)) {
                                var9 = class192.field2891 - var6 - 1;
                            }
                            int var10 = var4.field4136[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class456.field6225 - var6 - 1 < var10) {
                                var10 = class456.field6225 - var6 - 1;
                            }
                            int var11 = class454.method2663(class619.field8758, var10, var9, 0, 0, class635.field8954, true, var6, var6, var4.field4136[0], var4.field4142[0], var6, class605.field8591[var4.field10361], -90, -1);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field4142[var12] = class635.field8954[var11 - var12 - 1];
                                    var4.field4136[var12] = class619.field8758[var11 - var12 - 1];
                                    var4.field4139[var12] = 1;
                                }
                                var4.field4141 = var11;
                            }
                        }
                    }
                    class205.method1435(-44, true, var4);
                    int var13 = class575.method3389((byte) -117, var4);
                    class289.method1824(-8619, var4);
                    class637.method3629(class116.field1989, var4, 0, class522.field7312, var13);
                    class102.method841(false, var4, class522.field7312);
                    class496.method2906(arg0 ^ 0xFFFFA4E8, var4);
                }
            }
        }
        if (class373.field5243 == 0 && class100.field1492 == 0) {
            if (class783.field10725 == 2) {
                class726.method4027(arg0 + 39746);
            } else {
                class198.method1409(false);
            }
            if (class733.field10199 >> 9 < 14 || class733.field10199 >> 9 >= class192.field2891 - 14 || class286.field4204 >> 9 < 14 || (class456.field6225 - 14) <= (class286.field4204 >> 9)) {
                class371.method2210(arg0 ^ 0x5B41);
            }
        }
        while (true) {
            class511 var14;
            class519 var15;
            class519 var16;
            do {
                var14 = (class511) class781.field10710.method3726(12691);
                if (var14 == null) {
                    while (true) {
                        class511 var17;
                        class519 var18;
                        class519 var19;
                        do {
                            var17 = (class511) class349.field4958.method3726(12691);
                            if (var17 == null) {
                                while (true) {
                                    class511 var20;
                                    class519 var21;
                                    class519 var22;
                                    do {
                                        var20 = (class511) class37.field441.method3726(12691);
                                        if (var20 == null) {
                                            if (class766.field10586 != null) {
                                                class785.method4305(-58);
                                            }
                                            if (class594.field8494 % 1500 == 0) {
                                                method894((byte) -66);
                                            }
                                            if (class141.field2306 == 7 && class373.field5243 == 0) {
                                                class133.method1104(arg0 + 23422);
                                            }
                                            if (arg0 != -23362) {
                                                return;
                                            }
                                            class366.method2196(true);
                                            if (class193.field2899 && (class337.method2062(false) - 60000L) > class20.field198) {
                                                class203.method1433(arg0 ^ 0xFFFFA4CD);
                                            }
                                            for (class521 var23 = (class521) class430.field5949.method1730((byte) 84); var23 != null; var23 = (class521) class430.field5949.method1729((byte) 100)) {
                                                if (class337.method2062(false) / 1000L - 5L > (long) var23.field7306) {
                                                    if (var23.field7307 > 0) {
                                                        class437.method2608("", var23.field7309 + class563.field7817.method3281(class423.field5892, -1), 5, "", (byte) 120, "", 0);
                                                    }
                                                    if (var23.field7307 == 0) {
                                                        class437.method2608("", var23.field7309 + class563.field7818.method3281(class423.field5892, -1), 5, "", (byte) 120, "", 0);
                                                    }
                                                    var23.method781(5555);
                                                }
                                            }
                                            if (class141.field2306 == 7 && class373.field5243 == 0) {
                                                if (class600.field8551 == null) {
                                                    class477.method2832(false, (byte) -99);
                                                    return;
                                                }
                                                class368.field5212++;
                                                if (class368.field5212 > 50) {
                                                    class243.field3477++;
                                                    class302 var24 = class582.method3419(class253.field3632, (byte) 126, class626.field8901);
                                                    class501.method2928(0, var24);
                                                }
                                                try {
                                                    class323.method1951(false);
                                                    return;
                                                } catch (IOException var25) {
                                                    class477.method2832(false, (byte) 103);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field7023;
                                        if (var21.field7193 < 0) {
                                            break;
                                        }
                                        var22 = class604.method3506(var21.field7223, 255);
                                    } while (var22 == null || var22.field7170 == null || var21.field7193 >= var22.field7170.length || var22.field7170[var21.field7193] != var21);
                                    class46.method357(var20);
                                }
                            }
                            var18 = var17.field7023;
                            if (var18.field7193 < 0) {
                                break;
                            }
                            var19 = class604.method3506(var18.field7223, 255);
                        } while (var19 == null || var19.field7170 == null || var18.field7193 >= var19.field7170.length || var19.field7170[var18.field7193] != var18);
                        class46.method357(var17);
                    }
                }
                var15 = var14.field7023;
                if (var15.field7193 < 0) {
                    break;
                }
                var16 = class604.method3506(var15.field7223, 255);
            } while (var16 == null || var16.field7170 == null || var16.field7170.length <= var15.field7193 || var16.field7170[var15.field7193] != var15);
            class46.method357(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method904(int arg0) {
        class580.field8354.method2881((byte) -86);
        field1569++;
        if (arg0 != 3078) {
            field1581 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method905(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
