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
public class client extends class321 {

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3447 = 99;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lfi;")
    public static class166 field3444 = new class166();

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
    public static int[] field3449 = new int[14];

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    private static int field3450;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field3451;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1638() {
        int var0 = class22.field404 ? class174.field2579 : class221.field3055 + class174.field2579;
        for (int var1 = -1; var1 < var0; var1++) {
            class362 var2;
            if (var1 < 0) {
                var2 = class95.field1379;
            } else if (var1 < class174.field2579) {
                var2 = class220.field3044[class134.field1921[var1]];
            } else {
                var2 = class298.field4012[class209.field2891[var1 - class174.field2579]];
            }
            var2.field4938 = 0;
            if (var2.field4923 < 0) {
                var2.field4972 = false;
            } else {
                int var3 = var2.method2146(51);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field3176 & 0x7F) != 0 || (var2.field3167 & 0x7F) != 0) {
                        var2.field4972 = false;
                        continue;
                    }
                } else if ((var2.field3176 & 0x7F) != 64 || (var2.field3167 & 0x7F) != 64) {
                    var2.field4972 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field3176 >> 7;
                    int var5 = var2.field3167 >> 7;
                    if (class183.field2660[var4][var5] != var2.field4923) {
                        var2.field4972 = true;
                        continue;
                    }
                    if (class269.field3627[var4][var5] > 1) {
                        var10002 = class269.field3627[var4][var5]--;
                        var2.field4972 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field3176 - var6 >> 7;
                    int var8 = var2.field3167 - var6 >> 7;
                    int var9 = var2.field3176 + var6 >> 7;
                    int var10 = var2.field3167 + var6 >> 7;
                    if (!class257.method1674(var9, var7, var10, var2.field4923, 19720, var8)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class183.field2660[var11][var12] == var2.field4923) {
                                    var10002 = class269.field3627[var11][var12]--;
                                }
                            }
                        }
                        var2.field4972 = true;
                        continue;
                    }
                }
                if (var2 instanceof class338 && var2.field4997 != null && class414.field5793 >= var2.field5003 && class414.field5793 < var2.field5002) {
                    ((class338) var2).field4586 = false;
                }
                var2.field4972 = false;
                var2.field3168 = class22.method281(1, class69.field1046, var2.field3167, var2.field3176);
                class384.method2379(var2, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1639() {
        for (int var0 = -1; var0 < class221.field3055 + class174.field2579; var0++) {
            class362 var1;
            if (var0 < 0) {
                var1 = class95.field1379;
            } else if (var0 < class174.field2579) {
                var1 = class220.field3044[class134.field1921[var0]];
            } else {
                var1 = class298.field4012[class209.field2891[var0 - class174.field2579]];
            }
            if (var1.field4923 >= 0) {
                int var2 = var1.method2146(45);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field3176 & 0x7F) != 0 || (var1.field3167 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field3176 & 0x7F) != 64 || (var1.field3167 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field3176 >> 7;
                    int var4 = var1.field3167 >> 7;
                    if (var1.field4923 > class183.field2660[var3][var4]) {
                        class183.field2660[var3][var4] = var1.field4923;
                        class269.field3627[var3][var4] = 1;
                    } else if (class183.field2660[var3][var4] == var1.field4923) {
                        var10002 = class269.field3627[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field3176 - var5 >> 7;
                    int var7 = var1.field3167 - var5 >> 7;
                    int var8 = var1.field3176 + var5 >> 7;
                    int var9 = var1.field3167 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field4923 > class183.field2660[var10][var11]) {
                                class183.field2660[var10][var11] = var1.field4923;
                                class269.field3627[var10][var11] = 1;
                            } else if (class183.field2660[var10][var11] == var1.field4923) {
                                var10002 = class269.field3627[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1640() {
        int var0 = class22.field404 ? class174.field2579 : class221.field3055 + class174.field2579;
        for (int var1 = -1; var1 < var0; var1++) {
            class362 var2;
            if (var1 < 0) {
                var2 = class95.field1379;
            } else if (var1 < class174.field2579) {
                var2 = class220.field3044[class134.field1921[var1]];
            } else {
                var2 = class298.field4012[class209.field2891[var1 - class174.field2579]];
            }
            if (var2.field4923 >= 0) {
                int var3 = var2.method2146(19);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field3176 & 0x7F) == 0 && (var2.field3167 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field3176 & 0x7F) == 64 && (var2.field3167 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class338 && var2.field4997 != null && class414.field5793 >= var2.field5003 && class414.field5793 < var2.field5002) {
                    ((class338) var2).field4586 = false;
                }
                var2.field3168 = class22.method281(1, class69.field1046, var2.field3167, var2.field3176);
                class384.method2379(var2, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbi;)Lbi;")
    public static final class139 method1641(class139 arg0) {
        int var1 = method1648(arg0).method984(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class10.method57(65535, arg0.field2042);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1642() {
        class440.field6326 = 0;
        for (int var0 = 0; var0 < class221.field3055; var0++) {
            class127 var1 = class298.field4012[class209.field2891[var0]];
            if (var1.field4972 && var1.method989(4) != -1) {
                int var2 = (var1.method2146(-126) - 1) * 64 + 60;
                int var3 = var1.field3176 - var2 >> 7;
                int var4 = var1.field3167 - var2 >> 7;
                class362 var5 = class321.method2031(class69.field1046, var3, var4, false);
                if (var5 != null) {
                    int var6 = var5.field4957;
                    if (var5 instanceof class127) {
                        var6 += 2048;
                    }
                    if (var5.field4938 == 0 && var5.method989(4) != -1) {
                        class358.field4857[class440.field6326] = var6;
                        class19.field370[class440.field6326] = var6;
                        class440.field6326++;
                        var5.field4938++;
                    }
                    class358.field4857[class440.field6326] = var6;
                    class19.field370[class440.field6326] = var1.field4957 + 2048;
                    class440.field6326++;
                    var5.field4938++;
                }
            }
        }
        class8.method48(class358.field4857, (byte) -98, class19.field370, class440.field6326 - 1, 0);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method1643(byte arg0) {
        field3435++;
        if (arg0 > -94) {
            method1638();
        }
        boolean var2 = class118.field1650.method2770(95);
        if (!var2) {
            this.method1660(-106);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1644(byte arg0) {
        field3448++;
        if (class166.field2472 == 1000) {
            return;
        }
        long var2 = class447.method2784(4) / 1000000L - class344.field4669;
        int var4 = -72 / ((-arg0 - 40) / 49);
        class344.field4669 = class447.method2784(4) / 1000000L;
        boolean var5 = class40.method396(false);
        if (var5 && class166.field2473 && class76.field1136 != null) {
            class76.field1136.method1559(true);
        }
        if (class166.field2472 == 30 || class166.field2472 == 10) {
            if (class30.field504 != 0L && class108.method902((byte) -93) > class30.field504) {
                class81.method743((byte) -106, false, class422.field5903, class76.method651(-46), class42.field638);
            } else if (class249.field3415.method91() && class43.field648) {
                class118.method944(-13129);
            }
        }
        if (class416.field5820 == null) {
            Container var6;
            if (class414.field5781 == null) {
                var6 = class30.field502.field4117;
            } else {
                var6 = class414.field5781;
            }
            int var7 = var6.getSize().width;
            int var8 = var6.getSize().height;
            if (class414.field5781 == var6) {
                Insets var9 = class414.field5781.getInsets();
                var7 -= var9.right + var9.left;
                var8 -= var9.top + var9.bottom;
            }
            if (class417.field5853 != var7 || class135.field1927 != var8) {
                if (class249.field3415 == null || class249.field3415.method99()) {
                    class278.method1777((byte) 35);
                } else {
                    class135.field1927 = var8;
                    class417.field5853 = var7;
                }
                class30.field504 = class108.method902((byte) -93) + 500L;
            }
        }
        if (class416.field5820 != null && !class344.field4666 && (class166.field2472 == 30 || class166.field2472 == 10)) {
            class81.method743((byte) -124, false, -1, class102.field1513, -1);
        }
        boolean var10 = false;
        if (class415.field5809) {
            var10 = true;
            class415.field5809 = false;
        }
        if (var10) {
            class396.method2438(96);
        }
        if (class249.field3415 != null && class249.field3415.method258() || class76.method651(-125) != 1) {
            class125.method973(0);
        }
        if (class166.field2472 == 0) {
            class22.method285(class352.field4808[class96.field1393], class267.field3599, class312.field4217, var10, class170.field2512[class96.field1393], class290.field3941[class96.field1393], 115);
        } else if (class166.field2472 == 5) {
            class52.method504(class352.field4808[class96.field1393].getRGB(), var10 | class249.field3415.method258(), class96.field1387, (byte) -71, class249.field3415, class170.field2512[class96.field1393].getRGB(), class290.field3941[class96.field1393].getRGB());
        } else if (class166.field2472 == 10) {
            class341.method2168((byte) 120);
        } else if (class166.field2472 == 25 || class166.field2472 == 28) {
            if (class273.field3664 == 1) {
                if (class402.field5612 < class148.field2281) {
                    class402.field5612 = class148.field2281;
                }
                int var11 = (class402.field5612 - class148.field2281) * 50 / class402.field5612;
                class422.method2599(class22.field414, class338.field4607 + "<br>(" + var11 + "%)", 71, true);
            } else if (class273.field3664 == 2) {
                if (class186.field2696 > class321.field4326) {
                    class321.field4326 = class186.field2696;
                }
                int var12 = (class321.field4326 - class186.field2696) * 50 / class321.field4326 + 50;
                class422.method2599(class22.field414, class338.field4607 + "<br>(" + var12 + "%)", -95, true);
            } else {
                class422.method2599(class22.field414, class338.field4607, 53, true);
            }
        } else if (class166.field2472 == 30) {
            class23.method291(0, var2);
        } else if (class166.field2472 == 40) {
            class422.method2599(class22.field414, class3.field20 + "<br>" + class283.field3786, -110, true);
        }
        if (class90.field1340 == 3) {
            for (int var13 = 0; var13 < class352.field4817; var13++) {
                Rectangle var14 = class395.field5530[var13];
                if (class411.field5754[var13]) {
                    class249.field3415.method2414(var14.y, var14.x, var14.height, true, var14.width, -1996553985);
                } else if (class199.field2844[var13]) {
                    class249.field3415.method2414(var14.y, var14.x, var14.height, true, var14.width, -1996554240);
                }
            }
        }
        if (class30.method344(-710)) {
            class236.method1575(class249.field3415, false);
        }
        if ((class166.field2472 == 30 || class166.field2472 == 10) && class90.field1340 == 0 && class76.method651(-94) == 1 && !var10 && class304.field4118.equals("1.1")) {
            int var15 = 0;
            for (int var16 = 0; var16 < class352.field4817; var16++) {
                if (class199.field2844[var16]) {
                    class199.field2844[var16] = false;
                    class358.field4859[var15++] = class395.field5530[var16];
                }
            }
            class249.field3415.method103(class358.field4859, var15);
        } else if (class166.field2472 != 0) {
            class249.field3415.method246();
            for (int var17 = 0; var17 < class352.field4817; var17++) {
                class199.field2844[var17] = false;
            }
        }
        if (class236.field3281) {
            class55.method520((byte) 114);
        }
        if (class27.field476 && class166.field2472 == 10 && class149.field2288 != -1) {
            class27.field476 = false;
            class447.method2786((byte) 62, class30.field502);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lbi;)Z")
    public static final boolean method1645(class139 arg0) {
        if (class339.field4624) {
            if (method1648(arg0).field1767 != 0) {
                return false;
            }
            if (arg0.field2023 == 0) {
                return false;
            }
        }
        return arg0.field2072;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3442++;
        if (!this.method2036(-7473)) {
            return;
        }
        class375.field5270 = Integer.parseInt(this.getParameter("worldid"));
        class445.field6400 = Integer.parseInt(this.getParameter("modewhere"));
        if (class445.field6400 < 0 || class445.field6400 > 1) {
            class445.field6400 = 0;
        }
        class395.field5539 = Integer.parseInt(this.getParameter("modewhat"));
        if (class395.field5539 < 0 || class395.field5539 > 2) {
            class395.field5539 = 0;
        }
        try {
            class89.field1320 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class89.field1320 = 0;
        }
        class382.method2372(class89.field1320, 3628);
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class243.field3363 = true;
        } else {
            class243.field3363 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class101.field1504 = true;
        } else {
            class101.field1504 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class42.field640 = 1;
        } else {
            class42.field640 = 0;
        }
        try {
            class346.field4689 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class346.field4689 = 0;
        }
        class12.field90 = this.getParameter("quiturl");
        class301.field4042 = this.getParameter("settings");
        if (class301.field4042 == null) {
            class301.field4042 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class363.field5020 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class363.field5020 = 0;
            }
        }
        class96.field1393 = Integer.parseInt(this.getParameter("colourid"));
        if (class96.field1393 < 0 || class170.field2512.length <= class96.field1393) {
            class96.field1393 = 0;
        }
        class244.field3371 = this;
        this.method2032(503, 555, class395.field5539 + 32, false, 765);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1646(int arg0) {
        class83.field1221 = 0;
        field3439++;
        while (class27.method329((byte) -23) && class83.field1221 < 128) {
            if (!class239.method1587(-2613) || !(class285.field3817 == '`' || class285.field3817 == '§')) {
                class19.field377[class83.field1221] = class345.field4682;
                class266.field3574[class83.field1221] = class285.field3817;
                class83.field1221++;
            } else if (class30.method344(-710)) {
                class175.method1307((byte) 83);
            } else {
                class377.method2348(512);
            }
        }
        if (class30.method344(-710)) {
            class340.method2163(-1);
        }
        class339.field4628++;
        class130.method1010((byte) 50, -1, -1, (class139) null);
        if (arg0 < 75) {
            return;
        }
        class402.method2461(-1, -1, 127, (class139) null);
        if (class149.field2288 != -1) {
            class451.method2806(class258.field3488, class149.field2288, 0, 0, 0, 0, -106, class249.field3414);
        }
        class387.field5445++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class127 var12 = class298.field4012[var2];
            if (var12 != null) {
                byte var13 = var12.field1784.field129;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method2146(43);
                    if ((var13 & 0x2) != 0 && var12.field5009 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field5005[0] + var15;
                            int var18 = var12.field4998[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class116.field1621 - var14 - 1) {
                                var17 = class116.field1621 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (class385.field5425 - var14 - 1 < var18) {
                                var18 = class385.field5425 - var14 - 1;
                            }
                            int var19 = class162.method1213(0, var12.field5005[0], class21.field380, -1, (byte) -90, 0, var18, class235.field3247[var12.field3170], true, var14, var14, var12.field4998[0], class32.field523, var14, var17);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field5005[var20] = class32.field523[var19 - var20 - 1];
                                    var12.field4998[var20] = class21.field380[var19 - var20 - 1];
                                    var12.field5006[var20] = 1;
                                }
                                var12.field5009 = var19;
                            }
                        }
                    }
                    class200.method1413(var12, (byte) -95, true);
                    int var21 = class264.method1698(var12, 60);
                    class329.method2090(var21, false, class269.field3616, class59.field932, var12);
                    class315.method2006((byte) -106, var12);
                }
            }
        }
        if (class421.field5895 == 0 && class199.field2841 == 0) {
            if (class184.field2675 == 2) {
                class365.method2288(0);
            } else {
                class243.method1599((byte) -101);
            }
            if (class356.field4842 >> 7 < 14 || class356.field4842 >> 7 >= class116.field1621 - 14 || class374.field5261 >> 7 < 14 || class385.field5425 - 14 <= class374.field5261 >> 7) {
                class288.method1817(-1);
            }
        }
        while (true) {
            class361 var3;
            class139 var4;
            class139 var5;
            do {
                var3 = (class361) class229.field3187.method1239(true);
                if (var3 == null) {
                    while (true) {
                        class361 var6;
                        class139 var7;
                        class139 var8;
                        do {
                            var6 = (class361) class390.field5467.method1239(true);
                            if (var6 == null) {
                                while (true) {
                                    class361 var9;
                                    class139 var10;
                                    class139 var11;
                                    do {
                                        var9 = (class361) class204.field2869.method1239(true);
                                        if (var9 == null) {
                                            if (class305.field4133 != null) {
                                                class31.method347(2);
                                            }
                                            if ((class414.field5793 % 1500) == 0) {
                                                class135.method1076(2);
                                            }
                                            class307.method1978((byte) -75);
                                            if (class288.field3866 && class108.method902((byte) -93) - 60000L > class402.field5614) {
                                                class321.method2027(true);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field4903;
                                        if (var10.field2094 < 0) {
                                            break;
                                        }
                                        var11 = class10.method57(65535, var10.field2042);
                                    } while (var11 == null || var11.field2045 == null || var10.field2094 >= var11.field2045.length || var11.field2045[var10.field2094] != var10);
                                    class18.method267(var9);
                                }
                            }
                            var7 = var6.field4903;
                            if (var7.field2094 < 0) {
                                break;
                            }
                            var8 = class10.method57(65535, var7.field2042);
                        } while (var8 == null || var8.field2045 == null || var8.field2045.length <= var7.field2094 || var8.field2045[var7.field2094] != var7);
                        class18.method267(var6);
                    }
                }
                var4 = var3.field4903;
                if (var4.field2094 < 0) {
                    break;
                }
                var5 = class10.method57(65535, var4.field2042);
            } while (var5 == null || var5.field2045 == null || var5.field2045.length <= var4.field2094 || var5.field2045[var4.field2094] != var4);
            class18.method267(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method1647() {
        boolean var0 = class275.field3703 == 1 && class174.field2579 > 200 || class275.field3703 == 0 && class174.field2579 > 50;
        for (int var1 = 0; var1 < class174.field2579; var1++) {
            class338 var10 = class220.field3044[class134.field1921[var1]];
            if (var10.method2145(65)) {
                var10.method1108((byte) 99);
                if (var10.field3172 >= 0 && var10.field3161 >= 0 && var10.field3162 < class116.field1621 && var10.field3178 < class385.field5425) {
                    var10.field4586 = var10.field4982 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field4972) {
                        var11++;
                    }
                    if (var10.field4935 > class414.field5793) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method2146(54) << 2);
                    if (class38.field584 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field4923 = var12 + 1;
                } else {
                    var10.field4923 = -1;
                }
            } else {
                var10.field4923 = -1;
            }
        }
        for (int var2 = 0; var2 < class221.field3055; var2++) {
            class127 var7 = class298.field4012[class209.field2891[var2]];
            if (var7.method990(122) && var7.field1784.method74((byte) 103)) {
                var7.method1108((byte) 86);
                if (var7.field3172 >= 0 && var7.field3161 >= 0 && var7.field3162 < class116.field1621 && var7.field3178 < class385.field5425) {
                    int var8 = 0;
                    if (!var7.field4972) {
                        var8++;
                    }
                    if (var7.field4935 > class414.field5793) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method2146(124) << 2);
                    if (class38.field584 == 0) {
                        if (var7.field1784.field143) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class38.field584 == 1) {
                        if (var7.field1784.field143) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field1784.field170) {
                        var9 += 512;
                    } else if (!var7.field1784.field163) {
                        var9 += 256;
                    }
                    var7.field4923 = var9 + 1;
                } else {
                    var7.field4923 = -1;
                }
            } else {
                var7.field4923 = -1;
            }
        }
        for (int var3 = 0; var3 < class16.field186.length; var3++) {
            class192 var4 = class16.field186[var3];
            if (var4 != null) {
                if (var4.field2763 == 1) {
                    class127 var5 = class298.field4012[var4.field2755];
                    if (var5 != null && var5.field4923 >= 0) {
                        var5.field4923 += 1024;
                    }
                } else if (var4.field2763 == 10) {
                    class338 var6 = class220.field3044[var4.field2755];
                    if (var6 != null && var6.field4923 >= 0) {
                        var6.field4923 += 1024;
                    }
                }
            }
        }
        class95.field1379.field4923 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lbi;)Lnc;")
    public static final class126 method1648(class139 arg0) {
        class126 var1 = (class126) class204.field2874.method614(-89, ((long) arg0.field1968 << 32) + (long) arg0.field2094);
        return var1 == null ? arg0.field2119 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1649(byte arg0) {
        field3434++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class278.method1777((byte) 35);
        class288.field3865 = new class395(class30.field502);
        class118.field1650 = new class446();
        if (class395.field5539 != 0) {
            class42.field641 = new byte[50][];
        }
        class204.method1419(class30.field502, arg0 + 55);
        if (class445.field6400 == 0) {
            class82.field1213 = this.getCodeBase().getHost();
            class401.field5601 = 443;
            class229.field3189 = 43594;
        } else if (class445.field6400 == 1) {
            class82.field1213 = this.getCodeBase().getHost();
            class401.field5601 = class375.field5270 + 50000;
            class229.field3189 = class375.field5270 + 40000;
        } else if (class445.field6400 == 2) {
            class401.field5601 = class375.field5270 + 50000;
            class82.field1213 = "127.0.0.1";
            class229.field3189 = class375.field5270 + 40000;
        }
        class124.field1736 = class229.field3189;
        class87.field1298 = class229.field3189;
        class295.field3985 = class82.field1213;
        class416.field5816 = class401.field5601;
        class264.field3545 = class298.field4017 = class417.field5846 = class411.field5755 = new short[256];
        if (class42.field640 == 1) {
            class124.field1731 = 16777215;
            class417.field5857 = class414.field5787;
            class234.field3245 = class129.field1831;
            class190.field2737 = class386.field5433;
            class134.field1905 = class404.field5627;
            class194.field2783 = 0;
            class199.field2834 = true;
        } else {
            class190.field2737 = class438.field6278;
            class134.field1905 = class183.field2662;
            class417.field5857 = class161.field2392;
            class234.field3245 = class321.field4342;
        }
        class31.field518 = class124.field1736;
        if (class304.field4109 == 3) {
            class227.field3144 = class375.field5270;
        }
        class198.method1401(-118);
        class414.method2561((byte) 82, class418.field5867);
        class427.method2640(class418.field5867, (byte) -90);
        if (arg0 != 64) {
            field3447 = 72;
        }
        class394.field5517 = class118.method942(137);
        if (class394.field5517 != null) {
            class394.field5517.method658(class418.field5867, (byte) -52);
        }
        class148.field2274 = class304.field4109;
        try {
            if (class30.field502.field4123 != null) {
                class244.field3377 = new class7(class30.field502.field4123, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class307.field4163[var3] = new class7(class30.field502.field4119[var3], 6000, 0);
                }
                class23.field422 = new class7(class30.field502.field4114, 6000, 0);
                class10.field77 = new class377(255, class244.field3377, class23.field422, 500000);
                class315.field4275 = new class7(class30.field502.field4129, 24, 0);
                class30.field502.field4129 = null;
                class30.field502.field4114 = null;
                class30.field502.field4123 = null;
                class30.field502.field4119 = null;
            }
        } catch (IOException var4) {
            class23.field422 = null;
            class10.field77 = null;
            class315.field4275 = null;
            class244.field3377 = null;
        }
        if (class445.field6400 != 0) {
            class361.field4911 = true;
        }
        if (class42.field640 == 0) {
            class266.field3573 = class223.field3097;
        } else if (class42.field640 == 1) {
            class266.field3573 = class356.field4839;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lbi;IIIIIII)V")
    public static final void method1650(class139[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class139 var9 = arg0[var8];
            if (var9 != null && var9.field2042 == arg1) {
                int var10 = var9.field2065 + arg6;
                int var11 = var9.field2022 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2023 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2027 + var10;
                    int var17 = var9.field2011 + var11;
                    if (var9.field2023 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (!var9.field2048 || var9.field2023 == 0 || var9.field1955 || method1648(var9).field1767 != 0 || class291.field3953 == var9 || var9.field2108 == 1338) {
                    if (!var9.field2048 || !method1645(var9)) {
                        if (class305.field4133 == var9) {
                            class127.field1801 = true;
                            class413.field5778 = var10;
                            class35.field537 = var11;
                        }
                        if (!var9.field2048 || var9.field2123 || var12 < var14 && var13 < var15) {
                            if (var9.field2023 == 0) {
                                if (!var9.field2048 && method1645(var9) && class375.field5276 != var9) {
                                    continue;
                                }
                                if (var9.field2010 && class391.field5490 >= var12 && class312.field4220 >= var13 && class391.field5490 < var14 && class312.field4220 < var15) {
                                    for (class361 var18 = (class361) class204.field2869.method1240((byte) -87); var18 != null; var18 = (class361) class204.field2869.method1245(1)) {
                                        if (var18.field4902) {
                                            var18.method2367(5);
                                            var18.field4903.field2064 = false;
                                        }
                                    }
                                    if (class167.field2486 == 0) {
                                        class305.field4133 = null;
                                        class291.field3953 = null;
                                    }
                                    class177.field2611 = 0;
                                    class53.field866 = false;
                                    class187.field2712 = false;
                                    if (!class94.field1369) {
                                        class174.method1297(70);
                                    }
                                }
                            }
                            boolean var19;
                            if (class391.field5490 >= var12 && class312.field4220 >= var13 && class391.field5490 < var14 && class312.field4220 < var15) {
                                var19 = true;
                            } else {
                                var19 = false;
                            }
                            if (!class94.field1369 && var19) {
                                class305.method1970(-3, class391.field5490 - var10, var9, class312.field4220 - var11);
                            }
                            if (var9.field2048) {
                                boolean var20 = false;
                                if (class262.field3525 == 1 && var19) {
                                    var20 = true;
                                }
                                boolean var21 = false;
                                if (class52.field844 == 1 && class94.field1365 >= var12 && class177.field2609 >= var13 && class94.field1365 < var14 && class177.field2609 < var15) {
                                    var21 = true;
                                }
                                if (var9.field2120 != null) {
                                    for (int var22 = 0; var22 < var9.field2120.length; var22++) {
                                        if (class234.field3242[var9.field2120[var22]]) {
                                            if (var9.field2057 == null || class414.field5793 >= var9.field2057[var22]) {
                                                byte var23 = var9.field2009[var22];
                                                if (var23 == 0 || ((var23 & 0x8) == 0 || !class234.field3242[86] && !class234.field3242[82] && !class234.field3242[81]) && ((var23 & 0x2) == 0 || class234.field3242[86]) && ((var23 & 0x1) == 0 || class234.field3242[82]) && ((var23 & 0x4) == 0 || class234.field3242[81])) {
                                                    class153.method1176("", var9.field1968, true, -1, var22 + 1);
                                                    int var24 = var9.field2050[var22];
                                                    if (var9.field2057 == null) {
                                                        var9.field2057 = new int[var9.field2120.length];
                                                    }
                                                    if (var24 == 0) {
                                                        var9.field2057[var22] = Integer.MAX_VALUE;
                                                    } else {
                                                        var9.field2057[var22] = class414.field5793 + var24;
                                                    }
                                                }
                                            }
                                        } else if (var9.field2057 != null) {
                                            var9.field2057[var22] = 0;
                                        }
                                    }
                                }
                                if (var21) {
                                    class228.method1536(var9, class94.field1365 - var10, 0, class177.field2609 - var11);
                                }
                                if (class305.field4133 != null && class305.field4133 != var9 && var19 && method1648(var9).method979((byte) -99)) {
                                    class268.field3611 = var9;
                                }
                                if (class291.field3953 == var9) {
                                    class395.field5525 = true;
                                    class134.field1908 = var10;
                                    class88.field1307 = var11;
                                }
                                if (var9.field1955 || var9.field2108 != 0) {
                                    if (var19 && class428.field6080 != 0 && var9.field1999 != null) {
                                        class361 var25 = new class361();
                                        var25.field4902 = true;
                                        var25.field4903 = var9;
                                        var25.field4904 = class428.field6080;
                                        var25.field4905 = var9.field1999;
                                        class204.field2869.method1249(var25, (byte) -120);
                                    }
                                    if (class305.field4133 != null || class94.field1370 != null || class94.field1369 || var9.field2108 != 1400 && class177.field2611 > 0) {
                                        var21 = false;
                                        var20 = false;
                                        var19 = false;
                                    }
                                    if (var9.field2108 != 0) {
                                        if (var9.field2108 == 1337 || var9.field2108 == 1403) {
                                            class358.field4860 = var9;
                                            if (class322.field4369 != null) {
                                                class322.field4369.method1937(class249.field3415, var9.field2011, -1);
                                            }
                                            if (var9.field2108 == 1337) {
                                                if (!class94.field1369 && var19) {
                                                    class283.method1784(class249.field3415, -2);
                                                    for (class264 var26 = (class264) class287.field3848.method891(20838); var26 != null; var26 = (class264) class287.field3848.method898(64)) {
                                                        if (class391.field5490 >= var26.field3551 && class391.field5490 < var26.field3552 && class312.field4220 >= var26.field3543 && class312.field4220 < var26.field3550) {
                                                            class174.method1297(66);
                                                            class57.method536(0, var26.field3547);
                                                        }
                                                    }
                                                }
                                                class130.method1010((byte) -75, var11, var10, var9);
                                                continue;
                                            }
                                        }
                                        if (var9.field2108 == 1338) {
                                            if (var9.method1091((byte) -97, class249.field3415) == null || class24.field433 != 0 && class24.field433 != 3 || class94.field1369 || !var19) {
                                                continue;
                                            }
                                            int var27 = class391.field5490 - var10;
                                            int var28 = class312.field4220 - var11;
                                            int var29 = var9.field2049[var28];
                                            if (var27 < var29 || var27 > var9.field2053[var28] + var29) {
                                                continue;
                                            }
                                            int var30 = var27 - var9.field2027 / 2;
                                            int var31 = var28 - var9.field2011 / 2;
                                            int var32;
                                            if (class184.field2675 == 4) {
                                                var32 = (int) class313.field4229 & 0x3FFF;
                                            } else {
                                                var32 = (int) class313.field4229 + class161.field2395 & 0x3FFF;
                                            }
                                            int var33 = class174.field2572[var32];
                                            int var34 = class174.field2564[var32];
                                            if (class184.field2675 != 4) {
                                                var33 = (class398.field5576 + 256) * var33 >> 8;
                                                var34 = (class398.field5576 + 256) * var34 >> 8;
                                            }
                                            int var35 = var30 * var34 + var31 * var33 >> 15;
                                            int var36 = var31 * var34 - var30 * var33 >> 15;
                                            int var37;
                                            int var38;
                                            if (class184.field2675 == 4) {
                                                var37 = (class267.field3598 >> 7) + (var35 >> 2);
                                                var38 = (class325.field4411 >> 7) - (var36 >> 2);
                                            } else {
                                                int var39 = (class95.field1379.method2146(-121) - 1) * 64;
                                                var37 = (class95.field1379.field3176 - var39 >> 7) + (var35 >> 2);
                                                var38 = (class95.field1379.field3167 - var39 >> 7) - (var36 >> 2);
                                            }
                                            if (class3.field16 && (class280.field3750 & 0x40) != 0) {
                                                class139 var40 = class44.method411(class328.field4456, true, class418.field5864);
                                                if (var40 == null) {
                                                    class301.method1932((byte) -128);
                                                } else {
                                                    class361.method2264(var38, class163.field2409, class166.field2465, 1L, 95, " ->", 6, var37);
                                                }
                                                continue;
                                            }
                                            if (class42.field640 == 1) {
                                                class361.method2264(var38, -1, class391.field5483, 1L, 121, "", 29, var37);
                                            }
                                            class361.method2264(var38, -1, class365.field5031, 1L, -111, "", 51, var37);
                                            continue;
                                        }
                                        if (var9.field2108 == 1400) {
                                            class30.field500 = var9;
                                            if (var19) {
                                                class53.field866 = true;
                                            }
                                            if (var21) {
                                                int var41 = (int) ((double) (class94.field1365 - var10 - var9.field2027 / 2) * 2.0D / (double) class99.field1419);
                                                int var42 = (int) (-((double) (class177.field2609 - var11 - var9.field2011 / 2) * 2.0D / (double) class99.field1419));
                                                int var43 = class447.field6475 + var41 + class99.field1436;
                                                int var44 = class172.field2519 + var42 + class99.field1438;
                                                class40 var45 = class323.method2046((byte) 71);
                                                if (var45 == null) {
                                                    continue;
                                                }
                                                int[] var46 = new int[3];
                                                var45.method397(var46, var43, var44, (byte) 126);
                                                if (var46 != null) {
                                                    if (class234.field3242[82] && class447.field6482 > 0) {
                                                        class198.method1403((byte) 42, var46[0], var46[1], var46[2]);
                                                        continue;
                                                    }
                                                    class187.field2712 = true;
                                                    class210.field2922 = var46[0];
                                                    class228.field3163 = var46[1];
                                                    class286.field3829 = var46[2];
                                                }
                                                class177.field2611 = 1;
                                                class77.field1153 = false;
                                                class69.field1050 = class391.field5490;
                                                class380.field5338 = class312.field4220;
                                                continue;
                                            }
                                            if (var20 && class177.field2611 > 0) {
                                                if (class177.field2611 == 1 && (class69.field1050 != class391.field5490 || class380.field5338 != class312.field4220)) {
                                                    class36.field552 = class447.field6475;
                                                    field3450 = class172.field2519;
                                                    class177.field2611 = 2;
                                                }
                                                if (class177.field2611 == 2) {
                                                    class77.field1153 = true;
                                                    class437.method2712((byte) -83, (int) ((double) (class69.field1050 - class391.field5490) * 2.0D / (double) class99.field1420) + class36.field552);
                                                    class390.method2405(field3450 - (int) ((double) (class380.field5338 - class312.field4220) * 2.0D / (double) class99.field1420), -26014);
                                                }
                                                continue;
                                            }
                                            if (class177.field2611 > 0 && !class77.field1153) {
                                                if ((class258.field3482 == 1 || class380.method2366((byte) -61)) && class415.field5808 > 2) {
                                                    class234.method1561(2, (byte) 105);
                                                } else if (class95.method809((byte) 55)) {
                                                    class234.method1561(1, (byte) 98);
                                                }
                                            }
                                            class177.field2611 = 0;
                                            continue;
                                        }
                                        if (var9.field2108 == 1401) {
                                            if (var20) {
                                                class90.method797((byte) 89, class391.field5490 - var10, var9.field2027, var9.field2011, class312.field4220 - var11);
                                            }
                                            continue;
                                        }
                                        if (var9.field2108 == 1402) {
                                            class10.method52(var9, (byte) -89);
                                            continue;
                                        }
                                        if (var9.field2108 == 1406) {
                                            class402.method2461(var11, var10, 41, var9);
                                            continue;
                                        }
                                    }
                                    if (!var9.field2093 && var21) {
                                        var9.field2093 = true;
                                        if (var9.field1981 != null) {
                                            class361 var47 = new class361();
                                            var47.field4902 = true;
                                            var47.field4903 = var9;
                                            var47.field4901 = class94.field1365 - var10;
                                            var47.field4904 = class177.field2609 - var11;
                                            var47.field4905 = var9.field1981;
                                            class204.field2869.method1249(var47, (byte) -108);
                                        }
                                    }
                                    if (var9.field2093 && var20 && var9.field2021 != null) {
                                        class361 var48 = new class361();
                                        var48.field4902 = true;
                                        var48.field4903 = var9;
                                        var48.field4901 = class391.field5490 - var10;
                                        var48.field4904 = class312.field4220 - var11;
                                        var48.field4905 = var9.field2021;
                                        class204.field2869.method1249(var48, (byte) -100);
                                    }
                                    if (var9.field2093 && !var20) {
                                        var9.field2093 = false;
                                        if (var9.field2081 != null) {
                                            class361 var49 = new class361();
                                            var49.field4902 = true;
                                            var49.field4903 = var9;
                                            var49.field4901 = class391.field5490 - var10;
                                            var49.field4904 = class312.field4220 - var11;
                                            var49.field4905 = var9.field2081;
                                            class390.field5467.method1249(var49, (byte) -126);
                                        }
                                    }
                                    if (var20 && var9.field2041 != null) {
                                        class361 var50 = new class361();
                                        var50.field4902 = true;
                                        var50.field4903 = var9;
                                        var50.field4901 = class391.field5490 - var10;
                                        var50.field4904 = class312.field4220 - var11;
                                        var50.field4905 = var9.field2041;
                                        class204.field2869.method1249(var50, (byte) -110);
                                    }
                                    if (!var9.field2064 && var19) {
                                        var9.field2064 = true;
                                        if (var9.field2006 != null) {
                                            class361 var51 = new class361();
                                            var51.field4902 = true;
                                            var51.field4903 = var9;
                                            var51.field4901 = class391.field5490 - var10;
                                            var51.field4904 = class312.field4220 - var11;
                                            var51.field4905 = var9.field2006;
                                            class204.field2869.method1249(var51, (byte) -128);
                                        }
                                    }
                                    if (var9.field2064 && var19 && var9.field1992 != null) {
                                        class361 var52 = new class361();
                                        var52.field4902 = true;
                                        var52.field4903 = var9;
                                        var52.field4901 = class391.field5490 - var10;
                                        var52.field4904 = class312.field4220 - var11;
                                        var52.field4905 = var9.field1992;
                                        class204.field2869.method1249(var52, (byte) -118);
                                    }
                                    if (var9.field2064 && !var19) {
                                        var9.field2064 = false;
                                        if (var9.field2038 != null) {
                                            class361 var53 = new class361();
                                            var53.field4902 = true;
                                            var53.field4903 = var9;
                                            var53.field4901 = class391.field5490 - var10;
                                            var53.field4904 = class312.field4220 - var11;
                                            var53.field4905 = var9.field2038;
                                            class390.field5467.method1249(var53, (byte) -120);
                                        }
                                    }
                                    if (var9.field2040 != null) {
                                        class361 var54 = new class361();
                                        var54.field4903 = var9;
                                        var54.field4905 = var9.field2040;
                                        class229.field3187.method1249(var54, (byte) -124);
                                    }
                                    if (var9.field1973 != null && class340.field4645 > var9.field2132) {
                                        if (var9.field2097 == null || class340.field4645 - var9.field2132 > 32) {
                                            class361 var59 = new class361();
                                            var59.field4903 = var9;
                                            var59.field4905 = var9.field1973;
                                            class204.field2869.method1249(var59, (byte) -104);
                                        } else {
                                            label688: for (int var55 = var9.field2132; var55 < class340.field4645; var55++) {
                                                int var56 = class151.field2322[var55 & 0x1F];
                                                for (int var57 = 0; var57 < var9.field2097.length; var57++) {
                                                    if (var9.field2097[var57] == var56) {
                                                        class361 var58 = new class361();
                                                        var58.field4903 = var9;
                                                        var58.field4905 = var9.field1973;
                                                        class204.field2869.method1249(var58, (byte) -127);
                                                        break label688;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field2132 = class340.field4645;
                                    }
                                    if (var9.field2087 != null && class296.field3997 > var9.field2109) {
                                        if (var9.field2134 == null || class296.field3997 - var9.field2109 > 32) {
                                            class361 var64 = new class361();
                                            var64.field4903 = var9;
                                            var64.field4905 = var9.field2087;
                                            class204.field2869.method1249(var64, (byte) -105);
                                        } else {
                                            label668: for (int var60 = var9.field2109; var60 < class296.field3997; var60++) {
                                                int var61 = class183.field2658[var60 & 0x1F];
                                                for (int var62 = 0; var62 < var9.field2134.length; var62++) {
                                                    if (var9.field2134[var62] == var61) {
                                                        class361 var63 = new class361();
                                                        var63.field4903 = var9;
                                                        var63.field4905 = var9.field2087;
                                                        class204.field2869.method1249(var63, (byte) -127);
                                                        break label668;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field2109 = class296.field3997;
                                    }
                                    if (var9.field2107 != null && class386.field5438 > var9.field2129) {
                                        if (var9.field2028 == null || class386.field5438 - var9.field2129 > 32) {
                                            class361 var69 = new class361();
                                            var69.field4903 = var9;
                                            var69.field4905 = var9.field2107;
                                            class204.field2869.method1249(var69, (byte) -128);
                                        } else {
                                            label648: for (int var65 = var9.field2129; var65 < class386.field5438; var65++) {
                                                int var66 = class384.field5389[var65 & 0x1F];
                                                for (int var67 = 0; var67 < var9.field2028.length; var67++) {
                                                    if (var9.field2028[var67] == var66) {
                                                        class361 var68 = new class361();
                                                        var68.field4903 = var9;
                                                        var68.field4905 = var9.field2107;
                                                        class204.field2869.method1249(var68, (byte) -115);
                                                        break label648;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field2129 = class386.field5438;
                                    }
                                    if (var9.field2088 != null && class443.field6387 > var9.field1958) {
                                        if (var9.field2019 == null || class443.field6387 - var9.field1958 > 32) {
                                            class361 var74 = new class361();
                                            var74.field4903 = var9;
                                            var74.field4905 = var9.field2088;
                                            class204.field2869.method1249(var74, (byte) -122);
                                        } else {
                                            label628: for (int var70 = var9.field1958; var70 < class443.field6387; var70++) {
                                                int var71 = class445.field6401[var70 & 0x1F];
                                                for (int var72 = 0; var72 < var9.field2019.length; var72++) {
                                                    if (var9.field2019[var72] == var71) {
                                                        class361 var73 = new class361();
                                                        var73.field4903 = var9;
                                                        var73.field4905 = var9.field2088;
                                                        class204.field2869.method1249(var73, (byte) -100);
                                                        break label628;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field1958 = class443.field6387;
                                    }
                                    if (var9.field2121 != null && class115.field1616 > var9.field2125) {
                                        if (var9.field2046 == null || class115.field1616 - var9.field2125 > 32) {
                                            class361 var79 = new class361();
                                            var79.field4903 = var9;
                                            var79.field4905 = var9.field2121;
                                            class204.field2869.method1249(var79, (byte) -108);
                                        } else {
                                            label608: for (int var75 = var9.field2125; var75 < class115.field1616; var75++) {
                                                int var76 = class295.field3978[var75 & 0x1F];
                                                for (int var77 = 0; var77 < var9.field2046.length; var77++) {
                                                    if (var9.field2046[var77] == var76) {
                                                        class361 var78 = new class361();
                                                        var78.field4903 = var9;
                                                        var78.field4905 = var9.field2121;
                                                        class204.field2869.method1249(var78, (byte) -125);
                                                        break label608;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field2125 = class115.field1616;
                                    }
                                    if (class122.field1720 > var9.field2135 && var9.field2118 != null) {
                                        class361 var80 = new class361();
                                        var80.field4903 = var9;
                                        var80.field4905 = var9.field2118;
                                        class204.field2869.method1249(var80, (byte) -118);
                                    }
                                    if (class165.field2431 > var9.field2135 && var9.field2082 != null) {
                                        class361 var81 = new class361();
                                        var81.field4903 = var9;
                                        var81.field4905 = var9.field2082;
                                        class204.field2869.method1249(var81, (byte) -117);
                                    }
                                    if (class375.field5277 > var9.field2135 && var9.field1996 != null) {
                                        class361 var82 = new class361();
                                        var82.field4903 = var9;
                                        var82.field4905 = var9.field1996;
                                        class204.field2869.method1249(var82, (byte) -108);
                                    }
                                    if (class298.field4016 > var9.field2135 && var9.field1970 != null) {
                                        class361 var83 = new class361();
                                        var83.field4903 = var9;
                                        var83.field4905 = var9.field1970;
                                        class204.field2869.method1249(var83, (byte) -105);
                                    }
                                    if (class440.field6327 > var9.field2135 && var9.field2077 != null) {
                                        class361 var84 = new class361();
                                        var84.field4903 = var9;
                                        var84.field4905 = var9.field2077;
                                        class204.field2869.method1249(var84, (byte) -101);
                                    }
                                    var9.field2135 = class387.field5445;
                                    if (var9.field1975 != null) {
                                        for (int var85 = 0; var85 < class83.field1221; var85++) {
                                            class361 var86 = new class361();
                                            var86.field4903 = var9;
                                            var86.field4913 = class19.field377[var85];
                                            var86.field4900 = class266.field3574[var85];
                                            var86.field4905 = var9.field1975;
                                            class204.field2869.method1249(var86, (byte) -111);
                                        }
                                    }
                                    if (class107.field1573 && var9.field2039 != null) {
                                        class361 var87 = new class361();
                                        var87.field4903 = var9;
                                        var87.field4905 = var9.field2039;
                                        class204.field2869.method1249(var87, (byte) -123);
                                    }
                                }
                                if (var9.field2023 == 5 && var9.field1977 != -1) {
                                    var9.method1099(false).method1937(class249.field3415, var9.field2011, -1);
                                }
                            }
                            if (!var9.field2048 && class305.field4133 == null && class94.field1370 == null && !class94.field1369) {
                                if ((var9.field1978 >= 0 || var9.field1986 != 0) && class391.field5490 >= var12 && class312.field4220 >= var13 && class391.field5490 < var14 && class312.field4220 < var15) {
                                    if (var9.field1978 >= 0) {
                                        class375.field5276 = arg0[var9.field1978];
                                    } else {
                                        class375.field5276 = var9;
                                    }
                                }
                                if (var9.field2023 == 8 && class391.field5490 >= var12 && class312.field4220 >= var13 && class391.field5490 < var14 && class312.field4220 < var15) {
                                    class192.field2764 = var9;
                                }
                                if (var9.field2086 > var9.field2011) {
                                    class445.method2756(class391.field5490, 16, var11, var9.field2027 + var10, var9, class312.field4220, var9.field2086, var9.field2011);
                                }
                            }
                            class395.method2433(var9, arg2, arg4, var10, arg5, -21, var11, arg3);
                            if (var9.field2023 == 0) {
                                method1650(arg0, var9.field1968, var12, var13, var14, var15, var10 - var9.field2055, var11 - var9.field1983);
                                if (var9.field2045 != null) {
                                    method1650(var9.field2045, var9.field1968, var12, var13, var14, var15, var10 - var9.field2055, var11 - var9.field1983);
                                }
                                class64 var88 = (class64) class204.field2865.method614(-103, (long) var9.field1968);
                                if (var88 != null) {
                                    if (var88.field973 == 0 && !class94.field1369 && var19 && !class339.field4624) {
                                        class174.method1297(120);
                                    }
                                    class451.method2806(var15, var88.field976, var12, var13, var10, var11, -122, var14);
                                }
                            }
                        }
                    }
                } else if (var12 < var14 && var13 < var15) {
                    class395.method2433(var9, arg2, arg4, var10, arg5, -21, var11, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1651(int arg0) {
        field3443++;
        if (class288.field3866) {
            class321.method2027(true);
        }
        if (class249.field3415 != null) {
            class249.field3415.method2406(-125);
        }
        if (class416.field5820 != null) {
            class35.method358(class30.field502, class416.field5820, 0);
            class416.field5820 = null;
        }
        if (class199.field2838 != null) {
            class199.field2838.field3989 = false;
        }
        class199.field2838 = null;
        if (class105.field1540 != null) {
            class105.field1540.method2736(5000);
            class105.field1540 = null;
        }
        class14.method68((byte) -74, class418.field5867);
        class60.method543(3, class418.field5867);
        if (arg0 < 45) {
            return;
        }
        if (class394.field5517 != null) {
            class394.field5517.method666(30, class418.field5867);
        }
        class83.method754((byte) -103);
        class386.method2391(-102);
        class394.field5517 = null;
        if (class76.field1136 != null) {
            class76.field1136.method1558(0);
        }
        if (class365.field5037 != null) {
            class365.field5037.method1558(0);
        }
        class118.field1650.method2759(123);
        class288.field3865.method2428(71);
        if (class293.field3959 != null) {
            class293.field3959.method2711(0);
            class293.field3959 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method1652() {
        for (int var0 = 0; var0 < class116.field1621; var0++) {
            int[] var1 = class183.field2660[var0];
            for (int var2 = 0; var2 < class385.field5425; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static final void method1653(byte arg0) {
        field3436++;
        class156.field2361.method2539(arg0 + 27);
        if (arg0 != 36) {
            method1641((class139) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1654(byte arg0) {
        method1659(50000);
        field3432++;
        class150.method1145(true);
        class162.method1211(6767);
        class321.method2030((byte) -78);
        class244.method1602((byte) -128);
        class156.method1193(-1);
        class391.method2409(77);
        class296.method1905((byte) 58);
        class192.method1380(123);
        class441.method2739(false);
        class446.method2769(true);
        class395.method2431(-100);
        class174.method1294(false);
        class427.method2644(0);
        class7.method46(85);
        class377.method2356(-19014);
        class410.method2538(-31892);
        class127.method997(true);
        class286.method1804(false);
        class151.method1157(8);
        class75.method650(0);
        class303.method1935(-9020);
        class107.method893(16658);
        class385.method2388(116);
        class338.method2151(-124);
        class71.method609(-22758);
        class166.method1253(1);
        class77.method661((byte) 101);
        class220.method1497(-38);
        class89.method785(64);
        class407.method2499((byte) -38);
        class234.method1560(false);
        class316.method2012(127);
        class24.method298((byte) -17);
        class209.method1441((byte) -113);
        class362.method2276((byte) 57);
        class224.method1528(-11390);
        class128.method1001(-123);
        class64.method564((byte) 125);
        class126.method982(-14495);
        class179.method1325(21488);
        class323.method2051(97);
        class84.method763(22128);
        class73.method634(9725);
        class411.method2545(-91);
        class374.method2339(-113);
        class269.method1725((byte) 88);
        class293.method1893((byte) 125);
        class368.method2296((byte) 91);
        class381.method2369((byte) 45);
        class355.method2236(-108);
        class90.method798((byte) 107);
        class27.method330(false);
        class61.method547(3);
        class291.method1886(116);
        class32.method350((byte) -59);
        class161.method1209(2107909889);
        class278.method1774((byte) 4);
        class440.method2731(false);
        class42.method404((byte) 109);
        class372.method2320(1);
        class96.method816((byte) 60);
        class356.method2247(0);
        class265.method1705(true);
        class15.method83(true);
        class452.method2820(true);
        class344.method2179(17376);
        class118.method947(8);
        class243.method1598(false);
        class328.method2085(true);
        class53.method505(true);
        class10.method54(8);
        class229.method1540(-2139360062);
        class420.method2592(-811);
        class52.method501((byte) 68);
        class392.method2420(1584852583);
        class445.method2753(1);
        class8.method50(10733);
        class402.method2460(-128);
        class335.method2119(2);
        class187.method1355(-103);
        class87.method779(-46);
        class235.method1573((byte) -97);
        class236.method1574(-11706);
        class403.method2468();
        class267.method1717(-112);
        class148.method1138(-1);
        class12.method61(32);
        class105.method886((byte) 110);
        class191.method1377((byte) 107);
        class115.method927(30209);
        class233.method1550((byte) 63);
        class18.method266();
        class99.method842();
        class258.method1676((byte) 19);
        class430.method2676(5);
        class216.method1477();
        class204.method1417(-1);
        class384.method2384(-12);
        class95.method811(false);
        class283.method1788(4);
        class35.method356((byte) 127);
        class122.method961((byte) -15);
        class132.method1037(-1);
        class255.method1665(3);
        class287.method1811(78);
        class295.method1896((byte) -110);
        class36.method365(-112);
        class101.method861(255);
        class336.method2132((byte) -32);
        class155.method1190((byte) -123);
        class408.method2530(-6206);
        class404.method2479(0);
        class434.method2690(7);
        class282.method1783(92);
        class167.method1260((byte) 113);
        class170.method1276((byte) 64);
        class55.method517(5);
        class102.method870(506);
        class399.method2449(127);
        class39.method386(-127);
        class190.method1369((byte) -23);
        class397.method2439(-73);
        class414.method2566(934);
        class121.method956(-3939);
        class38.method374(-123);
        class378.method2360(2);
        class305.method1972((byte) 123);
        if (arg0 >= -2) {
            method1638();
        }
        class199.method1406(118);
        class186.method1351(77);
        class13.method62((byte) -72);
        class367.method2293(-7955);
        class273.method1743(-127);
        class124.method968(4);
        class300.method1926();
        class260.method1679(false);
        class451.method2805(108);
        class49.method495(true);
        class361.method2267((byte) 112);
        class213.method1454((byte) -76);
        class228.method1537(-29075);
        class184.method1346((byte) -82);
        class415.method2569((byte) 115);
        class322.method2040(true);
        class48.method488();
        class221.method1499(0);
        class76.method657((byte) -33);
        class21.method276((byte) -123);
        class44.method413(2);
        class241.method1595(-1);
        class339.method2154(-16890);
        class57.method529((byte) -90);
        class26.method321(2);
        class390.method2404(117);
        class325.method2069((byte) 122);
        class88.method782((byte) -92);
        class433.method2684(false);
        class329.method2087(32561);
        class341.method2166((byte) 86);
        class345.method2185(0);
        class60.method545(79);
        class450.method2804(71);
        class417.method2582(true);
        class370.method2307((byte) 124);
        class275.method1763((byte) 48);
        class189.method1361((byte) 100);
        class358.method2249(false);
        class307.method1977(0);
        class308.method1982();
        class149.method1143(0);
        class332.method2111(-89);
        class264.method1703(-84);
        class144.method1110(9);
        class438.method2720((byte) -128);
        class125.method975(30370);
        class164.method1224((byte) -98);
        class401.method2457(0);
        class396.method2437(true);
        class352.method2229(1024);
        class134.method1071((byte) 111);
        class447.method2775(-1);
        class375.method2343(-21594);
        class66.method584(false);
        class423.method2604((byte) 120);
        class416.method2575(false);
        class215.method1470((byte) 104);
        class120.method951();
        class227.method1530(-1);
        class276.method1769((byte) 121);
        class160.method1203(-117);
        class37.method371(54);
        class263.method1692(false);
        class91.method801(7);
        class284.method1792((byte) 111);
        class298.method1914(-25144);
        class388.method2399(0);
        class114.method923(false);
        class72.method619();
        class424.method2606(9463);
        class172.method1282((byte) 93);
        class285.method1795(58);
        class301.method1928((byte) -97);
        class360.method2262((byte) 115);
        class22.method283(-15645);
        class198.method1399(116);
        class449.method2796();
        class347.method2190();
        class262.method1684(112);
        class422.method2600(20236);
        class393.method2422((byte) 113);
        class435.method2699(-103);
        class418.method2586(-108);
        class448.method2793(true);
        class193.method1384(64);
        class23.method290(true);
        class28.method332(-1);
        class297.method1911(64);
        class146.method1127();
        class182.method1337();
        class130.method1008(2);
        class82.method745(28392);
        class217.method1483();
        class30.method343((byte) -16);
        class145.method1122(-1);
        class421.method2594(-57);
        class365.method2289(-5733);
        class412.method2552((byte) -50);
        class443.method2749(2);
        class6.method35(45);
        class426.method2623((byte) -77);
        class383.method2376((byte) 5);
        class100.method857(3);
        class249.method1619(0);
        class131.method1017(30);
        class210.method1448(-105);
        class237.method1584((byte) 119);
        class185.method1349(-18);
        class163.method1215((byte) -43);
        class29.method339(false);
        class218.method1493(768);
        class173.method1291((byte) 110);
        class314.method2000((byte) -103);
        class326.method2078(-16);
        class386.method2392((byte) -103);
        class43.method407(-104);
        class138.method1083(1);
        class212.method1449(0);
        class312.method1993(1);
        class334.method2113((byte) 42);
        class348.method2198(0);
        class400.method2455((byte) 97);
        class1.method6((byte) 32);
        class31.method346(114417036);
        class428.method2663((byte) 111);
        class257.method1671(0);
        class387.method2394(true);
        class113.method922(-31);
        class394.method2424(-114);
        class14.method71((byte) 104);
        class97.method819(-31201);
        class78.method668((byte) -49);
        class69.method598(-1500814036);
        class147.method1135(0);
        class331.method2107(false);
        class442.method2744((byte) 21);
        class180.method1328(4);
        class183.method1341(19185);
        class268.method1724(0);
        class16.method86(-31489);
        class165.method1229((byte) 97);
        class340.method2158(true);
        class109.method903(1604);
        class382.method2371(127);
        class81.method741(-1);
        class266.method1710(false);
        class154.method1181(true);
        class288.method1818(128);
        class46.method421();
        class405.method2481();
        class373.method2333(0);
        class259.method1677(-91);
        class431.method2678((byte) -113);
        class290.method1885((byte) 117);
        class135.method1075(false);
        class380.method2364(-2);
        class177.method1320(-1);
        class419.method2587(0);
        class19.method270((byte) 105);
        class5.method29((byte) 2);
        class3.method11(-110);
        class94.method808(true);
        class359.method2254((byte) -106);
        class200.method1412(40);
        class129.method1006(0);
        class63.method560((byte) 26);
        class153.method1180(-5795);
        class315.method2007(false);
        class256.method1667(80);
        class194.method1391((byte) 20);
        class277.method1773(25518);
        class223.method1521((byte) 92);
        class68.method590((byte) 53);
        class398.method2448(102);
        if (class321.field4356) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1655(byte arg0) {
        if (arg0 >= -18) {
            field3447 = -1;
        }
        field3437++;
        if (!class27.field476) {
            label226: while (true) {
                do {
                    if (!class27.method329((byte) -23)) {
                        break label226;
                    }
                } while (class285.field3817 != 's' && class285.field3817 != 'S');
                class27.field476 = true;
            }
        }
        if (class57.field911 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class108.method902((byte) -93);
            if (class368.field5047 == 0L) {
                class368.field5047 = var4;
            }
            if (var3 > 16384 && (var4 - class368.field5047) < 5000L) {
                if (var4 - class363.field5017 > 1000L) {
                    System.gc();
                    class363.field5017 = var4;
                }
                class312.field4217 = 5;
                class267.field3599 = class263.field3538;
            } else {
                class267.field3599 = class301.field4048;
                class57.field911 = 10;
                class312.field4217 = 5;
            }
        } else if (class57.field911 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class235.field3247[var6] = class27.method326(class385.field5425, 17389, class116.field1621);
            }
            class57.field911 = 20;
            class267.field3599 = class97.field1404;
            class312.field4217 = 10;
        } else if (class57.field911 == 20) {
            if (class218.field3032 == null) {
                class218.field3032 = new class174(class118.field1650, class288.field3865);
            }
            if (class218.field3032.method1296(8840)) {
                class105.field1544 = class27.method324(true, 0, false, 4, 1);
                class244.field3372 = class27.method324(true, 1, false, 4, 1);
                class396.field5548 = class27.method324(true, 2, false, 4, 1);
                class325.field4412 = class27.method324(true, 3, false, 4, 1);
                class332.field4515 = class27.method324(true, 4, false, 4, 1);
                class23.field417 = class27.method324(true, 5, true, 4, 1);
                class138.field1943 = class27.method324(false, 6, true, 4, 1);
                class204.field2875 = class27.method324(true, 7, false, 4, 1);
                class187.field2705 = class27.method324(true, 8, false, 4, 1);
                class266.field3568 = class27.method324(true, 9, false, 4, 1);
                class185.field2690 = class27.method324(true, 10, false, 4, 1);
                class227.field3137 = class27.method324(true, 11, false, 4, 1);
                class297.field4006 = class27.method324(true, 12, false, 4, 1);
                class49.field829 = class27.method324(true, 13, false, 4, 1);
                class166.field2467 = class27.method324(false, 14, false, 4, 1);
                class312.field4216 = class27.method324(true, 15, false, 4, 1);
                class43.field651 = class27.method324(true, 16, false, 4, 1);
                class209.field2904 = class27.method324(true, 17, false, 4, 1);
                class13.field102 = class27.method324(true, 18, false, 4, 1);
                class332.field4514 = class27.method324(true, 19, false, 4, 1);
                class417.field5833 = class27.method324(true, 20, false, 4, 1);
                class12.field92 = class27.method324(true, 21, false, 4, 1);
                class154.field2342 = class27.method324(true, 22, false, 4, 1);
                class23.field420 = class27.method324(true, 23, true, 4, 1);
                class312.field4222 = class27.method324(true, 24, false, 4, 1);
                class5.field40 = class27.method324(true, 25, false, 4, 1);
                class273.field3667 = class27.method324(true, 26, true, 4, 1);
                class446.field6405 = class27.method324(true, 27, false, 4, 1);
                class183.field2669 = class27.method324(true, 28, true, 4, 1);
                class57.field911 = 30;
                class312.field4217 = 15;
                class267.field3599 = class165.field2444;
            } else {
                class312.field4217 = 12;
                class267.field3599 = class284.field3806;
            }
        } else if (class57.field911 == 30) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class418.field5863[var8].method2705(0) * class325.field4413[var8] / 100;
            }
            if (var7 == 100) {
                class267.field3599 = class243.field3354;
                class312.field4217 = 20;
                class64.method568(class187.field2705, -113);
                class87.method781(class187.field2705, -1);
                class57.field911 = 40;
            } else {
                if (var7 != 0) {
                    class267.field3599 = class213.field2949 + var7 + "%";
                }
                class312.field4217 = 20;
            }
        } else if (class57.field911 == 40) {
            if (class183.field2669.method2648((byte) 127)) {
                this.method1658(class183.field2669.method2656(100, 1), (byte) 41);
                class312.field4217 = 25;
                class57.field911 = 50;
                class267.field3599 = class97.field1399;
            } else {
                class267.field3599 = class441.field6339 + class183.field2669.method2655(false) + "%";
                class312.field4217 = 25;
            }
        } else if (class57.field911 == 50) {
            class124.method971(2, -124, class177.field2610, 22050);
            class105.field1550 = new class407();
            class105.field1550.method2496((byte) 118, 9, 128);
            class76.field1136 = class121.method954(0, (byte) -48, class418.field5867, class30.field502, 22050);
            class76.field1136.method1562(class105.field1550, -1);
            class378.method2357(class332.field4515, 1, class105.field1550, class312.field4216, class166.field2467);
            class365.field5037 = class121.method954(1, (byte) -57, class418.field5867, class30.field502, 2048);
            class315.field4277 = new class207();
            class365.field5037.method1562(class315.field4277, -1);
            class450.field6505 = new class316(22050, class413.field5774);
            class118.field1644 = class138.field1943.method2643("scape main", -1);
            class267.field3599 = class293.field3963;
            class57.field911 = 60;
            class312.field4217 = 30;
        } else if (class57.field911 == 60) {
            int var9 = class154.method1182(class49.field829, class187.field2705, 0);
            int var10 = class172.method1281((byte) 4);
            if (var9 < var10) {
                class312.field4217 = 35;
                class267.field3599 = class126.field1763 + var9 * 100 / var10 + "%";
            } else {
                class57.field911 = 70;
                class267.field3599 = class293.field3964;
                class312.field4217 = 35;
            }
        } else if (class57.field911 == 70) {
            int var11 = class363.method2287(class187.field2705, 0);
            int var12 = class26.method322(22935);
            if (var11 < var12) {
                class312.field4217 = 40;
                class267.field3599 = class412.field5761 + var11 * 100 / var12 + "%";
            } else {
                class312.field4217 = 40;
                class267.field3599 = class186.field2698;
                class57.field911 = 80;
            }
        } else if (class57.field911 == 80) {
            if (class273.field3667.method2648((byte) 124)) {
                class356.field4840 = new class283(class273.field3667, class266.field3568, class187.field2705);
                class267.field3599 = class128.field1825;
                class57.field911 = 90;
                class312.field4217 = 45;
            } else {
                class267.field3599 = class184.field2679 + class273.field3667.method2655(false) + "%";
                class312.field4217 = 45;
            }
        } else if (class57.field911 == 90) {
            class57.field911 = 95;
            class312.field4217 = 50;
            class267.field3599 = class24.field426;
        } else if (class57.field911 == 95) {
            if (class27.field476) {
                class31.field514 = 0;
                class32.field527 = 0;
                class447.field6440 = 0;
                class41.field630 = 0;
                class102.field1513 = 1;
            }
            class27.field476 = true;
            class447.method2786((byte) 64, class30.field502);
            class122.method960(-12581);
            class60.method544(false, -125, class447.field6440);
            class312.field4217 = 55;
            class267.field3599 = class155.field2355;
            class57.field911 = 100;
        } else if (class57.field911 == 100) {
            class272.method1740(-121, class49.field829, class249.field3415, class187.field2705);
            class267.field3599 = class423.field5921;
            class312.field4217 = 60;
            class29.method340(5, (byte) -58);
            class57.field911 = 110;
        } else if (class57.field911 == 110) {
            byte var13 = 0;
            class396.field5548.method2648((byte) 117);
            int var14 = var13 + class396.field5548.method2655(false);
            class43.field651.method2648((byte) 107);
            int var15 = var14 + class43.field651.method2655(false);
            class209.field2904.method2648((byte) 119);
            int var16 = var15 + class209.field2904.method2655(false);
            class13.field102.method2648((byte) 114);
            int var17 = var16 + class13.field102.method2655(false);
            class332.field4514.method2648((byte) 104);
            int var18 = var17 + class332.field4514.method2655(false);
            class417.field5833.method2648((byte) 116);
            int var19 = var18 + class417.field5833.method2655(false);
            class12.field92.method2648((byte) 113);
            int var20 = var19 + class12.field92.method2655(false);
            class154.field2342.method2648((byte) 119);
            int var21 = var20 + class154.field2342.method2655(false);
            class312.field4222.method2648((byte) 105);
            int var22 = var21 + class312.field4222.method2655(false);
            class5.field40.method2648((byte) 123);
            int var23 = var22 + class5.field40.method2655(false);
            class446.field6405.method2648((byte) 106);
            int var24 = var23 + class446.field6405.method2655(false);
            if (var24 < 1100) {
                class312.field4217 = 65;
                class267.field3599 = class295.field3986 + var24 / 11 + "%";
            } else {
                class265.method1708(class396.field5548, 32);
                class29.method334(class396.field5548, (byte) -40);
                class170.method1279(class396.field5548, 4);
                class64.method563(class204.field2875, class396.field5548, (byte) 127);
                class392.method2418((byte) -65, class204.field2875, class43.field651, true);
                class378.method2362(true, class204.field2875, class13.field102, true);
                class83.method753(class204.field2875, (byte) -38, class332.field4514, true);
                class39.method388(class396.field5548, 0);
                class321.method2038(class105.field1544, -124, class417.field5833, class244.field3372);
                class441.method2735(class396.field5548, -16825);
                class187.method1356(class12.field92, class204.field2875, (byte) 116);
                class77.method664(class154.field2342, 30);
                class165.method1226(class396.field5548, 16);
                class452.method2813(class187.field2705, class325.field4412, -117, class49.field829, class204.field2875);
                class255.method1663(class396.field5548, 1398447724);
                class367.method2291(29, class209.field2904);
                class14.method69(class5.field40, 1, new class399(), class312.field4222);
                class421.method2595(0, class312.field4222, class5.field40);
                class19.method268((byte) -86, class396.field5548);
                class135.method1077(class396.field5548, (byte) 72);
                class97.method820(class396.field5548, 52);
                class63.method561(112, class396.field5548, class187.field2705);
                class83.method748(class396.field5548, class187.field2705, (byte) 119);
                class138.method1085(class396.field5548, 29029);
                class38.method375(class396.field5548, class187.field2705, (byte) 66);
                class227.method1532(class396.field5548, (byte) -108);
                class256.method1668((byte) -128, class396.field5548);
                class267.field3599 = class134.field1907;
                class312.field4217 = 65;
                class273.method1744(5554);
                class57.field911 = 120;
            }
        } else if (class57.field911 == 120) {
            int var25 = class167.method1258(0, class187.field2705);
            int var26 = class41.method399(false);
            if (var26 > var25) {
                class312.field4217 = 70;
                class267.field3599 = class410.field5731 + var25 * 100 / var26 + "%";
            } else {
                class15.method77(class187.field2705, class249.field3415, 4702);
                class298.method1916(0, class233.field3208);
                class267.field3599 = class387.field5447;
                class312.field4217 = 70;
                class57.field911 = 130;
            }
        } else if (class57.field911 == 130) {
            class199.field2838 = new class296();
            class30.field502.method1950(83, 10, class199.field2838);
            class312.field4217 = 75;
            class267.field3599 = class421.field5900;
            class57.field911 = 140;
        } else if (class57.field911 == 140) {
            if (class185.field2690.method2651("", -23157, "huffman")) {
                class13 var27 = new class13(class185.field2690.method2637("huffman", "", (byte) -112));
                class121.method952(var27, 0);
                class312.field4217 = 80;
                class267.field3599 = class381.field5342;
                class57.field911 = 150;
            } else {
                class312.field4217 = 80;
                class267.field3599 = class386.field5441 + "0%";
            }
        } else if (class57.field911 == 150) {
            if (!class325.field4412.method2648((byte) 104)) {
                class267.field3599 = class68.field1025 + class325.field4412.method2655(false) * 3 / 4 + "%";
                class312.field4217 = 85;
            } else if (!class297.field4006.method2648((byte) 110)) {
                class267.field3599 = class68.field1025 + (class297.field4006.method2655(false) / 10 + 75) + "%";
                class312.field4217 = 85;
            } else if (!class49.field829.method2648((byte) 125)) {
                class267.field3599 = class68.field1025 + (class49.field829.method2655(false) / 20 + 85) + "%";
                class312.field4217 = 85;
            } else if (class23.field420.method2632("details", (byte) 84)) {
                class99.method832(class23.field420);
                class53.method506(class446.field6405, -22825);
                class267.method1722(class204.field2875, -104, class356.field4840);
                class267.field3599 = class71.field1073;
                class312.field4217 = 85;
                class57.field911 = 160;
            } else {
                class267.field3599 = class68.field1025 + (class23.field420.method2627((byte) -108, "details") / 10 + 90) + "%";
                class312.field4217 = 85;
            }
        } else if (class57.field911 == 160) {
            int var28 = class420.method2593(25);
            if (var28 == -1) {
                class312.field4217 = 90;
                class267.field3599 = class290.field3943;
            } else if (var28 == 7 || var28 == 9) {
                this.method2039("worldlistfull", 5);
                class29.method340(1000, (byte) -58);
            } else if (class132.field1875) {
                class312.field4217 = 90;
                class57.field911 = 170;
                class267.field3599 = class128.field1817;
            } else {
                this.method2039("worldlistio_" + var28, 5);
                class29.method340(1000, (byte) -58);
            }
        } else if (class57.field911 == 170) {
            class334.field4526 = new String[class63.field968];
            class331.field4511 = new int[class155.field2358];
            class257.field3475 = new boolean[class155.field2358];
            for (int var29 = 0; var29 < class155.field2358; var29++) {
                if (class131.method1024(false, var29).field4138 == 0) {
                    class257.field3475[var29] = true;
                    class122.field1717++;
                }
                class331.field4511[var29] = -1;
            }
            class113.method920((byte) -16);
            class427.field6050 = class325.field4412.method2643("loginscreen", -1);
            class23.field417.method2646(false, false, true);
            class138.field1943.method2646(false, true, true);
            class187.field2705.method2646(false, true, true);
            class49.field829.method2646(false, true, true);
            class185.field2690.method2646(false, true, true);
            class325.field4412.method2646(false, true, true);
            class236.field3281 = true;
            class396.field5548.field6055 = 2;
            class209.field2904.field6055 = 2;
            class43.field651.field6055 = 2;
            class13.field102.field6055 = 2;
            class332.field4514.field6055 = 2;
            class417.field5833.field6055 = 2;
            class12.field92.field6055 = 2;
            class81.method743((byte) -114, false, -1, class102.field1513, -1);
            class267.field3599 = class361.field4909;
            class312.field4217 = 95;
            class57.field911 = 180;
        } else if (class57.field911 == 180) {
            class411.method2546(true, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1656(int arg0) {
        field3445++;
        if (class166.field2472 == 1000) {
            return;
        }
        class414.field5793++;
        if ((class414.field5793 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class243.field3360 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class255.field3452.setSeed((long) class243.field3360);
        }
        this.method1643((byte) -128);
        if (class218.field3032 != null) {
            class218.field3032.method1295((byte) -42);
        }
        if (arg0 != -31) {
            method1639();
        }
        class341.method2169(arg0 + 31);
        class127.method996(-45);
        class325.method2070((byte) -85);
        class335.method2120(128);
        if (class249.field3415 != null) {
            class249.field3415.method248((int) class108.method902((byte) -93));
        }
        if (class394.field5517 != null) {
            int var3 = class394.field5517.method660((byte) -64);
            class428.field6080 = var3;
        }
        class377.method2351(-3);
        if (class166.field2472 == 0) {
            this.method1655((byte) -62);
            class224.method1526(-95);
        } else if (class166.field2472 == 5) {
            this.method1655((byte) -41);
            class224.method1526(-117);
        } else if (class166.field2472 == 25 || class166.field2472 == 28) {
            class78.method669((byte) -56);
        }
        if (class166.field2472 == 10) {
            this.method1646(120);
            class440.method2729(101);
            class435.method2696(arg0 ^ 0xFFFFFFE0);
            class132.method1029(true);
        } else if (class166.field2472 == 30) {
            class121.method955(-113);
        } else if (class166.field2472 == 40) {
            class132.method1029(true);
            if (class368.field5051 != -3) {
                if (class368.field5051 == 15) {
                    class332.method2112(-1);
                } else if (class368.field5051 != 2) {
                    class239.method1589(73);
                }
            }
        }
        class1.method5(class249.field3415, arg0 - 9087);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3433++;
        try {
            if (arg0.length != 4) {
                class428.method2659((byte) -57, "argument count");
            }
            class375.field5270 = Integer.parseInt(arg0[0]);
            class445.field6400 = 2;
            if (arg0[1].equals("live")) {
                class395.field5539 = 0;
            } else if (arg0[1].equals("rc")) {
                class395.field5539 = 1;
            } else if (arg0[1].equals("wip")) {
                class395.field5539 = 2;
            } else {
                class428.method2659((byte) -57, "modewhat");
            }
            class89.field1320 = class132.method1036(-88, arg0[2]);
            if (class89.field1320 == -1) {
                if (arg0[2].equals("english")) {
                    class89.field1320 = 0;
                } else if (arg0[2].equals("german")) {
                    class89.field1320 = 1;
                } else {
                    class428.method2659((byte) -57, "language");
                }
            }
            class382.method2372(class89.field1320, 3628);
            class101.field1504 = false;
            class243.field3363 = false;
            if (arg0[3].equals("game0")) {
                class42.field640 = 0;
            } else if (arg0[3].equals("game1")) {
                class42.field640 = 1;
            } else {
                class428.method2659((byte) -57, "game");
            }
            class301.field4042 = "";
            class346.field4689 = 0;
            class96.field1393 = class42.field640;
            class363.field5020 = 0;
            client var1 = new client();
            class244.field3371 = var1;
            var1.method2034(1024, class395.field5539 + 32, 29, class42.field640 == 1 ? "stellardawn" : "runescape", false, 768, 555, 64);
            class414.field5781.setLocation(40, 40);
        } catch (Exception var3) {
            class380.method2365(-2, (String) null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1657(int arg0, byte arg1) {
        class118.field1650.field6435++;
        class118.field1650.field6438 = arg0;
        if (arg1 < 54) {
            method1653((byte) -41);
        }
        field3438++;
        class96.field1389 = null;
        class406.field5636 = 0;
        class259.field3493 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
    private final void method1658(byte[] arg0, byte arg1) {
        field3446++;
        if (arg1 <= 10) {
            field3449 = null;
        }
        class289 var3 = new class289(arg0);
        while (true) {
            int var4;
            do {
                while (true) {
                    var4 = var3.method1861((byte) -72);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 != 1) {
                        break;
                    }
                    int[] var7 = class394.field5518 = new int[6];
                    var7[0] = var3.method1853(-42);
                    var7[1] = var3.method1853(100);
                    var7[2] = var3.method1853(-40);
                    var7[3] = var3.method1853(-67);
                    var7[4] = var3.method1853(-115);
                    var7[5] = var3.method1853(-127);
                }
            } while (var4 != 4);
            int var5 = var3.method1861((byte) -72);
            class145.field2220 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class145.field2220[var6] = var3.method1853(-112);
                if (class145.field2220[var6] == 65535) {
                    class145.field2220[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static void method1659(int arg0) {
        field3444 = null;
        field3449 = null;
        if (arg0 != 50000) {
            method1652();
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1660(int arg0) {
        field3440++;
        if (class118.field1650.field6435 > class78.field1169) {
            class66.field1002 = (class118.field1650.field6435 * 50 - 50) * 5;
            if (class87.field1298 == class31.field518) {
                class31.field518 = class416.field5816;
            } else {
                class31.field518 = class87.field1298;
            }
            if (class66.field1002 > 3000) {
                class66.field1002 = 3000;
            }
            if (class118.field1650.field6435 >= 2 && class118.field1650.field6438 == 6) {
                this.method2039("js5connect_outofdate", 5);
                class166.field2472 = 1000;
                return;
            }
            if (class118.field1650.field6435 >= 4 && class118.field1650.field6438 == -1) {
                this.method2039("js5crc", 5);
                class166.field2472 = 1000;
                return;
            }
            if (class118.field1650.field6435 >= 4 && (class166.field2472 == 0 || class166.field2472 == 5)) {
                if (class118.field1650.field6438 == 7 || class118.field1650.field6438 == 9) {
                    this.method2039("js5connect_full", 5);
                } else if (class118.field1650.field6438 > 0) {
                    this.method2039("js5connect", 5);
                } else {
                    this.method2039("js5io", 5);
                }
                class166.field2472 = 1000;
                return;
            }
        }
        class78.field1169 = class118.field1650.field6435;
        if (class66.field1002 > 0) {
            class66.field1002--;
            return;
        }
        try {
            if (class406.field5636 == 0) {
                class96.field1389 = class30.field502.method1955(class31.field518, class295.field3985, -34);
                class406.field5636++;
            }
            if (arg0 >= -25) {
                this.method1643((byte) -97);
            }
            if (class406.field5636 == 1) {
                if (class96.field1389.field3345 == 2) {
                    this.method1657(1000, (byte) 56);
                    return;
                }
                if (class96.field1389.field3345 == 1) {
                    class406.field5636++;
                }
            }
            if (class406.field5636 == 2) {
                class259.field3493 = new class441((Socket) class96.field1389.field3341, class30.field502);
                class289 var2 = new class289(5);
                var2.method1824(42, 15);
                var2.method1854(555, true);
                class259.field3493.method2737(var2.field3882, 0, 5, -126);
                class406.field5636++;
                class442.field6358 = class108.method902((byte) -93);
            }
            if (class406.field5636 == 3) {
                if (class166.field2472 == 0 || class166.field2472 == 5 || class259.field3493.method2732(0) > 0) {
                    int var3 = class259.field3493.method2742(5000);
                    if (var3 != 0) {
                        this.method1657(var3, (byte) 71);
                        return;
                    }
                    class406.field5636++;
                } else if ((class108.method902((byte) -93) - class442.field6358) > 30000L) {
                    this.method1657(1001, (byte) 93);
                    return;
                }
            }
            if (class406.field5636 == 4) {
                boolean var4 = class166.field2472 == 5 || class166.field2472 == 10 || class166.field2472 == 28;
                class118.field1650.method2772(-15362, !var4, class259.field3493);
                class259.field3493 = null;
                class406.field5636 = 0;
                class96.field1389 = null;
            }
        } catch (IOException var5) {
            this.method1657(1002, (byte) 106);
        }
    }
}
