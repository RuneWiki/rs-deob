import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class1 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
    public static int[] field2697 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lsc;")
    public static class181 field2694 = class149.method967(255, "m");

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Ljava/awt/Frame;")
    public static Frame field2692;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2691++;
        if (!this.method3((byte) -87)) {
            return;
        }
        class62.field947 = Integer.parseInt(this.getParameter("worldid"));
        class137.field2249 = Integer.parseInt(this.getParameter("modewhat"));
        class113.field1840 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class41.field608 = true;
        } else {
            class41.field608 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class213.field3664 = true;
        } else {
            class213.field3664 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class173.method1145(110);
            class196.field3431 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class65.field1069 = 1;
        } else {
            class65.field1069 = 0;
        }
        try {
            class8.field158 = Integer.parseInt(this.getParameter("js"));
            class85.field1359 = Integer.parseInt(this.getParameter("plug"));
            class264.field4584 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var10) {
        }
        class4.field78 = class107.field1748.method1214(this, -11964);
        if (class4.field78 == null) {
            class4.field78 = class241.field4187;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class181 var7 = class1.method9(0, -1, var6.length, var6);
            boolean var8 = class155.method1035(-21, var7);
            if (var8) {
                class79.field1277 = var7;
            }
        }
        class173.field2912 = this.getCodeBase().getHost();
        this.method11(class137.field2249 + 32, 765, 503, 0, 507);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class84.method569((byte) 99);
            }
            class62.field947 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class113.field1840 = 0;
            } else if (arg0[1].equals("office")) {
                class113.field1840 = 1;
            } else if (arg0[1].equals("local")) {
                class113.field1840 = 2;
            } else {
                class84.method569((byte) 120);
            }
            if (arg0[2].equals("live")) {
                class137.field2249 = 0;
            } else if (arg0[2].equals("rc")) {
                class137.field2249 = 1;
            } else if (arg0[2].equals("wip")) {
                class137.field2249 = 2;
            } else {
                class84.method569((byte) 89);
            }
            if (arg0[4].equals("free")) {
                class213.field3664 = false;
            } else if (arg0[4].equals("members")) {
                class213.field3664 = true;
            } else {
                class84.method569((byte) 103);
            }
            if (arg0[5].equals("english")) {
                class196.field3431 = 0;
            } else if (arg0[5].equals("german")) {
                class173.method1145(119);
                class196.field3431 = 1;
            } else {
                class84.method569((byte) 94);
            }
            if (arg0[6].equals("game0")) {
                class65.field1069 = 0;
            } else if (arg0[6].equals("game1")) {
                class65.field1069 = 1;
            } else {
                class84.method569((byte) 94);
            }
            if (arg0.length != 8) {
                class41.field608 = false;
            } else if (arg0[7].equals("safemode")) {
                class41.field608 = true;
            } else {
                class84.method569((byte) 96);
            }
            class4.field78 = class241.field4187;
            class173.field2912 = "127.0.0.1";
            class264.field4584 = 0;
            client var1 = new client();
            var1.method8(765, 15246, 27, 507, 503, "runescape", class137.field2249 + 32);
            class43.field677.setLocation(40, 40);
        } catch (Exception var3) {
            class83.method565(var3, (String) null, 124);
        }
        field2702++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        field2703++;
        if (class5.field106 == 1000) {
            return;
        }
        class237.field4125++;
        if ((class237.field4125 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class261.field4558 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class62.field954.setSeed((long) class261.field4558);
        }
        this.method1061(48);
        if (arg0 != 2) {
            method1055((class175[]) null, -114, -63, -90, 32, 39, 75, -116);
        }
        class125.method813((byte) 117);
        class131.method846(-104);
        class4.method36((byte) 18);
        class57.method415(43);
        class45.method307((byte) 77);
        if (class115.field1879 != null) {
            int var3 = class115.field1879.method265(-70);
            class5.field103 = var3;
        }
        if (class5.field106 == 0) {
            this.method1054(1234);
            class86.method582(-20898);
        } else if (class5.field106 == 5) {
            this.method1054(arg0 + 1232);
            class86.method582(arg0 ^ 0xFFFFAE5C);
        } else if (class5.field106 == 25 || class5.field106 == 28) {
            class217.method1441(24364);
        }
        if (class5.field106 == 10) {
            this.method1060((byte) 90);
            class77.method535(arg0);
            class2.method23(-711023152);
        } else if (class5.field106 == 30) {
            class166.method1106(-16203);
            return;
        } else if (class5.field106 == 40) {
            class2.method23(-711023152);
            if (class102.field1704 != -3) {
                if (class102.field1704 == 15) {
                    class106.method710(115);
                    return;
                }
                if (class102.field1704 != 2) {
                    class184.method1257((byte) -58);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method15(boolean arg0) {
        field2701++;
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class224.field3870 != null) {
            class224.field3870.method909(!arg0, this.getClass());
        }
        if (class120.field1973 != null) {
            class120.field1973.field1115 = false;
        }
        class120.field1973 = null;
        if (class216.field3713 != null) {
            class216.field3713.method313(79);
            class216.field3713 = null;
        }
        class27.method230(class107.field1740, -123);
        class145.method934(52, class107.field1740);
        if (class115.field1879 != null) {
            class115.field1879.method267(11198, class107.field1740);
        }
        class116.method766((byte) -83);
        class111.method741(3533);
        class115.field1879 = null;
        if (class174.field2914 != null) {
            class174.field2914.method1711(103);
        }
        if (class8.field156 != null) {
            class8.field156.method1711(-35);
        }
        class234.method1608(-2104841812);
        class58.method424((byte) 76);
        if (arg0) {
            method1058((class175) null);
        }
        try {
            if (class93.field1479 != null) {
                class93.field1479.method1451(11020);
            }
            if (class238.field4134 != null) {
                for (int var2 = 0; var2 < class238.field4134.length; var2++) {
                    if (class238.field4134[var2] != null) {
                        class238.field4134[var2].method1451(11020);
                    }
                }
            }
            if (class19.field349 != null) {
                class19.field349.method1451(11020);
            }
            if (class190.field3353 != null) {
                class190.field3353.method1451(11020);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public static void method1053(int arg0) {
        field2692 = null;
        if (arg0 >= -77) {
            field2692 = null;
        }
        field2694 = null;
        field2697 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1054(int arg0) {
        field2690++;
        if (class70.field1126 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class213.method1414(-9292);
            if (class27.field482 == 0L) {
                class27.field482 = var4;
            }
            if (var3 > 16384 && (var4 - class27.field482) < 5000L) {
                if ((var4 - class113.field1837) > 1000L) {
                    System.gc();
                    class113.field1837 = var4;
                }
                class236.field4100 = 5;
                class140.field2268 = class254.field4455;
            } else {
                class140.field2268 = class135.field2197;
                class70.field1126 = 10;
                class236.field4100 = 5;
            }
        } else if (class70.field1126 == 10) {
            class239.method1632(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class109.field1784[var6] = new class8(104, 104);
            }
            class70.field1126 = 30;
            class140.field2268 = class106.field1734;
            class236.field4100 = 10;
        } else if (class70.field1126 == 30) {
            class21.field382 = class47.method319(true, 1000000, true, 0, false);
            class99.field1626 = class47.method319(true, 1000000, true, 1, false);
            class250.field4362 = class47.method319(false, 1000000, true, 2, true);
            class69.field1111 = class47.method319(true, 1000000, true, 3, false);
            class264.field4600 = class47.method319(true, 1000000, true, 4, false);
            class90.field1435 = class47.method319(true, 1000000, true, 5, true);
            class13.field266 = class47.method319(true, 1000000, false, 6, true);
            class45.field692 = class47.method319(true, arg0 ^ 0xF4692, true, 7, false);
            class254.field4453 = class47.method319(true, 1000000, true, 8, false);
            class241.field4179 = class47.method319(true, 1000000, true, 9, false);
            class196.field3427 = class47.method319(true, 1000000, true, 10, false);
            class132.field2189 = class47.method319(true, 1000000, true, 11, false);
            class229.field3921 = class47.method319(true, 1000000, true, 12, false);
            class71.field1132 = class47.method319(true, 1000000, true, 13, false);
            class257.field4503 = class47.method319(true, 1000000, false, 14, false);
            class98.field1583 = class47.method319(true, 1000000, true, 15, false);
            class13.field265 = class47.method319(true, 1000000, true, 16, false);
            class221.field3825 = class47.method319(true, arg0 ^ 0xF4692, true, 17, false);
            class64.field1053 = class47.method319(true, 1000000, true, 18, false);
            class258.field4510 = class47.method319(true, 1000000, true, 19, false);
            class81.field1301 = class47.method319(true, 1000000, true, 20, false);
            class80.field1293 = class47.method319(true, 1000000, true, 21, false);
            class162.field2773 = class47.method319(true, arg0 ^ 0xF4692, true, 22, false);
            class37.field571 = class47.method319(true, 1000000, true, 23, true);
            class41.field613 = class47.method319(true, 1000000, true, 24, false);
            class248.field4334 = class47.method319(true, arg0 + 998766, true, 25, false);
            class198.field3439 = class47.method319(true, 1000000, true, 26, true);
            class236.field4100 = 15;
            class70.field1126 = 40;
            class140.field2268 = class93.field1477;
        } else if (class70.field1126 == 40) {
            byte var7 = 0;
            int var8 = var7 + class21.field382.method595(29455) * 4 / 100;
            int var9 = var8 + class99.field1626.method595(29455) * 4 / 100;
            int var10 = var9 + class250.field4362.method595(29455) / 100;
            int var11 = var10 + class69.field1111.method595(29455) * 2 / 100;
            int var12 = var11 + class264.field4600.method595(29455) * 6 / 100;
            int var13 = var12 + class90.field1435.method595(29455) * 4 / 100;
            int var14 = var13 + class13.field266.method595(arg0 + 28221) * 2 / 100;
            int var15 = var14 + class45.field692.method595(arg0 ^ 0x77DD) * 50 / 100;
            int var16 = var15 + class254.field4453.method595(29455) * 2 / 100;
            int var17 = var16 + class241.field4179.method595(arg0 + 28221) * 2 / 100;
            int var18 = var17 + class196.field3427.method595(29455) * 2 / 100;
            int var19 = var18 + class132.field2189.method595(29455) * 2 / 100;
            int var20 = var19 + class229.field3921.method595(29455) * 2 / 100;
            int var21 = var20 + class71.field1132.method595(29455) * 2 / 100;
            int var22 = var21 + class257.field4503.method595(29455) * 2 / 100;
            int var23 = var22 + class98.field1583.method595(29455) * 2 / 100;
            int var24 = var23 + class13.field265.method595(29455) / 100;
            int var25 = var24 + class221.field3825.method595(29455) / 100;
            int var26 = var25 + class64.field1053.method595(29455) / 100;
            int var27 = var26 + class258.field4510.method595(29455) / 100;
            int var28 = var27 + class81.field1301.method595(29455) / 100;
            int var29 = var28 + class80.field1293.method595(29455) / 100;
            int var30 = var29 + class162.field2773.method595(29455) / 100;
            int var31 = var30 + class37.field571.method595(29455) / 100;
            int var32 = var31 + class41.field613.method595(29455) / 100;
            int var33 = var32 + class248.field4334.method595(29455) / 100;
            int var34 = var33 + class198.field3439.method595(29455) / 100;
            if (var34 == 100) {
                class140.field2268 = class196.field3416;
                class236.field4100 = 20;
                class138.method889(-111, class254.field4453);
                class143.method921(class254.field4453, true);
                class159.method1070(class254.field4453, 1);
                class228.method1497(52, class254.field4453);
                class70.field1126 = 45;
            } else {
                if (var34 != 0) {
                    class140.field2268 = class175.method1164(new class181[] { class188.field3326, class169.method1119((byte) 96, var34), class198.field3442 }, (byte) 125);
                }
                class236.field4100 = 20;
            }
        } else if (class70.field1126 == 45) {
            class113.method752(class82.field1317, 2, 22050, -1);
            class237.field4121 = new class184();
            class237.field4121.method1264(0, 128, 9);
            class174.field2914 = class163.method1089(class224.field3870, -43, 22050, 0, class107.field1740);
            class174.field2914.method1702(class237.field4121, arg0 ^ 0xFFFFFB58);
            class2.method22(class98.field1583, class257.field4503, class264.field4600, false, class237.field4121);
            class8.field156 = class163.method1089(class224.field3870, arg0 - 1269, 2048, 1, class107.field1740);
            class90.field1420 = new class104();
            class8.field156.method1702(class90.field1420, -110);
            class247.field4315 = new class38(22050, class207.field3554);
            class246.field4295 = class13.field266.method107(class9.field184, 127);
            class70.field1126 = 50;
            class236.field4100 = 30;
            class140.field2268 = class107.field1752;
        } else if (class70.field1126 == 50) {
            int var35 = class135.method869(class71.field1132, arg0 - 1119, class254.field4453);
            int var36 = class80.method558(false);
            if (var36 > var35) {
                class140.field2268 = class175.method1164(new class181[] { class43.field680, class169.method1119((byte) -119, var35 * 100 / var36), class198.field3442 }, (byte) 126);
                class236.field4100 = 35;
            } else {
                class70.field1126 = 60;
                class236.field4100 = 35;
                class140.field2268 = class126.field2098;
            }
        } else if (class70.field1126 == 60) {
            int var37 = class178.method1186(28094, class254.field4453);
            int var38 = class235.method1614(128);
            if (var38 > var37) {
                class140.field2268 = class175.method1164(new class181[] { class61.field935, class169.method1119((byte) -127, var37 * 100 / var38), class198.field3442 }, (byte) 125);
                class236.field4100 = 40;
            } else {
                class236.field4100 = 40;
                class70.field1126 = 65;
                class140.field2268 = class90.field1416;
            }
        } else if (class70.field1126 == 65) {
            class108.method724(class71.field1132, class254.field4453, 8910);
            class236.field4100 = 45;
            class140.field2268 = class155.field2590;
            class92.method612(5, arg0 ^ 0x42D);
            class70.field1126 = 70;
        } else if (class70.field1126 == 70) {
            byte var39 = 0;
            class250.field4362.method109(1);
            int var40 = var39 + class250.field4362.method93(118);
            class13.field265.method109(arg0 ^ 0x4D3);
            int var41 = var40 + class13.field265.method93(127);
            class221.field3825.method109(1);
            int var42 = var41 + class221.field3825.method93(125);
            class64.field1053.method109(arg0 - 1233);
            int var43 = var42 + class64.field1053.method93(117);
            class258.field4510.method109(1);
            int var44 = var43 + class258.field4510.method93(119);
            class81.field1301.method109(1);
            int var45 = var44 + class81.field1301.method93(-102);
            class80.field1293.method109(arg0 - 1233);
            int var46 = var45 + class80.field1293.method93(124);
            class162.field2773.method109(arg0 ^ 0x4D3);
            int var47 = var46 + class162.field2773.method93(-99);
            class41.field613.method109(1);
            int var48 = var47 + class41.field613.method93(-44);
            class248.field4334.method109(1);
            int var49 = var48 + class248.field4334.method93(126);
            if (var49 < 1000) {
                class140.field2268 = class175.method1164(new class181[] { class209.field3578, class169.method1119((byte) 96, var49 / 10), class198.field3442 }, (byte) 126);
                class236.field4100 = 50;
            } else {
                class179.method1194((byte) 75, class250.field4362);
                class151.method979(class250.field4362, 0);
                class25.method217(true, class250.field4362);
                class213.method1413(-1, class250.field4362, class45.field692);
                class61.method440(class45.field692, class213.field3664, class13.field265, 94);
                class37.method271(class45.field692, class64.field1053, arg0 ^ 0xFFFFFB7C);
                class73.method514(class213.field3664, class221.field3823, class258.field4510, class45.field692, 85);
                class261.method1773(class250.field4362, (byte) -117);
                class140.method898(class81.field1301, class21.field382, class99.field1626, (byte) -18);
                class169.method1121(class80.field1293, class45.field692, arg0 + 24760);
                class173.method1141(class162.field2773, false);
                class169.method1120(class250.field4362, 16);
                class131.method848(class69.field1111, class71.field1132, -31, class45.field692, class254.field4453);
                class4.method35(class250.field4362, 117);
                class141.method901(105, class221.field3825);
                class45.method308(class248.field4334, true, new class193(), class41.field613);
                class74.method520(class248.field4334, (byte) -69, class41.field613);
                class236.field4100 = 50;
                class140.field2268 = class250.field4359;
                class59.method429((byte) 126);
                class70.field1126 = 80;
            }
        } else if (class70.field1126 == 80) {
            int var50 = class12.method124(false, class254.field4453);
            int var51 = class82.method562(false);
            if (var51 > var50) {
                class140.field2268 = class175.method1164(new class181[] { class234.field4078, class169.method1119((byte) -117, var50 * 100 / var51), class198.field3442 }, (byte) 126);
                class236.field4100 = 60;
            } else {
                class87.method585(class254.field4453, (byte) 94);
                class70.field1126 = 90;
                class140.field2268 = class74.field1188;
                class236.field4100 = 60;
            }
        } else if (class70.field1126 == 90) {
            if (class198.field3439.method109(1)) {
                class145 var52 = new class145(class241.field4179, class198.field3439, class254.field4453, 20, !class180.field3140);
                class72.method501(var52);
                if (class209.field3590 == 1) {
                    class72.method499(0.9F);
                }
                if (class209.field3590 == 2) {
                    class72.method499(0.8F);
                }
                if (class209.field3590 == 3) {
                    class72.method499(0.7F);
                }
                if (class209.field3590 == 4) {
                    class72.method499(0.6F);
                }
                class140.field2268 = class42.field663;
                class70.field1126 = 100;
                class236.field4100 = 70;
            } else {
                class140.field2268 = class175.method1164(new class181[] { class92.field1466, class169.method1119((byte) 36, class198.field3439.method93(arg0 - 1114)), class198.field3442 }, (byte) 126);
                class236.field4100 = 70;
            }
        } else if (class70.field1126 == 100) {
            if (class179.method1193(class254.field4453, -94)) {
                class70.field1126 = 110;
            }
        } else if (class70.field1126 == 110) {
            class120.field1973 = new class70();
            class224.field3870.method918(10, arg0 - 1234, class120.field1973);
            class236.field4100 = 75;
            class70.field1126 = 120;
            class140.field2268 = class120.field1963;
        } else if (class70.field1126 != 120) {
            if (arg0 != 1234) {
                field2697 = null;
            }
            if (class70.field1126 == 130) {
                if (!class69.field1111.method109(1)) {
                    class140.field2268 = class175.method1164(new class181[] { class37.field566, class169.method1119((byte) 103, class69.field1111.method93(arg0 ^ 0x4A8) * 3 / 4), class198.field3442 }, (byte) 125);
                    class236.field4100 = 85;
                } else if (!class229.field3921.method109(arg0 ^ 0x4D3)) {
                    class140.field2268 = class175.method1164(new class181[] { class37.field566, class169.method1119((byte) 41, (class229.field3921.method93(-11) / 10) + 75), class198.field3442 }, (byte) 124);
                    class236.field4100 = 85;
                } else if (!class71.field1132.method109(arg0 ^ 0x4D3)) {
                    class140.field2268 = class175.method1164(new class181[] { class37.field566, class169.method1119((byte) -128, class71.field1132.method93(-32) / 20 + 85), class198.field3442 }, (byte) 126);
                    class236.field4100 = 85;
                } else if (class37.field571.method87((byte) -115, class135.field2205)) {
                    class161.method1080(class241.field4194, class37.field571, class2.field64, class256.field4475, class110.field1816, -124, class263.field4579);
                    class140.field2268 = class125.field2041;
                    class236.field4100 = 100;
                    class70.field1126 = 140;
                } else {
                    class140.field2268 = class175.method1164(new class181[] { class37.field566, class169.method1119((byte) 97, (class37.field571.method113(class135.field2205, -127) / 10) + 90), class198.field3442 }, (byte) 123);
                    class236.field4100 = 85;
                }
            } else if (class70.field1126 == 140) {
                class46.field728 = class69.field1111.method107(class109.field1782, -97);
                class90.field1435.method112(false, true, (byte) -117);
                class13.field266.method112(true, true, (byte) -122);
                class254.field4453.method112(true, true, (byte) -118);
                class71.field1132.method112(true, true, (byte) -119);
                class196.field3427.method112(true, true, (byte) -126);
                class69.field1111.method112(true, true, (byte) -126);
                class120.field1957 = true;
                class184.method1257((byte) -89);
            }
        } else if (class196.field3427.method97(class32.field512, class241.field4187, (byte) 80)) {
            class16 var53 = new class16(class196.field3427.method88(class32.field512, (byte) 79, class241.field4187));
            class33.method261(false, var53);
            class236.field4100 = 80;
            class70.field1126 = 130;
            class140.field2268 = class155.field2591;
        } else {
            class140.field2268 = class175.method1164(new class181[] { class236.field4096, class212.field3641 }, (byte) 126);
            class236.field4100 = 80;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        field2693++;
        if (class5.field106 == 1000) {
            return;
        }
        boolean var2 = false;
        boolean var3 = class110.method738(-88);
        if (var3 && class148.field2479 && class174.field2914 != null) {
            class174.field2914.method1705((byte) 126);
        }
        if (class5.field106 == 30 || class5.field106 == 10) {
            if (class173.field2906) {
                class94.method618(arg0 + 11);
            } else if (class255.field4463 != 0L && class255.field4463 < class213.method1414(-9292)) {
                class94.method618(arg0 + 11);
            }
        }
        if (class258.field4509 != 0L && class213.method1414(-9292) > class258.field4509 && class216.field3713 != null && (class5.field106 == 30 || class5.field106 == 25)) {
            class115.method763((byte) 102);
        }
        if (class35.field543) {
            var2 = true;
            class35.field543 = false;
        }
        if (var2) {
            class232.method1603(-17957);
        }
        if (class5.field106 == 0) {
            class98.method647(class140.field2268, class236.field4100, var2, (Color) null, 116);
        } else if (class5.field106 == 5) {
            class42.method294((byte) -87, class114.field1853);
        } else if (class5.field106 == 10) {
            class4.method34(false);
        } else if (class5.field106 == 25 || class5.field106 == 28) {
            if (class190.field3351 == 1) {
                if (class116.field1917 < class188.field3328) {
                    class116.field1917 = class188.field3328;
                }
                int var4 = (class116.field1917 - class188.field3328) * 50 / class116.field1917;
                class121.method795(false, -65, class175.method1164(new class181[] { class32.field518, class31.field511, class169.method1119((byte) -109, var4), class20.field363 }, (byte) 126));
            } else if (class190.field3351 == 2) {
                if (class175.field3027 < class229.field3922) {
                    class175.field3027 = class229.field3922;
                }
                int var5 = (class175.field3027 - class229.field3922) * 50 / class175.field3027 + 50;
                class121.method795(false, 90, class175.method1164(new class181[] { class32.field518, class31.field511, class169.method1119((byte) 91, var5), class20.field363 }, (byte) 127));
            } else {
                class121.method795(false, arg0 ^ 0x53, class32.field518);
            }
        } else if (class5.field106 == 30) {
            class227.method1491(arg0 ^ 0x5136);
        } else if (class5.field106 == 40) {
            class121.method795(false, -47, class175.method1164(new class181[] { class253.field4407, class220.field3792, class43.field666 }, (byte) 126));
        }
        if (arg0 != -11) {
            method1059((class175) null);
        }
        if ((class5.field106 == 30 || class5.field106 == 10) && class239.field4161 == 0 && !var2) {
            try {
                Graphics var6 = class107.field1740.getGraphics();
                for (int var7 = 0; var7 < class207.field3551; var7++) {
                    if (class114.field1849[var7]) {
                        class90.field1438.method381(class258.field4508[var7], class62.field957[var7], false, var6, class137.field2252[var7], class25.field434[var7]);
                        class114.field1849[var7] = false;
                    }
                }
            } catch (Exception var14) {
                class107.field1740.repaint();
            }
        } else if (class5.field106 != 0) {
            try {
                Graphics var8 = class107.field1740.getGraphics();
                class90.field1438.method386(var8, 0, 0, 0);
                for (int var9 = 0; var9 < class207.field3551; var9++) {
                    class114.field1849[var9] = false;
                }
            } catch (Exception var13) {
                class107.field1740.repaint();
            }
        }
        if (class120.field1957) {
            class162.method1086(30481);
        }
        if (!browsercontrol.iscreated() || class90.field1437 == 0) {
            return;
        }
        try {
            Point var10 = class107.field1740.getLocationOnScreen();
            Dimension var11 = class107.field1740.getSize();
            browsercontrol.set_position(var10.x, var10.y - class90.field1437, var11.width, class90.field1437);
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lo;IIIIIII)V")
    public static final void method1055(class175[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class175 var9 = arg0[var8];
            if (var9 != null && var9.field2958 == arg1 && (!var9.field2972 || var9.field3069 == 0 || var9.field2955 || method1058(var9) != 0 || class242.field4213 == var9 || var9.field3067 == 1338) && (!var9.field2972 || !method1059(var9))) {
                int var10 = var9.field2929 + arg6;
                int var11 = var9.field3036 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3069 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3057 + var10;
                    int var17 = var9.field3041 + var11;
                    if (var9.field3069 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class244.field4229 == var9) {
                    class190.field3356 = true;
                    class75.field1200 = var10;
                    class215.field3696 = var11;
                }
                if (!var9.field2972 || var12 < var14 && var13 < var15) {
                    if (var9.field3069 == 0) {
                        if (!var9.field2972 && method1059(var9) && class151.field2517 != var9) {
                            continue;
                        }
                        if (var9.field3079 && class79.field1279 >= var12 && class183.field3215 >= var13 && class79.field1279 < var14 && class183.field3215 < var15) {
                            for (class94 var18 = (class94) class46.field724.method1686((byte) -83); var18 != null; var18 = (class94) class46.field724.method1683(140)) {
                                if (var18.field1487) {
                                    var18.method290((byte) -48);
                                }
                            }
                            if (class38.field582 == 0) {
                                class244.field4229 = null;
                                class242.field4213 = null;
                            }
                            class196.field3415 = false;
                        }
                    }
                    if (var9.field2972) {
                        boolean var19;
                        if (class79.field1279 >= var12 && class183.field3215 >= var13 && class79.field1279 < var14 && class183.field3215 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class39.field599 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class146.field2406 == 1 && class235.field4093 >= var12 && class93.field1478 >= var13 && class235.field4093 < var14 && class93.field1478 < var15) {
                            var21 = true;
                        }
                        if (class126.field2096 > 0 && var9.field2994 != null) {
                            for (int var22 = 0; var22 < var9.field2994.length; var22++) {
                                for (int var23 = 0; var23 < class126.field2096; var23++) {
                                    int var24 = var9.field2994[var22] & 0xFF;
                                    if (class83.field1326[var23] == var24) {
                                        class250.method1700(var22 + 1, -2, class241.field4187, -1, var9.field2987);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class57.method413(class93.field1478 - var11, var9, class235.field4093 - var10, 128);
                        }
                        if (class244.field4229 != null && class244.field4229 != var9 && var19 && class146.method951(method1058(var9), (byte) -124)) {
                            class85.field1361 = var9;
                        }
                        if (class242.field4213 == var9) {
                            class170.field2863 = true;
                            class110.field1803 = var10;
                            class258.field4505 = var11;
                        }
                        if (var9.field2955 || var9.field3067 != 0) {
                            if (var19 && class5.field103 != 0 && var9.field2964 != null) {
                                class94 var25 = new class94();
                                var25.field1487 = true;
                                var25.field1488 = var9;
                                var25.field1496 = class5.field103;
                                var25.field1489 = var9.field2964;
                                class46.field724.method1689(var25, 113);
                            }
                            if (class244.field4229 != null || class88.field1402 != null || class33.field534 || var9.field3067 != 1400 && class196.field3415) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3067 != 0) {
                                if (var9.field3067 == 1337) {
                                    class143.field2323 = var9;
                                    class218.method1453((byte) -103, var9);
                                    continue;
                                }
                                if (var9.field3067 == 1338) {
                                    if (var21) {
                                        class12.method121(class235.field4093 - var10, class93.field1478 - var11, (byte) -106, var9);
                                    }
                                    continue;
                                }
                                if (var9.field3067 == 1400) {
                                    class160.field2736 = var9;
                                    if (var21) {
                                        if (class68.field1095[82] && class264.field4594 > 0) {
                                            int var26 = (int) ((double) (class235.field4093 - var10 - var9.field3057 / 2) * 2.0D / (double) class22.field388);
                                            int var27 = (int) ((double) (class93.field1478 - var11 - var9.field3041 / 2) * 2.0D / (double) class22.field388);
                                            int var28 = class152.field2537 + var26;
                                            int var29 = class203.field3489 + var27;
                                            int var30 = class265.field4625 + var28;
                                            int var31 = class222.field3840 + class164.field2786 - var29 - 1;
                                            class68.method477(var31, 0, (byte) 58, var30);
                                            class244.method1649(87);
                                            continue;
                                        }
                                        class196.field3415 = true;
                                        class98.field1587 = class79.field1279;
                                        class239.field4150 = class183.field3215;
                                        class178.field3122 = class152.field2537;
                                        class4.field85 = class203.field3489;
                                        continue;
                                    }
                                    if (var20 && class196.field3415) {
                                        class257.method1751(false, (int) ((double) (class98.field1587 - class79.field1279) * 2.0D / (double) class108.field1775) + class178.field3122);
                                        class109.method729((int) ((double) (class239.field4150 - class183.field3215) * 2.0D / (double) class108.field1775) + class4.field85, true);
                                        continue;
                                    }
                                    class196.field3415 = false;
                                    continue;
                                }
                                if (var9.field3067 == 1401) {
                                    if (var20) {
                                        class257.method1749(var9.field3057, class79.field1279 - var10, 2348, var9.field3041, class183.field3215 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field3067 == 1402) {
                                    class218.method1453((byte) -109, var9);
                                    continue;
                                }
                                if (var9.field3067 == 1404) {
                                    class218.method1453((byte) -97, var9);
                                    continue;
                                }
                            }
                            if (!var9.field2995 && var21) {
                                var9.field2995 = true;
                                if (var9.field3011 != null) {
                                    class94 var32 = new class94();
                                    var32.field1487 = true;
                                    var32.field1488 = var9;
                                    var32.field1500 = class235.field4093 - var10;
                                    var32.field1496 = class93.field1478 - var11;
                                    var32.field1489 = var9.field3011;
                                    class46.field724.method1689(var32, 27);
                                }
                            }
                            if (var9.field2995 && var20 && var9.field2951 != null) {
                                class94 var33 = new class94();
                                var33.field1487 = true;
                                var33.field1488 = var9;
                                var33.field1500 = class79.field1279 - var10;
                                var33.field1496 = class183.field3215 - var11;
                                var33.field1489 = var9.field2951;
                                class46.field724.method1689(var33, 109);
                            }
                            if (var9.field2995 && !var20) {
                                var9.field2995 = false;
                                if (var9.field2970 != null) {
                                    class94 var34 = new class94();
                                    var34.field1487 = true;
                                    var34.field1488 = var9;
                                    var34.field1500 = class79.field1279 - var10;
                                    var34.field1496 = class183.field3215 - var11;
                                    var34.field1489 = var9.field2970;
                                    class236.field4095.method1689(var34, 123);
                                }
                            }
                            if (var20 && var9.field2986 != null) {
                                class94 var35 = new class94();
                                var35.field1487 = true;
                                var35.field1488 = var9;
                                var35.field1500 = class79.field1279 - var10;
                                var35.field1496 = class183.field3215 - var11;
                                var35.field1489 = var9.field2986;
                                class46.field724.method1689(var35, 83);
                            }
                            if (!var9.field2971 && var19) {
                                var9.field2971 = true;
                                if (var9.field2943 != null) {
                                    class94 var36 = new class94();
                                    var36.field1487 = true;
                                    var36.field1488 = var9;
                                    var36.field1500 = class79.field1279 - var10;
                                    var36.field1496 = class183.field3215 - var11;
                                    var36.field1489 = var9.field2943;
                                    class46.field724.method1689(var36, 93);
                                }
                            }
                            if (var9.field2971 && var19 && var9.field2956 != null) {
                                class94 var37 = new class94();
                                var37.field1487 = true;
                                var37.field1488 = var9;
                                var37.field1500 = class79.field1279 - var10;
                                var37.field1496 = class183.field3215 - var11;
                                var37.field1489 = var9.field2956;
                                class46.field724.method1689(var37, 83);
                            }
                            if (var9.field2971 && !var19) {
                                var9.field2971 = false;
                                if (var9.field3025 != null) {
                                    class94 var38 = new class94();
                                    var38.field1487 = true;
                                    var38.field1488 = var9;
                                    var38.field1500 = class79.field1279 - var10;
                                    var38.field1496 = class183.field3215 - var11;
                                    var38.field1489 = var9.field3025;
                                    class236.field4095.method1689(var38, 57);
                                }
                            }
                            if (var9.field2961 != null) {
                                class94 var39 = new class94();
                                var39.field1488 = var9;
                                var39.field1489 = var9.field2961;
                                class173.field2900.method1689(var39, 98);
                            }
                            if (var9.field2948 != null && class211.field3615 > var9.field2938) {
                                if (var9.field3028 == null || class211.field3615 - var9.field2938 > 32) {
                                    class94 var44 = new class94();
                                    var44.field1488 = var9;
                                    var44.field1489 = var9.field2948;
                                    class46.field724.method1689(var44, 50);
                                } else {
                                    label543: for (int var40 = var9.field2938; var40 < class211.field3615; var40++) {
                                        int var41 = class256.field4486[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field3028.length; var42++) {
                                            if (var9.field3028[var42] == var41) {
                                                class94 var43 = new class94();
                                                var43.field1488 = var9;
                                                var43.field1489 = var9.field2948;
                                                class46.field724.method1689(var43, 112);
                                                break label543;
                                            }
                                        }
                                    }
                                }
                                var9.field2938 = class211.field3615;
                            }
                            if (var9.field3023 != null && class82.field1311 > var9.field2930) {
                                if (var9.field3068 == null || class82.field1311 - var9.field2930 > 32) {
                                    class94 var49 = new class94();
                                    var49.field1488 = var9;
                                    var49.field1489 = var9.field3023;
                                    class46.field724.method1689(var49, 28);
                                } else {
                                    label519: for (int var45 = var9.field2930; var45 < class82.field1311; var45++) {
                                        int var46 = class94.field1509[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field3068.length; var47++) {
                                            if (var9.field3068[var47] == var46) {
                                                class94 var48 = new class94();
                                                var48.field1488 = var9;
                                                var48.field1489 = var9.field3023;
                                                class46.field724.method1689(var48, 117);
                                                break label519;
                                            }
                                        }
                                    }
                                }
                                var9.field2930 = class82.field1311;
                            }
                            if (var9.field3080 != null && class111.field1821 > var9.field3073) {
                                if (var9.field2984 == null || class111.field1821 - var9.field3073 > 32) {
                                    class94 var54 = new class94();
                                    var54.field1488 = var9;
                                    var54.field1489 = var9.field3080;
                                    class46.field724.method1689(var54, 80);
                                } else {
                                    label495: for (int var50 = var9.field3073; var50 < class111.field1821; var50++) {
                                        int var51 = class253.field4413[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field2984.length; var52++) {
                                            if (var9.field2984[var52] == var51) {
                                                class94 var53 = new class94();
                                                var53.field1488 = var9;
                                                var53.field1489 = var9.field3080;
                                                class46.field724.method1689(var53, 32);
                                                break label495;
                                            }
                                        }
                                    }
                                }
                                var9.field3073 = class111.field1821;
                            }
                            if (var9.field3076 != null && class190.field3361 > var9.field2988) {
                                if (var9.field2942 == null || class190.field3361 - var9.field2988 > 32) {
                                    class94 var59 = new class94();
                                    var59.field1488 = var9;
                                    var59.field1489 = var9.field3076;
                                    class46.field724.method1689(var59, 111);
                                } else {
                                    label471: for (int var55 = var9.field2988; var55 < class190.field3361; var55++) {
                                        int var56 = class236.field4110[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field2942.length; var57++) {
                                            if (var9.field2942[var57] == var56) {
                                                class94 var58 = new class94();
                                                var58.field1488 = var9;
                                                var58.field1489 = var9.field3076;
                                                class46.field724.method1689(var58, 75);
                                                break label471;
                                            }
                                        }
                                    }
                                }
                                var9.field2988 = class190.field3361;
                            }
                            if (var9.field3015 != null && class257.field4491 > var9.field2923) {
                                if (var9.field2941 == null || class257.field4491 - var9.field2923 > 32) {
                                    class94 var64 = new class94();
                                    var64.field1488 = var9;
                                    var64.field1489 = var9.field3015;
                                    class46.field724.method1689(var64, 91);
                                } else {
                                    label447: for (int var60 = var9.field2923; var60 < class257.field4491; var60++) {
                                        int var61 = class80.field1292[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field2941.length; var62++) {
                                            if (var9.field2941[var62] == var61) {
                                                class94 var63 = new class94();
                                                var63.field1488 = var9;
                                                var63.field1489 = var9.field3015;
                                                class46.field724.method1689(var63, 53);
                                                break label447;
                                            }
                                        }
                                    }
                                }
                                var9.field2923 = class257.field4491;
                            }
                            if (class253.field4421 > var9.field2965 && var9.field2952 != null) {
                                class94 var65 = new class94();
                                var65.field1488 = var9;
                                var65.field1489 = var9.field2952;
                                class46.field724.method1689(var65, 121);
                            }
                            if (class7.field122 > var9.field2965 && var9.field2937 != null) {
                                class94 var66 = new class94();
                                var66.field1488 = var9;
                                var66.field1489 = var9.field2937;
                                class46.field724.method1689(var66, 86);
                            }
                            if (class168.field2829 > var9.field2965 && var9.field3029 != null) {
                                class94 var67 = new class94();
                                var67.field1488 = var9;
                                var67.field1489 = var9.field3029;
                                class46.field724.method1689(var67, 118);
                            }
                            if (class8.field159 > var9.field2965 && var9.field2989 != null) {
                                class94 var68 = new class94();
                                var68.field1488 = var9;
                                var68.field1489 = var9.field2989;
                                class46.field724.method1689(var68, 47);
                            }
                            if (class55.field851 > var9.field2965 && var9.field3050 != null) {
                                class94 var69 = new class94();
                                var69.field1488 = var9;
                                var69.field1489 = var9.field3050;
                                class46.field724.method1689(var69, 35);
                            }
                            var9.field2965 = class247.field4318;
                            if (var9.field2932 != null) {
                                for (int var70 = 0; var70 < class126.field2096; var70++) {
                                    class94 var71 = new class94();
                                    var71.field1488 = var9;
                                    var71.field1497 = class83.field1326[var70];
                                    var71.field1498 = class166.field2821[var70];
                                    var71.field1489 = var9.field2932;
                                    class46.field724.method1689(var71, 41);
                                }
                            }
                            if (class91.field1441 && var9.field3013 != null) {
                                class94 var72 = new class94();
                                var72.field1488 = var9;
                                var72.field1489 = var9.field3013;
                                class46.field724.method1689(var72, 84);
                            }
                        }
                    }
                    if (!var9.field2972 && class244.field4229 == null && class88.field1402 == null && !class33.field534) {
                        if ((var9.field3030 >= 0 || var9.field3042 != 0) && class79.field1279 >= var12 && class183.field3215 >= var13 && class79.field1279 < var14 && class183.field3215 < var15) {
                            if (var9.field3030 >= 0) {
                                class151.field2517 = arg0[var9.field3030];
                            } else {
                                class151.field2517 = var9;
                            }
                        }
                        if (var9.field3069 == 8 && class79.field1279 >= var12 && class183.field3215 >= var13 && class79.field1279 < var14 && class183.field3215 < var15) {
                            class46.field731 = var9;
                        }
                        if (var9.field3033 > var9.field3041) {
                            class258.method1754(var11, var9, class183.field3215, 9748, var9.field3033, var9.field3041, class79.field1279, var9.field3057 + var10);
                        }
                    }
                    if (var9.field3069 == 0) {
                        method1055(arg0, var9.field2987, var12, var13, var14, var15, var10 - var9.field3014, var11 - var9.field2946);
                        if (var9.field3066 != null) {
                            method1055(var9.field3066, var9.field2987, var12, var13, var14, var15, var10 - var9.field3014, var11 - var9.field2946);
                        }
                        class228 var73 = (class228) class165.field2807.method1424(true, (long) var9.field2987);
                        if (var73 != null) {
                            class255.method1739(var11, var10, var13, (byte) 56, var14, var12, var73.field3913, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1056(int arg0) {
        field2695++;
        if (class182.field3205 >= 4) {
            this.method4(72, "js5crc");
            class5.field106 = 1000;
            return;
        }
        if (class75.field1206 >= 4) {
            if (class5.field106 == 0 || class5.field106 == 5) {
                this.method4(62, "js5io");
                class5.field106 = 1000;
                return;
            }
            class75.field1206 = 3;
            class152.field2544 = 3000;
        }
        if (class152.field2544-- > 0) {
            return;
        }
        try {
            if (class70.field1128 == 0) {
                class214.field3681 = class224.field3870.method915(class248.field4333, arg0 - 32, class173.field2912);
                class70.field1128++;
            }
            if (class70.field1128 == 1) {
                if (class214.field3681.field1933 == 2) {
                    this.method1057(-1, -128);
                    return;
                }
                if (class214.field3681.field1933 == 1) {
                    class70.field1128++;
                }
            }
            if (class70.field1128 == 2) {
                class114.field1857 = new class46((Socket) class214.field3681.field1935, class224.field3870);
                class230 var2 = new class230(5);
                var2.method1538(15, (byte) -67);
                var2.method1544(507, -3165);
                class114.field1857.method317(5, -121, var2.field3977, 0);
                class70.field1128++;
                class1.field38 = class213.method1414(-9292);
            }
            if (class70.field1128 == 3) {
                if (class5.field106 == 0 || class5.field106 == 5 || class114.field1857.method315((byte) -120) > 0) {
                    int var3 = class114.field1857.method312((byte) -40);
                    if (var3 != 0) {
                        this.method1057(var3, arg0 ^ 0xFFFFFF85);
                        return;
                    }
                    class70.field1128++;
                } else if ((class213.method1414(-9292) - class1.field38) > 30000L) {
                    this.method1057(-2, -123);
                    return;
                }
            }
            if (class70.field1128 == 4) {
                boolean var4 = class5.field106 == 5 || class5.field106 == 10 || class5.field106 == 28;
                class87.method587(-101, !var4, class114.field1857);
                class217.field3729 = 0;
                class114.field1857 = null;
                class70.field1128 = 0;
                class214.field3681 = null;
            }
            if (arg0 != 32) {
                field2697 = null;
            }
        } catch (IOException var5) {
            this.method1057(-3, arg0 ^ 0x36);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method12(int arg0) {
        method1053(-117);
        field2706++;
        class181.method1233(true);
        class138.method888((byte) -47);
        class120.method791(12800);
        class217.method1438(23);
        class1.method7((byte) -108);
        class12.method122(-122);
        if (arg0 < 1) {
            field2704 = 60;
        }
        class51.method378(-3);
        class70.method486((byte) 3);
        class203.method1359(true);
        class230.method1519((byte) -127);
        class46.method311((byte) -20);
        class90.method594(false);
        class218.method1445(2);
        class195.method1332(29546);
        class265.method1793(120);
        class178.method1187((byte) -114);
        class78.method538(-99);
        class247.method1684(0);
        class8.method67((byte) 60);
        class175.method1166((byte) -117);
        class116.method772((byte) 93);
        class214.method1417(false);
        class258.method1755(88);
        class243.method1648(21843);
        class19.method182(37);
        class107.method717(false);
        class184.method1277(-49);
        class250.method1707(0);
        class38.method279((byte) 69);
        class173.method1142(42);
        class254.method1727(true);
        class157.method1049(false);
        class220.method1463(-1);
        class121.method794((byte) -123);
        class64.method455((byte) -46);
        class228.method1496(87);
        class41.method286(false);
        class95.method631((byte) 103);
        class144.method925(8);
        class58.method419(-4733);
        class229.method1501((byte) 82);
        class182.method1251(-110);
        class160.method1076(false);
        class140.method896((byte) 127);
        class76.method527(false);
        class174.method1159(false);
        class148.method963(768);
        class109.method728((byte) 123);
        class188.method1303(-18235);
        class11.method118(-99);
        class50.method375();
        class260.method1762(-1);
        class99.method657(-111);
        class231.method1582();
        class190.method1315(-3);
        class210.method1393((byte) 91);
        class213.method1416(127);
        class18.method172(true);
        class66.method470(false);
        class207.method1377(122);
        class45.method305((byte) -2);
        class241.method1641(false);
        class113.method749(-108);
        class69.method485(false);
        class245.method1678();
        class253.method1722(0);
        class100.method668((byte) -37);
        class60.method430(3);
        class208.method1381(104);
        class75.method523((byte) -100);
        class106.method709(0);
        class164.method1093(1);
        class74.method521((byte) -45);
        class15.method134();
        class170.method1126(95);
        class152.method988((byte) -62);
        class145.method937(32232);
        class72.method502();
        class17.method159();
        class129.method831((byte) 79);
        class32.method253((byte) 81);
        class224.method1479(-480162169);
        class168.method1114((byte) 61);
        class225.method1483((byte) -74);
        class238.method1627((byte) -105);
        class117.method783();
        class194.method1328(0);
        class7.method54(false);
        class191.method1319(-30185);
        class232.method1605(false);
        class155.method1033((byte) 21);
        class101.method681();
        class59.method425(0);
        class259.method1759(true);
        class67.method474(121);
        class242.method1644((byte) 66);
        class93.method615(1);
        class262.method1784(32);
        class186.method1295((byte) 114);
        class52.method390(-114);
        class261.method1772((byte) -80);
        class215.method1430((byte) 117);
        class263.method1786(32768);
        class92.method613(0);
        class97.method641(true);
        class165.method1103(true);
        class68.method478((byte) 67);
        class128.method826(64);
        class136.method873(false);
        class227.method1485(0);
        class193.method1324(true);
        class115.method761(-1);
        class16.method136((byte) 127);
        class180.method1195(-79);
        class176.method1176(-7799);
        class43.method297(121);
        class35.method263(114);
        class94.method621((byte) -46);
        class26.method220((byte) 127);
        class114.method753((byte) 125);
        class73.method512((byte) 1);
        class236.method1615((byte) 19);
        class91.method606(true);
        class196.method1334(-7613);
        class264.method1788(16773818);
        class185.method1293(true);
        class87.method584(0);
        class4.method33(false);
        class251.method1713();
        class71.method489(-119);
        class20.method186(false);
        class171.method1132((byte) -108);
        class125.method808((byte) -108);
        class21.method195(true);
        class124.method805(-1469543774);
        class81.method560((byte) -62);
        class96.method638(-115);
        class216.method1432(117);
        class199.method1347((byte) 114);
        class83.method566(true);
        class30.method244(-27361);
        class172.method1135(0);
        class159.method1064(-1);
        class3.method30((byte) 124);
        class211.method1397(415063568);
        class123.method799(16);
        class137.method886(false);
        class235.method1611((byte) 78);
        class31.method250(0);
        class89.method592(-10);
        class200.method1349(1);
        class202.method1358(false);
        class135.method868(false);
        class10.method85();
        class28.method231();
        class223.method1477();
        class130.method838();
        class42.method293((byte) 113);
        class239.method1633(-70);
        class131.method849(0);
        class205.method1371();
        class54.method398();
        class209.method1389(false);
        class212.method1404(-120);
        class25.method216(15505);
        class98.method646(42);
        class198.method1345(0);
        class201.method1354(0);
        class110.method735(-18334);
        class149.method969(-48);
        class80.method556(12669);
        class88.method591(false);
        class108.method726(27);
        class2.method21((byte) 94);
        class156.method1039(-2);
        class222.method1476(-13);
        class162.method1082(125);
        class166.method1110(-2);
        class163.method1092((byte) -81);
        class9.method79(-117);
        class177.method1182(-71);
        class61.method439(-1);
        class33.method257((byte) -82);
        class189.method1314((byte) 50);
        class187.method1299(true);
        class255.method1740((byte) -94);
        class141.method903((byte) -59);
        class65.method466(-126);
        class240.method1636((byte) 43);
        class161.method1079((byte) -127);
        class27.method223((byte) -126);
        class37.method269((byte) 23);
        class63.method448((byte) -23);
        class143.method923((byte) 71);
        class257.method1752(-250);
        class79.method553((byte) -128);
        class206.method1375((byte) 97);
        class151.method978(30771);
        class169.method1117(-1901392735);
        class82.method561((byte) -108);
        class23.method205(0);
        class126.method816((byte) -80);
        class62.method443((byte) 127);
        class84.method567((byte) -124);
        class146.method950((byte) 69);
        class179.method1191(125);
        class237.method1624(0);
        class248.method1695(false);
        class221.method1469(99);
        class5.method39(-1);
        class244.method1653((byte) -89);
        class132.method851(104);
        class183.method1253((byte) 94);
        class39.method283(-130);
        class246.method1680((byte) -31);
        class127.method821(0);
        class219.method1459((byte) -42);
        class44.method301(0);
        class86.method579(2);
        class55.method403(127);
        class111.method743(106);
        class192.method1321((byte) -88);
        class13.method125(-83);
        class47.method318(116);
        class256.method1746(13339);
        class22.method197(0);
        class77.method533(1);
        class122.method796(-1432008820);
        class85.method574((byte) -100);
        class234.method1610(true);
        if (class1.field43) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1057(int arg0, int arg1) {
        int var3 = 119 % ((-arg1 - 32) / 47);
        class214.field3681 = null;
        field2698++;
        class217.field3729++;
        class114.field1857 = null;
        class70.field1128 = 0;
        if (class55.field853 == class248.field4333) {
            class248.field4333 = class219.field3780;
        } else {
            class248.field4333 = class55.field853;
        }
        if (class217.field3729 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class5.field106 == 0 || class5.field106 == 5) {
                this.method4(32, "js5connect_full");
                class5.field106 = 1000;
            } else {
                class152.field2544 = 3000;
            }
        } else if (class217.field3729 >= 2 && arg0 == 6) {
            this.method4(72, "js5connect_outofdate");
            class5.field106 = 1000;
        } else if (class217.field3729 >= 4) {
            if (class5.field106 == 0 || class5.field106 == 5) {
                this.method4(79, "js5connect");
                class5.field106 = 1000;
            } else {
                class152.field2544 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lo;)I")
    public static final int method1058(class175 arg0) {
        class124 var1 = (class124) class219.field3773.method1424(true, ((long) arg0.field2987 << 32) + (long) arg0.field2934);
        return var1 == null ? arg0.field3086 : var1.field2029;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lo;)Z")
    public static final boolean method1059(class175 arg0) {
        if (class166.field2826) {
            if (method1058(arg0) != 0) {
                return false;
            }
            if (arg0.field3069 == 0) {
                return false;
            }
        }
        return arg0.field2944;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method1060(byte arg0) {
        field2700++;
        class152.method980(this, 84);
        for (class126.field2096 = 0; class55.method404((byte) 115) && class126.field2096 < 128; class126.field2096++) {
            class83.field1326[class126.field2096] = class13.field261;
            class166.field2821[class126.field2096] = class196.field3419;
        }
        class258.field4504++;
        if (class243.field4227 != -1) {
            class255.method1739(0, 0, 0, (byte) 90, class143.field2321, 0, class243.field4227, class41.field620);
        }
        class247.field4318++;
        class170.method1129((byte) 58);
        while (true) {
            class94 var2;
            class175 var3;
            class175 var4;
            do {
                var2 = (class94) class173.field2900.method1688((byte) 27);
                if (var2 == null) {
                    if (arg0 < 9) {
                        return;
                    }
                    while (true) {
                        class94 var5;
                        class175 var6;
                        class175 var7;
                        do {
                            var5 = (class94) class236.field4095.method1688((byte) 27);
                            if (var5 == null) {
                                while (true) {
                                    class94 var8;
                                    class175 var9;
                                    class175 var10;
                                    do {
                                        var8 = (class94) class46.field724.method1688((byte) 27);
                                        if (var8 == null) {
                                            if (class244.field4229 != null) {
                                                class70.method488((byte) -13);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1488;
                                        if (var9.field2934 < 0) {
                                            break;
                                        }
                                        var10 = class52.method394(var9.field2958, false);
                                    } while (var10 == null || var10.field3066 == null || var10.field3066.length <= var9.field2934 || var10.field3066[var9.field2934] != var9);
                                    class27.method225(var8, (byte) 120);
                                }
                            }
                            var6 = var5.field1488;
                            if (var6.field2934 < 0) {
                                break;
                            }
                            var7 = class52.method394(var6.field2958, false);
                        } while (var7 == null || var7.field3066 == null || var7.field3066.length <= var6.field2934 || var7.field3066[var6.field2934] != var6);
                        class27.method225(var5, (byte) 120);
                    }
                }
                var3 = var2.field1488;
                if (var3.field2934 < 0) {
                    break;
                }
                var4 = class52.method394(var3.field2958, false);
            } while (var4 == null || var4.field3066 == null || var3.field2934 >= var4.field3066.length || var4.field3066[var3.field2934] != var3);
            class27.method225(var2, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1061(int arg0) {
        if (arg0 != 48) {
            field2704 = 67;
        }
        boolean var2 = class198.method1344((byte) -64);
        field2696++;
        if (!var2) {
            this.method1056(32);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lo;)Lo;")
    public static final class175 method1062(class175 arg0) {
        int var1 = class46.method314(method1058(arg0), 0);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class52.method394(arg0.field2958, false);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method18(boolean arg0) {
        class165.method1105(-1, class41.field608, class224.field3870);
        class219.field3780 = class113.field1840 == 0 ? 443 : class62.field947 + 50000;
        field2699++;
        class55.field853 = class113.field1840 == 0 ? 43594 : class62.field947 + 40000;
        class248.field4333 = class55.field853;
        class259.field4514 = class75.field1214 = class175.field3006 = class11.field239 = new short[256];
        if (class65.field1069 == 1) {
            class206.field3550 = class76.field1216;
            class146.field2404 = class193.field3385;
            class116.field1896 = class175.field2982;
            class93.field1476 = class261.field4553;
        } else {
            class93.field1476 = class157.field2627;
            class146.field2404 = class232.field4065;
            class116.field1896 = class35.field545;
            class206.field3550 = class95.field1525;
        }
        class143.method922((byte) 67);
        class3.method27(1, class107.field1740);
        class66.method468(class107.field1740, -8087);
        class115.field1879 = class169.method1123(100);
        if (class115.field1879 != null) {
            class115.field1879.method266(class107.field1740, (byte) -122);
        }
        class215.field3698 = class142.field2296;
        if (!arg0) {
            field2704 = -114;
        }
        try {
            if (class224.field3870.field2293 != null) {
                class93.field1479 = new class218(class224.field3870.field2293, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class238.field4134[var2] = new class218(class224.field3870.field2288[var2], 6000, 0);
                }
                class19.field349 = new class218(class224.field3870.field2297, 6000, 0);
                class160.field2732 = new class195(255, class93.field1479, class19.field349, 500000);
                class190.field3353 = new class218(class224.field3870.field2307, 24, 0);
                class224.field3870.field2307 = null;
                class224.field3870.field2288 = null;
                class224.field3870.field2293 = null;
                class224.field3870.field2297 = null;
            }
        } catch (IOException var3) {
            class190.field3353 = null;
            class93.field1479 = null;
            class160.field2732 = null;
            class19.field349 = null;
        }
        if (class113.field1840 != 0) {
            class25.field436 = true;
        }
        class75.field1204 = class114.field1848;
    }
}
