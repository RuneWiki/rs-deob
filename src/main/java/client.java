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
public class client extends class223 {

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Luf;")
    public static class310 field2799 = new class310(45, -2);

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lfg;")
    private static class83 field2801 = new class83("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lfg;")
    private static class83 field2803 = new class83("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
    public static int[] field2805 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lvh;")
    public static class240 field2802;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
    public static boolean field2806;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 4)
    public final void method1187(byte arg0) {
        field2790++;
        if (class137.field1958 == 1000) {
            return;
        }
        long var2 = class151.method956((byte) 120) / 1000000L - class164.field2336;
        class164.field2336 = class151.method956((byte) 107) / 1000000L;
        boolean var4 = class53.method339(109);
        if (var4 && class208.field2948 && class476.field6960 != null) {
            class476.field6960.method1985(16384);
        }
        if (class137.field1958 == 30 || class137.field1958 == 10) {
            if (class123.field1685 != 0L && class123.field1685 < class333.method1850(-3562)) {
                class161.method997(class437.field6374.field4253, false, class437.field6374.field4269, class448.method2641((byte) 103), false);
            } else if (!class418.field6109.method495() && class522.field7695) {
                class376.method2165(-1);
            }
        }
        if (class38.field513 == null) {
            Container var5;
            if (class140.field1993 == null) {
                var5 = class282.field3804.field5516;
            } else {
                var5 = class140.field1993;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class140.field1993 == var5) {
                Insets var8 = class140.field1993.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class166.field2345 != var6 || class282.field3808 != var7) {
                if (class418.field6109 == null || class418.field6109.method513()) {
                    class150.method949(true);
                } else {
                    class166.field2345 = var6;
                    class282.field3808 = var7;
                }
                class123.field1685 = class333.method1850(-3562) + 500L;
            }
        }
        if (class38.field513 != null && !class483.field7099 && (class137.field1958 == 30 || class137.field1958 == 10)) {
            class161.method997(-1, false, -1, class437.field6374.field4263, false);
        }
        boolean var9 = false;
        if (class308.field4230) {
            var9 = true;
            class308.field4230 = false;
        }
        if (var9) {
            class275.method1564(false);
        }
        if (class418.field6109 != null && class418.field6109.method495() || class448.method2641((byte) 96) != 1) {
            class242.method1428((byte) 77);
        }
        if (class137.field1958 == 0) {
            class150.method951(class153.field2189[class188.field2609], class204.field2897[class188.field2609], class272.field3712, true, class311.field4292[class188.field2609], class40.field544, var9);
        } else if (class137.field1958 == 5) {
            class274.method1556(class418.field6109.method495() | var9, class34.field487, class204.field2897[class188.field2609].getRGB(), class153.field2189[class188.field2609].getRGB(), class311.field4292[class188.field2609].getRGB(), (byte) 39, class418.field6109);
        } else if (class137.field1958 == 10) {
            class205.method1245((byte) 56);
        } else if (class137.field1958 == 25 || class137.field1958 == 28) {
            if (class65.field895 == 1) {
                if (class452.field6586 > class442.field6432) {
                    class442.field6432 = class452.field6586;
                }
                int var10 = (class442.field6432 - class452.field6586) * 50 / class442.field6432;
                class186.method1119(class117.field1579, class272.field3708.method590(class105.field1434, -22602) + "<br>(" + var10 + "%)", 0, true);
            } else if (class65.field895 == 2) {
                if (class388.field5453 > class463.field6720) {
                    class463.field6720 = class388.field5453;
                }
                int var11 = ((class463.field6720 - class388.field5453) * 50 / class463.field6720) + 50;
                class186.method1119(class117.field1579, class272.field3708.method590(class105.field1434, -22602) + "<br>(" + var11 + "%)", 0, true);
            } else {
                class186.method1119(class117.field1579, class272.field3708.method590(class105.field1434, -22602), 0, true);
            }
        } else if (class137.field1958 == 30) {
            class495.method2925((byte) 108, var2);
        } else if (class137.field1958 == 40) {
            class186.method1119(class117.field1579, class137.field1955.method590(class105.field1434, -22602) + "<br>" + class273.field3718.method590(class105.field1434, -22602), 0, true);
        }
        if (class477.field6977 == 3) {
            for (int var12 = 0; var12 < class196.field2829; var12++) {
                Rectangle var13 = class113.field1527[var12];
                if (class501.field7378[var12]) {
                    class418.field6109.method1006(var13.x, -1996553985, var13.y, var13.height, 1, var13.width);
                } else if (class9.field83[var12]) {
                    class418.field6109.method1006(var13.x, -1996554240, var13.y, var13.height, 1, var13.width);
                }
            }
        }
        if (class387.method2230(2674)) {
            class377.method2178(class418.field6109, 97);
        }
        if ((class137.field1958 == 30 || class137.field1958 == 10) && class477.field6977 == 0 && class448.method2641((byte) 110) == 1 && !var9 && class397.field5525.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class196.field2829; var15++) {
                if (class9.field83[var15]) {
                    class9.field83[var15] = false;
                    class427.field6246[var14++] = class113.field1527[var15];
                }
            }
            class418.field6109.method461(class427.field6246, var14);
        } else if (class137.field1958 != 0) {
            class418.field6109.method435();
            for (int var16 = 0; var16 < class196.field2829; var16++) {
                class9.field83[var16] = false;
            }
        }
        if (class437.field6374.field4256 == 0) {
            class496.method2931((byte) 124, 15L);
        } else if (class437.field6374.field4256 == 1) {
            class496.method2931((byte) 126, 10L);
        } else if (class437.field6374.field4256 == 2) {
            class496.method2931((byte) 123, 5L);
        } else if (class437.field6374.field4256 == 3) {
            class496.method2931((byte) 126, 2L);
        }
        if (class156.field2227) {
            class61.method390((byte) 56);
        }
        if (class437.field6374.field4271 && class137.field1958 == 10 && class319.field4419 != -1) {
            class437.field6374.field4271 = false;
            class437.field6374.method557(class282.field3804, (byte) -80);
        }
        int var17 = 54 % ((-arg0 - 79) / 38);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 243)
    public static void method1188(int arg0) {
        field2799 = null;
        field2805 = null;
        field2802 = null;
        if (arg0 != -12221) {
            method1202(null);
        }
        field2801 = null;
        field2803 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 257)
    private final void method1189(byte arg0) {
        field2793++;
        class424.field6196++;
        class123.method812(-1, 0, -1, null);
        class247.method1457(-1, null, -1, arg0);
        class331.method1839(0);
        class234.field3240++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class405 var12 = class179.field2534[var2];
            if (var12 != null) {
                byte var13 = var12.field5623.field4598;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method167(-1);
                    if ((var13 & 0x2) != 0 && var12.field368 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field372[0] + var15;
                            int var18 = var12.field362[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (class442.field6435 - var14 - 1 < var17) {
                                var17 = class442.field6435 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (class232.field3217 - var14 - 1 < var18) {
                                var18 = class232.field3217 - var14 - 1;
                            }
                            int var19 = class282.method1618(var12.field362[0], var18, var14, 0, -1, true, class242.field3363, 1822767280, class6.field64[var12.field464], var12.field372[0], var14, var17, var14, 0, class247.field3443);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field372[var20] = class247.field3443[var19 - var20 - 1];
                                    var12.field362[var20] = class242.field3363[var19 - var20 - 1];
                                    var12.field367[var20] = 1;
                                }
                                var12.field368 = var19;
                            }
                        }
                    }
                    class112.method722(true, true, var12);
                    int var21 = class106.method691(var12, (byte) -101);
                    class53.method329(class102.field1403, (byte) -118, var12, class9.field100, var21);
                    class84.method594(true, var12);
                }
            }
        }
        if (class305.field4186 == 0 && class310.field4243 == 0) {
            if (class128.field1742 == 2) {
                class504.method2963(false);
            } else {
                class102.method678(false);
            }
            if ((class132.field1901 >> 7) < 14 || (class442.field6435 - 14) <= (class132.field1901 >> 7) || (class310.field4240 >> 7) < 14 || (class232.field3217 - 14) <= (class310.field4240 >> 7)) {
                class480.method2820(arg0 ^ 0x6D);
            }
        }
        while (true) {
            class44 var3;
            class295 var4;
            class295 var5;
            do {
                var3 = (class44) class103.field1409.method3071((byte) 104);
                if (var3 == null) {
                    while (true) {
                        class44 var6;
                        class295 var7;
                        class295 var8;
                        do {
                            var6 = (class44) class28.field422.method3071((byte) -120);
                            if (var6 == null) {
                                while (true) {
                                    class44 var9;
                                    class295 var10;
                                    class295 var11;
                                    do {
                                        var9 = (class44) class225.field3171.method3071((byte) -5);
                                        if (var9 == null) {
                                            if (class292.field3914 != null) {
                                                class385.method2209((byte) -46);
                                            }
                                            if (class393.field5484 % 1500 == 0) {
                                                class424.method2531(0);
                                            }
                                            class205.method1243(-109);
                                            if (class354.field4824 && class159.field2286 < class333.method1850(arg0 ^ 0xD84) - 60000L) {
                                                class477.method2805((byte) -83);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field613;
                                        if (var10.field3936 < 0) {
                                            break;
                                        }
                                        var11 = class339.method1882((byte) 100, var10.field3988);
                                    } while (var11 == null || var11.field4050 == null || var10.field3936 >= var11.field4050.length || var11.field4050[var10.field3936] != var10);
                                    class475.method2798(var9);
                                }
                            }
                            var7 = var6.field613;
                            if (var7.field3936 < 0) {
                                break;
                            }
                            var8 = class339.method1882((byte) 104, var7.field3988);
                        } while (var8 == null || var8.field4050 == null || var7.field3936 >= var8.field4050.length || var8.field4050[var7.field3936] != var7);
                        class475.method2798(var6);
                    }
                }
                var4 = var3.field613;
                if (var4.field3936 < 0) {
                    break;
                }
                var5 = class339.method1882((byte) 126, var4.field3988);
            } while (var5 == null || var5.field4050 == null || var4.field3936 >= var5.field4050.length || var5.field4050[var4.field3936] != var4);
            class475.method2798(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 461)
    public final void init() {
        field2797++;
        if (!this.method1315(49)) {
            return;
        }
        class212.field3019 = Integer.parseInt(this.getParameter("worldid"));
        class175.field2498 = class401.method2325(0, Integer.parseInt(this.getParameter("modewhere")));
        if (!class327.method1826(class175.field2498, (byte) -93) && class528.field7773 != class175.field2498) {
            class175.field2498 = class528.field7773;
        }
        class376.field5285 = class430.method2569(Integer.parseInt(this.getParameter("modewhat")), 0);
        if (class463.field6722 != class376.field5285 && class376.field5285 != class320.field4430 && class376.field5285 != class178.field2525) {
            class376.field5285 = class178.field2525;
        }
        try {
            class105.field1434 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class105.field1434 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class44.field603 = true;
        } else {
            class44.field603 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class205.field2911 = true;
        } else {
            class205.field2911 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class266.field3652 = true;
        } else {
            class266.field3652 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class341.field4700 = class288.field3885;
        } else {
            class341.field4700 = class166.field2348;
        }
        try {
            class246.field3426 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class246.field3426 = 0;
        }
        class153.field2206 = this.getParameter("quiturl");
        class41.field561 = this.getParameter("settings");
        if (class41.field561 == null) {
            class41.field561 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class336.field4635 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class336.field4635 = 0;
            }
        }
        class188.field2609 = Integer.parseInt(this.getParameter("colourid"));
        if (class188.field2609 < 0 || class188.field2609 >= class204.field2897.length) {
            class188.field2609 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class489.field7136 = true;
            class220.field3082 = true;
        }
        if (class341.field4700 == class166.field2348) {
            class95.field1311 = 765;
            class260.field3581 = 503;
        } else if (class341.field4700 == class288.field3885) {
            class260.field3581 = 480;
            class95.field1311 = 640;
        }
        class407.field5639 = this;
        this.method1309(true, 586, class95.field1311, class376.field5285.method141((byte) 103) + 32, class260.field3581);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 560)
    private final void method1190(int arg0, int arg1) {
        class119.field1625.field6226 = arg0;
        field2787++;
        class530.field7791 = null;
        class272.field3714 = null;
        class119.field1625.field6227++;
        class268.field3684 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lss;)Lvt;", line = 574)
    public static final class197 method1191(class295 arg0) {
        class197 var1 = (class197) class482.field7074.method979((byte) 28, ((long) arg0.field4073 << 32) + (long) arg0.field3936);
        return var1 == null ? arg0.field3947 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 583)
    public static final void method1192() {
        for (int var0 = 0; var0 < class442.field6435; var0++) {
            int[] var1 = class149.field2110[var0];
            for (int var2 = 0; var2 < class232.field3217; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 603)
    public final void method1193(int arg0) {
        field2791++;
        if (class137.field1958 == 1000) {
            return;
        }
        class393.field5484++;
        if (class393.field5484 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class65.field887 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class432.field6288.setSeed((long) class65.field887);
        }
        if ((class393.field5484 % 50) == 0) {
            class61.field838 = class88.field1207;
            class88.field1207 = 0;
            class473.field6910 = class124.field1702;
            class124.field1702 = 0;
        }
        this.method1203((byte) -32);
        if (class186.field2589 != null) {
            class186.field2589.method2982(-5);
        }
        class309.method1755(-13359);
        class488.field7125.method1214(false);
        class332.field4528.method53(91);
        if (class66.field911 != null) {
            int var3 = class66.field911.method1680(-5935);
            class530.field7810 = var3;
        }
        if (class418.field6109 != null) {
            class418.field6109.method496((int) class333.method1850(-3562));
        }
        class45.method285(-20);
        class171.field2449 = 0;
        for (class43 var4 = class488.field7125.method1215((byte) -113); var4 != null && class171.field2449 < 128; var4 = class488.field7125.method1215((byte) -51)) {
            if (var4.method272(124) != 1) {
                char var5 = var4.method274(51);
                if (!class488.method2868(0) || !(var5 == '`' || var5 == '§')) {
                    class270.field3697[class171.field2449] = var4;
                    class171.field2449++;
                } else if (class387.method2230(2674)) {
                    class425.method2547(34037);
                } else {
                    class190.method1143(-127);
                }
            }
        }
        for (class386 var6 = class332.field4528.method51((byte) 116); var6 != null; var6 = class332.field4528.method51((byte) 119)) {
            int var7 = var6.method2217(2879);
            if (var7 == -1) {
                class233.field3230.method3070(var6, (byte) -128);
            } else if (class327.method1827(-4427, var7)) {
                class192.field2700.method3070(var6, (byte) -123);
            }
            if (class192.field2700.method3064((byte) 126) > 10) {
                class192.field2700.method3071((byte) -122);
            }
        }
        if (class387.method2230(2674)) {
            class302.method1722(102);
        }
        if (class137.field1958 == 0) {
            this.method1200(0);
            class109.method704(-7033);
        } else if (class137.field1958 == 5) {
            this.method1200(0);
            class109.method704(-7033);
        } else if (class137.field1958 == 25 || class137.field1958 == 28) {
            class79.method577(true);
        }
        if (arg0 >= -110) {
            return;
        }
        if (class137.field1958 == 10) {
            this.method1189((byte) -110);
            class106.method689((byte) -17);
            class362.method2037((byte) 48);
            class378.method2180(110);
        } else if (class137.field1958 == 30) {
            class432.method2576(true);
        } else if (class137.field1958 == 40) {
            class378.method2180(70);
            if (class320.field4424 != -3 && class320.field4424 != 2 && class320.field4424 != 15) {
                class528.method3102(-125);
            }
        }
        class9.method62(0, class418.field6109);
        class192.field2700.method3071((byte) 10);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 748)
    public static final void main(String[] arg0) {
        field2789++;
        try {
            if (arg0.length != 4) {
                class66.method415((byte) 54, "argument count");
            }
            class212.field3019 = Integer.parseInt(arg0[0]);
            class175.field2498 = class457.field6678;
            if (arg0[1].equals("live")) {
                class376.field5285 = class178.field2525;
            } else if (arg0[1].equals("rc")) {
                class376.field5285 = class320.field4430;
            } else if (arg0[1].equals("wip")) {
                class376.field5285 = class463.field6722;
            } else {
                class66.method415((byte) -82, "modewhat");
            }
            class105.field1434 = class453.method2677(arg0[2], 0);
            if (class105.field1434 == -1) {
                if (arg0[2].equals("english")) {
                    class105.field1434 = 0;
                } else if (arg0[2].equals("german")) {
                    class105.field1434 = 1;
                } else {
                    class66.method415((byte) -99, "language");
                }
            }
            class205.field2911 = false;
            class44.field603 = false;
            if (arg0[3].equals("game0")) {
                class341.field4700 = class166.field2348;
            } else if (arg0[3].equals("game1")) {
                class341.field4700 = class288.field3885;
            } else {
                class66.method415((byte) -105, "game");
            }
            class489.field7136 = true;
            class220.field3082 = true;
            class41.field561 = "";
            class188.field2609 = class341.field4700.field2232;
            class246.field3426 = 0;
            class336.field4635 = 0;
            client var1 = new client();
            class407.field5639 = var1;
            var1.method1318(30, 768, class341.field4700.field2235, false, class376.field5285.method141((byte) 103) + 32, 1024, 586, false);
            class140.field1993.setLocation(40, 40);
        } catch (Exception var3) {
            class162.method1000((byte) 44, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 813)
    private final void method1194(boolean arg0) {
        field2798++;
        if (class476.field6965 < class119.field1625.field6227) {
            class411.field6023 = (class119.field1625.field6227 - 1) * 5 * 50;
            if (class85.field1172 == class33.field472) {
                class85.field1172 = class325.field4460;
            } else {
                class85.field1172 = class33.field472;
            }
            if (class411.field6023 > 3000) {
                class411.field6023 = 3000;
            }
            if (class119.field1625.field6227 >= 2 && class119.field1625.field6226 == 6) {
                this.method1308(0, "js5connect_outofdate");
                class137.field1958 = 1000;
                return;
            }
            if (class119.field1625.field6227 >= 4 && class119.field1625.field6226 == -1) {
                this.method1308(0, "js5crc");
                class137.field1958 = 1000;
                return;
            }
            if (class119.field1625.field6227 >= 4 && (class137.field1958 == 0 || class137.field1958 == 5)) {
                if (class119.field1625.field6226 == 7 || class119.field1625.field6226 == 9) {
                    this.method1308(0, "js5connect_full");
                } else if (class119.field1625.field6226 > 0) {
                    this.method1308(0, "js5connect");
                } else {
                    this.method1308(0, "js5io");
                }
                class137.field1958 = 1000;
                return;
            }
        }
        class476.field6965 = class119.field1625.field6227;
        if (class411.field6023 > 0) {
            class411.field6023--;
            return;
        }
        if (!arg0) {
            this.method1189((byte) 82);
        }
        try {
            if (class268.field3684 == 0) {
                class530.field7791 = class282.field3804.method2281(arg0, class85.field1172, class54.field751);
                class268.field3684++;
            }
            if (class268.field3684 == 1) {
                if (class530.field7791.field5652 == 2) {
                    this.method1190(1000, 0);
                    return;
                }
                if (class530.field7791.field5652 == 1) {
                    class268.field3684++;
                }
            }
            if (class268.field3684 == 2) {
                class272.field3714 = new class95((Socket) class530.field7791.field5654, class282.field3804);
                class365 var2 = new class365(5);
                var2.method2084(class255.field3540.field3043, !arg0);
                var2.method2074(!arg0, 586);
                class272.field3714.method643(var2.field5073, 5, -1, 0);
                class268.field3684++;
                class308.field4221 = class333.method1850(-3562);
            }
            if (class268.field3684 == 3) {
                if (class137.field1958 == 0 || class137.field1958 == 5 || class272.field3714.method645((byte) -87) > 0) {
                    int var3 = class272.field3714.method650((byte) -51);
                    if (var3 != 0) {
                        this.method1190(var3, 0);
                        return;
                    }
                    class268.field3684++;
                } else if (class333.method1850(-3562) - class308.field4221 > 30000L) {
                    this.method1190(1001, 0);
                    return;
                }
            }
            if (class268.field3684 == 4) {
                boolean var4 = class137.field1958 == 5 || class137.field1958 == 10 || class137.field1958 == 28;
                class119.field1625.method2540(!var4, 96, class272.field3714);
                class268.field3684 = 0;
                class530.field7791 = null;
                class272.field3714 = null;
            }
        } catch (IOException var5) {
            this.method1190(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V", line = 962)
    private final void method1195(byte[] arg0, boolean arg1) {
        field2796++;
        class365 var3 = new class365(arg0);
        if (arg1) {
            field2799 = null;
        }
        while (true) {
            int var4;
            label47: do {
                while (true) {
                    while (true) {
                        var4 = var3.method2099(255);
                        if (var4 == 0) {
                            return;
                        }
                        if (var4 == 1) {
                            int[] var9 = class157.field2233 = new int[6];
                            var9[0] = var3.method2062((byte) 14);
                            var9[1] = var3.method2062((byte) 14);
                            var9[2] = var3.method2062((byte) 14);
                            var9[3] = var3.method2062((byte) 14);
                            var9[4] = var3.method2062((byte) 14);
                            var9[5] = var3.method2062((byte) 14);
                        } else {
                            if (var4 != 4) {
                                continue label47;
                            }
                            int var7 = var3.method2099(255);
                            class307.field4212 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                class307.field4212[var8] = var3.method2062((byte) 14);
                                if (class307.field4212[var8] == 65535) {
                                    class307.field4212[var8] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var4 != 5);
            int var5 = var3.method2099(255);
            class138.field1985 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class138.field1985[var6] = var3.method2062((byte) 14);
                if (class138.field1985[var6] == 65535) {
                    class138.field1985[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1036)
    public final void method1196(int arg0) {
        if (class354.field4824) {
            class477.method2805((byte) -86);
        }
        field2788++;
        if (class418.field6109 != null) {
            class418.field6109.method1001((byte) -128);
        }
        if (class38.field513 != null) {
            class159.method978(-102, class282.field3804, class38.field513);
            class38.field513 = null;
        }
        int var2 = -6 / ((arg0 - 22) / 56);
        if (class117.field1578 != null) {
            class117.field1578.method644(-104);
            class117.field1578 = null;
        }
        if (class66.field911 != null) {
            class66.field911.method1678(8212, class474.field6924);
        }
        class66.field911 = null;
        class476.method2802(-634);
        class119.field1625.method2546(24726);
        class231.field3207.method1873(true);
        if (class309.field4235 != null) {
            class309.field4235.method1550(108);
            class309.field4235 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1079)
    public static final void method1197() {
        class510.field7483 = 0;
        for (int var0 = 0; var0 < class166.field2352; var0++) {
            class405 var1 = class179.field2534[class54.field750[var0]];
            if (var1.field353 && var1.method162((byte) 85) != -1) {
                int var2 = (var1.method167(-1) - 1) * 64 + 60;
                int var3 = var1.field466 - var2 >> 7;
                int var4 = var1.field461 - var2 >> 7;
                class22 var5 = class403.method2337(var4, var3, (byte) -96, var1.field464);
                if (var5 != null) {
                    int var6 = var5.field297;
                    if (var5 instanceof class405) {
                        var6 += 2048;
                    }
                    if (var5.field314 == 0 && var5.method162((byte) 115) != -1) {
                        class415.field6086[class510.field7483] = var6;
                        class1.field4[class510.field7483] = var6;
                        class510.field7483++;
                        var5.field314++;
                    }
                    class415.field6086[class510.field7483] = var6;
                    class1.field4[class510.field7483] = var1.field297 + 2048;
                    class510.field7483++;
                    var5.field314++;
                }
            }
        }
        class21.method152(0, -128, class1.field4, class510.field7483 - 1, class415.field6086);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1128)
    public static final void method1198(int arg0) {
        int var1 = class378.field5322;
        int[] var2 = class95.field1321;
        for (int var3 = 0; var3 < class166.field2352 + var1; var3++) {
            class22 var4;
            if (var3 < var1) {
                var4 = class309.field4234[var2[var3]];
            } else {
                var4 = class179.field2534[class54.field750[var3 - var1]];
            }
            if (var4.field464 == arg0 && var4.field306 >= 0) {
                int var5 = var4.method167(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field466 & 0x7F) != 0 || (var4.field461 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field466 & 0x7F) != 64 || (var4.field461 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field466 >> 7;
                    int var7 = var4.field461 >> 7;
                    if (var4.field306 > class149.field2110[var6][var7]) {
                        class149.field2110[var6][var7] = var4.field306;
                        class162.field2319[var6][var7] = 1;
                    } else if (class149.field2110[var6][var7] == var4.field306) {
                        var10002 = class162.field2319[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field466 - var8 >> 7;
                    int var10 = var4.field461 - var8 >> 7;
                    int var11 = var4.field466 + var8 >> 7;
                    int var12 = var4.field461 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field306 > class149.field2110[var13][var14]) {
                                class149.field2110[var13][var14] = var4.field306;
                                class162.field2319[var13][var14] = 1;
                            } else if (class149.field2110[var13][var14] == var4.field306) {
                                var10002 = class162.field2319[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lss;)Lss;", line = 1227)
    public static final class295 method1199(class295 arg0) {
        int var1 = method1191(arg0).method1227(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class339.method1882((byte) 78, arg0.field3988);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1247)
    private final void method1200(int arg0) {
        field2800++;
        if (!class437.field6374.field4271) {
            for (int var2 = 0; var2 < class171.field2449; var2++) {
                if (class270.field3697[var2].method274(-79) == 's' || class270.field3697[var2].method274(116) == 'S') {
                    class437.field6374.field4271 = true;
                    break;
                }
            }
        }
        if (class57.field778 == arg0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class333.method1850(-3562);
            if (class419.field6127 == 0L) {
                class419.field6127 = var5;
            }
            if (var4 > 16384 && var5 - class419.field6127 < 5000L) {
                if (var5 - class377.field5310 > 1000L) {
                    System.gc();
                    class377.field5310 = var5;
                }
                class272.field3712 = field2803.method590(class105.field1434, arg0 ^ 0xFFFFA7B6);
                class40.field544 = 5;
            } else {
                class272.field3712 = class323.field4451.method590(class105.field1434, -22602);
                class57.field778 = 10;
                class40.field544 = 5;
            }
        } else if (class57.field778 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class6.field64[var7] = class250.method1472((byte) -42, class232.field3217, class442.field6435);
            }
            class272.field3712 = class105.field1432.method590(class105.field1434, -22602);
            class40.field544 = 10;
            class57.field778 = 20;
        } else if (class57.field778 == 20) {
            if (class186.field2589 == null) {
                class186.field2589 = new class507(class119.field1625, class231.field3207);
            }
            if (class186.field2589.method2981(108)) {
                class254.field3528 = class4.method25(0, true, 1, false, -93);
                class464.field6747 = class4.method25(1, true, 1, false, arg0 ^ 0xFFFFFF8E);
                class249.field3463 = class4.method25(2, true, 1, false, -107);
                class300.field4126 = class4.method25(3, true, 1, false, arg0 ^ 0xFFFFFFA2);
                class266.field3645 = class4.method25(4, true, 1, false, -123);
                class241.field3334 = class4.method25(5, true, 1, true, -109);
                class252.field3511 = class4.method25(6, false, 1, true, arg0 - 106);
                class86.field1188 = class4.method25(7, true, 1, false, -104);
                class192.field2735 = class4.method25(8, true, 1, false, -113);
                class148.field2095 = class4.method25(9, true, 1, false, -122);
                class364.field5047 = class4.method25(10, true, 1, false, -86);
                field2802 = class4.method25(11, true, 1, false, -101);
                class348.field4773 = class4.method25(12, true, 1, false, -105);
                class103.field1412 = class4.method25(13, true, 1, false, arg0 - 96);
                class63.field872 = class4.method25(14, false, 1, false, -106);
                class528.field7767 = class4.method25(15, true, 1, false, arg0 - 117);
                class370.field5195 = class4.method25(16, true, 1, false, -104);
                class288.field3883 = class4.method25(17, true, 1, false, -124);
                class430.field6268 = class4.method25(18, true, 1, false, -111);
                class435.field6343 = class4.method25(19, true, 1, false, -110);
                class204.field2893 = class4.method25(20, true, 1, false, arg0 ^ 0xFFFFFFA5);
                class1.field16 = class4.method25(21, true, 1, false, -84);
                class156.field2225 = class4.method25(22, true, 1, false, arg0 ^ 0xFFFFFF80);
                class87.field1193 = class4.method25(23, true, 1, true, -97);
                class274.field3727 = class4.method25(24, true, 1, false, -86);
                class418.field6120 = class4.method25(25, true, 1, false, arg0 - 96);
                class322.field4448 = class4.method25(26, true, 1, true, -121);
                class104.field1415 = class4.method25(27, true, 1, false, -114);
                class261.field3593 = class4.method25(28, true, 1, true, -112);
                class91.field1226 = class4.method25(29, true, 1, false, -128);
                class272.field3712 = class223.field3136.method590(class105.field1434, arg0 ^ 0xFFFFA7B6);
                class57.field778 = 30;
                class40.field544 = 15;
            } else {
                class272.field3712 = class468.field6846.method590(class105.field1434, -22602);
                class40.field544 = 12;
            }
        } else if (class57.field778 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class14.field165[var9].method3040((byte) 108) * class231.field3210[var9] / 100;
            }
            if (var8 == 100) {
                class272.field3712 = class467.field6808.method590(class105.field1434, arg0 - 22602);
                class40.field544 = 20;
                class190.method1141(class192.field2735, (byte) -9);
                class391.method2244((byte) 67, class192.field2735);
                class57.field778 = 40;
            } else {
                if (var8 != 0) {
                    class272.field3712 = class344.field4739.method590(class105.field1434, -22602) + var8 + "%";
                }
                class40.field544 = 20;
            }
        } else if (class57.field778 == 40) {
            if (class261.field3593.method1402(3365)) {
                this.method1195(class261.field3593.method1388(1, (byte) -70), false);
                class272.field3712 = class169.field2393.method590(class105.field1434, arg0 - 22602);
                class57.field778 = 50;
                class40.field544 = 25;
            } else {
                class272.field3712 = class159.field2280.method590(class105.field1434, arg0 - 22602) + class261.field3593.method1409(arg0 + 52) + "%";
                class40.field544 = 25;
            }
        } else if (class57.field778 == 50) {
            class150.method953(arg0 ^ 0x800);
            class272.field3712 = class197.field2839.method590(class105.field1434, arg0 - 22602);
            class40.field544 = 30;
            class57.field778 = 60;
        } else if (class57.field778 == 60) {
            int var10 = class364.method2054((byte) 63, class192.field2735, class103.field1412);
            int var11 = class299.method1707(6);
            if (var11 > var10) {
                class272.field3712 = class294.field3918.method590(class105.field1434, -22602) + var10 * 100 / var11 + "%";
                class40.field544 = 35;
            } else {
                class272.field3712 = class112.field1519.method590(class105.field1434, arg0 - 22602);
                class40.field544 = 35;
                class57.field778 = 70;
            }
        } else if (class57.field778 == 70) {
            int var12 = class496.method2929(arg0 ^ 0xFFFFFFF8, class192.field2735);
            int var13 = class114.method734((byte) 118);
            if (var13 > var12) {
                class272.field3712 = class317.field4397.method590(class105.field1434, -22602) + var12 * 100 / var13 + "%";
                class40.field544 = 40;
            } else {
                class272.field3712 = class89.field1218.method590(class105.field1434, -22602);
                class40.field544 = 40;
                class57.field778 = 80;
            }
        } else if (class57.field778 == 80) {
            if (class322.field4448.method1402(3365)) {
                class456.field6677 = new class281(class322.field4448, class148.field2095, class192.field2735);
                class272.field3712 = class160.field2292.method590(class105.field1434, -22602);
                class57.field778 = 90;
                class40.field544 = 45;
            } else {
                class272.field3712 = class304.field4163.method590(class105.field1434, -22602) + class322.field4448.method1409(56) + "%";
                class40.field544 = 45;
            }
        } else if (class57.field778 == 90) {
            class272.field3712 = class405.field5624.method590(class105.field1434, -22602);
            class57.field778 = 95;
            class40.field544 = 50;
        } else if (class57.field778 == 95) {
            if (class437.field6374.field4271) {
                class437.field6374.field4275 = 0;
                class437.field6374.field4272 = 0;
                class437.field6374.field4263 = 1;
                class437.field6374.field4254 = 0;
                class437.field6374.field4280 = 0;
            }
            class437.field6374.field4271 = true;
            class437.field6374.method557(class282.field3804, (byte) -80);
            class465.method2730(false, (byte) 70, class437.field6374.field4272);
            class272.field3712 = class332.field4527.method590(class105.field1434, -22602);
            class57.field778 = 100;
            class40.field544 = 55;
        } else if (class57.field778 == 100) {
            class9.method57(class103.field1412, class418.field6109, class192.field2735, true);
            class272.field3712 = class288.field3882.method590(class105.field1434, arg0 ^ 0xFFFFA7B6);
            class40.field544 = 60;
            class26.method186(5, 8);
            class57.field778 = 110;
        } else if (class57.field778 == 110) {
            byte var14 = 0;
            class249.field3463.method1402(3365);
            int var15 = var14 + class249.field3463.method1409(arg0 ^ 0x72);
            class370.field5195.method1402(3365);
            int var16 = var15 + class370.field5195.method1409(61);
            class288.field3883.method1402(3365);
            int var17 = var16 + class288.field3883.method1409(arg0 + 59);
            class430.field6268.method1402(3365);
            int var18 = var17 + class430.field6268.method1409(arg0 + 5);
            class435.field6343.method1402(3365);
            int var19 = var18 + class435.field6343.method1409(66);
            class204.field2893.method1402(arg0 + 3365);
            int var20 = var19 + class204.field2893.method1409(29);
            class1.field16.method1402(3365);
            int var21 = var20 + class1.field16.method1409(31);
            class156.field2225.method1402(3365);
            int var22 = var21 + class156.field2225.method1409(123);
            class274.field3727.method1402(3365);
            int var23 = var22 + class274.field3727.method1409(arg0 + 24);
            class418.field6120.method1402(3365);
            int var24 = var23 + class418.field6120.method1409(33);
            class104.field1415.method1402(3365);
            int var25 = var24 + class104.field1415.method1409(80);
            class91.field1226.method1402(arg0 ^ 0xD25);
            int var26 = var25 + class91.field1226.method1409(87);
            if (var26 < 1200) {
                class272.field3712 = class471.field6888.method590(class105.field1434, -22602) + var26 / 12 + "%";
                class40.field544 = 65;
            } else {
                class284.field3819 = new class179(class341.field4700, class105.field1434, class249.field3463);
                class20.field211 = new class427(class341.field4700, class105.field1434, class249.field3463);
                class504.field7419 = new class146(class341.field4700, class105.field1434, class249.field3463, class192.field2735);
                class455.field6640 = new class255(class341.field4700, class105.field1434, class288.field3883);
                class306.field4201 = new class210(class341.field4700, class105.field1434, class249.field3463);
                class528.field7770 = new class506(class341.field4700, class105.field1434, class249.field3463);
                class201.field2873 = new class230(class341.field4700, class105.field1434, class249.field3463, class86.field1188);
                class309.field4237 = new class217(class341.field4700, class105.field1434, class249.field3463);
                class269.field3686 = new class260(class341.field4700, class105.field1434, class249.field3463);
                class82.field1154 = new class367(class341.field4700, class105.field1434, true, class370.field5195, class86.field1188);
                class436.field6349 = new class131(class341.field4700, class105.field1434, class249.field3463, class192.field2735);
                class414.field6075 = new class275(class341.field4700, class105.field1434, class249.field3463, class192.field2735);
                class398.field5549 = new class479(class341.field4700, class105.field1434, true, class430.field6268, class86.field1188);
                class75.field1097 = new class125(class341.field4700, class105.field1434, true, class284.field3819, class435.field6343, class86.field1188);
                class169.field2401 = new class376(class341.field4700, class105.field1434, class249.field3463);
                class275.field3740 = new class253(class341.field4700, class105.field1434, class204.field2893, class254.field3528, class464.field6747);
                class56.field771 = new class285(class341.field4700, class105.field1434, class249.field3463);
                class504.field7416 = new class236(class341.field4700, class105.field1434, class249.field3463);
                class492.field7279 = new class387(class341.field4700, class105.field1434, class1.field16, class86.field1188);
                class94.field1258 = new class77(class341.field4700, class105.field1434, class249.field3463);
                class242.field3365 = new class326(class341.field4700, class105.field1434, class249.field3463);
                class97.field1339 = new class6(class341.field4700, class105.field1434, class249.field3463);
                class389.field5456 = new class338(class341.field4700, class105.field1434, class156.field2225);
                class468.field6847 = new class222(class341.field4700, class105.field1434, class249.field3463);
                class163.method1015(class103.field1412, -23978, class86.field1188, class192.field2735, class300.field4126);
                class28.method193(class91.field1226, 0);
                class118.field1585 = new class57(class105.field1434, class274.field3727, class418.field6120);
                class517.field7602 = new class1(class105.field1434, class274.field3727, class418.field6120, new class361());
                class272.field3712 = class340.field4687.method590(class105.field1434, -22602);
                class40.field544 = 65;
                class78.method573((byte) -58);
                class82.field1154.method2125(64, !class437.field6374.method560((byte) 115, class278.field3761));
                class453.field6623 = new class339();
                class350.method1937(2);
                class379.method2186(class104.field1415, (byte) -100);
                class458.method2695(class86.field1188, class456.field6677, (byte) -97);
                class57.field778 = 120;
            }
        } else if (class57.field778 == 120) {
            int var27 = class224.method1325(false, class192.field2735);
            int var28 = class157.method973(-256);
            if (var27 < var28) {
                class272.field3712 = class201.field2874.method590(class105.field1434, -22602) + var27 * 100 / var28 + "%";
                class40.field544 = 70;
            } else {
                class87.method608(class418.field6109, -78, class192.field2735);
                class3.method11(arg0 - 229, class354.field4830);
                class272.field3712 = class414.field6079.method590(class105.field1434, -22602);
                class40.field544 = 70;
                class57.field778 = 130;
            }
        } else if (class57.field778 == 130) {
            if (class364.field5047.method1413("", 0, "huffman")) {
                class383 var29 = new class383(class364.field5047.method1407("huffman", (byte) -33, ""));
                class190.method1142(31590, var29);
                class272.field3712 = class453.field6626.method590(class105.field1434, -22602);
                class40.field544 = 75;
                class57.field778 = 140;
            } else {
                class272.field3712 = class522.field7700.method590(class105.field1434, arg0 - 22602) + "0%";
                class40.field544 = 75;
            }
        } else if (class57.field778 == 140) {
            if (class300.field4126.method1402(3365)) {
                class272.field3712 = class1.field3.method590(class105.field1434, arg0 - 22602);
                class40.field544 = 80;
                class57.field778 = 150;
            } else {
                class272.field3712 = class110.field1506.method590(class105.field1434, -22602) + class300.field4126.method1409(87) + "%";
                class40.field544 = 80;
            }
        } else if (class57.field778 == 150) {
            if (class348.field4773.method1402(3365)) {
                class272.field3712 = class42.field593.method590(class105.field1434, arg0 - 22602);
                class57.field778 = 160;
                class40.field544 = 82;
            } else {
                class272.field3712 = class141.field2000.method590(class105.field1434, -22602) + class348.field4773.method1409(arg0 ^ 0x11) + "%";
                class40.field544 = 82;
            }
        } else if (class57.field778 == 160) {
            if (class103.field1412.method1402(3365)) {
                class272.field3712 = class412.field6036.method590(class105.field1434, -22602);
                class40.field544 = 85;
                class57.field778 = 170;
            } else {
                class272.field3712 = class412.field6036.method590(class105.field1434, -22602) + class103.field1412.method1409(21) + "%";
                class40.field544 = 85;
            }
        } else if (class57.field778 == 170) {
            if (class87.field1193.method1400(arg0 + 60, "details")) {
                class481.method2824(class87.field1193, class306.field4201, class528.field7770, class82.field1154, class436.field6349, class414.field6075, class453.field6623);
                class272.field3712 = class79.field1129.method590(class105.field1434, -22602);
                class40.field544 = 89;
                class57.field778 = 180;
            } else {
                class272.field3712 = class234.field3241.method590(class105.field1434, -22602) + class87.field1193.method1408((byte) 43, "details") + "%";
                class40.field544 = 87;
            }
        } else if (class57.field778 == 180) {
            int var30 = class35.method220(2);
            if (var30 == -1) {
                class272.field3712 = class152.field2133.method590(class105.field1434, -22602);
                class40.field544 = 90;
            } else if (var30 == 7 || var30 == 9) {
                this.method1308(0, "worldlistfull");
                class26.method186(1000, 8);
            } else if (class510.field7494) {
                class272.field3712 = field2801.method590(class105.field1434, arg0 - 22602);
                class40.field544 = 90;
                class57.field778 = 190;
            } else {
                this.method1308(arg0, "worldlistio_" + var30);
                class26.method186(1000, 8);
            }
        } else if (class57.field778 == 190) {
            class505.field7432 = new int[class97.field1339.field69];
            class326.field4473 = new boolean[class97.field1339.field69];
            class92.field1240 = new String[class242.field3365.field4472];
            for (int var31 = 0; var31 < class97.field1339.field69; var31++) {
                if (class97.field1339.method36(var31, true).field6076 == 0) {
                    class326.field4473[var31] = true;
                    class371.field5212++;
                }
                class505.field7432[var31] = -1;
            }
            class437.method2609(16409);
            class474.field6923 = class300.field4126.method1396("loginscreen", (byte) 71);
            class241.field3334.method1419(0, false, true);
            class252.field3511.method1419(0, true, true);
            class192.field2735.method1419(0, true, true);
            class103.field1412.method1419(0, true, true);
            class364.field5047.method1419(0, true, true);
            class300.field4126.method1419(0, true, true);
            class156.field2227 = true;
            class249.field3463.field3322 = 2;
            class288.field3883.field3322 = 2;
            class370.field5195.field3322 = 2;
            class430.field6268.field3322 = 2;
            class435.field6343.field3322 = 2;
            class204.field2893.field3322 = 2;
            class1.field16.field3322 = 2;
            class161.method997(-1, false, -1, class437.field6374.field4263, false);
            class272.field3712 = class13.field163.method590(class105.field1434, -22602);
            class57.field778 = 200;
            class40.field544 = 95;
        } else if (class57.field778 == 200) {
            class401.method2323(true, arg0 ^ 0xFFFFEDEA);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lss;IIIIIIIII)V", line = 1797)
    public static final void method1201(class295[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class295 var11 = arg0[var10];
            if (var11 != null && var11.field3988 == arg1) {
                int var12 = var11.field4063 + arg6;
                int var13 = var11.field3982 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field3984 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field4022 + var12;
                    int var19 = var11.field3960 + var13;
                    if (var11.field3984 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field3984 == 0 || var11.field3952 || method1191(var11).field2833 != 0 || class177.field2509 == var11 || class162.field2313 == var11.field3995) {
                    if (!method1202(var11)) {
                        if (class292.field3914 == var11) {
                            class492.field7271 = true;
                            class311.field4259 = var12;
                            class245.field3419 = var13;
                        }
                        if (var11.field3939 || var14 < var16 && var15 < var17) {
                            if (var11.field4042 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class44 var20 = (class44) class225.field3171.method3072((byte) 30); var20 != null; var20 = (class44) class225.field3171.method3066(2)) {
                                    if (var20.field602) {
                                        var20.method2946(-97);
                                        var20.field613.field3930 = false;
                                    }
                                }
                                if (class185.field2583 == 0) {
                                    class292.field3914 = null;
                                    class177.field2509 = null;
                                }
                                class78.field1127 = 0;
                                class483.field7087 = false;
                                class530.field7807 = false;
                                if (!class9.field86) {
                                    class340.method1897(0);
                                }
                            }
                            boolean var21;
                            if (class332.field4528.method54(103) >= var14 && class332.field4528.method55((byte) -127) >= var15 && class332.field4528.method54(64) < var16 && class332.field4528.method55((byte) -82) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class297.field4101 && var21) {
                                if (var11.field4054 >= 0) {
                                    class287.field3858 = var11.field4054;
                                } else if (var11.field4042) {
                                    class287.field3858 = -1;
                                }
                            }
                            if (!class9.field86 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class65.method406(arg9 - var13, var11, true, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class332.field4528.method52(0) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class386 var24 = (class386) class192.field2700.method3072((byte) 87);
                            if (var24 != null && var24.method2217(2879) == 0 && var24.method2220(-1243743073) >= var14 && var24.method2221(-3) >= var15 && var24.method2220(-1243743073) < var16 && var24.method2221(-3) < var17) {
                                var23 = true;
                            }
                            if (var11.field4068 != null) {
                                for (int var25 = 0; var25 < var11.field4068.length; var25++) {
                                    if (class488.field7125.method1212(-1, var11.field4068[var25])) {
                                        if (var11.field4028 == null || class393.field5484 >= var11.field4028[var25]) {
                                            byte var26 = var11.field4008[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class488.field7125.method1212(-1, 86) && !class488.field7125.method1212(-1, 82) && !class488.field7125.method1212(-1, 81)) && ((var26 & 0x2) == 0 || class488.field7125.method1212(-1, 86)) && ((var26 & 0x1) == 0 || class488.field7125.method1212(-1, 82)) && ((var26 & 0x4) == 0 || class488.field7125.method1212(-1, 81))) {
                                                if (var25 < 10) {
                                                    class322.method1814(var25 + 1, 7, "", -1, var11.field4073);
                                                } else if (var25 == 10) {
                                                    class370.method2145(-1);
                                                    class197 var27 = method1191(var11);
                                                    class437.method2610(var27.method1222(24805), 19, var11, var27.field2835);
                                                    class344.field4734 = class215.method1283(var11, -26825);
                                                    if (class344.field4734 == null) {
                                                        class344.field4734 = "Null";
                                                    }
                                                    class526.field7728 = var11.field3943 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field4032[var25];
                                                if (var11.field4028 == null) {
                                                    var11.field4028 = new int[var11.field4068.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field4028[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field4028[var25] = class393.field5484 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field4028 != null) {
                                        var11.field4028[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class85.method601(var11, false, var24.method2220(-1243743073) - var12, var24.method2221(-3) - var13);
                            }
                            if (class292.field3914 != null && class292.field3914 != var11 && var21 && method1191(var11).method1223(3091573)) {
                                class452.field6524 = var11;
                            }
                            if (class177.field2509 == var11) {
                                class23.field378 = true;
                                class49.field667 = var12;
                                class191.field2690 = var13;
                            }
                            if (var11.field3952 || var11.field3995 != 0) {
                                if (var21 && class530.field7810 != 0 && var11.field4006 != null) {
                                    class44 var29 = new class44();
                                    var29.field602 = true;
                                    var29.field613 = var11;
                                    var29.field606 = class530.field7810;
                                    var29.field612 = var11.field4006;
                                    class225.field3171.method3070(var29, (byte) -122);
                                }
                                if (class292.field3914 != null || class9.field86 || class246.field3432 != var11.field3995 && class78.field1127 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field3995 != 0) {
                                    if (class496.field7306 == var11.field3995 || class242.field3369 == var11.field3995) {
                                        class515.field7561 = var11;
                                        if (class325.field4462 != null) {
                                            class325.field4462.method2190(class418.field6109, var11.field3960, (byte) 59);
                                        }
                                        if (class496.field7306 == var11.field3995) {
                                            if (!class9.field86 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class159.method983(class418.field6109, arg8, arg9, 14349);
                                                for (class430 var30 = (class430) class428.field6257.method2306(119); var30 != null; var30 = (class430) class428.field6257.method2302(-86)) {
                                                    if (arg8 >= var30.field6272 && arg8 < var30.field6271 && arg9 >= var30.field6263 && arg9 < var30.field6264) {
                                                        class340.method1897(0);
                                                        class500.method2949((byte) 116, var30.field6262);
                                                    }
                                                }
                                            }
                                            class123.method812(var12, 0, var13, var11);
                                            continue;
                                        }
                                    }
                                    if (class162.field2313 == var11.field3995) {
                                        if (var11.method1690(-1, class418.field6109) == null || class166.field2346 != 0 && class166.field2346 != 3 || class9.field86 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field3923[var32];
                                        if (var31 < var33 || var31 > var11.field4030[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field4022 / 2;
                                        int var35 = var32 - var11.field3960 / 2;
                                        int var36;
                                        if (class128.field1742 == 4) {
                                            var36 = (int) class40.field553 & 0x3FFF;
                                        } else {
                                            var36 = (int) class40.field553 + class22.field349 & 0x3FFF;
                                        }
                                        int var37 = class377.field5316[var36];
                                        int var38 = class377.field5315[var36];
                                        if (class128.field1742 != 4) {
                                            var37 = (class482.field7072 + 256) * var37 >> 8;
                                            var38 = (class482.field7072 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class128.field1742 == 4) {
                                            var41 = (class127.field1740 >> 7) + (var39 >> 2);
                                            var42 = (class509.field7470 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class75.field1089.method167(-1) - 1) * 64;
                                            var41 = (class75.field1089.field466 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class75.field1089.field461 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class297.field4101 && (class450.field6497 & 0x40) != 0) {
                                            class295 var44 = class12.method106(class401.field5585, (byte) 91, class455.field6651);
                                            if (var44 == null) {
                                                class370.method2145(-1);
                                            } else {
                                                class376.method2167(var41, var42, 1L, 19, class327.field4483, (byte) -90, var11.field4072, false, " ->", class344.field4734, true);
                                            }
                                            continue;
                                        }
                                        if (class341.field4700 == class288.field3885) {
                                            class376.method2167(var41, var42, 1L, 49, -1, (byte) -90, -1, false, "", class99.field1365.method590(class105.field1434, -22602), true);
                                        }
                                        class376.method2167(var41, var42, 1L, 8, class340.field4697, (byte) -90, -1, false, "", class319.field4406, true);
                                        continue;
                                    }
                                    if (class246.field3432 == var11.field3995) {
                                        class34.field488 = var11;
                                        if (var21) {
                                            class483.field7087 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method2220(-1243743073) - var12 - var11.field4022 / 2) * 2.0D / (double) class481.field7044);
                                            int var46 = (int) (-((double) (var24.method2221(-3) - var13 - var11.field3960 / 2) * 2.0D / (double) class481.field7044));
                                            int var47 = class201.field2872 + var45 + class481.field7046;
                                            int var48 = class137.field1956 + var46 + class481.field7066;
                                            class433 var49 = class257.method1499(false);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2584(var50, -128, var47, var48);
                                            if (var50 != null) {
                                                if (class488.field7125.method1212(-1, 82) && class370.field5196 > 0) {
                                                    class362.method2006((byte) -74, var50[2], var50[1], var50[0]);
                                                    continue;
                                                }
                                                class530.field7807 = true;
                                                class352.field4803 = var50[0];
                                                class123.field1687 = var50[1];
                                                class178.field2524 = var50[2];
                                            }
                                            class78.field1127 = 1;
                                            class261.field3589 = false;
                                            class119.field1629 = class332.field4528.method54(74);
                                            class278.field3763 = class332.field4528.method55((byte) -32);
                                            continue;
                                        }
                                        if (var22 && class78.field1127 > 0) {
                                            if (class78.field1127 == 1 && (class119.field1629 != class332.field4528.method54(36) || class278.field3763 != class332.field4528.method55((byte) -106))) {
                                                class454.field6635 = class201.field2872;
                                                class319.field4414 = class137.field1956;
                                                class78.field1127 = 2;
                                            }
                                            if (class78.field1127 == 2) {
                                                class261.field3589 = true;
                                                class332.method1846(class454.field6635 + (int) ((double) (class119.field1629 - class332.field4528.method54(72)) * 2.0D / (double) class481.field7041), 21);
                                                class83.method588((byte) 127, class319.field4414 - (int) ((double) (class278.field3763 - class332.field4528.method55((byte) -37)) * 2.0D / (double) class481.field7041));
                                            }
                                            continue;
                                        }
                                        if (class78.field1127 > 0 && !class261.field3589) {
                                            if ((class17.field186 == 1 || class239.method1386(-116)) && class370.field5198 > 2) {
                                                class420.method2514(class278.field3763, 112, class119.field1629);
                                            } else if (class329.method1829((byte) 112)) {
                                                class420.method2514(class278.field3763, 103, class119.field1629);
                                            }
                                        }
                                        class78.field1127 = 0;
                                        continue;
                                    }
                                    if (class18.field193 == var11.field3995) {
                                        if (var22) {
                                            class225.method1332(2, var11.field4022, var11.field3960, class332.field4528.method54(112) - var12, class332.field4528.method55((byte) -72) - var13);
                                        }
                                        continue;
                                    }
                                    if (class131.field1805 == var11.field3995) {
                                        class247.method1457(var13, var11, var12, (byte) 126);
                                        continue;
                                    }
                                }
                                if (!var11.field3931 && var23) {
                                    var11.field3931 = true;
                                    if (var11.field4065 != null) {
                                        class44 var51 = new class44();
                                        var51.field602 = true;
                                        var51.field613 = var11;
                                        var51.field607 = var24.method2220(-1243743073) - var12;
                                        var51.field606 = var24.method2221(-3) - var13;
                                        var51.field612 = var11.field4065;
                                        class225.field3171.method3070(var51, (byte) -123);
                                    }
                                }
                                if (var11.field3931 && var22 && var11.field3980 != null) {
                                    class44 var52 = new class44();
                                    var52.field602 = true;
                                    var52.field613 = var11;
                                    var52.field607 = class332.field4528.method54(77) - var12;
                                    var52.field606 = class332.field4528.method55((byte) -114) - var13;
                                    var52.field612 = var11.field3980;
                                    class225.field3171.method3070(var52, (byte) -125);
                                }
                                if (var11.field3931 && !var22) {
                                    var11.field3931 = false;
                                    if (var11.field4087 != null) {
                                        class44 var53 = new class44();
                                        var53.field602 = true;
                                        var53.field613 = var11;
                                        var53.field607 = class332.field4528.method54(62) - var12;
                                        var53.field606 = class332.field4528.method55((byte) -79) - var13;
                                        var53.field612 = var11.field4087;
                                        class28.field422.method3070(var53, (byte) -127);
                                    }
                                }
                                if (var22 && var11.field3929 != null) {
                                    class44 var54 = new class44();
                                    var54.field602 = true;
                                    var54.field613 = var11;
                                    var54.field607 = class332.field4528.method54(66) - var12;
                                    var54.field606 = class332.field4528.method55((byte) -99) - var13;
                                    var54.field612 = var11.field3929;
                                    class225.field3171.method3070(var54, (byte) -119);
                                }
                                if (!var11.field3930 && var21) {
                                    var11.field3930 = true;
                                    if (var11.field3942 != null) {
                                        class44 var55 = new class44();
                                        var55.field602 = true;
                                        var55.field613 = var11;
                                        var55.field607 = class332.field4528.method54(56) - var12;
                                        var55.field606 = class332.field4528.method55((byte) -118) - var13;
                                        var55.field612 = var11.field3942;
                                        class225.field3171.method3070(var55, (byte) -119);
                                    }
                                }
                                if (var11.field3930 && var21 && var11.field4053 != null) {
                                    class44 var56 = new class44();
                                    var56.field602 = true;
                                    var56.field613 = var11;
                                    var56.field607 = class332.field4528.method54(39) - var12;
                                    var56.field606 = class332.field4528.method55((byte) -67) - var13;
                                    var56.field612 = var11.field4053;
                                    class225.field3171.method3070(var56, (byte) -120);
                                }
                                if (var11.field3930 && !var21) {
                                    var11.field3930 = false;
                                    if (var11.field4021 != null) {
                                        class44 var57 = new class44();
                                        var57.field602 = true;
                                        var57.field613 = var11;
                                        var57.field607 = class332.field4528.method54(86) - var12;
                                        var57.field606 = class332.field4528.method55((byte) -59) - var13;
                                        var57.field612 = var11.field4021;
                                        class28.field422.method3070(var57, (byte) -122);
                                    }
                                }
                                if (var11.field4040 != null) {
                                    class44 var58 = new class44();
                                    var58.field613 = var11;
                                    var58.field612 = var11.field4040;
                                    class103.field1409.method3070(var58, (byte) -128);
                                }
                                if (var11.field4005 != null && class480.field7025 > var11.field4037) {
                                    if (var11.field4044 == null || class480.field7025 - var11.field4037 > 32) {
                                        class44 var63 = new class44();
                                        var63.field613 = var11;
                                        var63.field612 = var11.field4005;
                                        class225.field3171.method3070(var63, (byte) -127);
                                    } else {
                                        label691: for (int var59 = var11.field4037; var59 < class480.field7025; var59++) {
                                            int var60 = class292.field3912[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field4044.length; var61++) {
                                                if (var11.field4044[var61] == var60) {
                                                    class44 var62 = new class44();
                                                    var62.field613 = var11;
                                                    var62.field612 = var11.field4005;
                                                    class225.field3171.method3070(var62, (byte) -121);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4037 = class480.field7025;
                                }
                                if (var11.field4085 != null && class316.field4382 > var11.field3997) {
                                    if (var11.field4086 == null || class316.field4382 - var11.field3997 > 32) {
                                        class44 var68 = new class44();
                                        var68.field613 = var11;
                                        var68.field612 = var11.field4085;
                                        class225.field3171.method3070(var68, (byte) -124);
                                    } else {
                                        label667: for (int var64 = var11.field3997; var64 < class316.field4382; var64++) {
                                            int var65 = class338.field4662[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field4086.length; var66++) {
                                                if (var11.field4086[var66] == var65) {
                                                    class44 var67 = new class44();
                                                    var67.field613 = var11;
                                                    var67.field612 = var11.field4085;
                                                    class225.field3171.method3070(var67, (byte) -123);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3997 = class316.field4382;
                                }
                                if (var11.field4000 != null && class223.field3139 > var11.field4039) {
                                    if (var11.field3989 == null || class223.field3139 - var11.field4039 > 32) {
                                        class44 var73 = new class44();
                                        var73.field613 = var11;
                                        var73.field612 = var11.field4000;
                                        class225.field3171.method3070(var73, (byte) -128);
                                    } else {
                                        label643: for (int var69 = var11.field4039; var69 < class223.field3139; var69++) {
                                            int var70 = class129.field1776[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field3989.length; var71++) {
                                                if (var11.field3989[var71] == var70) {
                                                    class44 var72 = new class44();
                                                    var72.field613 = var11;
                                                    var72.field612 = var11.field4000;
                                                    class225.field3171.method3070(var72, (byte) -121);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4039 = class223.field3139;
                                }
                                if (var11.field4061 != null && class453.field6630 > var11.field3985) {
                                    if (var11.field4069 == null || class453.field6630 - var11.field3985 > 32) {
                                        class44 var78 = new class44();
                                        var78.field613 = var11;
                                        var78.field612 = var11.field4061;
                                        class225.field3171.method3070(var78, (byte) -122);
                                    } else {
                                        label619: for (int var74 = var11.field3985; var74 < class453.field6630; var74++) {
                                            int var75 = class164.field2342[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field4069.length; var76++) {
                                                if (var11.field4069[var76] == var75) {
                                                    class44 var77 = new class44();
                                                    var77.field613 = var11;
                                                    var77.field612 = var11.field4061;
                                                    class225.field3171.method3070(var77, (byte) -119);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3985 = class453.field6630;
                                }
                                if (var11.field4071 != null && class463.field6737 > var11.field3978) {
                                    if (var11.field3969 == null || class463.field6737 - var11.field3978 > 32) {
                                        class44 var83 = new class44();
                                        var83.field613 = var11;
                                        var83.field612 = var11.field4071;
                                        class225.field3171.method3070(var83, (byte) -125);
                                    } else {
                                        label595: for (int var79 = var11.field3978; var79 < class463.field6737; var79++) {
                                            int var80 = class2.field23[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field3969.length; var81++) {
                                                if (var11.field3969[var81] == var80) {
                                                    class44 var82 = new class44();
                                                    var82.field613 = var11;
                                                    var82.field612 = var11.field4071;
                                                    class225.field3171.method3070(var82, (byte) -126);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3978 = class463.field6737;
                                }
                                if (class424.field6193 > var11.field3941 && var11.field4055 != null) {
                                    class44 var84 = new class44();
                                    var84.field613 = var11;
                                    var84.field612 = var11.field4055;
                                    class225.field3171.method3070(var84, (byte) -119);
                                }
                                if (class137.field1959 > var11.field3941 && var11.field3928 != null) {
                                    class44 var85 = new class44();
                                    var85.field613 = var11;
                                    var85.field612 = var11.field3928;
                                    class225.field3171.method3070(var85, (byte) -121);
                                }
                                if (class45.field637 > var11.field3941 && var11.field3993 != null) {
                                    class44 var86 = new class44();
                                    var86.field613 = var11;
                                    var86.field612 = var11.field3993;
                                    class225.field3171.method3070(var86, (byte) -125);
                                }
                                if (class522.field7687 > var11.field3941 && var11.field3970 != null) {
                                    class44 var87 = new class44();
                                    var87.field613 = var11;
                                    var87.field612 = var11.field3970;
                                    class225.field3171.method3070(var87, (byte) -123);
                                }
                                if (class317.field4398 > var11.field3941 && var11.field3975 != null) {
                                    class44 var88 = new class44();
                                    var88.field613 = var11;
                                    var88.field612 = var11.field3975;
                                    class225.field3171.method3070(var88, (byte) -122);
                                }
                                var11.field3941 = class234.field3240;
                                if (var11.field4043 != null) {
                                    for (int var89 = 0; var89 < class171.field2449; var89++) {
                                        class44 var90 = new class44();
                                        var90.field613 = var11;
                                        var90.field611 = class270.field3697[var89].method276((byte) -127);
                                        var90.field604 = class270.field3697[var89].method274(59);
                                        var90.field612 = var11.field4043;
                                        class225.field3171.method3070(var90, (byte) -120);
                                    }
                                }
                                if (class383.field5387 && var11.field3973 != null) {
                                    class44 var91 = new class44();
                                    var91.field613 = var11;
                                    var91.field612 = var11.field3973;
                                    class225.field3171.method3070(var91, (byte) -119);
                                }
                            }
                            if (var11.field3984 == 5 && var11.field3994 != -1) {
                                var11.method1686(class56.field771, (byte) 98, class504.field7416).method2190(class418.field6109, var11.field3960, (byte) 59);
                            }
                            class60.method384(var11, (byte) -20);
                            if (var11.field3984 == 0) {
                                method1201(arg0, var11.field4073, var14, var15, var16, var17, var12 - var11.field3968, var13 - var11.field3977, arg8, arg9);
                                if (var11.field4050 != null) {
                                    method1201(var11.field4050, var11.field4073, var14, var15, var16, var17, var12 - var11.field3968, var13 - var11.field3977, arg8, arg9);
                                }
                                class14 var92 = (class14) class269.field3690.method979((byte) 28, (long) var11.field4073);
                                if (var92 != null) {
                                    if (class341.field4700 == class166.field2348 && var92.field166 == 0 && !class9.field86 && var21 && !class476.field6973) {
                                        class340.method1897(0);
                                    }
                                    class410.method2359(-1, var15, var14, var17, var13, var12, var16, var92.field167, arg9, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class60.method384(var11, (byte) -82);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lss;)Z", line = 2699)
    public static final boolean method1202(class295 arg0) {
        if (class476.field6973) {
            if (method1191(arg0).field2833 != 0) {
                return false;
            }
            if (arg0.field3984 == 0) {
                return false;
            }
        }
        return arg0.field4031;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2713)
    private final void method1203(byte arg0) {
        field2795++;
        if (arg0 != -32) {
            method1188(-94);
        }
        boolean var2 = class119.field1625.method2548(arg0 ^ 0x7C96);
        if (!var2) {
            this.method1194(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2738)
    public static final void method1204(int arg0) {
        int var1 = class378.field5322;
        int[] var2 = class95.field1321;
        int var3 = class133.field1906 ? var1 : class166.field2352 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class22 var5;
            if (var4 < var1) {
                var5 = class309.field4234[var2[var4]];
            } else {
                var5 = class179.field2534[class54.field750[var4 - var1]];
            }
            if (var5.field464 == arg0) {
                var5.field314 = 0;
                if (var5.field306 < 0) {
                    var5.field353 = false;
                } else {
                    int var6 = var5.method167(-1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field466 & 0x7F) != 0 || (var5.field461 & 0x7F) != 0) {
                            var5.field353 = false;
                            continue;
                        }
                    } else if ((var5.field466 & 0x7F) != 64 || (var5.field461 & 0x7F) != 64) {
                        var5.field353 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field466 >> 7;
                        int var8 = var5.field461 >> 7;
                        if (class149.field2110[var7][var8] != var5.field306) {
                            var5.field353 = true;
                            continue;
                        }
                        if (class162.field2319[var7][var8] > 1) {
                            var10002 = class162.field2319[var7][var8]--;
                            var5.field353 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field466 - var9 >> 7;
                        int var11 = var5.field461 - var9 >> 7;
                        int var12 = var5.field466 + var9 >> 7;
                        int var13 = var5.field461 + var9 >> 7;
                        if (!class231.method1353(var10, var12, var13, var11, var5.field306, (byte) 96)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class149.field2110[var14][var15] == var5.field306) {
                                        var10002 = class162.field2319[var14][var15]--;
                                    }
                                }
                            }
                            var5.field353 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class192 && var5.field366 != null && class393.field5484 >= var5.field366.field4946 && class393.field5484 < var5.field366.field4928) {
                        ((class192) var5).field2710 = false;
                    }
                    var5.field353 = false;
                    var5.field457 = class186.method1118(var5.field466, var5.field461, 12840, var5.field464);
                    class7.method41(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2856)
    public static final void method1205() {
        int var0 = class378.field5322;
        int[] var1 = class95.field1321;
        boolean var2 = class437.field6374.field4268 == 1 && var0 > 200 || class437.field6374.field4268 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class192 var12 = class309.field4234[var1[var3]];
            if (var12.method1159((byte) 105)) {
                var12.method157(75);
                if (var12.field463 >= 0 && var12.field468 >= 0 && var12.field456 < class442.field6435 && var12.field471 < class232.field3217) {
                    var12.field2710 = var12.field317 ? var2 : false;
                    if (class75.field1089 == var12) {
                        var12.field306 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field353) {
                            var13++;
                        }
                        if (var12.field348 > class393.field5484) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method167(-1) << 2);
                        if (var12.field2702) {
                            var14 += 512;
                        } else {
                            if (class161.field2296 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field306 = var14 + 1;
                    }
                } else {
                    var12.field306 = -1;
                }
            } else {
                var12.field306 = -1;
            }
        }
        for (int var4 = 0; var4 < class166.field2352; var4++) {
            class405 var9 = class179.field2534[class54.field750[var4]];
            if (var9.method2340((byte) 105) && var9.field5623.method1856(class453.field6623, (byte) 102)) {
                var9.method157(31);
                if (var9.field463 >= 0 && var9.field468 >= 0 && var9.field456 < class442.field6435 && var9.field471 < class232.field3217) {
                    int var10 = 0;
                    if (!var9.field353) {
                        var10++;
                    }
                    if (var9.field348 > class393.field5484) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method167(-1) << 2);
                    if (class161.field2296 == 0) {
                        if (var9.field5623.field4616) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class161.field2296 == 1) {
                        if (var9.field5623.field4616) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field5623.field4596) {
                        var11 += 1024;
                    } else if (!var9.field5623.field4619) {
                        var11 += 256;
                    }
                    var9.field306 = var11 + 1;
                } else {
                    var9.field306 = -1;
                }
            } else {
                var9.field306 = -1;
            }
        }
        for (int var5 = 0; var5 < class324.field4457.length; var5++) {
            class473 var6 = class324.field4457[var5];
            if (var6 != null) {
                if (var6.field6911 == 1) {
                    class405 var7 = class179.field2534[var6.field6904];
                    if (var7 != null && var7.field306 >= 0) {
                        var7.field306 += 2048;
                    }
                } else if (var6.field6911 == 10) {
                    class192 var8 = class309.field4234[var6.field6904];
                    if (var8 != null && class75.field1089 != var8 && var8.field306 >= 0) {
                        var8.field306 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 3018)
    public final void method1206(int arg0) {
        field2792++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class150.method949(true);
        class231.field3207 = new class337(class282.field3804);
        class119.field1625 = new class425();
        if (class528.field7773 != class175.field2498) {
            class418.field6114 = new byte[50][];
        }
        class437.field6374 = new class75(class282.field3804);
        if (arg0 != -9304) {
            field2799 = null;
        }
        if (class528.field7773 == class175.field2498) {
            class36.field503 = this.getCodeBase().getHost();
            class321.field4432 = 43594;
            class109.field1503 = 443;
        } else if (class327.method1826(class175.field2498, (byte) -93)) {
            class36.field503 = this.getCodeBase().getHost();
            class321.field4432 = class212.field3019 + 40000;
            class109.field1503 = class212.field3019 + 50000;
        } else if (class457.field6678 == class175.field2498) {
            class36.field503 = "127.0.0.1";
            class321.field4432 = class212.field3019 + 40000;
            class109.field1503 = class212.field3019 + 50000;
        }
        class33.field472 = class321.field4432;
        class414.field6081 = class321.field4432;
        class325.field4460 = class109.field1503;
        class54.field751 = class36.field503;
        if (class341.field4700 == class288.field3885) {
            class483.field7095 = true;
            class349.field4786 = 0;
            class159.field2288 = class285.field3836;
            class425.field6216 = class283.field3812;
            class161.field2295 = 16777215;
            class458.field6685 = class449.field6490;
            class311.field4288 = class426.field6241;
        } else {
            class159.field2288 = class498.field7331;
            class311.field4288 = class530.field7812;
            class425.field6216 = class127.field1737;
            class458.field6685 = class519.field7651;
        }
        class85.field1172 = class414.field6081;
        if (class397.field5519 == 3) {
            class223.field3140 = class212.field3019;
        }
        class446.field6467 = class281.field3788 = class221.field3085 = class267.field3666 = new short[256];
        class488.field7125 = class28.method197(true, class474.field6924);
        class332.field4528 = class335.method1855(true, class474.field6924, true);
        class66.field911 = class527.method3088(1);
        if (class66.field911 != null) {
            class66.field911.method1679(class474.field6924, -8794);
        }
        class79.field1128 = class397.field5519;
        try {
            if (class282.field3804.field5523 != null) {
                class214.field3048 = new class288(class282.field3804.field5523, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class239.field3286[var3] = new class288(class282.field3804.field5513[var3], 6000, 0);
                }
                class364.field5062 = new class288(class282.field3804.field5527, 6000, 0);
                class399.field5554 = new class209(255, class214.field3048, class364.field5062, 500000);
                class31.field454 = new class288(class282.field3804.field5515, 24, 0);
                class282.field3804.field5523 = null;
                class282.field3804.field5513 = null;
                class282.field3804.field5527 = null;
                class282.field3804.field5515 = null;
            }
        } catch (IOException var4) {
            class31.field454 = null;
            class214.field3048 = null;
            class399.field5554 = null;
            class364.field5062 = null;
        }
        if (class528.field7773 != class175.field2498) {
            class433.field6302 = true;
        }
        class49.field679 = (class341.field4700 == class166.field2348 ? class191.field2684 : class157.field2236).method590(class105.field1434, -22602);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 3135)
    public final void method1207(byte arg0) {
        field2794++;
        method1188(-12221);
        class110.method711((byte) -77);
        class24.method179((byte) 74);
        class163.method1016(-26);
        class83.method589(125);
        class190.method1139(23418);
        class441.method2632((byte) 76);
        class8.method47(80);
        class80.method583(-127);
        class499.method2941((byte) 101);
        class225.method1329((byte) -42);
        class159.method980(-5768);
        class223.method1319(2);
        class18.method142(116);
        class438.method2614(-118);
        class157.method971((byte) 81);
        class415.method2484(461570128);
        class162.method1007(4252);
        class75.method558((byte) 125);
        class473.method2784(-1);
        class522.method3065((byte) 126);
        class402.method2332(false);
        class95.method648((byte) 105);
        class425.method2535(true);
        class507.method2980(255);
        class517.method3039(-2);
        class288.method1641(82);
        class209.method1265((byte) 55);
        class9.method69(0);
        class427.method2559(32);
        class146.method935((byte) -91);
        class255.method1496(1);
        class210.method1269((byte) 19);
        class506.method2979(-9955);
        class217.method1287((byte) -114);
        class260.method1506(92);
        class367.method2123(0);
        class131.method856(0);
        class275.method1561((byte) -1);
        class479.method2818(-1);
        class125.method824((byte) -117);
        class179.method1089(false);
        class376.method2169(-1);
        class253.method1487(true);
        class285.method1627(2);
        class387.method2229(-1);
        class77.method566((byte) 126);
        class326.method1824((byte) 123);
        class6.method37(115);
        class338.method1880((byte) -116);
        class222.method1305((byte) 83);
        class1.method5((byte) -61);
        class405.method2346(-1);
        class436.method2604(false);
        class272.method1549((byte) -43);
        class344.method1915(126);
        class413.method2464(false);
        class341.method1899(false);
        class433.method2581(-1887993940);
        class435.method2595((byte) 80);
        class380.method2189(true);
        class398.method2299((byte) 110);
        class319.method1807(9);
        class192.method1168(true);
        class515.method3025((byte) 0);
        class203.method1238(true);
        class25.method181((byte) 21);
        class365.method2108(3);
        class22.method168(101);
        class61.method386(5);
        class284.method1623(-90);
        class493.method2923(0);
        class14.method115(37);
        class197.method1220(0);
        class117.method743(true);
        class59.method377((byte) -112);
        class112.method723(-1);
        class139.method905((byte) -27);
        class290.method1656(-24122);
        class323.method1818(118);
        class103.method681((byte) -77);
        class227.method1339(-27433);
        class514.method3024(103);
        class88.method612((byte) 62);
        class311.method1766(true);
        class109.method710(-1);
        class102.method675(-2110890960);
        class467.method2742(-1);
        class13.method109(-1);
        class121.method804(3);
        class483.method2853(0);
        class50.method312((byte) -99);
        class160.method993(-115);
        class132.method859((byte) 119);
        class94.method631((byte) -61);
        class60.method381((byte) -60);
        class35.method234((byte) -96);
        class336.method1865((byte) 117);
        class399.method2311(false);
        class359.method1989(false);
        class371.method2147(-116);
        class20.method149(121);
        class16.method134((byte) -46);
        class56.method364(105);
        class148.method947((byte) -44);
        class432.method2580((byte) 66);
        class244.method1444((byte) -18);
        class150.method950(6);
        class403.method2333(-1178998393);
        class23.method175(93);
        class96.method652((byte) -83);
        class140.method908((byte) -117);
        class2.method7(1);
        class504.method2961(26662);
        class317.method1802(true);
        class54.method351((byte) 63);
        class137.method889(-105);
        class475.method2788();
        class481.method2834();
        class283.method1622((byte) 111);
        class92.method623(23989);
        class462.method2716();
        class384.method2202(false);
        class191.method1153((byte) 101);
        class214.method1282(31348);
        class282.method1619(true);
        class281.method1615(0);
        class224.method1326(50);
        class501.method2954(0);
        class141.method914(true);
        class89.method619(-31396);
        class21.method155((byte) 59);
        class97.method657(-1);
        class42.method270(1);
        class252.method1480((byte) 126);
        class118.method747(-283863673);
        class128.method841(-108);
        class231.method1352(-113);
        class300.method1714(127);
        class526.method3080(50);
        class138.method898(5);
        class41.method257((byte) -122);
        class449.method2651(89);
        class512.method3006(27782);
        class119.method756(-9);
        class332.method1848(127);
        class414.method2480(2);
        class400.method2314(109);
        class361.method2005(-117);
        class412.method2455(14);
        class329.method1833(109);
        class508.method2989(true);
        class38.method249(0);
        class417.method2495();
        class189.method1137(31718);
        class383.method2199(-1379803327);
        class457.method2691(100);
        class320.method1808(-128);
        class65.method405(1);
        class164.method1022(-10821);
        class44.method279((byte) 121);
        class19.method143(true);
        class173.method1073((byte) -123);
        class33.method216(-9607);
        class76.method563(7);
        class498.method2940(121);
        class123.method810((byte) 81);
        class206.method1253();
        class360.method1998(51);
        class391.method2243(-92905113);
        class437.method2608(true);
        class340.method1896((byte) 110);
        class180.method1093(1);
        class305.method1733((byte) -110);
        class134.method881((byte) 104);
        class463.method2725(104);
        class302.method1721(-106);
        class267.method1538(8);
        class378.method2181((byte) -81);
        class178.method1087(-90);
        class113.method728((byte) 18);
        class324.method1820(24837);
        class99.method663((byte) -40);
        class36.method237((byte) 87);
        class135.method884(-87);
        class156.method970(53);
        class129.method848(false);
        class153.method964(-1);
        class370.method2139((byte) -78);
        class115.method737((byte) 82);
        class176.method1081((byte) 7);
        class424.method2532(13257);
        class186.method1116(true);
        class273.method1553(false);
        class430.method2568(-65);
        class465.method2737(-1);
        class423.method2525((byte) -42);
        class201.method1236(119);
        class258.method1500(true);
        class152.method960(0);
        class108.method696(false);
        class511.method3001((byte) -80);
        class158.method975(17872);
        class496.method2930(49);
        class289.method1653((byte) 127);
        class28.method192(true);
        class297.method1705((byte) -64);
        class130.method849();
        class304.method1729(63);
        class456.method2688(4);
        class458.method2694((byte) -25);
        class196.method1213(-82);
        class170.method1052(5);
        class389.method2235(4706);
        class46.method290(-118);
        class350.method1939((byte) 101);
        class274.method1557((byte) 16);
        class307.method1742(true);
        class450.method2654(110);
        class291.method1663();
        class120.method760(12831);
        class58.method375(-339);
        class79.method576(-121);
        class254.method1494(-1);
        class26.method187(1);
        class510.method2993(4);
        class521.method3062(-14199);
        class266.method1535(-97);
        class63.method401(96);
        class107.method692((byte) -60);
        class364.method2050(0);
        class331.method1841((byte) 123);
        class45.method287(-2671);
        class330.method1835(1);
        class48.method302((byte) 74);
        class127.method836((byte) 125);
        class242.method1429(80);
        class459.method2697();
        class411.method2442((byte) 100);
        class105.method688((byte) 126);
        class355.method1966();
        class434.method2590();
        class11.method93();
        class294.method1681((byte) 125);
        class116.method741(false);
        class375.method2162();
        class167.method1038(-15244);
        class82.method586((byte) -29);
        class489.method2870(30);
        class182.method1099();
        class407.method2353(-65);
        class234.method1366(false);
        class278.method1569(0);
        class454.method2679((byte) -32);
        class171.method1059(8005);
        class245.method1451((byte) 101);
        class40.method255((byte) 88);
        class66.method416((byte) -40);
        class169.method1045(2);
        class269.method1539(-9323);
        class487.method2865(2);
        class174.method1076((byte) 8);
        class151.method958((byte) 5);
        class530.method3113(21006);
        class455.method2683((byte) -113);
        class500.method2947(0);
        class292.method1668(-85);
        class195.method1186((byte) -38);
        class374.method2158((byte) -100);
        class410.method2357(true);
        class241.method1421((byte) 94);
        class468.method2753(-6543);
        class68.method422((byte) 103);
        class249.method1459(true);
        class172.method1064(false);
        class53.method333(126);
        class519.method3054((byte) 107);
        class379.method2182((byte) -112);
        class188.method1128(-119);
        class308.method1750(6976);
        class325.method1823(107);
        class452.method2660(38);
        class12.method101((byte) 126);
        class7.method42(0);
        class235.method1371();
        class393.method2252((byte) 29);
        class232.method1356(12637);
        class388.method2234(-128);
        class114.method735((byte) -128);
        class207.method1261(-112);
        class212.method1277(false);
        class226.method1337(92);
        class263.method1518(-30566);
        class184.method1114(77);
        class52.method322(4096);
        class428.method2564(false);
        class145.method931(114);
        class352.method1949((byte) 48);
        class31.method209((byte) -60);
        class205.method1247((byte) -85);
        class480.method2821(543795146);
        class204.method1241(112);
        class104.method683(-14079);
        class356.method1976((byte) 0);
        class509.method2991(-2);
        class261.method1510(2);
        class238.method1380((byte) -71);
        class246.method1453(-28029);
        class215.method1285((byte) -127);
        class183.method1109(true);
        class168.method1041((byte) -39);
        class477.method2804(0);
        class200.method1233(false);
        class314.method1778((byte) -15);
        class469.method2756(-117);
        class106.method690((byte) -63);
        class247.method1455(-103);
        class142.method916(true);
        class124.method817(30785);
        class73.method550();
        class491.method2907();
        class368.method2136(12);
        class492.method2920((byte) 72);
        class347.method1923(-686);
        class4.method27(-125);
        class251.method1478((byte) -111);
        class51.method318(112);
        class497.method2933((byte) -86);
        class62.method392(0);
        class461.method2713(37);
        class229.method1342((byte) -46);
        class442.method2634(false);
        class71.method543((byte) 78);
        class39.method250(0);
        class349.method1932(12);
        class418.method2505((byte) -6);
        class471.method2776(true);
        class482.method2850(4);
        class250.method1474(6);
        class67.method420((byte) 99);
        class243.method1433(-98);
        class377.method2175((byte) -109);
        class87.method609(false);
        class175.method1078(-13248);
        class488.method2867(126);
        class474.method2785(34963);
        class233.method1361(-80);
        class91.method620(-117);
        class3.method21((byte) 100);
        class101.method666(-26720);
        class327.method1825(8448);
        class420.method2515(false);
        class321.method1813(98);
        class213.method1281(120);
        class287.method1637((byte) -111);
        class476.method2800(-118);
        class528.method3100(110);
        class84.method592(-1);
        class270.method1543(-2);
        class453.method2675(0);
        class354.method1963(28746);
        class312.method1767(23136);
        class86.method606(false);
        class478.method2808(-117);
        class221.method1300(10634);
        class239.method1387(92);
        class385.method2210(-47);
        class306.method1734(123);
        class495.method2928((byte) 111);
        class348.method1931(-122);
        class451.method2657((byte) 43);
        class49.method306(33);
        class472.method2781(-73);
        class133.method877(1);
        class93.method625(103);
        class309.method1754((byte) 119);
        class43.method275(100);
        class386.method2216((byte) 17);
        class296.method1703(false);
        class220.method1299((byte) 7);
        class34.method218((byte) -127);
        class464.method2726(false);
        class208.method1262((byte) -104);
        class149.method948(20846);
        class177.method1083(-1814);
        class516.method3031((byte) -107);
        if (arg0 < 97) {
            return;
        }
        class322.method1817(10);
        class81.method585(0);
        class279.method1573(80);
        class446.method2638(0);
        class426.method2556(true);
        class17.method138(0);
        class154.method967(97);
        class422.method2523(false);
        class444.method2636((byte) -128);
        class505.method2969((byte) -127);
        class166.method1028(0);
        class366.method2117(-120);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3546)
    public static final void method1208() {
        int var0 = class378.field5322;
        int[] var1 = class95.field1321;
        int var2 = class133.field1906 ? var0 : class166.field2352 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class22 var4;
            if (var3 < var0) {
                var4 = class309.field4234[var1[var3]];
            } else {
                var4 = class179.field2534[class54.field750[var3 - var0]];
            }
            if (var4.field306 >= 0) {
                int var5 = var4.method167(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field466 & 0x7F) == 0 && (var4.field461 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field466 & 0x7F) == 64 && (var4.field461 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class192 && var4.field366 != null && class393.field5484 >= var4.field366.field4946 && class393.field5484 < var4.field366.field4928) {
                    ((class192) var4).field2710 = false;
                }
                var4.field457 = class186.method1118(var4.field466, var4.field461, 12840, var4.field464);
                class7.method41(var4, true);
            }
        }
    }
}
