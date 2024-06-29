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
public class client extends class4 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Leb;")
    public static class230 field2705 = class68.method589(0, "0");

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Laj;")
    public static class46 field2708 = new class46(8);

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2718 = -1;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Leb;")
    private static class230 field2719 = class68.method589(0, " ");

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Leb;")
    public static class230 field2723 = class68.method589(0, " <col=00ff80>");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Leb;")
    public static class230 field2721 = field2719;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lv;")
    public static class147 field2720 = new class147(50);

    @OriginalMember(owner = "client!client", name = "H", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method50(int arg0) {
        field2714++;
        if (class57.field1057 == 1000) {
            return;
        }
        boolean var2 = class247.method1724(false);
        if (var2 && class110.field1978 && class92.field1659 != null) {
            class92.field1659.method1071((byte) 102);
        }
        if ((class57.field1057 == 30 || class57.field1057 == 10) && (class155.field2771 || class44.field791 != 0L && class44.field791 < class201.method1419(5))) {
            class37.method335((byte) 106, class55.method444((byte) 123), class16.field371, class155.field2771, class154.field2749);
        }
        if (class108.field1952 == null) {
            Container var3;
            if (class108.field1952 != null) {
                var3 = class108.field1952;
            } else if (class267.field4736 == null) {
                var3 = class184.field3228.field2320;
            } else {
                var3 = class267.field4736;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class267.field4736 == var3) {
                Insets var6 = class267.field4736.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class141.field2536 != var4 || class169.field2983 != var5) {
                if (class129.field2330.startsWith("mac")) {
                    class141.field2536 = var4;
                    class169.field2983 = var5;
                } else {
                    class21.method236(-453);
                }
                class44.field791 = class201.method1419(5) + 500L;
            }
        }
        boolean var7 = false;
        if (class245.field4330) {
            var7 = true;
            class245.field4330 = false;
        }
        if (var7) {
            class173.method1269(2007);
        }
        if (class57.field1057 == 0) {
            class167.method1237(class84.field1493, (Color) null, var7, class145.field2598, (byte) 15);
        } else if (class57.field1057 == 5) {
            class205.method1435(class76.field1382, false, (byte) 123);
        } else if (class57.field1057 == 10) {
            class29.method271(arg0 ^ 0xFFFF99A2);
        } else if (class57.field1057 == 25 || class57.field1057 == 28) {
            if (field2722 == 1) {
                if (class115.field2064 < class85.field1496) {
                    class115.field2064 = class85.field1496;
                }
                int var9 = (class115.field2064 - class85.field1496) * 50 / class115.field2064;
                class18.method221(false, (byte) 26, class173.method1267((byte) 59, new class230[] { class6.field86, class46.field817, class37.method340(var9, (byte) -26), class162.field2880 }));
            } else if (field2722 == 2) {
                if (class142.field2566 < class231.field4013) {
                    class142.field2566 = class231.field4013;
                }
                int var8 = (class142.field2566 - class231.field4013) * 50 / class142.field2566 + 50;
                class18.method221(false, (byte) 26, class173.method1267((byte) 59, new class230[] { class6.field86, class46.field817, class37.method340(var8, (byte) -26), class162.field2880 }));
            } else {
                class18.method221(false, (byte) 26, class6.field86);
            }
        } else if (class57.field1057 == 30) {
            class39.method350(25991);
        } else if (class57.field1057 == 40) {
            class18.method221(false, (byte) 26, class173.method1267((byte) 59, new class230[] { class147.field2649, class212.field3681, class110.field1973 }));
        }
        if ((class57.field1057 == 30 || class57.field1057 == 10) && class21.field428 == 0 && !var7) {
            try {
                Graphics var10 = class14.field307.getGraphics();
                for (int var11 = 0; var11 < class72.field1318; var11++) {
                    if (class125.field2198[var11]) {
                        class251.field4499.method360(class177.field3115[var11], class153.field2731[var11], var10, class172.field3039[var11], false, class76.field1375[var11]);
                        class125.field2198[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class14.field307.repaint();
            }
        } else if (class57.field1057 != 0) {
            try {
                Graphics var12 = class14.field307.getGraphics();
                class251.field4499.method361(0, var12, 0, -7295);
                for (int var13 = 0; var13 < class72.field1318; var13++) {
                    class125.field2198[var13] = false;
                }
            } catch (Exception var14) {
                class14.field307.repaint();
            }
        }
        if (arg0 != 26145) {
            return;
        }
        if (class128.field2249) {
            class201.method1416(arg0 ^ 0x6624);
        }
        if (class18.field404 && class57.field1057 == 10 && class263.field4679 != -1) {
            class18.field404 = false;
            class108.method887(class184.field3228, 77);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lka;)Lka;")
    public static final class245 method1157(class245 arg0) {
        int var1 = class101.method861(-128, method1167(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class155.method1183(arg0.field4245, 17);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method1158(byte arg0) {
        field2701++;
        int var2 = 39 % ((arg0 + 17) / 52);
        boolean var3 = class56.field1040.method1371((byte) -115);
        if (!var3) {
            this.method1163((byte) 111);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method39(int arg0) {
        field2713++;
        class21.method236(-453);
        class109.field1967 = new class205();
        class56.field1040 = new class192();
        class70.method604(class184.field3228, false);
        if (class269.field4768 == 0) {
            class146.field2629 = this.getCodeBase().getHost();
            class95.field1723 = 443;
            class244.field4193 = 43594;
        } else if (class269.field4768 == 1) {
            class146.field2629 = this.getCodeBase().getHost();
            class95.field1723 = class269.field4771 + 50000;
            class244.field4193 = class269.field4771 + 40000;
        } else if (class269.field4768 == 2) {
            class146.field2629 = "127.0.0.1";
            class95.field1723 = class269.field4771 + 50000;
            class244.field4193 = class269.field4771 + 40000;
        }
        class104.field1894 = class244.field4193;
        class112.field2014 = class146.field2629;
        if (class129.field2314 == 3 && class269.field4768 != 2) {
            class7.field92 = class269.field4771;
        }
        class249.field4427 = class95.field1723;
        if (class144.field2580 == 1) {
            class218.field3754 = class42.field770;
            class269.field4770 = class57.field1045;
            class131.field2344 = class56.field1038;
            class59.field1126 = class12.field238;
        } else {
            class218.field3754 = class44.field778;
            class131.field2344 = class262.field4661;
            class269.field4770 = class168.field2960;
            class59.field1126 = class8.field135;
        }
        class231.field4019 = class244.field4193;
        class168.field2969 = class243.field4176 = class24.field455 = class265.field4713 = new short[256];
        class166.field2932 = class231.field4019;
        class151.method1137(true);
        class116.method924(class14.field307, arg0 - 116);
        class236.method1660(class14.field307, -26);
        class204.field3604 = class61.method521((byte) 76);
        if (class204.field3604 != null) {
            class204.field3604.method114(class14.field307, 13);
        }
        class124.field2185 = class129.field2314;
        try {
            if (class184.field3228.field2312 != null) {
                class103.field1891 = new class7(class184.field3228.field2312, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class158.field2822[var2] = new class7(class184.field3228.field2318[var2], 6000, 0);
                }
                class132.field2383 = new class7(class184.field3228.field2328, 6000, 0);
                class245.field4293 = new class274(255, class103.field1891, class132.field2383, 500000);
                class53.field922 = new class7(class184.field3228.field2329, 24, 0);
                class184.field3228.field2328 = null;
                class184.field3228.field2318 = null;
                class184.field3228.field2329 = null;
                class184.field3228.field2312 = null;
            }
        } catch (IOException var3) {
            class132.field2383 = null;
            class53.field922 = null;
            class245.field4293 = null;
            class103.field1891 = null;
        }
        if (~class269.field4768 != arg0) {
            class22.field432 = true;
        }
        class15.field356 = class263.field4670;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method1159(byte arg0) {
        field2721 = null;
        if (arg0 != -19) {
            field2721 = null;
        }
        field2705 = null;
        field2720 = null;
        field2723 = null;
        field2719 = null;
        field2708 = null;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2699++;
        if (!this.method37((byte) 116)) {
            return;
        }
        class269.field4771 = Integer.parseInt(this.getParameter("worldid"));
        class269.field4768 = Integer.parseInt(this.getParameter("modewhere"));
        if (class269.field4768 < 0 || class269.field4768 > 1) {
            class269.field4768 = 0;
        }
        class263.field4675 = Integer.parseInt(this.getParameter("modewhat"));
        if (class263.field4675 < 0 || class263.field4675 > 2) {
            class263.field4675 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class24.field460 = true;
        } else {
            class24.field460 = false;
        }
        try {
            class226.field3896 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class226.field3896 = 0;
        }
        class51.method410(class226.field3896, 0);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class53.field914 = true;
        } else {
            class53.field914 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class261.field4660 = true;
        } else {
            class261.field4660 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class144.field2580 = 1;
        } else {
            class144.field2580 = 0;
        }
        try {
            class56.field1035 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class56.field1035 = 0;
        }
        class237.field4100 = class210.field3661.method1594(21, this);
        if (class237.field4100 == null) {
            class237.field4100 = class89.field1580;
        }
        String var5 = this.getParameter("haveie6");
        if (var5 != null && var5.equals("1")) {
            class156.field2789 = true;
        } else {
            class156.field2789 = false;
        }
        class29.field536 = this;
        this.method46(765, class263.field4675 + 32, 503, 516, (byte) -6);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        field2704++;
        if (class57.field1057 == 1000) {
            return;
        }
        class259.field4584++;
        if ((class259.field4584 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class163.field2904 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class21.field425.setSeed((long) class163.field2904);
        }
        this.method1158((byte) -120);
        if (class196.field3514 != null) {
            class196.field3514.method323(true);
        }
        if (arg0 != 24973) {
            return;
        }
        class33.method300((byte) -119);
        class154.method1175(95);
        class68.method588((byte) -106);
        class78.method649((byte) -69);
        if (class204.field3604 != null) {
            int var3 = class204.field3604.method116(64209450);
            class267.field4743 = var3;
        }
        if (class57.field1057 == 0) {
            this.method1170((byte) 96);
            class219.method1507((byte) 28);
        } else if (class57.field1057 == 5) {
            this.method1170((byte) 53);
            class219.method1507((byte) 28);
        } else if (class57.field1057 == 25 || class57.field1057 == 28) {
            class171.method1259(96);
        }
        if (class57.field1057 == 10) {
            this.method1166(true);
            class243.method1696(arg0 - 24975);
            class232.method1638(-20674);
            method1168(2);
        } else if (class57.field1057 == 30) {
            class206.method1448(0);
        } else if (class57.field1057 == 40) {
            method1168(arg0 ^ 0x618F);
            if (class159.field2831 != -3) {
                if (class159.field2831 == 15) {
                    class219.method1506(-14720);
                } else if (class159.field2831 != 2) {
                    class127.method993(true, (byte) -5);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method1160(int arg0) {
        if (arg0 != 2) {
            field2720 = null;
        }
        for (int var1 = -1; var1 < class169.field2984; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class233.field4042[var1];
            }
            class260 var6 = class230.field4011[var5];
            if (var6 != null && var6.field2240 > 0) {
                var6.field2240--;
                if (var6.field2240 == 0) {
                    var6.field2269 = null;
                }
            }
        }
        field2702++;
        for (int var2 = 0; var2 < class18.field393; var2++) {
            int var3 = class167.field2956[var2];
            class109 var4 = class168.field2963[var3];
            if (var4 != null && var4.field2240 > 0) {
                var4.field2240--;
                if (var4.field2240 == 0) {
                    var4.field2269 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lka;)Z")
    public static final boolean method1161(class245 arg0) {
        if (class271.field4786) {
            if (method1167(arg0) != 0) {
                return false;
            }
            if (arg0.field4306 == 0) {
                return false;
            }
        }
        return arg0.field4207;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method41(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2700++;
        if (class151.field2684 != null) {
            class151.field2684.field1935 = false;
        }
        class151.field2684 = null;
        if (class30.field556 != null) {
            class30.field556.method1818(-2);
            class30.field556 = null;
        }
        class97.method819(-30020, class14.field307);
        class154.method1176(-6392, class14.field307);
        if (class204.field3604 != null) {
            class204.field3604.method115(arg0 - 8050, class14.field307);
        }
        class167.method1235(false);
        class96.method815((byte) -53);
        class204.field3604 = null;
        if (class92.field1659 != null) {
            class92.field1659.method1078(-49);
        }
        if (class133.field2414 != null) {
            class133.field2414.method1078(-59);
        }
        class56.field1040.method1374(-1);
        class109.field1967.method1444((byte) -29);
        try {
            if (class103.field1891 != null) {
                class103.field1891.method66(119);
            }
            if (class158.field2822 != null) {
                for (int var2 = 0; var2 < class158.field2822.length; var2++) {
                    if (class158.field2822[var2] != null) {
                        class158.field2822[var2].method66(65);
                    }
                }
            }
            if (class132.field2383 != null) {
                class132.field2383.method66(arg0 + 69);
            }
            if (class53.field922 != null) {
                class53.field922.method66(59);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lka;IIIIIII)V")
    public static final void method1162(class245[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class245 var9 = arg0[var8];
            if (var9 != null && var9.field4245 == arg1 && (!var9.field4216 || var9.field4306 == 0 || var9.field4365 || method1167(var9) != 0 || class138.field2473 == var9 || var9.field4226 == 1338) && (!var9.field4216 || !method1161(var9))) {
                int var10 = var9.field4252 + arg6;
                int var11 = var9.field4223 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4306 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4325 + var10;
                    int var17 = var9.field4307 + var11;
                    if (var9.field4306 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class229.field3940 == var9) {
                    class226.field3904 = true;
                    class182.field3176 = var10;
                    class41.field748 = var11;
                }
                if (!var9.field4216 || var12 < var14 && var13 < var15) {
                    if (var9.field4306 == 0) {
                        if (!var9.field4216 && method1161(var9) && class206.field3629 != var9) {
                            continue;
                        }
                        if (var9.field4284 && class34.field620 >= var12 && class251.field4497 >= var13 && class34.field620 < var14 && class251.field4497 < var15) {
                            for (class75 var18 = (class75) class123.field2161.method839(128); var18 != null; var18 = (class75) class123.field2161.method834((byte) 82)) {
                                if (var18.field1356) {
                                    var18.method518(87);
                                }
                            }
                            if (class66.field1232 == 0) {
                                class229.field3940 = null;
                                class138.field2473 = null;
                            }
                            class40.field735 = false;
                            class5.field66 = null;
                        }
                    }
                    if (var9.field4216) {
                        boolean var19;
                        if (class34.field620 >= var12 && class251.field4497 >= var13 && class34.field620 < var14 && class251.field4497 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class134.field2419 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class96.field1727 == 1 && class225.field3886 >= var12 && class92.field1657 >= var13 && class225.field3886 < var14 && class92.field1657 < var15) {
                            var21 = true;
                        }
                        if (class185.field3252 > 0 && var9.field4236 != null) {
                            for (int var22 = 0; var22 < var9.field4236.length; var22++) {
                                for (int var23 = 0; var23 < class185.field3252; var23++) {
                                    int var24 = var9.field4236[var22] & 0xFF;
                                    if (class97.field1764[var23] == var24) {
                                        if (var9.field4272 != null) {
                                            byte var25 = var9.field4272[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class28.field515[86] || (var25 & 0x1) != 0 && !class28.field515[82] || (var25 & 0x4) != 0 && !class28.field515[81])) {
                                                continue;
                                            }
                                        }
                                        class184.method1322((byte) 125, -1, class89.field1580, var9.field4362, var22 + 1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class163.method1219(class225.field3886 - var10, class92.field1657 - var11, (byte) 31, var9);
                        }
                        if (class229.field3940 != null && class229.field3940 != var9 && var19 && class187.method1336((byte) 29, method1167(var9))) {
                            class72.field1313 = var9;
                        }
                        if (class138.field2473 == var9) {
                            class30.field546 = true;
                            class35.field668 = var10;
                            class130.field2334 = var11;
                        }
                        if (var9.field4365 || var9.field4226 != 0) {
                            if (var19 && class267.field4743 != 0 && var9.field4214 != null) {
                                class75 var26 = new class75();
                                var26.field1356 = true;
                                var26.field1354 = var9;
                                var26.field1362 = class267.field4743;
                                var26.field1364 = var9.field4214;
                                class123.field2161.method843(-5, var26);
                            }
                            if (class229.field3940 != null || class37.field703 != null || class243.field4188 || var9.field4226 != 1400 && class40.field735) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4226 != 0) {
                                if (var9.field4226 == 1337) {
                                    class203.field3575 = var9;
                                    class92.method777((byte) -65, var9);
                                    continue;
                                }
                                if (var9.field4226 == 1338) {
                                    if (var21) {
                                        class5.field66 = var9;
                                        class186.field3263 = class225.field3886 - var10;
                                        class46.field825 = class92.field1657 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4226 == 1400) {
                                    class6.field87 = var9;
                                    if (var21) {
                                        if (class28.field515[82] && class30.field545 > 0) {
                                            int var27 = (int) ((double) (class225.field3886 - var10 - var9.field4325 / 2) * 2.0D / (double) class99.field1830);
                                            int var28 = (int) ((double) (class92.field1657 - var11 - var9.field4307 / 2) * 2.0D / (double) class99.field1830);
                                            int var29 = class149.field2671 + var27;
                                            int var30 = class79.field1446 + var28;
                                            int var31 = class72.field1319 + var29;
                                            int var32 = class249.field4417 + class178.field3119 - var30 - 1;
                                            class40.method355(var31, var32, (byte) 45, 0);
                                            class200.method1410(false);
                                            continue;
                                        }
                                        class40.field735 = true;
                                        class49.field869 = class34.field620;
                                        class28.field511 = class251.field4497;
                                        class47.field833 = class149.field2671;
                                        class136.field2445 = class79.field1446;
                                        continue;
                                    }
                                    if (var20 && class40.field735) {
                                        class136.method1049((int) ((double) (class49.field869 - class34.field620) * 2.0D / (double) class128.field2302) + class47.field833, 102);
                                        class41.method357((int) ((double) (class28.field511 - class251.field4497) * 2.0D / (double) class128.field2302) + class136.field2445, -1);
                                        continue;
                                    }
                                    class40.field735 = false;
                                    continue;
                                }
                                if (var9.field4226 == 1401) {
                                    if (var20) {
                                        class101.method859(class34.field620 - var10, var9.field4307, class251.field4497 - var11, -27188, var9.field4325);
                                    }
                                    continue;
                                }
                                if (var9.field4226 == 1402) {
                                    class92.method777((byte) -65, var9);
                                    continue;
                                }
                            }
                            if (!var9.field4285 && var21) {
                                var9.field4285 = true;
                                if (var9.field4278 != null) {
                                    class75 var33 = new class75();
                                    var33.field1356 = true;
                                    var33.field1354 = var9;
                                    var33.field1359 = class225.field3886 - var10;
                                    var33.field1362 = class92.field1657 - var11;
                                    var33.field1364 = var9.field4278;
                                    class123.field2161.method843(-5, var33);
                                }
                            }
                            if (var9.field4285 && var20 && var9.field4319 != null) {
                                class75 var34 = new class75();
                                var34.field1356 = true;
                                var34.field1354 = var9;
                                var34.field1359 = class34.field620 - var10;
                                var34.field1362 = class251.field4497 - var11;
                                var34.field1364 = var9.field4319;
                                class123.field2161.method843(-5, var34);
                            }
                            if (var9.field4285 && !var20) {
                                var9.field4285 = false;
                                if (var9.field4232 != null) {
                                    class75 var35 = new class75();
                                    var35.field1356 = true;
                                    var35.field1354 = var9;
                                    var35.field1359 = class34.field620 - var10;
                                    var35.field1362 = class251.field4497 - var11;
                                    var35.field1364 = var9.field4232;
                                    class225.field3883.method843(-5, var35);
                                }
                            }
                            if (var20 && var9.field4261 != null) {
                                class75 var36 = new class75();
                                var36.field1356 = true;
                                var36.field1354 = var9;
                                var36.field1359 = class34.field620 - var10;
                                var36.field1362 = class251.field4497 - var11;
                                var36.field1364 = var9.field4261;
                                class123.field2161.method843(-5, var36);
                            }
                            if (!var9.field4242 && var19) {
                                var9.field4242 = true;
                                if (var9.field4346 != null) {
                                    class75 var37 = new class75();
                                    var37.field1356 = true;
                                    var37.field1354 = var9;
                                    var37.field1359 = class34.field620 - var10;
                                    var37.field1362 = class251.field4497 - var11;
                                    var37.field1364 = var9.field4346;
                                    class123.field2161.method843(-5, var37);
                                }
                            }
                            if (var9.field4242 && var19 && var9.field4299 != null) {
                                class75 var38 = new class75();
                                var38.field1356 = true;
                                var38.field1354 = var9;
                                var38.field1359 = class34.field620 - var10;
                                var38.field1362 = class251.field4497 - var11;
                                var38.field1364 = var9.field4299;
                                class123.field2161.method843(-5, var38);
                            }
                            if (var9.field4242 && !var19) {
                                var9.field4242 = false;
                                if (var9.field4356 != null) {
                                    class75 var39 = new class75();
                                    var39.field1356 = true;
                                    var39.field1354 = var9;
                                    var39.field1359 = class34.field620 - var10;
                                    var39.field1362 = class251.field4497 - var11;
                                    var39.field1364 = var9.field4356;
                                    class225.field3883.method843(-5, var39);
                                }
                            }
                            if (var9.field4334 != null) {
                                class75 var40 = new class75();
                                var40.field1354 = var9;
                                var40.field1364 = var9.field4334;
                                class173.field3056.method843(-5, var40);
                            }
                            if (var9.field4333 != null && class118.field2109 > var9.field4212) {
                                if (var9.field4281 == null || class118.field2109 - var9.field4212 > 32) {
                                    class75 var45 = new class75();
                                    var45.field1354 = var9;
                                    var45.field1364 = var9.field4333;
                                    class123.field2161.method843(-5, var45);
                                } else {
                                    label546: for (int var41 = var9.field4212; var41 < class118.field2109; var41++) {
                                        int var42 = class265.field4721[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field4281.length; var43++) {
                                            if (var9.field4281[var43] == var42) {
                                                class75 var44 = new class75();
                                                var44.field1354 = var9;
                                                var44.field1364 = var9.field4333;
                                                class123.field2161.method843(-5, var44);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field4212 = class118.field2109;
                            }
                            if (var9.field4231 != null && class219.field3776 > var9.field4302) {
                                if (var9.field4283 == null || class219.field3776 - var9.field4302 > 32) {
                                    class75 var50 = new class75();
                                    var50.field1354 = var9;
                                    var50.field1364 = var9.field4231;
                                    class123.field2161.method843(-5, var50);
                                } else {
                                    label522: for (int var46 = var9.field4302; var46 < class219.field3776; var46++) {
                                        int var47 = class135.field2437[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field4283.length; var48++) {
                                            if (var9.field4283[var48] == var47) {
                                                class75 var49 = new class75();
                                                var49.field1354 = var9;
                                                var49.field1364 = var9.field4231;
                                                class123.field2161.method843(-5, var49);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field4302 = class219.field3776;
                            }
                            if (var9.field4329 != null && class120.field2120 > var9.field4295) {
                                if (var9.field4309 == null || class120.field2120 - var9.field4295 > 32) {
                                    class75 var55 = new class75();
                                    var55.field1354 = var9;
                                    var55.field1364 = var9.field4329;
                                    class123.field2161.method843(-5, var55);
                                } else {
                                    label498: for (int var51 = var9.field4295; var51 < class120.field2120; var51++) {
                                        int var52 = class182.field3172[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field4309.length; var53++) {
                                            if (var9.field4309[var53] == var52) {
                                                class75 var54 = new class75();
                                                var54.field1354 = var9;
                                                var54.field1364 = var9.field4329;
                                                class123.field2161.method843(-5, var54);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field4295 = class120.field2120;
                            }
                            if (var9.field4220 != null && class157.field2811 > var9.field4326) {
                                if (var9.field4348 == null || class157.field2811 - var9.field4326 > 32) {
                                    class75 var60 = new class75();
                                    var60.field1354 = var9;
                                    var60.field1364 = var9.field4220;
                                    class123.field2161.method843(-5, var60);
                                } else {
                                    label474: for (int var56 = var9.field4326; var56 < class157.field2811; var56++) {
                                        int var57 = class226.field3903[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field4348.length; var58++) {
                                            if (var9.field4348[var58] == var57) {
                                                class75 var59 = new class75();
                                                var59.field1354 = var9;
                                                var59.field1364 = var9.field4220;
                                                class123.field2161.method843(-5, var59);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field4326 = class157.field2811;
                            }
                            if (var9.field4366 != null && class44.field779 > var9.field4338) {
                                if (var9.field4342 == null || class44.field779 - var9.field4338 > 32) {
                                    class75 var65 = new class75();
                                    var65.field1354 = var9;
                                    var65.field1364 = var9.field4366;
                                    class123.field2161.method843(-5, var65);
                                } else {
                                    label450: for (int var61 = var9.field4338; var61 < class44.field779; var61++) {
                                        int var62 = class260.field4607[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field4342.length; var63++) {
                                            if (var9.field4342[var63] == var62) {
                                                class75 var64 = new class75();
                                                var64.field1354 = var9;
                                                var64.field1364 = var9.field4366;
                                                class123.field2161.method843(-5, var64);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field4338 = class44.field779;
                            }
                            if (class270.field4773 > var9.field4300 && var9.field4357 != null) {
                                class75 var66 = new class75();
                                var66.field1354 = var9;
                                var66.field1364 = var9.field4357;
                                class123.field2161.method843(-5, var66);
                            }
                            if (class67.field1265 > var9.field4300 && var9.field4230 != null) {
                                class75 var67 = new class75();
                                var67.field1354 = var9;
                                var67.field1364 = var9.field4230;
                                class123.field2161.method843(-5, var67);
                            }
                            if (class180.field3163 > var9.field4300 && var9.field4240 != null) {
                                class75 var68 = new class75();
                                var68.field1354 = var9;
                                var68.field1364 = var9.field4240;
                                class123.field2161.method843(-5, var68);
                            }
                            if (class95.field1719 > var9.field4300 && var9.field4258 != null) {
                                class75 var69 = new class75();
                                var69.field1354 = var9;
                                var69.field1364 = var9.field4258;
                                class123.field2161.method843(-5, var69);
                            }
                            if (class130.field2342 > var9.field4300 && var9.field4280 != null) {
                                class75 var70 = new class75();
                                var70.field1354 = var9;
                                var70.field1364 = var9.field4280;
                                class123.field2161.method843(-5, var70);
                            }
                            var9.field4300 = class54.field935;
                            if (var9.field4224 != null) {
                                for (int var71 = 0; var71 < class185.field3252; var71++) {
                                    class75 var72 = new class75();
                                    var72.field1354 = var9;
                                    var72.field1357 = class97.field1764[var71];
                                    var72.field1360 = class40.field737[var71];
                                    var72.field1364 = var9.field4224;
                                    class123.field2161.method843(-5, var72);
                                }
                            }
                            if (class131.field2348 && var9.field4363 != null) {
                                class75 var73 = new class75();
                                var73.field1354 = var9;
                                var73.field1364 = var9.field4363;
                                class123.field2161.method843(-5, var73);
                            }
                        }
                    }
                    if (!var9.field4216 && class229.field3940 == null && class37.field703 == null && !class243.field4188) {
                        if ((var9.field4200 >= 0 || var9.field4270 != 0) && class34.field620 >= var12 && class251.field4497 >= var13 && class34.field620 < var14 && class251.field4497 < var15) {
                            if (var9.field4200 >= 0) {
                                class206.field3629 = arg0[var9.field4200];
                            } else {
                                class206.field3629 = var9;
                            }
                        }
                        if (var9.field4306 == 8 && class34.field620 >= var12 && class251.field4497 >= var13 && class34.field620 < var14 && class251.field4497 < var15) {
                            class229.field3941 = var9;
                        }
                        if (var9.field4339 > var9.field4307) {
                            class234.method1652(var9, var11, -83, class251.field4497, var9.field4339, var9.field4307, var9.field4325 + var10, class34.field620);
                        }
                    }
                    if (var9.field4306 == 0) {
                        method1162(arg0, var9.field4362, var12, var13, var14, var15, var10 - var9.field4332, var11 - var9.field4351);
                        if (var9.field4318 != null) {
                            method1162(var9.field4318, var9.field4362, var12, var13, var14, var15, var10 - var9.field4332, var11 - var9.field4351);
                        }
                        class150 var74 = (class150) field2708.method394((long) var9.field4362, -21083);
                        if (var74 != null) {
                            class267.method1842(var15, var13, var74.field2681, -104, var12, var10, var11, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1163(byte arg0) {
        field2716++;
        if (class56.field1040.field3415 >= 4) {
            this.method38("js5crc", (byte) -45);
            class57.field1057 = 1000;
            return;
        }
        if (class56.field1040.field3417 >= 4) {
            if (class57.field1057 == 0 || class57.field1057 == 5) {
                this.method38("js5io", (byte) -103);
                class57.field1057 = 1000;
                return;
            }
            class56.field1040.field3417 = 3;
            class202.field3570 = 3000;
        }
        if (class202.field3570-- > 0) {
            return;
        }
        try {
            if (class101.field1858 == 0) {
                class145.field2605 = class184.field3228.method1024((byte) -65, class112.field2014, class166.field2932);
                class101.field1858++;
            }
            if (class101.field1858 == 1) {
                if (class145.field2605.field3421 == 2) {
                    this.method1169((byte) -8, -1);
                    return;
                }
                if (class145.field2605.field3421 == 1) {
                    class101.field1858++;
                }
            }
            if (class101.field1858 == 2) {
                class127.field2223 = new class261((Socket) class145.field2605.field3423, class184.field3228);
                class14 var2 = new class14(5);
                var2.method170((byte) 117, 15);
                var2.method165(516, 1380186760);
                class127.field2223.method1817(var2.field269, 0, -12152, 5);
                class101.field1858++;
                class25.field481 = class201.method1419(5);
            }
            if (class101.field1858 == 3) {
                if (class57.field1057 == 0 || class57.field1057 == 5 || class127.field2223.method1816(0) > 0) {
                    int var3 = class127.field2223.method1814(0);
                    if (var3 != 0) {
                        this.method1169((byte) -8, var3);
                        return;
                    }
                    class101.field1858++;
                } else if ((class201.method1419(5) - class25.field481) > 30000L) {
                    this.method1169((byte) -8, -2);
                    return;
                }
            }
            if (class101.field1858 == 4) {
                boolean var4 = class57.field1057 == 5 || class57.field1057 == 10 || class57.field1057 == 28;
                class56.field1040.method1364(class127.field2223, !var4, (byte) -128);
                class101.field1858 = 0;
                class251.field4500 = 0;
                class145.field2605 = null;
                class127.field2223 = null;
            }
            if (arg0 < 87) {
                this.method50(27);
            }
        } catch (IOException var5) {
            this.method1169((byte) -8, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
    public static final void method1164(int arg0, boolean arg1, int arg2) {
        field2717++;
        if (arg1) {
            field2708 = null;
        }
        class197 var3 = class164.method1228(6, arg2, -1665874464);
        var3.method1402((byte) -102);
        var3.field3527 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2707++;
        try {
            int var1 = -1;
            if (arg0.length != 4) {
                class266.method1837(true, "argument count");
            }
            class269.field4771 = Integer.parseInt(arg0[0]);
            class269.field4768 = 2;
            if (arg0[1].equals("live")) {
                class263.field4675 = 0;
            } else if (arg0[1].equals("rc")) {
                class263.field4675 = 1;
            } else if (arg0[1].equals("wip")) {
                class263.field4675 = 2;
            } else {
                class266.method1837(true, "modewhat");
            }
            class24.field460 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class82.method662(class197.method1398(0, true, var2, var2.length), -3);
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class226.field3896 = var1;
            } else if (arg0[2].equals("english")) {
                class226.field3896 = 0;
            } else if (arg0[2].equals("german")) {
                class226.field3896 = 1;
            } else {
                class266.method1837(true, "language");
            }
            class51.method410(class226.field3896, 0);
            class261.field4660 = false;
            class53.field914 = false;
            if (arg0[3].equals("game0")) {
                class144.field2580 = 0;
            } else if (arg0[3].equals("game1")) {
                class144.field2580 = 1;
            } else {
                class266.method1837(true, "game");
            }
            class237.field4100 = class89.field1580;
            class156.field2789 = false;
            class56.field1035 = 0;
            client var3 = new client();
            class29.field536 = var3;
            var3.method43(27, "runescape", (byte) -110, 768, 1024, 516, class263.field4675 + 32);
            class267.field4736.setLocation(40, 40);
        } catch (Exception var6) {
            class154.method1177(var6, (byte) -112, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Lij;")
    public static final class189 method1165(int arg0, int arg1, boolean arg2) {
        field2706++;
        for (class189 var3 = (class189) class124.field2189.method839(128); var3 != null; var3 = (class189) class124.field2189.method834((byte) 82)) {
            if (var3.field3331 && var3.method1349(false, arg1, arg0)) {
                return var3;
            }
        }
        if (arg2) {
            field2721 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method51(byte arg0) {
        field2711++;
        method1159((byte) -19);
        class230.method1615(57);
        class38.method346((byte) -73);
        class189.method1351(false);
        class156.method1192(-46);
        class226.method1563((byte) 103);
        class175.method1278(-107);
        class177.method1287(false);
        class14.method169((byte) 124);
        class261.method1813(-115);
        class192.method1367(-125);
        class205.method1442(150);
        class35.method325(28757);
        class57.method489(arg0 ^ 0xFFFFFFDF);
        class223.method1549(2);
        class7.method70(-113);
        class274.method1866(109);
        class147.method1126((byte) 45);
        class109.method889((byte) -94);
        class124.method973(true);
        class116.method929(arg0 + 3072);
        class245.method1705((byte) 113);
        class260.method1809(false);
        class98.method836(true);
        class46.method391(1);
        class273.method1862((byte) 13);
        class133.method1040(arg0 ^ 0xFFFFFF93);
        class232.method1641((byte) 115);
        class80.method659(false);
        class55.method453((byte) -124);
        class140.method1076(arg0 ^ 0xFFFFFFC8);
        class157.method1194(arg0 + 196);
        class13.method139(false);
        class249.method1735(5551);
        class128.method1000((byte) -101);
        class233.method1647(156);
        class191.method1358((byte) 0);
        class97.method821(-20257);
        class61.method515((byte) -42);
        class217.method1492((byte) 6);
        class21.method233(256);
        class236.method1662(true);
        class252.method1778((byte) -126);
        class67.method586((byte) -126);
        class246.method1719(arg0 + 73);
        class65.method574(-30262);
        class95.method812((byte) -118);
        class99.method847((byte) -43);
        class266.method1839(0);
        class92.method780(1);
        class194.method1379(false);
        class222.method1513((byte) 120);
        class251.method1774((byte) 75);
        class229.method1578((byte) 98);
        class250.method1753();
        class248.method1728(-102);
        class12.method131((byte) -34);
        class90.method750();
        class178.method1294(80);
        class24.method254(arg0 ^ 0x1AD0);
        class201.method1415(-9757);
        class272.method1856((byte) 3);
        class82.method665((byte) -125);
        class48.method403(arg0 ^ 0xFFFFFFCF);
        class59.method505((byte) 97);
        class49.method406(false);
        class93.method786();
        class270.method1850((byte) -124);
        class183.method1316(7429);
        class152.method1156();
        class243.method1692((byte) -47);
        class29.method270(-86);
        class135.method1046(87);
        class73.method622();
        class269.method1848((byte) -122);
        class79.method656(16777215);
        class114.method911(false);
        class110.method894(0);
        class87.method695();
        class91.method770(true);
        class117.method939(-4);
        class6.method62(129);
        class255.method1786(-125);
        class30.method279(-89);
        class37.method334(128);
        class112.method903((byte) -75);
        class146.method1113(21903);
        class33.method304((byte) 17);
        class170.method1253(arg0 ^ 0x44);
        class200.method1414(-128);
        class169.method1246(-1);
        class39.method351((byte) 127);
        class8.method83(8526);
        class100.method856(-79);
        class210.method1462(3);
        class168.method1243(0);
        class77.method640((byte) 95);
        class31.method290((byte) 42);
        class225.method1553(arg0 + 183);
        class186.method1328(true);
        class89.method735(-107);
        class34.method310((byte) -42);
        class3.method32();
        class234.method1653((byte) 23);
        class207.method1449((byte) 60);
        class219.method1508((byte) -8);
        class23.method251(-121);
        class120.method946(411326771);
        class106.method880(0);
        class131.method1032(true);
        class75.method631(0);
        class70.method608(2);
        class111.method897((byte) -49);
        class221.method1510(0);
        class108.method888((byte) 90);
        class265.method1836((byte) -99);
        class56.method472(arg0 + 192);
        class176.method1284(-112);
        class36.method330((byte) -119);
        class224.method1551();
        class171.method1260((byte) -49);
        class173.method1268(92);
        class263.method1826((byte) -55);
        class154.method1178((byte) 94);
        class101.method860((byte) 127);
        class247.method1726(arg0 ^ 0x186E4);
        class197.method1406(205);
        class212.method1471(arg0 + 121);
        class66.method581(true);
        class151.method1138(107);
        class228.method1573(-32685);
        class161.method1213(true);
        class74.method625();
        class215.method1486((byte) 25);
        class84.method679(arg0 ^ 0xFFFFFFFE);
        class58.method498((byte) -73);
        class153.method1171((byte) -16);
        class244.method1703(arg0 - 3968);
        class88.method718(arg0 - 5901);
        class206.method1445(0);
        class258.method1804(0);
        class259.method1805((byte) -123);
        class216.method1491((byte) 107);
        class271.method1854(arg0 + 67108932);
        class144.method1100((byte) 24);
        class209.method1457(36);
        class268.method1847(arg0 ^ 0xFFFFFFBF);
        class41.method365((byte) 56);
        class25.method256(arg0 - 25);
        class127.method997(false);
        class254.method1784((byte) -128);
        class141.method1081(69);
        class2.method8();
        class132.method1035((byte) 85);
        class172.method1263((byte) -127);
        class164.method1230(arg0 ^ 0xFFFFD128);
        class22.method243(0);
        class9.method87((byte) 74);
        class163.method1222(0);
        class256.method1796();
        class32.method299();
        class198.method1409();
        class27.method262((byte) -124);
        class138.method1062(true);
        class158.method1202((byte) 117);
        class188.method1347();
        class174.method1273();
        class238.method1669((byte) -118);
        class275.method1868(3043);
        class123.method967(25);
        class40.method356((byte) 96);
        class145.method1109((byte) -6);
        class184.method1321(-11276);
        class45.method386((byte) -40);
        class103.method872(arg0 + 69);
        class203.method1423(-5401);
        class121.method951(arg0 - 22751);
        class102.method864(0);
        class44.method381((byte) 98);
        class5.method55(false);
        class162.method1216(-30416);
        class52.method414(1376312589);
        class130.method1025(-16);
        class68.method593(arg0 ^ 0xFFFFFFFC);
        class60.method514(109);
        class134.method1042(1);
        class51.method412(-127);
        class214.method1480(0);
        class17.method218(3);
        class85.method682(4181);
        class54.method424((byte) 8);
        class218.method1503(-25855);
        class166.method1233((byte) 80);
        class179.method1303(arg0 ^ 0xFFFFFFBB);
        class26.method259(-77);
        class15.method204(-2);
        class190.method1357((byte) -106);
        class262.method1821(-104);
        class264.method1828(arg0 + 160);
        class160.method1209((byte) -97);
        class185.method1325(arg0 - 2078296404);
        class47.method399((byte) -67);
        class1.method5(arg0 - 16991);
        class125.method980(-103);
        class16.method211(-21158);
        class180.method1305(true);
        class182.method1307(70);
        class78.method653(-1031);
        class136.method1053((byte) -123);
        class18.method227((byte) -89);
        class72.method613(123);
        class227.method1570(59);
        class167.method1234(arg0 - 40);
        class187.method1335(0);
        class104.method877((byte) -118);
        class240.method1686(-1);
        class204.method1427(500);
        class53.method423(-120);
        class213.method1476(arg0 ^ 0x7E);
        class105.method879(32);
        class237.method1666(0);
        class76.method634(0);
        class28.method266(-19215);
        class139.method1067(-120);
        class196.method1396((byte) 40);
        class96.method817(false);
        class149.method1131(1);
        class155.method1184(arg0 ^ 0x44);
        if (arg0 != -69) {
            field2705 = null;
        }
        class71.method609((byte) 96);
        class231.method1637(arg0 ^ 0x5A);
        class118.method944(0);
        class42.method369((byte) 94);
        class115.method916((byte) 106);
        class142.method1085(arg0 + 70);
        class267.method1844(arg0 + 186);
        class113.method907(-7759);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method1166(boolean arg0) {
        field2715++;
        if (!arg0) {
            method1160(-59);
        }
        for (class185.field3252 = 0; class51.method411(-1) && class185.field3252 < 128; class185.field3252++) {
            class97.field1764[class185.field3252] = class214.field3699;
            class40.field737[class185.field3252] = class216.field3727;
        }
        class219.field3771++;
        if (class263.field4679 != -1) {
            class267.method1842(class135.field2434, 0, class263.field4679, 38, 0, 0, 0, class180.field3155);
        }
        class54.field935++;
        class144.method1098((byte) 127);
        while (true) {
            class75 var2;
            class245 var3;
            class245 var4;
            do {
                var2 = (class75) class173.field3056.method835(!arg0);
                if (var2 == null) {
                    while (true) {
                        class75 var5;
                        class245 var6;
                        class245 var7;
                        do {
                            var5 = (class75) class225.field3883.method835(!arg0);
                            if (var5 == null) {
                                while (true) {
                                    class75 var8;
                                    class245 var9;
                                    class245 var10;
                                    do {
                                        var8 = (class75) class123.field2161.method835(!arg0);
                                        if (var8 == null) {
                                            if (class229.field3940 != null) {
                                                class77.method645(-119);
                                            }
                                            if (class172.field3040 != null && class172.field3040.field3421 == 1) {
                                                if (class172.field3040.field3423 != null) {
                                                    class23.method250(class171.field3030, class97.field1750, (byte) -119);
                                                }
                                                class97.field1750 = false;
                                                class171.field3030 = null;
                                                class172.field3040 = null;
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1354;
                                        if (var9.field4313 < 0) {
                                            break;
                                        }
                                        var10 = class155.method1183(var9.field4245, 17);
                                    } while (var10 == null || var10.field4318 == null || var9.field4313 >= var10.field4318.length || var10.field4318[var9.field4313] != var9);
                                    class58.method495(var8, 150);
                                }
                            }
                            var6 = var5.field1354;
                            if (var6.field4313 < 0) {
                                break;
                            }
                            var7 = class155.method1183(var6.field4245, 17);
                        } while (var7 == null || var7.field4318 == null || var7.field4318.length <= var6.field4313 || var7.field4318[var6.field4313] != var6);
                        class58.method495(var5, 150);
                    }
                }
                var3 = var2.field1354;
                if (var3.field4313 < 0) {
                    break;
                }
                var4 = class155.method1183(var3.field4245, 17);
            } while (var4 == null || var4.field4318 == null || var4.field4318.length <= var3.field4313 || var4.field4318[var3.field4313] != var3);
            class58.method495(var2, 150);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lka;)I")
    public static final int method1167(class245 arg0) {
        class244 var1 = (class244) class115.field2062.method394(((long) arg0.field4362 << 32) + (long) arg0.field4313, -21083);
        return var1 == null ? arg0.field4274 : var1.field4189;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private static final void method1168(int arg0) {
        field2703++;
        if (class178.field3138 == 0 || class178.field3138 == 5) {
            return;
        }
        try {
            if ((++class49.field863) > 2000) {
                if (class30.field556 != null) {
                    class30.field556.method1818(arg0 - 4);
                    class30.field556 = null;
                }
                if (class27.field504 >= 1) {
                    class159.field2831 = -5;
                    class178.field3138 = 0;
                    return;
                }
                if (class166.field2932 == class104.field1894) {
                    class166.field2932 = class249.field4427;
                } else {
                    class166.field2932 = class104.field1894;
                }
                class49.field863 = 0;
                class178.field3138 = 1;
                class27.field504++;
            }
            if (class178.field3138 == 1) {
                class53.field909 = class184.field3228.method1024((byte) -65, class112.field2014, class166.field2932);
                class178.field3138 = 2;
            }
            if (class178.field3138 == arg0) {
                if (class53.field909.field3421 == 2) {
                    throw new IOException();
                }
                if (class53.field909.field3421 != 1) {
                    return;
                }
                class30.field556 = new class261((Socket) class53.field909.field3423, class184.field3228);
                class53.field909 = null;
                long var1 = class17.field381 = class89.field1579.method1587(101);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class153.field2747.field318 = 0;
                class153.field2747.method170((byte) 124, 14);
                class153.field2747.method170((byte) 122, var3);
                class30.field556.method1817(class153.field2747.field269, 0, arg0 - 12154, 2);
                if (class92.field1659 != null) {
                    class92.field1659.method1072(arg0 - 129);
                }
                if (class133.field2414 != null) {
                    class133.field2414.method1072(-123);
                }
                int var4 = class30.field556.method1814(0);
                if (class92.field1659 != null) {
                    class92.field1659.method1072(-123);
                }
                if (class133.field2414 != null) {
                    class133.field2414.method1072(-127);
                }
                if (var4 != 0) {
                    class159.field2831 = var4;
                    class178.field3138 = 0;
                    class30.field556.method1818(-2);
                    class30.field556 = null;
                    return;
                }
                class178.field3138 = 3;
            }
            if (class178.field3138 == 3) {
                if (class30.field556.method1816(0) < 8) {
                    return;
                }
                class30.field556.method1819(8, 0, class183.field3182.field269, (byte) 122);
                int[] var5 = new int[4];
                class183.field3182.field318 = 0;
                class121.field2134 = class183.field3182.method150(true);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class121.field2134;
                class153.field2747.field318 = 0;
                var5[2] = (int) (class121.field2134 >> 32);
                class153.field2747.method170((byte) 113, 10);
                class153.field2747.method165(var5[0], 1380186760);
                class153.field2747.method165(var5[1], 1380186760);
                class153.field2747.method165(var5[2], 1380186760);
                class153.field2747.method165(var5[3], 1380186760);
                class153.field2747.method148(class89.field1579.method1587(arg0 + 77), (byte) 114);
                class153.field2747.method197(0, class89.field1545);
                class153.field2747.method163(class75.field1368, false, class75.field1363);
                class52.field892.field318 = 0;
                if (class57.field1057 == 40) {
                    class52.field892.method170((byte) 112, 18);
                } else {
                    class52.field892.method170((byte) 127, 16);
                }
                class52.field892.method181(-20053, (class153.field2747.field318 + class17.method217((byte) 79, class237.field4100)) + 154);
                class52.field892.method165(516, 1380186760);
                class52.field892.method170((byte) 121, class214.field3712);
                class52.field892.method170((byte) 125, class24.field460 ? 1 : 0);
                class52.field892.method170((byte) 126, 0);
                class52.field892.method170((byte) 126, class55.method444((byte) 123));
                class52.field892.method181(-20053, class180.field3155);
                class52.field892.method181(-20053, class135.field2434);
                class157.method1196(0, class52.field892);
                class52.field892.method197(arg0 ^ 0x2, class237.field4100);
                class52.field892.method165(class56.field1035, 1380186760);
                class52.field892.method165(class177.method1288((byte) -67), 1380186760);
                class270.field4778 = true;
                class52.field892.method181(-20053, class146.field2621);
                class52.field892.method165(class58.field1092.method1517(101), 1380186760);
                class52.field892.method165(class117.field2101.method1517(122), 1380186760);
                class52.field892.method165(class247.field4390.method1517(112), 1380186760);
                class52.field892.method165(class109.field1955.method1517(arg0 ^ 0x70), arg0 + 1380186758);
                class52.field892.method165(class40.field733.method1517(95), 1380186760);
                class52.field892.method165(class183.field3224.method1517(117), 1380186760);
                class52.field892.method165(class197.field3528.method1517(102), 1380186760);
                class52.field892.method165(class163.field2914.method1517(arg0 ^ 0x7B), 1380186760);
                class52.field892.method165(class97.field1781.method1517(98), arg0 ^ 0x5243FA8A);
                class52.field892.method165(class89.field1555.method1517(109), 1380186760);
                class52.field892.method165(class76.field1374.method1517(101), 1380186760);
                class52.field892.method165(class51.field878.method1517(116), 1380186760);
                class52.field892.method165(class271.field4782.method1517(arg0 ^ 0x6B), 1380186760);
                class52.field892.method165(class131.field2351.method1517(arg0 + 94), 1380186760);
                class52.field892.method165(class243.field4183.method1517(102), 1380186760);
                class52.field892.method165(class194.field3431.method1517(arg0 + 120), 1380186760);
                class52.field892.method165(class29.field534.method1517(116), 1380186760);
                class52.field892.method165(class1.field10.method1517(118), 1380186760);
                class52.field892.method165(class67.field1268.method1517(117), 1380186760);
                class52.field892.method165(class162.field2884.method1517(arg0 ^ 0x66), 1380186760);
                class52.field892.method165(class251.field4494.method1517(111), arg0 + 1380186758);
                class52.field892.method165(class179.field3146.method1517(97), 1380186760);
                class52.field892.method165(class99.field1822.method1517(arg0 ^ 0x6A), 1380186760);
                class52.field892.method165(class245.field4294.method1517(98), arg0 ^ 0x5243FA8A);
                class52.field892.method165(class34.field622.method1517(arg0 ^ 0x67), 1380186760);
                class52.field892.method165(class274.field4821.method1517(107), arg0 ^ 0x5243FA8A);
                class52.field892.method165(class194.field3426.method1517(98), arg0 + 1380186758);
                class52.field892.method159(class153.field2747.field269, 0, false, class153.field2747.field318);
                class30.field556.method1817(class52.field892.field269, 0, -12152, class52.field892.field318);
                class153.field2747.method977(arg0 + 122, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class183.field3182.method977(77, var5);
                class178.field3138 = 4;
            }
            if (class178.field3138 == 4) {
                if (class30.field556.method1816(0) < 1) {
                    return;
                }
                int var7 = class30.field556.method1814(0);
                if (var7 == 21) {
                    class178.field3138 = 7;
                } else if (var7 == 29) {
                    class178.field3138 = 10;
                } else if (var7 == 1) {
                    class178.field3138 = 5;
                    class159.field2831 = var7;
                    return;
                } else if (var7 == 2) {
                    class178.field3138 = 8;
                } else if (var7 == 15) {
                    class159.field2831 = var7;
                    class178.field3138 = 0;
                    return;
                } else if (var7 == 23 && class27.field504 < 1) {
                    class27.field504++;
                    class49.field863 = 0;
                    class178.field3138 = 1;
                    class30.field556.method1818(-2);
                    class30.field556 = null;
                    return;
                } else {
                    class178.field3138 = 0;
                    class159.field2831 = var7;
                    class30.field556.method1818(-2);
                    class30.field556 = null;
                    return;
                }
            }
            if (class178.field3138 == 6) {
                class153.field2747.field318 = 0;
                class153.field2747.method978(40, 17);
                class30.field556.method1817(class153.field2747.field269, 0, -12152, class153.field2747.field318);
                class178.field3138 = 4;
            } else if (class178.field3138 == 7) {
                if (class30.field556.method1816(arg0 ^ 0x2) >= 1) {
                    class134.field2423 = class30.field556.method1814(arg0 ^ 0x2) * 60 + 180;
                    class178.field3138 = 0;
                    class159.field2831 = 21;
                    class30.field556.method1818(-2);
                    class30.field556 = null;
                }
            } else if (class178.field3138 != 10) {
                if (class178.field3138 == 8) {
                    if (class30.field556.method1816(0) < 12) {
                        return;
                    }
                    class30.field556.method1819(12, 0, class183.field3182.field269, (byte) 110);
                    class183.field3182.field318 = 0;
                    class30.field545 = class183.field3182.method200(255);
                    class24.field452 = class183.field3182.method200(255);
                    class48.field841 = class183.field3182.method200(255);
                    if (!class24.field460) {
                        if (class48.field841 == 1) {
                            try {
                                class54.field945.method1588(92, class184.field3228.field2320);
                            } catch (Throwable var9) {
                            }
                        } else {
                            try {
                                class263.field4680.method1588(arg0 ^ 0xFFFFFFD8, class184.field3228.field2320);
                            } catch (Throwable var8) {
                            }
                        }
                    }
                    class22.field433 = class183.field3182.method200(255);
                    class28.field516 = class183.field3182.method200(255) == 1;
                    class33.field615 = class183.field3182.method161(arg0 + 2);
                    class80.field1460 = class183.field3182.method200(255) == 1;
                    class222.field3805 = class183.field3182.method200(255) == 1;
                    class146.method1115((byte) 126, class222.field3805);
                    class8.method80(class222.field3805, 180);
                    class259.field4572 = class183.field3182.method979(arg0 - 98);
                    class16.field368 = class183.field3182.method161(4);
                    class178.field3138 = 9;
                }
                if (class178.field3138 == 9 && class30.field556.method1816(0) >= class16.field368) {
                    class183.field3182.field318 = 0;
                    class30.field556.method1819(class16.field368, 0, class183.field3182.field269, (byte) 113);
                    class159.field2831 = 2;
                    class178.field3138 = 0;
                    class267.method1843(0);
                    class273.field4809 = -1;
                    class183.method1315(false, 6);
                    class259.field4572 = -1;
                }
            } else if (class30.field556.method1816(arg0 ^ 0x2) >= 1) {
                class17.field387 = class30.field556.method1814(arg0 ^ 0x2);
                class178.field3138 = 0;
                class159.field2831 = 29;
                class30.field556.method1818(-2);
                class30.field556 = null;
            }
        } catch (IOException var10) {
            if (class30.field556 != null) {
                class30.field556.method1818(arg0 - 4);
                class30.field556 = null;
            }
            if (class27.field504 >= 1) {
                class159.field2831 = -4;
                class178.field3138 = 0;
            } else {
                if (class166.field2932 == class104.field1894) {
                    class166.field2932 = class249.field4427;
                } else {
                    class166.field2932 = class104.field1894;
                }
                class27.field504++;
                class49.field863 = 0;
                class178.field3138 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
    private final void method1169(byte arg0, int arg1) {
        class101.field1858 = 0;
        class251.field4500++;
        if (class166.field2932 == class104.field1894) {
            class166.field2932 = class249.field4427;
        } else {
            class166.field2932 = class104.field1894;
        }
        class145.field2605 = null;
        if (arg0 != -8) {
            field2708 = null;
        }
        field2710++;
        class127.field2223 = null;
        if (class251.field4500 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class57.field1057 == 0 || class57.field1057 == 5) {
                this.method38("js5connect_full", (byte) -84);
                class57.field1057 = 1000;
            } else {
                class202.field3570 = 3000;
            }
        } else if (class251.field4500 >= 2 && arg1 == 6) {
            this.method38("js5connect_outofdate", (byte) -112);
            class57.field1057 = 1000;
        } else if (class251.field4500 >= 4) {
            if (class57.field1057 == 0 || class57.field1057 == 5) {
                this.method38("js5connect", (byte) -30);
                class57.field1057 = 1000;
            } else {
                class202.field3570 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1170(byte arg0) {
        if (!class18.field404) {
            label222: while (true) {
                do {
                    if (!class51.method411(-1)) {
                        break label222;
                    }
                } while (class216.field3727 != 115 && class216.field3727 != 83);
                class18.field404 = true;
            }
        }
        field2712++;
        if (class48.field850 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class201.method1419(5);
            if (class18.field389 == 0L) {
                class18.field389 = var4;
            }
            if (var3 > 16384 && (var4 - class18.field389) < 5000L) {
                if ((var4 - class16.field358) > 1000L) {
                    System.gc();
                    class16.field358 = var4;
                }
                class84.field1493 = 5;
                class145.field2598 = class51.field884;
            } else {
                class84.field1493 = 5;
                class48.field850 = 10;
                class145.field2598 = class170.field3006;
            }
        } else if (class48.field850 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class112.field2007[var6] = new class116(104, 104);
            }
            class48.field850 = 30;
            class145.field2598 = class16.field362;
            class84.field1493 = 10;
        } else if (class48.field850 == 30) {
            if (class196.field3514 == null) {
                class196.field3514 = new class35(class56.field1040, class109.field1967);
            }
            if (class196.field3514.method326(1)) {
                class58.field1092 = class169.method1248(0, false, true, true, 1000000);
                class117.field2101 = class169.method1248(1, false, true, true, 1000000);
                class247.field4390 = class169.method1248(2, true, true, false, 1000000);
                class109.field1955 = class169.method1248(3, false, true, true, 1000000);
                class40.field733 = class169.method1248(4, false, true, true, 1000000);
                class183.field3224 = class169.method1248(5, true, true, true, 1000000);
                class197.field3528 = class169.method1248(6, true, false, true, 1000000);
                class163.field2914 = class169.method1248(7, false, true, true, 1000000);
                class97.field1781 = class169.method1248(8, false, true, true, 1000000);
                class89.field1555 = class169.method1248(9, false, true, true, 1000000);
                class76.field1374 = class169.method1248(10, false, true, true, 1000000);
                class51.field878 = class169.method1248(11, false, true, true, 1000000);
                class271.field4782 = class169.method1248(12, false, true, true, 1000000);
                class131.field2351 = class169.method1248(13, false, true, true, 1000000);
                class243.field4183 = class169.method1248(14, false, false, true, 1000000);
                class194.field3431 = class169.method1248(15, false, true, true, 1000000);
                class29.field534 = class169.method1248(16, false, true, true, 1000000);
                class1.field10 = class169.method1248(17, false, true, true, 1000000);
                class67.field1268 = class169.method1248(18, false, true, true, 1000000);
                class162.field2884 = class169.method1248(19, false, true, true, 1000000);
                class251.field4494 = class169.method1248(20, false, true, true, 1000000);
                class179.field3146 = class169.method1248(21, false, true, true, 1000000);
                class99.field1822 = class169.method1248(22, false, true, true, 1000000);
                class245.field4294 = class169.method1248(23, true, true, true, 1000000);
                class34.field622 = class169.method1248(24, false, true, true, 1000000);
                class274.field4821 = class169.method1248(25, false, true, true, 1000000);
                class194.field3426 = class169.method1248(26, true, true, true, 1000000);
                class48.field850 = 40;
                class145.field2598 = class192.field3389;
                class84.field1493 = 15;
            } else {
                class145.field2598 = class18.field407;
                class84.field1493 = 12;
            }
        } else {
            if (arg0 < 44) {
                field2721 = null;
            }
            if (class48.field850 == 40) {
                int var7 = 0;
                for (int var8 = 0; var8 < 27; var8++) {
                    var7 += class138.field2474[var8].method483(true) * class184.field3234[var8] / 100;
                }
                if (var7 == 100) {
                    class145.field2598 = class59.field1127;
                    class84.field1493 = 20;
                    class133.method1038((byte) 101, class97.field1781);
                    class15.method207(class97.field1781, -2139);
                    class15.method205(-88, class97.field1781);
                    class48.field850 = 45;
                } else {
                    if (var7 != 0) {
                        class145.field2598 = class173.method1267((byte) 59, new class230[] { class109.field1958, class37.method340(var7, (byte) -26), class40.field734 });
                    }
                    class84.field1493 = 20;
                }
            } else if (class48.field850 == 45) {
                class169.method1245(22050, 2, -459489680, class127.field2228);
                class164.field2923 = new class55();
                class164.field2923.method452(9, 128, -45);
                class92.field1659 = class161.method1212(class14.field307, (byte) 85, 0, 22050, class184.field3228);
                class92.field1659.method1079(class164.field2923, -114);
                class243.method1693(class164.field2923, class40.field733, class194.field3431, false, class243.field4183);
                class133.field2414 = class161.method1212(class14.field307, (byte) -114, 1, 2048, class184.field3228);
                class117.field2096 = new class239();
                class133.field2414.method1079(class117.field2096, 64);
                class189.field3323 = new class157(22050, class55.field1011);
                class223.field3813 = class197.field3528.method1521(8994, class179.field3143);
                class48.field850 = 50;
                class84.field1493 = 30;
                class145.field2598 = class270.field4776;
            } else if (class48.field850 == 50) {
                int var9 = class141.method1082(true, class97.field1781, class131.field2351);
                int var10 = class21.method235(-94);
                if (var9 < var10) {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class110.field1974, class37.method340(var9 * 100 / var10, (byte) -26), class40.field734 });
                    class84.field1493 = 35;
                } else {
                    class48.field850 = 60;
                    class84.field1493 = 35;
                    class145.field2598 = class7.field123;
                }
            } else if (class48.field850 == 60) {
                int var11 = class127.method998(23453, class97.field1781);
                int var12 = class84.method678(4296);
                if (var12 > var11) {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class168.field2964, class37.method340(var11 * 100 / var12, (byte) -26), class40.field734 });
                    class84.field1493 = 40;
                } else {
                    class84.field1493 = 40;
                    class48.field850 = 65;
                    class145.field2598 = class54.field942;
                }
            } else if (class48.field850 == 65) {
                class33.method301(-125, class97.field1781, class131.field2351);
                class84.field1493 = 45;
                class145.field2598 = class240.field4145;
                class26.method260(-11, 5);
                class48.field850 = 70;
            } else if (class48.field850 == 70) {
                class247.field4390.method1539(0);
                byte var13 = 0;
                int var14 = var13 + class247.field4390.method1526((byte) 46);
                class29.field534.method1539(0);
                int var15 = var14 + class29.field534.method1526((byte) 122);
                class1.field10.method1539(0);
                int var16 = var15 + class1.field10.method1526((byte) -96);
                class67.field1268.method1539(0);
                int var17 = var16 + class67.field1268.method1526((byte) 111);
                class162.field2884.method1539(0);
                int var18 = var17 + class162.field2884.method1526((byte) 101);
                class251.field4494.method1539(0);
                int var19 = var18 + class251.field4494.method1526((byte) -99);
                class179.field3146.method1539(0);
                int var20 = var19 + class179.field3146.method1526((byte) 93);
                class99.field1822.method1539(0);
                int var21 = var20 + class99.field1822.method1526((byte) -90);
                class34.field622.method1539(0);
                int var22 = var21 + class34.field622.method1526((byte) 38);
                class274.field4821.method1539(0);
                int var23 = var22 + class274.field4821.method1526((byte) 106);
                if (var23 < 1000) {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class243.field4184, class37.method340(var23 / 10, (byte) -26), class40.field734 });
                    class84.field1493 = 50;
                } else {
                    class1.method1(class247.field4390, 1);
                    class254.method1783(class247.field4390, -94);
                    class255.method1791(class247.field4390, (byte) 46);
                    class100.method850(class163.field2914, class247.field4390, 3);
                    class58.method502(103, class29.field534, true, class163.field2914);
                    class205.method1443(class67.field1268, 21146, class163.field2914);
                    class260.method1808(class163.field2914, class216.field3731, true, -1, class162.field2884);
                    class192.method1366(false, class247.field4390);
                    class18.method220(class58.field1092, class251.field4494, class117.field2101, 0);
                    class29.method268(class179.field3146, 2, class163.field2914);
                    class177.method1285(class99.field1822, false);
                    class225.method1554(11, class247.field4390);
                    class103.method867(class131.field2351, class109.field1955, class97.field1781, (byte) -74, class163.field2914);
                    class56.method471(-121, class247.field4390);
                    class135.method1045(64, class1.field10);
                    class179.method1301(17, class274.field4821, class34.field622, new class225());
                    class100.method853(-123, class274.field4821, class34.field622);
                    class145.field2598 = class219.field3768;
                    class84.field1493 = 50;
                    class210.method1460(76);
                    class48.field850 = 80;
                }
            } else if (class48.field850 == 80) {
                int var24 = class249.method1736(class97.field1781, -123);
                int var25 = class89.method727(120);
                if (var25 > var24) {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class234.field4075, class37.method340(var24 * 100 / var25, (byte) -26), class40.field734 });
                    class84.field1493 = 60;
                } else {
                    class56.method474(65, class97.field1781);
                    class48.field850 = 90;
                    class145.field2598 = class60.field1155;
                    class84.field1493 = 60;
                }
            } else if (class48.field850 == 90) {
                if (class194.field3426.method1539(0)) {
                    class89 var26 = new class89(class89.field1555, class194.field3426, class97.field1781, 20, !class191.field3372);
                    class3.method23(var26);
                    if (class196.field3510 == 1) {
                        class3.method16(0.9F);
                    }
                    if (class196.field3510 == 2) {
                        class3.method16(0.8F);
                    }
                    if (class196.field3510 == 3) {
                        class3.method16(0.7F);
                    }
                    if (class196.field3510 == 4) {
                        class3.method16(0.6F);
                    }
                    class145.field2598 = class258.field4567;
                    class84.field1493 = 70;
                    class48.field850 = 100;
                } else {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class161.field2876, class37.method340(class194.field3426.method1526((byte) 63), (byte) -26), class40.field734 });
                    class84.field1493 = 70;
                }
            } else if (class48.field850 == 100) {
                if (class76.method633(class97.field1781, 109)) {
                    class48.field850 = 110;
                }
            } else if (class48.field850 == 110) {
                class151.field2684 = new class107();
                class184.field3228.method1019(class151.field2684, (byte) -97, 10);
                class84.field1493 = 75;
                class48.field850 = 120;
                class145.field2598 = class203.field3582;
            } else if (class48.field850 == 120) {
                if (class76.field1374.method1544(-31833, class89.field1580, class78.field1407)) {
                    class234 var27 = new class234(class76.field1374.method1538(class78.field1407, false, class89.field1580));
                    class228.method1575(var27, -122);
                    class145.field2598 = class245.field4327;
                    class84.field1493 = 80;
                    class48.field850 = 130;
                } else {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class168.field2959, class48.field854 });
                    class84.field1493 = 80;
                }
            } else if (class48.field850 == 130) {
                if (!class109.field1955.method1539(0)) {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class132.field2365, class37.method340(class109.field1955.method1526((byte) -126) * 3 / 4, (byte) -26), class40.field734 });
                    class84.field1493 = 85;
                } else if (!class271.field4782.method1539(0)) {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class132.field2365, class37.method340(class271.field4782.method1526((byte) 38) / 10 + 75, (byte) -26), class40.field734 });
                    class84.field1493 = 85;
                } else if (!class131.field2351.method1539(0)) {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class132.field2365, class37.method340(class131.field2351.method1526((byte) 78) / 20 + 85, (byte) -26), class40.field734 });
                    class84.field1493 = 85;
                } else if (class245.field4294.method1542(class89.field1565, -109)) {
                    class109.method891(0, class66.field1234, class238.field4120, class245.field4294, class96.field1731, class123.field2141, class243.field4185);
                    class145.field2598 = class54.field927;
                    class48.field850 = 135;
                    class84.field1493 = 95;
                } else {
                    class145.field2598 = class173.method1267((byte) 59, new class230[] { class132.field2365, class37.method340(class245.field4294.method1518(class89.field1565, (byte) -47) / 10 + 90, (byte) -26), class40.field734 });
                    class84.field1493 = 85;
                }
            } else if (class48.field850 == 135) {
                if (class18.method224((byte) 63)) {
                    class48.field850 = 140;
                    class145.field2598 = class213.field3691;
                    class84.field1493 = 96;
                } else {
                    class84.field1493 = 95;
                    class145.field2598 = class191.field3374;
                }
            } else if (class48.field850 == 140) {
                class110.field1977 = class109.field1955.method1521(8994, class31.field585);
                class183.field3224.method1527(0, true, false);
                class197.field3528.method1527(0, true, true);
                class97.field1781.method1527(0, true, true);
                class131.field2351.method1527(0, true, true);
                class76.field1374.method1527(0, true, true);
                class109.field1955.method1527(0, true, true);
                class48.field850 = 150;
                class128.field2249 = true;
                class84.field1493 = 97;
                class145.field2598 = class168.field2966;
            } else if (class48.field850 == 150) {
                if (class18.field404) {
                    class190.field3354 = 0;
                }
                class18.field404 = true;
                class108.method887(class184.field3228, 53);
                class37.method335((byte) 106, class190.field3354, -1, false, -1);
                class48.field850 = 160;
                class145.field2598 = class130.field2338;
                class84.field1493 = 100;
            } else if (class48.field850 == 160) {
                class127.method993(true, (byte) -5);
            }
        }
    }
}
