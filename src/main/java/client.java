import jagex3.jagmisc.jagmisc;
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
public class client extends class507 {

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lhn;")
    public static class616 field3637;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lgw;")
    public static class148 field3640;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lkda;")
    public static class328 field3636;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field3641;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
    public static boolean field3642;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
    public static int[] field3621;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3627++;
        if (!this.method3010(-24371)) {
            return;
        }
        class65.field802 = new class423();
        class65.field802.field5709 = Integer.parseInt(this.getParameter("worldid"));
        class471.field6659 = new class423();
        class471.field6659.field5709 = Integer.parseInt(this.getParameter("lobbyid"));
        class471.field6659.field5719 = this.getParameter("lobbyaddress");
        class560.field8329 = new class423();
        class560.field8329.field5709 = Integer.parseInt(this.getParameter("demoid"));
        class560.field8329.field5719 = this.getParameter("demoaddress");
        class577.field8514 = class254.method1634(0, Integer.parseInt(this.getParameter("modewhere")));
        if (!class460.method2785(class577.field8514, 252645135) && class577.field8514 != class186.field2781) {
            class577.field8514 = class186.field2781;
        }
        class394.field5426 = class541.method3288((byte) -83, Integer.parseInt(this.getParameter("modewhat")));
        if (class586.field8609 != class394.field5426 && class613.field9073 != class394.field5426 && class55.field657 != class394.field5426) {
            class394.field5426 = class55.field657;
        }
        try {
            class63.field795 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class63.field795 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class88.field1318 = true;
        } else {
            class88.field1318 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class192.field2854 = true;
        } else {
            class192.field2854 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class165.field2608 = true;
        } else {
            class165.field2608 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class348.field4768 = class210.field3104;
            } else if (var4.equals("1")) {
                class348.field4768 = class143.field2006;
            }
        }
        try {
            class476.field6747 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class476.field6747 = 0;
        }
        class110.field1562 = this.getParameter("quiturl");
        class595.field8788 = this.getParameter("settings");
        if (class595.field8788 == null) {
            class595.field8788 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class448.field6272 = Integer.parseInt(var5);
            } catch (Exception var10) {
                class448.field6272 = 0;
            }
        }
        class285.field3981 = Integer.parseInt(this.getParameter("colourid"));
        if (class285.field3981 < 0 || class285.field3981 >= class463.field6518.length) {
            class285.field3981 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class429.field5757 = true;
            class100.field1459 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class182.field2741 = true;
        }
        class183.field2754 = this.getParameter("sskey");
        if (class183.field2754 != null && class183.field2754.length() < 2) {
            class183.field2754 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class595.field8787 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class517.field7363 = Integer.parseInt(var8);
            } catch (Exception var9) {
            }
        }
        class460.field6511 = this;
        if (class348.field4768 == class210.field3104) {
            class214.field3159 = 765;
            class347.field4760 = 503;
        } else if (class348.field4768 == class143.field2006) {
            class347.field4760 = 480;
            class214.field3159 = 640;
        }
        this.method3004(class347.field4760, 609, false, class394.field5426.method3469(false) + 32, class214.field3159);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lvp;)Lww;")
    public static final class625 method1599(class162 arg0) {
        class625 var1 = (class625) class494.field7036.method2799(((long) arg0.field2456 << 32) + (long) arg0.field2415, true);
        return var1 == null ? arg0.field2543 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public static final void method1600(int arg0) {
        int var1 = class551.field8224;
        int[] var2 = class314.field4332;
        int var3 = class22.field207 ? var1 : class527.field7717 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class136 var5;
            if (var4 < var1) {
                var5 = class293.field4036[var2[var4]];
            } else {
                var5 = ((class505) class510.field7260.method2799((long) class634.field9290[var4 - var1], true)).field7148;
            }
            if (var5.field8501 == arg0) {
                var5.field1852 = 0;
                if (var5.field1878 < 0) {
                    var5.field1895 = false;
                } else {
                    int var6 = var5.method940(-1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field8496 & 0x7F) != 0 || (var5.field8500 & 0x7F) != 0) {
                            var5.field1895 = false;
                            continue;
                        }
                    } else if ((var5.field8496 & 0x7F) != 64 || (var5.field8500 & 0x7F) != 64) {
                        var5.field1895 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field8496 >> 7;
                        int var8 = var5.field8500 >> 7;
                        if (class118.field1670[var7][var8] != var5.field1878) {
                            var5.field1895 = true;
                            continue;
                        }
                        if (class539.field8026[var7][var8] > 1) {
                            var10002 = class539.field8026[var7][var8]--;
                            var5.field1895 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field8496 - var9 >> 7;
                        int var11 = var5.field8500 - var9 >> 7;
                        int var12 = var5.field8496 + var9 >> 7;
                        int var13 = var5.field8500 + var9 >> 7;
                        if (!class601.method3550(var10, var13, -76, var11, var12, var5.field1878)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class118.field1670[var14][var15] == var5.field1878) {
                                        var10002 = class539.field8026[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1895 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class373 && var5.field1949 != null && class617.field9123 >= var5.field1949.field6466 && class617.field9123 < var5.field1949.field6464) {
                        ((class373) var5).field5137 = false;
                    }
                    var5.field1895 = false;
                    var5.field8502 = class132.method919(var5.field8501, var5.field8500, var5.field8496, (byte) -82);
                    class320.method1933(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1601(byte arg0) {
        field3620++;
        if (class348.field4774) {
            class76.method589(1);
        }
        if (class99.field1445 != null) {
            class99.field1445.method1372(4);
        }
        if (class99.field1448 != null) {
            class145.method993(class99.field1448, class442.field5896, 0);
            class99.field1448 = null;
        }
        if (class296.field4075 != null) {
            class296.field4075.method1830(-120);
            class296.field4075 = null;
        }
        class595.method3521(true);
        if (arg0 <= 70) {
            field3637 = null;
        }
        class177.field2706.method2469((byte) -91);
        class137.field1961.method2085(119);
        if (class97.field1413 != null) {
            class97.field1413.method1700((byte) 78);
            class97.field1413 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method1602(byte arg0) {
        field3634++;
        if (class595.field8787) {
            class467.field6579 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class410.method2413(768);
        class137.field1961 = new class341(class442.field5896);
        class177.field2706 = new class418();
        if (class577.field8514 != class186.field2781) {
            class485.field6911 = new byte[50][];
        }
        class56.field668 = new class229(class442.field5896);
        if (class577.field8514 == class186.field2781) {
            class65.field802.field5719 = this.getCodeBase().getHost();
        } else if (class460.method2785(class577.field8514, 252645135)) {
            class65.field802.field5719 = this.getCodeBase().getHost();
            class65.field802.field5710 = class65.field802.field5709 + 40000;
            class471.field6659.field5710 = class471.field6659.field5709 + 40000;
            class560.field8329.field5710 = class560.field8329.field5709 + 40000;
            class65.field802.field5711 = class65.field802.field5709 + 50000;
            class471.field6659.field5711 = class471.field6659.field5709 + 50000;
            class560.field8329.field5711 = class560.field8329.field5709 + 50000;
        } else if (class577.field8514 == class301.field4131) {
            class65.field802.field5719 = "127.0.0.1";
            class471.field6659.field5719 = "127.0.0.1";
            class560.field8329.field5719 = "127.0.0.1";
            class65.field802.field5710 = class65.field802.field5709 + 40000;
            class471.field6659.field5710 = class471.field6659.field5709 + 40000;
            class560.field8329.field5710 = class560.field8329.field5709 + 40000;
            class65.field802.field5711 = class65.field802.field5709 + 50000;
            class471.field6659.field5711 = class471.field6659.field5709 + 50000;
            class560.field8329.field5711 = class560.field8329.field5709 + 50000;
        }
        class565.field8367 = class384.field5288 = class209.field3098 = class537.field8005 = new short[256];
        class286.field3993 = class65.field802;
        if (class348.field4768 == class143.field2006) {
            class80.field1072 = class13.field119;
            class93.field1397 = 16777215;
            class5.field43 = 0;
            class335.field4641 = true;
            class230.field3372 = class330.field4551;
            class388.field5347 = class92.field1390;
            class102.field1474 = class45.field542;
        } else {
            class230.field3372 = class151.field2291;
            class388.field5347 = class520.field7415;
            class102.field1474 = class1.field6;
            class80.field1072 = class337.field4656;
        }
        if (class348.field4768 == class210.field3104) {
            class201.field2987 = false;
        }
        class24.field237 = class268.method1697(true, class79.field1069);
        class623.field9182 = class371.method2215(class79.field1069, 3553, true);
        class453.field6408 = class331.field4576;
        try {
            if (class442.field5896.field4574 != null) {
                class228.field3339 = new class537(class442.field5896.field4574, 5200, 0);
                for (int var3 = 0; var3 < 32; var3++) {
                    class232.field3380[var3] = new class537(class442.field5896.field4569[var3], 6000, 0);
                }
                class629.field9242 = new class537(class442.field5896.field4565, 6000, 0);
                class168.field2629 = new class157(255, class228.field3339, class629.field9242, 500000);
                class9.field103 = new class537(class442.field5896.field4567, 24, 0);
                class442.field5896.field4567 = null;
                class442.field5896.field4569 = null;
                class442.field5896.field4565 = null;
                class442.field5896.field4574 = null;
            }
        } catch (IOException var4) {
            class9.field103 = null;
            class168.field2629 = null;
            class228.field3339 = null;
            class629.field9242 = null;
        }
        if (arg0 < 12) {
            this.method1604(86);
        }
        if (class577.field8514 != class186.field2781) {
            class188.field2800 = true;
        }
        if (class348.field4768 == class210.field3104) {
            class448.field6273 = class553.field8233.method3408(102, class63.field795);
        } else if (class348.field4768 == class143.field2006) {
            class448.field6273 = class472.field6673.method3408(112, class63.field795);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method1603(int arg0) {
        field3635++;
        boolean var2 = class177.field2706.method2468((byte) 127);
        if (!var2) {
            this.method1607((byte) -110);
        }
        int var3 = -45 / ((-arg0 - 55) / 59);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1604(int arg0) {
        field3624++;
        if (class472.field6670 == 13) {
            return;
        }
        long var2 = class437.method2548(14119) / 1000000L - class151.field2287;
        class151.field2287 = class437.method2548(14119) / 1000000L;
        boolean var4 = class577.method3436((byte) -100);
        if (var4 && class568.field8385 && class645.field9389 != null) {
            class645.field9389.method1569(256000);
        }
        if (class166.method1193(class472.field6670, true)) {
            if (class58.field739 != 0L && class58.field739 < class598.method3538(true)) {
                class622.method3638(-4, false, class609.method3580(true), class56.field668.field6839, class56.field668.field6865);
            } else if (!class99.field1445.method527() && class641.field9341) {
                class485.method2913((byte) 5);
            }
        }
        if (class99.field1448 == null) {
            Container var5;
            if (class390.field5382 == null) {
                var5 = class442.field5896.field4568;
            } else {
                var5 = class390.field5382;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class390.field5382 == var5) {
                Insets var8 = class390.field5382.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class384.field5289 != var6 || class625.field9202 != var7) {
                if (class99.field1445 == null || class99.field1445.method497()) {
                    class410.method2413(768);
                } else {
                    class384.field5289 = var6;
                    class625.field9202 = var7;
                }
                class58.field739 = class598.method3538(true) + 500L;
            }
        }
        if (class99.field1448 != null && !class105.field1516 && class166.method1193(class472.field6670, true)) {
            class622.method3638(-4, false, class56.field668.field6858, -1, -1);
        }
        boolean var9 = false;
        if (class551.field8214) {
            var9 = true;
            class551.field8214 = false;
        }
        if (var9) {
            class286.method1779(-120);
        }
        if (class99.field1445 != null && class99.field1445.method527() || class609.method3580(true) != 1) {
            class504.method2996((byte) 123);
        }
        if (class472.field6670 == 0) {
            class513.method3047(class317.field4373, class493.field7009, var9, class463.field6518[class285.field3981], class204.field3007[class285.field3981], 12, class554.field8244[class285.field3981]);
        } else if (class472.field6670 == 1) {
            class452.method2747(class99.field1445, var9 | class99.field1445.method527(), class463.field6518[class285.field3981].getRGB(), class554.field8244[class285.field3981].getRGB(), class204.field3007[class285.field3981].getRGB(), class114.field1608, 18878);
        } else if (class571.method3400(class472.field6670, 25323)) {
            class103.method775(0);
        } else if (class396.method2346(class472.field6670, 1979287408)) {
            class103.method775(0);
        } else if (class343.method2099(class472.field6670, (byte) 27)) {
            if (class120.field1695 == 1) {
                if (class139.field1983 > class66.field809) {
                    class66.field809 = class139.field1983;
                }
                int var10 = (class66.field809 - class139.field1983) * 50 / class66.field809;
                class438.method2554(class459.field6493.method3408(117, class63.field795) + "<br>(" + var10 + "%)", true, (byte) -26, class465.field6539);
            } else if (class120.field1695 == 2) {
                if (class493.field7014 < class156.field2319) {
                    class493.field7014 = class156.field2319;
                }
                int var11 = (class493.field7014 - class156.field2319) * 50 / class493.field7014 + 50;
                class438.method2554(class459.field6493.method3408(78, class63.field795) + "<br>(" + var11 + "%)", true, (byte) -26, class465.field6539);
            } else {
                class438.method2554(class459.field6493.method3408(115, class63.field795), true, (byte) -26, class465.field6539);
            }
        } else if (class472.field6670 == 9) {
            class220.method1424(var2, (byte) 126);
        } else if (class472.field6670 == 12) {
            class438.method2554(class493.field7013.method3408(85, class63.field795) + "<br>" + class556.field8277.method3408(122, class63.field795), true, (byte) -26, class465.field6539);
        }
        if (class527.field7535 == 3) {
            for (int var12 = 0; var12 < class533.field7942; var12++) {
                Rectangle var13 = class621.field9154[var12];
                if (class625.field9204[var12]) {
                    class99.field1445.method1378(true, var13.x, -1996553985, var13.width, var13.height, var13.y);
                } else if (class243.field3474[var12]) {
                    class99.field1445.method1378(true, var13.x, -1996554240, var13.width, var13.height, var13.y);
                }
            }
        }
        if (class6.method15((byte) -115)) {
            class496.method2957(class99.field1445, false);
        }
        if (class166.method1193(class472.field6670, true) && class527.field7535 == 0 && class609.method3580(true) == 1 && !var9 && class331.field4562.equals("1.1")) {
            int var16 = 0;
            for (int var17 = 0; var17 < class533.field7942; var17++) {
                if (class243.field3474[var17]) {
                    class243.field3474[var17] = false;
                    class549.field8205[var16++] = class621.field9154[var17];
                }
            }
            try {
                class99.field1445.method529(class549.field8205, var16);
            } catch (class416 var18) {
            }
        } else if (class472.field6670 != 0) {
            for (int var14 = 0; var14 < class533.field7942; var14++) {
                class243.field3474[var14] = false;
            }
            try {
                class99.field1445.method493();
            } catch (class416 var19) {
                class378.method2255(var19, var19.getMessage() + " (Recovered) " + this.method1613((byte) 122), 92);
                class430.method2521(0, -2);
            }
        }
        if (arg0 > -106) {
            field3636 = null;
        }
        if (class56.field668.field6855 == 0) {
            class236.method1513(true, 15L);
        } else if (class56.field668.field6855 == 1) {
            class236.method1513(true, 10L);
        } else if (class56.field668.field6855 == 2) {
            class236.method1513(true, 5L);
        } else if (class56.field668.field6855 == 3) {
            class236.method1513(true, 2L);
        }
        if (class463.field6519) {
            class360.method2175(5);
        }
        if (class56.field668.field6854 && class472.field6670 == 2 && class340.field4708 != -1) {
            class56.field668.field6854 = false;
            class56.field668.method1480(class442.field5896, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1605(int arg0, byte[] arg1) {
        if (arg0 > -62) {
            field3621 = null;
        }
        field3619++;
        class148 var3 = new class148(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method1032((byte) -33);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class276.field3882 = new int[6];
                    var5[0] = var3.method1045(true);
                    var5[1] = var3.method1045(true);
                    var5[2] = var3.method1045(true);
                    var5[3] = var3.method1045(true);
                    var5[4] = var3.method1045(true);
                    var5[5] = var3.method1045(true);
                } else if (var4 == 4) {
                    int var6 = var3.method1032((byte) -33);
                    class311.field4290 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class311.field4290[var7] = var3.method1045(true);
                        if (class311.field4290[var7] == 65535) {
                            class311.field4290[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method1032((byte) -33);
                    class355.field4847 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class355.field4847[var9] = var3.method1045(true);
                        if (class355.field4847[var9] == 65535) {
                            class355.field4847[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method1606(boolean arg0) {
        if (class526.field7533 == 2) {
            try {
                this.method1604(-113);
            } catch (Throwable var3) {
                class378.method2255(var3, var3.getMessage() + " (Recovered) " + this.method1613((byte) 122), -27);
                class430.method2521(0, -2);
            }
        } else {
            this.method1604(-108);
        }
        if (!arg0) {
            this.method1619(false);
        }
        field3632++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method1607(byte arg0) {
        field3622++;
        if (class545.field8145 < class177.field2706.field5677) {
            class286.field3993.field5712 = !class286.field3993.field5712;
            class153.field2308 = (class177.field2706.field5677 - 1) * 50 * 5;
            if (class153.field2308 > 3000) {
                class153.field2308 = 3000;
            }
            if (class177.field2706.field5677 >= 2 && class177.field2706.field5680 == 6) {
                this.method3011(-124, "js5connect_outofdate");
                class472.field6670 = 13;
                return;
            }
            if (class177.field2706.field5677 >= 4 && class177.field2706.field5680 == -1) {
                this.method3011(-98, "js5crc");
                class472.field6670 = 13;
                return;
            }
            if (class177.field2706.field5677 >= 4 && class240.method1533(class472.field6670, false)) {
                if (class177.field2706.field5680 == 7 || class177.field2706.field5680 == 9) {
                    this.method3011(-95, "js5connect_full");
                } else if (class177.field2706.field5680 <= 0) {
                    this.method3011(-86, "js5io");
                } else {
                    this.method3011(-101, "js5connect");
                }
                class472.field6670 = 13;
                return;
            }
        }
        class545.field8145 = class177.field2706.field5677;
        if (class153.field2308 > 0) {
            class153.field2308--;
            return;
        }
        try {
            if (class560.field8328 == 0) {
                class169.field2635 = class442.field5896.method2023(class286.field3993.field5719, class286.field3993.method2483(-90), 0);
                class560.field8328++;
            }
            if (class560.field8328 == 1) {
                if (class169.field2635.field202 == 2) {
                    this.method1611(25, 1000);
                    return;
                }
                if (class169.field2635.field202 == 1) {
                    class560.field8328++;
                }
            }
            int var2 = -124 / ((arg0 - 30) / 56);
            if (class560.field8328 == 2) {
                class553.field8236 = new class455((Socket) class169.field2635.field201, class442.field5896);
                class148 var3 = new class148(5);
                var3.method1049(-1, class204.field3010.field6526);
                var3.method1058(602643080, 609);
                class553.field8236.method2765(-105, 0, 5, var3.field2146);
                class560.field8328++;
                class440.field5877 = class598.method3538(true);
            }
            if (class560.field8328 == 3) {
                if (class240.method1533(class472.field6670, false) || class553.field8236.method2762(13074) > 0) {
                    int var4 = class553.field8236.method2763(true);
                    if (var4 != 0) {
                        this.method1611(25, var4);
                        return;
                    }
                    class560.field8328++;
                } else if (class598.method3538(true) - class440.field5877 > 30000L) {
                    this.method1611(25, 1001);
                    return;
                }
            }
            if (class560.field8328 == 4) {
                boolean var5 = class472.field6670 == 1 || class453.method2755(class472.field6670, 24152) || class136.method942(class472.field6670, 6);
                class177.field2706.method2466(0, class553.field8236, !var5);
                class169.field2635 = null;
                class560.field8328 = 0;
                class553.field8236 = null;
            }
        } catch (IOException var6) {
            this.method1611(25, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1608() {
        int var0 = class551.field8224;
        int[] var1 = class314.field4332;
        boolean var2 = class56.field668.field6838 == 1 && var0 > 200 || class56.field668.field6838 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class373 var13 = class293.field4036[var1[var3]];
            if (var13.method2223(0)) {
                var13.method943(123);
                if (var13.field8504 >= 0 && var13.field8509 >= 0 && var13.field8508 < class146.field2125 && var13.field8499 < class410.field5609) {
                    var13.field5137 = var13.field1921 ? var2 : false;
                    if (class541.field8119 == var13) {
                        var13.field1878 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field1895) {
                            var14++;
                        }
                        if (var13.field1906 > class617.field9123) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method940(-1) << 2);
                        if (var13.field5124) {
                            var15 += 512;
                        } else {
                            if (class136.field1859 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field1878 = var15 + 1;
                    }
                } else {
                    var13.field1878 = -1;
                }
            } else {
                var13.field1878 = -1;
            }
        }
        for (int var4 = 0; var4 < class527.field7717; var4++) {
            class571 var10 = ((class505) class510.field7260.method2799((long) class634.field9290[var4], true)).field7148;
            if (var10.method3403(0) && var10.field8405.method649(false, class556.field8280)) {
                var10.method943(102);
                if (var10.field8504 >= 0 && var10.field8509 >= 0 && var10.field8508 < class146.field2125 && var10.field8499 < class410.field5609) {
                    int var11 = 0;
                    if (!var10.field1895) {
                        var11++;
                    }
                    if (var10.field1906 > class617.field9123) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method940(-1) << 2);
                    if (class136.field1859 == 0) {
                        if (var10.field8405.field1274) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class136.field1859 == 1) {
                        if (var10.field8405.field1274) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field8405.field1310) {
                        var12 += 1024;
                    } else if (!var10.field8405.field1265) {
                        var12 += 256;
                    }
                    var10.field1878 = var12 + 1;
                } else {
                    var10.field1878 = -1;
                }
            } else {
                var10.field1878 = -1;
            }
        }
        for (int var5 = 0; var5 < class385.field5293.length; var5++) {
            class190 var6 = class385.field5293[var5];
            if (var6 != null) {
                if (var6.field2821 == 1) {
                    class505 var7 = (class505) class510.field7260.method2799((long) var6.field2824, true);
                    if (var7 != null) {
                        class571 var8 = var7.field7148;
                        if (var8.field1878 >= 0) {
                            var8.field1878 += 2048;
                        }
                    }
                } else if (var6.field2821 == 10) {
                    class373 var9 = class293.field4036[var6.field2824];
                    if (var9 != null && class541.field8119 != var9 && var9.field1878 >= 0) {
                        var9.field1878 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method1609(boolean arg0) {
        field3623++;
        if (class472.field6670 == 13) {
            return;
        }
        class617.field9123++;
        if ((class617.field9123 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class440.field5879 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class199.field2930.setSeed((long) class440.field5879);
        }
        if ((class617.field9123 % 50) == 0) {
            class114.field1607 = class312.field4304;
            class312.field4304 = 0;
            class627.field9227 = class390.field5378;
            class390.field5378 = 0;
        }
        this.method1603(94);
        if (class13.field121 != null) {
            class13.field121.method1528(true);
        }
        class571.method3398(8150);
        class24.field237.method1789(77);
        class623.field9182.method1591(1310982144);
        if (class99.field1445 != null) {
            class99.field1445.method484((int) class598.method3538(true));
        }
        class626.method3660((byte) 71);
        class502.field7113 = 0;
        class46.field559 = 0;
        for (class109 var3 = class24.field237.method1790(arg0); var3 != null; var3 = class24.field237.method1790(true)) {
            int var6 = var3.method801(11773);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method799(74);
                if (class446.method2706(true) && var7 == '`' || var7 == '§') {
                    if (class6.method15((byte) -113)) {
                        class94.method738(-43);
                    } else {
                        class52.method309(26557);
                    }
                } else if (class46.field559 < 128) {
                    class36.field427[class46.field559] = var3;
                    class46.field559++;
                }
            } else if (var6 == 0 && class502.field7113 < 75) {
                class106.field1519[class502.field7113] = var3;
                class502.field7113++;
            }
        }
        class185.field2777 = 0;
        for (class68 var4 = class623.field9182.method1585((byte) 14); var4 != null; var4 = class623.field9182.method1585((byte) 14)) {
            int var5 = var4.method541(30818);
            if (var5 == -1) {
                class158.field2358.method131(var4, 0);
            } else if (var5 == 6) {
                class185.field2777 += var4.method539(arg0);
            } else if (class464.method2794(var5, 1)) {
                class367.field5074.method131(var4, 0);
                if (class367.field5074.method127(0) > 10) {
                    class367.field5074.method128(936);
                }
            }
        }
        if (class6.method15((byte) -94)) {
            class542.method3293(84);
        }
        if (class472.field6670 == 0) {
            this.method1623(-31446);
            class519.method3070(64);
        } else if (class472.field6670 == 1) {
            this.method1623(-31446);
            class519.method3070(40);
        } else if (class343.method2099(class472.field6670, (byte) 27)) {
            class94.method741(75);
        }
        if (class453.method2755(class472.field6670, 24152) && !class343.method2099(class472.field6670, (byte) 27)) {
            this.method1619(false);
            class316.method1913((byte) -49);
            class65.method415((byte) -18);
        } else if (class136.method942(class472.field6670, 6) && !class343.method2099(class472.field6670, (byte) 27)) {
            this.method1619(false);
            class65.method415((byte) -18);
        } else if (class472.field6670 == 11) {
            class65.method415((byte) -18);
        } else if (class238.method1522(-109, class472.field6670) && !class343.method2099(class472.field6670, (byte) 27)) {
            class384.method2286(34067);
        } else if (class472.field6670 == 12) {
            class65.method415((byte) -18);
            if (class43.field501 != -3 && class43.field501 != 2 && class43.field501 != 15) {
                class120.method861(false, -78);
            }
        }
        class171.method1214(class99.field1445, (byte) 68);
        class367.field5074.method128(936);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method1610(int arg0) {
        int var1 = class551.field8224;
        int[] var2 = class314.field4332;
        for (int var3 = 0; var3 < class527.field7717 + var1; var3++) {
            class136 var4;
            if (var3 < var1) {
                var4 = class293.field4036[var2[var3]];
            } else {
                var4 = ((class505) class510.field7260.method2799((long) class634.field9290[var3 - var1], true)).field7148;
            }
            if (var4.field8501 == arg0 && var4.field1878 >= 0) {
                int var5 = var4.method940(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8496 & 0x7F) != 0 || (var4.field8500 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field8496 & 0x7F) != 64 || (var4.field8500 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field8496 >> 7;
                    int var7 = var4.field8500 >> 7;
                    if (var4.field1878 > class118.field1670[var6][var7]) {
                        class118.field1670[var6][var7] = var4.field1878;
                        class539.field8026[var6][var7] = 1;
                    } else if (class118.field1670[var6][var7] == var4.field1878) {
                        var10002 = class539.field8026[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field8496 - var8 >> 7;
                    int var10 = var4.field8500 - var8 >> 7;
                    int var11 = var4.field8496 + var8 >> 7;
                    int var12 = var4.field8500 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1878 > class118.field1670[var13][var14]) {
                                class118.field1670[var13][var14] = var4.field1878;
                                class539.field8026[var13][var14] = 1;
                            } else if (class118.field1670[var13][var14] == var4.field1878) {
                                var10002 = class539.field8026[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1611(int arg0, int arg1) {
        class177.field2706.field5677++;
        class560.field8328 = 0;
        field3638++;
        class177.field2706.field5680 = arg1;
        class553.field8236 = null;
        class169.field2635 = null;
        if (arg0 != 25) {
            field3637 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method1612(boolean arg0) {
        method1616(117);
        field3626++;
        class180.method1262(false);
        class340.method2084(23092);
        class221.method1433(37);
        class572.method3410(-9223);
        class151.method1110(!arg0);
        class289.method1787(-9);
        class392.method2334(0);
        class302.method1847((byte) 106);
        class501.method2986(-1);
        class417.method2454(63);
        class589.method3502((byte) 101);
        class465.method2802(122);
        class507.method3016((byte) 98);
        class349.method2118((byte) 83);
        class581.method3470(-122);
        class336.method2054((byte) -26);
        class39.method252(false);
        class165.method1189(1);
        class208.method1377((byte) -47);
        class229.method1483(3);
        class190.method1304(1);
        class385.method2295((byte) 67);
        class19.method129(28961);
        class455.method2770(true);
        class418.method2464(3);
        class341.method2088(-46);
        class239.method1525(23363);
        class490.method2935(0);
        class328.method1959(true);
        class537.method3259(0);
        class157.method1132(123);
        class117.method839((byte) 40);
        class487.method2915((byte) 117);
        class253.method1629((byte) -98);
        class623.method3641(-81);
        class79.method606(false);
        class111.method814(77);
        class234.method1496((byte) -1);
        class517.method3061(69);
        class69.method548(109);
        class163.method1181(2048);
        class183.method1269(118);
        class359.method2173((byte) 90);
        class499.method2980(100);
        class508.method3026((byte) 77);
        class617.method3613((byte) 46);
        class120.method860(true);
        class430.method2518(0);
        class447.method2709(119);
        class386.method2299(!arg0);
        class337.method2057(-1506);
        class44.method276(0);
        class505.method3000(86);
        class426.method2501((byte) 13);
        class574.method3414(95);
        class144.method978(12);
        class270.method1702(250);
        class37.method242(0);
        class335.method2045(-89);
        class642.method3714(0);
        class504.method2997(32351);
        class564.method3384(512);
        class374.method2237((byte) -124);
        class162.method1158(-114);
        class271.method1710(false);
        class138.method964((byte) -128);
        class310.method1894((byte) 108);
        class148.method1037(-32768);
        class92.method719((byte) -95);
        class205.method1353((byte) -42);
        class378.method2254(true);
        class332.method2029(false);
        class515.method3053(231);
        class571.method3399(0);
        class243.method1542(-32);
        class625.method3652(100);
        class610.method3583(false);
        class216.method1413((byte) 81);
        class214.method1409(124);
        class11.method51((byte) -66);
        class473.method2846((byte) 66);
        class66.method417(77);
        class212.method1394(false);
        class613.method3592(!arg0);
        class94.method739((byte) -70);
        class132.method918(-128);
        class187.method1289(-1);
        class428.method2507(0);
        class423.method2484((byte) -106);
        class514.method3051(arg0);
        class93.method737((byte) 113);
        class523.method3085(2206);
        class32.method210(48);
        class481.method2899((byte) 112);
        class560.method3374(26755);
        class106.method783((byte) -46);
        class78.method598(1024);
        class46.method291((byte) 54);
        class159.method1141(!arg0);
        class285.method1772((byte) 75);
        class261.method1659(118);
        class345.method2104((byte) 108);
        class320.method1934(-87);
        class145.method992((byte) -85);
        class451.method2728((byte) -127);
        class429.method2517(0);
        class87.method656(-104);
        class540.method3282((byte) -114);
        class493.method2948(0);
        class416.method2450((byte) -100);
        class311.method1897(90);
        class65.method416(-2239);
        class352.method2131(-15574);
        class283.method1761(false);
        class405.method2387(-104);
        class137.method961((byte) -124);
        class150.method1101(2623);
        class248.method1577(0);
        class624.method3651(true);
        class300.method1835((byte) -44);
        class461.method2790(!arg0);
        class397.method2354(1009);
        class552.method3339(12148);
        class344.method2102(-127);
        class241.method1535((byte) -116);
        class453.method2756((byte) -94);
        class80.method611((byte) 100);
        class223.method1441((byte) -128);
        class361.method2177(57);
        class215.method1411(-126);
        class577.method3434(110);
        class102.method766(-120);
        class77.method595((byte) -91);
        class558.method3363((byte) -128);
        class195.method1320(81);
        class206.method1363();
        class457.method2773(31);
        class226.method1447((byte) -109);
        class440.method2557(-2888);
        class494.method2953(-111);
        class615.method3607((byte) -30);
        class637.method3696(-6);
        class406.method2392(32);
        class98.method756();
        class339.method2071();
        class199.method1336(!arg0);
        class101.method765((byte) -11);
        class597.method3536();
        class308.method1881((byte) 111);
        class464.method2795(13837);
        class64.method412(arg0);
        class217.method1414((byte) -26);
        class330.method1998(120);
        class448.method2710(34);
        class219.method1421((byte) -119);
        class471.method2841(79);
        class595.method3520(false);
        class632.method3680(94);
        class178.method1253(8);
        class293.method1801(2);
        class424.method2495((byte) -128);
        class121.method868((byte) 108);
        class3.method6(-1);
        class314.method1906((byte) 51);
        class621.method3631(2);
        class619.method3623(-2);
        class554.method3353((byte) -33);
        class276.method1735((byte) 81);
        class409.method2403(false);
        class644.method3723(73);
        class369.method2211((byte) 100);
        class389.method2317(-111);
        class307.method1872((byte) 12);
        class435.method2541((byte) -84);
        class123.method873(111);
        class50.method303((byte) -78);
        class313.method1902((byte) -72);
        class26.method168((byte) -80);
        class347.method2108((byte) -72);
        class168.method1201((byte) -58);
        class224.method1442((byte) -47);
        class382.method2279();
        class112.method820(-7889);
        class20.method133((byte) 54);
        class463.method2791(63);
        class42.method271((byte) -55);
        class169.method1202((byte) 100);
        class518.method3065((byte) 49);
        class391.method2329(0);
        class263.method1664(0);
        class521.method3077(942);
        class420.method2474(113);
        class238.method1521(91);
        class553.method3343(0);
        class323.method1940(87101263);
        class636.method3692((byte) -67);
        class51.method308((byte) 124);
        class485.method2912((byte) -121);
        class153.method1118((byte) -120);
        class450.method2721(-102);
        class506.method3001(false);
        class55.method358((byte) -18);
        class209.method1383(true);
        class439.method2556();
        class83.method632(true);
        class38.method247(125);
        class557.method3360((byte) -73);
        class585.method3482((byte) -111);
        class343.method2100(7);
        class115.method828((byte) 22);
        class601.method3548((byte) -103);
        class158.method1136(1);
        class520.method3075(-64);
        class366.method2200(-22);
        class510.method3035(!arg0);
        class174.method1223(0);
        class272.method1711((byte) 123);
        class114.method824((byte) -110);
        class33.method211(2047);
        class618.method3621((byte) 57);
        class319.method1929(-15825);
        class488.method2924((byte) 59);
        class432.method2528((byte) -121);
        class85.method638((byte) 86);
        class304.method1865(-8166);
        class133.method920(99);
        class469.method2830(262144);
        class354.method2137((byte) -63);
        class584.method3480(1);
        class312.method1899(-256);
        class236.method1512(false);
        class63.method411(-121);
        class171.method1216(8506);
        class251.method1586((byte) 54);
        class375.method2245(-113);
        class47.method292(-29567);
        class143.method976(-22160);
        class182.method1266(19589);
        class48.method296(126);
        class175.method1227((byte) 116);
        class402.method2368(1);
        class291.method1795(false);
        class534.method3222();
        class522.method3081(6);
        class526.method3102(3);
        class350.method2119(-114);
        class496.method2958((byte) -127);
        class415.method2449(6);
        class596.method3528(-4096);
        class513.method3049(49);
        class296.method1823((byte) 127);
        class27.method176(19686);
        class200.method1343((byte) 23);
        class367.method2207(-1);
        class355.method2145(33);
        class556.method3356(9216);
        class528.method3186(97);
        class565.method3386(false);
        class404.method2380((byte) 45);
        class309.method1889(0);
        class177.method1243(-60);
        class477.method2877(false);
        class295.method1814();
        class372.method2218(119);
        class259.method1644((byte) -119);
        class475.method2862();
        class478.method2880();
        class189.method1297();
        class122.method871((byte) 125);
        class306.method1870(false);
        class327.method1956();
        class351.method2122(-1550928892);
        class533.method3213(true);
        class76.method590(3);
        class139.method966(0);
        class480.method2891(75);
        class576.method3431(-129);
        class282.method1760(-112);
        class107.method789();
        class599.method3541(20830);
        class18.method114(false);
        class230.method1487(3);
        class524.method3088(-69);
        class519.method3069(-100);
        class454.method2760(0);
        class166.method1192((byte) -61);
        class474.method2853(false);
        class442.method2565(-11395);
        class476.method2867((byte) -95);
        class135.method932(0);
        class342.method2095(-31681);
        class303.method1861(0);
        class22.method138(false);
        class555.method3355(-305900624);
        class6.method18((byte) -116);
        class30.method205(10000);
        class201.method1346(-1);
        class527.method3112(!arg0);
        class170.method1208((byte) -103);
        class213.method1404((byte) 102);
        class512.method3043(false);
        class549.method3331((byte) -93);
        class54.method349((byte) -114);
        class242.method1541(-500);
        class125.method877(-85);
        class266.method1688(255);
        class228.method1464(-109);
        class130.method911(100);
        class371.method2214((byte) -3);
        class403.method2369(-763);
        class384.method2287((byte) 102);
        class444.method2606(-1);
        class58.method389(-126);
        class194.method1313(122);
        class438.method2551((byte) 124);
        class57.method385(true);
        class616.method3611(29837);
        class227.method1455(-119);
        class1.method1(0);
        class479.method2882(1);
        class516.method3055((byte) 121);
        class538.method3264(-80);
        class638.method3698(!arg0);
        class8.method36(0);
        class532.method3212(80);
        class188.method1292((byte) -78);
        class582.method3471(1);
        class334.method2035(89);
        class232.method1491(true);
        class587.method3494(false);
        class459.method2779((byte) 107);
        class388.method2312(0);
        class211.method1387();
        class437.method2546(-109);
        class593.method3517((byte) -43);
        class96.method742(59);
        class641.method3707(-8);
        class275.method1722(632114384);
        class460.method2787(-11930);
        class110.method805(-1);
        class84.method633((byte) 115);
        class401.method2364(126);
        class573.method3411(1);
        class321.method1936(true);
        class40.method255(789221);
        class5.method10(-19712);
        class192.method1309((byte) 125);
        class156.method1126(1);
        class89.method665((byte) -115);
        class127.method899(1);
        class410.method2412(-5096);
        class377.method2252(-119);
        class88.method663(32);
        class376.method2249(22016);
        class52.method310(0);
        class645.method3727(-25271);
        class394.method2340(10);
        class149.method1074((byte) 103);
        class268.method1696(3072);
        class604.method3562((byte) 117);
        class60.method394(false);
        class197.method1325(4096);
        class99.method760(-3607);
        class129.method908(3387);
        class61.method398(true);
        class240.method1530((byte) -7);
        class71.method568();
        class324.method1945(-1);
        class315.method1911(-22322);
        class421.method2481();
        class467.method2815(-61);
        class602.method3555(0);
        class484.method2910((byte) 122);
        class72.method577(26410);
        class237.method1516((byte) 36);
        class427.method2504((byte) 59);
        class592.method3510(94);
        class317.method1922(false);
        class244.method1547((byte) 114);
        class49.method298((byte) 118);
        class629.method3669((byte) -128);
        class86.method643(22513);
        class358.method2162((byte) 101);
        class140.method968(-118);
        class146.method1000((byte) -2);
        class25.method151((byte) 120);
        class609.method3581((byte) -115);
        class198.method1331(true);
        class218.method1417((byte) -106);
        class97.method743(6948);
        class348.method2112(false);
        class449.method2712((byte) -53);
        class431.method2523((byte) -94);
        class588.method3496((byte) -122);
        class569.method3395((byte) -99);
        class472.method2843((byte) -84);
        class545.method3318((byte) 97);
        class630.method3670((byte) 2);
        class118.method851((byte) -13);
        class503.method2993(107);
        class325.method1955((byte) 98);
        class100.method764(true);
        class24.method142(-17491);
        class643.method3717((byte) -1);
        class286.method1776((byte) 62);
        class395.method2344(true);
        class333.method2031(2);
        class605.method3564(-11732);
        class186.method1287(false);
        class2.method4((byte) 68);
        class511.method3039((byte) 106);
        class36.method222(0);
        class396.method2348((byte) -112);
        class398.method2360(8);
        class600.method3546((byte) -104);
        class408.method2400(-1);
        class297.method1824(117);
        class222.method1435(33);
        class116.method831((byte) -121);
        class29.method196(true);
        class586.method3483((byte) -119);
        class383.method2284(30641);
        class164.method1186((byte) -100);
        class631.method3675((byte) -99);
        class452.method2745((byte) -3);
        class393.method2335(-10489);
        class390.method2327(1);
        class568.method3393(8);
        class525.method3094(-7262);
        class45.method285((byte) -109);
        class193.method1310(-1);
        class252.method1626(100);
        class59.method391((byte) -95);
        class9.method43(-126);
        class105.method779((byte) -13);
        class207.method1370((byte) -106);
        class161.method1152(-1);
        class155.method1125(0);
        class470.method2838(true);
        class357.method2154((byte) -29);
        class284.method1765(-1);
        class626.method3662(1);
        class210.method1385(26049);
        class580.method3466((byte) -15);
        class68.method540(-4);
        class104.method778(114);
        class185.method1284(7389);
        class380.method2270(102);
        class539.method3265(-73);
        class561.method3378((byte) 109);
        class583.method3479(0);
        class360.method2174(382);
        class255.method1638(-123);
        class536.method3247(false);
        class365.method2199(5);
        class316.method1914(-5);
        class647.method3732((byte) 118);
        class591.method3509(2048);
        class502.method2991(114);
        class531.method3207(-110);
        class196.method1323((byte) -38);
        class491.method2943((byte) -83);
        class184.method1281(81);
        class13.method98((byte) 127);
        class301.method1844((byte) 110);
        class254.method1635(0);
        class634.method3689(1024);
        class436.method2543(104);
        class131.method913(0);
        class541.method3289((byte) -101);
        class245.method1549(!arg0);
        class559.method3366(76);
        class611.method3588(-1325190324);
        class204.method1349(22945);
        class56.method361(true);
        class482.method2904((byte) 88);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method1613(byte arg0) {
        if (arg0 < 111) {
            this.method1609(true);
        }
        field3625++;
        String var2 = null;
        try {
            var2 = "[1)" + class473.field6687 + "," + class38.field463 + "," + class146.field2125 + "," + class410.field5609 + "|";
            if (class541.field8119 != null) {
                var2 = var2 + "2)" + class89.field1339 + "," + (class541.field8119.field1957[0] + class473.field6687) + "," + (class541.field8119.field1955[0] + class38.field463) + "|";
            }
            var2 = var2 + "3)" + class526.field7533 + "|4)" + class56.field668.field6831 + "|5)" + class609.method3580(true) + "|6)" + class165.field2605 + "," + class47.field562 + "|";
            var2 = var2 + "7)" + class56.field668.method2895(class526.field7533, 0) + "|";
            var2 = var2 + "8)" + class56.field668.method2897(class526.field7533, 6373) + "|";
            var2 = var2 + "9)" + class56.field668.field6832 + "|";
            var2 = var2 + "10)" + class56.field668.field6847 + "|";
            var2 = var2 + "11)" + class56.field668.field6867 + "|";
            var2 = var2 + "12)" + class56.field668.method1472(class526.field7533, (byte) 78) + "|";
            var2 = var2 + "13)" + class467.field6579 + "|";
            var2 = var2 + "14)" + class472.field6670;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class526.field7533 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3641 == null ? (field3641 = method1625("client")) : field3641).getClassLoader());
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
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1614() {
        class568.field8379 = 0;
        for (int var0 = 0; var0 < class527.field7717; var0++) {
            class571 var1 = ((class505) class510.field7260.method2799((long) class634.field9290[var0], true)).field7148;
            if (var1.field1895 && var1.method945(-1) != -1) {
                int var2 = (var1.method940(-1) - 1) * 64 + 60;
                int var3 = var1.field8496 - var2 >> 7;
                int var4 = var1.field8500 - var2 >> 7;
                class136 var5 = class472.method2845(-1265214713, var4, var3, var1.field8501);
                if (var5 != null) {
                    int var6 = var5.field1904;
                    if (var5 instanceof class571) {
                        var6 += 2048;
                    }
                    if (var5.field1852 == 0 && var5.method945(-1) != -1) {
                        class58.field740[class568.field8379] = var6;
                        class284.field3973[class568.field8379] = var6;
                        class568.field8379++;
                        var5.field1852++;
                    }
                    class58.field740[class568.field8379] = var6;
                    class284.field3973[class568.field8379] = var1.field1904 + 2048;
                    class568.field8379++;
                    var5.field1852++;
                }
            }
        }
        class526.method3101(242145824, class284.field3973, 0, class58.field740, class568.field8379 - 1);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lvp;)Z")
    public static final boolean method1615(class162 arg0) {
        if (class112.field1592) {
            if (method1599(arg0).field9207 != 0) {
                return false;
            }
            if (arg0.field2552 == 0) {
                return false;
            }
        }
        return arg0.field2534;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method1616(int arg0) {
        int var1 = 120 % ((arg0 - 3) / 62);
        field3637 = null;
        field3636 = null;
        field3621 = null;
        field3640 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1617(byte arg0) {
        int var2 = -33 % ((26 - arg0) / 39);
        if (class526.field7533 == 2) {
            try {
                this.method1609(true);
            } catch (Throwable var4) {
                class378.method2255(var4, var4.getMessage() + " (Recovered) " + this.method1613((byte) 123), -124);
                class430.method2521(0, -2);
            }
        } else {
            this.method1609(true);
        }
        field3630++;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class515.method3054("Argument count", (byte) -17);
            }
            class65.field802 = new class423();
            class65.field802.field5709 = Integer.parseInt(arg0[0]);
            class471.field6659 = new class423();
            class471.field6659.field5709 = Integer.parseInt(arg0[1]);
            class560.field8329 = new class423();
            class560.field8329.field5709 = Integer.parseInt(arg0[2]);
            class577.field8514 = class301.field4131;
            if (arg0[3].equals("live")) {
                class394.field5426 = class55.field657;
            } else if (arg0[3].equals("rc")) {
                class394.field5426 = class613.field9073;
            } else if (arg0[3].equals("wip")) {
                class394.field5426 = class586.field8609;
            } else {
                class515.method3054("modewhat", (byte) -93);
            }
            class63.field795 = class403.method2370(arg0[4], -120);
            if (class63.field795 == -1) {
                if (arg0[4].equals("english")) {
                    class63.field795 = 0;
                } else if (arg0[4].equals("german")) {
                    class63.field795 = 1;
                } else {
                    class515.method3054("language", (byte) -71);
                }
            }
            class88.field1318 = false;
            class192.field2854 = false;
            if (arg0[5].equals("game0")) {
                class348.field4768 = class210.field3104;
            } else if (arg0[5].equals("game1")) {
                class348.field4768 = class143.field2006;
            } else {
                class515.method3054("game", (byte) 120);
            }
            class595.field8788 = "";
            class285.field3981 = class348.field4768.field470;
            class476.field6747 = 0;
            class595.field8787 = false;
            class429.field5757 = true;
            class100.field1459 = true;
            class448.field6272 = 0;
            class182.field2741 = false;
            class183.field2754 = null;
            class517.field7363 = 0;
            client var1 = new client();
            class460.field6511 = var1;
            var1.method3005(false, 0, 609, 32, 768, class348.field4768.field473, class394.field5426.method3469(false) + 32, 1024);
            class390.field5382.setLocation(40, 40);
        } catch (Exception var3) {
            class378.method2255(var3, null, 120);
        }
        field3633++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method1618(byte[] arg0, int arg1) {
        field3628++;
        if (arg1 != -19917) {
            field3639 = 51;
        }
        class148 var3 = new class148(arg0);
        while (true) {
            int var4 = var3.method1032((byte) -33);
            if (var4 == 0) {
                return;
            }
            if (var4 == 2) {
                class519.field7409 = var3.method1045(true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    private final void method1619(boolean arg0) {
        if (class472.field6670 == 6 && class313.field4317 == 0) {
            if (class525.field7521 > 1) {
                class564.field8362 = class226.field3283;
                class525.field7521--;
            }
            if (!class446.field6245) {
                class589.method3497(false);
            }
            for (int var2 = 0; var2 < 100 && class24.method147(16); var2++) {
            }
        }
        field3629++;
        class647.field9402++;
        class586.method3487(null, -1556679837, -1, -1);
        class149.method1072(-1, -1, (byte) -100, null);
        class632.method3678(0);
        class226.field3283++;
        for (int var3 = 0; var3 < class599.field8840; var3++) {
            class571 var4 = class57.field718[var3].field7148;
            if (var4 != null) {
                byte var5 = var4.field8405.field1254;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method940(-1);
                    if ((var5 & 0x2) != 0 && var4.field1953 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field1957[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class146.field2125 - var6 - 1) < var9) {
                                var9 = class146.field2125 - var6 - 1;
                            }
                            int var10 = var4.field1955[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class410.field5609 - var6 - 1 < var10) {
                                var10 = class410.field5609 - var6 - 1;
                            }
                            int var11 = class245.method1555(0, var10, 0, var9, var4.field1955[0], class394.field5418, var6, -127, true, class127.field1774[var4.field8501], -1, var6, var4.field1957[0], class343.field4739, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field1957[var12] = class394.field5418[var11 - (var12 + 1)];
                                    var4.field1955[var12] = class343.field4739[var11 - var12 - 1];
                                    var4.field1948[var12] = 1;
                                }
                                var4.field1953 = var11;
                            }
                        }
                    }
                    class423.method2485((byte) 122, true, var4);
                    int var13 = class175.method1229(42, var4);
                    class99.method759((byte) -16, class511.field7277, var4, class346.field4754, var13);
                    class228.method1458((byte) -124, var4);
                }
            }
        }
        if (class313.field4317 == 0 && class467.field6580 == 0) {
            if (class531.field7929 == 2) {
                class372.method2222(128);
            } else {
                class116.method832(3);
            }
            if ((class125.field1760 >> 7) < 14 || (class146.field2125 - 14) <= (class125.field1760 >> 7) || (class214.field3161 >> 7) < 14 || class214.field3161 >> 7 >= class410.field5609 - 14) {
                class51.method307(89);
            }
        }
        while (true) {
            class518 var14;
            class162 var15;
            class162 var16;
            do {
                var14 = (class518) class94.field1399.method128(936);
                if (var14 == null) {
                    while (true) {
                        class518 var17;
                        class162 var18;
                        class162 var19;
                        do {
                            var17 = (class518) class192.field2858.method128(936);
                            if (var17 == null) {
                                while (true) {
                                    class518 var20;
                                    class162 var21;
                                    class162 var22;
                                    do {
                                        var20 = (class518) class272.field3848.method128(936);
                                        if (var20 == null) {
                                            if (class307.field4210 != null) {
                                                class397.method2357((byte) 121);
                                            }
                                            if ((class617.field9123 % 1500) == 0) {
                                                class352.method2133(false);
                                            }
                                            if (class472.field6670 == 6 && class313.field4317 == 0) {
                                                class558.method3365(102);
                                            }
                                            class513.method3050(arg0);
                                            if (class348.field4774 && class9.field99 < (class598.method3538(true) - 60000L)) {
                                                class76.method589(1);
                                            }
                                            for (class626 var23 = (class626) class200.field2941.method2233(true); var23 != null; var23 = (class626) class200.field2941.method2240(16772)) {
                                                if (class598.method3538(true) / 1000L - 5L > (long) var23.field9225) {
                                                    if (var23.field9223 > 0) {
                                                        class336.method2053("", "", 5, 81, 0, var23.field9218 + class192.field2856.method3408(86, class63.field795));
                                                    }
                                                    if (var23.field9223 == 0) {
                                                        class336.method2053("", "", 5, 120, 0, var23.field9218 + class308.field4247.method3408(112, class63.field795));
                                                    }
                                                    var23.method1783((byte) -128);
                                                }
                                            }
                                            if (class472.field6670 == 6 && class313.field4317 == 0) {
                                                if (class296.field4075 == null) {
                                                    class120.method861(false, -85);
                                                    return;
                                                }
                                                class379.field5228++;
                                                if (class379.field5228 > 50) {
                                                    class297.field4085++;
                                                    class402.method2367(class480.field6822, (byte) 71);
                                                }
                                                try {
                                                    if (class296.field4075 != null && class112.field1589.field2177 > 0) {
                                                        class312.field4304 += class112.field1589.field2177;
                                                        class296.field4075.method1829(class112.field1589.field2177, 82, 0, class112.field1589.field2146);
                                                        class112.field1589.field2177 = 0;
                                                        class379.field5228 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class120.method861(false, -46);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field7376;
                                        if (var21.field2415 < 0) {
                                            break;
                                        }
                                        var22 = class153.method1117(var21.field2483, -30170);
                                    } while (var22 == null || var22.field2462 == null || var22.field2462.length <= var21.field2415 || var22.field2462[var21.field2415] != var21);
                                    class98.method757(var20);
                                }
                            }
                            var18 = var17.field7376;
                            if (var18.field2415 < 0) {
                                break;
                            }
                            var19 = class153.method1117(var18.field2483, -30170);
                        } while (var19 == null || var19.field2462 == null || var19.field2462.length <= var18.field2415 || var19.field2462[var18.field2415] != var18);
                        class98.method757(var17);
                    }
                }
                var15 = var14.field7376;
                if (var15.field2415 < 0) {
                    break;
                }
                var16 = class153.method1117(var15.field2483, -30170);
            } while (var16 == null || var16.field2462 == null || var16.field2462.length <= var15.field2415 || var16.field2462[var15.field2415] != var15);
            class98.method757(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lvp;IIIIIIIII)V")
    public static final void method1620(class162[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class162 var11 = arg0[var10];
            if (var11 != null && var11.field2483 == arg1) {
                int var12 = var11.field2449 + arg6;
                int var13 = var11.field2507 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2552 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2527 + var12;
                    int var19 = var11.field2459 + var13;
                    if (var11.field2552 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2552 == 0 || var11.field2479 || method1599(var11).field9207 != 0 || class57.field716 == var11 || class207.field3075 == var11.field2476) {
                    if (!method1615(var11)) {
                        if (class307.field4210 == var11 && class285.method1770((byte) 32, class307.field4210) != null) {
                            class200.field2951 = true;
                            class194.field2881 = var12;
                            class19.field190 = var13;
                        }
                        if (var11.field2471 || var14 < var16 && var15 < var17) {
                            if (var11.field2525 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class518 var20 = (class518) class272.field3848.method124((byte) 42); var20 != null; var20 = (class518) class272.field3848.method120(-121)) {
                                    if (var20.field7380) {
                                        var20.method2457(-8422);
                                        var20.field7376.field2413 = false;
                                    }
                                }
                                if (class188.field2801 == 0) {
                                    class307.field4210 = null;
                                    class57.field716 = null;
                                }
                                class171.field2665 = 0;
                                class72.field993 = false;
                                class506.field7151 = false;
                                if (!class446.field6245) {
                                    class589.method3497(false);
                                }
                            }
                            boolean var21;
                            if (class623.field9182.method1587((byte) 7) >= var14 && class623.field9182.method1594(2028208128) >= var15 && class623.field9182.method1587((byte) -116) < var16 && class623.field9182.method1594(2028208128) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class606.field9002 && var21) {
                                if (var11.field2510 >= 0) {
                                    class574.field8454 = var11.field2510;
                                } else if (var11.field2525) {
                                    class574.field8454 = -1;
                                }
                            }
                            if (!class446.field6245 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class194.method1314(arg9 - var13, var11, 5003, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class623.field9182.method1597((byte) 91) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class68 var24 = (class68) class367.field5074.method124((byte) 42);
                            if (var24 != null && var24.method541(30818) == 0 && var24.method536(false) >= var14 && var24.method532((byte) 108) >= var15 && var24.method536(false) < var16 && var24.method532((byte) 108) < var17) {
                                var23 = true;
                            }
                            if (var11.field2523 != null) {
                                for (int var25 = 0; var25 < var11.field2523.length; var25++) {
                                    if (class24.field237.method1788(16, var11.field2523[var25])) {
                                        if (var11.field2536 == null || class617.field9123 >= var11.field2536[var25]) {
                                            byte var26 = var11.field2539[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class24.field237.method1788(16, 86) && !class24.field237.method1788(16, 82) && !class24.field237.method1788(16, 81)) && ((var26 & 0x2) == 0 || class24.field237.method1788(16, 86)) && ((var26 & 0x1) == 0 || class24.field237.method1788(16, 82)) && ((var26 & 0x4) == 0 || class24.field237.method1788(16, 81))) {
                                                if (var25 < 10) {
                                                    class472.method2844(var11.field2456, "", -1, var25 + 1, false);
                                                } else if (var25 == 10) {
                                                    class429.method2511(true);
                                                    class625 var27 = method1599(var11);
                                                    class627.method3665(var27.field9205, var27.method3658(-110), var11, (byte) 36);
                                                    class217.field3182 = class379.method2263(32694, var11);
                                                    if (class217.field3182 == null) {
                                                        class217.field3182 = "Null";
                                                    }
                                                    class537.field8008 = var11.field2535 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field2477[var25];
                                                if (var11.field2536 == null) {
                                                    var11.field2536 = new int[var11.field2523.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field2536[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2536[var25] = class617.field9123 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field2536 != null) {
                                        var11.field2536[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class409.method2407(var11, var24.method536(false) - var12, 0, var24.method532((byte) 108) - var13);
                            }
                            if (class307.field4210 != null && class307.field4210 != var11 && var21 && method1599(var11).method3656((byte) -74)) {
                                class569.field8395 = var11;
                            }
                            if (class57.field716 == var11) {
                                class394.field5425 = true;
                                class180.field2735 = var12;
                                class383.field5267 = var13;
                            }
                            if (var11.field2479 || var11.field2476 != 0) {
                                if (var21 && class185.field2777 != 0 && var11.field2481 != null) {
                                    class518 var29 = new class518();
                                    var29.field7380 = true;
                                    var29.field7376 = var11;
                                    var29.field7386 = class185.field2777;
                                    var29.field7383 = var11.field2481;
                                    class272.field3848.method131(var29, 0);
                                }
                                if (class307.field4210 != null || class446.field6245 || class196.field2892 != var11.field2476 && class171.field2665 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2476 != 0) {
                                    if (class610.field9049 == var11.field2476 || class596.field8823 == var11.field2476) {
                                        class324.field4470 = var11;
                                        if (class212.field3123 != null) {
                                            class212.field3123.method3382(class99.field1445, 1, var11.field2459);
                                        }
                                        if (class610.field9049 == var11.field2476) {
                                            if (!class446.field6245 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class635.method3691(arg8, (byte) -92, class99.field1445, arg9);
                                                for (class618 var30 = (class618) class602.field8984.method2233(true); var30 != null; var30 = (class618) class602.field8984.method2240(16772)) {
                                                    if (arg8 >= var30.field9131 && arg8 < var30.field9134 && arg9 >= var30.field9128 && arg9 < var30.field9135) {
                                                        class589.method3497(false);
                                                        class429.method2513(var30.field9129, (byte) -59);
                                                    }
                                                }
                                            }
                                            class586.method3487(var11, -1556679837, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class207.field3075 == var11.field2476) {
                                        if (var11.method1170(class99.field1445, (byte) 126) == null || class588.field8727 != 0 && class588.field8727 != 3 || class446.field6245 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field2401[var32];
                                        if (var31 < var33 || var31 > var11.field2551[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field2527 / 2;
                                        int var35 = var32 - var11.field2459 / 2;
                                        int var36;
                                        if (class531.field7929 == 4) {
                                            var36 = (int) class539.field8023 & 0x3FFF;
                                        } else {
                                            var36 = (int) class539.field8023 + class300.field4113 & 0x3FFF;
                                        }
                                        int var37 = class589.field8742[var36];
                                        int var38 = class589.field8735[var36];
                                        if (class531.field7929 != 4) {
                                            var37 = (class449.field6301 + 256) * var37 >> 8;
                                            var38 = (class449.field6301 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class531.field7929 == 4) {
                                            var41 = (class214.field3160 >> 7) + (var39 >> 2);
                                            var42 = (class399.field5489 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class541.field8119.method940(-1) - 1) * 64;
                                            var41 = (class541.field8119.field8496 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class541.field8119.field8500 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class606.field9002 && (class364.field4945 & 0x40) != 0) {
                                            class162 var44 = class372.method2217(class205.field3027, 100, class193.field2865);
                                            if (var44 == null) {
                                                class429.method2511(true);
                                            } else {
                                                class335.method2049(var42, class402.field5501, 1L, 124, true, 4, class217.field3182, false, var11.field2434, var41, " ->");
                                            }
                                            continue;
                                        }
                                        if (class348.field4768 == class143.field2006) {
                                            class335.method2049(var42, -1, 1L, 126, true, 25, class78.field1055.method3408(86, class63.field795), false, -1, var41, "");
                                        }
                                        class335.method2049(var42, class405.field5548, 1L, 124, true, 18, class348.field4771, false, -1, var41, "");
                                        continue;
                                    }
                                    if (class196.field2892 == var11.field2476) {
                                        class437.field5843 = var11;
                                        if (var21) {
                                            class72.field993 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method536(false) - var12 - var11.field2527 / 2) * 2.0D / (double) class339.field4675);
                                            int var46 = (int) (-((double) (var24.method532((byte) 108) - var13 - var11.field2459 / 2) * 2.0D / (double) class339.field4675));
                                            int var47 = class607.field9016 + var45 + class339.field4685;
                                            int var48 = class177.field2703 + var46 + class339.field4696;
                                            class642 var49 = class349.method2117((byte) 71);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method3710((byte) -10, var48, var50, var47);
                                            if (var50 != null) {
                                                if (class24.field237.method1788(16, 82) && class163.field2578 > 0) {
                                                    class351.method2123(-62, var50[0], var50[2], var50[1]);
                                                    continue;
                                                }
                                                class506.field7151 = true;
                                                class558.field8288 = var50[0];
                                                class542.field8121 = var50[1];
                                                class171.field2660 = var50[2];
                                            }
                                            class171.field2665 = 1;
                                            class215.field3165 = false;
                                            class114.field1610 = class623.field9182.method1587((byte) -113);
                                            class595.field8796 = class623.field9182.method1594(2028208128);
                                            continue;
                                        }
                                        if (var22 && class171.field2665 > 0) {
                                            if (class171.field2665 == 1 && (class114.field1610 != class623.field9182.method1587((byte) 84) || class595.field8796 != class623.field9182.method1594(2028208128))) {
                                                class333.field4618 = class607.field9016;
                                                class442.field5899 = class177.field2703;
                                                class171.field2665 = 2;
                                            }
                                            if (class171.field2665 == 2) {
                                                class215.field3165 = true;
                                                class494.method2952(class333.field4618 + (int) ((double) (class114.field1610 - class623.field9182.method1587((byte) -43)) * 2.0D / (double) class339.field4678), -105);
                                                class494.method2950(class442.field5899 - (int) ((double) (class595.field8796 - class623.field9182.method1594(2028208128)) * 2.0D / (double) class339.field4678), -1);
                                            }
                                            continue;
                                        }
                                        if (class171.field2665 > 0 && !class215.field3165) {
                                            if ((class299.field4105 == 1 || class93.method736(false)) && class103.field1484 > 2) {
                                                class102.method770(-16156, class595.field8796, class114.field1610);
                                            } else if (class55.method357(-1)) {
                                                class102.method770(-16156, class595.field8796, class114.field1610);
                                            }
                                        }
                                        class171.field2665 = 0;
                                        continue;
                                    }
                                    if (class367.field5075 == var11.field2476) {
                                        if (var22) {
                                            class374.method2235(var11.field2527, -11167, class623.field9182.method1594(2028208128) - var13, class623.field9182.method1587((byte) -119) - var12, var11.field2459);
                                        }
                                        continue;
                                    }
                                    if (class416.field5642 == var11.field2476) {
                                        class149.method1072(var13, var12, (byte) -100, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field2520 && var23) {
                                    var11.field2520 = true;
                                    if (var11.field2425 != null) {
                                        class518 var51 = new class518();
                                        var51.field7380 = true;
                                        var51.field7376 = var11;
                                        var51.field7379 = var24.method536(false) - var12;
                                        var51.field7386 = var24.method532((byte) 108) - var13;
                                        var51.field7383 = var11.field2425;
                                        class272.field3848.method131(var51, 0);
                                    }
                                }
                                if (var11.field2520 && var22 && var11.field2514 != null) {
                                    class518 var52 = new class518();
                                    var52.field7380 = true;
                                    var52.field7376 = var11;
                                    var52.field7379 = class623.field9182.method1587((byte) 88) - var12;
                                    var52.field7386 = class623.field9182.method1594(2028208128) - var13;
                                    var52.field7383 = var11.field2514;
                                    class272.field3848.method131(var52, 0);
                                }
                                if (var11.field2520 && !var22) {
                                    var11.field2520 = false;
                                    if (var11.field2513 != null) {
                                        class518 var53 = new class518();
                                        var53.field7380 = true;
                                        var53.field7376 = var11;
                                        var53.field7379 = class623.field9182.method1587((byte) -35) - var12;
                                        var53.field7386 = class623.field9182.method1594(2028208128) - var13;
                                        var53.field7383 = var11.field2513;
                                        class192.field2858.method131(var53, 0);
                                    }
                                }
                                if (var22 && var11.field2548 != null) {
                                    class518 var54 = new class518();
                                    var54.field7380 = true;
                                    var54.field7376 = var11;
                                    var54.field7379 = class623.field9182.method1587((byte) -121) - var12;
                                    var54.field7386 = class623.field9182.method1594(2028208128) - var13;
                                    var54.field7383 = var11.field2548;
                                    class272.field3848.method131(var54, 0);
                                }
                                if (!var11.field2413 && var21) {
                                    var11.field2413 = true;
                                    if (var11.field2541 != null) {
                                        class518 var55 = new class518();
                                        var55.field7380 = true;
                                        var55.field7376 = var11;
                                        var55.field7379 = class623.field9182.method1587((byte) -119) - var12;
                                        var55.field7386 = class623.field9182.method1594(2028208128) - var13;
                                        var55.field7383 = var11.field2541;
                                        class272.field3848.method131(var55, 0);
                                    }
                                }
                                if (var11.field2413 && var21 && var11.field2555 != null) {
                                    class518 var56 = new class518();
                                    var56.field7380 = true;
                                    var56.field7376 = var11;
                                    var56.field7379 = class623.field9182.method1587((byte) -24) - var12;
                                    var56.field7386 = class623.field9182.method1594(2028208128) - var13;
                                    var56.field7383 = var11.field2555;
                                    class272.field3848.method131(var56, 0);
                                }
                                if (var11.field2413 && !var21) {
                                    var11.field2413 = false;
                                    if (var11.field2411 != null) {
                                        class518 var57 = new class518();
                                        var57.field7380 = true;
                                        var57.field7376 = var11;
                                        var57.field7379 = class623.field9182.method1587((byte) 27) - var12;
                                        var57.field7386 = class623.field9182.method1594(2028208128) - var13;
                                        var57.field7383 = var11.field2411;
                                        class192.field2858.method131(var57, 0);
                                    }
                                }
                                if (var11.field2508 != null) {
                                    class518 var58 = new class518();
                                    var58.field7376 = var11;
                                    var58.field7383 = var11.field2508;
                                    class94.field1399.method131(var58, 0);
                                }
                                if (var11.field2501 != null && class483.field6885 > var11.field2524) {
                                    if (var11.field2448 == null || class483.field6885 - var11.field2524 > 32) {
                                        class518 var63 = new class518();
                                        var63.field7376 = var11;
                                        var63.field7383 = var11.field2501;
                                        class272.field3848.method131(var63, 0);
                                    } else {
                                        label693: for (int var59 = var11.field2524; var59 < class483.field6885; var59++) {
                                            int var60 = class619.field9146[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field2448.length; var61++) {
                                                if (var11.field2448[var61] == var60) {
                                                    class518 var62 = new class518();
                                                    var62.field7376 = var11;
                                                    var62.field7383 = var11.field2501;
                                                    class272.field3848.method131(var62, 0);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2524 = class483.field6885;
                                }
                                if (var11.field2447 != null && class506.field7158 > var11.field2475) {
                                    if (var11.field2460 == null || class506.field7158 - var11.field2475 > 32) {
                                        class518 var68 = new class518();
                                        var68.field7376 = var11;
                                        var68.field7383 = var11.field2447;
                                        class272.field3848.method131(var68, 0);
                                    } else {
                                        label669: for (int var64 = var11.field2475; var64 < class506.field7158; var64++) {
                                            int var65 = class415.field5634[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field2460.length; var66++) {
                                                if (var11.field2460[var66] == var65) {
                                                    class518 var67 = new class518();
                                                    var67.field7376 = var11;
                                                    var67.field7383 = var11.field2447;
                                                    class272.field3848.method131(var67, 0);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2475 = class506.field7158;
                                }
                                if (var11.field2547 != null && class103.field1481 > var11.field2455) {
                                    if (var11.field2546 == null || class103.field1481 - var11.field2455 > 32) {
                                        class518 var73 = new class518();
                                        var73.field7376 = var11;
                                        var73.field7383 = var11.field2547;
                                        class272.field3848.method131(var73, 0);
                                    } else {
                                        label645: for (int var69 = var11.field2455; var69 < class103.field1481; var69++) {
                                            int var70 = class621.field9157[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field2546.length; var71++) {
                                                if (var11.field2546[var71] == var70) {
                                                    class518 var72 = new class518();
                                                    var72.field7376 = var11;
                                                    var72.field7383 = var11.field2547;
                                                    class272.field3848.method131(var72, 0);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2455 = class103.field1481;
                                }
                                if (var11.field2424 != null && class216.field3175 > var11.field2554) {
                                    if (var11.field2499 == null || class216.field3175 - var11.field2554 > 32) {
                                        class518 var78 = new class518();
                                        var78.field7376 = var11;
                                        var78.field7383 = var11.field2424;
                                        class272.field3848.method131(var78, 0);
                                    } else {
                                        label621: for (int var74 = var11.field2554; var74 < class216.field3175; var74++) {
                                            int var75 = class282.field3950[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field2499.length; var76++) {
                                                if (var11.field2499[var76] == var75) {
                                                    class518 var77 = new class518();
                                                    var77.field7376 = var11;
                                                    var77.field7383 = var11.field2424;
                                                    class272.field3848.method131(var77, 0);
                                                    break label621;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2554 = class216.field3175;
                                }
                                if (var11.field2493 != null && class240.field3448 > var11.field2433) {
                                    if (var11.field2419 == null || class240.field3448 - var11.field2433 > 32) {
                                        class518 var83 = new class518();
                                        var83.field7376 = var11;
                                        var83.field7383 = var11.field2493;
                                        class272.field3848.method131(var83, 0);
                                    } else {
                                        label597: for (int var79 = var11.field2433; var79 < class240.field3448; var79++) {
                                            int var80 = class406.field5553[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field2419.length; var81++) {
                                                if (var11.field2419[var81] == var80) {
                                                    class518 var82 = new class518();
                                                    var82.field7376 = var11;
                                                    var82.field7383 = var11.field2493;
                                                    class272.field3848.method131(var82, 0);
                                                    break label597;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2433 = class240.field3448;
                                }
                                if (class263.field3743 > var11.field2418 && var11.field2420 != null) {
                                    class518 var84 = new class518();
                                    var84.field7376 = var11;
                                    var84.field7383 = var11.field2420;
                                    class272.field3848.method131(var84, 0);
                                }
                                if (class433.field5800 > var11.field2418 && var11.field2486 != null) {
                                    class518 var85 = new class518();
                                    var85.field7376 = var11;
                                    var85.field7383 = var11.field2486;
                                    class272.field3848.method131(var85, 0);
                                }
                                if (class188.field2804 > var11.field2418 && var11.field2564 != null) {
                                    class518 var86 = new class518();
                                    var86.field7376 = var11;
                                    var86.field7383 = var11.field2564;
                                    class272.field3848.method131(var86, 0);
                                }
                                if (class466.field6557 > var11.field2418 && var11.field2503 != null) {
                                    class518 var87 = new class518();
                                    var87.field7376 = var11;
                                    var87.field7383 = var11.field2503;
                                    class272.field3848.method131(var87, 0);
                                }
                                if (class564.field8362 > var11.field2418 && var11.field2531 != null) {
                                    class518 var88 = new class518();
                                    var88.field7376 = var11;
                                    var88.field7383 = var11.field2531;
                                    class272.field3848.method131(var88, 0);
                                }
                                var11.field2418 = class226.field3283;
                                if (var11.field2426 != null) {
                                    for (int var89 = 0; var89 < class46.field559; var89++) {
                                        class518 var90 = new class518();
                                        var90.field7376 = var11;
                                        var90.field7385 = class36.field427[var89].method802(-34);
                                        var90.field7382 = class36.field427[var89].method799(76);
                                        var90.field7383 = var11.field2426;
                                        class272.field3848.method131(var90, 0);
                                    }
                                }
                                if (class559.field8304 && var11.field2406 != null) {
                                    class518 var91 = new class518();
                                    var91.field7376 = var11;
                                    var91.field7383 = var11.field2406;
                                    class272.field3848.method131(var91, 0);
                                }
                            }
                            if (var11.field2552 == 5 && var11.field2427 != -1) {
                                var11.method1163(class351.field4786, 126, class97.field1414).method3382(class99.field1445, 1, var11.field2459);
                            }
                            class89.method669(var11, -26747);
                            if (var11.field2552 == 0) {
                                method1620(arg0, var11.field2456, var14, var15, var16, var17, var12 - var11.field2521, var13 - var11.field2404, arg8, arg9);
                                if (var11.field2462 != null) {
                                    method1620(var11.field2462, var11.field2456, var14, var15, var16, var17, var12 - var11.field2521, var13 - var11.field2404, arg8, arg9);
                                }
                                class243 var92 = (class243) class385.field5297.method2799((long) var11.field2456, true);
                                if (var92 != null) {
                                    if (class348.field4768 == class210.field3104 && var92.field3469 == 0 && !class446.field6245 && var21 && !class112.field1592) {
                                        class589.method3497(false);
                                    }
                                    class123.method875(var14, var17, var16, var92.field3471, false, var15, arg8, var12, var13, arg9);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class89.method669(var11, -26747);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lvp;)Lvp;")
    public static final class162 method1621(class162 arg0) {
        int var1 = method1599(arg0).method3655(7);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class153.method1117(arg0.field2483, -30170);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1622() {
        int var0 = class551.field8224;
        int[] var1 = class314.field4332;
        int var2 = class22.field207 ? var0 : class527.field7717 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class136 var4;
            if (var3 < var0) {
                var4 = class293.field4036[var1[var3]];
            } else {
                var4 = ((class505) class510.field7260.method2799((long) class634.field9290[var3 - var0], true)).field7148;
            }
            if (var4.field1878 >= 0) {
                int var5 = var4.method940(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8496 & 0x7F) == 0 && (var4.field8500 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field8496 & 0x7F) == 64 && (var4.field8500 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class373 && var4.field1949 != null && class617.field9123 >= var4.field1949.field6466 && class617.field9123 < var4.field1949.field6464) {
                    ((class373) var4).field5137 = false;
                }
                var4.field8502 = class132.method919(var4.field8501, var4.field8500, var4.field8496, (byte) -82);
                class320.method1933(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1623(int arg0) {
        field3631++;
        if (!class56.field668.field6854) {
            for (int var2 = 0; var2 < class46.field559; var2++) {
                if (class36.field427[var2].method799(121) == 's' || class36.field427[var2].method799(79) == 'S') {
                    class56.field668.field6854 = true;
                    break;
                }
            }
        }
        if (arg0 != -31446) {
            field3636 = null;
        }
        if (class203.field2997 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class598.method3538(true);
            if (class511.field7274 == 0L) {
                class511.field7274 = var5;
            }
            if (var4 > 16384 && var5 - class511.field7274 < 5000L) {
                if (var5 - class614.field9094 > 1000L) {
                    System.gc();
                    class614.field9094 = var5;
                }
                class493.field7009 = class453.field6396.method3408(arg0 + 31523, class63.field795);
                class317.field4373 = 5;
            } else {
                class493.field7009 = class80.field1075.method3408(106, class63.field795);
                class317.field4373 = 5;
                class203.field2997 = 10;
            }
        } else if (class203.field2997 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class127.field1774[var7] = class545.method3317((byte) -86, class146.field2125, class410.field5609);
            }
            class493.field7009 = class56.field666.method3408(arg0 ^ 0xFFFF8541, class63.field795);
            class203.field2997 = 20;
            class317.field4373 = 10;
        } else if (class203.field2997 == 20) {
            if (class13.field121 == null) {
                class13.field121 = new class239(class177.field2706, class137.field1961, class348.field4763, class241.field3459);
            }
            if (class13.field121.method1527((byte) -119)) {
                class248.field3570 = class220.method1425(true, (byte) 119, 1, false, 0);
                class243.field3473 = class220.method1425(true, (byte) 120, 1, false, 1);
                class493.field7012 = class220.method1425(true, (byte) -124, 1, false, 2);
                class630.field9253 = class220.method1425(true, (byte) 127, 1, false, 3);
                class472.field6666 = class220.method1425(true, (byte) 121, 1, false, 4);
                class282.field3952 = class220.method1425(true, (byte) -64, 1, true, 5);
                class333.field4619 = class220.method1425(false, (byte) -16, 1, true, 6);
                class511.field7275 = class220.method1425(true, (byte) -80, 1, false, 7);
                class585.field8595 = class220.method1425(true, (byte) -99, 1, false, 8);
                class582.field8550 = class220.method1425(true, (byte) 120, 1, false, 9);
                class88.field1321 = class220.method1425(true, (byte) 118, 1, false, 10);
                class634.field9289 = class220.method1425(true, (byte) 117, 1, false, 11);
                class429.field5766 = class220.method1425(true, (byte) -107, 1, false, 12);
                class647.field9401 = class220.method1425(true, (byte) -64, 1, false, 13);
                class623.field9185 = class220.method1425(false, (byte) -75, 1, false, 14);
                class38.field467 = class220.method1425(true, (byte) 123, 1, false, 15);
                class392.field5396 = class220.method1425(true, (byte) 118, 1, false, 16);
                class11.field110 = class220.method1425(true, (byte) 120, 1, false, 17);
                class49.field572 = class220.method1425(true, (byte) -85, 1, false, 18);
                class146.field2116 = class220.method1425(true, (byte) -58, 1, false, 19);
                class195.field2890 = class220.method1425(true, (byte) 122, 1, false, 20);
                class286.field3991 = class220.method1425(true, (byte) 127, 1, false, 21);
                class252.field3643 = class220.method1425(true, (byte) -128, 1, false, 22);
                class180.field2737 = class220.method1425(true, (byte) -37, 1, true, 23);
                class310.field4271 = class220.method1425(true, (byte) 121, 1, false, 24);
                class637.field9307 = class220.method1425(true, (byte) -114, 1, false, 25);
                class366.field5043 = class220.method1425(true, (byte) -48, 1, true, 26);
                field3636 = class220.method1425(true, (byte) -90, 1, false, 27);
                class520.field7414 = class220.method1425(true, (byte) -4, 1, true, 28);
                class481.field6843 = class220.method1425(true, (byte) -88, 1, false, 29);
                class138.field1968 = class220.method1425(true, (byte) 123, 1, true, 30);
                class96.field1410 = class220.method1425(true, (byte) 123, 1, true, 31);
                class493.field7009 = class540.field8093.method3408(113, class63.field795);
                class203.field2997 = 30;
                class317.field4373 = 15;
            } else {
                class493.field7009 = class259.field3705.method3408(99, class63.field795);
                class317.field4373 = 12;
            }
        } else if (class203.field2997 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 32; var9++) {
                var8 += class341.field4709[var9].method2934(-94) * class157.field2337[var9] / 100;
            }
            if (var8 == 100) {
                class493.field7009 = class398.field5466.method3408(arg0 + 31544, class63.field795);
                class317.field4373 = 20;
                class282.method1757(class585.field8595, -99);
                class415.method2445(class585.field8595, arg0 + 31338);
                class203.field2997 = 35;
            } else {
                if (var8 != 0) {
                    class493.field7009 = class493.field7011.method3408(113, class63.field795) + var8 + "%";
                }
                class317.field4373 = 20;
            }
        } else if (class203.field2997 == 35) {
            class476.method2869(class138.field1968, class442.field5896, -3);
            class493.field7009 = class482.field6874.method3408(arg0 ^ 0xFFFF855C, class63.field795);
            class203.field2997 = 40;
            class317.field4373 = 20;
        } else if (class203.field2997 == 40) {
            if (class520.field7414.method1968((byte) 69)) {
                this.method1605(-70, class520.field7414.method1984(arg0 ^ -31828, 1));
                this.method1618(class520.field7414.method1984(1670, 3), -19917);
                if (class519.field7409 == -1 || class511.field7275.method1980(0, class519.field7409, (byte) -17)) {
                    class493.field7009 = class416.field5638.method3408(arg0 + 31554, class63.field795);
                    class317.field4373 = 25;
                    class203.field2997 = 41;
                }
            } else {
                class493.field7009 = class51.field599.method3408(78, class63.field795) + class520.field7414.method1960((byte) 49) + "%";
                class317.field4373 = 25;
            }
        } else if (class203.field2997 == 41) {
            int var10 = class80.method610(true, "jaggl");
            if (var10 >= 0 && var10 < 100) {
                class493.field7009 = class332.field4599.method3408(91, class63.field795) + var10 + "%";
                class317.field4373 = 25;
            } else {
                class493.field7009 = class165.field2604.method3408(96, class63.field795);
                class203.field2997 = 42;
                class317.field4373 = 25;
            }
        } else if (class203.field2997 == 42) {
            int var11 = class80.method610(true, "jagdx");
            if (var11 >= 0 && var11 < 100) {
                class493.field7009 = class574.field8442.method3408(113, class63.field795) + var11 + "%";
                class317.field4373 = 25;
            } else {
                class493.field7009 = class303.field4172.method3408(arg0 ^ 0xFFFF8549, class63.field795);
                class317.field4373 = 25;
                class203.field2997 = 43;
            }
        } else if (class203.field2997 == 43) {
            int var12 = class80.method610(true, "jagmisc");
            if (var12 >= 0 && var12 < 100) {
                class493.field7009 = class553.field8240.method3408(77, class63.field795) + var12 + "%";
                class317.field4373 = 25;
            } else {
                if (var12 == 100) {
                    this.method3012((byte) 87);
                }
                class493.field7009 = class357.field4865.method3408(114, class63.field795);
                class317.field4373 = 25;
                class203.field2997 = 44;
            }
        } else if (class203.field2997 == 44) {
            int var13 = class80.method610(true, "sw3d");
            if (var13 >= 0 && var13 < 100) {
                class493.field7009 = class308.field4222.method3408(arg0 + 31568, class63.field795) + var13 + "%";
                class317.field4373 = 25;
            } else {
                class493.field7009 = class539.field8024.method3408(arg0 ^ 0xFFFF8572, class63.field795);
                class317.field4373 = 25;
                class203.field2997 = 45;
            }
        } else if (class203.field2997 == 45) {
            int var14 = class80.method610(true, "jaclib");
            if (var14 >= 0 && var14 < 100) {
                class493.field7009 = class170.field2652.method3408(115, class63.field795) + var14 + "%";
                class317.field4373 = 25;
            } else {
                if (var14 == 100) {
                    this.method3015(-6058);
                }
                class493.field7009 = class224.field3239.method3408(91, class63.field795);
                class203.field2997 = 46;
                class317.field4373 = 25;
            }
        } else if (class203.field2997 == 46) {
            int var15 = class80.method610(true, "hw3d");
            if (var15 >= 0 && var15 < 100) {
                class493.field7009 = class515.field7348.method3408(arg0 ^ 0xFFFF857C, class63.field795) + var15 + "%";
                class317.field4373 = 25;
            } else {
                class493.field7009 = class293.field4045.method3408(arg0 + 31571, class63.field795);
                class203.field2997 = 47;
                class317.field4373 = 25;
            }
        } else if (class203.field2997 == 47) {
            if (class96.field1410.method1968((byte) 69)) {
                class493.field7009 = class510.field7258.method3408(116, class63.field795);
                class317.field4373 = 25;
                class203.field2997 = 50;
            } else {
                class493.field7009 = class337.field4661.method3408(76, class63.field795);
                class317.field4373 = 25;
            }
        } else if (class203.field2997 == 50) {
            class477.method2873(arg0 + 31446);
            class493.field7009 = class228.field3327.method3408(102, class63.field795);
            class203.field2997 = 60;
            class317.field4373 = 30;
        } else if (class203.field2997 == 60) {
            int var16 = class184.method1279(class647.field9401, class585.field8595, arg0 ^ 0xFFFF852B);
            int var17 = class333.method2030(false);
            if (var16 < var17) {
                class493.field7009 = class473.field6691.method3408(122, class63.field795) + var16 * 100 / var17 + "%";
                class317.field4373 = 35;
            } else {
                class493.field7009 = class218.field3183.method3408(74, class63.field795);
                class203.field2997 = 70;
                class317.field4373 = 35;
            }
        } else if (class203.field2997 == 70) {
            int var18 = class334.method2036(class585.field8595, (byte) 50);
            int var19 = class393.method2338(122);
            if (var19 > var18) {
                class493.field7009 = class406.field5550.method3408(77, class63.field795) + var18 * 100 / var19 + "%";
                class317.field4373 = 40;
            } else {
                class493.field7009 = class610.field9046.method3408(75, class63.field795);
                class203.field2997 = 80;
                class317.field4373 = 40;
            }
        } else if (class203.field2997 == 80) {
            if (class366.field5043.method1968((byte) 69)) {
                class87.field1282 = new class448(class366.field5043, class582.field8550, class585.field8595);
                class493.field7009 = class332.field4600.method3408(arg0 ^ 0xFFFF854C, class63.field795);
                class203.field2997 = 90;
                class317.field4373 = 45;
            } else {
                class493.field7009 = class584.field8581.method3408(97, class63.field795) + class366.field5043.method1960((byte) 69) + "%";
                class317.field4373 = 45;
            }
        } else if (class203.field2997 == 90) {
            class493.field7009 = class271.field3836.method3408(89, class63.field795);
            class317.field4373 = 50;
            class203.field2997 = 95;
        } else if (class203.field2997 == 95) {
            if (class56.field668.field6854) {
                class56.field668.field6872 = 0;
                class56.field668.field6862 = 0;
                class56.field668.field6831 = 0;
                class56.field668.field6859 = 0;
                class56.field668.field6858 = 1;
            }
            class56.field668.field6854 = true;
            class56.field668.method1480(class442.field5896, (byte) -69);
            class586.method3486(false, (byte) -101, class56.field668.field6872);
            class493.field7009 = class285.field3984.method3408(100, class63.field795);
            class317.field4373 = 55;
            class203.field2997 = 100;
        } else if (class203.field2997 == 100) {
            class234.method1500(class99.field1445, arg0 + 31445, class647.field9401, class585.field8595);
            class493.field7009 = class6.field52.method3408(arg0 + 31524, class63.field795);
            class317.field4373 = 60;
            class18.method117((byte) -85, 1);
            class203.field2997 = 110;
        } else if (class203.field2997 == 110) {
            class493.field7012.method1968((byte) 69);
            byte var20 = 0;
            int var21 = var20 + class493.field7012.method1960((byte) 95);
            class392.field5396.method1968((byte) 69);
            int var22 = var21 + class392.field5396.method1960((byte) 113);
            class11.field110.method1968((byte) 69);
            int var23 = var22 + class11.field110.method1960((byte) 50);
            class49.field572.method1968((byte) 69);
            int var24 = var23 + class49.field572.method1960((byte) 44);
            class146.field2116.method1968((byte) 69);
            int var25 = var24 + class146.field2116.method1960((byte) 46);
            class195.field2890.method1968((byte) 69);
            int var26 = var25 + class195.field2890.method1960((byte) 115);
            class286.field3991.method1968((byte) 69);
            int var27 = var26 + class286.field3991.method1960((byte) 52);
            class252.field3643.method1968((byte) 69);
            int var28 = var27 + class252.field3643.method1960((byte) 63);
            class310.field4271.method1968((byte) 69);
            int var29 = var28 + class310.field4271.method1960((byte) 88);
            class637.field9307.method1968((byte) 69);
            int var30 = var29 + class637.field9307.method1960((byte) 78);
            field3636.method1968((byte) 69);
            int var31 = var30 + field3636.method1960((byte) 59);
            class481.field6843.method1968((byte) 69);
            int var32 = var31 + class481.field6843.method1960((byte) 52);
            if (var32 < 1200) {
                class493.field7009 = class629.field9249.method3408(75, class63.field795) + var32 / 12 + "%";
                class317.field4373 = 65;
            } else {
                class516.field7358 = new class183(class348.field4768, class63.field795, class493.field7012);
                class105.field1514 = new class134(class348.field4768, class63.field795, class493.field7012);
                class583.field8559 = new class607(class348.field4768, class63.field795, class493.field7012, class585.field8595);
                class196.field2901 = new class487(class348.field4768, class63.field795, class11.field110);
                class391.field5388 = new class90(class348.field4768, class63.field795, class493.field7012);
                class437.field5844 = new class253(class348.field4768, class63.field795, class493.field7012);
                class194.field2879 = new class623(class348.field4768, class63.field795, class493.field7012, class511.field7275);
                class405.field5547 = new class79(class348.field4768, class63.field795, class493.field7012);
                class116.field1639 = new class111(class348.field4768, class63.field795, class493.field7012);
                class216.field3172 = new class234(class348.field4768, class63.field795, true, class392.field5396, class511.field7275);
                class440.field5876 = new class517(class348.field4768, class63.field795, class493.field7012, class585.field8595);
                class599.field8839 = new class69(class348.field4768, class63.field795, class493.field7012, class585.field8595);
                class64.field797 = new class163(class348.field4768, class63.field795, true, class49.field572, class511.field7275);
                class150.field2242 = new class614(class348.field4768, class63.field795, true, class516.field7358, class146.field2116, class511.field7275);
                class86.field1226 = new class359(class348.field4768, class63.field795, class493.field7012);
                class463.field6521 = new class499(class348.field4768, class63.field795, class195.field2890, class248.field3570, class243.field3473);
                class97.field1414 = new class508(class348.field4768, class63.field795, class493.field7012);
                class351.field4786 = new class617(class348.field4768, class63.field795, class493.field7012);
                class59.field742 = new class120(class348.field4768, class63.field795, class286.field3991, class511.field7275);
                class47.field560 = new class128(class348.field4768, class63.field795, class493.field7012);
                class208.field3078 = new class430(class348.field4768, class63.field795, class493.field7012);
                class374.field5183 = new class447(class348.field4768, class63.field795, class493.field7012);
                class32.field393 = new class379(class348.field4768, class63.field795, class252.field3643);
                class110.field1564 = new class386(class348.field4768, class63.field795, class493.field7012);
                class617.method3618(class511.field7275, class630.field9253, 99, class647.field9401, class585.field8595);
                class27.method193(true, class481.field6843);
                class196.field2893 = new class337(class63.field795, class310.field4271, class637.field9307);
                class192.field2857 = new class44(class63.field795, class310.field4271, class637.field9307, new class313());
                class493.field7009 = class261.field3732.method3408(88, class63.field795);
                class317.field4373 = 65;
                class375.method2246(25042);
                class216.field3172.method1498(!class56.field668.method1472(class526.field7533, (byte) 101), arg0 ^ 0xFFFF832A);
                class556.field8280 = new class385();
                class226.method1453((byte) 0);
                class355.method2144(true, field3636);
                class482.method2900(class511.field7275, class87.field1282, (byte) -127);
                class203.field2997 = 120;
            }
        } else if (class203.field2997 == 120) {
            int var33 = class324.method1950((byte) -87, class585.field8595);
            int var34 = class454.method2759(-116);
            if (var34 > var33) {
                class493.field7009 = class576.field8461.method3408(arg0 + 31542, class63.field795) + var33 * 100 / var34 + "%";
                class317.field4373 = 70;
            } else {
                class554.method3349(class585.field8595, -14812, class99.field1445);
                class477.method2872(class416.field5639, (byte) -102);
                class493.field7009 = class9.field100.method3408(94, class63.field795);
                class203.field2997 = 130;
                class317.field4373 = 70;
            }
        } else if (class203.field2997 == 130) {
            if (class88.field1321.method1989("", -8002, "huffman")) {
                class20 var35 = new class20(class88.field1321.method1990("", 0, "huffman"));
                class328.method1988(arg0 + 31452, var35);
                class493.field7009 = class205.field3044.method3408(arg0 + 31541, class63.field795);
                class317.field4373 = 75;
                class203.field2997 = 140;
            } else {
                class493.field7009 = class325.field4486.method3408(121, class63.field795) + "0%";
                class317.field4373 = 75;
            }
        } else if (class203.field2997 == 140) {
            if (class630.field9253.method1968((byte) 69)) {
                class493.field7009 = class171.field2663.method3408(121, class63.field795);
                class203.field2997 = 150;
                class317.field4373 = 80;
            } else {
                class493.field7009 = class238.field3430.method3408(112, class63.field795) + class630.field9253.method1960((byte) 119) + "%";
                class317.field4373 = 80;
            }
        } else if (class203.field2997 == 150) {
            if (class429.field5766.method1968((byte) 69)) {
                class493.field7009 = class253.field3656.method3408(78, class63.field795);
                class317.field4373 = 82;
                class203.field2997 = 160;
            } else {
                class493.field7009 = class251.field3601.method3408(100, class63.field795) + class429.field5766.method1960((byte) 83) + "%";
                class317.field4373 = 82;
            }
        } else if (class203.field2997 == 160) {
            if (class647.field9401.method1968((byte) 69)) {
                class493.field7009 = class263.field3752.method3408(arg0 + 31556, class63.field795);
                class203.field2997 = 170;
                class317.field4373 = 85;
            } else {
                class493.field7009 = class263.field3752.method3408(arg0 ^ 0xFFFF8560, class63.field795) + class647.field9401.method1960((byte) 120) + "%";
                class317.field4373 = 85;
            }
        } else if (class203.field2997 == 170) {
            if (class180.field2737.method1987((byte) 116, "details")) {
                class339.method2081(class180.field2737, class391.field5388, class437.field5844, class216.field3172, class440.field5876, class599.field8839, class556.field8280);
                class493.field7009 = class473.field6676.method3408(81, class63.field795);
                class203.field2997 = 190;
                class317.field4373 = 89;
            } else {
                class493.field7009 = class440.field5873.method3408(104, class63.field795) + class180.field2737.method1962(12010, "details") + "%";
                class317.field4373 = 87;
            }
        } else if (class203.field2997 == 190) {
            class624.field9201 = new int[class374.field5183.field6264];
            class428.field5753 = new boolean[class374.field5183.field6264];
            class569.field8398 = new String[class208.field3078.field5768];
            for (int var36 = 0; var36 < class374.field5183.field6264; var36++) {
                if (class374.field5183.method2708(var36, 19).field4212 == 0) {
                    class428.field5753[var36] = true;
                    class311.field4287++;
                }
                class624.field9201[var36] = -1;
            }
            class394.method2339((byte) 107);
            class488.field6935 = class630.field9253.method1967(-1, "loginscreen");
            class47.field564 = class630.field9253.method1967(-1, "lobbyscreen");
            class282.field3952.method1982(-120, false, true);
            class333.field4619.method1982(arg0 + 31531, true, true);
            class585.field8595.method1982(-78, true, true);
            class647.field9401.method1982(arg0 + 31420, true, true);
            class88.field1321.method1982(-18, true, true);
            class630.field9253.method1982(119, true, true);
            class463.field6519 = true;
            class493.field7012.field4501 = 2;
            class11.field110.field4501 = 2;
            class392.field5396.field4501 = 2;
            class49.field572.field4501 = 2;
            class146.field2116.field4501 = 2;
            class195.field2890.field4501 = 2;
            class286.field3991.field4501 = 2;
            class622.method3638(-4, false, class56.field668.field6858, -1, -1);
            class493.field7009 = class217.field3181.method3408(96, class63.field795);
            class203.field2997 = 200;
            class317.field4373 = 95;
        } else if (class203.field2997 == 200) {
            class18.method117((byte) -85, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1624() {
        for (int var0 = 0; var0 < class146.field2125; var0++) {
            int[] var1 = class118.field1670[var0];
            for (int var2 = 0; var2 < class410.field5609; var2++) {
                var1[var2] = 0;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1625(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class572("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field3637 = new class616();
        field3639 = 0;
    }
}
