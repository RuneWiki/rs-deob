import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class170 extends class85 {

    @OriginalMember(owner = "client!jk", name = "Rc", descriptor = "I")
    public int field2487 = -1;

    @OriginalMember(owner = "client!jk", name = "zc", descriptor = "I")
    public int field2469 = -1;

    @OriginalMember(owner = "client!jk", name = "Cc", descriptor = "Lcb;")
    public static class78 field2472 = new class78(512);

    @OriginalMember(owner = "client!jk", name = "Qc", descriptor = "[I")
    public static int[] field2486 = new int[8];

    @OriginalMember(owner = "client!jk", name = "Oc", descriptor = "Lnn;")
    public static class214 field2484 = new class214(14, 16);

    @OriginalMember(owner = "client!jk", name = "Vc", descriptor = "Z")
    public static boolean field2491 = false;

    @OriginalMember(owner = "client!jk", name = "wc", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!jk", name = "xc", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!jk", name = "yc", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!jk", name = "Ac", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!jk", name = "Bc", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!jk", name = "Dc", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!jk", name = "Ec", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!jk", name = "Fc", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!jk", name = "Gc", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!jk", name = "Hc", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!jk", name = "Ic", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!jk", name = "Jc", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!jk", name = "Kc", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!jk", name = "Lc", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!jk", name = "Mc", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!jk", name = "Nc", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!jk", name = "Pc", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!jk", name = "Sc", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!jk", name = "Tc", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!jk", name = "Uc", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!jk", name = "Xc", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!jk", name = "Wc", descriptor = "Lvq;")
    public class432 field2492;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)I", line = 6)
    public final int method784(byte arg0) {
        if (arg0 <= 54) {
            this.method784((byte) 120);
        }
        ++field2481;
        if (this.field2492.field6304 != null) {
            class432 var2 = this.field2492.method2582(0, class401.field6001);
            if (var2 != null && ~var2.field6303 != 0) {
                return var2.field6303;
            }
        }
        return this.field2492.field6303 != -1 ? this.field2492.field6303 : super.method784((byte) 68);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;ZZZ)V", line = 27)
    public static final void method1174(String arg0, boolean arg1, boolean arg2, boolean arg3) {
        ++field2489;
        if (arg1) {
            field2491 = true;
        }
        if (class563.field8065 != class47.field657 || ~class602.field8571 <= -3) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class201.field2844 = true;
                    class595.method3397((byte) 112, "fps debug enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class201.field2844 = false;
                    class595.method3397((byte) 114, "fps debug disabled");
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class595.method3397((byte) 108, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var31) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class637.field9254 = 0;
                    class308.field4466 = 0;
                    return;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class519.field7205.method951(-8790);
                    class595.method3397((byte) 126, "Text coords cleared");
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class77.method730((byte) -117);
                    for (int var4 = 0; ~var4 > -11; ++var4) {
                        System.gc();
                    }
                    Runtime var5 = Runtime.getRuntime();
                    int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                    class595.method3397((byte) 122, "mem=" + var6 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class77.method730((byte) -119);
                    for (int var7 = 0; ~var7 > -11; ++var7) {
                        System.gc();
                    }
                    Runtime var8 = Runtime.getRuntime();
                    int var9 = (int) ((var8.totalMemory() + -var8.freeMemory()) / 1024L);
                    class595.method3397((byte) 108, "Memory before cleanup=" + var9 + "k");
                    class458.method2684(-91);
                    class77.method730((byte) -127);
                    for (int var10 = 0; ~var10 > -11; ++var10) {
                        System.gc();
                    }
                    int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class595.method3397((byte) 116, "Memory after cleanup=" + var11 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class595.method3397((byte) 119, !class641.method3694(0) ? "Library unloading failed!" : "Libraries unloaded");
                    return;
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class595.method3397((byte) 120, "Number of player models in cache:" + class106.method893((byte) 46));
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class595.method3397((byte) 122, "Dropped client connection");
                    if (class64.field893 != 9) {
                        if (~class64.field893 == -11) {
                            class554.field7835 = true;
                            return;
                        }
                    } else {
                        class587.method3365(100);
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class384.field5712.method899(-101);
                    class595.method3397((byte) 123, "Dropped client js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class384.field5712.method906(91);
                    class595.method3397((byte) 121, "Dropped server js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class270.field3976.method345(-16733);
                    client.field8770.method2737(78);
                    class384.field5712.method904((byte) 96);
                    class595.method3397((byte) 122, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class540.method3036(3273);
                    class429.method2555((byte) -44);
                    class595.method3397((byte) 119, "Rebuilding map");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class5.method14(-1, -61, -1, false, 1);
                    if (~class512.method2868(2) == -2) {
                        class595.method3397((byte) 120, "wm1 succeeded");
                        return;
                    }
                    class595.method3397((byte) 110, "wm1 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class5.method14(-1, -119, -1, false, 2);
                    if (~class512.method2868(2) != -3) {
                        class595.method3397((byte) 122, "wm2 failed");
                        return;
                    }
                    class595.method3397((byte) 114, "wm2 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class5.method14(1024, -90, 768, false, 3);
                    if (~class512.method2868(2) != -4) {
                        class595.method3397((byte) 126, "wm3 failed");
                        return;
                    }
                    class595.method3397((byte) 122, "wm3 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class471.method2738(127, 0);
                    if (class646.field9388 != 0) {
                        class595.method3397((byte) 111, "Failed to enter tk0");
                        return;
                    }
                    class595.method3397((byte) 116, "Entered tk0");
                    class202.field2854.field7918 = 0;
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    class434.field6378 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class471.method2738(127, 1);
                    if (class646.field9388 != 1) {
                        class595.method3397((byte) 110, "Failed to enter tk1");
                        return;
                    }
                    class595.method3397((byte) 110, "Entered tk1");
                    class202.field2854.field7918 = 1;
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    class434.field6378 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class471.method2738(127, 2);
                    if (~class646.field9388 == -3) {
                        class595.method3397((byte) 114, "Entered tk2");
                        class202.field2854.field7918 = 2;
                        class202.field2854.method2642((byte) -120, class270.field3976);
                        class434.field6378 = false;
                        return;
                    }
                    class595.method3397((byte) 122, "Failed to enter tk2");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class471.method2738(127, 3);
                    if (~class646.field9388 != -4) {
                        class595.method3397((byte) 123, "Failed to enter tk3");
                        return;
                    }
                    class595.method3397((byte) 118, "Entered tk3");
                    class202.field2854.field7918 = 3;
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    class434.field6378 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk4")) {
                    class471.method2738(127, 4);
                    if (~class646.field9388 == -5) {
                        class595.method3397((byte) 110, "Entered tk4");
                        class202.field2854.field7918 = 4;
                        class202.field2854.method2642((byte) -120, class270.field3976);
                        class434.field6378 = false;
                        return;
                    }
                    class595.method3397((byte) 111, "Failed to enter tk4");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class471.method2738(127, 5);
                    if (~class646.field9388 == -6) {
                        class595.method3397((byte) 117, "Entered tk5");
                        class202.field2854.field7918 = 5;
                        class202.field2854.method2642((byte) -120, class270.field3976);
                        class434.field6378 = false;
                        return;
                    }
                    class595.method3397((byte) 120, "Failed to enter tk5");
                    return;
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class202.field2854.field7891 = !class202.field2854.field7891;
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    class434.field6378 = false;
                    class540.method3036(3273);
                    class595.method3397((byte) 119, "ot=" + class202.field2854.field7891);
                    return;
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class202.field2854.field7895 = !class202.field2854.field7895;
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    class434.field6378 = false;
                    class540.method3036(3273);
                    class595.method3397((byte) 122, "gb=" + class202.field2854.field7895);
                    return;
                }
                if (arg0.startsWith("shadows")) {
                    if (~arg0.length() > -9) {
                        class595.method3397((byte) 123, "Invalid shadows value");
                        return;
                    }
                    String var12 = arg0.substring(8);
                    int var13 = class331.method2052(var12, false) ? class302.method1889(var12, false) : -1;
                    if (~var13 <= -1 && ~var13 >= -3) {
                        class202.field2854.method3139(0, class646.field9388, var13);
                        class202.field2854.method2642((byte) -120, class270.field3976);
                        class434.field6378 = false;
                        class540.method3036(3273);
                        class595.method3397((byte) 117, "shadows=" + var13);
                        return;
                    }
                    class595.method3397((byte) 127, "Invalid shadows value");
                    return;
                }
                if (arg0.startsWith("textures")) {
                    class202.field2854.field7893 = !class202.field2854.field7893;
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    class434.field6378 = false;
                    class229.method1508(0);
                    class540.method3036(3273);
                    class595.method3397((byte) 113, "textures=" + class202.field2854.field7893);
                    return;
                }
                if (arg0.startsWith("lighting")) {
                    class202.field2854.method3138(!class202.field2854.method3140(class646.field9388, 2), (byte) -78, class646.field9388);
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    class434.field6378 = false;
                    class150.method1077(-113);
                    class229.method1508(0);
                    class540.method3036(3273);
                    class595.method3397((byte) 115, "lighting=" + class202.field2854.method3140(class646.field9388, 2));
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class595.method3397((byte) 121, "Invalid buildarea value");
                        return;
                    }
                    int var14 = class302.method1889(arg0.substring(6), false);
                    if (~var14 <= -1 && ~var14 >= ~class13.method73(class555.field7861, (byte) -83)) {
                        class202.field2854.field7885 = var14;
                        class202.field2854.method2642((byte) -120, class270.field3976);
                        class434.field6378 = false;
                        class595.method3397((byte) 119, "maxbuildarea=" + class202.field2854.field7885);
                        return;
                    }
                    class595.method3397((byte) 126, "Invalid buildarea value");
                    return;
                }
                if (arg0.startsWith("setparticles")) {
                    if (arg0.length() < 13) {
                        class595.method3397((byte) 124, "Invalid particles value");
                        return;
                    }
                    class617.method3495(950562888, class302.method1889(arg0.substring(13), false));
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    class434.field6378 = false;
                    class595.method3397((byte) 117, "particles=" + class111.method924(-114));
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (~arg0.length() > -11) {
                        class595.method3397((byte) 109, "Invalid rect_debug value");
                        return;
                    }
                    class525.field7288 = class302.method1889(arg0.substring(10).trim(), false);
                    class595.method3397((byte) 126, "rect_debug=" + class525.field7288);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class640.field9285 = true;
                    class595.method3397((byte) 110, "qa_op_test=" + class640.field9285);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class488.field6875 = !class488.field6875;
                    class595.method3397((byte) 116, "clipcomponents=" + class488.field6875);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var15 = class159.field2378.method157();
                    if (class538.method3026(!var15, (byte) -49)) {
                        if (var15) {
                            class595.method3397((byte) 121, "Bloom disabled");
                            return;
                        }
                        class595.method3397((byte) 112, "Bloom enabled");
                        return;
                    }
                    class595.method3397((byte) 122, "Failed to enable bloom");
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class429.field6257) {
                        class429.field6257 = true;
                        class595.method3397((byte) 119, "Forced tweening ENABLED!");
                        return;
                    }
                    class429.field6257 = false;
                    class595.method3397((byte) 122, "Forced tweening disabled.");
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (!class99.field1724) {
                        class595.method3397((byte) 116, "Shift-click ENABLED!");
                        class99.field1724 = true;
                        return;
                    }
                    class595.method3397((byte) 119, "Shift-click disabled.");
                    class99.field1724 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class595.method3397((byte) 125, "x:" + (class644.field9367.field5108 >> 7) + " z:" + (class644.field9367.field5109 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class595.method3397((byte) 119, "Height: " + class88.field1594[class644.field9367.field5116].method694(class644.field9367.field5108 >> 7, class644.field9367.field5109 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class325.field4675.method3196(-21182);
                    class325.field4675.method3165(!arg1);
                    class484.field6855.method2553(64);
                    class249.field3634.method69(false);
                    class429.method2555((byte) 122);
                    class595.method3397((byte) 119, "Minimap reset");
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (class159.field2378.method650()) {
                        int var16 = Integer.parseInt(arg0.substring(3));
                        if (var16 >= 1) {
                            if (var16 > 4) {
                                var16 = 4;
                            }
                        } else {
                            var16 = 1;
                        }
                        class552.field7816 = var16;
                        class159.field2378.method403(class552.field7816);
                        class159.field2378.method398(0);
                        class595.method3397((byte) 123, "Render cores now: " + class552.field7816);
                        return;
                    }
                    class595.method3397((byte) 112, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class595.method3397((byte) 111, "I(s): " + class310.field4550.method2400(-116) + "/" + class310.field4550.method2396(55));
                    class595.method3397((byte) 110, "I(m): " + class258.field3753.method2400(-111) + "/" + class258.field3753.method2396(55));
                    class595.method3397((byte) 124, "O(s): " + class611.field8684.field3739.method2197(-95) + "/" + class611.field8684.field3739.method2202(2));
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class595.method3397((byte) 121, "Pos: " + class644.field9367.field5116 + "," + ((class545.field7584 >> 7) + class382.field5687 >> 6) + "," + ((class216.field3274 >> 7) - -class597.field8500 >> 6) + "," + ((class545.field7584 >> 7) + class382.field5687 & 63) + "," + (63 & (class216.field3274 >> 7) + class597.field8500) + " Height: " + (class355.method2160(class545.field7584, class216.field3274, class644.field9367.field5116, (byte) 103) - class448.field6535));
                    class595.method3397((byte) 119, "Look: " + class644.field9367.field5116 + "," + (class382.field5687 + class127.field2089 >> 6) + "," + (class424.field6204 - -class597.field8500 >> 6) + "," + (63 & class382.field5687 + class127.field2089) + "," + (class597.field8500 + class424.field6204 & 63) + " Height: " + (class355.method2160(class127.field2089, class424.field6204, class644.field9367.field5116, (byte) 103) + -class270.field3979));
                    return;
                }
                if (arg0.equals("showocc")) {
                    class527.field7333 = !class527.field7333;
                    class540.method3036(3273);
                    class595.method3397((byte) 108, "showocc=" + class527.field7333);
                    return;
                }
                if (arg0.equals("wallocc")) {
                    class639.field9272 = !class639.field9272;
                    class540.method3036(3273);
                    class595.method3397((byte) 113, "forcewallocc=" + class639.field9272);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class44.field614 = !class44.field614;
                    class159.field2378.method131(class44.field614);
                    class294.method1851((byte) -13);
                    class595.method3397((byte) 116, "showprofiling=" + class44.field614);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var17 = -1;
                    int var18 = 1000;
                    if (~arg0.length() < -16) {
                        String[] var19 = class580.method3325((byte) 118, ' ', arg0);
                        try {
                            if (var19.length > 1) {
                                var18 = Integer.parseInt(var19[1]);
                            }
                        } catch (Throwable var33) {
                        }
                        try {
                            if (var19.length > 2) {
                                var17 = Integer.parseInt(var19[2]);
                            }
                        } catch (Throwable var32) {
                        }
                    }
                    if (~var17 == 0) {
                        class595.method3397((byte) 116, "Java toolkit: " + class468.method2719(0, var18, (byte) -27));
                        class595.method3397((byte) 110, "SSE toolkit:  " + class468.method2719(2, var18, (byte) 121));
                        class595.method3397((byte) 126, "D3D toolkit:  " + class468.method2719(3, var18, (byte) 123));
                        class595.method3397((byte) 125, "GL toolkit:   " + class468.method2719(1, var18, (byte) 21));
                        return;
                    }
                    class595.method3397((byte) 108, "Performance: " + class468.method2719(class646.field9388, var18, (byte) 118));
                    return;
                }
                if (arg0.equals("renderer")) {
                    class425 var20 = class159.field2378.method85();
                    class595.method3397((byte) 118, "Vendor: " + var20.field6209);
                    class595.method3397((byte) 119, "Name: " + var20.field6214);
                    class595.method3397((byte) 127, "Version: " + var20.field6210);
                    class595.method3397((byte) 109, "Device: " + var20.field6211);
                    class595.method3397((byte) 113, "Driver Version: " + var20.field6215);
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class595.field8466 = !class595.field8466;
                    class595.method3397((byte) 109, "nonpcs=" + class595.field8466);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class251.method1588(-21618);
                    class595.method3397((byte) 120, "auto world selected");
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg0.substring(12));
                    class177.method1207(40000, class290.method1836((byte) 35, var21).field3366, var21);
                    class595.method3397((byte) 116, "switched");
                    return;
                }
                if (arg0.equals("getworld")) {
                    class595.method3397((byte) 124, "w: " + class352.field5017.field3409);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class624.method3537(-122, class136.field2173);
                    class127.field2088.method1710(0, 93);
                    int var22 = class127.field2088.field3913;
                    int var23 = arg0.indexOf(" ", 4);
                    class127.field2088.method1726((byte) -52, arg0.substring(3, var23));
                    class177.method1209(0, class127.field2088, arg0.substring(var23));
                    class127.field2088.method1688(-var22 + class127.field2088.field3913, -62);
                    return;
                }
                if (arg0.equals("heap")) {
                    class595.method3397((byte) 114, "Heap: " + class555.field7861 + "MB");
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class433.method2583(6428);
                    class595.method3397((byte) 123, "perm varcs saved");
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var24 = 0; ~var24 > ~class310.field4551.length; ++var24) {
                        if (class459.field6618[var24]) {
                            class310.field4551[var24] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class310.field4551[var24] *= -1;
                            }
                        }
                    }
                    class433.method2583(6428);
                    class595.method3397((byte) 111, "perm varcs scrambled");
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class325.field4674 = true;
                    class429.method2555((byte) 109);
                    class595.method3397((byte) 112, "colmap is shown");
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class325.field4674 = false;
                    class429.method2555((byte) 104);
                    class595.method3397((byte) 113, "colmap is hidden");
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class414.method2504(116);
                    class595.method3397((byte) 122, "Caches reset");
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class595.method3397((byte) 120, class145.method1064(124) + "ms");
                    return;
                }
                if (arg0.startsWith("cpuusage")) {
                    int var25 = Integer.parseInt(arg0.substring(9));
                    if (var25 >= 0 && var25 <= 4) {
                        class202.field2854.field7883 = var25;
                    }
                    class595.method3397((byte) 126, "cpuusage=" + class202.field2854.field7883);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg0.substring(17));
                    class595.method3397((byte) 114, "varpbit=" + class401.field6001.method910(-118, var26));
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg0.substring(14));
                    class595.method3397((byte) 108, "varp=" + class401.field6001.method909(var27, (byte) 67));
                    return;
                }
                if (arg0.startsWith("demologin")) {
                    class323.method2008(3, 0, false);
                    return;
                }
                if (arg0.startsWith("newdemologin")) {
                    class323.method2008(3, 0, true);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var28 = class580.method3325((byte) 118, ' ', arg0.substring(12));
                    if (~var28.length <= -3) {
                        int var29 = ~var28.length >= -3 ? 0 : Integer.parseInt(var28[2]);
                        class73.method710(var28[0], var29, var28[1], -31566);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class30.method274();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class30.method285(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class30.method285(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg0.substring(8));
                    class159.field2378.method521(var30);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class595.method3397((byte) 126, "Active streams: " + class35.field485.method46());
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class202.field2854.method2644(true);
                    class595.method3397((byte) 121, "Complete. Toolkit now: " + class646.field9388);
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class595.method3397((byte) 116, class454.field6574.method3421((byte) 36));
                    return;
                }
                if (class64.field893 == 9) {
                    class624.method3537(-116, class139.field2194);
                    ++class254.field3700;
                    class127.field2088.method1710(arg0.length() + 3, 90);
                    class127.field2088.method1710(arg3 ? 1 : 0, 79);
                    class127.field2088.method1710(arg2 ? 1 : 0, 114);
                    class127.field2088.method1726((byte) -52, arg0);
                }
                if (arg0.startsWith("fps ") && class563.field8065 != class47.field657) {
                    class642.method3698(false, class302.method1889(arg0.substring(4), arg1));
                    return;
                }
                if (~class64.field893 != -10) {
                    class595.method3397((byte) 114, "Unrecogonised commmand when not logged in: " + arg0);
                    return;
                }
            } catch (Exception var34) {
                class595.method3397((byte) 109, "Whoops, something went wrong.");
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Z)I", line = 929)
    public final int method1175(boolean arg0) {
        if (arg0) {
            this.method1180((byte) 103, 20, -30);
        }
        ++field2473;
        return super.field1544;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(Z)I", line = 940)
    public final int method780(boolean arg0) {
        ++field2470;
        if (!arg0) {
            this.field2492 = null;
        }
        if (this.field2492.field6304 != null) {
            class432 var2 = this.field2492.method2582(0, class401.field6001);
            if (var2 != null && var2.field6336 != -1) {
                return var2.field6336;
            }
        }
        return this.field2492.field6336;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLqa;II)Z", line = 960)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        ++field2476;
        if (this.field2492 != null && this.method1178(true, arg1, 131072)) {
            class105 var5 = arg1.method637();
            int var6 = super.field1557.method870(arg0 ^ 16354);
            var5.method875(var6);
            var5.method877(super.field5108, super.field5111, super.field5109);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field1569.length; ++var8) {
                if (super.field1569[var8] != null && super.field1569[var8].method1399(arg2, arg3, var5, ~this.field2492.field6337 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field1569[0] = super.field1569[1] = super.field1569[2] = super.field1569[3] = null;
            return arg0 != 29 ? true : var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lqa;B)V", line = 998)
    public final void method266(class167 arg0, byte arg1) {
        if (arg1 == -40) {
            ++field2466;
            if (this.field2492 != null) {
                if (super.field1577 || this.method1178(true, arg0, 0)) {
                    this.method775(0, super.field1577, arg0, super.field1569);
                    super.field1569[0] = super.field1569[1] = super.field1569[2] = super.field1569[3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lbda;I)V", line = 1022)
    public static final void method1176(class400 arg0, int arg1) {
        ++field2478;
        class154 var2 = (class154) class424.field6207.method740(0, (long) arg0.field1555);
        if (var2 != null) {
            if (var2.field2312 != null) {
                class35.field485.method44(var2.field2312);
                var2.field2312 = null;
            }
            var2.method911(-52);
        }
        if (arg1 != 3) {
            field2486 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lvq;B)V", line = 1056)
    public final void method1177(class432 arg0, byte arg1) {
        ++field2488;
        if (arg1 == 118) {
            this.field2492 = arg0;
            if (super.field1570 != null) {
                super.field1570.method3354();
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLqa;I)Z", line = 1074)
    private final boolean method1178(boolean arg0, class167 arg1, int arg2) {
        ++field2483;
        int var4 = arg2;
        class298 var5 = this.method772(0);
        class439 var6 = ~super.field1514 != 0 && super.field1519 == 0 ? class49.field739.method2297((byte) 112, super.field1514) : null;
        class439 var7 = ~super.field1531 == 0 || super.field1489 && var6 != null ? null : class49.field739.method2297((byte) 125, super.field1531);
        int var8 = var5.field4292;
        int var9 = var5.field4315;
        if (~var8 != -1 || var9 != 0 || var5.field4277 != 0 || ~var5.field4299 != -1) {
            arg2 |= 7;
        }
        boolean var10 = super.field1485 != 0 && ~class310.field4553 <= ~super.field1515 && class310.field4553 < super.field1523;
        if (var10) {
            arg2 |= 524288;
        }
        class519 var11 = super.field1569[0] = this.field2492.method2574(class469.field6760, super.field1504, super.field1511, super.field1537, (byte) -26, arg2, var6, class49.field739, var7, class401.field6001, super.field1471, arg1, super.field1477, super.field1505, super.field1506);
        if (var11 == null) {
            return false;
        } else {
            super.field1544 = var11.method1390();
            this.method783(var11, 0);
            int var12 = super.field1557.method870(16383);
            if (~var8 == -1 && var9 == 0) {
                this.method789(var12, this.method781((byte) 106) << 7, 0, 0, this.method781((byte) 115) << 7, 0);
            } else {
                this.method789(var12, var8, var5.field4312, var5.field4288, var9, 0);
                if (super.field1486 != 0) {
                    super.field1569[0].method1383(super.field1486);
                }
                if (~super.field1473 != -1) {
                    super.field1569[0].method1400(super.field1473);
                }
                if (super.field1559 != 0) {
                    super.field1569[0].method1368(0, super.field1559, 0);
                }
            }
            if (var10) {
                var11.method1381(super.field1540, super.field1521, super.field1479, super.field1485 & 255);
            }
            if (!arg0) {
                return false;
            } else {
                if (super.field1487 != -1 && super.field1553 != -1) {
                    class347 var13 = class522.field7247.method2489(30, super.field1487);
                    boolean var14 = var13.field4971 == 3 && (var8 != 0 || var9 != 0);
                    int var15 = var4;
                    if (!var14) {
                        if (~super.field1503 != -1) {
                            var15 = var4 | 5;
                        }
                        if (super.field1500 != 0) {
                            var15 |= 2;
                        }
                    } else {
                        var15 = var4 | 7;
                    }
                    class519 var16 = super.field1569[1] = var13.method2099(var15, super.field1533, super.field1553, super.field1494, arg1, 0, class49.field739);
                    if (var16 != null) {
                        if (super.field1500 != 0) {
                            var16.method1368(0, -super.field1500 << 0, 0);
                        }
                        if (~super.field1503 != -1) {
                            var16.method1367(super.field1503 * 2048);
                        }
                        if (var14) {
                            if (~super.field1486 != -1) {
                                var16.method1383(super.field1486);
                            }
                            if (super.field1473 != 0) {
                                var16.method1400(super.field1473);
                            }
                            if (~super.field1559 != -1) {
                                var16.method1368(0, super.field1559, 0);
                            }
                        }
                    }
                } else {
                    super.field1569[1] = null;
                }
                if (super.field1520 != -1 && super.field1535 != -1) {
                    class347 var17 = class522.field7247.method2489(30, super.field1520);
                    boolean var18 = var17.field4971 == 3 && (var8 != 0 || var9 != 0);
                    int var19 = var4;
                    if (var18) {
                        var19 = var4 | 7;
                    } else {
                        if (super.field1534 != 0) {
                            var19 = var4 | 5;
                        }
                        if (~super.field1508 != -1) {
                            var19 |= 2;
                        }
                    }
                    class519 var20 = super.field1569[3] = var17.method2105(arg1, super.field1535, class49.field739, var19, super.field1561, super.field1513, (byte) -125);
                    if (var20 != null) {
                        if (super.field1508 != 0) {
                            var20.method1368(0, -super.field1508 << 0, 0);
                        }
                        if (~super.field1534 != -1) {
                            var20.method1367(super.field1534 * 2048);
                        }
                        if (var18) {
                            if (~super.field1486 != -1) {
                                var20.method1383(super.field1486);
                            }
                            if (~super.field1473 != -1) {
                                var20.method1400(super.field1473);
                            }
                            if (super.field1559 != 0) {
                                var20.method1368(0, super.field1559, 0);
                            }
                        }
                    }
                } else {
                    super.field1569[3] = null;
                }
                super.field1569[2] = null;
                if (super.field1573 != null) {
                    if (~super.field1573.field7473 >= ~class310.field4553) {
                        super.field1573 = null;
                    } else if (super.field1573.field7477 <= class310.field4553) {
                        class519 var21 = super.field1573.method3021(arg0, arg1, var4 | 7);
                        if (var21 != null) {
                            var21.method1368(-super.field5108 + super.field1573.field7476, super.field1573.field7478 - super.field5111, -super.field5109 + super.field1573.field7482);
                            if (~var12 != -1) {
                                var21.method1367(var12);
                            }
                            super.field1569[2] = var21;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(ILqa;)Lkm;", line = 1278)
    public final class120 method260(int arg0, class167 arg1) {
        if (arg0 >= -50) {
            this.method778(24);
        }
        ++field2485;
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BZILqa;IILcea;)V", line = 1289)
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        ++field2477;
        if (arg0 == -84) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(B)V", line = 1302)
    public static void method1179(byte arg0) {
        field2486 = null;
        field2484 = null;
        if (arg0 != -19) {
            field2472 = null;
        }
        field2472 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V", line = 1314)
    public final void method1180(byte arg0, int arg1, int arg2) {
        ++field2493;
        int var4 = super.field1571[0];
        int var5 = super.field1572[0];
        if (arg0 == -63) {
            if (~arg2 == -1) {
                ++var5;
            }
            if (arg2 == 1) {
                ++var5;
                ++var4;
            }
            if (~arg2 == -3) {
                ++var4;
            }
            if (~arg2 == -4) {
                --var5;
                ++var4;
            }
            if (~arg2 == -5) {
                --var5;
            }
            if (~arg2 == -6) {
                --var5;
                --var4;
            }
            if (~arg2 == -7) {
                --var4;
            }
            if (~arg2 == -8) {
                ++var5;
                --var4;
            }
            if (super.field1514 != -1 && class49.field739.method2297((byte) 109, super.field1514).field6407 == 1) {
                super.field1514 = -1;
            }
            if (~super.field1487 != 0) {
                class347 var6 = class522.field7247.method2489(arg0 ^ -33, super.field1487);
                if (var6.field4975 && var6.field4961 != -1 && class49.field739.method2297((byte) 120, var6.field4961).field6407 == 1) {
                    super.field1487 = -1;
                }
            }
            if (super.field1520 != -1) {
                class347 var7 = class522.field7247.method2489(30, super.field1520);
                if (var7.field4975 && var7.field4961 != -1 && ~class49.field739.method2297((byte) 118, var7.field4961).field6407 == -2) {
                    super.field1520 = -1;
                }
            }
            if (~super.field1567 > -10) {
                ++super.field1567;
            }
            for (int var8 = super.field1567; ~var8 < -1; --var8) {
                super.field1571[var8] = super.field1571[var8 - 1];
                super.field1572[var8] = super.field1572[var8 - 1];
                super.field1574[var8] = super.field1574[var8 - 1];
            }
            super.field1571[0] = var4;
            super.field1572[0] = var5;
            super.field1574[0] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(B)Z", line = 1408)
    private final boolean method1181(byte arg0) {
        ++field2471;
        return arg0 >= -38 ? false : this.field2492.field6357;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIIIII)V", line = 1419)
    public final void method1182(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2468;
        super.field5116 = (byte) arg1;
        if (~super.field1514 != 0 && ~class49.field739.method2297((byte) 109, super.field1514).field6407 == -2) {
            super.field1514 = -1;
        }
        if (~super.field1487 != 0) {
            class347 var7 = class522.field7247.method2489(arg5 ^ -31, super.field1487);
            if (var7.field4975 && var7.field4961 != -1 && class49.field739.method2297((byte) 125, var7.field4961).field6407 == 1) {
                super.field1487 = -1;
            }
        }
        if (super.field1520 != arg5) {
            class347 var8 = class522.field7247.method2489(30, super.field1520);
            if (var8.field4975 && ~var8.field4961 != 0 && class49.field739.method2297((byte) 115, var8.field4961).field6407 == 1) {
                super.field1520 = -1;
            }
        }
        if (!arg0) {
            int var9 = -super.field1571[0] + arg2;
            int var10 = -super.field1572[0] + arg3;
            if (~var9 <= 7 && ~var9 >= -9 && var10 >= -8 && ~var10 >= -9) {
                if (super.field1567 < 9) {
                    ++super.field1567;
                }
                for (int var11 = super.field1567; ~var11 < -1; --var11) {
                    super.field1571[var11] = super.field1571[var11 + -1];
                    super.field1572[var11] = super.field1572[var11 + -1];
                    super.field1574[var11] = super.field1574[var11 + -1];
                }
                super.field1571[0] = arg2;
                super.field1572[0] = arg3;
                super.field1574[0] = 1;
                return;
            }
        }
        super.field1567 = 0;
        super.field1571[0] = arg2;
        super.field1575 = 0;
        super.field1576 = 0;
        super.field1572[0] = arg3;
        super.field5108 = (super.field1571[0] << 7) - -(arg4 << 6);
        super.field5109 = (super.field1572[0] << 7) + (arg4 << 6);
        if (super.field1570 != null) {
            super.field1570.method3354();
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)I", line = 1495)
    public final int method778(int arg0) {
        if (arg0 > -29) {
            field2472 = null;
        }
        ++field2467;
        if (this.field2492.field6304 != null) {
            class432 var2 = this.field2492.method2582(0, class401.field6001);
            if (var2 != null && ~var2.field6344 != 0) {
                return var2.field6344;
            }
        }
        return this.field2492.field6344;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(IIBII)V", line = 1517)
    public static final void method1183(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field2479;
        if (~arg3 <= ~arg0) {
            for (int var5 = arg0; var5 < arg3; ++var5) {
                class495.field6944[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg3; ~arg0 < ~var6; ++var6) {
                class495.field6944[var6][arg1] = arg4;
            }
        }
        int var7 = 14 % ((arg2 - -68) / 42);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lqa;I)Lbi;", line = 1555)
    public final class465 method267(class167 arg0, int arg1) {
        ++field2475;
        if (this.field2492 != null && this.method1178(true, arg0, 2048)) {
            class105 var3 = arg0.method637();
            int var4 = super.field1557.method870(16383);
            var3.method875(var4);
            var3.method877(super.field5108, super.field5111, super.field5109);
            class298 var5 = this.method772(0);
            class432 var6 = this.field2492.field6304 != null ? this.field2492.method2582(0, class401.field6001) : this.field2492;
            if (class202.field2854.field7922 && var6.field6313 && var5.field4322) {
                class439 var7 = ~super.field1514 != 0 && super.field1519 == 0 ? class49.field739.method2297((byte) 107, super.field1514) : null;
                class439 var8 = super.field1531 == -1 || super.field1489 && var7 != null ? null : class49.field739.method2297((byte) 118, super.field1531);
                int var9 = 0;
                if (~super.field1546 != -1) {
                    var9 = this.method779(-1);
                }
                class519 var10 = class350.method2130(var9, var8 == null ? var7 : var8, var4, super.field1473, super.field1559, this.field2492.field6294 & 255, this.field2492.field6359 & 65535, super.field1486, this.field2492.field6337, true, 255 & this.field2492.field6354, var8 != null ? super.field1477 : super.field1511, 65535 & this.field2492.field6352, arg0, super.field1569[0]);
                if (var10 != null) {
                    float var11 = arg0.method542();
                    float var12 = arg0.method613();
                    arg0.method621(false);
                    arg0.method517(var11, var12 - 150.0F);
                    var10.method1379(var3, (class315) null, 0);
                    arg0.method517(var11, var12);
                    arg0.method621(true);
                }
            }
            class465 var13 = null;
            if (this.method1181((byte) -43)) {
                var13 = class603.method3437((byte) -22, super.field1569.length);
            }
            if (super.field1570 == null) {
                arg0.method406(super.field1569, var3, var13 != null ? var13.field6707 : null, 0);
            } else {
                class616 var14 = super.field1570.method3350();
                arg0.method397(super.field1569, var14, var3, var13 != null ? var13.field6707 : null, 0);
            }
            this.method775(0, false, arg0, super.field1569);
            super.field1569[0] = super.field1569[1] = super.field1569[arg1] = super.field1569[3] = null;
            super.field1502 = class79.field1432;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V", line = 1626)
    public final void method867(int arg0) {
        ++field2490;
        if (arg0 < 12) {
            this.method1177((class432) null, (byte) -6);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)Z", line = 1650)
    public final boolean method868(boolean arg0) {
        if (arg0) {
            this.field2492 = null;
        }
        ++field2474;
        return false;
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)Z", line = 1664)
    public final boolean method1184(int arg0) {
        ++field2480;
        if (this.field2492 == null) {
            return false;
        } else {
            if (arg0 > -115) {
                this.method1181((byte) 91);
            }
            return true;
        }
    }
}
