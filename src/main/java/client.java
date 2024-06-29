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
public class client extends class305 {

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljw;")
    public static class581 field4580 = new class581(87, 8);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field4584;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Ljava/lang/Class;")
    public static Class field4583;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2024(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 5)
    public static final void method2006() {
        int var0 = class571.field7608;
        int[] var1 = class79.field1136;
        int var2 = class712.field9959.field1276.method1(75);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class73 var14 = class599.field8149[var1[var4]];
            if (!var14.method648(-1)) {
                var14.field1869 = -1;
            } else if (var14.field1039) {
                var14.field1869 = -1;
            } else {
                var14.method226(-125);
                if (var14.field4600 >= 0 && var14.field4590 >= 0 && var14.field4595 < class597.field8132 && var14.field4585 < class628.field8800) {
                    var14.field1037 = var14.field1826 ? var3 : false;
                    if (class551.field7456 == var14) {
                        var14.field1869 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field1823) {
                            var15++;
                        }
                        if (var14.field1852 > class100.field1401) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method655(-125) << 2);
                        if (var14.field1046 || var14.field1052) {
                            var16 += 512;
                        } else {
                            if (class549.field7447 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field1869 = var16 + 1;
                    }
                } else {
                    var14.field1869 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class688.field9678; var5++) {
            class192 var11 = ((class174) class234.field3169.method3953((long) class382.field5588[var5], 14)).field2336;
            if (var11.method1322(-1) && var11.field2577.method1455(class382.field5602, 162)) {
                var11.method226(-125);
                if (var11.field4600 >= 0 && var11.field4590 >= 0 && var11.field4595 < class597.field8132 && var11.field4585 < class628.field8800) {
                    int var12 = 0;
                    if (!var11.field1823) {
                        var12++;
                    }
                    if (var11.field1852 > class100.field1401) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method655(-126) << 2);
                    if (class549.field7447 == 0) {
                        if (var11.field2577.field2923) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class549.field7447 == 1) {
                        if (var11.field2577.field2923) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field2577.field2934) {
                        var13 += 1024;
                    } else if (!var11.field2577.field2929) {
                        var13 += 256;
                    }
                    var11.field1869 = var13 + 1;
                } else {
                    var11.field1869 = -1;
                }
            } else {
                var11.field1869 = -1;
            }
        }
        for (int var6 = 0; var6 < class581.field7771.length; var6++) {
            class553 var7 = class581.field7771[var6];
            if (var7 != null) {
                if (var7.field7465 == 1) {
                    class174 var8 = (class174) class234.field3169.method3953((long) var7.field7467, 14);
                    if (var8 != null) {
                        class192 var9 = var8.field2336;
                        if (var9.field1869 >= 0) {
                            var9.field1869 += 2048;
                        }
                    }
                } else if (var7.field7465 == 10) {
                    class73 var10 = class599.field8149[var7.field7467];
                    if (var10 != null && class551.field7456 != var10 && var10.field1869 >= 0) {
                        var10.field1869 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 176)
    private final void method2007(boolean arg0) {
        field4577++;
        if (class458.field6355 == 7 && !class217.method1433(-1)) {
            if (class385.field5623 > 1) {
                class706.field9907 = class194.field2598;
                class385.field5623--;
            }
            if (!class526.field7216) {
                class700.method3903(1024);
            }
            for (int var2 = 0; var2 < 100 && class24.method195((byte) 127); var2++) {
            }
        }
        class303.field4368++;
        class289.method1837(-1, -1, 55, null);
        class483.method2808(-1, -89, null, -1);
        class139.method1073(-1);
        class194.field2598++;
        for (int var3 = 0; var3 < class184.field2457; var3++) {
            class192 var4 = class495.field6850[var3].field2336;
            if (var4 != null) {
                byte var5 = var4.field2577.field2988;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method655(-125);
                    if ((var5 & 0x2) != 0 && var4.field1883 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field1890[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class597.field8132 - var6 - 1 < var9) {
                                var9 = class597.field8132 - var6 - 1;
                            }
                            int var10 = var4.field1884[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class628.field8800 - (var6 + 1)) < var10) {
                                var10 = class628.field8800 - var6 - 1;
                            }
                            int var11 = class62.method440(var10, var6, class30.field453, 0, true, var4.field1890[0], class261.field3872, var4.field1884[0], var6, -120, class514.field7038[var4.field2250], var6, var9, -1, 0);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field1890[var12] = class261.field3872[var11 - var12 - 1];
                                    var4.field1884[var12] = class30.field453[var11 - var12 - 1];
                                    var4.field1887[var12] = 1;
                                }
                                var4.field1883 = var11;
                            }
                        }
                    }
                    class124.method1012(!arg0, var4, true);
                    int var13 = class338.method2147(var4, -21);
                    class433.method2625(-102, var4);
                    class598.method3326((byte) 69, var13, var4, class232.field3166, class148.field2078);
                    class348.method2199(var4, class232.field3166, -25478);
                    class139.method1072(var4, -1);
                }
            }
        }
        if (!class217.method1433(-1) && class268.field3949 == 0) {
            if (class502.field6938 == 2) {
                class21.method165(105);
            } else {
                class306.method1939(3);
            }
            if ((class634.field8856 >> 9) < 14 || class597.field8132 - 14 <= class634.field8856 >> 9 || class350.field5138 >> 9 < 14 || class350.field5138 >> 9 >= class628.field8800 - 14) {
                class587.method3262((byte) -45);
            }
        }
        while (true) {
            class12 var14;
            class668 var15;
            class668 var16;
            do {
                var14 = (class12) class327.field4754.method2543(-15114);
                if (var14 == null) {
                    while (true) {
                        class12 var17;
                        class668 var18;
                        class668 var19;
                        do {
                            var17 = (class12) class553.field7471.method2543(-15114);
                            if (var17 == null) {
                                while (true) {
                                    class12 var20;
                                    class668 var21;
                                    class668 var22;
                                    do {
                                        var20 = (class12) class374.field5403.method2543(-15114);
                                        if (var20 == null) {
                                            if (class437.field6161 != null) {
                                                class601.method3341(-126);
                                            }
                                            if ((class100.field1401 % 1500) == 0) {
                                                class150.method1118(0);
                                            }
                                            if (class458.field6355 == 7 && !class217.method1433(-1)) {
                                                class195.method1342(2);
                                            }
                                            class357.method2244(8775);
                                            if (class79.field1138 && (class302.method1910(0) - 60000L) > class790.field10868) {
                                                class454.method2696((byte) 9);
                                            }
                                            for (class565 var23 = (class565) class596.field8125.method109(0); var23 != null; var23 = (class565) class596.field8125.method115((byte) -102)) {
                                                if ((long) var23.field7563 < class302.method1910(0) / 1000L - 5L) {
                                                    if (var23.field7566 > 0) {
                                                        class746.method4129(5, "", "", var23.field7564 + class474.field6558.method2780(105, class38.field589), 0, "", 16773);
                                                    }
                                                    if (var23.field7566 == 0) {
                                                        class746.method4129(5, "", "", var23.field7564 + class474.field6559.method2780(116, class38.field589), 0, "", 16773);
                                                    }
                                                    var23.method2922((byte) -94);
                                                }
                                            }
                                            if (arg0) {
                                                field4580 = null;
                                            }
                                            if (class458.field6355 == 7 && !class217.method1433(-1)) {
                                                if (class457.field6340 == null) {
                                                    class631.method3541(86, false);
                                                    return;
                                                }
                                                class88.field1232++;
                                                if (class88.field1232 > 50) {
                                                    class359.field5251++;
                                                    class267 var24 = class545.method3099((byte) 99, class269.field3966, class393.field5802);
                                                    class617.method3392(var24, !arg0);
                                                }
                                                try {
                                                    class101.method793((byte) -60);
                                                    return;
                                                } catch (IOException var25) {
                                                    class631.method3541(65, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field190;
                                        if (var21.field9318 < 0) {
                                            break;
                                        }
                                        var22 = class536.method3067(var21.field9336, 0);
                                    } while (var22 == null || var22.field9289 == null || var21.field9318 >= var22.field9289.length || var22.field9289[var21.field9318] != var21);
                                    class173.method1235(var20);
                                }
                            }
                            var18 = var17.field190;
                            if (var18.field9318 < 0) {
                                break;
                            }
                            var19 = class536.method3067(var18.field9336, 0);
                        } while (var19 == null || var19.field9289 == null || var18.field9318 >= var19.field9289.length || var19.field9289[var18.field9318] != var18);
                        class173.method1235(var17);
                    }
                }
                var15 = var14.field190;
                if (var15.field9318 < 0) {
                    break;
                }
                var16 = class536.method3067(var15.field9336, 0);
            } while (var16 == null || var16.field9289 == null || var16.field9289.length <= var15.field9318 || var16.field9289[var15.field9318] != var15);
            class173.method1235(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lor;)Z", line = 459)
    public static final boolean method2008(class668 arg0) {
        if (class688.field9683) {
            if (method2022(arg0).field1521 != 0) {
                return false;
            }
            if (arg0.field9353 == 0) {
                return false;
            }
        }
        return arg0.field9265;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 475)
    public static final void method2009() {
        for (int var0 = 0; var0 < class597.field8132; var0++) {
            int[] var1 = class249.field3688[var0];
            for (int var2 = 0; var2 < class628.field8800; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 493)
    private final void method2010(int arg0) {
        field4579++;
        if (class647.field8984.field7845 > class730.field10125) {
            class369.field5359.method680(43594);
            class500.field6903 = (class647.field8984.field7845 * 50 - 50) * 5;
            if (class500.field6903 > 3000) {
                class500.field6903 = 3000;
            }
            if (class647.field8984.field7845 >= 2 && class647.field8984.field7844 == 6) {
                this.method1937(-109, "js5connect_outofdate");
                class458.field6355 = 14;
                return;
            }
            if (class647.field8984.field7845 >= 4 && class647.field8984.field7844 == -1) {
                this.method1937(-109, "js5crc");
                class458.field6355 = 14;
                return;
            }
            if (class647.field8984.field7845 >= 4 && class290.method1838(true, class458.field6355)) {
                if (class647.field8984.field7844 == 7 || class647.field8984.field7844 == 9) {
                    this.method1937(-119, "js5connect_full");
                } else if (class647.field8984.field7844 <= 0) {
                    this.method1937(-120, "js5io");
                } else if (class467.field6471 == null) {
                    this.method1937(-93, "js5connect");
                } else {
                    this.method1937(-91, "js5proxy_" + class467.field6471.trim());
                }
                class458.field6355 = 14;
                return;
            }
        }
        int var2 = 51 % ((arg0 - 62) / 35);
        class730.field10125 = class647.field8984.field7845;
        if (class500.field6903 > 0) {
            class500.field6903--;
            return;
        }
        try {
            if (class129.field1928 == 0) {
                class272.field4015 = class369.field5359.method677((byte) 104, class730.field10124);
                class129.field1928++;
            }
            if (class129.field1928 == 1) {
                if (class272.field4015.field8321 == 2) {
                    if (class272.field4015.field8318 != null) {
                        class467.field6471 = (String) class272.field4015.field8318;
                    }
                    this.method2023(1000, 7);
                    return;
                }
                if (class272.field4015.field8321 == 1) {
                    class129.field1928++;
                }
            }
            if (class129.field1928 == 2) {
                class493.field6831 = new class18((Socket) class272.field4015.field8318, class730.field10124, 25000);
                class376 var3 = new class376(5);
                var3.method2380(65280, class628.field8787.field4282);
                var3.method2354(649, (byte) 103);
                class493.field6831.method142(5, var3.field5518, 0, 0);
                class129.field1928++;
                class743.field10248 = class302.method1910(0);
            }
            if (class129.field1928 == 3) {
                if (class290.method1838(true, class458.field6355) || class493.field6831.method148((byte) 33) > 0) {
                    int var4 = class493.field6831.method143((byte) 87);
                    if (var4 != 0) {
                        this.method2023(var4, 7);
                        return;
                    }
                    class129.field1928++;
                } else if ((class302.method1910(0) - class743.field10248) > 30000L) {
                    this.method2023(1001, 7);
                    return;
                }
            }
            if (class129.field1928 == 4) {
                boolean var5 = class290.method1838(true, class458.field6355) || class71.method631(class458.field6355, (byte) 89) || class779.method4306(class458.field6355, 122);
                class273[] var6 = class273.method1773(1);
                class376 var7 = new class376(var6.length * 4);
                class493.field6831.method141(0, 233224196, var7.field5518.length, var7.field5518);
                for (int var8 = 0; var8 < var6.length; var8++) {
                    var6[var8].method1778(-119, var7.method2384(82));
                }
                class647.field8984.method3267(class493.field6831, (byte) 88, !var5);
                class272.field4015 = null;
                class129.field1928 = 0;
                class493.field6831 = null;
            }
        } catch (IOException var9) {
            this.method2023(1002, 7);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 659)
    public final void init() {
        field4570++;
        if (!this.method1931((byte) -114)) {
            return;
        }
        class370.field5372 = new class80();
        class370.field5372.field1148 = Integer.parseInt(this.getParameter("worldid"));
        class691.field9698 = new class80();
        class691.field9698.field1148 = Integer.parseInt(this.getParameter("lobbyid"));
        class691.field9698.field1141 = this.getParameter("lobbyaddress");
        class235.field3190 = new class80();
        class235.field3190.field1148 = Integer.parseInt(this.getParameter("demoid"));
        class235.field3190.field1141 = this.getParameter("demoaddress");
        class731.field10141 = class73.method645((byte) 106, Integer.parseInt(this.getParameter("modewhere")));
        if (class731.field10141 == class324.field4724) {
            class731.field10141 = class165.field2232;
        } else if (!class518.method3000(class731.field10141, -12764) && class731.field10141 != class197.field2634) {
            class731.field10141 = class197.field2634;
        }
        class403.field5855 = class740.method4098(-111, Integer.parseInt(this.getParameter("modewhat")));
        if (class432.field6132 != class403.field5855 && class403.field5855 != class357.field5223 && class632.field8826 != class403.field5855) {
            class403.field5855 = class632.field8826;
        }
        try {
            class38.field589 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var15) {
            class38.field589 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class588.field7849 = true;
        } else {
            class588.field7849 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class299.field4335 = true;
        } else {
            class299.field4335 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class468.field6494 = true;
        } else {
            class468.field6494 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class21.field332 = class380.field5545;
            } else if (var4.equals("1")) {
                class21.field332 = class180.field2393;
            } else if (var4.equals("2")) {
                class21.field332 = class564.field7559;
            } else if (var4.equals("3")) {
                class21.field332 = class176.field2341;
            }
        }
        try {
            class444.field6231 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var14) {
            class444.field6231 = 0;
        }
        class189.field2518 = this.getParameter("quiturl");
        class251.field3720 = this.getParameter("settings");
        if (class251.field3720 == null) {
            class251.field3720 = "";
        }
        class497.field6866 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class500.field6907 = Integer.parseInt(var5);
            } catch (Exception var13) {
                class500.field6907 = 0;
            }
        }
        class184.field2461 = Integer.parseInt(this.getParameter("colourid"));
        if (class184.field2461 < 0 || class184.field2461 >= class407.field5888.length) {
            class184.field2461 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class669.field9419 = true;
            class238.field3212 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class662.field9151 = true;
        }
        String var7 = this.getParameter("sskey");
        class570.field7586 = class418.method2582(-25417, class165.method1194(var7, 97));
        if (class570.field7586.length < 16) {
            class570.field7586 = null;
        }
        String var8 = this.getParameter("force64mb");
        if (var8 != null && var8.equals("true")) {
            class733.field10172 = true;
        }
        String var9 = this.getParameter("worldflags");
        if (var9 != null) {
            try {
                class695.field9739 = Integer.parseInt(var9);
            } catch (Exception var12) {
            }
        }
        String var10 = this.getParameter("userFlow");
        if (var10 != null) {
            try {
                class287.field4232 = Long.parseLong(var10);
            } catch (NumberFormatException var11) {
            }
        }
        class609.field8288 = this.getParameter("additionalInfo");
        if (class609.field8288 != null && class609.field8288.length() > 50) {
            class609.field8288 = null;
        }
        class627.field8774 = this;
        if (class380.field5545 == class21.field332) {
            class710.field9945 = 503;
            class124.field1786 = 765;
        } else if (class21.field332 == class180.field2393) {
            class710.field9945 = 480;
            class124.field1786 = 640;
        }
        this.method1926(class124.field1786, class21.field332.field4209, 649, class403.field5855.method3836(false) + 32, 37, class710.field9945, false);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 831)
    public static final void method2011(int arg0) {
        int var1 = class571.field7608;
        int[] var2 = class79.field1136;
        int var3 = class6.field55 ? var1 : class688.field9678 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class124 var5;
            if (var4 < var1) {
                var5 = class599.field8149[var2[var4]];
            } else {
                var5 = ((class174) class234.field3169.method3953((long) class382.field5588[var4 - var1], 14)).field2336;
            }
            if (var5.field2250 == arg0) {
                var5.field1821 = 0;
                if (var5.field1869 < 0) {
                    var5.field1823 = false;
                } else {
                    int var6 = var5.method655(-128);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field2257 & 0x1FF) != 0 || (var5.field2259 & 0x1FF) != 0) {
                            var5.field1823 = false;
                            continue;
                        }
                    } else if ((var5.field2257 & 0x1FF) != 256 || (var5.field2259 & 0x1FF) != 256) {
                        var5.field1823 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field2257 >> 9;
                        int var8 = var5.field2259 >> 9;
                        if (class249.field3688[var7][var8] != var5.field1869) {
                            var5.field1823 = true;
                            continue;
                        }
                        if (class72.field1010[var7][var8] > 1) {
                            var10002 = class72.field1010[var7][var8]--;
                            var5.field1823 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field2257 - var9 >> 9;
                        int var11 = var5.field2259 - var9 >> 9;
                        int var12 = var5.field2257 + var9 >> 9;
                        int var13 = var5.field2259 + var9 >> 9;
                        if (!class197.method1349(var13, var10, var11, 7, var5.field1869, var12)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class249.field3688[var14][var15] == var5.field1869) {
                                        var10002 = class72.field1010[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1823 = true;
                            continue;
                        }
                    }
                    var5.field1823 = false;
                    var5.field2246 = class783.method4338(var5.field2250, var5.field2257, -12040, var5.field2259);
                    class356.method2242(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Z", line = 946)
    public static final boolean method2012(int arg0) {
        field4568++;
        int var1 = 94 % ((44 - arg0) / 62);
        boolean var2 = true;
        if (class660.field9130 == null) {
            if (class643.field8927.method2104(95, class482.field6668)) {
                class660.field9130 = class508.method2947(class643.field8927, class482.field6668);
            } else {
                var2 = false;
            }
        }
        if (class37.field576 == null) {
            if (class643.field8927.method2104(82, class288.field4234)) {
                class37.field576 = class508.method2947(class643.field8927, class288.field4234);
            } else {
                var2 = false;
            }
        }
        if (class488.field6756 == null) {
            if (class643.field8927.method2104(65, class598.field8148)) {
                class488.field6756 = class508.method2947(class643.field8927, class598.field8148);
            } else {
                var2 = false;
            }
        }
        if (class500.field6899 == null) {
            if (class781.field10716.method2104(-122, class579.field7761)) {
                class500.field6899 = class194.method1335(class781.field10716, -5707, class579.field7761);
            } else {
                var2 = false;
            }
        }
        if (class341.field4928 == null) {
            if (class643.field8927.method2104(43, class579.field7761)) {
                class341.field4928 = class508.method2943(class643.field8927, class579.field7761);
            } else {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1017)
    public final void method1933(int arg0) {
        if (arg0 != -23014) {
            this.method2018(51);
        }
        if (class733.field10172) {
            class396.field5817 = 64;
        }
        field4574++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class133.method1055(2445);
        class53.field758 = new class458(class730.field10124);
        class647.field8984 = new class587();
        class611.method3380(true, new int[] { 1000, 100 }, new int[] { 20, 260 });
        if (class731.field10141 != class197.field2634) {
            class581.field7768 = new byte[50][];
        }
        class712.field9959 = class701.method3907(0);
        if (class731.field10141 == class197.field2634) {
            class370.field5372.field1141 = this.getCodeBase().getHost();
        } else if (class518.method3000(class731.field10141, -12764)) {
            class370.field5372.field1141 = this.getCodeBase().getHost();
            class370.field5372.field1139 = class370.field5372.field1148 + 40000;
            class691.field9698.field1139 = class691.field9698.field1148 + 40000;
            class235.field3190.field1139 = class235.field3190.field1148 + 40000;
            class370.field5372.field1143 = class370.field5372.field1148 + 50000;
            class691.field9698.field1143 = class691.field9698.field1148 + 50000;
            class235.field3190.field1143 = class235.field3190.field1148 + 50000;
        } else if (class731.field10141 == class324.field4724) {
            class370.field5372.field1141 = "127.0.0.1";
            class691.field9698.field1141 = "127.0.0.1";
            class235.field3190.field1141 = "127.0.0.1";
            class370.field5372.field1139 = class370.field5372.field1148 + 40000;
            class691.field9698.field1139 = class691.field9698.field1148 + 40000;
            class235.field3190.field1139 = class235.field3190.field1148 + 40000;
            class370.field5372.field1143 = class370.field5372.field1148 + 50000;
            class691.field9698.field1143 = class691.field9698.field1148 + 50000;
            class235.field3190.field1143 = class235.field3190.field1148 + 50000;
        }
        class659.field9120 = class555.field7486 = class206.field2690 = class735.field10184 = new short[256];
        class369.field5359 = class370.field5372;
        if (class21.field332 == class180.field2393) {
            class730.field10129 = 0;
            class672.field9457 = true;
            class382.field5572 = 16777215;
            class320.field4615 = class745.field10288;
            class183.field2454 = class332.field4787;
        } else if (class21.field332 == class176.field2341) {
            class320.field4615 = class13.field197;
            class183.field2454 = class2.field6;
        } else {
            class183.field2454 = class601.field8173;
            class320.field4615 = class500.field6900;
        }
        if (class380.field5545 == class21.field332) {
            class290.field4244 = false;
        }
        try {
            class599.field8153 = class627.field8774.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class469.field6507 = class631.method3540((byte) 24, class706.field9894);
        class304.field4371 = class491.method2853(true, class706.field9894, arg0 ^ 0x59D8);
        try {
            if (class730.field10124.field988 != null) {
                class741.field10224 = new class22(class730.field10124.field988, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class347.field5086[var3] = new class22(class730.field10124.field1002[var3], 6000, 0);
                }
                class648.field8997 = new class22(class730.field10124.field990, 6000, 0);
                class722.field10057 = new class364(255, class741.field10224, class648.field8997, 500000);
                class365.field5320 = new class22(class730.field10124.field1000, 24, 0);
                class730.field10124.field1002 = null;
                class730.field10124.field1000 = null;
                class730.field10124.field988 = null;
                class730.field10124.field990 = null;
            }
        } catch (IOException var5) {
            class722.field10057 = null;
            class741.field10224 = null;
            class365.field5320 = null;
            class648.field8997 = null;
        }
        if (class731.field10141 != class197.field2634) {
            class605.field8216 = true;
        }
        class213.field2816 = class474.field6551.method2780(109, class38.field589);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1142)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class298.method1891("Argument count", (byte) -72);
            }
            class370.field5372 = new class80();
            class370.field5372.field1148 = Integer.parseInt(arg0[0]);
            class691.field9698 = new class80();
            class691.field9698.field1148 = Integer.parseInt(arg0[1]);
            class235.field3190 = new class80();
            class235.field3190.field1148 = Integer.parseInt(arg0[2]);
            class731.field10141 = class324.field4724;
            if (arg0[3].equals("live")) {
                class403.field5855 = class632.field8826;
            } else if (arg0[3].equals("rc")) {
                class403.field5855 = class357.field5223;
            } else if (arg0[3].equals("wip")) {
                class403.field5855 = class432.field6132;
            } else {
                class298.method1891("modewhat", (byte) -82);
            }
            class38.field589 = class370.method2303(arg0[4], -1);
            if (class38.field589 == -1) {
                if (arg0[4].equals("english")) {
                    class38.field589 = 0;
                } else if (arg0[4].equals("german")) {
                    class38.field589 = 1;
                } else {
                    class298.method1891("language", (byte) -88);
                }
            }
            class588.field7849 = false;
            class299.field4335 = false;
            if (arg0[5].equals("game0")) {
                class21.field332 = class380.field5545;
            } else if (arg0[5].equals("game1")) {
                class21.field332 = class180.field2393;
            } else if (arg0[5].equals("game2")) {
                class21.field332 = class564.field7559;
            } else if (arg0[5].equals("game3")) {
                class21.field332 = class176.field2341;
            } else {
                class298.method1891("game", (byte) -58);
            }
            class251.field3720 = "";
            class184.field2461 = class21.field332.field4207;
            class695.field9739 = 0;
            class500.field6907 = 0;
            class609.field8288 = null;
            class570.field7586 = null;
            class669.field9419 = true;
            class238.field3212 = true;
            class733.field10172 = false;
            class662.field9151 = false;
            class444.field6231 = 0;
            class287.field4232 = 0L;
            client var1 = new client();
            class627.field8774 = var1;
            var1.method1918(0, 649, 768, 37, class403.field5855.method3836(false) + 32, class21.field332.field4209, false, 1024);
            class388.field5642.setLocation(40, 40);
        } catch (Exception var3) {
            class664.method3681((byte) 126, null, var3);
        }
        field4581++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;", line = 1228)
    public final String method1919(int arg0) {
        field4569++;
        String var2 = null;
        try {
            var2 = "[1)" + class121.field1765 + "," + class230.field3147 + "," + class597.field8132 + "," + class628.field8800 + "|";
            if (class551.field7456 != null) {
                var2 = var2 + "2)" + class610.field8296 + "," + (class551.field7456.field1890[0] + class121.field1765) + "," + (class551.field7456.field1884[0] + class230.field3147) + "|";
            }
            var2 = var2 + "3)" + class712.field9959.field1270.method4293(62) + "|4)" + class712.field9959.field1300.method2880(120) + "|5)" + class485.method2816(-117) + "|6)" + class593.field8019 + "," + class140.field2048 + "|";
            if (arg0 <= 29) {
                field4580 = null;
            }
            var2 = var2 + "7)" + class712.field9959.field1288.method3327(5) + "|";
            var2 = var2 + "8)" + class712.field9959.field1319.method2854(92) + "|";
            var2 = var2 + "9)" + class712.field9959.field1322.method1363(28) + "|";
            var2 = var2 + "10)" + class712.field9959.field1307.method1209(98) + "|";
            var2 = var2 + "11)" + class712.field9959.field1312.method2681(75) + "|";
            var2 = var2 + "12)" + class712.field9959.field1320.method4251(88) + "|";
            var2 = var2 + "13)" + class396.field5817 + "|";
            var2 = var2 + "14)" + class458.field6355;
            if (class693.field9717 != null) {
                var2 = var2 + "|15)" + class693.field9717.field550;
            }
            try {
                if (class712.field9959.field1270.method4293(90) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4583 == null ? (field4583 = method2024("client")) : field4583).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
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

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 1310)
    private final void method2013(boolean arg0) {
        field4572++;
        if (class458.field6355 == 14) {
            return;
        }
        long var2 = class713.method3985(1727) / 1000000L - class500.field6901;
        class500.field6901 = class713.method3985(1727) / 1000000L;
        boolean var4 = class586.method3261(!arg0);
        if (var4 && class645.field8963 && class558.field7520 != null) {
            class558.field7520.method1261(-13368);
        }
        if (class16.method122(-44, class458.field6355)) {
            if (class5.field50 != 0L && class302.method1910(0) > class5.field50) {
                class142.method1090(class444.field6235, -352753888, class485.method2816(-88), class295.field4286, false);
            } else if (!class379.field5542.method535() && class303.field4367) {
                class342.method2175(7349);
            }
        }
        if (class632.field8832 == null) {
            Container var5;
            if (class388.field5642 != null) {
                var5 = class388.field5642;
            } else if (class735.field10183 == null) {
                var5 = class189.field2512;
            } else {
                var5 = class735.field10183;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class388.field5642 == var5) {
                Insets var8 = class388.field5642.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class482.field6666 != var6 || class655.field9076 != var7 || class92.field1310) {
                if (class379.field5542 == null || class379.field5542.method501()) {
                    class133.method1055(2445);
                } else {
                    class482.field6666 = var6;
                    class655.field9076 = var7;
                }
                class5.field50 = class302.method1910(0) + 500L;
                class92.field1310 = false;
            }
        }
        if (class632.field8832 != null && !class59.field807 && class16.method122(-62, class458.field6355)) {
            class142.method1090(-1, -352753888, class712.field9959.field1277.method1299(113), -1, false);
        }
        boolean var9 = arg0;
        if (class237.field3206) {
            class237.field3206 = false;
            var9 = true;
        }
        if (var9) {
            class59.method415(true);
        }
        if (class379.field5542 != null && class379.field5542.method535() || class485.method2816(-100) != 1) {
            class229.method1502(0);
        }
        if (class290.method1838(true, class458.field6355)) {
            class338.method2149(0, var9);
        } else if (class697.method3849(class458.field6355, (byte) -49)) {
            class97.method762(-343);
        } else if (class523.method3017(class458.field6355, 83)) {
            class97.method762(-343);
        } else if (class355.method2239(class458.field6355, -31175)) {
            if (class256.field3835 == 1) {
                if (class405.field5881 < class418.field5996) {
                    class405.field5881 = class418.field5996;
                }
                int var10 = (class405.field5881 - class418.field5996) * 50 / class405.field5881;
                class660.method3653(class105.field1452, class379.field5542, class7.field76, true, -71, class474.field6551.method2780(107, class38.field589) + "<br>(" + var10 + "%)");
            } else if (class256.field3835 == 2) {
                if (class733.field10170 < class136.field2003) {
                    class733.field10170 = class136.field2003;
                }
                int var11 = (class733.field10170 - class136.field2003) * 50 / class733.field10170 + 50;
                class660.method3653(class105.field1452, class379.field5542, class7.field76, true, -93, class474.field6551.method2780(86, class38.field589) + "<br>(" + var11 + "%)");
            } else {
                class660.method3653(class105.field1452, class379.field5542, class7.field76, true, -92, class474.field6551.method2780(97, class38.field589));
            }
        } else if (class458.field6355 == 10) {
            class456.method2705(var2, true);
        } else if (class458.field6355 == 13) {
            class660.method3653(class105.field1452, class379.field5542, class7.field76, false, -105, class474.field6553.method2780(94, class38.field589) + "<br>" + class474.field6554.method2780(111, class38.field589));
        }
        if (class322.field4710 == 3) {
            for (int var12 = 0; var12 < class131.field1940; var12++) {
                Rectangle var13 = class296.field4291[var12];
                if (class555.field7488[var12]) {
                    class379.field5542.method471(var13.y, (byte) 40, var13.height, -65281, var13.x, var13.width);
                } else if (class756.field10500[var12]) {
                    class379.field5542.method471(var13.y, (byte) 40, var13.height, -65536, var13.x, var13.width);
                } else {
                    class379.field5542.method471(var13.y, (byte) 40, var13.height, -16711936, var13.x, var13.width);
                }
            }
        }
        if (class86.method706(arg0)) {
            class729.method4051(class379.field5542, 3);
        }
        if (class730.field10124.field977 && class16.method122(1, class458.field6355) && class322.field4710 == 0 && class485.method2816(-128) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class131.field1940; var15++) {
                if (class756.field10500[var15]) {
                    class756.field10500[var15] = false;
                    class303.field4364[var14++] = class296.field4291[var15];
                }
            }
            try {
                if (class130.field1934) {
                    class565.method3162(-2, var14, class303.field4364);
                } else {
                    class379.field5542.method509(class303.field4364, var14, arg0);
                }
            } catch (class566 var20) {
            }
        } else if (!class290.method1838(true, class458.field6355)) {
            for (int var16 = 0; var16 < class131.field1940; var16++) {
                class756.field10500[var16] = false;
            }
            try {
                if (class130.field1934) {
                    class184.method1278((byte) 121);
                } else {
                    class379.field5542.method548((byte) -111);
                }
            } catch (class566 var19) {
                class664.method3681((byte) 104, var19.getMessage() + " (Recovered) " + this.method1919(69), var19);
                class793.method4365((byte) -41, false, 0);
            }
        }
        class92.method743(-16);
        int var18 = class712.field9959.field1304.method3993(113);
        if (var18 == 0) {
            class438.method2636(true, 15L);
        } else if (var18 == 1) {
            class438.method2636(!arg0, 10L);
        } else if (var18 == 2) {
            class438.method2636(true, 5L);
        } else if (var18 == 3) {
            class438.method2636(true, 2L);
        }
        if (class540.field7347) {
            class749.method4141(101);
        }
        if (class712.field9959.field1306.method1477(105) == 1 && class458.field6355 == 3 && class69.field968 != -1) {
            class712.field9959.method735(0, class712.field9959.field1306, 98);
            class617.method3389(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1566)
    private final void method2014(byte arg0) {
        field4567++;
        if (arg0 == 120) {
            boolean var2 = class647.field8984.method3273(0);
            if (!var2) {
                this.method2010(arg0 - 17);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lor;IIIIIIIIIII)V", line = 1585)
    public static final void method2015(class668[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class668 var13 = arg0[var12];
            if (var13 != null && var13.field9336 == arg1) {
                int var14 = var13.field9242 + arg6;
                int var15 = var13.field9257 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field9353 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field9282 + var14;
                    int var21 = var13.field9297 + var15;
                    if (var13.field9353 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field9353 == 0 || var13.field9326 || method2022(var13).field1521 != 0 || class613.field8311 == var13 || class172.field2302 == var13.field9271 || class85.field1192 == var13.field9271) {
                    if (!method2008(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class130.field1934) {
                            var22 = class550.method3117(99);
                            var23 = class621.method3410(-2);
                        }
                        if (class437.field6161 == var13 && class716.method4003(-105, class437.field6161) != null) {
                            class277.field4113 = true;
                            class184.field2473 = var14;
                            class651.field9036 = var15;
                        }
                        if (var13.field9341 || var16 < var18 && var17 < var19) {
                            if (var13.field9364 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class12 var24 = (class12) class374.field5403.method2551((byte) -108); var24 != null; var24 = (class12) class374.field5403.method2542(-104)) {
                                    if (var24.field179) {
                                        var24.method792((byte) -105);
                                        var24.field190.field9329 = false;
                                    }
                                }
                                if (class440.field6189 == 0) {
                                    class437.field6161 = null;
                                    class613.field8311 = null;
                                }
                                class348.field5120 = 0;
                                class521.field7151 = false;
                                class597.field8131 = false;
                                if (!class526.field7216) {
                                    class700.method3903(1024);
                                }
                            }
                            boolean var25;
                            if (class304.field4371.method778(0) + var22 >= var16 && class304.field4371.method777((byte) 9) + var23 >= var17 && class304.field4371.method778(0) + var22 < var18 && class304.field4371.method777((byte) 28) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class497.field6870 && var25) {
                                if (var13.field9346 >= 0) {
                                    class660.field9129 = var13.field9346;
                                } else if (var13.field9364) {
                                    class660.field9129 = -1;
                                }
                            }
                            if (!class526.field7216 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class374.method2319((byte) -61, arg10 - var14, var13, arg11 - var15);
                            }
                            boolean var26 = false;
                            if (class304.field4371.method768(false) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class504 var28 = (class504) class289.field4242.method2551((byte) -108);
                            if (var28 != null && var28.method1037(-5) == 0 && var28.method1038(8) + var22 >= var16 && var28.method1036(5) + var23 >= var17 && var28.method1038(8) + var22 < var18 && var28.method1036(5) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field9235 != null && !class86.method706(false)) {
                                for (int var29 = 0; var29 < var13.field9235.length; var29++) {
                                    if (class469.field6507.method828(-2, var13.field9235[var29])) {
                                        if (var13.field9333 == null || class100.field1401 >= var13.field9333[var29]) {
                                            byte var30 = var13.field9394[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class469.field6507.method828(-2, 86) && !class469.field6507.method828(-2, 82) && !class469.field6507.method828(-2, 81)) && ((var30 & 0x2) == 0 || class469.field6507.method828(-2, 86)) && ((var30 & 0x1) == 0 || class469.field6507.method828(-2, 82)) && ((var30 & 0x4) == 0 || class469.field6507.method828(-2, 81))) {
                                                if (var29 < 10) {
                                                    class24.method192(true, -1, var13.field9221, "", var29 + 1);
                                                } else if (var29 == 10) {
                                                    class701.method3909(0);
                                                    class111 var31 = method2022(var13);
                                                    class348.method2196(var31.field1529, var13, -112, var31.method839(0));
                                                    class66.field942 = class411.method2536(var13, (byte) -93);
                                                    if (class66.field942 == null) {
                                                        class66.field942 = "Null";
                                                    }
                                                    class341.field4924 = var13.field9397 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field9391[var29];
                                                if (var13.field9333 == null) {
                                                    var13.field9333 = new int[var13.field9235.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field9333[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field9333[var29] = class100.field1401 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field9333 != null) {
                                        var13.field9333[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class261.method1725(var23 + var28.method1036(5) - var15, var22 + var28.method1038(8) - var14, var13, 114);
                            }
                            if (class437.field6161 != null && class437.field6161 != var13 && var25 && method2022(var13).method836((byte) -55)) {
                                class729.field10122 = var13;
                            }
                            if (class613.field8311 == var13) {
                                class662.field9134 = true;
                                class473.field6523 = var14;
                                class691.field9689 = var15;
                            }
                            if (var13.field9326 || var13.field9271 != 0) {
                                if (var25 && class491.field6815 != 0 && var13.field9379 != null) {
                                    class12 var33 = new class12();
                                    var33.field179 = true;
                                    var33.field190 = var13;
                                    var33.field181 = class491.field6815;
                                    var33.field186 = var13.field9379;
                                    class374.field5403.method2545(-127, var33);
                                }
                                if (class437.field6161 != null || class526.field7216 || class307.field4445 != var13.field9271 && class348.field5120 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field9271 != 0) {
                                    if (class630.field8816 == var13.field9271 || class279.field4116 == var13.field9271) {
                                        class249.field3687 = var13;
                                        if (class296.field4302 != null) {
                                            class296.field4302.method3944((byte) -123, class379.field5542, var13.field9297);
                                        }
                                        if (class630.field8816 == var13.field9271) {
                                            if (class526.field7216 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class712.method3982((byte) 86, arg8, arg9, class379.field5542);
                                            class381 var34 = (class381) class735.field10181.method109(0);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field5561 && arg10 < var34.field5559 && arg11 >= var34.field5567 && arg11 < var34.field5560) {
                                                    class700.method3903(1024);
                                                    class301.method1903(120, var34.field5562);
                                                }
                                                var34 = (class381) class735.field10181.method115((byte) 71);
                                            }
                                        }
                                    }
                                    if (class172.field2302 == var13.field9271) {
                                        if (var13.method3697(0, class379.field5542) == null || class227.field3104 != 0 && class227.field3104 != 3 || class526.field7216 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field9320[var36];
                                        if (var35 < var37 || var35 > var13.field9249[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field9282 / 2;
                                        int var39 = var36 - var13.field9297 / 2;
                                        int var40;
                                        if (class502.field6938 == 4) {
                                            var40 = (int) class135.field1974 & 0x3FFF;
                                        } else {
                                            var40 = (int) class135.field1974 + class594.field8116 & 0x3FFF;
                                        }
                                        int var41 = class749.field10324[var40];
                                        int var42 = class749.field10316[var40];
                                        if (class502.field6938 != 4) {
                                            var41 = (class299.field4334 + 256) * var41 >> 8;
                                            var42 = (class299.field4334 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class502.field6938 == 4) {
                                            var45 = (class500.field6902 >> 9) + (var43 >> 2);
                                            var46 = (class734.field10175 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class551.field7456.method655(-125) - 1) * 256;
                                            var45 = (class551.field7456.field2257 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class551.field7456.field2259 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class497.field6870 && (class344.field5067 & 0x40) != 0) {
                                            class668 var48 = class452.method2690(-4353, class372.field5384, class121.field1770);
                                            if (var48 == null) {
                                                class701.method3909(0);
                                            } else {
                                                class251.method1684(false, class66.field942, true, var13.field9283, " ->", (byte) 78, true, var45, 2, (long) (var13.field9318 << 0 | var13.field9221), var46, class678.field9483, 1L);
                                            }
                                            continue;
                                        }
                                        if (class21.field332 == class180.field2393) {
                                            class251.method1684(false, class474.field6566.method2780(103, class38.field589), true, -1, "", (byte) 86, true, var45, 57, 0L, var46, -1, 1L);
                                        }
                                        class251.method1684(false, class300.field4344, true, -1, "", (byte) -127, true, var45, 51, 0L, var46, class407.field5895, 1L);
                                        continue;
                                    }
                                    if (class307.field4445 == var13.field9271) {
                                        class474.field6605 = var13;
                                        if (var25) {
                                            class521.field7151 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1038(8) - var14 - var13.field9282 / 2) * 2.0D / (double) class375.field5429);
                                            int var50 = (int) (-((double) (var23 + var28.method1036(5) - var15 - var13.field9297 / 2) * 2.0D / (double) class375.field5429));
                                            int var51 = class276.field4092 + var49 + class375.field5447;
                                            int var52 = class66.field947 + var50 + class375.field5434;
                                            class485 var53 = class425.method2605(-75);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method2822(var52, var54, var51, (byte) 117);
                                            if (var54 != null) {
                                                if (class469.field6507.method828(-2, 82) && class712.field9963 > 0) {
                                                    class306.method1941(var54[0], 14328, var54[2], var54[1]);
                                                    continue;
                                                }
                                                class597.field8131 = true;
                                                class492.field6824 = var54[0];
                                                class502.field6936 = var54[1];
                                                class537.field7307 = var54[2];
                                            }
                                            class348.field5120 = 1;
                                            class754.field10483 = false;
                                            class94.field1338 = class304.field4371.method778(0);
                                            class662.field9145 = class304.field4371.method777((byte) 35);
                                            continue;
                                        }
                                        if (var26 && class348.field5120 > 0) {
                                            if (class348.field5120 == 1 && (class94.field1338 != class304.field4371.method778(0) || class662.field9145 != class304.field4371.method777((byte) -25))) {
                                                class226.field3099 = class276.field4092;
                                                class235.field3189 = class66.field947;
                                                class348.field5120 = 2;
                                            }
                                            if (class348.field5120 == 2) {
                                                class754.field10483 = true;
                                                class201.method1364((byte) 73, class226.field3099 + (int) ((double) (class94.field1338 - class304.field4371.method778(0)) * 2.0D / (double) class375.field5422));
                                                class618.method3398(class235.field3189 - (int) ((double) (class662.field9145 - class304.field4371.method777((byte) -127)) * 2.0D / (double) class375.field5422), (byte) 77);
                                            }
                                            continue;
                                        }
                                        if (class348.field5120 > 0 && !class754.field10483) {
                                            if ((class752.field10419 == 1 || class201.method1366(-121)) && class746.field10297 > 2) {
                                                class193.method1329(class662.field9145, class94.field1338, -120);
                                            } else if (class633.method3546(true)) {
                                                class193.method1329(class662.field9145, class94.field1338, -128);
                                            }
                                        }
                                        class348.field5120 = 0;
                                        continue;
                                    }
                                    if (class52.field756 == var13.field9271) {
                                        if (var26) {
                                            class686.method3809(var23 + class304.field4371.method777((byte) -118) - var15, var13.field9297, 22486, var13.field9282, var22 + class304.field4371.method778(0) - var14);
                                        }
                                        continue;
                                    }
                                    if (class85.field1192 == var13.field9271) {
                                        class483.method2808(var14, -123, var13, var15);
                                        continue;
                                    }
                                }
                                if (!var13.field9383 && var27) {
                                    var13.field9383 = true;
                                    if (var13.field9344 != null) {
                                        class12 var55 = new class12();
                                        var55.field179 = true;
                                        var55.field190 = var13;
                                        var55.field178 = var22 + var28.method1038(8) - var14;
                                        var55.field181 = var23 + var28.method1036(5) - var15;
                                        var55.field186 = var13.field9344;
                                        class374.field5403.method2545(-127, var55);
                                    }
                                }
                                if (var13.field9383 && var26 && var13.field9367 != null) {
                                    class12 var56 = new class12();
                                    var56.field179 = true;
                                    var56.field190 = var13;
                                    var56.field178 = var22 + class304.field4371.method778(0) - var14;
                                    var56.field181 = var23 + class304.field4371.method777((byte) 115) - var15;
                                    var56.field186 = var13.field9367;
                                    class374.field5403.method2545(-128, var56);
                                }
                                if (var13.field9383 && !var26) {
                                    var13.field9383 = false;
                                    if (var13.field9311 != null) {
                                        class12 var57 = new class12();
                                        var57.field179 = true;
                                        var57.field190 = var13;
                                        var57.field178 = var22 + class304.field4371.method778(0) - var14;
                                        var57.field181 = var23 + class304.field4371.method777((byte) 69) - var15;
                                        var57.field186 = var13.field9311;
                                        class553.field7471.method2545(-126, var57);
                                    }
                                }
                                if (var26 && var13.field9294 != null) {
                                    class12 var58 = new class12();
                                    var58.field179 = true;
                                    var58.field190 = var13;
                                    var58.field178 = var22 + class304.field4371.method778(0) - var14;
                                    var58.field181 = var23 + class304.field4371.method777((byte) 40) - var15;
                                    var58.field186 = var13.field9294;
                                    class374.field5403.method2545(-126, var58);
                                }
                                if (!var13.field9329 && var25) {
                                    var13.field9329 = true;
                                    if (var13.field9240 != null) {
                                        class12 var59 = new class12();
                                        var59.field179 = true;
                                        var59.field190 = var13;
                                        var59.field178 = var22 + class304.field4371.method778(0) - var14;
                                        var59.field181 = var23 + class304.field4371.method777((byte) -125) - var15;
                                        var59.field186 = var13.field9240;
                                        class374.field5403.method2545(-127, var59);
                                    }
                                }
                                if (var13.field9329 && var25 && var13.field9292 != null) {
                                    class12 var60 = new class12();
                                    var60.field179 = true;
                                    var60.field190 = var13;
                                    var60.field178 = var22 + class304.field4371.method778(0) - var14;
                                    var60.field181 = var23 + class304.field4371.method777((byte) -120) - var15;
                                    var60.field186 = var13.field9292;
                                    class374.field5403.method2545(-127, var60);
                                }
                                if (var13.field9329 && !var25) {
                                    var13.field9329 = false;
                                    if (var13.field9285 != null) {
                                        class12 var61 = new class12();
                                        var61.field179 = true;
                                        var61.field190 = var13;
                                        var61.field178 = var22 + class304.field4371.method778(0) - var14;
                                        var61.field181 = var23 + class304.field4371.method777((byte) -11) - var15;
                                        var61.field186 = var13.field9285;
                                        class553.field7471.method2545(-128, var61);
                                    }
                                }
                                if (var13.field9361 != null) {
                                    class12 var62 = new class12();
                                    var62.field190 = var13;
                                    var62.field186 = var13.field9361;
                                    class327.field4754.method2545(-126, var62);
                                }
                                if (var13.field9267 != null && class77.field1105 > var13.field9378) {
                                    if (var13.field9262 == null || class77.field1105 - var13.field9378 > 32) {
                                        class12 var67 = new class12();
                                        var67.field190 = var13;
                                        var67.field186 = var13.field9267;
                                        class374.field5403.method2545(-126, var67);
                                    } else {
                                        label711: for (int var63 = var13.field9378; var63 < class77.field1105; var63++) {
                                            int var64 = class586.field7815[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field9262.length; var65++) {
                                                if (var13.field9262[var65] == var64) {
                                                    class12 var66 = new class12();
                                                    var66.field190 = var13;
                                                    var66.field186 = var13.field9267;
                                                    class374.field5403.method2545(-126, var66);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9378 = class77.field1105;
                                }
                                if (var13.field9375 != null && class743.field10252 > var13.field9291) {
                                    if (var13.field9280 == null || class743.field10252 - var13.field9291 > 32) {
                                        class12 var72 = new class12();
                                        var72.field190 = var13;
                                        var72.field186 = var13.field9375;
                                        class374.field5403.method2545(-128, var72);
                                    } else {
                                        label687: for (int var68 = var13.field9291; var68 < class743.field10252; var68++) {
                                            int var69 = class267.field3936[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field9280.length; var70++) {
                                                if (var13.field9280[var70] == var69) {
                                                    class12 var71 = new class12();
                                                    var71.field190 = var13;
                                                    var71.field186 = var13.field9375;
                                                    class374.field5403.method2545(-127, var71);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9291 = class743.field10252;
                                }
                                if (var13.field9325 != null && class56.field782 > var13.field9229) {
                                    if (var13.field9258 == null || class56.field782 - var13.field9229 > 32) {
                                        class12 var77 = new class12();
                                        var77.field190 = var13;
                                        var77.field186 = var13.field9325;
                                        class374.field5403.method2545(-128, var77);
                                    } else {
                                        label663: for (int var73 = var13.field9229; var73 < class56.field782; var73++) {
                                            int var74 = class662.field9144[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field9258.length; var75++) {
                                                if (var13.field9258[var75] == var74) {
                                                    class12 var76 = new class12();
                                                    var76.field190 = var13;
                                                    var76.field186 = var13.field9325;
                                                    class374.field5403.method2545(-126, var76);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9229 = class56.field782;
                                }
                                if (var13.field9355 != null && class334.field4867 > var13.field9316) {
                                    if (var13.field9227 == null || class334.field4867 - var13.field9316 > 32) {
                                        class12 var82 = new class12();
                                        var82.field190 = var13;
                                        var82.field186 = var13.field9355;
                                        class374.field5403.method2545(-126, var82);
                                    } else {
                                        label639: for (int var78 = var13.field9316; var78 < class334.field4867; var78++) {
                                            int var79 = class40.field635[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field9227.length; var80++) {
                                                if (var13.field9227[var80] == var79) {
                                                    class12 var81 = new class12();
                                                    var81.field190 = var13;
                                                    var81.field186 = var13.field9355;
                                                    class374.field5403.method2545(-127, var81);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9316 = class334.field4867;
                                }
                                if (var13.field9332 != null && class170.field2275 > var13.field9238) {
                                    if (var13.field9322 == null || class170.field2275 - var13.field9238 > 32) {
                                        class12 var87 = new class12();
                                        var87.field190 = var13;
                                        var87.field186 = var13.field9332;
                                        class374.field5403.method2545(-126, var87);
                                    } else {
                                        label615: for (int var83 = var13.field9238; var83 < class170.field2275; var83++) {
                                            int var84 = class186.field2488[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field9322.length; var85++) {
                                                if (var13.field9322[var85] == var84) {
                                                    class12 var86 = new class12();
                                                    var86.field190 = var13;
                                                    var86.field186 = var13.field9332;
                                                    class374.field5403.method2545(-127, var86);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field9238 = class170.field2275;
                                }
                                if (class337.field4889 > var13.field9389 && var13.field9308 != null) {
                                    class12 var88 = new class12();
                                    var88.field190 = var13;
                                    var88.field186 = var13.field9308;
                                    class374.field5403.method2545(-128, var88);
                                }
                                if (class180.field2390 > var13.field9389 && var13.field9382 != null) {
                                    class12 var89 = new class12();
                                    var89.field190 = var13;
                                    var89.field186 = var13.field9382;
                                    class374.field5403.method2545(-128, var89);
                                }
                                if (class235.field3191 > var13.field9389 && var13.field9338 != null) {
                                    class12 var90 = new class12();
                                    var90.field190 = var13;
                                    var90.field186 = var13.field9338;
                                    class374.field5403.method2545(-126, var90);
                                }
                                if (class517.field7067 > var13.field9389 && var13.field9331 != null) {
                                    class12 var91 = new class12();
                                    var91.field190 = var13;
                                    var91.field186 = var13.field9331;
                                    class374.field5403.method2545(-128, var91);
                                }
                                if (class440.field6186 > var13.field9389 && var13.field9310 != null) {
                                    class12 var92 = new class12();
                                    var92.field190 = var13;
                                    var92.field186 = var13.field9310;
                                    class374.field5403.method2545(-126, var92);
                                }
                                if (class679.field9494 > var13.field9389 && var13.field9266 != null) {
                                    class12 var93 = new class12();
                                    var93.field190 = var13;
                                    var93.field186 = var13.field9266;
                                    class374.field5403.method2545(-127, var93);
                                }
                                if (class706.field9907 > var13.field9389 && var13.field9376 != null) {
                                    class12 var94 = new class12();
                                    var94.field190 = var13;
                                    var94.field186 = var13.field9376;
                                    class374.field5403.method2545(-126, var94);
                                }
                                var13.field9389 = class194.field2598;
                                if (var13.field9384 != null) {
                                    for (int var95 = 0; var95 < class301.field4350; var95++) {
                                        class12 var96 = new class12();
                                        var96.field190 = var13;
                                        var96.field191 = class503.field6968[var95].method1975(-90);
                                        var96.field185 = class503.field6968[var95].method1976((byte) -123);
                                        var96.field186 = var13.field9384;
                                        class374.field5403.method2545(-127, var96);
                                    }
                                }
                                if (class611.field8307 && var13.field9337 != null) {
                                    class12 var97 = new class12();
                                    var97.field190 = var13;
                                    var97.field186 = var13.field9337;
                                    class374.field5403.method2545(-126, var97);
                                }
                            }
                            if (var13.field9353 == 5 && var13.field9327 != -1) {
                                var13.method3713(class457.field6339, class563.field7548, -65536).method3944((byte) -107, class379.field5542, var13.field9297);
                            }
                            class315.method1981(var13, 298724582);
                            if (var13.field9353 == 0) {
                                method2015(arg0, var13.field9221, var16, var17, var18, var19, var14 - var13.field9374, var15 - var13.field9247, arg8, arg9, arg10, arg11);
                                if (var13.field9289 != null) {
                                    method2015(var13.field9289, var13.field9221, var16, var17, var18, var19, var14 - var13.field9374, var15 - var13.field9247, arg8, arg9, arg10, arg11);
                                }
                                class237 var98 = (class237) class609.field8283.method3953((long) var13.field9221, 14);
                                if (var98 != null) {
                                    if (class380.field5545 == class21.field332 && var98.field3196 == 0 && !class526.field7216 && var25 && !class688.field9683) {
                                        class700.method3903(1024);
                                    }
                                    class481.method2803(var14, arg9, var17, var18, (byte) 123, arg8, var16, arg10, var98.field3202, var19, var15, arg11);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class315.method1981(var13, 298724582);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2513)
    public static final void method2016() {
        class40.field639 = 0;
        for (int var0 = 0; var0 < class688.field9678; var0++) {
            class192 var1 = ((class174) class234.field3169.method3953((long) class382.field5588[var0], 14)).field2336;
            if (var1.field1823 && var1.method652(-1) != -1) {
                int var2 = (var1.method655(-128) - 1) * 256 + 252;
                int var3 = var1.field2257 - var2 >> 9;
                int var4 = var1.field2259 - var2 >> 9;
                class124 var5 = class76.method666((byte) -128, var3, var4, var1.field2250);
                if (var5 != null) {
                    int var6 = var5.field1812;
                    if (var5 instanceof class192) {
                        var6 += 2048;
                    }
                    if (var5.field1821 == 0 && var5.method652(-1) != -1) {
                        class267.field3934[class40.field639] = var6;
                        class103.field1421[class40.field639] = var6;
                        class40.field639++;
                        var5.field1821++;
                    }
                    class267.field3934[class40.field639] = var6;
                    class103.field1421[class40.field639] = var1.field1812 + 2048;
                    class40.field639++;
                    var5.field1821++;
                }
            }
        }
        class393.method2483(class267.field3934, class103.field1421, (byte) 1, class40.field639 - 1, 0);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2563)
    public static final void method2017(int arg0) {
        int var1 = class571.field7608;
        int[] var2 = class79.field1136;
        for (int var3 = 0; var3 < class688.field9678 + var1; var3++) {
            class124 var4;
            if (var3 < var1) {
                var4 = class599.field8149[var2[var3]];
            } else {
                var4 = ((class174) class234.field3169.method3953((long) class382.field5588[var3 - var1], 14)).field2336;
            }
            if (var4.field2250 == arg0 && var4.field1869 >= 0) {
                int var5 = var4.method655(-127);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2257 & 0x1FF) != 0 || (var4.field2259 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field2257 & 0x1FF) != 256 || (var4.field2259 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field2257 >> 9;
                    int var7 = var4.field2259 >> 9;
                    if (var4.field1869 > class249.field3688[var6][var7]) {
                        class249.field3688[var6][var7] = var4.field1869;
                        class72.field1010[var6][var7] = 1;
                    } else if (class249.field3688[var6][var7] == var4.field1869) {
                        var10002 = class72.field1010[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field2257 - var8 >> 9;
                    int var10 = var4.field2259 - var8 >> 9;
                    int var11 = var4.field2257 + var8 >> 9;
                    int var12 = var4.field2259 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1869 > class249.field3688[var13][var14]) {
                                class249.field3688[var13][var14] = var4.field1869;
                                class72.field1010[var13][var14] = 1;
                            } else if (class249.field3688[var13][var14] == var4.field1869) {
                                var10002 = class72.field1010[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 2660)
    private final void method2018(int arg0) {
        field4566++;
        if (class458.field6355 == arg0) {
            return;
        }
        class100.field1401++;
        if (class100.field1401 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class8.field86 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class584.field7796.setSeed((long) class8.field86);
        }
        if ((class100.field1401 % 50) == 0) {
            class172.field2298 = class757.field10506;
            class757.field10506 = 0;
            class376.field5465 = class479.field6638;
            class479.field6638 = 0;
        }
        this.method2014((byte) 120);
        if (class62.field891 != null) {
            class62.field891.method2428((byte) -115);
        }
        class177.method1248(arg0 - 14);
        class290.method1840(false);
        class469.field6507.method831((byte) 91);
        class304.field4371.method767(arg0 ^ 0xFFFFF273);
        if (class379.field5542 != null) {
            class379.field5542.method546((int) class302.method1910(0));
        }
        class86.method710((byte) 98);
        class301.field4350 = 0;
        class494.field6839 = 0;
        for (class313 var3 = class469.field6507.method825(-128); var3 != null; var3 = class469.field6507.method825(-128)) {
            int var6 = var3.method1974(false);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1976((byte) -126);
                if (class781.method4309((byte) 90) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class86.method706(false)) {
                        class162.method1182(-88);
                    } else {
                        class697.method3851(0);
                    }
                } else if (class301.field4350 < 128) {
                    class503.field6968[class301.field4350] = var3;
                    class301.field4350++;
                }
            } else if (var6 == 0 && class494.field6839 < 75) {
                class353.field5180[class494.field6839] = var3;
                class494.field6839++;
            }
        }
        class491.field6815 = 0;
        for (class504 var4 = class304.field4371.method774(0); var4 != null; var4 = class304.field4371.method774(arg0 - 14)) {
            int var5 = var4.method1037(-5);
            if (var5 == -1) {
                class561.field7533.method2545(-127, var4);
            } else if (var5 == 6) {
                class491.field6815 += var4.method1035(49);
            } else if (class219.method1440(-91, var5)) {
                class289.field4242.method2545(-127, var4);
                if (class289.field4242.method2538(arg0 ^ 0x3F) > 10) {
                    class289.field4242.method2543(arg0 ^ 0xFFFFC4F8);
                }
            }
        }
        if (class86.method706(false)) {
            class184.method1276((byte) -103);
        }
        if (class290.method1838(true, class458.field6355)) {
            class608.method3368(-125);
            class596.method3321(arg0 ^ 0xFFFFFFD1);
        } else if (class355.method2239(class458.field6355, -31175)) {
            class738.method4087((byte) -93);
        }
        if (class71.method631(class458.field6355, (byte) 6) && !class355.method2239(class458.field6355, -31175)) {
            this.method2007(false);
            class188.method1303((byte) -88);
            class105.method805(arg0 - 19587);
        } else if (class779.method4306(class458.field6355, 72) && !class355.method2239(class458.field6355, -31175)) {
            this.method2007(false);
            class105.method805(-19573);
        } else if (class458.field6355 == 12) {
            class105.method805(-19573);
        } else if (class732.method4059(true, class458.field6355) && !class355.method2239(class458.field6355, -31175)) {
            class370.method2300((byte) 88);
        } else if (class458.field6355 == 13) {
            class105.method805(-19573);
            if (class24.field378 != -3 && class24.field378 != 2 && class24.field378 != 15) {
                class631.method3541(arg0 ^ 0x63, false);
            }
        }
        class265.method1738((byte) 82, class379.field5542);
        class289.field4242.method2543(-15114);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 2821)
    public final void method1920(int arg0) {
        field4582++;
        if (class79.field1138) {
            class454.method2696((byte) 9);
        }
        class474.method2782(75);
        if (class379.field5542 != null) {
            class379.field5542.method470((byte) 71);
        }
        if (class632.field8832 != null) {
            class668.method3694(class730.field10124, arg0 + 152, class632.field8832);
            class632.field8832 = null;
        }
        if (class457.field6340 != null) {
            class457.field6340.method3027(arg0 + 40);
            class457.field6340 = null;
        }
        class645.method3581(arg0 ^ arg0);
        class647.field8984.method3271((byte) -103);
        class53.field758.method2714((byte) 37);
        if (class414.field5944 != null) {
            class414.field5944.method2531(arg0 + 162);
            class414.field5944 = null;
        }
        try {
            class741.field10224.method171(-113);
            for (int var2 = 0; var2 < 37; var2++) {
                class347.field5086[var2].method171(arg0 - 61);
            }
            class648.field8997.method171(-100);
            class365.field5320.method171(arg0 ^ 0x52);
            class362.method2276(-102);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 2876)
    public static void method2019(boolean arg0) {
        if (arg0) {
            field4580 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2886)
    public final void method1938(byte arg0) {
        field4571++;
        method2019(true);
        class125.method1022(34037);
        class16.method123((byte) -82);
        class474.method2781(-119);
        class304.method1917(-1);
        class637.method3558(-29);
        class422.method2596(true);
        class570.method3194(124);
        class273.method1775((byte) -67);
        class441.method2650((byte) -110);
        class773.method4282(34);
        class492.method2857(-17435);
        class734.method4073(0);
        class217.method1422((byte) -119);
        class281.method1810((byte) -84);
        class101.method789(false);
        class706.method3957(-16326);
        class305.method1924((byte) -69);
        class583.method3247(22759);
        class164.method1189((byte) 122);
        class285.method1824(101);
        class303.method1913((byte) -74);
        class65.method464((byte) -122);
        class34.method243((byte) 19);
        class553.method3124((byte) -88);
        class361.method2269((byte) -119);
        class412.method2539(-77);
        class18.method147(true);
        class587.method3265(15674);
        class458.method2709(-7742);
        class380.method2424(-124);
        class22.method179((byte) 127);
        class364.method2287((byte) 116);
        class239.method1542(0);
        class334.method2125(8448);
        class186.method1292(101);
        class372.method2306(86);
        class366.method2291(-31235);
        class671.method3734(4);
        class601.method3344(-1);
        class389.method2471(false);
        class701.method3904(11);
        class586.method3254(-1);
        class127.method1027(125);
        class415.method2563((byte) -68);
        class541.method3086((byte) 116);
        class40.method278(false);
        class582.method3240(true);
        class300.method1899(2);
        class69.method606(1718625538);
        class174.method1239(-28815);
        class376.method2390(941981088);
        class315.method1992((byte) 107);
        class581.method3234((byte) 64);
        class408.method2529(102);
        class219.method1442(-71);
        class485.method2820(false);
        class517.method2999(7084);
        class705.method3945(-1);
        class15.method108((byte) -71);
        class668.method3702((byte) 98);
        class103.method797((byte) 127);
        class73.method649(7);
        class625.method3438((byte) -116);
        class107.method815((byte) 12);
        class267.method1746(1);
        class124.method1013((byte) -128);
        class288.method1830(-29162);
        class309.method1945((byte) 94);
        class192.method1319(6327);
        class237.method1531((byte) 125);
        class111.method841((byte) -51);
        class374.method2323(19);
        class617.method3390(1);
        class5.method38((byte) -31);
        class613.method3381(86);
        class503.method2920(false);
        class145.method1092((byte) -112);
        class424.method2600(-3886);
        class302.method1909(102);
        class403.method2512((byte) -51);
        class513.method2986(-79);
        class462.method2739(-4);
        class80.method678((byte) -78);
        class136.method1064((byte) -90);
        class85.method702(109);
        class33.method238(94);
        class562.method3152(true);
        class476.method2785(15);
        class152.method1122((byte) 69);
        class387.method2450(false);
        class719.method4015(true);
        class691.method3831(true);
        class489.method2847((byte) 70);
        class545.method3100(32);
        class500.method2884(-1);
        class413.method2552(-84);
        class347.method2192((byte) -111);
        class257.method1710(3);
        class290.method1841(false);
        class589.method3286(-107);
        class782.method4331((byte) -123);
        class296.method1881(-97);
        class596.method3320(-2);
        class220.method1456((byte) -110);
        class407.method2526(-95);
        class322.method2052(108);
        class66.method585(18344);
        class455.method2697((byte) 43);
        class713.method3989((byte) -82);
        class499.method2881((byte) -117);
        class446.method2679(6);
        class449.method2686(6);
        class483.method2810(-116);
        class521.method3014(true);
        class165.method1191(0);
        class418.method2578(-91);
        class224.method1485(false);
        class2.method5(-1);
        class598.method3324((byte) -116);
        class491.method2851(0);
        class660.method3652(90);
        class384.method2444((byte) -107);
        class310.method1946(false);
        class206.method1380(-69);
        class132.method1053(10399);
        class170.method1208(false);
        class774.method4294(-32728);
        class767.method4249(320);
        class201.method1367((byte) -95);
        class187.method1297(-37);
        class104.method802((byte) -1);
        class714.method3996((byte) -112);
        class411.method2535((byte) 64);
        class222.method1476(-11905);
        class603.method3351(76);
        class260.method1720(7863);
        class632.method3544((byte) -47);
        class45.method349((byte) -93);
        class566.method3166(-3917);
        class514.method2988((byte) 116);
        class437.method2634((byte) -5);
        class255.method1705((byte) 45);
        class515.method2995(-99);
        class634.method3551(6320);
        class319.method2028(-78);
        class167.method1201((byte) 53);
        class751.method4158(-145);
        class182.method1266(1);
        class388.method2460(false);
        class720.method4022((byte) -67);
        class173.method1221();
        class739.method4094(-104);
        class410.method2533(16711935);
        class106.method807(-3938);
        class461.method2730(false);
        class627.method3530(-11);
        class687.method3818(23);
        class665.method3684(true);
        class501.method2896((byte) 102);
        class721.method4024((byte) -33);
        class600.method3335(false);
        class768.method4254(0);
        class21.method168(false);
        class234.method1520((byte) 115);
        class178.method1252(-22272);
        class599.method3332(-1355324126);
        class642.method3564(100);
        class402.method2508(true);
        class416.method2566(-106);
        class523.method3016(8);
        class375.method2334();
        class771.method4270((byte) -31);
        class747.method4131(0);
        class784.method4339(113);
        class793.method4366(-50174896);
        class735.method4076(-124);
        class160.method1170(-110);
        class564.method3159(255);
        class393.method2484(2);
        class11.method90(1);
        class176.method1242((byte) 6);
        class574.method3210(126);
        class126.method1025(true);
        class711.method3975(106);
        class663.method3660();
        class208.method1387((byte) 117);
        class289.method1834(43);
        class256.method1707((byte) -89);
        class398.method2496(-120);
        class733.method4071(false);
        class394.method2489(-1);
        class359.method2254(0);
        class57.method407(false);
        class680.method3763((byte) -67);
        class480.method2796();
        class295.method1876(115);
        class539.method3079(26911);
        class97.method761(-1);
        class12.method92((byte) -57);
        class244.method1573(true);
        class722.method4025(909839010);
        class190.method1314(0);
        class700.method3897(true);
        class556.method3139((byte) -113);
        class6.method39(-116);
        class279.method1805(-16777216);
        class516.method2998(true);
        class280.method1809(-80);
        class48.method369(15435);
        class195.method1343((byte) 124);
        class434.method2630((byte) 107);
        class242.method1562();
        class577.method3221(true);
        class263.method1735((byte) -80);
        class466.method2753(78);
        class299.method1895(76);
        class505.method2928();
        class351.method2214(1);
        class608.method3370((byte) 7);
        class130.method1046(6);
        class166.method1198(false);
        class60.method420((byte) -27);
        class39.method271((byte) 123);
        class61.method428();
        class648.method3619(102);
        class349.method2204(128);
        class669.method3722(2);
        class42.method289((byte) -100);
        class360.method2260(29323);
        class261.method1726(true);
        class493.method2858(0);
        class320.method2030((byte) -125);
        class486.method2826(0);
        class666.method3691(-127);
        class140.method1078(68);
        class785.method4341(true);
        class329.method2073(false);
        class230.method1506(false);
        class383.method2441((byte) -83);
        class87.method712(27946);
        class537.method3072(1210843136);
        class729.method4052(true);
        class764.method4243(31);
        class139.method1075(-1);
        class635.method3554(true);
        class579.method3231(125);
        class432.method2624(-126);
        class381.method2429(-93);
        class31.method220(512);
        class122.method1001(71);
        class193.method1331((byte) 31);
        class335.method2130(-108);
        class121.method994((byte) 98);
        class179.method1254(16);
        class396.method2492((byte) 98);
        class328.method2071(0);
        class730.method4053(-28474);
        class419.method2587((byte) -122);
        class777.method4303(108);
        class428.method2616((byte) 71);
        class8.method62(-1);
        class535.method3062(false);
        class4.method23(false);
        class518.method3001(-46);
        class678.method3751(5390);
        class109.method827((byte) -126);
        class546.method3104(-20212);
        class183.method1273(0);
        class770.method4258((byte) 94);
        class731.method4056(127);
        class443.method2666(true);
        class444.method2667(13361);
        class592.method3298(-17839);
        class286.method1825(-17122);
        class292.method1846(true);
        class662.method3656(true);
        class245.method1575((byte) 111);
        class373.method2313(21746);
        class445.method2671((byte) -112);
        class27.method210((byte) 12);
        class181.method1258(true);
        int var2 = -62 % ((66 - arg0) / 48);
        class723.method4028((byte) -33);
        class716.method4002(-1);
        class370.method2301(-112);
        class689.method3823(-82);
        class685.method3805(0);
        class470.method2771(50);
        class321.method2037(-92);
        class488.method2837(0);
        class693.method3838(-1);
        class761.method4224();
        class30.method218((byte) -75);
        class602.method3348(26934);
        class737.method4082((byte) 120);
        class674.method3748((byte) 126);
        class525.method3026(30000);
        class13.method97((byte) 81);
        class120.method990(131072);
        class382.method2434(-65537);
        class695.method3842(0);
        class327.method2068(-12648);
        class697.method3846((byte) -109);
        class414.method2556((byte) -122);
        class119.method987(-109);
        class482.method2805((byte) 25);
        class788.method4353((byte) 105);
        class72.method637(0);
        class191.method1315(1);
        class17.method137();
        class749.method4136((byte) 85);
        class91.method731();
        class318.method2000();
        class550.method3115((byte) -19);
        class791.method4361((byte) -112);
        class144.method1091();
        class548.method3111(6);
        class53.method389(2);
        class37.method262(98);
        class447.method2682((byte) 106);
        class229.method1499((byte) -114);
        class611.method3378(true);
        class645.method3580(true);
        class741.method4102(50);
        class651.method3625(32370);
        class756.method4212((byte) -6);
        class452.method2691((byte) 107);
        class614.method3385((byte) -115);
        class337.method2138(-105);
        class379.method2419(96);
        class36.method256();
        class9.method70(0);
        class467.method2762((byte) 105);
        class468.method2763(-67);
        class533.method3052(8);
        class200.method1359(0);
        class778.method4304(-60);
        class268.method1749(-21116);
        class177.method1247((byte) 75);
        class425.method2601((byte) -39);
        class630.method3536((byte) 101);
        class621.method3408((byte) -51);
        class344.method2184(-15969);
        class760.method4220((byte) 115);
        class59.method418(false);
        class554.method3127((byte) -67);
        class527.method3038((byte) 117);
        class590.method3297(127);
        class549.method3113(15);
        class246.method1659(13785);
        class52.method377(false);
        class538.method3075(86);
        class62.method442(-123);
        class353.method2229(false);
        class118.method964(1);
        class742.method4108(-6376);
        class463.method2744(-13865);
        class7.method50(true);
        class184.method1275((byte) -19);
        class293.method1855((byte) 71);
        class207.method1381(27606);
        class342.method2164(-25683);
        class430.method2620(14);
        class406.method2521(-218867224);
        class626.method3527(0);
        class542.method3089((byte) -125);
        class258.method1712((byte) 111);
        class745.method4124(-109);
        class754.method4195(0);
        class78.method674(96);
        class314.method1978((byte) 99);
        class400.method2500(0);
        class32.method233((byte) 120);
        class597.method3323((byte) -89);
        class704.method3943(true);
        class26.method199(false);
        class593.method3310(-31408);
        class787.method4350(false);
        class457.method2706(21160);
        class357.method2247((byte) 110);
        class330.method2079(-104);
        class391.method2476(16384);
        class578.method3224();
        class433.method2627((byte) 80);
        class584.method3248(-103);
        class269.method1752(5680);
        class530.method3043(2);
        class783.method4337((byte) -94);
        class46.method353((byte) -126);
        class605.method3356((byte) -64);
        class276.method1790(false);
        class238.method1540(false);
        class283.method1818(1);
        class28.method213(4096);
        class494.method2866(0);
        class429.method2619((byte) 97);
        class528.method3040(true);
        class47.method362((byte) -112);
        class94.method755(true);
        class272.method1772((byte) -48);
        class655.method3642(0);
        class90.method727(1);
        class308.method1944(true);
        class495.method2868((byte) 44);
        class254.method1693(638841633);
        class573.method3206(-3);
        class683.method3801(-11451);
        class198.method1358(16384);
        class250.method1681(-636);
        class765.method4246(-1);
        class652.method3631((byte) -1);
        class350.method2206(-2953);
        class451.method2689(59);
        class223.method1479();
        class355.method2240((byte) 92);
        class287.method1828(-114);
        class324.method2060(-103);
        class643.method3569(4);
        class86.method705(1);
        class456.method2704((byte) 33);
        class162.method1179(16777215);
        class23.method187(105);
        class197.method1352((byte) -85);
        class156.method1148(255);
        class277.method1792((byte) -102);
        class620.method3403((byte) -71);
        class497.method2876(0);
        class438.method2637(103);
        class251.method1683((byte) 3);
        class194.method1338(120);
        class262.method1731(102);
        class82.method689(10103);
        class148.method1115(-1);
        class271.method1767(false);
        class481.method2800(-1);
        class213.method1410((byte) 95);
        class436.method2633(false);
        class341.method2163(-85);
        class473.method2777((byte) -39);
        class83.method692((byte) -96);
        class20.method159(111);
        class708.method3966(-111);
        class471.method2774(3552);
        class397.method2494(3);
        class670.method3727(2);
        class686.method3811((byte) 125);
        class270.method1757(30929);
        class29.method214((byte) 121);
        class298.method1890((byte) -108);
        class399.method2498((byte) 20);
        class524.method3023(123);
        class688.method3819((byte) -121);
        class232.method1519((byte) 97);
        class113.method848((byte) -72);
        class558.method3141(19273);
        class210.method1396(64);
        class498.method2877(-124);
        class572.method3203((byte) -5);
        class659.method3649(0);
        class781.method4310((byte) -127);
        class235.method1522((byte) -111);
        class543.method3094(false);
        class609.method3373((byte) -43);
        class365.method2288(33);
        class487.method2831(4000);
        class326.method2066((byte) 88);
        class117.method954((byte) 96);
        class647.method3615(255);
        class108.method818(false);
        class89.method723(-60);
        class551.method3118(-117);
        class339.method2150(0);
        class763.method4233(82);
        class633.method3549((byte) -114);
        class477.method2788(125);
        class209.method1394((byte) 127);
        class594.method3319(0);
        class205.method1377(-24265);
        class189.method1310(0);
        class469.method2766(17335);
        class644.method3576((byte) -127);
        class555.method3132(-64);
        class618.method3394((byte) -105);
        class247.method1662(4096);
        class338.method2144((byte) 120);
        class673.method3746(117);
        class332.method2084(-2174);
        class348.method2201(10090);
        class138.method1067(0);
        class565.method3161(6);
        class744.method4121(-43);
        class504.method2925(-82);
        class93.method749(102);
        class386.method2447(3);
        class41.method280(true);
        class490.method2850(47);
        class624.method3419(6);
        class81.method683((byte) 31);
        class275.method1785(-12281);
        class775.method4296(53);
        class641.method3562((byte) 15);
        class604.method3354(-1);
        class560.method3147(2);
        class507.method2933(-105);
        class24.method193((byte) 126);
        class718.method4010(4);
        class679.method3754(false);
        class131.method1049(false);
        class728.method4050(7);
        class454.method2695(-55);
        class64.method445(12);
        class356.method2241((byte) -37);
        class105.method806(78);
        class561.method3151((byte) 117);
        class475.method2784((byte) 38);
        class496.method2871(-1);
        class369.method2296(-17981);
        class74.method657((byte) 39);
        class214.method1419((byte) -108);
        class154.method1128((byte) -42);
        class563.method3156((byte) -30);
        class79.method676(2048);
        class758.method4214(-10119);
        class569.method3188(116);
        class522.method3015((byte) 43);
        class180.method1255(-99);
        class134.method1057((byte) 101);
        class752.method4186(true);
        class658.method3648(80);
        class628.method3534(8);
        class10.method84((byte) 25);
        class202.method1369(4);
        class159.method1165((byte) 61);
        class712.method3983((byte) 34);
        class453.method2693((byte) 69);
        class664.method3679(70);
        class249.method1673(116);
        class607.method3361(-120);
        class676.method3749((byte) -112);
        class226.method1490(-23567);
        class362.method2275(-12285);
        class736.method4078(26);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3440)
    public static final void method2020() {
        int var0 = class571.field7608;
        int[] var1 = class79.field1136;
        int var2 = class6.field55 ? var0 : class688.field9678 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class124 var4;
            if (var3 < var0) {
                var4 = class599.field8149[var1[var3]];
            } else {
                var4 = ((class174) class234.field3169.method3953((long) class382.field5588[var3 - var0], 14)).field2336;
            }
            if (var4.field1869 >= 0) {
                int var5 = var4.method655(-125);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2257 & 0x1FF) == 0 && (var4.field2259 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field2257 & 0x1FF) == 256 && (var4.field2259 & 0x1FF) == 256) {
                    continue;
                }
                var4.field2246 = class783.method4338(var4.field2250, var4.field2257, -12040, var4.field2259);
                class356.method2242(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 3483)
    public final void method1927(byte arg0) {
        field4576++;
        if (class712.field9959.field1270.method4293(69) == 2) {
            try {
                this.method2013(false);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class664.method3681((byte) 105, var5.getMessage() + " (Recovered) " + this.method1919(118), var5);
                class648.field9005 = true;
                class793.method4365((byte) -41, false, 0);
            }
        } else {
            this.method2013(false);
        }
        if (arg0 != -88) {
            field4580 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 3508)
    public final void method1925(int arg0) {
        field4578++;
        if (class712.field9959.field1270.method4293(52) == 2) {
            try {
                this.method2018(14);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class664.method3681((byte) 121, var5.getMessage() + " (Recovered) " + this.method1919(34), var5);
                class648.field9005 = true;
                class793.method4365((byte) -41, false, 0);
            }
        } else {
            this.method2018(14);
        }
        if (arg0 < 93) {
            this.method1920(4);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lor;)Lor;", line = 3537)
    public static final class668 method2021(class668 arg0) {
        int var1 = method2022(arg0).method838(-101);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class536.method3067(arg0.field9336, 0);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lor;)Lqha;", line = 3558)
    public static final class111 method2022(class668 arg0) {
        class111 var1 = (class111) class298.field4316.method3953(((long) arg0.field9221 << 32) + (long) arg0.field9318, 14);
        return var1 == null ? arg0.field9272 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 3563)
    private final void method2023(int arg0, int arg1) {
        class493.field6831 = null;
        if (arg1 != 7) {
            field4580 = null;
        }
        class647.field8984.field7844 = arg0;
        class647.field8984.field7845++;
        field4575++;
        class129.field1928 = 0;
        class272.field4015 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 3578)
    public final synchronized void method1928(byte arg0) {
        field4573++;
        if (class735.field10183 != null && class706.field9894 == null && !class730.field10124.field977) {
            try {
                Class var2 = class735.field10183.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class706.field9894 = (Canvas) var3.get(class735.field10183);
                var3.set(class735.field10183, null);
                if (class706.field9894 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        if (arg0 <= 47) {
            field4580 = null;
        }
        super.method1928((byte) 91);
    }
}
