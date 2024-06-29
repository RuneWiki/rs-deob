import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class188 {

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
    public static int[] field2371 = new int[500];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[Ljava/lang/String;")
    public static String[] field2384 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lag;")
    public static class188 field2385 = null;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field2389 = "Connected to update server";

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lpf;")
    public static class294 field2381;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2373;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field2393;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method956(String arg0, boolean arg1, int arg2) {
        String var3 = arg0.toLowerCase();
        field2375++;
        short[] var4 = new short[16];
        int var5 = arg1 ? 32768 : 0;
        int var6 = 0;
        int var7 = var5 + (arg1 ? class244.field3658 : class71.field1134);
        for (int var8 = var5; var8 < var7; var8++) {
            class70 var11 = class231.method1473((byte) -33, var8);
            if (var11.field1099 && var11.method472(-109).toLowerCase().indexOf(var3) != -1) {
                if (var6 >= 50) {
                    class162.field2484 = -1;
                    class221.field3322 = null;
                    return;
                }
                if (var6 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var6; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var6++] = (short) var8;
            }
        }
        class162.field2484 = var6;
        String[] var9 = new String[class162.field2484];
        class195.field2972 = 0;
        class221.field3322 = var4;
        if (arg2 != -19955) {
            method961(-13, (class294) null, false, (byte) -42, 34, 115, 112);
        }
        for (int var10 = 0; var10 < class162.field2484; var10++) {
            var9[var10] = class231.method1473((byte) -33, var4[var10]).method472(-107);
        }
        class225.method1435((byte) 127, var9, class221.field3322);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IISIJILjava/lang/String;Ljava/lang/String;)V")
    public static final void method957(int arg0, int arg1, short arg2, int arg3, long arg4, int arg5, String arg6, String arg7) {
        field2372++;
        if (arg3 != 0) {
            field2389 = null;
        }
        if (class218.field3275 || class218.field3278 >= 500) {
            return;
        }
        class199.field3021[class218.field3278] = arg6;
        class46.field754[class218.field3278] = arg7;
        field2371[class218.field3278] = arg0 == -1 ? class225.field3379 : arg0;
        class84.field1339[class218.field3278] = arg2;
        class229.field3459[class218.field3278] = arg4;
        class71.field1135[class218.field3278] = arg1;
        class58.field916[class218.field3278] = arg5;
        class218.field3278++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method958(boolean arg0) {
        field2386++;
        if (class184.field2794 == 1000) {
            return;
        }
        class270.field4058++;
        if ((class270.field4058 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class56.field891 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class21.field238.setSeed((long) class56.field891);
        }
        this.method963((byte) -68);
        if (class2.field20 != null) {
            class2.field20.method1549(-96);
        }
        class267.method1778((byte) 122);
        class39.method231(arg0);
        class50.method333(-71);
        class3.method11(3958);
        if (class184.field2796 != null) {
            int var3 = class184.field2796.method43(-23869);
            class21.field246 = var3;
        }
        if (class184.field2794 == 0) {
            this.method962(80);
            class108.method678(1556908007);
        } else if (class184.field2794 == 5) {
            this.method962(80);
            class108.method678(1556908007);
        } else if (class184.field2794 == 25 || class184.field2794 == 28) {
            class231.method1472(-100);
        }
        if (class184.field2794 == 10) {
            this.method971(81);
            class81.method532((byte) -100);
            class259.method1740(-18443);
            class254.method1677(true);
        } else if (class184.field2794 == 30) {
            class244.method1538(1);
        } else if (class184.field2794 == 40) {
            class254.method1677(true);
            if (class115.field1761 != -3) {
                if (class115.field1761 == 15) {
                    class30.method188(false);
                    return;
                }
                if (class115.field1761 != 2) {
                    class281.method1858(-1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method959(byte arg0) {
        field2380++;
        if (class184.field2794 == 1000) {
            return;
        }
        if (arg0 != 119) {
            this.method974(-92);
        }
        long var2 = class282.method1862((byte) -117) / 1000000L - class30.field436;
        class30.field436 = class282.method1862((byte) -117) / 1000000L;
        boolean var4 = class173.method1065(0);
        if (var4 && class254.field3869 && class147.field2144 != null) {
            class147.field2144.method439(18387);
        }
        if ((class184.field2794 == 30 || class184.field2794 == 10) && (class287.field4302 || class106.field1614 != 0L && class263.method1754(-78) > class106.field1614)) {
            class71.method482(class256.field3905, arg0 - 116, class287.field4302, class13.method75(0), class89.field1405);
        }
        if (class244.field3657 == null) {
            Container var5;
            if (class244.field3657 != null) {
                var5 = class244.field3657;
            } else if (class210.field3152 == null) {
                var5 = class209.field3147.field150;
            } else {
                var5 = class210.field3152;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class210.field3152 == var5) {
                Insets var8 = class210.field3152.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class107.field1676 != var6 || class26.field321 != var7) {
                if (class12.field155.startsWith("mac")) {
                    class26.field321 = var7;
                    class107.field1676 = var6;
                } else {
                    class225.method1436(115);
                }
                class106.field1614 = class263.method1754(123) + 500L;
            }
        }
        boolean var9 = false;
        if (class211.field3174) {
            class211.field3174 = false;
            var9 = true;
        }
        if (var9) {
            class53.method362((byte) 36);
        }
        if (class184.field2794 == 0) {
            class147.method896(true, class253.field3833, (Color) null, var9, class77.field1246);
        } else if (class184.field2794 == 5) {
            class214.method1373((byte) 104, class192.field2953, false);
        } else if (class184.field2794 == 10) {
            class79.method527((byte) -79);
        } else if (class184.field2794 == 25 || class184.field2794 == 28) {
            if (class33.field480 == 1) {
                if (class106.field1613 < class83.field1331) {
                    class106.field1613 = class83.field1331;
                }
                int var11 = (class106.field1613 - class83.field1331) * 50 / class106.field1613;
                class101.method652(class126.field1904 + "<br>(" + var11 + "%)", -17265, false);
            } else if (class33.field480 == 2) {
                if (class173.field2634 < class90.field1416) {
                    class173.field2634 = class90.field1416;
                }
                int var10 = (class173.field2634 - class90.field1416) * 50 / class173.field2634 + 50;
                class101.method652(class126.field1904 + "<br>(" + var10 + "%)", -17265, false);
            } else {
                class101.method652(class126.field1904, -17265, false);
            }
        } else if (class184.field2794 == 30) {
            class62.method421(var2, false);
        } else if (class184.field2794 == 40) {
            class101.method652(class133.field1952 + "<br>" + class119.field1796, -17265, false);
        }
        if ((class184.field2794 == 30 || class184.field2794 == 10) && class56.field898 == 0 && !var9) {
            try {
                Graphics var12 = class47.field762.getGraphics();
                for (int var13 = 0; var13 < class256.field3900; var13++) {
                    if (class1.field16[var13]) {
                        class273.field4109.method1072(class32.field471[var13], 111, class160.field2460[var13], class283.field4236[var13], class101.field1593[var13], var12);
                        class1.field16[var13] = false;
                    }
                }
            } catch (Exception var17) {
                class47.field762.repaint();
            }
        } else if (class184.field2794 != 0) {
            try {
                Graphics var14 = class47.field762.getGraphics();
                class273.field4109.method1074(0, 0, var14, (byte) -119);
                for (int var15 = 0; var15 < class256.field3900; var15++) {
                    class1.field16[var15] = false;
                }
            } catch (Exception var16) {
                class47.field762.repaint();
            }
        }
        if (class50.field802) {
            class235.method1490(arg0 - 111);
        }
        if (class215.field3248 && class184.field2794 == 10 && class136.field1987 != -1) {
            class215.field3248 = false;
            class147.method894(class209.field3147, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method960(int arg0, byte[] arg1) {
        if (arg0 != 0) {
            method965((class289[]) null, -20, -30, 22, 3, 61, -111, -128);
        }
        field2376++;
        class248 var3 = new class248(arg1);
        while (true) {
            int var4 = var3.method1593((byte) 27);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                var3.method1575(false);
                var3.method1575(false);
                var3.method1575(false);
                var3.method1575(false);
                var3.method1575(false);
                var3.method1575(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILpf;ZBIII)V")
    public static final void method961(int arg0, class294 arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        class110.field1705 = arg1;
        class152.field2199 = arg2;
        class282.field4211 = 1;
        field2390++;
        int var7 = -61 / ((arg3 - 63) / 62);
        class98.field1549 = arg4;
        class236.field3565 = arg5;
        class272.field4095 = arg0;
        class45.field708 = arg6;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2392++;
        if (!this.method1174((byte) 127)) {
            return;
        }
        class178.field2727 = Integer.parseInt(this.getParameter("worldid"));
        class112.field1726 = Integer.parseInt(this.getParameter("modewhere"));
        if (class112.field1726 < 0 || class112.field1726 > 1) {
            class112.field1726 = 0;
        }
        class241.field3603 = Integer.parseInt(this.getParameter("modewhat"));
        if (class241.field3603 < 0 || class241.field3603 > 2) {
            class241.field3603 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class10.field135 = true;
        } else {
            class10.field135 = false;
        }
        try {
            class48.field780 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class48.field780 = 0;
        }
        class274.method1819(3, class48.field780);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class108.field1681 = true;
        } else {
            class108.field1681 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class142.field2080 = true;
        } else {
            class142.field2080 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class166.field2554 = 1;
        } else {
            class166.field2554 = 0;
        }
        try {
            class259.field3946 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class259.field3946 = 0;
        }
        class189.field2904 = this.getParameter("settings");
        if (class189.field2904 == null) {
            class189.field2904 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class70.field1120 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class70.field1120 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class75.field1216 = true;
        } else {
            class75.field1216 = false;
        }
        class152.field2200 = this;
        this.method1178(-2, 544, 503, 765, class241.field3603 + 32);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method962(int arg0) {
        field2387++;
        if (!class215.field3248) {
            label241: while (true) {
                do {
                    if (!class283.method1866((byte) -106)) {
                        break label241;
                    }
                } while (class178.field2724 != 's' && class178.field2724 != 'S');
                class215.field3248 = true;
            }
        }
        if (class142.field2085 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class263.method1754(125);
            if (class76.field1224 == 0L) {
                class76.field1224 = var4;
            }
            if (var3 > 16384 && (var4 - class76.field1224) < 5000L) {
                if (var4 - class39.field527 > 1000L) {
                    System.gc();
                    class39.field527 = var4;
                }
                class77.field1246 = class224.field3350;
                class253.field3833 = 5;
            } else {
                class142.field2085 = 10;
                class253.field3833 = 5;
                class77.field1246 = class110.field1710;
            }
        } else if (arg0 == 80) {
            if (class142.field2085 == 10) {
                for (int var6 = 0; var6 < 4; var6++) {
                    class202.field3052[var6] = new class31(104, 104);
                }
                class77.field1246 = class243.field3637;
                class142.field2085 = 30;
                class253.field3833 = 10;
            } else if (class142.field2085 == 30) {
                if (class2.field20 == null) {
                    class2.field20 = new class246(class265.field3995, class250.field3801);
                }
                if (class2.field20.method1550(false)) {
                    field2381 = class6.method25(true, -29784, false, 0, true);
                    class228.field3444 = class6.method25(true, arg0 - 29864, false, 1, true);
                    class186.field2816 = class6.method25(false, -29784, true, 2, true);
                    class265.field4001 = class6.method25(true, -29784, false, 3, true);
                    class254.field3861 = class6.method25(true, -29784, false, 4, true);
                    class165.field2540 = class6.method25(true, -29784, true, 5, true);
                    class143.field2090 = class6.method25(true, -29784, true, 6, false);
                    class192.field2959 = class6.method25(true, -29784, false, 7, true);
                    class295.field4675 = class6.method25(true, arg0 ^ 0xFFFF8BF8, false, 8, true);
                    class17.field203 = class6.method25(true, -29784, false, 9, true);
                    class174.field2657 = class6.method25(true, -29784, false, 10, true);
                    class227.field3400 = class6.method25(true, -29784, false, 11, true);
                    class176.field2697 = class6.method25(true, -29784, false, 12, true);
                    class58.field917 = class6.method25(true, -29784, false, 13, true);
                    class174.field2651 = class6.method25(true, -29784, false, 14, false);
                    class157.field2351 = class6.method25(true, -29784, false, 15, true);
                    class136.field1994 = class6.method25(true, -29784, false, 16, true);
                    class289.field4515 = class6.method25(true, -29784, false, 17, true);
                    class256.field3902 = class6.method25(true, arg0 - 29864, false, 18, true);
                    class116.field1765 = class6.method25(true, -29784, false, 19, true);
                    class94.field1489 = class6.method25(true, -29784, false, 20, true);
                    class4.field78 = class6.method25(true, -29784, false, 21, true);
                    class7.field109 = class6.method25(true, -29784, false, 22, true);
                    class196.field2983 = class6.method25(true, -29784, true, 23, true);
                    class50.field812 = class6.method25(true, -29784, false, 24, true);
                    class25.field302 = class6.method25(true, arg0 - 29864, false, 25, true);
                    class214.field3212 = class6.method25(true, -29784, true, 26, true);
                    class231.field3482 = class6.method25(true, -29784, false, 27, true);
                    class99.field1567 = class6.method25(true, -29784, true, 28, true);
                    class142.field2085 = 40;
                    class253.field3833 = 15;
                    class77.field1246 = field2389;
                } else {
                    class77.field1246 = class292.field4597;
                    class253.field3833 = 12;
                }
            } else if (class142.field2085 == 40) {
                int var7 = 0;
                for (int var8 = 0; var8 < 29; var8++) {
                    var7 += class49.field786[var8].method1452(arg0 - 79) * class123.field1868[var8] / 100;
                }
                if (var7 == 100) {
                    class253.field3833 = 20;
                    class77.field1246 = class256.field3912;
                    class210.method1349(class295.field4675, (byte) 103);
                    class149.method907(class295.field4675, 2);
                    class285.method1871(1, class295.field4675);
                    class142.field2085 = 41;
                } else {
                    class253.field3833 = 20;
                    if (var7 != 0) {
                        class77.field1246 = class71.field1136 + var7 + "%";
                    }
                }
            } else if (class142.field2085 == 41) {
                if (class99.field1567.method1967((byte) -107)) {
                    this.method960(arg0 ^ 0x50, class99.field1567.method1942(1, 27157));
                    class253.field3833 = 25;
                    class77.field1246 = class69.field1097;
                    class142.field2085 = 45;
                } else {
                    class77.field1246 = class205.field3078 + class99.field1567.method1954(false) + "%";
                    class253.field3833 = 25;
                }
            } else if (class142.field2085 == 45) {
                class262.method1753(22050, class107.field1657, 2, (byte) -67);
                class93.field1477 = new class40();
                class93.field1477.method254(9, false, 128);
                class147.field2144 = class98.method629(class47.field762, class209.field3147, 0, 22050, arg0 - 104);
                class147.field2144.method442(class93.field1477, (byte) 67);
                class227.method1451(class157.field2351, class93.field1477, class254.field3861, 0, class174.field2651);
                class192.field2958 = class98.method629(class47.field762, class209.field3147, 1, 2048, -119);
                class213.field3187 = new class55();
                class192.field2958.method442(class213.field3187, (byte) 66);
                class214.field3206 = new class48(22050, class248.field3764);
                class108.field1690 = class143.field2090.method1965("scape main", arg0 ^ 0xFFFFFFD1);
                class253.field3833 = 30;
                class77.field1246 = class25.field309;
                class142.field2085 = 50;
            } else if (class142.field2085 == 50) {
                int var9 = class273.method1810((byte) 117, class295.field4675, class58.field917);
                int var10 = class174.method1073((byte) 67);
                if (var10 > var9) {
                    class77.field1246 = class59.field937 + var9 * 100 / var10 + "%";
                    class253.field3833 = 35;
                } else {
                    class253.field3833 = 35;
                    class142.field2085 = 60;
                    class77.field1246 = class165.field2541;
                }
            } else if (class142.field2085 == 60) {
                int var11 = class256.method1690((byte) 99, class295.field4675);
                int var12 = class288.method1898((byte) -70);
                if (var12 > var11) {
                    class77.field1246 = class92.field1447 + var11 * 100 / var12 + "%";
                    class253.field3833 = 40;
                } else {
                    class77.field1246 = class146.field2135;
                    class142.field2085 = 65;
                    class253.field3833 = 40;
                }
            } else if (class142.field2085 == 65) {
                class98.method630(class295.field4675, 0, class58.field917);
                class253.field3833 = 45;
                class77.field1246 = class165.field2538;
                class203.method1292(5, false);
                class142.field2085 = 70;
            } else if (class142.field2085 == 70) {
                class186.field2816.method1967((byte) -127);
                byte var13 = 0;
                int var14 = var13 + class186.field2816.method1954(false);
                class136.field1994.method1967((byte) -121);
                int var15 = var14 + class136.field1994.method1954(false);
                class289.field4515.method1967((byte) -120);
                int var16 = var15 + class289.field4515.method1954(false);
                class256.field3902.method1967((byte) -120);
                int var17 = var16 + class256.field3902.method1954(false);
                class116.field1765.method1967((byte) -128);
                int var18 = var17 + class116.field1765.method1954(false);
                class94.field1489.method1967((byte) -102);
                int var19 = var18 + class94.field1489.method1954(false);
                class4.field78.method1967((byte) -128);
                int var20 = var19 + class4.field78.method1954(false);
                class7.field109.method1967((byte) -125);
                int var21 = var20 + class7.field109.method1954(false);
                class50.field812.method1967((byte) -119);
                int var22 = var21 + class50.field812.method1954(false);
                class25.field302.method1967((byte) -111);
                int var23 = var22 + class25.field302.method1954(false);
                class231.field3482.method1967((byte) -121);
                int var24 = var23 + class231.field3482.method1954(false);
                if (var24 < 1100) {
                    class253.field3833 = 50;
                    class77.field1246 = class231.field3494 + var24 / 11 + "%";
                } else {
                    class47.method314(class186.field2816, false);
                    class281.method1854(7616, class186.field2816);
                    class288.method1899(class186.field2816, true);
                    class11.method54(class186.field2816, true, class192.field2959);
                    class196.method1223(class192.field2959, (byte) -58, class136.field1994, true);
                    class92.method591(class256.field3902, arg0 ^ 0x50, class192.field2959);
                    class71.method481(true, class116.field1765, class192.field2959, -125, class36.field502);
                    class63.method424(class186.field2816, 106);
                    class190.method1193(class94.field1489, class228.field3444, true, field2381);
                    class108.method679(class186.field2816, (byte) -22);
                    class113.method731(class4.field78, (byte) 80, class192.field2959);
                    class254.method1673(class7.field109, 17558);
                    class67.method456(class186.field2816, 21);
                    class76.method508(class58.field917, class295.field4675, class265.field4001, -3761, class192.field2959);
                    class96.method619(true, class186.field2816);
                    class191.method1201(class289.field4515, (byte) -107);
                    class296.method1983(new class127(), (byte) 92, class50.field812, class25.field302);
                    class148.method900(class25.field302, class50.field812, -635875257);
                    class197.method1233(class186.field2816, arg0 ^ 0xFFFFFFD2);
                    class274.method1812(class186.field2816, (byte) 95);
                    class102.method656(class186.field2816, 121);
                    class224.method1430((byte) 61, class186.field2816, class295.field4675);
                    class67.method454(class186.field2816, class295.field4675, (byte) 49);
                    class77.field1246 = class106.field1612;
                    class253.field3833 = 50;
                    class288.method1893((byte) 88);
                    class142.field2085 = 80;
                }
            } else if (class142.field2085 == 80) {
                int var25 = class113.method730(class295.field4675, 127);
                int var26 = class123.method781(-26554);
                if (var26 > var25) {
                    class77.field1246 = class253.field3847 + var25 * 100 / var26 + "%";
                    class253.field3833 = 60;
                } else {
                    class108.method681(124, class295.field4675);
                    class77.field1246 = class89.field1404;
                    class142.field2085 = 90;
                    class253.field3833 = 60;
                }
            } else if (class142.field2085 == 90) {
                if (class214.field3212.method1967((byte) -108)) {
                    class219 var27 = new class219(class17.field203, class214.field3212, class295.field4675, 20, !class140.field2047);
                    class249.method1637(var27);
                    if (class7.field107 == 1) {
                        class249.method1639(0.9F);
                    }
                    if (class7.field107 == 2) {
                        class249.method1639(0.8F);
                    }
                    if (class7.field107 == 3) {
                        class249.method1639(0.7F);
                    }
                    if (class7.field107 == 4) {
                        class249.method1639(0.6F);
                    }
                    class253.field3833 = 70;
                    class77.field1246 = class97.field1533;
                    class142.field2085 = 100;
                } else {
                    class77.field1246 = class295.field4681 + class214.field3212.method1954(false) + "%";
                    class253.field3833 = 70;
                }
            } else if (class142.field2085 == 100) {
                if (class254.method1676(-23606, class295.field4675)) {
                    class142.field2085 = 110;
                }
            } else if (class142.field2085 == 110) {
                class106.field1622 = new class26();
                class209.field3147.method71(2, 10, class106.field1622);
                class142.field2085 = 120;
                class77.field1246 = class100.field1585;
                class253.field3833 = 75;
            } else if (class142.field2085 == 120) {
                if (class174.field2657.method1972("", "huffman", (byte) -97)) {
                    class124 var28 = new class124(class174.field2657.method1957("", (byte) 29, "huffman"));
                    class152.method918(var28, -117);
                    class142.field2085 = 130;
                    class77.field1246 = class107.field1649;
                    class253.field3833 = 80;
                } else {
                    class77.field1246 = class148.field2151 + "0%";
                    class253.field3833 = 80;
                }
            } else if (class142.field2085 == 130) {
                if (!class265.field4001.method1967((byte) -108)) {
                    class77.field1246 = class42.field615 + class265.field4001.method1954(false) * 3 / 4 + "%";
                    class253.field3833 = 85;
                } else if (!class176.field2697.method1967((byte) -99)) {
                    class77.field1246 = class42.field615 + ((class176.field2697.method1954(false) / 10) + 75) + "%";
                    class253.field3833 = 85;
                } else if (!class58.field917.method1967((byte) -120)) {
                    class77.field1246 = class42.field615 + (class58.field917.method1954(false) / 20 + 85) + "%";
                    class253.field3833 = 85;
                } else if (class196.field2983.method1944("details", arg0 ^ 0xFFFFFF9E)) {
                    class209.method1344(0, class196.field2983, class171.field2596);
                    class38.method226(class192.field2959);
                    class77.field1246 = class97.field1524;
                    class253.field3833 = 95;
                    class142.field2085 = 135;
                } else {
                    class77.field1246 = class42.field615 + ((class196.field2983.method1971("details", 0) / 10) + 90) + "%";
                    class253.field3833 = 85;
                }
            } else if (class142.field2085 == 135) {
                int var29 = class100.method642((byte) -74);
                if (var29 == -1) {
                    class77.field1246 = class143.field2091;
                    class253.field3833 = 95;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1171("worldlistfull", (byte) 68);
                    class203.method1292(1000, false);
                } else if (class253.field3838) {
                    class77.field1246 = class143.field2099;
                    class142.field2085 = 140;
                    class253.field3833 = 96;
                } else {
                    this.method1171("worldlistio_" + var29, (byte) 68);
                    class203.method1292(1000, false);
                }
            } else if (class142.field2085 == 140) {
                class27.field333 = class265.field4001.method1965("loginscreen", -118);
                class165.field2540.method1945(false, 125, true);
                class143.field2090.method1945(true, 105, true);
                class295.field4675.method1945(true, 110, true);
                class58.field917.method1945(true, 107, true);
                class174.field2657.method1945(true, 112, true);
                class265.field4001.method1945(true, 120, true);
                class50.field802 = true;
                class77.field1246 = class132.field1943;
                class142.field2085 = 150;
                class253.field3833 = 97;
            } else if (class142.field2085 == 150) {
                if (class215.field3248) {
                    class274.field4119 = 0;
                    class132.field1937 = 0;
                    class154.field2318 = 0;
                    class127.field1911 = 0;
                }
                class215.field3248 = true;
                class147.method894(class209.field3147, true);
                class71.method482(-1, 3, false, class132.field1937, -1);
                class253.field3833 = 100;
                class142.field2085 = 160;
                class77.field1246 = class241.field3623;
            } else if (class142.field2085 == 160) {
                class236.method1500(true, 39);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method963(byte arg0) {
        field2391++;
        int var2 = -22 / ((34 - arg0) / 45);
        boolean var3 = class265.field3995.method345(0);
        if (!var3) {
            this.method968(13);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method964(int arg0) {
        if (arg0 != -27756) {
            field2371 = null;
        }
        field2371 = null;
        field2384 = null;
        field2389 = null;
        field2373 = null;
        field2381 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lrf;IIIIIII)V")
    public static final void method965(class289[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class289 var9 = arg0[var8];
            if (var9 != null && var9.field4451 == arg1 && (!var9.field4495 || var9.field4394 == 0 || var9.field4532 || method972(var9).field4049 != 0 || class15.field183 == var9 || var9.field4496 == 1338) && (!var9.field4495 || !method967(var9))) {
                int var10 = var9.field4468 + arg6;
                int var11 = var9.field4525 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4394 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4478 + var10;
                    int var17 = var9.field4444 + var11;
                    if (var9.field4394 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class276.field4158 == var9) {
                    class1.field14 = true;
                    class31.field455 = var10;
                    class114.field1741 = var11;
                }
                if (!var9.field4495 || var12 < var14 && var13 < var15) {
                    if (var9.field4394 == 0) {
                        if (!var9.field4495 && method967(var9) && class76.field1233 != var9) {
                            continue;
                        }
                        if (var9.field4491 && class91.field1438 >= var12 && class203.field3065 >= var13 && class91.field1438 < var14 && class203.field3065 < var15) {
                            for (class234 var18 = (class234) class292.field4603.method983(7); var18 != null; var18 = (class234) class292.field4603.method985((byte) 109)) {
                                if (var18.field3525) {
                                    var18.method538(82);
                                    var18.field3528.field4398 = false;
                                }
                            }
                            if (class188.field2878 == 0) {
                                class276.field4158 = null;
                                class15.field183 = null;
                            }
                            class18.field215 = 0;
                        }
                    }
                    if (var9.field4495) {
                        boolean var19;
                        if (class91.field1438 >= var12 && class203.field3065 >= var13 && class91.field1438 < var14 && class203.field3065 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class267.field4025 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class246.field3676 == 1 && class205.field3076 >= var12 && class188.field2872 >= var13 && class205.field3076 < var14 && class188.field2872 < var15) {
                            var21 = true;
                        }
                        if (var9.field4388 != null) {
                            for (int var22 = 0; var22 < var9.field4388.length; var22++) {
                                if (class140.field2048[var9.field4388[var22]]) {
                                    if (var9.field4447 == null || class270.field4058 >= var9.field4447[var22]) {
                                        byte var23 = var9.field4479[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class140.field2048[86] && !class140.field2048[82] && !class140.field2048[81]) && ((var23 & 0x2) == 0 || class140.field2048[86]) && ((var23 & 0x1) == 0 || class140.field2048[82]) && ((var23 & 0x4) == 0 || class140.field2048[81])) {
                                            class52.method356(-1, 13310, var22 + 1, "", var9.field4504);
                                            int var24 = var9.field4524[var22];
                                            if (var9.field4447 == null) {
                                                var9.field4447 = new int[var9.field4388.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4447[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4447[var22] = class270.field4058 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4447 != null) {
                                    var9.field4447[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class200.method1256(false, var9, class205.field3076 - var10, class188.field2872 - var11);
                        }
                        if (class276.field4158 != null && class276.field4158 != var9 && var19 && method972(var9).method1787(88)) {
                            class160.field2456 = var9;
                        }
                        if (class15.field183 == var9) {
                            class30.field428 = true;
                            class173.field2637 = var10;
                            class11.field142 = var11;
                        }
                        if (var9.field4532 || var9.field4496 != 0) {
                            if (var19 && class21.field246 != 0 && var9.field4437 != null) {
                                class234 var25 = new class234();
                                var25.field3525 = true;
                                var25.field3528 = var9;
                                var25.field3531 = class21.field246;
                                var25.field3533 = var9.field4437;
                                class292.field4603.method987(var25, (byte) -121);
                            }
                            if (class276.field4158 != null || class251.field3814 != null || class218.field3275 || var9.field4496 != 1400 && class18.field215 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4496 != 0) {
                                if (var9.field4496 == 1337) {
                                    class56.field899 = var9;
                                    continue;
                                }
                                if (var9.field4496 == 1338) {
                                    if (var21) {
                                        class42.field618 = class205.field3076 - var10;
                                        class277.field4177 = class188.field2872 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4496 == 1400) {
                                    class219.field3303 = var9;
                                    if (var21) {
                                        if (class140.field2048[82] && class256.field3893 > 0) {
                                            int var26 = (int) ((double) (class205.field3076 - var10 - var9.field4478 / 2) * 2.0D / (double) class293.field4617);
                                            int var27 = (int) ((double) (class188.field2872 - var11 - var9.field4444 / 2) * 2.0D / (double) class293.field4617);
                                            int var28 = class3.field51 + var26;
                                            int var29 = class268.field4042 + var27;
                                            int var30 = class119.field1798 + var28;
                                            int var31 = class99.field1564 + class79.field1274 - var29 - 1;
                                            class175 var32 = class61.method412(0);
                                            int[] var33 = var32.method1085(67, var31, var30);
                                            if (var33 != null) {
                                                class46.method311(var33[0], var33[2], var33[1], 26596);
                                                class175.method1081(5885);
                                            }
                                            continue;
                                        }
                                        class18.field215 = 1;
                                        class48.field773 = class91.field1438;
                                        class183.field2769 = class203.field3065;
                                        continue;
                                    }
                                    if (var20 && class18.field215 > 0) {
                                        if (class18.field215 == 1 && (class91.field1438 != class48.field773 || class203.field3065 != class183.field2769)) {
                                            class4.field77 = class3.field51;
                                            class254.field3865 = class268.field4042;
                                            class18.field215 = 2;
                                        }
                                        if (class18.field215 == 2) {
                                            class261.method1749((byte) 124, (int) ((double) (class48.field773 - class91.field1438) * 2.0D / (double) class61.field972) + class4.field77);
                                            class226.method1442((byte) -73, (int) ((double) (class183.field2769 - class203.field3065) * 2.0D / (double) class61.field972) + class254.field3865);
                                        }
                                        continue;
                                    }
                                    class18.field215 = 0;
                                    continue;
                                }
                                if (var9.field4496 == 1401) {
                                    if (var20) {
                                        class177.method1100(var9.field4444, class91.field1438 - var10, 118, var9.field4478, class203.field3065 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field4496 == 1402) {
                                    class295.method1980(var9, 0);
                                    continue;
                                }
                            }
                            if (!var9.field4415 && var21) {
                                var9.field4415 = true;
                                if (var9.field4528 != null) {
                                    class234 var34 = new class234();
                                    var34.field3525 = true;
                                    var34.field3528 = var9;
                                    var34.field3518 = class205.field3076 - var10;
                                    var34.field3531 = class188.field2872 - var11;
                                    var34.field3533 = var9.field4528;
                                    class292.field4603.method987(var34, (byte) -121);
                                }
                            }
                            if (var9.field4415 && var20 && var9.field4514 != null) {
                                class234 var35 = new class234();
                                var35.field3525 = true;
                                var35.field3528 = var9;
                                var35.field3518 = class91.field1438 - var10;
                                var35.field3531 = class203.field3065 - var11;
                                var35.field3533 = var9.field4514;
                                class292.field4603.method987(var35, (byte) -121);
                            }
                            if (var9.field4415 && !var20) {
                                var9.field4415 = false;
                                if (var9.field4547 != null) {
                                    class234 var36 = new class234();
                                    var36.field3525 = true;
                                    var36.field3528 = var9;
                                    var36.field3518 = class91.field1438 - var10;
                                    var36.field3531 = class203.field3065 - var11;
                                    var36.field3533 = var9.field4547;
                                    class235.field3540.method987(var36, (byte) -121);
                                }
                            }
                            if (var20 && var9.field4526 != null) {
                                class234 var37 = new class234();
                                var37.field3525 = true;
                                var37.field3528 = var9;
                                var37.field3518 = class91.field1438 - var10;
                                var37.field3531 = class203.field3065 - var11;
                                var37.field3533 = var9.field4526;
                                class292.field4603.method987(var37, (byte) -121);
                            }
                            if (!var9.field4398 && var19) {
                                var9.field4398 = true;
                                if (var9.field4435 != null) {
                                    class234 var38 = new class234();
                                    var38.field3525 = true;
                                    var38.field3528 = var9;
                                    var38.field3518 = class91.field1438 - var10;
                                    var38.field3531 = class203.field3065 - var11;
                                    var38.field3533 = var9.field4435;
                                    class292.field4603.method987(var38, (byte) -121);
                                }
                            }
                            if (var9.field4398 && var19 && var9.field4549 != null) {
                                class234 var39 = new class234();
                                var39.field3525 = true;
                                var39.field3528 = var9;
                                var39.field3518 = class91.field1438 - var10;
                                var39.field3531 = class203.field3065 - var11;
                                var39.field3533 = var9.field4549;
                                class292.field4603.method987(var39, (byte) -121);
                            }
                            if (var9.field4398 && !var19) {
                                var9.field4398 = false;
                                if (var9.field4421 != null) {
                                    class234 var40 = new class234();
                                    var40.field3525 = true;
                                    var40.field3528 = var9;
                                    var40.field3518 = class91.field1438 - var10;
                                    var40.field3531 = class203.field3065 - var11;
                                    var40.field3533 = var9.field4421;
                                    class235.field3540.method987(var40, (byte) -121);
                                }
                            }
                            if (var9.field4555 != null) {
                                class234 var41 = new class234();
                                var41.field3528 = var9;
                                var41.field3533 = var9.field4555;
                                class246.field3668.method987(var41, (byte) -121);
                            }
                            if (var9.field4503 != null && class256.field3910 > var9.field4408) {
                                if (var9.field4416 == null || class256.field3910 - var9.field4408 > 32) {
                                    class234 var46 = new class234();
                                    var46.field3528 = var9;
                                    var46.field3533 = var9.field4503;
                                    class292.field4603.method987(var46, (byte) -121);
                                } else {
                                    label572: for (int var42 = var9.field4408; var42 < class256.field3910; var42++) {
                                        int var43 = class229.field3452[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field4416.length; var44++) {
                                            if (var9.field4416[var44] == var43) {
                                                class234 var45 = new class234();
                                                var45.field3528 = var9;
                                                var45.field3533 = var9.field4503;
                                                class292.field4603.method987(var45, (byte) -121);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field4408 = class256.field3910;
                            }
                            if (var9.field4567 != null && class42.field614 > var9.field4551) {
                                if (var9.field4486 == null || class42.field614 - var9.field4551 > 32) {
                                    class234 var51 = new class234();
                                    var51.field3528 = var9;
                                    var51.field3533 = var9.field4567;
                                    class292.field4603.method987(var51, (byte) -121);
                                } else {
                                    label548: for (int var47 = var9.field4551; var47 < class42.field614; var47++) {
                                        int var48 = class17.field198[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4486.length; var49++) {
                                            if (var9.field4486[var49] == var48) {
                                                class234 var50 = new class234();
                                                var50.field3528 = var9;
                                                var50.field3533 = var9.field4567;
                                                class292.field4603.method987(var50, (byte) -121);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field4551 = class42.field614;
                            }
                            if (var9.field4559 != null && class26.field323 > var9.field4565) {
                                if (var9.field4505 == null || class26.field323 - var9.field4565 > 32) {
                                    class234 var56 = new class234();
                                    var56.field3528 = var9;
                                    var56.field3533 = var9.field4559;
                                    class292.field4603.method987(var56, (byte) -121);
                                } else {
                                    label524: for (int var52 = var9.field4565; var52 < class26.field323; var52++) {
                                        int var53 = class235.field3550[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4505.length; var54++) {
                                            if (var9.field4505[var54] == var53) {
                                                class234 var55 = new class234();
                                                var55.field3528 = var9;
                                                var55.field3533 = var9.field4559;
                                                class292.field4603.method987(var55, (byte) -121);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field4565 = class26.field323;
                            }
                            if (var9.field4536 != null && class268.field4041 > var9.field4569) {
                                if (var9.field4441 == null || class268.field4041 - var9.field4569 > 32) {
                                    class234 var61 = new class234();
                                    var61.field3528 = var9;
                                    var61.field3533 = var9.field4536;
                                    class292.field4603.method987(var61, (byte) -121);
                                } else {
                                    label500: for (int var57 = var9.field4569; var57 < class268.field4041; var57++) {
                                        int var58 = class217.field3269[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field4441.length; var59++) {
                                            if (var9.field4441[var59] == var58) {
                                                class234 var60 = new class234();
                                                var60.field3528 = var9;
                                                var60.field3533 = var9.field4536;
                                                class292.field4603.method987(var60, (byte) -121);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field4569 = class268.field4041;
                            }
                            if (var9.field4490 != null && class159.field2440 > var9.field4413) {
                                if (var9.field4489 == null || class159.field2440 - var9.field4413 > 32) {
                                    class234 var66 = new class234();
                                    var66.field3528 = var9;
                                    var66.field3533 = var9.field4490;
                                    class292.field4603.method987(var66, (byte) -121);
                                } else {
                                    label476: for (int var62 = var9.field4413; var62 < class159.field2440; var62++) {
                                        int var63 = class177.field2705[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field4489.length; var64++) {
                                            if (var9.field4489[var64] == var63) {
                                                class234 var65 = new class234();
                                                var65.field3528 = var9;
                                                var65.field3533 = var9.field4490;
                                                class292.field4603.method987(var65, (byte) -121);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field4413 = class159.field2440;
                            }
                            if (class66.field1064 > var9.field4445 && var9.field4462 != null) {
                                class234 var67 = new class234();
                                var67.field3528 = var9;
                                var67.field3533 = var9.field4462;
                                class292.field4603.method987(var67, (byte) -121);
                            }
                            if (class112.field1724 > var9.field4445 && var9.field4546 != null) {
                                class234 var68 = new class234();
                                var68.field3528 = var9;
                                var68.field3533 = var9.field4546;
                                class292.field4603.method987(var68, (byte) -121);
                            }
                            if (class187.field2847 > var9.field4445 && var9.field4420 != null) {
                                class234 var69 = new class234();
                                var69.field3528 = var9;
                                var69.field3533 = var9.field4420;
                                class292.field4603.method987(var69, (byte) -121);
                            }
                            if (class20.field230 > var9.field4445 && var9.field4492 != null) {
                                class234 var70 = new class234();
                                var70.field3528 = var9;
                                var70.field3533 = var9.field4492;
                                class292.field4603.method987(var70, (byte) -121);
                            }
                            if (class16.field189 > var9.field4445 && var9.field4430 != null) {
                                class234 var71 = new class234();
                                var71.field3528 = var9;
                                var71.field3533 = var9.field4430;
                                class292.field4603.method987(var71, (byte) -121);
                            }
                            var9.field4445 = class68.field1077;
                            if (var9.field4512 != null) {
                                for (int var72 = 0; var72 < class274.field4122; var72++) {
                                    class234 var73 = new class234();
                                    var73.field3528 = var9;
                                    var73.field3530 = class174.field2649[var72];
                                    var73.field3521 = class248.field3763[var72];
                                    var73.field3533 = var9.field4512;
                                    class292.field4603.method987(var73, (byte) -121);
                                }
                            }
                            if (class158.field2436 && var9.field4425 != null) {
                                class234 var74 = new class234();
                                var74.field3528 = var9;
                                var74.field3533 = var9.field4425;
                                class292.field4603.method987(var74, (byte) -121);
                            }
                        }
                    }
                    if (!var9.field4495 && class276.field4158 == null && class251.field3814 == null && !class218.field3275) {
                        if ((var9.field4470 >= 0 || var9.field4446 != 0) && class91.field1438 >= var12 && class203.field3065 >= var13 && class91.field1438 < var14 && class203.field3065 < var15) {
                            if (var9.field4470 >= 0) {
                                class76.field1233 = arg0[var9.field4470];
                            } else {
                                class76.field1233 = var9;
                            }
                        }
                        if (var9.field4394 == 8 && class91.field1438 >= var12 && class203.field3065 >= var13 && class91.field1438 < var14 && class203.field3065 < var15) {
                            class97.field1529 = var9;
                        }
                        if (var9.field4558 > var9.field4444) {
                            class84.method550(false, var9.field4478 + var10, var9.field4444, var11, var9.field4558, class203.field3065, var9, class91.field1438);
                        }
                    }
                    if (var9.field4394 == 0) {
                        method965(arg0, var9.field4504, var12, var13, var14, var15, var10 - var9.field4396, var11 - var9.field4460);
                        if (var9.field4472 != null) {
                            method965(var9.field4472, var9.field4504, var12, var13, var14, var15, var10 - var9.field4396, var11 - var9.field4460);
                        }
                        class199 var75 = (class199) class229.field3449.method1666((long) var9.field4504, (byte) 54);
                        if (var75 != null) {
                            class187.method1166(var14, var13, var75.field3026, var10, var15, var12, (byte) -66, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2382++;
        try {
            if (arg0.length != 4) {
                class256.method1687(-95, "argument count");
            }
            class178.field2727 = Integer.parseInt(arg0[0]);
            class112.field1726 = 2;
            if (arg0[1].equals("live")) {
                class241.field3603 = 0;
            } else if (arg0[1].equals("rc")) {
                class241.field3603 = 1;
            } else if (arg0[1].equals("wip")) {
                class241.field3603 = 2;
            } else {
                class256.method1687(-100, "modewhat");
            }
            class10.field135 = false;
            class48.field780 = class33.method213((byte) -18, arg0[2]);
            if (class48.field780 == -1) {
                if (arg0[2].equals("english")) {
                    class48.field780 = 0;
                } else if (arg0[2].equals("german")) {
                    class48.field780 = 1;
                } else {
                    class256.method1687(-92, "language");
                }
            }
            class274.method1819(3, class48.field780);
            class108.field1681 = false;
            class142.field2080 = false;
            if (arg0[3].equals("game0")) {
                class166.field2554 = 0;
            } else if (arg0[3].equals("game1")) {
                class166.field2554 = 1;
            } else {
                class256.method1687(-110, "game");
            }
            class70.field1120 = 0;
            class75.field1216 = false;
            class259.field3946 = 0;
            class189.field2904 = "";
            client var1 = new client();
            class152.field2200 = var1;
            var1.method1179(768, 29, 95, class241.field3603 + 32, 1024, "runescape", 544, false);
            class210.field3152.setLocation(40, 40);
        } catch (Exception var3) {
            class275.method1822((String) null, (byte) -92, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIZILcc;I)V")
    public static final void method966(byte arg0, int arg1, boolean arg2, int arg3, class215 arg4, int arg5) {
        field2383++;
        if (class161.field2473 >= 50 || arg4 == null || arg4.field3240 == null || arg4.field3240.length <= arg1 || arg4.field3240[arg1] == null) {
            return;
        }
        int var6 = arg4.field3240[arg1][0];
        int var7 = (var6 & 0xF2) >> 5;
        int var8 = var6 & 0x1F;
        int var9 = var6 >> 8;
        if (arg4.field3240[arg1].length > 1) {
            int var10 = (int) ((double) arg4.field3240[arg1].length * Math.random());
            if (var10 > 0) {
                var9 = arg4.field3240[arg1][var10];
            }
        }
        if (var8 != 0) {
            if (arg0 != 52) {
                method973((class289) null);
            }
            if (class196.field2988 != 0) {
                class89.field1408[class161.field2473] = var9;
                class167.field2561[class161.field2473] = var7;
                int var11 = (arg5 - 64) / 128;
                int var12 = (arg3 - 64) / 128;
                class174.field2653[class161.field2473] = 0;
                class289.field4568[class161.field2473] = null;
                class160.field2458[class161.field2473] = 255;
                class63.field994[class161.field2473] = (var12 << 8) + (var11 << 16) + var8;
                class161.field2473++;
            }
        } else if (arg2) {
            class45.method304(var9, 255, var7, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrf;)Z")
    public static final boolean method967(class289 arg0) {
        if (class64.field1009) {
            if (method972(arg0).field4049 != 0) {
                return false;
            }
            if (arg0.field4394 == 0) {
                return false;
            }
        }
        return arg0.field4537;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method968(int arg0) {
        field2370++;
        if (class265.field3995.field853 > class231.field3486) {
            class296.field4684 = (class265.field3995.field853 - 1) * 250;
            if (class278.field4192 == class256.field3897) {
                class256.field3897 = class284.field4257;
            } else {
                class256.field3897 = class278.field4192;
            }
            if (class296.field4684 > 3000) {
                class296.field4684 = 3000;
            }
            if (class265.field3995.field853 >= 2 && class265.field3995.field856 == 6) {
                this.method1171("js5connect_outofdate", (byte) 68);
                class184.field2794 = 1000;
                return;
            }
            if (class265.field3995.field853 >= 4 && class265.field3995.field856 == -1) {
                this.method1171("js5crc", (byte) 68);
                class184.field2794 = 1000;
                return;
            }
            if (class265.field3995.field853 >= 4 && (class184.field2794 == 0 || class184.field2794 == 5)) {
                if (class265.field3995.field856 == 7 || class265.field3995.field856 == 9) {
                    this.method1171("js5connect_full", (byte) 68);
                } else if (class265.field3995.field856 <= 0) {
                    this.method1171("js5io", (byte) 68);
                } else {
                    this.method1171("js5connect", (byte) 68);
                }
                class184.field2794 = 1000;
                return;
            }
        }
        class231.field3486 = class265.field3995.field853;
        if (class296.field4684 > 0) {
            class296.field4684--;
            return;
        }
        try {
            if (class106.field1625 == 0) {
                class158.field2396 = class209.field3147.method68(class210.field3162, arg0 - 13, class256.field3897);
                class106.field1625++;
            }
            if (class106.field1625 == 1) {
                if (class158.field2396.field1249 == 2) {
                    this.method975(1000, (byte) -127);
                    return;
                }
                if (class158.field2396.field1249 == 1) {
                    class106.field1625++;
                }
            }
            if (arg0 == 13) {
                if (class106.field1625 == 2) {
                    class1.field12 = new class157((Socket) class158.field2396.field1250, class209.field3147);
                    class248 var2 = new class248(5);
                    var2.method1568(15, (byte) 49);
                    var2.method1577((byte) 43, 544);
                    class1.field12.method951(5, 112, 0, var2.field3723);
                    class106.field1625++;
                    class163.field2507 = class263.method1754(-23);
                }
                if (class106.field1625 == 3) {
                    if (class184.field2794 == 0 || class184.field2794 == 5 || class1.field12.method953(0) > 0) {
                        int var3 = class1.field12.method950(true);
                        if (var3 != 0) {
                            this.method975(var3, (byte) 30);
                            return;
                        }
                        class106.field1625++;
                    } else if ((class263.method1754(125) - class163.field2507) > 30000L) {
                        this.method975(1001, (byte) -103);
                        return;
                    }
                }
                if (class106.field1625 == 4) {
                    boolean var4 = class184.field2794 == 5 || class184.field2794 == 10 || class184.field2794 == 28;
                    class265.field3995.method353(class1.field12, false, !var4);
                    class106.field1625 = 0;
                    class1.field12 = null;
                    class158.field2396 = null;
                }
            }
        } catch (IOException var5) {
            this.method975(1002, (byte) 33);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method969(boolean arg0) {
        method964(-27756);
        class89.method575(true);
        class175.method1079(2);
        class180.method1127(true);
        field2374++;
        class46.method310(false);
        class278.method1840(37);
        class205.method1299(117);
        class77.method513(6);
        class188.method1175(10);
        class105.method665(115);
        class174.method1076((byte) 100);
        class26.method164((byte) -49);
        class93.method597(-20959);
        class248.method1595(-117);
        class157.method948((byte) 83);
        class52.method355((byte) 107);
        class160.method998(0);
        class246.method1548(1112);
        class228.method1462((byte) -83);
        class189.method1184((byte) -52);
        class211.method1350(11173);
        class267.method1773((byte) -12);
        class61.method413(-108);
        class177.method1105(127);
        class289.method1928((byte) 57);
        class107.method671((byte) -91);
        class159.method988(true);
        class230.method1466((byte) 42);
        class253.method1664((byte) 107);
        class258.method1738((byte) 54);
        class196.method1224((byte) -113);
        class84.method553(-117);
        class65.method441(79);
        class48.method319(127);
        class79.method524((byte) -127);
        class215.method1378(-1);
        class153.method933(0);
        class288.method1897((byte) 11);
        class192.method1204(-339);
        class72.method485(-27690);
        class199.method1249((byte) 58);
        class268.method1789(-95);
        class82.method539(-9585);
        class53.method365(0);
        class227.method1446(38);
        class150.method910(124);
        class247.method1555(255);
        class44.method300(-294);
        class212.method1357(4);
        class203.method1291(17547);
        class195.method1221(98);
        class57.method385(11971);
        class129.method808(16);
        class120.method761(arg0);
        class209.method1342((byte) 38);
        class39.method232(0);
        class41.method277(76);
        class15.method110(0);
        class22.method142((byte) -26);
        class152.method920(5440);
        class97.method626(14414);
        class276.method1830(8);
        class208.method1314();
        class165.method1041(-128);
        class43.method290(true);
        class29.method183();
        class200.method1259(0);
        class166.method1042(382);
        class58.method388(4550);
        class274.method1814(15211);
        class290.method1930(128);
        class259.method1741(-19259);
        class255.method1681((byte) 125);
        class164.method1011();
        class54.method371((byte) -89);
        class250.method1642((byte) 55);
        class109.method688();
        class136.method830(-22788);
        class176.method1093(0);
        class132.method815((byte) 109);
        class60.method402();
        class213.method1360(true);
        class277.method1839(false);
        class272.method1806((byte) 57);
        class265.method1764(17);
        class111.method718();
        class148.method899(1040803975);
        class218.method1402(18);
        class1.method2((byte) -83);
        class17.method120((byte) -8);
        class102.method657(25754);
        class35.method219(108);
        class281.method1852((byte) 110);
        class90.method583(81);
        class197.method1229((byte) 94);
        class80.method530(-3);
        class113.method732(-609);
        class158.method979((byte) -127);
        class21.method137(true);
        class23.method145(0);
        class232.method1479(46);
        class38.method228();
        class126.method796((byte) -23);
        class217.method1392(true);
        class70.method470(arg0);
        class127.method801((byte) -106);
        class287.method1892(-29100);
        class221.method1415(-29765);
        class95.method609();
        class292.method1937(true);
        class94.method603(-12084);
        class140.method860((byte) 122);
        class219.method1405(1186);
        class110.method700(-5287);
        class273.method1809(5000);
        class198.method1245((byte) 99);
        class87.method569();
        class249.method1628();
        class124.method785(!arg0);
        class99.method639((byte) 123);
        class143.method875(arg0);
        class42.method279(0);
        class49.method326(17852);
        class242.method1531(-161);
        class133.method816((byte) -66);
        class295.method1981((byte) -127);
        class234.method1489(0);
        class114.method735((byte) 11);
        class2.method8((byte) -118);
        class141.method869((byte) 96);
        class162.method1004(1);
        class183.method1141(1);
        class108.method682(true);
        class231.method1471(8);
        class256.method1694(0);
        class135.method828();
        class244.method1539(1);
        class243.method1534((byte) 89);
        class101.method651(47);
        class125.method790();
        class236.method1499(125);
        class56.method384(1280);
        class169.method1051(101);
        class63.method425(0);
        class187.method1160(1);
        class75.method504(-126);
        class151.method913(true);
        class149.method908(false);
        class283.method1865((byte) 7);
        class172.method1060();
        class204.method1295(1610612736);
        class112.method725((byte) -42);
        class286.method1883(23980);
        class45.method302((byte) 94);
        class106.method666(-17373);
        class237.method1504(88);
        class69.method458(10);
        class59.method389((byte) -105);
        class47.method313(-1);
        class251.method1652(true);
        class137.method836(false);
        class225.method1437(-99);
        class226.method1440(-103);
        class206.method1301((byte) -61);
        class155.method941(-1);
        class210.method1347(-1);
        class138.method847();
        class134.method826(0);
        class202.method1289((byte) -76);
        class76.method506(31900);
        class147.method895(46);
        class173.method1070(false);
        class5.method22();
        class238.method1509();
        class118.method749(-31390);
        class161.method1001(false);
        class171.method1059((byte) 77);
        class121.method770();
        class51.method340();
        class6.method32(arg0);
        class128.method804(1419152076);
        class185.method1151(arg0);
        class119.method759(-297834812);
        class86.method562((byte) 109);
        class71.method478(true);
        class62.method420(-126);
        class24.method153(0);
        class214.method1366((byte) 104);
        class25.method157((byte) 94);
        class27.method171(127);
        class32.method210(-4);
        class293.method1940(-1006);
        class261.method1748(-16);
        class81.method535(0);
        class20.method130(76385857);
        class7.method37((byte) -87);
        class241.method1527(-112);
        class30.method189(68);
        class285.method1879(0);
        class85.method559((byte) -112);
        class139.method859(!arg0);
        class100.method649(126);
        class163.method1008(115);
        class36.method224((byte) 110);
        class66.method448(-124);
        class284.method1867(2);
        class145.method885(-1);
        class50.method329(true);
        class186.method1157(91);
        class282.method1861(54);
        class264.method1757(8644);
        class235.method1493(2);
        class123.method779((byte) 112);
        class254.method1672((byte) 117);
        class262.method1750(32758);
        class33.method217(9231);
        class223.method1426(false);
        class64.method430(arg0);
        class98.method636(true);
        class191.method1199(121);
        class91.method585(-27043);
        class220.method1410(69);
        class229.method1464((byte) -24);
        class233.method1483((byte) -104);
        class13.method77((byte) 124);
        class184.method1143(24162252);
        class297.method1991((byte) -71);
        class296.method1986((byte) 105);
        class116.method746(false);
        class115.method741((byte) -84);
        class4.method14(-4453);
        class178.method1110((byte) 74);
        class146.method887((byte) 12);
        class224.method1429((byte) 108);
        class18.method124(false);
        class96.method620(31817);
        class194.method1213((byte) -19);
        class239.method1516(false);
        class67.method455(81);
        class92.method592(0);
        class154.method937(73820720);
        class167.method1045(-835145108);
        class10.method48(14070);
        if (class188.field2891) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method970(byte arg0) {
        field2377++;
        class225.method1436(116);
        class250.field3801 = new class160();
        class265.field3995 = new class52();
        if (class241.field3603 != 0) {
            class283.field4233 = new byte[50][];
        }
        class270.method1803(-122, class209.field3147);
        if (class112.field1726 == 0) {
            class158.field2431 = this.getCodeBase().getHost();
            class141.field2058 = 443;
            class220.field3313 = 43594;
        } else if (class112.field1726 == 1) {
            class158.field2431 = this.getCodeBase().getHost();
            class220.field3313 = class178.field2727 + 40000;
            class141.field2058 = class178.field2727 + 50000;
        } else if (class112.field1726 == 2) {
            class158.field2431 = "127.0.0.1";
            class141.field2058 = class178.field2727 + 50000;
            class220.field3313 = class178.field2727 + 40000;
        }
        class210.field3162 = class158.field2431;
        class284.field4257 = class141.field2058;
        class278.field4192 = class220.field3313;
        if (class166.field2554 == 1) {
            class76.field1227 = class255.field3879;
            class115.field1756 = class290.field4575;
            class268.field4050 = class66.field1060;
            class99.field1563 = true;
            class187.field2833 = class99.field1561;
        } else {
            class268.field4050 = class58.field911;
            class187.field2833 = class107.field1646;
            class115.field1756 = class177.field2719;
            class76.field1227 = class90.field1431;
        }
        class232.field3501 = class65.field1034 = class70.field1110 = class27.field339 = new short[256];
        if (class12.field165 == 3 && class112.field1726 != 2) {
            class91.field1434 = class178.field2727;
        }
        class154.field2325 = class220.field3313;
        class256.field3897 = class154.field2325;
        class65.method437(32414);
        class133.method818(-30864, class47.field762);
        class2.method10(class47.field762, -1);
        class184.field2796 = class157.method945(48);
        if (class184.field2796 != null) {
            class184.field2796.method42(class47.field762, 30153);
        }
        class235.field3549 = class12.field165;
        if (arg0 <= 110) {
            this.init();
        }
        try {
            if (class209.field3147.field161 != null) {
                class205.field3072 = new class189(class209.field3147.field161, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class297.field4700[var2] = new class189(class209.field3147.field166[var2], 6000, 0);
                }
                class237.field3572 = new class189(class209.field3147.field164, 6000, 0);
                class85.field1359 = new class211(255, class205.field3072, class237.field3572, 500000);
                class50.field811 = new class189(class209.field3147.field154, 24, 0);
                class209.field3147.field166 = null;
                class209.field3147.field154 = null;
                class209.field3147.field164 = null;
                class209.field3147.field161 = null;
            }
        } catch (IOException var3) {
            class237.field3572 = null;
            class85.field1359 = null;
            class205.field3072 = null;
            class50.field811 = null;
        }
        class134.field1964 = class72.field1150;
        if (class112.field1726 != 0) {
            class177.field2703 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method971(int arg0) {
        for (class274.field4122 = 0; class283.method1866((byte) -113) && class274.field4122 < 128; class274.field4122++) {
            class174.field2649[class274.field4122] = class183.field2773;
            class248.field3763[class274.field4122] = class178.field2724;
        }
        class180.field2741++;
        if (class136.field1987 != -1) {
            class187.method1166(class77.field1245, 0, class136.field1987, 0, class180.field2748, 0, (byte) -66, 0);
        }
        class68.field1077++;
        field2378++;
        if (class166.field2554 == 0) {
            class195.method1219(true);
        } else if (class237.field3570 == 0 && class163.field2501 == 0) {
            if (class253.field3837 == 2) {
                class137.method841(-110);
            } else {
                class85.method557((byte) 44);
            }
            if ((class128.field1922 >> 7) < 14 || (class128.field1922 >> 7) >= 90 || (class47.field763 >> 7) < 14 || class47.field763 >> 7 >= 90) {
                class253.method1668(122);
            }
        }
        while (true) {
            class234 var2;
            class289 var3;
            class289 var4;
            do {
                var2 = (class234) class246.field3668.method989(4);
                if (var2 == null) {
                    while (true) {
                        class234 var5;
                        class289 var6;
                        class289 var7;
                        do {
                            var5 = (class234) class235.field3540.method989(4);
                            if (var5 == null) {
                                int var8 = 10 / ((arg0 + 40) / 39);
                                while (true) {
                                    class234 var9;
                                    class289 var10;
                                    class289 var11;
                                    do {
                                        var9 = (class234) class292.field4603.method989(4);
                                        if (var9 == null) {
                                            if (class276.field4158 != null) {
                                                class76.method507(-124);
                                            }
                                            if (class273.field4111 != null && class273.field4111.field1249 == 1) {
                                                if (class273.field4111.field1250 != null) {
                                                    class41.method275((byte) 55, class235.field3545, field2373);
                                                }
                                                class235.field3545 = false;
                                                field2373 = null;
                                                class273.field4111 = null;
                                            }
                                            if (class270.field4058 % 1500 == 0) {
                                                class199.method1252(2);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field3528;
                                        if (var10.field4530 < 0) {
                                            break;
                                        }
                                        var11 = class89.method574((byte) -15, var10.field4451);
                                    } while (var11 == null || var11.field4472 == null || var11.field4472.length <= var10.field4530 || var11.field4472[var10.field4530] != var10);
                                    class228.method1456((byte) -1, var9);
                                }
                            }
                            var6 = var5.field3528;
                            if (var6.field4530 < 0) {
                                break;
                            }
                            var7 = class89.method574((byte) -15, var6.field4451);
                        } while (var7 == null || var7.field4472 == null || var6.field4530 >= var7.field4472.length || var7.field4472[var6.field4530] != var6);
                        class228.method1456((byte) 101, var5);
                    }
                }
                var3 = var2.field3528;
                if (var3.field4530 < 0) {
                    break;
                }
                var4 = class89.method574((byte) -15, var3.field4451);
            } while (var4 == null || var4.field4472 == null || var3.field4530 >= var4.field4472.length || var4.field4472[var3.field4530] != var3);
            class228.method1456((byte) 95, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lrf;)Lsa;")
    public static final class268 method972(class289 arg0) {
        class268 var1 = (class268) class221.field3326.method1666(((long) arg0.field4504 << 32) + (long) arg0.field4530, (byte) 20);
        return var1 == null ? arg0.field4529 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lrf;)Lrf;")
    public static final class289 method973(class289 arg0) {
        int var1 = method972(arg0).method1797(0);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class89.method574((byte) -15, arg0.field4451);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method974(int arg0) {
        if (class106.field1622 != null) {
            class106.field1622.field318 = false;
        }
        field2379++;
        class106.field1622 = null;
        if (class44.field706 != null) {
            class44.field706.method955((byte) 103);
            class44.field706 = null;
        }
        class292.method1933(class47.field762, false);
        if (arg0 != 600) {
            this.method960(-118, (byte[]) null);
        }
        class209.method1345(-106, class47.field762);
        if (class184.field2796 != null) {
            class184.field2796.method44((byte) 106, class47.field762);
        }
        class31.method198(-2);
        class48.method323(-128);
        class184.field2796 = null;
        if (class147.field2144 != null) {
            class147.field2144.method436((byte) -92);
        }
        if (class192.field2958 != null) {
            class192.field2958.method436((byte) -92);
        }
        class265.field3995.method352((byte) 75);
        class250.field3801.method993(arg0 ^ 0xFFFFFDEF);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method975(int arg0, byte arg1) {
        class265.field3995.field853++;
        class158.field2396 = null;
        int var3 = -50 / ((arg1 + 49) / 50);
        field2369++;
        class265.field3995.field856 = arg0;
        class106.field1625 = 0;
        class1.field12 = null;
    }
}
