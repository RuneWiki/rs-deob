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
public class client extends class243 {

    @OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
    public static int[] field7527 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lpn;")
    public static class49 field7530 = new class49(65, 2);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lsc;")
    public static class270 field7548 = new class270(15, 0, 1, 0);

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field7532;

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

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lo;")
    public static class363 field7545;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field7549;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field7550;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method3073() {
        class532.field7774 = 0;
        for (int var0 = 0; var0 < class231.field3482; var0++) {
            class46 var1 = ((class5) class366.field5398.method358((byte) -118, (long) class234.field3513[var0])).field65;
            if (var1.field7568 && var1.method312((byte) 66) != -1) {
                int var2 = (var1.method3045(0) - 1) * 64 + 60;
                int var3 = var1.field1275 - var2 >> 7;
                int var4 = var1.field1279 - var2 >> 7;
                class521 var5 = class327.method2150(var3, var4, var1.field1274, -1866993209);
                if (var5 != null) {
                    int var6 = var5.field7562;
                    if (var5 instanceof class46) {
                        var6 += 2048;
                    }
                    if (var5.field7622 == 0 && var5.method312((byte) 66) != -1) {
                        class209.field3196[class532.field7774] = var6;
                        class232.field3488[class532.field7774] = var6;
                        class532.field7774++;
                        var5.field7622++;
                    }
                    class209.field3196[class532.field7774] = var6;
                    class232.field3488[class532.field7774] = var1.field7562 + 2048;
                    class532.field7774++;
                    var5.field7622++;
                }
            }
        }
        class163.method1171(0, class209.field3196, class532.field7774 - 1, class232.field3488, (byte) -121);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1649(byte arg0) {
        field7539++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class428.method2677(-514686137);
        class317.field4837 = new class379(class122.field1844);
        class201.field3108 = new class402();
        if (class62.field991 != class287.field4471) {
            class405.field5981 = new byte[50][];
        }
        class40.field667 = new class62(class122.field1844);
        if (class62.field991 == class287.field4471) {
            class35.field443.field5144 = this.getCodeBase().getHost();
        } else if (class142.method1023(class287.field4471, -27304)) {
            class35.field443.field5144 = this.getCodeBase().getHost();
            class35.field443.field5150 = class35.field443.field5143 + 40000;
            class271.field4286.field5150 = class271.field4286.field5143 + 40000;
            class314.field4781.field5150 = class314.field4781.field5143 + 40000;
            class35.field443.field5145 = class35.field443.field5143 + 50000;
            class271.field4286.field5145 = class271.field4286.field5143 + 50000;
            class314.field4781.field5145 = class314.field4781.field5143 + 50000;
        } else if (class301.field4613 == class287.field4471) {
            class35.field443.field5144 = "127.0.0.1";
            class271.field4286.field5144 = "127.0.0.1";
            class314.field4781.field5144 = "127.0.0.1";
            class35.field443.field5150 = class35.field443.field5143 + 40000;
            class271.field4286.field5150 = class271.field4286.field5143 + 40000;
            class314.field4781.field5150 = class314.field4781.field5143 + 40000;
            class35.field443.field5145 = class35.field443.field5143 + 50000;
            class271.field4286.field5145 = class271.field4286.field5143 + 50000;
            class314.field4781.field5145 = class314.field4781.field5143 + 50000;
        }
        class317.field4836 = class35.field443;
        if (class401.field5923 == class268.field4258) {
            class23.field270 = 0;
            class76.field1289 = true;
            class43.field683 = class423.field6215;
            class115.field1769 = class322.field4895;
            class306.field4689 = class397.field5863;
            class46.field729 = 16777215;
            class61.field960 = class501.field7285;
        } else {
            class115.field1769 = class5.field70;
            class306.field4689 = class202.field3119;
            class43.field683 = class201.field3110;
            class61.field960 = class358.field5298;
        }
        class452.field6718 = class174.field2683 = class21.field243 = class208.field3171 = new short[256];
        if (class81.field1327 == class401.field5923) {
            class529.field7737 = false;
        }
        if (arg0 < 29) {
            field7546 = -60;
        }
        class259.field4151 = class291.method1951(class342.field5114, (byte) -123);
        class377.field5570 = class21.method130(class342.field5114, true, true);
        class144.field2116 = class66.field1042;
        try {
            if (class122.field1844.field1057 != null) {
                class227.field3442 = new class209(class122.field1844.field1057, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class452.field6725[var3] = new class209(class122.field1844.field1041[var3], 6000, 0);
                }
                class155.field2385 = new class209(class122.field1844.field1056, 6000, 0);
                class448.field6649 = new class14(255, class227.field3442, class155.field2385, 500000);
                class99.field1529 = new class209(class122.field1844.field1038, 24, 0);
                class122.field1844.field1057 = null;
                class122.field1844.field1056 = null;
                class122.field1844.field1041 = null;
                class122.field1844.field1038 = null;
            }
        } catch (IOException var4) {
            class99.field1529 = null;
            class227.field3442 = null;
            class155.field2385 = null;
            class448.field6649 = null;
        }
        if (class62.field991 != class287.field4471) {
            class191.field2931 = true;
        }
        if (class81.field1327 == class401.field5923) {
            class234.field3516 = class463.field6864.method1265(class345.field5141, -115);
        } else if (class401.field5923 == class268.field4258) {
            class234.field3516 = class250.field4074.method1265(class345.field5141, -78);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method3074(int arg0) {
        field7530 = null;
        field7527 = null;
        field7548 = null;
        field7545 = null;
        if (arg0 <= 22) {
            method3076();
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method3075(int arg0) {
        field7540++;
        if (class460.field6813 == 13) {
            return;
        }
        long var2 = class457.method2796((byte) -63) / 1000000L - class442.field6588;
        class442.field6588 = class457.method2796((byte) -63) / 1000000L;
        boolean var4 = class34.method207(false);
        if (var4 && class326.field4938 && class350.field5227 != null) {
            class350.field5227.method2822(arg0 ^ 0xC6E5D59B);
        }
        if (class15.method92(arg0 + 12, class460.field6813)) {
            if (class250.field4082 != 0L && class250.field4082 < class375.method2397((byte) -75)) {
                class33.method196(class159.method1145((byte) 121), false, 51, class40.field667.field4188, class40.field667.field4191);
            } else if (!class376.field5542.method562() && class5.field72) {
                class361.method2290(-18613);
            }
        }
        if (class337.field5072 == null) {
            Container var5;
            if (class237.field3564 == null) {
                var5 = class122.field1844.field1062;
            } else {
                var5 = class237.field3564;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class237.field3564 == var5) {
                Insets var8 = class237.field3564.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class100.field1538 != var6 || class228.field3453 != var7) {
                if (class376.field5542 == null || class376.field5542.method563()) {
                    class428.method2677(-514686137);
                } else {
                    class228.field3453 = var7;
                    class100.field1538 = var6;
                }
                class250.field4082 = class375.method2397((byte) -75) + 500L;
            }
        }
        if (class337.field5072 != null && !class356.field5272 && class15.method92(9, class460.field6813)) {
            class33.method196(class40.field667.field4208, false, 51, -1, -1);
        }
        if (arg0 != -3) {
            return;
        }
        boolean var9 = false;
        if (class144.field2124) {
            var9 = true;
            class144.field2124 = false;
        }
        if (var9) {
            class27.method163((byte) -74);
        }
        if (class376.field5542 != null && class376.field5542.method562() || class159.method1145((byte) 121) != 1) {
            class80.method713(-14703);
        }
        if (class460.field6813 == 0) {
            class405.method2549((byte) -119, class283.field4419[class286.field4470], class428.field6355, class444.field6616, class521.field7602[class286.field4470], class172.field2663[class286.field4470], var9);
        } else if (class460.field6813 == 1) {
            class351.method2251((byte) -28, class376.field5542.method562() | var9, class521.field7602[class286.field4470].getRGB(), class376.field5542, class172.field2663[class286.field4470].getRGB(), class283.field4419[class286.field4470].getRGB(), class441.field6573);
        } else if (class124.method918(arg0 ^ 0x3F73, class460.field6813)) {
            class267.method1854(66);
        } else if (class164.method1172(class460.field6813, (byte) -104)) {
            class267.method1854(arg0 ^ 0x6B);
        } else if (class471.method2855(class460.field6813, 124)) {
            if (class416.field6116 == 1) {
                if (class49.field765 < class200.field3101) {
                    class49.field765 = class200.field3101;
                }
                int var10 = (class49.field765 - class200.field3101) * 50 / class49.field765;
                class51.method334(class54.field833, class185.field2838.method1265(class345.field5141, -82) + "<br>(" + var10 + "%)", 6, true);
            } else if (class416.field6116 == 2) {
                if (class228.field3454 < class47.field739) {
                    class228.field3454 = class47.field739;
                }
                int var11 = (class228.field3454 - class47.field739) * 50 / class228.field3454 + 50;
                class51.method334(class54.field833, class185.field2838.method1265(class345.field5141, -122) + "<br>(" + var11 + "%)", 6, true);
            } else {
                class51.method334(class54.field833, class185.field2838.method1265(class345.field5141, -81), 6, true);
            }
        } else if (class460.field6813 == 9) {
            class148.method1059(var2, true);
        } else if (class460.field6813 == 12) {
            class51.method334(class54.field833, class370.field5456.method1265(class345.field5141, arg0 ^ 0x70) + "<br>" + class124.field1856.method1265(class345.field5141, -128), 6, true);
        }
        if (class490.field7148 == 3) {
            for (int var12 = 0; var12 < class500.field7273; var12++) {
                Rectangle var13 = class489.field7147[var12];
                if (class147.field2184[var12]) {
                    class376.field5542.method1991(var13.y, -1996553985, var13.width, var13.height, 98, var13.x);
                } else if (class327.field4946[var12]) {
                    class376.field5542.method1991(var13.y, -1996554240, var13.width, var13.height, 42, var13.x);
                }
            }
        }
        if (class328.method2153(-102)) {
            class252.method1792((byte) 61, class376.field5542);
        }
        if (class15.method92(arg0 ^ 0xFFFFFFF4, class460.field6813) && class490.field7148 == 0 && class159.method1145((byte) 121) == 1 && !var9 && class66.field1046.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class500.field7273; var15++) {
                if (class327.field4946[var15]) {
                    class327.field4946[var15] = false;
                    class411.field6073[var14++] = class489.field7147[var15];
                }
            }
            class376.field5542.method501(class411.field6073, var14);
        } else if (class460.field6813 != 0) {
            class376.field5542.method530();
            for (int var16 = 0; var16 < class500.field7273; var16++) {
                class327.field4946[var16] = false;
            }
        }
        if (class40.field667.field4183 == 0) {
            class468.method2848(15L, (byte) 125);
        } else if (class40.field667.field4183 == 1) {
            class468.method2848(10L, (byte) 94);
        } else if (class40.field667.field4183 == 2) {
            class468.method2848(5L, (byte) -62);
        } else if (class40.field667.field4183 == 3) {
            class468.method2848(2L, (byte) 73);
        }
        if (class518.field7522) {
            class17.method105((byte) -74);
        }
        if (class40.field667.field4211 && class460.field6813 == 2 && class134.field2010 != -1) {
            class40.field667.field4211 = false;
            class40.field667.method422(class122.field1844, arg0 + 4);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class194.method1379(1262963495, "Argument count");
            }
            class35.field443 = new class346();
            class35.field443.field5143 = Integer.parseInt(arg0[0]);
            class271.field4286 = new class346();
            class271.field4286.field5143 = Integer.parseInt(arg0[1]);
            class314.field4781 = new class346();
            class314.field4781.field5143 = Integer.parseInt(arg0[2]);
            class287.field4471 = class301.field4613;
            if (arg0[3].equals("live")) {
                class322.field4902 = class319.field4838;
            } else if (arg0[3].equals("rc")) {
                class322.field4902 = class138.field2087;
            } else if (arg0[3].equals("wip")) {
                class322.field4902 = class156.field2403;
            } else {
                class194.method1379(1262963495, "modewhat");
            }
            class345.field5141 = class387.method2459(arg0[4], (byte) -95);
            if (class345.field5141 == -1) {
                if (arg0[4].equals("english")) {
                    class345.field5141 = 0;
                } else if (arg0[4].equals("german")) {
                    class345.field5141 = 1;
                } else {
                    class194.method1379(1262963495, "language");
                }
            }
            class416.field6114 = false;
            class73.field1242 = false;
            if (arg0[5].equals("game0")) {
                class401.field5923 = class81.field1327;
            } else if (arg0[5].equals("game1")) {
                class401.field5923 = class268.field4258;
            } else {
                class194.method1379(1262963495, "game");
            }
            class516.field7505 = 0;
            class21.field241 = 0;
            class286.field4470 = class401.field5923.field4704;
            class240.field3599 = true;
            class445.field6619 = true;
            class229.field3461 = "";
            class304.field4662 = false;
            client var1 = new client();
            class281.field4379 = var1;
            var1.method1652(768, 30, 1024, 602, class401.field5923.field4702, false, class322.field4902.method2576(10) + 32, 1);
            class237.field3564.setLocation(40, 40);
        } catch (Exception var3) {
            class197.method1407(true, null, var3);
        }
        field7531++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method3076() {
        int var0 = class422.field6205;
        int[] var1 = class506.field7363;
        int var2 = class341.field5092 ? var0 : class231.field3482 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class521 var4;
            if (var3 < var0) {
                var4 = class530.field7747[var1[var3]];
            } else {
                var4 = ((class5) class366.field5398.method358((byte) -123, (long) class234.field3513[var3 - var0])).field65;
            }
            if (var4.field7593 >= 0) {
                int var5 = var4.method3045(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1275 & 0x7F) == 0 && (var4.field1279 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field1275 & 0x7F) == 64 && (var4.field1279 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class511 && var4.field7650 != null && class446.field6625 >= var4.field7650.field2524 && class446.field6625 < var4.field7650.field2514) {
                    ((class511) var4).field7455 = false;
                }
                var4.field1278 = class416.method2605(var4.field1279, var4.field1275, (byte) 120, var4.field1274);
                class321.method2123(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)I")
    private static final int method3077(int arg0) {
        field7534++;
        if (arg0 != 9396) {
            method3092(null, -17, 21, 11, -83, -50, -31, -8, 21, -8);
        }
        return 16;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field7542++;
        if (!this.method1645(-48)) {
            return;
        }
        class35.field443 = new class346();
        class35.field443.field5143 = Integer.parseInt(this.getParameter("worldid"));
        class271.field4286 = new class346();
        class271.field4286.field5143 = Integer.parseInt(this.getParameter("lobbyid"));
        class271.field4286.field5144 = this.getParameter("lobbyaddress");
        class314.field4781 = new class346();
        class314.field4781.field5143 = Integer.parseInt(this.getParameter("demoid"));
        class314.field4781.field5144 = this.getParameter("demoaddress");
        class287.field4471 = class195.method1403(Integer.parseInt(this.getParameter("modewhere")), 90);
        if (!class142.method1023(class287.field4471, -27304) && class62.field991 != class287.field4471) {
            class287.field4471 = class62.field991;
        }
        class322.field4902 = class200.method1414(Integer.parseInt(this.getParameter("modewhat")), 125);
        if (class322.field4902 != class156.field2403 && class322.field4902 != class138.field2087 && class322.field4902 != class319.field4838) {
            class322.field4902 = class319.field4838;
        }
        try {
            class345.field5141 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class345.field5141 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class416.field6114 = true;
        } else {
            class416.field6114 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class73.field1242 = true;
        } else {
            class73.field1242 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class187.field2867 = true;
        } else {
            class187.field2867 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class401.field5923 = class81.field1327;
            } else if (var4.equals("1")) {
                class401.field5923 = class268.field4258;
            }
        }
        try {
            class516.field7505 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class516.field7505 = 0;
        }
        class313.field4767 = this.getParameter("quiturl");
        class229.field3461 = this.getParameter("settings");
        if (class229.field3461 == null) {
            class229.field3461 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class21.field241 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class21.field241 = 0;
            }
        }
        class286.field4470 = Integer.parseInt(this.getParameter("colourid"));
        if (class286.field4470 < 0 || class283.field4419.length <= class286.field4470) {
            class286.field4470 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class240.field3599 = true;
            class445.field6619 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class304.field4662 = true;
        }
        if (class81.field1327 == class401.field5923) {
            class155.field2387 = 503;
            class182.field2785 = 765;
        } else if (class401.field5923 == class268.field4258) {
            class182.field2785 = 640;
            class155.field2387 = 480;
        }
        class281.field4379 = this;
        this.method1651(602, true, class322.field4902.method2576(10) + 32, class182.field2785, class155.field2387);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1643(byte arg0) {
        if (arg0 >= -95) {
            method3074(-99);
        }
        if (class107.field1628) {
            class457.method2799(-30772);
        }
        field7547++;
        if (class376.field5542 != null) {
            class376.field5542.method1988((byte) -48);
        }
        if (class337.field5072 != null) {
            class234.method1587(class122.field1844, 109, class337.field5072);
            class337.field5072 = null;
        }
        if (class541.field7922 != null) {
            class541.field7922.method2155(false);
            class541.field7922 = null;
        }
        class10.method51(true);
        class201.field3108.method2522(1568);
        class317.field4837.method2410((byte) 71);
        if (class471.field6913 != null) {
            class471.field6913.method2406((byte) -29);
            class471.field6913 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lfi;)Lud;")
    public static final class94 method3078(class38 arg0) {
        class94 var1 = (class94) class392.field5721.method358((byte) -123, ((long) arg0.field580 << 32) + (long) arg0.field607);
        return var1 == null ? arg0.field646 : var1;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method3079(int arg0) {
        int var1 = class422.field6205;
        int[] var2 = class506.field7363;
        for (int var3 = 0; var3 < class231.field3482 + var1; var3++) {
            class521 var4;
            if (var3 < var1) {
                var4 = class530.field7747[var2[var3]];
            } else {
                var4 = ((class5) class366.field5398.method358((byte) 6, (long) class234.field3513[var3 - var1])).field65;
            }
            if (var4.field1274 == arg0 && var4.field7593 >= 0) {
                int var5 = var4.method3045(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1275 & 0x7F) != 0 || (var4.field1279 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field1275 & 0x7F) != 64 || (var4.field1279 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1275 >> 7;
                    int var7 = var4.field1279 >> 7;
                    if (var4.field7593 > class456.field6783[var6][var7]) {
                        class456.field6783[var6][var7] = var4.field7593;
                        class118.field1823[var6][var7] = 1;
                    } else if (class456.field6783[var6][var7] == var4.field7593) {
                        var10002 = class118.field1823[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field1275 - var8 >> 7;
                    int var10 = var4.field1279 - var8 >> 7;
                    int var11 = var4.field1275 + var8 >> 7;
                    int var12 = var4.field1279 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field7593 > class456.field6783[var13][var14]) {
                                class456.field6783[var13][var14] = var4.field7593;
                                class118.field1823[var13][var14] = 1;
                            } else if (class456.field6783[var13][var14] == var4.field7593) {
                                var10002 = class118.field1823[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method3080(int arg0) {
        field7541++;
        if (arg0 >= -69) {
            method3079(-79);
        }
        boolean var2 = class201.field3108.method2529((byte) 6);
        if (!var2) {
            this.method3085(-8);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method3081(int arg0, int arg1) {
        class201.field3108.field5953 = arg1;
        class532.field7769 = null;
        class346.field5154 = arg0;
        class308.field4706 = null;
        class201.field3108.field5956++;
        field7536++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method3082(byte[] arg0, int arg1) {
        field7543++;
        class194 var3 = new class194(arg0);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method1337((byte) -124);
                    if (var4 == 0) {
                        if (arg1 != 32) {
                            field7546 = -55;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class336.field5061 = new int[6];
                        var9[0] = var3.method1396(class232.method1566(arg1, 117));
                        var9[1] = var3.method1396(61);
                        var9[2] = var3.method1396(-98);
                        var9[3] = var3.method1396(-127);
                        var9[4] = var3.method1396(arg1 - 150);
                        var9[5] = var3.method1396(arg1 - 44);
                    } else if (var4 == 4) {
                        int var5 = var3.method1337((byte) 0);
                        class83.field1378 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class83.field1378[var6] = var3.method1396(class232.method1566(arg1, -126));
                            if (class83.field1378[var6] == 65535) {
                                class83.field1378[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method1337((byte) 114);
                        class270.field4270 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class270.field4270[var8] = var3.method1396(-107);
                            if (class270.field4270[var8] == 65535) {
                                class270.field4270[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1647(byte arg0) {
        if (class108.field1631 == 2) {
            try {
                this.method3090(-1);
            } catch (Throwable var3) {
                class197.method1407(true, var3.getMessage() + " (Recovered) " + this.method1657((byte) -69), var3);
                class155.method1127(0, -119);
            }
        } else {
            this.method3090(-1);
        }
        if (arg0 == 87) {
            field7528++;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lfi;)Z")
    public static final boolean method3083(class38 arg0) {
        if (class267.field4246) {
            if (method3078(arg0).field1503 != 0) {
                return false;
            }
            if (arg0.field503 == 0) {
                return false;
            }
        }
        return arg0.field542;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lfi;)Lfi;")
    public static final class38 method3084(class38 arg0) {
        int var1 = method3078(arg0).method796(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class159.method1143(-357225936, arg0.field600);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method3085(int arg0) {
        field7529++;
        if (class517.field7512 < class201.field3108.field5956) {
            class151.field2260 = (class201.field3108.field5956 * 50 - 50) * 5;
            class317.field4836.field5146 = !class317.field4836.field5146;
            if (class151.field2260 > 3000) {
                class151.field2260 = 3000;
            }
            if (class201.field3108.field5956 >= 2 && class201.field3108.field5953 == 6) {
                this.method1648(31418, "js5connect_outofdate");
                class460.field6813 = 13;
                return;
            }
            if (class201.field3108.field5956 >= 4 && class201.field3108.field5953 == -1) {
                this.method1648(31418, "js5crc");
                class460.field6813 = 13;
                return;
            }
            if (class201.field3108.field5956 >= 4 && class198.method1409(class460.field6813, (byte) 76)) {
                if (class201.field3108.field5953 == 7 || class201.field3108.field5953 == 9) {
                    this.method1648(arg0 + 31426, "js5connect_full");
                } else if (class201.field3108.field5953 <= 0) {
                    this.method1648(arg0 ^ 0xFFFF8542, "js5io");
                } else {
                    this.method1648(31418, "js5connect");
                }
                class460.field6813 = 13;
                return;
            }
        }
        class517.field7512 = class201.field3108.field5956;
        if (class151.field2260 > 0) {
            class151.field2260--;
            return;
        }
        try {
            if (class346.field5154 == 0) {
                class532.field7769 = class122.field1844.method460(class317.field4836.method2221(1615737763), 10503, class317.field4836.field5144);
                class346.field5154++;
            }
            if (arg0 == -8) {
                if (class346.field5154 == 1) {
                    if (class532.field7769.field4974 == 2) {
                        this.method3081(0, 1000);
                        return;
                    }
                    if (class532.field7769.field4974 == 1) {
                        class346.field5154++;
                    }
                }
                if (class346.field5154 == 2) {
                    class308.field4706 = new class258((Socket) class532.field7769.field4975, class122.field1844);
                    class194 var2 = new class194(5);
                    var2.method1381(class491.field7186.field7746, (byte) 105);
                    var2.method1348((byte) -65, 602);
                    class308.field4706.method1811(0, false, 5, var2.field2973);
                    class346.field5154++;
                    class500.field7274 = class375.method2397((byte) -75);
                }
                if (class346.field5154 == 3) {
                    if (class198.method1409(class460.field6813, (byte) 53) || class308.field4706.method1820(76) > 0) {
                        int var3 = class308.field4706.method1817(-93);
                        if (var3 != 0) {
                            this.method3081(arg0 + 8, var3);
                            return;
                        }
                        class346.field5154++;
                    } else if ((class375.method2397((byte) -75) - class500.field7274) > 30000L) {
                        this.method3081(0, 1001);
                        return;
                    }
                }
                if (class346.field5154 == 4) {
                    boolean var4 = class460.field6813 == 1 || class36.method238(arg0 ^ 0xFFFFFFFA, class460.field6813) || class242.method1638(class460.field6813, arg0 ^ 0xFFFFFFF9);
                    class201.field3108.method2528(class308.field4706, !var4, (byte) -43);
                    class346.field5154 = 0;
                    class532.field7769 = null;
                    class308.field4706 = null;
                }
            }
        } catch (IOException var5) {
            this.method3081(arg0 + 8, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1646(int arg0) {
        if (arg0 != 0) {
            method3092(null, -78, 46, 105, -7, -116, 111, -54, 72, 96);
        }
        field7535++;
        if (class108.field1631 != 2) {
            this.method3075(-3);
            return;
        }
        try {
            this.method3075(arg0 - 3);
        } catch (Throwable var3) {
            class197.method1407(true, var3.getMessage() + " (Recovered) " + this.method1657((byte) -50), var3);
            class155.method1127(0, arg0 - 15);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method3086() {
        for (int var0 = 0; var0 < class338.field5076; var0++) {
            int[] var1 = class456.field6783[var0];
            for (int var2 = 0; var2 < class250.field4077; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method1658(int arg0) {
        method3074(64);
        field7533++;
        class380.method2417(-81);
        class179.method1266((byte) 99);
        class80.method709(-7);
        class7.method31(-27059);
        class215.method1478(-121);
        class235.method1591(-73);
        class472.method2864((byte) 15);
        class130.method946(36);
        class462.method2830((byte) -29);
        class56.method362((byte) 92);
        class243.method1650(2);
        class389.method2462(false);
        class408.method2575(16383);
        class139.method1013(-21735);
        class308.method2030((byte) -122);
        class517.method3056(0);
        class299.method1990((byte) -83);
        class62.method413(2);
        class417.method2607(0);
        class44.method287(true);
        class258.method1814((byte) -100);
        class402.method2533(0);
        class379.method2408((byte) -85);
        class156.method1139(false);
        class347.method2225((byte) 42);
        class83.method730(-2);
        class209.method1454(false);
        class14.method80(92);
        class242.method1629(0);
        class25.method156(0);
        class522.method3114(68);
        class26.method161((byte) -112);
        class326.method2139(-6);
        class118.method887(true);
        class292.method1955(64);
        class306.method2025((byte) -75);
        class33.method202((byte) 104);
        class335.method2184((byte) 51);
        class87.method772(2);
        class172.method1230(5);
        class314.method2079(252645135);
        class456.method2790((byte) -117);
        class261.method1825(-102);
        class222.method1537(6);
        class297.method1980(true);
        class499.method2983((byte) 94);
        class125.method924(-1023760408);
        class93.method790(-112);
        class470.method2853(13882);
        class316.method2097(64);
        class151.method1084((byte) 26);
        class5.method26((byte) -29);
        class372.method2392(0);
        class428.method2667((byte) 123);
        class55.method356((byte) 11);
        class205.method1436(0);
        class407.method2557(112);
        class23.method145(118);
        class537.method3160((byte) 100);
        class6.method29((byte) -61);
        class486.method2935(-15511);
        class150.method1080(64);
        class38.method250(-116);
        class138.method1012((byte) 75);
        class511.method3046(5);
        class277.method1887(-1);
        class74.method690((byte) -75);
        class194.method1358(28);
        class521.method3094(true);
        class310.method2063((byte) -92);
        class281.method1898(false);
        class271.method1865((byte) 38);
        class541.method3176(1);
        class43.method285(23356);
        class46.method316(20627);
        class295.method1968(false);
        class94.method798(-1066070635);
        class49.method324(21);
        class484.method2931((byte) -116);
        class488.method2949(-103);
        class168.method1197((byte) 55);
        class348.method2241((byte) 98);
        class312.method2072((byte) 112);
        class411.method2584(51);
        class354.method2257(-93);
        class31.method191(3309);
        class429.method2678(-55);
        class424.method2642(-27422);
        class15.method90(true);
        class346.method2223(-119);
        class341.method2198(1);
        class105.method839(0);
        class264.method1838(0);
        class286.method1921((byte) -35);
        class313.method2078((byte) -116);
        class61.method410(99);
        class390.method2466(-1);
        class289.method1943(0);
        class77.method701(-123);
        class52.method340(98);
        class307.method2026(11);
        class106.method845(6);
        class395.method2496(false);
        class153.method1117((byte) 36);
        class396.method2503((byte) -57);
        class11.method57(0);
        class171.method1215(false);
        class221.method1514(false);
        class340.method2196((byte) 44);
        class393.method2471(18409);
        class29.method169(96);
        class320.method2116((byte) -32);
        class344.method2215((byte) 7);
        class485.method2934((byte) -53);
        class370.method2357(-101);
        class54.method353((byte) -13);
        class58.method377(-99);
        class287.method1932(30);
        class155.method1131(1);
        class529.method3130(0);
        class413.method2593(true);
        class303.method2012(18252);
        class173.method1237(10);
        class294.method1964(-7172);
        class157.method1140(69);
        class76.method696((byte) -116);
        class293.method1962(0);
        class276.method1880(40);
        class382.method2422();
        class167.method1189(-6);
        class477.method2881(-824);
        class92.method786(-25520);
        class366.method2332(-1);
        class449.method2758((byte) 122);
        class98.method812(17245);
        class152.method1095();
        class362.method2314();
        class53.method348(-24);
        class177.method1250();
        class265.method1842(-24283);
        class30.method187(-1);
        class530.method3133(-1);
        class282.method1901(0);
        class505.method3010(-1);
        class420.method2621(-464860857);
        class404.method2543((byte) 49);
        class97.method809(0);
        class36.method232(false);
        class163.method1161((byte) 7);
        class410.method2582((byte) -111);
        class384.method2446(true);
        class284.method1911(-105);
        class203.method1426((byte) -12);
        class444.method2743(-6828);
        class216.method1487((byte) 124);
        class116.method885(true);
        class474.method2870((byte) -81);
        class237.method1606((byte) 107);
        class434.method2697(110);
        class166.method1183(111);
        class186.method1298((byte) -112);
        class454.method2780(0);
        class405.method2547((byte) 90);
        class311.method2064(122);
        class270.method1864((byte) -95);
        class133.method977((byte) -42);
        class75.method693(87);
        class227.method1552((byte) -16);
        class455.method2785((byte) 54);
        class120.method902();
        class81.method716(-9444);
        class274.method1876(true);
        class229.method1556(-104);
        class392.method2469((byte) 12);
        class225.method1549(false);
        class510.method3033((byte) -119);
        class34.method208((byte) 52);
        class247.method1665((byte) 108);
        class503.method2998(-1715);
        class231.method1562(true);
        class481.method2902((byte) 84);
        class90.method778(-119);
        class501.method2989(16824);
        class202.method1418(false);
        class21.method133(true);
        class512.method3049(77);
        class200.method1416((byte) 98);
        class27.method162(true);
        class361.method2291(28);
        class100.method818((byte) 112);
        class491.method2960(true);
        class254.method1798(14663);
        class463.method2834(256);
        class534.method3147(false);
        class508.method3024(17);
        class228.method1554(16);
        class13.method77(0);
        class482.method2908(0);
        class78.method704(111);
        class327.method2151(16571);
        class101.method824(3158);
        class190.method1316(69);
        class103.method832((byte) 111);
        class192.method1330(1000);
        class515.method3053((byte) -39);
        class525.method3124(-28018);
        class115.method880(23651);
        class191.method1325((byte) -124);
        class86.method765(false);
        class201.method1417((byte) 126);
        class500.method2988((byte) 27);
        class416.method2603(16184);
        class212.method1464();
        class476.method2876(18041);
        class349.method2244(-18835);
        class1.method1((byte) -100);
        class154.method1124(66);
        class73.method683((byte) -85);
        class107.method847(0);
        class414.method2594(-32498);
        class360.method2288((byte) 44);
        class142.method1025(-129);
        class144.method1031((byte) 126);
        class489.method2952((byte) -77);
        class520.method3067();
        class448.method2757(26279);
        class516.method3054(0);
        class300.method1999(-296218648);
        class263.method1834(29927);
        class317.method2106(9022);
        class328.method2154(-98);
        class47.method319(117);
        class331.method2166((byte) 123);
        class195.method1405((byte) -97);
        class506.method3014((byte) 99);
        class451.method2766(2);
        class401.method2516(0);
        class435.method2702(-114);
        class441.method2727(true);
        class275.method1877((byte) -11);
        class394.method2479(-9658);
        class50.method331((byte) 126);
        class262.method1829(-115);
        class148.method1053(-126);
        class208.method1446(104);
        class459.method2815();
        class423.method2634(-102);
        class480.method2897((byte) 17);
        class135.method988();
        class126.method933();
        class419.method2615();
        int var2 = 117 % ((arg0 - 46) / 52);
        class114.method875(-1);
        class123.method914();
        class374.method2395((byte) 37);
        class178.method1260(1859610384);
        class471.method2857(83);
        class63.method426(false);
        class137.method1007();
        class353.method2256(false);
        class305.method2016(-125);
        class536.method3155((byte) -16);
        class342.method2201(98);
        class436.method2704((byte) -94);
        class540.method3175(2);
        class198.method1408((byte) -36);
        class358.method2284(19);
        class40.method271((byte) 89);
        class64.method429((byte) 113);
        class174.method1242((byte) 102);
        class165.method1180((byte) -124);
        class336.method2186(3);
        class112.method863(-113);
        class249.method1719(true);
        class453.method2779(64);
        class149.method1070(true);
        class185.method1290(-50);
        class495.method2970(-48);
        class159.method1149(31174);
        class322.method2124(33985);
        class35.method210((byte) -105);
        class169.method1202((byte) 74);
        class65.method438(0);
        class406.method2555((byte) 122);
        class412.method2588(34037);
        class425.method2656((byte) -87);
        class268.method1860(0);
        class502.method2993();
        class51.method335(-70);
        class272.method1868(0);
        class398.method2513(-30589);
        class193.method1333((byte) -114);
        class432.method2689((byte) -37);
        class4.method19(-128);
        class430.method2679(-212);
        class89.method777((byte) 126);
        class85.method761((byte) -54);
        class447.method2753((byte) 58);
        class487.method2944((byte) 116);
        class301.method2003((byte) 91);
        class96.method808((byte) -96);
        class490.method2956(21221);
        class365.method2329((byte) -32);
        class256.method1810(28986);
        class397.method2506(0);
        class338.method2190(0);
        class183.method1278(4096);
        class386.method2456(-11929);
        class3.method13(0);
        class438.method2716(2);
        class532.method3143((byte) 105);
        class12.method73(91);
        class298.method1983(false);
        class528.method3129(18184);
        class324.method2128(101);
        class367.method2337(1896327233);
        class531.method3135((byte) 58);
        class433.method2690(true);
        class140.method1015();
        class72.method629();
        class176.method1247(-13626);
        class350.method2249(0);
        class437.method2707((byte) 22);
        class59.method385((byte) -103);
        class368.method2339(8195);
        class2.method10((byte) 60);
        class383.method2439((byte) -82);
        class134.method979((byte) -10);
        class147.method1051(true);
        class111.method860(-85);
        class296.method1971(true);
        class539.method3171(-8);
        class509.method3030(-26237);
        class184.method1288((byte) 50);
        class315.method2095(-20807);
        class285.method1918(-31347);
        class355.method2265(58);
        class319.method2115((byte) -15);
        class415.method2600(70);
        class57.method376(true);
        class280.method1892(16);
        class290.method1944(1448495534);
        class385.method2451(-96);
        class9.method43(-104);
        class533.method3145(323998446);
        class218.method1505(-15);
        class250.method1788(-1623);
        class364.method2324((byte) 51);
        class175.method1245(false);
        class162.method1156(105);
        class124.method919(8448);
        class439.method2720(-78);
        class68.method490(120);
        class213.method1465(-20765);
        class132.method967(false);
        class238.method1610(47);
        class20.method127(69);
        class279.method1890((byte) 3);
        class288.method1934(100);
        class122.method908(-3602);
        class104.method834((byte) 1);
        class304.method2014((byte) -42);
        class234.method1584((byte) 22);
        class99.method814((byte) 114);
        class252.method1791(6695);
        class523.method3119(2702);
        class483.method2911((byte) 124);
        class136.method999(255);
        class443.method2737(false);
        class22.method135(96);
        class232.method1567(-109);
        class351.method2253(2);
        class42.method280((byte) 26);
        class337.method2189(18873);
        class426.method2658((byte) 98);
        class467.method2845(0);
        class259.method1821(-8);
        class8.method41(false);
        class377.method2402(Integer.MAX_VALUE);
        class376.method2399((byte) 63);
        class283.method1904((byte) -116);
        class240.method1615(6);
        class452.method2772(-101);
        class182.method1275(-1);
        class381.method2418((byte) 66);
        class507.method3021(109);
        class16.method95(256);
        class356.method2273(-106);
        class71.method616(127);
        class504.method3003(29);
        class409.method2578(77);
        class527.method3125((byte) 27);
        class524.method3121((byte) 120);
        class291.method1946(16809);
        class267.method1851((byte) 126);
        class442.method2734(3);
        class498.method2977(2);
        if (class243.field3679) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Ljava/lang/String;")
    public final String method1657(byte arg0) {
        if (arg0 >= -20) {
            this.method1643((byte) -15);
        }
        field7537++;
        String var2 = null;
        try {
            var2 = "[1)" + class422.field6201 + "," + class23.field273 + "," + class338.field5076 + "," + class250.field4077 + "|";
            if (class116.field1781 != null) {
                var2 = var2 + "2)" + class30.field370 + "," + (class116.field1781.field7654[0] + class422.field6201) + "," + (class116.field1781.field7653[0] + class23.field273) + "|";
            }
            var2 = var2 + "3)" + class108.field1631 + "|4)" + class40.field667.field4212 + "|5)" + class159.method1145((byte) 121) + "|6)" + class169.field2570 + "," + class360.field5313 + "|";
            var2 = var2 + "7)" + class40.field667.method1835(class108.field1631, true) + "|";
            var2 = var2 + "8)" + class40.field667.method1836(127, class108.field1631) + "|";
            var2 = var2 + "9)" + class40.field667.field4205 + "|";
            var2 = var2 + "10)" + class40.field667.field4217 + "|";
            var2 = var2 + "11)" + class40.field667.field4202 + "|";
            var2 = var2 + "12)" + class40.field667.method416(106, class108.field1631) + "|";
            var2 = var2 + "13)" + class360.field5314 + "|";
            var2 = var2 + "14)" + class460.field6813;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class108.field1631 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field7549 == null ? (field7549 = method3093("client")) : field7549).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method3087() {
        int var0 = class422.field6205;
        int[] var1 = class506.field7363;
        boolean var2 = class40.field667.field4182 == 1 && var0 > 200 || class40.field667.field4182 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class511 var13 = class530.field7747[var1[var3]];
            if (var13.method3047(false)) {
                var13.method698(64);
                if (var13.field1283 >= 0 && var13.field1277 >= 0 && var13.field1271 < class338.field5076 && var13.field1272 < class250.field4077) {
                    var13.field7455 = var13.field7596 ? var2 : false;
                    if (class116.field1781 == var13) {
                        var13.field7593 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field7568) {
                            var14++;
                        }
                        if (var13.field7634 > class446.field6625) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method3045(0) << 2);
                        if (var13.field7448) {
                            var15 += 512;
                        } else {
                            if (class383.field5643 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field7593 = var15 + 1;
                    }
                } else {
                    var13.field7593 = -1;
                }
            } else {
                var13.field7593 = -1;
            }
        }
        for (int var4 = 0; var4 < class231.field3482; var4++) {
            class46 var10 = ((class5) class366.field5398.method358((byte) -125, (long) class234.field3513[var4])).field65;
            if (var10.method311(false) && var10.field718.method1216(26538, class288.field4476)) {
                var10.method698(75);
                if (var10.field1283 >= 0 && var10.field1277 >= 0 && var10.field1271 < class338.field5076 && var10.field1272 < class250.field4077) {
                    int var11 = 0;
                    if (!var10.field7568) {
                        var11++;
                    }
                    if (var10.field7634 > class446.field6625) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method3045(0) << 2);
                    if (class383.field5643 == 0) {
                        if (var10.field718.field2634) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class383.field5643 == 1) {
                        if (var10.field718.field2634) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field718.field2640) {
                        var12 += 1024;
                    } else if (!var10.field718.field2645) {
                        var12 += 256;
                    }
                    var10.field7593 = var12 + 1;
                } else {
                    var10.field7593 = -1;
                }
            } else {
                var10.field7593 = -1;
            }
        }
        for (int var5 = 0; var5 < class292.field4519.length; var5++) {
            class417 var6 = class292.field4519[var5];
            if (var6 != null) {
                if (var6.field6122 == 1) {
                    class5 var7 = (class5) class366.field5398.method358((byte) -122, (long) var6.field6121);
                    if (var7 != null) {
                        class46 var8 = var7.field65;
                        if (var8.field7593 >= 0) {
                            var8.field7593 += 2048;
                        }
                    }
                } else if (var6.field6122 == 10) {
                    class511 var9 = class530.field7747[var6.field6121];
                    if (var9 != null && class116.field1781 != var9 && var9.field7593 >= 0) {
                        var9.field7593 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public static final void method3088(int arg0) {
        int var1 = class422.field6205;
        int[] var2 = class506.field7363;
        int var3 = class341.field5092 ? var1 : class231.field3482 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class521 var5;
            if (var4 < var1) {
                var5 = class530.field7747[var2[var4]];
            } else {
                var5 = ((class5) class366.field5398.method358((byte) 58, (long) class234.field3513[var4 - var1])).field65;
            }
            if (var5.field1274 == arg0) {
                var5.field7622 = 0;
                if (var5.field7593 < 0) {
                    var5.field7568 = false;
                } else {
                    int var6 = var5.method3045(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1275 & 0x7F) != 0 || (var5.field1279 & 0x7F) != 0) {
                            var5.field7568 = false;
                            continue;
                        }
                    } else if ((var5.field1275 & 0x7F) != 64 || (var5.field1279 & 0x7F) != 64) {
                        var5.field7568 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1275 >> 7;
                        int var8 = var5.field1279 >> 7;
                        if (class456.field6783[var7][var8] != var5.field7593) {
                            var5.field7568 = true;
                            continue;
                        }
                        if (class118.field1823[var7][var8] > 1) {
                            var10002 = class118.field1823[var7][var8]--;
                            var5.field7568 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field1275 - var9 >> 7;
                        int var11 = var5.field1279 - var9 >> 7;
                        int var12 = var5.field1275 + var9 >> 7;
                        int var13 = var5.field1279 + var9 >> 7;
                        if (!class246.method1663(var12, var10, (byte) 71, var11, var5.field7593, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class456.field6783[var14][var15] == var5.field7593) {
                                        var10002 = class118.field1823[var14][var15]--;
                                    }
                                }
                            }
                            var5.field7568 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class511 && var5.field7650 != null && class446.field6625 >= var5.field7650.field2524 && class446.field6625 < var5.field7650.field2514) {
                        ((class511) var5).field7455 = false;
                    }
                    var5.field7568 = false;
                    var5.field1278 = class416.method2605(var5.field1279, var5.field1275, (byte) 111, var5.field1274);
                    class321.method2123(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    private final void method3089(int arg0) {
        field7532++;
        if (!class40.field667.field4211) {
            for (int var2 = 0; var2 < class49.field764; var2++) {
                if (class426.field6346[var2].method1470(-127) == 's' || class426.field6346[var2].method1470(arg0 + 3) == 'S') {
                    class40.field667.field4211 = true;
                    break;
                }
            }
        }
        if (class209.field3204 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class375.method2397((byte) -75);
            if (class297.field4572 == 0L) {
                class297.field4572 = var5;
            }
            if (var4 > 16384 && var5 - class297.field4572 < 5000L) {
                if (var5 - class165.field2495 > 1000L) {
                    System.gc();
                    class165.field2495 = var5;
                }
                class444.field6616 = class237.field3567.method1265(class345.field5141, -105);
                class428.field6355 = 5;
            } else {
                class444.field6616 = class396.field5849.method1265(class345.field5141, arg0 + 36);
                class209.field3204 = 10;
                class428.field6355 = 5;
            }
        } else if (class209.field3204 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class463.field6857[var7] = class141.method1019(class338.field5076, (byte) -109, class250.field4077);
            }
            class444.field6616 = class439.field6546.method1265(class345.field5141, -107);
            class428.field6355 = 10;
            class209.field3204 = 20;
        } else if (class209.field3204 == 20) {
            if (class3.field47 == null) {
                class3.field47 = new class156(class201.field3108, class317.field4837);
            }
            if (class3.field47.method1136(120)) {
                class368.field5421 = class457.method2797(false, 1, 0, true, -53);
                class415.field6098 = class457.method2797(false, 1, 1, true, -37);
                class103.field1596 = class457.method2797(false, 1, 2, true, -44);
                class397.field5860 = class457.method2797(false, 1, 3, true, -64);
                class365.field5379 = class457.method2797(false, 1, 4, true, -47);
                class130.field1931 = class457.method2797(true, 1, 5, true, arg0 + 53);
                class417.field6135 = class457.method2797(true, 1, 6, false, arg0 ^ 0xFE);
                class59.field910 = class457.method2797(false, 1, 7, true, -71);
                class510.field7431 = class457.method2797(false, 1, 8, true, -81);
                class489.field7145 = class457.method2797(false, 1, 9, true, -116);
                class274.field4307 = class457.method2797(false, 1, 10, true, -71);
                class1.field8 = class457.method2797(false, 1, 11, true, -47);
                class151.field2261 = class457.method2797(false, 1, 12, true, -102);
                class312.field4754 = class457.method2797(false, 1, 13, true, -38);
                class144.field2122 = class457.method2797(false, 1, 14, false, -59);
                class470.field6896 = class457.method2797(false, 1, 15, true, -101);
                class472.field6932 = class457.method2797(false, 1, 16, true, -127);
                class105.field1610 = class457.method2797(false, 1, 17, true, -36);
                class83.field1337 = class457.method2797(false, 1, 18, true, -115);
                class93.field1495 = class457.method2797(false, 1, 19, true, -100);
                class55.field836 = class457.method2797(false, 1, 20, true, -84);
                class12.field133 = class457.method2797(false, 1, 21, true, -40);
                class1.field11 = class457.method2797(false, 1, 22, true, arg0 ^ 0x9C);
                class531.field7764 = class457.method2797(true, 1, 23, true, -59);
                class451.field6712 = class457.method2797(false, 1, 24, true, -119);
                class486.field7121 = class457.method2797(false, 1, 25, true, -93);
                class414.field6094 = class457.method2797(true, 1, 26, true, -93);
                class262.field4175 = class457.method2797(false, 1, 27, true, arg0 + 27);
                class93.field1493 = class457.method2797(true, 1, 28, true, -66);
                class454.field6750 = class457.method2797(false, 1, 29, true, -95);
                class444.field6616 = class498.field7256.method1265(class345.field5141, -109);
                class209.field3204 = 30;
                class428.field6355 = 15;
            } else {
                class444.field6616 = class327.field4940.method1265(class345.field5141, -80);
                class428.field6355 = 12;
            }
        } else if (class209.field3204 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class47.field750[var9].method2226(100) * class237.field3568[var9] / 100;
            }
            if (var8 == 100) {
                class444.field6616 = class407.field6005.method1265(class345.field5141, -65);
                class428.field6355 = 20;
                class503.method2999(class510.field7431, 0);
                class125.method931(class510.field7431, false);
                class209.field3204 = 40;
            } else {
                if (var8 != 0) {
                    class444.field6616 = class261.field4167.method1265(class345.field5141, -111) + var8 + "%";
                }
                class428.field6355 = 20;
            }
        } else if (class209.field3204 == 40) {
            if (class93.field1493.method742(-105)) {
                this.method3082(class93.field1493.method735(1, 0), 32);
                class444.field6616 = class430.field6379.method1265(class345.field5141, arg0 ^ 0xF5);
                class209.field3204 = 50;
                class428.field6355 = 25;
            } else {
                class444.field6616 = class111.field1659.method1265(class345.field5141, arg0 ^ 0xFF) + class93.field1493.method756(0) + "%";
                class428.field6355 = 25;
            }
        } else if (class209.field3204 == 50) {
            class457.method2798(arg0 ^ 0xE5);
            class444.field6616 = class136.field2068.method1265(class345.field5141, -60);
            class209.field3204 = 60;
            class428.field6355 = 30;
        } else if (class209.field3204 == 60) {
            int var10 = class394.method2484(class312.field4754, (byte) -126, class510.field7431);
            int var11 = class184.method1283(-15689);
            if (var11 > var10) {
                class444.field6616 = class429.field6366.method1265(class345.field5141, -71) + var10 * 100 / var11 + "%";
                class428.field6355 = 35;
            } else {
                class444.field6616 = class456.field6777.method1265(class345.field5141, -107);
                class209.field3204 = 70;
                class428.field6355 = 35;
            }
        } else if (class209.field3204 == 70) {
            int var12 = class274.method1875(9, class510.field7431);
            int var13 = class221.method1533(-36);
            if (var13 > var12) {
                class444.field6616 = class165.field2488.method1265(class345.field5141, arg0 + 42) + var12 * 100 / var13 + "%";
                class428.field6355 = 40;
            } else {
                class444.field6616 = class46.field721.method1265(class345.field5141, arg0 ^ 0xD2);
                class209.field3204 = 80;
                class428.field6355 = 40;
            }
        } else if (class209.field3204 == 80) {
            if (class414.field6094.method742(-128)) {
                class130.field1930 = new class282(class414.field6094, class489.field7145, class510.field7431);
                class444.field6616 = class186.field2856.method1265(class345.field5141, -84);
                class209.field3204 = 90;
                class428.field6355 = 45;
            } else {
                class444.field6616 = class342.field5109.method1265(class345.field5141, -97) + class414.field6094.method756(0) + "%";
                class428.field6355 = 45;
            }
        } else if (class209.field3204 == 90) {
            class444.field6616 = class56.field862.method1265(class345.field5141, -115);
            class428.field6355 = 50;
            class209.field3204 = 95;
        } else if (class209.field3204 == 95) {
            if (class40.field667.field4211) {
                class40.field667.field4184 = 0;
                class40.field667.field4208 = 1;
                class40.field667.field4193 = 0;
                class40.field667.field4212 = 0;
                class40.field667.field4204 = 0;
            }
            class40.field667.field4211 = true;
            class40.field667.method422(class122.field1844, 1);
            class472.method2863(arg0 - 31745, class40.field667.field4204, false);
            class444.field6616 = class456.field6768.method1265(class345.field5141, arg0 ^ 0xC4);
            class209.field3204 = 100;
            class428.field6355 = 55;
        } else if (class209.field3204 == 100) {
            class8.method37(class376.field5542, class510.field7431, false, class312.field4754);
            class444.field6616 = class438.field6536.method1265(class345.field5141, -123);
            class428.field6355 = 60;
            class376.method2400(1, (byte) 107);
            class209.field3204 = 110;
        } else if (class209.field3204 == 110) {
            class103.field1596.method742(-80);
            byte var14 = 0;
            int var15 = var14 + class103.field1596.method756(arg0 + 131);
            class472.field6932.method742(-78);
            int var16 = var15 + class472.field6932.method756(0);
            class105.field1610.method742(-62);
            int var17 = var16 + class105.field1610.method756(0);
            class83.field1337.method742(-73);
            int var18 = var17 + class83.field1337.method756(arg0 ^ 0xFFFFFF7D);
            class93.field1495.method742(-67);
            int var19 = var18 + class93.field1495.method756(0);
            class55.field836.method742(arg0 + 43);
            int var20 = var19 + class55.field836.method756(arg0 + 131);
            class12.field133.method742(-60);
            int var21 = var20 + class12.field133.method756(0);
            class1.field11.method742(-82);
            int var22 = var21 + class1.field11.method756(0);
            class451.field6712.method742(-126);
            int var23 = var22 + class451.field6712.method756(arg0 + 131);
            class486.field7121.method742(-109);
            int var24 = var23 + class486.field7121.method756(0);
            class262.field4175.method742(-128);
            int var25 = var24 + class262.field4175.method756(arg0 ^ 0xFFFFFF7D);
            class454.field6750.method742(-94);
            int var26 = var25 + class454.field6750.method756(0);
            if (var26 < 1200) {
                class444.field6616 = class481.field7057.method1265(class345.field5141, arg0 ^ 0xEA) + var26 / 12 + "%";
                class428.field6355 = 65;
            } else {
                class264.field4225 = new class456(class401.field5923, class345.field5141, class103.field1596);
                class315.field4808 = new class25(class401.field5923, class345.field5141, class103.field1596);
                class256.field4117 = new class522(class401.field5923, class345.field5141, class103.field1596, class510.field7431);
                class250.field4080 = new class26(class401.field5923, class345.field5141, class105.field1610);
                class314.field4777 = new class326(class401.field5923, class345.field5141, class103.field1596);
                class118.field1813 = new class118(class401.field5923, class345.field5141, class103.field1596);
                class306.field4682 = new class292(class401.field5923, class345.field5141, class103.field1596, class59.field910);
                class195.field3052 = new class306(class401.field5923, class345.field5141, class103.field1596);
                class61.field958 = new class33(class401.field5923, class345.field5141, class103.field1596);
                class247.field3693 = new class357(class401.field5923, class345.field5141, true, class472.field6932, class59.field910);
                class455.field6765 = new class335(class401.field5923, class345.field5141, class103.field1596, class510.field7431);
                class384.field5647 = new class87(class401.field5923, class345.field5141, class103.field1596, class510.field7431);
                class462.field6842 = new class172(class401.field5923, class345.field5141, true, class83.field1337, class59.field910);
                class300.field4608 = new class314(class401.field5923, class345.field5141, true, class264.field4225, class93.field1495, class59.field910);
                class389.field5702 = new class261(class401.field5923, class345.field5141, class103.field1596);
                class393.field5735 = new class222(class401.field5923, class345.field5141, class55.field836, class368.field5421, class415.field6098);
                class335.field5044 = new class297(class401.field5923, class345.field5141, class103.field1596);
                class436.field6496 = new class499(class401.field5923, class345.field5141, class103.field1596);
                class232.field3490 = new class421(class401.field5923, class345.field5141, class12.field133, class59.field910);
                class420.field6176 = new class125(class401.field5923, class345.field5141, class103.field1596);
                class202.field3118 = new class93(class401.field5923, class345.field5141, class103.field1596);
                class50.field774 = new class470(class401.field5923, class345.field5141, class103.field1596);
                class529.field7739 = new class316(class401.field5923, class345.field5141, class1.field11);
                class390.field5714 = new class10(class401.field5923, class345.field5141, class103.field1596);
                class51.method337(class397.field5860, class59.field910, class510.field7431, class312.field4754, (byte) 127);
                class15.method91(4, class454.field6750);
                class322.field4882 = new class339(class345.field5141, class451.field6712, class486.field7121);
                class376.field5554 = new class151(class345.field5141, class451.field6712, class486.field7121, new class311());
                class444.field6616 = class56.field856.method1265(class345.field5141, -76);
                class428.field6355 = 65;
                class74.method686(27830);
                class247.field3693.method2278(!class40.field667.method416(112, class108.field1631), 0);
                class288.field4476 = new class369();
                class499.method2979(32);
                class221.method1517(class262.field4175, (byte) -89);
                class530.method3134(class59.field910, 5706, class130.field1930);
                class209.field3204 = 120;
            }
        } else if (class209.field3204 == 120) {
            int var27 = class420.method2620(arg0 + 131, class510.field7431);
            int var28 = method3077(arg0 + 9527);
            if (var27 < var28) {
                class444.field6616 = class402.field5929.method1265(class345.field5141, -117) + var27 * 100 / var28 + "%";
                class428.field6355 = 70;
            } else {
                class156.method1133(class376.field5542, (byte) -83, class510.field7431);
                class191.method1327(11913, class470.field6906);
                class444.field6616 = class527.field7723.method1265(class345.field5141, -106);
                class428.field6355 = 70;
                class209.field3204 = 130;
            }
        } else if (~class209.field3204 == arg0) {
            if (class274.field4307.method745("huffman", "", -121)) {
                class274 var29 = new class274(class274.field4307.method738("", arg0 + 131, "huffman"));
                class428.method2668(var29, (byte) -83);
                class444.field6616 = class62.field980.method1265(class345.field5141, -77);
                class428.field6355 = 75;
                class209.field3204 = 140;
            } else {
                class444.field6616 = class380.field5595.method1265(class345.field5141, -88) + "0%";
                class428.field6355 = 75;
            }
        } else if (class209.field3204 == 140) {
            if (class397.field5860.method742(-70)) {
                class444.field6616 = class249.field3860.method1265(class345.field5141, -117);
                class209.field3204 = 150;
                class428.field6355 = 80;
            } else {
                class444.field6616 = class26.field299.method1265(class345.field5141, -119) + class397.field5860.method756(0) + "%";
                class428.field6355 = 80;
            }
        } else if (class209.field3204 == 150) {
            if (class151.field2261.method742(-68)) {
                class444.field6616 = class238.field3582.method1265(class345.field5141, -68);
                class428.field6355 = 82;
                class209.field3204 = 160;
            } else {
                class444.field6616 = class443.field6604.method1265(class345.field5141, arg0 + 48) + class151.field2261.method756(0) + "%";
                class428.field6355 = 82;
            }
        } else if (class209.field3204 == 160) {
            if (class312.field4754.method742(-121)) {
                class444.field6616 = class327.field4944.method1265(class345.field5141, -64);
                class428.field6355 = 85;
                class209.field3204 = 170;
            } else {
                class444.field6616 = class327.field4944.method1265(class345.field5141, arg0 + 42) + class312.field4754.method756(0) + "%";
                class428.field6355 = 85;
            }
        } else if (class209.field3204 == 170) {
            if (class531.field7764.method750(0, "details")) {
                class362.method2306(class531.field7764, class314.field4777, class118.field1813, class247.field3693, class455.field6765, class384.field5647, class288.field4476);
                class444.field6616 = class92.field1485.method1265(class345.field5141, -81);
                class428.field6355 = 89;
                class209.field3204 = 190;
            } else {
                class444.field6616 = class500.field7277.method1265(class345.field5141, -118) + class531.field7764.method729("details", -10493) + "%";
                class428.field6355 = 87;
            }
        } else if (class209.field3204 == 190) {
            class395.field5835 = new int[class50.field774.field6901];
            class541.field7914 = new boolean[class50.field774.field6901];
            class15.field161 = new String[class202.field3118.field1490];
            for (int var30 = 0; var30 < class50.field774.field6901; var30++) {
                if (class50.field774.method2854(var30, (byte) -122).field2864 == 0) {
                    class541.field7914[var30] = true;
                    class42.field676++;
                }
                class395.field5835[var30] = -1;
            }
            class232.method1563(false);
            class338.field5078 = class397.field5860.method737("loginscreen", -1);
            class141.field2104 = class397.field5860.method737("lobbyscreen", -1);
            class130.field1931.method726(-119, true, false);
            class417.field6135.method726(arg0 + 32, true, true);
            class510.field7431.method726(-114, true, true);
            class312.field4754.method726(-78, true, true);
            class274.field4307.method726(-102, true, true);
            class397.field5860.method726(-105, true, true);
            class518.field7522 = true;
            class103.field1596.field1355 = 2;
            class105.field1610.field1355 = 2;
            class472.field6932.field1355 = 2;
            class83.field1337.field1355 = 2;
            class93.field1495.field1355 = 2;
            class55.field836.field1355 = 2;
            class12.field133.field1355 = 2;
            class33.method196(class40.field667.field4208, false, 51, -1, -1);
            class444.field6616 = class374.field5528.method1265(class345.field5141, -118);
            class209.field3204 = 200;
            class428.field6355 = 95;
        } else if (class209.field3204 == 200) {
            class376.method2400(2, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    private final void method3090(int arg0) {
        field7538++;
        if (class460.field6813 == 13) {
            return;
        }
        class446.field6625++;
        if ((class446.field6625 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class488.field7133 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class406.field5998.setSeed((long) class488.field7133);
        }
        if ((class446.field6625 % 50) == 0) {
            class112.field1670 = class34.field406;
            class417.field6132 = class389.field5699;
            class34.field406 = 0;
            class389.field5699 = 0;
        }
        this.method3080(-87);
        if (class3.field47 != null) {
            class3.field47.method1135((byte) -102);
        }
        class286.method1930(-1571);
        class259.field4151.method36((byte) 8);
        class377.field5570.method1483((byte) -97);
        if (class376.field5542 != null) {
            class376.field5542.method594((int) class375.method2397((byte) -75));
        }
        class21.method131((byte) -69);
        class49.field764 = 0;
        class334.field5026 = 0;
        for (class214 var3 = class259.field4151.method32(3993493); var3 != null; var3 = class259.field4151.method32(3993493)) {
            int var6 = var3.method1469((byte) -124);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1470(-127);
                if (class258.method1816(arg0 - 29709) && (var7 == '`' || var7 == '§')) {
                    if (class328.method2153(-113)) {
                        class496.method2975((byte) -43);
                    } else {
                        class208.method1445((byte) 114);
                    }
                } else if (class49.field764 < 128) {
                    class426.field6346[class49.field764] = var3;
                    class49.field764++;
                }
            } else if (var6 == 0 && class334.field5026 < 75) {
                class154.field2356[class334.field5026] = var3;
                class334.field5026++;
            }
        }
        class314.field4788 = 0;
        for (class345 var4 = class377.field5570.method1473(arg0 - 23329); var4 != null; var4 = class377.field5570.method1473(arg0 - 23329)) {
            int var5 = var4.method1907(122);
            if (var5 == -1) {
                class505.field7342.method292((byte) 121, var4);
            } else if (var5 == 6) {
                class314.field4788 += var4.method1906((byte) 0);
            } else if (class500.method2986((byte) 112, var5)) {
                class277.field4347.method292((byte) 121, var4);
                if (class277.field4347.method297(arg0 + 1) > 10) {
                    class277.field4347.method298(arg0 - 51);
                }
            }
        }
        if (class328.method2153(-94)) {
            class328.method2157((byte) 51);
        }
        if (~class460.field6813 == arg0) {
            this.method3089(-131);
            class43.method282(0);
        } else if (class460.field6813 == 1) {
            this.method3089(-131);
            class43.method282(~arg0);
        } else if (class471.method2855(class460.field6813, -128)) {
            class203.method1428((byte) 110);
        }
        if (class36.method238(arg0 + 3, class460.field6813) && !class471.method2855(class460.field6813, arg0 ^ 0xFFFFFFE7)) {
            this.method3091(0);
            class61.method404((byte) -8);
            class424.method2639(-51);
        } else if (class242.method1638(class460.field6813, 1) && !class471.method2855(class460.field6813, arg0 + 47)) {
            this.method3091(~arg0);
            class424.method2639(-51);
        } else if (class460.field6813 == 11) {
            class424.method2639(-51);
        } else if (class434.method2698(true, class460.field6813) && !class471.method2855(class460.field6813, 98)) {
            class156.method1137(false);
        } else if (class460.field6813 == 12) {
            class424.method2639(-51);
            if (class350.field5219 != -3 && class350.field5219 != 2 && class350.field5219 != 15) {
                class405.method2550(false, arg0 ^ 0xFFFFFFBA);
            }
        }
        class35.method212((byte) 97, class376.field5542);
        class277.field4347.method298(-89);
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    private final void method3091(int arg0) {
        field7544++;
        if (class460.field6813 == 6 && class114.field1750 == 0) {
            if (class61.field978 > 1) {
                class17.field191 = class348.field5194;
                class61.field978--;
            }
            if (!class256.field4112) {
                class76.method695(-97);
            }
            for (int var2 = 0; var2 < 100 && class408.method2577((byte) 111); var2++) {
            }
        }
        class124.field1851++;
        class73.method682(-122, -1, -1, null);
        class166.method1185((byte) 5, -1, -1, null);
        class330.method2160(arg0 ^ 0x531E);
        class348.field5194++;
        for (int var3 = 0; var3 < class412.field6081; var3++) {
            class46 var4 = class166.field2507[var3].field65;
            if (var4 != null) {
                byte var5 = var4.field718.field2649;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method3045(0);
                    if ((var5 & 0x2) != 0 && var4.field7658 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field7654[0] + var7;
                            int var10 = var4.field7653[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class338.field5076 - var6 - 1)) {
                                var9 = class338.field5076 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class250.field4077 - var6 - 1)) {
                                var10 = class250.field4077 - (var6 + 1);
                            }
                            int var11 = class22.method137(-1, var4.field7653[0], var9, var10, class106.field1619, var4.field7654[0], 0, var6, true, 99999999, 0, var6, class463.field6857[var4.field1274], class338.field5073, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field7654[var12] = class338.field5073[var11 - var12 - 1];
                                    var4.field7653[var12] = class106.field1619[var11 - var12 - 1];
                                    var4.field7649[var12] = 1;
                                }
                                var4.field7658 = var11;
                            }
                        }
                    }
                    class509.method3032(var4, (byte) -108, true);
                    int var13 = class16.method94((byte) -103, var4);
                    class393.method2474((byte) 126, class504.field7325, class441.field6570, var13, var4);
                    class202.method1419(var4, -60);
                }
            }
        }
        if (class114.field1750 == arg0 && class259.field4152 == 0) {
            if (class33.field401 == 2) {
                class187.method1303((byte) -42);
            } else {
                class442.method2730(-29);
            }
            if ((class128.field1917 >> 7) < 14 || class338.field5076 - 14 <= class128.field1917 >> 7 || class406.field5999 >> 7 < 14 || (class406.field5999 >> 7) >= (class250.field4077 - 14)) {
                class476.method2878((byte) 0);
            }
        }
        while (true) {
            class510 var14;
            class38 var15;
            class38 var16;
            do {
                var14 = (class510) class511.field7439.method298(-51);
                if (var14 == null) {
                    while (true) {
                        class510 var17;
                        class38 var18;
                        class38 var19;
                        do {
                            var17 = (class510) class319.field4845.method298(arg0 - 54);
                            if (var17 == null) {
                                while (true) {
                                    class510 var20;
                                    class38 var21;
                                    class38 var22;
                                    do {
                                        var20 = (class510) class516.field7506.method298(arg0 - 18);
                                        if (var20 == null) {
                                            if (class374.field5527 != null) {
                                                class229.method1557(21731);
                                            }
                                            if ((class446.field6625 % 1500) == 0) {
                                                class321.method2122(-118);
                                            }
                                            if (class460.field6813 == 6 && class114.field1750 == 0) {
                                                class443.method2736((byte) -127);
                                            }
                                            class420.method2622((byte) -122);
                                            if (class107.field1628 && class537.field7887 < class375.method2397((byte) -75) - 60000L) {
                                                class457.method2799(-30772);
                                            }
                                            for (class42 var23 = (class42) class315.field4810.method1076((byte) 69); var23 != null; var23 = (class42) class315.field4810.method1077(-1)) {
                                                if ((class375.method2397((byte) -75) / 1000L - 5L) > ((long) var23.field677)) {
                                                    if (var23.field678 > 0) {
                                                        class58.method380("", var23.field674 + class65.field1037.method1265(class345.field5141, arg0 - 82), 5, 0, "", arg0 ^ 0x3B);
                                                    }
                                                    if (var23.field678 == 0) {
                                                        class58.method380("", var23.field674 + class417.field6131.method1265(class345.field5141, -94), 5, 0, "", 72);
                                                    }
                                                    var23.method2069(arg0 ^ 0xFFFFFFF5);
                                                }
                                            }
                                            if (class460.field6813 == 6 && class114.field1750 == 0) {
                                                if (class541.field7922 == null) {
                                                    class405.method2550(false, -69);
                                                    return;
                                                }
                                                class397.field5857++;
                                                if (class397.field5857 > 50) {
                                                    class110.method857(4095, class406.field6000);
                                                    class306.field4686++;
                                                }
                                                try {
                                                    if (class541.field7922 != null && class312.field4752.field2982 > 0) {
                                                        class34.field406 += class312.field4752.field2982;
                                                        class541.field7922.method2159(-15728, class312.field4752.field2982, 0, class312.field4752.field2973);
                                                        class397.field5857 = 0;
                                                        class312.field4752.field2982 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class405.method2550(false, 84);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field7423;
                                        if (var21.field607 < 0) {
                                            break;
                                        }
                                        var22 = class159.method1143(arg0 ^ 0xEAB52A30, var21.field600);
                                    } while (var22 == null || var22.field610 == null || var22.field610.length <= var21.field607 || var22.field610[var21.field607] != var21);
                                    class152.method1090(var20);
                                }
                            }
                            var18 = var17.field7423;
                            if (var18.field607 < 0) {
                                break;
                            }
                            var19 = class159.method1143(-357225936, var18.field600);
                        } while (var19 == null || var19.field610 == null || var19.field610.length <= var18.field607 || var19.field610[var18.field607] != var18);
                        class152.method1090(var17);
                    }
                }
                var15 = var14.field7423;
                if (var15.field607 < 0) {
                    break;
                }
                var16 = class159.method1143(-357225936, var15.field600);
            } while (var16 == null || var16.field610 == null || var16.field610.length <= var15.field607 || var16.field610[var15.field607] != var15);
            class152.method1090(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lfi;IIIIIIIII)V")
    public static final void method3092(class38[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class38 var11 = arg0[var10];
            if (var11 != null && var11.field600 == arg1) {
                int var12 = var11.field627 + arg6;
                int var13 = var11.field540 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field503 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field629 + var12;
                    int var19 = var11.field591 + var13;
                    if (var11.field503 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field503 == 0 || var11.field557 || method3078(var11).field1503 != 0 || class530.field7741 == var11 || class98.field1528 == var11.field593) {
                    if (!method3083(var11)) {
                        if (class374.field5527 == var11) {
                            class218.field3288 = true;
                            class104.field1605 = var12;
                            class108.field1637 = var13;
                        }
                        if (var11.field538 || var14 < var16 && var15 < var17) {
                            if (var11.field505 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class510 var20 = (class510) class516.field7506.method295((byte) -46); var20 != null; var20 = (class510) class516.field7506.method296(true)) {
                                    if (var20.field7420) {
                                        var20.method947((byte) 105);
                                        var20.field7423.field541 = false;
                                    }
                                }
                                if (class499.field7263 == 0) {
                                    class374.field5527 = null;
                                    class530.field7741 = null;
                                }
                                class215.field3254 = 0;
                                class390.field5705 = false;
                                class134.field1990 = false;
                                if (!class256.field4112) {
                                    class76.method695(-125);
                                }
                            }
                            boolean var21;
                            if (class377.field5570.method1475((byte) -119) >= var14 && class377.field5570.method1484(-22647) >= var15 && class377.field5570.method1475((byte) -121) < var16 && class377.field5570.method1484(-22647) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class2.field17 && var21) {
                                if (var11.field568 >= 0) {
                                    class282.field4402 = var11.field568;
                                } else if (var11.field505) {
                                    class282.field4402 = -1;
                                }
                            }
                            if (!class256.field4112 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class190.method1317(var11, arg8 - var12, (byte) 120, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class377.field5570.method1480(-70) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class345 var24 = (class345) class277.field4347.method295((byte) -64);
                            if (var24 != null && var24.method1907(123) == 0 && var24.method1905(true) >= var14 && var24.method1903(11) >= var15 && var24.method1905(true) < var16 && var24.method1903(11) < var17) {
                                var23 = true;
                            }
                            if (var11.field602 != null) {
                                for (int var25 = 0; var25 < var11.field602.length; var25++) {
                                    if (class259.field4151.method30(-7951, var11.field602[var25])) {
                                        if (var11.field567 == null || class446.field6625 >= var11.field567[var25]) {
                                            byte var26 = var11.field606[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class259.field4151.method30(-7951, 86) && !class259.field4151.method30(-7951, 82) && !class259.field4151.method30(-7951, 81)) && ((var26 & 0x2) == 0 || class259.field4151.method30(-7951, 86)) && ((var26 & 0x1) == 0 || class259.field4151.method30(-7951, 82)) && ((var26 & 0x4) == 0 || class259.field4151.method30(-7951, 81))) {
                                                if (var25 < 10) {
                                                    class487.method2943("", -1, -123, var11.field580, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class62.method415(false);
                                                    class94 var27 = method3078(var11);
                                                    class370.method2371(var27.method797(-63), var11, -101, var27.field1498);
                                                    class218.field3297 = class394.method2475(-34, var11);
                                                    if (class218.field3297 == null) {
                                                        class218.field3297 = "Null";
                                                    }
                                                    class447.field6638 = var11.field543 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field497[var25];
                                                if (var11.field567 == null) {
                                                    var11.field567 = new int[var11.field602.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field567[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field567[var25] = class446.field6625 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field567 != null) {
                                        var11.field567[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class107.method846(var24.method1905(true) - var12, var24.method1903(11) - var13, -11812, var11);
                            }
                            if (class374.field5527 != null && class374.field5527 != var11 && var21 && method3078(var11).method794(7)) {
                                class293.field4529 = var11;
                            }
                            if (class530.field7741 == var11) {
                                class178.field2725 = true;
                                class483.field7078 = var12;
                                class380.field5598 = var13;
                            }
                            if (var11.field557 || var11.field593 != 0) {
                                if (var21 && class314.field4788 != 0 && var11.field546 != null) {
                                    class510 var29 = new class510();
                                    var29.field7420 = true;
                                    var29.field7423 = var11;
                                    var29.field7425 = class314.field4788;
                                    var29.field7413 = var11.field546;
                                    class516.field7506.method292((byte) 121, var29);
                                }
                                if (class374.field5527 != null || class256.field4112 || class201.field3109 != var11.field593 && class215.field3254 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field593 != 0) {
                                    if (class456.field6785 == var11.field593 || class19.field214 == var11.field593) {
                                        class53.field817 = var11;
                                        if (class114.field1751 != null) {
                                            class114.field1751.method2942(class376.field5542, -25455, var11.field591);
                                        }
                                        if (class456.field6785 == var11.field593) {
                                            if (!class256.field4112 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class252.method1793(arg8, (byte) -114, class376.field5542, arg9);
                                                for (class327 var30 = (class327) class354.field5247.method1076((byte) 103); var30 != null; var30 = (class327) class354.field5247.method1077(-1)) {
                                                    if (arg8 >= var30.field4939 && arg8 < var30.field4956 && arg9 >= var30.field4943 && arg9 < var30.field4941) {
                                                        class76.method695(-68);
                                                        class438.method2715(var30.field4951, 0);
                                                    }
                                                }
                                            }
                                            class73.method682(-105, var13, var12, var11);
                                            continue;
                                        }
                                    }
                                    if (class98.field1528 == var11.field593) {
                                        if (var11.method260(49, class376.field5542) == null || class378.field5573 != 0 && class378.field5573 != 3 || class256.field4112 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field645[var32];
                                        if (var31 < var33 || var31 > var11.field525[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field629 / 2;
                                        int var35 = var32 - var11.field591 / 2;
                                        int var36;
                                        if (class33.field401 == 4) {
                                            var36 = (int) class434.field6466 & 0x3FFF;
                                        } else {
                                            var36 = (int) class434.field6466 + class484.field7096 & 0x3FFF;
                                        }
                                        int var37 = class58.field891[var36];
                                        int var38 = class58.field889[var36];
                                        if (class33.field401 != 4) {
                                            var37 = (class195.field3064 + 256) * var37 >> 8;
                                            var38 = (class195.field3064 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class33.field401 == 4) {
                                            var41 = (class2.field28 >> 7) + (var39 >> 2);
                                            var42 = (class447.field6641 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class116.field1781.method3045(0) - 1) * 64;
                                            var41 = (class116.field1781.field1275 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class116.field1781.field1279 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class2.field17 && (class166.field2500 & 0x40) != 0) {
                                            class38 var44 = class327.method2148(class442.field6585, -7153, class291.field4510);
                                            if (var44 == null) {
                                                class62.method415(false);
                                            } else {
                                                class423.method2637(1L, var11.field499, var41, (byte) -113, true, 21, class218.field3297, class246.field3688, false, var42, " ->");
                                            }
                                            continue;
                                        }
                                        if (class401.field5923 == class268.field4258) {
                                            class423.method2637(1L, -1, var41, (byte) -113, true, 45, class531.field7763.method1265(class345.field5141, -62), -1, false, var42, "");
                                        }
                                        class423.method2637(1L, -1, var41, (byte) -113, true, 6, class385.field5672, class193.field2968, false, var42, "");
                                        continue;
                                    }
                                    if (class201.field3109 == var11.field593) {
                                        class398.field5876 = var11;
                                        if (var21) {
                                            class390.field5705 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1905(true) - var12 - var11.field629 / 2) * 2.0D / (double) class362.field5340);
                                            int var46 = (int) (-((double) (var24.method1903(11) - var13 - var11.field591 / 2) * 2.0D / (double) class362.field5340));
                                            int var47 = class445.field6617 + var45 + class362.field5350;
                                            int var48 = class274.field4298 + var46 + class362.field5345;
                                            class537 var49 = class23.method147(19042);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method3158(var47, var50, var48, true);
                                            if (var50 != null) {
                                                if (class259.field4151.method30(-7951, 82) && class224.field3421 > 0) {
                                                    class303.method2011(var50[2], -31, var50[1], var50[0]);
                                                    continue;
                                                }
                                                class134.field1990 = true;
                                                class486.field7114 = var50[0];
                                                class449.field6686 = var50[1];
                                                class237.field3563 = var50[2];
                                            }
                                            class215.field3254 = 1;
                                            class392.field5720 = false;
                                            class299.field4606 = class377.field5570.method1475((byte) 40);
                                            class515.field7500 = class377.field5570.method1484(-22647);
                                            continue;
                                        }
                                        if (var22 && class215.field3254 > 0) {
                                            if (class215.field3254 == 1 && (class299.field4606 != class377.field5570.method1475((byte) -114) || class515.field7500 != class377.field5570.method1484(-22647))) {
                                                class424.field6226 = class445.field6617;
                                                class391.field5718 = class274.field4298;
                                                class215.field3254 = 2;
                                            }
                                            if (class215.field3254 == 2) {
                                                class392.field5720 = true;
                                                class275.method1879((byte) 103, class424.field6226 + (int) ((double) (class299.field4606 - class377.field5570.method1475((byte) -108)) * 2.0D / (double) class362.field5337));
                                                class294.method1963(class391.field5718 - (int) ((double) (class515.field7500 - class377.field5570.method1484(-22647)) * 2.0D / (double) class362.field5337), (byte) 116);
                                            }
                                            continue;
                                        }
                                        if (class215.field3254 > 0 && !class392.field5720) {
                                            if ((class336.field5064 == 1 || class18.method116(-28633)) && class540.field7909 > 2) {
                                                class49.method328(1, class299.field4606, class515.field7500);
                                            } else if (class421.method2626((byte) -121)) {
                                                class49.method328(1, class299.field4606, class515.field7500);
                                            }
                                        }
                                        class215.field3254 = 0;
                                        continue;
                                    }
                                    if (class195.field3044 == var11.field593) {
                                        if (var22) {
                                            class115.method877(var11.field591, var11.field629, class377.field5570.method1475((byte) 55) - var12, class377.field5570.method1484(-22647) - var13, (byte) 117);
                                        }
                                        continue;
                                    }
                                    if (class142.field2114 == var11.field593) {
                                        class166.method1185((byte) 5, var12, var13, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field617 && var23) {
                                    var11.field617 = true;
                                    if (var11.field605 != null) {
                                        class510 var51 = new class510();
                                        var51.field7420 = true;
                                        var51.field7423 = var11;
                                        var51.field7416 = var24.method1905(true) - var12;
                                        var51.field7425 = var24.method1903(11) - var13;
                                        var51.field7413 = var11.field605;
                                        class516.field7506.method292((byte) 121, var51);
                                    }
                                }
                                if (var11.field617 && var22 && var11.field614 != null) {
                                    class510 var52 = new class510();
                                    var52.field7420 = true;
                                    var52.field7423 = var11;
                                    var52.field7416 = class377.field5570.method1475((byte) -108) - var12;
                                    var52.field7425 = class377.field5570.method1484(-22647) - var13;
                                    var52.field7413 = var11.field614;
                                    class516.field7506.method292((byte) 121, var52);
                                }
                                if (var11.field617 && !var22) {
                                    var11.field617 = false;
                                    if (var11.field597 != null) {
                                        class510 var53 = new class510();
                                        var53.field7420 = true;
                                        var53.field7423 = var11;
                                        var53.field7416 = class377.field5570.method1475((byte) 112) - var12;
                                        var53.field7425 = class377.field5570.method1484(-22647) - var13;
                                        var53.field7413 = var11.field597;
                                        class319.field4845.method292((byte) 121, var53);
                                    }
                                }
                                if (var22 && var11.field522 != null) {
                                    class510 var54 = new class510();
                                    var54.field7420 = true;
                                    var54.field7423 = var11;
                                    var54.field7416 = class377.field5570.method1475((byte) -119) - var12;
                                    var54.field7425 = class377.field5570.method1484(-22647) - var13;
                                    var54.field7413 = var11.field522;
                                    class516.field7506.method292((byte) 121, var54);
                                }
                                if (!var11.field541 && var21) {
                                    var11.field541 = true;
                                    if (var11.field588 != null) {
                                        class510 var55 = new class510();
                                        var55.field7420 = true;
                                        var55.field7423 = var11;
                                        var55.field7416 = class377.field5570.method1475((byte) 4) - var12;
                                        var55.field7425 = class377.field5570.method1484(-22647) - var13;
                                        var55.field7413 = var11.field588;
                                        class516.field7506.method292((byte) 121, var55);
                                    }
                                }
                                if (var11.field541 && var21 && var11.field537 != null) {
                                    class510 var56 = new class510();
                                    var56.field7420 = true;
                                    var56.field7423 = var11;
                                    var56.field7416 = class377.field5570.method1475((byte) -122) - var12;
                                    var56.field7425 = class377.field5570.method1484(-22647) - var13;
                                    var56.field7413 = var11.field537;
                                    class516.field7506.method292((byte) 121, var56);
                                }
                                if (var11.field541 && !var21) {
                                    var11.field541 = false;
                                    if (var11.field520 != null) {
                                        class510 var57 = new class510();
                                        var57.field7420 = true;
                                        var57.field7423 = var11;
                                        var57.field7416 = class377.field5570.method1475((byte) 18) - var12;
                                        var57.field7425 = class377.field5570.method1484(-22647) - var13;
                                        var57.field7413 = var11.field520;
                                        class319.field4845.method292((byte) 121, var57);
                                    }
                                }
                                if (var11.field530 != null) {
                                    class510 var58 = new class510();
                                    var58.field7423 = var11;
                                    var58.field7413 = var11.field530;
                                    class511.field7439.method292((byte) 121, var58);
                                }
                                if (var11.field619 != null && class488.field7138 > var11.field485) {
                                    if (var11.field628 == null || class488.field7138 - var11.field485 > 32) {
                                        class510 var63 = new class510();
                                        var63.field7423 = var11;
                                        var63.field7413 = var11.field619;
                                        class516.field7506.method292((byte) 121, var63);
                                    } else {
                                        label691: for (int var59 = var11.field485; var59 < class488.field7138; var59++) {
                                            int var60 = class194.field3038[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field628.length; var61++) {
                                                if (var11.field628[var61] == var60) {
                                                    class510 var62 = new class510();
                                                    var62.field7423 = var11;
                                                    var62.field7413 = var11.field619;
                                                    class516.field7506.method292((byte) 121, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field485 = class488.field7138;
                                }
                                if (var11.field492 != null && class411.field6071 > var11.field506) {
                                    if (var11.field608 == null || class411.field6071 - var11.field506 > 32) {
                                        class510 var68 = new class510();
                                        var68.field7423 = var11;
                                        var68.field7413 = var11.field492;
                                        class516.field7506.method292((byte) 121, var68);
                                    } else {
                                        label667: for (int var64 = var11.field506; var64 < class411.field6071; var64++) {
                                            int var65 = class271.field4285[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field608.length; var66++) {
                                                if (var11.field608[var66] == var65) {
                                                    class510 var67 = new class510();
                                                    var67.field7423 = var11;
                                                    var67.field7413 = var11.field492;
                                                    class516.field7506.method292((byte) 121, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field506 = class411.field6071;
                                }
                                if (var11.field511 != null && class315.field4811 > var11.field612) {
                                    if (var11.field535 == null || class315.field4811 - var11.field612 > 32) {
                                        class510 var73 = new class510();
                                        var73.field7423 = var11;
                                        var73.field7413 = var11.field511;
                                        class516.field7506.method292((byte) 121, var73);
                                    } else {
                                        label643: for (int var69 = var11.field612; var69 < class315.field4811; var69++) {
                                            int var70 = class356.field5267[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field535.length; var71++) {
                                                if (var11.field535[var71] == var70) {
                                                    class510 var72 = new class510();
                                                    var72.field7423 = var11;
                                                    var72.field7413 = var11.field511;
                                                    class516.field7506.method292((byte) 121, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field612 = class315.field4811;
                                }
                                if (var11.field512 != null && class243.field3677 > var11.field500) {
                                    if (var11.field643 == null || class243.field3677 - var11.field500 > 32) {
                                        class510 var78 = new class510();
                                        var78.field7423 = var11;
                                        var78.field7413 = var11.field512;
                                        class516.field7506.method292((byte) 121, var78);
                                    } else {
                                        label619: for (int var74 = var11.field500; var74 < class243.field3677; var74++) {
                                            int var75 = class268.field4264[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field643.length; var76++) {
                                                if (var11.field643[var76] == var75) {
                                                    class510 var77 = new class510();
                                                    var77.field7423 = var11;
                                                    var77.field7413 = var11.field512;
                                                    class516.field7506.method292((byte) 121, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field500 = class243.field3677;
                                }
                                if (var11.field508 != null && class125.field1864 > var11.field515) {
                                    if (var11.field524 == null || class125.field1864 - var11.field515 > 32) {
                                        class510 var83 = new class510();
                                        var83.field7423 = var11;
                                        var83.field7413 = var11.field508;
                                        class516.field7506.method292((byte) 121, var83);
                                    } else {
                                        label595: for (int var79 = var11.field515; var79 < class125.field1864; var79++) {
                                            int var80 = class435.field6488[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field524.length; var81++) {
                                                if (var11.field524[var81] == var80) {
                                                    class510 var82 = new class510();
                                                    var82.field7423 = var11;
                                                    var82.field7413 = var11.field508;
                                                    class516.field7506.method292((byte) 121, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field515 = class125.field1864;
                                }
                                if (class292.field4511 > var11.field589 && var11.field489 != null) {
                                    class510 var84 = new class510();
                                    var84.field7423 = var11;
                                    var84.field7413 = var11.field489;
                                    class516.field7506.method292((byte) 121, var84);
                                }
                                if (class221.field3314 > var11.field589 && var11.field649 != null) {
                                    class510 var85 = new class510();
                                    var85.field7423 = var11;
                                    var85.field7413 = var11.field649;
                                    class516.field7506.method292((byte) 121, var85);
                                }
                                if (class367.field5416 > var11.field589 && var11.field554 != null) {
                                    class510 var86 = new class510();
                                    var86.field7423 = var11;
                                    var86.field7413 = var11.field554;
                                    class516.field7506.method292((byte) 121, var86);
                                }
                                if (class415.field6100 > var11.field589 && var11.field601 != null) {
                                    class510 var87 = new class510();
                                    var87.field7423 = var11;
                                    var87.field7413 = var11.field601;
                                    class516.field7506.method292((byte) 121, var87);
                                }
                                if (class17.field191 > var11.field589 && var11.field582 != null) {
                                    class510 var88 = new class510();
                                    var88.field7423 = var11;
                                    var88.field7413 = var11.field582;
                                    class516.field7506.method292((byte) 121, var88);
                                }
                                var11.field589 = class348.field5194;
                                if (var11.field563 != null) {
                                    for (int var89 = 0; var89 < class49.field764; var89++) {
                                        class510 var90 = new class510();
                                        var90.field7423 = var11;
                                        var90.field7430 = class426.field6346[var89].method1472(false);
                                        var90.field7429 = class426.field6346[var89].method1470(-127);
                                        var90.field7413 = var11.field563;
                                        class516.field7506.method292((byte) 121, var90);
                                    }
                                }
                                if (class453.field6744 && var11.field552 != null) {
                                    class510 var91 = new class510();
                                    var91.field7423 = var11;
                                    var91.field7413 = var11.field552;
                                    class516.field7506.method292((byte) 121, var91);
                                }
                            }
                            if (var11.field503 == 5 && var11.field586 != -1) {
                                var11.method263(class436.field6496, class335.field5044, 11).method2942(class376.field5542, -25455, var11.field591);
                            }
                            class503.method3002(-11766, var11);
                            if (var11.field503 == 0) {
                                method3092(arg0, var11.field580, var14, var15, var16, var17, var12 - var11.field488, var13 - var11.field504, arg8, arg9);
                                if (var11.field610 != null) {
                                    method3092(var11.field610, var11.field580, var14, var15, var16, var17, var12 - var11.field488, var13 - var11.field504, arg8, arg9);
                                }
                                class295 var92 = (class295) class215.field3248.method358((byte) -120, (long) var11.field580);
                                if (var92 != null) {
                                    if (class81.field1327 == class401.field5923 && var92.field4542 == 0 && !class256.field4112 && var21 && !class267.field4246) {
                                        class76.method695(-118);
                                    }
                                    class291.method1947(arg9, var16, var17, var92.field4546, -1, var15, var12, var14, arg8, var13);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class503.method3002(-11766, var11);
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3093(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
