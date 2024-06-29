import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class172 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field2061 = 0;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field2067 = 0;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Z")
    private boolean field2077 = false;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[[I")
    public static int[][] field2071 = new int[128][128];

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field2065 = 16777215;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lsd;")
    public static class74 field2056 = new class74(46, -1);

    @OriginalMember(owner = "client!c", name = "x", descriptor = "S")
    public static short field2078 = 32767;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "J")
    public long field2069;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 12)
    public static final void method848(String arg0, byte arg1, boolean arg2) {
        field2064++;
        if (class414.field5904 != class145.field1754 || class369.field5285 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class327.field4709 = true;
                    class486.method2871(true, "fps debug enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class327.field4709 = false;
                    class486.method2871(true, "fps debug disabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class71.field865 = 0;
                    class215.field2961 = 0;
                    return;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class192.field2648.method2343(arg1 ^ 0x1);
                    class486.method2871(true, "Text coords cleared");
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class244.method1331(-100);
                    for (int var3 = 0; var3 < 10; var3++) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class486.method2871(true, "mem=" + var5 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class244.method1331(arg1 + 69);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class486.method2871(true, "Memory before cleanup=" + var8 + "k");
                    class326.method1984(arg1 + 99);
                    class244.method1331(-81);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class486.method2871(true, "Memory after cleanup=" + var10 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class486.method2871(true, "Number of player models in cache:" + class400.method2393(-47));
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class486.method2871(true, "Dropped client connection");
                    if (class453.field6415 == 30) {
                        class96.method471((byte) -82);
                    } else if (class453.field6415 == 25) {
                        class34.field414 = true;
                        return;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class331.field4766.method1023((byte) 126);
                    class486.method2871(true, "Dropped client js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class331.field4766.method1029((byte) -128);
                    class486.method2871(true, "Dropped server js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class42.field512.method2152((byte) -50);
                    class322.field4655.method670((byte) 96);
                    class331.field4766.method1021(-19);
                    class486.method2871(true, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class153.method735(true);
                    class255.method1567(arg1 - 2);
                    class486.method2871(true, "Rebuilding map");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class445.method2620(-1, 1, false, -4, -1);
                    if (class71.method366(78) != 1) {
                        class486.method2871(true, "wm1 failed");
                        return;
                    }
                    class486.method2871(true, "wm1 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class445.method2620(-1, 2, false, -4, -1);
                    if (class71.method366(arg1 + 88) == 2) {
                        class486.method2871(true, "wm2 succeeded");
                        return;
                    }
                    class486.method2871(true, "wm2 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class445.method2620(1024, 3, false, -4, 768);
                    if (class71.method366(125) != 3) {
                        class486.method2871(true, "wm3 failed");
                        return;
                    }
                    class486.method2871(true, "wm3 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class331.method2015((byte) -128, 0);
                    if (class375.field5347 == 0) {
                        class486.method2871(true, "Entered tk0");
                        class300.field4466 = 0;
                        class120.method582(-2, class42.field512);
                        class231.field3211 = false;
                        return;
                    }
                    class486.method2871(true, "Failed to enter tk0");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class331.method2015((byte) -128, 1);
                    if (class375.field5347 != 1) {
                        class486.method2871(true, "Failed to enter tk1");
                        return;
                    }
                    class486.method2871(true, "Entered tk1");
                    class300.field4466 = 1;
                    class120.method582(-2, class42.field512);
                    class231.field3211 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class331.method2015((byte) -128, 2);
                    if (class375.field5347 != 2) {
                        class486.method2871(true, "Failed to enter tk2");
                        return;
                    }
                    class486.method2871(true, "Entered tk2");
                    class300.field4466 = 2;
                    class120.method582(-2, class42.field512);
                    class231.field3211 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class331.method2015((byte) -128, 3);
                    if (class375.field5347 == 3) {
                        class486.method2871(true, "Entered tk3");
                        return;
                    }
                    class486.method2871(true, "Failed to enter tk3");
                    return;
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class304.field4496 = !class304.field4496;
                    class120.method582(-2, class42.field512);
                    class231.field3211 = false;
                    class153.method735(true);
                    class486.method2871(true, "ot=" + class304.field4496);
                    return;
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class346.field4949 = !class346.field4949;
                    class120.method582(arg1 - 3, class42.field512);
                    class231.field3211 = false;
                    class153.method735(true);
                    class486.method2871(true, "gb=" + class346.field4949);
                    return;
                }
                if (arg0.startsWith("shadows")) {
                    if (arg0.length() < 8) {
                        class486.method2871(true, "Invalid shadows value");
                        return;
                    }
                    String var11 = arg0.substring(8);
                    int var12 = class80.method401(false, var11) ? class184.method997(var11, false) : -1;
                    if (var12 >= 0 && var12 <= 2) {
                        class427.field6166 = var12;
                        class120.method582(~arg1, class42.field512);
                        class231.field3211 = false;
                        class153.method735(true);
                        class486.method2871(true, "shadows=" + var12);
                        return;
                    }
                    class486.method2871(true, "Invalid shadows value");
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class486.method2871(true, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class184.method997(arg0.substring(6), false);
                    if (var13 >= 0 && var13 <= class96.method470(255, class275.field3918)) {
                        class46.field597 = var13;
                        class120.method582(-2, class42.field512);
                        class231.field3211 = false;
                        class486.method2871(true, "maxbuildarea=" + class46.field597);
                        return;
                    }
                    class486.method2871(true, "Invalid buildarea value");
                    return;
                }
                if (arg0.startsWith("setparticles")) {
                    if (arg0.length() < 13) {
                        class486.method2871(true, "Invalid particles value");
                        return;
                    }
                    class115.method563((byte) 76, class184.method997(arg0.substring(13), false));
                    class120.method582(-2, class42.field512);
                    class231.field3211 = false;
                    class486.method2871(true, "particles=" + class175.method861(-88));
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class486.method2871(true, "Invalid rect_debug value");
                        return;
                    }
                    class17.field216 = class184.method997(arg0.substring(10).trim(), false);
                    class486.method2871(true, "rect_debug=" + class17.field216);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class192.field2640 = true;
                    class486.method2871(true, "qa_op_test=" + class192.field2640);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class223.field3096 = !class223.field3096;
                    class486.method2871(true, "clipcomponents=" + class223.field3096);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class231.field3205.method1373();
                    if (!class16.method108(!var14, -21811)) {
                        class486.method2871(true, "Failed to enable bloom");
                        return;
                    }
                    if (!var14) {
                        class486.method2871(true, "Bloom enabled");
                        return;
                    }
                    class486.method2871(true, "Bloom disabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class445.field6334) {
                        class445.field6334 = true;
                        class486.method2871(true, "Forced tweening ENABLED!");
                        return;
                    }
                    class445.field6334 = false;
                    class486.method2871(true, "Forced tweening disabled.");
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class224.field3100) {
                        class486.method2871(true, "Shift-click disabled.");
                        class224.field3100 = false;
                        return;
                    }
                    class486.method2871(true, "Shift-click ENABLED!");
                    class224.field3100 = true;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class486.method2871(true, "x:" + (class19.field258.field1008 >> 7) + " z:" + (class19.field258.field1005 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class486.method2871(true, "Height: " + class398.field5667[class19.field258.field994].method1861(class19.field258.field1008 >> 7, class19.field258.field1005 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class171.field2022.method2752(false);
                    class171.field2022.method2769(21354);
                    class44.field568.method1307(-128);
                    class47.field611.method1892((byte) -19);
                    class255.method1567(-1);
                    class486.method2871(true, "Minimap reset");
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (!class231.field3205.method1407()) {
                        class486.method2871(true, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var15 = Integer.parseInt(arg0.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class440.field6298 = var15;
                    class231.field3205.method1395(class440.field6298);
                    class231.field3205.method1381(0);
                    class486.method2871(true, "Render cores now: " + class440.field6298);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class486.method2871(true, "I(s): " + class218.field3070.method1174((byte) -124) + "/" + class218.field3070.method1164(true));
                    class486.method2871(true, "I(m): " + class481.field6801.method1174((byte) -62) + "/" + class481.field6801.method1164(true));
                    class486.method2871(true, "O(s): " + class422.field6096.field241.method782(99) + "/" + class422.field6096.field241.method788(false));
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class486.method2871(true, "Pos: " + class19.field258.field994 + "," + ((class58.field734 >> 7) + class93.field1163 >> 6) + "," + ((class351.field5047 >> 7) + class349.field5023 >> 6) + "," + ((class58.field734 >> 7) + class93.field1163 & 0x3F) + "," + ((class351.field5047 >> 7) + class349.field5023 & 0x3F) + " Height: " + (class375.method2264(-1547, class351.field5047, class19.field258.field994, class58.field734) - class427.field6145));
                    class486.method2871(true, "Look: " + class19.field258.field994 + "," + (class93.field1163 + class19.field255 >> 6) + "," + (class88.field1093 + class349.field5023 >> 6) + "," + (class19.field255 + class93.field1163 & 0x3F) + "," + (class88.field1093 + class349.field5023 & 0x3F) + " Height: " + (class375.method2264(-1547, class88.field1093, class19.field258.field994, class19.field255) - class404.field5745));
                    return;
                }
                if (arg0.equals("showocc")) {
                    class276.field3955 = !class276.field3955;
                    class153.method735(true);
                    class486.method2871(true, "showocc=" + class276.field3955);
                    return;
                }
                if (arg0.equals("wallocc")) {
                    class19.field265 = !class19.field265;
                    class153.method735(true);
                    class486.method2871(true, "forcewallocc=" + class19.field265);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class46.field595 = !class46.field595;
                    class231.field3205.method1489(class46.field595);
                    class362.method2202(0);
                    class486.method2871(true, "showprofiling=" + class46.field595);
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class274.field3911 = !class274.field3911;
                    class486.method2871(true, "nonpcs=" + class274.field3911);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class129.method619((byte) 114);
                    class486.method2871(true, "auto world selected");
                    return;
                }
                if (arg0.equals("heap")) {
                    class486.method2871(true, "Heap: " + class275.field3918 + "MB");
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class451.method2641((byte) 82);
                    class486.method2871(true, "perm varcs saved");
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var16 = 0; var16 < class288.field4312.length; var16++) {
                        if (class190.field2599[var16]) {
                            class288.field4312[var16] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class288.field4312[var16] *= -1;
                            }
                        }
                    }
                    class451.method2641((byte) 22);
                    class486.method2871(true, "perm varcs scrambled");
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class249.field3505 = true;
                    class255.method1567(arg1 - 2);
                    class486.method2871(true, "colmap is shown");
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class249.field3505 = false;
                    class255.method1567(-1);
                    class486.method2871(true, "colmap is hidden");
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class247.method1505(120);
                    class486.method2871(true, "Caches reset");
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class486.method2871(true, class121.method585(-121) + "ms");
                    return;
                }
                if (arg0.startsWith("cpuusage")) {
                    int var17 = Integer.parseInt(arg0.substring(9));
                    if (var17 >= 0 && var17 <= 4) {
                        class217.field3010 = var17;
                    }
                    class486.method2871(true, "cpuusage=" + class217.field3010);
                    return;
                }
                if (class453.field6415 == 30) {
                    class153.field1832++;
                    class244.method1332((byte) 125, class331.field4764);
                    class230.field3185.method909(arg0.length() + 2, arg1 ^ 0xFFFFFFFE);
                    class230.field3185.method909(arg2 ? 1 : 0, -1);
                    class230.field3185.method935(arg0, 65);
                }
                if (arg0.startsWith("fps ") && class414.field5904 != class145.field1754) {
                    class40.method204(class184.method997(arg0.substring(4), false), 1000);
                    return;
                }
                if (class453.field6415 != 30) {
                    class486.method2871(true, "Unrecogonised commmand when not logged in: " + arg0);
                }
            } catch (Exception var18) {
                class486.method2871(true, "Whoops, something went wrong.");
            }
        }
        if (arg1 != 1) {
            field2056 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 658)
    public final void method849(int arg0) {
        this.field2059 = class16.field214[this.field2057 << 3];
        field2068++;
        this.field2058 = (int) Math.sqrt((double) (this.field2076 * this.field2076 + this.field2075 * this.field2075 + this.field2074 * this.field2074));
        if (this.field2060 == 0) {
            this.field2060 = 1;
        }
        if (~this.field2073 == arg0) {
            this.field2069 = 2147483647L;
        } else if (this.field2073 == 1) {
            this.field2069 = (long) (this.field2058 * 8 / this.field2060);
            this.field2069 *= this.field2069;
        } else if (this.field2073 == 2) {
            this.field2069 = (long) (this.field2058 * 8 / this.field2060);
        }
        if (this.field2077) {
            this.field2058 *= -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIIIIII)V", line = 692)
    public static final void method850(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2066++;
        class369.method2235(arg6, 74);
        int var7 = 0;
        int var8 = arg6 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        if (arg0 != 20) {
            field2056 = null;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class357.field5123 <= arg4 && class328.field4729 >= arg4) {
            int[] var15 = class240.field3303[arg4];
            int var16 = class353.method2142((byte) 88, class453.field6396, arg1 - arg6, class75.field912);
            int var17 = class353.method2142((byte) -85, class453.field6396, arg1 + arg6, class75.field912);
            int var18 = class353.method2142((byte) -51, class453.field6396, arg1 - var8, class75.field912);
            int var19 = class353.method2142((byte) 127, class453.field6396, arg1 + var8, class75.field912);
            class270.method1633(var15, var18, arg3, var16, 100);
            class270.method1633(var15, var19, arg2, var18, 105);
            class270.method1633(var15, var17, arg3, var19, 108);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class88.field1096[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg4 - var9;
                int var21 = arg4 + var9;
                if (var21 >= class357.field5123 && class328.field4729 >= var20) {
                    if (var9 < var8) {
                        int var22 = class88.field1096[var9];
                        int var23 = class353.method2142((byte) -110, class453.field6396, arg1 + var7, class75.field912);
                        int var24 = class353.method2142((byte) -57, class453.field6396, arg1 - var7, class75.field912);
                        int var25 = class353.method2142((byte) 74, class453.field6396, arg1 + var22, class75.field912);
                        int var26 = class353.method2142((byte) -69, class453.field6396, arg1 - var22, class75.field912);
                        if (var21 <= class328.field4729) {
                            int[] var27 = class240.field3303[var21];
                            class270.method1633(var27, var26, arg3, var24, 119);
                            class270.method1633(var27, var25, arg2, var26, arg0 ^ 0x6D);
                            class270.method1633(var27, var23, arg3, var25, 118);
                        }
                        if (class357.field5123 <= var20) {
                            int[] var28 = class240.field3303[var20];
                            class270.method1633(var28, var26, arg3, var24, 107);
                            class270.method1633(var28, var25, arg2, var26, 119);
                            class270.method1633(var28, var23, arg3, var25, 94);
                        }
                    } else {
                        int var29 = class353.method2142((byte) 91, class453.field6396, arg1 + var7, class75.field912);
                        int var30 = class353.method2142((byte) 80, class453.field6396, arg1 - var7, class75.field912);
                        if (class328.field4729 >= var21) {
                            class270.method1633(class240.field3303[var21], var29, arg3, var30, 108);
                        }
                        if (class357.field5123 <= var20) {
                            class270.method1633(class240.field3303[var20], var29, arg3, var30, 90);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (var32 >= class357.field5123 && class328.field4729 >= var31) {
                int var33 = arg1 + var9;
                int var34 = arg1 - var9;
                if (var33 >= class75.field912 && var34 <= class453.field6396) {
                    int var35 = class353.method2142((byte) -79, class453.field6396, var33, class75.field912);
                    int var36 = class353.method2142((byte) 101, class453.field6396, var34, class75.field912);
                    if (var7 < var8) {
                        int var37 = var11 >= var7 ? var11 : class88.field1096[var7];
                        int var38 = class353.method2142((byte) 73, class453.field6396, arg1 + var37, class75.field912);
                        int var39 = class353.method2142((byte) 82, class453.field6396, arg1 - var37, class75.field912);
                        if (class328.field4729 >= var32) {
                            int[] var40 = class240.field3303[var32];
                            class270.method1633(var40, var39, arg3, var36, arg0 + 99);
                            class270.method1633(var40, var38, arg2, var39, arg0 ^ 0x4F);
                            class270.method1633(var40, var35, arg3, var38, 114);
                        }
                        if (var31 >= class357.field5123) {
                            int[] var41 = class240.field3303[var31];
                            class270.method1633(var41, var39, arg3, var36, arg0 ^ 0x6B);
                            class270.method1633(var41, var38, arg2, var39, 107);
                            class270.method1633(var41, var35, arg3, var38, arg0 + 96);
                        }
                    } else {
                        if (var32 <= class328.field4729) {
                            class270.method1633(class240.field3303[var32], var35, arg3, var36, 117);
                        }
                        if (class357.field5123 <= var31) {
                            class270.method1633(class240.field3303[var31], var35, arg3, var36, 101);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 875)
    public static void method851(int arg0) {
        if (arg0 == 1206551841) {
            field2056 = null;
            field2071 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V", line = 887)
    public static final void method852(int arg0, int arg1, int arg2) {
        field2062++;
        class89 var3 = class146.method695(7, arg1, (byte) -46);
        var3.method449(true);
        var3.field1106 = arg0;
        if (arg2 != 1) {
            field2078 = -114;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILvt;)V", line = 903)
    public final void method853(int arg0, class179 arg1) {
        if (arg0 != -5) {
            this.method854((class179) null, -24, -45);
        }
        field2070++;
        while (true) {
            int var3 = arg1.method895((byte) -109);
            if (var3 == 0) {
                return;
            }
            this.method854(arg1, -95, var3);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lvt;II)V", line = 923)
    private final void method854(class179 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2057 = arg0.method916(21933);
        } else if (arg2 == 2) {
            arg0.method895((byte) -100);
        } else if (arg2 == 3) {
            this.field2076 = arg0.method939((byte) 91);
            this.field2075 = arg0.method939((byte) 39);
            this.field2074 = arg0.method939((byte) -68);
        } else if (arg2 == 4) {
            this.field2073 = arg0.method895((byte) -102);
            this.field2060 = arg0.method939((byte) -86);
        } else if (arg2 == 6) {
            this.field2055 = arg0.method895((byte) -101);
        } else if (arg2 == 8) {
            this.field2061 = 1;
        } else if (arg2 == 9) {
            this.field2067 = 1;
        } else if (arg2 == 10) {
            this.field2077 = true;
        }
        if (arg1 >= -58) {
            this.field2058 = 38;
        }
        field2072++;
    }
}
