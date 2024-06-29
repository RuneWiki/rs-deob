import jagex3.jagmisc.jagmisc;
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
public class client extends class471 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field7532 = 0;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    public static int[] field7531 = new int[4];

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Laa;")
    public static class76 field7528 = new class76(2, -1);

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lhp;")
    public static class290 field7541;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field7548;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 6)
    public final void method2790(int arg0) {
        field7542++;
        try {
            this.method3035(-2);
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class264.method1650(0, arg0 ^ 0xFFFFFF9C);
            class488.method2913(arg0, var3, var3.getMessage() + " (Recovered) " + this.method2801(false));
        }
        if (arg0 != 0) {
            this.method3030(-33);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 29)
    public final void init() {
        field7540++;
        if (!this.method2788((byte) 37)) {
            return;
        }
        class141.field2128 = new class210();
        class141.field2128.field3023 = Integer.parseInt(this.getParameter("worldid"));
        class107.field1600 = new class210();
        class107.field1600.field3023 = Integer.parseInt(this.getParameter("lobbyid"));
        class107.field1600.field3021 = this.getParameter("lobbyaddress");
        class150.field2287 = new class210();
        class150.field2287.field3023 = Integer.parseInt(this.getParameter("demoid"));
        class150.field2287.field3021 = this.getParameter("demoaddress");
        class52.field674 = class42.method331(Integer.parseInt(this.getParameter("modewhere")), (byte) 69);
        if (!class203.method1336(class52.field674, -116) && class52.field674 != class149.field2269) {
            class52.field674 = class149.field2269;
        }
        class478.field7043 = class482.method2877(Integer.parseInt(this.getParameter("modewhat")), -29080);
        if (class59.field818 != class478.field7043 && class478.field7043 != class337.field5201 && class478.field7043 != class394.field5906) {
            class478.field7043 = class394.field5906;
        }
        try {
            class30.field430 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class30.field430 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class197.field2893 = true;
        } else {
            class197.field2893 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class134.field2005 = true;
        } else {
            class134.field2005 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class526.field7774 = true;
        } else {
            class526.field7774 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class251.field3433 = class488.field7276;
            } else if (var4.equals("1")) {
                class251.field3433 = class214.field3057;
            }
        }
        try {
            class86.field1357 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class86.field1357 = 0;
        }
        class17.field278 = this.getParameter("quiturl");
        class339.field5232 = this.getParameter("settings");
        if (class339.field5232 == null) {
            class339.field5232 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class251.field3432 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class251.field3432 = 0;
            }
        }
        class444.field6529 = Integer.parseInt(this.getParameter("colourid"));
        if (class444.field6529 < 0 || class444.field6529 >= class288.field4305.length) {
            class444.field6529 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class222.field3160 = true;
            class226.field3195 = true;
        }
        class197.field2894 = this;
        if (class488.field7276 == class251.field3433) {
            class97.field1506 = 503;
            class227.field3206 = 765;
        } else if (class251.field3433 == class214.field3057) {
            class97.field1506 = 480;
            class227.field3206 = 640;
        }
        this.method2800(595, 20197, class97.field1506, class227.field3206, class478.field7043.method275((byte) 125) + 32);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 142)
    private final void method3030(int arg0) {
        field7536++;
        if (arg0 != -12172) {
            method3047();
        }
        boolean var2 = class264.field3946.method1790((byte) -90);
        if (!var2) {
            this.method3040((byte) 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lgo;)Z", line = 158)
    public static final boolean method3031(class310 arg0) {
        if (class418.field6270) {
            if (method3039(arg0).field5948 != 0) {
                return false;
            }
            if (arg0.field4703 == 0) {
                return false;
            }
        }
        return arg0.field4783;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 178)
    public static final void method3032(int arg0) {
        int var1 = class146.field2203;
        int[] var2 = class457.field6694;
        for (int var3 = 0; var3 < class519.field7609 + var1; var3++) {
            class400 var4;
            if (var3 < var1) {
                var4 = class83.field1327[var2[var3]];
            } else {
                var4 = class88.field1375[class327.field5114[var3 - var1]];
            }
            if (var4.field7686 == arg0 && var4.field5995 >= 0) {
                int var5 = var4.method2419((byte) 109);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field7681 & 0x7F) != 0 || (var4.field7671 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field7681 & 0x7F) != 64 || (var4.field7671 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field7681 >> 7;
                    int var7 = var4.field7671 >> 7;
                    if (var4.field5995 > class211.field3041[var6][var7]) {
                        class211.field3041[var6][var7] = var4.field5995;
                        class175.field2590[var6][var7] = 1;
                    } else if (class211.field3041[var6][var7] == var4.field5995) {
                        var10002 = class175.field2590[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field7681 - var8 >> 7;
                    int var10 = var4.field7671 - var8 >> 7;
                    int var11 = var4.field7681 + var8 >> 7;
                    int var12 = var4.field7671 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field5995 > class211.field3041[var13][var14]) {
                                class211.field3041[var13][var14] = var4.field5995;
                                class175.field2590[var13][var14] = 1;
                            } else if (class211.field3041[var13][var14] == var4.field5995) {
                                var10002 = class175.field2590[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Z", line = 275)
    private static final boolean method3033(int arg0) {
        field7530++;
        if (arg0 != 64) {
            return true;
        }
        try {
            if (class274.field4095 == 2) {
                if (class288.field4310 == null) {
                    class288.field4310 = class178.method1219(class525.field7766, class509.field7487, class531.field7825);
                    if (class288.field4310 == null) {
                        return false;
                    }
                }
                if (class336.field5186 == null) {
                    class336.field5186 = new class128(class497.field7366, class210.field3031);
                }
                if (class111.field1697.method3106(-12141, 22050, class335.field5177, class288.field4310, class336.field5186)) {
                    class111.field1697.method3128((byte) -100);
                    class111.field1697.method3105(class210.field3032, arg0 ^ 0x50);
                    class111.field1697.method3115(class288.field4310, true, class413.field6239);
                    class274.field4095 = 0;
                    class336.field5186 = null;
                    class525.field7766 = null;
                    class288.field4310 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class111.field1697.method3120(-30086);
            class336.field5186 = null;
            class274.field4095 = 0;
            class525.field7766 = null;
            class288.field4310 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 331)
    public final void method2789(int arg0) {
        int var2 = 82 % ((arg0 - 36) / 52);
        field7529++;
        try {
            this.method3048(-120);
        } catch (OutOfMemoryError var4) {
            if (var4.getMessage() == null || !var4.getMessage().startsWith("native")) {
                throw var4;
            }
            class264.method1650(0, -95);
            class488.method2913(0, var4, var4.getMessage() + " (Recovered) " + this.method2801(false));
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 355)
    public static final void method3034(int arg0) {
        int var1 = class146.field2203;
        int[] var2 = class457.field6694;
        int var3 = class266.field3968 ? var1 : class519.field7609 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class400 var5;
            if (var4 < var1) {
                var5 = class83.field1327[var2[var4]];
            } else {
                var5 = class88.field1375[class327.field5114[var4 - var1]];
            }
            if (var5.field7686 == arg0) {
                var5.field6048 = 0;
                if (var5.field5995 < 0) {
                    var5.field5981 = false;
                } else {
                    int var6 = var5.method2419((byte) 103);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field7681 & 0x7F) != 0 || (var5.field7671 & 0x7F) != 0) {
                            var5.field5981 = false;
                            continue;
                        }
                    } else if ((var5.field7681 & 0x7F) != 64 || (var5.field7671 & 0x7F) != 64) {
                        var5.field5981 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field7681 >> 7;
                        int var8 = var5.field7671 >> 7;
                        if (class211.field3041[var7][var8] != var5.field5995) {
                            var5.field5981 = true;
                            continue;
                        }
                        if (class175.field2590[var7][var8] > 1) {
                            var10002 = class175.field2590[var7][var8]--;
                            var5.field5981 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field7681 - var9 >> 7;
                        int var11 = var5.field7671 - var9 >> 7;
                        int var12 = var5.field7681 + var9 >> 7;
                        int var13 = var5.field7671 + var9 >> 7;
                        if (!class375.method2220(var11, var5.field5995, var10, var12, var13, false)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class211.field3041[var14][var15] == var5.field5995) {
                                        var10002 = class175.field2590[var14][var15]--;
                                    }
                                }
                            }
                            var5.field5981 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class480 && var5.field6058 != null && class86.field1350 >= var5.field6058.field5631 && class86.field1350 < var5.field6058.field5625) {
                        ((class480) var5).field7067 = false;
                    }
                    var5.field5981 = false;
                    var5.field7689 = class50.method373(var5.field7686, 14966, var5.field7671, var5.field7681);
                    class89.method691(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 477)
    public final void method2786(int arg0) {
        field7525++;
        if (class274.field4089) {
            class234.method1445(6);
        }
        if (class407.field6147 != null) {
            class407.field6147.method111(1);
        }
        int var2 = 75 / ((10 - arg0) / 44);
        if (class237.field3314 != null) {
            class332.method2051(class25.field375, (byte) -104, class237.field3314);
            class237.field3314 = null;
        }
        if (class232.field3269 != null) {
            class232.field3269.method669((byte) 64);
            class232.field3269 = null;
        }
        if (class508.field7465 != null) {
            class508.field7465.method2662(110, class357.field5469);
        }
        class508.field7465 = null;
        class356.method2141(13086);
        class264.field3946.method1785(98);
        class31.field445.method460(0);
        if (class332.field5150 != null) {
            class332.field5150.method388((byte) -70);
            class332.field5150 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 522)
    private final void method3035(int arg0) {
        field7545++;
        if (class411.field6213 == 13) {
            return;
        }
        long var2 = class439.method2573(arg0 + 1) / 1000000L - class180.field2657;
        class180.field2657 = class439.method2573(arg0 + 1) / 1000000L;
        boolean var4 = method3033(arg0 + 66);
        if (var4 && class520.field7641 && class4.field37 != null) {
            class4.field37.method1637(31394);
        }
        if (class519.method3069(9, class411.field6213)) {
            if (class291.field4366 != 0L && class291.field4366 < class381.method2281((byte) 105)) {
                class295.method1837(class437.method2568(arg0 - 14), 19, class454.field6661.field979, false, class454.field6661.field982);
            } else if (!class407.field6147.method95() && class242.field3362) {
                class224.method1407(true);
            }
        }
        if (class237.field3314 == null) {
            Container var5;
            if (class176.field2596 == null) {
                var5 = class25.field375.field1611;
            } else {
                var5 = class176.field2596;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class176.field2596 == var5) {
                Insets var8 = class176.field2596.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class455.field6669 != var6 || class69.field921 != var7) {
                if (class407.field6147 == null || class407.field6147.method146()) {
                    class419.method2497(true);
                } else {
                    class455.field6669 = var6;
                    class69.field921 = var7;
                }
                class291.field4366 = class381.method2281((byte) -117) + 500L;
            }
        }
        if (class237.field3314 != null && !class394.field5908 && class519.method3069(9, class411.field6213)) {
            class295.method1837(class454.field6661.field970, 19, -1, false, -1);
        }
        boolean var9 = false;
        if (class426.field6352) {
            class426.field6352 = false;
            var9 = true;
        }
        if (var9) {
            class111.method864(arg0 ^ 0x2CD9);
        }
        if (class407.field6147 != null && class407.field6147.method95() || class437.method2568(arg0 - 90) != 1) {
            class134.method988(-28945);
        }
        if (class411.field6213 == 0) {
            class526.method3136(class90.field1408[class444.field6529], class448.field6608, var9, class192.field2829, 100, class238.field3333[class444.field6529], class288.field4305[class444.field6529]);
        } else if (class411.field6213 == 1) {
            class65.method458(class288.field4305[class444.field6529].getRGB(), class90.field1408[class444.field6529].getRGB(), class345.field5325, arg0 + 4, class407.field6147, class238.field3333[class444.field6529].getRGB(), var9 | class407.field6147.method95());
        } else if (class431.method2547(2, class411.field6213)) {
            class115.method874((byte) -83);
        } else if (class218.method1380(class411.field6213, arg0 + 2)) {
            class115.method874((byte) -83);
        } else if (class26.method256(716, class411.field6213)) {
            if (class314.field4856 == 1) {
                if (class480.field7097 < class245.field3393) {
                    class480.field7097 = class245.field3393;
                }
                int var11 = (class480.field7097 - class245.field3393) * 50 / class480.field7097;
                class351.method2123((byte) -83, class164.field2445, class221.field3157.method2103(class30.field430, (byte) 34) + "<br>(" + var11 + "%)", true);
            } else if (class314.field4856 == 2) {
                if (class389.field5863 > class470.field6885) {
                    class470.field6885 = class389.field5863;
                }
                int var10 = (class470.field6885 - class389.field5863) * 50 / class470.field6885 + 50;
                class351.method2123((byte) -81, class164.field2445, class221.field3157.method2103(class30.field430, (byte) 34) + "<br>(" + var10 + "%)", true);
            } else {
                class351.method2123((byte) -72, class164.field2445, class221.field3157.method2103(class30.field430, (byte) 34), true);
            }
        } else if (class411.field6213 == 9) {
            class404.method2437(var2, (byte) 120);
        } else if (class411.field6213 == 12) {
            class351.method2123((byte) -90, class164.field2445, class31.field449.method2103(class30.field430, (byte) 34) + "<br>" + class497.field7380.method2103(class30.field430, (byte) 34), true);
        }
        if (class171.field2518 == 3) {
            for (int var12 = 0; var12 < class81.field1139; var12++) {
                Rectangle var13 = class276.field4112[var12];
                if (class272.field4059[var12]) {
                    class407.field6147.method67(80, var13.width, -1996553985, var13.x, var13.height, var13.y);
                } else if (class462.field6727[var12]) {
                    class407.field6147.method67(68, var13.width, -1996554240, var13.x, var13.height, var13.y);
                }
            }
        }
        if (arg0 != -2) {
            return;
        }
        if (class9.method39((byte) 68)) {
            class7.method28(true, class407.field6147);
        }
        if (class519.method3069(arg0 + 11, class411.field6213) && class171.field2518 == 0 && class437.method2568(-62) == 1 && !var9 && class109.field1609.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class81.field1139; var15++) {
                if (class462.field6727[var15]) {
                    class462.field6727[var15] = false;
                    class339.field5229[var14++] = class276.field4112[var15];
                }
            }
            class407.field6147.method147(class339.field5229, var14);
        } else if (class411.field6213 != 0) {
            class407.field6147.method161();
            for (int var16 = 0; var16 < class81.field1139; var16++) {
                class462.field6727[var16] = false;
            }
        }
        if (class454.field6661.field966 == 0) {
            class389.method2332(-123, 15L);
        } else if (class454.field6661.field966 == 1) {
            class389.method2332(arg0 ^ 0x70, 10L);
        } else if (class454.field6661.field966 == 2) {
            class389.method2332(16, 5L);
        } else if (class454.field6661.field966 == 3) {
            class389.method2332(-110, 2L);
        }
        if (class56.field768) {
            class154.method1109(arg0 - 116);
        }
        if (class454.field6661.field977 && class411.field6213 == 2 && class256.field3477 != -1) {
            class454.field6661.field977 = false;
            class454.field6661.method1532(class25.field375, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 762)
    public static void method3036(byte arg0) {
        field7528 = null;
        if (arg0 == 18) {
            field7531 = null;
            field7541 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 777)
    public final String method2801(boolean arg0) {
        field7533++;
        String var2 = null;
        try {
            var2 = "[1)" + class267.field3979 + "," + class241.field3358 + "," + class50.field640 + "," + class448.field6611 + "|";
            if (arg0) {
                field7528 = null;
            }
            if (class410.field6198 != null) {
                var2 = var2 + "2)" + class521.field7651 + "," + (class410.field6198.field6065[0] + class267.field3979) + "," + (class410.field6198.field6068[0] + class241.field3358) + "|";
            }
            var2 = var2 + "3)" + class113.field1723 + "|4)" + class454.field6661.field993 + "|5)" + class437.method2568(-16) + "|6)" + class155.field2347 + "," + class413.field6241 + "|";
            var2 = var2 + "7)" + class454.field6661.method510(15479, class113.field1723) + "|";
            var2 = var2 + "8)" + class454.field6661.method509(class113.field1723, -2) + "|";
            var2 = var2 + "9)" + class454.field6661.field983 + "|";
            var2 = var2 + "10)" + class454.field6661.field975 + "|";
            var2 = var2 + "11)" + class454.field6661.field997 + "|";
            var2 = var2 + "12)" + class454.field6661.method1533(-1, class113.field1723) + "|";
            var2 = var2 + "13)" + class521.field7648 + "|";
            var2 = var2 + "14)" + class411.field6213;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var3) {
            }
            var2 = var2 + "]";
        } catch (Throwable var4) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 812)
    public static final void main(String[] arg0) {
        field7534++;
        try {
            if (arg0.length != 6) {
                class364.method2174((byte) 99, "Argument count");
            }
            class141.field2128 = new class210();
            class141.field2128.field3023 = Integer.parseInt(arg0[0]);
            class107.field1600 = new class210();
            class107.field1600.field3023 = Integer.parseInt(arg0[1]);
            class150.field2287 = new class210();
            class150.field2287.field3023 = Integer.parseInt(arg0[2]);
            class52.field674 = class5.field47;
            if (arg0[3].equals("live")) {
                class478.field7043 = class394.field5906;
            } else if (arg0[3].equals("rc")) {
                class478.field7043 = class337.field5201;
            } else if (arg0[3].equals("wip")) {
                class478.field7043 = class59.field818;
            } else {
                class364.method2174((byte) -121, "modewhat");
            }
            class30.field430 = class334.method2059(0, arg0[4]);
            if (class30.field430 == -1) {
                if (arg0[4].equals("english")) {
                    class30.field430 = 0;
                } else if (arg0[4].equals("german")) {
                    class30.field430 = 1;
                } else {
                    class364.method2174((byte) 76, "language");
                }
            }
            class197.field2893 = false;
            class134.field2005 = false;
            if (arg0[5].equals("game0")) {
                class251.field3433 = class488.field7276;
            } else if (arg0[5].equals("game1")) {
                class251.field3433 = class214.field3057;
            } else {
                class364.method2174((byte) 107, "game");
            }
            class86.field1357 = 0;
            class444.field6529 = class251.field3433.field3910;
            class222.field3160 = true;
            class226.field3195 = true;
            class339.field5232 = "";
            class251.field3432 = 0;
            client var1 = new client();
            class197.field2894 = var1;
            var1.method2803(30, 1024, false, class251.field3433.field3909, class478.field7043.method275((byte) 125) + 32, 10, 768, 595);
            class176.field2596.setLocation(40, 40);
        } catch (Exception var3) {
            class488.method2913(0, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 883)
    public final void method2792(int arg0) {
        field7535++;
        Frame var2 = new Frame("Jagex");
        if (arg0 != 7) {
            return;
        }
        var2.pack();
        var2.dispose();
        class419.method2497(true);
        class31.field445 = new class65(class25.field375);
        class264.field3946 = new class289();
        if (class52.field674 != class149.field2269) {
            class184.field2710 = new byte[50][];
        }
        class454.field6661 = new class257(class25.field375);
        if (class52.field674 == class149.field2269) {
            class141.field2128.field3021 = this.getCodeBase().getHost();
        } else if (class203.method1336(class52.field674, -105)) {
            class141.field2128.field3021 = this.getCodeBase().getHost();
            class141.field2128.field3026 = class141.field2128.field3023 + 40000;
            class107.field1600.field3026 = class107.field1600.field3023 + 40000;
            class150.field2287.field3026 = class150.field2287.field3023 + 40000;
            class141.field2128.field3025 = class141.field2128.field3023 + 50000;
            class107.field1600.field3025 = class107.field1600.field3023 + 50000;
            class150.field2287.field3025 = class150.field2287.field3023 + 50000;
        } else if (class52.field674 == class5.field47) {
            class141.field2128.field3021 = "127.0.0.1";
            class107.field1600.field3021 = "127.0.0.1";
            class141.field2128.field3026 = class141.field2128.field3023 + 40000;
            class150.field2287.field3021 = "127.0.0.1";
            class107.field1600.field3026 = class107.field1600.field3023 + 40000;
            class141.field2128.field3025 = class141.field2128.field3023 + 50000;
            class150.field2287.field3026 = class150.field2287.field3023 + 40000;
            class107.field1600.field3025 = class107.field1600.field3023 + 50000;
            class150.field2287.field3025 = class150.field2287.field3023 + 50000;
        }
        if (class251.field3433 == class214.field3057) {
            class358.field5475 = 0;
            class80.field1107 = true;
            class328.field5124 = class153.field2325;
            class266.field3970 = class229.field3224;
            class157.field2373 = class250.field3418;
            class406.field6118 = class359.field5495;
            class457.field6689 = 16777215;
        } else {
            class406.field6118 = class430.field6390;
            class157.field2373 = class379.field5708;
            class328.field5124 = class376.field5669;
            class266.field3970 = class462.field6732;
        }
        if (class488.field7276 == class251.field3433) {
            class59.field812 = false;
        }
        class20.field298 = class292.field4377 = class229.field3225 = class219.field3133 = new short[256];
        class141.field2122 = class141.field2128;
        class49.field630 = class83.method670(class357.field5469, -25974);
        class45.field591 = class7.method30((byte) 117, class357.field5469, true);
        class508.field7465 = class202.method1331(-488640729);
        if (class508.field7465 != null) {
            class508.field7465.method2665((byte) 11, class357.field5469);
        }
        class105.field1572 = class109.field1613;
        try {
            if (class25.field375.field1624 != null) {
                class95.field1478 = new class122(class25.field375.field1624, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class75.field1059[var3] = new class122(class25.field375.field1619[var3], 6000, 0);
                }
                class359.field5512 = new class122(class25.field375.field1615, 6000, 0);
                class529.field7794 = new class292(255, class95.field1478, class359.field5512, 500000);
                class107.field1593 = new class122(class25.field375.field1612, 24, 0);
                class25.field375.field1615 = null;
                class25.field375.field1619 = null;
                class25.field375.field1624 = null;
                class25.field375.field1612 = null;
            }
        } catch (IOException var4) {
            class529.field7794 = null;
            class107.field1593 = null;
            class95.field1478 = null;
            class359.field5512 = null;
        }
        if (class52.field674 != class149.field2269) {
            class425.field6333 = true;
        }
        if (class488.field7276 == class251.field3433) {
            class128.field1917 = class426.field6350.method2103(class30.field430, (byte) 34);
        } else if (class251.field3433 == class214.field3057) {
            class128.field1917 = class324.field5059.method2103(class30.field430, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1008)
    public static final void method3037() {
        class325.field5071 = 0;
        for (int var0 = 0; var0 < class519.field7609; var0++) {
            class351 var1 = class88.field1375[class327.field5114[var0]];
            if (var1.field5981 && var1.method2121(9) != -1) {
                int var2 = (var1.method2419((byte) 124) - 1) * 64 + 60;
                int var3 = var1.field7681 - var2 >> 7;
                int var4 = var1.field7671 - var2 >> 7;
                class400 var5 = class45.method347(var4, var1.field7686, var3, 112);
                if (var5 != null) {
                    int var6 = var5.field6015;
                    if (var5 instanceof class351) {
                        var6 += 2048;
                    }
                    if (var5.field6048 == 0 && var5.method2121(9) != -1) {
                        class201.field2932[class325.field5071] = var6;
                        class187.field2752[class325.field5071] = var6;
                        class325.field5071++;
                        var5.field6048++;
                    }
                    class201.field2932[class325.field5071] = var6;
                    class187.field2752[class325.field5071] = var1.field6015 + 2048;
                    class325.field5071++;
                    var5.field6048++;
                }
            }
        }
        class514.method3029(class325.field5071 - 1, class187.field2752, class201.field2932, false, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Luc;", line = 1057)
    public static final class202 method3038(int arg0, int arg1, int arg2) {
        class306 var3 = class236.field3305[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = var3.field4588;
            var3.field4588 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1068)
    public final void method2798(int arg0) {
        field7526++;
        method3036((byte) 18);
        class154.method1106(arg0 - 17358);
        class216.method1377(103);
        class347.method2102(true);
        class29.method263(false);
        class483.method2883(14307);
        class10.method50(false);
        class464.method2697(arg0 ^ 0x4441);
        class405.method2439(arg0 ^ 0xFFFFEFCA);
        class275.method1710((byte) -114);
        class517.method3063((byte) -125);
        class237.method1457((byte) 124);
        class31.method274(106);
        class78.method566(true);
        class262.method1643(122);
        class511.method3012(23);
        class11.method127(-30049);
        class257.method1525((byte) -64);
        class427.method2531(4);
        class141.method1035(22806);
        class497.method2952(arg0 ^ 0xFFFFBBBB);
        class459.method2661(-16603);
        class83.method665((byte) 113);
        class289.method1783((byte) 61);
        class65.method454((byte) 123);
        class45.method348((byte) -128);
        class74.method520(false);
        class292.method1808(false);
        class382.method2283(true);
        class51.method382((byte) 115);
        class146.method1061(5);
        class505.method2983((byte) 50);
        class529.method3139(-119);
        class320.method2005(true);
        class59.method423(123);
        class436.method2563(119);
        class225.method1412(102);
        class25.method253((byte) 54);
        class90.method701(-97);
        class44.method341(34);
        class462.method2674((byte) 23);
        class414.method2483(1);
        class80.method569(117);
        class291.method1807((byte) 51);
        class482.method2878((byte) -60);
        class236.method1455(arg0 ^ 0x441B);
        class309.method1927(15);
        class295.method1836((byte) 34);
        class422.method2514(200);
        class21.method220((byte) 126);
        class265.method1657(arg0 ^ 0xFFFFBBBA);
        class231.method1432(true);
        class293.method1821((byte) 107);
        class2.method5((byte) 57);
        class52.method390(true);
        class311.method1947(true);
        class367.method2188(-111);
        class149.method1083(188);
        class290.method1799(false);
        class396.method2380((byte) 74);
        class521.method3093(0);
        class310.method1936((byte) 109);
        class330.method2046(arg0 ^ 0x4426);
        class62.method438(256);
        class170.method1175(arg0 ^ 0x4447);
        class451.method2627((byte) -35);
        class468.method2769((byte) -117);
        class400.method2425(112);
        class307.method1912(2909);
        class306.method1907(22215);
        class526.method3135((byte) 76);
        class22.method221(0);
        class233.method1444(arg0 - 17477);
        class399.method2404((byte) 94);
        class76.method557(3);
        class213.method1371((byte) 17);
        class158.method1122((byte) -118);
        class38.method317(0);
        class119.method900((byte) -126);
        class345.method2097((byte) -116);
        class481.method2869((byte) -126);
        class514.method3022(false);
        class261.method1641(-121);
        class397.method2383((byte) 121);
        class152.method1102(arg0 - 38633);
        class37.method311(-25317);
        class210.method1359((byte) -43);
        class457.method2652((byte) 67);
        class267.method1667(false);
        class49.method368(0);
        class86.method681(0);
        class274.method1706(100);
        class72.method508((byte) 110);
        class36.method304((byte) 16);
        class41.method323((byte) 15);
        class520.method3078(arg0 - 29563);
        class357.method2144(-46);
        class398.method2395(-14976);
        class235.method1449(11720);
        class112.method870((byte) 101);
        class50.method377(arg0 - 17603);
        class500.method2972(0);
        class486.method2901(arg0 - 17601);
        class118.method898(0);
        class126.method929((byte) 33);
        class337.method2064((byte) 1);
        class277.method1730(95);
        class81.method583((byte) -73);
        class249.method1494(true);
        class443.method2604((byte) -98);
        class46.method354(-1524);
        class531.method3153(22858);
        class227.method1419(14);
        class524.method3118(-1);
        class260.method1636(-11028);
        class56.method412((byte) -128);
        class334.method2060(-1);
        class73.method514((byte) -124);
        class241.method1471(arg0 ^ 0x4476);
        class350.method2116(1);
        class128.method945((byte) -22);
        class214.method1372(false);
        class252.method1507((byte) -123);
        class365.method2180(arg0 - 17476);
        class522.method3096((byte) 118);
        class419.method2499(-122);
        class268.method1672(0);
        class250.method1500(-31505);
        class387.method2326();
        class192.method1282(48);
        class434.method2560(95);
        class508.method3000(false);
        class84.method675(87);
        class12.method164((byte) 126);
        class107.method808(3);
        class64.method444();
        class137.method1008();
        class228.method1421(-1);
        class219.method1382((byte) -108);
        class294.method1832();
        class535.method3165(-53);
        class473.method2808(arg0 ^ 0x442E);
        class327.method2032((byte) -72);
        class288.method1777(arg0 - 17453);
        class3.method14((byte) 65);
        class465.method2701((byte) -87);
        class184.method1248((byte) -67);
        class452.method2634((byte) -109);
        class491.method2934(arg0 - 17483);
        class148.method1071(-1185989056);
        class95.method744((byte) -111);
        class420.method2506(-60);
        class136.method991(false);
        class211.method1360((byte) 56);
        class409.method2453(0);
        class424.method2520(arg0 ^ 0x4444);
        class363.method2167(0);
        class270.method1685(127);
        class191.method1272(-25623);
        class432.method2551(-21585);
        class339.method2070(true);
        class494.method2939(-104);
        class238.method1462(0);
        class77.method563(true);
        class437.method2570((byte) 52);
        class145.method1045((byte) 75);
        class418.method2494((byte) -37);
        class403.method2433((byte) -101);
        class474.method2820(6106);
        class48.method356();
        class460.method2667(arg0 - 25939);
        class461.method2672((byte) 98);
        class391.method2343(3);
        class282.method1759(77);
        class120.method902(true);
        class456.method2651(arg0 + 5718);
        class68.method477(false);
        class413.method2472(121);
        class355.method2139(true);
        class466.method2710((byte) 124);
        class202.method1332((byte) -40);
        class512.method3018(arg0 - 17477);
        class169.method1173((byte) 119);
        class17.method199(-784);
        class502.method2974(0);
        class61.method437(true);
        class280.method1743((byte) 127);
        class411.method2461((byte) -103);
        class99.method761(true);
        class203.method1335((byte) 127);
        class27.method261(-75);
        class167.method1162(0);
        class525.method3134((byte) -44);
        class16.method195(-1);
        class232.method1438((byte) -111);
        class58.method416((byte) -111);
        class166.method1157(0);
        class297.method1849(arg0 ^ 0xFFFFBBBA);
        class378.method2231(126);
        class163.method1146(58);
        class245.method1488(64);
        class55.method408(false);
        class336.method2063(7);
        class478.method2843(122);
        class385.method2308((byte) -91);
        class315.method1974(58);
        class407.method2448(223);
        class359.method2152(-29012);
        class125.method922(true);
        class338.method2066((byte) 17);
        class515.method3053((byte) -54);
        class335.method2062(126);
        class20.method212(false);
        class57.method415();
        class254.method1513((byte) 92);
        class34.method291((byte) -75);
        class302.method1876(64);
        class111.method865(arg0 ^ 0x4410);
        class47.method355(1);
        class364.method2170((byte) -121);
        class349.method2113((byte) 107);
        class368.method2195(5);
        class155.method1116(arg0 ^ 0xFFFFBBC8);
        class103.method777((byte) 126);
        class340.method2080((byte) 26);
        class33.method285((byte) -100);
        class369.method2208();
        class175.method1198((byte) -85);
        class390.method2339(true);
        class100.method767(-71);
        class19.method211(true);
        class96.method752(-13175);
        class410.method2457(18253);
        class326.method2028(arg0 ^ 0x44445);
        class23.method226((byte) -100);
        class53.method394(-83);
        class157.method1119(0);
        class386.method2311(262144);
        class239.method1469((byte) -127);
        class242.method1472(false);
        class221.method1402((byte) -118);
        class498.method2962(arg0 - 17477);
        class285.method1770(arg0 ^ 0xFFFFE8F9);
        class509.method3005(true);
        class439.method2576((byte) 56);
        class104.method781((byte) -21);
        class132.method977((byte) -91);
        class220.method1385();
        class251.method1504((byte) 97);
        class352.method2129(true);
        class177.method1210();
        class190.method1266();
        class255.method1515();
        class113.method872(false);
        class234.method1446((byte) -69);
        class287.method1776();
        class490.method2923(2);
        class384.method2304(114);
        class342.method2086(32487);
        class6.method26(true);
        class199.method1314();
        class97.method757(arg0 - 17359);
        class263.method1647(-5880);
        class495.method2943(-3405);
        class455.method2647((byte) -46);
        class9.method40(2);
        class75.method556(4508);
        class54.method397((byte) -89);
        class394.method2369((byte) -108);
        class133.method980(1);
        class71.method502(5000);
        class70.method492((byte) -97);
        class469.method2783(-26033);
        class187.method1261(false);
        class332.method2050(-14861);
        class108.method813(-1);
        class258.method1600(arg0 - 17428);
        class333.method2052(102);
        class530.method3145(16831);
        class110.method851((byte) -15);
        class69.method485(5866);
        class446.method2618((byte) 32);
        class230.method1429(arg0 ^ arg0);
        class348.method2107((byte) 9);
        class476.method2825(true);
        class283.method1763((byte) 50);
        class324.method2019(false);
        class426.method2529(-1);
        class299.method1860(arg0 ^ 0x3E31);
        class487.method2911(false);
        class362.method2164();
        class164.method1152((byte) -43);
        class264.method1655((byte) 116);
        class488.method2917(1);
        class534.method3159(arg0 - 17475);
        class229.method1423(arg0 - 17477);
        class379.method2240(12493);
        class303.method1885(-6205);
        class279.method1741((byte) 118);
        class171.method1178(false);
        class194.method1287((byte) 103);
        class117.method879(204);
        class147.method1069((byte) 49);
        class433.method2556(arg0 ^ 0xFFFFBBC2);
        class195.method1292(3);
        class444.method2607((byte) -91);
        class513.method3020(true);
        class503.method2979((byte) 68);
        class7.method29(-1);
        class208.method1352(1);
        class153.method1103(14664);
        class402.method2427(4096);
        class204.method1340(0);
        class218.method1381(8);
        class266.method1661(arg0 - 17379);
        class98.method759((byte) -115);
        class105.method789((byte) -110);
        class244.method1485();
        class82.method597();
        class393.method2364(false);
        class87.method684(arg0 - 17385);
        class43.method333(123);
        class142.method1038(2);
        class32.method278(2277);
        class300.method1870((byte) 55);
        class14.method188(-66);
        class448.method2621(3118);
        class138.method1018((byte) 87);
        class467.method2712(97);
        class134.method985((byte) -71);
        class375.method2226(false);
        class180.method1229(-127);
        class374.method2219(arg0 ^ 0x4446);
        class89.method692((byte) -103);
        class5.method17((byte) -31);
        class377.method2230(false);
        class430.method2540(-110);
        class276.method1721(1731503536);
        class206.method1348(true);
        class40.method321((byte) 121);
        class328.method2037(69);
        class30.method270((byte) 91);
        class247.method1492(arg0 - 17494);
        class435.method2562(-10894);
        class458.method2660(67);
        class176.method1202(34);
        class151.method1092((byte) 80);
        class450.method2625((byte) -122);
        class316.method1978(true);
        class445.method2609(false);
        class150.method1086(120);
        class286.method1771(-100);
        class197.method1295((byte) 35);
        class256.method1523(111);
        class301.method1873((byte) -122);
        class305.method1903(-28925);
        class179.method1226((byte) -103);
        class224.method1409((byte) 23);
        class15.method191((byte) -7);
        class222.method1404(true);
        class314.method1972((byte) -102);
        class42.method332(arg0 - 47821);
        class269.method1679(111);
        class8.method35((byte) -121);
        class470.method2785((byte) 125);
        class454.method2641(16622);
        class389.method2333(arg0 - 17592);
        class489.method2919((byte) 127);
        class181.method1236((byte) -111);
        class278.method1739(true);
        class140.method1025(-1319521660);
        class93.method733(85);
        class4.method15(-50);
        class510.method3010(-7489);
        class143.method1040(128);
        class312.method1966(0);
        class26.method258(true);
        class18.method208((byte) -92);
        class376.method2228(0);
        class373.method2217(8);
        class159.method1130(arg0 + 3719);
        class201.method1329((byte) 99);
        class174.method1194(true);
        class477.method2840(25015);
        class406.method2445(-109);
        class129.method948(8);
        class496.method2944(arg0 - 17485);
        class404.method2435((byte) 109);
        class516.method3054((byte) 126);
        class85.method677(arg0 ^ 0x4472);
        class519.method3070((byte) 98);
        class298.method1853(66);
        class60.method430(22100);
        class88.method688((byte) -36);
        class226.method1416(-19651);
        class370.method2209(-1526725172);
        class272.method1697(-338901424);
        class182.method1241((byte) -12);
        class492.method2936(true);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lgo;)Lff;", line = 1475)
    public static final class399 method3039(class310 arg0) {
        class399 var1 = (class399) class150.field2273.method3059(72, ((long) arg0.field4643 << 32) + (long) arg0.field4675);
        return var1 == null ? arg0.field4684 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1485)
    private final void method3040(byte arg0) {
        field7543++;
        if (class409.field6161 < class264.field3946.field4345) {
            class141.field2122.field3024 = !class141.field2122.field3024;
            class348.field5349 = (class264.field3946.field4345 - 1) * 5 * 50;
            if (class348.field5349 > 3000) {
                class348.field5349 = 3000;
            }
            if (class264.field3946.field4345 >= 2 && class264.field3946.field4346 == 6) {
                this.method2799(true, "js5connect_outofdate");
                class411.field6213 = 13;
                return;
            }
            if (class264.field3946.field4345 >= 4 && class264.field3946.field4346 == -1) {
                this.method2799(true, "js5crc");
                class411.field6213 = 13;
                return;
            }
            if (class264.field3946.field4345 >= 4 && class9.method36(arg0 - 4, class411.field6213)) {
                if (class264.field3946.field4346 == 7 || class264.field3946.field4346 == 9) {
                    this.method2799(true, "js5connect_full");
                } else if (class264.field3946.field4346 <= 0) {
                    this.method2799(true, "js5io");
                } else {
                    this.method2799(true, "js5connect");
                }
                class411.field6213 = 13;
                return;
            }
        }
        class409.field6161 = class264.field3946.field4345;
        if (arg0 != 2) {
            this.method3040((byte) -108);
        }
        if (class348.field5349 > 0) {
            class348.field5349--;
            return;
        }
        try {
            if (class88.field1380 == 0) {
                class336.field5192 = class25.field375.method832(class141.field2122.field3021, class141.field2122.method1356(arg0 ^ 0xFFFFFF83), 0);
                class88.field1380++;
            }
            if (class88.field1380 == 1) {
                if (class336.field5192.field7848 == 2) {
                    this.method3044(true, 1000);
                    return;
                }
                if (class336.field5192.field7848 == 1) {
                    class88.field1380++;
                }
            }
            if (class88.field1380 == 2) {
                class143.field2153 = new class83((Socket) class336.field5192.field7849, class25.field375);
                class468 var2 = new class468(5);
                var2.method2754(class445.field6550.field1866, arg0 ^ 0x15C4);
                var2.method2717(595, arg0 + 496598566);
                class143.field2153.method658(14812, 0, 5, var2.field6868);
                class88.field1380++;
                class269.field3995 = class381.method2281((byte) 104);
            }
            if (class88.field1380 == 3) {
                if (class9.method36(-2, class411.field6213) || class143.field2153.method668(arg0 ^ 0xFFFFFF9F) > 0) {
                    int var3 = class143.field2153.method662(arg0 - 2);
                    if (var3 != 0) {
                        this.method3044(true, var3);
                        return;
                    }
                    class88.field1380++;
                } else if ((class381.method2281((byte) 35) - class269.field3995) > 30000L) {
                    this.method3044(true, 1001);
                    return;
                }
            }
            if (class88.field1380 == 4) {
                boolean var4 = class411.field6213 == 1 || class119.method899(class411.field6213, -3) || class11.method106(class411.field6213, arg0 ^ 0xFFFFFFAC);
                class264.field3946.method1793(!var4, 107, class143.field2153);
                class336.field5192 = null;
                class143.field2153 = null;
                class88.field1380 = 0;
            }
        } catch (IOException var5) {
            this.method3044(true, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 1632)
    public static final void method3041(String arg0, int arg1, int arg2) {
        field7527++;
        class31.field442++;
        class97.method758(class384.field5796, false);
        class43.field559.method2754(class521.method3084(arg0, 63) + 1, 5574);
        if (arg1 != 95) {
            method3034(47);
        }
        class43.field559.method2754(arg2, arg1 ^ 0x1599);
        class43.field559.method2731(arg0, (byte) -76);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1649)
    public static final void method3042() {
        int var0 = class146.field2203;
        int[] var1 = class457.field6694;
        int var2 = class266.field3968 ? var0 : class519.field7609 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class400 var4;
            if (var3 < var0) {
                var4 = class83.field1327[var1[var3]];
            } else {
                var4 = class88.field1375[class327.field5114[var3 - var0]];
            }
            if (var4.field5995 >= 0) {
                int var5 = var4.method2419((byte) 115);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field7681 & 0x7F) == 0 && (var4.field7671 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field7681 & 0x7F) == 64 && (var4.field7671 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class480 && var4.field6058 != null && class86.field1350 >= var4.field6058.field5631 && class86.field1350 < var4.field6058.field5625) {
                    ((class480) var4).field7067 = false;
                }
                var4.field7689 = class50.method373(var4.field7686, 14966, var4.field7671, var4.field7681);
                class89.method691(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1693)
    private final void method3043(byte arg0) {
        field7547++;
        if (class411.field6213 == 6 && class130.field1926 == 0) {
            if (class89.field1392 > 1) {
                class89.field1392--;
                class486.field7240 = class264.field3939;
            }
            if (class219.field3135 > 0) {
                class219.field3135--;
            }
            if (!class495.field7350) {
                class275.method1717(114);
            }
            for (int var2 = 0; var2 < 100 && class496.method2946(true); var2++) {
            }
        }
        class469.field6876++;
        class299.method1858(-1, null, -1, false);
        class443.method2600(-1, false, -1, null);
        class434.method2559(64);
        class264.field3939++;
        for (int var3 = 0; var3 < 32768; var3++) {
            class351 var4 = class88.field1375[var3];
            if (var4 != null) {
                byte var5 = var4.field5409.field4175;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2419((byte) 102);
                    if ((var5 & 0x2) != 0 && var4.field6066 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field6065[0] + var7;
                            int var10 = var4.field6068[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class50.field640 - var6 - 1)) {
                                var9 = class50.field640 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class448.field6611 - var6 - 1 < var10) {
                                var10 = class448.field6611 - var6 - 1;
                            }
                            int var11 = class282.method1758(var6, var4.field6065[0], class476.field7013, 0, var10, class25.field373, -1, true, var6, var6, class151.field2300[var4.field7686], var4.field6068[0], 95, 0, var9);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field6065[var12] = class25.field373[var11 - var12 - 1];
                                    var4.field6068[var12] = class476.field7013[var11 - (var12 + 1)];
                                    var4.field6062[var12] = 1;
                                }
                                var4.field6066 = var11;
                            }
                        }
                    }
                    class16.method193(var4, (byte) -55, true);
                    int var13 = class302.method1878(var4, arg0 ^ 0x11);
                    class433.method2555(var13, class236.field3311, (byte) 125, var4, class350.field5387);
                    class231.method1435((byte) -75, var4);
                }
            }
        }
        if (class130.field1926 == 0 && class409.field6167 == 0) {
            if (class350.field5388 == 2) {
                class281.method1752(-613070045);
            } else {
                class104.method782(18326);
            }
            if ((class282.field4263 >> 7) < 14 || class50.field640 - 14 <= class282.field4263 >> 7 || class393.field5897 >> 7 < 14 || (class393.field5897 >> 7) >= (class448.field6611 - 14)) {
                class259.method1624((byte) 108);
            }
        }
        while (true) {
            class120 var14;
            class310 var15;
            class310 var16;
            do {
                var14 = (class120) class11.field113.method2951((byte) -95);
                if (var14 == null) {
                    while (true) {
                        class120 var17;
                        class310 var18;
                        class310 var19;
                        do {
                            var17 = (class120) class158.field2384.method2951((byte) -39);
                            if (var17 == null) {
                                while (true) {
                                    class120 var20;
                                    class310 var21;
                                    class310 var22;
                                    do {
                                        var20 = (class120) class478.field7041.method2951((byte) 112);
                                        if (var20 == null) {
                                            if (class251.field3435 != null) {
                                                class511.method3015(1);
                                            }
                                            if ((class86.field1350 % 1500) == 0) {
                                                class302.method1882((byte) 31);
                                            }
                                            if (class411.field6213 == 6 && class130.field1926 == 0) {
                                                class313.method1970(-16152);
                                            }
                                            class86.method679(20437);
                                            if (class274.field4089 && class65.field883 < (class381.method2281((byte) -117) - 60000L)) {
                                                class234.method1445(6);
                                            }
                                            for (class143 var23 = (class143) class328.field5126.method3089(31); var23 != null; var23 = (class143) class328.field5126.method3088((byte) -65)) {
                                                if (((long) var23.field2151) < (class381.method2281((byte) -120) / 1000L - 5L)) {
                                                    if (var23.field2155 > 0) {
                                                        class73.method515(127, 5, 0, "", var23.field2152 + class120.field1834.method2103(class30.field430, (byte) 34), "");
                                                    }
                                                    if (var23.field2155 == 0) {
                                                        class73.method515(127, 5, 0, "", var23.field2152 + class133.field1991.method2103(class30.field430, (byte) 34), "");
                                                    }
                                                    var23.method2096((byte) 84);
                                                }
                                            }
                                            if (arg0 != 17) {
                                                this.method3040((byte) 116);
                                            }
                                            if (class411.field6213 == 6 && class130.field1926 == 0) {
                                                if (class232.field3269 == null) {
                                                    class457.method2654(false, arg0 ^ 0x67);
                                                    return;
                                                }
                                                class163.field2427++;
                                                if (class163.field2427 > 50) {
                                                    class421.field6297++;
                                                    class97.method758(class406.field6109, false);
                                                }
                                                try {
                                                    if (class232.field3269 != null && class43.field559.field6830 > 0) {
                                                        class40.field526 += class43.field559.field6830;
                                                        class232.field3269.method658(14812, 0, class43.field559.field6830, class43.field559.field6868);
                                                        class163.field2427 = 0;
                                                        class43.field559.field6830 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class457.method2654(false, 124);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field1833;
                                        if (var21.field4675 < 0) {
                                            break;
                                        }
                                        var22 = class52.method386(0, var21.field4753);
                                    } while (var22 == null || var22.field4788 == null || var22.field4788.length <= var21.field4675 || var22.field4788[var21.field4675] != var21);
                                    class64.method449(var20);
                                }
                            }
                            var18 = var17.field1833;
                            if (var18.field4675 < 0) {
                                break;
                            }
                            var19 = class52.method386(0, var18.field4753);
                        } while (var19 == null || var19.field4788 == null || var18.field4675 >= var19.field4788.length || var19.field4788[var18.field4675] != var18);
                        class64.method449(var17);
                    }
                }
                var15 = var14.field1833;
                if (var15.field4675 < 0) {
                    break;
                }
                var16 = class52.method386(0, var15.field4753);
            } while (var16 == null || var16.field4788 == null || var15.field4675 >= var16.field4788.length || var16.field4788[var15.field4675] != var15);
            class64.method449(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V", line = 1986)
    private final void method3044(boolean arg0, int arg1) {
        class336.field5192 = null;
        class88.field1380 = 0;
        class264.field3946.field4346 = arg1;
        field7538++;
        class264.field3946.field4345++;
        if (!arg0) {
            field7532 = 0;
        }
        class143.field2153 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 2001)
    public static final void method3045(int arg0, int arg1) {
        field7546++;
        class506 var2 = class14.method185(-1304589728, arg0, 6);
        var2.method2986(69);
        int var3 = -93 % ((arg1 + 13) / 59);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lgo;IIIIIIIII)V", line = 2016)
    public static final void method3046(class310[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class310 var11 = arg0[var10];
            if (var11 != null && var11.field4753 == arg1) {
                int var12 = var11.field4671 + arg6;
                int var13 = var11.field4644 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field4703 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field4661 + var12;
                    int var19 = var11.field4736 + var13;
                    if (var11.field4703 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field4703 == 0 || var11.field4765 || method3039(var11).field5948 != 0 || class146.field2193 == var11 || class275.field4108 == var11.field4680) {
                    if (!method3031(var11)) {
                        if (class251.field3435 == var11) {
                            class53.field706 = true;
                            class15.field197 = var12;
                            class421.field6299 = var13;
                        }
                        if (var11.field4682 || var14 < var16 && var15 < var17) {
                            if (var11.field4776 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class120 var20 = (class120) class478.field7041.method2957(119); var20 != null; var20 = (class120) class478.field7041.method2947(45)) {
                                    if (var20.field1827) {
                                        var20.method876((byte) -96);
                                        var20.field1833.field4750 = false;
                                    }
                                }
                                if (class450.field6620 == 0) {
                                    class251.field3435 = null;
                                    class146.field2193 = null;
                                }
                                class9.field88 = 0;
                                class164.field2444 = false;
                                class444.field6525 = false;
                                if (!class495.field7350) {
                                    class275.method1717(59);
                                }
                            }
                            boolean var21;
                            if (class45.field591.method44((byte) 113) >= var14 && class45.field591.method54(28455) >= var15 && class45.field591.method44((byte) 70) < var16 && class45.field591.method54(28455) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class302.field4504 && var21) {
                                if (var11.field4743 >= 0) {
                                    class98.field1510 = var11.field4743;
                                } else if (var11.field4776) {
                                    class98.field1510 = -1;
                                }
                            }
                            if (!class495.field7350 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class333.method2057(1008, var11, arg8 - var12, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class45.field591.method48(false) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class376 var24 = (class376) class483.field7130.method2957(-95);
                            if (var24 != null && var24.method955((byte) -126) == 0 && var24.method952(25407) >= var14 && var24.method954(3) >= var15 && var24.method952(25407) < var16 && var24.method954(3) < var17) {
                                var23 = true;
                            }
                            if (var11.field4708 != null) {
                                for (int var25 = 0; var25 < var11.field4708.length; var25++) {
                                    if (class49.field630.method1879(var11.field4708[var25], true)) {
                                        if (var11.field4695 == null || class86.field1350 >= var11.field4695[var25]) {
                                            byte var26 = var11.field4697[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class49.field630.method1879(86, true) && !class49.field630.method1879(82, true) && !class49.field630.method1879(81, true)) && ((var26 & 0x2) == 0 || class49.field630.method1879(86, true)) && ((var26 & 0x1) == 0 || class49.field630.method1879(82, true)) && ((var26 & 0x4) == 0 || class49.field630.method1879(81, true))) {
                                                if (var25 < 10) {
                                                    class221.method1401(var11.field4643, "", -1, (byte) -115, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class312.method1967(-127);
                                                    class399 var27 = method3039(var11);
                                                    class195.method1290(var27.method2402(20992), var11, var27.field5961, (byte) -60);
                                                    class310.field4810 = class300.method1865(false, var11);
                                                    if (class310.field4810 == null) {
                                                        class310.field4810 = "Null";
                                                    }
                                                    class203.field2970 = var11.field4738 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field4667[var25];
                                                if (var11.field4695 == null) {
                                                    var11.field4695 = new int[var11.field4708.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field4695[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field4695[var25] = class86.field1350 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field4695 != null) {
                                        var11.field4695[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class283.method1762((byte) -28, var24.method954(3) - var13, var11, var24.method952(25407) - var12);
                            }
                            if (class251.field3435 != null && class251.field3435 != var11 && var21 && method3039(var11).method2401(15966)) {
                                class465.field6768 = var11;
                            }
                            if (class146.field2193 == var11) {
                                class197.field2892 = true;
                                class292.field4379 = var12;
                                class476.field7023 = var13;
                            }
                            if (var11.field4765 || var11.field4680 != 0) {
                                if (var21 && class384.field5794 != 0 && var11.field4724 != null) {
                                    class120 var29 = new class120();
                                    var29.field1827 = true;
                                    var29.field1833 = var11;
                                    var29.field1837 = class384.field5794;
                                    var29.field1832 = var11.field4724;
                                    class478.field7041.method2958(var29, (byte) 57);
                                }
                                if (class251.field3435 != null || class495.field7350 || class427.field6364 != var11.field4680 && class9.field88 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field4680 != 0) {
                                    if (class297.field4428 == var11.field4680 || class375.field5661 == var11.field4680) {
                                        class15.field198 = var11;
                                        if (class89.field1394 != null) {
                                            class89.field1394.method2379(class407.field6147, var11.field4736, true);
                                        }
                                        if (class297.field4428 == var11.field4680) {
                                            if (!class495.field7350 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class173.method1191(arg8, class407.field6147, arg9, false);
                                                for (class245 var30 = (class245) class410.field6199.method3089(-107); var30 != null; var30 = (class245) class410.field6199.method3088((byte) -65)) {
                                                    if (arg8 >= var30.field3395 && arg8 < var30.field3386 && arg9 >= var30.field3388 && arg9 < var30.field3389) {
                                                        class275.method1717(25);
                                                        class54.method401(4080, var30.field3392);
                                                    }
                                                }
                                            }
                                            class299.method1858(var13, var11, var12, false);
                                            continue;
                                        }
                                    }
                                    if (class275.field4108 == var11.field4680) {
                                        if (var11.method1940(true, class407.field6147) == null || class81.field1164 != 0 && class81.field1164 != 3 || class495.field7350 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field4639[var32];
                                        if (var31 < var33 || var31 > var11.field4669[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field4661 / 2;
                                        int var35 = var32 - var11.field4736 / 2;
                                        int var36;
                                        if (class350.field5388 == 4) {
                                            var36 = (int) class311.field4836 & 0x3FFF;
                                        } else {
                                            var36 = (int) class311.field4836 + class469.field6881 & 0x3FFF;
                                        }
                                        int var37 = class445.field6545[var36];
                                        int var38 = class445.field6544[var36];
                                        if (class350.field5388 != 4) {
                                            var37 = (class230.field3230 + 256) * var37 >> 8;
                                            var38 = (class230.field3230 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class350.field5388 == 4) {
                                            var41 = (class382.field5746 >> 7) + (var39 >> 2);
                                            var42 = (class444.field6528 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class410.field6198.method2419((byte) 114) - 1) * 64;
                                            var41 = (class410.field6198.field7681 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class410.field6198.field7671 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class302.field4504 && (class20.field303 & 0x40) != 0) {
                                            class310 var44 = class406.method2442((byte) -100, class327.field5118, class179.field2655);
                                            if (var44 == null) {
                                                class312.method1967(-125);
                                            } else {
                                                class393.method2363(var41, class310.field4810, class112.field1718, false, 0, var11.field4665, " ->", var42, 1L, true, 51);
                                            }
                                            continue;
                                        }
                                        if (class251.field3433 == class214.field3057) {
                                            class393.method2363(var41, class315.field4868.method2103(class30.field430, (byte) 34), -1, false, 0, -1, "", var42, 1L, true, 58);
                                        }
                                        class393.method2363(var41, class517.field7576, class213.field3045, false, 0, -1, "", var42, 1L, true, 4);
                                        continue;
                                    }
                                    if (class427.field6364 == var11.field4680) {
                                        class316.field4886 = var11;
                                        if (var21) {
                                            class164.field2444 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method952(25407) - var12 - var11.field4661 / 2) * 2.0D / (double) class137.field2026);
                                            int var46 = (int) (-((double) (var24.method954(3) - var13 - var11.field4736 / 2) * 2.0D / (double) class137.field2026));
                                            int var47 = class170.field2508 + var45 + class137.field2035;
                                            int var48 = class473.field6977 + var46 + class137.field2036;
                                            class149 var49 = class32.method279((byte) 121);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1082((byte) 80, var48, var47, var50);
                                            if (var50 != null) {
                                                if (class49.field630.method1879(82, true) && class234.field3291 > 0) {
                                                    class498.method2965(var50[0], -124, var50[2], var50[1]);
                                                    continue;
                                                }
                                                class444.field6525 = true;
                                                class264.field3942 = var50[0];
                                                class174.field2552 = var50[1];
                                                class346.field5335 = var50[2];
                                            }
                                            class9.field88 = 1;
                                            class93.field1447 = false;
                                            class65.field885 = class45.field591.method44((byte) 67);
                                            class508.field7470 = class45.field591.method54(28455);
                                            continue;
                                        }
                                        if (var22 && class9.field88 > 0) {
                                            if (class9.field88 == 1 && (class65.field885 != class45.field591.method44((byte) 94) || class508.field7470 != class45.field591.method54(28455))) {
                                                class112.field1705 = class170.field2508;
                                                class215.field3058 = class473.field6977;
                                                class9.field88 = 2;
                                            }
                                            if (class9.field88 == 2) {
                                                class93.field1447 = true;
                                                class339.method2073(class112.field1705 + (int) ((double) (class65.field885 - class45.field591.method44((byte) 77)) * 2.0D / (double) class137.field2023), 381);
                                                class30.method269((byte) -55, class215.field3058 - (int) ((double) (class508.field7470 - class45.field591.method54(28455)) * 2.0D / (double) class137.field2023));
                                            }
                                            continue;
                                        }
                                        if (class9.field88 > 0 && !class93.field1447) {
                                            if ((class301.field4483 == 1 || class61.method435(false)) && class448.field6610 > 2) {
                                                class111.method866((byte) -98, class508.field7470, class65.field885);
                                            } else if (class458.method2658((byte) 36)) {
                                                class111.method866((byte) -98, class508.field7470, class65.field885);
                                            }
                                        }
                                        class9.field88 = 0;
                                        continue;
                                    }
                                    if (class420.field6290 == var11.field4680) {
                                        if (var22) {
                                            class163.method1147(var11.field4661, 2, var11.field4736, class45.field591.method54(28455) - var13, class45.field591.method44((byte) 45) - var12);
                                        }
                                        continue;
                                    }
                                    if (class71.field960 == var11.field4680) {
                                        class443.method2600(var12, false, var13, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field4673 && var23) {
                                    var11.field4673 = true;
                                    if (var11.field4801 != null) {
                                        class120 var51 = new class120();
                                        var51.field1827 = true;
                                        var51.field1833 = var11;
                                        var51.field1826 = var24.method952(25407) - var12;
                                        var51.field1837 = var24.method954(3) - var13;
                                        var51.field1832 = var11.field4801;
                                        class478.field7041.method2958(var51, (byte) 53);
                                    }
                                }
                                if (var11.field4673 && var22 && var11.field4693 != null) {
                                    class120 var52 = new class120();
                                    var52.field1827 = true;
                                    var52.field1833 = var11;
                                    var52.field1826 = class45.field591.method44((byte) 101) - var12;
                                    var52.field1837 = class45.field591.method54(28455) - var13;
                                    var52.field1832 = var11.field4693;
                                    class478.field7041.method2958(var52, (byte) 108);
                                }
                                if (var11.field4673 && !var22) {
                                    var11.field4673 = false;
                                    if (var11.field4727 != null) {
                                        class120 var53 = new class120();
                                        var53.field1827 = true;
                                        var53.field1833 = var11;
                                        var53.field1826 = class45.field591.method44((byte) 101) - var12;
                                        var53.field1837 = class45.field591.method54(28455) - var13;
                                        var53.field1832 = var11.field4727;
                                        class158.field2384.method2958(var53, (byte) 38);
                                    }
                                }
                                if (var22 && var11.field4686 != null) {
                                    class120 var54 = new class120();
                                    var54.field1827 = true;
                                    var54.field1833 = var11;
                                    var54.field1826 = class45.field591.method44((byte) 125) - var12;
                                    var54.field1837 = class45.field591.method54(28455) - var13;
                                    var54.field1832 = var11.field4686;
                                    class478.field7041.method2958(var54, (byte) 84);
                                }
                                if (!var11.field4750 && var21) {
                                    var11.field4750 = true;
                                    if (var11.field4672 != null) {
                                        class120 var55 = new class120();
                                        var55.field1827 = true;
                                        var55.field1833 = var11;
                                        var55.field1826 = class45.field591.method44((byte) 91) - var12;
                                        var55.field1837 = class45.field591.method54(28455) - var13;
                                        var55.field1832 = var11.field4672;
                                        class478.field7041.method2958(var55, (byte) 87);
                                    }
                                }
                                if (var11.field4750 && var21 && var11.field4778 != null) {
                                    class120 var56 = new class120();
                                    var56.field1827 = true;
                                    var56.field1833 = var11;
                                    var56.field1826 = class45.field591.method44((byte) 113) - var12;
                                    var56.field1837 = class45.field591.method54(28455) - var13;
                                    var56.field1832 = var11.field4778;
                                    class478.field7041.method2958(var56, (byte) 66);
                                }
                                if (var11.field4750 && !var21) {
                                    var11.field4750 = false;
                                    if (var11.field4807 != null) {
                                        class120 var57 = new class120();
                                        var57.field1827 = true;
                                        var57.field1833 = var11;
                                        var57.field1826 = class45.field591.method44((byte) 108) - var12;
                                        var57.field1837 = class45.field591.method54(28455) - var13;
                                        var57.field1832 = var11.field4807;
                                        class158.field2384.method2958(var57, (byte) 30);
                                    }
                                }
                                if (var11.field4754 != null) {
                                    class120 var58 = new class120();
                                    var58.field1833 = var11;
                                    var58.field1832 = var11.field4754;
                                    class11.field113.method2958(var58, (byte) 30);
                                }
                                if (var11.field4795 != null && class286.field4291 > var11.field4745) {
                                    if (var11.field4668 == null || class286.field4291 - var11.field4745 > 32) {
                                        class120 var63 = new class120();
                                        var63.field1833 = var11;
                                        var63.field1832 = var11.field4795;
                                        class478.field7041.method2958(var63, (byte) 49);
                                    } else {
                                        label691: for (int var59 = var11.field4745; var59 < class286.field4291; var59++) {
                                            int var60 = class295.field4420[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field4668.length; var61++) {
                                                if (var11.field4668[var61] == var60) {
                                                    class120 var62 = new class120();
                                                    var62.field1833 = var11;
                                                    var62.field1832 = var11.field4795;
                                                    class478.field7041.method2958(var62, (byte) 109);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4745 = class286.field4291;
                                }
                                if (var11.field4744 != null && class411.field6215 > var11.field4709) {
                                    if (var11.field4808 == null || class411.field6215 - var11.field4709 > 32) {
                                        class120 var68 = new class120();
                                        var68.field1833 = var11;
                                        var68.field1832 = var11.field4744;
                                        class478.field7041.method2958(var68, (byte) 108);
                                    } else {
                                        label667: for (int var64 = var11.field4709; var64 < class411.field6215; var64++) {
                                            int var65 = class154.field2337[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field4808.length; var66++) {
                                                if (var11.field4808[var66] == var65) {
                                                    class120 var67 = new class120();
                                                    var67.field1833 = var11;
                                                    var67.field1832 = var11.field4744;
                                                    class478.field7041.method2958(var67, (byte) 58);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4709 = class411.field6215;
                                }
                                if (var11.field4649 != null && class174.field2545 > var11.field4687) {
                                    if (var11.field4770 == null || class174.field2545 - var11.field4687 > 32) {
                                        class120 var73 = new class120();
                                        var73.field1833 = var11;
                                        var73.field1832 = var11.field4649;
                                        class478.field7041.method2958(var73, (byte) 125);
                                    } else {
                                        label643: for (int var69 = var11.field4687; var69 < class174.field2545; var69++) {
                                            int var70 = class265.field3955[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field4770.length; var71++) {
                                                if (var11.field4770[var71] == var70) {
                                                    class120 var72 = new class120();
                                                    var72.field1833 = var11;
                                                    var72.field1832 = var11.field4649;
                                                    class478.field7041.method2958(var72, (byte) 44);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4687 = class174.field2545;
                                }
                                if (var11.field4780 != null && class96.field1496 > var11.field4715) {
                                    if (var11.field4793 == null || class96.field1496 - var11.field4715 > 32) {
                                        class120 var78 = new class120();
                                        var78.field1833 = var11;
                                        var78.field1832 = var11.field4780;
                                        class478.field7041.method2958(var78, (byte) 91);
                                    } else {
                                        label619: for (int var74 = var11.field4715; var74 < class96.field1496; var74++) {
                                            int var75 = class145.field2184[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field4793.length; var76++) {
                                                if (var11.field4793[var76] == var75) {
                                                    class120 var77 = new class120();
                                                    var77.field1833 = var11;
                                                    var77.field1832 = var11.field4780;
                                                    class478.field7041.method2958(var77, (byte) 45);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4715 = class96.field1496;
                                }
                                if (var11.field4721 != null && class128.field1918 > var11.field4784) {
                                    if (var11.field4642 == null || class128.field1918 - var11.field4784 > 32) {
                                        class120 var83 = new class120();
                                        var83.field1833 = var11;
                                        var83.field1832 = var11.field4721;
                                        class478.field7041.method2958(var83, (byte) 66);
                                    } else {
                                        label595: for (int var79 = var11.field4784; var79 < class128.field1918; var79++) {
                                            int var80 = class481.field7113[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field4642.length; var81++) {
                                                if (var11.field4642[var81] == var80) {
                                                    class120 var82 = new class120();
                                                    var82.field1833 = var11;
                                                    var82.field1832 = var11.field4721;
                                                    class478.field7041.method2958(var82, (byte) 93);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4784 = class128.field1918;
                                }
                                if (class306.field4572 > var11.field4707 && var11.field4692 != null) {
                                    class120 var84 = new class120();
                                    var84.field1833 = var11;
                                    var84.field1832 = var11.field4692;
                                    class478.field7041.method2958(var84, (byte) 80);
                                }
                                if (class231.field3248 > var11.field4707 && var11.field4746 != null) {
                                    class120 var85 = new class120();
                                    var85.field1833 = var11;
                                    var85.field1832 = var11.field4746;
                                    class478.field7041.method2958(var85, (byte) 95);
                                }
                                if (class19.field290 > var11.field4707 && var11.field4711 != null) {
                                    class120 var86 = new class120();
                                    var86.field1833 = var11;
                                    var86.field1832 = var11.field4711;
                                    class478.field7041.method2958(var86, (byte) 121);
                                }
                                if (class410.field6189 > var11.field4707 && var11.field4674 != null) {
                                    class120 var87 = new class120();
                                    var87.field1833 = var11;
                                    var87.field1832 = var11.field4674;
                                    class478.field7041.method2958(var87, (byte) 45);
                                }
                                if (class486.field7240 > var11.field4707 && var11.field4681 != null) {
                                    class120 var88 = new class120();
                                    var88.field1833 = var11;
                                    var88.field1832 = var11.field4681;
                                    class478.field7041.method2958(var88, (byte) 114);
                                }
                                var11.field4707 = class264.field3939;
                                if (var11.field4670 != null) {
                                    for (int var89 = 0; var89 < class56.field775; var89++) {
                                        class120 var90 = new class120();
                                        var90.field1833 = var11;
                                        var90.field1838 = class58.field800[var89].method209(true);
                                        var90.field1836 = class58.field800[var89].method203((byte) 116);
                                        var90.field1832 = var11.field4670;
                                        class478.field7041.method2958(var90, (byte) 46);
                                    }
                                }
                                if (class519.field7607 && var11.field4762 != null) {
                                    class120 var91 = new class120();
                                    var91.field1833 = var11;
                                    var91.field1832 = var11.field4762;
                                    class478.field7041.method2958(var91, (byte) 37);
                                }
                            }
                            if (var11.field4703 == 5 && var11.field4777 != -1) {
                                var11.method1944(class119.field1821, (byte) 103, class69.field925).method2379(class407.field6147, var11.field4736, true);
                            }
                            class113.method873(var11, -645);
                            if (var11.field4703 == 0) {
                                method3046(arg0, var11.field4643, var14, var15, var16, var17, var12 - var11.field4719, var13 - var11.field4645, arg8, arg9);
                                if (var11.field4788 != null) {
                                    method3046(var11.field4788, var11.field4643, var14, var15, var16, var17, var12 - var11.field4719, var13 - var11.field4645, arg8, arg9);
                                }
                                class313 var92 = (class313) class312.field4840.method3059(61, (long) var11.field4643);
                                if (var92 != null) {
                                    if (class488.field7276 == class251.field3433 && var92.field4851 == 0 && !class495.field7350 && var21 && !class418.field6270) {
                                        class275.method1717(17);
                                    }
                                    class462.method2677(var15, var12, arg9, var92.field4852, (byte) 125, var16, var14, var17, var13, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class113.method873(var11, -645);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2918)
    public static final void method3047() {
        int var0 = class146.field2203;
        int[] var1 = class457.field6694;
        boolean var2 = class454.field6661.field978 == 1 && var0 > 200 || class454.field6661.field978 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class480 var12 = class83.field1327[var1[var3]];
            if (var12.method2865(65535)) {
                var12.method402(9216);
                if (var12.field7687 >= 0 && var12.field7676 >= 0 && var12.field7683 < class50.field640 && var12.field7673 < class448.field6611) {
                    var12.field7067 = var12.field5979 ? var2 : false;
                    if (class410.field6198 == var12) {
                        var12.field5995 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field5981) {
                            var13++;
                        }
                        if (var12.field6014 > class86.field1350) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method2419((byte) 109) << 2);
                        if (var12.field7089) {
                            var14 += 512;
                        } else {
                            if (class342.field5263 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field5995 = var14 + 1;
                    }
                } else {
                    var12.field5995 = -1;
                }
            } else {
                var12.field5995 = -1;
            }
        }
        for (int var4 = 0; var4 < class519.field7609; var4++) {
            class351 var9 = class88.field1375[class327.field5114[var4]];
            if (var9.method2126(65535) && var9.field5409.method1727(-16826, class307.field4619)) {
                var9.method402(9216);
                if (var9.field7687 >= 0 && var9.field7676 >= 0 && var9.field7683 < class50.field640 && var9.field7673 < class448.field6611) {
                    int var10 = 0;
                    if (!var9.field5981) {
                        var10++;
                    }
                    if (var9.field6014 > class86.field1350) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method2419((byte) 110) << 2);
                    if (class342.field5263 == 0) {
                        if (var9.field5409.field4167) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class342.field5263 == 1) {
                        if (var9.field5409.field4167) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field5409.field4132) {
                        var11 += 1024;
                    } else if (!var9.field5409.field4143) {
                        var11 += 256;
                    }
                    var9.field5995 = var11 + 1;
                } else {
                    var9.field5995 = -1;
                }
            } else {
                var9.field5995 = -1;
            }
        }
        for (int var5 = 0; var5 < class390.field5874.length; var5++) {
            class427 var6 = class390.field5874[var5];
            if (var6 != null) {
                if (var6.field6358 == 1) {
                    class351 var7 = class88.field1375[var6.field6361];
                    if (var7 != null && var7.field5995 >= 0) {
                        var7.field5995 += 2048;
                    }
                } else if (var6.field6358 == 10) {
                    class480 var8 = class83.field1327[var6.field6361];
                    if (var8 != null && class410.field6198 != var8 && var8.field5995 >= 0) {
                        var8.field5995 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3081)
    private final void method3048(int arg0) {
        field7539++;
        if (class411.field6213 == 13) {
            return;
        }
        class86.field1350++;
        if ((class86.field1350 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class385.field5800 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class19.field292.setSeed((long) class385.field5800);
        }
        if (class86.field1350 % 50 == 0) {
            class4.field35 = class40.field526;
            class40.field526 = 0;
            class310.field4804 = class263.field3919;
            class263.field3919 = 0;
        }
        this.method3030(-12172);
        if (class37.field504 != null) {
            class37.field504.method349((byte) -89);
        }
        if (arg0 >= -21) {
            this.method3035(47);
        }
        class195.method1289(false);
        class49.field630.method1877(true);
        class45.field591.method53(-92);
        if (class508.field7465 != null) {
            int var3 = class508.field7465.method2663(-10497);
            class384.field5794 = var3;
        }
        if (class407.field6147 != null) {
            class407.field6147.method83((int) class381.method2281((byte) 29));
        }
        class327.method2033(-2);
        class56.field775 = 0;
        for (class18 var4 = class49.field630.method1881(false); var4 != null && class56.field775 < 128; var4 = class49.field630.method1881(false)) {
            if (var4.method201((byte) -80) != 1) {
                char var5 = var4.method203((byte) 127);
                if (!class125.method923((byte) -112) || !(var5 == '`' || var5 == '§')) {
                    class58.field800[class56.field775] = var4;
                    class56.field775++;
                } else if (class9.method39((byte) 111)) {
                    class235.method1447(107);
                } else {
                    class494.method2942(-117);
                }
            }
        }
        for (class376 var6 = class45.field591.method51((byte) 127); var6 != null; var6 = class45.field591.method51((byte) 102)) {
            int var7 = var6.method955((byte) -116);
            if (var7 == -1) {
                class81.field1192.method2958(var6, (byte) 49);
            } else if (class434.method2558(55, var7)) {
                class483.field7130.method2958(var6, (byte) 77);
            }
            if (class483.field7130.method2960(false) > 10) {
                class483.field7130.method2951((byte) -57);
            }
        }
        if (class9.method39((byte) 61)) {
            class328.method2038((byte) 22);
        }
        if (class411.field6213 == 0) {
            this.method3050(54);
            class103.method779(12592);
        } else if (class411.field6213 == 1) {
            this.method3050(54);
            class103.method779(12592);
        } else if (class26.method256(716, class411.field6213)) {
            class40.method322(64);
        }
        if (class119.method899(class411.field6213, -3) && !class26.method256(716, class411.field6213)) {
            this.method3043((byte) 17);
            class497.method2950(3);
            class75.method554(false);
        } else if (class11.method106(class411.field6213, -127) && !class26.method256(716, class411.field6213)) {
            this.method3043((byte) 17);
            class75.method554(false);
        } else if (class411.field6213 == 11) {
            class75.method554(false);
        } else if (class250.method1497(class411.field6213, 116) && !class26.method256(716, class411.field6213)) {
            class18.method205((byte) -10);
        } else if (class411.field6213 == 12) {
            class75.method554(false);
            if (class33.field455 != -3 && class33.field455 != 2 && class33.field455 != 15) {
                class457.method2654(false, 118);
            }
        }
        class126.method925(class407.field6147, (byte) 4);
        class483.field7130.method2951((byte) -65);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3235)
    public static final void method3049() {
        for (int var0 = 0; var0 < class50.field640; var0++) {
            int[] var1 = class211.field3041[var0];
            for (int var2 = 0; var2 < class448.field6611; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 3252)
    private final void method3050(int arg0) {
        field7544++;
        if (!class454.field6661.field977) {
            for (int var2 = 0; var2 < class56.field775; var2++) {
                if (class58.field800[var2].method203((byte) 50) == 's' || class58.field800[var2].method203((byte) 40) == 'S') {
                    class454.field6661.field977 = true;
                    break;
                }
            }
        }
        if (class20.field305 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class381.method2281((byte) 68);
            if (class7.field68 == 0L) {
                class7.field68 = var5;
            }
            if (var4 > 16384 && (var5 - class7.field68) < 5000L) {
                if (var5 - class236.field3309 > 1000L) {
                    System.gc();
                    class236.field3309 = var5;
                }
                class192.field2829 = class419.field6276.method2103(class30.field430, (byte) 34);
                class448.field6608 = 5;
            } else {
                class192.field2829 = class4.field38.method2103(class30.field430, (byte) 34);
                class20.field305 = 10;
                class448.field6608 = 5;
            }
        } else if (class20.field305 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class151.field2300[var7] = class256.method1524(-28193, class448.field6611, class50.field640);
            }
            class192.field2829 = class158.field2383.method2103(class30.field430, (byte) 34);
            class20.field305 = 20;
            class448.field6608 = 10;
        } else if (class20.field305 == 20) {
            if (class37.field504 == null) {
                class37.field504 = new class45(class264.field3946, class31.field445);
            }
            if (class37.field504.method351(8)) {
                class445.field6548 = class73.method516(1, 0, -1, false, true);
                class263.field3921 = class73.method516(1, 1, -1, false, true);
                class292.field4376 = class73.method516(1, 2, -1, false, true);
                class148.field2234 = class73.method516(1, 3, -1, false, true);
                class235.field3298 = class73.method516(1, 4, -1, false, true);
                class302.field4502 = class73.method516(1, 5, -1, true, true);
                class497.field7381 = class73.method516(1, 6, -1, true, false);
                class503.field7416 = class73.method516(1, 7, -1, false, true);
                class142.field2146 = class73.method516(1, 8, -1, false, true);
                class3.field30 = class73.method516(1, 9, -1, false, true);
                class180.field2662 = class73.method516(1, 10, -1, false, true);
                class71.field964 = class73.method516(1, 11, -1, false, true);
                class166.field2469 = class73.method516(1, 12, -1, false, true);
                class529.field7795 = class73.method516(1, 13, -1, false, true);
                class316.field4882 = class73.method516(1, 14, -1, false, false);
                class272.field4054 = class73.method516(1, 15, -1, false, true);
                class12.field122 = class73.method516(1, 16, -1, false, true);
                class7.field61 = class73.method516(1, 17, -1, false, true);
                class36.field499 = class73.method516(1, 18, -1, false, true);
                class509.field7486 = class73.method516(1, 19, -1, false, true);
                class303.field4519 = class73.method516(1, 20, -1, false, true);
                class488.field7279 = class73.method516(1, 21, -1, false, true);
                class495.field7353 = class73.method516(1, 22, -1, false, true);
                class307.field4602 = class73.method516(1, 23, -1, true, true);
                class411.field6205 = class73.method516(1, 24, -1, false, true);
                class382.field5743 = class73.method516(1, 25, -1, false, true);
                class97.field1504 = class73.method516(1, 26, -1, true, true);
                class154.field2333 = class73.method516(1, 27, -1, false, true);
                class422.field6304 = class73.method516(1, 28, -1, true, true);
                class509.field7485 = class73.method516(1, 29, -1, false, true);
                class192.field2829 = class34.field474.method2103(class30.field430, (byte) 34);
                class20.field305 = 30;
                class448.field6608 = 15;
            } else {
                class192.field2829 = class96.field1492.method2103(class30.field430, (byte) 34);
                class448.field6608 = 12;
            }
        } else if (class20.field305 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class112.field1717[var9].method2580(30892) * class390.field5867[var9] / 100;
            }
            if (var8 == 100) {
                class192.field2829 = class229.field3221.method2103(class30.field430, (byte) 34);
                class448.field6608 = 20;
                class257.method1528((byte) -70, class142.field2146);
                class229.method1424(-2663, class142.field2146);
                class20.field305 = 40;
            } else {
                if (var8 != 0) {
                    class192.field2829 = class247.field3401.method2103(class30.field430, (byte) 34) + var8 + "%";
                }
                class448.field6608 = 20;
            }
        } else if (class20.field305 == 40) {
            if (class422.field6304.method544(-1)) {
                this.method3051(-2, class422.field6304.method526(1, 1));
                class192.field2829 = class104.field1566.method2103(class30.field430, (byte) 34);
                class448.field6608 = 25;
                class20.field305 = 50;
            } else {
                class192.field2829 = class522.field7672.method2103(class30.field430, (byte) 34) + class422.field6304.method543((byte) 19) + "%";
                class448.field6608 = 25;
            }
        } else if (class20.field305 == 50) {
            class508.method3001(-18006);
            class192.field2829 = class350.field5381.method2103(class30.field430, (byte) 34);
            class448.field6608 = 30;
            class20.field305 = 60;
        } else if (class20.field305 == 60) {
            int var10 = class303.method1886(class142.field2146, (byte) -19, class529.field7795);
            int var11 = class132.method972(false);
            if (var11 > var10) {
                class192.field2829 = class60.field826.method2103(class30.field430, (byte) 34) + var10 * 100 / var11 + "%";
                class448.field6608 = 35;
            } else {
                class192.field2829 = class390.field5873.method2103(class30.field430, (byte) 34);
                class448.field6608 = 35;
                class20.field305 = 70;
            }
        } else if (class20.field305 == 70) {
            int var12 = class187.method1260(-902853748, class142.field2146);
            int var13 = class180.method1228(2);
            if (var13 > var12) {
                class192.field2829 = class298.field4434.method2103(class30.field430, (byte) 34) + var12 * 100 / var13 + "%";
                class448.field6608 = 40;
            } else {
                class192.field2829 = class234.field3293.method2103(class30.field430, (byte) 34);
                class448.field6608 = 40;
                class20.field305 = 80;
            }
        } else if (class20.field305 == 80) {
            if (class97.field1504.method544(-1)) {
                class274.field4096 = new class327(class97.field1504, class3.field30, class142.field2146);
                class192.field2829 = class210.field3029.method2103(class30.field430, (byte) 34);
                class448.field6608 = 45;
                class20.field305 = 90;
            } else {
                class192.field2829 = class376.field5671.method2103(class30.field430, (byte) 34) + class97.field1504.method543((byte) 32) + "%";
                class448.field6608 = 45;
            }
        } else if (class20.field305 == 90) {
            class192.field2829 = class241.field3356.method2103(class30.field430, (byte) 34);
            class20.field305 = 95;
            class448.field6608 = 50;
        } else {
            if (arg0 <= 48) {
                field7541 = null;
            }
            if (class20.field305 == 95) {
                if (class454.field6661.field977) {
                    class454.field6661.field993 = 0;
                    class454.field6661.field971 = 0;
                    class454.field6661.field999 = 0;
                    class454.field6661.field989 = 0;
                    class454.field6661.field970 = 1;
                }
                class454.field6661.field977 = true;
                class454.field6661.method1532(class25.field375, 2);
                class471.method2793(-7150, false, class454.field6661.field999);
                class192.field2829 = class11.field102.method2103(class30.field430, (byte) 34);
                class448.field6608 = 55;
                class20.field305 = 100;
            } else if (class20.field305 == 100) {
                class31.method273(class407.field6147, class142.field2146, -16, class529.field7795);
                class192.field2829 = class145.field2174.method2103(class30.field430, (byte) 34);
                class448.field6608 = 60;
                class526.method3137(1, 2270);
                class20.field305 = 110;
            } else if (class20.field305 == 110) {
                byte var14 = 0;
                class292.field4376.method544(-1);
                int var15 = var14 + class292.field4376.method543((byte) -26);
                class12.field122.method544(-1);
                int var16 = var15 + class12.field122.method543((byte) -117);
                class7.field61.method544(-1);
                int var17 = var16 + class7.field61.method543((byte) -2);
                class36.field499.method544(-1);
                int var18 = var17 + class36.field499.method543((byte) -118);
                class509.field7486.method544(-1);
                int var19 = var18 + class509.field7486.method543((byte) 49);
                class303.field4519.method544(-1);
                int var20 = var19 + class303.field4519.method543((byte) 85);
                class488.field7279.method544(-1);
                int var21 = var20 + class488.field7279.method543((byte) 71);
                class495.field7353.method544(-1);
                int var22 = var21 + class495.field7353.method543((byte) -123);
                class411.field6205.method544(-1);
                int var23 = var22 + class411.field6205.method543((byte) -128);
                class382.field5743.method544(-1);
                int var24 = var23 + class382.field5743.method543((byte) 69);
                class154.field2333.method544(-1);
                int var25 = var24 + class154.field2333.method543((byte) -12);
                class509.field7485.method544(-1);
                int var26 = var25 + class509.field7485.method543((byte) 34);
                if (var26 < 1200) {
                    class192.field2829 = class301.field4481.method2103(class30.field430, (byte) 34) + var26 / 12 + "%";
                    class448.field6608 = 65;
                } else {
                    class260.field3873 = new class462(class251.field3433, class30.field430, class292.field4376);
                    class159.field2391 = new class51(class251.field3433, class30.field430, class292.field4376);
                    class312.field4844 = new class146(class251.field3433, class30.field430, class292.field4376, class142.field2146);
                    class59.field817 = new class505(class251.field3433, class30.field430, class7.field61);
                    class59.field813 = new class529(class251.field3433, class30.field430, class292.field4376);
                    class293.field4386 = new class320(class251.field3433, class30.field430, class292.field4376);
                    class239.field3348 = new class59(class251.field3433, class30.field430, class292.field4376, class503.field7416);
                    class245.field3399 = new class436(class251.field3433, class30.field430, class292.field4376);
                    class25.field372 = new class225(class251.field3433, class30.field430, class292.field4376);
                    class119.field1824 = new class25(class251.field3433, class30.field430, true, class12.field122, class503.field7416);
                    class36.field497 = new class90(class251.field3433, class30.field430, class292.field4376, class142.field2146);
                    class274.field4086 = new class44(class251.field3433, class30.field430, class292.field4376, class142.field2146);
                    class373.field5641 = new class101(class251.field3433, class30.field430, true, class36.field499, class503.field7416);
                    class164.field2437 = new class281(class251.field3433, class30.field430, true, class260.field3873, class509.field7486, class503.field7416);
                    class526.field7776 = new class414(class251.field3433, class30.field430, class292.field4376);
                    class510.field7490 = new class80(class251.field3433, class30.field430, class303.field4519, class445.field6548, class263.field3921);
                    class69.field925 = new class291(class251.field3433, class30.field430, class292.field4376);
                    class119.field1821 = new class482(class251.field3433, class30.field430, class292.field4376);
                    class443.field6509 = new class325(class251.field3433, class30.field430, class488.field7279, class503.field7416);
                    class152.field2317 = new class236(class251.field3433, class30.field430, class292.field4376);
                    class11.field114 = new class309(class251.field3433, class30.field430, class292.field4376);
                    class27.field392 = new class295(class251.field3433, class30.field430, class292.field4376);
                    class41.field539 = new class422(class251.field3433, class30.field430, class495.field7353);
                    class233.field3279 = new class21(class251.field3433, class30.field430, class292.field4376);
                    class60.method433(class148.field2234, false, class503.field7416, class529.field7795, class142.field2146);
                    class157.method1118(class509.field7485, false);
                    class117.field1757 = new class265(class30.field430, class411.field6205, class382.field5743);
                    class40.field530 = new class231(class30.field430, class411.field6205, class382.field5743, new class77());
                    class192.field2829 = class99.field1519.method2103(class30.field430, (byte) 34);
                    class448.field6608 = 65;
                    class312.method1965(-115);
                    class119.field1824.method250(-1151, !class454.field6661.method1533(-1, class113.field1723));
                    class307.field4619 = new class141();
                    class169.method1174((byte) -111);
                    class419.method2495(class154.field2333, true);
                    class94.method738(class274.field4096, class503.field7416, false);
                    class20.field305 = 120;
                }
            } else if (class20.field305 == 120) {
                int var27 = class407.method2446((byte) -116, class142.field2146);
                int var28 = class159.method1128(-50);
                if (var27 < var28) {
                    class192.field2829 = class49.field629.method2103(class30.field430, (byte) 34) + var27 * 100 / var28 + "%";
                    class448.field6608 = 70;
                } else {
                    class179.method1221(class407.field6147, class142.field2146, 0);
                    class196.method1293(10, class279.field4217);
                    class192.field2829 = class147.field2221.method2103(class30.field430, (byte) 34);
                    class20.field305 = 130;
                    class448.field6608 = 70;
                }
            } else if (class20.field305 == 130) {
                if (class180.field2662.method523("", -126, "huffman")) {
                    class461 var29 = new class461(class180.field2662.method529(0, "", "huffman"));
                    class304.method1895(var29, (byte) -98);
                    class192.field2829 = class134.field2004.method2103(class30.field430, (byte) 34);
                    class448.field6608 = 75;
                    class20.field305 = 140;
                } else {
                    class192.field2829 = class30.field436.method2103(class30.field430, (byte) 34) + "0%";
                    class448.field6608 = 75;
                }
            } else if (class20.field305 == 140) {
                if (class148.field2234.method544(-1)) {
                    class192.field2829 = class140.field2112.method2103(class30.field430, (byte) 34);
                    class20.field305 = 150;
                    class448.field6608 = 80;
                } else {
                    class192.field2829 = class12.field117.method2103(class30.field430, (byte) 34) + class148.field2234.method543((byte) -123) + "%";
                    class448.field6608 = 80;
                }
            } else if (class20.field305 == 150) {
                if (class166.field2469.method544(-1)) {
                    class192.field2829 = class448.field6607.method2103(class30.field430, (byte) 34);
                    class448.field6608 = 82;
                    class20.field305 = 160;
                } else {
                    class192.field2829 = class473.field6963.method2103(class30.field430, (byte) 34) + class166.field2469.method543((byte) -127) + "%";
                    class448.field6608 = 82;
                }
            } else if (class20.field305 == 160) {
                if (class529.field7795.method544(-1)) {
                    class192.field2829 = class510.field7494.method2103(class30.field430, (byte) 34);
                    class20.field305 = 170;
                    class448.field6608 = 85;
                } else {
                    class192.field2829 = class510.field7494.method2103(class30.field430, (byte) 34) + class529.field7795.method543((byte) 14) + "%";
                    class448.field6608 = 85;
                }
            } else if (class20.field305 == 170) {
                if (class307.field4602.method525("details", 0)) {
                    class137.method1011(class307.field4602, class59.field813, class293.field4386, class119.field1824, class36.field497, class274.field4086, class307.field4619);
                    class192.field2829 = class36.field481.method2103(class30.field430, (byte) 34);
                    class20.field305 = 190;
                    class448.field6608 = 89;
                } else {
                    class192.field2829 = class264.field3944.method2103(class30.field430, (byte) 34) + class307.field4602.method540(0, "details") + "%";
                    class448.field6608 = 87;
                }
            } else if (class20.field305 == 190) {
                class359.field5515 = new String[class11.field114.field4636];
                class409.field6170 = new boolean[class27.field392.field4415];
                class466.field6795 = new int[class27.field392.field4415];
                for (int var30 = 0; var30 < class27.field392.field4415; var30++) {
                    if (class27.field392.method1838((byte) 24, var30).field6403 == 0) {
                        class409.field6170[var30] = true;
                        class477.field7040++;
                    }
                    class466.field6795[var30] = -1;
                }
                class419.method2496((byte) -11);
                class476.field7026 = class148.field2234.method539((byte) 27, "loginscreen");
                class100.field1525 = class148.field2234.method539((byte) 27, "lobbyscreen");
                class302.field4502.method518(true, -1, false);
                class497.field7381.method518(true, -1, true);
                class142.field2146.method518(true, -1, true);
                class529.field7795.method518(true, -1, true);
                class180.field2662.method518(true, -1, true);
                class148.field2234.method518(true, -1, true);
                class292.field4376.field1051 = 2;
                class56.field768 = true;
                class7.field61.field1051 = 2;
                class12.field122.field1051 = 2;
                class36.field499.field1051 = 2;
                class509.field7486.field1051 = 2;
                class303.field4519.field1051 = 2;
                class488.field7279.field1051 = 2;
                class295.method1837(class454.field6661.field970, 19, -1, false, -1);
                class192.field2829 = class465.field6775.method2103(class30.field430, (byte) 34);
                class448.field6608 = 95;
                class20.field305 = 200;
            } else if (class20.field305 == 200) {
                class526.method3137(2, 2270);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V", line = 3773)
    private final void method3051(int arg0, byte[] arg1) {
        field7537++;
        class468 var3 = new class468(arg1);
        if (arg0 != -2) {
            return;
        }
        while (true) {
            int var4;
            label47: do {
                while (true) {
                    while (true) {
                        var4 = var3.method2765(90);
                        if (var4 == 0) {
                            return;
                        }
                        if (var4 == 1) {
                            int[] var9 = class306.field4571 = new int[6];
                            var9[0] = var3.method2727((byte) 43);
                            var9[1] = var3.method2727((byte) 43);
                            var9[2] = var3.method2727((byte) 43);
                            var9[3] = var3.method2727((byte) 43);
                            var9[4] = var3.method2727((byte) 43);
                            var9[5] = var3.method2727((byte) 43);
                        } else {
                            if (var4 != 4) {
                                continue label47;
                            }
                            int var7 = var3.method2765(86);
                            class521.field7670 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                class521.field7670[var8] = var3.method2727((byte) 43);
                                if (class521.field7670[var8] == 65535) {
                                    class521.field7670[var8] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var4 != 5);
            int var5 = var3.method2765(57);
            class414.field6252 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class414.field6252[var6] = var3.method2727((byte) 43);
                if (class414.field6252[var6] == 65535) {
                    class414.field6252[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lgo;)Lgo;", line = 3852)
    public static final class310 method3052(class310 arg0) {
        int var1 = method3039(arg0).method2399((byte) -124);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class52.method386(0, arg0.field4753);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}
