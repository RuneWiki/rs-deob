import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class160 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field2253 = 0;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
    private boolean field2249 = false;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public int field2259 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public int field2260;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "J")
    public long field2258;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method1062(boolean arg0, String arg1) {
        if (arg0) {
            method1064((byte) 2, true, (String) null);
        }
        field2250++;
        return class79.method562(arg1, true, 10, 105);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public final void method1063(int arg0) {
        if (arg0 <= 95) {
            return;
        }
        this.field2247 = class362.field5082[this.field2257 << 3];
        field2262++;
        this.field2251 = (int) Math.sqrt((double) (this.field2246 * this.field2246 + this.field2260 * this.field2260 + this.field2254 * this.field2254));
        if (this.field2243 == 0) {
            this.field2243 = 1;
        }
        if (this.field2263 == 0) {
            this.field2258 = 2147483647L;
        } else if (this.field2263 == 1) {
            this.field2258 = (long) (this.field2251 * 8 / this.field2243);
            this.field2258 *= this.field2258;
        } else if (this.field2263 == 2) {
            this.field2258 = (long) (this.field2251 * 8 / this.field2243);
        }
        if (this.field2249) {
            this.field2251 *= -1;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method1064(byte arg0, boolean arg1, String arg2) {
        if (arg0 != -60) {
            method1062(true, (String) null);
        }
        field2244++;
        if (class67.field1043 == 0 && class204.field2771 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class75.field1162 = true;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class75.field1162 = false;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class356.field5021 = 0;
                class266.field3637 = 0;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class76.field1178.method2305(-69);
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class427.method2686((byte) 114);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class250.method1555(-125, "mem=" + var5 + "k");
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class427.method2686((byte) 114);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class250.method1555(-123, "Memory before cleanup=" + var8 + "k");
                class54.method370(27348);
                class427.method2686((byte) 114);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class250.method1555(arg0 - 67, "Memory after cleanup=" + var10 + "k");
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class250.method1555(-124, "Number of player models in cache:" + class237.method1491(3));
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class374.method2447((byte) -10);
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class296.field4115.method2190((byte) -102);
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class296.field4115.method2193(false);
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class204.field2772.method2257(61);
                class199.field2749.method1590(-102);
                class296.field4115.method2184((byte) 88);
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class26.method213(115);
                class157.method1058(true);
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class365.method2347(-1, -31718, false, 1, -1);
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class365.method2347(-1, -31718, false, 2, -1);
            }
            if (arg2.equalsIgnoreCase("::wm3")) {
                class365.method2347(1024, -31718, false, 3, 768);
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class99.method702(arg0 - 17606, 0);
                class28.field448 = 0;
                class29.method228(arg0 ^ 0x61, class204.field2772);
                class249.field3451 = false;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class99.method702(-17666, 1);
                class28.field448 = 1;
                class29.method228(-80, class204.field2772);
                class249.field3451 = false;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class99.method702(-17666, 2);
                class28.field448 = 2;
                class29.method228(-52, class204.field2772);
                class249.field3451 = false;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class99.method702(-17666, 3);
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class427.field6127 = !class427.field6127;
                class29.method228(-80, class204.field2772);
                class249.field3451 = false;
                class26.method213(79);
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class10.field147 = !class10.field147;
                class29.method228(arg0 + 3, class204.field2772);
                class249.field3451 = false;
                class26.method213(90);
            }
            if (arg2.startsWith("shadows ")) {
                class410.field5956 = method1062(false, arg2.substring(8));
                class29.method228(-128, class204.field2772);
                class249.field3451 = false;
                class26.method213(arg0 ^ 0x22);
            }
            if (arg2.startsWith("setba")) {
                class129.field1800 = method1062(false, arg2.substring(6));
                class29.method228(-90, class204.field2772);
                class249.field3451 = false;
            }
            if (arg2.startsWith("setparticles")) {
                class132.method901(-32190, method1062(false, arg2.substring(13)));
                class29.method228(-74, class204.field2772);
                class249.field3451 = false;
            }
            if (arg2.startsWith("fps ") && class67.field1043 != 0) {
                class293.method1878(method1062(false, arg2.substring(4)), 21799);
            }
            if (arg2.startsWith("rect_debug")) {
                class152.field2156 = method1062(false, arg2.substring(10).trim());
                class250.method1555(-122, "rect_debug=" + class152.field2156);
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class280.field3829 = true;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class30.field469 = !class30.field469;
                class250.method1555(-123, "clipcomponents=" + class30.field469);
            }
            if (arg2.startsWith("bloom")) {
                boolean var11 = class408.field5920.method1780();
                if (!class58.method388(!var11, -98)) {
                    class250.method1555(arg0 ^ 0x44, "Failed to enable bloom");
                } else if (var11) {
                    class250.method1555(arg0 ^ 0x42, "Bloom disabled");
                } else {
                    class250.method1555(-123, "Bloom enabled");
                }
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (class169.field2408) {
                    class169.field2408 = false;
                    class250.method1555(-125, "Forced tweening disabled.");
                } else {
                    class169.field2408 = true;
                    class250.method1555(-128, "Forced tweening ENABLED!");
                }
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (class389.field5708) {
                    class250.method1555(arg0 - 68, "Shift-click disabled.");
                    class389.field5708 = false;
                } else {
                    class250.method1555(-128, "Shift-click ENABLED!");
                    class389.field5708 = true;
                }
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class250.method1555(arg0 - 64, "x:" + (class307.field4211.field6197 >> 7) + " z:" + (class307.field4211.field6192 >> 7));
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class250.method1555(arg0 ^ 0x46, "Height: " + class249.field3456[class265.field3617].method275(class307.field4211.field6197 >> 7, class307.field4211.field6192 >> 7));
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class353.field4943.method1910(112);
                class353.field4943.method1907(arg0 ^ 0x26);
                class233.method1465((byte) -126);
                class157.method1058(true);
            }
            if (arg2.startsWith("mc")) {
                if (class408.field5920.method1778()) {
                    int var12 = Integer.parseInt(arg2.substring(3));
                    if (var12 < 1) {
                        var12 = 1;
                    } else if (var12 > 4) {
                        var12 = 4;
                    }
                    class5.field84 = var12;
                    class408.field5920.method1801(class5.field84);
                    class408.field5920.method1798(0);
                    class250.method1555(-128, "Render cores now: " + class5.field84);
                } else {
                    class250.method1555(-124, "Current toolkit doesn't support multiple cores");
                }
            }
            if (arg2.startsWith("cachespace")) {
                class250.method1555(-125, "I(s): " + class197.field2735.method1244(arg0 ^ -57) + "/" + class197.field2735.method1255(107));
                class250.method1555(-123, "I(m): " + class410.field5951.method1244(3) + "/" + class410.field5951.method1255(arg0 + 177));
                class250.method1555(arg0 ^ 0x41, "O(s): " + class362.field5075.method1680((byte) 71) + "/" + class362.field5075.method1670(60));
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class250.method1555(arg0 ^ 0x47, "Pos: " + class265.field3617 + "," + ((class368.field5158 >> 7) + class449.field6509 >> 6) + "," + ((class336.field4561 >> 7) + class354.field4981 >> 6) + "," + ((class368.field5158 >> 7) + class449.field6509 & 0x3F) + "," + ((class336.field4561 >> 7) + class354.field4981 & 0x3F) + " Height: " + (class279.method1698(class368.field5158, class336.field4561, class265.field3617, (byte) 3) - class34.field528));
                class250.method1555(-128, "Look: " + class265.field3617 + "," + (class403.field5874 + class449.field6509 >> 6) + "," + (class350.field4886 + class354.field4981 >> 6) + "," + (class449.field6509 + class403.field5874 & 0x3F) + "," + (class354.field4981 + class350.field4886 & 0x3F) + " Height: " + (class279.method1698(class403.field5874, class350.field4886, class265.field3617, (byte) 3) - class406.field5905));
            }
            if (arg2.equals("showocc")) {
                class361.field5067 = !class361.field5067;
                class26.method213(arg0);
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class309.field4238 = !class309.field4238;
                class408.field5920.method1764(class309.field4238);
                class214.method1373(0);
            }
            if (arg2.equals("nonpcs")) {
                class340.field4749 = !class340.field4749;
            }
            if (arg2.equals("autoworld")) {
                class378.method2470((byte) -126);
            }
            if (arg2.equals("heap")) {
                class250.method1555(-128, "Heap: " + class275.field3730 + "MB");
            }
            if (arg2.equals("savevarcs")) {
                class412.method2637(0);
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var13 = 0; var13 < class220.field2890.length; var13++) {
                    if (class137.field1958[var13]) {
                        class220.field2890[var13] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class220.field2890[var13] *= -1;
                        }
                    }
                }
                class412.method2637(arg0 ^ 0xFFFFFFC4);
            }
            if (arg2.equals("showcolmap")) {
                class166.field2369 = true;
                class157.method1058(true);
            }
            if (arg2.equals("hidecolmap")) {
                class166.field2369 = false;
                class157.method1058(true);
            }
            if (arg2.equals("resetcache")) {
                class33.method246(-1);
            }
            if (arg2.equals("profilecpu")) {
                class250.method1555(-122, class124.method828(-127) + "ms");
            }
            if (class79.field1220 == 30) {
                class442.field6400.method158((byte) 7, 197);
                class346.field4848++;
                class442.field6400.method2396(arg2.length() + 2, 12450);
                class442.field6400.method2396(arg1 ? 1 : 0, 12450);
                class442.field6400.method2412(-100, arg2);
                return;
            }
        } catch (Exception var14) {
            class250.method1555(-125, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2248++;
        class383 var7 = class315.method2010(arg0, arg4, -27590);
        if (var7 != null && var7.field5424 != null) {
            class410 var8 = new class410();
            var8.field5946 = var7;
            var8.field5961 = var7.field5424;
            class111.method738(var8);
        }
        class309.field4235 = true;
        class289.field3993 = arg3;
        class25.field400 = arg1;
        class247.field3422 = arg2;
        class439.field6373 = arg6;
        class339.field4745 = arg0;
        class236.field3214 = arg4;
        class86.method596(14459, var7);
        if (arg5 >= 85) {
            ;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLeb;)V")
    public final void method1066(byte arg0, class371 arg1) {
        field2245++;
        if (arg0 >= -16) {
            method1064((byte) 41, false, (String) null);
        }
        while (true) {
            int var3 = arg1.method2429(0);
            if (var3 == 0) {
                return;
            }
            this.method1069(arg1, var3, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILrg;)Ljava/lang/String;")
    public static final String method1067(int arg0, class383 arg1) {
        if (arg0 != -7353) {
            return null;
        }
        field2242++;
        if (client.method1119(arg1).method1642((byte) 28) == 0) {
            return null;
        } else if (arg1.field5436 == null || arg1.field5436.trim().length() == 0) {
            return class280.field3829 ? "Hidden-use" : null;
        } else {
            return arg1.field5436;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLaa;)V")
    public static final void method1068(byte arg0, class281 arg1) {
        field2255++;
        int var2 = class377.field5380;
        int var3 = class156.field2206;
        int var4 = class340.field4753;
        if (arg0 != -95) {
            return;
        }
        int var5 = class396.field5781;
        int var6 = -10660793;
        arg1.method1762(var3, var5, var2, var6, var4, -1);
        arg1.method1762(var3 + 1, 16, var2 + 1, -16777216, var4 - 2, arg0 ^ 0x5E);
        arg1.method1754(-16777216, var3 + 18, (byte) -74, var4 - 2, var2 + 1, var5 - 19);
        class220.field2899.method2278(var6, var3 + 14, -1, class344.field4815, (byte) -109, var2 + 3);
        int var7 = class349.field4883;
        int var8 = class162.field2269;
        int var9 = 0;
        for (class207 var10 = (class207) class167.field2393.method1312((byte) 25); var10 != null; var10 = (class207) class167.field2393.method1304(-60)) {
            int var11 = (class390.field5740 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var2 + var4 > var7 && var11 - 13 < var8 && var11 + 3 > var8) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class162.method1071(var10.field2797, -105)) {
                var13 = class347.method2222((int) var10.field2807, 18682).field5728;
            } else if (class14.method77((byte) 106, var10.field2797)) {
                class437 var14 = class445.field6422[(int) var10.field2807];
                if (var14 != null) {
                    var13 = var14.field6290.field2974;
                }
            } else if (class326.method2052(false, var10.field2797)) {
                if (var10.field2797 == 1008) {
                    var13 = class310.method1961((int) var10.field2807, (byte) 35).field5181;
                } else {
                    var13 = class310.method1961((int) (var10.field2807 >>> 32 & 0x7FFFFFFFL), (byte) 35).field5181;
                }
            }
            String var15 = class115.method757(var10, -18357);
            if (var13 != null) {
                var15 = var15 + class153.method1035(false, var13);
            }
            class220.field2899.method2273(0, var2 + 3, var15, var12, 0, var11, class28.field444, class135.field1926);
            var9++;
        }
        class303.method1941(class156.field2206, class396.field5781, class377.field5380, 1372, class340.field4753);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Leb;IB)V")
    private final void method1069(class371 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2257 = arg0.method2403((byte) 117);
        } else if (arg1 == 2) {
            arg0.method2429(0);
        } else if (arg1 == 3) {
            this.field2260 = arg0.method2413((byte) -30);
            this.field2246 = arg0.method2413((byte) -30);
            this.field2254 = arg0.method2413((byte) -30);
        } else if (arg1 == 4) {
            this.field2263 = arg0.method2429(arg2 - 24);
            this.field2243 = arg0.method2413((byte) -30);
        } else if (arg1 == 6) {
            this.field2252 = arg0.method2429(0);
        } else if (arg1 == 8) {
            this.field2259 = 1;
        } else if (arg1 == 9) {
            this.field2253 = 1;
        } else if (arg1 == 10) {
            this.field2249 = true;
        }
        field2256++;
        if (arg2 != 24) {
            this.field2254 = 32;
        }
    }
}
