import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class474 extends class521 {

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "Z")
    private boolean field6645 = false;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Z")
    private boolean field6640;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "[Llm;")
    private class423[] field6651;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field6637 = 0;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "[I")
    public static int[] field6638 = new int[1000];

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "Z")
    public static boolean field6653 = false;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZLjava/lang/String;Z)V", line = 4)
    public static final void method2757(int arg0, boolean arg1, String arg2, boolean arg3) {
        ++field6648;
        if (class507.field7033 != class36.field282 || ~class633.field9120 <= -3) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class252.field3260 = true;
                    class543.method3175("fps debug enabled", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class252.field3260 = false;
                    class543.method3175("fps debug disabled", true);
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class543.method3175("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", true);
                        return;
                    } catch (Throwable var33) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cls")) {
                    class208.field2500 = 0;
                    class54.field458 = 0;
                    return;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class82.field991.method1985(arg0 ^ 1);
                    class543.method3175("Text coords cleared", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class429.method2487(arg0 + 82);
                    for (int var4 = 0; ~var4 > -11; ++var4) {
                        System.gc();
                    }
                    Runtime var5 = Runtime.getRuntime();
                    int var6 = (int) ((var5.totalMemory() + -var5.freeMemory()) / 1024L);
                    class543.method3175("mem=" + var6 + "k", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class429.method2487(57);
                    for (int var7 = 0; ~var7 > -11; ++var7) {
                        System.gc();
                    }
                    Runtime var8 = Runtime.getRuntime();
                    int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class543.method3175("Memory before cleanup=" + var9 + "k", true);
                    class425.method2395(true);
                    class429.method2487(91);
                    for (int var10 = 0; var10 < 10; ++var10) {
                        System.gc();
                    }
                    int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class543.method3175("Memory after cleanup=" + var11 + "k", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    class543.method3175(class356.method2004(47) ? "Libraries unloaded" : "Library unloading failed!", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class543.method3175("Number of player models in cache:" + class529.method3014((byte) -66), true);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class543.method3175("Dropped client connection", true);
                    if (~class137.field1671 == -10) {
                        class276.method1567((byte) -29);
                        return;
                    }
                    if (class137.field1671 == 10) {
                        class103.field1264 = true;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class232.field2861.method2518(-1);
                    class543.method3175("Dropped client js5 net queue", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class232.field2861.method2517((byte) -15);
                    class543.method3175("Dropped server js5 net queue", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class74.field873.method910(-93);
                    class597.field8642.method2271((byte) -40);
                    class232.field2861.method2526(-86);
                    class543.method3175("Breaking new connections for 5 seconds", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class74.method422((byte) -57);
                    class463.method2698((byte) -24);
                    class543.method3175("Rebuilding map", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class196.method1066(1, (byte) 83, -1, -1, false);
                    if (~class99.method608(false) != -2) {
                        class543.method3175("wm1 failed", true);
                        return;
                    }
                    class543.method3175("wm1 succeeded", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class196.method1066(2, (byte) 83, -1, -1, false);
                    if (~class99.method608(false) == -3) {
                        class543.method3175("wm2 succeeded", true);
                        return;
                    }
                    class543.method3175("wm2 failed", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class196.method1066(3, (byte) 83, 768, 1024, false);
                    if (~class99.method608(false) != -4) {
                        class543.method3175("wm3 failed", true);
                        return;
                    }
                    class543.method3175("wm3 succeeded", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class24.method144(-2, 0);
                    if (class529.field7429 == 0) {
                        class543.method3175("Entered tk0", true);
                        class565.field8299.field2188 = 0;
                        class565.field8299.method3585(true, class74.field873);
                        class74.field865 = false;
                        return;
                    }
                    class543.method3175("Failed to enter tk0", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class24.method144(-2, 1);
                    if (~class529.field7429 != -2) {
                        class543.method3175("Failed to enter tk1", true);
                        return;
                    }
                    class543.method3175("Entered tk1", true);
                    class565.field8299.field2188 = 1;
                    class565.field8299.method3585(true, class74.field873);
                    class74.field865 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class24.method144(-2, 2);
                    if (class529.field7429 == 2) {
                        class543.method3175("Entered tk2", true);
                        class565.field8299.field2188 = 2;
                        class565.field8299.method3585(true, class74.field873);
                        class74.field865 = false;
                        return;
                    }
                    class543.method3175("Failed to enter tk2", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class24.method144(~arg0, 3);
                    if (class529.field7429 != 3) {
                        class543.method3175("Failed to enter tk3", true);
                        return;
                    }
                    class543.method3175("Entered tk3", true);
                    class565.field8299.field2188 = 3;
                    class565.field8299.method3585(true, class74.field873);
                    class74.field865 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk4")) {
                    class24.method144(-2, 4);
                    if (class529.field7429 != 4) {
                        class543.method3175("Failed to enter tk4", true);
                        return;
                    }
                    class543.method3175("Entered tk4", true);
                    class565.field8299.field2188 = 4;
                    class565.field8299.method3585(true, class74.field873);
                    class74.field865 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    class24.method144(-2, 5);
                    if (~class529.field7429 == -6) {
                        class543.method3175("Entered tk5", true);
                        class565.field8299.field2188 = 5;
                        class565.field8299.method3585(true, class74.field873);
                        class74.field865 = false;
                        return;
                    }
                    class543.method3175("Failed to enter tk5", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class565.field8299.field2181 = !class565.field8299.field2181;
                    class565.field8299.method3585(true, class74.field873);
                    class74.field865 = false;
                    class74.method422((byte) -113);
                    class543.method3175("ot=" + class565.field8299.field2181, true);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class565.field8299.field2194 = !class565.field8299.field2194;
                    class565.field8299.method3585(true, class74.field873);
                    class74.field865 = false;
                    class74.method422((byte) -119);
                    class543.method3175("gb=" + class565.field8299.field2194, true);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (arg2.length() < 8) {
                        class543.method3175("Invalid shadows value", true);
                        return;
                    }
                    String var12 = arg2.substring(8);
                    int var13 = class398.method2284((byte) 118, var12) ? class232.method1325(var12, arg0 + -1) : -1;
                    if (var13 >= 0 && ~var13 >= -3) {
                        class565.field8299.method992(var13, class529.field7429, arg0 ^ 3);
                        class565.field8299.method3585(true, class74.field873);
                        class74.field865 = false;
                        class74.method422((byte) -115);
                        class543.method3175("shadows=" + var13, true);
                        return;
                    }
                    class543.method3175("Invalid shadows value", true);
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class565.field8299.field2183 = !class565.field8299.field2183;
                    class565.field8299.method3585(true, class74.field873);
                    class74.field865 = false;
                    class529.method3013(4);
                    class74.method422((byte) -107);
                    class543.method3175("textures=" + class565.field8299.field2183, true);
                    return;
                }
                if (arg2.startsWith("lighting")) {
                    class565.field8299.method995(class529.field7429, !class565.field8299.method993(class529.field7429, 92), (byte) 7);
                    class565.field8299.method3585(true, class74.field873);
                    class74.field865 = false;
                    class316.method1751(81);
                    class529.method3013(4);
                    class74.method422((byte) -12);
                    class543.method3175("lighting=" + class565.field8299.method993(class529.field7429, 114), true);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class543.method3175("Invalid buildarea value", true);
                        return;
                    }
                    int var14 = class232.method1325(arg2.substring(6), 0);
                    if (var14 >= 0 && ~class224.method1288(class252.field3258, 59) <= ~var14) {
                        class565.field8299.field2175 = var14;
                        class565.field8299.method3585(true, class74.field873);
                        class74.field865 = false;
                        class543.method3175("maxbuildarea=" + class565.field8299.field2175, true);
                        return;
                    }
                    class543.method3175("Invalid buildarea value", true);
                    return;
                }
                if (arg2.startsWith("setparticles")) {
                    if (arg2.length() < 13) {
                        class543.method3175("Invalid particles value", true);
                        return;
                    }
                    class459.method2677(class232.method1325(arg2.substring(13), 0), arg0 ^ 3);
                    class565.field8299.method3585(true, class74.field873);
                    class74.field865 = false;
                    class543.method3175("particles=" + class222.method1281((byte) -17), true);
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (~arg2.length() > -11) {
                        class543.method3175("Invalid rect_debug value", true);
                        return;
                    }
                    class241.field3010 = class232.method1325(arg2.substring(10).trim(), 0);
                    class543.method3175("rect_debug=" + class241.field3010, true);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class2.field8 = true;
                    class543.method3175("qa_op_test=" + class2.field8, true);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class81.field968 = !class81.field968;
                    class543.method3175("clipcomponents=" + class81.field968, true);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var15 = class210.field2560.method1143();
                    if (!class367.method2059(!var15, (byte) 15)) {
                        class543.method3175("Failed to enable bloom", true);
                        return;
                    }
                    if (var15) {
                        class543.method3175("Bloom disabled", true);
                        return;
                    }
                    class543.method3175("Bloom enabled", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (class166.field2034) {
                        class166.field2034 = false;
                        class543.method3175("Forced tweening disabled.", true);
                        return;
                    }
                    class166.field2034 = true;
                    class543.method3175("Forced tweening ENABLED!", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class236.field2894) {
                        class543.method3175("Shift-click disabled.", true);
                        class236.field2894 = false;
                        return;
                    }
                    class543.method3175("Shift-click ENABLED!", true);
                    class236.field2894 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class543.method3175("x:" + (class103.field1265.field8661 >> 7) + " z:" + (class103.field1265.field8652 >> 7), true);
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class543.method3175("Height: " + class128.field1574[class103.field1265.field8660].method855(class103.field1265.field8661 >> 7, class103.field1265.field8652 >> 7), true);
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class39.field299.method2575((byte) 98);
                    class39.field299.method2549(-37);
                    class284.field3721.method3422((byte) 120);
                    class450.field6233.method3241(36);
                    class463.method2698((byte) -24);
                    class543.method3175("Minimap reset", true);
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (class210.field2560.method1105()) {
                        int var16 = Integer.parseInt(arg2.substring(3));
                        if (var16 < 1) {
                            var16 = 1;
                        } else if (~var16 < -5) {
                            var16 = 4;
                        }
                        class230.field2854 = var16;
                        class210.field2560.method272(class230.field2854);
                        class210.field2560.method278(0);
                        class543.method3175("Render cores now: " + class230.field2854, true);
                        return;
                    }
                    class543.method3175("Current toolkit doesn't support multiple cores", true);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class543.method3175("I(s): " + class528.field7388.method3691((byte) -54) + "/" + class528.field7388.method3692((byte) 91), true);
                    class543.method3175("I(m): " + class307.field3899.method3691((byte) -54) + "/" + class307.field3899.method3692((byte) 114), true);
                    class543.method3175("O(s): " + class449.field6217.field4750.method3033((byte) -48) + "/" + class449.field6217.field4750.method3029(0), true);
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class543.method3175("Pos: " + class103.field1265.field8660 + "," + ((class286.field3729 >> 7) - -class632.field9113 >> 6) + "," + ((class39.field303 >> 7) + class119.field1504 >> 6) + "," + ((class286.field3729 >> 7) + class632.field9113 & 63) + "," + (63 & (class39.field303 >> 7) + class119.field1504) + " Height: " + (class426.method2400(-1, class39.field303, class286.field3729, class103.field1265.field8660) - class521.field7321), true);
                    class543.method3175("Look: " + class103.field1265.field8660 + "," + (class58.field543 - -class632.field9113 >> 6) + "," + (class306.field3891 + class119.field1504 >> 6) + "," + (63 & class632.field9113 + class58.field543) + "," + (class306.field3891 + class119.field1504 & 63) + " Height: " + (class426.method2400(arg0 + -2, class306.field3891, class58.field543, class103.field1265.field8660) + -class356.field4684), true);
                    return;
                }
                if (arg2.equals("showocc")) {
                    class398.field5249 = !class398.field5249;
                    class74.method422((byte) -53);
                    class543.method3175("showocc=" + class398.field5249, true);
                    return;
                }
                if (arg2.equals("wallocc")) {
                    class194.field2353 = !class194.field2353;
                    class74.method422((byte) -83);
                    class543.method3175("forcewallocc=" + class194.field2353, true);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class246.field3158 = !class246.field3158;
                    class210.field2560.method1185(class246.field3158);
                    class415.method2365(-29229);
                    class543.method3175("showprofiling=" + class246.field3158, true);
                    return;
                }
                if (arg2.startsWith("performancetest")) {
                    int var17 = -1;
                    int var18 = 1000;
                    if (arg2.length() > 15) {
                        String[] var19 = class220.method1267(arg2, ' ', (byte) -96);
                        try {
                            if (~var19.length < -2) {
                                var18 = Integer.parseInt(var19[1]);
                            }
                        } catch (Throwable var32) {
                        }
                        try {
                            if (~var19.length < -3) {
                                var17 = Integer.parseInt(var19[2]);
                            }
                        } catch (Throwable var31) {
                        }
                    }
                    if (var17 == -1) {
                        class543.method3175("Java toolkit: " + class552.method3233(0, var18, arg0 ^ 95), true);
                        class543.method3175("SSE toolkit:  " + class552.method3233(2, var18, 63), true);
                        class543.method3175("D3D toolkit:  " + class552.method3233(3, var18, arg0 + 108), true);
                        class543.method3175("GL toolkit:   " + class552.method3233(1, var18, 106), true);
                        return;
                    }
                    class543.method3175("Performance: " + class552.method3233(class529.field7429, var18, 60), true);
                    return;
                }
                if (arg2.equals("renderer")) {
                    class448 var20 = class210.field2560.method1172();
                    class543.method3175("Vendor: " + var20.field6214, true);
                    class543.method3175("Name: " + var20.field6206, true);
                    class543.method3175("Version: " + var20.field6205, true);
                    class543.method3175("Device: " + var20.field6207, true);
                    class543.method3175("Driver Version: " + var20.field6211, true);
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class58.field544 = !class58.field544;
                    class543.method3175("nonpcs=" + class58.field544, true);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class11.method55(3);
                    class543.method3175("auto world selected", true);
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg2.substring(12));
                    class289.method1626(class303.method1675((byte) 51, var21).field194, var21, 126);
                    class543.method3175("switched", true);
                    return;
                }
                if (arg2.equals("getworld")) {
                    class543.method3175("w: " + class237.field2960.field2715, true);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class418.method2378(17984, class5.field34);
                    class136.field1663.method2093(0, -105);
                    int var22 = class136.field1663.field4966;
                    int var23 = arg2.indexOf(" ", 4);
                    class136.field1663.method2106(arg0 ^ -103, arg2.substring(3, var23));
                    class168.method945(-1, arg2.substring(var23), class136.field1663);
                    class136.field1663.method2083((byte) 87, -var22 + class136.field1663.field4966);
                    return;
                }
                if (arg2.equals("heap")) {
                    class543.method3175("Heap: " + class252.field3258 + "MB", true);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    method2759((byte) -120);
                    class543.method3175("perm varcs saved", true);
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var24 = 0; class386.field5085.length > var24; ++var24) {
                        if (class118.field1486[var24]) {
                            class386.field5085[var24] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class386.field5085[var24] *= -1;
                            }
                        }
                    }
                    method2759((byte) -120);
                    class543.method3175("perm varcs scrambled", true);
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class360.field4735 = true;
                    class463.method2698((byte) -24);
                    class543.method3175("colmap is shown", true);
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class360.field4735 = false;
                    class463.method2698((byte) -24);
                    class543.method3175("colmap is hidden", true);
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class116.method686(-2);
                    class543.method3175("Caches reset", true);
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class543.method3175(class161.method884(1) + "ms", true);
                    return;
                }
                if (arg2.startsWith("cpuusage")) {
                    int var25 = Integer.parseInt(arg2.substring(9));
                    if (var25 >= 0 && ~var25 >= -5) {
                        class565.field8299.field2207 = var25;
                    }
                    class543.method3175("cpuusage=" + class565.field8299.field2207, true);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg2.substring(17));
                    class543.method3175("varpbit=" + class281.field3700.method1630(var26, 126), true);
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg2.substring(14));
                    class543.method3175("varp=" + class281.field3700.method1632(var27, false), true);
                    return;
                }
                if (arg2.startsWith("demologin")) {
                    class377.method2195(-107, false, 0);
                    return;
                }
                if (arg2.startsWith("newdemologin")) {
                    class377.method2195(arg0 ^ -111, true, 0);
                    return;
                }
                if (arg2.startsWith("directlogin")) {
                    String[] var28 = class220.method1267(arg2.substring(12), ' ', (byte) 127);
                    if (~var28.length <= -3) {
                        int var29 = ~var28.length >= -3 ? 0 : Integer.parseInt(var28[2]);
                        class470.method2739(var29, var28[0], (byte) 119, var28[1]);
                        return;
                    }
                }
                if (arg2.startsWith("csprofileclear")) {
                    class630.method3620();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class630.method3613(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class630.method3613(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg2.substring(8));
                    class210.field2560.method1163(var30);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class543.method3175("Active streams: " + class534.field7500.method807(), true);
                    return;
                }
                if (arg2.equals("autosetup")) {
                    class565.field8299.method3573(-5);
                    class543.method3175("Complete. Toolkit now: " + class529.field7429, true);
                    return;
                }
                if (arg2.equals("errormessage")) {
                    class543.method3175(class216.field2633.method1304((byte) -115), true);
                    return;
                }
                if (~class137.field1671 == -10) {
                    ++class523.field7336;
                    class418.method2378(17984, class189.field2267);
                    class136.field1663.method2093(arg2.length() - -3, -112);
                    class136.field1663.method2093(!arg3 ? 0 : 1, -118);
                    class136.field1663.method2093(arg1 ? 1 : 0, -124);
                    class136.field1663.method2106(-105, arg2);
                }
                if (arg2.startsWith("fps ") && class507.field7033 != class36.field282) {
                    class538.method3140(arg0 + 8, class232.method1325(arg2.substring(4), arg0 + -1));
                    return;
                }
                if (~class137.field1671 != -10) {
                    class543.method3175("Unrecogonised commmand when not logged in: " + arg2, true);
                }
            } catch (Exception var34) {
                class543.method3175("Whoops, something went wrong.", true);
            }
        }
        if (arg0 != 1) {
            field6653 = false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILhv;I)V", line = 909)
    public final void method446(int arg0, class440 arg1, int arg2) {
        super.field7319.method2459(arg2 + -26356, arg1);
        if (arg2 != 26440) {
            this.method452(54);
        }
        ++field6643;
        super.field7319.method2437(arg0, arg2 ^ -26443);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 922)
    public static final void method2758(String arg0, int arg1) {
        ++field6647;
        if (class533.field7498 != null) {
            ++class232.field2868;
            class418.method2378(17984, class466.field6520);
            class136.field1663.method2093(class88.method528((byte) -113, arg0), -101);
            class136.field1663.method2106(-84, arg0);
            if (arg1 > -28) {
                method2758((String) null, 89);
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BZ)V", line = 946)
    public final void method454(byte arg0, boolean arg1) {
        if (this.field6651 != null && arg1) {
            super.field7319.method2472(true, 1);
            super.field7319.method1826((byte) 64, class546.field8041);
            class335 var3 = super.field7319.method2479((byte) -14);
            var3.method659(1024);
            super.field7319.method2431((byte) -96, class288.field3743);
            if (!this.field6640) {
                super.field7319.method2429(class564.field8287, class2.field7, 101);
                super.field7319.method2435(0, 53, class99.field1226);
                super.field7319.method2472(true, 2);
                super.field7319.method2429(class2.field7, class402.field5281, arg0 ^ 67);
                super.field7319.method2435(0, arg0 ^ 121, class99.field1226);
                super.field7319.method1798(true, false, 1, 6, class99.field1226);
                super.field7319.method2465(class167.field2044, -14787, 0);
                super.field7319.method2459(arg0 ^ 126, super.field7319.field5794);
            } else {
                super.field7319.method2429(class2.field7, class402.field5281, 96);
                super.field7319.method1798(true, false, 0, 6, class289.field3751);
                super.field7319.method2465(class167.field2044, -14787, 0);
            }
            super.field7319.method2472(true, 0);
            this.field6645 = true;
        } else {
            super.field7319.method2465(class167.field2044, arg0 + -14808, 0);
        }
        ++field6641;
        if (arg0 != 21) {
            this.method448(true);
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 988)
    public static final void method2759(byte arg0) {
        ++field6649;
        class627 var1 = null;
        try {
            class506 var2 = class74.field873.method912("2", -4588, true);
            while (var2.field7031 == 0) {
                class462.method2688(1L, (byte) 110);
            }
            if (~var2.field7031 == -2) {
                var1 = (class627) var2.field7030;
                class374 var3 = new class374(class563.field8281 * 6 + 3);
                var3.method2093(1, -112);
                var3.method2115(class563.field8281, arg0 + 3444);
                for (int var4 = 0; var4 < class386.field5085.length; ++var4) {
                    if (class118.field1486[var4]) {
                        var3.method2115(var4, 3324);
                        var3.method2131(class386.field5085[var4], -1495157560);
                    }
                }
                var1.method3593(0, var3.field4929, var3.field4966, (byte) 97);
            }
            if (arg0 != -120) {
                method2758((String) null, 104);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method3596((byte) -95);
            }
        } catch (Exception var5) {
        }
        class634.field9125 = class190.method1030(false);
        class352.field4542 = false;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z", line = 1054)
    public final boolean method452(int arg0) {
        if (arg0 <= 49) {
            return true;
        } else {
            ++field6652;
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lbda;)V", line = 1151)
    public class474(class428 arg0) {
        super(arg0);
        if (arg0.field5754) {
            this.field6640 = arg0.field5768 < 3;
            int var2 = !this.field6640 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 == 1) {
                                var15 = var13;
                            } else if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 == -4) {
                                var15 = -var12;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field6651 = new class423[3];
            this.field6651[0] = super.field7319.method1789(true, 64, var4, false);
            this.field6651[1] = super.field7319.method1789(true, 64, var5, false);
            this.field6651[2] = super.field7319.method1789(true, 64, var3, false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 1068)
    public final void method448(boolean arg0) {
        if (arg0) {
            method2757(86, true, (String) null, true);
        }
        ++field6646;
        if (!this.field6645) {
            super.field7319.method2465(class289.field3751, -14787, 0);
        } else {
            super.field7319.method2472(true, 1);
            super.field7319.method2459(111, (class440) null);
            super.field7319.method1826((byte) 64, class476.field6697);
            super.field7319.method2447(true);
            if (!this.field6640) {
                super.field7319.method2429(class564.field8287, class564.field8287, 89);
                super.field7319.method2435(0, 87, class289.field3751);
                super.field7319.method2472(true, 2);
                super.field7319.method2429(class564.field8287, class564.field8287, 65);
                super.field7319.method2435(0, 85, class289.field3751);
                super.field7319.method2435(1, 106, class99.field1226);
                super.field7319.method2465(class289.field3751, -14787, 0);
                super.field7319.method2459(95, (class440) null);
            } else {
                super.field7319.method2429(class564.field8287, class564.field8287, 63);
                super.field7319.method2435(0, 104, class289.field3751);
                super.field7319.method2465(class289.field3751, -14787, 0);
            }
            super.field7319.method2472(!arg0, 0);
            this.field6645 = false;
        }
        super.field7319.method2429(class564.field8287, class564.field8287, 120);
    }

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "(I)V", line = 1110)
    public static void method2760(int arg0) {
        field6638 = null;
        int var1 = -88 % ((-64 - arg0) / 61);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BC)Z", line = 1120)
    public static final boolean method2761(byte arg0, char arg1) {
        ++field6642;
        if (arg0 != -17) {
            field6637 = 12;
        }
        return ~arg1 <= -49 && ~arg1 >= -58 || ~arg1 <= -66 && ~arg1 >= -91 || ~arg1 <= -98 && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V", line = 1133)
    public final void method455(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            if (this.field6645) {
                super.field7319.method2472(true, 1);
                super.field7319.method2459(arg0 + 87, this.field6651[arg1 + -1]);
                super.field7319.method2472(true, 0);
            }
            ++field6639;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V", line = 1263)
    public final void method449(int arg0, boolean arg1) {
        if (arg0 != 256) {
            field6638 = null;
        }
        ++field6650;
        super.field7319.method2429(class2.field7, class564.field8287, arg0 ^ 296);
    }
}
