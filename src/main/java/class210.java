import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class210 implements Runnable {

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[Luc;")
    public volatile class176[] field2549 = new class176[2];

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
    public volatile boolean field2545 = false;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Z")
    public volatile boolean field2554 = false;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lwp;")
    public static class288 field2546 = new class288();

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lak;")
    public static class31 field2544;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lnh;")
    public class441 field2550;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
    public static final int method1285(int arg0, int arg1, int arg2) {
        field2552++;
        int var3 = class384.method2392(12403, arg1 - 1, arg2 + -1) - (-class384.method2392(12403, arg1 + 1, arg2 + -1) - class384.method2392(12403, arg1 - 1, arg2 + 1)) + class384.method2392(12403, arg1 + 1, arg2 + 1);
        int var4 = class384.method2392(12403, arg1 - 1, arg2) - (-class384.method2392(12403, arg1 + 1, arg2) - (class384.method2392(12403, arg1, arg2 - 1) + class384.method2392(12403, arg1, arg2 + 1)));
        int var5 = 114 % ((arg0 + 26) / 62);
        int var6 = class384.method2392(12403, arg1, arg2);
        return var4 / 8 + var3 / 16 + var6 / 4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static final void method1286(int arg0) {
        field2553++;
        if (arg0 > -57) {
            method1287(-121, -91, 58, 53);
        }
        for (class266 var1 = (class266) class97.field1138.method1690((byte) -116); var1 != null; var1 = (class266) class97.field1138.method1699((byte) 115)) {
            if (class150.method970(true, var1.field3424)) {
                class428.method2614(68, var1);
            }
        }
        if (class57.field660 == 1) {
            class49.field574 = false;
            class31.method203(class194.field2298, class143.field1686, class76.field941, class148.field1735, 174);
            return;
        }
        class31.method203(class194.field2298, class143.field1686, class76.field941, class148.field1735, 174);
        int var2 = class213.field2611.method2203((byte) -105, class126.field1409.method434(class373.field5057, -8192));
        for (class266 var3 = (class266) class97.field1138.method1690((byte) -116); var3 != null; var3 = (class266) class97.field1138.method1699((byte) 88)) {
            int var4 = class268.method1677(var3, true);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class194.field2298 = (class231.field3044 ? 26 : 22) + class57.field660 * 16;
        class143.field1686 = var2 + 8;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
    public static final void method1287(int arg0, int arg1, int arg2, int arg3) {
        class316 var4 = class347.field4722[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class364 var5 = var4.field4259;
        class364 var6 = var4.field4266;
        if (var5 != null) {
            var5.field4949 = var5.field4949 * arg3 / 16;
            var5.field4942 = var5.field4942 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field4949 = var6.field4949 * arg3 / 16;
            var6.field4942 = var6.field4942 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field2546 = null;
        if (arg0 > -26) {
            field2544 = null;
        }
        field2544 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1289(boolean arg0, int arg1, String arg2) {
        field2547++;
        if (class94.field1105 != 0 || class427.field5842 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class139.field1615 = true;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class139.field1615 = false;
                }
                if (arg2.equalsIgnoreCase("cls")) {
                    class278.field3592 = 0;
                    class5.field36 = 0;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class80.field974.method1843(64);
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class168.method1071(arg1 - 10);
                    for (int var3 = 0; var3 < 10; var3++) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class228.method1394("mem=" + var5 + "k", 0);
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class168.method1071(0);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class228.method1394("Memory before cleanup=" + var8 + "k", 0);
                    class23.method145(-89);
                    class168.method1071(arg1 ^ 0xA);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class228.method1394("Memory after cleanup=" + var10 + "k", arg1 ^ 0xA);
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class228.method1394("Number of player models in cache:" + class301.method1915(17052), 0);
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    if (class174.field2017 == 30) {
                        class143.method921(arg1 ^ 0x3867);
                    } else if (class174.field2017 == 25) {
                        class420.field5755 = true;
                    }
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class235.field3094.method2367(91);
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class235.field3094.method2371((byte) 98);
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class401.field5525.method2718(arg1 ^ 0x4726);
                    class181.field2107.method2461(false);
                    class235.field3094.method2372((byte) 64);
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class361.method2267((byte) 64);
                    class281.method1773((byte) -122);
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class56.method312(-1, true, -1, 1, false);
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class56.method312(-1, true, -1, 2, false);
                }
                if (arg2.equalsIgnoreCase("::wm3")) {
                    class56.method312(768, true, 1024, 3, false);
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class373.method2338(arg1 + 98, 0);
                    class121.field1382 = 0;
                    class362.method2273(class401.field5525, (byte) 120);
                    class75.field905 = false;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class373.method2338(120, 1);
                    class121.field1382 = 1;
                    class362.method2273(class401.field5525, (byte) 120);
                    class75.field905 = false;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class373.method2338(115, 2);
                    class121.field1382 = 2;
                    class362.method2273(class401.field5525, (byte) 125);
                    class75.field905 = false;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class373.method2338(113, 3);
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class275.field3557 = !class275.field3557;
                    class362.method2273(class401.field5525, (byte) 93);
                    class75.field905 = false;
                    class361.method2267((byte) 41);
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class362.field4906 = !class362.field4906;
                    class362.method2273(class401.field5525, (byte) 118);
                    class75.field905 = false;
                    class361.method2267((byte) 46);
                }
                if (arg2.startsWith("shadows ")) {
                    class333.field4548 = class366.method2311(arg2.substring(8), -120);
                    class362.method2273(class401.field5525, (byte) 105);
                    class75.field905 = false;
                    class361.method2267((byte) 101);
                }
                if (arg2.startsWith("setba")) {
                    class276.field3580 = class366.method2311(arg2.substring(6), -75);
                    class362.method2273(class401.field5525, (byte) 96);
                    class75.field905 = false;
                }
                if (arg2.startsWith("setparticles")) {
                    class198.method1224((byte) -118, class366.method2311(arg2.substring(13), -57));
                    class362.method2273(class401.field5525, (byte) 97);
                    class75.field905 = false;
                }
                if (arg2.startsWith("fps ") && class94.field1105 != 0) {
                    class347.method2211(class366.method2311(arg2.substring(4), 121), (byte) 33);
                }
                if (arg2.startsWith("rect_debug")) {
                    class422.field5781 = class366.method2311(arg2.substring(10).trim(), 94);
                    class228.method1394("rect_debug=" + class422.field5781, 0);
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class186.field2151 = true;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class133.field1513 = !class133.field1513;
                    class228.method1394("clipcomponents=" + class133.field1513, arg1 - 10);
                }
                if (arg2.startsWith("bloom")) {
                    boolean var11 = class267.field3454.method714();
                    if (!class338.method2165(-1, !var11)) {
                        class228.method1394("Failed to enable bloom", arg1 ^ 0xA);
                    } else if (var11) {
                        class228.method1394("Bloom disabled", arg1 - 10);
                    } else {
                        class228.method1394("Bloom enabled", arg1 ^ 0xA);
                    }
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (class338.field4610) {
                        class338.field4610 = false;
                        class228.method1394("Forced tweening disabled.", arg1 - 10);
                    } else {
                        class338.field4610 = true;
                        class228.method1394("Forced tweening ENABLED!", 0);
                    }
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class384.field5257) {
                        class228.method1394("Shift-click disabled.", 0);
                        class384.field5257 = false;
                    } else {
                        class228.method1394("Shift-click ENABLED!", 0);
                        class384.field5257 = true;
                    }
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class228.method1394("x:" + (class143.field1684.field1516 >> 7) + " z:" + (class143.field1684.field1514 >> 7), 0);
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class228.method1394("Height: " + class304.field4096[class43.field513].method1050(class143.field1684.field1516 >> 7, class143.field1684.field1514 >> 7), arg1 - 10);
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class15.field177.method1791(0);
                    class15.field177.method1802((byte) 70);
                    class70.method418(false);
                    class281.method1773((byte) -122);
                }
                if (arg2.startsWith("mc")) {
                    if (class267.field3454.method689()) {
                        int var12 = Integer.parseInt(arg2.substring(3));
                        if (var12 < 1) {
                            var12 = 1;
                        } else if (var12 > 4) {
                            var12 = 4;
                        }
                        class279.field3618 = var12;
                        class267.field3454.method695(class279.field3618);
                        class267.field3454.method759(0);
                        class228.method1394("Render cores now: " + class279.field3618, 0);
                    } else {
                        class228.method1394("Current toolkit doesn't support multiple cores", 0);
                    }
                }
                if (arg2.startsWith("cachespace")) {
                    class228.method1394("I(s): " + class59.field751.method2291(false) + "/" + class59.field751.method2289(-92), 0);
                    class228.method1394("I(m): " + class344.field4678.method2291(false) + "/" + class344.field4678.method2289(arg1 - 96), 0);
                    class228.method1394("O(s): " + class450.field6285.method1012((byte) 87) + "/" + class450.field6285.method1015(-120), 0);
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class228.method1394("Pos: " + class43.field513 + "," + ((class287.field3784 >> 7) + class278.field3608 >> 6) + "," + ((class80.field979 >> 7) + class129.field1432 >> 6) + "," + ((class287.field3784 >> 7) + class278.field3608 & 0x3F) + "," + ((class80.field979 >> 7) + class129.field1432 & 0x3F) + " Height: " + (class189.method1170(class80.field979, class287.field3784, true, class43.field513) - class51.field587), 0);
                    class228.method1394("Look: " + class43.field513 + "," + (class278.field3608 + class277.field3586 >> 6) + "," + (class66.field797 + class129.field1432 >> 6) + "," + (class277.field3586 + class278.field3608 & 0x3F) + "," + (class66.field797 + class129.field1432 & 0x3F) + " Height: " + (class189.method1170(class66.field797, class277.field3586, true, class43.field513) - class127.field1415), 0);
                }
                if (arg2.equals("showocc")) {
                    class131.field1499 = !class131.field1499;
                    class361.method2267((byte) 40);
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class226.field2869 = !class226.field2869;
                    class267.field3454.method755(class226.field2869);
                    class433.method2641(0);
                }
                if (arg2.equals("nonpcs")) {
                    class194.field2297 = !class194.field2297;
                }
                if (arg2.equals("autoworld")) {
                    class440.method2707((byte) -69);
                }
                if (arg2.equals("heap")) {
                    class228.method1394("Heap: " + class105.field1254 + "MB", 0);
                }
                if (arg2.equals("savevarcs")) {
                    class380.method2363(940);
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var13 = 0; var13 < class198.field2338.length; var13++) {
                        if (class53.field618[var13]) {
                            class198.field2338[var13] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class198.field2338[var13] *= -1;
                            }
                        }
                    }
                    class380.method2363(940);
                }
                if (arg2.equals("showcolmap")) {
                    class427.field5841 = true;
                    class281.method1773((byte) -122);
                }
                if (arg2.equals("hidecolmap")) {
                    class427.field5841 = false;
                    class281.method1773((byte) -122);
                }
                if (arg2.equals("resetcache")) {
                    class290.method1846(-126);
                }
                if (arg2.equals("profilecpu")) {
                    class228.method1394(class105.method632(arg1 ^ 0xA) + "ms", 0);
                }
                if (arg2.startsWith("cpuusage")) {
                    int var14 = Integer.parseInt(arg2.substring(9));
                    if (var14 >= 0 && var14 <= 4) {
                        class355.field4825 = var14;
                    }
                }
                if (class174.field2017 == 30) {
                    class427.field5837.method2162(false, 208);
                    class376.field5089++;
                    class427.field5837.method1593(arg2.length() + 2, -93);
                    class427.field5837.method1593(arg0 ? 1 : 0, -92);
                    class427.field5837.method1562(77, arg2);
                }
            } catch (Exception var15) {
                class228.method1394("Whoops, something went wrong.", 0);
            }
        }
        if (arg1 != 10) {
            method1289(false, -72, (String) null);
        }
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
    public final void run() {
        field2548++;
        this.field2554 = true;
        try {
            while (!this.field2545) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class176 var2 = this.field2549[var1];
                    if (var2 != null) {
                        var2.method1114(12863);
                    }
                }
                class219.method1330(10L, true);
                class54.method304((Object) null, this.field2550, 1001);
            }
        } catch (Exception var9) {
            class402.method2510((String) null, var9, -29832);
        } finally {
            Object var6 = null;
            this.field2554 = false;
        }
    }
}
